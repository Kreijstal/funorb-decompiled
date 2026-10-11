/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hk {
    private int field_f;
    static ec field_i;
    private int field_b;
    private sd field_g;
    private qc field_h;
    static ea[] field_a;
    static String field_d;
    static int field_e;
    static String field_c;

    private final void a(int param0, bl param1) {
        if (param0 >= -47) {
          return;
        }
        try {
          if (param1 != null) {
            param1.b(34);
            param1.a((byte) -120);
            this.field_b = this.field_b + param1.field_y;
          }
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "hk.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d(int param0) {
        field_c = null;
        int var1 = -41 / ((param0 - 63) / 61);
        field_d = null;
        field_a = null;
        field_i = null;
    }

    final static int[] b(int param0) {
        if (param0 != 0) {
          return (int[]) null;
        }
        return new int[8];
    }

    final static boolean a(int param0) {
        Object var1;
        int var2;
        tm var3;
        tm var4;
        tm var5;
        if (param0 != 27) {
          return true;
        }
        var1 = null;
        var2 = 0;
        if (!ec.field_c.e((byte) 123)) {
          var3 = (tm) (ec.field_c.b(81));
          if (var3.a(param0 ^ 19)) {
            ec.field_c.e(63854);
            vc.a(-8, cm.field_o, var3.field_s);
            var2 = 1;
          }
          var5 = (tm) (ec.field_c.b(param0 + 92));
          if (var5 != null &&
            var2 != 0) {
            var5.a(false);
          }
          if (!fm.a((byte) 95)) {
            return ak.a(-92);
          }
          fn.a(27, 228, 3);
          return ak.a(-92);
        }
        if (!ok.field_b.e((byte) 123)) {
          var4 = (tm) (ok.field_b.b(120));
          if (var4.a(param0 - 19)) {
            ok.field_b.e(63854);
            var2 = 1;
            vc.a(109, cm.field_o, var4.field_s);
          }
          var1 = (tm) (ok.field_b.b(96));
        }
        if (var1 != null &&
          var2 != 0) {
          ((tm) (var1)).a(false);
        }
        if (!fm.a((byte) 95)) {
          return ak.a(-92);
        }
        fn.a(27, 228, 3);
        return ak.a(-92);
    }

    final static void a(byte param0) {
        nb.field_i[oj.field_J].c(-1, mc.field_w);
        if (param0 >= -117) {
          field_e = 125;
        }
    }

    final Object a(long param0, byte param1) {
        Object var8 = null;
        oh var6 = null;
        bl var7 = (bl) (this.field_g.a(-94, param0));
        oh var6Lifetime1;
        if (var7 == null) {
          return null;
        }
        if (param1 < 56) {
          field_c = (String) null;
          var8 = var7.f(-47);
          if (var8 == null) {
            var7.b(34);
            var7.a((byte) -95);
            this.field_b = this.field_b + var7.field_y;
            return null;
          }
          if (!var7.h(0)) {
            this.field_h.a((byte) -37, var7);
            var7.field_p = 0L;
            return var8;
          }
          var6 = new oh(var8, var7.field_y);
          this.field_g.a(var7.field_d, true, var6);
          this.field_h.a((byte) -37, var6);
          ((bl) ((Object) var6)).field_p = 0L;
          var7.b(34);
          var7.a((byte) -121);
          return var8;
        }
        Object var9 = var7.f(-47);
        if (var9 == null) {
          var7.b(34);
          var7.a((byte) -95);
          this.field_b = this.field_b + var7.field_y;
          return null;
        }
        if (!var7.h(0)) {
          this.field_h.a((byte) -37, var7);
          var7.field_p = 0L;
          return var9;
        }
        var6Lifetime1 = new oh(var9, var7.field_y);
        this.field_g.a(var7.field_d, true, var6Lifetime1);
        this.field_h.a((byte) -37, var6Lifetime1);
        ((bl) ((Object) var6Lifetime1)).field_p = 0L;
        var7.b(34);
        var7.a((byte) -121);
        return var9;
    }

    private final void a(Object param0, int param1, int param2, long param3) {
        bl var6 = null;
        oh var6_ref = null;
        int var7 = MinerDisturbance.field_ab;
        try {
          if (this.field_f < param1) {
            throw new IllegalStateException();
          }
          this.a(-4924, param3);
          this.field_b = this.field_b - param1;
          while (this.field_b < 0) {
            var6 = (bl) (this.field_h.a(609));
            this.a(-127, var6);
          }
          var6_ref = new oh(param0, param1);
          this.field_g.a(param3, true, var6_ref);
          this.field_h.a((byte) -37, var6_ref);
          ((bl) ((Object) var6_ref)).field_p = (long)param2;
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "hk.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(int param0, long param1) {
        bl var5 = null;
        Object var4 = null;
        bl var5Lifetime1;
        if (param0 == -4924) {
          var5 = (bl) (this.field_g.a(param0 + 4856, param1));
          this.a(param0 + 4846, var5);
          return;
        }
        hk.b(34);
        var5Lifetime1 = (bl) (this.field_g.a(param0 + 4856, param1));
        this.a(param0 + 4846, var5Lifetime1);
    }

    final static void c(int param0) {
        if (param0 <= -94) {
          de.field_a.a((byte) -116, (fe) (new qd()));
          return;
        }
        field_c = (String) null;
        de.field_a.a((byte) -116, (fe) (new qd()));
    }

    private hk() throws Throwable {
        throw new Error();
    }

    final void a(int param0, long param1, Object param2) {
        if (param0 != 6565) {
          return;
        }
        try {
          this.a(param2, 1, 0, param1);
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "hk.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_i = new ec(3);
        field_c = "Go Back";
        field_e = 0;
        field_d = "Back";
    }
}
