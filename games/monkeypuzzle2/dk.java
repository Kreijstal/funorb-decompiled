/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dk {
    int field_p;
    ml field_l;
    int field_n;
    ta field_m;
    int field_r;
    int field_k;
    static int field_j;
    ml field_a;
    private boolean field_q;
    int field_f;
    ml field_o;
    ml field_i;
    static ib field_d;
    int field_b;
    private int field_c;
    ml field_g;
    int field_s;
    static ib field_h;
    static mj field_e;

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
          var15 = MonkeyPuzzle2.field_F ? 1 : 0;
          var5 = ((dk) this).field_p + ((dk) this).field_n;
          var6 = ((dk) this).field_f + ((dk) this).field_k;
          var7 = ((dk) this).field_b;
          if (0 == (var7 ^ -1)) {
            var7 = ((dk) this).field_m.field_C + ((dk) this).field_m.field_D;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          L2: {
            var8 = ge.field_h >> 723108066;
            var9 = ((dk) this).field_m.a(param1);
            var10 = ((dk) this).field_m.field_D + ((dk) this).field_m.field_C;
            var11 = 1;
            if (var9 > var8) {
              break L2;
            } else {
              if (-1 != param1.indexOf("<br>")) {
                break L2;
              } else {
                break L1;
              }
            }
          }
          L3: {
            if (nd.field_g != null) {
              break L3;
            } else {
              nd.field_g = new String[16];
              break L3;
            }
          }
          L4: {
            if (var9 > var8) {
              var13 = var9 / var8;
              var12 = 2 * ((-1 + var9 % var8 + var13) / var13) + var8;
              break L4;
            } else {
              var12 = var8;
              break L4;
            }
          }
          var11 = ((dk) this).field_m.a(param1, new int[1], nd.field_g);
          var9 = 0;
          var10 = var10 + (var11 + -1) * var7;
          var13 = 0;
          L5: while (true) {
            if (var13 >= var11) {
              break L1;
            } else {
              var14 = ((dk) this).field_m.a(nd.field_g[var13]);
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
          var12 = -40 / ((-24 - param0) / 34);
          var13 = param3;
          if (ge.field_h < var5 + (var9 + var13)) {
            var13 = -var5 + ge.field_h - var9;
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          var14 = 32 + -((dk) this).field_m.field_j + param2;
          if (ge.field_g >= var14 - (-var10 - var6)) {
            break L7;
          } else {
            var14 = -var6 + (param2 - var10);
            break L7;
          }
        }
        ge.f(var13, var14, var5 + var9, var10 - -var6, ((dk) this).field_r);
        ge.d(1 + var13, var14 - -1, var5 + (var9 + -2), var10 + (var6 + -2), ((dk) this).field_s);
        int discarded$1 = ((dk) this).field_m.a(param1, var13 - -((dk) this).field_p, var14 + ((dk) this).field_k, var9, var10, ((dk) this).field_c, -1, 0, 0, var7);
    }

    final static void a(String param0, int param1, int param2, be param3, ta param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param2 == -25006) {
          var5 = 0;
          var6 = -1;
          var7 = 1;
          L0: while (true) {
            if (var7 >= param0.length()) {
              return;
            } else {
              L1: {
                var8 = param0.charAt(var7);
                if (var8 == 60) {
                  var6 = (var5 >> -950064312) + (param3.field_c[0] + param4.a(param0.substring(0, var7)));
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (var6 != -1) {
                  param3.field_c[var7] = var6;
                  break L2;
                } else {
                  L3: {
                    if (var8 != 32) {
                      break L3;
                    } else {
                      var5 = var5 + param1;
                      break L3;
                    }
                  }
                  param3.field_c[var7] = (var5 >> -365433432) + param3.field_c[0] + (param4.a(param0.substring(0, var7 + 1)) + -param4.a((char) var8));
                  break L2;
                }
              }
              if (var8 == 62) {
                var6 = -1;
                var7++;
                continue L0;
              } else {
                var7++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param4 < 82) {
            dk.a(41);
        }
        ge.c(param0, param6, param5, param3, param1, param2);
    }

    public static void a(int param0) {
        field_d = null;
        field_h = null;
        field_e = null;
        if (param0 < 100) {
            field_d = null;
        }
    }

    final static boolean a(int param0, byte param1) {
        int var2 = -89 % ((param1 - 64) / 61);
        return (-param0 & param0) == param0 ? true : false;
    }

    final void a(ta param0, boolean param1) {
        int var7_int = 0;
        int var15 = MonkeyPuzzle2.field_F ? 1 : 0;
        a var17 = new a(param0, 2, 2, 2236962, 1, 1, 1, param0.field_C + param0.field_D - -2);
        var17.field_f = 16777215;
        ((dk) this).field_a = (ml) (Object) var17;
        ak var4 = new ak();
        var17.a(false, (a) (Object) var4);
        ((dk) this).field_m = param0;
        ((dk) this).field_s = 5592405;
        ((dk) this).field_p = 3;
        ((dk) this).field_n = 3;
        ((dk) this).field_f = 3;
        ((dk) this).field_b = -1;
        ((dk) this).field_r = 15658734;
        var4.field_e = 11711154;
        ((dk) this).field_k = 3;
        var4.field_k = 15658734;
        ((dk) this).field_c = 15658734;
        hc discarded$60 = var4.a((byte) -102, 0).a(15658734, (byte) -3).a(-20433, vl.a(10066329, 7829367, 8947848, true));
        hc discarded$85 = var4.a((byte) -102, 1).a(-20433, vl.a(10066329, 13421772, 11184810, true));
        hc discarded$86 = var4.a((byte) -102, 3).a(-20433, vl.a(7829367, 10066329, 8947848, !param1 ? true : false)).b(122, 1).a(1, 215650672);
        le[] var5 = new le[9];
        ae var16 = new ae(32, 32);
        ae var18 = var16;
        for (var7_int = 0; var18.field_s.length > var7_int; var7_int++) {
            var16.field_s[var7_int] = 1077952576;
        }
        var5[4] = (le) (Object) var18;
        hc discarded$87 = var4.a((byte) -102, 4).a((byte) -48, true).a(-20433, var5);
        hc discarded$88 = var4.a((byte) -102, 5).a(-20433, jc.a(65793, 0, 64, 0, 0)).a((byte) -48, true).a(-1, (byte) -3);
        ((dk) this).field_i = (ml) (Object) var4;
        ak var6 = new ak(var4, true);
        var6.field_l = 0;
        ak var7 = new ak(var4, true);
        var7.field_l = 0;
        var7.a(ck.a(8947848, -14377), 250);
        hc discarded$89 = var7.a((byte) -102, 1).a(-20433, ck.a(11184810, -14377)).a(2236962, (byte) -3);
        ((dk) this).field_l = (ml) (Object) new pb(param0, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924);
        db discarded$90 = new db(param0, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
        mc discarded$91 = new mc(param0, 16777215, -1, 125269879, 4473924, 3, 268435455);
        ak var8 = new ak();
        var17.a(param1, (a) (Object) var8);
        hc discarded$92 = var8.a((byte) -102, 0).a(-20433, vl.a(7829367, 10066329, 15658734, true)).a(1118481, (byte) -3).a(true, -1);
        hc discarded$93 = var8.a((byte) -102, 4).a((byte) -48, true).a(-20433, var5);
        ((dk) this).field_o = (ml) (Object) var8;
        le[] var9 = new le[9];
        var9[4] = new le(2, 1);
        le[] var10 = new le[9];
        var10[4] = new le(1, 2);
        var9[4].field_s = new int[]{6710886, 7829367};
        var10[4].field_s = new int[]{6710886, 7829367};
        ak var11 = new ak();
        ak var12 = new ak();
        var11.a(var9, 4986, 0);
        var12.a(var10, 4986, 0);
        le var13 = new le(7, 4);
        var13.field_s = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
        ak var14 = new ak(var4, true);
        var14.a((byte) 1, var13.d());
        var13.b();
        var14 = new ak(var4, true);
        var14.a((byte) 1, var13.d());
        var13.b();
        var14 = new ak(var4, true);
        var14.a((byte) 1, var13.d());
        var13.b();
        ak var19 = new ak(var4, true);
        var19.a((byte) 1, var13);
    }

    private final void a(int param0, String param1, byte param2, int param3) {
        if (param2 != -87) {
            return;
        }
        int var5 = ((dk) this).field_m.a(param1);
        int var6 = ((dk) this).field_m.field_j - -((dk) this).field_m.field_D;
        int var7 = param3;
        if (ge.field_h < var7 - -var5 + 6) {
            var7 = -var5 + ge.field_h + -6;
        }
        int var8 = param0 - ((dk) this).field_m.field_j + 32;
        if (!(var8 + var6 + 6 <= ge.field_g)) {
            var8 = -var6 + (ge.field_g + -6);
        }
        ge.f(var7, var8, 6 + var5, var6 - -6, ((dk) this).field_c);
        ge.d(var7 - -1, 1 + var8, var5 + 4, var6 - -4, ((dk) this).field_s);
        ((dk) this).field_m.b(param1, var7 - -3, var8 - -3 - -((dk) this).field_m.field_j, ((dk) this).field_c, -1);
    }

    final void a(int param0, int param1, int param2, String param3) {
        if (param1 < 6) {
            return;
        }
        if (((dk) this).field_q) {
            this.a(96, param3, param0, param2);
        } else {
            this.a(param0, param3, (byte) -87, param2);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        ge.e(param2, param3, param5, param4, param1);
        if (param0 != 13421772) {
            ((dk) this).a(126, 26, -59, -95, -111, -126);
        }
    }

    public dk() {
        ((dk) this).field_q = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = 0;
        field_d = new ib();
    }
}
