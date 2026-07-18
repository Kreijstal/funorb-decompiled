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
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            try {
              L1: {
                var4 = param3.getGraphics();
                sh.field_P.a(var4, param0, param1, -23820);
                var5 = 107 % ((-1 - param2) / 57);
                var4.dispose();
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var4_ref = (Exception) (Object) decompiledCaughtException;
                param3.repaint();
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L3: {
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4_ref2;
            stackOut_4_1 = new StringBuilder().append("fe.V(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param3 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L3;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 16) {
              L1: {
                if (null == ((fe) this).field_t) {
                  break L1;
                } else {
                  if (!(((fe) this).field_t instanceof tb)) {
                    break L1;
                  } else {
                    ((tb) (Object) ((fe) this).field_t).a(true, param2, param3, (fe) this, param1);
                    break L1;
                  }
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var5, "fe.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(boolean param0, boolean param1, boolean param2, int param3, int param4) {
        vh var5 = null;
        int var5_int = 0;
        vh var6 = null;
        vh var7 = null;
        vh var8 = null;
        String var9_ref_String = null;
        int var9 = 0;
        String var10_ref_String = null;
        int var10 = 0;
        int var11 = 0;
        Object var11_ref = null;
        int var12 = 0;
        int var13 = 0;
        String var13_ref_String = null;
        int[] var13_ref_int__ = null;
        int var14 = 0;
        String var14_ref_String = null;
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
                      if (~em.field_L.field_mc <= ~em.field_L.field_Nb) {
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
                          if (uf.field_jb != 1) {
                            break L7;
                          } else {
                            var10_ref_String = lo.field_b;
                            if (var19 == 0) {
                              break L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                        var10_ref_String = nr.a(new String[1], -1, hq.field_f);
                        break L6;
                      }
                      L8: {
                        if ((va.field_V & 16) != 0) {
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
                      kc.field_b.field_nb = kc.field_b.field_nb + "<br>" + var10_ref_String;
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
                            if (~var11 <= ~dr.field_c) {
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
                              if (var10 >= 2) {
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
                                                        stackOut_40_0 = ~var15;
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
                                                                if (~var17_int != ~var16) {
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
                                                        stackOut_57_0 = ~var16;
                                                        stackOut_57_1 = ~var14;
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
                            stackOut_68_0 = ~hq.field_i;
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
                                          var14_ref_String = "<col=A00000>" + ck.field_R[var13] + "</col>";
                                          if (var11_ref != null) {
                                            break L39;
                                          } else {
                                            var11_ref = (Object) (Object) var14_ref_String;
                                            if (var19 == 0) {
                                              break L38;
                                            } else {
                                              break L39;
                                            }
                                          }
                                        }
                                        var11_ref = (Object) (Object) ((String) var11_ref + ", " + var14_ref_String);
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
                              if (stackIn_88_0 != ~var10) {
                                L41: {
                                  var13_ref_String = aj.field_Rb;
                                  if (var12 == 0) {
                                    break L41;
                                  } else {
                                    var14_ref_String = ab.field_d + (String) var11_ref;
                                    if (var19 == 0) {
                                      break L40;
                                    } else {
                                      break L41;
                                    }
                                  }
                                }
                                var14_ref_String = nr.a(new String[1], -1, me.field_u);
                                break L40;
                              } else {
                                L42: {
                                  var13_ref_String = ah.field_g;
                                  if (var12 != 0) {
                                    break L42;
                                  } else {
                                    var14_ref_String = nr.a(new String[1], -1, fm.field_J);
                                    if (var19 == 0) {
                                      break L40;
                                    } else {
                                      break L42;
                                    }
                                  }
                                }
                                var14_ref_String = ud.field_M + (String) var11_ref;
                                break L40;
                              }
                            }
                            kk.field_B = "<col=A00000>" + var13_ref_String + "<br>" + var14_ref_String;
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
                          if (~dr.field_c >= ~var16) {
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
                                    if (~var13 < ~var18.field_Rb) {
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
                                    if (~var18.field_Xb > ~var14) {
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
                                    if (0 < (var15 & ~var18.field_Nb)) {
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
                              if (na.field_e.field_i.field_Mb == 0) {
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
              var9_ref_String = em.field_L.field_Ob;
              ii.field_e.field_nb = nr.a(new String[1], -1, th.field_c).toUpperCase();
              gi.field_o.b(-40 + uq.field_f.field_Db, 2147483647, 0, uq.field_f.field_gb, 40);
              gi.field_o.field_nb = nr.a(new String[1], -1, uh.field_s);
              var8 = gi.field_o;
              break L1;
            }
            L64: {
              if (fd.field_K == 0L) {
                break L64;
              } else {
                L65: {
                  var9 = (int)(-rl.a((byte) -94) + fd.field_K);
                  var9 = (999 + var9) / 1000;
                  if (var9 >= 1) {
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
              if (d.field_c.field_R != 0) {
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
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -13671) {
                break L1;
              } else {
                boolean discarded$2 = fe.a((int[]) null, 103, 77);
                break L1;
              }
            }
            L2: {
              if ((param0[param2 >> 56584869] & 1 << (param2 & 31)) == 0) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_7_0 = stackOut_4_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("fe.BA(");
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final void d(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 99) {
                break L1;
              } else {
                field_J = true;
                break L1;
              }
            }
            L2: {
              if (((fe) this).field_K) {
                ((fe) this).field_K = false;
                if (((fe) this).field_t == null) {
                  break L2;
                } else {
                  if (((fe) this).field_t instanceof ik) {
                    ((ik) (Object) ((fe) this).field_t).a(param0 ^ 17634, ((fe) this).field_K, (ei) this);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "fe.CA(" + param0 + ')');
        }
    }

    void a(ei param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, param3);
              if (((fe) this).field_n == 0) {
                break L1;
              } else {
                if (~cd.field_b != ~((fe) this).field_n) {
                  L2: {
                    if (!((fe) this).a(param2, param3, wn.field_i, -1, gg.field_f)) {
                      break L2;
                    } else {
                      if (cd.field_b == 0) {
                        ((fe) this).a(16, -param2 + wn.field_i, -param3 + gg.field_f, ((fe) this).field_n);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  ((fe) this).a(param2, wn.field_i, param3, gg.field_f, (byte) 115, param0);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var5;
            stackOut_15_1 = new StringBuilder().append("fe.S(");
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    boolean a(char param0, int param1, boolean param2, ei param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            if (!param2) {
              L1: {
                if (!((fe) this).d(73)) {
                  break L1;
                } else {
                  L2: {
                    if (param1 == 84) {
                      break L2;
                    } else {
                      if (param1 == 83) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                  ((fe) this).a(16, -1, -1, 1);
                  stackOut_12_0 = 1;
                  stackIn_13_0 = stackOut_12_0;
                  return stackIn_13_0 != 0;
                }
              }
              stackOut_14_0 = 0;
              stackIn_15_0 = stackOut_14_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var5;
            stackOut_16_1 = new StringBuilder().append("fe.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ')');
        }
        return stackIn_15_0 != 0;
    }

    final boolean d(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_1_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
        try {
          L0: {
            var2_int = 81 % ((param0 - 7) / 48);
            stackOut_0_0 = ((fe) this).field_K;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "fe.W(" + param0 + ')');
        }
        return stackIn_1_0;
    }

    boolean a(ei param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            if (param2) {
              L1: {
                if (!((fe) this).field_I) {
                  break L1;
                } else {
                  if (!((fe) this).a(param1, param5, param6, -1, param4)) {
                    break L1;
                  } else {
                    L2: {
                      boolean discarded$2 = ((fe) this).a(param0, (byte) 122);
                      ((fe) this).field_n = param3;
                      if (((fe) this).field_t == null) {
                        break L2;
                      } else {
                        if (!(((fe) this).field_t instanceof bn)) {
                          break L2;
                        } else {
                          ((bn) (Object) ((fe) this).field_t).a((byte) -123, param5, (fe) this, param1, param3, param6, param4);
                          break L2;
                        }
                      }
                    }
                    stackOut_15_0 = 1;
                    stackIn_16_0 = stackOut_15_0;
                    return stackIn_16_0 != 0;
                  }
                }
              }
              stackOut_17_0 = 0;
              stackIn_18_0 = stackOut_17_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var8;
            stackOut_19_1 = new StringBuilder().append("fe.AA(");
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L3;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_18_0 != 0;
    }

    final static String a(boolean param0, byte param1, CharSequence param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_5_0 = null;
        boolean stackIn_9_0 = false;
        String stackIn_14_0 = null;
        int stackIn_17_0 = 0;
        Object stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_4_0 = null;
        boolean stackOut_8_0 = false;
        String stackOut_13_0 = null;
        byte stackOut_16_0 = 0;
        Object stackOut_20_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var5 = Pool.field_O;
        try {
          L0: {
            var3 = up.a(param0, param2, (byte) 117);
            if (var3 != null) {
              stackOut_4_0 = (String) var3;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              var4 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (param2.length() <= var4) {
                      break L3;
                    } else {
                      stackOut_8_0 = uc.a(param2.charAt(var4), (byte) -51);
                      stackIn_17_0 = stackOut_8_0 ? 1 : 0;
                      stackIn_9_0 = stackOut_8_0;
                      if (var5 != 0) {
                        break L2;
                      } else {
                        if (!stackIn_9_0) {
                          stackOut_13_0 = iq.field_g;
                          stackIn_14_0 = stackOut_13_0;
                          return stackIn_14_0;
                        } else {
                          var4++;
                          if (var5 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  stackOut_16_0 = param1;
                  stackIn_17_0 = stackOut_16_0;
                  break L2;
                }
                L4: {
                  if (stackIn_17_0 > 66) {
                    break L4;
                  } else {
                    fe.a(7, -120, (byte) 100, (java.awt.Canvas) null);
                    break L4;
                  }
                }
                stackOut_20_0 = null;
                stackIn_21_0 = stackOut_20_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var3_ref;
            stackOut_22_1 = new StringBuilder().append("fe.DA(").append(param0).append(',').append(param1).append(',');
            stackIn_25_0 = stackOut_22_0;
            stackIn_25_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L5;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L5;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ')');
        }
        return (String) (Object) stackIn_21_0;
    }

    final StringBuilder a(StringBuilder param0, int param1, Hashtable param2, int param3) {
        RuntimeException var5 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_13_0 = null;
        Object stackOut_11_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            L1: {
              if (!((fe) this).b(param1, param2, param0, -1)) {
                break L1;
              } else {
                L2: {
                  ((fe) this).a(1, param2, param0, param1);
                  if (((fe) this).field_G) {
                    StringBuilder discarded$3 = param0.append(" active");
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if (((fe) this).field_I) {
                  break L1;
                } else {
                  StringBuilder discarded$4 = param0.append(" disabled");
                  break L1;
                }
              }
            }
            if (param3 > 13) {
              stackOut_13_0 = (StringBuilder) param0;
              stackIn_14_0 = stackOut_13_0;
              break L0;
            } else {
              stackOut_11_0 = null;
              stackIn_12_0 = stackOut_11_0;
              return (StringBuilder) (Object) stackIn_12_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var5;
            stackOut_15_1 = new StringBuilder().append("fe.EA(");
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L3;
            }
          }
          L4: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param1).append(',');
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L4;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L4;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param3 + ')');
        }
        return stackIn_14_0;
    }

    public static void f(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_L = null;
              if (param0 == 72) {
                break L1;
              } else {
                field_J = false;
                break L1;
              }
            }
            field_H = null;
            field_M = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var1, "fe.FA(" + param0 + ')');
        }
    }

    fe(String param0, cc param1) {
        this(param0, db.field_Sb.field_l, param1);
    }

    boolean a(ei param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              if (!((fe) this).field_I) {
                break L1;
              } else {
                if (!((fe) this).field_F) {
                  break L1;
                } else {
                  L2: {
                    param0.d((byte) 99);
                    ((fe) this).field_K = true;
                    if (((fe) this).field_t == null) {
                      break L2;
                    } else {
                      if (!(((fe) this).field_t instanceof ik)) {
                        break L2;
                      } else {
                        ((ik) (Object) ((fe) this).field_t).a(17537, ((fe) this).field_K, (ei) this);
                        break L2;
                      }
                    }
                  }
                  var3_int = 113 % ((param1 - -43) / 47);
                  stackOut_14_0 = 1;
                  stackIn_15_0 = stackOut_14_0;
                  break L0;
                }
              }
            }
            stackOut_6_0 = 0;
            stackIn_7_0 = stackOut_6_0;
            return stackIn_7_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3;
            stackOut_16_1 = new StringBuilder().append("fe.M(");
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param1 + ')');
        }
        return stackIn_15_0 != 0;
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
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              if (null == ((fe) this).field_t) {
                break L1;
              } else {
                if (((fe) this).field_t instanceof bn) {
                  ((bn) (Object) ((fe) this).field_t).a(param3, (fe) this, param2, param0, -116, param1);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param4 > 62) {
                break L2;
              } else {
                boolean discarded$2 = ((fe) this).a((ei) null, -88, true, 21, -27, 5, -59);
                break L2;
              }
            }
            ((fe) this).field_n = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var7;
            stackOut_12_1 = new StringBuilder().append("fe.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param5 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
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
