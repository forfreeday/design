package com.liukai.design.proxy;

public class BodyTest {

    static class Body implements Cloneable{
        public Head head;
        public Body() {}
        public Body(Head head) {this.head = head;}

        @Override
        protected Object clone() throws CloneNotSupportedException {
            Body newBody =  (Body) super.clone();
            //关键在这一行，是否进行了 clone，如果这里没有重新 clone，结果为true，说明是同一个引用对象
//            newBody.head = (Head) head.clone();
            return newBody;
        }

    }
    static class Head implements Cloneable{
        public  Face face;

        public Head() {}
        public Head(Face face){this.face = face;}
        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }


    static class Face{
        String aaa = "test";
        public Face() {}

    }



    public static void main(String[] args) throws CloneNotSupportedException {

        Body body1 = new Body(new Head(new Face()));

        Body body2 = (Body) body1.clone();

        System.out.println("body1 == body2----> " + (body1 == body2) );

        System.out.println("body1.head == body2.head ---->  " +  (body1.head == body2.head));
        System.out.println(body1.head.face.aaa);
        System.out.println(body2.head.face.aaa);

    }

}