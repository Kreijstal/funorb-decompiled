/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh {
    private boolean field_s;
    int field_j;
    int field_h;
    private int field_a;
    ca field_o;
    ca field_d;
    int field_k;
    static int field_t;
    ca field_q;
    ca field_m;
    static tb field_p;
    ca field_c;
    int field_l;
    static String field_b;
    int field_e;
    static String field_r;
    se field_f;
    int field_g;
    static String[] field_n;
    int field_i;

    private final void a(int param0, byte param1, String param2, int param3) {
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
          var15 = DungeonAssault.field_K;
          var5 = ((lh) this).field_e - -((lh) this).field_g;
          var6 = ((lh) this).field_h + ((lh) this).field_l;
          var7 = ((lh) this).field_i;
          if (var7 != -1) {
            break L0;
          } else {
            var7 = ((lh) this).field_f.field_E + ((lh) this).field_f.field_H;
            break L0;
          }
        }
        L1: {
          L2: {
            var8 = gf.field_i >> 1347161634;
            var9 = ((lh) this).field_f.b(param2);
            var10 = ((lh) this).field_f.field_E + ((lh) this).field_f.field_H;
            var11 = 1;
            if (var9 > var8) {
              break L2;
            } else {
              if ((param2.indexOf("<br>") ^ -1) == 0) {
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
              var12 = var8 + (-1 + (var9 % var8 - -var13)) / var13 * 2;
              break L3;
            }
          }
          L4: {
            if (null != pe.field_m) {
              break L4;
            } else {
              pe.field_m = new String[16];
              break L4;
            }
          }
          var11 = ((lh) this).field_f.a(param2, new int[1], pe.field_m);
          var10 = var10 + (-1 + var11) * var7;
          var9 = 0;
          var13 = 0;
          L5: while (true) {
            if (var11 <= var13) {
              break L1;
            } else {
              var14 = ((lh) this).field_f.b(pe.field_m[var13]);
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
          var12 = param0;
          if (var12 - (-var9 + -var5) > gf.field_i) {
            var12 = -var9 + (gf.field_i + -var5);
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          var13 = 32 + (-((lh) this).field_f.field_N + param3);
          if (gf.field_c < var6 + (var13 + var10)) {
            var13 = -var6 + -var10 + param3;
            break L7;
          } else {
            break L7;
          }
        }
        gf.e(var12, var13, var9 - -var5, var6 + var10, ((lh) this).field_k);
        if (param1 == -81) {
          gf.b(var12 - -1, 1 + var13, var5 + var9 + -2, -2 + (var6 + var10), ((lh) this).field_j);
          int discarded$1 = ((lh) this).field_f.a(param2, ((lh) this).field_e + var12, var13 + ((lh) this).field_l, var9, var10, ((lh) this).field_a, -1, 0, 0, var7);
          return;
        } else {
          return;
        }
    }

    final void a(int param0, se param1) {
        int var8_int = 0;
        int var16 = DungeonAssault.field_K;
        hh var18 = new hh(param1, 2, 2, 2236962, 1, 1, 1, param1.field_H + (param1.field_E - -2));
        var18.field_g = 16777215;
        ((lh) this).field_m = (ca) (Object) var18;
        an var4 = new an();
        var18.a((byte) 126, (hh) (Object) var4);
        var4.field_t = 11711154;
        ((lh) this).field_i = -1;
        ((lh) this).field_a = 15658734;
        ((lh) this).field_f = param1;
        ((lh) this).field_j = 5592405;
        ((lh) this).field_e = 3;
        ((lh) this).field_g = 3;
        ((lh) this).field_l = 3;
        ((lh) this).field_h = 3;
        var4.field_j = 15658734;
        ((lh) this).field_k = 15658734;
        pi discarded$0 = var4.a(0, (byte) -115).a(-7695, 15658734).a(bb.a(8947848, false, 7829367, 10066329), true);
        pi discarded$1 = var4.a(1, (byte) -90).a(bb.a(11184810, false, 13421772, 10066329), true);
        pi discarded$2 = var4.a(3, (byte) -97).a(bb.a(8947848, false, 10066329, 7829367), true).b(1, -114).c(1, -33);
        int var6 = -31 / ((param0 - -69) / 45);
        cn[] var5 = new cn[9];
        ei var17 = new ei(32, 32);
        ei var19 = var17;
        for (var8_int = 0; var8_int < var19.field_B.length; var8_int++) {
            var17.field_B[var8_int] = 1077952576;
        }
        var5[4] = (cn) (Object) var19;
        pi discarded$3 = var4.a(4, (byte) -115).a((byte) -110, true).a(var5, true);
        pi discarded$4 = var4.a(5, (byte) -86).a(hj.a(0, 65793, (byte) 123, 0, 0), true).a((byte) -116, true).a(-7695, -1);
        ((lh) this).field_o = (ca) (Object) var4;
        an var7 = new an(var4, true);
        var7.field_f = 0;
        an var8 = new an(var4, true);
        var8.field_f = 0;
        var8.a(ek.a((byte) -64, 8947848), 0);
        pi discarded$5 = var8.a(1, (byte) -107).a(ek.a((byte) -93, 11184810), true).a(-7695, 2236962);
        ((lh) this).field_q = (ca) (Object) new oh(param1, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924);
        jn discarded$6 = new jn(param1, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
        im discarded$7 = new im(param1, 16777215, -1, 125269879, 4473924, 3, 268435455);
        an var9 = new an();
        var18.a((byte) 126, (hh) (Object) var9);
        pi discarded$8 = var9.a(0, (byte) -99).a(bb.a(15658734, false, 10066329, 7829367), true).a(-7695, 1118481).d(-1, 216);
        pi discarded$9 = var9.a(4, (byte) -91).a((byte) -111, true).a(var5, true);
        ((lh) this).field_c = (ca) (Object) var9;
        cn[] var10 = new cn[9];
        var10[4] = new cn(2, 1);
        cn[] var11 = new cn[9];
        var11[4] = new cn(1, 2);
        var10[4].field_B = new int[]{6710886, 7829367};
        var11[4].field_B = new int[]{6710886, 7829367};
        an var12 = new an();
        an var13 = new an();
        var12.a(0, var10, -116);
        var13.a(0, var11, -116);
        cn var14 = new cn(7, 4);
        var14.field_B = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
        an var15 = new an(var4, true);
        var15.a((byte) 47, var14.d());
        var14.g();
        var15 = new an(var4, true);
        var15.a((byte) 47, var14.d());
        var14.g();
        var15 = new an(var4, true);
        var15.a((byte) 47, var14.d());
        var14.g();
        an var20 = new an(var4, true);
        var20.a((byte) 47, var14);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        gf.b(param1, param2, param0, param6, param3, param5);
        if (param4 > -61) {
            ((lh) this).a(-30, 77, 78, 91, 100, false);
        }
    }

    public static void a(int param0) {
        field_r = null;
        field_b = null;
        field_n = null;
        field_p = null;
        if (param0 > -54) {
            lh.a(6);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, boolean param5) {
        gf.c(param3, param2, param0, param1, param4);
        if (!param5) {
            ((lh) this).field_s = true;
        }
    }

    private final void a(int param0, int param1, int param2, String param3) {
        int var5 = ((lh) this).field_f.b(param3);
        int var6 = ((lh) this).field_f.field_N - -((lh) this).field_f.field_E;
        int var7 = param1;
        if (param2 != 28964) {
            return;
        }
        if (!(6 + (var7 + var5) <= gf.field_i)) {
            var7 = -var5 + (gf.field_i + -6);
        }
        int var8 = 32 + -((lh) this).field_f.field_N + param0;
        if (!(6 + var6 + var8 <= gf.field_c)) {
            var8 = gf.field_c + (-var6 - 6);
        }
        gf.e(var7, var8, 6 + var5, 6 + var6, ((lh) this).field_a);
        gf.b(var7 - -1, var8 + 1, var5 - -4, var6 - -4, ((lh) this).field_j);
        ((lh) this).field_f.b(param3, var7 + 3, ((lh) this).field_f.field_N + var8 + 3, ((lh) this).field_a, -1);
    }

    final void a(String param0, int param1, int param2, int param3) {
        if (!((lh) this).field_s) {
            this.a(param2, param3, param1 + -6681922, param0);
        } else {
            this.a(param3, (byte) -81, param0, param2);
        }
        if (param1 != 6710886) {
            field_r = null;
        }
    }

    public lh() {
        ((lh) this).field_s = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "<col=8B1717>Charge</col>";
        field_r = "Connection timed out. Please try using a different server.";
        field_t = 9;
        field_n = new String[]{"<%0> the Feared", "<%0> the Stalwart", "<%0> the Vengeful", "<%0> the Tyrant", "<%0>, Mistress of the Game"};
    }
}
