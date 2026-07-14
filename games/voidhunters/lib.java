/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class lib extends rqa {
    static String field_q;
    static String field_p;
    static Calendar field_o;

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
          return null;
        } else {
          si.a(14, 62, param0[0].a(121));
          return new nc((Object) (Object) "void");
        }
    }

    lib(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        if (param0 != 0) {
            return;
        }
        field_p = null;
        field_o = null;
        field_q = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Classic";
        field_p = "Skip current mission phase";
        field_o = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
}
