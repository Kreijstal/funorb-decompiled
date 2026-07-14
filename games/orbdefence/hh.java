/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hh extends sh {
    private String field_a;
    private String field_b;
    static volatile boolean field_c;
    static i field_d;
    static String field_e;

    public static void b(int param0) {
        field_d = null;
        if (param0 >= -24) {
            field_c = true;
            field_e = null;
            return;
        }
        field_e = null;
    }

    final fk a(int param0) {
        if (param0 != 10277) {
            ((hh) this).field_a = null;
            return ci.field_b;
        }
        return ci.field_b;
    }

    hh(String param0, String param1) {
        ((hh) this).field_a = param1;
        ((hh) this).field_b = param0;
    }

    final static void c(int param0) {
        kg.field_h.field_b = 0;
        if (param0 != 24060) {
            hh.c(-57);
            kg.field_h.field_n = 0;
            return;
        }
        kg.field_h.field_n = 0;
    }

    final void a(mg param0, int param1) {
        Object var4 = null;
        param0.a(false, ((hh) this).field_b);
        if (param1 != 27557) {
          var4 = null;
          ((hh) this).a((mg) null, 15);
          param0.a((byte) -127, ((hh) this).field_a);
          return;
        } else {
          param0.a((byte) -127, ((hh) this).field_a);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = true;
        field_d = new i();
        field_e = "MY HISCORES";
    }
}
