/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dg {
    static boolean field_a;
    static fm field_d;
    static vg field_f;
    static String field_b;
    static String[] field_c;
    static String field_e;

    final static void a(boolean param0, int param1, int param2, String param3, String param4, int param5) {
        int var7 = 0;
        pc var8 = null;
        int stackIn_8_0 = 0;
        int stackIn_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        var8 = aa.field_f;
        var8.g(param5, 15514);
        var8.field_m = var8.field_m + 1;
        if (param0) {
          var7 = var8.field_m;
          var8.e(160, param1);
          if ((param1 ^ -1) != -3) {
            if (param3 != null) {
              L0: {
                if (param0) {
                  stackOut_14_0 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  break L0;
                } else {
                  stackOut_13_0 = 1;
                  stackIn_15_0 = stackOut_13_0;
                  break L0;
                }
              }
              int discarded$2 = hn.a(stackIn_15_0 != 0, param3, (we) (Object) var8);
              var8.f(var8.field_m + -var7, -1);
              return;
            } else {
              var8.b(1276387944, param2);
              var8.f(var8.field_m + -var7, -1);
              return;
            }
          } else {
            var8.b((byte) -41, param4);
            if (param3 != null) {
              L1: {
                if (param0) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L1;
                } else {
                  stackOut_6_0 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  break L1;
                }
              }
              int discarded$3 = hn.a(stackIn_8_0 != 0, param3, (we) (Object) var8);
              var8.f(var8.field_m + -var7, -1);
              return;
            } else {
              var8.b(1276387944, param2);
              var8.f(var8.field_m + -var7, -1);
              return;
            }
          }
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != 1048576) {
          dg.a(-108);
          field_e = null;
          field_b = null;
          field_d = null;
          field_f = null;
          return;
        } else {
          field_e = null;
          field_b = null;
          field_d = null;
          field_f = null;
          return;
        }
    }

    final static void a(int param0, byte param1) {
        if (param1 >= -82) {
          field_e = null;
          qh.a((byte) -93, 1048576, bj.field_c[param0], true);
          return;
        } else {
          qh.a((byte) -93, 1048576, bj.field_c[param0], true);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = true;
        field_b = "To <%0>: ";
        field_c = new String[]{"By rating", "By win percentage"};
        field_e = "Show all lobby chat";
    }
}
