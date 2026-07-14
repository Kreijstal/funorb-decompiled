/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fna extends bca {
    static po field_q;

    final at a(int param0, gj param1) {
        Object var4 = null;
        if (param0 != 5) {
          var4 = null;
          at discarded$2 = ((fna) this).a(-17, (gj) null);
          return (at) (Object) new om(param1, (fna) this);
        } else {
          return (at) (Object) new om(param1, (fna) this);
        }
    }

    fna(int param0, nq param1) {
        super(param0, param1);
    }

    public static void c(boolean param0) {
        if (param0) {
            return;
        }
        field_q = null;
    }

    fna(lu param0) {
        super(param0);
        ((fna) this).field_k = param0.e((byte) 116);
        ((fna) this).field_o = new eaa();
        int var2 = param0.b(16711935);
        while (true) {
            var2--;
            if (0 > var2) {
                break;
            }
            ((fna) this).field_o.a((bw) (Object) dca.a((byte) 102, param0), true);
        }
    }

    final void a(op param0, int param1) {
        int var5 = BachelorFridge.field_y;
        int var3 = 79 % ((param1 - 12) / 35);
        aga discarded$0 = ((fna) this).field_l.a(73, param0);
        cn var4 = (cn) (Object) ((fna) this).field_o.b((byte) 90);
        while (var4 != null) {
            var4.a((aga) null, param0, 12);
            var4 = (cn) (Object) ((fna) this).field_o.c(0);
        }
    }

    static {
    }
}
