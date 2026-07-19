/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class eh {
    int field_c;
    lm field_d;
    sg field_h;
    int[] field_f;
    static bc field_i;
    static ei field_b;
    double[] field_g;
    hc field_a;
    static String field_e;

    eh() {
        this(0.0, 0.0, 0.0);
    }

    final static void c(byte param0) {
        if (param0 != 90) {
            field_b = (ei) null;
            gp.j((byte) -34);
            od.b(128, 4);
            return;
        }
        gp.j((byte) -34);
        od.b(128, 4);
    }

    public static void b(byte param0) {
        field_b = null;
        int var1 = 125 % ((param0 - 14) / 44);
        field_i = null;
        field_e = null;
    }

    abstract lm a(byte param0);

    final void b(int param0) {
        lm var2 = null;
        var2 = this.a((byte) -57);
        if (this.field_d == null) {
          this.field_h.a(var2);
          this.field_d = var2;
          if (param0 == 1) {
            return;
          } else {
            field_i = (bc) null;
            return;
          }
        } else {
          if (this.field_d.a(var2)) {
            this.field_d = var2;
            if (param0 != 1) {
              field_i = (bc) null;
              return;
            } else {
              return;
            }
          } else {
            this.field_h.b(this.field_d);
            this.field_h.a(var2);
            this.field_d = var2;
            if (param0 == 1) {
              return;
            } else {
              field_i = (bc) null;
              return;
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3) {
        int var4 = 0;
        if (param2 == 0) {
          jg.field_t.d(param1, param0);
          if (param3) {
            L0: {
              var4 = ke.field_c % jg.field_t.field_s * 2;
              if (jg.field_t.field_s > var4) {
                break L0;
              } else {
                var4 = -var4 + jg.field_t.field_s + jg.field_t.field_s;
                break L0;
              }
            }
            if (var4 < 10) {
              var4 = 10;
              eq.a(jg.field_t, 0, 1, var4, param1, param0, 80, 0, 30);
              return;
            } else {
              if (jg.field_t.field_s - 40 >= var4) {
                eq.a(jg.field_t, 0, 1, var4, param1, param0, 80, 0, 30);
                return;
              } else {
                var4 = jg.field_t.field_s - 40;
                eq.a(jg.field_t, 0, 1, var4, param1, param0, 80, 0, 30);
                return;
              }
            }
          } else {
            return;
          }
        } else {
          eh.b((byte) -115);
          jg.field_t.d(param1, param0);
          if (param3) {
            L1: {
              var4 = ke.field_c % jg.field_t.field_s * 2;
              if (jg.field_t.field_s > var4) {
                break L1;
              } else {
                var4 = -var4 + jg.field_t.field_s + jg.field_t.field_s;
                break L1;
              }
            }
            if (var4 < 10) {
              var4 = 10;
              eq.a(jg.field_t, 0, 1, var4, param1, param0, 80, 0, 30);
              return;
            } else {
              if (jg.field_t.field_s - 40 >= var4) {
                eq.a(jg.field_t, 0, 1, var4, param1, param0, 80, 0, 30);
                return;
              } else {
                var4 = jg.field_t.field_s - 40;
                eq.a(jg.field_t, 0, 1, var4, param1, param0, 80, 0, 30);
                return;
              }
            }
          } else {
            return;
          }
        }
    }

    eh(double param0, double param1, double param2) {
        this.field_g = new double[13];
        this.field_f = new int[]{0, 0, 0, 65536, 0, 0, 0, 65536, 0, 0, 0, 65536};
        this.field_g[2] = param2;
        this.field_g[6] = 1.0;
        this.field_g[1] = param1;
        this.field_g[0] = param0;
    }

    final void a(int param0) {
        if ((this.field_c ^ -1) <= -1) {
          if (param0 != 80) {
            this.field_a = (hc) null;
            this.field_h.d(this.field_c);
            this.field_h.b(this.field_d);
            return;
          } else {
            this.field_h.d(this.field_c);
            this.field_h.b(this.field_d);
            return;
          }
        } else {
          return;
        }
    }

    final void c(int param0) {
        ei.field_c.field_e = this.field_g[9];
        ei.field_c.field_b = this.field_g[8];
        ei.field_c.field_d = this.field_g[7];
        this.field_f[param0] = (int)(0.5 + this.field_g[0]);
        ei.field_c.field_a = this.field_g[6];
        this.field_f[2] = (int)(0.5 + this.field_g[2]);
        this.field_f[1] = (int)(this.field_g[1] + 0.5);
        ei.field_c.a((byte) -127);
        this.field_g[7] = ei.field_c.field_d;
        this.field_g[9] = ei.field_c.field_e;
        this.field_g[8] = ei.field_c.field_b;
        this.field_g[6] = ei.field_c.field_a;
        ei.field_c.a(this.field_f, (byte) 118);
        this.field_h.a(this.field_c, this.field_f[0], this.field_f[1], this.field_f[2]);
    }

    static {
        field_i = null;
        field_e = "Members' Benefits";
    }
}
