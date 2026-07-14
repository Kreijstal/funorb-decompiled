/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aj {
    j field_h;
    mg field_k;
    static int[] field_o;
    int field_e;
    static byte[] field_t;
    int field_b;
    int field_q;
    j field_i;
    static int[] field_m;
    j field_r;
    static String[] field_s;
    private boolean field_c;
    private int field_l;
    j field_a;
    int field_d;
    static int field_p;
    int field_f;
    static int field_u;
    int field_j;
    int field_n;
    j field_g;

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param4 != 1) {
            return;
        }
        mi.a(param6, param0, param2, param5, param3, param1);
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
          var15 = SolKnight.field_L ? 1 : 0;
          var5 = ((aj) this).field_j + ((aj) this).field_d;
          var6 = ((aj) this).field_e - -((aj) this).field_q;
          var7 = ((aj) this).field_f;
          if (0 != (var7 ^ -1)) {
            break L0;
          } else {
            var7 = ((aj) this).field_k.field_s + ((aj) this).field_k.field_F;
            break L0;
          }
        }
        L1: {
          L2: {
            var8 = mi.field_a >> -1653419774;
            var9 = ((aj) this).field_k.b(param1);
            var10 = ((aj) this).field_k.field_F + ((aj) this).field_k.field_s;
            var11 = 1;
            if (var9 > var8) {
              break L2;
            } else {
              if (0 == (param1.indexOf("<br>") ^ -1)) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          L3: {
            if (null != kb.field_c) {
              break L3;
            } else {
              kb.field_c = new String[16];
              break L3;
            }
          }
          L4: {
            if (var8 < var9) {
              var13 = var9 / var8;
              var12 = var8 + 2 * ((-1 + (var9 % var8 - -var13)) / var13);
              break L4;
            } else {
              var12 = var8;
              break L4;
            }
          }
          var11 = ((aj) this).field_k.a(param1, new int[1], kb.field_c);
          var9 = 0;
          var10 = var10 + var7 * (var11 - 1);
          var13 = 0;
          L5: while (true) {
            if (var11 <= var13) {
              break L1;
            } else {
              var14 = ((aj) this).field_k.b(kb.field_c[var13]);
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
          var12 = param2;
          if (var5 + (var9 + var12) <= mi.field_a) {
            break L6;
          } else {
            var12 = -var9 + mi.field_a + -var5;
            break L6;
          }
        }
        L7: {
          if (param3 == 5101) {
            break L7;
          } else {
            field_m = null;
            break L7;
          }
        }
        L8: {
          var13 = -((aj) this).field_k.field_m + param0 - -32;
          if (mi.field_d < var13 - (-var10 - var6)) {
            var13 = -var6 + (param0 - var10);
            break L8;
          } else {
            break L8;
          }
        }
        mi.g(var12, var13, var9 - -var5, var10 - -var6, ((aj) this).field_b);
        mi.b(1 + var12, 1 + var13, var5 + (var9 - 2), -2 + (var6 + var10), ((aj) this).field_n);
        int discarded$1 = ((aj) this).field_k.a(param1, var12 - -((aj) this).field_j, ((aj) this).field_e + var13, var9, var10, ((aj) this).field_l, -1, 0, 0, var7);
    }

    private final void a(byte param0, int param1, String param2, int param3) {
        int var5 = ((aj) this).field_k.b(param2);
        int var6 = ((aj) this).field_k.field_m - -((aj) this).field_k.field_s;
        int var7 = param3;
        if (!(mi.field_a >= var7 + (var5 + 6))) {
            var7 = -6 + -var5 + mi.field_a;
        }
        int var8 = -((aj) this).field_k.field_m + (param1 - -32);
        if (!(var8 + (var6 - -6) <= mi.field_d)) {
            var8 = -var6 + mi.field_d + -6;
        }
        if (param0 > -99) {
            return;
        }
        mi.g(var7, var8, 6 + var5, var6 - -6, ((aj) this).field_l);
        mi.b(var7 + 1, 1 + var8, var5 - -4, 4 + var6, ((aj) this).field_n);
        ((aj) this).field_k.c(param2, var7 + 3, ((aj) this).field_k.field_m + var8 + 3, ((aj) this).field_l, -1);
    }

    final void a(int param0, int param1, int param2, String param3) {
        int var5 = 4 / ((-41 - param0) / 55);
        if (!((aj) this).field_c) {
            this.a((byte) -123, param1, param3, param2);
        } else {
            this.a(param1, param3, param2, 5101);
        }
    }

    final void a(byte param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = 126 % ((param0 - 40) / 51);
        mi.e(param3, param1, param5, param2, param4);
    }

    final void a(int param0, mg param1) {
        int var7_int = 0;
        int var15 = SolKnight.field_L ? 1 : 0;
        af var18 = new af(param1, 2, 2, 2236962, 1, 1, 1, param1.field_s + param1.field_F + 2);
        ((aj) this).field_a = (j) (Object) var18;
        var18.field_o = 16777215;
        ql var4 = new ql();
        var18.a((af) (Object) var4, 6935);
        if (param0 <= 59) {
            Object var16 = null;
            ((aj) this).a(-106, 26, -13, (String) null);
        }
        ((aj) this).field_k = param1;
        ((aj) this).field_f = -1;
        ((aj) this).field_n = 5592405;
        var4.field_e = 11711154;
        ((aj) this).field_j = 3;
        var4.field_m = 15658734;
        ((aj) this).field_b = 15658734;
        ((aj) this).field_e = 3;
        ((aj) this).field_d = 3;
        ((aj) this).field_q = 3;
        ((aj) this).field_l = 15658734;
        bf discarded$0 = var4.a((byte) -80, 0).d(-126, 15658734).a(mb.a(8947848, 10066329, 120, 7829367), (byte) 119);
        bf discarded$1 = var4.a((byte) -68, 1).a(mb.a(11184810, 10066329, 114, 13421772), (byte) 119);
        bf discarded$2 = var4.a((byte) -39, 3).a(mb.a(8947848, 7829367, 93, 10066329), (byte) 119).b(1, -119).a(1, (byte) 85);
        o[] var5 = new o[9];
        ui var17 = new ui(32, 32);
        ui var19 = var17;
        for (var7_int = 0; var7_int < var19.field_v.length; var7_int++) {
            var17.field_v[var7_int] = 1077952576;
        }
        var5[4] = (o) (Object) var19;
        bf discarded$3 = var4.a((byte) -85, 4).a(0, true).a(var5, (byte) 119);
        bf discarded$4 = var4.a((byte) -38, 5).a(je.a(0, (byte) -124, 65793, 0, 0), (byte) 119).a(0, true).d(-123, -1);
        ((aj) this).field_i = (j) (Object) var4;
        ql var6 = new ql(var4, true);
        var6.field_g = 0;
        ql var7 = new ql(var4, true);
        var7.field_g = 0;
        var7.a((byte) -94, ha.a(8947848, 118));
        bf discarded$5 = var7.a((byte) -80, 1).a(ha.a(11184810, -96), (byte) 119).d(-128, 2236962);
        ((aj) this).field_r = (j) (Object) new td(param1, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924);
        we discarded$6 = new we(param1, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
        sj discarded$7 = new sj(param1, 16777215, -1, 125269879, 4473924, 3, 268435455);
        ql var8 = new ql();
        var18.a((af) (Object) var8, 6935);
        bf discarded$8 = var8.a((byte) -56, 0).a(mb.a(15658734, 7829367, 126, 10066329), (byte) 119).d(-120, 1118481).a(-1, 256);
        bf discarded$9 = var8.a((byte) -85, 4).a(0, true).a(var5, (byte) 119);
        ((aj) this).field_h = (j) (Object) var8;
        o[] var9 = new o[9];
        var9[4] = new o(2, 1);
        o[] var10 = new o[9];
        var10[4] = new o(1, 2);
        var9[4].field_v = new int[]{6710886, 7829367};
        var10[4].field_v = new int[]{6710886, 7829367};
        ql var11 = new ql();
        ql var12 = new ql();
        var11.a((byte) -60, 0, var9);
        var12.a((byte) -60, 0, var10);
        o var13 = new o(7, 4);
        var13.field_v = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
        ql var14 = new ql(var4, true);
        var14.a((byte) 103, var13.c());
        var13.e();
        var14 = new ql(var4, true);
        var14.a((byte) -93, var13.c());
        var13.e();
        var14 = new ql(var4, true);
        var14.a((byte) -86, var13.c());
        var13.e();
        ql var20 = new ql(var4, true);
        var20.a((byte) 94, var13);
    }

    public static void a(byte param0) {
        field_s = null;
        field_m = null;
        field_t = null;
        if (param0 > -5) {
            field_o = null;
        }
        field_o = null;
    }

    public aj() {
        ((aj) this).field_c = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new int[8192];
        field_m = new int[12];
        field_s = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
        field_t = new byte[520];
    }
}
