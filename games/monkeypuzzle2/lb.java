/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lb extends ua implements ql {
    private t field_B;
    static le[] field_E;
    private t field_F;
    static int field_z;
    private t field_G;
    static le field_H;
    static te field_I;
    static String field_A;
    static pd field_C;
    static int[] field_D;

    final boolean a(we param0, char param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
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
            if (super.a(param0, param1, param2, 103)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((param2 ^ -1) != -99) {
                var5_int = -36 / ((37 - param3) / 50);
                if (99 != param2) {
                  stackIn_11_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_9_0 = this.b(param0, false);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_6_0 = this.a((byte) 114, param0);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var5);

            stackIn_14_1 = new StringBuilder().append("lb.V(");

            if (param0 == null) {
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
          throw la.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
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

    final static String d(byte param0) {
        if (ch.field_d == cf.field_b) {
          return mh.field_F;
        } else {
          if (param0 == -56) {
            if (ed.field_c == cf.field_b) {
              return pi.field_p;
            } else {
              if (!bb.field_a.a(param0 + 56)) {
                return pi.field_p;
              } else {
                return bh.field_b;
              }
            }
          } else {
            return (String) null;
          }
        }
    }

    public final void a(int param0, int param1, int param2, int param3, t param4) {
        int var7 = 0;
        we var8 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (this.field_F == param4) {
                  break L2;
                } else {
                  L3: {
                    if (this.field_G != param4) {
                      break L3;
                    } else {
                      dc.a(0);
                      if (var7 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (param4 == this.field_B) {
                    il.a(true);
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
              je.a(-117);
              break L1;
            }
            L4: {
              if (param3 == 7) {
                break L4;
              } else {
                var8 = (we) null;
                this.a((we) null, '￙', -4, -125);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var6);

            stackIn_14_1 = new StringBuilder().append("lb.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        var5 = param3 + this.field_r;
        if (param0 != 30) {
          return;
        } else {
          var6 = this.field_e - -param2;
          t.field_z.a(p.field_b, var5 - -20, 20 + var6, -40 + this.field_l, this.field_p - 50, 16777215, -1, 1, 0, t.field_z.field_C);
          super.a(param0 + 0, param1, param2, param3);
          return;
        }
    }

    public lb() {
        super(0, 0, 476, 225, (ml) null);
        this.field_G = new t(oi.field_g, (of) null);
        this.field_F = new t(aj.field_d, (of) null);
        this.field_B = new t(oi.field_d, (of) null);
        hd var1 = new hd();
        this.field_G.field_h = (ml) ((Object) var1);
        this.field_F.field_h = (ml) ((Object) var1);
        this.field_B.field_h = (ml) ((Object) var1);
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 - var2 >> 912876193;
        this.field_F.a(30, 13361, -var3 + this.field_l >> -1607869439, var4, -var2 + (this.field_p - 48));
        this.field_B.a(30, 13361, (-var3 + this.field_l >> 1318501857) + var4 - -var2, var4, -var2 + this.field_p + -48);
        this.field_G.a(30, 13361, this.field_l - var3 >> -920203807, var3, this.field_p - (78 - -(2 * var2)));
        this.field_F.field_o = (of) (this);
        this.field_G.field_o = (of) (this);
        this.field_G.field_m = wd.field_s;
        this.field_B.field_o = (of) (this);
        this.field_B.field_m = ca.field_n;
        this.b((byte) -20, this.field_F);
        this.b((byte) -119, this.field_G);
        this.b((byte) -42, this.field_B);
    }

    public static void e(byte param0) {
        field_H = null;
        field_A = null;
        field_C = null;
        field_E = null;
        int var1 = 1 % ((param0 - -47) / 59);
        field_D = null;
        field_I = null;
    }

    final static void b(boolean param0) {
        RuntimeException runtimeException = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var1_int = param0 ? 1 : 0;
                        var2 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (n.field_a <= var2) {
                            statePc = 10;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (var4 != 0) {
                            statePc = 12;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (n.field_b[var2] == null) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (n.field_b[var2].h()) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var1_int = 1;
                        if (var4 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var2++;
                        if (var4 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var1_int == 0) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    return;
                }
                case 13: {
                    try {
                        var3 = pf.a((byte) -103, 4);
                        n.field_b[var2] = li.a(ke.field_h[var3 + 8], 100, 96);
                        na.a((byte) 42, n.field_b[var2]);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw la.a((Throwable) ((Object) runtimeException), "lb.G(" + param0 + ')');
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static le[] a(boolean param0, String param1, ad param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        le[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4_int = param2.c(param1, (byte) -105);
              var5 = param2.a(param3, var4_int, -28459);
              if (!param0) {
                break L1;
              } else {
                lb.e((byte) -92);
                break L1;
              }
            }
            stackIn_3_0 = wj.a((byte) 83, var5, param2, var4_int);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("lb.C(").append(param0).append(',');

            if (param1 == null) {
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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(int param0, int param1, byte param2, le[] param3, int param4, int param5) {
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        String stackIn_89_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
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
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var23 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param3 == null) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return;
                }
                case 4: {
                    try {
                        if (-1 <= (param1 ^ -1)) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (param5 <= 0) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return;
                }
                case 8: {
                    try {
                        if (null == param3[3]) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackIn_11_0 = param3[3].field_m;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackIn_11_0 = 0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var6_int = stackIn_11_0;
                        if (param3[5] == null) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackIn_14_0 = param3[5].field_m;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackIn_14_0 = 0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var7 = stackIn_14_0;
                        if (null == param3[1]) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackIn_17_0 = param3[1].field_n;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackIn_17_0 = 0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var8 = stackIn_17_0;
                        if (null != param3[7]) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackIn_20_0 = 0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackIn_20_0 = param3[7].field_n;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var9 = stackIn_20_0;
                        var10 = param1 + param0;
                        var11 = param5 + param4;
                        var12 = param0 + var6_int;
                        var13 = -var7 + var10;
                        var14 = var8 + param4;
                        var15 = var11 + -var9;
                        var16 = var12;
                        var17 = var13;
                        if (var17 < var16) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var17 = param0 + param1 * var6_int / (var6_int + var7);
                        var16 = param0 + param1 * var6_int / (var6_int + var7);
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var18 = var14;
                        var19 = 76 % ((param2 - -86) / 33);
                        var20 = var15;
                        if (var20 < var18) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var20 = var8 * param5 / (var8 + var9) + param4;
                        var18 = var8 * param5 / (var8 + var9) + param4;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        ge.b(cg.field_d);
                        if (null == param3[0]) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        ge.c(param0, param4, var16, var18);
                        param3[0].c(param0, param4);
                        ge.a(cg.field_d);
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (null == param3[2]) {
                            statePc = 30;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        ge.c(var17, param4, var10, var18);
                        param3[2].c(var13, param4);
                        ge.a(cg.field_d);
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (param3[6] != null) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        ge.c(param0, var20, var16, var11);
                        param3[6].c(param0, var15);
                        ge.a(cg.field_d);
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (param3[8] == null) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        ge.c(var17, var20, var10, var11);
                        param3[8].c(var13, var15);
                        ge.a(cg.field_d);
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (null == param3[1]) {
                            statePc = 44;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (-1 != (param3[1].field_m ^ -1)) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        ge.c(var16, param4, var17, var18);
                        var21 = var12;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (var21 >= var13) {
                            statePc = 43;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        param3[1].c(var21, param4);
                        var21 = var21 + param3[1].field_m;
                        if (var23 != 0) {
                            statePc = 44;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (var23 == 0) {
                            statePc = 39;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        ge.a(cg.field_d);
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (param3[7] == null) {
                            statePc = 52;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (0 == param3[7].field_m) {
                            statePc = 52;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        ge.c(var16, var20, var17, var11);
                        var21 = var12;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (var13 <= var21) {
                            statePc = 51;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        param3[7].c(var21, var15);
                        var21 = var21 + param3[7].field_m;
                        if (var23 != 0) {
                            statePc = 52;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (var23 == 0) {
                            statePc = 47;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        ge.a(cg.field_d);
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (null == param3[3]) {
                            statePc = 61;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (-1 != (param3[3].field_n ^ -1)) {
                            statePc = 55;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        ge.c(param0, var18, var16, var20);
                        var21 = var14;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (var15 <= var21) {
                            statePc = 60;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        param3[3].c(param0, var21);
                        var21 = var21 + param3[3].field_n;
                        if (var23 != 0) {
                            statePc = 61;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (var23 == 0) {
                            statePc = 56;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        ge.a(cg.field_d);
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (null == param3[5]) {
                            statePc = 70;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (-1 != (param3[5].field_n ^ -1)) {
                            statePc = 64;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        ge.c(var17, var18, var10, var20);
                        var21 = var14;
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        if (var15 <= var21) {
                            statePc = 69;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        param3[5].c(var13, var21);
                        var21 = var21 + param3[5].field_n;
                        if (var23 != 0) {
                            statePc = 70;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (var23 == 0) {
                            statePc = 65;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        ge.a(cg.field_d);
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        if (null == param3[4]) {
                            statePc = 90;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (param3[4].field_m == 0) {
                            statePc = 90;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if (-1 != (param3[4].field_n ^ -1)) {
                            statePc = 74;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        ge.c(var16, var18, var17, var20);
                        var21 = var14;
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if (var21 >= var15) {
                            statePc = 84;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        if (var23 != 0) {
                            statePc = 90;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        var22 = var12;
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if (var13 <= var22) {
                            statePc = 82;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        param3[4].c(var22, var21);
                        var22 = var22 + param3[4].field_m;
                        if (var23 != 0) {
                            statePc = 83;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if (var23 == 0) {
                            statePc = 78;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        var21 = var21 + param3[4].field_n;
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        if (var23 == 0) {
                            statePc = 75;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        ge.a(cg.field_d);
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 86: {
                    var6 = (RuntimeException) ((Object) caughtException);
                    stackIn_88_0 = (RuntimeException) (var6);
                    stackIn_87_0 = stackIn_88_0;
                    stackIn_88_1 = new StringBuilder().append("lb.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
                    stackIn_87_1 = stackIn_88_1;
                    if (param3 == null) {
                        statePc = 88;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    stackIn_89_0 = (RuntimeException) ((Object) stackIn_87_0);
                    stackIn_89_1 = (StringBuilder) ((Object) stackIn_87_1);
                    stackIn_89_2 = "{...}";
                    statePc = 89;
                    continue stateLoop;
                }
                case 88: {
                    stackIn_89_0 = (RuntimeException) ((Object) stackIn_88_0);
                    stackIn_89_1 = (StringBuilder) ((Object) stackIn_88_1);
                    stackIn_89_2 = "null";
                    statePc = 89;
                    continue stateLoop;
                }
                case 89: {
                    throw la.a((Throwable) ((Object) stackIn_89_0), stackIn_89_2 + ',' + param4 + ',' + param5 + ')');
                }
                case 90: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_H = new le(640, 480);
        field_A = "Press 'ENTER'";
        field_I = new te(6, 0, 4, 2);
        field_D = new int[10];
    }
}
