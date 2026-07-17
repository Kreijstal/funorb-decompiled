/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.lang.String;

final class aq {
    static int field_a;
    static String field_c;
    static String field_b;

    final static String a(String param0, int param1, String param2) {
        RuntimeException var4 = null;
        pc var5 = null;
        int var6 = 0;
        im var7 = null;
        CharSequence var8 = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_8_0 = null;
        Object stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_9_0 = null;
        String stackOut_7_0 = null;
        String stackOut_4_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            var8 = (CharSequence) (Object) param0;
            if (ai.a((byte) -128, var8)) {
              if (2 == gk.field_db) {
                var7 = fh.a(param2, 114);
                if (var7 != null) {
                  var7.c(2779);
                  var7.e(17);
                  aj.field_t = aj.field_t - 1;
                  var5 = aa.field_f;
                  var5.g(param1, 15514);
                  var5.field_m = var5.field_m + 1;
                  var6 = var5.field_m;
                  var5.e(160, 3);
                  var5.b((byte) -41, param0);
                  var5.f(var5.field_m + -var6, -1);
                  stackOut_9_0 = null;
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  stackOut_7_0 = sd.a(ug.field_p, 68, new String[1]);
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                }
              } else {
                stackOut_4_0 = ok.field_b;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = qn.field_n;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("aq.D(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          L2: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44).append(param1).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + -20867 + 41);
        }
        return (String) (Object) stackIn_10_0;
    }

    final static void a(boolean param0) {
        int var1_int = 0;
        int var2 = 0;
        int var6 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = Pixelate.field_H ? 1 : 0;
        try {
            var1_int = 8;
            if (!param0) {
                aq.a(false);
            }
            jm.field_g = new int[var1_int];
            for (var2 = 0; var1_int > var2; var2++) {
                jm.field_g[var2] = var2;
            }
            var6 = 1;
            var2 = var6;
            while (var1_int > var6) {
                var3 = var6 + ok.a(ea.field_b, -109, var1_int + -var6);
                var4 = jm.field_g[var6];
                jm.field_g[var6] = jm.field_g[var3];
                jm.field_g[var3] = var4;
                var6++;
            }
            ko.field_hb = 0;
            aq.a(jm.field_g[ko.field_hb], !param0 ? true : false);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "aq.C(" + param0 + 41);
        }
    }

    final static int a(byte param0, int param1) {
        int var2 = 0;
        var2 = 0;
        if (param1 >= 0) {
          if (param1 < 65536) {
            L0: {
              if (param1 < 256) {
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
                if (param1 < 4) {
                  break L2;
                } else {
                  var2 += 2;
                  param1 = param1 >>> 2;
                  break L2;
                }
              }
              L3: {
                if (param1 < 1) {
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
              if (param1 < 256) {
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
                if (param1 < 4) {
                  break L6;
                } else {
                  var2 += 2;
                  param1 = param1 >>> 2;
                  break L6;
                }
              }
              L7: {
                if (param1 < 1) {
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
            if (param1 < 256) {
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
              if (param1 < 4) {
                break L10;
              } else {
                var2 += 2;
                param1 = param1 >>> 2;
                break L10;
              }
            }
            L11: {
              if (param1 < 1) {
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

    public static void a() {
        field_b = null;
        field_c = null;
        int var1 = 17;
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

    final static boolean a(char param0, CharSequence param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            if (!vf.a((byte) -3, param0)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              if (param1 != null) {
                var3_int = param1.length();
                if (var3_int < 12) {
                  L1: {
                    if (!ii.a((byte) 125, param0)) {
                      break L1;
                    } else {
                      if (0 != var3_int) {
                        break L1;
                      } else {
                        stackOut_13_0 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        return stackIn_14_0 != 0;
                      }
                    }
                  }
                  stackOut_15_0 = 1;
                  stackIn_16_0 = stackOut_15_0;
                  break L0;
                } else {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0 != 0;
                }
              } else {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var3;
            stackOut_17_1 = new StringBuilder().append("aq.A(").append(param0).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L2;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + -117 + 41);
        }
        return stackIn_16_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "This game has been updated! Please reload this page.";
        field_c = "You do not have a suitable number of players for the current options.";
    }
}
