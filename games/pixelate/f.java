/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class f implements eb {
    private int field_h;
    private int field_e;
    private int field_r;
    private int field_b;
    private int field_k;
    private int field_m;
    static int field_o;
    static String field_i;
    private int field_l;
    static bb field_c;
    private jl field_g;
    static int[] field_d;
    static int[] field_f;
    static al field_a;
    static int[] field_p;
    static String field_j;
    static int field_q;
    static boolean field_n;

    public final void a(ng param0, byte param1, int param2, int param3, boolean param4) {
        int discarded$1 = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        si var14 = null;
        ng stackIn_3_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        ng stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              if (param0 instanceof si) {
                stackOut_2_0 = (ng) (param0);
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = null;
                stackIn_3_0 = (ng) ((Object) stackOut_1_0);
                break L1;
              }
            }
            L2: {
              var14 = (si) ((Object) stackIn_3_0);
              if (var14 == null) {
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              t.d(param3 - -param0.field_z, param2 - -param0.field_p, param0.field_E, param0.field_C, this.field_m);
              if (param1 == -124) {
                break L3;
              } else {
                this.field_h = -106;
                break L3;
              }
            }
            L4: {
              var7 = param3 - (-param0.field_z + -var14.field_O);
              var8 = var14.field_R + param0.field_p + param2;
              t.c(var7, var8, var14.field_N, this.field_k);
              if (var14.field_Q == -1) {
                break L4;
              } else {
                var9 = 3.141592653589793 * (double)var14.field_Q * 2.0 / (double)var14.field_V;
                var11 = (int)(-Math.sin(var9) * (double)var14.field_N);
                var12 = (int)(Math.cos(var9) * (double)var14.field_N);
                t.c(var11 + var7, var8 - -var12, 1, this.field_h);
                break L4;
              }
            }
            L5: {
              t.c(var7, var8, 2, 1);
              var9 = 2.0 * (3.141592653589793 * (double)var14.field_T) / (double)var14.field_V;
              var11 = (int)(-Math.sin(var9) * (double)var14.field_N);
              var12 = (int)(Math.cos(var9) * (double)var14.field_N);
              t.b(var7, var8, var7 - -var11, var12 + var8, 1);
              if (null != this.field_g) {
                var13 = this.field_e + (var14.field_N + var14.field_O);
                discarded$1 = this.field_g.a(param0.field_q, var13 + param3 - -param0.field_z, this.field_b + (param0.field_p + param2), -var13 - (this.field_e - param0.field_E), param0.field_C - (this.field_e << 119772897), this.field_r, this.field_l, 1, 1, 0);
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
            stackOut_12_0 = (RuntimeException) (var6);
            stackOut_12_1 = new StringBuilder().append("f.A(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L6;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L6;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void b(int param0) {
        ck[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        ck var3 = null;
        int var4 = 0;
        ck[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var5 = jm.field_d;
            var1 = var5;
            var2 = param0;
            L1: while (true) {
              if (var2 >= var5.length) {
                break L0;
              } else {
                var3 = var5[var2];
                var3.b(param0 + -26338);
                var2++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1_ref), "f.C(" + param0 + ')');
        }
    }

    final static boolean a(CharSequence param0, byte param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var4 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            if (!we.a(param2, 5832, param0)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1 < -60) {
                  break L1;
                } else {
                  field_q = 36;
                  break L1;
                }
              }
              var3_int = 0;
              L2: while (true) {
                if (param0.length() <= var3_int) {
                  stackOut_13_0 = 1;
                  stackIn_14_0 = stackOut_13_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (oh.a(param0.charAt(var3_int), -67)) {
                    var3_int++;
                    continue L2;
                  } else {
                    stackOut_10_0 = 0;
                    stackIn_11_0 = stackOut_10_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var3);
            stackOut_15_1 = new StringBuilder().append("f.D(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            return stackIn_14_0 != 0;
          }
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        field_i = null;
        if (param0 != -26570) {
            field_j = (String) null;
            field_c = null;
            field_f = null;
            field_j = null;
            field_p = null;
            return;
        }
        field_c = null;
        field_f = null;
        field_j = null;
        field_p = null;
    }

    f(jl param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
            this.field_l = param4;
            this.field_h = param6;
            this.field_g = param0;
            this.field_e = param1;
            this.field_b = param2;
            this.field_m = param7;
            this.field_k = param5;
            this.field_r = param3;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "f.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
        $cfr$clinit: {
            int var0 = 0;
            int var1 = 0;
            int var2 = 0;
            field_i = "No spectators";
            field_c = new bb();
            field_d = new int[4];
            field_f = new int[768];
            var0 = 0;
            L0: while (true) {
              if (field_f.length <= var0) {
                field_j = "Playing";
                field_n = true;
                break $cfr$clinit;
              } else {
                var1 = var0 % 256;
                var2 = -var1 + 255;
                if (256 <= var0) {
                  if (-513 >= (var0 ^ -1)) {
                    field_f[var0] = bq.a(bq.a(65280, var2), var0 << 31618832);
                    var0++;
                    continue L0;
                  } else {
                    field_f[var0] = bq.a(var0 << -351410360, bq.a(255, var2 << -1530448624));
                    var0++;
                    continue L0;
                  }
                } else {
                  field_f[var0] = bq.a(bq.a(-1560215808, var2) << 1331838824, var0);
                  var0++;
                  continue L0;
                }
              }
            }
        }
    }
}
