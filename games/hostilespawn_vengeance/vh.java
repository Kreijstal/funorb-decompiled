/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vh {
    private bd[] field_b;
    static java.awt.Font field_d;
    static byte[][] field_a;
    static String field_c;

    final static void a(oj param0, int param1, oj param2) {
        int stackIn_23_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_58_2 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_61_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        double var3_double = 0.0;
        RuntimeException var3 = null;
        int var4 = 0;
        double var5_double = 0.0;
        int var5 = 0;
        double var7 = 0.0;
        oc var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var3_intLifetime1;
        double var3_doubleLifetime1;
        int var10Lifetime1;
        var13 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (!param2.field_n) {
            if (!kc.a((byte) -124, param2.field_j)) {
              nl.field_b = 180;
              param2.field_I = 1000;
              return;
            }
            pm.field_a = true;
            param2.field_w = 1;
            param2.field_n = true;
            tk.a(1, jc.field_c, 31, true);
          }
          nl.field_b = 256;
          if (param2.field_e > 0) {
            param2.field_e = param2.field_e - 1;
          } else {
            var3_int = (int)(((double)param0.field_j.field_e + param0.field_l.field_f - (double)param2.field_j.field_e - param2.field_l.field_f) * 24.0);
            var4 = (int)(24.0 * (-param2.field_l.field_a + (param0.field_l.field_a + (double)param0.field_j.field_g - (double)param2.field_j.field_g)));
            if (512 >= Math.abs(var3_int) &&
              Math.abs(var4) <= 512) {
              param2.field_e = param2.field_e - 1;
              if (param2.field_e < 0) {
                mm.field_m[el.field_j] = new oj(param2.field_j, 3, rl.field_c);
                mm.field_m[el.field_j].field_M = 0;
                el.field_j = el.field_j + 1;
                param2.field_e = 100;
              }
            }
          }
          param2.field_p = param2.field_p + 1;
          if (param2.field_w != 4) {
            if (param2.field_p >= param2.field_C) {
              param2.field_p = 0;
              param2.field_z = param2.field_z + 1;
            }
          } else {
            if (param2.field_p >= 4) {
              param2.field_p = 0;
              param2.field_z = param2.field_z + 1;
            }
            if (param2.field_z == 6 &&
              0 == param2.field_p) {
              var3_double = param2.field_c * 3.141592653589793 / 128.0;
              var5_double = param2.field_l.field_f + ((double)param2.field_j.field_e - 0.5) - Math.sin(var3_double);
              var7 = param2.field_l.field_a + ((double)param2.field_j.field_g - 0.5) - Math.cos(var3_double);
              var9 = new oc((int)var5_double, (int)var7);
              var10 = var9.b(-4);
              wh.a(true, var10);
              wh.a(true, var10 - ln.field_a.field_d);
              wh.a(true, -1 + var10);
              wh.a(true, 1 + var10);
              wh.a(true, var10 + ln.field_a.field_d);
              wh.a(true, -ln.field_a.field_d + var10 - 1);
              wh.a(true, var10 - 1 + ln.field_a.field_d);
              wh.a(true, -ln.field_a.field_d + (var10 + 1));
              wh.a(true, ln.field_a.field_d + var10 + 1);
              var10Lifetime1 = param2.field_j.b(-4);
              stackIn_23_0 = (128.0 > param2.field_c) ? -1 : 1;
              var11 = stackIn_23_0;
              if (!(64.0 > param2.field_c) &&
                !(param2.field_c > 192.0)) {
                stackIn_28_0 = ln.field_a.field_d;
              } else {
                stackIn_28_0 = -ln.field_a.field_d;
              }
              var12 = stackIn_28_0;
              wh.a(true, var10Lifetime1);
              wh.a(true, var11 + var10Lifetime1);
              wh.a(true, var12 + var10Lifetime1);
              wh.a(true, var12 + (var10Lifetime1 + var11));
            }
            if (re.field_D[4].length <= param2.field_z) {
              param2.field_z = 0;
              param2.field_w = 1;
            }
          }
          if (1 == param2.field_w) {
            var3_doubleLifetime1 = nh.a(-12149, param2, param0);
            param2.a(param1 ^ 228, var3_doubleLifetime1, 3);
            li.field_r = param2.a(ln.field_a, 128, param2.field_o);
            var5 = param2.field_j.b(param1 - 9);
            wh.a(true, var5);
            wh.a(true, var5 - 1);
            wh.a(true, var5 - ln.field_a.field_d);
            wh.a(true, -1 + var5 - ln.field_a.field_d);
            if (li.field_r[0] ||
              li.field_r[1]) {
              param2.field_p = 0;
              param2.field_z = 0;
              param2.field_w = 4;
              if (1 == uj.field_l) {
                tk.a(5, jc.field_c, 35, true);
              }
            }
          }
          if (0 >= param2.field_I &&
            param2.field_w != 5) {
            param2.field_w = 5;
            param2.e((byte) -49);
            param2.field_p = 0;
            param2.field_z = 0;
          }
          if (param1 == param2.field_w) {
            if (param2.field_z != re.field_D[5].length) {
              return;
            }
            param2.c((byte) -86);
            for (var3_intLifetime1 = 0; 10 > var3_intLifetime1; var3_intLifetime1++) {
              mm.field_m[el.field_j] = new oj(param2.field_j, 3, rl.field_c);
              el.field_j = el.field_j + 1;
            }
            if (bm.field_c == 0) {
              kd.a(0, 1);
            }
            bn.a(3, param2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_57_0 = var3;
          stackIn_57_1 = new StringBuilder().append("vh.A(");
          if (param0 == null) {
            stackIn_58_2 = "null";
          } else {
            stackIn_58_2 = "{...}";
          }
          stackIn_60_1 = ((StringBuilder) (Object) stackIn_57_1).append(stackIn_58_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_61_2 = "null";
          } else {
            stackIn_61_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_57_0), ((StringBuilder) (Object) stackIn_60_1).append(stackIn_61_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        hm.a(param0, this.field_b, false, param2, param1, param3);
        if (param4 != 5) {
          field_d = (java.awt.Font) null;
        }
    }

    final static boolean a(String param0, int param1, String param2) {
        String var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          param0 = v.a(-18214, '_', "", param0);
          if (param1 != 29360) {
            field_a = (byte[][]) null;
          }
          var3 = ia.a(param2, 10);
          stackIn_7_0 = (-1 != param0.indexOf(param2)) || (-1 != param0.indexOf(var3));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("vh.D(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static void a(byte param0, int param1) {
        int var2_int = 0;
        am var3 = null;
        int var4 = 0;
        hm var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = HostileSpawn.field_I ? 1 : 0;
        try {
          var5 = (hm) (ih.field_x.g(-77));
          while (var5 != null) {
            ci.a(param1, 2, var5);
            var5 = (hm) (ih.field_x.a(12684));
          }
          var2_int = 109 / ((param0 + 73) / 52);
          var3 = ei.field_h.g(-79);
          while (var3 != null) {
            wg.d(-9420, param1);
            var3 = ei.field_h.a(12684);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var2), "vh.C(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        if (param0) {
          field_c = (String) null;
        }
        field_d = null;
        field_a = (byte[][]) null;
    }

    vh(bd[] param0) {
        try {
          this.field_b = param0;
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "vh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
