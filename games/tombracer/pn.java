/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pn extends or {
    static String field_o;
    private byte[] field_p;

    final static void f(int param0) {
        Object var2 = null;
        pr.a(0, "", (String) null);
    }

    final void a(int param0, boolean param1, byte param2) {
        if (param1) {
            return;
        }
        int var4 = param0 * 2;
        param2 = (byte)(((255 & param2) >> 1) + 127);
        int incrementValue$0 = var4;
        var4++;
        ((pn) this).field_p[incrementValue$0] = (byte)param2;
        ((pn) this).field_p[var4] = (byte)param2;
    }

    final byte[] a(int param0, int param1, int param2, int param3) {
        if (param1 != 0) {
            return null;
        }
        ((pn) this).field_p = new byte[param2 * (param3 * param0 * 2)];
        ((pn) this).a(param0, param2, param3, (byte) -119);
        return ((pn) this).field_p;
    }

    pn() {
        super(12, 5, 16, 2, 2, 0.44999998807907104f);
    }

    public static void g(int param0) {
        field_o = null;
    }

    final static iu[] i(int param0) {
        iu[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        byte[] var5 = null;
        int var6 = 0;
        int[] var6_ref_int__ = null;
        int var7 = 0;
        int var8 = 0;
        byte[] var9 = null;
        int[] var10 = null;
        byte[] var11 = null;
        int[] var13 = null;
        byte[] var15 = null;
        int[] var17 = null;
        byte[] var19 = null;
        int[] var21 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        var1 = new iu[fa.field_b];
        var2 = 0;
        L0: while (true) {
          if (var2 >= fa.field_b) {
            loa.a((byte) 2);
            return var1;
          } else {
            var3 = mq.field_b[var2] * iga.field_m[var2];
            var24 = ck.field_c[var2];
            if (!qqa.field_n[var2]) {
              var10 = new int[var3];
              var26 = var10;
              var6 = 0;
              L1: while (true) {
                if (var3 <= var6) {
                  var1[var2] = new iu(ika.field_a, kba.field_s, ak.field_p[var2], pg.field_C[var2], mq.field_b[var2], iga.field_m[var2], var26);
                  var2++;
                  continue L0;
                } else {
                  var10[var6] = mga.field_g[sea.c(255, (int) var24[var6])];
                  var6++;
                  continue L1;
                }
              }
            } else {
              var23 = pb.field_l[var2];
              var19 = var23;
              var15 = var19;
              var11 = var15;
              var9 = var11;
              var5 = var9;
              var25 = new int[var3];
              var21 = var25;
              var17 = var21;
              var13 = var17;
              var6_ref_int__ = var13;
              var7 = 0;
              L2: while (true) {
                if (var3 <= var7) {
                  var1[var2] = (iu) (Object) new mea(ika.field_a, kba.field_s, ak.field_p[var2], pg.field_C[var2], mq.field_b[var2], iga.field_m[var2], var25);
                  var2++;
                  continue L0;
                } else {
                  var6_ref_int__[var7] = fh.a(sea.c(-16777216, var23[var7] << 24), mga.field_g[sea.c(255, (int) var24[var7])]);
                  var7++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    final static boolean h(int param0) {
        if (param0 != 9807) {
            boolean discarded$0 = pn.h(127);
        }
        return bl.field_a != null ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Bags o' Loot";
    }
}
