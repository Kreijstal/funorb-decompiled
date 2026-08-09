/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk {
    static int field_c;
    static int field_a;
    static se field_b;

    public static void a(boolean param0) {
        if (!param0) {
            return;
        }
        field_b = null;
    }

    final static e a(boolean param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        e var5 = null;
        e stackIn_4_0 = null;
        e stackIn_7_0 = null;
        e stackIn_12_0 = null;
        e stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (0 != param1.length()) {
                  var2_int = param1.indexOf('@');
                  if (0 != (var2_int ^ -1)) {
                    L2: {
                      var3 = param1.substring(0, var2_int);
                      var4 = param1.substring(1 + var2_int);
                      if (!param0) {
                        break L2;
                      } else {
                        uk.a((byte) -20);
                        break L2;
                      }
                    }
                    var5 = gk.a(var3, (byte) -127);
                    if (var5 == null) {
                      stackIn_14_0 = sg.a(-1326, var4);
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      stackIn_12_0 = (e) (var5);
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    stackIn_7_0 = oc.field_M;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
            }
            stackIn_4_0 = oh.field_e;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var2);

            stackIn_17_1 = new StringBuilder().append("uk.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              return stackIn_14_0;
            }
          }
        }
    }

    final static void a(byte param0) {
        String[][] dupTemp$0 = null;
        long[][] dupTemp$1 = null;
        int[][] dupTemp$2 = null;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_30_0 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        long var4_long = 0L;
        gj var4 = null;
        int var5 = 0;
        vg var6_ref_vg = null;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        long[][] var10 = null;
        int[][] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        se var27 = null;
        se var28 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var26 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 == 68) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        var27 = cd.field_t;
                        var28 = var27;
                        var2 = var28.b((byte) 90);
                        if (var2 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((var2 ^ -1) != -2) {
                            statePc = 17;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var3 = var28.j(98203176);
                        var4_long = var28.c((byte) -89);
                        var6_ref_vg = (vg) ((Object) kk.field_X.b((byte) 124));
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var6_ref_vg == null) {
                            statePc = 12;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackIn_14_0 = var3 ^ -1;
                        stackIn_8_0 = stackIn_14_0;
                        stackIn_14_1 = var6_ref_vg.field_t ^ -1;
                        stackIn_8_1 = stackIn_14_1;
                        if (var26 != 0) {
                            statePc = 14;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (stackIn_8_0 != stackIn_8_1) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var26 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var6_ref_vg = (vg) ((Object) kk.field_X.d(853));
                        if (var26 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var6_ref_vg != null) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackIn_14_0 = param0;
                        stackIn_14_1 = 58;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        th.a(stackIn_14_0 + stackIn_14_1);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 15: {
                    return;
                }
                case 16: {
                    try {
                        var6_ref_vg.field_h = var4_long;
                        var6_ref_vg.b(param0 + -11);
                        if (var26 == 0) {
                            statePc = 71;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        pe.a((byte) -13, (Throwable) null, "HS1: " + sj.b(true));
                        th.a(param0 + 48);
                        if (var26 == 0) {
                            statePc = 71;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var3 = var28.j(98203176);
                        var4 = (gj) ((Object) cb.field_b.b((byte) -126));
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (var4 == null) {
                            statePc = 26;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackIn_30_0 = var4.field_o;
                        stackIn_22_0 = stackIn_30_0;
                        if (var26 != 0) {
                            statePc = 30;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (stackIn_22_0 != var3) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var26 == 0) {
                            statePc = 26;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var4 = (gj) ((Object) cb.field_b.d(param0 + 785));
                        if (var26 == 0) {
                            statePc = 20;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (var4 != null) {
                            statePc = 29;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        th.a(120);
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 28: {
                    return;
                }
                case 29: {
                    try {
                        stackIn_30_0 = var28.b((byte) 90);
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var5 = stackIn_30_0;
                        if (var5 != 0) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var4.field_h = true;
                        var4.b(param0 ^ 125);
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var6 = var4.field_m;
                        ce.field_e[0].field_a = null;
                        ce.field_e[0].field_c = false;
                        var7 = var4.field_n;
                        ce.field_e[0].field_d = gb.field_h;
                        var8_int = 1;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (var8_int >= var5) {
                            statePc = 40;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        ce.field_e[var8_int].field_d = var27.g(2);
                        ce.field_e[var8_int].field_c = false;
                        if (var26 != 0) {
                            statePc = 68;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (-2 == (var28.b((byte) 90) ^ -1)) {
                            statePc = 38;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        ce.field_e[var8_int].field_a = null;
                        if (var26 == 0) {
                            statePc = 39;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        ce.field_e[var8_int].field_a = var28.g(2);
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var8_int++;
                        if (var26 == 0) {
                            statePc = 33;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        dupTemp$0 = new String[3][var6];
                        var4.field_i = dupTemp$0;
                        var8 = dupTemp$0;
                        var9 = new String[3][var6];
                        dupTemp$1 = new long[3][var6];
                        var4.field_p = dupTemp$1;
                        var10 = dupTemp$1;
                        dupTemp$2 = new int[3][var7 * var6];
                        var4.field_l = dupTemp$2;
                        var11 = dupTemp$2;
                        var12 = 0;
                        var13 = 0;
                        var14 = 0;
                        var15 = 0;
                        var16 = 0;
                        var17 = 0;
                        var18 = var28.b((byte) 90);
                        if (-1 <= (var18 ^ -1)) {
                            statePc = 67;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var19 = 0;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (var18 <= var19) {
                            statePc = 67;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var20 = var27.b((byte) 90);
                        var21 = ce.field_e[var20].field_d;
                        var22 = var28.c((byte) -89);
                        var24 = var28.field_i;
                        if (var26 != 0) {
                            statePc = 68;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (var6 > var19) {
                            statePc = 46;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var8[0][var12] = var21;
                        var9[0][var12] = ce.field_e[var20].field_a;
                        var10[0][var12] = var22;
                        var12++;
                        var25 = 0;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (var7 <= var25) {
                            statePc = 51;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        incrementValue$3 = var15;
                        var15++;
                        var11[0][incrementValue$3] = var27.l(0);
                        var25++;
                        if (var26 != 0) {
                            statePc = 58;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (var26 == 0) {
                            statePc = 47;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (var21 == null) {
                            statePc = 58;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (!fc.a((byte) -127, var21)) {
                            statePc = 58;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var8[1][var13] = gb.field_h;
                        var9[1][var13] = null;
                        var10[1][var13] = var22;
                        var28.field_i = var24;
                        var13++;
                        var25 = 0;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (var25 >= var7) {
                            statePc = 58;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        incrementValue$4 = var16;
                        var16++;
                        var11[1][incrementValue$4] = var27.l(0);
                        var25++;
                        if (var26 != 0) {
                            statePc = 66;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (var26 == 0) {
                            statePc = 54;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (var6 <= var14) {
                            statePc = 65;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (ce.field_e[var20].field_c) {
                            statePc = 65;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        ce.field_e[var20].field_c = true;
                        var8[2][var14] = var21;
                        var9[2][var14] = ce.field_e[var20].field_a;
                        var10[2][var14] = var22;
                        var14++;
                        var28.field_i = var24;
                        var25 = 0;
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (var25 >= var7) {
                            statePc = 65;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        incrementValue$5 = var17;
                        var17++;
                        var11[2][incrementValue$5] = var27.l(0);
                        var25++;
                        if (var26 != 0) {
                            statePc = 66;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (var26 == 0) {
                            statePc = 61;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        var19++;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (var26 == 0) {
                            statePc = 42;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        var4.field_h = true;
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        var4.b(param0 ^ 125);
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 70: {
                    var1 = (RuntimeException) ((Object) caughtException);
                    throw dd.a((Throwable) ((Object) var1), "uk.C(" + param0 + ')');
                }
                case 71: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_c = -1;
    }
}
