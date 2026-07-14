/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vb extends dh {
    private java.nio.ByteBuffer field_i;
    static cr field_j;
    static boolean field_g;
    static int field_h;

    public static void b(byte param0) {
        field_j = null;
        if (param0 >= -40) {
            field_g = false;
        }
    }

    final static String c(int param0) {
        if (param0 != -15381) {
            field_g = false;
            if (qe.field_V == null) {
                return "";
            }
            return qe.field_V;
        }
        if (qe.field_V == null) {
            return "";
        }
        return qe.field_V;
    }

    final static void d(int param0) {
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
                        var3 = Vertigo2.field_L ? 1 : 0;
                        if (param0 > 34) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        field_h = 5;
                        statePc = 2;
                        continue stateLoop;
                    }
                    case 2: {
                        if (kb.field_e == null) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        kb.field_e.b((byte) 9);
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 4: {
                        if (null == ap.field_a) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        ap.field_a.a(-82);
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        if (null != ad.field_g) {
                            statePc = 8;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        try {
                            ad.field_g.b(-22473);
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        iOException = (IOException) (Object) caughtException;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        if (null != rg.field_g) {
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
                        if (rg.field_g.length > var1) {
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
                        if (rg.field_g[var1] != null) {
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
                            rg.field_g[var1].b(-22473);
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

    final byte[] b(int param0) {
        byte[] var4 = new byte[((vb) this).field_i.capacity()];
        byte[] var2 = var4;
        java.nio.Buffer discarded$0 = ((vb) this).field_i.position(0);
        java.nio.ByteBuffer discarded$1 = ((vb) this).field_i.get(var4);
        int var3 = 8 / ((param0 - 13) / 58);
        return var4;
    }

    final void a(byte[] param0, boolean param1) {
        ((vb) this).field_i = java.nio.ByteBuffer.allocateDirect(param0.length);
        if (!param1) {
          field_j = null;
          java.nio.Buffer discarded$8 = ((vb) this).field_i.position(0);
          java.nio.ByteBuffer discarded$9 = ((vb) this).field_i.put(param0);
          return;
        } else {
          java.nio.Buffer discarded$10 = ((vb) this).field_i.position(0);
          java.nio.ByteBuffer discarded$11 = ((vb) this).field_i.put(param0);
          return;
        }
    }

    vb() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = true;
        field_h = 5;
    }
}
