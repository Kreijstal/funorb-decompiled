/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bi {
    private String[] field_b;
    static tf[] field_g;
    static we field_d;
    int field_f;
    private int field_c;
    private String field_a;
    private int field_e;

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = Pixelate.field_H ? 1 : 0;
        t.a(((bi) this).field_f, ((bi) this).field_e, 250, ((bi) this).field_c, 12, 0, 180);
        t.e(((bi) this).field_f, ((bi) this).field_e, 250, ((bi) this).field_c, 12, 0);
        var2 = 4 + ((bi) this).field_e - -8;
        if (!param0) {
          L0: {
            if (null != ((bi) this).field_a) {
              hk.field_d.b(((bi) this).field_a, ((bi) this).field_f - -125, var2 + pe.field_c, 16776960, 0);
              var2 = var2 + (8 + pe.field_c);
              break L0;
            } else {
              break L0;
            }
          }
          var3 = 0;
          L1: while (true) {
            if (var3 >= ((bi) this).field_b.length) {
              return;
            } else {
              var2 = var2 + pe.field_c * hk.field_d.a(((bi) this).field_b[var3], 8 + ((bi) this).field_f, var2, 234, ((bi) this).field_c, 16777215, 0, 0, 0, pe.field_c);
              var2 += 8;
              var3++;
              continue L1;
            }
          }
        } else {
          L2: {
            bi.a(1);
            if (null != ((bi) this).field_a) {
              hk.field_d.b(((bi) this).field_a, ((bi) this).field_f - -125, var2 + pe.field_c, 16776960, 0);
              var2 = var2 + (8 + pe.field_c);
              break L2;
            } else {
              break L2;
            }
          }
          var3 = 0;
          L3: while (true) {
            if (var3 >= ((bi) this).field_b.length) {
              return;
            } else {
              var2 = var2 + pe.field_c * hk.field_d.a(((bi) this).field_b[var3], 8 + ((bi) this).field_f, var2, 234, ((bi) this).field_c, 16777215, 0, 0, 0, pe.field_c);
              var2 += 8;
              var3++;
              continue L3;
            }
          }
        }
    }

    final static tf a(String param0, String param1, fm param2, byte param3) {
        int var4 = param2.a(127, param0);
        if (param3 >= -19) {
            tg discarded$0 = bi.b(25);
        }
        int var5 = param2.a((byte) -105, param1, var4);
        return dk.a(var5, param2, var4, -1);
    }

    public static void a(int param0) {
        field_g = null;
        if (param0 != -8) {
            field_g = null;
            field_d = null;
            return;
        }
        field_d = null;
    }

    final static tg b(int param0) {
        if (param0 != 4) {
            bi.a(-128);
            if (!(null != ll.field_c)) {
                ll.field_c = new tg();
                ll.field_c.a(4, he.field_d);
                ll.field_c.field_p = 5;
                ll.field_c.field_d = 7697781;
                ll.field_c.field_q = 14;
                ll.field_c.field_e = 2763306;
                ll.field_c.field_o = 0;
                ll.field_c.field_g = 4;
                ll.field_c.field_n = 6;
                ll.field_c.field_m = ep.field_b;
            }
            return ll.field_c;
        }
        if (!(null != ll.field_c)) {
            ll.field_c = new tg();
            ll.field_c.a(4, he.field_d);
            ll.field_c.field_p = 5;
            ll.field_c.field_d = 7697781;
            ll.field_c.field_q = 14;
            ll.field_c.field_e = 2763306;
            ll.field_c.field_o = 0;
            ll.field_c.field_g = 4;
            ll.field_c.field_n = 6;
            ll.field_c.field_m = ep.field_b;
        }
        return ll.field_c;
    }

    bi(String param0, String[] param1, boolean param2) {
        int var4 = 0;
        ((bi) this).field_a = param0;
        ((bi) this).field_c = 16;
        ((bi) this).field_b = param1;
        if (null != ((bi) this).field_a) {
            ((bi) this).field_c = ((bi) this).field_c + (pe.field_c + 8);
        }
        for (var4 = 0; ((bi) this).field_b.length > var4; var4++) {
            ((bi) this).field_c = ((bi) this).field_c + pe.field_c * hk.field_d.b(((bi) this).field_b[var4], 234);
            ((bi) this).field_c = ((bi) this).field_c + 8;
        }
        ((bi) this).field_e = 20;
        ((bi) this).field_f = -250;
        if (param2) {
            ((bi) this).field_e = ((bi) this).field_e + 50;
        }
    }

    static {
    }
}
