/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qea {
    static String field_a;

    public static void a(int param0) {
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
        if (param0 >= 0) {
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
                    var6 = ((param4 & 16759249) >> 16) * param2;
                    var7 = (255 & param4 >> 8) * param2;
                    var8 = param2 * (255 & param4);
                    var9 = param0 - -(dg.field_i * param1);
                    var11 = ((65384 & dg.field_e[var9]) >> 8) * var5;
                    var10 = ((dg.field_e[var9] & 16765900) >> 16) * var5;
                    var12 = (255 & dg.field_e[var9]) * var5;
                    var13 = (var8 - -var12 >> 8) + ((var7 + var11 >> 8 << 8) + (var6 - -var10 >> 8 << 16));
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
        return fj.field_g + (ri.field_c << 2) + (fb.field_p << 4);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Damage <%0>";
    }
}
