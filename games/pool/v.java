/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class v {
    private RandomAccessFile field_l;
    private long field_e;
    static String field_d;
    static String[] field_k;
    static int[] field_a;
    static int[] field_f;
    static byte[][] field_b;
    static dd field_c;
    static int[] field_i;
    private long field_h;
    static vh field_j;
    static p[] field_g;

    final int a(byte[] param0, int param1, int param2, int param3) throws IOException {
        int var5 = ((v) this).field_l.read(param0, param3, param2);
        if (param1 != 20859) {
            return -91;
        }
        if (!(0 >= var5)) {
            ((v) this).field_e = ((v) this).field_e + (long)var5;
        }
        return var5;
    }

    protected final void finalize() throws Throwable {
        if (((v) this).field_l != null) {
            System.out.println("");
            ((v) this).c((byte) 122);
        }
    }

    final void c(byte param0) throws IOException {
        if (param0 < 92) {
            v.a(-71);
        }
        if (((v) this).field_l != null) {
            ((v) this).field_l.close();
            ((v) this).field_l = null;
        }
    }

    final static void a(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (param0 == -22444) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    v.b((byte) -109);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (wn.field_a == null) {
                        statePc = 8;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var1 = (Object) (Object) wn.field_a;
                    // monitorenter wn.field_a
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        wn.field_a = null;
                        // monitorexit var1
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 7: {
                    throw (RuntimeException) (Object) var2;
                }
                case 8: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, long param1) throws IOException {
        ((v) this).field_l.seek(param1);
        ((v) this).field_e = param1;
        if (param0 != -1) {
            v.b((byte) -63);
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_d = null;
        if (param0 <= 125) {
            return;
        }
        field_b = null;
        field_k = null;
        field_i = null;
        field_g = null;
        field_f = null;
        field_j = null;
        field_a = null;
    }

    final long a(boolean param0) throws IOException {
        if (param0) {
            return -122L;
        }
        return ((v) this).field_l.length();
    }

    final static void b(byte param0) {
        ma.field_e = null;
        wn.field_g = null;
        be.field_L = null;
        vi.field_c = null;
        uq.field_D = null;
        if (!(oq.field_z == null)) {
            pa.field_J = oq.field_z;
            fj.field_j = lh.field_i;
            pa.field_J.field_K = -1;
            oq.field_z = null;
            pa.field_J.field_P = -1;
            lh.field_i = null;
        }
        if (param0 >= -59) {
            String discarded$0 = v.a(-8, -59, 'ﾽ');
        }
        rg.field_p = true;
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        if ((((v) this).field_h ^ -1L) > (((v) this).field_e + (long)param2 ^ -1L)) {
            ((v) this).field_l.seek(((v) this).field_h);
            ((v) this).field_l.write(1);
            throw new EOFException();
        }
        if (param1 != 25354) {
            v.a((byte) 3);
        }
        ((v) this).field_l.write(param3, param0, param2);
        ((v) this).field_e = ((v) this).field_e + (long)param2;
    }

    v(File param0, String param1, long param2) throws IOException {
        if (-1L == param2) {
            param2 = 9223372036854775807L;
        }
        if ((param0.length() ^ -1L) < (param2 ^ -1L)) {
            boolean discarded$0 = param0.delete();
        }
        ((v) this).field_l = new RandomAccessFile(param0, param1);
        ((v) this).field_e = 0L;
        ((v) this).field_h = param2;
        int var5 = ((v) this).field_l.read();
        if (0 != (var5 ^ -1)) {
            if (!param1.equals((Object) (Object) "r")) {
                ((v) this).field_l.seek(0L);
                ((v) this).field_l.write(var5);
            }
        }
        ((v) this).field_l.seek(0L);
    }

    final static String a(int param0, int param1, char param2) {
        int var4 = 0;
        char[] var5 = new char[param0];
        char[] var3 = var5;
        for (var4 = param1; var4 < param0; var4++) {
            var5[var4] = param2;
        }
        return new String(var5);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Invite players";
        field_f = new int[]{12, 20, 21, 49, 5, 7};
        field_k = new String[]{"Nice shot!", "Well played!", "Good shot!"};
    }
}
