/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class a {
    private int field_d;
    private boolean field_a;
    private int field_j;
    private int field_o;
    private int field_n;
    static int[] field_f;
    private int field_e;
    private int field_k;
    static String field_l;
    private int field_b;
    static boolean field_c;
    static dj field_h;
    private int field_i;
    static int field_m;
    static int[] field_g;

    public static void b(byte param0) {
        if (param0 <= 78) {
            return;
        }
        field_h = null;
        field_g = null;
        field_f = null;
        field_l = null;
    }

    final void a(wk param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        if (!this.field_a) {
            return;
        }
        try {
            var3_int = param0.a(this.field_i >> -814362992, (byte) -60);
            if (param1 != 8192) {
                a.a((byte) 123);
            }
            var4 = param0.a(this.field_o >> 20424336, 0) - (this.field_k >> -1039249968);
            tf.field_b[this.field_b].b(-3 + var3_int, -3 + var4);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "a.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int discarded$2 = 0;
        int discarded$3 = 0;
        this.field_i = param2;
        this.field_o = param0 + (-(so.c(8) << -2067900720) + 262144);
        this.field_k = param1 << 1383290256;
        if (param3 <= 57) {
          a.b((byte) -23);
          this.field_j = (so.c(1) << -1903033520) + 65536;
          this.field_e = so.c(32768) + -114688;
          this.field_a = true;
          this.field_d = 12 + so.c(3);
          this.field_n = 0;
          this.field_b = 0;
          discarded$2 = so.a(sg.field_fb);
          return;
        } else {
          this.field_j = (so.c(1) << -1903033520) + 65536;
          this.field_e = so.c(32768) + -114688;
          this.field_a = true;
          this.field_d = 12 + so.c(3);
          this.field_n = 0;
          this.field_b = 0;
          discarded$3 = so.a(sg.field_fb);
          return;
        }
    }

    final static void a(byte param0) {
        if (param0 != 40) {
            field_h = (dj) null;
            pa.field_x = new va[]{};
            return;
        }
        pa.field_x = new va[]{};
    }

    final void a(int param0) {
        int fieldTemp$4 = 0;
        fn discarded$5 = null;
        int fieldTemp$6 = 0;
        fn discarded$7 = null;
        int var2 = 0;
        if (this.field_a) {
          if (-1 <= (this.field_k ^ -1)) {
            return;
          } else {
            this.field_k = this.field_k + this.field_j;
            this.field_i = this.field_i + this.field_e;
            if (this.field_j <= -131072) {
              var2 = 63 / ((41 - param0) / 53);
              if (this.field_b >= 2) {
                return;
              } else {
                fieldTemp$4 = this.field_n + 1;
                this.field_n = this.field_n + 1;
                if (this.field_d < fieldTemp$4) {
                  this.field_n = 0;
                  this.field_b = this.field_b + 1;
                  if ((this.field_b ^ -1) == -3) {
                    discarded$5 = kh.a(so.c(1) + 153, false);
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              this.field_j = this.field_j - 8192;
              var2 = 63 / ((41 - param0) / 53);
              if (this.field_b >= 2) {
                return;
              } else {
                fieldTemp$6 = this.field_n + 1;
                this.field_n = this.field_n + 1;
                if (this.field_d < fieldTemp$6) {
                  this.field_n = 0;
                  this.field_b = this.field_b + 1;
                  if ((this.field_b ^ -1) != -3) {
                    return;
                  } else {
                    discarded$7 = kh.a(so.c(1) + 153, false);
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    a() {
        this.field_d = 20;
        this.field_a = false;
    }

    static {
        int var0 = 0;
        field_f = new int[4096];
        for (var0 = 0; 4096 > var0; var0++) {
            field_f[var0] = jm.a(var0, 89);
        }
        field_l = "Player names can be up to 12 letters, numbers and underscores";
        field_g = new int[]{280, 180, 180, 180, 180, 180, 180};
        field_m = 8;
        field_c = false;
    }
}
