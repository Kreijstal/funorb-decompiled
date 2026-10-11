/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ai {
    static int[] field_b;
    static bc field_c;
    static String[] field_d;
    static int field_a;
    static int field_e;

    final static void a(int param0, boolean param1, int param2, int param3, byte param4, int param5, int param6) {
        int var11 = 0;
        int incrementValue$0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var7_intLifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        var14 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param0 <= param2) {
            return;
          }
          if (param3 <= param2 + 1) {
            return;
          }
          if (5 + param2 < param3 &&
            param5 != param6) {
            var7_int = (param6 >> 1) + ((param5 >> 1) + (1 & (param5 & param6)));
            var8 = param2;
            var9 = param6;
            var10 = param5;
            for (var11 = param2; param3 > var11; var11++) {
              var12 = lg.field_d[var11];
              if (!param1) {
                stackIn_25_0 = dc.field_c[var12];
              } else {
                stackIn_25_0 = kf.field_f[var12];
              }
              var13 = stackIn_25_0;
              if (var7_int >= var13) {
                if (var10 < var13) {
                  var10 = var13;
                }
              } else {
                lg.field_d[var11] = lg.field_d[var8];
                if (var13 < var9) {
                  var9 = var13;
                }
                incrementValue$0 = var8;
                var8++;
                lg.field_d[incrementValue$0] = var12;
              }
            }
            ai.a(param0, param1, param2, var8, param4, var9, param6);
            ai.a(param0, param1, var8, param3, (byte) -60, param5, var10);
            return;
          }
          for (var7_intLifetime1 = param3 - 1; param2 < var7_intLifetime1; var7_intLifetime1--) {
            for (var8Lifetime1 = param2; var7_intLifetime1 > var8Lifetime1; var8Lifetime1++) {
              var9Lifetime1 = lg.field_d[var8Lifetime1];
              var10Lifetime1 = lg.field_d[var8Lifetime1 + 1];
              if (aq.a(var10Lifetime1, true, var9Lifetime1, param1)) {
                lg.field_d[var8Lifetime1] = var10Lifetime1;
                lg.field_d[var8Lifetime1 + 1] = var9Lifetime1;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var7), "ai.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_c = null;
        field_d = null;
        if (param0 != 1) {
          ai.a((byte) 116);
        }
    }

    final static void a(boolean param0) {
        double var1 = 3.141592653589793 * (double)(cl.field_n % 512) / 256.0;
        int var3 = 16 * (vg.field_t.field_z / 2 - 9);
        em.field_c[0] = (int)((double)var3 * Math.sin(var1));
        ul.field_Db[0] = (int)(Math.cos(var1) * (double)var3);
        em.field_c[1] = -em.field_c[0];
        ul.field_Db[1] = -ul.field_Db[0];
        var1 = var1 + 2.0943951023931953;
        em.field_c[2] = (int)(Math.sin(var1) * (double)var3);
        if (param0) {
          ul.field_Db[2] = (int)((double)var3 * Math.cos(var1));
          var1 = var1 + 2.0943951023931953;
          em.field_c[3] = (int)(Math.sin(var1) * (double)var3);
          ul.field_Db[3] = (int)(Math.cos(var1) * (double)var3);
          return;
        }
    }

    final static void a(boolean param0, int param1, String param2, String param3) {
        try {
          if (param1 != -1) {
            ai.a((byte) -80);
          }
          oj.field_Ib = param3;
          qh.field_B = param2;
          fk.a(rg.field_c, param1 ^ -80, param0);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "ai.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0) {
        if (hp.field_m == null) {
          hp.field_l = null;
          hp.field_m = null;
          if (param0 == 3) {
            return;
          }
          field_b = (int[]) null;
          return;
        }
        if (null == hp.field_m.field_e) {
          hp.field_l = null;
          hp.field_m = null;
          if (param0 == 3) {
            return;
          }
          field_b = (int[]) null;
          return;
        }
        hp.field_m.field_e.field_bb = false;
        hp.field_l = null;
        hp.field_m = null;
        if (param0 == 3) {
          return;
        }
        field_b = (int[]) null;
    }

    static {
        field_d = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
    }
}
