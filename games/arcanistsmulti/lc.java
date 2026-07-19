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
        int discarded$4 = 0;
        int discarded$5 = 0;
        int discarded$6 = 0;
        int discarded$7 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        if (!ArcanistsMulti.i((byte) -120)) {
          L0: {
            if (-1 > (param1 ^ -1)) {
              L1: {
                discarded$4 = mi.field_B.a(ic.field_b, param2, -48 + param0, 300, 80, 0, -1, 1, 1, mi.field_B.field_C);
                param0 += 24;
                param2 += 16;
                discarded$5 = mi.field_B.a(ug.field_l + param1, param2, param0, 70, 32, 0, -1, 1, 1, mi.field_B.field_C);
                param2 += 90;
                if (-100 <= (param1 ^ -1)) {
                  break L1;
                } else {
                  param2 += 8;
                  break L1;
                }
              }
              var5 = 0;
              L2: while (true) {
                if ((var5 ^ -1) <= (param1 ^ -1)) {
                  break L0;
                } else {
                  L3: {
                    if (param1 <= 5 + var5) {
                      tg.field_b[7].a(param2, param0);
                      param2 += 9;
                      break L3;
                    } else {
                      param2 -= 4;
                      tg.field_b[8].a(param2, param0);
                      param2 += 15;
                      var5 += 4;
                      if ((var5 ^ -1) != ((-(param1 % 10) + param1) / 2 + -1 ^ -1)) {
                        break L3;
                      } else {
                        if ((param1 ^ -1) >= -51) {
                          break L3;
                        } else {
                          param0 += 8;
                          param2 = param2 - var5 * 2;
                          break L3;
                        }
                      }
                    }
                  }
                  var5++;
                  continue L2;
                }
              }
            } else {
              discarded$6 = mi.field_B.a(rl.field_i, param2, -48 + param0, 300, 80, 0, -1, 1, 1, mi.field_B.field_C);
              discarded$7 = mi.field_B.a(aa.field_j, param2, param0 + 24, 300, 32, 0, -1, 1, 1, mi.field_B.field_C);
              break L0;
            }
          }
          var5 = 97 % ((param3 - 56) / 48);
          return;
        } else {
          return;
        }
    }

    private final int a(int param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        if (6 == this.field_l) {
          if (!lc.a((byte) 112)) {
            L0: {
              stackOut_4_0 = this.b(param1, 200);
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if ((param1 ^ -1) <= -3) {
                stackOut_6_0 = stackIn_6_0;
                stackOut_6_1 = 300;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L0;
              } else {
                stackOut_5_0 = stackIn_5_0;
                stackOut_5_1 = 150;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L0;
              }
            }
            return stackIn_7_0 + stackIn_7_1;
          } else {
            return this.b(param1, 200) - -320;
          }
        } else {
          if (7 == this.field_l) {
            return 200 + this.b(param1, 200);
          } else {
            if (-12 != (this.field_l ^ -1)) {
              if (this.field_l != 12) {
                if (this.field_l != 14) {
                  if (3 != this.field_l) {
                    if (-10 == (this.field_l ^ -1)) {
                      return 440;
                    } else {
                      L1: {
                        if ((this.field_l ^ -1) == param0) {
                          if (-1 == (param1 ^ -1)) {
                            return 220;
                          } else {
                            if ((param1 ^ -1) == -2) {
                              return 420;
                            } else {
                              if (param1 != 2) {
                                break L1;
                              } else {
                                return 620;
                              }
                            }
                          }
                        } else {
                          break L1;
                        }
                      }
                      return eo.field_b[this.field_l];
                    }
                  } else {
                    return 560;
                  }
                } else {
                  return this.b(param1, param0 ^ -193) + 200;
                }
              } else {
                if (param1 == 0) {
                  return 271;
                } else {
                  if (-2 != (param1 ^ -1)) {
                    return 200 + this.b(param1, 200);
                  } else {
                    return 619;
                  }
                }
              }
            } else {
              if (-1 == (param1 ^ -1)) {
                return 295;
              } else {
                if (-2 != (param1 ^ -1)) {
                  return 200 + this.b(param1, 200);
                } else {
                  return 611;
                }
              }
            }
          }
        }
    }

    final static boolean a(byte param0) {
        if (param0 != 112) {
            field_o = (String) null;
        }
        return qe.field_p;
    }

    private final void f(int param0) {
        int var2 = 0;
        if (re.field_r == 1) {
            var2 = dd.field_g;
            if (ke.field_K == var2) {
                ke.field_K = -1;
            } else {
                if (var2 != -1) {
                    ke.field_K = var2;
                }
            }
        }
        if (param0 != -1) {
            this.field_g = (so) null;
        }
    }

    final static int a(boolean param0, String param1, byte param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param2 <= -82) {
              if (!param0) {
                stackOut_6_0 = ob.field_T.b(param1);
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_4_0 = vd.field_c.b(param1);
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = -107;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("lc.A(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    private final void b(byte param0) {
        int discarded$27 = 0;
        int discarded$28 = 0;
        int discarded$29 = 0;
        int discarded$30 = 0;
        int discarded$31 = 0;
        int discarded$32 = 0;
        int discarded$33 = 0;
        int discarded$34 = 0;
        int discarded$35 = 0;
        int discarded$36 = 0;
        int discarded$37 = 0;
        int discarded$38 = 0;
        int discarded$39 = 0;
        int discarded$40 = 0;
        int discarded$41 = 0;
        int discarded$42 = 0;
        int discarded$43 = 0;
        int discarded$44 = 0;
        int discarded$45 = 0;
        int discarded$46 = 0;
        int discarded$47 = 0;
        int discarded$48 = 0;
        int discarded$49 = 0;
        int discarded$50 = 0;
        int discarded$51 = 0;
        int discarded$52 = 0;
        boolean discarded$53 = false;
        String var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        int var12_int = 0;
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
        int var23 = 0;
        int var24 = 0;
        String stackIn_21_0 = null;
        String stackOut_20_0 = null;
        String stackOut_19_0 = null;
        L0: {
          var23 = ArcanistsMulti.field_G ? 1 : 0;
          var3 = uc.field_a + 96;
          var4 = 64 + bi.field_I;
          var5 = var4;
          var6 = 512;
          var12_int = fh.field_e;
          if (var12_int != 0) {
            if (var12_int != 1) {
              if ((var12_int ^ -1) == -3) {
                var2 = lf.field_d;
                var3 = var3 + (8 - -(tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C)));
                var7 = var4;
                var9 = 45 + bi.field_I;
                var8 = 550;
                var10 = 230 - -bi.field_I;
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
                discarded$27 = mi.field_B.a(var2, var10, -65 + var3, 356, 60, 0, -1, 0, 1, mi.field_B.field_m + mi.field_B.field_C);
                de.e(var9, var3, var8, 60, 16777215, 128);
                var2 = p.field_h;
                var3 = var3 + (mi.field_B.field_C + mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, mi.field_B.field_C - -mi.field_B.field_m);
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
                discarded$28 = mi.field_B.a(var2, var10, var3 - 65, 356, 60, 0, -1, 0, 1, mi.field_B.field_C + mi.field_B.field_m);
                var4 = var7;
                de.e(var9, var3, var8, 60, 16777215, 128);
                var2 = ma.field_S;
                var3 = var3 + (mi.field_B.field_m + mi.field_B.field_C) * mi.field_B.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, mi.field_B.field_C - -mi.field_B.field_m);
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
                discarded$29 = mi.field_B.a(var2, var10, -65 + var3, 356, 60, 0, -1, 0, 1, mi.field_B.field_m + mi.field_B.field_C);
                de.e(var9, var3, var8, 60, 16777215, 128);
                var2 = mn.field_q;
                var3 = var3 + (mi.field_B.field_C - -mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, mi.field_B.field_m + mi.field_B.field_C);
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
                discarded$30 = mi.field_B.a(var2, var10, -65 + var3, 356, 60, 0, -1, 0, 1, mi.field_B.field_C + mi.field_B.field_m);
                break L0;
              } else {
                if (3 == var12_int) {
                  var9 = 45 + bi.field_I;
                  var10 = bi.field_I - -290;
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
                  discarded$31 = mi.field_B.a(var2, var10, var3 + -65, 286, 60, 0, -1, 0, 1, mi.field_B.field_m + mi.field_B.field_C);
                  var4 = var7;
                  de.e(var9, var3, var8, 60, 16777215, 128);
                  var2 = rc.field_f;
                  var3 = var3 + (mi.field_B.field_C - -mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, mi.field_B.field_m + mi.field_B.field_C);
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
                  discarded$32 = mi.field_B.a(var2, var10, -65 + var3, 286, 60, 0, -1, 0, 1, mi.field_B.field_m + mi.field_B.field_C);
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
                  discarded$33 = mi.field_B.a(var2, var10, var3 + -65, 286, 60, 0, -1, 0, 1, mi.field_B.field_C - -mi.field_B.field_m);
                  var4 = var7;
                  de.e(var9, var3, var8, 60, 16777215, 128);
                  de.h(0, var3 - -60, an.field_f, an.field_j);
                  de.c(var9, var3, var8, 105, 25, 16777215, 128);
                  de.a();
                  var2 = om.field_L;
                  var3 = var3 + (mi.field_B.field_C + mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, mi.field_B.field_C - -mi.field_B.field_m);
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
                  discarded$34 = mi.field_B.a(var2, var10, -65 + var3, 286, 60, 0, -1, 0, 1, mi.field_B.field_C - -mi.field_B.field_m);
                  var2 = jn.field_b;
                  discarded$35 = mi.field_B.a(var2, var5, -5 + var3, var6, 60, 0, -1, 1, 0, mi.field_B.field_C + mi.field_B.field_m);
                  var4 = var7;
                  break L0;
                } else {
                  if ((var12_int ^ -1) == -5) {
                    L1: {
                      var2 = n.field_e;
                      var3 = var3 + (tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C) + 8);
                      var4 = 320 + (bi.field_I + -80);
                      var3 = -70 + uc.field_a + 240;
                      de.a(-1 + var4, var3 + -1, 162, 122, 0);
                      md.field_f[2].c(var4, -24 + var3, 160, 160);
                      de.b(var4 - 170, var3 + 22, var4 - 10, 22 + var3, 16711680);
                      de.b(var4 + 5, 5 + var3 - -15, -10 + var4, var3 - -22, 16711680);
                      mi.field_B.a(ue.field_a, -180 + var4, 20 + var3, 0, 16711680);
                      de.a(var4 + 5, var3 + 5, 50, 30, 6, 16711680);
                      de.c(5 + var4, var3 - -5, 50, 30, 6, 16711680, 64);
                      de.b(-170 + var4, -18 + var3, var4 + 40, -18 + var3, 65280);
                      de.b(10 + (var4 - -70), var3, var4 - -40, var3 + -18, 65280);
                      mi.field_B.a(lh.field_h, var4 - 180, -20 + var3, 0, 65280);
                      de.a(70 + var4, var3, 20, 15, 4, 65280);
                      de.c(70 + var4, var3, 20, 15, 4, 65280, 64);
                      de.b(180 + (160 + var4), var3 - -22, 10 + (160 + var4), var3 - -22, 33023);
                      de.b(var4 + 145 - -10, var3 + 10, 160 + var4 + 10, var3 - -22, 33023);
                      mi.field_B.c(u.field_m, 160 + var4 + 180, 20 + var3, 0, 33023);
                      de.a(145 + var4, 5 + var3, 10, 10, 4, 33023);
                      de.c(var4 - -145, 5 + var3, 10, 10, 4, 33023, 64);
                      de.b(-170 + var4, 122 + var3, -10 + var4, 122 + var3, 16711935);
                      de.b(var4 + 5, 7 + (var3 + 105), -10 + var4, var3 - -122, 16711935);
                      mi.field_B.a(hc.field_a, var4 - 180, var3 - -120, 0, 16711935);
                      de.a(var4 + 5, var3 + 105, 110, 15, 6, 16711935);
                      de.c(var4 + 5, 105 + var3, 110, 15, 6, 16711935, 64);
                      de.b(180 + var4 - -160, var3 - -102, var4 - -170, 102 + var3, 16776960);
                      de.b(40 + var4 - -125, 7 + (105 + var3), 170 + var4, 102 + var3, 16776960);
                      mi.field_B.c(oa.field_b, 180 + (var4 - -160), 100 + var3, 0, 16776960);
                      de.a(125 + var4, var3 + 105, 40, 15, 6, 16776960);
                      de.c(125 + var4, var3 - -105, 40, 15, 6, 16776960, 64);
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
                      pc.a(kg.field_d[2], var17 + var3, kg.field_d[3], kg.field_d[0], (byte) 118, kg.field_d[1], qe.field_i[so.field_c[3]], var4 + var16);
                      if (-47 != (so.field_c[0] ^ -1)) {
                        pc.a(kg.field_d[2], var3 - -var13_int, kg.field_d[3], kg.field_d[0], (byte) -123, kg.field_d[1], fn.field_b[0], var4 - -var12_int);
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                    L2: {
                      pc.a(kg.field_d[2], var3, kg.field_d[3], kg.field_d[0], (byte) 109, kg.field_d[1], jd.field_j[so.field_c[0]], var4);
                      var3 -= 8;
                      var3 -= 16;
                      pc.a(kg.field_d[2], var3, kg.field_d[3], kg.field_d[0], (byte) 47, kg.field_d[1], kc.field_kb[so.field_c[1]], var4);
                      var3 += 16;
                      pc.a(kg.field_d[2], var3, kg.field_d[3], kg.field_d[0], (byte) -99, kg.field_d[1], hn.field_d[so.field_c[5]], var4);
                      if (-54 == (so.field_c[5] ^ -1)) {
                        break L2;
                      } else {
                        if (-56 == (so.field_c[5] ^ -1)) {
                          break L2;
                        } else {
                          pc.a(kg.field_d[2], var3, kg.field_d[3], kg.field_d[0], (byte) -90, kg.field_d[1], bo.field_a[0], var4);
                          break L2;
                        }
                      }
                    }
                    L3: {
                      var3 -= 16;
                      pc.a(kg.field_d[2], var3, kg.field_d[3], kg.field_d[0], (byte) -80, kg.field_d[1], tj.field_A[so.field_c[4]], var4);
                      var3 += 8;
                      var3 += 16;
                      if (46 == so.field_c[0]) {
                        break L3;
                      } else {
                        pc.a(kg.field_d[2], var3 + var15, kg.field_d[3], kg.field_d[0], (byte) -117, kg.field_d[1], h.field_I[0], var14 + var4);
                        break L3;
                      }
                    }
                    pc.a(kg.field_d[2], var3 - -var19, kg.field_d[3], kg.field_d[0], (byte) 20, kg.field_d[1], ea.field_u[so.field_c[2]], var4 + var18);
                    ce.field_m.a(true);
                    var21 = 320 + bi.field_I;
                    var22 = 350 + uc.field_a;
                    var20.b(var21, var22);
                    de.h(var21, 46 + var22, 64 + var21, an.field_j);
                    kh.field_d.a(var21 + -32, -92 + (10 + var22));
                    de.a();
                    mi.field_B.b("250", var21 + 32, var22 + 8, 16777215, -1);
                    break L0;
                  } else {
                    if (-6 != (var12_int ^ -1)) {
                      if (var12_int == 6) {
                        var2 = gl.field_a;
                        var3 = var3 + (tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C) + 8);
                        var2 = hl.field_i;
                        var3 = var3 + ((mi.field_B.field_m + mi.field_B.field_C) * mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 0, 0, mi.field_B.field_C + mi.field_B.field_m) + 8);
                        var2 = jl.field_f;
                        var3 = var3 + (8 - -((mi.field_B.field_C + mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 0, 0, mi.field_B.field_C + mi.field_B.field_m)));
                        var2 = nm.field_d;
                        var3 = var3 + (16 - -((mi.field_B.field_m + mi.field_B.field_C) * mi.field_B.a(var2, var5 + 32, var3, var6 + -64, 480, 16777215, 0, 1, 0, mi.field_B.field_m + mi.field_B.field_C)));
                        var2 = va.field_a;
                        var3 = var3 + (8 - -((mi.field_B.field_m + mi.field_B.field_C) * mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 0, 0, mi.field_B.field_C + mi.field_B.field_m)));
                        break L0;
                      } else {
                        if ((var12_int ^ -1) == -8) {
                          L4: {
                            var2 = db.field_d;
                            if (ArcanistsMulti.i((byte) -99)) {
                              var12_int = 74 + bi.field_I + tj.field_t.b(var2);
                              ii.field_d.c(var12_int, -2 + var3, 32, 32);
                              mi.field_B.a(kc.field_M, var12_int + 40, (mi.field_B.field_C + tj.field_t.field_C) / 2 + var3, 16711680, -1);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          var3 = var3 + (tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C) + 8);
                          var2 = nb.field_c;
                          var3 = var3 + (8 + (mi.field_B.field_m + mi.field_B.field_C) * mi.field_B.a(var2, var5, var3, 512, 352, 0, -1, 0, 0, mi.field_B.field_C - -mi.field_B.field_m));
                          var2 = kl.field_F;
                          var3 = var3 + ((mi.field_B.field_C - -mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 0, 0, mi.field_B.field_m + mi.field_B.field_C) + 6);
                          var11 = new int[]{16711935, 16711680, 16746632, 16776960, 65535, 34816, 16777215, 4521762, 1364125, 16755302};
                          var2 = uh.field_q;
                          discarded$36 = mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 2, 0, mi.field_B.field_C - -mi.field_B.field_m);
                          var2 = tj.a(-115, new String[]{Integer.toString(var11[1], 16)}, ve.field_s);
                          var3 = var3 + (2 - -((mi.field_B.field_m + mi.field_B.field_C) * mi.field_B.a(var2, var5, var3, 512, 352, 0, -1, 0, 0, mi.field_B.field_m + mi.field_B.field_C)));
                          var2 = ik.field_a;
                          discarded$37 = mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 2, 0, mi.field_B.field_m + mi.field_B.field_C);
                          var2 = tj.a(-51, new String[]{Integer.toString(var11[2], 16)}, ra.field_b);
                          var3 = var3 + ((mi.field_B.field_C - -mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, 512, 352, 0, -1, 0, 0, mi.field_B.field_m + mi.field_B.field_C) + 2);
                          var2 = field_p;
                          discarded$38 = mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 2, 0, mi.field_B.field_C - -mi.field_B.field_m);
                          var2 = tj.a(-116, new String[]{Integer.toString(var11[3], 16)}, hm.field_a);
                          var3 = var3 + (2 + (mi.field_B.field_C - -mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, 512, 352, 0, -1, 0, 0, mi.field_B.field_m + mi.field_B.field_C));
                          var2 = pk.field_b;
                          discarded$39 = mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 2, 0, mi.field_B.field_C - -mi.field_B.field_m);
                          var2 = tj.a(-47, new String[]{Integer.toString(var11[4], 16)}, pc.field_a);
                          var3 = var3 + ((mi.field_B.field_C - -mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, 512, 352, 0, -1, 0, 0, mi.field_B.field_C - -mi.field_B.field_m) + 2);
                          var2 = sl.field_M;
                          discarded$40 = mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 2, 0, mi.field_B.field_C - -mi.field_B.field_m);
                          var2 = tj.a(-120, new String[]{Integer.toString(var11[5], 16)}, di.field_b);
                          var3 = var3 + ((mi.field_B.field_m + mi.field_B.field_C) * mi.field_B.a(var2, var5, var3, 512, 352, 0, -1, 0, 0, mi.field_B.field_m + mi.field_B.field_C) + 2);
                          var2 = pb.field_l;
                          discarded$41 = mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 2, 0, mi.field_B.field_m + mi.field_B.field_C);
                          var2 = tj.a(122, new String[]{Integer.toString(var11[6], 16)}, go.field_f);
                          var3 = var3 + ((mi.field_B.field_m + mi.field_B.field_C) * mi.field_B.a(var2, var5, var3, 512, 352, 0, -1, 0, 0, mi.field_B.field_m + mi.field_B.field_C) + 2);
                          var2 = dk.field_f;
                          discarded$42 = mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 2, 0, mi.field_B.field_m + mi.field_B.field_C);
                          var2 = tj.a(-71, new String[]{Integer.toString(var11[7], 16)}, ra.field_e);
                          var3 = var3 + ((mi.field_B.field_C - -mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, 512, 352, 0, -1, 0, 0, mi.field_B.field_C - -mi.field_B.field_m) + 2);
                          var2 = fg.field_i;
                          discarded$43 = mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 2, 0, mi.field_B.field_C + mi.field_B.field_m);
                          var2 = tj.a(113, new String[]{Integer.toString(var11[8], 16)}, fo.field_i);
                          var3 = var3 + ((mi.field_B.field_C - -mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, 512, 352, 0, -1, 0, 0, mi.field_B.field_m + mi.field_B.field_C) + 2);
                          var2 = mf.field_e;
                          discarded$44 = mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 2, 0, mi.field_B.field_C - -mi.field_B.field_m);
                          var2 = tj.a(-33, new String[]{Integer.toString(var11[9], 16)}, ie.field_Rb);
                          var3 = var3 + (6 + (mi.field_B.field_C - -mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, 512, 352, 0, -1, 0, 0, mi.field_B.field_m + mi.field_B.field_C));
                          var2 = vn.field_a;
                          var3 = var3 + (8 + (mi.field_B.field_C - -mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, 512, 352, 0, -1, 0, 0, mi.field_B.field_m + mi.field_B.field_C));
                          break L0;
                        } else {
                          if (var12_int == 8) {
                            var2 = an.field_m;
                            var3 = var3 + (tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C) + 8);
                            this.a(var3, var4, (byte) -102, 3);
                            var2 = ne.field_j;
                            discarded$45 = mi.field_B.a(var2, 320 + bi.field_I, var3, 256, 120, 0, -1, 0, 1, mi.field_B.field_C + mi.field_B.field_m);
                            var2 = na.field_Tb;
                            var3 += 128;
                            var3 = var3 + (8 + tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C));
                            this.a(var3, var4, (byte) -77, 0);
                            var2 = kn.field_pb;
                            discarded$46 = mi.field_B.a(var2, bi.field_I + 320, var3, 256, 120, 0, -1, 0, 1, mi.field_B.field_m + mi.field_B.field_C);
                            bb.field_g[5].c(var4, var3 + 80);
                            break L0;
                          } else {
                            if (-10 != (var12_int ^ -1)) {
                              if (-11 == (var12_int ^ -1)) {
                                var2 = oo.field_q;
                                var3 = var3 + (8 - -(tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C)));
                                this.a(var3, var4, (byte) -47, 4);
                                var2 = sc.field_S;
                                discarded$47 = mi.field_B.a(var2, 320 + bi.field_I, var3, 256, 120, 0, -1, 0, 1, mi.field_B.field_C + mi.field_B.field_m);
                                bb.field_g[29].c(var4, 120 + (-40 + var3));
                                var2 = wn.field_A;
                                var3 += 128;
                                var3 = var3 + (8 + tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C));
                                this.a(var3, var4, (byte) -86, 5);
                                var2 = lm.field_d;
                                discarded$48 = mi.field_B.a(var2, 320 + bi.field_I, var3, 256, 120, 0, -1, 0, 1, mi.field_B.field_C + mi.field_B.field_m);
                                bb.field_g[55].c(var4, 80 + var3);
                                break L0;
                              } else {
                                if (-12 == (var12_int ^ -1)) {
                                  var2 = ck.field_c;
                                  var3 = var3 + (tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C) + 8);
                                  this.a(var3, var4, (byte) -36, 6);
                                  var2 = qj.field_f;
                                  discarded$49 = mi.field_B.a(var2, 320 + bi.field_I, var3, 256, 120, 0, -1, 0, 1, mi.field_B.field_m + mi.field_B.field_C);
                                  bb.field_g[67].c(var4, var3 + 80);
                                  var3 += 128;
                                  var2 = b.field_c;
                                  var3 = var3 + (tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C) + 8);
                                  this.a(var3, var4, (byte) -42, 7);
                                  var2 = uh.field_l;
                                  discarded$50 = mi.field_B.a(var2, 320 + bi.field_I, var3, 256, 120, 0, -1, 0, 1, mi.field_B.field_C + mi.field_B.field_m);
                                  bb.field_g[85].c(var4, 120 + (-40 + var3));
                                  break L0;
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
                                    L5: while (true) {
                                      if (var14 <= var24) {
                                        break L0;
                                      } else {
                                        L6: {
                                          mi.field_B.a(var12[var24], var4, var3, 0, -1);
                                          if (var12[var24].length() <= 2) {
                                            break L6;
                                          } else {
                                            if (45 == var12[var24].charAt(1)) {
                                              gj.field_f[0].a(-2 + var4, -12 + var3);
                                              break L6;
                                            } else {
                                              break L6;
                                            }
                                          }
                                        }
                                        var3 = var3 + (mi.field_B.field_C + mi.field_B.field_m);
                                        var24++;
                                        continue L5;
                                      }
                                    }
                                  } else {
                                    break L0;
                                  }
                                }
                              }
                            } else {
                              var2 = rk.field_J;
                              var3 = var3 + (tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C) + 8);
                              this.a(var3, var4, (byte) -49, 1);
                              var2 = ah.field_e;
                              discarded$51 = mi.field_B.a(var2, bi.field_I + 320, var3, 256, 120, 0, -1, 0, 1, mi.field_B.field_C - -mi.field_B.field_m);
                              bb.field_g[17].c(var4, var3 + 80);
                              var2 = hn.field_o;
                              var3 += 128;
                              var3 = var3 + (8 + tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C));
                              this.a(var3, var4, (byte) -71, 2);
                              var2 = dn.field_Bb;
                              discarded$52 = mi.field_B.a(var2, bi.field_I - -320, var3, 256, 120, 0, -1, 0, 1, mi.field_B.field_C - -mi.field_B.field_m);
                              bb.field_g[42].c(var4, 80 + var3);
                              break L0;
                            }
                          }
                        }
                      }
                    } else {
                      L7: {
                        var2 = i.field_h;
                        if (ArcanistsMulti.i((byte) -92)) {
                          var12_int = bi.field_I + (74 + tj.field_t.b(var2));
                          ii.field_d.c(var12_int, -2 + var3, 32, 32);
                          mi.field_B.a(tk.field_o, 40 + var12_int, var3 + (tj.field_t.field_C - -mi.field_B.field_C) / 2, 16711680, -1);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      var3 = var3 + (tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C) + 8);
                      var2 = km.field_b;
                      var3 = var3 + ((mi.field_B.field_C + mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, 512, 352, 0, -1, 0, 0, mi.field_B.field_m + mi.field_B.field_C) + 8);
                      var2 = hh.field_a;
                      var3 = var3 + ((mi.field_B.field_C - -mi.field_B.field_m) * mi.field_B.a(var2, 32 + var5, var3, 448, 480, 16777215, 0, 1, 0, mi.field_B.field_C - -mi.field_B.field_m) + 16);
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
                      mi.field_B.a("= 5" + dk.field_g, 20 + var4 - -100, var3 - -20, 16776960, 0);
                      var2 = an.field_n;
                      var4 -= 320;
                      var2 = tj.a(127, new String[]{ji.field_l}, var2);
                      var3 -= 48;
                      var3 = var3 + (16 + (mi.field_B.field_C - -mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, 312, 480, 0, -1, 0, 0, mi.field_B.field_m + mi.field_B.field_C));
                      var3 += 48;
                      var3 += 24;
                      var2 = fo.field_j;
                      var3 -= 32;
                      rm.field_o[9].b(64 + bi.field_I, var3);
                      rm.field_o[2].b(bi.field_I + 64, var3);
                      tk.field_x[4].b(56 + bi.field_I, var3);
                      var3 += 16;
                      var3 = var3 + ((mi.field_B.field_m + mi.field_B.field_C) * mi.field_B.a(var2, 136 + bi.field_I, var3, 440, an.field_j, 0, -1, 0, 0, mi.field_B.field_C + mi.field_B.field_m) + 16);
                      break L0;
                    }
                  }
                }
              }
            } else {
              var2 = fj.field_g;
              var3 = var3 + (tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C) + 8);
              var2 = md.field_e;
              var3 = var3 + (16 - -((mi.field_B.field_C + mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, 512, 352, 0, -1, 0, 0, mi.field_B.field_m + mi.field_B.field_C)));
              var2 = qm.field_l;
              var3 = var3 + (tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C) + 8);
              var2 = cc.field_b;
              var2 = tj.a(118, new String[]{fn.field_g[84], fn.field_g[85], fn.field_g[82], fn.field_g[81]}, var2);
              var3 = var3 + (16 + (mi.field_B.field_m + mi.field_B.field_C) * mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 0, 0, mi.field_B.field_m + mi.field_B.field_C));
              var2 = ch.field_e;
              var3 = var3 + (tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C) + 8);
              var2 = vf.field_p;
              var2 = tj.a(124, new String[]{fn.field_g[69], fn.field_g[ao.field_f]}, var2);
              var3 = var3 + (32 + (mi.field_B.field_C + mi.field_B.field_m) * mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 0, 0, mi.field_B.field_C - -mi.field_B.field_m));
              break L0;
            }
          } else {
            L8: {
              var2 = wm.field_J;
              var3 = var3 + (tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C) + 16);
              var2 = nj.field_j;
              var3 = var3 + ((mi.field_B.field_m + mi.field_B.field_C) * mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 0, 0, mi.field_B.field_m + mi.field_B.field_C) + 16);
              var2 = ud.field_u;
              var3 = var3 + (16 - -(tj.field_t.field_C * tj.field_t.a(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, tj.field_t.field_C)));
              if (ArcanistsMulti.i((byte) -121)) {
                stackOut_20_0 = cb.field_d;
                stackIn_21_0 = stackOut_20_0;
                break L8;
              } else {
                stackOut_19_0 = cn.field_J;
                stackIn_21_0 = stackOut_19_0;
                break L8;
              }
            }
            var2 = stackIn_21_0;
            var2 = tj.a(119, new String[]{ie.field_Lb, ji.field_l}, var2);
            var3 = var3 + ((mi.field_B.field_m + mi.field_B.field_C) * mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 0, 0, mi.field_B.field_m + mi.field_B.field_C) + 16);
            var2 = fd.field_c;
            var3 = var3 + ((mi.field_B.field_m + mi.field_B.field_C) * mi.field_B.a(var2, var5, var3, var6, 352, 0, -1, 0, 0, mi.field_B.field_m + mi.field_B.field_C) + 32);
            break L0;
          }
        }
        L9: {
          if (param0 >= 71) {
            break L9;
          } else {
            discarded$53 = this.g(-45, -88);
            break L9;
          }
        }
        tj.field_t.c(ul.a(fh.field_e, (byte) 69), 590 + bi.field_I, uc.field_a - -112, 0, -1);
    }

    final static void a(int param0, int param1, boolean param2) {
        if (param2) {
            lc.c(true);
        }
        gi.field_c = param1;
        mf.field_c = param0;
        if (null != pm.field_e) {
            pm.field_e.a(-120, param1, param0);
        }
    }

    final void a(boolean param0, int param1, byte param2) {
        if (!((this.field_g.field_h ^ -1) == 0)) {
            param1 = this.field_g.field_h;
        }
        if (!(-11 != (this.field_l ^ -1))) {
            param1 = 1;
        }
        this.field_g.a(param0, param1, false, this.a((byte) 88, an.field_g, me.field_I));
        ke.field_K = -1;
        if (param2 >= -113) {
            field_r = (String) null;
        }
        dd.field_g = -1;
        oj.field_e = jb.field_v;
    }

    private final void i(int param0) {
        boolean discarded$33 = false;
        boolean discarded$34 = false;
        boolean discarded$35 = false;
        int discarded$36 = 0;
        int discarded$37 = 0;
        int discarded$38 = 0;
        int discarded$39 = 0;
        int discarded$40 = 0;
        boolean discarded$41 = false;
        boolean discarded$42 = false;
        int discarded$43 = 0;
        int discarded$44 = 0;
        int discarded$45 = 0;
        boolean discarded$46 = false;
        boolean discarded$47 = false;
        int discarded$48 = 0;
        int discarded$49 = 0;
        int discarded$50 = 0;
        boolean discarded$51 = false;
        boolean discarded$52 = false;
        int discarded$53 = 0;
        int discarded$54 = 0;
        int discarded$55 = 0;
        boolean discarded$56 = false;
        boolean discarded$57 = false;
        int discarded$58 = 0;
        int discarded$59 = 0;
        int discarded$60 = 0;
        int discarded$61 = 0;
        int discarded$62 = 0;
        int discarded$63 = 0;
        int discarded$64 = 0;
        int discarded$65 = 0;
        int var2 = 0;
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
        int[] var17 = null;
        int var17_int = 0;
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
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_8_0 = 0;
        int stackIn_480_0 = 0;
        int stackOut_479_0 = 0;
        int stackOut_478_0 = 0;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        var32 = ArcanistsMulti.field_G ? 1 : 0;
        this.c(-26733);
        this.field_m = -1;
        var3 = 142;
        var4_int = 0;
        L0: while (true) {
          if (var4_int >= 7) {
            L1: {
              var4 = null;
              if (0 != this.field_h) {
                break L1;
              } else {
                var4 = jd.field_j;
                break L1;
              }
            }
            L2: {
              if (-2 != (this.field_h ^ -1)) {
                break L2;
              } else {
                var4 = kc.field_kb;
                break L2;
              }
            }
            L3: {
              if (2 == this.field_h) {
                var4 = ea.field_u;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if ((this.field_h ^ -1) == -4) {
                var4 = qe.field_i;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if ((this.field_h ^ -1) != -5) {
                break L5;
              } else {
                var4 = tj.field_A;
                break L5;
              }
            }
            L6: {
              if (-6 == (this.field_h ^ -1)) {
                var4 = hn.field_d;
                break L6;
              } else {
                break L6;
              }
            }
            discarded$33 = this.a(true, 180, (byte) -106, false, bi.field_I + 32, 114, 182 + uc.field_a);
            var3 = 210 + uc.field_a;
            var2 = bi.field_I + 90;
            var13 = -1;
            var14 = 0;
            L7: while (true) {
              if (4 < var14) {
                L8: {
                  if ((var13 ^ -1) == 0) {
                    break L8;
                  } else {
                    L9: {
                      var2 -= 40;
                      var14 = 0;
                      var15 = 0;
                      var16_ref = null;
                      if (0 == var13) {
                        var15 = 1;
                        var16_ref = lf.field_c;
                        var14 = 1;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      if ((var13 ^ -1) == -2) {
                        var16_ref = tf.field_j;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (var13 != 2) {
                        break L11;
                      } else {
                        var16_ref = ij.field_Pb;
                        var15 = 1;
                        var14 = 1;
                        break L11;
                      }
                    }
                    L12: {
                      if ((var13 ^ -1) != -4) {
                        break L12;
                      } else {
                        var16_ref = fo.field_g;
                        break L12;
                      }
                    }
                    L13: {
                      if (-5 == (var13 ^ -1)) {
                        var16_ref = fc.field_e;
                        var14 = 1;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    L14: {
                      if (5 != var13) {
                        break L14;
                      } else {
                        var14 = 1;
                        var15 = 1;
                        var16_ref = ji.field_h;
                        break L14;
                      }
                    }
                    L15: {
                      if (var13 == 6) {
                        var16_ref = rc.field_k;
                        var14 = 1;
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                    L16: {
                      if (7 == var13) {
                        var16_ref = eo.field_a;
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                    L17: {
                      if ((var13 ^ -1) != -9) {
                        break L17;
                      } else {
                        var15 = 1;
                        var14 = 1;
                        var16_ref = ae.field_a;
                        break L17;
                      }
                    }
                    L18: {
                      if (var14 != 0) {
                        if (var15 == 0) {
                          var17_int = -12;
                          L19: while (true) {
                            if (-13 > (var17_int ^ -1)) {
                              var17_int = fo.field_k / 10 % ((Object[]) (var16_ref)).length;
                              pc.a(kg.field_d[2], 64 + -((qb) (((Object[]) (var16_ref))[var17_int])).field_w + var3, kg.field_d[3], kg.field_d[0], (byte) 117, kg.field_d[1], (qb) (((Object[]) (var16_ref))[var17_int]), 32 + (-(((qb) (((Object[]) (var16_ref))[var17_int])).field_n / 2) + var2));
                              break L18;
                            } else {
                              var18_int = (int)(Math.sqrt((double)(144 + -(var17_int * var17_int))) * 2.0);
                              de.e(-var18_int + (var2 + 32), var3 + var17_int + 64, 2 * var18_int, 0, 128);
                              var17_int++;
                              continue L19;
                            }
                          }
                        } else {
                          var17_int = -8;
                          L20: while (true) {
                            if (var17_int > 8) {
                              var17_int = fo.field_k / 10 % ((Object[]) (var16_ref)).length;
                              pc.a(kg.field_d[2], var3 + -((qb) (((Object[]) (var16_ref))[var17_int])).field_w - (-32 - -(int)(Math.sin(this.field_f) * 4.0)), kg.field_d[3], kg.field_d[0], (byte) 100, kg.field_d[1], (qb) (((Object[]) (var16_ref))[var17_int]), 32 + (-(((qb) (((Object[]) (var16_ref))[var17_int])).field_n / 2) + var2));
                              break L18;
                            } else {
                              var18_int = (int)(2.0 * Math.sqrt((double)(64 - var17_int * var17_int)));
                              de.e(32 + (var2 + -var18_int), 64 + (var17_int + var3), var18_int * 2, 0, 128);
                              var17_int++;
                              continue L20;
                            }
                          }
                        }
                      } else {
                        L21: {
                          var17_int = var2;
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
                            var22 = 0;
                            break L21;
                          } else {
                            var22 = -var27;
                            break L21;
                          }
                        }
                        L22: {
                          var21 = var28;
                          if ((var27 ^ -1) > -1) {
                            var26 = var27;
                            break L22;
                          } else {
                            var26 = 0;
                            break L22;
                          }
                        }
                        L23: {
                          var25 = -var28;
                          var24 = -(var28 >> -882302462);
                          var26 += 2;
                          var23 = -6 + -(var27 >> 692979265);
                          var20 = var28 >> 613862466;
                          var19 = 6 + (var27 >> 1114345761);
                          var22 -= 2;
                          var29 = 0;
                          if (var15 == 0) {
                            var30 = -8;
                            L24: while (true) {
                              if ((var30 ^ -1) < -9) {
                                break L23;
                              } else {
                                var31 = (int)(Math.sqrt((double)(-(var30 * var30) + 64)) * 2.0);
                                de.e(32 + (var2 + -var31), 64 + var3 - -var30, var31 * 2, 0, 128);
                                var30++;
                                continue L24;
                              }
                            }
                          } else {
                            var30 = -5;
                            L25: while (true) {
                              if (5 < var30) {
                                var29 = var29 + ((int)(4.0 * Math.sin(this.field_f)) + 32);
                                break L23;
                              } else {
                                var31 = (int)(2.0 * Math.sqrt((double)(-(var30 * var30) + 25)));
                                de.e(-var31 + (var2 + 32), var30 + (var3 - -64), var31 * 2, 0, 128);
                                var30++;
                                continue L25;
                              }
                            }
                          }
                        }
                        var2 += 20;
                        var3 += 40;
                        var3 = var3 - var29;
                        pc.a(kg.field_d[2], var20 + var3, kg.field_d[3], kg.field_d[0], (byte) -82, kg.field_d[1], (qb) (((Object[]) (var16_ref))[5]), var19 + var2);
                        pc.a(kg.field_d[2], var3 + var22, kg.field_d[3], kg.field_d[0], (byte) -105, kg.field_d[1], (qb) (((Object[]) (var16_ref))[4]), var21 + var2);
                        pc.a(kg.field_d[2], var3, kg.field_d[3], kg.field_d[0], (byte) 75, kg.field_d[1], (qb) (((Object[]) (var16_ref))[3]), var2);
                        var3 -= 3;
                        var3 -= 6;
                        pc.a(kg.field_d[2], var3, kg.field_d[3], kg.field_d[0], (byte) -77, kg.field_d[1], (qb) (((Object[]) (var16_ref))[2]), var2);
                        var3 += 6;
                        var3 -= 6;
                        var3 += 3;
                        var3 += 6;
                        pc.a(kg.field_d[2], var26 + var3, kg.field_d[3], kg.field_d[0], (byte) 51, kg.field_d[1], (qb) (((Object[]) (var16_ref))[1]), var2 - -var25);
                        pc.a(kg.field_d[2], var24 + var3, kg.field_d[3], kg.field_d[0], (byte) 37, kg.field_d[1], (qb) (((Object[]) (var16_ref))[0]), var23 + var2);
                        var2 = var17_int;
                        var3 = var18_int;
                        break L18;
                      }
                    }
                    var2 += 64;
                    break L8;
                  }
                }
                var14 = -16;
                L26: while (true) {
                  if (var14 > 16) {
                    L27: {
                      if (6.28 >= this.field_f) {
                        break L27;
                      } else {
                        this.field_f = this.field_f - 6.28;
                        break L27;
                      }
                    }
                    L28: {
                      if (0.0 <= this.field_f) {
                        break L28;
                      } else {
                        this.field_f = this.field_f + 6.28;
                        break L28;
                      }
                    }
                    L29: {
                      var14 = (int)(Math.cos(this.field_f) * 16.0);
                      var15 = (int)(16.0 * Math.sin(this.field_f));
                      var5 = -var15;
                      var6 = var15;
                      if ((var14 ^ -1) >= -1) {
                        var8 = 0;
                        break L29;
                      } else {
                        var8 = -var14;
                        break L29;
                      }
                    }
                    L30: {
                      if (var14 < 0) {
                        var7 = var14;
                        break L30;
                      } else {
                        var7 = 0;
                        break L30;
                      }
                    }
                    L31: {
                      var10 = 16 + (var14 >> 960548385);
                      var11 = -(var15 >> -581740510);
                      var12 = var15 >> -304914974;
                      var9 = -(var14 >> -1972095295) + -16;
                      var8 -= 2;
                      var7 += 2;
                      var16 = -ea.field_u[so.field_c[2]].field_o + (-ea.field_u[so.field_c[2]].field_y + ea.field_u[so.field_c[2]].field_w);
                      if (var11 > var16) {
                        var11 = var16;
                        break L31;
                      } else {
                        break L31;
                      }
                    }
                    L32: {
                      var16 = -qe.field_i[so.field_c[3]].field_o - qe.field_i[so.field_c[3]].field_y + qe.field_i[so.field_c[3]].field_w;
                      if (var16 < var12) {
                        var12 = var16;
                        break L32;
                      } else {
                        break L32;
                      }
                    }
                    var34 = new int[6];
                    var33 = var34;
                    var17 = var33;
                    var18_int = 0;
                    L33: while (true) {
                      if (-7 >= (var18_int ^ -1)) {
                        L34: {
                          pc.a(kg.field_d[2], var12 + var3, kg.field_d[3], kg.field_d[0], (byte) -121, kg.field_d[1], qe.field_i[so.field_c[3]], var2 + var10);
                          if (46 != so.field_c[0]) {
                            pc.a(kg.field_d[2], var8 + var3, kg.field_d[3], kg.field_d[0], (byte) 105, kg.field_d[1], fn.field_b[0], var6 + var2);
                            break L34;
                          } else {
                            break L34;
                          }
                        }
                        L35: {
                          pc.a(kg.field_d[2], var3, kg.field_d[3], kg.field_d[0], (byte) -92, kg.field_d[1], jd.field_j[so.field_c[0]], var2);
                          var3 -= 8;
                          var3 -= 16;
                          pc.a(kg.field_d[2], var3, kg.field_d[3], kg.field_d[0], (byte) 75, kg.field_d[1], kc.field_kb[so.field_c[1]], var2);
                          var3 += 16;
                          pc.a(kg.field_d[2], var3, kg.field_d[3], kg.field_d[0], (byte) -80, kg.field_d[1], hn.field_d[so.field_c[5]], var2);
                          if ((so.field_c[5] ^ -1) == -54) {
                            break L35;
                          } else {
                            if (so.field_c[5] != 55) {
                              pc.a(kg.field_d[2], var3, kg.field_d[3], kg.field_d[0], (byte) -99, kg.field_d[1], bo.field_a[0], var2);
                              break L35;
                            } else {
                              break L35;
                            }
                          }
                        }
                        L36: {
                          var3 -= 16;
                          pc.a(kg.field_d[2], var3, kg.field_d[3], kg.field_d[0], (byte) -109, kg.field_d[1], tj.field_A[so.field_c[4]], var2);
                          var3 += 8;
                          var3 += 16;
                          if (46 == so.field_c[0]) {
                            break L36;
                          } else {
                            pc.a(kg.field_d[2], var3 + var7, kg.field_d[3], kg.field_d[0], (byte) -127, kg.field_d[1], h.field_I[0], var2 + var5);
                            break L36;
                          }
                        }
                        pc.a(kg.field_d[2], var11 + var3, kg.field_d[3], kg.field_d[0], (byte) -95, kg.field_d[1], ea.field_u[so.field_c[2]], var9 + var2);
                        var18_int = 0;
                        L37: while (true) {
                          if (-7 >= (var18_int ^ -1)) {
                            L38: {
                              if ((this.field_n ^ -1) >= -1) {
                                to.field_q.a(225 + bi.field_I, 182 + uc.field_a, 0);
                                to.field_q.c(225 + bi.field_I, uc.field_a - -182, 128);
                                break L38;
                              } else {
                                L39: {
                                  if ((bi.field_I - -225 ^ -1) < (an.field_g ^ -1)) {
                                    break L39;
                                  } else {
                                    if ((an.field_g ^ -1) <= (to.field_q.field_n + bi.field_I - -225 ^ -1)) {
                                      break L39;
                                    } else {
                                      if ((me.field_I ^ -1) > (uc.field_a - -182 ^ -1)) {
                                        break L39;
                                      } else {
                                        if ((me.field_I ^ -1) <= (to.field_q.field_w + (uc.field_a - -182) ^ -1)) {
                                          break L39;
                                        } else {
                                          to.field_q.a(225 + bi.field_I, 182 + uc.field_a, 16777215);
                                          to.field_q.c(bi.field_I + 225, 182 + uc.field_a, 128);
                                          this.field_i = -3;
                                          this.field_m = 6;
                                          break L38;
                                        }
                                      }
                                    }
                                  }
                                }
                                to.field_q.c(225 + bi.field_I, uc.field_a + 182);
                                break L38;
                              }
                            }
                            L40: {
                              if (this.field_n >= -27 + mb.a(this.field_h, 813231272)) {
                                this.field_b.a(590 + bi.field_I, uc.field_a + 182, 0);
                                this.field_b.c(590 + bi.field_I, 182 + uc.field_a, 128);
                                break L40;
                              } else {
                                if (mi.a(to.field_q.field_w, uc.field_a - -182, to.field_q.field_n, param0 ^ -12, 590 + bi.field_I)) {
                                  L41: {
                                    if (this.field_b == null) {
                                      this.field_b = to.field_q.b();
                                      break L41;
                                    } else {
                                      break L41;
                                    }
                                  }
                                  this.field_b.a(bi.field_I - -590, 182 + uc.field_a, 16777215);
                                  this.field_b.c(bi.field_I - -590, uc.field_a - -182, 128);
                                  this.field_i = 3;
                                  this.field_m = 6;
                                  break L40;
                                } else {
                                  to.field_q.e(bi.field_I - -590, uc.field_a - -182);
                                  break L40;
                                }
                              }
                            }
                            L42: {
                              discarded$34 = this.a(false, 330, (byte) -24, false, bi.field_I + 254, 114, 182 + uc.field_a);
                              if (var4 != null) {
                                var18_int = mb.a(this.field_h, 813231272);
                                L43: while (true) {
                                  if (0 <= this.field_n) {
                                    L44: while (true) {
                                      if ((var18_int ^ -1) < (this.field_n ^ -1)) {
                                        break L42;
                                      } else {
                                        this.field_n = this.field_n - var18_int;
                                        continue L44;
                                      }
                                    }
                                  } else {
                                    this.field_n = this.field_n + var18_int;
                                    continue L43;
                                  }
                                }
                              } else {
                                break L42;
                              }
                            }
                            L45: {
                              var18 = null;
                              var19 = 0;
                              var20 = 0;
                              var3 = uc.field_a + 188;
                              var2 = 264 + bi.field_I;
                              if (param0 == 12) {
                                break L45;
                              } else {
                                discarded$35 = this.a((byte) 5, -89);
                                break L45;
                              }
                            }
                            var21 = this.field_n;
                            var22 = 35;
                            var23 = 0;
                            L46: while (true) {
                              if (var23 >= 9) {
                                L47: {
                                  if (var18 != null) {
                                    discarded$36 = mi.field_B.a((String) (var18), 96 + var19 * var22 + (var2 + -256), var22 * var20 + (var3 + -1) - 16, 256, 64, 0, 0, 1, 0, mi.field_B.field_C);
                                    discarded$37 = mi.field_B.a((String) (var18), 96 + (-1 + (var19 * var22 + (var2 + -256))), -16 + (var3 + var22 * var20), 256, 64, 0, 0, 1, 0, mi.field_B.field_C);
                                    discarded$38 = mi.field_B.a((String) (var18), 97 + (var2 + var22 * var19) + -256, -16 + var22 * var20 + var3, 256, 64, 0, 0, 1, 0, mi.field_B.field_C);
                                    discarded$39 = mi.field_B.a((String) (var18), -256 + (var2 - -(var19 * var22)) - -96, var22 * var20 + (var3 + -15), 256, 64, 0, 0, 1, 0, mi.field_B.field_C);
                                    discarded$40 = mi.field_B.a((String) (var18), -160 + var2 - -(var22 * var19), -16 + (var3 - -(var22 * var20)), 256, 64, 16777215, 0, 1, 0, mi.field_B.field_C);
                                    break L47;
                                  } else {
                                    break L47;
                                  }
                                }
                                L48: {
                                  discarded$41 = this.a(false, 180, (byte) 111, false, bi.field_I + 32, 98, 309 + uc.field_a);
                                  discarded$42 = this.a(false, 166, (byte) 79, false, 39 + bi.field_I, 29, 390 + uc.field_a);
                                  discarded$43 = tj.field_t.a(gg.field_f, -1 + (32 + bi.field_I + 7), 389 + uc.field_a, 166, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                                  discarded$44 = tj.field_t.a(gg.field_f, bi.field_I + 39, uc.field_a - -390 - 2, 166, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                                  discarded$45 = tj.field_t.a(gg.field_f, bi.field_I - -39, uc.field_a - -390 + -1, 166, 29, 12569299, -1, 1, 1, tj.field_t.field_C);
                                  if (kg.field_d[3] != hi.field_b[0]) {
                                    break L48;
                                  } else {
                                    if (kg.field_d[0] != ld.field_n[2]) {
                                      break L48;
                                    } else {
                                      kg.field_d[0] = ld.field_n[3];
                                      break L48;
                                    }
                                  }
                                }
                                L49: {
                                  if (kg.field_d[3] != hi.field_b[0]) {
                                    break L49;
                                  } else {
                                    if (kg.field_d[1] == ud.field_z[2]) {
                                      kg.field_d[1] = ud.field_z[3];
                                      break L49;
                                    } else {
                                      break L49;
                                    }
                                  }
                                }
                                L50: {
                                  if (kg.field_d[3] != hi.field_b[2]) {
                                    break L50;
                                  } else {
                                    if (kg.field_d[0] == ld.field_n[12]) {
                                      kg.field_d[0] = ld.field_n[13];
                                      break L50;
                                    } else {
                                      break L50;
                                    }
                                  }
                                }
                                L51: {
                                  if (kg.field_d[3] != hi.field_b[2]) {
                                    break L51;
                                  } else {
                                    if (ud.field_z[12] == kg.field_d[1]) {
                                      kg.field_d[1] = ud.field_z[13];
                                      break L51;
                                    } else {
                                      break L51;
                                    }
                                  }
                                }
                                L52: {
                                  if (hi.field_b[3] != kg.field_d[3]) {
                                    break L52;
                                  } else {
                                    if (ud.field_z[12] != kg.field_d[1]) {
                                      break L52;
                                    } else {
                                      kg.field_d[1] = ud.field_z[14];
                                      break L52;
                                    }
                                  }
                                }
                                L53: {
                                  if (hi.field_b[3] != kg.field_d[3]) {
                                    break L53;
                                  } else {
                                    if (ld.field_n[12] != kg.field_d[0]) {
                                      break L53;
                                    } else {
                                      kg.field_d[0] = ld.field_n[14];
                                      break L53;
                                    }
                                  }
                                }
                                L54: {
                                  if (kg.field_d[3] != hi.field_b[3]) {
                                    break L54;
                                  } else {
                                    if (ud.field_z[13] == kg.field_d[1]) {
                                      kg.field_d[1] = ud.field_z[14];
                                      break L54;
                                    } else {
                                      break L54;
                                    }
                                  }
                                }
                                L55: {
                                  if (hi.field_b[3] != kg.field_d[3]) {
                                    break L55;
                                  } else {
                                    if (ld.field_n[13] == kg.field_d[0]) {
                                      kg.field_d[0] = ld.field_n[14];
                                      break L55;
                                    } else {
                                      break L55;
                                    }
                                  }
                                }
                                de.a(bi.field_I - -58, uc.field_a + 317, 131, 67, 16777215);
                                de.d(59 + bi.field_I, uc.field_a + 318, 129, 65, 0);
                                var23 = 0;
                                L56: while (true) {
                                  if ((var23 ^ -1) <= -9) {
                                    discarded$46 = this.a(false, 180, (byte) 106, false, bi.field_I - -225, 98, 309 + uc.field_a);
                                    discarded$47 = this.a(false, 166, (byte) -98, false, 232 + bi.field_I, 29, uc.field_a + 390);
                                    discarded$48 = tj.field_t.a(ce.field_j, 6 + (bi.field_I + 225), -1 + (uc.field_a - -390), 166, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                                    discarded$49 = tj.field_t.a(ce.field_j, 7 + (225 + bi.field_I), -2 + uc.field_a - -390, 166, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                                    discarded$50 = tj.field_t.a(ce.field_j, bi.field_I - -225 - -7, -1 + (uc.field_a - -390), 166, 29, 12569299, -1, 1, 1, tj.field_t.field_C);
                                    de.a(248 + bi.field_I, 317 + uc.field_a, 131, 67, 16777215);
                                    de.d(249 + bi.field_I, 318 + uc.field_a, 129, 65, 0);
                                    var23 = 0;
                                    L57: while (true) {
                                      if (var23 >= 8) {
                                        L58: {
                                          var23 = 79;
                                          var24 = 424;
                                          if ((gm.field_f ^ -1) == -4) {
                                            var23 += 14;
                                            var24 -= 7;
                                            break L58;
                                          } else {
                                            break L58;
                                          }
                                        }
                                        discarded$51 = this.a(false, 93, (byte) -106, false, bi.field_I - -417, 98, uc.field_a - -309);
                                        discarded$52 = this.a(false, var23, (byte) -96, false, var24 + bi.field_I, 29, uc.field_a + 390);
                                        discarded$53 = tj.field_t.a(th.field_j, -1 + bi.field_I - -var24, uc.field_a - -390 - 1, var23, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                                        discarded$54 = tj.field_t.a(th.field_j, var24 + bi.field_I, 390 + (uc.field_a + -2), var23, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                                        discarded$55 = tj.field_t.a(th.field_j, var24 + bi.field_I, -1 + (uc.field_a - -390), var23, 29, 12569299, -1, 1, 1, tj.field_t.field_C);
                                        de.a(431 + bi.field_I, uc.field_a - -317, 67, 67, 16777215);
                                        de.d(bi.field_I - -432, uc.field_a - -318, 65, 65, 0);
                                        var25 = 0;
                                        L59: while (true) {
                                          if (-5 >= (var25 ^ -1)) {
                                            discarded$56 = this.a(false, 93, (byte) 93, false, 520 + bi.field_I, 98, 309 + uc.field_a);
                                            discarded$57 = this.a(false, 79, (byte) 121, false, 7 + bi.field_I + 520, 29, 390 + uc.field_a);
                                            discarded$58 = tj.field_t.a(ka.field_l, 7 + bi.field_I + 520 + -1, 389 + uc.field_a, 79, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                                            discarded$59 = tj.field_t.a(ka.field_l, bi.field_I + 527, 390 + uc.field_a + -2, 79, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                                            discarded$60 = tj.field_t.a(ka.field_l, bi.field_I + 520 + 7, -1 + uc.field_a + 390, 79, 29, 12569299, -1, 1, 1, tj.field_t.field_C);
                                            de.a(535 + bi.field_I, uc.field_a + 333, 67, 35, 16777215);
                                            de.d(bi.field_I + 536, uc.field_a - -318 - -16, 65, 33, 0);
                                            var25 = 0;
                                            L60: while (true) {
                                              if (4 <= var25) {
                                                return;
                                              } else {
                                                var26 = 0;
                                                L61: while (true) {
                                                  if (var26 >= 2) {
                                                    var25++;
                                                    continue L60;
                                                  } else {
                                                    L62: {
                                                      var27 = 4 * var26 + var25;
                                                      var3 = var26 * 16 + uc.field_a - -335;
                                                      var2 = var25 * 16 + bi.field_I + 537;
                                                      var28 = (hi.field_b[var27][0] << 862087536) + (hi.field_b[var27][1] << 901584712) + hi.field_b[var27][2];
                                                      de.d(var2, var3, 15, 15, var28);
                                                      if ((an.field_g ^ -1) > (var2 ^ -1)) {
                                                        break L62;
                                                      } else {
                                                        if (var3 > me.field_I) {
                                                          break L62;
                                                        } else {
                                                          if ((an.field_g ^ -1) <= (15 + var2 ^ -1)) {
                                                            break L62;
                                                          } else {
                                                            if ((var3 + 15 ^ -1) < (me.field_I ^ -1)) {
                                                              de.a(var2 + -1, -1 + var3, 17, 17, 16777215);
                                                              this.field_i = var27;
                                                              this.field_m = 5;
                                                              break L62;
                                                            } else {
                                                              break L62;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L63: {
                                                      if (hi.field_b[var27] != kg.field_d[3]) {
                                                        break L63;
                                                      } else {
                                                        de.a(-1 + var2, -1 + var3, 17, 17, 2, 16777215, 128);
                                                        break L63;
                                                      }
                                                    }
                                                    var26++;
                                                    continue L61;
                                                  }
                                                }
                                              }
                                            }
                                          } else {
                                            var26 = 0;
                                            L64: while (true) {
                                              if (var26 >= 4) {
                                                var25++;
                                                continue L59;
                                              } else {
                                                L65: {
                                                  var27 = var25 + var26 * 4;
                                                  var2 = var25 * 16 + (bi.field_I - -433);
                                                  var28 = (ug.field_d[var27][0] << -1028253840) + (ug.field_d[var27][2] + (ug.field_d[var27][1] << -1153120760));
                                                  var3 = 16 * var26 + 319 + uc.field_a;
                                                  de.d(var2, var3, 15, 15, var28);
                                                  if ((an.field_g ^ -1) > (var2 ^ -1)) {
                                                    break L65;
                                                  } else {
                                                    if (var3 > me.field_I) {
                                                      break L65;
                                                    } else {
                                                      if (15 + var2 <= an.field_g) {
                                                        break L65;
                                                      } else {
                                                        if (me.field_I >= var3 - -15) {
                                                          break L65;
                                                        } else {
                                                          de.a(var2 + -1, var3 - 1, 17, 17, 16777215);
                                                          this.field_i = var27;
                                                          this.field_m = 4;
                                                          break L65;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                                L66: {
                                                  if (kg.field_d[2] != ug.field_d[var27]) {
                                                    break L66;
                                                  } else {
                                                    de.a(var2 - 1, -1 + var3, 17, 17, 2, 16777215, 128);
                                                    break L66;
                                                  }
                                                }
                                                var26++;
                                                continue L64;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        var24 = 0;
                                        L67: while (true) {
                                          if (-5 >= (var24 ^ -1)) {
                                            var23++;
                                            continue L57;
                                          } else {
                                            L68: {
                                              var25 = 8 * var24 + var23;
                                              var26 = (ud.field_z[var25][0] << -1104353136) + (ud.field_z[var25][2] - -(ud.field_z[var25][1] << 1324992264));
                                              var3 = var24 * 16 + 319 + uc.field_a;
                                              var2 = 250 + bi.field_I + 16 * var23;
                                              de.d(var2, var3, 15, 15, var26);
                                              if (2 != var25) {
                                                break L68;
                                              } else {
                                                if (kg.field_d[3] == hi.field_b[0]) {
                                                  var26 = 0;
                                                  break L68;
                                                } else {
                                                  break L68;
                                                }
                                              }
                                            }
                                            L69: {
                                              if (-13 != (var25 ^ -1)) {
                                                break L69;
                                              } else {
                                                if (kg.field_d[3] == hi.field_b[2]) {
                                                  var26 = 0;
                                                  break L69;
                                                } else {
                                                  break L69;
                                                }
                                              }
                                            }
                                            L70: {
                                              if ((var25 ^ -1) != -13) {
                                                break L70;
                                              } else {
                                                if (kg.field_d[3] == hi.field_b[3]) {
                                                  var26 = 0;
                                                  break L70;
                                                } else {
                                                  break L70;
                                                }
                                              }
                                            }
                                            L71: {
                                              if (-14 != (var25 ^ -1)) {
                                                break L71;
                                              } else {
                                                if (hi.field_b[3] == kg.field_d[3]) {
                                                  var26 = 0;
                                                  break L71;
                                                } else {
                                                  break L71;
                                                }
                                              }
                                            }
                                            L72: {
                                              if (-1 != (var26 ^ -1)) {
                                                break L72;
                                              } else {
                                                de.b(var2, var3, 14 + var2, var3 - -14, 16711680);
                                                de.b(1 + var2, var3, 14 + var2, var3 - -13, 0);
                                                de.b(var2, var3 + 1, var2 - -13, var3 + 14, 0);
                                                de.b(var2, var3 + 14, var2 + 14, var3, 16711680);
                                                de.b(var2 + 1, var3 - -14, 14 + var2, var3 - -1, 0);
                                                de.b(var2, var3 - -13, 13 + var2, var3, 0);
                                                break L72;
                                              }
                                            }
                                            L73: {
                                              if ((an.field_g ^ -1) > (var2 ^ -1)) {
                                                break L73;
                                              } else {
                                                if ((me.field_I ^ -1) > (var3 ^ -1)) {
                                                  break L73;
                                                } else {
                                                  if ((15 + var2 ^ -1) >= (an.field_g ^ -1)) {
                                                    break L73;
                                                  } else {
                                                    if ((var3 - -15 ^ -1) >= (me.field_I ^ -1)) {
                                                      break L73;
                                                    } else {
                                                      if (var26 == 0) {
                                                        break L73;
                                                      } else {
                                                        de.a(-1 + var2, -1 + var3, 17, 17, 16777215);
                                                        this.field_i = var25;
                                                        this.field_m = 3;
                                                        break L73;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            L74: {
                                              if (kg.field_d[1] == ud.field_z[var25]) {
                                                de.a(var2 - 1, var3 - 1, 17, 17, 2, 16777215, 128);
                                                break L74;
                                              } else {
                                                break L74;
                                              }
                                            }
                                            var24++;
                                            continue L67;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    var24 = 0;
                                    L75: while (true) {
                                      if (4 <= var24) {
                                        var23++;
                                        continue L56;
                                      } else {
                                        L76: {
                                          var25 = var24 * 8 + var23;
                                          var3 = uc.field_a - -319 + var24 * 16;
                                          var2 = var23 * 16 + bi.field_I + 60;
                                          var26 = (ld.field_n[var25][0] << -651613456) + (ld.field_n[var25][2] - -(ld.field_n[var25][1] << 519488136));
                                          de.d(var2, var3, 15, 15, var26);
                                          if (-3 != (var25 ^ -1)) {
                                            break L76;
                                          } else {
                                            if (kg.field_d[3] == hi.field_b[0]) {
                                              var26 = 0;
                                              break L76;
                                            } else {
                                              break L76;
                                            }
                                          }
                                        }
                                        L77: {
                                          if (12 != var25) {
                                            break L77;
                                          } else {
                                            if (kg.field_d[3] != hi.field_b[2]) {
                                              break L77;
                                            } else {
                                              var26 = 0;
                                              break L77;
                                            }
                                          }
                                        }
                                        L78: {
                                          if (-13 != (var25 ^ -1)) {
                                            break L78;
                                          } else {
                                            if (kg.field_d[3] != hi.field_b[3]) {
                                              break L78;
                                            } else {
                                              var26 = 0;
                                              break L78;
                                            }
                                          }
                                        }
                                        L79: {
                                          if (-14 != (var25 ^ -1)) {
                                            break L79;
                                          } else {
                                            if (kg.field_d[3] == hi.field_b[3]) {
                                              var26 = 0;
                                              break L79;
                                            } else {
                                              break L79;
                                            }
                                          }
                                        }
                                        L80: {
                                          if (var26 == 0) {
                                            de.b(var2, var3, var2 - -14, var3 + 14, 16711680);
                                            de.b(var2 + 1, var3, var2 - -14, var3 + 13, 0);
                                            de.b(var2, 1 + var3, var2 + 13, var3 + 14, 0);
                                            de.b(var2, var3 + 14, var2 - -14, var3, 16711680);
                                            de.b(var2 + 1, var3 - -14, 14 + var2, 1 + var3, 0);
                                            de.b(var2, 13 + var3, 13 + var2, var3, 0);
                                            break L80;
                                          } else {
                                            break L80;
                                          }
                                        }
                                        L81: {
                                          if (an.field_g < var2) {
                                            break L81;
                                          } else {
                                            if (me.field_I < var3) {
                                              break L81;
                                            } else {
                                              if ((an.field_g ^ -1) <= (var2 + 15 ^ -1)) {
                                                break L81;
                                              } else {
                                                if (me.field_I >= var3 - -15) {
                                                  break L81;
                                                } else {
                                                  if (-1 != (var26 ^ -1)) {
                                                    de.a(var2 + -1, var3 - 1, 17, 17, 16777215);
                                                    this.field_m = 2;
                                                    this.field_i = var25;
                                                    break L81;
                                                  } else {
                                                    break L81;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                        L82: {
                                          if (ld.field_n[var25] == kg.field_d[0]) {
                                            de.a(var2 - 1, var3 + -1, 17, 17, 2, 16777215, 128);
                                            break L82;
                                          } else {
                                            break L82;
                                          }
                                        }
                                        var24++;
                                        continue L75;
                                      }
                                    }
                                  }
                                }
                              } else {
                                var24 = 0;
                                L83: while (true) {
                                  if (-4 >= (var24 ^ -1)) {
                                    var23++;
                                    continue L46;
                                  } else {
                                    L84: {
                                      if (mb.a(this.field_h, 813231272) <= var21) {
                                        break L84;
                                      } else {
                                        L85: {
                                          de.a(-1 + (var22 * var23 + var2), var24 * var22 + var3 - 1, 34, 34, 8745077);
                                          de.a(var2 - -(var22 * var23), var3 + var24 * var22, 32, 32, 5720140);
                                          var25 = 14207693;
                                          var26 = 0;
                                          var27 = -1;
                                          var28 = 64;
                                          var29 = -1;
                                          if (this.field_h != 0) {
                                            break L85;
                                          } else {
                                            L86: {
                                              var28 = 48;
                                              if (12 > var21) {
                                                break L86;
                                              } else {
                                                if (-16 < (var21 ^ -1)) {
                                                  var27 = 0;
                                                  var25 = var25 + 2105376;
                                                  break L86;
                                                } else {
                                                  break L86;
                                                }
                                              }
                                            }
                                            L87: {
                                              if ((var21 ^ -1) > -16) {
                                                break L87;
                                              } else {
                                                if (var21 >= 18) {
                                                  break L87;
                                                } else {
                                                  var27 = 1;
                                                  break L87;
                                                }
                                              }
                                            }
                                            L88: {
                                              if ((var21 ^ -1) > -19) {
                                                break L88;
                                              } else {
                                                if (var21 < 21) {
                                                  var27 = 2;
                                                  var25 = var25 + 2105376;
                                                  break L88;
                                                } else {
                                                  break L88;
                                                }
                                              }
                                            }
                                            L89: {
                                              if ((var21 ^ -1) > -22) {
                                                break L89;
                                              } else {
                                                if (-25 < (var21 ^ -1)) {
                                                  var27 = 3;
                                                  break L89;
                                                } else {
                                                  break L89;
                                                }
                                              }
                                            }
                                            L90: {
                                              if (-25 < (var21 ^ -1)) {
                                                break L90;
                                              } else {
                                                if (var21 < 27) {
                                                  var25 = var25 + 2105376;
                                                  var27 = 4;
                                                  break L90;
                                                } else {
                                                  break L90;
                                                }
                                              }
                                            }
                                            L91: {
                                              if ((var21 ^ -1) > -28) {
                                                break L91;
                                              } else {
                                                if (30 > var21) {
                                                  var27 = 5;
                                                  break L91;
                                                } else {
                                                  break L91;
                                                }
                                              }
                                            }
                                            L92: {
                                              L93: {
                                                if (-31 == (var21 ^ -1)) {
                                                  break L93;
                                                } else {
                                                  if (33 == var21) {
                                                    break L93;
                                                  } else {
                                                    break L92;
                                                  }
                                                }
                                              }
                                              var25 = var25 + 2105376;
                                              var27 = 6;
                                              break L92;
                                            }
                                            L94: {
                                              L95: {
                                                if (31 == var21) {
                                                  break L95;
                                                } else {
                                                  if (var21 == 34) {
                                                    break L95;
                                                  } else {
                                                    break L94;
                                                  }
                                                }
                                              }
                                              var27 = 7;
                                              break L94;
                                            }
                                            L96: {
                                              L97: {
                                                if (-33 == (var21 ^ -1)) {
                                                  break L97;
                                                } else {
                                                  if (var21 != 35) {
                                                    break L96;
                                                  } else {
                                                    break L97;
                                                  }
                                                }
                                              }
                                              var25 = var25 + 2105376;
                                              var27 = 8;
                                              break L96;
                                            }
                                            L98: {
                                              L99: {
                                                if (-37 == (var21 ^ -1)) {
                                                  break L99;
                                                } else {
                                                  if (var21 == 39) {
                                                    break L99;
                                                  } else {
                                                    break L98;
                                                  }
                                                }
                                              }
                                              var27 = 9;
                                              break L98;
                                            }
                                            L100: {
                                              L101: {
                                                if (-38 == (var21 ^ -1)) {
                                                  break L101;
                                                } else {
                                                  if (-41 == (var21 ^ -1)) {
                                                    break L101;
                                                  } else {
                                                    break L100;
                                                  }
                                                }
                                              }
                                              var27 = 10;
                                              var25 = var25 + 2105376;
                                              break L100;
                                            }
                                            L102: {
                                              L103: {
                                                if (38 == var21) {
                                                  break L103;
                                                } else {
                                                  if (var21 == 41) {
                                                    break L103;
                                                  } else {
                                                    break L102;
                                                  }
                                                }
                                              }
                                              var27 = 11;
                                              break L102;
                                            }
                                            L104: {
                                              L105: {
                                                if (-43 == (var21 ^ -1)) {
                                                  break L105;
                                                } else {
                                                  if (-46 != (var21 ^ -1)) {
                                                    break L104;
                                                  } else {
                                                    break L105;
                                                  }
                                                }
                                              }
                                              var27 = 16;
                                              var25 = var25 + 2105376;
                                              break L104;
                                            }
                                            L106: {
                                              L107: {
                                                if (-44 == (var21 ^ -1)) {
                                                  break L107;
                                                } else {
                                                  if (-47 == (var21 ^ -1)) {
                                                    break L107;
                                                  } else {
                                                    break L106;
                                                  }
                                                }
                                              }
                                              var27 = 17;
                                              break L106;
                                            }
                                            L108: {
                                              if (44 != var21) {
                                                break L108;
                                              } else {
                                                var25 = var25 + 2105376;
                                                var27 = 26;
                                                break L108;
                                              }
                                            }
                                            L109: {
                                              if (-48 != (var21 ^ -1)) {
                                                break L109;
                                              } else {
                                                var27 = 28;
                                                var25 = var25 + 2105376;
                                                break L109;
                                              }
                                            }
                                            L110: {
                                              if (var21 != 48) {
                                                break L110;
                                              } else {
                                                var29 = 0;
                                                var25 = var25 + 2105376;
                                                break L110;
                                              }
                                            }
                                            L111: {
                                              if (-50 == (var21 ^ -1)) {
                                                var25 = var25 + 2105376;
                                                var29 = 0;
                                                break L111;
                                              } else {
                                                break L111;
                                              }
                                            }
                                            L112: {
                                              if (50 == var21) {
                                                var25 = var25 + 2105376;
                                                var29 = 1;
                                                break L112;
                                              } else {
                                                break L112;
                                              }
                                            }
                                            L113: {
                                              if ((var21 ^ -1) != -52) {
                                                break L113;
                                              } else {
                                                var29 = 2;
                                                break L113;
                                              }
                                            }
                                            L114: {
                                              if ((var21 ^ -1) != -53) {
                                                break L114;
                                              } else {
                                                var29 = 2;
                                                break L114;
                                              }
                                            }
                                            L115: {
                                              if (-54 == (var21 ^ -1)) {
                                                var29 = 2;
                                                break L115;
                                              } else {
                                                break L115;
                                              }
                                            }
                                            L116: {
                                              if (54 != var21) {
                                                break L116;
                                              } else {
                                                var27 = 55;
                                                var25 = var25 + 2105376;
                                                break L116;
                                              }
                                            }
                                            L117: {
                                              if (-56 != (var21 ^ -1)) {
                                                break L117;
                                              } else {
                                                var25 = var25 + 2105376;
                                                var27 = 55;
                                                break L117;
                                              }
                                            }
                                            if ((var21 ^ -1) == -57) {
                                              var27 = 55;
                                              var25 = var25 + 2105376;
                                              break L85;
                                            } else {
                                              break L85;
                                            }
                                          }
                                        }
                                        L118: {
                                          if ((this.field_h ^ -1) != -3) {
                                            break L118;
                                          } else {
                                            L119: {
                                              var28 = 48;
                                              if (-13 < (var21 ^ -1)) {
                                                break L119;
                                              } else {
                                                if ((var21 ^ -1) <= -16) {
                                                  break L119;
                                                } else {
                                                  var25 = var25 + 2105376;
                                                  var27 = 0;
                                                  break L119;
                                                }
                                              }
                                            }
                                            L120: {
                                              if (-16 < (var21 ^ -1)) {
                                                break L120;
                                              } else {
                                                if (18 <= var21) {
                                                  break L120;
                                                } else {
                                                  var27 = 1;
                                                  break L120;
                                                }
                                              }
                                            }
                                            L121: {
                                              if (var21 < 18) {
                                                break L121;
                                              } else {
                                                if (21 > var21) {
                                                  var27 = 2;
                                                  var25 = var25 + 2105376;
                                                  break L121;
                                                } else {
                                                  break L121;
                                                }
                                              }
                                            }
                                            L122: {
                                              if (var21 < 21) {
                                                break L122;
                                              } else {
                                                if ((var21 ^ -1) <= -25) {
                                                  break L122;
                                                } else {
                                                  var27 = 3;
                                                  break L122;
                                                }
                                              }
                                            }
                                            L123: {
                                              if (-25 < (var21 ^ -1)) {
                                                break L123;
                                              } else {
                                                if (27 > var21) {
                                                  var27 = 4;
                                                  var25 = var25 + 2105376;
                                                  break L123;
                                                } else {
                                                  break L123;
                                                }
                                              }
                                            }
                                            L124: {
                                              if (var21 < 27) {
                                                break L124;
                                              } else {
                                                if (var21 < 30) {
                                                  var27 = 5;
                                                  break L124;
                                                } else {
                                                  break L124;
                                                }
                                              }
                                            }
                                            L125: {
                                              L126: {
                                                if (var21 == 30) {
                                                  break L126;
                                                } else {
                                                  if (-34 != (var21 ^ -1)) {
                                                    break L125;
                                                  } else {
                                                    break L126;
                                                  }
                                                }
                                              }
                                              var27 = 6;
                                              var25 = var25 + 2105376;
                                              break L125;
                                            }
                                            L127: {
                                              L128: {
                                                if (-32 == (var21 ^ -1)) {
                                                  break L128;
                                                } else {
                                                  if ((var21 ^ -1) != -35) {
                                                    break L127;
                                                  } else {
                                                    break L128;
                                                  }
                                                }
                                              }
                                              var27 = 7;
                                              break L127;
                                            }
                                            L129: {
                                              L130: {
                                                if (var21 == 32) {
                                                  break L130;
                                                } else {
                                                  if (-36 == (var21 ^ -1)) {
                                                    break L130;
                                                  } else {
                                                    break L129;
                                                  }
                                                }
                                              }
                                              var27 = 8;
                                              var25 = var25 + 2105376;
                                              break L129;
                                            }
                                            L131: {
                                              L132: {
                                                if (-37 == (var21 ^ -1)) {
                                                  break L132;
                                                } else {
                                                  if (var21 == 39) {
                                                    break L132;
                                                  } else {
                                                    break L131;
                                                  }
                                                }
                                              }
                                              var27 = 9;
                                              break L131;
                                            }
                                            L133: {
                                              L134: {
                                                if (var21 == 37) {
                                                  break L134;
                                                } else {
                                                  if (var21 != 40) {
                                                    break L133;
                                                  } else {
                                                    break L134;
                                                  }
                                                }
                                              }
                                              var25 = var25 + 2105376;
                                              var27 = 10;
                                              break L133;
                                            }
                                            L135: {
                                              L136: {
                                                if (var21 == 38) {
                                                  break L136;
                                                } else {
                                                  if (var21 != 41) {
                                                    break L135;
                                                  } else {
                                                    break L136;
                                                  }
                                                }
                                              }
                                              var27 = 11;
                                              break L135;
                                            }
                                            L137: {
                                              L138: {
                                                if (var21 == 42) {
                                                  break L138;
                                                } else {
                                                  if (45 != var21) {
                                                    break L137;
                                                  } else {
                                                    break L138;
                                                  }
                                                }
                                              }
                                              var25 = var25 + 2105376;
                                              var27 = 16;
                                              break L137;
                                            }
                                            L139: {
                                              L140: {
                                                if ((var21 ^ -1) == -44) {
                                                  break L140;
                                                } else {
                                                  if (-47 == (var21 ^ -1)) {
                                                    break L140;
                                                  } else {
                                                    break L139;
                                                  }
                                                }
                                              }
                                              var27 = 17;
                                              break L139;
                                            }
                                            L141: {
                                              if (-45 == (var21 ^ -1)) {
                                                var27 = 26;
                                                var25 = var25 + 2105376;
                                                break L141;
                                              } else {
                                                break L141;
                                              }
                                            }
                                            L142: {
                                              if (-48 != (var21 ^ -1)) {
                                                break L142;
                                              } else {
                                                var25 = var25 + 2105376;
                                                var27 = 28;
                                                break L142;
                                              }
                                            }
                                            L143: {
                                              if (48 != var21) {
                                                break L143;
                                              } else {
                                                var29 = 0;
                                                var25 = var25 + 2105376;
                                                break L143;
                                              }
                                            }
                                            L144: {
                                              if (49 != var21) {
                                                break L144;
                                              } else {
                                                var29 = 0;
                                                var25 = var25 + 2105376;
                                                break L144;
                                              }
                                            }
                                            L145: {
                                              if (50 != var21) {
                                                break L145;
                                              } else {
                                                var29 = 1;
                                                var25 = var25 + 2105376;
                                                break L145;
                                              }
                                            }
                                            L146: {
                                              if ((var21 ^ -1) != -52) {
                                                break L146;
                                              } else {
                                                var29 = 2;
                                                break L146;
                                              }
                                            }
                                            L147: {
                                              if (var21 == 52) {
                                                var29 = 2;
                                                break L147;
                                              } else {
                                                break L147;
                                              }
                                            }
                                            if (-54 != (var21 ^ -1)) {
                                              break L118;
                                            } else {
                                              var29 = 2;
                                              break L118;
                                            }
                                          }
                                        }
                                        L148: {
                                          if (this.field_h == 3) {
                                            L149: {
                                              if (-13 < (var21 ^ -1)) {
                                                break L149;
                                              } else {
                                                if (-16 < (var21 ^ -1)) {
                                                  var27 = 0;
                                                  var25 = var25 + 2105376;
                                                  break L149;
                                                } else {
                                                  break L149;
                                                }
                                              }
                                            }
                                            L150: {
                                              var28 = 48;
                                              if ((var21 ^ -1) > -16) {
                                                break L150;
                                              } else {
                                                if (var21 >= 18) {
                                                  break L150;
                                                } else {
                                                  var27 = 1;
                                                  break L150;
                                                }
                                              }
                                            }
                                            L151: {
                                              if (-19 < (var21 ^ -1)) {
                                                break L151;
                                              } else {
                                                if ((var21 ^ -1) > -22) {
                                                  var25 = var25 + 2105376;
                                                  var27 = 2;
                                                  break L151;
                                                } else {
                                                  break L151;
                                                }
                                              }
                                            }
                                            L152: {
                                              if (var21 < 21) {
                                                break L152;
                                              } else {
                                                if (24 > var21) {
                                                  var27 = 3;
                                                  break L152;
                                                } else {
                                                  break L152;
                                                }
                                              }
                                            }
                                            L153: {
                                              if (var21 < 24) {
                                                break L153;
                                              } else {
                                                if ((var21 ^ -1) > -28) {
                                                  var27 = 4;
                                                  var25 = var25 + 2105376;
                                                  break L153;
                                                } else {
                                                  break L153;
                                                }
                                              }
                                            }
                                            L154: {
                                              if ((var21 ^ -1) > -28) {
                                                break L154;
                                              } else {
                                                if (-31 >= (var21 ^ -1)) {
                                                  break L154;
                                                } else {
                                                  var27 = 5;
                                                  break L154;
                                                }
                                              }
                                            }
                                            L155: {
                                              L156: {
                                                if (var21 == 30) {
                                                  break L156;
                                                } else {
                                                  if (-34 == (var21 ^ -1)) {
                                                    break L156;
                                                  } else {
                                                    break L155;
                                                  }
                                                }
                                              }
                                              var27 = 6;
                                              var25 = var25 + 2105376;
                                              break L155;
                                            }
                                            L157: {
                                              L158: {
                                                if (var21 == 31) {
                                                  break L158;
                                                } else {
                                                  if (34 == var21) {
                                                    break L158;
                                                  } else {
                                                    break L157;
                                                  }
                                                }
                                              }
                                              var27 = 7;
                                              break L157;
                                            }
                                            L159: {
                                              L160: {
                                                if (-33 == (var21 ^ -1)) {
                                                  break L160;
                                                } else {
                                                  if ((var21 ^ -1) == -36) {
                                                    break L160;
                                                  } else {
                                                    break L159;
                                                  }
                                                }
                                              }
                                              var27 = 8;
                                              var25 = var25 + 2105376;
                                              break L159;
                                            }
                                            L161: {
                                              L162: {
                                                if (36 == var21) {
                                                  break L162;
                                                } else {
                                                  if ((var21 ^ -1) != -40) {
                                                    break L161;
                                                  } else {
                                                    break L162;
                                                  }
                                                }
                                              }
                                              var27 = 9;
                                              break L161;
                                            }
                                            L163: {
                                              L164: {
                                                if ((var21 ^ -1) == -38) {
                                                  break L164;
                                                } else {
                                                  if ((var21 ^ -1) != -41) {
                                                    break L163;
                                                  } else {
                                                    break L164;
                                                  }
                                                }
                                              }
                                              var25 = var25 + 2105376;
                                              var27 = 10;
                                              break L163;
                                            }
                                            L165: {
                                              L166: {
                                                if ((var21 ^ -1) == -39) {
                                                  break L166;
                                                } else {
                                                  if ((var21 ^ -1) != -42) {
                                                    break L165;
                                                  } else {
                                                    break L166;
                                                  }
                                                }
                                              }
                                              var27 = 11;
                                              break L165;
                                            }
                                            L167: {
                                              L168: {
                                                if (42 == var21) {
                                                  break L168;
                                                } else {
                                                  if (var21 == 45) {
                                                    break L168;
                                                  } else {
                                                    break L167;
                                                  }
                                                }
                                              }
                                              var25 = var25 + 2105376;
                                              var27 = 16;
                                              break L167;
                                            }
                                            L169: {
                                              L170: {
                                                if (var21 == 43) {
                                                  break L170;
                                                } else {
                                                  if ((var21 ^ -1) == -47) {
                                                    break L170;
                                                  } else {
                                                    break L169;
                                                  }
                                                }
                                              }
                                              var27 = 17;
                                              break L169;
                                            }
                                            L171: {
                                              if (var21 == 44) {
                                                var27 = 26;
                                                var25 = var25 + 2105376;
                                                break L171;
                                              } else {
                                                break L171;
                                              }
                                            }
                                            L172: {
                                              if ((var21 ^ -1) == -48) {
                                                var25 = var25 + 2105376;
                                                var27 = 28;
                                                break L172;
                                              } else {
                                                break L172;
                                              }
                                            }
                                            L173: {
                                              if (var21 == 48) {
                                                var29 = 0;
                                                var25 = var25 + 2105376;
                                                break L173;
                                              } else {
                                                break L173;
                                              }
                                            }
                                            L174: {
                                              if (-50 != (var21 ^ -1)) {
                                                break L174;
                                              } else {
                                                var29 = 0;
                                                var25 = var25 + 2105376;
                                                break L174;
                                              }
                                            }
                                            L175: {
                                              if (50 != var21) {
                                                break L175;
                                              } else {
                                                var29 = 1;
                                                var25 = var25 + 2105376;
                                                break L175;
                                              }
                                            }
                                            L176: {
                                              if (-52 != (var21 ^ -1)) {
                                                break L176;
                                              } else {
                                                var29 = 2;
                                                break L176;
                                              }
                                            }
                                            L177: {
                                              if (var21 != 52) {
                                                break L177;
                                              } else {
                                                var29 = 2;
                                                break L177;
                                              }
                                            }
                                            if (-54 != (var21 ^ -1)) {
                                              break L148;
                                            } else {
                                              var29 = 2;
                                              break L148;
                                            }
                                          } else {
                                            break L148;
                                          }
                                        }
                                        L178: {
                                          if (1 == this.field_h) {
                                            var28 = 54;
                                            break L178;
                                          } else {
                                            break L178;
                                          }
                                        }
                                        L179: {
                                          if (4 == this.field_h) {
                                            L180: {
                                              if (42 == var21) {
                                                var27 = 0;
                                                var25 = var25 + 2105376;
                                                break L180;
                                              } else {
                                                break L180;
                                              }
                                            }
                                            L181: {
                                              var28 = 66;
                                              if (var21 == 43) {
                                                var27 = 1;
                                                break L181;
                                              } else {
                                                break L181;
                                              }
                                            }
                                            L182: {
                                              if (-45 != (var21 ^ -1)) {
                                                break L182;
                                              } else {
                                                var25 = var25 + 2105376;
                                                var27 = 2;
                                                break L182;
                                              }
                                            }
                                            L183: {
                                              if ((var21 ^ -1) != -46) {
                                                break L183;
                                              } else {
                                                var27 = 3;
                                                break L183;
                                              }
                                            }
                                            L184: {
                                              if (46 == var21) {
                                                var25 = var25 + 2105376;
                                                var27 = 4;
                                                break L184;
                                              } else {
                                                break L184;
                                              }
                                            }
                                            L185: {
                                              if (47 == var21) {
                                                var27 = 5;
                                                break L185;
                                              } else {
                                                break L185;
                                              }
                                            }
                                            L186: {
                                              L187: {
                                                if ((var21 ^ -1) == -49) {
                                                  break L187;
                                                } else {
                                                  if ((var21 ^ -1) == -52) {
                                                    break L187;
                                                  } else {
                                                    break L186;
                                                  }
                                                }
                                              }
                                              var27 = 6;
                                              var25 = var25 + 2105376;
                                              break L186;
                                            }
                                            L188: {
                                              L189: {
                                                if ((var21 ^ -1) == -50) {
                                                  break L189;
                                                } else {
                                                  if (-53 == (var21 ^ -1)) {
                                                    break L189;
                                                  } else {
                                                    break L188;
                                                  }
                                                }
                                              }
                                              var27 = 7;
                                              break L188;
                                            }
                                            L190: {
                                              L191: {
                                                if (var21 == 50) {
                                                  break L191;
                                                } else {
                                                  if (53 != var21) {
                                                    break L190;
                                                  } else {
                                                    break L191;
                                                  }
                                                }
                                              }
                                              var25 = var25 + 2105376;
                                              var27 = 8;
                                              break L190;
                                            }
                                            L192: {
                                              L193: {
                                                if ((var21 ^ -1) == -55) {
                                                  break L193;
                                                } else {
                                                  if (-58 == (var21 ^ -1)) {
                                                    break L193;
                                                  } else {
                                                    break L192;
                                                  }
                                                }
                                              }
                                              var27 = 9;
                                              break L192;
                                            }
                                            L194: {
                                              L195: {
                                                if (var21 == 55) {
                                                  break L195;
                                                } else {
                                                  if (-59 != (var21 ^ -1)) {
                                                    break L194;
                                                  } else {
                                                    break L195;
                                                  }
                                                }
                                              }
                                              var25 = var25 + 2105376;
                                              var27 = 10;
                                              break L194;
                                            }
                                            L196: {
                                              L197: {
                                                if (56 == var21) {
                                                  break L197;
                                                } else {
                                                  if ((var21 ^ -1) != -60) {
                                                    break L196;
                                                  } else {
                                                    break L197;
                                                  }
                                                }
                                              }
                                              var27 = 11;
                                              break L196;
                                            }
                                            L198: {
                                              L199: {
                                                if (-61 == (var21 ^ -1)) {
                                                  break L199;
                                                } else {
                                                  if (var21 == 63) {
                                                    break L199;
                                                  } else {
                                                    break L198;
                                                  }
                                                }
                                              }
                                              var27 = 16;
                                              var25 = var25 + 2105376;
                                              break L198;
                                            }
                                            L200: {
                                              L201: {
                                                if (var21 == 61) {
                                                  break L201;
                                                } else {
                                                  if (var21 == 64) {
                                                    break L201;
                                                  } else {
                                                    break L200;
                                                  }
                                                }
                                              }
                                              var27 = 17;
                                              break L200;
                                            }
                                            L202: {
                                              if ((var21 ^ -1) != -63) {
                                                break L202;
                                              } else {
                                                var27 = 27;
                                                var25 = var25 + 2105376;
                                                break L202;
                                              }
                                            }
                                            L203: {
                                              if (65 != var21) {
                                                break L203;
                                              } else {
                                                var27 = 29;
                                                var25 = var25 + 2105376;
                                                break L203;
                                              }
                                            }
                                            L204: {
                                              if (var21 != 66) {
                                                break L204;
                                              } else {
                                                var25 = var25 + 2105376;
                                                var29 = 0;
                                                break L204;
                                              }
                                            }
                                            L205: {
                                              if (-68 != (var21 ^ -1)) {
                                                break L205;
                                              } else {
                                                var25 = var25 + 2105376;
                                                var29 = 0;
                                                break L205;
                                              }
                                            }
                                            L206: {
                                              if (var21 != 68) {
                                                break L206;
                                              } else {
                                                var29 = 1;
                                                var25 = var25 + 2105376;
                                                break L206;
                                              }
                                            }
                                            L207: {
                                              if (69 == var21) {
                                                var29 = 2;
                                                break L207;
                                              } else {
                                                break L207;
                                              }
                                            }
                                            L208: {
                                              if ((var21 ^ -1) == -71) {
                                                var29 = 2;
                                                break L208;
                                              } else {
                                                break L208;
                                              }
                                            }
                                            if (71 == var21) {
                                              var29 = 2;
                                              break L179;
                                            } else {
                                              break L179;
                                            }
                                          } else {
                                            break L179;
                                          }
                                        }
                                        L209: {
                                          if (-6 == (this.field_h ^ -1)) {
                                            L210: {
                                              var28 = 51;
                                              if ((var21 ^ -1) != -49) {
                                                break L210;
                                              } else {
                                                var25 = var25 + 2105376;
                                                var27 = 27;
                                                break L210;
                                              }
                                            }
                                            L211: {
                                              if (49 != var21) {
                                                break L211;
                                              } else {
                                                var27 = 29;
                                                var25 = var25 + 2105376;
                                                break L211;
                                              }
                                            }
                                            L212: {
                                              if ((var21 ^ -1) != -51) {
                                                break L212;
                                              } else {
                                                var27 = 30;
                                                var25 = var25 + 2105376;
                                                break L212;
                                              }
                                            }
                                            L213: {
                                              if (-52 == (var21 ^ -1)) {
                                                var29 = 0;
                                                var25 = var25 + 2105376;
                                                break L213;
                                              } else {
                                                break L213;
                                              }
                                            }
                                            L214: {
                                              if (52 == var21) {
                                                var25 = var25 + 2105376;
                                                var29 = 0;
                                                break L214;
                                              } else {
                                                break L214;
                                              }
                                            }
                                            L215: {
                                              if (53 != var21) {
                                                break L215;
                                              } else {
                                                var29 = 1;
                                                var25 = var25 + 2105376;
                                                break L215;
                                              }
                                            }
                                            L216: {
                                              if (var21 == 54) {
                                                var29 = 2;
                                                break L216;
                                              } else {
                                                break L216;
                                              }
                                            }
                                            L217: {
                                              if (-56 == (var21 ^ -1)) {
                                                var29 = 2;
                                                break L217;
                                              } else {
                                                break L217;
                                              }
                                            }
                                            if (56 == var21) {
                                              var29 = 2;
                                              break L209;
                                            } else {
                                              break L209;
                                            }
                                          } else {
                                            break L209;
                                          }
                                        }
                                        L218: {
                                          if ((var27 ^ -1) != 0) {
                                            L219: {
                                              var30 = var27 >> -418342139;
                                              var31 = -(var30 << -821304027) + var27;
                                              if ((ad.field_f[var30] & 1 << var31) != 0) {
                                                stackOut_479_0 = 0;
                                                stackIn_480_0 = stackOut_479_0;
                                                break L219;
                                              } else {
                                                stackOut_478_0 = 1;
                                                stackIn_480_0 = stackOut_478_0;
                                                break L219;
                                              }
                                            }
                                            var26 = stackIn_480_0;
                                            break L218;
                                          } else {
                                            break L218;
                                          }
                                        }
                                        L220: {
                                          if (0 == (var29 ^ -1)) {
                                            break L220;
                                          } else {
                                            if (!this.g(var29, 0)) {
                                              var26 = 1;
                                              break L220;
                                            } else {
                                              break L220;
                                            }
                                          }
                                        }
                                        L221: {
                                          de.d(var2 - -(var22 * var23) + 1, var22 * var24 + var3 - -1, 30, 30, var25);
                                          if (var21 == so.field_c[this.field_h]) {
                                            de.d(1 + var2 + var23 * var22, var3 + var22 * var24 + 1, 30, 30, 16711935 | var25);
                                            break L221;
                                          } else {
                                            break L221;
                                          }
                                        }
                                        L222: {
                                          L223: {
                                            if ((var28 ^ -1) < (var21 ^ -1)) {
                                              break L223;
                                            } else {
                                              if (var26 == 0) {
                                                break L223;
                                              } else {
                                                if (-1 == var27) {
                                                  de.d(1 + var23 * var22 + var2, var3 - -(var22 * var24) + 1, 30, 30, 9996941);
                                                  ((qb) (((Object[]) (var4))[var21])).b(-(((qb) (((Object[]) (var4))[var21])).field_q / 4) + (16 + var22 * var23) + var2 - ((qb) (((Object[]) (var4))[var21])).field_x / 2, -(((qb) (((Object[]) (var4))[var21])).field_y / 4) + var3 + (var24 * var22 + (16 - ((qb) (((Object[]) (var4))[var21])).field_o / 2)), 32, 32);
                                                  de.e(var2 - -(var22 * var23) - -1, 1 + (var3 + var24 * var22), 30, 30, 0, 192);
                                                  di.field_d.b(20 + (var2 - -(var22 * var23)), 20 + (var3 + var22 * var24), 12, 12);
                                                  break L222;
                                                } else {
                                                  break L223;
                                                }
                                              }
                                            }
                                          }
                                          if (var26 != 0) {
                                            de.d(1 + (var22 * var23 + var2), 1 + var22 * var24 + var3, 30, 30, 9996941);
                                            ((qb) (((Object[]) (var4))[var21])).b(-(((qb) (((Object[]) (var4))[var21])).field_q / 4) + 16 + var2 + var23 * var22 + -(((qb) (((Object[]) (var4))[var21])).field_x / 2), -(((qb) (((Object[]) (var4))[var21])).field_y / 4) + (-(((qb) (((Object[]) (var4))[var21])).field_o / 2) + var3) - (-(var24 * var22) - 16), 32, 32);
                                            de.e(var2 + var22 * var23 + 1, var3 + (var22 * var24 - -1), 30, 30, 0, 192);
                                            vd.field_b.b(var2 + var22 * var23 + 20, var24 * var22 + var3 - -20, 12, 12);
                                            break L222;
                                          } else {
                                            ((qb) (((Object[]) (var4))[var21])).b(-(((qb) (((Object[]) (var4))[var21])).field_x / 2) + (var23 * var22 + var2) - (-16 + ((qb) (((Object[]) (var4))[var21])).field_q / 4), -(((qb) (((Object[]) (var4))[var21])).field_y / 4) + (16 + var3) + var22 * var24 + -(((qb) (((Object[]) (var4))[var21])).field_o / 2), 32, 32);
                                            break L222;
                                          }
                                        }
                                        L224: {
                                          if (-3 < (qf.field_d ^ -1)) {
                                            break L224;
                                          } else {
                                            var26 = 0;
                                            break L224;
                                          }
                                        }
                                        if ((var2 + var23 * var22 ^ -1) < (an.field_g ^ -1)) {
                                          break L84;
                                        } else {
                                          if ((an.field_g ^ -1) <= (32 + var2 + var22 * var23 ^ -1)) {
                                            break L84;
                                          } else {
                                            if ((me.field_I ^ -1) > (var22 * var24 + var3 ^ -1)) {
                                              break L84;
                                            } else {
                                              if (me.field_I >= var3 + var24 * var22 + 32) {
                                                break L84;
                                              } else {
                                                L225: {
                                                  gn.a(15, (byte) 101, 128, var2 - (1 + (-(var23 * var22) - 17)), var24 * var22 + (var3 - -16));
                                                  this.field_i = var21;
                                                  this.field_m = 0;
                                                  if (var26 == 0) {
                                                    break L225;
                                                  } else {
                                                    this.field_m = 8;
                                                    break L225;
                                                  }
                                                }
                                                if (var26 != 0) {
                                                  L226: {
                                                    var19 = var23;
                                                    if (var29 == -1) {
                                                      var18 = tj.a(123, new String[]{rb.field_n[var27]}, kl.field_y);
                                                      break L226;
                                                    } else {
                                                      var18 = vg.field_n;
                                                      break L226;
                                                    }
                                                  }
                                                  var20 = var24;
                                                  break L84;
                                                } else {
                                                  break L84;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    var21++;
                                    var24++;
                                    continue L83;
                                  }
                                }
                              }
                            }
                          } else {
                            so.field_c[var18_int] = var34[var18_int];
                            var18_int++;
                            continue L37;
                          }
                        }
                      } else {
                        var17[var18_int] = so.field_c[var18_int];
                        var18_int++;
                        continue L33;
                      }
                    }
                  } else {
                    var15 = (int)(Math.sqrt((double)(256 - var14 * var14)) * 2.0);
                    de.e(-var15 + (var2 - -32), 64 + (var14 + var3), var15 * 2, 0, 128);
                    var14++;
                    continue L26;
                  }
                }
              } else {
                L227: {
                  if (12 > b.field_f[var14]) {
                    break L227;
                  } else {
                    if (0 != b.field_f[var14] % 12) {
                      break L227;
                    } else {
                      if (b.field_f[11 + var14] != 11 + b.field_f[var14]) {
                        break L227;
                      } else {
                        var13 = b.field_f[var14] / 12 - 1;
                        break L227;
                      }
                    }
                  }
                }
                var14++;
                continue L7;
              }
            }
          } else {
            L228: {
              stackOut_2_0 = this;
              stackIn_4_0 = stackOut_2_0;
              stackIn_3_0 = stackOut_2_0;
              if (this.field_h != var4_int) {
                stackOut_4_0 = this;
                stackOut_4_1 = 0;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                break L228;
              } else {
                stackOut_3_0 = this;
                stackOut_3_1 = 1;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                break L228;
              }
            }
            L229: {
              if (this.a(stackIn_5_1 == 0, 65, (byte) -127, true, 32 + (bi.field_I + 86 * var4_int), 65, uc.field_a + 104)) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                break L229;
              } else {
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                break L229;
              }
            }
            L230: {
              var5 = stackIn_8_0;
              mc.field_a[var4_int].c(86 * var4_int + (32 + bi.field_I), 104 + uc.field_a);
              if (var5 == 0) {
                break L230;
              } else {
                if (-7 == (var4_int ^ -1)) {
                  this.field_m = 7;
                  var6 = -128 + (var4_int * 86 + 32 + bi.field_I);
                  var7 = 103 + (uc.field_a + -16);
                  discarded$61 = mi.field_B.a(nj.field_l, var6, var7 - 1, 192, 192, 0, 0, 1, 0, mi.field_B.field_C);
                  discarded$62 = mi.field_B.a(nj.field_l, var6 + -1, var7, 192, 192, 0, 0, 1, 0, mi.field_B.field_C);
                  discarded$63 = mi.field_B.a(nj.field_l, 1 + var6, var7, 192, 192, 0, 0, 1, 0, mi.field_B.field_C);
                  discarded$64 = mi.field_B.a(nj.field_l, var6, 1 + var7, 192, 192, 0, 0, 1, 0, mi.field_B.field_C);
                  discarded$65 = mi.field_B.a(nj.field_l, var6, var7, 192, 192, 16777215, 0, 1, 0, mi.field_B.field_C);
                  break L230;
                } else {
                  this.field_i = var4_int;
                  this.field_m = 1;
                  break L230;
                }
              }
            }
            var4_int++;
            continue L0;
          }
        }
    }

    private final void a(boolean param0, int param1, boolean param2) {
        fk discarded$1 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_58_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_60_1 = 0;
        int stackIn_64_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_66_1 = 0;
        int stackIn_77_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_79_1 = 0;
        so stackIn_94_0 = null;
        so stackIn_95_0 = null;
        so stackIn_96_0 = null;
        int stackIn_96_1 = 0;
        int stackIn_151_0 = 0;
        so stackIn_160_0 = null;
        so stackIn_161_0 = null;
        so stackIn_162_0 = null;
        int stackIn_162_1 = 0;
        so stackIn_166_0 = null;
        so stackIn_167_0 = null;
        so stackIn_168_0 = null;
        int stackIn_168_1 = 0;
        so stackIn_177_0 = null;
        so stackIn_178_0 = null;
        so stackIn_179_0 = null;
        int stackIn_179_1 = 0;
        so stackIn_190_0 = null;
        so stackIn_191_0 = null;
        so stackIn_192_0 = null;
        int stackIn_192_1 = 0;
        int stackOut_63_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_65_1 = 0;
        int stackOut_64_0 = 0;
        int stackOut_64_1 = 0;
        int stackOut_150_0 = 0;
        int stackOut_149_0 = 0;
        so stackOut_159_0 = null;
        so stackOut_161_0 = null;
        int stackOut_161_1 = 0;
        so stackOut_160_0 = null;
        int stackOut_160_1 = 0;
        so stackOut_189_0 = null;
        so stackOut_191_0 = null;
        int stackOut_191_1 = 0;
        so stackOut_190_0 = null;
        int stackOut_190_1 = 0;
        so stackOut_176_0 = null;
        so stackOut_178_0 = null;
        int stackOut_178_1 = 0;
        so stackOut_177_0 = null;
        int stackOut_177_1 = 0;
        so stackOut_165_0 = null;
        so stackOut_167_0 = null;
        int stackOut_167_1 = 0;
        so stackOut_166_0 = null;
        int stackOut_166_1 = 0;
        so stackOut_93_0 = null;
        so stackOut_95_0 = null;
        int stackOut_95_1 = 0;
        so stackOut_94_0 = null;
        int stackOut_94_1 = 0;
        int stackOut_76_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_78_1 = 0;
        int stackOut_77_0 = 0;
        int stackOut_77_1 = 0;
        int stackOut_57_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_59_1 = 0;
        int stackOut_58_0 = 0;
        int stackOut_58_1 = 0;
        L0: {
          var9 = ArcanistsMulti.field_G ? 1 : 0;
          if (!param2) {
            break L0;
          } else {
            this.a(false, 127, (byte) 126);
            break L0;
          }
        }
        L1: {
          var4 = wl.field_L[this.field_l][param1];
          var6 = var4;
          if ((var6 ^ -1) != -1) {
            if (1 != var6) {
              L2: {
                if (var6 != 2) {
                  if ((var6 ^ -1) == -8) {
                    if (this.field_g.b(true)) {
                      L3: {
                        var6 = param0 ? 1 : 0;
                        stackOut_63_0 = var6;
                        stackIn_65_0 = stackOut_63_0;
                        stackIn_64_0 = stackOut_63_0;
                        if (param2) {
                          stackOut_65_0 = stackIn_65_0;
                          stackOut_65_1 = 0;
                          stackIn_66_0 = stackOut_65_0;
                          stackIn_66_1 = stackOut_65_1;
                          break L3;
                        } else {
                          stackOut_64_0 = stackIn_64_0;
                          stackOut_64_1 = 1;
                          stackIn_66_0 = stackOut_64_0;
                          stackIn_66_1 = stackOut_64_1;
                          break L3;
                        }
                      }
                      gj.a(stackIn_66_0 != 0, stackIn_66_1 != 0, 0, mn.field_r);
                      io.field_A = false;
                      fi.field_h = true;
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    if (var6 == 24) {
                      if (this.field_g.b(true)) {
                        var6 = param0 ? 1 : 0;
                        gj.a(var6 != 0, true, 10, mn.field_r);
                        tn.field_Cb = true;
                        break L1;
                      } else {
                        break L1;
                      }
                    } else {
                      if (var6 != 22) {
                        if (-15 != (var6 ^ -1)) {
                          if (15 == var6) {
                            if (!this.field_g.b(true)) {
                              break L2;
                            } else {
                              L4: {
                                if (lc.a((byte) 112)) {
                                  break L4;
                                } else {
                                  if ((ah.field_c ^ -1) >= -1) {
                                    break L4;
                                  } else {
                                    break L1;
                                  }
                                }
                              }
                              var6 = param0 ? 1 : 0;
                              gj.a(var6 != 0, true, 16, mn.field_r);
                              break L1;
                            }
                          } else {
                            if ((var6 ^ -1) != -6) {
                              if (8 != var6) {
                                if (-5 != (var6 ^ -1)) {
                                  if ((var6 ^ -1) != -28) {
                                    if ((var6 ^ -1) != -29) {
                                      if (20 == var6) {
                                        L5: {
                                          var5 = 0;
                                          if (!this.field_g.a(-13722)) {
                                            break L5;
                                          } else {
                                            if (-1 <= (si.field_l ^ -1)) {
                                              break L5;
                                            } else {
                                              mf.a(0, 21298);
                                              var5 = 1;
                                              break L5;
                                            }
                                          }
                                        }
                                        L6: {
                                          if (!this.field_g.d((byte) 112)) {
                                            break L6;
                                          } else {
                                            if ((si.field_l ^ -1) <= -257) {
                                              break L6;
                                            } else {
                                              var5 = 1;
                                              mf.a(256, 21298);
                                              break L6;
                                            }
                                          }
                                        }
                                        L7: {
                                          if (this.field_g.c((byte) -26)) {
                                            var6 = this.d(41, param1) + (this.a(param1, (byte) 103) + (ff.field_c - 120)) >> -2113586175;
                                            var7 = -var6 + an.field_g;
                                            var8 = var7 * 256 / 120;
                                            var5 = 1;
                                            if (0 >= var8) {
                                              mf.a(0, 21298);
                                              break L7;
                                            } else {
                                              if (256 > var8) {
                                                mf.a(var8, 21298);
                                                break L7;
                                              } else {
                                                mf.a(256, 21298);
                                                break L7;
                                              }
                                            }
                                          } else {
                                            break L7;
                                          }
                                        }
                                        L8: {
                                          if (!this.field_g.b((byte) -40)) {
                                            break L8;
                                          } else {
                                            if (-1 > (si.field_l ^ -1)) {
                                              var5 = 1;
                                              ob.j((byte) -109);
                                              break L8;
                                            } else {
                                              break L8;
                                            }
                                          }
                                        }
                                        L9: {
                                          if (!this.field_g.b(-65)) {
                                            break L9;
                                          } else {
                                            if (-257 < (si.field_l ^ -1)) {
                                              var5 = 1;
                                              s.a(false);
                                              break L9;
                                            } else {
                                              break L9;
                                            }
                                          }
                                        }
                                        if (var5 != 0) {
                                          L10: {
                                            if (!this.field_g.c((byte) -102)) {
                                              break L10;
                                            } else {
                                              if (oj.field_e >= jb.field_v) {
                                                break L2;
                                              } else {
                                                break L10;
                                              }
                                            }
                                          }
                                          L11: {
                                            if (null != cf.field_h[nn.field_n[0][2]]) {
                                              discarded$1 = ti.a((byte) -30, to.field_r[nn.field_n[0][2]], cf.field_h[nn.field_n[0][2]]);
                                              break L11;
                                            } else {
                                              break L11;
                                            }
                                          }
                                          oj.field_e = 20 + jb.field_v;
                                          break L1;
                                        } else {
                                          break L1;
                                        }
                                      } else {
                                        if (-22 != (var6 ^ -1)) {
                                          if ((var6 ^ -1) == -7) {
                                            if (!this.field_g.b(true)) {
                                              break L2;
                                            } else {
                                              L12: {
                                                if (param2) {
                                                  stackOut_150_0 = 0;
                                                  stackIn_151_0 = stackOut_150_0;
                                                  break L12;
                                                } else {
                                                  stackOut_149_0 = 1;
                                                  stackIn_151_0 = stackOut_149_0;
                                                  break L12;
                                                }
                                              }
                                              wl.f(stackIn_151_0 != 0);
                                              break L1;
                                            }
                                          } else {
                                            if (var6 != 9) {
                                              if (var6 == 10) {
                                                if (this.field_g.b(true)) {
                                                  jb.field_z.a(true);
                                                  var6 = param0 ? 1 : 0;
                                                  gj.a(var6 != 0, true, -1, mn.field_r);
                                                  break L1;
                                                } else {
                                                  break L1;
                                                }
                                              } else {
                                                if (-12 != (var6 ^ -1)) {
                                                  if (-13 == (var6 ^ -1)) {
                                                    L13: {
                                                      stackOut_159_0 = this.field_g;
                                                      stackIn_161_0 = stackOut_159_0;
                                                      stackIn_160_0 = stackOut_159_0;
                                                      if (param2) {
                                                        stackOut_161_0 = (so) ((Object) stackIn_161_0);
                                                        stackOut_161_1 = 0;
                                                        stackIn_162_0 = stackOut_161_0;
                                                        stackIn_162_1 = stackOut_161_1;
                                                        break L13;
                                                      } else {
                                                        stackOut_160_0 = (so) ((Object) stackIn_160_0);
                                                        stackOut_160_1 = 1;
                                                        stackIn_162_0 = stackOut_160_0;
                                                        stackIn_162_1 = stackOut_160_1;
                                                        break L13;
                                                      }
                                                    }
                                                    if (((so) (Object) stackIn_162_0).b(stackIn_162_1 != 0)) {
                                                      jb.field_z.g((byte) -61);
                                                      var6 = param0 ? 1 : 0;
                                                      gj.a(var6 != 0, true, -1, mn.field_r);
                                                      break L1;
                                                    } else {
                                                      break L1;
                                                    }
                                                  } else {
                                                    if (var6 != 13) {
                                                      if (-18 == (var6 ^ -1)) {
                                                        if (!this.field_g.b(true)) {
                                                          break L2;
                                                        } else {
                                                          ie.field_Sb = 0;
                                                          break L1;
                                                        }
                                                      } else {
                                                        if (var6 != 18) {
                                                          if (var6 != 23) {
                                                            if (var6 == 25) {
                                                              L14: {
                                                                stackOut_189_0 = this.field_g;
                                                                stackIn_191_0 = stackOut_189_0;
                                                                stackIn_190_0 = stackOut_189_0;
                                                                if (param2) {
                                                                  stackOut_191_0 = (so) ((Object) stackIn_191_0);
                                                                  stackOut_191_1 = 0;
                                                                  stackIn_192_0 = stackOut_191_0;
                                                                  stackIn_192_1 = stackOut_191_1;
                                                                  break L14;
                                                                } else {
                                                                  stackOut_190_0 = (so) ((Object) stackIn_190_0);
                                                                  stackOut_190_1 = 1;
                                                                  stackIn_192_0 = stackOut_190_0;
                                                                  stackIn_192_1 = stackOut_190_1;
                                                                  break L14;
                                                                }
                                                              }
                                                              if (((so) (Object) stackIn_192_0).b(stackIn_192_1 == 0)) {
                                                                break L2;
                                                              } else {
                                                                if (this.a((byte) -46, param1)) {
                                                                  L15: {
                                                                    if (si.field_g == 8) {
                                                                      vn.field_g = vn.field_g - 1;
                                                                      if (0 <= vn.field_g) {
                                                                        break L15;
                                                                      } else {
                                                                        vn.field_g = 3;
                                                                        break L15;
                                                                      }
                                                                    } else {
                                                                      break L15;
                                                                    }
                                                                  }
                                                                  L16: {
                                                                    if (si.field_g != 7) {
                                                                      break L16;
                                                                    } else {
                                                                      fh.field_e = fh.field_e - 1;
                                                                      break L16;
                                                                    }
                                                                  }
                                                                  if (14 != si.field_g) {
                                                                    break L2;
                                                                  } else {
                                                                    L17: {
                                                                      var6 = -1 + mj.field_p;
                                                                      if (-1 <= (var6 ^ -1)) {
                                                                        var6 = 0;
                                                                        if (!param0) {
                                                                          this.field_g.field_h = 1;
                                                                          break L17;
                                                                        } else {
                                                                          break L17;
                                                                        }
                                                                      } else {
                                                                        break L17;
                                                                      }
                                                                    }
                                                                    df.a((byte) 120, var6);
                                                                    break L1;
                                                                  }
                                                                } else {
                                                                  break L1;
                                                                }
                                                              }
                                                            } else {
                                                              if (26 == var6) {
                                                                if (!this.field_g.b(true)) {
                                                                  break L2;
                                                                } else {
                                                                  if (!this.a((byte) -46, param1)) {
                                                                    break L2;
                                                                  } else {
                                                                    L18: {
                                                                      if (si.field_g == 8) {
                                                                        vn.field_g = vn.field_g + 1;
                                                                        if ((vn.field_g ^ -1) < -4) {
                                                                          vn.field_g = 0;
                                                                          break L18;
                                                                        } else {
                                                                          break L18;
                                                                        }
                                                                      } else {
                                                                        break L18;
                                                                      }
                                                                    }
                                                                    L19: {
                                                                      if (si.field_g == 7) {
                                                                        fh.field_e = fh.field_e + 1;
                                                                        break L19;
                                                                      } else {
                                                                        break L19;
                                                                      }
                                                                    }
                                                                    if (14 != si.field_g) {
                                                                      break L2;
                                                                    } else {
                                                                      L20: {
                                                                        var6 = 1 + mj.field_p;
                                                                        if ((var6 ^ -1) > -8) {
                                                                          break L20;
                                                                        } else {
                                                                          var6 = 7;
                                                                          if (param0) {
                                                                            break L20;
                                                                          } else {
                                                                            this.field_g.field_h = 0;
                                                                            break L20;
                                                                          }
                                                                        }
                                                                      }
                                                                      df.a((byte) -127, var6);
                                                                      break L1;
                                                                    }
                                                                  }
                                                                }
                                                              } else {
                                                                if (var6 == 19) {
                                                                  if (!this.field_g.b(true)) {
                                                                    break L2;
                                                                  } else {
                                                                    im.a((byte) 79, cd.e(120));
                                                                    break L1;
                                                                  }
                                                                } else {
                                                                  if (30 == var6) {
                                                                    if (this.field_g.b(true)) {
                                                                      df.a((byte) 89, 7);
                                                                      break L1;
                                                                    } else {
                                                                      break L1;
                                                                    }
                                                                  } else {
                                                                    if ((var6 ^ -1) == -30) {
                                                                      if (this.field_g.b(true)) {
                                                                        var6 = param0 ? 1 : 0;
                                                                        gj.a(var6 != 0, true, -1, mn.field_r);
                                                                        break L2;
                                                                      } else {
                                                                        break L1;
                                                                      }
                                                                    } else {
                                                                      break L1;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            if (!this.field_g.b(true)) {
                                                              break L2;
                                                            } else {
                                                              L21: {
                                                                if (-9 == (this.field_l ^ -1)) {
                                                                  break L21;
                                                                } else {
                                                                  if (-7 != (si.field_g ^ -1)) {
                                                                    if (10 != this.field_l) {
                                                                      break L2;
                                                                    } else {
                                                                      ko.a(cd.e(103), (byte) -60);
                                                                      break L1;
                                                                    }
                                                                  } else {
                                                                    break L21;
                                                                  }
                                                                }
                                                              }
                                                              ul.a(ud.field_o, (byte) 45, this.field_l);
                                                              break L1;
                                                            }
                                                          }
                                                        } else {
                                                          L22: {
                                                            stackOut_176_0 = this.field_g;
                                                            stackIn_178_0 = stackOut_176_0;
                                                            stackIn_177_0 = stackOut_176_0;
                                                            if (param2) {
                                                              stackOut_178_0 = (so) ((Object) stackIn_178_0);
                                                              stackOut_178_1 = 0;
                                                              stackIn_179_0 = stackOut_178_0;
                                                              stackIn_179_1 = stackOut_178_1;
                                                              break L22;
                                                            } else {
                                                              stackOut_177_0 = (so) ((Object) stackIn_177_0);
                                                              stackOut_177_1 = 1;
                                                              stackIn_179_0 = stackOut_177_0;
                                                              stackIn_179_1 = stackOut_177_1;
                                                              break L22;
                                                            }
                                                          }
                                                          if (((so) (Object) stackIn_179_0).b(stackIn_179_1 != 0)) {
                                                            ie.field_Sb = 1;
                                                            break L1;
                                                          } else {
                                                            break L1;
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      L23: {
                                                        stackOut_165_0 = this.field_g;
                                                        stackIn_167_0 = stackOut_165_0;
                                                        stackIn_166_0 = stackOut_165_0;
                                                        if (param2) {
                                                          stackOut_167_0 = (so) ((Object) stackIn_167_0);
                                                          stackOut_167_1 = 0;
                                                          stackIn_168_0 = stackOut_167_0;
                                                          stackIn_168_1 = stackOut_167_1;
                                                          break L23;
                                                        } else {
                                                          stackOut_166_0 = (so) ((Object) stackIn_166_0);
                                                          stackOut_166_1 = 1;
                                                          stackIn_168_0 = stackOut_166_0;
                                                          stackIn_168_1 = stackOut_166_1;
                                                          break L23;
                                                        }
                                                      }
                                                      if (((so) (Object) stackIn_168_0).b(stackIn_168_1 == 0)) {
                                                        break L2;
                                                      } else {
                                                        L24: {
                                                          if (!hi.field_a) {
                                                            break L24;
                                                          } else {
                                                            var6 = param0 ? 1 : 0;
                                                            gj.a(var6 != 0, true, -5, mn.field_r);
                                                            break L24;
                                                          }
                                                        }
                                                        L25: {
                                                          if (!mj.field_w) {
                                                            break L25;
                                                          } else {
                                                            qe.a(0, (byte) -35, 11);
                                                            break L25;
                                                          }
                                                        }
                                                        fi.field_h = true;
                                                        break L1;
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  if (!this.field_g.b(true)) {
                                                    break L2;
                                                  } else {
                                                    jb.field_z.p(26873);
                                                    var6 = param0 ? 1 : 0;
                                                    gj.a(var6 != 0, true, -1, mn.field_r);
                                                    break L1;
                                                  }
                                                }
                                              }
                                            } else {
                                              if (!this.field_g.b(true)) {
                                                break L2;
                                              } else {
                                                jb.field_z.a(-111, param0);
                                                fi.field_h = true;
                                                io.field_A = false;
                                                break L1;
                                              }
                                            }
                                          }
                                        } else {
                                          L26: {
                                            if (!this.field_g.a(-13722)) {
                                              break L26;
                                            } else {
                                              eb.a(0, false);
                                              break L26;
                                            }
                                          }
                                          L27: {
                                            if (!this.field_g.d((byte) 125)) {
                                              break L27;
                                            } else {
                                              eb.a(256, false);
                                              break L27;
                                            }
                                          }
                                          L28: {
                                            if (!this.field_g.c((byte) 85)) {
                                              break L28;
                                            } else {
                                              var6 = -120 + this.d(41, param1) - (-this.a(param1, (byte) 103) - ff.field_c) >> -741220799;
                                              var7 = -var6 + an.field_g;
                                              var8 = 256 * var7 / 120;
                                              if (-1 > (var8 ^ -1)) {
                                                if (var8 >= 256) {
                                                  eb.a(256, false);
                                                  break L28;
                                                } else {
                                                  eb.a(var8, false);
                                                  break L28;
                                                }
                                              } else {
                                                eb.a(0, param2);
                                                break L28;
                                              }
                                            }
                                          }
                                          L29: {
                                            if (this.field_g.b((byte) -40)) {
                                              jm.b(60);
                                              break L29;
                                            } else {
                                              break L29;
                                            }
                                          }
                                          if (this.field_g.b(-74)) {
                                            ck.a((byte) 115);
                                            break L1;
                                          } else {
                                            break L1;
                                          }
                                        }
                                      }
                                    } else {
                                      if (this.field_g.b(true)) {
                                        var6 = param0 ? 1 : 0;
                                        gj.a(var6 != 0, true, 12, mn.field_r);
                                        break L1;
                                      } else {
                                        break L1;
                                      }
                                    }
                                  } else {
                                    L30: {
                                      stackOut_93_0 = this.field_g;
                                      stackIn_95_0 = stackOut_93_0;
                                      stackIn_94_0 = stackOut_93_0;
                                      if (param2) {
                                        stackOut_95_0 = (so) ((Object) stackIn_95_0);
                                        stackOut_95_1 = 0;
                                        stackIn_96_0 = stackOut_95_0;
                                        stackIn_96_1 = stackOut_95_1;
                                        break L30;
                                      } else {
                                        stackOut_94_0 = (so) ((Object) stackIn_94_0);
                                        stackOut_94_1 = 1;
                                        stackIn_96_0 = stackOut_94_0;
                                        stackIn_96_1 = stackOut_94_1;
                                        break L30;
                                      }
                                    }
                                    if (((so) (Object) stackIn_96_0).b(stackIn_96_1 == 0)) {
                                      break L2;
                                    } else {
                                      var6 = param0 ? 1 : 0;
                                      gj.a(var6 != 0, true, 11, mn.field_r);
                                      break L1;
                                    }
                                  }
                                } else {
                                  if (!this.field_g.b(true)) {
                                    break L2;
                                  } else {
                                    var6 = param0 ? 1 : 0;
                                    gj.a(var6 != 0, true, 6, mn.field_r);
                                    break L1;
                                  }
                                }
                              } else {
                                if (this.field_g.b(true)) {
                                  var6 = th.field_f;
                                  var7 = param0 ? 1 : 0;
                                  gj.a(var7 != 0, true, var6, mn.field_r);
                                  break L1;
                                } else {
                                  break L1;
                                }
                              }
                            } else {
                              if (this.field_g.b(true)) {
                                fh.field_e = 0;
                                var6 = param0 ? 1 : 0;
                                gj.a(var6 != 0, true, 7, mn.field_r);
                                break L1;
                              } else {
                                break L1;
                              }
                            }
                          }
                        } else {
                          if (this.field_g.b(true)) {
                            L31: {
                              var6 = param0 ? 1 : 0;
                              stackOut_76_0 = var6;
                              stackIn_78_0 = stackOut_76_0;
                              stackIn_77_0 = stackOut_76_0;
                              if (param2) {
                                stackOut_78_0 = stackIn_78_0;
                                stackOut_78_1 = 0;
                                stackIn_79_0 = stackOut_78_0;
                                stackIn_79_1 = stackOut_78_1;
                                break L31;
                              } else {
                                stackOut_77_0 = stackIn_77_0;
                                stackOut_77_1 = 1;
                                stackIn_79_0 = stackOut_77_0;
                                stackIn_79_1 = stackOut_77_1;
                                break L31;
                              }
                            }
                            gj.a(stackIn_79_0 != 0, stackIn_79_1 != 0, 15, mn.field_r);
                            break L1;
                          } else {
                            break L1;
                          }
                        }
                      } else {
                        if (this.field_g.b(true)) {
                          var6 = param0 ? 1 : 0;
                          gj.a(var6 != 0, true, 8, mn.field_r);
                          if (param0) {
                            break L2;
                          } else {
                            this.field_g.field_h = 1;
                            break L1;
                          }
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                } else {
                  if (!this.field_g.b(true)) {
                    break L2;
                  } else {
                    L32: {
                      var6 = param0 ? 1 : 0;
                      stackOut_57_0 = var6;
                      stackIn_59_0 = stackOut_57_0;
                      stackIn_58_0 = stackOut_57_0;
                      if (param2) {
                        stackOut_59_0 = stackIn_59_0;
                        stackOut_59_1 = 0;
                        stackIn_60_0 = stackOut_59_0;
                        stackIn_60_1 = stackOut_59_1;
                        break L32;
                      } else {
                        stackOut_58_0 = stackIn_58_0;
                        stackOut_58_1 = 1;
                        stackIn_60_0 = stackOut_58_0;
                        stackIn_60_1 = stackOut_58_1;
                        break L32;
                      }
                    }
                    gj.a(stackIn_60_0 != 0, stackIn_60_1 != 0, -1, mn.field_r);
                    break L1;
                  }
                }
              }
              break L1;
            } else {
              if (this.field_g.b(true)) {
                if (lc.a((byte) 112)) {
                  ke.a(wd.field_h, param0, mi.field_B, 1, ve.field_t, 0, an.field_j / 2, 16, mi.field_B.field_o, 10, an.field_f / 2, ud.field_o, true, mi.field_B.field_o - -mi.field_B.field_m, -21071);
                  break L1;
                } else {
                  var6 = param0 ? 1 : 0;
                  gj.a(var6 != 0, true, -4, mn.field_r);
                  break L1;
                }
              } else {
                break L1;
              }
            }
          } else {
            if (this.field_g.b(true)) {
              var6 = param0 ? 1 : 0;
              gj.a(var6 != 0, true, -3, mn.field_r);
              break L1;
            } else {
              break L1;
            }
          }
        }
    }

    private final void a(int param0) {
        int discarded$4 = 0;
        int discarded$5 = 0;
        int discarded$6 = 0;
        int discarded$7 = 0;
        Object var2 = null;
        Object var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = ArcanistsMulti.field_G ? 1 : 0;
          var2 = null;
          var3 = null;
          var4 = -32 + 3 * uc.field_a / 4 - -240;
          fe.field_o.c(-(fe.field_o.field_n / 2) + (an.field_f >> -270906271), -(fe.field_o.field_w / 2) + -20 + var4);
          var5 = (an.field_f >> 204869921) + -120;
          if (mj.field_p != 0) {
            break L0;
          } else {
            var2 = aj.field_f;
            var3 = jo.field_d;
            bb.field_g[0].c(var5 + -28, -48 + var4);
            break L0;
          }
        }
        L1: {
          if (param0 != mj.field_p) {
            break L1;
          } else {
            var2 = rj.field_d;
            var3 = gm.field_b;
            bb.field_g[1].c(var5 + -28, -32 + var4);
            break L1;
          }
        }
        L2: {
          if ((mj.field_p ^ -1) != -3) {
            break L2;
          } else {
            var3 = pc.field_f;
            var2 = mg.field_F;
            bb.field_g[72].c(-28 + var5, -48 + var4);
            break L2;
          }
        }
        L3: {
          if (3 == mj.field_p) {
            var3 = gi.field_h;
            var2 = hn.field_c;
            bb.field_g[4].c(var5 + -28, var4);
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if ((mj.field_p ^ -1) == -5) {
            var2 = gj.field_b;
            var3 = lm.field_h;
            bb.field_g[76].c(-28 + var5, -32 + var4);
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (mj.field_p != 5) {
            break L5;
          } else {
            var3 = bj.field_pb;
            var2 = ih.field_a;
            bb.field_g[75].c(-28 + var5, var4 + -48);
            break L5;
          }
        }
        L6: {
          if (mj.field_p == 6) {
            var2 = gn.field_j;
            jb.field_z.field_z = 6050;
            var3 = na.field_lc;
            bb.field_g[0].c(var5 - 48, var4);
            bb.field_g[1].c(-8 + var5, var4);
            gb.field_c[5].a(var5 + -(gb.field_c[0].field_g / 2) - 4, -80 + var4);
            gb.field_c[4].a(-4 + (var5 + -(gb.field_c[0].field_g / 2)), -80 + var4);
            gb.field_c[3].a(-(gb.field_c[0].field_g / 2) + (var5 + -4), var4 - 80);
            gb.field_c[2].a(-4 + (var5 - gb.field_c[0].field_g / 2), -80 + var4);
            gb.field_c[1].a(var5 - gb.field_c[0].field_g / 2 + -4, var4 - 80);
            gb.field_c[0].a(-(gb.field_c[0].field_g / 2) + var5 - 16, var4 + -80);
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          if (7 != mj.field_p) {
            break L7;
          } else {
            var3 = kj.field_d;
            var2 = bm.field_c;
            var6 = 0;
            var7 = 0;
            L8: while (true) {
              if (-5 >= (var7 ^ -1)) {
                break L7;
              } else {
                var8 = 0;
                L9: while (true) {
                  if (4 <= var8) {
                    var7++;
                    continue L8;
                  } else {
                    L10: {
                      if (0 != (b.field_f[var6] ^ -1)) {
                        bb.field_g[dd.field_f[b.field_f[var6]]].c((-2 + var7) * 40 + var5 - 8, -30 + (var4 + (var8 + -2) * 40));
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    var6++;
                    var8++;
                    continue L9;
                  }
                }
              }
            }
          }
        }
        L11: {
          var6 = var4 + -144;
          if (var2 == null) {
            break L11;
          } else {
            discarded$4 = tj.field_t.a((String) (var2), (an.field_f >> -804725599) + -233, var6, 208, 288, 13158, 13158, 1, 0, tj.field_t.field_C - -tj.field_t.field_m);
            discarded$5 = tj.field_t.a((String) (var2), -232 - -(an.field_f >> 1506256577), var6 + -1, 208, 288, 13158, 13158, 1, 0, tj.field_t.field_m + tj.field_t.field_C);
            discarded$6 = tj.field_t.a((String) (var2), (an.field_f >> -985018495) + -232, var6, 208, 288, 12569299, -1, 1, 0, tj.field_t.field_m + tj.field_t.field_C);
            break L11;
          }
        }
        L12: {
          if (var3 != null) {
            discarded$7 = mi.field_B.a((String) (var3), 16 + (an.field_f >> -781556319) + 8, var6, 224, 288, 0, -1, 1, 0, mi.field_B.field_m + mi.field_B.field_C);
            break L12;
          } else {
            break L12;
          }
        }
    }

    private final void e(boolean param0) {
        int discarded$2 = 0;
        int discarded$3 = 0;
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
        int var18 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int[] var25 = null;
        boolean[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        String[] var29 = null;
        String[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        qb stackIn_21_0 = null;
        int stackIn_44_0 = 0;
        int stackIn_51_0 = 0;
        qb stackOut_20_0 = null;
        qb stackOut_19_0 = null;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_49_0 = 0;
        L0: {
          var24 = ArcanistsMulti.field_G ? 1 : 0;
          var26 = new boolean[]{false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, true, true, true, true, true, true, true, false, true, false, true, true, true, false, true, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false, false, false, false, false, false, false, false, false, true, true, false, false, false, false, false, false, true, true, true, true, false, true, false, true, false, false, false, true, true, true, param0, true, true, true, false, false, false};
          if (lk.a(0, (byte) -116)) {
            var26[55] = false;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var3 = new int[][][]{new int[][]{new int[]{13, 14}, new int[]{0, 2, 4}, new int[]{1, 3, 5}, new int[]{31, 47}, new int[]{49, 51, 53}, new int[]{50, 52}}, new int[][]{new int[]{46, 56, 87}, new int[]{43, 36, 37, 38, 35}, new int[]{57, 58, 59, 60, 61, 45}, new int[]{41, 44, 12, 72, 73}, new int[]{26, 27, 28, 29}, new int[]{48, 55}}, new int[][]{new int[]{54, 80}, new int[]{6, 7, 8, 9, 10, 11}, new int[]{16, 17, 32}, new int[]{18, 19, 20, 21, 23, 22}, new int[]{24, 25, 33}, new int[]{30}}, new int[][]{new int[]{42, 34, 40, 39, 15}, new int[]{62, 71, 79, 82, 86, 88}, new int[]{65, 66, 67, 69, 85, 92}, new int[]{63, 64, 68, 70, 94, 84}, new int[]{74, 78, 83, 81, 93, 89}, new int[]{91}}};
          var31 = ad.field_f;
          var27 = var31;
          var4 = var27;
          if (2 <= var31.length) {
            break L1;
          } else {
            var32 = new int[2];
            var28 = var32;
            var25 = var28;
            var4 = var25;
            var25[0] = ad.field_f[0];
            var32[1] = 0;
            break L1;
          }
        }
        L2: {
          var5 = lk.a(0, (byte) -33) ? 1 : 0;
          if ((65536 & var4[1] ^ -1) != -1) {
            if (var5 != 0) {
              break L2;
            } else {
              if ((8388608 & var4[1] ^ -1) == -1) {
                var3[1][5] = new int[]{48};
                break L2;
              } else {
                break L2;
              }
            }
          } else {
            var3[1][5] = new int[]{55};
            if (var5 != 0) {
              break L2;
            } else {
              if ((8388608 & var4[1]) != 0) {
                break L2;
              } else {
                var3[1][5] = new int[]{};
                break L2;
              }
            }
          }
        }
        L3: {
          if ((134217728 & var4[2] ^ -1) != -1) {
            break L3;
          } else {
            var3[3] = new int[][]{var3[3][0], var3[3][1], var3[3][2], var3[3][3], var3[3][4]};
            break L3;
          }
        }
        L4: {
          if (-1 == (8388608 & var4[2] ^ -1)) {
            var3[1][0] = new int[]{46, 56};
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          var6 = 80;
          var7 = 100;
          if (ArcanistsMulti.i((byte) -127)) {
            stackOut_20_0 = ii.field_d;
            stackIn_21_0 = stackOut_20_0;
            break L5;
          } else {
            stackOut_19_0 = vd.field_b;
            stackIn_21_0 = stackOut_19_0;
            break L5;
          }
        }
        var8 = stackIn_21_0;
        var9 = 60;
        var10 = 280;
        var11 = 60;
        var12 = 220;
        var13 = dd.field_g;
        dd.field_g = -1;
        var14 = vn.field_g;
        var15 = 0;
        L6: while (true) {
          if (var3[var14].length <= var15) {
            L7: {
              if (-1 != ke.field_K) {
                stackOut_43_0 = ke.field_K;
                stackIn_44_0 = stackOut_43_0;
                break L7;
              } else {
                stackOut_42_0 = dd.field_g;
                stackIn_44_0 = stackOut_42_0;
                break L7;
              }
            }
            L8: {
              L9: {
                var15 = stackIn_44_0;
                if (-1 != var15) {
                  L10: {
                    var16 = tj.field_t.field_o + tj.field_t.field_m;
                    mi.field_B.b(rb.field_n[var15], 447 + bi.field_I, uc.field_a + 126, 0, -1);
                    if (-1 == (var4[var15 >> -1047223579] & 1 << (31 & var15) ^ -1)) {
                      stackOut_50_0 = 0;
                      stackIn_51_0 = stackOut_50_0;
                      break L10;
                    } else {
                      stackOut_49_0 = 1;
                      stackIn_51_0 = stackOut_49_0;
                      break L10;
                    }
                  }
                  L11: {
                    var17 = stackIn_51_0;
                    if (var17 != 0) {
                      mi.field_B.b(rk.field_H, bi.field_I - -447, -8 + uc.field_a + (126 + var16), 0, -1);
                      break L11;
                    } else {
                      mi.field_B.b(ld.field_l, bi.field_I + 447, var16 + uc.field_a - -118, 16711680, -1);
                      break L11;
                    }
                  }
                  L12: {
                    var18 = 126 - -var16;
                    if (var17 != 0) {
                      mo.field_a[var15].c(340 + bi.field_I, var18 + uc.field_a);
                      break L12;
                    } else {
                      vd.field_b.c(340 + bi.field_I, var18 + uc.field_a);
                      break L12;
                    }
                  }
                  L13: {
                    var18 = var18 + tj.field_t.field_C;
                    var18 = var18 + tj.field_t.field_C;
                    if (var17 != 0) {
                      break L13;
                    } else {
                      if (var26[var15]) {
                        var30 = new String[16];
                        var20 = mi.field_B.a(wk.field_k, new int[]{220}, var30);
                        var21 = 0;
                        L14: while (true) {
                          if (var20 <= var21) {
                            break L9;
                          } else {
                            mi.field_B.a(var30[var21], 12 + (340 + bi.field_I), 95 + uc.field_a - -var18, 0, -1);
                            var18 = var18 + mi.field_B.field_C;
                            var21++;
                            continue L14;
                          }
                        }
                      } else {
                        break L13;
                      }
                    }
                  }
                  var29 = new String[16];
                  var20 = mi.field_B.a(af.field_Bb[var15], new int[]{220}, var29);
                  var21 = 0;
                  L15: while (true) {
                    if (var20 <= var21) {
                      L16: {
                        mi.field_B.b(lo.field_x, bi.field_I - -530, uc.field_a + 170, 0, -1);
                        mi.field_B.b("" + 100 * eh.field_g[var15], bi.field_I + 530, 185 + uc.field_a, 0, -1);
                        mi.field_B.b(uk.field_c, 530 + bi.field_I, uc.field_a + 220, 0, -1);
                        var21 = 514;
                        var22 = 224;
                        if (10 == eh.field_g[var15]) {
                          var21 -= 24;
                          break L16;
                        } else {
                          break L16;
                        }
                      }
                      var23 = 0;
                      L17: while (true) {
                        L18: {
                          if (var23 >= eh.field_g[var15]) {
                            break L18;
                          } else {
                            L19: {
                              ih.field_e.c(var21 + bi.field_I, var22 + uc.field_a);
                              if (eh.field_g[var15] != 10) {
                                break L19;
                              } else {
                                ih.field_e.c(var21 + bi.field_I - -32, uc.field_a + var22);
                                break L19;
                              }
                            }
                            L20: {
                              var21 -= 8;
                              if (0 != var23 % 3) {
                                break L20;
                              } else {
                                var21 += 16;
                                break L20;
                              }
                            }
                            var22 += 8;
                            if (var23 == 4) {
                              break L18;
                            } else {
                              var23++;
                              continue L17;
                            }
                          }
                        }
                        break L9;
                      }
                    } else {
                      mi.field_B.a(var29[var21], 340 + (bi.field_I - -12), -8 + (uc.field_a + var18) - -120, 0, -1);
                      var18 = var18 + mi.field_B.field_C;
                      var21++;
                      continue L15;
                    }
                  }
                } else {
                  discarded$2 = mi.field_B.a(qo.field_c, -16 + (bi.field_I - -320) - -50, 134 + uc.field_a, 200, 64, 0, -1, 1, 1, mi.field_B.field_C);
                  if (lc.a((byte) 112)) {
                    discarded$3 = mi.field_B.a(hg.field_c, -16 + (50 + bi.field_I) + 320, -16 + (250 + uc.field_a), 200, 64, 0, -1, 1, 1, mi.field_B.field_C);
                    break L9;
                  } else {
                    mi.field_B.a(var14 + 1 + "/" + 4, bi.field_I + 285, uc.field_a - -325, 0, -1);
                    break L8;
                  }
                }
              }
              mi.field_B.a(var14 + 1 + "/" + 4, bi.field_I + 285, uc.field_a - -325, 0, -1);
              break L8;
            }
            return;
          } else {
            var7 = var9 - (-(var10 * (1 + var15) / (var3[var14].length - -1)) - uc.field_a);
            var16 = 0;
            L21: while (true) {
              if (var3[var14][var15].length <= var16) {
                var15++;
                continue L6;
              } else {
                L22: {
                  var17 = var3[var14][var15][var16];
                  var6 = bi.field_I + var11 + var12 * (1 + var16) / (1 + var3[var14][var15].length);
                  if (mi.a(32, var7, 32, -8, var6)) {
                    dd.field_g = var17;
                    break L22;
                  } else {
                    break L22;
                  }
                }
                L23: {
                  if (0 != (var4[var17 >> -1553004731] & 1 << (var17 & 31))) {
                    if ((var17 ^ -1) == (ke.field_K ^ -1)) {
                      mo.field_a[var17].f(2 + var6, -2 + var7);
                      break L23;
                    } else {
                      if (var17 != var13) {
                        mo.field_a[var17].f(var6, var7);
                        break L23;
                      } else {
                        mo.field_a[var17].f(1 + var6, var7 + -1);
                        break L23;
                      }
                    }
                  } else {
                    if ((var17 ^ -1) == (ke.field_K ^ -1)) {
                      var8.f(var6 - -2, var7 - 2);
                      break L23;
                    } else {
                      if (var17 != var13) {
                        var8.f(var6, var7);
                        break L23;
                      } else {
                        var8.f(var6 + 1, var7 - 1);
                        break L23;
                      }
                    }
                  }
                }
                var16++;
                continue L21;
              }
            }
          }
        }
    }

    private final void a(int param0, int param1, byte param2, int param3) {
        de.a(param1 + -4, param0 + -4, 248, 127, 0);
        de.a(param1 - 3, -3 + param0, 246, 125, 8547138);
        if (param2 > -27) {
            this.field_f = 0.4045710406434804;
        }
        de.a(-2 + param1, param0 - 2, 244, 123, 11833896);
        de.a(param1 + -1, param0 + -1, 242, 121, 0);
        de.c(param1, param0, 240, 119, wm.a(param3, (byte) -122), ng.b((byte) -37, param3));
        if (e.field_M[param3] != null) {
            e.field_M[param3].c(param1, param0);
        } else {
            ue.field_d.field_f = 0;
            e.field_M[param3] = af.a(tj.a(-46, new String[]{Integer.toString(param3)}, "background<%0>"), "", 19412, ue.field_d);
            e.field_M[param3].c(param1, param0);
            e.field_M[param3] = null;
        }
    }

    private final void c(int param0) {
        int discarded$7 = 0;
        int discarded$8 = 0;
        int discarded$9 = 0;
        int discarded$10 = 0;
        int discarded$11 = 0;
        int discarded$12 = 0;
        int discarded$13 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        if (!ArcanistsMulti.i((byte) -73)) {
          L0: {
            var2 = 80;
            if (gm.field_f == 3) {
              var2 += 20;
              break L0;
            } else {
              break L0;
            }
          }
          var3 = an.field_f - var2;
          de.a(-3 + var3, 3, var2, 48, 0);
          de.a(var3 - 2, 2, var2, 48, 6837813);
          de.a(-1 + var3, 1, var2, 48, 8547138);
          de.a(var3, 0, var2, 48, 11768360);
          de.d(1 + var3, -1, var2, 48, 0);
          var4 = jf.field_j + -ua.field_P;
          if (param0 == -26733) {
            L1: {
              if (-6 < (var4 ^ -1)) {
                if (0 < var4) {
                  L2: {
                    if (4 != (4 & var4)) {
                      break L2;
                    } else {
                      tg.field_b[7].a(10 + (var3 - 5), 6);
                      tg.field_b[7].a(15 + var3, 6);
                      tg.field_b[7].a(-3 + (10 + var3), 10);
                      tg.field_b[7].a(3 + (var3 + 10), 10);
                      break L2;
                    }
                  }
                  L3: {
                    if (-3 == (var4 & 2 ^ -1)) {
                      tg.field_b[7].a(10 + (var3 + -5), 8);
                      tg.field_b[7].a(var3 + 15, 8);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if ((var4 & 1) == 1) {
                      tg.field_b[7].a(var3 - -10, 8);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  if (ad.field_d <= 0) {
                    if ((ad.field_d ^ -1) >= -1) {
                      discarded$7 = mi.field_B.a(mh.field_I + var4, var3 + 25, 4, var2 - 30, 44, 16777215, -1, 1, 1, 14);
                      break L1;
                    } else {
                      rb.field_o[-1 + ad.field_d].d(var3 - -23, -(rb.field_o[ad.field_d - 1].field_y / 2) + -rb.field_o[ad.field_d - 1].field_o + 33, 16711680);
                      discarded$8 = mi.field_B.a(mh.field_I + var4, var3 - -23, 4, -30 + var2, 44, 16777215, -1, 2, 1, 14);
                      break L1;
                    }
                  } else {
                    rb.field_o[-1 + ad.field_d].d(var3 + 23, -(rb.field_o[-1 + ad.field_d].field_y / 2) + (-rb.field_o[-1 + ad.field_d].field_o + 33), 16711680);
                    discarded$9 = mi.field_B.a(mh.field_I + var4, var3 + 23, 4, 50, 44, 16777215, -1, 2, 1, 14);
                    break L1;
                  }
                } else {
                  if (ad.field_d > 0) {
                    L5: {
                      var5 = 19;
                      if (-4 == (gm.field_f ^ -1)) {
                        var5 -= 7;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    rb.field_o[-1 + ad.field_d].d(var3 - -23, -(rb.field_o[ad.field_d - 1].field_y / 2) + -rb.field_o[-1 + ad.field_d].field_o + var5, 16711680);
                    discarded$10 = mi.field_B.a(jl.field_l, var3 - -5, 4, -10 + var2, 38, 16777215, -1, 1, 2, 14);
                    break L1;
                  } else {
                    discarded$11 = mi.field_B.a(jl.field_l, 5 + var3, 4, -10 + var2, 44, 16777215, -1, 1, 1, 14);
                    break L1;
                  }
                }
              } else {
                L6: {
                  tg.field_b[8].a(10 + (var3 + -4), 8);
                  if (-6 <= (var4 ^ -1)) {
                    break L6;
                  } else {
                    mi.field_B.a('+', 17 + var3, 30, 16711935);
                    break L6;
                  }
                }
                if (ad.field_d <= 0) {
                  discarded$12 = mi.field_B.a(mh.field_I + var4, 23 + var3, 4, var2 + -30, 44, 16777215, -1, 1, 1, 14);
                  break L1;
                } else {
                  rb.field_o[-1 + ad.field_d].d(23 + var3, -(rb.field_o[ad.field_d + -1].field_y / 2) + (33 - rb.field_o[-1 + ad.field_d].field_o), 16711680);
                  discarded$13 = mi.field_B.a(mh.field_I + var4, var3 + 23, 4, -30 + var2, 44, 16777215, -1, 2, 1, 14);
                  break L1;
                }
              }
            }
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    private final int d(int param0, int param1) {
        if (param0 != 41) {
            this.g(-83);
        }
        return this.b(param1, param0 + 159) + bi.field_I;
    }

    private final int c(int param0, int param1) {
        if (param1 < 75) {
            return -10;
        }
        return 30;
    }

    private final void h(int param0) {
        int discarded$7 = 0;
        int discarded$8 = 0;
        int discarded$9 = 0;
        int discarded$10 = 0;
        int discarded$11 = 0;
        int discarded$12 = 0;
        int discarded$13 = 0;
        le var2 = null;
        int var3 = 0;
        double var4 = 0.0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        int[] var8 = null;
        int var9_int = 0;
        int[] var9 = null;
        int var10_int = 0;
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
        int var20 = 0;
        String var20_ref_String = null;
        String var21 = null;
        int var22 = 0;
        int var23 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int[] var31 = null;
        int stackIn_57_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_55_0 = 0;
        L0: {
          var27 = ArcanistsMulti.field_G ? 1 : 0;
          var2 = jb.field_z;
          if (var2 != null) {
            break L0;
          } else {
            var2 = r.field_b;
            break L0;
          }
        }
        var3 = var2.field_V.s(0);
        var6 = an.field_f / 2;
        var7 = an.field_j / 2;
        var8_int = 0;
        L1: while (true) {
          if ((var8_int ^ -1) <= -301) {
            var8_int = 0;
            L2: while (true) {
              if (-301 >= (var8_int ^ -1)) {
                var8_int = 0;
                L3: while (true) {
                  if ((var8_int ^ -1) <= -301) {
                    L4: {
                      de.a();
                      var8 = new int[]{255, 0, 0};
                      if (param0 == 32) {
                        break L4;
                      } else {
                        this.field_n = -74;
                        break L4;
                      }
                    }
                    var9 = new int[]{0, 255, 0};
                    var10 = new int[]{0, 0, 255};
                    var11 = new int[]{255, 255, 255};
                    var12 = new qb[][]{kc.field_kb, jd.field_j, ea.field_u, qe.field_i, hn.field_d, tj.field_A, bo.field_a, h.field_I, fn.field_b};
                    var13 = new double[]{-0.75, 0.75, -0.5, 0.5, -0.25, 0.25};
                    var14 = 0;
                    L5: while (true) {
                      if (var3 <= var14) {
                        return;
                      } else {
                        var4 = 3.141592653589793 * var13[var14];
                        var15 = var6 - -(int)(240.0 * Math.sin(var4));
                        var16 = uc.field_a * 3 / 4 - (-240 - (int)(140.0 * Math.cos(var4)));
                        var17 = nj.field_n[var14];
                        var18 = -32;
                        L6: while (true) {
                          if ((var18 ^ -1) <= -33) {
                            var18 = -32;
                            L7: while (true) {
                              if (32 <= var18) {
                                L8: {
                                  de.a();
                                  var18 = -5 + var7;
                                  var19 = ae.field_d;
                                  if (var2.field_I == var2.field_V.d(false)) {
                                    if (250 <= o.field_s) {
                                      break L8;
                                    } else {
                                      var20_ref_String = Integer.toString(5 + -((o.field_s - 1) / 50));
                                      tj.field_t.b(var20_ref_String, var6 + -1, var18 + 64, 0, 0);
                                      tj.field_t.b(var20_ref_String, var6, var18 + 64 - 1, 0, 0);
                                      tj.field_t.b(var20_ref_String, var6, var18 - -64, 16777215, -1);
                                      break L8;
                                    }
                                  } else {
                                    var19 = qe.field_s;
                                    break L8;
                                  }
                                }
                                L9: {
                                  discarded$7 = mi.field_B.a(var19, var6 - 128 - 1, -1 + var18, 256, 64, 0, -1, 1, 0, 14);
                                  discarded$8 = mi.field_B.a(var19, -129 + var6, var18 + 1, 256, 64, 0, -1, 1, 0, 14);
                                  discarded$9 = mi.field_B.a(var19, var6 - 128 + 1, 1 + var18, 256, 64, 0, -1, 1, 0, 14);
                                  discarded$10 = mi.field_B.a(var19, 1 + (var6 - 128), -1 + var18, 256, 64, 0, -1, 1, 0, 14);
                                  discarded$11 = mi.field_B.a(var19, -1 + (var6 - 128), var18, 256, 64, 0, 0, 1, 0, 14);
                                  discarded$12 = mi.field_B.a(var19, var6 + -128, var18 + -1, 256, 64, 0, 0, 1, 0, 14);
                                  var16 -= 64;
                                  var15 -= 32;
                                  discarded$13 = mi.field_B.a(var19, -128 + var6, var18, 256, 64, 16777215, -1, 1, 0, 14);
                                  var20 = 0;
                                  if ((var14 ^ -1) == (jb.field_v / 50 % var3 ^ -1)) {
                                    var20 = (int)(-16.0 * Math.sin(3.141592653589793 * (double)(jb.field_v % 50) / 50.0));
                                    break L9;
                                  } else {
                                    break L9;
                                  }
                                }
                                L10: {
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
                                  pc.a(var10, var16 - 2, var11, var8, (byte) -101, var9, var12[8][0], 0 + var15);
                                  pc.a(var10, var16 + var20 - 0, var11, var8, (byte) 34, var9, var12[3][var2.field_V.field_N[var14][15]], var15 + 12);
                                  pc.a(var10, 0 + var16, var11, var8, (byte) 56, var9, var12[1][var2.field_V.field_N[var14][12]], 0 + var15);
                                  pc.a(var10, var16 + 2, var11, var8, (byte) 39, var9, var12[7][0], var15 + 0);
                                  pc.a(var10, -40 + var16 - -16, var11, var8, (byte) -121, var9, var12[0][var2.field_V.field_N[var14][13]], 0 + var15);
                                  pc.a(var10, -8 + var16, var11, var8, (byte) 37, var9, var12[4][var2.field_V.field_N[var14][17]], 0 + var15);
                                  if (53 == var2.field_V.field_N[var14][17]) {
                                    break L10;
                                  } else {
                                    if (55 == var2.field_V.field_N[var14][17]) {
                                      break L10;
                                    } else {
                                      pc.a(var10, -40 + var16 - -32, var11, var8, (byte) -118, var9, var12[6][var14], 0 + var15);
                                      break L10;
                                    }
                                  }
                                }
                                pc.a(var10, 16 + var16 + -40, var11, var8, (byte) -105, var9, var12[5][var2.field_V.field_N[var14][16]], var15 + 0);
                                pc.a(var10, var20 - -var16 - 0, var11, var8, (byte) 118, var9, var12[2][var2.field_V.field_N[var14][14]], -12 + var15);
                                var15 += 32;
                                var16 += 64;
                                var21 = var2.field_V.field_k[var14];
                                var16 += 16;
                                var22 = mi.field_B.b("Wmmmmmmmmmmm");
                                var15 = var15 - (var22 / 2 + 7);
                                var23 = 15 + var22;
                                de.c(var15 + 3, -8 + (var16 - -3), -6 + var23, 15, var17, (8421504 | var17) ^ 8421504);
                                de.h(var15 - -3, -8 + var16 + 3, 3 + var15 + (var23 + -6), -10 + var16 - -20);
                                L11: while (true) {
                                  if (0 >= var23) {
                                    de.a();
                                    var23 = var22 + 15;
                                    de.a(var15, -8 + var16, var23, 21, 6, 0);
                                    de.a(var15 + 2, -8 + (var16 - -2), -4 + var23, 17, 4, 0);
                                    de.a(var15 + 1, -8 + (var16 + 1), -2 + var23, 19, 6, 16777215);
                                    de.a(2 + var15, var16 - -2 - 8, -4 + var23, 17, 6, 0);
                                    var15 = var15 + (7 + var22 / 2);
                                    mi.field_B.b(var21, -1 + var15, 1 + var16 + mi.field_B.field_C / 2, 0, 0);
                                    mi.field_B.b(var21, var15, -1 + (var16 - (-1 + -(mi.field_B.field_C / 2))), 0, 0);
                                    mi.field_B.b(var21, var15, mi.field_B.field_C / 2 + (1 + var16), 16777215, -1);
                                    var16 -= 20;
                                    var15 -= 40;
                                    var16 -= 10;
                                    var23 = 1;
                                    var31 = var2.field_V.e(3, var14);
                                    var25 = 0;
                                    L12: while (true) {
                                      if ((var25 ^ -1) <= -17) {
                                        var14++;
                                        continue L5;
                                      } else {
                                        L13: {
                                          var26 = var31[var25];
                                          if ((var26 ^ -1) > -13) {
                                            break L13;
                                          } else {
                                            if (((-12 + var26) % 12 ^ -1) <= -11) {
                                              if ((var26 ^ -1) > -1) {
                                                break L13;
                                              } else {
                                                L14: {
                                                  if (((-6 + var26) / 12 ^ -1) != -1) {
                                                    break L14;
                                                  } else {
                                                    de.c(var15 - -10, 10 + var16, 10, 8912896, 256);
                                                    break L14;
                                                  }
                                                }
                                                L15: {
                                                  if (-2 != ((var26 - 6) / 12 ^ -1)) {
                                                    break L15;
                                                  } else {
                                                    de.c(10 + var15, 10 + var16, 10, 8404992, 256);
                                                    break L15;
                                                  }
                                                }
                                                L16: {
                                                  if ((var26 - 6) / 12 == 2) {
                                                    de.c(10 + var15, 10 + var16, 10, 8947712, 256);
                                                    break L16;
                                                  } else {
                                                    break L16;
                                                  }
                                                }
                                                L17: {
                                                  if (-4 != ((-6 + var26) / 12 ^ -1)) {
                                                    break L17;
                                                  } else {
                                                    de.c(10 + var15, 10 + var16, 10, 34952, 256);
                                                    break L17;
                                                  }
                                                }
                                                L18: {
                                                  if (4 == (-6 + var26) / 12) {
                                                    de.c(var15 - -10, 10 + var16, 10, 8947848, 256);
                                                    break L18;
                                                  } else {
                                                    break L18;
                                                  }
                                                }
                                                L19: {
                                                  if (5 != (-6 + var26) / 12) {
                                                    break L19;
                                                  } else {
                                                    de.c(10 + var15, var16 - -10, 10, 65280, 256);
                                                    break L19;
                                                  }
                                                }
                                                L20: {
                                                  gn.a(10, (byte) 99, 256, var15 + 10, var16 + 10);
                                                  if (var23 != 0) {
                                                    stackOut_56_0 = 0;
                                                    stackIn_57_0 = stackOut_56_0;
                                                    break L20;
                                                  } else {
                                                    stackOut_55_0 = 1;
                                                    stackIn_57_0 = stackOut_55_0;
                                                    break L20;
                                                  }
                                                }
                                                var23 = stackIn_57_0;
                                                bb.field_g[dd.field_f[var26]].b(var15, var16);
                                                if (var23 != 0) {
                                                  var15 -= 20;
                                                  var16 -= 20;
                                                  break L13;
                                                } else {
                                                  var15 += 20;
                                                  break L13;
                                                }
                                              }
                                            } else {
                                              break L13;
                                            }
                                          }
                                        }
                                        var25++;
                                        continue L12;
                                      }
                                    }
                                  } else {
                                    var23 = var23 - g.field_a.field_n;
                                    g.field_a.b(3 + var15 + var23, -10 + (3 + (-8 + var16)), 64);
                                    continue L11;
                                  }
                                }
                              } else {
                                de.h(0, var18 + var16, an.field_f, 8 + (var18 + var16));
                                de.i(var15, -4 + -(var18 / 2) + var16, 28, 13484723);
                                de.c(var15, -4 + -(var18 / 2) + var16, 28, 0);
                                var18++;
                                continue L7;
                              }
                            }
                          } else {
                            de.h(0, var16 + var18, an.field_f, var18 + var16 - -8);
                            de.i(var15, -(var18 / 2) + var16, 32, 7891535);
                            de.c(var15, -(var18 / 2) + var16, 32, 0);
                            var18++;
                            continue L6;
                          }
                        }
                      }
                    }
                  } else {
                    var4 = 2.0 * (3.141592653589793 * (double)var8_int) / 300.0;
                    var9_int = (int)(Math.sin(var4) * 239.0) + var6;
                    var10_int = (int)(160.0 * Math.cos(var4)) + var7;
                    de.i(var9_int, -1 + var10_int, 4, 11510925);
                    var8_int++;
                    continue L3;
                  }
                }
              } else {
                var4 = 2.0 * ((double)var8_int * 3.141592653589793) / 300.0;
                var9_int = var6 - -(int)(240.0 * Math.sin(var4));
                var10_int = (int)(Math.cos(var4) * 160.0) + var7;
                de.i(var9_int, var10_int, 7, 7891535);
                var8_int++;
                continue L2;
              }
            }
          } else {
            var4 = 3.141592653589793 * (double)var8_int * 2.0 / 300.0;
            var9_int = var6 - -(int)(Math.sin(var4) * 240.0);
            var10_int = var7 + (int)(Math.cos(var4) * 160.0);
            de.c(var9_int, var10_int, 8, 0);
            var8_int++;
            continue L1;
          }
        }
    }

    private final void a(boolean param0) {
        StringBuilder discarded$29 = null;
        StringBuilder discarded$30 = null;
        StringBuilder discarded$31 = null;
        StringBuilder discarded$32 = null;
        StringBuilder discarded$33 = null;
        int incrementValue$34 = 0;
        int incrementValue$35 = 0;
        int incrementValue$36 = 0;
        int incrementValue$37 = 0;
        int incrementValue$38 = 0;
        int incrementValue$39 = 0;
        int incrementValue$40 = 0;
        int incrementValue$41 = 0;
        int incrementValue$42 = 0;
        int incrementValue$43 = 0;
        int incrementValue$44 = 0;
        int incrementValue$45 = 0;
        int incrementValue$46 = 0;
        int incrementValue$47 = 0;
        int incrementValue$48 = 0;
        int incrementValue$49 = 0;
        int incrementValue$50 = 0;
        int discarded$51 = 0;
        int discarded$52 = 0;
        int discarded$53 = 0;
        int discarded$54 = 0;
        int discarded$55 = 0;
        int discarded$56 = 0;
        int discarded$57 = 0;
        le var2 = null;
        int var3 = 0;
        int var4 = 0;
        double var5 = 0.0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        int[] var9 = null;
        int var10_int = 0;
        int[] var10 = null;
        int var11_int = 0;
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
        String var27 = null;
        int var28 = 0;
        Object var29 = null;
        int var30 = 0;
        qb var31 = null;
        int var32 = 0;
        int var33 = 0;
        int stackIn_45_0 = 0;
        int[] stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        int[] stackIn_71_2 = null;
        int[] stackIn_71_3 = null;
        int stackIn_71_4 = 0;
        int[] stackIn_71_5 = null;
        qb[] stackIn_71_6 = null;
        int[] stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        int[] stackIn_72_2 = null;
        int[] stackIn_72_3 = null;
        int stackIn_72_4 = 0;
        int[] stackIn_72_5 = null;
        qb[] stackIn_72_6 = null;
        int[] stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        int[] stackIn_73_2 = null;
        int[] stackIn_73_3 = null;
        int stackIn_73_4 = 0;
        int[] stackIn_73_5 = null;
        qb[] stackIn_73_6 = null;
        int stackIn_73_7 = 0;
        StringBuilder stackIn_86_0 = null;
        StringBuilder stackIn_87_0 = null;
        StringBuilder stackIn_88_0 = null;
        String stackIn_88_1 = null;
        StringBuilder stackIn_89_0 = null;
        StringBuilder stackIn_90_0 = null;
        StringBuilder stackIn_91_0 = null;
        String stackIn_91_1 = null;
        int stackIn_102_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        int[] stackOut_70_0 = null;
        int stackOut_70_1 = 0;
        int[] stackOut_70_2 = null;
        int[] stackOut_70_3 = null;
        int stackOut_70_4 = 0;
        int[] stackOut_70_5 = null;
        qb[] stackOut_70_6 = null;
        int[] stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        int[] stackOut_72_2 = null;
        int[] stackOut_72_3 = null;
        int stackOut_72_4 = 0;
        int[] stackOut_72_5 = null;
        qb[] stackOut_72_6 = null;
        int stackOut_72_7 = 0;
        int[] stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        int[] stackOut_71_2 = null;
        int[] stackOut_71_3 = null;
        int stackOut_71_4 = 0;
        int[] stackOut_71_5 = null;
        qb[] stackOut_71_6 = null;
        int stackOut_71_7 = 0;
        StringBuilder stackOut_85_0 = null;
        StringBuilder stackOut_87_0 = null;
        String stackOut_87_1 = null;
        StringBuilder stackOut_86_0 = null;
        String stackOut_86_1 = null;
        StringBuilder stackOut_88_0 = null;
        StringBuilder stackOut_90_0 = null;
        String stackOut_90_1 = null;
        StringBuilder stackOut_89_0 = null;
        String stackOut_89_1 = null;
        int stackOut_101_0 = 0;
        int stackOut_100_0 = 0;
        L0: {
          var33 = ArcanistsMulti.field_G ? 1 : 0;
          var2 = jb.field_z;
          if (var2 == null) {
            var2 = r.field_b;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var3 = var2.field_V.s(0);
          var4 = var2.field_V.d(false);
          if (0 <= var4) {
            if (!var2.field_V.field_d) {
              break L1;
            } else {
              var4 = var4 & 1;
              break L1;
            }
          } else {
            break L1;
          }
        }
        var7 = an.field_f / 2;
        var8 = an.field_j / 2;
        var9_int = 0;
        L2: while (true) {
          if (var9_int >= 300) {
            var9_int = 0;
            L3: while (true) {
              if (300 <= var9_int) {
                var9_int = 0;
                L4: while (true) {
                  if (300 <= var9_int) {
                    L5: {
                      de.a();
                      var9 = new int[]{255, 0, 0};
                      var10 = new int[]{0, 255, 0};
                      var11 = new int[]{0, 0, 255};
                      var12 = new int[]{255, 255, 255};
                      var13 = new qb[][]{kc.field_kb, jd.field_j, ea.field_u, qe.field_i, hn.field_d, tj.field_A, bo.field_a, h.field_I, fn.field_b};
                      var14 = new StringBuilder(20);
                      if (null == var2.field_w) {
                        break L5;
                      } else {
                        var2.field_V = var2.field_w;
                        break L5;
                      }
                    }
                    L6: {
                      if (-1 >= (var4 ^ -1)) {
                        if (var2.field_V.field_d) {
                          L7: {
                            if (0 != var4) {
                              break L7;
                            } else {
                              discarded$29 = var14.append(rn.field_K + b.field_d + "<br><br>");
                              break L7;
                            }
                          }
                          if (1 != var4) {
                            break L6;
                          } else {
                            discarded$30 = var14.append(rn.field_K + cn.field_I + "<br><br>");
                            break L6;
                          }
                        } else {
                          discarded$31 = var14.append(rn.field_K + var2.field_V.field_k[var4] + "<br><br>");
                          break L6;
                        }
                      } else {
                        if (-2 == var4) {
                          discarded$32 = var14.append(ff.field_d);
                          break L6;
                        } else {
                          discarded$33 = var14.append(th.field_a);
                          break L6;
                        }
                      }
                    }
                    L8: {
                      var15 = var14.toString();
                      if (var2.field_V.d(1)) {
                        var16 = 0;
                        incrementValue$34 = var16;
                        var16++;
                        var15 = lk.a(var15, 10, incrementValue$34, lo.field_v);
                        incrementValue$35 = var16;
                        var16++;
                        var15 = lk.a(var15, 10, incrementValue$35, tm.field_e);
                        incrementValue$36 = var16;
                        var16++;
                        var15 = lk.a(var15, 10, incrementValue$36, qa.field_p);
                        incrementValue$37 = var16;
                        var16++;
                        var15 = lk.a(var15, 10, incrementValue$37, ej.field_N);
                        incrementValue$38 = var16;
                        var16++;
                        var15 = lk.a(var15, 10, incrementValue$38, tl.field_e);
                        incrementValue$39 = var16;
                        var16++;
                        var15 = lk.a(var15, 10, incrementValue$39, be.field_a);
                        incrementValue$40 = var16;
                        var16++;
                        var15 = lk.a(var15, 10, incrementValue$40, q.field_J);
                        incrementValue$41 = var16;
                        var16++;
                        var15 = lk.a(var15, 10, incrementValue$41, wk.field_h);
                        incrementValue$42 = var16;
                        var16++;
                        var15 = lk.a(var15, 10, incrementValue$42, ed.field_Eb);
                        incrementValue$43 = var16;
                        var16++;
                        var15 = lk.a(var15, 10, incrementValue$43, ob.field_X);
                        incrementValue$44 = var16;
                        var16++;
                        var15 = lk.a(var15, 10, incrementValue$44, ao.field_a);
                        incrementValue$45 = var16;
                        var16++;
                        var15 = lk.a(var15, 10, incrementValue$45, co.field_b);
                        incrementValue$46 = var16;
                        var16++;
                        var15 = lk.a(var15, 10, incrementValue$46, gi.field_i);
                        incrementValue$47 = var16;
                        var16++;
                        var15 = lk.a(var15, 10, incrementValue$47, nj.field_i);
                        incrementValue$48 = var16;
                        var16++;
                        var15 = lk.a(var15, 10, incrementValue$48, rk.field_S);
                        incrementValue$49 = var16;
                        var16++;
                        var15 = lk.a(var15, 10, incrementValue$49, gk.field_a);
                        if (lk.a(0, (byte) -36)) {
                          incrementValue$50 = var16;
                          var16++;
                          var15 = lk.a(var15, 10, incrementValue$50, lj.field_q);
                          break L8;
                        } else {
                          break L8;
                        }
                      } else {
                        var15 = nj.field_b;
                        break L8;
                      }
                    }
                    var16 = 128 + 14 * mi.field_B.a(var15, 256);
                    var17 = jb.field_v / 3 % var16 - 128;
                    var18 = uc.field_a + 180;
                    de.h(0, var18, an.field_f, 128 + var18);
                    discarded$51 = mi.field_B.a(var15, -128 + var7 - 1, -var17 + -1 + var18, 256, 256, 0, -1, 1, 0, 14);
                    discarded$52 = mi.field_B.a(var15, var7 + -129, -var17 + var18 + 1, 256, 256, 0, -1, 1, 0, 14);
                    discarded$53 = mi.field_B.a(var15, -128 + var7 - -1, -var17 + (var18 - -1), 256, 256, 0, -1, 1, 0, 14);
                    discarded$54 = mi.field_B.a(var15, -128 + var7 - -1, -var17 + var18 + -1, 256, 256, 0, -1, 1, 0, 14);
                    discarded$55 = mi.field_B.a(var15, var7 - 129, -var17 + var18, 256, 256, 0, 0, 1, 0, 14);
                    discarded$56 = mi.field_B.a(var15, var7 + -128, -1 + (var18 + -var17), 256, 256, 0, 0, 1, 0, 14);
                    discarded$57 = mi.field_B.a(var15, -128 + var7, -var17 + var18, 256, 256, 16777215, -1, 1, 0, 14);
                    de.a();
                    de.d(3, 2, -128 + var7, -1 + var18, 256, 2);
                    de.d(2, 1, -128 + var7, var18 - -1, 256, 1);
                    de.d(1, 1, -128 + var7, 2 + var18, 256, 1);
                    de.d(1, 1, -128 + var7, -3 + (128 + var18), 256, 1);
                    de.d(2, 1, -128 + var7, -2 + (128 + var18), 256, 1);
                    de.d(3, 2, var7 - 128, var18 + 127, 256, 2);
                    var19 = new double[]{-0.75, 0.75, -0.5, 0.5, -0.25, 0.25};
                    var20 = 0;
                    if (param0) {
                      L9: while (true) {
                        if ((var20 ^ -1) <= (var3 ^ -1)) {
                          return;
                        } else {
                          L10: {
                            L11: {
                              L12: {
                                var5 = var19[var20] * 3.141592653589793;
                                if (var2.field_V.field_d) {
                                  break L12;
                                } else {
                                  if (var4 == var20) {
                                    break L11;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                              L13: {
                                if (!var2.field_V.field_d) {
                                  break L13;
                                } else {
                                  if ((var4 ^ -1) != (var20 & 1 ^ -1)) {
                                    break L13;
                                  } else {
                                    if (-1 != (1 << var20 & var2.field_J ^ -1)) {
                                      break L13;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                              }
                              stackOut_44_0 = 0;
                              stackIn_45_0 = stackOut_44_0;
                              break L10;
                            }
                            stackOut_43_0 = 1;
                            stackIn_45_0 = stackOut_43_0;
                            break L10;
                          }
                          L14: {
                            var21 = stackIn_45_0;
                            var22 = (int)(240.0 * Math.sin(var5)) + var7;
                            var23 = uc.field_a / 2 + (240 - -(int)(140.0 * Math.cos(var5)));
                            var24 = nj.field_n[var20];
                            if (var21 == 0) {
                              var25 = -32;
                              L15: while (true) {
                                if (-33 >= (var25 ^ -1)) {
                                  var25 = -32;
                                  L16: while (true) {
                                    if (var25 >= 32) {
                                      break L14;
                                    } else {
                                      de.h(0, var23 - -var25, an.field_f, var25 + var23 - -8);
                                      de.i(var22, -4 + var23 - var25 / 2, 28, 13484723);
                                      de.c(var22, -4 + -(var25 / 2) + var23, 28, 0);
                                      var25++;
                                      continue L16;
                                    }
                                  }
                                } else {
                                  de.h(0, var23 + var25, an.field_f, 8 + var25 + var23);
                                  de.i(var22, var23 - var25 / 2, 32, 7891535);
                                  de.c(var22, -(var25 / 2) + var23, 32, 0);
                                  var25++;
                                  continue L15;
                                }
                              }
                            } else {
                              var25 = -48;
                              L17: while (true) {
                                if (-49 >= (var25 ^ -1)) {
                                  var23 -= 16;
                                  break L14;
                                } else {
                                  de.h(0, var25 + (var23 - 16), an.field_f, 24 + var23 - -var25);
                                  de.i(var22, -4 + (-(var25 / 2) + var23 + -16), 28, 13484723);
                                  gn.a(48, (byte) 90, 32, var22, -16 + (-(var25 / 2) + var23 + -4));
                                  de.c(var22, -16 + -(var25 / 2) + var23 + -4, 28, 0);
                                  var25++;
                                  continue L17;
                                }
                              }
                            }
                          }
                          L18: {
                            var23 -= 64;
                            var22 -= 32;
                            de.a();
                            var25 = 0;
                            var26 = 0;
                            if (var21 != 0) {
                              var25 = (int)(-16.0 * Math.sin(3.141592653589793 * (double)(jb.field_v % 50) / 50.0));
                              if (-1 == (jb.field_v / 50 % 5 ^ -1)) {
                                var26 = var25;
                                break L18;
                              } else {
                                break L18;
                              }
                            } else {
                              break L18;
                            }
                          }
                          L19: {
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
                              pc.a(var11, -2 + (var23 - -var26), var12, var9, (byte) 29, var10, var13[8][0], var22 + 0);
                              break L19;
                            } else {
                              break L19;
                            }
                          }
                          L20: {
                            pc.a(var11, var23 + var25 - (0 - var26 / 2), var12, var9, (byte) -82, var10, var13[3][var2.field_V.field_N[var20][15]], 12 + var22);
                            pc.a(var11, 0 + var23 + var26 * 3 / 2, var12, var9, (byte) -81, var10, var13[1][var2.field_V.field_N[var20][12]], var22 + 0);
                            if (-47 == (var2.field_V.field_N[var20][12] ^ -1)) {
                              break L20;
                            } else {
                              pc.a(var11, 2 + var23, var12, var9, (byte) -93, var10, var13[7][0], var22 - 0);
                              break L20;
                            }
                          }
                          L21: {
                            if (var21 != 0) {
                              break L21;
                            } else {
                              var23 += 16;
                              var22 += 8;
                              break L21;
                            }
                          }
                          L22: {
                            pc.a(var11, -40 + (var23 + (16 - -(var26 * 3 / 2))), var12, var9, (byte) 92, var10, var13[0][var2.field_V.field_N[var20][13]], var22 + 0);
                            pc.a(var11, var23 - (-32 + (40 + -(var26 * 3 / 2))), var12, var9, (byte) -125, var10, var13[4][var2.field_V.field_N[var20][17]], var22 - 0);
                            if (-54 == (var2.field_V.field_N[var20][17] ^ -1)) {
                              break L22;
                            } else {
                              if (-56 == (var2.field_V.field_N[var20][17] ^ -1)) {
                                break L22;
                              } else {
                                L23: {
                                  stackOut_70_0 = (int[]) (var11);
                                  stackOut_70_1 = var23 - -32 + (-40 - -(var26 * 3 / 2));
                                  stackOut_70_2 = (int[]) (var12);
                                  stackOut_70_3 = (int[]) (var9);
                                  stackOut_70_4 = 20;
                                  stackOut_70_5 = (int[]) (var10);
                                  stackOut_70_6 = var13[6];
                                  stackIn_72_0 = stackOut_70_0;
                                  stackIn_72_1 = stackOut_70_1;
                                  stackIn_72_2 = stackOut_70_2;
                                  stackIn_72_3 = stackOut_70_3;
                                  stackIn_72_4 = stackOut_70_4;
                                  stackIn_72_5 = stackOut_70_5;
                                  stackIn_72_6 = stackOut_70_6;
                                  stackIn_71_0 = stackOut_70_0;
                                  stackIn_71_1 = stackOut_70_1;
                                  stackIn_71_2 = stackOut_70_2;
                                  stackIn_71_3 = stackOut_70_3;
                                  stackIn_71_4 = stackOut_70_4;
                                  stackIn_71_5 = stackOut_70_5;
                                  stackIn_71_6 = stackOut_70_6;
                                  if (var21 != 0) {
                                    stackOut_72_0 = (int[]) ((Object) stackIn_72_0);
                                    stackOut_72_1 = stackIn_72_1;
                                    stackOut_72_2 = (int[]) ((Object) stackIn_72_2);
                                    stackOut_72_3 = (int[]) ((Object) stackIn_72_3);
                                    stackOut_72_4 = stackIn_72_4;
                                    stackOut_72_5 = (int[]) ((Object) stackIn_72_5);
                                    stackOut_72_6 = (qb[]) ((Object) stackIn_72_6);
                                    stackOut_72_7 = 8;
                                    stackIn_73_0 = stackOut_72_0;
                                    stackIn_73_1 = stackOut_72_1;
                                    stackIn_73_2 = stackOut_72_2;
                                    stackIn_73_3 = stackOut_72_3;
                                    stackIn_73_4 = stackOut_72_4;
                                    stackIn_73_5 = stackOut_72_5;
                                    stackIn_73_6 = stackOut_72_6;
                                    stackIn_73_7 = stackOut_72_7;
                                    break L23;
                                  } else {
                                    stackOut_71_0 = (int[]) ((Object) stackIn_71_0);
                                    stackOut_71_1 = stackIn_71_1;
                                    stackOut_71_2 = (int[]) ((Object) stackIn_71_2);
                                    stackOut_71_3 = (int[]) ((Object) stackIn_71_3);
                                    stackOut_71_4 = stackIn_71_4;
                                    stackOut_71_5 = (int[]) ((Object) stackIn_71_5);
                                    stackOut_71_6 = (qb[]) ((Object) stackIn_71_6);
                                    stackOut_71_7 = 16;
                                    stackIn_73_0 = stackOut_71_0;
                                    stackIn_73_1 = stackOut_71_1;
                                    stackIn_73_2 = stackOut_71_2;
                                    stackIn_73_3 = stackOut_71_3;
                                    stackIn_73_4 = stackOut_71_4;
                                    stackIn_73_5 = stackOut_71_5;
                                    stackIn_73_6 = stackOut_71_6;
                                    stackIn_73_7 = stackOut_71_7;
                                    break L23;
                                  }
                                }
                                pc.a(stackIn_73_0, stackIn_73_1, stackIn_73_2, stackIn_73_3, (byte) stackIn_73_4, stackIn_73_5, stackIn_73_6[stackIn_73_7 + (var20 + jb.field_v / 200) % 8], var22 - 0);
                                break L22;
                              }
                            }
                          }
                          L24: {
                            pc.a(var11, 3 * var26 / 2 + var23 + 16 - 40, var12, var9, (byte) -102, var10, var13[5][var2.field_V.field_N[var20][16]], var22 + 0);
                            if (var21 != 0) {
                              break L24;
                            } else {
                              var23 -= 16;
                              var22 -= 8;
                              break L24;
                            }
                          }
                          L25: {
                            pc.a(var11, var26 * 2 + (var25 - -var23 + 0), var12, var9, (byte) -88, var10, var13[2][var2.field_V.field_N[var20][14]], var22 + -12);
                            var22 += 32;
                            var23 += 64;
                            var27 = var2.field_V.field_k[var20];
                            var28 = mi.field_B.b("Wmmmmmmmmmmm");
                            if (var4 != var20) {
                              break L25;
                            } else {
                              var23 += 16;
                              break L25;
                            }
                          }
                          var22 = var22 - (var28 / 2 + 7);
                          var23 += 16;
                          var16 = 15 + var28;
                          de.c(var22 + 3, -8 + (var23 - -3), var16 + -6, 15, var24, 8421504 ^ (8421504 | var24));
                          de.h(var22 - -3, -5 + var23, var16 + 3 + var22 + -6, -2 + (17 + (var23 + -8)) - -3);
                          L26: while (true) {
                            if ((var16 ^ -1) >= -1) {
                              L27: {
                                de.a();
                                var16 = 15 + var28;
                                de.a(var22, var23 - 8, var16, 21, 6, 0);
                                de.a(2 + var22, -6 + var23, -4 + var16, 17, 4, 0);
                                de.a(1 + var22, 1 + var23 - 8, var16 + -2, 19, 6, 16777215);
                                de.a(var22 + 2, -8 + (2 + var23), -4 + var16, 17, 6, 0);
                                var22 = var22 + (7 + var28 / 2);
                                var29 = null;
                                if ((1 << var20 & var2.field_b) != 0) {
                                  var29 = hf.field_b;
                                  break L27;
                                } else {
                                  if (-1 > ((var2.field_a ^ -1) & var2.field_b ^ -1)) {
                                    if ((1 << var20 & var2.field_a ^ -1) != -1) {
                                      var29 = ea.field_I;
                                      break L27;
                                    } else {
                                      L28: {
                                        stackOut_85_0 = new StringBuilder().append(field_r);
                                        stackIn_87_0 = stackOut_85_0;
                                        stackIn_86_0 = stackOut_85_0;
                                        if (((jb.field_v & 11) >> 364106947 ^ -1) != -1) {
                                          stackOut_87_0 = (StringBuilder) ((Object) stackIn_87_0);
                                          stackOut_87_1 = ".";
                                          stackIn_88_0 = stackOut_87_0;
                                          stackIn_88_1 = stackOut_87_1;
                                          break L28;
                                        } else {
                                          stackOut_86_0 = (StringBuilder) ((Object) stackIn_86_0);
                                          stackOut_86_1 = "";
                                          stackIn_88_0 = stackOut_86_0;
                                          stackIn_88_1 = stackOut_86_1;
                                          break L28;
                                        }
                                      }
                                      L29: {
                                        stackOut_88_0 = ((StringBuilder) (Object) stackIn_88_0).append(stackIn_88_1);
                                        stackIn_90_0 = stackOut_88_0;
                                        stackIn_89_0 = stackOut_88_0;
                                        if ((2 & jb.field_v >> -1490343933 ^ -1) == -1) {
                                          stackOut_90_0 = (StringBuilder) ((Object) stackIn_90_0);
                                          stackOut_90_1 = "";
                                          stackIn_91_0 = stackOut_90_0;
                                          stackIn_91_1 = stackOut_90_1;
                                          break L29;
                                        } else {
                                          stackOut_89_0 = (StringBuilder) ((Object) stackIn_89_0);
                                          stackOut_89_1 = "..";
                                          stackIn_91_0 = stackOut_89_0;
                                          stackIn_91_1 = stackOut_89_1;
                                          break L29;
                                        }
                                      }
                                      var29 = stackIn_91_1;
                                      break L27;
                                    }
                                  } else {
                                    break L27;
                                  }
                                }
                              }
                              L30: {
                                if (var29 == null) {
                                  break L30;
                                } else {
                                  if (0 != (128 & jb.field_v)) {
                                    break L30;
                                  } else {
                                    var27 = (String) (var29);
                                    break L30;
                                  }
                                }
                              }
                              L31: {
                                mi.field_B.b(var27, var22 + -1, var23 + 1 + mi.field_B.field_C / 2, 0, 0);
                                mi.field_B.b(var27, var22, -1 + (mi.field_B.field_C / 2 + 1) + var23, 0, 0);
                                mi.field_B.b(var27, var22, mi.field_B.field_C / 2 + var23 + 1, 16777215, -1);
                                var22 -= 16;
                                var23 -= 32;
                                if (var2.field_V.d(1)) {
                                  L32: {
                                    if (!var2.field_i) {
                                      stackOut_101_0 = 0;
                                      stackIn_102_0 = stackOut_101_0;
                                      break L32;
                                    } else {
                                      stackOut_100_0 = var2.field_V.d(-108, var20);
                                      stackIn_102_0 = stackOut_100_0;
                                      break L32;
                                    }
                                  }
                                  var30 = stackIn_102_0;
                                  var31 = new qb(32 + (24 + var30 * 8), 80);
                                  var31.a();
                                  var32 = 0;
                                  L33: while (true) {
                                    if ((var32 ^ -1) <= (var30 ^ -1)) {
                                      de.d(4, 4, 0, 0, 8 * var30 + 24 - -32, 80);
                                      ce.field_m.a(true);
                                      var31.b(-(var30 * 8) + (var22 + -36), -24 + var23 - 16, 256);
                                      var31.b(-14 + (var22 + (-(8 * var30) - 16)) + 6, -16 + (-24 + var23), 256);
                                      var31.b(var22 - (8 * var30 + 30), -24 + var23 + -22, 256);
                                      var31.b(-16 + -(var30 * 8) + var22 + -14, -34 + var23, 256);
                                      var32 = 0;
                                      L34: while (true) {
                                        if (var32 >= var30) {
                                          break L31;
                                        } else {
                                          tg.field_b[7].a(-14 + -(var32 * 8) + var22, var23 + -16);
                                          var32++;
                                          continue L34;
                                        }
                                      }
                                    } else {
                                      tg.field_b[7].a(16 + 8 * var32 - -8, 24, 0, 16744703);
                                      var32++;
                                      continue L33;
                                    }
                                  }
                                } else {
                                  break L31;
                                }
                              }
                              var20++;
                              continue L9;
                            } else {
                              var16 = var16 - g.field_a.field_n;
                              g.field_a.b(var22 + (3 - -var16), 3 + (var23 + -18), 64);
                              continue L26;
                            }
                          }
                        }
                      }
                    } else {
                      return;
                    }
                  } else {
                    var5 = (double)var9_int * 3.141592653589793 * 2.0 / 300.0;
                    var10_int = (int)(239.0 * Math.sin(var5)) + var7;
                    var11_int = var8 - -(int)(Math.cos(var5) * 160.0);
                    de.i(var10_int, -1 + var11_int, 4, 11510925);
                    var9_int++;
                    continue L4;
                  }
                }
              } else {
                var5 = 3.141592653589793 * (double)var9_int * 2.0 / 300.0;
                var10_int = (int)(240.0 * Math.sin(var5)) + var7;
                var11_int = var8 - -(int)(Math.cos(var5) * 160.0);
                de.i(var10_int, var11_int, 7, 7891535);
                var9_int++;
                continue L3;
              }
            }
          } else {
            var5 = (double)var9_int * 3.141592653589793 * 2.0 / 300.0;
            var10_int = var7 - -(int)(Math.sin(var5) * 240.0);
            var11_int = var8 + (int)(160.0 * Math.cos(var5));
            de.c(var10_int, var11_int, 8, 0);
            var9_int++;
            continue L2;
          }
        }
    }

    private final boolean a(boolean param0, int param1, byte param2, boolean param3, int param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        int stackIn_9_3 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        int stackIn_10_3 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        int stackIn_11_3 = 0;
        int stackIn_11_4 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        int stackIn_13_3 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        int stackIn_14_3 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        int stackIn_15_3 = 0;
        int stackIn_15_4 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        int stackOut_12_3 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        int stackOut_14_3 = 0;
        int stackOut_14_4 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        int stackOut_13_3 = 0;
        int stackOut_13_4 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        int stackOut_8_3 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        int stackOut_10_3 = 0;
        int stackOut_10_4 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        int stackOut_9_3 = 0;
        int stackOut_9_4 = 0;
        L0: {
          L1: {
            if (!param3) {
              break L1;
            } else {
              if (an.field_g < param4) {
                break L1;
              } else {
                if ((param1 + param4 ^ -1) >= (an.field_g ^ -1)) {
                  break L1;
                } else {
                  if ((param6 ^ -1) < (me.field_I ^ -1)) {
                    break L1;
                  } else {
                    if (me.field_I >= param5 + param6) {
                      break L1;
                    } else {
                      stackOut_5_0 = 1;
                      stackIn_7_0 = stackOut_5_0;
                      break L0;
                    }
                  }
                }
              }
            }
          }
          stackOut_6_0 = 0;
          stackIn_7_0 = stackOut_6_0;
          break L0;
        }
        L2: {
          var8 = stackIn_7_0;
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
            L3: {
              stackOut_12_0 = param4;
              stackOut_12_1 = param6;
              stackOut_12_2 = param1;
              stackOut_12_3 = param5;
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              stackIn_14_3 = stackOut_12_3;
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              stackIn_13_3 = stackOut_12_3;
              if (var8 == 0) {
                stackOut_14_0 = stackIn_14_0;
                stackOut_14_1 = stackIn_14_1;
                stackOut_14_2 = stackIn_14_2;
                stackOut_14_3 = stackIn_14_3;
                stackOut_14_4 = 13220778;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                stackIn_15_2 = stackOut_14_2;
                stackIn_15_3 = stackOut_14_3;
                stackIn_15_4 = stackOut_14_4;
                break L3;
              } else {
                stackOut_13_0 = stackIn_13_0;
                stackOut_13_1 = stackIn_13_1;
                stackOut_13_2 = stackIn_13_2;
                stackOut_13_3 = stackIn_13_3;
                stackOut_13_4 = 16181230;
                stackIn_15_0 = stackOut_13_0;
                stackIn_15_1 = stackOut_13_1;
                stackIn_15_2 = stackOut_13_2;
                stackIn_15_3 = stackOut_13_3;
                stackIn_15_4 = stackOut_13_4;
                break L3;
              }
            }
            de.e(stackIn_15_0, stackIn_15_1, stackIn_15_2, stackIn_15_3, stackIn_15_4, 230);
            break L2;
          } else {
            L4: {
              stackOut_8_0 = param4;
              stackOut_8_1 = param6;
              stackOut_8_2 = param1;
              stackOut_8_3 = param5;
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              stackIn_10_3 = stackOut_8_3;
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              stackIn_9_3 = stackOut_8_3;
              if (var8 != 0) {
                stackOut_10_0 = stackIn_10_0;
                stackOut_10_1 = stackIn_10_1;
                stackOut_10_2 = stackIn_10_2;
                stackOut_10_3 = stackIn_10_3;
                stackOut_10_4 = 14075852;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                stackIn_11_2 = stackOut_10_2;
                stackIn_11_3 = stackOut_10_3;
                stackIn_11_4 = stackOut_10_4;
                break L4;
              } else {
                stackOut_9_0 = stackIn_9_0;
                stackOut_9_1 = stackIn_9_1;
                stackOut_9_2 = stackIn_9_2;
                stackOut_9_3 = stackIn_9_3;
                stackOut_9_4 = 11374744;
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_11_2 = stackOut_9_2;
                stackIn_11_3 = stackOut_9_3;
                stackIn_11_4 = stackOut_9_4;
                break L4;
              }
            }
            de.e(stackIn_11_0, stackIn_11_1, stackIn_11_2, stackIn_11_3, stackIn_11_4, 230);
            break L2;
          }
        }
        de.b(param4 - 1, param6 - -3, param4 - -4, param6 + -2, 1572892);
        de.b(param4 - 2, 5 + param6, 5 + param4, param6 - 2, 14802120);
        de.b(-1 + param4, 5 + param6, 5 + param4, -1 + param6, 1572892);
        de.b(param4, 5 + param6, 5 + param4, param6, 7887708);
        de.b(param1 + (param4 - 0), param6 - -3, param1 + (-5 + param4), -2 + param6, 1572892);
        de.b(param1 + (1 + param4), param6 + 5, param1 + (param4 + -6), -2 + param6, 14802120);
        de.b(param4 + 0 - -param1, param6 + 5, -6 + (param4 + param1), param6 + -1, 1572892);
        de.b(-1 + param4 + param1, 5 + param6, param1 + (-6 + param4), param6, 7887708);
        de.b(param4 - 1, param6 - (4 + -param5), 4 + param4, 1 + param6 - -param5, 1572892);
        de.b(param4 - 2, param6 + -6 + param5, 5 + param4, param5 + 1 + param6, 14802120);
        de.b(-1 + param4, param5 + (-6 + param6), 5 + param4, param5 + (0 + param6), 1572892);
        de.b(param4, param5 + -6 + param6, 5 + param4, param5 + param6 - 1, 7887708);
        de.b(param4 - 0 - -param1, param5 + (-4 + param6), param1 + (-5 + param4), param6 - -1 + param5, 1572892);
        de.b(param1 + 1 + param4, param5 + param6 + -6, param4 + (-6 + param1), param5 + 1 + param6, 14802120);
        de.b(param1 + (param4 - 0), param6 - 6 - -param5, param4 + -6 + param1, param5 + (param6 + 0), 1572892);
        de.b(param4 - (1 + -param1), param5 + (param6 - 6), -6 + (param4 - -param1), -1 + (param5 + param6), 7887708);
        return var8 != 0;
    }

    private final void d(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        String var4 = null;
        String[] var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        var10 = ArcanistsMulti.field_G ? 1 : 0;
        if (!lc.a((byte) 112)) {
          L0: {
            if (null == nj.field_e) {
              nj.field_e = eb.a(true, 10, 0, 7);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            var2 = 125 + uc.field_a + -16;
            var2 += 16;
            var3 = 0;
            mi.field_B.b(rd.field_d, no.field_tb[0] + bi.field_I, var2, var3, -1);
            mi.field_B.b(ej.field_H, no.field_tb[1] + bi.field_I, var2, var3, -1);
            mi.field_B.b(oo.field_o, no.field_tb[2] + bi.field_I, var2, var3, -1);
            mi.field_B.b(fc.field_d, no.field_tb[3] + bi.field_I, var2, var3, -1);
            mi.field_B.b(sl.field_N, no.field_tb[4] + bi.field_I, var2, var3, -1);
            if (param0) {
              break L1;
            } else {
              this.f(-123);
              break L1;
            }
          }
          L2: {
            var2 = var2 + (8 + tj.field_t.field_C);
            if (!nj.field_e.field_g) {
              var4 = ba.field_f;
              break L2;
            } else {
              if (null != nj.field_e.field_r) {
                var4 = rm.field_d;
                var5 = nj.field_e.field_r[ie.field_Sb];
                var6 = nj.field_e.field_l[ie.field_Sb];
                var7 = 0;
                var8 = 0;
                L3: while (true) {
                  if (-11 >= (var8 ^ -1)) {
                    if (var7 == 0) {
                      var3 = 16776960;
                      this.a(var3, nj.field_e.field_k, ah.field_b, nj.field_e.field_s, nj.field_e.field_i, -1, (byte) -126, nj.field_e.field_h, var2);
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    L4: {
                      if (null != var5[var8]) {
                        L5: {
                          var3 = 0;
                          if ((var8 & 1) == 1) {
                            var3 = 16777215;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        L6: {
                          var9 = var5[var8];
                          if (var9.equals(ah.field_b)) {
                            var3 = 16776960;
                            var7 = 1;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        this.a(var3, var6[4 * var8 - -1], var9, var6[3 + var8 * 4], var6[4 * var8], var8, (byte) -114, var6[2 + var8 * 4], var2);
                        var4 = "";
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var2 += 25;
                    var8++;
                    continue L3;
                  }
                }
              } else {
                var4 = rk.field_R;
                break L2;
              }
            }
          }
          L7: {
            var3 = 0;
            var2 = -16 + uc.field_a - -125;
            de.d(-((-no.field_tb[0] + no.field_tb[1]) / 2) + no.field_tb[0] + bi.field_I, 16 + (var2 - -9), 276, var3);
            de.d(bi.field_I + (no.field_tb[0] - -no.field_tb[1]) / 2, 16 + (9 + var2), 276, var3);
            de.d(bi.field_I + (no.field_tb[2] + no.field_tb[1]) / 2, 16 + (9 + var2), 276, var3);
            de.d(bi.field_I + (no.field_tb[2] - -no.field_tb[3]) / 2, 16 + var2 - -9, 276, var3);
            de.d(bi.field_I + (no.field_tb[3] + no.field_tb[4]) / 2, 9 + var2 + 16, 276, var3);
            if ("" != var4) {
              var2 = 16 + uc.field_a - -125;
              mi.field_B.a(var4, bi.field_I + 64, -16 + var2, 0, -1);
              break L7;
            } else {
              break L7;
            }
          }
          L8: {
            if (ie.field_Sb != 0) {
              var2 = uc.field_a - -125;
              mi.field_B.b(ij.field_Cb, 320 + bi.field_I, var2 - 16, 0, -1);
              break L8;
            } else {
              var2 = uc.field_a - -125;
              mi.field_B.b(me.field_N, bi.field_I + 320, var2 - 16, 0, -1);
              break L8;
            }
          }
          return;
        } else {
          this.g(12);
          return;
        }
    }

    final void d(byte param0) {
        if (param0 != 103) {
            return;
        }
        if (6 == this.field_l) {
            nj.field_e = null;
        }
    }

    private final void a(byte param0, boolean param1, int param2) {
        int var4 = 0;
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
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_30_2 = 0;
        int stackIn_30_3 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_31_2 = 0;
        int stackIn_31_3 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_32_2 = 0;
        int stackIn_32_3 = 0;
        int stackIn_32_4 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_33_2 = 0;
        int stackIn_33_3 = 0;
        int stackIn_33_4 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_34_2 = 0;
        int stackIn_34_3 = 0;
        int stackIn_34_4 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_35_2 = 0;
        int stackIn_35_3 = 0;
        int stackIn_35_4 = 0;
        int stackIn_35_5 = 0;
        int stackIn_42_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_72_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_29_2 = 0;
        int stackOut_29_3 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        int stackOut_31_2 = 0;
        int stackOut_31_3 = 0;
        int stackOut_31_4 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_30_2 = 0;
        int stackOut_30_3 = 0;
        int stackOut_30_4 = 0;
        int stackOut_32_0 = 0;
        int stackOut_32_1 = 0;
        int stackOut_32_2 = 0;
        int stackOut_32_3 = 0;
        int stackOut_32_4 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int stackOut_34_2 = 0;
        int stackOut_34_3 = 0;
        int stackOut_34_4 = 0;
        int stackOut_34_5 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        int stackOut_33_2 = 0;
        int stackOut_33_3 = 0;
        int stackOut_33_4 = 0;
        int stackOut_33_5 = 0;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_70_0 = 0;
        L0: {
          var20 = ArcanistsMulti.field_G ? 1 : 0;
          var4 = wl.field_L[this.field_l][param2];
          var5 = ce.field_g[var4];
          if ((var4 ^ -1) != -9) {
            break L0;
          } else {
            L1: {
              if (th.field_f == 0) {
                break L1;
              } else {
                if (mn.field_r == 0) {
                  break L1;
                } else {
                  if (10 == th.field_f) {
                    break L1;
                  } else {
                    if (10 != mn.field_r) {
                      L2: {
                        if ((th.field_f ^ -1) == -2) {
                          break L2;
                        } else {
                          if (mn.field_r != 1) {
                            L3: {
                              if (-3 == (th.field_f ^ -1)) {
                                break L3;
                              } else {
                                if (2 == mn.field_r) {
                                  break L3;
                                } else {
                                  if (3 == th.field_f) {
                                    break L3;
                                  } else {
                                    if (3 == mn.field_r) {
                                      break L3;
                                    } else {
                                      if (-5 == (th.field_f ^ -1)) {
                                        break L3;
                                      } else {
                                        if (mn.field_r != 4) {
                                          L4: {
                                            if (-16 == (th.field_f ^ -1)) {
                                              break L4;
                                            } else {
                                              if (mn.field_r != 15) {
                                                break L0;
                                              } else {
                                                break L4;
                                              }
                                            }
                                          }
                                          var5 = ce.field_g[14];
                                          break L0;
                                        } else {
                                          break L3;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            var5 = q.field_I;
                            break L0;
                          } else {
                            break L2;
                          }
                        }
                      }
                      var5 = ja.field_r;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            var5 = ce.field_g[7];
            break L0;
          }
        }
        L5: {
          L6: {
            var6 = tj.field_t.b(var5);
            var7 = this.d(41, param2);
            var8 = this.a(param2, (byte) 103);
            var9 = this.f(param2, -7661);
            if (-21 == (var4 ^ -1)) {
              break L6;
            } else {
              if (var4 == 21) {
                break L6;
              } else {
                break L5;
              }
            }
          }
          var6 = ff.field_c - -120;
          break L5;
        }
        L7: {
          var10 = -var6 + (var7 + var8) >> 574804385;
          var11 = this.c(param2, 110);
          var12 = -var7 + var8;
          var13 = this.c(param2, 100);
          var14 = 0;
          if (-1 == (this.field_l ^ -1)) {
            break L7;
          } else {
            if (15 == this.field_l) {
              break L7;
            } else {
              L8: {
                stackOut_29_0 = var7 + 2;
                stackOut_29_1 = 1 + var9;
                stackOut_29_2 = var12 - 4;
                stackOut_29_3 = -2 + var13;
                stackIn_31_0 = stackOut_29_0;
                stackIn_31_1 = stackOut_29_1;
                stackIn_31_2 = stackOut_29_2;
                stackIn_31_3 = stackOut_29_3;
                stackIn_30_0 = stackOut_29_0;
                stackIn_30_1 = stackOut_29_1;
                stackIn_30_2 = stackOut_29_2;
                stackIn_30_3 = stackOut_29_3;
                if (!param1) {
                  stackOut_31_0 = stackIn_31_0;
                  stackOut_31_1 = stackIn_31_1;
                  stackOut_31_2 = stackIn_31_2;
                  stackOut_31_3 = stackIn_31_3;
                  stackOut_31_4 = 0;
                  stackIn_32_0 = stackOut_31_0;
                  stackIn_32_1 = stackOut_31_1;
                  stackIn_32_2 = stackOut_31_2;
                  stackIn_32_3 = stackOut_31_3;
                  stackIn_32_4 = stackOut_31_4;
                  break L8;
                } else {
                  stackOut_30_0 = stackIn_30_0;
                  stackOut_30_1 = stackIn_30_1;
                  stackOut_30_2 = stackIn_30_2;
                  stackOut_30_3 = stackIn_30_3;
                  stackOut_30_4 = 2964062;
                  stackIn_32_0 = stackOut_30_0;
                  stackIn_32_1 = stackOut_30_1;
                  stackIn_32_2 = stackOut_30_2;
                  stackIn_32_3 = stackOut_30_3;
                  stackIn_32_4 = stackOut_30_4;
                  break L8;
                }
              }
              L9: {
                stackOut_32_0 = stackIn_32_0;
                stackOut_32_1 = stackIn_32_1;
                stackOut_32_2 = stackIn_32_2;
                stackOut_32_3 = stackIn_32_3;
                stackOut_32_4 = stackIn_32_4;
                stackIn_34_0 = stackOut_32_0;
                stackIn_34_1 = stackOut_32_1;
                stackIn_34_2 = stackOut_32_2;
                stackIn_34_3 = stackOut_32_3;
                stackIn_34_4 = stackOut_32_4;
                stackIn_33_0 = stackOut_32_0;
                stackIn_33_1 = stackOut_32_1;
                stackIn_33_2 = stackOut_32_2;
                stackIn_33_3 = stackOut_32_3;
                stackIn_33_4 = stackOut_32_4;
                if (param1) {
                  stackOut_34_0 = stackIn_34_0;
                  stackOut_34_1 = stackIn_34_1;
                  stackOut_34_2 = stackIn_34_2;
                  stackOut_34_3 = stackIn_34_3;
                  stackOut_34_4 = stackIn_34_4;
                  stackOut_34_5 = 16711164;
                  stackIn_35_0 = stackOut_34_0;
                  stackIn_35_1 = stackOut_34_1;
                  stackIn_35_2 = stackOut_34_2;
                  stackIn_35_3 = stackOut_34_3;
                  stackIn_35_4 = stackOut_34_4;
                  stackIn_35_5 = stackOut_34_5;
                  break L9;
                } else {
                  stackOut_33_0 = stackIn_33_0;
                  stackOut_33_1 = stackIn_33_1;
                  stackOut_33_2 = stackIn_33_2;
                  stackOut_33_3 = stackIn_33_3;
                  stackOut_33_4 = stackIn_33_4;
                  stackOut_33_5 = 5928124;
                  stackIn_35_0 = stackOut_33_0;
                  stackIn_35_1 = stackOut_33_1;
                  stackIn_35_2 = stackOut_33_2;
                  stackIn_35_3 = stackOut_33_3;
                  stackIn_35_4 = stackOut_33_4;
                  stackIn_35_5 = stackOut_33_5;
                  break L9;
                }
              }
              de.c(stackIn_35_0, stackIn_35_1, stackIn_35_2, stackIn_35_3, stackIn_35_4, stackIn_35_5);
              var14 = 1;
              de.a(1 + var7, var9, var12 - 2, var13, 5, 0);
              de.a(var7, var9 + -1, var12, var13 + 2, 6, 16777215);
              de.h(var7 + 2, 1 + var9, var12 + (2 + var7 + -4), -2 + (1 + var9 + var13));
              var15 = 2 + var7;
              L10: while (true) {
                if ((var12 + (2 + var7 - 4) ^ -1) >= (var15 ^ -1)) {
                  de.a();
                  de.c(var7 + 4, var9 - -2, var12 + -8, 9, 4, 16777215, 64);
                  de.c(5 + var7, var9 + 3, var12 - 10, 7, 3, 16777215, 64);
                  break L7;
                } else {
                  sm.field_d.b(var15, -16 + var9, 32);
                  var15 = var15 + sm.field_d.field_n;
                  continue L10;
                }
              }
            }
          }
        }
        L11: {
          if (!param1) {
            stackOut_41_0 = 16173159;
            stackIn_42_0 = stackOut_41_0;
            break L11;
          } else {
            stackOut_40_0 = 7097239;
            stackIn_42_0 = stackOut_40_0;
            break L11;
          }
        }
        L12: {
          var15 = stackIn_42_0;
          if (param1) {
            stackOut_44_0 = 16598235;
            stackIn_45_0 = stackOut_44_0;
            break L12;
          } else {
            stackOut_43_0 = 16738820;
            stackIn_45_0 = stackOut_43_0;
            break L12;
          }
        }
        L13: {
          var16 = stackIn_45_0;
          if (lc.a((byte) 112)) {
            break L13;
          } else {
            if (0 >= ah.field_c) {
              break L13;
            } else {
              if (-16 == (var4 ^ -1)) {
                L14: {
                  if (!param1) {
                    stackOut_51_0 = 0;
                    stackIn_52_0 = stackOut_51_0;
                    break L14;
                  } else {
                    stackOut_50_0 = 7097239;
                    stackIn_52_0 = stackOut_50_0;
                    break L14;
                  }
                }
                L15: {
                  var15 = stackIn_52_0;
                  if (!param1) {
                    stackOut_54_0 = 16738820;
                    stackIn_55_0 = stackOut_54_0;
                    break L15;
                  } else {
                    stackOut_53_0 = 16777215;
                    stackIn_55_0 = stackOut_53_0;
                    break L15;
                  }
                }
                var16 = stackIn_55_0;
                break L13;
              } else {
                break L13;
              }
            }
          }
        }
        L16: {
          var17 = var15;
          if (param1) {
            stackOut_58_0 = 7536857;
            stackIn_59_0 = stackOut_58_0;
            break L16;
          } else {
            stackOut_57_0 = 10027008;
            stackIn_59_0 = stackOut_57_0;
            break L16;
          }
        }
        L17: {
          var18 = stackIn_59_0;
          if (param0 == 98) {
            break L17;
          } else {
            this.d(false);
            break L17;
          }
        }
        L18: {
          if (var14 != 0) {
            var17 = var16;
            var18 = 0;
            break L18;
          } else {
            if ((wl.field_L[this.field_l].length ^ -1) < -2) {
              var17 = km.a(param2, wl.field_L[this.field_l].length, -1422079448, var16, var15);
              break L18;
            } else {
              break L18;
            }
          }
        }
        L19: {
          L20: {
            lk.a(var9, var10, var5, var18, var17, param0 ^ -15);
            if ((var4 ^ -1) == -21) {
              break L20;
            } else {
              if ((var4 ^ -1) == -22) {
                break L20;
              } else {
                break L19;
              }
            }
          }
          L21: {
            var10 = var10 + ff.field_c;
            de.g(var10, -4 + (var9 - -(var11 / 2)), 121, 8, 3, var17);
            de.a(var10, -4 + (var11 / 2 + var9), 121, 8, 3, var18);
            if (20 == var4) {
              stackOut_71_0 = 120 * si.field_l / 256;
              stackIn_72_0 = stackOut_71_0;
              break L21;
            } else {
              stackOut_70_0 = 120 * ul.field_A / 256;
              stackIn_72_0 = stackOut_70_0;
              break L21;
            }
          }
          var19 = stackIn_72_0;
          de.g(-4 + var10 + var19, var9 - -3, 8, var11 + -6, 3, var17);
          de.a(-4 + var19 + var10, 3 + var9, 8, -6 + var11, 3, var18);
          break L19;
        }
    }

    private final int f(int param0, int param1) {
        L0: {
          if (-15 == (this.field_l ^ -1)) {
            break L0;
          } else {
            if (this.field_l == 8) {
              break L0;
            } else {
              if (this.field_l == 7) {
                break L0;
              } else {
                if (param1 == -7661) {
                  return this.e(param0, param1 + 7736) + uc.field_a;
                } else {
                  return 94;
                }
              }
            }
          }
        }
        return this.e(param0, 75) + uc.field_a - -(uc.field_a / 8);
    }

    private final void e(int param0) {
        boolean discarded$42 = false;
        boolean discarded$43 = false;
        boolean discarded$44 = false;
        int discarded$45 = 0;
        int discarded$46 = 0;
        int discarded$47 = 0;
        int discarded$48 = 0;
        int discarded$49 = 0;
        int discarded$50 = 0;
        int discarded$51 = 0;
        int discarded$52 = 0;
        int discarded$53 = 0;
        int discarded$54 = 0;
        int discarded$55 = 0;
        int discarded$56 = 0;
        int discarded$57 = 0;
        int discarded$58 = 0;
        int discarded$59 = 0;
        int discarded$60 = 0;
        int discarded$61 = 0;
        int discarded$62 = 0;
        int discarded$63 = 0;
        int discarded$64 = 0;
        int discarded$65 = 0;
        int discarded$66 = 0;
        int discarded$67 = 0;
        int discarded$68 = 0;
        int discarded$69 = 0;
        int discarded$70 = 0;
        int discarded$71 = 0;
        int discarded$72 = 0;
        int discarded$73 = 0;
        int discarded$74 = 0;
        int discarded$75 = 0;
        int discarded$76 = 0;
        int discarded$77 = 0;
        int discarded$78 = 0;
        int discarded$79 = 0;
        int discarded$80 = 0;
        int discarded$81 = 0;
        boolean discarded$82 = false;
        boolean discarded$83 = false;
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
        int var16 = 0;
        double var16_double = 0.0;
        int var17_int = 0;
        Object var17 = null;
        double var17_double = 0.0;
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
        int stackIn_56_0 = 0;
        Object stackIn_57_0 = null;
        Object stackIn_58_0 = null;
        Object stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        int stackIn_331_0 = 0;
        int stackOut_330_0 = 0;
        int stackOut_329_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_54_0 = 0;
        Object stackOut_56_0 = null;
        Object stackOut_58_0 = null;
        int stackOut_58_1 = 0;
        Object stackOut_57_0 = null;
        int stackOut_57_1 = 0;
        L0: {
          var29 = ArcanistsMulti.field_G ? 1 : 0;
          var32 = tg.field_b[7].b();
          var3 = -ua.field_P + jf.field_j;
          this.c(-26733);
          this.field_m = -1;
          discarded$42 = this.a(false, 245, (byte) -43, false, bi.field_I - -26, 245, uc.field_a + 178);
          if ((this.field_d ^ -1) <= -1) {
            break L0;
          } else {
            this.field_d = 0;
            break L0;
          }
        }
        L1: {
          var4 = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
          if ((-6 + var4.length ^ -1) > (this.field_d ^ -1)) {
            this.field_d = -6 + var4.length;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (this.field_d > this.field_h) {
            this.field_h = this.field_d;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (6 - -this.field_d <= this.field_h) {
            this.field_h = 5 + this.field_d;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          var5 = uc.field_a - -102;
          var6 = 41 + bi.field_I;
          de.h(var6, var5 + 4, 558, 16777215, 128);
          de.e(var6, 5 + var5, 558, 55, 16777215, 64);
          de.h(var6, var5 - -65 - 5, 558, 16777215, 128);
          var7 = var6 - vi.field_I.field_n;
          if ((this.field_d ^ -1) < -1) {
            L5: {
              if (var7 > an.field_g) {
                break L5;
              } else {
                if ((var6 ^ -1) >= (an.field_g ^ -1)) {
                  break L5;
                } else {
                  if ((var5 ^ -1) < (me.field_I ^ -1)) {
                    break L5;
                  } else {
                    if (var5 - -65 <= me.field_I) {
                      break L5;
                    } else {
                      vi.field_I.b(var7, var5, vi.field_I.field_n, 65, 16777215);
                      vi.field_I.c(var7, var5, vi.field_I.field_n, 65, 128);
                      this.field_m = 10;
                      this.field_i = -1;
                      break L4;
                    }
                  }
                }
              }
            }
            vi.field_I.c(var7, var5, vi.field_I.field_n, 65);
            break L4;
          } else {
            vi.field_I.b(var7, var5, vi.field_I.field_n, 65, 0);
            vi.field_I.c(var7, var5, vi.field_I.field_n, 65, 128);
            break L4;
          }
        }
        L6: {
          var7 = var6 + 558;
          var8 = vi.field_I.b();
          if (this.field_d < -6 + var4.length) {
            L7: {
              if (var7 > an.field_g) {
                break L7;
              } else {
                if ((an.field_g ^ -1) <= (var7 - -vi.field_I.field_n ^ -1)) {
                  break L7;
                } else {
                  if (var5 > me.field_I) {
                    break L7;
                  } else {
                    if ((65 + var5 ^ -1) < (me.field_I ^ -1)) {
                      var8.b(var7, var5, vi.field_I.field_n, 65, 16777215);
                      var8.c(var7, var5, vi.field_I.field_n, 65, 128);
                      this.field_m = 10;
                      this.field_i = 1;
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
              }
            }
            var8.c(var7, var5, vi.field_I.field_n, 65);
            break L6;
          } else {
            var8.b(var7, var5, vi.field_I.field_n, 65, 0);
            var8.c(var7, var5, vi.field_I.field_n, 65, 128);
            break L6;
          }
        }
        var9 = this.field_d;
        L8: while (true) {
          if (var9 >= this.field_d + 6) {
            discarded$43 = this.a(false, 332, (byte) -71, false, 287 + bi.field_I, 245, 178 + uc.field_a);
            discarded$44 = this.a(true, 284, (byte) 108, false, 21 + bi.field_I + 287, 29, -4 + (178 + uc.field_a));
            discarded$45 = tj.field_t.a(tc.field_F, 21 + (290 + bi.field_I) + -1, -4 + (uc.field_a - -178 - 1), 281, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
            discarded$46 = tj.field_t.a(tc.field_F, 311 + bi.field_I, -2 + (178 + uc.field_a) - 4, 281, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
            discarded$47 = tj.field_t.a(tc.field_F, 290 + (bi.field_I - -21), -5 + uc.field_a + 178, 281, 29, 12569299, -1, param0, 1, tj.field_t.field_C);
            var9 = -1;
            var10 = -1;
            var11 = 0;
            var12 = 0;
            L9: while (true) {
              if ((var12 ^ -1) <= -9) {
                var12 = 0;
                L10: while (true) {
                  if (var12 >= 128) {
                    var12 = 0;
                    L11: while (true) {
                      if (var12 >= 128) {
                        L12: {
                          var12 = this.field_h * 12;
                          var11 = 12;
                          if (var12 < 0) {
                            var11 = var11 + var12;
                            var12 = 0;
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                        var13_int = 0;
                        L13: while (true) {
                          if (var13_int >= var11) {
                            L14: {
                              if (-2 <= (this.field_h ^ -1)) {
                                break L14;
                              } else {
                                if (!ArcanistsMulti.i((byte) -127)) {
                                  break L14;
                                } else {
                                  if (this.field_h >= 9) {
                                    break L14;
                                  } else {
                                    var13_int = 122 + (bi.field_I + 26);
                                    var14 = 178 + (uc.field_a + 122);
                                    ii.field_d.c(-64 + var13_int, -64 + var14, 128);
                                    break L14;
                                  }
                                }
                              }
                            }
                            L15: {
                              if (9 != this.field_h) {
                                break L15;
                              } else {
                                L16: {
                                  if ((ad.field_d ^ -1) >= -1) {
                                    break L16;
                                  } else {
                                    if (!ArcanistsMulti.i((byte) -60)) {
                                      break L15;
                                    } else {
                                      break L16;
                                    }
                                  }
                                }
                                var13_int = 148 + bi.field_I;
                                var14 = uc.field_a + 178 + 122;
                                ii.field_d.c(var13_int + -64, -64 + var14, 128);
                                break L15;
                              }
                            }
                            L17: {
                              L18: {
                                L19: {
                                  if (-2 == (this.field_m ^ -1)) {
                                    break L19;
                                  } else {
                                    if (6 == this.field_m) {
                                      break L19;
                                    } else {
                                      if (7 == this.field_m) {
                                        break L19;
                                      } else {
                                        if ((this.field_m ^ -1) == -9) {
                                          break L19;
                                        } else {
                                          if ((this.field_m ^ -1) == -3) {
                                            if (this.field_i < 0) {
                                              break L18;
                                            } else {
                                              if (-17 >= (this.field_i ^ -1)) {
                                                break L18;
                                              } else {
                                                if (0 != (b.field_f[this.field_i] ^ -1)) {
                                                  L20: {
                                                    L21: {
                                                      var13_int = b.field_f[this.field_i];
                                                      var36 = tc.field_w[var13_int];
                                                      var37 = vm.field_d[var13_int];
                                                      var16 = bi.field_I + 301;
                                                      var17_int = -1 + (uc.field_a + 303);
                                                      if (!ArcanistsMulti.i((byte) -91)) {
                                                        break L21;
                                                      } else {
                                                        if (-23 < (var13_int ^ -1)) {
                                                          break L21;
                                                        } else {
                                                          L22: {
                                                            if ((var13_int / 12 ^ -1) != (bc.field_b ^ -1)) {
                                                              break L22;
                                                            } else {
                                                              if ((-(var13_int / 12 * 12) + var13_int ^ -1) == (mf.field_a ^ -1)) {
                                                                break L21;
                                                              } else {
                                                                if (var13_int - 12 * (var13_int / 12) != 1 + mf.field_a) {
                                                                  break L22;
                                                                } else {
                                                                  break L21;
                                                                }
                                                              }
                                                            }
                                                          }
                                                          discarded$48 = mi.field_B.a(var36, var16 - 1, var17_int, 141, 29, 13158, 13158, 1, 1, mi.field_B.field_C);
                                                          discarded$49 = mi.field_B.a(var36, var16, -1 + var17_int, 141, 29, 13158, 13158, 1, 1, mi.field_B.field_C);
                                                          discarded$50 = mi.field_B.a(var36, var16, var17_int, 141, 29, 12569299, -1, 1, 1, mi.field_B.field_C);
                                                          discarded$51 = mi.field_B.a(qe.field_r, 447, 294, 171, 29, 16711680, 0, 1, 1, mi.field_B.field_C);
                                                          break L20;
                                                        }
                                                      }
                                                    }
                                                    discarded$52 = tj.field_t.a(var36, 10 + (var16 + -1), var17_int, 281, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                                                    discarded$53 = tj.field_t.a(var36, 10 + var16, var17_int + -1, 281, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                                                    discarded$54 = tj.field_t.a(var36, var16 - -10, var17_int, 281, 29, 12569299, -1, 1, 1, tj.field_t.field_C);
                                                    break L20;
                                                  }
                                                  discarded$55 = mi.field_B.a(var37, 8 + (290 + bi.field_I), uc.field_a - -340 - 8, 307, 128, 0, -1, 1, 0, mi.field_B.field_C);
                                                  break L17;
                                                } else {
                                                  break L17;
                                                }
                                              }
                                            }
                                          } else {
                                            L23: {
                                              var13 = vl.field_l;
                                              if (0 < this.field_h) {
                                                var13 = tn.field_Ib;
                                                if ((this.field_h ^ -1) != -10) {
                                                  break L23;
                                                } else {
                                                  L24: {
                                                    if (-1 == (ad.field_d ^ -1)) {
                                                      break L24;
                                                    } else {
                                                      if (ArcanistsMulti.i((byte) -77)) {
                                                        break L24;
                                                      } else {
                                                        break L23;
                                                      }
                                                    }
                                                  }
                                                  var13 = vn.field_j;
                                                  break L23;
                                                }
                                              } else {
                                                break L23;
                                              }
                                            }
                                            L25: {
                                              L26: {
                                                if ((an.field_g ^ -1) > (bi.field_I + 557 ^ -1)) {
                                                  break L26;
                                                } else {
                                                  if ((uc.field_a + 51 ^ -1) > (me.field_I ^ -1)) {
                                                    break L26;
                                                  } else {
                                                    if (!ArcanistsMulti.i((byte) -50)) {
                                                      var13 = "";
                                                      var14 = bi.field_I - -300;
                                                      var15 = 340 + uc.field_a;
                                                      this.a(var15, var3, var14, 113);
                                                      break L25;
                                                    } else {
                                                      break L26;
                                                    }
                                                  }
                                                }
                                              }
                                              if (this.field_m == 0) {
                                                L27: {
                                                  var14_ref_String = ee.field_c;
                                                  var13 = ld.field_k;
                                                  if ((Math.abs(this.field_i) ^ -1) == -2) {
                                                    var13 = j.field_b;
                                                    var14_ref_String = gd.field_qb;
                                                    break L27;
                                                  } else {
                                                    break L27;
                                                  }
                                                }
                                                L28: {
                                                  if (2 != Math.abs(this.field_i)) {
                                                    break L28;
                                                  } else {
                                                    var14_ref_String = io.field_z;
                                                    var13 = ri.field_d;
                                                    break L28;
                                                  }
                                                }
                                                L29: {
                                                  if ((Math.abs(this.field_i) ^ -1) != -4) {
                                                    break L29;
                                                  } else {
                                                    var13 = hm.field_d;
                                                    var14_ref_String = df.field_x;
                                                    break L29;
                                                  }
                                                }
                                                L30: {
                                                  if (-5 != (Math.abs(this.field_i) ^ -1)) {
                                                    break L30;
                                                  } else {
                                                    var13 = tk.field_r;
                                                    var14_ref_String = fh.field_d;
                                                    break L30;
                                                  }
                                                }
                                                L31: {
                                                  if (Math.abs(this.field_i) == 5) {
                                                    var13 = pk.field_g;
                                                    var14_ref_String = ad.field_g;
                                                    break L31;
                                                  } else {
                                                    break L31;
                                                  }
                                                }
                                                L32: {
                                                  if (6 == Math.abs(this.field_i)) {
                                                    var13 = gi.field_f;
                                                    var14_ref_String = ej.field_M;
                                                    break L32;
                                                  } else {
                                                    break L32;
                                                  }
                                                }
                                                L33: {
                                                  if (Math.abs(this.field_i) != 7) {
                                                    break L33;
                                                  } else {
                                                    var14_ref_String = nf.field_e;
                                                    var13 = tk.field_w;
                                                    break L33;
                                                  }
                                                }
                                                L34: {
                                                  if ((Math.abs(this.field_i) ^ -1) == -9) {
                                                    var13 = mi.field_s;
                                                    var14_ref_String = oo.field_r;
                                                    break L34;
                                                  } else {
                                                    break L34;
                                                  }
                                                }
                                                L35: {
                                                  if (-10 != (Math.abs(this.field_i) ^ -1)) {
                                                    break L35;
                                                  } else {
                                                    var13 = uk.field_f;
                                                    var14_ref_String = j.field_c;
                                                    break L35;
                                                  }
                                                }
                                                discarded$56 = tj.field_t.a(var14_ref_String, -1 + (311 + bi.field_I), -1 + (303 + uc.field_a), 281, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                                                discarded$57 = tj.field_t.a(var14_ref_String, 290 + (bi.field_I + 21), 303 + uc.field_a + -2, 281, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                                                discarded$58 = tj.field_t.a(var14_ref_String, 21 + (bi.field_I - -290), 303 + (uc.field_a + -1), 281, 29, 12569299, -1, 1, 1, tj.field_t.field_C);
                                                break L25;
                                              } else {
                                                if (3 == this.field_m) {
                                                  var34 = tc.field_w[this.field_i];
                                                  var14_ref_String = var34;
                                                  discarded$59 = tj.field_t.a(var34, bi.field_I - -310, -1 + (uc.field_a + 303), 281, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                                                  discarded$60 = tj.field_t.a(var34, 21 + bi.field_I + 290, 303 + (uc.field_a - 2), 281, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                                                  discarded$61 = tj.field_t.a(var14_ref_String, 21 + bi.field_I - -290, -1 + (303 + uc.field_a), 281, 29, 12569299, -1, 1, 1, tj.field_t.field_C);
                                                  var13 = tj.a(param0 + 126, new String[]{tc.field_w[-1 + this.field_i]}, jf.field_f);
                                                  break L25;
                                                } else {
                                                  if (-5 == (this.field_m ^ -1)) {
                                                    L36: {
                                                      var33 = tc.field_w[this.field_i];
                                                      var14_ref_String = var33;
                                                      discarded$62 = tj.field_t.a(var33, 290 + bi.field_I - -21 - 1, -1 + uc.field_a - -303, 281, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                                                      discarded$63 = tj.field_t.a(var33, 21 + (bi.field_I + 290), 303 + (uc.field_a + -2), 281, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                                                      discarded$64 = tj.field_t.a(var14_ref_String, 290 + (bi.field_I + 21), 303 + uc.field_a - 1, 281, 29, 12569299, -1, 1, 1, tj.field_t.field_C);
                                                      var15_ref_String = gd.field_qb;
                                                      if ((this.field_h ^ -1) != -3) {
                                                        break L36;
                                                      } else {
                                                        var15_ref_String = io.field_z;
                                                        break L36;
                                                      }
                                                    }
                                                    L37: {
                                                      if (3 != this.field_h) {
                                                        break L37;
                                                      } else {
                                                        var15_ref_String = df.field_x;
                                                        break L37;
                                                      }
                                                    }
                                                    L38: {
                                                      if (this.field_h == 4) {
                                                        var15_ref_String = fh.field_d;
                                                        break L38;
                                                      } else {
                                                        break L38;
                                                      }
                                                    }
                                                    L39: {
                                                      if (5 != this.field_h) {
                                                        break L39;
                                                      } else {
                                                        var15_ref_String = ad.field_g;
                                                        break L39;
                                                      }
                                                    }
                                                    L40: {
                                                      if (-7 != (this.field_h ^ -1)) {
                                                        break L40;
                                                      } else {
                                                        var15_ref_String = ej.field_M;
                                                        break L40;
                                                      }
                                                    }
                                                    L41: {
                                                      if ((this.field_h ^ -1) == -8) {
                                                        var15_ref_String = nf.field_e;
                                                        break L41;
                                                      } else {
                                                        break L41;
                                                      }
                                                    }
                                                    L42: {
                                                      if (this.field_h == 8) {
                                                        var15_ref_String = oo.field_r;
                                                        break L42;
                                                      } else {
                                                        break L42;
                                                      }
                                                    }
                                                    L43: {
                                                      if (this.field_h != 9) {
                                                        break L43;
                                                      } else {
                                                        var15_ref_String = j.field_c;
                                                        break L43;
                                                      }
                                                    }
                                                    var16 = 0;
                                                    var17_int = 0;
                                                    L44: while (true) {
                                                      if (16 <= var17_int) {
                                                        var13 = tj.a(116, new String[]{var15_ref_String, Integer.toString(var16)}, vl.field_k);
                                                        break L25;
                                                      } else {
                                                        L45: {
                                                          if (b.field_f[var17_int] < this.field_h * 12) {
                                                            break L45;
                                                          } else {
                                                            if (10 + 12 * this.field_h < b.field_f[var17_int]) {
                                                              break L45;
                                                            } else {
                                                              var16++;
                                                              break L45;
                                                            }
                                                          }
                                                        }
                                                        var17_int++;
                                                        continue L44;
                                                      }
                                                    }
                                                  } else {
                                                    if (-6 != (this.field_m ^ -1)) {
                                                      break L25;
                                                    } else {
                                                      L46: {
                                                        var13 = "You Should NEVER EVER EVER SEE THIS!!!";
                                                        var14_ref_String = gd.field_qb;
                                                        if (Math.abs(this.field_h) != 2) {
                                                          break L46;
                                                        } else {
                                                          var13 = sb.field_d + var3;
                                                          var14_ref_String = io.field_z;
                                                          break L46;
                                                        }
                                                      }
                                                      L47: {
                                                        if (3 == Math.abs(this.field_h)) {
                                                          var13 = ec.field_h + var3;
                                                          var14_ref_String = df.field_x;
                                                          break L47;
                                                        } else {
                                                          break L47;
                                                        }
                                                      }
                                                      L48: {
                                                        if (-5 == (Math.abs(this.field_h) ^ -1)) {
                                                          var14_ref_String = fh.field_d;
                                                          var13 = ie.field_Jb + var3;
                                                          break L48;
                                                        } else {
                                                          break L48;
                                                        }
                                                      }
                                                      L49: {
                                                        if (-6 == (Math.abs(this.field_h) ^ -1)) {
                                                          var14_ref_String = ad.field_g;
                                                          var13 = jk.field_v + var3;
                                                          break L49;
                                                        } else {
                                                          break L49;
                                                        }
                                                      }
                                                      L50: {
                                                        if (6 != Math.abs(this.field_h)) {
                                                          break L50;
                                                        } else {
                                                          var14_ref_String = ej.field_M;
                                                          var13 = wd.field_k + var3;
                                                          break L50;
                                                        }
                                                      }
                                                      L51: {
                                                        if (7 != Math.abs(this.field_h)) {
                                                          break L51;
                                                        } else {
                                                          var13 = dg.field_q + var3;
                                                          var14_ref_String = nf.field_e;
                                                          break L51;
                                                        }
                                                      }
                                                      L52: {
                                                        if (Math.abs(this.field_h) != 8) {
                                                          break L52;
                                                        } else {
                                                          var14_ref_String = oo.field_r;
                                                          var13 = q.field_H + var3;
                                                          break L52;
                                                        }
                                                      }
                                                      discarded$65 = tj.field_t.a(var14_ref_String, 290 + (bi.field_I + 21 - 1), 302 + uc.field_a, 281, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                                                      discarded$66 = tj.field_t.a(var14_ref_String, 290 + bi.field_I + 21, -2 + (303 + uc.field_a), 281, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                                                      discarded$67 = tj.field_t.a(var14_ref_String, bi.field_I + 311, uc.field_a - -302, 281, 29, 12569299, -1, 1, 1, tj.field_t.field_C);
                                                      var13 = "";
                                                      var15 = 300 + bi.field_I;
                                                      var16 = uc.field_a - -336;
                                                      discarded$68 = mi.field_B.a(aj.field_b, var15, var16, 70, 32, 0, -1, 1, 1, mi.field_B.field_C);
                                                      var15 += 74;
                                                      var17_int = 0;
                                                      L53: while (true) {
                                                        if (5 <= var17_int) {
                                                          L54: {
                                                            if (!ArcanistsMulti.i((byte) -90)) {
                                                              if (var3 < 5) {
                                                                var13 = mb.field_R;
                                                                break L54;
                                                              } else {
                                                                var13 = ij.field_Ob;
                                                                break L54;
                                                              }
                                                            } else {
                                                              var13 = nf.field_yb;
                                                              break L54;
                                                            }
                                                          }
                                                          discarded$69 = mi.field_B.a(var13, 440 + bi.field_I, var16, 170, 32, 0, -1, 1, 1, mi.field_B.field_C);
                                                          var13 = "";
                                                          break L25;
                                                        } else {
                                                          L55: {
                                                            if ((var17_int ^ -1) > (var3 ^ -1)) {
                                                              tg.field_b[7].a(var15, var16);
                                                              break L55;
                                                            } else {
                                                              tg.field_b[7].a(var15, var16, 64, 0);
                                                              break L55;
                                                            }
                                                          }
                                                          var15 += 9;
                                                          var17_int++;
                                                          continue L53;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            L56: {
                                              if (153 > jf.field_j) {
                                                break L56;
                                              } else {
                                                if (ad.field_d >= 10) {
                                                  break L56;
                                                } else {
                                                  var14 = 308 + (bi.field_I + ad.field_d * 32);
                                                  var15 = 400 + uc.field_a;
                                                  if ((an.field_g ^ -1) > (-16 + var14 ^ -1)) {
                                                    break L56;
                                                  } else {
                                                    if ((an.field_g ^ -1) < (16 + var14 ^ -1)) {
                                                      break L56;
                                                    } else {
                                                      if (me.field_I < -16 + var15) {
                                                        break L56;
                                                      } else {
                                                        if (me.field_I > var15 - -16) {
                                                          break L56;
                                                        } else {
                                                          this.field_m = 9;
                                                          break L56;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            L57: {
                                              L58: {
                                                if (tn.field_Ib == var13) {
                                                  break L58;
                                                } else {
                                                  if (var13 != vl.field_l) {
                                                    break L57;
                                                  } else {
                                                    break L58;
                                                  }
                                                }
                                              }
                                              if (153 > jf.field_j) {
                                                break L57;
                                              } else {
                                                if (10 <= ad.field_d) {
                                                  break L57;
                                                } else {
                                                  L59: {
                                                    var13 = ti.field_F;
                                                    if (this.field_m != 9) {
                                                      break L59;
                                                    } else {
                                                      var35 = vh.field_h;
                                                      var14 = 250 + ad.field_d * 250;
                                                      var13 = var35 + tj.a(param0 ^ -50, new String[]{Integer.toString(var14)}, ck.field_e);
                                                      break L59;
                                                    }
                                                  }
                                                  discarded$70 = mi.field_B.a(var13, bi.field_I + 302, 116 + (178 + uc.field_a), 299, 129, 0, -1, 1, 0, mi.field_B.field_C);
                                                  var14 = 0;
                                                  L60: while (true) {
                                                    if ((var14 ^ -1) <= -11) {
                                                      break L17;
                                                    } else {
                                                      L61: {
                                                        var15 = 308 + bi.field_I - -(var14 * 32);
                                                        var16 = uc.field_a - -400;
                                                        if ((ad.field_d ^ -1) <= (var14 ^ -1)) {
                                                          de.c(var15, -1 + var16, 14, 16711680);
                                                          de.c(var15 + -1, var16, 14, 16711680);
                                                          de.c(var15, var16 - -1, 14, 8912896);
                                                          de.c(1 + var15, var16, 14, 8912896);
                                                          de.c(var15, var16, 14, 0, 128);
                                                          de.c(var15, var16, 14, 16744576);
                                                          if (ad.field_d != var14) {
                                                            rb.field_o[var14].d(var15 + -15, -rb.field_o[var14].field_o + (var16 - rb.field_o[var14].field_y / 2), 16711680);
                                                            break L61;
                                                          } else {
                                                            L62: {
                                                              rb.field_o[var14].a(var15 + -15, -(rb.field_o[var14].field_y / 2) + (var16 - rb.field_o[var14].field_o), 0);
                                                              if ((var15 - 16 ^ -1) < (an.field_g ^ -1)) {
                                                                break L62;
                                                              } else {
                                                                if (an.field_g > 16 + var15) {
                                                                  break L62;
                                                                } else {
                                                                  if ((-16 + var16 ^ -1) < (me.field_I ^ -1)) {
                                                                    break L62;
                                                                  } else {
                                                                    if (var16 + 16 < me.field_I) {
                                                                      break L62;
                                                                    } else {
                                                                      var17_double = (double)(jb.field_v & 255) * 3.141592653589793 / 128.0;
                                                                      var19 = (int)(-256.0 + (Math.cos(4.0 * var17_double) * 256.0 + 4096.0)) / 2;
                                                                      var20 = (int)(0.0 + 5000.0 * Math.sin(2.0 * var17_double));
                                                                      tk.field_x[4].a(var15, var16, var20, var19);
                                                                      gn.a(8, (byte) 71, 128, var15 - var19 * 8 / 4096, var16 + -(8 * var19 / 4096));
                                                                      break L61;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                            var17_double = 3.141592653589793 * (double)(255 & jb.field_v) / 128.0;
                                                            var19 = (int)(-256.0 + (256.0 * Math.cos(var17_double * 4.0) + 4096.0)) / 2;
                                                            var20 = (int)(5000.0 * Math.sin(2.0 * var17_double) + 0.0);
                                                            tk.field_x[4].a(var15, var16, var20, var19);
                                                            de.c(var15, var16, 33 * var19 / 4096, 0, 128);
                                                            gn.a(8, (byte) 99, 128, -(var19 * 8 / 4096) + var15, var16 - var19 * 8 / 4096);
                                                            de.c(var15, var16, var19 * 32 / 4096, 0, 128);
                                                            break L61;
                                                          }
                                                        } else {
                                                          vd.field_b.f(var15 + -15, -16 + var16);
                                                          break L61;
                                                        }
                                                      }
                                                      var14++;
                                                      continue L60;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            discarded$71 = mi.field_B.a(var13, 12 + (290 + bi.field_I), 294 + uc.field_a, 299, 129, 0, -1, 1, 1, mi.field_B.field_C);
                                            break L17;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                if ((this.field_i ^ -1) > (var12 ^ -1)) {
                                  break L18;
                                } else {
                                  L63: {
                                    var38 = tc.field_w[this.field_i];
                                    var13 = var38;
                                    var39 = vm.field_d[this.field_i];
                                    var15 = 11 + bi.field_I - -290;
                                    var16 = 302 + uc.field_a;
                                    if (1 != this.field_m) {
                                      L64: {
                                        discarded$72 = mi.field_B.a(var38, -1 + var15, var16, 141, 29, 13158, 13158, 1, 1, mi.field_B.field_C);
                                        discarded$73 = mi.field_B.a(var38, var15, -1 + var16, 141, 29, 13158, 13158, 1, 1, mi.field_B.field_C);
                                        discarded$74 = mi.field_B.a(var13, var15, var16, 141, 29, 12569299, -1, 1, 1, mi.field_B.field_C);
                                        var17 = null;
                                        var18 = 16711680;
                                        if (!ArcanistsMulti.i((byte) -101)) {
                                          if (this.field_m != 6) {
                                            if (-8 == (this.field_m ^ -1)) {
                                              if ((var3 ^ -1) <= -3) {
                                                var18 = 65280;
                                                var17 = gi.field_l;
                                                break L64;
                                              } else {
                                                var17 = jk.field_d + var3 + "/2)";
                                                break L64;
                                              }
                                            } else {
                                              if (-9 != (this.field_m ^ -1)) {
                                                break L64;
                                              } else {
                                                if (3 > var3) {
                                                  var17 = jk.field_d + var3 + "/3)";
                                                  break L64;
                                                } else {
                                                  var18 = 65280;
                                                  var17 = ej.field_P;
                                                  break L64;
                                                }
                                              }
                                            }
                                          } else {
                                            var40 = ra.field_i;
                                            if (9 == this.field_h) {
                                              var17 = vf.field_h;
                                              break L64;
                                            } else {
                                              discarded$75 = mi.field_B.a(var40, 163 + var15 - 22, var16, 141, 29, var18, 0, 1, 1, mi.field_B.field_C);
                                              discarded$76 = mi.field_B.a(var39, -3 + var15, 340 + (uc.field_a - 8), 307, 128, 0, -1, 1, 0, mi.field_B.field_C);
                                              break L17;
                                            }
                                          }
                                        } else {
                                          var17 = gg.field_g;
                                          break L64;
                                        }
                                      }
                                      discarded$77 = mi.field_B.a((String) (var17), 163 + var15 - 22, var16, 141, 29, var18, 0, 1, 1, mi.field_B.field_C);
                                      break L63;
                                    } else {
                                      discarded$78 = tj.field_t.a(var38, var15 + -1, var16, 301, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                                      discarded$79 = tj.field_t.a(var38, var15, -1 + var16, 301, 29, 13158, 13158, 1, 1, tj.field_t.field_C);
                                      discarded$80 = tj.field_t.a(var13, var15, var16, 301, 29, 12569299, -1, 1, 1, tj.field_t.field_C);
                                      break L63;
                                    }
                                  }
                                  discarded$81 = mi.field_B.a(var39, -3 + var15, 340 + (uc.field_a - 8), 307, 128, 0, -1, 1, 0, mi.field_B.field_C);
                                  break L18;
                                }
                              }
                              break L17;
                            }
                            return;
                          } else {
                            L65: {
                              var14 = 96;
                              var15 = var13_int;
                              var16 = 1;
                              var17_int = 0;
                              var18 = 16;
                              var18--;
                              var19 = 10326659;
                              var15 = var13_int;
                              if (-1 != (var13_int ^ -1)) {
                                break L65;
                              } else {
                                var15 = 2;
                                break L65;
                              }
                            }
                            L66: {
                              if (-2 != (var13_int ^ -1)) {
                                break L66;
                              } else {
                                var15 = 4;
                                break L66;
                              }
                            }
                            L67: {
                              if (2 == var13_int) {
                                var15 = 1;
                                break L67;
                              } else {
                                break L67;
                              }
                            }
                            L68: {
                              if (var13_int == 3) {
                                var15 = 5;
                                break L68;
                              } else {
                                break L68;
                              }
                            }
                            L69: {
                              if (4 != var13_int) {
                                break L69;
                              } else {
                                var15 = 0;
                                break L69;
                              }
                            }
                            L70: {
                              if (5 != var13_int) {
                                break L70;
                              } else {
                                var15 = 6;
                                break L70;
                              }
                            }
                            L71: {
                              if (var13_int == 6) {
                                var15 = 11;
                                break L71;
                              } else {
                                break L71;
                              }
                            }
                            L72: {
                              if ((var13_int ^ -1) == -8) {
                                var15 = 7;
                                break L72;
                              } else {
                                break L72;
                              }
                            }
                            L73: {
                              if ((var13_int ^ -1) != -9) {
                                break L73;
                              } else {
                                var15 = 10;
                                break L73;
                              }
                            }
                            L74: {
                              if (-10 != (var13_int ^ -1)) {
                                break L74;
                              } else {
                                var15 = 8;
                                break L74;
                              }
                            }
                            L75: {
                              if ((var13_int ^ -1) == -11) {
                                var15 = 3;
                                break L75;
                              } else {
                                break L75;
                              }
                            }
                            L76: {
                              if (11 == var13_int) {
                                var15 = 9;
                                break L76;
                              } else {
                                break L76;
                              }
                            }
                            L77: {
                              if (var13_int < 10) {
                                L78: {
                                  if ((var13_int & 1 ^ -1) == -2) {
                                    var20 = 0;
                                    var30 = 0;
                                    var21 = var30;
                                    L79: while (true) {
                                      if (var30 >= 16) {
                                        L80: {
                                          var18++;
                                          if (-1 == (var20 ^ -1)) {
                                            var16 = 0;
                                            break L80;
                                          } else {
                                            break L80;
                                          }
                                        }
                                        var19 = 16711935;
                                        break L78;
                                      } else {
                                        L81: {
                                          if (b.field_f[var30] == -1 + (var12 + var13_int)) {
                                            var20++;
                                            break L81;
                                          } else {
                                            break L81;
                                          }
                                        }
                                        var30++;
                                        continue L79;
                                      }
                                    }
                                  } else {
                                    break L78;
                                  }
                                }
                                if (0 >= this.field_h) {
                                  break L77;
                                } else {
                                  if (-10 != (this.field_h ^ -1)) {
                                    if (-1 != (1 & var13_int ^ -1)) {
                                      if ((cb.field_e & 1L << -13 + 8 * this.field_h - -((-1 + var13_int) / 2)) != 0L) {
                                        break L77;
                                      } else {
                                        L82: {
                                          if (this.field_h != bc.field_b) {
                                            break L82;
                                          } else {
                                            if (mf.field_a != -1 + var13_int) {
                                              break L82;
                                            } else {
                                              break L77;
                                            }
                                          }
                                        }
                                        if (this.field_h > 1) {
                                          var16 = 0;
                                          var17_int = 2;
                                          break L77;
                                        } else {
                                          break L77;
                                        }
                                      }
                                    } else {
                                      if (0L != (1L << -14 + 8 * this.field_h & cb.field_e)) {
                                        break L77;
                                      } else {
                                        L83: {
                                          if ((this.field_h ^ -1) != (bc.field_b ^ -1)) {
                                            break L83;
                                          } else {
                                            if (mf.field_a == var13_int) {
                                              break L77;
                                            } else {
                                              break L83;
                                            }
                                          }
                                        }
                                        if (1 >= this.field_h) {
                                          break L77;
                                        } else {
                                          var16 = 0;
                                          var17_int = 0;
                                          break L77;
                                        }
                                      }
                                    }
                                  } else {
                                    break L77;
                                  }
                                }
                              } else {
                                if (0 >= this.field_h) {
                                  break L77;
                                } else {
                                  var20 = 0;
                                  var21 = 0;
                                  L84: while (true) {
                                    if (var21 >= 16) {
                                      L85: {
                                        var19 = 16744703;
                                        if ((var20 ^ -1) > -6) {
                                          var16 = 0;
                                          break L85;
                                        } else {
                                          break L85;
                                        }
                                      }
                                      L86: {
                                        var18 += 2;
                                        if (0L != (1L << 8 * this.field_h - (-(var13_int % 12) - -18) & cb.field_e)) {
                                          break L86;
                                        } else {
                                          if ((this.field_h ^ -1) > -10) {
                                            var17_int = 3;
                                            var16 = 0;
                                            break L86;
                                          } else {
                                            break L77;
                                          }
                                        }
                                      }
                                      break L77;
                                    } else {
                                      L87: {
                                        if (var12 > b.field_f[var21]) {
                                          break L87;
                                        } else {
                                          if ((b.field_f[var21] ^ -1) <= (10 + var12 ^ -1)) {
                                            break L87;
                                          } else {
                                            L88: {
                                              if (0 == (1 & b.field_f[var21])) {
                                                break L88;
                                              } else {
                                                if ((var21 ^ -1) >= -1) {
                                                  break L87;
                                                } else {
                                                  if ((-1 + b.field_f[var21] ^ -1) != (b.field_f[-1 + var21] ^ -1)) {
                                                    break L87;
                                                  } else {
                                                    break L88;
                                                  }
                                                }
                                              }
                                            }
                                            var20++;
                                            break L87;
                                          }
                                        }
                                      }
                                      var21++;
                                      continue L84;
                                    }
                                  }
                                }
                              }
                            }
                            L89: {
                              L90: {
                                var20_double = 2.0 * ((double)var15 * 3.141592653589793) / (double)var11;
                                var22 = 122 + (-6 + bi.field_I) + 32 - (int)((double)var14 * Math.cos(var20_double)) - 16;
                                var23 = 178 + uc.field_a - (-122 - -(int)((double)var14 * Math.sin(var20_double)) + 16);
                                if (this.field_h != 9) {
                                  break L90;
                                } else {
                                  L91: {
                                    if (ArcanistsMulti.i((byte) -87)) {
                                      break L91;
                                    } else {
                                      if (-1 > (ad.field_d ^ -1)) {
                                        break L90;
                                      } else {
                                        break L91;
                                      }
                                    }
                                  }
                                  if (an.field_g < var22) {
                                    break L89;
                                  } else {
                                    if (var23 > me.field_I) {
                                      break L89;
                                    } else {
                                      if ((var22 - -32 ^ -1) >= (an.field_g ^ -1)) {
                                        break L89;
                                      } else {
                                        if ((me.field_I ^ -1) <= (var23 - -32 ^ -1)) {
                                          break L89;
                                        } else {
                                          this.field_i = var13_int + var12;
                                          this.field_m = 6;
                                          break L89;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              if (var16 != 0) {
                                if ((an.field_g ^ -1) > (var22 ^ -1)) {
                                  break L89;
                                } else {
                                  if (me.field_I < var23) {
                                    break L89;
                                  } else {
                                    if (var22 + 32 <= an.field_g) {
                                      break L89;
                                    } else {
                                      if ((var23 - -32 ^ -1) >= (me.field_I ^ -1)) {
                                        break L89;
                                      } else {
                                        this.field_m = 1;
                                        this.field_i = var12 + var13_int;
                                        var18 += 4;
                                        break L89;
                                      }
                                    }
                                  }
                                }
                              } else {
                                if (an.field_g < var22) {
                                  break L89;
                                } else {
                                  if (me.field_I < var23) {
                                    break L89;
                                  } else {
                                    if ((an.field_g ^ -1) <= (var22 - -32 ^ -1)) {
                                      break L89;
                                    } else {
                                      if ((me.field_I ^ -1) <= (var23 - -32 ^ -1)) {
                                        break L89;
                                      } else {
                                        L92: {
                                          this.field_i = var13_int + var12;
                                          this.field_m = 3;
                                          if (10 <= var13_int) {
                                            this.field_m = 4;
                                            var24 = 0;
                                            L93: while (true) {
                                              if (var24 >= 16) {
                                                this.field_i = var12 + var13_int;
                                                break L92;
                                              } else {
                                                L94: {
                                                  if (var12 > b.field_f[var24]) {
                                                    break L94;
                                                  } else {
                                                    if (10 + var12 <= b.field_f[var24]) {
                                                      break L94;
                                                    } else {
                                                      if ((1 & b.field_f[var24]) == 0) {
                                                        break L94;
                                                      } else {
                                                        if (-1 <= (var24 ^ -1)) {
                                                          break L94;
                                                        } else {
                                                          if ((b.field_f[var24 + -1] ^ -1) == (b.field_f[var24] - 1 ^ -1)) {
                                                            break L94;
                                                          } else {
                                                            break L94;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                                var24++;
                                                continue L93;
                                              }
                                            }
                                          } else {
                                            break L92;
                                          }
                                        }
                                        L95: {
                                          L96: {
                                            var18 += 2;
                                            if ((cb.field_e & 1L << -14 + this.field_h * 8) != 0L) {
                                              break L96;
                                            } else {
                                              L97: {
                                                if (this.field_h != bc.field_b) {
                                                  break L97;
                                                } else {
                                                  if (var13_int == mf.field_a) {
                                                    break L96;
                                                  } else {
                                                    if ((var13_int ^ -1) == (mf.field_a + 1 ^ -1)) {
                                                      break L96;
                                                    } else {
                                                      break L97;
                                                    }
                                                  }
                                                }
                                              }
                                              if (-2 <= (this.field_h ^ -1)) {
                                                break L96;
                                              } else {
                                                if (-10 >= (this.field_h ^ -1)) {
                                                  break L96;
                                                } else {
                                                  this.field_i = var13_int + var12;
                                                  this.field_m = 6;
                                                  break L95;
                                                }
                                              }
                                            }
                                          }
                                          if ((var17_int ^ -1) >= -1) {
                                            break L95;
                                          } else {
                                            if (9 > this.field_h) {
                                              this.field_m = 7;
                                              this.field_i = var12 + var13_int;
                                              if (2 < var17_int) {
                                                this.field_m = 8;
                                                break L95;
                                              } else {
                                                break L95;
                                              }
                                            } else {
                                              break L95;
                                            }
                                          }
                                        }
                                        if ((this.field_m ^ -1) == -4) {
                                          var24 = -16 + (32 + (bi.field_I + -6) + 122 + (int)(Math.cos(var20_double) * (double)var14));
                                          gn.a((int)(Math.cos((double)jb.field_v * 0.1) * 4.0) + 20, (byte) 105, 128 - -(int)(Math.sin((double)jb.field_v * 0.1) * 64.0), var24 - -16, 16 + var23);
                                          break L89;
                                        } else {
                                          break L89;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            L98: {
                              L99: {
                                de.c(16 + var22, var23 + 16, 8 + var18, 0, 64);
                                de.i(16 + var22, var23 + 16, 4 + var18, var19);
                                de.c(16 + var22, 16 + var23, var18 - -4, 0);
                                de.i(16 + var22, 16 + var23, var18, 13947080);
                                de.c(var22 + 16, 16 + var23, var18, 0);
                                if (9 != this.field_h) {
                                  break L99;
                                } else {
                                  L100: {
                                    if (ad.field_d == 0) {
                                      break L100;
                                    } else {
                                      if (!ArcanistsMulti.i((byte) -74)) {
                                        break L99;
                                      } else {
                                        break L100;
                                      }
                                    }
                                  }
                                  bb.field_g[dd.field_f[var13_int + var12]].f(-4 + var22, -4 + var23, 32);
                                  break L98;
                                }
                              }
                              L101: {
                                if ((cb.field_e & 1L << this.field_h * 8 - 14 ^ -1L) != -1L) {
                                  break L101;
                                } else {
                                  if (-2 <= (this.field_h ^ -1)) {
                                    break L101;
                                  } else {
                                    if (this.field_h >= 9) {
                                      break L101;
                                    } else {
                                      if (var16 != 0) {
                                        break L101;
                                      } else {
                                        bb.field_g[dd.field_f[var13_int + var12]].f(-4 + var22, var23 - 4, 32);
                                        break L98;
                                      }
                                    }
                                  }
                                }
                              }
                              if (var16 != 0) {
                                bb.field_g[dd.field_f[var13_int + var12]].c(-4 + var22, var23 - 4);
                                var24 = 0;
                                var31 = 0;
                                var25_int = var31;
                                L102: while (true) {
                                  if (var31 >= 16) {
                                    if (var24 == 0) {
                                      break L98;
                                    } else {
                                      gn.a(24, (byte) 63, -128, var22 - -16, var23 - -16);
                                      de.c(var22 - -16, var23 + 16, 24, 0);
                                      break L98;
                                    }
                                  } else {
                                    L103: {
                                      if (b.field_f[var31] != var13_int + var12) {
                                        break L103;
                                      } else {
                                        var24 = 1;
                                        break L103;
                                      }
                                    }
                                    var31++;
                                    continue L102;
                                  }
                                }
                              } else {
                                if (-1 == (var17_int ^ -1)) {
                                  bb.field_g[dd.field_f[var13_int + var12]].f(-4 + var22, -4 + var23, 32);
                                  break L98;
                                } else {
                                  L104: {
                                    bb.field_g[dd.field_f[var12 + var13_int]].f(-4 + var22, -4 + var23, 32);
                                    var24 = var22 - -16 << -1582940220;
                                    var25_int = 16 + var23 << -1100081116;
                                    if (ArcanistsMulti.i((byte) -102)) {
                                      break L104;
                                    } else {
                                      L105: {
                                        if (-4 != (var17_int ^ -1)) {
                                          break L105;
                                        } else {
                                          var32.b(80, 320, var24, var25_int, jb.field_v * 30 + -21845, 4096);
                                          var32.b(80, 320, var24, var25_int, jb.field_v * 30 + 0, 4096);
                                          var32.b(80, 320, var24, var25_int, 30 * jb.field_v + 21845, 4096);
                                          break L105;
                                        }
                                      }
                                      if ((var17_int ^ -1) != -3) {
                                        break L104;
                                      } else {
                                        var32.b(160, 320, var24, var25_int, -16384 + jb.field_v * 30, 4096);
                                        var32.b(160, 320, var24, var25_int, 16384 + 30 * jb.field_v, 4096);
                                        break L98;
                                      }
                                    }
                                  }
                                  break L98;
                                }
                              }
                            }
                            L106: {
                              if (1 != this.field_h) {
                                break L106;
                              } else {
                                if (10 > var13_int) {
                                  break L106;
                                } else {
                                  if (ArcanistsMulti.i((byte) -84)) {
                                    ii.field_d.c(-4 + var22, var23 - 4, 40, 40, 128);
                                    break L106;
                                  } else {
                                    break L106;
                                  }
                                }
                              }
                            }
                            L107: {
                              if (-1L == (cb.field_e & 1L << this.field_h * 8 + -14 ^ -1L)) {
                                stackOut_330_0 = 0;
                                stackIn_331_0 = stackOut_330_0;
                                break L107;
                              } else {
                                stackOut_329_0 = 1;
                                stackIn_331_0 = stackOut_329_0;
                                break L107;
                              }
                            }
                            L108: {
                              var24 = stackIn_331_0;
                              if (var16 != 0) {
                                break L108;
                              } else {
                                if (0 >= var17_int) {
                                  break L108;
                                } else {
                                  if (var3 < var17_int) {
                                    break L108;
                                  } else {
                                    L109: {
                                      if (var24 != 0) {
                                        break L109;
                                      } else {
                                        if ((this.field_h ^ -1) != -2) {
                                          break L108;
                                        } else {
                                          break L109;
                                        }
                                      }
                                    }
                                    if (var22 > an.field_g) {
                                      break L108;
                                    } else {
                                      if (var23 > me.field_I) {
                                        break L108;
                                      } else {
                                        if (32 + var22 <= an.field_g) {
                                          break L108;
                                        } else {
                                          if (me.field_I >= 32 + var23) {
                                            break L108;
                                          } else {
                                            if (ArcanistsMulti.i((byte) -125)) {
                                              break L108;
                                            } else {
                                              var25 = 3.141592653589793 * (double)(255 & jb.field_v) / 128.0;
                                              var27 = (int)(2048.0 + Math.cos(var25 * 4.0) * 256.0 - 256.0);
                                              var28 = (int)(5000.0 * Math.sin(var25 * 2.0) + 0.0);
                                              if (-149 < (16 + var22 ^ -1)) {
                                                tk.field_x[4].a(var27, var23, -4, var22, var28);
                                                gn.a(8, (byte) 118, 128, var22 + -(var27 * 8 / 4096), var23 - 8 * var27 / 4096);
                                                break L108;
                                              } else {
                                                tk.field_x[4].a(var27, var23, -41, 32 + var22, var28);
                                                gn.a(8, (byte) 126, 128, -(var27 * 8 / 4096) + var22 - -32, var23 + -(8 * var27 / 4096));
                                                break L108;
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
                            L110: {
                              if ((bc.field_b ^ -1) != (this.field_h ^ -1)) {
                                break L110;
                              } else {
                                L111: {
                                  L112: {
                                    if ((var13_int ^ -1) != (mf.field_a ^ -1)) {
                                      break L112;
                                    } else {
                                      if (var24 == 0) {
                                        break L111;
                                      } else {
                                        break L112;
                                      }
                                    }
                                  }
                                  if (mf.field_a - -1 != var13_int) {
                                    break L110;
                                  } else {
                                    if ((1L << (-1 + var13_int) / 2 + -13 + 8 * this.field_h & cb.field_e ^ -1L) == -1L) {
                                      break L111;
                                    } else {
                                      break L110;
                                    }
                                  }
                                }
                                var25 = Math.cos(3.141592653589793 * (double)(jb.field_v & 255) / 64.0) * 5.0 + 32.0;
                                var27 = (int)(Math.cos(var20_double) * var25) + (16 + var22);
                                var28 = (int)(var25 * Math.sin(var20_double)) + 16 + var23;
                                tk.field_x[10].a(2048, var28, 120, var27, 0);
                                break L110;
                              }
                            }
                            var13_int++;
                            continue L13;
                          }
                        }
                      } else {
                        var13_int = 96;
                        var14_double = 3.141592653589793 * (double)var12 * 2.0 / 128.0;
                        var16 = 122 + (bi.field_I - -32) + (-6 + -(int)(Math.cos(var14_double) * (double)var13_int) + -16);
                        var17_int = 178 + (uc.field_a + 122) - ((int)(Math.sin(var14_double) * (double)var13_int) + 16);
                        de.i(var16 + 16, 16 + var17_int, 4, 10326659);
                        var12++;
                        continue L11;
                      }
                    }
                  } else {
                    var13_int = 96;
                    var14_double = (double)var12 * 3.141592653589793 * 2.0 / 128.0;
                    var16 = 132 + (bi.field_I + -(int)(Math.cos(var14_double) * (double)var13_int));
                    var17_int = -16 + (122 + (uc.field_a + 178 - (int)((double)var13_int * Math.sin(var14_double))));
                    de.i(var16 - -16, 16 + var17_int, 5, 0);
                    var12++;
                    continue L10;
                  }
                }
              } else {
                var13_int = 0;
                L113: while (true) {
                  if (-3 >= (var13_int ^ -1)) {
                    var12++;
                    continue L9;
                  } else {
                    L114: {
                      var14 = 290 + bi.field_I + 41 * var12;
                      var15 = 209 + (uc.field_a - -(var13_int * 41));
                      discarded$82 = this.a(true, 39, (byte) -104, true, var14, 39, var15);
                      var16 = b.field_f[var13_int + 2 * var12];
                      if ((var16 ^ -1) == 0) {
                        break L114;
                      } else {
                        L115: {
                          var17_int = 1;
                          var18 = var16;
                          var19 = var18 / 12;
                          de.h(1 + var14, var15 + 1, 37 + var14, 37 + var15);
                          if (var18 >= 0) {
                            L116: {
                              L117: {
                                if (var19 != var9) {
                                  break L117;
                                } else {
                                  if ((var9 ^ -1) != 0) {
                                    break L116;
                                  } else {
                                    break L117;
                                  }
                                }
                              }
                              var9 = var19;
                              var11 = 0;
                              break L116;
                            }
                            L118: {
                              if ((var18 % 12 ^ -1) <= -11) {
                                if ((var19 ^ -1) >= -1) {
                                  break L118;
                                } else {
                                  if (5 > var11) {
                                    var17_int = 0;
                                    break L118;
                                  } else {
                                    break L118;
                                  }
                                }
                              } else {
                                if ((1 & var18) != 1) {
                                  break L118;
                                } else {
                                  if (var10 != -1 + var18) {
                                    var17_int = 0;
                                    break L118;
                                  } else {
                                    break L118;
                                  }
                                }
                              }
                            }
                            if (var17_int != 0) {
                              var11++;
                              var10 = var18;
                              break L115;
                            } else {
                              break L115;
                            }
                          } else {
                            break L115;
                          }
                        }
                        L119: {
                          if (var17_int != 0) {
                            bb.field_g[dd.field_f[var16]].c(var14 + -1, var15 - 1);
                            break L119;
                          } else {
                            bb.field_g[dd.field_f[var16]].f(var14 + -1, -1 + var15, 64);
                            de.b(var14, var15, var14 + 32, 32 + var15, 16711680);
                            de.b(32 + var14, var15, var14, 32 + var15, 16711680);
                            b.field_f[var13_int + 2 * var12] = -1;
                            break L119;
                          }
                        }
                        L120: {
                          if (!ArcanistsMulti.i((byte) -62)) {
                            if (var16 < 108) {
                              if (-23 >= (var16 ^ -1)) {
                                L121: {
                                  if ((var19 ^ -1) >= -2) {
                                    break L121;
                                  } else {
                                    if (0L != (cb.field_e & 1L << var19 * 8 + -14)) {
                                      break L121;
                                    } else {
                                      L122: {
                                        if (bc.field_b != var19) {
                                          break L122;
                                        } else {
                                          if ((mf.field_a ^ -1) == (-(var19 * 12) + var16 ^ -1)) {
                                            break L121;
                                          } else {
                                            if ((mf.field_a - -1 ^ -1) == (var16 + -(var19 * 12) ^ -1)) {
                                              break L121;
                                            } else {
                                              break L122;
                                            }
                                          }
                                        }
                                      }
                                      ii.field_d.c(var14 + -1, -1 + var15, 40, 40, 128);
                                      break L120;
                                    }
                                  }
                                }
                                if ((var18 % 12 ^ -1) <= -11) {
                                  if ((1L << -18 + (var18 % 12 + 8 * var19) & cb.field_e) != 0L) {
                                    break L120;
                                  } else {
                                    ii.field_d.c(-1 + var14, -1 + var15, 40, 40, 128);
                                    break L120;
                                  }
                                } else {
                                  if ((1 & var18 ^ -1) != -2) {
                                    break L120;
                                  } else {
                                    if ((1L << -13 + 8 * var19 + (var18 % 12 - 1) / 2 & cb.field_e ^ -1L) != -1L) {
                                      break L120;
                                    } else {
                                      L123: {
                                        if ((bc.field_b ^ -1) != (var19 ^ -1)) {
                                          break L123;
                                        } else {
                                          if (-(var19 * 12) + var16 == 1 + mf.field_a) {
                                            break L120;
                                          } else {
                                            break L123;
                                          }
                                        }
                                      }
                                      ii.field_d.c(var14 - 1, -1 + var15, 40, 40, 128);
                                      break L120;
                                    }
                                  }
                                }
                              } else {
                                break L120;
                              }
                            } else {
                              L124: {
                                if (ArcanistsMulti.i((byte) -119)) {
                                  break L124;
                                } else {
                                  if ((ad.field_d ^ -1) != -1) {
                                    break L120;
                                  } else {
                                    break L124;
                                  }
                                }
                              }
                              ii.field_d.c(-1 + var14, var15 + -1, 40, 40, 128);
                              break L120;
                            }
                          } else {
                            if (var16 < 22) {
                              break L120;
                            } else {
                              L125: {
                                if ((bc.field_b ^ -1) != (var19 ^ -1)) {
                                  break L125;
                                } else {
                                  if ((mf.field_a ^ -1) == (-(var19 * 12) + var16 ^ -1)) {
                                    break L120;
                                  } else {
                                    if (-(var19 * 12) + var16 == 1 + mf.field_a) {
                                      break L120;
                                    } else {
                                      break L125;
                                    }
                                  }
                                }
                              }
                              ii.field_d.c(var14 - 1, -1 + var15, 40, 40, 128);
                              break L120;
                            }
                          }
                        }
                        de.a();
                        if ((an.field_g ^ -1) > (var14 ^ -1)) {
                          break L114;
                        } else {
                          if (var15 > me.field_I) {
                            break L114;
                          } else {
                            if ((an.field_g ^ -1) <= (var14 - -39 ^ -1)) {
                              break L114;
                            } else {
                              if (var15 + 39 > me.field_I) {
                                this.field_m = 2;
                                this.field_i = var13_int + 2 * var12;
                                break L114;
                              } else {
                                break L114;
                              }
                            }
                          }
                        }
                      }
                    }
                    var13_int++;
                    continue L113;
                  }
                }
              }
            }
          } else {
            L126: {
              var10 = (var9 - this.field_d) * 89 + var6 - -24;
              var11 = var5;
              var12 = 0;
              if (var9 == 0) {
                var12 = 16711935;
                break L126;
              } else {
                break L126;
              }
            }
            L127: {
              if ((var9 ^ -1) == -2) {
                var12 = 16711680;
                var11 += 0;
                break L127;
              } else {
                break L127;
              }
            }
            L128: {
              if (var9 != 2) {
                break L128;
              } else {
                var11 += 0;
                var12 = 16746632;
                break L128;
              }
            }
            L129: {
              if ((var9 ^ -1) != -4) {
                break L129;
              } else {
                var11 += 0;
                var12 = 16776960;
                break L129;
              }
            }
            L130: {
              if (4 == var9) {
                var11 += 0;
                var12 = 65535;
                break L130;
              } else {
                break L130;
              }
            }
            L131: {
              if (-6 != (var9 ^ -1)) {
                break L131;
              } else {
                var11 += 0;
                var12 = 34816;
                break L131;
              }
            }
            L132: {
              if ((var9 ^ -1) != -7) {
                break L132;
              } else {
                var11 += 0;
                var12 = 16777215;
                break L132;
              }
            }
            L133: {
              if (-8 != (var9 ^ -1)) {
                break L133;
              } else {
                var11 += 0;
                var12 = 4521762;
                break L133;
              }
            }
            L134: {
              if ((var9 ^ -1) != -9) {
                break L134;
              } else {
                var11 += 0;
                var12 = 1364125;
                break L134;
              }
            }
            L135: {
              if (-10 != (var9 ^ -1)) {
                break L135;
              } else {
                var11 += 0;
                var12 = 8947848;
                break L135;
              }
            }
            L136: {
              if ((bc.field_b ^ -1) != (var9 ^ -1)) {
                stackOut_55_0 = 0;
                stackIn_56_0 = stackOut_55_0;
                break L136;
              } else {
                stackOut_54_0 = 1;
                stackIn_56_0 = stackOut_54_0;
                break L136;
              }
            }
            L137: {
              var13_int = stackIn_56_0;
              de.d(var10, var11, 65, 65, var12);
              stackOut_56_0 = this;
              stackIn_58_0 = stackOut_56_0;
              stackIn_57_0 = stackOut_56_0;
              if (var9 != this.field_h) {
                stackOut_58_0 = this;
                stackOut_58_1 = 0;
                stackIn_59_0 = stackOut_58_0;
                stackIn_59_1 = stackOut_58_1;
                break L137;
              } else {
                stackOut_57_0 = this;
                stackOut_57_1 = 1;
                stackIn_59_0 = stackOut_57_0;
                stackIn_59_1 = stackOut_57_1;
                break L137;
              }
            }
            L138: {
              discarded$83 = this.a(stackIn_59_1 != 0, 65, (byte) 74, true, var10, 65, var11);
              if (var13_int == 0) {
                break L138;
              } else {
                L139: {
                  if (-10 != (var9 ^ -1)) {
                    break L139;
                  } else {
                    if (ArcanistsMulti.i((byte) -77)) {
                      break L139;
                    } else {
                      if (0 >= ad.field_d) {
                        break L139;
                      } else {
                        var13_int = 0;
                        break L139;
                      }
                    }
                  }
                }
                L140: {
                  if (0L == (1L << -14 + var9 * 8 & cb.field_e)) {
                    break L140;
                  } else {
                    if (var9 <= 1) {
                      break L140;
                    } else {
                      if (var9 < 9) {
                        if ((cb.field_e & 1L << -13 + 8 * var9 + mf.field_a / 2) != 0L) {
                          var13_int = 0;
                          break L140;
                        } else {
                          break L140;
                        }
                      } else {
                        break L140;
                      }
                    }
                  }
                }
                if (var13_int == 0) {
                  break L138;
                } else {
                  var14_double = 0.5 * (3.14 * Math.sin((double)jb.field_v * 0.1)) + 3.14;
                  tk.field_x[10].a(2048, (int)(16.0 * Math.cos(var14_double)) + var11 + 16, 125, var10 + ((int)(Math.sin(var14_double) * 32.0) - -32), 0);
                  break L138;
                }
              }
            }
            L141: {
              if (this.field_h == var9) {
                if (-10 != (this.field_h ^ -1)) {
                  L142: {
                    if (0L != (1L << -14 + 8 * this.field_h & cb.field_e)) {
                      break L142;
                    } else {
                      if (1 < this.field_h) {
                        L143: {
                          rm.field_o[10].a(26 + (bi.field_I + (245 + -rm.field_o[9].field_n) / 2), (-rm.field_o[9].field_w + 245) / 2 + 178 + uc.field_a, var12 >> 772288865 & 8355711 | 8421504);
                          rm.field_o[var9].a(bi.field_I + (32 - (6 + -((-rm.field_o[var9].field_n + 245) / 2))), (-rm.field_o[9].field_w + 245) / 2 + 178 + uc.field_a, 8355711 & var12 >> 2115331649 | 8421504);
                          de.d(6, 6, 8 + (32 + bi.field_I), 186 + uc.field_a, 229, 229);
                          rm.field_o[10].f((-rm.field_o[9].field_n + 245) / 2 + bi.field_I - -26, (245 + -rm.field_o[9].field_w) / 2 + uc.field_a - -178, 64);
                          rm.field_o[var9].f((245 + -rm.field_o[var9].field_n) / 2 + (-6 + bi.field_I + 32), (245 - rm.field_o[9].field_w) / 2 + uc.field_a + 178, 64);
                          ce.field_m.a(true);
                          var14 = 416 + (bi.field_I << 2005454852) + 1960;
                          var15 = 2848 + ((uc.field_a << -184663324) - -1960);
                          if (!ArcanistsMulti.i((byte) -102)) {
                            var32.b(80, 1088, var14, var15, jb.field_v * 30 + -26214, 4096);
                            var32.b(80, 1088, var14, var15, -13107 + jb.field_v * 30, 4096);
                            var32.b(80, 1088, var14, var15, jb.field_v * 30 + 0, 4096);
                            var32.b(80, 1088, var14, var15, 13107 + jb.field_v * 30, 4096);
                            var32.b(80, 1088, var14, var15, 26214 - -(jb.field_v * 30), 4096);
                            if (5 > var3) {
                              break L143;
                            } else {
                              var16_double = (double)(jb.field_v & 255) * 3.141592653589793 / 128.0;
                              var18 = (int)(4096.0 + 256.0 * Math.cos(4.0 * var16_double) - 256.0);
                              var19 = (int)(0.0 + 5000.0 * Math.sin(2.0 * var16_double));
                              tk.field_x[4].a(var18, uc.field_a - -300, param0 ^ 0, 148 + bi.field_I, var19);
                              gn.a(16, (byte) 111, 128, -(8 * var18 / 4096) + (148 + bi.field_I), -(var18 * 8 / 4096) + 300 + uc.field_a);
                              break L143;
                            }
                          } else {
                            break L143;
                          }
                        }
                        if (!mi.a(256, 178 + uc.field_a, 256, -8, bi.field_I - -26)) {
                          break L141;
                        } else {
                          this.field_i = var9;
                          this.field_m = 5;
                          break L141;
                        }
                      } else {
                        break L142;
                      }
                    }
                  }
                  rm.field_o[10].a(32 + (bi.field_I + -6) - -((-rm.field_o[9].field_n + 245) / 2), 178 + uc.field_a + (245 + -rm.field_o[9].field_w) / 2, (16711422 & var12) >> -1809086495 | 8421504);
                  rm.field_o[var9].a(-6 + bi.field_I - (-32 - (-rm.field_o[var9].field_n + 245) / 2), (245 + -rm.field_o[9].field_w) / 2 + uc.field_a + 178, 8421504 | (var12 & 16711422) >> 949379969);
                  de.d(6, 6, 8 + bi.field_I + 32, 8 + uc.field_a + 178, 229, 229);
                  rm.field_o[10].c((245 - rm.field_o[9].field_n) / 2 + bi.field_I + 26, uc.field_a + 178 - -((245 - rm.field_o[9].field_w) / 2));
                  rm.field_o[var9].c(-6 + bi.field_I + (32 + (245 - rm.field_o[var9].field_n) / 2), (245 + -rm.field_o[9].field_w) / 2 + (uc.field_a - -178));
                  break L141;
                } else {
                  L144: {
                    if (!ArcanistsMulti.i((byte) -72)) {
                      break L144;
                    } else {
                      if (0 >= ad.field_d) {
                        rm.field_o[10].a(32 + (bi.field_I + -6 - -((245 + -rm.field_o[9].field_n) / 2)), 178 + uc.field_a + (245 + -rm.field_o[9].field_w) / 2, (16711422 & var12 | 16843009) >> -545025343);
                        rm.field_o[var9].a((245 - rm.field_o[var9].field_n) / 2 + (bi.field_I + 32 - 6), 178 + (uc.field_a - -((245 - rm.field_o[9].field_w) / 2)), (var12 & 16711422 | 16843009) >> 705385793);
                        de.d(6, 6, bi.field_I - -32 - -8, 8 + (uc.field_a + 178), 229, 229);
                        rm.field_o[10].f(-6 + (bi.field_I - -32 + (-rm.field_o[9].field_n + 245) / 2), (-rm.field_o[9].field_w + 245) / 2 + 178 + uc.field_a, 64);
                        rm.field_o[var9].f((245 + -rm.field_o[var9].field_n) / 2 + (bi.field_I - -26), uc.field_a - (-178 + -((-rm.field_o[9].field_w + 245) / 2)), 64);
                        ce.field_m.a(true);
                        break L141;
                      } else {
                        break L144;
                      }
                    }
                  }
                  rm.field_o[10].a((-rm.field_o[9].field_n + 245) / 2 + -6 + (bi.field_I - -32), 178 + (uc.field_a - -((-rm.field_o[9].field_w + 245) / 2)), (16843008 | var12 & 16711422) >> 1299689985);
                  rm.field_o[var9].a(32 + (bi.field_I + (-6 - -((245 + -rm.field_o[var9].field_n) / 2))), (245 - rm.field_o[9].field_w) / 2 + uc.field_a - -178, var12 >> -616152095 & 8355711 | 8421504);
                  de.d(6, 6, 32 + bi.field_I + 8, 8 + (uc.field_a - -178), 229, 229);
                  rm.field_o[10].c((245 - rm.field_o[9].field_n) / 2 + 32 + (bi.field_I - 6), (245 + -rm.field_o[9].field_w) / 2 + uc.field_a + 178);
                  rm.field_o[var9].c(-6 + bi.field_I + (32 - -((245 - rm.field_o[var9].field_n) / 2)), 178 + (uc.field_a + (-rm.field_o[9].field_w + 245) / 2));
                  ce.field_m.a(true);
                  break L141;
                }
              } else {
                break L141;
              }
            }
            L145: {
              rm.field_o[10].b(2 + var10, var11);
              rm.field_o[var9].b(var10 - -2, var11);
              if (mi.a(65, var11, 65, -8, var10)) {
                this.field_m = 0;
                this.field_i = var9;
                break L145;
              } else {
                break L145;
              }
            }
            var9++;
            continue L8;
          }
        }
    }

    private final boolean a(byte param0, int param1) {
        int stackIn_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        L0: {
          if (7 == this.field_l) {
            L1: {
              if (param1 != 0) {
                break L1;
              } else {
                if (-1 != (fh.field_e ^ -1)) {
                  break L1;
                } else {
                  return false;
                }
              }
            }
            if (param1 != 2) {
              break L0;
            } else {
              if ((fh.field_e ^ -1) == (gd.field_kb.length - 1 ^ -1)) {
                return false;
              } else {
                break L0;
              }
            }
          } else {
            break L0;
          }
        }
        L2: {
          if (14 != this.field_l) {
            break L2;
          } else {
            L3: {
              if ((param1 ^ -1) != -1) {
                break L3;
              } else {
                if (-1 != (mj.field_p ^ -1)) {
                  break L3;
                } else {
                  return false;
                }
              }
            }
            if (param1 != 1) {
              break L2;
            } else {
              if (7 == mj.field_p) {
                return false;
              } else {
                break L2;
              }
            }
          }
        }
        if (-4 != (this.field_l ^ -1)) {
          if (param0 == -46) {
            return true;
          } else {
            field_c = (String) null;
            return true;
          }
        } else {
          L4: {
            L5: {
              if (1 == param1) {
                break L5;
              } else {
                if (jb.field_z == null) {
                  stackOut_22_0 = 0;
                  stackIn_23_0 = stackOut_22_0;
                  break L4;
                } else {
                  break L5;
                }
              }
            }
            stackOut_21_0 = 1;
            stackIn_23_0 = stackOut_21_0;
            break L4;
          }
          return stackIn_23_0 != 0;
        }
    }

    private final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = ArcanistsMulti.field_G ? 1 : 0;
          if (td.e(true)) {
            L1: {
              if (!ri.field_b[82]) {
                break L1;
              } else {
                if (ri.field_b[28]) {
                  gj.a(false, true, 10, mn.field_r);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (!ri.field_b[82]) {
                break L2;
              } else {
                if (!ri.field_b[70]) {
                  break L2;
                } else {
                  ah.field_c = 1;
                  break L2;
                }
              }
            }
            if (si.field_g != 12) {
              break L0;
            } else {
              L3: {
                if ((vn.field_d ^ -1) != -27) {
                  break L3;
                } else {
                  if (ua.field_P >= jf.field_j) {
                    break L3;
                  } else {
                    jf.field_j = jf.field_j - 1;
                    break L3;
                  }
                }
              }
              if (-28 != (vn.field_d ^ -1)) {
                break L0;
              } else {
                if (jf.field_j >= 153) {
                  break L0;
                } else {
                  jf.field_j = jf.field_j + 1;
                  break L0;
                }
              }
            }
          } else {
            break L0;
          }
        }
        L4: {
          if (param0 > 42) {
            break L4;
          } else {
            this.field_g = (so) null;
            break L4;
          }
        }
        L5: {
          if (-13 != (si.field_g ^ -1)) {
            break L5;
          } else {
            L6: {
              if ((vn.field_d ^ -1) != -97) {
                break L6;
              } else {
                this.field_d = this.field_d - 1;
                break L6;
              }
            }
            if (vn.field_d == 97) {
              this.field_d = this.field_d + 1;
              break L5;
            } else {
              break L5;
            }
          }
        }
        L7: {
          if ((si.field_g ^ -1) == -9) {
            L8: {
              if ((vn.field_d ^ -1) != -97) {
                break L8;
              } else {
                if (this.field_g.field_h < 3) {
                  this.field_g.field_h = this.field_g.field_h - 1;
                  if (0 > this.field_g.field_h) {
                    this.field_g.field_h = 2;
                    break L8;
                  } else {
                    break L8;
                  }
                } else {
                  break L8;
                }
              }
            }
            L9: {
              if (97 == vn.field_d) {
                if ((this.field_g.field_h ^ -1) > -4) {
                  this.field_g.field_h = this.field_g.field_h + 1;
                  if ((this.field_g.field_h ^ -1) >= -3) {
                    break L9;
                  } else {
                    this.field_g.field_h = 0;
                    break L9;
                  }
                } else {
                  break L9;
                }
              } else {
                break L9;
              }
            }
            L10: {
              if ((vn.field_d ^ -1) == -99) {
                break L10;
              } else {
                if (vn.field_d == 99) {
                  break L10;
                } else {
                  this.field_g.d(-101);
                  break L7;
                }
              }
            }
            L11: {
              if (this.field_g.field_h != 3) {
                if ((this.field_g.field_f ^ -1) != -5) {
                  break L11;
                } else {
                  this.field_g.field_h = 3;
                  break L11;
                }
              } else {
                this.field_g.field_h = 1;
                break L11;
              }
            }
            this.field_g.d(-101);
            break L7;
          } else {
            if (-8 != (si.field_g ^ -1)) {
              L12: {
                if ((si.field_g ^ -1) != -7) {
                  break L12;
                } else {
                  if (!lc.a((byte) 112)) {
                    this.c((byte) -92);
                    break L7;
                  } else {
                    break L12;
                  }
                }
              }
              if ((si.field_g ^ -1) != -15) {
                if ((si.field_g ^ -1) == -11) {
                  this.field_g.a(-100, 0);
                  break L7;
                } else {
                  this.field_g.a((byte) -76);
                  break L7;
                }
              } else {
                L13: {
                  if (-97 == (vn.field_d ^ -1)) {
                    if (!this.a((byte) -46, 0)) {
                      break L13;
                    } else {
                      this.field_g.a(0, false);
                      return;
                    }
                  } else {
                    if (-98 == (vn.field_d ^ -1)) {
                      if (!this.a((byte) -46, 1)) {
                        break L13;
                      } else {
                        this.field_g.a(1, false);
                        return;
                      }
                    } else {
                      if ((vn.field_d ^ -1) != -99) {
                        if (vn.field_d == 99) {
                          L14: {
                            var2 = this.field_g.field_h - -1;
                            if ((var2 ^ -1) <= (this.field_g.field_f ^ -1)) {
                              var2 = 0;
                              break L14;
                            } else {
                              break L14;
                            }
                          }
                          L15: {
                            if ((var2 ^ -1) != -1) {
                              break L15;
                            } else {
                              if (!this.a((byte) -46, 0)) {
                                var2++;
                                break L15;
                              } else {
                                break L15;
                              }
                            }
                          }
                          L16: {
                            if (-2 != (var2 ^ -1)) {
                              break L16;
                            } else {
                              if (!this.a((byte) -46, 1)) {
                                var2++;
                                break L16;
                              } else {
                                break L16;
                              }
                            }
                          }
                          this.field_g.a(var2, false);
                          break L7;
                        } else {
                          this.field_g.a((byte) -76);
                          break L7;
                        }
                      } else {
                        L17: {
                          var2 = -1 + this.field_g.field_h;
                          if (-2 != (var2 ^ -1)) {
                            break L17;
                          } else {
                            if (this.a((byte) -46, 1)) {
                              break L17;
                            } else {
                              var2--;
                              break L17;
                            }
                          }
                        }
                        L18: {
                          if ((var2 ^ -1) != -1) {
                            break L18;
                          } else {
                            if (!this.a((byte) -46, 0)) {
                              var2--;
                              break L18;
                            } else {
                              break L18;
                            }
                          }
                        }
                        L19: {
                          if (-1 < (var2 ^ -1)) {
                            var2 = this.field_g.field_f + -1;
                            break L19;
                          } else {
                            break L19;
                          }
                        }
                        this.field_g.a(var2, false);
                        break L7;
                      }
                    }
                  }
                }
                return;
              }
            } else {
              this.b(false);
              break L7;
            }
          }
        }
    }

    private final int b(int param0, int param1) {
        int stackIn_6_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_35_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        if (this.field_l != 6) {
          if ((this.field_l ^ -1) == -8) {
            return param0 * 200 + 20;
          } else {
            L0: {
              if ((this.field_l ^ -1) == -12) {
                if (-1 != (param0 ^ -1)) {
                  if (-2 != (param0 ^ -1)) {
                    break L0;
                  } else {
                    return 304;
                  }
                } else {
                  return 33;
                }
              } else {
                break L0;
              }
            }
            if ((this.field_l ^ -1) == -13) {
              if (-1 == (param0 ^ -1)) {
                return 26;
              } else {
                if (-2 != (param0 ^ -1)) {
                  return param0 * 220 + lm.field_e[this.field_l];
                } else {
                  return 287;
                }
              }
            } else {
              L1: {
                if (-15 == (this.field_l ^ -1)) {
                  if (wl.field_L[this.field_l][param0] != 25) {
                    if (wl.field_L[this.field_l][param0] != 26) {
                      if (29 != wl.field_L[this.field_l][param0]) {
                        if (7 == wl.field_L[this.field_l][param0]) {
                          return 220;
                        } else {
                          break L1;
                        }
                      } else {
                        return 220;
                      }
                    } else {
                      L2: {
                        if (this.a((byte) -46, 0)) {
                          stackOut_34_0 = 320;
                          stackIn_35_0 = stackOut_34_0;
                          break L2;
                        } else {
                          stackOut_33_0 = 220;
                          stackIn_35_0 = stackOut_33_0;
                          break L2;
                        }
                      }
                      return stackIn_35_0;
                    }
                  } else {
                    L3: {
                      if (!this.a((byte) -46, 1)) {
                        stackOut_29_0 = 220;
                        stackIn_30_0 = stackOut_29_0;
                        break L3;
                      } else {
                        stackOut_28_0 = 120;
                        stackIn_30_0 = stackOut_28_0;
                        break L3;
                      }
                    }
                    return stackIn_30_0;
                  }
                } else {
                  break L1;
                }
              }
              if (this.field_l == 3) {
                return 80;
              } else {
                if (this.field_l != 9) {
                  L4: {
                    if (-9 != (this.field_l ^ -1)) {
                      break L4;
                    } else {
                      if (-1 != (param0 ^ -1)) {
                        if (1 == param0) {
                          return 220;
                        } else {
                          if ((param0 ^ -1) == -3) {
                            return 420;
                          } else {
                            break L4;
                          }
                        }
                      } else {
                        return 20;
                      }
                    }
                  }
                  L5: {
                    if (param1 == 200) {
                      break L5;
                    } else {
                      field_q = (on[]) null;
                      break L5;
                    }
                  }
                  return lm.field_e[this.field_l];
                } else {
                  return 200;
                }
              }
            }
          }
        } else {
          if (!lc.a((byte) 112)) {
            L6: {
              if (param0 < 2) {
                stackOut_5_0 = param0 * 150 + 20;
                stackIn_6_0 = stackOut_5_0;
                break L6;
              } else {
                stackOut_4_0 = 320;
                stackIn_6_0 = stackOut_4_0;
                break L6;
              }
            }
            return stackIn_6_0;
          } else {
            return 160;
          }
        }
    }

    private final void a(int param0, int param1, String param2, int param3, int param4, int param5, byte param6, int param7, int param8) {
        RuntimeException var10 = null;
        int var10_int = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        String var15 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_6_3 = 0;
        int stackIn_6_4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        int stackIn_7_4 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        int stackIn_8_4 = 0;
        int stackIn_8_5 = 0;
        String stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        int stackOut_5_4 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        int stackOut_7_4 = 0;
        int stackOut_7_5 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        int stackOut_6_4 = 0;
        int stackOut_6_5 = 0;
        String stackOut_18_0 = null;
        String stackOut_17_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var13 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var10_int = param1 - (-param3 - param7);
              if (var10_int == 0) {
                break L1;
              } else {
                param3 = (200 * param3 - -var10_int) / (var10_int * 2);
                param7 = (200 * param7 - -var10_int) / (2 * var10_int);
                param1 = (param1 * 200 + var10_int) / (var10_int * 2);
                break L1;
              }
            }
            L2: {
              if (param0 != 0) {
                L3: {
                  stackOut_5_0 = 45 + bi.field_I;
                  stackOut_5_1 = param8 + -22;
                  stackOut_5_2 = 550;
                  stackOut_5_3 = 26;
                  stackOut_5_4 = param0;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  stackIn_7_2 = stackOut_5_2;
                  stackIn_7_3 = stackOut_5_3;
                  stackIn_7_4 = stackOut_5_4;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  stackIn_6_2 = stackOut_5_2;
                  stackIn_6_3 = stackOut_5_3;
                  stackIn_6_4 = stackOut_5_4;
                  if (param0 == 16777215) {
                    stackOut_7_0 = stackIn_7_0;
                    stackOut_7_1 = stackIn_7_1;
                    stackOut_7_2 = stackIn_7_2;
                    stackOut_7_3 = stackIn_7_3;
                    stackOut_7_4 = stackIn_7_4;
                    stackOut_7_5 = 32;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    stackIn_8_2 = stackOut_7_2;
                    stackIn_8_3 = stackOut_7_3;
                    stackIn_8_4 = stackOut_7_4;
                    stackIn_8_5 = stackOut_7_5;
                    break L3;
                  } else {
                    stackOut_6_0 = stackIn_6_0;
                    stackOut_6_1 = stackIn_6_1;
                    stackOut_6_2 = stackIn_6_2;
                    stackOut_6_3 = stackIn_6_3;
                    stackOut_6_4 = stackIn_6_4;
                    stackOut_6_5 = 128;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
                    stackIn_8_2 = stackOut_6_2;
                    stackIn_8_3 = stackOut_6_3;
                    stackIn_8_4 = stackOut_6_4;
                    stackIn_8_5 = stackOut_6_5;
                    break L3;
                  }
                }
                de.e(stackIn_8_0, stackIn_8_1, stackIn_8_2, stackIn_8_3, stackIn_8_4, stackIn_8_5);
                break L2;
              } else {
                break L2;
              }
            }
            L4: {
              param8 -= 4;
              param0 = 0;
              if (-1 == param5) {
                break L4;
              } else {
                mi.field_B.c(param5 - -1 + ". ", 60 + (bi.field_I + 30), param8, param0, -1);
                break L4;
              }
            }
            L5: {
              var14 = param2;
              var11 = var14;
              if (param6 < -92) {
                break L5;
              } else {
                this.field_h = -20;
                break L5;
              }
            }
            var12 = var14.length();
            L6: while (true) {
              if (175 >= mi.field_B.b(var11)) {
                L7: {
                  mi.field_B.a(var11, 90 + bi.field_I, param8, param0, -1);
                  var15 = Integer.toString(param4);
                  mi.field_B.b(var15, no.field_tb[0] + bi.field_I, param8, param0, -1);
                  if (500 <= var10_int) {
                    stackOut_18_0 = "500+";
                    stackIn_19_0 = stackOut_18_0;
                    break L7;
                  } else {
                    stackOut_17_0 = Integer.toString(var10_int);
                    stackIn_19_0 = stackOut_17_0;
                    break L7;
                  }
                }
                var11 = stackIn_19_0;
                mi.field_B.b(var11, bi.field_I - -no.field_tb[1], param8, param0, -1);
                var16 = param1 + "%";
                mi.field_B.b(var16, bi.field_I + no.field_tb[2], param8, param0, -1);
                var17 = param3 + "%";
                mi.field_B.b(var17, bi.field_I + no.field_tb[3], param8, param0, -1);
                var18 = param7 + "%";
                mi.field_B.b(var18, bi.field_I + no.field_tb[4], param8, param0, -1);
                break L0;
              } else {
                var11 = param2.substring(0, var12) + "...";
                var12--;
                continue L6;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var10 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var10);
            stackOut_21_1 = new StringBuilder().append("lc.B(").append(param0).append(',').append(param1).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param2 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L8;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    private final void b(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        L0: {
          var4 = ArcanistsMulti.field_G ? 1 : 0;
          if (!param0) {
            break L0;
          } else {
            this.field_g = (so) null;
            break L0;
          }
        }
        L1: {
          if (!this.a((byte) -46, 0)) {
            stackOut_4_0 = 1;
            stackIn_5_0 = stackOut_4_0;
            break L1;
          } else {
            stackOut_3_0 = 0;
            stackIn_5_0 = stackOut_3_0;
            break L1;
          }
        }
        L2: {
          var2 = stackIn_5_0;
          if (this.a((byte) -46, 2)) {
            stackOut_7_0 = 2;
            stackIn_8_0 = stackOut_7_0;
            break L2;
          } else {
            stackOut_6_0 = 1;
            stackIn_8_0 = stackOut_6_0;
            break L2;
          }
        }
        L3: {
          var3 = stackIn_8_0;
          if (!this.field_g.c((byte) 84)) {
            L4: {
              if (96 == vn.field_d) {
                if ((this.field_g.field_h ^ -1) < (var2 ^ -1)) {
                  this.field_g.a(this.field_g.field_h + -1, param0);
                  break L4;
                } else {
                  this.field_g.a(var3, false);
                  break L4;
                }
              } else {
                break L4;
              }
            }
            if (-98 == (vn.field_d ^ -1)) {
              L5: {
                if (0 > this.field_g.field_h) {
                  break L5;
                } else {
                  if ((this.field_g.field_h ^ -1) > (var3 ^ -1)) {
                    this.field_g.a(1 + this.field_g.field_h, false);
                    break L3;
                  } else {
                    break L5;
                  }
                }
              }
              this.field_g.a(var2, false);
              break L3;
            } else {
              break L3;
            }
          } else {
            break L3;
          }
        }
        L6: {
          this.field_g.d(51);
          if (this.a((byte) -46, 0)) {
            stackOut_24_0 = 0;
            stackIn_25_0 = stackOut_24_0;
            break L6;
          } else {
            stackOut_23_0 = 1;
            stackIn_25_0 = stackOut_23_0;
            break L6;
          }
        }
        L7: {
          var2 = stackIn_25_0;
          if (!this.a((byte) -46, 2)) {
            stackOut_27_0 = 1;
            stackIn_28_0 = stackOut_27_0;
            break L7;
          } else {
            stackOut_26_0 = 2;
            stackIn_28_0 = stackOut_26_0;
            break L7;
          }
        }
        L8: {
          var3 = stackIn_28_0;
          if (var2 <= this.field_g.field_h) {
            break L8;
          } else {
            this.field_g.field_h = var2;
            break L8;
          }
        }
        L9: {
          if (var3 < this.field_g.field_h) {
            this.field_g.field_h = var3;
            break L9;
          } else {
            break L9;
          }
        }
    }

    final void e(byte param0) {
        int discarded$2 = 0;
        int discarded$3 = 0;
        le var2 = null;
        int var2_int = 0;
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
        int[] stackIn_20_0 = null;
        int[] stackIn_21_0 = null;
        int[] stackIn_22_0 = null;
        int[] stackIn_23_0 = null;
        int[] stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        int[] stackIn_27_0 = null;
        int[] stackIn_28_0 = null;
        int[] stackIn_29_0 = null;
        int[] stackIn_30_0 = null;
        int[] stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        Object stackIn_103_0 = null;
        int stackIn_103_1 = 0;
        Object stackIn_104_0 = null;
        int stackIn_104_1 = 0;
        Object stackIn_105_0 = null;
        int stackIn_105_1 = 0;
        int stackIn_105_2 = 0;
        int[] stackOut_19_0 = null;
        int[] stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int[] stackOut_20_0 = null;
        int[] stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        int[] stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        int[] stackOut_26_0 = null;
        int[] stackOut_28_0 = null;
        int[] stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        int[] stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        int[] stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        Object stackOut_102_0 = null;
        int stackOut_102_1 = 0;
        Object stackOut_104_0 = null;
        int stackOut_104_1 = 0;
        int stackOut_104_2 = 0;
        Object stackOut_103_0 = null;
        int stackOut_103_1 = 0;
        int stackOut_103_2 = 0;
        var21 = ArcanistsMulti.field_G ? 1 : 0;
        if (cc.c((byte) 118)) {
          pb.a(2341);
          return;
        } else {
          if (param0 == -45) {
            L0: {
              if (lc.a((byte) 112)) {
                break L0;
              } else {
                if (0 < ah.field_c) {
                  ce.field_g[15] = wj.field_e;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
            if (this.field_l == 16) {
              de.b();
              to.field_s.b((byte) -102);
              return;
            } else {
              L1: {
                L2: {
                  if ((this.field_l ^ -1) == -6) {
                    break L2;
                  } else {
                    if (-4 == (this.field_l ^ -1)) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                L3: {
                  var2 = jb.field_z;
                  if (var2 != null) {
                    break L3;
                  } else {
                    var2 = r.field_b;
                    break L3;
                  }
                }
                L4: {
                  var3 = var2.field_V.d(false);
                  if ((var3 ^ -1) <= -1) {
                    break L4;
                  } else {
                    var3 = 6;
                    break L4;
                  }
                }
                L5: {
                  stackOut_19_0 = nj.field_n;
                  stackIn_23_0 = stackOut_19_0;
                  stackIn_20_0 = stackOut_19_0;
                  if ((this.field_l ^ -1) == -4) {
                    stackOut_23_0 = (int[]) ((Object) stackIn_23_0);
                    stackOut_23_1 = var3;
                    stackIn_24_0 = stackOut_23_0;
                    stackIn_24_1 = stackOut_23_1;
                    break L5;
                  } else {
                    stackOut_20_0 = (int[]) ((Object) stackIn_20_0);
                    stackIn_22_0 = stackOut_20_0;
                    stackIn_21_0 = stackOut_20_0;
                    if (-1 >= (var2.field_I ^ -1)) {
                      stackOut_22_0 = (int[]) ((Object) stackIn_22_0);
                      stackOut_22_1 = var2.field_I;
                      stackIn_24_0 = stackOut_22_0;
                      stackIn_24_1 = stackOut_22_1;
                      break L5;
                    } else {
                      stackOut_21_0 = (int[]) ((Object) stackIn_21_0);
                      stackOut_21_1 = 6;
                      stackIn_24_0 = stackOut_21_0;
                      stackIn_24_1 = stackOut_21_1;
                      break L5;
                    }
                  }
                }
                L6: {
                  var4 = stackIn_24_0[stackIn_24_1];
                  if (var2.field_V.field_d) {
                    L7: {
                      stackOut_26_0 = nj.field_n;
                      stackIn_28_0 = stackOut_26_0;
                      stackIn_27_0 = stackOut_26_0;
                      if (-4 != (this.field_l ^ -1)) {
                        stackOut_28_0 = (int[]) ((Object) stackIn_28_0);
                        stackIn_30_0 = stackOut_28_0;
                        stackIn_29_0 = stackOut_28_0;
                        if ((var2.field_I ^ -1) <= -1) {
                          stackOut_30_0 = (int[]) ((Object) stackIn_30_0);
                          stackOut_30_1 = 1 & var3;
                          stackIn_31_0 = stackOut_30_0;
                          stackIn_31_1 = stackOut_30_1;
                          break L7;
                        } else {
                          stackOut_29_0 = (int[]) ((Object) stackIn_29_0);
                          stackOut_29_1 = 6;
                          stackIn_31_0 = stackOut_29_0;
                          stackIn_31_1 = stackOut_29_1;
                          break L7;
                        }
                      } else {
                        stackOut_27_0 = (int[]) ((Object) stackIn_27_0);
                        stackOut_27_1 = 1 & var3;
                        stackIn_31_0 = stackOut_27_0;
                        stackIn_31_1 = stackOut_27_1;
                        break L7;
                      }
                    }
                    var4 = stackIn_31_0[stackIn_31_1];
                    break L6;
                  } else {
                    break L6;
                  }
                }
                var5 = 240;
                var6 = an.field_f / 2;
                var7 = an.field_j / 2;
                var8 = -var5;
                L8: while (true) {
                  if (var8 >= var5) {
                    de.a();
                    break L1;
                  } else {
                    de.h(0, var8 + var7, an.field_f, var8 + var7 + 1);
                    de.c(var6, -4 + -(var8 / 2) + var7, var5, var4, 192);
                    gn.a(var5, (byte) 126, 100, var6, -(var8 / 2) + (var7 - 4));
                    var8++;
                    continue L8;
                  }
                }
              }
              L9: {
                L10: {
                  if (-2 == (this.field_l ^ -1)) {
                    break L10;
                  } else {
                    if (this.field_l == 2) {
                      break L10;
                    } else {
                      if (-5 != (this.field_l ^ -1)) {
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                }
                ti.field_N = -1;
                var2_int = 0;
                L11: while (true) {
                  if (var2_int >= 256) {
                    break L9;
                  } else {
                    de.e(0, var2_int, an.field_f, 0, -var2_int + 256);
                    var2_int++;
                    continue L11;
                  }
                }
              }
              L12: {
                if (14 == this.field_l) {
                  break L12;
                } else {
                  L13: {
                    L14: {
                      ce.field_m.a(true);
                      if (qn.a(this.field_l, (byte) -32)) {
                        break L14;
                      } else {
                        L15: {
                          if (640 < an.field_f) {
                            break L15;
                          } else {
                            if (480 >= an.field_j) {
                              break L14;
                            } else {
                              break L15;
                            }
                          }
                        }
                        sc.a(param0 ^ -47, an.field_j, an.field_f);
                        break L13;
                      }
                    }
                    if (0 != (jb.field_v & 63)) {
                      break L13;
                    } else {
                      pn.field_c = null;
                      break L13;
                    }
                  }
                  if (15 == this.field_l) {
                    wm.field_H[0].c(bi.field_I, uc.field_a);
                    break L12;
                  } else {
                    if (null != wm.field_H[this.field_l]) {
                      wm.field_H[this.field_l].c(bi.field_I, uc.field_a);
                      break L12;
                    } else {
                      lj.a(true, this.field_l);
                      ce.field_m.a(true);
                      break L12;
                    }
                  }
                }
              }
              L16: {
                if (-10 == (this.field_l ^ -1)) {
                  var2_int = (jb.field_v >> 1237709284) % 4;
                  var3 = jb.field_v / 2 % 2400;
                  if (var3 >= 1200) {
                    rc.field_d[var2_int].c();
                    var4 = -var3 + 2200;
                    var4 = an.field_f * var4 / 640;
                    var5 = 0;
                    L17: while (true) {
                      if (3 <= var5) {
                        rc.field_d[var2_int].c();
                        break L16;
                      } else {
                        rc.field_d[var2_int].a(-(var5 * 120) + var4, -(30 * var5) + 200, 32);
                        var5++;
                        continue L17;
                      }
                    }
                  } else {
                    var4 = var3 - 200;
                    var4 = an.field_f * var4 / 640;
                    var5 = 0;
                    L18: while (true) {
                      if (var5 >= 3) {
                        break L16;
                      } else {
                        rc.field_d[var2_int].a(-(120 * var5) + var4, var5 * 30 + 240, 32);
                        var5++;
                        continue L18;
                      }
                    }
                  }
                } else {
                  break L16;
                }
              }
              L19: {
                L20: {
                  if (-2 == (this.field_l ^ -1)) {
                    break L20;
                  } else {
                    if (2 == this.field_l) {
                      break L20;
                    } else {
                      if (4 == this.field_l) {
                        break L20;
                      } else {
                        break L19;
                      }
                    }
                  }
                }
                gl.a(sc.field_U[this.field_l] * wl.field_L[this.field_l].length + 48, -24 + this.d(41, 0), -27327, 48 - (-this.a(0, (byte) 103) + this.d(41, 0)), kf.field_b, this.f(0, -7661) + -24);
                break L19;
              }
              L21: {
                var2 = jb.field_z;
                if (var2 != null) {
                  break L21;
                } else {
                  var2 = r.field_b;
                  break L21;
                }
              }
              L22: {
                if (this.field_l != 2) {
                  break L22;
                } else {
                  if (var2.field_V.d(false) == var2.field_I) {
                    L23: {
                      var3 = 0;
                      var4 = 0;
                      var5 = 0;
                      var6 = 0;
                      var7 = 16;
                      var8 = 0;
                      var9 = -16;
                      var10 = 0;
                      var11 = 0;
                      var12 = var2.field_z / 50;
                      var13 = (-var12 + 160) / 10;
                      if (-1 < (var13 ^ -1)) {
                        var13 = 0;
                        break L23;
                      } else {
                        break L23;
                      }
                    }
                    L24: {
                      var10 = (int)(Math.cos(0.3 * (double)jb.field_v) * (double)var13 - (double)var13);
                      var8 = (int)(Math.cos(5.0 + 0.3 * (double)jb.field_v) * (double)var13 - (double)var13);
                      var14 = 16;
                      if (var12 < 60) {
                        var14 = 17;
                        break L24;
                      } else {
                        break L24;
                      }
                    }
                    L25: {
                      if (30 <= var12) {
                        break L25;
                      } else {
                        var11 = var11 - (int)((double)var13 * Math.cos((double)jb.field_v * 0.4) - (double)var13);
                        var14 = 18;
                        break L25;
                      }
                    }
                    L26: {
                      var15 = 32;
                      var16 = 160;
                      var17 = new qb(128, 256);
                      var17.a();
                      pc.a(kg.field_d[2], -var11 + var16 + var8, kg.field_d[3], kg.field_d[0], (byte) -116, kg.field_d[1], qe.field_i[so.field_c[3]], var7 + var15);
                      if (46 == so.field_c[0]) {
                        break L26;
                      } else {
                        pc.a(kg.field_d[2], -(var11 / 2) + var4 + var16, kg.field_d[3], kg.field_d[0], (byte) -81, kg.field_d[1], fn.field_b[0], var3 + var15);
                        break L26;
                      }
                    }
                    L27: {
                      pc.a(kg.field_d[2], -var11 + var16, kg.field_d[3], kg.field_d[0], (byte) 68, kg.field_d[1], jd.field_j[so.field_c[0]], var15);
                      var16 -= 8;
                      var16 -= 16;
                      pc.a(kg.field_d[2], -var11 + var16, kg.field_d[3], kg.field_d[0], (byte) 43, kg.field_d[1], kc.field_kb[so.field_c[1]], var15);
                      var16 += 16;
                      pc.a(kg.field_d[2], -var11 + var16, kg.field_d[3], kg.field_d[0], (byte) 45, kg.field_d[1], hn.field_d[so.field_c[5]], var15);
                      if (53 == so.field_c[5]) {
                        break L27;
                      } else {
                        if ((so.field_c[5] ^ -1) == -56) {
                          break L27;
                        } else {
                          pc.a(kg.field_d[2], -var11 + var16, kg.field_d[3], kg.field_d[0], (byte) -125, kg.field_d[1], bo.field_a[var14], var15);
                          break L27;
                        }
                      }
                    }
                    L28: {
                      var16 -= 16;
                      pc.a(kg.field_d[2], -var11 + var16, kg.field_d[3], kg.field_d[0], (byte) 2, kg.field_d[1], tj.field_A[so.field_c[4]], var15);
                      var16 += 8;
                      var16 += 16;
                      if (so.field_c[0] == 46) {
                        break L28;
                      } else {
                        pc.a(kg.field_d[2], var16 + (var6 + -(var11 / 2)), kg.field_d[3], kg.field_d[0], (byte) -92, kg.field_d[1], h.field_I[0], var15 + var5);
                        break L28;
                      }
                    }
                    L29: {
                      pc.a(kg.field_d[2], var10 + (var16 - var11), kg.field_d[3], kg.field_d[0], (byte) -111, kg.field_d[1], ea.field_u[so.field_c[2]], var9 + var15);
                      ce.field_m.a(true);
                      var18 = an.field_f - 256;
                      var19 = an.field_j + -128;
                      de.e(var18, var19, 256, 128, 0, 192);
                      de.a(-2 + var18, -2 + var19, 256, 128, 0);
                      de.a(-1 + var18, var19 - 1, 256, 128, 4799269);
                      de.a(var18, var19, 256, 128, 8547138);
                      de.a(var18 - -1, var19 - -1, 256, 128, 11768360);
                      de.a(2 + var18, 2 + var19, 256, 128, 0);
                      var20 = null;
                      if ((var12 ^ -1) <= -61) {
                        if (-11 >= (var12 % 60 ^ -1)) {
                          var20_ref = var12 / 60 + ":" + var12 % 60;
                          break L29;
                        } else {
                          var20_ref = var12 / 60 + ":0" + var12 % 60;
                          break L29;
                        }
                      } else {
                        var20_ref = Integer.toString(var12);
                        break L29;
                      }
                    }
                    var20_ref = tj.a(param0 + 1, new String[]{var20_ref}, im.field_i);
                    var17.e(152 + var18, var19 + -104);
                    discarded$2 = mi.field_B.a(var20_ref, 8 + var18, 8 + var19, 176, 112, 16777215, 0, 0, 0, mi.field_B.field_C - -mi.field_B.field_m);
                    break L22;
                  } else {
                    break L22;
                  }
                }
              }
              L30: {
                if (13 != this.field_l) {
                  var3 = 0;
                  L31: while (true) {
                    if (var3 >= this.field_g.field_f) {
                      break L30;
                    } else {
                      L32: {
                        if (!this.a((byte) -46, var3)) {
                          break L32;
                        } else {
                          L33: {
                            stackOut_102_0 = this;
                            stackOut_102_1 = 98;
                            stackIn_104_0 = stackOut_102_0;
                            stackIn_104_1 = stackOut_102_1;
                            stackIn_103_0 = stackOut_102_0;
                            stackIn_103_1 = stackOut_102_1;
                            if (this.field_g.field_h != var3) {
                              stackOut_104_0 = this;
                              stackOut_104_1 = stackIn_104_1;
                              stackOut_104_2 = 0;
                              stackIn_105_0 = stackOut_104_0;
                              stackIn_105_1 = stackOut_104_1;
                              stackIn_105_2 = stackOut_104_2;
                              break L33;
                            } else {
                              stackOut_103_0 = this;
                              stackOut_103_1 = stackIn_103_1;
                              stackOut_103_2 = 1;
                              stackIn_105_0 = stackOut_103_0;
                              stackIn_105_1 = stackOut_103_1;
                              stackIn_105_2 = stackOut_103_2;
                              break L33;
                            }
                          }
                          this.a((byte) stackIn_105_1, stackIn_105_2 != 0, var3);
                          break L32;
                        }
                      }
                      var3++;
                      continue L31;
                    }
                  }
                } else {
                  break L30;
                }
              }
              L34: {
                if ((this.field_l ^ -1) != -1) {
                  break L34;
                } else {
                  this.c(-26733);
                  break L34;
                }
              }
              L35: {
                if (-7 != (this.field_l ^ -1)) {
                  if (this.field_l == 7) {
                    this.b((byte) 89);
                    break L35;
                  } else {
                    if (this.field_l != 8) {
                      if (this.field_l != 9) {
                        if (11 == this.field_l) {
                          this.i(12);
                          break L35;
                        } else {
                          if (12 == this.field_l) {
                            this.e(1);
                            break L35;
                          } else {
                            if (-15 != (this.field_l ^ -1)) {
                              if (-6 == (this.field_l ^ -1)) {
                                this.h(32);
                                break L35;
                              } else {
                                if (3 != this.field_l) {
                                  break L35;
                                } else {
                                  this.a(true);
                                  break L35;
                                }
                              }
                            } else {
                              this.a(1);
                              break L35;
                            }
                          }
                        }
                      } else {
                        discarded$3 = mi.field_B.a(jm.field_b, bi.field_I + 80, uc.field_a + 140, 480, 180, 0, -1, 0, 1, 30);
                        break L35;
                      }
                    } else {
                      this.e(true);
                      break L35;
                    }
                  }
                } else {
                  this.d(true);
                  break L35;
                }
              }
              L36: {
                L37: {
                  if ((this.field_l ^ -1) == -1) {
                    break L37;
                  } else {
                    if (-16 == (this.field_l ^ -1)) {
                      break L37;
                    } else {
                      if (this.field_l == 13) {
                        break L37;
                      } else {
                        break L36;
                      }
                    }
                  }
                }
                var3 = -208 + an.field_f;
                var4 = an.field_j + -40;
                var5 = 200 * (wn.field_C + jo.field_c + be.field_f) / 127;
                var6 = 11176106;
                var7 = 34;
                if (200 > var5) {
                  de.h(var3, var4, var3 + var5, var4 - -32);
                  de.b(var3, var4, 200, 32, 15, var6, var7);
                  mi.field_B.b(pi.field_e, var3 - -100, var4 + 19, 16777215, 0);
                  de.h(var5 + var3, var4, 200 + var3, var4 + 32);
                  de.b(var3, var4, 200, 32, 15, var6 >> 593151617 & 8355711, var7);
                  mi.field_B.b(pi.field_e, var3 - -100, var4 - -19, 0, 16777215);
                  de.a();
                  de.a(var3, var4, 200, 32, 15, 0);
                  break L36;
                } else {
                  break L36;
                }
              }
              return;
            }
          } else {
            return;
          }
        }
    }

    public static void c(boolean param0) {
        boolean discarded$0 = false;
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
            discarded$0 = lc.a((byte) -10);
        }
    }

    private final int a(int param0, byte param1) {
        if (param1 != 103) {
            return -6;
        }
        return this.a(-9, param0) + bi.field_I;
    }

    private final void g(int param0) {
        boolean discarded$23 = false;
        int discarded$22 = mi.field_B.a(hg.field_c, 64 + bi.field_I, 128 + uc.field_a, 512, 224, 0, -1, 1, 1, mi.field_B.field_m + mi.field_B.field_C);
        if (param0 != 12) {
            discarded$23 = lc.a((byte) -6);
        }
    }

    private final boolean g(int param0, int param1) {
        int var3 = param0 / 8;
        if ((wd.field_d ^ -1) >= (var3 ^ -1)) {
            return false;
        }
        int var4 = 7 - (7 & param0);
        if (!(param1 == (1 << var4 & ra.field_f[var3]))) {
            return true;
        }
        if (2 <= qf.field_d) {
            return true;
        }
        return false;
    }

    private final void c(byte param0) {
        int var2 = -61 % ((-38 - param0) / 46);
        this.field_g.a(82, 2);
    }

    private final int a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = ArcanistsMulti.field_G ? 1 : 0;
        if (!(this.field_l != 10)) {
            return -1;
        }
        if (param0 != 88) {
            return 124;
        }
        for (var4 = 0; (wl.field_L[this.field_l].length ^ -1) < (var4 ^ -1); var4++) {
            var5 = this.f(var4, param0 ^ -7605);
            if (this.a((byte) -46, var4)) {
                if (param1 >= this.d(41, var4)) {
                    if (this.a(var4, (byte) 103) > param1) {
                        if ((var5 ^ -1) >= (param2 ^ -1)) {
                            if (!(param2 >= var5 - -this.c(var4, 113))) {
                                return var4;
                            }
                        }
                    }
                }
            }
        }
        return -1;
    }

    private final int e(int param0, int param1) {
        if ((this.field_l ^ -1) == -16) {
          return 75 + (param0 * sc.field_U[this.field_l] + tg.field_f[this.field_l]);
        } else {
          L0: {
            if (2 == this.field_l) {
              break L0;
            } else {
              if (this.field_l == 4) {
                break L0;
              } else {
                if (-2 != (this.field_l ^ -1)) {
                  if ((this.field_l ^ -1) != -7) {
                    if (-8 != (this.field_l ^ -1)) {
                      if ((this.field_l ^ -1) != -12) {
                        if (12 != this.field_l) {
                          L1: {
                            if (param1 == 75) {
                              break L1;
                            } else {
                              this.g(-100);
                              break L1;
                            }
                          }
                          L2: {
                            if ((this.field_l ^ -1) != -15) {
                              break L2;
                            } else {
                              if (wl.field_L[this.field_l][param0] == 25) {
                                return 348;
                              } else {
                                if (wl.field_L[this.field_l][param0] != 26) {
                                  if (-31 == (wl.field_L[this.field_l][param0] ^ -1)) {
                                    return 412;
                                  } else {
                                    if (29 == wl.field_L[this.field_l][param0]) {
                                      return 380;
                                    } else {
                                      if (-8 != (wl.field_L[this.field_l][param0] ^ -1)) {
                                        break L2;
                                      } else {
                                        return 444;
                                      }
                                    }
                                  }
                                } else {
                                  return 348;
                                }
                              }
                            }
                          }
                          if ((this.field_l ^ -1) != -4) {
                            if (-9 != (this.field_l ^ -1)) {
                              return tg.field_f[this.field_l] + param0 * sc.field_U[this.field_l];
                            } else {
                              if (param0 == 3) {
                                return tg.field_f[this.field_l];
                              } else {
                                return tg.field_f[this.field_l] + 1 * sc.field_U[this.field_l];
                              }
                            }
                          } else {
                            L3: {
                              if ((param0 ^ -1) != -2) {
                                break L3;
                              } else {
                                if (jb.field_z != null) {
                                  break L3;
                                } else {
                                  return 410 + sc.field_U[this.field_l] / 2;
                                }
                              }
                            }
                            return 410 - -(param0 * sc.field_U[this.field_l]);
                          }
                        } else {
                          return tg.field_f[this.field_l];
                        }
                      } else {
                        return tg.field_f[this.field_l];
                      }
                    } else {
                      return tg.field_f[this.field_l];
                    }
                  } else {
                    if (lc.a((byte) 112)) {
                      return sc.field_U[this.field_l] * param0 + tg.field_f[this.field_l];
                    } else {
                      return sc.field_U[this.field_l] + tg.field_f[this.field_l];
                    }
                  }
                } else {
                  break L0;
                }
              }
            }
          }
          return -32 + (param0 + -wl.field_L[this.field_l].length) * sc.field_U[this.field_l] - -480;
        }
    }

    lc(int param0) {
        this.field_d = 0;
        this.field_l = param0;
        if (null != wl.field_L[this.field_l]) {
            this.field_g = new so(wl.field_L[this.field_l].length);
        } else {
            this.field_g = null;
        }
    }

    final void b(int param0) {
        int var2 = 0;
        hf var2_ref_hf = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        hf stackIn_36_0 = null;
        hf stackIn_37_0 = null;
        hf stackIn_38_0 = null;
        hf stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        int stackIn_47_0 = 0;
        int[][] stackIn_134_0 = null;
        int stackIn_134_1 = 0;
        int[][] stackIn_134_2 = null;
        int stackIn_134_3 = 0;
        int[][] stackIn_135_0 = null;
        int stackIn_135_1 = 0;
        int[][] stackIn_135_2 = null;
        int stackIn_135_3 = 0;
        int[][] stackIn_136_0 = null;
        int stackIn_136_1 = 0;
        int[][] stackIn_136_2 = null;
        int stackIn_136_3 = 0;
        int stackIn_136_4 = 0;
        hf stackOut_35_0 = null;
        hf stackOut_36_0 = null;
        hf stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        hf stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
        int[][] stackOut_133_0 = null;
        int stackOut_133_1 = 0;
        int[][] stackOut_133_2 = null;
        int stackOut_133_3 = 0;
        int[][] stackOut_135_0 = null;
        int stackOut_135_1 = 0;
        int[][] stackOut_135_2 = null;
        int stackOut_135_3 = 0;
        int stackOut_135_4 = 0;
        int[][] stackOut_134_0 = null;
        int stackOut_134_1 = 0;
        int[][] stackOut_134_2 = null;
        int stackOut_134_3 = 0;
        int stackOut_134_4 = 0;
        L0: {
          var5 = ArcanistsMulti.field_G ? 1 : 0;
          if (param0 > 76) {
            break L0;
          } else {
            this.field_h = -27;
            break L0;
          }
        }
        L1: {
          fo.field_k = fo.field_k + 1;
          if (cc.c((byte) 118)) {
            var2 = ii.a(89);
            if (-3 == (var2 ^ -1)) {
              dm.g((byte) -96);
              break L1;
            } else {
              return;
            }
          } else {
            break L1;
          }
        }
        L2: {
          if (kh.field_b) {
            break L2;
          } else {
            if (!oc.field_g) {
              L3: while (true) {
                if (!ib.b(false)) {
                  this.field_g.a(this.a((byte) 88, an.field_g, me.field_I), this.a((byte) 88, pb.field_h, ja.field_s), -97);
                  if (this.field_g.field_h == -1) {
                    break L2;
                  } else {
                    this.a(true, this.field_g.field_h, false);
                    break L2;
                  }
                } else {
                  L4: {
                    if (vn.field_d != 13) {
                      break L4;
                    } else {
                      if (this.field_l == 0) {
                        break L4;
                      } else {
                        L5: {
                          if (5 == this.field_l) {
                            break L5;
                          } else {
                            if (this.field_l == 1) {
                              break L5;
                            } else {
                              if (2 == this.field_l) {
                                break L5;
                              } else {
                                if (3 == this.field_l) {
                                  break L5;
                                } else {
                                  if (this.field_l != 4) {
                                    gj.a(false, true, th.field_f, th.field_f);
                                    continue L3;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                            }
                          }
                        }
                        gj.a(false, true, -1, mn.field_r);
                        continue L3;
                      }
                    }
                  }
                  this.d(111);
                  if (0 != (this.field_g.field_h ^ -1)) {
                    this.a(false, this.field_g.field_h, false);
                    continue L3;
                  } else {
                    continue L3;
                  }
                }
              }
            } else {
              break L2;
            }
          }
        }
        L6: {
          if (-14 != (this.field_l ^ -1)) {
            break L6;
          } else {
            L7: {
              o.field_s = o.field_s + 1;
              if (o.field_s > 100) {
                break L7;
              } else {
                if (-1 != (wk.field_m ^ -1)) {
                  break L7;
                } else {
                  if (ri.field_b[84]) {
                    break L7;
                  } else {
                    break L6;
                  }
                }
              }
            }
            gj.a(false, true, 0, mn.field_r);
            break L6;
          }
        }
        L8: {
          if (-9 != (this.field_l ^ -1)) {
            break L8;
          } else {
            this.f(-1);
            break L8;
          }
        }
        L9: {
          if (16 != this.field_l) {
            break L9;
          } else {
            L10: {
              L11: {
                var2_ref_hf = to.field_s;
                stackOut_35_0 = (hf) (var2_ref_hf);
                stackIn_38_0 = stackOut_35_0;
                stackIn_36_0 = stackOut_35_0;
                if (rc.b(-1)) {
                  break L11;
                } else {
                  stackOut_36_0 = (hf) ((Object) stackIn_36_0);
                  stackIn_38_0 = stackOut_36_0;
                  stackIn_37_0 = stackOut_36_0;
                  if ((mn.field_r ^ -1) != (this.field_l ^ -1)) {
                    break L11;
                  } else {
                    stackOut_37_0 = (hf) ((Object) stackIn_37_0);
                    stackOut_37_1 = 1;
                    stackIn_39_0 = stackOut_37_0;
                    stackIn_39_1 = stackOut_37_1;
                    break L10;
                  }
                }
              }
              stackOut_38_0 = (hf) ((Object) stackIn_38_0);
              stackOut_38_1 = 0;
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              break L10;
            }
            var3 = ((hf) (Object) stackIn_39_0).a(stackIn_39_1 != 0, true);
            if (var3 != 3) {
              L12: {
                if (var3 == 1) {
                  break L12;
                } else {
                  if (var3 != 2) {
                    break L9;
                  } else {
                    break L12;
                  }
                }
              }
              L13: {
                if (var3 != 2) {
                  stackOut_46_0 = 0;
                  stackIn_47_0 = stackOut_46_0;
                  break L13;
                } else {
                  stackOut_45_0 = 1;
                  stackIn_47_0 = stackOut_45_0;
                  break L13;
                }
              }
              var4 = stackIn_47_0;
              gj.a(var4 != 0, true, 0, mn.field_r);
              break L9;
            } else {
              break L9;
            }
          }
        }
        L14: {
          if ((this.field_l ^ -1) != -6) {
            break L14;
          } else {
            o.field_s = o.field_s + 1;
            if (-251 <= (o.field_s ^ -1)) {
              break L14;
            } else {
              gj.a(true, true, -1, mn.field_r);
              break L14;
            }
          }
        }
        L15: {
          if (3 == this.field_l) {
            break L15;
          } else {
            break L15;
          }
        }
        L16: {
          if (this.field_l == 12) {
            L17: {
              if (-2 == (re.field_r ^ -1)) {
                L18: {
                  if (this.field_m != 10) {
                    break L18;
                  } else {
                    this.field_d = this.field_d + this.field_i;
                    break L18;
                  }
                }
                L19: {
                  L20: {
                    L21: {
                      if (1 == this.field_m) {
                        var2 = 0;
                        var3 = 0;
                        L22: while (true) {
                          if ((var3 ^ -1) <= -17) {
                            if (var2 == 0) {
                              var3 = 0;
                              L23: while (true) {
                                if (var3 >= 16) {
                                  break L21;
                                } else {
                                  L24: {
                                    if (-1 == b.field_f[var3]) {
                                      b.field_f[var3] = this.field_i;
                                      this.field_i = -1;
                                      break L24;
                                    } else {
                                      break L24;
                                    }
                                  }
                                  var3++;
                                  continue L23;
                                }
                              }
                            } else {
                              if ((this.field_m ^ -1) != -3) {
                                break L19;
                              } else {
                                var2 = this.field_i;
                                L25: while (true) {
                                  if (-16 >= (var2 ^ -1)) {
                                    break L20;
                                  } else {
                                    b.field_f[var2] = b.field_f[1 + var2];
                                    var2++;
                                    continue L25;
                                  }
                                }
                              }
                            }
                          } else {
                            L26: {
                              if (this.field_i != b.field_f[var3]) {
                                break L26;
                              } else {
                                var2 = 1;
                                this.field_i = var3;
                                this.field_m = 2;
                                break L26;
                              }
                            }
                            var3++;
                            continue L22;
                          }
                        }
                      } else {
                        break L21;
                      }
                    }
                    if ((this.field_m ^ -1) != -3) {
                      break L19;
                    } else {
                      var2 = this.field_i;
                      L27: while (true) {
                        if (-16 >= (var2 ^ -1)) {
                          break L20;
                        } else {
                          b.field_f[var2] = b.field_f[1 + var2];
                          var2++;
                          continue L27;
                        }
                      }
                    }
                  }
                  b.field_f[15] = -1;
                  break L19;
                }
                L28: {
                  if (-1 != (this.field_m ^ -1)) {
                    break L28;
                  } else {
                    this.field_h = this.field_i;
                    break L28;
                  }
                }
                L29: {
                  if (-6 == (this.field_m ^ -1)) {
                    if ((jf.field_j ^ -1) > (5 + ua.field_P ^ -1)) {
                      break L29;
                    } else {
                      bg.a(2, this.field_h * 8 + -14);
                      break L29;
                    }
                  } else {
                    break L29;
                  }
                }
                L30: {
                  if ((this.field_m ^ -1) != -8) {
                    break L30;
                  } else {
                    if (2 + ua.field_P > jf.field_j) {
                      break L30;
                    } else {
                      bg.a(2, -13 + this.field_h * 8 + (-1 + this.field_i % 12) / 2);
                      break L30;
                    }
                  }
                }
                L31: {
                  if ((this.field_m ^ -1) == -9) {
                    if ((3 + ua.field_P ^ -1) < (jf.field_j ^ -1)) {
                      break L31;
                    } else {
                      bg.a(2, this.field_i % 12 + this.field_h * 8 + -18);
                      break L31;
                    }
                  } else {
                    break L31;
                  }
                }
                if (-10 != (this.field_m ^ -1)) {
                  break L17;
                } else {
                  if (!ri.field_b[82]) {
                    break L17;
                  } else {
                    bb.c((byte) -120);
                    break L17;
                  }
                }
              } else {
                break L17;
              }
            }
            var2 = 0;
            L32: while (true) {
              var2 = 0;
              var3 = 0;
              L33: while (true) {
                if (var3 >= 15) {
                  if (var2 != 0) {
                    continue L32;
                  } else {
                    break L16;
                  }
                } else {
                  L34: {
                    L35: {
                      if (0 == (b.field_f[var3] ^ -1)) {
                        break L35;
                      } else {
                        if (b.field_f[1 + var3] >= b.field_f[var3]) {
                          break L34;
                        } else {
                          break L35;
                        }
                      }
                    }
                    if (b.field_f[var3 + 1] != -1) {
                      var4 = b.field_f[var3];
                      b.field_f[var3] = b.field_f[var3 - -1];
                      b.field_f[1 + var3] = var4;
                      var2 = 1;
                      break L34;
                    } else {
                      break L34;
                    }
                  }
                  var3++;
                  continue L33;
                }
              }
            }
          } else {
            break L16;
          }
        }
        L36: {
          if (-12 == (this.field_l ^ -1)) {
            L37: {
              if (1 == re.field_r) {
                L38: {
                  if (this.field_m == 0) {
                    so.field_c[this.field_h] = this.field_i;
                    break L38;
                  } else {
                    break L38;
                  }
                }
                L39: {
                  if ((this.field_m ^ -1) != -7) {
                    break L39;
                  } else {
                    this.field_n = this.field_n + this.field_i;
                    break L39;
                  }
                }
                L40: {
                  if (-9 != (this.field_m ^ -1)) {
                    break L40;
                  } else {
                    break L40;
                  }
                }
                L41: {
                  if (1 != this.field_m) {
                    break L41;
                  } else {
                    this.field_h = this.field_i;
                    this.field_n = 0;
                    break L41;
                  }
                }
                L42: {
                  if (this.field_m == 2) {
                    kg.field_d[0] = ld.field_n[this.field_i];
                    break L42;
                  } else {
                    break L42;
                  }
                }
                L43: {
                  if (3 == this.field_m) {
                    kg.field_d[1] = ud.field_z[this.field_i];
                    break L43;
                  } else {
                    break L43;
                  }
                }
                L44: {
                  if (4 != this.field_m) {
                    break L44;
                  } else {
                    kg.field_d[2] = ug.field_d[this.field_i];
                    break L44;
                  }
                }
                L45: {
                  if (this.field_m == 5) {
                    kg.field_d[3] = hi.field_b[this.field_i];
                    break L45;
                  } else {
                    break L45;
                  }
                }
                if ((this.field_m ^ -1) == -8) {
                  L46: {
                    so.field_c[0] = (int)(12.0 * Math.random());
                    so.field_c[1] = (int)(18.0 * Math.random() * 3.0);
                    so.field_c[2] = (int)(Math.random() * 12.0);
                    so.field_c[3] = (int)(12.0 * Math.random());
                    so.field_c[4] = (int)(3.0 * (14.0 * Math.random()));
                    so.field_c[5] = (int)(3.0 * (14.0 * Math.random()));
                    kg.field_d[0] = ld.field_n[(int)(Math.random() * (double)ld.field_n.length)];
                    kg.field_d[1] = ud.field_z[(int)(Math.random() * (double)ud.field_z.length)];
                    kg.field_d[2] = ug.field_d[(int)(Math.random() * (double)ug.field_d.length)];
                    stackOut_133_0 = kg.field_d;
                    stackOut_133_1 = 3;
                    stackOut_133_2 = hi.field_b;
                    stackOut_133_3 = (int)(Math.random() * (double)hi.field_b.length);
                    stackIn_135_0 = stackOut_133_0;
                    stackIn_135_1 = stackOut_133_1;
                    stackIn_135_2 = stackOut_133_2;
                    stackIn_135_3 = stackOut_133_3;
                    stackIn_134_0 = stackOut_133_0;
                    stackIn_134_1 = stackOut_133_1;
                    stackIn_134_2 = stackOut_133_2;
                    stackIn_134_3 = stackOut_133_3;
                    if (Math.random() >= 1.1) {
                      stackOut_135_0 = (int[][]) ((Object) stackIn_135_0);
                      stackOut_135_1 = stackIn_135_1;
                      stackOut_135_2 = (int[][]) ((Object) stackIn_135_2);
                      stackOut_135_3 = stackIn_135_3;
                      stackOut_135_4 = 8;
                      stackIn_136_0 = stackOut_135_0;
                      stackIn_136_1 = stackOut_135_1;
                      stackIn_136_2 = stackOut_135_2;
                      stackIn_136_3 = stackOut_135_3;
                      stackIn_136_4 = stackOut_135_4;
                      break L46;
                    } else {
                      stackOut_134_0 = (int[][]) ((Object) stackIn_134_0);
                      stackOut_134_1 = stackIn_134_1;
                      stackOut_134_2 = (int[][]) ((Object) stackIn_134_2);
                      stackOut_134_3 = stackIn_134_3;
                      stackOut_134_4 = 5;
                      stackIn_136_0 = stackOut_134_0;
                      stackIn_136_1 = stackOut_134_1;
                      stackIn_136_2 = stackOut_134_2;
                      stackIn_136_3 = stackOut_134_3;
                      stackIn_136_4 = stackOut_134_4;
                      break L46;
                    }
                  }
                  stackIn_136_0[stackIn_136_1] = stackIn_136_2[stackIn_136_3 % stackIn_136_4];
                  break L37;
                } else {
                  break L37;
                }
              } else {
                break L37;
              }
            }
            this.field_f = this.field_f + 0.4;
            break L36;
          } else {
            this.field_f = 0.0;
            break L36;
          }
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
}
