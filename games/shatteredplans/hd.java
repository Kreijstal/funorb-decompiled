/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hd extends oh {
    bi field_o;
    int field_h;
    static oa field_s;
    bi field_i;
    static qr field_m;
    static byte[][] field_q;
    static String field_p;
    static String field_j;
    static ro field_r;
    static ul field_t;
    static uh field_n;
    static long field_k;
    static int[] field_l;

    final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var4 = 0;
        int var6 = 0;
        nd[] var7 = null;
        nd[] var8 = null;
        int var9 = 0;
        nd var10 = null;
        nd var11 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        gf.b();
        var2 = 300 - di.field_m;
        var1 = -25 + var2 / 8;
        db.field_a.b(var1, 0, 33023);
        var1 = var2 / 6 + -100;
        w.field_D.b(var1, 0, 4227327);
        oi.field_d.a(var1, 0, dp.field_r / 8);
        var7 = fe.field_y;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var7.length) {
            var1 = -250 + var2 / 4;
            vm.field_Jb.b(var1, 120, 8421631);
            tp.field_e.a(var1, param0, dp.field_r / 4);
            sr.field_F.a(var1, 120, dp.field_r);
            var8 = fe.field_H;
            var9 = 0;
            var4 = var9;
            L1: while (true) {
              if (var8.length <= var9) {
                return;
              } else {
                var11 = var8[var9];
                if (0 != var11.field_a) {
                  gf.b(var11.field_e - -var1 << 326178308, var11.field_j + 120 << 1160288580, var11.field_f, var11.field_a, fe.field_u);
                  var9++;
                  continue L1;
                } else {
                  var9++;
                  continue L1;
                }
              }
            }
          } else {
            var10 = var7[var4];
            if (var10.field_a != 0) {
              gf.b(var1 + var10.field_e << 1458270020, var10.field_j << -155380796, var10.field_f, var10.field_a, fe.field_u);
              var4++;
              continue L0;
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_p = null;
        field_j = null;
        field_r = null;
        field_m = null;
        field_q = null;
        field_l = null;
        if (param0 > -49) {
            field_r = null;
        }
        field_s = null;
        field_t = null;
        field_n = null;
    }

    hd(String param0, nq param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var4 = param1.c(param0);
          var5 = param1.field_J - -param1.field_q;
          if (500 >= var4) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var6 = stackIn_3_0;
          if (var6 == 0) {
            break L1;
          } else {
            var4 = 600;
            break L1;
          }
        }
        L2: {
          ((hd) this).field_i = new bi(var4, var5);
          ((hd) this).field_o = new bi(var4 - -6, 6 + var5);
          ra.a(-127);
          ((hd) this).field_i.e();
          if (var6 == 0) {
            param1.d(param0, 0, param1.field_J, 16777215, -1);
            break L2;
          } else {
            param1.b(param0, 0, param1.field_J, 16777215, -1, 600);
            break L2;
          }
        }
        ((hd) this).field_o.e();
        ((hd) this).field_i.c(3, 3);
        gf.b(1, 1, 0, 0, 6 + var4, var5 + 6);
        var7 = (var4 + 6) * (6 + var5) + -1;
        L3: while (true) {
          if (var7 < 0) {
            cg.i(0);
            ((hd) this).field_h = -param2;
          } else {
            if (0 == (128 & gf.field_h[var7])) {
              gf.field_h[var7] = gf.field_h[var7] << 1;
              var7--;
              continue L3;
            } else {
              var7--;
              continue L3;
            }
          }
        }
    }

    final static ld a(int param0, int param1) {
        if (param1 < 102) {
            field_k = -43L;
        }
        ld var2 = new ld();
        ua.field_d.a((byte) -113, (oh) (Object) var2);
        cp.a(param0, 1);
        return var2;
    }

    final static void c(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = ShatteredPlansClient.field_F ? 1 : 0;
        int var1 = ln.field_H.length;
        kb.field_A = 0;
        if (param0) {
            return;
        }
        cb.field_i = new int[var1];
        for (var2 = 0; var1 > var2; var2++) {
            var3 = aa.a(var2, (byte) -71);
            if (!(var2 == -1 + var1)) {
                var3 += 50;
            }
            cb.field_i[var2] = var3;
            kb.field_A = kb.field_A + var3;
        }
        kb.field_A = kb.field_A - 294;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Your friend list is full. Max of 100 for free users, and 200 for members.";
        field_j = "Click to build fleets in this territory.";
        field_s = new oa();
        field_r = new ro();
        field_l = new int[5];
    }
}
