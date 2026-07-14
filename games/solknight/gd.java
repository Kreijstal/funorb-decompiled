/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gd {
    static String field_b;
    static String field_a;

    final static void a(int param0, java.applet.Applet param1) {
        g.a(param1, "", -3603);
        di.a(param1, 63);
        if (param0 != -1) {
            field_b = null;
        }
    }

    public static void a(int param0) {
        field_a = null;
        int var1 = -25 / ((24 - param0) / 60);
        field_b = null;
    }

    final static void a(int param0, o param1, int param2, byte param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var9 = param0 + (param1.field_s + param6 + -param4);
        var10 = param1.field_s - -param0 - -param6 + param2;
        var11 = param1.field_n - -param5 - -(param1.field_t >> 59643873);
        mi.d(var9, 0, var10, param7 + var11);
        param1.a(param0 + -1, -1 + param5, param8);
        param1.a(-1 + param0, 1 + param5, param8);
        mi.a(lj.field_D);
        mi.d(1 + var9, 0, 1 + var10, param7 + var11);
        param1.a(param0 + 1, param5 - 1, param8);
        param1.a(param0 + 1, param5 - -1, param8);
        if (param3 != 118) {
          return;
        } else {
          mi.a(lj.field_D);
          var10 = param0 + (param1.field_s + (param1.field_p - param6)) + -param4;
          var9 = -param2 + (-param6 + param0) + param1.field_s - -param1.field_p;
          mi.d(var9, var11 + -param7, var10, 480);
          param1.a(param0 + -1, -1 + param5, param8);
          param1.a(param0 + -1, param5 + 1, param8);
          mi.a(lj.field_D);
          mi.d(var9 - -1, var11 - param7, var10 + 1, 480);
          param1.a(param0 + 1, param5 + -1, param8);
          param1.a(1 + param0, param5 - -1, param8);
          mi.a(lj.field_D);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Weapon for next level:";
        field_a = "Music: ";
    }
}
