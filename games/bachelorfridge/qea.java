/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qea {
    static String field_a;

    public static void a(int param0) {
        if (param0 != -454605656) {
            return;
        }
        field_a = null;
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        if (-1 >= (param0 ^ -1)) {
          if (dg.field_i > param0) {
            if (param1 >= 0) {
              if (dg.field_c > param1) {
                if (param2 == 255) {
                  dg.field_e[param0 - -(dg.field_i * param1)] = param4;
                  return;
                } else {
                  if (param3 > -95) {
                    return;
                  } else {
                    var5 = 256 - param2;
                    var6 = ((param4 & 16759249) >> -2019929712) * param2;
                    var7 = (255 & param4 >> -1662395288) * param2;
                    var8 = param2 * (255 & param4);
                    var9 = param0 - -(dg.field_i * param1);
                    var11 = ((65384 & dg.field_e[var9]) >> 1919443208) * var5;
                    var10 = ((dg.field_e[var9] & 16765900) >> 266585584) * var5;
                    var12 = (255 & dg.field_e[var9]) * var5;
                    var13 = (var8 - -var12 >> -1871968600) + ((var7 + var11 >> -295962616 << -1007859832) + (var6 - -var10 >> -454605656 << 840245424));
                    dg.field_e[var9] = var13;
                    return;
                  }
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static int a(boolean param0) {
        if (param0) {
          field_a = null;
          return fj.field_g + (ri.field_c << -1573267518) + (fb.field_p << -818945436);
        } else {
          return fj.field_g + (ri.field_c << -1573267518) + (fb.field_p << -818945436);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Damage <%0>";
    }
}
