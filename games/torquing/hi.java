/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hi {
    String field_a;
    int field_b;
    static sm[] field_h;
    int[] field_c;
    private long field_g;
    private int field_d;
    int field_k;
    private String field_e;
    int field_f;
    static hi[] field_j;
    private boolean field_i;

    final int a(byte param0) {
        if (param0 != -72) {
          this.field_g = 0L;
          if (this.field_i) {
            return 2;
          }
          if (2 == this.field_f &&
            this.field_d > 0) {
            return 2;
          }
          if (~this.field_g == ~ke.field_b) {
            return 1;
          }
          if (cn.field_b != 2) {
            return 0;
          }
          if (!bi.a((byte) 83, this.field_e)) {
            return 0;
          }
          return 1;
        }
        if (this.field_i) {
          return 2;
        }
        if (2 != this.field_f) {
          if (~this.field_g == ~ke.field_b) {
            return 1;
          }
          if (cn.field_b != 2) {
            return 0;
          }
          if (!bi.a((byte) 83, this.field_e)) {
            return 0;
          }
          return 1;
        }
        if (this.field_d > 0) {
          return 2;
        }
        if (~this.field_g == ~ke.field_b) {
          return 1;
        }
        if (cn.field_b != 2) {
          return 0;
        }
        if (bi.a((byte) 83, this.field_e)) {
          return 1;
        }
        return 0;
    }

    public static void a(int param0) {
        field_j = null;
        field_h = null;
        if (param0 != 2) {
          field_j = (hi[]) null;
        }
    }

    hi(boolean param0) {
        this.field_b = bg.field_n;
        this.field_k = oh.field_b;
        this.field_e = dg.field_m;
        this.field_f = n.field_u;
        this.field_d = hh.field_a;
        this.field_i = fd.field_a;
        if (param0) {
          this.field_c = md.field_a;
        } else {
          this.field_c = null;
        }
        this.field_g = pm.field_r;
        this.field_a = np.field_m;
    }

    static {
    }
}
