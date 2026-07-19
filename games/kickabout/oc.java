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
        byte[] var16 = null;
        byte[] var17 = null;
        var7 = Kickabout.field_G;
        var1 = ku.field_c[0] * lo.field_j[0];
        if (param0 != 75) {
          return (ut) null;
        } else {
          L0: {
            var16 = pq.field_O[0];
            if (!rm.field_B[0]) {
              var9 = new int[var1];
              var5 = 0;
              L1: while (true) {
                if (var1 <= var5) {
                  var3 = new ut(kw.field_i, ai.field_J, aq.field_f[0], fc.field_g[0], ku.field_c[0], lo.field_j[0], var9);
                  break L0;
                } else {
                  var9[var5] = lt.field_a[qj.b((int) var16[var5], 255)];
                  var5++;
                  continue L1;
                }
              }
            } else {
              var17 = es.field_e[0];
              var13 = new int[var1];
              var11 = var13;
              var5_ref_int__ = var11;
              var6 = 0;
              L2: while (true) {
                if (var1 <= var6) {
                  var3 = new ot(kw.field_i, ai.field_J, aq.field_f[0], fc.field_g[0], ku.field_c[0], lo.field_j[0], var13);
                  break L0;
                } else {
                  var5_ref_int__[var6] = hf.a(lt.field_a[qj.b((int) var16[var6], 255)], qj.b(-16777216, var17[var6] << 831319448));
                  var6++;
                  continue L2;
                }
              }
            }
          }
          tk.h((byte) -111);
          return (ut) (var3);
        }
    }

    final static void a(byte param0) {
        ut discarded$2 = null;
        nn.field_D = false;
        pg.field_a = null;
        cg.field_E = null;
        if (param0 >= -10) {
          discarded$2 = oc.c((byte) -42);
          dn.field_Eb = null;
          pn.field_D = null;
          return;
        } else {
          dn.field_Eb = null;
          pn.field_D = null;
          return;
        }
    }

    public static void b(byte param0) {
        ut discarded$0 = null;
        if (param0 > -48) {
            discarded$0 = oc.c((byte) 119);
            field_b = null;
            field_f = null;
            return;
        }
        field_b = null;
        field_f = null;
    }

    static {
        field_e = 49;
        field_b = "My Squad";
    }
}
