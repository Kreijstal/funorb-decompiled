/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class aq {
    static int field_a;
    static String field_c;
    static String field_b;

    final static String a(String param0, int param1, String param2, int param3) {
        int var6 = 0;
        im var8 = null;
        pc var9 = null;
        im var10 = null;
        pc var11 = null;
        CharSequence var12 = null;
        var12 = (CharSequence) (Object) param0;
        if (ai.a((byte) -128, var12)) {
          if (2 == gk.field_db) {
            if (param3 == -20867) {
              var10 = fh.a(param2, 114);
              if (var10 == null) {
                return sd.a(ug.field_p, param3 + 20935, new String[1]);
              } else {
                var10.c(param3 ^ -23386);
                var10.e(param3 + 20884);
                aj.field_t = aj.field_t - 1;
                var11 = aa.field_f;
                var11.g(param1, 15514);
                var11.field_m = var11.field_m + 1;
                var6 = var11.field_m;
                var11.e(160, 3);
                var11.b((byte) -41, param0);
                var11.f(var11.field_m + -var6, -1);
                return null;
              }
            } else {
              aq.a((byte) 117);
              var8 = fh.a(param2, 114);
              if (var8 == null) {
                return sd.a(ug.field_p, param3 + 20935, new String[1]);
              } else {
                var8.c(param3 ^ -23386);
                var8.e(param3 + 20884);
                aj.field_t = aj.field_t - 1;
                var9 = aa.field_f;
                var9.g(param1, 15514);
                var9.field_m = var9.field_m + 1;
                var6 = var9.field_m;
                var9.e(160, 3);
                var9.b((byte) -41, param0);
                var9.f(var9.field_m + -var6, -1);
                return null;
              }
            }
          } else {
            return ok.field_b;
          }
        } else {
          return qn.field_n;
        }
    }

    final static void a(boolean param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        var5 = Pixelate.field_H ? 1 : 0;
        var1 = 8;
        if (param0) {
          jm.field_g = new int[var1];
          var2 = 0;
          L0: while (true) {
            if (var1 > var2) {
              jm.field_g[var2] = var2;
              var2++;
              continue L0;
            } else {
              var6 = 1;
              var2 = var6;
              L1: while (true) {
                if (var1 <= var6) {
                  L2: {
                    ko.field_hb = 0;
                    stackOut_18_0 = jm.field_g[ko.field_hb];
                    stackIn_20_0 = stackOut_18_0;
                    stackIn_19_0 = stackOut_18_0;
                    if (param0) {
                      stackOut_20_0 = stackIn_20_0;
                      stackOut_20_1 = 0;
                      stackIn_21_0 = stackOut_20_0;
                      stackIn_21_1 = stackOut_20_1;
                      break L2;
                    } else {
                      stackOut_19_0 = stackIn_19_0;
                      stackOut_19_1 = 1;
                      stackIn_21_0 = stackOut_19_0;
                      stackIn_21_1 = stackOut_19_1;
                      break L2;
                    }
                  }
                  aq.a(stackIn_21_0, stackIn_21_1 != 0);
                  return;
                } else {
                  var3 = var6 + ok.a(ea.field_b, -109, var1 + -var6);
                  var4 = jm.field_g[var6];
                  jm.field_g[var6] = jm.field_g[var3];
                  jm.field_g[var3] = var4;
                  var6++;
                  continue L1;
                }
              }
            }
          }
        } else {
          aq.a(false);
          jm.field_g = new int[var1];
          var2 = 0;
          L3: while (true) {
            if (var1 > var2) {
              jm.field_g[var2] = var2;
              var2++;
              continue L3;
            } else {
              var6 = 1;
              var2 = var6;
              L4: while (true) {
                if (var1 <= var6) {
                  L5: {
                    ko.field_hb = 0;
                    stackOut_6_0 = jm.field_g[ko.field_hb];
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (param0) {
                      stackOut_8_0 = stackIn_8_0;
                      stackOut_8_1 = 0;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      break L5;
                    } else {
                      stackOut_7_0 = stackIn_7_0;
                      stackOut_7_1 = 1;
                      stackIn_9_0 = stackOut_7_0;
                      stackIn_9_1 = stackOut_7_1;
                      break L5;
                    }
                  }
                  aq.a(stackIn_9_0, stackIn_9_1 != 0);
                  return;
                } else {
                  var3 = var6 + ok.a(ea.field_b, -109, var1 + -var6);
                  var4 = jm.field_g[var6];
                  jm.field_g[var6] = jm.field_g[var3];
                  jm.field_g[var3] = var4;
                  var6++;
                  continue L4;
                }
              }
            }
          }
        }
    }

    final static int a(byte param0, int param1) {
        int var2 = 0;
        var2 = 0;
        if (-1 >= (param1 ^ -1)) {
          if (param1 < 65536) {
            L0: {
              if ((param1 ^ -1) > -257) {
                break L0;
              } else {
                param1 = param1 >>> 8;
                var2 += 8;
                break L0;
              }
            }
            L1: {
              if (16 <= param1) {
                var2 += 4;
                param1 = param1 >>> 4;
                break L1;
              } else {
                break L1;
              }
            }
            if (param0 <= 5) {
              return -101;
            } else {
              L2: {
                if (-5 < (param1 ^ -1)) {
                  break L2;
                } else {
                  var2 += 2;
                  param1 = param1 >>> 2;
                  break L2;
                }
              }
              L3: {
                if (param1 > -2) {
                  break L3;
                } else {
                  var2++;
                  param1 = param1 >>> 1;
                  break L3;
                }
              }
              return param1 + var2;
            }
          } else {
            L4: {
              param1 = param1 >>> 16;
              var2 += 16;
              if ((param1 ^ -1) > -257) {
                break L4;
              } else {
                param1 = param1 >>> 8;
                var2 += 8;
                break L4;
              }
            }
            L5: {
              if (16 <= param1) {
                var2 += 4;
                param1 = param1 >>> 4;
                break L5;
              } else {
                break L5;
              }
            }
            if (param0 <= 5) {
              return -101;
            } else {
              L6: {
                if (-5 < (param1 ^ -1)) {
                  break L6;
                } else {
                  var2 += 2;
                  param1 = param1 >>> 2;
                  break L6;
                }
              }
              L7: {
                if (param1 > -2) {
                  break L7;
                } else {
                  var2++;
                  param1 = param1 >>> 1;
                  break L7;
                }
              }
              return param1 + var2;
            }
          }
        } else {
          L8: {
            param1 = param1 >>> 16;
            var2 += 16;
            if ((param1 ^ -1) > -257) {
              break L8;
            } else {
              param1 = param1 >>> 8;
              var2 += 8;
              break L8;
            }
          }
          L9: {
            if (16 <= param1) {
              var2 += 4;
              param1 = param1 >>> 4;
              break L9;
            } else {
              break L9;
            }
          }
          if (param0 <= 5) {
            return -101;
          } else {
            L10: {
              if (-5 < (param1 ^ -1)) {
                break L10;
              } else {
                var2 += 2;
                param1 = param1 >>> 2;
                break L10;
              }
            }
            L11: {
              if (param1 > -2) {
                break L11;
              } else {
                var2++;
                param1 = param1 >>> 1;
                break L11;
              }
            }
            return param1 + var2;
          }
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_c = null;
        int var1 = 17 / ((param0 - 13) / 60);
    }

    final static void a(int param0, boolean param1) {
        rg.field_e = rj.field_C[param0];
        fq.field_o = null;
        if (param1) {
          return;
        } else {
          ci.field_o = param0;
          hn.field_d = 0;
          dg.a(param0 + 2, (byte) -100);
          return;
        }
    }

    final static boolean a(char param0, CharSequence param1, byte param2) {
        int var3 = 0;
        if (!vf.a((byte) -3, param0)) {
          return false;
        } else {
          if (param1 != null) {
            if (param2 < -38) {
              var3 = param1.length();
              if (-13 < (var3 ^ -1)) {
                if (ii.a((byte) 125, param0)) {
                  if (0 != var3) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "This game has been updated! Please reload this page.";
        field_c = "You do not have a suitable number of players for the current options.";
    }
}
