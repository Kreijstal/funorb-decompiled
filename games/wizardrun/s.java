/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s {
    static db[] field_c;
    static od field_b;
    static o field_a;

    final static String a(int param0, CharSequence[] param1, int param2, int param3) {
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
        var9 = wizardrun.field_H;
        if (param3 <= -60) {
          if (param0 == -1) {
            return "";
          } else {
            if (-2 != param0) {
              var4 = param0 + param2;
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
                      var8 = param1[var7];
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
                  var7_ref_CharSequence = param1[var6_int];
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
              var10 = param1[param2];
              var4_ref = var10;
              if (var4_ref == null) {
                return "null";
              } else {
                return ((Object) (Object) var10).toString();
              }
            }
          }
        } else {
          return null;
        }
    }

    public static void a(int param0) {
        if (param0 != 540) {
            return;
        }
        field_b = null;
        field_a = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new o(540, 140);
    }
}
