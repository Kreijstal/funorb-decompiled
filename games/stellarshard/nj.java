/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class nj {
    private long field_r;
    private String field_n;
    int field_a;
    static int[] field_f;
    private boolean field_d;
    int field_i;
    String field_m;
    static java.util.zip.CRC32 field_q;
    int field_p;
    int[] field_k;
    private int field_c;
    static double[] field_b;
    static boolean field_g;
    static double[] field_e;
    private static long field_j;
    static double[] field_h;
    static hl field_o;
    static double[] field_l;
    static String field_s;

    final static int a(int param0, bd param1, String[] param2, byte param3, String param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        int stackIn_5_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_21_0 = 0;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var13 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              var5_int = param1.b(param4);
              if (param0 < var5_int) {
                break L1;
              } else {
                if (-1 == param4.indexOf("<br>")) {
                  param2[0] = (String) (Object) param2;
                  stackOut_4_0 = 1;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              var6 = (param0 + var5_int + -1) / param0;
              param0 = var5_int / var6;
              var6 = 0;
              var7 = 0;
              var8 = param4.length();
              if (param3 < -127) {
                break L2;
              } else {
                field_j = -93L;
                break L2;
              }
            }
            var9 = 0;
            L3: while (true) {
              if (var9 >= var8) {
                L4: {
                  if (var7 >= var8) {
                    break L4;
                  } else {
                    int incrementValue$2 = var6;
                    var6++;
                    param2[incrementValue$2] = param4.substring(var7, var8).trim();
                    break L4;
                  }
                }
                stackOut_21_0 = var6;
                stackIn_22_0 = stackOut_21_0;
                break L0;
              } else {
                L5: {
                  L6: {
                    var10 = param4.charAt(var9);
                    if (var10 == 32) {
                      break L6;
                    } else {
                      if (var10 != 45) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var11 = param4.substring(var7, 1 + var9).trim();
                  var12 = param1.b(var11);
                  if (param0 <= var12) {
                    var7 = var9 + 1;
                    int incrementValue$3 = var6;
                    var6++;
                    param2[incrementValue$3] = var11;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L7: {
                  if (var10 != 62) {
                    break L7;
                  } else {
                    break L7;
                  }
                }
                var9++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var5;
            stackOut_23_1 = new StringBuilder().append("nj.B(").append(param0).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L8;
            }
          }
          L9: {
            stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param2 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L9;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L9;
            }
          }
          L10: {
            stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',').append(param3).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param4 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L10;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L10;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + ')');
        }
        return stackIn_22_0;
    }

    final int a(byte param0) {
        int var2 = 0;
        L0: {
          if (((nj) this).field_d) {
            break L0;
          } else {
            L1: {
              if (((nj) this).field_p != 2) {
                break L1;
              } else {
                if (((nj) this).field_c <= 0) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            if (~field_j != ~((nj) this).field_r) {
              L2: {
                if (bi.field_r != 2) {
                  break L2;
                } else {
                  if (!hj.a((byte) -19, ((nj) this).field_n)) {
                    break L2;
                  } else {
                    return 1;
                  }
                }
              }
              var2 = 53 % ((44 - param0) / 41);
              return 0;
            } else {
              return 1;
            }
          }
        }
        return 2;
    }

    public static void a(int param0) {
        field_h = null;
        field_f = null;
        field_s = null;
        field_q = null;
        field_l = null;
        field_o = null;
        field_b = null;
        if (param0 >= -6) {
            Object var2 = null;
            int discarded$0 = nj.a(115, (bd) null, (String[]) null, (byte) -113, (String) null);
        }
        field_e = null;
    }

    nj(boolean param0) {
        ((nj) this).field_c = ha.field_t;
        ((nj) this).field_a = mg.field_y;
        if (param0) {
            ((nj) this).field_k = rc.field_k;
        } else {
            ((nj) this).field_k = null;
        }
        ((nj) this).field_r = k.field_d;
        ((nj) this).field_m = ug.field_b;
        ((nj) this).field_i = il.field_w;
        ((nj) this).field_p = ii.field_J;
        ((nj) this).field_d = eh.field_d;
        ((nj) this).field_n = oe.field_d;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        field_q = new java.util.zip.CRC32();
        field_b = new double[]{1.0, 0.7, 0.5, 0.3, 0.0, 0.7, 0.7, 0.35, 0.0, 0.0, 0.5, 0.35, 0.25, 0.15, 0.0, 0.3, 0.0, 0.15, 0.3, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
        field_e = new double[25];
        field_h = new double[25];
        field_l = new double[25];
        field_g = true;
        var0 = 0;
        L0: while (true) {
          if (var0 >= 5) {
            field_s = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
            return;
          } else {
            var1 = 0;
            L1: while (true) {
              if (5 <= var1) {
                var0++;
                continue L0;
              } else {
                field_e[var0 + var1 * 5] = field_b[5 * var1 + -var0 + 4];
                field_l[var1 * 5 + var0] = field_b[20 - (5 * var1 - var0)];
                field_h[var0 - -(var1 * 5)] = field_b[-var0 + 4 + (4 - var1) * 5];
                var1++;
                continue L1;
              }
            }
          }
        }
    }
}
