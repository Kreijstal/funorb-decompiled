/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am {
    public final String toString() {
        throw new IllegalStateException();
    }

    final static String a(char param0, String param1, String param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        StringBuilder var13 = null;
        StringBuilder var14 = null;
        var11 = MonkeyPuzzle2.field_F ? 1 : 0;
        var4 = param1.length();
        var5 = param2.length();
        if (param3 == -23026) {
          var6 = var4;
          var7 = var5 - 1;
          if (var7 != 0) {
            var8_int = 0;
            L0: while (true) {
              var8_int = param1.indexOf((int) param0, var8_int);
              if (-1 >= var8_int) {
                var8_int++;
                var6 = var6 + var7;
                continue L0;
              } else {
                var14 = new StringBuilder(var6);
                var8 = var14;
                var9 = 0;
                L1: while (true) {
                  var10 = param1.indexOf((int) param0, var9);
                  if (-1 > var10) {
                    StringBuilder discarded$13 = var14.append(param1.substring(var9));
                    return var14.toString();
                  } else {
                    StringBuilder discarded$14 = var14.append(param1.substring(var9, var10));
                    var9 = 1 + var10;
                    StringBuilder discarded$15 = var14.append(param2);
                    continue L1;
                  }
                }
              }
            }
          } else {
            var13 = new StringBuilder(var6);
            var9 = 0;
            L2: while (true) {
              var10 = param1.indexOf((int) param0, var9);
              if (-1 < (var10 ^ -1)) {
                StringBuilder discarded$16 = var13.append(param1.substring(var9));
                return var13.toString();
              } else {
                StringBuilder discarded$17 = var13.append(param1.substring(var9, var10));
                var9 = 1 + var10;
                StringBuilder discarded$18 = var13.append(param2);
                continue L2;
              }
            }
          }
        } else {
          var12 = null;
          String discarded$19 = am.a('ﾤ', (String) null, (String) null, 124);
          var6 = var4;
          var7 = var5 - 1;
          if (var7 != 0) {
            var8_int = 0;
            L3: while (true) {
              var8_int = param1.indexOf((int) param0, var8_int);
              if (-1 >= var8_int) {
                var8_int++;
                var6 = var6 + var7;
                continue L3;
              } else {
                var8 = new StringBuilder(var6);
                var9 = 0;
                L4: while (true) {
                  var10 = param1.indexOf((int) param0, var9);
                  if (-1 > var10) {
                    StringBuilder discarded$20 = var8.append(param1.substring(var9));
                    return var8.toString();
                  } else {
                    StringBuilder discarded$21 = var8.append(param1.substring(var9, var10));
                    var9 = 1 + var10;
                    StringBuilder discarded$22 = var8.append(param2);
                    continue L4;
                  }
                }
              }
            }
          } else {
            var8 = new StringBuilder(var6);
            var9 = 0;
            L5: while (true) {
              var10 = param1.indexOf((int) param0, var9);
              if (-1 < (var10 ^ -1)) {
                StringBuilder discarded$23 = var8.append(param1.substring(var9));
                return var8.toString();
              } else {
                StringBuilder discarded$24 = var8.append(param1.substring(var9, var10));
                var9 = 1 + var10;
                StringBuilder discarded$25 = var8.append(param2);
                continue L5;
              }
            }
          }
        }
    }

    static {
    }
}
