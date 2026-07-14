/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gt {
    static je[] field_b;
    static wk[] field_c;
    static String field_g;
    static int field_i;
    static String field_a;
    static int[] field_d;
    static wk field_e;
    static String field_h;
    static String[] field_f;

    final static boolean a(String param0, byte param1) {
        int var2 = -112 % ((param1 - 19) / 63);
        CharSequence var3 = (CharSequence) (Object) param0;
        return ft.field_p.equals((Object) (Object) k.a(var3, false));
    }

    final static rn b(String param0, byte param1) {
        rn var5 = null;
        if (param0 == null) {
            return tn.field_ab;
        }
        if (0 == param0.length()) {
            return tn.field_ab;
        }
        int var2 = param0.indexOf('@');
        if (!(var2 != -1)) {
            return hv.field_N;
        }
        String var3 = param0.substring(0, var2);
        String var4 = param0.substring(var2 + 1);
        if (param1 != -24) {
            field_f = null;
            var5 = ng.a(var3, 15026);
            if (!(var5 == null)) {
                return var5;
            }
            return ew.a(var4, (byte) 104);
        }
        var5 = ng.a(var3, 15026);
        if (!(var5 == null)) {
            return var5;
        }
        return ew.a(var4, (byte) 104);
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        field_g = null;
        field_b = null;
        field_f = null;
        field_e = null;
        field_d = null;
        if (param0 != 494) {
          return;
        } else {
          field_h = null;
          return;
        }
    }

    final static int[] a(int param0, vh param1) {
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        int[] var6 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        var6 = new int[6];
        var2 = var6;
        var3 = 0;
        L0: while (true) {
          if (var6.length <= var3) {
            if (param0 != -2) {
              var5 = null;
              int[] discarded$2 = gt.a(115, (vh) null);
              return var2;
            } else {
              return var2;
            }
          } else {
            var6[var3] = param1.k(param0 + 2);
            var3++;
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "This coat of arms became unlocked at <%0>. All parts of it are available to add to your own coat of arms.";
        field_a = "This game option is only available to members.";
        field_d = new int[128];
        field_h = "Checking";
    }
}
