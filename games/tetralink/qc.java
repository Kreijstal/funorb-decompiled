/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qc extends nb implements dm {
    static int[] field_gb;
    static String field_fb;
    static ri[] field_bb;
    static String[] field_db;
    static hl field_eb;
    static String field_ab;
    private ae field_Y;
    static volatile int field_Z;
    static ke field_X;
    static bl field_cb;

    public static void e(byte param0) {
        field_db = null;
        if (param0 > -111) {
            field_cb = null;
        }
        field_fb = null;
        field_eb = null;
        field_cb = null;
        field_X = null;
        field_gb = null;
        field_bb = null;
        field_ab = null;
    }

    final static void a(boolean param0, int param1) {
        int var3 = TetraLink.field_J;
        v var4 = (v) (Object) tc.field_p.c(false);
        if (!param0) {
            return;
        }
        while (var4 != null) {
            fd.a(-74, param1, var4);
            var4 = (v) (Object) tc.field_p.a((byte) -70);
        }
    }

    private final ae a(int param0, dn param1, String param2) {
        ae var4 = new ae(param2, param1);
        var4.field_H = (kg) (Object) new uj();
        int var5 = ((qc) this).field_u - 6;
        ((qc) this).field_u = ((qc) this).field_u + 38;
        var4.a(30, var5, 57, 15, -16 + (-14 + ((qc) this).field_F));
        if (param0 != 6223) {
            field_fb = null;
        }
        ((qc) this).c((na) (Object) var4, 10);
        ((qc) this).b((byte) 55);
        return var4;
    }

    qc(pk param0, af param1) {
        super(param0, 200, 150);
        String var3 = null;
        na var4 = null;
        L0: {
          var3 = null;
          if (param1 == ka.field_l) {
            var3 = wn.field_v;
            break L0;
          } else {
            if (wg.field_d != param1) {
              if (ko.field_o != param1) {
                break L0;
              } else {
                var3 = km.field_p;
                ((qc) this).field_u = ((qc) this).field_u + 30;
                break L0;
              }
            } else {
              var3 = am.field_c;
              ((qc) this).field_u = ((qc) this).field_u + 10;
              if (!jo.b(0)) {
                break L0;
              } else {
                ((qc) this).field_u = ((qc) this).field_u + 20;
                var3 = w.field_s;
                break L0;
              }
            }
          }
        }
        var4 = new na(var3, (dn) null);
        var4.field_F = ((qc) this).field_F;
        var4.field_w = 50;
        var4.field_u = 80;
        var4.field_t = 0;
        var4.field_H = (kg) (Object) new al(dh.field_d, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
        ((qc) this).c(var4, 10);
        ((qc) this).field_Y = this.a(6223, (dn) this, d.field_a);
    }

    public final void a(byte param0, ae param1, int param2, int param3, int param4) {
        if (((qc) this).field_Y == param1) {
            this.f((byte) -113);
        }
        if (param0 >= 0) {
            qc.e((byte) 23);
        }
    }

    private final void f(byte param0) {
        if (!(((qc) this).field_K)) {
            return;
        }
        int var2 = 51 / ((param0 - -38) / 47);
        ((qc) this).field_K = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_fb = "That name is not available";
        field_Z = 0;
        field_ab = "More suggestions";
        field_gb = new int[8];
        for (var0 = 0; (var0 ^ -1) > -9; var0++) {
            field_gb[var0] = -1;
        }
        field_gb[7] = 0;
    }
}
