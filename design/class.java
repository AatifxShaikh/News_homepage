interface drawable{
    void draw();
}
class rectangle implements drawable{
    public void draw(){system.out.println("drawing machine");
}

}
class circle implements drawable{
    public void draw{system.out.println("drawing circle");}
}
class class{
    public static void main(String[] args) {
        drawable d=new circle();
        d.draw();
    }
}