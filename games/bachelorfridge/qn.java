/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qn extends kj {
    static cf field_i;
    private boolean field_f;
    static kv field_g;
    static String field_h;

    final static void a(int param0, nc param1, int param2) {
        int var5 = 0;
        int var6 = BachelorFridge.field_y;
        pf var7 = sja.field_fb;
        pf var8 = var7;
        var8.c(param0, (byte) 109);
        var8.field_g = var8.field_g + 1;
        int var4 = var8.field_g;
        var8.d(1, 0);
        var8.b(param1.field_j, -116);
        var8.b(param1.field_k, param2 ^ 8591);
        var8.b(param1.field_f, -113);
        var8.e(param1.field_h, -1615464796);
        var8.e(param1.field_l, param2 + -1615456104);
        var8.e(param1.field_i, -1615464796);
        var8.e(param1.field_g, -1615464796);
        var8.d(param1.field_m.length, param2 + 8692);
        for (var5 = 0; param1.field_m.length > var5; var5++) {
            var7.e(param1.field_m[var5], -1615464796);
        }
        if (param2 != -8692) {
            field_i = null;
            int discarded$0 = var8.a(var4, 19);
            var8.b((byte) -108, -var4 + var8.field_g);
            return;
        }
        int discarded$1 = var8.a(var4, 19);
        var8.b((byte) -108, -var4 + var8.field_g);
    }

    final void c(int param0) {
        if (param0 != -26450) {
            qn.a(-121, -48, 112, 111, 108, 25);
            ((qn) this).field_f = true;
            return;
        }
        ((qn) this).field_f = true;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = BachelorFridge.field_y;
        var6 = cr.a(an.field_q, param2, ha.field_n, 0);
        var7 = cr.a(an.field_q, param5, ha.field_n, 0);
        if (param4 > 28) {
          var8 = cr.a(eo.field_l, param0, pw.field_x, 0);
          var9 = cr.a(eo.field_l, param1, pw.field_x, 0);
          var10 = var6;
          L0: while (true) {
            if (var10 > var7) {
              return;
            } else {
              hba.a(param3, var8, tj.field_b[var10], 7, var9);
              var10++;
              continue L0;
            }
          }
        } else {
          qn.c((byte) -62);
          var8 = cr.a(eo.field_l, param0, pw.field_x, 0);
          var9 = cr.a(eo.field_l, param1, pw.field_x, 0);
          var10 = var6;
          L1: while (true) {
            if (var10 > var7) {
              return;
            } else {
              hba.a(param3, var8, tj.field_b[var10], 7, var9);
              var10++;
              continue L1;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        rla.field_k.e(param2 + 25, 10 + param0);
        if (param1 != 0) {
            ((qn) this).field_f = true;
        }
    }

    qn(gj param0, int param1, int param2) {
        super(param0, param1, param2);
    }

    final boolean b(int param0) {
        if (param0 <= 21) {
            field_i = null;
            return ((qn) this).field_f;
        }
        return ((qn) this).field_f;
    }

    public static void c(byte param0) {
        field_i = null;
        field_h = null;
        field_g = null;
        if (param0 < 105) {
            qn.a(61, -31, 58, -104, 0, -124);
        }
    }

    final void a(int param0, boolean param1, int param2) {
        if (!param1) {
            field_g = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new cf();
        field_h = "Try changing the following settings:  ";
    }
}
