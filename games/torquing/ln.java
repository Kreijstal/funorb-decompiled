/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ln extends jh {
    static int field_F;
    private ei field_E;
    static t[] field_H;
    static int field_D;
    static int field_G;

    final static void a(int param0, int param1, uf[] param2, byte param3) {
        uf var4 = null;
        try {
            var4 = param2[param2.length + -1];
            var4.a(param0, param1, 86);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "ln.NA(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + -58 + 41);
        }
    }

    final void h(int param0) {
        int var4 = Torquing.field_u;
        re var2 = new re(((ln) this).field_E);
        bb var3 = (bb) (Object) var2.a((byte) 79);
        while (var3 != null) {
            var3.field_D = false;
            var3 = (bb) (Object) var2.b(true);
        }
        if (param0 < 0) {
            return;
        }
        ((ln) this).field_C = null;
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var7 = Torquing.field_u;
        if (null != ((ln) this).field_q) {
            ((ln) this).field_q.a(114, param2, param3, true, (gm) this);
        }
        re var5 = new re(((ln) this).field_E);
        if (param1 > -7) {
            return;
        }
        gm var6 = (gm) (Object) var5.a(17514);
        while (var6 != null) {
            var6.a(param0, (byte) -58, param2 + ((ln) this).field_k, param3 - -((ln) this).field_w);
            var6 = (gm) (Object) var5.a(true);
        }
    }

    final void g(byte param0) {
        int var4 = Torquing.field_u;
        re var2 = new re(((ln) this).field_E);
        if (param0 >= -63) {
            field_G = -105;
        }
        bb var3 = (bb) (Object) var2.a((byte) 95);
        while (var3 != null) {
            if (!(!var3.h(-7))) {
                var3.f(0);
            }
            var3 = (bb) (Object) var2.b(true);
        }
        ((ln) this).field_C = (gm) (Object) ((ln) this).a(0);
    }

    final static int a(int param0, int param1, int param2, int param3) {
        if (param3 < 68) {
            return -102;
        }
        return param2 < param1 ? param1 : param0 < param2 ? param0 : param2;
    }

    public static void h(byte param0) {
        field_H = null;
    }

    final void a(gm param0, byte param1) {
        bb var3 = null;
        try {
            if (!(param0 instanceof bb)) {
                throw new IllegalArgumentException();
            }
            var3 = (bb) (Object) param0;
            ((ln) this).field_E.b((byte) 68, (q) (Object) var3);
            var3.field_D = true;
            int var4 = 107 % ((param1 - 18) / 61);
            boolean discarded$0 = var3.a((gm) this, false);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "ln.QA(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    public ln() {
        super(0, 0, qj.field_f, kn.field_h, (el) null, (ca) null);
        ((ln) this).field_E = new ei();
    }

    final void b(boolean param0) {
        int var4 = Torquing.field_u;
        re var2 = new re(((ln) this).field_E);
        if (param0) {
            ((ln) this).field_E = null;
        }
        bb var3 = (bb) (Object) var2.a((byte) 68);
        while (var3 != null) {
            if (var3.a((byte) 122)) {
                var3.f(0);
            }
            var3 = (bb) (Object) var2.b(true);
        }
    }

    final bb a(int param0) {
        int var4 = Torquing.field_u;
        re var2 = new re(((ln) this).field_E);
        bb var3 = (bb) (Object) var2.a((byte) 66);
        while (var3 != null) {
            if (var3.field_D) {
                return var3;
            }
            var3 = (bb) (Object) var2.b(true);
        }
        if (param0 == 0) {
            return null;
        }
        field_D = -119;
        return null;
    }

    final static void a(byte param0, int param1) {
        int var2 = -73 % ((33 - param0) / 38);
        oe.a(true, param1, false);
    }

    final gm a(boolean param0) {
        re var2 = null;
        bb var3 = null;
        int var4 = 0;
        L0: {
          var4 = Torquing.field_u;
          if (param0) {
            break L0;
          } else {
            ((ln) this).field_E = null;
            break L0;
          }
        }
        var2 = new re(((ln) this).field_E);
        var3 = (bb) (Object) var2.a((byte) 99);
        L1: while (true) {
          if (var3 != null) {
            if (!var3.field_D) {
              var3 = (bb) (Object) var2.b(true);
              continue L1;
            } else {
              return var3.a(0);
            }
          } else {
            return null;
          }
        }
    }

    static {
    }
}
