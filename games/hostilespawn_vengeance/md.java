/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class md extends nj {
    static String field_j;
    static boolean field_k;
    private java.nio.ByteBuffer field_h;
    static int field_o;
    static lf[] field_g;
    static String field_f;
    static String field_m;
    static String field_l;
    static boolean field_i;
    static java.awt.Frame field_n;

    final static String a(String param0, gb param1, String param2, byte param3) {
        if (!(param1.a(-15879))) {
            return param2;
        }
        int var4 = 12 / ((3 - param3) / 60);
        return param0 + " - " + param1.c(0) + "%";
    }

    final void a(int param0, byte[] param1) {
        ((md) this).field_h = java.nio.ByteBuffer.allocateDirect(param1.length);
        java.nio.Buffer discarded$12 = ((md) this).field_h.position(0);
        java.nio.ByteBuffer discarded$19 = ((md) this).field_h.put(param1);
        if (param0 != 24) {
            field_l = null;
        }
    }

    final static void b(int param0) {
        try {
            IOException iOException = null;
            int var1 = 0;
            IOException var2 = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var3 = HostileSpawn.field_I ? 1 : 0;
                        if (null == ig.field_N) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        ig.field_N.a((byte) -128);
                        statePc = 2;
                        continue stateLoop;
                    }
                    case 2: {
                        if (vc.field_c == null) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        vc.field_c.a(3);
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 4: {
                        if (null != mk.field_K) {
                            statePc = 6;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        try {
                            mk.field_K.f(0);
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        iOException = (IOException) (Object) caughtException;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        if (param0 > 15) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        md.b(-30);
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        if (null != oe.field_a) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        return;
                    }
                    case 13: {
                        var1 = 0;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
                        if (oe.field_a.length > var1) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        return;
                    }
                    case 16: {
                        if (oe.field_a[var1] != null) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 17: {
                        var1++;
                        var1++;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 19: {
                        try {
                            oe.field_a[var1].f(0);
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        var1++;
                        var1++;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 21: {
                        var2 = (IOException) (Object) caughtException;
                        var1++;
                        statePc = 14;
                        continue stateLoop;
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

    final static void c(int param0) {
        if (param0 >= -70) {
            field_l = null;
            cj.a(bn.c(-1), 0);
            return;
        }
        cj.a(bn.c(-1), 0);
    }

    final byte[] a(byte param0) {
        byte[] var2 = null;
        byte[] var3 = null;
        if (param0 > -25) {
          return null;
        } else {
          var3 = new byte[((md) this).field_h.capacity()];
          var2 = var3;
          java.nio.Buffer discarded$4 = ((md) this).field_h.position(0);
          java.nio.ByteBuffer discarded$5 = ((md) this).field_h.get(var3);
          return var3;
        }
    }

    public static void c(byte param0) {
        field_n = null;
        if (param0 < 42) {
          md.c(87);
          field_f = null;
          field_l = null;
          field_j = null;
          field_g = null;
          field_m = null;
          return;
        } else {
          field_f = null;
          field_l = null;
          field_j = null;
          field_g = null;
          field_m = null;
          return;
        }
    }

    md() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 0;
        field_k = true;
        field_m = "Completion time: <col=ffffff>";
        field_j = "Change display name";
        field_i = false;
        field_l = "The bridge console is in this room; walk up to it to download the data.";
    }
}
