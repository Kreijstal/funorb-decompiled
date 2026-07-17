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
        RuntimeException var4 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                L2: {
                  stackOut_2_0 = this;
                  stackIn_4_0 = stackOut_2_0;
                  stackIn_3_0 = stackOut_2_0;
                  if (param2.e((byte) -118) != 1) {
                    stackOut_4_0 = this;
                    stackOut_4_1 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    break L2;
                  } else {
                    stackOut_3_0 = this;
                    stackOut_3_1 = 1;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_5_1 = stackOut_3_1;
                    break L2;
                  }
                }
                ((qba) this).field_g = stackIn_5_1 != 0;
                break L1;
              } else {
                break L1;
              }
            }
            L3: {
              if (param1 <= -60) {
                break L3;
              } else {
                int[] discarded$2 = ((qba) this).a(30, true);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var4;
            stackOut_9_1 = new StringBuilder().append("qba.F(").append(param0).append(44).append(param1).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
    }

    public qba() {
        super(3, false);
    }

    final int[] a(int param0, boolean param1) {
        int[] var3 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        var9 = VoidHunters.field_G;
        if (param1) {
          L0: {
            var3 = ((qba) this).field_f.a((byte) -5, param0);
            if (!((qba) this).field_f.field_e) {
              break L0;
            } else {
              var14 = ((qba) this).a(0, param0, 255);
              var15 = ((qba) this).a(1, param0, 255);
              var13 = ((qba) this).a(2, param0, 255);
              var7 = 0;
              L1: while (true) {
                if (var7 >= hob.field_d) {
                  break L0;
                } else {
                  var8 = var13[var7];
                  if (var8 != 4096) {
                    if (var8 != 0) {
                      var3[var7] = var15[var7] * (4096 + -var8) + var14[var7] * var8 >> 12;
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
          return null;
        }
    }

    final int[][] a(int param0, int param1) {
        int[][] var3 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int[][] var20 = null;
        int[][] var21 = null;
        int[][] var31 = null;
        int[][] var41 = null;
        int[][] var51 = null;
        int[][] var52 = null;
        int[][] var53 = null;
        int[] var54 = null;
        int[] var55 = null;
        int[] var56 = null;
        int[] var57 = null;
        int[] var58 = null;
        int[] var59 = null;
        int[] var60 = null;
        L0: {
          var19 = VoidHunters.field_G;
          if (param0 == 255) {
            break L0;
          } else {
            int[][] discarded$1 = ((qba) this).a(86, 48);
            break L0;
          }
        }
        L1: {
          var51 = ((qba) this).field_d.a(param1, (byte) -99);
          var41 = var51;
          var31 = var41;
          var21 = var31;
          var20 = var21;
          var3 = var20;
          if (((qba) this).field_d.field_g) {
            var54 = ((qba) this).a(2, param1, param0);
            var52 = ((qba) this).a((byte) 79, 0, param1);
            var53 = ((qba) this).a((byte) 31, 1, param1);
            var7 = var51[0];
            var8 = var51[1];
            var9 = var51[2];
            var55 = var52[0];
            var56 = var52[1];
            var57 = var52[2];
            var58 = var53[0];
            var59 = var53[1];
            var60 = var53[2];
            var16 = 0;
            L2: while (true) {
              if (hob.field_d <= var16) {
                break L1;
              } else {
                var17 = var54[var16];
                if (var17 != 4096) {
                  var58 = var53[0];
                  if (var17 == 0) {
                    var58 = var53[0];
                    var7[var16] = var58[var16];
                    var8[var16] = var59[var16];
                    var9[var16] = var60[var16];
                    var16++;
                    continue L2;
                  } else {
                    var18 = -var17 + 4096;
                    var7[var16] = var58[var16] * var18 + var17 * var55[var16] >> 12;
                    var8[var16] = var17 * var56[var16] + var59[var16] * var18 >> 12;
                    var9[var16] = var57[var16] * var17 - -(var18 * var60[var16]) >> 12;
                    var16++;
                    continue L2;
                  }
                } else {
                  var7[var16] = var55[var16];
                  var8[var16] = var56[var16];
                  var9[var16] = var57[var16];
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
