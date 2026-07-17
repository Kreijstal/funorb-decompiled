/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class jm extends java.awt.Canvas {
    static String field_d;
    private java.awt.Component field_g;
    static int field_f;
    static String field_a;
    static int field_h;
    static int field_b;
    static boolean field_c;
    static String field_e;

    public final void paint(java.awt.Graphics param0) {
        try {
            ((jm) this).field_g.paint(param0);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "jm.paint(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    public final void update(java.awt.Graphics param0) {
        try {
            ((jm) this).field_g.update(param0);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "jm.update(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_e = null;
        field_d = null;
    }

    jm(java.awt.Component param0) {
        try {
            ((jm) this).field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "jm.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(File param0, int param1, int param2, byte[] param3) throws IOException {
        DataInputStream var4 = null;
        try {
            var4 = new DataInputStream((InputStream) (Object) new BufferedInputStream((InputStream) (Object) new FileInputStream(param0)));
            {
                var4.readFully(param3, param2, param1);
            }
            var4.close();
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "jm.A(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "UFO is launching!";
        field_f = 0;
        field_d = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_e = "1000pts";
    }
}
