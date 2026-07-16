/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class w extends wd implements m {
    private rh field_S;
    static int field_T;
    static double field_U;
    static ce field_V;

    public static void b(boolean param0) {
        if (!param0) {
            field_U = 0.7922077777637492;
            field_V = null;
            return;
        }
        field_V = null;
    }

    private final rh a(int param0, String param1, tg param2) {
        rh var4 = null;
        int var5 = 0;
        if (param0 != 23879) {
          return null;
        } else {
          var4 = new rh(param1, param2);
          var4.field_y = (t) (Object) new dc();
          var5 = ((w) this).field_u + -6;
          ((w) this).field_u = ((w) this).field_u + 38;
          var4.a(30, -3050, var5, -30 + ((w) this).field_x, 15);
          ((w) this).a(false, (al) (Object) var4);
          ((w) this).g(110);
          return var4;
        }
    }

    public final void a(rh param0, int param1, int param2, int param3, int param4) {
        if (param4 != -27322) {
            return;
        }
        if (!(param0 != ((w) this).field_S)) {
            this.r(0);
        }
    }

    w(vl param0, mk param1) {
        super(param0, 200, 150);
        String var5 = null;
        al var6 = null;
        String var7 = null;
        al var8 = null;
        Object var9 = null;
        al var10 = null;
        String var11 = null;
        al var12 = null;
        String var13 = null;
        al var14 = null;
        var9 = null;
        if (param1 == jf.field_l) {
          var13 = bf.field_c;
          var14 = new al(var13, (tg) null);
          var14.field_m = 50;
          var14.field_x = ((w) this).field_x;
          var14.field_u = 80;
          var14.field_p = 0;
          var14.field_y = (t) (Object) new ic(fk.field_a, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
          ((w) this).a(false, var14);
          ((w) this).field_S = this.a(23879, me.field_k, (tg) this);
          return;
        } else {
          if (param1 != te.field_b) {
            if (param1 == ej.field_e) {
              ((w) this).field_u = ((w) this).field_u + 30;
              var11 = cg.field_e;
              var12 = new al(var11, (tg) null);
              var12.field_m = 50;
              var12.field_x = ((w) this).field_x;
              var12.field_u = 80;
              var12.field_p = 0;
              var12.field_y = (t) (Object) new ic(fk.field_a, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((w) this).a(false, var12);
              ((w) this).field_S = this.a(23879, me.field_k, (tg) this);
              return;
            } else {
              var10 = new al((String) var9, (tg) null);
              var10.field_m = 50;
              var10.field_x = ((w) this).field_x;
              var10.field_u = 80;
              var10.field_p = 0;
              var10.field_y = (t) (Object) new ic(fk.field_a, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((w) this).a(false, var10);
              ((w) this).field_S = this.a(23879, me.field_k, (tg) this);
              return;
            }
          } else {
            var5 = fj.field_O;
            ((w) this).field_u = ((w) this).field_u + 10;
            if (rf.b(120)) {
              ((w) this).field_u = ((w) this).field_u + 20;
              var7 = nb.field_A;
              var8 = new al(var7, (tg) null);
              var8.field_m = 50;
              var8.field_x = ((w) this).field_x;
              var8.field_u = 80;
              var8.field_p = 0;
              var8.field_y = (t) (Object) new ic(fk.field_a, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((w) this).a(false, var8);
              ((w) this).field_S = this.a(23879, me.field_k, (tg) this);
              return;
            } else {
              var6 = new al(var5, (tg) null);
              var6.field_m = 50;
              var6.field_x = ((w) this).field_x;
              var6.field_u = 80;
              var6.field_p = 0;
              var6.field_y = (t) (Object) new ic(fk.field_a, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((w) this).a(false, var6);
              ((w) this).field_S = this.a(23879, me.field_k, (tg) this);
              return;
            }
          }
        }
    }

    private final void r(int param0) {
        if (!(((w) this).field_E)) {
            return;
        }
        ((w) this).field_E = false;
        if (param0 != 0) {
            Object var3 = null;
            ((w) this).a((rh) null, -7, -55, -15, 33);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_U = 0.0;
    }
}
