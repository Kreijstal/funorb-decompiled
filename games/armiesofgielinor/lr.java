/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lr {
    static iv field_a;
    private int[] field_b;

    lr(int[] param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var2_int = 1;
            L1: while (true) {
              L2: {
                L3: {
                  if ((param0.length >> 821848545) + param0.length < var2_int) {
                    break L3;
                  } else {
                    var2_int = var2_int << 1;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      if (var5 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                this.field_b = new int[var2_int - -var2_int];
                break L2;
              }
              var3 = 0;
              L4: while (true) {
                L5: {
                  L6: {
                    if (var2_int + var2_int <= var3) {
                      break L6;
                    } else {
                      this.field_b[var3] = -1;
                      var3++;
                      if (var5 != 0) {
                        break L5;
                      } else {
                        if (var5 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  var3 = 0;
                  break L5;
                }
                L7: while (true) {
                  if (param0.length <= var3) {
                    break L0;
                  } else {
                    if (var5 == 0) {
                      var4 = var2_int + -1 & param0[var3];
                      L8: while (true) {
                        L9: {
                          if (0 == (this.field_b[var4 + (var4 + 1)] ^ -1)) {
                            this.field_b[var4 + var4] = param0[var3];
                            this.field_b[var4 + var4 + 1] = var3;
                            var3++;
                            break L9;
                          } else {
                            var4 = var4 + 1 & var2_int - 1;
                            if (var5 != 0) {
                              break L9;
                            } else {
                              continue L8;
                            }
                          }
                        }
                        continue L7;
                      }
                    } else {
                      return;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var2);
            stackOut_21_1 = new StringBuilder().append("lr.<init>(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L10;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L10;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
    }

    final static ru[] a(int param0) {
        ru[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        co[] var4 = null;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        var1 = new ru[iw.field_n];
        var2 = 0;
        L0: while (true) {
          if (var2 >= iw.field_n) {
            if (param0 >= 102) {
              rj.d((byte) 103);
              return var1;
            } else {
              var4 = (co[]) null;
              lr.a((co[]) null, (byte) -34);
              rj.d((byte) 103);
              return var1;
            }
          } else {
            var1[var2] = new ru(lg.field_d, wr.field_J, j.field_e[var2], iq.field_g[var2], qm.field_K[var2], c.field_e[var2], vj.field_j[var2], qv.field_j);
            var2++;
            if (var3 == 0) {
              continue L0;
            } else {
              return var1;
            }
          }
        }
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        var3 = -1 + (this.field_b.length >> -2140433471);
        if (param1 == 1) {
          var4 = var3 & param0;
          L0: while (true) {
            L1: {
              var5 = this.field_b[1 + (var4 + var4)];
              if ((var5 ^ -1) != 0) {
                stackOut_6_0 = this.field_b[var4 + var4] ^ -1;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                stackOut_4_0 = -1;
                stackIn_7_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (var6 != 0) {
                  break L1;
                } else {
                  return stackIn_5_0;
                }
              }
            }
            if (stackIn_7_0 == (param0 ^ -1)) {
              return var5;
            } else {
              var4 = var3 & 1 + var4;
              continue L0;
            }
          }
        } else {
          return -110;
        }
    }

    final static void a(co[] param0, byte param1) {
        ru[] discarded$2 = null;
        co[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        co[] var5 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var5 = param0;
              var2 = var5;
              if (param1 > 35) {
                break L1;
              } else {
                discarded$2 = lr.a(-11);
                break L1;
              }
            }
            var3 = 0;
            L2: while (true) {
              if (var3 >= var5.length) {
                break L0;
              } else {
                var3++;
                if (var4 == 0) {
                  continue L2;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var2_ref);
            stackOut_10_1 = new StringBuilder().append("lr.B(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
    }

    static {
        field_a = null;
    }
}
