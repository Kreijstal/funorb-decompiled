/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qi extends vm {
    static boolean field_l;
    static ci field_o;
    static String field_m;
    static int[] field_p;
    static String field_n;

    qi(qn param0) {
        super(param0);
    }

    final mk a(byte param0, String param1) {
        int var3 = 0;
        int var4 = 0;
        CharSequence var5 = null;
        CharSequence var6 = null;
        var5 = (CharSequence) (Object) param1;
        if (!lg.a((byte) 108, var5)) {
          return qk.field_b;
        } else {
          var3 = 28 % ((param0 - -49) / 62);
          var6 = (CharSequence) (Object) param1;
          var4 = fn.a(var6, 0);
          if (-1 > (var4 ^ -1)) {
            if (var4 > 130) {
              return qk.field_b;
            } else {
              return oa.field_a;
            }
          } else {
            return qk.field_b;
          }
        }
    }

    public static void b(byte param0) {
        if (param0 <= 34) {
          qi.b((byte) -62);
          field_p = null;
          field_n = null;
          field_m = null;
          field_o = null;
          return;
        } else {
          field_p = null;
          field_n = null;
          field_m = null;
          field_o = null;
          return;
        }
    }

    final String a(String param0, int param1) {
        if (param1 != -9316) {
            return null;
        }
        if (!(((qi) this).a((byte) -126, param0) != qk.field_b)) {
            return rm.field_D;
        }
        return null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_n = "Connection lost - attempting to reconnect";
        field_p = new int[8192];
    }
}
