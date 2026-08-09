/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class op extends ae {
    static String field_l;
    static String field_o;
    private int field_p;
    static String field_n;
    private int field_q;
    static String field_k;
    static String field_j;
    static int field_i;
    static kb field_m;

    final void a(byte param0) {
        super.a((byte) -54);
        mi.field_Kb.a((br) (this), false);
        if (param0 > -47) {
            field_l = (String) null;
        }
    }

    final static void c(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var2 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 == 2) {
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
                        field_l = (String) null;
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
                        if (!op.a(120)) {
                            statePc = 5;
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
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (rn.field_f == null) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (!rn.field_f.field_e) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        rn.a(param0 ^ -79);
                        me.field_k.b(3016, new vm(me.field_k, hl.field_b));
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return;
                }
                case 9: {
                    try {
                        me.field_k.a(jk.field_g, (byte) -27, fg.field_j, true);
                        me.field_k.h((byte) -109);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (!ba.c(-1)) {
                            statePc = 17;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        me.field_k.a(param0 + -2, pn.field_d, sj.field_p);
                        if (var2 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        return;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var2 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        return;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    var1 = (RuntimeException) ((Object) caughtException);
                    throw fa.a((Throwable) ((Object) var1), "op.G(" + param0 + ')');
                }
                case 17: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static String a(boolean param0, boolean param1, int param2, boolean param3) {
        int var4;
        var4 = 0;
        if (param2 != 4) {
          return (String) null;
        } else {
          L0: {
            if (param1) {
              var4 += 4;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (param0) {
              var4 += 2;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (param3) {
              var4++;
              break L2;
            } else {
              break L2;
            }
          }
          return t.field_f[var4];
        }
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        if (!param1) {
            qd var6 = (qd) null;
            this.a(-70, (qd) null);
        }
    }

    final void b(boolean param0, int param1, int param2, int param3) {
        if (param0) {
          field_n = (String) null;
          super.a(0, param1);
          this.field_p = param2;
          this.field_q = param3;
          return;
        } else {
          super.a(0, param1);
          this.field_p = param2;
          this.field_q = param3;
          return;
        }
    }

    private final static boolean a(int param0) {
        int var1;
        var1 = -19 / ((70 - param0) / 45);
        if (me.field_k != null) {
          if (me.field_k.j((byte) -122) == null) {
            return false;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final void a(int param0, qd param1) {
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
              param1.b(this.field_p, (byte) 127, this.field_q);
              if (param0 == 0) {
                break L1;
              } else {
                this.field_p = -21;
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

            stackIn_5_1 = new StringBuilder().append("op.D(").append(param0).append(',');

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
          throw fa.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public static void c(byte param0) {
        field_o = null;
        field_l = null;
        field_m = null;
        field_j = null;
        field_n = null;
        if (param0 != -9) {
          op.a(-97);
          field_k = null;
          return;
        } else {
          field_k = null;
          return;
        }
    }

    op() {
    }

    static {
        field_o = "Disruptive behaviour";
        field_k = "Options";
        field_j = "Melt a zombie into a puddle of goo that will slow down humans. Makes humans a lot easier to catch.";
        field_l = "Please wait...";
        field_n = "<%0> is not a member, and cannot play with the current options.";
        field_i = -1;
    }
}
