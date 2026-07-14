/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rbb {
    int field_c;
    int field_h;
    int field_u;
    wwa field_a;
    wwa field_l;
    int field_r;
    int field_s;
    wwa field_e;
    static wdb field_k;
    private boolean field_f;
    int field_m;
    wwa field_o;
    wwa field_d;
    int field_j;
    private int field_t;
    int field_b;
    wwa field_n;
    int field_i;
    int field_g;
    wwa field_q;
    no field_p;

    final void a(int param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        if (!param2) {
            ((rbb) this).a((byte) 18);
        }
        dma.e(param5, param0, param3, param6, param4, param1);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        if (param5 != 11480) {
            Object var8 = null;
            this.a(-20, -99, (String) null, 15);
        }
        dma.a(param4, param1, param3, param2, param0);
    }

    private final void a(boolean param0, int param1, int param2, String param3) {
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
          var15 = VoidHunters.field_G;
          var5 = ((rbb) this).field_j + ((rbb) this).field_h;
          var6 = ((rbb) this).field_u - -((rbb) this).field_c;
          var7 = ((rbb) this).field_g;
          if (-1 == var7) {
            var7 = ((rbb) this).field_p.field_k + ((rbb) this).field_p.field_A;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var8 = dma.field_g >> 1857704290;
          if (param0) {
            break L1;
          } else {
            ((rbb) this).a(53, -30, true, -4, 116, 102, 70);
            break L1;
          }
        }
        L2: {
          L3: {
            var9 = ((rbb) this).field_p.b(param3);
            var10 = ((rbb) this).field_p.field_A + ((rbb) this).field_p.field_k;
            var11 = 1;
            if (var9 > var8) {
              break L3;
            } else {
              if (-1 != param3.indexOf("<br>")) {
                break L3;
              } else {
                break L2;
              }
            }
          }
          L4: {
            if (var8 >= var9) {
              var12 = var8;
              break L4;
            } else {
              var13 = var9 / var8;
              var12 = (var13 + var9 % var8 + -1) / var13 * 2 + var8;
              break L4;
            }
          }
          L5: {
            if (wkb.field_d == null) {
              wkb.field_d = new String[16];
              break L5;
            } else {
              break L5;
            }
          }
          var11 = ((rbb) this).field_p.a(param3, new int[1], wkb.field_d);
          var10 = var10 + var7 * (-1 + var11);
          var9 = 0;
          var13 = 0;
          L6: while (true) {
            if (var13 >= var11) {
              break L2;
            } else {
              var14 = ((rbb) this).field_p.b(wkb.field_d[var13]);
              if (var9 < var14) {
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
          var12 = param1;
          if (dma.field_g < var12 + var9 + var5) {
            var12 = -var5 + -var9 + dma.field_g;
            break L7;
          } else {
            break L7;
          }
        }
        L8: {
          var13 = -((rbb) this).field_p.field_o + param2 + 32;
          if (dma.field_j >= var13 - -var10 - -var6) {
            break L8;
          } else {
            var13 = -var10 + param2 + -var6;
            break L8;
          }
        }
        dma.b(var12, var13, var9 - -var5, var6 + var10, ((rbb) this).field_m);
        dma.d(var12 - -1, 1 + var13, var9 - (-var5 - -2), var10 + (var6 - 2), ((rbb) this).field_b);
        int discarded$1 = ((rbb) this).field_p.a(param3, var12 + ((rbb) this).field_h, ((rbb) this).field_u + var13, var9, var10, ((rbb) this).field_t, -1, 0, 0, var7);
    }

    public static void b(byte param0) {
        if (param0 != -29) {
            return;
        }
        field_k = null;
    }

    final void a(byte param0) {
        bia.a((byte) 124);
        if (param0 < 82) {
            rbb.b((byte) 6);
        }
    }

    final void a(byte param0, String param1, int param2, int param3) {
        if (param0 != 27) {
            ((rbb) this).field_s = -7;
        }
        if (!((rbb) this).field_f) {
            this.a(param3, 3, param1, param2);
        } else {
            this.a(true, param2, param3, param1);
        }
    }

    private final void a(int param0, int param1, String param2, int param3) {
        int var5 = ((rbb) this).field_p.b(param2);
        int var6 = ((rbb) this).field_p.field_A + ((rbb) this).field_p.field_o;
        int var7 = param3;
        if (!(var5 + var7 - -6 <= dma.field_g)) {
            var7 = -6 + (-var5 + dma.field_g);
        }
        int var8 = 32 + -((rbb) this).field_p.field_o + param0;
        if (dma.field_j < 6 + var6 + var8) {
            var8 = dma.field_j + -var6 + -6;
        }
        dma.b(var7, var8, var5 - -6, var6 - -6, ((rbb) this).field_t);
        dma.d(1 + var7, 1 + var8, var5 - -4, 4 + var6, ((rbb) this).field_b);
        ((rbb) this).field_p.c(param2, var7 + 3, ((rbb) this).field_p.field_o + param1 + var8, ((rbb) this).field_t, -1);
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        if (param1 <= 103) {
            ((rbb) this).field_b = -4;
        }
        qca.a(param2, param0, param4, true, param3);
    }

    final void a(no param0, int param1) {
        int var7_int = 0;
        int var15 = VoidHunters.field_G;
        bob var17 = new bob(param0, 2, 2, 2236962, 1, 1, 1, 2 + param0.field_A + param0.field_k);
        var17.field_i = 16777215;
        ((rbb) this).field_n = (wwa) (Object) var17;
        uea var4 = new uea();
        var17.a(param1 + 24639, (bob) (Object) var4);
        ((rbb) this).field_t = 15658734;
        ((rbb) this).field_b = 5592405;
        var4.field_a = 15658734;
        ((rbb) this).field_p = param0;
        ((rbb) this).field_h = 3;
        ((rbb) this).field_m = 15658734;
        ((rbb) this).field_g = -1;
        var4.field_b = 11711154;
        ((rbb) this).field_j = 3;
        ((rbb) this).field_c = 3;
        ((rbb) this).field_u = 3;
        vv discarded$16 = var4.a(0, -1).b(15658734, -2147483648).a(true, vdb.a(10066329, 8947848, 117, 7829367));
        if (param1 != -24763) {
            ((rbb) this).a(99, (byte) 19, 39, -32, 64);
        }
        vv discarded$17 = var4.a(1, -1).a(true, vdb.a(10066329, 11184810, 118, 13421772));
        vv discarded$18 = var4.a(3, -1).a(true, vdb.a(7829367, 8947848, 123, 10066329)).a(113, 1).b(1, false);
        phb[] var5 = new phb[9];
        jva var16 = new jva(32, 32);
        jva var18 = var16;
        for (var7_int = 0; var18.field_r.length > var7_int; var7_int++) {
            var16.field_r[var7_int] = 1077952576;
        }
        var5[4] = (phb) (Object) var18;
        vv discarded$19 = var4.a(4, -1).a(-123, true).a(true, var5);
        vv discarded$20 = var4.a(5, -1).a(true, ra.a(0, (byte) 119, 0, 65793, 0)).a(param1 + 24638, true).b(-1, param1 + -2147458885);
        ((rbb) this).field_a = (wwa) (Object) var4;
        uea var6 = new uea(var4, true);
        var6.field_c = 0;
        uea var7 = new uea(var4, true);
        var7.field_c = 0;
        var7.a(prb.a(true, 8947848), (byte) -54);
        vv discarded$21 = var7.a(1, -1).a(true, prb.a(true, 11184810)).b(2236962, -2147483648);
        ((rbb) this).field_d = (wwa) (Object) new uv(param0, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924);
        ei discarded$22 = new ei(param0, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
        jba discarded$23 = new jba(param0, 16777215, -1, 125269879, 4473924, 3, 268435455);
        uea var8 = new uea();
        var17.a(-122, (bob) (Object) var8);
        vv discarded$24 = var8.a(0, -1).a(true, vdb.a(7829367, 15658734, param1 + 24884, 10066329)).b(1118481, -2147483648).c(-1, param1 + -2147458885);
        vv discarded$25 = var8.a(4, -1).a(param1 + 24635, true).a(true, var5);
        ((rbb) this).field_o = (wwa) (Object) var8;
        phb[] var9 = new phb[9];
        var9[4] = new phb(2, 1);
        phb[] var10 = new phb[9];
        var10[4] = new phb(1, 2);
        var9[4].field_r = new int[]{6710886, 7829367};
        var10[4].field_r = new int[]{6710886, 7829367};
        uea var11 = new uea();
        uea var12 = new uea();
        var11.a(0, var9, 15486);
        var12.a(0, var10, param1 ^ -23749);
        ((rbb) this).field_l = (wwa) (Object) var4;
        ((rbb) this).field_e = (wwa) (Object) var12;
        phb var13 = new phb(7, 4);
        ((rbb) this).field_s = 10;
        var13.field_r = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
        uea var14 = new uea(var4, true);
        var14.a(param1 ^ -7799, var13.d());
        var13.c();
        var14 = new uea(var4, true);
        var14.a(32460, var13.d());
        var13.c();
        var14 = new uea(var4, true);
        var14.a(32460, var13.d());
        var13.c();
        uea var19 = new uea(var4, true);
        var19.a(32460, var13);
    }

    public rbb() {
        ((rbb) this).field_f = true;
    }

    static {
    }
}
