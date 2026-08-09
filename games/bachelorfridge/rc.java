/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rc extends k {
    static String field_k;
    static kv field_l;

    final int[] a(int param0, int param1) {
        int[] var3;
        int[] var4;
        int var5;
        int var6;
        int[] var7;
        var6 = BachelorFridge.field_y;
        var7 = this.field_j.a(param0, -1);
        var3 = var7;
        if (this.field_j.field_m) {
          var4 = this.a(0, param0, (byte) 120);
          var5 = 0;
          L0: while (true) {
            if (hh.field_d <= var5) {
              if (param1 != 0) {
                return (int[]) null;
              } else {
                return var3;
              }
            } else {
              var7[var5] = 4096 - var4[var5];
              var5++;
              continue L0;
            }
          }
        } else {
          if (param1 != 0) {
            return (int[]) null;
          } else {
            return var3;
          }
        }
    }

    public static void d(int param0) {
        field_l = null;
        if (param0 != -2) {
            return;
        }
        field_k = null;
    }

    public rc() {
        super(1, false);
    }

    final static sba a(vr param0, byte param1, vr param2, String param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        sba stackIn_2_0 = null;
        sba stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 113) {
              var5_int = param2.a(param4, false);
              var6 = param2.a((byte) 6, var5_int, param3);
              stackIn_4_0 = ev.a(128, var6, param2, param0, var5_int);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (sba) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("rc.K(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param4 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_8_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final void a(byte param0, lu param1, int param2) {
        RuntimeException runtimeException = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -71) {
              L1: {
                if (-1 != (param2 ^ -1)) {
                  break L1;
                } else {
                  L2: {
                    stackIn_5_0 = this;

                    if (-2 != (param1.b(16711935) ^ -1)) {
                      stackIn_6_0 = this;
                      stackIn_6_1 = 0;
                      break L2;
                    } else {
                      stackIn_6_0 = this;
                      stackIn_6_1 = 1;
                      break L2;
                    }
                  }
                  ((rc) (this)).field_f = stackIn_6_1 != 0;
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (runtimeException);

            stackIn_10_1 = new StringBuilder().append("rc.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final int[][] a(boolean param0, int param1) {
        int[][] var3;
        int[] var8;
        int[] var9;
        int[] var10;
        int var11;
        int var12;
        int[][] var13;
        int[][] var15;
        int[][] var20;
        int[] var21;
        int[] var22;
        int[] var23;
        int[] var25;
        int[] var26;
        int[] var27;
        int[][] var32;
        int[][] var33;
        int[] var34;
        int[] var35;
        int[] var36;
        var12 = BachelorFridge.field_y;
        if (!param0) {
          var20 = this.field_h.a(param1, -858);
          var15 = var20;
          var13 = var15;
          var3 = var13;
          if (this.field_h.field_b) {
            var33 = this.a((byte) -91, 0, param1);
            var34 = var33[0];
            var35 = var33[1];
            var36 = var33[2];
            var8 = var20[0];
            var9 = var20[1];
            var10 = var20[2];
            var11 = 0;
            L0: while (true) {
              if (hh.field_d > var11) {
                var8[var11] = -var34[var11] + 4096;
                var9[var11] = -var35[var11] + 4096;
                var10[var11] = -var36[var11] + 4096;
                var11++;
                continue L0;
              } else {
                return var13;
              }
            }
          } else {
            return var13;
          }
        } else {
          field_l = (kv) null;
          var20 = this.field_h.a(param1, -858);
          var15 = var20;
          var13 = var15;
          var3 = var13;
          if (this.field_h.field_b) {
            var32 = this.a((byte) -91, 0, param1);
            var25 = var32[0];
            var21 = var25;
            var26 = var32[1];
            var22 = var26;
            var27 = var32[2];
            var23 = var27;
            var8 = var20[0];
            var9 = var20[1];
            var10 = var20[2];
            var11 = 0;
            L1: while (true) {
              if (hh.field_d > var11) {
                var8[var11] = -var25[var11] + 4096;
                var9[var11] = -var26[var11] + 4096;
                var10[var11] = -var27[var11] + 4096;
                var11++;
                continue L1;
              } else {
                return var13;
              }
            }
          } else {
            return var13;
          }
        }
    }

    static {
        field_k = "Achievements";
    }
}
