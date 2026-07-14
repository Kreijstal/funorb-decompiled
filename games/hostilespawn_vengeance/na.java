/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class na {
    int field_a;
    int field_f;
    nn field_j;
    nn field_n;
    int field_p;
    nn field_e;
    private boolean field_m;
    nn field_h;
    nn field_d;
    int field_l;
    private int field_k;
    static boolean field_b;
    static String field_q;
    int field_g;
    int field_o;
    static vm field_c;
    vm field_i;
    int field_r;

    private final void a(int param0, int param1, int param2, String param3) {
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
          var15 = HostileSpawn.field_I ? 1 : 0;
          var5 = ((na) this).field_p + ((na) this).field_g;
          var6 = ((na) this).field_l + ((na) this).field_r;
          var7 = ((na) this).field_o;
          if (var7 != -1) {
            break L0;
          } else {
            var7 = ((na) this).field_i.field_F + ((na) this).field_i.field_y;
            break L0;
          }
        }
        L1: {
          L2: {
            var8 = si.field_e >> -2101495902;
            var9 = ((na) this).field_i.a(param3);
            var10 = ((na) this).field_i.field_F + ((na) this).field_i.field_y;
            var11 = 1;
            if (var8 < var9) {
              break L2;
            } else {
              if (param3.indexOf("<br>") != -1) {
                break L2;
              } else {
                break L1;
              }
            }
          }
          L3: {
            if (var8 >= var9) {
              var12 = var8;
              break L3;
            } else {
              var13 = var9 / var8;
              var12 = var8 - -(2 * ((var13 + var9 % var8 - 1) / var13));
              break L3;
            }
          }
          L4: {
            if (null != jd.field_v) {
              break L4;
            } else {
              jd.field_v = new String[16];
              break L4;
            }
          }
          var11 = ((na) this).field_i.a(param3, new int[1], jd.field_v);
          var9 = 0;
          var10 = var10 + (-1 + var11) * var7;
          var13 = 0;
          L5: while (true) {
            if (var11 <= var13) {
              break L1;
            } else {
              var14 = ((na) this).field_i.a(jd.field_v[var13]);
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
          var12 = param1;
          if (var9 + (var12 - -var5) > si.field_e) {
            var12 = -var9 + si.field_e + -var5;
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          var13 = 32 + (param2 - ((na) this).field_i.field_N);
          if (var6 + var13 + var10 <= si.field_k) {
            break L7;
          } else {
            var13 = -var6 + param2 + -var10;
            break L7;
          }
        }
        si.a(var12, var13, var5 + var9, var10 - -var6, ((na) this).field_f);
        si.c(1 + var12, 1 + var13, var5 + (var9 - 2), -2 + var10 + var6, ((na) this).field_a);
        int discarded$1 = ((na) this).field_i.a(param3, ((na) this).field_p + var12, var13 - -((na) this).field_r, var9, var10, ((na) this).field_k, -1, param0, 0, var7);
    }

    final void a(vm param0, byte param1) {
        int var7_int = 0;
        int var15 = HostileSpawn.field_I ? 1 : 0;
        cn var17 = new cn(param0, 2, 2, 2236962, 1, 1, 1, param0.field_F + param0.field_y + 2);
        var17.field_j = 16777215;
        ((na) this).field_h = (nn) (Object) var17;
        ha var4 = new ha();
        var17.a(-33, (cn) (Object) var4);
        ((na) this).field_o = -1;
        ((na) this).field_a = 5592405;
        ((na) this).field_r = 3;
        ((na) this).field_l = 3;
        var4.field_d = 11711154;
        ((na) this).field_i = param0;
        ((na) this).field_p = 3;
        ((na) this).field_g = 3;
        ((na) this).field_k = 15658734;
        var4.field_o = 15658734;
        ((na) this).field_f = 15658734;
        gm discarded$0 = var4.a(0, true).a(15658734, true).a(false, pm.a(7829367, 8947848, (byte) -117, 10066329));
        gm discarded$1 = var4.a(1, true).a(false, pm.a(13421772, 11184810, (byte) -117, 10066329));
        gm discarded$2 = var4.a(3, true).a(false, pm.a(10066329, 8947848, (byte) -117, 7829367)).b(1, 16802).a((byte) 92, 1);
        bd[] var5 = new bd[9];
        gk var16 = new gk(32, 32);
        gk var18 = var16;
        for (var7_int = 0; var7_int < var18.field_D.length; var7_int++) {
            var16.field_D[var7_int] = 1077952576;
        }
        var5[4] = (bd) (Object) var18;
        gm discarded$3 = var4.a(4, true).a((byte) -37, true).a(false, var5);
        gm discarded$4 = var4.a(5, true).a(false, uk.a(65793, 0, (byte) 127, 0, 0)).a((byte) -128, true).a(-1, true);
        ((na) this).field_e = (nn) (Object) var4;
        ha var6 = new ha(var4, true);
        var6.field_k = 0;
        ha var7 = new ha(var4, true);
        var7.field_k = 0;
        var7.a(false, en.h(-71, 8947848));
        gm discarded$5 = var7.a(1, true).a(false, en.h(-96, 11184810)).a(2236962, true);
        ((na) this).field_n = (nn) (Object) new rf(param0, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924);
        ra discarded$6 = new ra(param0, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
        h discarded$7 = new h(param0, 16777215, -1, 125269879, 4473924, 3, 268435455);
        ha var8 = new ha();
        var17.a(-80, (cn) (Object) var8);
        gm discarded$8 = var8.a(0, true).a(false, pm.a(10066329, 15658734, (byte) -117, 7829367)).a(1118481, true).a(-2147483648, -1);
        gm discarded$9 = var8.a(4, true).a((byte) -52, true).a(false, var5);
        ((na) this).field_j = (nn) (Object) var8;
        bd[] var9 = new bd[9];
        var9[4] = new bd(2, 1);
        if (param1 <= 50) {
            ((na) this).field_i = null;
        }
        bd[] var10 = new bd[9];
        var10[4] = new bd(1, 2);
        var9[4].field_D = new int[]{6710886, 7829367};
        var10[4].field_D = new int[]{6710886, 7829367};
        ha var11 = new ha();
        ha var12 = new ha();
        var11.a(0, var9, (byte) -26);
        var12.a(0, var10, (byte) -48);
        bd var13 = new bd(7, 4);
        var13.field_D = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
        ha var14 = new ha(var4, true);
        var14.a(true, var13.h());
        var13.b();
        var14 = new ha(var4, true);
        var14.a(true, var13.h());
        var13.b();
        var14 = new ha(var4, true);
        var14.a(true, var13.h());
        var13.b();
        ha var19 = new ha(var4, true);
        var19.a(true, var13);
    }

    private final void a(int param0, int param1, String param2, byte param3) {
        int var5 = ((na) this).field_i.a(param2);
        int var6 = ((na) this).field_i.field_F + ((na) this).field_i.field_N;
        int var7 = param1;
        if (si.field_e < var7 - -var5 + 6) {
            var7 = -var5 + (si.field_e + -6);
        }
        int var8 = param0 - (((na) this).field_i.field_N - 32);
        if (6 + var6 + var8 > si.field_k) {
            var8 = -var6 + si.field_k + -6;
        }
        int var9 = 75 / ((2 - param3) / 35);
        si.a(var7, var8, 6 + var5, var6 + 6, ((na) this).field_k);
        si.c(1 + var7, 1 + var8, var5 - -4, 4 + var6, ((na) this).field_a);
        ((na) this).field_i.c(param2, var7 + 3, var8 - -3 + ((na) this).field_i.field_N, ((na) this).field_k, -1);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param6 != 11776) {
            return;
        }
        si.a(param0, param5, param1, param4, param3, param2);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        if (param0 != 1077952576) {
            return;
        }
        si.g(param3, param5, param1, param2, param4);
    }

    final void a(int param0, String param1, int param2, int param3) {
        if (((na) this).field_m) {
            this.a(0, param2, param0, param1);
        } else {
            this.a(param0, param2, param1, (byte) -54);
        }
        int var5 = 125 / ((-59 - param3) / 39);
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 < 80) {
            field_q = null;
        }
        field_q = null;
    }

    public na() {
        ((na) this).field_m = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Sound: ";
    }
}
