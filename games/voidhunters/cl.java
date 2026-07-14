/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl {
    int[] field_a;
    static int[] field_b;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = VoidHunters.field_G;
        var6 = ksa.a(31123, lua.field_c, hab.field_i, param3);
        var7 = ksa.a(31123, lua.field_c, hab.field_i, param2);
        var8 = ksa.a(31123, ob.field_j, mt.field_o, param5);
        var9 = ksa.a(param0 ^ -29743, ob.field_j, mt.field_o, param4);
        var10 = var6;
        L0: while (true) {
          if (var7 < var10) {
            if (param0 != -3518) {
              cl.a((byte) 67);
              return;
            } else {
              return;
            }
          } else {
            ww.a(param1, var9, rba.field_b[var10], (byte) 75, var8);
            var10++;
            continue L0;
          }
        }
    }

    public static void a(byte param0) {
        field_b = null;
        int var1 = 51 % ((-31 - param0) / 36);
    }

    public cl() {
        ((cl) this).field_a = new int[16];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[8192];
    }
}
