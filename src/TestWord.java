//  https://github.com/ysc/word 官方网址
// https://blog.csdn.net/qq_40374604/article/details/83418856  使用方法

import org.apdplat.word.WordSegmenter;
import org.apdplat.word.analysis.Similarity;
import org.apdplat.word.analysis.SimpleTextSimilarity;
import org.apdplat.word.analysis.TextSimilarity;
import org.apdplat.word.segmentation.SegmentationAlgorithm;
import org.apdplat.word.segmentation.Word;
import org.apdplat.word.segmentation.WordRefiner;
import org.apdplat.word.analysis.CosineTextSimilarity;
import org.apdplat.word.analysis.EditDistanceTextSimilarity;
import java.util.List;

public class TestWord {
    public static void main(String[] args) throws Exception {
        segmenter();
    }
    public static void segmenter() {
        String text1 = "熟练掌握struts,spring,hibernate(ssh)开源框架的应用及J2EE的开发\n" +
                "熟悉运用jsp,javascript,AJAX等页面技术\n" +
                "熟悉EJB技术等主流前台开发框架\n" +
                "熟悉Tomcat,WebLogic,Jboss等服务器的配置及使用.\n" +
                "熟悉Oracle,MySql,DB2等数据库\n" +
                "熟悉Xml(Dom4j,JDom,Dom,Sax等解析XML)\n" +
                "熟悉工作流引擎JBpm\n" +
                "熟悉CSS,HTML和报表JfreeChart.\n" +
                "熟悉php程序设计，熟练使用php与xml、webservice的相关技术、常用函数及常用优化方法";
        String text2 = "1、计算机相关专业大专以上学历，2年左右javaweb开发经验；\n" +
                "2、能熟练应用Struts,Spring,Hibernate,Springmvc,Ibatis等常用框架；\n" +
                "3、对ext、jquery精通； \n" +
                "4、熟练掌握ORACLE，SQLSERVER，MYSQL等数据库开发；\n" +
                "6、具有良好的学习及沟通能力，具有团队合作精神，能够独立完成任务，具有产品质量意识。 ";
//        TextSimilarity textSimilarity = new CosineTextSimilarity();
//        double score1pk1 = textSimilarity.similarScore(text1, text2);
//
//        TextSimilarity textSimilarity2 = new SimpleTextSimilarity();
//        double score1pk2 = textSimilarity2.similarScore(text1, text2);

        Similarity textSimilarity3 = new EditDistanceTextSimilarity();
        double score1pk3 = textSimilarity3.similarScore(text2, text1);

//        System.out.println(score1pk1);
//        System.out.println(score1pk2);
        System.out.println(score1pk3);
    }
}
