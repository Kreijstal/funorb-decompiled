/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class paa extends rqa {
    static int field_q;
    static String field_o;
    static String field_p;

    final static int a(String param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10) {
        if (param4 > -30) {
          int discarded$2 = paa.a((String) null, 23, -125, 6, -23, 39, -65, -95, 6, 44, -47);
          return nua.a(param6, param2, param3, param8, param7, param0, param1, param9, -20, param5, param10, nua.field_p);
        } else {
          return nua.a(param6, param2, param3, param8, param7, param0, param1, param9, -20, param5, param10, nua.field_p);
        }
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
            return null;
        }
        return new nc((Object) (Object) frb.a(188, 108));
    }

    paa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        if (param1 <= -44) {
          if (li.field_i) {
            if (ne.field_v) {
              og.field_r.a(param2, (byte) 120, param0 | -16777216, param4, param3, param5);
              return;
            } else {
              return;
            }
          } else {
            dma.d(param5, param3, param2, param4, param0);
            return;
          }
        } else {
          field_q = 86;
          if (li.field_i) {
            if (!ne.field_v) {
              return;
            } else {
              og.field_r.a(param2, (byte) 120, param0 | -16777216, param4, param3, param5);
              return;
            }
          } else {
            dma.d(param5, param3, param2, param4, param0);
            return;
          }
        }
    }

    public static void e(byte param0) {
        int var1 = 59 / ((param0 - 43) / 46);
        field_p = null;
        field_o = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Fewer neutrals";
        field_p = "Enemy ship spawned";
    }
}
