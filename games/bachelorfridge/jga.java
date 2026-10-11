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
        int var2 = -89 % ((71 - param0) / 47);
        if (this.field_m.a((byte) -106)) {
          return false;
        }
        if (this.field_x.a((byte) -106)) {
          return false;
        }
        int fieldTemp$0 = this.field_l - 1;
        this.field_l = this.field_l - 1;
        if (0 > fieldTemp$0) {
          this.b(false);
          return true;
        }
        if (25 != this.field_l) {
          return false;
        }
        this.c(false);
        return false;
    }

    jga(gj param0, naa param1) {
        super(param0, param1);
        try {
          this.field_w = param1;
          this.field_x = new taa(this.field_q, this.field_w.field_q, this.field_w.field_t);
          this.a(27799, this.field_x);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "jga.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d(int param0) {
        if (param0 != 0) {
          return;
        }
        field_y = null;
        field_z = null;
        field_v = null;
    }

    private final void c(boolean param0) {
        int var2 = 0;
        aj var3 = null;
        haa var4 = null;
        int var5 = BachelorFridge.field_y;
        for (var2 = 0; this.field_w.field_u > var2; var2++) {
          var3 = this.field_w.field_s[var2];
          var4 = new haa(this.field_q, var3.field_c, var3.field_a, this.field_w.field_r == var2 ? true : false);
          ((kj) ((Object) var4)).a(0);
        }
        if (!param0) {
          return;
        }
        field_v = (String) null;
    }

    private final void b(boolean param0) {
        if (param0) {
          field_v = (String) null;
        }
    }

    static {
        field_y = new be[71];
        field_v = null;
    }
}
