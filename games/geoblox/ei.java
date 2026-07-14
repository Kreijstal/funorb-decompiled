/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ei extends qf {
    static uj field_hb;
    static String field_gb;

    final static void a(boolean param0, int param1, java.awt.Canvas param2) {
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        L0: {
          var4 = Geoblox.field_C;
          if (-11 < (mi.field_C ^ -1)) {
            L1: {
              var3 = 0;
              if (dl.field_c) {
                var3 = 1;
                dl.field_c = false;
                break L1;
              } else {
                break L1;
              }
            }
            pb.a(tj.a((byte) 73), v.field_q, var3 != 0, false, kh.a((byte) -85));
            break L0;
          } else {
            if (wj.f(7426)) {
              if (hj.field_a == 0) {
                ue.a(param0, false, (byte) -102);
                i.a(0, (byte) 42, param2, 0);
                break L0;
              } else {
                fc.a(true, param2);
                break L0;
              }
            } else {
              vb.c();
              eh.a(240, 320, -51);
              i.a(0, (byte) 51, param2, 0);
              break L0;
            }
          }
        }
        L2: {
          if (param1 == 0) {
            break L2;
          } else {
            var5 = null;
            ei.a(true, -122, (java.awt.Canvas) null);
            break L2;
          }
        }
    }

    final static String a(boolean param0, boolean param1, CharSequence param2) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = Geoblox.field_C;
        var3 = ab.a(param0, 2, param2);
        if (var3 != null) {
          return var3;
        } else {
          if (!param1) {
            var4 = 0;
            L0: while (true) {
              if (var4 < param2.length()) {
                if (q.a(param2.charAt(var4), (byte) 97)) {
                  var4++;
                  continue L0;
                } else {
                  return kc.field_b;
                }
              } else {
                return null;
              }
            }
          } else {
            return null;
          }
        }
    }

    public static void n(int param0) {
        if (param0 > -59) {
            return;
        }
        field_hb = null;
        field_gb = null;
    }

    final void b(el param0, int param1) {
        if (param1 > -10) {
            field_gb = null;
        }
        super.b(param0, -22);
    }

    ei(ng param0, el param1) {
        super(param0, param1, 33, 20, 30);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_hb = new uj();
        field_gb = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
    }
}
