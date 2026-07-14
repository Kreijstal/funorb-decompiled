/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fj extends t {
    static java.math.BigInteger field_F;
    static k field_E;
    int field_C;
    static boolean field_J;
    int field_H;
    int field_I;
    static ad field_B;
    int field_K;
    int field_G;
    int field_D;

    final boolean a(int param0, int param1, int param2, int param3, we param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
          var8 = param1 - ((fj) this).field_I - (((fj) this).field_r + param6);
          var9 = -param0 + (-((fj) this).field_e - ((fj) this).field_C) + param5;
          if (((fj) this).field_G * ((fj) this).field_G > var9 * var9 + var8 * var8) {
            L0: {
              var10 = Math.atan2((double)var9, (double)var8) - rl.field_b;
              if (var10 < 0.0) {
                var10 = var10 - 3.141592653589793 / (double)((fj) this).field_K;
                break L0;
              } else {
                if (var10 <= 0.0) {
                  break L0;
                } else {
                  var10 = var10 + 3.141592653589793 / (double)((fj) this).field_K;
                  ((fj) this).field_D = (int)(var10 * (double)((fj) this).field_K / 6.283185307179586);
                  L1: while (true) {
                    if (((fj) this).field_K <= ((fj) this).field_D) {
                      ((fj) this).field_D = ((fj) this).field_D - ((fj) this).field_K;
                      continue L1;
                    } else {
                      L2: while (true) {
                        if (((fj) this).field_D >= 0) {
                          return true;
                        } else {
                          ((fj) this).field_D = ((fj) this).field_D + ((fj) this).field_K;
                          continue L2;
                        }
                      }
                    }
                  }
                }
              }
            }
            ((fj) this).field_D = (int)(var10 * (double)((fj) this).field_K / 6.283185307179586);
            L3: while (true) {
              if (((fj) this).field_K <= ((fj) this).field_D) {
                ((fj) this).field_D = ((fj) this).field_D - ((fj) this).field_K;
                continue L3;
              } else {
                L4: while (true) {
                  if (((fj) this).field_D >= 0) {
                    return true;
                  } else {
                    ((fj) this).field_D = ((fj) this).field_D + ((fj) this).field_K;
                    continue L4;
                  }
                }
              }
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final static void a(String[] args, String param1, int param2, int param3) {
        int var5 = 0;
        int stackIn_2_0 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        ch.field_d = f.field_i;
        if (255 != param3) {
          if (100 > param3) {
            cg.field_a = lh.a(true, param1, param3);
            if (param2 == -27967) {
              return;
            } else {
              field_F = null;
              return;
            }
          } else {
            if (-106 > (param3 ^ -1)) {
              cg.field_a = lh.a(true, param1, param3);
              if (param2 == -27967) {
                return;
              } else {
                field_F = null;
                return;
              }
            } else {
              cg.field_a = jj.a(args, true);
              if (param2 == -27967) {
                return;
              } else {
                field_F = null;
                return;
              }
            }
          }
        } else {
          L0: {
            stackOut_1_0 = -89;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if ((dd.field_d ^ -1) <= -14) {
              stackOut_3_0 = stackIn_3_0;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L0;
            } else {
              stackOut_2_0 = stackIn_2_0;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L0;
            }
          }
          cg.field_a = hj.a((byte) stackIn_4_0, stackIn_4_1 != 0);
          if (param2 == -27967) {
            return;
          } else {
            field_F = null;
            return;
          }
        }
    }

    private fj() throws Throwable {
        throw new Error();
    }

    public static void c(byte param0) {
        Object var2 = null;
        field_E = null;
        if (param0 != 62) {
          var2 = null;
          fj.a((String[]) null, (String) null, -117, 1);
          field_B = null;
          field_F = null;
          return;
        } else {
          field_B = null;
          field_F = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = new java.math.BigInteger("65537");
    }
}
