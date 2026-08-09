/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class oe extends ce implements ra {
    ce[] field_K;
    static vj field_I;
    static String[] field_M;
    static boolean[] field_L;
    static int[] field_J;
    static int field_H;
    static int field_G;

    final int d(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        ce[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        ce var6 = null;
        int var7 = 0;
        int var8 = 0;
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = client.field_A ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            var3 = this.field_K;
            var4 = 22 % ((36 - param0) / 51);
            var5 = 0;
            L1: while (true) {
              L2: {
                if (var5 >= var3.length) {
                  break L2;
                } else {
                  L3: {
                    var6 = var3[var5];
                    if (var6 == null) {
                      break L3;
                    } else {
                      var7 = var6.d(-30);
                      if ((var2_int ^ -1) <= (var7 ^ -1)) {
                        break L3;
                      } else {
                        var2_int = var7;
                        break L3;
                      }
                    }
                  }
                  var5++;
                  if (var8 == 0) {
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackIn_8_0 = var2_int;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var2), "oe.DC(" + param0 + ')');
        }
        return stackIn_8_0;
    }

    oe(int param0, int param1, int param2, int param3, gl param4) {
        super(param0, param1, param2, param3, param4, (kg) null);
    }

    final boolean a(boolean param0, ce param1) {
        ce[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        ce var5 = null;
        int var6 = 0;
        int stackIn_13_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = client.field_A ? 1 : 0;
        try {
          L0: {
            var3 = this.field_K;
            var4 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if ((var3.length ^ -1) >= (var4 ^ -1)) {
                    break L3;
                  } else {
                    var5 = var3[var4];
                    if (var6 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (null == var5) {
                          break L4;
                        } else {
                          if (var5.a(false, param1)) {
                            stackIn_13_0 = 1;
                            decompiledRegionSelector0 = 0;
                            break L0;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var4++;
                      if (var6 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (!param0) {
                  break L2;
                } else {
                  this.field_K = (ce[]) null;
                  break L2;
                }
              }
              stackIn_19_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var3_ref);

            stackIn_23_1 = new StringBuilder().append("oe.EC(").append(param0).append(',');

            if (param1 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L5;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L5;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_13_0 != 0;
        } else {
          return stackIn_19_0 != 0;
        }
    }

    private final boolean a(ce param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        ce var5 = null;
        ce var6 = null;
        int var7 = 0;
        int stackIn_5_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_38_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (null == this.field_K) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackIn_5_0 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return stackIn_5_0 != 0;
                }
                case 6: {
                    try {
                        var4_int = this.field_K.length - 1;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if ((var4_int ^ -1) > -1) {
                            statePc = 34;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var5 = this.field_K[var4_int];
                        if (var7 != 0) {
                            statePc = 37;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var5 == null) {
                            statePc = 32;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var5.a(true)) {
                            statePc = 18;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var7 == 0) {
                            statePc = 32;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var4_int = var4_int - param1;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if ((var4_int ^ -1) > -1) {
                            statePc = 32;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var6 = this.field_K[var4_int];
                        if (var7 != 0) {
                            statePc = 33;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (null == var6) {
                            statePc = 31;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (var6.a(false, param0)) {
                            statePc = 29;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackIn_30_0 = 1;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 30: {
                    return stackIn_30_0 != 0;
                }
                case 31: {
                    try {
                        var4_int = var4_int - param1;
                        if (var7 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var4_int--;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (var7 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (param2 == 0) {
                            statePc = 37;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        oe.a(-94, -2, 108, 7, 101, 46, -99);
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        stackIn_38_0 = 0;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 38: {
                    return stackIn_38_0 != 0;
                }
                case 39: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_42_0 = (RuntimeException) (var4);
                    stackIn_40_0 = stackIn_42_0;
                    stackIn_42_1 = new StringBuilder().append("oe.P(");
                    stackIn_40_1 = stackIn_42_1;
                    if (param0 == null) {
                        statePc = 42;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    stackIn_43_0 = (RuntimeException) ((Object) stackIn_40_0);
                    stackIn_43_1 = (StringBuilder) ((Object) stackIn_40_1);
                    stackIn_43_2 = "{...}";
                    statePc = 43;
                    continue stateLoop;
                }
                case 42: {
                    stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
                    stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
                    stackIn_43_2 = "null";
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    throw dh.a((Throwable) ((Object) stackIn_43_0), stackIn_43_2 + ',' + param1 + ',' + param2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    void a(ce param0, int param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        ce[] var5 = null;
        int var6 = 0;
        ce var7 = null;
        int var8 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = client.field_A ? 1 : 0;
        try {
          L0: {
            super.a(param0, 102, param2, param3);
            if (this.field_K != null) {
              if (param1 > 38) {
                var5 = this.field_K;
                var6 = 0;
                L1: while (true) {
                  L2: {
                    L3: {
                      if ((var5.length ^ -1) >= (var6 ^ -1)) {
                        break L3;
                      } else {
                        var7 = var5[var6];
                        if (var8 != 0) {
                          break L2;
                        } else {
                          L4: {
                            if (var7 != null) {
                              var7.a(param0, 109, param2 + this.field_D, this.field_u + param3);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          var6++;
                          if (var8 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    break L2;
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (runtimeException);

            stackIn_19_1 = new StringBuilder().append("oe.A(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int statePc = 0;
        Throwable caughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var15 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 != 0) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        param0 = 1;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var7_int = 0;
                        var8 = 65536 / param0;
                        if (param3 == -1) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        field_H = -1;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (param6 >= hk.field_h) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var7_int = var7_int + var8 * (hk.field_h - param6);
                        param1 = param1 - (hk.field_h + -param6);
                        param6 = hk.field_h;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (hk.field_c > param5) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        param0 = param0 - (hk.field_c - param5);
                        param5 = hk.field_c;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (hk.field_b >= param1 + param6) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        param1 = hk.field_b + -param6;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (hk.field_g < param5 - -param0) {
                            statePc = 17;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        param0 = hk.field_g - param5;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var9 = param5 + hk.field_j * (param6 - -param1);
                        var10 = -param0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (0 <= var10) {
                            statePc = 31;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var11 = -var7_int + 65536 >> 1531409928;
                        var12 = var7_int >> -1962121400;
                        var13 = (var11 * (param4 & 16711935) - -(var12 * (param2 & 16711935)) & -16711936) - -(16711680 & var12 * (65280 & param2) + (65280 & param4) * var11) >>> 1249901160;
                        if (var15 != 0) {
                            statePc = 31;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var14 = -param1;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (0 <= var14) {
                            statePc = 27;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        hk.field_l[hk.field_j * var14 + var9] = var13;
                        var14++;
                        if (var15 != 0) {
                            statePc = 28;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (var15 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var9++;
                        var7_int = var7_int + var8;
                        var10++;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (var15 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 30: {
                    var7 = (RuntimeException) ((Object) caughtException);
                    throw dh.a((Throwable) ((Object) var7), "oe.Q(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
                }
                case 31: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void b(boolean param0) {
        field_M = null;
        field_I = null;
        field_L = null;
        if (!param0) {
            return;
        }
        try {
            field_J = null;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "oe.N(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, int param2, ce param3, int param4, int param5) {
        RuntimeException runtimeException = null;
        ce[] var7 = null;
        int var8 = 0;
        ce var9 = null;
        int var10 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (null != this.field_K) {
              L1: {
                var7 = this.field_K;
                if (param1 == 64) {
                  break L1;
                } else {
                  this.a((ce) null, -80, 51, 84);
                  break L1;
                }
              }
              var8 = 0;
              L2: while (true) {
                L3: {
                  L4: {
                    if ((var7.length ^ -1) >= (var8 ^ -1)) {
                      break L4;
                    } else {
                      var9 = var7[var8];
                      if (var10 != 0) {
                        break L3;
                      } else {
                        L5: {
                          if (null != var9) {
                            var9.a(param0, param1 + 0, this.field_u + param2, param3, param4 + this.field_D, param5);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        var8++;
                        if (var10 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  break L3;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            runtimeException = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (runtimeException);

            stackIn_20_1 = new StringBuilder().append("oe.IB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(StringBuilder param0, int param1, int param2, Hashtable param3) {
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        RuntimeException runtimeException = null;
        ce[] var5 = null;
        int var6 = 0;
        ce var7 = null;
        int var8 = 0;
        int var9 = 0;
        int stackIn_7_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (null == this.field_K) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return;
                }
                case 4: {
                    try {
                        var5 = this.field_K;
                        var6 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var5.length <= var6) {
                            statePc = 19;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var7 = var5[var6];
                        discarded$4 = param0.append('\n');
                        stackIn_20_0 = 0;
                        stackIn_7_0 = stackIn_20_0;
                        if (var9 != 0) {
                            statePc = 20;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var8 = stackIn_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var8 > param1) {
                            statePc = 13;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        discarded$5 = param0.append(' ');
                        var8++;
                        if (var9 != 0) {
                            statePc = 17;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var9 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var7 != null) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        discarded$6 = param0.append("null");
                        if (var9 == 0) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var7.a(param3, param1 - -1, param0, true);
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var6++;
                        if (var9 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackIn_20_0 = param2;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (stackIn_20_0 == 3370) {
                            statePc = 33;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        this.a(85, -91, (ce) null, '￬');
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 24: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_27_0 = (RuntimeException) (runtimeException);
                    stackIn_25_0 = stackIn_27_0;
                    stackIn_27_1 = new StringBuilder().append("oe.M(");
                    stackIn_25_1 = stackIn_27_1;
                    if (param0 == null) {
                        statePc = 27;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    stackIn_28_0 = (RuntimeException) ((Object) stackIn_25_0);
                    stackIn_28_1 = (StringBuilder) ((Object) stackIn_25_1);
                    stackIn_28_2 = "{...}";
                    statePc = 28;
                    continue stateLoop;
                }
                case 27: {
                    stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
                    stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
                    stackIn_28_2 = "null";
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    stackIn_31_0 = (RuntimeException) ((Object) stackIn_28_0);
                    stackIn_29_0 = stackIn_31_0;
                    stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',').append(param1).append(',').append(param2).append(',');
                    stackIn_29_1 = stackIn_31_1;
                    if (param3 == null) {
                        statePc = 31;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    stackIn_32_0 = (RuntimeException) ((Object) stackIn_29_0);
                    stackIn_32_1 = (StringBuilder) ((Object) stackIn_29_1);
                    stackIn_32_2 = "{...}";
                    statePc = 32;
                    continue stateLoop;
                }
                case 31: {
                    stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
                    stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
                    stackIn_32_2 = "null";
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    throw dh.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ')');
                }
                case 33: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean a(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0) {
              L1: {
                if (null == this.a(-98)) {
                  stackIn_7_0 = 0;
                  break L1;
                } else {
                  stackIn_7_0 = 1;
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var2), "oe.TB(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
    }

    final static jc a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_11_0 = null;
        jc stackIn_14_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param1.length();
              if (param0 > 64) {
                break L1;
              } else {
                oe.c(true);
                break L1;
              }
            }
            var3 = 0;
            L2: while (true) {
              L3: {
                if (var3 >= var2_int) {
                  break L3;
                } else {
                  L4: {
                    var4 = param1.charAt(var3);
                    if (-49 < (var4 ^ -1)) {
                      break L4;
                    } else {
                      if (57 >= var4) {
                        var3++;
                        if (var5 == 0) {
                          continue L2;
                        } else {
                          break L3;
                        }
                      } else {
                        break L4;
                      }
                    }
                  }
                  stackIn_11_0 = null;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
              stackIn_14_0 = be.field_x;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var2);

            stackIn_18_1 = new StringBuilder().append("oe.U(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (jc) ((Object) stackIn_11_0);
        } else {
          return stackIn_14_0;
        }
    }

    final void d(byte param0) {
        RuntimeException runtimeException = null;
        ce[] var2 = null;
        int var3 = 0;
        ce var4 = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = client.field_A ? 1 : 0;
        try {
          L0: {
            var2 = this.field_K;
            var3 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if ((var3 ^ -1) <= (var2.length ^ -1)) {
                    break L3;
                  } else {
                    var4 = var2[var3];
                    if (var5 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (var4 != null) {
                          var4.d((byte) -95);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      var3++;
                      if (var5 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param0 == -95) {
                  break L2;
                } else {
                  oe.a('ﾤ', -111);
                  break L2;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) runtimeException), "oe.WB(" + param0 + ')');
        }
    }

    final static void c(boolean param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_13_0 = 0;
        boolean stackIn_57_0 = false;
        int stackIn_64_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_56_0;
        uf var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        Object var3 = null;
        int var3_int = 0;
        int var4 = 0;
        String var4_ref_String = null;
        String var5 = null;
        wb var6 = null;
        wb var7 = null;
        String var7_ref = null;
        String var8 = null;
        int var9 = 0;
        var9 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (!param0) {
              var1 = de.field_V;
              var2 = var1.d((byte) -25);
              if (-1 != (var2 ^ -1)) {
                if (1 != var2) {
                  if (2 == var2) {
                    L1: {
                      if (1 == jj.field_b) {
                        jj.field_b = 2;
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if ((var2 ^ -1) != -4) {
                      if (4 != var2) {
                        qb.a((Throwable) null, 16408, "F1: " + qk.d((byte) 17));
                        si.a(100);
                        decompiledRegionSelector0 = 6;
                        break L0;
                      } else {
                        jj.field_b = 1;
                        var3 = var1.c((byte) -38);
                        f.field_w = ((String) (var3)).intern();
                        var4 = var1.d((byte) -125);
                        nh.a((byte) 12, var4);
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    } else {
                      L2: {
                        if ((jj.field_b ^ -1) != -3) {
                          break L2;
                        } else {
                          jj.field_b = 1;
                          break L2;
                        }
                      }
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                } else {
                  L3: {
                    if (mc.field_a == null) {
                      mc.field_a = new nk(128);
                      md.field_Z = 0;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    var3 = var1.c((byte) -38);
                    if (((String) (var3)).equals("")) {
                      var3 = null;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    var4_ref_String = var1.c((byte) -38);
                    var5 = var1.c((byte) -38);
                    var6 = ed.a(var4_ref_String, (byte) -109);
                    if (null == var6) {
                      var6 = ed.a(var5, (byte) 71);
                      if (null != var6) {
                        mc.field_a.a(var6, -1, (long)kf.a((CharSequence) ((Object) var4_ref_String), (byte) 2).hashCode());
                        break L5;
                      } else {
                        break L5;
                      }
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    if (var6 != null) {
                      break L6;
                    } else {
                      var6 = new wb();
                      mc.field_a.a(var6, -1, (long)kf.a((CharSequence) ((Object) var4_ref_String), (byte) 2).hashCode());
                      fieldTemp$0 = md.field_Z;
                      md.field_Z = md.field_Z + 1;
                      var6.field_Xb = fieldTemp$0;
                      qi.field_S.a(var6, 2777);
                      break L6;
                    }
                  }
                  L7: {
                    if (var3 == null) {
                      break L7;
                    } else {
                      var3 = ((String) (var3)).intern();
                      break L7;
                    }
                  }
                  var6.field_Vb = (String) (var3);
                  var6.field_Ob = var4_ref_String;
                  var6.field_Tb = var5;
                  var6.b((byte) 125);
                  var7 = (wb) ((Object) qi.field_S.c((byte) 18));
                  L8: while (true) {
                    L9: {
                      L10: {
                        L11: {
                          L12: {
                            if (var7 == null) {
                              break L12;
                            } else {
                              stackOut_56_0 = pn.a(var7, var6, false);
                              stackIn_64_0 = stackOut_56_0 ? 1 : 0;
                              stackIn_57_0 = stackOut_56_0;
                              if (var9 != 0) {
                                break L11;
                              } else {
                                if (!stackIn_57_0) {
                                  break L12;
                                } else {
                                  var7 = (wb) ((Object) qi.field_S.d(true));
                                  if (var9 == 0) {
                                    continue L8;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                            }
                          }
                          if (null == var7) {
                            break L10;
                          } else {
                            stackIn_64_0 = 121;
                            break L11;
                          }
                        }
                        fm.a((byte) stackIn_64_0, var6, var7);
                        if (var9 == 0) {
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                      qi.field_S.a(var6, 2777);
                      break L9;
                    }
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              } else {
                L13: {
                  if (null != hg.field_e) {
                    break L13;
                  } else {
                    hg.field_e = new nk(128);
                    ed.field_g = 0;
                    break L13;
                  }
                }
                L14: {
                  if ((var1.d((byte) -111) ^ -1) != -2) {
                    stackIn_13_0 = 0;
                    break L14;
                  } else {
                    stackIn_13_0 = 1;
                    break L14;
                  }
                }
                L15: {
                  L16: {
                    var3_int = stackIn_13_0;
                    var4_ref_String = var1.c((byte) -38);
                    if (var3_int == 0) {
                      break L16;
                    } else {
                      var5 = var1.c((byte) -38);
                      if (var9 == 0) {
                        break L15;
                      } else {
                        break L16;
                      }
                    }
                  }
                  var5 = var4_ref_String;
                  break L15;
                }
                L17: {
                  var6 = g.a(-3805, var4_ref_String);
                  var7_ref = var1.c((byte) -38);
                  var8 = kf.a((CharSequence) ((Object) var4_ref_String), (byte) 2);
                  if (null == var8) {
                    var8 = var4_ref_String;
                    break L17;
                  } else {
                    break L17;
                  }
                }
                L18: {
                  if (null == var6) {
                    var6 = g.a(-3805, var7_ref);
                    if (null == var6) {
                      break L18;
                    } else {
                      hg.field_e.a(var6, -1, (long)var8.hashCode());
                      break L18;
                    }
                  } else {
                    break L18;
                  }
                }
                L19: {
                  if (var6 == null) {
                    var6 = new wb();
                    hg.field_e.a(var6, -1, (long)var8.hashCode());
                    fieldTemp$1 = ed.field_g;
                    ed.field_g = ed.field_g + 1;
                    var6.field_Xb = fieldTemp$1;
                    uf.field_z.a(var6, 2777);
                    break L19;
                  } else {
                    break L19;
                  }
                }
                var6.field_Pb = var5;
                var6.field_Ob = var4_ref_String;
                var6.field_Tb = var7_ref;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var1_ref), "oe.S(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        ce var6 = null;
        var7 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (0 != param2) {
                break L1;
              } else {
                if (null != this.field_p) {
                  this.field_p.a(true, param0, param3, (byte) -62, (ce) (this));
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                if (null != this.field_K) {
                  var5_int = -1 + this.field_K.length;
                  L4: while (true) {
                    if (-1 < (var5_int ^ -1)) {
                      break L3;
                    } else {
                      var6 = this.field_K[var5_int];
                      if (var7 != 0) {
                        break L2;
                      } else {
                        L5: {
                          if (var6 != null) {
                            var6.a(this.field_u + param0, -109, param2, param3 - -this.field_D);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        var5_int--;
                        if (var7 == 0) {
                          continue L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                } else {
                  break L3;
                }
              }
              if (param1 < -103) {
                break L2;
              } else {
                this.b(36, 0, -79, -102, 25);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var5), "oe.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean a(int param0, int param1, ce param2, int param3, int param4, int param5, byte param6) {
        ce[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        ce var10 = null;
        int var11 = 0;
        int stackIn_3_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (this.field_K != null) {
              var8 = this.field_K;
              var9 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if ((var9 ^ -1) <= (var8.length ^ -1)) {
                      break L3;
                    } else {
                      var10 = var8[var9];
                      if (var11 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (var10 == null) {
                            break L4;
                          } else {
                            if (var10.a(param0, param1, param2, param3, param4 - -this.field_D, this.field_u + param5, (byte) -55)) {
                              stackIn_16_0 = 1;
                              decompiledRegionSelector0 = 1;
                              break L0;
                            } else {
                              break L4;
                            }
                          }
                        }
                        var9++;
                        if (var11 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  if (param6 == -55) {
                    break L2;
                  } else {
                    field_H = -1;
                    break L2;
                  }
                }
                stackIn_22_0 = 0;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8_ref = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var8_ref);

            stackIn_26_1 = new StringBuilder().append("oe.LB(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L5;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L5;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_16_0 != 0;
          } else {
            return stackIn_22_0 != 0;
          }
        }
    }

    private final boolean b(ce param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        ce var5 = null;
        ce var6 = null;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (null != this.field_K) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = 0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0 != 0;
                }
                case 4: {
                    try {
                        if (param2 < -127) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        field_M = (String[]) null;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var4_int = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var4_int >= this.field_K.length) {
                            statePc = 29;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var5 = this.field_K[var4_int];
                        if (var5 == null) {
                            statePc = 27;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (!var5.a(true)) {
                            statePc = 27;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var4_int = var4_int + param1;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if ((var4_int ^ -1) <= (this.field_K.length ^ -1)) {
                            statePc = 27;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var6 = this.field_K[var4_int];
                        if (var7 != 0) {
                            statePc = 28;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (null == var6) {
                            statePc = 26;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var6.a(false, param0)) {
                            statePc = 24;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackIn_25_0 = 1;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 25: {
                    return stackIn_25_0 != 0;
                }
                case 26: {
                    try {
                        var4_int = var4_int + param1;
                        if (var7 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var4_int++;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (var7 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackIn_30_0 = 0;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 30: {
                    return stackIn_30_0 != 0;
                }
                case 31: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_34_0 = (RuntimeException) (var4);
                    stackIn_32_0 = stackIn_34_0;
                    stackIn_34_1 = new StringBuilder().append("oe.O(");
                    stackIn_32_1 = stackIn_34_1;
                    if (param0 == null) {
                        statePc = 34;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    stackIn_35_0 = (RuntimeException) ((Object) stackIn_32_0);
                    stackIn_35_1 = (StringBuilder) ((Object) stackIn_32_1);
                    stackIn_35_2 = "{...}";
                    statePc = 35;
                    continue stateLoop;
                }
                case 34: {
                    stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
                    stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
                    stackIn_35_2 = "null";
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    throw dh.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ',' + param1 + ',' + param2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final StringBuilder a(Hashtable param0, int param1, StringBuilder param2, boolean param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_6_0 = null;
        StringBuilder stackIn_8_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.a(0, param1, param0, param2)) {
                this.a((byte) 72, param2, param0, param1);
                this.a(param2, param1, 3370, param0);
                break L1;
              } else {
                break L1;
              }
            }
            if (param3) {
              stackIn_8_0 = (StringBuilder) (param2);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_6_0 = (StringBuilder) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("oe.MB(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_13_0), stackIn_17_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_8_0;
        }
    }

    private final boolean b(ce param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                this.field_K = (ce[]) null;
                break L1;
              }
            }
            stackIn_4_0 = this.b(param0, 1, param1 ^ -128);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("oe.T(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    private final ce a(int param0) {
        ce[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        ce var5 = null;
        int var6 = 0;
        Object stackIn_5_0 = null;
        ce stackIn_18_0 = null;
        Object stackIn_21_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (this.field_K == null) {
              stackIn_5_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var3 = 36 % ((param0 - 6) / 63);
              var2 = this.field_K;
              var4 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var4 >= var2.length) {
                      break L3;
                    } else {
                      var5 = var2[var4];
                      stackIn_21_0 = null;

                      if (var6 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (stackIn_21_0 == var5) {
                            break L4;
                          } else {
                            if (var5.a(true)) {
                              stackIn_18_0 = (ce) (var5);
                              decompiledRegionSelector0 = 2;
                              break L0;
                            } else {
                              break L4;
                            }
                          }
                        }
                        var4++;
                        if (var6 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackIn_21_0 = null;
                  break L2;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var2_ref), "oe.J(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ce) ((Object) stackIn_5_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (ce) ((Object) stackIn_21_0);
          } else {
            return stackIn_18_0;
          }
        }
    }

    final static int b(int param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              param1--;
              param1 = param1 | param1 >>> -1810527583;
              param1 = param1 | param1 >>> -1027453694;
              if (param0 == -10498) {
                break L1;
              } else {
                oe.a('ﾏ', -43);
                break L1;
              }
            }
            param1 = param1 | param1 >>> 499290852;
            param1 = param1 | param1 >>> -972289368;
            param1 = param1 | param1 >>> -1371497776;
            stackIn_4_0 = param1 + 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var2), "oe.L(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final static boolean a(char param0, int param1) {
        char[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        char stackIn_15_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        char stackIn_26_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        char stackOut_14_0;
        char stackOut_25_0;
        RuntimeException var2_ref = null;
        var5 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (Character.isISOControl(param0)) {
              stackIn_5_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (!j.a(-8241, param0)) {
                L1: {
                  var2 = sc.field_o;
                  if (param1 == -6237) {
                    break L1;
                  } else {
                    oe.a(35, -84, -82, 125, 125, -43, -29);
                    break L1;
                  }
                }
                var3 = 0;
                L2: while (true) {
                  L3: {
                    L4: {
                      L5: {
                        L6: {
                          if (var2.length <= var3) {
                            break L6;
                          } else {
                            var4 = var2[var3];
                            stackOut_14_0 = param0;
                            stackIn_24_0 = stackOut_14_0;
                            stackIn_15_0 = stackOut_14_0;
                            stackIn_24_1 = var4;

                            if (var5 != 0) {
                              L7: while (true) {
                                if (stackIn_24_0 >= stackIn_24_1) {
                                  break L4;
                                } else {
                                  var4 = var2[var3];
                                  stackOut_25_0 = param0;
                                  stackIn_33_0 = stackOut_25_0;
                                  stackIn_26_0 = stackOut_25_0;
                                  if (var5 != 0) {
                                    break L3;
                                  } else {
                                    if (stackIn_26_0 != var4) {
                                      var3++;
                                      if (var5 == 0) {
                                        stackIn_24_0 = var2.length ^ -1;
                                        stackIn_24_1 = var3 ^ -1;
                                        continue L7;
                                      } else {
                                        break L4;
                                      }
                                    } else {
                                      break L5;
                                    }
                                  }
                                }
                              }
                            } else {
                              if (stackIn_15_0 == stackIn_24_1) {
                                stackIn_20_0 = 1;
                                decompiledRegionSelector0 = 2;
                                break L0;
                              } else {
                                var3++;
                                if (var5 == 0) {
                                  continue L2;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                        }
                        var2 = oh.field_f;
                        var3 = 0;
                        L8: while (true) {
                          stackIn_24_0 = var2.length ^ -1;
                          stackIn_24_1 = var3 ^ -1;
                          if (stackIn_24_0 >= stackIn_24_1) {
                            break L4;
                          } else {
                            var4 = var2[var3];
                            stackOut_25_0 = param0;
                            stackIn_33_0 = stackOut_25_0;
                            stackIn_26_0 = stackOut_25_0;
                            if (var5 != 0) {
                              break L3;
                            } else {
                              if (stackIn_26_0 != var4) {
                                var3++;
                                if (var5 == 0) {
                                  continue L8;
                                } else {
                                  break L4;
                                }
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                      }
                      stackIn_30_0 = 1;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                    stackIn_33_0 = 0;
                    break L3;
                  }
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                stackIn_8_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var2_ref), "oe.K(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_20_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_33_0 != 0;
              } else {
                return stackIn_30_0 != 0;
              }
            }
          }
        }
    }

    final boolean a(int param0, int param1, ce param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        ce[] var6 = null;
        int var7 = 0;
        ce var8 = null;
        int var9 = 0;
        int stackIn_3_0 = 0;
        int stackIn_19_0 = 0;
        boolean stackIn_29_0 = false;
        int stackIn_31_0 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (this.field_K != null) {
              var5_int = -117 % ((param0 - -22) / 49);
              var6 = this.field_K;
              var7 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if ((var6.length ^ -1) >= (var7 ^ -1)) {
                      break L3;
                    } else {
                      var8 = var6[var7];
                      if (var9 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (null == var8) {
                            break L4;
                          } else {
                            if (!var8.a(true)) {
                              break L4;
                            } else {
                              if (var8.a(98, param1, param2, param3)) {
                                stackIn_19_0 = 1;
                                decompiledRegionSelector0 = 1;
                                break L0;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                        var7++;
                        if (var9 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  var5_int = param1;
                  break L2;
                }
                if ((var5_int ^ -1) == -81) {
                  L5: {
                    if (!bj.field_d[81]) {
                      stackIn_29_0 = this.b(param2, 0);
                      break L5;
                    } else {
                      stackIn_29_0 = this.a(param2, 113);
                      break L5;
                    }
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackIn_31_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_35_0 = (RuntimeException) (var5);

            stackIn_35_1 = new StringBuilder().append("oe.QA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L6;
            } else {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L6;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_19_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_29_0;
            } else {
              return stackIn_31_0 != 0;
            }
          }
        }
    }

    final String c(byte param0) {
        ce[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        ce var4 = null;
        String var5 = null;
        int var6 = 0;
        Object stackIn_3_0 = null;
        String stackIn_14_0 = null;
        Object stackIn_20_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (this.field_K != null) {
              var2 = this.field_K;
              var3 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var3 >= var2.length) {
                      break L3;
                    } else {
                      var4 = var2[var3];
                      stackIn_20_0 = null;

                      if (var6 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (stackIn_20_0 == var4) {
                            break L4;
                          } else {
                            var5 = var4.c((byte) 113);
                            if (var5 != null) {
                              stackIn_14_0 = (String) (var5);
                              decompiledRegionSelector0 = 2;
                              break L0;
                            } else {
                              break L4;
                            }
                          }
                        }
                        var3++;
                        if (var6 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  L5: {
                    if (param0 == 113) {
                      break L5;
                    } else {
                      this.field_K = (ce[]) null;
                      break L5;
                    }
                  }
                  stackIn_20_0 = null;
                  break L2;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var2_ref), "oe.R(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (String) ((Object) stackIn_3_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (String) ((Object) stackIn_20_0);
          } else {
            return stackIn_14_0;
          }
        }
    }

    final boolean a(int param0, int param1, int param2, ce param3, int param4, int param5, boolean param6) {
        ce[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        ce var10 = null;
        int var11 = 0;
        int stackIn_3_0 = 0;
        ce stackIn_15_0 = null;
        ce stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (this.field_K != null) {
              L1: {
                if (!param6) {
                  break L1;
                } else {
                  field_G = -21;
                  break L1;
                }
              }
              var8 = this.field_K;
              var9 = 0;
              L2: while (true) {
                L3: {
                  if (var8.length <= var9) {
                    break L3;
                  } else {
                    L4: {
                      var10 = var8[var9];
                      if (var10 == null) {
                        break L4;
                      } else {
                        L5: {
                          stackIn_15_0 = (ce) (var10);

                          if (param6) {
                            stackIn_16_0 = (ce) ((Object) stackIn_15_0);
                            stackIn_16_1 = 0;
                            break L5;
                          } else {

                            stackIn_16_0 = (ce) ((Object) stackIn_15_0);
                            stackIn_16_1 = 1;
                            break L5;
                          }
                        }
                        if (!((ce) (Object) stackIn_16_0).a(stackIn_16_1 != 0)) {
                          break L4;
                        } else {
                          if (!var10.a(param0, param1, param2, param3, param4, param5, false)) {
                            break L4;
                          } else {
                            stackIn_21_0 = 1;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        }
                      }
                    }
                    var9++;
                    if (var11 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
                stackIn_24_0 = 0;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8_ref = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var8_ref);

            stackIn_28_1 = new StringBuilder().append("oe.FC(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L6;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L6;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_21_0 != 0;
          } else {
            return stackIn_24_0 != 0;
          }
        }
    }

    private final boolean a(ce param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 > 33) {
              stackIn_4_0 = this.a(param0, 1, 0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("oe.V(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    abstract void g(int param0);

    final void b(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          L0: {
            L1: {
              super.b(param0, param1, param2, param3, -16555);
              if (param4 == -16555) {
                break L1;
              } else {
                oe.b(71, 20);
                break L1;
              }
            }
            this.g(30);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var6), "oe.DA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_M = new String[]{"Showing by rating", "Showing by win percentage"};
        field_I = new vj();
        field_J = new int[8];
    }
}
