/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd {
    static int field_a;
    static int[] field_e;
    static boolean field_c;
    static int field_b;
    static int field_d;

    final static boolean a(int param0, boolean param1, int param2, String param3, String param4, String param5, mj param6) {
        if (ok.field_a != o.field_l) {
            return false;
        }
        jg var8 = new jg(na.field_d, param6);
        na.field_d.a((byte) 84, (rj) (Object) var8);
        if (param2 != 5) {
            field_d = -43;
            if (ah.d(-12171)) {
                var8.p(87);
                return true;
            }
            sb.field_a = param3;
            o.field_l = dj.field_a;
            u.field_k = param0;
            lc.field_p = param5;
            hi.field_d = null;
            qe.field_o = param1 ? true : false;
            kc.field_c = param4;
            return true;
        }
        if (ah.d(-12171)) {
            var8.p(87);
        } else {
            sb.field_a = param3;
            o.field_l = dj.field_a;
            u.field_k = param0;
            lc.field_p = param5;
            hi.field_d = null;
            qe.field_o = param1 ? true : false;
            kc.field_c = param4;
            return true;
        }
        return true;
    }

    public static void a(byte param0) {
        Object var2 = null;
        if (param0 <= 75) {
          var2 = null;
          boolean discarded$2 = wd.a(70, true, -68, (String) null, (String) null, (String) null, (mj) null);
          field_e = null;
          return;
        } else {
          field_e = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new int[]{0, 5, 1, 2, 3, 0};
        field_c = true;
    }
}
