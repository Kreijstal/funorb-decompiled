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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        Throwable decompiledCaughtException = null;
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
            stackOut_4_1 = new StringBuilder().append("fe.V(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param3 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L3;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        if (param0 != 16) {
            return;
        }
        if (null != ((fe) this).field_t) {
            if (((fe) this).field_t instanceof tb) {
                ((tb) (Object) ((fe) this).field_t).a(true, param2, param3, (fe) this, param1);
            }
        }
    }

    final static void a(boolean param0, boolean param1, boolean param2, int param3, int param4) {
        RuntimeException var5 = null;
        vh var5_ref = null;
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
        Object var18 = null;
        im var18_ref = null;
        int var18_int = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        String var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        vh stackIn_18_0 = null;
        vh stackIn_19_0 = null;
        vh stackIn_20_0 = null;
        vh stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackIn_63_0 = 0;
        int stackIn_67_0 = 0;
        boolean stackIn_76_0 = false;
        int stackIn_83_0 = 0;
        boolean stackIn_131_0 = false;
        int stackIn_150_0 = 0;
        vh stackIn_170_0 = null;
        vh stackIn_171_0 = null;
        vh stackIn_172_0 = null;
        vh stackIn_173_0 = null;
        vh stackIn_174_0 = null;
        int stackIn_174_1 = 0;
        vh stackIn_175_0 = null;
        vh stackIn_176_0 = null;
        vh stackIn_177_0 = null;
        vh stackIn_178_0 = null;
        vh stackIn_179_0 = null;
        int stackIn_179_1 = 0;
        vh stackIn_180_0 = null;
        vh stackIn_181_0 = null;
        vh stackIn_182_0 = null;
        vh stackIn_183_0 = null;
        vh stackIn_184_0 = null;
        int stackIn_184_1 = 0;
        RuntimeException decompiledCaughtException = null;
        vh stackOut_17_0 = null;
        vh stackOut_18_0 = null;
        vh stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        vh stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        int stackOut_37_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_55_1 = 0;
        int stackOut_62_0 = 0;
        int stackOut_66_0 = 0;
        boolean stackOut_75_0 = false;
        int stackOut_82_0 = 0;
        boolean stackOut_130_0 = false;
        int stackOut_149_0 = 0;
        vh stackOut_169_0 = null;
        vh stackOut_170_0 = null;
        vh stackOut_171_0 = null;
        vh stackOut_172_0 = null;
        int stackOut_172_1 = 0;
        vh stackOut_173_0 = null;
        int stackOut_173_1 = 0;
        vh stackOut_174_0 = null;
        vh stackOut_175_0 = null;
        vh stackOut_176_0 = null;
        vh stackOut_177_0 = null;
        int stackOut_177_1 = 0;
        vh stackOut_178_0 = null;
        int stackOut_178_1 = 0;
        vh stackOut_179_0 = null;
        vh stackOut_180_0 = null;
        vh stackOut_181_0 = null;
        vh stackOut_182_0 = null;
        int stackOut_182_1 = 0;
        vh stackOut_183_0 = null;
        int stackOut_183_1 = 0;
        var18 = null;
        var19 = Pool.field_O;
        try {
          L0: {
            L1: {
              fr.a((byte) -58, nj.field_b);
              if (null != em.field_L) {
                L2: {
                  L3: {
                    ok.field_ob.field_pb = true;
                    kc.field_b.field_Db = 0;
                    var5_ref = kc.field_b;
                    var5_ref.field_gb = 0;
                    d.field_c.field_Db = 0;
                    var6 = d.field_c;
                    var6.field_gb = 0;
                    gi.field_o.field_Db = 0;
                    var7 = gi.field_o;
                    var7.field_gb = 0;
                    if (!cj.e((byte) 85)) {
                      break L3;
                    } else {
                      L4: {
                        L5: {
                          ii.field_e.field_nb = rf.field_b.toUpperCase();
                          var9 = (2 + uq.field_f.field_gb) / 2;
                          kc.field_b.b(uq.field_f.field_Db + -40, 2147483647, 0, var9 - 2, 40);
                          if (~em.field_L.field_mc <= ~em.field_L.field_Nb) {
                            break L5;
                          } else {
                            kc.field_b.field_nb = v.field_d.toUpperCase();
                            kc.field_b.field_pb = true;
                            if (var19 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        kc.field_b.field_nb = ro.field_p.toUpperCase();
                        kc.field_b.field_pb = false;
                        break L4;
                      }
                      L6: {
                        kc.field_b.field_F = mg.field_c.field_F;
                        if (uf.field_jb > 0) {
                          L7: {
                            L8: {
                              if (uf.field_jb != 1) {
                                break L8;
                              } else {
                                var10_ref_String = lo.field_b;
                                if (var19 == 0) {
                                  break L7;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            var10_ref_String = nr.a(new String[1], -1, hq.field_f);
                            break L7;
                          }
                          L9: {
                            if ((va.field_V & 16) != 0) {
                              break L9;
                            } else {
                              if (nr.field_bb) {
                                break L9;
                              } else {
                                kc.field_b.field_F = mg.field_c.field_Gb;
                                break L9;
                              }
                            }
                          }
                          kc.field_b.field_nb = kc.field_b.field_nb + "<br>" + var10_ref_String;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      L10: {
                        L11: {
                          d.field_c.b(uq.field_f.field_Db - 40, 2147483647, var9, -var9 + uq.field_f.field_gb, 40);
                          d.field_c.field_nb = ua.field_s.toUpperCase();
                          var8 = d.field_c;
                          stackOut_17_0 = d.field_c;
                          stackIn_20_0 = stackOut_17_0;
                          stackIn_18_0 = stackOut_17_0;
                          if (!param0) {
                            break L11;
                          } else {
                            stackOut_18_0 = (vh) (Object) stackIn_18_0;
                            stackIn_20_0 = stackOut_18_0;
                            stackIn_19_0 = stackOut_18_0;
                            if (fd.field_K != 0L) {
                              break L11;
                            } else {
                              stackOut_19_0 = (vh) (Object) stackIn_19_0;
                              stackOut_19_1 = 1;
                              stackIn_21_0 = stackOut_19_0;
                              stackIn_21_1 = stackOut_19_1;
                              break L10;
                            }
                          }
                        }
                        stackOut_20_0 = (vh) (Object) stackIn_20_0;
                        stackOut_20_1 = 0;
                        stackIn_21_0 = stackOut_20_0;
                        stackIn_21_1 = stackOut_20_1;
                        break L10;
                      }
                      L12: {
                        stackIn_21_0.field_pb = stackIn_21_1 != 0;
                        var10 = 2;
                        if (we.field_m != null) {
                          L13: {
                            if (null != dk.field_j) {
                              break L13;
                            } else {
                              dk.field_j = new byte[dr.field_c];
                              gf.field_b = new boolean[dr.field_c];
                              break L13;
                            }
                          }
                          var11 = 0;
                          L14: while (true) {
                            L15: {
                              L16: {
                                if (~var11 <= ~dr.field_c) {
                                  break L16;
                                } else {
                                  gf.field_b[var11] = false;
                                  var11++;
                                  if (var19 != 0) {
                                    break L15;
                                  } else {
                                    if (var19 == 0) {
                                      continue L14;
                                    } else {
                                      break L16;
                                    }
                                  }
                                }
                              }
                              var10 = 0;
                              break L15;
                            }
                            L17: while (true) {
                              L18: {
                                L19: {
                                  if (var10 >= 2) {
                                    break L19;
                                  } else {
                                    var11 = 0;
                                    stackOut_33_0 = 0;
                                    stackIn_67_0 = stackOut_33_0;
                                    stackIn_34_0 = stackOut_33_0;
                                    if (var19 != 0) {
                                      break L18;
                                    } else {
                                      var12 = stackIn_34_0;
                                      L20: while (true) {
                                        stackOut_35_0 = var12;
                                        stackOut_35_1 = we.field_m.length;
                                        stackIn_36_0 = stackOut_35_0;
                                        stackIn_36_1 = stackOut_35_1;
                                        L21: while (true) {
                                          L22: {
                                            L23: {
                                              if (stackIn_36_0 >= stackIn_36_1) {
                                                break L23;
                                              } else {
                                                var25 = we.field_m[var12];
                                                var24 = var25;
                                                var23 = var24;
                                                var21 = var23;
                                                var20 = var21;
                                                var13_ref_int__ = var20;
                                                stackOut_37_0 = 0;
                                                stackIn_63_0 = stackOut_37_0;
                                                stackIn_38_0 = stackOut_37_0;
                                                if (var19 != 0) {
                                                  break L22;
                                                } else {
                                                  var14 = stackIn_38_0;
                                                  L24: while (true) {
                                                    L25: {
                                                      L26: {
                                                        L27: {
                                                          if (var25.length <= var14) {
                                                            break L27;
                                                          } else {
                                                            var15 = var25[var14];
                                                            var16 = var20[1 + var14];
                                                            stackOut_40_0 = ~var15;
                                                            stackIn_53_0 = stackOut_40_0;
                                                            stackIn_41_0 = stackOut_40_0;
                                                            if (var19 != 0) {
                                                              break L26;
                                                            } else {
                                                              L28: {
                                                                L29: {
                                                                  if (stackIn_41_0 != 0) {
                                                                    break L29;
                                                                  } else {
                                                                    L30: {
                                                                      if (0 == var10) {
                                                                        stackOut_44_0 = em.field_L.field_Nb;
                                                                        stackIn_45_0 = stackOut_44_0;
                                                                        break L30;
                                                                      } else {
                                                                        stackOut_43_0 = em.field_L.field_mc;
                                                                        stackIn_45_0 = stackOut_43_0;
                                                                        break L30;
                                                                      }
                                                                    }
                                                                    var17_int = stackIn_45_0;
                                                                    if (~var17_int != ~var16) {
                                                                      break L25;
                                                                    } else {
                                                                      if (var19 == 0) {
                                                                        break L28;
                                                                      } else {
                                                                        break L29;
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                                if (var16 != (em.field_L.field_tc[var15] & 255)) {
                                                                  break L25;
                                                                } else {
                                                                  break L28;
                                                                }
                                                              }
                                                              var14 += 2;
                                                              if (var19 == 0) {
                                                                continue L24;
                                                              } else {
                                                                break L27;
                                                              }
                                                            }
                                                          }
                                                        }
                                                        var11 = 1;
                                                        var14 = -1;
                                                        stackOut_52_0 = 0;
                                                        stackIn_53_0 = stackOut_52_0;
                                                        break L26;
                                                      }
                                                      var15 = stackIn_53_0;
                                                      L31: while (true) {
                                                        L32: {
                                                          if (var25.length <= var15) {
                                                            break L32;
                                                          } else {
                                                            var16 = var25[var15];
                                                            stackOut_55_0 = ~var16;
                                                            stackOut_55_1 = ~var14;
                                                            stackIn_36_0 = stackOut_55_0;
                                                            stackIn_36_1 = stackOut_55_1;
                                                            stackIn_56_0 = stackOut_55_0;
                                                            stackIn_56_1 = stackOut_55_1;
                                                            if (var19 != 0) {
                                                              continue L21;
                                                            } else {
                                                              L33: {
                                                                if (stackIn_56_0 < stackIn_56_1) {
                                                                  var14 = var16;
                                                                  break L33;
                                                                } else {
                                                                  break L33;
                                                                }
                                                              }
                                                              var15 += 2;
                                                              if (var19 == 0) {
                                                                continue L31;
                                                              } else {
                                                                break L32;
                                                              }
                                                            }
                                                          }
                                                        }
                                                        gf.field_b[var14] = true;
                                                        break L25;
                                                      }
                                                    }
                                                    var12++;
                                                    if (var19 == 0) {
                                                      continue L20;
                                                    } else {
                                                      break L23;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            stackOut_62_0 = var11;
                                            stackIn_63_0 = stackOut_62_0;
                                            break L22;
                                          }
                                          if (stackIn_63_0 != 0) {
                                            break L19;
                                          } else {
                                            var10++;
                                            if (var19 == 0) {
                                              continue L17;
                                            } else {
                                              break L19;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                stackOut_66_0 = ~hq.field_i;
                                stackIn_67_0 = stackOut_66_0;
                                break L18;
                              }
                              if (stackIn_67_0 > -3) {
                                break L12;
                              } else {
                                if (!vj.field_c[12]) {
                                  break L12;
                                } else {
                                  var10 = 2;
                                  break L12;
                                }
                              }
                            }
                          }
                        } else {
                          break L12;
                        }
                      }
                      L34: {
                        L35: {
                          if (var10 >= 2) {
                            break L35;
                          } else {
                            d.field_c.field_pb = false;
                            if (d.field_c.field_db) {
                              var11_ref = null;
                              var12 = 0;
                              var13 = 0;
                              L36: while (true) {
                                L37: {
                                  L38: {
                                    if (var13 >= dr.field_c) {
                                      break L38;
                                    } else {
                                      stackOut_75_0 = gf.field_b[var13];
                                      stackIn_83_0 = stackOut_75_0 ? 1 : 0;
                                      stackIn_76_0 = stackOut_75_0;
                                      if (var19 != 0) {
                                        break L37;
                                      } else {
                                        L39: {
                                          if (stackIn_76_0) {
                                            L40: {
                                              var22 = "<col=A00000>" + ck.field_R[var13] + "</col>";
                                              if (var11_ref != null) {
                                                break L40;
                                              } else {
                                                var11_ref = (Object) (Object) var22;
                                                if (var19 == 0) {
                                                  break L39;
                                                } else {
                                                  break L40;
                                                }
                                              }
                                            }
                                            var11_ref = (Object) (Object) (var11_ref + ", " + var22);
                                            var12 = 1;
                                            break L39;
                                          } else {
                                            break L39;
                                          }
                                        }
                                        var13++;
                                        if (var19 == 0) {
                                          continue L36;
                                        } else {
                                          break L38;
                                        }
                                      }
                                    }
                                  }
                                  stackOut_82_0 = -1;
                                  stackIn_83_0 = stackOut_82_0;
                                  break L37;
                                }
                                L41: {
                                  if (stackIn_83_0 != ~var10) {
                                    L42: {
                                      var13_ref_String = aj.field_Rb;
                                      if (var12 == 0) {
                                        break L42;
                                      } else {
                                        var14_ref_String = ab.field_d + var11_ref;
                                        if (var19 == 0) {
                                          break L41;
                                        } else {
                                          break L42;
                                        }
                                      }
                                    }
                                    var14_ref_String = nr.a(new String[1], -1, me.field_u);
                                    break L41;
                                  } else {
                                    L43: {
                                      var13_ref_String = ah.field_g;
                                      if (var12 != 0) {
                                        break L43;
                                      } else {
                                        var14_ref_String = nr.a(new String[1], -1, fm.field_J);
                                        if (var19 == 0) {
                                          break L41;
                                        } else {
                                          break L43;
                                        }
                                      }
                                    }
                                    var14_ref_String = ud.field_M + var11_ref;
                                    break L41;
                                  }
                                }
                                kk.field_B = "<col=A00000>" + var13_ref_String + "<br>" + var14_ref_String;
                                if (var19 == 0) {
                                  break L34;
                                } else {
                                  break L35;
                                }
                              }
                            } else {
                              break L34;
                            }
                          }
                        }
                        L44: {
                          if (null != dl.field_j) {
                            break L44;
                          } else {
                            if (null != ci.field_d) {
                              break L44;
                            } else {
                              if (w.field_j != null) {
                                break L44;
                              } else {
                                if (null != op.field_a) {
                                  break L44;
                                } else {
                                  break L34;
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
                        L45: while (true) {
                          L46: {
                            L47: {
                              if (~dr.field_c >= ~var16) {
                                break L47;
                              } else {
                                var17_int = em.field_L.field_tc[var16] & 255;
                                if (var19 != 0) {
                                  break L46;
                                } else {
                                  L48: {
                                    if (dl.field_j == null) {
                                      break L48;
                                    } else {
                                      if (null != dl.field_j[var16]) {
                                        if (dl.field_j[var16][var17_int]) {
                                          var11 = 1;
                                          break L48;
                                        } else {
                                          break L48;
                                        }
                                      } else {
                                        break L48;
                                      }
                                    }
                                  }
                                  L49: {
                                    if (ci.field_d == null) {
                                      break L49;
                                    } else {
                                      if (null != ci.field_d[var16]) {
                                        L50: {
                                          var18_int = ci.field_d[var16][var17_int];
                                          if (var18_int > var13) {
                                            var13 = var18_int;
                                            break L50;
                                          } else {
                                            break L50;
                                          }
                                        }
                                        if (var18_int == 0) {
                                          break L49;
                                        } else {
                                          if (!rg.field_s) {
                                            var11 = 1;
                                            break L49;
                                          } else {
                                            break L49;
                                          }
                                        }
                                      } else {
                                        break L49;
                                      }
                                    }
                                  }
                                  L51: {
                                    if (op.field_a == null) {
                                      break L51;
                                    } else {
                                      if (op.field_a[var16] != null) {
                                        var15 = var15 | op.field_a[var16][var17_int];
                                        break L51;
                                      } else {
                                        break L51;
                                      }
                                    }
                                  }
                                  L52: {
                                    if (null == w.field_j) {
                                      break L52;
                                    } else {
                                      if (w.field_j[var16] == null) {
                                        break L52;
                                      } else {
                                        L53: {
                                          var18_int = w.field_j[var16][var17_int];
                                          if (var18_int <= var14) {
                                            break L53;
                                          } else {
                                            var14 = var18_int;
                                            break L53;
                                          }
                                        }
                                        if (0 == var18_int) {
                                          break L52;
                                        } else {
                                          if (rg.field_s) {
                                            break L52;
                                          } else {
                                            var11 = 1;
                                            break L52;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  var16++;
                                  if (var19 == 0) {
                                    continue L45;
                                  } else {
                                    break L47;
                                  }
                                }
                              }
                            }
                            var16 = 0;
                            break L46;
                          }
                          var17 = wo.field_f.field_Rb.field_T;
                          var18_ref = (im) (Object) var17.c((byte) 96);
                          L54: while (true) {
                            L55: {
                              L56: {
                                if (var18_ref == null) {
                                  break L56;
                                } else {
                                  stackOut_130_0 = var18_ref.c(true);
                                  stackIn_150_0 = stackOut_130_0 ? 1 : 0;
                                  stackIn_131_0 = stackOut_130_0;
                                  if (var19 != 0) {
                                    break L55;
                                  } else {
                                    L57: {
                                      L58: {
                                        if (!stackIn_131_0) {
                                          break L58;
                                        } else {
                                          if (var19 == 0) {
                                            break L57;
                                          } else {
                                            break L58;
                                          }
                                        }
                                      }
                                      L59: {
                                        if (var11 == 0) {
                                          break L59;
                                        } else {
                                          if (var18_ref.field_Pb) {
                                            break L59;
                                          } else {
                                            var16 = 1;
                                            if (var19 == 0) {
                                              break L56;
                                            } else {
                                              break L59;
                                            }
                                          }
                                        }
                                      }
                                      L60: {
                                        if (~var13 < ~var18_ref.field_Rb) {
                                          var16 = 1;
                                          if (var19 == 0) {
                                            break L56;
                                          } else {
                                            break L60;
                                          }
                                        } else {
                                          break L60;
                                        }
                                      }
                                      L61: {
                                        if (~var18_ref.field_Xb > ~var14) {
                                          var16 = 1;
                                          if (var19 == 0) {
                                            break L56;
                                          } else {
                                            break L61;
                                          }
                                        } else {
                                          break L61;
                                        }
                                      }
                                      L62: {
                                        if (0 < (var15 & ~var18_ref.field_Nb)) {
                                          var16 = 1;
                                          if (var19 == 0) {
                                            break L56;
                                          } else {
                                            break L62;
                                          }
                                        } else {
                                          break L62;
                                        }
                                      }
                                      if (var12 == 0) {
                                        break L57;
                                      } else {
                                        var16 = 1;
                                        if (var19 == 0) {
                                          break L56;
                                        } else {
                                          break L57;
                                        }
                                      }
                                    }
                                    var18_ref = (im) (Object) var17.f((byte) -5);
                                    if (var19 == 0) {
                                      continue L54;
                                    } else {
                                      break L56;
                                    }
                                  }
                                }
                              }
                              stackOut_149_0 = hq.field_i;
                              stackIn_150_0 = stackOut_149_0;
                              break L55;
                            }
                            L63: {
                              if (stackIn_150_0 < 2) {
                                break L63;
                              } else {
                                if (vj.field_c[12]) {
                                  var16 = 0;
                                  break L63;
                                } else {
                                  break L63;
                                }
                              }
                            }
                            if (var16 != 0) {
                              d.field_c.field_pb = false;
                              if (d.field_c.field_db) {
                                L64: {
                                  if (na.field_e.field_i.field_Mb == 0) {
                                    break L64;
                                  } else {
                                    kk.field_B = nr.a(new String[1], -1, t.field_c);
                                    if (var19 == 0) {
                                      break L34;
                                    } else {
                                      break L64;
                                    }
                                  }
                                }
                                kk.field_B = fn.field_Mb;
                                break L34;
                              } else {
                                break L34;
                              }
                            } else {
                              break L34;
                            }
                          }
                        }
                      }
                      if (var19 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var9_ref_String = em.field_L.field_Ob;
                  ii.field_e.field_nb = nr.a(new String[1], -1, th.field_c).toUpperCase();
                  gi.field_o.b(-40 + uq.field_f.field_Db, 2147483647, 0, uq.field_f.field_gb, 40);
                  gi.field_o.field_nb = nr.a(new String[1], -1, uh.field_s);
                  var8 = gi.field_o;
                  break L2;
                }
                L65: {
                  if (fd.field_K == 0L) {
                    break L65;
                  } else {
                    L66: {
                      var9 = (int)(-rl.a((byte) -94) + fd.field_K);
                      var9 = (999 + var9) / 1000;
                      if (var9 >= 1) {
                        break L66;
                      } else {
                        var9 = 1;
                        break L66;
                      }
                    }
                    var8.field_nb = nr.a(new String[1], -1, bl.field_v);
                    break L65;
                  }
                }
                nd.field_c.field_nb = nr.a(new String[2], -1, qa.field_o);
                break L1;
              } else {
                break L1;
              }
            }
            L67: {
              L68: {
                stackOut_169_0 = so.field_k;
                stackIn_173_0 = stackOut_169_0;
                stackIn_170_0 = stackOut_169_0;
                if (!param2) {
                  break L68;
                } else {
                  stackOut_170_0 = (vh) (Object) stackIn_170_0;
                  stackIn_173_0 = stackOut_170_0;
                  stackIn_171_0 = stackOut_170_0;
                  if (param1) {
                    break L68;
                  } else {
                    stackOut_171_0 = (vh) (Object) stackIn_171_0;
                    stackIn_173_0 = stackOut_171_0;
                    stackIn_172_0 = stackOut_171_0;
                    if (nr.field_bb) {
                      break L68;
                    } else {
                      stackOut_172_0 = (vh) (Object) stackIn_172_0;
                      stackOut_172_1 = 1;
                      stackIn_174_0 = stackOut_172_0;
                      stackIn_174_1 = stackOut_172_1;
                      break L67;
                    }
                  }
                }
              }
              stackOut_173_0 = (vh) (Object) stackIn_173_0;
              stackOut_173_1 = 0;
              stackIn_174_0 = stackOut_173_0;
              stackIn_174_1 = stackOut_173_1;
              break L67;
            }
            L69: {
              L70: {
                ((vh) (Object) stackIn_174_0).a(stackIn_174_1 != 0, false);
                stackOut_174_0 = uq.field_f;
                stackIn_178_0 = stackOut_174_0;
                stackIn_175_0 = stackOut_174_0;
                if (!param2) {
                  break L70;
                } else {
                  stackOut_175_0 = (vh) (Object) stackIn_175_0;
                  stackIn_178_0 = stackOut_175_0;
                  stackIn_176_0 = stackOut_175_0;
                  if (param1) {
                    break L70;
                  } else {
                    stackOut_176_0 = (vh) (Object) stackIn_176_0;
                    stackIn_178_0 = stackOut_176_0;
                    stackIn_177_0 = stackOut_176_0;
                    if (nr.field_bb) {
                      break L70;
                    } else {
                      stackOut_177_0 = (vh) (Object) stackIn_177_0;
                      stackOut_177_1 = 1;
                      stackIn_179_0 = stackOut_177_0;
                      stackIn_179_1 = stackOut_177_1;
                      break L69;
                    }
                  }
                }
              }
              stackOut_178_0 = (vh) (Object) stackIn_178_0;
              stackOut_178_1 = 0;
              stackIn_179_0 = stackOut_178_0;
              stackIn_179_1 = stackOut_178_1;
              break L69;
            }
            L71: {
              L72: {
                ((vh) (Object) stackIn_179_0).a(stackIn_179_1 != 0, false);
                var5_int = 92 / ((0 - param3) / 63);
                stackOut_179_0 = de.field_b;
                stackIn_183_0 = stackOut_179_0;
                stackIn_180_0 = stackOut_179_0;
                if (!param2) {
                  break L72;
                } else {
                  stackOut_180_0 = (vh) (Object) stackIn_180_0;
                  stackIn_183_0 = stackOut_180_0;
                  stackIn_181_0 = stackOut_180_0;
                  if (param1) {
                    break L72;
                  } else {
                    stackOut_181_0 = (vh) (Object) stackIn_181_0;
                    stackIn_183_0 = stackOut_181_0;
                    stackIn_182_0 = stackOut_181_0;
                    if (!nr.field_bb) {
                      break L72;
                    } else {
                      stackOut_182_0 = (vh) (Object) stackIn_182_0;
                      stackOut_182_1 = 1;
                      stackIn_184_0 = stackOut_182_0;
                      stackIn_184_1 = stackOut_182_1;
                      break L71;
                    }
                  }
                }
              }
              stackOut_183_0 = (vh) (Object) stackIn_183_0;
              stackOut_183_1 = 0;
              stackIn_184_0 = stackOut_183_0;
              stackIn_184_1 = stackOut_183_1;
              break L71;
            }
            L73: {
              ((vh) (Object) stackIn_184_0).a(stackIn_184_1 != 0, false);
              na.field_e.field_i.c(true);
              if (null != em.field_L) {
                L74: {
                  if (ok.field_ob.field_R == 0) {
                    break L74;
                  } else {
                    nf.a(em.field_L.g(20872), true, param4);
                    break L74;
                  }
                }
                L75: {
                  if (kc.field_b.field_R != 0) {
                    nr.field_bb = true;
                    break L75;
                  } else {
                    break L75;
                  }
                }
                L76: {
                  if (d.field_c.field_R != 0) {
                    em.field_N = true;
                    break L76;
                  } else {
                    break L76;
                  }
                }
                L77: {
                  if (ba.field_vb.field_R != 0) {
                    nr.field_bb = false;
                    break L77;
                  } else {
                    break L77;
                  }
                }
                tl.a(param4, em.field_L, 0, false);
                break L73;
              } else {
                break L73;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var5, "fe.GA(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final static boolean a(int[] param0, int param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
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
              if ((param0[2] & 8192) == 0) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("fe.BA(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 44 + 77 + 41);
        }
        return stackIn_5_0 != 0;
    }

    final void d(byte param0) {
        if (param0 != 99) {
            field_J = true;
        }
        if (!(!((fe) this).field_K)) {
            ((fe) this).field_K = false;
            if (((fe) this).field_t != null) {
                if (!(!(((fe) this).field_t instanceof ik))) {
                    ((ik) (Object) ((fe) this).field_t).a(param0 ^ 17634, ((fe) this).field_K, (ei) this);
                }
            }
        }
    }

    void a(ei param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                super.a(param0, param1, param2, param3);
                if (((fe) this).field_n == 0) {
                  break L2;
                } else {
                  if (~cd.field_b != ~((fe) this).field_n) {
                    L3: {
                      if (!((fe) this).a(param2, param3, wn.field_i, -1, gg.field_f)) {
                        break L3;
                      } else {
                        if (cd.field_b == 0) {
                          ((fe) this).a(16, -param2 + wn.field_i, -param3 + gg.field_f, ((fe) this).field_n);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    }
                    ((fe) this).a(param2, wn.field_i, param3, gg.field_f, (byte) 115, param0);
                    break L2;
                  } else {
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
          L4: {
            var5 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var5;
            stackOut_9_1 = new StringBuilder().append("fe.S(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    boolean a(char param0, int param1, boolean param2, ei param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_1_0 = 0;
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
            if (!param2) {
              if (!((fe) this).d(73)) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                L1: {
                  if (param1 == 84) {
                    break L1;
                  } else {
                    if (param1 == 83) {
                      break L1;
                    } else {
                      return false;
                    }
                  }
                }
                ((fe) this).a(16, -1, -1, 1);
                stackOut_7_0 = 1;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0 != 0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("fe.U(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_10_0 != 0;
    }

    final boolean d(int param0) {
        int var2 = 81 % ((param0 - 7) / 48);
        return ((fe) this).field_K;
    }

    boolean a(ei param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
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
                    stackOut_8_0 = 1;
                    stackIn_9_0 = stackOut_8_0;
                    return stackIn_9_0 != 0;
                  }
                }
              }
              stackOut_10_0 = 0;
              stackIn_11_0 = stackOut_10_0;
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
            stackOut_12_0 = (RuntimeException) var8;
            stackOut_12_1 = new StringBuilder().append("fe.AA(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_11_0 != 0;
    }

    final static String a(boolean param0, byte param1, CharSequence param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_4_0 = null;
        boolean stackIn_8_0 = false;
        String stackIn_11_0 = null;
        int stackIn_14_0 = 0;
        Object stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        boolean stackOut_7_0 = false;
        String stackOut_10_0 = null;
        byte stackOut_13_0 = 0;
        Object stackOut_16_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var5 = Pool.field_O;
        try {
          L0: {
            var3 = up.a(param0, param2, (byte) 117);
            if (var3 != null) {
              stackOut_3_0 = (String) var3;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              var4 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (param2.length() <= var4) {
                      break L3;
                    } else {
                      stackOut_7_0 = uc.a(param2.charAt(var4), (byte) -51);
                      stackIn_14_0 = stackOut_7_0 ? 1 : 0;
                      stackIn_8_0 = stackOut_7_0;
                      if (var5 != 0) {
                        break L2;
                      } else {
                        if (!stackIn_8_0) {
                          stackOut_10_0 = iq.field_g;
                          stackIn_11_0 = stackOut_10_0;
                          return stackIn_11_0;
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
                  stackOut_13_0 = param1;
                  stackIn_14_0 = stackOut_13_0;
                  break L2;
                }
                if (stackIn_14_0 <= 66) {
                  fe.a(7, -120, (byte) 100, (java.awt.Canvas) null);
                  stackOut_16_0 = null;
                  stackIn_17_0 = stackOut_16_0;
                  break L0;
                } else {
                  return null;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var3_ref;
            stackOut_18_1 = new StringBuilder().append("fe.DA(").append(param0).append(44).append(param1).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L4;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
        }
        return (String) (Object) stackIn_17_0;
    }

    final StringBuilder a(StringBuilder param0, int param1, Hashtable param2, int param3) {
        RuntimeException var5 = null;
        Object stackIn_8_0 = null;
        StringBuilder stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_9_0 = null;
        Object stackOut_7_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              if (!((fe) this).b(param1, param2, param0, -1)) {
                break L1;
              } else {
                L2: {
                  ((fe) this).a(1, param2, param0, param1);
                  if (((fe) this).field_G) {
                    StringBuilder discarded$4 = param0.append(" active");
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if (((fe) this).field_I) {
                  break L1;
                } else {
                  StringBuilder discarded$5 = param0.append(" disabled");
                  break L1;
                }
              }
            }
            if (param3 > 13) {
              stackOut_9_0 = (StringBuilder) param0;
              stackIn_10_0 = stackOut_9_0;
              break L0;
            } else {
              stackOut_7_0 = null;
              stackIn_8_0 = stackOut_7_0;
              return (StringBuilder) (Object) stackIn_8_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("fe.EA(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          L4: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44).append(param1).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param3 + 41);
        }
        return stackIn_10_0;
    }

    public static void f(byte param0) {
        field_L = null;
        if (param0 != 72) {
            field_J = false;
        }
        field_H = null;
        field_M = null;
    }

    fe(String param0, cc param1) {
        this(param0, db.field_Sb.field_l, param1);
    }

    boolean a(ei param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
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
                  stackOut_8_0 = 1;
                  stackIn_9_0 = stackOut_8_0;
                  break L0;
                }
              }
            }
            stackOut_3_0 = 0;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("fe.M(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param1 + 41);
        }
        return stackIn_9_0 != 0;
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
        ((fe) this).field_z = db.field_Sb.field_k;
    }

    final void a(int param0, int param1, int param2, int param3, byte param4, ei param5) {
        try {
            if (null != ((fe) this).field_t) {
                if (!(!(((fe) this).field_t instanceof bn))) {
                    ((bn) (Object) ((fe) this).field_t).a(param3, (fe) this, param2, param0, -116, param1);
                }
            }
            if (param4 <= 62) {
                boolean discarded$0 = ((fe) this).a((ei) null, -88, true, 21, -27, 5, -59);
            }
            ((fe) this).field_n = 0;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "fe.E(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + (param5 != null ? "{...}" : "null") + 41);
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
