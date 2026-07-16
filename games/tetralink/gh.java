/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gh {
    static String field_b;
    static int[] field_a;

    final static Boolean a(byte param0) {
        Boolean var1 = ui.field_b;
        ui.field_b = null;
        if (param0 < 91) {
            field_a = null;
        }
        return var1;
    }

    public static void a(int param0) {
        if (param0 <= 64) {
            field_b = null;
        }
        field_b = null;
        field_a = null;
    }

    final static void a(int param0, int param1, int param2, oh[] param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var10 = TetraLink.field_J;
          if (param3 == null) {
            break L0;
          } else {
            if (param0 <= 0) {
              break L0;
            } else {
              var5 = param3[0].field_t;
              var6 = param3[2].field_t;
              var7 = param3[1].field_t;
              param3[0].c(param1, param2);
              param3[2].c(param1 + param0 + -var6, param2);
              ra.a(lj.field_a);
              ra.b(var5 + param1, param2, -var6 + (param0 + param1), param2 - -param3[1].field_F);
              var8 = var5 + param1;
              var9 = param1 - (-param0 - -var6);
              param1 = var8;
              L1: while (true) {
                if (var9 <= param1) {
                  L2: {
                    if (param4 <= -123) {
                      break L2;
                    } else {
                      field_b = null;
                      break L2;
                    }
                  }
                  ra.b(lj.field_a);
                  return;
                } else {
                  param3[1].c(param1, param2);
                  param1 = param1 + var7;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final static void a(byte param0, boolean param1) {
        if (!(sj.field_g == null)) {
            if (sj.field_g.b(-20728, param1)) {
                sj.field_g = null;
            }
        }
        if (param0 <= 76) {
            field_a = null;
        }
    }

    final static String a(CharSequence[] param0, int param1, int param2, int param3) {
        CharSequence var10 = null;
        CharSequence var4_ref_CharSequence = null;
        int var6_int = 0;
        CharSequence var7_ref_CharSequence = null;
        int var7 = 0;
        CharSequence var8 = null;
        int var9 = TetraLink.field_J;
        if (!(-1 != (param2 ^ -1))) {
            return "";
        }
        if (!(param3 != (param2 ^ -1))) {
            var10 = param0[param1];
            var4_ref_CharSequence = var10;
            if (var4_ref_CharSequence == null) {
                return "null";
            }
            return ((Object) (Object) var10).toString();
        }
        int var4 = param1 + param2;
        int var5 = 0;
        for (var6_int = param1; (var4 ^ -1) < (var6_int ^ -1); var6_int++) {
            var7_ref_CharSequence = param0[var6_int];
            if (var7_ref_CharSequence != null) {
                var5 = var5 + var7_ref_CharSequence.length();
            } else {
                var5 += 4;
            }
        }
        StringBuilder var6 = new StringBuilder(var5);
        for (var7 = param1; (var7 ^ -1) > (var4 ^ -1); var7++) {
            var8 = param0[var7];
            if (var8 != null) {
                StringBuilder discarded$1 = var6.append(var8);
            } else {
                StringBuilder discarded$2 = var6.append("null");
            }
        }
        return var6.toString();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[4];
        field_b = "Advertising websites";
    }
}
