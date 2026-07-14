/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nj implements dja {
    static pfa field_a;

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
        var9 = VoidHunters.field_G;
        if (-1 == (param1 ^ -1)) {
          return "";
        } else {
          if ((param1 ^ -1) != param0) {
            var4 = param1 - -param2;
            var5 = 0;
            var6_int = param2;
            L0: while (true) {
              if (var4 <= var6_int) {
                var6 = new StringBuilder(var5);
                var7 = param2;
                L1: while (true) {
                  if (var7 >= var4) {
                    return var6.toString();
                  } else {
                    var8 = param3[var7];
                    if (var8 == null) {
                      StringBuilder discarded$2 = var6.append("null");
                      var7++;
                      continue L1;
                    } else {
                      StringBuilder discarded$3 = var6.append(var8);
                      var7++;
                      continue L1;
                    }
                  }
                }
              } else {
                var7_ref_CharSequence = param3[var6_int];
                if (var7_ref_CharSequence != null) {
                  var5 = var5 + var7_ref_CharSequence.length();
                  var6_int++;
                  continue L0;
                } else {
                  var5 += 4;
                  var6_int++;
                  continue L0;
                }
              }
            }
          } else {
            var10 = param3[param2];
            var4_ref = var10;
            if (var4_ref == null) {
              return "null";
            } else {
              return ((Object) (Object) var10).toString();
            }
          }
        }
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            Object var4 = null;
            String discarded$0 = nj.a(-62, 119, 20, (CharSequence[]) null);
        }
        return (tv[]) (Object) new af[param1];
    }

    public static void a(boolean param0) {
        if (param0) {
            Object var2 = null;
            String discarded$0 = nj.a(1, 39, 107, (CharSequence[]) null);
        }
        field_a = null;
    }

    public final tv a(byte param0) {
        int var2 = 69 % ((-64 - param0) / 50);
        return (tv) (Object) new af();
    }

    static {
    }
}
