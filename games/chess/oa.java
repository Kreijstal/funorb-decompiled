/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class oa extends IOException {
    static qc field_b;
    static mk field_a;
    static String field_c;

    public static void a() {
        field_c = null;
        field_b = null;
        field_a = null;
    }

    final static void b() {
        uk.a(false, 17);
    }

    oa(String param0) {
        super(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Asking for or providing contact information";
        field_a = new mk();
    }
}
