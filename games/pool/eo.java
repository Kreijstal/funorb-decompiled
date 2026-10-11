/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eo extends vh {
    String field_Yb;
    static String field_Rb;
    String field_Zb;
    vh field_Ob;
    String field_Sb;
    int field_Mb;
    static int field_Qb;
    vh field_Nb;
    static ml field_Xb;
    static int field_Vb;
    String field_Wb;
    vh field_Pb;
    static int field_Ub;
    static int field_Lb;
    static int field_Tb;

    public static void f(byte param0) {
        field_Rb = null;
        if (param0 != -105) {
          field_Vb = 60;
          field_Xb = null;
          return;
        }
        field_Xb = null;
    }

    eo() {
        super(0L, (vh) null);
    }

    final static void a(int param0, int param1, int param2) {
        kh var6 = null;
        kh var7 = null;
        oq var4 = null;
        oq var4Lifetime1;
        if (param1 != ka.field_r) {
          var6 = (kh) (lf.field_a.a((long)ka.field_r, false));
          var7 = var6;
          ka.field_r = param1;
          if (var7 != null) {
            var7.field_bc = null;
          } else {
            var4 = ej.field_j;
            var4.b(false, param0);
            var4.a(3, false);
            var4.a(11, false);
            var4.a((byte) -81, param1);
            if (param2 != 11) {
              field_Rb = (String) null;
              return;
            }
            return;
          }
          var4Lifetime1 = ej.field_j;
          var4Lifetime1.b(false, param0);
          var4Lifetime1.a(3, false);
          var4Lifetime1.a(11, false);
          var4Lifetime1.a((byte) -81, param1);
          if (param2 != 11) {
            field_Rb = (String) null;
            return;
          }
          return;
        }
        if (param2 == 11) {
          return;
        }
        field_Rb = (String) null;
    }

    static {
        field_Vb = 50;
        field_Xb = new ml("email");
    }
}
