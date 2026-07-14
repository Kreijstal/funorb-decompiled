/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ww extends rqa {
    static int field_o;

    final static void a(int param0, int param1, int[] param2, byte param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        var6 = VoidHunters.field_G;
        if (param3 == 75) {
          param4--;
          param1--;
          var5 = param1 + -7;
          L0: while (true) {
            if (param4 < var5) {
              param4++;
              param2[param4] = param0;
              param4++;
              param2[param4] = param0;
              param4++;
              param2[param4] = param0;
              param4++;
              param2[param4] = param0;
              param4++;
              param2[param4] = param0;
              param4++;
              param2[param4] = param0;
              param4++;
              param2[param4] = param0;
              param4++;
              param2[param4] = param0;
              continue L0;
            } else {
              L1: while (true) {
                if (param1 <= param4) {
                  return;
                } else {
                  param4++;
                  param2[param4] = param0;
                  continue L1;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
            field_o = -58;
            return new nc((Object) (Object) frb.a(39, 90));
        }
        return new nc((Object) (Object) frb.a(39, 90));
    }

    final static void a(Object[] param0, int param1, Object[] param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        var5 = VoidHunters.field_G;
        if (param0 == null) {
          return;
        } else {
          if (param2 == null) {
            return;
          } else {
            if (param3 == -25801) {
              var4 = 0;
              L0: while (true) {
                if (var4 < param2.length) {
                  param0[param1 + var4] = param2[var4];
                  var4++;
                  continue L0;
                } else {
                  return;
                }
              }
            } else {
              field_o = 2;
              var4 = 0;
              L1: while (true) {
                if (var4 < param2.length) {
                  param0[param1 + var4] = param2[var4];
                  var4++;
                  continue L1;
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    ww(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 500;
    }
}
