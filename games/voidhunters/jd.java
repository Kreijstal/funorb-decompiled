/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jd extends rqa {
    static tu field_o;
    static String field_p;

    public static void a(int param0) {
        int var1 = -101 % ((61 - param0) / 61);
        field_p = null;
        field_o = null;
    }

    jd(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static String a(String param0, String param1, int param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        StringBuilder var9_ref = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = VoidHunters.field_G;
        var4 = param0.length();
        var5 = param1.length();
        var6 = param3.length();
        if (-1 == (var5 ^ -1)) {
          throw new IllegalArgumentException("Key cannot have zero length");
        } else {
          var7 = var4;
          var8 = -var5 + var6;
          if (var8 != 0) {
            var9 = 0;
            L0: while (true) {
              var9 = param0.indexOf(param1, var9);
              if (0 <= var9) {
                var9 = var9 + var5;
                var7 = var7 + var8;
                continue L0;
              } else {
                var9_ref = new StringBuilder(var7);
                var10 = param2;
                L1: while (true) {
                  var11 = param0.indexOf(param1, var10);
                  if (-1 >= (var11 ^ -1)) {
                    StringBuilder discarded$6 = var9_ref.append(param0.substring(var10, var11));
                    StringBuilder discarded$7 = var9_ref.append(param3);
                    var10 = var11 - -var5;
                    continue L1;
                  } else {
                    StringBuilder discarded$8 = var9_ref.append(param0.substring(var10));
                    return var9_ref.toString();
                  }
                }
              }
            }
          } else {
            var9_ref = new StringBuilder(var7);
            var10 = param2;
            L2: while (true) {
              var11 = param0.indexOf(param1, var10);
              if (-1 >= (var11 ^ -1)) {
                StringBuilder discarded$9 = var9_ref.append(param0.substring(var10, var11));
                StringBuilder discarded$10 = var9_ref.append(param3);
                var10 = var11 - -var5;
                continue L2;
              } else {
                StringBuilder discarded$11 = var9_ref.append(param0.substring(var10));
                return var9_ref.toString();
              }
            }
          }
        }
    }

    final nc a(nc[] param0, int param1) {
        wbb.a(-108, param0[0].a(72), param0[1].a(116));
        if (param1 > -119) {
          jd.a(98);
          return new nc((Object) (Object) "void");
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new tu();
    }
}
