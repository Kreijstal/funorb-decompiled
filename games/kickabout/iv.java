/*
 * Decompiled by CFR-JS 0.4.0.
 */
class iv extends am {
    static String field_n;
    static wu field_o;

    final static void a(cn param0, byte param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        hd var4 = null;
        hd var5 = null;
        hd var6 = null;
        hd var7 = null;
        io[] var8 = null;
        int[][] var9 = null;
        int[][] var10 = null;
        int var15_int = 0;
        boolean[] var15 = null;
        String[] var16 = null;
        String[] var17 = null;
        int var18 = 0;
        int var20 = 0;
        int var21 = 0;
        int[][] var27 = null;
        int[][] var28 = null;
        int[][] var34 = null;
        int[][] var35 = null;
        int[] var41 = null;
        int[] var42 = null;
        int[] var43 = null;
        int[] var44 = null;
        int[] var45 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var21 = Kickabout.field_G;
        try {
          L0: {
            var2_int = param0.a(ge.field_o[16]);
            var3 = param0.a(ge.field_o[17]);
            jg.a(Math.max(var2_int, var3), param0, (byte) -46);
            var4 = new hd();
            var4.field_R = bn.field_B;
            var5 = new hd();
            var6 = new hd();
            var6.field_N = rk.field_g;
            var7 = new hd();
            var7.field_N = rk.field_g.b();
            var7.field_N.a();
            be.field_q = new hd();
            be.field_q.field_y = 14540253;
            be.field_q.field_p = 1;
            be.field_q.field_A = 1;
            be.field_q.field_X = (hu) ((Object) un.field_d);
            rr.field_b = new ji("scrollbar", var6, var7, var5, var4, true);
            it.field_m = new ji("scrollbar", be.field_q, be.field_q, be.field_q, be.field_q, true);
            ug.field_b = new ut[2][2];
            ug.field_b[0][0] = nm.a(16679959, -87, qt.field_u);
            ug.field_b[0][1] = nm.a(16679959, -104, mg.field_g);
            ug.field_b[1][0] = nm.a(7126504, -119, qt.field_u);
            ug.field_b[1][1] = nm.a(7126504, -76, mg.field_g);
            var8 = new io[57];
            var8[0] = new io(-2, 7465472, 0);
            var8[1] = new io(-2, 15147554, 1);
            var8[2] = new io(-2, 7126504, 2);
            var8[3] = new io(-2, 7126504, 3);
            var8[4] = new io(-1, 7126504, 4);
            var8[29] = new io(291, 7126504, 4);
            var8[5] = new io(291, 7126504, 5);
            var8[6] = new io(-2, 16777215, 6);
            var8[7] = new io(-4, 7126504, 7);
            var8[8] = new io(291, 15147554, 8);
            var8[9] = new io(291, 7126504, 9);
            var8[10] = new io(291, 7126504, 10);
            var8[11] = new io(-2, 16777215, 11);
            var8[12] = new io(291, 15147554, 12);
            var8[55] = new io(291, 15147554, 55);
            var8[13] = new io(-4, 7126504, 13);
            var8[14] = new io(-4, 7126504, 14);
            var8[15] = new io(-1, 7126504, 15);
            var8[16] = new io(291, 7126504, 16);
            var8[17] = new io(291, 7126504, 17);
            var8[18] = new io(-2, 7126504, 18);
            var8[19] = new io(-4, 7126504, 19);
            var8[20] = new io(-2, 16777215, 20);
            var8[21] = new io(-1, 16777215, 21);
            var8[22] = new io(-1, 16777215, 22);
            var8[23] = new io(-2, 16679959, 23);
            var8[24] = new io(-1, 7126504, 24);
            var8[25] = new io(-2, 7126504, 25);
            var8[26] = new io(-2, 16679959, 26);
            var8[27] = new io(-1, 7126504, 27);
            var8[28] = new io(-2, 16679959, 28);
            var8[30] = new io(291, 7126504, 30);
            var8[31] = new io(291, 7126504, 24);
            var8[32] = new io(291, 7126504, 32);
            var8[49] = new io(291, 7126504, 49);
            var8[33] = new io(-2, 7126504, 33);
            var8[34] = new io(-2, 7126504, 34);
            var8[35] = new io(-2, 7126504, 35);
            var8[36] = new io(-2, 7126504, 36);
            var8[37] = new io(-5, 7126504, 37);
            var8[42] = new io(-4, 7126504, 42);
            var8[43] = new io(-4, 7126504, 43);
            var8[45] = new io(-2, 16679959, 45);
            var8[48] = new io(-2, 16679959, 48);
            var8[46] = new io(-2, 16679959, 46);
            un.field_b = new qt[27];
            un.field_b[0] = (qt) ((Object) new sf());
            un.field_b[17] = new qt();
            un.field_b[5] = new qt();
            un.field_b[6] = new qt();
            un.field_b[2] = new qt();
            un.field_b[3] = new qt();
            un.field_b[4] = new qt();
            un.field_b[1] = new qt();
            un.field_b[9] = (qt) ((Object) new fm());
            un.field_b[7] = (qt) ((Object) new rm());
            un.field_b[13] = new qt();
            un.field_b[14] = (qt) ((Object) new fw());
            un.field_b[8] = new qt();
            un.field_b[19] = (qt) ((Object) new ne());
            un.field_b[20] = (qt) ((Object) new ra());
            un.field_b[21] = (qt) ((Object) new qa());
            un.field_b[22] = (qt) ((Object) new df());
            un.field_b[12] = new qt();
            un.field_b[10] = (qt) ((Object) new rq());
            un.field_b[11] = (qt) ((Object) new bd());
            un.field_b[15] = (qt) ((Object) new bn());
            un.field_b[16] = (qt) ((Object) new wf());
            un.field_b[18] = (qt) ((Object) new ud());
            un.field_b[23] = (qt) ((Object) new qs());
            un.field_b[24] = (qt) ((Object) new ja());
            un.field_b[25] = (qt) ((Object) new b());
            un.field_b[26] = (qt) ((Object) new sc());
            var35 = new int[27][];
            var28 = var35;
            var9 = var28;
            var9[24] = new int[]{7, 37};
            var9[13] = new int[]{46, 48, 28, 45, 26, 7};
            var9[21] = new int[]{21, 42, 22};
            var9[23] = new int[]{42, 37};
            var9[4] = new int[]{2, 31, 29, 12};
            var9[2] = new int[]{2, 31, 29, 9, 10, 12};
            var9[8] = new int[]{33, 34, 36, 35, 7};
            var9[1] = new int[]{2, 31, 29, 8};
            var9[22] = new int[]{21, 42, 22};
            var9[10] = new int[]{7};
            var9[19] = new int[]{21, 42, 22};
            var9[15] = new int[]{7, 37};
            var9[25] = new int[]{42, 37};
            var9[17] = new int[]{25, 3, 18, 7};
            var9[20] = new int[]{21, 42, 22};
            var9[9] = new int[]{7};
            var9[0] = new int[]{0, 1, 23, 4, 27, 24, 15};
            var9[14] = new int[]{7, 37};
            var9[3] = new int[]{2, 31, 29, 10, 55, 12};
            var9[5] = new int[]{2, 31, 29, 12};
            var9[6] = new int[]{2, 31, 29, 55, 12};
            var9[7] = new int[]{13, 14, 7};
            var9[16] = new int[]{42, 37};
            var9[12] = new int[]{16, 17, 30, 32, 49, 5, 7};
            var34 = new int[27][];
            var27 = var34;
            var10 = var27;
            var10[15] = new int[]{19, 43, 37};
            var10[9] = new int[]{19, 43};
            var10[16] = new int[]{19, 43, 37};
            var10[7] = new int[]{19, 43};
            var41 = new int[27];
            var41[1] = 4;
            var41[4] = 4;
            var41[3] = 6;
            var41[13] = 5;
            var41[5] = 4;
            var41[8] = 4;
            var41[0] = 5;
            var41[2] = 6;
            var41[17] = 3;
            var41[6] = 5;
            var41[12] = 6;
            var42 = new int[27];
            var42[7] = 3;
            var43 = new int[27];
            var43[22] = 30;
            var43[7] = 30;
            var43[11] = 30;
            var43[16] = 40;
            var43[21] = 30;
            var43[12] = 30;
            var43[3] = 20;
            var43[13] = 20;
            var43[15] = 30;
            var43[26] = 20;
            var43[24] = 50;
            var43[8] = 25;
            var43[17] = 20;
            var43[9] = 30;
            var43[4] = 20;
            var43[1] = 20;
            var43[14] = 30;
            var43[25] = 50;
            var43[5] = 20;
            var43[23] = 50;
            var43[6] = 20;
            var43[20] = 30;
            var43[10] = 20;
            var43[19] = 30;
            var43[0] = 10;
            var43[2] = 20;
            var43[18] = 100;
            var44 = new int[27];
            var15_int = 0;
            L1: while (true) {
              if (-28 >= (var15_int ^ -1)) {
                var44[21] = 1;
                var44[15] = 1;
                var44[23] = 0;
                var44[14] = 0;
                var44[19] = 1;
                var44[7] = 1;
                var44[16] = 0;
                var44[24] = 0;
                var44[20] = 1;
                var44[9] = 1;
                var44[22] = 1;
                var44[25] = 0;
                var15 = new boolean[27];
                var15[13] = true;
                var15[23] = true;
                var15[7] = true;
                var15[8] = true;
                var15[25] = true;
                var15[9] = true;
                var15[16] = true;
                var15[24] = true;
                var15[12] = true;
                var15[19] = true;
                var15[17] = true;
                var15[15] = true;
                var15[21] = true;
                var15[20] = true;
                var15[22] = true;
                var15[14] = true;
                var15[10] = true;
                var16 = new String[27];
                var16[22] = uq.field_e;
                var16[25] = he.field_Bb;
                var16[19] = uq.field_e;
                var16[9] = ah.field_b;
                var16[7] = ah.field_b;
                var18 = 101 % ((param1 - -68) / 52);
                var16[20] = uq.field_e;
                var16[24] = he.field_Bb;
                var16[16] = he.field_Bb;
                var16[15] = ah.field_b;
                var16[14] = he.field_Bb;
                var16[23] = he.field_Bb;
                var16[21] = uq.field_e;
                var17 = new String[27];
                var17[23] = us.field_g.toLowerCase();
                var17[24] = ii.field_h.toLowerCase();
                var17[25] = oc.field_b.toLowerCase();
                var17[14] = pr.field_b.toLowerCase();
                var17[20] = np.field_Gb;
                var17[9] = tq.field_C;
                var17[22] = ar.field_e;
                var17[16] = ar.field_e;
                var17[7] = fc.field_b;
                var17[21] = ss.field_f;
                var17[15] = ss.field_f;
                var17[19] = wd.field_g;
                var45 = new int[27];
                var45[23] = 440;
                var45[7] = 390;
                var45[9] = 390;
                var45[19] = 630;
                var45[24] = 410;
                var45[14] = 390;
                var45[15] = 390;
                var45[21] = 630;
                var45[22] = 630;
                var45[16] = 430;
                var45[20] = 630;
                var20 = 0;
                L2: while (true) {
                  if (var20 >= 27) {
                    break L0;
                  } else {
                    L3: {
                      if (un.field_b[var20] != null) {
                        un.field_b[var20].a(var16[var20], var41[var20], var42[var20], -46, var17[var20], rr.a(var34[var20], var8, 0), rr.a(var35[var20], var8, 0), var45[var20], var15[var20], var44[var20], var20, var43[var20]);
                        un.field_b[var20].b(-38);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var20++;
                    continue L2;
                  }
                }
              } else {
                var44[var15_int] = -1;
                var15_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var2);
            stackOut_11_1 = new StringBuilder().append("iv.N(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
    }

    public static void a(boolean param0) {
        field_o = null;
        field_n = null;
        if (param0) {
            field_o = (wu) null;
        }
    }

    final static String a(int param0, boolean param1, CharSequence param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        String stackIn_14_0 = null;
        String stackIn_19_0 = null;
        String stackIn_29_0 = null;
        String stackIn_34_0 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_33_0 = null;
        String stackOut_28_0 = null;
        String stackOut_18_0 = null;
        String stackOut_13_0 = null;
        String stackOut_8_0 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        var8 = Kickabout.field_G;
        try {
          L0: {
            if (param2 == null) {
              stackOut_3_0 = wb.field_m;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var3_int = param2.length();
                if (-2 < (var3_int ^ -1)) {
                  break L1;
                } else {
                  if (-13 > (var3_int ^ -1)) {
                    break L1;
                  } else {
                    L2: {
                      var4 = mo.a(0, param2);
                      if (var4 == null) {
                        break L2;
                      } else {
                        if (var4.length() >= 1) {
                          L3: {
                            if (ca.a(false, var4.charAt(0))) {
                              break L3;
                            } else {
                              if (ca.a(false, var4.charAt(-1 + var4.length()))) {
                                break L3;
                              } else {
                                var5 = 0;
                                var6 = 0;
                                L4: while (true) {
                                  if (var6 >= param2.length()) {
                                    if (var5 > param0) {
                                      stackOut_33_0 = tb.field_r;
                                      stackIn_34_0 = stackOut_33_0;
                                      decompiledRegionSelector0 = 5;
                                      break L0;
                                    } else {
                                      return null;
                                    }
                                  } else {
                                    L5: {
                                      var7 = param2.charAt(var6);
                                      if (!ca.a(false, (char) var7)) {
                                        var5 = 0;
                                        break L5;
                                      } else {
                                        var5++;
                                        break L5;
                                      }
                                    }
                                    L6: {
                                      if (var5 < 2) {
                                        break L6;
                                      } else {
                                        if (!param1) {
                                          stackOut_28_0 = lb.field_N;
                                          stackIn_29_0 = stackOut_28_0;
                                          decompiledRegionSelector0 = 4;
                                          break L0;
                                        } else {
                                          break L6;
                                        }
                                      }
                                    }
                                    var6++;
                                    continue L4;
                                  }
                                }
                              }
                            }
                          }
                          stackOut_18_0 = tb.field_r;
                          stackIn_19_0 = stackOut_18_0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    stackOut_13_0 = wb.field_m;
                    stackIn_14_0 = stackOut_13_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
              stackOut_8_0 = wb.field_m;
              stackIn_9_0 = stackOut_8_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) (var3);
            stackOut_35_1 = new StringBuilder().append("iv.M(").append(param0).append(',').append(param1).append(',');
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param2 == null) {
              stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L7;
            } else {
              stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L7;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_38_0), stackIn_38_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_19_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_29_0;
                } else {
                  return stackIn_34_0;
                }
              }
            }
          }
        }
    }

    iv() {
    }

    static {
        field_n = "Sandbox";
    }
}
