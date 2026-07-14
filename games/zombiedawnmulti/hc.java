/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hc {
    static String field_a;
    static int field_c;
    static of field_b;

    final static ca a(boolean param0, byte[] param1) {
        ca var2 = null;
        if (param1 != null) {
          if (!param0) {
            field_c = -66;
            var2 = new ca(param1, k.field_i, qj.field_o, oq.field_w, vj.field_p, tp.field_t, qp.field_t);
            fd.h((byte) 125);
            return var2;
          } else {
            var2 = new ca(param1, k.field_i, qj.field_o, oq.field_w, vj.field_p, tp.field_t, qp.field_t);
            fd.h((byte) 125);
            return var2;
          }
        } else {
          return null;
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
            hc.a(44);
            field_a = null;
            field_b = null;
            return;
        }
        field_a = null;
        field_b = null;
    }

    final static ja[] a(ja[] param0, int param1) {
        int var2 = 0;
        ja var3 = null;
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        for (var2 = param1; param0.length > var2; var2++) {
            var3 = param0[var2];
            param0[var2].field_y = 0;
            var3.field_r = 0;
            param0[var2].field_z = param0[var2].field_x;
            param0[var2].field_u = param0[var2].field_w;
        }
        return param0;
    }

    final static ae a(int param0, ga param1) {
        int var2 = 0;
        int var3 = 0;
        if (param0 != 0) {
          return null;
        } else {
          var2 = param1.d((byte) 69);
          var3 = param1.d((byte) 69);
          return (ae) (Object) new aj(var2, var3);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Tough";
    }
}
