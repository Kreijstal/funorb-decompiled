/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rm extends ji {
    static int field_z;
    static String field_E;
    private int field_C;
    private int field_D;
    static int field_B;
    static int field_y;
    static byte[] field_A;

    final int[] c(int param0, int param1) {
        int[] var3;
        int[] var4;
        int var5;
        int var6;
        int var7;
        int var9;
        int var10;
        int var8;
        var9 = Vertigo2.field_L ? 1 : 0;
        if (param1 >= 91) {
          L0: {
            var3 = this.field_x.a(param0, (byte) 60);
            if (!this.field_x.field_i) {
              break L0;
            } else {
              L1: {
                var5 = we.field_M / this.field_C;
                var6 = aa.field_Vb / this.field_D;
                if (0 < var6) {
                  var7 = param0 % var6;
                  var4 = this.a(0, -1, var7 * aa.field_Vb / var6);
                  break L1;
                } else {
                  var4 = this.a(0, -1, 0);
                  break L1;
                }
              }
              var10 = 0;
              var7 = var10;
              L2: while (true) {
                if (var10 >= we.field_M) {
                  break L0;
                } else {
                  if (-1 > (var5 ^ -1)) {
                    var8 = var10 % var5;
                    var3[var10] = var4[we.field_M * var8 / var5];
                    var10++;
                    continue L2;
                  } else {
                    var3[var10] = var4[0];
                    var10++;
                    continue L2;
                  }
                }
              }
            }
          }
          return var3;
        } else {
          return (int[]) null;
        }
    }

    final static boolean a(byte param0, long param1, String param2) {
        tp var4 = null;
        RuntimeException var4_ref = null;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4 = vo.a(param2, 0);
              if (var4 == null) {
                break L1;
              } else {
                if (null != var4.field_Lb) {
                  stackIn_4_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param0 < -122) {
                break L2;
              } else {
                field_E = (String) null;
                break L2;
              }
            }
            L3: {
              L4: {
                if (null == gd.field_j) {
                  break L4;
                } else {
                  if (null == eq.a(param1, (byte) 102)) {
                    break L4;
                  } else {
                    stackIn_11_0 = 1;
                    break L3;
                  }
                }
              }
              stackIn_11_0 = 0;
              break L3;
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var4_ref);

            stackIn_14_1 = new StringBuilder().append("rm.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    final static void a(byte param0, java.awt.Component param1) {
        param1.removeKeyListener(kb.field_a);
        if (param0 >= -73) {
            return;
        }
        try {
            param1.removeFocusListener(kb.field_a);
            fh.field_w = -1;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "rm.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void g(int param0) {
        field_A = null;
        field_E = null;
        if (param0 != 16145) {
            rm.g(-113);
        }
    }

    final void a(byte param0, int param1, ed param2) {
        int var4_int = 0;
        int var5 = 0;
        ed var6 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 110) {
                break L1;
              } else {
                var6 = (ed) null;
                this.a((byte) 114, 100, (ed) null);
                break L1;
              }
            }
            L2: {
              var4_int = param1;
              if (var4_int != 0) {
                if (1 == var4_int) {
                  this.field_D = param2.h(-11);
                  break L2;
                } else {
                  break L2;
                }
              } else {
                this.field_C = param2.h(param0 + -121);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var4);

            stackIn_12_1 = new StringBuilder().append("rm.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    final int[][] b(int param0, int param1) {
        int[][] var3;
        int[][] var4;
        int var5;
        int var6;
        int var7_int;
        int[] var7;
        int[] var8;
        int[] var9;
        int[] var10;
        int[] var11;
        int[] var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int[][] var17;
        int[][] var18;
        int[][] var19;
        L0: {
          var16 = Vertigo2.field_L ? 1 : 0;
          var19 = this.field_v.a(param1, -2);
          var18 = var19;
          var17 = var18;
          var3 = var17;
          if (!this.field_v.field_c) {
            break L0;
          } else {
            L1: {
              var5 = we.field_M / this.field_C;
              var6 = aa.field_Vb / this.field_D;
              if (0 < var6) {
                var7_int = param1 % var6;
                var4 = this.c(0, 3, var7_int * aa.field_Vb / var6);
                break L1;
              } else {
                var4 = this.c(0, param0 + 3783, 0);
                break L1;
              }
            }
            var7 = var4[0];
            var8 = var4[1];
            var9 = var4[2];
            var10 = var19[0];
            var11 = var19[1];
            var12 = var19[2];
            var13 = 0;
            L2: while (true) {
              if (var13 >= we.field_M) {
                break L0;
              } else {
                L3: {
                  if ((var5 ^ -1) >= -1) {
                    var14 = 0;
                    break L3;
                  } else {
                    var15 = var13 % var5;
                    var14 = var15 * we.field_M / var5;
                    break L3;
                  }
                }
                var10[var13] = var7[var14];
                var11[var13] = var8[var14];
                var12[var13] = var9[var14];
                var13++;
                continue L2;
              }
            }
          }
        }
        if (param0 == -3780) {
          return var17;
        } else {
          return (int[][]) null;
        }
    }

    public rm() {
        super(1, false);
        this.field_D = 4;
        this.field_C = 4;
    }

    final static void b(byte param0) {
        int var1 = -81 % ((47 - param0) / 34);
        if (lo.field_k != null) {
            lo.field_k.b(0);
            lo.field_k = null;
        }
    }

    static {
        field_A = new byte[]{(byte)2, (byte)8, (byte)4};
        field_E = "You can join this game";
    }
}
