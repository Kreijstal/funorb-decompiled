/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class udb extends rqa {
    final static tv a(Class[] param0, dja[] param1, Class param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        var5 = VoidHunters.field_G;
        var4 = 0;
        if (param3 < -35) {
          L0: while (true) {
            if (var4 < param0.length) {
              if (param0[var4] != param2) {
                var4++;
                continue L0;
              } else {
                return param1[var4].a((byte) 39);
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    udb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
            return null;
        }
        return new nc((Object) (Object) frb.a(174, 108));
    }

    static {
    }
}
