/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oab extends rqa {
    static int field_o;

    final static int a(int param0, int param1, int[] param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int[] var6_ref_int__ = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = VoidHunters.field_G;
          if (param2 == null) {
            break L0;
          } else {
            if (param3 != 0) {
              L1: {
                if (param0 < -74) {
                  break L1;
                } else {
                  field_o = -89;
                  break L1;
                }
              }
              var4 = 2147483647;
              var5 = -2147483648;
              var6_ref_int__ = param2;
              var7 = 0;
              L2: while (true) {
                if (var7 >= var6_ref_int__.length) {
                  var6 = iia.a(-85, var5 - var4);
                  return 32 + (6 + param1 + param3 * var6);
                } else {
                  L3: {
                    var8 = var6_ref_int__[var7];
                    if (var5 < var8) {
                      var5 = var8;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  if (var4 > var8) {
                    var4 = var8;
                    var7++;
                    continue L2;
                  } else {
                    var7++;
                    continue L2;
                  }
                }
              }
            } else {
              break L0;
            }
          }
        }
        return param1;
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
            return null;
        }
        return new nc((Object) (Object) frb.a(60, 120));
    }

    oab(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
