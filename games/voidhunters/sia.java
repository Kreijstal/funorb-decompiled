/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sia extends rqa {
    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          return null;
        } else {
          si.a(5, 62, param0[0].a(27));
          return new nc((Object) (Object) "void");
        }
    }

    sia(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static oib a(int param0, long param1, String param2, boolean param3, String param4) {
        int var6 = 0;
        var6 = -121 / ((46 - param0) / 42);
        if ((param1 ^ -1L) == -1L) {
          if (param2 == null) {
            if (param3) {
              return (oib) (Object) new un(param1, param4);
            } else {
              return (oib) (Object) new us(param1, param4);
            }
          } else {
            return (oib) (Object) new cfa(param2, param4);
          }
        } else {
          if (param3) {
            return (oib) (Object) new un(param1, param4);
          } else {
            return (oib) (Object) new us(param1, param4);
          }
        }
    }

    static {
    }
}
