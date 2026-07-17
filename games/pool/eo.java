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

    public static void f() {
        field_Rb = null;
        field_Xb = null;
    }

    eo() {
        super(0L, (vh) null);
    }

    final static void a(int param0, int param1, int param2) {
        oq var4 = null;
        kh var6 = null;
        kh var7 = null;
        if (param1 != ka.field_r) {
          var6 = (kh) (Object) lf.field_a.a((long)ka.field_r, false);
          var7 = var6;
          ka.field_r = param1;
          if (var7 == null) {
            var4 = ej.field_j;
            var4.b(false, param0);
            var4.a(3, false);
            var4.a(11, false);
            var4.a((byte) -81, param1);
            return;
          } else {
            var7.field_bc = null;
            var4 = ej.field_j;
            var4.b(false, param0);
            var4.a(3, false);
            var4.a(11, false);
            var4.a((byte) -81, param1);
            return;
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Vb = 50;
        field_Xb = new ml("email");
    }
}
