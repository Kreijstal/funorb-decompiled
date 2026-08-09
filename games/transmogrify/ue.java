/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class ue {
    static int field_a;
    ol[] field_b;
    static ii[] field_c;

    final int a(int param0) {
        int stackIn_10_0 = 0;
        L0: {
          if (param0 > 124) {
            break L0;
          } else {
            this.b(-103, -63);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == this.field_b) {
              break L2;
            } else {
              if (this.field_b.length <= 0) {
                break L2;
              } else {
                stackIn_10_0 = this.field_b[-1 + this.field_b.length].field_f + -this.field_b[0].field_a;
                break L1;
              }
            }
          }
          stackIn_10_0 = 0;
          break L1;
        }
        return stackIn_10_0;
    }

    final int c(int param0, int param1) {
        ol[] var3;
        int var4;
        ol var5;
        int var6;
        ol[] var7;
        int stackIn_9_0 = 0;
        var6 = Transmogrify.field_A ? 1 : 0;
        var7 = this.field_b;
        var3 = var7;
        var4 = param0;
        L0: while (true) {
          L1: {
            L2: {
              if (var7.length <= var4) {
                break L2;
              } else {
                var5 = var7[var4];
                stackIn_9_0 = param1;

                if (var6 != 0) {
                  break L1;
                } else {
                  if (stackIn_9_0 < var5.field_g.length) {
                    return var5.field_g[param1];
                  } else {
                    param1 = param1 - (var5.field_g.length - 1);
                    var4++;
                    if (var6 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            stackIn_9_0 = 0;
            break L1;
          }
          return stackIn_9_0;
        }
    }

    public static void a(byte param0) {
        field_c = null;
        if (param0 != 18) {
            field_a = -77;
        }
    }

    final int b(byte param0) {
        int var2;
        int var3;
        int var8;
        ol[] var4;
        int var5;
        ol var6;
        int var7;
        L0: {
          var8 = Transmogrify.field_A ? 1 : 0;
          var2 = 119 / ((param0 - 61) / 46);
          var3 = -1;
          if (this.field_b != null) {
            var4 = this.field_b;
            var5 = 0;
            L1: while (true) {
              if (var5 >= var4.length) {
                break L0;
              } else {
                L2: {
                  var6 = var4[var5];
                  if (var6 != null) {
                    var7 = var6.a(-44);
                    if ((var3 ^ -1) <= (var7 ^ -1)) {
                      break L2;
                    } else {
                      var3 = var7;
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                var5++;
                if (var8 == 0) {
                  continue L1;
                } else {
                  break L0;
                }
              }
            }
          } else {
            break L0;
          }
        }
        return var3;
    }

    final static void b(int param0) {
        int incrementValue$0 = 0;
        sj stackIn_6_0 = null;
        String stackIn_14_0 = null;
        sj stackIn_19_0 = null;
        String stackIn_27_0 = null;
        String stackIn_40_0 = null;
        sj stackIn_45_0 = null;
        Object stackIn_47_0 = null;
        sj stackIn_47_1 = null;
        sj stackIn_57_0 = null;
        Object stackIn_68_0 = null;
        sj stackIn_68_1 = null;
        sj stackIn_74_0 = null;
        Object stackIn_78_0 = null;
        sj stackIn_78_1 = null;
        sj stackIn_86_0 = null;
        sj stackIn_94_0 = null;
        Object stackIn_95_0 = null;
        sj stackIn_95_1 = null;
        sj stackIn_99_0 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        Object var1 = null;
        int var1_int = 0;
        sj var1_ref = null;
        RuntimeException var1_ref2 = null;
        int var2_int = 0;
        sj var2 = null;
        String var3 = null;
        int var3_int = 0;
        sj var3_ref = null;
        int var4 = 0;
        sj var5 = null;
        String var6 = null;
        sj var7 = null;
        String var8 = null;
        sj var9 = null;
        String var10 = null;
        sj var11 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var1 = null;
                    var4 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (2 <= va.field_j) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        throw new RuntimeException();
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var1_int = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (-13 >= (var1_int ^ -1)) {
                            statePc = 16;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var5 = od.field_g.field_e[var1_int];
                        stackIn_45_0 = (sj) (var5);
                        stackIn_6_0 = stackIn_45_0;
                        if (var4 != 0) {
                            statePc = 45;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (stackIn_6_0 == null) {
                            statePc = 15;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var5.field_o != od.field_g) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var1_int == var5.field_t) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackIn_14_0 = "; believes itself to be at " + ac.a(38, var5.field_o) + "[" + var5.field_t + "]";
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackIn_14_0 = "";
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var6 = stackIn_14_0;
                        var3 = var6;
                        System.out.println("submission_rack[" + var1_int + "]=" + var5.field_i + " with dest " + var5.field_g + "," + var5.field_p + var6);
                        var5.field_g = -2147483648;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var1_int++;
                        if (var4 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var1_int = 0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (12 <= var1_int) {
                            statePc = 29;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var7 = wk.field_a.field_e[var1_int];
                        stackIn_45_0 = (sj) (var7);
                        stackIn_19_0 = stackIn_45_0;
                        if (var4 != 0) {
                            statePc = 45;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (stackIn_19_0 != null) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (var7.field_o != wk.field_a) {
                            statePc = 26;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if ((var7.field_t ^ -1) != (var1_int ^ -1)) {
                            statePc = 26;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackIn_27_0 = "";
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        stackIn_27_0 = "; believes itself to be at " + ac.a(97, var7.field_o) + "[" + var7.field_t + "]";
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var8 = stackIn_27_0;
                        var3 = var8;
                        System.out.println("carryover_rack[" + var1_int + "]=" + var7.field_i + " with dest " + var7.field_g + "," + var7.field_p + var8);
                        var7.field_g = -2147483648;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var1_int++;
                        if (var4 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var1_int = 0;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (var1_int >= 8) {
                            statePc = 42;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var9 = si.field_i.field_e[var1_int];
                        if (var4 != 0) {
                            statePc = 44;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (null == var9) {
                            statePc = 41;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (si.field_i != var9.field_o) {
                            statePc = 39;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if ((var9.field_t ^ -1) != (var1_int ^ -1)) {
                            statePc = 39;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackIn_40_0 = "";
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        stackIn_40_0 = "; believes itself to be at " + ac.a(49, var9.field_o) + "[" + var9.field_t + "]";
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var10 = stackIn_40_0;
                        var3 = var10;
                        System.out.println("new_rack[" + var1_int + "]=" + var9.field_i + " with dest " + var9.field_g + "," + var9.field_p + var10);
                        var9.field_g = -2147483648;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var1_int++;
                        if (var4 == 0) {
                            statePc = 30;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (param0 == 31370) {
                            statePc = 44;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 43: {
                    return;
                }
                case 44: {
                    try {
                        stackIn_45_0 = (sj) ((Object) ch.field_e.a((byte) -95));
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var1_ref = stackIn_45_0;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        stackIn_47_0 = null;
                        stackIn_47_1 = (sj) (var1_ref);
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (stackIn_47_0 == stackIn_47_1) {
                            statePc = 75;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (var1_ref.field_o != de.field_d) {
                            statePc = 51;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (var4 == 0) {
                            statePc = 73;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (var1_ref.field_g != -2147483648) {
                            statePc = 54;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        System.out.println("Floating tile " + var1_ref.field_i + " with dest " + var1_ref.field_g + "," + var1_ref.field_p + " believes itself to be at " + ac.a(82, var1_ref.field_o) + "[" + var1_ref.field_t + "]");
                        var2_int = 0;
                        var3_int = 0;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (12 <= var3_int) {
                            statePc = 63;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        stackIn_74_0 = wk.field_a.field_e[var3_int];
                        stackIn_57_0 = stackIn_74_0;
                        if (var4 != 0) {
                            statePc = 74;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (stackIn_57_0 == null) {
                            statePc = 60;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var2_int = 1;
                        var1_ref.a(var3_int, 28, wk.field_a);
                        if (var4 == 0) {
                            statePc = 63;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var3_int++;
                        if (var4 == 0) {
                            statePc = 55;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (var2_int == 0) {
                            statePc = 65;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        var3_int = 0;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if ((var3_int ^ -1) <= -9) {
                            statePc = 73;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        stackIn_47_0 = null;
                        stackIn_68_0 = stackIn_47_0;
                        stackIn_47_1 = si.field_i.field_e[var3_int];
                        stackIn_68_1 = stackIn_47_1;
                        if (var4 != 0) {
                            statePc = 47;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if (stackIn_68_0 == stackIn_68_1) {
                            statePc = 70;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        var1_ref.a(var3_int, 28, si.field_i);
                        if (var4 == 0) {
                            statePc = 73;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        var3_int++;
                        if (var4 == 0) {
                            statePc = 66;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        stackIn_74_0 = (sj) ((Object) ch.field_e.a(true));
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        var1_ref = stackIn_74_0;
                        if (var4 == 0) {
                            statePc = 46;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        var1_int = 0;
                        var2_int = 0;
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        if ((var2_int ^ -1) <= -13) {
                            statePc = 83;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        var3_ref = od.field_g.field_e[var2_int];
                        stackIn_95_0 = null;
                        stackIn_78_0 = stackIn_95_0;
                        stackIn_95_1 = (sj) (var3_ref);
                        stackIn_78_1 = stackIn_95_1;
                        if (var4 != 0) {
                            statePc = 95;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if (stackIn_78_0 != stackIn_78_1) {
                            statePc = 81;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        incrementValue$0 = var1_int;
                        var1_int++;
                        var3_ref.a(incrementValue$0, 28, od.field_g);
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        var2_int++;
                        if (var4 == 0) {
                            statePc = 76;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        var2_int = 0;
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        if (-13 >= (var2_int ^ -1)) {
                            statePc = 91;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        var11 = wk.field_a.field_e[var2_int];
                        stackIn_99_0 = (sj) (var11);
                        stackIn_86_0 = stackIn_99_0;
                        if (var4 != 0) {
                            statePc = 99;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        if (stackIn_86_0 != null) {
                            statePc = 89;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        var11.a(var2_int, 28, wk.field_a);
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        var2_int++;
                        if (var4 == 0) {
                            statePc = 84;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        var2_int = 0;
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        if (var2_int >= 8) {
                            statePc = 98;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        stackIn_99_0 = si.field_i.field_e[var2_int];
                        stackIn_94_0 = stackIn_99_0;
                        if (var4 != 0) {
                            statePc = 99;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        var3_ref = stackIn_94_0;
                        stackIn_95_0 = null;
                        stackIn_95_1 = (sj) (var3_ref);
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        if (stackIn_95_0 == stackIn_95_1) {
                            statePc = 97;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        var3_ref.a(var2_int, 28, si.field_i);
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        var2_int++;
                        if (var4 == 0) {
                            statePc = 92;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        stackIn_99_0 = (sj) ((Object) ch.field_e.a((byte) -95));
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        var2 = stackIn_99_0;
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        if (var2 == null) {
                            statePc = 106;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        var2.field_j = var2.field_g;
                        var2.field_q = var2.field_p;
                        var2 = (sj) ((Object) ch.field_e.a(true));
                        if (var4 != 0) {
                            statePc = 106;
                        } else {
                            statePc = 102;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        if (var4 == 0) {
                            statePc = 100;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 105: {
                    var1_ref2 = (RuntimeException) ((Object) caughtException);
                    throw ch.a((Throwable) ((Object) var1_ref2), "ue.E(" + param0 + ')');
                }
                case 106: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static boolean a(int param0, int param1) {
        try {
            int var2_int = 0;
            int stackIn_12_0 = 0;
            int stackIn_14_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            IOException var2 = null;
            if (nf.field_l.field_h < param0) {
              if (null != nk.field_b) {
                try {
                  L0: {
                    var2_int = nk.field_b.a((byte) -125);
                    if (-1 <= (var2_int ^ -1)) {
                      L1: {
                        if (param1 == 0) {
                          break L1;
                        } else {
                          field_a = 89;
                          break L1;
                        }
                      }
                      L2: {
                        if ((var2_int ^ -1) > -1) {
                          break L2;
                        } else {
                          if ((mc.b(true) ^ -1L) >= -30001L) {
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            break L2;
                          }
                        }
                      }
                      pc.a(1);
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      L3: {
                        if (param0 - nf.field_l.field_h < var2_int) {
                          var2_int = -nf.field_l.field_h + param0;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      nk.field_b.a(nf.field_l.field_h, var2_int, nf.field_l.field_g, 5768);
                      wi.field_q = lk.a(param1 ^ 0);
                      nf.field_l.field_h = nf.field_l.field_h + var2_int;
                      if ((param0 ^ -1) < (nf.field_l.field_h ^ -1)) {
                        stackIn_12_0 = 0;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        nf.field_l.field_h = 0;
                        stackIn_14_0 = 1;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var2 = (IOException) (Object) decompiledCaughtException;
                    pc.a(1);
                    decompiledRegionSelector0 = 3;
                    break L4;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  return stackIn_12_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 1) {
                    return stackIn_14_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 2) {
                      return false;
                    } else {
                      return false;
                    }
                  }
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int a(int param0, String param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_28_0 = 0;
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
                    var10 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = 0;
                        var6 = 0;
                        if (param3 == 12) {
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
                        stackIn_3_0 = 126;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    try {
                        var7 = param1.length();
                        var8 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var8 >= var7) {
                            statePc = 25;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var9 = param1.charAt(var8);
                        stackIn_26_0 = var9 ^ -1;
                        stackIn_7_0 = stackIn_26_0;
                        stackIn_26_1 = -61;
                        stackIn_7_1 = stackIn_26_1;
                        if (var10 != 0) {
                            statePc = 26;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (stackIn_7_0 == stackIn_7_1) {
                            statePc = 23;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var9 != 62) {
                            statePc = 14;
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
                        var6 = 0;
                        if (var10 == 0) {
                            statePc = 24;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var6 != 0) {
                            statePc = 24;
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
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var9 != 32) {
                            statePc = 24;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var5_int++;
                        if (var10 == 0) {
                            statePc = 24;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var6 = 1;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var8++;
                        if (var10 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackIn_26_0 = -1;
                        stackIn_26_1 = var5_int ^ -1;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (stackIn_26_0 <= stackIn_26_1) {
                            statePc = 29;
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
                        stackIn_28_0 = (-param2 + param0 << -1172669496) / var5_int;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 28: {
                    return stackIn_28_0;
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
                    return stackIn_30_0;
                }
                case 31: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_34_0 = (RuntimeException) (var5);
                    stackIn_32_0 = stackIn_34_0;
                    stackIn_34_1 = new StringBuilder().append("ue.C(").append(param0).append(',');
                    stackIn_32_1 = stackIn_34_1;
                    if (param1 == null) {
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
                    throw ch.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ',' + param2 + ',' + param3 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int a(int param0, int param1, int param2) {
        int var8;
        int stackIn_28_0 = 0;
        int var4;
        int var5;
        ol var6;
        int var7;
        L0: {
          var8 = Transmogrify.field_A ? 1 : 0;
          if (null == this.field_b) {
            break L0;
          } else {
            if (-1 == (this.field_b.length ^ -1)) {
              break L0;
            } else {
              if ((param2 ^ -1) > (this.field_b[0].field_a ^ -1)) {
                break L0;
              } else {
                if (this.field_b[param1 + this.field_b.length].field_f < param2) {
                  return -1;
                } else {
                  if (1 != this.field_b.length) {
                    var4 = 0;
                    var5 = 0;
                    L1: while (true) {
                      L2: {
                        L3: {
                          if (this.field_b.length <= var5) {
                            break L3;
                          } else {
                            var6 = this.field_b[var5];
                            stackIn_28_0 = param2;

                            if (var8 != 0) {
                              break L2;
                            } else {
                              L4: {
                                if (stackIn_28_0 < var6.field_a) {
                                  break L4;
                                } else {
                                  if (var6.field_f >= param2) {
                                    var7 = var6.b(param1 + 29792, param0);
                                    if (0 != (var7 ^ -1)) {
                                      return var4 + var7;
                                    } else {
                                      return -1;
                                    }
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                              var4 = var4 + (-1 + var6.field_g.length);
                              var5++;
                              if (var8 == 0) {
                                continue L1;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                        stackIn_28_0 = -1;
                        break L2;
                      }
                      return stackIn_28_0;
                    }
                  } else {
                    return this.field_b[0].b(29791, param0);
                  }
                }
              }
            }
          }
        }
        return -1;
    }

    final int b(int param0, int param1) {
        int var3;
        ol var4;
        int var5;
        int stackIn_12_0 = 0;
        L0: {
          var5 = Transmogrify.field_A ? 1 : 0;
          if (param0 == -1) {
            break L0;
          } else {
            this.b(79, -18);
            break L0;
          }
        }
        var3 = 0;
        L1: while (true) {
          L2: {
            L3: {
              if ((var3 ^ -1) <= (this.field_b.length ^ -1)) {
                break L3;
              } else {
                var4 = this.field_b[var3];
                stackIn_12_0 = var4.field_g.length ^ -1;

                if (var5 != 0) {
                  break L2;
                } else {
                  if (stackIn_12_0 < (param1 ^ -1)) {
                    return var3;
                  } else {
                    param1 = param1 - (-1 + var4.field_g.length);
                    var3++;
                    if (var5 == 0) {
                      continue L1;
                    } else {
                      break L3;
                    }
                  }
                }
              }
            }
            stackIn_12_0 = this.field_b.length;
            break L2;
          }
          return stackIn_12_0;
        }
    }

    static {
    }
}
