/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class is extends fh {
    int field_k;

    abstract Object a(int param0);

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var17 = 0;
        int[] var21 = null;
        RuntimeException decompiledCaughtException = null;
        var17 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param4 == 20408) {
                break L1;
              } else {
                is.a(62, 42, -59, 39, 23, 69, 36);
                break L1;
              }
            }
            var11 = ksa.a(31123, lua.field_c, hab.field_i, param5);
            var12 = ksa.a(31123, lua.field_c, hab.field_i, param6);
            var13 = ksa.a(param4 + 10715, ob.field_j, mt.field_o, param2);
            var14 = ksa.a(31123, ob.field_j, mt.field_o, param0);
            var7_int = ksa.a(31123, lua.field_c, hab.field_i, param5 + param3);
            var8 = ksa.a(31123, lua.field_c, hab.field_i, -param3 + param6);
            var15 = var11;
            L2: while (true) {
              if (var15 >= var7_int) {
                var15 = var12;
                L3: while (true) {
                  if (var8 >= var15) {
                    var9 = ksa.a(31123, ob.field_j, mt.field_o, param3 + param2);
                    var10 = ksa.a(31123, ob.field_j, mt.field_o, -param3 + param0);
                    var15 = var7_int;
                    L4: while (true) {
                      if (var8 < var15) {
                        break L0;
                      } else {
                        var21 = rba.field_b[var15];
                        ww.a(param1, var9, var21, (byte) 75, var13);
                        ww.a(param1, var14, var21, (byte) 75, var10);
                        var15++;
                        continue L4;
                      }
                    }
                  } else {
                    ww.a(param1, var14, rba.field_b[var15], (byte) 75, var13);
                    var15--;
                    continue L3;
                  }
                }
              } else {
                ww.a(param1, var14, rba.field_b[var15], (byte) 75, var13);
                var15++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var7), "is.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    is(int param0) {
        this.field_k = param0;
    }

    abstract boolean e(byte param0);

    static {
    }
}
