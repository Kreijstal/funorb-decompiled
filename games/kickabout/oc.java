/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc {
    String field_g;
    sj field_h;
    String field_c;
    static int field_e;
    static String field_f;
    String field_d;
    static String field_b;
    int field_a;

    final static ut c(byte param0) {
        int var1 = 0;
        Object var3 = null;
        int var5 = 0;
        int[] var5_ref_int__ = null;
        int var6 = 0;
        int var7 = 0;
        int[] var9 = null;
        int[] var11 = null;
        int[] var13 = null;
        int[] var16 = null;
        int[] var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        var7 = Kickabout.field_G;
        var1 = ku.field_c[0] * lo.field_j[0];
        if (param0 != 75) {
          return null;
        } else {
          L0: {
            var18 = pq.field_O[0];
            if (!rm.field_B[0]) {
              var21 = new int[var1];
              var17 = var21;
              var9 = var17;
              var5 = 0;
              L1: while (true) {
                if (var1 <= var5) {
                  var3 = (Object) (Object) new ut(kw.field_i, ai.field_J, aq.field_f[0], fc.field_g[0], ku.field_c[0], lo.field_j[0], var21);
                  break L0;
                } else {
                  var9[var5] = lt.field_a[qj.b((int) var18[var5], 255)];
                  var5++;
                  continue L1;
                }
              }
            } else {
              var19 = es.field_e[0];
              var20 = new int[var1];
              var16 = var20;
              var13 = var16;
              var11 = var13;
              var5_ref_int__ = var11;
              var6 = 0;
              L2: while (true) {
                if (var1 <= var6) {
                  var3 = (Object) (Object) new ot(kw.field_i, ai.field_J, aq.field_f[0], fc.field_g[0], ku.field_c[0], lo.field_j[0], var20);
                  break L0;
                } else {
                  var5_ref_int__[var6] = hf.a(lt.field_a[qj.b((int) var18[var6], 255)], qj.b(-16777216, var19[var6] << 24));
                  var6++;
                  continue L2;
                }
              }
            }
          }
          tk.h((byte) -111);
          return (ut) var3;
        }
    }

    final static void a(byte param0) {
        nn.field_D = false;
        pg.field_a = null;
        cg.field_E = null;
        if (param0 >= -10) {
          ut discarded$2 = oc.c((byte) -42);
          dn.field_Eb = null;
          pn.field_D = null;
          return;
        } else {
          dn.field_Eb = null;
          pn.field_D = null;
          return;
        }
    }

    public static void b() {
        field_b = null;
        field_f = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 49;
        field_b = "My Squad";
    }
}
