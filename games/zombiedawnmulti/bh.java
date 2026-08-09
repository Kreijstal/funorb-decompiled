/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bh {
    static vp field_a;
    static sc field_f;
    static th field_d;
    static String[] field_b;
    static int[] field_c;
    static String field_e;

    public static void a(byte param0) {
        field_a = null;
        field_e = null;
        field_b = null;
        field_c = null;
        if (param0 >= -2) {
            bh.a((byte) 84);
        }
        field_d = null;
        field_f = null;
    }

    final static String a(int param0, ka param1) {
        String stackIn_32_0 = null;
        Object stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        Object stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var2 = null;
        String var3 = null;
        int var4 = 0;
        jh var5 = null;
        String var6 = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var2 = null;
              if (param1.field_n == null) {
                break L1;
              } else {
                L2: {
                  var6 = param1.field_n;
                  var2 = var6;
                  var2 = var6;
                  var2 = var6;
                  if (1 == param1.field_h) {
                    var2 = "<img=0>" + var6;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if (-3 != (param1.field_h ^ -1)) {
                  break L1;
                } else {
                  var2 = "<img=1>" + (String) (var2);
                  break L1;
                }
              }
            }
            L3: {
              if (param0 < -125) {
                break L3;
              } else {
                var5 = (jh) null;
                bh.a(-58, -66, -108, (jh) null, true, 107, -83, 97);
                break L3;
              }
            }
            L4: {
              L5: {
                var3 = "";
                if (2 != param1.field_l) {
                  break L5;
                } else {
                  if (!param1.field_k) {
                    L6: {
                      if (param1.field_i != 0) {
                        break L6;
                      } else {
                        if ((param1.field_o ^ -1) != -1) {
                          break L6;
                        } else {
                          var3 = vl.a(v.field_c, new String[]{(String) (var2)}, 2);
                          if (var4 == 0) {
                            break L4;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    var3 = vl.a(lc.field_n, new String[]{(String) (var2)}, 2);
                    if (var4 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  } else {
                    break L4;
                  }
                }
              }
              L7: {
                if (-1 != (param1.field_l ^ -1)) {
                  break L7;
                } else {
                  if (sn.field_Hb) {
                    var3 = "[" + ne.field_vb + "] ";
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
              L8: {
                if (param1.field_l != 1) {
                  break L8;
                } else {
                  var3 = "[" + vl.a(ae.field_g, new String[]{param1.field_g}, 2) + "] ";
                  break L8;
                }
              }
              L9: {
                if (-5 != (param1.field_l ^ -1)) {
                  break L9;
                } else {
                  if (null == bp.field_t) {
                    break L9;
                  } else {
                    var3 = "[" + bp.field_t + "] ";
                    break L9;
                  }
                }
              }
              L10: {
                if ((param1.field_l ^ -1) == -4) {
                  var3 = "[#" + param1.field_g + "] ";
                  break L10;
                } else {
                  break L10;
                }
              }
              if (!param1.field_k) {
                var3 = var3 + (String) (var2) + ": ";
                break L4;
              } else {
                break L4;
              }
            }
            stackIn_32_0 = (String) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var2 = decompiledCaughtException;
            stackIn_35_0 = var2;

            stackIn_35_1 = new StringBuilder().append("bh.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_36_0 = stackIn_35_0;
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L11;
            } else {
              stackIn_36_0 = stackIn_35_0;
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L11;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ')');
        }
        return stackIn_32_0;
    }

    final static void a(int param0, int param1, int param2, jh param3, boolean param4, int param5, int param6, int param7) {
        mo[][] stackIn_5_0 = null;
        mo[][] stackIn_6_0 = null;
        mo[][] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_83_1 = 0;
        int stackIn_100_0 = 0;
        int stackIn_100_1 = 0;
        int stackIn_102_0 = 0;
        int stackIn_111_0 = 0;
        RuntimeException stackIn_115_0 = null;
        StringBuilder stackIn_115_1 = null;
        RuntimeException stackIn_116_0 = null;
        StringBuilder stackIn_116_1 = null;
        RuntimeException stackIn_117_0 = null;
        StringBuilder stackIn_117_1 = null;
        String stackIn_117_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        mo[] var8 = null;
        int var8_int = 0;
        RuntimeException var8_ref = null;
        int var9 = 0;
        int var10_int = 0;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        mo var13_ref_mo = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        ka var16 = null;
        mo[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var15 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 == -1712) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var16 = (ka) null;
                        bh.a(-40, (ka) null);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (param7 >= param5) {
                            statePc = 76;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackIn_6_0 = ma.field_b;
                        stackIn_5_0 = stackIn_6_0;
                        if (-1 != param7) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_7_0 = (mo[][]) ((Object) stackIn_5_0);
                        stackIn_7_1 = 1;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackIn_7_0 = (mo[][]) ((Object) stackIn_6_0);
                        stackIn_7_1 = 4 - -param7;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var17 = stackIn_7_0[stackIn_7_1];
                        var8 = var17;
                        var9 = 1;
                        if (!param4) {
                            statePc = 27;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (-1 != param7) {
                            statePc = 17;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var10_int = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if ((qo.field_r.length ^ -1) >= (var10_int ^ -1)) {
                            statePc = 16;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackIn_28_0 = 0;
                        stackIn_12_0 = stackIn_28_0;
                        if (var15 != 0) {
                            statePc = 28;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (stackIn_12_0 == (fg.field_k[var10_int / 8] & 1 << (7 & var10_int))) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var9 = 0;
                        if (var15 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var10_int++;
                        if (var15 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var15 == 0) {
                            statePc = 27;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var10_int = 0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var10_int >= var17.length - 1) {
                            statePc = 25;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackIn_26_0 = -1;
                        stackIn_20_0 = stackIn_26_0;
                        stackIn_26_1 = tg.field_a[(param2 - -var10_int) / 8] & 1 << (param2 + var10_int & 7) ^ -1;
                        stackIn_20_1 = stackIn_26_1;
                        if (var15 != 0) {
                            statePc = 26;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (stackIn_20_0 != stackIn_20_1) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var9 = 0;
                        if (var15 == 0) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var10_int++;
                        if (var15 == 0) {
                            statePc = 18;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackIn_26_0 = param2;
                        stackIn_26_1 = od.field_Gb[param7] & 255;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        param2 = stackIn_26_0 + stackIn_26_1;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var10_int = 0;
                        stackIn_28_0 = 0;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var11 = stackIn_28_0;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (param7 == -1) {
                            statePc = 32;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackIn_33_0 = var17.length - 1;
                        stackIn_31_0 = stackIn_33_0;
                        if (var15 != 0) {
                            statePc = 33;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        stackIn_33_0 = stackIn_31_0;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackIn_33_0 = qo.field_r.length;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (stackIn_33_0 <= var11) {
                            statePc = 63;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (-1 == param7) {
                            statePc = 37;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        rl.field_v[param7] = (byte)var11;
                        if (var15 == 0) {
                            statePc = 38;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        param6 = var11;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (0 != (param7 ^ -1)) {
                            statePc = 41;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (1 != qo.field_r.length) {
                            statePc = 41;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var12 = 1;
                        if (var15 == 0) {
                            statePc = 57;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var13_ref_mo = var17[var11 + 1];
                        if (param4) {
                            statePc = 50;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (0 != (param7 ^ -1)) {
                            statePc = 46;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if ((qo.field_r[var11] ^ -1) != (mh.field_c.field_mc ^ -1)) {
                            statePc = 45;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        stackIn_49_0 = 1;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        stackIn_49_0 = 0;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if ((mh.field_c.field_Zb[param7] & 255) != var11) {
                            statePc = 48;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        stackIn_49_0 = 1;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        stackIn_49_0 = 0;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var12 = stackIn_49_0;
                        if (var15 == 0) {
                            statePc = 57;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (var13_ref_mo.field_Ab) {
                            statePc = 54;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (var9 == 0) {
                            statePc = 55;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (!var13_ref_mo.field_Z) {
                            statePc = 55;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        stackIn_56_0 = 1;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        stackIn_56_0 = 0;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        var12 = stackIn_56_0;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (var12 == 0) {
                            statePc = 59;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var10_int = 1;
                        bh.a(-1712, param1, param2, param3, param4, param5, param6, param7 - -1);
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (dj.field_l) {
                            statePc = 61;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 61: {
                    return;
                }
                case 62: {
                    try {
                        var11++;
                        if (var15 == 0) {
                            statePc = 29;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (var10_int != 0) {
                            statePc = 75;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        var11 = 0;
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        if (var11 >= -1 + var17.length) {
                            statePc = 75;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (var15 != 0) {
                            statePc = 118;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if ((param7 ^ -1) == 0) {
                            statePc = 70;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        rl.field_v[param7] = (byte)var11;
                        if (var15 == 0) {
                            statePc = 71;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        param6 = var11;
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        bh.a(-1712, param1, param2, param3, param4, param5, param6, param7 - -1);
                        if (dj.field_l) {
                            statePc = 73;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 73: {
                    return;
                }
                case 74: {
                    try {
                        var11++;
                        if (var15 == 0) {
                            statePc = 65;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if (var15 == 0) {
                            statePc = 118;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        var8_int = 1;
                        var9 = 0;
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        stackIn_78_0 = var9;
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if (stackIn_78_0 >= iq.field_b.length) {
                            statePc = 110;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        var19 = iq.field_b[var9];
                        var18 = var19;
                        var10 = var18;
                        var11 = 0;
                        stackIn_111_0 = 0;
                        stackIn_80_0 = stackIn_111_0;
                        if (var15 != 0) {
                            statePc = 111;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        var12 = stackIn_80_0;
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        if ((var12 ^ -1) <= (var19.length ^ -1)) {
                            statePc = 95;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        var13 = var19[var12];
                        var14 = var10[var12 - -1];
                        stackIn_100_0 = -1;
                        stackIn_83_0 = stackIn_100_0;
                        stackIn_100_1 = var13;
                        stackIn_83_1 = stackIn_100_1;
                        if (var15 != 0) {
                            statePc = 100;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        if (stackIn_83_0 != stackIn_83_1) {
                            statePc = 86;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        if ((var14 ^ -1) != (qo.field_r[param6] ^ -1)) {
                            statePc = 109;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        if (param7 != var13) {
                            statePc = 89;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        if (param1 == var14) {
                            statePc = 93;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        if ((param7 ^ -1) >= (var13 ^ -1)) {
                            statePc = 109;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        if (var14 == (255 & rl.field_v[var13])) {
                            statePc = 94;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        if (var15 == 0) {
                            statePc = 109;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        var11 = 1;
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        var12 += 2;
                        if (var15 == 0) {
                            statePc = 81;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        if (var11 != 0) {
                            statePc = 98;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        if ((kj.field_h ^ -1) == (param7 ^ -1)) {
                            statePc = 98;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        var8_int = 0;
                        var12 = 0;
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        stackIn_100_0 = var19.length;
                        stackIn_100_1 = var12;
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        if (stackIn_100_0 <= stackIn_100_1) {
                            statePc = 109;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        var13 = var19[var12];
                        stackIn_78_0 = var13 ^ -1;
                        stackIn_102_0 = stackIn_78_0;
                        if (var15 != 0) {
                            statePc = 78;
                        } else {
                            statePc = 102;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        if (stackIn_102_0 != 0) {
                            statePc = 105;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        lp.field_p = true;
                        if (var15 == 0) {
                            statePc = 108;
                        } else {
                            statePc = 104;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        if (var13 < param7) {
                            statePc = 107;
                        } else {
                            statePc = 106;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        ll.field_c[var13] = true;
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        var12 += 2;
                        if (var15 == 0) {
                            statePc = 99;
                        } else {
                            statePc = 109;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        var9++;
                        if (var15 == 0) {
                            statePc = 77;
                        } else {
                            statePc = 110;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        stackIn_111_0 = var8_int;
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        if (stackIn_111_0 == 0) {
                            statePc = 118;
                        } else {
                            statePc = 112;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        dj.field_l = true;
                        statePc = 118;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 114: {
                    var8_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_116_0 = (RuntimeException) (var8_ref);
                    stackIn_115_0 = stackIn_116_0;
                    stackIn_116_1 = new StringBuilder().append("bh.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
                    stackIn_115_1 = stackIn_116_1;
                    if (param3 == null) {
                        statePc = 116;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    stackIn_117_0 = (RuntimeException) ((Object) stackIn_115_0);
                    stackIn_117_1 = (StringBuilder) ((Object) stackIn_115_1);
                    stackIn_117_2 = "{...}";
                    statePc = 117;
                    continue stateLoop;
                }
                case 116: {
                    stackIn_117_0 = (RuntimeException) ((Object) stackIn_116_0);
                    stackIn_117_1 = (StringBuilder) ((Object) stackIn_116_1);
                    stackIn_117_2 = "null";
                    statePc = 117;
                    continue stateLoop;
                }
                case 117: {
                    throw fa.a((Throwable) ((Object) stackIn_117_0), stackIn_117_2 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
                }
                case 118: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_e = "Type your password again to make sure it's correct";
        field_c = new int[8192];
        field_d = new th();
    }
}
