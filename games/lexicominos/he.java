/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class he {
    private ca[] field_e;
    private int field_d;
    static String field_i;
    static String[] field_f;
    private long field_j;
    private ca field_g;
    static aj field_c;
    static String field_b;
    static dg field_h;
    static String field_a;

    final void a(ca param0, long param1, byte param2) {
        ca var5 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        try {
          L0: {
            L1: {
              if (null != param0.field_m) {
                param0.b(12);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var5 = this.field_e[(int)(param1 & (long)(this.field_d - 1))];
              param0.field_l = var5;
              param0.field_m = var5.field_m;
              param0.field_m.field_l = param0;
              param0.field_l.field_m = param0;
              if (param2 == 64) {
                break L2;
              } else {
                he.a(-19);
                break L2;
              }
            }
            param0.field_j = param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5_ref);

            stackIn_12_1 = new StringBuilder().append("he.C(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, pk param1, int param2, int param3, boolean param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_12_0 = false;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        int stackIn_49_0 = 0;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_64_2 = null;
        int decompiledRegionSelector0 = 0;
        boolean stackOut_11_0;
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
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
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = kb.a((-param3 + param0) * 3, 16);
                        var6 = param3 * 3;
                        var7 = var5_int + -10;
                        oj.a((byte) 102);
                        if (param2 >= 103) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        if (-1 <= (param1.field_N ^ -1)) {
                            statePc = 9;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param1.field_J == null) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        ug.a((byte) 122);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        wb.field_i = 0;
                        var8 = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if ((param1.field_H ^ -1) >= (var8 ^ -1)) {
                            statePc = 48;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var9 = param1.field_a[var8];
                        var10 = param1.field_k[var8];
                        var11 = param1.field_B[var8];
                        stackOut_11_0 = param4;
                        stackIn_49_0 = stackOut_11_0 ? 1 : 0;
                        stackIn_12_0 = stackOut_11_0;
                        if (var19 != 0) {
                            statePc = 49;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (!stackIn_12_0) {
                            statePc = 19;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var12 = ej.field_c[var9];
                        var13 = fk.field_d[var9];
                        var14 = -var12 + ej.field_c[var10];
                        var15 = -var12 + ej.field_c[var11];
                        var16 = fk.field_d[var10] + -var13;
                        var17 = fk.field_d[var11] - var13;
                        if ((-(var16 * var15) + var14 * var17 ^ -1) > -1) {
                            statePc = 19;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var19 == 0) {
                            statePc = 47;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var12 = qd.field_a[var9];
                        if (var12 != -2147483648) {
                            statePc = 23;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (var19 == 0) {
                            statePc = 47;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var13 = qd.field_a[var10];
                        if (var13 == -2147483648) {
                            statePc = 47;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var14 = qd.field_a[var11];
                        if (-2147483648 == var14) {
                            statePc = 47;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var15 = -var6 + var14 + (var13 + var12);
                        if (0 > var7) {
                            statePc = 28;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        stackIn_29_0 = var15 >> var7;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackIn_29_0 = var15 << -var7;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var16 = -stackIn_29_0 + qg.field_b.length + -1;
                        var17 = qg.field_b[var16];
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (var17 >> 1254248484 == 0) {
                            statePc = 39;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var16--;
                        stackIn_40_0 = -1;
                        stackIn_32_0 = stackIn_40_0;
                        stackIn_40_1 = var16 ^ -1;
                        stackIn_32_1 = stackIn_40_1;
                        if (var19 != 0) {
                            statePc = 40;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (stackIn_32_0 >= stackIn_32_1) {
                            statePc = 38;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        System.err.println("Out of range!");
                        if (var19 == 0) {
                            statePc = 47;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var17 = qg.field_b[var16];
                        if (var19 == 0) {
                            statePc = 30;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        stackIn_40_0 = var16 << 175723748;
                        stackIn_40_1 = -var17;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var18 = stackIn_40_0 - stackIn_40_1;
                        bf.field_a[var18] = var8;
                        qg.field_b[var16] = var17 - -1;
                        if (-1 <= (param1.field_N ^ -1)) {
                            statePc = 46;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (param1.field_J == null) {
                            statePc = 46;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        dupTemp$0 = param1.field_J[var8];
                        bd.field_l[dupTemp$0] = bd.field_l[dupTemp$0] + 1;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        wb.field_i = wb.field_i + 1;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var8++;
                        if (var19 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        stackIn_49_0 = param1.field_N ^ -1;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (stackIn_49_0 >= -1) {
                            statePc = 65;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (null == param1.field_J) {
                            statePc = 65;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var8 = 0;
                        var9 = 0;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (bd.field_l.length <= var9) {
                            statePc = 65;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var10 = bd.field_l[var9];
                        bd.field_l[var9] = var8;
                        var8 = var8 + var10;
                        var9++;
                        if (var19 != 0) {
                            statePc = 65;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (var19 == 0) {
                            statePc = 54;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 60: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_63_0 = (RuntimeException) (var5);
                    stackIn_61_0 = stackIn_63_0;
                    stackIn_63_1 = new StringBuilder().append("he.E(").append(param0).append(',');
                    stackIn_61_1 = stackIn_63_1;
                    if (param1 == null) {
                        statePc = 63;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    stackIn_64_0 = (RuntimeException) ((Object) stackIn_61_0);
                    stackIn_64_1 = (StringBuilder) ((Object) stackIn_61_1);
                    stackIn_64_2 = "{...}";
                    statePc = 64;
                    continue stateLoop;
                }
                case 63: {
                    stackIn_64_0 = (RuntimeException) ((Object) stackIn_63_0);
                    stackIn_64_1 = (StringBuilder) ((Object) stackIn_63_1);
                    stackIn_64_2 = "null";
                    statePc = 64;
                    continue stateLoop;
                }
                case 64: {
                    throw ld.a((Throwable) ((Object) stackIn_64_0), stackIn_64_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
                }
                case 65: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final ca b(int param0) {
        ca var2 = null;
        RuntimeException var2_ref = null;
        ca var3 = null;
        int var4 = 0;
        Object stackIn_3_0 = null;
        ca stackIn_6_0 = null;
        ca stackIn_13_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if (this.field_g != null) {
              var2 = this.field_e[(int)((long)(this.field_d + -1) & this.field_j)];
              if (param0 < -73) {
                L1: while (true) {
                  L2: {
                    L3: {
                      if (var2 == this.field_g) {
                        break L3;
                      } else {
                        stackIn_16_0 = this;

                        if (var4 != 0) {
                          break L2;
                        } else {
                          if ((((he) (this)).field_g.field_j ^ -1L) != (this.field_j ^ -1L)) {
                            this.field_g = this.field_g.field_l;
                            if (var4 == 0) {
                              continue L1;
                            } else {
                              break L3;
                            }
                          } else {
                            var3 = this.field_g;
                            this.field_g = this.field_g.field_l;
                            stackIn_13_0 = (ca) (var3);
                            decompiledRegionSelector0 = 2;
                            break L0;
                          }
                        }
                      }
                    }
                    stackIn_16_0 = this;
                    break L2;
                  }
                  ((he) (this)).field_g = null;
                  stackIn_17_0 = null;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                stackIn_6_0 = (ca) null;
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
          throw ld.a((Throwable) ((Object) var2_ref), "he.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ca) ((Object) stackIn_3_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              return (ca) ((Object) stackIn_17_0);
            }
          }
        }
    }

    public static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                he.a(52, (pk) null, -70, 88, false);
                break L1;
              }
            }
            field_i = null;
            field_c = null;
            field_h = null;
            field_f = null;
            field_b = null;
            field_a = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var1), "he.D(" + param0 + ')');
        }
    }

    he(int param0) {
        ca dupTemp$1 = null;
        RuntimeException runtimeException = null;
        int var2_int = 0;
        ca var3 = null;
        int var4 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_d = param0;
                        this.field_e = new ca[param0];
                        var2_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((var2_int ^ -1) <= (param0 ^ -1)) {
                            statePc = 9;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        dupTemp$1 = new ca();
                        this.field_e[var2_int] = dupTemp$1;
                        var3 = dupTemp$1;
                        var3.field_m = var3;
                        var3.field_l = var3;
                        var2_int++;
                        if (var4 != 0) {
                            statePc = 9;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var4 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw ld.a((Throwable) ((Object) runtimeException), "he.<init>(" + param0 + ')');
                }
                case 9: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final ca a(long param0, boolean param1) {
        ca var4 = null;
        RuntimeException var4_ref = null;
        ca var5 = null;
        int var6 = 0;
        ca stackIn_11_0 = null;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_j = param0;
              if (param1) {
                break L1;
              } else {
                he.a(-81);
                break L1;
              }
            }
            var4 = this.field_e[(int)((long)(-1 + this.field_d) & param0)];
            this.field_g = var4.field_l;
            L2: while (true) {
              L3: {
                L4: {
                  if (this.field_g == var4) {
                    break L4;
                  } else {
                    stackIn_14_0 = this;

                    if (var6 != 0) {
                      break L3;
                    } else {
                      if ((((he) (this)).field_g.field_j ^ -1L) != (param0 ^ -1L)) {
                        this.field_g = this.field_g.field_l;
                        if (var6 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      } else {
                        var5 = this.field_g;
                        this.field_g = this.field_g.field_l;
                        stackIn_11_0 = (ca) (var5);
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    }
                  }
                }
                stackIn_14_0 = this;
                break L3;
              }
              ((he) (this)).field_g = null;
              stackIn_15_0 = null;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var4_ref), "he.A(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_11_0;
        } else {
          return (ca) ((Object) stackIn_15_0);
        }
    }

    static {
        field_i = "Orb coins: <%0>";
        field_f = new String[]{"By rating", "By win percentage"};
        field_c = new aj(11, 0, 1, 2);
        field_b = "Unfortunately you are not eligible to create an account.";
        field_h = new dg();
        field_a = "Cancel";
    }
}
