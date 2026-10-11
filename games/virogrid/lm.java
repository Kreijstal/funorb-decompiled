/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lm implements Runnable {
    static lc field_i;
    static String field_g;
    static int field_a;
    volatile boolean field_f;
    volatile boolean field_d;
    volatile ua[] field_h;
    pd field_b;
    static on field_e;
    static int field_j;
    static String field_k;
    static String field_c;

    public static void a(byte param0) {
        field_c = null;
        if (param0 != -94) {
          lm.a(85, 97, false, 87, -111);
        }
        field_g = null;
        field_k = null;
        field_e = null;
        field_i = null;
    }

    final static void a(int param0) {
        qg var1 = (qg) (sg.field_m.b(-109));
        if (var1 == null) {
          var1 = new qg();
        }
        var1.a(df.field_d, df.field_i, df.field_h, (byte) -45, df.field_e, df.field_f, df.field_g, df.field_k);
        if (param0 != 0) {
          return;
        }
        jk.field_a.a(var1, (byte) -37);
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4) {
        int var6 = 0;
        ic stackIn_7_0 = null;
        boolean stackIn_8_1 = false;
        ic stackIn_11_0 = null;
        boolean stackIn_12_1 = false;
        ic stackIn_16_0 = null;
        boolean stackIn_17_1 = false;
        ic stackIn_20_0 = null;
        boolean stackIn_21_1 = false;
        oi stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        int stackIn_26_2 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Virogrid.field_F ? 1 : 0;
        try {
          if (param0 != -1) {
            if (param0 == -2) {
              throw new RuntimeException();
            }
            pj.a(c.field_d, param4 + 256);
            stackIn_25_0 = al.field_j[param0];
            stackIn_25_1 = param3;
            if (!ke.field_p.field_d) {
              stackIn_26_2 = 2;
            } else {
              stackIn_26_2 = 0;
            }
            ((oi) (Object) stackIn_25_0).b(stackIn_25_1, stackIn_26_2, -62);
            if (param1 != -1) {
              ff.a(param1, 0, ff.field_a);
            }
            ul.b((byte) 124);
          } else {
            if (vg.field_I != null) {
              if (ke.field_p.field_d) {
                stackIn_20_0 = vg.field_I;
                stackIn_21_1 = !(!(0.0 > nk.field_K[11]));
                ((ic) (Object) stackIn_20_0).a(stackIn_21_1, 85, c.field_d);
              } else {
                stackIn_16_0 = vg.field_I;
                stackIn_17_1 = !(!(0.0 > nk.field_K[11]));
                ((ic) (Object) stackIn_16_0).a(stackIn_17_1, (byte) 101, we.field_e, c.field_d);
              }
            } else {
              if (ei.field_b != null) {
                if (ke.field_p.field_d) {
                  stackIn_11_0 = ei.field_b;
                  stackIn_12_1 = !(!(nk.field_K[11] < 0.0));
                  ((ic) (Object) stackIn_11_0).a(stackIn_12_1, 99, c.field_d);
                } else {
                  stackIn_7_0 = ei.field_b;
                  stackIn_8_1 = !(!(0.0 > nk.field_K[11]));
                  ((ic) (Object) stackIn_7_0).a(stackIn_8_1, (byte) 58, we.field_e, c.field_d);
                }
              }
            }
          }
          if (db.b((byte) 13, param4)) {
            if (hj.field_h <= 0) {
              return;
            }
            pj.a(c.field_d, param4 + 256);
            var5_int = 1024 * Math.min(-hj.field_h + id.field_c, hj.field_h) / id.field_c;
            if (var5_int > 0) {
              for (var6 = 0; c.field_d.field_B.length > var6; var6++) {
                var7 = (var6 * 173 + 159 * id.field_r) % var5_int - var5_int / 2;
                var8 = 255 & c.field_d.field_B[var6];
                var8 = var8 + var7;
                if (0 <= var8) {
                  if (255 < var8) {
                    var8 = 255;
                  }
                } else {
                  var8 = 0;
                }
                c.field_d.field_B[var6] = oh.a(var8, rb.a(c.field_d.field_B[var6], 16776960));
              }
            }
            ul.b((byte) 105);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var5), "lm.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final void run() {
        int var1_int = 0;
        ua var2 = null;
        int var4 = Virogrid.field_F ? 1 : 0;
        this.field_f = true;
        try {
          while (!this.field_d) {
            for (var1_int = 0; var1_int < 2; var1_int++) {
              var2 = this.field_h[var1_int];
              if (var2 == null) {
              } else {
                var2.c();
              }
            }
            mm.a(-92, 10L);
            Object var5 = (Object) null;
            od.a(this.field_b, (Object) null, (byte) -100);
          }
        } catch (Exception exception) {
          String var6 = (String) null;
          en.a((String) null, (Throwable) ((Object) exception), 1);
        } finally {
          this.field_f = false;
        }
    }

    final static mg[] a(int param0, int param1, int param2, int param3, boolean param4, boolean param5) {
        mg var13 = null;
        mg var14 = null;
        int var6 = 51 / ((34 - param1) / 32);
        int[] var18 = df.field_d;
        int var8 = df.field_e;
        int var9 = df.field_f;
        mg var10 = new mg(16, param2);
        var10.b();
        df.a(0, 0, 16, param2, param3, param0);
        Object var11 = null;
        if (param5) {
          var13 = var10.d();
          var11 = var13;
          var13.b();
          df.b(0, 0, 5, 0);
          df.b(0, 1, 3, 0);
          df.b(0, 2, 2, 0);
          df.b(0, 3, 1, 0);
          df.b(0, 4, 1, 0);
        }
        Object var12 = null;
        if (param4) {
          var14 = var10.d();
          var12 = var14;
          var14.b();
          df.b(11, 0, 5, 0);
          df.b(13, 1, 3, 0);
          df.b(14, 2, 2, 0);
          df.b(15, 3, 1, 0);
          df.b(15, 4, 1, 0);
        }
        df.a(var18, var8, var9);
        return new mg[]{null, null, null, (mg) (var11), var10, (mg) (var12), null, null, null};
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    lm() {
        this.field_h = new ua[2];
        this.field_d = false;
        this.field_f = false;
    }

    static {
        field_g = "Player Name: ";
        field_a = 500;
        field_i = new lc(10, 2, 2, 0);
        field_k = "Players are <%0> and <%1>.";
        field_e = new on();
        field_c = "To <%0>: ";
    }
}
