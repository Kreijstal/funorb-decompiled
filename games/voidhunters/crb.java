/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class crb extends anb implements ntb, utb, ofa {
    static int[][] field_w;
    private int field_u;
    static bwa field_v;

    final int d(int param0) {
        if (param0 <= 42) {
            Object var3 = null;
            ((crb) this).a((faa) null, (byte) -116);
            return 3;
        }
        return 3;
    }

    public final void a(faa param0, int param1) {
        super.a(param0, param1);
    }

    public final void b(faa param0, int param1) {
        if (param1 > -109) {
            return;
        }
        super.b(param0, -115);
    }

    public final void a(tv param0, int param1) {
        super.a(param0, -45);
        if (param1 >= -19) {
            Object var4 = null;
            ((crb) this).a((faa) null, true);
        }
    }

    public final boolean a(byte param0, tv param1) {
        int var3 = 80 / ((22 - param0) / 59);
        return super.a((byte) 96, param1);
    }

    public final void a(faa param0, boolean param1) {
        super.a(param0, param1);
    }

    public static void l(int param0) {
        if (param0 != 3) {
            crb.a(123, true);
            field_w = null;
            field_v = null;
            return;
        }
        field_w = null;
        field_v = null;
    }

    public final void b(byte param0, tv param1) {
        crb var3 = (crb) (Object) param1;
        if (!(var3.field_u != var3.field_u)) {
            return;
        }
        var3.field_u = var3.field_u;
        super.b((byte) 94, param1);
        if (param0 <= 54) {
            field_v = null;
        }
    }

    final static void a(int param0, boolean param1) {
        if (param0 == 3) {
          L0: {
            if (wq.e((byte) 105)) {
              param1 = false;
              break L0;
            } else {
              break L0;
            }
          }
          nda.a(-128, param1);
          if (kea.field_b) {
            dma.e(hra.field_o.field_a.field_L, hra.field_o.field_a.field_K, hra.field_o.field_a.field_hb, hra.field_o.field_a.field_G);
            hra.field_o.field_a.b(param1, 35);
            uta.a(param1, 4095);
            return;
          } else {
            uta.a(param1, 4095);
            return;
          }
        } else {
          return;
        }
    }

    public final void a(faa param0, byte param1) {
        super.a(param0, (byte) -101);
        if (param1 > -91) {
            crb.l(-20);
        }
    }

    crb() {
        ((crb) this).field_u = 0;
        ((crb) this).d((byte) -50);
    }

    final void d(byte param0) {
        ogb.field_o = ogb.field_o + 1;
        ((crb) this).field_u = ogb.field_o;
        ikb.e((byte) -125);
        int var2 = -58 / ((param0 - -4) / 38);
    }

    crb(ml param0) {
        ((crb) this).field_u = 0;
        ((crb) this).d((byte) -50);
        ((crb) this).field_k = param0;
        ((crb) this).e((byte) 119);
    }

    static {
    }
}
