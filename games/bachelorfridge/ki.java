/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ki extends ana {
    static af field_w;
    private iba field_v;

    private final void f(int param0) {
        hd var4 = (hd) (Object) al.a(103, ((ki) this).field_v.field_k);
        var4 = var4;
        aga discarded$0 = ((ki) this).field_v.field_l.a(19, ((ki) this).field_q.field_h);
        int[][] discarded$1 = ((ki) this).field_v.d((byte) 2);
        uea discarded$2 = new uea(((ki) this).field_q, ((ki) this).field_v.field_q, ((ki) this).field_v.field_r, gma.field_e[var4.field_q].field_a);
        ((ki) this).field_v.a(((ki) this).field_q.field_h, false);
    }

    ki(gj param0, iba param1) {
        super(param0, (bca) (Object) param1);
        try {
            ((ki) this).field_v = param1;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "ki.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean c(byte param0) {
        int var2 = 0;
        int fieldTemp$2 = ((ki) this).field_l - 1;
        ((ki) this).field_l = ((ki) this).field_l - 1;
        if (fieldTemp$2 <= -1) {
          if (-26 != ((ki) this).field_l) {
            return false;
          } else {
            this.f(-1);
            return false;
          }
        } else {
          var2 = -41 % ((71 - param0) / 47);
          this.d(-26);
          return true;
        }
    }

    final static void g(int param0) {
        gm.field_k = false;
        if (da.field_d != null) {
            da.field_d.f((byte) -118);
            return;
        }
    }

    private final void d(int param0) {
    }

    public static void e(int param0) {
        field_w = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = new af();
    }
}
