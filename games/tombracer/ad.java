/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad extends vg {
    static String field_i;
    static String field_h;
    int field_f;
    private int field_g;
    static TombRacer field_j;
    private int field_k;

    final boolean a(byte param0) {
        if (param0 < -62) {
          if (((ad) this).field_k <= jba.field_j) {
            if (((ad) this).field_k - -64 >= jba.field_j) {
              if (sta.field_B >= ((ad) this).field_g) {
                if (sta.field_B > 64 + ((ad) this).field_g) {
                  return false;
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
        } else {
          ((ad) this).field_k = -99;
          if (((ad) this).field_k <= jba.field_j) {
            if (((ad) this).field_k - -64 >= jba.field_j) {
              if (sta.field_B >= ((ad) this).field_g) {
                if (sta.field_B > 64 + ((ad) this).field_g) {
                  return false;
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

    public static void b(int param0) {
        int var1 = -85;
        field_i = null;
        field_h = null;
        field_j = null;
    }

    ad(int param0, int param1, int param2) {
        this(param1, param2);
        ((ad) this).field_f = param0;
    }

    final boolean a(int param0) {
        if (param0 != -64) {
            return true;
        }
        return ((ad) this).field_f == -1 ? true : false;
    }

    final static up a(byte param0, kh param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        up var4 = null;
        Object var5 = null;
        up stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        up stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var2_int = param1.b((byte) 44, 4);
              if (param0 == 87) {
                break L1;
              } else {
                var5 = null;
                up discarded$2 = ad.a((byte) -125, (kh) null);
                break L1;
              }
            }
            var3 = param1.b((byte) 44, 10);
            var4 = new up(var2_int, var3);
            stackOut_2_0 = (up) var4;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("ad.E(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    final static boolean a(int param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int[] stackIn_6_0 = null;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_4_0 = null;
        int stackOut_12_0 = 0;
        int stackOut_9_0 = 0;
        int[] stackOut_5_0 = null;
        int stackOut_2_0 = 0;
        var3 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            if (param0 == -13545) {
              stackOut_4_0 = bca.field_a;
              stackIn_6_0 = stackOut_4_0;
              L1: while (true) {
                if (stackIn_6_0.length <= var2_int) {
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  break L0;
                } else {
                  if (param1 == bca.field_a[var2_int]) {
                    stackOut_9_0 = 1;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0 != 0;
                  } else {
                    var2_int++;
                    stackOut_5_0 = bca.field_a;
                    stackIn_6_0 = stackOut_5_0;
                    continue L1;
                  }
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "ad.B(" + param0 + 44 + param1 + 41);
        }
        return stackIn_13_0 != 0;
    }

    final void a(byte param0, boolean param1) {
        int var3 = 0;
        int var4_int = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        nh[] var7 = null;
        ha var8 = null;
        String var9 = null;
        String var10 = null;
        String stackIn_6_0 = null;
        String stackIn_12_0 = null;
        String stackOut_11_0 = null;
        String stackOut_10_0 = null;
        String stackOut_5_0 = null;
        String stackOut_4_0 = null;
        var5 = -38 / ((32 - param0) / 33);
        var8 = tga.field_a;
        var4_int = ((ad) this).field_k;
        var6 = ((ad) this).field_g;
        var7 = dr.field_a;
        tra.a(1, var7, (byte) -96, var4_int, var8, 64, 1, 64, var6, 0);
        tga.field_a.KA(((ad) this).field_k, ((ad) this).field_g, ((ad) this).field_k + 64, -3 + ((ad) this).field_g - -64);
        if (!((ad) this).a(-64)) {
          L0: {
            fa.field_a[((ad) this).field_f].a(((ad) this).field_k, ((ad) this).field_g);
            tga.field_a.la();
            var3 = 2431750;
            if (!param1) {
              break L0;
            } else {
              var3 = 10309393;
              break L0;
            }
          }
          L1: {
            if (((ad) this).a(-64)) {
              stackOut_11_0 = "";
              stackIn_12_0 = stackOut_11_0;
              break L1;
            } else {
              stackOut_10_0 = la.field_m[((ad) this).field_f];
              stackIn_12_0 = stackOut_10_0;
              break L1;
            }
          }
          var9 = stackIn_12_0;
          var4 = var9;
          int discarded$2 = be.a(var9.toUpperCase(), 1, qf.field_j, var3, 0, 64, 1, 40 + ((ad) this).field_g, -10 + ((ad) this).field_k, -1, (byte) 60, 84);
          return;
        } else {
          L2: {
            nc.field_e.a(((ad) this).field_k, ((ad) this).field_g);
            tga.field_a.la();
            var3 = 2431750;
            if (!param1) {
              break L2;
            } else {
              var3 = 10309393;
              break L2;
            }
          }
          L3: {
            if (((ad) this).a(-64)) {
              stackOut_5_0 = "";
              stackIn_6_0 = stackOut_5_0;
              break L3;
            } else {
              stackOut_4_0 = la.field_m[((ad) this).field_f];
              stackIn_6_0 = stackOut_4_0;
              break L3;
            }
          }
          var10 = stackIn_6_0;
          var4 = var10;
          int discarded$3 = be.a(var10.toUpperCase(), 1, qf.field_j, var3, 0, 64, 1, 40 + ((ad) this).field_g, -10 + ((ad) this).field_k, -1, (byte) 60, 84);
          return;
        }
    }

    ad(int param0, int param1) {
        ((ad) this).field_f = -1;
        ((ad) this).field_k = -2 + param0 - -uca.field_c.a(4, 0);
        ((ad) this).field_g = -5 + (uca.field_c.a(10, 0) + param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Completed";
        field_h = "<%0> wants to draw.";
    }
}
