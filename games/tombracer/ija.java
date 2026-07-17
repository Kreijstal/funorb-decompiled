/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ija extends vg {
    int[] field_g;
    static String field_i;
    int field_h;
    int field_f;

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5, java.awt.Graphics param6, int param7);

    final static void a(boolean param0, byte param1, boolean param2) {
        if (param1 <= 79) {
          L0: {
            ija.a(false, (byte) 60, false);
            if (param2) {
              wk.field_m = wk.field_m + 1;
              f.b((byte) 58);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (param0) {
              fl.field_m = fl.field_m + 1;
              tha.a(906);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        } else {
          L2: {
            if (param2) {
              wk.field_m = wk.field_m + 1;
              f.b((byte) 58);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (param0) {
              fl.field_m = fl.field_m + 1;
              tha.a(906);
              break L3;
            } else {
              break L3;
            }
          }
          return;
        }
    }

    public static void a() {
        field_i = null;
    }

    abstract void a(java.awt.Canvas param0, int param1, int param2, int param3);

    ija() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Name";
    }
}
