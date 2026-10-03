/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ac extends ff {
    static gk field_v;
    static int field_s;
    static String[] field_r;
    static ff field_t;
    static int[] field_w;
    static int field_u;

    ac(m param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_o, -1, 2147483647, false);
    }

    ac(int param0) {
        this(ng.field_F, param0);
    }

    public final void a(int param0, int param1, int param2, boolean param3, el param4) {
        try {
            if (param3) {
                ik.a(param0 + param4.field_v, param4.field_h, param4.field_m + param2, param4.field_r, -1540604944);
            }
            if (param1 > -5) {
                field_t = (ff) null;
            }
            super.a(param0, -11, param2, param3, param4);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "ac.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static sl a(int param0, String[] param1) {
        sl var2 = null;
        RuntimeException var2_ref = null;
        sl stackIn_2_0 = null;
        sl stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 28) {
            stackIn_2_0 = (sl) null;
            return stackIn_2_0;
          }
          var2 = new sl(false);
          var2.field_a = param1;
          stackIn_4_0 = var2;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_7_0 = var2_ref;
          stackIn_7_1 = new StringBuilder().append("ac.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static boolean a(byte param0, pk param1) {
        RuntimeException var2 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 6) {
            ac.a((byte) -125);
          }
          stackIn_5_0 = !(1 != param1.e((byte) -17, 1));
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("ac.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static void a(boolean param0, boolean param1, byte param2) {
        int incrementValue$0 = 0;
        int var13 = 0;
        int stackIn_7_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_60_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        var14 = Geoblox.field_C;
        try {
          var3_int = 160;
          var4 = 190;
          if (!param0) {
            var4 -= 10;
          }
          if (!param1) {
            stackIn_7_0 = vl.field_p;
          } else {
            stackIn_7_0 = ug.field_c;
          }
          var5 = stackIn_7_0;
          var6 = 0;
          var7 = a.field_e;
          var8 = 0;
          var9 = 0;
          if (param1) {
            for (var10 = 16; var10 >= 0; var10--) {
              if ((!((!da.a(0, -100)) &&
                    (var10 == 16))) &&
                  ((1 << var10 & var5) == 0)) {
                var9++;
                var8 += 20;
              }
            }
          }
          if (8 <= var9) {
            var3_int = var3_int + (-160 + var8);
          }
          for (var10 = 0; var10 < pg.field_a.length; var10++) {
            if ((!da.a(0, -119)) &&
                (var10 == 16) &&
                (!qi.d(105))) {
              continue;
            }
            if ((!((0 == (1 << var10 & var5)) &&
                  (param1))) &&
                ((qa.field_a >= var3_int) &&
                  (32 + var3_int >= qa.field_a) &&
                  (var4 <= ue.field_e) &&
                  (32 + var4 >= ue.field_e))) {
              vb.c(var3_int, var4, 32, 32, 2, 16689938);
              if (var7 < 0) {
                var7 = var10;
              }
              vb.a(2 + var3_int, var4 + 2, 28, 28, 2, 16777215);
            }
            if (var10 == a.field_e) {
              vb.c(var3_int, var4, 32, 32, 2, 15488514);
              vb.a(var3_int + 2, var4 + 2, 28, 28, 2, 16777215);
            }
            if ((var5 & 1 << var10) == 0) {
              if (param1) {
                continue;
              }
              am.field_b.f(var3_int, var4);
            } else {
              sl.field_f[var10].f(var3_int, var4);
            }
            incrementValue$0 = var6;
            var6++;
            if (incrementValue$0 == 7) {
              var4 += 40;
              var3_int = 160;
              if (!param0) {
                var4 += 5;
              }
              if (!param1) {
                continue;
              }
              if (var9 < 8) {
                var3_int = var3_int + var8;
              }
            } else {
              var3_int += 40;
            }
          }
          stackIn_59_0 = 190;
          if (!param0) {
            stackIn_60_1 = -20;
          } else {
            stackIn_60_1 = -2;
          }
          var10 = stackIn_59_0 + stackIn_60_1;
          if (var7 != -1) {
            fi.field_d.b(pg.field_a[var7], 315, var10, 0, -1);
            var11 = -fi.field_d.field_q + fi.field_d.field_o;
            var12 = 280;
            if (0 != (1 << var7 & var5)) {
              sl.field_f[var7].b(160, var12);
              var12 += 30;
              dd.field_G.a(kd.field_a, 318, var12, 0, -1);
            } else {
              am.field_b.b(160, var12);
              var12 += 30;
              dd.field_G.field_K[0][wf.field_p] = 15488514;
              dd.field_G.a(ib.field_d, 318, var12, 0, -1);
              dd.field_G.field_K[0][wf.field_p] = 16689938;
            }
            var12 = var12 + (fi.field_d.a(ri.field_b[var7], 318, var12, 190, 200, 0, -1, 0, 0, 16) * var11 + var11);
            var12 += 10;
            fi.field_d.a(wj.a(sl.field_h, new String[]{Integer.toString(th.field_h[var7])}, (byte) -50), 318, 360, 0, -1);
            for (var13 = 0; var13 < kk.field_s[var7]; var13++) {
              uk.field_m.f(318 + 10 * var13, 370);
            }
            var12 = var12 + var11;
          } else {
            fi.field_d.b(w.field_a, 315, var10, 0, -1);
            if (fh.c(-94)) {
              dd.field_G.a(ni.field_C, 125, 350, 395, 100, 0, -1, 1, 0, 26);
            }
          }
          if (param2 > -61) {
            field_u = 108;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var3), "ac.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(byte param0) {
        field_t = null;
        field_r = null;
        field_w = null;
        field_v = null;
        if (param0 < 62) {
            field_s = -128;
        }
    }

    static {
        field_v = new gk();
        field_r = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
        field_w = new int[8192];
        field_u = 11;
    }
}
