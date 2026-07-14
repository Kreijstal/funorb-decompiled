/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oi {
    static String field_b;
    static ak field_e;
    static volatile int field_c;
    static String field_a;
    static String field_d;

    final static boolean a(pl param0, int param1, boolean param2, String param3, byte param4, String param5, String param6) {
        dm var8 = null;
        int stackIn_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        if (wm.field_a != tm.field_X) {
          return false;
        } else {
          var8 = new dm(wa.field_c, param0);
          wa.field_c.b(-6183, (ng) (Object) var8);
          if (!og.a((byte) -96)) {
            L0: {
              tm.field_X = rj.field_F;
              v.field_b = null;
              if (!param2) {
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                stackOut_9_0 = 1;
                stackIn_11_0 = stackOut_9_0;
                break L0;
              }
            }
            oc.field_J = stackIn_11_0 != 0;
            nk.field_b = param3;
            um.field_r = param1;
            pm.field_s = param5;
            vp.field_Nb = param6;
            if (param4 >= -86) {
              field_d = null;
              return true;
            } else {
              return true;
            }
          } else {
            var8.h((byte) -118);
            if (param4 >= -86) {
              field_d = null;
              return true;
            } else {
              return true;
            }
          }
        }
    }

    final static void a(String param0, String param1, byte param2) {
        Object var4 = null;
        if (param2 != -33) {
          var4 = null;
          boolean discarded$2 = oi.a((pl) null, -20, true, (String) null, (byte) -44, (String) null, (String) null);
          gf.a(param1, false, 32, param0);
          return;
        } else {
          gf.a(param1, false, 32, param0);
          return;
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 0) {
            return;
        }
        field_a = null;
        field_e = null;
        field_d = null;
    }

    final static void a(int param0, int param1, int param2, byte param3, uj param4, int param5, gp param6) {
        em.a(param4.field_Fb, param4.field_Nb, param4.field_Ub, -1, (ak) (Object) param4, -163, param6, (int[]) null, -1);
        eg.field_n.b(true, (byte) -98);
        eg.field_n.a(0, (int[]) null, -3);
        int var7 = -127 / ((param3 - 0) / 38);
        eg.field_n.b(8893);
        wi var8 = eg.field_n;
        int var9 = param0;
        int var10 = param2;
        int var11 = param5;
        int var12 = param1;
        var8.field_b.b(var12, var9, 28, var10, var11);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
        field_b = "Searching for an opponent";
        field_a = "Decline invitation to <%0>'s game";
        field_d = "Your rating is <%0>";
    }
}
