/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oa extends dg {
    int field_A;
    static boolean field_D;
    static String field_B;
    static th field_C;
    static String field_F;

    final void a(int param0, byte param1, int param2, int param3) {
        if (param0 != 0) {
            return;
        }
        if (null == ((oa) this).field_y) {
            return;
        }
        if (0 == ((oa) this).field_A) {
            return;
        }
        if (!(((oa) this).field_A != 256)) {
            ((oa) this).field_y.a(param0, (byte) -57, param2 - -((oa) this).field_k, ((oa) this).field_w + param3);
            return;
        }
        pb var5 = new pb(((oa) this).field_y.field_p, ((oa) this).field_y.field_t);
        hj.a(var5, 1);
        ((oa) this).field_y.a(param0, param1, 0, 0);
        id.b((byte) -58);
        var5.e(param3 + ((oa) this).field_w, ((oa) this).field_k + param2, ((oa) this).field_A);
    }

    public oa() {
        super(0, 0, 0, 0, (uk) null, (lf) null);
        ((oa) this).field_A = 256;
    }

    oa(rj param0) {
        super(param0.field_w, param0.field_k, param0.field_p, param0.field_t, (uk) null, (lf) null);
        param0.b(((oa) this).field_p, 0, 0, ((oa) this).field_t, 23987);
        ((oa) this).field_A = 256;
        ((oa) this).field_y = param0;
    }

    final static int a(rb param0, int param1, boolean param2) {
        Object var4 = null;
        if (param1 != 0) {
          var4 = null;
          int discarded$2 = oa.a((rb) null, 119, true);
          return param0.c(param1 + -25186, param2);
        } else {
          return param0.c(param1 + -25186, param2);
        }
    }

    public static void i(int param0) {
        field_B = null;
        field_C = null;
        if (param0 > -68) {
            oa.i(-65);
            field_F = null;
            return;
        }
        field_F = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = true;
        field_B = "Click";
        field_C = new th();
        field_F = "Connection lost. <%0>";
    }
}
