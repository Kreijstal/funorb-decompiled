/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mj {
    static byte[][] field_a;
    static int field_b;
    static String field_c;

    final static String a(int param0, int param1, CharSequence[] param2, byte param3) {
        CharSequence var4_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        int var7 = 0;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        var9 = Geoblox.field_C;
        if (-1 == (param1 ^ -1)) {
          return "";
        } else {
          if ((param1 ^ -1) == -2) {
            var10 = param2[param0];
            var4_ref = var10;
            if (var4_ref != null) {
              return ((Object) (Object) var10).toString();
            } else {
              return "null";
            }
          } else {
            L0: {
              var4 = param0 + param1;
              var5 = 0;
              if (param3 == 96) {
                break L0;
              } else {
                field_b = 111;
                break L0;
              }
            }
            var6_int = param0;
            L1: while (true) {
              if (var4 <= var6_int) {
                var6 = new StringBuilder(var5);
                var7 = param0;
                L2: while (true) {
                  if (var4 <= var7) {
                    return var6.toString();
                  } else {
                    var8 = param2[var7];
                    if (var8 != null) {
                      StringBuilder discarded$2 = var6.append(var8);
                      var7++;
                      continue L2;
                    } else {
                      StringBuilder discarded$3 = var6.append("null");
                      var7++;
                      continue L2;
                    }
                  }
                }
              } else {
                var7_ref_CharSequence = param2[var6_int];
                if (var7_ref_CharSequence == null) {
                  var5 += 4;
                  var6_int++;
                  continue L1;
                } else {
                  var5 = var5 + var7_ref_CharSequence.length();
                  var6_int++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final static nd a(String param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = Geoblox.field_C;
        int var2 = param0.length();
        if (param1 > -34) {
            field_c = null;
        }
        for (var3 = 0; var3 < var2; var3++) {
            var4 = param0.charAt(var3);
            if (48 > var4) {
                return null;
            }
            if (var4 > 57) {
                return null;
            }
        }
        return ii.field_h;
    }

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        if (param0 < 66) {
            field_b = 91;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "If you do nothing the game will revert to normal view in <%0> second.";
    }
}
