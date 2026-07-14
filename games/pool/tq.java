/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tq extends ma {
    static dd field_n;
    static byte[] field_u;
    static boolean field_p;
    boolean field_s;
    static int field_r;
    static String field_w;
    static String field_v;
    static int field_t;
    static vh field_m;
    static String field_x;
    static so field_o;
    int[] field_l;
    static int field_q;

    final static boolean c(byte param0) {
        if (!(rg.field_p)) {
            return false;
        }
        if (!(hn.field_b == 0)) {
            return false;
        }
        if (param0 != -75) {
            tq.a(75);
        }
        return true;
    }

    final static int[] a(int param0, int param1, boolean param2) {
        int var4 = 0;
        dd var5 = new dd(1024, 64);
        dd var3 = var5;
        if (param2) {
            tq.a(57);
        }
        for (var4 = 0; var3.field_D.length > var4; var4++) {
            var5.field_D[var4] = fb.field_b[var4];
        }
        var3.e();
        qh.c(0, 0, qh.field_l, qh.field_f, param0, param1);
        sh.field_P.b(15100);
        return var3.field_D;
    }

    public static void a(int param0) {
        field_n = null;
        field_w = null;
        field_m = null;
        field_v = null;
        field_x = null;
        if (param0 != 0) {
            int[] discarded$0 = tq.a(-16, 85, false);
        }
        field_o = null;
        field_u = null;
    }

    final static boolean a(boolean param0, long param1, String param2) {
        eo var4 = null;
        Object var5 = null;
        int stackIn_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          if (!param0) {
            break L0;
          } else {
            var5 = null;
            boolean discarded$2 = tq.a(true, -73L, (String) null);
            break L0;
          }
        }
        L1: {
          var4 = gf.a(62, param2);
          if (var4 == null) {
            break L1;
          } else {
            if (null == var4.field_Wb) {
              break L1;
            } else {
              return true;
            }
          }
        }
        L2: {
          L3: {
            if (null == em.field_L) {
              break L3;
            } else {
              if (fn.b(param1, 0) == null) {
                break L3;
              } else {
                stackOut_7_0 = 1;
                stackIn_9_0 = stackOut_7_0;
                break L2;
              }
            }
          }
          stackOut_8_0 = 0;
          stackIn_9_0 = stackOut_8_0;
          break L2;
        }
        return stackIn_9_0 != 0;
    }

    final static void a(long param0, byte param1, String param2) {
        hn.field_b = 2;
        fm.field_I = param2;
        if (param1 != -104) {
            field_v = null;
        }
        CharSequence var5 = (CharSequence) (Object) param2;
        di.field_a = hq.a(117, var5);
        c.field_d = param0;
        jq.a((byte) 11);
    }

    final static void d(byte param0) {
        if (null == ne.field_u) {
            return;
        }
        he.a((java.awt.Canvas) (Object) ne.field_u, 0);
        if (param0 > -100) {
            return;
        }
        ne.field_u.a(lg.field_s, -1);
        ne.field_u = null;
        if (!(null == fk.field_gb)) {
            fk.field_gb.d(22472);
        }
        pa.field_K.requestFocus();
    }

    final static int[] a(int param0, int param1, double[] param2) {
        int var4 = 0;
        int[] var5 = new int[param2.length];
        int[] var3 = var5;
        if (param1 != -20607) {
            field_x = null;
        }
        for (var4 = 0; var4 < var5.length; var4++) {
            var5[var4] = ud.a(param2[var4], param0, 1);
        }
        return var5;
    }

    tq() {
        ((tq) this).field_s = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = "Snookered";
        field_w = "Suggest muting this player";
        field_p = true;
        field_x = "Rated games are available to members only. To become a member, please visit the 'Account' section of the website.";
    }
}
