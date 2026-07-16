/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mb {
    static int[] field_c;
    static ee field_a;
    static String field_b;

    final static void a(String param0, int param1, boolean param2, boolean param3) {
        j.j(-23687);
        if (param1 != 1024) {
          mb.a(-72);
          sd.field_c.k(126);
          i.field_a = new ak(ng.field_y, (String) null, ei.field_e, param2, param3);
          vb.field_h = new ej(sd.field_c, (lk) (Object) i.field_a);
          sd.field_c.b((lk) (Object) vb.field_h, (byte) -34);
          return;
        } else {
          sd.field_c.k(126);
          i.field_a = new ak(ng.field_y, (String) null, ei.field_e, param2, param3);
          vb.field_h = new ej(sd.field_c, (lk) (Object) i.field_a);
          sd.field_c.b((lk) (Object) vb.field_h, (byte) -34);
          return;
        }
    }

    final static void a(int param0, int param1, kc[] param2, boolean param3, int param4, int param5, kc[] param6, int param7, int param8, int param9, int param10, ee param11) {
        we.a(param5, param0, param0, param7, param2, param8, param10, param1, param9, param11, param6, param10, true, param3, param11);
        if (param4 != 9414) {
            field_c = null;
        }
    }

    public static void a(int param0) {
        if (param0 != 1024) {
          field_b = null;
          field_a = null;
          field_b = null;
          field_c = null;
          return;
        } else {
          field_a = null;
          field_b = null;
          field_c = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[1024];
        field_b = "Confirm Email:";
    }
}
