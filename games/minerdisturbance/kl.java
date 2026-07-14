/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kl {
    static ec field_a;

    final static String a(CharSequence[] param0, int param1, int param2, boolean param3) {
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
        var9 = MinerDisturbance.field_ab;
        if (param1 != 0) {
          L0: {
            if (!param3) {
              break L0;
            } else {
              kl.a(false);
              break L0;
            }
          }
          if (1 != param1) {
            var4 = param1 - -param2;
            var5 = 0;
            var6_int = param2;
            L1: while (true) {
              if (var6_int >= var4) {
                var6 = new StringBuilder(var5);
                var7 = param2;
                L2: while (true) {
                  if (var7 >= var4) {
                    return var6.toString();
                  } else {
                    var8 = param0[var7];
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
                var7_ref_CharSequence = param0[var6_int];
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
          } else {
            var10 = param0[param2];
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

    public static void a(boolean param0) {
        field_a = null;
        if (!param0) {
            Object var2 = null;
            String discarded$0 = kl.a((CharSequence[]) null, 11, -126, false);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new ec(2);
    }
}
