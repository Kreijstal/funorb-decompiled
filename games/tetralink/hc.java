/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hc extends mc {
    static int field_p;
    static nk field_v;
    static boolean[] field_u;
    static int[] field_s;
    static char[] field_o;
    static int field_q;
    static String field_r;
    static hl field_n;
    int field_t;

    final static de a(int param0, byte param1, ah param2, int param3, ah param4) {
        if (ia.a(param3, param2, param0, -81)) {
          if (param1 != 74) {
            field_o = null;
            return t.a(false, param4.a(-3, param3, param0));
          } else {
            return t.a(false, param4.a(-3, param3, param0));
          }
        } else {
          return null;
        }
    }

    final static boolean c(int param0) {
        if (param0 == 64) {
          if (qj.c(124)) {
            if (0 != (8 & dh.field_e)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_r = null;
          if (qj.c(124)) {
            if (0 != (8 & dh.field_e)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    public static void a(int param0) {
        field_o = null;
        field_s = null;
        field_r = null;
        int var1 = 17 % ((param0 - -38) / 54);
        field_u = null;
        field_v = null;
        field_n = null;
    }

    final static String a(boolean param0) {
        String var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_8_0 = null;
        String stackIn_9_0 = null;
        String stackOut_7_0 = null;
        L0: {
          var5 = TetraLink.field_J;
          if (!param0) {
            break L0;
          } else {
            String discarded$2 = hc.a(false);
            break L0;
          }
        }
        var1 = "(" + mh.field_g + " " + lk.field_sb + " " + md.field_A + ") " + ua.field_c;
        if (0 < rl.field_d) {
          var1 = var1 + ":";
          var2 = 0;
          L1: while (true) {
            if (var2 < rl.field_d) {
              stackOut_7_0 = var1 + 32;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (var5 == 0) {
                L2: {
                  L3: {
                    var1 = stackIn_9_0;
                    var3 = kb.field_q.field_u[var2] & 255;
                    var4 = var3 >> 1570241892;
                    var3 = var3 & 15;
                    if (-11 < (var4 ^ -1)) {
                      break L3;
                    } else {
                      var4 += 55;
                      if (var5 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var4 += 48;
                  break L2;
                }
                L4: {
                  L5: {
                    if (var3 < 10) {
                      break L5;
                    } else {
                      var3 += 55;
                      if (var5 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var3 += 48;
                  break L4;
                }
                var1 = var1 + (char)var4;
                var1 = var1 + (char)var3;
                var2++;
                continue L1;
              } else {
                return stackIn_8_0;
              }
            } else {
              return var1;
            }
          }
        } else {
          return var1;
        }
    }

    private hc() throws Throwable {
        throw new Error();
    }

    final static void a(int param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        var16 = TetraLink.field_J;
        if (param4 != -32263) {
          boolean discarded$1 = hc.c(-55);
          L0: while (true) {
            param2--;
            if (0 <= param2) {
              var17 = param1;
              var10 = var17;
              var11 = param5;
              var12 = param7;
              var13 = param6;
              var14 = param3;
              var15 = (var17[var11] & 16711422) >> 960723649;
              var10[var11] = pl.a(var14 >> -1494622383, 255) + (pl.a(33423361, var12) >> 1389264257) + (pl.a(var13 >> 149686889, 65280) + var15);
              param7 = param7 + param0;
              param6 = param6 + param8;
              param3 = param3 + param9;
              param5++;
              if (var16 == 0) {
                continue L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          L1: while (true) {
            param2--;
            if (0 <= param2) {
              var17 = param1;
              var10 = var17;
              var11 = param5;
              var12 = param7;
              var13 = param6;
              var14 = param3;
              var15 = (var17[var11] & 16711422) >> 960723649;
              var10[var11] = pl.a(var14 >> -1494622383, 255) + (pl.a(33423361, var12) >> 1389264257) + (pl.a(var13 >> 149686889, 65280) + var15);
              param7 = param7 + param0;
              param6 = param6 + param8;
              param3 = param3 + param9;
              param5++;
              if (var16 == 0) {
                continue L1;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
        field_s = new int[4];
        field_u = new boolean[64];
        field_r = "You need to play 1 more rated game to unlock this option.";
    }
}
