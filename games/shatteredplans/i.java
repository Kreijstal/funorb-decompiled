/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class i implements iq {
    private int field_j;
    private int field_h;
    private int field_m;
    static pf field_n;
    private nq field_d;
    private int field_i;
    private int field_k;
    static qr field_g;
    static Calendar field_e;
    private int field_l;
    static String field_f;
    static boolean field_c;
    private int field_b;
    static String field_a;

    final static boolean c(int param0) {
        if (param0 != 0) {
            return true;
        }
        return k.field_b;
    }

    final static void a(byte param0, String param1, long param2) {
        RuntimeException runtimeException = null;
        CharSequence var5 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              gi.field_a = param1;
              em.field_h = 2;
              var5 = (CharSequence) ((Object) param1);
              nd.field_k = ji.a(var5, true);
              hd.field_k = param2;
              bo.r(0);
              if (param0 >= 15) {
                break L1;
              } else {
                field_e = (Calendar) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("i.B(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param2 + ')');
        }
    }

    final static boolean a(int param0) {
        if (param0 != 1) {
            i.a(-46, -90, 61, -9, 124, 49);
        }
        return el.field_b;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int incrementValue$1 = 0;
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        RuntimeException decompiledCaughtException = null;
        var12 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if ((param2 ^ -1) <= -1) {
                break L1;
              } else {
                param1 = param1 + param2;
                param2 = 0;
                break L1;
              }
            }
            L2: {
              if (param5 >= 0) {
                break L2;
              } else {
                param0 = param0 + param5;
                param5 = 0;
                break L2;
              }
            }
            L3: {
              if (param2 + param1 > gf.field_k) {
                param1 = gf.field_k + -param2;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var7 = -116 % ((-62 - param4) / 53);
              if (param5 - -param0 > gf.field_b) {
                param0 = gf.field_b - param5;
                break L4;
              } else {
                break L4;
              }
            }
            var6_int = param1 + param2;
            var8 = param2;
            L5: while (true) {
              if (var8 >= var6_int) {
                break L0;
              } else {
                var9 = var8 * gf.field_b - -param5;
                var10 = param0;
                L6: while (true) {
                  if (var10 <= 0) {
                    var8++;
                    continue L5;
                  } else {
                    param1 = gf.field_h[var9];
                    var11 = 65793 * param3;
                    param2 = param1 + var11;
                    var11 = (16711935 & var11) - -(16711935 & param1);
                    param1 = (65536 & -var11 + param2) + (16777472 & var11);
                    incrementValue$1 = var9;
                    var9++;
                    gf.field_h[incrementValue$1] = ee.a(-(param1 >>> 2010402984) + param1, param2 - param1);
                    var10--;
                    continue L6;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var6), "i.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void b(int param0) {
        field_f = null;
        field_a = null;
        field_g = null;
        field_n = null;
        if (param0 != 16711935) {
            field_f = (String) null;
        }
        field_e = null;
    }

    public final void a(vg param0, int param1, boolean param2, int param3, byte param4) {
        boolean discarded$2 = false;
        int discarded$3 = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        rp var14 = null;
        vg stackIn_3_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        vg stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (param0 instanceof rp) {
                stackOut_2_0 = (vg) (param0);
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = null;
                stackIn_3_0 = (vg) ((Object) stackOut_1_0);
                break L1;
              }
            }
            L2: {
              var14 = (rp) ((Object) stackIn_3_0);
              if (var14 != null) {
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              gf.d(param1 - -param0.field_m, param3 - -param0.field_q, param0.field_x, param0.field_n, this.field_b);
              var7 = param1 + (param0.field_m - -var14.field_M);
              var8 = var14.field_L + param0.field_q + param3;
              gf.g(var7, var8, var14.field_E, this.field_l);
              if (-1 != var14.field_D) {
                var9 = (double)var14.field_D * 3.141592653589793 * 2.0 / (double)var14.field_F;
                var11 = (int)(-Math.sin(var9) * (double)var14.field_E);
                var12 = (int)(Math.cos(var9) * (double)var14.field_E);
                gf.g(var7 - -var11, var12 + var8, 1, this.field_m);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param4 == 12) {
                break L4;
              } else {
                discarded$2 = i.a(-18);
                break L4;
              }
            }
            L5: {
              gf.g(var7, var8, 2, 1);
              var9 = 3.141592653589793 * (double)var14.field_H * 2.0 / (double)var14.field_F;
              var11 = (int)(-Math.sin(var9) * (double)var14.field_E);
              var12 = (int)(Math.cos(var9) * (double)var14.field_E);
              gf.g(var7, var8, var11 + var7, var12 + var8, 1);
              if (this.field_d != null) {
                var13 = this.field_h + var14.field_E + var14.field_M;
                discarded$3 = this.field_d.a(param0.field_s, var13 + param1 - -param0.field_m, param3 + (param0.field_q - -this.field_j), -var13 - (this.field_h - param0.field_x), -(this.field_h << -653177503) + param0.field_n, this.field_i, this.field_k, 1, 1, 0);
                break L5;
              } else {
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var6);
            stackOut_13_1 = new StringBuilder().append("i.E(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    i(nq param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
            this.field_i = param3;
            this.field_j = param2;
            this.field_d = param0;
            this.field_l = param5;
            this.field_h = param1;
            this.field_k = param4;
            this.field_b = param7;
            this.field_m = param6;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "i.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
        field_n = new pf();
        field_c = false;
        field_f = "Select a friendly system to anchor one end of the Tannhäuser wormhole, or right click to cancel this project.";
        field_e = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
}
