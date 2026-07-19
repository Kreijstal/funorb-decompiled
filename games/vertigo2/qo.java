/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qo extends ji {
    private jq[] field_z;
    static nj field_B;
    static lg field_A;
    static er field_y;
    static String field_E;
    static lb field_D;

    public qo() {
        super(0, true);
    }

    public static void b(byte param0) {
        if (param0 > -89) {
            return;
        }
        field_y = null;
        field_E = null;
        field_A = null;
        field_D = null;
        field_B = null;
    }

    final int[][] b(int param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        int[][] var29 = null;
        int[][][] var30 = null;
        int var8 = 0;
        int[] var32 = null;
        int[][] var31 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = Vertigo2.field_L ? 1 : 0;
        int[][] var3 = this.field_v.a(param1, -2);
        if (param0 != -3780) {
            return (int[][]) null;
        }
        if (this.field_v.field_c) {
            var4 = we.field_M;
            var5 = aa.field_Vb;
            var29 = new int[var5][var4];
            var30 = this.field_v.a(0);
            this.a(17989, var29);
            for (var8 = 0; var8 < aa.field_Vb; var8++) {
                var32 = var29[var8];
                var31 = var30[var8];
                var11 = var31[0];
                var12 = var31[1];
                var13 = var31[2];
                for (var14 = 0; we.field_M > var14; var14++) {
                    var15 = var32[var14];
                    var13[var14] = b.a(var15, 255) << -983162300;
                    var12[var14] = b.a(4080, var15 >> -1647127836);
                    var11[var14] = b.a(var15 >> 796373644, 4080);
                }
            }
        }
        return var3;
    }

    final void a(byte param0, int param1, ed param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_16_0 = null;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var7 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 != 0) {
                if (1 != param1) {
                  break L1;
                } else {
                  L2: {
                    stackOut_16_0 = this;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_17_0 = stackOut_16_0;
                    if ((param2.h(-11) ^ -1) != -2) {
                      stackOut_18_0 = this;
                      stackOut_18_1 = 0;
                      stackIn_19_0 = stackOut_18_0;
                      stackIn_19_1 = stackOut_18_1;
                      break L2;
                    } else {
                      stackOut_17_0 = this;
                      stackOut_17_1 = 1;
                      stackIn_19_0 = stackOut_17_0;
                      stackIn_19_1 = stackOut_17_1;
                      break L2;
                    }
                  }
                  ((qo) (this)).field_o = stackIn_19_1 != 0;
                  break L1;
                }
              } else {
                this.field_z = new jq[param2.h(param0 + -121)];
                var4_int = 0;
                L3: while (true) {
                  if (var4_int >= this.field_z.length) {
                    break L1;
                  } else {
                    L4: {
                      var5 = param2.h(-11);
                      var6 = var5;
                      if (var6 != 0) {
                        if (var6 == 1) {
                          this.field_z[var4_int] = (jq) ((Object) ug.a(param2, 46));
                          break L4;
                        } else {
                          if ((var6 ^ -1) == -3) {
                            this.field_z[var4_int] = (jq) ((Object) td.a(false, param2));
                            break L4;
                          } else {
                            if (-4 != (var6 ^ -1)) {
                              break L4;
                            } else {
                              this.field_z[var4_int] = (jq) ((Object) rb.a((byte) 104, param2));
                              break L4;
                            }
                          }
                        }
                      } else {
                        this.field_z[var4_int] = (jq) ((Object) lb.a(param2, (byte) 92));
                        break L4;
                      }
                    }
                    var4_int++;
                    continue L3;
                  }
                }
              }
            }
            L5: {
              if (param0 == 110) {
                break L5;
              } else {
                this.a(12, (int[][]) null);
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var4);
            stackOut_23_1 = new StringBuilder().append("qo.C(").append(param0).append(',').append(param1).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param2 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L6;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L6;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
    }

    final int[] c(int param0, int param1) {
        int[][] discarded$0 = null;
        if (param1 <= 91) {
            discarded$0 = this.b(-13, -62);
        }
        int[] var4 = this.field_x.a(param0, (byte) 98);
        int[] var3 = var4;
        if (this.field_x.field_i) {
            this.a(17989, this.field_x.a(100));
        }
        return var4;
    }

    private final void a(int param0, int[][] param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        jq var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var9 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 17989) {
                break L1;
              } else {
                field_A = (lg) null;
                break L1;
              }
            }
            L2: {
              var3_int = we.field_M;
              var4 = aa.field_Vb;
              eo.a(0, param1);
              ec.a(fk.field_x, 0, rm.field_z, 0, (byte) -16);
              if (this.field_z != null) {
                var5 = 0;
                L3: while (true) {
                  if (this.field_z.length <= var5) {
                    break L2;
                  } else {
                    L4: {
                      var6 = this.field_z[var5];
                      var7 = var6.field_g;
                      var8 = var6.field_a;
                      if (var7 < 0) {
                        if (var8 < 0) {
                          break L4;
                        } else {
                          var6.a(var4, var3_int, 45);
                          break L4;
                        }
                      } else {
                        if (-1 < (var8 ^ -1)) {
                          var6.a(var4, (byte) -117, var3_int);
                          break L4;
                        } else {
                          var6.b(var3_int, (byte) 124, var4);
                          break L4;
                        }
                      }
                    }
                    var5++;
                    continue L3;
                  }
                }
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var3);
            stackOut_15_1 = new StringBuilder().append("qo.B(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
    }

    static {
        field_E = "You cannot chat to <%0> because <%0> is offline in your friend list.";
        field_B = new nj();
    }
}
