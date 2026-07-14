/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class en {
    static fc field_a;
    static String field_c;
    static String field_b;

    final static void a(boolean param0) {
        if (!param0) {
            field_b = null;
            mg.field_N = new nj();
            return;
        }
        mg.field_N = new nj();
    }

    final static String a(boolean param0, String param1, r param2, int param3, String param4) {
        if (!param2.b(0)) {
          return param1;
        } else {
          if (param0) {
            return null;
          } else {
            return param4 + " - " + param2.b(param3, 100) + "%";
          }
        }
    }

    final static byte[] a(byte param0, String param1) {
        if (param0 > -6) {
            en.a(25);
            return po.field_e.a("", param1, 0);
        }
        return po.field_e.a("", param1, 0);
    }

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        if (param0 != 4096) {
            return;
        }
        field_b = null;
    }

    final static String a(String param0, byte param1, String param2, int param3) {
        CharSequence var9 = (CharSequence) (Object) param0;
        if (!(hi.a((byte) 126, var9))) {
            return or.field_a;
        }
        if (!(ba.field_d == 2)) {
            return t.field_n;
        }
        tp var8 = or.a(90, param2);
        if (!(var8 != null)) {
            return Vertigo2.a(new String[1], jp.field_R, -114);
        }
        var8.c(2);
        var8.a(-124);
        vd.field_a = vd.field_a - 1;
        int var6 = 97 % ((param1 - -39) / 55);
        mi var5 = uh.field_Wb;
        var5.j(param3, 120);
        var5.field_u = var5.field_u + 1;
        int var7 = var5.field_u;
        var5.f(3, 81);
        var5.a((byte) 0, param0);
        var5.b((byte) -96, -var7 + var5.field_u);
        return null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Accept rematch";
        field_a = new fc(4096, 4096, 4096, false, true, false, false, 0, 0);
        field_b = "<col=ee9d32>Multiplayer</col>";
    }
}
