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
        int var10 = TetraLink.field_J;
        if (param3 != null) {
            // ifle L16
        } else {
            return;
        }
        int var5 = param3[0].field_t;
        int var6 = param3[2].field_t;
        int var7 = param3[1].field_t;
        param3[0].c(param1, param2);
        param3[2].c(param1 + param0 + -var6, param2);
        ra.a(lj.field_a);
        ra.b(var5 + param1, param2, -var6 + (param0 + param1), param2 - -param3[1].field_F);
        int var8 = var5 + param1;
        int var9 = param1 - (-param0 - -var6);
        param1 = var8;
        while (var9 > param1) {
            param3[1].c(param1, param2);
            param1 = param1 + var7;
        }
        if (param4 > -123) {
            field_b = null;
        }
        ra.b(lj.field_a);
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
        var9 = TetraLink.field_J;
        if (-1 == param2) {
          return "";
        } else {
          if (param3 == param2) {
            var10 = param0[param1];
            var4_ref = var10;
            if (var4_ref != null) {
              return ((Object) (Object) var10).toString();
            } else {
              return "null";
            }
          } else {
            var4 = param1 + param2;
            var5 = 0;
            var6_int = param1;
            L0: while (true) {
              if (var4 <= var6_int) {
                var6 = new StringBuilder(var5);
                var7 = param1;
                L1: while (true) {
                  if (var7 >= var4) {
                    return var6.toString();
                  } else {
                    var8 = param0[var7];
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
                var7_ref_CharSequence = param0[var6_int];
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
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[4];
        field_b = "Advertising websites";
    }
}
