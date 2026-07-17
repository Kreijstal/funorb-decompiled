/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jga extends ana {
    static be[] field_y;
    static kia field_z;
    private taa field_x;
    static String field_v;
    private naa field_w;

    final boolean c(byte param0) {
        int var2 = 0;
        var2 = -89 % ((71 - param0) / 47);
        if (!((jga) this).field_m.a((byte) -106)) {
          if (!((jga) this).field_x.a((byte) -106)) {
            int fieldTemp$2 = ((jga) this).field_l - 1;
            ((jga) this).field_l = ((jga) this).field_l - 1;
            if (0 <= fieldTemp$2) {
              if (25 == ((jga) this).field_l) {
                this.c(false);
                return false;
              } else {
                return false;
              }
            } else {
              this.b(false);
              return true;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    jga(gj param0, naa param1) {
        super(param0, (bca) (Object) param1);
        try {
            ((jga) this).field_w = param1;
            ((jga) this).field_x = new taa(((jga) this).field_q, ((jga) this).field_w.field_q, ((jga) this).field_w.field_t);
            ((jga) this).a(27799, (at) (Object) ((jga) this).field_x);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "jga.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public static void d(int param0) {
        field_y = null;
        field_z = null;
        field_v = null;
    }

    private final void c(boolean param0) {
        int var2 = 0;
        aj var3 = null;
        haa var4 = null;
        int var5 = BachelorFridge.field_y;
        for (var2 = 0; ((jga) this).field_w.field_u > var2; var2++) {
            var3 = ((jga) this).field_w.field_s[var2];
            var4 = new haa(((jga) this).field_q, var3.field_c, var3.field_a, ((jga) this).field_w.field_r == var2 ? true : false);
            ((kj) (Object) var4).a(0);
        }
    }

    private final void b(boolean param0) {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = new be[71];
        field_v = null;
    }
}
