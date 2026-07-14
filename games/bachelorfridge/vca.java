/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vca extends bw {
    static sna field_h;
    private int field_k;
    private int field_o;
    private int field_j;
    private kv field_g;
    static String field_i;
    static String field_m;
    static String[] field_f;
    private int field_l;
    private int field_n;

    public static void a(int param0) {
        field_f = null;
        field_i = null;
        field_m = null;
        field_h = null;
        if (param0 != 488250252) {
            field_i = null;
        }
    }

    final boolean c(byte param0) {
        int var2 = 11 % ((param0 - 76) / 48);
        return ((vca) this).field_l < ((vca) this).field_g.field_p + 20 ? true : false;
    }

    final static void c(boolean param0) {
        if (!param0) {
            vca.c(true);
            pla.field_g = f.b((byte) 73);
            qla.field_f = 0;
            return;
        }
        pla.field_g = f.b((byte) 73);
        qla.field_f = 0;
    }

    private final void a(int param0, int param1, int param2, String param3, po param4) {
        int var8 = 0;
        int var9 = 0;
        kv var10 = null;
        int var6 = 2 + (param4.a(param3) - -(param3.length() * 4));
        int var7 = 8 + (param4.field_B + param4.field_u - -2);
        ((vca) this).field_g = new kv(var6, var7);
        bu.a(0, ((vca) this).field_g);
        ce.a(true, param0, 1 + param4.field_u, param3, 1, true);
        db.b(119);
        ((vca) this).field_g.f((param0 & 16579836) >> -786958142);
        if ((param1 ^ -1) != param2) {
            var8 = var6;
            var9 = var7;
            var10 = new kv(var8, var9);
            bu.a(0, var10);
            ((vca) this).field_g.c(0, 0, var8, var9);
            db.b(111);
            ((vca) this).field_g = var10;
        }
    }

    vca(po param0, String param1, int param2, int param3, int param4, int param5) {
        this(param0, param1, param2, 4096, param3, param4, param5);
    }

    final void a(int param0, int param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (((vca) this).field_l >= ((vca) this).field_n) {
          if (((vca) this).field_n - -((vca) this).field_o > ((vca) this).field_l) {
            ((vca) this).field_g.e(param1 - (((vca) this).field_g.field_q >> 701408865), -(((vca) this).field_g.field_p >> -1190990303) + -20 + (param0 + ((vca) this).field_j));
            return;
          } else {
            var4 = -((vca) this).field_n + (((vca) this).field_l + -((vca) this).field_o);
            var5 = (-var4 + ((vca) this).field_k << 411042152) / ((vca) this).field_k;
            if (!param2) {
              var6 = 40 * var4 / ((vca) this).field_k;
              if (-1 <= (var5 ^ -1)) {
                return;
              } else {
                ((vca) this).field_g.a(-(((vca) this).field_g.field_q >> 493905217) + param1, -(((vca) this).field_g.field_p >> 150929857) + (((vca) this).field_j - -param0 - (20 - -var6)), var5);
                return;
              }
            } else {
              return;
            }
          }
        } else {
          L0: {
            var4 = (((vca) this).field_l << 2077698024) / ((vca) this).field_n;
            var5 = (-((vca) this).field_l + ((vca) this).field_n) * 160 / ((vca) this).field_n;
            if (((vca) this).field_n - 5 > ((vca) this).field_l) {
              var6 = 4608 * ((vca) this).field_l / (((vca) this).field_n + -5);
              break L0;
            } else {
              var6 = (-((vca) this).field_l + (-5 + ((vca) this).field_n)) * 512 / (-5 + ((vca) this).field_n) + 4608;
              break L0;
            }
          }
          L1: {
            if (((vca) this).field_n + -5 > ((vca) this).field_l) {
              break L1;
            } else {
              var6 = (-10 + (-((vca) this).field_l + ((vca) this).field_n * 2) << -34683220) / (((vca) this).field_n - 10);
              break L1;
            }
          }
          var7 = ((vca) this).field_g.field_q * var6 >> 488250252;
          var8 = ((vca) this).field_g.field_p * var6 >> -1737017556;
          ((vca) this).field_g.c(-(var7 >> -633829535) + param1, (var5 >> 2062600996) + ((vca) this).field_j + (param0 - (20 - -(var8 >> 1084818497))), var7, var8, var4);
          return;
        }
    }

    final boolean b(boolean param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0) {
          L0: {
            ((vca) this).field_j = 42;
            ((vca) this).field_l = ((vca) this).field_l + 1;
            if (((vca) this).field_k + (((vca) this).field_n + ((vca) this).field_o) >= ((vca) this).field_l + 1) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            ((vca) this).field_l = ((vca) this).field_l + 1;
            if (((vca) this).field_k + (((vca) this).field_n + ((vca) this).field_o) >= ((vca) this).field_l + 1) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    private vca(po param0, String param1, int param2, int param3, int param4, int param5, int param6) {
        ((vca) this).field_o = param5;
        ((vca) this).field_k = param6;
        ((vca) this).field_l = 0;
        ((vca) this).field_n = param4;
        this.a(param2, param3, -4097, param1, param0);
    }

    vca(po param0, String param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((vca) this).field_o = param5;
        ((vca) this).field_j = param7;
        ((vca) this).field_k = param6;
        ((vca) this).field_n = param4;
        ((vca) this).field_l = 0;
        this.a(param2, param3, -4097, param1, param0);
    }

    vca(kv param0, int param1, int param2, int param3) {
        ((vca) this).field_n = param1;
        ((vca) this).field_g = param0;
        ((vca) this).field_o = param2;
        ((vca) this).field_l = 0;
        ((vca) this).field_k = param3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new String[]{"Bakery", "Meat", "Fish", "Dairy", "Fruit n Veg", "Drinks", "Ready Meal", "Misc"};
        field_i = "achievements to collect";
        field_m = "Invite <%0> to this game";
    }
}
