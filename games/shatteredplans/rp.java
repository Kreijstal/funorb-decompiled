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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_3_0 = new vf(param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("rp.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_3_0 = e.a(param2 * param1.field_a / 96, -108, param1.field_f);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("rp.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
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
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (!super.a(param0, param1, (byte) 98, param3, param4, param5, param6)) {
              L1: {
                if (param2 > 95) {
                  break L1;
                } else {
                  rp.i(34);
                  break L1;
                }
              }
              stackIn_19_0 = 0;
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
                        stackIn_15_0 = 1;
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
            stackIn_22_0 = (RuntimeException) (var8);

            stackIn_22_1 = new StringBuilder().append("rp.TA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L5;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
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
        int stackIn_12_0 = 0;
        mj stackIn_19_0 = null;
        mj stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        mj stackIn_66_0 = null;
        mj stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        RuntimeException decompiledCaughtException = null;
        sl var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        long var3_long = 0L;
        int var3 = 0;
        mj var3_ref_mj = null;
        fb var4 = null;
        int var4_int = 0;
        int var5 = 0;
        fb var6 = null;
        mj var7 = null;
        int var8 = 0;
        mj var8_ref_mj = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        java.applet.Applet var12 = null;
        mj var14 = null;
        fb var15 = null;
        Object var16 = null;
        Object var17 = null;
        Object var18 = null;
        fb var18_ref = null;
        String var19 = null;
        String var20 = null;
        String var21 = null;
        mj var22 = null;
        Object var23 = null;
        fb var24 = null;
        mj var25 = null;
        String var26 = null;
        String var27 = null;
        mj var28 = null;
        mj var29 = null;
        Object var30 = null;
        fb var30_ref = null;
        mj var31 = null;
        fb var32 = null;
        fb var33 = null;
        mj var34 = null;
        var23 = null;
        var16 = null;
        var18 = null;
        var30 = null;
        var17 = null;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var1 = sa.field_a;
              if (param0 >= 69) {
                break L1;
              } else {
                var12 = (java.applet.Applet) null;
                rp.a(false, (String) null, (java.applet.Applet) null);
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  var2 = ((ob) ((Object) var1)).j(-119);
                  if (var2 == 0) {
                    break L4;
                  } else {
                    if (var2 == 1) {
                      break L4;
                    } else {
                      if ((var2 ^ -1) == -3) {
                        break L4;
                      } else {
                        if (-4 == (var2 ^ -1)) {
                          break L4;
                        } else {
                          if (4 == var2) {
                            break L4;
                          } else {
                            if (var2 != 5) {
                              if (var2 == 6) {
                                var3_long = ((ob) ((Object) var1)).d(29);
                                var5 = ((ob) ((Object) var1)).j(-53);
                                var31 = ta.a(-98, var3_long);
                                if (var31 != null) {
                                  L5: {
                                    if (!var31.field_Vb) {
                                      break L5;
                                    } else {
                                      ah.field_X = ah.field_X - 1;
                                      var31.field_Vb = false;
                                      break L5;
                                    }
                                  }
                                  L6: {
                                    if (var5 == 0) {
                                      var31.b((byte) -113);
                                      break L6;
                                    } else {
                                      var31.field_Eb = var5;
                                      var31.field_Gb = ks.field_i;
                                      break L6;
                                    }
                                  }
                                  var31.a(16);
                                  break L2;
                                } else {
                                  break L2;
                                }
                              } else {
                                if ((var2 ^ -1) == -8) {
                                  var34 = (mj) ((Object) gr.field_p.d(0));
                                  L7: while (true) {
                                    if (var34 == null) {
                                      ah.field_X = 0;
                                      break L2;
                                    } else {
                                      var34.b((byte) -126);
                                      var34.a(16);
                                      var34 = (mj) ((Object) gr.field_p.a((byte) -71));
                                      continue L7;
                                    }
                                  }
                                } else {
                                  if (8 == var2) {
                                    L8: {
                                      var3 = ((ob) ((Object) var1)).f(-20976);
                                      var4 = (fb) ((Object) ea.field_b.a(65280, (long)var3));
                                      if (var4 != null) {
                                        break L8;
                                      } else {
                                        var4 = new fb(em.field_k);
                                        ea.field_b.a((long)var3, var4, true);
                                        break L8;
                                      }
                                    }
                                    mi.a((byte) -89, var4, var1, true);
                                    ei.a(0, var4);
                                    break L2;
                                  } else {
                                    if (9 != var2) {
                                      if (10 != var2) {
                                        L9: {
                                          if ((var2 ^ -1) == -12) {
                                            break L9;
                                          } else {
                                            if ((var2 ^ -1) != -13) {
                                              if (-14 == (var2 ^ -1)) {
                                                var3 = ((ob) ((Object) var1)).f(-20976);
                                                var4_int = ((ob) ((Object) var1)).j(-60);
                                                var30_ref = (fb) ((Object) ea.field_b.a(65280, (long)var3));
                                                if (var30_ref != null) {
                                                  L10: {
                                                    var30_ref.field_Yb = false;
                                                    var15 = var30_ref;
                                                    var6 = var15;
                                                    var15.field_Jb = false;
                                                    if (var4_int != 0) {
                                                      var30_ref.field_hc = var4_int;
                                                      var30_ref.field_Nb = ks.field_i;
                                                      break L10;
                                                    } else {
                                                      break L10;
                                                    }
                                                  }
                                                  ei.a(0, var30_ref);
                                                  break L2;
                                                } else {
                                                  break L2;
                                                }
                                              } else {
                                                L11: {
                                                  if (var2 == 14) {
                                                    break L11;
                                                  } else {
                                                    if (var2 == 16) {
                                                      break L11;
                                                    } else {
                                                      L12: {
                                                        if (15 == var2) {
                                                          break L12;
                                                        } else {
                                                          if (-18 != (var2 ^ -1)) {
                                                            if ((var2 ^ -1) != -19) {
                                                              if (-20 != (var2 ^ -1)) {
                                                                if ((var2 ^ -1) == -21) {
                                                                  mi.a((byte) -89, np.field_a, var1, false);
                                                                  break L2;
                                                                } else {
                                                                  if (var2 != 21) {
                                                                    if (-23 == (var2 ^ -1)) {
                                                                      a.field_j = ((ob) ((Object) var1)).f(-20976);
                                                                      bh.field_h = ((ob) ((Object) var1)).c(false);
                                                                      break L2;
                                                                    } else {
                                                                      if (23 != var2) {
                                                                        jq.a(-29901, (Throwable) null, "L1: " + w.a(16738));
                                                                        q.g(-115);
                                                                        break L2;
                                                                      } else {
                                                                        ec.field_p = ((ob) ((Object) var1)).d(65);
                                                                        break L2;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    var3 = ((ob) ((Object) var1)).f(-20976);
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
                                                                L13: {
                                                                  var3_long = ((ob) ((Object) var1)).d(105);
                                                                  var5 = ((ob) ((Object) var1)).j(-120);
                                                                  var28 = ik.a(-101, var3_long);
                                                                  if (var28 == null) {
                                                                    break L13;
                                                                  } else {
                                                                    L14: {
                                                                      if (0 != var5) {
                                                                        var28.field_Gb = ks.field_i;
                                                                        var28.field_Eb = var5;
                                                                        break L14;
                                                                      } else {
                                                                        var28.b((byte) -124);
                                                                        break L14;
                                                                      }
                                                                    }
                                                                    var28.a(16);
                                                                    np.field_a.field_Lb = np.field_a.field_Lb - 1;
                                                                    break L13;
                                                                  }
                                                                }
                                                                break L2;
                                                              }
                                                            } else {
                                                              L15: {
                                                                var3_long = ((ob) ((Object) var1)).d(26);
                                                                var26 = ((ob) ((Object) var1)).e(-1);
                                                                var27 = ((ob) ((Object) var1)).e(-1);
                                                                var7 = ik.a(-121, var3_long);
                                                                if (var7 == null) {
                                                                  var7 = new mj(var26, var27, var3_long);
                                                                  qp.field_w.a(var3_long, var7, true);
                                                                  np.field_a.field_Lb = np.field_a.field_Lb + 1;
                                                                  break L15;
                                                                } else {
                                                                  break L15;
                                                                }
                                                              }
                                                              L16: {
                                                                var7.field_Qb = ((ob) ((Object) var1)).f(-20976);
                                                                var8 = ((ob) ((Object) var1)).c(false);
                                                                stackIn_66_0 = (mj) (var7);

                                                                if (-1 == (1 & var8 ^ -1)) {
                                                                  stackIn_67_0 = (mj) ((Object) stackIn_66_0);
                                                                  stackIn_67_1 = 0;
                                                                  break L16;
                                                                } else {
                                                                  stackIn_67_0 = (mj) ((Object) stackIn_66_0);
                                                                  stackIn_67_1 = 1;
                                                                  break L16;
                                                                }
                                                              }
                                                              stackIn_67_0.field_Ub = stackIn_67_1 != 0;
                                                              var7.field_Fb = var8 >> -1181202175;
                                                              var7.field_Lb = ((ob) ((Object) var1)).j(-111);
                                                              var7.field_Wb = ((ob) ((Object) var1)).j(-68);
                                                              uo.field_a.a((byte) -113, var7);
                                                              break L2;
                                                            }
                                                          } else {
                                                            break L12;
                                                          }
                                                        }
                                                      }
                                                      var3_long = ((ob) ((Object) var1)).d(127);
                                                      var5 = ((ob) ((Object) var1)).j(-119);
                                                      var14 = ta.a(126, var3_long);
                                                      var25 = var14;
                                                      if (var14 != null) {
                                                        L17: {
                                                          if (15 != var2) {
                                                            if (var25.field_Vb) {
                                                              ah.field_X = ah.field_X - 1;
                                                              var25.field_Vb = false;
                                                              break L17;
                                                            } else {
                                                              break L17;
                                                            }
                                                          } else {
                                                            var14.field_Tb = false;
                                                            break L17;
                                                          }
                                                        }
                                                        L18: {
                                                          if (0 == var5) {
                                                            break L18;
                                                          } else {
                                                            var25.field_Gb = ks.field_i;
                                                            var25.field_Eb = var5;
                                                            break L18;
                                                          }
                                                        }
                                                        f.a((byte) -60, var25);
                                                        break L2;
                                                      } else {
                                                        break L2;
                                                      }
                                                    }
                                                  }
                                                }
                                                L19: {
                                                  var3_long = ((ob) ((Object) var1)).d(127);
                                                  var29 = ta.a(121, var3_long);
                                                  if (var29 == null) {
                                                    break L19;
                                                  } else {
                                                    L20: {
                                                      if (var2 != 14) {
                                                        if (var29.field_Vb) {
                                                          break L20;
                                                        } else {
                                                          ah.field_X = ah.field_X + 1;
                                                          var29.field_Vb = true;
                                                          break L20;
                                                        }
                                                      } else {
                                                        var29.field_Tb = true;
                                                        break L20;
                                                      }
                                                    }
                                                    f.a((byte) -60, var29);
                                                    break L19;
                                                  }
                                                }
                                                break L2;
                                              }
                                            } else {
                                              break L9;
                                            }
                                          }
                                        }
                                        var3 = ((ob) ((Object) var1)).f(-20976);
                                        var18_ref = (fb) ((Object) ea.field_b.a(65280, (long)var3));
                                        var24 = var18_ref;
                                        if (var24 != null) {
                                          L21: {
                                            if ((var2 ^ -1) == -12) {
                                              var24.field_Jb = true;
                                              break L21;
                                            } else {
                                              var24.field_Yb = true;
                                              break L21;
                                            }
                                          }
                                          ei.a(0, var24);
                                          break L2;
                                        } else {
                                          break L2;
                                        }
                                      } else {
                                        var33 = (fb) ((Object) kj.field_a.d(0));
                                        L22: while (true) {
                                          if (var33 == null) {
                                            break L3;
                                          } else {
                                            var33.b((byte) -63);
                                            var33.a(16);
                                            var33 = (fb) ((Object) kj.field_a.a((byte) -71));
                                            continue L22;
                                          }
                                        }
                                      }
                                    } else {
                                      var3 = ((ob) ((Object) var1)).f(-20976);
                                      var4_int = ((ob) ((Object) var1)).j(-98);
                                      var32 = (fb) ((Object) ea.field_b.a(65280, (long)var3));
                                      if (var32 != null) {
                                        L23: {
                                          if (var4_int == 0) {
                                            var32.b((byte) -62);
                                            break L23;
                                          } else {
                                            var32.field_hc = var4_int;
                                            var32.field_Nb = ks.field_i;
                                            break L23;
                                          }
                                        }
                                        var32.a(16);
                                        break L2;
                                      } else {
                                        break L2;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              L24: {
                                var3_long = ((ob) ((Object) var1)).d(75);
                                var20 = ((ob) ((Object) var1)).e(-1);
                                var19 = ((ob) ((Object) var1)).e(-1);
                                var21 = ((ob) ((Object) var1)).e(-1);
                                var22 = ta.a(115, var3_long);
                                var8_ref_mj = var22;
                                if (var19.equals("")) {
                                  stackIn_12_0 = 0;
                                  break L24;
                                } else {
                                  stackIn_12_0 = 1;
                                  break L24;
                                }
                              }
                              L25: {
                                var9 = stackIn_12_0;
                                if (var22 != null) {
                                  if (var9 != 0) {
                                    var22.a(var21, var20, (byte) 64);
                                    break L25;
                                  } else {
                                    break L25;
                                  }
                                } else {
                                  var8_ref_mj = new mj(var20, var21, var3_long);
                                  ShatteredPlansClient.field_H.a(var3_long, var8_ref_mj, true);
                                  break L25;
                                }
                              }
                              L26: {
                                var8_ref_mj.field_zb = pr.a(14274) + -(long)((ob) ((Object) var1)).a(16711680);
                                var8_ref_mj.field_Qb = ((ob) ((Object) var1)).f(-20976);
                                var10 = ((ob) ((Object) var1)).c(false);
                                var8_ref_mj.field_Fb = var10 >> -1804493439;
                                stackIn_19_0 = (mj) (var8_ref_mj);

                                if ((1 & var10) == 0) {
                                  stackIn_20_0 = (mj) ((Object) stackIn_19_0);
                                  stackIn_20_1 = 0;
                                  break L26;
                                } else {
                                  stackIn_20_0 = (mj) ((Object) stackIn_19_0);
                                  stackIn_20_1 = 1;
                                  break L26;
                                }
                              }
                              stackIn_20_0.field_Ub = stackIn_20_1 != 0;
                              var8_ref_mj.field_Lb = ((ob) ((Object) var1)).j(-122);
                              var8_ref_mj.field_Wb = ((ob) ((Object) var1)).j(-109);
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
                L27: while (true) {
                  if (var3_ref_mj == null) {
                    var3_ref_mj = (mj) ((Object) ShatteredPlansClient.field_H.c((byte) -109));
                    L28: while (true) {
                      if (var3_ref_mj == null) {
                        L29: {
                          if (-2 != (var2 ^ -1)) {
                            break L29;
                          } else {
                            if (null == np.field_a) {
                              break L29;
                            } else {
                              la.field_h = np.field_a.field_Xb;
                              break L29;
                            }
                          }
                        }
                        L30: {
                          if (4 != var2) {
                            np.field_a = null;
                            break L30;
                          } else {
                            var3 = ((ob) ((Object) var1)).f(-20976);
                            np.field_a = new fb(em.field_k);
                            np.field_a.a(16, (long)var3);
                            mi.a((byte) -89, np.field_a, var1, false);
                            sf.field_e = 0L;
                            break L30;
                          }
                        }
                        L31: {
                          L32: {
                            if (var2 == 2) {
                              break L32;
                            } else {
                              if ((var2 ^ -1) != -4) {
                                he.field_p = null;
                                break L31;
                              } else {
                                break L32;
                              }
                            }
                          }
                          if (he.field_p != null) {
                            break L31;
                          } else {
                            he.field_p = new fb(em.field_k);
                            break L31;
                          }
                        }
                        if ((var2 ^ -1) != -4) {
                          k.field_i = false;
                          break L2;
                        } else {
                          k.field_i = true;
                          var3 = 0;
                          L33: while (true) {
                            if (var3 >= id.field_c.length) {
                              qj.field_b = ((ob) ((Object) var1)).j(-82);
                              rj.field_q = ((ob) ((Object) var1)).j(-54);
                              var3 = 0;
                              L34: while (true) {
                                if (qj.field_f.length <= var3) {
                                  break L3;
                                } else {
                                  qj.field_f[var3] = ((ob) ((Object) var1)).g(-2852);
                                  var3++;
                                  continue L34;
                                }
                              }
                            } else {
                              id.field_c[var3] = ((ob) ((Object) var1)).g(-2852);
                              var3++;
                              continue L33;
                            }
                          }
                        }
                      } else {
                        L35: {
                          L36: {
                            if (var3_ref_mj.field_Tb) {
                              break L36;
                            } else {
                              if (var3_ref_mj.field_Vb) {
                                break L36;
                              } else {
                                break L35;
                              }
                            }
                          }
                          L37: {
                            var3_ref_mj.field_Tb = false;
                            if (!var3_ref_mj.field_Vb) {
                              break L37;
                            } else {
                              ah.field_X = ah.field_X - 1;
                              var3_ref_mj.field_Vb = false;
                              break L37;
                            }
                          }
                          f.a((byte) -60, var3_ref_mj);
                          break L35;
                        }
                        var3_ref_mj = (mj) ((Object) ShatteredPlansClient.field_H.b((byte) -107));
                        continue L28;
                      }
                    }
                  } else {
                    var3_ref_mj.b((byte) -91);
                    var3_ref_mj.a(16);
                    var3_ref_mj = (mj) ((Object) uo.field_a.a((byte) -71));
                    continue L27;
                  }
                }
              }
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1_ref), "rp.A(" + param0 + ')');
        }
    }

    final static String a(boolean param0, String param1, java.applet.Applet param2) {
        try {
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            String stackIn_3_0 = null;
            String stackIn_9_0 = null;
            Object stackIn_14_0 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_18_2 = null;
            StringBuilder stackIn_20_1 = null;
            StringBuilder stackIn_21_1 = null;
            String stackIn_21_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var3_ref = null;
            RuntimeException var3_ref2 = null;
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
                                stackIn_9_0 = var4[var5].substring(var6 - -1).trim();
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
                      stackIn_3_0 = (String) null;
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
                    stackIn_14_0 = null;
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
                stackIn_17_0 = (RuntimeException) (var3_ref2);

                stackIn_17_1 = new StringBuilder().append("rp.G(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
                  stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackIn_18_2 = "null";
                  break L5;
                } else {
                  stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
                  stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackIn_18_2 = "{...}";
                  break L5;
                }
              }
              L6: {


                stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

                if (param2 == null) {
                  stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
                  stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
                  stackIn_21_2 = "null";
                  break L6;
                } else {
                  stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
                  stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
                  stackIn_21_2 = "{...}";
                  break L6;
                }
              }
              throw r.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ')');
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
