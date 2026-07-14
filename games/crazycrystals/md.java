/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class md extends ng {
    static int field_q;
    static sj field_u;
    private int field_l;
    static db field_p;
    static int[] field_k;
    static String[] field_t;
    private bm field_r;
    static long field_m;
    static String field_s;
    static String field_o;
    static String field_n;

    md(int param0) {
        super(param0);
    }

    final static boolean l(int param0) {
        if (param0 >= -59) {
            return false;
        }
        if (null == kf.field_h) {
            return false;
        }
        if (null == kf.field_h.j(0)) {
            return false;
        }
        return true;
    }

    final int d(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = CrazyCrystals.field_B;
        var3 = ((md) this).field_l >> 1717204771;
        if (param0 < -47) {
          var4 = -(7 & ((md) this).field_l) + 8;
          ((md) this).field_l = ((md) this).field_l + param1;
          var5 = 0;
          L0: while (true) {
            if (param1 <= var4) {
              L1: {
                if (param1 != var4) {
                  var5 = var5 + (((md) this).field_h[var3] >> -param1 + var4 & kd.field_j[param1]);
                  break L1;
                } else {
                  var5 = var5 + (((md) this).field_h[var3] & kd.field_j[var4]);
                  break L1;
                }
              }
              return var5;
            } else {
              var3++;
              var5 = var5 + ((((md) this).field_h[var3] & kd.field_j[var4]) << param1 - var4);
              param1 = param1 - var4;
              var4 = 8;
              continue L0;
            }
          }
        } else {
          ((md) this).k(-102);
          var4 = -(7 & ((md) this).field_l) + 8;
          ((md) this).field_l = ((md) this).field_l + param1;
          var5 = 0;
          L2: while (true) {
            if (param1 <= var4) {
              L3: {
                if (param1 != var4) {
                  var5 = var5 + (((md) this).field_h[var3] >> -param1 + var4 & kd.field_j[param1]);
                  break L3;
                } else {
                  var5 = var5 + (((md) this).field_h[var3] & kd.field_j[var4]);
                  break L3;
                }
              }
              return var5;
            } else {
              var3++;
              var5 = var5 + ((((md) this).field_h[var3] & kd.field_j[var4]) << param1 - var4);
              param1 = param1 - var4;
              var4 = 8;
              continue L2;
            }
          }
        }
    }

    final void d(int param0, int param1) {
        ((md) this).field_f = ((md) this).field_f + 1;
        ((md) this).field_h[((md) this).field_f] = (byte)(((md) this).field_r.a(false) + param1);
        if (param0 != 8) {
            field_q = -127;
        }
    }

    final void a(int[] param0, boolean param1) {
        ((md) this).field_r = new bm(param0);
        if (!param1) {
            ((md) this).d(42, 32);
        }
    }

    final static f[][] a(int param0, boolean param1, int param2, int param3, f[][] param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = CrazyCrystals.field_B;
        f[][] var9 = new f[param0 * 2 + param4.length][2 * param2 + param4[0].length];
        f[][] var5 = var9;
        for (var6 = 0; var9.length > var6; var6++) {
            for (var7 = 0; var9[0].length > var7; var7++) {
                if (var7 >= param2) {
                    // if_icmpge L120
                    // if_icmplt L120
                    // if_icmpge L120
                    var9[var6][var7] = (f) param4[-param0 + var6][-param2 + var7].clone();
                } else {
                    var9[var6][var7] = (f) param4[0][0].clone();
                }
                var9[var6][var7].a(393989, var6, var7, var9);
                var9[var6][var7].b(true, param1);
            }
        }
        var7 = 116 % ((param3 - 8) / 32);
        return var5;
    }

    final int e(boolean param0) {
        if (!param0) {
            int discarded$0 = ((md) this).e(false);
            ((md) this).field_f = ((md) this).field_f + 1;
            return 255 & ((md) this).field_h[((md) this).field_f] - ((md) this).field_r.a(!param0 ? true : false);
        }
        ((md) this).field_f = ((md) this).field_f + 1;
        return 255 & ((md) this).field_h[((md) this).field_f] - ((md) this).field_r.a(!param0 ? true : false);
    }

    final void b(int param0, int param1, int param2, byte[] param3) {
        int var5 = 0;
        int var6 = CrazyCrystals.field_B;
        if (param2 != 29712) {
            field_t = null;
            for (var5 = 0; var5 < param0; var5++) {
                ((md) this).field_f = ((md) this).field_f + 1;
                param3[var5 + param1] = (byte)(((md) this).field_h[((md) this).field_f] + -((md) this).field_r.a(false));
            }
            return;
        }
        for (var5 = 0; var5 < param0; var5++) {
            ((md) this).field_f = ((md) this).field_f + 1;
            param3[var5 + param1] = (byte)(((md) this).field_h[((md) this).field_f] + -((md) this).field_r.a(false));
        }
    }

    final void k(int param0) {
        if (param0 != -2321) {
            Object var3 = null;
            dk discarded$0 = md.a(6, -104, (db) null);
            ((md) this).field_f = (((md) this).field_l - -7) / 8;
            return;
        }
        ((md) this).field_f = (((md) this).field_l - -7) / 8;
    }

    public static void j(int param0) {
        field_o = null;
        if (param0 != 0) {
            return;
        }
        field_s = null;
        field_u = null;
        field_k = null;
        field_n = null;
        field_t = null;
        field_p = null;
    }

    md(byte[] param0) {
        super(param0);
    }

    final static dk a(int param0, int param1, db param2) {
        byte[] var4 = param2.d(-113, param0);
        byte[] var3 = var4;
        if (var4 == null) {
            return null;
        }
        if (param1 < 74) {
            f[][] discarded$0 = md.a(-108, true, 93, 119, (f[][]) null);
            return new dk(var4);
        }
        return new dk(var4);
    }

    final void f(byte param0) {
        int var2 = 121 % ((param0 - -48) / 50);
        ((md) this).field_l = 8 * ((md) this).field_f;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = new sj(11, 0, 1, 2);
        field_k = new int[3];
        field_t = new String[]{"Doable", "Insane", "Theoretically Possible", "Bonus Levels"};
        field_o = "Play the game without logging in just yet";
        field_n = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
    }
}
