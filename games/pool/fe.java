/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.lang.String;

class fe extends ei {
    static sj field_M;
    boolean field_G;
    private boolean field_F;
    static boolean field_J;
    static boolean[] field_H;
    static int[] field_L;
    boolean field_I;
    private boolean field_K;

    final static void a(int param0, int param1, byte param2, java.awt.Canvas param3) {
        java.awt.Graphics var4 = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        int var5 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var4 = param3.getGraphics();
                        sh.field_P.a(var4, param0, param1, -23820);
                        var5 = 107 % ((-1 - param2) / 57);
                        var4.dispose();
                        statePc = 1;
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = (stateCaught_0 instanceof Exception ? 2 : 4);
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var4_ref = (Exception) (Object) caughtException;
                        param3.repaint();
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 4: {
                    var4_ref2 = (RuntimeException) (Object) caughtException;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        stackOut_5_0 = (RuntimeException) var4_ref2;
                        stackOut_5_1 = new StringBuilder().append("fe.V(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
                        stackIn_8_0 = stackOut_5_0;
                        stackIn_8_1 = stackOut_5_1;
                        stackIn_6_0 = stackOut_5_0;
                        stackIn_6_1 = stackOut_5_1;
                        if (param3 == null) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
                        stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
                        stackOut_6_2 = "{...}";
                        stackIn_9_0 = stackOut_6_0;
                        stackIn_9_1 = stackOut_6_1;
                        stackIn_9_2 = stackOut_6_2;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 8: {
                    stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                    stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                    stackOut_8_2 = "null";
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    stackIn_9_2 = stackOut_8_2;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    throw wm.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
                }
                case 10: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        Object stackIn_4_0 = null;
        Object stackOut_3_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param0 == 16) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 1: {
                    return;
                }
                case 2: {
                    try {
                        if (null == ((fe) this).field_t) {
                            statePc = 12;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = this;
                        stackIn_4_0 = stackOut_3_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (!(((fe) this).field_t instanceof tb)) {
                            statePc = 12;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        ((tb) (Object) ((fe) this).field_t).a(true, param2, param3, (fe) this, param1);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    var5 = (RuntimeException) (Object) caughtException;
                    throw wm.a((Throwable) (Object) var5, "fe.A(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
                }
                case 12: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(boolean param0, boolean param1, boolean param2, int param3, int param4) {
        vh var5 = null;
        int var5_int = 0;
        vh var6 = null;
        vh var7 = null;
        vh var8 = null;
        String var9_ref = null;
        int var9 = 0;
        String var10_ref = null;
        int var10 = 0;
        int var11 = 0;
        String var11_ref = null;
        int var12 = 0;
        int var13 = 0;
        String var13_ref = null;
        int[] var13_ref_int__ = null;
        int var14 = 0;
        String var14_ref = null;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        ko var17 = null;
        im var18 = null;
        int var18_int = 0;
        int var19 = 0;
        vh stackIn_18_0 = null;
        vh stackIn_19_0 = null;
        vh stackIn_20_0 = null;
        vh stackIn_21_0 = null;
        vh stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_58_1 = 0;
        int stackIn_65_0 = 0;
        int stackIn_69_0 = 0;
        boolean stackIn_80_0 = false;
        int stackIn_88_0 = 0;
        boolean stackIn_147_0 = false;
        int stackIn_173_0 = 0;
        vh stackIn_194_0 = null;
        vh stackIn_195_0 = null;
        vh stackIn_196_0 = null;
        vh stackIn_197_0 = null;
        vh stackIn_198_0 = null;
        vh stackIn_199_0 = null;
        vh stackIn_200_0 = null;
        int stackIn_200_1 = 0;
        vh stackIn_201_0 = null;
        vh stackIn_202_0 = null;
        vh stackIn_203_0 = null;
        vh stackIn_204_0 = null;
        vh stackIn_205_0 = null;
        vh stackIn_206_0 = null;
        vh stackIn_207_0 = null;
        int stackIn_207_1 = 0;
        vh stackIn_208_0 = null;
        vh stackIn_209_0 = null;
        vh stackIn_210_0 = null;
        vh stackIn_211_0 = null;
        vh stackIn_212_0 = null;
        vh stackIn_213_0 = null;
        vh stackIn_214_0 = null;
        int stackIn_214_1 = 0;
        vh stackOut_17_0 = null;
        vh stackOut_18_0 = null;
        vh stackOut_19_0 = null;
        vh stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        vh stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        int stackOut_37_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_57_1 = 0;
        int stackOut_64_0 = 0;
        int stackOut_68_0 = 0;
        boolean stackOut_79_0 = false;
        int stackOut_87_0 = 0;
        boolean stackOut_146_0 = false;
        int stackOut_172_0 = 0;
        vh stackOut_193_0 = null;
        vh stackOut_194_0 = null;
        vh stackOut_195_0 = null;
        vh stackOut_196_0 = null;
        vh stackOut_197_0 = null;
        vh stackOut_198_0 = null;
        int stackOut_198_1 = 0;
        vh stackOut_199_0 = null;
        int stackOut_199_1 = 0;
        vh stackOut_200_0 = null;
        vh stackOut_201_0 = null;
        vh stackOut_202_0 = null;
        vh stackOut_203_0 = null;
        vh stackOut_204_0 = null;
        vh stackOut_205_0 = null;
        int stackOut_205_1 = 0;
        vh stackOut_206_0 = null;
        int stackOut_206_1 = 0;
        vh stackOut_207_0 = null;
        vh stackOut_208_0 = null;
        vh stackOut_209_0 = null;
        vh stackOut_210_0 = null;
        vh stackOut_211_0 = null;
        vh stackOut_212_0 = null;
        int stackOut_212_1 = 0;
        vh stackOut_213_0 = null;
        int stackOut_213_1 = 0;
        L0: {
          var19 = Pool.field_O;
          fr.a((byte) -58, nj.field_b);
          if (null != em.field_L) {
            L1: {
              L2: {
                ok.field_ob.field_pb = true;
                kc.field_b.field_Db = 0;
                var5 = kc.field_b;
                var5.field_gb = 0;
                d.field_c.field_Db = 0;
                var6 = d.field_c;
                var6.field_gb = 0;
                gi.field_o.field_Db = 0;
                var7 = gi.field_o;
                var7.field_gb = 0;
                if (!cj.e((byte) 85)) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      ii.field_e.field_nb = rf.field_b.toUpperCase();
                      var9 = (2 + uq.field_f.field_gb) / 2;
                      kc.field_b.b(uq.field_f.field_Db + -40, 2147483647, 0, var9 - 2, 40);
                      if ((em.field_L.field_mc ^ -1) <= (em.field_L.field_Nb ^ -1)) {
                        break L4;
                      } else {
                        kc.field_b.field_nb = v.field_d.toUpperCase();
                        kc.field_b.field_pb = true;
                        if (var19 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    kc.field_b.field_nb = ro.field_p.toUpperCase();
                    kc.field_b.field_pb = false;
                    break L3;
                  }
                  L5: {
                    kc.field_b.field_F = mg.field_c.field_F;
                    if (uf.field_jb > 0) {
                      L6: {
                        L7: {
                          if ((uf.field_jb ^ -1) != -2) {
                            break L7;
                          } else {
                            var10_ref = lo.field_b;
                            if (var19 == 0) {
                              break L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                        var10_ref = nr.a(new String[1], -1, hq.field_f);
                        break L6;
                      }
                      L8: {
                        if (-1 != (va.field_V & 16 ^ -1)) {
                          break L8;
                        } else {
                          if (nr.field_bb) {
                            break L8;
                          } else {
                            kc.field_b.field_F = mg.field_c.field_Gb;
                            break L8;
                          }
                        }
                      }
                      kc.field_b.field_nb = kc.field_b.field_nb + "<br>" + var10_ref;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L9: {
                    L10: {
                      d.field_c.b(uq.field_f.field_Db - 40, 2147483647, var9, -var9 + uq.field_f.field_gb, 40);
                      d.field_c.field_nb = ua.field_s.toUpperCase();
                      var8 = d.field_c;
                      stackOut_17_0 = d.field_c;
                      stackIn_21_0 = stackOut_17_0;
                      stackIn_18_0 = stackOut_17_0;
                      if (!param0) {
                        break L10;
                      } else {
                        stackOut_18_0 = (vh) (Object) stackIn_18_0;
                        stackIn_21_0 = stackOut_18_0;
                        stackIn_19_0 = stackOut_18_0;
                        if (fd.field_K != 0L) {
                          break L10;
                        } else {
                          stackOut_19_0 = (vh) (Object) stackIn_19_0;
                          stackIn_20_0 = stackOut_19_0;
                          stackOut_20_0 = (vh) (Object) stackIn_20_0;
                          stackOut_20_1 = 1;
                          stackIn_22_0 = stackOut_20_0;
                          stackIn_22_1 = stackOut_20_1;
                          break L9;
                        }
                      }
                    }
                    stackOut_21_0 = (vh) (Object) stackIn_21_0;
                    stackOut_21_1 = 0;
                    stackIn_22_0 = stackOut_21_0;
                    stackIn_22_1 = stackOut_21_1;
                    break L9;
                  }
                  L11: {
                    stackIn_22_0.field_pb = stackIn_22_1 != 0;
                    var10 = 2;
                    if (we.field_m != null) {
                      L12: {
                        if (null != dk.field_j) {
                          break L12;
                        } else {
                          dk.field_j = new byte[dr.field_c];
                          gf.field_b = new boolean[dr.field_c];
                          break L12;
                        }
                      }
                      var11 = 0;
                      L13: while (true) {
                        L14: {
                          L15: {
                            if ((var11 ^ -1) <= (dr.field_c ^ -1)) {
                              break L15;
                            } else {
                              gf.field_b[var11] = false;
                              var11++;
                              if (var19 != 0) {
                                break L14;
                              } else {
                                if (var19 == 0) {
                                  continue L13;
                                } else {
                                  break L15;
                                }
                              }
                            }
                          }
                          var10 = 0;
                          break L14;
                        }
                        L16: while (true) {
                          L17: {
                            L18: {
                              if ((var10 ^ -1) <= -3) {
                                break L18;
                              } else {
                                var11 = 0;
                                stackOut_33_0 = 0;
                                stackIn_69_0 = stackOut_33_0;
                                stackIn_34_0 = stackOut_33_0;
                                if (var19 != 0) {
                                  break L17;
                                } else {
                                  var12 = stackIn_34_0;
                                  L19: while (true) {
                                    stackOut_35_0 = var12;
                                    stackOut_35_1 = we.field_m.length;
                                    stackIn_36_0 = stackOut_35_0;
                                    stackIn_36_1 = stackOut_35_1;
                                    L20: while (true) {
                                      L21: {
                                        L22: {
                                          if (stackIn_36_0 >= stackIn_36_1) {
                                            break L22;
                                          } else {
                                            var13_ref_int__ = we.field_m[var12];
                                            stackOut_37_0 = 0;
                                            stackIn_65_0 = stackOut_37_0;
                                            stackIn_38_0 = stackOut_37_0;
                                            if (var19 != 0) {
                                              break L21;
                                            } else {
                                              var14 = stackIn_38_0;
                                              L23: while (true) {
                                                L24: {
                                                  L25: {
                                                    L26: {
                                                      if (var13_ref_int__.length <= var14) {
                                                        break L26;
                                                      } else {
                                                        var15 = var13_ref_int__[var14];
                                                        var16 = var13_ref_int__[1 + var14];
                                                        stackOut_40_0 = var15 ^ -1;
                                                        stackIn_55_0 = stackOut_40_0;
                                                        stackIn_41_0 = stackOut_40_0;
                                                        if (var19 != 0) {
                                                          break L25;
                                                        } else {
                                                          L27: {
                                                            L28: {
                                                              if (stackIn_41_0 != 0) {
                                                                break L28;
                                                              } else {
                                                                L29: {
                                                                  if (0 == var10) {
                                                                    stackOut_46_0 = em.field_L.field_Nb;
                                                                    stackIn_47_0 = stackOut_46_0;
                                                                    break L29;
                                                                  } else {
                                                                    stackOut_45_0 = em.field_L.field_mc;
                                                                    stackIn_47_0 = stackOut_45_0;
                                                                    break L29;
                                                                  }
                                                                }
                                                                var17_int = stackIn_47_0;
                                                                if ((var17_int ^ -1) != (var16 ^ -1)) {
                                                                  break L24;
                                                                } else {
                                                                  if (var19 == 0) {
                                                                    break L27;
                                                                  } else {
                                                                    break L28;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                            if (var16 != (em.field_L.field_tc[var15] & 255)) {
                                                              break L24;
                                                            } else {
                                                              break L27;
                                                            }
                                                          }
                                                          var14 += 2;
                                                          if (var19 == 0) {
                                                            continue L23;
                                                          } else {
                                                            break L26;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    var11 = 1;
                                                    var14 = -1;
                                                    stackOut_54_0 = 0;
                                                    stackIn_55_0 = stackOut_54_0;
                                                    break L25;
                                                  }
                                                  var15 = stackIn_55_0;
                                                  L30: while (true) {
                                                    L31: {
                                                      if (var13_ref_int__.length <= var15) {
                                                        break L31;
                                                      } else {
                                                        var16 = var13_ref_int__[var15];
                                                        stackOut_57_0 = var16 ^ -1;
                                                        stackOut_57_1 = var14 ^ -1;
                                                        stackIn_36_0 = stackOut_57_0;
                                                        stackIn_36_1 = stackOut_57_1;
                                                        stackIn_58_0 = stackOut_57_0;
                                                        stackIn_58_1 = stackOut_57_1;
                                                        if (var19 != 0) {
                                                          continue L20;
                                                        } else {
                                                          L32: {
                                                            if (stackIn_58_0 < stackIn_58_1) {
                                                              var14 = var16;
                                                              break L32;
                                                            } else {
                                                              break L32;
                                                            }
                                                          }
                                                          var15 += 2;
                                                          if (var19 == 0) {
                                                            continue L30;
                                                          } else {
                                                            break L31;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    gf.field_b[var14] = true;
                                                    break L24;
                                                  }
                                                }
                                                var12++;
                                                if (var19 == 0) {
                                                  continue L19;
                                                } else {
                                                  break L22;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        stackOut_64_0 = var11;
                                        stackIn_65_0 = stackOut_64_0;
                                        break L21;
                                      }
                                      if (stackIn_65_0 != 0) {
                                        break L18;
                                      } else {
                                        var10++;
                                        if (var19 == 0) {
                                          continue L16;
                                        } else {
                                          break L18;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_68_0 = hq.field_i ^ -1;
                            stackIn_69_0 = stackOut_68_0;
                            break L17;
                          }
                          if (stackIn_69_0 > -3) {
                            break L11;
                          } else {
                            if (!vj.field_c[12]) {
                              break L11;
                            } else {
                              var10 = 2;
                              break L11;
                            }
                          }
                        }
                      }
                    } else {
                      break L11;
                    }
                  }
                  L33: {
                    L34: {
                      if (var10 >= 2) {
                        break L34;
                      } else {
                        d.field_c.field_pb = false;
                        if (d.field_c.field_db) {
                          var11_ref = null;
                          var12 = 0;
                          var13 = 0;
                          L35: while (true) {
                            L36: {
                              L37: {
                                if (var13 >= dr.field_c) {
                                  break L37;
                                } else {
                                  stackOut_79_0 = gf.field_b[var13];
                                  stackIn_88_0 = stackOut_79_0 ? 1 : 0;
                                  stackIn_80_0 = stackOut_79_0;
                                  if (var19 != 0) {
                                    break L36;
                                  } else {
                                    L38: {
                                      if (stackIn_80_0) {
                                        L39: {
                                          var14_ref = "<col=A00000>" + ck.field_R[var13] + "</col>";
                                          if (var11_ref != null) {
                                            break L39;
                                          } else {
                                            var11_ref = var14_ref;
                                            if (var19 == 0) {
                                              break L38;
                                            } else {
                                              break L39;
                                            }
                                          }
                                        }
                                        var11_ref = var11_ref + ", " + var14_ref;
                                        var12 = 1;
                                        break L38;
                                      } else {
                                        break L38;
                                      }
                                    }
                                    var13++;
                                    if (var19 == 0) {
                                      continue L35;
                                    } else {
                                      break L37;
                                    }
                                  }
                                }
                              }
                              stackOut_87_0 = -1;
                              stackIn_88_0 = stackOut_87_0;
                              break L36;
                            }
                            L40: {
                              if (stackIn_88_0 != (var10 ^ -1)) {
                                L41: {
                                  var13_ref = aj.field_Rb;
                                  if (var12 == 0) {
                                    break L41;
                                  } else {
                                    var14_ref = ab.field_d + var11_ref;
                                    if (var19 == 0) {
                                      break L40;
                                    } else {
                                      break L41;
                                    }
                                  }
                                }
                                var14_ref = nr.a(new String[1], -1, me.field_u);
                                break L40;
                              } else {
                                L42: {
                                  var13_ref = ah.field_g;
                                  if (var12 != 0) {
                                    break L42;
                                  } else {
                                    var14_ref = nr.a(new String[1], -1, fm.field_J);
                                    if (var19 == 0) {
                                      break L40;
                                    } else {
                                      break L42;
                                    }
                                  }
                                }
                                var14_ref = ud.field_M + var11_ref;
                                break L40;
                              }
                            }
                            kk.field_B = "<col=A00000>" + var13_ref + "<br>" + var14_ref;
                            if (var19 == 0) {
                              break L33;
                            } else {
                              break L34;
                            }
                          }
                        } else {
                          break L33;
                        }
                      }
                    }
                    L43: {
                      if (null != dl.field_j) {
                        break L43;
                      } else {
                        if (null != ci.field_d) {
                          break L43;
                        } else {
                          if (w.field_j != null) {
                            break L43;
                          } else {
                            if (null != op.field_a) {
                              break L43;
                            } else {
                              break L33;
                            }
                          }
                        }
                      }
                    }
                    var11 = 0;
                    var12 = 0;
                    var13 = 0;
                    var14 = 0;
                    var15 = 0;
                    var16 = 0;
                    L44: while (true) {
                      L45: {
                        L46: {
                          if ((dr.field_c ^ -1) >= (var16 ^ -1)) {
                            break L46;
                          } else {
                            var17_int = em.field_L.field_tc[var16] & 255;
                            if (var19 != 0) {
                              break L45;
                            } else {
                              L47: {
                                if (dl.field_j == null) {
                                  break L47;
                                } else {
                                  if (null != dl.field_j[var16]) {
                                    if (dl.field_j[var16][var17_int]) {
                                      var11 = 1;
                                      break L47;
                                    } else {
                                      break L47;
                                    }
                                  } else {
                                    break L47;
                                  }
                                }
                              }
                              L48: {
                                if (ci.field_d == null) {
                                  break L48;
                                } else {
                                  if (null != ci.field_d[var16]) {
                                    L49: {
                                      var18_int = ci.field_d[var16][var17_int];
                                      if (var18_int > var13) {
                                        var13 = var18_int;
                                        break L49;
                                      } else {
                                        break L49;
                                      }
                                    }
                                    if (var18_int == 0) {
                                      break L48;
                                    } else {
                                      if (!rg.field_s) {
                                        var11 = 1;
                                        break L48;
                                      } else {
                                        break L48;
                                      }
                                    }
                                  } else {
                                    break L48;
                                  }
                                }
                              }
                              L50: {
                                if (op.field_a == null) {
                                  break L50;
                                } else {
                                  if (op.field_a[var16] != null) {
                                    var15 = var15 | op.field_a[var16][var17_int];
                                    break L50;
                                  } else {
                                    break L50;
                                  }
                                }
                              }
                              L51: {
                                if (null == w.field_j) {
                                  break L51;
                                } else {
                                  if (w.field_j[var16] == null) {
                                    break L51;
                                  } else {
                                    L52: {
                                      var18_int = w.field_j[var16][var17_int];
                                      if (var18_int <= var14) {
                                        break L52;
                                      } else {
                                        var14 = var18_int;
                                        break L52;
                                      }
                                    }
                                    if (0 == var18_int) {
                                      break L51;
                                    } else {
                                      if (rg.field_s) {
                                        break L51;
                                      } else {
                                        var11 = 1;
                                        break L51;
                                      }
                                    }
                                  }
                                }
                              }
                              var16++;
                              if (var19 == 0) {
                                continue L44;
                              } else {
                                break L46;
                              }
                            }
                          }
                        }
                        var16 = 0;
                        break L45;
                      }
                      var17 = wo.field_f.field_Rb.field_T;
                      var18 = (im) (Object) var17.c((byte) 96);
                      L53: while (true) {
                        L54: {
                          L55: {
                            if (var18 == null) {
                              break L55;
                            } else {
                              stackOut_146_0 = var18.c(true);
                              stackIn_173_0 = stackOut_146_0 ? 1 : 0;
                              stackIn_147_0 = stackOut_146_0;
                              if (var19 != 0) {
                                break L54;
                              } else {
                                L56: {
                                  L57: {
                                    if (!stackIn_147_0) {
                                      break L57;
                                    } else {
                                      if (var19 == 0) {
                                        break L56;
                                      } else {
                                        break L57;
                                      }
                                    }
                                  }
                                  L58: {
                                    if (var11 == 0) {
                                      break L58;
                                    } else {
                                      if (var18.field_Pb) {
                                        break L58;
                                      } else {
                                        var16 = 1;
                                        if (var19 == 0) {
                                          break L55;
                                        } else {
                                          break L58;
                                        }
                                      }
                                    }
                                  }
                                  L59: {
                                    if ((var13 ^ -1) < (var18.field_Rb ^ -1)) {
                                      var16 = 1;
                                      if (var19 == 0) {
                                        break L55;
                                      } else {
                                        break L59;
                                      }
                                    } else {
                                      break L59;
                                    }
                                  }
                                  L60: {
                                    if ((var18.field_Xb ^ -1) > (var14 ^ -1)) {
                                      var16 = 1;
                                      if (var19 == 0) {
                                        break L55;
                                      } else {
                                        break L60;
                                      }
                                    } else {
                                      break L60;
                                    }
                                  }
                                  L61: {
                                    if (0 < (var15 & (var18.field_Nb ^ -1))) {
                                      var16 = 1;
                                      if (var19 == 0) {
                                        break L55;
                                      } else {
                                        break L61;
                                      }
                                    } else {
                                      break L61;
                                    }
                                  }
                                  if (var12 == 0) {
                                    break L56;
                                  } else {
                                    var16 = 1;
                                    if (var19 == 0) {
                                      break L55;
                                    } else {
                                      break L56;
                                    }
                                  }
                                }
                                var18 = (im) (Object) var17.f((byte) -5);
                                if (var19 == 0) {
                                  continue L53;
                                } else {
                                  break L55;
                                }
                              }
                            }
                          }
                          stackOut_172_0 = hq.field_i;
                          stackIn_173_0 = stackOut_172_0;
                          break L54;
                        }
                        L62: {
                          if (stackIn_173_0 < 2) {
                            break L62;
                          } else {
                            if (vj.field_c[12]) {
                              var16 = 0;
                              break L62;
                            } else {
                              break L62;
                            }
                          }
                        }
                        if (var16 != 0) {
                          d.field_c.field_pb = false;
                          if (d.field_c.field_db) {
                            L63: {
                              if ((na.field_e.field_i.field_Mb ^ -1) == -1) {
                                break L63;
                              } else {
                                kk.field_B = nr.a(new String[1], -1, t.field_c);
                                if (var19 == 0) {
                                  break L33;
                                } else {
                                  break L63;
                                }
                              }
                            }
                            kk.field_B = fn.field_Mb;
                            break L33;
                          } else {
                            break L33;
                          }
                        } else {
                          break L33;
                        }
                      }
                    }
                  }
                  if (var19 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var9_ref = em.field_L.field_Ob;
              ii.field_e.field_nb = nr.a(new String[1], -1, th.field_c).toUpperCase();
              gi.field_o.b(-40 + uq.field_f.field_Db, 2147483647, 0, uq.field_f.field_gb, 40);
              gi.field_o.field_nb = nr.a(new String[1], -1, uh.field_s);
              var8 = gi.field_o;
              break L1;
            }
            L64: {
              if (-1L == (fd.field_K ^ -1L)) {
                break L64;
              } else {
                L65: {
                  var9 = (int)(-rl.a((byte) -94) + fd.field_K);
                  var9 = (999 + var9) / 1000;
                  if ((var9 ^ -1) <= -2) {
                    break L65;
                  } else {
                    var9 = 1;
                    break L65;
                  }
                }
                var8.field_nb = nr.a(new String[1], -1, bl.field_v);
                break L64;
              }
            }
            nd.field_c.field_nb = nr.a(new String[2], -1, qa.field_o);
            break L0;
          } else {
            break L0;
          }
        }
        L66: {
          L67: {
            stackOut_193_0 = so.field_k;
            stackIn_199_0 = stackOut_193_0;
            stackIn_194_0 = stackOut_193_0;
            if (!param2) {
              break L67;
            } else {
              stackOut_194_0 = (vh) (Object) stackIn_194_0;
              stackIn_199_0 = stackOut_194_0;
              stackIn_195_0 = stackOut_194_0;
              if (param1) {
                break L67;
              } else {
                stackOut_195_0 = (vh) (Object) stackIn_195_0;
                stackIn_196_0 = stackOut_195_0;
                stackOut_196_0 = (vh) (Object) stackIn_196_0;
                stackIn_199_0 = stackOut_196_0;
                stackIn_197_0 = stackOut_196_0;
                if (nr.field_bb) {
                  break L67;
                } else {
                  stackOut_197_0 = (vh) (Object) stackIn_197_0;
                  stackIn_198_0 = stackOut_197_0;
                  stackOut_198_0 = (vh) (Object) stackIn_198_0;
                  stackOut_198_1 = 1;
                  stackIn_200_0 = stackOut_198_0;
                  stackIn_200_1 = stackOut_198_1;
                  break L66;
                }
              }
            }
          }
          stackOut_199_0 = (vh) (Object) stackIn_199_0;
          stackOut_199_1 = 0;
          stackIn_200_0 = stackOut_199_0;
          stackIn_200_1 = stackOut_199_1;
          break L66;
        }
        L68: {
          L69: {
            ((vh) (Object) stackIn_200_0).a(stackIn_200_1 != 0, false);
            stackOut_200_0 = uq.field_f;
            stackIn_206_0 = stackOut_200_0;
            stackIn_201_0 = stackOut_200_0;
            if (!param2) {
              break L69;
            } else {
              stackOut_201_0 = (vh) (Object) stackIn_201_0;
              stackIn_206_0 = stackOut_201_0;
              stackIn_202_0 = stackOut_201_0;
              if (param1) {
                break L69;
              } else {
                stackOut_202_0 = (vh) (Object) stackIn_202_0;
                stackIn_203_0 = stackOut_202_0;
                stackOut_203_0 = (vh) (Object) stackIn_203_0;
                stackIn_206_0 = stackOut_203_0;
                stackIn_204_0 = stackOut_203_0;
                if (nr.field_bb) {
                  break L69;
                } else {
                  stackOut_204_0 = (vh) (Object) stackIn_204_0;
                  stackIn_205_0 = stackOut_204_0;
                  stackOut_205_0 = (vh) (Object) stackIn_205_0;
                  stackOut_205_1 = 1;
                  stackIn_207_0 = stackOut_205_0;
                  stackIn_207_1 = stackOut_205_1;
                  break L68;
                }
              }
            }
          }
          stackOut_206_0 = (vh) (Object) stackIn_206_0;
          stackOut_206_1 = 0;
          stackIn_207_0 = stackOut_206_0;
          stackIn_207_1 = stackOut_206_1;
          break L68;
        }
        L70: {
          L71: {
            ((vh) (Object) stackIn_207_0).a(stackIn_207_1 != 0, false);
            var5_int = 92 / ((0 - param3) / 63);
            stackOut_207_0 = de.field_b;
            stackIn_213_0 = stackOut_207_0;
            stackIn_208_0 = stackOut_207_0;
            if (!param2) {
              break L71;
            } else {
              stackOut_208_0 = (vh) (Object) stackIn_208_0;
              stackIn_213_0 = stackOut_208_0;
              stackIn_209_0 = stackOut_208_0;
              if (param1) {
                break L71;
              } else {
                stackOut_209_0 = (vh) (Object) stackIn_209_0;
                stackIn_210_0 = stackOut_209_0;
                stackOut_210_0 = (vh) (Object) stackIn_210_0;
                stackIn_213_0 = stackOut_210_0;
                stackIn_211_0 = stackOut_210_0;
                if (!nr.field_bb) {
                  break L71;
                } else {
                  stackOut_211_0 = (vh) (Object) stackIn_211_0;
                  stackIn_212_0 = stackOut_211_0;
                  stackOut_212_0 = (vh) (Object) stackIn_212_0;
                  stackOut_212_1 = 1;
                  stackIn_214_0 = stackOut_212_0;
                  stackIn_214_1 = stackOut_212_1;
                  break L70;
                }
              }
            }
          }
          stackOut_213_0 = (vh) (Object) stackIn_213_0;
          stackOut_213_1 = 0;
          stackIn_214_0 = stackOut_213_0;
          stackIn_214_1 = stackOut_213_1;
          break L70;
        }
        L72: {
          ((vh) (Object) stackIn_214_0).a(stackIn_214_1 != 0, false);
          na.field_e.field_i.c(true);
          if (null != em.field_L) {
            L73: {
              if (ok.field_ob.field_R == 0) {
                break L73;
              } else {
                nf.a(em.field_L.g(20872), true, param4);
                break L73;
              }
            }
            L74: {
              if (kc.field_b.field_R != 0) {
                nr.field_bb = true;
                break L74;
              } else {
                break L74;
              }
            }
            L75: {
              if ((d.field_c.field_R ^ -1) != -1) {
                em.field_N = true;
                break L75;
              } else {
                break L75;
              }
            }
            L76: {
              if (ba.field_vb.field_R != 0) {
                nr.field_bb = false;
                break L76;
              } else {
                break L76;
              }
            }
            tl.a(param4, em.field_L, 0, false);
            break L72;
          } else {
            break L72;
          }
        }
    }

    final static boolean a(int[] param0, int param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param1 == -13671) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        boolean discarded$2 = fe.a((int[]) null, 103, 77);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (-1 == (param0[param2 >> 56584869] & 1 << (param2 & 31) ^ -1)) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = 1;
                        stackIn_8_0 = stackOut_5_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = 0;
                        stackIn_8_0 = stackOut_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return stackIn_8_0 != 0;
                }
                case 9: {
                    var3 = (RuntimeException) (Object) caughtException;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    try {
                        stackOut_10_0 = (RuntimeException) var3;
                        stackOut_10_1 = new StringBuilder().append("fe.BA(");
                        stackIn_13_0 = stackOut_10_0;
                        stackIn_13_1 = stackOut_10_1;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        if (param0 == null) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                        stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
                        stackOut_11_2 = "{...}";
                        stackIn_14_0 = stackOut_11_0;
                        stackIn_14_1 = stackOut_11_1;
                        stackIn_14_2 = stackOut_11_2;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 13: {
                    stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                    stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                    stackOut_13_2 = "null";
                    stackIn_14_0 = stackOut_13_0;
                    stackIn_14_1 = stackOut_13_1;
                    stackIn_14_2 = stackOut_13_2;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    throw wm.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 44 + param2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void d(byte param0) {
        RuntimeException var2 = null;
        Object stackIn_9_0 = null;
        Object stackOut_8_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param0 == 99) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        field_J = true;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (((fe) this).field_K) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        ((fe) this).field_K = false;
                        if (((fe) this).field_t == null) {
                            statePc = 17;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = this;
                        stackIn_9_0 = stackOut_8_0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (((fe) this).field_t instanceof ik) {
                            statePc = 14;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        ((ik) (Object) ((fe) this).field_t).a(param0 ^ 17634, ((fe) this).field_K, (ei) this);
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw wm.a((Throwable) (Object) var2, "fe.CA(" + param0 + 41);
                }
                case 17: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    void a(ei param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int stackOut_1_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        super.a(param0, param1, param2, param3);
                        if (((fe) this).field_n == 0) {
                            statePc = 23;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        stackOut_1_0 = cd.field_b;
                        stackIn_2_0 = stackOut_1_0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((stackIn_2_0 ^ -1) != (((fe) this).field_n ^ -1)) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (!((fe) this).a(param2, param3, wn.field_i, -1, gg.field_f)) {
                            statePc = 15;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = cd.field_b;
                        stackIn_9_0 = stackOut_8_0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if ((stackIn_9_0 ^ -1) == -1) {
                            statePc = 14;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        ((fe) this).a(16, -param2 + wn.field_i, -param3 + gg.field_f, ((fe) this).field_n);
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
                        ((fe) this).a(param2, wn.field_i, param3, gg.field_f, (byte) 115, param0);
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    var5 = (RuntimeException) (Object) caughtException;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    try {
                        stackOut_18_0 = (RuntimeException) var5;
                        stackOut_18_1 = new StringBuilder().append("fe.S(");
                        stackIn_21_0 = stackOut_18_0;
                        stackIn_21_1 = stackOut_18_1;
                        stackIn_19_0 = stackOut_18_0;
                        stackIn_19_1 = stackOut_18_1;
                        if (param0 == null) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
                        stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
                        stackOut_19_2 = "{...}";
                        stackIn_22_0 = stackOut_19_0;
                        stackIn_22_1 = stackOut_19_1;
                        stackIn_22_2 = stackOut_19_2;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 20: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 21: {
                    stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
                    stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
                    stackOut_21_2 = "null";
                    stackIn_22_0 = stackOut_21_0;
                    stackIn_22_1 = stackOut_21_1;
                    stackIn_22_2 = stackOut_21_2;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    throw wm.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
                }
                case 23: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    boolean a(char param0, int param1, boolean param2, ei param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int stackOut_1_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (!param2) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        stackOut_1_0 = 0;
                        stackIn_2_0 = stackOut_1_0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return stackIn_2_0 != 0;
                }
                case 3: {
                    try {
                        if (!((fe) this).d(73)) {
                            statePc = 16;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = -85;
                        stackIn_5_0 = stackOut_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (stackIn_5_0 == (param1 ^ -1)) {
                            statePc = 14;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = -84;
                        stackIn_9_0 = stackOut_8_0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (stackIn_9_0 == (param1 ^ -1)) {
                            statePc = 14;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        ((fe) this).a(16, -1, -1, 1);
                        stackOut_14_0 = 1;
                        stackIn_15_0 = stackOut_14_0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 15: {
                    return stackIn_15_0 != 0;
                }
                case 16: {
                    try {
                        stackOut_16_0 = 0;
                        stackIn_17_0 = stackOut_16_0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 17: {
                    return stackIn_17_0 != 0;
                }
                case 18: {
                    var5 = (RuntimeException) (Object) caughtException;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    try {
                        stackOut_19_0 = (RuntimeException) var5;
                        stackOut_19_1 = new StringBuilder().append("fe.U(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
                        stackIn_22_0 = stackOut_19_0;
                        stackIn_22_1 = stackOut_19_1;
                        stackIn_20_0 = stackOut_19_0;
                        stackIn_20_1 = stackOut_19_1;
                        if (param3 == null) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
                        stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
                        stackOut_20_2 = "{...}";
                        stackIn_23_0 = stackOut_20_0;
                        stackIn_23_1 = stackOut_20_1;
                        stackIn_23_2 = stackOut_20_2;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 21: {
                    throw (RuntimeException) (Object) caughtException;
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
                    throw wm.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean d(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_1_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
        try {
          var2_int = 81 % ((param0 - 7) / 48);
          stackOut_0_0 = ((fe) this).field_K;
          stackIn_1_0 = stackOut_0_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          return stackIn_1_0;
        }
        return false;
    }

    boolean a(ei param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_2_0 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int stackOut_1_0 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_11_0 = null;
        int stackOut_18_0 = 0;
        int stackOut_20_0 = 0;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param2) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        stackOut_1_0 = 0;
                        stackIn_2_0 = stackOut_1_0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return stackIn_2_0 != 0;
                }
                case 3: {
                    try {
                        if (!((fe) this).field_I) {
                            statePc = 20;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = this;
                        stackIn_5_0 = stackOut_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (!((fe) this).a(param1, param5, param6, -1, param4)) {
                            statePc = 20;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        boolean discarded$2 = ((fe) this).a(param0, (byte) 122);
                        ((fe) this).field_n = param3;
                        if (((fe) this).field_t == null) {
                            statePc = 18;
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
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackOut_11_0 = this;
                        stackIn_12_0 = stackOut_11_0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (!(((fe) this).field_t instanceof bn)) {
                            statePc = 18;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        ((bn) (Object) ((fe) this).field_t).a((byte) -123, param5, (fe) this, param1, param3, param6, param4);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackOut_18_0 = 1;
                        stackIn_19_0 = stackOut_18_0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 19: {
                    return stackIn_19_0 != 0;
                }
                case 20: {
                    try {
                        stackOut_20_0 = 0;
                        stackIn_21_0 = stackOut_20_0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 21: {
                    return stackIn_21_0 != 0;
                }
                case 22: {
                    var8 = (RuntimeException) (Object) caughtException;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    try {
                        stackOut_23_0 = (RuntimeException) var8;
                        stackOut_23_1 = new StringBuilder().append("fe.AA(");
                        stackIn_26_0 = stackOut_23_0;
                        stackIn_26_1 = stackOut_23_1;
                        stackIn_24_0 = stackOut_23_0;
                        stackIn_24_1 = stackOut_23_1;
                        if (param0 == null) {
                            statePc = 26;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
                        stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
                        stackOut_24_2 = "{...}";
                        stackIn_27_0 = stackOut_24_0;
                        stackIn_27_1 = stackOut_24_1;
                        stackIn_27_2 = stackOut_24_2;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 25: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 26: {
                    stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
                    stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
                    stackOut_26_2 = "null";
                    stackIn_27_0 = stackOut_26_0;
                    stackIn_27_1 = stackOut_26_1;
                    stackIn_27_2 = stackOut_26_2;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    throw wm.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static String a(boolean param0, byte param1, CharSequence param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_6_0 = null;
        boolean stackIn_10_0 = false;
        String stackIn_15_0 = null;
        int stackIn_18_0 = 0;
        Object stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        String stackOut_5_0 = null;
        boolean stackOut_9_0 = false;
        String stackOut_14_0 = null;
        byte stackOut_17_0 = 0;
        Object stackOut_22_0 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = Pool.field_O;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3 = up.a(param0, param2, (byte) 117);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var3 != null) {
                            statePc = 5;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = (String) var3;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return stackIn_6_0;
                }
                case 7: {
                    try {
                        var4 = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (param2.length() <= var4) {
                            statePc = 17;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = uc.a(param2.charAt(var4), (byte) -51);
                        stackIn_18_0 = stackOut_9_0 ? 1 : 0;
                        stackIn_10_0 = stackOut_9_0;
                        if (var5 != 0) {
                            statePc = 18;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (!stackIn_10_0) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackOut_14_0 = iq.field_g;
                        stackIn_15_0 = stackOut_14_0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 15: {
                    return stackIn_15_0;
                }
                case 16: {
                    try {
                        var4++;
                        if (var5 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackOut_17_0 = param1;
                        stackIn_18_0 = stackOut_17_0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (stackIn_18_0 > 66) {
                            statePc = 22;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        fe.a(7, -120, (byte) 100, (java.awt.Canvas) null);
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackOut_22_0 = null;
                        stackIn_23_0 = stackOut_22_0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 23: {
                    return (String) (Object) stackIn_23_0;
                }
                case 24: {
                    var3_ref = (RuntimeException) (Object) caughtException;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    try {
                        stackOut_25_0 = (RuntimeException) var3_ref;
                        stackOut_25_1 = new StringBuilder().append("fe.DA(").append(param0).append(44).append(param1).append(44);
                        stackIn_28_0 = stackOut_25_0;
                        stackIn_28_1 = stackOut_25_1;
                        stackIn_26_0 = stackOut_25_0;
                        stackIn_26_1 = stackOut_25_1;
                        if (param2 == null) {
                            statePc = 28;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
                        stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
                        stackOut_26_2 = "{...}";
                        stackIn_29_0 = stackOut_26_0;
                        stackIn_29_1 = stackOut_26_1;
                        stackIn_29_2 = stackOut_26_2;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 27: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 28: {
                    stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
                    stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
                    stackOut_28_2 = "null";
                    stackIn_29_0 = stackOut_28_0;
                    stackIn_29_1 = stackOut_28_1;
                    stackIn_29_2 = stackOut_28_2;
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    throw wm.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final StringBuilder a(StringBuilder param0, int param1, Hashtable param2, int param3) {
        RuntimeException var5 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        Object stackOut_12_0 = null;
        StringBuilder stackOut_14_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (!((fe) this).b(param1, param2, param0, -1)) {
                            statePc = 11;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        ((fe) this).a(1, param2, param0, param1);
                        if (((fe) this).field_G) {
                            statePc = 6;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        StringBuilder discarded$3 = param0.append(" active");
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (((fe) this).field_I) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        StringBuilder discarded$4 = param0.append(" disabled");
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (param3 > 13) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = null;
                        stackIn_13_0 = stackOut_12_0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    return (StringBuilder) (Object) stackIn_13_0;
                }
                case 14: {
                    try {
                        stackOut_14_0 = (StringBuilder) param0;
                        stackIn_15_0 = stackOut_14_0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 15: {
                    return stackIn_15_0;
                }
                case 16: {
                    var5 = (RuntimeException) (Object) caughtException;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    try {
                        stackOut_17_0 = (RuntimeException) var5;
                        stackOut_17_1 = new StringBuilder().append("fe.EA(");
                        stackIn_20_0 = stackOut_17_0;
                        stackIn_20_1 = stackOut_17_1;
                        stackIn_18_0 = stackOut_17_0;
                        stackIn_18_1 = stackOut_17_1;
                        if (param0 == null) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                        stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
                        stackOut_18_2 = "{...}";
                        stackIn_21_0 = stackOut_18_0;
                        stackIn_21_1 = stackOut_18_1;
                        stackIn_21_2 = stackOut_18_2;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 19: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 20: {
                    stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
                    stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
                    stackOut_20_2 = "null";
                    stackIn_21_0 = stackOut_20_0;
                    stackIn_21_1 = stackOut_20_1;
                    stackIn_21_2 = stackOut_20_2;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    try {
                        stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
                        stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(44).append(param1).append(44);
                        stackIn_24_0 = stackOut_21_0;
                        stackIn_24_1 = stackOut_21_1;
                        stackIn_22_0 = stackOut_21_0;
                        stackIn_22_1 = stackOut_21_1;
                        if (param2 == null) {
                            statePc = 24;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
                        stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
                        stackOut_22_2 = "{...}";
                        stackIn_25_0 = stackOut_22_0;
                        stackIn_25_1 = stackOut_22_1;
                        stackIn_25_2 = stackOut_22_2;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 23: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 24: {
                    stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
                    stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
                    stackOut_24_2 = "null";
                    stackIn_25_0 = stackOut_24_0;
                    stackIn_25_1 = stackOut_24_1;
                    stackIn_25_2 = stackOut_24_2;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    throw wm.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param3 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void f(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          try {
            L0: {
              field_L = null;
              if (param0 == 72) {
                break L0;
              } else {
                field_J = false;
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          field_H = null;
          field_M = null;
        }
    }

    fe(String param0, cc param1) {
        this(param0, db.field_Sb.field_l, param1);
    }

    boolean a(ei param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        int stackIn_8_0 = 0;
        Object stackIn_11_0 = null;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        Object stackOut_1_0 = null;
        int stackOut_7_0 = 0;
        Object stackOut_10_0 = null;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (!((fe) this).field_I) {
                            statePc = 7;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        stackOut_1_0 = this;
                        stackIn_2_0 = stackOut_1_0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (!((fe) this).field_F) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = 0;
                        stackIn_8_0 = stackOut_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return stackIn_8_0 != 0;
                }
                case 9: {
                    try {
                        param0.d((byte) 99);
                        ((fe) this).field_K = true;
                        if (((fe) this).field_t == null) {
                            statePc = 17;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = this;
                        stackIn_11_0 = stackOut_10_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (!(((fe) this).field_t instanceof ik)) {
                            statePc = 17;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        ((ik) (Object) ((fe) this).field_t).a(17537, ((fe) this).field_K, (ei) this);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var3_int = 113 % ((param1 - -43) / 47);
                        stackOut_17_0 = 1;
                        stackIn_18_0 = stackOut_17_0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 18: {
                    return stackIn_18_0 != 0;
                }
                case 19: {
                    var3 = (RuntimeException) (Object) caughtException;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    try {
                        stackOut_20_0 = (RuntimeException) var3;
                        stackOut_20_1 = new StringBuilder().append("fe.M(");
                        stackIn_23_0 = stackOut_20_0;
                        stackIn_23_1 = stackOut_20_1;
                        stackIn_21_0 = stackOut_20_0;
                        stackIn_21_1 = stackOut_20_1;
                        if (param0 == null) {
                            statePc = 23;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
                        stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
                        stackOut_21_2 = "{...}";
                        stackIn_24_0 = stackOut_21_0;
                        stackIn_24_1 = stackOut_21_1;
                        stackIn_24_2 = stackOut_21_2;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 22: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 23: {
                    stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
                    stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
                    stackOut_23_2 = "null";
                    stackIn_24_0 = stackOut_23_0;
                    stackIn_24_1 = stackOut_23_1;
                    stackIn_24_2 = stackOut_23_2;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    throw wm.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 44 + param1 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    fe(String param0, fp param1, cc param2) {
        super(param0, param1, param2);
        ((fe) this).field_I = true;
        ((fe) this).field_F = true;
        ((fe) this).field_K = false;
    }

    protected fe() {
        ((fe) this).field_I = true;
        ((fe) this).field_F = true;
        ((fe) this).field_K = false;
        try {
            ((fe) this).field_z = db.field_Sb.field_k;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "fe.<init>()");
        }
    }

    final void a(int param0, int param1, int param2, int param3, byte param4, ei param5) {
        RuntimeException var7 = null;
        Object stackIn_2_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (null == ((fe) this).field_t) {
                            statePc = 8;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        stackOut_1_0 = this;
                        stackIn_2_0 = stackOut_1_0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (((fe) this).field_t instanceof bn) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        ((bn) (Object) ((fe) this).field_t).a(param3, (fe) this, param2, param0, -116, param1);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (param4 > 62) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        boolean discarded$2 = ((fe) this).a((ei) null, -88, true, 21, -27, 5, -59);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        ((fe) this).field_n = 0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    var7 = (RuntimeException) (Object) caughtException;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    try {
                        stackOut_15_0 = (RuntimeException) var7;
                        stackOut_15_1 = new StringBuilder().append("fe.E(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
                        stackIn_18_0 = stackOut_15_0;
                        stackIn_18_1 = stackOut_15_1;
                        stackIn_16_0 = stackOut_15_0;
                        stackIn_16_1 = stackOut_15_1;
                        if (param5 == null) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                        stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                        stackOut_16_2 = "{...}";
                        stackIn_19_0 = stackOut_16_0;
                        stackIn_19_1 = stackOut_16_1;
                        stackIn_19_2 = stackOut_16_2;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 18: {
                    stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                    stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
                    stackOut_18_2 = "null";
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    stackIn_19_2 = stackOut_18_2;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    throw wm.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
                }
                case 20: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = new boolean[64];
        field_L = new int[8192];
        field_J = true;
    }
}
