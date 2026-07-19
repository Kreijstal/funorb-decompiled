/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class be {
    static String field_e;
    static km field_d;
    static String[] field_b;
    static String field_g;
    static int field_f;
    static int[] field_a;
    static String field_c;

    final static km[] a(int param0, boolean param1, int param2, int param3, int param4) {
        if (param1) {
            return (km[]) null;
        }
        return jc.a(3, 1, param3, param2, 1, param4, 1, param0, 0);
    }

    public static void a(byte param0) {
        field_d = null;
        field_b = null;
        field_c = null;
        if (param0 < 120) {
          field_b = (String[]) null;
          field_a = null;
          field_g = null;
          field_e = null;
          return;
        } else {
          field_a = null;
          field_g = null;
          field_e = null;
          return;
        }
    }

    static {
        field_e = "Message game";
        field_g = "Open";
        field_f = 50;
        field_c = "Show chat";
        field_b = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
    }
}
