/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fb {
    static int[] field_b;
    static String field_c;
    static ll[] field_a;

    public static void a(boolean param0) {
        field_a = null;
        if (param0) {
            return;
        }
        field_b = null;
        field_c = null;
    }

    final static String a(boolean param0, char param1, String param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        StringBuilder var12 = null;
        StringBuilder var13 = null;
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        var4 = param2.length();
        var5 = param3.length();
        var6 = var4;
        var7 = -1 + var5;
        if (-1 != var7) {
          var8_int = 0;
          L0: while (true) {
            var8_int = param2.indexOf((int) param1, var8_int);
            if (-1 <= var8_int) {
              var6 = var6 + var7;
              var8_int++;
              continue L0;
            } else {
              var13 = new StringBuilder(var6);
              var8 = var13;
              var9 = 0;
              L1: while (true) {
                var10 = param2.indexOf((int) param1, var9);
                if (-1 >= (var10 ^ -1)) {
                  StringBuilder discarded$6 = var13.append(param2.substring(var9, var10));
                  StringBuilder discarded$7 = var13.append(param3);
                  var9 = 1 + var10;
                  continue L1;
                } else {
                  StringBuilder discarded$8 = var13.append(param2.substring(var9));
                  if (!param0) {
                    return var13.toString();
                  } else {
                    fb.a(false);
                    return var13.toString();
                  }
                }
              }
            }
          }
        } else {
          var12 = new StringBuilder(var6);
          var8 = var12;
          var9 = 0;
          L2: while (true) {
            var10 = param2.indexOf((int) param1, var9);
            if (-1 >= (var10 ^ -1)) {
              StringBuilder discarded$9 = var12.append(param2.substring(var9, var10));
              StringBuilder discarded$10 = var12.append(param3);
              var9 = 1 + var10;
              continue L2;
            } else {
              StringBuilder discarded$11 = var12.append(param2.substring(var9));
              if (!param0) {
                return var12.toString();
              } else {
                fb.a(false);
                return var12.toString();
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[]{6, 7, 8};
        field_c = "Your game";
    }
}
