/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wf {
    static String field_a;

    final static byte[] a(String param0, int param1) {
        if (param1 != -19073) {
            field_a = (String) null;
            return sd.field_a.a((byte) 7, param0, "");
        }
        return sd.field_a.a((byte) 7, param0, "");
    }

    final static void a(int param0, int param1) {
        gi var2 = null;
        int var3 = 0;
        java.applet.Applet var4 = null;
        var3 = Main.field_T;
        mf.field_i = param0;
        var2 = (gi) aj.field_s.a((byte) 74);
        if (param1 >= -9) {
          var4 = (java.applet.Applet) null;
          wf.a((byte) -32, (java.applet.Applet) null);
          L0: while (true) {
            if (var2 != null) {
              L1: {
                if (((gi) var2).field_i.b(-115)) {
                  ((gi) var2).field_h.f(mf.field_i * ((gi) var2).field_j / 80);
                  break L1;
                } else {
                  var2.c(103);
                  break L1;
                }
              }
              var2 = (gi) aj.field_s.b((byte) -111);
              continue L0;
            } else {
              return;
            }
          }
        } else {
          L2: while (true) {
            if (var2 != null) {
              L3: {
                if (((gi) var2).field_i.b(-115)) {
                  ((gi) var2).field_h.f(mf.field_i * ((gi) var2).field_j / 80);
                  break L3;
                } else {
                  var2.c(103);
                  break L3;
                }
              }
              var2 = (gi) aj.field_s.b((byte) -111);
              continue L2;
            } else {
              return;
            }
          }
        }
    }

    final static void a(byte param0, java.applet.Applet param1) {
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        String var6 = null;
        rc.field_m = true;
        var2 = "tuhstatbut";
        var3 = "rvnadlm";
        var4 = -1L;
        if (param0 > -81) {
          var6 = (String) null;
          byte[] discarded$2 = wf.a((String) null, -37);
          uh.a(var4, 100, var2, var3, param1);
          return;
        } else {
          uh.a(var4, 100, var2, var3, param1);
          return;
        }
    }

    public static void a(int param0) {
        if (param0 != 3) {
            kc[] discarded$0 = wf.a(-101, -45, 29, 105, 103);
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static kc[] a(int param0, int param1, int param2, int param3, int param4) {
        if (param1 != 1) {
          wf.a(120, -107);
          return ma.a(param2, 1, param3, 1, 3, param4, 1, param0, (byte) -22);
        } else {
          return ma.a(param2, 1, param3, 1, 3, param4, 1, param0, (byte) -22);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Change display name";
    }
}
