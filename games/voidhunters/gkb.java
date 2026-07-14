/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gkb extends rqa {
    static java.util.zip.CRC32 field_p;
    static int field_o;
    static String field_q;

    public static void a(int param0) {
        field_p = null;
        field_q = null;
        if (param0 != 88) {
            field_q = null;
        }
    }

    final nc a(nc[] param0, int param1) {
        si.a(88, 62, param0[0].a(102));
        if (param1 >= -119) {
          field_o = -58;
          return new nc((Object) (Object) "void");
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    gkb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 4096;
        field_p = new java.util.zip.CRC32();
        field_q = "Similar rating";
    }
}
