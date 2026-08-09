/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bn extends IOException {
    static String field_a;
    static ve field_b;
    static r field_c;

    final static boolean a(int param0, int[] param1) {
        int stackIn_5_0 = 0;
        int stackIn_27_0 = 0;
        boolean stackIn_30_0 = false;
        int stackIn_35_0 = 0;
        boolean stackIn_38_0 = false;
        int stackIn_41_0 = 0;
        int stackIn_57_0 = 0;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_62_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        tc var4_ref_tc = null;
        int var4 = 0;
        int var5_int = 0;
        tc var5 = null;
        int var6 = 0;
        int var7 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = TetraLink.field_J;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (li.field_a != qi.field_p) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 58;
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
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return stackIn_5_0 != 0;
                }
                case 6: {
                    try {
                        var2_long = k.a(0);
                        if (param0 == -19161) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        bn.a(-56, 104);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (i.field_f == 0) {
                            statePc = 28;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (-1 < (ti.field_e ^ -1)) {
                            statePc = 15;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var4_ref_tc = (tc) ((Object) v.field_z.c(false));
                        if (null == var4_ref_tc) {
                            statePc = 28;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var4_ref_tc.field_r >= var2_long) {
                            statePc = 28;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var4_ref_tc.b(false);
                        rl.field_d = var4_ref_tc.field_o.length;
                        kb.field_q.field_t = 0;
                        var5_int = 0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (rl.field_d <= var5_int) {
                            statePc = 25;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        kb.field_q.field_u[var5_int] = var4_ref_tc.field_o[var5_int];
                        var5_int++;
                        if (var7 != 0) {
                            statePc = 26;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (var7 == 0) {
                            statePc = 20;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        mh.field_g = lk.field_sb;
                        lk.field_sb = md.field_A;
                        md.field_A = ua.field_c;
                        ua.field_c = var4_ref_tc.field_u;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        stackIn_27_0 = 1;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 27: {
                    return stackIn_27_0 != 0;
                }
                case 28: {
                    try {
                        if ((ti.field_e ^ -1) <= -1) {
                            statePc = 37;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        kb.field_q.field_t = 0;
                        stackIn_38_0 = en.b(97, 1);
                        stackIn_30_0 = stackIn_38_0;
                        if (var7 != 0) {
                            statePc = 38;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (!stackIn_30_0) {
                            statePc = 34;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        stackIn_35_0 = 0;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 35: {
                    return stackIn_35_0 != 0;
                }
                case 36: {
                    try {
                        ti.field_e = kb.field_q.d(false);
                        kb.field_q.field_t = 0;
                        rl.field_d = param1[ti.field_e];
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        stackIn_38_0 = ua.b(-73);
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (!stackIn_38_0) {
                            statePc = 40;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        stackIn_41_0 = 0;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 41: {
                    return stackIn_41_0 != 0;
                }
                case 42: {
                    try {
                        if (i.field_f == 0) {
                            statePc = 56;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var4 = i.field_f;
                        if (0.0 == jg.field_f) {
                            statePc = 48;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var4 = (int)((double)var4 + ca.field_i.nextGaussian() * jg.field_f);
                        if (var4 < 0) {
                            statePc = 47;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var4 = 0;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var5 = new tc(var2_long + (long)var4, ti.field_e, new byte[rl.field_d]);
                        var6 = 0;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if ((var6 ^ -1) <= (rl.field_d ^ -1)) {
                            statePc = 54;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var5.field_o[var6] = kb.field_q.field_u[var6];
                        var6++;
                        if (var7 != 0) {
                            statePc = 55;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (var7 == 0) {
                            statePc = 49;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        v.field_z.a(var5, false);
                        ti.field_e = -1;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (var7 == 0) {
                            statePc = 28;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        mh.field_g = lk.field_sb;
                        lk.field_sb = md.field_A;
                        md.field_A = ua.field_c;
                        ua.field_c = ti.field_e;
                        ti.field_e = -1;
                        stackIn_57_0 = 1;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 57: {
                    return stackIn_57_0 != 0;
                }
                case 58: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_61_0 = (RuntimeException) (var2);
                    stackIn_59_0 = stackIn_61_0;
                    stackIn_61_1 = new StringBuilder().append("bn.B(").append(param0).append(',');
                    stackIn_59_1 = stackIn_61_1;
                    if (param1 == null) {
                        statePc = 61;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    stackIn_62_0 = (RuntimeException) ((Object) stackIn_59_0);
                    stackIn_62_1 = (StringBuilder) ((Object) stackIn_59_1);
                    stackIn_62_2 = "{...}";
                    statePc = 62;
                    continue stateLoop;
                }
                case 61: {
                    stackIn_62_0 = (RuntimeException) ((Object) stackIn_61_0);
                    stackIn_62_1 = (StringBuilder) ((Object) stackIn_61_1);
                    stackIn_62_2 = "null";
                    statePc = 62;
                    continue stateLoop;
                }
                case 62: {
                    throw oi.a((Throwable) ((Object) stackIn_62_0), stackIn_62_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    bn(String param0) {
        super(param0);
    }

    final static boolean a(int param0) {
        RuntimeException var1 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 21747) {
                break L1;
              } else {
                bn.a(-95, 3, (int[]) null, -127, 20, (int[]) null, (kc) null, 45, (int[]) null, -111, -45, (int[]) null, (int[]) null, 93, -71, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, 104, (byte[]) null, (int[]) null);
                break L1;
              }
            }
            stackIn_4_0 = mb.field_u.a(param0 + -21738);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var1), "bn.E(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final static boolean a(int param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_29_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 >= 0) {
              if (1582 <= param1) {
                if ((param1 % 4 ^ -1) == -1) {
                  if ((param1 % 100 ^ -1) == -1) {
                    if ((param1 % 400 ^ -1) == -1) {
                      L1: {
                        if (param0 == 1) {
                          break L1;
                        } else {
                          field_b = (ve) null;
                          break L1;
                        }
                      }
                      stackIn_29_0 = 1;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    } else {
                      stackIn_24_0 = 0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    stackIn_21_0 = 1;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackIn_18_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                L2: {
                  if (param1 % 4 != 0) {
                    stackIn_15_0 = 0;
                    break L2;
                  } else {
                    stackIn_15_0 = 1;
                    break L2;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              L3: {
                if (((param1 + 1) % 4 ^ -1) != -1) {
                  stackIn_7_0 = 0;
                  break L3;
                } else {
                  stackIn_7_0 = 1;
                  break L3;
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var2), "bn.D(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_15_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_18_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_21_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_24_0 != 0;
                } else {
                  return stackIn_29_0 != 0;
                }
              }
            }
          }
        }
    }

    public static void b(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              if (param0 == -26623) {
                break L1;
              } else {
                field_c = (r) null;
                break L1;
              }
            }
            field_a = null;
            field_c = null;
            field_b = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var1), "bn.A(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, int[] param2, int param3, int param4, int[] param5, kc param6, int param7, int[] param8, int param9, int param10, int[] param11, int[] param12, int param13, int param14, int[] param15, int[] param16, int[] param17, int[] param18, int[] param19, int[] param20, int param21, byte[] param22, int[] param23) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int fieldTemp$16 = 0;
        int fieldTemp$17 = 0;
        int fieldTemp$18 = 0;
        int fieldTemp$19 = 0;
        int fieldTemp$20 = 0;
        int fieldTemp$21 = 0;
        int fieldTemp$22 = 0;
        int fieldTemp$23 = 0;
        byte[] fieldTemp$24 = null;
        short dupTemp$25 = 0;
        short dupTemp$26 = 0;
        short dupTemp$27 = 0;
        int fieldTemp$28 = 0;
        int fieldTemp$29 = 0;
        int fieldTemp$30 = 0;
        int fieldTemp$31 = 0;
        int fieldTemp$32 = 0;
        int fieldTemp$33 = 0;
        byte[] fieldTemp$34 = null;
        byte[] fieldTemp$35 = null;
        short[] fieldTemp$36 = null;
        byte[] fieldTemp$37 = null;
        byte[] fieldTemp$38 = null;
        byte[] fieldTemp$39 = null;
        short[] fieldTemp$40 = null;
        short[] fieldTemp$41 = null;
        int fieldTemp$42 = 0;
        int fieldTemp$43 = 0;
        int fieldTemp$44 = 0;
        int fieldTemp$45 = 0;
        int fieldTemp$46 = 0;
        int fieldTemp$47 = 0;
        int stackIn_72_0 = 0;
        int stackIn_72_1 = 0;
        int stackIn_98_0 = 0;
        int stackIn_105_0 = 0;
        int stackIn_249_0 = 0;
        int stackIn_249_1 = 0;
        RuntimeException stackIn_338_0 = null;
        StringBuilder stackIn_338_1 = null;
        RuntimeException stackIn_340_0 = null;
        StringBuilder stackIn_340_1 = null;
        RuntimeException stackIn_341_0 = null;
        StringBuilder stackIn_341_1 = null;
        String stackIn_341_2 = null;
        RuntimeException stackIn_342_0 = null;
        StringBuilder stackIn_342_1 = null;
        RuntimeException stackIn_344_0 = null;
        StringBuilder stackIn_344_1 = null;
        RuntimeException stackIn_345_0 = null;
        StringBuilder stackIn_345_1 = null;
        String stackIn_345_2 = null;
        RuntimeException stackIn_346_0 = null;
        StringBuilder stackIn_346_1 = null;
        RuntimeException stackIn_348_0 = null;
        StringBuilder stackIn_348_1 = null;
        RuntimeException stackIn_349_0 = null;
        StringBuilder stackIn_349_1 = null;
        String stackIn_349_2 = null;
        RuntimeException stackIn_350_0 = null;
        StringBuilder stackIn_350_1 = null;
        RuntimeException stackIn_352_0 = null;
        StringBuilder stackIn_352_1 = null;
        RuntimeException stackIn_353_0 = null;
        StringBuilder stackIn_353_1 = null;
        String stackIn_353_2 = null;
        RuntimeException stackIn_354_0 = null;
        StringBuilder stackIn_354_1 = null;
        RuntimeException stackIn_356_0 = null;
        StringBuilder stackIn_356_1 = null;
        RuntimeException stackIn_357_0 = null;
        StringBuilder stackIn_357_1 = null;
        String stackIn_357_2 = null;
        RuntimeException stackIn_358_0 = null;
        StringBuilder stackIn_358_1 = null;
        RuntimeException stackIn_360_0 = null;
        StringBuilder stackIn_360_1 = null;
        RuntimeException stackIn_361_0 = null;
        StringBuilder stackIn_361_1 = null;
        String stackIn_361_2 = null;
        RuntimeException stackIn_362_0 = null;
        StringBuilder stackIn_362_1 = null;
        RuntimeException stackIn_364_0 = null;
        StringBuilder stackIn_364_1 = null;
        RuntimeException stackIn_365_0 = null;
        StringBuilder stackIn_365_1 = null;
        String stackIn_365_2 = null;
        RuntimeException stackIn_366_0 = null;
        StringBuilder stackIn_366_1 = null;
        RuntimeException stackIn_368_0 = null;
        StringBuilder stackIn_368_1 = null;
        RuntimeException stackIn_369_0 = null;
        StringBuilder stackIn_369_1 = null;
        String stackIn_369_2 = null;
        RuntimeException stackIn_370_0 = null;
        StringBuilder stackIn_370_1 = null;
        RuntimeException stackIn_372_0 = null;
        StringBuilder stackIn_372_1 = null;
        RuntimeException stackIn_373_0 = null;
        StringBuilder stackIn_373_1 = null;
        String stackIn_373_2 = null;
        RuntimeException stackIn_374_0 = null;
        StringBuilder stackIn_374_1 = null;
        RuntimeException stackIn_376_0 = null;
        StringBuilder stackIn_376_1 = null;
        RuntimeException stackIn_377_0 = null;
        StringBuilder stackIn_377_1 = null;
        String stackIn_377_2 = null;
        RuntimeException stackIn_378_0 = null;
        StringBuilder stackIn_378_1 = null;
        RuntimeException stackIn_380_0 = null;
        StringBuilder stackIn_380_1 = null;
        RuntimeException stackIn_381_0 = null;
        StringBuilder stackIn_381_1 = null;
        String stackIn_381_2 = null;
        RuntimeException stackIn_382_0 = null;
        StringBuilder stackIn_382_1 = null;
        RuntimeException stackIn_384_0 = null;
        StringBuilder stackIn_384_1 = null;
        RuntimeException stackIn_385_0 = null;
        StringBuilder stackIn_385_1 = null;
        String stackIn_385_2 = null;
        RuntimeException stackIn_386_0 = null;
        StringBuilder stackIn_386_1 = null;
        RuntimeException stackIn_388_0 = null;
        StringBuilder stackIn_388_1 = null;
        RuntimeException stackIn_389_0 = null;
        StringBuilder stackIn_389_1 = null;
        String stackIn_389_2 = null;
        RuntimeException stackIn_390_0 = null;
        StringBuilder stackIn_390_1 = null;
        RuntimeException stackIn_392_0 = null;
        StringBuilder stackIn_392_1 = null;
        RuntimeException stackIn_393_0 = null;
        StringBuilder stackIn_393_1 = null;
        String stackIn_393_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        int statePc = 0;
        int var24_int = 0;
        int[] var24 = null;
        RuntimeException var24_ref = null;
        int[] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        int var46 = 0;
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        int var52 = 0;
        int var53 = 0;
        int[] var54 = null;
        int var55 = 0;
        int var56 = 0;
        int var57 = 0;
        int var58 = 0;
        int var59 = 0;
        int var60 = 0;
        int var61 = 0;
        int var62 = 0;
        int var63 = 0;
        int var64 = 0;
        int var65 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var65 = TetraLink.field_J;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (a.field_b == null) {
                        statePc = 7;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if ((param21 ^ -1) < (a.field_b.length ^ -1)) {
                        statePc = 7;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var24_int = 100 + param21;
                    uj.field_q = new int[var24_int];
                    a.field_b = new int[var24_int];
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (rl.field_c == null) {
                        statePc = 12;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if ((rl.field_c.length ^ -1) <= (param7 * 2 ^ -1)) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var24_int = 2 * param7 + 100;
                    rl.field_c = new int[var24_int];
                    gm.field_b = new int[var24_int];
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    var24 = a.field_b;
                    if (lm.field_f != null) {
                        statePc = 16;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    lm.field_f = new int[16];
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    var25 = uj.field_q;
                    var26 = lm.field_f;
                    var27 = rl.field_c;
                    mf.field_u = 0;
                    var28 = gm.field_b;
                    k.field_e = 0;
                    fh.field_g = 0;
                    le.field_Xb = 0;
                    if (null == ic.field_c) {
                        statePc = 22;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if ((ic.field_c.length ^ -1) > (param21 ^ -1)) {
                        statePc = 22;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 22: {
                    ic.field_c = new int[param21 - -100];
                    bd.field_a = new int[100 + param21];
                    nn.field_S = new int[100 + param21];
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    if (null == ja.field_l) {
                        statePc = 27;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    if (ja.field_l.length >= param7) {
                        statePc = 29;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    ja.field_l = new int[100 + param7];
                    db.field_f = new int[param7 + 100];
                    wk.field_b = new int[param7 + 100];
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    if (null == param18) {
                        statePc = 38;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if (mc.field_m == null) {
                        statePc = 36;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    if (mc.field_m.length >= param7) {
                        statePc = 38;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    rk.field_b = new int[100 + param7];
                    mc.field_m = new int[param7 + 100];
                    tc.field_w = new int[100 + param7];
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    if (null == am.field_b) {
                        statePc = 42;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    if ((param21 ^ -1) >= (am.field_b.length ^ -1)) {
                        statePc = 44;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    cm.field_q = new int[100 + param21];
                    am.field_b = new int[100 + param21];
                    gd.field_Zb = new int[param21 - -100];
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    if (null == ve.field_a) {
                        statePc = 50;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    if (ve.field_a.length < param7) {
                        statePc = 50;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 50: {
                    kj.field_d = new int[100 + param7];
                    ve.field_a = new int[100 + param7];
                    hd.field_D = new int[100 + param7];
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    if (null == param18) {
                        statePc = 61;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    if (ga.field_b == null) {
                        statePc = 60;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    if (param7 > ga.field_b.length) {
                        statePc = 60;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 60: {
                    ga.field_b = new int[param7 - -100];
                    fj.field_p = new int[param7 - -100];
                    om.field_Yb = new int[param7 + 100];
                    statePc = 61;
                    continue stateLoop;
                }
                case 61: {
                    var29 = 0;
                    var30 = 0;
                    var31 = 0;
                    var33 = 0;
                    statePc = 62;
                    continue stateLoop;
                }
                case 62: {
                    if ((param21 ^ -1) >= (var33 ^ -1)) {
                        statePc = 64;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    var24[var33] = -1;
                    var33++;
                    if (var65 == 0) {
                        statePc = 62;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    var32 = 0;
                    if (param13 > 18) {
                        statePc = 66;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    return;
                }
                case 66: {
                    var33 = 0;
                    statePc = 67;
                    continue stateLoop;
                }
                case 67: {
                    if (param21 <= var33) {
                        statePc = 69;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    var25[var33] = -1;
                    var33++;
                    if (var65 == 0) {
                        statePc = 67;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    var35 = 0;
                    var36 = 0;
                    var37 = 0;
                    var38 = 0;
                    statePc = 70;
                    continue stateLoop;
                }
                case 70: {
                    if ((var38 ^ -1) <= (param7 ^ -1)) {
                        statePc = 248;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    var39 = param2[var38];
                    var40 = param23[var38];
                    var41 = param20[var38];
                    var42 = param12[var39];
                    var43 = param5[var39];
                    var44 = param11[var39];
                    var45 = param12[var40];
                    var46 = param5[var40];
                    var47 = param11[var40];
                    var48 = param12[var41];
                    var49 = param5[var41];
                    var50 = param11[var41];
                    var51 = param3 * (-param14 + var44) + param4 * (-param1 + var42) - -((-param0 + var43) * param9);
                    var52 = param9 * (var46 + -param0) + ((-param1 + var45) * param4 + param3 * (var47 + -param14));
                    var53 = param4 * (-param1 + var48) - -(param9 * (var49 + -param0)) + param3 * (-param14 + var50);
                    stackIn_249_0 = (var53 | (var52 | var51)) ^ -1;
                    stackIn_72_0 = stackIn_249_0;
                    stackIn_249_1 = -1;
                    stackIn_72_1 = stackIn_249_1;
                    if (var65 != 0) {
                        statePc = 249;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    if (stackIn_72_0 <= stackIn_72_1) {
                        statePc = 235;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    if (((-var53 | (-var52 | -var51)) ^ -1) <= -1) {
                        statePc = 222;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    if ((ic.field_c.length ^ -1) <= (4 + (param21 - -var29) ^ -1)) {
                        statePc = 82;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    var54 = new int[param21 + var29 + 104];
                    rd.a(ic.field_c, 0, var54, 0, k.field_e);
                    ic.field_c = var54;
                    var54 = new int[var29 + (param21 + 104)];
                    rd.a(nn.field_S, 0, var54, 0, k.field_e);
                    nn.field_S = var54;
                    var54 = new int[104 + param21 - -var29];
                    rd.a(bd.field_a, 0, var54, 0, k.field_e);
                    bd.field_a = var54;
                    statePc = 82;
                    continue stateLoop;
                }
                case 82: {
                    if ((am.field_b.length ^ -1) <= (var31 + (param21 + 4) ^ -1)) {
                        statePc = 84;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    var54 = new int[104 + param21 - -var31];
                    rd.a(am.field_b, 0, var54, 0, mf.field_u);
                    am.field_b = var54;
                    var54 = new int[104 + param21 + var31];
                    rd.a(gd.field_Zb, 0, var54, 0, mf.field_u);
                    gd.field_Zb = var54;
                    var54 = new int[104 + (var31 + param21)];
                    rd.a(cm.field_q, 0, var54, 0, mf.field_u);
                    cm.field_q = var54;
                    statePc = 84;
                    continue stateLoop;
                }
                case 84: {
                    var55 = k.field_e;
                    var56 = mf.field_u;
                    var57 = 0;
                    var58 = 0;
                    if (param22 != null) {
                        statePc = 99;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    if (null != param17) {
                        statePc = 89;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    var64 = 1;
                    if (var65 == 0) {
                        statePc = 106;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    if ((param17[var38] ^ -1) == 0) {
                        statePc = 97;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    if (1 == (param17[var38] ^ -1)) {
                        statePc = 97;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    stackIn_98_0 = 1;
                    statePc = 98;
                    continue stateLoop;
                }
                case 97: {
                    stackIn_98_0 = 0;
                    statePc = 98;
                    continue stateLoop;
                }
                case 98: {
                    var64 = stackIn_98_0;
                    if (var65 == 0) {
                        statePc = 106;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    if (-1 != (1 & param22[var38] ^ -1)) {
                        statePc = 104;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    stackIn_105_0 = 1;
                    statePc = 105;
                    continue stateLoop;
                }
                case 104: {
                    stackIn_105_0 = 0;
                    statePc = 105;
                    continue stateLoop;
                }
                case 105: {
                    var64 = stackIn_105_0;
                    statePc = 106;
                    continue stateLoop;
                }
                case 106: {
                    if (param18 == null) {
                        statePc = 112;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    if (var64 == 0) {
                        statePc = 111;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    var36 = 65535 & param8[var38];
                    var37 = 65535 & param17[var38];
                    var35 = param18[var38] & 65535;
                    if (var65 == 0) {
                        statePc = 112;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    var37 = param17[var38];
                    var36 = param8[var38];
                    var35 = param18[var38];
                    statePc = 112;
                    continue stateLoop;
                }
                case 112: {
                    if (0 <= var51) {
                        statePc = 115;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 115: {
                    var34 = var24[var39];
                    if ((var34 ^ -1) <= -1) {
                        statePc = 117;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 116: {
                    incrementValue$0 = var55;
                    var55++;
                    var34 = incrementValue$0;
                    var24[var39] = incrementValue$0;
                    ic.field_c[var34] = var42;
                    nn.field_S[var34] = var43;
                    bd.field_a[var34] = var44;
                    statePc = 117;
                    continue stateLoop;
                }
                case 117: {
                    var26[var57 + 0] = var34;
                    var26[8 - -var57] = var35;
                    var57++;
                    statePc = 118;
                    continue stateLoop;
                }
                case 118: {
                    if (0 < var51) {
                        statePc = 124;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    var34 = var25[var39];
                    if ((var34 ^ -1) > -1) {
                        statePc = 122;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 122: {
                    incrementValue$1 = var56;
                    var56++;
                    var34 = incrementValue$1;
                    var25[var39] = incrementValue$1;
                    am.field_b[var34] = var42;
                    gd.field_Zb[var34] = var43;
                    cm.field_q[var34] = var44;
                    statePc = 123;
                    continue stateLoop;
                }
                case 123: {
                    var26[4 - -var58] = var34;
                    var26[var58 + 12] = var35;
                    var58++;
                    statePc = 124;
                    continue stateLoop;
                }
                case 124: {
                    if (var51 == 0) {
                        statePc = 132;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 125: {
                    if ((var52 ^ -1) == -1) {
                        statePc = 132;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    if ((var52 ^ var51 ^ -1) <= -1) {
                        statePc = 132;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 131: {
                    var63 = -var51 + var52;
                    var61 = (var44 * var52 + -(var51 * var47)) / var63;
                    incrementValue$2 = var55;
                    var55++;
                    var34 = incrementValue$2;
                    var60 = (var52 * var43 + -(var51 * var46)) / var63;
                    var59 = (-(var51 * var45) + var42 * var52) / var63;
                    var62 = (var52 * var35 - var51 * var36) / var63;
                    ic.field_c[var34] = var59;
                    nn.field_S[var34] = var60;
                    bd.field_a[var34] = var61;
                    var26[0 + var57] = var34;
                    var26[var57 + 8] = var62;
                    var57++;
                    incrementValue$3 = var56;
                    var56++;
                    var34 = incrementValue$3;
                    am.field_b[var34] = var59;
                    gd.field_Zb[var34] = var60;
                    cm.field_q[var34] = var61;
                    var26[var58 + 4] = var34;
                    var26[12 + var58] = var62;
                    var58++;
                    statePc = 132;
                    continue stateLoop;
                }
                case 132: {
                    if (var52 < 0) {
                        statePc = 136;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 133: {
                    var34 = var24[var40];
                    if (-1 >= (var34 ^ -1)) {
                        statePc = 135;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 134: {
                    incrementValue$4 = var55;
                    var55++;
                    var34 = incrementValue$4;
                    var24[var40] = incrementValue$4;
                    ic.field_c[var34] = var45;
                    nn.field_S[var34] = var46;
                    bd.field_a[var34] = var47;
                    statePc = 135;
                    continue stateLoop;
                }
                case 135: {
                    var26[0 + var57] = var34;
                    var26[8 - -var57] = var36;
                    var57++;
                    statePc = 136;
                    continue stateLoop;
                }
                case 136: {
                    if (var52 > 0) {
                        statePc = 140;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 137: {
                    var34 = var25[var40];
                    if ((var34 ^ -1) <= -1) {
                        statePc = 139;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    incrementValue$5 = var56;
                    var56++;
                    var34 = incrementValue$5;
                    var25[var40] = incrementValue$5;
                    am.field_b[var34] = var45;
                    gd.field_Zb[var34] = var46;
                    cm.field_q[var34] = var47;
                    statePc = 139;
                    continue stateLoop;
                }
                case 139: {
                    var26[var58 + 4] = var34;
                    var26[12 + var58] = var36;
                    var58++;
                    statePc = 140;
                    continue stateLoop;
                }
                case 140: {
                    if (0 == var52) {
                        statePc = 148;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 141: {
                    if (0 == var53) {
                        statePc = 148;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 144: {
                    if ((var52 ^ var53 ^ -1) <= -1) {
                        statePc = 148;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 147: {
                    var63 = -var52 + var53;
                    var59 = (var45 * var53 - var48 * var52) / var63;
                    var62 = (-(var52 * var37) + var53 * var36) / var63;
                    var60 = (var46 * var53 + -(var52 * var49)) / var63;
                    var61 = (-(var50 * var52) + var47 * var53) / var63;
                    incrementValue$6 = var55;
                    var55++;
                    var34 = incrementValue$6;
                    ic.field_c[var34] = var59;
                    nn.field_S[var34] = var60;
                    bd.field_a[var34] = var61;
                    var26[0 + var57] = var34;
                    var26[var57 + 8] = var62;
                    var57++;
                    incrementValue$7 = var56;
                    var56++;
                    var34 = incrementValue$7;
                    am.field_b[var34] = var59;
                    gd.field_Zb[var34] = var60;
                    cm.field_q[var34] = var61;
                    var26[4 + var58] = var34;
                    var26[12 - -var58] = var62;
                    var58++;
                    statePc = 148;
                    continue stateLoop;
                }
                case 148: {
                    if (var53 < 0) {
                        statePc = 154;
                    } else {
                        statePc = 149;
                    }
                    continue stateLoop;
                }
                case 149: {
                    var34 = var24[var41];
                    if ((var34 ^ -1) > -1) {
                        statePc = 152;
                    } else {
                        statePc = 153;
                    }
                    continue stateLoop;
                }
                case 152: {
                    incrementValue$8 = var55;
                    var55++;
                    var34 = incrementValue$8;
                    var24[var41] = incrementValue$8;
                    ic.field_c[var34] = var48;
                    nn.field_S[var34] = var49;
                    bd.field_a[var34] = var50;
                    statePc = 153;
                    continue stateLoop;
                }
                case 153: {
                    var26[0 + var57] = var34;
                    var26[8 + var57] = var37;
                    var57++;
                    statePc = 154;
                    continue stateLoop;
                }
                case 154: {
                    if (-1 > (var53 ^ -1)) {
                        statePc = 160;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 155: {
                    var34 = var25[var41];
                    if (0 > var34) {
                        statePc = 158;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 158: {
                    incrementValue$9 = var56;
                    var56++;
                    var34 = incrementValue$9;
                    var25[var41] = incrementValue$9;
                    am.field_b[var34] = var48;
                    gd.field_Zb[var34] = var49;
                    cm.field_q[var34] = var50;
                    statePc = 159;
                    continue stateLoop;
                }
                case 159: {
                    var26[var58 + 4] = var34;
                    var26[var58 + 12] = var37;
                    var58++;
                    statePc = 160;
                    continue stateLoop;
                }
                case 160: {
                    if (0 == (var51 | var53)) {
                        statePc = 167;
                    } else {
                        statePc = 161;
                    }
                    continue stateLoop;
                }
                case 161: {
                    if ((var51 ^ var53 ^ -1) > -1) {
                        statePc = 166;
                    } else {
                        statePc = 167;
                    }
                    continue stateLoop;
                }
                case 166: {
                    var63 = -var53 + var51;
                    var60 = (-(var53 * var43) + var51 * var49) / var63;
                    incrementValue$10 = var55;
                    var55++;
                    var34 = incrementValue$10;
                    var61 = (-(var53 * var44) + var50 * var51) / var63;
                    var62 = (-(var53 * var35) + var51 * var37) / var63;
                    var59 = (-(var53 * var42) + var51 * var48) / var63;
                    ic.field_c[var34] = var59;
                    nn.field_S[var34] = var60;
                    bd.field_a[var34] = var61;
                    var26[var57 + 0] = var34;
                    var26[8 - -var57] = var62;
                    var57++;
                    incrementValue$11 = var56;
                    var56++;
                    var34 = incrementValue$11;
                    am.field_b[var34] = var59;
                    gd.field_Zb[var34] = var60;
                    cm.field_q[var34] = var61;
                    var26[var58 + 4] = var34;
                    var26[12 + var58] = var62;
                    var58++;
                    statePc = 167;
                    continue stateLoop;
                }
                case 167: {
                    var29 = var29 + (-k.field_e + var55);
                    var33 = fh.field_g;
                    k.field_e = var55;
                    if ((ja.field_l.length ^ -1) <= (-2 + var57 + var30 + param7 ^ -1)) {
                        statePc = 172;
                    } else {
                        statePc = 168;
                    }
                    continue stateLoop;
                }
                case 168: {
                    var54 = new int[param7 + var30 + (var57 + 98)];
                    rd.a(ja.field_l, 0, var54, 0, var33);
                    ja.field_l = var54;
                    var54 = new int[var57 + (param7 - -var30) + 98];
                    rd.a(db.field_f, 0, var54, 0, var33);
                    db.field_f = var54;
                    var54 = new int[98 + var57 + (var30 + param7)];
                    rd.a(wk.field_b, 0, var54, 0, var33);
                    wk.field_b = var54;
                    if (null != param18) {
                        statePc = 171;
                    } else {
                        statePc = 172;
                    }
                    continue stateLoop;
                }
                case 171: {
                    var54 = new int[98 + (var30 + (param7 + var57))];
                    rd.a(mc.field_m, 0, var54, 0, var33);
                    mc.field_m = var54;
                    var54 = new int[var30 + (param7 + var57 - -98)];
                    rd.a(tc.field_w, 0, var54, 0, var33);
                    tc.field_w = var54;
                    var54 = new int[98 + var57 + (var30 + param7)];
                    rd.a(rk.field_b, 0, var54, 0, var33);
                    rk.field_b = var54;
                    statePc = 172;
                    continue stateLoop;
                }
                case 172: {
                    ja.field_l[var33] = var26[0];
                    db.field_f[var33] = var26[1];
                    wk.field_b[var33] = var26[2];
                    if (param18 != null) {
                        statePc = 175;
                    } else {
                        statePc = 181;
                    }
                    continue stateLoop;
                }
                case 175: {
                    if (var64 != 0) {
                        statePc = 179;
                    } else {
                        statePc = 176;
                    }
                    continue stateLoop;
                }
                case 176: {
                    mc.field_m[var33] = var35;
                    rk.field_b[var33] = var37;
                    if (var65 == 0) {
                        statePc = 181;
                    } else {
                        statePc = 179;
                    }
                    continue stateLoop;
                }
                case 179: {
                    mc.field_m[var33] = var26[8];
                    tc.field_w[var33] = var26[9];
                    rk.field_b[var33] = var26[10];
                    statePc = 181;
                    continue stateLoop;
                }
                case 181: {
                    incrementValue$12 = var33;
                    var33++;
                    var27[incrementValue$12] = var38;
                    if (4 != var57) {
                        statePc = 194;
                    } else {
                        statePc = 182;
                    }
                    continue stateLoop;
                }
                case 182: {
                    ja.field_l[var33] = var26[2];
                    db.field_f[var33] = var26[3];
                    wk.field_b[var33] = var26[0];
                    if (param18 != null) {
                        statePc = 187;
                    } else {
                        statePc = 193;
                    }
                    continue stateLoop;
                }
                case 187: {
                    if (var64 == 0) {
                        statePc = 191;
                    } else {
                        statePc = 188;
                    }
                    continue stateLoop;
                }
                case 188: {
                    mc.field_m[var33] = var26[10];
                    tc.field_w[var33] = var26[11];
                    rk.field_b[var33] = var26[8];
                    if (var65 == 0) {
                        statePc = 193;
                    } else {
                        statePc = 191;
                    }
                    continue stateLoop;
                }
                case 191: {
                    mc.field_m[var33] = var35;
                    rk.field_b[var33] = var37;
                    statePc = 193;
                    continue stateLoop;
                }
                case 193: {
                    var30++;
                    incrementValue$13 = var33;
                    var33++;
                    var27[incrementValue$13] = var38;
                    statePc = 194;
                    continue stateLoop;
                }
                case 194: {
                    fh.field_g = var33;
                    var31 = var31 + (-mf.field_u + var56);
                    mf.field_u = var56;
                    var33 = le.field_Xb;
                    if ((var58 + param7 - (-var32 - -2) ^ -1) < (ve.field_a.length ^ -1)) {
                        statePc = 197;
                    } else {
                        statePc = 199;
                    }
                    continue stateLoop;
                }
                case 197: {
                    var54 = new int[var58 + (var32 + (param7 + 98))];
                    rd.a(ve.field_a, 0, var54, 0, var33);
                    ve.field_a = var54;
                    var54 = new int[98 + var58 + (param7 + var32)];
                    rd.a(hd.field_D, 0, var54, 0, var33);
                    hd.field_D = var54;
                    var54 = new int[param7 - (-var32 + -var58) - -98];
                    rd.a(kj.field_d, 0, var54, 0, var33);
                    kj.field_d = var54;
                    if (null == param18) {
                        statePc = 199;
                    } else {
                        statePc = 198;
                    }
                    continue stateLoop;
                }
                case 198: {
                    var54 = new int[param7 + var32 + (var58 + 98)];
                    rd.a(ga.field_b, 0, var54, 0, var33);
                    ga.field_b = var54;
                    var54 = new int[98 + var58 + (param7 + var32)];
                    rd.a(fj.field_p, 0, var54, 0, var33);
                    fj.field_p = var54;
                    var54 = new int[98 + (param7 + var32) - -var58];
                    rd.a(om.field_Yb, 0, var54, 0, var33);
                    om.field_Yb = var54;
                    statePc = 199;
                    continue stateLoop;
                }
                case 199: {
                    ve.field_a[var33] = var26[4];
                    hd.field_D[var33] = var26[5];
                    kj.field_d[var33] = var26[6];
                    if (null == param18) {
                        statePc = 208;
                    } else {
                        statePc = 200;
                    }
                    continue stateLoop;
                }
                case 200: {
                    if (var64 == 0) {
                        statePc = 206;
                    } else {
                        statePc = 203;
                    }
                    continue stateLoop;
                }
                case 203: {
                    ga.field_b[var33] = var26[12];
                    fj.field_p[var33] = var26[13];
                    om.field_Yb[var33] = var26[14];
                    if (var65 == 0) {
                        statePc = 208;
                    } else {
                        statePc = 206;
                    }
                    continue stateLoop;
                }
                case 206: {
                    ga.field_b[var33] = var35;
                    om.field_Yb[var33] = var37;
                    statePc = 208;
                    continue stateLoop;
                }
                case 208: {
                    incrementValue$14 = var33;
                    var33++;
                    var28[incrementValue$14] = var38;
                    if (var58 == 4) {
                        statePc = 211;
                    } else {
                        statePc = 221;
                    }
                    continue stateLoop;
                }
                case 211: {
                    ve.field_a[var33] = var26[6];
                    hd.field_D[var33] = var26[7];
                    kj.field_d[var33] = var26[4];
                    if (param18 != null) {
                        statePc = 214;
                    } else {
                        statePc = 220;
                    }
                    continue stateLoop;
                }
                case 214: {
                    if (var64 != 0) {
                        statePc = 218;
                    } else {
                        statePc = 215;
                    }
                    continue stateLoop;
                }
                case 215: {
                    ga.field_b[var33] = var35;
                    om.field_Yb[var33] = var37;
                    if (var65 == 0) {
                        statePc = 220;
                    } else {
                        statePc = 218;
                    }
                    continue stateLoop;
                }
                case 218: {
                    ga.field_b[var33] = var26[14];
                    fj.field_p[var33] = var26[15];
                    om.field_Yb[var33] = var26[12];
                    statePc = 220;
                    continue stateLoop;
                }
                case 220: {
                    incrementValue$15 = var33;
                    var33++;
                    var28[incrementValue$15] = var38;
                    var32++;
                    statePc = 221;
                    continue stateLoop;
                }
                case 221: {
                    le.field_Xb = var33;
                    if (var65 == 0) {
                        statePc = 247;
                    } else {
                        statePc = 222;
                    }
                    continue stateLoop;
                }
                case 222: {
                    fieldTemp$16 = le.field_Xb;
                    le.field_Xb = le.field_Xb + 1;
                    var33 = fieldTemp$16;
                    var34 = var25[var39];
                    if (-1 >= (var34 ^ -1)) {
                        statePc = 224;
                    } else {
                        statePc = 223;
                    }
                    continue stateLoop;
                }
                case 223: {
                    fieldTemp$17 = mf.field_u;
                    mf.field_u = mf.field_u + 1;
                    var34 = fieldTemp$17;
                    var25[var39] = fieldTemp$17;
                    am.field_b[var34] = var42;
                    gd.field_Zb[var34] = var43;
                    cm.field_q[var34] = var44;
                    statePc = 224;
                    continue stateLoop;
                }
                case 224: {
                    ve.field_a[var33] = var34;
                    var34 = var25[var40];
                    if ((var34 ^ -1) > -1) {
                        statePc = 227;
                    } else {
                        statePc = 228;
                    }
                    continue stateLoop;
                }
                case 227: {
                    fieldTemp$18 = mf.field_u;
                    mf.field_u = mf.field_u + 1;
                    var34 = fieldTemp$18;
                    var25[var40] = fieldTemp$18;
                    am.field_b[var34] = var45;
                    gd.field_Zb[var34] = var46;
                    cm.field_q[var34] = var47;
                    statePc = 228;
                    continue stateLoop;
                }
                case 228: {
                    hd.field_D[var33] = var34;
                    var34 = var25[var41];
                    if ((var34 ^ -1) <= -1) {
                        statePc = 230;
                    } else {
                        statePc = 229;
                    }
                    continue stateLoop;
                }
                case 229: {
                    fieldTemp$19 = mf.field_u;
                    mf.field_u = mf.field_u + 1;
                    var34 = fieldTemp$19;
                    var25[var41] = fieldTemp$19;
                    am.field_b[var34] = var48;
                    gd.field_Zb[var34] = var49;
                    cm.field_q[var34] = var50;
                    statePc = 230;
                    continue stateLoop;
                }
                case 230: {
                    kj.field_d[var33] = var34;
                    if (param18 != null) {
                        statePc = 233;
                    } else {
                        statePc = 234;
                    }
                    continue stateLoop;
                }
                case 233: {
                    ga.field_b[var33] = param18[var38];
                    fj.field_p[var33] = param8[var38];
                    om.field_Yb[var33] = param17[var38];
                    statePc = 234;
                    continue stateLoop;
                }
                case 234: {
                    var28[var33] = var38;
                    if (var65 == 0) {
                        statePc = 247;
                    } else {
                        statePc = 235;
                    }
                    continue stateLoop;
                }
                case 235: {
                    fieldTemp$20 = fh.field_g;
                    fh.field_g = fh.field_g + 1;
                    var33 = fieldTemp$20;
                    var34 = var24[var39];
                    if ((var34 ^ -1) <= -1) {
                        statePc = 237;
                    } else {
                        statePc = 236;
                    }
                    continue stateLoop;
                }
                case 236: {
                    fieldTemp$21 = k.field_e;
                    k.field_e = k.field_e + 1;
                    var34 = fieldTemp$21;
                    var24[var39] = fieldTemp$21;
                    ic.field_c[var34] = var42;
                    nn.field_S[var34] = var43;
                    bd.field_a[var34] = var44;
                    statePc = 237;
                    continue stateLoop;
                }
                case 237: {
                    ja.field_l[var33] = var34;
                    var34 = var24[var40];
                    if (0 > var34) {
                        statePc = 240;
                    } else {
                        statePc = 241;
                    }
                    continue stateLoop;
                }
                case 240: {
                    fieldTemp$22 = k.field_e;
                    k.field_e = k.field_e + 1;
                    var34 = fieldTemp$22;
                    var24[var40] = fieldTemp$22;
                    ic.field_c[var34] = var45;
                    nn.field_S[var34] = var46;
                    bd.field_a[var34] = var47;
                    statePc = 241;
                    continue stateLoop;
                }
                case 241: {
                    db.field_f[var33] = var34;
                    var34 = var24[var41];
                    if (var34 >= 0) {
                        statePc = 243;
                    } else {
                        statePc = 242;
                    }
                    continue stateLoop;
                }
                case 242: {
                    fieldTemp$23 = k.field_e;
                    k.field_e = k.field_e + 1;
                    var34 = fieldTemp$23;
                    var24[var41] = fieldTemp$23;
                    ic.field_c[var34] = var48;
                    nn.field_S[var34] = var49;
                    bd.field_a[var34] = var50;
                    statePc = 243;
                    continue stateLoop;
                }
                case 243: {
                    wk.field_b[var33] = var34;
                    if (null == param18) {
                        statePc = 246;
                    } else {
                        statePc = 244;
                    }
                    continue stateLoop;
                }
                case 244: {
                    mc.field_m[var33] = param18[var38];
                    tc.field_w[var33] = param8[var38];
                    rk.field_b[var33] = param17[var38];
                    statePc = 246;
                    continue stateLoop;
                }
                case 246: {
                    var27[var33] = var38;
                    statePc = 247;
                    continue stateLoop;
                }
                case 247: {
                    var38++;
                    if (var65 == 0) {
                        statePc = 70;
                    } else {
                        statePc = 248;
                    }
                    continue stateLoop;
                }
                case 248: {
                    bm.field_p = param10;
                    hb.field_d = param10;
                    d.field_b = mf.field_u;
                    ea.field_e = k.field_e;
                    stackIn_249_0 = 0;
                    stackIn_249_1 = param10;
                    statePc = 249;
                    continue stateLoop;
                }
                case 249: {
                    if (stackIn_249_0 < stackIn_249_1) {
                        statePc = 251;
                    } else {
                        statePc = 394;
                    }
                    continue stateLoop;
                }
                case 251: {
                    if (null == param6) {
                        statePc = 297;
                    } else {
                        statePc = 252;
                    }
                    continue stateLoop;
                }
                case 252: {
                    fieldTemp$24 = param6.field_v;
                    va.field_q.field_v = param6.field_v;
                    fl.field_o.field_v = fieldTemp$24;
                    if (fl.field_o.field_k == null) {
                        statePc = 260;
                    } else {
                        statePc = 255;
                    }
                    continue stateLoop;
                }
                case 255: {
                    if (fl.field_o.field_k.length < param10) {
                        statePc = 260;
                    } else {
                        statePc = 261;
                    }
                    continue stateLoop;
                }
                case 260: {
                    fl.field_o.field_Q = new short[param10];
                    fl.field_o.field_k = new short[param10];
                    fl.field_o.field_N = new short[param10];
                    statePc = 261;
                    continue stateLoop;
                }
                case 261: {
                    if (va.field_q.field_k == null) {
                        statePc = 267;
                    } else {
                        statePc = 262;
                    }
                    continue stateLoop;
                }
                case 262: {
                    if ((param10 ^ -1) < (va.field_q.field_k.length ^ -1)) {
                        statePc = 267;
                    } else {
                        statePc = 268;
                    }
                    continue stateLoop;
                }
                case 267: {
                    va.field_q.field_Q = new short[param10];
                    va.field_q.field_N = new short[param10];
                    va.field_q.field_k = new short[param10];
                    statePc = 268;
                    continue stateLoop;
                }
                case 268: {
                    var38 = 0;
                    statePc = 269;
                    continue stateLoop;
                }
                case 269: {
                    if (param10 <= var38) {
                        statePc = 295;
                    } else {
                        statePc = 270;
                    }
                    continue stateLoop;
                }
                case 270: {
                    if (var65 != 0) {
                        statePc = 296;
                    } else {
                        statePc = 271;
                    }
                    continue stateLoop;
                }
                case 271: {
                    if (-1 == (param6.field_v[var38] ^ -1)) {
                        statePc = 277;
                    } else {
                        statePc = 274;
                    }
                    continue stateLoop;
                }
                case 274: {
                    dupTemp$25 = param6.field_k[var38];
                    va.field_q.field_k[var38] = dupTemp$25;
                    fl.field_o.field_k[var38] = dupTemp$25;
                    dupTemp$26 = param6.field_N[var38];
                    va.field_q.field_N[var38] = dupTemp$26;
                    fl.field_o.field_N[var38] = dupTemp$26;
                    dupTemp$27 = param6.field_Q[var38];
                    va.field_q.field_Q[var38] = dupTemp$27;
                    fl.field_o.field_Q[var38] = dupTemp$27;
                    if (var65 == 0) {
                        statePc = 294;
                    } else {
                        statePc = 277;
                    }
                    continue stateLoop;
                }
                case 277: {
                    var33 = param6.field_k[var38];
                    var34 = var24[var33];
                    if ((var34 ^ -1) <= -1) {
                        statePc = 279;
                    } else {
                        statePc = 278;
                    }
                    continue stateLoop;
                }
                case 278: {
                    fieldTemp$28 = k.field_e;
                    k.field_e = k.field_e + 1;
                    var34 = fieldTemp$28;
                    var24[var33] = fieldTemp$28;
                    ic.field_c[var34] = param12[var33];
                    nn.field_S[var34] = param5[var33];
                    bd.field_a[var34] = param11[var33];
                    statePc = 279;
                    continue stateLoop;
                }
                case 279: {
                    fl.field_o.field_k[var38] = (short)var34;
                    var34 = var25[var33];
                    if ((var34 ^ -1) > -1) {
                        statePc = 282;
                    } else {
                        statePc = 283;
                    }
                    continue stateLoop;
                }
                case 282: {
                    fieldTemp$29 = mf.field_u;
                    mf.field_u = mf.field_u + 1;
                    var34 = fieldTemp$29;
                    var25[var33] = fieldTemp$29;
                    am.field_b[var34] = param12[var33];
                    gd.field_Zb[var34] = param5[var33];
                    cm.field_q[var34] = param11[var33];
                    statePc = 283;
                    continue stateLoop;
                }
                case 283: {
                    va.field_q.field_k[var38] = (short)var34;
                    var33 = param6.field_N[var38];
                    var34 = var24[var33];
                    if (-1 >= (var34 ^ -1)) {
                        statePc = 285;
                    } else {
                        statePc = 284;
                    }
                    continue stateLoop;
                }
                case 284: {
                    fieldTemp$30 = k.field_e;
                    k.field_e = k.field_e + 1;
                    var34 = fieldTemp$30;
                    var24[var33] = fieldTemp$30;
                    ic.field_c[var34] = param12[var33];
                    nn.field_S[var34] = param5[var33];
                    bd.field_a[var34] = param11[var33];
                    statePc = 285;
                    continue stateLoop;
                }
                case 285: {
                    fl.field_o.field_N[var38] = (short)var34;
                    var34 = var25[var33];
                    if (-1 < (var34 ^ -1)) {
                        statePc = 288;
                    } else {
                        statePc = 289;
                    }
                    continue stateLoop;
                }
                case 288: {
                    fieldTemp$31 = mf.field_u;
                    mf.field_u = mf.field_u + 1;
                    var34 = fieldTemp$31;
                    var25[var33] = fieldTemp$31;
                    am.field_b[var34] = param12[var33];
                    gd.field_Zb[var34] = param5[var33];
                    cm.field_q[var34] = param11[var33];
                    statePc = 289;
                    continue stateLoop;
                }
                case 289: {
                    va.field_q.field_N[var38] = (short)var34;
                    var33 = param6.field_Q[var38];
                    var34 = var24[var33];
                    if (var34 >= 0) {
                        statePc = 291;
                    } else {
                        statePc = 290;
                    }
                    continue stateLoop;
                }
                case 290: {
                    fieldTemp$32 = k.field_e;
                    k.field_e = k.field_e + 1;
                    var34 = fieldTemp$32;
                    var24[var33] = fieldTemp$32;
                    ic.field_c[var34] = param12[var33];
                    nn.field_S[var34] = param5[var33];
                    bd.field_a[var34] = param11[var33];
                    statePc = 291;
                    continue stateLoop;
                }
                case 291: {
                    fl.field_o.field_Q[var38] = (short)var34;
                    var34 = var25[var33];
                    if (0 <= var34) {
                        statePc = 293;
                    } else {
                        statePc = 292;
                    }
                    continue stateLoop;
                }
                case 292: {
                    fieldTemp$33 = mf.field_u;
                    mf.field_u = mf.field_u + 1;
                    var34 = fieldTemp$33;
                    var25[var33] = fieldTemp$33;
                    am.field_b[var34] = param12[var33];
                    gd.field_Zb[var34] = param5[var33];
                    cm.field_q[var34] = param11[var33];
                    statePc = 293;
                    continue stateLoop;
                }
                case 293: {
                    va.field_q.field_Q[var38] = (short)var34;
                    statePc = 294;
                    continue stateLoop;
                }
                case 294: {
                    var38++;
                    if (var65 == 0) {
                        statePc = 269;
                    } else {
                        statePc = 295;
                    }
                    continue stateLoop;
                }
                case 295: {
                    fieldTemp$34 = param6.field_S;
                    va.field_q.field_S = param6.field_S;
                    fl.field_o.field_S = fieldTemp$34;
                    fieldTemp$35 = param6.field_x;
                    va.field_q.field_x = param6.field_x;
                    fl.field_o.field_x = fieldTemp$35;
                    fieldTemp$36 = param6.field_D;
                    va.field_q.field_D = param6.field_D;
                    fl.field_o.field_D = fieldTemp$36;
                    fieldTemp$37 = param6.field_n;
                    va.field_q.field_n = param6.field_n;
                    fl.field_o.field_n = fieldTemp$37;
                    fieldTemp$38 = param6.field_M;
                    va.field_q.field_M = param6.field_M;
                    fl.field_o.field_M = fieldTemp$38;
                    fieldTemp$39 = param6.field_F;
                    va.field_q.field_F = param6.field_F;
                    fl.field_o.field_F = fieldTemp$39;
                    fieldTemp$40 = param6.field_L;
                    va.field_q.field_L = param6.field_L;
                    fl.field_o.field_L = fieldTemp$40;
                    fieldTemp$41 = param6.field_l;
                    va.field_q.field_l = param6.field_l;
                    fl.field_o.field_l = fieldTemp$41;
                    statePc = 296;
                    continue stateLoop;
                }
                case 296: {
                    if (var65 == 0) {
                        statePc = 394;
                    } else {
                        statePc = 297;
                    }
                    continue stateLoop;
                }
                case 297: {
                    if (bg.field_f == null) {
                        statePc = 305;
                    } else {
                        statePc = 300;
                    }
                    continue stateLoop;
                }
                case 300: {
                    if ((param10 ^ -1) < (bg.field_f.length ^ -1)) {
                        statePc = 305;
                    } else {
                        statePc = 306;
                    }
                    continue stateLoop;
                }
                case 305: {
                    gb.field_r = new int[param10];
                    bg.field_f = new int[param10];
                    ch.field_s = new int[param10];
                    statePc = 306;
                    continue stateLoop;
                }
                case 306: {
                    if (nh.field_Mb == null) {
                        statePc = 310;
                    } else {
                        statePc = 307;
                    }
                    continue stateLoop;
                }
                case 307: {
                    if (param10 <= nh.field_Mb.length) {
                        statePc = 312;
                    } else {
                        statePc = 310;
                    }
                    continue stateLoop;
                }
                case 310: {
                    nh.field_Mb = new int[param10];
                    li.field_m = new int[param10];
                    gk.field_c = new int[param10];
                    statePc = 312;
                    continue stateLoop;
                }
                case 312: {
                    var38 = 0;
                    statePc = 313;
                    continue stateLoop;
                }
                case 313: {
                    if ((var38 ^ -1) <= (param10 ^ -1)) {
                        statePc = 394;
                    } else {
                        statePc = 314;
                    }
                    continue stateLoop;
                }
                case 314: {
                    var33 = param19[var38];
                    var34 = var24[var33];
                    if (var65 != 0) {
                        statePc = 394;
                    } else {
                        statePc = 315;
                    }
                    continue stateLoop;
                }
                case 315: {
                    if (0 <= var34) {
                        statePc = 319;
                    } else {
                        statePc = 318;
                    }
                    continue stateLoop;
                }
                case 318: {
                    fieldTemp$42 = k.field_e;
                    k.field_e = k.field_e + 1;
                    var34 = fieldTemp$42;
                    var24[var33] = fieldTemp$42;
                    ic.field_c[var34] = param12[var33];
                    nn.field_S[var34] = param5[var33];
                    bd.field_a[var34] = param11[var33];
                    statePc = 319;
                    continue stateLoop;
                }
                case 319: {
                    bg.field_f[var38] = var34;
                    var34 = var25[var33];
                    if ((var34 ^ -1) <= -1) {
                        statePc = 321;
                    } else {
                        statePc = 320;
                    }
                    continue stateLoop;
                }
                case 320: {
                    fieldTemp$43 = mf.field_u;
                    mf.field_u = mf.field_u + 1;
                    var34 = fieldTemp$43;
                    var25[var33] = fieldTemp$43;
                    am.field_b[var34] = param12[var33];
                    gd.field_Zb[var34] = param5[var33];
                    cm.field_q[var34] = param11[var33];
                    statePc = 321;
                    continue stateLoop;
                }
                case 321: {
                    nh.field_Mb[var38] = var34;
                    var33 = param16[var38];
                    var34 = var24[var33];
                    if (var34 < 0) {
                        statePc = 324;
                    } else {
                        statePc = 325;
                    }
                    continue stateLoop;
                }
                case 324: {
                    fieldTemp$44 = k.field_e;
                    k.field_e = k.field_e + 1;
                    var34 = fieldTemp$44;
                    var24[var33] = fieldTemp$44;
                    ic.field_c[var34] = param12[var33];
                    nn.field_S[var34] = param5[var33];
                    bd.field_a[var34] = param11[var33];
                    statePc = 325;
                    continue stateLoop;
                }
                case 325: {
                    gb.field_r[var38] = var34;
                    var34 = var25[var33];
                    if (-1 >= (var34 ^ -1)) {
                        statePc = 327;
                    } else {
                        statePc = 326;
                    }
                    continue stateLoop;
                }
                case 326: {
                    fieldTemp$45 = mf.field_u;
                    mf.field_u = mf.field_u + 1;
                    var34 = fieldTemp$45;
                    var25[var33] = fieldTemp$45;
                    am.field_b[var34] = param12[var33];
                    gd.field_Zb[var34] = param5[var33];
                    cm.field_q[var34] = param11[var33];
                    statePc = 327;
                    continue stateLoop;
                }
                case 327: {
                    li.field_m[var38] = var34;
                    var33 = param15[var38];
                    var34 = var24[var33];
                    if (0 > var34) {
                        statePc = 330;
                    } else {
                        statePc = 331;
                    }
                    continue stateLoop;
                }
                case 330: {
                    fieldTemp$46 = k.field_e;
                    k.field_e = k.field_e + 1;
                    var34 = fieldTemp$46;
                    var24[var33] = fieldTemp$46;
                    ic.field_c[var34] = param12[var33];
                    nn.field_S[var34] = param5[var33];
                    bd.field_a[var34] = param11[var33];
                    statePc = 331;
                    continue stateLoop;
                }
                case 331: {
                    ch.field_s[var38] = var34;
                    var34 = var25[var33];
                    if ((var34 ^ -1) > -1) {
                        statePc = 334;
                    } else {
                        statePc = 335;
                    }
                    continue stateLoop;
                }
                case 334: {
                    fieldTemp$47 = mf.field_u;
                    mf.field_u = mf.field_u + 1;
                    var34 = fieldTemp$47;
                    var25[var33] = fieldTemp$47;
                    am.field_b[var34] = param12[var33];
                    gd.field_Zb[var34] = param5[var33];
                    cm.field_q[var34] = param11[var33];
                    statePc = 335;
                    continue stateLoop;
                }
                case 335: {
                    gk.field_c[var38] = var34;
                    var38++;
                    if (var65 == 0) {
                        statePc = 313;
                    } else {
                        statePc = 394;
                    }
                    continue stateLoop;
                }
                case 394: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
    }
}
