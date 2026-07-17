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
        ml var2 = or.field_d;
        var2.b(-58, (byte) 108);
        var2.field_n = var2.field_n + 1;
        int var3 = var2.field_n;
        if (param0 != 6773) {
            return;
        }
        var2.a(param0 + -6660, 5);
        var2.a(123, uv.field_i.field_bc);
        int var4 = (uv.field_i.field_Mb << 6) + uv.field_i.field_Wb;
        var2.a(106, var4);
        var2.a(0, uv.field_i.field_Eb.length, param0 ^ 1991213509, uv.field_i.field_Eb);
        var2.c(62, var2.field_n - var3);
    }

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5);

    final static void a(boolean param0, int param1, int param2, boolean param3, boolean param4) {
        RuntimeException var5 = null;
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
        String var25 = null;
        int[] var26 = null;
        hd var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        hd stackIn_17_0 = null;
        hd stackIn_18_0 = null;
        hd stackIn_19_0 = null;
        hd stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        int stackIn_45_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_57_1 = 0;
        int stackIn_59_0 = 0;
        int stackIn_59_1 = 0;
        int stackIn_65_0 = 0;
        int stackIn_69_0 = 0;
        Object stackIn_82_0 = null;
        boolean stackIn_109_0 = false;
        int stackIn_125_0 = 0;
        boolean stackIn_135_0 = false;
        boolean stackIn_152_0 = false;
        int stackIn_159_0 = 0;
        hd stackIn_175_0 = null;
        int stackIn_175_1 = 0;
        hd stackIn_176_0 = null;
        int stackIn_176_1 = 0;
        hd stackIn_177_0 = null;
        int stackIn_177_1 = 0;
        hd stackIn_178_0 = null;
        int stackIn_178_1 = 0;
        int stackIn_178_2 = 0;
        hd stackIn_179_0 = null;
        int stackIn_179_1 = 0;
        hd stackIn_180_0 = null;
        int stackIn_180_1 = 0;
        hd stackIn_181_0 = null;
        int stackIn_181_1 = 0;
        hd stackIn_182_0 = null;
        int stackIn_182_1 = 0;
        int stackIn_182_2 = 0;
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
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        hd stackOut_16_0 = null;
        hd stackOut_17_0 = null;
        hd stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        hd stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        int stackOut_37_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_40_1 = 0;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_56_1 = 0;
        int stackOut_58_0 = 0;
        int stackOut_58_1 = 0;
        int stackOut_64_0 = 0;
        int stackOut_68_0 = 0;
        Object stackOut_81_0 = null;
        boolean stackOut_108_0 = false;
        int stackOut_124_0 = 0;
        boolean stackOut_134_0 = false;
        boolean stackOut_151_0 = false;
        int stackOut_158_0 = 0;
        hd stackOut_174_0 = null;
        int stackOut_174_1 = 0;
        hd stackOut_175_0 = null;
        int stackOut_175_1 = 0;
        hd stackOut_176_0 = null;
        int stackOut_176_1 = 0;
        int stackOut_176_2 = 0;
        hd stackOut_177_0 = null;
        int stackOut_177_1 = 0;
        int stackOut_177_2 = 0;
        hd stackOut_178_0 = null;
        int stackOut_178_1 = 0;
        hd stackOut_179_0 = null;
        int stackOut_179_1 = 0;
        hd stackOut_180_0 = null;
        int stackOut_180_1 = 0;
        int stackOut_180_2 = 0;
        hd stackOut_181_0 = null;
        int stackOut_181_1 = 0;
        int stackOut_181_2 = 0;
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
        var18 = null;
        var19 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              L2: {
                dw.a(7, ee.field_b);
                if (uv.field_i == null) {
                  break L2;
                } else {
                  L3: {
                    L4: {
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
                        break L4;
                      } else {
                        L5: {
                          L6: {
                            ci.field_h.field_E = kf.field_zb.toUpperCase();
                            var9 = (fp.field_p.field_q - -2) / 2;
                            em.field_d.a(true, var9 + -2, 0, -40 + fp.field_p.field_mb, 40);
                            if (~uv.field_i.field_bc >= ~uv.field_i.field_gc) {
                              break L6;
                            } else {
                              em.field_d.field_E = po.field_b.toUpperCase();
                              em.field_d.field_lb = true;
                              if (var19 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          em.field_d.field_E = no.field_I.toUpperCase();
                          em.field_d.field_lb = false;
                          break L5;
                        }
                        L7: {
                          em.field_d.field_R = vg.field_Qb.field_R;
                          if (fh.field_b > 0) {
                            L8: {
                              L9: {
                                if (fh.field_b == 1) {
                                  break L9;
                                } else {
                                  var10_ref_String = vo.a((byte) -18, jb.field_f, new String[1]);
                                  if (var19 == 0) {
                                    break L8;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              var10_ref_String = kp.field_i;
                              break L8;
                            }
                            em.field_d.field_E = em.field_d.field_E + "<br>" + var10_ref_String;
                            if ((16 & de.field_c) != 0) {
                              break L7;
                            } else {
                              if (!td.field_b) {
                                em.field_d.field_R = vg.field_Qb.field_S;
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                          } else {
                            break L7;
                          }
                        }
                        L10: {
                          L11: {
                            ua.field_k.a(true, fp.field_p.field_q + -var9, var9, -40 + fp.field_p.field_mb, 40);
                            ua.field_k.field_E = hj.field_g.toUpperCase();
                            stackOut_16_0 = ua.field_k;
                            stackIn_19_0 = stackOut_16_0;
                            stackIn_17_0 = stackOut_16_0;
                            if (!param3) {
                              break L11;
                            } else {
                              stackOut_17_0 = (hd) (Object) stackIn_17_0;
                              stackIn_19_0 = stackOut_17_0;
                              stackIn_18_0 = stackOut_17_0;
                              if (0L != vg.field_Ib) {
                                break L11;
                              } else {
                                stackOut_18_0 = (hd) (Object) stackIn_18_0;
                                stackOut_18_1 = 1;
                                stackIn_20_0 = stackOut_18_0;
                                stackIn_20_1 = stackOut_18_1;
                                break L10;
                              }
                            }
                          }
                          stackOut_19_0 = (hd) (Object) stackIn_19_0;
                          stackOut_19_1 = 0;
                          stackIn_20_0 = stackOut_19_0;
                          stackIn_20_1 = stackOut_19_1;
                          break L10;
                        }
                        L12: {
                          stackIn_20_0.field_lb = stackIn_20_1 != 0;
                          var8 = ua.field_k;
                          var10 = 2;
                          if (la.field_k != null) {
                            L13: {
                              if (hm.field_G == null) {
                                m.field_f = new boolean[ss.field_j];
                                hm.field_G = new byte[ss.field_j];
                                break L13;
                              } else {
                                break L13;
                              }
                            }
                            var11_int = 0;
                            L14: while (true) {
                              L15: {
                                L16: {
                                  if (ss.field_j <= var11_int) {
                                    break L16;
                                  } else {
                                    m.field_f[var11_int] = false;
                                    var11_int++;
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
                                      var11_int = 0;
                                      stackOut_33_0 = 0;
                                      stackIn_69_0 = stackOut_33_0;
                                      stackIn_34_0 = stackOut_33_0;
                                      if (var19 != 0) {
                                        break L18;
                                      } else {
                                        var12 = stackIn_34_0;
                                        L20: while (true) {
                                          stackOut_35_0 = ~var12;
                                          stackOut_35_1 = ~la.field_k.length;
                                          stackIn_36_0 = stackOut_35_0;
                                          stackIn_36_1 = stackOut_35_1;
                                          L21: while (true) {
                                            L22: {
                                              L23: {
                                                if (stackIn_36_0 <= stackIn_36_1) {
                                                  break L23;
                                                } else {
                                                  var29 = la.field_k[var12];
                                                  var28 = var29;
                                                  var26 = var28;
                                                  var23 = var26;
                                                  var20 = var23;
                                                  var13_array = var20;
                                                  stackOut_37_0 = 0;
                                                  stackIn_65_0 = stackOut_37_0;
                                                  stackIn_38_0 = stackOut_37_0;
                                                  if (var19 != 0) {
                                                    break L22;
                                                  } else {
                                                    var14_int = stackIn_38_0;
                                                    L24: while (true) {
                                                      L25: {
                                                        L26: {
                                                          L27: {
                                                            if (var14_int >= var29.length) {
                                                              break L27;
                                                            } else {
                                                              var15 = var29[var14_int];
                                                              var16 = var20[var14_int + 1];
                                                              stackOut_40_0 = var15;
                                                              stackOut_40_1 = -1;
                                                              stackIn_57_0 = stackOut_40_0;
                                                              stackIn_57_1 = stackOut_40_1;
                                                              stackIn_41_0 = stackOut_40_0;
                                                              stackIn_41_1 = stackOut_40_1;
                                                              if (var19 != 0) {
                                                                break L26;
                                                              } else {
                                                                L28: {
                                                                  L29: {
                                                                    if (stackIn_41_0 != stackIn_41_1) {
                                                                      break L29;
                                                                    } else {
                                                                      L30: {
                                                                        if (0 == var10) {
                                                                          stackOut_44_0 = uv.field_i.field_bc;
                                                                          stackIn_45_0 = stackOut_44_0;
                                                                          break L30;
                                                                        } else {
                                                                          stackOut_43_0 = uv.field_i.field_gc;
                                                                          stackIn_45_0 = stackOut_43_0;
                                                                          break L30;
                                                                        }
                                                                      }
                                                                      L31: {
                                                                        var17_int = stackIn_45_0;
                                                                        if (~var17_int == ~var16) {
                                                                          break L31;
                                                                        } else {
                                                                          if (var19 == 0) {
                                                                            break L25;
                                                                          } else {
                                                                            break L31;
                                                                          }
                                                                        }
                                                                      }
                                                                      if (var19 == 0) {
                                                                        break L28;
                                                                      } else {
                                                                        break L29;
                                                                      }
                                                                    }
                                                                  }
                                                                  if (~(uv.field_i.field_Eb[var15] & 255) == ~var16) {
                                                                    break L28;
                                                                  } else {
                                                                    if (var19 == 0) {
                                                                      break L25;
                                                                    } else {
                                                                      break L28;
                                                                    }
                                                                  }
                                                                }
                                                                var14_int += 2;
                                                                if (var19 == 0) {
                                                                  continue L24;
                                                                } else {
                                                                  break L27;
                                                                }
                                                              }
                                                            }
                                                          }
                                                          var11_int = 1;
                                                          var14_int = -1;
                                                          var15 = 0;
                                                          stackOut_56_0 = var29.length;
                                                          stackOut_56_1 = var15;
                                                          stackIn_57_0 = stackOut_56_0;
                                                          stackIn_57_1 = stackOut_56_1;
                                                          break L26;
                                                        }
                                                        L32: while (true) {
                                                          L33: {
                                                            if (stackIn_57_0 <= stackIn_57_1) {
                                                              break L33;
                                                            } else {
                                                              var16 = var29[var15];
                                                              stackOut_58_0 = ~var14_int;
                                                              stackOut_58_1 = ~var16;
                                                              stackIn_36_0 = stackOut_58_0;
                                                              stackIn_36_1 = stackOut_58_1;
                                                              stackIn_59_0 = stackOut_58_0;
                                                              stackIn_59_1 = stackOut_58_1;
                                                              if (var19 != 0) {
                                                                continue L21;
                                                              } else {
                                                                L34: {
                                                                  if (stackIn_59_0 <= stackIn_59_1) {
                                                                    break L34;
                                                                  } else {
                                                                    var14_int = var16;
                                                                    break L34;
                                                                  }
                                                                }
                                                                var15 += 2;
                                                                if (var19 == 0) {
                                                                  stackOut_56_0 = var29.length;
                                                                  stackOut_56_1 = var15;
                                                                  stackIn_57_0 = stackOut_56_0;
                                                                  stackIn_57_1 = stackOut_56_1;
                                                                  continue L32;
                                                                } else {
                                                                  break L33;
                                                                }
                                                              }
                                                            }
                                                          }
                                                          m.field_f[var14_int] = true;
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
                                              stackOut_64_0 = var11_int;
                                              stackIn_65_0 = stackOut_64_0;
                                              break L22;
                                            }
                                            if (stackIn_65_0 != 0) {
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
                                  stackOut_68_0 = 2;
                                  stackIn_69_0 = stackOut_68_0;
                                  break L18;
                                }
                                if (stackIn_69_0 > tk.field_Ib) {
                                  break L12;
                                } else {
                                  if (ne.field_G[12]) {
                                    var10 = 2;
                                    break L12;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                            }
                          } else {
                            break L12;
                          }
                        }
                        L35: {
                          L36: {
                            L37: {
                              L38: {
                                if (var10 < 2) {
                                  break L38;
                                } else {
                                  L39: {
                                    if (null != ds.field_h) {
                                      break L39;
                                    } else {
                                      if (null != lh.field_E) {
                                        break L39;
                                      } else {
                                        if (null != so.field_f) {
                                          break L39;
                                        } else {
                                          if (null == hm.field_D) {
                                            break L35;
                                          } else {
                                            break L39;
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
                                  L40: while (true) {
                                    L41: {
                                      if (~var16 <= ~ss.field_j) {
                                        break L41;
                                      } else {
                                        var17_int = 255 & uv.field_i.field_Eb[var16];
                                        stackOut_81_0 = null;
                                        stackIn_187_0 = stackOut_81_0;
                                        stackIn_82_0 = stackOut_81_0;
                                        if (var19 != 0) {
                                          break L1;
                                        } else {
                                          L42: {
                                            if (stackIn_82_0 == (Object) (Object) ds.field_h) {
                                              break L42;
                                            } else {
                                              if (ds.field_h[var16] == null) {
                                                break L42;
                                              } else {
                                                if (!ds.field_h[var16][var17_int]) {
                                                  break L42;
                                                } else {
                                                  var11_int = 1;
                                                  break L42;
                                                }
                                              }
                                            }
                                          }
                                          L43: {
                                            if (lh.field_E == null) {
                                              break L43;
                                            } else {
                                              if (lh.field_E[var16] == null) {
                                                break L43;
                                              } else {
                                                L44: {
                                                  var18_int = lh.field_E[var16][var17_int];
                                                  if (var18_int == 0) {
                                                    break L44;
                                                  } else {
                                                    if (fv.field_d) {
                                                      break L44;
                                                    } else {
                                                      var11_int = 1;
                                                      break L44;
                                                    }
                                                  }
                                                }
                                                if (~var18_int >= ~var13_int) {
                                                  break L43;
                                                } else {
                                                  var13_int = var18_int;
                                                  break L43;
                                                }
                                              }
                                            }
                                          }
                                          L45: {
                                            if (null == so.field_f) {
                                              break L45;
                                            } else {
                                              if (so.field_f[var16] != null) {
                                                L46: {
                                                  var18_int = so.field_f[var16][var17_int];
                                                  if (var18_int > var14_int) {
                                                    var14_int = var18_int;
                                                    break L46;
                                                  } else {
                                                    break L46;
                                                  }
                                                }
                                                if (var18_int == 0) {
                                                  break L45;
                                                } else {
                                                  if (fv.field_d) {
                                                    break L45;
                                                  } else {
                                                    var11_int = 1;
                                                    break L45;
                                                  }
                                                }
                                              } else {
                                                break L45;
                                              }
                                            }
                                          }
                                          L47: {
                                            if (null == hm.field_D) {
                                              break L47;
                                            } else {
                                              if (null == hm.field_D[var16]) {
                                                break L47;
                                              } else {
                                                var15 = var15 | hm.field_D[var16][var17_int];
                                                break L47;
                                              }
                                            }
                                          }
                                          var16++;
                                          if (var19 == 0) {
                                            continue L40;
                                          } else {
                                            break L41;
                                          }
                                        }
                                      }
                                    }
                                    var16 = 0;
                                    var17 = bs.field_c.field_Ab.field_jb;
                                    var18_ref = (he) (Object) var17.g(24009);
                                    L48: while (true) {
                                      L49: {
                                        L50: {
                                          if (var18_ref == null) {
                                            break L50;
                                          } else {
                                            stackOut_108_0 = var18_ref.h(-13356);
                                            stackIn_125_0 = stackOut_108_0 ? 1 : 0;
                                            stackIn_109_0 = stackOut_108_0;
                                            if (var19 != 0) {
                                              break L49;
                                            } else {
                                              L51: {
                                                if (stackIn_109_0) {
                                                  break L51;
                                                } else {
                                                  L52: {
                                                    if (var11_int == 0) {
                                                      break L52;
                                                    } else {
                                                      if (var18_ref.field_Cb) {
                                                        break L52;
                                                      } else {
                                                        var16 = 1;
                                                        if (var19 == 0) {
                                                          break L50;
                                                        } else {
                                                          break L52;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  L53: {
                                                    if (~var18_ref.field_Qb <= ~var13_int) {
                                                      break L53;
                                                    } else {
                                                      var16 = 1;
                                                      if (var19 == 0) {
                                                        break L50;
                                                      } else {
                                                        break L53;
                                                      }
                                                    }
                                                  }
                                                  L54: {
                                                    if (var14_int > var18_ref.field_Db) {
                                                      var16 = 1;
                                                      if (var19 == 0) {
                                                        break L50;
                                                      } else {
                                                        break L54;
                                                      }
                                                    } else {
                                                      break L54;
                                                    }
                                                  }
                                                  L55: {
                                                    if ((var15 & ~var18_ref.field_Pb) > 0) {
                                                      var16 = 1;
                                                      if (var19 == 0) {
                                                        break L50;
                                                      } else {
                                                        break L55;
                                                      }
                                                    } else {
                                                      break L55;
                                                    }
                                                  }
                                                  if (var12 == 0) {
                                                    break L51;
                                                  } else {
                                                    var16 = 1;
                                                    if (var19 == 0) {
                                                      break L50;
                                                    } else {
                                                      break L51;
                                                    }
                                                  }
                                                }
                                              }
                                              var18_ref = (he) (Object) var17.c(param2 ^ -33);
                                              if (var19 == 0) {
                                                continue L48;
                                              } else {
                                                break L50;
                                              }
                                            }
                                          }
                                        }
                                        stackOut_124_0 = ~tk.field_Ib;
                                        stackIn_125_0 = stackOut_124_0;
                                        break L49;
                                      }
                                      L56: {
                                        if (stackIn_125_0 > -3) {
                                          break L56;
                                        } else {
                                          if (ne.field_G[12]) {
                                            var16 = 0;
                                            break L56;
                                          } else {
                                            break L56;
                                          }
                                        }
                                      }
                                      L57: {
                                        if (var16 != 0) {
                                          break L57;
                                        } else {
                                          if (var19 == 0) {
                                            break L35;
                                          } else {
                                            ua.field_k.field_lb = false;
                                            if (!ua.field_k.field_Q) {
                                              break L35;
                                            } else {
                                              var11 = null;
                                              var12 = 0;
                                              var13_int = 0;
                                              L58: while (true) {
                                                if (ss.field_j <= var13_int) {
                                                  break L37;
                                                } else {
                                                  stackOut_134_0 = m.field_f[var13_int];
                                                  stackIn_159_0 = stackOut_134_0 ? 1 : 0;
                                                  stackIn_135_0 = stackOut_134_0;
                                                  if (var19 != 0) {
                                                    break L36;
                                                  } else {
                                                    L59: {
                                                      if (stackIn_135_0) {
                                                        L60: {
                                                          var24 = "<col=A00000>" + ok.field_b[var13_int] + "</col>";
                                                          if (var11 == null) {
                                                            break L60;
                                                          } else {
                                                            var12 = 1;
                                                            var11 = (Object) (Object) (var11 + ", " + var24);
                                                            if (var19 == 0) {
                                                              break L59;
                                                            } else {
                                                              break L60;
                                                            }
                                                          }
                                                        }
                                                        var11 = (Object) (Object) var24;
                                                        break L59;
                                                      } else {
                                                        break L59;
                                                      }
                                                    }
                                                    var13_int++;
                                                    if (var19 == 0) {
                                                      continue L58;
                                                    } else {
                                                      break L57;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                      L61: {
                                        ua.field_k.field_lb = false;
                                        if (ua.field_k.field_Q) {
                                          L62: {
                                            if (ni.field_l.field_b.field_Db != 0) {
                                              break L62;
                                            } else {
                                              sn.field_e = pp.field_m;
                                              if (var19 == 0) {
                                                break L61;
                                              } else {
                                                break L62;
                                              }
                                            }
                                          }
                                          sn.field_e = vo.a((byte) -18, pu.field_Fb, new String[1]);
                                          break L61;
                                        } else {
                                          break L61;
                                        }
                                      }
                                      if (var19 == 0) {
                                        break L35;
                                      } else {
                                        break L38;
                                      }
                                    }
                                  }
                                }
                              }
                              ua.field_k.field_lb = false;
                              if (!ua.field_k.field_Q) {
                                break L35;
                              } else {
                                var11 = null;
                                var12 = 0;
                                var13_int = 0;
                                L63: while (true) {
                                  if (ss.field_j <= var13_int) {
                                    break L37;
                                  } else {
                                    stackOut_151_0 = m.field_f[var13_int];
                                    stackIn_159_0 = stackOut_151_0 ? 1 : 0;
                                    stackIn_152_0 = stackOut_151_0;
                                    if (var19 != 0) {
                                      break L36;
                                    } else {
                                      L64: {
                                        if (stackIn_152_0) {
                                          L65: {
                                            var25 = "<col=A00000>" + ok.field_b[var13_int] + "</col>";
                                            if (var11 == null) {
                                              break L65;
                                            } else {
                                              var12 = 1;
                                              var11 = (Object) (Object) (var11 + ", " + var25);
                                              if (var19 == 0) {
                                                break L64;
                                              } else {
                                                break L65;
                                              }
                                            }
                                          }
                                          var11 = (Object) (Object) var25;
                                          break L64;
                                        } else {
                                          break L64;
                                        }
                                      }
                                      var13_int++;
                                      if (var19 == 0) {
                                        continue L63;
                                      } else {
                                        break L37;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_158_0 = ~var10;
                            stackIn_159_0 = stackOut_158_0;
                            break L36;
                          }
                          L66: {
                            if (stackIn_159_0 != -1) {
                              L67: {
                                var13 = os.field_w;
                                if (var12 == 0) {
                                  break L67;
                                } else {
                                  var14 = oi.field_k + var11;
                                  if (var19 == 0) {
                                    break L66;
                                  } else {
                                    break L67;
                                  }
                                }
                              }
                              var14 = vo.a((byte) -18, bp.field_yb, new String[1]);
                              break L66;
                            } else {
                              L68: {
                                var13 = sb.field_g;
                                if (var12 != 0) {
                                  break L68;
                                } else {
                                  var14 = vo.a((byte) -18, kb.field_D, new String[1]);
                                  if (var19 == 0) {
                                    break L66;
                                  } else {
                                    break L68;
                                  }
                                }
                              }
                              var14 = gm.field_S + var11;
                              break L66;
                            }
                          }
                          sn.field_e = "<col=A00000>" + var13 + "<br>" + var14;
                          break L35;
                        }
                        if (var19 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var9_ref_String = uv.field_i.field_ec;
                    ci.field_h.field_E = vo.a((byte) -18, bv.field_m, new String[1]).toUpperCase();
                    nv.field_F.a(true, fp.field_p.field_q, 0, fp.field_p.field_mb - 40, 40);
                    nv.field_F.field_E = vo.a((byte) -18, wa.field_c, new String[1]);
                    var8 = nv.field_F;
                    break L3;
                  }
                  L69: {
                    if (vg.field_Ib == 0L) {
                      break L69;
                    } else {
                      L70: {
                        var9 = (int)(-nj.a(22) + vg.field_Ib);
                        var9 = (var9 - -999) / 1000;
                        if (var9 >= 1) {
                          break L70;
                        } else {
                          var9 = 1;
                          break L70;
                        }
                      }
                      var8.field_E = vo.a((byte) -18, gf.field_h, new String[1]);
                      break L69;
                    }
                  }
                  ka.field_c.field_E = vo.a((byte) -18, ib.field_F, new String[2]);
                  break L2;
                }
              }
              L71: {
                L72: {
                  stackOut_174_0 = dn.field_Cb;
                  stackOut_174_1 = param2 ^ param2;
                  stackIn_177_0 = stackOut_174_0;
                  stackIn_177_1 = stackOut_174_1;
                  stackIn_175_0 = stackOut_174_0;
                  stackIn_175_1 = stackOut_174_1;
                  if (!param0) {
                    break L72;
                  } else {
                    stackOut_175_0 = (hd) (Object) stackIn_175_0;
                    stackOut_175_1 = stackIn_175_1;
                    stackIn_177_0 = stackOut_175_0;
                    stackIn_177_1 = stackOut_175_1;
                    stackIn_176_0 = stackOut_175_0;
                    stackIn_176_1 = stackOut_175_1;
                    if (td.field_b) {
                      break L72;
                    } else {
                      stackOut_176_0 = (hd) (Object) stackIn_176_0;
                      stackOut_176_1 = stackIn_176_1;
                      stackOut_176_2 = 1;
                      stackIn_178_0 = stackOut_176_0;
                      stackIn_178_1 = stackOut_176_1;
                      stackIn_178_2 = stackOut_176_2;
                      break L71;
                    }
                  }
                }
                stackOut_177_0 = (hd) (Object) stackIn_177_0;
                stackOut_177_1 = stackIn_177_1;
                stackOut_177_2 = 0;
                stackIn_178_0 = stackOut_177_0;
                stackIn_178_1 = stackOut_177_1;
                stackIn_178_2 = stackOut_177_2;
                break L71;
              }
              L73: {
                L74: {
                  ((hd) (Object) stackIn_178_0).b(stackIn_178_1, stackIn_178_2 != 0);
                  stackOut_178_0 = fp.field_p;
                  stackOut_178_1 = 0;
                  stackIn_181_0 = stackOut_178_0;
                  stackIn_181_1 = stackOut_178_1;
                  stackIn_179_0 = stackOut_178_0;
                  stackIn_179_1 = stackOut_178_1;
                  if (!param0) {
                    break L74;
                  } else {
                    stackOut_179_0 = (hd) (Object) stackIn_179_0;
                    stackOut_179_1 = stackIn_179_1;
                    stackIn_181_0 = stackOut_179_0;
                    stackIn_181_1 = stackOut_179_1;
                    stackIn_180_0 = stackOut_179_0;
                    stackIn_180_1 = stackOut_179_1;
                    if (td.field_b) {
                      break L74;
                    } else {
                      stackOut_180_0 = (hd) (Object) stackIn_180_0;
                      stackOut_180_1 = stackIn_180_1;
                      stackOut_180_2 = 1;
                      stackIn_182_0 = stackOut_180_0;
                      stackIn_182_1 = stackOut_180_1;
                      stackIn_182_2 = stackOut_180_2;
                      break L73;
                    }
                  }
                }
                stackOut_181_0 = (hd) (Object) stackIn_181_0;
                stackOut_181_1 = stackIn_181_1;
                stackOut_181_2 = 0;
                stackIn_182_0 = stackOut_181_0;
                stackIn_182_1 = stackOut_181_1;
                stackIn_182_2 = stackOut_181_2;
                break L73;
              }
              L75: {
                L76: {
                  ((hd) (Object) stackIn_182_0).b(stackIn_182_1, stackIn_182_2 != 0);
                  stackOut_182_0 = tn.field_f;
                  stackOut_182_1 = 0;
                  stackIn_185_0 = stackOut_182_0;
                  stackIn_185_1 = stackOut_182_1;
                  stackIn_183_0 = stackOut_182_0;
                  stackIn_183_1 = stackOut_182_1;
                  if (!param0) {
                    break L76;
                  } else {
                    stackOut_183_0 = (hd) (Object) stackIn_183_0;
                    stackOut_183_1 = stackIn_183_1;
                    stackIn_185_0 = stackOut_183_0;
                    stackIn_185_1 = stackOut_183_1;
                    stackIn_184_0 = stackOut_183_0;
                    stackIn_184_1 = stackOut_183_1;
                    if (!td.field_b) {
                      break L76;
                    } else {
                      stackOut_184_0 = (hd) (Object) stackIn_184_0;
                      stackOut_184_1 = stackIn_184_1;
                      stackOut_184_2 = 1;
                      stackIn_186_0 = stackOut_184_0;
                      stackIn_186_1 = stackOut_184_1;
                      stackIn_186_2 = stackOut_184_2;
                      break L75;
                    }
                  }
                }
                stackOut_185_0 = (hd) (Object) stackIn_185_0;
                stackOut_185_1 = stackIn_185_1;
                stackOut_185_2 = 0;
                stackIn_186_0 = stackOut_185_0;
                stackIn_186_1 = stackOut_185_1;
                stackIn_186_2 = stackOut_185_2;
                break L75;
              }
              ((hd) (Object) stackIn_186_0).b(stackIn_186_1, stackIn_186_2 != 0);
              ni.field_l.field_b.h((byte) 71);
              stackOut_186_0 = null;
              stackIn_187_0 = stackOut_186_0;
              break L1;
            }
            L77: {
              if (stackIn_187_0 == (Object) (Object) uv.field_i) {
                break L77;
              } else {
                L78: {
                  if (ac.field_b.field_sb != 0) {
                    gu.a(uv.field_i.h((byte) 73), (byte) -108, param1);
                    break L78;
                  } else {
                    break L78;
                  }
                }
                L79: {
                  if (ua.field_k.field_sb == 0) {
                    break L79;
                  } else {
                    gs.field_e = true;
                    break L79;
                  }
                }
                L80: {
                  if (em.field_d.field_sb == 0) {
                    break L80;
                  } else {
                    td.field_b = true;
                    break L80;
                  }
                }
                L81: {
                  if (kt.field_i.field_sb != 0) {
                    td.field_b = false;
                    break L81;
                  } else {
                    break L81;
                  }
                }
                ma.a(param1, (byte) -57, uv.field_i, false);
                break L77;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var5, "lu.DB(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + 0 + 41);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = ((lu) this).field_o << 3;
        param3 = (15 & var6) + (param3 << 4);
        int var7 = ((lu) this).field_v << 3;
        param0 = (param0 << 4) + (var7 & 15);
        ((lu) this).a(var6, var7, param3, param0, param2, param4);
        if (param1 != 24407) {
            lu.a(false, 46, 70, true, false);
        }
    }

    final static int a(hu param0, String param1, int param2, String[] param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var13 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              var5_int = param0.a(param1);
              if (~param4 > ~var5_int) {
                break L1;
              } else {
                if (param1.indexOf("<br>") != -1) {
                  break L1;
                } else {
                  param3[0] = (String) (Object) param3;
                  stackOut_3_0 = 1;
                  stackIn_4_0 = stackOut_3_0;
                  return stackIn_4_0;
                }
              }
            }
            var6 = (param4 + var5_int - 1) / param4;
            param4 = var5_int / var6;
            var6 = 0;
            var7 = 0;
            var8 = param1.length();
            if (param2 == -46) {
              var9 = 0;
              L2: while (true) {
                L3: {
                  L4: {
                    if (~var8 >= ~var9) {
                      break L4;
                    } else {
                      var10 = param1.charAt(var9);
                      stackOut_10_0 = -33;
                      stackOut_10_1 = ~var10;
                      stackIn_21_0 = stackOut_10_0;
                      stackIn_21_1 = stackOut_10_1;
                      stackIn_11_0 = stackOut_10_0;
                      stackIn_11_1 = stackOut_10_1;
                      if (var13 != 0) {
                        break L3;
                      } else {
                        L5: {
                          L6: {
                            if (stackIn_11_0 == stackIn_11_1) {
                              break L6;
                            } else {
                              if (var10 == 45) {
                                break L6;
                              } else {
                                break L5;
                              }
                            }
                          }
                          var11 = param1.substring(var7, 1 + var9).trim();
                          var12 = param0.a(var11);
                          if (~var12 > ~param4) {
                            break L5;
                          } else {
                            var7 = 1 + var9;
                            int incrementValue$3 = var6;
                            var6++;
                            param3[incrementValue$3] = var11;
                            break L5;
                          }
                        }
                        L7: {
                          if (var10 != 62) {
                            break L7;
                          } else {
                            if (!param1.regionMatches(-3 + var9, "<br>", 0, 4)) {
                              break L7;
                            } else {
                              int incrementValue$4 = var6;
                              var6++;
                              param3[incrementValue$4] = param1.substring(var7, -3 + var9).trim();
                              var7 = 1 + var9;
                              break L7;
                            }
                          }
                        }
                        var9++;
                        if (var13 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  stackOut_20_0 = var8;
                  stackOut_20_1 = var7;
                  stackIn_21_0 = stackOut_20_0;
                  stackIn_21_1 = stackOut_20_1;
                  break L3;
                }
                L8: {
                  if (stackIn_21_0 <= stackIn_21_1) {
                    break L8;
                  } else {
                    int incrementValue$5 = var6;
                    var6++;
                    param3[incrementValue$5] = param1.substring(var7, var8).trim();
                    break L8;
                  }
                }
                stackOut_23_0 = var6;
                stackIn_24_0 = stackOut_23_0;
                break L0;
              }
            } else {
              stackOut_6_0 = 59;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var5;
            stackOut_25_1 = new StringBuilder().append("lu.FB(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L9;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L9;
            }
          }
          L10: {
            stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(44);
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param1 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L10;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L10;
            }
          }
          L11: {
            stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(44).append(param2).append(44);
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param3 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L11;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L11;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + 44 + param4 + 41);
        }
        return stackIn_24_0;
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
