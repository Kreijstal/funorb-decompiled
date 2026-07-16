/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class lu extends am {
    int field_n;
    int field_v;
    static ut[] field_p;
    static String[] field_x;
    int field_o;
    static String field_t;
    static String field_r;
    int field_s;
    int field_q;
    static String field_u;
    int field_w;

    final static void a(int param0, int param1) {
        ml var2 = null;
        int var3 = 0;
        int var4 = 0;
        var2 = or.field_d;
        var2.b(param1, (byte) 108);
        var2.field_n = var2.field_n + 1;
        var3 = var2.field_n;
        if (param0 != 6773) {
          return;
        } else {
          var2.a(param0 + -6660, 5);
          var2.a(123, uv.field_i.field_bc);
          var4 = (uv.field_i.field_Mb << 697071814) + uv.field_i.field_Wb;
          var2.a(106, var4);
          var2.a(0, uv.field_i.field_Eb.length, param0 ^ 1991213509, uv.field_i.field_Eb);
          var2.c(62, var2.field_n - var3);
          return;
        }
    }

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5);

    final static void a(boolean param0, int param1, int param2, boolean param3, boolean param4) {
        hd var6 = null;
        hd var7 = null;
        hd var8 = null;
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
        tf var17 = null;
        int var17_int = 0;
        Object var18 = null;
        he var18_ref = null;
        int var18_int = 0;
        int var19 = 0;
        int[] var20 = null;
        hd var22 = null;
        int[] var23 = null;
        String var24 = null;
        int[] var26 = null;
        hd var27 = null;
        int[] var28 = null;
        String var29 = null;
        String var30 = null;
        int[] var31 = null;
        hd stackIn_16_0 = null;
        hd stackIn_17_0 = null;
        hd stackIn_18_0 = null;
        hd stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_40_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_59_0 = 0;
        Object stackIn_72_0 = null;
        boolean stackIn_122_0 = false;
        boolean stackIn_140_0 = false;
        int stackIn_156_0 = 0;
        hd stackIn_172_0 = null;
        int stackIn_172_1 = 0;
        hd stackIn_173_0 = null;
        int stackIn_173_1 = 0;
        hd stackIn_174_0 = null;
        int stackIn_174_1 = 0;
        hd stackIn_175_0 = null;
        int stackIn_175_1 = 0;
        hd stackIn_176_0 = null;
        int stackIn_176_1 = 0;
        int stackIn_176_2 = 0;
        hd stackIn_177_0 = null;
        int stackIn_177_1 = 0;
        hd stackIn_178_0 = null;
        int stackIn_178_1 = 0;
        hd stackIn_179_0 = null;
        int stackIn_179_1 = 0;
        hd stackIn_180_0 = null;
        int stackIn_180_1 = 0;
        hd stackIn_181_0 = null;
        int stackIn_181_1 = 0;
        int stackIn_181_2 = 0;
        hd stackIn_182_0 = null;
        int stackIn_182_1 = 0;
        hd stackIn_183_0 = null;
        int stackIn_183_1 = 0;
        hd stackIn_184_0 = null;
        int stackIn_184_1 = 0;
        hd stackIn_185_0 = null;
        int stackIn_185_1 = 0;
        hd stackIn_186_0 = null;
        int stackIn_186_1 = 0;
        int stackIn_186_2 = 0;
        Object stackIn_187_0 = null;
        hd stackOut_15_0 = null;
        hd stackOut_16_0 = null;
        hd stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        hd stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        int stackOut_39_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_49_1 = 0;
        int stackOut_58_0 = 0;
        boolean stackOut_139_0 = false;
        Object stackOut_71_0 = null;
        boolean stackOut_121_0 = false;
        int stackOut_155_0 = 0;
        hd stackOut_171_0 = null;
        int stackOut_171_1 = 0;
        hd stackOut_172_0 = null;
        int stackOut_172_1 = 0;
        hd stackOut_173_0 = null;
        int stackOut_173_1 = 0;
        hd stackOut_174_0 = null;
        int stackOut_174_1 = 0;
        int stackOut_174_2 = 0;
        hd stackOut_175_0 = null;
        int stackOut_175_1 = 0;
        int stackOut_175_2 = 0;
        hd stackOut_176_0 = null;
        int stackOut_176_1 = 0;
        hd stackOut_177_0 = null;
        int stackOut_177_1 = 0;
        hd stackOut_178_0 = null;
        int stackOut_178_1 = 0;
        hd stackOut_179_0 = null;
        int stackOut_179_1 = 0;
        int stackOut_179_2 = 0;
        hd stackOut_180_0 = null;
        int stackOut_180_1 = 0;
        int stackOut_180_2 = 0;
        hd stackOut_181_0 = null;
        int stackOut_181_1 = 0;
        hd stackOut_182_0 = null;
        int stackOut_182_1 = 0;
        hd stackOut_183_0 = null;
        int stackOut_183_1 = 0;
        hd stackOut_184_0 = null;
        int stackOut_184_1 = 0;
        int stackOut_184_2 = 0;
        hd stackOut_185_0 = null;
        int stackOut_185_1 = 0;
        int stackOut_185_2 = 0;
        Object stackOut_186_0 = null;
        L0: {
          L1: {
            var18 = null;
            var19 = Kickabout.field_G;
            dw.a(7, ee.field_b);
            if (uv.field_i == null) {
              break L1;
            } else {
              L2: {
                L3: {
                  ac.field_b.field_lb = true;
                  em.field_d.field_mb = 0;
                  var22 = em.field_d;
                  var27 = var22;
                  var27.field_q = 0;
                  ua.field_k.field_mb = 0;
                  var6 = ua.field_k;
                  var6.field_q = 0;
                  nv.field_F.field_mb = 0;
                  var7 = nv.field_F;
                  var7.field_q = 0;
                  if (!np.a(113)) {
                    break L3;
                  } else {
                    L4: {
                      L5: {
                        ci.field_h.field_E = kf.field_zb.toUpperCase();
                        var9 = (fp.field_p.field_q - -2) / 2;
                        em.field_d.a(true, var9 + -2, 0, -40 + fp.field_p.field_mb, 40);
                        if (uv.field_i.field_bc <= uv.field_i.field_gc) {
                          break L5;
                        } else {
                          em.field_d.field_E = po.field_b.toUpperCase();
                          em.field_d.field_lb = true;
                          if (var19 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      em.field_d.field_E = no.field_I.toUpperCase();
                      em.field_d.field_lb = false;
                      break L4;
                    }
                    L6: {
                      em.field_d.field_R = vg.field_Qb.field_R;
                      if ((fh.field_b ^ -1) < -1) {
                        L7: {
                          L8: {
                            if ((fh.field_b ^ -1) == -2) {
                              break L8;
                            } else {
                              var10_ref_String = vo.a((byte) -18, jb.field_f, new String[1]);
                              if (var19 == 0) {
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                          var10_ref_String = kp.field_i;
                          break L7;
                        }
                        em.field_d.field_E = em.field_d.field_E + "<br>" + var10_ref_String;
                        if ((16 & de.field_c) != 0) {
                          break L6;
                        } else {
                          if (!td.field_b) {
                            em.field_d.field_R = vg.field_Qb.field_S;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                      } else {
                        break L6;
                      }
                    }
                    L9: {
                      L10: {
                        ua.field_k.a(true, fp.field_p.field_q + -var9, var9, -40 + fp.field_p.field_mb, 40);
                        ua.field_k.field_E = hj.field_g.toUpperCase();
                        stackOut_15_0 = ua.field_k;
                        stackIn_18_0 = stackOut_15_0;
                        stackIn_16_0 = stackOut_15_0;
                        if (!param3) {
                          break L10;
                        } else {
                          stackOut_16_0 = (hd) (Object) stackIn_16_0;
                          stackIn_18_0 = stackOut_16_0;
                          stackIn_17_0 = stackOut_16_0;
                          if (0L != vg.field_Ib) {
                            break L10;
                          } else {
                            stackOut_17_0 = (hd) (Object) stackIn_17_0;
                            stackOut_17_1 = 1;
                            stackIn_19_0 = stackOut_17_0;
                            stackIn_19_1 = stackOut_17_1;
                            break L9;
                          }
                        }
                      }
                      stackOut_18_0 = (hd) (Object) stackIn_18_0;
                      stackOut_18_1 = 0;
                      stackIn_19_0 = stackOut_18_0;
                      stackIn_19_1 = stackOut_18_1;
                      break L9;
                    }
                    L11: {
                      stackIn_19_0.field_lb = stackIn_19_1 != 0;
                      var8 = ua.field_k;
                      var10 = 2;
                      if (la.field_k != null) {
                        L12: {
                          if (hm.field_G == null) {
                            m.field_f = new boolean[ss.field_j];
                            hm.field_G = new byte[ss.field_j];
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                        var11_int = 0;
                        L13: while (true) {
                          L14: {
                            if (ss.field_j <= var11_int) {
                              var10 = 0;
                              break L14;
                            } else {
                              m.field_f[var11_int] = false;
                              var11_int++;
                              if (var19 != 0) {
                                break L14;
                              } else {
                                continue L13;
                              }
                            }
                          }
                          L15: while (true) {
                            L16: {
                              L17: {
                                if ((var10 ^ -1) <= -3) {
                                  break L17;
                                } else {
                                  var11_int = 0;
                                  stackOut_31_0 = 0;
                                  stackIn_59_0 = stackOut_31_0;
                                  stackIn_32_0 = stackOut_31_0;
                                  if (var19 != 0) {
                                    break L16;
                                  } else {
                                    var12 = stackIn_32_0;
                                    L18: while (true) {
                                      stackOut_33_0 = var12;
                                      stackOut_33_1 = la.field_k.length;
                                      stackIn_34_0 = stackOut_33_0;
                                      stackIn_34_1 = stackOut_33_1;
                                      L19: while (true) {
                                        if (stackIn_34_0 >= stackIn_34_1) {
                                          if (var11_int != 0) {
                                            break L17;
                                          } else {
                                            var10++;
                                            continue L15;
                                          }
                                        } else {
                                          L20: {
                                            L21: {
                                              var31 = la.field_k[var12];
                                              var28 = var31;
                                              var26 = var28;
                                              var23 = var26;
                                              var20 = var23;
                                              var13_array = var20;
                                              var14_int = 0;
                                              if (var14_int >= var31.length) {
                                                break L21;
                                              } else {
                                                L22: {
                                                  L23: {
                                                    var15 = var31[var14_int];
                                                    var16 = var20[var14_int + 1];
                                                    if (var15 != -1) {
                                                      break L23;
                                                    } else {
                                                      L24: {
                                                        if (0 == var10) {
                                                          stackOut_39_0 = uv.field_i.field_bc;
                                                          stackIn_40_0 = stackOut_39_0;
                                                          break L24;
                                                        } else {
                                                          stackOut_38_0 = uv.field_i.field_gc;
                                                          stackIn_40_0 = stackOut_38_0;
                                                          break L24;
                                                        }
                                                      }
                                                      L25: {
                                                        var17_int = stackIn_40_0;
                                                        if (var17_int == var16) {
                                                          break L25;
                                                        } else {
                                                          if (var19 == 0) {
                                                            break L20;
                                                          } else {
                                                            break L25;
                                                          }
                                                        }
                                                      }
                                                      if (var19 == 0) {
                                                        break L22;
                                                      } else {
                                                        break L23;
                                                      }
                                                    }
                                                  }
                                                  if ((uv.field_i.field_Eb[var15] & 255) == var16) {
                                                    break L22;
                                                  } else {
                                                    break L22;
                                                  }
                                                }
                                                var14_int += 2;
                                                break L21;
                                              }
                                            }
                                            L26: {
                                              var11_int = 1;
                                              var14_int = -1;
                                              var15 = 0;
                                              if (var31.length <= var15) {
                                                break L26;
                                              } else {
                                                var16 = var31[var15];
                                                stackOut_49_0 = var14_int ^ -1;
                                                stackOut_49_1 = var16 ^ -1;
                                                stackIn_34_0 = stackOut_49_0;
                                                stackIn_34_1 = stackOut_49_1;
                                                stackIn_50_0 = stackOut_49_0;
                                                stackIn_50_1 = stackOut_49_1;
                                                if (var19 != 0) {
                                                  continue L19;
                                                } else {
                                                  L27: {
                                                    if (stackIn_50_0 <= stackIn_50_1) {
                                                      break L27;
                                                    } else {
                                                      var14_int = var16;
                                                      break L27;
                                                    }
                                                  }
                                                  var15 += 2;
                                                  break L26;
                                                }
                                              }
                                            }
                                            m.field_f[var14_int] = true;
                                            break L20;
                                          }
                                          var12++;
                                          continue L18;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_58_0 = 2;
                              stackIn_59_0 = stackOut_58_0;
                              break L16;
                            }
                            if (stackIn_59_0 > tk.field_Ib) {
                              break L11;
                            } else {
                              if (ne.field_G[12]) {
                                var10 = 2;
                                break L11;
                              } else {
                                break L11;
                              }
                            }
                          }
                        }
                      } else {
                        break L11;
                      }
                    }
                    L28: {
                      L29: {
                        L30: {
                          L31: {
                            if ((var10 ^ -1) > -3) {
                              ua.field_k.field_lb = false;
                              if (!ua.field_k.field_Q) {
                                break L28;
                              } else {
                                var11 = null;
                                var12 = 0;
                                var13_int = 0;
                                L32: while (true) {
                                  if (ss.field_j <= var13_int) {
                                    break L30;
                                  } else {
                                    stackOut_139_0 = m.field_f[var13_int];
                                    stackIn_156_0 = stackOut_139_0 ? 1 : 0;
                                    stackIn_140_0 = stackOut_139_0;
                                    if (var19 != 0) {
                                      break L29;
                                    } else {
                                      L33: {
                                        if (stackIn_140_0) {
                                          L34: {
                                            var29 = "<col=A00000>" + ok.field_b[var13_int] + "</col>";
                                            if (var11 == null) {
                                              break L34;
                                            } else {
                                              var12 = 1;
                                              var11 = (Object) (Object) (var11 + ", " + var29);
                                              if (var19 == 0) {
                                                break L33;
                                              } else {
                                                break L34;
                                              }
                                            }
                                          }
                                          var11 = (Object) (Object) var29;
                                          break L33;
                                        } else {
                                          break L33;
                                        }
                                      }
                                      var13_int++;
                                      if (var19 == 0) {
                                        continue L32;
                                      } else {
                                        break L31;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              L35: {
                                if (null != ds.field_h) {
                                  break L35;
                                } else {
                                  if (null != lh.field_E) {
                                    break L35;
                                  } else {
                                    if (null != so.field_f) {
                                      break L35;
                                    } else {
                                      if (null == hm.field_D) {
                                        break L28;
                                      } else {
                                        break L35;
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
                              L36: while (true) {
                                L37: {
                                  if (var16 >= ss.field_j) {
                                    break L37;
                                  } else {
                                    var17_int = 255 & uv.field_i.field_Eb[var16];
                                    stackOut_71_0 = null;
                                    stackIn_187_0 = stackOut_71_0;
                                    stackIn_72_0 = stackOut_71_0;
                                    if (var19 != 0) {
                                      break L0;
                                    } else {
                                      L38: {
                                        if (stackIn_72_0 == (Object) (Object) ds.field_h) {
                                          break L38;
                                        } else {
                                          if (ds.field_h[var16] == null) {
                                            break L38;
                                          } else {
                                            if (!ds.field_h[var16][var17_int]) {
                                              break L38;
                                            } else {
                                              var11_int = 1;
                                              break L38;
                                            }
                                          }
                                        }
                                      }
                                      L39: {
                                        if (lh.field_E == null) {
                                          break L39;
                                        } else {
                                          if (lh.field_E[var16] == null) {
                                            break L39;
                                          } else {
                                            L40: {
                                              var18_int = lh.field_E[var16][var17_int];
                                              if (var18_int == 0) {
                                                break L40;
                                              } else {
                                                if (fv.field_d) {
                                                  break L40;
                                                } else {
                                                  var11_int = 1;
                                                  break L40;
                                                }
                                              }
                                            }
                                            if (var18_int <= var13_int) {
                                              break L39;
                                            } else {
                                              var13_int = var18_int;
                                              break L39;
                                            }
                                          }
                                        }
                                      }
                                      L41: {
                                        if (null == so.field_f) {
                                          break L41;
                                        } else {
                                          if (so.field_f[var16] != null) {
                                            L42: {
                                              var18_int = so.field_f[var16][var17_int];
                                              if (var18_int > var14_int) {
                                                var14_int = var18_int;
                                                break L42;
                                              } else {
                                                break L42;
                                              }
                                            }
                                            if (-1 == (var18_int ^ -1)) {
                                              break L41;
                                            } else {
                                              if (fv.field_d) {
                                                break L41;
                                              } else {
                                                var11_int = 1;
                                                break L41;
                                              }
                                            }
                                          } else {
                                            break L41;
                                          }
                                        }
                                      }
                                      L43: {
                                        if (null == hm.field_D) {
                                          break L43;
                                        } else {
                                          if (null == hm.field_D[var16]) {
                                            break L43;
                                          } else {
                                            var15 = var15 | hm.field_D[var16][var17_int];
                                            break L43;
                                          }
                                        }
                                      }
                                      var16++;
                                      if (var19 == 0) {
                                        continue L36;
                                      } else {
                                        break L37;
                                      }
                                    }
                                  }
                                }
                                L44: {
                                  var16 = 0;
                                  var17 = bs.field_c.field_Ab.field_jb;
                                  var18_ref = (he) (Object) var17.g(24009);
                                  if (var18_ref == null) {
                                    break L44;
                                  } else {
                                    L45: {
                                      if (var18_ref.h(-13356)) {
                                        break L45;
                                      } else {
                                        L46: {
                                          if (var11_int == 0) {
                                            break L46;
                                          } else {
                                            if (var18_ref.field_Cb) {
                                              break L46;
                                            } else {
                                              var16 = 1;
                                              if (var19 == 0) {
                                                break L44;
                                              } else {
                                                break L46;
                                              }
                                            }
                                          }
                                        }
                                        L47: {
                                          if (var18_ref.field_Qb >= var13_int) {
                                            break L47;
                                          } else {
                                            var16 = 1;
                                            break L47;
                                          }
                                        }
                                        L48: {
                                          if (var14_int > var18_ref.field_Db) {
                                            var16 = 1;
                                            break L48;
                                          } else {
                                            break L48;
                                          }
                                        }
                                        L49: {
                                          if ((var15 & (var18_ref.field_Pb ^ -1)) > 0) {
                                            var16 = 1;
                                            break L49;
                                          } else {
                                            break L49;
                                          }
                                        }
                                        if (var12 == 0) {
                                          break L45;
                                        } else {
                                          var16 = 1;
                                          break L45;
                                        }
                                      }
                                    }
                                    var18_ref = (he) (Object) var17.c(param2 ^ -33);
                                    break L44;
                                  }
                                }
                                L50: {
                                  if ((tk.field_Ib ^ -1) > -3) {
                                    break L50;
                                  } else {
                                    if (ne.field_G[12]) {
                                      var16 = 0;
                                      break L50;
                                    } else {
                                      break L50;
                                    }
                                  }
                                }
                                L51: {
                                  if (var16 != 0) {
                                    break L51;
                                  } else {
                                    if (var19 == 0) {
                                      break L28;
                                    } else {
                                      ua.field_k.field_lb = false;
                                      if (!ua.field_k.field_Q) {
                                        break L28;
                                      } else {
                                        var11 = null;
                                        var12 = 0;
                                        var13_int = 0;
                                        L52: while (true) {
                                          if (ss.field_j <= var13_int) {
                                            break L30;
                                          } else {
                                            stackOut_121_0 = m.field_f[var13_int];
                                            stackIn_156_0 = stackOut_121_0 ? 1 : 0;
                                            stackIn_122_0 = stackOut_121_0;
                                            if (var19 != 0) {
                                              break L29;
                                            } else {
                                              L53: {
                                                if (stackIn_122_0) {
                                                  L54: {
                                                    var24 = "<col=A00000>" + ok.field_b[var13_int] + "</col>";
                                                    if (var11 == null) {
                                                      break L54;
                                                    } else {
                                                      var12 = 1;
                                                      var11 = (Object) (Object) (var11 + ", " + var24);
                                                      if (var19 == 0) {
                                                        break L53;
                                                      } else {
                                                        break L54;
                                                      }
                                                    }
                                                  }
                                                  var11 = (Object) (Object) var24;
                                                  break L53;
                                                } else {
                                                  break L53;
                                                }
                                              }
                                              var13_int++;
                                              if (var19 == 0) {
                                                continue L52;
                                              } else {
                                                break L51;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                L55: {
                                  ua.field_k.field_lb = false;
                                  if (ua.field_k.field_Q) {
                                    L56: {
                                      if (ni.field_l.field_b.field_Db != 0) {
                                        break L56;
                                      } else {
                                        sn.field_e = pp.field_m;
                                        if (var19 == 0) {
                                          break L55;
                                        } else {
                                          break L56;
                                        }
                                      }
                                    }
                                    sn.field_e = vo.a((byte) -18, pu.field_Fb, new String[1]);
                                    break L55;
                                  } else {
                                    break L55;
                                  }
                                }
                                if (var19 == 0) {
                                  break L28;
                                } else {
                                  break L31;
                                }
                              }
                            }
                          }
                          ua.field_k.field_lb = false;
                          if (!ua.field_k.field_Q) {
                            break L28;
                          } else {
                            var11 = null;
                            var12 = 0;
                            var13_int = 0;
                            L57: while (true) {
                              if (ss.field_j <= var13_int) {
                                break L30;
                              } else {
                                L58: {
                                  if (m.field_f[var13_int]) {
                                    L59: {
                                      var30 = "<col=A00000>" + ok.field_b[var13_int] + "</col>";
                                      if (var11 == null) {
                                        break L59;
                                      } else {
                                        var12 = 1;
                                        var11 = (Object) (Object) (var11 + ", " + var30);
                                        if (var19 == 0) {
                                          break L58;
                                        } else {
                                          break L59;
                                        }
                                      }
                                    }
                                    var11 = (Object) (Object) var30;
                                    break L58;
                                  } else {
                                    break L58;
                                  }
                                }
                                var13_int++;
                                if (var19 == 0) {
                                  continue L57;
                                } else {
                                  break L30;
                                }
                              }
                            }
                          }
                        }
                        stackOut_155_0 = var10 ^ -1;
                        stackIn_156_0 = stackOut_155_0;
                        break L29;
                      }
                      L60: {
                        if (stackIn_156_0 != -1) {
                          L61: {
                            var13 = os.field_w;
                            if (var12 == 0) {
                              break L61;
                            } else {
                              var14 = oi.field_k + var11;
                              break L61;
                            }
                          }
                          var14 = vo.a((byte) -18, bp.field_yb, new String[1]);
                          break L60;
                        } else {
                          L62: {
                            var13 = sb.field_g;
                            if (var12 != 0) {
                              break L62;
                            } else {
                              var14 = vo.a((byte) -18, kb.field_D, new String[1]);
                              break L62;
                            }
                          }
                          var14 = gm.field_S + var11;
                          break L60;
                        }
                      }
                      sn.field_e = "<col=A00000>" + var13 + "<br>" + var14;
                      break L28;
                    }
                    if (var19 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                var9_ref_String = uv.field_i.field_ec;
                ci.field_h.field_E = vo.a((byte) -18, bv.field_m, new String[1]).toUpperCase();
                nv.field_F.a(true, fp.field_p.field_q, 0, fp.field_p.field_mb - 40, 40);
                nv.field_F.field_E = vo.a((byte) -18, wa.field_c, new String[1]);
                var8 = nv.field_F;
                break L2;
              }
              L63: {
                if ((vg.field_Ib ^ -1L) == -1L) {
                  break L63;
                } else {
                  L64: {
                    var9 = (int)(-nj.a(22) + vg.field_Ib);
                    var9 = (var9 - -999) / 1000;
                    if ((var9 ^ -1) <= -2) {
                      break L64;
                    } else {
                      var9 = 1;
                      break L64;
                    }
                  }
                  var8.field_E = vo.a((byte) -18, gf.field_h, new String[1]);
                  break L63;
                }
              }
              ka.field_c.field_E = vo.a((byte) -18, ib.field_F, new String[2]);
              break L1;
            }
          }
          L65: {
            L66: {
              stackOut_171_0 = dn.field_Cb;
              stackOut_171_1 = param2 ^ param2;
              stackIn_175_0 = stackOut_171_0;
              stackIn_175_1 = stackOut_171_1;
              stackIn_172_0 = stackOut_171_0;
              stackIn_172_1 = stackOut_171_1;
              if (!param0) {
                break L66;
              } else {
                stackOut_172_0 = (hd) (Object) stackIn_172_0;
                stackOut_172_1 = stackIn_172_1;
                stackIn_175_0 = stackOut_172_0;
                stackIn_175_1 = stackOut_172_1;
                stackIn_173_0 = stackOut_172_0;
                stackIn_173_1 = stackOut_172_1;
                if (param4) {
                  break L66;
                } else {
                  stackOut_173_0 = (hd) (Object) stackIn_173_0;
                  stackOut_173_1 = stackIn_173_1;
                  stackIn_175_0 = stackOut_173_0;
                  stackIn_175_1 = stackOut_173_1;
                  stackIn_174_0 = stackOut_173_0;
                  stackIn_174_1 = stackOut_173_1;
                  if (td.field_b) {
                    break L66;
                  } else {
                    stackOut_174_0 = (hd) (Object) stackIn_174_0;
                    stackOut_174_1 = stackIn_174_1;
                    stackOut_174_2 = 1;
                    stackIn_176_0 = stackOut_174_0;
                    stackIn_176_1 = stackOut_174_1;
                    stackIn_176_2 = stackOut_174_2;
                    break L65;
                  }
                }
              }
            }
            stackOut_175_0 = (hd) (Object) stackIn_175_0;
            stackOut_175_1 = stackIn_175_1;
            stackOut_175_2 = 0;
            stackIn_176_0 = stackOut_175_0;
            stackIn_176_1 = stackOut_175_1;
            stackIn_176_2 = stackOut_175_2;
            break L65;
          }
          L67: {
            L68: {
              ((hd) (Object) stackIn_176_0).b(stackIn_176_1, stackIn_176_2 != 0);
              stackOut_176_0 = fp.field_p;
              stackOut_176_1 = 0;
              stackIn_180_0 = stackOut_176_0;
              stackIn_180_1 = stackOut_176_1;
              stackIn_177_0 = stackOut_176_0;
              stackIn_177_1 = stackOut_176_1;
              if (!param0) {
                break L68;
              } else {
                stackOut_177_0 = (hd) (Object) stackIn_177_0;
                stackOut_177_1 = stackIn_177_1;
                stackIn_180_0 = stackOut_177_0;
                stackIn_180_1 = stackOut_177_1;
                stackIn_178_0 = stackOut_177_0;
                stackIn_178_1 = stackOut_177_1;
                if (param4) {
                  break L68;
                } else {
                  stackOut_178_0 = (hd) (Object) stackIn_178_0;
                  stackOut_178_1 = stackIn_178_1;
                  stackIn_180_0 = stackOut_178_0;
                  stackIn_180_1 = stackOut_178_1;
                  stackIn_179_0 = stackOut_178_0;
                  stackIn_179_1 = stackOut_178_1;
                  if (td.field_b) {
                    break L68;
                  } else {
                    stackOut_179_0 = (hd) (Object) stackIn_179_0;
                    stackOut_179_1 = stackIn_179_1;
                    stackOut_179_2 = 1;
                    stackIn_181_0 = stackOut_179_0;
                    stackIn_181_1 = stackOut_179_1;
                    stackIn_181_2 = stackOut_179_2;
                    break L67;
                  }
                }
              }
            }
            stackOut_180_0 = (hd) (Object) stackIn_180_0;
            stackOut_180_1 = stackIn_180_1;
            stackOut_180_2 = 0;
            stackIn_181_0 = stackOut_180_0;
            stackIn_181_1 = stackOut_180_1;
            stackIn_181_2 = stackOut_180_2;
            break L67;
          }
          L69: {
            L70: {
              ((hd) (Object) stackIn_181_0).b(stackIn_181_1, stackIn_181_2 != 0);
              stackOut_181_0 = tn.field_f;
              stackOut_181_1 = 0;
              stackIn_185_0 = stackOut_181_0;
              stackIn_185_1 = stackOut_181_1;
              stackIn_182_0 = stackOut_181_0;
              stackIn_182_1 = stackOut_181_1;
              if (!param0) {
                break L70;
              } else {
                stackOut_182_0 = (hd) (Object) stackIn_182_0;
                stackOut_182_1 = stackIn_182_1;
                stackIn_185_0 = stackOut_182_0;
                stackIn_185_1 = stackOut_182_1;
                stackIn_183_0 = stackOut_182_0;
                stackIn_183_1 = stackOut_182_1;
                if (param4) {
                  break L70;
                } else {
                  stackOut_183_0 = (hd) (Object) stackIn_183_0;
                  stackOut_183_1 = stackIn_183_1;
                  stackIn_185_0 = stackOut_183_0;
                  stackIn_185_1 = stackOut_183_1;
                  stackIn_184_0 = stackOut_183_0;
                  stackIn_184_1 = stackOut_183_1;
                  if (!td.field_b) {
                    break L70;
                  } else {
                    stackOut_184_0 = (hd) (Object) stackIn_184_0;
                    stackOut_184_1 = stackIn_184_1;
                    stackOut_184_2 = 1;
                    stackIn_186_0 = stackOut_184_0;
                    stackIn_186_1 = stackOut_184_1;
                    stackIn_186_2 = stackOut_184_2;
                    break L69;
                  }
                }
              }
            }
            stackOut_185_0 = (hd) (Object) stackIn_185_0;
            stackOut_185_1 = stackIn_185_1;
            stackOut_185_2 = 0;
            stackIn_186_0 = stackOut_185_0;
            stackIn_186_1 = stackOut_185_1;
            stackIn_186_2 = stackOut_185_2;
            break L69;
          }
          ((hd) (Object) stackIn_186_0).b(stackIn_186_1, stackIn_186_2 != 0);
          ni.field_l.field_b.h((byte) 71);
          stackOut_186_0 = null;
          stackIn_187_0 = stackOut_186_0;
          break L0;
        }
        L71: {
          if (stackIn_187_0 == (Object) (Object) uv.field_i) {
            break L71;
          } else {
            L72: {
              if (ac.field_b.field_sb != 0) {
                gu.a(uv.field_i.h((byte) 73), (byte) -108, param1);
                break L72;
              } else {
                break L72;
              }
            }
            L73: {
              if (ua.field_k.field_sb == 0) {
                break L73;
              } else {
                gs.field_e = true;
                break L73;
              }
            }
            L74: {
              if (-1 == (em.field_d.field_sb ^ -1)) {
                break L74;
              } else {
                td.field_b = true;
                break L74;
              }
            }
            L75: {
              if (kt.field_i.field_sb != 0) {
                td.field_b = false;
                break L75;
              } else {
                break L75;
              }
            }
            ma.a(param1, (byte) -57, uv.field_i, false);
            break L71;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = ((lu) this).field_o << 1243163011;
        param3 = (15 & var6) + (param3 << -448835164);
        int var7 = ((lu) this).field_v << 576627171;
        param0 = (param0 << 510368324) + (var7 & 15);
        ((lu) this).a(var6, var7, param3, param0, param2, param4);
        if (param1 != 24407) {
            lu.a(false, 46, 70, true, false);
        }
    }

    final static int a(hu param0, String param1, int param2, String[] param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        L0: {
          var13 = Kickabout.field_G;
          var5 = param0.a(param1);
          if (param4 < var5) {
            break L0;
          } else {
            if (param1.indexOf("<br>") != -1) {
              break L0;
            } else {
              param3[0] = (String) (Object) param3;
              return 1;
            }
          }
        }
        var6 = (param4 + var5 - 1) / param4;
        param4 = var5 / var6;
        var6 = 0;
        var7 = 0;
        var8 = param1.length();
        if (param2 != -46) {
          return 59;
        } else {
          var9 = 0;
          L1: while (true) {
            L2: {
              if (var8 <= var9) {
                stackOut_16_0 = var8;
                stackOut_16_1 = var7;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                break L2;
              } else {
                var10 = param1.charAt(var9);
                stackOut_6_0 = -33;
                stackOut_6_1 = var10 ^ -1;
                stackIn_17_0 = stackOut_6_0;
                stackIn_17_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (var13 != 0) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      if (stackIn_7_0 == stackIn_7_1) {
                        break L4;
                      } else {
                        if (var10 == 45) {
                          break L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var11 = param1.substring(var7, 1 + var9).trim();
                    var12 = param0.a(var11);
                    if (var12 < param4) {
                      break L3;
                    } else {
                      var7 = 1 + var9;
                      int incrementValue$3 = var6;
                      var6++;
                      param3[incrementValue$3] = var11;
                      break L3;
                    }
                  }
                  L5: {
                    if (var10 != 62) {
                      break L5;
                    } else {
                      if (!param1.regionMatches(-3 + var9, "<br>", 0, 4)) {
                        break L5;
                      } else {
                        int incrementValue$4 = var6;
                        var6++;
                        param3[incrementValue$4] = param1.substring(var7, -3 + var9).trim();
                        var7 = 1 + var9;
                        break L5;
                      }
                    }
                  }
                  var9++;
                  continue L1;
                }
              }
            }
            L6: {
              if (stackIn_17_0 <= stackIn_17_1) {
                break L6;
              } else {
                int incrementValue$5 = var6;
                var6++;
                param3[incrementValue$5] = param1.substring(var7, var8).trim();
                break L6;
              }
            }
            return var6;
          }
        }
    }

    public static void g(byte param0) {
        if (param0 != -28) {
            lu.a(47, -58);
        }
        field_p = null;
        field_t = null;
        field_r = null;
        field_u = null;
        field_x = null;
    }

    lu() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_r = "Type your age in years";
        field_u = "Only show private chat from my friends and opponents";
    }
}
