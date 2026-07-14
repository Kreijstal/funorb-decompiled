/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.awt.Canvas;

final class ab {
    byte[] field_k;
    int field_l;
    static String field_n;
    int field_i;
    int field_j;
    byte[] field_b;
    int field_c;
    static int field_d;
    int field_a;
    static String field_m;
    static int[] field_g;
    int field_h;
    int field_f;
    static int[] field_e;

    final static java.awt.Canvas a(int param0) {
        Object stackIn_4_0 = null;
        Object stackIn_8_0 = null;
        java.awt.Canvas stackOut_7_0 = null;
        ad stackOut_6_0 = null;
        java.awt.Canvas stackOut_3_0 = null;
        ad stackOut_2_0 = null;
        if (param0 <= 26) {
          L0: {
            java.awt.Canvas discarded$9 = ab.a(81);
            if (null == gi.field_d) {
              stackOut_7_0 = bg.field_P;
              stackIn_8_0 = (Object) (Object) stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = gi.field_d;
              stackIn_8_0 = (Object) (Object) stackOut_6_0;
              break L0;
            }
          }
          return (java.awt.Canvas) (Object) stackIn_8_0;
        } else {
          L1: {
            if (null == gi.field_d) {
              stackOut_3_0 = bg.field_P;
              stackIn_4_0 = (Object) (Object) stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = gi.field_d;
              stackIn_4_0 = (Object) (Object) stackOut_2_0;
              break L1;
            }
          }
          return (java.awt.Canvas) (Object) stackIn_4_0;
        }
    }

    public static void a(boolean param0) {
        field_n = null;
        field_e = null;
        field_m = null;
        field_g = null;
        if (!param0) {
            java.awt.Canvas discarded$0 = ab.a(-3);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Age:";
        field_n = "Close";
        field_d = 1;
        field_g = new int[]{256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 127, 256};
        field_e = new int[]{-192, -256, 384, 512};
    }
}
