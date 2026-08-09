/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cm extends ua implements ql {
    private String[] field_C;
    static String[] field_E;
    static le[] field_F;
    private t[] field_A;
    static te field_D;
    static String[] field_z;
    private sh field_H;
    static String field_B;
    static String field_G;

    final static void k(int param0) {
        if (!ad.a(false)) {
            return;
        }
        jk.a(-95, false, param0);
    }

    final static void a(int param0, byte param1) {
        int var2;
        L0: {
          hi.field_c = param0 >> 560186724 & 3;
          var2 = 51 / ((param1 - -78) / 35);
          if ((hi.field_c ^ -1) < -3) {
            hi.field_c = 2;
            break L0;
          } else {
            break L0;
          }
        }
        o.field_a = (14 & param0) >> 1729984962;
        if (2 < o.field_a) {
          L1: {
            o.field_a = 2;
            ak.field_v = param0 & 3;
            if ((ak.field_v ^ -1) < -3) {
              ak.field_v = 2;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        } else {
          L2: {
            ak.field_v = param0 & 3;
            if ((ak.field_v ^ -1) < -3) {
              ak.field_v = 2;
              break L2;
            } else {
              break L2;
            }
          }
          return;
        }
    }

    final void a(String[] param0, int param1) {
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
        lc var4 = null;
        int var5 = 0;
        int var6 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_u.b((byte) 121);
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
                        if (0 != param0.length) {
                            statePc = 6;
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
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        this.field_C = null;
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
                        this.field_C = new String[var3_int];
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
                        this.field_C[var4_int] = pj.a((byte) 83, (CharSequence) ((Object) param0[var4_int])).replace(' ', ' ');
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
                        var4 = new lc(t.field_z, 0, 1);
                        this.field_A = new t[var3_int + 1];
                        if (param1 == 560186724) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 10: {
                    return;
                }
                case 11: {
                    try {
                        var5 = 0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var5 >= var3_int) {
                            statePc = 16;
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
                        this.field_A[var5] = new t(this.field_C[var5], (of) (this));
                        this.field_A[var5].field_h = (ml) ((Object) var4);
                        this.field_A[var5].field_m = ad.field_j;
                        this.field_A[var5].a(15, 13361, 0, 80, 20 + var5 * 16);
                        this.b((byte) -104, this.field_A[var5]);
                        var5++;
                        if (var6 != 0) {
                            statePc = 22;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var6 == 0) {
                            statePc = 12;
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
                        this.field_A[var3_int] = new t(lf.field_b, (of) (this));
                        this.field_A[var3_int].field_h = (ml) ((Object) var4);
                        this.field_A[var3_int].a(15, 13361, 0, 100, var3_int * 16 + 36);
                        this.b((byte) -89, this.field_A[var3_int]);
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
                    stackIn_20_1 = new StringBuilder().append("cm.J(");
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
                    throw la.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
                }
                case 22: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    cm(sh param0) {
        super(0, 0, 0, 0, (ml) null);
        try {
            this.field_H = param0;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "cm.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d(byte param0) {
        field_F = null;
        field_E = null;
        field_G = null;
        if (param0 < 104) {
          field_G = (String) null;
          field_B = null;
          field_z = null;
          field_D = null;
          return;
        } else {
          field_B = null;
          field_z = null;
          field_D = null;
          return;
        }
    }

    final boolean a(we param0, char param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_8_0 = false;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, -20)) {
              if (98 != param2) {
                if (99 != param2) {
                  var5_int = -16 % ((param3 - 37) / 50);
                  stackIn_10_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_8_0 = this.b(param0, false);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_5_0 = this.a((byte) 88, param0);
                decompiledRegionSelector0 = 1;
                break L0;
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
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("cm.V(");

            if (param0 == null) {
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
          throw la.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0;
            } else {
              return stackIn_10_0 != 0;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        ta var5;
        super.a(param0, param1, param2, param3);
        if (param1 != 0) {
          return;
        } else {
          L0: {
            var5 = t.field_z;
            if (this.field_C != null) {
              var5.a(dh.field_a, this.field_r + param3, param2 + this.field_e, this.field_l, 20, 16777215, -1, 0, 0, var5.field_C - -var5.field_D);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        }
    }

    public final void a(int param0, int param1, int param2, int param3, t param4) {
        int var6_int = 0;
        int var7 = 0;
        t stackIn_8_0 = null;
        t stackIn_8_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 == 7) {
                break L1;
              } else {
                cm.d((byte) 77);
                break L1;
              }
            }
            var6_int = 0;
            L2: while (true) {
              L3: {
                L4: {
                  L5: {
                    if (this.field_C.length <= var6_int) {
                      break L5;
                    } else {
                      stackIn_8_0 = (t) (param4);

                      stackIn_8_1 = this.field_A[var6_int];

                      if (var7 != 0) {
                        if (stackIn_8_0 != stackIn_8_1) {
                          break L3;
                        } else {
                          break L4;
                        }
                      } else {
                        L6: {
                          if (stackIn_8_0 == stackIn_8_1) {
                            this.field_H.a(this.field_C[var6_int], -94);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        var6_int++;
                        if (var7 == 0) {
                          continue L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  if (param4 != this.field_A[this.field_C.length]) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
                this.field_H.a(param3 ^ 207);
                return;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var6);

            stackIn_17_1 = new StringBuilder().append("cm.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L7;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L7;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
    }

    final static void a(int param0) {
        le var1 = null;
        RuntimeException var1_ref = null;
        le var2 = null;
        int var3 = 0;
        int var4 = 0;
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
                        var1 = new le(540, 140);
                        mc.a(param0 + -8512, var1);
                        ig.b();
                        ge.d();
                        uj.field_i = 0;
                        ec.b(-128);
                        var2 = var1.d();
                        var3 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((var3 ^ -1) <= -16) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var2.e(-2, -2, 16777215);
                        ge.b(4, 4, 0, 0, 540, 140);
                        var3++;
                        if (var4 != 0) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 10;
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
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        ca.field_f.e();
                        var1.e(0, 0);
                        tj.b(653);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (param0 == 15) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        field_E = (String[]) null;
                        return;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    var1_ref = (RuntimeException) ((Object) caughtException);
                    throw la.a((Throwable) ((Object) var1_ref), "cm.B(" + param0 + ')');
                }
                case 11: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_z = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
        field_D = new te(4, 1, 1, 1);
        field_B = "Names should contain a maximum of 12 characters";
    }
}
