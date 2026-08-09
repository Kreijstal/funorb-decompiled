/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class no extends cj {
    static String field_Fb;
    static int field_Gb;
    static ja[][] field_Hb;
    private cj field_Ib;
    static String field_Kb;
    static ri field_Jb;

    final static void c(byte param0) {
        String var2 = null;
        int var1 = -7 % ((-1 - param0) / 63);
        if (null != sb.field_k) {
            var2 = sb.field_k;
            cf.a((byte) -61, vl.a(lp.field_h, new String[]{var2}, 2));
            sb.field_k = null;
        }
    }

    final static String a(boolean param0, int param1, CharSequence param2) {
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        String stackIn_14_0 = null;
        String stackIn_19_0 = null;
        String stackIn_22_0 = null;
        boolean stackIn_26_0 = false;
        String stackIn_34_0 = null;
        int stackIn_37_0 = 0;
        String stackIn_40_0 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_25_0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (param2 == null) {
              stackIn_4_0 = bg.field_q;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var3_int = param2.length();
                if (-2 < (var3_int ^ -1)) {
                  break L1;
                } else {
                  if (-13 <= (var3_int ^ -1)) {
                    L2: {
                      var4 = tg.a(param2, false);
                      if (var4 == null) {
                        break L2;
                      } else {
                        if (var4.length() < 1) {
                          break L2;
                        } else {
                          L3: {
                            if (eb.a((byte) -104, var4.charAt(0))) {
                              break L3;
                            } else {
                              if (eb.a((byte) -119, var4.charAt(-1 + var4.length()))) {
                                break L3;
                              } else {
                                var5 = 0;
                                if (param1 < -11) {
                                  var6 = 0;
                                  L4: while (true) {
                                    L5: {
                                      L6: {
                                        if (var6 >= param2.length()) {
                                          break L6;
                                        } else {
                                          var7 = param2.charAt(var6);
                                          stackOut_25_0 = eb.a((byte) 94, (char) var7);
                                          stackIn_37_0 = stackOut_25_0 ? 1 : 0;
                                          stackIn_26_0 = stackOut_25_0;
                                          if (var8 != 0) {
                                            break L5;
                                          } else {
                                            L7: {
                                              if (!stackIn_26_0) {
                                                var5 = 0;
                                                if (var8 == 0) {
                                                  break L7;
                                                } else {
                                                  var5++;
                                                  break L7;
                                                }
                                              } else {
                                                var5++;
                                                break L7;
                                              }
                                            }
                                            L8: {
                                              if (2 > var5) {
                                                break L8;
                                              } else {
                                                if (!param0) {
                                                  stackIn_34_0 = hn.field_a;
                                                  decompiledRegionSelector0 = 5;
                                                  break L0;
                                                } else {
                                                  break L8;
                                                }
                                              }
                                            }
                                            var6++;
                                            if (var8 == 0) {
                                              continue L4;
                                            } else {
                                              break L6;
                                            }
                                          }
                                        }
                                      }
                                      stackIn_37_0 = 0;
                                      break L5;
                                    }
                                    if (stackIn_37_0 < var5) {
                                      stackIn_40_0 = th.field_a;
                                      decompiledRegionSelector0 = 6;
                                      break L0;
                                    } else {
                                      return null;
                                    }
                                  }
                                } else {
                                  stackIn_22_0 = (String) null;
                                  decompiledRegionSelector0 = 4;
                                  break L0;
                                }
                              }
                            }
                          }
                          stackIn_19_0 = th.field_a;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      }
                    }
                    stackIn_14_0 = bg.field_q;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              stackIn_9_0 = bg.field_q;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackIn_44_0 = (RuntimeException) (var3);

            stackIn_44_1 = new StringBuilder().append("no.DA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "null";
              break L9;
            } else {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "{...}";
              break L9;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_45_0), stackIn_45_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_19_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_22_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_34_0;
                  } else {
                    return stackIn_40_0;
                  }
                }
              }
            }
          }
        }
    }

    final static bm a(byte param0, byte[] param1) {
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
        int stackIn_10_0 = 0;
        int stackIn_18_0 = 0;
        bm stackIn_26_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14_int = 0;
        int[] var14 = null;
        int var15 = 0;
        int var16 = 0;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[][] var26 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var16 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = 1;
                        incrementValue$0 = var2_int;
                        var2_int++;
                        var3 = re.a(param1, incrementValue$0, (byte) 86);
                        incrementValue$1 = var2_int;
                        var2_int++;
                        var4 = re.a(param1, incrementValue$1, (byte) 99);
                        incrementValue$2 = var2_int;
                        var2_int++;
                        var5 = re.a(param1, incrementValue$2, (byte) 113);
                        var23 = new int[4];
                        var19 = var23;
                        var6 = var19;
                        var24 = new int[4];
                        var20 = var24;
                        var7 = var20;
                        var8 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (-5 >= (var8 ^ -1)) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        incrementValue$3 = var2_int;
                        var2_int++;
                        var6[var8] = re.a(param1, incrementValue$3, (byte) 56);
                        incrementValue$4 = var2_int;
                        var2_int++;
                        var7[var8] = re.a(param1, incrementValue$4, (byte) 88);
                        var8++;
                        if (var16 != 0) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var16 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        incrementValue$5 = var2_int;
                        var2_int++;
                        var8 = re.a(param1, incrementValue$5, (byte) 75);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        incrementValue$6 = var2_int;
                        var2_int++;
                        var9 = re.a(param1, incrementValue$6, (byte) 112);
                        incrementValue$7 = var2_int;
                        var2_int++;
                        var10 = re.a(param1, incrementValue$7, (byte) 113);
                        incrementValue$8 = var2_int;
                        var2_int++;
                        var11 = re.a(param1, incrementValue$8, (byte) 67);
                        var26 = new int[var11][var10];
                        var13 = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var13 >= var11) {
                            statePc = 17;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackIn_18_0 = 0;
                        stackIn_10_0 = stackIn_18_0;
                        if (var16 != 0) {
                            statePc = 18;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var14_int = stackIn_10_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var14_int >= var10) {
                            statePc = 15;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        incrementValue$9 = var2_int;
                        var2_int++;
                        var26[var13][var14_int] = re.a(param1, incrementValue$9, (byte) 71);
                        var14_int++;
                        if (var16 != 0) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var16 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var13++;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var16 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        incrementValue$10 = var2_int;
                        var2_int++;
                        var13 = re.a(param1, incrementValue$10, (byte) 59);
                        stackIn_18_0 = var13 * 4;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var22 = new int[stackIn_18_0];
                        var18 = var22;
                        var14 = var18;
                        var15 = 0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var15 >= 4 * var13) {
                            statePc = 23;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        incrementValue$11 = var2_int;
                        var2_int++;
                        var14[var15] = re.a(param1, incrementValue$11, (byte) 62);
                        var15++;
                        if (var16 != 0) {
                            statePc = 25;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var16 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (param0 == 104) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        field_Hb = (ja[][]) null;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackIn_26_0 = new bm(var26, var22, var3, var4, var5, var23, var24, var8, var9);
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 26: {
                    return stackIn_26_0;
                }
                case 27: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_29_0 = (RuntimeException) (var2);
                    stackIn_28_0 = stackIn_29_0;
                    stackIn_29_1 = new StringBuilder().append("no.CA(").append(param0).append(',');
                    stackIn_28_1 = stackIn_29_1;
                    if (param1 == null) {
                        statePc = 29;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    stackIn_30_0 = (RuntimeException) ((Object) stackIn_28_0);
                    stackIn_30_1 = (StringBuilder) ((Object) stackIn_28_1);
                    stackIn_30_2 = "{...}";
                    statePc = 30;
                    continue stateLoop;
                }
                case 29: {
                    stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
                    stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
                    stackIn_30_2 = "null";
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    throw fa.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void h(int param0) {
        CharSequence var2;
        field_Fb = null;
        field_Jb = null;
        if (param0 != 15) {
          var2 = (CharSequence) null;
          no.a(false, -117, (CharSequence) null);
          field_Hb = (ja[][]) null;
          field_Kb = null;
          return;
        } else {
          field_Hb = (ja[][]) null;
          field_Kb = null;
          return;
        }
    }

    final boolean b(int param0, boolean param1) {
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        if (param0 == 0) {
          this.a(param0 ^ -11838, true);
          if (kd.field_b == 0) {
            if (-1 != (this.field_Ib.field_T ^ -1)) {
              return true;
            } else {
              return false;
            }
          } else {
            if (this.field_T != 0) {
              L0: {
                if (-1 == (this.field_Ib.field_T ^ -1)) {
                  stackIn_10_0 = 0;
                  break L0;
                } else {
                  stackIn_10_0 = 1;
                  break L0;
                }
              }
              return stackIn_10_0 != 0;
            } else {
              stackIn_6_0 = 1;
              return stackIn_6_0 != 0;
            }
          }
        } else {
          return true;
        }
    }

    no(cj param0, cj param1, cj param2, cj param3, cj param4, cj param5) {
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        cj var8 = null;
        cj var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        cj var13 = null;
        cj var14 = null;
        int var15 = 0;
        int var16 = 0;
        cj var17 = null;
        var16 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var17 = new cj(0L, param1, le.field_I.toUpperCase());
            var17.field_R = 1;
            this.field_Ib = new cj(0L, param2);
            var8 = new cj(0L, param3);
            var9 = new cj(0L, param3, qa.field_j);
            var9.field_R = 1;
            var10 = 50;
            var11 = 0;
            var12 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (lj.field_h.length <= var12) {
                    break L3;
                  } else {
                    var13 = new cj(0L, param3, cm.field_c[var12]);
                    var14 = new cj(0L, param3, lj.field_h[var12]);
                    var15 = param3.field_yb.a(lj.field_h[var12]);
                    var13.a(15, var10, 65, 20, -3344);
                    stackIn_8_0 = var11;

                    stackIn_8_1 = var15;

                    if (var16 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_8_0 >= stackIn_8_1) {
                          break L4;
                        } else {
                          var11 = var15;
                          break L4;
                        }
                      }
                      var14.a(15, var10, 640, 90, -3344);
                      var8.a((byte) 50, var13);
                      var8.a((byte) 50, var14);
                      var10 += 30;
                      var12++;
                      if (var16 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var10 += 15;
                var17.a(24, 0, 20 + var11 - -90, 0, -3344);
                this.a(var10 + var17.field_z, 100, var17.field_zb, 100, -3344);
                this.field_Ib.a(15, 5, 15, -20 + var17.field_zb, -3344);
                var8.a(this.field_z - var17.field_z, var17.field_z, this.field_zb, 0, -3344);
                var9.a(15, 20, this.field_zb, 0, -3344);
                var8.field_ab = tg.a(2105376, var8.field_z, 8421504, 3, 11579568, 102);
                var17.a((byte) 50, this.field_Ib);
                var8.a((byte) 50, var9);
                this.a((byte) 50, var17);
                this.a((byte) 50, var8);
                stackIn_8_0 = -(this.field_z >> -617126399);
                stackIn_8_1 = 240;
                break L2;
              }
              var10 = stackIn_8_0 + stackIn_8_1;
              this.field_x = 320 + -(this.field_zb >> -1388909887);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var7 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var7);

            stackIn_12_1 = new StringBuilder().append("no.<init>(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L6;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L7;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L8;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

            if (param4 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L9;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');

            if (param5 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L10;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L10;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_13_0), stackIn_28_2 + ')');
        }
    }

    static {
        field_Fb = "Left-click or press 'ESC' to skip cutscene";
        field_Hb = new ja[2][];
        field_Kb = "Make them tremble and shake.";
    }
}
