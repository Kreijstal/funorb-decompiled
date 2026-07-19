/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc {
    static int[] field_f;
    static String field_c;
    static String[] field_d;
    static int[] field_b;
    static String field_e;
    static String field_a;

    final static boolean a(int param0, int param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var12 = null;
        int stackIn_4_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_29_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_24_0 = 0;
        var8 = SteelSentinels.field_G;
        try {
          L0: {
            if (0 > param0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (!param2) {
                  break L1;
                } else {
                  if (param0 == 27) {
                    stackOut_9_0 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    if ((param0 ^ -1) != -33) {
                      break L1;
                    } else {
                      return false;
                    }
                  }
                }
              }
              L2: {
                if (param1 <= -62) {
                  break L2;
                } else {
                  field_f = (int[]) null;
                  break L2;
                }
              }
              var3_int = 0;
              L3: while (true) {
                if ((var3_int ^ -1) <= -7) {
                  stackOut_28_0 = 1;
                  stackIn_29_0 = stackOut_28_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  L4: {
                    var4 = n.field_z[var3_int];
                    var12 = nl.a(var4, (byte) 124);
                    if (param2) {
                      stackOut_17_0 = var12.length - 8;
                      stackIn_18_0 = stackOut_17_0;
                      break L4;
                    } else {
                      stackOut_16_0 = 0;
                      stackIn_18_0 = stackOut_16_0;
                      break L4;
                    }
                  }
                  L5: {
                    var6 = stackIn_18_0;
                    if (param2) {
                      stackOut_20_0 = var12.length;
                      stackIn_21_0 = stackOut_20_0;
                      break L5;
                    } else {
                      stackOut_19_0 = var12.length - 8;
                      stackIn_21_0 = stackOut_19_0;
                      break L5;
                    }
                  }
                  var7 = stackIn_21_0;
                  L6: while (true) {
                    if (var7 <= var6) {
                      var3_int++;
                      continue L3;
                    } else {
                      if (var12[var6] != param0) {
                        var6++;
                        continue L6;
                      } else {
                        stackOut_24_0 = 0;
                        stackIn_25_0 = stackOut_24_0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3), "oc.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_25_0 != 0;
            } else {
              return stackIn_29_0 != 0;
            }
          }
        }
    }

    public static void a(int param0) {
        boolean discarded$0 = false;
        field_b = null;
        field_e = null;
        field_c = null;
        if (param0 != -1) {
            discarded$0 = oc.a(-65, -59, true);
        }
        field_a = null;
        field_f = null;
        field_d = null;
    }

    final static int a(int param0, gh param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        qd[] var4 = null;
        int var5_int = 0;
        qd var5 = null;
        int var6 = 0;
        qd var6_ref_qd = null;
        qd var7 = null;
        int var8 = 0;
        gh var10 = null;
        int var11 = 0;
        int var12 = 0;
        nk var13 = null;
        gh var14 = null;
        int var15 = 0;
        gh var15_ref_gh = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        qd[] var20 = null;
        qd var21 = null;
        qd[] var22 = null;
        qd[] var23 = null;
        nk var24 = null;
        gh var25 = null;
        nk var26 = null;
        gh stackIn_23_0 = null;
        gh stackIn_23_1 = null;
        long stackIn_23_2 = 0L;
        gh stackIn_24_0 = null;
        gh stackIn_24_1 = null;
        long stackIn_24_2 = 0L;
        gh stackIn_25_0 = null;
        gh stackIn_25_1 = null;
        long stackIn_25_2 = 0L;
        gh stackIn_25_3 = null;
        int stackIn_50_0 = 0;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_49_0 = 0;
        gh stackOut_22_0 = null;
        gh stackOut_22_1 = null;
        long stackOut_22_2 = 0L;
        gh stackOut_24_0 = null;
        gh stackOut_24_1 = null;
        long stackOut_24_2 = 0L;
        gh stackOut_24_3 = null;
        gh stackOut_23_0 = null;
        gh stackOut_23_1 = null;
        long stackOut_23_2 = 0L;
        gh stackOut_23_3 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        var19 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param1.field_M == null) {
                break L1;
              } else {
                param1.field_M.g(param0 ^ 2);
                break L1;
              }
            }
            var2_int = 0;
            var3 = 110 - pf.field_n - param0;
            var22 = new qd[]{};
            var20 = hl.field_v.a(var22, -21636, fg.field_Ob);
            var4 = var20;
            var5_int = 1;
            L2: while (true) {
              if (var5_int >= var20.length) {
                L3: {
                  if (3 != var20.length) {
                    break L3;
                  } else {
                    if ((8 & var20[1].field_q) != 0) {
                      var21 = var20[1];
                      var5 = var21;
                      var20[1] = var20[2];
                      var20[2] = var21;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                var23 = var20;
                var6 = 0;
                L4: while (true) {
                  if (var23.length <= var6) {
                    stackOut_49_0 = var2_int;
                    stackIn_50_0 = stackOut_49_0;
                    break L0;
                  } else {
                    L5: {
                      var7 = var23[var6];
                      var2_int += 4;
                      var8 = 0;
                      if (null == ti.field_B) {
                        if (-1 < (t.field_h ^ -1)) {
                          break L5;
                        } else {
                          var24 = ul.a(t.field_h, (byte) 67);
                          if (var24 == null) {
                            break L5;
                          } else {
                            if ((var7.field_q & var24.field_Q) != 0) {
                              var8 = 1;
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                        }
                      } else {
                        if ((var7.field_q & ti.field_B.field_Q) == 0) {
                          break L5;
                        } else {
                          var8 = 1;
                          break L5;
                        }
                      }
                    }
                    L6: {
                      stackOut_22_0 = null;
                      stackOut_22_1 = null;
                      stackOut_22_2 = -1L;
                      stackIn_24_0 = stackOut_22_0;
                      stackIn_24_1 = stackOut_22_1;
                      stackIn_24_2 = stackOut_22_2;
                      stackIn_23_0 = stackOut_22_0;
                      stackIn_23_1 = stackOut_22_1;
                      stackIn_23_2 = stackOut_22_2;
                      if (var8 == 0) {
                        stackOut_24_0 = null;
                        stackOut_24_1 = null;
                        stackOut_24_2 = stackIn_24_2;
                        stackOut_24_3 = ei.field_n;
                        stackIn_25_0 = stackOut_24_0;
                        stackIn_25_1 = stackOut_24_1;
                        stackIn_25_2 = stackOut_24_2;
                        stackIn_25_3 = stackOut_24_3;
                        break L6;
                      } else {
                        stackOut_23_0 = null;
                        stackOut_23_1 = null;
                        stackOut_23_2 = stackIn_23_2;
                        stackOut_23_3 = sb.field_Y;
                        stackIn_25_0 = stackOut_23_0;
                        stackIn_25_1 = stackOut_23_1;
                        stackIn_25_2 = stackOut_23_2;
                        stackIn_25_3 = stackOut_23_3;
                        break L6;
                      }
                    }
                    L7: {
                      var25 = new gh(stackIn_25_2, stackIn_25_3);
                      var25.a(0, var2_int, 78, 4, var3);
                      var10 = new gh(-1L, (gh) null);
                      var10.field_nb = 9211020;
                      var10.field_I = lj.field_b;
                      var10.field_Kb = 1;
                      var10.field_Fb = 2;
                      var10.a(0, 64, 12, 2, -4 + var3);
                      var11 = var7.field_q;
                      var12 = kh.field_v.a((byte) 2, var7);
                      var10.field_L = (mi) ((Object) fk.field_d);
                      var26 = var7.field_d;
                      if (var26 != null) {
                        L8: {
                          if (var26.field_N == var12) {
                            var12 = -1;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        var10.field_S = var26.l(-24719);
                        break L7;
                      } else {
                        L9: {
                          if (0 >= (var11 & 2)) {
                            break L9;
                          } else {
                            var10.field_S = im.field_e;
                            break L9;
                          }
                        }
                        L10: {
                          if ((var11 & 4) <= 0) {
                            break L10;
                          } else {
                            var10.field_S = tc.field_r;
                            break L10;
                          }
                        }
                        if ((var11 & 8 ^ -1) >= -1) {
                          break L7;
                        } else {
                          var10.field_S = ti.field_o;
                          break L7;
                        }
                      }
                    }
                    L11: {
                      var10.field_S = bg.a(var10.field_S, -(var10.field_ub * 2) + var10.field_zb, (byte) -45, var10.field_L);
                      var25.a(var10, 120);
                      param1.a(var25, 124);
                      var14 = new gh(-1L, (gh) null);
                      var14.a(0, 2, 78 - var10.field_Lb - 5, 2, -4 + var3);
                      if (var26 == null) {
                        break L11;
                      } else {
                        var13 = ul.a(var26.field_N, (byte) 67);
                        qb.a(var13, var14, (byte) -93, true, var3, 78 + (-var10.field_Lb + -5));
                        break L11;
                      }
                    }
                    L12: {
                      var25.a(var14, param0 + 117);
                      if (oh.field_f < param1.field_Rb) {
                        break L12;
                      } else {
                        if (param1.field_zb + param1.field_Rb <= oh.field_f) {
                          break L12;
                        } else {
                          if (var2_int + param1.field_cb > pi.field_c) {
                            break L12;
                          } else {
                            if (pi.field_c >= 78 + param1.field_cb + var2_int) {
                              break L12;
                            } else {
                              L13: {
                                if (ti.field_B == null) {
                                  var25.field_I = be.field_f;
                                  break L13;
                                } else {
                                  break L13;
                                }
                              }
                              lj.field_h = var7;
                              break L12;
                            }
                          }
                        }
                      }
                    }
                    L14: {
                      if (0 > var12) {
                        break L14;
                      } else {
                        var15_ref_gh = new gh("", ei.field_n);
                        var15_ref_gh.field_S = uh.field_h;
                        var15_ref_gh.a(param0 + -4, 2, 10, 2, 10);
                        var15_ref_gh.field_L = (mi) ((Object) fk.field_d);
                        var15_ref_gh.field_I = null;
                        var15_ref_gh.field_nb = 65535;
                        var25.a(var15_ref_gh, 123);
                        break L14;
                      }
                    }
                    var15 = param1.field_Rb;
                    var16 = param1.field_cb + (var2_int - -39);
                    var17 = (var15 + var7.field_k) / 2;
                    var18 = 4473924;
                    pb.a(var17, var16, var15, var16, var18, 128);
                    pb.a((var7.field_k * 3 + var17) / 4, (var16 - -(var7.field_l * 3)) / 4, var17, var16, var18, 128);
                    var2_int += 78;
                    var6++;
                    continue L4;
                  }
                }
              } else {
                if (0 != (var20[var5_int].field_q & 2)) {
                  var6_ref_qd = var20[0];
                  var7 = var6_ref_qd;
                  var7 = var6_ref_qd;
                  var20[0] = var20[var5_int];
                  var20[var5_int] = var6_ref_qd;
                  var5_int++;
                  continue L2;
                } else {
                  var5_int++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var2 = decompiledCaughtException;
            stackOut_51_0 = (RuntimeException) (var2);
            stackOut_51_1 = new StringBuilder().append("oc.E(").append(param0).append(',');
            stackIn_53_0 = stackOut_51_0;
            stackIn_53_1 = stackOut_51_1;
            stackIn_52_0 = stackOut_51_0;
            stackIn_52_1 = stackOut_51_1;
            if (param1 == null) {
              stackOut_53_0 = (RuntimeException) ((Object) stackIn_53_0);
              stackOut_53_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackOut_53_2 = "null";
              stackIn_54_0 = stackOut_53_0;
              stackIn_54_1 = stackOut_53_1;
              stackIn_54_2 = stackOut_53_2;
              break L15;
            } else {
              stackOut_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackOut_52_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackOut_52_2 = "{...}";
              stackIn_54_0 = stackOut_52_0;
              stackIn_54_1 = stackOut_52_1;
              stackIn_54_2 = stackOut_52_2;
              break L15;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_54_0), stackIn_54_2 + ')');
        }
        return stackIn_50_0;
    }

    final static boolean a(byte param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 84) {
            break L0;
          } else {
            field_f = (int[]) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (dl.field_J == null) {
              break L2;
            } else {
              if (null == dl.field_J.i(-1850)) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final static void a(int param0, int param1, String param2, boolean param3, boolean param4) {
        RuntimeException var5 = null;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        String stackIn_4_0 = null;
        String stackIn_24_0 = null;
        String stackIn_25_0 = null;
        String stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_2_0 = null;
        int stackOut_37_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_39_1 = 0;
        int stackOut_38_0 = 0;
        int stackOut_38_1 = 0;
        String stackOut_23_0 = null;
        String stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        String stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        var10 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              gd.field_mb = param1;
              nc.field_q = true;
              var11 = param2;
              if (!param4) {
                stackOut_3_0 = dg.field_f;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = cf.field_v;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var6 = stackIn_4_0;
              if (gd.field_mb != 0) {
                if (gd.field_mb != 1) {
                  throw new IllegalArgumentException();
                } else {
                  var7 = tc.a(480, re.field_ib, 75, var11, lj.field_a);
                  var8 = var7 + 2;
                  an.field_g = new String[var8];
                  kk.field_g = new int[var8];
                  var9 = 0;
                  L3: while (true) {
                    if (var9 >= var8) {
                      cb.field_c = new int[1];
                      var9 = 0;
                      L4: while (true) {
                        if (var9 >= var7) {
                          an.field_g[-2 + var8] = "";
                          an.field_g[var8 + -1] = jf.field_cb;
                          kk.field_g[-1 + var8] = 0;
                          cb.field_c[0] = 2;
                          break L2;
                        } else {
                          an.field_g[var9] = lj.field_a[var9];
                          var9++;
                          continue L4;
                        }
                      }
                    } else {
                      kk.field_g[var9] = -1;
                      var9++;
                      continue L3;
                    }
                  }
                }
              } else {
                var7 = tc.a(480, re.field_ib, 75, var11, lj.field_a);
                var8 = 3 + var7;
                an.field_g = new String[var8];
                kk.field_g = new int[var8];
                var9 = 0;
                L5: while (true) {
                  if (var8 <= var9) {
                    cb.field_c = new int[2];
                    var9 = 0;
                    L6: while (true) {
                      if (var7 <= var9) {
                        an.field_g[var8 - 3] = "";
                        an.field_g[var8 - 2] = var6;
                        kk.field_g[-2 + var8] = 0;
                        cb.field_c[0] = 1;
                        an.field_g[-1 + var8] = jf.field_cb;
                        kk.field_g[-1 + var8] = 1;
                        cb.field_c[1] = 2;
                        break L2;
                      } else {
                        an.field_g[var9] = lj.field_a[var9];
                        var9++;
                        continue L6;
                      }
                    }
                  } else {
                    kk.field_g[var9] = -1;
                    var9++;
                    continue L5;
                  }
                }
              }
            }
            se.field_c.field_m = cb.field_c.length;
            var7 = 0;
            var8 = 0;
            L7: while (true) {
              if (an.field_g.length <= var8) {
                gh.field_hb = (id.field_ac - -tf.field_c << 1873917729) * se.field_c.field_m;
                hb.field_b = -(var7 >> -2137875775) + (var7 + vg.field_f);
                hl.field_q = vg.field_f + -(var7 >> -1819045311);
                if (param0 >= 46) {
                  var8 = 0;
                  L8: while (true) {
                    if (var8 >= an.field_g.length) {
                      lk.field_W = qg.field_a + -(gh.field_hb >> 1680923713);
                      se.field_c.a(param3, 0, 0, se.a((byte) 32, oh.field_f, pi.field_c));
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      L9: {
                        stackOut_37_0 = gh.field_hb;
                        stackIn_39_0 = stackOut_37_0;
                        stackIn_38_0 = stackOut_37_0;
                        if (0 <= kk.field_g[var8]) {
                          stackOut_39_0 = stackIn_39_0;
                          stackOut_39_1 = ig.field_e;
                          stackIn_40_0 = stackOut_39_0;
                          stackIn_40_1 = stackOut_39_1;
                          break L9;
                        } else {
                          stackOut_38_0 = stackIn_38_0;
                          stackOut_38_1 = ck.field_e;
                          stackIn_40_0 = stackOut_38_0;
                          stackIn_40_1 = stackOut_38_1;
                          break L9;
                        }
                      }
                      gh.field_hb = stackIn_40_0 + stackIn_40_1;
                      var8++;
                      continue L8;
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                L10: {
                  stackOut_23_0 = an.field_g[var8];
                  stackIn_25_0 = stackOut_23_0;
                  stackIn_24_0 = stackOut_23_0;
                  if (kk.field_g[var8] < 0) {
                    stackOut_25_0 = (String) ((Object) stackIn_25_0);
                    stackOut_25_1 = 0;
                    stackIn_26_0 = stackOut_25_0;
                    stackIn_26_1 = stackOut_25_1;
                    break L10;
                  } else {
                    stackOut_24_0 = (String) ((Object) stackIn_24_0);
                    stackOut_24_1 = 1;
                    stackIn_26_0 = stackOut_24_0;
                    stackIn_26_1 = stackOut_24_1;
                    break L10;
                  }
                }
                L11: {
                  var9 = rg.a(stackIn_26_0, stackIn_26_1 != 0, (byte) -120);
                  if (kk.field_g[var8] != -1) {
                    var9 = var9 + 2 * h.field_U;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  if (var7 < var9) {
                    var7 = var9;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                var8++;
                continue L7;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var5 = decompiledCaughtException;
            stackOut_43_0 = (RuntimeException) (var5);
            stackOut_43_1 = new StringBuilder().append("oc.C(").append(param0).append(',').append(param1).append(',');
            stackIn_45_0 = stackOut_43_0;
            stackIn_45_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param2 == null) {
              stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackOut_45_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L13;
            } else {
              stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackOut_44_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackOut_44_2 = "{...}";
              stackIn_46_0 = stackOut_44_0;
              stackIn_46_1 = stackOut_44_1;
              stackIn_46_2 = stackOut_44_2;
              break L13;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_46_0), stackIn_46_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(boolean param0) {
        fj.field_e = param0 ? true : false;
        uc.field_g = 0 == rf.field_d.f((byte) -103) ? true : false;
    }

    static {
        field_f = new int[]{107, 35, 4, 9, 14, 14, -1, -1, -1, -1};
        field_c = "Offline";
        field_e = "You must engineer the <col=00ffff><%0></col> before you can engineer the <%1>.";
        field_a = "Report abuse";
    }
}
