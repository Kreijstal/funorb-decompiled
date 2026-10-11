/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk {
    static int field_b;
    private String field_g;
    int field_h;
    int field_c;
    String field_i;
    private long field_d;
    int[] field_a;
    int field_k;
    static String field_j;
    private int field_l;
    static de field_e;
    private boolean field_f;

    final int b(int param0) {
        if (this.field_f) {
          return 2;
        }
        if (this.field_k != 2) {
          if (~this.field_d == ~uh.field_p) {
            return 1;
          }
          if (ii.field_c != param0) {
            return 0;
          }
          if (wh.a(this.field_g, false)) {
            return 1;
          }
          return 0;
        }
        if (this.field_l > 0) {
          return 2;
        }
        if (~this.field_d == ~uh.field_p) {
          return 1;
        }
        if (ii.field_c != param0) {
          return 0;
        }
        if (!wh.a(this.field_g, false)) {
          return 0;
        }
        return 1;
    }

    public static void a(int param0) {
        if (param0 != 1) {
          field_b = -122;
          field_j = null;
          field_e = null;
          return;
        }
        field_j = null;
        field_e = null;
    }

    vk(boolean param0) {
        this.field_d = ff.field_a;
        this.field_l = be.field_a;
        this.field_f = gg.field_a;
        if (!param0) {
          this.field_a = null;
        } else {
          this.field_a = bl.field_c;
        }
        this.field_k = hg.field_b;
        this.field_g = fj.field_c;
        this.field_c = fg.field_l;
        this.field_i = hi.field_b;
        this.field_h = bi.field_a;
    }

    static {
        field_j = "LEVEL";
        field_e = new de(13, 0, 1, 0);
    }
}
