/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class of {
    io field_d;
    io field_b;
    io field_m;
    private boolean field_l;
    int field_r;
    int field_q;
    int field_f;
    int field_k;
    int field_e;
    int field_t;
    int field_p;
    io field_g;
    io field_a;
    rb field_c;
    io field_n;
    io field_s;
    private int field_j;
    int field_h;
    int field_o;
    int field_i;

    final void a(int param0, int param1, byte param2, int param3, int param4) {
        g.a(param3, (byte) 99, param1, param4, param0);
        if (param2 > -60) {
            ((of) this).field_k = 55;
        }
    }

    final void a(int param0, int param1, byte param2, int param3, int param4, int param5) {
        bi.e(param3, param4, param5, param0, param1);
        if (param2 != -14) {
            ((of) this).field_f = 122;
        }
    }

    final static vk a(String param0, int param1) {
        int var5 = 0;
        String var6 = null;
        vk var7 = null;
        int var8 = ZombieDawn.field_J;
        if (param1 != 8947848) {
            return null;
        }
        int var2 = param0.length();
        if (var2 == 0) {
            return bg.field_l;
        }
        if ((var2 ^ -1) < -256) {
            return fg.field_m;
        }
        String[] var3 = de.a('.', param0, -124);
        if (!(2 <= var3.length)) {
            return bg.field_l;
        }
        String[] var4 = var3;
        for (var5 = 0; var4.length > var5; var5++) {
            var6 = var4[var5];
            var7 = tg.a(-126, var6);
            if (var7 != null) {
                return var7;
            }
        }
        return wh.a(var3[-1 + var3.length], false);
    }

    final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = ZombieDawn.field_J;
          if (vo.field_a == null) {
            break L0;
          } else {
            if (vo.field_a[0] != null) {
              var1 = vo.field_a[0].field_w;
              vo.field_a[0].e(0, 0);
              vo.field_a[1].e(-var1 + bd.field_e, 0);
              vo.field_a[2].e(0, nh.field_P - var1);
              vo.field_a[3].e(-var1 + bd.field_e, -var1 + nh.field_P);
              g.a(0, (byte) 99, -var1 + bd.field_e, nh.field_P, var1);
              if (param0 == 11690) {
                var3 = nh.field_P + -var1;
                var2 = var1;
                L1: while (true) {
                  if (var2 >= bi.field_b) {
                    bi.f(0, var1, bd.field_e, nh.field_P - var1);
                    var2 = -var1 + bd.field_e;
                    var3 = var1;
                    L2: while (true) {
                      if (bi.field_d <= var3) {
                        pa.a(-21189);
                        return;
                      } else {
                        hi.field_x.e(0, var3);
                        hi.field_x.c(var2, var3);
                        var3 = var3 + hi.field_x.field_t;
                        continue L2;
                      }
                    }
                  } else {
                    ch.field_a.e(var2, 0);
                    ch.field_a.f(var2, var3);
                    var2 = var2 + ch.field_a.field_w;
                    continue L1;
                  }
                }
              } else {
                return;
              }
            } else {
              break L0;
            }
          }
        }
    }

    final void a(int param0, int param1, String param2, int param3) {
        if (param3 >= -100) {
            return;
        }
        if (!((of) this).field_l) {
            this.a(param2, param1, param0, (byte) 53);
        } else {
            this.a(param1, param2, param0, 0);
        }
    }

    private final void a(String param0, int param1, int param2, byte param3) {
        int var5 = ((of) this).field_c.b(param0);
        int var6 = ((of) this).field_c.field_x + ((of) this).field_c.field_w;
        if (param3 != 53) {
            ((of) this).a(60, -58, (byte) 14, 69, -115);
        }
        int var7 = param1;
        if (bi.field_f < 6 + (var5 + var7)) {
            var7 = -6 + (-var5 + bi.field_f);
        }
        int var8 = param2 - (((of) this).field_c.field_w + -32);
        if (!(bi.field_a >= var8 - -var6 - -6)) {
            var8 = -6 + (-var6 + bi.field_a);
        }
        bi.c(var7, var8, 6 + var5, 6 + var6, ((of) this).field_j);
        bi.b(var7 + 1, var8 - -1, var5 - -4, var6 + 4, ((of) this).field_k);
        ((of) this).field_c.c(param0, var7 - -3, ((of) this).field_c.field_w + 3 + var8, ((of) this).field_j, -1);
    }

    final void a(int param0, rb param1) {
        int var7_int = 0;
        int var15 = ZombieDawn.field_J;
        vf var17 = new vf(param1, 2, 2, 2236962, 1, 1, 1, 2 + param1.field_I + param1.field_x);
        ((of) this).field_n = (io) (Object) var17;
        var17.field_l = 16777215;
        qo var4 = new qo();
        var17.a((vf) (Object) var4, (byte) 106);
        ((of) this).field_h = 3;
        ((of) this).field_q = 3;
        var4.field_j = 11711154;
        var4.field_a = 15658734;
        ((of) this).field_k = 5592405;
        ((of) this).field_c = param1;
        ((of) this).field_r = 3;
        ((of) this).field_e = 3;
        ((of) this).field_i = 15658734;
        ((of) this).field_j = 15658734;
        ((of) this).field_t = -1;
        gj discarded$0 = var4.a((byte) 73, 0).b((byte) -21, 15658734).a(tb.c(10066329, 8947848, -2967, 7829367), param0 ^ 37);
        gj discarded$1 = var4.a((byte) 73, 1).a(tb.c(10066329, 11184810, -2967, 13421772), 33);
        gj discarded$2 = var4.a((byte) 73, 3).a(tb.c(7829367, 8947848, param0 + -2971, 10066329), param0 ^ 37).a((byte) 126, 1).a(1, (byte) 57);
        vn[] var5 = new vn[9];
        cd var16 = new cd(32, 32);
        cd var18 = var16;
        for (var7_int = 0; var18.field_z.length > var7_int; var7_int++) {
            var16.field_z[var7_int] = 1077952576;
        }
        var5[4] = (vn) (Object) var18;
        gj discarded$3 = var4.a((byte) 73, 4).a(true, (byte) 74).a(var5, 33);
        gj discarded$4 = var4.a((byte) 73, 5).a(ab.a(0, (byte) -36, 0, 0, 65793), 33).a(true, (byte) -113).b((byte) -21, -1);
        ((of) this).field_a = (io) (Object) var4;
        qo var6 = new qo(var4, true);
        var6.field_h = 0;
        qo var7 = new qo(var4, true);
        var7.field_h = 0;
        var7.a(69, bm.a((byte) -75, 8947848));
        gj discarded$5 = var7.a((byte) 73, 1).a(bm.a((byte) -107, 11184810), param0 ^ 37).b((byte) -21, 2236962);
        ((of) this).field_g = (io) (Object) new vl(param1, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924);
        t discarded$6 = new t(param1, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
        el discarded$7 = new el(param1, 16777215, -1, 125269879, 4473924, 3, 268435455);
        qo var8 = new qo();
        var17.a((vf) (Object) var8, (byte) -57);
        gj discarded$8 = var8.a((byte) 73, 0).a(tb.c(7829367, 15658734, param0 ^ -2963, 10066329), param0 + 29).b((byte) -21, 1118481).a(-1, param0 ^ -107);
        gj discarded$9 = var8.a((byte) 73, param0).a(true, (byte) 72).a(var5, param0 + 29);
        ((of) this).field_b = (io) (Object) var8;
        vn[] var9 = new vn[9];
        vn[] var10 = new vn[9];
        var9[4] = new vn(2, 1);
        var10[4] = new vn(1, 2);
        var9[4].field_z = new int[]{6710886, 7829367};
        var10[4].field_z = new int[]{6710886, 7829367};
        qo var11 = new qo();
        qo var12 = new qo();
        var11.a(1, var9, 0);
        var12.a(1, var10, 0);
        ((of) this).field_m = (io) (Object) var4;
        ((of) this).field_s = (io) (Object) var12;
        vn var13 = new vn(7, 4);
        var13.field_z = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
        ((of) this).field_p = 10;
        qo var14 = new qo(var4, true);
        var14.a(var13.e(), 0);
        var13.b();
        var14 = new qo(var4, true);
        var14.a(var13.e(), param0 + -4);
        var13.b();
        var14 = new qo(var4, true);
        var14.a(var13.e(), 0);
        var13.b();
        qo var19 = new qo(var4, true);
        var19.a(var13, 0);
    }

    final void b(int param0) {
        if (param0 != 3) {
            return;
        }
        pa.a(-21189);
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
          var15 = ZombieDawn.field_J;
          var5 = ((of) this).field_e + ((of) this).field_r;
          var6 = ((of) this).field_q - -((of) this).field_h;
          var7 = ((of) this).field_t;
          if ((var7 ^ -1) != 0) {
            break L0;
          } else {
            var7 = ((of) this).field_c.field_I + ((of) this).field_c.field_x;
            break L0;
          }
        }
        L1: {
          L2: {
            var8 = bi.field_f >> -853117534;
            var9 = ((of) this).field_c.b(param1);
            var10 = ((of) this).field_c.field_I + ((of) this).field_c.field_x;
            var11 = 1;
            if (var9 > var8) {
              break L2;
            } else {
              if (-1 == param1.indexOf("<br>")) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          L3: {
            if (kb.field_j == null) {
              kb.field_j = new String[16];
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (var9 <= var8) {
              var12 = var8;
              break L4;
            } else {
              var13 = var9 / var8;
              var12 = 2 * ((var9 % var8 - -var13 - 1) / var13) + var8;
              break L4;
            }
          }
          var11 = ((of) this).field_c.a(param1, new int[1], kb.field_j);
          var9 = 0;
          var10 = var10 + var7 * (-1 + var11);
          var13 = 0;
          L5: while (true) {
            if (var13 >= var11) {
              break L1;
            } else {
              var14 = ((of) this).field_c.b(kb.field_j[var13]);
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
          var12 = param0;
          if (var5 + (var9 + var12) <= bi.field_f) {
            break L6;
          } else {
            var12 = -var9 + bi.field_f - var5;
            break L6;
          }
        }
        L7: {
          var13 = -((of) this).field_c.field_w + (param2 - -32);
          if (bi.field_a < var13 - (-var10 - var6)) {
            var13 = -var6 + -var10 + param2;
            break L7;
          } else {
            break L7;
          }
        }
        bi.c(var12, var13, var5 + var9, var10 + var6, ((of) this).field_i);
        bi.b(var12 - -1, var13 + 1, -2 + var9 - -var5, var10 - -var6 + -2, ((of) this).field_k);
        int discarded$1 = ((of) this).field_c.a(param1, var12 - -((of) this).field_r, ((of) this).field_q + var13, var9, var10, ((of) this).field_j, -1, 0, param3, var7);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        bi.a(param3, param0, param2, param1, param6, param4);
        if (param5 > -88) {
            Object var9 = null;
            vk discarded$0 = of.a((String) null, -19);
        }
    }

    public of() {
        ((of) this).field_l = true;
    }

    static {
    }
}
