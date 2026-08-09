/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qqa extends hha {
    static String field_p;
    uia field_r;
    static boolean[] field_n;
    int field_s;
    static String field_o;
    static apa field_t;
    byte field_q;

    final byte[] b(byte param0) {
        if (param0 == -126) {
          L0: {
            if (this.field_m) {
              break L0;
            } else {
              if (this.field_r.field_h < -this.field_q + this.field_r.field_g.length) {
                break L0;
              } else {
                return this.field_r.field_g;
              }
            }
          }
          throw new RuntimeException();
        } else {
          return (byte[]) null;
        }
    }

    final int a(byte param0) {
        if (null == this.field_r) {
          return 0;
        } else {
          if (param0 > -7) {
            return -52;
          } else {
            return 100 * this.field_r.field_h / (-this.field_q + this.field_r.field_g.length);
          }
        }
    }

    final static boolean a(uia param0, char[] param1, int param2, boolean param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param2 != param1[0]) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var4_int = param0.field_h;
                var5 = 1;
                if (param3) {
                  break L1;
                } else {
                  field_n = (boolean[]) null;
                  break L1;
                }
              }
              L2: while (true) {
                L3: {
                  L4: {
                    if (param1.length <= var5) {
                      break L4;
                    } else {
                      stackIn_16_0 = param0.field_g.length;

                      if (var6 != 0) {
                        break L3;
                      } else {
                        L5: {
                          if (stackIn_16_0 == param0.field_h) {
                            break L5;
                          } else {
                            if (param0.c((byte) 106) == param1[var5]) {
                              var5++;
                              if (var6 == 0) {
                                continue L2;
                              } else {
                                break L4;
                              }
                            } else {
                              break L5;
                            }
                          }
                        }
                        param0.field_h = var4_int;
                        stackIn_13_0 = 0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                  }
                  param0.field_h = var4_int;
                  stackIn_16_0 = 1;
                  break L3;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var4);

            stackIn_19_1 = new StringBuilder().append("qqa.H(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L7;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L7;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_20_0), stackIn_23_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_16_0 != 0;
          } else {
            return stackIn_13_0 != 0;
          }
        }
    }

    final static ima a(int[] param0, oc param1, int param2, byte param3) {
        ima stackIn_3_0 = null;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_43_0 = 0;
        ima stackIn_58_0 = null;
        Object stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        Object stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        Object stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_62_2 = null;
        Object stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        Object stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        Object stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_65_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        Object var4 = null;
        Object var5 = null;
        Object var6 = null;
        Object var7 = null;
        int var8 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        float var17 = 0.0f;
        int var18_int = 0;
        float var18 = 0.0f;
        int var19_int = 0;
        float var19 = 0.0f;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        int[] var45 = null;
        int[] var46 = null;
        int[] var47 = null;
        int[] var48 = null;
        int[] var49 = null;
        int[] var50 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var23 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4 = null;
                        var5 = null;
                        var6 = null;
                        var7 = null;
                        if (param3 == -6) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = (ima) null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    try {
                        if (param1.field_g == null) {
                            statePc = 57;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var8 = param1.field_F;
                        var45 = new int[var8];
                        var46 = new int[var8];
                        var47 = new int[var8];
                        var48 = new int[var8];
                        var49 = new int[var8];
                        var50 = new int[var8];
                        var15 = 0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var15 >= var8) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var45[var15] = 2147483647;
                        var46[var15] = -2147483647;
                        var47[var15] = 2147483647;
                        var48[var15] = -2147483647;
                        var49[var15] = 2147483647;
                        var50[var15] = -2147483647;
                        var15++;
                        if (var23 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var23 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var15 = 0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackIn_12_0 = param2;
                        stackIn_12_1 = var15;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (stackIn_12_0 <= stackIn_12_1) {
                            statePc = 42;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var16 = param0[var15];
                        stackIn_43_0 = -1;
                        stackIn_14_0 = stackIn_43_0;
                        if (var23 != 0) {
                            statePc = 43;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (stackIn_14_0 == param1.field_g[var16]) {
                            statePc = 41;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var17_int = param1.field_g[var16] & 255;
                        var18_int = 0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (3 <= var18_int) {
                            statePc = 41;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackIn_12_0 = -1;
                        stackIn_18_0 = stackIn_12_0;
                        stackIn_12_1 = var18_int ^ -1;
                        stackIn_18_1 = stackIn_12_1;
                        if (var23 != 0) {
                            statePc = 12;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (stackIn_18_0 != stackIn_18_1) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var19_int = param1.field_a[var16];
                        if (var23 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (-2 == (var18_int ^ -1)) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var19_int = param1.field_J[var16];
                        if (var23 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var19_int = param1.field_t[var16];
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var20 = param1.field_b[var19_int];
                        var21 = param1.field_I[var19_int];
                        var22 = param1.field_p[var19_int];
                        if (var20 < var45[var17_int]) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var45[var17_int] = var20;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (var20 > var46[var17_int]) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var46[var17_int] = var20;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (var21 >= var47[var17_int]) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var47[var17_int] = var21;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (var21 > var48[var17_int]) {
                            statePc = 33;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var48[var17_int] = var21;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (var22 < var49[var17_int]) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var49[var17_int] = var22;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (var50[var17_int] < var22) {
                            statePc = 39;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var50[var17_int] = var22;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var18_int++;
                        if (var23 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var15++;
                        if (var23 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        stackIn_43_0 = var8;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        var24 = new int[stackIn_43_0];
                        var4 = var24;
                        var25 = new int[var8];
                        var5 = var25;
                        var7 = new float[var8][];
                        var26 = new int[var8];
                        var6 = var26;
                        var15 = 0;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (var15 >= var8) {
                            statePc = 57;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var16 = param1.field_u[var15];
                        if (var16 <= 0) {
                            statePc = 56;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var24[var15] = (var46[var15] + var45[var15]) / 2;
                        var25[var15] = (var48[var15] + var47[var15]) / 2;
                        var26[var15] = (var49[var15] + var50[var15]) / 2;
                        if (1 == var16) {
                            statePc = 50;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (-3 != (var16 ^ -1)) {
                            statePc = 49;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var19 = 64.0f / (float)param1.field_x[var15];
                        var18 = 64.0f / (float)param1.field_f[var15];
                        var17 = 64.0f / (float)param1.field_j[var15];
                        if (var23 == 0) {
                            statePc = 55;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var19 = (float)param1.field_x[var15] / 1024.0f;
                        var18 = (float)param1.field_f[var15] / 1024.0f;
                        var17 = (float)param1.field_j[var15] / 1024.0f;
                        if (var23 == 0) {
                            statePc = 55;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var20 = param1.field_j[var15];
                        var18 = 64.0f / (float)param1.field_f[var15];
                        if (-1 != (var20 ^ -1)) {
                            statePc = 52;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var19 = 1.0f;
                        var17 = 1.0f;
                        if (var23 == 0) {
                            statePc = 55;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (0 >= var20) {
                            statePc = 54;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var19 = (float)var20 / 1024.0f;
                        var17 = 1.0f;
                        if (var23 == 0) {
                            statePc = 55;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var17 = (float)(-var20) / 1024.0f;
                        var19 = 1.0f;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        ((Object[]) (var7))[var15] = sea.a(var18, var19, 16486, (int) param1.field_K[var15], var17, sea.c((int) param1.field_i[var15], 255), (int) param1.field_s[var15], (int) param1.field_q[var15]);
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        var15++;
                        if (var23 == 0) {
                            statePc = 44;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        stackIn_58_0 = new ima((int[]) (var4), (int[]) (var5), (int[]) (var6), (float[][]) (var7));
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 58: {
                    return stackIn_58_0;
                }
                case 59: {
                    var4 = caughtException;
                    stackIn_61_0 = var4;
                    stackIn_60_0 = stackIn_61_0;
                    stackIn_61_1 = new StringBuilder().append("qqa.G(");
                    stackIn_60_1 = stackIn_61_1;
                    if (param0 == null) {
                        statePc = 61;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    stackIn_62_0 = stackIn_60_0;
                    stackIn_62_1 = (StringBuilder) ((Object) stackIn_60_1);
                    stackIn_62_2 = "{...}";
                    statePc = 62;
                    continue stateLoop;
                }
                case 61: {
                    stackIn_62_0 = stackIn_61_0;
                    stackIn_62_1 = (StringBuilder) ((Object) stackIn_61_1);
                    stackIn_62_2 = "null";
                    statePc = 62;
                    continue stateLoop;
                }
                case 62: {
                    stackIn_64_0 = stackIn_62_0;
                    stackIn_63_0 = stackIn_64_0;
                    stackIn_64_1 = ((StringBuilder) (Object) stackIn_62_1).append(stackIn_62_2).append(',');
                    stackIn_63_1 = stackIn_64_1;
                    if (param1 == null) {
                        statePc = 64;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    stackIn_65_0 = stackIn_63_0;
                    stackIn_65_1 = (StringBuilder) ((Object) stackIn_63_1);
                    stackIn_65_2 = "{...}";
                    statePc = 65;
                    continue stateLoop;
                }
                case 64: {
                    stackIn_65_0 = stackIn_64_0;
                    stackIn_65_1 = (StringBuilder) ((Object) stackIn_64_1);
                    stackIn_65_2 = "null";
                    statePc = 65;
                    continue stateLoop;
                }
                case 65: {
                    throw tba.a((Throwable) ((Object) stackIn_65_0), stackIn_65_2 + ',' + param2 + ',' + param3 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        field_t = null;
        field_n = null;
        if (param0 != 0) {
            return;
        }
        field_p = null;
        field_o = null;
    }

    qqa() {
    }

    static {
        field_p = "Move";
        field_o = "Passwords can only contain letters and numbers";
    }
}
