/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jb {
    static String field_h;
    static String field_p;
    private vb field_q;
    private int field_k;
    private int field_e;
    private int field_j;
    static int field_a;
    private int field_r;
    private int field_b;
    private int field_d;
    private float field_n;
    private int field_i;
    private int field_g;
    private int field_c;
    private int field_o;
    private int field_s;
    private int field_m;
    private int field_l;
    private boolean field_f;

    final static void a(int param0, int param1, qc param2, int param3) {
        try {
          int var4_int = -23 % ((param3 + 27) / 50);
          sa.field_h = param1;
          ka.field_q = param0;
          eh.field_a = param2;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "jb.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final void c(int param0) {
        if (param0 != -1) {
          return;
        }
        this.field_q.a((byte) 71, this.field_i, this.field_k);
    }

    public static void a(int param0) {
        field_h = null;
        field_p = null;
        if (param0 != 0) {
          field_p = (String) null;
        }
    }

    final boolean d(int param0) {
        if (param0 != 2) {
          this.field_n = 0.2115049809217453f;
          if (this.field_d > fh.field_m) {
            return false;
          }
          if (mk.field_k > 0) {
            return true;
          }
          return false;
        }
        if (this.field_d > fh.field_m) {
          return false;
        }
        if (mk.field_k > 0) {
          return true;
        }
        return false;
    }

    final void a(byte param0, int param1, int param2) {
        int var4 = -2 % ((-14 - param0) / 38);
        this.field_m = param1;
        this.field_b = param2;
    }

    final void b(int param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        if (pd.field_f != null) {
          return;
        }
        if (param0 != 0) {
          this.field_n = -0.40444520115852356f;
          if (mk.field_k <= 0) {
            this.field_f = false;
          }
          if (this.field_f) {
            fieldTemp$1 = this.field_g - 1;
            this.field_g = this.field_g - 1;
            if (fieldTemp$1 > 0) {
              return;
            }
            this.field_g = this.field_o;
            if (fh.field_m < this.field_d) {
              this.field_f = false;
            } else {
              this.a((byte) -15);
            }
            return;
          }
          if (this.field_m <= lk.field_j) {
            if (this.field_m > 0) {
              fb.field_f = 0;
            }
          } else {
            fb.field_f = (this.field_m - lk.field_j) / 2;
          }
        } else {
          if (mk.field_k <= 0) {
            this.field_f = false;
          }
          if (this.field_f) {
            fieldTemp$0 = this.field_g - 1;
            this.field_g = this.field_g - 1;
            if (fieldTemp$0 > 0) {
              return;
            }
            this.field_g = this.field_o;
            if (fh.field_m < this.field_d) {
              this.field_f = false;
            } else {
              this.a((byte) -15);
            }
            return;
          }
          if (this.field_m > lk.field_j) {
            fb.field_f = (this.field_m - lk.field_j) / 2;
          } else {
            if (this.field_m > 0) {
              fb.field_f = 0;
            }
          }
        }
        if (this.field_j == lk.field_j &&
          this.field_r == td.field_d) {
          return;
        }
        this.field_q.a((byte) 71, this.field_r, this.field_j);
    }

    private final void a(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = stellarshard.field_B;
        var2 = this.field_m;
        var3 = this.field_b;
        if (!this.d(2)) {
          this.field_f = false;
          return;
        }
        if (this.field_s >= var3) {
          if (this.field_l > var3) {
            var3 = this.field_l;
          }
        } else {
          var3 = this.field_s;
        }
        if (var2 <= this.field_e) {
          if (this.field_c > var2) {
            var2 = this.field_c;
          }
        } else {
          var2 = this.field_e;
        }
        if (!(this.field_n > 0.0f)) {
          if (lk.field_j != var2 ||
            var3 != td.field_d) {
            this.field_q.a((byte) 71, var3, var2);
          }
          if (param0 != -15) {
            this.field_e = -87;
          }
          if (this.field_m > 0) {
            fb.field_f = (-lk.field_j + this.field_m) / 2;
          }
          return;
        }
        var4 = (int)(0.5f + (float)var3 * this.field_n);
        if (var4 > var2) {
          var3 = (int)((float)var2 / this.field_n);
        } else {
          if (var2 > var4) {
            var2 = var4;
          }
        }
        if (lk.field_j != var2) {
          this.field_q.a((byte) 71, var3, var2);
        } else {
          if (var3 != td.field_d) {
            this.field_q.a((byte) 71, var3, var2);
          }
        }
        if (param0 != -15) {
          this.field_e = -87;
        }
        if (this.field_m > 0) {
          fb.field_f = (-lk.field_j + this.field_m) / 2;
        }
        return;
    }

    private jb() throws Throwable {
        throw new Error();
    }

    static {
        field_p = "That name is not available";
        field_a = 100;
        field_h = "Names cannot start or end with space or underscore";
    }
}
