/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dh {
    int field_a;
    static int field_f;
    static int field_d;
    static int field_e;
    static String[] field_b;
    static w[] field_c;

    final static void a(mm param0, int param1, int param2, cc param3, cc param4, cc param5, int param6, int param7, mm param8, int param9, int param10, int param11, int param12, boolean param13, int param14, int param15, int param16, int param17, int param18, int param19) {
        wf.field_q = param0;
        if (param13) {
          dh.a((mm) null, 99, -109, (cc) null, (cc) null, (cc) null, 54, -67, (mm) null, 70, -37, -96, -83, true, 8, 108, -4, 38, -94, -69);
          aj.field_d = param8;
          fl.b(param14, param17, param19, 0, param10);
          vm.a(param4, param11, param1, -11);
          mk.a(param9, param15, (byte) -118, param5, param2, param3);
          tb.a(param7, -25073, param18);
          qm.a(param16, -115, param6, param12);
          return;
        } else {
          aj.field_d = param8;
          fl.b(param14, param17, param19, 0, param10);
          vm.a(param4, param11, param1, -11);
          mk.a(param9, param15, (byte) -118, param5, param2, param3);
          tb.a(param7, -25073, param18);
          qm.a(param16, -115, param6, param12);
          return;
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_b = null;
        if (param0 != -68) {
            dh.a((mm) null, -53, 78, (cc) null, (cc) null, (cc) null, -74, -100, (mm) null, 108, -57, 96, -30, true, 2, 34, -16, -53, -123, 32);
        }
    }

    final static jb a(Throwable param0, String param1) {
        jb var2_ref = null;
        jb var2 = null;
        if (param0 instanceof jb) {
            var2 = (jb) (Object) param0;
            var2.field_i = var2.field_i + 32 + param1;
        } else {
            var2_ref = new jb(param0, param1);
        }
        return var2_ref;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = -1;
    }
}
