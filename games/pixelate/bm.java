/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bm extends jj {
    static String field_r;
    static String field_t;
    static boolean field_o;
    static String field_n;
    private lp[] field_p;
    private int field_s;
    static String field_m;
    static boolean field_q;
    static tf field_u;

    private final void a(int param0, int param1) {
        param0 = (16711935 + -(param0 & 16711935) & 133695482) >> -261682461 | (65280 + -(65280 & param0) & 522245) >> 1861692835;
        int var3 = (16711680 & param0) >> -1038271376;
        int var4 = (param0 & 65280) >> -1902746200;
        if (!(0 != var4)) {
            var4 = 1;
        }
        if (var3 == param1) {
            var3 = 1;
        }
        int var5 = param0 & 255;
        if (0 == var5) {
            var5 = 1;
        }
        uj.field_Ob = -param0;
        int var6 = this.a(255 / var4, 255 / var3, 255 / var5, param1 + 3);
        od.field_Gb = var6 * uj.field_Ob + 16777215;
        pl.field_O = 3 * uj.field_Ob + 16777215;
    }

    final void a(boolean param0) {
        int var2 = 0;
        lp[] var3_ref_lp__ = null;
        int var3 = 0;
        int var4 = 0;
        lp var5 = null;
        int var6 = 0;
        var6 = Pixelate.field_H ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          if ((var2 ^ -1) <= -307201) {
            var3_ref_lp__ = ((bm) this).field_p;
            var4 = 0;
            L1: while (true) {
              if (var4 >= var3_ref_lp__.length) {
                var3 = 0;
                L2: while (true) {
                  if (var3 >= t.field_k.length) {
                    L3: {
                      if (!param0) {
                        break L3;
                      } else {
                        int discarded$1 = this.a(-32, -63, -42, -97);
                        break L3;
                      }
                    }
                    return;
                  } else {
                    if (pl.field_O < t.field_k[var3]) {
                      t.field_k[var3] = 16777215;
                      var3++;
                      continue L2;
                    } else {
                      if (od.field_Gb > t.field_k[var3]) {
                        t.field_k[var3] = od.field_Gb;
                        var3++;
                        continue L2;
                      } else {
                        var3++;
                        continue L2;
                      }
                    }
                  }
                }
              } else {
                var5 = var3_ref_lp__[var4];
                var5.a();
                var4++;
                continue L1;
              }
            }
          } else {
            var2++;
            t.field_k[var2] = 16777215;
            continue L0;
          }
        }
    }

    final static short[] a(short[] param0, byte param1, pc param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Pixelate.field_H ? 1 : 0;
        var4 = param2.c(param3, (byte) -34);
        if (0 != var4) {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (param0.length != var4) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            param0 = new short[var4];
            break L0;
          }
          if (param1 <= -127) {
            L2: {
              var5 = param2.c(4, (byte) -34);
              var6 = (short)param2.c(16, (byte) -34);
              if ((var5 ^ -1) >= -1) {
                var7 = 0;
                L3: while (true) {
                  if (var7 >= var4) {
                    break L2;
                  } else {
                    param0[var7] = (short)var6;
                    var7++;
                    continue L3;
                  }
                }
              } else {
                var7 = 0;
                L4: while (true) {
                  if (var7 >= var4) {
                    break L2;
                  } else {
                    param0[var7] = (short)(param2.c(var5, (byte) -34) + var6);
                    var7++;
                    continue L4;
                  }
                }
              }
            }
            return param0;
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    private final int a(int param0, int param1, int param2, int param3) {
        if (param1 < param0) {
            if (!(param1 >= param2)) {
                return param1;
            }
        }
        if (param3 != 3) {
            return 32;
        }
        return param0 < param2 ? param0 : param2;
    }

    public static void d(int param0) {
        field_u = null;
        field_r = null;
        if (param0 != 0) {
            field_t = null;
        }
        field_t = null;
        field_n = null;
        field_m = null;
    }

    bm(String param0, tf[] param1) {
        super(param0, param1);
        int var3 = 0;
        ((bm) this).field_s = 0;
        ((bm) this).field_p = new lp[500];
        for (var3 = 0; ((bm) this).field_p.length > var3; var3++) {
            ((bm) this).field_p[var3] = new lp();
        }
        this.a(((bm) this).field_s, 0);
    }

    final void c(int param0) {
        int var3 = 0;
        lp var4 = null;
        int var5 = Pixelate.field_H ? 1 : 0;
        super.c(param0);
        lp[] var6 = ((bm) this).field_p;
        lp[] var2 = var6;
        for (var3 = 0; var6.length > var3; var3++) {
            var4 = var6[var3];
            var4.b(-126);
        }
        ((bm) this).field_s = ((bm) this).field_s + 1;
        if (((bm) this).field_s + 1 >= am.field_i.length) {
            ((bm) this).field_s = 0;
        }
        this.a(am.field_i[((bm) this).field_s], 0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Please remove <%0> from your ignore list first.";
        field_t = "Set up new game";
        field_n = "Loading sound effects";
        field_m = "Show all game chat";
    }
}
