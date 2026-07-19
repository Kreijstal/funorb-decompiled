/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rp extends kg {
    int field_F;
    static pf field_K;
    int field_L;
    int field_E;
    int field_D;
    int field_M;
    static String field_J;
    static tc field_I;
    int field_H;

    final static nf i(int param0) {
        if (da.field_g == param0) {
            return null;
        }
        return wm.field_d[da.field_g + -1];
    }

    final static hb a(int param0, wb param1) {
        RuntimeException var2 = null;
        vf stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        vf stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 < -102) {
                break L1;
              } else {
                rp.h(-96);
                break L1;
              }
            }
            stackOut_2_0 = new vf(param1);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("rp.C(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return (hb) ((Object) stackIn_3_0);
    }

    final static gm a(int param0, qf param1, int param2) {
        RuntimeException var3 = null;
        gm stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        gm stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 96) {
                break L1;
              } else {
                field_J = (String) null;
                break L1;
              }
            }
            stackOut_2_0 = e.a(param2 * param1.field_a / 96, -108, param1.field_f);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("rp.D(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    public static void a(int param0) {
        field_K = null;
        field_I = null;
        field_J = null;
        if (param0 != 4) {
            field_J = (String) null;
        }
    }

    final boolean a(int param0, int param1, byte param2, int param3, int param4, int param5, vg param6) {
        nf discarded$1 = null;
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var12 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (!super.a(param0, param1, (byte) 98, param3, param4, param5, param6)) {
              L1: {
                if (param2 > 95) {
                  break L1;
                } else {
                  discarded$1 = rp.i(34);
                  break L1;
                }
              }
              stackOut_18_0 = 0;
              stackIn_19_0 = stackOut_18_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              var8_int = -this.field_m + (-param4 - (this.field_M - param1));
              var9 = param3 - (param5 + this.field_q) + -this.field_L;
              if (this.field_E * this.field_E > var8_int * var8_int + var9 * var9) {
                L2: {
                  var10 = Math.atan2((double)var9, (double)var8_int) - n.field_p;
                  if (var10 < 0.0) {
                    var10 = var10 - 3.141592653589793 / (double)this.field_F;
                    break L2;
                  } else {
                    if (0.0 < var10) {
                      var10 = var10 + 3.141592653589793 / (double)this.field_F;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                this.field_H = (int)((double)this.field_F * var10 / 6.283185307179586);
                L3: while (true) {
                  if (this.field_F > this.field_H) {
                    L4: while (true) {
                      if (0 <= this.field_H) {
                        stackOut_14_0 = 1;
                        stackIn_15_0 = stackOut_14_0;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        this.field_H = this.field_H + this.field_F;
                        continue L4;
                      }
                    }
                  } else {
                    this.field_H = this.field_H - this.field_F;
                    continue L3;
                  }
                }
              } else {
                return true;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var8);
            stackOut_20_1 = new StringBuilder().append("rp.TA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param6 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L5;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_15_0 != 0;
        } else {
          return stackIn_19_0 != 0;
        }
    }

    final static void h(int param0) {
        String discarded$1 = null;
        RuntimeException var1 = null;
        sl var1_ref = null;
        int var2 = 0;
        mj var3_ref_mj = null;
        long var3_long = 0L;
        int var3 = 0;
        fb var4 = null;
        int var4_int = 0;
        int var5 = 0;
        fb var6 = null;
        mj var7 = null;
        mj var8_ref_mj = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        java.applet.Applet var12 = null;
        mj var15 = null;
        fb var16 = null;
        Object var17 = null;
        Object var18 = null;
        Object var19 = null;
        fb var19_ref = null;
        Object var20 = null;
        fb var20_ref = null;
        String var21 = null;
        String var22 = null;
        String var23 = null;
        mj var24 = null;
        fb var25 = null;
        fb var26 = null;
        mj var27 = null;
        String var28 = null;
        String var29 = null;
        mj var30 = null;
        mj var31 = null;
        Object var32 = null;
        fb var32_ref = null;
        mj var33 = null;
        fb var34 = null;
        mj var35 = null;
        int stackIn_12_0 = 0;
        mj stackIn_18_0 = null;
        mj stackIn_19_0 = null;
        mj stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        mj stackIn_65_0 = null;
        mj stackIn_66_0 = null;
        mj stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        RuntimeException decompiledCaughtException = null;
        mj stackOut_64_0 = null;
        mj stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        mj stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        mj stackOut_17_0 = null;
        mj stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        mj stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        var19 = null;
        var17 = null;
        var20 = null;
        var32 = null;
        var18 = null;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_ref = sa.field_a;
              if (param0 >= 69) {
                break L1;
              } else {
                var12 = (java.applet.Applet) null;
                discarded$1 = rp.a(false, (String) null, (java.applet.Applet) null);
                break L1;
              }
            }
            L2: {
              L3: {
                var2 = ((ob) ((Object) var1_ref)).j(-119);
                if (var2 == 0) {
                  break L3;
                } else {
                  if (var2 == 1) {
                    break L3;
                  } else {
                    if ((var2 ^ -1) == -3) {
                      break L3;
                    } else {
                      if (-4 == (var2 ^ -1)) {
                        break L3;
                      } else {
                        if (4 == var2) {
                          break L3;
                        } else {
                          if (var2 != 5) {
                            if (var2 == 6) {
                              var3_long = ((ob) ((Object) var1_ref)).d(29);
                              var5 = ((ob) ((Object) var1_ref)).j(-53);
                              var33 = ta.a(-98, var3_long);
                              if (var33 != null) {
                                L4: {
                                  if (!var33.field_Vb) {
                                    break L4;
                                  } else {
                                    ah.field_X = ah.field_X - 1;
                                    var33.field_Vb = false;
                                    break L4;
                                  }
                                }
                                L5: {
                                  if (var5 == 0) {
                                    var33.b((byte) -113);
                                    break L5;
                                  } else {
                                    var33.field_Eb = var5;
                                    var33.field_Gb = ks.field_i;
                                    break L5;
                                  }
                                }
                                var33.a(16);
                                break L2;
                              } else {
                                break L2;
                              }
                            } else {
                              if ((var2 ^ -1) == -8) {
                                var35 = (mj) ((Object) gr.field_p.d(0));
                                L6: while (true) {
                                  if (var35 == null) {
                                    ah.field_X = 0;
                                    break L2;
                                  } else {
                                    var35.b((byte) -126);
                                    var35.a(16);
                                    var35 = (mj) ((Object) gr.field_p.a((byte) -71));
                                    continue L6;
                                  }
                                }
                              } else {
                                if (8 == var2) {
                                  L7: {
                                    var3 = ((ob) ((Object) var1_ref)).f(-20976);
                                    var4 = (fb) ((Object) ea.field_b.a(65280, (long)var3));
                                    if (var4 != null) {
                                      break L7;
                                    } else {
                                      var4 = new fb(em.field_k);
                                      ea.field_b.a((long)var3, var4, true);
                                      break L7;
                                    }
                                  }
                                  mi.a((byte) -89, var4, var1_ref, true);
                                  ei.a(0, var4);
                                  break L2;
                                } else {
                                  if (9 != var2) {
                                    if (10 != var2) {
                                      L8: {
                                        if ((var2 ^ -1) == -12) {
                                          break L8;
                                        } else {
                                          if ((var2 ^ -1) != -13) {
                                            if (-14 == (var2 ^ -1)) {
                                              var3 = ((ob) ((Object) var1_ref)).f(-20976);
                                              var4_int = ((ob) ((Object) var1_ref)).j(-60);
                                              var32_ref = (fb) ((Object) ea.field_b.a(65280, (long)var3));
                                              if (var32_ref != null) {
                                                L9: {
                                                  var32_ref.field_Yb = false;
                                                  var16 = var32_ref;
                                                  var6 = var16;
                                                  var16.field_Jb = false;
                                                  if (var4_int != 0) {
                                                    var32_ref.field_hc = var4_int;
                                                    var32_ref.field_Nb = ks.field_i;
                                                    break L9;
                                                  } else {
                                                    break L9;
                                                  }
                                                }
                                                ei.a(0, var32_ref);
                                                break L2;
                                              } else {
                                                break L2;
                                              }
                                            } else {
                                              L10: {
                                                if (var2 == 14) {
                                                  break L10;
                                                } else {
                                                  if (var2 == 16) {
                                                    break L10;
                                                  } else {
                                                    L11: {
                                                      if (15 == var2) {
                                                        break L11;
                                                      } else {
                                                        if (-18 != (var2 ^ -1)) {
                                                          if ((var2 ^ -1) != -19) {
                                                            if (-20 != (var2 ^ -1)) {
                                                              if ((var2 ^ -1) == -21) {
                                                                mi.a((byte) -89, np.field_a, var1_ref, false);
                                                                break L2;
                                                              } else {
                                                                if (var2 != 21) {
                                                                  if (-23 == (var2 ^ -1)) {
                                                                    a.field_j = ((ob) ((Object) var1_ref)).f(-20976);
                                                                    bh.field_h = ((ob) ((Object) var1_ref)).c(false);
                                                                    break L2;
                                                                  } else {
                                                                    if (23 != var2) {
                                                                      jq.a(-29901, (Throwable) null, "L1: " + w.a(16738));
                                                                      q.g(-115);
                                                                      break L2;
                                                                    } else {
                                                                      ec.field_p = ((ob) ((Object) var1_ref)).d(65);
                                                                      break L2;
                                                                    }
                                                                  }
                                                                } else {
                                                                  var3 = ((ob) ((Object) var1_ref)).f(-20976);
                                                                  if (-1 != (var3 ^ -1)) {
                                                                    sf.field_e = pr.a(14274) + (long)var3;
                                                                    break L2;
                                                                  } else {
                                                                    sf.field_e = 0L;
                                                                    break L2;
                                                                  }
                                                                }
                                                              }
                                                            } else {
                                                              var3_long = ((ob) ((Object) var1_ref)).d(105);
                                                              var5 = ((ob) ((Object) var1_ref)).j(-120);
                                                              var30 = ik.a(-101, var3_long);
                                                              if (var30 == null) {
                                                                break L2;
                                                              } else {
                                                                L12: {
                                                                  if (0 != var5) {
                                                                    var30.field_Gb = ks.field_i;
                                                                    var30.field_Eb = var5;
                                                                    break L12;
                                                                  } else {
                                                                    var30.b((byte) -124);
                                                                    break L12;
                                                                  }
                                                                }
                                                                var30.a(16);
                                                                np.field_a.field_Lb = np.field_a.field_Lb - 1;
                                                                break L2;
                                                              }
                                                            }
                                                          } else {
                                                            L13: {
                                                              var3_long = ((ob) ((Object) var1_ref)).d(26);
                                                              var28 = ((ob) ((Object) var1_ref)).e(-1);
                                                              var29 = ((ob) ((Object) var1_ref)).e(-1);
                                                              var7 = ik.a(-121, var3_long);
                                                              if (var7 == null) {
                                                                var7 = new mj(var28, var29, var3_long);
                                                                qp.field_w.a(var3_long, var7, true);
                                                                np.field_a.field_Lb = np.field_a.field_Lb + 1;
                                                                break L13;
                                                              } else {
                                                                break L13;
                                                              }
                                                            }
                                                            L14: {
                                                              var7.field_Qb = ((ob) ((Object) var1_ref)).f(-20976);
                                                              var8 = ((ob) ((Object) var1_ref)).c(false);
                                                              stackOut_64_0 = (mj) (var7);
                                                              stackIn_66_0 = stackOut_64_0;
                                                              stackIn_65_0 = stackOut_64_0;
                                                              if (-1 == (1 & var8 ^ -1)) {
                                                                stackOut_66_0 = (mj) ((Object) stackIn_66_0);
                                                                stackOut_66_1 = 0;
                                                                stackIn_67_0 = stackOut_66_0;
                                                                stackIn_67_1 = stackOut_66_1;
                                                                break L14;
                                                              } else {
                                                                stackOut_65_0 = (mj) ((Object) stackIn_65_0);
                                                                stackOut_65_1 = 1;
                                                                stackIn_67_0 = stackOut_65_0;
                                                                stackIn_67_1 = stackOut_65_1;
                                                                break L14;
                                                              }
                                                            }
                                                            stackIn_67_0.field_Ub = stackIn_67_1 != 0;
                                                            var7.field_Fb = var8 >> -1181202175;
                                                            var7.field_Lb = ((ob) ((Object) var1_ref)).j(-111);
                                                            var7.field_Wb = ((ob) ((Object) var1_ref)).j(-68);
                                                            uo.field_a.a((byte) -113, var7);
                                                            break L2;
                                                          }
                                                        } else {
                                                          break L11;
                                                        }
                                                      }
                                                    }
                                                    var3_long = ((ob) ((Object) var1_ref)).d(127);
                                                    var5 = ((ob) ((Object) var1_ref)).j(-119);
                                                    var15 = ta.a(126, var3_long);
                                                    var27 = var15;
                                                    if (var15 != null) {
                                                      L15: {
                                                        if (15 != var2) {
                                                          if (var27.field_Vb) {
                                                            ah.field_X = ah.field_X - 1;
                                                            var27.field_Vb = false;
                                                            break L15;
                                                          } else {
                                                            break L15;
                                                          }
                                                        } else {
                                                          var15.field_Tb = false;
                                                          break L15;
                                                        }
                                                      }
                                                      L16: {
                                                        if (0 == var5) {
                                                          break L16;
                                                        } else {
                                                          var27.field_Gb = ks.field_i;
                                                          var27.field_Eb = var5;
                                                          break L16;
                                                        }
                                                      }
                                                      f.a((byte) -60, var27);
                                                      break L2;
                                                    } else {
                                                      break L2;
                                                    }
                                                  }
                                                }
                                              }
                                              var3_long = ((ob) ((Object) var1_ref)).d(127);
                                              var31 = ta.a(121, var3_long);
                                              if (var31 == null) {
                                                break L2;
                                              } else {
                                                L17: {
                                                  if (var2 != 14) {
                                                    if (var31.field_Vb) {
                                                      break L17;
                                                    } else {
                                                      ah.field_X = ah.field_X + 1;
                                                      var31.field_Vb = true;
                                                      break L17;
                                                    }
                                                  } else {
                                                    var31.field_Tb = true;
                                                    break L17;
                                                  }
                                                }
                                                f.a((byte) -60, var31);
                                                break L2;
                                              }
                                            }
                                          } else {
                                            break L8;
                                          }
                                        }
                                      }
                                      var3 = ((ob) ((Object) var1_ref)).f(-20976);
                                      var20_ref = (fb) ((Object) ea.field_b.a(65280, (long)var3));
                                      var26 = var20_ref;
                                      if (var26 != null) {
                                        L18: {
                                          if ((var2 ^ -1) == -12) {
                                            var26.field_Jb = true;
                                            break L18;
                                          } else {
                                            var26.field_Yb = true;
                                            break L18;
                                          }
                                        }
                                        ei.a(0, var26);
                                        break L2;
                                      } else {
                                        break L2;
                                      }
                                    } else {
                                      var34 = (fb) ((Object) kj.field_a.d(0));
                                      L19: while (true) {
                                        if (var34 == null) {
                                          break L2;
                                        } else {
                                          var34.b((byte) -63);
                                          var34.a(16);
                                          var34 = (fb) ((Object) kj.field_a.a((byte) -71));
                                          continue L19;
                                        }
                                      }
                                    }
                                  } else {
                                    var3 = ((ob) ((Object) var1_ref)).f(-20976);
                                    var4_int = ((ob) ((Object) var1_ref)).j(-98);
                                    var19_ref = (fb) ((Object) ea.field_b.a(65280, (long)var3));
                                    var25 = var19_ref;
                                    if (var25 != null) {
                                      L20: {
                                        if (var4_int == 0) {
                                          var25.b((byte) -62);
                                          break L20;
                                        } else {
                                          var25.field_hc = var4_int;
                                          var25.field_Nb = ks.field_i;
                                          break L20;
                                        }
                                      }
                                      var25.a(16);
                                      break L2;
                                    } else {
                                      break L2;
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            L21: {
                              var3_long = ((ob) ((Object) var1_ref)).d(75);
                              var22 = ((ob) ((Object) var1_ref)).e(-1);
                              var21 = ((ob) ((Object) var1_ref)).e(-1);
                              var23 = ((ob) ((Object) var1_ref)).e(-1);
                              var24 = ta.a(115, var3_long);
                              var8_ref_mj = var24;
                              if (var21.equals("")) {
                                stackOut_11_0 = 0;
                                stackIn_12_0 = stackOut_11_0;
                                break L21;
                              } else {
                                stackOut_10_0 = 1;
                                stackIn_12_0 = stackOut_10_0;
                                break L21;
                              }
                            }
                            L22: {
                              var9 = stackIn_12_0;
                              if (var24 != null) {
                                if (var9 != 0) {
                                  var24.a(var23, var22, (byte) 64);
                                  break L22;
                                } else {
                                  break L22;
                                }
                              } else {
                                var8_ref_mj = new mj(var22, var23, var3_long);
                                ShatteredPlansClient.field_H.a(var3_long, var8_ref_mj, true);
                                break L22;
                              }
                            }
                            L23: {
                              var8_ref_mj.field_zb = pr.a(14274) + -(long)((ob) ((Object) var1_ref)).a(16711680);
                              var8_ref_mj.field_Qb = ((ob) ((Object) var1_ref)).f(-20976);
                              var10 = ((ob) ((Object) var1_ref)).c(false);
                              var8_ref_mj.field_Fb = var10 >> -1804493439;
                              stackOut_17_0 = (mj) (var8_ref_mj);
                              stackIn_19_0 = stackOut_17_0;
                              stackIn_18_0 = stackOut_17_0;
                              if ((1 & var10) == 0) {
                                stackOut_19_0 = (mj) ((Object) stackIn_19_0);
                                stackOut_19_1 = 0;
                                stackIn_20_0 = stackOut_19_0;
                                stackIn_20_1 = stackOut_19_1;
                                break L23;
                              } else {
                                stackOut_18_0 = (mj) ((Object) stackIn_18_0);
                                stackOut_18_1 = 1;
                                stackIn_20_0 = stackOut_18_0;
                                stackIn_20_1 = stackOut_18_1;
                                break L23;
                              }
                            }
                            stackIn_20_0.field_Ub = stackIn_20_1 != 0;
                            var8_ref_mj.field_Lb = ((ob) ((Object) var1_ref)).j(-122);
                            var8_ref_mj.field_Wb = ((ob) ((Object) var1_ref)).j(-109);
                            f.a((byte) -60, var8_ref_mj);
                            break L2;
                          }
                        }
                      }
                    }
                  }
                }
              }
              var3_ref_mj = (mj) ((Object) uo.field_a.d(0));
              L24: while (true) {
                if (var3_ref_mj == null) {
                  var3_ref_mj = (mj) ((Object) ShatteredPlansClient.field_H.c((byte) -109));
                  L25: while (true) {
                    if (var3_ref_mj == null) {
                      L26: {
                        if (-2 != (var2 ^ -1)) {
                          break L26;
                        } else {
                          if (null == np.field_a) {
                            break L26;
                          } else {
                            la.field_h = np.field_a.field_Xb;
                            break L26;
                          }
                        }
                      }
                      L27: {
                        if (4 != var2) {
                          np.field_a = null;
                          break L27;
                        } else {
                          var3 = ((ob) ((Object) var1_ref)).f(-20976);
                          np.field_a = new fb(em.field_k);
                          np.field_a.a(16, (long)var3);
                          mi.a((byte) -89, np.field_a, var1_ref, false);
                          sf.field_e = 0L;
                          break L27;
                        }
                      }
                      L28: {
                        L29: {
                          if (var2 == 2) {
                            break L29;
                          } else {
                            if ((var2 ^ -1) != -4) {
                              he.field_p = null;
                              break L28;
                            } else {
                              break L29;
                            }
                          }
                        }
                        if (he.field_p != null) {
                          break L28;
                        } else {
                          he.field_p = new fb(em.field_k);
                          break L28;
                        }
                      }
                      if ((var2 ^ -1) != -4) {
                        k.field_i = false;
                        break L2;
                      } else {
                        k.field_i = true;
                        var3 = 0;
                        L30: while (true) {
                          if (var3 >= id.field_c.length) {
                            qj.field_b = ((ob) ((Object) var1_ref)).j(-82);
                            rj.field_q = ((ob) ((Object) var1_ref)).j(-54);
                            var3 = 0;
                            L31: while (true) {
                              if (qj.field_f.length <= var3) {
                                break L2;
                              } else {
                                qj.field_f[var3] = ((ob) ((Object) var1_ref)).g(-2852);
                                var3++;
                                continue L31;
                              }
                            }
                          } else {
                            id.field_c[var3] = ((ob) ((Object) var1_ref)).g(-2852);
                            var3++;
                            continue L30;
                          }
                        }
                      }
                    } else {
                      L32: {
                        L33: {
                          if (var3_ref_mj.field_Tb) {
                            break L33;
                          } else {
                            if (var3_ref_mj.field_Vb) {
                              break L33;
                            } else {
                              break L32;
                            }
                          }
                        }
                        L34: {
                          var3_ref_mj.field_Tb = false;
                          if (!var3_ref_mj.field_Vb) {
                            break L34;
                          } else {
                            ah.field_X = ah.field_X - 1;
                            var3_ref_mj.field_Vb = false;
                            break L34;
                          }
                        }
                        f.a((byte) -60, var3_ref_mj);
                        break L32;
                      }
                      var3_ref_mj = (mj) ((Object) ShatteredPlansClient.field_H.b((byte) -107));
                      continue L25;
                    }
                  }
                } else {
                  var3_ref_mj.b((byte) -91);
                  var3_ref_mj.a(16);
                  var3_ref_mj = (mj) ((Object) uo.field_a.a((byte) -71));
                  continue L24;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1), "rp.A(" + param0 + ')');
        }
    }

    final static String a(boolean param0, String param1, java.applet.Applet param2) {
        try {
            String var3 = null;
            Throwable var3_ref = null;
            RuntimeException var3_ref2 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            String stackIn_3_0 = null;
            String stackIn_9_0 = null;
            Object stackIn_14_0 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_18_2 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            String stackIn_21_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            String stackOut_8_0 = null;
            String stackOut_2_0 = null;
            Object stackOut_13_0 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            RuntimeException stackOut_20_0 = null;
            StringBuilder stackOut_20_1 = null;
            String stackOut_20_2 = null;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            String stackOut_19_2 = null;
            var7 = ShatteredPlansClient.field_F ? 1 : 0;
            try {
              L0: {
                try {
                  L1: {
                    var3 = (String) (ll.a("getcookies", param2, (byte) 70));
                    var4 = so.a(var3, ';', -116);
                    var5 = 0;
                    if (!param0) {
                      L2: while (true) {
                        if (var5 >= var4.length) {
                          decompiledRegionSelector0 = 1;
                          break L1;
                        } else {
                          L3: {
                            var6 = var4[var5].indexOf('=');
                            if (-1 < (var6 ^ -1)) {
                              break L3;
                            } else {
                              if (var4[var5].substring(0, var6).trim().equals(param1)) {
                                stackOut_8_0 = var4[var5].substring(var6 - -1).trim();
                                stackIn_9_0 = stackOut_8_0;
                                decompiledRegionSelector0 = 2;
                                break L1;
                              } else {
                                break L3;
                              }
                            }
                          }
                          var5++;
                          continue L2;
                        }
                      }
                    } else {
                      stackOut_2_0 = (String) null;
                      stackIn_3_0 = stackOut_2_0;
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var3_ref = decompiledCaughtException;
                    decompiledRegionSelector0 = 1;
                    break L4;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  decompiledRegionSelector1 = 1;
                  break L0;
                } else {
                  if (decompiledRegionSelector0 == 1) {
                    stackOut_13_0 = null;
                    stackIn_14_0 = stackOut_13_0;
                    decompiledRegionSelector1 = 0;
                    break L0;
                  } else {
                    decompiledRegionSelector1 = 2;
                    break L0;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_15_0 = (RuntimeException) (var3_ref2);
                stackOut_15_1 = new StringBuilder().append("rp.G(").append(param0).append(',');
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                if (param1 == null) {
                  stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
                  stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackOut_17_2 = "null";
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  stackIn_18_2 = stackOut_17_2;
                  break L5;
                } else {
                  stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackOut_16_2 = "{...}";
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_18_2 = stackOut_16_2;
                  break L5;
                }
              }
              L6: {
                stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
                stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
                stackIn_20_0 = stackOut_18_0;
                stackIn_20_1 = stackOut_18_1;
                stackIn_19_0 = stackOut_18_0;
                stackIn_19_1 = stackOut_18_1;
                if (param2 == null) {
                  stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
                  stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
                  stackOut_20_2 = "null";
                  stackIn_21_0 = stackOut_20_0;
                  stackIn_21_1 = stackOut_20_1;
                  stackIn_21_2 = stackOut_20_2;
                  break L6;
                } else {
                  stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
                  stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackOut_19_2 = "{...}";
                  stackIn_21_0 = stackOut_19_0;
                  stackIn_21_1 = stackOut_19_1;
                  stackIn_21_2 = stackOut_19_2;
                  break L6;
                }
              }
              throw r.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return (String) ((Object) stackIn_14_0);
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_3_0;
              } else {
                return stackIn_9_0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private rp() throws Throwable {
        throw new Error();
    }

    static {
        field_J = "Total excess research";
    }
}
