/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jb extends RuntimeException {
    Throwable field_e;
    static vg[] field_g;
    static tb field_j;
    static int field_d;
    static w field_f;
    String field_i;
    static String field_h;
    static boolean field_a;
    static byte[] field_b;
    static int field_c;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, String param7, int param8) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        L0: {
          k.field_a.field_Y = param7;
          if (2 != pk.field_r) {
            bf.field_v.field_Y = km.field_B;
            break L0;
          } else {
            bf.field_v.field_Y = of.field_b;
            break L0;
          }
        }
        var9 = 495;
        var11 = -66 % ((14 - param2) / 34);
        var10 = 5;
        hm.field_b.a(var9 + -10, 0, var10, param6, 5);
        wj.field_Mb.a(hm.field_b.field_mb - field_f.field_mb, 0, 0, param6, 0);
        var10 = var10 + (param6 + param8);
        field_f.a(field_f.field_mb, 0, 0, param6, wj.field_Mb.field_mb);
        ve.field_vc.a(ve.field_vc.a(true), 0, var10, param5, 5);
        var12 = bf.field_v.a(true);
        bf.field_v.a(var12, 0, var10, param5, -5 + (var9 - var12));
        k.field_a.a(var9, 0, 0, param0, 0);
        var13 = 5 + (param5 + var10);
        ib.field_mb.a(var9, 0, param0, var13, 0);
        ib.field_mb.field_lb = ea.a(2105376, -20982, 3, ib.field_mb.field_N, 8421504, 11579568);
        var13 = var13 + param0;
        tf.field_gb.a(var9, 0, -(var13 / 2) + param1, var13, -(var9 / 2) + param4);
    }

    final static void a(String param0, byte param1) {
        if (param1 != 45) {
            jb.a((byte) 96);
        }
    }

    final static void a(byte param0, String param1) {
        ve.field_Qb = true;
        f.field_n.field_Y = param1;
        int var2 = le.field_m.field_g;
        int var4 = 66 / ((param0 - 29) / 46);
        int var3 = le.field_m.field_i;
        int var5 = f.field_n.field_J.b(param1, 272, f.field_n.field_Db);
        int var6 = 7 + var3 / 2 + (-110 - var5 / 2);
        tc.field_Ob.a(320, 0, var6, -(var6 * 2) + -120 + var3, (var2 + -320) / 2);
        tc.field_Ob.field_lb = ea.a(2105376, -20982, 3, tc.field_Ob.field_N, 8421504, 11579568);
        f.field_n.a(tc.field_Ob.field_mb - 24 + -24, 0, 16, tc.field_Ob.field_N - 20 - 24, 24);
        ce.field_A.a(80, 0, -44 + tc.field_Ob.field_N, 24, 120);
    }

    final static char a(byte param0, byte param1) {
        int var3 = 0;
        int var2 = param0 & 255;
        if (!(0 != var2)) {
            throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
        if ((var2 ^ -1) <= -129) {
            if (!(160 <= var2)) {
                var3 = nh.field_l[var2 - 128];
                if (!(var3 != 0)) {
                    var3 = 63;
                }
                var2 = var3;
            }
        }
        var3 = -109 / ((param1 - 41) / 35);
        return (char)var2;
    }

    final static ij a(java.applet.Applet param0, int param1) {
        int var4 = 0;
        ij var5 = null;
        int var6 = client.field_A ? 1 : 0;
        String var2 = wd.a(param0, (byte) -1, "jagex-last-login-method");
        if (var2 == null) {
            return hn.field_c;
        }
        ij[] var3 = oc.a((byte) 27);
        if (param1 != -10314) {
            field_d = -54;
        }
        for (var4 = 0; var4 < var3.length; var4++) {
            var5 = var3[var4];
            if (!(!var5.a(var2, -39))) {
                return var5;
            }
        }
        return hn.field_c;
    }

    public static void a(byte param0) {
        field_h = null;
        field_g = null;
        field_j = null;
        if (param0 != -9) {
            field_a = false;
        }
        field_f = null;
        field_b = null;
    }

    final static void a(w param0, w param1, w param2, int param3, w param4) {
        String var5 = null;
        int var6 = 0;
        Object var7 = null;
        var6 = client.field_A ? 1 : 0;
        if (null != kf.field_Q) {
          return;
        } else {
          L0: {
            jg.field_i = false;
            if (wc.field_n) {
              var5 = vg.field_s;
              break L0;
            } else {
              if (wl.field_p) {
                var5 = ln.field_e;
                break L0;
              } else {
                var5 = df.field_S;
                break L0;
              }
            }
          }
          L1: {
            var7 = null;
            cl.a((String) null, 0, ij.field_c, var5, -24503);
            wj.field_Mb.field_rb = ((fj.field_g.field_rb & 16711422) >> 1584730369) + -(8355711 & ij.field_c >> 22503841) + ij.field_c;
            wj.field_Mb.field_fb = ij.field_c + (-(8355711 & ij.field_c >> -1451362751) + ((16711423 & fj.field_g.field_fb) >> 1099046881));
            kf.field_Q = wj.field_Mb;
            wj.field_Mb.field_Bb = ij.field_c - (((ij.field_c & 16711423) >> 729335969) - (8355711 & fj.field_g.field_Bb >> -1665413055));
            jf.field_e = field_f;
            tf.field_gb = new w(0L, param4);
            k.field_a = new w(0L, param0);
            ib.field_mb = new w(0L, (w) null);
            hm.field_b = new w(0L, param2);
            wj.field_Mb = new w(0L, param1);
            wj.field_Mb.field_J = ff.field_o;
            hm.field_b.a(wj.field_Mb, -16834);
            field_f = new w(0L, jf.field_e);
            hm.field_b.a(field_f, -16834);
            ve.field_vc = new w(0L, fj.field_g, pg.field_g);
            bf.field_v = new w(0L, fj.field_g);
            tf.field_gb.a(k.field_a, -16834);
            if (param3 < -32) {
              break L1;
            } else {
              field_j = null;
              break L1;
            }
          }
          tf.field_gb.a(ib.field_mb, -16834);
          ib.field_mb.a(hm.field_b, -16834);
          ib.field_mb.a(ve.field_vc, -16834);
          ib.field_mb.a(bf.field_v, -16834);
          return;
        }
    }

    jb(Throwable param0, String param1) {
        ((jb) this).field_e = param0;
        ((jb) this).field_i = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 500;
        field_j = new tb();
        field_h = "Previous";
        field_b = new byte[520];
    }
}
