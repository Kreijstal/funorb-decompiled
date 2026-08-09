/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa extends br {
    private int field_o;
    private rl field_i;
    static ip field_n;
    private int field_k;
    static boolean field_f;
    private int field_j;
    private int field_h;
    private int field_l;
    private int field_p;
    private int field_g;
    private int field_m;

    final static String a(String param0, int param1, String param2, String param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        String stackIn_22_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        StringBuilder var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4_int = param0.length();
                        var5 = param2.length();
                        var6 = param3.length();
                        if (param1 > 53) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        sa.a((md) null, (int[]) null, false, (int[]) null, (byte) -11, true, true);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (0 != var5) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw new IllegalArgumentException("Key cannot have zero length");
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var7 = var4_int;
                        var8 = -var5 + var6;
                        if (-1 != (var8 ^ -1)) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var9_int = 0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var9_int = param0.indexOf(param2, var9_int);
                        if (0 > var9_int) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var9_int = var9_int + var5;
                        var7 = var7 + var8;
                        if (var12 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var9 = new StringBuilder(var7);
                        var10 = 0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var11 = param0.indexOf(param2, var10);
                        if (-1 >= (var11 ^ -1)) {
                            statePc = 19;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var12 != 0) {
                            statePc = 20;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var12 == 0) {
                            statePc = 21;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        discarded$0 = var9.append(param0.substring(var10, var11));
                        discarded$1 = var9.append(param3);
                        var10 = var5 + var11;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (var12 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        discarded$2 = var9.append(param0.substring(var10));
                        stackIn_22_0 = var9.toString();
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 22: {
                    return stackIn_22_0;
                }
                case 23: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_26_0 = (RuntimeException) (var4);
                    stackIn_24_0 = stackIn_26_0;
                    stackIn_26_1 = new StringBuilder().append("sa.G(");
                    stackIn_24_1 = stackIn_26_1;
                    if (param0 == null) {
                        statePc = 26;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    stackIn_27_0 = (RuntimeException) ((Object) stackIn_24_0);
                    stackIn_27_1 = (StringBuilder) ((Object) stackIn_24_1);
                    stackIn_27_2 = "{...}";
                    statePc = 27;
                    continue stateLoop;
                }
                case 26: {
                    stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
                    stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
                    stackIn_27_2 = "null";
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    stackIn_30_0 = (RuntimeException) ((Object) stackIn_27_0);
                    stackIn_28_0 = stackIn_30_0;
                    stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',').append(param1).append(',');
                    stackIn_28_1 = stackIn_30_1;
                    if (param2 == null) {
                        statePc = 30;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    stackIn_31_0 = (RuntimeException) ((Object) stackIn_28_0);
                    stackIn_31_1 = (StringBuilder) ((Object) stackIn_28_1);
                    stackIn_31_2 = "{...}";
                    statePc = 31;
                    continue stateLoop;
                }
                case 30: {
                    stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
                    stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
                    stackIn_31_2 = "null";
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    stackIn_34_0 = (RuntimeException) ((Object) stackIn_31_0);
                    stackIn_32_0 = stackIn_34_0;
                    stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');
                    stackIn_32_1 = stackIn_34_1;
                    if (param3 == null) {
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
                    throw fa.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean b(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                this.a(-16, -55, 69);
                break L1;
              }
            }
            L2: {
              L3: {
                if (this.field_h < this.field_l) {
                  break L3;
                } else {
                  if ((this.field_k ^ -1) != -1) {
                    break L3;
                  } else {
                    stackIn_10_0 = 1;
                    break L2;
                  }
                }
              }
              stackIn_10_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "sa.A(" + param0 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final void d(int param0) {
        this.field_k = 0;
        if (param0 >= -89) {
            return;
        }
        try {
            this.field_h = this.field_l;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "sa.B(" + param0 + ')');
        }
    }

    final void c(int param0) {
        int fieldTemp$0 = 0;
        boolean stackIn_8_0 = false;
        int stackIn_17_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_7_0;
        br var2 = null;
        int var2_int = 0;
        RuntimeException var2_ref = null;
        lm var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (this.b(true)) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                L2: {
                  fieldTemp$0 = this.field_m;
                  this.field_m = this.field_m + 1;
                  if (-11 <= (fieldTemp$0 ^ -1)) {
                    break L2;
                  } else {
                    this.field_m = 0;
                    var2 = this.field_i.field_u.c(87);
                    L3: while (true) {
                      if (!(var2 instanceof ek)) {
                        break L2;
                      } else {
                        stackOut_7_0 = var2 instanceof lm;
                        stackIn_17_0 = stackOut_7_0 ? 1 : 0;
                        stackIn_8_0 = stackOut_7_0;
                        if (var6 != 0) {
                          break L1;
                        } else {
                          L4: {
                            if (stackIn_8_0) {
                              var3 = (lm) ((Object) var2);
                              var4 = var3.e((byte) -112) + -this.field_p;
                              var5 = var3.g(1829947600) + -this.field_o;
                              if (var4 * var4 - -(var5 * var5) >= 66564) {
                                break L4;
                              } else {
                                var3.a(-12, (sa) (this));
                                break L4;
                              }
                            } else {
                              break L4;
                            }
                          }
                          var2 = var2.field_d;
                          if (var6 == 0) {
                            continue L3;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                }
                this.field_g = this.field_g + 7;
                stackIn_17_0 = this.field_l ^ -1;
                break L1;
              }
              L5: {
                L6: {
                  if (stackIn_17_0 < (this.field_h ^ -1)) {
                    break L6;
                  } else {
                    this.field_k = this.field_k - this.field_j;
                    if (var6 == 0) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                L7: {
                  if ((this.field_k ^ -1) <= -257) {
                    break L7;
                  } else {
                    this.field_k = this.field_k + this.field_j;
                    break L7;
                  }
                }
                this.field_h = this.field_h + 1;
                break L5;
              }
              L8: {
                if (this.field_g <= 256) {
                  break L8;
                } else {
                  this.field_g = 0;
                  break L8;
                }
              }
              L9: {
                var2_int = -106 % ((param0 - 35) / 42);
                if ((this.field_k ^ -1) >= -257) {
                  break L9;
                } else {
                  this.field_k = 256;
                  break L9;
                }
              }
              L10: {
                if (this.field_k < 0) {
                  this.field_k = 0;
                  break L10;
                } else {
                  break L10;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2_ref), "sa.C(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        if (param0 >= -53) {
            return;
        }
        try {
            field_n = null;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "sa.H(" + param0 + ')');
        }
    }

    final static void a(md param0, int[] param1, boolean param2, int[] param3, byte param4, boolean param5, boolean param6) {
        RuntimeException runtimeException = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_60_0 = 0;
        int stackIn_60_1 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_79_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var30 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var7_int = 2147483647;
                        var8 = -2147483648;
                        var21 = param1[3] >> 814923874;
                        var22 = param1[4] >> -1747777982;
                        var23 = param1[5] >> 1040089954;
                        var24 = param1[6] >> -323443870;
                        var25 = param1[7] >> -122920350;
                        var26 = param1[8] >> 2079065474;
                        var27 = param1[9] >> 966690082;
                        var28 = param1[10] >> 1581801762;
                        var13 = var24 * param3[3] + param3[4] * var25 + param3[5] * var26 >> 1987350670;
                        var29 = param1[11] >> 1411848354;
                        var12 = var21 * param3[3] - (-(param3[4] * var22) - var23 * param3[5]) >> 311831566;
                        var15 = param3[7] * var22 + (param3[6] * var21 - -(param3[8] * var23)) >> -1089221874;
                        var20 = var28 * param3[10] + param3[9] * var27 + var29 * param3[11] >> -512560370;
                        var16 = var26 * param3[8] + (param3[6] * var24 - -(param3[7] * var25)) >> -1123621202;
                        var19 = var26 * param3[11] + param3[9] * var24 - -(param3[10] * var25) >> 857428142;
                        var14 = var27 * param3[3] + (var28 * param3[4] + var29 * param3[5]) >> -1554517362;
                        var17 = param3[7] * var28 + (var27 * param3[6] - -(param3[8] * var29)) >> 841143342;
                        var18 = var22 * param3[10] + (param3[9] * var21 - -(param3[11] * var23)) >> 1070710510;
                        var21 = -param1[0] + param3[0];
                        var22 = -param1[1] + param3[1];
                        var23 = -param1[2] + param3[2];
                        var9 = var23 * param1[5] + (var21 * param1[3] - -(var22 * param1[4])) >> 16 + -eq.field_g;
                        var10 = param1[8] * var23 + param1[7] * var22 + var21 * param1[6] >> 16 + -eq.field_g;
                        var11 = param1[11] * var23 + var22 * param1[10] + var21 * param1[9] >> -448722352;
                        var21 = ep.field_d;
                        var22 = ep.field_c;
                        if (param4 == -121) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_n = (ip) null;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var23 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (param0.field_n <= var23) {
                            statePc = 24;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var24 = param0.field_k[var23];
                        var25 = param0.field_E[var23];
                        var26 = param0.field_v[var23];
                        var27 = (var15 * var25 + (var24 * var12 + var18 * var26) >> -eq.field_g + 16) + var9;
                        var28 = (var19 * var26 + (var25 * var16 + var24 * var13) >> -eq.field_g + 16) + var10;
                        var29 = var11 + (var20 * var26 + (var17 * var25 + var14 * var24) >> -804483472);
                        stackIn_60_0 = -51;
                        stackIn_7_0 = stackIn_60_0;
                        stackIn_60_1 = var29 ^ -1;
                        stackIn_7_1 = stackIn_60_1;
                        if (var30 != 0) {
                            statePc = 60;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (stackIn_7_0 >= stackIn_7_1) {
                            statePc = 13;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        hl.field_f[var23] = -2147483648;
                        if (var30 == 0) {
                            statePc = 20;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        lo.field_j[var23] = var21 + var27 / var29;
                        jk.field_k[var23] = var28 / var29 + var22;
                        if ((var8 ^ -1) <= (var29 ^ -1)) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var8 = var29;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var7_int <= var29) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var7_int = var29;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        hl.field_f[var23] = var29;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (!param5) {
                            statePc = 23;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        vi.field_b[var23] = var27 >> eq.field_g;
                        ok.field_r[var23] = var28 >> eq.field_g;
                        hp.field_s[var23] = var29;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var23++;
                        if (var30 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (param0.field_t == null) {
                            statePc = 57;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (param0.field_w == null) {
                            statePc = 57;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (param0.field_I == null) {
                            statePc = 57;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (null == param0.field_e) {
                            statePc = 57;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (param0.field_h == null) {
                            statePc = 57;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (param0.field_q == null) {
                            statePc = 57;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (null == param0.field_f) {
                            statePc = 57;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (null == param0.field_O) {
                            statePc = 57;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (param0.field_i != null) {
                            statePc = 51;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var23 = 0;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (param0.field_B <= var23) {
                            statePc = 57;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var24 = param0.field_t[var23];
                        var25 = param0.field_w[var23];
                        var26 = param0.field_I[var23];
                        nm.field_m[var23] = var9 + (var25 * var15 + var24 * var12 + var18 * var26 >> -329216560);
                        nh.field_i[var23] = var10 - -(var13 * var24 + var25 * var16 - -(var26 * var19) >> -683618608);
                        cj.field_F[var23] = (var20 * var26 + (var17 * var25 + var24 * var14) >> 1522631536) + var11;
                        var24 = param0.field_e[var23];
                        var25 = param0.field_h[var23];
                        var26 = param0.field_q[var23];
                        fk.field_m[var23] = var9 - -(var12 * var24 + var15 * var25 - -(var26 * var18) >> -1459227344);
                        bh.field_c[var23] = var10 - -(var24 * var13 + (var25 * var16 + var26 * var19) >> 1969555440);
                        de.field_c[var23] = var11 - -(var20 * var26 + (var17 * var25 + var14 * var24) >> 209888656);
                        var24 = param0.field_f[var23];
                        var25 = param0.field_O[var23];
                        var26 = param0.field_i[var23];
                        fl.field_c[var23] = (var24 * var12 + var15 * var25 + var18 * var26 >> 1459582480) + var9;
                        qe.field_o[var23] = (var19 * var26 + (var25 * var16 + var13 * var24) >> -451914416) + var10;
                        ll.field_f[var23] = (var14 * var24 + var17 * var25 + var26 * var20 >> 812793072) + var11;
                        var23++;
                        if (var30 != 0) {
                            statePc = 80;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (var30 == 0) {
                            statePc = 52;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (!param2) {
                            statePc = 65;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var9 = param3[3];
                        var10 = param3[4];
                        var11 = param3[5];
                        var12 = param3[6];
                        var13 = param3[7];
                        var14 = param3[8];
                        var15 = param3[9];
                        var16 = param3[10];
                        var17 = param3[11];
                        var18 = 0;
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        stackIn_60_0 = param0.field_o ^ -1;
                        stackIn_60_1 = var18 ^ -1;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (stackIn_60_0 >= stackIn_60_1) {
                            statePc = 65;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (eb.field_J.length <= var18) {
                            statePc = 65;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        var19 = param0.field_A[var18];
                        var20 = param0.field_p[var18];
                        var21 = param0.field_b[var18];
                        eb.field_J[var18] = var20 * var12 + (var19 * var9 - -(var21 * var15)) >> 1297599664;
                        bq.field_g[var18] = var21 * var16 + var20 * var13 + var10 * var19 >> 1880548624;
                        wp.field_i[var18] = var19 * var11 + var20 * var14 + var21 * var17 >> 432012016;
                        var18++;
                        if (var30 == 0) {
                            statePc = 59;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        ho.a(param0, var8, var7_int, param6, 16634);
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 67: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_70_0 = (RuntimeException) (runtimeException);
                    stackIn_68_0 = stackIn_70_0;
                    stackIn_70_1 = new StringBuilder().append("sa.F(");
                    stackIn_68_1 = stackIn_70_1;
                    if (param0 == null) {
                        statePc = 70;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    stackIn_71_0 = (RuntimeException) ((Object) stackIn_68_0);
                    stackIn_71_1 = (StringBuilder) ((Object) stackIn_68_1);
                    stackIn_71_2 = "{...}";
                    statePc = 71;
                    continue stateLoop;
                }
                case 70: {
                    stackIn_71_0 = (RuntimeException) ((Object) stackIn_70_0);
                    stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
                    stackIn_71_2 = "null";
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    stackIn_74_0 = (RuntimeException) ((Object) stackIn_71_0);
                    stackIn_72_0 = stackIn_74_0;
                    stackIn_74_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(',');
                    stackIn_72_1 = stackIn_74_1;
                    if (param1 == null) {
                        statePc = 74;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    stackIn_75_0 = (RuntimeException) ((Object) stackIn_72_0);
                    stackIn_75_1 = (StringBuilder) ((Object) stackIn_72_1);
                    stackIn_75_2 = "{...}";
                    statePc = 75;
                    continue stateLoop;
                }
                case 74: {
                    stackIn_75_0 = (RuntimeException) ((Object) stackIn_74_0);
                    stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
                    stackIn_75_2 = "null";
                    statePc = 75;
                    continue stateLoop;
                }
                case 75: {
                    stackIn_78_0 = (RuntimeException) ((Object) stackIn_75_0);
                    stackIn_76_0 = stackIn_78_0;
                    stackIn_78_1 = ((StringBuilder) (Object) stackIn_75_1).append(stackIn_75_2).append(',').append(param2).append(',');
                    stackIn_76_1 = stackIn_78_1;
                    if (param3 == null) {
                        statePc = 78;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    stackIn_79_0 = (RuntimeException) ((Object) stackIn_76_0);
                    stackIn_79_1 = (StringBuilder) ((Object) stackIn_76_1);
                    stackIn_79_2 = "{...}";
                    statePc = 79;
                    continue stateLoop;
                }
                case 78: {
                    stackIn_79_0 = (RuntimeException) ((Object) stackIn_78_0);
                    stackIn_79_1 = (StringBuilder) ((Object) stackIn_78_1);
                    stackIn_79_2 = "null";
                    statePc = 79;
                    continue stateLoop;
                }
                case 79: {
                    throw fa.a((Throwable) ((Object) stackIn_79_0), stackIn_79_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
                }
                case 80: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, byte param1, int param2) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              if (param1 == 121) {
                break L1;
              } else {
                this.field_h = 67;
                break L1;
              }
            }
            this.field_o = param2;
            this.field_p = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var4), "sa.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    sa(ge param0, int param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_m = 0;
        try {
          L0: {
            this.field_i = param0.field_A;
            this.field_k = 0;
            this.field_l = param3;
            this.field_p = param1;
            this.field_j = 3;
            this.field_o = param2;
            this.field_g = 0;
            this.field_h = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("sa.<init>(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean a(int param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 17310) {
                break L1;
              } else {
                this.c(-105);
                break L1;
              }
            }
            L2: {
              var4_int = -this.field_p + param0;
              var5 = -this.field_o + param2;
              if (var4_int * var4_int + var5 * var5 >= 66564) {
                stackIn_7_0 = 0;
                break L2;
              } else {
                stackIn_7_0 = 1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var4), "sa.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    static {
        field_f = false;
        field_n = new ip();
    }
}
