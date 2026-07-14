/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh implements wa {
    static int field_b;
    static int field_c;
    static vn[][] field_a;
    static fn field_e;
    static int[] field_d;

    public final void a(int param0, int param1, int param2) {
        int var4 = -126 / ((param1 - -83) / 35);
        lf.a(param2, param0, 2);
    }

    final static void a(byte param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        var3 = ZombieDawn.field_J;
        vm.field_u = dj.field_e.field_H.a(8728);
        var1 = 0;
        L0: while (true) {
          if (var1 >= vm.field_u.length) {
            var2 = 3 / ((27 - param0) / 47);
            return;
          } else {
            var2 = 0;
            L1: while (true) {
              if (var2 >= vm.field_u[0].length) {
                var1++;
                continue L0;
              } else {
                if (vm.field_u[var1][var2] != 0) {
                  vm.field_u[var1][var2] = -1;
                  var2++;
                  continue L1;
                } else {
                  var2++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final static vk a(String param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = ZombieDawn.field_J;
        int var2 = param0.length();
        for (var3 = 0; var2 > var3; var3++) {
            var4 = param0.charAt(var3);
            if (var4 < 48) {
                return null;
            }
            if (var4 > 57) {
                return null;
            }
        }
        if (param1) {
            wh.a(-70);
        }
        return vl.field_m;
    }

    public static void a(int param0) {
        if (param0 != 0) {
            field_a = null;
        }
        field_a = null;
        field_d = null;
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new vn[4][];
        field_e = null;
        field_d = new int[256];
    }
}
