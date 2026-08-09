/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class go extends am {
    private int field_t;
    private int field_u;
    static String field_v;
    static boolean[] field_s;
    static int field_x;
    static double[] field_w;

    final int[][] a(int param0, int param1) {
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
          var16 = Torquing.field_u;
          if (param0 == -29116) {
            break L0;
          } else {
            this.a((byte) 7, -3);
            break L0;
          }
        }
        L1: {
          var19 = this.field_r.a(15142, param1);
          var18 = var19;
          var17 = var18;
          var3 = var17;
          if (this.field_r.field_b) {
            L2: {
              var5 = ci.field_c / this.field_u;
              var6 = um.field_o / this.field_t;
              if (0 >= var6) {
                var4 = this.c(24066, 0, 0);
                break L2;
              } else {
                var7_int = param1 % var6;
                var4 = this.c(param0 + 53182, var7_int * um.field_o / var6, 0);
                break L2;
              }
            }
            var7 = var4[0];
            var8 = var4[1];
            var9 = var4[2];
            var10 = var19[0];
            var11 = var19[1];
            var12 = var19[2];
            var13 = 0;
            L3: while (true) {
              if (var13 >= ci.field_c) {
                break L1;
              } else {
                L4: {
                  if (0 >= var5) {
                    var14 = 0;
                    break L4;
                  } else {
                    var15 = var13 % var5;
                    var14 = ci.field_c * var15 / var5;
                    break L4;
                  }
                }
                var10[var13] = var7[var14];
                var11[var13] = var8[var14];
                var12[var13] = var9[var14];
                var13++;
                continue L3;
              }
            }
          } else {
            break L1;
          }
        }
        return var17;
    }

    public static void c(int param0) {
        field_w = null;
        if (param0 <= 59) {
            field_v = (String) null;
        }
        field_v = null;
        field_s = null;
    }

    final static void b(int param0) {
        na.field_G = null;
        if (param0 != 0) {
            return;
        }
        vo.field_b = null;
        cq.field_y = null;
        pn.field_b = (byte[][]) null;
        fj.field_o = null;
        ij.field_o = null;
    }

    final void a(fj param0, int param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = Torquing.field_u;
        try {
          L0: {
            L1: {
              var4_int = param2;
              if (-1 != (var4_int ^ -1)) {
                if ((var4_int ^ -1) == -2) {
                  this.field_t = param0.i((byte) -101);
                  break L1;
                } else {
                  break L1;
                }
              } else {
                this.field_u = param0.i((byte) -101);
                break L1;
              }
            }
            L2: {
              if (param1 == 35) {
                break L2;
              } else {
                field_v = (String) null;
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

            stackIn_12_1 = new StringBuilder().append("go.H(");

            if (param0 == null) {
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
          throw rb.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public go() {
        super(1, false);
        this.field_u = 4;
        this.field_t = 4;
    }

    final int[] a(byte param0, int param1) {
        int[] var3;
        int[] var4;
        int var5;
        int var6;
        int var7;
        int var9;
        int var10;
        int var8;
        L0: {
          var9 = Torquing.field_u;
          if (param0 >= 86) {
            break L0;
          } else {
            this.field_u = 7;
            break L0;
          }
        }
        L1: {
          var3 = this.field_l.a(param1, 25657);
          if (!this.field_l.field_b) {
            break L1;
          } else {
            L2: {
              var5 = ci.field_c / this.field_u;
              var6 = um.field_o / this.field_t;
              if ((var6 ^ -1) >= -1) {
                var4 = this.b(0, 0, 0);
                break L2;
              } else {
                var7 = param1 % var6;
                var4 = this.b(0, 0, var7 * um.field_o / var6);
                break L2;
              }
            }
            var10 = 0;
            var7 = var10;
            L3: while (true) {
              if (var10 >= ci.field_c) {
                break L1;
              } else {
                if (-1 > (var5 ^ -1)) {
                  var8 = var10 % var5;
                  var3[var10] = var4[ci.field_c * var8 / var5];
                  var10++;
                  continue L3;
                } else {
                  var3[var10] = var4[0];
                  var10++;
                  continue L3;
                }
              }
            }
          }
        }
        return var3;
    }

    final static he a(boolean param0, java.applet.Applet param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        he[] var3 = null;
        int var4 = 0;
        he var5 = null;
        int var6 = 0;
        he stackIn_4_0 = null;
        he stackIn_9_0 = null;
        he stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = Torquing.field_u;
        try {
          L0: {
            var2 = nb.a("jagex-last-login-method", param1, (byte) -118);
            if (var2 == null) {
              stackIn_4_0 = jf.field_c;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var3 = ji.b(21169);
              var4 = 0;
              L1: while (true) {
                if (var3.length <= var4) {
                  L2: {
                    if (!param0) {
                      break L2;
                    } else {
                      go.b(104);
                      break L2;
                    }
                  }
                  stackIn_14_0 = jf.field_c;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var5 = var3[var4];
                  if (!var5.b(0, var2)) {
                    var4++;
                    continue L1;
                  } else {
                    stackIn_9_0 = (he) (var5);
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
            var2_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var2_ref);

            stackIn_17_1 = new StringBuilder().append("go.L(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return stackIn_14_0;
          }
        }
    }

    static {
        field_v = "Email: ";
        field_w = new double[8];
    }
}
