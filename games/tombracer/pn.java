/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pn extends or {
    static String field_o;
    private byte[] field_p;

    final static void f(int param0) {
        if (param0 != -804227775) {
            pn.i(-62);
        }
        String var2 = (String) null;
        pr.a(0, "", (String) null);
    }

    final void a(int param0, boolean param1, byte param2) {
        if (param1) {
            return;
        }
        int var4 = param0 * 2;
        param2 = (byte)(((255 & param2) >> -804227775) + 127);
        int incrementValue$0 = var4;
        var4++;
        this.field_p[incrementValue$0] = (byte)param2;
        this.field_p[var4] = (byte)param2;
    }

    final byte[] a(int param0, int param1, int param2, int param3) {
        if (param1 != 0) {
            return (byte[]) null;
        }
        this.field_p = new byte[param2 * (param3 * param0 * 2)];
        this.a(param0, param2, param3, (byte) -119);
        return this.field_p;
    }

    pn() {
        super(12, 5, 16, 2, 2, 0.44999998807907104f);
    }

    public static void g(int param0) {
        if (param0 > -26) {
            return;
        }
        field_o = null;
    }

    final static iu[] i(int param0) {
        iu[] var1;
        int var2;
        int var3;
        byte[] var5;
        int var6;
        int[] var6_ref_int__;
        int var7;
        int var8;
        byte[] var9;
        int[] var10;
        byte[] var11;
        int[] var13;
        byte[] var15;
        int[] var17;
        byte[] var21;
        int[] var22;
        var8 = TombRacer.field_G ? 1 : 0;
        if (param0 >= 71) {
          var1 = new iu[fa.field_b];
          var2 = 0;
          L0: while (true) {
            if (var2 >= fa.field_b) {
              loa.a((byte) 2);
              return var1;
            } else {
              var3 = mq.field_b[var2] * iga.field_m[var2];
              var21 = ck.field_c[var2];
              if (!qqa.field_n[var2]) {
                var10 = new int[var3];
                var22 = var10;
                var6 = 0;
                L1: while (true) {
                  if (var3 <= var6) {
                    var1[var2] = new iu(ika.field_a, kba.field_s, ak.field_p[var2], pg.field_C[var2], mq.field_b[var2], iga.field_m[var2], var22);
                    var2++;
                    continue L0;
                  } else {
                    var10[var6] = mga.field_g[sea.c(255, (int) var21[var6])];
                    var6++;
                    continue L1;
                  }
                }
              } else {
                var15 = pb.field_l[var2];
                var11 = var15;
                var9 = var11;
                var5 = var9;
                var17 = new int[var3];
                var13 = var17;
                var6_ref_int__ = var13;
                var7 = 0;
                L2: while (true) {
                  if (var3 <= var7) {
                    var1[var2] = (iu) ((Object) new mea(ika.field_a, kba.field_s, ak.field_p[var2], pg.field_C[var2], mq.field_b[var2], iga.field_m[var2], var17));
                    var2++;
                    continue L0;
                  } else {
                    var6_ref_int__[var7] = fh.a(sea.c(-16777216, var15[var7] << -1203922312), mga.field_g[sea.c(255, (int) var21[var7])]);
                    var7++;
                    continue L2;
                  }
                }
              }
            }
          }
        } else {
          return (iu[]) null;
        }
    }

    final static boolean h(int param0) {
        if (param0 != 9807) {
            pn.h(127);
        }
        return bl.field_a != null ? true : false;
    }

    static {
        field_o = "Bags o' Loot";
    }
}
