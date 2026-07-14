/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hr extends or {
    static lt field_e;
    static pa[][] field_d;

    private hr() throws Throwable {
        throw new Error();
    }

    public static void a(boolean param0) {
        field_d = (pa[][]) null;
        if (!param0) {
            return;
        }
        field_e = null;
    }

    abstract go a(int param0);

    final static void a(boolean param0, String param1, boolean param2, byte param3) {
        String var5 = null;
        gg.b((byte) -98);
        vn.field_f.e((byte) 74);
        vr.field_b = new ce(se.field_a, (String) null, nf.field_a, param2, param0);
        ak.field_d = new ad(vn.field_f, (ea) (Object) vr.field_b);
        if (param3 != -61) {
          var5 = (String) null;
          hr.a(0.47493258118629456f, 21, false, (String) null);
          vn.field_f.a((ea) (Object) ak.field_d, 0);
          return;
        } else {
          vn.field_f.a((ea) (Object) ak.field_d, 0);
          return;
        }
    }

    final static ha a(gk param0, d param1, int param2, int param3, java.awt.Canvas param4, int param5) {
        java.awt.Dimension var9 = null;
        int var6 = 123 % ((param2 - 23) / 53);
        int var7 = 0;
        int var8 = 0;
        if (param4 != null) {
            var9 = param4.getSize();
            var8 = ((java.awt.Dimension) var9).height;
            var7 = ((java.awt.Dimension) var9).width;
        }
        return ha.a(var7, param0, param5, param4, param3, 5, var8, param1);
    }

    final static void a(float param0, int param1, boolean param2, String param3) {
        java.awt.Canvas var5 = null;
        if (param1 == 0) {
          if (null == fu.field_d) {
            fu.field_d = new ng(vn.field_f, uf.field_e);
            vn.field_f.a((ea) (Object) fu.field_d, 0);
            fu.field_d.a(param2, -111, param3, param0);
            vp.a();
            si.a(true, -32106);
            return;
          } else {
            fu.field_d.a(param2, -111, param3, param0);
            vp.a();
            si.a(true, -32106);
            return;
          }
        } else {
          var5 = (java.awt.Canvas) null;
          ha discarded$1 = hr.a((gk) null, (d) null, -124, -29, (java.awt.Canvas) null, -9);
          if (null != fu.field_d) {
            fu.field_d.a(param2, -111, param3, param0);
            vp.a();
            si.a(true, -32106);
            return;
          } else {
            fu.field_d = new ng(vn.field_f, uf.field_e);
            vn.field_f.a((ea) (Object) fu.field_d, 0);
            fu.field_d.a(param2, -111, param3, param0);
            vp.a();
            si.a(true, -32106);
            return;
          }
        }
    }

    static {
    }
}
