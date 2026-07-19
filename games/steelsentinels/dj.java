/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dj {
    static wk field_c;
    static String field_i;
    static String[] field_j;
    static String[][] field_g;
    static String field_a;
    static gh field_d;
    static gh field_b;
    static String[] field_f;
    int field_e;
    static int[] field_k;
    static String field_h;

    final static int a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 < -108) {
              stackOut_3_0 = bg.a((byte) 100, true, 10, param0);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = -59;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var2);
            stackOut_5_1 = new StringBuilder().append("dj.B(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(byte param0) {
        field_g = (String[][]) null;
        field_f = null;
        field_a = null;
        field_b = null;
        field_d = null;
        field_j = null;
        field_i = null;
        if (param0 != 94) {
          dj.a((byte) 20);
          field_h = null;
          field_k = null;
          field_c = null;
          return;
        } else {
          field_h = null;
          field_k = null;
          field_c = null;
          return;
        }
    }

    dj(int param0) {
        this.field_e = param0;
    }

    static {
        field_i = "Warning: sentinel command guidelines encourage you to complete your training before attempting to operate the more sophisticated chassis.";
        field_a = "Exploiting a bug";
        field_g = new String[][]{new String[]{null, null, "Tap the 'Z' key to tell your sentinel to start moving left.", "Press 'Z' once to start moving left.", "Since you are remotely piloting your sentinel, there is a short delay between when you issue an order and when the sentinel receives and acts upon it. <br>Tap the 'C' key to instruct your sentinel to start moving right.", "Press 'C' once to start moving right.", "In the absence of other orders, your sentinel will carry on walking. Press 'X' to tell it to halt.", "Press 'X' to stop moving.", "At the bottom of your screen is the minimap. This shows the locations of sentinels on the battlefield. The blue circle is your sentinel, and the flashing red circle is a training drone. Walk your sentinel to the training drone and stop as close to it as possible.", "Use 'Z', 'X', 'C' to position your sentinel at the training drone.", "You can move the camera with the 'W','A','S' and 'D' keys. The button on the right offers some options for changing the controls.<br>Try them out and choose the one you prefer.", null, "The Slave also has the ability to jump. To instruct your sentinel to jump, hold 'SHIFT' and left-click above your sentinel.", "Use 'SHIFT' and left-click to jump.", "While you hold 'SHIFT', the projected path of your jump is displayed on your screen. This allows you to aim your jump precisely by moving the mouse.<br>There are now three drones in elevated positions on the battlefield. Reach them all by jumping.", "Hold 'SHIFT' and move the mouse to plan the trajectory of your jump.<br>Reach all the drones by jumping.", null, null, null, null, "Some mobile drones have been placed on the training field. Destroy them all. Keep in mind that your guns have a limited range and a restricted firing arc.<br>Remember, you can move your sentinel to a better position using the move keys ('Z', 'X', 'C') or by jumping ('SHIFT' and click).", null, null, null}, new String[]{null, null, null, null, null, null, null, null, null, null, "There is one more drone, on the left hand side of the battlefield. Scroll left (by pressing 'A') to find it.", "Press 'A' to move the camera left.", "When your sentinel is off-screen, the inset display appears at the screen edge closest to your sentinel, to remind you where your sentinel is. Use 'W','A','S','D' to move the camera around, and the highlighted box on your minimap shows what part of the battlefield you are currently viewing.", "Use 'W','A','S','D' to move the camera around.", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}, null, new String[]{null, null, "To thrust, use 'SHIFT' and the mouse to perform a jump. Then, while in the air, hold 'SHIFT' and jump again.", "Use 'SHIFT' and the left mouse button while in the air to thrust.", "Now, by thrusting multiple times, try and stay in the air for as long as possible.", "Use 'SHIFT' and the left mouse button while in the air to thrust.", null, null, null, null, null, null, null, null}, null, null, null, null, null, null};
        field_f = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_k = new int[4];
        field_h = "Service unavailable";
    }
}
