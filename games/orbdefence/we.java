/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class we extends ta implements ai {
    static String field_F;
    static String field_A;
    static boolean field_B;
    private String[] field_D;
    private bf field_E;
    private s[] field_C;

    public final void a(byte param0, int param1, int param2, s param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        s stackIn_6_0 = null;
        s stackIn_6_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var6_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var6_int >= this.field_D.length) {
                    break L3;
                  } else {
                    stackIn_6_0 = (s) (param3);

                    stackIn_6_1 = this.field_C[var6_int];

                    if (var7 != 0) {
                      if (stackIn_6_0 == stackIn_6_1) {
                        break L2;
                      } else {
                        return;
                      }
                    } else {
                      L4: {
                        if (stackIn_6_0 != stackIn_6_1) {
                          break L4;
                        } else {
                          this.field_E.a(120, this.field_D[var6_int]);
                          break L4;
                        }
                      }
                      var6_int++;
                      if (var7 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var6_int = 2 % ((-3 - param0) / 62);
                if (this.field_C[this.field_D.length] == param3) {
                  break L2;
                } else {
                  return;
                }
              }
              this.field_E.a((byte) -8);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var6);

            stackIn_16_1 = new StringBuilder().append("we.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param4 + ')');
        }
    }

    final boolean a(char param0, int param1, pj param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-99 != (param1 ^ -1)) {
                if (-100 == (param1 ^ -1)) {
                  stackIn_10_0 = this.b(param2, false);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              } else {
                stackIn_6_0 = this.a(param2, false);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("we.I(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L1;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L1;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    we(bf param0) {
        super(0, 0, 0, 0, (td) null);
        try {
            this.field_E = param0;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "we.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        kc var5;
        super.a(param0, param1, param2, param3);
        if (param1 != 0) {
          return;
        } else {
          var5 = lm.field_f;
          if (null != this.field_D) {
            var5.a(pe.field_c, this.field_s + param3, this.field_n + param0, this.field_m, 20, 16777215, -1, 0, 0, var5.field_B + var5.field_H);
            return;
          } else {
            return;
          }
        }
    }

    final void a(String[] param0, byte param1) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4_int = 0;
        qc var4 = null;
        int var5 = 0;
        int var6 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_x.a(false);
                        if (param0 == null) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param0.length == 0) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        this.field_D = null;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return;
                }
                case 6: {
                    try {
                        var3_int = param0.length;
                        this.field_D = new String[var3_int];
                        var4_int = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var3_int <= var4_int) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        this.field_D[var4_int] = g.a((CharSequence) ((Object) param0[var4_int]), (byte) -119).replace(' ', ' ');
                        var4_int++;
                        if (var6 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var4 = new qc(lm.field_f, 0, 1);
                        this.field_C = new s[1 + var3_int];
                        var5 = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var3_int <= var5) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        this.field_C[var5] = new s(this.field_D[var5], (ag) (this));
                        this.field_C[var5].field_j = (td) ((Object) var4);
                        this.field_C[var5].field_i = oa.field_f;
                        this.field_C[var5].a(0, var5 * 16 + 20, 15, (byte) -90, 80);
                        this.a(this.field_C[var5], (byte) 74);
                        var5++;
                        if (var6 != 0) {
                            statePc = 22;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var6 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (param1 == -34) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        this.a(95, -43, 80, 127);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        this.field_C[var3_int] = new s(mm.field_B, (ag) (this));
                        this.field_C[var3_int].field_j = (td) ((Object) var4);
                        this.field_C[var3_int].a(0, 20 + (var3_int + 1) * 16, 15, (byte) -90, 100);
                        this.a(this.field_C[var3_int], (byte) 74);
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 18: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_20_0 = (RuntimeException) (var3);
                    stackIn_19_0 = stackIn_20_0;
                    stackIn_20_1 = new StringBuilder().append("we.N(");
                    stackIn_19_1 = stackIn_20_1;
                    if (param0 == null) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    stackIn_21_0 = (RuntimeException) ((Object) stackIn_19_0);
                    stackIn_21_1 = (StringBuilder) ((Object) stackIn_19_1);
                    stackIn_21_2 = "{...}";
                    statePc = 21;
                    continue stateLoop;
                }
                case 20: {
                    stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
                    stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
                    stackIn_21_2 = "null";
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    throw dd.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
                }
                case 22: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static boolean a(int param0, int param1, CharSequence param2, boolean param3) {
        int stackIn_10_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_43_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        CharSequence var12 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 == 87) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var12 = (CharSequence) null;
                        we.a(24, 92, (CharSequence) null, true);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (2 > param0) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (-37 <= (param0 ^ -1)) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw new IllegalArgumentException("" + param0);
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var4_int = 0;
                        var5 = 0;
                        var6 = 0;
                        var7 = param2.length();
                        var8 = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var8 >= var7) {
                            statePc = 42;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var9 = param2.charAt(var8);
                        stackIn_43_0 = -1;
                        stackIn_10_0 = stackIn_43_0;
                        if (var11 != 0) {
                            statePc = 43;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (stackIn_10_0 != (var8 ^ -1)) {
                            statePc = 16;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var9 != 45) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var4_int = 1;
                        if (var11 == 0) {
                            statePc = 41;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var9 != 43) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (param3) {
                            statePc = 41;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var9 < 48) {
                            statePc = 20;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (57 < var9) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var9 -= 48;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (var9 < 65) {
                            statePc = 24;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (90 < var9) {
                            statePc = 24;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var9 -= 55;
                        if (var11 == 0) {
                            statePc = 31;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (97 > var9) {
                            statePc = 27;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (var9 <= 122) {
                            statePc = 29;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        return false;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackIn_28_0 = 0;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 28: {
                    return stackIn_28_0 != 0;
                }
                case 29: {
                    try {
                        var9 -= 87;
                        if (var11 == 0) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var9 -= 48;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (param0 <= var9) {
                            statePc = 33;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackIn_34_0 = 0;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 34: {
                    return stackIn_34_0 != 0;
                }
                case 35: {
                    try {
                        if (var4_int == 0) {
                            statePc = 37;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var9 = -var9;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var10 = var6 * param0 - -var9;
                        if (var10 / param0 == var6) {
                            statePc = 40;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        stackIn_39_0 = 0;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 39: {
                    return stackIn_39_0 != 0;
                }
                case 40: {
                    try {
                        var6 = var10;
                        var5 = 1;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var8++;
                        if (var11 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        stackIn_43_0 = var5;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 43: {
                    return stackIn_43_0 != 0;
                }
                case 44: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_46_0 = (RuntimeException) (var4);
                    stackIn_45_0 = stackIn_46_0;
                    stackIn_46_1 = new StringBuilder().append("we.K(").append(param0).append(',').append(param1).append(',');
                    stackIn_45_1 = stackIn_46_1;
                    if (param2 == null) {
                        statePc = 46;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    stackIn_47_0 = (RuntimeException) ((Object) stackIn_45_0);
                    stackIn_47_1 = (StringBuilder) ((Object) stackIn_45_1);
                    stackIn_47_2 = "{...}";
                    statePc = 47;
                    continue stateLoop;
                }
                case 46: {
                    stackIn_47_0 = (RuntimeException) ((Object) stackIn_46_0);
                    stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
                    stackIn_47_2 = "null";
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    throw dd.a((Throwable) ((Object) stackIn_47_0), stackIn_47_2 + ',' + param3 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void k(int param0) {
        field_A = null;
        if (param0 != 29858) {
            return;
        }
        field_F = null;
    }

    static {
        field_F = "Score";
        field_A = "TOUGHO";
        field_B = false;
    }
}
