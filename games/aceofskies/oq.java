/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oq extends rg implements dn {
    private mi field_J;
    static int field_K;

    oq(lt param0, lh param1) {
        super(param0, 200, 150);
        Object var5 = null;
        ea var6 = null;
        String var7 = null;
        ea var8 = null;
        String var9 = null;
        ea var10 = null;
        String var11 = null;
        ea var12 = null;
        String var13 = null;
        ea var14 = null;
        var5 = null;
        if (param1 == co.field_k) {
          var13 = ht.field_h;
          var14 = new ea(var13, (no) null);
          var14.field_q = ((oq) this).field_q;
          var14.field_h = 50;
          var14.field_n = 80;
          var14.field_p = 0;
          var14.field_e = (ir) (Object) new qm(oi.field_c, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
          ((oq) this).a(var14, 1);
          ((oq) this).field_J = this.a(ne.field_e, -83, (no) this);
        } else {
          if (param1 == ro.field_r) {
            var9 = tt.field_b;
            ((oq) this).field_n = ((oq) this).field_n + 10;
            if (uf.a(false)) {
              ((oq) this).field_n = ((oq) this).field_n + 20;
              var11 = bi.field_o;
              var12 = new ea(var11, (no) null);
              var12.field_q = ((oq) this).field_q;
              var12.field_h = 50;
              var12.field_n = 80;
              var12.field_p = 0;
              var12.field_e = (ir) (Object) new qm(oi.field_c, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((oq) this).a(var12, 1);
              ((oq) this).field_J = this.a(ne.field_e, -83, (no) this);
            } else {
              var10 = new ea(var9, (no) null);
              var10.field_q = ((oq) this).field_q;
              var10.field_h = 50;
              var10.field_n = 80;
              var10.field_p = 0;
              var10.field_e = (ir) (Object) new qm(oi.field_c, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((oq) this).a(var10, 1);
              ((oq) this).field_J = this.a(ne.field_e, -83, (no) this);
            }
          } else {
            if (un.field_o == param1) {
              var7 = ur.field_c;
              ((oq) this).field_n = ((oq) this).field_n + 30;
              var8 = new ea(var7, (no) null);
              var8.field_q = ((oq) this).field_q;
              var8.field_h = 50;
              var8.field_n = 80;
              var8.field_p = 0;
              var8.field_e = (ir) (Object) new qm(oi.field_c, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((oq) this).a(var8, 1);
              ((oq) this).field_J = this.a(ne.field_e, -83, (no) this);
            } else {
              var6 = new ea((String) var5, (no) null);
              var6.field_q = ((oq) this).field_q;
              var6.field_h = 50;
              var6.field_n = 80;
              var6.field_p = 0;
              var6.field_e = (ir) (Object) new qm(oi.field_c, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((oq) this).a(var6, 1);
              ((oq) this).field_J = this.a(ne.field_e, -83, (no) this);
            }
          }
        }
    }

    public final void a(int param0, mi param1, int param2, int param3, byte param4) {
        if (!(((oq) this).field_J != param1)) {
            this.g((byte) 22);
        }
        int var6 = 109 / ((param4 - -27) / 61);
    }

    private final void g(byte param0) {
        if (!(((oq) this).field_z)) {
            return;
        }
        if (param0 != 22) {
            return;
        }
        ((oq) this).field_z = false;
    }

    private final mi a(String param0, int param1, no param2) {
        mi var4 = new mi(param0, param2);
        var4.field_e = (ir) (Object) new qb();
        int var5 = ((oq) this).field_n + -6;
        ((oq) this).field_n = ((oq) this).field_n + 38;
        var4.a(30, 15, var5, -16 + (-14 + ((oq) this).field_q), (byte) 125);
        ((oq) this).a((ea) (Object) var4, 1);
        int var6 = -20 / ((param1 - 1) / 59);
        ((oq) this).a(false);
        return var4;
    }

    final static fr a(byte param0, String[] param1) {
        if (param0 >= -37) {
            return (fr) null;
        }
        fr var2 = new fr(false);
        var2.field_c = (String[]) param1;
        return var2;
    }

    static {
    }
}
