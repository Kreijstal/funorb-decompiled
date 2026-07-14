/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jd {
    static int[] field_o;
    ch field_d;
    static String[] field_g;
    int field_f;
    ch field_l;
    int field_c;
    ch field_i;
    static long field_n;
    ch field_h;
    private int field_m;
    fa field_a;
    int field_e;
    private boolean field_s;
    int field_j;
    int field_k;
    static sf field_q;
    int field_r;
    static int field_t;
    int field_b;
    ch field_p;

    final static int a(boolean param0, int param1) {
        if (param0) {
            field_o = null;
        }
        return bl.field_g[param1 & 2047];
    }

    final void a(int param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        gb.g(param6, param5, param1, param4, param3, param0);
        if (param2) {
            Object var9 = null;
            this.a((byte) 19, -104, (String) null, -15);
        }
    }

    private final void a(byte param0, int param1, String param2, int param3) {
        int var5 = ((jd) this).field_a.b(param2);
        int var6 = ((jd) this).field_a.field_y + ((jd) this).field_a.field_K;
        if (param0 <= 116) {
            int discarded$0 = jd.a(true, 96);
        }
        int var7 = param1;
        if (!(gb.field_d >= var5 + var7 + 6)) {
            var7 = gb.field_d - var5 - 6;
        }
        int var8 = 32 + param3 + -((jd) this).field_a.field_y;
        if (gb.field_k < 6 + var6 + var8) {
            var8 = -6 + gb.field_k - var6;
        }
        gb.b(var7, var8, var5 - -6, var6 - -6, ((jd) this).field_m);
        gb.e(1 + var7, 1 + var8, 4 + var5, var6 + 4, ((jd) this).field_f);
        ((jd) this).field_a.c(param2, 3 + var7, ((jd) this).field_a.field_y + (3 + var8), ((jd) this).field_m, -1);
    }

    final void a(int param0, int param1, String param2, int param3) {
        if (param0 != 13421772) {
            return;
        }
        if (!((jd) this).field_s) {
            this.a((byte) 120, param1, param2, param3);
        } else {
            this.a(true, param1, param2, param3);
        }
    }

    private final void a(boolean param0, int param1, String param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        L0: {
          var15 = fleas.field_A ? 1 : 0;
          var5 = ((jd) this).field_r + ((jd) this).field_c;
          var6 = ((jd) this).field_e + ((jd) this).field_j;
          var7 = ((jd) this).field_k;
          if ((var7 ^ -1) != 0) {
            break L0;
          } else {
            var7 = ((jd) this).field_a.field_H - -((jd) this).field_a.field_K;
            break L0;
          }
        }
        L1: {
          L2: {
            var8 = gb.field_d >> -1474128318;
            var9 = ((jd) this).field_a.b(param2);
            var10 = ((jd) this).field_a.field_K + ((jd) this).field_a.field_H;
            var11 = 1;
            if (var8 < var9) {
              break L2;
            } else {
              if (-1 == param2.indexOf("<br>")) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          L3: {
            if (var8 >= var9) {
              var12 = var8;
              break L3;
            } else {
              var13 = var9 / var8;
              var12 = var8 + 2 * ((var13 + var9 % var8 - 1) / var13);
              break L3;
            }
          }
          L4: {
            if (null != pc.field_f) {
              break L4;
            } else {
              pc.field_f = new String[16];
              break L4;
            }
          }
          var11 = ((jd) this).field_a.a(param2, new int[1], pc.field_f);
          var9 = 0;
          var10 = var10 + (var11 - 1) * var7;
          var13 = 0;
          L5: while (true) {
            if (var11 <= var13) {
              break L1;
            } else {
              var14 = ((jd) this).field_a.b(pc.field_f[var13]);
              if (var9 < var14) {
                var9 = var14;
                var13++;
                continue L5;
              } else {
                var13++;
                continue L5;
              }
            }
          }
        }
        L6: {
          var12 = param1;
          if (var5 + (var12 + var9) > gb.field_d) {
            var12 = -var5 + gb.field_d - var9;
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          var13 = 32 + -((jd) this).field_a.field_y + param3;
          if (gb.field_k < var6 + (var13 - -var10)) {
            var13 = param3 + (-var10 - var6);
            break L7;
          } else {
            break L7;
          }
        }
        L8: {
          gb.b(var12, var13, var9 - -var5, var10 + var6, ((jd) this).field_b);
          gb.e(1 + var12, var13 - -1, -2 + var9 - -var5, var10 - -var6 + -2, ((jd) this).field_f);
          int discarded$1 = ((jd) this).field_a.a(param2, var12 - -((jd) this).field_c, ((jd) this).field_e + var13, var9, var10, ((jd) this).field_m, -1, 0, 0, var7);
          if (param0) {
            break L8;
          } else {
            ((jd) this).field_i = null;
            break L8;
          }
        }
    }

    public static void a(byte param0) {
        field_q = null;
        field_g = null;
        field_o = null;
        if (param0 <= 25) {
            int discarded$0 = jd.a(true, 122);
        }
    }

    final void a(fa param0, boolean param1) {
        int var7_int = 0;
        int var15 = fleas.field_A ? 1 : 0;
        e var17 = new e(param0, 2, 2, 2236962, 1, 1, 1, param0.field_K + param0.field_H + 2);
        var17.field_f = 16777215;
        ((jd) this).field_i = (ch) (Object) var17;
        hb var4 = new hb();
        var17.a(2, (e) (Object) var4);
        ((jd) this).field_r = 3;
        ((jd) this).field_k = -1;
        ((jd) this).field_c = 3;
        ((jd) this).field_j = 3;
        ((jd) this).field_f = 5592405;
        var4.field_p = 11711154;
        ((jd) this).field_a = param0;
        ((jd) this).field_e = 3;
        ((jd) this).field_b = 15658734;
        var4.field_c = 15658734;
        ((jd) this).field_m = 15658734;
        te discarded$0 = var4.a(0, -17562).a(15658734, (byte) -75).a(true, lh.a(7829367, 8947848, (byte) -90, 10066329));
        te discarded$1 = var4.a(1, -17562).a(true, lh.a(13421772, 11184810, (byte) 66, 10066329));
        te discarded$2 = var4.a(3, -17562).a(param1, lh.a(10066329, 8947848, (byte) -99, 7829367)).a(param1, 1).c(124, 1);
        dd[] var5 = new dd[9];
        sj var16 = new sj(32, 32);
        sj var18 = var16;
        for (var7_int = 0; var7_int < var18.field_B.length; var7_int++) {
            var16.field_B[var7_int] = 1077952576;
        }
        var5[4] = (dd) (Object) var18;
        te discarded$3 = var4.a(4, -17562).a(true, (byte) -121).a(true, var5);
        te discarded$4 = var4.a(5, -17562).a(true, ta.a(0, 65793, -2843, 0, 0)).a(true, (byte) -107).a(-1, (byte) -75);
        ((jd) this).field_p = (ch) (Object) var4;
        hb var6 = new hb(var4, true);
        var6.field_i = 0;
        hb var7 = new hb(var4, true);
        var7.field_i = 0;
        var7.a((byte) 61, bf.a(2885, 8947848));
        te discarded$5 = var7.a(1, -17562).a(true, bf.a(2885, 11184810)).a(2236962, (byte) -75);
        ((jd) this).field_d = (ch) (Object) new lb(param0, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924);
        ee discarded$6 = new ee(param0, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
        ib discarded$7 = new ib(param0, 16777215, -1, 125269879, 4473924, 3, 268435455);
        hb var8 = new hb();
        var17.a(2, (e) (Object) var8);
        te discarded$8 = var8.a(0, -17562).a(param1, lh.a(10066329, 15658734, (byte) -107, 7829367)).a(1118481, (byte) -75).a(-1, 127);
        te discarded$9 = var8.a(4, -17562).a(true, (byte) -115).a(true, var5);
        ((jd) this).field_l = (ch) (Object) var8;
        dd[] var9 = new dd[9];
        dd[] var10 = new dd[9];
        var9[4] = new dd(2, 1);
        var10[4] = new dd(1, 2);
        var9[4].field_B = new int[]{6710886, 7829367};
        var10[4].field_B = new int[]{6710886, 7829367};
        hb var11 = new hb();
        hb var12 = new hb();
        var11.a(var9, -44, 0);
        var12.a(var10, -82, 0);
        dd var13 = new dd(7, 4);
        var13.field_B = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
        hb var14 = new hb(var4, param1);
        var14.a(var13.c(), 0);
        var13.e();
        var14 = new hb(var4, true);
        var14.a(var13.c(), 0);
        var13.e();
        var14 = new hb(var4, true);
        var14.a(var13.c(), 0);
        var13.e();
        hb var19 = new hb(var4, true);
        var19.a(var13, 0);
    }

    final static void a(boolean param0, int param1, byte param2, wk param3, int param4) {
        hh.field_b.a(param3, 1000000, -524289, !param0 ? true : false, param1, param4);
        int var5 = -72 % ((param2 - 58) / 33);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        if (param0 != 4) {
            field_g = null;
        }
        gb.d(param5, param2, param1, param3, param4);
    }

    final static mk a(String param0, int param1) {
        Object var3 = null;
        if (ui.field_kb != wi.field_f) {
          L0: {
            if (param1 == 8947848) {
              break L0;
            } else {
              var3 = null;
              mk discarded$2 = jd.a((String) null, -64);
              break L0;
            }
          }
          L1: {
            if (ui.field_kb != ui.field_ob) {
              break L1;
            } else {
              if (param0.equals((Object) (Object) li.field_d)) {
                ui.field_kb = ql.field_l;
                return kh.field_a;
              } else {
                break L1;
              }
            }
          }
          ui.field_kb = wi.field_f;
          li.field_d = param0;
          kh.field_a = null;
          return null;
        } else {
          return null;
        }
    }

    public jd() {
        ((jd) this).field_s = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new String[]{"Many more levels", "Extra achievements", "Fullscreen Mode", "No adverts"};
        field_o = new int[40];
    }
}
