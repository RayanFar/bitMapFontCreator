# bitMapFontCreator
<p>is a tool that makes bitmap fonts for using in jme, lemur and nifty GUi to </p>
<p>This library only supports languages such as persian and right to left</p>


<h2>how to use:</h2>
<l>
 <ol>1- make a font in cmd using executable bitMapFontCreator.jar file:</ol>
 <pre>
  java -jar .\bitMapFontCreator.jar
 </pre>
 
 <ol>2-move the font to asset directory and add bitMapFontCreator.jar as a lib to the jme project then use it like this:</ol>
 <pre>
   String txt = perisantext.p("سلام دنیا");
   BitmapFont font_m = assetManager.loadFont("Interface/Fonts/medium.fnt");
   
   /*in jme bitmap text*/
   BitmapText bmt = new BitmapText(font_m);
   bmt.setText(txt);
   
   /*in lemur gui*/
   Label lb = new Label(txt);
   lb.setFont(font_m);
   
   /*in nifty gui*/
   //just pass the txt as text and font_m as the font and it works correctly
   
 </pre>
 </l>

<p dir="rtl">
ابزاری برای تبدیل فونت های پارسی ttf به فرمت بیت مپ و برای نمایش متن راست به چپ، جهت استفاده در JmonkeyEngine.
 <br/>

</p>
