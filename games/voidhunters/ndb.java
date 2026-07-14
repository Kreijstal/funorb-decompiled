/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ndb extends IOException {
    static int field_c;
    static uca field_a;
    static String field_b;

    public static void a(int param0) {
        field_a = null;
        if (param0 != 91) {
            field_b = null;
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static void b(int param0) {
        ee.field_o[61] = 27;
        ee.field_o[59] = 57;
        ee.field_o[222] = 58;
        ee.field_o[520] = 59;
        ee.field_o[192] = 28;
        ee.field_o[46] = 72;
        ee.field_o[45] = 26;
        ee.field_o[param0] = 73;
        ee.field_o[93] = 43;
        ee.field_o[91] = 42;
        ee.field_o[92] = 74;
        ee.field_o[44] = 71;
    }

    ndb(String param0) {
        super(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Move";
        field_c = 1;
    }
}
