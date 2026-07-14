/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tt {
    static String[][] field_d;
    static String field_b;
    static vd[] field_c;
    static boolean field_a;

    public static void a(int param0) {
        if (param0 != 20525) {
            return;
        }
        field_d = (String[][]) null;
        field_b = null;
        field_c = null;
    }

    final static void a(int param0, int param1) {
        wf var2 = null;
        int var3 = 0;
        ds var4 = null;
        var3 = AceOfSkies.field_G ? 1 : 0;
        if (param1 == 2048) {
          var4 = (ds) cl.field_eb.d(268435455);
          L0: while (true) {
            if (var4 == null) {
              var2 = ep.field_z.d(268435455);
              L1: while (true) {
                if (var2 != null) {
                  hn.a(0, param0);
                  var2 = ep.field_z.b((byte) 103);
                  continue L1;
                } else {
                  return;
                }
              }
            } else {
              nn.a(var4, param0, (byte) 62);
              var4 = (ds) cl.field_eb.b((byte) 103);
              continue L0;
            }
          }
        } else {
          field_b = (String) null;
          var4 = (ds) cl.field_eb.d(268435455);
          L2: while (true) {
            if (var4 == null) {
              var2 = ep.field_z.d(268435455);
              L3: while (true) {
                if (var2 != null) {
                  hn.a(0, param0);
                  var2 = ep.field_z.b((byte) 103);
                  continue L3;
                } else {
                  return;
                }
              }
            } else {
              nn.a(var4, param0, (byte) 62);
              var4 = (ds) cl.field_eb.b((byte) 103);
              continue L2;
            }
          }
        }
    }

    final static void b(int param0) {
        if (null == jf.field_a) {
            return;
        }
        pg.a((java.awt.Canvas) (Object) jf.field_a, param0 ^ -32631);
        jf.field_a.a((byte) 87, pt.field_b);
        jf.field_a = null;
        if (null != aj.field_s) {
            aj.field_s.c(1);
            if (param0 == -32546) {
                ci.field_f.requestFocus();
                return;
            }
            field_c = (vd[]) null;
            ci.field_f.requestFocus();
            return;
        }
        if (param0 != -32546) {
            field_c = (vd[]) null;
            ci.field_f.requestFocus();
            return;
        }
        ci.field_f.requestFocus();
    }

    final static boolean a(int param0, boolean param1, int param2) {
        if (!param1) {
            field_d = (String[][]) (String[][]) null;
            return 0 != (param0 & 2048) ? true : false;
        }
        return 0 != (param0 & 2048) ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new String[][]{new String[5], new String[5], new String[2], new String[4], new String[4]};
        field_b = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_a = false;
    }
}
