/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vj {
    static String[] field_e;
    static ji field_a;
    static int[] field_d;
    bh field_c;
    private bh field_b;

    final boolean b(int param0) {
        if (param0 >= -1) {
            field_d = null;
        }
        return ((vj) this).field_c.field_b == ((vj) this).field_c ? true : false;
    }

    final void c(int param0) {
        bh var2 = null;
        int var3 = 0;
        Object var4 = null;
        L0: {
          var3 = client.field_A ? 1 : 0;
          if (param0 >= 104) {
            break L0;
          } else {
            var4 = null;
            ((vj) this).a((bh) null, 114);
            break L0;
          }
        }
        L1: while (true) {
          var2 = ((vj) this).field_c.field_b;
          if (((vj) this).field_c != var2) {
            var2.b((byte) 120);
            continue L1;
          } else {
            ((vj) this).field_b = null;
            return;
          }
        }
    }

    final bh d(int param0) {
        if (param0 >= -23) {
            return null;
        }
        bh var2 = ((vj) this).field_c.field_a;
        if (((vj) this).field_c == var2) {
            return null;
        }
        var2.b((byte) 115);
        return var2;
    }

    final void a(int param0, bh param1, vj param2) {
        bh var4 = ((vj) this).field_c.field_a;
        ((vj) this).field_c.field_a = param1.field_a;
        param1.field_a.field_b = ((vj) this).field_c;
        if (param0 > -95) {
            ((vj) this).field_b = null;
        }
        if (param1 != ((vj) this).field_c) {
            param1.field_a = param2.field_c.field_a;
            param1.field_a.field_b = param1;
            var4.field_b = param2.field_c;
            param2.field_c.field_a = var4;
        }
    }

    final bh a(int param0, bh param1) {
        bh var3 = null;
        if (param0 <= 1) {
            boolean discarded$0 = ((vj) this).b(-55);
        }
        if (param1 == null) {
            var3 = ((vj) this).field_c.field_b;
        } else {
            var3 = param1;
        }
        if (((vj) this).field_c == var3) {
            ((vj) this).field_b = null;
            return null;
        }
        ((vj) this).field_b = var3.field_b;
        return var3;
    }

    final static void a(boolean param0) {
        int var1 = 0;
        int var2 = client.field_A ? 1 : 0;
        cm.field_f.b(-30693);
        for (var1 = 0; var1 < 32; var1++) {
            sf.field_y[var1] = 0L;
        }
        for (var1 = 0; -33 < (var1 ^ -1); var1++) {
            jd.field_Ub[var1] = 0L;
        }
        vm.field_r = 0;
        if (!param0) {
            Object var3 = null;
            ck[] discarded$0 = vj.a((ck) null, -91);
        }
    }

    final bh c(boolean param0) {
        if (!param0) {
            field_d = null;
        }
        bh var2 = ((vj) this).field_b;
        if (!(var2 != ((vj) this).field_c)) {
            ((vj) this).field_b = null;
            return null;
        }
        ((vj) this).field_b = var2.field_a;
        return var2;
    }

    public static void b(byte param0) {
        if (param0 != 79) {
            return;
        }
        field_e = null;
        field_a = null;
        field_d = null;
    }

    final static ck[] a(ck param0, int param1) {
        if (param1 != 32169) {
            qm[] discarded$0 = vj.e(-16);
        }
        ck[] var3 = new ck[9];
        ck[] var2 = var3;
        var3[4] = param0;
        return var2;
    }

    final bh c(byte param0) {
        int var2 = -55 / ((param0 - -17) / 35);
        bh var3 = ((vj) this).field_c.field_b;
        if (!(var3 != ((vj) this).field_c)) {
            ((vj) this).field_b = null;
            return null;
        }
        ((vj) this).field_b = var3.field_b;
        return var3;
    }

    final void a(bh param0, int param1) {
        if (!(param0.field_a == null)) {
            param0.b((byte) 124);
        }
        param0.field_b = ((vj) this).field_c;
        param0.field_a = ((vj) this).field_c.field_a;
        if (param1 != 2777) {
            return;
        }
        param0.field_a.field_b = param0;
        param0.field_b.field_a = param0;
    }

    final bh d(boolean param0) {
        if (!param0) {
            return null;
        }
        bh var2 = ((vj) this).field_b;
        if (!(var2 != ((vj) this).field_c)) {
            ((vj) this).field_b = null;
            return null;
        }
        ((vj) this).field_b = var2.field_b;
        return var2;
    }

    final bh b(boolean param0) {
        if (!param0) {
            return null;
        }
        bh var2 = ((vj) this).field_c.field_a;
        if (((vj) this).field_c == var2) {
            ((vj) this).field_b = null;
            return null;
        }
        ((vj) this).field_b = var2.field_a;
        return var2;
    }

    final void b(bh param0, int param1) {
        if (!(param0.field_a == null)) {
            param0.b((byte) 115);
        }
        param0.field_b = ((vj) this).field_c.field_b;
        param0.field_a = ((vj) this).field_c;
        param0.field_a.field_b = param0;
        param0.field_b.field_a = param0;
        if (param1 != 7143) {
            bh discarded$0 = ((vj) this).d(false);
        }
    }

    final bh a(int param0) {
        bh var2 = ((vj) this).field_c.field_b;
        if (((vj) this).field_c == var2) {
            return null;
        }
        var2.b((byte) 108);
        if (param0 != 4) {
            return null;
        }
        return var2;
    }

    final int a(byte param0) {
        int var5 = client.field_A ? 1 : 0;
        int var2 = 0;
        int var3 = 60 % ((param0 - 13) / 50);
        bh var4 = ((vj) this).field_c.field_b;
        while (((vj) this).field_c != var4) {
            var2++;
            var4 = var4.field_b;
        }
        return var2;
    }

    public vj() {
        ((vj) this).field_c = new bh();
        ((vj) this).field_c.field_a = ((vj) this).field_c;
        ((vj) this).field_c.field_b = ((vj) this).field_c;
    }

    final static qm[] e(int param0) {
        if (param0 != -23521) {
            vj.a(false);
        }
        return new qm[]{nh.field_i, ta.field_a, ie.field_d, gf.field_e, ul.field_e, oi.field_d, nk.field_f, vk.field_d, rg.field_g, wg.field_a, de.field_U, qm.field_g, rf.field_k, gh.field_c};
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new int[8192];
    }
}
