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
        boolean discarded$11 = false;
        boolean discarded$12 = false;
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_27_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        var2 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            discarded$11 = le.field_e.a(kd.field_a, true, oo.field_e, (byte) 0);
            le.field_e.i(120);
            if (param0 == -75) {
              stackOut_4_0 = 55;
              stackIn_6_0 = stackOut_4_0;
              L1: while (true) {
                if (!cc.e((byte) stackIn_6_0)) {
                  if (0 != (cr.field_b ^ -1)) {
                    var1_int = cr.field_b;
                    qj.a((byte) -127, -1);
                    stackOut_11_0 = var1_int;
                    stackIn_12_0 = stackOut_11_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    if (!mg.field_C) {
                      if (fj.field_s != ue.field_a) {
                        if (!wh.field_a.b(14)) {
                          stackOut_21_0 = 1;
                          stackIn_22_0 = stackOut_21_0;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          if (ee.field_l != ue.field_a) {
                            stackOut_26_0 = -1;
                            stackIn_27_0 = stackOut_26_0;
                            decompiledRegionSelector0 = 6;
                            break L0;
                          } else {
                            stackOut_24_0 = 2;
                            stackIn_25_0 = stackOut_24_0;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          }
                        }
                      } else {
                        stackOut_17_0 = 1;
                        stackIn_18_0 = stackOut_17_0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    } else {
                      stackOut_14_0 = 3;
                      stackIn_15_0 = stackOut_14_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                } else {
                  discarded$12 = le.field_e.a(oq.field_j, ho.field_h, true);
                  stackOut_5_0 = 55;
                  stackIn_6_0 = stackOut_5_0;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = -107;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1), "uo.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_18_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_22_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_25_0;
                  } else {
                    return stackIn_27_0;
                  }
                }
              }
            }
          }
        }
    }

    public static void a(boolean param0) {
        L0: {
          field_d = null;
          field_a = null;
          field_h = null;
          field_f = null;
          field_c = null;
          field_b = null;
          if (param0) {
            break L0;
          } else {
            uo.a((byte) 46, false, 50, true, true);
            break L0;
          }
        }
    }

    final static void a(byte param0, bi param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
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
              if ((var5 ^ -1) <= -1) {
                break L0;
              } else {
                var6 = -param1.field_z;
                L3: while (true) {
                  if (var6 >= 0) {
                    var5++;
                    continue L2;
                  } else {
                    L4: {
                      var4++;
                      var7 = param1.field_B[var4];
                      if (-1 != (var7 ^ -1)) {
                        L5: {
                          var8 = ((var7 & 16711680) >> 1886003600) + (var7 & 255) + ((65280 & var7) >> -691009817) >> -50217598;
                          var7 = (param2 * var8 & 16711680 | var8 * var3_int & -16711936) >>> 1018675432;
                          if (0 != var7) {
                            break L5;
                          } else {
                            var7 = 1;
                            break L5;
                          }
                        }
                        param1.field_B[var4] = var7;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var6++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var3);
            stackOut_16_1 = new StringBuilder().append("uo.D(").append(param0).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param2 + ')');
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
        qr var21 = null;
        int[] var22 = null;
        String var23 = null;
        int[] var24 = null;
        qr var25 = null;
        qr stackIn_18_0 = null;
        qr stackIn_19_0 = null;
        qr stackIn_20_0 = null;
        qr stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_40_0 = 0;
        qr stackIn_150_0 = null;
        qr stackIn_151_0 = null;
        qr stackIn_152_0 = null;
        qr stackIn_153_0 = null;
        qr stackIn_154_0 = null;
        int stackIn_154_1 = 0;
        qr stackIn_155_0 = null;
        qr stackIn_156_0 = null;
        qr stackIn_157_0 = null;
        qr stackIn_158_0 = null;
        qr stackIn_159_0 = null;
        int stackIn_159_1 = 0;
        qr stackIn_160_0 = null;
        qr stackIn_161_0 = null;
        qr stackIn_162_0 = null;
        qr stackIn_163_0 = null;
        qr stackIn_164_0 = null;
        int stackIn_164_1 = 0;
        Object stackIn_166_0 = null;
        RuntimeException decompiledCaughtException = null;
        qr stackOut_17_0 = null;
        qr stackOut_18_0 = null;
        qr stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        qr stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_39_0 = 0;
        int stackOut_38_0 = 0;
        qr stackOut_149_0 = null;
        qr stackOut_150_0 = null;
        qr stackOut_151_0 = null;
        qr stackOut_152_0 = null;
        int stackOut_152_1 = 0;
        qr stackOut_153_0 = null;
        int stackOut_153_1 = 0;
        qr stackOut_154_0 = null;
        qr stackOut_155_0 = null;
        qr stackOut_156_0 = null;
        qr stackOut_157_0 = null;
        int stackOut_157_1 = 0;
        qr stackOut_158_0 = null;
        int stackOut_158_1 = 0;
        qr stackOut_159_0 = null;
        qr stackOut_160_0 = null;
        qr stackOut_161_0 = null;
        qr stackOut_162_0 = null;
        int stackOut_162_1 = 0;
        qr stackOut_163_0 = null;
        int stackOut_163_1 = 0;
        Object stackOut_165_0 = null;
        var18 = null;
        var19 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              qo.a(22353, ee.field_k);
              if (null != np.field_a) {
                L2: {
                  i.field_g.field_s = true;
                  go.field_I.field_mb = 0;
                  var21 = go.field_I;
                  var25 = var21;
                  var25.field_K = 0;
                  var6 = aq.field_j;
                  aq.field_j.field_mb = 0;
                  var6.field_K = 0;
                  dn.field_f.field_mb = 0;
                  var7 = dn.field_f;
                  var7.field_K = 0;
                  if (!ip.a((byte) -94)) {
                    var9_ref_String = np.field_a.field_Xb;
                    tj.field_f.field_z = re.a(he.field_q, 4371, new String[]{var9_ref_String}).toUpperCase();
                    dn.field_f.a(pf.field_g.field_K, 40, (byte) 56, pf.field_g.field_mb + -40, 0);
                    dn.field_f.field_z = re.a(gq.field_a, 4371, new String[]{var9_ref_String});
                    var8 = dn.field_f;
                    break L2;
                  } else {
                    L3: {
                      tj.field_f.field_z = n.field_m.toUpperCase();
                      var9 = (pf.field_g.field_K + 2) / 2;
                      go.field_I.a(-2 + var9, 40, (byte) 124, pf.field_g.field_mb - 40, 0);
                      if (np.field_a.field_Lb >= np.field_a.field_Eb) {
                        go.field_I.field_z = gm.field_j.toUpperCase();
                        go.field_I.field_s = false;
                        break L3;
                      } else {
                        go.field_I.field_z = ph.field_c.toUpperCase();
                        go.field_I.field_s = true;
                        break L3;
                      }
                    }
                    L4: {
                      go.field_I.field_F = ea.field_a.field_F;
                      if (0 < ah.field_X) {
                        L5: {
                          if (ah.field_X != 1) {
                            var10_ref_String = re.a(jg.field_e, 4371, new String[]{Integer.toString(ah.field_X)});
                            break L5;
                          } else {
                            var10_ref_String = ui.field_k;
                            break L5;
                          }
                        }
                        L6: {
                          if (-1 != (16 & ln.field_w ^ -1)) {
                            break L6;
                          } else {
                            if (ti.field_e) {
                              break L6;
                            } else {
                              go.field_I.field_F = ea.field_a.field_lb;
                              break L6;
                            }
                          }
                        }
                        go.field_I.field_z = go.field_I.field_z + "<br>" + var10_ref_String;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L7: {
                      L8: {
                        aq.field_j.a(-var9 + pf.field_g.field_K, 40, (byte) 82, pf.field_g.field_mb - 40, var9);
                        aq.field_j.field_z = lp.field_u.toUpperCase();
                        stackOut_17_0 = aq.field_j;
                        stackIn_20_0 = stackOut_17_0;
                        stackIn_18_0 = stackOut_17_0;
                        if (!param3) {
                          break L8;
                        } else {
                          stackOut_18_0 = (qr) ((Object) stackIn_18_0);
                          stackIn_20_0 = stackOut_18_0;
                          stackIn_19_0 = stackOut_18_0;
                          if (sf.field_e != 0L) {
                            break L8;
                          } else {
                            stackOut_19_0 = (qr) ((Object) stackIn_19_0);
                            stackOut_19_1 = 1;
                            stackIn_21_0 = stackOut_19_0;
                            stackIn_21_1 = stackOut_19_1;
                            break L7;
                          }
                        }
                      }
                      stackOut_20_0 = (qr) ((Object) stackIn_20_0);
                      stackOut_20_1 = 0;
                      stackIn_21_0 = stackOut_20_0;
                      stackIn_21_1 = stackOut_20_1;
                      break L7;
                    }
                    L9: {
                      stackIn_21_0.field_s = stackIn_21_1 != 0;
                      var8 = aq.field_j;
                      var10 = 2;
                      if (pe.field_D != null) {
                        L10: {
                          if (lr.field_c == null) {
                            lr.field_c = new byte[em.field_k];
                            ek.field_F = new boolean[em.field_k];
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        var11_int = 0;
                        L11: while (true) {
                          if (var11_int >= em.field_k) {
                            var10 = 0;
                            L12: while (true) {
                              L13: {
                                if ((var10 ^ -1) <= -3) {
                                  break L13;
                                } else {
                                  var11_int = 0;
                                  var12 = 0;
                                  L14: while (true) {
                                    if (pe.field_D.length <= var12) {
                                      if (var11_int == 0) {
                                        var10++;
                                        continue L12;
                                      } else {
                                        break L13;
                                      }
                                    } else {
                                      var24 = pe.field_D[var12];
                                      var22 = var24;
                                      var13_array = var22;
                                      var14_int = 0;
                                      L15: while (true) {
                                        L16: {
                                          if (var14_int >= var24.length) {
                                            var11_int = 1;
                                            var14_int = -1;
                                            var15 = 0;
                                            L17: while (true) {
                                              if (var24.length <= var15) {
                                                ek.field_F[var14_int] = true;
                                                break L16;
                                              } else {
                                                var16 = var24[var15];
                                                if (var16 > var14_int) {
                                                  var14_int = var16;
                                                  var15 += 2;
                                                  continue L17;
                                                } else {
                                                  var15 += 2;
                                                  continue L17;
                                                }
                                              }
                                            }
                                          } else {
                                            L18: {
                                              var15 = var24[var14_int];
                                              var16 = var13_array[var14_int + 1];
                                              if (0 != (var15 ^ -1)) {
                                                if ((255 & np.field_a.field_dc[var15]) == var16) {
                                                  break L18;
                                                } else {
                                                  var12++;
                                                  continue L14;
                                                }
                                              } else {
                                                L19: {
                                                  if (var10 == 0) {
                                                    stackOut_39_0 = np.field_a.field_Eb;
                                                    stackIn_40_0 = stackOut_39_0;
                                                    break L19;
                                                  } else {
                                                    stackOut_38_0 = np.field_a.field_Lb;
                                                    stackIn_40_0 = stackOut_38_0;
                                                    break L19;
                                                  }
                                                }
                                                var17_int = stackIn_40_0;
                                                if (var16 == var17_int) {
                                                  break L18;
                                                } else {
                                                  break L16;
                                                }
                                              }
                                            }
                                            var14_int += 2;
                                            continue L15;
                                          }
                                        }
                                        var12++;
                                        continue L14;
                                      }
                                    }
                                  }
                                }
                              }
                              if (2 > bs.field_b) {
                                break L9;
                              } else {
                                if (!di.field_p[12]) {
                                  break L9;
                                } else {
                                  var10 = 2;
                                  break L9;
                                }
                              }
                            }
                          } else {
                            ek.field_F[var11_int] = false;
                            var11_int++;
                            continue L11;
                          }
                        }
                      } else {
                        break L9;
                      }
                    }
                    if (-3 < (var10 ^ -1)) {
                      aq.field_j.field_s = false;
                      if (!aq.field_j.field_v) {
                        break L2;
                      } else {
                        var11 = null;
                        var12 = 0;
                        var13_int = 0;
                        L20: while (true) {
                          if (em.field_k <= var13_int) {
                            L21: {
                              if (var10 != 0) {
                                var13 = md.field_I;
                                if (var12 == 0) {
                                  var14 = re.a(r.field_f, 4371, new String[]{(String) (var11)});
                                  break L21;
                                } else {
                                  var14 = mi.field_b + (String) (var11);
                                  break L21;
                                }
                              } else {
                                var13 = up.field_e;
                                if (var12 != 0) {
                                  var14 = br.field_l + (String) (var11);
                                  break L21;
                                } else {
                                  var14 = re.a(js.field_h, 4371, new String[]{(String) (var11)});
                                  break L21;
                                }
                              }
                            }
                            dn.field_k = "<col=A00000>" + var13 + "<br>" + var14;
                            break L2;
                          } else {
                            if (ek.field_F[var13_int]) {
                              L22: {
                                var23 = "<col=A00000>" + gm.field_l[var13_int] + "</col>";
                                if (var11 == null) {
                                  var11 = var23;
                                  break L22;
                                } else {
                                  var11 = (String) (var11) + ", " + var23;
                                  var12 = 1;
                                  break L22;
                                }
                              }
                              var13_int++;
                              continue L20;
                            } else {
                              var13_int++;
                              continue L20;
                            }
                          }
                        }
                      }
                    } else {
                      L23: {
                        if (null != td.field_E) {
                          break L23;
                        } else {
                          if (null != ci.field_h) {
                            break L23;
                          } else {
                            if (null != pg.field_A) {
                              break L23;
                            } else {
                              if (null != ji.field_D) {
                                break L23;
                              } else {
                                break L2;
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
                      L24: while (true) {
                        if (em.field_k <= var16) {
                          var16 = 0;
                          var17 = ro.field_a.field_xb.field_M;
                          var18_ref = (mj) ((Object) var17.d(0));
                          L25: while (true) {
                            L26: {
                              if (var18_ref == null) {
                                break L26;
                              } else {
                                L27: {
                                  if (!var18_ref.h(-80)) {
                                    L28: {
                                      if (var11_int == 0) {
                                        break L28;
                                      } else {
                                        if (!var18_ref.field_Ub) {
                                          var16 = 1;
                                          break L26;
                                        } else {
                                          break L28;
                                        }
                                      }
                                    }
                                    if (var18_ref.field_Qb >= var13_int) {
                                      if (var14_int <= var18_ref.field_Fb) {
                                        if (-1 <= (var15 & (var18_ref.field_Wb ^ -1) ^ -1)) {
                                          if (var12 != 0) {
                                            var16 = 1;
                                            break L26;
                                          } else {
                                            break L27;
                                          }
                                        } else {
                                          var16 = 1;
                                          break L26;
                                        }
                                      } else {
                                        var16 = 1;
                                        break L26;
                                      }
                                    } else {
                                      var16 = 1;
                                      break L26;
                                    }
                                  } else {
                                    break L27;
                                  }
                                }
                                var18_ref = (mj) ((Object) var17.a((byte) -71));
                                continue L25;
                              }
                            }
                            L29: {
                              if (2 > bs.field_b) {
                                break L29;
                              } else {
                                if (!di.field_p[12]) {
                                  break L29;
                                } else {
                                  var16 = 0;
                                  break L29;
                                }
                              }
                            }
                            if (var16 == 0) {
                              break L2;
                            } else {
                              aq.field_j.field_s = false;
                              if (!aq.field_j.field_v) {
                                break L2;
                              } else {
                                if (-1 == (n.field_h.field_d.field_zb ^ -1)) {
                                  dn.field_k = on.field_a;
                                  break L2;
                                } else {
                                  dn.field_k = re.a(jr.field_l, param0 ^ 4356, new String[]{jo.field_c});
                                  break L2;
                                }
                              }
                            }
                          }
                        } else {
                          L30: {
                            var17_int = 255 & np.field_a.field_dc[var16];
                            if (null == td.field_E) {
                              break L30;
                            } else {
                              if (td.field_E[var16] != null) {
                                if (td.field_E[var16][var17_int]) {
                                  var11_int = 1;
                                  break L30;
                                } else {
                                  break L30;
                                }
                              } else {
                                break L30;
                              }
                            }
                          }
                          L31: {
                            if (null == ci.field_h) {
                              break L31;
                            } else {
                              if (ci.field_h[var16] == null) {
                                break L31;
                              } else {
                                L32: {
                                  var18_int = ci.field_h[var16][var17_int];
                                  if (-1 == (var18_int ^ -1)) {
                                    break L32;
                                  } else {
                                    if (hm.field_o) {
                                      break L32;
                                    } else {
                                      var11_int = 1;
                                      break L32;
                                    }
                                  }
                                }
                                if (var18_int <= var13_int) {
                                  break L31;
                                } else {
                                  var13_int = var18_int;
                                  break L31;
                                }
                              }
                            }
                          }
                          L33: {
                            if (pg.field_A == null) {
                              break L33;
                            } else {
                              if (null == pg.field_A[var16]) {
                                break L33;
                              } else {
                                L34: {
                                  var18_int = pg.field_A[var16][var17_int];
                                  if (var14_int < var18_int) {
                                    var14_int = var18_int;
                                    break L34;
                                  } else {
                                    break L34;
                                  }
                                }
                                if (-1 == (var18_int ^ -1)) {
                                  break L33;
                                } else {
                                  if (hm.field_o) {
                                    break L33;
                                  } else {
                                    var11_int = 1;
                                    break L33;
                                  }
                                }
                              }
                            }
                          }
                          if (null != ji.field_D) {
                            if (ji.field_D[var16] != null) {
                              var15 = var15 | ji.field_D[var16][var17_int];
                              var16++;
                              continue L24;
                            } else {
                              var16++;
                              continue L24;
                            }
                          } else {
                            var16++;
                            continue L24;
                          }
                        }
                      }
                    }
                  }
                }
                L35: {
                  if ((sf.field_e ^ -1L) == -1L) {
                    break L35;
                  } else {
                    L36: {
                      var9 = (int)(sf.field_e - pr.a(14274));
                      var9 = (var9 + 999) / 1000;
                      if ((var9 ^ -1) <= -2) {
                        break L36;
                      } else {
                        var9 = 1;
                        break L36;
                      }
                    }
                    var8.field_z = re.a(oe.field_b, 4371, new String[]{Integer.toString(var9)});
                    break L35;
                  }
                }
                ac.field_x.field_z = re.a(eg.field_r, 4371, new String[]{Integer.toString(np.field_a.field_Lb), Integer.toString(np.field_a.field_Eb)});
                break L1;
              } else {
                break L1;
              }
            }
            L37: {
              L38: {
                stackOut_149_0 = am.field_xb;
                stackIn_153_0 = stackOut_149_0;
                stackIn_150_0 = stackOut_149_0;
                if (!param1) {
                  break L38;
                } else {
                  stackOut_150_0 = (qr) ((Object) stackIn_150_0);
                  stackIn_153_0 = stackOut_150_0;
                  stackIn_151_0 = stackOut_150_0;
                  if (param4) {
                    break L38;
                  } else {
                    stackOut_151_0 = (qr) ((Object) stackIn_151_0);
                    stackIn_153_0 = stackOut_151_0;
                    stackIn_152_0 = stackOut_151_0;
                    if (ti.field_e) {
                      break L38;
                    } else {
                      stackOut_152_0 = (qr) ((Object) stackIn_152_0);
                      stackOut_152_1 = 1;
                      stackIn_154_0 = stackOut_152_0;
                      stackIn_154_1 = stackOut_152_1;
                      break L37;
                    }
                  }
                }
              }
              stackOut_153_0 = (qr) ((Object) stackIn_153_0);
              stackOut_153_1 = 0;
              stackIn_154_0 = stackOut_153_0;
              stackIn_154_1 = stackOut_153_1;
              break L37;
            }
            L39: {
              L40: {
                ((qr) (Object) stackIn_154_0).a(stackIn_154_1 != 0, -20429);
                stackOut_154_0 = pf.field_g;
                stackIn_158_0 = stackOut_154_0;
                stackIn_155_0 = stackOut_154_0;
                if (!param1) {
                  break L40;
                } else {
                  stackOut_155_0 = (qr) ((Object) stackIn_155_0);
                  stackIn_158_0 = stackOut_155_0;
                  stackIn_156_0 = stackOut_155_0;
                  if (param4) {
                    break L40;
                  } else {
                    stackOut_156_0 = (qr) ((Object) stackIn_156_0);
                    stackIn_158_0 = stackOut_156_0;
                    stackIn_157_0 = stackOut_156_0;
                    if (ti.field_e) {
                      break L40;
                    } else {
                      stackOut_157_0 = (qr) ((Object) stackIn_157_0);
                      stackOut_157_1 = 1;
                      stackIn_159_0 = stackOut_157_0;
                      stackIn_159_1 = stackOut_157_1;
                      break L39;
                    }
                  }
                }
              }
              stackOut_158_0 = (qr) ((Object) stackIn_158_0);
              stackOut_158_1 = 0;
              stackIn_159_0 = stackOut_158_0;
              stackIn_159_1 = stackOut_158_1;
              break L39;
            }
            L41: {
              L42: {
                ((qr) (Object) stackIn_159_0).a(stackIn_159_1 != 0, -20429);
                stackOut_159_0 = ed.field_d;
                stackIn_163_0 = stackOut_159_0;
                stackIn_160_0 = stackOut_159_0;
                if (!param1) {
                  break L42;
                } else {
                  stackOut_160_0 = (qr) ((Object) stackIn_160_0);
                  stackIn_163_0 = stackOut_160_0;
                  stackIn_161_0 = stackOut_160_0;
                  if (param4) {
                    break L42;
                  } else {
                    stackOut_161_0 = (qr) ((Object) stackIn_161_0);
                    stackIn_163_0 = stackOut_161_0;
                    stackIn_162_0 = stackOut_161_0;
                    if (!ti.field_e) {
                      break L42;
                    } else {
                      stackOut_162_0 = (qr) ((Object) stackIn_162_0);
                      stackOut_162_1 = 1;
                      stackIn_164_0 = stackOut_162_0;
                      stackIn_164_1 = stackOut_162_1;
                      break L41;
                    }
                  }
                }
              }
              stackOut_163_0 = (qr) ((Object) stackIn_163_0);
              stackOut_163_1 = 0;
              stackIn_164_0 = stackOut_163_0;
              stackIn_164_1 = stackOut_163_1;
              break L41;
            }
            L43: {
              ((qr) (Object) stackIn_164_0).a(stackIn_164_1 != 0, -20429);
              n.field_h.field_d.f(false);
              if (param0 == 23) {
                break L43;
              } else {
                stackOut_165_0 = null;
                stackIn_166_0 = stackOut_165_0;
                field_c = (String) ((Object) stackIn_166_0);
                break L43;
              }
            }
            L44: {
              if (np.field_a == null) {
                break L44;
              } else {
                L45: {
                  if (0 == i.field_g.field_rb) {
                    break L45;
                  } else {
                    tk.a(param2, np.field_a.g(-92), (byte) -2);
                    break L45;
                  }
                }
                L46: {
                  if (0 != aq.field_j.field_rb) {
                    ac.field_u = true;
                    break L46;
                  } else {
                    break L46;
                  }
                }
                L47: {
                  if (0 != go.field_I.field_rb) {
                    ti.field_e = true;
                    break L47;
                  } else {
                    break L47;
                  }
                }
                L48: {
                  if (-1 != (oo.field_c.field_rb ^ -1)) {
                    ti.field_e = false;
                    break L48;
                  } else {
                    break L48;
                  }
                }
                sc.a(63, false, np.field_a, param2);
                break L44;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var5), "uo.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_b = "Offer unrated rematch";
        field_h = new int[128];
        field_d = "Press 'ESC' to exit the game";
        field_c = "You have entered another game.";
    }
}
