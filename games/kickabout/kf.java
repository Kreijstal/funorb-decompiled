/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kf extends hd {
    private hd[] field_Ab;
    static String field_yb;
    static int field_Eb;
    private hd[] field_Bb;
    int field_Db;
    private hd field_Cb;
    static String field_zb;

    final static void a(int param0, byte param1) {
        int var2 = 0;
        int var3 = Kickabout.field_G;
        if (param1 != 63) {
            kf.c(true);
        }
        na.a(kt.field_g, true, wf.field_O, er.field_k, 1, param0, 0);
        for (var2 = 0; var2 < wf.field_O; var2++) {
            pf.field_d[var2 - -param0] = var2;
        }
        na.a(lm.field_V, false, wf.field_O - -param0, vi.field_s, 1, param0 + param0, param0);
        if (wf.field_O > param0) {
            wf.field_O = param0;
        }
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((kf) this).field_q = param6;
        ((kf) this).field_mb = param1;
        ((kf) this).field_s = param2;
        if (!param0) {
            this.a(79, -39, -98);
        }
        ((kf) this).field_J = param5;
        this.a(param3, param4, 10000);
    }

    kf(long param0, hd param1, String[] param2, hd param3, hd[] param4, int param5) {
        super(param0, (hd) null);
        int var8 = 0;
        hd var9 = null;
        ((kf) this).field_Bb = new hd[param2.length];
        ((kf) this).field_Cb = new hd(0L, param3);
        ((kf) this).field_Ab = param4;
        for (var8 = 0; var8 < param2.length; var8++) {
            var9 = new hd(0L, param1);
            var9.field_E = param2[var8];
            ((kf) this).field_Bb[var8] = var9;
            ((kf) this).a((byte) -109, var9);
        }
        ((kf) this).a((byte) -124, ((kf) this).field_Cb);
        int var11 = 0;
        var8 = var11;
        while (var11 < param4.length) {
            ((kf) this).field_Cb.a((byte) -127, param4[var11]);
            var11++;
        }
        ((kf) this).field_Db = param5;
        ((kf) this).field_Bb[param5].field_I = true;
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var7 = Kickabout.field_G;
        var4 = 0;
        L0: while (true) {
          if (((kf) this).field_Bb.length <= var4) {
            ((kf) this).field_Cb.a(true, ((kf) this).field_q, 0, param0, ((kf) this).field_mb + -param0);
            var8 = 0;
            var4 = var8;
            L1: while (true) {
              if (var8 >= ((kf) this).field_Ab.length) {
                L2: {
                  if (param2 == 10000) {
                    break L2;
                  } else {
                    ((kf) this).field_Ab = null;
                    break L2;
                  }
                }
                return;
              } else {
                ((kf) this).field_Ab[var8].a(true, ((kf) this).field_Cb.field_q - 2 * param1, param1, param1, ((kf) this).field_Cb.field_mb - param1 * 2);
                if (var8 != ((kf) this).field_Db) {
                  ((kf) this).field_Ab[var8].field_s = ((kf) this).field_Ab[var8].field_s + 10000;
                  var8++;
                  continue L1;
                } else {
                  var8++;
                  continue L1;
                }
              }
            }
          } else {
            var5 = var4 * ((kf) this).field_q / ((kf) this).field_Bb.length;
            var6 = ((kf) this).field_q * (1 + var4) / ((kf) this).field_Bb.length;
            ((kf) this).field_Bb[var4].field_s = var5;
            ((kf) this).field_Bb[var4].field_J = 0;
            ((kf) this).field_Bb[var4].field_q = var6 - var5;
            ((kf) this).field_Bb[var4].field_mb = param0;
            var4++;
            continue L0;
          }
        }
    }

    final void h(byte param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = Kickabout.field_G;
          if (param0 >= 36) {
            break L0;
          } else {
            this.a(44, -42, 25);
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          if (((kf) this).field_Bb.length <= var2) {
            return;
          } else {
            if (((kf) this).field_Db != var2) {
              if (-1 != (((kf) this).field_Bb[var2].field_sb ^ -1)) {
                ((kf) this).field_Bb[((kf) this).field_Db].field_I = false;
                ((kf) this).field_Ab[((kf) this).field_Db].field_s = ((kf) this).field_Ab[((kf) this).field_Db].field_s + 10000;
                ((kf) this).field_Db = var2;
                ((kf) this).field_Bb[var2].field_I = true;
                ((kf) this).field_Ab[var2].field_s = ((kf) this).field_Ab[var2].field_s - 10000;
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

    public static void c(boolean param0) {
        field_yb = null;
        field_zb = null;
        if (!param0) {
            kf.a(67, (byte) -66);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_yb = "Enter name of friend to delete from list";
        field_zb = "Your game";
    }
}
