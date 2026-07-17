/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class j extends qg {
    private bk field_D;
    static String field_A;
    static ee field_C;
    static String field_F;
    static int[] field_E;

    final void a(int param0, int param1, int param2, int param3) {
        int var7 = Main.field_T;
        if (null != ((j) this).field_v) {
            ((j) this).field_v.a(param0, (lk) this, 11447, param1, true);
        }
        qd var5 = new qd(((j) this).field_D);
        if (param2 != -1) {
            field_A = null;
        }
        lk var6 = (lk) (Object) var5.c((byte) -13);
        while (var6 != null) {
            var6.a(((j) this).field_o + param0, param1 - -((j) this).field_i, -1, param3);
            var6 = (lk) (Object) var5.a((byte) 108);
        }
    }

    final lk a(boolean param0) {
        int var4 = Main.field_T;
        qd var2 = new qd(((j) this).field_D);
        qf var3 = (qf) (Object) var2.b((byte) -33);
        while (var3 != null) {
            if (var3.field_E) {
                return var3.i(-1);
            }
            var3 = (qf) (Object) var2.a(28869);
        }
        if (!param0) {
            return null;
        }
        field_A = null;
        return null;
    }

    final void l(int param0) {
        int var4 = Main.field_T;
        qd var2 = new qd(((j) this).field_D);
        if (param0 != -2054) {
            ((j) this).l(102);
        }
        qf var3 = (qf) (Object) var2.b((byte) -33);
        while (var3 != null) {
            if (!(!var3.a(true))) {
                var3.c(105);
            }
            var3 = (qf) (Object) var2.a(28869);
        }
        ((j) this).field_y = (lk) (Object) ((j) this).d((byte) 61);
    }

    final static void i() {
        gh.a(17, 31888);
    }

    public static void m(int param0) {
        if (param0 <= 37) {
            field_F = null;
        }
        field_F = null;
        field_A = null;
        field_C = null;
        field_E = null;
    }

    final qf d(byte param0) {
        qd var2 = null;
        qf var3 = null;
        int var4 = 0;
        L0: {
          var4 = Main.field_T;
          if (param0 >= 7) {
            break L0;
          } else {
            j.m(65);
            break L0;
          }
        }
        var2 = new qd(((j) this).field_D);
        var3 = (qf) (Object) var2.b((byte) -33);
        L1: while (true) {
          if (var3 != null) {
            if (var3.field_E) {
              return var3;
            } else {
              var3 = (qf) (Object) var2.a(28869);
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    final void b(lk param0, byte param1) {
        qf var3 = null;
        try {
            if (!(param0 instanceof qf)) {
                throw new IllegalArgumentException();
            }
            int var4 = 61 % ((41 - param1) / 33);
            var3 = (qf) (Object) param0;
            ((j) this).field_D.a(-121, (qb) (Object) var3);
            var3.field_E = true;
            boolean discarded$0 = var3.a(115, (lk) this);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "j.IA(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final void k(int param0) {
        int var5 = Main.field_T;
        qd var2 = new qd(((j) this).field_D);
        qf var3 = (qf) (Object) var2.b((byte) -33);
        while (var3 != null) {
            var3.field_E = false;
            var3 = (qf) (Object) var2.a(28869);
        }
        ((j) this).field_y = null;
        int var4 = 14 % ((param0 - 55) / 61);
    }

    public j() {
        super(0, 0, lb.field_g, kb.field_d, (ci) null, (pl) null);
        ((j) this).field_D = new bk();
    }

    final void b(boolean param0) {
        int var4 = Main.field_T;
        qd var2 = new qd(((j) this).field_D);
        if (!param0) {
            field_E = null;
        }
        qf var3 = (qf) (Object) var2.b((byte) -33);
        while (var3 != null) {
            if (!(!var3.o(928516712))) {
                var3.c(120);
            }
            var3 = (qf) (Object) var2.a(28869);
        }
    }

    final static void j() {
        r.field_p = false;
        ei.field_e = false;
        gh.a(-1, 31888);
        jc.field_P = tj.field_F;
        ei.field_d = tj.field_F;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = "Unpacking music";
        field_F = "No highscores";
        field_E = new int[8192];
    }
}
