/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gf {
    static java.security.SecureRandom field_b;
    static java.awt.Image field_a;

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 1431655765) {
            field_a = null;
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var2 = param0 * (param0 * param0 >> -814891540) >> -676121812;
        var3 = param0 * 6 + -61440;
        if (param1 != -676121812) {
          return 110;
        } else {
          var4 = 40960 - -(var3 * param0 >> -1596230356);
          return var2 * var4 >> -200473812;
        }
    }

    final static int a(int param0, byte param1) {
        param0 = (param0 & 1431655765) + ((-1431655765 & param0) >>> 736423073);
        param0 = (param0 & 858993459) + (param0 >>> 520494530 & -214748365);
        if (param1 != 81) {
          gf.a(-54);
          param0 = param0 - -(param0 >>> 412246116) & 252645135;
          param0 = param0 + (param0 >>> -2037872536);
          param0 = param0 + (param0 >>> 605701392);
          return 255 & param0;
        } else {
          param0 = param0 - -(param0 >>> 412246116) & 252645135;
          param0 = param0 + (param0 >>> -2037872536);
          param0 = param0 + (param0 >>> 605701392);
          return 255 & param0;
        }
    }

    final static String a(char param0, String param1, boolean param2, String param3) {
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
        var11 = Sumoblitz.field_L ? 1 : 0;
        var4 = param1.length();
        if (!param2) {
          var5 = param3.length();
          var6 = var4;
          var7 = var5 + -1;
          if (-1 != (var7 ^ -1)) {
            var8_int = 0;
            L0: while (true) {
              var8_int = param1.indexOf((int) param0, var8_int);
              if (var8_int >= 0) {
                var6 = var6 + var7;
                var8_int++;
                continue L0;
              } else {
                var13 = new StringBuilder(var6);
                var8 = var13;
                var9 = 0;
                L1: while (true) {
                  var10 = param1.indexOf((int) param0, var9);
                  if (var10 >= 0) {
                    StringBuilder discarded$6 = var13.append(param1.substring(var9, var10));
                    StringBuilder discarded$7 = var13.append(param3);
                    var9 = 1 + var10;
                    continue L1;
                  } else {
                    StringBuilder discarded$8 = var13.append(param1.substring(var9));
                    return var13.toString();
                  }
                }
              }
            }
          } else {
            var12 = new StringBuilder(var6);
            var9 = 0;
            L2: while (true) {
              var10 = param1.indexOf((int) param0, var9);
              if (var10 >= 0) {
                StringBuilder discarded$9 = var12.append(param1.substring(var9, var10));
                StringBuilder discarded$10 = var12.append(param3);
                var9 = 1 + var10;
                continue L2;
              } else {
                StringBuilder discarded$11 = var12.append(param1.substring(var9));
                return var12.toString();
              }
            }
          }
        } else {
          return null;
        }
    }

    static {
    }
}
