/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg extends java.awt.Canvas implements java.awt.event.FocusListener {
    volatile boolean field_e;
    static lo field_c;
    java.awt.Frame field_a;
    static String field_b;
    static String field_d;
    static int field_f;

    public final void focusLost(java.awt.event.FocusEvent param0) {
        try {
          this.field_e = true;
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "wg.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(String param0, byte param1, boolean param2, String param3, int param4, String param5, int param6) {
        m var7 = null;
        RuntimeException var7_ref = null;
        m var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7 = new m(param5);
          if (param1 > -45) {
            field_c = (lo) null;
          }
          var8 = new m(param3);
          stackIn_3_0 = wl.a(param0, param2, param4, var7, param6, var8, 4);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_6_0 = var7_ref;
          stackIn_6_1 = new StringBuilder().append("wg.F(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param6).append(')').toString());
        }
    }

    final static int a(boolean param0) {
        dp.field_v.a(77);
        if (param0) {
          km var2 = (km) null;
          wg.a(43, (km) null);
          if (vd.field_f.b(72)) {
            return 0;
          }
          return sm.b(-1);
        }
        if (vd.field_f.b(72)) {
          return 0;
        }
        return sm.b(-1);
    }

    public static void a(int param0) {
        if (param0 == 0) {
          field_c = null;
          field_b = null;
          field_d = null;
          return;
        }
        String var2 = (String) null;
        wg.a((String) null, (byte) 44, true, (String) null, -49, (String) null, 29);
        field_c = null;
        field_b = null;
        field_d = null;
    }

    final void a(tg param0, int param1) {
        try {
          sq.a(param0, -20954, this.field_a);
          int var3_int = -13 / ((param1 - 82) / 32);
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "wg.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void paint(java.awt.Graphics param0) {
    }

    final static void a(int param0, km param1) {
        try {
          if (param0 > -53) {
            field_d = (String) null;
          }
          if (param1.field_a >= 0 &&
            pg.field_k.length > param1.field_a) {
            pg.field_k[param1.field_a] = param1;
            return;
          }
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "wg.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3) {
        int var4_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        mh var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        gb var9 = null;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          if (hj.field_Yb > hc.field_f) {
            hc.field_f = hc.field_f + 1;
          }
          if (kc.field_q.field_f != ej.field_O) {
            rn.field_h = rn.field_h + (-ej.field_O + kc.field_q.field_f);
            ej.field_O = kc.field_q.field_f;
          }
          if (param2 <= ~hc.field_f) {
            return;
          }
          ef.a(param2 - 123);
          gp.field_d.a(param3, -15211);
          if (null != vd.field_a) {
            if (um.field_e) {
              vd.field_a.a(gp.field_d.field_db, gp.field_d.field_Eb, 116, param3);
            } else {
              vd.field_a = null;
            }
          }
          for (var4_int = 0; 5 > var4_int; var4_int++) {
            var5 = ik.field_i[var4_int];
            if (var5 != null) {
              if (var5.field_L != 0) {
                wd.a(784, var4_int, var5);
              }
              var6 = tm.a(var4_int, (byte) 18);
              vj.field_a[var4_int].field_wb = ef.field_b[var6];
              wd.field_F[var4_int].field_Mb = rh.field_e[var6];
            }
          }
          if (mj.field_c.field_L != 0) {
            CircleBody.field_p = new am(mj.field_c.field_Eb, mj.field_c.field_db, mj.field_c.field_Ib, mj.field_c.field_cb, param1, re.field_m, rf.field_c, am.field_Zb, ad.field_l, of.field_k, tk.field_t, (String) null, 0L);
          }
          var9 = sj.a(om.field_oc, np.field_a, -13294, param0);
          if (var9 != null) {
            hj.a(0, var9);
          }
          var8 = pn.c(-9235);
          if (var8 == null) {
            return;
          }
          ep.field_e = var8;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var4), "wg.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    wg() {
    }

    public final void update(java.awt.Graphics param0) {
    }

    static {
        field_c = new lo();
        field_d = "Game full";
        field_b = "Please try again in a few minutes.";
    }
}
