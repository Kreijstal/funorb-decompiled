/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.awt.Canvas;

final class df extends rqa {
    static aba field_o;
    static int field_p;

    public static void f(byte param0) {
        field_o = null;
        if (param0 > -90) {
            java.awt.Canvas discarded$0 = df.e((byte) 1);
        }
    }

    df(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static java.awt.Canvas e(byte param0) {
        Object stackIn_4_0 = null;
        Object stackIn_8_0 = null;
        ufb stackOut_7_0 = null;
        java.awt.Canvas stackOut_6_0 = null;
        ufb stackOut_3_0 = null;
        java.awt.Canvas stackOut_2_0 = null;
        if (param0 <= 62) {
          L0: {
            field_p = 24;
            if (null != psb.field_b) {
              stackOut_7_0 = psb.field_b;
              stackIn_8_0 = (Object) (Object) stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = igb.field_a;
              stackIn_8_0 = (Object) (Object) stackOut_6_0;
              break L0;
            }
          }
          return (java.awt.Canvas) (Object) stackIn_8_0;
        } else {
          L1: {
            if (null != psb.field_b) {
              stackOut_3_0 = psb.field_b;
              stackIn_4_0 = (Object) (Object) stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = igb.field_a;
              stackIn_4_0 = (Object) (Object) stackOut_2_0;
              break L1;
            }
          }
          return (java.awt.Canvas) (Object) stackIn_4_0;
        }
    }

    final nc a(nc[] param0, int param1) {
        si.a(16, 62, param0[0].a(29));
        if (param1 > -119) {
          field_o = null;
          return new nc((Object) (Object) "void");
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new aba();
        field_p = 0;
    }
}
