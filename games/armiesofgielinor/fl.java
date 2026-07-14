/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl {
    int field_s;
    int field_d;
    kh field_i;
    private int field_v;
    int field_x;
    ka field_m;
    static h field_u;
    kh field_j;
    static int field_e;
    kh field_k;
    int field_c;
    int field_a;
    private boolean field_g;
    int field_n;
    kh field_w;
    kh field_t;
    int field_h;
    int field_b;
    int field_o;
    kh field_p;
    static String field_l;
    int field_r;
    kh field_q;
    static int[] field_f;

    final static void a(ha param0, int param1) {
        if (param1 >= -107) {
            field_f = null;
        }
        hf.a(param0, (byte) 9, true);
    }

    final void a(int param0, int param1, int param2, byte param3, int param4, int param5) {
        if (param3 < 44) {
            ((fl) this).a(69, 37, 82, 84, -66);
        }
        qn.h(param2, param4, param5, param1, param0);
    }

    private final void a(int param0, int param1, int param2, String param3) {
        int var5 = ((fl) this).field_m.a(param3);
        int var6 = ((fl) this).field_m.field_z + ((fl) this).field_m.field_L;
        int var7 = param1;
        if (var5 + (var7 - param0) > qn.field_l) {
            var7 = -6 + -var5 + qn.field_l;
        }
        int var8 = 32 + (param2 - ((fl) this).field_m.field_z);
        if (qn.field_g < var6 + (var8 + 6)) {
            var8 = -6 + -var6 + qn.field_g;
        }
        qn.b(var7, var8, 6 + var5, var6 + 6, ((fl) this).field_v);
        qn.f(1 + var7, 1 + var8, 4 + var5, var6 + 4, ((fl) this).field_c);
        ((fl) this).field_m.b(param3, var7 + 3, ((fl) this).field_m.field_z + var8 - -3, ((fl) this).field_v, -1);
    }

    public static void a(byte param0) {
        field_f = null;
        field_u = null;
        if (param0 <= 75) {
            Object var2 = null;
            fl.a((ha) null, -110);
        }
        field_l = null;
    }

    final void a(int param0, int param1, String param2, int param3) {
        if (((fl) this).field_g) {
            this.a(true, param0, param3, param2);
        } else {
            this.a(-6, param3, param0, param2);
        }
        if (param1 >= -99) {
            ((fl) this).field_d = 107;
        }
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
          var15 = ArmiesOfGielinor.field_M ? 1 : 0;
          var5 = ((fl) this).field_r + ((fl) this).field_x;
          var6 = ((fl) this).field_d + ((fl) this).field_h;
          var7 = ((fl) this).field_o;
          if ((var7 ^ -1) != 0) {
            break L0;
          } else {
            var7 = ((fl) this).field_m.field_H + ((fl) this).field_m.field_L;
            break L0;
          }
        }
        L1: {
          L2: {
            var8 = qn.field_l >> -1638260958;
            var9 = ((fl) this).field_m.a(param3);
            var10 = ((fl) this).field_m.field_L + ((fl) this).field_m.field_H;
            var11 = 1;
            if (var9 > var8) {
              break L2;
            } else {
              if ((param3.indexOf("<br>") ^ -1) != 0) {
                break L2;
              } else {
                break L1;
              }
            }
          }
          L3: {
            if (null != tt.field_a) {
              break L3;
            } else {
              tt.field_a = new String[16];
              break L3;
            }
          }
          L4: {
            if (var8 >= var9) {
              var12 = var8;
              break L4;
            } else {
              var13 = var9 / var8;
              var12 = var8 - -((-1 + var9 % var8 + var13) / var13 * 2);
              break L4;
            }
          }
          var11 = ((fl) this).field_m.a(param3, new int[1], tt.field_a);
          var10 = var10 + (-1 + var11) * var7;
          var9 = 0;
          var13 = 0;
          L5: while (true) {
            if (var11 <= var13) {
              break L1;
            } else {
              var14 = ((fl) this).field_m.a(tt.field_a[var13]);
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
          if (qn.field_l >= var5 + var9 + var12) {
            break L6;
          } else {
            var12 = -var5 + (qn.field_l + -var9);
            break L6;
          }
        }
        L7: {
          if (param0) {
            break L7;
          } else {
            ((fl) this).field_w = null;
            break L7;
          }
        }
        L8: {
          var13 = 32 + param1 - ((fl) this).field_m.field_z;
          if (qn.field_g < var6 + var13 - -var10) {
            var13 = -var10 + (param1 + -var6);
            break L8;
          } else {
            break L8;
          }
        }
        qn.b(var12, var13, var9 - -var5, var10 + var6, ((fl) this).field_s);
        qn.f(var12 - -1, 1 + var13, var5 + (var9 + -2), -2 + (var10 + var6), ((fl) this).field_c);
        int discarded$1 = ((fl) this).field_m.a(param3, var12 + ((fl) this).field_x, ((fl) this).field_h + var13, var9, var10, ((fl) this).field_v, -1, 0, 0, var7);
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        id.a(param4, param1, param0, param2, (byte) 83);
        int var6 = 26 / ((param3 - -48) / 53);
    }

    final void a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6) {
        qn.b(param1, param2, param5, param4, param6, param0);
        if (!param3) {
            fl.a((byte) 3);
        }
    }

    final void a(int param0) {
        rf.b(-18862);
        if (param0 < 15) {
            field_l = null;
        }
    }

    final void a(int param0, ka param1) {
        int var7_int = 0;
        int var15 = ArmiesOfGielinor.field_M ? 1 : 0;
        lk var17 = new lk(param1, 2, 2, 2236962, 1, 1, 1, param1.field_L + (param1.field_H - -2));
        ((fl) this).field_t = (kh) (Object) var17;
        var17.field_d = 16777215;
        ao var4 = new ao();
        var17.a((lk) (Object) var4, 24978);
        ((fl) this).field_o = -1;
        ((fl) this).field_x = 3;
        ((fl) this).field_h = 3;
        ((fl) this).field_m = param1;
        var4.field_l = 11711154;
        ((fl) this).field_s = 15658734;
        ((fl) this).field_d = 3;
        ((fl) this).field_c = 5592405;
        ((fl) this).field_v = 15658734;
        ((fl) this).field_r = 3;
        var4.field_o = 15658734;
        ip discarded$0 = var4.a(0, (byte) -102).a(15658734, (byte) -108).a(ue.a(10066329, 8947848, 1, 7829367), 53);
        ip discarded$1 = var4.a(1, (byte) -119).a(ue.a(10066329, 11184810, 1, 13421772), 31);
        ip discarded$2 = var4.a(3, (byte) -128).a(ue.a(7829367, 8947848, 1, 10066329), -128).a(1, 1).a((byte) 81, 1);
        wk[] var5 = new wk[9];
        nj var16 = new nj(32, 32);
        nj var18 = var16;
        for (var7_int = 0; var7_int < var18.field_B.length; var7_int++) {
            var16.field_B[var7_int] = 1077952576;
        }
        var5[4] = (wk) (Object) var18;
        ip discarded$3 = var4.a(4, (byte) -105).a(true, (byte) 66).a(var5, param0 + -13421900);
        ip discarded$4 = var4.a(5, (byte) -113).a(mg.a(65793, 0, (byte) -125, 0, 0), -126).a(true, (byte) 121).a(-1, (byte) -109);
        ((fl) this).field_j = (kh) (Object) var4;
        ao var6 = new ao(var4, true);
        var6.field_n = 0;
        ao var7 = new ao(var4, true);
        var7.field_n = 0;
        var7.a(-128, ak.b(8947848, 5));
        ip discarded$5 = var7.a(1, (byte) -85).a(ak.b(11184810, 5), 67).a(2236962, (byte) -127);
        ((fl) this).field_i = (kh) (Object) new tk(param1, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924);
        or discarded$6 = new or(param1, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
        kp discarded$7 = new kp(param1, 16777215, -1, 125269879, 4473924, 3, 268435455);
        ao var8 = new ao();
        var17.a((lk) (Object) var8, param0 ^ 13413726);
        ip discarded$8 = var8.a(0, (byte) -128).a(ue.a(7829367, 15658734, param0 ^ 13421773, 10066329), 36).a(1118481, (byte) 27).b(-1, param0 ^ 13421751);
        ip discarded$9 = var8.a(4, (byte) -108).a(true, (byte) 104).a(var5, -126);
        ((fl) this).field_w = (kh) (Object) var8;
        wk[] var9 = new wk[9];
        wk[] var10 = new wk[9];
        var9[4] = new wk(2, 1);
        var10[4] = new wk(1, 2);
        var9[4].field_B = new int[]{6710886, 7829367};
        var10[4].field_B = new int[]{6710886, 7829367};
        ao var11 = new ao();
        ao var12 = new ao();
        var11.a(var9, 0, param0 + -13421779);
        var12.a(var10, 0, param0 + -13421779);
        ((fl) this).field_k = (kh) (Object) var12;
        ((fl) this).field_p = (kh) (Object) var4;
        wk var13 = new wk(7, 4);
        var13.field_B = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, param0, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
        ((fl) this).field_a = 10;
        ao var14 = new ao(var4, true);
        var14.a(0, var13.g());
        var13.d();
        var14 = new ao(var4, true);
        var14.a(0, var13.g());
        var13.d();
        var14 = new ao(var4, true);
        var14.a(0, var13.g());
        var13.d();
        ao var19 = new ao(var4, true);
        var19.a(0, var13);
    }

    public fl() {
        ((fl) this).field_g = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = new h(2);
        field_l = "Join";
        field_f = new int[8192];
    }
}
