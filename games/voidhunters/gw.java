/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gw extends le {
    private int field_j;
    static int[] field_i;

    final int[] a(int param0, boolean param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int stackIn_13_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_34_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        var8 = VoidHunters.field_G;
        if (param1) {
          var13 = ((gw) this).field_f.a((byte) 124, param0);
          var12 = var13;
          var11 = var12;
          var10 = var11;
          var9 = var10;
          var3 = var9;
          if (((gw) this).field_f.field_e) {
            var4 = sj.field_p[param0];
            var5 = 0;
            L0: while (true) {
              if (hob.field_d <= var5) {
                var9 = var3;
                var13 = var12;
                return var9;
              } else {
                L1: {
                  var6 = grb.field_l[var5];
                  if (var6 <= ((gw) this).field_j) {
                    break L1;
                  } else {
                    if (4096 + -((gw) this).field_j <= var6) {
                      break L1;
                    } else {
                      if (2048 - ((gw) this).field_j >= var4) {
                        break L1;
                      } else {
                        if (((gw) this).field_j + 2048 <= var4) {
                          break L1;
                        } else {
                          L2: {
                            var7 = 2048 - var6;
                            if (var7 >= 0) {
                              var9 = var3;
                              var13 = var12;
                              stackOut_12_0 = var7;
                              stackIn_13_0 = stackOut_12_0;
                              break L2;
                            } else {
                              stackOut_11_0 = -var7;
                              stackIn_13_0 = stackOut_11_0;
                              break L2;
                            }
                          }
                          var9 = var3;
                          var13 = var12;
                          var7 = stackIn_13_0;
                          var7 = var7 << 12;
                          var7 = var7 / (2048 - ((gw) this).field_j);
                          var9[var5] = 4096 + -var7;
                          var5++;
                          var5++;
                          continue L0;
                        }
                      }
                    }
                  }
                }
                L3: {
                  if (2048 + -((gw) this).field_j >= var6) {
                    break L3;
                  } else {
                    if (var6 < 2048 - -((gw) this).field_j) {
                      L4: {
                        var7 = var4 - 2048;
                        if (var7 >= 0) {
                          stackOut_19_0 = var7;
                          stackIn_20_0 = stackOut_19_0;
                          break L4;
                        } else {
                          stackOut_18_0 = -var7;
                          stackIn_20_0 = stackOut_18_0;
                          break L4;
                        }
                      }
                      var7 = stackIn_20_0;
                      var7 = var7 - ((gw) this).field_j;
                      var7 = var7 << 12;
                      var9[var5] = var7 / (2048 + -((gw) this).field_j);
                      var5++;
                      var5++;
                      continue L0;
                    } else {
                      break L3;
                    }
                  }
                }
                L5: {
                  if (var4 < ((gw) this).field_j) {
                    break L5;
                  } else {
                    if (-((gw) this).field_j + 4096 >= var4) {
                      L6: {
                        if (((gw) this).field_j > var6) {
                          break L6;
                        } else {
                          if (-((gw) this).field_j + 4096 >= var6) {
                            var13[var5] = 0;
                            var5++;
                            continue L0;
                          } else {
                            break L6;
                          }
                        }
                      }
                      L7: {
                        var7 = -var4 + 2048;
                        if (0 > var7) {
                          stackOut_33_0 = -var7;
                          stackIn_34_0 = stackOut_33_0;
                          break L7;
                        } else {
                          stackOut_32_0 = var7;
                          stackIn_34_0 = stackOut_32_0;
                          break L7;
                        }
                      }
                      var7 = stackIn_34_0;
                      var7 = var7 << 12;
                      var7 = var7 / (-((gw) this).field_j + 2048);
                      var9[var5] = -var7 + 4096;
                      var5++;
                      continue L0;
                    } else {
                      break L5;
                    }
                  }
                }
                L8: {
                  var7 = var6 + -2048;
                  if (var7 >= 0) {
                    stackOut_26_0 = var7;
                    stackIn_27_0 = stackOut_26_0;
                    break L8;
                  } else {
                    stackOut_25_0 = -var7;
                    stackIn_27_0 = stackOut_25_0;
                    break L8;
                  }
                }
                var7 = stackIn_27_0;
                var7 = var7 - ((gw) this).field_j;
                var7 = var7 << 12;
                var9[var5] = var7 / (-((gw) this).field_j + 2048);
                var5++;
                var5++;
                continue L0;
              }
            }
          } else {
            return var9;
          }
        } else {
          return null;
        }
    }

    public gw() {
        super(0, true);
        ((gw) this).field_j = 585;
    }

    final void a(int param0, int param1, ds param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              var4_int = param0;
              if (var4_int == 0) {
                ((gw) this).field_j = param2.e(1869);
                break L1;
              } else {
                break L1;
              }
            }
            if (param1 <= -60) {
              break L0;
            } else {
              gw.a(false);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("gw.F(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            field_i = null;
            field_i = null;
            return;
        }
        field_i = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new int[8192];
    }
}
