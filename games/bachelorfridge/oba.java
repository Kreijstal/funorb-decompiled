/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oba extends k {
    private boolean field_k;
    private boolean field_l;

    final int[][] a(boolean param0, int param1) {
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        int[][] var3;
        int[] var5;
        int[] var6;
        int[] var7;
        int[] var8;
        int[] var9;
        int[] var10;
        int var11;
        int var12;
        int[][] var13;
        int[][] var15;
        int[] var16;
        int[] var17;
        int[] var18;
        int[][] var20;
        int[] var21;
        int[] var22;
        int[] var23;
        int[][] var25;
        L0: {
          var12 = BachelorFridge.field_y;
          var20 = this.field_h.a(param1, -858);
          var15 = var20;
          var13 = var15;
          var3 = var13;
          if (this.field_h.field_b) {
            L1: {
              stackIn_4_0 = this;

              stackIn_4_1 = -80;

              stackIn_4_2 = 0;

              if (this.field_l) {
                stackIn_5_0 = this;
                stackIn_5_1 = stackIn_4_1;
                stackIn_5_2 = stackIn_4_2;
                stackIn_5_3 = -param1 + it.field_r;
                break L1;
              } else {
                stackIn_5_0 = this;
                stackIn_5_1 = stackIn_4_1;
                stackIn_5_2 = stackIn_4_2;
                stackIn_5_3 = param1;
                break L1;
              }
            }
            var25 = this.a((byte) stackIn_5_1, stackIn_5_2, stackIn_5_3);
            var21 = var25[0];
            var16 = var21;
            var5 = var16;
            var22 = var25[1];
            var17 = var22;
            var6 = var17;
            var23 = var25[2];
            var18 = var23;
            var7 = var18;
            var8 = var20[0];
            var9 = var20[1];
            var10 = var20[2];
            if (this.field_k) {
              var11 = 0;
              L2: while (true) {
                if (hh.field_d <= var11) {
                  break L0;
                } else {
                  var8[var11] = var5[wp.field_r + -var11];
                  var9[var11] = var6[-var11 + wp.field_r];
                  var10[var11] = var7[-var11 + wp.field_r];
                  var11++;
                  continue L2;
                }
              }
            } else {
              var11 = 0;
              L3: while (true) {
                if (var11 >= hh.field_d) {
                  break L0;
                } else {
                  var8[var11] = var21[var11];
                  var9[var11] = var22[var11];
                  var10[var11] = var23[var11];
                  var11++;
                  continue L3;
                }
              }
            }
          } else {
            break L0;
          }
        }
        if (!param0) {
          return var3;
        } else {
          return (int[][]) null;
        }
    }

    public oba() {
        super(1, false);
        this.field_k = true;
        this.field_l = true;
    }

    final static void d(int param0) {
        int var1 = pfa.c(26858);
        int var2 = bv.a((byte) -71);
        if (param0 != -1488922239) {
            return;
        }
        it.field_s.a(var2 + (lda.field_a << -1488922239), 56, -fh.field_v + io.field_p, ql.field_s + -lda.field_a, var1 + (fh.field_v << -161976671));
        pfa.b(param0 ^ -1488922240);
    }

    final int[] a(int param0, int param1) {
        int[] var4 = null;
        int var5 = 0;
        int var6 = BachelorFridge.field_y;
        int[] var7 = this.field_j.a(param0, -1);
        int[] var3 = var7;
        if (!this.field_j.field_m) {
        } else {
            var4 = this.a(0, this.field_l ? -param0 + it.field_r : param0, (byte) 109);
            if (!this.field_k) {
                bl.a(var4, 0, var7, 0, hh.field_d);
            } else {
                for (var5 = 0; hh.field_d > var5; var5++) {
                    var3[var5] = var4[wp.field_r + -var5];
                }
            }
        }
        if (param1 != 0) {
            oba.d(13);
        }
        return var3;
    }

    final void a(byte param0, lu param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param0 == -71) {
                break L1;
              } else {
                this.field_k = false;
                break L1;
              }
            }
            L2: {
              var4_int = param2;
              if (0 != var4_int) {
                if (1 != var4_int) {
                  L3: {
                    if (-3 != (var4_int ^ -1)) {
                      break L3;
                    } else {
                      L4: {
                        stackIn_19_0 = this;

                        if (-2 != (param1.b(16711935) ^ -1)) {
                          stackIn_20_0 = this;
                          stackIn_20_1 = 0;
                          break L4;
                        } else {
                          stackIn_20_0 = this;
                          stackIn_20_1 = 1;
                          break L4;
                        }
                      }
                      ((oba) (this)).field_f = stackIn_20_1 != 0;
                      break L3;
                    }
                  }
                  break L2;
                } else {
                  L5: {
                    stackIn_15_0 = this;

                    if (-2 != (param1.b(16711935) ^ -1)) {
                      stackIn_16_0 = this;
                      stackIn_16_1 = 0;
                      break L5;
                    } else {
                      stackIn_16_0 = this;
                      stackIn_16_1 = 1;
                      break L5;
                    }
                  }
                  ((oba) (this)).field_l = stackIn_16_1 != 0;
                  break L2;
                }
              } else {
                L6: {
                  stackIn_11_0 = this;

                  if (1 != param1.b(16711935)) {
                    stackIn_12_0 = this;
                    stackIn_12_1 = 0;
                    break L6;
                  } else {
                    stackIn_12_0 = this;
                    stackIn_12_1 = 1;
                    break L6;
                  }
                }
                ((oba) (this)).field_k = stackIn_12_1 != 0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var4);

            stackIn_24_1 = new StringBuilder().append("oba.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L7;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L7;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param2 + ')');
        }
    }

    static {
    }
}
