/*
 * Decompiled by CFR-JS 0.4.0.
 */
class wh extends ji {
    private int field_E;
    static String field_B;
    static String field_A;
    static u[] field_F;
    static ri field_D;
    int field_C;
    int[] field_y;
    int field_z;

    final static u a(r param0, int param1, int param2, int param3) {
        if (param1 != 4080) {
            Object var5 = null;
            u discarded$0 = wh.a((r) null, 40, -33, -13);
        }
        if (!hq.a(124, param3, param2, param0)) {
            return null;
        }
        return mc.a((byte) 9);
    }

    final void a(byte param0, int param1, ed param2) {
        if (!(param1 != 0)) {
            ((wh) this).field_E = param2.a((byte) -11);
        }
        if (param0 != 110) {
            boolean discarded$0 = ((wh) this).g(-43);
        }
    }

    final int a(byte param0) {
        if (param0 != -117) {
            ((wh) this).field_C = -85;
        }
        return ((wh) this).field_E;
    }

    int[][] b(int param0, int param1) {
        int[][] var3 = null;
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[][] var12 = null;
        int[][] var13 = null;
        int[][] var14 = null;
        int[][] var15 = null;
        int[][] var16 = null;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        L0: {
          var11 = Vertigo2.field_L ? 1 : 0;
          var16 = ((wh) this).field_v.a(param1, -2);
          var15 = var16;
          var14 = var15;
          var13 = var14;
          var12 = var13;
          var3 = var12;
          if (((wh) this).field_v.field_c) {
            if (((wh) this).g(param0 ^ -27930)) {
              L1: {
                var4 = var16[0];
                var5 = var16[1];
                var6 = var16[2];
                stackOut_4_0 = ((wh) this).field_z;
                stackIn_6_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (((wh) this).field_C != aa.field_Vb) {
                  stackOut_6_0 = stackIn_6_0;
                  stackOut_6_1 = ((wh) this).field_C * param1 / aa.field_Vb;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  break L1;
                } else {
                  stackOut_5_0 = stackIn_5_0;
                  stackOut_5_1 = param1;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  break L1;
                }
              }
              var7 = stackIn_7_0 * stackIn_7_1;
              if (((wh) this).field_z != we.field_M) {
                var8 = 0;
                L2: while (true) {
                  if (var8 >= we.field_M) {
                    break L0;
                  } else {
                    var9 = var8 * ((wh) this).field_z / we.field_M;
                    var10 = ((wh) this).field_y[var9 + var7];
                    var6[var8] = b.a(var10, 255) << 705897668;
                    var5[var8] = b.a(var10, 65280) >> 888140964;
                    var4[var8] = b.a(16711680, var10) >> -1962352852;
                    var8++;
                    continue L2;
                  }
                }
              } else {
                var8 = 0;
                L3: while (true) {
                  if (var8 >= we.field_M) {
                    break L0;
                  } else {
                    var7++;
                    var9 = ((wh) this).field_y[var7];
                    var6[var8] = b.a(4080, var9 << 210777636);
                    var5[var8] = b.a(4080, var9 >> 1200750756);
                    var4[var8] = b.a(var9, 16711680) >> 1228696108;
                    var8++;
                    continue L3;
                  }
                }
              }
            } else {
              break L0;
            }
          } else {
            break L0;
          }
        }
        L4: {
          if (param0 == -3780) {
            break L4;
          } else {
            field_F = null;
            break L4;
          }
        }
        return var3;
    }

    public static void h(int param0) {
        field_F = null;
        field_B = null;
        field_D = null;
        field_A = null;
        if (param0 != 9724) {
            wh.h(21);
        }
    }

    public wh() {
        super(0, false);
        ((wh) this).field_E = -1;
    }

    final boolean g(int param0) {
        i var2 = null;
        if (null != ((wh) this).field_y) {
            return true;
        }
        if (param0 != 25562) {
            field_D = null;
        }
        if (-1 >= (((wh) this).field_E ^ -1)) {
            var2 = 0 > b.field_i ? i.a(nk.field_Hb, ((wh) this).field_E) : i.a(nk.field_Hb, b.field_i, ((wh) this).field_E);
            var2.a();
            ((wh) this).field_y = var2.d();
            ((wh) this).field_z = var2.field_h;
            ((wh) this).field_C = var2.field_i;
            return true;
        }
        return false;
    }

    final void f(int param0) {
        if (param0 != 2) {
            return;
        }
        super.f(param0 ^ 0);
        ((wh) this).field_y = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = "The account name you use to access RuneScape and other Jagex.com games";
        field_B = "Your friend list is full. Max of 100 for free users, and 200 for members.";
        field_D = null;
    }
}
