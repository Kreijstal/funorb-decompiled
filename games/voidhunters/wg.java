/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg extends rqa {
    static String field_p;
    static String field_o;

    final static boolean a(String param0, String param1, boolean param2) {
        String var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        param1 = ne.a('_', (byte) 108, "", param1);
        var3 = cm.a((byte) -87, param1);
        if (param2) {
          if (param0.indexOf(param1) == -1) {
            if ((param0.indexOf(var3) ^ -1) != 0) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          wg.b(false);
          if (param0.indexOf(param1) != -1) {
            return true;
          } else {
            L0: {
              if ((param0.indexOf(var3) ^ -1) == 0) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    public static void b(boolean param0) {
        field_o = null;
        field_p = null;
        if (param0) {
            Object var2 = null;
            boolean discarded$0 = wg.a((String) null, (String) null, true);
        }
    }

    wg(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
          field_o = null;
          me.field_r = param0[0].a(false);
          return new nc((Object) (Object) "void");
        } else {
          me.field_r = param0[0].a(false);
          return new nc((Object) (Object) "void");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = null;
        field_o = "Public";
    }
}
