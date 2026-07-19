/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ls {
    static String field_b;
    static String field_c;
    static ub field_a;
    static String field_d;

    public static void a(int param0) {
        if (param0 != -28527) {
          field_d = (String) null;
          field_c = null;
          field_a = null;
          field_d = null;
          field_b = null;
          return;
        } else {
          field_c = null;
          field_a = null;
          field_d = null;
          field_b = null;
          return;
        }
    }

    final static int a(int param0, int param1) {
        double stackIn_4_0 = 0.0;
        double stackOut_3_0 = 0.0;
        double stackOut_2_0 = 0.0;
        if (param1 != 2) {
          return 18;
        } else {
          L0: {
            if (param0 % 2 != 0) {
              stackOut_3_0 = 0.75 * (200.0 * rh.field_d);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 0.25 * (rh.field_d * 200.0);
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          return (int)(stackIn_4_0 + (double)(param0 / 2) * 1.5 * rh.field_d * 200.0);
        }
    }

    static {
        field_c = "Macroing or use of bots";
        field_d = "You cannot join this game - it is in progress";
        field_b = "Similar rating";
    }
}
