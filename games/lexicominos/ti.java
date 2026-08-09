/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ti extends nb implements nf, jk {
    private kf field_E;
    static long field_M;
    private String field_F;
    private rl field_G;
    static db[] field_I;
    private rl field_B;
    private kf field_H;
    private boolean field_K;
    private boolean field_J;
    static eg field_L;
    private boolean field_D;
    private kf field_N;
    static String field_C;

    private final void g(int param0) {
        CharSequence var3;
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            var3 = (CharSequence) null;
            ti.a(-118, (CharSequence) null, -52, true);
            break L0;
          }
        }
        L1: {
          L2: {
            if (sg.a(false)) {
              break L2;
            } else {
              if (0 >= this.field_G.field_u.length()) {
                break L1;
              } else {
                if (0 >= this.field_B.field_u.length()) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
          }
          ha.a(this.field_G.field_u, this.field_B.field_u, param0 ^ -111);
          break L1;
        }
    }

    public final void a(byte param0, rl param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 10) {
                break L1;
              } else {
                field_M = 116L;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("ti.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final boolean a(char param0, int param1, w param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, (byte) 107)) {
              var5_int = -37 % ((-13 - param3) / 55);
              if (-99 == (param1 ^ -1)) {
                stackIn_6_0 = this.a(0, param2);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if ((param1 ^ -1) != -100) {
                  stackIn_11_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_9_0 = this.c((byte) 119, param2);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var5);

            stackIn_14_1 = new StringBuilder().append("ti.P(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L1;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L1;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              return stackIn_11_0 != 0;
            }
          }
        }
    }

    final void a(int param0, String param1) {
        rl var3 = null;
        String var4 = null;
        try {
            if (param0 != 3) {
                this.field_G = (rl) null;
            }
            var3 = this.field_G;
            var4 = param1;
            var3.a(var4, param0 + -4, false);
            this.field_B.j(0);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "ti.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(rl param0, boolean param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.field_G == param0) {
                this.field_B.a((byte) 44, (w) (this));
                break L1;
              } else {
                break L1;
              }
            }
            if (param1) {
              L2: {
                if (this.field_B != param0) {
                  break L2;
                } else {
                  this.g(0);
                  break L2;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (runtimeException);

            stackIn_10_1 = new StringBuilder().append("ti.E(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static int a(int param0, CharSequence param1, int param2, boolean param3) {
        int stackIn_8_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_42_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
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
        int var12 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if ((param0 ^ -1) > -3) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((param0 ^ -1) < -37) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw new IllegalArgumentException("" + param0);
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var4_int = 30 % ((-72 - param2) / 54);
                        var5 = 0;
                        var6 = 0;
                        var7 = 0;
                        var8 = param1.length();
                        var9 = 0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var9 >= var8) {
                            statePc = 37;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var10 = param1.charAt(var9);
                        stackIn_38_0 = var9 ^ -1;
                        stackIn_8_0 = stackIn_38_0;
                        if (var12 != 0) {
                            statePc = 38;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (stackIn_8_0 != -1) {
                            statePc = 14;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var10 != 45) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var5 = 1;
                        if (var12 == 0) {
                            statePc = 36;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var10 != 43) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (param3) {
                            statePc = 36;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var10 < 48) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var10 > 57) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var10 -= 48;
                        if (var12 == 0) {
                            statePc = 28;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var10 < 65) {
                            statePc = 22;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var10 > 90) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var10 -= 55;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (var10 < 97) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var10 <= 122) {
                            statePc = 26;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        throw new NumberFormatException();
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var10 -= 87;
                        if (var12 == 0) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var10 -= 55;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (var10 >= param0) {
                            statePc = 30;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        throw new NumberFormatException();
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (var5 == 0) {
                            statePc = 33;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var10 = -var10;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var11 = var10 + param0 * var7;
                        if (var11 / param0 == var7) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        throw new NumberFormatException();
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var6 = 1;
                        var7 = var11;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var9++;
                        if (var12 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        stackIn_38_0 = var6;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (stackIn_38_0 == 0) {
                            statePc = 40;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        throw new NumberFormatException();
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        stackIn_42_0 = var7;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 42: {
                    return stackIn_42_0;
                }
                case 43: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_45_0 = (RuntimeException) (var4);
                    stackIn_44_0 = stackIn_45_0;
                    stackIn_45_1 = new StringBuilder().append("ti.F(").append(param0).append(',');
                    stackIn_44_1 = stackIn_45_1;
                    if (param1 == null) {
                        statePc = 45;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    stackIn_46_0 = (RuntimeException) ((Object) stackIn_44_0);
                    stackIn_46_1 = (StringBuilder) ((Object) stackIn_44_1);
                    stackIn_46_2 = "{...}";
                    statePc = 46;
                    continue stateLoop;
                }
                case 45: {
                    stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
                    stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
                    stackIn_46_2 = "null";
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    throw ld.a((Throwable) ((Object) stackIn_46_0), stackIn_46_2 + ',' + param2 + ',' + param3 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static jb[] a(byte param0) {
        jb[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = Lexicominos.field_L ? 1 : 0;
                    var1 = new jb[th.field_t];
                    var2 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (th.field_t <= var2) {
                        statePc = 5;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var1[var2] = new jb(uc.field_fb, eh.field_b, mg.field_x[var2], rg.field_c[var2], pb.field_h[var2], bd.field_m[var2], be.field_f[var2], ci.field_b);
                    var2++;
                    if (var3 != 0) {
                        statePc = 8;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (var3 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (param0 > 103) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    field_M = -84L;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    gk.a(12428);
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    return var1;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final void a(int param0, int param1, int param2, int param3, kf param4) {
        int var7 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param4 != this.field_N) {
                L2: {
                  if (param4 == this.field_H) {
                    break L2;
                  } else {
                    if (this.field_E == param4) {
                      L3: {
                        if (!this.field_J) {
                          break L3;
                        } else {
                          vi.a((byte) 115);
                          if (var7 == 0) {
                            break L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                      L4: {
                        if (this.field_D) {
                          break L4;
                        } else {
                          ld.i(param2 ^ -215531225);
                          if (var7 == 0) {
                            break L1;
                          } else {
                            break L4;
                          }
                        }
                      }
                      ga.b(0);
                      if (var7 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                bg.a(false);
                if (var7 == 0) {
                  break L1;
                } else {
                  this.g(0);
                  break L1;
                }
              } else {
                this.g(0);
                break L1;
              }
            }
            L5: {
              if (param2 == 215535458) {
                break L5;
              } else {
                field_L = (eg) null;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var6);

            stackIn_22_1 = new StringBuilder().append("ti.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L6;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L6;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
    }

    final String e(byte param0) {
        int var2 = -19 % ((-3 - param0) / 60);
        if (this.field_G.field_u == null) {
            return "";
        }
        return this.field_G.field_u;
    }

    ti(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (rd) null);
        jf dupTemp$0 = null;
        jf dupTemp$1 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_17_0 = null;
        kf stackIn_17_1 = null;
        kf stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        kf stackIn_18_1 = null;
        kf stackIn_18_2 = null;
        String stackIn_18_3 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        StringBuilder stackIn_62_1 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        v var6 = null;
        RuntimeException var6_ref = null;
        le var7 = null;
        String var8 = null;
        m var9 = null;
        int var11 = 0;
        jf var12 = null;
        jf var13 = null;
        var11 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_F = param1;
              stackIn_3_0 = this;

              if (!param4) {
                stackIn_4_0 = this;
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = 1;
                break L1;
              }
            }
            L2: {
              ((ti) (this)).field_D = stackIn_4_1 != 0;
              stackIn_6_0 = this;

              if (!param3) {
                stackIn_7_0 = this;
                stackIn_7_1 = 0;
                break L2;
              } else {
                stackIn_7_0 = this;
                stackIn_7_1 = 1;
                break L2;
              }
            }
            L3: {
              ((ti) (this)).field_K = stackIn_7_1 != 0;
              stackIn_9_0 = this;

              if (!param2) {
                stackIn_10_0 = this;
                stackIn_10_1 = 0;
                break L3;
              } else {
                stackIn_10_0 = this;
                stackIn_10_1 = 1;
                break L3;
              }
            }
            L4: {
              ((ti) (this)).field_J = stackIn_10_1 != 0;
              if (!this.field_J) {
                break L4;
              } else {
                L5: {
                  if (this.field_K) {
                    break L5;
                  } else {
                    if (!this.field_D) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                throw new IllegalStateException();
              }
            }
            L6: {
              L7: {
                this.field_G = (rl) ((Object) new cl(param0, (vd) (this), 100));
                this.field_B = (rl) ((Object) new cl("", (vd) (this), 20));
                if (this.field_J) {
                  break L7;
                } else {
                  L8: {
                    this.field_N = new kf(be.field_i, (vd) null);
                    stackIn_17_0 = this;

                    stackIn_17_1 = null;

                    stackIn_17_2 = null;

                    if (this.field_D) {
                      stackIn_18_0 = this;
                      stackIn_18_1 = null;
                      stackIn_18_2 = null;
                      stackIn_18_3 = a.field_f;
                      break L8;
                    } else {
                      stackIn_18_0 = this;
                      stackIn_18_1 = null;
                      stackIn_18_2 = null;
                      stackIn_18_3 = a.field_e;
                      break L8;
                    }
                  }
                  ((ti) (this)).field_E = new kf(stackIn_18_3, (vd) null);
                  if (!this.field_K) {
                    break L6;
                  } else {
                    this.field_H = new kf(ri.field_d, (vd) (this));
                    if (var11 == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
              }
              this.field_N = new kf(og.field_j, (vd) null);
              this.field_E = new kf(jd.field_d, (vd) null);
              this.field_G.field_D = false;
              break L6;
            }
            L9: {
              this.field_G.field_i = (rd) ((Object) new id(10000536));
              this.field_B.field_i = (rd) ((Object) new di(10000536));
              var6 = new v();
              this.field_N.field_i = (rd) ((Object) var6);
              if (this.field_E == null) {
                break L9;
              } else {
                this.field_E.field_i = (rd) ((Object) var6);
                break L9;
              }
            }
            L10: {
              this.field_G.field_q = ib.field_i;
              if (this.field_H == null) {
                break L10;
              } else {
                this.field_H.field_i = (rd) ((Object) var6);
                break L10;
              }
            }
            L11: {
              if (null == this.field_H) {
                break L11;
              } else {
                this.field_H.field_q = hi.field_a;
                break L11;
              }
            }
            L12: {
              L13: {
                if (!this.field_J) {
                  break L13;
                } else {
                  this.field_E.field_q = ig.field_d;
                  if (var11 == 0) {
                    break L12;
                  } else {
                    break L13;
                  }
                }
              }
              L14: {
                if (!this.field_D) {
                  break L14;
                } else {
                  this.field_E.field_q = il.field_a;
                  this.field_E.field_i = (rd) ((Object) new uj());
                  if (var11 == 0) {
                    break L12;
                  } else {
                    break L14;
                  }
                }
              }
              this.field_E.field_i = (rd) ((Object) new uj());
              break L12;
            }
            L15: {
              this.field_o = 15;
              var7 = ql.field_Q;
              if (null == this.field_F) {
                break L15;
              } else {
                this.field_o = this.field_o + (5 + var7.a(this.field_F, this.field_j + -40, var7.field_E));
                break L15;
              }
            }
            L16: {
              L17: {
                var8 = nb.field_y;
                var9 = kb.a((byte) -31, kk.c(-14047));
                if (var9 == bb.field_J) {
                  break L17;
                } else {
                  if (var9 != mh.field_B) {
                    break L16;
                  } else {
                    var8 = ah.field_a;
                    if (var11 == 0) {
                      break L16;
                    } else {
                      break L17;
                    }
                  }
                }
              }
              var8 = fg.field_d;
              break L16;
            }
            L18: {
              dupTemp$0 = new jf(10, this.field_o, this.field_j - 20, 25, this.field_G, false, 80, 3, var7, 16777215, var8);
              var12 = dupTemp$0;
              this.b((byte) 125, dupTemp$0);
              this.field_o = this.field_o + (5 + ((w) ((Object) var12)).field_v);
              dupTemp$1 = new jf(10, this.field_o, -20 + this.field_j, 25, this.field_B, false, 80, 3, var7, 16777215, p.field_b);
              var13 = dupTemp$1;
              this.b((byte) -100, dupTemp$1);
              this.field_N.field_r = (vd) (this);
              this.field_o = this.field_o + (((w) ((Object) var13)).field_v + 5);
              if (null == this.field_H) {
                break L18;
              } else {
                this.field_H.field_r = (vd) (this);
                break L18;
              }
            }
            L19: {
              if (null == this.field_E) {
                break L19;
              } else {
                this.field_E.field_r = (vd) (this);
                break L19;
              }
            }
            L20: {
              L21: {
                if (this.field_H == null) {
                  break L21;
                } else {
                  this.field_N.a(30, -95 + this.field_j, true, this.field_o, 85);
                  this.field_o = this.field_o + 60;
                  if (var11 == 0) {
                    break L20;
                  } else {
                    break L21;
                  }
                }
              }
              this.field_N.a(30, -6 + this.field_j + -10, true, this.field_o, 8);
              this.field_o = this.field_o + 35;
              break L20;
            }
            L22: {
              if (null == this.field_H) {
                break L22;
              } else {
                this.field_H.a(30, -10 + (-6 + this.field_j), true, this.field_o, 8);
                this.field_o = this.field_o + 35;
                break L22;
              }
            }
            L23: {
              if (this.field_E == null) {
                break L23;
              } else {
                L24: {
                  L25: {
                    if (this.field_J) {
                      break L25;
                    } else {
                      if (!this.field_D) {
                        break L24;
                      } else {
                        break L25;
                      }
                    }
                  }
                  this.field_E.a(30, -16 + this.field_j, true, this.field_o, 8);
                  this.field_o = this.field_o + 35;
                  if (var11 == 0) {
                    break L23;
                  } else {
                    break L24;
                  }
                }
                this.field_E.a(20, 40, true, this.field_o, 8);
                this.field_o = this.field_o + 25;
                break L23;
              }
            }
            L26: {
              this.a(3 + this.field_o, this.field_j, true, 0, 0);
              this.b((byte) 67, this.field_N);
              if (this.field_H == null) {
                break L26;
              } else {
                this.b((byte) -77, this.field_H);
                break L26;
              }
            }
            L27: {
              if (this.field_E == null) {
                break L27;
              } else {
                this.b((byte) -112, this.field_E);
                break L27;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L28: {
            var6_ref = decompiledCaughtException;
            stackIn_59_0 = (RuntimeException) (var6_ref);

            stackIn_59_1 = new StringBuilder().append("ti.<init>(");

            if (param0 == null) {
              stackIn_60_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackIn_60_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackIn_60_2 = "null";
              break L28;
            } else {
              stackIn_60_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackIn_60_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackIn_60_2 = "{...}";
              break L28;
            }
          }
          L29: {


            stackIn_62_1 = ((StringBuilder) (Object) stackIn_60_1).append(stackIn_60_2).append(',');

            if (param1 == null) {
              stackIn_60_0 = (RuntimeException) ((Object) stackIn_60_0);
              stackIn_63_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackIn_63_2 = "null";
              break L29;
            } else {
              stackIn_60_0 = (RuntimeException) ((Object) stackIn_60_0);
              stackIn_63_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackIn_63_2 = "{...}";
              break L29;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_60_0), stackIn_63_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void d(byte param0) {
        this.field_G.j(0);
        this.field_B.j(0);
        if (param0 > -59) {
            CharSequence var3 = (CharSequence) null;
            ti.a(-96, (CharSequence) null, 81, true);
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        if (null != this.field_F) {
            ql.field_Q.a(this.field_F, 20 + (this.field_t + param2), 15 + (param1 + this.field_o), this.field_j - 40, this.field_v, 16777215, -1, 1, 0, ql.field_Q.field_E);
        }
        if (this.field_H != null) {
            lf.a(param2 + 10, param1 + 134, this.field_j - 20, 4210752);
        }
        super.a(param0, param1, param2, param3);
    }

    public static void e(boolean param0) {
        field_I = null;
        field_C = null;
        field_L = null;
        if (param0) {
            field_L = (eg) null;
        }
    }

    static {
        field_C = "Confirm Email:";
    }
}
