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
        if (param1 > 79) {
          if (param2) {
            wk.field_m = wk.field_m + 1;
            f.b((byte) 58);
          }
          if (param0) {
            fl.field_m = fl.field_m + 1;
            tha.a(906);
          }
          return;
        }
        ija.a(false, (byte) 60, false);
        if (param2) {
          wk.field_m = wk.field_m + 1;
          f.b((byte) 58);
        }
        if (param0) {
          fl.field_m = fl.field_m + 1;
          tha.a(906);
        }
    }

    public static void a(byte param0) {
        if (param0 <= 2) {
          return;
        }
        field_i = null;
    }

    abstract void a(java.awt.Canvas param0, int param1, int param2, int param3);

    ija() {
    }

    static {
        field_i = "Name";
    }
}
