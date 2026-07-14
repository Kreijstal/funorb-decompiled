/*
 * Decompiled by CFR-JS 0.4.0.
 */
class hm extends df {
    static boolean field_o;
    static sq field_q;
    static String[] field_p;

    final static String a(CharSequence[] param0, int param1, int param2, byte param3) {
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
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        if (0 != param2) {
          L0: {
            if (param3 == 28) {
              break L0;
            } else {
              field_p = null;
              break L0;
            }
          }
          if (1 == param2) {
            var10 = param0[param1];
            var4_ref = var10;
            if (var4_ref == null) {
              return "null";
            } else {
              return ((Object) (Object) var10).toString();
            }
          } else {
            var4 = param2 + param1;
            var5 = 0;
            var6_int = param1;
            L1: while (true) {
              if (var6_int >= var4) {
                var6 = new StringBuilder(var5);
                var7 = param1;
                L2: while (true) {
                  if (var7 >= var4) {
                    return var6.toString();
                  } else {
                    var8 = param0[var7];
                    if (var8 == null) {
                      StringBuilder discarded$2 = var6.append("null");
                      var7++;
                      continue L2;
                    } else {
                      StringBuilder discarded$3 = var6.append(var8);
                      var7++;
                      continue L2;
                    }
                  }
                }
              } else {
                var7_ref_CharSequence = param0[var6_int];
                if (var7_ref_CharSequence != null) {
                  var5 = var5 + var7_ref_CharSequence.length();
                  var6_int++;
                  continue L1;
                } else {
                  var5 += 4;
                  var6_int++;
                  continue L1;
                }
              }
            }
          }
        } else {
          return "";
        }
    }

    final static void a(qa param0, ob param1, boolean param2) {
        di.a(param0.field_u, false, param1);
        if (!param2) {
            field_q = null;
        }
        param1.d(param0.field_v, 255);
    }

    hm() {
    }

    public static void d(boolean param0) {
        field_p = null;
        field_q = null;
        if (param0) {
            field_q = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = true;
    }
}
