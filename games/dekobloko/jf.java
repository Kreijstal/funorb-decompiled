/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf {
    static String field_f;
    static lf field_g;
    static int field_c;
    static String field_b;
    static String field_a;
    static long field_d;
    static w field_e;

    final static void a(java.awt.Canvas param0, boolean param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = client.field_A ? 1 : 0;
        if (ca.field_vb >= 10) {
          if (!dl.a(480)) {
            hk.b();
            hk.b();
            hk.b();
            qc.a(240, 320, param2 ^ -21986);
            mf.a(1, 0, 0, param0);
            if (param2 != -6351) {
              jf.a(-78);
              return;
            } else {
              return;
            }
          } else {
            if (hc.field_d != 0) {
              cn.a(true, param0);
              if (param2 != -6351) {
                jf.a(-78);
                return;
              } else {
                return;
              }
            } else {
              uc.a(false, param1, 78);
              mf.a(1, 0, 0, param0);
              if (param2 == -6351) {
                return;
              } else {
                jf.a(-78);
                return;
              }
            }
          }
        } else {
          L0: {
            var3 = 0;
            if (cd.field_g) {
              var3 = 1;
              cd.field_g = false;
              break L0;
            } else {
              break L0;
            }
          }
          bf.a(cn.b(true), var3 != 0, 6, cf.a(-11777), fb.field_g);
          if (param2 == -6351) {
            return;
          } else {
            jf.a(-78);
            return;
          }
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_f = null;
        int var1 = -128 % ((param0 - -47) / 61);
        field_b = null;
        field_g = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Your game";
        field_a = "Invite more players, or alternatively try changing the following settings:  ";
        field_b = "<%0> might change the options - wait and see.";
        field_c = 0;
        field_g = new lf();
    }
}
