/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sma extends le {
    private int field_i;
    private int field_j;

    final int[] a(int param0, boolean param1) {
        int[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = VoidHunters.field_G;
          var3 = ((sma) this).field_f.a((byte) -117, param0);
          if (!((sma) this).field_f.field_e) {
            break L0;
          } else {
            var4 = ((sma) this).a(0, param0, 255);
            var5 = 0;
            L1: while (true) {
              if (var5 >= hob.field_d) {
                break L0;
              } else {
                var6 = var4[var5];
                if (((sma) this).field_j > var6) {
                  var3[var5] = ((sma) this).field_j;
                  var5++;
                  continue L1;
                } else {
                  if (var6 > ((sma) this).field_i) {
                    var3[var5] = ((sma) this).field_i;
                    var5++;
                    continue L1;
                  } else {
                    var3[var5] = var6;
                    var5++;
                    continue L1;
                  }
                }
              }
            }
          }
        }
        if (param1) {
          return var3;
        } else {
          return null;
        }
    }

    public sma() {
        super(1, false);
        ((sma) this).field_i = 4096;
        ((sma) this).field_j = 0;
    }

    final int[][] a(int param0, int param1) {
        int[][] var3 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        Object var16 = null;
        int[][] var17 = null;
        int[][] var19 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[][] var27 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[][] var35 = null;
        int[] var39 = null;
        int[] var40 = null;
        int[] var41 = null;
        int[][] var42 = null;
        int[][] var43 = null;
        int[] var44 = null;
        int[] var45 = null;
        int[] var46 = null;
        int[] var47 = null;
        int[] var48 = null;
        int[] var49 = null;
        L0: {
          var15 = VoidHunters.field_G;
          if (param0 == 255) {
            break L0;
          } else {
            var16 = null;
            ((sma) this).a(-114, -34, (ds) null);
            break L0;
          }
        }
        L1: {
          var43 = ((sma) this).field_d.a(param1, (byte) -117);
          var35 = var43;
          var27 = var35;
          var19 = var27;
          var17 = var19;
          var3 = var17;
          if (!((sma) this).field_d.field_g) {
            break L1;
          } else {
            var42 = ((sma) this).a((byte) 94, 0, param1);
            var44 = var42[0];
            var45 = var42[1];
            var46 = var42[2];
            var47 = var43[0];
            var39 = var47;
            var31 = var39;
            var23 = var31;
            var8 = var23;
            var48 = var43[1];
            var40 = var48;
            var32 = var40;
            var24 = var32;
            var9 = var24;
            var49 = var43[2];
            var41 = var49;
            var33 = var41;
            var25 = var33;
            var10 = var25;
            var11 = 0;
            L2: while (true) {
              if (hob.field_d <= var11) {
                break L1;
              } else {
                L3: {
                  var12 = var44[var11];
                  var13 = var45[var11];
                  var14 = var46[var11];
                  if (((sma) this).field_j <= var12) {
                    if (var12 > ((sma) this).field_i) {
                      var8[var11] = ((sma) this).field_i;
                      break L3;
                    } else {
                      var47[var11] = var12;
                      break L3;
                    }
                  } else {
                    var8[var11] = ((sma) this).field_j;
                    break L3;
                  }
                }
                L4: {
                  if (var13 >= ((sma) this).field_j) {
                    if (var13 <= ((sma) this).field_i) {
                      var48[var11] = var13;
                      break L4;
                    } else {
                      var9[var11] = ((sma) this).field_i;
                      break L4;
                    }
                  } else {
                    var9[var11] = ((sma) this).field_j;
                    break L4;
                  }
                }
                if (((sma) this).field_j <= var14) {
                  if (var14 <= ((sma) this).field_i) {
                    var49[var11] = var14;
                    var11++;
                    continue L2;
                  } else {
                    var10[var11] = ((sma) this).field_i;
                    var11++;
                    continue L2;
                  }
                } else {
                  var10[var11] = ((sma) this).field_j;
                  var11++;
                  continue L2;
                }
              }
            }
          }
        }
        return var3;
    }

    final void a(int param0, int param1, ds param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_11_0 = null;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param1 < -60) {
                break L1;
              } else {
                ((sma) this).field_j = -128;
                break L1;
              }
            }
            L2: {
              var4_int = param0;
              if (var4_int != 0) {
                if (var4_int != 1) {
                  if (2 == var4_int) {
                    L3: {
                      stackOut_11_0 = this;
                      stackIn_13_0 = stackOut_11_0;
                      stackIn_12_0 = stackOut_11_0;
                      if (param2.e((byte) -101) != 1) {
                        stackOut_13_0 = this;
                        stackOut_13_1 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        break L3;
                      } else {
                        stackOut_12_0 = this;
                        stackOut_12_1 = 1;
                        stackIn_14_0 = stackOut_12_0;
                        stackIn_14_1 = stackOut_12_1;
                        break L3;
                      }
                    }
                    ((sma) this).field_g = stackIn_14_1 != 0;
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  ((sma) this).field_i = param2.e(1869);
                  break L2;
                }
              } else {
                ((sma) this).field_j = param2.e(1869);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var4;
            stackOut_16_1 = new StringBuilder().append("sma.F(").append(param0).append(',').append(param1).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
    }

    static {
    }
}
