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

    final static int a() {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_4_0 = 0;
        var2 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            boolean discarded$4 = le.field_e.a(kd.field_a, true, oo.field_e, (byte) 0);
            le.field_e.i(120);
            stackOut_3_0 = 55;
            stackIn_5_0 = stackOut_3_0;
            L1: while (true) {
              if (!cc.e()) {
                if (cr.field_b != -1) {
                  var1_int = cr.field_b;
                  qj.a((byte) -127, -1);
                  stackOut_10_0 = var1_int;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                } else {
                  if (!mg.field_C) {
                    if (fj.field_s != ue.field_a) {
                      if (!wh.field_a.b(14)) {
                        stackOut_20_0 = 1;
                        stackIn_21_0 = stackOut_20_0;
                        return stackIn_21_0;
                      } else {
                        if (ee.field_l != ue.field_a) {
                          stackOut_25_0 = -1;
                          stackIn_26_0 = stackOut_25_0;
                          break L0;
                        } else {
                          stackOut_23_0 = 2;
                          stackIn_24_0 = stackOut_23_0;
                          return stackIn_24_0;
                        }
                      }
                    } else {
                      stackOut_16_0 = 1;
                      stackIn_17_0 = stackOut_16_0;
                      return stackIn_17_0;
                    }
                  } else {
                    stackOut_13_0 = 3;
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0;
                  }
                }
              } else {
                boolean discarded$5 = le.field_e.a(oq.field_j, ho.field_h, true);
                stackOut_4_0 = 55;
                stackIn_5_0 = stackOut_4_0;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var1, "uo.A(" + -75 + ')');
        }
        return stackIn_26_0;
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
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var3_int = 16711935 & param2;
            param2 = param2 & 65280;
            var4 = -1;
            var5 = -param1.field_w;
            L1: while (true) {
              if (var5 >= 0) {
                break L0;
              } else {
                var6 = -param1.field_z;
                L2: while (true) {
                  if (var6 >= 0) {
                    var5++;
                    continue L1;
                  } else {
                    L3: {
                      var4++;
                      var7 = param1.field_B[var4];
                      if (var7 != 0) {
                        L4: {
                          var8 = ((var7 & 16711680) >> 16) + (var7 & 255) + ((65280 & var7) >> 7) >> 2;
                          var7 = (param2 * var8 & 16711680 | var8 * var3_int & -16711936) >>> 8;
                          if (0 != var7) {
                            break L4;
                          } else {
                            var7 = 1;
                            break L4;
                          }
                        }
                        param1.field_B[var4] = var7;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var6++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("uo.D(").append(110).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw r.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param2 + ')');
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
        int[] var24 = null;
        qr var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        qr stackIn_18_0 = null;
        qr stackIn_19_0 = null;
        qr stackIn_20_0 = null;
        qr stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_40_0 = 0;
        qr stackIn_145_0 = null;
        qr stackIn_146_0 = null;
        qr stackIn_147_0 = null;
        qr stackIn_148_0 = null;
        qr stackIn_149_0 = null;
        int stackIn_149_1 = 0;
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
        RuntimeException decompiledCaughtException = null;
        qr stackOut_17_0 = null;
        qr stackOut_18_0 = null;
        qr stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        qr stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_39_0 = 0;
        int stackOut_38_0 = 0;
        qr stackOut_144_0 = null;
        qr stackOut_145_0 = null;
        qr stackOut_146_0 = null;
        qr stackOut_147_0 = null;
        int stackOut_147_1 = 0;
        qr stackOut_148_0 = null;
        int stackOut_148_1 = 0;
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
                    tj.field_f.field_z = re.a(he.field_q, 4371, new String[1]).toUpperCase();
                    dn.field_f.a(pf.field_g.field_K, 40, (byte) 56, pf.field_g.field_mb + -40, 0);
                    dn.field_f.field_z = re.a(gq.field_a, 4371, new String[1]);
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
                            var10_ref_String = re.a(jg.field_e, 4371, new String[1]);
                            break L5;
                          } else {
                            var10_ref_String = ui.field_k;
                            break L5;
                          }
                        }
                        L6: {
                          if ((16 & ln.field_w) != 0) {
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
                          stackOut_18_0 = (qr) (Object) stackIn_18_0;
                          stackIn_20_0 = stackOut_18_0;
                          stackIn_19_0 = stackOut_18_0;
                          if (sf.field_e != 0L) {
                            break L8;
                          } else {
                            stackOut_19_0 = (qr) (Object) stackIn_19_0;
                            stackOut_19_1 = 1;
                            stackIn_21_0 = stackOut_19_0;
                            stackIn_21_1 = stackOut_19_1;
                            break L7;
                          }
                        }
                      }
                      stackOut_20_0 = (qr) (Object) stackIn_20_0;
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
                                if (var10 >= 2) {
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
                                      var27 = pe.field_D[var12];
                                      var26 = var27;
                                      var24 = var26;
                                      var22 = var24;
                                      var13_array = var22;
                                      var14_int = 0;
                                      L15: while (true) {
                                        L16: {
                                          if (var14_int >= var27.length) {
                                            var11_int = 1;
                                            var14_int = -1;
                                            var15 = 0;
                                            L17: while (true) {
                                              if (var27.length <= var15) {
                                                ek.field_F[var14_int] = true;
                                                break L16;
                                              } else {
                                                L18: {
                                                  var16 = var27[var15];
                                                  if (var16 <= var14_int) {
                                                    break L18;
                                                  } else {
                                                    break L18;
                                                  }
                                                }
                                                var15 += 2;
                                                continue L17;
                                              }
                                            }
                                          } else {
                                            var15 = var27[var14_int];
                                            var16 = var13_array[var14_int + 1];
                                            if (var15 != -1) {
                                              L19: {
                                                if ((255 & np.field_a.field_dc[var15]) != var16) {
                                                  break L19;
                                                } else {
                                                  break L19;
                                                }
                                              }
                                              var12++;
                                              continue L14;
                                            } else {
                                              L20: {
                                                if (var10 == 0) {
                                                  stackOut_39_0 = np.field_a.field_Eb;
                                                  stackIn_40_0 = stackOut_39_0;
                                                  break L20;
                                                } else {
                                                  stackOut_38_0 = np.field_a.field_Lb;
                                                  stackIn_40_0 = stackOut_38_0;
                                                  break L20;
                                                }
                                              }
                                              var17_int = stackIn_40_0;
                                              if (var16 == var17_int) {
                                                var14_int += 2;
                                                continue L15;
                                              } else {
                                                break L16;
                                              }
                                            }
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
                    if (var10 < 2) {
                      aq.field_j.field_s = false;
                      if (!aq.field_j.field_v) {
                        break L2;
                      } else {
                        var11 = null;
                        var12 = 0;
                        var13_int = 0;
                        L21: while (true) {
                          if (em.field_k <= var13_int) {
                            L22: {
                              if (var10 != 0) {
                                var13 = md.field_I;
                                if (var12 == 0) {
                                  var14 = re.a(r.field_f, 4371, new String[1]);
                                  break L22;
                                } else {
                                  var14 = mi.field_b + (String) var11;
                                  break L22;
                                }
                              } else {
                                var13 = up.field_e;
                                if (var12 != 0) {
                                  var14 = br.field_l + (String) var11;
                                  break L22;
                                } else {
                                  var14 = re.a(js.field_h, 4371, new String[1]);
                                  break L22;
                                }
                              }
                            }
                            dn.field_k = "<col=A00000>" + var13 + "<br>" + var14;
                            break L2;
                          } else {
                            L23: {
                              if (!ek.field_F[var13_int]) {
                                break L23;
                              } else {
                                break L23;
                              }
                            }
                            var13_int++;
                            continue L21;
                          }
                        }
                      }
                    } else {
                      L24: {
                        if (null != td.field_E) {
                          break L24;
                        } else {
                          if (null != ci.field_h) {
                            break L24;
                          } else {
                            if (null != pg.field_A) {
                              break L24;
                            } else {
                              if (null != ji.field_D) {
                                break L24;
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
                      L25: while (true) {
                        if (em.field_k <= var16) {
                          var16 = 0;
                          var17 = ro.field_a.field_xb.field_M;
                          var18_ref = (mj) (Object) var17.d(0);
                          L26: while (true) {
                            L27: {
                              if (var18_ref == null) {
                                break L27;
                              } else {
                                L28: {
                                  if (!var18_ref.h(-80)) {
                                    L29: {
                                      if (var11_int == 0) {
                                        break L29;
                                      } else {
                                        if (!var18_ref.field_Ub) {
                                          var16 = 1;
                                          break L27;
                                        } else {
                                          break L29;
                                        }
                                      }
                                    }
                                    if (var18_ref.field_Qb >= var13_int) {
                                      if (var14_int <= var18_ref.field_Fb) {
                                        if (-1 >= (var15 & var18_ref.field_Wb)) {
                                          if (var12 != 0) {
                                            var16 = 1;
                                            break L27;
                                          } else {
                                            break L28;
                                          }
                                        } else {
                                          var16 = 1;
                                          break L27;
                                        }
                                      } else {
                                        var16 = 1;
                                        break L27;
                                      }
                                    } else {
                                      var16 = 1;
                                      break L27;
                                    }
                                  } else {
                                    break L28;
                                  }
                                }
                                var18_ref = (mj) (Object) var17.a((byte) -71);
                                continue L26;
                              }
                            }
                            L30: {
                              if (2 > bs.field_b) {
                                break L30;
                              } else {
                                if (!di.field_p[12]) {
                                  break L30;
                                } else {
                                  var16 = 0;
                                  break L30;
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
                                if (n.field_h.field_d.field_zb == 0) {
                                  dn.field_k = on.field_a;
                                  break L2;
                                } else {
                                  dn.field_k = re.a(jr.field_l, 4371, new String[1]);
                                  break L2;
                                }
                              }
                            }
                          }
                        } else {
                          L31: {
                            var17_int = 255 & np.field_a.field_dc[var16];
                            if (null == td.field_E) {
                              break L31;
                            } else {
                              if (td.field_E[var16] != null) {
                                if (td.field_E[var16][var17_int]) {
                                  var11_int = 1;
                                  break L31;
                                } else {
                                  break L31;
                                }
                              } else {
                                break L31;
                              }
                            }
                          }
                          L32: {
                            if (null == ci.field_h) {
                              break L32;
                            } else {
                              if (ci.field_h[var16] == null) {
                                break L32;
                              } else {
                                L33: {
                                  var18_int = ci.field_h[var16][var17_int];
                                  if (var18_int == 0) {
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
                                if (var18_int <= var13_int) {
                                  break L32;
                                } else {
                                  var13_int = var18_int;
                                  break L32;
                                }
                              }
                            }
                          }
                          L34: {
                            if (pg.field_A == null) {
                              break L34;
                            } else {
                              if (null == pg.field_A[var16]) {
                                break L34;
                              } else {
                                L35: {
                                  var18_int = pg.field_A[var16][var17_int];
                                  if (var14_int < var18_int) {
                                    var14_int = var18_int;
                                    break L35;
                                  } else {
                                    break L35;
                                  }
                                }
                                if (var18_int == 0) {
                                  break L34;
                                } else {
                                  if (hm.field_o) {
                                    break L34;
                                  } else {
                                    var11_int = 1;
                                    break L34;
                                  }
                                }
                              }
                            }
                          }
                          L36: {
                            if (null == ji.field_D) {
                              break L36;
                            } else {
                              break L36;
                            }
                          }
                          var16++;
                          continue L25;
                        }
                      }
                    }
                  }
                }
                L37: {
                  if (sf.field_e == 0L) {
                    break L37;
                  } else {
                    L38: {
                      var9 = (int)(sf.field_e - pr.a(14274));
                      var9 = (var9 + 999) / 1000;
                      if (var9 >= 1) {
                        break L38;
                      } else {
                        var9 = 1;
                        break L38;
                      }
                    }
                    var8.field_z = re.a(oe.field_b, 4371, new String[1]);
                    break L37;
                  }
                }
                ac.field_x.field_z = re.a(eg.field_r, 4371, new String[2]);
                break L1;
              } else {
                break L1;
              }
            }
            L39: {
              L40: {
                stackOut_144_0 = am.field_xb;
                stackIn_148_0 = stackOut_144_0;
                stackIn_145_0 = stackOut_144_0;
                if (!param1) {
                  break L40;
                } else {
                  stackOut_145_0 = (qr) (Object) stackIn_145_0;
                  stackIn_148_0 = stackOut_145_0;
                  stackIn_146_0 = stackOut_145_0;
                  if (param4) {
                    break L40;
                  } else {
                    stackOut_146_0 = (qr) (Object) stackIn_146_0;
                    stackIn_148_0 = stackOut_146_0;
                    stackIn_147_0 = stackOut_146_0;
                    if (ti.field_e) {
                      break L40;
                    } else {
                      stackOut_147_0 = (qr) (Object) stackIn_147_0;
                      stackOut_147_1 = 1;
                      stackIn_149_0 = stackOut_147_0;
                      stackIn_149_1 = stackOut_147_1;
                      break L39;
                    }
                  }
                }
              }
              stackOut_148_0 = (qr) (Object) stackIn_148_0;
              stackOut_148_1 = 0;
              stackIn_149_0 = stackOut_148_0;
              stackIn_149_1 = stackOut_148_1;
              break L39;
            }
            L41: {
              L42: {
                ((qr) (Object) stackIn_149_0).a(stackIn_149_1 != 0, -20429);
                stackOut_149_0 = pf.field_g;
                stackIn_153_0 = stackOut_149_0;
                stackIn_150_0 = stackOut_149_0;
                if (!param1) {
                  break L42;
                } else {
                  stackOut_150_0 = (qr) (Object) stackIn_150_0;
                  stackIn_153_0 = stackOut_150_0;
                  stackIn_151_0 = stackOut_150_0;
                  if (param4) {
                    break L42;
                  } else {
                    stackOut_151_0 = (qr) (Object) stackIn_151_0;
                    stackIn_153_0 = stackOut_151_0;
                    stackIn_152_0 = stackOut_151_0;
                    if (ti.field_e) {
                      break L42;
                    } else {
                      stackOut_152_0 = (qr) (Object) stackIn_152_0;
                      stackOut_152_1 = 1;
                      stackIn_154_0 = stackOut_152_0;
                      stackIn_154_1 = stackOut_152_1;
                      break L41;
                    }
                  }
                }
              }
              stackOut_153_0 = (qr) (Object) stackIn_153_0;
              stackOut_153_1 = 0;
              stackIn_154_0 = stackOut_153_0;
              stackIn_154_1 = stackOut_153_1;
              break L41;
            }
            L43: {
              L44: {
                ((qr) (Object) stackIn_154_0).a(stackIn_154_1 != 0, -20429);
                stackOut_154_0 = ed.field_d;
                stackIn_158_0 = stackOut_154_0;
                stackIn_155_0 = stackOut_154_0;
                if (!param1) {
                  break L44;
                } else {
                  stackOut_155_0 = (qr) (Object) stackIn_155_0;
                  stackIn_158_0 = stackOut_155_0;
                  stackIn_156_0 = stackOut_155_0;
                  if (param4) {
                    break L44;
                  } else {
                    stackOut_156_0 = (qr) (Object) stackIn_156_0;
                    stackIn_158_0 = stackOut_156_0;
                    stackIn_157_0 = stackOut_156_0;
                    if (!ti.field_e) {
                      break L44;
                    } else {
                      stackOut_157_0 = (qr) (Object) stackIn_157_0;
                      stackOut_157_1 = 1;
                      stackIn_159_0 = stackOut_157_0;
                      stackIn_159_1 = stackOut_157_1;
                      break L43;
                    }
                  }
                }
              }
              stackOut_158_0 = (qr) (Object) stackIn_158_0;
              stackOut_158_1 = 0;
              stackIn_159_0 = stackOut_158_0;
              stackIn_159_1 = stackOut_158_1;
              break L43;
            }
            ((qr) (Object) stackIn_159_0).a(stackIn_159_1 != 0, -20429);
            n.field_h.field_d.f(false);
            L45: {
              if (np.field_a == null) {
                break L45;
              } else {
                L46: {
                  if (0 == i.field_g.field_rb) {
                    break L46;
                  } else {
                    tk.a(param2, np.field_a.g(-92), (byte) -2);
                    break L46;
                  }
                }
                L47: {
                  if (0 != aq.field_j.field_rb) {
                    ac.field_u = true;
                    break L47;
                  } else {
                    break L47;
                  }
                }
                L48: {
                  if (0 != go.field_I.field_rb) {
                    ti.field_e = true;
                    break L48;
                  } else {
                    break L48;
                  }
                }
                L49: {
                  if (oo.field_c.field_rb != 0) {
                    ti.field_e = false;
                    break L49;
                  } else {
                    break L49;
                  }
                }
                sc.a(63, false, np.field_a, param2);
                break L45;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var5, "uo.B(" + 23 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
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
