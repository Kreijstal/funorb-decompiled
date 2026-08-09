/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class a extends kb {
    private String field_g;
    static String field_e;
    static String field_f;
    private String field_d;
    static int field_c;

    public static void b(boolean param0) {
        field_e = null;
        field_f = null;
        if (!param0) {
            ng var2 = (ng) null;
            a.a((byte) 42, (ng) null);
        }
    }

    final static boolean b(int param0, int param1) {
        try {
            if (!(param0 > ig.field_a.field_h)) {
                return true;
            }
            if (null == jc.field_b) {
                return false;
            }
            int var2_int = jc.field_b.d(param1 + -16791);
            if (param1 != 10343) {
                return false;
            }
            if (!((var2_int ^ -1) >= -1)) {
                if (param0 - ig.field_a.field_h < var2_int) {
                    var2_int = param0 + -ig.field_a.field_h;
                }
                jc.field_b.a(ig.field_a.field_j, (byte) -109, var2_int, ig.field_a.field_h);
                ta.field_e = rf.c(0);
                ig.field_a.field_h = ig.field_a.field_h + var2_int;
                if (param0 > ig.field_a.field_h) {
                    return false;
                }
                ig.field_a.field_h = 0;
                return true;
            }
            try {
                if (false) throw (IOException) null;
                if ((var2_int ^ -1) <= -1 && vl.b(-91) <= 30000L) {
                    return false;
                }
                ck.b((byte) -120);
            } catch (IOException iOException) {
                ck.b((byte) -86);
            }
            return false;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static String a(int param0) {
        if (param0 != -1) {
            return (String) null;
        }
        if (null == og.field_c) {
            return "";
        }
        return og.field_c;
    }

    final bj a(byte param0) {
        if (param0 != 45) {
            return (bj) null;
        }
        return jf.field_M;
    }

    final static int c(boolean param0) {
        if (!param0) {
            field_c = -69;
            return cg.field_l;
        }
        return cg.field_l;
    }

    final static void a(byte param0, ng param1) {
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        bd var4 = null;
        int var5 = 0;
        int[] var6 = null;
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
                    var5 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var6 = new int[param1.b(2)];
                        var2 = var6;
                        var3 = 0;
                        if (param0 <= -88) {
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
                        a.b(false);
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
                        var4 = (bd) ((Object) param1.a(true));
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var4 == null) {
                            statePc = 8;
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
                        incrementValue$2 = var3;
                        var3++;
                        var6[incrementValue$2] = var4.field_h;
                        var4 = (bd) ((Object) param1.f(2));
                        if (var5 != 0) {
                            statePc = 9;
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
                        if (var5 == 0) {
                            statePc = 4;
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
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var3 = 0;
                        dd.a(var6, -23588);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var4 = (bd) ((Object) param1.a(true));
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
                        if (var4 == null) {
                            statePc = 20;
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
                        incrementValue$3 = var3;
                        var3++;
                        var4.field_h = var6[incrementValue$3];
                        var4 = (bd) ((Object) param1.f(2));
                        if (var5 == 0) {
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
                        if (var5 == 0) {
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
                    var2_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_18_0 = (RuntimeException) (var2_ref);
                    stackIn_17_0 = stackIn_18_0;
                    stackIn_18_1 = new StringBuilder().append("a.A(").append(param0).append(',');
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
                    throw ld.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
                }
                case 20: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    a(String param0, String param1) {
        try {
            this.field_d = param0;
            this.field_g = param1;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "a.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(wf param0, int param1) {
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
              param0.a((byte) -38, this.field_d);
              param0.a(0, this.field_g);
              if (param1 == 7895) {
                break L1;
              } else {
                field_f = (String) null;
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

            stackIn_5_1 = new StringBuilder().append("a.G(");

            if (param0 == null) {
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
          throw ld.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    static {
        field_e = "Back";
        field_f = "Just play";
    }
}
