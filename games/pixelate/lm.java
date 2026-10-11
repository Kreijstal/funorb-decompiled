/*
 * Decompiled by CFR-JS 0.4.0.
 */
class lm extends fa {
    long field_q;
    static wm field_l;
    lm field_r;
    lm field_p;
    static String field_n;
    static jl field_o;
    static String field_m;
    static int[] field_s;
    static String[] field_k;

    public static void a(int param0) {
        field_s = null;
        field_l = null;
        field_o = null;
        if (param0 != -2575) {
          return;
        }
        field_n = null;
        field_k = null;
        field_m = null;
    }

    final long a(boolean param0) {
        if (!param0) {
          this.e(-120);
          return this.field_q;
        }
        return this.field_q;
    }

    final void e(int param0) {
        if (null == this.field_r) {
          return;
        }
        this.field_r.field_p = this.field_p;
        if (param0 == 17) {
          this.field_p.field_r = this.field_r;
          this.field_r = null;
          this.field_p = null;
          return;
        }
    }

    final boolean f(int param0) {
        if (param0 != 0) {
          this.e(-41);
          if (this.field_r != null) {
            return true;
          }
          return false;
        }
        if (this.field_r != null) {
          return true;
        }
        return false;
    }

    final void a(long param0, int param1) {
        if (null != this.field_r) {
          throw new RuntimeException();
        }
        if (param1 == 29574) {
          this.field_q = param0;
          return;
        }
        this.field_p = (lm) null;
        this.field_q = param0;
    }

    protected lm() {
    }

    static {
        field_l = new wm(7, 0, 1, 1);
        field_m = "Play rated game";
        field_n = "If you do nothing the game will revert to normal view in <%0> second.";
        field_k = new String[]{"Showing by rating", "Showing by win percentage"};
        field_s = new int[]{17, 18, 7};
    }
}
