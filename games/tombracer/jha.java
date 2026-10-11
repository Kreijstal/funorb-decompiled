/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jha extends vg {
    private String field_n;
    private int field_f;
    private int field_l;
    private int field_g;
    private int field_m;
    private int field_j;
    private int field_k;
    private int field_u;
    private String field_h;
    private int field_s;
    private int field_o;
    private int field_p;
    private String field_q;
    private int field_r;
    private int field_t;
    private int field_i;

    final void a(int param0, int param1, int param2) {
        this.field_p = param2;
        if (param1 != 4) {
          this.field_s = 34;
          this.field_u = param0;
          return;
        }
        this.field_u = param0;
    }

    final String b(int param0) {
        if (param0 != 29161) {
          this.a(true);
          return this.field_n;
        }
        return this.field_n;
    }

    final void b(byte param0) {
        int var3 = -52 % ((param0 + 59) / 45);
        int var2 = 255 - (this.field_o * 255 >> 16);
        rba.a(var2 / 2, this.field_k, 1, this.field_g, (byte) 99, this.field_s, this.field_t);
        int var4 = fn.field_f[this.field_r];
        dh.a(kn.field_p, var2, 0, 16, 4 + this.field_t, this.field_k - 8, var4, this.field_s + 4, 1, 29870, 1, -8 + this.field_g, this.field_q);
    }

    final int a(boolean param0) {
        if (!param0) {
          this.a(true);
          return this.field_k;
        }
        return this.field_k;
    }

    final int a(byte param0) {
        if (param0 != -100) {
          this.field_o = 82;
          return this.field_j;
        }
        return this.field_j;
    }

    final void a(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = TombRacer.field_G ? 1 : 0;
        this.field_m = this.field_m + 1;
        if (this.field_m < this.field_f) {
          var2 = -this.field_m + this.field_f;
          var3 = this.field_f;
        } else {
          if (this.field_m <= this.field_l - this.field_i) {
            var2 = 0;
            var3 = 1;
          } else {
            var3 = this.field_i;
            var2 = -this.field_l + this.field_i + this.field_m;
          }
        }
        if (0 < var2) {
          this.field_o = var2 * 65536 / var3;
          this.field_o = (this.field_o >> 8) * (this.field_o >> 8);
        } else {
          this.field_o = 0;
        }
        if (this.field_m == 1) {
          this.field_s = this.field_u;
          this.field_t = this.field_p + (256 * this.field_o >> 16);
          if (null == this.field_q) {
            if (null == this.field_h) {
              this.field_q = this.field_n;
            } else {
              this.field_q = this.field_h + ": " + this.field_n;
            }
            var4 = this.field_g - 8;
            var5 = kv.field_a.a(this.field_q, var4, (nh[]) null, 51, 16);
            this.field_k = 8 + var5;
          }
        } else {
          if (this.field_s < this.field_u) {
            this.field_s = this.field_s + 1;
            this.field_t = this.field_p + (256 * this.field_o >> 16);
            if (null == this.field_q) {
              if (null == this.field_h) {
                this.field_q = this.field_n;
                var4 = this.field_g - 8;
                var5 = kv.field_a.a(this.field_q, var4, (nh[]) null, 51, 16);
                this.field_k = 8 + var5;
                if (param0 < -36) {
                  return;
                }
                this.c((byte) 42);
                return;
              }
              this.field_q = this.field_h + ": " + this.field_n;
              var4 = this.field_g - 8;
              var5 = kv.field_a.a(this.field_q, var4, (nh[]) null, 51, 16);
              this.field_k = 8 + var5;
            }
          } else {
            if (this.field_s > this.field_u) {
              this.field_s = this.field_s - 1;
              this.field_t = this.field_p + (256 * this.field_o >> 16);
              if (null == this.field_q) {
                if (null == this.field_h) {
                  this.field_q = this.field_n;
                } else {
                  this.field_q = this.field_h + ": " + this.field_n;
                }
                var4 = this.field_g - 8;
                var5 = kv.field_a.a(this.field_q, var4, (nh[]) null, 51, 16);
                this.field_k = 8 + var5;
              }
            } else {
              this.field_t = this.field_p + (256 * this.field_o >> 16);
              if (null != this.field_q) {
                if (param0 >= -36) {
                  this.c((byte) 42);
                }
                return;
              }
              if (null == this.field_h) {
                this.field_q = this.field_n;
              } else {
                this.field_q = this.field_h + ": " + this.field_n;
              }
              var4 = this.field_g - 8;
              var5 = kv.field_a.a(this.field_q, var4, (nh[]) null, 51, 16);
              this.field_k = 8 + var5;
            }
          }
        }
        if (param0 < -36) {
          return;
        }
        this.c((byte) 42);
    }

    final int c(byte param0) {
        if (param0 != -96) {
          this.c(-105);
          return this.field_g;
        }
        return this.field_g;
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        this.field_i = param1;
        this.field_l = param1 + param3 + param2;
        this.field_f = param2;
        this.field_m = 0;
        if (param0) {
          this.field_m = -96;
        }
    }

    final void d(byte param0) {
        this.field_j = this.field_j - 1;
        if (param0 <= 2) {
          this.field_s = -20;
        }
    }

    final boolean e(byte param0) {
        if (param0 == -39) {
          return this.field_l <= this.field_m ? true : false;
        }
        this.d((byte) 38);
        return this.field_l <= this.field_m ? true : false;
    }

    final void a(int param0, int param1) {
        if (param0 != 1) {
          this.a(-94);
          this.field_g = param1;
          return;
        }
        this.field_g = param1;
    }

    final void a(boolean param0, int param1) {
        this.field_j = param1;
        if (param0) {
          this.field_i = -2;
        }
    }

    final boolean c(int param0) {
        if (param0 != -1) {
          this.b(-122);
          if (this.field_o != 0) {
            return this.field_m < -this.field_i + this.field_l ? true : false;
          }
          return true;
        }
        if (this.field_o == 0) {
          return true;
        }
        if (this.field_m >= -this.field_i + this.field_l) {
          return false;
        }
        return true;
    }

    jha(int param0, String param1, String param2) {
        try {
          this.field_h = param1;
          this.field_r = param0;
          this.field_n = param2;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "jha.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
