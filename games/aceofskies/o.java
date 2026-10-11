/*
 * Decompiled by CFR-JS 0.4.0.
 */
class o {
    kc field_d;
    static ej field_c;
    double field_e;
    int field_f;
    double field_b;
    static vd[] field_a;

    final void a(int param0) {
        if (param0 == 2) {
          this.b(this.field_b, 128);
          return;
        }
        o.a(-85, -82, 96, -41, -118, -52);
        this.b(this.field_b, 128);
    }

    public static void a(boolean param0) {
        field_a = null;
        field_c = null;
        if (!param0) {
          o.a(-30, 98, 16, -74, 112, -14);
        }
    }

    final void a(double param0, int param1) {
        this.a(param0, (byte) 49, param0);
        if (param1 >= -77) {
          field_a = (vd[]) null;
        }
    }

    final void a(double param0, byte param1, double param2) {
        if (this.field_d.field_a < -param0) {
          this.field_d.field_a = this.field_d.field_a + param0 * 2.0;
          this.field_d.field_b = -this.field_d.field_b;
          if (!(this.field_d.field_a > param0)) {
            this.field_d.field_b = -this.field_d.field_b;
            this.field_d.field_a = -this.field_d.field_a;
            if (-param2 > this.field_d.field_b) {
              this.field_d.field_b = this.field_d.field_b + 2.0 * param2;
            }
            if (param1 != 49) {
              this.field_b = 1.33615424320731;
            }
            this.field_d.field_a = -this.field_d.field_a;
            if (param2 < this.field_d.field_b) {
              this.field_d.field_b = this.field_d.field_b - param2 * 2.0;
            }
            return;
          }
          this.field_d.field_a = this.field_d.field_a - 2.0 * param0;
          this.field_d.field_b = -this.field_d.field_b;
          this.field_d.field_a = -this.field_d.field_a;
          if (!(-param2 > this.field_d.field_b)) {
            if (param1 != 49) {
              this.field_b = 1.33615424320731;
            }
            this.field_d.field_a = -this.field_d.field_a;
            if (param2 < this.field_d.field_b) {
              this.field_d.field_b = this.field_d.field_b - param2 * 2.0;
            }
            return;
          }
          this.field_d.field_b = this.field_d.field_b + 2.0 * param2;
          if (param1 == 49) {
            this.field_d.field_a = -this.field_d.field_a;
            if (param2 < this.field_d.field_b) {
              this.field_d.field_b = this.field_d.field_b - param2 * 2.0;
            }
            return;
          }
          this.field_b = 1.33615424320731;
          this.field_d.field_a = -this.field_d.field_a;
          if (param2 < this.field_d.field_b) {
            this.field_d.field_b = this.field_d.field_b - param2 * 2.0;
          }
          return;
        }
        this.field_d.field_b = -this.field_d.field_b;
        if (this.field_d.field_a > param0) {
          this.field_d.field_a = this.field_d.field_a - 2.0 * param0;
          this.field_d.field_b = -this.field_d.field_b;
          this.field_d.field_a = -this.field_d.field_a;
          if (-param2 > this.field_d.field_b) {
            this.field_d.field_b = this.field_d.field_b + 2.0 * param2;
            if (param1 != 49) {
              this.field_b = 1.33615424320731;
              this.field_d.field_a = -this.field_d.field_a;
              if (param2 < this.field_d.field_b) {
                this.field_d.field_b = this.field_d.field_b - param2 * 2.0;
              }
              return;
            }
            this.field_d.field_a = -this.field_d.field_a;
            if (param2 < this.field_d.field_b) {
              this.field_d.field_b = this.field_d.field_b - param2 * 2.0;
            }
            return;
          }
          if (param1 == 49) {
            this.field_d.field_a = -this.field_d.field_a;
            if (param2 < this.field_d.field_b) {
              this.field_d.field_b = this.field_d.field_b - param2 * 2.0;
            }
            return;
          }
          this.field_b = 1.33615424320731;
          this.field_d.field_a = -this.field_d.field_a;
          if (param2 < this.field_d.field_b) {
            this.field_d.field_b = this.field_d.field_b - param2 * 2.0;
          }
          return;
        }
        this.field_d.field_b = -this.field_d.field_b;
        this.field_d.field_a = -this.field_d.field_a;
        if (-param2 > this.field_d.field_b) {
          this.field_d.field_b = this.field_d.field_b + 2.0 * param2;
          if (param1 == 49) {
            this.field_d.field_a = -this.field_d.field_a;
            if (param2 < this.field_d.field_b) {
              this.field_d.field_b = this.field_d.field_b - param2 * 2.0;
            }
            return;
          }
          this.field_b = 1.33615424320731;
          this.field_d.field_a = -this.field_d.field_a;
          if (param2 < this.field_d.field_b) {
            this.field_d.field_b = this.field_d.field_b - param2 * 2.0;
          }
          return;
        }
        if (param1 == 49) {
          this.field_d.field_a = -this.field_d.field_a;
          if (param2 < this.field_d.field_b) {
            this.field_d.field_b = this.field_d.field_b - param2 * 2.0;
          }
          return;
        }
        this.field_b = 1.33615424320731;
        this.field_d.field_a = -this.field_d.field_a;
        if (param2 < this.field_d.field_b) {
          this.field_d.field_b = this.field_d.field_b - param2 * 2.0;
        }
    }

    final void a(double param0, byte param1) {
        if (param1 != 25) {
          field_c = (ej) null;
        }
        this.field_e = this.field_e + param0;
        if (this.field_e < 0.0) {
          this.field_e = this.field_e + 256.0;
        }
        if (this.field_e > 256.0) {
          this.field_e = this.field_e - 256.0;
        }
    }

    final void b(double param0, int param1) {
        double var4 = 3.141592653589793 * ((double)this.field_f + this.field_e) / (double)param1;
        this.field_d.field_a = this.field_d.field_a - Math.sin(var4) * param0;
        this.field_d.field_b = this.field_d.field_b - Math.cos(var4) * param0;
        if (this.field_f < 0) {
          this.field_f = this.field_f + 1;
          if (this.field_f > 0) {
            this.field_f = this.field_f - 1;
            return;
          }
          return;
        }
        if (this.field_f <= 0) {
          return;
        }
        this.field_f = this.field_f - 1;
    }

    final void a(byte param0, double param1) {
        double var4 = 0.0;
        if (param0 > 104) {
          var4 = 3.141592653589793 * this.field_e / 128.0;
          this.field_d.field_a = this.field_d.field_a - Math.cos(var4) * param1;
          this.field_d.field_b = this.field_d.field_b + Math.sin(var4) * param1;
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int stackIn_10_0 = 0;
        int stackIn_25_0 = 0;
        int var6;
        int var7;
        int var6Lifetime1;
        int var7Lifetime1;
        vs.field_b[os.field_w] = param1;
        uf.field_d[os.field_w] = os.field_w;
        js.field_c[os.field_w] = param5;
        if (ft.field_o < param5) {
          fj.field_d = param5;
        }
        if (param2 > 14) {
          if (op.field_a > param5) {
            nh.field_a = param5;
          }
          hg.field_C[os.field_w] = param4;
          qd.field_p[os.field_w] = param0;
          dd.field_c[os.field_w] = param3;
          var6 = param0 + param4 + param3;
          if (0 == var6) {
            stackIn_25_0 = 0;
          } else {
            stackIn_25_0 = param4 * 1000 / var6;
          }
          var7 = stackIn_25_0;
          ai.field_a[os.field_w] = var7;
          if (nh.field_a > var7) {
            nh.field_a = var7;
          }
          os.field_w = os.field_w + 1;
          if (fj.field_d >= var7) {
            return;
          }
          fj.field_d = var7;
          return;
        }
        field_a = (vd[]) null;
        if (op.field_a > param5) {
          nh.field_a = param5;
        }
        hg.field_C[os.field_w] = param4;
        qd.field_p[os.field_w] = param0;
        dd.field_c[os.field_w] = param3;
        var6Lifetime1 = param0 + param4 + param3;
        if (0 == var6Lifetime1) {
          stackIn_10_0 = 0;
        } else {
          stackIn_10_0 = param4 * 1000 / var6Lifetime1;
        }
        var7Lifetime1 = stackIn_10_0;
        ai.field_a[os.field_w] = var7Lifetime1;
        if (nh.field_a > var7Lifetime1) {
          nh.field_a = var7Lifetime1;
        }
        os.field_w = os.field_w + 1;
        if (fj.field_d >= var7Lifetime1) {
          return;
        }
        fj.field_d = var7Lifetime1;
    }

    o(kc param0) {
        this.field_f = 0;
        this.field_e = 0.0;
        this.field_b = 0.0;
        try {
          this.field_d = new kc(param0);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "o.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = new ej(1, 2, 2, 0);
    }
}
