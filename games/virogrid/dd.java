/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dd {
    static String field_e;
    static String field_d;
    static String field_c;
    static boolean field_a;
    static String field_f;
    static jm field_b;

    final static boolean a(String param0, boolean param1) {
        if (!qc.field_h) {
            return false;
        }
        if (sd.field_e == 2) {
            // if_acmpeq L44
            CharSequence var3 = (CharSequence) (Object) param0;
            // ifeq L44
        } else {
            return false;
        }
        if (param1) {
            return true;
        }
        return true;
    }

    final static mg[] a(byte param0) {
        mg[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int[] var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        int[] var10 = null;
        int[] var14 = null;
        int[] var17 = null;
        int[] var21 = null;
        byte[] var22 = null;
        int[] var23 = null;
        byte[] var24 = null;
        int[] var25 = null;
        var8 = Virogrid.field_F ? 1 : 0;
        var1 = new mg[rj.field_h];
        var2 = 0;
        L0: while (true) {
          if (rj.field_h <= var2) {
            L1: {
              if (param0 <= -106) {
                break L1;
              } else {
                var9 = null;
                boolean discarded$1 = dd.a((String) null, true);
                break L1;
              }
            }
            pe.b((byte) -28);
            return var1;
          } else {
            var3 = db.field_k[var2] * gb.field_F[var2];
            var22 = lj.field_j[var2];
            if (ei.field_d[var2]) {
              var24 = md.field_g[var2];
              var25 = new int[var3];
              var21 = var25;
              var17 = var21;
              var14 = var17;
              var6 = var14;
              var7 = 0;
              L2: while (true) {
                if (var7 >= var3) {
                  var1[var2] = (mg) (Object) new kc(oj.field_Kb, se.field_d, el.field_w[var2], mb.field_bb[var2], db.field_k[var2], gb.field_F[var2], var25);
                  var2++;
                  continue L0;
                } else {
                  var6[var7] = oh.a(rb.a((int) var24[var7], 255) << -524447496, k.field_c[rb.a((int) var22[var7], 255)]);
                  var7++;
                  continue L2;
                }
              }
            } else {
              var10 = new int[var3];
              var23 = var10;
              var6_int = 0;
              L3: while (true) {
                if (var3 <= var6_int) {
                  var1[var2] = new mg(oj.field_Kb, se.field_d, el.field_w[var2], mb.field_bb[var2], db.field_k[var2], gb.field_F[var2], var23);
                  var2++;
                  continue L0;
                } else {
                  var10[var6_int] = k.field_c[rb.a((int) var22[var6_int], 255)];
                  var6_int++;
                  continue L3;
                }
              }
            }
          }
        }
    }

    public static void b(byte param0) {
        if (param0 != -58) {
            return;
        }
        field_e = null;
        field_f = null;
        field_b = null;
        field_d = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Just play";
        field_d = "<%0> ran out of time";
        field_f = "start using this feature.";
        field_c = "Invalid password.";
    }
}
