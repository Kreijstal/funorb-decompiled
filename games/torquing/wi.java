/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wi {
    static int[] field_a;

    final static t a(int param0, byte param1, la param2, int param3) {
        if (!nd.a(param3, param2, -1, param0)) {
            return null;
        }
        int var4 = -14 % ((-40 - param1) / 39);
        return nl.c(-8791);
    }

    final static String a(int param0, int param1, int param2, CharSequence[] param3) {
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
        var9 = Torquing.field_u;
        if (param2 != 0) {
          if (param2 != 1) {
            var4 = param2 - -param1;
            var5 = param0;
            var6_int = param1;
            L0: while (true) {
              if (var6_int >= var4) {
                var6 = new StringBuilder(var5);
                var7 = param1;
                L1: while (true) {
                  if (var4 <= var7) {
                    return var6.toString();
                  } else {
                    var8 = param3[var7];
                    if (var8 != null) {
                      StringBuilder discarded$2 = var6.append(var8);
                      var7++;
                      continue L1;
                    } else {
                      StringBuilder discarded$3 = var6.append("null");
                      var7++;
                      continue L1;
                    }
                  }
                }
              } else {
                var7_ref_CharSequence = param3[var6_int];
                if (var7_ref_CharSequence == null) {
                  var5 += 4;
                  var6_int++;
                  continue L0;
                } else {
                  var5 = var5 + var7_ref_CharSequence.length();
                  var6_int++;
                  continue L0;
                }
              }
            }
          } else {
            var10 = param3[param1];
            var4_ref = var10;
            if (var4_ref == null) {
              return "null";
            } else {
              return ((Object) (Object) var10).toString();
            }
          }
        } else {
          return "";
        }
    }

    final static void a(int param0) {
        int var4 = Torquing.field_u;
        int[] var5 = u.field_v;
        int[] var1 = var5;
        int var2 = param0;
        int var3 = var5.length;
        while (var2 < var3) {
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
        }
    }

    public static void b(int param0) {
        if (param0 > -108) {
            field_a = null;
        }
        field_a = null;
    }

    static {
    }
}
