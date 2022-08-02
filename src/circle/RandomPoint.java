//package circle;
//
//import java.util.*;
//
//public class RandomPoint {
//
//    public static void main(String[] args) {
//
//
//        //棋盘大小
//        double totalRowIndex = 20;
//        double totalColIndex = 20;
//
//        //已经放进棋盘的点
//        List<Point> result = new ArrayList<>();
//
//        //参数
//        List<Point> param = new ArrayList<>();
//
//        Random random = new Random(1);
//        for (int i = 0 ; i < 10; i++) {
//            //每个节点可以存在四个子节点：1： 左上， 2： 右上 3：左下  4：右下
//            Point point = new Point();
//            point.setR(random.nextFloat());
//            param.add(point);
//        }
//
//        //对入参进行排序
//
//        //当前同心圆半径
//        double currentR = 0;
//
//        //中心点位置
//        double centerPointRow = totalRowIndex / 2;
//        double centerPointCol = totalColIndex / 2;
//
//        //模块划分： 1：左上 2：右上 3：左下 4：右下
//        Integer index = 1;
//
//        Random random1 = new Random();
//        Iterator<Point> iterator = param.iterator();
//        while (iterator.hasNext()) {
//            Point point = iterator.next();
//            if (result.isEmpty()) {
//                point.setCol(centerPointCol);
//                point.setRow(centerPointRow);
//                currentR += point.getR();
//                //防止第二个圆与第一个圆相切
//                currentR += random1.nextDouble();
//            } else {
//                //假设纵轴较短，随机出纵轴坐标
//                currentR += point.getR();
//                double colIndex;
//                double rowIndex;
//                switch (index) {
//                    case 1:
//                        //左上角
//                        colIndex = centerPointCol + random1.nextDouble() * currentR;
//                        rowIndex = centerPointRow - Math.sqrt(Math.pow(currentR, 2) - Math.pow(colIndex - centerPointCol, 2));
//
//                        point.setCol(colIndex);
//                        point.setRow(rowIndex);
//                        break;
//                    case 2:
//                        //右上角
//                        colIndex = centerPointCol + random1.nextDouble() * currentR;
//                        rowIndex = centerPointRow + Math.sqrt(Math.pow(currentR, 2) - Math.pow(colIndex - centerPointCol, 2));
//
//                        point.setCol(colIndex);
//                        point.setRow(rowIndex);
//
//                        break;
//
//                    case 3:
//                        //左下角
//                        colIndex = centerPointCol - random1.nextDouble() * currentR;
//                        rowIndex = centerPointRow - Math.sqrt(Math.pow(currentR, 2) - Math.pow(colIndex - centerPointCol, 2));
//
//                        point.setCol(colIndex);
//                        point.setRow(rowIndex);
//                        break;
//                    case 4:
//                        //右下角
//                        colIndex = centerPointCol - random1.nextDouble() * currentR;
//                        rowIndex = centerPointRow + Math.sqrt(Math.pow(currentR, 2) - Math.pow(colIndex - centerPointCol, 2));
//
//                        point.setCol(colIndex);
//                        point.setRow(rowIndex);
//                        break;
//                }
//            }
//            result.add(point);
//            index++;
//            index = index % 4;
//        }
//
//        System.out.println(result);
//    }
//}
