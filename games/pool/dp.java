/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dp implements in {
    static String field_h;
    static int[] field_e;
    private dh[] field_f;
    static char[] field_d;
    static int field_l;
    static int[] field_k;
    private ko field_a;
    static vh field_c;
    private int field_j;
    private int field_b;
    private int field_g;
    private di field_i;

    public final int[] a(boolean param0, int param1, float param2) {
        dh var8 = null;
        dh var7 = ((dp) this).field_f[param1];
        dh var6 = var7;
        var6 = var7;
        if (!param0) {
            return null;
        }
        if (var7 == null) {
            return null;
        }
        if (!(null == var7.field_r)) {
            if (!(param2 != var7.field_p)) {
                ((dp) this).field_a.a((byte) -84, (ma) (Object) var7);
                return var7.field_r;
            }
            var7.a((byte) -117);
            var7.a();
            ((dp) this).field_j = ((dp) this).field_j + 1;
        }
        if (!(!var7.a(param2, ((dp) this).field_b, ((dp) this).field_i))) {
            if (0 == ((dp) this).field_j) {
                var8 = (dh) (Object) ((dp) this).field_a.b(-1);
                var8.a();
                ((dp) this).field_a.a((byte) -84, (ma) (Object) var7);
                return var7.field_r;
            }
            ((dp) this).field_j = ((dp) this).field_j - 1;
            ((dp) this).field_a.a((byte) -84, (ma) (Object) var7);
            return var7.field_r;
        }
        return null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        if (param3 > param2) {
            if (param1 <= param3) {
                if (param1 <= param2) {
                    ol.a(qh.field_d, param5, param4, param2, param7, param1, param3, param0, 19547);
                    if (param6 == 108) {
                        return;
                    }
                    int discarded$0 = dp.a(-1);
                    return;
                }
                ol.a(qh.field_d, param5, param7, param1, param4, param2, param3, param0, 19547);
                if (param6 == 108) {
                    return;
                }
                int discarded$1 = dp.a(-1);
                return;
            }
            ol.a(qh.field_d, param5, param7, param3, param0, param2, param1, param4, 19547);
            if (param6 != 108) {
                int discarded$2 = dp.a(-1);
                return;
            }
            return;
        }
        if (param1 > param2) {
            ol.a(qh.field_d, param5, param0, param2, param7, param3, param1, param4, param6 + 19439);
            if (param6 != 108) {
                int discarded$3 = dp.a(-1);
                return;
            }
            return;
        }
        if (param1 <= param3) {
            ol.a(qh.field_d, param5, param4, param3, param0, param1, param2, param7, 19547);
            if (param6 != 108) {
                int discarded$4 = dp.a(-1);
                return;
            }
            return;
        }
        ol.a(qh.field_d, param5, param0, param1, param4, param3, param2, param7, param6 + 19439);
        if (param6 != 108) {
            int discarded$5 = dp.a(-1);
            return;
        }
    }

    final static int a(int param0) {
        if (param0 != 104) {
            Object var2 = null;
            dp.a(70, (kh) null);
            if (oa.field_j) {
                return -1;
            }
            if (hh.field_a < se.field_l) {
                return -1;
            }
            if (!(oe.field_Q + se.field_l <= hh.field_a)) {
                return ac.field_m;
            }
            return -1;
        }
        if (oa.field_j) {
            return -1;
        }
        if (hh.field_a < se.field_l) {
            return -1;
        }
        if (oe.field_Q + se.field_l <= hh.field_a) {
            return -1;
        }
        return ac.field_m;
    }

    public final int a(int param0, byte param1) {
        if (param1 != -91) {
            field_c = null;
            if (!((dp) this).field_f[param0].field_n) {
                return 1;
            }
            return 0;
        }
        if (!((dp) this).field_f[param0].field_n) {
            return 1;
        }
        return 0;
    }

    public final int b(int param0, int param1) {
        if (param0 < 44) {
            return -97;
        }
        if (((dp) this).field_f[param1] == null) {
            return 0;
        }
        return ((dp) this).field_f[param1].field_o;
    }

    final static void a(int param0, kh param1) {
        kh var2 = null;
        param1.a((byte) -117);
        var2 = (kh) (Object) ep.field_A.c((byte) -72);
        L0: while (true) {
          if (var2 != null) {
            if (var2.a(param1, false)) {
              var2 = (kh) (Object) ep.field_A.f((byte) -5);
              continue L0;
            } else {
              L1: {
                if (var2 != null) {
                  vj.a((ma) (Object) param1, (byte) -119, (ma) (Object) var2);
                  break L1;
                } else {
                  ep.field_A.b((byte) -108, (ma) (Object) param1);
                  break L1;
                }
              }
              if (param0 <= -73) {
                return;
              } else {
                field_c = null;
                return;
              }
            }
          } else {
            L2: {
              if (var2 != null) {
                vj.a((ma) (Object) param1, (byte) -119, (ma) (Object) var2);
                break L2;
              } else {
                ep.field_A.b((byte) -108, (ma) (Object) param1);
                break L2;
              }
            }
            if (param0 <= -73) {
              return;
            } else {
              field_c = null;
              return;
            }
          }
        }
    }

    final static void a(vh param0, vh param1, int param2) {
        param1.field_qb = param0.field_gb + -param1.field_gb >> 1928643937;
        if (param2 > -10) {
            return;
        }
        param1.field_eb = param0.field_Db + (-param1.field_Db + -10);
    }

    public final boolean a(int param0, int param1) {
        if (param1 != 55) {
            return true;
        }
        return 64 == ((dp) this).field_b ? true : false;
    }

    public final boolean a(byte param0, int param1) {
        if (param0 <= 97) {
            dp.a(72, -96, -108, 104, -44, -64, -2, -66);
            return true;
        }
        return true;
    }

    final static int b(int param0) {
        nk.field_m.b((byte) -46);
        int var1 = 55 / ((25 - param0) / 40);
        if (!sq.field_c.d(-2147483648)) {
            return ug.g(-27108);
        }
        return 0;
    }

    final static int a(int param0, int param1, int param2) {
        if (param2 < 12) {
            int discarded$0 = dp.b(26);
            of.a(param1, (byte) 0, param0);
            return (tp.field_h[0] << -1812803575) / tp.field_h[2] + 320;
        }
        of.a(param1, (byte) 0, param0);
        return (tp.field_h[0] << -1812803575) / tp.field_h[2] + 320;
    }

    public static void c(int param0) {
        field_h = null;
        field_d = null;
        field_e = null;
        field_k = null;
        field_c = null;
        if (param0 != 3729) {
            field_e = null;
        }
    }

    dp(di param0, di param1, int param2, int param3) {
        int var7 = 0;
        ge var8 = null;
        ((dp) this).field_a = new ko();
        ((dp) this).field_b = 128;
        ((dp) this).field_j = 0;
        ((dp) this).field_i = param1;
        ((dp) this).field_g = param2;
        ((dp) this).field_j = ((dp) this).field_g;
        ((dp) this).field_b = param3;
        int[] var12 = param0.a(0, 0);
        int[] var11 = var12;
        int[] var10 = var11;
        int[] var5 = var10;
        int var6 = var12.length;
        ((dp) this).field_f = new dh[param0.a(false, 0)];
        for (var7 = 0; var7 < var6; var7++) {
            var8 = new ge(param0.a(86, var12[var7], 0));
            ((dp) this).field_f[var12[var7]] = new dh(var8);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
        field_h = "Day";
        field_k = new int[]{0, 1, 3, 9, 10, 8, 7, 5, 15, 2, 12, 14, 4, 13, 11, 6};
    }
}
