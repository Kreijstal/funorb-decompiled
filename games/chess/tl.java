/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tl extends ci {
    static di field_Fb;
    static nl field_Gb;
    private ci field_Jb;
    static String field_Eb;
    static String field_Ib;
    ci field_Hb;

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var4 = -param1;
          var5 = -param1;
          if (null != ((tl) this).field_Jb) {
            var4 = ((tl) this).field_Jb.e((byte) -57);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (null != ((tl) this).field_Hb) {
            var5 = ((tl) this).field_Hb.a(-param2 + -var4 + (((tl) this).field_M + -param2) + -param1, -84);
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var6 = param2 + (var5 + param2 - -var4) + param1;
          if (var6 > ((tl) this).field_M) {
            var5 = var5 + (((tl) this).field_M - var6);
            var6 = ((tl) this).field_M;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (param0 < -122) {
            break L3;
          } else {
            boolean discarded$1 = tl.a(-96, 21, -127, -74);
            break L3;
          }
        }
        L4: {
          if (((tl) this).field_fb != 1) {
            break L4;
          } else {
            param2 = param2 + (((tl) this).field_M - var6) / 2;
            break L4;
          }
        }
        L5: {
          if ((((tl) this).field_fb ^ -1) != -3) {
            break L5;
          } else {
            param2 = param2 + (-var6 + ((tl) this).field_M);
            break L5;
          }
        }
        L6: {
          if (((tl) this).field_Jb == null) {
            break L6;
          } else {
            ((tl) this).field_Jb.a(param2, var4, -2147483648, ((tl) this).field_pb, 0);
            ((tl) this).field_Jb.field_cb = ((tl) this).field_cb;
            break L6;
          }
        }
        L7: {
          if (null != ((tl) this).field_Hb) {
            L8: {
              ((tl) this).field_Hb.a(param2 - (-var4 - param1), var5, -2147483648, ((tl) this).field_pb, 0);
              if (((tl) this).field_Jb != null) {
                ((tl) this).field_Hb.field_fb = 0;
                break L8;
              } else {
                ((tl) this).field_Hb.field_fb = ((tl) this).field_fb;
                break L8;
              }
            }
            ((tl) this).field_Hb.field_cb = ((tl) this).field_cb;
            break L7;
          } else {
            break L7;
          }
        }
    }

    final static void a(byte param0, km param1) {
        r.k(param0 ^ -2968);
        if (param0 != -67) {
            Object var3 = null;
            tl.a((ac) null, -55, (byte) 64);
        }
        wb.a(param1.field_x, param1.field_v, param1.field_u);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        ((tl) this).a(param3, param0, param5 ^ 2147483626, param2, param4);
        this.a(param5 ^ 107, param1, param6);
        if (param5 != -22) {
            boolean discarded$0 = tl.a(-18, 42, 89, 18);
        }
    }

    final static void a(boolean param0) {
        int var1 = 0;
        double var2 = 0.0;
        int var4 = Chess.field_G;
        nh.a();
        pd.field_Tb = 11;
        gf.field_b = new int[260];
        for (var1 = 0; (var1 ^ -1) > -257; var1++) {
            var2 = 15.0;
            gf.field_b[var1] = (int)(255.0 * Math.pow((double)((float)var1 / 256.0f), var2));
        }
        int var5 = 256;
        var1 = var5;
        while (var5 < gf.field_b.length) {
            gf.field_b[var5] = 255;
            var5++;
        }
        if (param0) {
            field_Fb = null;
        }
    }

    public static void f(byte param0) {
        field_Ib = null;
        field_Gb = null;
        field_Fb = null;
        field_Eb = null;
        if (param0 > -101) {
            field_Gb = null;
        }
    }

    final static void a(ac param0, int param1, byte param2) {
        vn.field_vb.a((o) (Object) param0, (byte) 119);
        fa.a(param0, param2 ^ 14994, param1);
        if (param2 != 117) {
            field_Gb = null;
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3) {
        if (pi.field_d != null) {
            if (!(!pi.field_d.b(4))) {
                fi.a(-393711775);
                return true;
            }
        }
        if (pj.field_h != null) {
            if (pj.field_h.f((byte) 95)) {
                pj.field_h = null;
                fi.a(-393711775);
                return true;
            }
        }
        if (af.b((byte) 125)) {
            return true;
        }
        if (!(!fn.a(param0, 23012, param1, param3))) {
            return true;
        }
        if (param2 <= 74) {
            field_Ib = null;
            return false;
        }
        return false;
    }

    final int a(int param0, int param1, boolean param2) {
        int var4 = -param0;
        if (!(((tl) this).field_Jb == null)) {
            var4 = ((tl) this).field_Jb.e((byte) 120);
        }
        int var5 = -param0;
        if (!param2) {
            field_Ib = null;
        }
        if (null != ((tl) this).field_Hb) {
            var5 = ((tl) this).field_Hb.e((byte) 73);
        }
        return param1 + (var4 - (-param0 - (var5 + param1)));
    }

    final static void k(int param0) {
        if (param0 != 31553) {
            boolean discarded$0 = tl.a(-57, -23, 14, -33);
        }
        if (hd.field_l.g(-18110) != null) {
            fb.field_K = fb.field_K + 1;
            if (!((fb.field_K + 1 ^ -1) != -336)) {
                fb.field_K = 0;
                o discarded$1 = hd.field_l.f(1184188328);
            }
        }
    }

    tl(long param0, ci param1, ci param2, ci param3, km param4, String param5) {
        super(param0, param1);
        if (param4 != null) {
            ((tl) this).field_Jb = new ci(0L, param2);
            ((tl) this).field_Jb.field_jb = param4;
            ((tl) this).a((byte) 125, ((tl) this).field_Jb);
        }
        if (param5 != null) {
            ((tl) this).field_Hb = new ci(0L, param3, param5);
            ((tl) this).a((byte) 123, ((tl) this).field_Hb);
        }
        ((tl) this).h(0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Ib = "<%0> is not on your ignore list.";
        field_Eb = "<%0> must play <%1> more rated games before playing with the current options.";
    }
}
