import acm.graphics.GCompound;

public class Man extends GCompound {
    Head head;
    Body body;
    LeftLeg leftLeg;
    RightLeg rightLeg;
    LeftArm leftArm;
    RightArm rightArm;
    public boolean lost = false;
    public Man(double width, double height){
        head = new Head(width);
        add(head,0,0);
        body = new Body(height-2*width);
        add(body,width/2-1,width);
        leftLeg = new LeftLeg(width/2,height-width,0,height);
        add(leftLeg);
        rightLeg = new RightLeg(width/2,height-width,width,height);
        add(rightLeg);
        leftArm = new LeftArm(width/2,height/2,0,height/2-width/2);
        add(leftArm);
        rightArm = new RightArm(width/2,height/2,width,height/2-width/2);
        add(rightArm);
        head.setVisible(false);
        body.setVisible(false);
        leftArm.setVisible(false);
        rightArm.setVisible(false);
        leftLeg.setVisible(false);
        rightLeg.setVisible(false);
    }
    public void drawNext(){
        if(head.isVisible()){
            if(body.isVisible()){
                if(leftArm.isVisible()){
                    if(rightArm.isVisible()){
                        if(leftLeg.isVisible()){
                            rightLeg.setVisible(true);
                            lost = true;
                        } else {
                            leftLeg.setVisible(true);
                        }
                    } else {
                        rightArm.setVisible(true);
                    }
                } else {
                    leftArm.setVisible(true);
                }
            } else {
                body.setVisible(true);
            }
        } else {
            head.setVisible(true);
        }
    }
}
