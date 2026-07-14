/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hm extends jc {
    static String[] field_J;
    static String field_M;
    static String field_L;
    static String field_N;
    private ta field_K;

    final static void d(byte param0) {
        int var2 = MinerDisturbance.field_ab;
        if (param0 != 22) {
            field_J = null;
        }
        if (!tk.b(127)) {
            // if_acmpeq L127
            if (!(!kf.field_d.field_b)) {
                ng.a((byte) 81);
                ll.field_a.b(param0 ^ 23, (fe) (Object) new bh(ll.field_a, od.field_k));
            }
            return;
        }
        boolean discarded$8 = ll.field_a.a(true, ql.field_c, cl.field_T, 0);
        ll.field_a.o(-256);
        while (mm.b((byte) 118)) {
            boolean discarded$9 = ll.field_a.a((byte) -65, lj.field_t, ud.field_c);
        }
        return;
    }

    final void b(int param0, fe param1) {
        if (!(param1 instanceof cc)) {
            throw new IllegalArgumentException();
        }
        if (param0 != 1) {
            ((hm) this).n(31);
        }
        cc var3 = (cc) (Object) param1;
        ((hm) this).field_K.a((pi) (Object) var3, 27862);
        var3.field_K = true;
        boolean discarded$0 = var3.a((fe) this, 127);
    }

    final void o(int param0) {
        int var4 = MinerDisturbance.field_ab;
        if (param0 != -256) {
            return;
        }
        hh var2 = new hh(((hm) this).field_K);
        cc var3 = (cc) (Object) var2.d(param0 + -19608);
        while (var3 != null) {
            if (var3.n(-4)) {
                var3.b(34);
            }
            var3 = (cc) (Object) var2.a(12537);
        }
        ((hm) this).field_I = (fe) (Object) ((hm) this).e((byte) 83);
    }

    public hm() {
        super(0, 0, od.field_n, ae.field_c, (ad) null, (rm) null);
        ((hm) this).field_K = new ta();
    }

    public static void c(byte param0) {
        field_M = null;
        field_N = null;
        if (param0 < 111) {
            field_J = null;
        }
        field_L = null;
        field_J = null;
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var7 = MinerDisturbance.field_ab;
        if (null != ((hm) this).field_A) {
            ((hm) this).field_A.a(12088, param1, (fe) this, param2, true);
        }
        hh var5 = new hh(((hm) this).field_K);
        if (param0 != 4) {
            ((hm) this).a(false);
        }
        fe var6 = (fe) (Object) var5.a(true);
        while (var6 != null) {
            var6.a((byte) 4, param1 + ((hm) this).field_u, ((hm) this).field_t + param2, param3);
            var6 = (fe) (Object) var5.c(-127);
        }
    }

    final static int f(byte param0) {
        if (param0 != -67) {
            field_N = null;
        }
        return mj.field_p;
    }

    final void n(int param0) {
        int var4 = MinerDisturbance.field_ab;
        hh var2 = new hh(((hm) this).field_K);
        cc var3 = (cc) (Object) var2.d(-19864);
        while (var3 != null) {
            var3.field_K = false;
            var3 = (cc) (Object) var2.a(12537);
        }
        if (param0 != 21974) {
            field_J = null;
        }
        ((hm) this).field_I = null;
    }

    final fe m(int param0) {
        hh var2 = null;
        cc var3 = null;
        int var4 = 0;
        L0: {
          var4 = MinerDisturbance.field_ab;
          if (param0 == -21923) {
            break L0;
          } else {
            field_J = null;
            break L0;
          }
        }
        var2 = new hh(((hm) this).field_K);
        var3 = (cc) (Object) var2.d(-19864);
        L1: while (true) {
          if (var3 != null) {
            if (!var3.field_K) {
              var3 = (cc) (Object) var2.a(12537);
              continue L1;
            } else {
              return var3.m(124);
            }
          } else {
            return null;
          }
        }
    }

    final void a(boolean param0) {
        int var4 = MinerDisturbance.field_ab;
        if (!param0) {
            field_L = null;
        }
        hh var2 = new hh(((hm) this).field_K);
        cc var3 = (cc) (Object) var2.d(-19864);
        while (var3 != null) {
            if (var3.a(false)) {
                var3.b(34);
            }
            var3 = (cc) (Object) var2.a(12537);
        }
    }

    final cc e(byte param0) {
        hh var2 = null;
        cc var3 = null;
        int var4 = 0;
        L0: {
          var4 = MinerDisturbance.field_ab;
          var2 = new hh(((hm) this).field_K);
          var3 = (cc) (Object) var2.d(-19864);
          if (param0 == 83) {
            break L0;
          } else {
            hm.c((byte) 111);
            break L0;
          }
        }
        L1: while (true) {
          if (var3 != null) {
            if (!var3.field_K) {
              var3 = (cc) (Object) var2.a(12537);
              continue L1;
            } else {
              return var3;
            }
          } else {
            return null;
          }
        }
    }

    final static gj a(String param0, boolean param1) {
        int var5 = 0;
        String var6 = null;
        gj var7 = null;
        int var8 = MinerDisturbance.field_ab;
        int var2 = param0.length();
        if (0 == var2) {
            return dh.field_d;
        }
        if ((var2 ^ -1) < -256) {
            return ec.field_d;
        }
        String[] var3 = h.a('.', param1, param0);
        if ((var3.length ^ -1) > -3) {
            return dh.field_d;
        }
        if (!param1) {
            hm.c((byte) 7);
        }
        String[] var4 = var3;
        for (var5 = 0; var4.length > var5; var5++) {
            var6 = var4[var5];
            var7 = rg.a(var6, true);
            if (var7 != null) {
                return var7;
            }
        }
        return ql.a(param1, var3[var3.length - 1]);
    }

    final static sj a(int param0, java.applet.Applet param1) {
        int var5 = 0;
        sj var6 = null;
        int var7 = MinerDisturbance.field_ab;
        String var2 = kn.a("jagex-last-login-method", (byte) 114, param1);
        if (!(var2 != null)) {
            return li.field_d;
        }
        int var3 = 121 % ((-63 - param0) / 48);
        sj[] var4 = im.b(111);
        for (var5 = 0; var5 < var4.length; var5++) {
            var6 = var4[var5];
            if (var6.a(2, var2)) {
                return var6;
            }
        }
        return li.field_d;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = "Waiting for sound effects";
        field_J = new String[]{"Throw caution to the wind and take some trusty dynamite into the mine. It's vital for making short work of stubborn boulders. Press <img=19> to plant and then beat a swift retreat. Does not work underwater.", "Throw caution to the wind and take some trusty dynamite into the Super Volcano. It's vital for making short work of stubborn boulders. Press <img=19> to plant and then beat a swift retreat. Does not work underwater."};
        field_L = "That name is not available";
        field_N = "Ranking: Boreal Brave";
    }
}
