/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class maa extends rqa {
    static int field_o;

    maa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static int a(int param0, byte param1, int param2, String param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var5 = 400;
        var6 = rrb.a((byte) 122, 0, param2, var5, param3);
        if (param1 > -123) {
          field_o = 42;
          var7 = aib.a((byte) -37, param3, 0, param2, var5);
          var8 = 20;
          var9 = param0 + ip.field_p.height / 2 + -(var7 / 2);
          af.a((byte) -115, param4, 2 * var8 + var7, -(var6 / 2) + (ip.field_p.width / 2 - var8), -var8 + var9, var6 + 2 * var8);
          int discarded$2 = kca.a(var9, var7, -(var6 / 2) + ip.field_p.width / 2, 0, param4, 1, param3, param2, 16777215, var6, 0, (byte) -99, 1);
          return var8 * 2 + var7;
        } else {
          var7 = aib.a((byte) -37, param3, 0, param2, var5);
          var8 = 20;
          var9 = param0 + ip.field_p.height / 2 + -(var7 / 2);
          af.a((byte) -115, param4, 2 * var8 + var7, -(var6 / 2) + (ip.field_p.width / 2 - var8), -var8 + var9, var6 + 2 * var8);
          int discarded$3 = kca.a(var9, var7, -(var6 / 2) + ip.field_p.width / 2, 0, param4, 1, param3, param2, 16777215, var6, 0, (byte) -99, 1);
          return var8 * 2 + var7;
        }
    }

    final static boolean a(asb param0, int param1, asb param2, asb param3) {
        if (param3.b((byte) -43)) {
          if (param3.a(32171, "commonui")) {
            if (param0.b((byte) 114)) {
              if (param0.a(param1 + 32169, "commonui")) {
                if (param2.b((byte) 127)) {
                  if (param2.a(32171, "button.gif")) {
                    if (param1 != 2) {
                      return true;
                    } else {
                      return true;
                    }
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          field_o = -21;
          si.a(162, 62, param0[0].a(46));
          return new nc((Object) (Object) "void");
        } else {
          si.a(162, 62, param0[0].a(46));
          return new nc((Object) (Object) "void");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 1;
    }
}
