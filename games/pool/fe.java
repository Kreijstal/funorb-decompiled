/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

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
        try {
            var4 = param3.getGraphics();
            sh.field_P.a(var4, param0, param1, -23820);
            int var5 = 107 % ((-1 - param2) / 57);
            var4.dispose();
        } catch (Exception exception) {
            param3.repaint();
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
        vh var5_ref_vh = null;
        int var5 = 0;
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
        vh stackIn_17_0 = null;
        vh stackIn_18_0 = null;
        vh stackIn_19_0 = null;
        vh stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackIn_62_0 = 0;
        int stackIn_66_0 = 0;
        boolean stackIn_75_0 = false;
        int stackIn_82_0 = 0;
        boolean stackIn_130_0 = false;
        int stackIn_149_0 = 0;
        vh stackIn_169_0 = null;
        vh stackIn_170_0 = null;
        vh stackIn_171_0 = null;
        vh stackIn_172_0 = null;
        vh stackIn_173_0 = null;
        int stackIn_173_1 = 0;
        vh stackIn_174_0 = null;
        vh stackIn_175_0 = null;
        vh stackIn_176_0 = null;
        vh stackIn_177_0 = null;
        vh stackIn_178_0 = null;
        int stackIn_178_1 = 0;
        vh stackIn_179_0 = null;
        vh stackIn_180_0 = null;
        vh stackIn_181_0 = null;
        vh stackIn_182_0 = null;
        vh stackIn_183_0 = null;
        int stackIn_183_1 = 0;
        vh stackOut_16_0 = null;
        vh stackOut_17_0 = null;
        vh stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        vh stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_54_1 = 0;
        int stackOut_61_0 = 0;
        int stackOut_65_0 = 0;
        boolean stackOut_74_0 = false;
        int stackOut_81_0 = 0;
        boolean stackOut_129_0 = false;
        int stackOut_148_0 = 0;
        vh stackOut_168_0 = null;
        vh stackOut_169_0 = null;
        vh stackOut_170_0 = null;
        vh stackOut_171_0 = null;
        int stackOut_171_1 = 0;
        vh stackOut_172_0 = null;
        int stackOut_172_1 = 0;
        vh stackOut_173_0 = null;
        vh stackOut_174_0 = null;
        vh stackOut_175_0 = null;
        vh stackOut_176_0 = null;
        int stackOut_176_1 = 0;
        vh stackOut_177_0 = null;
        int stackOut_177_1 = 0;
        vh stackOut_178_0 = null;
        vh stackOut_179_0 = null;
        vh stackOut_180_0 = null;
        vh stackOut_181_0 = null;
        int stackOut_181_1 = 0;
        vh stackOut_182_0 = null;
        int stackOut_182_1 = 0;
        L0: {
          var18 = null;
          var19 = Pool.field_O;
          fr.a((byte) -58, nj.field_b);
          if (null != em.field_L) {
            L1: {
              L2: {
                ok.field_ob.field_pb = true;
                kc.field_b.field_Db = 0;
                var5_ref_vh = kc.field_b;
                var5_ref_vh.field_gb = 0;
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
                      stackOut_16_0 = d.field_c;
                      stackIn_19_0 = stackOut_16_0;
                      stackIn_17_0 = stackOut_16_0;
                      if (!param0) {
                        break L10;
                      } else {
                        stackOut_17_0 = (vh) (Object) stackIn_17_0;
                        stackIn_19_0 = stackOut_17_0;
                        stackIn_18_0 = stackOut_17_0;
                        if (fd.field_K != 0L) {
                          break L10;
                        } else {
                          stackOut_18_0 = (vh) (Object) stackIn_18_0;
                          stackOut_18_1 = 1;
                          stackIn_20_0 = stackOut_18_0;
                          stackIn_20_1 = stackOut_18_1;
                          break L9;
                        }
                      }
                    }
                    stackOut_19_0 = (vh) (Object) stackIn_19_0;
                    stackOut_19_1 = 0;
                    stackIn_20_0 = stackOut_19_0;
                    stackIn_20_1 = stackOut_19_1;
                    break L9;
                  }
                  L11: {
                    stackIn_20_0.field_pb = stackIn_20_1 != 0;
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
                                stackOut_32_0 = 0;
                                stackIn_66_0 = stackOut_32_0;
                                stackIn_33_0 = stackOut_32_0;
                                if (var19 != 0) {
                                  break L17;
                                } else {
                                  var12 = stackIn_33_0;
                                  L19: while (true) {
                                    stackOut_34_0 = var12;
                                    stackOut_34_1 = we.field_m.length;
                                    stackIn_35_0 = stackOut_34_0;
                                    stackIn_35_1 = stackOut_34_1;
                                    L20: while (true) {
                                      L21: {
                                        L22: {
                                          if (stackIn_35_0 >= stackIn_35_1) {
                                            break L22;
                                          } else {
                                            var25 = we.field_m[var12];
                                            var24 = var25;
                                            var23 = var24;
                                            var21 = var23;
                                            var20 = var21;
                                            var13_ref_int__ = var20;
                                            stackOut_36_0 = 0;
                                            stackIn_62_0 = stackOut_36_0;
                                            stackIn_37_0 = stackOut_36_0;
                                            if (var19 != 0) {
                                              break L21;
                                            } else {
                                              var14 = stackIn_37_0;
                                              L23: while (true) {
                                                L24: {
                                                  L25: {
                                                    L26: {
                                                      if (var25.length <= var14) {
                                                        break L26;
                                                      } else {
                                                        var15 = var25[var14];
                                                        var16 = var20[1 + var14];
                                                        stackOut_39_0 = var15 ^ -1;
                                                        stackIn_52_0 = stackOut_39_0;
                                                        stackIn_40_0 = stackOut_39_0;
                                                        if (var19 != 0) {
                                                          break L25;
                                                        } else {
                                                          L27: {
                                                            L28: {
                                                              if (stackIn_40_0 != 0) {
                                                                break L28;
                                                              } else {
                                                                L29: {
                                                                  if (0 == var10) {
                                                                    stackOut_43_0 = em.field_L.field_Nb;
                                                                    stackIn_44_0 = stackOut_43_0;
                                                                    break L29;
                                                                  } else {
                                                                    stackOut_42_0 = em.field_L.field_mc;
                                                                    stackIn_44_0 = stackOut_42_0;
                                                                    break L29;
                                                                  }
                                                                }
                                                                var17_int = stackIn_44_0;
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
                                                    stackOut_51_0 = 0;
                                                    stackIn_52_0 = stackOut_51_0;
                                                    break L25;
                                                  }
                                                  var15 = stackIn_52_0;
                                                  L30: while (true) {
                                                    L31: {
                                                      if (var25.length <= var15) {
                                                        break L31;
                                                      } else {
                                                        var16 = var25[var15];
                                                        stackOut_54_0 = var16 ^ -1;
                                                        stackOut_54_1 = var14 ^ -1;
                                                        stackIn_35_0 = stackOut_54_0;
                                                        stackIn_35_1 = stackOut_54_1;
                                                        stackIn_55_0 = stackOut_54_0;
                                                        stackIn_55_1 = stackOut_54_1;
                                                        if (var19 != 0) {
                                                          continue L20;
                                                        } else {
                                                          L32: {
                                                            if (stackIn_55_0 < stackIn_55_1) {
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
                                        stackOut_61_0 = var11;
                                        stackIn_62_0 = stackOut_61_0;
                                        break L21;
                                      }
                                      if (stackIn_62_0 != 0) {
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
                            stackOut_65_0 = hq.field_i ^ -1;
                            stackIn_66_0 = stackOut_65_0;
                            break L17;
                          }
                          if (stackIn_66_0 > -3) {
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
                                  stackOut_74_0 = gf.field_b[var13];
                                  stackIn_82_0 = stackOut_74_0 ? 1 : 0;
                                  stackIn_75_0 = stackOut_74_0;
                                  if (var19 != 0) {
                                    break L36;
                                  } else {
                                    L38: {
                                      if (stackIn_75_0) {
                                        L39: {
                                          var22 = "<col=A00000>" + ck.field_R[var13] + "</col>";
                                          if (var11_ref != null) {
                                            break L39;
                                          } else {
                                            var11_ref = (Object) (Object) var22;
                                            if (var19 == 0) {
                                              break L38;
                                            } else {
                                              break L39;
                                            }
                                          }
                                        }
                                        var11_ref = (Object) (Object) (var11_ref + ", " + var22);
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
                              stackOut_81_0 = -1;
                              stackIn_82_0 = stackOut_81_0;
                              break L36;
                            }
                            L40: {
                              if (stackIn_82_0 != (var10 ^ -1)) {
                                L41: {
                                  var13_ref_String = aj.field_Rb;
                                  if (var12 == 0) {
                                    break L41;
                                  } else {
                                    var14_ref_String = ab.field_d + var11_ref;
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
                                var14_ref_String = ud.field_M + var11_ref;
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
                      var18_ref = (im) (Object) var17.c((byte) 96);
                      L53: while (true) {
                        L54: {
                          L55: {
                            if (var18_ref == null) {
                              break L55;
                            } else {
                              stackOut_129_0 = var18_ref.c(true);
                              stackIn_149_0 = stackOut_129_0 ? 1 : 0;
                              stackIn_130_0 = stackOut_129_0;
                              if (var19 != 0) {
                                break L54;
                              } else {
                                L56: {
                                  L57: {
                                    if (!stackIn_130_0) {
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
                                      if (var18_ref.field_Pb) {
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
                                    if ((var13 ^ -1) < (var18_ref.field_Rb ^ -1)) {
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
                                    if ((var18_ref.field_Xb ^ -1) > (var14 ^ -1)) {
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
                                    if (0 < (var15 & (var18_ref.field_Nb ^ -1))) {
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
                                var18_ref = (im) (Object) var17.f((byte) -5);
                                if (var19 == 0) {
                                  continue L53;
                                } else {
                                  break L55;
                                }
                              }
                            }
                          }
                          stackOut_148_0 = hq.field_i;
                          stackIn_149_0 = stackOut_148_0;
                          break L54;
                        }
                        L62: {
                          if (stackIn_149_0 < 2) {
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
              var9_ref_String = em.field_L.field_Ob;
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
            stackOut_168_0 = so.field_k;
            stackIn_172_0 = stackOut_168_0;
            stackIn_169_0 = stackOut_168_0;
            if (!param2) {
              break L67;
            } else {
              stackOut_169_0 = (vh) (Object) stackIn_169_0;
              stackIn_172_0 = stackOut_169_0;
              stackIn_170_0 = stackOut_169_0;
              if (param1) {
                break L67;
              } else {
                stackOut_170_0 = (vh) (Object) stackIn_170_0;
                stackIn_172_0 = stackOut_170_0;
                stackIn_171_0 = stackOut_170_0;
                if (nr.field_bb) {
                  break L67;
                } else {
                  stackOut_171_0 = (vh) (Object) stackIn_171_0;
                  stackOut_171_1 = 1;
                  stackIn_173_0 = stackOut_171_0;
                  stackIn_173_1 = stackOut_171_1;
                  break L66;
                }
              }
            }
          }
          stackOut_172_0 = (vh) (Object) stackIn_172_0;
          stackOut_172_1 = 0;
          stackIn_173_0 = stackOut_172_0;
          stackIn_173_1 = stackOut_172_1;
          break L66;
        }
        L68: {
          L69: {
            ((vh) (Object) stackIn_173_0).a(stackIn_173_1 != 0, false);
            stackOut_173_0 = uq.field_f;
            stackIn_177_0 = stackOut_173_0;
            stackIn_174_0 = stackOut_173_0;
            if (!param2) {
              break L69;
            } else {
              stackOut_174_0 = (vh) (Object) stackIn_174_0;
              stackIn_177_0 = stackOut_174_0;
              stackIn_175_0 = stackOut_174_0;
              if (param1) {
                break L69;
              } else {
                stackOut_175_0 = (vh) (Object) stackIn_175_0;
                stackIn_177_0 = stackOut_175_0;
                stackIn_176_0 = stackOut_175_0;
                if (nr.field_bb) {
                  break L69;
                } else {
                  stackOut_176_0 = (vh) (Object) stackIn_176_0;
                  stackOut_176_1 = 1;
                  stackIn_178_0 = stackOut_176_0;
                  stackIn_178_1 = stackOut_176_1;
                  break L68;
                }
              }
            }
          }
          stackOut_177_0 = (vh) (Object) stackIn_177_0;
          stackOut_177_1 = 0;
          stackIn_178_0 = stackOut_177_0;
          stackIn_178_1 = stackOut_177_1;
          break L68;
        }
        L70: {
          L71: {
            ((vh) (Object) stackIn_178_0).a(stackIn_178_1 != 0, false);
            var5 = 92 / ((0 - param3) / 63);
            stackOut_178_0 = de.field_b;
            stackIn_182_0 = stackOut_178_0;
            stackIn_179_0 = stackOut_178_0;
            if (!param2) {
              break L71;
            } else {
              stackOut_179_0 = (vh) (Object) stackIn_179_0;
              stackIn_182_0 = stackOut_179_0;
              stackIn_180_0 = stackOut_179_0;
              if (param1) {
                break L71;
              } else {
                stackOut_180_0 = (vh) (Object) stackIn_180_0;
                stackIn_182_0 = stackOut_180_0;
                stackIn_181_0 = stackOut_180_0;
                if (!nr.field_bb) {
                  break L71;
                } else {
                  stackOut_181_0 = (vh) (Object) stackIn_181_0;
                  stackOut_181_1 = 1;
                  stackIn_183_0 = stackOut_181_0;
                  stackIn_183_1 = stackOut_181_1;
                  break L70;
                }
              }
            }
          }
          stackOut_182_0 = (vh) (Object) stackIn_182_0;
          stackOut_182_1 = 0;
          stackIn_183_0 = stackOut_182_0;
          stackIn_183_1 = stackOut_182_1;
          break L70;
        }
        L72: {
          ((vh) (Object) stackIn_183_0).a(stackIn_183_1 != 0, false);
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
        if (param1 != -13671) {
            boolean discarded$0 = fe.a((int[]) null, 103, 77);
        }
        return -1 != (param0[param2 >> 56584869] & 1 << (param2 & 31) ^ -1) ? true : false;
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
        super.a(param0, param1, param2, param3);
        if (((fe) this).field_n != 0) {
            if (!((cd.field_b ^ -1) == (((fe) this).field_n ^ -1))) {
                if (((fe) this).a(param2, param3, wn.field_i, -1, gg.field_f)) {
                    if (!((cd.field_b ^ -1) != -1)) {
                        ((fe) this).a(16, -param2 + wn.field_i, -param3 + gg.field_f, ((fe) this).field_n);
                    }
                }
                ((fe) this).a(param2, wn.field_i, param3, gg.field_f, (byte) 115, param0);
            }
        }
    }

    boolean a(char param0, int param1, boolean param2, ei param3) {
        if (param2) {
            return false;
        }
        if (((fe) this).d(73)) {
            if (-85 != (param1 ^ -1)) {
                if (-84 != (param1 ^ -1)) {
                    return false;
                }
            }
            ((fe) this).a(16, -1, -1, 1);
            return true;
        }
        return false;
    }

    final boolean d(int param0) {
        int var2 = 81 % ((param0 - 7) / 48);
        return ((fe) this).field_K;
    }

    boolean a(ei param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        if (!param2) {
            return false;
        }
        if (((fe) this).field_I) {
            if (((fe) this).a(param1, param5, param6, -1, param4)) {
                boolean discarded$0 = ((fe) this).a(param0, (byte) 122);
                ((fe) this).field_n = param3;
                if (((fe) this).field_t != null) {
                    if (((fe) this).field_t instanceof bn) {
                        ((bn) (Object) ((fe) this).field_t).a((byte) -123, param5, (fe) this, param1, param3, param6, param4);
                    }
                }
                return true;
            }
        }
        return false;
    }

    final static String a(boolean param0, byte param1, CharSequence param2) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        boolean stackIn_6_0 = false;
        int stackIn_11_0 = 0;
        boolean stackOut_5_0 = false;
        byte stackOut_10_0 = 0;
        var5 = Pool.field_O;
        var3 = up.a(param0, param2, (byte) 117);
        if (var3 != null) {
          return var3;
        } else {
          var4 = 0;
          L0: while (true) {
            L1: {
              L2: {
                if (param2.length() <= var4) {
                  break L2;
                } else {
                  stackOut_5_0 = uc.a(param2.charAt(var4), (byte) -51);
                  stackIn_11_0 = stackOut_5_0 ? 1 : 0;
                  stackIn_6_0 = stackOut_5_0;
                  if (var5 != 0) {
                    break L1;
                  } else {
                    if (!stackIn_6_0) {
                      return iq.field_g;
                    } else {
                      var4++;
                      if (var5 == 0) {
                        continue L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              stackOut_10_0 = param1;
              stackIn_11_0 = stackOut_10_0;
              break L1;
            }
            if (stackIn_11_0 <= 66) {
              fe.a(7, -120, (byte) 100, (java.awt.Canvas) null);
              return null;
            } else {
              return null;
            }
          }
        }
    }

    final StringBuilder a(StringBuilder param0, int param1, Hashtable param2, int param3) {
        if (((fe) this).b(param1, param2, param0, -1)) {
            ((fe) this).a(1, param2, param0, param1);
            if (!(!((fe) this).field_G)) {
                StringBuilder discarded$0 = param0.append(" active");
            }
            if (!((fe) this).field_I) {
                StringBuilder discarded$1 = param0.append(" disabled");
            }
        }
        if (param3 <= 13) {
            return null;
        }
        return param0;
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
        int var3 = 0;
        L0: {
          if (!((fe) this).field_I) {
            break L0;
          } else {
            if (!((fe) this).field_F) {
              break L0;
            } else {
              L1: {
                param0.d((byte) 99);
                ((fe) this).field_K = true;
                if (((fe) this).field_t == null) {
                  break L1;
                } else {
                  if (!(((fe) this).field_t instanceof ik)) {
                    break L1;
                  } else {
                    ((ik) (Object) ((fe) this).field_t).a(17537, ((fe) this).field_K, (ei) this);
                    break L1;
                  }
                }
              }
              var3 = 113 % ((param1 - -43) / 47);
              return true;
            }
          }
        }
        return false;
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
        if (null != ((fe) this).field_t) {
            if (!(!(((fe) this).field_t instanceof bn))) {
                ((bn) (Object) ((fe) this).field_t).a(param3, (fe) this, param2, param0, -116, param1);
            }
        }
        if (param4 <= 62) {
            boolean discarded$0 = ((fe) this).a((ei) null, -88, true, 21, -27, 5, -59);
        }
        ((fe) this).field_n = 0;
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
