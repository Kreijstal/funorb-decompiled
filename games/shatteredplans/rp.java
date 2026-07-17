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
        if (da.field_g == 34) {
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
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("rp.C(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw r.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return (hb) (Object) stackIn_3_0;
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
                field_J = null;
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
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("rp.D(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw r.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param2 + 41);
        }
        return stackIn_3_0;
    }

    public static void a(int param0) {
        field_K = null;
        field_I = null;
        field_J = null;
        if (param0 != 4) {
            field_J = null;
        }
    }

    final boolean a(int param0, int param1, byte param2, int param3, int param4, int param5, vg param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var12 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (!super.a(param0, param1, (byte) 98, param3, param4, param5, param6)) {
              L1: {
                if (param2 > 95) {
                  break L1;
                } else {
                  nf discarded$1 = rp.i(34);
                  break L1;
                }
              }
              stackOut_20_0 = 0;
              stackIn_21_0 = stackOut_20_0;
              break L0;
            } else {
              var8_int = -((rp) this).field_m + (-param4 - (((rp) this).field_M - param1));
              var9 = param3 - (param5 + ((rp) this).field_q) + -((rp) this).field_L;
              if (((rp) this).field_E * ((rp) this).field_E > var8_int * var8_int + var9 * var9) {
                L2: {
                  L3: {
                    var10 = Math.atan2((double)var9, (double)var8_int) - n.field_p;
                    if (var10 < 0.0) {
                      break L3;
                    } else {
                      if (0.0 < var10) {
                        var10 = var10 + 3.141592653589793 / (double)((rp) this).field_F;
                        if (var12 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      } else {
                        break L2;
                      }
                    }
                  }
                  var10 = var10 - 3.141592653589793 / (double)((rp) this).field_F;
                  break L2;
                }
                ((rp) this).field_H = (int)((double)((rp) this).field_F * var10 / 6.283185307179586);
                L4: while (true) {
                  L5: {
                    L6: {
                      if (((rp) this).field_F > ((rp) this).field_H) {
                        break L6;
                      } else {
                        ((rp) this).field_H = ((rp) this).field_H - ((rp) this).field_F;
                        if (var12 != 0) {
                          break L5;
                        } else {
                          if (var12 == 0) {
                            continue L4;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    L7: while (true) {
                      if (0 <= ((rp) this).field_H) {
                        break L5;
                      } else {
                        ((rp) this).field_H = ((rp) this).field_H + ((rp) this).field_F;
                        if (var12 == 0) {
                          continue L7;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  stackOut_16_0 = 1;
                  stackIn_17_0 = stackOut_16_0;
                  return stackIn_17_0 != 0;
                }
              } else {
                return true;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var8 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var8;
            stackOut_22_1 = new StringBuilder().append("rp.TA(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param6 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw r.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 41);
        }
        return stackIn_21_0 != 0;
    }

    final static void h(int param0) {
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
        Object var12 = null;
        sl var13 = null;
        fb var14 = null;
        fb var15 = null;
        Object var16 = null;
        Object var17 = null;
        Object var18 = null;
        String var19 = null;
        String var20 = null;
        String var21 = null;
        mj var22 = null;
        String var23 = null;
        String var24 = null;
        mj var25 = null;
        mj var26 = null;
        Object var27 = null;
        fb var27_ref = null;
        mj var28 = null;
        fb var29 = null;
        fb var30 = null;
        mj var31 = null;
        int stackIn_10_0 = 0;
        mj stackIn_16_0 = null;
        mj stackIn_17_0 = null;
        mj stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        mj stackIn_72_0 = null;
        mj stackIn_73_0 = null;
        mj stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        boolean stackIn_144_0 = false;
        int stackIn_152_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        mj stackOut_15_0 = null;
        mj stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        mj stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        mj stackOut_71_0 = null;
        mj stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        mj stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        boolean stackOut_143_0 = false;
        int stackOut_151_0 = 0;
        var16 = null;
        var18 = null;
        var27 = null;
        var17 = null;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  var13 = sa.field_a;
                  var1_ref = var13;
                  var12 = null;
                  String discarded$1 = rp.a(false, (String) null, (java.applet.Applet) null);
                  var2 = ((ob) (Object) var1_ref).j(-119);
                  if (var2 == 0) {
                    break L3;
                  } else {
                    if (var2 == 1) {
                      break L3;
                    } else {
                      if (var2 == 2) {
                        break L3;
                      } else {
                        if (var2 == 3) {
                          break L3;
                        } else {
                          if (4 == var2) {
                            break L3;
                          } else {
                            L4: {
                              if (var2 != 5) {
                                break L4;
                              } else {
                                L5: {
                                  var3_long = ((ob) (Object) var1_ref).d(75);
                                  var20 = ((ob) (Object) var1_ref).e(-1);
                                  var19 = ((ob) (Object) var1_ref).e(-1);
                                  var21 = ((ob) (Object) var1_ref).e(-1);
                                  var8_ref_mj = ta.a(115, var3_long);
                                  if (var19.equals((Object) (Object) "")) {
                                    stackOut_9_0 = 0;
                                    stackIn_10_0 = stackOut_9_0;
                                    break L5;
                                  } else {
                                    stackOut_8_0 = 1;
                                    stackIn_10_0 = stackOut_8_0;
                                    break L5;
                                  }
                                }
                                L6: {
                                  L7: {
                                    var9 = stackIn_10_0;
                                    if (var8_ref_mj != null) {
                                      break L7;
                                    } else {
                                      var8_ref_mj = new mj(var20, var21, var3_long);
                                      ShatteredPlansClient.field_H.a(var3_long, (df) (Object) var8_ref_mj, true);
                                      if (var11 == 0) {
                                        break L6;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                  if (var9 != 0) {
                                    var8_ref_mj.a(var21, var20, (byte) 64);
                                    break L6;
                                  } else {
                                    break L6;
                                  }
                                }
                                L8: {
                                  var8_ref_mj.field_zb = pr.a(14274) + -(long)((ob) (Object) var1_ref).a(16711680);
                                  var8_ref_mj.field_Qb = ((ob) (Object) var1_ref).f(-20976);
                                  var10 = ((ob) (Object) var1_ref).c(false);
                                  var8_ref_mj.field_Fb = var10 >> 1;
                                  stackOut_15_0 = (mj) var8_ref_mj;
                                  stackIn_17_0 = stackOut_15_0;
                                  stackIn_16_0 = stackOut_15_0;
                                  if ((1 & var10) == 0) {
                                    stackOut_17_0 = (mj) (Object) stackIn_17_0;
                                    stackOut_17_1 = 0;
                                    stackIn_18_0 = stackOut_17_0;
                                    stackIn_18_1 = stackOut_17_1;
                                    break L8;
                                  } else {
                                    stackOut_16_0 = (mj) (Object) stackIn_16_0;
                                    stackOut_16_1 = 1;
                                    stackIn_18_0 = stackOut_16_0;
                                    stackIn_18_1 = stackOut_16_1;
                                    break L8;
                                  }
                                }
                                stackIn_18_0.field_Ub = stackIn_18_1 != 0;
                                var8_ref_mj.field_Lb = ((ob) (Object) var1_ref).j(-122);
                                var8_ref_mj.field_Wb = ((ob) (Object) var1_ref).j(-109);
                                f.a((byte) -60, var8_ref_mj);
                                if (var11 == 0) {
                                  break L2;
                                } else {
                                  break L4;
                                }
                              }
                            }
                            L9: {
                              if (var2 == 6) {
                                break L9;
                              } else {
                                L10: {
                                  if (var2 == 7) {
                                    break L10;
                                  } else {
                                    L11: {
                                      if (8 == var2) {
                                        break L11;
                                      } else {
                                        L12: {
                                          if (9 != var2) {
                                            break L12;
                                          } else {
                                            L13: {
                                              var3 = ((ob) (Object) var1_ref).f(-20976);
                                              var4_int = ((ob) (Object) var1_ref).j(-98);
                                              var15 = (fb) (Object) ea.field_b.a(65280, (long)var3);
                                              if (var15 != null) {
                                                L14: {
                                                  L15: {
                                                    if (var4_int == 0) {
                                                      break L15;
                                                    } else {
                                                      var15.field_hc = var4_int;
                                                      var15.field_Nb = ks.field_i;
                                                      if (var11 == 0) {
                                                        break L14;
                                                      } else {
                                                        break L15;
                                                      }
                                                    }
                                                  }
                                                  var15.b((byte) -62);
                                                  break L14;
                                                }
                                                var15.a(16);
                                                break L13;
                                              } else {
                                                break L13;
                                              }
                                            }
                                            if (var11 == 0) {
                                              break L2;
                                            } else {
                                              break L12;
                                            }
                                          }
                                        }
                                        L16: {
                                          if (10 != var2) {
                                            break L16;
                                          } else {
                                            var29 = (fb) (Object) kj.field_a.d(0);
                                            L17: while (true) {
                                              L18: {
                                                if (var29 == null) {
                                                  break L18;
                                                } else {
                                                  var29.b((byte) -63);
                                                  var29.a(16);
                                                  var29 = (fb) (Object) kj.field_a.a((byte) -71);
                                                  if (var11 != 0) {
                                                    break L2;
                                                  } else {
                                                    if (var11 == 0) {
                                                      continue L17;
                                                    } else {
                                                      break L18;
                                                    }
                                                  }
                                                }
                                              }
                                              if (var11 == 0) {
                                                break L2;
                                              } else {
                                                break L16;
                                              }
                                            }
                                          }
                                        }
                                        L19: {
                                          L20: {
                                            if (var2 == 11) {
                                              break L20;
                                            } else {
                                              if (var2 != 12) {
                                                break L19;
                                              } else {
                                                break L20;
                                              }
                                            }
                                          }
                                          L21: {
                                            var3 = ((ob) (Object) var1_ref).f(-20976);
                                            var30 = (fb) (Object) ea.field_b.a(65280, (long)var3);
                                            if (var30 != null) {
                                              L22: {
                                                L23: {
                                                  if (var2 == 11) {
                                                    break L23;
                                                  } else {
                                                    var30.field_Yb = true;
                                                    if (var11 == 0) {
                                                      break L22;
                                                    } else {
                                                      break L23;
                                                    }
                                                  }
                                                }
                                                var30.field_Jb = true;
                                                break L22;
                                              }
                                              ei.a(0, var30);
                                              break L21;
                                            } else {
                                              break L21;
                                            }
                                          }
                                          if (var11 == 0) {
                                            break L2;
                                          } else {
                                            break L19;
                                          }
                                        }
                                        L24: {
                                          if (var2 == 13) {
                                            break L24;
                                          } else {
                                            L25: {
                                              if (var2 == 14) {
                                                break L25;
                                              } else {
                                                if (var2 == 16) {
                                                  break L25;
                                                } else {
                                                  L26: {
                                                    L27: {
                                                      if (15 == var2) {
                                                        break L27;
                                                      } else {
                                                        if (var2 != 17) {
                                                          break L26;
                                                        } else {
                                                          break L27;
                                                        }
                                                      }
                                                    }
                                                    L28: {
                                                      var3_long = ((ob) (Object) var1_ref).d(127);
                                                      var5 = ((ob) (Object) var1_ref).j(-119);
                                                      var22 = ta.a(126, var3_long);
                                                      if (var22 != null) {
                                                        L29: {
                                                          L30: {
                                                            if (15 != var2) {
                                                              break L30;
                                                            } else {
                                                              var22.field_Tb = false;
                                                              if (var11 == 0) {
                                                                break L29;
                                                              } else {
                                                                break L30;
                                                              }
                                                            }
                                                          }
                                                          if (var22.field_Vb) {
                                                            ah.field_X = ah.field_X - 1;
                                                            var22.field_Vb = false;
                                                            break L29;
                                                          } else {
                                                            break L29;
                                                          }
                                                        }
                                                        L31: {
                                                          if (0 == var5) {
                                                            break L31;
                                                          } else {
                                                            var22.field_Gb = ks.field_i;
                                                            var22.field_Eb = var5;
                                                            break L31;
                                                          }
                                                        }
                                                        f.a((byte) -60, var22);
                                                        break L28;
                                                      } else {
                                                        break L28;
                                                      }
                                                    }
                                                    if (var11 == 0) {
                                                      break L2;
                                                    } else {
                                                      break L26;
                                                    }
                                                  }
                                                  L32: {
                                                    if (var2 != 18) {
                                                      break L32;
                                                    } else {
                                                      L33: {
                                                        var3_long = ((ob) (Object) var1_ref).d(26);
                                                        var23 = ((ob) (Object) var1_ref).e(-1);
                                                        var24 = ((ob) (Object) var1_ref).e(-1);
                                                        var7 = ik.a(-121, var3_long);
                                                        if (var7 == null) {
                                                          var7 = new mj(var23, var24, var3_long);
                                                          qp.field_w.a(var3_long, (df) (Object) var7, true);
                                                          np.field_a.field_Lb = np.field_a.field_Lb + 1;
                                                          break L33;
                                                        } else {
                                                          break L33;
                                                        }
                                                      }
                                                      L34: {
                                                        var7.field_Qb = ((ob) (Object) var1_ref).f(-20976);
                                                        var8 = ((ob) (Object) var1_ref).c(false);
                                                        stackOut_71_0 = (mj) var7;
                                                        stackIn_73_0 = stackOut_71_0;
                                                        stackIn_72_0 = stackOut_71_0;
                                                        if ((1 & var8) == 0) {
                                                          stackOut_73_0 = (mj) (Object) stackIn_73_0;
                                                          stackOut_73_1 = 0;
                                                          stackIn_74_0 = stackOut_73_0;
                                                          stackIn_74_1 = stackOut_73_1;
                                                          break L34;
                                                        } else {
                                                          stackOut_72_0 = (mj) (Object) stackIn_72_0;
                                                          stackOut_72_1 = 1;
                                                          stackIn_74_0 = stackOut_72_0;
                                                          stackIn_74_1 = stackOut_72_1;
                                                          break L34;
                                                        }
                                                      }
                                                      stackIn_74_0.field_Ub = stackIn_74_1 != 0;
                                                      var7.field_Fb = var8 >> 1;
                                                      var7.field_Lb = ((ob) (Object) var1_ref).j(-111);
                                                      var7.field_Wb = ((ob) (Object) var1_ref).j(-68);
                                                      uo.field_a.a((byte) -113, (oh) (Object) var7);
                                                      if (var11 == 0) {
                                                        break L2;
                                                      } else {
                                                        break L32;
                                                      }
                                                    }
                                                  }
                                                  L35: {
                                                    if (var2 != 19) {
                                                      break L35;
                                                    } else {
                                                      L36: {
                                                        var3_long = ((ob) (Object) var1_ref).d(105);
                                                        var5 = ((ob) (Object) var1_ref).j(-120);
                                                        var25 = ik.a(-101, var3_long);
                                                        if (var25 == null) {
                                                          break L36;
                                                        } else {
                                                          L37: {
                                                            L38: {
                                                              if (0 != var5) {
                                                                break L38;
                                                              } else {
                                                                var25.b((byte) -124);
                                                                if (var11 == 0) {
                                                                  break L37;
                                                                } else {
                                                                  break L38;
                                                                }
                                                              }
                                                            }
                                                            var25.field_Gb = ks.field_i;
                                                            var25.field_Eb = var5;
                                                            break L37;
                                                          }
                                                          var25.a(16);
                                                          np.field_a.field_Lb = np.field_a.field_Lb - 1;
                                                          break L36;
                                                        }
                                                      }
                                                      if (var11 == 0) {
                                                        break L2;
                                                      } else {
                                                        break L35;
                                                      }
                                                    }
                                                  }
                                                  L39: {
                                                    if (var2 == 20) {
                                                      break L39;
                                                    } else {
                                                      L40: {
                                                        if (var2 != 21) {
                                                          break L40;
                                                        } else {
                                                          L41: {
                                                            L42: {
                                                              var3 = ((ob) (Object) var1_ref).f(-20976);
                                                              if (var3 != 0) {
                                                                break L42;
                                                              } else {
                                                                sf.field_e = 0L;
                                                                if (var11 == 0) {
                                                                  break L41;
                                                                } else {
                                                                  break L42;
                                                                }
                                                              }
                                                            }
                                                            sf.field_e = pr.a(14274) + (long)var3;
                                                            break L41;
                                                          }
                                                          if (var11 == 0) {
                                                            break L2;
                                                          } else {
                                                            break L40;
                                                          }
                                                        }
                                                      }
                                                      L43: {
                                                        if (var2 == 22) {
                                                          break L43;
                                                        } else {
                                                          L44: {
                                                            if (23 != var2) {
                                                              break L44;
                                                            } else {
                                                              ec.field_p = ((ob) (Object) var1_ref).d(65);
                                                              if (var11 == 0) {
                                                                break L2;
                                                              } else {
                                                                break L44;
                                                              }
                                                            }
                                                          }
                                                          jq.a(-29901, (Throwable) null, "L1: " + w.a(16738));
                                                          q.g(-115);
                                                          if (var11 == 0) {
                                                            break L2;
                                                          } else {
                                                            break L43;
                                                          }
                                                        }
                                                      }
                                                      a.field_j = ((ob) (Object) var1_ref).f(-20976);
                                                      bh.field_h = ((ob) (Object) var1_ref).c(false);
                                                      if (var11 == 0) {
                                                        break L2;
                                                      } else {
                                                        break L39;
                                                      }
                                                    }
                                                  }
                                                  mi.a((byte) -89, np.field_a, (ob) (Object) var1_ref, false);
                                                  if (var11 == 0) {
                                                    break L2;
                                                  } else {
                                                    break L25;
                                                  }
                                                }
                                              }
                                            }
                                            L45: {
                                              var3_long = ((ob) (Object) var1_ref).d(127);
                                              var26 = ta.a(121, var3_long);
                                              if (var26 == null) {
                                                break L45;
                                              } else {
                                                L46: {
                                                  L47: {
                                                    if (var2 != 14) {
                                                      break L47;
                                                    } else {
                                                      var26.field_Tb = true;
                                                      if (var11 == 0) {
                                                        break L46;
                                                      } else {
                                                        break L47;
                                                      }
                                                    }
                                                  }
                                                  if (var26.field_Vb) {
                                                    break L46;
                                                  } else {
                                                    ah.field_X = ah.field_X + 1;
                                                    var26.field_Vb = true;
                                                    break L46;
                                                  }
                                                }
                                                f.a((byte) -60, var26);
                                                break L45;
                                              }
                                            }
                                            if (var11 == 0) {
                                              break L2;
                                            } else {
                                              break L24;
                                            }
                                          }
                                        }
                                        L48: {
                                          var3 = ((ob) (Object) var1_ref).f(-20976);
                                          var4_int = ((ob) (Object) var1_ref).j(-60);
                                          var27_ref = (fb) (Object) ea.field_b.a(65280, (long)var3);
                                          if (var27_ref != null) {
                                            L49: {
                                              var27_ref.field_Yb = false;
                                              var14 = var27_ref;
                                              var6 = var14;
                                              var14.field_Jb = false;
                                              if (var4_int != 0) {
                                                var27_ref.field_hc = var4_int;
                                                var27_ref.field_Nb = ks.field_i;
                                                break L49;
                                              } else {
                                                break L49;
                                              }
                                            }
                                            ei.a(0, var27_ref);
                                            break L48;
                                          } else {
                                            break L48;
                                          }
                                        }
                                        if (var11 == 0) {
                                          break L2;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                    L50: {
                                      var3 = ((ob) (Object) var1_ref).f(-20976);
                                      var4 = (fb) (Object) ea.field_b.a(65280, (long)var3);
                                      if (var4 != null) {
                                        break L50;
                                      } else {
                                        var4 = new fb(em.field_k);
                                        ea.field_b.a((long)var3, (df) (Object) var4, true);
                                        break L50;
                                      }
                                    }
                                    mi.a((byte) -89, var4, (ob) (Object) var1_ref, true);
                                    ei.a(0, var4);
                                    if (var11 == 0) {
                                      break L2;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                                var31 = (mj) (Object) gr.field_p.d(0);
                                L51: while (true) {
                                  L52: {
                                    L53: {
                                      if (var31 == null) {
                                        break L53;
                                      } else {
                                        var31.b((byte) -126);
                                        var31.a(16);
                                        var31 = (mj) (Object) gr.field_p.a((byte) -71);
                                        if (var11 != 0) {
                                          break L52;
                                        } else {
                                          if (var11 == 0) {
                                            continue L51;
                                          } else {
                                            break L53;
                                          }
                                        }
                                      }
                                    }
                                    ah.field_X = 0;
                                    break L52;
                                  }
                                  if (var11 == 0) {
                                    break L2;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                            }
                            L54: {
                              var3_long = ((ob) (Object) var1_ref).d(29);
                              var5 = ((ob) (Object) var1_ref).j(-53);
                              var28 = ta.a(-98, var3_long);
                              if (var28 != null) {
                                L55: {
                                  if (!var28.field_Vb) {
                                    break L55;
                                  } else {
                                    ah.field_X = ah.field_X - 1;
                                    var28.field_Vb = false;
                                    break L55;
                                  }
                                }
                                L56: {
                                  L57: {
                                    if (var5 == 0) {
                                      break L57;
                                    } else {
                                      var28.field_Eb = var5;
                                      var28.field_Gb = ks.field_i;
                                      if (var11 == 0) {
                                        break L56;
                                      } else {
                                        break L57;
                                      }
                                    }
                                  }
                                  var28.b((byte) -113);
                                  break L56;
                                }
                                var28.a(16);
                                break L54;
                              } else {
                                break L54;
                              }
                            }
                            if (var11 == 0) {
                              break L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                var3_ref_mj = (mj) (Object) uo.field_a.d(0);
                L58: while (true) {
                  L59: {
                    L60: {
                      if (var3_ref_mj == null) {
                        break L60;
                      } else {
                        var3_ref_mj.b((byte) -91);
                        var3_ref_mj.a(16);
                        var3_ref_mj = (mj) (Object) uo.field_a.a((byte) -71);
                        if (var11 != 0) {
                          break L59;
                        } else {
                          if (var11 == 0) {
                            continue L58;
                          } else {
                            break L60;
                          }
                        }
                      }
                    }
                    var3_ref_mj = (mj) (Object) ShatteredPlansClient.field_H.c((byte) -109);
                    break L59;
                  }
                  L61: while (true) {
                    L62: {
                      L63: {
                        if (var3_ref_mj == null) {
                          break L63;
                        } else {
                          stackOut_143_0 = var3_ref_mj.field_Tb;
                          stackIn_152_0 = stackOut_143_0 ? 1 : 0;
                          stackIn_144_0 = stackOut_143_0;
                          if (var11 != 0) {
                            break L62;
                          } else {
                            L64: {
                              L65: {
                                if (stackIn_144_0) {
                                  break L65;
                                } else {
                                  if (var3_ref_mj.field_Vb) {
                                    break L65;
                                  } else {
                                    break L64;
                                  }
                                }
                              }
                              L66: {
                                var3_ref_mj.field_Tb = false;
                                if (!var3_ref_mj.field_Vb) {
                                  break L66;
                                } else {
                                  ah.field_X = ah.field_X - 1;
                                  var3_ref_mj.field_Vb = false;
                                  break L66;
                                }
                              }
                              f.a((byte) -60, var3_ref_mj);
                              break L64;
                            }
                            var3_ref_mj = (mj) (Object) ShatteredPlansClient.field_H.b((byte) -107);
                            if (var11 == 0) {
                              continue L61;
                            } else {
                              break L63;
                            }
                          }
                        }
                      }
                      stackOut_151_0 = -2;
                      stackIn_152_0 = stackOut_151_0;
                      break L62;
                    }
                    L67: {
                      if (stackIn_152_0 != ~var2) {
                        break L67;
                      } else {
                        if (null == np.field_a) {
                          break L67;
                        } else {
                          la.field_h = np.field_a.field_Xb;
                          break L67;
                        }
                      }
                    }
                    L68: {
                      if (4 != var2) {
                        np.field_a = null;
                        break L68;
                      } else {
                        var3 = ((ob) (Object) var1_ref).f(-20976);
                        np.field_a = new fb(em.field_k);
                        np.field_a.a(16, (long)var3);
                        mi.a((byte) -89, np.field_a, (ob) (Object) var1_ref, false);
                        sf.field_e = 0L;
                        break L68;
                      }
                    }
                    L69: {
                      L70: {
                        L71: {
                          if (var2 == 2) {
                            break L71;
                          } else {
                            if (var2 != 3) {
                              break L70;
                            } else {
                              break L71;
                            }
                          }
                        }
                        if (he.field_p != null) {
                          break L69;
                        } else {
                          he.field_p = new fb(em.field_k);
                          if (var11 == 0) {
                            break L69;
                          } else {
                            break L70;
                          }
                        }
                      }
                      he.field_p = null;
                      break L69;
                    }
                    L72: {
                      if (var2 != 3) {
                        break L72;
                      } else {
                        k.field_i = true;
                        var3 = 0;
                        L73: while (true) {
                          L74: {
                            L75: {
                              if (~var3 <= ~id.field_c.length) {
                                break L75;
                              } else {
                                id.field_c[var3] = ((ob) (Object) var13).g(-2852);
                                var3++;
                                if (var11 != 0) {
                                  break L74;
                                } else {
                                  if (var11 == 0) {
                                    continue L73;
                                  } else {
                                    break L75;
                                  }
                                }
                              }
                            }
                            qj.field_b = ((ob) (Object) var1_ref).j(-82);
                            rj.field_q = ((ob) (Object) var1_ref).j(-54);
                            break L74;
                          }
                          var3 = 0;
                          L76: while (true) {
                            L77: {
                              if (qj.field_f.length <= var3) {
                                break L77;
                              } else {
                                qj.field_f[var3] = ((ob) (Object) var13).g(-2852);
                                var3++;
                                if (var11 != 0) {
                                  break L2;
                                } else {
                                  if (var11 == 0) {
                                    continue L76;
                                  } else {
                                    break L77;
                                  }
                                }
                              }
                            }
                            if (var11 == 0) {
                              break L2;
                            } else {
                              break L72;
                            }
                          }
                        }
                      }
                    }
                    k.field_i = false;
                    break L1;
                  }
                }
              }
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var1, "rp.A(" + -96 + 41);
        }
    }

    final static String a(boolean param0, String param1, java.applet.Applet param2) {
        try {
            Throwable var3 = null;
            RuntimeException var3_ref = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            String var8 = null;
            Object stackIn_3_0 = null;
            String stackIn_11_0 = null;
            Object stackIn_16_0 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            String stackIn_23_2 = null;
            Object stackOut_2_0 = null;
            String stackOut_10_0 = null;
            Object stackOut_15_0 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            String stackOut_19_2 = null;
            RuntimeException stackOut_20_0 = null;
            StringBuilder stackOut_20_1 = null;
            RuntimeException stackOut_21_0 = null;
            StringBuilder stackOut_21_1 = null;
            String stackOut_21_2 = null;
            RuntimeException stackOut_22_0 = null;
            StringBuilder stackOut_22_1 = null;
            String stackOut_22_2 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var7 = ShatteredPlansClient.field_F ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var8 = (String) ll.a("getcookies", param2, (byte) 70);
                            var4 = so.a(var8, ';', -116);
                            var5 = 0;
                            if (!param0) {
                                statePc = 4;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            stackOut_2_0 = null;
                            stackIn_3_0 = stackOut_2_0;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        return (String) (Object) stackIn_3_0;
                    }
                    case 4: {
                        try {
                            if (var5 >= var4.length) {
                                statePc = 15;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var6 = var4[var5].indexOf('=');
                            if (var7 == 0) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            return null;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (var6 < 0) {
                                statePc = 12;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            if (var4[var5].substring(0, var6).trim().equals((Object) (Object) param1)) {
                                statePc = 10;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            stackOut_10_0 = var4[var5].substring(var6 - -1).trim();
                            stackIn_11_0 = stackOut_10_0;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        return stackIn_11_0;
                    }
                    case 12: {
                        try {
                            var5++;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            var3 = caughtException;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            stackOut_15_0 = null;
                            stackIn_16_0 = stackOut_15_0;
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        return (String) (Object) stackIn_16_0;
                    }
                    case 17: {
                        var3_ref = (RuntimeException) (Object) caughtException;
                        stackOut_17_0 = (RuntimeException) var3_ref;
                        stackOut_17_1 = new StringBuilder().append("rp.G(").append(param0).append(44);
                        stackIn_19_0 = stackOut_17_0;
                        stackIn_19_1 = stackOut_17_1;
                        stackIn_18_0 = stackOut_17_0;
                        stackIn_18_1 = stackOut_17_1;
                        if (param1 == null) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 18: {
                        stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                        stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
                        stackOut_18_2 = "{...}";
                        stackIn_20_0 = stackOut_18_0;
                        stackIn_20_1 = stackOut_18_1;
                        stackIn_20_2 = stackOut_18_2;
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 19: {
                        stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
                        stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
                        stackOut_19_2 = "null";
                        stackIn_20_0 = stackOut_19_0;
                        stackIn_20_1 = stackOut_19_1;
                        stackIn_20_2 = stackOut_19_2;
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 20: {
                        stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
                        stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(44);
                        stackIn_22_0 = stackOut_20_0;
                        stackIn_22_1 = stackOut_20_1;
                        stackIn_21_0 = stackOut_20_0;
                        stackIn_21_1 = stackOut_20_1;
                        if (param2 == null) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    }
                    case 21: {
                        stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
                        stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
                        stackOut_21_2 = "{...}";
                        stackIn_23_0 = stackOut_21_0;
                        stackIn_23_1 = stackOut_21_1;
                        stackIn_23_2 = stackOut_21_2;
                        statePc = 23;
                        continue stateLoop;
                    }
                    case 22: {
                        stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
                        stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
                        stackOut_22_2 = "null";
                        stackIn_23_0 = stackOut_22_0;
                        stackIn_23_1 = stackOut_22_1;
                        stackIn_23_2 = stackOut_22_2;
                        statePc = 23;
                        continue stateLoop;
                    }
                    case 23: {
                        throw r.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = "Total excess research";
    }
}
