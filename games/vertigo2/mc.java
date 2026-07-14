/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mc {
    int field_a;
    int field_l;
    ur field_p;
    int field_b;
    int field_r;
    int field_d;
    ur field_g;
    private int field_j;
    int field_o;
    static nj field_i;
    int field_m;
    static String field_f;
    cc field_n;
    ur field_c;
    static int field_e;
    private boolean field_k;
    ur field_h;
    ur field_q;

    private final void a(String param0, int param1, byte param2, int param3) {
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
        int var16 = 0;
        L0: {
          var16 = Vertigo2.field_L ? 1 : 0;
          var5 = ((mc) this).field_l + ((mc) this).field_m;
          var6 = ((mc) this).field_r + ((mc) this).field_a;
          var7 = ((mc) this).field_o;
          if (0 == (var7 ^ -1)) {
            var7 = ((mc) this).field_n.field_z + ((mc) this).field_n.field_M;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          L2: {
            var10 = -33 / ((-35 - param2) / 50);
            var8 = bi.field_e >> 484102306;
            var9 = ((mc) this).field_n.c(param0);
            var11 = ((mc) this).field_n.field_M + ((mc) this).field_n.field_z;
            var12 = 1;
            if (var9 > var8) {
              break L2;
            } else {
              if (param0.indexOf("<br>") != -1) {
                break L2;
              } else {
                break L1;
              }
            }
          }
          L3: {
            if (null != vo.field_u) {
              break L3;
            } else {
              vo.field_u = new String[16];
              break L3;
            }
          }
          L4: {
            if (var9 > var8) {
              var14 = var9 / var8;
              var13 = (-1 + var9 % var8 - -var14) / var14 * 2 + var8;
              break L4;
            } else {
              var13 = var8;
              break L4;
            }
          }
          var12 = ((mc) this).field_n.a(param0, new int[1], vo.field_u);
          var11 = var11 + var7 * (-1 + var12);
          var9 = 0;
          var14 = 0;
          L5: while (true) {
            if (var14 >= var12) {
              break L1;
            } else {
              var15 = ((mc) this).field_n.c(vo.field_u[var14]);
              if (var9 < var15) {
                var9 = var15;
                var14++;
                continue L5;
              } else {
                var14++;
                continue L5;
              }
            }
          }
        }
        L6: {
          var13 = param1;
          if (var9 + var13 + var5 <= bi.field_e) {
            break L6;
          } else {
            var13 = bi.field_e + -var9 - var5;
            break L6;
          }
        }
        L7: {
          var14 = 32 + (param3 + -((mc) this).field_n.field_t);
          if (var14 + (var11 + var6) > bi.field_j) {
            var14 = -var6 + -var11 + param3;
            break L7;
          } else {
            break L7;
          }
        }
        bi.e(var13, var14, var9 + var5, var11 + var6, ((mc) this).field_b);
        bi.b(1 + var13, 1 + var14, -2 + (var5 + var9), var11 - (-var6 - -2), ((mc) this).field_d);
        int discarded$1 = ((mc) this).field_n.a(param0, ((mc) this).field_m + var13, ((mc) this).field_r + var14, var9, var11, ((mc) this).field_j, -1, 0, 0, var7);
    }

    private final void a(int param0, String param1, int param2, byte param3) {
        int var5 = ((mc) this).field_n.c(param1);
        int var6 = ((mc) this).field_n.field_M + ((mc) this).field_n.field_t;
        int var7 = param0;
        if (param3 < 115) {
            ((mc) this).field_p = null;
        }
        if (bi.field_e < var7 + (var5 + 6)) {
            var7 = -var5 + (bi.field_e - 6);
        }
        int var8 = -((mc) this).field_n.field_t + param2 - -32;
        if (!(6 + var6 + var8 <= bi.field_j)) {
            var8 = -var6 + (bi.field_j + -6);
        }
        bi.e(var7, var8, 6 + var5, var6 - -6, ((mc) this).field_j);
        bi.b(var7 - -1, 1 + var8, 4 + var5, var6 - -4, ((mc) this).field_d);
        ((mc) this).field_n.b(param1, var7 - -3, ((mc) this).field_n.field_t + var8 + 3, ((mc) this).field_j, -1);
    }

    public static void a(int param0) {
        field_f = null;
        field_i = null;
        if (param0 > -61) {
            field_e = 60;
        }
    }

    final void a(cc param0, int param1) {
        int var7_int = 0;
        int var15 = Vertigo2.field_L ? 1 : 0;
        va var17 = new va(param0, 2, 2, 2236962, 1, 1, 1, param0.field_M + (param0.field_z + 2));
        ((mc) this).field_h = (ur) (Object) var17;
        var17.field_e = 16777215;
        mq var4 = new mq();
        if (param1 != -2) {
            ((mc) this).field_b = -17;
        }
        var17.a(16777215, (va) (Object) var4);
        ((mc) this).field_d = 5592405;
        ((mc) this).field_o = -1;
        ((mc) this).field_j = 15658734;
        ((mc) this).field_r = 3;
        var4.field_a = 11711154;
        var4.field_p = 15658734;
        ((mc) this).field_b = 15658734;
        ((mc) this).field_m = 3;
        ((mc) this).field_n = param0;
        ((mc) this).field_l = 3;
        ((mc) this).field_a = 3;
        e discarded$0 = var4.a(0, 6216).a((byte) -59, 15658734).a(-115, wp.a(10066329, (byte) 75, 7829367, 8947848));
        e discarded$1 = var4.a(1, 6216).a(param1 + -115, wp.a(10066329, (byte) 120, 13421772, 11184810));
        e discarded$2 = var4.a(3, 6216).a(-121, wp.a(7829367, (byte) 77, 10066329, 8947848)).c(param1 ^ 32350, 1).a(97, 1);
        er[] var5 = new er[9];
        fe var16 = new fe(32, 32);
        fe var18 = var16;
        for (var7_int = 0; var7_int < var18.field_F.length; var7_int++) {
            var16.field_F[var7_int] = 1077952576;
        }
        var5[4] = (er) (Object) var18;
        e discarded$3 = var4.a(4, 6216).a(true, -107).a(param1 ^ 127, var5);
        e discarded$4 = var4.a(5, 6216).a(-114, gb.a(0, 65793, 0, param1 ^ -28292, 0)).a(true, param1 ^ 90).a((byte) -68, -1);
        ((mc) this).field_p = (ur) (Object) var4;
        mq var6 = new mq(var4, true);
        var6.field_m = 0;
        mq var7 = new mq(var4, true);
        var7.field_m = 0;
        var7.a(an.a(-105, 8947848), (byte) 62);
        e discarded$5 = var7.a(1, 6216).a(-124, an.a(-115, 11184810)).a((byte) -105, 2236962);
        ((mc) this).field_g = (ur) (Object) new kn(param0, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924);
        td discarded$6 = new td(param0, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
        jo discarded$7 = new jo(param0, 16777215, -1, 125269879, 4473924, 3, 268435455);
        mq var8 = new mq();
        var17.a(16777215, (va) (Object) var8);
        e discarded$8 = var8.a(0, param1 + 6218).a(param1 + -119, wp.a(7829367, (byte) 118, 10066329, 15658734)).a((byte) -57, 1118481).b(-1, -101);
        e discarded$9 = var8.a(4, 6216).a(true, param1 + -91).a(-117, var5);
        ((mc) this).field_c = (ur) (Object) var8;
        er[] var9 = new er[9];
        er[] var10 = new er[9];
        var9[4] = new er(2, 1);
        var10[4] = new er(1, 2);
        var9[4].field_F = new int[]{6710886, 7829367};
        var10[4].field_F = new int[]{6710886, 7829367};
        mq var11 = new mq();
        mq var12 = new mq();
        var11.a(0, var9, false);
        var12.a(0, var10, false);
        er var13 = new er(7, 4);
        var13.field_F = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
        mq var14 = new mq(var4, true);
        var14.a((byte) 73, var13.c());
        var13.b();
        var14 = new mq(var4, true);
        var14.a((byte) -90, var13.c());
        var13.b();
        var14 = new mq(var4, true);
        var14.a((byte) -87, var13.c());
        var13.b();
        mq var19 = new mq(var4, true);
        var19.a((byte) 44, var13);
    }

    final void a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6) {
        if (param1 > -68) {
            ((mc) this).a(-70, 47, -40, -101, 33, 6);
        }
        bi.b(param5, param2, param6, param0, param3, param4);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        bi.a(param3, param4, param0, param1, param2);
        if (param5 < 79) {
            u discarded$0 = mc.a((byte) -78);
        }
    }

    final static u a(byte param0) {
        u var1 = new u(ql.field_M, vj.field_c, ca.field_a[0], pc.field_a[0], mh.field_c[0], vi.field_w[0], se.field_y[0], in.field_c);
        if (param0 != 9) {
            return null;
        }
        la.a((byte) 116);
        return var1;
    }

    final void a(String param0, int param1, int param2, int param3) {
        if (((mc) this).field_k) {
            this.a(param0, param2, (byte) 100, param3);
        } else {
            this.a(param2, param0, param3, (byte) 116);
        }
        if (param1 >= -1) {
            ((mc) this).field_n = null;
        }
    }

    public mc() {
        ((mc) this).field_k = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "<col=DE9200>time:</col> <%0>";
        field_i = new nj();
    }
}
