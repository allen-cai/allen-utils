package yggcBatchImport;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description
 * @Author allen
 * @Date 2020/9/21 17:49
 * @ClassName SqlUtils
 **/
public class SqlUtils {

    public static String HEAD = "INSERT INTO `yggc_message_info` (`id`, `platform_id`, `platform_code`, `message_type`, `target_id`, `content`, `is_delete`, `yn`, `create_time`, `update_time`) VALUES ";

    public static void main(String[] args) {
        String param = "1291368_1507809\n" +
                "1291369_1507810\n" +
                "1291370_1507811\n" +
                "1291371_1507812\n" +
                "1291372_1507813\n" +
                "1291373_1507814\n" +
                "1291374_1507815\n" +
                "1291375_1507816\n" +
                "1291376_1507817\n" +
                "1291377_1507818\n" +
                "1291378_1507819\n" +
                "1291379_1507820\n" +
                "1291380_1507821\n" +
                "1291381_1507822\n" +
                "1291382_1507823\n" +
                "1291383_1507824\n" +
                "1291384_1507825\n" +
                "1291385_1507826\n" +
                "1291386_1507827\n" +
                "1291387_1507828\n" +
                "1291388_1507829\n" +
                "1291389_1507830\n" +
                "1291390_1507831\n" +
                "1291391_1507832\n" +
                "1291392_1507833\n" +
                "1291393_1507834\n" +
                "1291394_1507835\n" +
                "1291395_1507836\n" +
                "1291396_1507837\n" +
                "1291397_1507838\n" +
                "1291398_1507839\n" +
                "1291399_1507840\n" +
                "1291400_1507841\n" +
                "1291401_1507842\n" +
                "1291402_1507843\n" +
                "1291403_1507844\n" +
                "1291404_1507845\n" +
                "1291405_1507846\n" +
                "1291406_1507847\n" +
                "1291407_1507848\n" +
                "1291408_1507849\n" +
                "1291409_1507850\n" +
                "1291410_1507851\n" +
                "1291411_1507852\n" +
                "1291412_1507853\n" +
                "1291413_1507854\n" +
                "1291414_1507855\n" +
                "1291415_1507856\n" +
                "1291416_1507857\n" +
                "1291417_1507858\n" +
                "1291427_1507868\n" +
                "1291435_1507876\n" +
                "1291440_1507881\n";

        String[] split = param.split("\n");

        StringBuilder values = new StringBuilder();
        values.append(HEAD);
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = simpleDateFormat.format(date);
        for (int i = 0; i < split.length; i++) {
            String[] s = split[i].split("_");
            values.append("(");
            values.append("NULL,");
            values.append("'20170410120',");
            values.append("'ZF00003',");
            values.append("'16',");
            values.append("'");
            values.append(s[1]);
            values.append("',");
            values.append("'{\"skuId\":\"");
            values.append(split[i]);
            values.append("\",\"state\":1}', 0, 1, '");
            values.append(time);
            values.append("','");
            values.append(time);
            values.append("'),");
        }

        System.out.println(values.toString());
    }
}
