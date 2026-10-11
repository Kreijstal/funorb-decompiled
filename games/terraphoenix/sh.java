/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sh extends uf {
    static String field_x;
    static String field_q;
    int field_i;
    int field_w;
    int field_t;
    int field_y;
    int field_D;
    qd field_B;
    static int[] field_E;
    int field_o;
    int field_v;
    static volatile int field_z;
    int field_h;
    int field_l;
    gm field_m;
    int field_j;
    int field_r;
    int field_s;
    lh field_k;
    static long field_n;
    int field_u;
    gg field_F;
    int field_C;
    int field_G;
    int field_p;
    int field_A;

    public static void c(int param0) {
        field_x = null;
        field_E = null;
        if (param0 > -26) {
          field_x = (String) null;
        }
        field_q = null;
    }

    final static void a(byte param0, int param1, int param2) {
        ll.field_a = param1;
        tf.field_k = param2;
        if (param0 > -110) {
          sh.c(-18);
        }
    }

    final static void a(int param0) {
        int var3 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        String stackIn_28_0 = null;
        String stackIn_34_0 = null;
        int stackIn_39_0 = 0;
        boolean stackIn_40_1 = false;
        bm stackIn_45_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        long var3_long = 0L;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        bm var9 = null;
        int var10 = 0;
        int var7Lifetime1;
        int var8Lifetime1;
        var10 = Terraphoenix.field_V;
        try {
          var1_int = jh.field_m;
          var2 = 0;
          if (2 == pe.field_e) {
            var3_long = -hj.field_I + ll.a(1000);
            var2 = (int)((10999L - var3_long) / 1000L);
            if (var2 < 0) {
              var2 = 0;
            }
          }
          if (param0 != -1) {
            sh.a(-70);
          }
          for (var3 = 0; var3 < rb.field_d.length; var3++) {
            var4 = f.field_a[var3];
            if (var4 < 0) {
              var5 = pl.field_P;
            } else {
              if (ai.field_i.field_h != var4) {
                var5 = eb.field_I;
              } else {
                var5 = ib.field_cb;
              }
            }
            var6 = rb.field_d[var3];
            if (pe.field_e == 2 &&
              var2 == 1) {
              if (ia.field_r.length >= km.field_c.length) {
                stackIn_19_0 = ia.field_r.length;
              } else {
                stackIn_19_0 = km.field_c.length;
              }
              var7 = stackIn_19_0;
              if (kj.field_c.length < ec.field_d.length) {
                stackIn_22_0 = ec.field_d.length;
              } else {
                stackIn_22_0 = kj.field_c.length;
              }
              var8 = stackIn_22_0;
              if (6 <= var3 &&
                var3 < 6 + var7) {
                if (0 <= -var7 + (ia.field_r.length + var3 - 6)) {
                  stackIn_28_0 = ia.field_r[-var7 + ia.field_r.length + var3 - 6];
                } else {
                  stackIn_28_0 = "";
                }
                var6 = stackIn_28_0;
              }
              if (var3 >= 7 + var7 &&
                var8 + var7 + 7 > var3) {
                if (var3 - 7 - var7 < kj.field_c.length) {
                  stackIn_34_0 = kj.field_c[-7 + (var3 - var7)];
                } else {
                  stackIn_34_0 = "";
                }
                var6 = stackIn_34_0;
              }
            }
            if (-2 == var4) {
              var6 = Integer.toString(var2);
            }
            stackIn_39_0 = 87;
            stackIn_40_1 = !(var4 < 0);
            var7Lifetime1 = bb.$cfr$intArgs$a$62abead39cee(stackIn_39_0, stackIn_40_1, var6);
            var8Lifetime1 = -(var7Lifetime1 >> 1) + nd.field_r;
            if (var4 >= 0) {
              if (var4 == ai.field_i.field_h) {
                stackIn_45_0 = sa.field_c;
              } else {
                stackIn_45_0 = pj.field_q;
              }
              var9 = stackIn_45_0;
              var1_int = var1_int + hi.field_ab;
              if (var9 != null) {
                var9.a(var7Lifetime1 + (se.field_j << 1), var8Lifetime1 - se.field_j, lm.field_d + (dc.field_b << 1), 0, var1_int);
              }
              var1_int = var1_int + dc.field_b;
            }
            if (0 > var4) {
              da.field_h.b(var6, var8Lifetime1, af.field_a + var1_int, var5, -1);
              var1_int = var1_int + jm.field_b;
            } else {
              qk.field_a.b(var6, var8Lifetime1, var1_int + fh.field_a, var5, -1);
              var1_int = var1_int + (hi.field_ab + dc.field_b + lm.field_d);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var1), "sh.A(" + param0 + ')');
        }
    }

    final void c(byte param0) {
        this.field_F = null;
        this.field_m = null;
        this.field_k = null;
        this.field_B = null;
        if (param0 >= -107) {
          sh.c(-17);
        }
    }

    sh() {
    }

    static {
        field_q = "Account created successfully!";
        field_z = 0;
        field_E = new int[192];
        field_x = "This game has been updated! Please reload this page.";
    }
}
