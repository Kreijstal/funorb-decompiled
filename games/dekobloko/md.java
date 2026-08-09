/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class md extends kf implements rl, vn {
    static String field_S;
    static String[] field_U;
    static int field_Z;
    private qi field_T;
    private ek field_V;
    private wj field_W;
    static String field_Y;
    static w field_X;

    public final void a(qi param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (param2 < -87) {
              L1: {
                L2: {
                  if (0 != param3) {
                    break L2;
                  } else {
                    jg.a(true, "terms.ws");
                    if (var6 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if ((param3 ^ -1) == -2) {
                    break L3;
                  } else {
                    if (param3 == 2) {
                      jg.a(true, "conduct.ws");
                      if (var6 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    } else {
                      return;
                    }
                  }
                }
                jg.a(true, "privacy.ws");
                return;
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
          L4: {
            var5 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var5);

            stackIn_14_1 = new StringBuilder().append("md.PA(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    md(wj param0) {
        super(0, 0, 288, 0, (gl) null);
        String var7 = null;
        int var3 = 0;
        a var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
            this.field_W = param0;
            this.field_V = new ek(fa.field_o, (kg) null);
            this.field_V.field_p = (gl) ((Object) new fk());
            var7 = cm.a((byte) 118, i.field_a, new String[]{this.h((byte) 60), this.g((byte) 57)});
            var3 = 20;
            var4 = new a(hh.field_e, 0, 0, 0, 0, 16777215, -1, 3, 0, hh.field_e.field_R, -1, 2147483647, true);
            this.field_T = new qi(var7, var4);
            this.field_T.field_B = "";
            this.field_T.a(rb.field_i, 0, 1);
            this.field_T.a(rb.field_i, 1, 1);
            this.field_T.field_t = -40 + this.field_t;
            this.field_T.field_v = (kg) (this);
            this.field_T.c(15, 26, var3, this.field_t + -40);
            var3 = var3 + (this.field_T.field_y + 15);
            this.b(this.field_T, (byte) -55);
            var5 = 4;
            var6 = 200;
            this.field_V.b(40, var6, 300 - var6 >> -1381308543, var3, -16555);
            this.field_V.field_v = (kg) (this);
            this.b(this.field_V, (byte) -55);
            this.b(var5 + 55 + var3, 300, 0, 0, -16555);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "md.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static String a(int param0, String param1, boolean param2) {
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        String stackIn_11_0 = null;
        uf stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        uf stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        uf stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int stackIn_23_2 = 0;
        Object stackIn_24_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var3 = null;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        wb var8 = null;
        wb var9 = null;
        uf var10 = null;
        CharSequence var11 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var11 = (CharSequence) ((Object) param1);
                        if (dc.a(var11, (byte) -70)) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = ge.field_d;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    try {
                        if (2 != jj.field_b) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackIn_7_0 = kl.field_x;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return stackIn_7_0;
                }
                case 8: {
                    try {
                        var9 = ed.a(param1, (byte) -94);
                        if (var9 == null) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackIn_11_0 = cm.a((byte) 94, wc.field_q, new String[]{param1});
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 11: {
                    return stackIn_11_0;
                }
                case 12: {
                    try {
                        qi.field_S.a(64, var9);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var8 = (wb) ((Object) qi.field_S.d(true));
                        if (var8 == null) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var8.field_Xb = var8.field_Xb - 1;
                        if (var6 != 0) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var6 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var9.b((byte) 119);
                        var9.e((byte) 121);
                        field_Z = field_Z - 1;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var10 = we.field_b;
                        var10.f(param0, -4);
                        var10.field_n = var10.field_n + 1;
                        var5 = var10.field_n;
                        var10.a(true, 1);
                        var10.a(0, param1);
                        if (!param2) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var7 = (String) null;
                        md.a(-20, (String) null, false);
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackIn_22_0 = (uf) (var10);
                        stackIn_21_0 = stackIn_22_0;
                        stackIn_22_1 = var10.field_n + -var5;
                        stackIn_21_1 = stackIn_22_1;
                        if (param2) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackIn_23_0 = (uf) ((Object) stackIn_21_0);
                        stackIn_23_1 = stackIn_21_1;
                        stackIn_23_2 = 1;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackIn_23_0 = (uf) ((Object) stackIn_22_0);
                        stackIn_23_1 = stackIn_22_1;
                        stackIn_23_2 = 0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        ((uf) (Object) stackIn_23_0).b(stackIn_23_1, stackIn_23_2 != 0);
                        stackIn_24_0 = null;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 24: {
                    return (String) ((Object) stackIn_24_0);
                }
                case 25: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_27_0 = (RuntimeException) (var3);
                    stackIn_26_0 = stackIn_27_0;
                    stackIn_27_1 = new StringBuilder().append("md.E(").append(param0).append(',');
                    stackIn_26_1 = stackIn_27_1;
                    if (param1 == null) {
                        statePc = 27;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    stackIn_28_0 = (RuntimeException) ((Object) stackIn_26_0);
                    stackIn_28_1 = (StringBuilder) ((Object) stackIn_26_1);
                    stackIn_28_2 = "{...}";
                    statePc = 28;
                    continue stateLoop;
                }
                case 27: {
                    stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
                    stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
                    stackIn_28_2 = "null";
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    throw dh.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final String g(byte param0) {
        if (param0 != 57) {
            qi var3 = (qi) null;
            this.a((qi) null, -92, 49, 97);
            return "</col></u>";
        }
        return "</col></u>";
    }

    final boolean a(int param0, int param1, ce param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_11_0 = false;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(-119, param1, param2, param3)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((param1 ^ -1) == -99) {
                stackIn_7_0 = this.a(param2, (byte) -57);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (-100 == (param1 ^ -1)) {
                  stackIn_11_0 = this.a(32, param2);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var5_int = -29 / ((-22 - param0) / 49);
                  stackIn_13_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var5);

            stackIn_16_1 = new StringBuilder().append("md.QA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L1;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L1;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              return stackIn_13_0 != 0;
            }
          }
        }
    }

    public final void a(byte param0, int param1, ek param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 67) {
                break L1;
              } else {
                field_S = (String) null;
                break L1;
              }
            }
            if (param2 == this.field_V) {
              in.c((byte) -51);
              this.field_W.n(69);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var6);

            stackIn_8_1 = new StringBuilder().append("md.H(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(int param0, int param1, int param2) {
        uf var3 = we.field_b;
        var3.f(param1, -4);
        var3.a(true, 3);
        var3.a(true, param0);
        var3.d(param0 ^ -10, param2);
    }

    private final String h(byte param0) {
        if (param0 != 60) {
            this.field_W = (wj) null;
            return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    public static void f(byte param0) {
        if (param0 <= 62) {
          field_S = (String) null;
          field_S = null;
          field_U = null;
          field_X = null;
          field_Y = null;
          return;
        } else {
          field_S = null;
          field_U = null;
          field_X = null;
          field_Y = null;
          return;
        }
    }

    static {
        field_U = new String[8];
        field_S = "<%0> has been removed.";
        field_Y = "Specials enabled:";
    }
}
