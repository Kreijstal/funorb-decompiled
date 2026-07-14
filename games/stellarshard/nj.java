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
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var13 = stellarshard.field_B;
          var5 = param1.b(param4);
          if (param0 < var5) {
            break L0;
          } else {
            if (-1 == param4.indexOf("<br>")) {
              param2[0] = (String) (Object) param2;
              return 1;
            } else {
              break L0;
            }
          }
        }
        L1: {
          var6 = (param0 + var5 + -1) / param0;
          param0 = var5 / var6;
          var6 = 0;
          var7 = 0;
          var8 = param4.length();
          if (param3 < -127) {
            break L1;
          } else {
            field_j = -93L;
            break L1;
          }
        }
        var9 = 0;
        L2: while (true) {
          if (var9 >= var8) {
            L3: {
              if (var7 >= var8) {
                break L3;
              } else {
                var6++;
                param2[var6] = param4.substring(var7, var8).trim();
                break L3;
              }
            }
            return var6;
          } else {
            L4: {
              L5: {
                var10 = param4.charAt(var9);
                if (var10 == 32) {
                  break L5;
                } else {
                  if (var10 != 45) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              var11 = param4.substring(var7, 1 + var9).trim();
              var12 = param1.b(var11);
              if (param0 <= var12) {
                var7 = var9 + 1;
                var6++;
                param2[var6] = var11;
                break L4;
              } else {
                break L4;
              }
            }
            if (var10 == 62) {
              if (param4.regionMatches(-3 + var9, "<br>", 0, 4)) {
                var6++;
                param2[var6] = param4.substring(var7, var9 + -3).trim();
                var7 = 1 + var9;
                var9++;
                continue L2;
              } else {
                var9++;
                continue L2;
              }
            } else {
              var9++;
              continue L2;
            }
          }
        }
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
                if (-1 <= (((nj) this).field_c ^ -1)) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            if ((field_j ^ -1L) != (((nj) this).field_r ^ -1L)) {
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
          if (-6 >= (var0 ^ -1)) {
            field_s = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
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
