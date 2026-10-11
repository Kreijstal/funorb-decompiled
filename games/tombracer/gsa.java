/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gsa {
    boolean field_h;
    boolean field_l;
    int field_m;
    private double field_g;
    boolean field_d;
    private double field_e;
    double field_q;
    int field_x;
    int field_f;
    int field_a;
    private fla field_t;
    int field_u;
    int field_r;
    static int field_j;
    static fpa field_y;
    int field_v;
    int field_c;
    boolean field_o;
    boolean field_b;
    int field_z;
    static String field_w;
    int field_n;
    double field_i;
    int field_p;
    boolean field_k;
    static String field_s;

    final void a(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        double var7;
        int var9;
        double var7Lifetime1;
        double var7Lifetime2;
        var9 = TombRacer.field_G ? 1 : 0;
        var4 = -1;
        if (efa.field_y <= param1 &&
          param1 < ona.field_H) {
          if (!this.field_k &&
            param1 >= efa.field_y + 50 * param2) {
            if (this.field_v > 0) {
              var4 = 63;
            }
            this.field_k = true;
            this.field_x = this.field_x + this.field_v;
          }
          if (!this.field_b &&
            !(25 + (efa.field_y + param2 * 50) > param1)) {
            if (this.field_u > 0 &&
              this.field_v == 0) {
              var4 = 63;
            }
            this.field_b = true;
            this.field_x = this.field_x + this.field_u;
          }
        } else if (nta.field_d <= param1 &&
          param1 < og.field_m) {
          if (!this.field_d &&
            nta.field_d + param2 * 50 <= param1) {
            this.field_x = this.field_x + this.field_n;
            this.field_d = true;
            if (this.field_n > 0) {
              var4 = 64;
            }
          }
          if (!this.field_h &&
            !(param1 < 25 + (50 * param2 + nta.field_d))) {
            this.field_x = this.field_x + this.field_z;
            if (this.field_z > 0 &&
              this.field_n == 0) {
              var4 = 64;
            }
            this.field_h = true;
          }
        } else {
          if (iv.field_ub <= param1 &&
            ema.field_b > param1) {
            if (!this.field_l &&
              param1 >= iv.field_ub + 50 * param2) {
              this.field_l = true;
              if (this.field_a > 0) {
                var4 = 65;
              }
              this.field_x = this.field_x + this.field_a;
            }
            if (!this.field_o &&
              param2 * 50 + iv.field_ub + 25 <= param1) {
              this.field_o = true;
              if (this.field_f > 0 &&
                this.field_a == 0) {
                var4 = 65;
              }
              this.field_x = this.field_x + this.field_f;
            }
          }
        }
        if (var4 != -1) {
          mr.field_w.a(new fm(var4, 0, 0, 0), -58);
        }
        var5 = -this.field_m + this.field_x;
        var6 = 0;
        if (var5 > 0) {
          var6 = 1;
        }
        if (var6 > 0) {
          this.field_m = this.field_m + var6;
        }
        boolean decompiledFrameRemainder0 = true;
        if (var6 != param0) {
          if (this.field_t != null &&
            this.field_t.l((byte) -98)) {
            if (((var6 == 0)) &&
              ((null != this.field_t))) {
              this.field_t.a(mr.field_w, (byte) -113);
              this.field_t = null;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            this.field_t = mr.field_w.a(new fm(param2 + 94, 0, 0, 0), -58);
            if (var6 == 0 &&
              null != this.field_t) {
              this.field_t.a(mr.field_w, (byte) -113);
              this.field_t = null;
            }
          }
        } else {
          if (var6 == 0 &&
            null != this.field_t) {
            this.field_t.a(mr.field_w, (byte) -113);
            this.field_t = null;
          }
        }
        this.field_q = 73.0;
        if (param1 >= ona.field_H) {
          var7 = (double)(param1 - ona.field_H);
          if (var7 > 100.0) {
            var7 = 100.0;
          }
          this.field_q = this.field_q + this.field_i * var7;
        }
        if (og.field_m <= param1) {
          var7Lifetime1 = (double)(param1 - og.field_m);
          if (100.0 < var7Lifetime1) {
            var7Lifetime1 = 100.0;
          }
          this.field_q = this.field_q + var7Lifetime1 * this.field_g;
        }
        if (param1 >= ema.field_b) {
          var7Lifetime2 = (double)(param1 - ema.field_b);
          if (var7Lifetime2 > 100.0) {
            var7Lifetime2 = 100.0;
          }
          this.field_q = this.field_q + var7Lifetime2 * this.field_e;
        }
    }

    public static void a(int param0) {
        if (param0 != 1) {
          field_w = (String) null;
        }
        field_w = null;
        field_s = null;
        field_y = null;
    }

    final void a(double param0, double param1, double param2, boolean param3) {
        this.field_i = param2;
        this.field_e = param1;
        this.field_g = param0;
        if (!param3) {
          this.field_i = -0.9605648251097887;
        }
    }

    gsa(hca param0, int[] param1) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        try {
          this.field_o = false;
          this.field_l = false;
          this.field_h = false;
          this.field_p = param1[0];
          this.field_r = param1[1];
          this.field_q = 73.0;
          this.field_k = false;
          this.field_b = false;
          this.field_x = 0;
          this.field_c = param1[2];
          this.field_d = false;
          this.field_m = 0;
          this.field_n = gp.field_i[1] * this.field_r;
          this.field_a = gp.field_i[2] * this.field_c;
          this.field_v = this.field_p * gp.field_i[0];
          var3_int = param0.z(-96);
          if (var3_int != -1) {
            if (bta.field_n[var3_int] == 0) {
              this.field_u = this.field_u + param0.j(false);
            }
            if (1 == bta.field_n[var3_int]) {
              this.field_z = this.field_z + param0.j(false);
            }
            if (2 == bta.field_n[var3_int]) {
              this.field_f = this.field_f + param0.j(false);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("gsa.<init>(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    static {
        field_j = 83;
        field_y = new fpa();
        field_s = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    }
}
