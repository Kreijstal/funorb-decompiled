/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class jh {
    static String[][] field_d;
    static String[][] field_c;
    String field_f;
    static int field_a;
    int field_e;
    static String field_b;

    public static void a(byte param0) {
        field_d = null;
        if (param0 != 39) {
            field_c = null;
        }
        field_b = null;
        field_c = null;
    }

    final static int a(CharSequence param0, int param1) {
        int var4 = 0;
        int var5 = MinerDisturbance.field_ab;
        int var2 = param0.length();
        int var3 = param1;
        for (var4 = 0; var4 < var2; var4++) {
            var3 = (var3 << 1398563877) + -var3 + kj.a(param0.charAt(var4), param1 ^ -8251);
        }
        return var3;
    }

    final java.net.Socket b(byte param0) throws IOException {
        if (param0 != 51) {
            field_b = null;
        }
        return new java.net.Socket(((jh) this).field_f, ((jh) this).field_e);
    }

    abstract java.net.Socket a(int param0) throws IOException;

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new String[][]{new String[1]};
        field_d = new String[][]{null, new String[1]};
        field_b = "Next";
    }
}
