/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gp extends ana {
    static String field_y;
    static String field_z;
    static String field_v;
    static int field_x;
    private bt field_w;
    static int field_A;
    static String[] field_B;

    final boolean c(byte param0) {
        int var2 = 0;
        int fieldTemp$6 = ((gp) this).field_l - 1;
        ((gp) this).field_l = ((gp) this).field_l - 1;
        if (-1 >= fieldTemp$6) {
          if (-26 == ((gp) this).field_l) {
            jja.a(256, -1, 52);
            int discarded$7 = 44;
            this.e();
            return false;
          } else {
            return false;
          }
        } else {
          var2 = 89 % ((param0 - 71) / 47);
          int discarded$8 = 99;
          this.f();
          return true;
        }
    }

    public static void d(int param0) {
        field_y = null;
        field_z = null;
        field_B = null;
        field_v = null;
        if (param0 != -13837) {
            Object var2 = null;
            gp.b(-16, (String) null);
        }
    }

    private final void e() {
        ad var4 = null;
        int var5 = BachelorFridge.field_y;
        aga var2 = ((gp) this).field_w.field_l.a(76, ((gp) this).field_q.field_h);
        if (!(!var2.i(69))) {
            return;
        }
        iv var3 = (iv) (Object) ((gp) this).field_w.field_o.b((byte) 90);
        oha discarded$6 = al.a(107, ((gp) this).field_w.field_k);
        while (var3 != null) {
            var3.a(var2, ((gp) this).field_q.field_h, 12);
            var4 = var3.field_h.a(-27449, ((gp) this).field_q);
            var4.b(-1, 18);
            var4.a(24831, 110, kna.field_g[44]);
            var3 = (iv) (Object) ((gp) this).field_w.field_o.c(0);
        }
    }

    final static void b(int param0, String param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
            var2_int = mk.field_p;
            var3 = gd.field_m;
            var4 = qs.field_m.field_jb.b(param1, 500);
            var5 = 6 + qs.field_m.field_jb.c(param1, 500);
            var6 = 2 + rg.field_h * var4;
            var7 = oi.a(12, var5, var2_int, -21264);
            if (param0 != -25942) {
                gp.d(20);
            }
            var8 = nga.a(var6, var3, (byte) 126, 20);
            dg.a(var7, var8, var5, var6, 0);
            dg.c(1 + var7, 1 + var8, var5 - 2, var6 - 2, 16777088);
            int discarded$0 = qs.field_m.field_jb.a(param1, 3 + var7, -qs.field_m.field_jb.field_u + (df.field_r + 1 + var8), 500, 1000, 0, -1, 0, 0, rg.field_h);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "gp.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    gp(gj param0, bt param1) {
        super(param0, (bca) (Object) param1);
        try {
            ((gp) this).field_w = param1;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "gp.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void f() {
        int var2 = 0;
    }

    final static void a(boolean param0, int param1) {
        if (it.field_l != null) {
          if (it.field_l.length < param1) {
            it.field_l = new int[param1];
            return;
          } else {
            return;
          }
        } else {
          it.field_l = new int[param1];
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "Players";
        field_y = "Please enter your date of birth to enable chat:";
        field_B = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_v = "Player Name: ";
    }
}
