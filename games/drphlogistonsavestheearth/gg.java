/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gg {
    private Random field_r;
    static int field_b;
    static int[] field_f;
    static he field_d;
    static int[] field_n;
    private int field_j;
    private int field_e;
    private double field_g;
    int field_o;
    private double field_h;
    static int field_l;
    private int field_c;
    private int[] field_q;
    static int[] field_i;
    private double field_k;
    private double field_m;
    private double field_p;
    private int field_a;

    private final double a() {
        return (double)hi.a(1000, 4, ((gg) this).field_r) / 1000.0;
    }

    public static void b() {
        field_i = null;
        field_f = null;
        field_d = null;
        field_n = null;
    }

    final static void a(int param0, nh[] param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              gl.field_e = param1;
              if (null == gl.field_e) {
                break L1;
              } else {
                if (param1.length < 3) {
                  throw new IllegalArgumentException("");
                } else {
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var2;
            stackOut_7_1 = new StringBuilder().append("gg.D(").append(1000).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
    }

    private final void a(int param0, int param1, boolean param2, int param3, byte param4, int param5, int param6, int param7, double param8) {
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        L0: {
          var16 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (param5 > 5) {
            break L0;
          } else {
            if (param7 < 1) {
              break L0;
            } else {
              L1: {
                if (param4 >= 22) {
                  break L1;
                } else {
                  this.a(50, 43, false, -8, (byte) 104, -89, -59, -100, -0.605813202968837);
                  break L1;
                }
              }
              L2: {
                var11 = (int)((double)param7 * ji.a(65535, param8)) + param1;
                var12 = param6 - -(int)(pj.a(param8, 32768) * (double)param7);
                var13 = hi.a((int)(2.0 * ((gg) this).field_k), 4, ((gg) this).field_r);
                var14 = 126 * param7 / ((gg) this).field_c + 60;
                if (param2) {
                  wj.a(var11 << 4, var12 << 4, param7 << 4, var14, ((gg) this).field_q);
                  wj.a(var11 << 4, var12 << 4, param7 << 3, var14 / 2, ((gg) this).field_q);
                  break L2;
                } else {
                  break L2;
                }
              }
              wj.g(param1, param6, var11, var12, param3);
              wj.g(param1 + 1, param6, var11, var12, param3);
              wj.g(param1, param6 - -1, var11, var12, param3);
              var15 = 0;
              L3: while (true) {
                if (var15 >= var13) {
                  return;
                } else {
                  int discarded$1 = 1769212228;
                  this.a(param0, var11, param2, param3, (byte) 47, 1 + param5, var12, (int)(((gg) this).field_g * (double)param7), param8 + (-0.5 + this.a()) * ((gg) this).field_m);
                  var15++;
                  continue L3;
                }
              }
            }
          }
        }
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param0 == -1093327740) {
          ((gg) this).field_r.setSeed((long)((gg) this).field_o);
          var6 = 255 & param3 >> 8;
          var5 = param3 >> 16;
          var7 = 255 & param3;
          var8 = 0;
          L0: while (true) {
            if (var8 >= 255) {
              L1: {
                if (param2) {
                  wj.a(((gg) this).field_a << 4, ((gg) this).field_j << 4, 2 * ((gg) this).field_c << 4, 254, ((gg) this).field_q);
                  break L1;
                } else {
                  break L1;
                }
              }
              var8 = 0;
              L2: while (true) {
                if (((gg) this).field_e <= var8) {
                  return;
                } else {
                  L3: {
                    if (!param2) {
                      break L3;
                    } else {
                      wj.a(((gg) this).field_a << 4, ((gg) this).field_j << 4, var8 * ((gg) this).field_c << 4, 254 / (1 - -var8), ((gg) this).field_q);
                      break L3;
                    }
                  }
                  L4: {
                    if (!param2) {
                      break L4;
                    } else {
                      wj.a(((gg) this).field_a << 4, ((gg) this).field_j << 4, var8 * ((gg) this).field_c << 4, 196 / (1 - -var8), ((gg) this).field_q);
                      break L4;
                    }
                  }
                  int discarded$1 = 1769212228;
                  this.a(param3, ((gg) this).field_a, param2, param1, (byte) 31, 0, ((gg) this).field_j, ((gg) this).field_c, ((gg) this).field_h + (this.a() - 0.5) * ((gg) this).field_p);
                  var8++;
                  continue L2;
                }
              }
            } else {
              var9 = (int)(Math.pow((double)var8, 1.5) / 16.0);
              ((gg) this).field_q[var8] = li.a(li.a(var9 * var6 >> 8 << 8, var5 * var9 >> 8 << 16), var9 * var7 >> 8);
              var8++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    gg(int param0, int param1, int param2, double param3, double param4, double param5, int param6, double param7, double param8, int param9) {
        ((gg) this).field_r = new Random();
        ((gg) this).field_q = new int[255];
        ((gg) this).field_j = param1;
        ((gg) this).field_k = param7;
        ((gg) this).field_g = param8;
        ((gg) this).field_a = param0;
        ((gg) this).field_c = param2;
        ((gg) this).field_e = param6;
        ((gg) this).field_h = param3;
        ((gg) this).field_m = param5;
        ((gg) this).field_o = param9;
        ((gg) this).field_p = param4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        field_f = new int[256];
        field_n = new int[]{1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0};
        field_l = -1;
        field_i = new int[]{1, 10, 4, 1};
        var1 = 0;
        L0: while (true) {
          if (var1 >= 256) {
            return;
          } else {
            var0 = var1;
            var2 = 0;
            L1: while (true) {
              if (8 <= var2) {
                field_f[var1] = var0;
                var1++;
                continue L0;
              } else {
                if ((var0 & 1) != 1) {
                  var0 = var0 >>> 1;
                  var2++;
                  continue L1;
                } else {
                  var0 = var0 >>> 1 ^ -306674912;
                  var2++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
