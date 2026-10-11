/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class gj {
    static int[] field_c;
    static String field_a;
    static String field_b;

    final static int a(int param0, int param1) {
        if (param1 > -93) {
          field_b = (String) null;
          if (0 > param0) {
            if (-65536 <= param0) {
              return -ib.field_g[-param0 >> 5];
            }
            return ib.field_g[134217728 / -param0] - 2048;
          }
          if (param0 <= 65536) {
            return ib.field_g[param0 >> 5];
          }
          return -ib.field_g[134217728 / param0] + 2048;
        }
        if (0 > param0) {
          if (-65536 <= param0) {
            return -ib.field_g[-param0 >> 5];
          }
          return ib.field_g[134217728 / -param0] - 2048;
        }
        if (param0 <= 65536) {
          return ib.field_g[param0 >> 5];
        }
        return -ib.field_g[134217728 / param0] + 2048;
    }

    final static void a(int param0, int param1, String[] param2, String param3) {
        int var5 = 0;
        int stackIn_4_0 = 0;
        boolean stackIn_5_1 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = DungeonAssault.field_K;
        try {
          ol.field_i = dh.field_b;
          if (param0 != 255) {
            if (100 > param0) {
              mh.field_b = p.a(param0, param3, -28323);
            } else {
              if (105 >= param0) {
                mh.field_b = em.a(param2, 8082);
              } else {
                mh.field_b = p.a(param0, param3, -28323);
              }
            }
          } else {
            stackIn_4_0 = -49;
            stackIn_5_1 = !(13 <= wk.field_g);
            mh.field_b = l.$cfr$intArgs$a$fb458fdecc21(stackIn_4_0, stackIn_5_1);
          }
          if (param1 == 29120) {
            return;
          }
          field_c = (int[]) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("gj.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final static int a(int param0, h param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -1704798751) {
            stackIn_4_0 = ib.a(param1, 918) >> 1;
            return stackIn_4_0;
          }
          stackIn_2_0 = 54;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("gj.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    abstract void b(int param0);

    final static void a(int[] param0, int param1, int param2, byte param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10) {
        try {
          hp.field_b[param4] = new h(param4, param1, param7, param5, param2, param6, param9, param8, param10, param0);
          if (param3 != 33) {
            String var12 = (String) null;
            gj.a(86, 102, (String[]) null, (String) null);
          }
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "gj.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ')');
        }
    }

    abstract long a(int param0);

    final int a(long param0, int param1) {
        if (param1 > -54) {
          return -17;
        }
        long var4 = this.a(127);
        if (var4 <= 0L) {
          return this.b(param0, 2048);
        }
        pj.a(0, var4);
        return this.b(param0, 2048);
    }

    abstract int b(long param0, int param1);

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
        field_b = null;
        if (param0 != 80) {
          gj.a((int[]) null, -19, 16, (byte) 57, -33, -40, 91, 31, 97, -45, -60);
        }
    }

    static {
        field_a = "Orc Warrior";
        field_c = wa.b(-1);
        field_b = "Demon Lord";
    }
}
