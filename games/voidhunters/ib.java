/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ib extends rqa {
    static String field_o;

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
            return null;
        }
        return new nc((Object) (Object) frb.a(216, 101));
    }

    ib(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        if (param0 > -24) {
            field_o = null;
            field_o = null;
            return;
        }
        field_o = null;
    }

    final static int a(int param0, int param1, int param2, Random param3) {
        int var4 = hob.a(param3, param2, 121);
        int var6 = 84 / ((7 - param0) / 49);
        int var5 = qq.a(true, param1, var4);
        return var5;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Kick <%0> from this game";
    }
}
