/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fa extends li {
    static int[] field_u;
    static String field_p;
    static char[] field_o;
    int field_n;
    static String field_r;
    static String field_v;
    static String field_q;
    static String field_t;
    static er[] field_s;

    fa(int param0) {
        ((fa) this).field_n = param0;
    }

    public static void a(byte param0) {
        field_v = null;
        field_o = null;
        field_t = null;
        field_u = null;
        int var1 = 103 / ((-65 - param0) / 61);
        field_p = null;
        field_q = null;
        field_r = null;
        field_s = null;
    }

    final static void a(int param0, int param1, boolean param2) {
        mi var4 = null;
        uh var6 = null;
        uh var7 = null;
        L0: {
          if (param1 == br.field_Q) {
            break L0;
          } else {
            L1: {
              var6 = (uh) (Object) lh.field_b.a(3661, (long)br.field_Q);
              var7 = var6;
              if (var7 != null) {
                var7.field_Hb = null;
                break L1;
              } else {
                break L1;
              }
            }
            br.field_Q = param1;
            var4 = uh.field_Wb;
            var4.j(param0, 125);
            var4.f(3, -86);
            var4.f(11, -112);
            var4.d(param1, -1783);
            break L0;
          }
        }
        if (!param2) {
          fa.a(-112, 53, true);
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
        field_p = "<%0> must play <%1> more rated games before playing with the current options.";
        field_u = new int[8192];
        field_q = "Friends";
        field_v = "Unpacking languages";
        field_r = "Level <%0> - Personal Best!";
        field_t = "Please select an option in the '<%0>' row.";
    }
}
