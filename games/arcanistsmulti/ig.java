/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig {
    static boolean[] field_a;
    private int field_e;
    static String field_d;
    static int field_g;
    private int field_f;
    private gb field_b;
    private pk field_c;

    final static void a(boolean param0, vg param1, int param2, byte param3, int param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_10_0 = false;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
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
        boolean stackOut_9_0;
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
                    var19 = ArcanistsMulti.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = jl.a(param3, (-param4 + param2) * 3);
                        var6 = param4 * 3;
                        tl.e((byte) -79);
                        var7 = -10 + var5_int;
                        if ((param1.field_F ^ -1) >= -1) {
                            statePc = 7;
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
                    try {
                        if (param1.field_H == null) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        im.d(-24000);
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
                        ol.field_i = 0;
                        var8 = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (param1.field_G <= var8) {
                            statePc = 48;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var9 = param1.field_U[var8];
                        var10 = param1.field_T[var8];
                        var11 = param1.field_O[var8];
                        stackOut_9_0 = param0;
                        stackIn_49_0 = stackOut_9_0 ? 1 : 0;
                        stackIn_10_0 = stackOut_9_0;
                        if (var19 != 0) {
                            statePc = 49;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (!stackIn_10_0) {
                            statePc = 17;
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
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var12 = ud.field_p[var9];
                        var13 = v.field_g[var9];
                        var14 = -var12 + ud.field_p[var10];
                        var15 = -var12 + ud.field_p[var11];
                        var16 = -var13 + v.field_g[var10];
                        var17 = v.field_g[var11] - var13;
                        if ((-(var15 * var16) + var14 * var17 ^ -1) > -1) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var19 == 0) {
                            statePc = 47;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var12 = eg.field_a[var9];
                        if (2147483647 != (var12 ^ -1)) {
                            statePc = 21;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var19 == 0) {
                            statePc = 47;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var13 = eg.field_a[var10];
                        if ((var13 ^ -1) == 2147483647) {
                            statePc = 47;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var14 = eg.field_a[var11];
                        if (var14 != -2147483648) {
                            statePc = 26;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var19 == 0) {
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
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var15 = -var6 + var14 + (var13 + var12);
                        if (var7 < 0) {
                            statePc = 29;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackIn_30_0 = var15 >> var7;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackIn_30_0 = var15 << -var7;
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
                        var16 = -stackIn_30_0 + (-1 + kl.field_B.length);
                        var17 = kl.field_B[var16];
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (0 == var17 >> -432352700) {
                            statePc = 39;
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
                        var16--;
                        stackIn_40_0 = 0;
                        stackIn_33_0 = stackIn_40_0;
                        stackIn_40_1 = var16;
                        stackIn_33_1 = stackIn_40_1;
                        if (var19 != 0) {
                            statePc = 40;
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
                        if (stackIn_33_0 > stackIn_33_1) {
                            statePc = 37;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
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
                case 37: {
                    try {
                        System.err.println("Out of range!");
                        if (var19 == 0) {
                            statePc = 47;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var17 = kl.field_B[var16];
                        if (var19 == 0) {
                            statePc = 31;
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
                        stackIn_40_0 = var17;
                        stackIn_40_1 = var16 << 1159712452;
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
                        var18 = stackIn_40_0 + stackIn_40_1;
                        w.field_Lb[var18] = var8;
                        kl.field_B[var16] = 1 + var17;
                        if ((param1.field_F ^ -1) >= -1) {
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
                        if (null == param1.field_H) {
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
                        dupTemp$0 = param1.field_H[var8];
                        jb.field_s[dupTemp$0] = jb.field_s[dupTemp$0] + 1;
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
                        ol.field_i = ol.field_i + 1;
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
                            statePc = 8;
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
                        stackIn_49_0 = 0;
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
                        if (stackIn_49_0 >= param1.field_F) {
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
                        if (param1.field_H == null) {
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
                        if ((jb.field_s.length ^ -1) >= (var9 ^ -1)) {
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
                        var10 = jb.field_s[var9];
                        jb.field_s[var9] = var8;
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
                    stackIn_63_1 = new StringBuilder().append("ig.H(").append(param0).append(',');
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
                    throw aa.a((Throwable) ((Object) stackIn_64_0), stackIn_64_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
                }
                case 65: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(byte param0, int param1, long param2, Object param3) {
        nn var6 = null;
        nh var6_ref = null;
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6_ref2 = null;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if ((param1 ^ -1) < (this.field_e ^ -1)) {
              throw new IllegalStateException();
            } else {
              this.a(-104, param2);
              this.field_f = this.field_f - param1;
              L1: while (true) {
                L2: {
                  if (-1 >= (this.field_f ^ -1)) {
                    break L2;
                  } else {
                    var6 = (nn) ((Object) this.field_b.b(31));
                    this.a(var6, 2147483647);
                    if (var7 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  var6_ref = new nh(param3, param1);
                  this.field_c.a((byte) -68, var6_ref, param2);
                  this.field_b.a((byte) 37, var6_ref);
                  ((nn) ((Object) var6_ref)).field_k = 0L;
                  if (param0 < -99) {
                    break L3;
                  } else {
                    this.a((byte) -27, 45, 65L, (Object) null);
                    break L3;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6_ref2 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var6_ref2);

            stackIn_15_1 = new StringBuilder().append("ig.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
    }

    private final void a(int param0, long param1) {
        nn var4 = null;
        if (param0 > -43) {
            return;
        }
        try {
            var4 = (nn) ((Object) this.field_c.a((byte) -79, param1));
            this.a(var4, 2147483647);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "ig.B(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(Object param0, long param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.a((byte) -102, 1, param1, param0);
              if (param2 < -59) {
                break L1;
              } else {
                this.field_c = (pk) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("ig.C(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(nn param0, int param1) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (param0 != null) {
                param0.a(true);
                param0.a((byte) 88);
                this.field_f = this.field_f + param0.field_r;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 == 2147483647) {
                break L2;
              } else {
                this.a((byte) 22, 41, 61L, (Object) null);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("ig.E(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
    }

    final Object a(long param0, boolean param1) {
        nn var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        nh var6 = null;
        Object stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_17_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = (nn) ((Object) this.field_c.a((byte) 118, param0));
            if (var4 != null) {
              var5 = var4.e((byte) 110);
              if (!param1) {
                if (var5 == null) {
                  var4.a(true);
                  var4.a((byte) 88);
                  this.field_f = this.field_f + var4.field_r;
                  stackIn_10_0 = null;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L1: {
                    L2: {
                      if (var4.f((byte) 96)) {
                        break L2;
                      } else {
                        this.field_b.a((byte) 37, var4);
                        var4.field_k = 0L;
                        if (!ArcanistsMulti.field_G) {
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                    var6 = new nh(var5, var4.field_r);
                    this.field_c.a((byte) -99, var6, var4.field_e);
                    this.field_b.a((byte) 37, var6);
                    ((nn) ((Object) var6)).field_k = 0L;
                    var4.a(true);
                    var4.a((byte) 88);
                    break L1;
                  }
                  stackIn_17_0 = var5;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                stackIn_5_0 = (Object) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var4_ref), "ig.D(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              return stackIn_17_0;
            }
          }
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
            return;
        }
        try {
            field_a = null;
            field_d = null;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "ig.A(" + param0 + ')');
        }
    }

    final static void a(int param0, boolean param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if ((ce.field_h ^ -1) < -1) {
                if (!pg.field_d) {
                  break L1;
                } else {
                  de.b(0, 0, de.field_e, n.field_g.field_nb);
                  gm.field_h.a(param1, true);
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                if (sm.field_a > param0) {
                  break L3;
                } else {
                  if (oo.field_y <= 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              if (!so.field_j) {
                break L2;
              } else {
                de.b(0, 0, de.field_e, n.field_g.field_nb);
                nl.field_Fb.a(param1, true);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "ig.F(" + param0 + ',' + param1 + ')');
        }
    }

    ig(int param0) {
        this(param0, param0);
    }

    private ig(int param0, int param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        this.field_b = new gb();
        try {
          L0: {
            this.field_e = param0;
            this.field_f = param0;
            var3_int = 1;
            L1: while (true) {
              L2: {
                if ((param0 ^ -1) >= (var3_int - -var3_int ^ -1)) {
                  break L2;
                } else {
                  if ((param1 ^ -1) >= (var3_int ^ -1)) {
                    break L2;
                  } else {
                    var3_int = var3_int + var3_int;
                    if (var4 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              this.field_c = new pk(var3_int);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) runtimeException), "ig.<init>(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_d = "Show chat (<%0> unread messages)";
        field_a = new boolean[]{true, false, true, false, true, true, true, false, false, false, false, false, false, false, true, false, false, false, false, false, true, true, true, true, true, true, true, true, false, false, false, true, true, false, false, false, true, true, true, false, true, false, true, false, false, false, true, true, false, false, false, false, false, false, false, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true};
        field_g = 64;
    }
}
