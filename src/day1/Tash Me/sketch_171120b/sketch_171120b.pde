PImage mustache;
PImage friend;
void setup(){
  friend=loadImage("Patrick_925.gif");
  size(800,600);
  friend.resize(width,height);
  mustache=loadImage("m.png");
}
void draw(){
if(mousePressed){
 background(friend);
  image(mustache, mouseX,mouseY);
}
mustache.resize( 175, 175);
}