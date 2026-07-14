/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wi {
    static String field_a;
    static int field_b;

    final static void a(byte param0, ji param1) {
        va var2 = null;
        va.b(param1.a(param0 ^ -51, "", "headers.packvorbis"));
        var2 = va.a(param1, "jagex logo2.packvorbis", "");
        ud discarded$5 = var2.a();
        if (param0 != -51) {
          field_b = -123;
          return;
        } else {
          return;
        }
    }

    final static cd a(String[] args, int param1) {
        cd var2 = null;
        if (param1 != -3) {
          field_b = 29;
          var2 = new cd(false);
          var2.field_d = args;
          return var2;
        } else {
          var2 = new cd(false);
          var2.field_d = args;
          return var2;
        }
    }

    final static boolean a(int param0, String param1) {
        if (!(jg.field_i)) {
            return false;
        }
        if ((pk.field_r ^ -1) != -3) {
            return false;
        }
        if (cf.field_c == null) {
            return false;
        }
        CharSequence var3 = (CharSequence) (Object) param1;
        if (!(cf.field_c.equals((Object) (Object) kf.a(var3, (byte) 2)))) {
            return false;
        }
        int var2 = 82 / ((-50 - param0) / 34);
        return true;
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 0) {
            Object var2 = null;
            cd discarded$0 = wi.a((String[]) null, 103);
        }
    }

    final static void a(boolean param0, int param1, String param2) {
        dc.field_d = param0 ? true : false;
        mg.field_Nb = true;
        cl.field_r = new gk(ah.field_c, ec.field_p, param2, vb.field_Z, dc.field_d);
        ah.field_c.a((byte) -115, (ce) (Object) cl.field_r);
        if (param1 > -20) {
            field_b = -117;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "to keep fullscreen or";
        field_b = 0;
    }
}
