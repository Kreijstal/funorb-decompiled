/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kr {
    static String field_c;
    static boolean field_e;
    static hd field_b;
    static jw field_a;
    static String field_d;

    public static void a(int param0) {
        field_c = null;
        if (param0 > -62) {
            field_d = (String) null;
        }
        field_a = null;
        field_d = null;
        field_b = null;
    }

    final static void a(hd param0, boolean param1, int param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        uv var9 = null;
        String var10 = null;
        ut var11 = null;
        uv var12 = null;
        String var13 = null;
        ut var14 = null;
        uv var15 = null;
        String var16 = null;
        ut var17 = null;
        uv var18 = null;
        String var19 = null;
        ut var20 = null;
        uv var21 = null;
        String var22 = null;
        ut var23 = null;
        uv var24 = null;
        String var25 = null;
        ut var26 = null;
        uv var27 = null;
        String var28 = null;
        ut var29 = null;
        uv var30 = null;
        String var31 = null;
        ut var32 = null;
        uv var33 = null;
        String var34 = null;
        ut var35 = null;
        uv var36 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              el.a(param0, false, (np) null, param2, (String) null, (int[]) null, 0L, (String) null, -1);
              if (param2 != 0) {
                break L1;
              } else {
                var9 = wi.field_v;
                var11 = il.field_d[0];
                var29 = var11;
                var29 = var11;
                var10 = ig.field_b;
                var9.field_j.a(var10, param1, 11, var11);
                var12 = wi.field_v;
                var14 = il.field_d[1];
                var29 = var14;
                var29 = var14;
                var13 = oi.field_h;
                var12.field_j.a(var13, param1, 12, var14);
                var15 = wi.field_v;
                var17 = il.field_d[2];
                var29 = var17;
                var29 = var17;
                var16 = fi.field_a;
                var15.field_j.a(var16, true, 13, var17);
                break L1;
              }
            }
            L2: {
              if (param2 != 1) {
                break L2;
              } else {
                var18 = wi.field_v;
                var20 = il.field_d[0];
                var29 = var20;
                var29 = var20;
                var19 = ef.field_p;
                var18.field_j.a(var19, true, 11, var20);
                var21 = wi.field_v;
                var23 = il.field_d[1];
                var29 = var23;
                var29 = var23;
                var22 = bo.field_Bb;
                var21.field_j.a(var22, true, 12, var23);
                var24 = wi.field_v;
                var26 = il.field_d[2];
                var29 = var26;
                var29 = var26;
                var25 = rd.field_a;
                var24.field_j.a(var25, param1, 13, var26);
                break L2;
              }
            }
            L3: {
              if (param2 == 2) {
                var27 = wi.field_v;
                var29 = il.field_d[0];
                var28 = gb.field_I;
                var27.field_j.a(var28, param1, 11, var29);
                var30 = wi.field_v;
                var32 = il.field_d[1];
                var31 = fh.field_c;
                var30.field_j.a(var31, param1, 12, var32);
                var33 = wi.field_v;
                var35 = il.field_d[2];
                var34 = qv.field_g;
                var33.field_j.a(var34, true, 13, var35);
                break L3;
              } else {
                break L3;
              }
            }
            var36 = wi.field_v;
            var4 = param0.field_F;
            if (param1) {
              var5 = param0.field_T;
              var6 = param0.field_q;
              var7 = param0.field_mb;
              var36.field_j.a(0, var6, var4, var5, var7);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var3);
            stackOut_11_1 = new StringBuilder().append("kr.A(");
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
          throw nb.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static String a(String param0, int param1, byte param2) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        String stackIn_14_0 = null;
        String stackIn_18_0 = null;
        String stackIn_22_0 = null;
        String stackIn_25_0 = null;
        String stackIn_28_0 = null;
        String stackIn_32_0 = null;
        String stackIn_35_0 = null;
        String stackIn_38_0 = null;
        String stackIn_42_0 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        String stackOut_9_0 = null;
        String stackOut_13_0 = null;
        String stackOut_17_0 = null;
        String stackOut_21_0 = null;
        String stackOut_31_0 = null;
        String stackOut_41_0 = null;
        String stackOut_37_0 = null;
        String stackOut_34_0 = null;
        String stackOut_27_0 = null;
        String stackOut_24_0 = null;
        String stackOut_5_0 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        try {
          L0: {
            if (-2 == (param1 ^ -1)) {
              stackOut_2_0 = vo.a((byte) -18, sp.field_Kb, new String[]{param0});
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-3 != (param1 ^ -1)) {
                if (-4 == (param1 ^ -1)) {
                  stackOut_9_0 = vo.a((byte) -18, pn.field_E, new String[]{param0});
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (param1 == 4) {
                    stackOut_13_0 = vo.a((byte) -18, jj.field_m, new String[]{param0});
                    stackIn_14_0 = stackOut_13_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if ((param1 ^ -1) == -6) {
                      stackOut_17_0 = vo.a((byte) -18, qb.field_lc, new String[]{param0});
                      stackIn_18_0 = stackOut_17_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      if ((param1 ^ -1) == -7) {
                        stackOut_21_0 = vo.a((byte) -18, rc.field_c, new String[]{param0});
                        stackIn_22_0 = stackOut_21_0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        if (param1 != 7) {
                          if (-9 != (param1 ^ -1)) {
                            if (param1 == 11) {
                              stackOut_31_0 = vo.a((byte) -18, cf.field_Cb, new String[]{param0});
                              stackIn_32_0 = stackOut_31_0;
                              decompiledRegionSelector0 = 8;
                              break L0;
                            } else {
                              if (-13 != (param1 ^ -1)) {
                                if (param2 == 73) {
                                  if (13 == param1) {
                                    stackOut_41_0 = vo.a((byte) -18, ep.field_g, new String[]{param0});
                                    stackIn_42_0 = stackOut_41_0;
                                    decompiledRegionSelector0 = 11;
                                    break L0;
                                  } else {
                                    return null;
                                  }
                                } else {
                                  stackOut_37_0 = (String) null;
                                  stackIn_38_0 = stackOut_37_0;
                                  decompiledRegionSelector0 = 10;
                                  break L0;
                                }
                              } else {
                                stackOut_34_0 = vo.a((byte) -18, sr.field_e, new String[]{param0});
                                stackIn_35_0 = stackOut_34_0;
                                decompiledRegionSelector0 = 9;
                                break L0;
                              }
                            }
                          } else {
                            stackOut_27_0 = vo.a((byte) -18, iu.field_e, new String[]{param0});
                            stackIn_28_0 = stackOut_27_0;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          }
                        } else {
                          stackOut_24_0 = vo.a((byte) -18, m.field_b, new String[]{param0});
                          stackIn_25_0 = stackOut_24_0;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      }
                    }
                  }
                }
              } else {
                stackOut_5_0 = vo.a((byte) -18, tm.field_r, new String[]{param0});
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_44_0 = (RuntimeException) (var3);
            stackOut_44_1 = new StringBuilder().append("kr.E(");
            stackIn_46_0 = stackOut_44_0;
            stackIn_46_1 = stackOut_44_1;
            stackIn_45_0 = stackOut_44_0;
            stackIn_45_1 = stackOut_44_1;
            if (param0 == null) {
              stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L1;
            } else {
              stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackOut_45_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackOut_45_2 = "{...}";
              stackIn_47_0 = stackOut_45_0;
              stackIn_47_1 = stackOut_45_1;
              stackIn_47_2 = stackOut_45_2;
              break L1;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_47_0), stackIn_47_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_14_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_18_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_22_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_25_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_28_0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_32_0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_35_0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_38_0;
                            } else {
                              return stackIn_42_0;
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
    }

    final static String a(CharSequence[] param0, boolean param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (!param1) {
              stackOut_3_0 = mf.a(param0.length, param0, 99, 0);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (String) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var2);
            stackOut_5_1 = new StringBuilder().append("kr.C(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static cl[] a(byte param0, bu param1) {
        RuntimeException var2 = null;
        int[] var3 = null;
        cl[] var4 = null;
        int var5 = 0;
        cl var6 = null;
        int var7 = 0;
        wu var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        cl[] stackIn_4_0 = null;
        cl[] stackIn_10_0 = null;
        cl[] stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        cl[] stackOut_3_0 = null;
        cl[] stackOut_16_0 = null;
        cl[] stackOut_9_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var7 = Kickabout.field_G;
        try {
          L0: {
            if (!param1.b(82)) {
              stackOut_3_0 = new cl[]{};
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var8 = param1.b(true);
              L1: while (true) {
                if (var8.field_a != 0) {
                  if (2 != var8.field_a) {
                    L2: {
                      if (param0 >= 122) {
                        break L2;
                      } else {
                        field_b = (hd) null;
                        break L2;
                      }
                    }
                    var10 = (int[]) (var8.field_b);
                    var9 = var10;
                    var3 = var9;
                    var4 = new cl[var10.length >> 668548034];
                    var5 = 0;
                    L3: while (true) {
                      if (var5 >= var4.length) {
                        stackOut_16_0 = (cl[]) (var4);
                        stackIn_17_0 = stackOut_16_0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        var6 = new cl();
                        var4[var5] = var6;
                        var6.field_f = var3[var5 << 1972272482];
                        var6.field_b = var3[1 + (var5 << 2143470978)];
                        var6.field_e = var3[(var5 << -113309694) - -2];
                        var6.field_a = var3[3 + (var5 << 1032561762)];
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    stackOut_9_0 = new cl[]{};
                    stackIn_10_0 = stackOut_9_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  aj.a(10L, 1);
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var2);
            stackOut_18_1 = new StringBuilder().append("kr.D(").append(param0).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L4;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            return stackIn_17_0;
          }
        }
    }

    static {
        field_c = "Diamond";
        field_d = "Inverse centre";
    }
}
