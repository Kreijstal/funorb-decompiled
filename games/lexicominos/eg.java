/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg extends mg {
    private ng field_D;
    static String field_E;
    static String field_F;
    static sh field_C;

    final void h(int param0) {
        int var4 = Lexicominos.field_L ? 1 : 0;
        ta var2 = new ta(((eg) this).field_D);
        if (param0 != 0) {
            return;
        }
        al var3 = (al) (Object) var2.a(param0 ^ 250);
        while (var3 != null) {
            var3.field_D = false;
            var3 = (al) (Object) var2.c(param0 + -73);
        }
        ((eg) this).field_A = null;
    }

    final void f(boolean param0) {
        int var4 = Lexicominos.field_L ? 1 : 0;
        if (!param0) {
            w discarded$0 = ((eg) this).f(127);
        }
        ta var2 = new ta(((eg) this).field_D);
        al var3 = (al) (Object) var2.a(250);
        while (var3 != null) {
            if (!(!var3.f((byte) -77))) {
                var3.b((byte) -121);
            }
            var3 = (al) (Object) var2.c(-124);
        }
        ((eg) this).field_A = (w) (Object) ((eg) this).e(false);
    }

    final void g(boolean param0) {
        int var4 = Lexicominos.field_L ? 1 : 0;
        ta var2 = new ta(((eg) this).field_D);
        al var3 = (al) (Object) var2.a(250);
        if (param0) {
            eg.i(-88);
        }
        while (var3 != null) {
            if (var3.a((byte) 26)) {
                var3.b((byte) -122);
            }
            var3 = (al) (Object) var2.c(-69);
        }
    }

    public static void i(int param0) {
        field_C = null;
        field_E = null;
        field_F = null;
        if (param0 > -59) {
            field_F = null;
        }
    }

    final al e(boolean param0) {
        ta var2 = null;
        al var3 = null;
        int var4 = 0;
        var4 = Lexicominos.field_L ? 1 : 0;
        if (!param0) {
          var2 = new ta(((eg) this).field_D);
          var3 = (al) (Object) var2.a(250);
          L0: while (true) {
            if (var3 != null) {
              if (!var3.field_D) {
                var3 = (al) (Object) var2.c(-53);
                continue L0;
              } else {
                return var3;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var7 = Lexicominos.field_L ? 1 : 0;
        if (!(((eg) this).field_i == null)) {
            ((eg) this).field_i.a(param1, param2, true, (w) this, param0 + -3169);
        }
        if (param0 != -115) {
            return;
        }
        ta var5 = new ta(((eg) this).field_D);
        w var6 = (w) (Object) var5.b(0);
        while (var6 != null) {
            var6.a((byte) -115, ((eg) this).field_o + param1, param2 + ((eg) this).field_t, param3);
            var6 = (w) (Object) var5.e(31842);
        }
    }

    public eg() {
        super(0, 0, ql.field_O, kg.field_C, (rd) null, (vd) null);
        ((eg) this).field_D = new ng();
    }

    final w f(int param0) {
        int var4 = Lexicominos.field_L ? 1 : 0;
        ta var2 = new ta(((eg) this).field_D);
        al var3 = (al) (Object) var2.a(250);
        while (var3 != null) {
            if (!(!var3.field_D)) {
                return var3.e(-21374);
            }
            var3 = (al) (Object) var2.c(-87);
        }
        if (param0 == 0) {
            return null;
        }
        ((eg) this).f(true);
        return null;
    }

    final void a(int param0, w param1) {
        if (!(param1 instanceof al)) {
            throw new IllegalArgumentException();
        }
        al var3 = (al) (Object) param1;
        ((eg) this).field_D.a(param0 + 14484, (kd) (Object) var3);
        var3.field_D = true;
        boolean discarded$6 = var3.a((byte) 44, (w) this);
        if (param0 != -14579) {
            w discarded$7 = ((eg) this).f(18);
        }
    }

    final static vj a(int param0, int param1, sh param2, sh param3, int param4) {
        if (!nb.a(param1, param0, (byte) -122, param2)) {
            return null;
        }
        if (param4 <= 15) {
            eg.i(69);
        }
        return lj.a(22076, param3.a(param1, -27493, param0));
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = "to keep fullscreen or";
        field_E = "4 of 4";
    }
}
