/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jh extends k {
    static String field_k;
    private int field_n;
    static String field_m;
    static volatile int field_l;

    public static void d(int param0) {
        field_m = null;
        field_k = null;
        if (param0 != 4096) {
            field_m = null;
        }
    }

    final int[] a(int param0, int param1) {
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
        int stackIn_15_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_36_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        var8 = BachelorFridge.field_y;
        if (param1 == 0) {
          var13 = ((jh) this).field_j.a(param0, -1);
          var12 = var13;
          var11 = var12;
          var10 = var11;
          var9 = var10;
          var3 = var9;
          if (((jh) this).field_j.field_m) {
            var4 = tj.field_f[param0];
            var5 = 0;
            L0: while (true) {
              if (hh.field_d > var5) {
                L1: {
                  var6 = jq.field_k[var5];
                  if (((jh) this).field_n >= var6) {
                    break L1;
                  } else {
                    if (-((jh) this).field_n + 4096 <= var6) {
                      break L1;
                    } else {
                      if (2048 - ((jh) this).field_n >= var4) {
                        break L1;
                      } else {
                        if (var4 < ((jh) this).field_n + 2048) {
                          L2: {
                            var7 = -var6 + 2048;
                            if (var7 >= 0) {
                              stackOut_14_0 = var7;
                              stackIn_15_0 = stackOut_14_0;
                              break L2;
                            } else {
                              stackOut_13_0 = -var7;
                              stackIn_15_0 = stackOut_13_0;
                              break L2;
                            }
                          }
                          var7 = stackIn_15_0;
                          var7 = var7 << 12;
                          var7 = var7 / (-((jh) this).field_n + 2048);
                          var9[var5] = -var7 + 4096;
                          var5++;
                          var5++;
                          continue L0;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                }
                L3: {
                  if (2048 - ((jh) this).field_n >= var6) {
                    break L3;
                  } else {
                    if (var6 < 2048 + ((jh) this).field_n) {
                      L4: {
                        var7 = var4 - 2048;
                        if (var7 >= 0) {
                          stackOut_21_0 = var7;
                          stackIn_22_0 = stackOut_21_0;
                          break L4;
                        } else {
                          stackOut_20_0 = -var7;
                          stackIn_22_0 = stackOut_20_0;
                          break L4;
                        }
                      }
                      var7 = stackIn_22_0;
                      var7 = var7 - ((jh) this).field_n;
                      var7 = var7 << 12;
                      var9[var5] = var7 / (-((jh) this).field_n + 2048);
                      var5++;
                      var5++;
                      continue L0;
                    } else {
                      break L3;
                    }
                  }
                }
                L5: {
                  if (var4 < ((jh) this).field_n) {
                    break L5;
                  } else {
                    if (-((jh) this).field_n + 4096 >= var4) {
                      L6: {
                        if (((jh) this).field_n > var6) {
                          break L6;
                        } else {
                          if (-((jh) this).field_n + 4096 >= var6) {
                            var13 = var12;
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
                        if (var7 < 0) {
                          stackOut_35_0 = -var7;
                          stackIn_36_0 = stackOut_35_0;
                          break L7;
                        } else {
                          stackOut_34_0 = var7;
                          stackIn_36_0 = stackOut_34_0;
                          break L7;
                        }
                      }
                      var7 = stackIn_36_0;
                      var7 = var7 << 12;
                      var7 = var7 / (2048 - ((jh) this).field_n);
                      var9[var5] = -var7 + 4096;
                      var5++;
                      continue L0;
                    } else {
                      break L5;
                    }
                  }
                }
                L8: {
                  var7 = -2048 + var6;
                  if (var7 >= 0) {
                    stackOut_28_0 = var7;
                    stackIn_29_0 = stackOut_28_0;
                    break L8;
                  } else {
                    stackOut_27_0 = -var7;
                    stackIn_29_0 = stackOut_27_0;
                    break L8;
                  }
                }
                var7 = stackIn_29_0;
                var7 = var7 - ((jh) this).field_n;
                var7 = var7 << 12;
                var9[var5] = var7 / (2048 + -((jh) this).field_n);
                var5++;
                var5++;
                continue L0;
              } else {
                return var9;
              }
            }
          } else {
            return var9;
          }
        } else {
          return null;
        }
    }

    final void a(byte param0, lu param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              var4_int = param2;
              if (0 != var4_int) {
                break L1;
              } else {
                ((jh) this).field_n = param1.e((byte) 106);
                break L1;
              }
            }
            if (param0 == -71) {
              break L0;
            } else {
              jh.d(-90);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("jh.E(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param2 + ')');
        }
    }

    public jh() {
        super(0, true);
        ((jh) this).field_n = 585;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Show players in <%0>'s game";
        field_m = "Loading fonts";
        field_l = 0;
    }
}
