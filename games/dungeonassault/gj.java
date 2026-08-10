/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class gj {
    static int[] field_c;
    static String field_a;
    static String field_b;

    final static int a(int param0, int param1) {
        if (param1 <= -93) {
          if (0 <= param0) {
            if ((param0 ^ -1) < -65537) {
              return -ib.field_g[134217728 / param0] + 2048;
            } else {
              return ib.field_g[param0 >> 987106341];
            }
          } else {
            if (-65536 > param0) {
              return ib.field_g[134217728 / -param0] - 2048;
            } else {
              return -ib.field_g[-param0 >> -1564078075];
            }
          }
        } else {
          field_b = (String) null;
          if (0 <= param0) {
            if ((param0 ^ -1) < -65537) {
              return -ib.field_g[134217728 / param0] + 2048;
            } else {
              return ib.field_g[param0 >> 987106341];
            }
          } else {
            if (-65536 > param0) {
              return ib.field_g[134217728 / -param0] - 2048;
            } else {
              return -ib.field_g[-param0 >> -1564078075];
            }
          }
        }
    }

    final static void a(int param0, int param1, String[] param2, String param3) {
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              ol.field_i = dh.field_b;
              if (-256 != (param0 ^ -1)) {
                if (100 > param0) {
                  mh.field_b = p.a(param0, param3, -28323);
                  break L1;
                } else {
                  if (105 >= param0) {
                    mh.field_b = em.a(param2, 8082);
                    break L1;
                  } else {
                    mh.field_b = p.a(param0, param3, -28323);
                    break L1;
                  }
                }
              } else {
                L2: {
                  stackIn_4_0 = -49;

                  if (13 <= wk.field_g) {
                    stackIn_5_0 = stackIn_4_0;
                    stackIn_5_1 = 0;
                    break L2;
                  } else {
                    stackIn_5_0 = stackIn_4_0;
                    stackIn_5_1 = 1;
                    break L2;
                  }
                }
                mh.field_b = l.a((byte) stackIn_5_0, stackIn_5_1 != 0);
                break L1;
              }
            }
            if (param1 == 29120) {
              break L0;
            } else {
              field_c = (int[]) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var4);

            stackIn_17_1 = new StringBuilder().append("gj.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param3 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ')');
        }
    }

    final static int a(int param0, h param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -1704798751) {
              stackIn_4_0 = ib.a(param1, 918) >> -1704798751;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 54;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("gj.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
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
        long var4;
        if (param1 <= -54) {
          var4 = this.a(127);
          if (-1L > (var4 ^ -1L)) {
            pj.a(0, var4);
            return this.b(param0, 2048);
          } else {
            return this.b(param0, 2048);
          }
        } else {
          return -17;
        }
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
