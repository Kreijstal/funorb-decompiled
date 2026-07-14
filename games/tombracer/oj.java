/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class oj extends jea {
    private int field_yb;
    static String field_zb;
    private jea field_Bb;
    private jea field_wb;
    static String field_vb;
    private jea field_Ab;
    private jea field_ub;
    private jea field_xb;
    private jea field_Cb;
    static boolean[] field_tb;

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        jea var14 = null;
        jea var15 = null;
        jea var16 = null;
        jea var17 = null;
        jea var18 = null;
        jea var19 = null;
        jea stackIn_14_0 = null;
        jea stackIn_14_1 = null;
        jea stackIn_14_2 = null;
        jea stackIn_15_0 = null;
        jea stackIn_15_1 = null;
        jea stackIn_15_2 = null;
        jea stackIn_16_0 = null;
        jea stackIn_16_1 = null;
        jea stackIn_16_2 = null;
        int stackIn_16_3 = 0;
        jea stackOut_13_0 = null;
        jea stackOut_13_1 = null;
        jea stackOut_13_2 = null;
        jea stackOut_15_0 = null;
        jea stackOut_15_1 = null;
        jea stackOut_15_2 = null;
        int stackOut_15_3 = 0;
        jea stackOut_14_0 = null;
        jea stackOut_14_1 = null;
        jea stackOut_14_2 = null;
        int stackOut_14_3 = 0;
        L0: {
          if (((oj) this).field_t < ((oj) this).field_G * 2) {
            var6 = ((oj) this).field_t / 2;
            var5 = ((oj) this).field_t / 2;
            break L0;
          } else {
            var5 = ((oj) this).field_G;
            var6 = -((oj) this).field_G + ((oj) this).field_t;
            break L0;
          }
        }
        L1: {
          var7 = var6 - var5;
          var8 = var7;
          if (param1 > 0) {
            L2: {
              var8 = var8 * param0 / param1;
              if (var8 >= ((oj) this).field_G) {
                break L2;
              } else {
                var8 = ((oj) this).field_G;
                break L2;
              }
            }
            if (var8 <= var7) {
              break L1;
            } else {
              var8 = var7;
              break L1;
            }
          } else {
            break L1;
          }
        }
        L3: {
          var9 = -param0 + param1;
          var10 = var7 + -var8;
          if (param2 <= -60) {
            break L3;
          } else {
            field_tb = null;
            break L3;
          }
        }
        L4: {
          var11 = 0;
          if (0 >= var9) {
            break L4;
          } else {
            var11 = (param3 * var10 - -(var9 / 2)) / var9;
            break L4;
          }
        }
        L5: {
          var12 = var11 - -(var8 / 2);
          var14 = ((oj) this).field_Cb;
          var14.field_t = var5;
          var14.field_T = 0;
          var14.field_G = ((oj) this).field_G;
          var14.field_qb = 0;
          var15 = ((oj) this).field_Bb;
          var15.field_G = ((oj) this).field_G;
          var15.field_T = var6;
          var15.field_t = ((oj) this).field_t + -var6;
          var15.field_qb = 0;
          var16 = ((oj) this).field_ub;
          var16.field_G = ((oj) this).field_G;
          var16.field_t = var7;
          var16.field_T = var5;
          var16.field_qb = 0;
          var17 = ((oj) this).field_Ab;
          var17.field_t = var12;
          var17.field_qb = 0;
          var17.field_G = ((oj) this).field_G;
          var17.field_T = 0;
          var18 = ((oj) this).field_xb;
          var18.field_t = var7 + -var12;
          var18.field_T = var12;
          var18.field_G = ((oj) this).field_G;
          var18.field_qb = 0;
          var19 = ((oj) this).field_wb;
          var19.field_G = ((oj) this).field_G;
          var19.field_qb = 0;
          stackOut_13_0 = ((oj) this).field_Cb;
          stackOut_13_1 = ((oj) this).field_Bb;
          stackOut_13_2 = ((oj) this).field_ub;
          stackIn_15_0 = stackOut_13_0;
          stackIn_15_1 = stackOut_13_1;
          stackIn_15_2 = stackOut_13_2;
          stackIn_14_0 = stackOut_13_0;
          stackIn_14_1 = stackOut_13_1;
          stackIn_14_2 = stackOut_13_2;
          if (param1 <= param0) {
            stackOut_15_0 = (jea) (Object) stackIn_15_0;
            stackOut_15_1 = (jea) (Object) stackIn_15_1;
            stackOut_15_2 = (jea) (Object) stackIn_15_2;
            stackOut_15_3 = 0;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            stackIn_16_2 = stackOut_15_2;
            stackIn_16_3 = stackOut_15_3;
            break L5;
          } else {
            stackOut_14_0 = (jea) (Object) stackIn_14_0;
            stackOut_14_1 = (jea) (Object) stackIn_14_1;
            stackOut_14_2 = (jea) (Object) stackIn_14_2;
            stackOut_14_3 = 1;
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_16_2 = stackOut_14_2;
            stackIn_16_3 = stackOut_14_3;
            break L5;
          }
        }
        stackIn_16_2.field_X = stackIn_16_3 != 0;
        stackIn_16_1.field_X = stackIn_16_3 != 0;
        stackIn_16_0.field_X = stackIn_16_3 != 0;
        var19.field_T = var11;
        var19.field_t = var8;
    }

    final static boolean i(int param0) {
        long var1 = 0L;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = TombRacer.field_G ? 1 : 0;
          var1 = bva.b((byte) -107);
          if (param0 == -1) {
            break L0;
          } else {
            field_tb = null;
            break L0;
          }
        }
        var3 = -vaa.field_b + var1;
        if (-30001L > (var3 ^ -1L)) {
          vaa.field_b = var1;
          gp.field_h = 0;
          return true;
        } else {
          L1: {
            var5 = 3000;
            if ((gp.field_h ^ -1) <= -8) {
              var5 = 12000;
              break L1;
            } else {
              if (gp.field_h < 5) {
                if (gp.field_h < 3) {
                  break L1;
                } else {
                  var5 = 6000;
                  break L1;
                }
              } else {
                var5 = 9000;
                break L1;
              }
            }
          }
          if ((long)var5 >= var3) {
            return false;
          } else {
            gp.field_h = gp.field_h + 1;
            vaa.field_b = var1;
            return true;
          }
        }
    }

    final boolean h(int param0) {
        if (param0 != -1) {
            boolean discarded$0 = oj.i(3);
        }
        return -1 != (((oj) this).field_wb.field_E ^ -1) ? true : false;
    }

    final int a(boolean param0, byte param1, int param2, int param3) {
        int var8 = 0;
        int var9 = 0;
        int var5 = 0;
        int var7 = 87 / ((param1 - -53) / 38);
        int var6 = ((oj) this).field_ub.field_t + -((oj) this).field_wb.field_t;
        if (0 < var6) {
            var8 = ((oj) this).field_wb.field_T;
            var9 = param3 - param2;
            var5 = (var8 * var9 + var6 / 2) / var6;
        }
        if (param0) {
            if (!(-1 >= (var5 ^ -1))) {
                var5 = 0;
            }
            // if_icmple L136
            var5 = param3 + -param2;
        } else {
            if (!(-param2 + param3 >= var5)) {
                var5 = -param2 + param3;
            }
            if (0 > var5) {
                var5 = 0;
            }
        }
        return var5;
    }

    oj(long param0, oj param1) {
        this(param0, param1.field_Cb, param1.field_Bb, param1.field_Ab, param1.field_wb);
    }

    final boolean f(int param0) {
        if (0 != ((oj) this).field_Ab.field_y) {
            ((oj) this).field_yb = 20;
            return true;
        }
        if (((oj) this).field_Ab.field_E != param0) {
            if (!(0 >= ((oj) this).field_yb)) {
                ((oj) this).field_yb = ((oj) this).field_yb - 1;
            }
            if (-1 == ((oj) this).field_yb) {
                if (sta.field_B < ((oj) this).field_wb.field_K + ((oj) this).field_wb.field_A) {
                    ((oj) this).field_yb = 3;
                    return true;
                }
            }
        }
        return false;
    }

    final boolean e(byte param0) {
        if (!(((oj) this).field_Cb.field_y == 0)) {
            ((oj) this).field_yb = 20;
            return true;
        }
        if (!(((oj) this).field_Cb.field_E == 0)) {
            if (!(0 >= ((oj) this).field_yb)) {
                ((oj) this).field_yb = ((oj) this).field_yb - 1;
            }
            if (((oj) this).field_yb == 0) {
                ((oj) this).field_yb = 3;
                return true;
            }
        }
        if (param0 >= -75) {
            boolean discarded$0 = oj.i(98);
            return false;
        }
        return false;
    }

    final boolean d(byte param0) {
        if (param0 != 40) {
            return true;
        }
        if (!(0 == ((oj) this).field_Bb.field_y)) {
            ((oj) this).field_yb = 20;
            return true;
        }
        if (-1 == ((oj) this).field_Bb.field_E) {
            return false;
        }
        if (!(-1 >= ((oj) this).field_yb)) {
            ((oj) this).field_yb = ((oj) this).field_yb - 1;
        }
        if (!(-1 != (((oj) this).field_yb ^ -1))) {
            ((oj) this).field_yb = 3;
            return true;
        }
        return false;
    }

    public static void a(boolean param0) {
        if (param0) {
            field_vb = null;
        }
        field_vb = null;
        field_zb = null;
        field_tb = null;
    }

    final static int a(byte param0, ica param1) {
        if (param0 >= 68) {
          if (ln.field_F != param1) {
            if (iw.field_c != param1) {
              if (r.field_m != param1) {
                if (jv.field_m == param1) {
                  return 260;
                } else {
                  if (param1 == gq.field_w) {
                    return 34023;
                  } else {
                    throw new IllegalArgumentException();
                  }
                }
              } else {
                return 34165;
              }
            } else {
              return 8448;
            }
          } else {
            return 7681;
          }
        } else {
          return 109;
        }
    }

    final boolean g(int param0) {
        int var2 = 6 / ((1 - param0) / 41);
        if (((oj) this).field_xb.field_y != -1) {
            ((oj) this).field_yb = 20;
            return true;
        }
        if (-1 != ((oj) this).field_xb.field_E) {
            if (-1 > (((oj) this).field_yb ^ -1)) {
                ((oj) this).field_yb = ((oj) this).field_yb - 1;
            }
            if (((oj) this).field_yb == 0) {
                if (sta.field_B < ((oj) this).field_wb.field_A - -((oj) this).field_wb.field_K - (-((oj) this).field_wb.field_t - ((oj) this).field_wb.field_O)) {
                    return false;
                }
                ((oj) this).field_yb = 3;
                return true;
            }
        }
        return false;
    }

    final void a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6, int param7) {
        ((oj) this).field_t = param5;
        ((oj) this).field_T = param7;
        if (param3) {
            boolean discarded$0 = ((oj) this).h(78);
        }
        ((oj) this).field_qb = param4;
        ((oj) this).field_G = param2;
        ((oj) this).a(param6, param0, (byte) -87, param1);
    }

    oj(long param0, jea param1, jea param2, jea param3, jea param4) {
        super(param0, (jea) null);
        ((oj) this).field_Cb = new jea(0L, param1);
        ((oj) this).field_Bb = new jea(0L, param2);
        ((oj) this).b(-123, ((oj) this).field_Cb);
        ((oj) this).b(-124, ((oj) this).field_Bb);
        ((oj) this).field_ub = new jea(0L, (jea) null);
        ((oj) this).b(-128, ((oj) this).field_ub);
        ((oj) this).field_Ab = new jea(0L, param3);
        ((oj) this).field_xb = new jea(0L, param3);
        jea var9 = ((oj) this).field_Ab;
        jea var10 = var9;
        ((oj) this).field_xb.field_eb = true;
        var10.field_eb = true;
        ((oj) this).field_ub.b(-124, ((oj) this).field_Ab);
        ((oj) this).field_ub.b(-122, ((oj) this).field_xb);
        ((oj) this).field_wb = new jea(0L, param4);
        ((oj) this).field_wb.field_F = true;
        ((oj) this).field_ub.b(-123, ((oj) this).field_wb);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        String var0 = "Unknown";
        try {
            var0 = System.getProperty("java.vendor").toLowerCase();
        } catch (Exception exception) {
        }
        String discarded$0 = var0.toLowerCase();
        var0 = "Unknown";
        try {
            var0 = System.getProperty("java.version").toLowerCase();
        } catch (Exception exception) {
        }
        String discarded$1 = var0.toLowerCase();
        var0 = "Unknown";
        try {
            var0 = System.getProperty("os.name").toLowerCase();
        } catch (Exception exception) {
        }
        field_vb = var0.toLowerCase();
        var0 = "Unknown";
        try {
            var0 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception exception) {
        }
        field_zb = var0.toLowerCase();
        var0 = "Unknown";
        try {
            var0 = System.getProperty("os.version").toLowerCase();
        } catch (Exception exception) {
        }
        String discarded$2 = var0.toLowerCase();
        var0 = "~/";
        try {
            var0 = System.getProperty("user.home").toLowerCase();
        } catch (Exception exception) {
        }
        File discarded$3 = new File(var0);
        field_tb = new boolean[112];
    }
}
