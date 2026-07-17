/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fm extends kn {
    static ci field_T;
    static String field_P;
    private jc field_N;
    static int field_S;
    static String field_U;
    static String field_Q;
    static String[] field_R;
    static String field_O;
    static int field_W;
    static boolean field_V;

    final eh k(int param0) {
        qj var2 = null;
        eh var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = Chess.field_G;
        var2 = new qj(((fm) this).field_N);
        var3 = (eh) (Object) var2.c(-20229);
        var4 = 115 / ((param0 - -77) / 42);
        L0: while (true) {
          if (var3 != null) {
            if (var3.field_P) {
              return var3;
            } else {
              var3 = (eh) (Object) var2.b(8922);
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var7 = Chess.field_G;
        if (((fm) this).field_n != null) {
            ((fm) this).field_n.a((byte) 66, param3, param0, true, (mf) this);
        }
        qj var5 = new qj(((fm) this).field_N);
        if (param2 >= -80) {
            mf discarded$0 = ((fm) this).a(55);
        }
        mf var6 = (mf) (Object) var5.a((byte) 121);
        while (var6 != null) {
            var6.a(param0 - -((fm) this).field_r, param1, -95, ((fm) this).field_u + param3);
            var6 = (mf) (Object) var5.b((byte) -121);
        }
    }

    final void i(int param0) {
        int var4 = Chess.field_G;
        qj var2 = new qj(((fm) this).field_N);
        if (param0 != 0) {
            mf discarded$0 = ((fm) this).a(-52);
        }
        eh var3 = (eh) (Object) var2.c(-20229);
        while (var3 != null) {
            var3.field_P = false;
            var3 = (eh) (Object) var2.b(8922);
        }
        ((fm) this).field_M = null;
    }

    final void b(mf param0, byte param1) {
        if (!(param0 instanceof eh)) {
            throw new IllegalArgumentException();
        }
        eh var3 = (eh) (Object) param0;
        ((fm) this).field_N.a((o) (Object) var3, 91);
        var3.field_P = true;
        if (param1 >= -8) {
            return;
        }
        try {
            boolean discarded$0 = var3.a(0, (mf) this);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "fm.Q(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final void j(int param0) {
        int var4 = Chess.field_G;
        qj var2 = new qj(((fm) this).field_N);
        eh var3 = (eh) (Object) var2.c(-20229);
        while (var3 != null) {
            if (var3.a(param0 + -10812)) {
                var3.c(-2193);
            }
            var3 = (eh) (Object) var2.b(8922);
        }
        if (param0 != 10907) {
            ((fm) this).i(35);
        }
    }

    public fm() {
        super(0, 0, hk.field_I, e.field_O, (jm) null, (rg) null);
        ((fm) this).field_N = new jc();
    }

    final mf a(int param0) {
        qj var2 = null;
        eh var3 = null;
        int var4 = 0;
        var4 = Chess.field_G;
        var2 = new qj(((fm) this).field_N);
        var3 = (eh) (Object) var2.c(-20229);
        if (param0 == 0) {
          L0: while (true) {
            if (var3 != null) {
              if (!var3.field_P) {
                var3 = (eh) (Object) var2.b(param0 ^ 8922);
                continue L0;
              } else {
                return var3.e((byte) 19);
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final void f(byte param0) {
        int var5 = Chess.field_G;
        int var3 = -125 / ((-55 - param0) / 55);
        qj var2 = new qj(((fm) this).field_N);
        eh var4 = (eh) (Object) var2.c(-20229);
        while (var4 != null) {
            if (var4.g((byte) -73)) {
                var4.c(-2193);
            }
            var4 = (eh) (Object) var2.b(8922);
        }
        ((fm) this).field_M = (mf) (Object) ((fm) this).k(-122);
    }

    final static void a(ci param0, int param1) {
        ci var4 = null;
        ci var5 = null;
        int var3 = Chess.field_G;
        if (param1 >= -59) {
            return;
        }
        try {
            var4 = (ci) (Object) param0.field_I.g(-18110);
            ci var2 = var4;
            while (var4 != null) {
                var4.field_pb = 0;
                var4.field_vb = 0;
                var4.field_N = 0;
                var4.field_V = 0;
                var5 = (ci) (Object) param0.field_I.a((byte) -102);
                var5 = var5;
            }
            param0.field_N = 0;
            param0.field_vb = 0;
            param0.field_pb = 0;
            param0.field_V = 0;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "fm.P(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    public static void l(int param0) {
        field_T = null;
        field_O = null;
        field_R = null;
        int var1 = -117;
        field_P = null;
        field_Q = null;
        field_U = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_U = "Show chat (1 unread message)";
        field_P = "Type your age in years";
        field_S = -1;
        field_Q = "On";
        field_O = "%W";
    }
}
