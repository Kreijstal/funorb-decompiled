/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh {
    private gg[] field_f;
    private int field_k;
    String field_j;
    static sk field_g;
    static int field_l;
    private int field_h;
    float field_d;
    private int field_c;
    static int[] field_b;
    static String field_e;
    static ri field_m;
    static float field_i;
    static String field_a;

    final boolean a(int param0) {
        int var3 = 0;
        gg var4 = null;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        L0: while (true) {
          if (((lh) this).field_k >= ((lh) this).field_c) {
            if (param0 <= -90) {
              return true;
            } else {
              ((lh) this).field_j = null;
              return true;
            }
          } else {
            var4 = ((lh) this).field_f[((lh) this).field_k];
            if (!var4.field_d.a((byte) -123)) {
              this.a(0, (byte) 30, var4);
              return false;
            } else {
              L1: {
                if (var4.field_g < 0) {
                  break L1;
                } else {
                  if (!var4.field_d.a(-128, var4.field_g)) {
                    this.a(var4.field_d.a(var4.field_g, (byte) 104), (byte) 30, var4);
                    return false;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (var4.field_a == null) {
                  break L2;
                } else {
                  if (var4.field_d.a(false, var4.field_a)) {
                    break L2;
                  } else {
                    this.a(var4.field_d.a(0, var4.field_a), (byte) 30, var4);
                    return false;
                  }
                }
              }
              L3: {
                if (var4.field_g >= 0) {
                  break L3;
                } else {
                  if (var4.field_a != null) {
                    break L3;
                  } else {
                    if (var4.field_f == null) {
                      break L3;
                    } else {
                      if (var4.field_d.a(0)) {
                        break L3;
                      } else {
                        this.a(var4.field_d.b(0), (byte) 30, var4);
                        return false;
                      }
                    }
                  }
                }
              }
              ((lh) this).field_k = ((lh) this).field_k + 1;
              continue L0;
            }
          }
        }
    }

    public static void a() {
        field_m = null;
        field_b = null;
        field_a = null;
        field_e = null;
        field_g = null;
    }

    final static void a(int param0, ul param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        md var6 = null;
        int[] var7 = null;
        int var8 = 0;
        ga var9 = null;
        int var10 = 0;
        ga var11 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var9 = new ga(param1.a("logo.fo3d", "", false));
            var11 = var9;
            var3 = var11.g(31365);
            var11.k(-1136);
            qh.field_f = bo.a(30816, var11);
            lk.field_G = new int[var3][];
            vn.field_c = new md[var3];
            var4 = 0;
            L1: while (true) {
              if (var4 >= var3) {
                var11.l(-3093);
                var10 = 0;
                var4 = var10;
                var5 = 30;
                L2: while (true) {
                  if (var10 >= var3) {
                    break L0;
                  } else {
                    var6 = vn.field_c[var10];
                    var6.a(6, 1, 6, 6, 2122);
                    var6.a((byte) -102);
                    var7 = new int[]{var6.field_C - -var6.field_D >> 1, var6.field_G + var6.field_l >> 1, var6.field_j + var6.field_r >> 1};
                    lk.field_G[var10] = var7;
                    var6.a(-var7[2], 3, -var7[0], -var7[1]);
                    var10++;
                    continue L2;
                  }
                }
              } else {
                int discarded$1 = -111;
                vn.field_c[var4] = s.a(var9);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var2;
            stackOut_8_1 = new StringBuilder().append("lh.E(").append(-30).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
    }

    final static void a(boolean param0) {
        wn.field_r = bl.a((byte) 41);
        vd.field_c = 0;
    }

    final static String a(byte param0, int param1) {
        return gh.field_f[param1];
    }

    private final void a(int param0, byte param1, gg param2) {
        float var4_float = 0.0f;
        try {
            var4_float = (float)(((lh) this).field_k + 1) + (float)param0 / 100.0f;
            if (param0 != 0) {
                ((lh) this).field_j = param2.field_f + " - " + param0 + "%";
            } else {
                ((lh) this).field_j = param2.field_h;
            }
            ((lh) this).field_d = (float)((lh) this).field_h * var4_float / (float)(1 + ((lh) this).field_c);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "lh.C(" + param0 + 44 + 30 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    private lh() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var2 = 0;
        field_e = "The account name you use to access RuneScape and other Jagex.com games";
        field_b = new int[50];
        double var0 = 6.283185307179586 / (double)field_b.length;
        for (var2 = 0; field_b.length > var2; var2++) {
            field_b[var2] = (int)(48.0 * Math.sin(var0 * (double)var2));
        }
        field_a = "Recharge your powerups even faster than with Nimble Fingers! Equip both for the maximum recharge rate.";
    }
}
