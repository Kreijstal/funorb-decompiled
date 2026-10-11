/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class se {
    static rm field_c;
    static String field_d;
    static String[] field_a;
    static int field_e;
    static long field_b;

    final static void a(int param0, byte[] param1) {
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int[] array$6 = null;
        int incrementValue$7 = 0;
        boolean stackIn_16_0 = false;
        boolean stackIn_20_0 = false;
        boolean stackIn_24_0 = false;
        boolean stackIn_28_0 = false;
        boolean stackIn_32_0 = false;
        String[] stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        String stackIn_36_2 = null;
        boolean stackIn_40_0 = false;
        String[] stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        String stackIn_44_2 = null;
        String[] stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        String stackIn_48_2 = null;
        String[] stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        String stackIn_52_2 = null;
        String[] stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        String stackIn_56_2 = null;
        int stackIn_63_0 = 0;
        int stackIn_67_1 = 0;
        String[] stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        String stackIn_74_2 = null;
        boolean stackIn_120_2 = false;
        int stackIn_133_0 = 0;
        int stackIn_133_1 = 0;
        int stackIn_136_0 = 0;
        int stackIn_136_1 = 0;
        RuntimeException stackIn_171_0 = null;
        StringBuilder stackIn_171_1 = null;
        String stackIn_172_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4_int = 0;
        int[][] var4 = null;
        int var5 = 0;
        int[] var5_ref_int__ = null;
        int var6 = 0;
        int[] var7_ref_int__ = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_136_0Lifetime1;
        int stackIn_136_1Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var4_intLifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        var10 = SteelSentinels.field_G;
        try {
          if (null != param1 &&
            0 != param1.length) {
            if (param0 != -1) {
              return;
            }
            var2_int = 0;
            var3 = param1[var2_int++];
            if (2 <= var3 &&
              param1.length > var2_int) {
              var4_int = param1[var2_int++];
              var5 = dm.field_c ? 1 : 0;
              stackIn_16_0 = ((1 & var4_int) != 0);
              si.field_p = stackIn_16_0;
              stackIn_20_0 = ((4 & var4_int) != 0);
              dm.field_c = stackIn_20_0;
              stackIn_24_0 = ((2 & var4_int) != 0);
              ka.field_V = stackIn_24_0;
              var6 = tj.field_a ? 1 : 0;
              stackIn_28_0 = (0 != (16 & var4_int));
              ik.field_h = stackIn_28_0;
              stackIn_32_0 = ((var4_int & 8) != 0);
              ui.field_G = stackIn_32_0;
              stackIn_35_0 = ti.field_A;
              stackIn_35_1 = 42;
              if (!dm.field_c) {
                stackIn_36_2 = od.field_j;
              } else {
                stackIn_36_2 = qm.field_c;
              }
              stackIn_35_0[stackIn_35_1] = stackIn_36_2;
              stackIn_40_0 = (0 != (32 & var4_int));
              tj.field_a = stackIn_40_0;
              stackIn_43_0 = ti.field_A;
              stackIn_43_1 = 37;
              if (ka.field_V) {
                stackIn_44_2 = ge.field_i;
              } else {
                stackIn_44_2 = fg.field_Vb;
              }
              stackIn_43_0[stackIn_43_1] = stackIn_44_2;
              stackIn_47_0 = ti.field_A;
              stackIn_47_1 = 41;
              if (si.field_p) {
                stackIn_48_2 = hf.field_b;
              } else {
                stackIn_48_2 = fm.field_h;
              }
              stackIn_47_0[stackIn_47_1] = stackIn_48_2;
              stackIn_51_0 = ti.field_A;
              stackIn_51_1 = 44;
              if (!ik.field_h) {
                stackIn_52_2 = sa.field_b;
              } else {
                stackIn_52_2 = o.field_a;
              }
              stackIn_51_0[stackIn_51_1] = stackIn_52_2;
              stackIn_55_0 = ti.field_A;
              stackIn_55_1 = 43;
              if (ui.field_G) {
                stackIn_56_2 = tm.field_f;
              } else {
                stackIn_56_2 = fj.field_i;
              }
              stackIn_55_0[stackIn_55_1] = stackIn_56_2;
              if ((dm.field_c ? 1 : 0) == var5) {
                stackIn_63_0 = (tj.field_a) ? 0 : 1;
                if (var6 != 0) {
                  stackIn_67_1 = 0;
                } else {
                  stackIn_67_1 = 1;
                }
                if (stackIn_63_0 != stackIn_67_1) {
                  gd.field_sb = null;
                }
              } else {
                gd.field_sb = null;
              }
              stackIn_73_0 = ti.field_A;
              stackIn_73_1 = 47;
              if (!tj.field_a) {
                stackIn_74_2 = he.field_d;
              } else {
                stackIn_74_2 = qj.field_u;
              }
              stackIn_73_0[stackIn_73_1] = stackIn_74_2;
            }
            if (var3 >= 1 &&
              var2_int < param1.length) {
              incrementValue$2 = var2_int;
              var2_int++;
              dm.field_a = param1[incrementValue$2];
            }
            boolean decompiledFrameCompleted1 = true;
            boolean decompiledFrameCompleted0 = true;
            if (var3 >= 0) {
              if (var2_int == param1.length) {
                return;
              }
              incrementValue$3 = var2_int;
              var2_int++;
              var4_intLifetime1 = 255 & param1[incrementValue$3];
              if (param1.length < var2_int + var4_intLifetime1) {
                return;
              }
              uc.field_b = new int[var4_intLifetime1];
              var5Lifetime1 = 0;
              while (var5Lifetime1 < var4_intLifetime1) {
                incrementValue$4 = var2_int;
                var2_int++;
                uc.field_b[var5Lifetime1] = ec.a(255, (int) param1[incrementValue$4]);
                stackIn_133_0 = 255;
                stackIn_133_1 = uc.field_b[var5Lifetime1];
                if (var10 != 0) {
                  decompiledFrameCompleted1 = false;
                  break;
                }
                if (stackIn_133_0 == stackIn_133_1) {
                  uc.field_b[var5Lifetime1] = -1;
                }
                var5Lifetime1++;
              }
              if (decompiledFrameCompleted1) {
                var5_ref_int__ = new int[8];
                if (ji.a(uc.field_b, (byte) 97, var5_ref_int__) == null) {
                  uc.field_b = new int[ua.field_x.length];
                  ii.a(ua.field_x, 0, uc.field_b, 0, uc.field_b.length);
                }
                if (ni.b(58) ||
                  !(rd.field_b > 0)) {
                  var6Lifetime1 = uc.field_b[0];
                  var7_ref_int__ = nl.a(var6Lifetime1, (byte) 126);
                  var8 = 0;
                  if (var7_ref_int__ != null &&
                    !oc.a(var6Lifetime1, -87, false)) {
                    var9 = 0;
                    while (true) {
                      if (var9 < uc.field_b.length) {
                        stackIn_133_0 = uc.field_b[var9];
                        stackIn_133_1 = param0 - 87;
                        if (var10 != 0) {
                          decompiledFrameCompleted0 = false;
                          break;
                        }
                        stackIn_120_2 = !(-8 + uc.field_b.length > var9);
                        if (oc.a(stackIn_133_0, stackIn_133_1, stackIn_120_2)) {
                          var8 = 1;
                        } else {
                          var9++;
                          continue;
                        }
                      }
                      break;
                    }
                    if ((decompiledFrameCompleted0) &&
                      (var10 != 0)) {
                      var8 = 1;
                      var7_ref_int__ = ua.field_x;
                    }
                  } else {
                    var8 = 1;
                    var7_ref_int__ = ua.field_x;
                  }
                  if ((decompiledFrameCompleted0) &&
                    (var8 != 0)) {
                    uc.field_b = new int[var7_ref_int__.length];
                    ii.a(var7_ref_int__, 0, uc.field_b, 0, var7_ref_int__.length);
                  }
                }
              }
            }
            if ((decompiledFrameCompleted1) &&
              (decompiledFrameCompleted0)) {
              stackIn_133_0 = var3;
              stackIn_133_1 = 3;
            }
            if (stackIn_133_0 >= stackIn_133_1) {
              var4 = ue.field_c;
              var5Lifetime2 = 0;
              while (true) {
                stackIn_136_0 = ~var4.length;
                stackIn_136_1 = ~var5Lifetime2;
                if (stackIn_136_0 >= stackIn_136_1) {
                  return;
                }
                if (var10 != 0) {
                  return;
                }
                if (var2_int >= param1.length) {
                  return;
                }
                incrementValue$5 = var2_int;
                var2_int++;
                var6Lifetime2 = 255 & param1[incrementValue$5];
                if (var6Lifetime2 == 0) {
                  var4[var5Lifetime2] = null;
                } else {
                  if (param1.length < (var6Lifetime2 + var2_int)) {
                    return;
                  }
                  if (null == var4[var5Lifetime2] ||
                    ~var4[var5Lifetime2].length != ~var6Lifetime2) {
                    array$6 = new int[var6Lifetime2];
                    var4[var5Lifetime2] = array$6;
                  }
                  var7 = 0;
                  while (var6Lifetime2 > var7) {
                    incrementValue$7 = var2_int;
                    var2_int++;
                    var4[var5Lifetime2][var7] = ec.a(255, (int) param1[incrementValue$7]);
                    stackIn_136_0Lifetime1 = var4[var5Lifetime2][var7];
                    stackIn_136_1Lifetime1 = 255;
                    if (stackIn_136_0Lifetime1 == stackIn_136_1Lifetime1) {
                      var4[var5Lifetime2][var7] = -1;
                    }
                    var7++;
                  }
                }
                ad.a(var5Lifetime2, (nk) null, 33);
                var5Lifetime2++;
              }
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_171_0 = var2;
          stackIn_171_1 = new StringBuilder().append("se.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_172_2 = "null";
          } else {
            stackIn_172_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_171_0), ((StringBuilder) (Object) stackIn_171_1).append(stackIn_172_2).append(')').toString());
        }
    }

    final static wk[] a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int[] var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        wk var9 = null;
        wk var10 = null;
        wk var11 = null;
        wk var12 = null;
        wk var13 = null;
        Object var14 = null;
        wk[] stackIn_8_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = pb.field_g;
          var7 = pb.field_c;
          var8 = pb.field_j;
          var9 = new wk(param0, -(2 * param0) + param3);
          var9.d();
          pb.e(0, 0, param0, param3 - param0 * 2, param2, param4);
          var10 = new wk(param0, param0);
          var10.d();
          if (param5 != 13574) {
            field_a = (String[]) null;
          }
          pb.a(0, 0, param0, param0, param2);
          var11 = new wk(16, param0);
          var11.d();
          pb.a(0, 0, 16, param0, param2);
          var12 = new wk(param0, param0);
          var12.d();
          pb.a(0, 0, param0, param0, param4);
          var13 = new wk(16, param0);
          var13.d();
          pb.a(0, 0, 16, param0, param4);
          var14 = null;
          if (0 < param1) {
            var14 = new wk(16, 16);
            ((wk) (var14)).d();
            pb.a(0, 0, 16, 16, param1);
          }
          pb.a(var6, var7, var8);
          stackIn_8_0 = new wk[]{var10, var11, var10, var9, (wk) (var14), var9, var12, var13, var12};
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var6_ref), "se.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void a(byte param0) {
        try {
          field_d = null;
          int var1_int = 14 / ((-32 - param0) / 56);
          field_c = null;
          field_a = null;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "se.A(" + param0 + ')');
        }
    }

    final static int a(byte param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = SteelSentinels.field_G;
        try {
          var3_int = 0;
          var4 = lk.field_W;
          if (param0 != 32) {
            field_a = (String[]) null;
          }
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(an.field_g.length > var3_int)))) {
            var5 = kk.field_g[var3_int];
            stackIn_18_0 = 0;
            if (var8 == 0) {
              if (stackIn_18_0 <= var5) {
                var6 = rg.a(an.field_g[var3_int], true, (byte) -115);
                var4 = var4 + tf.field_c;
                var7 = vg.field_f - (var6 >> 1);
                if (pg.a(ig.field_e + (id.field_ac << 1), var6 + (h.field_U << 1), param2, var7 - h.field_U, param0 - 32, var4, param1)) {
                  stackIn_13_0 = var5;
                  return stackIn_13_0;
                }
                var4 = var4 + (tf.field_c + ((id.field_ac << 1) + ig.field_e));
              } else {
                var4 = var4 + ck.field_e;
              }
              var3_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_18_0 = -1;
          }
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3), "se.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0) {
        try {
          hc.a(4, 0);
          if (param0 <= 17) {
            field_b = -41L;
          }
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "se.B(" + param0 + ')');
        }
    }

    final static gh a(boolean param0, boolean param1, int param2, nk param3, int param4) {
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        gh stackIn_27_0 = null;
        wk[] stackIn_28_1 = null;
        gh stackIn_31_0 = null;
        wk[] stackIn_32_1 = null;
        boolean stackIn_41_0 = false;
        int stackIn_48_0 = 0;
        boolean stackIn_51_0 = false;
        int stackIn_58_0 = 0;
        gh stackIn_67_0 = null;
        int stackIn_112_0 = 0;
        gh stackIn_115_0;
        gh stackIn_115_1;
        long stackIn_115_2;
        gh stackIn_115_3;
        gh stackIn_116_0;
        gh stackIn_116_1;
        String stackIn_116_4;
        gh stackIn_159_0 = null;
        int stackIn_160_1 = 0;
        gh stackIn_170_0 = null;
        RuntimeException stackIn_174_0 = null;
        StringBuilder stackIn_174_1 = null;
        String stackIn_175_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_40_0;
        boolean stackOut_50_0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        gh var8 = null;
        int var9 = 0;
        int var10 = 0;
        int[] var11_ref_int__ = null;
        int var11 = 0;
        int[] var12 = null;
        String var12_ref = null;
        int var13_int = 0;
        gh var13 = null;
        int var14_int = 0;
        gh var14 = null;
        int[] var15_ref_int__ = null;
        gh var15_ref_gh = null;
        int var15 = 0;
        int var16 = 0;
        String var16_ref_String = null;
        int var17_int = 0;
        gh var17 = null;
        int var18_int = 0;
        gh var18 = null;
        int var19 = 0;
        gh var15_ref_ghLifetime1;
        String var16_ref_StringLifetime1;
        gh var17Lifetime1;
        gh var15_ref_ghLifetime1Lifetime1;
        int var9Lifetime1;
        int var14_intLifetime1;
        int var15Lifetime1;
        int var15Lifetime2;
        int var16Lifetime1;
        int var16Lifetime2;
        int var16Lifetime3;
        int var17_intLifetime1;
        int var18_intLifetime1;
        int var16Lifetime4;
        int var17_intLifetime2;
        int var14_intLifetime1Lifetime1;
        int var17_intLifetime1Lifetime1;
        var19 = SteelSentinels.field_G;
        try {
          boolean decompiledFrameRemainder2 = true;
          var5_int = qa.field_O;
          if ((ni.b(104) ||
            !(0 < rd.field_b)) && oc.a(param3.field_N, -125, false)) {
            stackIn_11_0 = 1;
            decompiledFrameRemainder2 = false;
          }
          else {
            stackIn_11_0 = 0;
          }
          var6 = stackIn_11_0;
          stackIn_15_0 = (param3.field_Q == 1) ? 78 : 64;
          var7 = stackIn_15_0;
          if (17 <= param3.field_N &&
            param3.field_N < 53) {
            var7 = 36;
          }
          if (param3.field_N == 83) {
            var7 = 36;
          }
          var8 = new gh((long)param3.field_N, sb.field_Y);
          cj.field_a[param3.field_N] = var8;
          stackIn_27_0 = var8;
          if (0 != param2) {
            stackIn_28_1 = tk.field_t;
          } else {
            stackIn_28_1 = be.field_f;
          }
          stackIn_27_0.field_Ab = stackIn_28_1;
          stackIn_31_0 = var8;
          if (param2 != 0) {
            stackIn_32_1 = co.field_d;
          } else {
            stackIn_32_1 = tk.field_t;
          }
          stackIn_31_0.field_I = stackIn_32_1;
          var9 = sj.field_v[param3.field_N];
          var10 = 0;
          if (param3.field_Q == 1 &&
            param2 != 0) {
            var11_ref_int__ = ne.a(param3.field_N, (byte) 28);
            var12 = ki.b(param3.field_N, (byte) -101);
            var13_int = 0;
            var14_int = 0;
            var15_ref_int__ = var11_ref_int__;
            var16 = 0;
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (var16 >= var15_ref_int__.length))) {
              var17_int = var15_ref_int__[var16];
              var18_int = sj.field_v[var17_int];
              stackOut_40_0 = t.a(rn.field_D, var17_int, -20370);
              stackIn_48_0 = stackOut_40_0 ? 1 : 0;
              stackIn_41_0 = stackOut_40_0;
              if (var19 == 0) {
                if (stackIn_41_0) {
                  var14_int = var14_int + var18_int;
                }
                var13_int = var13_int + var18_int;
                var16++;
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit0) {
              var15_ref_int__ = var12;
              stackIn_48_0 = 0;
            }
            var16Lifetime4 = stackIn_48_0;
            while (true) {
              if (var16Lifetime4 >= var15_ref_int__.length) {
                var9Lifetime1 = var13_int - var14_int;
                var10 = var14_int * 100 / var13_int;
                stackIn_58_0 = ~var9Lifetime1;
                break;
              }
              var17_intLifetime2 = var15_ref_int__[var16Lifetime4];
              var18_intLifetime1 = qf.field_h[var17_intLifetime2];
              var13_int = var13_int + var18_intLifetime1;
              stackOut_50_0 = t.a(fe.field_D, var17_intLifetime2, -20370);
              stackIn_58_0 = stackOut_50_0 ? 1 : 0;
              stackIn_51_0 = stackOut_50_0;
              if (var19 == 0) {
                if (stackIn_51_0) {
                  var14_int = var14_int + var18_intLifetime1;
                }
                var16Lifetime4++;
                continue;
              }
              break;
            }
            if (stackIn_58_0 >= ~li.field_v) {
              param2 = 1;
              if (var19 != 0) {
                param2 = 2;
              }
            } else {
              param2 = 2;
            }
          }
          var11 = 66;
          var12_ref = param3.l(-24719);
          var13 = new gh((long)param3.field_N, kh.field_s, var12_ref);
          var13.a(0, 2, var7 - 19, -4 + var11, -var11 + var5_int);
          var13.field_Ib = 10;
          if (var7 < 40) {
            var12_ref = bg.a(var12_ref, var13.field_zb - var13.field_ub * 2, (byte) -45, var13.field_L);
          }
          var13.field_S = var12_ref;
          if (param4 != 14) {
            stackIn_67_0 = (gh) null;
            return stackIn_67_0;
          }
          boolean decompiledFrameRemainder1 = true;
          boolean decompiledFrameCompleted1 = true;
          var13.field_nb = 1995681;
          var8.a(var13, param4 ^ 114);
          if ((!(param3.field_N >= 17) ||
            !(53 > param3.field_N)) && param3.field_N != 83) {
            if (1 == param3.field_Q) {
              var14_intLifetime1 = var13.field_L.a(var13.field_S, var13.field_zb - var13.field_ub * 2, var13.field_Ib) + 6;
              kh.a(var8, "<img=1>", tc.field_B[param3.field_N], param3.field_N, var14_intLifetime1, var5_int, 3000, var11, true);
              var14_intLifetime1 += 14;
              kh.a(var8, "<img=0>", param3.g(8192), param3.field_N, var14_intLifetime1, var5_int, 800, var11, true);
              var14_intLifetime1 += 14;
              if (0 >= param3.j(0)) {
                if (!(param3.h(-31496) <= 0)) {
                  kh.a(var8, "<img=2>", (int)((double)param3.h(-31496) / Math.sqrt((double)param3.g(8192))), param3.field_N, var14_intLifetime1, var5_int, 27, var11, true);
                  if (var19 != 0) {
                    kh.a(var8, "<img=3>", (int)((double)param3.j(0) / Math.sqrt((double)param3.g(8192))), param3.field_N, var14_intLifetime1, var5_int, 27, var11, true);
                  }
                }
              } else {
                kh.a(var8, "<img=3>", (int)((double)param3.j(0) / Math.sqrt((double)param3.g(8192))), param3.field_N, var14_intLifetime1, var5_int, 27, var11, true);
              }
              var14_intLifetime1 += 14;
              var16_ref_String = "";
              var17_intLifetime1 = 0;
              while (param3.i(-122) > var17_intLifetime1) {
                var16_ref_String = var16_ref_String + "<img=6>";
                var17_intLifetime1++;
                if (var19 != 0) {
                  decompiledFrameCompleted1 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted1) {
                var15_ref_gh = new gh((long)param3.field_N, kh.field_s, var16_ref_String);
                var15_ref_gh.a(0, var14_intLifetime1, 20, var11 - 4, var5_int - var11);
                var8.a(var15_ref_gh, 123);
                var14_intLifetime1 += 14;
                decompiledFrameRemainder1 = (var19 != 0);
              }
            }
            if ((decompiledFrameRemainder1) &&
              (decompiledFrameCompleted1)) {
              boolean decompiledFrameCompleted0 = true;
              var14_intLifetime1Lifetime1 = var13.field_L.a(var13.field_S, var13.field_zb - var13.field_ub * 2, var13.field_Ib) + 6;
              kh.a(var8, "<img=1>", tc.field_B[param3.field_N], param3.field_N, var14_intLifetime1Lifetime1, var5_int, 3000, var11, true);
              var14_intLifetime1Lifetime1 += 14;
              kh.a(var8, "<img=0>", param3.g(8192), param3.field_N, var14_intLifetime1Lifetime1, var5_int, 400, var11, true);
              var14_intLifetime1Lifetime1 += 14;
              if (0 < param3.i(-122)) {
                var16_ref_StringLifetime1 = "";
                var17_intLifetime1Lifetime1 = 0;
                while (param3.i(param4 - 129) > var17_intLifetime1Lifetime1) {
                  var16_ref_StringLifetime1 = var16_ref_StringLifetime1 + "<img=6>";
                  var17_intLifetime1Lifetime1++;
                  if (var19 != 0) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                }
                if (decompiledFrameCompleted0) {
                  var15_ref_ghLifetime1 = new gh((long)param3.field_N, kh.field_s, var16_ref_StringLifetime1);
                  var15_ref_ghLifetime1.a(0, var14_intLifetime1Lifetime1, 20, -4 + var11, var5_int - var11);
                  var8.a(var15_ref_ghLifetime1, 125);
                }
              }
              if (param3.j(0) > 0) {
                if (param3.field_N != 59 &&
                  param3.field_N != 77) {
                  stackIn_112_0 = 0;
                } else {
                  stackIn_112_0 = 1;
                }
                var16Lifetime1 = stackIn_112_0;
                stackIn_115_0 = null;
                stackIn_115_1 = null;
                stackIn_115_2 = (long)param3.field_N;
                stackIn_115_3 = kh.field_s;
                if (var16Lifetime1 != 0) {
                  stackIn_116_0 = null;
                  stackIn_116_1 = null;
                  stackIn_116_4 = "<img=2><img=3>";
                } else {
                  stackIn_116_0 = null;
                  stackIn_116_1 = null;
                  stackIn_116_4 = "<img=3>";
                }
                var15_ref_ghLifetime1Lifetime1 = new gh(stackIn_115_2, stackIn_115_3, stackIn_116_4);
                var15_ref_ghLifetime1Lifetime1.a(0, var14_intLifetime1Lifetime1, 20, var11 - 4, 5 + (-var11 + var5_int));
                var15_ref_ghLifetime1Lifetime1.field_Kb = 2;
                var8.a(var15_ref_ghLifetime1Lifetime1, param4 + 108);
              }
              if (var19 != 0) {
                kh.a(var8, "<img=1>", tc.field_B[param3.field_N], param3.field_N, 18, var5_int, 500, var11, true);
              }
            }
          } else {
            kh.a(var8, "<img=1>", tc.field_B[param3.field_N], param3.field_N, 18, var5_int, 500, var11, true);
          }
          boolean decompiledFrameRemainder0 = true;
          var14 = new gh((long)param3.field_N, (gh) null);
          var14.a(0, 2, -4 + var7, 2, var11 - 4);
          var14.field_I = co.field_d;
          if (1 != param3.field_Q ||
            !(ul.a((byte) -82, param3.field_N) >= 0)) {
            qb.a(param3, var14, (byte) -93, false, -4 + var11, -4 + var7);
            decompiledFrameRemainder0 = (var19 != 0);
          }
          if (decompiledFrameRemainder0) {
            var15 = ul.a((byte) 83, param3.field_N);
            var14.field_Pb = new wk(Math.min(64, -4 + var11), Math.min(64, var7 - 4));
            var14.field_Pb.d();
            si.field_E[var15].a(0, 0);
            pb.c();
            sb.field_bb.b((byte) 121);
            jg.field_h[var15] = var14;
            var14.field_Kb = 1;
            var14.field_Fb = 1;
          }
          if (!param0 ||
            param1 ||
            var6 != 0) {
            var14.field_Pb.d();
            pb.c(0, 0, var14.field_Pb.field_A, var14.field_Pb.field_F, 0, 128);
            if (param1 &&
              var6 == 0) {
              pl.field_U.a(mc.field_d, var14.field_Pb.field_A / 2, (pl.field_U.field_G + var14.field_Pb.field_F) / 2, 12632256, 0);
            }
            sb.field_bb.b((byte) 122);
          }
          var8.a(var14, 123);
          if (var6 != 0) {
            var15Lifetime1 = sj.field_F.field_A;
            var16Lifetime2 = sj.field_F.field_F;
            var17 = new gh(-1L, (gh) null);
            var17.a(0, (var14.field_Lb - var15Lifetime1) / 2 + var14.field_eb, var16Lifetime2, (-var15Lifetime1 + var14.field_zb) / 2 + var14.field_Y, var15Lifetime1);
            var17.field_Pb = sj.field_F;
            var8.a(var17, 118);
          }
          if ((var6 == 0 ||
            var19 != 0) &&
            param2 != 0) {
            var15Lifetime2 = 28;
            var16Lifetime3 = 28;
            if (1 == param3.field_Q) {
              var16Lifetime3 += 14;
            }
            var17Lifetime1 = new gh("engineer", (gh) null);
            var17Lifetime1.a(param4 - 14, (-var15Lifetime2 + var14.field_Lb) / 2 + var14.field_eb, var16Lifetime3, (var14.field_zb - var15Lifetime2) / 2 + var14.field_Y, var15Lifetime2);
            var17Lifetime1.field_Ab = cm.field_b;
            var17Lifetime1.field_I = lj.field_b;
            var17Lifetime1.field_qb = 2;
            var17Lifetime1.field_sb = 2;
            var17Lifetime1.field_Pb = b.field_q[param2];
            var8.a(var17Lifetime1, 123);
            if (param3.field_N != 58) {
            }
            if (param3.field_Q == 1) {
              var18 = new gh(-1L, (gh) null);
              var18.field_Kb = 1;
              var18.field_Fb = 1;
              var18.field_S = var10 + "%";
              var18.field_L = (mi) ((Object) fk.field_d);
              stackIn_159_0 = var18;
              if (param2 != 1) {
                stackIn_160_1 = 16711680;
              } else {
                stackIn_160_1 = 65280;
              }
              stackIn_159_0.field_nb = stackIn_160_1;
              var18.a(0, -14 + var17Lifetime1.field_Lb, 14, 0, var17Lifetime1.field_zb);
              var17Lifetime1.a(var18, 127);
            }
          }
          if (param3.field_N == 55) {
            pa.field_d[1].field_a = var8;
          }
          if (param3.field_N == 18) {
            pa.field_d[7].field_a = var8;
          }
          stackIn_170_0 = var8;
          return stackIn_170_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_174_0 = var5;
          stackIn_174_1 = new StringBuilder().append("se.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_175_2 = "null";
          } else {
            stackIn_175_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_174_0), ((StringBuilder) (Object) stackIn_174_1).append(stackIn_175_2).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_a = new String[]{"Increases your energy gain by <img=7> ~16 GJ/s.", "Increases your energy gain by <img=7> ~33 GJ/s.", "Increases your energy gain by <img=7> ~50 GJ/s.", "Increases your energy gain by <img=7> ~66 GJ/s.", "Increases your energy gain by <img=7> ~83 GJ/s.", "Increase your energy storage by <img=4> 1 TJ.", "Increase your energy storage by <img=4> 2 TJ.", "Increase your energy storage by <img=4> 3 TJ.", "Increase your energy storage by <img=4> 4 TJ.", "Increase your energy storage by <img=4> 5 TJ.", "Provides a <img=5> 100 GJ shield that absorbs energy attacks and explosions.", "Provides a <img=5> 200 GJ shield that absorbs energy attacks and explosions.", "Provides a <img=5> 500 GJ shield that absorbs energy attacks and explosions.", "Provides a <img=5> 1,000 GJ shield that absorbs energy attacks and explosions.", "Provides a <img=5> 2,000 GJ shield that absorbs energy attacks and explosions.", "Detonates a massive EMP explosion that will drain the energy of any sentinel in the vicinity. Uses all of your stored energy.", "Allows you to gain a target lock on enemy sentinels, using <img=4> 1 TJ of energy. Locking on will make missiles home in on the target and direct all gun or laser fire.", "Automatically targets incoming missiles and rockets with any light weapons capable of shooting them down (flak, gun and laser weapons).", "Scrambles target locks on your sentinel.", "Repairs your sentinel slowly over time, as long as it is not taking damage. This module continuously draws power from your reactors.", "A high output reactor that has not yet completed testing for stability.", "Shows more information about your opponents, such as their installed systems and target lock status. Also extends the range of your firing arc projections.", "Reduces the reload time of rockets and missiles by half.", "Halves the energy requirements of plasma weapons.", "Allows you to teleport across the map to a safe location. Requires at least <img=4> 5 TJ of energy, and exhausts your energy bank when activated.", "Doubles the damage output of your laser weapons, but also doubles their energy use.", "Recharges your energy shield when your sentinel takes damage.", "Removes the energy-sapping effects of EMP attacks.", "Increases your <img=2> jumping ability and reduces skidding.", "Increases your <img=3> thrusting efficiency and allows you to continue thrusting even after being hit in the air.", "Makes your sentinel hard to target and pinpoint, by providing a cloaking system. The cloak will deactivate when taking damage or firing.", "Allows any weapon to be used while in the air.", "Absorbs kinetic damage from bullets, flak and kinetic weapons.", "Absorbs explosive damage from shells, missiles and rockets."};
        field_d = "LOCK";
        field_c = new rm(1);
    }
}
