public class Polygon {
        
       private int numSides=0;
        private double sideLength=0;
       private String shapeType="null";
       private double perimeter=0;
       public Polygon(){
          numSides = 4;
          sideLength=4;
          shapeType="square";
       }
        public Polygon(int sideNum, double length, String type){
            numSides=sideNum;
            sideLength=length;
            shapeType=type;
        }
        public int getNumSides(){
            return numSides;
        }
        public double getSideLength(){
            return sideLength;
        }
        public String ShapeType(){
            return shapeType;
        }
        public void setSideLength(double newLength){
            sideLength = newLength;
        }
        public void setNumSides(int newSides){
            numSides = newSides;
        }
        public void setShapeName (String newType){
            shapeType=newType;
        }
        public double calculatePerimeter(){
            perimeter=(sideLength*numSides);
            return perimeter;
        }
        
        
        public String toString(){
            return (" "+shapeType+", "+numSides+"  sides and a perimeter of "+perimeter);
        }
        
        
        
        
        
        
    }
