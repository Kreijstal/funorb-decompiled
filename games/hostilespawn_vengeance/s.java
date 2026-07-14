/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s {
    static String field_h;
    private boolean field_f;
    static int field_e;
    static bd field_d;
    static String field_a;
    private String field_c;
    static int field_g;
    static en field_b;

    final static void a(int param0, fd param1, int param2, int param3, kd param4, java.awt.Component param5, boolean param6, int param7) {
        Object var9 = null;
        ug.a(param3, param6, 10);
        uj.field_m = ug.a(param1, param5, 0, param0);
        eb.field_e = ug.a(param1, param5, 1, param2);
        oa.field_b = new wm();
        tm.field_v = param2;
        eb.field_e.a((tj) (Object) oa.field_b);
        ha.field_w = param4;
        if (param7 >= -84) {
            var9 = null;
            s.a(-53, (fd) null, 23, -48, (kd) null, (java.awt.Component) null, false, -17);
        } else {
            ha.field_w.a(ga.field_b, true);
            uj.field_m.a((tj) (Object) ha.field_w);
            return;
        }
        ha.field_w.a(ga.field_b, true);
        uj.field_m.a((tj) (Object) ha.field_w);
    }

    final String a(int param0) {
        if (param0 != 16751324) {
            return null;
        }
        return ((s) this).field_c;
    }

    s(String param0) {
        this(param0, false);
    }

    final boolean a(byte param0) {
        if (param0 != -80) {
            ((s) this).field_c = null;
            return ((s) this).field_f;
        }
        return ((s) this).field_f;
    }

    final static String a(gb param0, String param1, int param2, String param3, String param4) {
        if (param2 < 35) {
            s.a(66, 36, 47, 70);
            if (!(param0.a(-15879))) {
                return param3;
            }
            return param4 + " - " + param0.b(122, param1) + "%";
        }
        if (!(param0.a(-15879))) {
            return param3;
        }
        return param4 + " - " + param0.b(122, param1) + "%";
    }

    public static void a(boolean param0) {
        field_b = null;
        field_d = null;
        field_a = null;
        field_h = null;
        if (param0) {
            Object var2 = null;
            String discarded$0 = s.a((gb) null, (String) null, 5, (String) null, (String) null);
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        bd var12 = null;
        bd var13 = null;
        var11 = HostileSpawn.field_I ? 1 : 0;
        if (param1 != 65792) {
          return;
        } else {
          var12 = hh.field_a[param0];
          var13 = var12;
          var5 = 0;
          var6 = param3 + param2 * 640;
          var7 = 0;
          L0: while (true) {
            if (var13.field_A <= var7) {
              return;
            } else {
              var8 = 0;
              L1: while (true) {
                if (var13.field_z <= var8) {
                  var5 = var5 + var13.field_u;
                  // wide iinc 6 640
                  var7++;
                  continue L0;
                } else {
                  var9 = var12.field_D[var8 + var5];
                  var10 = Math.max((var9 & 16751324) >> 274516528, Math.max((var9 & 65414) >> 1506417704, var9 & 255));
                  if (var10 > 8) {
                    o.field_n.field_f[var8 + var6] = 65792 * var10;
                    var8++;
                    var8++;
                    continue L1;
                  } else {
                    var8++;
                    var8++;
                    continue L1;
                  }
                }
              }
            }
          }
        }
    }

    s(String param0, boolean param1) {
        ((s) this).field_c = param0;
        if (null == ((s) this).field_c) {
            ((s) this).field_c = "";
        }
        ((s) this).field_f = param1 ? true : false;
        if (((s) this).field_c.length() == 0) {
            ((s) this).field_f = false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        bd discarded$0 = new bd(160, 120);
        field_h = "Type your age in years";
        field_a = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
