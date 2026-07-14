/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa {
    private boolean field_m;
    int field_o;
    int field_f;
    int field_l;
    int field_d;
    private int field_a;
    ir field_g;
    int field_e;
    int field_j;
    ir field_n;
    hc field_b;
    ir field_c;
    ir field_k;
    int field_i;
    static int[] field_h;
    ir field_p;

    final void a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        if (param5 != -54) {
            String var9 = (String) null;
            this.a((String) null, 110, -89, 29);
        }
        vp.b(param3, param1, param0, param6, param2, param4);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        vp.f(param3, param1, param2, param5, param0);
        if (param4 != 13053) {
            ((sa) this).field_m = true;
        }
    }

    private final void a(String param0, int param1, int param2, int param3) {
        int var5 = ((sa) this).field_b.a(param0);
        int var6 = ((sa) this).field_b.field_C + ((sa) this).field_b.field_D;
        int var7 = param3;
        if (vp.field_i < 6 + (var7 - -var5)) {
            var7 = vp.field_i - var5 - 6;
        }
        int var8 = param2 - (((sa) this).field_b.field_C - 32);
        if (!(vp.field_c >= 6 + var6 + var8)) {
            var8 = -6 + (-var6 + vp.field_c);
        }
        if (param1 != -22550) {
            ((sa) this).field_f = -47;
        }
        vp.e(var7, var8, 6 + var5, 6 + var6, ((sa) this).field_a);
        vp.b(1 + var7, 1 + var8, 4 + var5, 4 + var6, ((sa) this).field_j);
        ((sa) this).field_b.b(param0, 3 + var7, 3 + var8 - -((sa) this).field_b.field_C, ((sa) this).field_a, -1);
    }

    public static void a(int param0) {
        int var1 = 63 % ((-74 - param0) / 49);
        field_h = null;
    }

    private final void b(int param0, String param1, int param2, int param3) {
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
          var15 = AceOfSkies.field_G ? 1 : 0;
          var5 = ((sa) this).field_f + ((sa) this).field_e;
          var6 = ((sa) this).field_o - -((sa) this).field_l;
          var7 = ((sa) this).field_i;
          if (0 != (var7 ^ -1)) {
            break L0;
          } else {
            var7 = ((sa) this).field_b.field_D + ((sa) this).field_b.field_I;
            break L0;
          }
        }
        L1: {
          var8 = vp.field_i >> -925601566;
          var9 = ((sa) this).field_b.a(param1);
          if (param3 == 27201) {
            break L1;
          } else {
            sa.a(51);
            break L1;
          }
        }
        L2: {
          L3: {
            var10 = ((sa) this).field_b.field_D + ((sa) this).field_b.field_I;
            var11 = 1;
            if (var8 < var9) {
              break L3;
            } else {
              if (param1.indexOf("<br>") == -1) {
                break L2;
              } else {
                break L3;
              }
            }
          }
          L4: {
            if (var9 <= var8) {
              var12 = var8;
              break L4;
            } else {
              var13 = var9 / var8;
              var12 = 2 * ((-1 + var13 + var9 % var8) / var13) + var8;
              break L4;
            }
          }
          L5: {
            if (or.field_b != null) {
              break L5;
            } else {
              or.field_b = new String[16];
              break L5;
            }
          }
          var11 = ((sa) this).field_b.a(param1, new int[1], or.field_b);
          var9 = 0;
          var10 = var10 + var7 * (var11 - 1);
          var13 = 0;
          L6: while (true) {
            if (var11 <= var13) {
              break L2;
            } else {
              var14 = ((sa) this).field_b.a(or.field_b[var13]);
              if (var14 > var9) {
                var9 = var14;
                var13++;
                continue L6;
              } else {
                var13++;
                continue L6;
              }
            }
          }
        }
        L7: {
          var12 = param0;
          if (var9 + var12 + var5 > vp.field_i) {
            var12 = vp.field_i - (var9 + var5);
            break L7;
          } else {
            break L7;
          }
        }
        L8: {
          var13 = 32 + (param2 - ((sa) this).field_b.field_C);
          if (var13 + (var10 + var6) > vp.field_c) {
            var13 = -var6 + -var10 + param2;
            break L8;
          } else {
            break L8;
          }
        }
        vp.e(var12, var13, var9 + var5, var6 + var10, ((sa) this).field_d);
        vp.b(1 + var12, 1 + var13, var9 - -var5 + -2, var6 + var10 - 2, ((sa) this).field_j);
        int discarded$1 = ((sa) this).field_b.a(param1, var12 - -((sa) this).field_f, var13 + ((sa) this).field_o, var9, var10, ((sa) this).field_a, -1, 0, 0, var7);
    }

    final void a(hc param0, int param1) {
        int var7_int = 0;
        int var15 = AceOfSkies.field_G ? 1 : 0;
        qm var17 = new qm(param0, 2, 2, 2236962, 1, 1, 1, 2 + (((hc) param0).field_D + ((hc) param0).field_I));
        var17.field_m = 16777215;
        ((sa) this).field_k = (ir) (Object) var17;
        vi var4 = new vi();
        var17.a((qm) (Object) var4, 27529);
        ((sa) this).field_a = 15658734;
        ((sa) this).field_e = 3;
        ((sa) this).field_f = 3;
        ((sa) this).field_d = 15658734;
        ((sa) this).field_o = 3;
        ((sa) this).field_b = param0;
        var4.field_d = 15658734;
        var4.field_j = 11711154;
        ((sa) this).field_l = 3;
        ((sa) this).field_i = -1;
        ((sa) this).field_j = 5592405;
        sc discarded$0 = var4.a(-115, 0).a(15658734, param1 ^ -3).a(nl.a(-125, 7829367, 10066329, 8947848), false);
        sc discarded$1 = var4.a(-78, 1).a(nl.a(param1 ^ 1, 13421772, 10066329, 11184810), false);
        sc discarded$2 = var4.a(-42, 3).a(nl.a(-106, 10066329, 7829367, 8947848), false).a(1, (byte) 81).b(1, (byte) -125);
        ll[] var5 = new ll[9];
        rd var16 = new rd(32, 32);
        rd var18 = var16;
        for (var7_int = 0; var7_int < ((rd) var18).field_x.length; var7_int++) {
            ((rd) var16).field_x[var7_int] = 1077952576;
        }
        var5[4] = (ll) (Object) var18;
        sc discarded$3 = var4.a(param1 ^ -63, 4).a((byte) -50, true).a(var5, false);
        sc discarded$4 = var4.a(-99, 5).a(ce.b(0, 65793, -29003, 0, 0), false).a((byte) -50, true).a(-1, param1 + -5);
        ((sa) this).field_c = (ir) (Object) var4;
        vi var6 = new vi(var4, true);
        var6.field_e = 0;
        vi var7 = new vi(var4, true);
        var7.field_e = 0;
        var7.a(-117, bs.a(8947848, false));
        sc discarded$5 = var7.a(-105, 1).a(bs.a(11184810, false), false).a(2236962, -2);
        ((sa) this).field_g = (ir) (Object) new lj(param0, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924);
        de discarded$6 = new de(param0, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
        us discarded$7 = new us(param0, 16777215, -1, 125269879, 4473924, param1, 268435455);
        vi var8 = new vi();
        var17.a((qm) (Object) var8, 27529);
        sc discarded$8 = var8.a(param1 + -58, 0).a(nl.a(-80, 10066329, 7829367, 15658734), false).a(1118481, -2).c(-1, (byte) -79);
        sc discarded$9 = var8.a(-63, 4).a((byte) -50, true).a(var5, false);
        ((sa) this).field_n = (ir) (Object) var8;
        ll[] var9 = new ll[9];
        var9[4] = new ll(2, 1);
        ll[] var10 = new ll[9];
        var10[4] = new ll(1, 2);
        var9[4].field_x = new int[]{6710886, 7829367};
        var10[4].field_x = new int[]{6710886, 7829367};
        vi var11 = new vi();
        vi var12 = new vi();
        var11.a(0, 0, var9);
        var12.a(0, 0, var10);
        ll var13 = new ll(7, 4);
        var13.field_x = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
        vi var14 = new vi(var4, true);
        var14.a((byte) -90, var13.d());
        var13.c();
        var14 = new vi(var4, true);
        var14.a((byte) -90, var13.d());
        var13.c();
        var14 = new vi(var4, true);
        var14.a((byte) -90, var13.d());
        var13.c();
        vi var19 = new vi(var4, true);
        var19.a((byte) -90, var13);
    }

    final void a(int param0, String param1, int param2, int param3) {
        if (((sa) this).field_m) {
            this.b(param3, param1, param2, 27201);
        } else {
            this.a(param1, param0 ^ -10076557, param2, param3);
        }
        if (param0 != 10066329) {
            ((sa) this).a(1, -66, 80, 107, 71, -12);
        }
    }

    final static boolean a(boolean param0) {
        bb var1 = null;
        int var2 = 0;
        int var3 = 0;
        bb var4 = null;
        var3 = AceOfSkies.field_G ? 1 : 0;
        var4 = (bb) av.field_c.d(268435455);
        var1 = var4;
        if (var1 != null) {
          L0: {
            if (param0) {
              break L0;
            } else {
              field_h = (int[]) null;
              break L0;
            }
          }
          var2 = 0;
          L1: while (true) {
            if (((bb) var1).field_g <= var2) {
              return true;
            } else {
              L2: {
                if (null != ((bb) var4).field_f[var2]) {
                  if (((bb) var4).field_f[var2].field_a != 0) {
                    break L2;
                  } else {
                    return false;
                  }
                } else {
                  break L2;
                }
              }
              if (null != ((bb) var4).field_h[var2]) {
                if (((bb) var4).field_h[var2].field_a == 0) {
                  return false;
                } else {
                  var2++;
                  continue L1;
                }
              } else {
                var2++;
                continue L1;
              }
            }
          }
        } else {
          return false;
        }
    }

    final static String b(int param0) {
        if (param0 != -25752) {
            field_h = (int[]) null;
        }
        if (!(jq.field_fb != ht.field_k)) {
            return nh.field_b;
        }
        return dp.field_i;
    }

    public sa() {
        ((sa) this).field_m = true;
    }

    static {
    }
}
