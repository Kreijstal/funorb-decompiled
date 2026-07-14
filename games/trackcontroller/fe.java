/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fe extends rh {
    int field_I;
    static String field_J;
    static int field_L;
    int field_M;
    int field_S;
    int field_R;
    static long field_N;
    static int field_Q;
    static long field_P;
    int field_K;
    int field_O;

    final static void a(bh param0, int param1) {
        qc.field_e.b((wh) (Object) param0);
        if (param1 != 2) {
            Object var3 = null;
            fe.a(-87, (kk) null);
        }
    }

    public static void j(int param0) {
        field_J = null;
        if (param0 > -85) {
            Object var2 = null;
            fe.a(126, (kk) null);
        }
    }

    final static void a(boolean param0, wb param1, int param2) {
        kg.a(param0, (byte) 116, param2, param1);
    }

    final boolean a(al param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = TrackController.field_F ? 1 : 0;
        if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
          L0: {
            var8 = -((fe) this).field_p + -param5 - (((fe) this).field_S - param2);
            var9 = -param6 - ((fe) this).field_m + (-((fe) this).field_R + param1);
            if (((fe) this).field_I * ((fe) this).field_I <= var8 * var8 + var9 * var9) {
              break L0;
            } else {
              L1: {
                var10 = Math.atan2((double)var9, (double)var8) - md.field_a;
                if (0.0 > var10) {
                  var10 = var10 - 3.141592653589793 / (double)((fe) this).field_M;
                  break L1;
                } else {
                  if (var10 > 0.0) {
                    var10 = var10 + 3.141592653589793 / (double)((fe) this).field_M;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              ((fe) this).field_O = (int)((double)((fe) this).field_M * var10 / 6.283185307179586);
              L2: while (true) {
                if (((fe) this).field_M > ((fe) this).field_O) {
                  L3: while (true) {
                    if (((fe) this).field_O >= 0) {
                      break L0;
                    } else {
                      ((fe) this).field_O = ((fe) this).field_O + ((fe) this).field_M;
                      continue L3;
                    }
                  }
                } else {
                  ((fe) this).field_O = ((fe) this).field_O - ((fe) this).field_M;
                  continue L2;
                }
              }
            }
          }
          return true;
        } else {
          return false;
        }
    }

    private fe() throws Throwable {
        throw new Error();
    }

    final static void a(int param0, kk param1) {
        int var3 = 0;
        int var4 = 0;
        pf var5 = null;
        int[] var6 = null;
        int var7 = 0;
        Object var8 = null;
        la var9 = null;
        int var10 = 0;
        la var11 = null;
        L0: {
          var7 = TrackController.field_F ? 1 : 0;
          var9 = new la(param1.a("logo.fo3d", -1, ""));
          var11 = var9;
          var3 = var11.h(param0 + -13961);
          var11.h((byte) 31);
          lg.field_d = hb.a(12, var11);
          if (param0 == 30344) {
            break L0;
          } else {
            var8 = null;
            fe.a(true, (wb) null, -7);
            break L0;
          }
        }
        ef.field_a = new pf[var3];
        kc.field_c = new int[var3][];
        var4 = 0;
        L1: while (true) {
          if (var4 >= var3) {
            var11.g((byte) -106);
            var10 = 0;
            var4 = var10;
            L2: while (true) {
              if (var10 >= var3) {
                return;
              } else {
                var5 = ef.field_a[var10];
                var5.a(6, 1, (byte) 117, 6, 6);
                var5.b(param0 + -15642);
                var6 = new int[]{var5.field_u + var5.field_i >> -212251327, var5.field_p + var5.field_n >> 387824097, var5.field_k + var5.field_w >> 1111945537};
                kc.field_c[var10] = var6;
                var5.a(-var6[2], (byte) 123, -var6[0], -var6[1]);
                var10++;
                continue L2;
              }
            }
          } else {
            ef.field_a[var4] = sf.a(var9, false);
            var4++;
            continue L1;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = "This password is part of your Player Name, and would be easy to guess";
        field_L = 0;
    }
}
