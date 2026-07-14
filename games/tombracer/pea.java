/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pea {
    static fp field_c;
    static String field_f;
    private od field_d;
    private ji field_e;
    private vj field_a;
    private int field_b;

    public static void a(byte param0) {
        Object var2 = null;
        if (param0 >= -92) {
          var2 = null;
          vb discarded$2 = pea.a((qia) null, -115);
          field_f = null;
          field_c = null;
          return;
        } else {
          field_f = null;
          field_c = null;
          return;
        }
    }

    final od a(int param0, long param1) {
        od var4 = null;
        if (param0 == 0) {
          var4 = (od) (Object) ((pea) this).field_e.a((byte) -104, param1);
          if (var4 != null) {
            ((pea) this).field_a.a(var4, (byte) -75);
            return var4;
          } else {
            return var4;
          }
        } else {
          return null;
        }
    }

    final static vb a(qia param0, int param1) {
        vb var2 = null;
        var2 = new vb(param0, (vg) (Object) param0);
        tna.field_e.b((byte) -68, (vg) (Object) var2);
        if (param1 != 1) {
          pea.a((byte) -106);
          kva.field_n.a((cg) (Object) param0);
          return var2;
        } else {
          kva.field_n.a((cg) (Object) param0);
          return var2;
        }
    }

    final void a(od param0, byte param1, long param2) {
        od var5 = null;
        if (param1 > 6) {
          if (0 == ((pea) this).field_b) {
            var5 = ((pea) this).field_a.c((byte) 127);
            var5.p(36);
            var5.c(-7975);
            if (((pea) this).field_d == var5) {
              var5 = ((pea) this).field_a.c((byte) 124);
              var5.p(75);
              var5.c(-7975);
              ((pea) this).field_e.a(param2, 126, (vg) (Object) param0);
              ((pea) this).field_a.a(param0, (byte) -77);
              return;
            } else {
              ((pea) this).field_e.a(param2, 126, (vg) (Object) param0);
              ((pea) this).field_a.a(param0, (byte) -77);
              return;
            }
          } else {
            ((pea) this).field_b = ((pea) this).field_b - 1;
            ((pea) this).field_e.a(param2, 126, (vg) (Object) param0);
            ((pea) this).field_a.a(param0, (byte) -77);
            return;
          }
        } else {
          return;
        }
    }

    pea(int param0) {
        ((pea) this).field_d = new od();
        ((pea) this).field_a = new vj();
        ((pea) this).field_b = param0;
        int var2 = 1;
        while (param0 > var2 + var2) {
            var2 = var2 + var2;
        }
        ((pea) this).field_e = new ji(var2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Hide lobby chat";
        field_c = new fp();
    }
}
