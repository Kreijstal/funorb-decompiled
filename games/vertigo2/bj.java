/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bj {
    private RandomAccessFile field_d;
    static int field_h;
    private long field_a;
    private long field_e;
    static tj field_f;
    static ve field_g;
    static fe field_j;
    static byte[] field_i;
    static la field_c;
    static String field_b;

    final static String a(int param0, char param1) {
        if (param0 != 0) {
            bj.a(true);
        }
        return String.valueOf(param1);
    }

    final void a(int param0, int param1, byte[] param2, boolean param3) throws IOException {
        if (!((long)param0 + ((bj) this).field_a <= ((bj) this).field_e)) {
            ((bj) this).field_d.seek(((bj) this).field_e);
            ((bj) this).field_d.write(1);
            throw new EOFException();
        }
        ((bj) this).field_d.write(param2, param1, param0);
        if (param3) {
            bj.a(true);
        }
        ((bj) this).field_a = ((bj) this).field_a + (long)param0;
    }

    final long b(int param0) throws IOException {
        if (param0 != 0) {
            ((bj) this).field_e = 50L;
        }
        return ((bj) this).field_d.length();
    }

    protected final void finalize() throws Throwable {
        if (!(null == ((bj) this).field_d)) {
            System.out.println("");
            ((bj) this).a(0);
        }
    }

    final void a(int param0) throws IOException {
        if (param0 != 0) {
            field_g = null;
        }
        if (((bj) this).field_d != null) {
            ((bj) this).field_d.close();
            ((bj) this).field_d = null;
        }
    }

    bj(File param0, String param1, long param2) throws IOException {
        if (0L == (param2 ^ -1L)) {
            param2 = 9223372036854775807L;
        }
        if (param0.length() > param2) {
            boolean discarded$0 = param0.delete();
        }
        ((bj) this).field_d = new RandomAccessFile(param0, param1);
        ((bj) this).field_e = param2;
        ((bj) this).field_a = 0L;
        int var5 = ((bj) this).field_d.read();
        if ((var5 ^ -1) != 0) {
            if (!param1.equals((Object) (Object) "r")) {
                ((bj) this).field_d.seek(0L);
                ((bj) this).field_d.write(var5);
            }
        }
        ((bj) this).field_d.seek(0L);
    }

    final int a(int param0, byte param1, byte[] param2, int param3) throws IOException {
        int var6 = 29 % ((param1 - 20) / 61);
        int var5 = ((bj) this).field_d.read(param2, param3, param0);
        if (var5 > 0) {
            ((bj) this).field_a = ((bj) this).field_a + (long)var5;
        }
        return var5;
    }

    public static void a(boolean param0) {
        field_c = null;
        field_g = null;
        field_f = null;
        field_i = null;
        field_b = null;
        if (param0) {
            field_c = null;
        }
        field_j = null;
    }

    final void a(long param0, boolean param1) throws IOException {
        if (param1) {
            return;
        }
        ((bj) this).field_d.seek(param0);
        ((bj) this).field_a = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_h = 0;
        field_f = new tj();
        field_g = new ve(10, 2, 2, 0);
        field_i = new byte[4096];
        for (var0 = 0; (var0 ^ -1) > -4097; var0++) {
            field_i[var0] = (byte)-56;
        }
        field_b = "You cannot chat to <%0> because <%0> is not in your friend list.";
        field_c = new la(16);
    }
}
