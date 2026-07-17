/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uo {
    static String field_b;
    static int[] field_f;
    static int[] field_h;
    static String field_d;
    static String field_c;
    static pf field_a;
    static int field_g;
    static boolean field_e;

    final static int a(byte param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_2_0 = 0;
        var2 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            boolean discarded$11 = le.field_e.a(kd.field_a, true, oo.field_e, (byte) 0);
            le.field_e.i(120);
            if (param0 == -75) {
              stackOut_4_0 = 55;
              stackIn_6_0 = stackOut_4_0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (!cc.e((byte) stackIn_6_0)) {
                      break L3;
                    } else {
                      boolean discarded$12 = le.field_e.a(oq.field_j, ho.field_h, true);
                      if (var2 != 0) {
                        break L2;
                      } else {
                        if (var2 == 0) {
                          stackOut_5_0 = 55;
                          stackIn_6_0 = stackOut_5_0;
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  if (cr.field_b != -1) {
                    break L2;
                  } else {
                    if (!mg.field_C) {
                      if (fj.field_s != ue.field_a) {
                        if (!wh.field_a.b(14)) {
                          stackOut_22_0 = 1;
                          stackIn_23_0 = stackOut_22_0;
                          return stackIn_23_0;
                        } else {
                          if (ee.field_l != ue.field_a) {
                            stackOut_27_0 = -1;
                            stackIn_28_0 = stackOut_27_0;
                            break L0;
                          } else {
                            stackOut_25_0 = 2;
                            stackIn_26_0 = stackOut_25_0;
                            return stackIn_26_0;
                          }
                        }
                      } else {
                        stackOut_18_0 = 1;
                        stackIn_19_0 = stackOut_18_0;
                        return stackIn_19_0;
                      }
                    } else {
                      stackOut_15_0 = 3;
                      stackIn_16_0 = stackOut_15_0;
                      return stackIn_16_0;
                    }
                  }
                }
                var1_int = cr.field_b;
                qj.a((byte) -127, -1);
                stackOut_12_0 = var1_int;
                stackIn_13_0 = stackOut_12_0;
                return stackIn_13_0;
              }
            } else {
              stackOut_2_0 = -107;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var1, "uo.A(" + param0 + 41);
        }
        return stackIn_28_0;
    }

    public static void a(boolean param0) {
        field_d = null;
        field_a = null;
        field_h = null;
        field_f = null;
        field_c = null;
        field_b = null;
    }

    final static void a(byte param0, bi param1, int param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = 16711935 & param2;
              if (param0 > 70) {
                break L1;
              } else {
                uo.a(true);
                break L1;
              }
            }
            param2 = param2 & 65280;
            var4 = -1;
            var5 = -param1.field_w;
            L2: while (true) {
              stackOut_4_0 = ~var5;
              stackOut_4_1 = -1;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              L3: while (true) {
                L4: {
                  if (stackIn_5_0 <= stackIn_5_1) {
                    break L4;
                  } else {
                    if (var9 != 0) {
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      var6 = -param1.field_z;
                      L5: while (true) {
                        L6: {
                          if (var6 >= 0) {
                            break L6;
                          } else {
                            var4++;
                            var7 = param1.field_B[var4];
                            stackOut_9_0 = -1;
                            stackOut_9_1 = ~var7;
                            stackIn_5_0 = stackOut_9_0;
                            stackIn_5_1 = stackOut_9_1;
                            stackIn_10_0 = stackOut_9_0;
                            stackIn_10_1 = stackOut_9_1;
                            if (var9 != 0) {
                              continue L3;
                            } else {
                              L7: {
                                L8: {
                                  if (stackIn_10_0 != stackIn_10_1) {
                                    break L8;
                                  } else {
                                    if (var9 == 0) {
                                      break L7;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                                L9: {
                                  var8 = ((var7 & 16711680) >> 16) + (var7 & 255) + ((65280 & var7) >> 7) >> 2;
                                  var7 = (param2 * var8 & 16711680 | var8 * var3_int & -16711936) >>> 8;
                                  if (0 != var7) {
                                    break L9;
                                  } else {
                                    var7 = 1;
                                    break L9;
                                  }
                                }
                                param1.field_B[var4] = var7;
                                break L7;
                              }
                              var6++;
                              if (var9 == 0) {
                                continue L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        var5++;
                        if (var9 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var3 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var3;
            stackOut_19_1 = new StringBuilder().append("uo.D(").append(param0).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L10;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L10;
            }
          }
          throw r.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param2 + 41);
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(byte param0, boolean param1, int param2, boolean param3, boolean param4) {
        RuntimeException var5 = null;
        qr var6 = null;
        qr var7 = null;
        qr var8 = null;
        String var9_ref_String = null;
        int var9 = 0;
        String var10_ref_String = null;
        int var10 = 0;
        int var11_int = 0;
        Object var11 = null;
        int var12 = 0;
        int var13_int = 0;
        String var13 = null;
        int[] var13_array = null;
        int var14_int = 0;
        String var14 = null;
        int var15 = 0;
        int var16 = 0;
        pf var17 = null;
        int var17_int = 0;
        Object var18 = null;
        mj var18_ref = null;
        int var18_int = 0;
        int var19 = 0;
        int[] var20 = null;
        qr var22 = null;
        int[] var23 = null;
        String var24 = null;
        int[] var25 = null;
        qr var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        qr stackIn_18_0 = null;
        qr stackIn_19_0 = null;
        qr stackIn_20_0 = null;
        qr stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_35_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_39_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        int stackIn_46_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_57_1 = 0;
        int stackIn_59_0 = 0;
        int stackIn_59_1 = 0;
        int stackIn_65_0 = 0;
        int stackIn_71_0 = 0;
        Object stackIn_83_0 = null;
        boolean stackIn_111_0 = false;
        int stackIn_129_0 = 0;
        boolean stackIn_143_0 = false;
        int stackIn_149_0 = 0;
        qr stackIn_165_0 = null;
        qr stackIn_166_0 = null;
        qr stackIn_167_0 = null;
        qr stackIn_168_0 = null;
        qr stackIn_169_0 = null;
        qr stackIn_170_0 = null;
        Object stackIn_172_0 = null;
        RuntimeException decompiledCaughtException = null;
        qr stackOut_17_0 = null;
        qr stackOut_18_0 = null;
        qr stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        qr stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_34_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_38_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_41_1 = 0;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_56_1 = 0;
        int stackOut_58_0 = 0;
        int stackOut_58_1 = 0;
        int stackOut_64_0 = 0;
        int stackOut_70_0 = 0;
        Object stackOut_82_0 = null;
        boolean stackOut_110_0 = false;
        int stackOut_128_0 = 0;
        boolean stackOut_142_0 = false;
        int stackOut_148_0 = 0;
        qr stackOut_164_0 = null;
        qr stackOut_165_0 = null;
        qr stackOut_166_0 = null;
        qr stackOut_167_0 = null;
        qr stackOut_168_0 = null;
        qr stackOut_169_0 = null;
        Object stackOut_171_0 = null;
        var18 = null;
        var19 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  qo.a(22353, ee.field_k);
                  if (null != np.field_a) {
                    L4: {
                      L5: {
                        i.field_g.field_s = true;
                        go.field_I.field_mb = 0;
                        var22 = go.field_I;
                        var26 = var22;
                        var26.field_K = 0;
                        var6 = aq.field_j;
                        aq.field_j.field_mb = 0;
                        var6.field_K = 0;
                        dn.field_f.field_mb = 0;
                        var7 = dn.field_f;
                        var7.field_K = 0;
                        if (!ip.a((byte) -94)) {
                          break L5;
                        } else {
                          L6: {
                            L7: {
                              tj.field_f.field_z = n.field_m.toUpperCase();
                              var9 = (pf.field_g.field_K + 2) / 2;
                              go.field_I.a(-2 + var9, 40, (byte) 124, pf.field_g.field_mb - 40, 0);
                              if (~np.field_a.field_Lb <= ~np.field_a.field_Eb) {
                                break L7;
                              } else {
                                go.field_I.field_z = ph.field_c.toUpperCase();
                                go.field_I.field_s = true;
                                if (var19 == 0) {
                                  break L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            go.field_I.field_z = gm.field_j.toUpperCase();
                            go.field_I.field_s = false;
                            break L6;
                          }
                          L8: {
                            go.field_I.field_F = ea.field_a.field_F;
                            if (0 < ah.field_X) {
                              L9: {
                                L10: {
                                  if (ah.field_X != 1) {
                                    break L10;
                                  } else {
                                    var10_ref_String = ui.field_k;
                                    if (var19 == 0) {
                                      break L9;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                                var10_ref_String = re.a(jg.field_e, 4371, new String[1]);
                                break L9;
                              }
                              L11: {
                                if ((16 & ln.field_w) != 0) {
                                  break L11;
                                } else {
                                  if (ti.field_e) {
                                    break L11;
                                  } else {
                                    go.field_I.field_F = ea.field_a.field_lb;
                                    break L11;
                                  }
                                }
                              }
                              go.field_I.field_z = go.field_I.field_z + "<br>" + var10_ref_String;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          L12: {
                            L13: {
                              aq.field_j.a(-var9 + pf.field_g.field_K, 40, (byte) 82, pf.field_g.field_mb - 40, var9);
                              aq.field_j.field_z = lp.field_u.toUpperCase();
                              stackOut_17_0 = aq.field_j;
                              stackIn_20_0 = stackOut_17_0;
                              stackIn_18_0 = stackOut_17_0;
                              if (!param3) {
                                break L13;
                              } else {
                                stackOut_18_0 = (qr) (Object) stackIn_18_0;
                                stackIn_20_0 = stackOut_18_0;
                                stackIn_19_0 = stackOut_18_0;
                                if (sf.field_e != 0L) {
                                  break L13;
                                } else {
                                  stackOut_19_0 = (qr) (Object) stackIn_19_0;
                                  stackOut_19_1 = 1;
                                  stackIn_21_0 = stackOut_19_0;
                                  stackIn_21_1 = stackOut_19_1;
                                  break L12;
                                }
                              }
                            }
                            stackOut_20_0 = (qr) (Object) stackIn_20_0;
                            stackOut_20_1 = 0;
                            stackIn_21_0 = stackOut_20_0;
                            stackIn_21_1 = stackOut_20_1;
                            break L12;
                          }
                          L14: {
                            stackIn_21_0.field_s = stackIn_21_1 != 0;
                            var8 = aq.field_j;
                            var10 = 2;
                            if (pe.field_D != null) {
                              L15: {
                                if (lr.field_c == null) {
                                  lr.field_c = new byte[em.field_k];
                                  ek.field_F = new boolean[em.field_k];
                                  break L15;
                                } else {
                                  break L15;
                                }
                              }
                              var11_int = 0;
                              L16: while (true) {
                                L17: {
                                  L18: {
                                    if (~var11_int <= ~em.field_k) {
                                      break L18;
                                    } else {
                                      ek.field_F[var11_int] = false;
                                      var11_int++;
                                      if (var19 != 0) {
                                        break L17;
                                      } else {
                                        if (var19 == 0) {
                                          continue L16;
                                        } else {
                                          break L18;
                                        }
                                      }
                                    }
                                  }
                                  var10 = 0;
                                  break L17;
                                }
                                L19: while (true) {
                                  L20: {
                                    L21: {
                                      if (var10 >= 2) {
                                        break L21;
                                      } else {
                                        var11_int = 0;
                                        stackOut_34_0 = 0;
                                        stackIn_71_0 = stackOut_34_0;
                                        stackIn_35_0 = stackOut_34_0;
                                        if (var19 != 0) {
                                          break L20;
                                        } else {
                                          var12 = stackIn_35_0;
                                          L22: while (true) {
                                            stackOut_36_0 = pe.field_D.length;
                                            stackOut_36_1 = var12;
                                            stackIn_37_0 = stackOut_36_0;
                                            stackIn_37_1 = stackOut_36_1;
                                            L23: while (true) {
                                              L24: {
                                                L25: {
                                                  if (stackIn_37_0 <= stackIn_37_1) {
                                                    break L25;
                                                  } else {
                                                    var28 = pe.field_D[var12];
                                                    var27 = var28;
                                                    var25 = var27;
                                                    var23 = var25;
                                                    var20 = var23;
                                                    var13_array = var20;
                                                    stackOut_38_0 = 0;
                                                    stackIn_65_0 = stackOut_38_0;
                                                    stackIn_39_0 = stackOut_38_0;
                                                    if (var19 != 0) {
                                                      break L24;
                                                    } else {
                                                      var14_int = stackIn_39_0;
                                                      L26: while (true) {
                                                        L27: {
                                                          L28: {
                                                            L29: {
                                                              if (var14_int >= var28.length) {
                                                                break L29;
                                                              } else {
                                                                var15 = var28[var14_int];
                                                                var16 = var20[var14_int + 1];
                                                                stackOut_41_0 = 0;
                                                                stackOut_41_1 = ~var15;
                                                                stackIn_57_0 = stackOut_41_0;
                                                                stackIn_57_1 = stackOut_41_1;
                                                                stackIn_42_0 = stackOut_41_0;
                                                                stackIn_42_1 = stackOut_41_1;
                                                                if (var19 != 0) {
                                                                  break L28;
                                                                } else {
                                                                  L30: {
                                                                    L31: {
                                                                      if (stackIn_42_0 != stackIn_42_1) {
                                                                        break L31;
                                                                      } else {
                                                                        L32: {
                                                                          if (var10 == 0) {
                                                                            stackOut_45_0 = np.field_a.field_Eb;
                                                                            stackIn_46_0 = stackOut_45_0;
                                                                            break L32;
                                                                          } else {
                                                                            stackOut_44_0 = np.field_a.field_Lb;
                                                                            stackIn_46_0 = stackOut_44_0;
                                                                            break L32;
                                                                          }
                                                                        }
                                                                        L33: {
                                                                          var17_int = stackIn_46_0;
                                                                          if (~var16 == ~var17_int) {
                                                                            break L33;
                                                                          } else {
                                                                            if (var19 == 0) {
                                                                              break L27;
                                                                            } else {
                                                                              break L33;
                                                                            }
                                                                          }
                                                                        }
                                                                        if (var19 == 0) {
                                                                          break L30;
                                                                        } else {
                                                                          break L31;
                                                                        }
                                                                      }
                                                                    }
                                                                    if (~(255 & np.field_a.field_dc[var15]) != ~var16) {
                                                                      break L27;
                                                                    } else {
                                                                      break L30;
                                                                    }
                                                                  }
                                                                  var14_int += 2;
                                                                  if (var19 == 0) {
                                                                    continue L26;
                                                                  } else {
                                                                    break L29;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                            var11_int = 1;
                                                            var14_int = -1;
                                                            var15 = 0;
                                                            stackOut_56_0 = ~var28.length;
                                                            stackOut_56_1 = ~var15;
                                                            stackIn_57_0 = stackOut_56_0;
                                                            stackIn_57_1 = stackOut_56_1;
                                                            break L28;
                                                          }
                                                          L34: while (true) {
                                                            L35: {
                                                              if (stackIn_57_0 >= stackIn_57_1) {
                                                                break L35;
                                                              } else {
                                                                var16 = var28[var15];
                                                                stackOut_58_0 = var16;
                                                                stackOut_58_1 = var14_int;
                                                                stackIn_37_0 = stackOut_58_0;
                                                                stackIn_37_1 = stackOut_58_1;
                                                                stackIn_59_0 = stackOut_58_0;
                                                                stackIn_59_1 = stackOut_58_1;
                                                                if (var19 != 0) {
                                                                  continue L23;
                                                                } else {
                                                                  L36: {
                                                                    if (stackIn_59_0 <= stackIn_59_1) {
                                                                      break L36;
                                                                    } else {
                                                                      var14_int = var16;
                                                                      break L36;
                                                                    }
                                                                  }
                                                                  var15 += 2;
                                                                  if (var19 == 0) {
                                                                    stackOut_56_0 = ~var28.length;
                                                                    stackOut_56_1 = ~var15;
                                                                    stackIn_57_0 = stackOut_56_0;
                                                                    stackIn_57_1 = stackOut_56_1;
                                                                    continue L34;
                                                                  } else {
                                                                    break L35;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                            ek.field_F[var14_int] = true;
                                                            break L27;
                                                          }
                                                        }
                                                        var12++;
                                                        if (var19 == 0) {
                                                          continue L22;
                                                        } else {
                                                          break L25;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                                stackOut_64_0 = var11_int;
                                                stackIn_65_0 = stackOut_64_0;
                                                break L24;
                                              }
                                              L37: {
                                                if (stackIn_65_0 == 0) {
                                                  break L37;
                                                } else {
                                                  if (var19 == 0) {
                                                    break L21;
                                                  } else {
                                                    break L37;
                                                  }
                                                }
                                              }
                                              var10++;
                                              if (var19 == 0) {
                                                continue L19;
                                              } else {
                                                break L21;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    stackOut_70_0 = 2;
                                    stackIn_71_0 = stackOut_70_0;
                                    break L20;
                                  }
                                  if (stackIn_71_0 > bs.field_b) {
                                    break L14;
                                  } else {
                                    if (!di.field_p[12]) {
                                      break L14;
                                    } else {
                                      var10 = 2;
                                      break L14;
                                    }
                                  }
                                }
                              }
                            } else {
                              break L14;
                            }
                          }
                          L38: {
                            L39: {
                              if (var10 < 2) {
                                break L39;
                              } else {
                                L40: {
                                  if (null != td.field_E) {
                                    break L40;
                                  } else {
                                    if (null != ci.field_h) {
                                      break L40;
                                    } else {
                                      if (null != pg.field_A) {
                                        break L40;
                                      } else {
                                        if (null != ji.field_D) {
                                          break L40;
                                        } else {
                                          break L38;
                                        }
                                      }
                                    }
                                  }
                                }
                                var11_int = 0;
                                var12 = 0;
                                var13_int = 0;
                                var14_int = 0;
                                var15 = 0;
                                var16 = 0;
                                L41: while (true) {
                                  L42: {
                                    if (em.field_k <= var16) {
                                      break L42;
                                    } else {
                                      var17_int = 255 & np.field_a.field_dc[var16];
                                      stackOut_82_0 = null;
                                      stackIn_172_0 = stackOut_82_0;
                                      stackIn_83_0 = stackOut_82_0;
                                      if (var19 != 0) {
                                        break L2;
                                      } else {
                                        L43: {
                                          if (stackIn_83_0 == (Object) (Object) td.field_E) {
                                            break L43;
                                          } else {
                                            if (td.field_E[var16] != null) {
                                              if (td.field_E[var16][var17_int]) {
                                                var11_int = 1;
                                                break L43;
                                              } else {
                                                break L43;
                                              }
                                            } else {
                                              break L43;
                                            }
                                          }
                                        }
                                        L44: {
                                          if (null == ci.field_h) {
                                            break L44;
                                          } else {
                                            if (ci.field_h[var16] == null) {
                                              break L44;
                                            } else {
                                              L45: {
                                                var18_int = ci.field_h[var16][var17_int];
                                                if (var18_int == 0) {
                                                  break L45;
                                                } else {
                                                  if (hm.field_o) {
                                                    break L45;
                                                  } else {
                                                    var11_int = 1;
                                                    break L45;
                                                  }
                                                }
                                              }
                                              if (var18_int <= var13_int) {
                                                break L44;
                                              } else {
                                                var13_int = var18_int;
                                                break L44;
                                              }
                                            }
                                          }
                                        }
                                        L46: {
                                          if (pg.field_A == null) {
                                            break L46;
                                          } else {
                                            if (null == pg.field_A[var16]) {
                                              break L46;
                                            } else {
                                              L47: {
                                                var18_int = pg.field_A[var16][var17_int];
                                                if (var14_int < var18_int) {
                                                  var14_int = var18_int;
                                                  break L47;
                                                } else {
                                                  break L47;
                                                }
                                              }
                                              if (var18_int == 0) {
                                                break L46;
                                              } else {
                                                if (hm.field_o) {
                                                  break L46;
                                                } else {
                                                  var11_int = 1;
                                                  break L46;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        L48: {
                                          if (null == ji.field_D) {
                                            break L48;
                                          } else {
                                            if (ji.field_D[var16] == null) {
                                              break L48;
                                            } else {
                                              var15 = var15 | ji.field_D[var16][var17_int];
                                              break L48;
                                            }
                                          }
                                        }
                                        var16++;
                                        if (var19 == 0) {
                                          continue L41;
                                        } else {
                                          break L42;
                                        }
                                      }
                                    }
                                  }
                                  var16 = 0;
                                  var17 = ro.field_a.field_xb.field_M;
                                  var18_ref = (mj) (Object) var17.d(0);
                                  L49: while (true) {
                                    L50: {
                                      L51: {
                                        if (var18_ref == null) {
                                          break L51;
                                        } else {
                                          stackOut_110_0 = var18_ref.h(-80);
                                          stackIn_129_0 = stackOut_110_0 ? 1 : 0;
                                          stackIn_111_0 = stackOut_110_0;
                                          if (var19 != 0) {
                                            break L50;
                                          } else {
                                            L52: {
                                              L53: {
                                                if (!stackIn_111_0) {
                                                  break L53;
                                                } else {
                                                  if (var19 == 0) {
                                                    break L52;
                                                  } else {
                                                    break L53;
                                                  }
                                                }
                                              }
                                              L54: {
                                                if (var11_int == 0) {
                                                  break L54;
                                                } else {
                                                  if (!var18_ref.field_Ub) {
                                                    var16 = 1;
                                                    if (var19 == 0) {
                                                      break L51;
                                                    } else {
                                                      break L54;
                                                    }
                                                  } else {
                                                    break L54;
                                                  }
                                                }
                                              }
                                              L55: {
                                                if (~var18_ref.field_Qb <= ~var13_int) {
                                                  break L55;
                                                } else {
                                                  var16 = 1;
                                                  if (var19 == 0) {
                                                    break L51;
                                                  } else {
                                                    break L55;
                                                  }
                                                }
                                              }
                                              L56: {
                                                if (~var14_int >= ~var18_ref.field_Fb) {
                                                  break L56;
                                                } else {
                                                  var16 = 1;
                                                  if (var19 == 0) {
                                                    break L51;
                                                  } else {
                                                    break L56;
                                                  }
                                                }
                                              }
                                              L57: {
                                                if ((var15 & ~var18_ref.field_Wb) <= 0) {
                                                  break L57;
                                                } else {
                                                  var16 = 1;
                                                  if (var19 == 0) {
                                                    break L51;
                                                  } else {
                                                    break L57;
                                                  }
                                                }
                                              }
                                              if (var12 != 0) {
                                                var16 = 1;
                                                if (var19 == 0) {
                                                  break L51;
                                                } else {
                                                  break L52;
                                                }
                                              } else {
                                                break L52;
                                              }
                                            }
                                            var18_ref = (mj) (Object) var17.a((byte) -71);
                                            if (var19 == 0) {
                                              continue L49;
                                            } else {
                                              break L51;
                                            }
                                          }
                                        }
                                      }
                                      stackOut_128_0 = 2;
                                      stackIn_129_0 = stackOut_128_0;
                                      break L50;
                                    }
                                    L58: {
                                      if (stackIn_129_0 > bs.field_b) {
                                        break L58;
                                      } else {
                                        if (!di.field_p[12]) {
                                          break L58;
                                        } else {
                                          var16 = 0;
                                          break L58;
                                        }
                                      }
                                    }
                                    L59: {
                                      if (var16 == 0) {
                                        break L59;
                                      } else {
                                        aq.field_j.field_s = false;
                                        if (!aq.field_j.field_v) {
                                          break L59;
                                        } else {
                                          L60: {
                                            if (n.field_h.field_d.field_zb == 0) {
                                              break L60;
                                            } else {
                                              dn.field_k = re.a(jr.field_l, param0 ^ 4356, new String[1]);
                                              if (var19 == 0) {
                                                break L59;
                                              } else {
                                                break L60;
                                              }
                                            }
                                          }
                                          dn.field_k = on.field_a;
                                          break L59;
                                        }
                                      }
                                    }
                                    if (var19 == 0) {
                                      break L38;
                                    } else {
                                      break L39;
                                    }
                                  }
                                }
                              }
                            }
                            aq.field_j.field_s = false;
                            if (!aq.field_j.field_v) {
                              break L38;
                            } else {
                              var11 = null;
                              var12 = 0;
                              var13_int = 0;
                              L61: while (true) {
                                L62: {
                                  L63: {
                                    if (em.field_k <= var13_int) {
                                      break L63;
                                    } else {
                                      stackOut_142_0 = ek.field_F[var13_int];
                                      stackIn_149_0 = stackOut_142_0 ? 1 : 0;
                                      stackIn_143_0 = stackOut_142_0;
                                      if (var19 != 0) {
                                        break L62;
                                      } else {
                                        L64: {
                                          if (!stackIn_143_0) {
                                            break L64;
                                          } else {
                                            L65: {
                                              var24 = "<col=A00000>" + gm.field_l[var13_int] + "</col>";
                                              if (var11 == null) {
                                                break L65;
                                              } else {
                                                var11 = (Object) (Object) (var11 + ", " + var24);
                                                var12 = 1;
                                                if (var19 == 0) {
                                                  break L64;
                                                } else {
                                                  break L65;
                                                }
                                              }
                                            }
                                            var11 = (Object) (Object) var24;
                                            break L64;
                                          }
                                        }
                                        var13_int++;
                                        if (var19 == 0) {
                                          continue L61;
                                        } else {
                                          break L63;
                                        }
                                      }
                                    }
                                  }
                                  stackOut_148_0 = var10;
                                  stackIn_149_0 = stackOut_148_0;
                                  break L62;
                                }
                                L66: {
                                  if (stackIn_149_0 != 0) {
                                    L67: {
                                      var13 = md.field_I;
                                      if (var12 == 0) {
                                        break L67;
                                      } else {
                                        var14 = mi.field_b + var11;
                                        if (var19 == 0) {
                                          break L66;
                                        } else {
                                          break L67;
                                        }
                                      }
                                    }
                                    var14 = re.a(r.field_f, 4371, new String[1]);
                                    break L66;
                                  } else {
                                    L68: {
                                      var13 = up.field_e;
                                      if (var12 != 0) {
                                        break L68;
                                      } else {
                                        var14 = re.a(js.field_h, 4371, new String[1]);
                                        if (var19 == 0) {
                                          break L66;
                                        } else {
                                          break L68;
                                        }
                                      }
                                    }
                                    var14 = br.field_l + var11;
                                    break L66;
                                  }
                                }
                                dn.field_k = "<col=A00000>" + var13 + "<br>" + var14;
                                break L38;
                              }
                            }
                          }
                          if (var19 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var9_ref_String = np.field_a.field_Xb;
                      tj.field_f.field_z = re.a(he.field_q, 4371, new String[1]).toUpperCase();
                      dn.field_f.a(pf.field_g.field_K, 40, (byte) 56, pf.field_g.field_mb + -40, 0);
                      dn.field_f.field_z = re.a(gq.field_a, 4371, new String[1]);
                      var8 = dn.field_f;
                      break L4;
                    }
                    L69: {
                      if (sf.field_e == 0L) {
                        break L69;
                      } else {
                        L70: {
                          var9 = (int)(sf.field_e - pr.a(14274));
                          var9 = (var9 + 999) / 1000;
                          if (var9 >= 1) {
                            break L70;
                          } else {
                            var9 = 1;
                            break L70;
                          }
                        }
                        var8.field_z = re.a(oe.field_b, 4371, new String[1]);
                        break L69;
                      }
                    }
                    ac.field_x.field_z = re.a(eg.field_r, 4371, new String[2]);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L71: {
                  stackOut_164_0 = am.field_xb;
                  stackIn_166_0 = stackOut_164_0;
                  stackIn_165_0 = stackOut_164_0;
                  if (!param1) {
                    break L71;
                  } else {
                    stackOut_165_0 = (qr) (Object) stackIn_165_0;
                    stackIn_166_0 = stackOut_165_0;
                    break L71;
                  }
                }
                L72: {
                  ((qr) (Object) stackIn_166_0).a(false, -20429);
                  stackOut_166_0 = pf.field_g;
                  stackIn_168_0 = stackOut_166_0;
                  stackIn_167_0 = stackOut_166_0;
                  if (!param1) {
                    break L72;
                  } else {
                    stackOut_167_0 = (qr) (Object) stackIn_167_0;
                    stackIn_168_0 = stackOut_167_0;
                    break L72;
                  }
                }
                L73: {
                  ((qr) (Object) stackIn_168_0).a(false, -20429);
                  stackOut_168_0 = ed.field_d;
                  stackIn_170_0 = stackOut_168_0;
                  stackIn_169_0 = stackOut_168_0;
                  if (!param1) {
                    break L73;
                  } else {
                    stackOut_169_0 = (qr) (Object) stackIn_169_0;
                    stackIn_170_0 = stackOut_169_0;
                    break L73;
                  }
                }
                ((qr) (Object) stackIn_170_0).a(false, -20429);
                n.field_h.field_d.f(false);
                if (param0 == 23) {
                  break L1;
                } else {
                  stackOut_171_0 = null;
                  stackIn_172_0 = stackOut_171_0;
                  break L2;
                }
              }
              field_c = (String) (Object) stackIn_172_0;
              break L1;
            }
            L74: {
              if (np.field_a == null) {
                break L74;
              } else {
                L75: {
                  if (0 == i.field_g.field_rb) {
                    break L75;
                  } else {
                    tk.a(param2, np.field_a.g(-92), (byte) -2);
                    break L75;
                  }
                }
                L76: {
                  if (0 != aq.field_j.field_rb) {
                    ac.field_u = true;
                    break L76;
                  } else {
                    break L76;
                  }
                }
                L77: {
                  if (0 != go.field_I.field_rb) {
                    ti.field_e = true;
                    break L77;
                  } else {
                    break L77;
                  }
                }
                L78: {
                  if (oo.field_c.field_rb != 0) {
                    ti.field_e = false;
                    break L78;
                  } else {
                    break L78;
                  }
                }
                sc.a(63, false, np.field_a, param2);
                break L74;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var5, "uo.B(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + 1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Offer unrated rematch";
        field_h = new int[128];
        field_d = "Press 'ESC' to exit the game";
        field_c = "You have entered another game.";
    }
}
