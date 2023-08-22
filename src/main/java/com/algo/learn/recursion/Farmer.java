package com.algo.learn.recursion;

/**
 * 农场主分地
 * 要将一块地均匀的分成方块，并且分出的放开尽可能的大
 */
public class Farmer {

    public static void main(String[] args) {
        int test = 4%9;
        System.out.println("test: " + test);
//        Land land = divisor(new Land(4,9));
        Land land1 = divisor1(new Land(4,9));
//        System.out.println("land:" + land);
        System.out.println("land1:" + land1);
    }

    private static Land divisor(Land land) {
        if (land.width >= land.height) {
            //如果宽是高的整数倍，说明可以分完
            int last = land.getWidth() % land.getHeight();
            if (last == 0) {
                return new Land(land.getHeight(),land.getHeight());
            } else {
                return divisor(new Land(last,land.height));
            }
        } else {
            //如果宽是高的整数倍，说明可以分完
            int last = land.getHeight() % land.getWidth();
            if (last == 0) {
                return new Land(land.getWidth(), land.getWidth());
            } else {
                return divisor(new Land(land.height,last));
            }
        }
    }

    private static Land divisor1(Land land) {
        if ((land.width % land.height) == 0) {
            return new Land(land.height,land.height);
        } else {
            return divisor1(new Land(land.height,land.width%land.height));
        }
    }

    static class Land {
        int width = 0;
        int height = 0;

        public Land(int width, int height) {
            this.width = width;
            this.height = height;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        @Override
        public String toString() {
            return "Land{" +
                    "width=" + width +
                    ", height=" + height +
                    '}';
        }
    }
}
