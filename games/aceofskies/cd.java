/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cd {
    private boolean field_d;
    static String field_c;
    static eg field_a;
    private String field_e;
    static int field_f;
    static int field_b;

    final static void a(java.awt.Canvas param0, int param1) {
        ei.a(107, (java.awt.Component) (Object) param0);
        de.a((java.awt.Component) (Object) param0, false);
        if (param1 < 22) {
          L0: {
            field_c = (String) null;
            if (null != jd.field_c) {
              jd.field_c.a((java.awt.Component) (Object) param0, -104);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (null != jd.field_c) {
              jd.field_c.a((java.awt.Component) (Object) param0, -104);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final boolean a(int param0) {
        int var2 = -76 % ((-50 - param0) / 53);
        return ((cd) this).field_d;
    }

    final String b(int param0) {
        if (param0 != -17233) {
            field_b = -105;
            return ((cd) this).field_e;
        }
        return ((cd) this).field_e;
    }

    final static wp a(gk param0, String param1, String param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        var4 = param0.b(param1, 0);
        var5 = param0.a(-125, var4, param2);
        if (param3 >= -43) {
          var6 = (String) null;
          wp discarded$2 = cd.a((gk) null, (String) null, (String) null, -13);
          return bl.a((byte) -123, var5, param0, var4);
        } else {
          return bl.a((byte) -123, var5, param0, var4);
        }
    }

    cd(String param0) {
        this(param0, false);
    }

    cd(String param0, boolean param1) {
        ((cd) this).field_e = param0;
        if (null == ((cd) this).field_e) {
            ((cd) this).field_e = "";
        }
        ((cd) this).field_d = param1 ? true : false;
        if (((cd) this).field_e.length() == 0) {
            ((cd) this).field_d = false;
        }
    }

    public static void c(int param0) {
        if (param0 != 0) {
            return;
        }
        field_c = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_a = new eg();
        field_b = 0;
    }
}
