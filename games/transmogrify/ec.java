/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class ec {
    static rc field_d;
    int field_e;
    static qj field_b;
    static int[] field_c;
    String field_a;

    final static void a(int param0, int param1) {
        RuntimeException runtimeException = null;
        od var2 = null;
        int var3 = 0;
        boolean stackIn_4_0 = false;
        int stackIn_10_0 = 0;
        boolean stackOut_3_0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        kc.field_g = param0;
                        var2 = (od) ((Object) lb.field_f.a((byte) -95));
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var2 == null) {
                            statePc = 9;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = var2.field_i.b(param1 + -9948);
                        stackIn_10_0 = stackOut_3_0 ? 1 : 0;
                        stackIn_4_0 = stackOut_3_0;
                        if (var3 != 0) {
                            statePc = 10;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (!stackIn_4_0) {
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
                        var2.field_j.i(128 + var2.field_k * kc.field_g >> 595263304);
                        if (var3 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var2.c(param1 + -9951);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var2 = (od) ((Object) lb.field_f.a(true));
                        if (var3 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackIn_10_0 = param1;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (stackIn_10_0 == 9956) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        ec.a(true, true, 47);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (null == nc.field_q) {
                            statePc = 24;
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
                        var2 = (od) ((Object) nc.field_q.a((byte) -95));
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
                        if (var2 == null) {
                            statePc = 24;
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
                        if (var3 == 0) {
                            statePc = 17;
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
                        return;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var2.field_i.b(8)) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var2.c(5);
                        if (var3 == 0) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
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
                        var2.field_j.i(128 + var2.field_k * kc.field_g >> -690821016);
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var2 = (od) ((Object) nc.field_q.a(true));
                        if (var3 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 23: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw ch.a((Throwable) ((Object) runtimeException), "ec.M(" + param0 + ',' + param1 + ')');
                }
                case 24: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void c(int param0) {
        field_c = null;
        field_d = null;
        if (param0 != 0) {
            field_c = (int[]) null;
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static void a(boolean param0, boolean param1, int param2) {
        int var3;
        if (param0) {
          sb.c(0, 0, sb.field_c, sb.field_g, 0, 192);
          if (!Transmogrify.field_A) {
            kh.a(-75, param0);
            var3 = 119 % ((-73 - param2) / 42);
            return;
          } else {
            sb.c();
            kh.a(-75, param0);
            var3 = 119 % ((-73 - param2) / 42);
            return;
          }
        } else {
          sb.c();
          kh.a(-75, param0);
          var3 = 119 % ((-73 - param2) / 42);
          return;
        }
    }

    final static hb a(int param0, int param1, int param2, hb param3) {
        hb var4 = null;
        RuntimeException var4_ref = null;
        hb stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = new hb(param3.field_h, -param2 + param0);
            ji.a(param3.field_l, param2, var4.field_l, param1, var4.field_l.length);
            stackIn_1_0 = (hb) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var4_ref);

            stackIn_4_1 = new StringBuilder().append("ec.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    abstract java.net.Socket a(int param0) throws IOException;

    final static ci a(boolean param0, byte param1, int param2, int param3, boolean param4) {
        if (param1 != 77) {
          ec.a(true, (byte) 79, -120, 125, true);
          return mh.a(-26159, param4, param0, false, param2, param3);
        } else {
          return mh.a(-26159, param4, param0, false, param2, param3);
        }
    }

    final static void a(String param0, int param1, String param2) {
        try {
            if (!(null == wg.field_d)) {
                wg.field_d.r(77);
            }
            ok.field_a = new ff(param0, param2, false, true, true);
            int var3_int = -114 / ((57 - param1) / 56);
            l.field_d.b(-88, ok.field_a);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "ec.K(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final java.net.Socket b(int param0) throws IOException {
        if (param0 != -9008) {
          field_c = (int[]) null;
          return new java.net.Socket(this.field_a, this.field_e);
        } else {
          return new java.net.Socket(this.field_a, this.field_e);
        }
    }

    static {
        field_d = new rc();
        field_c = new int[8192];
        field_b = new qj();
    }
}
