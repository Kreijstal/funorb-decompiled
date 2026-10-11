/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vm {
    boolean field_h;
    private int field_i;
    int field_p;
    private int field_d;
    private int field_c;
    static pl field_f;
    private int field_e;
    private int field_n;
    private int field_o;
    private int field_q;
    private int field_j;
    int field_s;
    private int field_m;
    private int field_g;
    static String field_a;
    private float field_r;
    private int field_k;
    private int field_t;
    private sh field_l;
    private int field_b;

    final boolean a(byte param0) {
        if (param0 >= -113) {
          this.field_n = -43;
          if (this.field_i > cba.field_d) {
            return false;
          }
          if (wla.field_ub > 0) {
            return true;
          }
          return false;
        }
        if (this.field_i > cba.field_d) {
          return false;
        }
        if (wla.field_ub > 0) {
          return true;
        }
        return false;
    }

    private final void c(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = TombRacer.field_G ? 1 : 0;
        var2 = this.field_d;
        var3 = this.field_t;
        if (!this.a((byte) -115)) {
          this.field_h = false;
          return;
        }
        if (var3 > this.field_m) {
          var3 = this.field_m;
        } else {
          if (var3 < this.field_e) {
            var3 = this.field_e;
          }
        }
        if (var2 > this.field_o) {
          var2 = this.field_o;
        } else {
          if (var2 < this.field_n) {
            var2 = this.field_n;
          }
        }
        if (this.field_r > 0.0f) {
          var4 = (int)(0.5f + this.field_r * (float)var3);
          if (var4 > var2) {
            var3 = (int)((float)var2 / this.field_r);
            if (param0 > -31) {
              this.field_k = -11;
            }
            if (mma.field_a != var2) {
              this.field_l.a(var2, -117, var3);
            } else {
              if (var3 != qf.field_i) {
                this.field_l.a(var2, -117, var3);
              }
            }
            if (this.field_d > 0) {
              lp.field_g = (this.field_d - mma.field_a) / 2;
            }
            return;
          }
          if (var4 >= var2) {
            if (param0 > -31) {
              this.field_k = -11;
            }
            if (mma.field_a != var2 ||
              var3 != qf.field_i) {
              this.field_l.a(var2, -117, var3);
            }
            if (this.field_d <= 0) {
              return;
            }
            lp.field_g = (this.field_d - mma.field_a) / 2;
            return;
          }
          var2 = var4;
        }
        if (param0 <= -31) {
          if (mma.field_a != var2) {
            this.field_l.a(var2, -117, var3);
          } else {
            if (var3 != qf.field_i) {
              this.field_l.a(var2, -117, var3);
            }
          }
        } else {
          this.field_k = -11;
          if (mma.field_a != var2) {
            this.field_l.a(var2, -117, var3);
            if (this.field_d > 0) {
              lp.field_g = (this.field_d - mma.field_a) / 2;
            }
            return;
          }
          if (var3 != qf.field_i) {
            this.field_l.a(var2, -117, var3);
          }
        }
        if (this.field_d <= 0) {
          return;
        }
        lp.field_g = (this.field_d - mma.field_a) / 2;
    }

    public static void e(int param0) {
        field_f = null;
        field_a = null;
        if (param0 != 26583) {
          vm.e(-62);
        }
    }

    final void a(boolean param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        if (!param0) {
          if (null != dq.field_f) {
            return;
          }
          if (wla.field_ub <= 0) {
            this.field_h = false;
          }
          if (this.field_h) {
            fieldTemp$2 = this.field_q - 1;
            this.field_q = this.field_q - 1;
            if (fieldTemp$2 > 0) {
              return;
            }
            this.field_q = this.field_k;
            if (this.field_i > cba.field_d) {
              this.field_h = false;
            } else {
              this.c(-102);
            }
            return;
          }
          if (this.field_d > mma.field_a) {
            lp.field_g = (this.field_d - mma.field_a) / 2;
          } else {
            if (this.field_d > 0) {
              lp.field_g = 0;
            }
          }
          if (this.field_b != mma.field_a) {
            this.field_l.a(this.field_b, -124, this.field_g);
          } else {
            if (this.field_g != qf.field_i) {
              this.field_l.a(this.field_b, -124, this.field_g);
            }
          }
          return;
        }
        this.a(true);
        if (null != dq.field_f) {
          return;
        }
        if (wla.field_ub > 0) {
          if (this.field_h) {
            fieldTemp$1 = this.field_q - 1;
            this.field_q = this.field_q - 1;
            if (fieldTemp$1 > 0) {
              return;
            }
            this.field_q = this.field_k;
            if (this.field_i > cba.field_d) {
              this.field_h = false;
            } else {
              this.c(-102);
            }
            return;
          }
          if (this.field_d > mma.field_a) {
            lp.field_g = (this.field_d - mma.field_a) / 2;
          } else {
            if (this.field_d > 0) {
              lp.field_g = 0;
            }
          }
          if (this.field_b != mma.field_a) {
            this.field_l.a(this.field_b, -124, this.field_g);
          } else {
            if (this.field_g != qf.field_i) {
              this.field_l.a(this.field_b, -124, this.field_g);
            }
          }
          return;
        }
        this.field_h = false;
        if (this.field_h) {
          fieldTemp$0 = this.field_q - 1;
          this.field_q = this.field_q - 1;
          if (fieldTemp$0 > 0) {
            return;
          }
          this.field_q = this.field_k;
          if (this.field_i > cba.field_d) {
            this.field_h = false;
          } else {
            this.c(-102);
          }
          return;
        }
        if (this.field_d > mma.field_a) {
          lp.field_g = (this.field_d - mma.field_a) / 2;
        } else {
          if (this.field_d <= 0) {
            if (this.field_b != mma.field_a) {
              this.field_l.a(this.field_b, -124, this.field_g);
            } else {
              if (this.field_g != qf.field_i) {
                this.field_l.a(this.field_b, -124, this.field_g);
              }
            }
            return;
          }
          lp.field_g = 0;
        }
        if (this.field_b == mma.field_a &&
          this.field_g == qf.field_i) {
          return;
        }
        this.field_l.a(this.field_b, -124, this.field_g);
    }

    final void a(int param0) {
        this.field_l.a(this.field_c, -122, this.field_j);
        if (param0 < 51) {
          this.field_o = 114;
        }
    }

    final void a(int param0, int param1, int param2) {
        this.field_s = param0;
        this.field_p = param1;
        if (param2 != -1) {
          field_a = (String) null;
        }
    }

    final via b(int param0) {
        via var2 = null;
        via var2Lifetime1;
        this.field_j = qf.field_i;
        if (param0 != 27013) {
          this.field_s = -44;
          this.field_c = mma.field_a;
          this.field_l.a(this.field_s, -123, this.field_p);
          wla.field_Cb = false;
          var2 = r.a(this.field_p, 0, param0 - 7720, dsa.field_c, this.field_s, 0);
          if (var2 == null) {
            this.a(53);
            return var2;
          }
          return var2;
        }
        this.field_c = mma.field_a;
        this.field_l.a(this.field_s, -123, this.field_p);
        wla.field_Cb = false;
        var2Lifetime1 = r.a(this.field_p, 0, param0 - 7720, dsa.field_c, this.field_s, 0);
        if (var2Lifetime1 != null) {
          return var2Lifetime1;
        }
        this.a(53);
        return var2Lifetime1;
    }

    final void a(int param0, boolean param1, int param2) {
        this.field_d = param0;
        if (param1) {
          this.a(true);
          this.field_t = param2;
          return;
        }
        this.field_t = param2;
    }

    final boolean a(int param0, byte param1, int param2) {
        boolean stackIn_13_0 = false;
        if (param1 < 37) {
          this.a(6, -40, -5);
          if (this.field_n > param2) {
            return false;
          }
          if (this.field_o < param2) {
            return false;
          }
          if (param0 < this.field_e) {
            return false;
          }
          if (param0 > this.field_m) {
            return false;
          }
          if (0.0f == this.field_r) {
            return true;
          }
          stackIn_13_0 = (Math.round(this.field_r * (float)param0) == param2);
          return stackIn_13_0;
        }
        if (this.field_n > param2) {
          return false;
        }
        if (this.field_o < param2) {
          return false;
        }
        if (param0 < this.field_e) {
          return false;
        }
        if (param0 > this.field_m) {
          return false;
        }
        if (0.0f == this.field_r) {
          return true;
        }
        if (Math.round(this.field_r * (float)param0) == param2) {
          return true;
        }
        return false;
    }

    final boolean d(int param0) {
        if (param0 != -1) {
          this.a(-62, true, 91);
          if (wla.field_ub <= 0) {
            return false;
          }
          if (this.field_i > cba.field_d) {
            return true;
          }
          return false;
        }
        if (wla.field_ub <= 0) {
          return false;
        }
        if (this.field_i > cba.field_d) {
          return true;
        }
        return false;
    }

    private vm() throws Throwable {
        throw new Error();
    }

    static {
        field_f = new pl(2);
        field_a = "Hey you! Get out of the way of these boulders of doom.";
    }
}
