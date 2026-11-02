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
          field_b = (String) null;
          field_b = null;
          return;
        }
        field_b = null;
    }

    final static void b(int param0) {
        GetBombletSprayRandomness.field_o[61] = 27;
        GetBombletSprayRandomness.field_o[59] = 57;
        GetBombletSprayRandomness.field_o[222] = 58;
        GetBombletSprayRandomness.field_o[520] = 59;
        GetBombletSprayRandomness.field_o[192] = 28;
        GetBombletSprayRandomness.field_o[46] = 72;
        GetBombletSprayRandomness.field_o[45] = 26;
        GetBombletSprayRandomness.field_o[param0] = 73;
        GetBombletSprayRandomness.field_o[93] = 43;
        GetBombletSprayRandomness.field_o[91] = 42;
        GetBombletSprayRandomness.field_o[92] = 74;
        GetBombletSprayRandomness.field_o[44] = 71;
    }

    ndb(String param0) {
        super(param0);
    }

    static {
        field_b = "Move";
        field_c = 1;
    }
}
