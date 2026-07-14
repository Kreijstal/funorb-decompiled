/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cc {
    static un field_a;
    static String field_d;
    static sj field_c;
    static String field_b;

    public static void a(int param0) {
        if (param0 != -18277) {
            field_c = null;
        }
        field_c = null;
        field_d = null;
        field_b = null;
        field_a = null;
    }

    final static void a(int param0, java.applet.Applet param1, byte param2, int param3, String[] param4, int param5) {
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = CrazyCrystals.field_B;
          pb.field_b = param1.getParameter("overxgames");
          if (pb.field_b != null) {
            break L0;
          } else {
            pb.field_b = "0";
            break L0;
          }
        }
        L1: {
          fp.field_b = param1.getParameter("overxachievements");
          if (null == fp.field_b) {
            fp.field_b = "0";
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          L3: {
            var6 = param1.getParameter("currency");
            if (var6 == null) {
              break L3;
            } else {
              if (cd.a((CharSequence) (Object) var6, (byte) -98)) {
                v.field_d = ti.a(100, (CharSequence) (Object) var6);
                break L2;
              } else {
                break L3;
              }
            }
          }
          v.field_d = 2;
          break L2;
        }
        pb.field_a = param3;
        qm.field_n = param0;
        mg.field_e = param5;
        ld.field_v = new dl[param4.length];
        var7 = 0;
        L4: while (true) {
          if (var7 >= param4.length) {
            var7 = 16 % ((param2 - 5) / 62);
            hf.field_c = param4;
            return;
          } else {
            ld.field_v[var7] = new dl(317, 34);
            var7++;
            continue L4;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_c = new sj(2, 4, 4, 0);
        field_b = "Music: ";
    }
}
