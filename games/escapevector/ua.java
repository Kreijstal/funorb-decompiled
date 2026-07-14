/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ua {
    static int field_a;
    static String field_b;
    static kg field_c;

    final static int[] a(int param0, boolean param1, int param2, ij param3) {
        int[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        var7 = EscapeVector.field_A;
        if (param1) {
          var8 = param3.field_o[param2];
          var4 = var8;
          var5 = new int[var8.length];
          var6 = 0;
          L0: while (true) {
            if (var8.length <= var6) {
              return var5;
            } else {
              var5[var6] = bj.a(-19, param0, var8[var6]);
              var6++;
              continue L0;
            }
          }
        } else {
          field_b = null;
          var8 = param3.field_o[param2];
          var4 = var8;
          var5 = new int[var8.length];
          var6 = 0;
          L1: while (true) {
            if (var8.length <= var6) {
              return var5;
            } else {
              var5[var6] = bj.a(-19, param0, var8[var6]);
              var6++;
              continue L1;
            }
          }
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != 0) {
            field_a = 95;
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static void a(int param0, int param1, int param2, int param3) {
        c var4 = null;
        int var5 = 0;
        if (aj.b(-127)) {
          return;
        } else {
          var4 = om.field_c;
          var4.a(16, true);
          var4.field_m = var4.field_m + 1;
          if (param3 != 1) {
            field_b = null;
            var5 = var4.field_m;
            var4.f(0, -123);
            var4.h(param3 + 45, param0);
            var4.f(param2, -123);
            var4.h(param3 + 9, param1);
            var4.e(-96, var4.field_m + -var5);
            return;
          } else {
            var5 = var4.field_m;
            var4.f(0, -123);
            var4.h(param3 + 45, param0);
            var4.f(param2, -123);
            var4.h(param3 + 9, param1);
            var4.e(-96, var4.field_m + -var5);
            return;
          }
        }
    }

    final static String a(int param0, int param1, CharSequence[] param2, int param3) {
        CharSequence var4_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        CharSequence var7_ref_CharSequence = null;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        var9 = EscapeVector.field_A;
        if (param1 == 0) {
          return "";
        } else {
          if (1 == param1) {
            var10 = param2[param0];
            var4_ref = var10;
            if (var4_ref == null) {
              return "null";
            } else {
              return ((Object) (Object) var10).toString();
            }
          } else {
            var4 = param0 + param1;
            if (param3 != 4) {
              return null;
            } else {
              var5 = 0;
              var6_int = param0;
              L0: while (true) {
                if (var4 <= var6_int) {
                  L1: {
                    var6 = new StringBuilder(var5);
                    var7 = param0;
                    if (var4 <= var7) {
                      break L1;
                    } else {
                      L2: {
                        var8 = param2[var7];
                        if (var8 == null) {
                          StringBuilder discarded$2 = var6.append("null");
                          var7++;
                          break L2;
                        } else {
                          StringBuilder discarded$3 = var6.append(var8);
                          var7++;
                          break L2;
                        }
                      }
                      var7++;
                      var7++;
                      break L1;
                    }
                  }
                  return var6.toString();
                } else {
                  var7_ref_CharSequence = param2[var6_int];
                  if (var7_ref_CharSequence == null) {
                    var5 += 4;
                    var6_int++;
                    var6_int++;
                    continue L0;
                  } else {
                    var5 = var5 + var7_ref_CharSequence.length();
                    var6_int++;
                    var6_int++;
                    var6_int++;
                    continue L0;
                  }
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
        field_b = "Current Objective";
    }
}
