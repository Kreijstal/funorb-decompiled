/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wk {
    static String field_j;
    static c field_i;
    int field_o;
    kg field_r;
    static int field_u;
    int field_g;
    kg field_x;
    private int field_h;
    int field_f;
    static String field_l;
    int field_d;
    kg field_t;
    int field_v;
    jb field_k;
    int field_p;
    kg field_e;
    static float field_s;
    private boolean field_m;
    kg field_n;
    static volatile long field_w;
    static int[] field_b;
    int field_q;
    static String field_a;
    static volatile int field_c;

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        ra.d(param1, param3, param5, param0, param4);
        if (param2 > -62) {
            Object var8 = null;
            this.a(16, (String) null, -52, 95);
        }
    }

    private final void a(int param0, int param1, int param2, String param3) {
        int var5 = ((wk) this).field_k.b(param3);
        int var6 = ((wk) this).field_k.field_u + ((wk) this).field_k.field_K;
        int var7 = param2;
        if (var5 + var7 + 6 > ra.field_f) {
            var7 = -6 + ra.field_f - var5;
        }
        int var8 = param0 + -((wk) this).field_k.field_u + param1;
        if (!(var6 + (var8 - -6) <= ra.field_e)) {
            var8 = -6 + (ra.field_e + -var6);
        }
        ra.b(var7, var8, 6 + var5, 6 + var6, ((wk) this).field_h);
        ra.c(var7 + 1, var8 - -1, 4 + var5, var6 + 4, ((wk) this).field_g);
        ((wk) this).field_k.b(param3, var7 - -3, var8 + 3 - -((wk) this).field_k.field_u, ((wk) this).field_h, -1);
    }

    public static void a(int param0) {
        if (param0 != 1) {
            int discarded$0 = wk.a(-113, true, -82, -66);
        }
        field_b = null;
        field_i = null;
        field_l = null;
        field_j = null;
        field_a = null;
    }

    final static void a(int param0, boolean param1, byte param2) {
        pf var5 = null;
        String var6_ref = null;
        int var6 = 0;
        int var7 = 0;
        ud var3 = ae.a(param1, param0, -13047);
        int var4 = -99 / ((param2 - 58) / 54);
        if (var3 != null) {
            hd.field_s.a(19, false);
            var5 = hd.field_s;
            var6_ref = re.field_S;
            var5.field_j.a(var6_ref, 1, 5);
            var5 = hd.field_s;
            var6 = ci.field_B;
            var7 = li.field_o;
            var5.field_j.a(0, var7, -18, 0, var6);
        }
        ko.a(param0, param1, (byte) -64);
    }

    final static int a(int param0, boolean param1, int param2, int param3) {
        if (param0 != 15658734) {
            return 0;
        }
        return bh.h((byte) -47);
    }

    private final void a(int param0, String param1, int param2, int param3) {
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
          var15 = TetraLink.field_J;
          var5 = ((wk) this).field_q + ((wk) this).field_v;
          var6 = ((wk) this).field_o + ((wk) this).field_f;
          var7 = ((wk) this).field_p;
          if (var7 != -1) {
            break L0;
          } else {
            var7 = ((wk) this).field_k.field_N - -((wk) this).field_k.field_K;
            break L0;
          }
        }
        L1: {
          L2: {
            var8 = ra.field_f >> -1679435038;
            var9 = ((wk) this).field_k.b(param1);
            var10 = ((wk) this).field_k.field_N + ((wk) this).field_k.field_K;
            var11 = 1;
            if (var9 > var8) {
              break L2;
            } else {
              if (0 != (param1.indexOf("<br>") ^ -1)) {
                break L2;
              } else {
                break L1;
              }
            }
          }
          L3: {
            if (db.field_g != null) {
              break L3;
            } else {
              db.field_g = new String[16];
              break L3;
            }
          }
          L4: {
            if (var9 <= var8) {
              var12 = var8;
              break L4;
            } else {
              var13 = var9 / var8;
              var12 = 2 * ((-1 + (var9 % var8 - -var13)) / var13) + var8;
              break L4;
            }
          }
          var11 = ((wk) this).field_k.a(param1, new int[1], db.field_g);
          var9 = 0;
          var10 = var10 + var7 * (-1 + var11);
          var13 = 0;
          L5: while (true) {
            if (var13 >= var11) {
              break L1;
            } else {
              var14 = ((wk) this).field_k.b(db.field_g[var13]);
              if (var14 > var9) {
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
          var12 = param3;
          if (ra.field_f < var5 + var9 + var12) {
            var12 = -var9 + ra.field_f + -var5;
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          var13 = 32 + -((wk) this).field_k.field_u + param2;
          if (ra.field_e < var13 - -var10 - -var6) {
            var13 = -var6 + param2 - var10;
            break L7;
          } else {
            break L7;
          }
        }
        ra.b(var12, var13, var5 + var9, var6 + var10, ((wk) this).field_d);
        ra.c(1 + var12, var13 + 1, var5 + (var9 - param0), -2 + (var10 - -var6), ((wk) this).field_g);
        int discarded$1 = ((wk) this).field_k.a(param1, ((wk) this).field_v + var12, var13 + ((wk) this).field_f, var9, var10, ((wk) this).field_h, -1, 0, 0, var7);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ra.d(param6, param0, param1, param4, param3, param5);
        if (param2 != 13421772) {
            field_s = -0.8290913105010986f;
        }
    }

    final static void b(int param0) {
        rm.field_a = new ho();
        mm.field_u.e((na) (Object) rm.field_a, -27667);
        int var1 = 75 / ((-8 - param0) / 51);
    }

    final void a(int param0, jb param1) {
        int var7_int = 0;
        int var15 = TetraLink.field_J;
        al var18 = new al(param1, 2, 2, 2236962, 1, 1, 1, param1.field_K + (param1.field_N + 2));
        ((wk) this).field_e = (kg) (Object) var18;
        var18.field_a = 16777215;
        qn var4 = new qn();
        var18.a(param0 + -15658734, (al) (Object) var4);
        ((wk) this).field_q = 3;
        ((wk) this).field_v = 3;
        ((wk) this).field_g = 5592405;
        ((wk) this).field_p = -1;
        ((wk) this).field_d = param0;
        ((wk) this).field_f = 3;
        ((wk) this).field_h = 15658734;
        ((wk) this).field_o = 3;
        ((wk) this).field_k = param1;
        var4.field_n = 11711154;
        var4.field_o = 15658734;
        dg discarded$0 = var4.a((byte) -41, 0).a(2, 15658734).a(wm.a(false, 7829367, 10066329, 8947848), true);
        dg discarded$1 = var4.a((byte) -41, 1).a(wm.a(false, 13421772, 10066329, 11184810), true);
        dg discarded$2 = var4.a((byte) -41, 3).a(wm.a(false, 10066329, 7829367, 8947848), true).a((byte) -128, 1).a(1, (byte) 12);
        oh[] var5 = new oh[9];
        ue var16 = new ue(32, 32);
        ue var17 = var16;
        for (var7_int = 0; var7_int < var17.field_C.length; var7_int++) {
            var16.field_C[var7_int] = 1077952576;
        }
        var5[4] = (oh) (Object) var17;
        dg discarded$3 = var4.a((byte) -41, 4).a((byte) -77, true).a(var5, true);
        dg discarded$4 = var4.a((byte) -41, 5).a(kk.a(65793, 0, 0, 0, (byte) -97), true).a((byte) -77, true).a(param0 ^ 15658732, -1);
        ((wk) this).field_n = (kg) (Object) var4;
        qn var6 = new qn(var4, true);
        var6.field_k = 0;
        qn var7 = new qn(var4, true);
        var7.field_k = 0;
        var7.a(qj.a(-5300, 8947848), param0 + -15658837);
        dg discarded$5 = var7.a((byte) -41, 1).a(qj.a(-5300, 11184810), true).a(param0 ^ 15658732, 2236962);
        ((wk) this).field_x = (kg) (Object) new og(param1, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924);
        cc discarded$6 = new cc(param1, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
        dc discarded$7 = new dc(param1, 16777215, -1, 125269879, 4473924, 3, 268435455);
        qn var8 = new qn();
        var18.a(0, (al) (Object) var8);
        dg discarded$8 = var8.a((byte) -41, 0).a(wm.a(false, 10066329, 7829367, 15658734), true).a(2, 1118481).b(-1, param0 ^ 15658732);
        dg discarded$9 = var8.a((byte) -41, 4).a((byte) -77, true).a(var5, true);
        ((wk) this).field_r = (kg) (Object) var8;
        oh[] var9 = new oh[9];
        oh[] var10 = new oh[9];
        var9[4] = new oh(2, 1);
        var10[4] = new oh(1, 2);
        var9[4].field_C = new int[]{6710886, 7829367};
        var10[4].field_C = new int[]{6710886, 7829367};
        qn var11 = new qn();
        qn var12 = new qn();
        var11.a(0, -1664329560, var9);
        var12.a(0, -1664329560, var10);
        oh var13 = new oh(7, 4);
        var13.field_C = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
        qn var14 = new qn(var4, true);
        var14.a(var13.d(), (byte) 71);
        var13.b();
        var14 = new qn(var4, true);
        var14.a(var13.d(), (byte) 71);
        var13.b();
        var14 = new qn(var4, true);
        var14.a(var13.d(), (byte) 71);
        var13.b();
        qn var19 = new qn(var4, true);
        var19.a(var13, (byte) 71);
    }

    final void a(String param0, int param1, int param2, int param3) {
        if (((wk) this).field_m) {
            this.a(2, param0, param1, param2);
        } else {
            this.a(32, param1, param2, param0);
        }
        if (param3 > -59) {
            field_b = null;
        }
    }

    final static boolean a(byte param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 122) {
            break L0;
          } else {
            wk.a(-125, false, (byte) -115);
            break L0;
          }
        }
        L1: {
          L2: {
            if (ug.o(-102)) {
              break L2;
            } else {
              if (mb.field_C > 0) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    public wk() {
        ((wk) this).field_m = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Service unavailable";
        field_w = 0L;
        field_c = 0;
        field_a = "Cancel unrated rematch";
        field_j = "Remove <%0> from friend list";
    }
}
