/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fs {
    static int field_b;
    static String field_c;
    static String[] field_a;

    public static void a(int param0) {
        if (param0 > -80) {
            fs.a((byte) 122);
            field_a = null;
            field_c = null;
            return;
        }
        field_a = null;
        field_c = null;
    }

    final static ut[] a(int param0, int param1, int param2, int param3, int param4, byte param5) {
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        ut var9 = null;
        ut var10 = null;
        ut var11 = null;
        Object var14 = null;
        int[] var15 = null;
        int[] var17 = null;
        int[] var18 = null;
        ut var19 = null;
        ut var20 = null;
        ut var21 = null;
        int[] var22 = null;
        ut var23 = null;
        ut var24 = null;
        ut var25 = null;
        int[] var26 = null;
        var26 = on.field_a;
        var22 = var26;
        var18 = var22;
        var17 = var18;
        var15 = var17;
        var6 = var15;
        var7 = on.field_g;
        var8 = on.field_f;
        var9 = new ut(param1, param0 + -(param1 * 2));
        var9.e();
        on.g(0, 0, param1, -(2 * param1) + param0, param3, param4);
        var10 = new ut(param1, param1);
        var10.e();
        on.a(0, 0, param1, param1, param3);
        var11 = new ut(16, param1);
        var11.e();
        on.a(0, 0, 16, param1, param3);
        if (param5 <= 77) {
          L0: {
            field_a = null;
            var19 = new ut(param1, param1);
            var19.e();
            on.a(0, 0, param1, param1, param4);
            var20 = new ut(16, param1);
            var20.e();
            on.a(0, 0, 16, param1, param4);
            var14 = null;
            if (-1 <= (param2 ^ -1)) {
              break L0;
            } else {
              var21 = new ut(16, 16);
              var14 = (Object) (Object) var21;
              var21.e();
              on.a(0, 0, 16, 16, param2);
              break L0;
            }
          }
          on.a(var26, var7, var8);
          return new ut[]{var10, var11, var10, var9, (ut) var14, var9, var19, var20, var19};
        } else {
          L1: {
            var23 = new ut(param1, param1);
            var23.e();
            on.a(0, 0, param1, param1, param4);
            var24 = new ut(16, param1);
            var24.e();
            on.a(0, 0, 16, param1, param4);
            var14 = null;
            if (-1 <= (param2 ^ -1)) {
              break L1;
            } else {
              var25 = new ut(16, 16);
              var14 = (Object) (Object) var25;
              var25.e();
              on.a(0, 0, 16, 16, param2);
              break L1;
            }
          }
          on.a(var26, var7, var8);
          return new ut[]{var10, var11, var10, var9, (ut) var14, var9, var23, var24, var23};
        }
    }

    final static int a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, ml param7, int param8, int param9) {
        int var11 = 0;
        int var12 = 0;
        int var10 = 59 % ((-62 - param0) / 61);
        var10 = param7.l(2, 59);
        if (-1 != (var10 ^ -1)) {
            if ((var10 ^ -1) != -2) {
                if (-3 == (var10 ^ -1)) {
                    var11 = 0 != param3 ? aq.a(param3, -30273, param7) : 0;
                    var12 = param2 + param1;
                    return 0 > var11 ? var11 - var12 : var11 - -var12;
                }
                if ((var10 ^ -1) != -4) {
                    throw new IllegalStateException();
                }
                var11 = 0 == param8 ? 0 : aq.a(param8, -30273, param7);
                var12 = param1 + param6 + param2;
                return 0 > var11 ? var11 + -var12 : var12 + var11;
            }
            var11 = param4 != 0 ? aq.a(param4, -30273, param7) : 0;
            var12 = param1;
            return -1 >= (var11 ^ -1) ? var12 + var11 : -var12 + var11;
        }
        return 0 != param9 ? aq.a(param9, -30273, param7) : 0;
    }

    final static void a(int param0, gm param1, int param2) {
        ui.g(0).a(param1, param0, true);
        if (param2 < 103) {
            field_c = null;
        }
    }

    final static void a(byte param0) {
        if (param0 == -126) {
          if (up.field_p != 0 + -qt.field_l) {
            if (up.field_p == -qt.field_l + 250) {
              up.field_p = up.field_p + 1;
              return;
            } else {
              up.field_p = up.field_p + 1;
              return;
            }
          } else {
            up.field_p = up.field_p + 1;
            return;
          }
        } else {
          field_a = null;
          if (up.field_p != 0 + -qt.field_l) {
            if (up.field_p == -qt.field_l + 250) {
              up.field_p = up.field_p + 1;
              return;
            } else {
              up.field_p = up.field_p + 1;
              return;
            }
          } else {
            up.field_p = up.field_p + 1;
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Staff impersonation";
        field_b = -1;
    }
}
