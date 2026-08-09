/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jq {
    static mi field_a;

    jq(fk param0, int param1, int param2, int param3) {
    }

    final static void a(int param0, int param1) {
        if (param1 != 13586) {
          field_a = (mi) null;
          pi.field_b = wh.field_w[param0];
          ek.field_k = nm.field_u[param0];
          mm.field_c = qi.field_a[param0];
          return;
        } else {
          pi.field_b = wh.field_w[param0];
          ek.field_k = nm.field_u[param0];
          mm.field_c = qi.field_a[param0];
          return;
        }
    }

    final static void a(int param0, wb param1) {
        try {
            kc.j(82);
            lk.a(param1.field_C, param1.field_z, param1.field_w);
            if (param0 != 7161) {
                jq.a(-84, -69);
            }
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "jq.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        if (param0 < 99) {
            wb var2 = (wb) null;
            jq.a(87, (wb) null);
            field_a = null;
            return;
        }
        field_a = null;
    }

    static {
        field_a = new mi();
    }
}
