/*
 * Decompiled by CFR-JS 0.4.0.
 */
class fk extends kb {
    static int field_e;
    static ng field_i;
    private long field_g;
    static long field_h;
    static String[] field_c;
    static String field_j;
    static int[] field_d;
    private String field_f;

    final void a(wf param0, int param1) {
        if (param1 != 7895) {
          bj discarded$2 = ((fk) this).a((byte) 17);
          param0.a(((fk) this).field_g, (byte) 37);
          param0.a(param1 + -7895, ((fk) this).field_f);
          return;
        } else {
          param0.a(((fk) this).field_g, (byte) 37);
          param0.a(param1 + -7895, ((fk) this).field_f);
          return;
        }
    }

    public static void b(boolean param0) {
        field_c = null;
        if (param0) {
            return;
        }
        field_d = null;
        field_i = null;
        field_j = null;
    }

    bj a(byte param0) {
        if (param0 != 45) {
            field_j = null;
            return ej.field_a;
        }
        return ej.field_a;
    }

    final static void a(boolean param0, sh param1, byte param2, sh param3, sh param4) {
        qa.field_c = mb.a((byte) -63, "");
        qa.field_c.a((byte) 121, false);
        ul.a(param1, param4, param3, (byte) 109);
        if (param2 != 40) {
          fk.b(false);
          kf.f(1);
          bk.field_c = c.field_m;
          ee.field_c = c.field_m;
          return;
        } else {
          kf.f(1);
          bk.field_c = c.field_m;
          ee.field_c = c.field_m;
          return;
        }
    }

    final static gb a(int param0) {
        int var1 = -90 % ((35 - param0) / 37);
        return new gb(ve.b(25594), ja.a(-2116060060));
    }

    fk(long param0, String param1) {
        ((fk) this).field_f = param1;
        ((fk) this).field_g = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = -1;
        field_c = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_j = "Invalid password.";
        field_d = new int[8192];
    }
}
