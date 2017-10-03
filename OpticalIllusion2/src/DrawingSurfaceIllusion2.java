import java.awt.Color;

import processing.core.PApplet;
import vishnu.shapes.*;

public class DrawingSurfaceIllusion2 extends PApplet{

	private Rectangle[] r;
	private Line[] l;
	
	public DrawingSurfaceIllusion2() {
		
		
		Line line0 = new Line(0, 49, 500,50,Color.GRAY, 3f);
		Line line1 = new Line(0, 99, 500,100,Color.GRAY, 3f);
		Line line2 = new Line(0, 149, 500, 150,Color.GRAY, 3f);
		Line line3 = new Line(0, 199, 500, 200,Color.GRAY, 3f);
		Line line4 = new Line(0, 249, 500, 250,Color.GRAY, 3f);
		Line line5 = new Line(0, 299, 500, 300,Color.GRAY, 3f);
		Line line6 = new Line(0, 349, 500, 350,Color.GRAY, 3f);
		
		
		Line[] lineArray = {line0, line1, line2, line3, line4, line5};
		l = lineArray;
		
		
		
		
		Rectangle r0 = new Rectangle(2,2,44,44,Color.GREEN,Color.BLACK,1);
		Rectangle r1 = new Rectangle(52,2,44,44,Color.WHITE,Color.BLACK,1);
		Rectangle r2 = new Rectangle(102,2,44,44,Color.GREEN,Color.BLACK,1);
		Rectangle r3 = new Rectangle(152,2,44,44,Color.WHITE,Color.BLACK,1);
		Rectangle r4 = new Rectangle(202,2,44,44,Color.GREEN,Color.BLACK,1);
		Rectangle r5 = new Rectangle(252,2,44,44,Color.WHITE,Color.BLACK,1);
		Rectangle r6 = new Rectangle(302,2,44,44,Color.GREEN,Color.BLACK,1);
		Rectangle r7 = new Rectangle(352,2,44,44,Color.WHITE,Color.BLACK,1);
		Rectangle r8 = new Rectangle(402,2,44,44,Color.GREEN,Color.BLACK,1);
		Rectangle r9 = new Rectangle(452,2,44,44,Color.WHITE,Color.BLACK,1);
		
		Rectangle r10 = new Rectangle(2+10,52,44,44,Color.WHITE,Color.BLACK,1);
		Rectangle r11 = new Rectangle(52+10,52,44,44,Color.GREEN,Color.BLACK,1);
		Rectangle r12 = new Rectangle(102+10,52,44,44,Color.WHITE,Color.BLACK,1);
		Rectangle r13 = new Rectangle(152+10,52,44,44,Color.GREEN,Color.BLACK,1);
		Rectangle r14 = new Rectangle(202+10,52,44,44,Color.WHITE,Color.BLACK,1);
		Rectangle r15 = new Rectangle(252+10,52,44,44,Color.GREEN,Color.BLACK,1);
		Rectangle r16 = new Rectangle(302+10,52,44,44,Color.WHITE,Color.BLACK,1);
		Rectangle r17 = new Rectangle(352+10,52,44,44,Color.GREEN,Color.BLACK,1);
		Rectangle r18 = new Rectangle(402+10,52,44,44,Color.WHITE,Color.BLACK,1);
		Rectangle r19 = new Rectangle(452+10,52,44,44,Color.GREEN,Color.BLACK,1);
		
		Rectangle r20 = new Rectangle(2,102,44,44,Color.GREEN,Color.BLACK,1);
		Rectangle r21 = new Rectangle(52,102,44,44,Color.WHITE,Color.BLACK,1);
		Rectangle r22 = new Rectangle(102,102,44,44,Color.GREEN,Color.BLACK,1);
		Rectangle r23 = new Rectangle(152,102,44,44,Color.WHITE,Color.BLACK,1);
		Rectangle r24 = new Rectangle(202,102,44,44,Color.GREEN,Color.BLACK,1);
		Rectangle r25 = new Rectangle(252,102,44,44,Color.WHITE,Color.BLACK,1);
		Rectangle r26 = new Rectangle(302,102,44,44,Color.GREEN,Color.BLACK,1);
		Rectangle r27 = new Rectangle(352,102,44,44,Color.WHITE,Color.BLACK,1);
		Rectangle r28 = new Rectangle(402,102,44,44,Color.GREEN,Color.BLACK,1);
		Rectangle r29 = new Rectangle(452,102,44,44,Color.WHITE,Color.BLACK,1);
		
		
		Rectangle r30 = new Rectangle(2-10,152,44,44,Color.WHITE,Color.BLACK,1);
		Rectangle r31 = new Rectangle(52-10,152,44,44,Color.GREEN,Color.BLACK,1);
		Rectangle r32 = new Rectangle(102-10,152,44,44,Color.WHITE,Color.BLACK,1);
		Rectangle r33 = new Rectangle(152-10,152,44,44,Color.GREEN,Color.BLACK,1);
		Rectangle r34 = new Rectangle(202-10,152,44,44,Color.WHITE,Color.BLACK,1);
		Rectangle r35 = new Rectangle(252-10,152,44,44,Color.GREEN,Color.BLACK,1);
		Rectangle r36 = new Rectangle(302-10,152,44,44,Color.WHITE,Color.BLACK,1);
		Rectangle r37 = new Rectangle(352-10,152,44,44,Color.GREEN,Color.BLACK,1);
		Rectangle r38 = new Rectangle(402-10,152,44,44,Color.WHITE,Color.BLACK,1);
		Rectangle r39 = new Rectangle(452-10,152,44,44,Color.GREEN,Color.BLACK,1);
		
		
		Rectangle r40 = new Rectangle(2,202,44,44,Color.GREEN,Color.BLACK,1);
		Rectangle r41 = new Rectangle(52,202,44,44,Color.WHITE,Color.BLACK,1);
		Rectangle r42 = new Rectangle(102,202,44,44,Color.GREEN,Color.BLACK,1);
		Rectangle r43 = new Rectangle(152,202,44,44,Color.WHITE,Color.BLACK,1);
		Rectangle r44 = new Rectangle(202,202,44,44,Color.GREEN,Color.BLACK,1);
		Rectangle r45 = new Rectangle(252,202,44,44,Color.WHITE,Color.BLACK,1);
		Rectangle r46 = new Rectangle(302,202,44,44,Color.GREEN,Color.BLACK,1);
		Rectangle r47 = new Rectangle(352,202,44,44,Color.WHITE,Color.BLACK,1);
		Rectangle r48 = new Rectangle(402,202,44,44,Color.GREEN,Color.BLACK,1);
		Rectangle r49 = new Rectangle(452,202,44,44,Color.WHITE,Color.BLACK,1);
		
		
		
		Rectangle r50 = new Rectangle(2+10,252,44,44,Color.WHITE,Color.BLACK,1);
		Rectangle r51 = new Rectangle(52+10,252,44,44,Color.GREEN,Color.BLACK,1);
		Rectangle r52 = new Rectangle(102+10,252,44,44,Color.WHITE,Color.BLACK,1);
		Rectangle r53 = new Rectangle(152+10,252,44,44,Color.GREEN,Color.BLACK,1);
		Rectangle r54 = new Rectangle(202+10,252,44,44,Color.WHITE,Color.BLACK,1);
		Rectangle r55 = new Rectangle(252+10,252,44,44,Color.GREEN,Color.BLACK,1);
		Rectangle r56 = new Rectangle(302+10,252,44,44,Color.WHITE,Color.BLACK,1);
		Rectangle r57 = new Rectangle(352+10,252,44,44,Color.GREEN,Color.BLACK,1);
		Rectangle r58 = new Rectangle(402+10,252,44,44,Color.WHITE,Color.BLACK,1);
		Rectangle r59 = new Rectangle(452+10,252,44,44,Color.GREEN,Color.BLACK,1);
		
		
		Rectangle r60 = new Rectangle(2,302,44,44,Color.GREEN,Color.BLACK,1);
		Rectangle r61 = new Rectangle(52,302,44,44,Color.WHITE,Color.BLACK,1);
		Rectangle r62 = new Rectangle(102,302,44,44,Color.GREEN,Color.BLACK,1);
		Rectangle r63 = new Rectangle(152,302,44,44,Color.WHITE,Color.BLACK,1);
		Rectangle r64 = new Rectangle(202,302,44,44,Color.GREEN,Color.BLACK,1);
		Rectangle r65 = new Rectangle(252,302,44,44,Color.WHITE,Color.BLACK,1);
		Rectangle r66 = new Rectangle(302,302,44,44,Color.GREEN,Color.BLACK,1);
		Rectangle r67 = new Rectangle(352,302,44,44,Color.WHITE,Color.BLACK,1);
		Rectangle r68 = new Rectangle(402,302,44,44,Color.GREEN,Color.BLACK,1);
		Rectangle r69 = new Rectangle(452,302,44,44,Color.WHITE,Color.BLACK,1);
		
		
		Rectangle[] rectArray = {r0,r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11,r12,r13,r14,r15,r16,r17,r18,r19,
				r20,r21,r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37,r38,r39,
				r40,r41,r42,r43,r44,r45,r46,r47,r48,r49,r50,r51,r52,r53,r54,r55,r56,r57,r58,r59,
				r60,r61,r62,r63,r64,r65,r66,r67,r68,r69};
		r = rectArray;
	}
	
	public void draw() {
		this.background(255);
		
		for(int i = 0; i < l.length; i++) {
			l[i].draw(this);
		}
		
		for(int i = 0; i < r.length; i++) {
			r[i].draw(this);
		}
		
		
		
	}
}
