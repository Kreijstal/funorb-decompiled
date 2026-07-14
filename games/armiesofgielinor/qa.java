/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qa extends dr {
    static boolean field_F;
    static String field_E;

    final static int h(int param0) {
        if (param0 != 1) {
            field_E = null;
            return 1;
        }
        return 1;
    }

    final nd a(int param0, nd[] param1) {
        if (param0 != -24872) {
            return null;
        }
        return new nd((Object) (Object) bh.a(param1[0].a(2), (byte) 74));
    }

    final static void b(int param0, int param1) {
        eo.field_c = wf.field_F[param0];
        db.field_b = eq.field_m[param0];
        if (param1 != 1) {
          field_F = true;
          of.field_Jb = dk.field_s[param0];
          return;
        } else {
          of.field_Jb = dk.field_s[param0];
          return;
        }
    }

    public static void g(int param0) {
        if (param0 != 1) {
            return;
        }
        field_E = null;
    }

    qa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = false;
        field_E = "Mages have forsworn the use of bladed weapons.";
    }
}
