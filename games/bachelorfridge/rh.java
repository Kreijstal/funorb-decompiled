/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rh {
    static String field_a;

    final static int a(int param0, byte param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = BachelorFridge.field_y;
        try {
          if (param1 > -122) {
            field_a = (String) null;
          }
          var3_int = 0;
          var4 = vka.field_q;
          while (pt.field_a.length > var3_int) {
            var5 = gn.field_l[var3_int];
            if (var5 < 0) {
              var4 = var4 + un.field_i;
            } else {
              var6 = hka.a(true, true, pt.field_a[var3_int]);
              var4 = var4 + raa.field_J;
              var7 = sd.field_a - (var6 >> 1);
              if (hha.a(jo.field_t + (pba.field_r << 1), param2, var6 + (hna.field_k << 1), 1, var7 - hna.field_k, var4, param0)) {
                stackIn_9_0 = var5;
                return stackIn_9_0;
              }
              var4 = var4 + (raa.field_J + (pba.field_r << 1) + jo.field_t);
            }
            var3_int++;
          }
          stackIn_14_0 = -1;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var3), "rh.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        CharSequence var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 19007) {
            return;
          }
          var2 = param1.getParameter("username");
          if (var2 != null) {
            var3 = (CharSequence) ((Object) var2);
            if (0L != mp.a(var3, true)) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_8_0 = var2_ref;
          stackIn_8_1 = new StringBuilder().append("rh.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
          return;
        }
        field_a = null;
    }

    final static void a(int param0, int param1, boolean param2, int param3) {
        int var4_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        sna var5 = null;
        int var6 = 0;
        int var7 = 0;
        eaa var8 = null;
        String var9 = null;
        gs var10 = null;
        var7 = BachelorFridge.field_y;
        try {
          if (saa.field_b > eb.field_t) {
            eb.field_t = eb.field_t + 1;
          }
          if (hga.field_U.field_f != pda.field_p) {
            fs.field_f = fs.field_f + (hga.field_U.field_f - pda.field_p);
            pda.field_p = hga.field_U.field_f;
          }
          if (eb.field_t <= 0) {
            return;
          }
          iv.b(false);
          if (param1 < 45) {
            var8 = (eaa) null;
            rh.a(true, (eaa) null);
          }
          i.field_a.a(19842, param2);
          if (ao.field_d != null) {
            if (hl.field_I) {
              ao.field_d.a(param2, i.field_a.field_D, i.field_a.field_M, 6381);
            } else {
              ao.field_d = null;
            }
          }
          for (var4_int = 0; var4_int < 5; var4_int++) {
            var5 = r.field_l[var4_int];
            if (var5 != null) {
              if (0 != var5.field_R) {
                qca.a(var4_int, var5, (byte) 124);
              }
              var6 = af.a(var4_int, 26291);
              wg.field_i[var4_int].field_v = gi.field_b[var6];
              bda.field_m[var4_int].field_Z = qo.field_a[var6];
            }
          }
          if (kg.field_a.field_R != 0) {
            wt.field_n = new uq(kg.field_a.field_D, kg.field_a.field_M, kg.field_a.field_sb, kg.field_a.field_p, param3, qaa.field_d, mda.field_c, sm.field_s, qs.field_m, nr.field_v, dla.field_k, (String) null, 0L);
          }
          var10 = iu.a(param0, (byte) 114, gba.field_Bb, rg.field_h);
          if (var10 != null) {
            om.a(var10, (byte) -111);
          }
          var9 = gr.a(2);
          if (var9 != null) {
            jja.field_m = var9;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var4), "rh.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(boolean param0, eaa param1) {
        int var2_int = 0;
        int var3 = 0;
        kha var4 = null;
        int var5 = 0;
        int var6 = BachelorFridge.field_y;
        try {
          if (bp.e(-29919)) {
            throw new IllegalStateException();
          }
          sja.field_fb.c(80, (byte) 107);
          if (param0) {
            field_a = (String) null;
          }
          sja.field_fb.field_g = sja.field_fb.field_g + 2;
          var2_int = sja.field_fb.field_g;
          sja.field_fb.field_g = sja.field_fb.field_g + 1;
          var3 = 0;
          var4 = (kha) (param1.b((byte) 90));
          while (var4 != null) {
            sja.field_fb.d(var4.field_h, 0);
            var3++;
            sja.field_fb.d(var4.field_g, 0);
            var4 = (kha) (param1.c(0));
          }
          var5 = sja.field_fb.field_g;
          sja.field_fb.field_g = var2_int;
          sja.field_fb.d(var3, 0);
          sja.field_fb.field_g = var5;
          sja.field_fb.a((byte) -88, -var2_int + sja.field_fb.field_g);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "rh.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "<%0> ready!";
    }
}
