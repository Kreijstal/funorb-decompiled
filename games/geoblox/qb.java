/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qb extends hk {
    static hh field_N;
    static rf field_M;
    static String field_F;
    int field_E;
    int field_H;
    int field_O;
    static String field_L;
    static int field_G;
    int field_J;
    int field_I;
    int field_K;

    final static mg b(int param0, int param1, int param2, int param3, int param4) {
        int var6 = Geoblox.field_C;
        mg var5 = (mg) (Object) rh.field_d.g(param2 ^ param2);
        while (var5 != null) {
            if (var5.field_i == param0) {
                return var5;
            }
            var5 = (mg) (Object) rh.field_d.d(1);
        }
        mg var5_ref = new mg();
        var5_ref.field_f = param3;
        var5_ref.field_l = param1;
        var5_ref.field_i = param0;
        rh.field_d.a(-71, (hf) (Object) var5_ref);
        ib.a(param4, param2 + 5, var5_ref);
        return var5_ref;
    }

    public static void f(int param0) {
        field_F = null;
        field_M = null;
        if (param0 != 0) {
            field_M = null;
        }
        field_N = null;
        field_L = null;
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, el param6) {
        int var8 = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = Geoblox.field_C;
        if (!super.a(param0, -52, param2, param3, param4, param5, param6)) {
          var8 = 35 % ((-3 - param1) / 38);
          return false;
        } else {
          L0: {
            var8 = -((qb) this).field_E - (((qb) this).field_v + (param2 - param4));
            var9 = param5 - (((qb) this).field_m + param0 + ((qb) this).field_O);
            if (var8 * var8 + var9 * var9 >= ((qb) this).field_K * ((qb) this).field_K) {
              break L0;
            } else {
              L1: {
                var10 = Math.atan2((double)var9, (double)var8) - q.field_f;
                if (var10 >= 0.0) {
                  if (0.0 < var10) {
                    var10 = var10 + 3.141592653589793 / (double)((qb) this).field_H;
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  var10 = var10 - 3.141592653589793 / (double)((qb) this).field_H;
                  break L1;
                }
              }
              ((qb) this).field_I = (int)(var10 * (double)((qb) this).field_H / 6.283185307179586);
              L2: while (true) {
                if (((qb) this).field_I < ((qb) this).field_H) {
                  L3: while (true) {
                    if (-1 >= (((qb) this).field_I ^ -1)) {
                      break L0;
                    } else {
                      ((qb) this).field_I = ((qb) this).field_I + ((qb) this).field_H;
                      continue L3;
                    }
                  }
                } else {
                  ((qb) this).field_I = ((qb) this).field_I - ((qb) this).field_H;
                  continue L2;
                }
              }
            }
          }
          return true;
        }
    }

    final static void a(int param0, lk param1, String param2, int param3, m param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        L0: {
          var9 = Geoblox.field_C;
          var5 = 0;
          if (param3 == 60) {
            break L0;
          } else {
            var10 = null;
            qb.a(-58, (lk) null, (String) null, -15, (m) null);
            break L0;
          }
        }
        var6 = -1;
        var7 = 1;
        L1: while (true) {
          if (var7 >= param2.length()) {
            return;
          } else {
            L2: {
              var8 = param2.charAt(var7);
              if (60 != var8) {
                break L2;
              } else {
                var6 = param1.field_c[0] + (var5 >> -979414712) - -param4.a(param2.substring(0, var7));
                break L2;
              }
            }
            L3: {
              if (0 == (var6 ^ -1)) {
                L4: {
                  if (var8 == 32) {
                    var5 = var5 + param0;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                param1.field_c[var7] = param1.field_c[0] + (var5 >> 111500136) + param4.a(param2.substring(0, 1 + var7)) + -param4.a((char) var8);
                break L3;
              } else {
                param1.field_c[var7] = var6;
                break L3;
              }
            }
            if (var8 == 62) {
              var6 = -1;
              var7++;
              continue L1;
            } else {
              var7++;
              continue L1;
            }
          }
        }
    }

    private qb() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = new hh();
        field_F = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_L = "Members";
    }
}
