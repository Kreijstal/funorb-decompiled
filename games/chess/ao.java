/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ao {
    static rk field_e;
    boolean field_g;
    static String field_f;
    String field_h;
    static String field_c;
    String field_d;
    static String field_i;
    static ci field_b;
    static String field_j;
    static ci field_a;

    final static km[] a(um param0, String param1, int param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        var4 = param0.a(param3, 0);
        if (param2 != 2993) {
          return null;
        } else {
          var5 = param0.a(param1, 7, var4);
          return qj.a(var5, var4, (byte) 108, param0);
        }
    }

    final static int a(int param0, boolean param1, int param2, int param3) {
        if (param2 - -param0 <= wb.field_h) {
            return param2;
        }
        if (!param1) {
            ao.a(5);
            if (!(param2 - (-param3 - -param0) < 0)) {
                return param2 - (-param3 + param0);
            }
            return wb.field_h + -param0;
        }
        if (!(param2 - (-param3 - -param0) < 0)) {
            return param2 - (-param3 + param0);
        }
        return wb.field_h + -param0;
    }

    final static void b(int param0) {
        L0: {
          b.a(true);
          if (ja.field_h != null) {
            kl.a(ja.field_h, (byte) -114);
            break L0;
          } else {
            break L0;
          }
        }
        rl.a(76);
        if (param0 == -25220) {
          uc.a((byte) -72);
          jd.a((byte) -91);
          if (m.a(param0 ^ 25329)) {
            qn.field_U.f(1, param0 ^ 25285);
            vh.a(0, (byte) -58);
            si.d(65280);
            return;
          } else {
            si.d(65280);
            return;
          }
        } else {
          field_i = null;
          uc.a((byte) -72);
          jd.a((byte) -91);
          if (!m.a(param0 ^ 25329)) {
            si.d(65280);
            return;
          } else {
            qn.field_U.f(1, param0 ^ 25285);
            vh.a(0, (byte) -58);
            si.d(65280);
            return;
          }
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_j = null;
        field_i = null;
        field_b = null;
        if (param0 != 1) {
          return;
        } else {
          field_c = null;
          field_f = null;
          field_a = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Warning: if you quit, you will lose any game you are in the middle of!";
        field_f = "Password is valid";
        field_j = "Player";
        field_c = "Sound: ";
    }
}
