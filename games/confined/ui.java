/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ui {
    static String field_d;
    static jj field_c;
    static nf field_a;
    static String field_e;
    static String field_b;

    final static String a(int param0) {
        String var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        var5 = Confined.field_J ? 1 : 0;
        var6 = "(" + kk.field_c + " " + pk.field_c + " " + qm.field_y + ") " + Confined.field_F;
        if (0 >= ai.field_i) {
          return var6;
        } else {
          var1 = var6 + ":";
          var2 = 0;
          L0: while (true) {
            if (ai.field_i <= var2) {
              return var1;
            } else {
              L1: {
                var7 = var1 + ' ';
                var3 = 255 & e.field_c.field_m[var2];
                var4 = var3 >> 4;
                var3 = var3 & 15;
                if (10 > var4) {
                  var4 += 48;
                  break L1;
                } else {
                  var4 += 55;
                  break L1;
                }
              }
              L2: {
                if (var3 >= 10) {
                  var3 += 55;
                  break L2;
                } else {
                  var3 += 48;
                  break L2;
                }
              }
              var8 = var7 + (char)var4;
              var1 = var8 + (char)var3;
              var2++;
              continue L0;
            }
          }
        }
    }

    public static void a() {
        field_e = null;
        field_a = null;
        field_c = null;
        field_b = null;
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_d = "To server list";
    }
}
