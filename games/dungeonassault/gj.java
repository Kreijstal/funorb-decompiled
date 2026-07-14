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
          field_b = null;
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
        int stackIn_2_0 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        var5 = DungeonAssault.field_K;
        ol.field_i = dh.field_b;
        if (-256 != (param0 ^ -1)) {
          if (100 > param0) {
            mh.field_b = p.a(param0, param3, -28323);
            if (param1 == 29120) {
              return;
            } else {
              field_c = null;
              return;
            }
          } else {
            if (105 >= param0) {
              mh.field_b = em.a(param2, 8082);
              if (param1 != 29120) {
                field_c = null;
                return;
              } else {
                return;
              }
            } else {
              mh.field_b = p.a(param0, param3, -28323);
              if (param1 != 29120) {
                field_c = null;
                return;
              } else {
                return;
              }
            }
          }
        } else {
          L0: {
            stackOut_1_0 = -49;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (13 <= wk.field_g) {
              stackOut_3_0 = stackIn_3_0;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L0;
            } else {
              stackOut_2_0 = stackIn_2_0;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L0;
            }
          }
          mh.field_b = l.a((byte) stackIn_4_0, stackIn_4_1 != 0);
          if (param1 == 29120) {
            return;
          } else {
            field_c = null;
            return;
          }
        }
    }

    final static int a(int param0, h param1) {
        if (param0 != -1704798751) {
            return 54;
        }
        return ib.a(param1, 918) >> -1704798751;
    }

    abstract void b(int param0);

    final static void a(int[] param0, int param1, int param2, byte param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10) {
        hp.field_b[param4] = new h(param4, param1, param7, param5, param2, param6, param9, param8, param10, param0);
        if (param3 != 33) {
            Object var12 = null;
            gj.a(86, 102, (String[]) null, (String) null);
        }
    }

    abstract long a(int param0);

    final int a(long param0, int param1) {
        long var4 = 0L;
        if (param1 <= -54) {
          var4 = ((gj) this).a(127);
          if (-1L > (var4 ^ -1L)) {
            pj.a(0, var4);
            return ((gj) this).b(param0, 2048);
          } else {
            return ((gj) this).b(param0, 2048);
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Orc Warrior";
        field_c = wa.b(-1);
        field_b = "Demon Lord";
    }
}
