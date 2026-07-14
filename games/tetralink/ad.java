/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad extends hl {
    static String field_Nb;
    int field_Lb;
    private hl[] field_Kb;
    private hl[] field_Mb;
    private hl field_Ob;

    ad(long param0, hl param1, String[] param2, hl param3, hl[] param4, int param5) {
        super(param0, (hl) null);
        int var8 = 0;
        hl var9 = null;
        ((ad) this).field_Mb = new hl[param2.length];
        ((ad) this).field_Ob = new hl(0L, param3);
        ((ad) this).field_Kb = param4;
        for (var8 = 0; var8 < param2.length; var8++) {
            var9 = new hl(0L, param1);
            var9.field_jb = param2[var8];
            ((ad) this).field_Mb[var8] = var9;
            ((ad) this).a((byte) -101, var9);
        }
        ((ad) this).a((byte) -125, ((ad) this).field_Ob);
        int var11 = 0;
        var8 = var11;
        while (param4.length > var11) {
            ((ad) this).field_Ob.a((byte) 72, param4[var11]);
            var11++;
        }
        ((ad) this).field_Lb = param5;
        ((ad) this).field_Mb[param5].field_zb = true;
    }

    public static void d(byte param0) {
        if (param0 != 43) {
            field_Nb = null;
        }
        field_Nb = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        hg.field_f[param2] = param6;
        hg.field_g[param2] = param4;
        hg.field_h[param2] = param5;
        if (param1 != 0) {
            return;
        }
        hg.field_b[param2] = param0;
        hg.field_j[param2] = param3;
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var7 = TetraLink.field_J;
        var4 = 0;
        L0: while (true) {
          if (((ad) this).field_Mb.length <= var4) {
            ((ad) this).field_Ob.a((byte) -117, ((ad) this).field_Hb, param1, ((ad) this).field_R - param1, 0);
            var8 = 0;
            var4 = var8;
            L1: while (true) {
              if (var8 >= ((ad) this).field_Kb.length) {
                L2: {
                  if (param0 == -8325) {
                    break L2;
                  } else {
                    ((ad) this).field_Mb = null;
                    break L2;
                  }
                }
                return;
              } else {
                ((ad) this).field_Kb[var8].a((byte) -90, ((ad) this).field_Ob.field_Hb + -(param2 * 2), param2, ((ad) this).field_Ob.field_R - 2 * param2, param2);
                if (((ad) this).field_Lb != var8) {
                  ((ad) this).field_Kb[var8].field_M = ((ad) this).field_Kb[var8].field_M + 10000;
                  var8++;
                  continue L1;
                } else {
                  var8++;
                  continue L1;
                }
              }
            }
          } else {
            var5 = var4 * ((ad) this).field_Hb / ((ad) this).field_Mb.length;
            var6 = (1 + var4) * ((ad) this).field_Hb / ((ad) this).field_Mb.length;
            ((ad) this).field_Mb[var4].field_M = var5;
            ((ad) this).field_Mb[var4].field_yb = 0;
            ((ad) this).field_Mb[var4].field_Hb = var6 - var5;
            ((ad) this).field_Mb[var4].field_R = param1;
            var4++;
            continue L0;
          }
        }
    }

    final void c(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = TetraLink.field_J;
          var2 = 0;
          if (param0) {
            break L0;
          } else {
            ad.d((byte) 85);
            break L0;
          }
        }
        L1: while (true) {
          if (((ad) this).field_Mb.length <= var2) {
            return;
          } else {
            if (((ad) this).field_Lb != var2) {
              if (0 != ((ad) this).field_Mb[var2].field_F) {
                ((ad) this).field_Mb[((ad) this).field_Lb].field_zb = false;
                ((ad) this).field_Kb[((ad) this).field_Lb].field_M = ((ad) this).field_Kb[((ad) this).field_Lb].field_M + 10000;
                ((ad) this).field_Lb = var2;
                ((ad) this).field_Mb[var2].field_zb = true;
                ((ad) this).field_Kb[var2].field_M = ((ad) this).field_Kb[var2].field_M - 10000;
                var2++;
                continue L1;
              } else {
                var2++;
                continue L1;
              }
            } else {
              var2++;
              continue L1;
            }
          }
        }
    }

    final void b(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param0 != 0) {
            ((ad) this).field_Kb = null;
        }
        ((ad) this).field_M = param2;
        ((ad) this).field_yb = param4;
        ((ad) this).field_Hb = param5;
        ((ad) this).field_R = param1;
        this.a(param0 + -8325, param6, param3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Nb = "Chat view has been scrolled up. Scroll down to chat.";
    }
}
