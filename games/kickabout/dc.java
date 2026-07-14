/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc {
    static hd field_a;
    static int field_d;
    static ut field_b;
    static int field_c;

    final static void a(int param0, byte param1) {
        vs var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = Kickabout.field_G;
        var2 = ue.field_f[param0];
        if (param1 < 25) {
          field_d = 122;
          var3 = param0;
          L0: while (true) {
            if (var3 <= 0) {
              ue.field_f[0] = var2;
              return;
            } else {
              ue.field_f[var3] = ue.field_f[var3 - 1];
              var3--;
              continue L0;
            }
          }
        } else {
          var3 = param0;
          L1: while (true) {
            if (var3 <= 0) {
              ue.field_f[0] = var2;
              return;
            } else {
              ue.field_f[var3] = ue.field_f[var3 - 1];
              var3--;
              continue L1;
            }
          }
        }
    }

    public static void a(int param0) {
        int var1 = 119 / ((param0 - 14) / 60);
        field_a = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new ut(104, 150);
        field_c = -1;
    }
}
