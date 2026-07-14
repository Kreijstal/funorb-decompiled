/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sg {
    int field_u;
    int field_s;
    private int field_a;
    static String field_o;
    private boolean field_f;
    static String field_n;
    de field_c;
    de field_j;
    int field_r;
    de field_d;
    static java.awt.Frame field_i;
    static int field_k;
    qe field_l;
    de field_t;
    int field_b;
    static int field_e;
    static int field_q;
    int field_g;
    de field_p;
    int field_m;
    int field_h;

    private final void a(int param0, int param1, String param2, int param3) {
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
          var15 = StarCannon.field_A;
          var5 = ((sg) this).field_r + ((sg) this).field_g;
          var6 = ((sg) this).field_m + ((sg) this).field_u;
          var7 = ((sg) this).field_b;
          if (-1 == var7) {
            var7 = ((sg) this).field_l.field_q + ((sg) this).field_l.field_p;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          L2: {
            var8 = ki.field_j >> -117738558;
            var9 = ((sg) this).field_l.a(param2);
            var10 = ((sg) this).field_l.field_q + ((sg) this).field_l.field_p;
            var11 = 1;
            if (var9 > var8) {
              break L2;
            } else {
              if (0 != (param2.indexOf("<br>") ^ -1)) {
                break L2;
              } else {
                break L1;
              }
            }
          }
          L3: {
            if (var8 < var9) {
              var13 = var9 / var8;
              var12 = (var9 % var8 - (-var13 + 1)) / var13 * 2 + var8;
              break L3;
            } else {
              var12 = var8;
              break L3;
            }
          }
          L4: {
            if (null != vd.field_f) {
              break L4;
            } else {
              vd.field_f = new String[16];
              break L4;
            }
          }
          var11 = ((sg) this).field_l.a(param2, new int[1], vd.field_f);
          var10 = var10 + (var11 - 1) * var7;
          var9 = 0;
          var13 = 0;
          L5: while (true) {
            if (var13 >= var11) {
              break L1;
            } else {
              var14 = ((sg) this).field_l.a(vd.field_f[var13]);
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
          var12 = param3;
          if (ki.field_j < var12 + var9 - -var5) {
            var12 = ki.field_j + -var9 + -var5;
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          var13 = 32 + param1 + -((sg) this).field_l.field_r;
          if (ki.field_f < var10 + var13 + var6) {
            var13 = -var10 + param1 - var6;
            break L7;
          } else {
            break L7;
          }
        }
        ki.e(var12, var13, var9 - -var5, var6 + var10, ((sg) this).field_h);
        ki.d(1 + var12, var13 - -1, var5 + (var9 - 2), param0 + (var6 + var10), ((sg) this).field_s);
        int discarded$1 = ((sg) this).field_l.a(param2, var12 - -((sg) this).field_r, var13 - -((sg) this).field_u, var9, var10, ((sg) this).field_a, -1, 0, 0, var7);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, byte param6) {
        if (param6 != 113) {
            return;
        }
        ki.b(param4, param2, param3, param5, param1, param0);
    }

    private final void a(int param0, boolean param1, String param2, int param3) {
        int var5 = ((sg) this).field_l.a(param2);
        int var6 = ((sg) this).field_l.field_r - -((sg) this).field_l.field_q;
        int var7 = param0;
        if (ki.field_j < 6 + (var5 + var7)) {
            var7 = -6 + (-var5 + ki.field_j);
        }
        int var8 = 32 + param3 + -((sg) this).field_l.field_r;
        if (6 + (var8 - -var6) > ki.field_f) {
            var8 = ki.field_f - var6 - 6;
        }
        if (!param1) {
            ((sg) this).a(-128, 24, -71, 13, 44, 91, (byte) -1);
        }
        ki.e(var7, var8, 6 + var5, var6 - -6, ((sg) this).field_a);
        ki.d(var7 - -1, var8 - -1, var5 + 4, var6 + 4, ((sg) this).field_s);
        ((sg) this).field_l.a(param2, 3 + var7, 3 + (var8 - -((sg) this).field_l.field_r), ((sg) this).field_a, -1);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, boolean param5) {
        if (param5) {
            ((sg) this).field_f = false;
        }
        ki.a(param1, param2, param4, param3, param0);
    }

    public static void a(boolean param0) {
        field_o = null;
        field_n = null;
        if (param0) {
            return;
        }
        field_i = null;
    }

    final void b(int param0, int param1, String param2, int param3) {
        if (!((sg) this).field_f) {
            this.a(param3, true, param2, param0);
        } else {
            this.a(-2, param0, param2, param3);
        }
        if (param1 > -20) {
            ((sg) this).field_a = 81;
        }
    }

    final void a(byte param0, qe param1) {
        int var7_int = 0;
        int var15 = StarCannon.field_A;
        hd var18 = new hd(param1, 2, 2, 2236962, 1, 1, 1, 2 + param1.field_q + param1.field_p);
        var18.field_c = 16777215;
        ((sg) this).field_j = (de) (Object) var18;
        w var4 = new w();
        var18.a(-68, (hd) (Object) var4);
        ((sg) this).field_a = 15658734;
        ((sg) this).field_g = 3;
        ((sg) this).field_m = 3;
        ((sg) this).field_s = 5592405;
        if (param0 < 102) {
            Object var16 = null;
            this.a(-47, -18, (String) null, 92);
        }
        ((sg) this).field_u = 3;
        ((sg) this).field_h = 15658734;
        var4.field_m = 11711154;
        var4.field_j = 15658734;
        ((sg) this).field_l = param1;
        ((sg) this).field_b = -1;
        ((sg) this).field_r = 3;
        il discarded$0 = var4.a(0, (byte) -76).c(15658734, 2).a(el.b(10066329, 22396, 7829367, 8947848), (byte) -74);
        il discarded$1 = var4.a(1, (byte) -76).a(el.b(10066329, 22396, 13421772, 11184810), (byte) -74);
        il discarded$2 = var4.a(3, (byte) -76).a(el.b(7829367, 22396, 10066329, 8947848), (byte) -74).b(1, -86).a(256, 1);
        hl[] var5 = new hl[9];
        pj var17 = new pj(32, 32);
        pj var19 = var17;
        for (var7_int = 0; var7_int < var19.field_B.length; var7_int++) {
            var17.field_B[var7_int] = 1077952576;
        }
        var5[4] = (hl) (Object) var19;
        il discarded$3 = var4.a(4, (byte) -76).a(-38, true).a(var5, (byte) -74);
        il discarded$4 = var4.a(5, (byte) -76).a(ab.b(0, -25343, 0, 0, 65793), (byte) -74).a(-52, true).c(-1, 2);
        ((sg) this).field_d = (de) (Object) var4;
        w var6 = new w(var4, true);
        var6.field_h = 0;
        w var7 = new w(var4, true);
        var7.field_h = 0;
        var7.a((byte) 68, gi.a(4477, 8947848));
        il discarded$5 = var7.a(1, (byte) -76).a(gi.a(4477, 11184810), (byte) -74).c(2236962, 2);
        ((sg) this).field_p = (de) (Object) new ni(param1, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924);
        eg discarded$6 = new eg(param1, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
        ci discarded$7 = new ci(param1, 16777215, -1, 125269879, 4473924, 3, 268435455);
        w var8 = new w();
        var18.a(-121, (hd) (Object) var8);
        il discarded$8 = var8.a(0, (byte) -76).a(el.b(7829367, 22396, 10066329, 15658734), (byte) -74).c(1118481, 2).a((byte) -104, -1);
        il discarded$9 = var8.a(4, (byte) -76).a(-120, true).a(var5, (byte) -74);
        ((sg) this).field_c = (de) (Object) var8;
        hl[] var9 = new hl[9];
        hl[] var10 = new hl[9];
        var9[4] = new hl(2, 1);
        var10[4] = new hl(1, 2);
        var9[4].field_B = new int[]{6710886, 7829367};
        var10[4].field_B = new int[]{6710886, 7829367};
        w var11 = new w();
        w var12 = new w();
        var11.a(4, 0, var9);
        var12.a(4, 0, var10);
        hl var13 = new hl(7, 4);
        var13.field_B = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
        w var14 = new w(var4, true);
        var14.a(-127, var13.c());
        var13.a();
        var14 = new w(var4, true);
        var14.a(-118, var13.c());
        var13.a();
        var14 = new w(var4, true);
        var14.a(-34, var13.c());
        var13.a();
        w var20 = new w(var4, true);
        var20.a(-85, var13);
    }

    public sg() {
        ((sg) this).field_f = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_n = null;
        field_q = 0;
    }
}
