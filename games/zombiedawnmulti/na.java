/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class na extends rg {
    static ri field_I;
    static String field_F;
    int field_E;
    static ja[] field_G;
    static int[][] field_J;
    static int[] field_K;
    static ri[][] field_H;

    na(cf param0) {
        super(param0.field_y, param0.field_i, param0.field_n, param0.field_w, (nl) null, (bj) null);
        try {
            param0.b(0, 0, 28972, this.field_n, this.field_w);
            this.field_E = 256;
            this.field_B = param0;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "na.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void g(byte param0) {
        field_K = null;
        field_H = (ri[][]) null;
        field_F = null;
        field_G = null;
        field_I = null;
        if (param0 >= -59) {
          return;
        } else {
          field_J = (int[][]) null;
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        ja var6;
        if (-1 == (param2 ^ -1)) {
          if (this.field_B == null) {
            return;
          } else {
            if (this.field_E != 0) {
              if ((this.field_E ^ -1) != -257) {
                var6 = new ja(this.field_B.field_n, this.field_B.field_w);
                r.a(0, var6);
                if (param0 != -2) {
                  field_G = (ja[]) null;
                  this.field_B.a(param0 + 0, 0, param2, 0);
                  ql.a(true);
                  var6.c(param3 - -this.field_y, param1 + this.field_i, this.field_E);
                  return;
                } else {
                  this.field_B.a(param0 + 0, 0, param2, 0);
                  ql.a(true);
                  var6.c(param3 - -this.field_y, param1 + this.field_i, this.field_E);
                  return;
                }
              } else {
                this.field_B.a(-2, param1 + this.field_i, param2, param3 - -this.field_y);
                return;
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    public na() {
        super(0, 0, 0, 0, (nl) null, (bj) null);
        this.field_E = 256;
    }

    final static boolean b(int param0, int param1, int param2) {
        int var3;
        int var4;
        int var5;
        if (qj.field_p) {
          if (io.field_g) {
            if ((se.field_E ^ -1) >= -1) {
              return false;
            } else {
              var3 = (400 - se.field_E >> -1753618463) + 10;
              var4 = 20 + se.field_E + param1;
              var5 = 40;
              if (param0 > var3) {
                if (var5 < param2) {
                  if (param0 < var3 + var4) {
                    if (var5 + hj.field_g <= param2) {
                      return false;
                    } else {
                      iq.a(-14, (byte) 99);
                      return true;
                    }
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final static void a(byte param0, fh param1) {
        RuntimeException runtimeException = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[][] var6 = null;
        int[][] var7 = null;
        int[][] var9 = null;
        int[][] var12 = null;
        int[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var9 = param1.field_i.field_k;
                        var7 = var9;
                        var6 = var7;
                        var12 = var6;
                        dq.field_j = new int[var9.length][var9[0].length];
                        var3 = 0;
                        if (param0 > 124) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_J = (int[][]) null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (var3 >= var12.length) {
                            statePc = 20;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var5 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        return;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var4 = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var4 >= var12[0].length) {
                            statePc = 13;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var5 != 0) {
                            statePc = 14;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackIn_11_0 = dq.field_j[var3];
                        stackIn_10_0 = stackIn_11_0;
                        stackIn_11_1 = var4;
                        stackIn_10_1 = stackIn_11_1;
                        if (0 != tq.b(1, var12[var3][var4])) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackIn_12_0 = (int[]) ((Object) stackIn_10_0);
                        stackIn_12_1 = stackIn_10_1;
                        stackIn_12_2 = -1;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackIn_12_0 = (int[]) ((Object) stackIn_11_0);
                        stackIn_12_1 = stackIn_11_1;
                        stackIn_12_2 = 0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackIn_12_0[stackIn_12_1] = stackIn_12_2;
                        var4++;
                        if (var5 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var3++;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var5 == 0) {
                            statePc = 3;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_18_0 = (RuntimeException) (runtimeException);
                    stackIn_17_0 = stackIn_18_0;
                    stackIn_18_1 = new StringBuilder().append("na.A(").append(param0).append(',');
                    stackIn_17_1 = stackIn_18_1;
                    if (param1 == null) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    stackIn_19_0 = (RuntimeException) ((Object) stackIn_17_0);
                    stackIn_19_1 = (StringBuilder) ((Object) stackIn_17_1);
                    stackIn_19_2 = "{...}";
                    statePc = 19;
                    continue stateLoop;
                }
                case 18: {
                    stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
                    stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                    stackIn_19_2 = "null";
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    throw fa.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
                }
                case 20: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static boolean a(int[] param0, byte param1, String param2, long param3, int param4) {
        ld var6 = null;
        RuntimeException var6_ref = null;
        CharSequence var7 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 <= -35) {
                break L1;
              } else {
                na.b(-55, -5, 10);
                break L1;
              }
            }
            if (tn.a(param2, param3, (byte) -91, param4, param0)) {
              L2: {
                if (1 != param4) {
                  break L2;
                } else {
                  param4 = 0;
                  break L2;
                }
              }
              qf.field_g = param2;
              va.field_a = param4;
              var7 = (CharSequence) ((Object) param2);
              ql.field_a = tg.a(var7, false);
              jj.field_M = param3;
              var6 = id.a(kb.field_x, bb.field_k, (byte) -65, param0, tg.field_d);
              wi.a((byte) 4, var6);
              stackIn_8_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var6_ref);

            stackIn_11_1 = new StringBuilder().append("na.B(");

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
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_8_0 != 0;
        }
    }

    static {
        field_F = "Confuse clueless humans with smoke and mirrors...";
        field_H = new ri[1][];
    }
}
