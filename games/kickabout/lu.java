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
        int var4 = 0;
        ml var2 = or.field_d;
        var2.b(param1, (byte) 108);
        var2.field_n = var2.field_n + 1;
        int var3 = var2.field_n;
        if (param0 != 6773) {
            return;
        }
        try {
            var2.a(param0 + -6660, 5);
            var2.a(123, uv.field_i.field_bc);
            var4 = (uv.field_i.field_Mb << 697071814) + uv.field_i.field_Wb;
            var2.a(106, var4);
            var2.a(0, uv.field_i.field_Eb.length, param0 ^ 1991213509, uv.field_i.field_Eb);
            var2.c(62, var2.field_n - var3);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "lu.CB(" + param0 + ',' + param1 + ')');
        }
    }

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5);

    final static void a(boolean param0, int param1, int param2, boolean param3, boolean param4) {
        RuntimeException var5 = null;
        hd var5_ref = null;
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
        he var18 = null;
        int var18_int = 0;
        int var19 = 0;
        hd stackIn_23_0 = null;
        hd stackIn_24_0 = null;
        hd stackIn_26_0 = null;
        hd stackIn_28_0 = null;
        hd stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int stackIn_45_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_49_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        int stackIn_61_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_79_1 = 0;
        int stackIn_81_0 = 0;
        int stackIn_81_1 = 0;
        int stackIn_87_0 = 0;
        int stackIn_92_0 = 0;
        Object stackIn_115_0 = null;
        boolean stackIn_160_0 = false;
        int stackIn_192_0 = 0;
        boolean stackIn_218_0 = false;
        int stackIn_227_0 = 0;
        hd stackIn_243_0 = null;
        int stackIn_243_1 = 0;
        hd stackIn_244_0 = null;
        int stackIn_244_1 = 0;
        hd stackIn_246_0 = null;
        int stackIn_246_1 = 0;
        hd stackIn_247_0 = null;
        int stackIn_247_1 = 0;
        hd stackIn_249_0 = null;
        int stackIn_249_1 = 0;
        hd stackIn_251_0 = null;
        int stackIn_251_1 = 0;
        hd stackIn_252_0 = null;
        int stackIn_252_1 = 0;
        int stackIn_252_2 = 0;
        hd stackIn_253_0 = null;
        int stackIn_253_1 = 0;
        hd stackIn_254_0 = null;
        int stackIn_254_1 = 0;
        hd stackIn_256_0 = null;
        int stackIn_256_1 = 0;
        hd stackIn_257_0 = null;
        int stackIn_257_1 = 0;
        hd stackIn_259_0 = null;
        int stackIn_259_1 = 0;
        hd stackIn_261_0 = null;
        int stackIn_261_1 = 0;
        hd stackIn_262_0 = null;
        int stackIn_262_1 = 0;
        int stackIn_262_2 = 0;
        hd stackIn_263_0 = null;
        int stackIn_263_1 = 0;
        hd stackIn_264_0 = null;
        int stackIn_264_1 = 0;
        hd stackIn_266_0 = null;
        int stackIn_266_1 = 0;
        hd stackIn_267_0 = null;
        int stackIn_267_1 = 0;
        hd stackIn_269_0 = null;
        int stackIn_269_1 = 0;
        hd stackIn_271_0 = null;
        int stackIn_271_1 = 0;
        hd stackIn_272_0 = null;
        int stackIn_272_1 = 0;
        int stackIn_272_2 = 0;
        Object stackIn_273_0 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        hd stackOut_22_0 = null;
        hd stackOut_23_0 = null;
        hd stackOut_24_0 = null;
        hd stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        hd stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        int stackOut_44_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        int stackOut_48_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        int stackOut_60_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_78_1 = 0;
        int stackOut_80_0 = 0;
        int stackOut_80_1 = 0;
        int stackOut_86_0 = 0;
        int stackOut_91_0 = 0;
        Object stackOut_114_0 = null;
        boolean stackOut_159_0 = false;
        int stackOut_191_0 = 0;
        boolean stackOut_217_0 = false;
        int stackOut_226_0 = 0;
        hd stackOut_242_0 = null;
        int stackOut_242_1 = 0;
        hd stackOut_243_0 = null;
        int stackOut_243_1 = 0;
        hd stackOut_244_0 = null;
        int stackOut_244_1 = 0;
        hd stackOut_246_0 = null;
        int stackOut_246_1 = 0;
        hd stackOut_247_0 = null;
        int stackOut_247_1 = 0;
        hd stackOut_249_0 = null;
        int stackOut_249_1 = 0;
        int stackOut_249_2 = 0;
        hd stackOut_251_0 = null;
        int stackOut_251_1 = 0;
        int stackOut_251_2 = 0;
        hd stackOut_252_0 = null;
        int stackOut_252_1 = 0;
        hd stackOut_253_0 = null;
        int stackOut_253_1 = 0;
        hd stackOut_254_0 = null;
        int stackOut_254_1 = 0;
        hd stackOut_256_0 = null;
        int stackOut_256_1 = 0;
        hd stackOut_257_0 = null;
        int stackOut_257_1 = 0;
        hd stackOut_259_0 = null;
        int stackOut_259_1 = 0;
        int stackOut_259_2 = 0;
        hd stackOut_261_0 = null;
        int stackOut_261_1 = 0;
        int stackOut_261_2 = 0;
        hd stackOut_262_0 = null;
        int stackOut_262_1 = 0;
        hd stackOut_263_0 = null;
        int stackOut_263_1 = 0;
        hd stackOut_264_0 = null;
        int stackOut_264_1 = 0;
        hd stackOut_266_0 = null;
        int stackOut_266_1 = 0;
        hd stackOut_267_0 = null;
        int stackOut_267_1 = 0;
        hd stackOut_269_0 = null;
        int stackOut_269_1 = 0;
        int stackOut_269_2 = 0;
        hd stackOut_271_0 = null;
        int stackOut_271_1 = 0;
        int stackOut_271_2 = 0;
        Object stackOut_272_0 = null;
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
                      var5_ref = em.field_d;
                      var5_ref.field_q = 0;
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
                            stackOut_22_0 = ua.field_k;
                            stackIn_28_0 = stackOut_22_0;
                            stackIn_23_0 = stackOut_22_0;
                            if (!param3) {
                              break L11;
                            } else {
                              stackOut_23_0 = (hd) (Object) stackIn_23_0;
                              stackIn_28_0 = stackOut_23_0;
                              stackIn_24_0 = stackOut_23_0;
                              if (0L != vg.field_Ib) {
                                break L11;
                              } else {
                                stackOut_24_0 = (hd) (Object) stackIn_24_0;
                                stackIn_26_0 = stackOut_24_0;
                                stackOut_26_0 = (hd) (Object) stackIn_26_0;
                                stackOut_26_1 = 1;
                                stackIn_29_0 = stackOut_26_0;
                                stackIn_29_1 = stackOut_26_1;
                                break L10;
                              }
                            }
                          }
                          stackOut_28_0 = (hd) (Object) stackIn_28_0;
                          stackOut_28_1 = 0;
                          stackIn_29_0 = stackOut_28_0;
                          stackIn_29_1 = stackOut_28_1;
                          break L10;
                        }
                        L12: {
                          stackIn_29_0.field_lb = stackIn_29_1 != 0;
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
                                      stackOut_44_0 = 0;
                                      stackIn_92_0 = stackOut_44_0;
                                      stackIn_45_0 = stackOut_44_0;
                                      if (var19 != 0) {
                                        break L18;
                                      } else {
                                        var12 = stackIn_45_0;
                                        L20: while (true) {
                                          stackOut_46_0 = ~var12;
                                          stackOut_46_1 = ~la.field_k.length;
                                          stackIn_47_0 = stackOut_46_0;
                                          stackIn_47_1 = stackOut_46_1;
                                          L21: while (true) {
                                            L22: {
                                              L23: {
                                                if (stackIn_47_0 <= stackIn_47_1) {
                                                  break L23;
                                                } else {
                                                  var13_array = la.field_k[var12];
                                                  stackOut_48_0 = 0;
                                                  stackIn_87_0 = stackOut_48_0;
                                                  stackIn_49_0 = stackOut_48_0;
                                                  if (var19 != 0) {
                                                    break L22;
                                                  } else {
                                                    var14_int = stackIn_49_0;
                                                    L24: while (true) {
                                                      L25: {
                                                        L26: {
                                                          L27: {
                                                            if (var14_int >= var13_array.length) {
                                                              break L27;
                                                            } else {
                                                              var15 = var13_array[var14_int];
                                                              var16 = var13_array[var14_int + 1];
                                                              stackOut_51_0 = var15;
                                                              stackOut_51_1 = -1;
                                                              stackIn_79_0 = stackOut_51_0;
                                                              stackIn_79_1 = stackOut_51_1;
                                                              stackIn_52_0 = stackOut_51_0;
                                                              stackIn_52_1 = stackOut_51_1;
                                                              if (var19 != 0) {
                                                                break L26;
                                                              } else {
                                                                L28: {
                                                                  L29: {
                                                                    if (stackIn_52_0 != stackIn_52_1) {
                                                                      break L29;
                                                                    } else {
                                                                      L30: {
                                                                        if (0 == var10) {
                                                                          stackOut_60_0 = uv.field_i.field_bc;
                                                                          stackIn_61_0 = stackOut_60_0;
                                                                          break L30;
                                                                        } else {
                                                                          stackOut_58_0 = uv.field_i.field_gc;
                                                                          stackIn_61_0 = stackOut_58_0;
                                                                          break L30;
                                                                        }
                                                                      }
                                                                      L31: {
                                                                        var17_int = stackIn_61_0;
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
                                                          stackOut_78_0 = var13_array.length;
                                                          stackOut_78_1 = var15;
                                                          stackIn_79_0 = stackOut_78_0;
                                                          stackIn_79_1 = stackOut_78_1;
                                                          break L26;
                                                        }
                                                        L32: while (true) {
                                                          L33: {
                                                            if (stackIn_79_0 <= stackIn_79_1) {
                                                              break L33;
                                                            } else {
                                                              var16 = var13_array[var15];
                                                              stackOut_80_0 = ~var14_int;
                                                              stackOut_80_1 = ~var16;
                                                              stackIn_47_0 = stackOut_80_0;
                                                              stackIn_47_1 = stackOut_80_1;
                                                              stackIn_81_0 = stackOut_80_0;
                                                              stackIn_81_1 = stackOut_80_1;
                                                              if (var19 != 0) {
                                                                continue L21;
                                                              } else {
                                                                L34: {
                                                                  if (stackIn_81_0 <= stackIn_81_1) {
                                                                    break L34;
                                                                  } else {
                                                                    var14_int = var16;
                                                                    break L34;
                                                                  }
                                                                }
                                                                var15 += 2;
                                                                if (var19 == 0) {
                                                                  stackOut_78_0 = var13_array.length;
                                                                  stackOut_78_1 = var15;
                                                                  stackIn_79_0 = stackOut_78_0;
                                                                  stackIn_79_1 = stackOut_78_1;
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
                                              stackOut_86_0 = var11_int;
                                              stackIn_87_0 = stackOut_86_0;
                                              break L22;
                                            }
                                            if (stackIn_87_0 != 0) {
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
                                  stackOut_91_0 = 2;
                                  stackIn_92_0 = stackOut_91_0;
                                  break L18;
                                }
                                if (stackIn_92_0 > tk.field_Ib) {
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
                            if (var10 < 2) {
                              break L36;
                            } else {
                              L37: {
                                if (null != ds.field_h) {
                                  break L37;
                                } else {
                                  if (null != lh.field_E) {
                                    break L37;
                                  } else {
                                    if (null != so.field_f) {
                                      break L37;
                                    } else {
                                      if (null == hm.field_D) {
                                        break L35;
                                      } else {
                                        break L37;
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
                              L38: while (true) {
                                L39: {
                                  if (~var16 <= ~ss.field_j) {
                                    break L39;
                                  } else {
                                    var17_int = 255 & uv.field_i.field_Eb[var16];
                                    stackOut_114_0 = null;
                                    stackIn_273_0 = stackOut_114_0;
                                    stackIn_115_0 = stackOut_114_0;
                                    if (var19 != 0) {
                                      break L1;
                                    } else {
                                      L40: {
                                        if (stackIn_115_0 == (Object) (Object) ds.field_h) {
                                          break L40;
                                        } else {
                                          if (ds.field_h[var16] == null) {
                                            break L40;
                                          } else {
                                            if (!ds.field_h[var16][var17_int]) {
                                              break L40;
                                            } else {
                                              var11_int = 1;
                                              break L40;
                                            }
                                          }
                                        }
                                      }
                                      L41: {
                                        if (lh.field_E == null) {
                                          break L41;
                                        } else {
                                          if (lh.field_E[var16] == null) {
                                            break L41;
                                          } else {
                                            L42: {
                                              var18_int = lh.field_E[var16][var17_int];
                                              if (var18_int == 0) {
                                                break L42;
                                              } else {
                                                if (fv.field_d) {
                                                  break L42;
                                                } else {
                                                  var11_int = 1;
                                                  break L42;
                                                }
                                              }
                                            }
                                            if (~var18_int >= ~var13_int) {
                                              break L41;
                                            } else {
                                              var13_int = var18_int;
                                              break L41;
                                            }
                                          }
                                        }
                                      }
                                      L43: {
                                        if (null == so.field_f) {
                                          break L43;
                                        } else {
                                          if (so.field_f[var16] != null) {
                                            L44: {
                                              var18_int = so.field_f[var16][var17_int];
                                              if (var18_int > var14_int) {
                                                var14_int = var18_int;
                                                break L44;
                                              } else {
                                                break L44;
                                              }
                                            }
                                            if (var18_int == 0) {
                                              break L43;
                                            } else {
                                              if (fv.field_d) {
                                                break L43;
                                              } else {
                                                var11_int = 1;
                                                break L43;
                                              }
                                            }
                                          } else {
                                            break L43;
                                          }
                                        }
                                      }
                                      L45: {
                                        if (null == hm.field_D) {
                                          break L45;
                                        } else {
                                          if (null == hm.field_D[var16]) {
                                            break L45;
                                          } else {
                                            var15 = var15 | hm.field_D[var16][var17_int];
                                            break L45;
                                          }
                                        }
                                      }
                                      var16++;
                                      if (var19 == 0) {
                                        continue L38;
                                      } else {
                                        break L39;
                                      }
                                    }
                                  }
                                }
                                var16 = 0;
                                var17 = bs.field_c.field_Ab.field_jb;
                                var18 = (he) (Object) var17.g(24009);
                                L46: while (true) {
                                  L47: {
                                    L48: {
                                      if (null == var18) {
                                        break L48;
                                      } else {
                                        stackOut_159_0 = var18.h(-13356);
                                        stackIn_192_0 = stackOut_159_0 ? 1 : 0;
                                        stackIn_160_0 = stackOut_159_0;
                                        if (var19 != 0) {
                                          break L47;
                                        } else {
                                          L49: {
                                            if (stackIn_160_0) {
                                              break L49;
                                            } else {
                                              L50: {
                                                if (var11_int == 0) {
                                                  break L50;
                                                } else {
                                                  if (var18.field_Cb) {
                                                    break L50;
                                                  } else {
                                                    var16 = 1;
                                                    if (var19 == 0) {
                                                      break L48;
                                                    } else {
                                                      break L50;
                                                    }
                                                  }
                                                }
                                              }
                                              L51: {
                                                if (~var18.field_Qb <= ~var13_int) {
                                                  break L51;
                                                } else {
                                                  var16 = 1;
                                                  if (var19 == 0) {
                                                    break L48;
                                                  } else {
                                                    break L51;
                                                  }
                                                }
                                              }
                                              L52: {
                                                if (var14_int > var18.field_Db) {
                                                  var16 = 1;
                                                  if (var19 == 0) {
                                                    break L48;
                                                  } else {
                                                    break L52;
                                                  }
                                                } else {
                                                  break L52;
                                                }
                                              }
                                              L53: {
                                                if ((var15 & ~var18.field_Pb) > 0) {
                                                  var16 = 1;
                                                  if (var19 == 0) {
                                                    break L48;
                                                  } else {
                                                    break L53;
                                                  }
                                                } else {
                                                  break L53;
                                                }
                                              }
                                              if (var12 == 0) {
                                                break L49;
                                              } else {
                                                var16 = 1;
                                                if (var19 == 0) {
                                                  break L48;
                                                } else {
                                                  break L49;
                                                }
                                              }
                                            }
                                          }
                                          var18 = (he) (Object) var17.c(param2 ^ -33);
                                          if (var19 == 0) {
                                            continue L46;
                                          } else {
                                            break L48;
                                          }
                                        }
                                      }
                                    }
                                    stackOut_191_0 = ~tk.field_Ib;
                                    stackIn_192_0 = stackOut_191_0;
                                    break L47;
                                  }
                                  L54: {
                                    if (stackIn_192_0 > -3) {
                                      break L54;
                                    } else {
                                      if (ne.field_G[12]) {
                                        var16 = 0;
                                        break L54;
                                      } else {
                                        break L54;
                                      }
                                    }
                                  }
                                  L55: {
                                    if (var16 != 0) {
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
                                    } else {
                                      break L55;
                                    }
                                  }
                                  if (var19 == 0) {
                                    break L35;
                                  } else {
                                    break L36;
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
                            L57: while (true) {
                              L58: {
                                L59: {
                                  if (ss.field_j <= var13_int) {
                                    break L59;
                                  } else {
                                    stackOut_217_0 = m.field_f[var13_int];
                                    stackIn_227_0 = stackOut_217_0 ? 1 : 0;
                                    stackIn_218_0 = stackOut_217_0;
                                    if (var19 != 0) {
                                      break L58;
                                    } else {
                                      L60: {
                                        if (stackIn_218_0) {
                                          L61: {
                                            var14 = "<col=A00000>" + ok.field_b[var13_int] + "</col>";
                                            if (null == var11) {
                                              break L61;
                                            } else {
                                              var12 = 1;
                                              var11 = (Object) (Object) ((String) var11 + ", " + var14);
                                              if (var19 == 0) {
                                                break L60;
                                              } else {
                                                break L61;
                                              }
                                            }
                                          }
                                          var11 = (Object) (Object) var14;
                                          break L60;
                                        } else {
                                          break L60;
                                        }
                                      }
                                      var13_int++;
                                      if (var19 == 0) {
                                        continue L57;
                                      } else {
                                        break L59;
                                      }
                                    }
                                  }
                                }
                                stackOut_226_0 = ~var10;
                                stackIn_227_0 = stackOut_226_0;
                                break L58;
                              }
                              L62: {
                                if (stackIn_227_0 != -1) {
                                  L63: {
                                    var13 = os.field_w;
                                    if (var12 == 0) {
                                      break L63;
                                    } else {
                                      var14 = oi.field_k + (String) var11;
                                      if (var19 == 0) {
                                        break L62;
                                      } else {
                                        break L63;
                                      }
                                    }
                                  }
                                  var14 = vo.a((byte) -18, bp.field_yb, new String[1]);
                                  break L62;
                                } else {
                                  L64: {
                                    var13 = sb.field_g;
                                    if (var12 != 0) {
                                      break L64;
                                    } else {
                                      var14 = vo.a((byte) -18, kb.field_D, new String[1]);
                                      if (var19 == 0) {
                                        break L62;
                                      } else {
                                        break L64;
                                      }
                                    }
                                  }
                                  var14 = gm.field_S + (String) var11;
                                  break L62;
                                }
                              }
                              sn.field_e = "<col=A00000>" + var13 + "<br>" + var14;
                              break L35;
                            }
                          }
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
                  L65: {
                    if (vg.field_Ib == 0L) {
                      break L65;
                    } else {
                      L66: {
                        var9 = (int)(-nj.a(22) + vg.field_Ib);
                        var9 = (var9 - -999) / 1000;
                        if (var9 >= 1) {
                          break L66;
                        } else {
                          var9 = 1;
                          break L66;
                        }
                      }
                      var8.field_E = vo.a((byte) -18, gf.field_h, new String[1]);
                      break L65;
                    }
                  }
                  ka.field_c.field_E = vo.a((byte) -18, ib.field_F, new String[2]);
                  break L2;
                }
              }
              L67: {
                L68: {
                  stackOut_242_0 = dn.field_Cb;
                  stackOut_242_1 = param2 ^ param2;
                  stackIn_251_0 = stackOut_242_0;
                  stackIn_251_1 = stackOut_242_1;
                  stackIn_243_0 = stackOut_242_0;
                  stackIn_243_1 = stackOut_242_1;
                  if (!param0) {
                    break L68;
                  } else {
                    stackOut_243_0 = (hd) (Object) stackIn_243_0;
                    stackOut_243_1 = stackIn_243_1;
                    stackIn_251_0 = stackOut_243_0;
                    stackIn_251_1 = stackOut_243_1;
                    stackIn_244_0 = stackOut_243_0;
                    stackIn_244_1 = stackOut_243_1;
                    if (param4) {
                      break L68;
                    } else {
                      stackOut_244_0 = (hd) (Object) stackIn_244_0;
                      stackOut_244_1 = stackIn_244_1;
                      stackIn_246_0 = stackOut_244_0;
                      stackIn_246_1 = stackOut_244_1;
                      stackOut_246_0 = (hd) (Object) stackIn_246_0;
                      stackOut_246_1 = stackIn_246_1;
                      stackIn_251_0 = stackOut_246_0;
                      stackIn_251_1 = stackOut_246_1;
                      stackIn_247_0 = stackOut_246_0;
                      stackIn_247_1 = stackOut_246_1;
                      if (td.field_b) {
                        break L68;
                      } else {
                        stackOut_247_0 = (hd) (Object) stackIn_247_0;
                        stackOut_247_1 = stackIn_247_1;
                        stackIn_249_0 = stackOut_247_0;
                        stackIn_249_1 = stackOut_247_1;
                        stackOut_249_0 = (hd) (Object) stackIn_249_0;
                        stackOut_249_1 = stackIn_249_1;
                        stackOut_249_2 = 1;
                        stackIn_252_0 = stackOut_249_0;
                        stackIn_252_1 = stackOut_249_1;
                        stackIn_252_2 = stackOut_249_2;
                        break L67;
                      }
                    }
                  }
                }
                stackOut_251_0 = (hd) (Object) stackIn_251_0;
                stackOut_251_1 = stackIn_251_1;
                stackOut_251_2 = 0;
                stackIn_252_0 = stackOut_251_0;
                stackIn_252_1 = stackOut_251_1;
                stackIn_252_2 = stackOut_251_2;
                break L67;
              }
              L69: {
                L70: {
                  ((hd) (Object) stackIn_252_0).b(stackIn_252_1, stackIn_252_2 != 0);
                  stackOut_252_0 = fp.field_p;
                  stackOut_252_1 = 0;
                  stackIn_261_0 = stackOut_252_0;
                  stackIn_261_1 = stackOut_252_1;
                  stackIn_253_0 = stackOut_252_0;
                  stackIn_253_1 = stackOut_252_1;
                  if (!param0) {
                    break L70;
                  } else {
                    stackOut_253_0 = (hd) (Object) stackIn_253_0;
                    stackOut_253_1 = stackIn_253_1;
                    stackIn_261_0 = stackOut_253_0;
                    stackIn_261_1 = stackOut_253_1;
                    stackIn_254_0 = stackOut_253_0;
                    stackIn_254_1 = stackOut_253_1;
                    if (param4) {
                      break L70;
                    } else {
                      stackOut_254_0 = (hd) (Object) stackIn_254_0;
                      stackOut_254_1 = stackIn_254_1;
                      stackIn_256_0 = stackOut_254_0;
                      stackIn_256_1 = stackOut_254_1;
                      stackOut_256_0 = (hd) (Object) stackIn_256_0;
                      stackOut_256_1 = stackIn_256_1;
                      stackIn_261_0 = stackOut_256_0;
                      stackIn_261_1 = stackOut_256_1;
                      stackIn_257_0 = stackOut_256_0;
                      stackIn_257_1 = stackOut_256_1;
                      if (td.field_b) {
                        break L70;
                      } else {
                        stackOut_257_0 = (hd) (Object) stackIn_257_0;
                        stackOut_257_1 = stackIn_257_1;
                        stackIn_259_0 = stackOut_257_0;
                        stackIn_259_1 = stackOut_257_1;
                        stackOut_259_0 = (hd) (Object) stackIn_259_0;
                        stackOut_259_1 = stackIn_259_1;
                        stackOut_259_2 = 1;
                        stackIn_262_0 = stackOut_259_0;
                        stackIn_262_1 = stackOut_259_1;
                        stackIn_262_2 = stackOut_259_2;
                        break L69;
                      }
                    }
                  }
                }
                stackOut_261_0 = (hd) (Object) stackIn_261_0;
                stackOut_261_1 = stackIn_261_1;
                stackOut_261_2 = 0;
                stackIn_262_0 = stackOut_261_0;
                stackIn_262_1 = stackOut_261_1;
                stackIn_262_2 = stackOut_261_2;
                break L69;
              }
              L71: {
                L72: {
                  ((hd) (Object) stackIn_262_0).b(stackIn_262_1, stackIn_262_2 != 0);
                  stackOut_262_0 = tn.field_f;
                  stackOut_262_1 = 0;
                  stackIn_271_0 = stackOut_262_0;
                  stackIn_271_1 = stackOut_262_1;
                  stackIn_263_0 = stackOut_262_0;
                  stackIn_263_1 = stackOut_262_1;
                  if (!param0) {
                    break L72;
                  } else {
                    stackOut_263_0 = (hd) (Object) stackIn_263_0;
                    stackOut_263_1 = stackIn_263_1;
                    stackIn_271_0 = stackOut_263_0;
                    stackIn_271_1 = stackOut_263_1;
                    stackIn_264_0 = stackOut_263_0;
                    stackIn_264_1 = stackOut_263_1;
                    if (param4) {
                      break L72;
                    } else {
                      stackOut_264_0 = (hd) (Object) stackIn_264_0;
                      stackOut_264_1 = stackIn_264_1;
                      stackIn_266_0 = stackOut_264_0;
                      stackIn_266_1 = stackOut_264_1;
                      stackOut_266_0 = (hd) (Object) stackIn_266_0;
                      stackOut_266_1 = stackIn_266_1;
                      stackIn_271_0 = stackOut_266_0;
                      stackIn_271_1 = stackOut_266_1;
                      stackIn_267_0 = stackOut_266_0;
                      stackIn_267_1 = stackOut_266_1;
                      if (!td.field_b) {
                        break L72;
                      } else {
                        stackOut_267_0 = (hd) (Object) stackIn_267_0;
                        stackOut_267_1 = stackIn_267_1;
                        stackIn_269_0 = stackOut_267_0;
                        stackIn_269_1 = stackOut_267_1;
                        stackOut_269_0 = (hd) (Object) stackIn_269_0;
                        stackOut_269_1 = stackIn_269_1;
                        stackOut_269_2 = 1;
                        stackIn_272_0 = stackOut_269_0;
                        stackIn_272_1 = stackOut_269_1;
                        stackIn_272_2 = stackOut_269_2;
                        break L71;
                      }
                    }
                  }
                }
                stackOut_271_0 = (hd) (Object) stackIn_271_0;
                stackOut_271_1 = stackIn_271_1;
                stackOut_271_2 = 0;
                stackIn_272_0 = stackOut_271_0;
                stackIn_272_1 = stackOut_271_1;
                stackIn_272_2 = stackOut_271_2;
                break L71;
              }
              ((hd) (Object) stackIn_272_0).b(stackIn_272_1, stackIn_272_2 != 0);
              ni.field_l.field_b.h((byte) 71);
              stackOut_272_0 = null;
              stackIn_273_0 = stackOut_272_0;
              break L1;
            }
            L73: {
              if (stackIn_273_0 == (Object) (Object) uv.field_i) {
                break L73;
              } else {
                L74: {
                  if (ac.field_b.field_sb != 0) {
                    gu.a(uv.field_i.h((byte) 73), (byte) -108, param1);
                    break L74;
                  } else {
                    break L74;
                  }
                }
                L75: {
                  if (ua.field_k.field_sb == 0) {
                    break L75;
                  } else {
                    gs.field_e = true;
                    break L75;
                  }
                }
                L76: {
                  if (em.field_d.field_sb == 0) {
                    break L76;
                  } else {
                    td.field_b = true;
                    break L76;
                  }
                }
                L77: {
                  if (kt.field_i.field_sb != 0) {
                    td.field_b = false;
                    break L77;
                  } else {
                    break L77;
                  }
                }
                ma.a(param1, (byte) -57, uv.field_i, false);
                break L73;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var5, "lu.DB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException runtimeException = null;
        int var6_int = 0;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var6_int = ((lu) this).field_o << 1243163011;
              param3 = (15 & var6_int) + (param3 << -448835164);
              var7 = ((lu) this).field_v << 576627171;
              param0 = (param0 << 510368324) + (var7 & 15);
              ((lu) this).a(var6_int, var7, param3, param0, param2, param4);
              if (param1 == 24407) {
                break L1;
              } else {
                lu.a(false, 46, 70, true, false);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw nb.a((Throwable) (Object) runtimeException, "lu.EB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
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
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_34_0 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
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
                  param3[0] = param1;
                  stackOut_5_0 = 1;
                  stackIn_6_0 = stackOut_5_0;
                  return stackIn_6_0;
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
                      stackOut_12_0 = -33;
                      stackOut_12_1 = ~var10;
                      stackIn_30_0 = stackOut_12_0;
                      stackIn_30_1 = stackOut_12_1;
                      stackIn_13_0 = stackOut_12_0;
                      stackIn_13_1 = stackOut_12_1;
                      if (var13 != 0) {
                        break L3;
                      } else {
                        L5: {
                          L6: {
                            if (stackIn_13_0 == stackIn_13_1) {
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
                  stackOut_29_0 = var8;
                  stackOut_29_1 = var7;
                  stackIn_30_0 = stackOut_29_0;
                  stackIn_30_1 = stackOut_29_1;
                  break L3;
                }
                L8: {
                  if (stackIn_30_0 <= stackIn_30_1) {
                    break L8;
                  } else {
                    int incrementValue$5 = var6;
                    var6++;
                    param3[incrementValue$5] = param1.substring(var7, var8).trim();
                    break L8;
                  }
                }
                stackOut_33_0 = var6;
                stackIn_34_0 = stackOut_33_0;
                break L0;
              }
            } else {
              stackOut_8_0 = 59;
              stackIn_9_0 = stackOut_8_0;
              return stackIn_9_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) var5;
            stackOut_35_1 = new StringBuilder().append("lu.FB(");
            stackIn_38_0 = stackOut_35_0;
            stackIn_38_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param0 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L9;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_39_0 = stackOut_36_0;
              stackIn_39_1 = stackOut_36_1;
              stackIn_39_2 = stackOut_36_2;
              break L9;
            }
          }
          L10: {
            stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
            stackOut_39_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_39_2).append(',');
            stackIn_42_0 = stackOut_39_0;
            stackIn_42_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param1 == null) {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L10;
            } else {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "{...}";
              stackIn_43_0 = stackOut_40_0;
              stackIn_43_1 = stackOut_40_1;
              stackIn_43_2 = stackOut_40_2;
              break L10;
            }
          }
          L11: {
            stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
            stackOut_43_1 = ((StringBuilder) (Object) stackIn_43_1).append(stackIn_43_2).append(',').append(param2).append(',');
            stackIn_46_0 = stackOut_43_0;
            stackIn_46_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param3 == null) {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L11;
            } else {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "{...}";
              stackIn_47_0 = stackOut_44_0;
              stackIn_47_1 = stackOut_44_1;
              stackIn_47_2 = stackOut_44_2;
              break L11;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_47_0, stackIn_47_2 + ',' + param4 + ')');
        }
        return stackIn_34_0;
    }

    public static void g(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -28) {
                break L1;
              } else {
                lu.a(47, -58);
                break L1;
              }
            }
            field_p = null;
            field_t = null;
            field_r = null;
            field_u = null;
            field_x = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var1, "lu.GB(" + param0 + ')');
        }
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
