/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class lo {
    static byte[][][] field_c;
    int field_a;
    int field_h;
    int field_e;
    int field_b;
    int field_d;
    int field_g;
    static long field_f;

    final static sm[] a(wj param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        sm[] var4 = null;
        int var5 = 0;
        sm var6 = null;
        int var6_int = 0;
        int var7 = 0;
        Object var8 = null;
        var7 = DungeonAssault.field_K;
        var2 = param0.j(76, 8);
        if (var2 <= 0) {
          var3 = param0.j(-80, 12);
          var4 = new sm[var3];
          if (param1 >= -109) {
            L0: {
              var8 = null;
              lo.a(-66, true, (vh) null, -109, 2);
              var5 = 0;
              if (var3 <= var5) {
                break L0;
              } else {
                L1: {
                  if (jl.a(param0, -125)) {
                    var6 = new sm();
                    int discarded$12 = param0.j(74, 24);
                    int discarded$13 = param0.j(110, 24);
                    var6.field_d = param0.j(-66, 24);
                    int discarded$14 = param0.j(-79, 9);
                    int discarded$15 = param0.j(-75, 12);
                    int discarded$16 = param0.j(83, 12);
                    int discarded$17 = param0.j(-66, 12);
                    var4[var5] = var6;
                    break L1;
                  } else {
                    var6_int = param0.j(-117, hh.a(1, -1 + var5));
                    var4[var5] = var4[var6_int];
                    var5++;
                    break L1;
                  }
                }
                var5++;
                var5++;
                var5++;
                break L0;
              }
            }
            return var4;
          } else {
            var5 = 0;
            L2: while (true) {
              if (var3 <= var5) {
                return var4;
              } else {
                if (jl.a(param0, -125)) {
                  var6 = new sm();
                  int discarded$18 = param0.j(74, 24);
                  int discarded$19 = param0.j(110, 24);
                  var6.field_d = param0.j(-66, 24);
                  int discarded$20 = param0.j(-79, 9);
                  int discarded$21 = param0.j(-75, 12);
                  int discarded$22 = param0.j(83, 12);
                  int discarded$23 = param0.j(-66, 12);
                  var4[var5] = var6;
                  var5++;
                  var5++;
                  continue L2;
                } else {
                  var6_int = param0.j(-117, hh.a(1, -1 + var5));
                  var4[var5] = var4[var6_int];
                  var5++;
                  var5++;
                  continue L2;
                }
              }
            }
          }
        } else {
          return null;
        }
    }

    abstract void a(int param0, int param1);

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6, int param7, int param8, int param9) {
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        Object var17 = null;
        int[] var18 = null;
        var16 = DungeonAssault.field_K;
        L0: while (true) {
          param0--;
          if (0 > param0) {
            if (param4 != 0) {
              var17 = null;
              lo.a(-38, 98, 90, 94, -49, -128, (int[]) null, -44, -86, 68);
              return;
            } else {
              return;
            }
          } else {
            var18 = param6;
            var10 = var18;
            var11 = param1;
            var12 = param5;
            var13 = param3;
            var14 = param8;
            var15 = (var18[var11] & 16711422) >> -869667743;
            var10[var11] = var15 - (-nb.a(65280, var13 >> -357417303) + (-nb.a(16711680, var12 >> -1551496671) + -nb.a(var14 >> -1236356847, 255)));
            param1++;
            param8 = param8 + param2;
            param5 = param5 + param7;
            param3 = param3 + param9;
            continue L0;
          }
        }
    }

    public static void a(int param0) {
        int var1 = -65 % ((param0 - -64) / 43);
        field_c = null;
    }

    final static void a(int param0, boolean param1, vh param2, int param3, int param4) {
        Object var6 = null;
        tc stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        int stackIn_1_2 = 0;
        int stackIn_1_3 = 0;
        vh stackIn_1_4 = null;
        int stackIn_1_5 = 0;
        tc stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        int stackIn_2_3 = 0;
        vh stackIn_2_4 = null;
        int stackIn_2_5 = 0;
        tc stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_3_3 = 0;
        vh stackIn_3_4 = null;
        int stackIn_3_5 = 0;
        int stackIn_3_6 = 0;
        tc stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        int stackOut_0_2 = 0;
        int stackOut_0_3 = 0;
        vh stackOut_0_4 = null;
        int stackOut_0_5 = 0;
        tc stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        vh stackOut_2_4 = null;
        int stackOut_2_5 = 0;
        int stackOut_2_6 = 0;
        tc stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        int stackOut_1_3 = 0;
        vh stackOut_1_4 = null;
        int stackOut_1_5 = 0;
        int stackOut_1_6 = 0;
        L0: {
          stackOut_0_0 = ek.field_b;
          stackOut_0_1 = 22199;
          stackOut_0_2 = 1000000;
          stackOut_0_3 = param3;
          stackOut_0_4 = (vh) param2;
          stackOut_0_5 = param4;
          stackIn_2_0 = stackOut_0_0;
          stackIn_2_1 = stackOut_0_1;
          stackIn_2_2 = stackOut_0_2;
          stackIn_2_3 = stackOut_0_3;
          stackIn_2_4 = stackOut_0_4;
          stackIn_2_5 = stackOut_0_5;
          stackIn_1_0 = stackOut_0_0;
          stackIn_1_1 = stackOut_0_1;
          stackIn_1_2 = stackOut_0_2;
          stackIn_1_3 = stackOut_0_3;
          stackIn_1_4 = stackOut_0_4;
          stackIn_1_5 = stackOut_0_5;
          if (param1) {
            stackOut_2_0 = (tc) (Object) stackIn_2_0;
            stackOut_2_1 = stackIn_2_1;
            stackOut_2_2 = stackIn_2_2;
            stackOut_2_3 = stackIn_2_3;
            stackOut_2_4 = (vh) (Object) stackIn_2_4;
            stackOut_2_5 = stackIn_2_5;
            stackOut_2_6 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            stackIn_3_2 = stackOut_2_2;
            stackIn_3_3 = stackOut_2_3;
            stackIn_3_4 = stackOut_2_4;
            stackIn_3_5 = stackOut_2_5;
            stackIn_3_6 = stackOut_2_6;
            break L0;
          } else {
            stackOut_1_0 = (tc) (Object) stackIn_1_0;
            stackOut_1_1 = stackIn_1_1;
            stackOut_1_2 = stackIn_1_2;
            stackOut_1_3 = stackIn_1_3;
            stackOut_1_4 = (vh) (Object) stackIn_1_4;
            stackOut_1_5 = stackIn_1_5;
            stackOut_1_6 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            stackIn_3_3 = stackOut_1_3;
            stackIn_3_4 = stackOut_1_4;
            stackIn_3_5 = stackOut_1_5;
            stackIn_3_6 = stackOut_1_6;
            break L0;
          }
        }
        ((tc) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_3_2, stackIn_3_3, stackIn_3_4, stackIn_3_5, stackIn_3_6 != 0);
        if (param0 < 65) {
          var6 = null;
          sm[] discarded$2 = lo.a((wj) null, (byte) 71);
          return;
        } else {
          return;
        }
    }

    abstract void a(int param0, int param1, int param2);

    static {
    }
}
