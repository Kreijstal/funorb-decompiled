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
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int stackIn_5_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        var13 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              var5_int = param1.b(param4);
              if (param0 < var5_int) {
                break L1;
              } else {
                if (-1 == param4.indexOf("<br>")) {
                  param2[0] = param4;
                  stackIn_5_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
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
                    incrementValue$0 = var6;
                    var6++;
                    param2[incrementValue$0] = param4.substring(var7, var8).trim();
                    break L4;
                  }
                }
                stackIn_27_0 = var6;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L5: {
                  L6: {
                    var10 = param4.charAt(var9);
                    if ((var10 ^ -1) == -33) {
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
                    incrementValue$1 = var6;
                    var6++;
                    param2[incrementValue$1] = var11;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                if (var10 == 62) {
                  L7: {
                    if (param4.regionMatches(-3 + var9, "<br>", 0, 4)) {
                      incrementValue$2 = var6;
                      var6++;
                      param2[incrementValue$2] = param4.substring(var7, var9 + -3).trim();
                      var7 = 1 + var9;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  var9++;
                  continue L3;
                } else {
                  var9++;
                  continue L3;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var5);

            stackIn_30_1 = new StringBuilder().append("nj.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L8;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');

            if (param2 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L9;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_36_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "null";
              break L10;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "{...}";
              break L10;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_31_0), stackIn_37_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_27_0;
        }
    }

    final int a(byte param0) {
        int var2;
        L0: {
          if (this.field_d) {
            break L0;
          } else {
            L1: {
              if (this.field_p != 2) {
                break L1;
              } else {
                if (-1 <= (this.field_c ^ -1)) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            if ((field_j ^ -1L) != (this.field_r ^ -1L)) {
              L2: {
                if (bi.field_r != 2) {
                  break L2;
                } else {
                  if (!hj.a((byte) -19, this.field_n)) {
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
            String var2 = (String) null;
            nj.a(115, (bd) null, (String[]) null, (byte) -113, (String) null);
        }
        field_e = null;
    }

    nj(boolean param0) {
        this.field_c = ha.field_t;
        this.field_a = mg.field_y;
        if (param0) {
            this.field_k = rc.field_k;
        } else {
            this.field_k = null;
        }
        this.field_r = k.field_d;
        this.field_m = ug.field_b;
        this.field_i = il.field_w;
        this.field_p = ii.field_J;
        this.field_d = eh.field_d;
        this.field_n = oe.field_d;
    }

    static {
        int var0 = 0;
        int var1 = 0;
        field_q = new java.util.zip.CRC32();
        field_b = new double[]{1.0, 0.7, 0.5, 0.3, 0.0, 0.7, 0.7, 0.35, 0.0, 0.0, 0.5, 0.35, 0.25, 0.15, 0.0, 0.3, 0.0, 0.15, 0.3, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
        field_e = new double[25];
        field_h = new double[25];
        field_l = new double[25];
        field_g = true;
        for (var0 = 0; -6 < (var0 ^ -1); var0++) {
            for (var1 = 0; 5 > var1; var1++) {
                field_e[var0 + var1 * 5] = field_b[5 * var1 + -var0 + 4];
                field_l[var1 * 5 + var0] = field_b[20 - (5 * var1 - var0)];
                field_h[var0 - -(var1 * 5)] = field_b[-var0 + 4 + (4 - var1) * 5];
            }
        }
        field_s = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
