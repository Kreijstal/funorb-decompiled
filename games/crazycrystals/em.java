/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class em extends fb {
    static String field_g;
    private int[] field_o;
    private int field_j;
    private boolean field_n;
    static int field_i;
    private int field_h;
    static volatile boolean field_f;
    static dl field_m;
    private boolean field_l;
    private int[] field_k;

    public static void b(int param0) {
        field_g = null;
        field_m = null;
        if (param0 != -25) {
          em.b(122);
        }
    }

    final static void a(byte param0, dl param1) {
        try {
          if (param0 != 38) {
            em.b(5);
          }
          hd.a(false);
          kh.a(param1.field_w, param1.field_n, param1.field_o);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "em.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, int param1, int param2, byte param3, boolean param4, int param5, int param6) {
        int var8;
        int var9;
        var9 = CrazyCrystals.field_B;
        var8 = this.field_k[this.field_j];
        if (this.field_j == 2) {
          boolean decompiledFrameRemainder0 = true;
          if (param1 == 24 &&
            24 == param2) {
            if (this.field_n) {
              ro.field_u[var8].a(param5, -(2 * param2) + param6);
            } else {
              ro.field_u[var8].c(param5, param6 - 2 * param2, 8421631);
            }
            if (!this.field_l) {
              fm.field_s[var8].c(param5, param6 - param2, ek.field_f[this.field_a.field_u]);
              decompiledFrameRemainder0 = false;
            }
            else {
              mj.field_f[var8].a(param5, -param2 + param6);
              if (param3 <= -59) {
                return;
              }
              field_m = (dl) null;
              return;
            }
          }
          if (decompiledFrameRemainder0) {
            if (this.field_n) {
              ro.field_u[var8].b(param5, param6 - param2 * 2, 2 * param1, param2 * 4);
            } else {
              ro.field_u[var8].b(param5, param6 - param2 * 2, param1 * 2, 4 * param2, 8421631);
            }
            if (this.field_l) {
              mj.field_f[var8].b(param5, param6 - param2, param1 * 2, 3 * param2);
            } else {
              fm.field_s[var8].b(param5, param6 - param2, 2 * param1, param2 * 3, ek.field_f[this.field_a.field_u]);
            }
          }
          if (param3 > -59) {
            field_m = (dl) null;
          }
          return;
        }
        if (this.field_h < 4) {
          var8 = 0;
        }
        if (param1 != 24) {
          if (this.field_n) {
            ro.field_u[var8].b(param5, param6 - param2 * 2, 2 * param1, param2 * 4);
          } else {
            ro.field_u[var8].b(param5, param6 - param2 * 2, param1 * 2, 4 * param2, 8421631);
          }
          if (this.field_l) {
            mj.field_f[var8].b(param5, param6 - param2, param1 * 2, 3 * param2);
          } else {
            fm.field_s[var8].b(param5, param6 - param2, 2 * param1, param2 * 3, ek.field_f[this.field_a.field_u]);
          }
          if (param3 > -59) {
            field_m = (dl) null;
          }
          return;
        }
        if (24 == param2) {
          if (this.field_n) {
            ro.field_u[var8].a(param5, -(2 * param2) + param6);
          } else {
            ro.field_u[var8].c(param5, param6 - 2 * param2, 8421631);
          }
          if (!this.field_l) {
            fm.field_s[var8].c(param5, param6 - param2, ek.field_f[this.field_a.field_u]);
          } else {
            mj.field_f[var8].a(param5, -param2 + param6);
          }
        } else {
          if (!this.field_n) {
            ro.field_u[var8].b(param5, param6 - param2 * 2, param1 * 2, 4 * param2, 8421631);
          } else {
            ro.field_u[var8].b(param5, param6 - param2 * 2, 2 * param1, param2 * 4);
          }
          if (this.field_l) {
            mj.field_f[var8].b(param5, param6 - param2, param1 * 2, 3 * param2);
          } else {
            fm.field_s[var8].b(param5, param6 - param2, 2 * param1, param2 * 3, ek.field_f[this.field_a.field_u]);
          }
        }
        if (param3 <= -59) {
          return;
        }
        field_m = (dl) null;
    }

    final fb a(int param0) {
        int var2 = 0;
        int var2Lifetime1;
        this.field_h = this.field_h - 1;
        if (this.field_h != 0) {
          var2 = 18 / ((param0 - 36) / 62);
          this.field_l = 0.5 <= Math.random() ? true : false;
          this.field_n = 0.5 <= Math.random() ? true : false;
          return (fb) (this);
        }
        this.field_j = this.field_j + 1;
        if (this.field_j >= 3) {
          io.field_M.a(128, this.field_a.field_o * this.field_a.field_m + 12 * this.field_a.field_A, this.field_a.field_s * this.field_a.field_m + this.field_a.field_t * 12, 0, (byte) -111);
          return (fb) ((Object) new jk(this.field_a));
        }
        this.field_h = this.field_o[this.field_j];
        var2Lifetime1 = 18 / ((param0 - 36) / 62);
        this.field_l = 0.5 <= Math.random() ? true : false;
        this.field_n = 0.5 <= Math.random() ? true : false;
        return (fb) (this);
    }

    em(fq param0) {
        super(param0);
        this.field_o = new int[3];
        this.field_j = 0;
        this.field_k = new int[3];
        this.field_n = false;
        this.field_l = false;
        try {
          this.field_k[0] = (int)(Math.random() * 2.99) + 1;
          this.field_k[1] = (int)(Math.random() * 1.99) + 1;
          if (this.field_k[0] <= this.field_k[1]) {
            this.field_k[1] = this.field_k[1] + 1;
          }
          this.field_k[2] = this.field_k[0];
          this.field_o[0] = (int)(30.0 * Math.random()) + 10;
          this.field_o[1] = 10 + (int)(Math.random() * (double)(-this.field_o[0] + 30));
          this.field_h = this.field_o[0];
          this.field_o[2] = -this.field_o[1] + (60 - this.field_o[0]);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "em.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_f = false;
    }
}
