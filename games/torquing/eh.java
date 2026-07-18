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
        gp.j((byte) -34);
        od.b(128, 4);
    }

    public static void b(byte param0) {
        field_b = null;
        int var1 = 1;
        field_i = null;
        field_e = null;
    }

    abstract lm a(byte param0);

    final void b(int param0) {
        lm var2 = null;
        var2 = ((eh) this).a((byte) -57);
        if (((eh) this).field_d == null) {
          ((eh) this).field_h.a(var2);
          ((eh) this).field_d = var2;
          if (param0 == 1) {
            return;
          } else {
            field_i = null;
            return;
          }
        } else {
          if (((eh) this).field_d.a(var2)) {
            ((eh) this).field_d = var2;
            if (param0 != 1) {
              field_i = null;
              return;
            } else {
              return;
            }
          } else {
            ((eh) this).field_h.b(((eh) this).field_d);
            ((eh) this).field_h.a(var2);
            ((eh) this).field_d = var2;
            if (param0 == 1) {
              return;
            } else {
              field_i = null;
              return;
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3) {
        int var4 = 0;
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
    }

    eh(double param0, double param1, double param2) {
        ((eh) this).field_g = new double[13];
        ((eh) this).field_f = new int[]{0, 0, 0, 65536, 0, 0, 0, 65536, 0, 0, 0, 65536};
        ((eh) this).field_g[2] = param2;
        ((eh) this).field_g[6] = 1.0;
        ((eh) this).field_g[1] = param1;
        ((eh) this).field_g[0] = param0;
    }

    final void a(int param0) {
        if (((eh) this).field_c >= 0) {
          if (param0 != 80) {
            ((eh) this).field_a = null;
            ((eh) this).field_h.d(((eh) this).field_c);
            ((eh) this).field_h.b(((eh) this).field_d);
            return;
          } else {
            ((eh) this).field_h.d(((eh) this).field_c);
            ((eh) this).field_h.b(((eh) this).field_d);
            return;
          }
        } else {
          return;
        }
    }

    final void c(int param0) {
        ei.field_c.field_e = ((eh) this).field_g[9];
        ei.field_c.field_b = ((eh) this).field_g[8];
        ei.field_c.field_d = ((eh) this).field_g[7];
        ((eh) this).field_f[param0] = (int)(0.5 + ((eh) this).field_g[0]);
        ei.field_c.field_a = ((eh) this).field_g[6];
        ((eh) this).field_f[2] = (int)(0.5 + ((eh) this).field_g[2]);
        ((eh) this).field_f[1] = (int)(((eh) this).field_g[1] + 0.5);
        ei.field_c.a((byte) -127);
        ((eh) this).field_g[7] = ei.field_c.field_d;
        ((eh) this).field_g[9] = ei.field_c.field_e;
        ((eh) this).field_g[8] = ei.field_c.field_b;
        ((eh) this).field_g[6] = ei.field_c.field_a;
        ei.field_c.a(((eh) this).field_f, (byte) 118);
        ((eh) this).field_h.a(((eh) this).field_c, ((eh) this).field_f[0], ((eh) this).field_f[1], ((eh) this).field_f[2]);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = null;
        field_e = "Members' Benefits";
    }
}
