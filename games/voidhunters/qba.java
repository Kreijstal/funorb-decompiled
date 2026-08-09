/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qba extends le {
    final static void a(int param0, int param1, int param2, int param3, int param4) {
        if (param0 != 20382) {
            return;
        }
        fnb.a(param4, param3, param1, false, param2, 256);
    }

    final void a(int param0, int param1, ds param2) {
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                L2: {
                  stackIn_4_0 = this;

                  if (-2 != (param2.e((byte) -118) ^ -1)) {
                    stackIn_5_0 = this;
                    stackIn_5_1 = 0;
                    break L2;
                  } else {
                    stackIn_5_0 = this;
                    stackIn_5_1 = 1;
                    break L2;
                  }
                }
                ((qba) (this)).field_g = stackIn_5_1 != 0;
                break L1;
              } else {
                break L1;
              }
            }
            L3: {
              if (param1 <= -60) {
                break L3;
              } else {
                this.a(30, true);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var4);

            stackIn_11_1 = new StringBuilder().append("qba.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    public qba() {
        super(3, false);
    }

    final int[] a(int param0, boolean param1) {
        int[] var3;
        int var7;
        int var8;
        int var9;
        int[] var13;
        int[] var14;
        int[] var15;
        var9 = VoidHunters.field_G;
        if (param1) {
          L0: {
            var3 = this.field_f.a((byte) -5, param0);
            if (!this.field_f.field_e) {
              break L0;
            } else {
              var14 = this.a(0, param0, 255);
              var15 = this.a(1, param0, 255);
              var13 = this.a(2, param0, 255);
              var7 = 0;
              L1: while (true) {
                if (var7 >= hob.field_d) {
                  break L0;
                } else {
                  var8 = var13[var7];
                  if (var8 != 4096) {
                    if (var8 != 0) {
                      var3[var7] = var15[var7] * (4096 + -var8) + var14[var7] * var8 >> 1547395436;
                      var7++;
                      continue L1;
                    } else {
                      var3[var7] = var15[var7];
                      var7++;
                      continue L1;
                    }
                  } else {
                    var3[var7] = var14[var7];
                    var7++;
                    continue L1;
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

    final int[][] a(int param0, int param1) {
        int[][] var3;
        int[] var7;
        int[] var8;
        int[] var9;
        int var16;
        int var17;
        int var19;
        int[][] var20;
        int[][] var21;
        int[][] var31;
        int[][] var50;
        int[][] var51;
        int[] var52;
        int[] var53;
        int[] var54;
        int[] var55;
        int[] var56;
        int[] var57;
        int[] var58;
        int var18;
        L0: {
          var19 = VoidHunters.field_G;
          if (param0 == 255) {
            break L0;
          } else {
            this.a(86, 48);
            break L0;
          }
        }
        L1: {
          var31 = this.field_d.a(param1, (byte) -99);
          var21 = var31;
          var20 = var21;
          var3 = var20;
          if (this.field_d.field_g) {
            var52 = this.a(2, param1, param0 ^ 0);
            var50 = this.a((byte) 79, 0, param1);
            var51 = this.a((byte) 31, 1, param1);
            var7 = var31[0];
            var8 = var31[1];
            var9 = var31[2];
            var53 = var50[0];
            var54 = var50[1];
            var55 = var50[2];
            var56 = var51[0];
            var57 = var51[1];
            var58 = var51[2];
            var16 = 0;
            L2: while (true) {
              if (hob.field_d <= var16) {
                break L1;
              } else {
                var17 = var52[var16];
                if ((var17 ^ -1) != -4097) {
                  var56 = var51[0];
                  if (-1 == (var17 ^ -1)) {
                    var56 = var51[0];
                    var7[var16] = var56[var16];
                    var8[var16] = var57[var16];
                    var9[var16] = var58[var16];
                    var16++;
                    continue L2;
                  } else {
                    var18 = -var17 + 4096;
                    var7[var16] = var56[var16] * var18 + var17 * var53[var16] >> -399805620;
                    var8[var16] = var17 * var54[var16] + var57[var16] * var18 >> 274698252;
                    var9[var16] = var55[var16] * var17 - -(var18 * var58[var16]) >> 1022783756;
                    var16++;
                    continue L2;
                  }
                } else {
                  var7[var16] = var53[var16];
                  var8[var16] = var54[var16];
                  var9[var16] = var55[var16];
                  var16++;
                  continue L2;
                }
              }
            }
          } else {
            break L1;
          }
        }
        return var3;
    }

    static {
    }
}
