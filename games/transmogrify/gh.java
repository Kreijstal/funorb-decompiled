/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gh extends wf {
    byte[] field_k;
    int field_j;
    static int field_l;
    static tf field_g;
    static int field_h;
    static sd field_m;
    static boolean field_i;

    final static void d(int param0) {
        cf var1 = null;
        hj var2 = null;
        var1 = (cf) (Object) mh.field_e.a((byte) -95);
        if (var1 != null) {
          var2 = nf.field_l;
          int discarded$18 = var2.c((byte) -126);
          if (param0 != 0) {
            gh.e(38);
            int discarded$19 = var2.c((byte) -108);
            int discarded$20 = var2.c((byte) -105);
            int discarded$21 = var2.c((byte) -119);
            var1.c(param0 + 5);
            return;
          } else {
            int discarded$22 = var2.c((byte) -108);
            int discarded$23 = var2.c((byte) -105);
            int discarded$24 = var2.c((byte) -119);
            var1.c(param0 + 5);
            return;
          }
        } else {
          pc.a(1);
          return;
        }
    }

    public static void e(int param0) {
        if (param0 < 10) {
            field_i = true;
            field_m = null;
            field_g = null;
            return;
        }
        field_m = null;
        field_g = null;
    }

    private gh() throws Throwable {
        throw new Error();
    }

    final static void a(java.applet.Applet param0, byte param1) {
        String var2 = null;
        CharSequence var3 = null;
        var2 = param0.getParameter("username");
        if (var2 != null) {
          var3 = (CharSequence) (Object) var2;
          if ((uk.b(114, var3) ^ -1L) == -1L) {
            return;
          } else {
            L0: {
              if (param1 == -112) {
                break L0;
              } else {
                gh.e(-50);
                break L0;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = -17;
        field_g = new tf(10, 2, 2, 0);
        field_i = false;
    }
}
