/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ch implements wr {
    static bi field_c;
    static String field_a;
    static String field_b;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9 = 0;
        int[] var8 = null;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8_ref = null;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var14 = new int[4];
          var13 = var14;
          var12 = var13;
          var8 = var12;
          gf.a(var14);
          if (param2 * 2 > param3) {
            return;
          }
          gf.f(param2 + param4, param5, param3 - 2 * param2, param1);
          gf.f(param2 + param4, param5 + param7, -(2 * param2) + param3, param6);
          gf.i(param4, param5, param4 + param2, param5 + param2);
          gf.b(param2 + param4, param5 + param2, param2, param1);
          gf.b(var14);
          gf.i(param4 + (param3 - param2), param5, param4 + param3, param5 + param2);
          gf.b(-param2 + param3 + (param4 - 1), param5 + param2, param2, param1);
          gf.b(var14);
          gf.i(param4, -param2 + (param7 + param5), param4 + param2, param5 + param7);
          gf.b(param4 + param2, -1 + (param7 + param5 - param2), param2, param6);
          gf.b(var14);
          gf.i(-param2 + (param3 + param4), param5 + param7 - param2, param4 + param3, param5 + param7);
          gf.b(-1 + param4 - (-param3 + param2), param7 + param5 - (param2 + 1), param2, param6);
          gf.b(var14);
          if (param0 != 20) {
            field_a = (String) null;
          }
          for (var9 = 0; -20 + param7 > var9; var9++) {
            var10 = ui.a(param1, param6, param0 ^ -72, 256 * var9 / (param7 - 20));
            gf.a(param4, param2 + (param5 + var9), var10);
            gf.a(-1 + (param3 + param4), var9 + (param5 + param2), var10);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var8_ref), "ch.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param0 != -15073) {
            field_a = (String) null;
          }
          var3_int = 0;
          var4 = vo.field_b;
          while (t.field_c.length > var3_int) {
            var5 = pr.field_d[var3_int];
            if (0 <= var5) {
              var6 = or.a(true, t.field_c[var3_int], true);
              var4 = var4 + js.field_e;
              var7 = -(var6 >> 1) + ol.field_e;
              if (ek.a((uo.field_g << 1) + vh.field_b, param2, var7 - js.field_g, (byte) -100, var4, (js.field_g << 1) + var6, param1)) {
                stackIn_10_0 = var5;
                return stackIn_10_0;
              }
              var4 = var4 + (vh.field_b + (js.field_e + (uo.field_g << 1)));
            } else {
              var4 = var4 + fe.field_A;
            }
            var3_int++;
          }
          stackIn_15_0 = -1;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var3), "ch.G(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static bi a(bc param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        bi stackIn_5_0 = null;
        bi stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!vd.a(param3, param0, param2, 2)) {
            return null;
          }
          if (param1 < -104) {
            stackIn_7_0 = ed.a(true);
            return stackIn_7_0;
          }
          stackIn_5_0 = (bi) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("ch.A(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static qh a(byte param0) {
        ne.field_l = new qh(0, 60, 238, 300, ShatteredPlansClient.field_L.toUpperCase());
        fe var1 = new fe(-16 + ne.field_l.field_k + ne.field_l.field_m, 2 + ne.field_l.field_t, 11, 11, -1, (bi) null, "X", 16711680);
        var1.field_h = ne.field_l;
        lh var2 = new lh(-20 + ne.field_l.field_m, ne.field_l.field_t + 20, -28 + ne.field_l.field_i, 3974311);
        int var3 = -24 / ((param0 - 57) / 47);
        ne.field_l.a(var1, 8);
        ne.field_l.a(var2, 8);
        lp var4 = new lp(ne.field_l.field_k + 9, 20 + ne.field_l.field_t, 209, ne.field_l.field_i - 28);
        ne.field_l.a(var4, 8);
        ne.field_l.field_z = var4;
        var2.field_x = (gj) ((Object) var4);
        em var5 = new em();
        ne.field_l.field_x = (jk) ((Object) var5);
        var5.field_e = var2;
        return ne.field_l;
    }

    final static bi[] a(int param0, byte param1, bc param2, int param3) {
        RuntimeException var4 = null;
        bc var5 = null;
        Object stackIn_4_0 = null;
        bi[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 87) {
            var5 = (bc) null;
            ch.a((bc) null, 22, -122, 78);
          }
          if (vd.a(param3, param2, param0, 2)) {
            stackIn_6_0 = rq.a(0);
            return stackIn_6_0;
          }
          stackIn_4_0 = null;
          return (bi[]) (stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("ch.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    final static int a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var1_int = 0;
          if (param0 <= 86) {
            stackIn_3_0 = 86;
            return stackIn_3_0;
          }
          while (cc.$cfr$intArgs$e$296a4c2b494e(55)) {
            ns.field_nb.b(0);
            if (!ns.field_nb.a((byte) -82)) {
              continue;
            }
            var1_int = 1;
          }
          ns.field_nb.a(-1, ch.a(-15073, td.field_P, nh.field_p), ch.a(-15073, bb.field_b, pd.field_k));
          if (ns.field_nb.a((byte) 36)) {
            var1_int = 1;
          }
          var2 = 0;
          if (var1_int != 0 &&
            0 <= ns.field_nb.field_c) {
            var2 = fs.field_y[ns.field_nb.field_c];
            if (var2 == 2) {
              oi.a(true);
            }
          }
          stackIn_15_0 = var2;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1), "ch.D(" + param0 + ')');
        }
    }

    public static void b(byte param0) {
        int var1 = 1 % ((-34 - param0) / 52);
        field_c = null;
        field_a = null;
        field_b = null;
    }

    static {
        field_b = "Percentage of fleets attacking each turn (average for game).";
        field_a = "Sorry, you were removed from the game you were in. This can happen if you are disconnected for too long or if the server is updated.";
    }
}
