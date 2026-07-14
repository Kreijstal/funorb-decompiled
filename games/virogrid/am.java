/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am {
    static String field_c;
    static String field_a;
    static String field_d;
    static String field_b;
    static jc field_e;

    final static boolean a(byte param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -56) {
          L0: {
            field_d = null;
            if (param1 != (-param1 & param1)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (param1 != (-param1 & param1)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static void a(byte param0) {
        if (ih.field_b == null) {
          return;
        } else {
          L0: {
            af.a((byte) -67, (java.awt.Canvas) (Object) ih.field_b);
            ih.field_b.a(109, ei.field_c);
            ih.field_b = null;
            if (null != kk.field_q) {
              kk.field_q.a((byte) -122);
              break L0;
            } else {
              break L0;
            }
          }
          fi.field_v.requestFocus();
          if (param0 != -16) {
            boolean discarded$2 = am.a((byte) -28, 121);
            return;
          } else {
            return;
          }
        }
    }

    public static void b(byte param0) {
        int var1 = 106 % ((51 - param0) / 33);
        field_c = null;
        field_a = null;
        field_b = null;
        field_d = null;
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Unable to delete friend - system busy";
        field_a = "Some players haven't unlocked the currently selected game options.<br>Please see the player list on the left for details.";
        field_d = "You appear to be telling someone your password - please don't!";
        field_b = "OFF";
    }
}
