/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bh extends ma {
    static kh field_o;
    private dj field_s;
    static int field_t;
    static boolean field_p;
    static boolean field_r;
    static String[] field_m;
    private dj field_n;
    static lj field_q;

    final rj a(byte param0, String param1) {
        String var3 = ((bh) this).field_s.field_v.toLowerCase();
        String var4 = param1.toLowerCase();
        if (!(var4.length() != 0)) {
            return lk.field_c;
        }
        if (!mh.a(var3, true, var4)) {
            return lk.field_c;
        }
        if (param0 != 24) {
            return null;
        }
        if (!(!this.a(param0 + -25, param1))) {
            return lk.field_c;
        }
        return tf.field_w;
    }

    public static void f(int param0) {
        field_q = null;
        if (param0 != 1) {
            field_p = true;
        }
        field_o = null;
        field_m = null;
    }

    final static void a(int param0, int param1, int param2, int param3, ka[] param4, int param5, int param6, ka[] param7, int param8, int param9, int param10, int param11, int param12, int param13, eg param14, int param15, int param16, int param17, ka[] param18, int param19, eg param20) {
        ee.a(param10, param19, new h(param18), param2, param3, param0, 0, param1, param13, param11, param12, param17, param14, param5, param20, param6, param9, new h(param4), param8, new h(param7), param15);
        int var21 = -19 / ((-15 - param16) / 38);
    }

    bh(dj param0, dj param1, dj param2) {
        super(param0);
        ((bh) this).field_n = param2;
        ((bh) this).field_s = param1;
    }

    private final boolean a(int param0, String param1) {
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        String var3 = ((bh) this).field_n.field_v.toLowerCase();
        String var4 = param1.toLowerCase();
        if ((var3.length() ^ -1) < param0) {
            if (var4.length() >= -1) {
                return false;
            }
            var5 = var3.lastIndexOf("@");
            if (-1 <= var5) {
                if (-1 + var3.length() > var5) {
                    var6 = var3.substring(0, var5);
                    var7 = var3.substring(1 + var5);
                    if (!(var4.indexOf(var6) < 0)) {
                        return true;
                    }
                    if (0 <= var4.indexOf(var7)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    final static void d(byte param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = TorChallenge.field_F ? 1 : 0;
          if (param0 < -123) {
            break L0;
          } else {
            bh.f(-13);
            break L0;
          }
        }
        var1 = 0;
        var2 = 0;
        var3 = 0;
        var4 = 0;
        var5 = 0;
        var6 = 0;
        var7 = 0;
        var10 = 0;
        L1: while (true) {
          L2: {
            if (var10 >= -1 + rd.field_p[rf.field_ib]) {
              break L2;
            } else {
              var6 = var1;
              var1 = var1 + fa.field_m[rf.field_ib][var10];
              var7 = var1;
              if (var1 <= nd.field_e) {
                var10++;
                continue L1;
              } else {
                wj.field_e = var10;
                break L2;
              }
            }
          }
          L3: {
            var5 = qk.field_nb[rf.field_ib][wj.field_e - -1][1];
            var9 = -var6 + var7;
            var3 = qk.field_nb[rf.field_ib][wj.field_e - -1][0];
            var4 = qk.field_nb[rf.field_ib][wj.field_e][1];
            var8 = nd.field_e + -var6;
            var2 = qk.field_nb[rf.field_ib][wj.field_e][0];
            if (var9 != 0) {
              cg.field_e[1] = (var4 << -1603526652) + ((var5 + -var4) * var8 << -294451644) / var9;
              cg.field_e[0] = (var2 << 641871780) - -(((-var2 + var3) * var8 << 1272992996) / var9);
              break L3;
            } else {
              cg.field_e[0] = var2 << -604190748;
              cg.field_e[1] = var4 << 932070180;
              break L3;
            }
          }
          return;
        }
    }

    final String a(String param0, byte param1) {
        String var6 = ((bh) this).field_s.field_v.toLowerCase();
        String var4 = param0.toLowerCase();
        if (var4.length() == 0) {
            return null;
        }
        String var5 = var4;
        if (!(!gi.a((byte) 89, var5))) {
            return oh.field_c;
        }
        if (!(!li.a((byte) -82, var5))) {
            return rd.field_j;
        }
        if (param1 != -24) {
            return null;
        }
        if (!(!qf.a(-8503, var5))) {
            return ah.field_c;
        }
        if (!(!this.a(-1, param0))) {
            return pd.field_a;
        }
        if (var6.length() > 0) {
            if (kc.a(var6, (byte) 59, var5)) {
                return wc.field_f;
            }
            if (bc.a((byte) -127, var5, var6)) {
                return k.field_k;
            }
            if (ja.a(var5, 94, var6)) {
                return wc.field_f;
            }
            return oh.field_c;
        }
        return ol.field_i;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = true;
        field_p = false;
    }
}
