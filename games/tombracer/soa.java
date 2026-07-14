/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class soa {
    private int field_b;
    private long field_c;
    private int field_e;
    private int[] field_d;
    private int[] field_a;

    final void a(byte param0, iqa param1) {
        ha var5 = param1.field_d;
        ha var3 = var5;
        var5.KA(((soa) this).field_d[0], ((soa) this).field_d[1], ((soa) this).field_d[2], ((soa) this).field_d[3]);
        var5.DA(((soa) this).field_a[0], ((soa) this).field_a[1], ((soa) this).field_a[2], ((soa) this).field_a[3]);
        int var4 = -13 / ((31 - param0) / 35);
        var3.f(((soa) this).field_b, ((soa) this).field_e);
        param1.field_f = ((soa) this).field_c;
    }

    final void a(int param0, iqa param1) {
        ha var3 = null;
        var3 = param1.field_d;
        var3.K(((soa) this).field_d);
        ((soa) this).field_a = var3.Y();
        ((soa) this).field_b = var3.i();
        ((soa) this).field_e = var3.XA();
        if (param0 <= 118) {
          ((soa) this).field_d = null;
          ((soa) this).field_c = param1.field_f;
          return;
        } else {
          ((soa) this).field_c = param1.field_f;
          return;
        }
    }

    soa() {
        ((soa) this).field_d = new int[4];
    }

    static {
    }
}
