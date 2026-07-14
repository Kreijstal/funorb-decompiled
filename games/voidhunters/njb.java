/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class njb extends rqa {
    final nc a(nc[] param0, int param1) {
        Object var4 = null;
        si.a(152, 62, param0[0].a(50));
        if (param1 > -119) {
          var4 = null;
          nc discarded$2 = ((njb) this).a((nc[]) null, -78);
          return new nc((Object) (Object) "void");
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    njb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static boolean a(String param0, int param1, String param2) {
        String var3 = null;
        int stackIn_3_0 = 0;
        int stackOut_1_0 = 0;
        param0 = ne.a((char)param1, (byte) 121, "", param0);
        var3 = cm.a((byte) -87, param2);
        if (0 == param0.indexOf(param2)) {
          if (0 != param0.indexOf(var3)) {
            return true;
          } else {
            return false;
          }
        } else {
          stackOut_1_0 = 1;
          stackIn_3_0 = stackOut_1_0;
          return stackIn_3_0 != 0;
        }
    }

    static {
    }
}
