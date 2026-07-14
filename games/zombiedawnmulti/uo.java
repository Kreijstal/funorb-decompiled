/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uo extends ae {
    static String field_j;
    private int field_l;
    private int field_k;
    private int field_m;
    static ri field_n;
    private int field_i;

    public static void c(byte param0) {
        if (param0 < 116) {
            return;
        }
        field_n = null;
        field_j = null;
    }

    final static void b(boolean param0, int param1) {
        ga var2 = null;
        int var3 = 0;
        var2 = ma.field_a;
        var2.b((byte) -35, param1);
        var2.field_j = var2.field_j + 1;
        if (!param0) {
          uo.b(true, -17);
          var3 = var2.field_j;
          var2.a(-116, 2);
          var2.a(fg.field_k, fg.field_k.length, 0, 123);
          var2.a(123, pb.field_h);
          var2.a(125, sc.field_f);
          var2.a(tg.field_a, tg.field_a.length, 0, 119);
          var2.e(113, var2.field_j - var3);
          return;
        } else {
          var3 = var2.field_j;
          var2.a(-116, 2);
          var2.a(fg.field_k, fg.field_k.length, 0, 123);
          var2.a(123, pb.field_h);
          var2.a(125, sc.field_f);
          var2.a(tg.field_a, tg.field_a.length, 0, 119);
          var2.e(113, var2.field_j - var3);
          return;
        }
    }

    final void a(byte param0) {
        Object var3 = null;
        if (param0 > -47) {
          var3 = null;
          ((uo) this).a(70, (qd) null);
          super.a((byte) -82);
          ic.field_c.a((br) this, false);
          return;
        } else {
          super.a((byte) -82);
          ic.field_c.a((br) this, false);
          return;
        }
    }

    final void a(int param0, qd param1) {
        param1.a(-1181, ((uo) this).field_l, ((uo) this).field_m, ((uo) this).field_i, ((uo) this).field_k);
        if (param0 != 0) {
            ((uo) this).field_k = 117;
        }
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        if (!param1) {
            ((uo) this).field_l = 93;
        }
    }

    final void a(int param0, int param1, int param2, int param3, byte param4, int param5) {
        super.a(param4 + -14, param0);
        ((uo) this).field_m = param3;
        if (param4 != 14) {
          ((uo) this).field_i = -59;
          ((uo) this).field_k = param2;
          ((uo) this).field_i = param1;
          ((uo) this).field_l = param5;
          return;
        } else {
          ((uo) this).field_k = param2;
          ((uo) this).field_i = param1;
          ((uo) this).field_l = param5;
          return;
        }
    }

    final static void a(int param0, int param1, int param2) {
        am.field_c = param1;
        if (param2 != 1633) {
            field_j = null;
            bp.field_r = param0;
            return;
        }
        bp.field_r = param0;
    }

    uo() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "All games";
    }
}
