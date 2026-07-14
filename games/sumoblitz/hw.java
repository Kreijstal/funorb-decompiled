/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hw {
    static boolean[] field_b;
    static ki field_a;

    final static void a(File param0, String param1, int param2) {
        if (param2 != 23295) {
            field_b = null;
            Object discarded$0 = mi.field_b.put((Object) (Object) param1, (Object) (Object) param0);
            return;
        }
        Object discarded$1 = mi.field_b.put((Object) (Object) param1, (Object) (Object) param0);
    }

    final static void a(java.awt.Component param0, int param1, int param2, byte param3, boolean param4, ud param5, wi param6, int param7) {
        Object var9 = null;
        du.a(param1, param4, 10);
        wd.field_f = du.a(param6, param0, 0, param2);
        iv.field_a = du.a(param6, param0, 1, param7);
        sj.field_c = new al();
        cb.field_c = param7;
        iv.field_a.a((hj) (Object) sj.field_c);
        qr.field_b = param5;
        if (param3 <= 103) {
            var9 = null;
            hw.a((java.awt.Component) null, -65, -27, (byte) 49, true, (ud) null, (wi) null, -58);
        } else {
            qr.field_b.a((byte) -43, tt.field_l);
            wd.field_f.a((hj) (Object) qr.field_b);
            return;
        }
        qr.field_b.a((byte) -43, tt.field_l);
        wd.field_f.a((hj) (Object) qr.field_b);
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 5460) {
            field_b = null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new boolean[112];
    }
}
