/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gj {
    static int field_a;

    final static int a(int param0, int param1, int param2, byte[] param3) {
        int var5 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Terraphoenix.field_V;
        try {
          var4_int = -1;
          for (var5 = param1; var5 < param0; var5++) {
            var4_int = dm.field_b[(param3[var5] ^ var4_int) & 255] ^ var4_int >>> 8;
          }
          if (param2 != 255) {
            field_a = -58;
          }
          var4_int = ~var4_int;
          stackIn_7_0 = var4_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("gj.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1, int param2, nb param3, boolean param4) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        try {
          ab.field_g[0] = j.field_H.nextInt();
          ab.field_g[param2] = j.field_H.nextInt();
          ab.field_g[3] = (int)kd.field_c;
          nc.field_c.field_k = 0;
          ab.field_g[2] = (int)(kd.field_c >> 32);
          nc.field_c.e(ab.field_g[0], param2 ^ 8958);
          nc.field_c.e(ab.field_g[1], 8959);
          nc.field_c.e(ab.field_g[2], 8959);
          nc.field_c.e(ab.field_g[3], 8959);
          eh.a(9371, nc.field_c);
          nc.field_c.h(-1564407352, param1);
          param3.a((byte) -2, nc.field_c);
          di.field_l.field_k = 0;
          if (!param0) {
            di.field_l.i(16, 18);
          } else {
            di.field_l.i(18, param2 ^ 16);
          }
          di.field_l.field_k = di.field_l.field_k + 2;
          var5_int = di.field_l.field_k;
          di.field_l.e(nd.field_i, 8959);
          di.field_l.a(pc.field_a, 21);
          var6 = 0;
          if (jm.field_c) {
            var6 = var6 | 1;
          }
          if (hf.field_x) {
            var6 = var6 | 4;
          }
          if (param4) {
            var6 = var6 | 8;
          }
          if (og.field_e != null) {
            var6 = var6 | 16;
          }
          di.field_l.i(var6, -112);
          var7 = kf.a(-95, dg.a(false));
          if (var7 == null) {
            var7 = "";
          }
          di.field_l.a(var7, 2295);
          if (og.field_e != null) {
            di.field_l.b(og.field_e, -108);
          }
          ea.a(ga.field_o, nc.field_c, 0, dj.field_c, di.field_l);
          di.field_l.g(-var5_int + di.field_l.field_k, -20125);
          bc.a(-1, param2 - 1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_23_0 = var5;
          stackIn_23_1 = new StringBuilder().append("gj.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param4).append(')').toString());
        }
    }

    final static boolean a(e param0, int param1, byte param2, int param3) {
        int var4_int = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        var5 = Terraphoenix.field_V;
        try {
          if (param2 < 57) {
            field_a = -15;
          }
          for (var4_int = 0; rd.field_t > var4_int; var4_int++) {
            if (param1 >= p.field_a[var4_int].field_f &&
              p.field_a[var4_int].field_f + 32 >= param1 &&
              param3 >= p.field_a[var4_int].field_e &&
              p.field_a[var4_int].field_e + 32 >= param3 &&
              null != p.field_a[var4_int].field_d) {
              if (!p.field_a[var4_int].field_d.field_k &&
                p.field_a[var4_int].field_d.field_C != 0) {
                sj.field_b = (p.field_a[var4_int].field_d.field_i - p.field_a[var4_int].field_d.field_gb) * 32;
                lg.field_c = (p.field_a[var4_int].field_d.field_i + p.field_a[var4_int].field_d.field_gb) * 16;
                eg.field_p = p.field_a[var4_int].field_d.field_R;
              } else {
                sj.field_b = (-p.field_a[var4_int].field_d.field_H + p.field_a[var4_int].field_d.field_F) * 32;
                lg.field_c = 16 * (p.field_a[var4_int].field_d.field_H + p.field_a[var4_int].field_d.field_F);
                eg.field_p = p.field_a[var4_int].field_d.field_E;
              }
              qd.$cfr$intArgs$a$e9dea5688aa5(69, 33);
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("gj.C(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(bm param0, bm param1, int param2, int param3, pk param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, bm param14, int param15, int param16, pk param17, int param18, int param19, int param20) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var21 = null;
        try {
          pe.a(param3, param4, 48, param17);
          aj.a(param7, -19605, param5, param15, param12);
          tb.a(param8, param2 ^ 21361, param19);
          uh.a(param0, param1, param13, param9, -128, param11);
          ph.a(param10, param14, param16, -1);
          if (param2 != 0) {
            return;
          }
          kb.a(param6, param20, param18, (byte) -83);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var21 = decompiledCaughtException;
          stackIn_6_0 = var21;
          stackIn_6_1 = new StringBuilder().append("gj.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',');
          if (param14 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param15).append(',').append(param16).append(',');
          if (param17 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param18).append(',').append(param19).append(',').append(param20).append(')').toString());
        }
    }

    static {
    }
}
