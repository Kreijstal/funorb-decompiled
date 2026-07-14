/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class li {
    int field_a;
    static String field_e;
    static ln field_b;
    static String field_c;
    String field_f;
    static qr field_d;

    public static void a(byte param0) {
        field_b = null;
        field_d = null;
        field_e = null;
        if (param0 != 23) {
            li.a((byte) 79);
            field_c = null;
            return;
        }
        field_c = null;
    }

    final java.net.Socket a(int param0) throws IOException {
        if (param0 <= 108) {
          field_c = null;
          return new java.net.Socket(((li) this).field_f, ((li) this).field_a);
        } else {
          return new java.net.Socket(((li) this).field_f, ((li) this).field_a);
        }
    }

    abstract java.net.Socket b(int param0) throws IOException;

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Select a system adjacent to a friendly system to cause a destructive stellar flare, or right click to cancel this project.";
        field_c = "The Achievements system is currently unavailable.";
        field_b = new ln(-1, -1, -1, -1);
    }
}
