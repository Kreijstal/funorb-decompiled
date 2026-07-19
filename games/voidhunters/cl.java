/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl {
    int[] field_a;
    static int[] field_b;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = VoidHunters.field_G;
        try {
          L0: {
            var6_int = ksa.a(31123, lua.field_c, hab.field_i, param3);
            var7 = ksa.a(31123, lua.field_c, hab.field_i, param2);
            var8 = ksa.a(31123, ob.field_j, mt.field_o, param5);
            var9 = ksa.a(param0 ^ -29743, ob.field_j, mt.field_o, param4);
            var10 = var6_int;
            L1: while (true) {
              if (var7 < var10) {
                if (param0 == -3518) {
                  break L0;
                } else {
                  cl.a((byte) 67);
                  return;
                }
              } else {
                ww.a(param1, var9, rba.field_b[var10], (byte) 75, var8);
                var10++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var6), "cl.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void a(byte param0) {
        field_b = null;
        int var1 = 51 % ((-31 - param0) / 36);
    }

    public cl() {
        this.field_a = new int[16];
    }

    static {
        field_b = new int[8192];
    }
}
