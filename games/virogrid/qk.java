/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qk {
    static String[] field_d;
    static int field_b;
    private wb field_c;
    private wb field_a;

    final wb d(int param0) {
        if (param0 != -1) {
            ((qk) this).field_a = null;
        }
        wb var2 = ((qk) this).field_c.field_h;
        if (!(((qk) this).field_c != var2)) {
            ((qk) this).field_a = null;
            return null;
        }
        ((qk) this).field_a = var2.field_h;
        return var2;
    }

    final static void a(boolean param0, int param1, byte param2, boolean param3, boolean param4) {
        RuntimeException var5 = null;
        km var6 = null;
        km var7 = null;
        km var8 = null;
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
        p var17 = null;
        int var17_int = 0;
        Object var18 = null;
        lk var18_ref = null;
        int var18_int = 0;
        int var19 = 0;
        km var21 = null;
        int[] var22 = null;
        int[] var25 = null;
        km var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        km stackIn_15_0 = null;
        km stackIn_16_0 = null;
        km stackIn_17_0 = null;
        km stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_38_0 = 0;
        km stackIn_133_0 = null;
        km stackIn_134_0 = null;
        km stackIn_135_0 = null;
        km stackIn_136_0 = null;
        km stackIn_137_0 = null;
        int stackIn_137_1 = 0;
        km stackIn_140_0 = null;
        km stackIn_141_0 = null;
        km stackIn_142_0 = null;
        km stackIn_143_0 = null;
        km stackIn_144_0 = null;
        int stackIn_144_1 = 0;
        km stackIn_145_0 = null;
        km stackIn_146_0 = null;
        km stackIn_147_0 = null;
        km stackIn_148_0 = null;
        km stackIn_149_0 = null;
        int stackIn_149_1 = 0;
        RuntimeException decompiledCaughtException = null;
        km stackOut_14_0 = null;
        km stackOut_15_0 = null;
        km stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        km stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
        km stackOut_132_0 = null;
        km stackOut_133_0 = null;
        km stackOut_134_0 = null;
        km stackOut_135_0 = null;
        int stackOut_135_1 = 0;
        km stackOut_136_0 = null;
        int stackOut_136_1 = 0;
        km stackOut_139_0 = null;
        km stackOut_140_0 = null;
        km stackOut_141_0 = null;
        km stackOut_142_0 = null;
        int stackOut_142_1 = 0;
        km stackOut_143_0 = null;
        int stackOut_143_1 = 0;
        km stackOut_144_0 = null;
        km stackOut_145_0 = null;
        km stackOut_146_0 = null;
        km stackOut_147_0 = null;
        int stackOut_147_1 = 0;
        km stackOut_148_0 = null;
        int stackOut_148_1 = 0;
        var18 = null;
        var19 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              rf.a(th.field_z, -4);
              if (wl.field_d == null) {
                break L1;
              } else {
                L2: {
                  fb.field_o.field_Y = true;
                  var21 = ed.field_c;
                  var26 = var21;
                  ed.field_c.field_ub = 0;
                  var26.field_K = 0;
                  var6 = ii.field_d;
                  ii.field_d.field_ub = 0;
                  var6.field_K = 0;
                  jk.field_b.field_ub = 0;
                  var7 = jk.field_b;
                  var7.field_K = 0;
                  int discarded$1 = 1000;
                  if (!k.b()) {
                    var9_ref_String = wl.field_d.field_Qb;
                    qi.field_e.field_V = oi.a(new String[1], ra.field_c, 2).toUpperCase();
                    jk.field_b.a(0, 40, dm.field_r.field_K, (byte) -97, dm.field_r.field_ub + -40);
                    jk.field_b.field_V = oi.a(new String[1], fm.field_c, 2);
                    var8 = jk.field_b;
                    break L2;
                  } else {
                    L3: {
                      qi.field_e.field_V = ri.field_e.toUpperCase();
                      var9 = (2 + dm.field_r.field_K) / 2;
                      ed.field_c.a(0, 40, var9 - 2, (byte) -68, dm.field_r.field_ub + -40);
                      if (wl.field_d.field_ic < wl.field_d.field_vc) {
                        ed.field_c.field_V = lc.field_h.toUpperCase();
                        ed.field_c.field_Y = true;
                        break L3;
                      } else {
                        ed.field_c.field_V = oc.field_h.toUpperCase();
                        ed.field_c.field_Y = false;
                        break L3;
                      }
                    }
                    L4: {
                      ed.field_c.field_vb = bd.field_b.field_vb;
                      if (0 >= ea.field_a) {
                        break L4;
                      } else {
                        L5: {
                          if (1 == ea.field_a) {
                            var10_ref_String = w.field_M;
                            break L5;
                          } else {
                            var10_ref_String = oi.a(new String[1], l.field_e, 2);
                            break L5;
                          }
                        }
                        L6: {
                          if ((rl.field_y & 16) != 0) {
                            break L6;
                          } else {
                            if (ad.field_h) {
                              break L6;
                            } else {
                              ed.field_c.field_vb = bd.field_b.field_x;
                              break L6;
                            }
                          }
                        }
                        ed.field_c.field_V = ed.field_c.field_V + "<br>" + var10_ref_String;
                        break L4;
                      }
                    }
                    L7: {
                      L8: {
                        ii.field_d.a(var9, 40, dm.field_r.field_K + -var9, (byte) -97, dm.field_r.field_ub + -40);
                        ii.field_d.field_V = te.field_c.toUpperCase();
                        stackOut_14_0 = ii.field_d;
                        stackIn_17_0 = stackOut_14_0;
                        stackIn_15_0 = stackOut_14_0;
                        if (!param4) {
                          break L8;
                        } else {
                          stackOut_15_0 = (km) (Object) stackIn_15_0;
                          stackIn_17_0 = stackOut_15_0;
                          stackIn_16_0 = stackOut_15_0;
                          if (d.field_Eb != 0L) {
                            break L8;
                          } else {
                            stackOut_16_0 = (km) (Object) stackIn_16_0;
                            stackOut_16_1 = 1;
                            stackIn_18_0 = stackOut_16_0;
                            stackIn_18_1 = stackOut_16_1;
                            break L7;
                          }
                        }
                      }
                      stackOut_17_0 = (km) (Object) stackIn_17_0;
                      stackOut_17_1 = 0;
                      stackIn_18_0 = stackOut_17_0;
                      stackIn_18_1 = stackOut_17_1;
                      break L7;
                    }
                    L9: {
                      stackIn_18_0.field_Y = stackIn_18_1 != 0;
                      var8 = ii.field_d;
                      var10 = 2;
                      if (null != nb.field_q) {
                        L10: {
                          if (ub.field_D == null) {
                            hk.field_Lb = new boolean[vb.field_h];
                            ub.field_D = new byte[vb.field_h];
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        var11_int = 0;
                        L11: while (true) {
                          if (var11_int >= vb.field_h) {
                            var10 = 0;
                            L12: while (true) {
                              L13: {
                                if (var10 >= 2) {
                                  break L13;
                                } else {
                                  var11_int = 0;
                                  var12 = 0;
                                  L14: while (true) {
                                    if (nb.field_q.length <= var12) {
                                      if (var11_int == 0) {
                                        var10++;
                                        continue L12;
                                      } else {
                                        break L13;
                                      }
                                    } else {
                                      var28 = nb.field_q[var12];
                                      var27 = var28;
                                      var25 = var27;
                                      var22 = var25;
                                      var13_array = var22;
                                      var14_int = 0;
                                      L15: while (true) {
                                        L16: {
                                          if (var14_int >= var28.length) {
                                            var11_int = 1;
                                            var14_int = -1;
                                            var15 = 0;
                                            L17: while (true) {
                                              if (var28.length <= var15) {
                                                hk.field_Lb[var14_int] = true;
                                                break L16;
                                              } else {
                                                L18: {
                                                  var16 = var28[var15];
                                                  if (var14_int < var16) {
                                                    var14_int = var16;
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
                                            L19: {
                                              var15 = var28[var14_int];
                                              var16 = var13_array[var14_int - -1];
                                              if (var15 == -1) {
                                                L20: {
                                                  if (0 != var10) {
                                                    stackOut_37_0 = wl.field_d.field_ic;
                                                    stackIn_38_0 = stackOut_37_0;
                                                    break L20;
                                                  } else {
                                                    stackOut_36_0 = wl.field_d.field_vc;
                                                    stackIn_38_0 = stackOut_36_0;
                                                    break L20;
                                                  }
                                                }
                                                var17_int = stackIn_38_0;
                                                if (var17_int == var16) {
                                                  break L19;
                                                } else {
                                                  break L16;
                                                }
                                              } else {
                                                if ((255 & wl.field_d.field_Pb[var15]) == var16) {
                                                  break L19;
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
                              if (hd.field_d < 2) {
                                break L9;
                              } else {
                                if (!dc.field_Y[12]) {
                                  break L9;
                                } else {
                                  var10 = 2;
                                  break L9;
                                }
                              }
                            }
                          } else {
                            hk.field_Lb[var11_int] = false;
                            var11_int++;
                            continue L11;
                          }
                        }
                      } else {
                        break L9;
                      }
                    }
                    if (2 > var10) {
                      ii.field_d.field_Y = false;
                      if (ii.field_d.field_G) {
                        var11 = null;
                        var12 = 0;
                        var13_int = 0;
                        L21: while (true) {
                          if (vb.field_h <= var13_int) {
                            L22: {
                              if (0 != var10) {
                                var13 = qa.field_a;
                                var14 = var13;
                                var14 = var13;
                                if (var12 == 0) {
                                  var14 = oi.a(new String[1], pm.field_i, 2);
                                  break L22;
                                } else {
                                  var14 = s.field_c + (String) var11;
                                  break L22;
                                }
                              } else {
                                var13 = lj.field_k;
                                var14 = var13;
                                var14 = var13;
                                if (var12 != 0) {
                                  var14 = hd.field_c + (String) var11;
                                  break L22;
                                } else {
                                  var14 = oi.a(new String[1], dk.field_r, 2);
                                  break L22;
                                }
                              }
                            }
                            wc.field_g = "<col=A00000>" + var13 + "<br>" + var14;
                            break L2;
                          } else {
                            L23: {
                              if (!hk.field_Lb[var13_int]) {
                                break L23;
                              } else {
                                break L23;
                              }
                            }
                            var13_int++;
                            continue L21;
                          }
                        }
                      } else {
                        break L2;
                      }
                    } else {
                      L24: {
                        if (rf.field_i != null) {
                          break L24;
                        } else {
                          if (null != gg.field_E) {
                            break L24;
                          } else {
                            if (null != wm.field_B) {
                              break L24;
                            } else {
                              if (null != mb.field_db) {
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
                        if (vb.field_h <= var16) {
                          var16 = 0;
                          var17 = wm.field_r.field_Jb.field_W;
                          var18_ref = (lk) (Object) var17.a((byte) -72);
                          L26: while (true) {
                            L27: {
                              if (var18_ref == null) {
                                break L27;
                              } else {
                                L28: {
                                  if (var18_ref.g(0)) {
                                    break L28;
                                  } else {
                                    L29: {
                                      if (var11_int == 0) {
                                        break L29;
                                      } else {
                                        if (var18_ref.field_Jb) {
                                          break L29;
                                        } else {
                                          var16 = 1;
                                          break L27;
                                        }
                                      }
                                    }
                                    if (var13_int <= var18_ref.field_Vb) {
                                      if (var18_ref.field_Rb >= var14_int) {
                                        if (0 < (~var18_ref.field_Fb & var15)) {
                                          var16 = 1;
                                          break L27;
                                        } else {
                                          if (var12 == 0) {
                                            break L28;
                                          } else {
                                            var16 = 1;
                                            break L27;
                                          }
                                        }
                                      } else {
                                        var16 = 1;
                                        break L27;
                                      }
                                    } else {
                                      var16 = 1;
                                      break L27;
                                    }
                                  }
                                }
                                var18_ref = (lk) (Object) var17.a(16213);
                                continue L26;
                              }
                            }
                            L30: {
                              if (hd.field_d < 2) {
                                break L30;
                              } else {
                                if (dc.field_Y[12]) {
                                  var16 = 0;
                                  break L30;
                                } else {
                                  break L30;
                                }
                              }
                            }
                            if (var16 != 0) {
                              ii.field_d.field_Y = false;
                              if (!ii.field_d.field_G) {
                                break L2;
                              } else {
                                if (0 == he.field_pc.field_c.field_Hb) {
                                  wc.field_g = am.field_a;
                                  break L2;
                                } else {
                                  wc.field_g = oi.a(new String[1], oe.field_a, 2);
                                  break L2;
                                }
                              }
                            } else {
                              break L2;
                            }
                          }
                        } else {
                          L31: {
                            var17_int = wl.field_d.field_Pb[var16] & 255;
                            if (null == rf.field_i) {
                              break L31;
                            } else {
                              if (rf.field_i[var16] != null) {
                                if (!rf.field_i[var16][var17_int]) {
                                  break L31;
                                } else {
                                  var11_int = 1;
                                  break L31;
                                }
                              } else {
                                break L31;
                              }
                            }
                          }
                          L32: {
                            if (gg.field_E == null) {
                              break L32;
                            } else {
                              if (gg.field_E[var16] != null) {
                                L33: {
                                  var18_int = gg.field_E[var16][var17_int];
                                  if (var13_int >= var18_int) {
                                    break L33;
                                  } else {
                                    var13_int = var18_int;
                                    break L33;
                                  }
                                }
                                if (var18_int == 0) {
                                  break L32;
                                } else {
                                  if (gi.field_a) {
                                    break L32;
                                  } else {
                                    var11_int = 1;
                                    break L32;
                                  }
                                }
                              } else {
                                break L32;
                              }
                            }
                          }
                          L34: {
                            if (mb.field_db == null) {
                              break L34;
                            } else {
                              if (mb.field_db[var16] != null) {
                                var15 = var15 | mb.field_db[var16][var17_int];
                                break L34;
                              } else {
                                break L34;
                              }
                            }
                          }
                          L35: {
                            if (wm.field_B == null) {
                              break L35;
                            } else {
                              break L35;
                            }
                          }
                          var16++;
                          continue L25;
                        }
                      }
                    }
                  }
                }
                L36: {
                  if (d.field_Eb == 0L) {
                    break L36;
                  } else {
                    L37: {
                      var9 = (int)(-hc.a(-9986) + d.field_Eb);
                      var9 = (999 + var9) / 1000;
                      if (var9 < 1) {
                        var9 = 1;
                        break L37;
                      } else {
                        break L37;
                      }
                    }
                    var8.field_V = oi.a(new String[1], va.field_a, 2);
                    break L36;
                  }
                }
                qh.field_R.field_V = oi.a(new String[2], gb.field_M, 2);
                break L1;
              }
            }
            L38: {
              L39: {
                stackOut_132_0 = ao.field_Eb;
                stackIn_136_0 = stackOut_132_0;
                stackIn_133_0 = stackOut_132_0;
                if (!param3) {
                  break L39;
                } else {
                  stackOut_133_0 = (km) (Object) stackIn_133_0;
                  stackIn_136_0 = stackOut_133_0;
                  stackIn_134_0 = stackOut_133_0;
                  if (param0) {
                    break L39;
                  } else {
                    stackOut_134_0 = (km) (Object) stackIn_134_0;
                    stackIn_136_0 = stackOut_134_0;
                    stackIn_135_0 = stackOut_134_0;
                    if (ad.field_h) {
                      break L39;
                    } else {
                      stackOut_135_0 = (km) (Object) stackIn_135_0;
                      stackOut_135_1 = 1;
                      stackIn_137_0 = stackOut_135_0;
                      stackIn_137_1 = stackOut_135_1;
                      break L38;
                    }
                  }
                }
              }
              stackOut_136_0 = (km) (Object) stackIn_136_0;
              stackOut_136_1 = 0;
              stackIn_137_0 = stackOut_136_0;
              stackIn_137_1 = stackOut_136_1;
              break L38;
            }
            ((km) (Object) stackIn_137_0).a(stackIn_137_1 != 0, (byte) 94);
            L40: {
              L41: {
                stackOut_139_0 = dm.field_r;
                stackIn_143_0 = stackOut_139_0;
                stackIn_140_0 = stackOut_139_0;
                if (!param3) {
                  break L41;
                } else {
                  stackOut_140_0 = (km) (Object) stackIn_140_0;
                  stackIn_143_0 = stackOut_140_0;
                  stackIn_141_0 = stackOut_140_0;
                  if (param0) {
                    break L41;
                  } else {
                    stackOut_141_0 = (km) (Object) stackIn_141_0;
                    stackIn_143_0 = stackOut_141_0;
                    stackIn_142_0 = stackOut_141_0;
                    if (ad.field_h) {
                      break L41;
                    } else {
                      stackOut_142_0 = (km) (Object) stackIn_142_0;
                      stackOut_142_1 = 1;
                      stackIn_144_0 = stackOut_142_0;
                      stackIn_144_1 = stackOut_142_1;
                      break L40;
                    }
                  }
                }
              }
              stackOut_143_0 = (km) (Object) stackIn_143_0;
              stackOut_143_1 = 0;
              stackIn_144_0 = stackOut_143_0;
              stackIn_144_1 = stackOut_143_1;
              break L40;
            }
            L42: {
              L43: {
                ((km) (Object) stackIn_144_0).a(stackIn_144_1 != 0, (byte) 123);
                stackOut_144_0 = pm.field_n;
                stackIn_148_0 = stackOut_144_0;
                stackIn_145_0 = stackOut_144_0;
                if (!param3) {
                  break L43;
                } else {
                  stackOut_145_0 = (km) (Object) stackIn_145_0;
                  stackIn_148_0 = stackOut_145_0;
                  stackIn_146_0 = stackOut_145_0;
                  if (param0) {
                    break L43;
                  } else {
                    stackOut_146_0 = (km) (Object) stackIn_146_0;
                    stackIn_148_0 = stackOut_146_0;
                    stackIn_147_0 = stackOut_146_0;
                    if (!ad.field_h) {
                      break L43;
                    } else {
                      stackOut_147_0 = (km) (Object) stackIn_147_0;
                      stackOut_147_1 = 1;
                      stackIn_149_0 = stackOut_147_0;
                      stackIn_149_1 = stackOut_147_1;
                      break L42;
                    }
                  }
                }
              }
              stackOut_148_0 = (km) (Object) stackIn_148_0;
              stackOut_148_1 = 0;
              stackIn_149_0 = stackOut_148_0;
              stackIn_149_1 = stackOut_148_1;
              break L42;
            }
            L44: {
              ((km) (Object) stackIn_149_0).a(stackIn_149_1 != 0, (byte) 122);
              he.field_pc.field_c.g(0);
              if (null == wl.field_d) {
                break L44;
              } else {
                L45: {
                  if (fb.field_o.field_nb != 0) {
                    nn.a(wl.field_d.e((byte) -124), 11, (byte) -128);
                    break L45;
                  } else {
                    break L45;
                  }
                }
                L46: {
                  if (ii.field_d.field_nb == 0) {
                    break L46;
                  } else {
                    ah.field_c = true;
                    break L46;
                  }
                }
                L47: {
                  if (ed.field_c.field_nb != 0) {
                    ad.field_h = true;
                    break L47;
                  } else {
                    break L47;
                  }
                }
                L48: {
                  if (0 == na.field_Ib.field_nb) {
                    break L48;
                  } else {
                    ad.field_h = false;
                    break L48;
                  }
                }
                co.a(11, false, -2137400888, wl.field_d);
                break L44;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var5, "qk.A(" + param0 + ',' + 11 + ',' + 80 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(wb param0, byte param1) {
        try {
            if (!(null == param0.field_k)) {
                param0.c(78);
            }
            param0.field_k = ((qk) this).field_c.field_k;
            if (param1 < 87) {
                Object var4 = null;
                ((qk) this).a((wb) null, (byte) 78);
            }
            param0.field_h = ((qk) this).field_c;
            param0.field_k.field_h = param0;
            param0.field_h.field_k = param0;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "qk.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void c() {
        field_d = null;
    }

    final static void b() {
        String var2 = null;
        if (null != cf.field_b) {
            var2 = cf.field_b;
            String var1 = var2;
            on.a((byte) 106, oi.a(new String[1], sa.field_o, 2));
            cf.field_b = null;
        }
    }

    final int b(int param0) {
        int var4 = Virogrid.field_F ? 1 : 0;
        int var2 = param0;
        wb var3 = ((qk) this).field_c.field_h;
        while (((qk) this).field_c != var3) {
            var3 = var3.field_h;
            var2++;
        }
        return var2;
    }

    final static void a(boolean param0) {
        mg var1 = null;
        mg var2 = null;
        int var3 = 0;
        int var4 = Virogrid.field_F ? 1 : 0;
        try {
            var1 = new mg(540, 140);
            int discarded$4 = 16865;
            kb.a(var1);
            if (param0) {
                qk.a(true);
            }
            fk.a();
            df.c();
            kf.field_e = 0;
            int discarded$5 = 11;
            cm.a();
            var2 = var1.d();
            for (var3 = 0; var3 < 15; var3++) {
                var2.d(-2, -2, 16777215);
                int discarded$6 = 140;
                int discarded$7 = 540;
                int discarded$8 = 0;
                int discarded$9 = 0;
                int discarded$10 = 4;
                int discarded$11 = 4;
                df.d();
            }
            cc.field_u.b();
            var1.e(0, 0);
            ai.a(true);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "qk.D(" + param0 + ')');
        }
    }

    final wb a(byte param0) {
        wb var2 = ((qk) this).field_c.field_h;
        if (param0 != -103) {
            Object var3 = null;
            qk.a((String) null, (java.applet.Applet) null, -78);
        }
        if (((qk) this).field_c == var2) {
            return null;
        }
        var2.c(26);
        return var2;
    }

    final wb a(int param0) {
        wb var2 = ((qk) this).field_a;
        if (((qk) this).field_c == var2) {
            ((qk) this).field_a = null;
            return null;
        }
        ((qk) this).field_a = var2.field_h;
        if (param0 != 26605) {
            ((qk) this).field_a = null;
        }
        return var2;
    }

    final static void a(String param0, java.applet.Applet param1, int param2) {
        try {
            String var3 = null;
            String var4 = null;
            String var5 = null;
            try {
                jj.field_g = param0;
                try {
                    var3 = param1.getParameter("cookieprefix");
                    var4 = param1.getParameter("cookiehost");
                    var5 = var3 + "session=" + param0 + "; version=1; path=/; domain=" + var4;
                    if (!(~param0.length() != param2)) {
                        var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    }
                    q.a("document.cookie=\"" + var5 + "\"", -17107, param1);
                } catch (Throwable throwable) {
                }
                int discarded$0 = 49;
                wf.a(param1);
            } catch (RuntimeException runtimeException) {
                throw kg.a((Throwable) (Object) runtimeException, "qk.H(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public qk() {
        ((qk) this).field_c = new wb();
        ((qk) this).field_c.field_h = ((qk) this).field_c;
        ((qk) this).field_c.field_k = ((qk) this).field_c;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 64;
        field_d = new String[]{"The Easy One", "Perfect Jump", "Virogrid Expert", "Total domination", "Winning streak", "You lose", "Entrapment", "Bunny Hopping", "Virogrid Addict", "Ghost Spotter"};
    }
}
