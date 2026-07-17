/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class il extends le {
    private int field_l;
    private int field_i;
    private int field_k;
    private int field_j;

    final void a(int param0, int param1, ds param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
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
        var5 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var4_int = param0;
              if (0 != var4_int) {
                if (var4_int != 1) {
                  if (var4_int == 2) {
                    ((il) this).field_j = param2.e(1869);
                    break L1;
                  } else {
                    if (var4_int != 3) {
                      break L1;
                    } else {
                      ((il) this).field_i = param2.e(1869);
                      break L1;
                    }
                  }
                } else {
                  ((il) this).field_k = param2.e(1869);
                  break L1;
                }
              } else {
                ((il) this).field_l = param2.e(1869);
                break L1;
              }
            }
            L2: {
              if (param1 <= -60) {
                break L2;
              } else {
                int[] discarded$1 = ((il) this).a(-126, false);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4;
            stackOut_15_1 = new StringBuilder().append("il.F(").append(param0).append(44).append(param1).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[] var34 = null;
        int[] var35 = null;
        int stackIn_20_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        var25 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              dda.a(param3, 74);
              var7_int = 0;
              var8 = param3 + -param6;
              if (var8 < 0) {
                var8 = 0;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var9 = param3;
              var10 = -param3;
              var11 = var8;
              var12 = -var8;
              var13 = -1;
              var14 = -1;
              var35 = rba.field_b[param5];
              var34 = var35;
              var33 = var34;
              var26 = var33;
              var15 = var26;
              var16 = -var8 + param4;
              ww.a(param1, var16, var15, (byte) 75, param4 + -param3);
              var17 = param4 + var8;
              ww.a(param0, var17, var35, (byte) 75, var16);
              if (param2 <= 0) {
                break L2;
              } else {
                il.a(-21, -8, (byte) 1, -122, 112, 81, 20);
                break L2;
              }
            }
            ww.a(param1, param3 + param4, var35, (byte) 75, var17);
            L3: while (true) {
              if (var9 <= var7_int) {
                break L0;
              } else {
                L4: {
                  var14 += 2;
                  var13 += 2;
                  var10 = var10 + var13;
                  var12 = var12 + var14;
                  if (var12 < 0) {
                    break L4;
                  } else {
                    if (1 <= var11) {
                      dw.field_a[var11] = var7_int;
                      var11--;
                      var12 = var12 - (var11 << 1);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  var7_int++;
                  if (0 > var10) {
                    break L5;
                  } else {
                    var9--;
                    var10 = var10 - (var9 << 1);
                    if (var9 < var8) {
                      var29 = rba.field_b[var9 + param5];
                      var30 = rba.field_b[param5 - var9];
                      var20 = dw.field_a[var9];
                      var21 = param4 + var7_int;
                      var22 = -var7_int + param4;
                      var23 = var20 + param4;
                      var24 = param4 + -var20;
                      ww.a(param1, var24, var29, (byte) 75, var22);
                      ww.a(param0, var23, var29, (byte) 75, var24);
                      ww.a(param1, var21, var29, (byte) 75, var23);
                      ww.a(param1, var24, var30, (byte) 75, var22);
                      ww.a(param0, var23, var30, (byte) 75, var24);
                      ww.a(param1, var21, var30, (byte) 75, var23);
                      break L5;
                    } else {
                      var27 = rba.field_b[param5 - -var9];
                      var28 = rba.field_b[param5 - var9];
                      var20 = param4 - -var7_int;
                      var21 = -var7_int + param4;
                      ww.a(param1, var20, var27, (byte) 75, var21);
                      ww.a(param1, var20, var28, (byte) 75, var21);
                      break L5;
                    }
                  }
                }
                var31 = rba.field_b[var7_int + param5];
                var32 = rba.field_b[-var7_int + param5];
                var20 = var9 + param4;
                var21 = -var9 + param4;
                if (var8 <= var7_int) {
                  ww.a(param1, var20, var31, (byte) 75, var21);
                  ww.a(param1, var20, var32, (byte) 75, var21);
                  continue L3;
                } else {
                  L6: {
                    if (var7_int > var11) {
                      stackOut_19_0 = dw.field_a[var7_int];
                      stackIn_20_0 = stackOut_19_0;
                      break L6;
                    } else {
                      stackOut_18_0 = var11;
                      stackIn_20_0 = stackOut_18_0;
                      break L6;
                    }
                  }
                  var22 = stackIn_20_0;
                  var23 = var22 + param4;
                  var24 = -var22 + param4;
                  ww.a(param1, var24, var31, (byte) 75, var21);
                  ww.a(param0, var23, var31, (byte) 75, var24);
                  ww.a(param1, var20, var31, (byte) 75, var23);
                  ww.a(param1, var24, var32, (byte) 75, var21);
                  ww.a(param0, var23, var32, (byte) 75, var24);
                  ww.a(param1, var20, var32, (byte) 75, var23);
                  continue L3;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var7, "il.C(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
    }

    public il() {
        super(0, true);
        ((il) this).field_k = 20;
        ((il) this).field_i = 0;
        ((il) this).field_l = 1365;
        ((il) this).field_j = 0;
    }

    final int[] a(int param0, boolean param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        int[] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int[] stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        int[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        var14 = VoidHunters.field_G;
        if (param1) {
          L0: {
            var15 = ((il) this).field_f.a((byte) 16, param0);
            var3 = var15;
            if (!((il) this).field_f.field_e) {
              break L0;
            } else {
              var4 = 0;
              L1: while (true) {
                if (var4 >= hob.field_d) {
                  break L0;
                } else {
                  var5 = ((il) this).field_j + (grb.field_l[var4] << 12) / ((il) this).field_l;
                  var6 = ((il) this).field_i + (sj.field_p[param0] << 12) / ((il) this).field_l;
                  var7 = var5;
                  var8 = var6;
                  var9 = var5;
                  var10 = var6;
                  var11 = var5 * var5 >> 12;
                  var12 = var6 * var6 >> 12;
                  var13 = 0;
                  L2: while (true) {
                    L3: {
                      if (var11 - -var12 >= 16384) {
                        break L3;
                      } else {
                        if (((il) this).field_k <= var13) {
                          break L3;
                        } else {
                          var10 = var8 + 2 * (var10 * var9 >> 12);
                          var9 = var7 + -var12 + var11;
                          var12 = var10 * var10 >> 12;
                          var11 = var9 * var9 >> 12;
                          var13++;
                          continue L2;
                        }
                      }
                    }
                    L4: {
                      stackOut_9_0 = (int[]) var15;
                      stackOut_9_1 = var4;
                      stackIn_11_0 = stackOut_9_0;
                      stackIn_11_1 = stackOut_9_1;
                      stackIn_10_0 = stackOut_9_0;
                      stackIn_10_1 = stackOut_9_1;
                      if (var13 >= -1 + ((il) this).field_k) {
                        stackOut_11_0 = (int[]) (Object) stackIn_11_0;
                        stackOut_11_1 = stackIn_11_1;
                        stackOut_11_2 = 0;
                        stackIn_12_0 = stackOut_11_0;
                        stackIn_12_1 = stackOut_11_1;
                        stackIn_12_2 = stackOut_11_2;
                        break L4;
                      } else {
                        stackOut_10_0 = (int[]) (Object) stackIn_10_0;
                        stackOut_10_1 = stackIn_10_1;
                        stackOut_10_2 = (var13 << 12) / ((il) this).field_k;
                        stackIn_12_0 = stackOut_10_0;
                        stackIn_12_1 = stackOut_10_1;
                        stackIn_12_2 = stackOut_10_2;
                        break L4;
                      }
                    }
                    stackIn_12_0[stackIn_12_1] = stackIn_12_2;
                    var4++;
                    continue L1;
                  }
                }
              }
            }
          }
          return var15;
        } else {
          return null;
        }
    }

    static {
    }
}
