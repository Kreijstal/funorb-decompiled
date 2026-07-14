/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cma {
    static volatile int field_a;

    final static boolean a(int param0, int param1, int param2) {
        if (param2 != -22785) {
            return false;
        }
        return iua.a(param0, (byte) 119, param1) & bdb.a(param0, false, param1);
    }

    final static String a(String param0, String param1, String param2, byte param3) {
        if (param3 >= -57) {
          field_a = 104;
          param1 = jd.a(param1, "<teamname>", 0, param0);
          param1 = jd.a(param1, "<objective>", 0, param2);
          return param1;
        } else {
          param1 = jd.a(param1, "<teamname>", 0, param0);
          param1 = jd.a(param1, "<objective>", 0, param2);
          return param1;
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, int param5, int param6, int param7) {
        int var9 = 0;
        var9 = VoidHunters.field_G;
        if (param7 <= param5) {
          if (param3 > param5) {
            qaa.a(param3, 65, param4, param7, param0, param1, param6, dma.field_i, param5);
            if (param2) {
              cma.a(64, 30, false, -122, 108, -24, -111, 16);
              return;
            } else {
              return;
            }
          } else {
            if (param3 > param7) {
              qaa.a(param5, -107, param4, param7, param0, param6, param1, dma.field_i, param3);
              if (param2) {
                cma.a(64, 30, false, -122, 108, -24, -111, 16);
                return;
              } else {
                return;
              }
            } else {
              qaa.a(param5, -117, param4, param3, param1, param6, param0, dma.field_i, param7);
              if (param2) {
                cma.a(64, 30, false, -122, 108, -24, -111, 16);
                return;
              } else {
                return;
              }
            }
          }
        } else {
          if (param7 < param3) {
            qaa.a(param3, 46, param4, param5, param6, param1, param0, dma.field_i, param7);
            if (!param2) {
              return;
            } else {
              cma.a(64, 30, false, -122, 108, -24, -111, 16);
              return;
            }
          } else {
            if (param3 <= param5) {
              qaa.a(param7, 61, param4, param3, param1, param0, param6, dma.field_i, param5);
              if (!param2) {
                return;
              } else {
                cma.a(64, 30, false, -122, 108, -24, -111, 16);
                return;
              }
            } else {
              qaa.a(param7, -99, param4, param5, param6, param0, param1, dma.field_i, param3);
              if (param2) {
                cma.a(64, 30, false, -122, 108, -24, -111, 16);
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    final static void a(asb param0, phb[][] param1, int[] param2, boolean param3, byte param4, byte[] param5, String[][] param6, int[] param7, String[][] param8, int param9, phb[][] param10, asb param11, int param12, asb param13, caa[] param14, byte[] param15, String[] param16) {
        Object var18 = null;
        db.a((String[]) null, param5, param11, param13, param0, param1, param16, param12, param6, param15, param9, 1, param3, param7, 1, param2, param8, param10, param14);
        if (param4 < -68) {
            return;
        }
        field_a = -108;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
    }
}
