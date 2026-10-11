/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lc {
    private int field_i;
    private so field_g;
    private int field_h;
    static vn field_j;
    private int field_n;
    static String field_r;
    private qb field_b;
    private int field_l;
    private int field_m;
    private double field_f;
    static String field_c;
    static String field_a;
    static on[] field_q;
    private int field_d;
    static String field_o;
    static String field_k;
    static String field_e;
    static String field_p;

    private final void a(int param0, int param1, int param2, int param3) {
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int stackIn_28_0Lifetime1;
        int stackIn_28_1Lifetime1;
        int var5_intLifetime1;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (ArcanistsMulti.i((byte) -120)) {
            return;
          }
          if (param1 > 0) {
            mi.field_B.a(ic.field_b, param2, -48 + param0, 300, 80, 0, -1, 1, 1, mi.field_B.field_C);
            param0 += 24;
            param2 += 16;
            mi.field_B.a(ug.field_l + param1, param2, param0, 70, 32, 0, -1, 1, 1, mi.field_B.field_C);
            param2 += 90;
            if (param1 > 99) {
              param2 += 8;
            }
            var5_int = 0;
            while (var5_int < param1) {
              stackIn_28_0 = param1;
              stackIn_28_1 = 5 + var5_int;
              if (stackIn_28_0 <= stackIn_28_1) {
                tg.field_b[7].a(param2, param0);
                param2 += 9;
              } else {
                param2 -= 4;
                tg.field_b[8].a(param2, param0);
                param2 += 15;
                var5_int += 4;
                if (~var5_int == ~((-(param1 % 10) + param1) / 2 - 1) &&
                  param1 > 50) {
                  param0 += 8;
                  param2 = param2 - var5_int * 2;
                }
              }
              var5_int++;
            }
          } else {
            mi.field_B.a(rl.field_i, param2, -48 + param0, 300, 80, 0, -1, 1, 1, mi.field_B.field_C);
            mi.field_B.a(aa.field_j, param2, param0 + 24, 300, 32, 0, -1, 1, 1, mi.field_B.field_C);
          }
          stackIn_28_0Lifetime1 = 97;
          stackIn_28_1Lifetime1 = (param3 - 56) / 48;
          var5_intLifetime1 = stackIn_28_0Lifetime1 % stackIn_28_1Lifetime1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var5), "lc.I(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final int a(int param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_69_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (6 == this.field_l) {
            if (lc.a((byte) 112)) {
              stackIn_5_0 = this.b(param1, 200) + 320;
              return stackIn_5_0;
            }
            stackIn_9_0 = this.b(param1, 200);
            if (param1 >= 2) {
              stackIn_10_1 = 300;
            } else {
              stackIn_10_1 = 150;
            }
            stackIn_11_0 = stackIn_9_0 + stackIn_10_1;
            return stackIn_11_0;
          }
          if (7 == this.field_l) {
            stackIn_16_0 = 200 + this.b(param1, 200);
            return stackIn_16_0;
          }
          if (this.field_l == 11) {
            if (param1 == 0) {
              stackIn_23_0 = 295;
              return stackIn_23_0;
            }
            if (param1 != 1) {
              stackIn_28_0 = 200 + this.b(param1, 200);
              return stackIn_28_0;
            }
            stackIn_26_0 = 611;
            return stackIn_26_0;
          }
          if (this.field_l == 12) {
            if (param1 == 0) {
              stackIn_35_0 = 271;
              return stackIn_35_0;
            }
            if (param1 != 1) {
              stackIn_40_0 = 200 + this.b(param1, 200);
              return stackIn_40_0;
            }
            stackIn_38_0 = 619;
            return stackIn_38_0;
          }
          if (this.field_l == 14) {
            stackIn_43_0 = this.b(param1, param0 ^ -193) + 200;
            return stackIn_43_0;
          }
          if (3 == this.field_l) {
            stackIn_46_0 = 560;
            return stackIn_46_0;
          }
          if (this.field_l == 9) {
            stackIn_51_0 = 440;
            return stackIn_51_0;
          }
          if (~this.field_l == param0) {
            if (param1 == 0) {
              stackIn_59_0 = 220;
              return stackIn_59_0;
            }
            if (param1 == 1) {
              stackIn_64_0 = 420;
              return stackIn_64_0;
            }
            if (param1 == 2) {
              stackIn_67_0 = 620;
              return stackIn_67_0;
            }
          }
          stackIn_69_0 = eo.field_b[this.field_l];
          return stackIn_69_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3), "lc.V(" + param0 + ',' + param1 + ')');
        }
    }

    final static boolean a(byte param0) {
        RuntimeException var1 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 112) {
            field_o = (String) null;
          }
          stackIn_4_0 = qe.field_p;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "lc.F(" + param0 + ')');
        }
    }

    private final void f(int param0) {
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (re.field_r == 1) {
            var2_int = dd.field_g;
            if (ke.field_K != var2_int) {
              if (var2_int != -1) {
                ke.field_K = var2_int;
              }
            } else {
              ke.field_K = -1;
            }
          }
          if (param0 != -1) {
            this.field_g = (so) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "lc.C(" + param0 + ')');
        }
    }

    final static int a(boolean param0, String param1, byte param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 > -82) {
            stackIn_2_0 = -107;
            return stackIn_2_0;
          }
          if (!param0) {
            stackIn_7_0 = ob.field_T.b(param1);
            return stackIn_7_0;
          }
          stackIn_5_0 = vd.field_c.b(param1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("lc.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void b(byte param0) {
        boolean discarded$0 = false;
        String var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var12_int = 0;
        int var23 = 0;
        String stackIn_48_0 = null;
        int stackIn_94_0 = 0;
        int stackIn_94_1 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        String[] var12 = null;
        int var13_int = 0;
        int[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        qb var20 = null;
        int var21 = 0;
        int var22 = 0;
        int var24 = 0;
        int stackIn_94_0Lifetime1;
        int stackIn_94_1Lifetime1;
        var23 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var3 = uc.field_a + 96;
          var4 = 64 + bi.field_I;
          var5 = var4;
          var6 = 512;
          var12_int = fh.field_e;
          if (var12_int != 0) {
            if (var12_int != 1) {
              if (var12_int == 2) {
                var2 = lf.field_d;
                var3 = var3 + (8 + tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C));
                var7 = var4;
                var9 = 45 + bi.field_I;
                var8 = 550;
                var10 = 230 + bi.field_I;
                de.e(var9, var3, var8, 60, 16777215, 128);
                var2 = cf.field_e;
                var3 = var3 + (mi.field_B.field_m + mi.field_B.field_C) * mi.field_B.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, mi.field_B.field_C + mi.field_B.field_m);
                bb.field_g[0].c(var4, var3);
                var4 += 40;
                bb.field_g[12].b(var4, var3);
                var3 += 20;
                bb.field_g[14].b(var4, var3);
                var4 += 20;
                var3 -= 20;
                bb.field_g[38].b(var4, var3);
                var3 += 20;
                bb.field_g[43].b(var4, var3);
                var3 -= 20;
                var4 += 20;
                bb.field_g[44].b(var4, var3);
                var3 += 20;
                bb.field_g[49].b(var4, var3);
                var3 -= 20;
                var4 += 20;
                bb.field_g[51].b(var4, var3);
                var3 += 20;
                bb.field_g[61].b(var4, var3);
                var3 -= 20;
                var4 += 20;
                bb.field_g[64].b(var4, var3);
                var3 += 20;
                bb.field_g[96].b(var4, var3);
                var3 -= 20;
                var4 += 20;
                bb.field_g[100].b(var4, var3);
                var3 += 20;
                bb.field_g[108].b(var4, var3);
                var4 += 20;
                var3 += 30;
                var2 = pm.field_g;
                var4 = var7;
                mi.field_B.a(var2, var10, -65 + var3, 356, 60, 0, -1, 0, 1, mi.field_B.field_m + mi.field_B.field_C);
                de.e(var9, var3, var8, 60, 16777215, 128);
                var2 = p.field_h;
                var3 = var3 + (mi.field_B.field_C + mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, mi.field_B.field_C + mi.field_B.field_m);
                bb.field_g[1].c(var4, var3);
                var4 += 40;
                bb.field_g[8].b(var4, var3);
                var3 += 20;
                bb.field_g[10].b(var4, var3);
                var3 -= 20;
                var4 += 20;
                bb.field_g[19].b(var4, var3);
                var3 += 20;
                bb.field_g[26].b(var4, var3);
                var4 += 20;
                var3 -= 20;
                bb.field_g[31].b(var4, var3);
                var3 += 20;
                bb.field_g[34].b(var4, var3);
                var4 += 20;
                var3 -= 20;
                bb.field_g[45].b(var4, var3);
                var3 += 20;
                bb.field_g[56].b(var4, var3);
                var4 += 20;
                var3 -= 20;
                bb.field_g[132].b(var4, var3);
                var3 += 20;
                bb.field_g[97].b(var4, var3);
                var4 += 20;
                var3 -= 20;
                bb.field_g[101].b(var4, var3);
                var3 += 20;
                bb.field_g[115].b(var4, var3);
                var3 -= 20;
                var4 += 20;
                var3 += 50;
                var2 = field_o;
                mi.field_B.a(var2, var10, var3 - 65, 356, 60, 0, -1, 0, 1, mi.field_B.field_C + mi.field_B.field_m);
                var4 = var7;
                de.e(var9, var3, var8, 60, 16777215, 128);
                var2 = ma.field_S;
                var3 = var3 + (mi.field_B.field_m + mi.field_B.field_C) * mi.field_B.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, mi.field_B.field_C + mi.field_B.field_m);
                bb.field_g[7].c(var4, var3);
                var4 += 40;
                bb.field_g[20].b(var4, var3);
                var3 += 20;
                bb.field_g[72].b(var4, var3);
                var4 += 20;
                var3 -= 20;
                bb.field_g[135].b(var4, var3);
                var3 += 20;
                var3 += 30;
                var2 = oj.field_a;
                var4 = var7;
                mi.field_B.a(var2, var10, -65 + var3, 356, 60, 0, -1, 0, 1, mi.field_B.field_m + mi.field_B.field_C);
                de.e(var9, var3, var8, 60, 16777215, 128);
                var2 = mn.field_q;
                var3 = var3 + (mi.field_B.field_C + mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, mi.field_B.field_m + mi.field_B.field_C);
                bb.field_g[3].c(var4, var3);
                var4 += 40;
                bb.field_g[13].b(var4, var3);
                var3 += 20;
                bb.field_g[24].b(var4, var3);
                var4 += 20;
                var3 -= 20;
                bb.field_g[36].b(var4, var3);
                var3 += 20;
                bb.field_g[98].b(var4, var3);
                var4 += 20;
                var3 -= 20;
                bb.field_g[99].b(var4, var3);
                var3 += 20;
                bb.field_g[114].b(var4, var3);
                var4 += 20;
                var3 -= 20;
                var2 = am.field_b;
                var3 += 30;
                var4 = var7;
                mi.field_B.a(var2, var10, -65 + var3, 356, 60, 0, -1, 0, 1, mi.field_B.field_C + mi.field_B.field_m);
              } else {
                if (3 == var12_int) {
                  var9 = 45 + bi.field_I;
                  var10 = bi.field_I + 290;
                  var2 = jf.field_i;
                  var8 = 550;
                  var7 = var4;
                  var3 = var3 + (tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C) + 8);
                  var7 = var4;
                  de.e(var9, var3, var8, 60, 16777215, 128);
                  var2 = qj.field_b;
                  var3 = var3 + (mi.field_B.field_C + mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, mi.field_B.field_m + mi.field_B.field_C);
                  bb.field_g[2].c(var4, var3);
                  var4 += 40;
                  bb.field_g[15].b(var4, var3);
                  var3 += 20;
                  bb.field_g[25].b(var4, var3);
                  var3 -= 20;
                  var4 += 20;
                  bb.field_g[32].b(var4, var3);
                  var3 += 20;
                  bb.field_g[33].b(var4, var3);
                  var4 += 20;
                  var3 -= 20;
                  bb.field_g[35].b(var4, var3);
                  var3 += 20;
                  bb.field_g[37].b(var4, var3);
                  var3 -= 20;
                  var4 += 20;
                  bb.field_g[53].b(var4, var3);
                  var3 += 20;
                  bb.field_g[54].b(var4, var3);
                  var3 -= 20;
                  var4 += 20;
                  bb.field_g[59].b(var4, var3);
                  var3 += 20;
                  bb.field_g[65].b(var4, var3);
                  var4 += 20;
                  var3 -= 20;
                  bb.field_g[66].b(var4, var3);
                  var3 += 20;
                  bb.field_g[71].b(var4, var3);
                  var4 += 20;
                  var3 -= 20;
                  bb.field_g[76].b(var4, var3);
                  var3 += 20;
                  bb.field_g[77].b(var4, var3);
                  var3 -= 20;
                  var4 += 20;
                  bb.field_g[133].b(var4, var3);
                  var3 += 20;
                  var2 = hn.field_i;
                  var3 += 30;
                  mi.field_B.a(var2, var10, var3 - 65, 286, 60, 0, -1, 0, 1, mi.field_B.field_m + mi.field_B.field_C);
                  var4 = var7;
                  de.e(var9, var3, var8, 60, 16777215, 128);
                  var2 = rc.field_f;
                  var3 = var3 + (mi.field_B.field_C + mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, mi.field_B.field_m + mi.field_B.field_C);
                  bb.field_g[4].c(var4, var3);
                  var4 += 40;
                  bb.field_g[5].b(var4, var3);
                  var3 += 20;
                  bb.field_g[9].b(var4, var3);
                  var3 -= 20;
                  var4 += 20;
                  bb.field_g[11].b(var4, var3);
                  var3 += 20;
                  bb.field_g[17].b(var4, var3);
                  var3 -= 20;
                  var4 += 20;
                  bb.field_g[21].b(var4, var3);
                  var3 += 20;
                  bb.field_g[29].b(var4, var3);
                  var4 += 20;
                  var3 -= 20;
                  bb.field_g[39].b(var4, var3);
                  var3 += 20;
                  bb.field_g[41].b(var4, var3);
                  var4 += 20;
                  var3 -= 20;
                  bb.field_g[42].b(var4, var3);
                  var3 += 20;
                  bb.field_g[52].b(var4, var3);
                  var4 += 20;
                  var3 -= 20;
                  bb.field_g[55].b(var4, var3);
                  var3 += 20;
                  bb.field_g[63].b(var4, var3);
                  var3 -= 20;
                  var4 += 20;
                  bb.field_g[67].b(var4, var3);
                  var3 += 20;
                  bb.field_g[68].b(var4, var3);
                  var4 += 20;
                  var3 -= 20;
                  bb.field_g[74].b(var4, var3);
                  var3 += 20;
                  bb.field_g[106].b(var4, var3);
                  var3 -= 20;
                  var4 += 20;
                  bb.field_g[109].b(var4, var3);
                  var3 += 20;
                  bb.field_g[112].b(var4, var3);
                  var3 += 30;
                  var4 += 20;
                  var2 = sn.field_J;
                  var4 = var7;
                  mi.field_B.a(var2, var10, -65 + var3, 286, 60, 0, -1, 0, 1, mi.field_B.field_m + mi.field_B.field_C);
                  de.e(var9, var3, var8, 60, 16777215, 128);
                  var2 = me.field_P;
                  var3 = var3 + (mi.field_B.field_C + mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, 512, 352, 16777215, 0, 0, 0, mi.field_B.field_C + mi.field_B.field_m);
                  bb.field_g[73].c(var4, var3);
                  var4 += 40;
                  bb.field_g[22].b(var4, var3);
                  var3 += 20;
                  bb.field_g[46].b(var4, var3);
                  var4 += 20;
                  var3 -= 20;
                  bb.field_g[48].b(var4, var3);
                  var3 += 20;
                  bb.field_g[60].b(var4, var3);
                  var3 -= 20;
                  var4 += 20;
                  bb.field_g[103].b(var4, var3);
                  var3 += 20;
                  var3 += 30;
                  var2 = jd.field_e;
                  mi.field_B.a(var2, var10, var3 - 65, 286, 60, 0, -1, 0, 1, mi.field_B.field_C + mi.field_B.field_m);
                  var4 = var7;
                  de.e(var9, var3, var8, 60, 16777215, 128);
                  de.h(0, var3 + 60, an.field_f, an.field_j);
                  de.c(var9, var3, var8, 105, 25, 16777215, 128);
                  de.a();
                  var2 = om.field_L;
                  var3 = var3 + (mi.field_B.field_C + mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, mi.field_B.field_C + mi.field_B.field_m);
                  bb.field_g[75].c(var4, var3);
                  var4 += 40;
                  bb.field_g[6].b(var4, var3);
                  var3 += 20;
                  bb.field_g[16].b(var4, var3);
                  var3 -= 20;
                  var4 += 20;
                  bb.field_g[18].b(var4, var3);
                  var3 += 20;
                  bb.field_g[23].b(var4, var3);
                  var3 -= 20;
                  var4 += 20;
                  bb.field_g[27].b(var4, var3);
                  var3 += 20;
                  bb.field_g[28].b(var4, var3);
                  var4 += 20;
                  var3 -= 20;
                  bb.field_g[30].b(var4, var3);
                  var3 += 20;
                  bb.field_g[40].b(var4, var3);
                  var4 += 20;
                  var3 -= 20;
                  bb.field_g[47].b(var4, var3);
                  var3 += 20;
                  bb.field_g[50].b(var4, var3);
                  var3 -= 20;
                  var4 += 20;
                  bb.field_g[57].b(var4, var3);
                  var3 += 20;
                  bb.field_g[58].b(var4, var3);
                  var3 -= 20;
                  var4 += 20;
                  bb.field_g[62].b(var4, var3);
                  var3 += 20;
                  bb.field_g[69].b(var4, var3);
                  var4 += 20;
                  var3 -= 20;
                  bb.field_g[70].b(var4, var3);
                  var3 += 20;
                  bb.field_g[102].b(var4, var3);
                  var4 += 20;
                  var3 -= 20;
                  bb.field_g[104].b(var4, var3);
                  var3 += 20;
                  bb.field_g[110].b(var4, var3);
                  var4 += 20;
                  var3 += 30;
                  var2 = gb.field_e;
                  mi.field_B.a(var2, var10, -65 + var3, 286, 60, 0, -1, 0, 1, mi.field_B.field_C + mi.field_B.field_m);
                  var2 = jn.field_b;
                  mi.field_B.a(var2, var5, -5 + var3, var6, 60, 0, -1, 1, 0, mi.field_B.field_C + mi.field_B.field_m);
                  var4 = var7;
                } else {
                  if (var12_int == 4) {
                    var2 = n.field_e;
                    var3 = var3 + (tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C) + 8);
                    var4 = 320 + (bi.field_I - 80);
                    var3 = -70 + uc.field_a + 240;
                    de.a(-1 + var4, var3 - 1, 162, 122, 0);
                    md.field_f[2].c(var4, -24 + var3, 160, 160);
                    de.b(var4 - 170, var3 + 22, var4 - 10, 22 + var3, 16711680);
                    de.b(var4 + 5, 5 + var3 + 15, -10 + var4, var3 + 22, 16711680);
                    mi.field_B.a(ue.field_a, -180 + var4, 20 + var3, 0, 16711680);
                    de.a(var4 + 5, var3 + 5, 50, 30, 6, 16711680);
                    de.c(5 + var4, var3 + 5, 50, 30, 6, 16711680, 64);
                    de.b(-170 + var4, -18 + var3, var4 + 40, -18 + var3, 65280);
                    de.b(10 + (var4 + 70), var3, var4 + 40, var3 - 18, 65280);
                    mi.field_B.a(lh.field_h, var4 - 180, -20 + var3, 0, 65280);
                    de.a(70 + var4, var3, 20, 15, 4, 65280);
                    de.c(70 + var4, var3, 20, 15, 4, 65280, 64);
                    de.b(180 + (160 + var4), var3 + 22, 10 + (160 + var4), var3 + 22, 33023);
                    de.b(var4 + 145 + 10, var3 + 10, 160 + var4 + 10, var3 + 22, 33023);
                    mi.field_B.c(u.field_m, 160 + var4 + 180, 20 + var3, 0, 33023);
                    de.a(145 + var4, 5 + var3, 10, 10, 4, 33023);
                    de.c(var4 + 145, 5 + var3, 10, 10, 4, 33023, 64);
                    de.b(-170 + var4, 122 + var3, -10 + var4, 122 + var3, 16711935);
                    de.b(var4 + 5, 7 + (var3 + 105), -10 + var4, var3 + 122, 16711935);
                    mi.field_B.a(hc.field_a, var4 - 180, var3 + 120, 0, 16711935);
                    de.a(var4 + 5, var3 + 105, 110, 15, 6, 16711935);
                    de.c(var4 + 5, 105 + var3, 110, 15, 6, 16711935, 64);
                    de.b(180 + var4 + 160, var3 + 102, var4 + 170, 102 + var3, 16776960);
                    de.b(40 + var4 + 125, 7 + (105 + var3), 170 + var4, 102 + var3, 16776960);
                    mi.field_B.c(oa.field_b, 180 + (var4 + 160), 100 + var3, 0, 16776960);
                    de.a(125 + var4, var3 + 105, 40, 15, 6, 16776960);
                    de.c(125 + var4, var3 + 105, 40, 15, 6, 16776960, 64);
                    var3 += 140;
                    var2 = tk.field_m;
                    var4 = bi.field_I + 64;
                    var3 = var3 + (mi.field_B.field_m + mi.field_B.field_C) * mi.field_B.a(var2, var4, var3, 512, 128, 0, -1, 0, 0, mi.field_B.field_m + mi.field_B.field_C);
                    var2 = tn.field_Kb;
                    var3 += 16;
                    var3 = var3 + (mi.field_B.field_C + mi.field_B.field_m) * mi.field_B.a(var2, var4, var3, 192, 128, 0, -1, 0, 0, mi.field_B.field_C + mi.field_B.field_m);
                    var12_int = 0;
                    var13_int = 0;
                    var14 = 0;
                    var15 = 0;
                    var16 = 16;
                    var17 = 0;
                    var18 = -16;
                    var3 = 32;
                    var19 = 0;
                    var4 = 32;
                    var20 = new qb(128, 128);
                    var20.a();
                    de.i(64, 64, 32, 7829367);
                    gn.a(32, (byte) 62, 128, 64, 64);
                    pc.$cfr$intArgs$a$5f050b8899ac(kg.field_d[2], var17 + var3, kg.field_d[3], kg.field_d[0], 118, kg.field_d[1], qe.field_i[so.field_c[3]], var4 + var16);
                    if (so.field_c[0] != 46) {
                      pc.$cfr$intArgs$a$5f050b8899ac(kg.field_d[2], var3 + var13_int, kg.field_d[3], kg.field_d[0], -123, kg.field_d[1], fn.field_b[0], var4 + var12_int);
                    }
                    pc.$cfr$intArgs$a$5f050b8899ac(kg.field_d[2], var3, kg.field_d[3], kg.field_d[0], 109, kg.field_d[1], jd.field_j[so.field_c[0]], var4);
                    var3 -= 8;
                    var3 -= 16;
                    pc.$cfr$intArgs$a$5f050b8899ac(kg.field_d[2], var3, kg.field_d[3], kg.field_d[0], 47, kg.field_d[1], kc.field_kb[so.field_c[1]], var4);
                    var3 += 16;
                    pc.$cfr$intArgs$a$5f050b8899ac(kg.field_d[2], var3, kg.field_d[3], kg.field_d[0], -99, kg.field_d[1], hn.field_d[so.field_c[5]], var4);
                    if (so.field_c[5] != 53 &&
                      so.field_c[5] != 55) {
                      pc.$cfr$intArgs$a$5f050b8899ac(kg.field_d[2], var3, kg.field_d[3], kg.field_d[0], -90, kg.field_d[1], bo.field_a[0], var4);
                    }
                    var3 -= 16;
                    pc.$cfr$intArgs$a$5f050b8899ac(kg.field_d[2], var3, kg.field_d[3], kg.field_d[0], -80, kg.field_d[1], tj.field_A[so.field_c[4]], var4);
                    var3 += 8;
                    var3 += 16;
                    if (46 != so.field_c[0]) {
                      pc.$cfr$intArgs$a$5f050b8899ac(kg.field_d[2], var3 + var15, kg.field_d[3], kg.field_d[0], -117, kg.field_d[1], h.field_I[0], var14 + var4);
                    }
                    pc.$cfr$intArgs$a$5f050b8899ac(kg.field_d[2], var3 + var19, kg.field_d[3], kg.field_d[0], 20, kg.field_d[1], ea.field_u[so.field_c[2]], var4 + var18);
                    ce.field_m.a(true);
                    var21 = 320 + bi.field_I;
                    var22 = 350 + uc.field_a;
                    var20.b(var21, var22);
                    de.h(var21, 46 + var22, 64 + var21, an.field_j);
                    kh.field_d.a(var21 - 32, -92 + (10 + var22));
                    de.a();
                    mi.field_B.b("250", var21 + 32, var22 + 8, 16777215, -1);
                  } else {
                    if (var12_int != 5) {
                      if (var12_int == 6) {
                        var2 = gl.field_a;
                        var3 = var3 + (tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C) + 8);
                        var2 = hl.field_i;
                        var3 = var3 + ((mi.field_B.field_m + mi.field_B.field_C) * mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 0, 0, mi.field_B.field_C + mi.field_B.field_m) + 8);
                        var2 = jl.field_f;
                        var3 = var3 + (8 + (mi.field_B.field_C + mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 0, 0, mi.field_B.field_C + mi.field_B.field_m));
                        var2 = nm.field_d;
                        var3 = var3 + (16 + (mi.field_B.field_m + mi.field_B.field_C) * mi.field_B.a(var2, var5 + 32, var3, var6 - 64, 480, 16777215, 0, 1, 0, mi.field_B.field_m + mi.field_B.field_C));
                        var2 = va.field_a;
                        var3 = var3 + (8 + (mi.field_B.field_m + mi.field_B.field_C) * mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 0, 0, mi.field_B.field_C + mi.field_B.field_m));
                      } else {
                        if (var12_int == 7) {
                          var2 = db.field_d;
                          if (ArcanistsMulti.i((byte) -99)) {
                            var12_int = 74 + bi.field_I + tj.field_t.b(var2);
                            ii.field_d.c(var12_int, -2 + var3, 32, 32);
                            mi.field_B.a(kc.field_M, var12_int + 40, (mi.field_B.field_C + tj.field_t.field_C) / 2 + var3, 16711680, -1);
                          }
                          var3 = var3 + (tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C) + 8);
                          var2 = nb.field_c;
                          var3 = var3 + (8 + (mi.field_B.field_m + mi.field_B.field_C) * mi.field_B.a(var2, var5, var3, 512, 352, 0, -1, 0, 0, mi.field_B.field_C + mi.field_B.field_m));
                          var2 = kl.field_F;
                          var3 = var3 + ((mi.field_B.field_C + mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 0, 0, mi.field_B.field_m + mi.field_B.field_C) + 6);
                          var11 = new int[]{16711935, 16711680, 16746632, 16776960, 65535, 34816, 16777215, 4521762, 1364125, 16755302};
                          var2 = uh.field_q;
                          mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 2, 0, mi.field_B.field_C + mi.field_B.field_m);
                          var2 = tj.a(-115, new String[]{Integer.toString(var11[1], 16)}, ve.field_s);
                          var3 = var3 + (2 + (mi.field_B.field_m + mi.field_B.field_C) * mi.field_B.a(var2, var5, var3, 512, 352, 0, -1, 0, 0, mi.field_B.field_m + mi.field_B.field_C));
                          var2 = ik.field_a;
                          mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 2, 0, mi.field_B.field_m + mi.field_B.field_C);
                          var2 = tj.a(-51, new String[]{Integer.toString(var11[2], 16)}, ra.field_b);
                          var3 = var3 + ((mi.field_B.field_C + mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, 512, 352, 0, -1, 0, 0, mi.field_B.field_m + mi.field_B.field_C) + 2);
                          var2 = field_p;
                          mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 2, 0, mi.field_B.field_C + mi.field_B.field_m);
                          var2 = tj.a(-116, new String[]{Integer.toString(var11[3], 16)}, hm.field_a);
                          var3 = var3 + (2 + (mi.field_B.field_C + mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, 512, 352, 0, -1, 0, 0, mi.field_B.field_m + mi.field_B.field_C));
                          var2 = pk.field_b;
                          mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 2, 0, mi.field_B.field_C + mi.field_B.field_m);
                          var2 = tj.a(-47, new String[]{Integer.toString(var11[4], 16)}, pc.field_a);
                          var3 = var3 + ((mi.field_B.field_C + mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, 512, 352, 0, -1, 0, 0, mi.field_B.field_C + mi.field_B.field_m) + 2);
                          var2 = sl.field_M;
                          mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 2, 0, mi.field_B.field_C + mi.field_B.field_m);
                          var2 = tj.a(-120, new String[]{Integer.toString(var11[5], 16)}, di.field_b);
                          var3 = var3 + ((mi.field_B.field_m + mi.field_B.field_C) * mi.field_B.a(var2, var5, var3, 512, 352, 0, -1, 0, 0, mi.field_B.field_m + mi.field_B.field_C) + 2);
                          var2 = pb.field_l;
                          mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 2, 0, mi.field_B.field_m + mi.field_B.field_C);
                          var2 = tj.a(122, new String[]{Integer.toString(var11[6], 16)}, go.field_f);
                          var3 = var3 + ((mi.field_B.field_m + mi.field_B.field_C) * mi.field_B.a(var2, var5, var3, 512, 352, 0, -1, 0, 0, mi.field_B.field_m + mi.field_B.field_C) + 2);
                          var2 = dk.field_f;
                          mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 2, 0, mi.field_B.field_m + mi.field_B.field_C);
                          var2 = tj.a(-71, new String[]{Integer.toString(var11[7], 16)}, ra.field_e);
                          var3 = var3 + ((mi.field_B.field_C + mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, 512, 352, 0, -1, 0, 0, mi.field_B.field_C + mi.field_B.field_m) + 2);
                          var2 = fg.field_i;
                          mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 2, 0, mi.field_B.field_C + mi.field_B.field_m);
                          var2 = tj.a(113, new String[]{Integer.toString(var11[8], 16)}, fo.field_i);
                          var3 = var3 + ((mi.field_B.field_C + mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, 512, 352, 0, -1, 0, 0, mi.field_B.field_m + mi.field_B.field_C) + 2);
                          var2 = mf.field_e;
                          mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 2, 0, mi.field_B.field_C + mi.field_B.field_m);
                          var2 = tj.a(-33, new String[]{Integer.toString(var11[9], 16)}, ie.field_Rb);
                          var3 = var3 + (6 + (mi.field_B.field_C + mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, 512, 352, 0, -1, 0, 0, mi.field_B.field_m + mi.field_B.field_C));
                          var2 = vn.field_a;
                          var3 = var3 + (8 + (mi.field_B.field_C + mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, 512, 352, 0, -1, 0, 0, mi.field_B.field_m + mi.field_B.field_C));
                        } else {
                          if (var12_int == 8) {
                            var2 = an.field_m;
                            var3 = var3 + (tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C) + 8);
                            this.a(var3, var4, (byte) -102, 3);
                            var2 = ne.field_j;
                            mi.field_B.a(var2, 320 + bi.field_I, var3, 256, 120, 0, -1, 0, 1, mi.field_B.field_C + mi.field_B.field_m);
                            var2 = na.field_Tb;
                            var3 += 128;
                            var3 = var3 + (8 + tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C));
                            this.a(var3, var4, (byte) -77, 0);
                            var2 = kn.field_pb;
                            mi.field_B.a(var2, bi.field_I + 320, var3, 256, 120, 0, -1, 0, 1, mi.field_B.field_m + mi.field_B.field_C);
                            bb.field_g[5].c(var4, var3 + 80);
                          } else {
                            if (var12_int != 9) {
                              if (var12_int == 10) {
                                var2 = oo.field_q;
                                var3 = var3 + (8 + tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C));
                                this.a(var3, var4, (byte) -47, 4);
                                var2 = sc.field_S;
                                mi.field_B.a(var2, 320 + bi.field_I, var3, 256, 120, 0, -1, 0, 1, mi.field_B.field_C + mi.field_B.field_m);
                                bb.field_g[29].c(var4, 120 + (-40 + var3));
                                var2 = wn.field_A;
                                var3 += 128;
                                var3 = var3 + (8 + tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C));
                                this.a(var3, var4, (byte) -86, 5);
                                var2 = lm.field_d;
                                mi.field_B.a(var2, 320 + bi.field_I, var3, 256, 120, 0, -1, 0, 1, mi.field_B.field_C + mi.field_B.field_m);
                                bb.field_g[55].c(var4, 80 + var3);
                              } else {
                                if (var12_int == 11) {
                                  var2 = ck.field_c;
                                  var3 = var3 + (tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C) + 8);
                                  this.a(var3, var4, (byte) -36, 6);
                                  var2 = qj.field_f;
                                  mi.field_B.a(var2, 320 + bi.field_I, var3, 256, 120, 0, -1, 0, 1, mi.field_B.field_m + mi.field_B.field_C);
                                  bb.field_g[67].c(var4, var3 + 80);
                                  var3 += 128;
                                  var2 = b.field_c;
                                  var3 = var3 + (tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C) + 8);
                                  this.a(var3, var4, (byte) -42, 7);
                                  var2 = uh.field_l;
                                  mi.field_B.a(var2, 320 + bi.field_I, var3, 256, 120, 0, -1, 0, 1, mi.field_B.field_C + mi.field_B.field_m);
                                  bb.field_g[85].c(var4, 120 + (-40 + var3));
                                } else {
                                  if (12 == var12_int) {
                                    var2 = lo.field_t;
                                    var3 = var3 + (tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C) + 8);
                                    var2 = ao.field_b;
                                    var12 = new String[50];
                                    var13 = new int[]{480};
                                    var14 = mi.field_B.a(var2, var13, var12);
                                    var3 = var3 + (mi.field_B.field_C + mi.field_B.field_m);
                                    var24 = 0;
                                    var15 = var24;
                                    while (var14 > var24) {
                                      mi.field_B.a(var12[var24], var4, var3, 0, -1);
                                      stackIn_94_0 = var12[var24].length();
                                      stackIn_94_1 = 2;
                                      if (stackIn_94_0 > stackIn_94_1 &&
                                        45 == var12[var24].charAt(1)) {
                                        gj.field_f[0].a(-2 + var4, -12 + var3);
                                      }
                                      var3 = var3 + (mi.field_B.field_C + mi.field_B.field_m);
                                      var24++;
                                    }
                                  }
                                }
                              }
                            } else {
                              var2 = rk.field_J;
                              var3 = var3 + (tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C) + 8);
                              this.a(var3, var4, (byte) -49, 1);
                              var2 = ah.field_e;
                              mi.field_B.a(var2, bi.field_I + 320, var3, 256, 120, 0, -1, 0, 1, mi.field_B.field_C + mi.field_B.field_m);
                              bb.field_g[17].c(var4, var3 + 80);
                              var2 = hn.field_o;
                              var3 += 128;
                              var3 = var3 + (8 + tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C));
                              this.a(var3, var4, (byte) -71, 2);
                              var2 = dn.field_Bb;
                              mi.field_B.a(var2, bi.field_I + 320, var3, 256, 120, 0, -1, 0, 1, mi.field_B.field_C + mi.field_B.field_m);
                              bb.field_g[42].c(var4, 80 + var3);
                            }
                          }
                        }
                      }
                    } else {
                      var2 = i.field_h;
                      if (ArcanistsMulti.i((byte) -92)) {
                        var12_int = bi.field_I + (74 + tj.field_t.b(var2));
                        ii.field_d.c(var12_int, -2 + var3, 32, 32);
                        mi.field_B.a(tk.field_o, 40 + var12_int, var3 + (tj.field_t.field_C + mi.field_B.field_C) / 2, 16711680, -1);
                      }
                      var3 = var3 + (tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C) + 8);
                      var2 = km.field_b;
                      var3 = var3 + ((mi.field_B.field_C + mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, 512, 352, 0, -1, 0, 0, mi.field_B.field_m + mi.field_B.field_C) + 8);
                      var2 = hh.field_a;
                      var3 = var3 + ((mi.field_B.field_C + mi.field_B.field_m) * mi.field_B.a(var2, 32 + var5, var3, 448, 480, 16777215, 0, 1, 0, mi.field_B.field_C + mi.field_B.field_m) + 16);
                      var3 += 24;
                      var4 += 320;
                      var3 += 16;
                      de.h(0, var3, an.field_f, an.field_j);
                      fe.field_g.c(bi.field_I + 43, var3 - 32);
                      fe.field_g.c(106 + bi.field_I, -32 + var3);
                      de.a();
                      tg.field_b[7].a(var4, -2 + var3);
                      mi.field_B.a("= 1" + wn.field_x, 20 + var4, 20 + var3, 16776960, 0);
                      tg.field_b[8].a(var4 + 100, -2 + var3);
                      mi.field_B.a("= 5" + dk.field_g, 20 + var4 + 100, var3 + 20, 16776960, 0);
                      var2 = an.field_n;
                      var4 -= 320;
                      var2 = tj.a(127, new String[]{ji.field_l}, var2);
                      var3 -= 48;
                      var3 = var3 + (16 + (mi.field_B.field_C + mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, 312, 480, 0, -1, 0, 0, mi.field_B.field_m + mi.field_B.field_C));
                      var3 += 48;
                      var3 += 24;
                      var2 = fo.field_j;
                      var3 -= 32;
                      rm.field_o[9].b(64 + bi.field_I, var3);
                      rm.field_o[2].b(bi.field_I + 64, var3);
                      tk.field_x[4].b(56 + bi.field_I, var3);
                      var3 += 16;
                      var3 = var3 + ((mi.field_B.field_m + mi.field_B.field_C) * mi.field_B.a(var2, 136 + bi.field_I, var3, 440, an.field_j, 0, -1, 0, 0, mi.field_B.field_C + mi.field_B.field_m) + 16);
                    }
                  }
                }
              }
            } else {
              var2 = fj.field_g;
              var3 = var3 + (tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C) + 8);
              var2 = md.field_e;
              var3 = var3 + (16 + (mi.field_B.field_C + mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, 512, 352, 0, -1, 0, 0, mi.field_B.field_m + mi.field_B.field_C));
              var2 = qm.field_l;
              var3 = var3 + (tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C) + 8);
              var2 = cc.field_b;
              var2 = tj.a(118, new String[]{fn.field_g[84], fn.field_g[85], fn.field_g[82], fn.field_g[81]}, var2);
              var3 = var3 + (16 + (mi.field_B.field_m + mi.field_B.field_C) * mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 0, 0, mi.field_B.field_m + mi.field_B.field_C));
              var2 = ch.field_e;
              var3 = var3 + (tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C) + 8);
              var2 = vf.field_p;
              var2 = tj.a(124, new String[]{fn.field_g[69], fn.field_g[ao.field_f]}, var2);
              var3 = var3 + (32 + (mi.field_B.field_C + mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 0, 0, mi.field_B.field_C + mi.field_B.field_m));
            }
          } else {
            var2 = wm.field_J;
            var3 = var3 + (tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C) + 16);
            var2 = nj.field_j;
            var3 = var3 + ((mi.field_B.field_m + mi.field_B.field_C) * mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 0, 0, mi.field_B.field_m + mi.field_B.field_C) + 16);
            var2 = ud.field_u;
            var3 = var3 + (16 + tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C));
            if (ArcanistsMulti.i((byte) -121)) {
              stackIn_48_0 = cb.field_d;
            } else {
              stackIn_48_0 = cn.field_J;
            }
            var2 = stackIn_48_0;
            var2 = tj.a(119, new String[]{ie.field_Lb, ji.field_l}, var2);
            var3 = var3 + ((mi.field_B.field_m + mi.field_B.field_C) * mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 0, 0, mi.field_B.field_m + mi.field_B.field_C) + 16);
            var2 = fd.field_c;
            var3 = var3 + ((mi.field_B.field_m + mi.field_B.field_C) * mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 0, 0, mi.field_B.field_m + mi.field_B.field_C) + 32);
          }
          stackIn_94_0Lifetime1 = param0;
          stackIn_94_1Lifetime1 = 71;
          if (stackIn_94_0Lifetime1 < stackIn_94_1Lifetime1) {
            discarded$0 = this.g(-45, -88);
          }
          tj.field_t.c(ul.a(fh.field_e, (byte) 69), 590 + bi.field_I, uc.field_a + 112, 0, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2_ref), "lc.GA(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, boolean param2) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param2) {
            lc.c(true);
          }
          gi.field_c = param1;
          mf.field_c = param0;
          if (null != pm.field_e) {
            pm.field_e.a(-120, param1, param0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3), "lc.S(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(boolean param0, int param1, byte param2) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (this.field_g.field_h != -1) {
            param1 = this.field_g.field_h;
          }
          if (this.field_l == 10) {
            param1 = 1;
          }
          this.field_g.a(param0, param1, false, this.a((byte) 88, an.field_g, me.field_I));
          ke.field_K = -1;
          if (param2 >= -113) {
            field_r = (String) null;
          }
          dd.field_g = -1;
          oj.field_e = jb.field_v;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var4), "lc.AA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void i(int param0) {
        boolean discarded$0 = false;
        boolean discarded$1 = false;
        boolean discarded$2 = false;
        boolean discarded$3 = false;
        boolean discarded$4 = false;
        boolean discarded$5 = false;
        boolean discarded$6 = false;
        boolean discarded$7 = false;
        boolean discarded$8 = false;
        boolean discarded$9 = false;
        boolean discarded$10 = false;
        Object stackIn_4_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_205_0 = 0;
        int stackIn_205_1 = 0;
        int stackIn_209_0 = 0;
        int stackIn_209_1 = 0;
        int stackIn_621_0 = 0;
        int stackIn_728_0 = 0;
        int stackIn_728_1 = 0;
        int stackIn_732_0 = 0;
        int stackIn_732_1 = 0;
        int stackIn_781_0 = 0;
        int stackIn_781_1 = 0;
        int stackIn_785_0 = 0;
        int stackIn_785_1 = 0;
        int stackIn_839_0 = 0;
        int stackIn_839_1 = 0;
        int stackIn_843_0 = 0;
        int stackIn_843_1 = 0;
        int stackIn_862_0 = 0;
        int stackIn_862_1 = 0;
        int stackIn_866_0 = 0;
        int stackIn_866_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4_int = 0;
        Object var4 = null;
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
        Object var16_ref = null;
        int var16 = 0;
        int var17_int = 0;
        int[] var17 = null;
        int var18_int = 0;
        Object var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int[] var33 = null;
        int[] var34 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var32 = ArcanistsMulti.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.c(-26733);
                        this.field_m = -1;
                        var3 = 142;
                        var4_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        statePc = ((Object) stateCaught_1 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_1);
                        }
                        caughtException = stateCaught_1;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var4_int >= 7) {
                            /* Inlined CFG state: 18. */
                            {
                                var4 = null;
                                if (0 != this.field_h) {
                                    statePc = 20;
                                } else {
                                    statePc = 19;
                                }
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 3. */
                            {
                                stackIn_6_0 = this;
                                stackIn_4_0 = stackIn_6_0;
                                if (this.field_h != var4_int) {
                                    /* Inlined CFG state: 6. */
                                    {
                                        stackIn_7_0 = this;
                                        stackIn_7_1 = 0;
                                        statePc = 7;
                                        continue stateLoop;
                                    }
                                } else {
                                    /* Inlined CFG state: 4. */
                                    {
                                        stackIn_7_0 = this;
                                        stackIn_7_1 = 1;
                                        statePc = 7;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_2) {
                        statePc = ((Object) stateCaught_2 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_2);
                        }
                        caughtException = stateCaught_2;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (!this.a(stackIn_7_1 != 0, 65, (byte) -127, true, 32 + (bi.field_I + 86 * var4_int), 65, uc.field_a + 104)) {
                            /* Inlined CFG state: 9. */
                            {
                                stackIn_10_0 = 0;
                                statePc = 10;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 8. */
                            {
                                stackIn_10_0 = 1;
                                statePc = 10;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_7) {
                        statePc = ((Object) stateCaught_7 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_7);
                        }
                        caughtException = stateCaught_7;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var5 = stackIn_10_0;
                        mc.field_a[var4_int].c(86 * var4_int + (32 + bi.field_I), 104 + uc.field_a);
                        if (var5 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        statePc = ((Object) stateCaught_10 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_10);
                        }
                        caughtException = stateCaught_10;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var4_int == 6) {
                            /* Inlined CFG state: 16. */
                            {
                                this.field_m = 7;
                                var6 = -128 + (var4_int * 86 + 32 + bi.field_I);
                                var7 = 103 + (uc.field_a - 16);
                                mi.field_B.a(nj.field_l, var6, var7 - 1, 192, 192, 0, 0, 1, 0, mi.field_B.field_C);
                                mi.field_B.a(nj.field_l, var6 - 1, var7, 192, 192, 0, 0, 1, 0, mi.field_B.field_C);
                                mi.field_B.a(nj.field_l, 1 + var6, var7, 192, 192, 0, 0, 1, 0, mi.field_B.field_C);
                                mi.field_B.a(nj.field_l, var6, 1 + var7, 192, 192, 0, 0, 1, 0, mi.field_B.field_C);
                                mi.field_B.a(nj.field_l, var6, var7, 192, 192, 16777215, 0, 1, 0, mi.field_B.field_C);
                                statePc = 17;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 12. */
                            {
                                /* Sequential CFG blocks: 12, 14. */
                                {
                                }
                                {
                                    this.field_i = var4_int;
                                    this.field_m = 1;
                                    statePc = 17;
                                    continue stateLoop;
                                }
                            }
                        }
                    } catch (Throwable stateCaught_11) {
                        statePc = ((Object) stateCaught_11 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_11);
                        }
                        caughtException = stateCaught_11;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var4_int++;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        statePc = ((Object) stateCaught_17 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_17);
                        }
                        caughtException = stateCaught_17;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var4 = jd.field_j;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        statePc = ((Object) stateCaught_19 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_19);
                        }
                        caughtException = stateCaught_19;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (this.field_h != 1) {
                            statePc = 22;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 21. */
                            {
                                var4 = kc.field_kb;
                                statePc = 22;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_20) {
                        statePc = ((Object) stateCaught_20 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_20);
                        }
                        caughtException = stateCaught_20;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (2 == this.field_h) {
                            /* Inlined CFG state: 25. */
                            {
                                var4 = ea.field_u;
                                statePc = 26;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 23. */
                            {
                                statePc = 26;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_22) {
                        statePc = ((Object) stateCaught_22 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_22);
                        }
                        caughtException = stateCaught_22;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (this.field_h == 3) {
                            /* Inlined CFG state: 29. */
                            {
                                var4 = qe.field_i;
                                statePc = 30;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 27. */
                            {
                                statePc = 30;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_26) {
                        statePc = ((Object) stateCaught_26 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_26);
                        }
                        caughtException = stateCaught_26;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (this.field_h != 4) {
                            statePc = 32;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 31. */
                            {
                                var4 = tj.field_A;
                                statePc = 32;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_30) {
                        statePc = ((Object) stateCaught_30 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_30);
                        }
                        caughtException = stateCaught_30;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (this.field_h == 5) {
                            /* Inlined CFG state: 35. */
                            {
                                var4 = hn.field_d;
                                statePc = 36;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 33. */
                            {
                                statePc = 36;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_32) {
                        statePc = ((Object) stateCaught_32 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_32);
                        }
                        caughtException = stateCaught_32;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        discarded$0 = this.a(true, 180, (byte) -106, false, bi.field_I + 32, 114, 182 + uc.field_a);
                        var3 = 210 + uc.field_a;
                        var2_int = bi.field_I + 90;
                        var13 = -1;
                        var14 = 0;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        statePc = ((Object) stateCaught_36 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_36);
                        }
                        caughtException = stateCaught_36;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (4 < var14) {
                            /* Inlined CFG state: 50. */
                            {
                                stackIn_51_0 = var13;
                                stackIn_51_1 = -1;
                                statePc = 51;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 38. */
                            {
                                stackIn_51_0 = 12;
                                stackIn_39_0 = stackIn_51_0;
                                stackIn_51_1 = b.field_f[var14];
                                stackIn_39_1 = stackIn_51_1;
                                if (false) {
                                    statePc = 51;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 39. */
                                    {
                                        if (stackIn_39_0 > stackIn_39_1) {
                                            statePc = 49;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 40. */
                                            {
                                                /* Sequential CFG blocks: 40, 42. */
                                                {
                                                }
                                                {
                                                    if (0 != b.field_f[var14] % 12) {
                                                        statePc = 49;
                                                        continue stateLoop;
                                                    } else {
                                                        /* Inlined CFG state: 43. */
                                                        {
                                                            /* Sequential CFG blocks: 43, 45. */
                                                            {
                                                            }
                                                            {
                                                                if (b.field_f[11 + var14] != 11 + b.field_f[var14]) {
                                                                    statePc = 49;
                                                                } else {
                                                                    statePc = 46;
                                                                }
                                                                continue stateLoop;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_37) {
                        statePc = ((Object) stateCaught_37 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_37);
                        }
                        caughtException = stateCaught_37;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        /* Sequential CFG blocks: 46, 48. */
                        {
                        }
                        {
                            var13 = b.field_f[var14] / 12 - 1;
                            statePc = 49;
                            continue stateLoop;
                        }
                    } catch (Throwable stateCaught_46) {
                        statePc = ((Object) stateCaught_46 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_46);
                        }
                        caughtException = stateCaught_46;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var14++;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        statePc = ((Object) stateCaught_49 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_49);
                        }
                        caughtException = stateCaught_49;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if ((stackIn_51_0 ^ stackIn_51_1) == 0) {
                            statePc = 112;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 52. */
                            {
                                var2_int -= 40;
                                var14 = 0;
                                var15 = 0;
                                var16_ref = null;
                                if (0 == var13) {
                                    statePc = 55;
                                } else {
                                    statePc = 53;
                                }
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_51) {
                        statePc = ((Object) stateCaught_51 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_51);
                        }
                        caughtException = stateCaught_51;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        statePc = ((Object) stateCaught_53 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_53);
                        }
                        caughtException = stateCaught_53;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var15 = 1;
                        var16_ref = lf.field_c;
                        var14 = 1;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        statePc = ((Object) stateCaught_55 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_55);
                        }
                        caughtException = stateCaught_55;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (var13 == 1) {
                            /* Inlined CFG state: 59. */
                            {
                                var16_ref = tf.field_j;
                                statePc = 60;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 57. */
                            {
                                statePc = 60;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_56) {
                        statePc = ((Object) stateCaught_56 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_56);
                        }
                        caughtException = stateCaught_56;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (var13 != 2) {
                            statePc = 62;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 61. */
                            {
                                var16_ref = ij.field_Pb;
                                var15 = 1;
                                var14 = 1;
                                statePc = 62;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_60) {
                        statePc = ((Object) stateCaught_60 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_60);
                        }
                        caughtException = stateCaught_60;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (var13 != 3) {
                            statePc = 64;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 63. */
                            {
                                var16_ref = fo.field_g;
                                statePc = 64;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_62) {
                        statePc = ((Object) stateCaught_62 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_62);
                        }
                        caughtException = stateCaught_62;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (var13 == 4) {
                            /* Inlined CFG state: 67. */
                            {
                                var16_ref = fc.field_e;
                                var14 = 1;
                                statePc = 68;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 65. */
                            {
                                statePc = 68;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_64) {
                        statePc = ((Object) stateCaught_64 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_64);
                        }
                        caughtException = stateCaught_64;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if (5 != var13) {
                            statePc = 70;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 69. */
                            {
                                var14 = 1;
                                var15 = 1;
                                var16_ref = ji.field_h;
                                statePc = 70;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_68) {
                        statePc = ((Object) stateCaught_68 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_68);
                        }
                        caughtException = stateCaught_68;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        if (var13 == 6) {
                            /* Inlined CFG state: 73. */
                            {
                                var16_ref = rc.field_k;
                                var14 = 1;
                                statePc = 74;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 71. */
                            {
                                statePc = 74;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_70) {
                        statePc = ((Object) stateCaught_70 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_70);
                        }
                        caughtException = stateCaught_70;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if (7 == var13) {
                            /* Inlined CFG state: 77. */
                            {
                                var16_ref = eo.field_a;
                                statePc = 78;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 75. */
                            {
                                statePc = 78;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_74) {
                        statePc = ((Object) stateCaught_74 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_74);
                        }
                        caughtException = stateCaught_74;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if (var13 != 8) {
                            statePc = 80;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 79. */
                            {
                                var15 = 1;
                                var14 = 1;
                                var16_ref = ae.field_a;
                                statePc = 80;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_78) {
                        statePc = ((Object) stateCaught_78 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_78);
                        }
                        caughtException = stateCaught_78;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if (var14 != 0) {
                            /* Inlined CFG state: 98. */
                            {
                                if (var15 == 0) {
                                    /* Inlined CFG state: 106. */
                                    {
                                        var17_int = -12;
                                        statePc = 107;
                                        continue stateLoop;
                                    }
                                } else {
                                    /* Inlined CFG state: 99. */
                                    {
                                        /* Sequential CFG blocks: 99, 101. */
                                        {
                                        }
                                        {
                                            var17_int = -8;
                                            statePc = 102;
                                            continue stateLoop;
                                        }
                                    }
                                }
                            }
                        } else {
                            /* Inlined CFG state: 81. */
                            {
                                var17_int = var2_int;
                                var18_int = var3;
                                var19 = 0;
                                var20 = 0;
                                var21 = 0;
                                var22 = 0;
                                var23 = 0;
                                var24 = 0;
                                var25 = 0;
                                var26 = 0;
                                var27 = (int)(8.0 * Math.cos(this.field_f * 2.0));
                                var28 = (int)(Math.sin(2.0 * this.field_f) * 8.0);
                                if (var27 <= 0) {
                                    statePc = 83;
                                } else {
                                    statePc = 82;
                                }
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_80) {
                        statePc = ((Object) stateCaught_80 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_80);
                        }
                        caughtException = stateCaught_80;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        var22 = -var27;
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        statePc = ((Object) stateCaught_82 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_82);
                        }
                        caughtException = stateCaught_82;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        var22 = 0;
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        statePc = ((Object) stateCaught_83 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_83);
                        }
                        caughtException = stateCaught_83;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        var21 = var28;
                        if (var27 < 0) {
                            /* Inlined CFG state: 86. */
                            {
                                var26 = var27;
                                statePc = 87;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 85. */
                            {
                                var26 = 0;
                                statePc = 87;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_84) {
                        statePc = ((Object) stateCaught_84 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_84);
                        }
                        caughtException = stateCaught_84;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        var25 = -var28;
                        var24 = -(var28 >> 2);
                        var26 += 2;
                        var23 = -6 - (var27 >> 1);
                        var20 = var28 >> 2;
                        var19 = 6 + (var27 >> 1);
                        var22 -= 2;
                        var29 = 0;
                        if (var15 == 0) {
                            statePc = 93;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        statePc = ((Object) stateCaught_87 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_87);
                        }
                        caughtException = stateCaught_87;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        var30 = -5;
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        statePc = ((Object) stateCaught_88 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_88);
                        }
                        caughtException = stateCaught_88;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        if (5 < var30) {
                            /* Inlined CFG state: 92. */
                            {
                                var29 = var29 + ((int)(4.0 * Math.sin(this.field_f)) + 32);
                                statePc = 97;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 90. */
                            {
                                var31 = (int)(2.0 * Math.sqrt((double)(-(var30 * var30) + 25)));
                                de.e(-var31 + (var2_int + 32), var30 + (var3 + 64), var31 * 2, 0, 128);
                                var30++;
                                statePc = 89;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_89) {
                        statePc = ((Object) stateCaught_89 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_89);
                        }
                        caughtException = stateCaught_89;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        var30 = -8;
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        statePc = ((Object) stateCaught_93 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_93);
                        }
                        caughtException = stateCaught_93;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        if (var30 > 8) {
                            statePc = 97;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 95. */
                            {
                                var31 = (int)(Math.sqrt((double)(-(var30 * var30) + 64)) * 2.0);
                                de.e(32 + (var2_int - var31), 64 + var3 + var30, var31 * 2, 0, 128);
                                var30++;
                                statePc = 94;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_94) {
                        statePc = ((Object) stateCaught_94 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_94);
                        }
                        caughtException = stateCaught_94;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        var2_int += 20;
                        var3 += 40;
                        var3 = var3 - var29;
                        pc.$cfr$intArgs$a$5f050b8899ac(kg.field_d[2], var20 + var3, kg.field_d[3], kg.field_d[0], -82, kg.field_d[1], (qb) (((Object[]) (var16_ref))[5]), var19 + var2_int);
                        pc.$cfr$intArgs$a$5f050b8899ac(kg.field_d[2], var3 + var22, kg.field_d[3], kg.field_d[0], -105, kg.field_d[1], (qb) (((Object[]) (var16_ref))[4]), var21 + var2_int);
                        pc.$cfr$intArgs$a$5f050b8899ac(kg.field_d[2], var3, kg.field_d[3], kg.field_d[0], 75, kg.field_d[1], (qb) (((Object[]) (var16_ref))[3]), var2_int);
                        var3 -= 3;
                        var3 -= 6;
                        pc.$cfr$intArgs$a$5f050b8899ac(kg.field_d[2], var3, kg.field_d[3], kg.field_d[0], -77, kg.field_d[1], (qb) (((Object[]) (var16_ref))[2]), var2_int);
                        var3 += 6;
                        var3 -= 6;
                        var3 += 3;
                        var3 += 6;
                        pc.$cfr$intArgs$a$5f050b8899ac(kg.field_d[2], var26 + var3, kg.field_d[3], kg.field_d[0], 51, kg.field_d[1], (qb) (((Object[]) (var16_ref))[1]), var2_int + var25);
                        pc.$cfr$intArgs$a$5f050b8899ac(kg.field_d[2], var24 + var3, kg.field_d[3], kg.field_d[0], 37, kg.field_d[1], (qb) (((Object[]) (var16_ref))[0]), var23 + var2_int);
                        var2_int = var17_int;
                        var3 = var18_int;
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        statePc = ((Object) stateCaught_97 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_97);
                        }
                        caughtException = stateCaught_97;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        if (var17_int > 8) {
                            /* Inlined CFG state: 105. */
                            {
                                var17_int = fo.field_k / 10 % java.lang.reflect.Array.getLength(var16_ref);
                                pc.$cfr$intArgs$a$5f050b8899ac(kg.field_d[2], var3 - ((qb) (((Object[]) (var16_ref))[var17_int])).field_w - (-32 + (int)(Math.sin(this.field_f) * 4.0)), kg.field_d[3], kg.field_d[0], 100, kg.field_d[1], (qb) (((Object[]) (var16_ref))[var17_int]), 32 + (-(((qb) (((Object[]) (var16_ref))[var17_int])).field_n / 2) + var2_int));
                                statePc = 111;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 103. */
                            {
                                var18_int = (int)(2.0 * Math.sqrt((double)(64 - var17_int * var17_int)));
                                de.e(32 + (var2_int - var18_int), 64 + (var17_int + var3), var18_int * 2, 0, 128);
                                var17_int++;
                                statePc = 102;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_102) {
                        statePc = ((Object) stateCaught_102 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_102);
                        }
                        caughtException = stateCaught_102;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        if (var17_int > 12) {
                            /* Inlined CFG state: 110. */
                            {
                                var17_int = fo.field_k / 10 % java.lang.reflect.Array.getLength(var16_ref);
                                pc.$cfr$intArgs$a$5f050b8899ac(kg.field_d[2], 64 - ((qb) (((Object[]) (var16_ref))[var17_int])).field_w + var3, kg.field_d[3], kg.field_d[0], 117, kg.field_d[1], (qb) (((Object[]) (var16_ref))[var17_int]), 32 + (-(((qb) (((Object[]) (var16_ref))[var17_int])).field_n / 2) + var2_int));
                                statePc = 111;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 108. */
                            {
                                var18_int = (int)(Math.sqrt((double)(144 - var17_int * var17_int)) * 2.0);
                                de.e(-var18_int + (var2_int + 32), var3 + var17_int + 64, 2 * var18_int, 0, 128);
                                var17_int++;
                                statePc = 107;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_107) {
                        statePc = ((Object) stateCaught_107 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_107);
                        }
                        caughtException = stateCaught_107;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        var2_int += 64;
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        statePc = ((Object) stateCaught_111 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_111);
                        }
                        caughtException = stateCaught_111;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        var14 = -16;
                        statePc = 113;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        statePc = ((Object) stateCaught_112 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_112);
                        }
                        caughtException = stateCaught_112;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        if (var14 > 16) {
                            /* Inlined CFG state: 116. */
                            {
                                if (!(6.28 < this.field_f)) {
                                    statePc = 119;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 117. */
                                    {
                                        this.field_f = this.field_f - 6.28;
                                        statePc = 119;
                                        continue stateLoop;
                                    }
                                }
                            }
                        } else {
                            /* Inlined CFG state: 114. */
                            {
                                var15 = (int)(Math.sqrt((double)(256 - var14 * var14)) * 2.0);
                                de.e(-var15 + (var2_int + 32), 64 + (var14 + var3), var15 * 2, 0, 128);
                                var14++;
                                statePc = 113;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_113) {
                        statePc = ((Object) stateCaught_113 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_113);
                        }
                        caughtException = stateCaught_113;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        if (!(0.0 > this.field_f)) {
                            statePc = 122;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 120. */
                            {
                                this.field_f = this.field_f + 6.28;
                                statePc = 122;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_119) {
                        statePc = ((Object) stateCaught_119 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_119);
                        }
                        caughtException = stateCaught_119;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        var14 = (int)(Math.cos(this.field_f) * 16.0);
                        var15 = (int)(16.0 * Math.sin(this.field_f));
                        var5 = -var15;
                        var6 = var15;
                        if (var14 <= 0) {
                            /* Inlined CFG state: 124. */
                            {
                                var8 = 0;
                                statePc = 125;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 123. */
                            {
                                var8 = -var14;
                                statePc = 125;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_122) {
                        statePc = ((Object) stateCaught_122 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_122);
                        }
                        caughtException = stateCaught_122;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        if (var14 < 0) {
                            /* Inlined CFG state: 127. */
                            {
                                var7 = var14;
                                statePc = 128;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 126. */
                            {
                                var7 = 0;
                                statePc = 128;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_125) {
                        statePc = ((Object) stateCaught_125 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_125);
                        }
                        caughtException = stateCaught_125;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        var10 = 16 + (var14 >> 1);
                        var11 = -(var15 >> 2);
                        var12 = var15 >> 2;
                        var9 = -(var14 >> 1) - 16;
                        var8 -= 2;
                        var7 += 2;
                        var16 = -ea.field_u[so.field_c[2]].field_o + (-ea.field_u[so.field_c[2]].field_y + ea.field_u[so.field_c[2]].field_w);
                        if (var11 > var16) {
                            statePc = 131;
                        } else {
                            statePc = 129;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        statePc = ((Object) stateCaught_128 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_128);
                        }
                        caughtException = stateCaught_128;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        statePc = ((Object) stateCaught_129 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_129);
                        }
                        caughtException = stateCaught_129;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        var11 = var16;
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        statePc = ((Object) stateCaught_131 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_131);
                        }
                        caughtException = stateCaught_131;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        var16 = -qe.field_i[so.field_c[3]].field_o - qe.field_i[so.field_c[3]].field_y + qe.field_i[so.field_c[3]].field_w;
                        if (var16 < var12) {
                            /* Inlined CFG state: 135. */
                            {
                                var12 = var16;
                                statePc = 136;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 133. */
                            {
                                statePc = 136;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_132) {
                        statePc = ((Object) stateCaught_132 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_132);
                        }
                        caughtException = stateCaught_132;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        var34 = new int[6];
                        var33 = var34;
                        var17 = var33;
                        var18_int = 0;
                        statePc = 137;
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        statePc = ((Object) stateCaught_136 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_136);
                        }
                        caughtException = stateCaught_136;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        if (var18_int >= 6) {
                            /* Inlined CFG state: 140. */
                            {
                                pc.$cfr$intArgs$a$5f050b8899ac(kg.field_d[2], var12 + var3, kg.field_d[3], kg.field_d[0], -121, kg.field_d[1], qe.field_i[so.field_c[3]], var2_int + var10);
                                if (46 != so.field_c[0]) {
                                    /* Inlined CFG state: 143. */
                                    {
                                        pc.$cfr$intArgs$a$5f050b8899ac(kg.field_d[2], var8 + var3, kg.field_d[3], kg.field_d[0], 105, kg.field_d[1], fn.field_b[0], var6 + var2_int);
                                        statePc = 144;
                                        continue stateLoop;
                                    }
                                } else {
                                    /* Inlined CFG state: 141. */
                                    {
                                        statePc = 144;
                                        continue stateLoop;
                                    }
                                }
                            }
                        } else {
                            /* Inlined CFG state: 138. */
                            {
                                var17[var18_int] = so.field_c[var18_int];
                                var18_int++;
                                statePc = 137;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_137) {
                        statePc = ((Object) stateCaught_137 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_137);
                        }
                        caughtException = stateCaught_137;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        pc.$cfr$intArgs$a$5f050b8899ac(kg.field_d[2], var3, kg.field_d[3], kg.field_d[0], -92, kg.field_d[1], jd.field_j[so.field_c[0]], var2_int);
                        var3 -= 8;
                        var3 -= 16;
                        pc.$cfr$intArgs$a$5f050b8899ac(kg.field_d[2], var3, kg.field_d[3], kg.field_d[0], 75, kg.field_d[1], kc.field_kb[so.field_c[1]], var2_int);
                        var3 += 16;
                        pc.$cfr$intArgs$a$5f050b8899ac(kg.field_d[2], var3, kg.field_d[3], kg.field_d[0], -80, kg.field_d[1], hn.field_d[so.field_c[5]], var2_int);
                        if (so.field_c[5] == 53) {
                            statePc = 150;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 145. */
                            {
                                if (so.field_c[5] != 55) {
                                    /* Inlined CFG state: 149. */
                                    {
                                        pc.$cfr$intArgs$a$5f050b8899ac(kg.field_d[2], var3, kg.field_d[3], kg.field_d[0], -99, kg.field_d[1], bo.field_a[0], var2_int);
                                        statePc = 150;
                                        continue stateLoop;
                                    }
                                } else {
                                    /* Inlined CFG state: 146. */
                                    {
                                        statePc = 150;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_144) {
                        statePc = ((Object) stateCaught_144 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_144);
                        }
                        caughtException = stateCaught_144;
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        var3 -= 16;
                        pc.$cfr$intArgs$a$5f050b8899ac(kg.field_d[2], var3, kg.field_d[3], kg.field_d[0], -109, kg.field_d[1], tj.field_A[so.field_c[4]], var2_int);
                        var3 += 8;
                        var3 += 16;
                        if (46 == so.field_c[0]) {
                            statePc = 153;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 151. */
                            {
                                pc.$cfr$intArgs$a$5f050b8899ac(kg.field_d[2], var3 + var7, kg.field_d[3], kg.field_d[0], -127, kg.field_d[1], h.field_I[0], var2_int + var5);
                                statePc = 153;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_150) {
                        statePc = ((Object) stateCaught_150 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_150);
                        }
                        caughtException = stateCaught_150;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        pc.$cfr$intArgs$a$5f050b8899ac(kg.field_d[2], var11 + var3, kg.field_d[3], kg.field_d[0], -95, kg.field_d[1], ea.field_u[so.field_c[2]], var9 + var2_int);
                        var18_int = 0;
                        statePc = 154;
                        continue stateLoop;
                    } catch (Throwable stateCaught_153) {
                        statePc = ((Object) stateCaught_153 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_153);
                        }
                        caughtException = stateCaught_153;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        if (var18_int >= 6) {
                            /* Inlined CFG state: 157. */
                            {
                                if (this.field_n <= 0) {
                                    /* Inlined CFG state: 174. */
                                    {
                                        /* Sequential CFG blocks: 174, 176. */
                                        {
                                            to.field_q.a(225 + bi.field_I, 182 + uc.field_a, 0);
                                        }
                                        {
                                            to.field_q.c(225 + bi.field_I, uc.field_a + 182, 128);
                                            statePc = 177;
                                            continue stateLoop;
                                        }
                                    }
                                } else {
                                    /* Inlined CFG state: 158. */
                                    {
                                        if (~(bi.field_I + 225) < ~an.field_g) {
                                            statePc = 172;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 159. */
                                            {
                                                /* Sequential CFG blocks: 159, 161. */
                                                {
                                                }
                                                {
                                                    if (~an.field_g <= ~(to.field_q.field_n + bi.field_I + 225)) {
                                                        statePc = 172;
                                                        continue stateLoop;
                                                    } else {
                                                        /* Inlined CFG state: 162. */
                                                        {
                                                            /* Sequential CFG blocks: 162, 164. */
                                                            {
                                                            }
                                                            {
                                                                if (~me.field_I > ~(uc.field_a + 182)) {
                                                                    statePc = 172;
                                                                } else {
                                                                    statePc = 165;
                                                                }
                                                                continue stateLoop;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            /* Inlined CFG state: 155. */
                            {
                                so.field_c[var18_int] = var34[var18_int];
                                var18_int++;
                                statePc = 154;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_154) {
                        statePc = ((Object) stateCaught_154 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_154);
                        }
                        caughtException = stateCaught_154;
                        continue stateLoop;
                    }
                }
                case 165: {
                    try {
                        /* Sequential CFG blocks: 165, 167. */
                        {
                        }
                        {
                            if (~me.field_I <= ~(to.field_q.field_w + (uc.field_a + 182))) {
                                statePc = 172;
                                continue stateLoop;
                            } else {
                                /* Inlined CFG state: 168. */
                                {
                                    /* Sequential CFG blocks: 168, 170. */
                                    {
                                    }
                                    {
                                        to.field_q.a(225 + bi.field_I, 182 + uc.field_a, 16777215);
                                        to.field_q.c(bi.field_I + 225, 182 + uc.field_a, 128);
                                        this.field_i = -3;
                                        this.field_m = 6;
                                        statePc = 177;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_165) {
                        statePc = ((Object) stateCaught_165 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_165);
                        }
                        caughtException = stateCaught_165;
                        continue stateLoop;
                    }
                }
                case 172: {
                    try {
                        to.field_q.c(225 + bi.field_I, uc.field_a + 182);
                        statePc = 177;
                        continue stateLoop;
                    } catch (Throwable stateCaught_172) {
                        statePc = ((Object) stateCaught_172 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_172);
                        }
                        caughtException = stateCaught_172;
                        continue stateLoop;
                    }
                }
                case 177: {
                    try {
                        if (this.field_n >= -27 + mb.a(this.field_h, 813231272)) {
                            /* Inlined CFG state: 189. */
                            {
                                this.field_b.a(590 + bi.field_I, uc.field_a + 182, 0);
                                this.field_b.c(590 + bi.field_I, 182 + uc.field_a, 128);
                                statePc = 191;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 178. */
                            {
                                if (mi.a(to.field_q.field_w, uc.field_a + 182, to.field_q.field_n, param0 ^ -12, 590 + bi.field_I)) {
                                    /* Inlined CFG state: 183. */
                                    {
                                        if (this.field_b == null) {
                                            /* Inlined CFG state: 187. */
                                            {
                                                this.field_b = to.field_q.b();
                                                statePc = 188;
                                                continue stateLoop;
                                            }
                                        } else {
                                            /* Inlined CFG state: 184. */
                                            {
                                                statePc = 188;
                                                continue stateLoop;
                                            }
                                        }
                                    }
                                } else {
                                    /* Inlined CFG state: 179. */
                                    {
                                        /* Sequential CFG blocks: 179, 181. */
                                        {
                                        }
                                        {
                                            to.field_q.e(bi.field_I + 590, uc.field_a + 182);
                                            statePc = 191;
                                            continue stateLoop;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_177) {
                        statePc = ((Object) stateCaught_177 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_177);
                        }
                        caughtException = stateCaught_177;
                        continue stateLoop;
                    }
                }
                case 188: {
                    try {
                        this.field_b.a(bi.field_I + 590, 182 + uc.field_a, 16777215);
                        this.field_b.c(bi.field_I + 590, uc.field_a + 182, 128);
                        this.field_i = 3;
                        this.field_m = 6;
                        statePc = 191;
                        continue stateLoop;
                    } catch (Throwable stateCaught_188) {
                        statePc = ((Object) stateCaught_188 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_188);
                        }
                        caughtException = stateCaught_188;
                        continue stateLoop;
                    }
                }
                case 191: {
                    try {
                        discarded$1 = this.a(false, 330, (byte) -24, false, bi.field_I + 254, 114, 182 + uc.field_a);
                        if (var4 != null) {
                            statePc = 194;
                        } else {
                            statePc = 192;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_191) {
                        statePc = ((Object) stateCaught_191 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_191);
                        }
                        caughtException = stateCaught_191;
                        continue stateLoop;
                    }
                }
                case 192: {
                    try {
                        statePc = 200;
                        continue stateLoop;
                    } catch (Throwable stateCaught_192) {
                        statePc = ((Object) stateCaught_192 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_192);
                        }
                        caughtException = stateCaught_192;
                        continue stateLoop;
                    }
                }
                case 194: {
                    try {
                        var18_int = mb.a(this.field_h, 813231272);
                        statePc = 195;
                        continue stateLoop;
                    } catch (Throwable stateCaught_194) {
                        statePc = ((Object) stateCaught_194 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_194);
                        }
                        caughtException = stateCaught_194;
                        continue stateLoop;
                    }
                }
                case 195: {
                    try {
                        if (0 <= this.field_n) {
                            statePc = 198;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 196. */
                            {
                                this.field_n = this.field_n + var18_int;
                                statePc = 195;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_195) {
                        statePc = ((Object) stateCaught_195 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_195);
                        }
                        caughtException = stateCaught_195;
                        continue stateLoop;
                    }
                }
                case 198: {
                    try {
                        if (~var18_int < ~this.field_n) {
                            statePc = 200;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 199. */
                            {
                                this.field_n = this.field_n - var18_int;
                                statePc = 198;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_198) {
                        statePc = ((Object) stateCaught_198 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_198);
                        }
                        caughtException = stateCaught_198;
                        continue stateLoop;
                    }
                }
                case 200: {
                    try {
                        var18 = null;
                        var19 = 0;
                        var20 = 0;
                        var3 = uc.field_a + 188;
                        var2_int = 264 + bi.field_I;
                        if (param0 == 12) {
                            statePc = 203;
                        } else {
                            statePc = 201;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_200) {
                        statePc = ((Object) stateCaught_200 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_200);
                        }
                        caughtException = stateCaught_200;
                        continue stateLoop;
                    }
                }
                case 201: {
                    try {
                        discarded$2 = this.a((byte) 5, -89);
                        statePc = 203;
                        continue stateLoop;
                    } catch (Throwable stateCaught_201) {
                        statePc = ((Object) stateCaught_201 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_201);
                        }
                        caughtException = stateCaught_201;
                        continue stateLoop;
                    }
                }
                case 203: {
                    try {
                        var21 = this.field_n;
                        var22 = 35;
                        var23 = 0;
                        statePc = 204;
                        continue stateLoop;
                    } catch (Throwable stateCaught_203) {
                        statePc = ((Object) stateCaught_203 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_203);
                        }
                        caughtException = stateCaught_203;
                        continue stateLoop;
                    }
                }
                case 204: {
                    try {
                        stackIn_205_0 = var23;
                        stackIn_205_1 = 9;
                        statePc = 205;
                        continue stateLoop;
                    } catch (Throwable stateCaught_204) {
                        statePc = ((Object) stateCaught_204 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_204);
                        }
                        caughtException = stateCaught_204;
                        continue stateLoop;
                    }
                }
                case 205: {
                    try {
                        if (stackIn_205_0 >= stackIn_205_1) {
                            /* Inlined CFG state: 674. */
                            {
                                if (var18 != null) {
                                    /* Inlined CFG state: 677. */
                                    {
                                        mi.field_B.a((String) (var18), 96 + var19 * var22 + (var2_int - 256), var22 * var20 + (var3 - 1) - 16, 256, 64, 0, 0, 1, 0, mi.field_B.field_C);
                                        mi.field_B.a((String) (var18), 96 + (-1 + (var19 * var22 + (var2_int - 256))), -16 + (var3 + var22 * var20), 256, 64, 0, 0, 1, 0, mi.field_B.field_C);
                                        mi.field_B.a((String) (var18), 97 + (var2_int + var22 * var19) - 256, -16 + var22 * var20 + var3, 256, 64, 0, 0, 1, 0, mi.field_B.field_C);
                                        mi.field_B.a((String) (var18), -256 + (var2_int + var19 * var22) + 96, var22 * var20 + (var3 - 15), 256, 64, 0, 0, 1, 0, mi.field_B.field_C);
                                        mi.field_B.a((String) (var18), -160 + var2_int + var22 * var19, -16 + (var3 + var22 * var20), 256, 64, 16777215, 0, 1, 0, mi.field_B.field_C);
                                        statePc = 678;
                                        continue stateLoop;
                                    }
                                } else {
                                    /* Inlined CFG state: 675. */
                                    {
                                        statePc = 678;
                                        continue stateLoop;
                                    }
                                }
                            }
                        } else {
                            /* Inlined CFG state: 206. */
                            {
                                var24 = 0;
                                statePc = 207;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_205) {
                        statePc = ((Object) stateCaught_205 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_205);
                        }
                        caughtException = stateCaught_205;
                        continue stateLoop;
                    }
                }
                case 207: {
                    try {
                        if (var24 >= 3) {
                            /* Inlined CFG state: 673. */
                            {
                                var23++;
                                statePc = 204;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 208. */
                            {
                                stackIn_205_0 = mb.a(this.field_h, 813231272);
                                stackIn_209_0 = stackIn_205_0;
                                stackIn_205_1 = var21;
                                stackIn_209_1 = stackIn_205_1;
                                if (false) {
                                    statePc = 205;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 209. */
                                    {
                                        if (stackIn_209_0 <= stackIn_209_1) {
                                            statePc = 672;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 210. */
                                            {
                                                de.a(-1 + (var22 * var23 + var2_int), var24 * var22 + var3 - 1, 34, 34, 8745077);
                                                de.a(var2_int + var22 * var23, var3 + var24 * var22, 32, 32, 5720140);
                                                var25 = 14207693;
                                                var26 = 0;
                                                var27 = -1;
                                                var28 = 64;
                                                var29 = -1;
                                                if (this.field_h != 0) {
                                                    statePc = 322;
                                                    continue stateLoop;
                                                } else {
                                                    /* Inlined CFG state: 211. */
                                                    {
                                                        var28 = 48;
                                                        if (12 > var21) {
                                                            statePc = 217;
                                                        } else {
                                                            statePc = 212;
                                                        }
                                                        continue stateLoop;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_207) {
                        statePc = ((Object) stateCaught_207 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_207);
                        }
                        caughtException = stateCaught_207;
                        continue stateLoop;
                    }
                }
                case 212: {
                    try {
                        if (var21 < 15) {
                            /* Inlined CFG state: 216. */
                            {
                                var27 = 0;
                                var25 = var25 + 2105376;
                                statePc = 217;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 213. */
                            {
                                statePc = 217;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_212) {
                        statePc = ((Object) stateCaught_212 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_212);
                        }
                        caughtException = stateCaught_212;
                        continue stateLoop;
                    }
                }
                case 217: {
                    try {
                        if (var21 < 15) {
                            statePc = 222;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 218. */
                            {
                                if (var21 >= 18) {
                                    statePc = 222;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 219. */
                                    {
                                        /* Sequential CFG blocks: 219, 221. */
                                        {
                                        }
                                        {
                                            var27 = 1;
                                            statePc = 222;
                                            continue stateLoop;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_217) {
                        statePc = ((Object) stateCaught_217 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_217);
                        }
                        caughtException = stateCaught_217;
                        continue stateLoop;
                    }
                }
                case 222: {
                    try {
                        if (var21 < 18) {
                            statePc = 228;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 223. */
                            {
                                if (var21 < 21) {
                                    /* Inlined CFG state: 227. */
                                    {
                                        var27 = 2;
                                        var25 = var25 + 2105376;
                                        statePc = 228;
                                        continue stateLoop;
                                    }
                                } else {
                                    /* Inlined CFG state: 224. */
                                    {
                                        statePc = 228;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_222) {
                        statePc = ((Object) stateCaught_222 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_222);
                        }
                        caughtException = stateCaught_222;
                        continue stateLoop;
                    }
                }
                case 228: {
                    try {
                        if (var21 < 21) {
                            statePc = 234;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 229. */
                            {
                                if (var21 < 24) {
                                    /* Inlined CFG state: 233. */
                                    {
                                        var27 = 3;
                                        statePc = 234;
                                        continue stateLoop;
                                    }
                                } else {
                                    /* Inlined CFG state: 230. */
                                    {
                                        statePc = 234;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_228) {
                        statePc = ((Object) stateCaught_228 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_228);
                        }
                        caughtException = stateCaught_228;
                        continue stateLoop;
                    }
                }
                case 234: {
                    try {
                        if (var21 < 24) {
                            statePc = 240;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 235. */
                            {
                                if (var21 < 27) {
                                    /* Inlined CFG state: 239. */
                                    {
                                        var25 = var25 + 2105376;
                                        var27 = 4;
                                        statePc = 240;
                                        continue stateLoop;
                                    }
                                } else {
                                    /* Inlined CFG state: 236. */
                                    {
                                        statePc = 240;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_234) {
                        statePc = ((Object) stateCaught_234 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_234);
                        }
                        caughtException = stateCaught_234;
                        continue stateLoop;
                    }
                }
                case 240: {
                    try {
                        if (var21 < 27) {
                            statePc = 246;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 241. */
                            {
                                if (30 > var21) {
                                    /* Inlined CFG state: 245. */
                                    {
                                        var27 = 5;
                                        statePc = 246;
                                        continue stateLoop;
                                    }
                                } else {
                                    /* Inlined CFG state: 242. */
                                    {
                                        statePc = 246;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_240) {
                        statePc = ((Object) stateCaught_240 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_240);
                        }
                        caughtException = stateCaught_240;
                        continue stateLoop;
                    }
                }
                case 246: {
                    try {
                        if (var21 == 30) {
                            statePc = 251;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 247. */
                            {
                                if (33 == var21) {
                                    statePc = 251;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 248. */
                                    {
                                        statePc = 252;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_246) {
                        statePc = ((Object) stateCaught_246 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_246);
                        }
                        caughtException = stateCaught_246;
                        continue stateLoop;
                    }
                }
                case 251: {
                    try {
                        var25 = var25 + 2105376;
                        var27 = 6;
                        statePc = 252;
                        continue stateLoop;
                    } catch (Throwable stateCaught_251) {
                        statePc = ((Object) stateCaught_251 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_251);
                        }
                        caughtException = stateCaught_251;
                        continue stateLoop;
                    }
                }
                case 252: {
                    try {
                        if (31 == var21) {
                            statePc = 257;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 253. */
                            {
                                if (var21 == 34) {
                                    statePc = 257;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 254. */
                                    {
                                        statePc = 258;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_252) {
                        statePc = ((Object) stateCaught_252 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_252);
                        }
                        caughtException = stateCaught_252;
                        continue stateLoop;
                    }
                }
                case 257: {
                    try {
                        var27 = 7;
                        statePc = 258;
                        continue stateLoop;
                    } catch (Throwable stateCaught_257) {
                        statePc = ((Object) stateCaught_257 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_257);
                        }
                        caughtException = stateCaught_257;
                        continue stateLoop;
                    }
                }
                case 258: {
                    try {
                        if (var21 == 32) {
                            statePc = 262;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 259. */
                            {
                                if (var21 != 35) {
                                    statePc = 263;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 260. */
                                    {
                                        statePc = 262;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_258) {
                        statePc = ((Object) stateCaught_258 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_258);
                        }
                        caughtException = stateCaught_258;
                        continue stateLoop;
                    }
                }
                case 262: {
                    try {
                        var25 = var25 + 2105376;
                        var27 = 8;
                        statePc = 263;
                        continue stateLoop;
                    } catch (Throwable stateCaught_262) {
                        statePc = ((Object) stateCaught_262 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_262);
                        }
                        caughtException = stateCaught_262;
                        continue stateLoop;
                    }
                }
                case 263: {
                    try {
                        if (var21 == 36) {
                            statePc = 268;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 264. */
                            {
                                if (var21 == 39) {
                                    statePc = 268;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 265. */
                                    {
                                        statePc = 269;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_263) {
                        statePc = ((Object) stateCaught_263 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_263);
                        }
                        caughtException = stateCaught_263;
                        continue stateLoop;
                    }
                }
                case 268: {
                    try {
                        var27 = 9;
                        statePc = 269;
                        continue stateLoop;
                    } catch (Throwable stateCaught_268) {
                        statePc = ((Object) stateCaught_268 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_268);
                        }
                        caughtException = stateCaught_268;
                        continue stateLoop;
                    }
                }
                case 269: {
                    try {
                        if (var21 == 37) {
                            statePc = 274;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 270. */
                            {
                                if (var21 == 40) {
                                    statePc = 274;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 271. */
                                    {
                                        statePc = 275;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_269) {
                        statePc = ((Object) stateCaught_269 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_269);
                        }
                        caughtException = stateCaught_269;
                        continue stateLoop;
                    }
                }
                case 274: {
                    try {
                        var27 = 10;
                        var25 = var25 + 2105376;
                        statePc = 275;
                        continue stateLoop;
                    } catch (Throwable stateCaught_274) {
                        statePc = ((Object) stateCaught_274 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_274);
                        }
                        caughtException = stateCaught_274;
                        continue stateLoop;
                    }
                }
                case 275: {
                    try {
                        if (38 == var21) {
                            statePc = 280;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 276. */
                            {
                                if (var21 == 41) {
                                    statePc = 280;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 277. */
                                    {
                                        statePc = 281;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_275) {
                        statePc = ((Object) stateCaught_275 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_275);
                        }
                        caughtException = stateCaught_275;
                        continue stateLoop;
                    }
                }
                case 280: {
                    try {
                        var27 = 11;
                        statePc = 281;
                        continue stateLoop;
                    } catch (Throwable stateCaught_280) {
                        statePc = ((Object) stateCaught_280 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_280);
                        }
                        caughtException = stateCaught_280;
                        continue stateLoop;
                    }
                }
                case 281: {
                    try {
                        if (var21 == 42) {
                            statePc = 285;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 282. */
                            {
                                if (var21 != 45) {
                                    statePc = 286;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 283. */
                                    {
                                        statePc = 285;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_281) {
                        statePc = ((Object) stateCaught_281 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_281);
                        }
                        caughtException = stateCaught_281;
                        continue stateLoop;
                    }
                }
                case 285: {
                    try {
                        var27 = 16;
                        var25 = var25 + 2105376;
                        statePc = 286;
                        continue stateLoop;
                    } catch (Throwable stateCaught_285) {
                        statePc = ((Object) stateCaught_285 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_285);
                        }
                        caughtException = stateCaught_285;
                        continue stateLoop;
                    }
                }
                case 286: {
                    try {
                        if (var21 == 43) {
                            statePc = 291;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 287. */
                            {
                                if (var21 == 46) {
                                    statePc = 291;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 288. */
                                    {
                                        statePc = 292;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_286) {
                        statePc = ((Object) stateCaught_286 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_286);
                        }
                        caughtException = stateCaught_286;
                        continue stateLoop;
                    }
                }
                case 291: {
                    try {
                        var27 = 17;
                        statePc = 292;
                        continue stateLoop;
                    } catch (Throwable stateCaught_291) {
                        statePc = ((Object) stateCaught_291 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_291);
                        }
                        caughtException = stateCaught_291;
                        continue stateLoop;
                    }
                }
                case 292: {
                    try {
                        if (44 != var21) {
                            statePc = 294;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 293. */
                            {
                                var25 = var25 + 2105376;
                                var27 = 26;
                                statePc = 294;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_292) {
                        statePc = ((Object) stateCaught_292 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_292);
                        }
                        caughtException = stateCaught_292;
                        continue stateLoop;
                    }
                }
                case 294: {
                    try {
                        if (var21 != 47) {
                            statePc = 296;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 295. */
                            {
                                var27 = 28;
                                var25 = var25 + 2105376;
                                statePc = 296;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_294) {
                        statePc = ((Object) stateCaught_294 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_294);
                        }
                        caughtException = stateCaught_294;
                        continue stateLoop;
                    }
                }
                case 296: {
                    try {
                        if (var21 != 48) {
                            statePc = 298;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 297. */
                            {
                                var29 = 0;
                                var25 = var25 + 2105376;
                                statePc = 298;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_296) {
                        statePc = ((Object) stateCaught_296 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_296);
                        }
                        caughtException = stateCaught_296;
                        continue stateLoop;
                    }
                }
                case 298: {
                    try {
                        if (var21 == 49) {
                            /* Inlined CFG state: 301. */
                            {
                                var25 = var25 + 2105376;
                                var29 = 0;
                                statePc = 302;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 299. */
                            {
                                statePc = 302;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_298) {
                        statePc = ((Object) stateCaught_298 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_298);
                        }
                        caughtException = stateCaught_298;
                        continue stateLoop;
                    }
                }
                case 302: {
                    try {
                        if (50 == var21) {
                            /* Inlined CFG state: 305. */
                            {
                                var25 = var25 + 2105376;
                                var29 = 1;
                                statePc = 306;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 303. */
                            {
                                statePc = 306;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_302) {
                        statePc = ((Object) stateCaught_302 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_302);
                        }
                        caughtException = stateCaught_302;
                        continue stateLoop;
                    }
                }
                case 306: {
                    try {
                        if (var21 != 51) {
                            statePc = 308;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 307. */
                            {
                                var29 = 2;
                                statePc = 308;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_306) {
                        statePc = ((Object) stateCaught_306 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_306);
                        }
                        caughtException = stateCaught_306;
                        continue stateLoop;
                    }
                }
                case 308: {
                    try {
                        if (var21 != 52) {
                            statePc = 310;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 309. */
                            {
                                var29 = 2;
                                statePc = 310;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_308) {
                        statePc = ((Object) stateCaught_308 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_308);
                        }
                        caughtException = stateCaught_308;
                        continue stateLoop;
                    }
                }
                case 310: {
                    try {
                        if (var21 == 53) {
                            /* Inlined CFG state: 313. */
                            {
                                var29 = 2;
                                statePc = 314;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 311. */
                            {
                                statePc = 314;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_310) {
                        statePc = ((Object) stateCaught_310 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_310);
                        }
                        caughtException = stateCaught_310;
                        continue stateLoop;
                    }
                }
                case 314: {
                    try {
                        if (54 != var21) {
                            statePc = 316;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 315. */
                            {
                                var27 = 55;
                                var25 = var25 + 2105376;
                                statePc = 316;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_314) {
                        statePc = ((Object) stateCaught_314 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_314);
                        }
                        caughtException = stateCaught_314;
                        continue stateLoop;
                    }
                }
                case 316: {
                    try {
                        if (var21 != 55) {
                            statePc = 318;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 317. */
                            {
                                var25 = var25 + 2105376;
                                var27 = 55;
                                statePc = 318;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_316) {
                        statePc = ((Object) stateCaught_316 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_316);
                        }
                        caughtException = stateCaught_316;
                        continue stateLoop;
                    }
                }
                case 318: {
                    try {
                        if (var21 == 56) {
                            /* Inlined CFG state: 321. */
                            {
                                var27 = 55;
                                var25 = var25 + 2105376;
                                statePc = 322;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 319. */
                            {
                                statePc = 322;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_318) {
                        statePc = ((Object) stateCaught_318 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_318);
                        }
                        caughtException = stateCaught_318;
                        continue stateLoop;
                    }
                }
                case 322: {
                    try {
                        if (this.field_h != 2) {
                            statePc = 402;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 323. */
                            {
                                var28 = 48;
                                if (var21 < 12) {
                                    statePc = 328;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 324. */
                                    {
                                        if (var21 >= 15) {
                                            statePc = 328;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 325. */
                                            {
                                                /* Sequential CFG blocks: 325, 327. */
                                                {
                                                }
                                                {
                                                    var25 = var25 + 2105376;
                                                    var27 = 0;
                                                    statePc = 328;
                                                    continue stateLoop;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_322) {
                        statePc = ((Object) stateCaught_322 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_322);
                        }
                        caughtException = stateCaught_322;
                        continue stateLoop;
                    }
                }
                case 328: {
                    try {
                        if (var21 < 15) {
                            statePc = 333;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 329. */
                            {
                                if (18 <= var21) {
                                    statePc = 333;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 330. */
                                    {
                                        /* Sequential CFG blocks: 330, 332. */
                                        {
                                        }
                                        {
                                            var27 = 1;
                                            statePc = 333;
                                            continue stateLoop;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_328) {
                        statePc = ((Object) stateCaught_328 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_328);
                        }
                        caughtException = stateCaught_328;
                        continue stateLoop;
                    }
                }
                case 333: {
                    try {
                        if (var21 < 18) {
                            statePc = 339;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 334. */
                            {
                                if (21 > var21) {
                                    /* Inlined CFG state: 338. */
                                    {
                                        var27 = 2;
                                        var25 = var25 + 2105376;
                                        statePc = 339;
                                        continue stateLoop;
                                    }
                                } else {
                                    /* Inlined CFG state: 335. */
                                    {
                                        statePc = 339;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_333) {
                        statePc = ((Object) stateCaught_333 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_333);
                        }
                        caughtException = stateCaught_333;
                        continue stateLoop;
                    }
                }
                case 339: {
                    try {
                        if (var21 < 21) {
                            statePc = 344;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 340. */
                            {
                                if (var21 >= 24) {
                                    statePc = 344;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 341. */
                                    {
                                        /* Sequential CFG blocks: 341, 343. */
                                        {
                                        }
                                        {
                                            var27 = 3;
                                            statePc = 344;
                                            continue stateLoop;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_339) {
                        statePc = ((Object) stateCaught_339 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_339);
                        }
                        caughtException = stateCaught_339;
                        continue stateLoop;
                    }
                }
                case 344: {
                    try {
                        if (var21 < 24) {
                            statePc = 350;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 345. */
                            {
                                if (27 > var21) {
                                    /* Inlined CFG state: 349. */
                                    {
                                        var27 = 4;
                                        var25 = var25 + 2105376;
                                        statePc = 350;
                                        continue stateLoop;
                                    }
                                } else {
                                    /* Inlined CFG state: 346. */
                                    {
                                        statePc = 350;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_344) {
                        statePc = ((Object) stateCaught_344 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_344);
                        }
                        caughtException = stateCaught_344;
                        continue stateLoop;
                    }
                }
                case 350: {
                    try {
                        if (var21 < 27) {
                            statePc = 356;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 351. */
                            {
                                if (var21 < 30) {
                                    /* Inlined CFG state: 355. */
                                    {
                                        var27 = 5;
                                        statePc = 356;
                                        continue stateLoop;
                                    }
                                } else {
                                    /* Inlined CFG state: 352. */
                                    {
                                        statePc = 356;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_350) {
                        statePc = ((Object) stateCaught_350 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_350);
                        }
                        caughtException = stateCaught_350;
                        continue stateLoop;
                    }
                }
                case 356: {
                    try {
                        if (var21 == 30) {
                            statePc = 360;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 357. */
                            {
                                if (var21 != 33) {
                                    statePc = 361;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 358. */
                                    {
                                        statePc = 360;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_356) {
                        statePc = ((Object) stateCaught_356 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_356);
                        }
                        caughtException = stateCaught_356;
                        continue stateLoop;
                    }
                }
                case 360: {
                    try {
                        var27 = 6;
                        var25 = var25 + 2105376;
                        statePc = 361;
                        continue stateLoop;
                    } catch (Throwable stateCaught_360) {
                        statePc = ((Object) stateCaught_360 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_360);
                        }
                        caughtException = stateCaught_360;
                        continue stateLoop;
                    }
                }
                case 361: {
                    try {
                        if (var21 == 31) {
                            statePc = 365;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 362. */
                            {
                                if (var21 != 34) {
                                    statePc = 366;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 363. */
                                    {
                                        statePc = 365;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_361) {
                        statePc = ((Object) stateCaught_361 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_361);
                        }
                        caughtException = stateCaught_361;
                        continue stateLoop;
                    }
                }
                case 365: {
                    try {
                        var27 = 7;
                        statePc = 366;
                        continue stateLoop;
                    } catch (Throwable stateCaught_365) {
                        statePc = ((Object) stateCaught_365 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_365);
                        }
                        caughtException = stateCaught_365;
                        continue stateLoop;
                    }
                }
                case 366: {
                    try {
                        if (var21 == 32) {
                            statePc = 371;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 367. */
                            {
                                if (var21 == 35) {
                                    statePc = 371;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 368. */
                                    {
                                        statePc = 372;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_366) {
                        statePc = ((Object) stateCaught_366 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_366);
                        }
                        caughtException = stateCaught_366;
                        continue stateLoop;
                    }
                }
                case 371: {
                    try {
                        var27 = 8;
                        var25 = var25 + 2105376;
                        statePc = 372;
                        continue stateLoop;
                    } catch (Throwable stateCaught_371) {
                        statePc = ((Object) stateCaught_371 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_371);
                        }
                        caughtException = stateCaught_371;
                        continue stateLoop;
                    }
                }
                case 372: {
                    try {
                        if (var21 == 36) {
                            statePc = 377;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 373. */
                            {
                                if (var21 == 39) {
                                    statePc = 377;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 374. */
                                    {
                                        statePc = 378;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_372) {
                        statePc = ((Object) stateCaught_372 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_372);
                        }
                        caughtException = stateCaught_372;
                        continue stateLoop;
                    }
                }
                case 377: {
                    try {
                        var27 = 9;
                        statePc = 378;
                        continue stateLoop;
                    } catch (Throwable stateCaught_377) {
                        statePc = ((Object) stateCaught_377 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_377);
                        }
                        caughtException = stateCaught_377;
                        continue stateLoop;
                    }
                }
                case 378: {
                    try {
                        switch (var21) {
                            case 37: statePc = -1; break;
                            case 40: statePc = -1; break;
                            case 38: statePc = -1; break;
                            case 41: statePc = -1; break;
                            case 42: statePc = -1; break;
                            case 45: statePc = -1; break;
                            case 43: statePc = 381; break;
                            case 46: statePc = 381; break;
                            default: statePc = 382; break;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_378) {
                        statePc = ((Object) stateCaught_378 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_378);
                        }
                        caughtException = stateCaught_378;
                        continue stateLoop;
                    }
                }
                case 381: {
                    try {
                        var27 = 17;
                        statePc = 382;
                        continue stateLoop;
                    } catch (Throwable stateCaught_381) {
                        statePc = ((Object) stateCaught_381 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_381);
                        }
                        caughtException = stateCaught_381;
                        continue stateLoop;
                    }
                }
                case 382: {
                    try {
                        if (var21 == 44) {
                            /* Inlined CFG state: 385. */
                            {
                                var27 = 26;
                                var25 = var25 + 2105376;
                                statePc = 386;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 383. */
                            {
                                statePc = 386;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_382) {
                        statePc = ((Object) stateCaught_382 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_382);
                        }
                        caughtException = stateCaught_382;
                        continue stateLoop;
                    }
                }
                case 386: {
                    try {
                        if (var21 != 47) {
                            statePc = 388;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 387. */
                            {
                                var25 = var25 + 2105376;
                                var27 = 28;
                                statePc = 388;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_386) {
                        statePc = ((Object) stateCaught_386 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_386);
                        }
                        caughtException = stateCaught_386;
                        continue stateLoop;
                    }
                }
                case 388: {
                    try {
                        if (48 != var21) {
                            statePc = 390;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 389. */
                            {
                                var29 = 0;
                                var25 = var25 + 2105376;
                                statePc = 390;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_388) {
                        statePc = ((Object) stateCaught_388 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_388);
                        }
                        caughtException = stateCaught_388;
                        continue stateLoop;
                    }
                }
                case 390: {
                    try {
                        if (49 != var21) {
                            statePc = 392;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 391. */
                            {
                                var29 = 0;
                                var25 = var25 + 2105376;
                                statePc = 392;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_390) {
                        statePc = ((Object) stateCaught_390 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_390);
                        }
                        caughtException = stateCaught_390;
                        continue stateLoop;
                    }
                }
                case 392: {
                    try {
                        if (50 != var21) {
                            statePc = 394;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 393. */
                            {
                                var29 = 1;
                                var25 = var25 + 2105376;
                                statePc = 394;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_392) {
                        statePc = ((Object) stateCaught_392 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_392);
                        }
                        caughtException = stateCaught_392;
                        continue stateLoop;
                    }
                }
                case 394: {
                    try {
                        if (var21 != 51) {
                            statePc = 396;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 395. */
                            {
                                var29 = 2;
                                statePc = 396;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_394) {
                        statePc = ((Object) stateCaught_394 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_394);
                        }
                        caughtException = stateCaught_394;
                        continue stateLoop;
                    }
                }
                case 396: {
                    try {
                        if (var21 == 52) {
                            /* Inlined CFG state: 399. */
                            {
                                var29 = 2;
                                statePc = 400;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 397. */
                            {
                                statePc = 400;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_396) {
                        statePc = ((Object) stateCaught_396 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_396);
                        }
                        caughtException = stateCaught_396;
                        continue stateLoop;
                    }
                }
                case 400: {
                    try {
                        if (var21 != 53) {
                            statePc = 402;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 401. */
                            {
                                var29 = 2;
                                statePc = 402;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_400) {
                        statePc = ((Object) stateCaught_400 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_400);
                        }
                        caughtException = stateCaught_400;
                        continue stateLoop;
                    }
                }
                case 402: {
                    try {
                        if (this.field_h == 3) {
                            /* Inlined CFG state: 405. */
                            {
                                if (var21 < 12) {
                                    statePc = 411;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 406. */
                                    {
                                        if (var21 < 15) {
                                            /* Inlined CFG state: 410. */
                                            {
                                                var27 = 0;
                                                var25 = var25 + 2105376;
                                                statePc = 411;
                                                continue stateLoop;
                                            }
                                        } else {
                                            /* Inlined CFG state: 407. */
                                            {
                                                statePc = 411;
                                                continue stateLoop;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            /* Inlined CFG state: 403. */
                            {
                                statePc = 489;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_402) {
                        statePc = ((Object) stateCaught_402 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_402);
                        }
                        caughtException = stateCaught_402;
                        continue stateLoop;
                    }
                }
                case 411: {
                    try {
                        var28 = 48;
                        if (var21 < 15) {
                            statePc = 416;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 412. */
                            {
                                if (var21 >= 18) {
                                    statePc = 416;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 413. */
                                    {
                                        /* Sequential CFG blocks: 413, 415. */
                                        {
                                        }
                                        {
                                            var27 = 1;
                                            statePc = 416;
                                            continue stateLoop;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_411) {
                        statePc = ((Object) stateCaught_411 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_411);
                        }
                        caughtException = stateCaught_411;
                        continue stateLoop;
                    }
                }
                case 416: {
                    try {
                        if (var21 < 18) {
                            statePc = 422;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 417. */
                            {
                                if (var21 < 21) {
                                    /* Inlined CFG state: 421. */
                                    {
                                        var25 = var25 + 2105376;
                                        var27 = 2;
                                        statePc = 422;
                                        continue stateLoop;
                                    }
                                } else {
                                    /* Inlined CFG state: 418. */
                                    {
                                        statePc = 422;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_416) {
                        statePc = ((Object) stateCaught_416 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_416);
                        }
                        caughtException = stateCaught_416;
                        continue stateLoop;
                    }
                }
                case 422: {
                    try {
                        if (var21 < 21) {
                            statePc = 428;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 423. */
                            {
                                if (24 > var21) {
                                    /* Inlined CFG state: 427. */
                                    {
                                        var27 = 3;
                                        statePc = 428;
                                        continue stateLoop;
                                    }
                                } else {
                                    /* Inlined CFG state: 424. */
                                    {
                                        statePc = 428;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_422) {
                        statePc = ((Object) stateCaught_422 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_422);
                        }
                        caughtException = stateCaught_422;
                        continue stateLoop;
                    }
                }
                case 428: {
                    try {
                        if (var21 < 24) {
                            statePc = 434;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 429. */
                            {
                                if (var21 < 27) {
                                    /* Inlined CFG state: 433. */
                                    {
                                        var27 = 4;
                                        var25 = var25 + 2105376;
                                        statePc = 434;
                                        continue stateLoop;
                                    }
                                } else {
                                    /* Inlined CFG state: 430. */
                                    {
                                        statePc = 434;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_428) {
                        statePc = ((Object) stateCaught_428 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_428);
                        }
                        caughtException = stateCaught_428;
                        continue stateLoop;
                    }
                }
                case 434: {
                    try {
                        if (var21 < 27) {
                            statePc = 439;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 435. */
                            {
                                if (var21 >= 30) {
                                    statePc = 439;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 436. */
                                    {
                                        /* Sequential CFG blocks: 436, 438. */
                                        {
                                        }
                                        {
                                            var27 = 5;
                                            statePc = 439;
                                            continue stateLoop;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_434) {
                        statePc = ((Object) stateCaught_434 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_434);
                        }
                        caughtException = stateCaught_434;
                        continue stateLoop;
                    }
                }
                case 439: {
                    try {
                        if (var21 == 30) {
                            statePc = 444;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 440. */
                            {
                                if (var21 == 33) {
                                    statePc = 444;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 441. */
                                    {
                                        statePc = 445;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_439) {
                        statePc = ((Object) stateCaught_439 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_439);
                        }
                        caughtException = stateCaught_439;
                        continue stateLoop;
                    }
                }
                case 444: {
                    try {
                        var27 = 6;
                        var25 = var25 + 2105376;
                        statePc = 445;
                        continue stateLoop;
                    } catch (Throwable stateCaught_444) {
                        statePc = ((Object) stateCaught_444 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_444);
                        }
                        caughtException = stateCaught_444;
                        continue stateLoop;
                    }
                }
                case 445: {
                    try {
                        if (var21 == 31) {
                            statePc = 450;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 446. */
                            {
                                if (34 == var21) {
                                    statePc = 450;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 447. */
                                    {
                                        statePc = 451;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_445) {
                        statePc = ((Object) stateCaught_445 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_445);
                        }
                        caughtException = stateCaught_445;
                        continue stateLoop;
                    }
                }
                case 450: {
                    try {
                        var27 = 7;
                        statePc = 451;
                        continue stateLoop;
                    } catch (Throwable stateCaught_450) {
                        statePc = ((Object) stateCaught_450 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_450);
                        }
                        caughtException = stateCaught_450;
                        continue stateLoop;
                    }
                }
                case 451: {
                    try {
                        if (var21 == 32) {
                            statePc = 456;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 452. */
                            {
                                if (var21 == 35) {
                                    statePc = 456;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 453. */
                                    {
                                        statePc = 457;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_451) {
                        statePc = ((Object) stateCaught_451 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_451);
                        }
                        caughtException = stateCaught_451;
                        continue stateLoop;
                    }
                }
                case 456: {
                    try {
                        var27 = 8;
                        var25 = var25 + 2105376;
                        statePc = 457;
                        continue stateLoop;
                    } catch (Throwable stateCaught_456) {
                        statePc = ((Object) stateCaught_456 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_456);
                        }
                        caughtException = stateCaught_456;
                        continue stateLoop;
                    }
                }
                case 457: {
                    try {
                        switch (var21) {
                            case 36: statePc = -1; break;
                            case 39: statePc = -1; break;
                            case 37: statePc = -1; break;
                            case 40: statePc = -1; break;
                            case 38: statePc = -1; break;
                            case 41: statePc = -1; break;
                            case 42: statePc = 460; break;
                            case 45: statePc = 460; break;
                            default: statePc = 461; break;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_457) {
                        statePc = ((Object) stateCaught_457 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_457);
                        }
                        caughtException = stateCaught_457;
                        continue stateLoop;
                    }
                }
                case 460: {
                    try {
                        var25 = var25 + 2105376;
                        var27 = 16;
                        statePc = 461;
                        continue stateLoop;
                    } catch (Throwable stateCaught_460) {
                        statePc = ((Object) stateCaught_460 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_460);
                        }
                        caughtException = stateCaught_460;
                        continue stateLoop;
                    }
                }
                case 461: {
                    try {
                        if (var21 == 43) {
                            statePc = 466;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 462. */
                            {
                                if (var21 == 46) {
                                    statePc = 466;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 463. */
                                    {
                                        statePc = 467;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_461) {
                        statePc = ((Object) stateCaught_461 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_461);
                        }
                        caughtException = stateCaught_461;
                        continue stateLoop;
                    }
                }
                case 466: {
                    try {
                        var27 = 17;
                        statePc = 467;
                        continue stateLoop;
                    } catch (Throwable stateCaught_466) {
                        statePc = ((Object) stateCaught_466 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_466);
                        }
                        caughtException = stateCaught_466;
                        continue stateLoop;
                    }
                }
                case 467: {
                    try {
                        if (var21 == 44) {
                            /* Inlined CFG state: 470. */
                            {
                                var27 = 26;
                                var25 = var25 + 2105376;
                                statePc = 471;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 468. */
                            {
                                statePc = 471;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_467) {
                        statePc = ((Object) stateCaught_467 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_467);
                        }
                        caughtException = stateCaught_467;
                        continue stateLoop;
                    }
                }
                case 471: {
                    try {
                        if (var21 == 47) {
                            /* Inlined CFG state: 474. */
                            {
                                var25 = var25 + 2105376;
                                var27 = 28;
                                statePc = 475;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 472. */
                            {
                                statePc = 475;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_471) {
                        statePc = ((Object) stateCaught_471 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_471);
                        }
                        caughtException = stateCaught_471;
                        continue stateLoop;
                    }
                }
                case 475: {
                    try {
                        if (var21 == 48) {
                            /* Inlined CFG state: 478. */
                            {
                                var29 = 0;
                                var25 = var25 + 2105376;
                                statePc = 479;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 476. */
                            {
                                statePc = 479;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_475) {
                        statePc = ((Object) stateCaught_475 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_475);
                        }
                        caughtException = stateCaught_475;
                        continue stateLoop;
                    }
                }
                case 479: {
                    try {
                        if (var21 != 49) {
                            statePc = 481;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 480. */
                            {
                                var29 = 0;
                                var25 = var25 + 2105376;
                                statePc = 481;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_479) {
                        statePc = ((Object) stateCaught_479 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_479);
                        }
                        caughtException = stateCaught_479;
                        continue stateLoop;
                    }
                }
                case 481: {
                    try {
                        if (50 != var21) {
                            statePc = 483;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 482. */
                            {
                                var29 = 1;
                                var25 = var25 + 2105376;
                                statePc = 483;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_481) {
                        statePc = ((Object) stateCaught_481 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_481);
                        }
                        caughtException = stateCaught_481;
                        continue stateLoop;
                    }
                }
                case 483: {
                    try {
                        if (var21 != 51) {
                            statePc = 485;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 484. */
                            {
                                var29 = 2;
                                statePc = 485;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_483) {
                        statePc = ((Object) stateCaught_483 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_483);
                        }
                        caughtException = stateCaught_483;
                        continue stateLoop;
                    }
                }
                case 485: {
                    try {
                        if (var21 != 52) {
                            statePc = 487;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 486. */
                            {
                                var29 = 2;
                                statePc = 487;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_485) {
                        statePc = ((Object) stateCaught_485 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_485);
                        }
                        caughtException = stateCaught_485;
                        continue stateLoop;
                    }
                }
                case 487: {
                    try {
                        if (var21 != 53) {
                            statePc = 489;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 488. */
                            {
                                var29 = 2;
                                statePc = 489;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_487) {
                        statePc = ((Object) stateCaught_487 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_487);
                        }
                        caughtException = stateCaught_487;
                        continue stateLoop;
                    }
                }
                case 489: {
                    try {
                        if (1 == this.field_h) {
                            /* Inlined CFG state: 492. */
                            {
                                var28 = 54;
                                statePc = 493;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 490. */
                            {
                                statePc = 493;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_489) {
                        statePc = ((Object) stateCaught_489 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_489);
                        }
                        caughtException = stateCaught_489;
                        continue stateLoop;
                    }
                }
                case 493: {
                    try {
                        if (4 == this.field_h) {
                            /* Inlined CFG state: 496. */
                            {
                                if (42 == var21) {
                                    /* Inlined CFG state: 499. */
                                    {
                                        var27 = 0;
                                        var25 = var25 + 2105376;
                                        statePc = 500;
                                        continue stateLoop;
                                    }
                                } else {
                                    /* Inlined CFG state: 497. */
                                    {
                                        statePc = 500;
                                        continue stateLoop;
                                    }
                                }
                            }
                        } else {
                            /* Inlined CFG state: 494. */
                            {
                                statePc = 583;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_493) {
                        statePc = ((Object) stateCaught_493 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_493);
                        }
                        caughtException = stateCaught_493;
                        continue stateLoop;
                    }
                }
                case 500: {
                    try {
                        var28 = 66;
                        if (var21 == 43) {
                            /* Inlined CFG state: 503. */
                            {
                                var27 = 1;
                                statePc = 504;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 501. */
                            {
                                statePc = 504;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_500) {
                        statePc = ((Object) stateCaught_500 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_500);
                        }
                        caughtException = stateCaught_500;
                        continue stateLoop;
                    }
                }
                case 504: {
                    try {
                        if (var21 != 44) {
                            statePc = 506;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 505. */
                            {
                                var25 = var25 + 2105376;
                                var27 = 2;
                                statePc = 506;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_504) {
                        statePc = ((Object) stateCaught_504 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_504);
                        }
                        caughtException = stateCaught_504;
                        continue stateLoop;
                    }
                }
                case 506: {
                    try {
                        if (var21 != 45) {
                            statePc = 508;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 507. */
                            {
                                var27 = 3;
                                statePc = 508;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_506) {
                        statePc = ((Object) stateCaught_506 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_506);
                        }
                        caughtException = stateCaught_506;
                        continue stateLoop;
                    }
                }
                case 508: {
                    try {
                        if (46 == var21) {
                            /* Inlined CFG state: 511. */
                            {
                                var25 = var25 + 2105376;
                                var27 = 4;
                                statePc = 512;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 509. */
                            {
                                statePc = 512;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_508) {
                        statePc = ((Object) stateCaught_508 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_508);
                        }
                        caughtException = stateCaught_508;
                        continue stateLoop;
                    }
                }
                case 512: {
                    try {
                        if (47 == var21) {
                            /* Inlined CFG state: 515. */
                            {
                                var27 = 5;
                                statePc = 516;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 513. */
                            {
                                statePc = 516;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_512) {
                        statePc = ((Object) stateCaught_512 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_512);
                        }
                        caughtException = stateCaught_512;
                        continue stateLoop;
                    }
                }
                case 516: {
                    try {
                        if (var21 == 48) {
                            statePc = 521;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 517. */
                            {
                                if (var21 == 51) {
                                    statePc = 521;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 518. */
                                    {
                                        statePc = 522;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_516) {
                        statePc = ((Object) stateCaught_516 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_516);
                        }
                        caughtException = stateCaught_516;
                        continue stateLoop;
                    }
                }
                case 521: {
                    try {
                        var27 = 6;
                        var25 = var25 + 2105376;
                        statePc = 522;
                        continue stateLoop;
                    } catch (Throwable stateCaught_521) {
                        statePc = ((Object) stateCaught_521 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_521);
                        }
                        caughtException = stateCaught_521;
                        continue stateLoop;
                    }
                }
                case 522: {
                    try {
                        if (var21 == 49) {
                            statePc = 527;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 523. */
                            {
                                if (var21 == 52) {
                                    statePc = 527;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 524. */
                                    {
                                        statePc = 528;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_522) {
                        statePc = ((Object) stateCaught_522 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_522);
                        }
                        caughtException = stateCaught_522;
                        continue stateLoop;
                    }
                }
                case 527: {
                    try {
                        var27 = 7;
                        statePc = 528;
                        continue stateLoop;
                    } catch (Throwable stateCaught_527) {
                        statePc = ((Object) stateCaught_527 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_527);
                        }
                        caughtException = stateCaught_527;
                        continue stateLoop;
                    }
                }
                case 528: {
                    try {
                        if (var21 == 50) {
                            statePc = 532;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 529. */
                            {
                                if (53 != var21) {
                                    statePc = 533;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 530. */
                                    {
                                        statePc = 532;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_528) {
                        statePc = ((Object) stateCaught_528 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_528);
                        }
                        caughtException = stateCaught_528;
                        continue stateLoop;
                    }
                }
                case 532: {
                    try {
                        var25 = var25 + 2105376;
                        var27 = 8;
                        statePc = 533;
                        continue stateLoop;
                    } catch (Throwable stateCaught_532) {
                        statePc = ((Object) stateCaught_532 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_532);
                        }
                        caughtException = stateCaught_532;
                        continue stateLoop;
                    }
                }
                case 533: {
                    try {
                        if (var21 == 54) {
                            statePc = 538;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 534. */
                            {
                                if (var21 == 57) {
                                    statePc = 538;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 535. */
                                    {
                                        statePc = 539;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_533) {
                        statePc = ((Object) stateCaught_533 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_533);
                        }
                        caughtException = stateCaught_533;
                        continue stateLoop;
                    }
                }
                case 538: {
                    try {
                        var27 = 9;
                        statePc = 539;
                        continue stateLoop;
                    } catch (Throwable stateCaught_538) {
                        statePc = ((Object) stateCaught_538 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_538);
                        }
                        caughtException = stateCaught_538;
                        continue stateLoop;
                    }
                }
                case 539: {
                    try {
                        if (var21 == 55) {
                            statePc = 543;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 540. */
                            {
                                if (var21 != 58) {
                                    statePc = 544;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 541. */
                                    {
                                        statePc = 543;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_539) {
                        statePc = ((Object) stateCaught_539 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_539);
                        }
                        caughtException = stateCaught_539;
                        continue stateLoop;
                    }
                }
                case 543: {
                    try {
                        var25 = var25 + 2105376;
                        var27 = 10;
                        statePc = 544;
                        continue stateLoop;
                    } catch (Throwable stateCaught_543) {
                        statePc = ((Object) stateCaught_543 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_543);
                        }
                        caughtException = stateCaught_543;
                        continue stateLoop;
                    }
                }
                case 544: {
                    try {
                        if (56 == var21) {
                            statePc = 548;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 545. */
                            {
                                if (var21 != 59) {
                                    statePc = 549;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 546. */
                                    {
                                        statePc = 548;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_544) {
                        statePc = ((Object) stateCaught_544 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_544);
                        }
                        caughtException = stateCaught_544;
                        continue stateLoop;
                    }
                }
                case 548: {
                    try {
                        var27 = 11;
                        statePc = 549;
                        continue stateLoop;
                    } catch (Throwable stateCaught_548) {
                        statePc = ((Object) stateCaught_548 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_548);
                        }
                        caughtException = stateCaught_548;
                        continue stateLoop;
                    }
                }
                case 549: {
                    try {
                        if (var21 == 60) {
                            statePc = 554;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 550. */
                            {
                                if (var21 == 63) {
                                    statePc = 554;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 551. */
                                    {
                                        statePc = 555;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_549) {
                        statePc = ((Object) stateCaught_549 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_549);
                        }
                        caughtException = stateCaught_549;
                        continue stateLoop;
                    }
                }
                case 554: {
                    try {
                        var27 = 16;
                        var25 = var25 + 2105376;
                        statePc = 555;
                        continue stateLoop;
                    } catch (Throwable stateCaught_554) {
                        statePc = ((Object) stateCaught_554 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_554);
                        }
                        caughtException = stateCaught_554;
                        continue stateLoop;
                    }
                }
                case 555: {
                    try {
                        if (var21 == 61) {
                            statePc = 560;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 556. */
                            {
                                if (var21 == 64) {
                                    statePc = 560;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 557. */
                                    {
                                        statePc = 561;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_555) {
                        statePc = ((Object) stateCaught_555 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_555);
                        }
                        caughtException = stateCaught_555;
                        continue stateLoop;
                    }
                }
                case 560: {
                    try {
                        var27 = 17;
                        statePc = 561;
                        continue stateLoop;
                    } catch (Throwable stateCaught_560) {
                        statePc = ((Object) stateCaught_560 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_560);
                        }
                        caughtException = stateCaught_560;
                        continue stateLoop;
                    }
                }
                case 561: {
                    try {
                        if (var21 != 62) {
                            statePc = 563;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 562. */
                            {
                                var27 = 27;
                                var25 = var25 + 2105376;
                                statePc = 563;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_561) {
                        statePc = ((Object) stateCaught_561 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_561);
                        }
                        caughtException = stateCaught_561;
                        continue stateLoop;
                    }
                }
                case 563: {
                    try {
                        if (65 != var21) {
                            statePc = 565;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 564. */
                            {
                                var27 = 29;
                                var25 = var25 + 2105376;
                                statePc = 565;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_563) {
                        statePc = ((Object) stateCaught_563 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_563);
                        }
                        caughtException = stateCaught_563;
                        continue stateLoop;
                    }
                }
                case 565: {
                    try {
                        if (var21 != 66) {
                            statePc = 567;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 566. */
                            {
                                var25 = var25 + 2105376;
                                var29 = 0;
                                statePc = 567;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_565) {
                        statePc = ((Object) stateCaught_565 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_565);
                        }
                        caughtException = stateCaught_565;
                        continue stateLoop;
                    }
                }
                case 567: {
                    try {
                        if (var21 != 67) {
                            statePc = 569;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 568. */
                            {
                                var25 = var25 + 2105376;
                                var29 = 0;
                                statePc = 569;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_567) {
                        statePc = ((Object) stateCaught_567 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_567);
                        }
                        caughtException = stateCaught_567;
                        continue stateLoop;
                    }
                }
                case 569: {
                    try {
                        if (var21 != 68) {
                            statePc = 571;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 570. */
                            {
                                var29 = 1;
                                var25 = var25 + 2105376;
                                statePc = 571;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_569) {
                        statePc = ((Object) stateCaught_569 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_569);
                        }
                        caughtException = stateCaught_569;
                        continue stateLoop;
                    }
                }
                case 571: {
                    try {
                        if (69 == var21) {
                            /* Inlined CFG state: 574. */
                            {
                                var29 = 2;
                                statePc = 575;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 572. */
                            {
                                statePc = 575;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_571) {
                        statePc = ((Object) stateCaught_571 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_571);
                        }
                        caughtException = stateCaught_571;
                        continue stateLoop;
                    }
                }
                case 575: {
                    try {
                        if (var21 == 70) {
                            /* Inlined CFG state: 578. */
                            {
                                var29 = 2;
                                statePc = 579;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 576. */
                            {
                                statePc = 579;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_575) {
                        statePc = ((Object) stateCaught_575 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_575);
                        }
                        caughtException = stateCaught_575;
                        continue stateLoop;
                    }
                }
                case 579: {
                    try {
                        if (71 == var21) {
                            /* Inlined CFG state: 582. */
                            {
                                var29 = 2;
                                statePc = 583;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 580. */
                            {
                                statePc = 583;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_579) {
                        statePc = ((Object) stateCaught_579 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_579);
                        }
                        caughtException = stateCaught_579;
                        continue stateLoop;
                    }
                }
                case 583: {
                    try {
                        if (this.field_h == 5) {
                            /* Inlined CFG state: 586. */
                            {
                                var28 = 51;
                                if (var21 != 48) {
                                    statePc = 588;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 587. */
                                    {
                                        var25 = var25 + 2105376;
                                        var27 = 27;
                                        statePc = 588;
                                        continue stateLoop;
                                    }
                                }
                            }
                        } else {
                            /* Inlined CFG state: 584. */
                            {
                                statePc = 614;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_583) {
                        statePc = ((Object) stateCaught_583 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_583);
                        }
                        caughtException = stateCaught_583;
                        continue stateLoop;
                    }
                }
                case 588: {
                    try {
                        if (49 != var21) {
                            statePc = 590;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 589. */
                            {
                                var27 = 29;
                                var25 = var25 + 2105376;
                                statePc = 590;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_588) {
                        statePc = ((Object) stateCaught_588 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_588);
                        }
                        caughtException = stateCaught_588;
                        continue stateLoop;
                    }
                }
                case 590: {
                    try {
                        if (var21 != 50) {
                            statePc = 592;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 591. */
                            {
                                var27 = 30;
                                var25 = var25 + 2105376;
                                statePc = 592;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_590) {
                        statePc = ((Object) stateCaught_590 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_590);
                        }
                        caughtException = stateCaught_590;
                        continue stateLoop;
                    }
                }
                case 592: {
                    try {
                        if (var21 == 51) {
                            /* Inlined CFG state: 595. */
                            {
                                var29 = 0;
                                var25 = var25 + 2105376;
                                statePc = 596;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 593. */
                            {
                                statePc = 596;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_592) {
                        statePc = ((Object) stateCaught_592 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_592);
                        }
                        caughtException = stateCaught_592;
                        continue stateLoop;
                    }
                }
                case 596: {
                    try {
                        if (52 == var21) {
                            /* Inlined CFG state: 599. */
                            {
                                var25 = var25 + 2105376;
                                var29 = 0;
                                statePc = 600;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 597. */
                            {
                                statePc = 600;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_596) {
                        statePc = ((Object) stateCaught_596 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_596);
                        }
                        caughtException = stateCaught_596;
                        continue stateLoop;
                    }
                }
                case 600: {
                    try {
                        if (53 != var21) {
                            statePc = 602;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 601. */
                            {
                                var29 = 1;
                                var25 = var25 + 2105376;
                                statePc = 602;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_600) {
                        statePc = ((Object) stateCaught_600 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_600);
                        }
                        caughtException = stateCaught_600;
                        continue stateLoop;
                    }
                }
                case 602: {
                    try {
                        if (var21 == 54) {
                            /* Inlined CFG state: 605. */
                            {
                                var29 = 2;
                                statePc = 606;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 603. */
                            {
                                statePc = 606;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_602) {
                        statePc = ((Object) stateCaught_602 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_602);
                        }
                        caughtException = stateCaught_602;
                        continue stateLoop;
                    }
                }
                case 606: {
                    try {
                        if (var21 == 55) {
                            /* Inlined CFG state: 609. */
                            {
                                var29 = 2;
                                statePc = 610;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 607. */
                            {
                                statePc = 610;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_606) {
                        statePc = ((Object) stateCaught_606 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_606);
                        }
                        caughtException = stateCaught_606;
                        continue stateLoop;
                    }
                }
                case 610: {
                    try {
                        if (56 == var21) {
                            /* Inlined CFG state: 613. */
                            {
                                var29 = 2;
                                statePc = 614;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 611. */
                            {
                                statePc = 614;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_610) {
                        statePc = ((Object) stateCaught_610 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_610);
                        }
                        caughtException = stateCaught_610;
                        continue stateLoop;
                    }
                }
                case 614: {
                    try {
                        if (var27 != -1) {
                            /* Inlined CFG state: 617. */
                            {
                                var30 = var27 >> 5;
                                var31 = -(var30 << 5) + var27;
                                if ((ad.field_f[var30] & 1 << var31) != 0) {
                                    /* Inlined CFG state: 620. */
                                    {
                                        stackIn_621_0 = 0;
                                        statePc = 621;
                                        continue stateLoop;
                                    }
                                } else {
                                    /* Inlined CFG state: 618. */
                                    {
                                        stackIn_621_0 = 1;
                                        statePc = 621;
                                        continue stateLoop;
                                    }
                                }
                            }
                        } else {
                            /* Inlined CFG state: 615. */
                            {
                                statePc = 622;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_614) {
                        statePc = ((Object) stateCaught_614 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_614);
                        }
                        caughtException = stateCaught_614;
                        continue stateLoop;
                    }
                }
                case 621: {
                    try {
                        var26 = stackIn_621_0;
                        statePc = 622;
                        continue stateLoop;
                    } catch (Throwable stateCaught_621) {
                        statePc = ((Object) stateCaught_621 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_621);
                        }
                        caughtException = stateCaught_621;
                        continue stateLoop;
                    }
                }
                case 622: {
                    try {
                        if (var29 == -1) {
                            statePc = 628;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 623. */
                            {
                                if (!this.g(var29, 0)) {
                                    /* Inlined CFG state: 627. */
                                    {
                                        var26 = 1;
                                        statePc = 628;
                                        continue stateLoop;
                                    }
                                } else {
                                    /* Inlined CFG state: 624. */
                                    {
                                        statePc = 628;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_622) {
                        statePc = ((Object) stateCaught_622 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_622);
                        }
                        caughtException = stateCaught_622;
                        continue stateLoop;
                    }
                }
                case 628: {
                    try {
                        de.d(var2_int + var22 * var23 + 1, var22 * var24 + var3 + 1, 30, 30, var25);
                        if (var21 == so.field_c[this.field_h]) {
                            /* Inlined CFG state: 631. */
                            {
                                de.d(1 + var2_int + var23 * var22, var3 + var22 * var24 + 1, 30, 30, 16711935 | var25);
                                statePc = 632;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 629. */
                            {
                                statePc = 632;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_628) {
                        statePc = ((Object) stateCaught_628 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_628);
                        }
                        caughtException = stateCaught_628;
                        continue stateLoop;
                    }
                }
                case 632: {
                    try {
                        if (~var28 < ~var21) {
                            statePc = 639;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 633. */
                            {
                                if (var26 == 0) {
                                    statePc = 639;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 634. */
                                    {
                                        /* Sequential CFG blocks: 634, 636. */
                                        {
                                        }
                                        {
                                            if (-1 == var27) {
                                                /* Inlined CFG state: 646. */
                                                {
                                                    de.d(1 + var23 * var22 + var2_int, var3 + var22 * var24 + 1, 30, 30, 9996941);
                                                    ((qb) (((Object[]) (var4))[var21])).b(-(((qb) (((Object[]) (var4))[var21])).field_q / 4) + (16 + var22 * var23) + var2_int - ((qb) (((Object[]) (var4))[var21])).field_x / 2, -(((qb) (((Object[]) (var4))[var21])).field_y / 4) + var3 + (var24 * var22 + (16 - ((qb) (((Object[]) (var4))[var21])).field_o / 2)), 32, 32);
                                                    de.e(var2_int + var22 * var23 + 1, 1 + (var3 + var24 * var22), 30, 30, 0, 192);
                                                    di.field_d.b(20 + (var2_int + var22 * var23), 20 + (var3 + var22 * var24), 12, 12);
                                                    statePc = 648;
                                                    continue stateLoop;
                                                }
                                            } else {
                                                /* Inlined CFG state: 637. */
                                                {
                                                    statePc = 639;
                                                    continue stateLoop;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_632) {
                        statePc = ((Object) stateCaught_632 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_632);
                        }
                        caughtException = stateCaught_632;
                        continue stateLoop;
                    }
                }
                case 639: {
                    try {
                        if (var26 != 0) {
                            /* Inlined CFG state: 644. */
                            {
                                de.d(1 + (var22 * var23 + var2_int), 1 + var22 * var24 + var3, 30, 30, 9996941);
                                ((qb) (((Object[]) (var4))[var21])).b(-(((qb) (((Object[]) (var4))[var21])).field_q / 4) + 16 + var2_int + var23 * var22 - ((qb) (((Object[]) (var4))[var21])).field_x / 2, -(((qb) (((Object[]) (var4))[var21])).field_y / 4) + (-(((qb) (((Object[]) (var4))[var21])).field_o / 2) + var3) - (-(var24 * var22) - 16), 32, 32);
                                de.e(var2_int + var22 * var23 + 1, var3 + (var22 * var24 + 1), 30, 30, 0, 192);
                                vd.field_b.b(var2_int + var22 * var23 + 20, var24 * var22 + var3 + 20, 12, 12);
                                statePc = 648;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 640. */
                            {
                                /* Sequential CFG blocks: 640, 642. */
                                {
                                }
                                {
                                    ((qb) (((Object[]) (var4))[var21])).b(-(((qb) (((Object[]) (var4))[var21])).field_x / 2) + (var23 * var22 + var2_int) - (-16 + ((qb) (((Object[]) (var4))[var21])).field_q / 4), -(((qb) (((Object[]) (var4))[var21])).field_y / 4) + (16 + var3) + var22 * var24 - ((qb) (((Object[]) (var4))[var21])).field_o / 2, 32, 32);
                                    statePc = 648;
                                    continue stateLoop;
                                }
                            }
                        }
                    } catch (Throwable stateCaught_639) {
                        statePc = ((Object) stateCaught_639 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_639);
                        }
                        caughtException = stateCaught_639;
                        continue stateLoop;
                    }
                }
                case 648: {
                    try {
                        if (qf.field_d < 2) {
                            statePc = 650;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 649. */
                            {
                                var26 = 0;
                                statePc = 650;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_648) {
                        statePc = ((Object) stateCaught_648 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_648);
                        }
                        caughtException = stateCaught_648;
                        continue stateLoop;
                    }
                }
                case 650: {
                    try {
                        if (~(var2_int + var23 * var22) < ~an.field_g) {
                            statePc = 672;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 651. */
                            {
                                if (~an.field_g <= ~(32 + var2_int + var22 * var23)) {
                                    statePc = 672;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 652. */
                                    {
                                        /* Sequential CFG blocks: 652, 654. */
                                        {
                                        }
                                        {
                                            if (~me.field_I > ~(var22 * var24 + var3)) {
                                                statePc = 672;
                                                continue stateLoop;
                                            } else {
                                                /* Inlined CFG state: 655. */
                                                {
                                                    /* Sequential CFG blocks: 655, 657. */
                                                    {
                                                    }
                                                    {
                                                        if (me.field_I >= var3 + var24 * var22 + 32) {
                                                            statePc = 672;
                                                            continue stateLoop;
                                                        } else {
                                                            /* Inlined CFG state: 658. */
                                                            {
                                                                /* Sequential CFG blocks: 658, 660. */
                                                                {
                                                                }
                                                                {
                                                                    gn.a(15, (byte) 101, 128, var2_int - (1 + (-(var23 * var22) - 17)), var24 * var22 + (var3 + 16));
                                                                    this.field_i = var21;
                                                                    this.field_m = 0;
                                                                    if (var26 == 0) {
                                                                        statePc = 665;
                                                                    } else {
                                                                        statePc = 661;
                                                                    }
                                                                    continue stateLoop;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_650) {
                        statePc = ((Object) stateCaught_650 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_650);
                        }
                        caughtException = stateCaught_650;
                        continue stateLoop;
                    }
                }
                case 661: {
                    try {
                        /* Sequential CFG blocks: 661, 663. */
                        {
                        }
                        {
                            this.field_m = 8;
                            statePc = 665;
                            continue stateLoop;
                        }
                    } catch (Throwable stateCaught_661) {
                        statePc = ((Object) stateCaught_661 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_661);
                        }
                        caughtException = stateCaught_661;
                        continue stateLoop;
                    }
                }
                case 665: {
                    try {
                        if (var26 != 0) {
                            /* Inlined CFG state: 668. */
                            {
                                var19 = var23;
                                if (var29 == -1) {
                                    /* Inlined CFG state: 670. */
                                    {
                                        var18 = tj.a(123, new String[]{rb.field_n[var27]}, kl.field_y);
                                        statePc = 671;
                                        continue stateLoop;
                                    }
                                } else {
                                    /* Inlined CFG state: 669. */
                                    {
                                        var18 = vg.field_n;
                                        statePc = 671;
                                        continue stateLoop;
                                    }
                                }
                            }
                        } else {
                            /* Inlined CFG state: 666. */
                            {
                                statePc = 672;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_665) {
                        statePc = ((Object) stateCaught_665 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_665);
                        }
                        caughtException = stateCaught_665;
                        continue stateLoop;
                    }
                }
                case 671: {
                    try {
                        var20 = var24;
                        statePc = 672;
                        continue stateLoop;
                    } catch (Throwable stateCaught_671) {
                        statePc = ((Object) stateCaught_671 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_671);
                        }
                        caughtException = stateCaught_671;
                        continue stateLoop;
                    }
                }
                case 672: {
                    try {
                        var21++;
                        var24++;
                        statePc = 207;
                        continue stateLoop;
                    } catch (Throwable stateCaught_672) {
                        statePc = ((Object) stateCaught_672 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_672);
                        }
                        caughtException = stateCaught_672;
                        continue stateLoop;
                    }
                }
                case 678: {
                    try {
                        discarded$3 = this.a(false, 180, (byte) 111, false, bi.field_I + 32, 98, 309 + uc.field_a);
                        discarded$4 = this.a(false, 166, (byte) 79, false, 39 + bi.field_I, 29, 390 + uc.field_a);
                        tj.field_t.a(gg.field_f, -1 + (32 + bi.field_I + 7), 389 + uc.field_a, 166, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                        tj.field_t.a(gg.field_f, bi.field_I + 39, uc.field_a + 390 - 2, 166, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                        tj.field_t.a(gg.field_f, bi.field_I + 39, uc.field_a + 390 - 1, 166, 29, 12569299, -1, 1, 1, tj.field_t.field_C);
                        if (kg.field_d[3] != hi.field_b[0]) {
                            statePc = 684;
                        } else {
                            statePc = 679;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_678) {
                        statePc = ((Object) stateCaught_678 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_678);
                        }
                        caughtException = stateCaught_678;
                        continue stateLoop;
                    }
                }
                case 679: {
                    try {
                        if (kg.field_d[0] != ld.field_n[2]) {
                            statePc = 684;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 680. */
                            {
                                /* Sequential CFG blocks: 680, 682. */
                                {
                                }
                                {
                                    kg.field_d[0] = ld.field_n[3];
                                    statePc = 684;
                                    continue stateLoop;
                                }
                            }
                        }
                    } catch (Throwable stateCaught_679) {
                        statePc = ((Object) stateCaught_679 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_679);
                        }
                        caughtException = stateCaught_679;
                        continue stateLoop;
                    }
                }
                case 684: {
                    try {
                        if (kg.field_d[3] != hi.field_b[0]) {
                            statePc = 690;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 685. */
                            {
                                if (kg.field_d[1] == ud.field_z[2]) {
                                    /* Inlined CFG state: 689. */
                                    {
                                        kg.field_d[1] = ud.field_z[3];
                                        statePc = 690;
                                        continue stateLoop;
                                    }
                                } else {
                                    /* Inlined CFG state: 686. */
                                    {
                                        statePc = 690;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_684) {
                        statePc = ((Object) stateCaught_684 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_684);
                        }
                        caughtException = stateCaught_684;
                        continue stateLoop;
                    }
                }
                case 690: {
                    try {
                        if (kg.field_d[3] != hi.field_b[2]) {
                            statePc = 696;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 691. */
                            {
                                if (kg.field_d[0] == ld.field_n[12]) {
                                    /* Inlined CFG state: 695. */
                                    {
                                        kg.field_d[0] = ld.field_n[13];
                                        statePc = 696;
                                        continue stateLoop;
                                    }
                                } else {
                                    /* Inlined CFG state: 692. */
                                    {
                                        statePc = 696;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_690) {
                        statePc = ((Object) stateCaught_690 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_690);
                        }
                        caughtException = stateCaught_690;
                        continue stateLoop;
                    }
                }
                case 696: {
                    try {
                        if (kg.field_d[3] != hi.field_b[2]) {
                            statePc = 702;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 697. */
                            {
                                if (ud.field_z[12] == kg.field_d[1]) {
                                    /* Inlined CFG state: 701. */
                                    {
                                        kg.field_d[1] = ud.field_z[13];
                                        statePc = 702;
                                        continue stateLoop;
                                    }
                                } else {
                                    /* Inlined CFG state: 698. */
                                    {
                                        statePc = 702;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_696) {
                        statePc = ((Object) stateCaught_696 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_696);
                        }
                        caughtException = stateCaught_696;
                        continue stateLoop;
                    }
                }
                case 702: {
                    try {
                        if (hi.field_b[3] != kg.field_d[3]) {
                            statePc = 708;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 703. */
                            {
                                if (ud.field_z[12] != kg.field_d[1]) {
                                    statePc = 708;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 704. */
                                    {
                                        /* Sequential CFG blocks: 704, 706. */
                                        {
                                        }
                                        {
                                            kg.field_d[1] = ud.field_z[14];
                                            statePc = 708;
                                            continue stateLoop;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_702) {
                        statePc = ((Object) stateCaught_702 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_702);
                        }
                        caughtException = stateCaught_702;
                        continue stateLoop;
                    }
                }
                case 708: {
                    try {
                        if (hi.field_b[3] != kg.field_d[3]) {
                            statePc = 714;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 709. */
                            {
                                if (ld.field_n[12] != kg.field_d[0]) {
                                    statePc = 714;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 710. */
                                    {
                                        /* Sequential CFG blocks: 710, 712. */
                                        {
                                        }
                                        {
                                            kg.field_d[0] = ld.field_n[14];
                                            statePc = 714;
                                            continue stateLoop;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_708) {
                        statePc = ((Object) stateCaught_708 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_708);
                        }
                        caughtException = stateCaught_708;
                        continue stateLoop;
                    }
                }
                case 714: {
                    try {
                        if (kg.field_d[3] != hi.field_b[3]) {
                            statePc = 720;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 715. */
                            {
                                if (ud.field_z[13] == kg.field_d[1]) {
                                    /* Inlined CFG state: 719. */
                                    {
                                        kg.field_d[1] = ud.field_z[14];
                                        statePc = 720;
                                        continue stateLoop;
                                    }
                                } else {
                                    /* Inlined CFG state: 716. */
                                    {
                                        statePc = 720;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_714) {
                        statePc = ((Object) stateCaught_714 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_714);
                        }
                        caughtException = stateCaught_714;
                        continue stateLoop;
                    }
                }
                case 720: {
                    try {
                        if (hi.field_b[3] != kg.field_d[3]) {
                            statePc = 726;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 721. */
                            {
                                if (ld.field_n[13] == kg.field_d[0]) {
                                    /* Inlined CFG state: 725. */
                                    {
                                        kg.field_d[0] = ld.field_n[14];
                                        statePc = 726;
                                        continue stateLoop;
                                    }
                                } else {
                                    /* Inlined CFG state: 722. */
                                    {
                                        statePc = 726;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_720) {
                        statePc = ((Object) stateCaught_720 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_720);
                        }
                        caughtException = stateCaught_720;
                        continue stateLoop;
                    }
                }
                case 726: {
                    try {
                        de.a(bi.field_I + 58, uc.field_a + 317, 131, 67, 16777215);
                        de.d(59 + bi.field_I, uc.field_a + 318, 129, 65, 0);
                        var23 = 0;
                        statePc = 727;
                        continue stateLoop;
                    } catch (Throwable stateCaught_726) {
                        statePc = ((Object) stateCaught_726 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_726);
                        }
                        caughtException = stateCaught_726;
                        continue stateLoop;
                    }
                }
                case 727: {
                    try {
                        stackIn_728_0 = ~var23;
                        stackIn_728_1 = -9;
                        statePc = 728;
                        continue stateLoop;
                    } catch (Throwable stateCaught_727) {
                        statePc = ((Object) stateCaught_727 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_727);
                        }
                        caughtException = stateCaught_727;
                        continue stateLoop;
                    }
                }
                case 728: {
                    try {
                        if (stackIn_728_0 <= stackIn_728_1) {
                            /* Inlined CFG state: 779. */
                            {
                                discarded$5 = this.a(false, 180, (byte) 106, false, bi.field_I + 225, 98, 309 + uc.field_a);
                                discarded$6 = this.a(false, 166, (byte) -98, false, 232 + bi.field_I, 29, uc.field_a + 390);
                                tj.field_t.a(ce.field_j, 6 + (bi.field_I + 225), -1 + (uc.field_a + 390), 166, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                                tj.field_t.a(ce.field_j, 7 + (225 + bi.field_I), -2 + uc.field_a + 390, 166, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                                tj.field_t.a(ce.field_j, bi.field_I + 225 + 7, -1 + (uc.field_a + 390), 166, 29, 12569299, -1, 1, 1, tj.field_t.field_C);
                                de.a(248 + bi.field_I, 317 + uc.field_a, 131, 67, 16777215);
                                de.d(249 + bi.field_I, 318 + uc.field_a, 129, 65, 0);
                                var23 = 0;
                                statePc = 780;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 729. */
                            {
                                var24 = 0;
                                statePc = 730;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_728) {
                        statePc = ((Object) stateCaught_728 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_728);
                        }
                        caughtException = stateCaught_728;
                        continue stateLoop;
                    }
                }
                case 730: {
                    try {
                        if (4 <= var24) {
                            /* Inlined CFG state: 778. */
                            {
                                var23++;
                                statePc = 727;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 731. */
                            {
                                var25 = var24 * 8 + var23;
                                var3 = uc.field_a + 319 + var24 * 16;
                                var2_int = var23 * 16 + bi.field_I + 60;
                                var26 = (ld.field_n[var25][0] << 16) + (ld.field_n[var25][2] + (ld.field_n[var25][1] << 8));
                                de.d(var2_int, var3, 15, 15, var26);
                                stackIn_728_0 = -3;
                                stackIn_732_0 = stackIn_728_0;
                                stackIn_728_1 = ~var25;
                                stackIn_732_1 = stackIn_728_1;
                                if (false) {
                                    statePc = 728;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 732. */
                                    {
                                        if (stackIn_732_0 != stackIn_732_1) {
                                            statePc = 738;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 733. */
                                            {
                                                if (kg.field_d[3] == hi.field_b[0]) {
                                                    /* Inlined CFG state: 737. */
                                                    {
                                                        var26 = 0;
                                                        statePc = 738;
                                                        continue stateLoop;
                                                    }
                                                } else {
                                                    /* Inlined CFG state: 734. */
                                                    {
                                                        statePc = 738;
                                                        continue stateLoop;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_730) {
                        statePc = ((Object) stateCaught_730 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_730);
                        }
                        caughtException = stateCaught_730;
                        continue stateLoop;
                    }
                }
                case 738: {
                    try {
                        if (12 != var25) {
                            statePc = 743;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 739. */
                            {
                                if (kg.field_d[3] != hi.field_b[2]) {
                                    statePc = 743;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 740. */
                                    {
                                        /* Sequential CFG blocks: 740, 742. */
                                        {
                                        }
                                        {
                                            var26 = 0;
                                            statePc = 743;
                                            continue stateLoop;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_738) {
                        statePc = ((Object) stateCaught_738 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_738);
                        }
                        caughtException = stateCaught_738;
                        continue stateLoop;
                    }
                }
                case 743: {
                    try {
                        if (var25 != 12) {
                            statePc = 748;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 744. */
                            {
                                if (kg.field_d[3] != hi.field_b[3]) {
                                    statePc = 748;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 745. */
                                    {
                                        /* Sequential CFG blocks: 745, 747. */
                                        {
                                        }
                                        {
                                            var26 = 0;
                                            statePc = 748;
                                            continue stateLoop;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_743) {
                        statePc = ((Object) stateCaught_743 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_743);
                        }
                        caughtException = stateCaught_743;
                        continue stateLoop;
                    }
                }
                case 748: {
                    try {
                        if (var25 != 13) {
                            statePc = 754;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 749. */
                            {
                                if (kg.field_d[3] == hi.field_b[3]) {
                                    /* Inlined CFG state: 753. */
                                    {
                                        var26 = 0;
                                        statePc = 754;
                                        continue stateLoop;
                                    }
                                } else {
                                    /* Inlined CFG state: 750. */
                                    {
                                        statePc = 754;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_748) {
                        statePc = ((Object) stateCaught_748 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_748);
                        }
                        caughtException = stateCaught_748;
                        continue stateLoop;
                    }
                }
                case 754: {
                    try {
                        if (var26 == 0) {
                            /* Inlined CFG state: 757. */
                            {
                                de.b(var2_int, var3, var2_int + 14, var3 + 14, 16711680);
                                de.b(var2_int + 1, var3, var2_int + 14, var3 + 13, 0);
                                de.b(var2_int, 1 + var3, var2_int + 13, var3 + 14, 0);
                                de.b(var2_int, var3 + 14, var2_int + 14, var3, 16711680);
                                de.b(var2_int + 1, var3 + 14, 14 + var2_int, 1 + var3, 0);
                                de.b(var2_int, 13 + var3, 13 + var2_int, var3, 0);
                                statePc = 758;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 755. */
                            {
                                statePc = 758;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_754) {
                        statePc = ((Object) stateCaught_754 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_754);
                        }
                        caughtException = stateCaught_754;
                        continue stateLoop;
                    }
                }
                case 758: {
                    try {
                        if (an.field_g < var2_int) {
                            statePc = 773;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 759. */
                            {
                                if (me.field_I < var3) {
                                    statePc = 773;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 760. */
                                    {
                                        /* Sequential CFG blocks: 760, 762. */
                                        {
                                        }
                                        {
                                            if (~an.field_g <= ~(var2_int + 15)) {
                                                statePc = 773;
                                                continue stateLoop;
                                            } else {
                                                /* Inlined CFG state: 763. */
                                                {
                                                    /* Sequential CFG blocks: 763, 765. */
                                                    {
                                                    }
                                                    {
                                                        if (me.field_I >= var3 + 15) {
                                                            statePc = 773;
                                                            continue stateLoop;
                                                        } else {
                                                            /* Inlined CFG state: 766. */
                                                            {
                                                                /* Sequential CFG blocks: 766, 768. */
                                                                {
                                                                }
                                                                {
                                                                    if (var26 != 0) {
                                                                        statePc = 772;
                                                                    } else {
                                                                        statePc = 769;
                                                                    }
                                                                    continue stateLoop;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_758) {
                        statePc = ((Object) stateCaught_758 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_758);
                        }
                        caughtException = stateCaught_758;
                        continue stateLoop;
                    }
                }
                case 769: {
                    try {
                        statePc = 773;
                        continue stateLoop;
                    } catch (Throwable stateCaught_769) {
                        statePc = ((Object) stateCaught_769 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_769);
                        }
                        caughtException = stateCaught_769;
                        continue stateLoop;
                    }
                }
                case 772: {
                    try {
                        de.a(var2_int - 1, var3 - 1, 17, 17, 16777215);
                        this.field_m = 2;
                        this.field_i = var25;
                        statePc = 773;
                        continue stateLoop;
                    } catch (Throwable stateCaught_772) {
                        statePc = ((Object) stateCaught_772 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_772);
                        }
                        caughtException = stateCaught_772;
                        continue stateLoop;
                    }
                }
                case 773: {
                    try {
                        if (ld.field_n[var25] == kg.field_d[0]) {
                            /* Inlined CFG state: 776. */
                            {
                                de.a(var2_int - 1, var3 - 1, 17, 17, 2, 16777215, 128);
                                statePc = 777;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 774. */
                            {
                                statePc = 777;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_773) {
                        statePc = ((Object) stateCaught_773 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_773);
                        }
                        caughtException = stateCaught_773;
                        continue stateLoop;
                    }
                }
                case 777: {
                    try {
                        var24++;
                        statePc = 730;
                        continue stateLoop;
                    } catch (Throwable stateCaught_777) {
                        statePc = ((Object) stateCaught_777 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_777);
                        }
                        caughtException = stateCaught_777;
                        continue stateLoop;
                    }
                }
                case 780: {
                    try {
                        stackIn_781_0 = var23;
                        stackIn_781_1 = 8;
                        statePc = 781;
                        continue stateLoop;
                    } catch (Throwable stateCaught_780) {
                        statePc = ((Object) stateCaught_780 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_780);
                        }
                        caughtException = stateCaught_780;
                        continue stateLoop;
                    }
                }
                case 781: {
                    try {
                        if (stackIn_781_0 >= stackIn_781_1) {
                            /* Inlined CFG state: 833. */
                            {
                                var23 = 79;
                                var24 = 424;
                                if (gm.field_f == 3) {
                                    /* Inlined CFG state: 836. */
                                    {
                                        var23 += 14;
                                        var24 -= 7;
                                        statePc = 837;
                                        continue stateLoop;
                                    }
                                } else {
                                    /* Inlined CFG state: 834. */
                                    {
                                        statePc = 837;
                                        continue stateLoop;
                                    }
                                }
                            }
                        } else {
                            /* Inlined CFG state: 782. */
                            {
                                var24 = 0;
                                statePc = 783;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_781) {
                        statePc = ((Object) stateCaught_781 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_781);
                        }
                        caughtException = stateCaught_781;
                        continue stateLoop;
                    }
                }
                case 783: {
                    try {
                        if (var24 >= 4) {
                            /* Inlined CFG state: 832. */
                            {
                                var23++;
                                statePc = 780;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 784. */
                            {
                                var25 = 8 * var24 + var23;
                                var26 = (ud.field_z[var25][0] << 16) + (ud.field_z[var25][2] + (ud.field_z[var25][1] << 8));
                                var3 = var24 * 16 + 319 + uc.field_a;
                                var2_int = 250 + bi.field_I + 16 * var23;
                                de.d(var2_int, var3, 15, 15, var26);
                                stackIn_781_0 = 2;
                                stackIn_785_0 = stackIn_781_0;
                                stackIn_781_1 = var25;
                                stackIn_785_1 = stackIn_781_1;
                                if (false) {
                                    statePc = 781;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 785. */
                                    {
                                        if (stackIn_785_0 != stackIn_785_1) {
                                            statePc = 791;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 786. */
                                            {
                                                if (kg.field_d[3] == hi.field_b[0]) {
                                                    /* Inlined CFG state: 790. */
                                                    {
                                                        var26 = 0;
                                                        statePc = 791;
                                                        continue stateLoop;
                                                    }
                                                } else {
                                                    /* Inlined CFG state: 787. */
                                                    {
                                                        statePc = 791;
                                                        continue stateLoop;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_783) {
                        statePc = ((Object) stateCaught_783 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_783);
                        }
                        caughtException = stateCaught_783;
                        continue stateLoop;
                    }
                }
                case 791: {
                    try {
                        if (var25 != 12) {
                            statePc = 797;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 792. */
                            {
                                if (kg.field_d[3] == hi.field_b[2]) {
                                    /* Inlined CFG state: 796. */
                                    {
                                        var26 = 0;
                                        statePc = 797;
                                        continue stateLoop;
                                    }
                                } else {
                                    /* Inlined CFG state: 793. */
                                    {
                                        statePc = 797;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_791) {
                        statePc = ((Object) stateCaught_791 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_791);
                        }
                        caughtException = stateCaught_791;
                        continue stateLoop;
                    }
                }
                case 797: {
                    try {
                        if (var25 != 12) {
                            statePc = 803;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 798. */
                            {
                                if (kg.field_d[3] == hi.field_b[3]) {
                                    /* Inlined CFG state: 802. */
                                    {
                                        var26 = 0;
                                        statePc = 803;
                                        continue stateLoop;
                                    }
                                } else {
                                    /* Inlined CFG state: 799. */
                                    {
                                        statePc = 803;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_797) {
                        statePc = ((Object) stateCaught_797 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_797);
                        }
                        caughtException = stateCaught_797;
                        continue stateLoop;
                    }
                }
                case 803: {
                    try {
                        if (var25 != 13) {
                            statePc = 809;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 804. */
                            {
                                if (hi.field_b[3] == kg.field_d[3]) {
                                    /* Inlined CFG state: 808. */
                                    {
                                        var26 = 0;
                                        statePc = 809;
                                        continue stateLoop;
                                    }
                                } else {
                                    /* Inlined CFG state: 805. */
                                    {
                                        statePc = 809;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_803) {
                        statePc = ((Object) stateCaught_803 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_803);
                        }
                        caughtException = stateCaught_803;
                        continue stateLoop;
                    }
                }
                case 809: {
                    try {
                        if (var26 != 0) {
                            statePc = 812;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 810. */
                            {
                                de.b(var2_int, var3, 14 + var2_int, var3 + 14, 16711680);
                                de.b(1 + var2_int, var3, 14 + var2_int, var3 + 13, 0);
                                de.b(var2_int, var3 + 1, var2_int + 13, var3 + 14, 0);
                                de.b(var2_int, var3 + 14, var2_int + 14, var3, 16711680);
                                de.b(var2_int + 1, var3 + 14, 14 + var2_int, var3 + 1, 0);
                                de.b(var2_int, var3 + 13, 13 + var2_int, var3, 0);
                                statePc = 812;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_809) {
                        statePc = ((Object) stateCaught_809 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_809);
                        }
                        caughtException = stateCaught_809;
                        continue stateLoop;
                    }
                }
                case 812: {
                    try {
                        if (~an.field_g > ~var2_int) {
                            statePc = 827;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 813. */
                            {
                                if (~me.field_I > ~var3) {
                                    statePc = 827;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 814. */
                                    {
                                        /* Sequential CFG blocks: 814, 816. */
                                        {
                                        }
                                        {
                                            if (~(15 + var2_int) >= ~an.field_g) {
                                                statePc = 827;
                                                continue stateLoop;
                                            } else {
                                                /* Inlined CFG state: 817. */
                                                {
                                                    /* Sequential CFG blocks: 817, 819. */
                                                    {
                                                    }
                                                    {
                                                        if (~(var3 + 15) >= ~me.field_I) {
                                                            statePc = 827;
                                                            continue stateLoop;
                                                        } else {
                                                            /* Inlined CFG state: 820. */
                                                            {
                                                                /* Sequential CFG blocks: 820, 822. */
                                                                {
                                                                }
                                                                {
                                                                    if (var26 == 0) {
                                                                        statePc = 827;
                                                                    } else {
                                                                        statePc = 823;
                                                                    }
                                                                    continue stateLoop;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_812) {
                        statePc = ((Object) stateCaught_812 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_812);
                        }
                        caughtException = stateCaught_812;
                        continue stateLoop;
                    }
                }
                case 823: {
                    try {
                        /* Sequential CFG blocks: 823, 825. */
                        {
                        }
                        {
                            de.a(-1 + var2_int, -1 + var3, 17, 17, 16777215);
                            this.field_i = var25;
                            this.field_m = 3;
                            statePc = 827;
                            continue stateLoop;
                        }
                    } catch (Throwable stateCaught_823) {
                        statePc = ((Object) stateCaught_823 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_823);
                        }
                        caughtException = stateCaught_823;
                        continue stateLoop;
                    }
                }
                case 827: {
                    try {
                        if (kg.field_d[1] == ud.field_z[var25]) {
                            /* Inlined CFG state: 830. */
                            {
                                de.a(var2_int - 1, var3 - 1, 17, 17, 2, 16777215, 128);
                                statePc = 831;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 828. */
                            {
                                statePc = 831;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_827) {
                        statePc = ((Object) stateCaught_827 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_827);
                        }
                        caughtException = stateCaught_827;
                        continue stateLoop;
                    }
                }
                case 831: {
                    try {
                        var24++;
                        statePc = 783;
                        continue stateLoop;
                    } catch (Throwable stateCaught_831) {
                        statePc = ((Object) stateCaught_831 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_831);
                        }
                        caughtException = stateCaught_831;
                        continue stateLoop;
                    }
                }
                case 837: {
                    try {
                        discarded$7 = this.a(false, 93, (byte) -106, false, bi.field_I + 417, 98, uc.field_a + 309);
                        discarded$8 = this.a(false, var23, (byte) -96, false, var24 + bi.field_I, 29, uc.field_a + 390);
                        tj.field_t.a(th.field_j, -1 + bi.field_I + var24, uc.field_a + 390 - 1, var23, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                        tj.field_t.a(th.field_j, var24 + bi.field_I, 390 + (uc.field_a - 2), var23, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                        tj.field_t.a(th.field_j, var24 + bi.field_I, -1 + (uc.field_a + 390), var23, 29, 12569299, -1, 1, 1, tj.field_t.field_C);
                        de.a(431 + bi.field_I, uc.field_a + 317, 67, 67, 16777215);
                        de.d(bi.field_I + 432, uc.field_a + 318, 65, 65, 0);
                        var25 = 0;
                        statePc = 838;
                        continue stateLoop;
                    } catch (Throwable stateCaught_837) {
                        statePc = ((Object) stateCaught_837 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_837);
                        }
                        caughtException = stateCaught_837;
                        continue stateLoop;
                    }
                }
                case 838: {
                    try {
                        stackIn_839_0 = -5;
                        stackIn_839_1 = ~var25;
                        statePc = 839;
                        continue stateLoop;
                    } catch (Throwable stateCaught_838) {
                        statePc = ((Object) stateCaught_838 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_838);
                        }
                        caughtException = stateCaught_838;
                        continue stateLoop;
                    }
                }
                case 839: {
                    try {
                        if (stackIn_839_0 >= stackIn_839_1) {
                            /* Inlined CFG state: 860. */
                            {
                                discarded$9 = this.a(false, 93, (byte) 93, false, 520 + bi.field_I, 98, 309 + uc.field_a);
                                discarded$10 = this.a(false, 79, (byte) 121, false, 7 + bi.field_I + 520, 29, 390 + uc.field_a);
                                tj.field_t.a(ka.field_l, 7 + bi.field_I + 520 - 1, 389 + uc.field_a, 79, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                                tj.field_t.a(ka.field_l, bi.field_I + 527, 390 + uc.field_a - 2, 79, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                                tj.field_t.a(ka.field_l, bi.field_I + 520 + 7, -1 + uc.field_a + 390, 79, 29, 12569299, -1, 1, 1, tj.field_t.field_C);
                                de.a(535 + bi.field_I, uc.field_a + 333, 67, 35, 16777215);
                                de.d(bi.field_I + 536, uc.field_a + 318 + 16, 65, 33, 0);
                                var25 = 0;
                                statePc = 861;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 840. */
                            {
                                var26 = 0;
                                statePc = 841;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_839) {
                        statePc = ((Object) stateCaught_839 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_839);
                        }
                        caughtException = stateCaught_839;
                        continue stateLoop;
                    }
                }
                case 841: {
                    try {
                        if (var26 >= 4) {
                            /* Inlined CFG state: 859. */
                            {
                                var25++;
                                statePc = 838;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 842. */
                            {
                                var27 = var25 + var26 * 4;
                                var2_int = var25 * 16 + (bi.field_I + 433);
                                var28 = (ug.field_d[var27][0] << 16) + (ug.field_d[var27][2] + (ug.field_d[var27][1] << 8));
                                var3 = 16 * var26 + 319 + uc.field_a;
                                de.d(var2_int, var3, 15, 15, var28);
                                stackIn_839_0 = ~an.field_g;
                                stackIn_843_0 = stackIn_839_0;
                                stackIn_839_1 = ~var2_int;
                                stackIn_843_1 = stackIn_839_1;
                                if (false) {
                                    statePc = 839;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 843. */
                                    {
                                        if (stackIn_843_0 > stackIn_843_1) {
                                            statePc = 855;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 844. */
                                            {
                                                if (var3 > me.field_I) {
                                                    statePc = 855;
                                                    continue stateLoop;
                                                } else {
                                                    /* Inlined CFG state: 845. */
                                                    {
                                                        /* Sequential CFG blocks: 845, 847. */
                                                        {
                                                        }
                                                        {
                                                            if (15 + var2_int <= an.field_g) {
                                                                statePc = 855;
                                                            } else {
                                                                statePc = 848;
                                                            }
                                                            continue stateLoop;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_841) {
                        statePc = ((Object) stateCaught_841 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_841);
                        }
                        caughtException = stateCaught_841;
                        continue stateLoop;
                    }
                }
                case 848: {
                    try {
                        /* Sequential CFG blocks: 848, 850. */
                        {
                        }
                        {
                            if (me.field_I >= var3 + 15) {
                                statePc = 855;
                                continue stateLoop;
                            } else {
                                /* Inlined CFG state: 851. */
                                {
                                    /* Sequential CFG blocks: 851, 853. */
                                    {
                                    }
                                    {
                                        de.a(var2_int - 1, var3 - 1, 17, 17, 16777215);
                                        this.field_i = var27;
                                        this.field_m = 4;
                                        statePc = 855;
                                        continue stateLoop;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_848) {
                        statePc = ((Object) stateCaught_848 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_848);
                        }
                        caughtException = stateCaught_848;
                        continue stateLoop;
                    }
                }
                case 855: {
                    try {
                        if (kg.field_d[2] != ug.field_d[var27]) {
                            statePc = 858;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 856. */
                            {
                                de.a(var2_int - 1, -1 + var3, 17, 17, 2, 16777215, 128);
                                statePc = 858;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_855) {
                        statePc = ((Object) stateCaught_855 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_855);
                        }
                        caughtException = stateCaught_855;
                        continue stateLoop;
                    }
                }
                case 858: {
                    try {
                        var26++;
                        statePc = 841;
                        continue stateLoop;
                    } catch (Throwable stateCaught_858) {
                        statePc = ((Object) stateCaught_858 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_858);
                        }
                        caughtException = stateCaught_858;
                        continue stateLoop;
                    }
                }
                case 861: {
                    try {
                        stackIn_862_0 = 4;
                        stackIn_862_1 = var25;
                        statePc = 862;
                        continue stateLoop;
                    } catch (Throwable stateCaught_861) {
                        statePc = ((Object) stateCaught_861 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_861);
                        }
                        caughtException = stateCaught_861;
                        continue stateLoop;
                    }
                }
                case 862: {
                    try {
                        if (stackIn_862_0 <= stackIn_862_1) {
                            statePc = 885;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 863. */
                            {
                                var26 = 0;
                                statePc = 864;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_862) {
                        statePc = ((Object) stateCaught_862 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_862);
                        }
                        caughtException = stateCaught_862;
                        continue stateLoop;
                    }
                }
                case 864: {
                    try {
                        if (var26 >= 2) {
                            /* Inlined CFG state: 882. */
                            {
                                var25++;
                                statePc = 861;
                                continue stateLoop;
                            }
                        } else {
                            /* Inlined CFG state: 865. */
                            {
                                var27 = 4 * var26 + var25;
                                var3 = var26 * 16 + uc.field_a + 335;
                                var2_int = var25 * 16 + bi.field_I + 537;
                                var28 = (hi.field_b[var27][0] << 16) + (hi.field_b[var27][1] << 8) + hi.field_b[var27][2];
                                de.d(var2_int, var3, 15, 15, var28);
                                stackIn_862_0 = ~an.field_g;
                                stackIn_866_0 = stackIn_862_0;
                                stackIn_862_1 = ~var2_int;
                                stackIn_866_1 = stackIn_862_1;
                                if (false) {
                                    statePc = 862;
                                    continue stateLoop;
                                } else {
                                    /* Inlined CFG state: 866. */
                                    {
                                        if (stackIn_866_0 > stackIn_866_1) {
                                            statePc = 878;
                                            continue stateLoop;
                                        } else {
                                            /* Inlined CFG state: 867. */
                                            {
                                                if (var3 > me.field_I) {
                                                    statePc = 878;
                                                    continue stateLoop;
                                                } else {
                                                    /* Inlined CFG state: 868. */
                                                    {
                                                        /* Sequential CFG blocks: 868, 870. */
                                                        {
                                                        }
                                                        {
                                                            if (~an.field_g <= ~(15 + var2_int)) {
                                                                statePc = 878;
                                                            } else {
                                                                statePc = 871;
                                                            }
                                                            continue stateLoop;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_864) {
                        statePc = ((Object) stateCaught_864 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_864);
                        }
                        caughtException = stateCaught_864;
                        continue stateLoop;
                    }
                }
                case 871: {
                    try {
                        /* Sequential CFG blocks: 871, 873. */
                        {
                        }
                        {
                            if (~(var3 + 15) < ~me.field_I) {
                                /* Inlined CFG state: 877. */
                                {
                                    de.a(var2_int - 1, -1 + var3, 17, 17, 16777215);
                                    this.field_i = var27;
                                    this.field_m = 5;
                                    statePc = 878;
                                    continue stateLoop;
                                }
                            } else {
                                /* Inlined CFG state: 874. */
                                {
                                    statePc = 878;
                                    continue stateLoop;
                                }
                            }
                        }
                    } catch (Throwable stateCaught_871) {
                        statePc = ((Object) stateCaught_871 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_871);
                        }
                        caughtException = stateCaught_871;
                        continue stateLoop;
                    }
                }
                case 878: {
                    try {
                        if (hi.field_b[var27] != kg.field_d[3]) {
                            statePc = 881;
                            continue stateLoop;
                        } else {
                            /* Inlined CFG state: 879. */
                            {
                                de.a(-1 + var2_int, -1 + var3, 17, 17, 2, 16777215, 128);
                                statePc = 881;
                                continue stateLoop;
                            }
                        }
                    } catch (Throwable stateCaught_878) {
                        statePc = ((Object) stateCaught_878 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_878);
                        }
                        caughtException = stateCaught_878;
                        continue stateLoop;
                    }
                }
                case 881: {
                    try {
                        var26++;
                        statePc = 864;
                        continue stateLoop;
                    } catch (Throwable stateCaught_881) {
                        statePc = ((Object) stateCaught_881 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw lc.<RuntimeException>$cfr$sneakyThrow(stateCaught_881);
                        }
                        caughtException = stateCaught_881;
                        continue stateLoop;
                    }
                }
                case 884: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw aa.a((Throwable) ((Object) var2), "lc.P(" + param0 + ')');
                }
                case 885: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(boolean param0, int param1, boolean param2) {
        int stackIn_125_0 = 0;
        boolean stackIn_126_1 = false;
        int stackIn_134_0 = 0;
        boolean stackIn_135_1 = false;
        int stackIn_155_0 = 0;
        boolean stackIn_156_1 = false;
        so stackIn_187_0 = null;
        boolean stackIn_188_1 = false;
        so stackIn_299_0 = null;
        boolean stackIn_300_1 = false;
        so stackIn_309_0 = null;
        boolean stackIn_310_1 = false;
        so stackIn_329_0 = null;
        boolean stackIn_330_1 = false;
        so stackIn_355_0 = null;
        boolean stackIn_356_1 = false;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var7Lifetime1;
        int var8Lifetime1;
        int var7Lifetime1Lifetime1;
        var9 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param2) {
            this.a(false, 127, (byte) 126);
          }
          var4_int = wl.field_L[this.field_l][param1];
          var6 = var4_int;
          if (var6 != 0) {
            if (1 != var6) {
              boolean decompiledFrameRemainder0 = true;
              if (var6 != 2) {
                if (var6 == 7) {
                  if (!this.field_g.b(true)) {
                    return;
                  }
                  var6 = param0 ? 1 : 0;
                  stackIn_134_0 = var6;
                  stackIn_135_1 = !(param2);
                  gj.a(stackIn_134_0 != 0, stackIn_135_1, 0, mn.field_r);
                  io.field_A = false;
                  fi.field_h = true;
                  return;
                }
                if (var6 == 24) {
                  if (!this.field_g.b(true)) {
                    return;
                  }
                  var6 = param0 ? 1 : 0;
                  gj.a(var6 != 0, true, 10, mn.field_r);
                  tn.field_Cb = true;
                  return;
                }
                if (var6 != 22) {
                  if (var6 == 14) {
                    if (!this.field_g.b(true)) {
                      return;
                    }
                    var6 = param0 ? 1 : 0;
                    stackIn_155_0 = var6;
                    stackIn_156_1 = !(param2);
                    gj.a(stackIn_155_0 != 0, stackIn_156_1, 15, mn.field_r);
                    return;
                  }
                  if (15 == var6) {
                    if (this.field_g.b(true)) {
                      if (!lc.a((byte) 112) &&
                        ah.field_c > 0) {
                        return;
                      }
                      var6 = param0 ? 1 : 0;
                      gj.a(var6 != 0, true, 16, mn.field_r);
                      return;
                    }
                  } else {
                    if (var6 == 5) {
                      if (!this.field_g.b(true)) {
                        return;
                      }
                      fh.field_e = 0;
                      var6 = param0 ? 1 : 0;
                      gj.a(var6 != 0, true, 7, mn.field_r);
                      return;
                    }
                    if (8 == var6) {
                      if (!this.field_g.b(true)) {
                        return;
                      }
                      var6 = th.field_f;
                      var7 = param0 ? 1 : 0;
                      gj.a(var7 != 0, true, var6, mn.field_r);
                      return;
                    }
                    if (var6 != 4) {
                      if (var6 != 27) {
                        if (var6 == 28) {
                          if (!this.field_g.b(true)) {
                            return;
                          }
                          var6 = param0 ? 1 : 0;
                          gj.a(var6 != 0, true, 12, mn.field_r);
                          return;
                        }
                        if (20 == var6) {
                          var5 = 0;
                          if (this.field_g.a(-13722) &&
                            si.field_l > 0) {
                            mf.a(0, 21298);
                            var5 = 1;
                          }
                          if (this.field_g.d((byte) 112) &&
                            si.field_l < 256) {
                            var5 = 1;
                            mf.a(256, 21298);
                          }
                          if (this.field_g.c((byte) -26)) {
                            var6 = this.d(41, param1) + (this.a(param1, (byte) 103) + (ff.field_c - 120)) >> 1;
                            var7Lifetime1 = -var6 + an.field_g;
                            var8 = var7Lifetime1 * 256 / 120;
                            var5 = 1;
                            if (0 >= var8) {
                              mf.a(0, 21298);
                            } else {
                              if (256 > var8) {
                                mf.a(var8, 21298);
                              } else {
                                mf.a(256, 21298);
                              }
                            }
                          }
                          if (this.field_g.b((byte) -40) &&
                            si.field_l > 0) {
                            var5 = 1;
                            ob.j((byte) -109);
                          }
                          if (this.field_g.b(-65) &&
                            si.field_l < 256) {
                            var5 = 1;
                            s.a(false);
                          }
                          if (var5 == 0) {
                            return;
                          }
                          decompiledFrameRemainder0 = (!(this.field_g.c((byte) -102)) ||
                            !(oj.field_e >= jb.field_v));
                          if (decompiledFrameRemainder0) {
                            if (null != cf.field_h[nn.field_n[0][2]]) {
                              ti.a((byte) -30, to.field_r[nn.field_n[0][2]], cf.field_h[nn.field_n[0][2]]);
                            }
                            oj.field_e = 20 + jb.field_v;
                            return;
                          }
                        }
                        if (decompiledFrameRemainder0) {
                          if (var6 == 21) {
                            if (this.field_g.a(-13722)) {
                              eb.a(0, false);
                            }
                            if (this.field_g.d((byte) 125)) {
                              eb.a(256, false);
                            }
                            if (this.field_g.c((byte) 85)) {
                              var6 = -120 + this.d(41, param1) - (-this.a(param1, (byte) 103) - ff.field_c) >> 1;
                              var7Lifetime1Lifetime1 = -var6 + an.field_g;
                              var8Lifetime1 = 256 * var7Lifetime1Lifetime1 / 120;
                              if (var8Lifetime1 > 0) {
                                if (var8Lifetime1 >= 256) {
                                  eb.a(256, false);
                                } else {
                                  eb.a(var8Lifetime1, false);
                                }
                              } else {
                                eb.a(0, param2);
                              }
                            }
                            if (this.field_g.b((byte) -40)) {
                              jm.b(60);
                            }
                            if (!this.field_g.b(-74)) {
                              return;
                            }
                            ck.a((byte) 115);
                            return;
                          }
                          if (var6 == 6) {
                            if (this.field_g.b(true)) {
                              wl.f(!param2);
                              return;
                            }
                          } else {
                            if (var6 != 9) {
                              if (var6 == 10) {
                                if (!this.field_g.b(true)) {
                                  return;
                                }
                                jb.field_z.a(true);
                                var6 = param0 ? 1 : 0;
                                gj.a(var6 != 0, true, -1, mn.field_r);
                                return;
                              }
                              if (var6 != 11) {
                                if (var6 == 12) {
                                  stackIn_299_0 = this.field_g;
                                  stackIn_300_1 = !(param2);
                                  if (!((so) (Object) stackIn_299_0).b(stackIn_300_1)) {
                                    return;
                                  }
                                  jb.field_z.g((byte) -61);
                                  var6 = param0 ? 1 : 0;
                                  gj.a(var6 != 0, true, -1, mn.field_r);
                                  return;
                                }
                                if (var6 != 13) {
                                  if (var6 == 17) {
                                    if (this.field_g.b(true)) {
                                      ie.field_Sb = 0;
                                      return;
                                    }
                                  } else {
                                    if (var6 == 18) {
                                      stackIn_329_0 = this.field_g;
                                      stackIn_330_1 = !(param2);
                                      if (!((so) (Object) stackIn_329_0).b(stackIn_330_1)) {
                                        return;
                                      }
                                      ie.field_Sb = 1;
                                      return;
                                    }
                                    if (var6 != 23) {
                                      if (var6 == 25) {
                                        stackIn_355_0 = this.field_g;
                                        stackIn_356_1 = !(param2);
                                        if (((so) (Object) stackIn_355_0).b(stackIn_356_1)) {
                                          if (!this.a((byte) -46, param1)) {
                                            return;
                                          }
                                          if (si.field_g == 8) {
                                            vn.field_g = vn.field_g - 1;
                                            if (0 > vn.field_g) {
                                              vn.field_g = 3;
                                            }
                                          }
                                          if (si.field_g == 7) {
                                            fh.field_e = fh.field_e - 1;
                                          }
                                          if (14 == si.field_g) {
                                            var6 = -1 + mj.field_p;
                                            if (var6 <= 0) {
                                              var6 = 0;
                                              if (!param0) {
                                                this.field_g.field_h = 1;
                                              }
                                            }
                                            df.a((byte) 120, var6);
                                            return;
                                          }
                                        }
                                      } else {
                                        if (26 == var6) {
                                          if (this.field_g.b(true) &&
                                            this.a((byte) -46, param1)) {
                                            if (si.field_g == 8) {
                                              vn.field_g = vn.field_g + 1;
                                              if (vn.field_g > 3) {
                                                vn.field_g = 0;
                                              }
                                            }
                                            if (si.field_g == 7) {
                                              fh.field_e = fh.field_e + 1;
                                            }
                                            if (14 == si.field_g) {
                                              var6 = 1 + mj.field_p;
                                              if (var6 >= 7) {
                                                var6 = 7;
                                                if (!param0) {
                                                  this.field_g.field_h = 0;
                                                }
                                              }
                                              df.a((byte) -127, var6);
                                              return;
                                            }
                                          }
                                        } else {
                                          if (var6 == 19) {
                                            if (this.field_g.b(true)) {
                                              im.a((byte) 79, cd.e(120));
                                              return;
                                            }
                                          } else {
                                            if (30 == var6) {
                                              if (!this.field_g.b(true)) {
                                                return;
                                              }
                                              df.a((byte) 89, 7);
                                              return;
                                            }
                                            if (var6 != 29) {
                                              return;
                                            }
                                            if (!this.field_g.b(true)) {
                                              return;
                                            }
                                            var6 = param0 ? 1 : 0;
                                            gj.a(var6 != 0, true, -1, mn.field_r);
                                          }
                                        }
                                      }
                                    } else {
                                      if (this.field_g.b(true)) {
                                        if ((this.field_l != 8 &&
                                          si.field_g != 6) &&
                                          (decompiledFrameRemainder0 = (10 == this.field_l))) {
                                          ko.a(cd.e(103), (byte) -60);
                                          return;
                                        }
                                        if (decompiledFrameRemainder0) {
                                          ul.a(ud.field_o, (byte) 45, this.field_l);
                                          return;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  stackIn_309_0 = this.field_g;
                                  stackIn_310_1 = !(param2);
                                  if (((so) (Object) stackIn_309_0).b(stackIn_310_1)) {
                                    if (hi.field_a) {
                                      var6 = param0 ? 1 : 0;
                                      gj.a(var6 != 0, true, -5, mn.field_r);
                                    }
                                    if (mj.field_w) {
                                      qe.a(0, (byte) -35, 11);
                                    }
                                    fi.field_h = true;
                                    return;
                                  }
                                }
                              } else {
                                if (this.field_g.b(true)) {
                                  jb.field_z.p(26873);
                                  var6 = param0 ? 1 : 0;
                                  gj.a(var6 != 0, true, -1, mn.field_r);
                                  return;
                                }
                              }
                            } else {
                              if (this.field_g.b(true)) {
                                jb.field_z.a(-111, param0);
                                fi.field_h = true;
                                io.field_A = false;
                                return;
                              }
                            }
                          }
                        }
                      } else {
                        stackIn_187_0 = this.field_g;
                        stackIn_188_1 = !(param2);
                        if (((so) (Object) stackIn_187_0).b(stackIn_188_1)) {
                          var6 = param0 ? 1 : 0;
                          gj.a(var6 != 0, true, 11, mn.field_r);
                          return;
                        }
                      }
                    } else {
                      if (this.field_g.b(true)) {
                        var6 = param0 ? 1 : 0;
                        gj.a(var6 != 0, true, 6, mn.field_r);
                        return;
                      }
                    }
                  }
                } else {
                  if (!this.field_g.b(true)) {
                    return;
                  }
                  var6 = param0 ? 1 : 0;
                  gj.a(var6 != 0, true, 8, mn.field_r);
                  if (!param0) {
                    this.field_g.field_h = 1;
                    return;
                  }
                }
              } else {
                if (this.field_g.b(true)) {
                  var6 = param0 ? 1 : 0;
                  stackIn_125_0 = var6;
                  stackIn_126_1 = !(param2);
                  gj.a(stackIn_125_0 != 0, stackIn_126_1, -1, mn.field_r);
                  return;
                }
              }
            } else {
              if (this.field_g.b(true)) {
                if (lc.a((byte) 112)) {
                  ke.a(wd.field_h, param0, mi.field_B, 1, ve.field_t, 0, an.field_j / 2, 16, mi.field_B.field_o, 10, an.field_f / 2, ud.field_o, true, mi.field_B.field_o + mi.field_B.field_m, -21071);
                } else {
                  var6 = param0 ? 1 : 0;
                  gj.a(var6 != 0, true, -4, mn.field_r);
                }
              }
            }
          } else {
            if (this.field_g.b(true)) {
              var6 = param0 ? 1 : 0;
              gj.a(var6 != 0, true, -3, mn.field_r);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var4), "lc.OA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(int param0) {
        int var8 = 0;
        Object var2 = null;
        Object var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6Lifetime1;
        int stackIn_24_0Lifetime1;
        int stackIn_24_1Lifetime1;
        var9 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var2 = null;
          var3 = null;
          var4 = -32 + 3 * uc.field_a / 4 + 240;
          fe.field_o.c(-(fe.field_o.field_n / 2) + (an.field_f >> 1), -(fe.field_o.field_w / 2) - 20 + var4);
          var5 = (an.field_f >> 1) - 120;
          if (mj.field_p == 0) {
            var2 = aj.field_f;
            var3 = jo.field_d;
            bb.field_g[0].c(var5 - 28, -48 + var4);
          }
          if (param0 == mj.field_p) {
            var2 = rj.field_d;
            var3 = gm.field_b;
            bb.field_g[1].c(var5 - 28, -32 + var4);
          }
          if (mj.field_p == 2) {
            var3 = pc.field_f;
            var2 = mg.field_F;
            bb.field_g[72].c(-28 + var5, -48 + var4);
          }
          if (3 == mj.field_p) {
            var3 = gi.field_h;
            var2 = hn.field_c;
            bb.field_g[4].c(var5 - 28, var4);
          }
          if (mj.field_p == 4) {
            var2 = gj.field_b;
            var3 = lm.field_h;
            bb.field_g[76].c(-28 + var5, -32 + var4);
          }
          if (mj.field_p == 5) {
            var3 = bj.field_pb;
            var2 = ih.field_a;
            bb.field_g[75].c(-28 + var5, var4 - 48);
          }
          if (mj.field_p == 6) {
            var2 = gn.field_j;
            jb.field_z.field_z = 6050;
            var3 = na.field_lc;
            bb.field_g[0].c(var5 - 48, var4);
            bb.field_g[1].c(-8 + var5, var4);
            gb.field_c[5].a(var5 - gb.field_c[0].field_g / 2 - 4, -80 + var4);
            gb.field_c[4].a(-4 + (var5 - gb.field_c[0].field_g / 2), -80 + var4);
            gb.field_c[3].a(-(gb.field_c[0].field_g / 2) + (var5 - 4), var4 - 80);
            gb.field_c[2].a(-4 + (var5 - gb.field_c[0].field_g / 2), -80 + var4);
            gb.field_c[1].a(var5 - gb.field_c[0].field_g / 2 - 4, var4 - 80);
            gb.field_c[0].a(-(gb.field_c[0].field_g / 2) + var5 - 16, var4 - 80);
          }
          if (7 == mj.field_p) {
            var3 = kj.field_d;
            var2 = bm.field_c;
            var6 = 0;
            var7 = 0;
            while (true) {
              stackIn_24_0 = -5;
              stackIn_24_1 = ~var7;
              if (stackIn_24_0 >= stackIn_24_1) {
                break;
              }
              for (var8 = 0; 4 > var8; var8++) {
                stackIn_24_0Lifetime1 = 0;
                stackIn_24_1Lifetime1 = ~b.field_f[var6];
                if (stackIn_24_0Lifetime1 != stackIn_24_1Lifetime1) {
                  bb.field_g[dd.field_f[b.field_f[var6]]].c((-2 + var7) * 40 + var5 - 8, -30 + (var4 + (var8 - 2) * 40));
                }
                var6++;
              }
              var7++;
            }
          }
          var6Lifetime1 = var4 - 144;
          if (var2 != null) {
            tj.field_t.a((String) (var2), (an.field_f >> 1) - 233, var6Lifetime1, 208, 288, 13158, 13158, 1, 0, tj.field_t.field_C + tj.field_t.field_m);
            tj.field_t.a((String) (var2), -232 + (an.field_f >> 1), var6Lifetime1 - 1, 208, 288, 13158, 13158, 1, 0, tj.field_t.field_m + tj.field_t.field_C);
            tj.field_t.a((String) (var2), (an.field_f >> 1) - 232, var6Lifetime1, 208, 288, 12569299, -1, 1, 0, tj.field_t.field_m + tj.field_t.field_C);
          }
          if (var3 != null) {
            mi.field_B.a((String) (var3), 16 + (an.field_f >> 1) + 8, var6Lifetime1, 224, 288, 0, -1, 1, 0, mi.field_B.field_m + mi.field_B.field_C);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (var2), "lc.E(" + param0 + ')');
        }
    }

    private final void e(boolean param0) {
        int var23 = 0;
        int[][][] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        qb var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var24 = 0;
        int[] var25 = null;
        boolean[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var31 = null;
        int[] var32 = null;
        qb stackIn_35_0 = null;
        int stackIn_37_0 = 0;
        boolean stackIn_41_0 = false;
        int stackIn_75_0 = 0;
        int stackIn_85_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_40_0;
        RuntimeException var2 = null;
        int var18 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        String[] var29 = null;
        String[] var30 = null;
        int var6Lifetime1;
        int var7Lifetime1;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        var24 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var26 = new boolean[]{false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, true, true, true, true, true, true, true, false, true, false, true, true, true, false, true, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false, false, false, false, false, false, false, false, false, true, true, false, false, false, false, false, false, true, true, true, true, false, true, false, true, false, false, false, true, true, true, param0, true, true, true, false, false, false};
          if (lk.a(0, (byte) -116)) {
            var26[55] = false;
          }
          var3 = new int[][][]{new int[][]{new int[]{13, 14}, new int[]{0, 2, 4}, new int[]{1, 3, 5}, new int[]{31, 47}, new int[]{49, 51, 53}, new int[]{50, 52}}, new int[][]{new int[]{46, 56, 87}, new int[]{43, 36, 37, 38, 35}, new int[]{57, 58, 59, 60, 61, 45}, new int[]{41, 44, 12, 72, 73}, new int[]{26, 27, 28, 29}, new int[]{48, 55}}, new int[][]{new int[]{54, 80}, new int[]{6, 7, 8, 9, 10, 11}, new int[]{16, 17, 32}, new int[]{18, 19, 20, 21, 23, 22}, new int[]{24, 25, 33}, new int[]{30}}, new int[][]{new int[]{42, 34, 40, 39, 15}, new int[]{62, 71, 79, 82, 86, 88}, new int[]{65, 66, 67, 69, 85, 92}, new int[]{63, 64, 68, 70, 94, 84}, new int[]{74, 78, 83, 81, 93, 89}, new int[]{91}}};
          var31 = ad.field_f;
          var27 = var31;
          var4 = var27;
          if (2 > var31.length) {
            var32 = new int[2];
            var28 = var32;
            var25 = var28;
            var4 = var25;
            var25[0] = ad.field_f[0];
            var32[1] = 0;
          }
          var5 = lk.a(0, (byte) -33) ? 1 : 0;
          if ((65536 & var4[1]) != 0) {
            if (var5 == 0 &&
              (8388608 & var4[1]) == 0) {
              var3[1][5] = new int[]{48};
            }
          } else {
            var3[1][5] = new int[]{55};
            if (var5 == 0 &&
              (8388608 & var4[1]) == 0) {
              var3[1][5] = new int[]{};
            }
          }
          if ((134217728 & var4[2]) == 0) {
            var3[3] = new int[][]{var3[3][0], var3[3][1], var3[3][2], var3[3][3], var3[3][4]};
          }
          if ((8388608 & var4[2]) == 0) {
            var3[1][0] = new int[]{46, 56};
          }
          var6 = 80;
          var7 = 100;
          if (ArcanistsMulti.i((byte) -127)) {
            stackIn_35_0 = ii.field_d;
          } else {
            stackIn_35_0 = vd.field_b;
          }
          var8 = stackIn_35_0;
          var9 = 60;
          var10 = 280;
          var11 = 60;
          var12 = 220;
          var13 = dd.field_g;
          dd.field_g = -1;
          var14 = vn.field_g;
          var15 = 0;
          L6: while (true) {
            stackIn_37_0 = var3[var14].length;
            if (stackIn_37_0 > var15) {
              var7Lifetime1 = var9 - (-(var10 * (1 + var15) / (var3[var14].length + 1)) - uc.field_a);
              for (var16 = 0; var3[var14][var15].length > var16; var16++) {
                var17 = var3[var14][var15][var16];
                var6Lifetime1 = bi.field_I + var11 + var12 * (1 + var16) / (1 + var3[var14][var15].length);
                stackOut_40_0 = mi.a(32, var7Lifetime1, 32, -8, var6Lifetime1);
                stackIn_37_0 = stackOut_40_0 ? 1 : 0;
                stackIn_41_0 = stackOut_40_0;
                if (stackIn_41_0) {
                  dd.field_g = var17;
                }
                if (0 != (var4[var17 >> 5] & 1 << (var17 & 31))) {
                  if (~var17 == ~ke.field_K) {
                    mo.field_a[var17].f(2 + var6Lifetime1, -2 + var7Lifetime1);
                  } else {
                    if (var17 != var13) {
                      mo.field_a[var17].f(var6Lifetime1, var7Lifetime1);
                    } else {
                      mo.field_a[var17].f(1 + var6Lifetime1, var7Lifetime1 - 1);
                    }
                  }
                } else {
                  if (~var17 == ~ke.field_K) {
                    var8.f(var6Lifetime1 + 2, var7Lifetime1 - 2);
                  } else {
                    if (var17 != var13) {
                      var8.f(var6Lifetime1, var7Lifetime1);
                    } else {
                      var8.f(var6Lifetime1 + 1, var7Lifetime1 - 1);
                    }
                  }
                }
              }
              var15++;
              continue L6;
            }
            break;
          }
          if (-1 != ke.field_K) {
            stackIn_75_0 = ke.field_K;
          } else {
            stackIn_75_0 = dd.field_g;
          }
          var15Lifetime1 = stackIn_75_0;
          if (-1 != var15Lifetime1) {
            var16Lifetime1 = tj.field_t.field_o + tj.field_t.field_m;
            mi.field_B.b(rb.field_n[var15Lifetime1], 447 + bi.field_I, uc.field_a + 126, 0, -1);
            stackIn_85_0 = ((var4[var15Lifetime1 >> 5] & 1 << (31 & var15Lifetime1)) == 0) ? 0 : 1;
            var17Lifetime1 = stackIn_85_0;
            if (var17Lifetime1 != 0) {
              mi.field_B.b(rk.field_H, bi.field_I + 447, -8 + uc.field_a + (126 + var16Lifetime1), 0, -1);
            } else {
              mi.field_B.b(ld.field_l, bi.field_I + 447, var16Lifetime1 + uc.field_a + 118, 16711680, -1);
            }
            var18 = 126 + var16Lifetime1;
            if (var17Lifetime1 != 0) {
              mo.field_a[var15Lifetime1].c(340 + bi.field_I, var18 + uc.field_a);
            } else {
              vd.field_b.c(340 + bi.field_I, var18 + uc.field_a);
            }
            var18 = var18 + tj.field_t.field_C;
            var18 = var18 + tj.field_t.field_C;
            if (var17Lifetime1 == 0 &&
              var26[var15Lifetime1]) {
              var30 = new String[16];
              var20 = mi.field_B.a(wk.field_k, new int[]{220}, var30);
              for (var21 = 0; var20 > var21; var21++) {
                mi.field_B.a(var30[var21], 12 + (340 + bi.field_I), 95 + uc.field_a + var18, 0, -1);
                var18 = var18 + mi.field_B.field_C;
              }
            } else {
              var29 = new String[16];
              var20 = mi.field_B.a(af.field_Bb[var15Lifetime1], new int[]{220}, var29);
              for (var21 = 0; var20 > var21; var21++) {
                mi.field_B.a(var29[var21], 340 + (bi.field_I + 12), -8 + (uc.field_a + var18) + 120, 0, -1);
                var18 = var18 + mi.field_B.field_C;
              }
              mi.field_B.b(lo.field_x, bi.field_I + 530, uc.field_a + 170, 0, -1);
              mi.field_B.b("" + 100 * eh.field_g[var15Lifetime1], bi.field_I + 530, 185 + uc.field_a, 0, -1);
              mi.field_B.b(uk.field_c, 530 + bi.field_I, uc.field_a + 220, 0, -1);
              var21 = 514;
              var22 = 224;
              if (10 == eh.field_g[var15Lifetime1]) {
                var21 -= 24;
              }
              for (var23 = 0; var23 < eh.field_g[var15Lifetime1]; var23++) {
                ih.field_e.c(var21 + bi.field_I, var22 + uc.field_a);
                if (eh.field_g[var15Lifetime1] == 10) {
                  ih.field_e.c(var21 + bi.field_I + 32, uc.field_a + var22);
                }
                var21 -= 8;
                if (0 == var23 % 3) {
                  var21 += 16;
                }
                var22 += 8;
                if (var23 != 4) {
                  continue;
                }
                break;
              }
            }
          } else {
            mi.field_B.a(qo.field_c, -16 + (bi.field_I + 320) + 50, 134 + uc.field_a, 200, 64, 0, -1, 1, 1, mi.field_B.field_C);
            if (!lc.a((byte) 112)) {
              mi.field_B.a(var14 + 1 + "/" + 4, bi.field_I + 285, uc.field_a + 325, 0, -1);
              return;
            }
            mi.field_B.a(hg.field_c, -16 + (50 + bi.field_I) + 320, -16 + (250 + uc.field_a), 200, 64, 0, -1, 1, 1, mi.field_B.field_C);
          }
          mi.field_B.a(var14 + 1 + "/" + 4, bi.field_I + 285, uc.field_a + 325, 0, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "lc.M(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, byte param2, int param3) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          de.a(param1 - 4, param0 - 4, 248, 127, 0);
          de.a(param1 - 3, -3 + param0, 246, 125, 8547138);
          if (param2 > -27) {
            this.field_f = 0.4045710406434804;
          }
          de.a(-2 + param1, param0 - 2, 244, 123, 11833896);
          de.a(param1 - 1, param0 - 1, 242, 121, 0);
          de.c(param1, param0, 240, 119, wm.a(param3, (byte) -122), ng.b((byte) -37, param3));
          if (e.field_M[param3] == null) {
            ue.field_d.field_f = 0;
            e.field_M[param3] = af.a(tj.a(-46, new String[]{Integer.toString(param3)}, "background<%0>"), "", 19412, ue.field_d);
            e.field_M[param3].c(param1, param0);
            e.field_M[param3] = null;
          } else {
            e.field_M[param3].c(param1, param0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var5), "lc.HA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void c(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (ArcanistsMulti.i((byte) -73)) {
            return;
          }
          var2_int = 80;
          if (gm.field_f == 3) {
            var2_int += 20;
          }
          var3 = an.field_f - var2_int;
          de.a(-3 + var3, 3, var2_int, 48, 0);
          de.a(var3 - 2, 2, var2_int, 48, 6837813);
          de.a(-1 + var3, 1, var2_int, 48, 8547138);
          de.a(var3, 0, var2_int, 48, 11768360);
          de.d(1 + var3, -1, var2_int, 48, 0);
          var4 = jf.field_j - ua.field_P;
          if (param0 != -26733) {
            return;
          }
          if (var4 < 5) {
            if (0 < var4) {
              if (4 == (4 & var4)) {
                tg.field_b[7].a(10 + (var3 - 5), 6);
                tg.field_b[7].a(15 + var3, 6);
                tg.field_b[7].a(-3 + (10 + var3), 10);
                tg.field_b[7].a(3 + (var3 + 10), 10);
              }
              if ((var4 & 2) == 2) {
                tg.field_b[7].a(10 + (var3 - 5), 8);
                tg.field_b[7].a(var3 + 15, 8);
              }
              if ((var4 & 1) == 1) {
                tg.field_b[7].a(var3 + 10, 8);
              }
              if (ad.field_d <= 0) {
                if (ad.field_d <= 0) {
                  mi.field_B.a(mh.field_I + var4, var3 + 25, 4, var2_int - 30, 44, 16777215, -1, 1, 1, 14);
                } else {
                  rb.field_o[-1 + ad.field_d].d(var3 + 23, -(rb.field_o[ad.field_d - 1].field_y / 2) - rb.field_o[ad.field_d - 1].field_o + 33, 16711680);
                  mi.field_B.a(mh.field_I + var4, var3 + 23, 4, -30 + var2_int, 44, 16777215, -1, 2, 1, 14);
                }
              } else {
                rb.field_o[-1 + ad.field_d].d(var3 + 23, -(rb.field_o[-1 + ad.field_d].field_y / 2) + (-rb.field_o[-1 + ad.field_d].field_o + 33), 16711680);
                mi.field_B.a(mh.field_I + var4, var3 + 23, 4, 50, 44, 16777215, -1, 2, 1, 14);
              }
            } else {
              if (ad.field_d > 0) {
                var5 = 19;
                if (gm.field_f == 3) {
                  var5 -= 7;
                }
                rb.field_o[-1 + ad.field_d].d(var3 + 23, -(rb.field_o[ad.field_d - 1].field_y / 2) - rb.field_o[-1 + ad.field_d].field_o + var5, 16711680);
                mi.field_B.a(jl.field_l, var3 + 5, 4, -10 + var2_int, 38, 16777215, -1, 1, 2, 14);
              } else {
                mi.field_B.a(jl.field_l, 5 + var3, 4, -10 + var2_int, 44, 16777215, -1, 1, 1, 14);
              }
            }
          } else {
            tg.field_b[8].a(10 + (var3 - 4), 8);
            if (var4 > 5) {
              mi.field_B.a('+', 17 + var3, 30, 16711935);
            }
            if (ad.field_d <= 0) {
              mi.field_B.a(mh.field_I + var4, 23 + var3, 4, var2_int - 30, 44, 16777215, -1, 1, 1, 14);
            } else {
              rb.field_o[-1 + ad.field_d].d(23 + var3, -(rb.field_o[ad.field_d - 1].field_y / 2) + (33 - rb.field_o[-1 + ad.field_d].field_o), 16711680);
              mi.field_B.a(mh.field_I + var4, var3 + 23, 4, -30 + var2_int, 44, 16777215, -1, 2, 1, 14);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "lc.T(" + param0 + ')');
        }
    }

    private final int d(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 41) {
            this.g(-83);
          }
          stackIn_4_0 = this.b(param1, param0 + 159) + bi.field_I;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3), "lc.KA(" + param0 + ',' + param1 + ')');
        }
    }

    private final int c(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= 75) {
            stackIn_4_0 = 30;
            return stackIn_4_0;
          }
          stackIn_2_0 = -10;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3), "lc.NA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void h(int param0) {
        int var25 = 0;
        le var2 = null;
        int var3 = 0;
        double var4 = 0.0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        int var9_int = 0;
        int var10_int = 0;
        int var27 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_85_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        qb[][] var12 = null;
        double[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        String var19 = null;
        String var20_ref_String = null;
        int var20 = 0;
        String var21 = null;
        int var22 = 0;
        int var23 = 0;
        int var26 = 0;
        int[] var31 = null;
        double var4Lifetime1;
        double var4Lifetime2;
        double var4Lifetime3;
        int var8_intLifetime1;
        int var8_intLifetime2;
        int var9_intLifetime1;
        int var9_intLifetime2;
        int var10_intLifetime1;
        int var10_intLifetime2;
        int stackIn_20_0Lifetime1;
        int stackIn_20_1Lifetime1;
        int var18Lifetime1;
        int var18Lifetime2;
        int var23Lifetime1;
        int var23Lifetime2;
        var27 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var2 = jb.field_z;
          if (var2 == null) {
            var2 = r.field_b;
          }
          var3 = var2.field_V.s(0);
          var6 = an.field_f / 2;
          var7 = an.field_j / 2;
          for (var8_int = 0; var8_int < 300; var8_int++) {
            var4 = 3.141592653589793 * (double)var8_int * 2.0 / 300.0;
            var9_int = var6 + (int)(Math.sin(var4) * 240.0);
            var10_int = var7 + (int)(Math.cos(var4) * 160.0);
            de.c(var9_int, var10_int, 8, 0);
          }
          for (var8_intLifetime1 = 0; var8_intLifetime1 < 300; var8_intLifetime1++) {
            var4Lifetime1 = 2.0 * ((double)var8_intLifetime1 * 3.141592653589793) / 300.0;
            var9_intLifetime1 = var6 + (int)(240.0 * Math.sin(var4Lifetime1));
            var10_intLifetime1 = (int)(Math.cos(var4Lifetime1) * 160.0) + var7;
            de.i(var9_intLifetime1, var10_intLifetime1, 7, 7891535);
          }
          for (var8_intLifetime2 = 0; var8_intLifetime2 < 300; var8_intLifetime2++) {
            var4Lifetime2 = 2.0 * (3.141592653589793 * (double)var8_intLifetime2) / 300.0;
            var9_intLifetime2 = (int)(Math.sin(var4Lifetime2) * 239.0) + var6;
            var10_intLifetime2 = (int)(160.0 * Math.cos(var4Lifetime2)) + var7;
            de.i(var9_intLifetime2, -1 + var10_intLifetime2, 4, 11510925);
          }
          de.a();
          var8 = new int[]{255, 0, 0};
          if (param0 != 32) {
            this.field_n = -74;
          }
          var9 = new int[]{0, 255, 0};
          var10 = new int[]{0, 0, 255};
          var11 = new int[]{255, 255, 255};
          var12 = new qb[][]{kc.field_kb, jd.field_j, ea.field_u, qe.field_i, hn.field_d, tj.field_A, bo.field_a, h.field_I, fn.field_b};
          var13 = new double[]{-0.75, 0.75, -0.5, 0.5, -0.25, 0.25};
          var14 = 0;
          while (true) {
            stackIn_20_0 = var3;
            stackIn_20_1 = var14;
            if (stackIn_20_0 <= stackIn_20_1) {
              return;
            }
            var4Lifetime3 = 3.141592653589793 * var13[var14];
            var15 = var6 + (int)(240.0 * Math.sin(var4Lifetime3));
            var16 = uc.field_a * 3 / 4 - (-240 - (int)(140.0 * Math.cos(var4Lifetime3)));
            var17 = nj.field_n[var14];
            for (var18 = -32; var18 < 32; var18++) {
              de.h(0, var16 + var18, an.field_f, var18 + var16 + 8);
              de.i(var15, -(var18 / 2) + var16, 32, 7891535);
              de.c(var15, -(var18 / 2) + var16, 32, 0);
            }
            for (var18Lifetime1 = -32; 32 > var18Lifetime1; var18Lifetime1++) {
              de.h(0, var18Lifetime1 + var16, an.field_f, 8 + (var18Lifetime1 + var16));
              de.i(var15, -4 - var18Lifetime1 / 2 + var16, 28, 13484723);
              de.c(var15, -4 - var18Lifetime1 / 2 + var16, 28, 0);
            }
            de.a();
            var18Lifetime2 = -5 + var7;
            var19 = ae.field_d;
            if (var2.field_I == var2.field_V.d(false)) {
              if (250 > o.field_s) {
                var20_ref_String = Integer.toString(5 - (o.field_s - 1) / 50);
                tj.field_t.b(var20_ref_String, var6 - 1, var18Lifetime2 + 64, 0, 0);
                tj.field_t.b(var20_ref_String, var6, var18Lifetime2 + 64 - 1, 0, 0);
                tj.field_t.b(var20_ref_String, var6, var18Lifetime2 + 64, 16777215, -1);
              }
            } else {
              var19 = qe.field_s;
            }
            mi.field_B.a(var19, var6 - 128 - 1, -1 + var18Lifetime2, 256, 64, 0, -1, 1, 0, 14);
            mi.field_B.a(var19, -129 + var6, var18Lifetime2 + 1, 256, 64, 0, -1, 1, 0, 14);
            mi.field_B.a(var19, var6 - 128 + 1, 1 + var18Lifetime2, 256, 64, 0, -1, 1, 0, 14);
            mi.field_B.a(var19, 1 + (var6 - 128), -1 + var18Lifetime2, 256, 64, 0, -1, 1, 0, 14);
            mi.field_B.a(var19, -1 + (var6 - 128), var18Lifetime2, 256, 64, 0, 0, 1, 0, 14);
            mi.field_B.a(var19, var6 - 128, var18Lifetime2 - 1, 256, 64, 0, 0, 1, 0, 14);
            var16 -= 64;
            var15 -= 32;
            mi.field_B.a(var19, -128 + var6, var18Lifetime2, 256, 64, 16777215, -1, 1, 0, 14);
            var20 = 0;
            if (~var14 == ~(jb.field_v / 50 % var3)) {
              var20 = (int)(-16.0 * Math.sin(3.141592653589793 * (double)(jb.field_v % 50) / 50.0));
            }
            var8[0] = var2.field_V.field_N[var14][0];
            var8[1] = var2.field_V.field_N[var14][1];
            var8[2] = var2.field_V.field_N[var14][2];
            var9[0] = var2.field_V.field_N[var14][3];
            var9[1] = var2.field_V.field_N[var14][4];
            var9[2] = var2.field_V.field_N[var14][5];
            var10[0] = var2.field_V.field_N[var14][6];
            var10[1] = var2.field_V.field_N[var14][7];
            var10[2] = var2.field_V.field_N[var14][8];
            var11[0] = var2.field_V.field_N[var14][9];
            var11[1] = var2.field_V.field_N[var14][10];
            var11[2] = var2.field_V.field_N[var14][11];
            pc.$cfr$intArgs$a$5f050b8899ac(var10, var16 - 2, var11, var8, -101, var9, var12[8][0], 0 + var15);
            pc.$cfr$intArgs$a$5f050b8899ac(var10, var16 + var20 - 0, var11, var8, 34, var9, var12[3][var2.field_V.field_N[var14][15]], var15 + 12);
            pc.$cfr$intArgs$a$5f050b8899ac(var10, 0 + var16, var11, var8, 56, var9, var12[1][var2.field_V.field_N[var14][12]], 0 + var15);
            pc.$cfr$intArgs$a$5f050b8899ac(var10, var16 + 2, var11, var8, 39, var9, var12[7][0], var15 + 0);
            pc.$cfr$intArgs$a$5f050b8899ac(var10, -40 + var16 + 16, var11, var8, -121, var9, var12[0][var2.field_V.field_N[var14][13]], 0 + var15);
            pc.$cfr$intArgs$a$5f050b8899ac(var10, -8 + var16, var11, var8, 37, var9, var12[4][var2.field_V.field_N[var14][17]], 0 + var15);
            if (53 != var2.field_V.field_N[var14][17] &&
              55 != var2.field_V.field_N[var14][17]) {
              pc.$cfr$intArgs$a$5f050b8899ac(var10, -40 + var16 + 32, var11, var8, -118, var9, var12[6][var14], 0 + var15);
            }
            pc.$cfr$intArgs$a$5f050b8899ac(var10, 16 + var16 - 40, var11, var8, -105, var9, var12[5][var2.field_V.field_N[var14][16]], var15 + 0);
            pc.$cfr$intArgs$a$5f050b8899ac(var10, var20 + var16 - 0, var11, var8, 118, var9, var12[2][var2.field_V.field_N[var14][14]], -12 + var15);
            var15 += 32;
            var16 += 64;
            var21 = var2.field_V.field_k[var14];
            var16 += 16;
            var22 = mi.field_B.b("Wmmmmmmmmmmm");
            var15 = var15 - (var22 / 2 + 7);
            var23 = 15 + var22;
            de.c(var15 + 3, -8 + (var16 + 3), -6 + var23, 15, var17, (8421504 | var17) ^ 8421504);
            de.h(var15 + 3, -8 + var16 + 3, 3 + var15 + (var23 - 6), -10 + var16 + 20);
            while (0 < var23) {
              var23 = var23 - g.field_a.field_n;
              g.field_a.b(3 + var15 + var23, -10 + (3 + (-8 + var16)), 64);
            }
            de.a();
            var23Lifetime1 = var22 + 15;
            de.a(var15, -8 + var16, var23Lifetime1, 21, 6, 0);
            de.a(var15 + 2, -8 + (var16 + 2), -4 + var23Lifetime1, 17, 4, 0);
            de.a(var15 + 1, -8 + (var16 + 1), -2 + var23Lifetime1, 19, 6, 16777215);
            de.a(2 + var15, var16 + 2 - 8, -4 + var23Lifetime1, 17, 6, 0);
            var15 = var15 + (7 + var22 / 2);
            mi.field_B.b(var21, -1 + var15, 1 + var16 + mi.field_B.field_C / 2, 0, 0);
            mi.field_B.b(var21, var15, -1 + (var16 - (-1 - mi.field_B.field_C / 2)), 0, 0);
            mi.field_B.b(var21, var15, mi.field_B.field_C / 2 + (1 + var16), 16777215, -1);
            var16 -= 20;
            var15 -= 40;
            var16 -= 10;
            var23Lifetime2 = 1;
            var31 = var2.field_V.e(3, var14);
            for (var25 = 0; var25 < 16; var25++) {
              var26 = var31[var25];
              stackIn_20_0Lifetime1 = ~var26;
              stackIn_20_1Lifetime1 = -13;
              if (stackIn_20_0Lifetime1 <= stackIn_20_1Lifetime1 &&
                (-12 + var26) % 12 >= 10 &&
                var26 >= 0) {
                if ((-6 + var26) / 12 == 0) {
                  de.c(var15 + 10, 10 + var16, 10, 8912896, 256);
                }
                if ((var26 - 6) / 12 == 1) {
                  de.c(10 + var15, 10 + var16, 10, 8404992, 256);
                }
                if ((var26 - 6) / 12 == 2) {
                  de.c(10 + var15, 10 + var16, 10, 8947712, 256);
                }
                if ((-6 + var26) / 12 == 3) {
                  de.c(10 + var15, 10 + var16, 10, 34952, 256);
                }
                if (4 == (-6 + var26) / 12) {
                  de.c(var15 + 10, 10 + var16, 10, 8947848, 256);
                }
                if (5 == (-6 + var26) / 12) {
                  de.c(10 + var15, var16 + 10, 10, 65280, 256);
                }
                gn.a(10, (byte) 99, 256, var15 + 10, var16 + 10);
                stackIn_85_0 = (var23Lifetime2 != 0) ? 0 : 1;
                var23Lifetime2 = stackIn_85_0;
                bb.field_g[dd.field_f[var26]].b(var15, var16);
                if (var23Lifetime2 != 0) {
                  var15 -= 20;
                  var16 -= 20;
                } else {
                  var15 += 20;
                }
              }
            }
            var14++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2_ref), "lc.Q(" + param0 + ')');
        }
    }

    private final void a(boolean param0) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        le var2 = null;
        int var3 = 0;
        int var4 = 0;
        double var5 = 0.0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        int var10_int = 0;
        int var11_int = 0;
        int var33 = 0;
        int stackIn_73_0 = 0;
        int[] stackIn_114_0;
        int stackIn_114_1;
        int[] stackIn_114_2;
        int[] stackIn_114_3;
        int stackIn_114_4;
        int[] stackIn_114_5;
        qb[] stackIn_114_6;
        int stackIn_115_7;
        StringBuilder stackIn_137_0 = null;
        String stackIn_138_1 = null;
        StringBuilder stackIn_141_0 = null;
        String stackIn_142_1 = null;
        int stackIn_157_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        qb[][] var13 = null;
        StringBuilder var14 = null;
        String var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        double[] var19 = null;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        Object var27 = null;
        int var28 = 0;
        Object var29 = null;
        int var30 = 0;
        qb var31 = null;
        int var32 = 0;
        double var5Lifetime1;
        double var5Lifetime2;
        double var5Lifetime3;
        int var9_intLifetime1;
        int var9_intLifetime2;
        int var10_intLifetime1;
        int var10_intLifetime2;
        int var11_intLifetime1;
        int var11_intLifetime2;
        int var16Lifetime1;
        int var16Lifetime2;
        int var25Lifetime1;
        int var32Lifetime1;
        int var16Lifetime2Lifetime1;
        var33 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var2 = jb.field_z;
          if (var2 == null) {
            var2 = r.field_b;
          }
          var3 = var2.field_V.s(0);
          var4 = var2.field_V.d(false);
          if (0 <= var4 &&
            var2.field_V.field_d) {
            var4 = var4 & 1;
          }
          var7 = an.field_f / 2;
          var8 = an.field_j / 2;
          for (var9_int = 0; var9_int < 300; var9_int++) {
            var5 = (double)var9_int * 3.141592653589793 * 2.0 / 300.0;
            var10_int = var7 + (int)(Math.sin(var5) * 240.0);
            var11_int = var8 + (int)(160.0 * Math.cos(var5));
            de.c(var10_int, var11_int, 8, 0);
          }
          for (var9_intLifetime1 = 0; 300 > var9_intLifetime1; var9_intLifetime1++) {
            var5Lifetime1 = 3.141592653589793 * (double)var9_intLifetime1 * 2.0 / 300.0;
            var10_intLifetime1 = (int)(240.0 * Math.sin(var5Lifetime1)) + var7;
            var11_intLifetime1 = var8 + (int)(Math.cos(var5Lifetime1) * 160.0);
            de.i(var10_intLifetime1, var11_intLifetime1, 7, 7891535);
          }
          for (var9_intLifetime2 = 0; 300 > var9_intLifetime2; var9_intLifetime2++) {
            var5Lifetime2 = (double)var9_intLifetime2 * 3.141592653589793 * 2.0 / 300.0;
            var10_intLifetime2 = (int)(239.0 * Math.sin(var5Lifetime2)) + var7;
            var11_intLifetime2 = var8 + (int)(Math.cos(var5Lifetime2) * 160.0);
            de.i(var10_intLifetime2, -1 + var11_intLifetime2, 4, 11510925);
          }
          de.a();
          var9 = new int[]{255, 0, 0};
          var10 = new int[]{0, 255, 0};
          var11 = new int[]{0, 0, 255};
          var12 = new int[]{255, 255, 255};
          var13 = new qb[][]{kc.field_kb, jd.field_j, ea.field_u, qe.field_i, hn.field_d, tj.field_A, bo.field_a, h.field_I, fn.field_b};
          var14 = new StringBuilder(20);
          if (null != var2.field_w) {
            var2.field_V = var2.field_w;
          }
          if (var4 >= 0) {
            if (var2.field_V.field_d) {
              if (0 == var4) {
                discarded$0 = var14.append(rn.field_K + b.field_d + "<br><br>");
              }
              if (1 == var4) {
                discarded$1 = var14.append(rn.field_K + cn.field_I + "<br><br>");
              }
            } else {
              discarded$2 = var14.append(rn.field_K + var2.field_V.field_k[var4] + "<br><br>");
            }
          } else {
            if (-2 == var4) {
              discarded$3 = var14.append(ff.field_d);
            } else {
              discarded$4 = var14.append(th.field_a);
            }
          }
          var15 = var14.toString();
          if (var2.field_V.d(1)) {
            var16 = 0;
            incrementValue$5 = var16;
            var16++;
            var15 = lk.a(var15, 10, incrementValue$5, lo.field_v);
            incrementValue$6 = var16;
            var16++;
            var15 = lk.a(var15, 10, incrementValue$6, tm.field_e);
            incrementValue$7 = var16;
            var16++;
            var15 = lk.a(var15, 10, incrementValue$7, qa.field_p);
            incrementValue$8 = var16;
            var16++;
            var15 = lk.a(var15, 10, incrementValue$8, ej.field_N);
            incrementValue$9 = var16;
            var16++;
            var15 = lk.a(var15, 10, incrementValue$9, tl.field_e);
            incrementValue$10 = var16;
            var16++;
            var15 = lk.a(var15, 10, incrementValue$10, be.field_a);
            incrementValue$11 = var16;
            var16++;
            var15 = lk.a(var15, 10, incrementValue$11, q.field_J);
            incrementValue$12 = var16;
            var16++;
            var15 = lk.a(var15, 10, incrementValue$12, wk.field_h);
            incrementValue$13 = var16;
            var16++;
            var15 = lk.a(var15, 10, incrementValue$13, ed.field_Eb);
            incrementValue$14 = var16;
            var16++;
            var15 = lk.a(var15, 10, incrementValue$14, ob.field_X);
            incrementValue$15 = var16;
            var16++;
            var15 = lk.a(var15, 10, incrementValue$15, ao.field_a);
            incrementValue$16 = var16;
            var16++;
            var15 = lk.a(var15, 10, incrementValue$16, co.field_b);
            incrementValue$17 = var16;
            var16++;
            var15 = lk.a(var15, 10, incrementValue$17, gi.field_i);
            incrementValue$18 = var16;
            var16++;
            var15 = lk.a(var15, 10, incrementValue$18, nj.field_i);
            incrementValue$19 = var16;
            var16++;
            var15 = lk.a(var15, 10, incrementValue$19, rk.field_S);
            incrementValue$20 = var16;
            var16++;
            var15 = lk.a(var15, 10, incrementValue$20, gk.field_a);
            if (lk.a(0, (byte) -36)) {
              incrementValue$21 = var16;
              var16++;
              var15 = lk.a(var15, 10, incrementValue$21, lj.field_q);
            }
          } else {
            var15 = nj.field_b;
          }
          var16Lifetime1 = 128 + 14 * mi.field_B.a(var15, 256);
          var17 = jb.field_v / 3 % var16Lifetime1 - 128;
          var18 = uc.field_a + 180;
          de.h(0, var18, an.field_f, 128 + var18);
          mi.field_B.a(var15, -128 + var7 - 1, -var17 - 1 + var18, 256, 256, 0, -1, 1, 0, 14);
          mi.field_B.a(var15, var7 - 129, -var17 + var18 + 1, 256, 256, 0, -1, 1, 0, 14);
          mi.field_B.a(var15, -128 + var7 + 1, -var17 + (var18 + 1), 256, 256, 0, -1, 1, 0, 14);
          mi.field_B.a(var15, -128 + var7 + 1, -var17 + var18 - 1, 256, 256, 0, -1, 1, 0, 14);
          mi.field_B.a(var15, var7 - 129, -var17 + var18, 256, 256, 0, 0, 1, 0, 14);
          mi.field_B.a(var15, var7 - 128, -1 + (var18 - var17), 256, 256, 0, 0, 1, 0, 14);
          mi.field_B.a(var15, -128 + var7, -var17 + var18, 256, 256, 16777215, -1, 1, 0, 14);
          de.a();
          de.d(3, 2, -128 + var7, -1 + var18, 256, 2);
          de.d(2, 1, -128 + var7, var18 + 1, 256, 1);
          de.d(1, 1, -128 + var7, 2 + var18, 256, 1);
          de.d(1, 1, -128 + var7, -3 + (128 + var18), 256, 1);
          de.d(2, 1, -128 + var7, -2 + (128 + var18), 256, 1);
          de.d(3, 2, var7 - 128, var18 + 127, 256, 2);
          var19 = new double[]{-0.75, 0.75, -0.5, 0.5, -0.25, 0.25};
          var20 = 0;
          if (!param0) {
            return;
          }
          while (var20 < var3) {
            boolean decompiledFrameRemainder0 = true;
            var5Lifetime3 = var19[var20] * 3.141592653589793;
            if ((var2.field_V.field_d ||
              var4 != var20) && (!var2.field_V.field_d ||
              ~var4 != ~(var20 & 1) ||
              (1 << var20 & var2.field_J) != 0)) {
              stackIn_73_0 = 0;
              decompiledFrameRemainder0 = false;
            }
            else {
              stackIn_73_0 = 1;
            }
            var21 = stackIn_73_0;
            var22 = (int)(240.0 * Math.sin(var5Lifetime3)) + var7;
            var23 = uc.field_a / 2 + (240 + (int)(140.0 * Math.cos(var5Lifetime3)));
            var24 = nj.field_n[var20];
            if (var21 != 0) {
              for (var25 = -48; var25 < 48; var25++) {
                de.h(0, var25 + (var23 - 16), an.field_f, 24 + var23 + var25);
                de.i(var22, -4 + (-(var25 / 2) + var23 - 16), 28, 13484723);
                gn.a(48, (byte) 90, 32, var22, -16 + (-(var25 / 2) + var23 - 4));
                de.c(var22, -16 - var25 / 2 + var23 - 4, 28, 0);
              }
              var23 -= 16;
            } else {
              for (var25 = -32; var25 < 32; var25++) {
                de.h(0, var23 + var25, an.field_f, 8 + var25 + var23);
                de.i(var22, var23 - var25 / 2, 32, 7891535);
                de.c(var22, -(var25 / 2) + var23, 32, 0);
              }
              for (var25 = -32; var25 < 32; var25++) {
                de.h(0, var23 + var25, an.field_f, var25 + var23 + 8);
                de.i(var22, -4 + var23 - var25 / 2, 28, 13484723);
                de.c(var22, -4 - var25 / 2 + var23, 28, 0);
              }
            }
            var23 -= 64;
            var22 -= 32;
            de.a();
            var25Lifetime1 = 0;
            var26 = 0;
            if (var21 != 0) {
              var25Lifetime1 = (int)(-16.0 * Math.sin(3.141592653589793 * (double)(jb.field_v % 50) / 50.0));
              if (jb.field_v / 50 % 5 == 0) {
                var26 = var25Lifetime1;
              }
            }
            var9[0] = var2.field_V.field_N[var20][0];
            var9[1] = var2.field_V.field_N[var20][1];
            var9[2] = var2.field_V.field_N[var20][2];
            var10[0] = var2.field_V.field_N[var20][3];
            var10[1] = var2.field_V.field_N[var20][4];
            var10[2] = var2.field_V.field_N[var20][5];
            var11[0] = var2.field_V.field_N[var20][6];
            var11[1] = var2.field_V.field_N[var20][7];
            var11[2] = var2.field_V.field_N[var20][8];
            var12[0] = var2.field_V.field_N[var20][9];
            var12[1] = var2.field_V.field_N[var20][10];
            var12[2] = var2.field_V.field_N[var20][11];
            if (46 != var2.field_V.field_N[var20][12]) {
              pc.$cfr$intArgs$a$5f050b8899ac(var11, -2 + (var23 + var26), var12, var9, 29, var10, var13[8][0], var22 + 0);
            }
            pc.$cfr$intArgs$a$5f050b8899ac(var11, var23 + var25Lifetime1 - (0 - var26 / 2), var12, var9, -82, var10, var13[3][var2.field_V.field_N[var20][15]], 12 + var22);
            pc.$cfr$intArgs$a$5f050b8899ac(var11, 0 + var23 + var26 * 3 / 2, var12, var9, -81, var10, var13[1][var2.field_V.field_N[var20][12]], var22 + 0);
            if (var2.field_V.field_N[var20][12] != 46) {
              pc.$cfr$intArgs$a$5f050b8899ac(var11, 2 + var23, var12, var9, -93, var10, var13[7][0], var22 - 0);
            }
            if (var21 == 0) {
              var23 += 16;
              var22 += 8;
            }
            pc.$cfr$intArgs$a$5f050b8899ac(var11, -40 + (var23 + (16 + var26 * 3 / 2)), var12, var9, 92, var10, var13[0][var2.field_V.field_N[var20][13]], var22 + 0);
            pc.$cfr$intArgs$a$5f050b8899ac(var11, var23 - (-32 + (40 - var26 * 3 / 2)), var12, var9, -125, var10, var13[4][var2.field_V.field_N[var20][17]], var22 - 0);
            if (var2.field_V.field_N[var20][17] != 53 &&
              var2.field_V.field_N[var20][17] != 55) {
              stackIn_114_0 = var11;
              stackIn_114_1 = var23 + 32 + (-40 + var26 * 3 / 2);
              stackIn_114_2 = var12;
              stackIn_114_3 = var9;
              stackIn_114_4 = 20;
              stackIn_114_5 = var10;
              stackIn_114_6 = var13[6];
              if (var21 != 0) {
                stackIn_115_7 = 8;
              } else {
                stackIn_115_7 = 16;
              }
              pc.$cfr$intArgs$a$5f050b8899ac(stackIn_114_0, stackIn_114_1, stackIn_114_2, stackIn_114_3, stackIn_114_4, stackIn_114_5, stackIn_114_6[stackIn_115_7 + (var20 + jb.field_v / 200) % 8], var22 - 0);
            }
            pc.$cfr$intArgs$a$5f050b8899ac(var11, 3 * var26 / 2 + var23 + 16 - 40, var12, var9, -102, var10, var13[5][var2.field_V.field_N[var20][16]], var22 + 0);
            if (var21 == 0) {
              var23 -= 16;
              var22 -= 8;
            }
            pc.$cfr$intArgs$a$5f050b8899ac(var11, var26 * 2 + (var25Lifetime1 + var23 + 0), var12, var9, -88, var10, var13[2][var2.field_V.field_N[var20][14]], var22 - 12);
            var22 += 32;
            var23 += 64;
            var27 = var2.field_V.field_k[var20];
            var28 = mi.field_B.b("Wmmmmmmmmmmm");
            if (var4 == var20) {
              var23 += 16;
            }
            var22 = var22 - (var28 / 2 + 7);
            var23 += 16;
            var16Lifetime2 = 15 + var28;
            de.c(var22 + 3, -8 + (var23 + 3), var16Lifetime2 - 6, 15, var24, 8421504 ^ (8421504 | var24));
            de.h(var22 + 3, -5 + var23, var16Lifetime2 + 3 + var22 - 6, -2 + (17 + (var23 - 8)) + 3);
            while (var16Lifetime2 > 0) {
              var16Lifetime2 = var16Lifetime2 - g.field_a.field_n;
              g.field_a.b(var22 + (3 + var16Lifetime2), 3 + (var23 - 18), 64);
            }
            de.a();
            var16Lifetime2Lifetime1 = 15 + var28;
            de.a(var22, var23 - 8, var16Lifetime2Lifetime1, 21, 6, 0);
            de.a(2 + var22, -6 + var23, -4 + var16Lifetime2Lifetime1, 17, 4, 0);
            de.a(1 + var22, 1 + var23 - 8, var16Lifetime2Lifetime1 - 2, 19, 6, 16777215);
            de.a(var22 + 2, -8 + (2 + var23), -4 + var16Lifetime2Lifetime1, 17, 6, 0);
            var22 = var22 + (7 + var28 / 2);
            var29 = null;
            if ((1 << var20 & var2.field_b) != 0) {
              var29 = hf.field_b;
            } else {
              if ((~var2.field_a & var2.field_b) > 0) {
                if ((1 << var20 & var2.field_a) != 0) {
                  var29 = ea.field_I;
                } else {
                  stackIn_137_0 = new StringBuilder().append(field_r);
                  if ((jb.field_v & 11) >> 3 != 0) {
                    stackIn_138_1 = ".";
                  } else {
                    stackIn_138_1 = "";
                  }
                  stackIn_141_0 = ((StringBuilder) (Object) stackIn_137_0).append(stackIn_138_1);
                  if ((2 & jb.field_v >> 3) == 0) {
                    stackIn_142_1 = "";
                  } else {
                    stackIn_142_1 = "..";
                  }
                  var29 = ((StringBuilder) (Object) stackIn_141_0).append(stackIn_142_1).toString();
                }
              }
            }
            if (var29 != null &&
              0 == (128 & jb.field_v)) {
              var27 = var29;
            }
            mi.field_B.b((String) (var27), var22 - 1, var23 + 1 + mi.field_B.field_C / 2, 0, 0);
            mi.field_B.b((String) (var27), var22, -1 + (mi.field_B.field_C / 2 + 1) + var23, 0, 0);
            mi.field_B.b((String) (var27), var22, mi.field_B.field_C / 2 + var23 + 1, 16777215, -1);
            var22 -= 16;
            var23 -= 32;
            if (var2.field_V.d(1)) {
              if (!var2.field_i) {
                stackIn_157_0 = 0;
              } else {
                stackIn_157_0 = var2.field_V.d(-108, var20);
              }
              var30 = stackIn_157_0;
              var31 = new qb(32 + (24 + var30 * 8), 80);
              var31.a();
              for (var32 = 0; var32 < var30; var32++) {
                tg.field_b[7].a(16 + 8 * var32 + 8, 24, 0, 16744703);
              }
              de.d(4, 4, 0, 0, 8 * var30 + 24 + 32, 80);
              ce.field_m.a(true);
              var31.b(-(var30 * 8) + (var22 - 36), -24 + var23 - 16, 256);
              var31.b(-14 + (var22 + (-(8 * var30) - 16)) + 6, -16 + (-24 + var23), 256);
              var31.b(var22 - (8 * var30 + 30), -24 + var23 - 22, 256);
              var31.b(-16 - var30 * 8 + var22 - 14, -34 + var23, 256);
              for (var32Lifetime1 = 0; var32Lifetime1 < var30; var32Lifetime1++) {
                tg.field_b[7].a(-14 - var32Lifetime1 * 8 + var22, var23 - 16);
              }
            }
            var20++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2_ref), "lc.JA(" + param0 + ')');
        }
    }

    private final boolean a(boolean param0, int param1, byte param2, boolean param3, int param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int stackIn_16_0 = 0;
        int stackIn_22_0;
        int stackIn_22_1;
        int stackIn_22_2;
        int stackIn_22_3;
        int stackIn_23_4;
        int stackIn_29_0;
        int stackIn_29_1;
        int stackIn_29_2;
        int stackIn_29_3;
        int stackIn_30_4;
        int stackIn_32_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 &&
            an.field_g >= param4 &&
            (param1 + param4) > an.field_g &&
            param6 <= me.field_I &&
            me.field_I < param5 + param6) {
            stackIn_16_0 = 1;
          } else {
            stackIn_16_0 = 0;
          }
          var8_int = stackIn_16_0;
          de.a(param4, param6, param1, param5, 14802120);
          param6++;
          param5 -= 2;
          param4++;
          param1 -= 2;
          de.a(param4, param6, param1, param5, 1572892);
          param1 -= 2;
          param5 -= 2;
          param4++;
          param6++;
          de.a(param4, param6, param1, param5, 7887708);
          param4++;
          param1 -= 2;
          var9 = -96 % ((32 - param2) / 42);
          param6++;
          param5 -= 2;
          if (param0) {
            stackIn_29_0 = param4;
            stackIn_29_1 = param6;
            stackIn_29_2 = param1;
            stackIn_29_3 = param5;
            if (var8_int == 0) {
              stackIn_30_4 = 13220778;
            } else {
              stackIn_30_4 = 16181230;
            }
            de.e(stackIn_29_0, stackIn_29_1, stackIn_29_2, stackIn_29_3, stackIn_30_4, 230);
          } else {
            stackIn_22_0 = param4;
            stackIn_22_1 = param6;
            stackIn_22_2 = param1;
            stackIn_22_3 = param5;
            if (var8_int != 0) {
              stackIn_23_4 = 14075852;
            } else {
              stackIn_23_4 = 11374744;
            }
            de.e(stackIn_22_0, stackIn_22_1, stackIn_22_2, stackIn_22_3, stackIn_23_4, 230);
          }
          de.b(param4 - 1, param6 + 3, param4 + 4, param6 - 2, 1572892);
          de.b(param4 - 2, 5 + param6, 5 + param4, param6 - 2, 14802120);
          de.b(-1 + param4, 5 + param6, 5 + param4, -1 + param6, 1572892);
          de.b(param4, 5 + param6, 5 + param4, param6, 7887708);
          de.b(param1 + (param4 - 0), param6 + 3, param1 + (-5 + param4), -2 + param6, 1572892);
          de.b(param1 + (1 + param4), param6 + 5, param1 + (param4 - 6), -2 + param6, 14802120);
          de.b(param4 + 0 + param1, param6 + 5, -6 + (param4 + param1), param6 - 1, 1572892);
          de.b(-1 + param4 + param1, 5 + param6, param1 + (-6 + param4), param6, 7887708);
          de.b(param4 - 1, param6 - (4 - param5), 4 + param4, 1 + param6 + param5, 1572892);
          de.b(param4 - 2, param6 - 6 + param5, 5 + param4, param5 + 1 + param6, 14802120);
          de.b(-1 + param4, param5 + (-6 + param6), 5 + param4, param5 + (0 + param6), 1572892);
          de.b(param4, param5 - 6 + param6, 5 + param4, param5 + param6 - 1, 7887708);
          de.b(param4 - 0 + param1, param5 + (-4 + param6), param1 + (-5 + param4), param6 + 1 + param5, 1572892);
          de.b(param1 + 1 + param4, param5 + param6 - 6, param4 + (-6 + param1), param5 + 1 + param6, 14802120);
          de.b(param1 + (param4 - 0), param6 - 6 + param5, param4 - 6 + param1, param5 + (param6 + 0), 1572892);
          de.b(param4 - (1 - param1), param5 + (param6 - 6), -6 + (param4 + param1), -1 + (param5 + param6), 7887708);
          stackIn_32_0 = var8_int;
          return stackIn_32_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var8), "lc.MA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    private final void d(boolean param0) {
        int var8 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        String var4 = null;
        String[] var5 = null;
        int[] var6 = null;
        int var7 = 0;
        String var9 = null;
        int var10 = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        int var2_intLifetime3;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime1Lifetime1;
        var10 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (lc.a((byte) 112)) {
            this.g(12);
            return;
          }
          if (null == nj.field_e) {
            nj.field_e = eb.a(true, 10, 0, 7);
          }
          var2_int = 125 + uc.field_a - 16;
          var2_int += 16;
          var3 = 0;
          mi.field_B.b(rd.field_d, no.field_tb[0] + bi.field_I, var2_int, var3, -1);
          mi.field_B.b(ej.field_H, no.field_tb[1] + bi.field_I, var2_int, var3, -1);
          mi.field_B.b(oo.field_o, no.field_tb[2] + bi.field_I, var2_int, var3, -1);
          mi.field_B.b(fc.field_d, no.field_tb[3] + bi.field_I, var2_int, var3, -1);
          mi.field_B.b(sl.field_N, no.field_tb[4] + bi.field_I, var2_int, var3, -1);
          if (!param0) {
            this.f(-123);
          }
          boolean decompiledFrameRemainder0 = true;
          var2_int = var2_int + (8 + tj.field_t.field_C);
          if (!nj.field_e.field_g) {
            var4 = ba.field_f;
          } else {
            if (null != nj.field_e.field_r) {
              var4 = rm.field_d;
              var5 = nj.field_e.field_r[ie.field_Sb];
              var6 = nj.field_e.field_l[ie.field_Sb];
              var7 = 0;
              for (var8 = 0; var8 < 10; var8++) {
                if (null != var5[var8]) {
                  var3Lifetime1 = 0;
                  if ((var8 & 1) == 1) {
                    var3Lifetime1 = 16777215;
                  }
                  var9 = var5[var8];
                  if (var9.equals(ah.field_b)) {
                    var3Lifetime1 = 16776960;
                    var7 = 1;
                  }
                  this.a(var3Lifetime1, var6[4 * var8 + 1], var9, var6[3 + var8 * 4], var6[4 * var8], var8, (byte) -114, var6[2 + var8 * 4], var2_int);
                  var4 = "";
                }
                var2_int += 25;
              }
              if ((var7 == 0)) {
                var3Lifetime1Lifetime1 = 16776960;
                this.a(var3Lifetime1Lifetime1, nj.field_e.field_k, ah.field_b, nj.field_e.field_s, nj.field_e.field_i, -1, (byte) -126, nj.field_e.field_h, var2_int);
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              var4 = rk.field_R;
            }
          }
          var3Lifetime2 = 0;
          var2_intLifetime1 = -16 + uc.field_a + 125;
          de.d(-((-no.field_tb[0] + no.field_tb[1]) / 2) + no.field_tb[0] + bi.field_I, 16 + (var2_intLifetime1 + 9), 276, var3Lifetime2);
          de.d(bi.field_I + (no.field_tb[0] + no.field_tb[1]) / 2, 16 + (9 + var2_intLifetime1), 276, var3Lifetime2);
          de.d(bi.field_I + (no.field_tb[2] + no.field_tb[1]) / 2, 16 + (9 + var2_intLifetime1), 276, var3Lifetime2);
          de.d(bi.field_I + (no.field_tb[2] + no.field_tb[3]) / 2, 16 + var2_intLifetime1 + 9, 276, var3Lifetime2);
          de.d(bi.field_I + (no.field_tb[3] + no.field_tb[4]) / 2, 9 + var2_intLifetime1 + 16, 276, var3Lifetime2);
          if ("" != var4) {
            var2_intLifetime2 = 16 + uc.field_a + 125;
            mi.field_B.a(var4, bi.field_I + 64, -16 + var2_intLifetime2, 0, -1);
          }
          if (ie.field_Sb != 0) {
            var2_intLifetime3 = uc.field_a + 125;
            mi.field_B.b(ij.field_Cb, 320 + bi.field_I, var2_intLifetime3 - 16, 0, -1);
          } else {
            var2_intLifetime3 = uc.field_a + 125;
            mi.field_B.b(me.field_N, bi.field_I + 320, var2_intLifetime3 - 16, 0, -1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "lc.U(" + param0 + ')');
        }
    }

    final void d(byte param0) {
        if (param0 != 103) {
          return;
        }
        try {
          if (6 == this.field_l) {
            nj.field_e = null;
          }
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "lc.D(" + param0 + ')');
        }
    }

    private final void a(byte param0, boolean param1, int param2) {
        int stackIn_63_0;
        int stackIn_63_1;
        int stackIn_63_2;
        int stackIn_63_3;
        int stackIn_64_4 = 0;
        int stackIn_68_5;
        int stackIn_77_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_93_0 = 0;
        int stackIn_97_0 = 0;
        int stackIn_102_0 = 0;
        int stackIn_121_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        String var5 = null;
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
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var15Lifetime1;
        var20 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          boolean decompiledFrameRemainder0 = true;
          var4_int = wl.field_L[this.field_l][param2];
          var5 = ce.field_g[var4_int];
          if (var4_int == 8) {
            if (th.field_f != 0 &&
              mn.field_r != 0 &&
              10 != th.field_f &&
              10 != mn.field_r) {
              if (th.field_f != 1 &&
                mn.field_r != 1) {
                if (th.field_f != 2 &&
                  2 != mn.field_r &&
                  3 != th.field_f &&
                  3 != mn.field_r &&
                  th.field_f != 4 &&
                  mn.field_r != 4) {
                  if ((th.field_f == 15 ||
                    mn.field_r == 15)) {
                    var5 = ce.field_g[14];
                  }
                } else {
                  var5 = q.field_I;
                }
              } else {
                var5 = ja.field_r;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              var5 = ce.field_g[7];
            }
          }
          var6 = tj.field_t.b(var5);
          var7 = this.d(41, param2);
          var8 = this.a(param2, (byte) 103);
          var9 = this.f(param2, -7661);
          if (var4_int == 20 ||
            var4_int == 21) {
            var6 = ff.field_c + 120;
          }
          var10 = -var6 + (var7 + var8) >> 1;
          var11 = this.c(param2, 110);
          var12 = -var7 + var8;
          var13 = this.c(param2, 100);
          var14 = 0;
          if (this.field_l != 0 &&
            15 != this.field_l) {
            stackIn_63_0 = var7 + 2;
            stackIn_63_1 = 1 + var9;
            stackIn_63_2 = var12 - 4;
            stackIn_63_3 = -2 + var13;
            if (!param1) {
              stackIn_64_4 = 0;
            } else {
              stackIn_64_4 = 2964062;
            }
            if (param1) {
              stackIn_68_5 = 16711164;
            } else {
              stackIn_68_5 = 5928124;
            }
            de.c(stackIn_63_0, stackIn_63_1, stackIn_63_2, stackIn_63_3, stackIn_64_4, stackIn_68_5);
            var14 = 1;
            de.a(1 + var7, var9, var12 - 2, var13, 5, 0);
            de.a(var7, var9 - 1, var12, var13 + 2, 6, 16777215);
            de.h(var7 + 2, 1 + var9, var12 + (2 + var7 - 4), -2 + (1 + var9 + var13));
            for (var15 = 2 + var7; (var12 + (2 + var7 - 4)) > var15; var15 = var15 + sm.field_d.field_n) {
              sm.field_d.b(var15, -16 + var9, 32);
            }
            de.a();
            de.c(var7 + 4, var9 + 2, var12 - 8, 9, 4, 16777215, 64);
            de.c(5 + var7, var9 + 3, var12 - 10, 7, 3, 16777215, 64);
          }
          stackIn_77_0 = (!param1) ? 16173159 : 7097239;
          var15Lifetime1 = stackIn_77_0;
          stackIn_81_0 = (param1) ? 16598235 : 16738820;
          var16 = stackIn_81_0;
          if (!lc.a((byte) 112) &&
            0 < ah.field_c &&
            var4_int == 15) {
            stackIn_93_0 = (!param1) ? 0 : 7097239;
            var15Lifetime1 = stackIn_93_0;
            stackIn_97_0 = (!param1) ? 16738820 : 16777215;
            var16 = stackIn_97_0;
          }
          var17 = var15Lifetime1;
          stackIn_102_0 = (param1) ? 7536857 : 10027008;
          var18 = stackIn_102_0;
          if (param0 != 98) {
            this.d(false);
          }
          if (var14 != 0) {
            var17 = var16;
            var18 = 0;
          } else {
            if (wl.field_L[this.field_l].length > 1) {
              var17 = km.a(param2, wl.field_L[this.field_l].length, -1422079448, var16, var15Lifetime1);
            }
          }
          lk.a(var9, var10, var5, var18, var17, param0 ^ -15);
          if (var4_int != 20 &&
            var4_int != 21) {
            return;
          }
          var10 = var10 + ff.field_c;
          de.g(var10, -4 + (var9 + var11 / 2), 121, 8, 3, var17);
          de.a(var10, -4 + (var11 / 2 + var9), 121, 8, 3, var18);
          if (20 == var4_int) {
            stackIn_121_0 = 120 * si.field_l / 256;
          } else {
            stackIn_121_0 = 120 * ul.field_A / 256;
          }
          var19 = stackIn_121_0;
          de.g(-4 + var10 + var19, var9 + 3, 8, var11 - 6, 3, var17);
          de.a(-4 + var19 + var10, 3 + var9, 8, -6 + var11, 3, var18);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var4), "lc.CA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final int f(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_l != 14 &&
            this.field_l != 8 &&
            this.field_l != 7) {
            if (param1 == -7661) {
              stackIn_14_0 = this.e(param0, param1 + 7736) + uc.field_a;
              return stackIn_14_0;
            }
            stackIn_12_0 = 94;
            return stackIn_12_0;
          }
          stackIn_9_0 = this.e(param0, 75) + uc.field_a + uc.field_a / 8;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3), "lc.G(" + param0 + ',' + param1 + ')');
        }
    }

    private final void e(int param0) {
        boolean discarded$0 = false;
        boolean discarded$3 = false;
        boolean discarded$1 = false;
        boolean discarded$2 = false;
        boolean discarded$5 = false;
        String[] array$4 = null;
        int stackIn_87_0 = 0;
        boolean stackIn_91_1 = false;
        int stackIn_152_0 = 0;
        int stackIn_154_0 = 0;
        int stackIn_353_0 = 0;
        int stackIn_353_1 = 0;
        int stackIn_376_0 = 0;
        int stackIn_376_1 = 0;
        int stackIn_493_0 = 0;
        int stackIn_493_1 = 0;
        int stackIn_573_0 = 0;
        int stackIn_573_1 = 0;
        int stackIn_586_0 = 0;
        int stackIn_636_0 = 0;
        int stackIn_636_1 = 0;
        int stackIn_731_0 = 0;
        int stackIn_731_1 = 0;
        int stackIn_770_0 = 0;
        int stackIn_770_1 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        qb var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13_int = 0;
        String var13 = null;
        double var14_double = 0.0;
        int var14 = 0;
        String var14_ref_String = null;
        int var15 = 0;
        String var15_ref_String = null;
        double var16_double = 0.0;
        int var16 = 0;
        int var17_int = 0;
        double var17_double = 0.0;
        Object var17 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        double var20_double = 0.0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25_int = 0;
        double var25 = 0.0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        qb var32 = null;
        String var33 = null;
        String var34 = null;
        String var35 = null;
        String var36 = null;
        String var37 = null;
        String var38 = null;
        String var39 = null;
        String var40 = null;
        String var13Lifetime1;
        int stackIn_152_0Lifetime1;
        int stackIn_353_0Lifetime1;
        int stackIn_353_1Lifetime1;
        int stackIn_376_0Lifetime1;
        int stackIn_376_1Lifetime1;
        int stackIn_493_0Lifetime1;
        int stackIn_493_1Lifetime1;
        int stackIn_573_0Lifetime1;
        int stackIn_573_1Lifetime1;
        int stackIn_636_0Lifetime1;
        int stackIn_636_1Lifetime1;
        int stackIn_731_0Lifetime1;
        int stackIn_731_1Lifetime1;
        int stackIn_770_0Lifetime1;
        int var7Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var11Lifetime2;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var12Lifetime4;
        int var13_intLifetime1;
        int var13_intLifetime2;
        int var13_intLifetime3;
        int var13_intLifetime4;
        int var13_intLifetime5;
        int var13_intLifetime6;
        int var13_intLifetime7;
        double var14_doubleLifetime1;
        double var14_doubleLifetime2;
        int var15Lifetime1;
        int var15Lifetime2;
        int var15Lifetime3;
        int var15Lifetime4;
        int var16Lifetime1;
        int var16Lifetime2;
        int var16Lifetime3;
        int var16Lifetime4;
        int var16Lifetime5;
        int var17_intLifetime1;
        int var17_intLifetime2;
        int var17_intLifetime3;
        int var17_intLifetime4;
        int var18Lifetime1;
        int var18Lifetime2;
        int var18Lifetime3;
        int var19Lifetime1;
        int var19Lifetime2;
        int var19Lifetime3;
        int var20Lifetime1;
        int var24Lifetime1;
        int var24Lifetime2;
        int var25_intLifetime1;
        double var25Lifetime1;
        int var27Lifetime1;
        int var28Lifetime1;
        int stackIn_770_1Lifetime1;
        int var24Lifetime3;
        int var15Lifetime2Lifetime1;
        int var15Lifetime3Lifetime1;
        int var15Lifetime3Lifetime2;
        int var16Lifetime4Lifetime1;
        int var16Lifetime4Lifetime2;
        int var17_intLifetime4Lifetime1;
        int var24Lifetime1Lifetime1;
        var29 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var32 = tg.field_b[7].b();
          var3 = -ua.field_P + jf.field_j;
          this.c(-26733);
          this.field_m = -1;
          discarded$0 = this.a(false, 245, (byte) -43, false, bi.field_I + 26, 245, uc.field_a + 178);
          if (this.field_d < 0) {
            this.field_d = 0;
          }
          var4 = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
          if ((-6 + var4.length) < this.field_d) {
            this.field_d = -6 + var4.length;
          }
          if (this.field_d > this.field_h) {
            this.field_h = this.field_d;
          }
          if (6 + this.field_d <= this.field_h) {
            this.field_h = 5 + this.field_d;
          }
          var5 = uc.field_a + 102;
          var6 = 41 + bi.field_I;
          de.h(var6, var5 + 4, 558, 16777215, 128);
          de.e(var6, 5 + var5, 558, 55, 16777215, 64);
          de.h(var6, var5 + 65 - 5, 558, 16777215, 128);
          var7 = var6 - vi.field_I.field_n;
          if (this.field_d > 0) {
            if (var7 <= an.field_g &&
              var6 > an.field_g &&
              var5 <= me.field_I &&
              var5 + 65 > me.field_I) {
              vi.field_I.b(var7, var5, vi.field_I.field_n, 65, 16777215);
              vi.field_I.c(var7, var5, vi.field_I.field_n, 65, 128);
              this.field_m = 10;
              this.field_i = -1;
            } else {
              vi.field_I.c(var7, var5, vi.field_I.field_n, 65);
            }
          } else {
            vi.field_I.b(var7, var5, vi.field_I.field_n, 65, 0);
            vi.field_I.c(var7, var5, vi.field_I.field_n, 65, 128);
          }
          var7Lifetime1 = var6 + 558;
          var8 = vi.field_I.b();
          if (this.field_d < -6 + var4.length) {
            if (var7Lifetime1 <= an.field_g &&
              an.field_g < (var7Lifetime1 + vi.field_I.field_n) &&
              var5 <= me.field_I &&
              (65 + var5) > me.field_I) {
              var8.b(var7Lifetime1, var5, vi.field_I.field_n, 65, 16777215);
              var8.c(var7Lifetime1, var5, vi.field_I.field_n, 65, 128);
              this.field_m = 10;
              this.field_i = 1;
            } else {
              var8.c(var7Lifetime1, var5, vi.field_I.field_n, 65);
            }
          } else {
            var8.b(var7Lifetime1, var5, vi.field_I.field_n, 65, 0);
            var8.c(var7Lifetime1, var5, vi.field_I.field_n, 65, 128);
          }
          var9 = this.field_d;
          while (var9 < this.field_d + 6) {
            var10 = (var9 - this.field_d) * 89 + var6 + 24;
            var11 = var5;
            var12 = 0;
            stackIn_152_0 = var9;
            if (stackIn_152_0 == 0) {
              var12 = 16711935;
            }
            if (var9 == 1) {
              var12 = 16711680;
              var11 += 0;
            }
            if (var9 == 2) {
              var11 += 0;
              var12 = 16746632;
            }
            if (var9 == 3) {
              var11 += 0;
              var12 = 16776960;
            }
            if (4 == var9) {
              var11 += 0;
              var12 = 65535;
            }
            if (var9 == 5) {
              var11 += 0;
              var12 = 34816;
            }
            if (var9 == 6) {
              var11 += 0;
              var12 = 16777215;
            }
            if (var9 == 7) {
              var11 += 0;
              var12 = 4521762;
            }
            if (var9 == 8) {
              var11 += 0;
              var12 = 1364125;
            }
            if (var9 == 9) {
              var11 += 0;
              var12 = 8947848;
            }
            stackIn_87_0 = (~bc.field_b != ~var9) ? 0 : 1;
            var13_int = stackIn_87_0;
            de.d(var10, var11, 65, 65, var12);
            stackIn_91_1 = (var9 == this.field_h);
            discarded$3 = this.a(stackIn_91_1, 65, (byte) 74, true, var10, 65, var11);
            if (var13_int != 0) {
              if (var9 == 9 &&
                !ArcanistsMulti.i((byte) -77) &&
                0 < ad.field_d) {
                var13_int = 0;
              }
              if (0L != (1L << -14 + var9 * 8 & cb.field_e) &&
                var9 > 1 &&
                var9 < 9 &&
                (cb.field_e & 1L << -13 + 8 * var9 + mf.field_a / 2) != 0L) {
                var13_int = 0;
              }
              if (var13_int != 0) {
                var14_double = 0.5 * (3.14 * Math.sin((double)jb.field_v * 0.1)) + 3.14;
                tk.field_x[10].a(2048, (int)(16.0 * Math.cos(var14_double)) + var11 + 16, 125, var10 + ((int)(Math.sin(var14_double) * 32.0) + 32), 0);
              }
            }
            boolean decompiledFrameRemainder2 = true;
            if (this.field_h == var9) {
              if (this.field_h != 9) {
                if (0L == (1L << -14 + 8 * this.field_h & cb.field_e) &&
                  1 < this.field_h) {
                  rm.field_o[10].a(26 + (bi.field_I + (245 - rm.field_o[9].field_n) / 2), (-rm.field_o[9].field_w + 245) / 2 + 178 + uc.field_a, var12 >> 1 & 8355711 | 8421504);
                  rm.field_o[var9].a(bi.field_I + (32 - (6 - (-rm.field_o[var9].field_n + 245) / 2)), (-rm.field_o[9].field_w + 245) / 2 + 178 + uc.field_a, 8355711 & var12 >> 1 | 8421504);
                  de.d(6, 6, 8 + (32 + bi.field_I), 186 + uc.field_a, 229, 229);
                  rm.field_o[10].f((-rm.field_o[9].field_n + 245) / 2 + bi.field_I + 26, (245 - rm.field_o[9].field_w) / 2 + uc.field_a + 178, 64);
                  rm.field_o[var9].f((245 - rm.field_o[var9].field_n) / 2 + (-6 + bi.field_I + 32), (245 - rm.field_o[9].field_w) / 2 + uc.field_a + 178, 64);
                  ce.field_m.a(true);
                  var14 = 416 + (bi.field_I << 4) + 1960;
                  var15 = 2848 + ((uc.field_a << 4) + 1960);
                  if (!ArcanistsMulti.i((byte) -102)) {
                    var32.b(80, 1088, var14, var15, jb.field_v * 30 - 26214, 4096);
                    var32.b(80, 1088, var14, var15, -13107 + jb.field_v * 30, 4096);
                    var32.b(80, 1088, var14, var15, jb.field_v * 30 + 0, 4096);
                    var32.b(80, 1088, var14, var15, 13107 + jb.field_v * 30, 4096);
                    var32.b(80, 1088, var14, var15, 26214 + jb.field_v * 30, 4096);
                    if (5 <= var3) {
                      var16_double = (double)(jb.field_v & 255) * 3.141592653589793 / 128.0;
                      var18 = (int)(4096.0 + 256.0 * Math.cos(4.0 * var16_double) - 256.0);
                      var19 = (int)(0.0 + 5000.0 * Math.sin(2.0 * var16_double));
                      tk.field_x[4].a(var18, uc.field_a + 300, param0 ^ 0, 148 + bi.field_I, var19);
                      gn.a(16, (byte) 111, 128, -(8 * var18 / 4096) + (148 + bi.field_I), -(var18 * 8 / 4096) + 300 + uc.field_a);
                    }
                  }
                  if (!(!mi.a(256, 178 + uc.field_a, 256, -8, bi.field_I + 26))) {
                    this.field_i = var9;
                    this.field_m = 5;
                  }
                  decompiledFrameRemainder2 = false;
                }
                else {
                  rm.field_o[10].a(32 + (bi.field_I - 6) + (-rm.field_o[9].field_n + 245) / 2, 178 + uc.field_a + (245 - rm.field_o[9].field_w) / 2, (16711422 & var12) >> 1 | 8421504);
                  rm.field_o[var9].a(-6 + bi.field_I - (-32 - (-rm.field_o[var9].field_n + 245) / 2), (245 - rm.field_o[9].field_w) / 2 + uc.field_a + 178, 8421504 | (var12 & 16711422) >> 1);
                  de.d(6, 6, 8 + bi.field_I + 32, 8 + uc.field_a + 178, 229, 229);
                  rm.field_o[10].c((245 - rm.field_o[9].field_n) / 2 + bi.field_I + 26, uc.field_a + 178 + (245 - rm.field_o[9].field_w) / 2);
                  rm.field_o[var9].c(-6 + bi.field_I + (32 + (245 - rm.field_o[var9].field_n) / 2), (245 - rm.field_o[9].field_w) / 2 + (uc.field_a + 178));
                }
              } else {
                if (ArcanistsMulti.i((byte) -72) &&
                  0 >= ad.field_d) {
                  rm.field_o[10].a(32 + (bi.field_I - 6 + (245 - rm.field_o[9].field_n) / 2), 178 + uc.field_a + (245 - rm.field_o[9].field_w) / 2, (16711422 & var12 | 16843009) >> 1);
                  rm.field_o[var9].a((245 - rm.field_o[var9].field_n) / 2 + (bi.field_I + 32 - 6), 178 + (uc.field_a + (245 - rm.field_o[9].field_w) / 2), (var12 & 16711422 | 16843009) >> 1);
                  de.d(6, 6, bi.field_I + 32 + 8, 8 + (uc.field_a + 178), 229, 229);
                  rm.field_o[10].f(-6 + (bi.field_I + 32 + (-rm.field_o[9].field_n + 245) / 2), (-rm.field_o[9].field_w + 245) / 2 + 178 + uc.field_a, 64);
                  rm.field_o[var9].f((245 - rm.field_o[var9].field_n) / 2 + (bi.field_I + 26), uc.field_a - (-178 - (-rm.field_o[9].field_w + 245) / 2), 64);
                  ce.field_m.a(true);
                } else {
                  rm.field_o[10].a((-rm.field_o[9].field_n + 245) / 2 - 6 + (bi.field_I + 32), 178 + (uc.field_a + (-rm.field_o[9].field_w + 245) / 2), (16843008 | var12 & 16711422) >> 1);
                  rm.field_o[var9].a(32 + (bi.field_I + (-6 + (245 - rm.field_o[var9].field_n) / 2)), (245 - rm.field_o[9].field_w) / 2 + uc.field_a + 178, var12 >> 1 & 8355711 | 8421504);
                  de.d(6, 6, 32 + bi.field_I + 8, 8 + (uc.field_a + 178), 229, 229);
                  rm.field_o[10].c((245 - rm.field_o[9].field_n) / 2 + 32 + (bi.field_I - 6), (245 - rm.field_o[9].field_w) / 2 + uc.field_a + 178);
                  rm.field_o[var9].c(-6 + bi.field_I + (32 + (245 - rm.field_o[var9].field_n) / 2), 178 + (uc.field_a + (-rm.field_o[9].field_w + 245) / 2));
                  ce.field_m.a(true);
                }
              }
            }
            rm.field_o[10].b(2 + var10, var11);
            rm.field_o[var9].b(var10 + 2, var11);
            if (mi.a(65, var11, 65, -8, var10)) {
              this.field_m = 0;
              this.field_i = var9;
            }
            var9++;
          }
          discarded$1 = this.a(false, 332, (byte) -71, false, 287 + bi.field_I, 245, 178 + uc.field_a);
          discarded$2 = this.a(true, 284, (byte) 108, false, 21 + bi.field_I + 287, 29, -4 + (178 + uc.field_a));
          tj.field_t.a(tc.field_F, 21 + (290 + bi.field_I) - 1, -4 + (uc.field_a + 178 - 1), 281, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
          tj.field_t.a(tc.field_F, 311 + bi.field_I, -2 + (178 + uc.field_a) - 4, 281, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
          tj.field_t.a(tc.field_F, 290 + (bi.field_I + 21), -5 + uc.field_a + 178, 281, 29, 12569299, -1, param0, 1, tj.field_t.field_C);
          var9Lifetime1 = -1;
          var10Lifetime1 = -1;
          var11Lifetime1 = 0;
          stackIn_152_0Lifetime1 = 0;
          var12Lifetime1 = stackIn_152_0Lifetime1;
          L30: while (true) {
            stackIn_154_0 = ~var12Lifetime1;
            if (stackIn_154_0 > -9) {
              for (var13_intLifetime1 = 0; var13_intLifetime1 < 2; var13_intLifetime1++) {
                var14 = 290 + bi.field_I + 41 * var12Lifetime1;
                var15Lifetime1 = 209 + (uc.field_a + var13_intLifetime1 * 41);
                discarded$5 = this.a(true, 39, (byte) -104, true, var14, 39, var15Lifetime1);
                var16 = b.field_f[var13_intLifetime1 + 2 * var12Lifetime1];
                stackIn_154_0 = ~var16;
                if (stackIn_154_0 != 0) {
                  var17_int = 1;
                  var18Lifetime1 = var16;
                  var19Lifetime1 = var18Lifetime1 / 12;
                  de.h(1 + var14, var15Lifetime1 + 1, 37 + var14, 37 + var15Lifetime1);
                  if (var18Lifetime1 >= 0) {
                    if (var19Lifetime1 != var9Lifetime1 ||
                      var9Lifetime1 == -1) {
                      var9Lifetime1 = var19Lifetime1;
                      var11Lifetime1 = 0;
                    }
                    if (var18Lifetime1 % 12 >= 10) {
                      if (var19Lifetime1 > 0 &&
                        5 > var11Lifetime1) {
                        var17_int = 0;
                      }
                    } else {
                      if ((1 & var18Lifetime1) == 1 &&
                        var10Lifetime1 != -1 + var18Lifetime1) {
                        var17_int = 0;
                      }
                    }
                    if (var17_int != 0) {
                      var11Lifetime1++;
                      var10Lifetime1 = var18Lifetime1;
                    }
                  }
                  if (var17_int != 0) {
                    bb.field_g[dd.field_f[var16]].c(var14 - 1, var15Lifetime1 - 1);
                  } else {
                    bb.field_g[dd.field_f[var16]].f(var14 - 1, -1 + var15Lifetime1, 64);
                    de.b(var14, var15Lifetime1, var14 + 32, 32 + var15Lifetime1, 16711680);
                    de.b(32 + var14, var15Lifetime1, var14, 32 + var15Lifetime1, 16711680);
                    b.field_f[var13_intLifetime1 + 2 * var12Lifetime1] = -1;
                  }
                  boolean decompiledFrameRemainder5 = true;
                  if (!ArcanistsMulti.i((byte) -62)) {
                    if (var16 < 108) {
                      if (var16 >= 22) {
                        if (var19Lifetime1 > 1 &&
                          0L == (cb.field_e & 1L << var19Lifetime1 * 8 - 14) && (bc.field_b != var19Lifetime1 ||
                          ~mf.field_a != ~(-(var19Lifetime1 * 12) + var16) &&
                          ~(mf.field_a + 1) != ~(var16 - var19Lifetime1 * 12))) {
                          ii.field_d.c(var14 - 1, -1 + var15Lifetime1, 40, 40, 128);
                          decompiledFrameRemainder5 = false;
                        }
                        else {
                          if (var18Lifetime1 % 12 >= 10) {
                            if ((1L << -18 + (var18Lifetime1 % 12 + 8 * var19Lifetime1) & cb.field_e) == 0L) {
                              ii.field_d.c(-1 + var14, -1 + var15Lifetime1, 40, 40, 128);
                            }
                          } else {
                            if ((1 & var18Lifetime1) == 1 &&
                              (1L << -13 + 8 * var19Lifetime1 + (var18Lifetime1 % 12 - 1) / 2 & cb.field_e) == 0L && (~bc.field_b != ~var19Lifetime1 ||
                              -(var19Lifetime1 * 12) + var16 != 1 + mf.field_a)) {
                              ii.field_d.c(var14 - 1, -1 + var15Lifetime1, 40, 40, 128);
                            }
                          }
                        }
                      }
                    } else {
                      if (ArcanistsMulti.i((byte) -119) ||
                        ad.field_d == 0) {
                        ii.field_d.c(-1 + var14, var15Lifetime1 - 1, 40, 40, 128);
                      }
                    }
                  } else {
                    if (var16 >= 22) {
                      if (~bc.field_b == ~var19Lifetime1) {
                        if ((~mf.field_a != ~(-(var19Lifetime1 * 12) + var16)) &&
                          (-(var19Lifetime1 * 12) + var16 != 1 + mf.field_a)) {
                          ii.field_d.c(var14 - 1, -1 + var15Lifetime1, 40, 40, 128);
                        }
                      } else {
                        ii.field_d.c(var14 - 1, -1 + var15Lifetime1, 40, 40, 128);
                      }
                    }
                  }
                  de.a();
                  if (an.field_g >= var14 &&
                    var15Lifetime1 <= me.field_I &&
                    an.field_g < (var14 + 39) &&
                    var15Lifetime1 + 39 > me.field_I) {
                    this.field_m = 2;
                    this.field_i = var13_intLifetime1 + 2 * var12Lifetime1;
                  }
                }
              }
              var12Lifetime1++;
              continue L30;
            }
            break;
          }
          for (var12Lifetime2 = 0; var12Lifetime2 < 128; var12Lifetime2++) {
            var13_intLifetime2 = 96;
            var14_doubleLifetime1 = (double)var12Lifetime2 * 3.141592653589793 * 2.0 / 128.0;
            var16Lifetime1 = 132 + (bi.field_I - (int)(Math.cos(var14_doubleLifetime1) * (double)var13_intLifetime2));
            var17_intLifetime1 = -16 + (122 + (uc.field_a + 178 - (int)((double)var13_intLifetime2 * Math.sin(var14_doubleLifetime1))));
            de.i(var16Lifetime1 + 16, 16 + var17_intLifetime1, 5, 0);
          }
          for (var12Lifetime3 = 0; var12Lifetime3 < 128; var12Lifetime3++) {
            var13_intLifetime3 = 96;
            var14_doubleLifetime2 = 3.141592653589793 * (double)var12Lifetime3 * 2.0 / 128.0;
            var16Lifetime2 = 122 + (bi.field_I + 32) + (-6 - (int)(Math.cos(var14_doubleLifetime2) * (double)var13_intLifetime3) - 16);
            var17_intLifetime2 = 178 + (uc.field_a + 122) - ((int)(Math.sin(var14_doubleLifetime2) * (double)var13_intLifetime3) + 16);
            de.i(var16Lifetime2 + 16, 16 + var17_intLifetime2, 4, 10326659);
          }
          var12Lifetime4 = this.field_h * 12;
          var11Lifetime2 = 12;
          if (var12Lifetime4 < 0) {
            var11Lifetime2 = var11Lifetime2 + var12Lifetime4;
            var12Lifetime4 = 0;
          }
          var13_intLifetime4 = 0;
          while (var13_intLifetime4 < var11Lifetime2) {
            var14 = 96;
            var15Lifetime2 = var13_intLifetime4;
            var16Lifetime3 = 1;
            var17_intLifetime3 = 0;
            var18Lifetime2 = 16;
            var18Lifetime2--;
            var19Lifetime2 = 10326659;
            var15Lifetime2Lifetime1 = var13_intLifetime4;
            stackIn_636_0 = -1;
            stackIn_636_1 = ~var13_intLifetime4;
            if (stackIn_636_0 == stackIn_636_1) {
              var15Lifetime2Lifetime1 = 2;
            }
            if (var13_intLifetime4 == 1) {
              var15Lifetime2Lifetime1 = 4;
            }
            if (2 == var13_intLifetime4) {
              var15Lifetime2Lifetime1 = 1;
            }
            if (var13_intLifetime4 == 3) {
              var15Lifetime2Lifetime1 = 5;
            }
            if (4 == var13_intLifetime4) {
              var15Lifetime2Lifetime1 = 0;
            }
            if (5 == var13_intLifetime4) {
              var15Lifetime2Lifetime1 = 6;
            }
            if (var13_intLifetime4 == 6) {
              var15Lifetime2Lifetime1 = 11;
            }
            if (var13_intLifetime4 == 7) {
              var15Lifetime2Lifetime1 = 7;
            }
            if (var13_intLifetime4 == 8) {
              var15Lifetime2Lifetime1 = 10;
            }
            if (var13_intLifetime4 == 9) {
              var15Lifetime2Lifetime1 = 8;
            }
            if (var13_intLifetime4 == 10) {
              var15Lifetime2Lifetime1 = 3;
            }
            if (11 == var13_intLifetime4) {
              var15Lifetime2Lifetime1 = 9;
            }
            if (var13_intLifetime4 < 10) {
              if ((var13_intLifetime4 & 1) == 1) {
                var20 = 0;
                var30 = 0;
                var21 = var30;
                while (true) {
                  if (var30 < 16) {
                    stackIn_376_0 = b.field_f[var30];
                    stackIn_376_1 = -1 + (var12Lifetime4 + var13_intLifetime4);
                    if (stackIn_376_0 == stackIn_376_1) {
                      var20++;
                    }
                    var30++;
                    continue;
                  }
                  break;
                }
                var18Lifetime2++;
                stackIn_376_0Lifetime1 = -1;
                stackIn_376_1Lifetime1 = ~var20;
                if (stackIn_376_0Lifetime1 == stackIn_376_1Lifetime1) {
                  var16Lifetime3 = 0;
                }
                var19Lifetime2 = 16711935;
              }
              if (0 < this.field_h &&
                this.field_h != 9) {
                if ((1 & var13_intLifetime4) != 0) {
                  if ((cb.field_e & 1L << -13 + 8 * this.field_h + (-1 + var13_intLifetime4) / 2) == 0L && (this.field_h != bc.field_b ||
                    mf.field_a != -1 + var13_intLifetime4) && this.field_h > 1) {
                    var16Lifetime3 = 0;
                    var17_intLifetime3 = 2;
                  }
                } else {
                  if (0L == (1L << -14 + 8 * this.field_h & cb.field_e) && (~this.field_h != ~bc.field_b ||
                    mf.field_a != var13_intLifetime4) && 1 < this.field_h) {
                    var16Lifetime3 = 0;
                    var17_intLifetime3 = 0;
                  }
                }
              }
            } else {
              if (0 < this.field_h) {
                var20 = 0;
                var21 = 0;
                while (true) {
                  if (var21 < 16) {
                    stackIn_353_0 = var12Lifetime4;
                    stackIn_353_1 = b.field_f[var21];
                    if (stackIn_353_0 <= stackIn_353_1 &&
                      b.field_f[var21] < (10 + var12Lifetime4) && (0 == (1 & b.field_f[var21]) ||
                      var21 > 0 &&
                      ~(-1 + b.field_f[var21]) == ~b.field_f[-1 + var21])) {
                      var20++;
                    }
                    var21++;
                    continue;
                  }
                  var19Lifetime2 = 16744703;
                  stackIn_353_0Lifetime1 = ~var20;
                  stackIn_353_1Lifetime1 = -6;
                  if (stackIn_353_0Lifetime1 > stackIn_353_1Lifetime1) {
                    var16Lifetime3 = 0;
                  }
                  var18Lifetime2 += 2;
                  if (0L == (1L << 8 * this.field_h - (-(var13_intLifetime4 % 12) + 18) & cb.field_e)) {
                    if (this.field_h >= 9) {
                      break;
                    }
                    var17_intLifetime3 = 3;
                    var16Lifetime3 = 0;
                  }
                  break;
                }
              }
            }
            {
              var20_double = 2.0 * ((double)var15Lifetime2Lifetime1 * 3.141592653589793) / (double)var11Lifetime2;
              var22 = 122 + (-6 + bi.field_I) + 32 - (int)((double)var14 * Math.cos(var20_double)) - 16;
              var23 = 178 + uc.field_a - (-122 + (int)((double)var14 * Math.sin(var20_double)) + 16);
              if (this.field_h == 9 && (ArcanistsMulti.i((byte) -87) ||
                !(ad.field_d > 0))) {
                if (an.field_g < var22) {
                } else if (var23 > me.field_I) {
                } else if ((var22 + 32) <= an.field_g) {
                } else if (me.field_I >= (var23 + 32)) {
                } else {
                  this.field_i = var13_intLifetime4 + var12Lifetime4;
                  this.field_m = 6;
                }
              } else {
                if (var16Lifetime3 != 0) {
                  if (an.field_g >= var22 &&
                    me.field_I >= var23 &&
                    var22 + 32 > an.field_g &&
                    (var23 + 32) > me.field_I) {
                    this.field_m = 1;
                    this.field_i = var12Lifetime4 + var13_intLifetime4;
                    var18Lifetime2 += 4;
                  }
                } else {
                  if (an.field_g >= var22 &&
                    me.field_I >= var23 &&
                    an.field_g < (var22 + 32) &&
                    me.field_I < (var23 + 32)) {
                    boolean decompiledFrameRemainder4 = true;
                    this.field_i = var13_intLifetime4 + var12Lifetime4;
                    this.field_m = 3;
                    if (10 <= var13_intLifetime4) {
                      this.field_m = 4;
                      for (var24 = 0; var24 < 16; var24++) {
                        stackIn_493_0 = var12Lifetime4;
                        stackIn_493_1 = b.field_f[var24];
                        if (stackIn_493_0 <= stackIn_493_1 &&
                          10 + var12Lifetime4 > b.field_f[var24] &&
                          (1 & b.field_f[var24]) != 0 &&
                          var24 > 0 &&
                          ~b.field_f[var24 - 1] == ~(b.field_f[var24] - 1)) {
                        }
                      }
                      this.field_i = var12Lifetime4 + var13_intLifetime4;
                    }
                    var18Lifetime2 += 2;
                    if ((cb.field_e & 1L << -14 + this.field_h * 8) == 0L && (this.field_h != bc.field_b ||
                      var13_intLifetime4 != mf.field_a &&
                      ~var13_intLifetime4 != ~(mf.field_a + 1)) && (this.field_h > 1 &&
                      this.field_h < 9)) {
                      this.field_i = var13_intLifetime4 + var12Lifetime4;
                      this.field_m = 6;
                      decompiledFrameRemainder4 = false;
                    }
                    else {
                      stackIn_493_0Lifetime1 = ~var17_intLifetime3;
                      stackIn_493_1Lifetime1 = -1;
                      if (stackIn_493_0Lifetime1 < stackIn_493_1Lifetime1 &&
                        9 > this.field_h) {
                        this.field_m = 7;
                        this.field_i = var12Lifetime4 + var13_intLifetime4;
                        if (2 < var17_intLifetime3) {
                          this.field_m = 8;
                        }
                      }
                    }
                    if (this.field_m == 3) {
                      var24Lifetime3 = -16 + (32 + (bi.field_I - 6) + 122 + (int)(Math.cos(var20_double) * (double)var14));
                      gn.a((int)(Math.cos((double)jb.field_v * 0.1) * 4.0) + 20, (byte) 105, 128 + (int)(Math.sin((double)jb.field_v * 0.1) * 64.0), var24Lifetime3 + 16, 16 + var23);
                    }
                  }
                }
              }
            }
            boolean decompiledFrameRemainder3 = true;
            de.c(16 + var22, var23 + 16, 8 + var18Lifetime2, 0, 64);
            de.i(16 + var22, var23 + 16, 4 + var18Lifetime2, var19Lifetime2);
            de.c(16 + var22, 16 + var23, var18Lifetime2 + 4, 0);
            de.i(16 + var22, 16 + var23, var18Lifetime2, 13947080);
            de.c(var22 + 16, 16 + var23, var18Lifetime2, 0);
            if (9 == this.field_h && (ad.field_d == 0 ||
              ArcanistsMulti.i((byte) -74))) {
              bb.field_g[dd.field_f[var13_intLifetime4 + var12Lifetime4]].f(-4 + var22, -4 + var23, 32);
              decompiledFrameRemainder3 = false;
            }
            else {
              if ((cb.field_e & 1L << this.field_h * 8 - 14) == 0L &&
                this.field_h > 1 &&
                this.field_h < 9 &&
                var16Lifetime3 == 0) {
                bb.field_g[dd.field_f[var13_intLifetime4 + var12Lifetime4]].f(-4 + var22, var23 - 4, 32);
              } else {
                if (var16Lifetime3 != 0) {
                  bb.field_g[dd.field_f[var13_intLifetime4 + var12Lifetime4]].c(-4 + var22, var23 - 4);
                  var24Lifetime1 = 0;
                  var31 = 0;
                  var25_int = var31;
                  while (var31 < 16) {
                    stackIn_573_0 = b.field_f[var31];
                    stackIn_573_1 = var13_intLifetime4 + var12Lifetime4;
                    if (stackIn_573_0 == stackIn_573_1) {
                      var24Lifetime1 = 1;
                    }
                    var31++;
                  }
                  if ((var24Lifetime1 != 0)) {
                    gn.a(24, (byte) 63, -128, var22 + 16, var23 + 16);
                    de.c(var22 + 16, var23 + 16, 24, 0);
                  }
                  decompiledFrameRemainder3 = false;
                }
                else {
                  if (var17_intLifetime3 == 0) {
                    bb.field_g[dd.field_f[var13_intLifetime4 + var12Lifetime4]].f(-4 + var22, -4 + var23, 32);
                  } else {
                    bb.field_g[dd.field_f[var12Lifetime4 + var13_intLifetime4]].f(-4 + var22, -4 + var23, 32);
                    var24Lifetime1Lifetime1 = var22 + 16 << 4;
                    var25_intLifetime1 = 16 + var23 << 4;
                    if (!ArcanistsMulti.i((byte) -102)) {
                      if (var17_intLifetime3 == 3) {
                        var32.b(80, 320, var24Lifetime1Lifetime1, var25_intLifetime1, jb.field_v * 30 - 21845, 4096);
                        var32.b(80, 320, var24Lifetime1Lifetime1, var25_intLifetime1, jb.field_v * 30 + 0, 4096);
                        var32.b(80, 320, var24Lifetime1Lifetime1, var25_intLifetime1, 30 * jb.field_v + 21845, 4096);
                      }
                      if (var17_intLifetime3 == 2) {
                        var32.b(160, 320, var24Lifetime1Lifetime1, var25_intLifetime1, -16384 + jb.field_v * 30, 4096);
                        var32.b(160, 320, var24Lifetime1Lifetime1, var25_intLifetime1, 16384 + 30 * jb.field_v, 4096);
                      }
                    }
                  }
                }
              }
            }
            stackIn_573_0Lifetime1 = 1;
            stackIn_573_1Lifetime1 = this.field_h;
            if (stackIn_573_0Lifetime1 == stackIn_573_1Lifetime1 &&
              10 <= var13_intLifetime4 &&
              ArcanistsMulti.i((byte) -84)) {
              ii.field_d.c(-4 + var22, var23 - 4, 40, 40, 128);
            }
            stackIn_586_0 = ((cb.field_e & 1L << this.field_h * 8 - 14) == 0L) ? 0 : 1;
            var24Lifetime2 = stackIn_586_0;
            if (var16Lifetime3 == 0 &&
              0 < var17_intLifetime3 &&
              var3 >= var17_intLifetime3 && (var24Lifetime2 != 0 ||
              this.field_h == 1) && (var22 <= an.field_g &&
              var23 <= me.field_I &&
              32 + var22 > an.field_g &&
              me.field_I < 32 + var23 &&
              !ArcanistsMulti.i((byte) -125))) {
              var25 = 3.141592653589793 * (double)(255 & jb.field_v) / 128.0;
              var27 = (int)(2048.0 + Math.cos(var25 * 4.0) * 256.0 - 256.0);
              var28 = (int)(5000.0 * Math.sin(var25 * 2.0) + 0.0);
              if (16 + var22 < 148) {
                tk.field_x[4].a(var27, var23, -4, var22, var28);
                gn.a(8, (byte) 118, 128, var22 - var27 * 8 / 4096, var23 - 8 * var27 / 4096);
              } else {
                tk.field_x[4].a(var27, var23, -41, 32 + var22, var28);
                gn.a(8, (byte) 126, 128, -(var27 * 8 / 4096) + var22 + 32, var23 - 8 * var27 / 4096);
              }
            }
            if (~bc.field_b == ~this.field_h && (~var13_intLifetime4 == ~mf.field_a &&
              var24Lifetime2 == 0 ||
              mf.field_a + 1 == var13_intLifetime4 &&
              (1L << (-1 + var13_intLifetime4) / 2 - 13 + 8 * this.field_h & cb.field_e) == 0L)) {
              var25Lifetime1 = Math.cos(3.141592653589793 * (double)(jb.field_v & 255) / 64.0) * 5.0 + 32.0;
              var27Lifetime1 = (int)(Math.cos(var20_double) * var25Lifetime1) + (16 + var22);
              var28Lifetime1 = (int)(var25Lifetime1 * Math.sin(var20_double)) + 16 + var23;
              tk.field_x[10].a(2048, var28Lifetime1, 120, var27Lifetime1, 0);
            }
            var13_intLifetime4++;
          }
          stackIn_636_0Lifetime1 = -2;
          stackIn_636_1Lifetime1 = ~this.field_h;
          if (stackIn_636_0Lifetime1 > stackIn_636_1Lifetime1 &&
            ArcanistsMulti.i((byte) -127) &&
            this.field_h < 9) {
            var13_intLifetime5 = 122 + (bi.field_I + 26);
            var14 = 178 + (uc.field_a + 122);
            ii.field_d.c(-64 + var13_intLifetime5, -64 + var14, 128);
          }
          if (9 == this.field_h && (!(ad.field_d > 0) ||
            ArcanistsMulti.i((byte) -60))) {
            var13_intLifetime6 = 148 + bi.field_I;
            var14 = uc.field_a + 178 + 122;
            ii.field_d.c(var13_intLifetime6 - 64, -64 + var14, 128);
          }
          if (this.field_m != 1 &&
            6 != this.field_m &&
            7 != this.field_m &&
            this.field_m != 8) {
            if (this.field_m == 2) {
              if (this.field_i < 0) {
                return;
              }
              if (this.field_i >= 16) {
                return;
              }
              if (b.field_f[this.field_i] == -1) {
                return;
              }
              boolean decompiledFrameRemainder1 = true;
              var13_intLifetime7 = b.field_f[this.field_i];
              var36 = tc.field_w[var13_intLifetime7];
              var37 = vm.field_d[var13_intLifetime7];
              var16Lifetime4 = bi.field_I + 301;
              var17_intLifetime4 = -1 + (uc.field_a + 303);
              if (ArcanistsMulti.i((byte) -91) &&
                var13_intLifetime7 >= 22 && (~(var13_intLifetime7 / 12) != ~bc.field_b ||
                ~(-(var13_intLifetime7 / 12 * 12) + var13_intLifetime7) != ~mf.field_a &&
                var13_intLifetime7 - 12 * (var13_intLifetime7 / 12) != 1 + mf.field_a)) {
                mi.field_B.a(var36, var16Lifetime4 - 1, var17_intLifetime4, 141, 29, 13158, 13158, 1, 1, mi.field_B.field_C);
                mi.field_B.a(var36, var16Lifetime4, -1 + var17_intLifetime4, 141, 29, 13158, 13158, 1, 1, mi.field_B.field_C);
                mi.field_B.a(var36, var16Lifetime4, var17_intLifetime4, 141, 29, 12569299, -1, 1, 1, mi.field_B.field_C);
                mi.field_B.a(qe.field_r, 447, 294, 171, 29, 16711680, 0, 1, 1, mi.field_B.field_C);
                decompiledFrameRemainder1 = false;
              }
              else {
                tj.field_t.a(var36, 10 + (var16Lifetime4 - 1), var17_intLifetime4, 281, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                tj.field_t.a(var36, 10 + var16Lifetime4, var17_intLifetime4 - 1, 281, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                tj.field_t.a(var36, var16Lifetime4 + 10, var17_intLifetime4, 281, 29, 12569299, -1, 1, 1, tj.field_t.field_C);
              }
              mi.field_B.a(var37, 8 + (290 + bi.field_I), uc.field_a + 340 - 8, 307, 128, 0, -1, 1, 0, mi.field_B.field_C);
              return;
            }
            var13 = vl.field_l;
            if (0 < this.field_h) {
              var13 = tn.field_Ib;
              if (this.field_h == 9 && (ad.field_d == 0 ||
                ArcanistsMulti.i((byte) -77))) {
                var13 = vn.field_j;
              }
            }
            boolean decompiledFrameRemainder0 = true;
            if (an.field_g >= (bi.field_I + 557) &&
              (uc.field_a + 51) >= me.field_I &&
              !ArcanistsMulti.i((byte) -50)) {
              var13 = "";
              var14 = bi.field_I + 300;
              var15Lifetime3 = 340 + uc.field_a;
              this.a(var15Lifetime3, var3, var14, 113);
            } else {
              if (this.field_m == 0) {
                var14_ref_String = ee.field_c;
                var13 = ld.field_k;
                if (Math.abs(this.field_i) == 1) {
                  var13 = j.field_b;
                  var14_ref_String = gd.field_qb;
                }
                if (2 == Math.abs(this.field_i)) {
                  var14_ref_String = io.field_z;
                  var13 = ri.field_d;
                }
                if (Math.abs(this.field_i) == 3) {
                  var13 = hm.field_d;
                  var14_ref_String = df.field_x;
                }
                if (Math.abs(this.field_i) == 4) {
                  var13 = tk.field_r;
                  var14_ref_String = fh.field_d;
                }
                if (Math.abs(this.field_i) == 5) {
                  var13 = pk.field_g;
                  var14_ref_String = ad.field_g;
                }
                if (6 == Math.abs(this.field_i)) {
                  var13 = gi.field_f;
                  var14_ref_String = ej.field_M;
                }
                if (Math.abs(this.field_i) == 7) {
                  var14_ref_String = nf.field_e;
                  var13 = tk.field_w;
                }
                if (Math.abs(this.field_i) == 8) {
                  var13 = mi.field_s;
                  var14_ref_String = oo.field_r;
                }
                if (Math.abs(this.field_i) == 9) {
                  var13 = uk.field_f;
                  var14_ref_String = j.field_c;
                }
                tj.field_t.a(var14_ref_String, -1 + (311 + bi.field_I), -1 + (303 + uc.field_a), 281, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                tj.field_t.a(var14_ref_String, 290 + (bi.field_I + 21), 303 + uc.field_a - 2, 281, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                tj.field_t.a(var14_ref_String, 21 + (bi.field_I + 290), 303 + (uc.field_a - 1), 281, 29, 12569299, -1, 1, 1, tj.field_t.field_C);
              } else {
                if (3 == this.field_m) {
                  var34 = tc.field_w[this.field_i];
                  var14_ref_String = var34;
                  tj.field_t.a(var34, bi.field_I + 310, -1 + (uc.field_a + 303), 281, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                  tj.field_t.a(var34, 21 + bi.field_I + 290, 303 + (uc.field_a - 2), 281, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                  tj.field_t.a(var14_ref_String, 21 + bi.field_I + 290, -1 + (303 + uc.field_a), 281, 29, 12569299, -1, 1, 1, tj.field_t.field_C);
                  var13 = tj.a(param0 + 126, new String[]{tc.field_w[-1 + this.field_i]}, jf.field_f);
                } else {
                  if (this.field_m == 4) {
                    var33 = tc.field_w[this.field_i];
                    var14_ref_String = var33;
                    tj.field_t.a(var33, 290 + bi.field_I + 21 - 1, -1 + uc.field_a + 303, 281, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                    tj.field_t.a(var33, 21 + (bi.field_I + 290), 303 + (uc.field_a - 2), 281, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                    tj.field_t.a(var14_ref_String, 290 + (bi.field_I + 21), 303 + uc.field_a - 1, 281, 29, 12569299, -1, 1, 1, tj.field_t.field_C);
                    var15_ref_String = gd.field_qb;
                    if (this.field_h == 2) {
                      var15_ref_String = io.field_z;
                    }
                    if (3 == this.field_h) {
                      var15_ref_String = df.field_x;
                    }
                    if (this.field_h == 4) {
                      var15_ref_String = fh.field_d;
                    }
                    if (5 == this.field_h) {
                      var15_ref_String = ad.field_g;
                    }
                    if (this.field_h == 6) {
                      var15_ref_String = ej.field_M;
                    }
                    if (this.field_h == 7) {
                      var15_ref_String = nf.field_e;
                    }
                    if (this.field_h == 8) {
                      var15_ref_String = oo.field_r;
                    }
                    if (this.field_h == 9) {
                      var15_ref_String = j.field_c;
                    }
                    var16Lifetime4Lifetime1 = 0;
                    var17_intLifetime4Lifetime1 = 0;
                    while (16 > var17_intLifetime4Lifetime1) {
                      stackIn_770_0 = b.field_f[var17_intLifetime4Lifetime1];
                      stackIn_770_1 = this.field_h * 12;
                      if (stackIn_770_0 >= stackIn_770_1 &&
                        10 + 12 * this.field_h >= b.field_f[var17_intLifetime4Lifetime1]) {
                        var16Lifetime4Lifetime1++;
                      }
                      var17_intLifetime4Lifetime1++;
                    }
                    stackIn_770_0Lifetime1 = 116;
                    stackIn_770_1Lifetime1 = 2;
                    array$4 = new String[stackIn_770_1Lifetime1];
                    array$4[0] = var15_ref_String;
                    array$4[1] = Integer.toString(var16Lifetime4Lifetime1);
                    var13 = tj.a(stackIn_770_0Lifetime1, array$4, vl.field_k);
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    if (this.field_m == 5) {
                      var13 = "You Should NEVER EVER EVER SEE THIS!!!";
                      var14_ref_String = gd.field_qb;
                      if (Math.abs(this.field_h) == 2) {
                        var13 = sb.field_d + var3;
                        var14_ref_String = io.field_z;
                      }
                      if (3 == Math.abs(this.field_h)) {
                        var13 = ec.field_h + var3;
                        var14_ref_String = df.field_x;
                      }
                      if (Math.abs(this.field_h) == 4) {
                        var14_ref_String = fh.field_d;
                        var13 = ie.field_Jb + var3;
                      }
                      if (Math.abs(this.field_h) == 5) {
                        var14_ref_String = ad.field_g;
                        var13 = jk.field_v + var3;
                      }
                      if (6 == Math.abs(this.field_h)) {
                        var14_ref_String = ej.field_M;
                        var13 = wd.field_k + var3;
                      }
                      if (7 == Math.abs(this.field_h)) {
                        var13 = dg.field_q + var3;
                        var14_ref_String = nf.field_e;
                      }
                      if (Math.abs(this.field_h) == 8) {
                        var14_ref_String = oo.field_r;
                        var13 = q.field_H + var3;
                      }
                      tj.field_t.a(var14_ref_String, 290 + (bi.field_I + 21 - 1), 302 + uc.field_a, 281, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                      tj.field_t.a(var14_ref_String, 290 + bi.field_I + 21, -2 + (303 + uc.field_a), 281, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                      tj.field_t.a(var14_ref_String, bi.field_I + 311, uc.field_a + 302, 281, 29, 12569299, -1, 1, 1, tj.field_t.field_C);
                      var13 = "";
                      var15Lifetime3 = 300 + bi.field_I;
                      var16Lifetime4Lifetime1 = uc.field_a + 336;
                      mi.field_B.a(aj.field_b, var15Lifetime3, var16Lifetime4Lifetime1, 70, 32, 0, -1, 1, 1, mi.field_B.field_C);
                      var15Lifetime3 += 74;
                      var17_intLifetime4Lifetime1 = 0;
                      while (true) {
                        if (5 > var17_intLifetime4Lifetime1) {
                          stackIn_731_0 = ~var17_intLifetime4Lifetime1;
                          stackIn_731_1 = ~var3;
                          if (stackIn_731_0 > stackIn_731_1) {
                            tg.field_b[7].a(var15Lifetime3, var16Lifetime4Lifetime1);
                          } else {
                            tg.field_b[7].a(var15Lifetime3, var16Lifetime4Lifetime1, 64, 0);
                          }
                          var15Lifetime3 += 9;
                          var17_intLifetime4Lifetime1++;
                          continue;
                        }
                        break;
                      }
                      if (ArcanistsMulti.i((byte) -90)) {
                        var13 = nf.field_yb;
                      } else {
                        stackIn_731_0Lifetime1 = var3;
                        stackIn_731_1Lifetime1 = 5;
                        if (stackIn_731_0Lifetime1 < stackIn_731_1Lifetime1) {
                          var13 = mb.field_R;
                        } else {
                          var13 = ij.field_Ob;
                        }
                      }
                      mi.field_B.a(var13, 440 + bi.field_I, var16Lifetime4Lifetime1, 170, 32, 0, -1, 1, 1, mi.field_B.field_C);
                      var13 = "";
                    }
                  }
                }
              }
            }
            if (153 <= jf.field_j &&
              ad.field_d < 10) {
              var14 = 308 + (bi.field_I + ad.field_d * 32);
              var15Lifetime3Lifetime1 = 400 + uc.field_a;
              if (an.field_g >= (-16 + var14) &&
                an.field_g <= (16 + var14) &&
                me.field_I >= -16 + var15Lifetime3Lifetime1 &&
                me.field_I <= var15Lifetime3Lifetime1 + 16) {
                this.field_m = 9;
              }
            }
            if ((tn.field_Ib == var13 ||
              var13 == vl.field_l) &&
              (153 <= jf.field_j &&
              10 > ad.field_d)) {
              var13 = ti.field_F;
              if (this.field_m == 9) {
                var35 = vh.field_h;
                var14 = 250 + ad.field_d * 250;
                var13 = var35 + tj.a(param0 ^ -50, new String[]{Integer.toString(var14)}, ck.field_e);
              }
              mi.field_B.a(var13, bi.field_I + 302, 116 + (178 + uc.field_a), 299, 129, 0, -1, 1, 0, mi.field_B.field_C);
              for (var14 = 0; var14 < 10; var14++) {
                var15Lifetime3Lifetime2 = 308 + bi.field_I + var14 * 32;
                var16Lifetime4Lifetime2 = uc.field_a + 400;
                if (ad.field_d >= var14) {
                  de.c(var15Lifetime3Lifetime2, -1 + var16Lifetime4Lifetime2, 14, 16711680);
                  de.c(var15Lifetime3Lifetime2 - 1, var16Lifetime4Lifetime2, 14, 16711680);
                  de.c(var15Lifetime3Lifetime2, var16Lifetime4Lifetime2 + 1, 14, 8912896);
                  de.c(1 + var15Lifetime3Lifetime2, var16Lifetime4Lifetime2, 14, 8912896);
                  de.c(var15Lifetime3Lifetime2, var16Lifetime4Lifetime2, 14, 0, 128);
                  de.c(var15Lifetime3Lifetime2, var16Lifetime4Lifetime2, 14, 16744576);
                  if (ad.field_d != var14) {
                    rb.field_o[var14].d(var15Lifetime3Lifetime2 - 15, -rb.field_o[var14].field_o + (var16Lifetime4Lifetime2 - rb.field_o[var14].field_y / 2), 16711680);
                  } else {
                    rb.field_o[var14].a(var15Lifetime3Lifetime2 - 15, -(rb.field_o[var14].field_y / 2) + (var16Lifetime4Lifetime2 - rb.field_o[var14].field_o), 0);
                    if ((var15Lifetime3Lifetime2 - 16) <= an.field_g &&
                      an.field_g <= 16 + var15Lifetime3Lifetime2 &&
                      (-16 + var16Lifetime4Lifetime2) <= me.field_I &&
                      var16Lifetime4Lifetime2 + 16 >= me.field_I) {
                      var17_double = (double)(jb.field_v & 255) * 3.141592653589793 / 128.0;
                      var19Lifetime3 = (int)(-256.0 + (Math.cos(4.0 * var17_double) * 256.0 + 4096.0)) / 2;
                      var20Lifetime1 = (int)(0.0 + 5000.0 * Math.sin(2.0 * var17_double));
                      tk.field_x[4].a(var15Lifetime3Lifetime2, var16Lifetime4Lifetime2, var20Lifetime1, var19Lifetime3);
                      gn.a(8, (byte) 71, 128, var15Lifetime3Lifetime2 - var19Lifetime3 * 8 / 4096, var16Lifetime4Lifetime2 - 8 * var19Lifetime3 / 4096);
                    } else {
                      var17_double = 3.141592653589793 * (double)(255 & jb.field_v) / 128.0;
                      var19Lifetime3 = (int)(-256.0 + (256.0 * Math.cos(var17_double * 4.0) + 4096.0)) / 2;
                      var20Lifetime1 = (int)(5000.0 * Math.sin(2.0 * var17_double) + 0.0);
                      tk.field_x[4].a(var15Lifetime3Lifetime2, var16Lifetime4Lifetime2, var20Lifetime1, var19Lifetime3);
                      de.c(var15Lifetime3Lifetime2, var16Lifetime4Lifetime2, 33 * var19Lifetime3 / 4096, 0, 128);
                      gn.a(8, (byte) 99, 128, -(var19Lifetime3 * 8 / 4096) + var15Lifetime3Lifetime2, var16Lifetime4Lifetime2 - var19Lifetime3 * 8 / 4096);
                      de.c(var15Lifetime3Lifetime2, var16Lifetime4Lifetime2, var19Lifetime3 * 32 / 4096, 0, 128);
                    }
                  }
                } else {
                  vd.field_b.f(var15Lifetime3Lifetime2 - 15, -16 + var16Lifetime4Lifetime2);
                }
              }
              return;
            }
            mi.field_B.a(var13, 12 + (290 + bi.field_I), 294 + uc.field_a, 299, 129, 0, -1, 1, 1, mi.field_B.field_C);
            return;
          }
          if (this.field_i >= var12Lifetime4) {
            var38 = tc.field_w[this.field_i];
            var13Lifetime1 = var38;
            var39 = vm.field_d[this.field_i];
            var15Lifetime4 = 11 + bi.field_I + 290;
            var16Lifetime5 = 302 + uc.field_a;
            if (1 != this.field_m) {
              mi.field_B.a(var38, -1 + var15Lifetime4, var16Lifetime5, 141, 29, 13158, 13158, 1, 1, mi.field_B.field_C);
              mi.field_B.a(var38, var15Lifetime4, -1 + var16Lifetime5, 141, 29, 13158, 13158, 1, 1, mi.field_B.field_C);
              mi.field_B.a(var13Lifetime1, var15Lifetime4, var16Lifetime5, 141, 29, 12569299, -1, 1, 1, mi.field_B.field_C);
              var17 = null;
              var18Lifetime3 = 16711680;
              if (!ArcanistsMulti.i((byte) -101)) {
                if (this.field_m != 6) {
                  if (this.field_m == 7) {
                    if (var3 >= 2) {
                      var18Lifetime3 = 65280;
                      var17 = gi.field_l;
                    } else {
                      var17 = jk.field_d + var3 + "/2)";
                    }
                  } else {
                    if (this.field_m == 8) {
                      if (3 > var3) {
                        var17 = jk.field_d + var3 + "/3)";
                      } else {
                        var18Lifetime3 = 65280;
                        var17 = ej.field_P;
                      }
                    }
                  }
                } else {
                  var40 = ra.field_i;
                  if (9 != this.field_h) {
                    mi.field_B.a(var40, 163 + var15Lifetime4 - 22, var16Lifetime5, 141, 29, var18Lifetime3, 0, 1, 1, mi.field_B.field_C);
                    mi.field_B.a(var39, -3 + var15Lifetime4, 340 + (uc.field_a - 8), 307, 128, 0, -1, 1, 0, mi.field_B.field_C);
                    return;
                  }
                  var17 = vf.field_h;
                }
              } else {
                var17 = gg.field_g;
              }
              mi.field_B.a((String) (var17), 163 + var15Lifetime4 - 22, var16Lifetime5, 141, 29, var18Lifetime3, 0, 1, 1, mi.field_B.field_C);
            } else {
              tj.field_t.a(var38, var15Lifetime4 - 1, var16Lifetime5, 301, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
              tj.field_t.a(var38, var15Lifetime4, -1 + var16Lifetime5, 301, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
              tj.field_t.a(var13Lifetime1, var15Lifetime4, var16Lifetime5, 301, 29, 12569299, -1, 1, 1, tj.field_t.field_C);
            }
            mi.field_B.a(var39, -3 + var15Lifetime4, 340 + (uc.field_a - 8), 307, 128, 0, -1, 1, 0, mi.field_B.field_C);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "lc.N(" + param0 + ')');
        }
    }

    private final boolean a(byte param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_41_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (7 == this.field_l) {
            if (param1 == 0 &&
              fh.field_e == 0) {
              return false;
            }
            if (param1 == 2 &&
              ~fh.field_e == ~(gd.field_kb.length - 1)) {
              return false;
            }
          }
          if (14 == this.field_l) {
            if (param1 == 0 &&
              mj.field_p == 0) {
              return false;
            }
            if (param1 == 1 &&
              7 == mj.field_p) {
              return false;
            }
          }
          if (this.field_l != 3) {
            if (param0 != -46) {
              field_c = (String) null;
            }
            return true;
          }
          stackIn_41_0 = (1 == param1) || (jb.field_z != null);
          return stackIn_41_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3), "lc.L(" + param0 + ',' + param1 + ')');
        }
    }

    private final void d(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (td.e(true)) {
            if (ri.field_b[82] &&
              ri.field_b[28]) {
              gj.a(false, true, 10, mn.field_r);
            }
            if (ri.field_b[82] &&
              ri.field_b[70]) {
              ah.field_c = 1;
            }
            if (si.field_g == 12) {
              if (vn.field_d == 26 &&
                ua.field_P < jf.field_j) {
                jf.field_j = jf.field_j - 1;
              }
              if (vn.field_d == 27 &&
                jf.field_j < 153) {
                jf.field_j = jf.field_j + 1;
              }
            }
          }
          if (param0 <= 42) {
            this.field_g = (so) null;
          }
          if (si.field_g == 12) {
            if (vn.field_d == 96) {
              this.field_d = this.field_d - 1;
            }
            if (vn.field_d == 97) {
              this.field_d = this.field_d + 1;
            }
          }
          if (si.field_g == 8) {
            if (vn.field_d == 96 &&
              this.field_g.field_h < 3) {
              this.field_g.field_h = this.field_g.field_h - 1;
              if (0 > this.field_g.field_h) {
                this.field_g.field_h = 2;
              }
            }
            if (97 == vn.field_d &&
              this.field_g.field_h < 3) {
              this.field_g.field_h = this.field_g.field_h + 1;
              if (this.field_g.field_h > 2) {
                this.field_g.field_h = 0;
              }
            }
            if (vn.field_d != 98 &&
              vn.field_d != 99) {
              this.field_g.d(-101);
              return;
            }
            if (this.field_g.field_h != 3) {
              if (this.field_g.field_f == 4) {
                this.field_g.field_h = 3;
              }
            } else {
              this.field_g.field_h = 1;
            }
            this.field_g.d(-101);
          } else {
            if (si.field_g != 7) {
              if (si.field_g == 6 &&
                !lc.a((byte) 112)) {
                this.c((byte) -92);
                return;
              }
              if (si.field_g != 14) {
                if (si.field_g == 10) {
                  this.field_g.a(-100, 0);
                } else {
                  this.field_g.a((byte) -76);
                }
              } else {
                if (vn.field_d == 96) {
                  if (this.a((byte) -46, 0)) {
                    this.field_g.a(0, false);
                  }
                  return;
                }
                if (vn.field_d == 97) {
                  if (this.a((byte) -46, 1)) {
                    this.field_g.a(1, false);
                  }
                  return;
                }
                if (vn.field_d != 98) {
                  if (vn.field_d == 99) {
                    var2_int = this.field_g.field_h + 1;
                    if (var2_int >= this.field_g.field_f) {
                      var2_int = 0;
                    }
                    if (var2_int == 0 &&
                      !this.a((byte) -46, 0)) {
                      var2_int++;
                    }
                    if (var2_int == 1 &&
                      !this.a((byte) -46, 1)) {
                      var2_int++;
                    }
                    this.field_g.a(var2_int, false);
                  } else {
                    this.field_g.a((byte) -76);
                  }
                } else {
                  var2_int = -1 + this.field_g.field_h;
                  if (var2_int == 1 &&
                    !this.a((byte) -46, 1)) {
                    var2_int--;
                  }
                  if (var2_int == 0 &&
                    !this.a((byte) -46, 0)) {
                    var2_int--;
                  }
                  if (var2_int < 0) {
                    var2_int = this.field_g.field_f - 1;
                  }
                  this.field_g.a(var2_int, false);
                }
              }
            } else {
              this.b(false);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "lc.EA(" + param0 + ')');
        }
    }

    private final int b(int param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_88_0 = 0;
        int stackIn_93_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.field_l == 6) {
            if (lc.a((byte) 112)) {
              stackIn_5_0 = 160;
              return stackIn_5_0;
            }
            if (param0 < 2) {
              stackIn_10_0 = param0 * 150 + 20;
            } else {
              stackIn_10_0 = 320;
            }
            return stackIn_10_0;
          }
          if (this.field_l == 7) {
            stackIn_15_0 = param0 * 200 + 20;
            return stackIn_15_0;
          }
          if (this.field_l == 11) {
            if (param0 == 0) {
              stackIn_21_0 = 33;
              return stackIn_21_0;
            }
            if (param0 == 1) {
              stackIn_24_0 = 304;
              return stackIn_24_0;
            }
          }
          if (this.field_l == 12) {
            if (param0 == 0) {
              stackIn_32_0 = 26;
              return stackIn_32_0;
            }
            if (param0 != 1) {
              stackIn_37_0 = param0 * 220 + lm.field_e[this.field_l];
              return stackIn_37_0;
            }
            stackIn_35_0 = 287;
            return stackIn_35_0;
          }
          if (this.field_l == 14) {
            if (wl.field_L[this.field_l][param0] == 25) {
              stackIn_48_0 = (!this.a((byte) -46, 1)) ? 220 : 120;
              return stackIn_48_0;
            }
            if (wl.field_L[this.field_l][param0] == 26) {
              stackIn_56_0 = (this.a((byte) -46, 0)) ? 320 : 220;
              return stackIn_56_0;
            }
            if (29 == wl.field_L[this.field_l][param0]) {
              stackIn_59_0 = 220;
              return stackIn_59_0;
            }
            if (7 == wl.field_L[this.field_l][param0]) {
              stackIn_64_0 = 220;
              return stackIn_64_0;
            }
          }
          if (this.field_l == 3) {
            stackIn_69_0 = 80;
            return stackIn_69_0;
          }
          if (this.field_l == 9) {
            stackIn_72_0 = 200;
            return stackIn_72_0;
          }
          if (this.field_l == 8) {
            if (param0 == 0) {
              stackIn_78_0 = 20;
              return stackIn_78_0;
            }
            if (1 == param0) {
              stackIn_83_0 = 220;
              return stackIn_83_0;
            }
            if (param0 == 2) {
              stackIn_88_0 = 420;
              return stackIn_88_0;
            }
          }
          if (param1 != 200) {
            field_q = (on[]) null;
          }
          stackIn_93_0 = lm.field_e[this.field_l];
          return stackIn_93_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3), "lc.IA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, int param1, String param2, int param3, int param4, int param5, byte param6, int param7, int param8) {
        int stackIn_9_0;
        int stackIn_9_1;
        int stackIn_9_2;
        int stackIn_9_3;
        int stackIn_9_4;
        int stackIn_10_5;
        String stackIn_25_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        String var15 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var11Lifetime1;
        var13 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var10_int = param1 - (-param3 - param7);
          if (var10_int != 0) {
            param3 = (200 * param3 + var10_int) / (var10_int * 2);
            param7 = (200 * param7 + var10_int) / (2 * var10_int);
            param1 = (param1 * 200 + var10_int) / (var10_int * 2);
          }
          if (param0 != 0) {
            stackIn_9_0 = 45 + bi.field_I;
            stackIn_9_1 = param8 - 22;
            stackIn_9_2 = 550;
            stackIn_9_3 = 26;
            stackIn_9_4 = param0;
            if (param0 == 16777215) {
              stackIn_10_5 = 32;
            } else {
              stackIn_10_5 = 128;
            }
            de.e(stackIn_9_0, stackIn_9_1, stackIn_9_2, stackIn_9_3, stackIn_9_4, stackIn_10_5);
          }
          param8 -= 4;
          param0 = 0;
          if (-1 != param5) {
            mi.field_B.c(param5 + 1 + ". ", 60 + (bi.field_I + 30), param8, param0, -1);
          }
          var14 = param2;
          var11 = var14;
          if (param6 >= -92) {
            this.field_h = -20;
          }
          var12 = var14.length();
          while (175 < mi.field_B.b(var11)) {
            var11 = param2.substring(0, var12) + "...";
            var12--;
          }
          mi.field_B.a(var11, 90 + bi.field_I, param8, param0, -1);
          var15 = Integer.toString(param4);
          mi.field_B.b(var15, no.field_tb[0] + bi.field_I, param8, param0, -1);
          if (500 <= var10_int) {
            stackIn_25_0 = "500+";
          } else {
            stackIn_25_0 = Integer.toString(var10_int);
          }
          var11Lifetime1 = stackIn_25_0;
          mi.field_B.b(var11Lifetime1, bi.field_I + no.field_tb[1], param8, param0, -1);
          var16 = param1 + "%";
          mi.field_B.b(var16, bi.field_I + no.field_tb[2], param8, param0, -1);
          var17 = param3 + "%";
          mi.field_B.b(var17, bi.field_I + no.field_tb[3], param8, param0, -1);
          var18 = param7 + "%";
          mi.field_B.b(var18, bi.field_I + no.field_tb[4], param8, param0, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_30_0 = var10;
          stackIn_30_1 = new StringBuilder().append("lc.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    private final void b(boolean param0) {
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_42_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var2_intLifetime1;
        int var3Lifetime1;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param0) {
            this.field_g = (so) null;
          }
          stackIn_8_0 = (!this.a((byte) -46, 0)) ? 1 : 0;
          var2_int = stackIn_8_0;
          stackIn_12_0 = (this.a((byte) -46, 2)) ? 2 : 1;
          var3 = stackIn_12_0;
          if (!this.field_g.c((byte) 84)) {
            if (96 == vn.field_d) {
              if (this.field_g.field_h > var2_int) {
                this.field_g.a(this.field_g.field_h - 1, param0);
              } else {
                this.field_g.a(var3, false);
              }
            }
            if (vn.field_d == 97) {
              if (0 <= this.field_g.field_h &&
                this.field_g.field_h < var3) {
                this.field_g.a(1 + this.field_g.field_h, false);
              } else {
                this.field_g.a(var2_int, false);
              }
            }
          }
          this.field_g.d(51);
          stackIn_38_0 = (this.a((byte) -46, 0)) ? 0 : 1;
          var2_intLifetime1 = stackIn_38_0;
          stackIn_42_0 = (!this.a((byte) -46, 2)) ? 1 : 2;
          var3Lifetime1 = stackIn_42_0;
          if (var2_intLifetime1 > this.field_g.field_h) {
            this.field_g.field_h = var2_intLifetime1;
          }
          if (var3Lifetime1 < this.field_g.field_h) {
            this.field_g.field_h = var3Lifetime1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "lc.LA(" + param0 + ')');
        }
    }

    final void e(byte param0) {
        int[] stackIn_35_0 = null;
        int stackIn_36_1 = 0;
        int[] stackIn_42_0 = null;
        int stackIn_46_1 = 0;
        boolean stackIn_153_0 = false;
        int stackIn_161_1 = 0;
        boolean stackIn_162_2 = false;
        int stackIn_165_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_152_0;
        le var2 = null;
        int var2_int = 0;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
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
        qb var17 = null;
        int var18 = 0;
        int var19 = 0;
        Object var20 = null;
        String var20_ref = null;
        int var21 = 0;
        le var2Lifetime1;
        int stackIn_165_0Lifetime1;
        int var2_intLifetime1;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var3Lifetime4;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var10Lifetime1;
        int var8Lifetime1Lifetime1;
        var21 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (cc.c((byte) 118)) {
            pb.a(2341);
            return;
          }
          if (param0 != -45) {
            return;
          }
          if (!lc.a((byte) 112) &&
            0 < ah.field_c) {
            ce.field_g[15] = wj.field_e;
          }
          if (this.field_l == 16) {
            de.b();
            to.field_s.b((byte) -102);
            return;
          }
          if (this.field_l == 5 ||
            this.field_l == 3) {
            var2 = jb.field_z;
            if (var2 == null) {
              var2 = r.field_b;
            }
            var3 = var2.field_V.d(false);
            if (var3 < 0) {
              var3 = 6;
            }
            stackIn_35_0 = nj.field_n;
            if (this.field_l == 3) {
              stackIn_36_1 = var3;
            } else {
              if (var2.field_I >= 0) {
                stackIn_36_1 = var2.field_I;
              } else {
                stackIn_36_1 = 6;
              }
            }
            var4 = stackIn_35_0[stackIn_36_1];
            if (var2.field_V.field_d) {
              stackIn_42_0 = nj.field_n;
              if (this.field_l != 3) {
                if (var2.field_I >= 0) {
                  stackIn_46_1 = 1 & var3;
                } else {
                  stackIn_46_1 = 6;
                }
              } else {
                stackIn_46_1 = 1 & var3;
              }
              var4 = stackIn_42_0[stackIn_46_1];
            }
            var5 = 240;
            var6 = an.field_f / 2;
            var7 = an.field_j / 2;
            for (var8 = -var5; var8 < var5; var8++) {
              de.h(0, var8 + var7, an.field_f, var8 + var7 + 1);
              de.c(var6, -4 - var8 / 2 + var7, var5, var4, 192);
              gn.a(var5, (byte) 126, 100, var6, -(var8 / 2) + (var7 - 4));
            }
            de.a();
          }
          if (this.field_l == 1 ||
            this.field_l == 2 ||
            this.field_l == 4) {
            ti.field_N = -1;
            for (var2_int = 0; var2_int < 256; var2_int++) {
              de.e(0, var2_int, an.field_f, 0, -var2_int + 256);
            }
          }
          if (14 != this.field_l) {
            boolean decompiledFrameRemainder0 = true;
            ce.field_m.a(true);
            if (!qn.a(this.field_l, (byte) -32) && (!(640 >= an.field_f) ||
              !(480 >= an.field_j))) {
              sc.a(param0 ^ -47, an.field_j, an.field_f);
              decompiledFrameRemainder0 = false;
            }
            else {
              if (0 == (jb.field_v & 63)) {
                pn.field_c = null;
              }
            }
            if (15 == this.field_l) {
              wm.field_H[0].c(bi.field_I, uc.field_a);
            } else {
              if (null != wm.field_H[this.field_l]) {
                wm.field_H[this.field_l].c(bi.field_I, uc.field_a);
              } else {
                lj.a(true, this.field_l);
                ce.field_m.a(true);
              }
            }
          }
          if (this.field_l == 9) {
            var2_intLifetime1 = (jb.field_v >> 4) % 4;
            var3Lifetime1 = jb.field_v / 2 % 2400;
            if (var3Lifetime1 < 1200) {
              var4Lifetime1 = var3Lifetime1 - 200;
              var4Lifetime1 = an.field_f * var4Lifetime1 / 640;
              for (var5Lifetime1 = 0; var5Lifetime1 < 3; var5Lifetime1++) {
                rc.field_d[var2_intLifetime1].a(-(120 * var5Lifetime1) + var4Lifetime1, var5Lifetime1 * 30 + 240, 32);
              }
            } else {
              rc.field_d[var2_intLifetime1].c();
              var4Lifetime1 = -var3Lifetime1 + 2200;
              var4Lifetime1 = an.field_f * var4Lifetime1 / 640;
              for (var5Lifetime1 = 0; 3 > var5Lifetime1; var5Lifetime1++) {
                rc.field_d[var2_intLifetime1].a(-(var5Lifetime1 * 120) + var4Lifetime1, -(30 * var5Lifetime1) + 200, 32);
              }
              rc.field_d[var2_intLifetime1].c();
            }
          }
          if (this.field_l == 1 ||
            2 == this.field_l ||
            4 == this.field_l) {
            gl.a(sc.field_U[this.field_l] * wl.field_L[this.field_l].length + 48, -24 + this.d(41, 0), -27327, 48 - (-this.a(0, (byte) 103) + this.d(41, 0)), kf.field_b, this.f(0, -7661) - 24);
          }
          var2Lifetime1 = jb.field_z;
          if (var2Lifetime1 == null) {
            var2Lifetime1 = r.field_b;
          }
          if (this.field_l == 2 &&
            var2Lifetime1.field_V.d(false) == var2Lifetime1.field_I) {
            var3Lifetime2 = 0;
            var4Lifetime2 = 0;
            var5Lifetime2 = 0;
            var6Lifetime1 = 0;
            var7Lifetime1 = 16;
            var8Lifetime1 = 0;
            var9 = -16;
            var10 = 0;
            var11 = 0;
            var12 = var2Lifetime1.field_z / 50;
            var13 = (-var12 + 160) / 10;
            if (var13 < 0) {
              var13 = 0;
            }
            var10Lifetime1 = (int)(Math.cos(0.3 * (double)jb.field_v) * (double)var13 - (double)var13);
            var8Lifetime1Lifetime1 = (int)(Math.cos(5.0 + 0.3 * (double)jb.field_v) * (double)var13 - (double)var13);
            var14 = 16;
            if (var12 < 60) {
              var14 = 17;
            }
            if (30 > var12) {
              var11 = var11 - (int)((double)var13 * Math.cos((double)jb.field_v * 0.4) - (double)var13);
              var14 = 18;
            }
            var15 = 32;
            var16 = 160;
            var17 = new qb(128, 256);
            var17.a();
            pc.$cfr$intArgs$a$5f050b8899ac(kg.field_d[2], -var11 + var16 + var8Lifetime1Lifetime1, kg.field_d[3], kg.field_d[0], -116, kg.field_d[1], qe.field_i[so.field_c[3]], var7Lifetime1 + var15);
            if (46 != so.field_c[0]) {
              pc.$cfr$intArgs$a$5f050b8899ac(kg.field_d[2], -(var11 / 2) + var4Lifetime2 + var16, kg.field_d[3], kg.field_d[0], -81, kg.field_d[1], fn.field_b[0], var3Lifetime2 + var15);
            }
            pc.$cfr$intArgs$a$5f050b8899ac(kg.field_d[2], -var11 + var16, kg.field_d[3], kg.field_d[0], 68, kg.field_d[1], jd.field_j[so.field_c[0]], var15);
            var16 -= 8;
            var16 -= 16;
            pc.$cfr$intArgs$a$5f050b8899ac(kg.field_d[2], -var11 + var16, kg.field_d[3], kg.field_d[0], 43, kg.field_d[1], kc.field_kb[so.field_c[1]], var15);
            var16 += 16;
            pc.$cfr$intArgs$a$5f050b8899ac(kg.field_d[2], -var11 + var16, kg.field_d[3], kg.field_d[0], 45, kg.field_d[1], hn.field_d[so.field_c[5]], var15);
            if (53 != so.field_c[5] &&
              so.field_c[5] != 55) {
              pc.$cfr$intArgs$a$5f050b8899ac(kg.field_d[2], -var11 + var16, kg.field_d[3], kg.field_d[0], -125, kg.field_d[1], bo.field_a[var14], var15);
            }
            var16 -= 16;
            pc.$cfr$intArgs$a$5f050b8899ac(kg.field_d[2], -var11 + var16, kg.field_d[3], kg.field_d[0], 2, kg.field_d[1], tj.field_A[so.field_c[4]], var15);
            var16 += 8;
            var16 += 16;
            if (so.field_c[0] != 46) {
              pc.$cfr$intArgs$a$5f050b8899ac(kg.field_d[2], var16 + (var6Lifetime1 - var11 / 2), kg.field_d[3], kg.field_d[0], -92, kg.field_d[1], h.field_I[0], var15 + var5Lifetime2);
            }
            pc.$cfr$intArgs$a$5f050b8899ac(kg.field_d[2], var10Lifetime1 + (var16 - var11), kg.field_d[3], kg.field_d[0], -111, kg.field_d[1], ea.field_u[so.field_c[2]], var9 + var15);
            ce.field_m.a(true);
            var18 = an.field_f - 256;
            var19 = an.field_j - 128;
            de.e(var18, var19, 256, 128, 0, 192);
            de.a(-2 + var18, -2 + var19, 256, 128, 0);
            de.a(-1 + var18, var19 - 1, 256, 128, 4799269);
            de.a(var18, var19, 256, 128, 8547138);
            de.a(var18 + 1, var19 + 1, 256, 128, 11768360);
            de.a(2 + var18, 2 + var19, 256, 128, 0);
            var20 = null;
            if (var12 >= 60) {
              if (var12 % 60 >= 10) {
                var20_ref = var12 / 60 + ":" + var12 % 60;
              } else {
                var20_ref = var12 / 60 + ":0" + var12 % 60;
              }
            } else {
              var20_ref = Integer.toString(var12);
            }
            var20_ref = tj.a(param0 + 1, new String[]{var20_ref}, im.field_i);
            var17.e(152 + var18, var19 - 104);
            mi.field_B.a(var20_ref, 8 + var18, 8 + var19, 176, 112, 16777215, 0, 0, 0, mi.field_B.field_C + mi.field_B.field_m);
          }
          if (13 != this.field_l) {
            for (var3Lifetime3 = 0; var3Lifetime3 < this.field_g.field_f; var3Lifetime3++) {
              stackOut_152_0 = this.a((byte) -46, var3Lifetime3);
              stackIn_165_0 = stackOut_152_0 ? 1 : 0;
              stackIn_153_0 = stackOut_152_0;
              if (stackIn_153_0) {
                stackIn_161_1 = 98;
                stackIn_162_2 = (this.field_g.field_h == var3Lifetime3);
                this.a((byte) stackIn_161_1, stackIn_162_2, var3Lifetime3);
              }
            }
          }
          stackIn_165_0Lifetime1 = ~this.field_l;
          if (stackIn_165_0Lifetime1 == -1) {
            this.c(-26733);
          }
          if (this.field_l != 6) {
            if (this.field_l == 7) {
              this.b((byte) 89);
            } else {
              if (this.field_l != 8) {
                if (this.field_l != 9) {
                  if (11 == this.field_l) {
                    this.i(12);
                  } else {
                    if (12 == this.field_l) {
                      this.e(1);
                    } else {
                      if (this.field_l != 14) {
                        if (this.field_l == 5) {
                          this.h(32);
                        } else {
                          if (3 == this.field_l) {
                            this.a(true);
                          }
                        }
                      } else {
                        this.a(1);
                      }
                    }
                  }
                } else {
                  mi.field_B.a(jm.field_b, bi.field_I + 80, uc.field_a + 140, 480, 180, 0, -1, 0, 1, 30);
                }
              } else {
                this.e(true);
              }
            }
          } else {
            this.d(true);
          }
          if (this.field_l != 0 &&
            this.field_l != 15 &&
            this.field_l != 13) {
            return;
          }
          var3Lifetime4 = -208 + an.field_f;
          var4Lifetime3 = an.field_j - 40;
          var5Lifetime3 = 200 * (wn.field_C + jo.field_c + be.field_f) / 127;
          var6Lifetime2 = 11176106;
          var7Lifetime2 = 34;
          if (200 > var5Lifetime3) {
            de.h(var3Lifetime4, var4Lifetime3, var3Lifetime4 + var5Lifetime3, var4Lifetime3 + 32);
            de.b(var3Lifetime4, var4Lifetime3, 200, 32, 15, var6Lifetime2, var7Lifetime2);
            mi.field_B.b(pi.field_e, var3Lifetime4 + 100, var4Lifetime3 + 19, 16777215, 0);
            de.h(var5Lifetime3 + var3Lifetime4, var4Lifetime3, 200 + var3Lifetime4, var4Lifetime3 + 32);
            de.b(var3Lifetime4, var4Lifetime3, 200, 32, 15, var6Lifetime2 >> 1 & 8355711, var7Lifetime2);
            mi.field_B.b(pi.field_e, var3Lifetime4 + 100, var4Lifetime3 + 19, 0, 16777215);
            de.a();
            de.a(var3Lifetime4, var4Lifetime3, 200, 32, 15, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2_ref), "lc.FA(" + param0 + ')');
        }
    }

    public static void c(boolean param0) {
        try {
          field_q = null;
          field_a = null;
          field_o = null;
          field_r = null;
          field_c = null;
          field_e = null;
          field_k = null;
          field_j = null;
          field_p = null;
          if (!param0) {
            lc.a((byte) -10);
          }
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "lc.BA(" + param0 + ')');
        }
    }

    private final int a(int param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 103) {
            stackIn_4_0 = this.a(-9, param0) + bi.field_I;
            return stackIn_4_0;
          }
          stackIn_2_0 = -6;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3), "lc.J(" + param0 + ',' + param1 + ')');
        }
    }

    private final void g(int param0) {
        try {
          mi.field_B.a(hg.field_c, 64 + bi.field_I, 128 + uc.field_a, 512, 224, 0, -1, 1, 1, mi.field_B.field_m + mi.field_B.field_C);
          if (param0 != 12) {
            lc.a((byte) -6);
          }
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "lc.W(" + param0 + ')');
        }
    }

    private final boolean g(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = param0 / 8;
          if (wd.field_d <= var3_int) {
            return false;
          }
          var4 = 7 - (7 & param0);
          if (param1 != (1 << var4 & ra.field_f[var3_int])) {
            return true;
          }
          if (2 > qf.field_d) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3), "lc.K(" + param0 + ',' + param1 + ')');
        }
    }

    private final void c(byte param0) {
        try {
          int var2_int = -61 % ((-38 - param0) / 46);
          this.field_g.a(82, 2);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "lc.H(" + param0 + ')');
        }
    }

    private final int a(byte param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        boolean stackIn_12_0 = false;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_11_0;
        int stackIn_32_0Lifetime1;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (this.field_l == 10) {
            stackIn_5_0 = -1;
            return stackIn_5_0;
          }
          if (param0 != 88) {
            stackIn_8_0 = 124;
            return stackIn_8_0;
          }
          var4_int = 0;
          while (wl.field_L[this.field_l].length > var4_int) {
            var5 = this.f(var4_int, param0 ^ -7605);
            stackOut_11_0 = this.a((byte) -46, var4_int);
            stackIn_32_0 = stackOut_11_0 ? 1 : 0;
            stackIn_12_0 = stackOut_11_0;
            if (stackIn_12_0 &&
              param1 >= this.d(41, var4_int) &&
              this.a(var4_int, (byte) 103) > param1 &&
              var5 <= param2 &&
              param2 < var5 + this.c(var4_int, 113)) {
              stackIn_29_0 = var4_int;
              return stackIn_29_0;
            }
            var4_int++;
          }
          stackIn_32_0Lifetime1 = -1;
          return stackIn_32_0Lifetime1;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var4), "lc.DA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final int e(int param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_78_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.field_l == 15) {
            stackIn_4_0 = 75 + (param0 * sc.field_U[this.field_l] + tg.field_f[this.field_l]);
            return stackIn_4_0;
          }
          if (2 != this.field_l &&
            this.field_l != 4 &&
            this.field_l != 1) {
            if (this.field_l == 6) {
              if (lc.a((byte) 112)) {
                stackIn_21_0 = sc.field_U[this.field_l] * param0 + tg.field_f[this.field_l];
                return stackIn_21_0;
              }
              stackIn_19_0 = sc.field_U[this.field_l] + tg.field_f[this.field_l];
              return stackIn_19_0;
            }
            if (this.field_l == 7) {
              stackIn_24_0 = tg.field_f[this.field_l];
              return stackIn_24_0;
            }
            if (this.field_l == 11) {
              stackIn_27_0 = tg.field_f[this.field_l];
              return stackIn_27_0;
            }
            if (12 == this.field_l) {
              stackIn_30_0 = tg.field_f[this.field_l];
              return stackIn_30_0;
            }
            if (param1 != 75) {
              this.g(-100);
            }
            if (this.field_l == 14) {
              if (wl.field_L[this.field_l][param0] == 25) {
                stackIn_40_0 = 348;
                return stackIn_40_0;
              }
              if (wl.field_L[this.field_l][param0] == 26) {
                stackIn_43_0 = 348;
                return stackIn_43_0;
              }
              if (wl.field_L[this.field_l][param0] == 30) {
                stackIn_48_0 = 412;
                return stackIn_48_0;
              }
              if (29 == wl.field_L[this.field_l][param0]) {
                stackIn_53_0 = 380;
                return stackIn_53_0;
              }
              if (wl.field_L[this.field_l][param0] == 7) {
                stackIn_56_0 = 444;
                return stackIn_56_0;
              }
            }
            if (this.field_l == 3) {
              if (param0 == 1 &&
                jb.field_z == null) {
                stackIn_65_0 = 410 + sc.field_U[this.field_l] / 2;
                return stackIn_65_0;
              }
              stackIn_67_0 = 410 + param0 * sc.field_U[this.field_l];
              return stackIn_67_0;
            }
            if (this.field_l != 8) {
              stackIn_78_0 = tg.field_f[this.field_l] + param0 * sc.field_U[this.field_l];
              return stackIn_78_0;
            }
            if (param0 == 3) {
              stackIn_74_0 = tg.field_f[this.field_l];
              return stackIn_74_0;
            }
            stackIn_76_0 = tg.field_f[this.field_l] + 1 * sc.field_U[this.field_l];
            return stackIn_76_0;
          }
          stackIn_13_0 = -32 + (param0 - wl.field_L[this.field_l].length) * sc.field_U[this.field_l] + 480;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3), "lc.O(" + param0 + ',' + param1 + ')');
        }
    }

    lc(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        this.field_d = 0;
        try {
          this.field_l = param0;
          if (null == wl.field_L[this.field_l]) {
            this.field_g = null;
          } else {
            this.field_g = new so(wl.field_L[this.field_l].length);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "lc.<init>(" + param0 + ')');
        }
    }

    final void b(int param0) {
        int stackIn_46_0 = 0;
        int stackIn_46_1 = 0;
        hf stackIn_71_0 = null;
        boolean stackIn_72_1 = false;
        int stackIn_85_0 = 0;
        int stackIn_121_0 = 0;
        int stackIn_121_1 = 0;
        int stackIn_124_0 = 0;
        int stackIn_124_1 = 0;
        int stackIn_165_0 = 0;
        int stackIn_165_1 = 0;
        int[][] stackIn_217_0;
        int stackIn_217_1;
        int[][] stackIn_217_2;
        int stackIn_217_3;
        int stackIn_218_4;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        hf var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_46_0Lifetime1;
        int stackIn_46_1Lifetime1;
        int stackIn_121_0Lifetime1;
        int stackIn_121_1Lifetime1;
        int stackIn_165_0Lifetime1;
        int stackIn_165_1Lifetime1;
        int var2_intLifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        int var2_intLifetime1Lifetime1;
        int var2_intLifetime1Lifetime2;
        int var3Lifetime1Lifetime1;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param0 <= 76) {
            this.field_h = -27;
          }
          fo.field_k = fo.field_k + 1;
          if (cc.c((byte) 118)) {
            var2_int = ii.a(89);
            if (var2_int != 2) {
              return;
            }
            dm.g((byte) -96);
          }
          if (!kh.field_b &&
            !oc.field_g) {
            while (true) {
              if (ib.b(false)) {
                stackIn_46_0 = vn.field_d;
                stackIn_46_1 = 13;
                if (stackIn_46_0 == stackIn_46_1 &&
                  this.field_l != 0) {
                  if (5 != this.field_l &&
                    this.field_l != 1 &&
                    2 != this.field_l &&
                    3 != this.field_l &&
                    this.field_l != 4) {
                    gj.a(false, true, th.field_f, th.field_f);
                    continue;
                  }
                  gj.a(false, true, -1, mn.field_r);
                  continue;
                }
                this.d(111);
                if (this.field_g.field_h == -1) {
                  continue;
                }
                this.a(false, this.field_g.field_h, false);
                continue;
              }
              this.field_g.a(this.a((byte) 88, an.field_g, me.field_I), this.a((byte) 88, pb.field_h, ja.field_s), -97);
              stackIn_46_0Lifetime1 = this.field_g.field_h;
              stackIn_46_1Lifetime1 = -1;
              if (stackIn_46_0Lifetime1 == stackIn_46_1Lifetime1) {
                break;
              }
              this.a(true, this.field_g.field_h, false);
              break;
            }
          }
          if (this.field_l == 13) {
            o.field_s = o.field_s + 1;
            if (!(o.field_s <= 100) ||
              wk.field_m != 0 ||
              ri.field_b[84]) {
              gj.a(false, true, 0, mn.field_r);
            }
          }
          if (this.field_l == 8) {
            this.f(-1);
          }
          if (16 == this.field_l) {
            var2 = to.field_s;
            stackIn_71_0 = var2;
            stackIn_72_1 = (!rc.b(-1)) && (~mn.field_r == ~this.field_l);
            var3 = ((hf) (Object) stackIn_71_0).a(stackIn_72_1, true);
            if (var3 != 3 && (var3 == 1 ||
              var3 == 2)) {
              stackIn_85_0 = (var3 != 2) ? 0 : 1;
              var4 = stackIn_85_0;
              gj.a(var4 != 0, true, 0, mn.field_r);
            }
          }
          if (this.field_l == 5) {
            o.field_s = o.field_s + 1;
            if (o.field_s > 250) {
              gj.a(true, true, -1, mn.field_r);
            }
          }
          if (3 == this.field_l) {
          }
          if (this.field_l == 12) {
            if (re.field_r == 1) {
              if (this.field_m == 10) {
                this.field_d = this.field_d + this.field_i;
              }
              boolean decompiledFrameRemainder0 = true;
              boolean decompiledFrameRemainder1 = true;
              if (1 == this.field_m) {
                var2_intLifetime1 = 0;
                for (var3Lifetime1 = 0; var3Lifetime1 < 16; var3Lifetime1++) {
                  stackIn_121_0 = this.field_i;
                  stackIn_121_1 = b.field_f[var3Lifetime1];
                  if (stackIn_121_0 == stackIn_121_1) {
                    var2_intLifetime1 = 1;
                    this.field_i = var3Lifetime1;
                    this.field_m = 2;
                  }
                }
                if ((var2_intLifetime1 != 0) &&
                  (decompiledFrameRemainder0 = (this.field_m == 2))) {
                  for (var2_intLifetime1 = this.field_i; var2_intLifetime1 < 15; var2_intLifetime1++) {
                    b.field_f[var2_intLifetime1] = b.field_f[1 + var2_intLifetime1];
                  }
                  decompiledFrameRemainder1 = false;
                }
                if ((decompiledFrameRemainder1) &&
                  (decompiledFrameRemainder0)) {
                  var3Lifetime1 = 0;
                  while (true) {
                    stackIn_121_0Lifetime1 = var3Lifetime1;
                    stackIn_121_1Lifetime1 = 16;
                    if (stackIn_121_0Lifetime1 >= stackIn_121_1Lifetime1) {
                      break;
                    }
                    stackIn_124_0 = -1;
                    stackIn_124_1 = b.field_f[var3Lifetime1];
                    if (stackIn_124_0 == stackIn_124_1) {
                      b.field_f[var3Lifetime1] = this.field_i;
                      this.field_i = -1;
                    }
                    var3Lifetime1++;
                  }
                }
              }
              if ((decompiledFrameRemainder1) && ((decompiledFrameRemainder0) &&
                (decompiledFrameRemainder0 = (this.field_m == 2)))) {
                for (var2_intLifetime1 = this.field_i; var2_intLifetime1 < 15; var2_intLifetime1++) {
                  b.field_f[var2_intLifetime1] = b.field_f[1 + var2_intLifetime1];
                }
              }
              if (decompiledFrameRemainder0) {
                b.field_f[15] = -1;
              }
              if (this.field_m == 0) {
                this.field_h = this.field_i;
              }
              if (this.field_m == 5 &&
                jf.field_j >= (5 + ua.field_P)) {
                bg.a(2, this.field_h * 8 - 14);
              }
              if (this.field_m == 7 &&
                2 + ua.field_P <= jf.field_j) {
                bg.a(2, -13 + this.field_h * 8 + (-1 + this.field_i % 12) / 2);
              }
              if (this.field_m == 8 &&
                (3 + ua.field_P) <= jf.field_j) {
                bg.a(2, this.field_i % 12 + this.field_h * 8 - 18);
              }
              if (this.field_m == 9 &&
                ri.field_b[82]) {
                bb.c((byte) -120);
              }
            }
            var2_intLifetime1Lifetime1 = 0;
            L17: while (true) {
              var2_intLifetime1Lifetime2 = 0;
              var3Lifetime1Lifetime1 = 0;
              while (true) {
                stackIn_165_0 = var3Lifetime1Lifetime1;
                stackIn_165_1 = 15;
                if (stackIn_165_0 >= stackIn_165_1) {
                  if (var2_intLifetime1Lifetime2 != 0) {
                    break;
                  }
                  break L17;
                }
                stackIn_165_0Lifetime1 = 0;
                stackIn_165_1Lifetime1 = ~b.field_f[var3Lifetime1Lifetime1];
                if ((stackIn_165_0Lifetime1 == stackIn_165_1Lifetime1 ||
                  !(b.field_f[1 + var3Lifetime1Lifetime1] >= b.field_f[var3Lifetime1Lifetime1])) &&
                  b.field_f[var3Lifetime1Lifetime1 + 1] != -1) {
                  var4Lifetime1 = b.field_f[var3Lifetime1Lifetime1];
                  b.field_f[var3Lifetime1Lifetime1] = b.field_f[var3Lifetime1Lifetime1 + 1];
                  b.field_f[1 + var3Lifetime1Lifetime1] = var4Lifetime1;
                  var2_intLifetime1Lifetime2 = 1;
                }
                var3Lifetime1Lifetime1++;
              }
            }
          }
          if (this.field_l == 11) {
            if (1 == re.field_r) {
              if (this.field_m == 0) {
                so.field_c[this.field_h] = this.field_i;
              }
              if (this.field_m == 6) {
                this.field_n = this.field_n + this.field_i;
              }
              if (this.field_m != 8) {
              }
              if (1 == this.field_m) {
                this.field_h = this.field_i;
                this.field_n = 0;
              }
              if (this.field_m == 2) {
                kg.field_d[0] = ld.field_n[this.field_i];
              }
              if (3 == this.field_m) {
                kg.field_d[1] = ud.field_z[this.field_i];
              }
              if (4 == this.field_m) {
                kg.field_d[2] = ug.field_d[this.field_i];
              }
              if (this.field_m == 5) {
                kg.field_d[3] = hi.field_b[this.field_i];
              }
              if (this.field_m == 7) {
                so.field_c[0] = (int)(12.0 * Math.random());
                so.field_c[1] = (int)(18.0 * Math.random() * 3.0);
                so.field_c[2] = (int)(Math.random() * 12.0);
                so.field_c[3] = (int)(12.0 * Math.random());
                so.field_c[4] = (int)(3.0 * (14.0 * Math.random()));
                so.field_c[5] = (int)(3.0 * (14.0 * Math.random()));
                kg.field_d[0] = ld.field_n[(int)(Math.random() * (double)ld.field_n.length)];
                kg.field_d[1] = ud.field_z[(int)(Math.random() * (double)ud.field_z.length)];
                kg.field_d[2] = ug.field_d[(int)(Math.random() * (double)ug.field_d.length)];
                stackIn_217_0 = kg.field_d;
                stackIn_217_1 = 3;
                stackIn_217_2 = hi.field_b;
                stackIn_217_3 = (int)(Math.random() * (double)hi.field_b.length);
                if (!(Math.random() < 1.1)) {
                  stackIn_218_4 = 8;
                } else {
                  stackIn_218_4 = 5;
                }
                stackIn_217_0[stackIn_217_1] = stackIn_217_2[stackIn_217_3 % stackIn_218_4];
              }
            }
            this.field_f = this.field_f + 0.4;
          } else {
            this.field_f = 0.0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2_ref), "lc.R(" + param0 + ')');
        }
    }

    static {
        int var0 = 0;
        field_r = "Waiting";
        field_j = new vn();
        field_q = new on[255];
        field_a = "<%0> has resigned.";
        field_c = "Owner";
        for (var0 = 0; field_q.length > var0; var0++) {
          field_q[var0] = new on();
        }
        field_k = "Type your age in years";
        field_e = "Solicitation";
        field_o = "Bounce off the landscape and either explode after 5 seconds or on each bounce. Hold the mouse to increase the velocity of the attack.";
        field_p = "Improves the abilities of Storm, Thunder Shock and Conductor Rod";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
