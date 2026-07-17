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
                sh.field_P.a(var4, 0, 0, -23820);
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
            stackOut_4_1 = new StringBuilder().append("fe.V(").append(0).append(44).append(0).append(44).append(param2).append(44);
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

    final static void a(boolean param0, boolean param1, boolean param2) {
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
        ko var17 = null;
        int var17_int = 0;
        Object var18 = null;
        im var18_ref = null;
        int var18_int = 0;
        int var19 = 0;
        int[] var20 = null;
        String var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        vh stackIn_17_0 = null;
        vh stackIn_18_0 = null;
        vh stackIn_19_0 = null;
        vh stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_36_0 = 0;
        vh stackIn_140_0 = null;
        vh stackIn_141_0 = null;
        vh stackIn_142_0 = null;
        vh stackIn_143_0 = null;
        vh stackIn_144_0 = null;
        int stackIn_144_1 = 0;
        vh stackIn_145_0 = null;
        vh stackIn_146_0 = null;
        vh stackIn_147_0 = null;
        vh stackIn_148_0 = null;
        vh stackIn_149_0 = null;
        int stackIn_149_1 = 0;
        vh stackIn_150_0 = null;
        vh stackIn_151_0 = null;
        vh stackIn_152_0 = null;
        vh stackIn_153_0 = null;
        vh stackIn_154_0 = null;
        int stackIn_154_1 = 0;
        RuntimeException decompiledCaughtException = null;
        vh stackOut_16_0 = null;
        vh stackOut_17_0 = null;
        vh stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        vh stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_35_0 = 0;
        int stackOut_34_0 = 0;
        vh stackOut_139_0 = null;
        vh stackOut_140_0 = null;
        vh stackOut_141_0 = null;
        vh stackOut_142_0 = null;
        int stackOut_142_1 = 0;
        vh stackOut_143_0 = null;
        int stackOut_143_1 = 0;
        vh stackOut_144_0 = null;
        vh stackOut_145_0 = null;
        vh stackOut_146_0 = null;
        vh stackOut_147_0 = null;
        int stackOut_147_1 = 0;
        vh stackOut_148_0 = null;
        int stackOut_148_1 = 0;
        vh stackOut_149_0 = null;
        vh stackOut_150_0 = null;
        vh stackOut_151_0 = null;
        vh stackOut_152_0 = null;
        int stackOut_152_1 = 0;
        vh stackOut_153_0 = null;
        int stackOut_153_1 = 0;
        var18 = null;
        var19 = Pool.field_O;
        try {
          L0: {
            L1: {
              fr.a((byte) -58, nj.field_b);
              if (null != em.field_L) {
                L2: {
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
                  int discarded$1 = 85;
                  if (!cj.e()) {
                    var9_ref_String = em.field_L.field_Ob;
                    ii.field_e.field_nb = nr.a(new String[1], -1, th.field_c).toUpperCase();
                    gi.field_o.b(-40 + uq.field_f.field_Db, 2147483647, 0, uq.field_f.field_gb, 40);
                    gi.field_o.field_nb = nr.a(new String[1], -1, uh.field_s);
                    var8 = gi.field_o;
                    break L2;
                  } else {
                    L3: {
                      ii.field_e.field_nb = rf.field_b.toUpperCase();
                      var9 = (2 + uq.field_f.field_gb) / 2;
                      kc.field_b.b(uq.field_f.field_Db + -40, 2147483647, 0, var9 - 2, 40);
                      if (em.field_L.field_mc >= em.field_L.field_Nb) {
                        kc.field_b.field_nb = ro.field_p.toUpperCase();
                        kc.field_b.field_pb = false;
                        break L3;
                      } else {
                        kc.field_b.field_nb = v.field_d.toUpperCase();
                        kc.field_b.field_pb = true;
                        break L3;
                      }
                    }
                    L4: {
                      kc.field_b.field_F = mg.field_c.field_F;
                      if (uf.field_jb > 0) {
                        L5: {
                          if (uf.field_jb != 1) {
                            var10_ref_String = nr.a(new String[1], -1, hq.field_f);
                            break L5;
                          } else {
                            var10_ref_String = lo.field_b;
                            break L5;
                          }
                        }
                        L6: {
                          if ((va.field_V & 16) != 0) {
                            break L6;
                          } else {
                            if (nr.field_bb) {
                              break L6;
                            } else {
                              kc.field_b.field_F = mg.field_c.field_Gb;
                              break L6;
                            }
                          }
                        }
                        kc.field_b.field_nb = kc.field_b.field_nb + "<br>" + var10_ref_String;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L7: {
                      L8: {
                        d.field_c.b(uq.field_f.field_Db - 40, 2147483647, var9, -var9 + uq.field_f.field_gb, 40);
                        d.field_c.field_nb = ua.field_s.toUpperCase();
                        var8 = d.field_c;
                        stackOut_16_0 = d.field_c;
                        stackIn_19_0 = stackOut_16_0;
                        stackIn_17_0 = stackOut_16_0;
                        if (!param0) {
                          break L8;
                        } else {
                          stackOut_17_0 = (vh) (Object) stackIn_17_0;
                          stackIn_19_0 = stackOut_17_0;
                          stackIn_18_0 = stackOut_17_0;
                          if (fd.field_K != 0L) {
                            break L8;
                          } else {
                            stackOut_18_0 = (vh) (Object) stackIn_18_0;
                            stackOut_18_1 = 1;
                            stackIn_20_0 = stackOut_18_0;
                            stackIn_20_1 = stackOut_18_1;
                            break L7;
                          }
                        }
                      }
                      stackOut_19_0 = (vh) (Object) stackIn_19_0;
                      stackOut_19_1 = 0;
                      stackIn_20_0 = stackOut_19_0;
                      stackIn_20_1 = stackOut_19_1;
                      break L7;
                    }
                    L9: {
                      stackIn_20_0.field_pb = stackIn_20_1 != 0;
                      var10 = 2;
                      if (we.field_m != null) {
                        L10: {
                          if (null != dk.field_j) {
                            break L10;
                          } else {
                            dk.field_j = new byte[dr.field_c];
                            gf.field_b = new boolean[dr.field_c];
                            break L10;
                          }
                        }
                        var11 = 0;
                        L11: while (true) {
                          if (var11 >= dr.field_c) {
                            var10 = 0;
                            L12: while (true) {
                              L13: {
                                if (var10 >= 2) {
                                  break L13;
                                } else {
                                  var11 = 0;
                                  var12 = 0;
                                  L14: while (true) {
                                    if (var12 >= we.field_m.length) {
                                      if (var11 != 0) {
                                        break L13;
                                      } else {
                                        var10++;
                                        continue L12;
                                      }
                                    } else {
                                      var24 = we.field_m[var12];
                                      var23 = var24;
                                      var22 = var23;
                                      var20 = var22;
                                      var13_ref_int__ = var20;
                                      var14 = 0;
                                      if (var24.length <= var14) {
                                        var11 = 1;
                                        var14 = -1;
                                        var15 = 0;
                                        L15: while (true) {
                                          if (var24.length <= var15) {
                                            gf.field_b[var14] = true;
                                            var12++;
                                            continue L14;
                                          } else {
                                            L16: {
                                              var16 = var24[var15];
                                              if (var16 > var14) {
                                                var14 = var16;
                                                break L16;
                                              } else {
                                                break L16;
                                              }
                                            }
                                            var15 += 2;
                                            continue L15;
                                          }
                                        }
                                      } else {
                                        var15 = var24[var14];
                                        var16 = var13_ref_int__[1 + var14];
                                        if (var15 != -1) {
                                          L17: {
                                            if (var16 != (em.field_L.field_tc[var15] & 255)) {
                                              break L17;
                                            } else {
                                              break L17;
                                            }
                                          }
                                          var12++;
                                          continue L14;
                                        } else {
                                          L18: {
                                            if (0 == var10) {
                                              stackOut_35_0 = em.field_L.field_Nb;
                                              stackIn_36_0 = stackOut_35_0;
                                              break L18;
                                            } else {
                                              stackOut_34_0 = em.field_L.field_mc;
                                              stackIn_36_0 = stackOut_34_0;
                                              break L18;
                                            }
                                          }
                                          L19: {
                                            var17_int = stackIn_36_0;
                                            if (var17_int != var16) {
                                              break L19;
                                            } else {
                                              break L19;
                                            }
                                          }
                                          var12++;
                                          continue L14;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              if (hq.field_i < 2) {
                                break L9;
                              } else {
                                if (!vj.field_c[12]) {
                                  break L9;
                                } else {
                                  var10 = 2;
                                  break L9;
                                }
                              }
                            }
                          } else {
                            gf.field_b[var11] = false;
                            var11++;
                            continue L11;
                          }
                        }
                      } else {
                        break L9;
                      }
                    }
                    if (var10 >= 2) {
                      L20: {
                        if (null != dl.field_j) {
                          break L20;
                        } else {
                          if (null != ci.field_d) {
                            break L20;
                          } else {
                            if (w.field_j != null) {
                              break L20;
                            } else {
                              if (null != op.field_a) {
                                break L20;
                              } else {
                                break L2;
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
                      L21: while (true) {
                        if (dr.field_c <= var16) {
                          var16 = 0;
                          var17 = wo.field_f.field_Rb.field_T;
                          var18_ref = (im) (Object) var17.c((byte) 96);
                          L22: while (true) {
                            L23: {
                              if (var18_ref == null) {
                                break L23;
                              } else {
                                L24: {
                                  if (!var18_ref.c(true)) {
                                    L25: {
                                      if (var11 == 0) {
                                        break L25;
                                      } else {
                                        if (var18_ref.field_Pb) {
                                          break L25;
                                        } else {
                                          var16 = 1;
                                          break L23;
                                        }
                                      }
                                    }
                                    if (var13 > var18_ref.field_Rb) {
                                      var16 = 1;
                                      break L23;
                                    } else {
                                      if (var18_ref.field_Xb < var14) {
                                        var16 = 1;
                                        break L23;
                                      } else {
                                        if (0 < (var15 & ~var18_ref.field_Nb)) {
                                          var16 = 1;
                                          break L23;
                                        } else {
                                          if (var12 == 0) {
                                            break L24;
                                          } else {
                                            var16 = 1;
                                            break L23;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    break L24;
                                  }
                                }
                                var18_ref = (im) (Object) var17.f((byte) -5);
                                continue L22;
                              }
                            }
                            L26: {
                              if (hq.field_i < 2) {
                                break L26;
                              } else {
                                if (vj.field_c[12]) {
                                  var16 = 0;
                                  break L26;
                                } else {
                                  break L26;
                                }
                              }
                            }
                            if (var16 != 0) {
                              d.field_c.field_pb = false;
                              if (d.field_c.field_db) {
                                if (na.field_e.field_i.field_Mb == 0) {
                                  kk.field_B = fn.field_Mb;
                                  break L2;
                                } else {
                                  kk.field_B = nr.a(new String[1], -1, t.field_c);
                                  break L2;
                                }
                              } else {
                                break L2;
                              }
                            } else {
                              break L2;
                            }
                          }
                        } else {
                          L27: {
                            var17_int = em.field_L.field_tc[var16] & 255;
                            if (dl.field_j == null) {
                              break L27;
                            } else {
                              if (null != dl.field_j[var16]) {
                                if (dl.field_j[var16][var17_int]) {
                                  var11 = 1;
                                  break L27;
                                } else {
                                  break L27;
                                }
                              } else {
                                break L27;
                              }
                            }
                          }
                          L28: {
                            if (ci.field_d == null) {
                              break L28;
                            } else {
                              if (null != ci.field_d[var16]) {
                                L29: {
                                  var18_int = ci.field_d[var16][var17_int];
                                  if (var18_int > var13) {
                                    var13 = var18_int;
                                    break L29;
                                  } else {
                                    break L29;
                                  }
                                }
                                if (var18_int == 0) {
                                  break L28;
                                } else {
                                  if (!rg.field_s) {
                                    var11 = 1;
                                    break L28;
                                  } else {
                                    break L28;
                                  }
                                }
                              } else {
                                break L28;
                              }
                            }
                          }
                          L30: {
                            if (op.field_a == null) {
                              break L30;
                            } else {
                              if (op.field_a[var16] != null) {
                                var15 = var15 | op.field_a[var16][var17_int];
                                break L30;
                              } else {
                                break L30;
                              }
                            }
                          }
                          L31: {
                            if (null == w.field_j) {
                              break L31;
                            } else {
                              break L31;
                            }
                          }
                          var16++;
                          continue L21;
                        }
                      }
                    } else {
                      d.field_c.field_pb = false;
                      if (d.field_c.field_db) {
                        var11_ref = null;
                        var12 = 0;
                        var13 = 0;
                        L32: while (true) {
                          if (var13 >= dr.field_c) {
                            L33: {
                              if (var10 != 0) {
                                var13_ref_String = aj.field_Rb;
                                if (var12 == 0) {
                                  var14_ref_String = nr.a(new String[1], -1, me.field_u);
                                  break L33;
                                } else {
                                  var14_ref_String = ab.field_d + var11_ref;
                                  break L33;
                                }
                              } else {
                                var13_ref_String = ah.field_g;
                                if (var12 != 0) {
                                  var14_ref_String = ud.field_M + var11_ref;
                                  break L33;
                                } else {
                                  var14_ref_String = nr.a(new String[1], -1, fm.field_J);
                                  break L33;
                                }
                              }
                            }
                            kk.field_B = "<col=A00000>" + var13_ref_String + "<br>" + var14_ref_String;
                            break L2;
                          } else {
                            L34: {
                              if (gf.field_b[var13]) {
                                var21 = "<col=A00000>" + ck.field_R[var13] + "</col>";
                                if (var11_ref != null) {
                                  var11_ref = (Object) (Object) (var11_ref + ", " + var21);
                                  var12 = 1;
                                  break L34;
                                } else {
                                  var11_ref = (Object) (Object) var21;
                                  break L34;
                                }
                              } else {
                                break L34;
                              }
                            }
                            var13++;
                            continue L32;
                          }
                        }
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                L35: {
                  if (fd.field_K == 0L) {
                    break L35;
                  } else {
                    L36: {
                      var9 = (int)(-rl.a((byte) -94) + fd.field_K);
                      var9 = (999 + var9) / 1000;
                      if (var9 >= 1) {
                        break L36;
                      } else {
                        var9 = 1;
                        break L36;
                      }
                    }
                    var8.field_nb = nr.a(new String[1], -1, bl.field_v);
                    break L35;
                  }
                }
                nd.field_c.field_nb = nr.a(new String[2], -1, qa.field_o);
                break L1;
              } else {
                break L1;
              }
            }
            L37: {
              L38: {
                stackOut_139_0 = so.field_k;
                stackIn_143_0 = stackOut_139_0;
                stackIn_140_0 = stackOut_139_0;
                if (!param2) {
                  break L38;
                } else {
                  stackOut_140_0 = (vh) (Object) stackIn_140_0;
                  stackIn_143_0 = stackOut_140_0;
                  stackIn_141_0 = stackOut_140_0;
                  if (param1) {
                    break L38;
                  } else {
                    stackOut_141_0 = (vh) (Object) stackIn_141_0;
                    stackIn_143_0 = stackOut_141_0;
                    stackIn_142_0 = stackOut_141_0;
                    if (nr.field_bb) {
                      break L38;
                    } else {
                      stackOut_142_0 = (vh) (Object) stackIn_142_0;
                      stackOut_142_1 = 1;
                      stackIn_144_0 = stackOut_142_0;
                      stackIn_144_1 = stackOut_142_1;
                      break L37;
                    }
                  }
                }
              }
              stackOut_143_0 = (vh) (Object) stackIn_143_0;
              stackOut_143_1 = 0;
              stackIn_144_0 = stackOut_143_0;
              stackIn_144_1 = stackOut_143_1;
              break L37;
            }
            L39: {
              L40: {
                ((vh) (Object) stackIn_144_0).a(stackIn_144_1 != 0, false);
                stackOut_144_0 = uq.field_f;
                stackIn_148_0 = stackOut_144_0;
                stackIn_145_0 = stackOut_144_0;
                if (!param2) {
                  break L40;
                } else {
                  stackOut_145_0 = (vh) (Object) stackIn_145_0;
                  stackIn_148_0 = stackOut_145_0;
                  stackIn_146_0 = stackOut_145_0;
                  if (param1) {
                    break L40;
                  } else {
                    stackOut_146_0 = (vh) (Object) stackIn_146_0;
                    stackIn_148_0 = stackOut_146_0;
                    stackIn_147_0 = stackOut_146_0;
                    if (nr.field_bb) {
                      break L40;
                    } else {
                      stackOut_147_0 = (vh) (Object) stackIn_147_0;
                      stackOut_147_1 = 1;
                      stackIn_149_0 = stackOut_147_0;
                      stackIn_149_1 = stackOut_147_1;
                      break L39;
                    }
                  }
                }
              }
              stackOut_148_0 = (vh) (Object) stackIn_148_0;
              stackOut_148_1 = 0;
              stackIn_149_0 = stackOut_148_0;
              stackIn_149_1 = stackOut_148_1;
              break L39;
            }
            L41: {
              L42: {
                ((vh) (Object) stackIn_149_0).a(stackIn_149_1 != 0, false);
                var5_int = 92;
                stackOut_149_0 = de.field_b;
                stackIn_153_0 = stackOut_149_0;
                stackIn_150_0 = stackOut_149_0;
                if (!param2) {
                  break L42;
                } else {
                  stackOut_150_0 = (vh) (Object) stackIn_150_0;
                  stackIn_153_0 = stackOut_150_0;
                  stackIn_151_0 = stackOut_150_0;
                  if (param1) {
                    break L42;
                  } else {
                    stackOut_151_0 = (vh) (Object) stackIn_151_0;
                    stackIn_153_0 = stackOut_151_0;
                    stackIn_152_0 = stackOut_151_0;
                    if (!nr.field_bb) {
                      break L42;
                    } else {
                      stackOut_152_0 = (vh) (Object) stackIn_152_0;
                      stackOut_152_1 = 1;
                      stackIn_154_0 = stackOut_152_0;
                      stackIn_154_1 = stackOut_152_1;
                      break L41;
                    }
                  }
                }
              }
              stackOut_153_0 = (vh) (Object) stackIn_153_0;
              stackOut_153_1 = 0;
              stackIn_154_0 = stackOut_153_0;
              stackIn_154_1 = stackOut_153_1;
              break L41;
            }
            L43: {
              ((vh) (Object) stackIn_154_0).a(stackIn_154_1 != 0, false);
              na.field_e.field_i.c(true);
              if (null != em.field_L) {
                L44: {
                  if (ok.field_ob.field_R == 0) {
                    break L44;
                  } else {
                    nf.a(em.field_L.g(20872), true, 11);
                    break L44;
                  }
                }
                L45: {
                  if (kc.field_b.field_R != 0) {
                    nr.field_bb = true;
                    break L45;
                  } else {
                    break L45;
                  }
                }
                L46: {
                  if (d.field_c.field_R != 0) {
                    em.field_N = true;
                    break L46;
                  } else {
                    break L46;
                  }
                }
                L47: {
                  if (ba.field_vb.field_R != 0) {
                    nr.field_bb = false;
                    break L47;
                  } else {
                    break L47;
                  }
                }
                tl.a(11, em.field_L, 0, false);
                break L43;
              } else {
                break L43;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var5, "fe.GA(" + param0 + 44 + param1 + 44 + param2 + 44 + -102 + 44 + 11 + 41);
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
              if ((param0[param2 >> 5] & 1 << (param2 & 31)) == 0) {
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
          throw wm.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 44 + param2 + 41);
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
              super.a(param0, param1, param2, param3);
              if (((fe) this).field_n == 0) {
                break L1;
              } else {
                if (cd.field_b != ((fe) this).field_n) {
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
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
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
        String stackIn_10_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_9_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var5 = Pool.field_O;
        try {
          var3 = up.a(false, param2, (byte) 117);
          if (var3 != null) {
            stackOut_3_0 = (String) var3;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          } else {
            var4 = 0;
            L0: while (true) {
              if (param2.length() <= var4) {
                return null;
              } else {
                int discarded$15 = -51;
                if (!uc.a(param2.charAt(var4))) {
                  stackOut_9_0 = iq.field_g;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                } else {
                  var4++;
                  continue L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3_ref;
            stackOut_15_1 = new StringBuilder().append("fe.DA(").append(0).append(44).append(70).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L1;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L1;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
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

    public static void f() {
        field_L = null;
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
