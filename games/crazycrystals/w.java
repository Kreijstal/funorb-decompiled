/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class w extends jb {
    static int field_f;
    static int field_g;

    final static sc a(int param0, int param1, int param2, int param3) {
        sc var4 = new sc();
        var4.field_k = param1;
        var4.field_f = param3;
        hd.field_c.b(param0, (jb) (Object) var4);
        ed.a((byte) 121, param2, var4);
        return var4;
    }

    final static void a(int param0, byte param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        var16 = CrazyCrystals.field_B;
        if (param1 == -52) {
          param8--;
          L0: while (true) {
            if ((param8 ^ -1) > -1) {
              return;
            } else {
              var17 = param2;
              var10 = var17;
              var11 = param9;
              var12 = param0;
              var13 = param4;
              var14 = param7;
              var15 = var17[var11] >> 216555233 & 8355711;
              var10[var11] = var15 - -(pf.b(33474619, var14) >> -428775311) - (-pf.b(16711680, var12 >> 1184356929) + -(pf.b(var13, 33423575) >> -1034950807));
              param7 = param7 + param5;
              param9++;
              param4 = param4 + param3;
              param0 = param0 + param6;
              param8--;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    private w() throws Throwable {
        throw new Error();
    }

    final static void a(int param0) {
        if (param0 != 33423575) {
            field_g = -117;
        }
    }

    final static jp a(byte param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = CrazyCrystals.field_B;
        var2 = param1.length();
        if (var2 == 0) {
          return ma.field_m;
        } else {
          if (var2 > 63) {
            return hk.field_d;
          } else {
            var3 = 0;
            L0: while (true) {
              if (var3 >= var2) {
                if (param0 != -44) {
                  field_g = 54;
                  return null;
                } else {
                  return null;
                }
              } else {
                var4 = param1.charAt(var3);
                if (var4 != 45) {
                  if (rk.field_f.indexOf(var4) == -1) {
                    return sl.field_m;
                  } else {
                    var3++;
                    continue L0;
                  }
                } else {
                  L1: {
                    if (var3 == 0) {
                      break L1;
                    } else {
                      if (var3 == var2 - 1) {
                        break L1;
                      } else {
                        var3++;
                        continue L0;
                      }
                    }
                  }
                  return sl.field_m;
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = 0;
    }
}
