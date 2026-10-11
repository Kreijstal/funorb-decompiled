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
        int var3 = 0;
        ga var2 = ma.field_a;
        int var3Lifetime1;
        var2.b((byte) -35, param1);
        var2.field_j = var2.field_j + 1;
        if (param0) {
          var3 = var2.field_j;
          var2.a(-116, 2);
          var2.a(fg.field_k, fg.field_k.length, 0, 123);
          var2.a(123, pb.field_h);
          var2.a(125, sc.field_f);
          var2.a(tg.field_a, tg.field_a.length, 0, 119);
          var2.e(113, var2.field_j - var3);
          return;
        }
        uo.b(true, -17);
        var3Lifetime1 = var2.field_j;
        var2.a(-116, 2);
        var2.a(fg.field_k, fg.field_k.length, 0, 123);
        var2.a(123, pb.field_h);
        var2.a(125, sc.field_f);
        var2.a(tg.field_a, tg.field_a.length, 0, 119);
        var2.e(113, var2.field_j - var3Lifetime1);
    }

    final void a(byte param0) {
        if (param0 <= -47) {
          super.a((byte) -82);
          ic.field_c.a((br) (this), false);
          return;
        }
        qd var3 = (qd) null;
        this.a(70, (qd) null);
        super.a((byte) -82);
        ic.field_c.a((br) (this), false);
    }

    final void a(int param0, qd param1) {
        try {
          param1.a(-1181, this.field_l, this.field_m, this.field_i, this.field_k);
          if (param0 != 0) {
            this.field_k = 117;
          }
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "uo.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        if (!param1) {
          this.field_l = 93;
        }
    }

    final void a(int param0, int param1, int param2, int param3, byte param4, int param5) {
        super.a(param4 - 14, param0);
        this.field_m = param3;
        if (param4 == 14) {
          this.field_k = param2;
          this.field_i = param1;
          this.field_l = param5;
          return;
        }
        this.field_i = -59;
        this.field_k = param2;
        this.field_i = param1;
        this.field_l = param5;
    }

    final static void a(int param0, int param1, int param2) {
        am.field_c = param1;
        if (param2 != 1633) {
          field_j = (String) null;
          bp.field_r = param0;
          return;
        }
        bp.field_r = param0;
    }

    uo() {
    }

    static {
        field_j = "All games";
    }
}
