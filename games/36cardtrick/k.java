/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class k implements ba {
    static double field_a;
    static int field_c;
    static boolean field_b;
    private long field_d;

    abstract String d(int param0);

    final static void c(int param0) {
        j.j(-23687);
        if (param0 >= -107) {
            return;
        }
        cg.field_f = true;
        ei.field_e = true;
        sd.field_c.k(117);
        ca.a(ni.field_e, false, 16777215);
    }

    public final sg a(boolean param0) {
        if (!(!((k) this).a((byte) -31))) {
            return il.field_e;
        }
        if (!param0) {
            ((k) this).field_d = 73L;
            if (!(id.a(43) >= ((k) this).field_d + 350L)) {
                return tb.field_b;
            }
            return ((k) this).e(14);
        }
        if (!(id.a(43) >= ((k) this).field_d + 350L)) {
            return tb.field_b;
        }
        return ((k) this).e(14);
    }

    final static void a(Throwable param0, byte param1, String param2) {
        try {
            Exception var3 = null;
            String var3_ref = null;
            int var4 = 0;
            vi var5 = null;
            DataInputStream var6 = null;
            int var7 = 0;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            String var11 = null;
            le stackIn_10_0 = null;
            java.net.URL stackIn_10_1 = null;
            java.net.URL stackIn_10_2 = null;
            java.net.URL stackIn_10_3 = null;
            StringBuilder stackIn_10_4 = null;
            le stackIn_11_0 = null;
            java.net.URL stackIn_11_1 = null;
            java.net.URL stackIn_11_2 = null;
            java.net.URL stackIn_11_3 = null;
            StringBuilder stackIn_11_4 = null;
            le stackIn_12_0 = null;
            java.net.URL stackIn_12_1 = null;
            java.net.URL stackIn_12_2 = null;
            java.net.URL stackIn_12_3 = null;
            StringBuilder stackIn_12_4 = null;
            String stackIn_12_5 = null;
            le stackOut_9_0 = null;
            java.net.URL stackOut_9_1 = null;
            java.net.URL stackOut_9_2 = null;
            java.net.URL stackOut_9_3 = null;
            StringBuilder stackOut_9_4 = null;
            le stackOut_10_0 = null;
            java.net.URL stackOut_10_1 = null;
            java.net.URL stackOut_10_2 = null;
            java.net.URL stackOut_10_3 = null;
            StringBuilder stackOut_10_4 = null;
            String stackOut_10_5 = null;
            le stackOut_11_0 = null;
            java.net.URL stackOut_11_1 = null;
            java.net.URL stackOut_11_2 = null;
            java.net.URL stackOut_11_3 = null;
            StringBuilder stackOut_11_4 = null;
            String stackOut_11_5 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var7 = Main.field_T;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3_ref = "";
                            if (param0 == null) {
                                statePc = 3;
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
                            var3_ref = mf.a(param0, (byte) -3);
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (param2 == null) {
                                statePc = 7;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (param0 == null) {
                                statePc = 6;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var3_ref = var3_ref + " | ";
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var3_ref = var3_ref + param2;
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
                            n.a(var3_ref, (byte) 120);
                            var4 = 71 % ((param1 - -20) / 48);
                            var8 = sb.a(var3_ref, ":", "%3a", 96);
                            var9 = sb.a(var8, "@", "%40", 118);
                            var10 = sb.a(var9, "&", "%26", 109);
                            var11 = sb.a(var10, "#", "%23", 90);
                            if (tk.field_o != null) {
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
                        return;
                    }
                    case 9: {
                        try {
                            stackOut_9_0 = Main.field_W;
                            stackOut_9_1 = null;
                            stackOut_9_2 = null;
                            stackOut_9_3 = tk.field_o.getCodeBase();
                            stackOut_9_4 = new StringBuilder().append("clienterror.ws?c=").append(ca.field_d).append("&u=");
                            stackIn_11_0 = stackOut_9_0;
                            stackIn_11_1 = stackOut_9_1;
                            stackIn_11_2 = stackOut_9_2;
                            stackIn_11_3 = stackOut_9_3;
                            stackIn_11_4 = stackOut_9_4;
                            stackIn_10_0 = stackOut_9_0;
                            stackIn_10_1 = stackOut_9_1;
                            stackIn_10_2 = stackOut_9_2;
                            stackIn_10_3 = stackOut_9_3;
                            stackIn_10_4 = stackOut_9_4;
                            if (fk.field_o == null) {
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
                        try {
                            stackOut_10_0 = (le) (Object) stackIn_10_0;
                            stackOut_10_1 = null;
                            stackOut_10_2 = null;
                            stackOut_10_3 = (java.net.URL) (Object) stackIn_10_3;
                            stackOut_10_4 = (StringBuilder) (Object) stackIn_10_4;
                            stackOut_10_5 = fk.field_o;
                            stackIn_12_0 = stackOut_10_0;
                            stackIn_12_1 = stackOut_10_1;
                            stackIn_12_2 = stackOut_10_2;
                            stackIn_12_3 = stackOut_10_3;
                            stackIn_12_4 = stackOut_10_4;
                            stackIn_12_5 = stackOut_10_5;
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            stackOut_11_0 = (le) (Object) stackIn_11_0;
                            stackOut_11_1 = null;
                            stackOut_11_2 = null;
                            stackOut_11_3 = (java.net.URL) (Object) stackIn_11_3;
                            stackOut_11_4 = (StringBuilder) (Object) stackIn_11_4;
                            stackOut_11_5 = "" + kb.field_f;
                            stackIn_12_0 = stackOut_11_0;
                            stackIn_12_1 = stackOut_11_1;
                            stackIn_12_2 = stackOut_11_2;
                            stackIn_12_3 = stackOut_11_3;
                            stackIn_12_4 = stackOut_11_4;
                            stackIn_12_5 = stackOut_11_5;
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
                            new java.net.URL((java.net.URL) (Object) stackIn_12_3, (String) (Object) (stackIn_12_5 + "&v1=" + le.field_v + "&v2=" + le.field_w + "&e=" + var11));
                            var5 = ((le) (Object) stackIn_12_0).a((java.net.URL) (Object) stackIn_12_1, true);
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            if (((vi) var5).field_a != 0) {
                                statePc = 15;
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
                            wk.a((byte) -97, 1L);
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (1 != ((vi) var5).field_a) {
                                statePc = 19;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            var6 = (DataInputStream) ((vi) var5).field_e;
                            int discarded$1 = var6.read();
                            var6.close();
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        var3 = (Exception) (Object) caughtException;
                        statePc = 19;
                        continue stateLoop;
                    }
                    case 19: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void a(int param0) {
        if (param0 >= -96) {
            k.c(58);
            ((k) this).field_d = id.a(111);
            return;
        }
        ((k) this).field_d = id.a(111);
    }

    abstract sg e(int param0);

    public final String b(int param0) {
        if (!((k) this).a((byte) -60)) {
          if (param0 == 26766) {
            if ((id.a(46) ^ -1L) > (350L + ((k) this).field_d ^ -1L)) {
              return null;
            } else {
              return ((k) this).d(-5777);
            }
          } else {
            ((k) this).field_d = 5L;
            if ((id.a(46) ^ -1L) > (350L + ((k) this).field_d ^ -1L)) {
              return null;
            } else {
              return ((k) this).d(-5777);
            }
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0.0;
        field_b = false;
        field_c = 0;
    }
}
