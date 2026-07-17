/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ee {
    boolean field_lb;
    int field_g;
    int field_N;
    boolean field_fb;
    ie field_D;
    boolean field_W;
    int field_eb;
    int field_Q;
    ul field_T;
    private int[] field_Z;
    hd field_ab;
    int field_kb;
    boolean field_j;
    private t field_U;
    static boolean field_G;
    static gh field_H;
    boolean field_h;
    private int[] field_E;
    int field_c;
    int field_a;
    int field_M;
    int field_A;
    ul field_K;
    static String field_I;
    int field_R;
    mb field_y;
    private int field_t;
    int field_gb;
    boolean field_p;
    int field_v;
    int field_d;
    static String field_k;
    int field_f;
    int field_r;
    int field_q;
    private int field_m;
    ul field_o;
    int field_X;
    ul field_O;
    int field_Y;
    int field_n;
    ul field_u;
    int field_P;
    ul field_db;
    int field_s;
    String[] field_bb;
    int field_B;
    private int field_w;
    private int field_F;
    int field_b;
    private int field_ib;
    int field_hb;
    int field_V;
    int field_cb;
    static String field_L;
    ul field_e;
    int field_l;
    static int[] field_S;
    private int field_i;
    ul field_C;
    static String[] field_jb;
    ra field_J;
    static String field_x;
    int field_z;

    private final void a(int param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        wl var6 = null;
        try {
            var3_int = (((ee) this).field_ab.field_o[param1] << 4) + -75000 + 150000 * param1;
            var4 = ((ee) this).field_ab.field_o[-param1 + 1] << 4;
            var5 = -30000;
            var6 = new wl(var3_int, var5, -1 + 2 * param1, 0, 50, 1, 17, (ee) this, (mb) null, 1000 - -((ee) this).field_R, var4, 30);
            ((ee) this).field_T.a(3, (ck) (Object) var6);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "ee.D(" + 1 + 44 + param1 + 41);
        }
    }

    private final boolean e(int param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_7_0 = 0;
        var4 = SteelSentinels.field_G;
        try {
          L0: {
            if (((ee) this).field_ab.b(98) != 2) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              if (((ee) this).field_ab.a(false, param1) <= 3000) {
                if (!this.b(true, param1)) {
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  return stackIn_13_0 != 0;
                } else {
                  param1++;
                  L1: while (true) {
                    if (((ee) this).field_ab.field_n <= param1) {
                      stackOut_30_0 = 0;
                      stackIn_31_0 = stackOut_30_0;
                      break L0;
                    } else {
                      if (((ee) this).field_ab.a(false, param1) > 3000) {
                        stackOut_24_0 = 1;
                        stackIn_25_0 = stackOut_24_0;
                        return stackIn_25_0 != 0;
                      } else {
                        if (this.b(true, param1)) {
                          param1++;
                          continue L1;
                        } else {
                          stackOut_27_0 = 0;
                          stackIn_28_0 = stackOut_27_0;
                          return stackIn_28_0 != 0;
                        }
                      }
                    }
                  }
                }
              } else {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var3, "ee.E(" + -44 + 44 + param1 + 41);
        }
        return stackIn_31_0 != 0;
    }

    final void b(byte param0) {
        int var2_int = 0;
        int var3 = 0;
        int[][] var3_ref_int____ = null;
        int[] var4_ref_int__ = null;
        int var4 = 0;
        int var5 = 0;
        mb var5_ref_mb = null;
        int[] var5_ref_int__ = null;
        jc var5_ref_jc = null;
        wl var5_ref_wl = null;
        int var6_int = 0;
        ne var6 = null;
        int[] var6_array = null;
        int var7 = 0;
        int var8_int = 0;
        Object var8 = null;
        Object var9 = null;
        int var9_int = 0;
        mb var10_ref_mb = null;
        int var10 = 0;
        mb var11 = null;
        int var11_int = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int stackIn_19_0 = 0;
        int stackIn_33_0 = 0;
        mb stackIn_257_0 = null;
        int stackIn_257_1 = 0;
        mb stackIn_258_0 = null;
        int stackIn_258_1 = 0;
        mb stackIn_259_0 = null;
        int stackIn_259_1 = 0;
        int stackIn_259_2 = 0;
        int stackIn_541_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_32_0 = 0;
        mb stackOut_256_0 = null;
        int stackOut_256_1 = 0;
        mb stackOut_258_0 = null;
        int stackOut_258_1 = 0;
        int stackOut_258_2 = 0;
        mb stackOut_257_0 = null;
        int stackOut_257_1 = 0;
        int stackOut_257_2 = 0;
        int stackOut_540_0 = 0;
        int stackOut_539_0 = 0;
        L0: {
          var15 = SteelSentinels.field_G;
          ((ee) this).field_N = ((ee) this).field_N + 2 * oh.field_f;
          if ((((ee) this).field_v & 32) != 0) {
            L1: {
              if (((ee) this).field_ab.field_h[1] != 6000) {
                break L1;
              } else {
                break L1;
              }
            }
            if (50 == ((ee) this).field_b) {
              ((ee) this).field_ab.field_h[1] = -10000;
              break L0;
            } else {
              break L0;
            }
          } else {
            break L0;
          }
        }
        L2: {
          if ((16 & ((ee) this).field_v) != 0) {
            L3: {
              if (((ee) this).field_ab.field_h[0] == 6000) {
                break L3;
              } else {
                break L3;
              }
            }
            if (((ee) this).field_b != 50) {
              break L2;
            } else {
              ((ee) this).field_ab.field_h[0] = -10000;
              break L2;
            }
          } else {
            break L2;
          }
        }
        L4: {
          ((ee) this).field_q = ((ee) this).field_q + pi.field_c;
          ((ee) this).field_f = ((ee) this).field_f - oh.field_f;
          ((ee) this).field_a = ((ee) this).field_a - pi.field_c;
          if (!((ee) this).field_j) {
            break L4;
          } else {
            if (((ee) this).field_h) {
              return;
            } else {
              break L4;
            }
          }
        }
        L5: {
          if (di.field_g < 0) {
            stackOut_18_0 = 0;
            stackIn_19_0 = stackOut_18_0;
            break L5;
          } else {
            stackOut_17_0 = 1;
            stackIn_19_0 = stackOut_17_0;
            break L5;
          }
        }
        L6: {
          var2_int = stackIn_19_0;
          if (((ee) this).field_j) {
            break L6;
          } else {
            if (10 != di.field_g) {
              break L6;
            } else {
              if (qh.field_Yb > 0) {
                if (!((ee) this).f(param0 ^ -114)) {
                  break L6;
                } else {
                  var3_ref_int____ = ua.field_I[ol.field_Ub + 10 * ge.field_j];
                  if (1 + ((ee) this).field_cb >= var3_ref_int____.length) {
                    if (!((ee) this).field_j) {
                      L7: {
                        ((ee) this).field_j = true;
                        nc.field_a = ((ee) this).field_r / 50;
                        if (b.field_f) {
                          nc.field_a = nc.field_a + 600;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      var4 = 0;
                      var5_ref_jc = new jc(((ee) this).field_e);
                      var6 = (ne) (Object) var5_ref_jc.b(2);
                      L8: while (true) {
                        if (var6 == null) {
                          L9: {
                            var6_int = 0;
                            var7 = 0;
                            var8_int = 0;
                            var9_int = 0;
                            var10_ref_mb = ((ee) this).f(0, -127);
                            if (var10_ref_mb != null) {
                              var8_int = var10_ref_mb.field_Tb;
                              var7 = var10_ref_mb.field_Eb;
                              var6_int = var10_ref_mb.field_rb;
                              var9_int = var10_ref_mb.field_x - ag.a(91, var10_ref_mb.field_rc);
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          mj.a(ge.field_j, -(var9_int * 50000) + (((ee) this).field_M + ((ee) this).field_f), nc.field_a, ol.field_Ub, -(var7 * 60000) + (-(var6_int * 128) + ((ee) this).field_a), -(var8_int * 256) + (-(var4 * 100) + ((ee) this).field_N), ((ee) this).field_q, (byte) -65);
                          break L6;
                        } else {
                          var4 = var4 + var6.field_O;
                          var6 = (ne) (Object) var5_ref_jc.d(2);
                          continue L8;
                        }
                      }
                    } else {
                      break L6;
                    }
                  } else {
                    L10: {
                      L11: {
                        ((ee) this).field_cb = ((ee) this).field_cb + 1;
                        if (((ee) this).field_cb <= 0) {
                          break L11;
                        } else {
                          if (0 >= ge.field_j) {
                            break L11;
                          } else {
                            stackOut_31_0 = 1;
                            stackIn_33_0 = stackOut_31_0;
                            break L10;
                          }
                        }
                      }
                      stackOut_32_0 = 0;
                      stackIn_33_0 = stackOut_32_0;
                      break L10;
                    }
                    var4 = stackIn_33_0;
                    var5_ref_int__ = var3_ref_int____[((ee) this).field_cb];
                    var6_int = var5_ref_int__.length;
                    var7 = 0;
                    L12: while (true) {
                      if (~var6_int >= ~var7) {
                        break L6;
                      } else {
                        L13: {
                          var8 = null;
                          if (var5_ref_int__[var7] != 0) {
                            break L13;
                          } else {
                            var8 = (Object) (Object) nn.field_c;
                            break L13;
                          }
                        }
                        L14: {
                          if (var5_ref_int__[var7] == 1) {
                            var8 = (Object) (Object) va.field_f;
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                        L15: {
                          if (var5_ref_int__[var7] == 2) {
                            var8 = (Object) (Object) qm.field_d;
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                        L16: {
                          if (var5_ref_int__[var7] != 3) {
                            break L16;
                          } else {
                            var8 = (Object) (Object) kj.field_D;
                            break L16;
                          }
                        }
                        L17: {
                          if (var5_ref_int__[var7] != 4) {
                            break L17;
                          } else {
                            var8 = (Object) (Object) rn.field_o;
                            break L17;
                          }
                        }
                        L18: {
                          if (var5_ref_int__[var7] != 5) {
                            break L18;
                          } else {
                            var8 = (Object) (Object) oc.field_f;
                            break L18;
                          }
                        }
                        L19: {
                          if (var5_ref_int__[var7] != 6) {
                            break L19;
                          } else {
                            var8 = (Object) (Object) hk.field_Vb;
                            break L19;
                          }
                        }
                        L20: {
                          if (var5_ref_int__[var7] != 7) {
                            break L20;
                          } else {
                            var8 = (Object) (Object) ua.field_v;
                            break L20;
                          }
                        }
                        L21: {
                          if (var5_ref_int__[var7] == 8) {
                            var8 = (Object) (Object) ua.field_x;
                            break L21;
                          } else {
                            break L21;
                          }
                        }
                        L22: {
                          if (var5_ref_int__[var7] != 9) {
                            break L22;
                          } else {
                            var8 = (Object) (Object) ua.field_P;
                            break L22;
                          }
                        }
                        L23: {
                          if (10 == var5_ref_int__[var7]) {
                            var8 = (Object) (Object) ua.field_z;
                            break L23;
                          } else {
                            break L23;
                          }
                        }
                        L24: {
                          if (var5_ref_int__[var7] != 11) {
                            break L24;
                          } else {
                            var8 = (Object) (Object) ua.field_N;
                            break L24;
                          }
                        }
                        L25: {
                          if (var5_ref_int__[var7] != 12) {
                            break L25;
                          } else {
                            var8 = (Object) (Object) ua.field_O;
                            break L25;
                          }
                        }
                        L26: {
                          if (var5_ref_int__[var7] == 13) {
                            var8 = (Object) (Object) ua.field_D;
                            break L26;
                          } else {
                            break L26;
                          }
                        }
                        L27: {
                          if (var5_ref_int__[var7] != 14) {
                            break L27;
                          } else {
                            var8 = (Object) (Object) ua.field_J;
                            break L27;
                          }
                        }
                        L28: {
                          if (var5_ref_int__[var7] == 15) {
                            var8 = (Object) (Object) ua.field_E;
                            break L28;
                          } else {
                            break L28;
                          }
                        }
                        L29: {
                          if (var5_ref_int__[var7] == 16) {
                            var8 = (Object) (Object) vk.field_s;
                            break L29;
                          } else {
                            break L29;
                          }
                        }
                        L30: {
                          if (17 != var5_ref_int__[var7]) {
                            break L30;
                          } else {
                            var8 = (Object) (Object) jm.field_p;
                            break L30;
                          }
                        }
                        L31: {
                          if (var5_ref_int__[var7] == 18) {
                            var8 = (Object) (Object) si.field_k;
                            break L31;
                          } else {
                            break L31;
                          }
                        }
                        L32: {
                          if (var5_ref_int__[var7] == 20) {
                            var8 = (Object) (Object) eb.field_o;
                            break L32;
                          } else {
                            break L32;
                          }
                        }
                        L33: {
                          if (21 == var5_ref_int__[var7]) {
                            var8 = (Object) (Object) bb.field_S;
                            break L33;
                          } else {
                            break L33;
                          }
                        }
                        L34: {
                          if (var5_ref_int__[var7] == 22) {
                            var8 = (Object) (Object) ff.field_ob;
                            break L34;
                          } else {
                            break L34;
                          }
                        }
                        L35: {
                          if (var5_ref_int__[var7] != 23) {
                            break L35;
                          } else {
                            var8 = (Object) (Object) uj.field_i;
                            break L35;
                          }
                        }
                        L36: {
                          if (var5_ref_int__[var7] == 24) {
                            var8 = (Object) (Object) pg.field_z;
                            break L36;
                          } else {
                            break L36;
                          }
                        }
                        L37: {
                          var9_int = -1;
                          if (ge.field_j != 1) {
                            break L37;
                          } else {
                            if (ol.field_Ub == 9) {
                              var10 = ((ee) this).field_cb;
                              if (var10 == 0) {
                                if (0 != var7) {
                                  break L37;
                                } else {
                                  var9_int = 36;
                                  break L37;
                                }
                              } else {
                                if (1 != var10) {
                                  if (var10 == 2) {
                                    if (var7 != 0) {
                                      break L37;
                                    } else {
                                      var9_int = 35;
                                      break L37;
                                    }
                                  } else {
                                    if (var10 == 3) {
                                      if (var7 != 0) {
                                        break L37;
                                      } else {
                                        var9_int = 45;
                                        break L37;
                                      }
                                    } else {
                                      if (var10 != 4) {
                                        break L37;
                                      } else {
                                        var9_int = 41;
                                        break L37;
                                      }
                                    }
                                  }
                                } else {
                                  if (var7 != 0) {
                                    break L37;
                                  } else {
                                    var9_int = 15;
                                    break L37;
                                  }
                                }
                              }
                            } else {
                              break L37;
                            }
                          }
                        }
                        L38: {
                          if (ge.field_j != 1) {
                            break L38;
                          } else {
                            if (ol.field_Ub != 6) {
                              break L38;
                            } else {
                              if (var7 != 0) {
                                break L38;
                              } else {
                                L39: {
                                  var10 = ((ee) this).field_cb;
                                  if (var10 != 0) {
                                    if (2 != var10) {
                                      if (var10 != 4) {
                                        break L38;
                                      } else {
                                        break L39;
                                      }
                                    } else {
                                      break L39;
                                    }
                                  } else {
                                    break L39;
                                  }
                                }
                                var9_int = 33;
                                break L38;
                              }
                            }
                          }
                        }
                        L40: {
                          if (1 != ge.field_j) {
                            break L40;
                          } else {
                            if (ol.field_Ub != 1) {
                              break L40;
                            } else {
                              L41: {
                                if (((ee) this).field_cb != 2) {
                                  break L41;
                                } else {
                                  if (0 == var7) {
                                    var9_int = 45;
                                    break L41;
                                  } else {
                                    break L41;
                                  }
                                }
                              }
                              if (((ee) this).field_cb != 4) {
                                break L40;
                              } else {
                                if (var7 != 0) {
                                  break L40;
                                } else {
                                  var9_int = 45;
                                  break L40;
                                }
                              }
                            }
                          }
                        }
                        L42: {
                          if (ge.field_j != 2) {
                            break L42;
                          } else {
                            if (ol.field_Ub != 3) {
                              break L42;
                            } else {
                              if (((ee) this).field_cb != 3) {
                                break L42;
                              } else {
                                if (var7 == 0) {
                                  var9_int = 45;
                                  break L42;
                                } else {
                                  break L42;
                                }
                              }
                            }
                          }
                        }
                        L43: {
                          if (ge.field_j != 2) {
                            break L43;
                          } else {
                            if (ol.field_Ub != 1) {
                              break L43;
                            } else {
                              if (var5_ref_int__[var7] == 9) {
                                var9_int = 36;
                                break L43;
                              } else {
                                break L43;
                              }
                            }
                          }
                        }
                        L44: {
                          if (ge.field_j != 2) {
                            break L44;
                          } else {
                            if (ol.field_Ub != 2) {
                              break L44;
                            } else {
                              if (var7 == 0) {
                                if (((ee) this).field_cb == 2) {
                                  var9_int = 18;
                                  break L44;
                                } else {
                                  break L44;
                                }
                              } else {
                                break L44;
                              }
                            }
                          }
                        }
                        L45: {
                          var10 = 36;
                          if (ge.field_j != 2) {
                            break L45;
                          } else {
                            if (ol.field_Ub == 9) {
                              L46: {
                                if (var7 != 0) {
                                  break L46;
                                } else {
                                  L47: {
                                    if (((ee) this).field_cb == 1) {
                                      break L47;
                                    } else {
                                      if (((ee) this).field_cb != 3) {
                                        break L46;
                                      } else {
                                        break L47;
                                      }
                                    }
                                  }
                                  var9_int = 45;
                                  break L46;
                                }
                              }
                              L48: {
                                if (-1 + var3_ref_int____.length == ((ee) this).field_cb) {
                                  var11_int = var7;
                                  if (var11_int == 0) {
                                    var9_int = 37;
                                    break L48;
                                  } else {
                                    if (var11_int != 1) {
                                      if (var11_int != 2) {
                                        break L48;
                                      } else {
                                        var9_int = 15;
                                        break L48;
                                      }
                                    } else {
                                      var9_int = 14;
                                      break L48;
                                    }
                                  }
                                } else {
                                  break L48;
                                }
                              }
                              var10 = 38;
                              break L45;
                            } else {
                              break L45;
                            }
                          }
                        }
                        L49: {
                          if (ge.field_j != 1) {
                            break L49;
                          } else {
                            if (ol.field_Ub != 8) {
                              break L49;
                            } else {
                              L50: {
                                if (2 != ((ee) this).field_cb) {
                                  break L50;
                                } else {
                                  if (0 == var7) {
                                    var9_int = 15;
                                    break L50;
                                  } else {
                                    break L50;
                                  }
                                }
                              }
                              if (((ee) this).field_cb != 3) {
                                break L49;
                              } else {
                                if (0 != var7) {
                                  break L49;
                                } else {
                                  var9_int = 9;
                                  break L49;
                                }
                              }
                            }
                          }
                        }
                        L51: {
                          if (ge.field_j != 1) {
                            break L51;
                          } else {
                            if (ol.field_Ub == 7) {
                              L52: {
                                if (((ee) this).field_cb != 3) {
                                  break L52;
                                } else {
                                  if (var7 != 0) {
                                    break L52;
                                  } else {
                                    var9_int = 39;
                                    break L52;
                                  }
                                }
                              }
                              if (5 != ((ee) this).field_cb) {
                                break L51;
                              } else {
                                if (var5_ref_int__[var7] == 9) {
                                  var9_int = 22;
                                  break L51;
                                } else {
                                  break L51;
                                }
                              }
                            } else {
                              break L51;
                            }
                          }
                        }
                        L53: {
                          if (ge.field_j != 2) {
                            break L53;
                          } else {
                            if (5 == ol.field_Ub) {
                              L54: {
                                if (var7 != 0) {
                                  break L54;
                                } else {
                                  if (((ee) this).field_cb != 0) {
                                    break L54;
                                  } else {
                                    var9_int = 36;
                                    break L54;
                                  }
                                }
                              }
                              L55: {
                                if (var7 != 0) {
                                  break L55;
                                } else {
                                  if (2 != ((ee) this).field_cb) {
                                    break L55;
                                  } else {
                                    var9_int = 37;
                                    break L55;
                                  }
                                }
                              }
                              if (var7 != 0) {
                                break L53;
                              } else {
                                if (((ee) this).field_cb != 3) {
                                  break L53;
                                } else {
                                  var9_int = 42;
                                  break L53;
                                }
                              }
                            } else {
                              break L53;
                            }
                          }
                        }
                        L56: {
                          if (ge.field_j != 2) {
                            break L56;
                          } else {
                            if (ol.field_Ub == 7) {
                              if (1 != var7) {
                                break L56;
                              } else {
                                if (((ee) this).field_cb != 2) {
                                  break L56;
                                } else {
                                  var9_int = 33;
                                  break L56;
                                }
                              }
                            } else {
                              break L56;
                            }
                          }
                        }
                        L57: {
                          if (var8 == null) {
                            break L57;
                          } else {
                            if (0 != var5_ref_int__[var7]) {
                              L58: {
                                var11 = new mb(0, 0, (ee) this);
                                var11.a((int[]) var8, true, false, -1, 1);
                                var11.field_Nb = 7;
                                if (-1 == var9_int) {
                                  if (var4 != 0) {
                                    var11.field_hb = var10;
                                    var4 = 0;
                                    break L58;
                                  } else {
                                    break L58;
                                  }
                                } else {
                                  var11.field_hb = var9_int;
                                  break L58;
                                }
                              }
                              ((ee) this).field_K.a(3, (ck) (Object) var11);
                              var11.j(-5);
                              var11.field_Gb = -320000;
                              var11.field_K = 0;
                              var11.field_fc = var11.field_Gb;
                              var11.field_Qb = 150;
                              var11.field_ab = 8000;
                              break L57;
                            } else {
                              var11 = new mb(0, 0, (ee) this);
                              var11.a(-1, 3, (int[]) var8, 1);
                              var11.field_Nb = 7;
                              var11.j(param0 + -32);
                              var12 = var11.field_Bb;
                              var13 = var11.field_hc;
                              var11.field_Gb = -320000;
                              var11.field_K = 0;
                              var11.field_ab = 1000;
                              var11.field_Qb = 150;
                              var11.field_fc = var11.field_Gb;
                              ((ee) this).field_K.a(3, (ck) (Object) var11);
                              var11.field_W = var12;
                              var14 = -4;
                              L59: while (true) {
                                if (var14 > 4) {
                                  break L57;
                                } else {
                                  L60: {
                                    if (var14 != 0) {
                                      L61: {
                                        var11 = new mb(0, 0, (ee) this);
                                        var11.a(-1, 3, (int[]) var8, 1);
                                        var11.field_Nb = 7;
                                        ((ee) this).field_K.a(param0 ^ 24, (ck) (Object) var11);
                                        var11.field_W = var12;
                                        var11.field_C = 3000 * var14;
                                        var11.field_hc = var13;
                                        var11.field_Gb = -320000;
                                        var11.field_fc = var11.field_Gb;
                                        var11.field_K = 0;
                                        stackOut_256_0 = (mb) var11;
                                        stackOut_256_1 = 1000 * Math.abs(var14);
                                        stackIn_258_0 = stackOut_256_0;
                                        stackIn_258_1 = stackOut_256_1;
                                        stackIn_257_0 = stackOut_256_0;
                                        stackIn_257_1 = stackOut_256_1;
                                        if (var14 <= 0) {
                                          stackOut_258_0 = (mb) (Object) stackIn_258_0;
                                          stackOut_258_1 = stackIn_258_1;
                                          stackOut_258_2 = 0;
                                          stackIn_259_0 = stackOut_258_0;
                                          stackIn_259_1 = stackOut_258_1;
                                          stackIn_259_2 = stackOut_258_2;
                                          break L61;
                                        } else {
                                          stackOut_257_0 = (mb) (Object) stackIn_257_0;
                                          stackOut_257_1 = stackIn_257_1;
                                          stackOut_257_2 = 500;
                                          stackIn_259_0 = stackOut_257_0;
                                          stackIn_259_1 = stackOut_257_1;
                                          stackIn_259_2 = stackOut_257_2;
                                          break L61;
                                        }
                                      }
                                      stackIn_259_0.field_ab = stackIn_259_1 + stackIn_259_2;
                                      var11.field_Qb = 150;
                                      break L60;
                                    } else {
                                      break L60;
                                    }
                                  }
                                  var14++;
                                  continue L59;
                                }
                              }
                            }
                          }
                        }
                        var7++;
                        continue L12;
                      }
                    }
                  }
                }
              } else {
                break L6;
              }
            }
          }
        }
        L62: {
          if (((ee) this).field_lb) {
            L63: {
              var3 = ((ee) this).field_bb.length;
              if (((ee) this).field_ib <= 0) {
                break L63;
              } else {
                if (((ee) this).field_K.b((byte) -128) >= 30) {
                  break L63;
                } else {
                  if (41 <= ((ee) this).field_cb) {
                    break L63;
                  } else {
                    ((ee) this).field_ib = ((ee) this).field_ib - 1;
                    break L63;
                  }
                }
              }
            }
            if (((ee) this).field_j) {
              break L62;
            } else {
              L64: {
                if (~var3 <= ~((ee) this).field_K.b((byte) -128)) {
                  break L64;
                } else {
                  if (((ee) this).field_ib <= 0) {
                    break L64;
                  } else {
                    break L62;
                  }
                }
              }
              L65: {
                ((ee) this).field_ib = 3000;
                if (ef.field_d.length <= ((ee) this).field_cb) {
                  break L65;
                } else {
                  if (((ee) this).field_cb < 0) {
                    break L65;
                  } else {
                    var4_ref_int__ = ef.field_d[((ee) this).field_cb];
                    var5 = var4_ref_int__.length;
                    var6_int = 0;
                    L66: while (true) {
                      if (var6_int >= var5) {
                        break L65;
                      } else {
                        L67: {
                          var7 = ((ee) this).field_ab.a(-11) * (var6_int - -1) / (var5 + 1) << 4;
                          var8_int = -100000;
                          var9 = null;
                          if (var4_ref_int__[var6_int] == 0) {
                            var9 = (Object) (Object) nn.field_c;
                            break L67;
                          } else {
                            break L67;
                          }
                        }
                        L68: {
                          if (var4_ref_int__[var6_int] == 1) {
                            var9 = (Object) (Object) va.field_f;
                            break L68;
                          } else {
                            break L68;
                          }
                        }
                        L69: {
                          if (2 != var4_ref_int__[var6_int]) {
                            break L69;
                          } else {
                            var9 = (Object) (Object) qm.field_d;
                            break L69;
                          }
                        }
                        L70: {
                          if (3 == var4_ref_int__[var6_int]) {
                            var9 = (Object) (Object) kj.field_D;
                            break L70;
                          } else {
                            break L70;
                          }
                        }
                        L71: {
                          if (var4_ref_int__[var6_int] == 4) {
                            var9 = (Object) (Object) rn.field_o;
                            break L71;
                          } else {
                            break L71;
                          }
                        }
                        L72: {
                          if (var4_ref_int__[var6_int] == 5) {
                            var9 = (Object) (Object) oc.field_f;
                            break L72;
                          } else {
                            break L72;
                          }
                        }
                        L73: {
                          if (var4_ref_int__[var6_int] != 6) {
                            break L73;
                          } else {
                            var9 = (Object) (Object) hk.field_Vb;
                            break L73;
                          }
                        }
                        L74: {
                          if (var4_ref_int__[var6_int] != 7) {
                            break L74;
                          } else {
                            var9 = (Object) (Object) ua.field_v;
                            break L74;
                          }
                        }
                        L75: {
                          if (var4_ref_int__[var6_int] == 8) {
                            var9 = (Object) (Object) ua.field_x;
                            break L75;
                          } else {
                            break L75;
                          }
                        }
                        L76: {
                          if (var4_ref_int__[var6_int] != 9) {
                            break L76;
                          } else {
                            var9 = (Object) (Object) ua.field_P;
                            break L76;
                          }
                        }
                        L77: {
                          if (var4_ref_int__[var6_int] != 10) {
                            break L77;
                          } else {
                            var9 = (Object) (Object) ua.field_z;
                            break L77;
                          }
                        }
                        L78: {
                          if (11 != var4_ref_int__[var6_int]) {
                            break L78;
                          } else {
                            var9 = (Object) (Object) ua.field_N;
                            break L78;
                          }
                        }
                        L79: {
                          if (var4_ref_int__[var6_int] == 12) {
                            var9 = (Object) (Object) ua.field_O;
                            break L79;
                          } else {
                            break L79;
                          }
                        }
                        L80: {
                          if (var4_ref_int__[var6_int] == 13) {
                            var9 = (Object) (Object) ua.field_D;
                            break L80;
                          } else {
                            break L80;
                          }
                        }
                        L81: {
                          if (var4_ref_int__[var6_int] == 14) {
                            var9 = (Object) (Object) ua.field_J;
                            break L81;
                          } else {
                            break L81;
                          }
                        }
                        L82: {
                          if (var4_ref_int__[var6_int] != 15) {
                            break L82;
                          } else {
                            var9 = (Object) (Object) ua.field_E;
                            break L82;
                          }
                        }
                        L83: {
                          if (var4_ref_int__[var6_int] != 16) {
                            break L83;
                          } else {
                            var9 = (Object) (Object) vk.field_s;
                            break L83;
                          }
                        }
                        L84: {
                          if (var4_ref_int__[var6_int] == 17) {
                            var9 = (Object) (Object) jm.field_p;
                            break L84;
                          } else {
                            break L84;
                          }
                        }
                        L85: {
                          if (var4_ref_int__[var6_int] == 18) {
                            var9 = (Object) (Object) si.field_k;
                            break L85;
                          } else {
                            break L85;
                          }
                        }
                        L86: {
                          if (null != var9) {
                            if (var4_ref_int__[var6_int] == 0) {
                              var10 = -4;
                              L87: while (true) {
                                if (var10 > 4) {
                                  break L86;
                                } else {
                                  var11 = new mb(var7 - -(3000 * var10), var8_int, (ee) this);
                                  var11.a((int[]) var9, true, false, -1, 1);
                                  var11.field_Nb = 7;
                                  var11.field_ab = 5 * var10;
                                  ((ee) this).field_K.a(3, (ck) (Object) var11);
                                  var10++;
                                  continue L87;
                                }
                              }
                            } else {
                              L88: {
                                var10_ref_mb = new mb(var7, var8_int, (ee) this);
                                var11_int = var4_ref_int__[var6_int];
                                if (var11_int == 7) {
                                  if ((1 & ((ee) this).field_t) != 0) {
                                    break L88;
                                  } else {
                                    var10_ref_mb.field_hb = 21;
                                    ((ee) this).field_t = ((ee) this).field_t | 1;
                                    break L88;
                                  }
                                } else {
                                  if (8 != var11_int) {
                                    if (var11_int != 9) {
                                      if (var11_int == 11) {
                                        if ((16 & ((ee) this).field_t) == 0) {
                                          var10_ref_mb.field_hb = 39;
                                          ((ee) this).field_t = ((ee) this).field_t | 16;
                                          break L88;
                                        } else {
                                          break L88;
                                        }
                                      } else {
                                        if (var11_int != 10) {
                                          if (var11_int != 12) {
                                            if (13 == var11_int) {
                                              if ((128 & ((ee) this).field_t) == 0) {
                                                ((ee) this).field_t = ((ee) this).field_t | 128;
                                                var10_ref_mb.field_hb = 44;
                                                break L88;
                                              } else {
                                                break L88;
                                              }
                                            } else {
                                              if (var11_int == 14) {
                                                if ((((ee) this).field_t & 256) != 0) {
                                                  break L88;
                                                } else {
                                                  ((ee) this).field_t = ((ee) this).field_t | 256;
                                                  var10_ref_mb.field_hb = 15;
                                                  break L88;
                                                }
                                              } else {
                                                if (var11_int != 15) {
                                                  if (var11_int != 16) {
                                                    if (var11_int != 17) {
                                                      L89: {
                                                        if (1 == var11_int) {
                                                          break L89;
                                                        } else {
                                                          if (var11_int == 3) {
                                                            break L89;
                                                          } else {
                                                            if (var11_int != 5) {
                                                              L90: {
                                                                if (2 != var11_int) {
                                                                  if (var11_int != 4) {
                                                                    if (var11_int == 6) {
                                                                      break L90;
                                                                    } else {
                                                                      break L88;
                                                                    }
                                                                  } else {
                                                                    break L90;
                                                                  }
                                                                } else {
                                                                  break L90;
                                                                }
                                                              }
                                                              if ((1 << ((ee) this).field_cb / 2 & ((ee) this).field_i) == 0) {
                                                                ((ee) this).field_i = ((ee) this).field_i | 1 << ((ee) this).field_cb / 2;
                                                                var11_int = ((ee) this).field_cb / 8;
                                                                if (var11_int != 0) {
                                                                  if (var11_int == 1) {
                                                                    var10_ref_mb.field_hb = 1;
                                                                    break L88;
                                                                  } else {
                                                                    if (2 == var11_int) {
                                                                      var10_ref_mb.field_hb = 2;
                                                                      break L88;
                                                                    } else {
                                                                      if (var11_int == 3) {
                                                                        var10_ref_mb.field_hb = 3;
                                                                        break L88;
                                                                      } else {
                                                                        if (var11_int != 4) {
                                                                          break L88;
                                                                        } else {
                                                                          var10_ref_mb.field_hb = 4;
                                                                          break L88;
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                } else {
                                                                  var10_ref_mb.field_hb = 0;
                                                                  break L88;
                                                                }
                                                              } else {
                                                                break L88;
                                                              }
                                                            } else {
                                                              break L89;
                                                            }
                                                          }
                                                        }
                                                      }
                                                      if ((((ee) this).field_m & 1 << ((ee) this).field_cb / 2) != 0) {
                                                        break L88;
                                                      } else {
                                                        ((ee) this).field_m = ((ee) this).field_m | 1 << ((ee) this).field_cb / 2;
                                                        var11_int = ((ee) this).field_cb / 8;
                                                        if (var11_int == 0) {
                                                          var10_ref_mb.field_hb = 5;
                                                          break L88;
                                                        } else {
                                                          if (var11_int != 1) {
                                                            if (var11_int == 2) {
                                                              var10_ref_mb.field_hb = 7;
                                                              break L88;
                                                            } else {
                                                              if (var11_int != 3) {
                                                                if (var11_int != 4) {
                                                                  break L88;
                                                                } else {
                                                                  var10_ref_mb.field_hb = 9;
                                                                  break L88;
                                                                }
                                                              } else {
                                                                var10_ref_mb.field_hb = 8;
                                                                break L88;
                                                              }
                                                            }
                                                          } else {
                                                            var10_ref_mb.field_hb = 6;
                                                            break L88;
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      if ((((ee) this).field_t & 2048) == 0) {
                                                        var10_ref_mb.field_hb = 30;
                                                        ((ee) this).field_t = ((ee) this).field_t | 2048;
                                                        break L88;
                                                      } else {
                                                        break L88;
                                                      }
                                                    }
                                                  } else {
                                                    if ((1024 & ((ee) this).field_t) == 0) {
                                                      ((ee) this).field_t = ((ee) this).field_t | 1024;
                                                      var10_ref_mb.field_hb = 37;
                                                      break L88;
                                                    } else {
                                                      break L88;
                                                    }
                                                  }
                                                } else {
                                                  if (0 != (((ee) this).field_t & 512)) {
                                                    break L88;
                                                  } else {
                                                    ((ee) this).field_t = ((ee) this).field_t | 512;
                                                    var10_ref_mb.field_hb = 38;
                                                    break L88;
                                                  }
                                                }
                                              }
                                            }
                                          } else {
                                            if (0 == (((ee) this).field_t & 64)) {
                                              var10_ref_mb.field_hb = 35;
                                              ((ee) this).field_t = ((ee) this).field_t | 64;
                                              break L88;
                                            } else {
                                              break L88;
                                            }
                                          }
                                        } else {
                                          if (0 == (((ee) this).field_t & 32)) {
                                            ((ee) this).field_t = ((ee) this).field_t | 32;
                                            var10_ref_mb.field_hb = 24;
                                            break L88;
                                          } else {
                                            break L88;
                                          }
                                        }
                                      }
                                    } else {
                                      if ((8 & ((ee) this).field_t) != 0) {
                                        break L88;
                                      } else {
                                        var10_ref_mb.field_hb = 14;
                                        ((ee) this).field_t = ((ee) this).field_t | 8;
                                        break L88;
                                      }
                                    }
                                  } else {
                                    if ((2 & ((ee) this).field_t) == 0) {
                                      var10_ref_mb.field_hb = 28;
                                      ((ee) this).field_t = ((ee) this).field_t | 2;
                                      break L88;
                                    } else {
                                      break L88;
                                    }
                                  }
                                }
                              }
                              var10_ref_mb.a((int[]) var9, true, false, -1, 1);
                              var10_ref_mb.field_Nb = 7;
                              ((ee) this).field_K.a(param0 ^ 24, (ck) (Object) var10_ref_mb);
                              break L86;
                            }
                          } else {
                            break L86;
                          }
                        }
                        var6_int++;
                        continue L66;
                      }
                    }
                  }
                }
              }
              L91: {
                if (((ee) this).field_cb >= 42) {
                  break L91;
                } else {
                  L92: {
                    if (((ee) this).field_cb < 40) {
                      break L92;
                    } else {
                      if (((ee) this).field_kb > 1) {
                        break L92;
                      } else {
                        break L91;
                      }
                    }
                  }
                  L93: {
                    ((ee) this).field_cb = ((ee) this).field_cb + 1;
                    ((ee) this).field_l = ((ee) this).field_cb;
                    if (41 != ((ee) this).field_cb) {
                      break L93;
                    } else {
                      ((ee) this).field_l = 50;
                      break L93;
                    }
                  }
                  if (((ee) this).field_cb == 42) {
                    ((ee) this).field_l = 100;
                    break L62;
                  } else {
                    break L62;
                  }
                }
              }
              if (((ee) this).field_j) {
                break L62;
              } else {
                if (~var3 <= ~((ee) this).field_K.b((byte) -128)) {
                  ((ee) this).field_j = true;
                  ((ee) this).field_cb = 43;
                  break L62;
                } else {
                  break L62;
                }
              }
            }
          } else {
            break L62;
          }
        }
        L94: {
          int discarded$2 = 20;
          this.a();
          ((ee) this).field_r = ((ee) this).field_r + 1;
          if (!((ee) this).field_j) {
            break L94;
          } else {
            if (0 == (7 & ((ee) this).field_r)) {
              break L94;
            } else {
              return;
            }
          }
        }
        L95: {
          if (4 == ((ee) this).field_ab.b(68)) {
            this.a(-27309);
            break L95;
          } else {
            break L95;
          }
        }
        L96: {
          if (((ee) this).field_ab.b(49) != 1) {
            break L96;
          } else {
            if (-1 == di.field_g) {
              var3 = 1;
              var4 = 0;
              var5_ref_mb = (mb) (Object) ((ee) this).field_K.e(param0 + 13031);
              L97: while (true) {
                if (null == var5_ref_mb) {
                  L98: {
                    if (var4 < 0) {
                      var3 = -1;
                      break L98;
                    } else {
                      break L98;
                    }
                  }
                  L99: {
                    if (((ee) this).field_r == 12000) {
                      var5_ref_wl = new wl(0, 0, var3, 0, 0, 1, 12, (ee) this, (mb) null, 0, 0, 0);
                      ((ee) this).field_T.a(3, (ck) (Object) var5_ref_wl);
                      break L99;
                    } else {
                      break L99;
                    }
                  }
                  L100: {
                    if (((ee) this).field_r == 18000) {
                      var5_ref_wl = new wl(0, 0, var3, 0, 0, 1, 12, (ee) this, (mb) null, 0, 0, 0);
                      ((ee) this).field_T.a(param0 ^ 24, (ck) (Object) var5_ref_wl);
                      break L100;
                    } else {
                      break L100;
                    }
                  }
                  L101: {
                    if (((ee) this).field_r == 24000) {
                      var5_ref_wl = new wl(0, 0, -var3, 0, 0, 1, 14, (ee) this, (mb) null, 0, 0, 0);
                      ((ee) this).field_T.a(param0 ^ 24, (ck) (Object) var5_ref_wl);
                      break L101;
                    } else {
                      break L101;
                    }
                  }
                  if (29750 != ((ee) this).field_r) {
                    break L96;
                  } else {
                    ((ee) this).field_R = 1;
                    var5_ref_wl = new wl(0, 0, -var3, 0, 0, 1, 16, (ee) this, (mb) null, 0, 0, 0);
                    ri.field_b = var5_ref_wl;
                    ((ee) this).field_T.a(param0 ^ 24, (ck) (Object) var5_ref_wl);
                    break L96;
                  }
                } else {
                  L102: {
                    if (var5_ref_mb.field_jc == 0) {
                      var4 = var4 + var5_ref_mb.field_vb;
                      break L102;
                    } else {
                      break L102;
                    }
                  }
                  L103: {
                    if (var5_ref_mb.field_jc == 1) {
                      var4 = var4 - var5_ref_mb.field_vb;
                      break L103;
                    } else {
                      break L103;
                    }
                  }
                  var5_ref_mb = (mb) (Object) ((ee) this).field_K.a((byte) -60);
                  continue L97;
                }
              }
            } else {
              break L96;
            }
          }
        }
        L104: {
          if (((ee) this).field_b > 0) {
            ((ee) this).field_b = ((ee) this).field_b + 1;
            if (((ee) this).field_b <= 550) {
              break L104;
            } else {
              ((ee) this).field_b = 0;
              break L104;
            }
          } else {
            break L104;
          }
        }
        L105: {
          var3 = -1;
          var4 = 0;
          if (1 != ((ee) this).field_ab.b(125)) {
            stackOut_540_0 = 0;
            stackIn_541_0 = stackOut_540_0;
            break L105;
          } else {
            stackOut_539_0 = 1;
            stackIn_541_0 = stackOut_539_0;
            break L105;
          }
        }
        var5 = stackIn_541_0;
        if (param0 == 27) {
          var6_array = new int[((ee) this).field_kb + ((ee) this).field_Q];
          var7 = 0;
          var8 = (Object) (Object) (mb) (Object) ((ee) this).field_K.e(13058);
          L106: while (true) {
            if (null == var8) {
              L107: {
                if (0 != ((ee) this).field_R) {
                  break L107;
                } else {
                  if (0 <= var3) {
                    break L107;
                  } else {
                    if (((ee) this).field_A <= 0) {
                      break L107;
                    } else {
                      if (null == ((ee) this).field_y) {
                        break L107;
                      } else {
                        if (((ee) this).field_y.field_vb >= 200000) {
                          ((ee) this).field_R = 1;
                          break L107;
                        } else {
                          break L107;
                        }
                      }
                    }
                  }
                }
              }
              L108: {
                if (~(50000 * ((ee) this).field_l) < ~var4) {
                  break L108;
                } else {
                  if (((ee) this).field_W) {
                    ((ee) this).field_W = false;
                    var8_int = ((ee) this).field_ab.a(-116) << 3;
                    var9_int = -500000;
                    var10_ref_mb = new mb(var8_int, var9_int, (ee) this);
                    var10_ref_mb.field_ib = true;
                    var10_ref_mb.a(oh.field_h, true, false, -1, ((ee) this).field_kb + ((ee) this).field_Q);
                    var10_ref_mb.field_Nb = 11;
                    ((ee) this).field_A = var10_ref_mb.field_Bb;
                    ((ee) this).field_y = var10_ref_mb;
                    var10_ref_mb.d(param0 + -28060);
                    var10_ref_mb.field_ic = 131585;
                    var10_ref_mb.field_Qb = 250;
                    var10_ref_mb.field_ab = 1000;
                    ((ee) this).field_K.a(3, (ck) (Object) var10_ref_mb);
                    break L108;
                  } else {
                    break L108;
                  }
                }
              }
              L109: {
                L110: {
                  if (!((ee) this).field_fb) {
                    break L110;
                  } else {
                    if (((ee) this).field_lb) {
                      break L110;
                    } else {
                      L111: {
                        if (0 == ((ee) this).field_r % 1200) {
                          break L111;
                        } else {
                          if (((ee) this).field_R <= 150) {
                            break L110;
                          } else {
                            if (((ee) this).field_j) {
                              break L110;
                            } else {
                              break L111;
                            }
                          }
                        }
                      }
                      if (((ee) this).field_K.b((byte) -128) < 16) {
                        L112: {
                          var8 = null;
                          var9_int = -1 + ((ee) this).field_r / 1200;
                          if (var9_int <= 2) {
                            break L112;
                          } else {
                            var9_int = ((ee) this).field_D.a(param0 ^ 77, 1 - -((ee) this).field_F);
                            break L112;
                          }
                        }
                        L113: {
                          var10 = var9_int;
                          if (0 == var10) {
                            var8 = (Object) (Object) qm.field_d;
                            break L113;
                          } else {
                            if (1 != var10) {
                              if (2 == var10) {
                                var8 = (Object) (Object) hk.field_Vb;
                                break L113;
                              } else {
                                break L113;
                              }
                            } else {
                              var8 = (Object) (Object) rn.field_o;
                              break L113;
                            }
                          }
                        }
                        var10 = 0;
                        L114: while (true) {
                          if (var10 >= 2) {
                            break L109;
                          } else {
                            var11 = new mb(0, 0, (ee) this);
                            var11.a((int[]) var8, true, false, -1, 12);
                            var11.field_hb = this.a(false, var9_int);
                            var11.field_Nb = 8;
                            ((ee) this).field_K.a(3, (ck) (Object) var11);
                            var11.field_hc = ((ee) this).field_D.a(83, ((ee) this).field_ab.a(124)) << 4;
                            var11.field_pc = false;
                            var11.field_Gb = ((ee) this).field_ab.a(false, var11.field_hc >> 4) + -16000 << 4;
                            var10++;
                            continue L114;
                          }
                        }
                      } else {
                        break L110;
                      }
                    }
                  }
                }
                if (((ee) this).field_lb) {
                  break L109;
                } else {
                  if (((ee) this).field_fb) {
                    break L109;
                  } else {
                    if (var2_int != 0) {
                      break L109;
                    } else {
                      if (((ee) this).field_ab.b(54) != 0) {
                        break L109;
                      } else {
                        if (((ee) this).field_F <= 0) {
                          break L109;
                        } else {
                          if (((ee) this).field_R != 0) {
                            break L109;
                          } else {
                            if (((ee) this).field_r <= 0) {
                              break L109;
                            } else {
                              if (((ee) this).field_r % 3000 != 0) {
                                break L109;
                              } else {
                                int discarded$3 = 126;
                                if (this.h() < 2) {
                                  L115: {
                                    var8 = null;
                                    var9_int = ((ee) this).field_r / 3000 + -1;
                                    if (1 >= ((ee) this).field_F) {
                                      if (var9_int <= 3) {
                                        break L115;
                                      } else {
                                        var9_int = ((ee) this).field_D.a(-120, 2) + 2;
                                        break L115;
                                      }
                                    } else {
                                      if (5 >= var9_int) {
                                        break L115;
                                      } else {
                                        var9_int = ((ee) this).field_D.a(-123, 2) + 4;
                                        break L115;
                                      }
                                    }
                                  }
                                  L116: {
                                    var10 = var9_int;
                                    if (0 != var10) {
                                      if (var10 == 1) {
                                        var8 = (Object) (Object) kj.field_D;
                                        break L116;
                                      } else {
                                        if (var10 == 2) {
                                          var8 = (Object) (Object) qm.field_d;
                                          break L116;
                                        } else {
                                          if (var10 == 3) {
                                            var8 = (Object) (Object) rn.field_o;
                                            break L116;
                                          } else {
                                            if (4 == var10) {
                                              var8 = (Object) (Object) oc.field_f;
                                              break L116;
                                            } else {
                                              if (var10 != 5) {
                                                break L116;
                                              } else {
                                                var8 = (Object) (Object) hk.field_Vb;
                                                break L116;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      var8 = (Object) (Object) va.field_f;
                                      break L116;
                                    }
                                  }
                                  var10 = 0;
                                  L117: while (true) {
                                    if (var10 >= 2) {
                                      break L109;
                                    } else {
                                      L118: {
                                        var11 = new mb(0, 0, (ee) this);
                                        var11.a((int[]) var8, true, false, -1, 12);
                                        var11.field_hb = this.a(false, var9_int);
                                        var11.field_Nb = 8;
                                        ((ee) this).field_K.a(param0 + -24, (ck) (Object) var11);
                                        var11.field_hc = -128;
                                        if ((var10 & 1) == 0) {
                                          var11.field_hc = (((ee) this).field_ab.a(-126) << 4) - var11.field_hc;
                                          break L118;
                                        } else {
                                          break L118;
                                        }
                                      }
                                      var11.field_Gb = 1;
                                      var11.field_pc = false;
                                      var10++;
                                      continue L117;
                                    }
                                  }
                                } else {
                                  break L109;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              L119: {
                if (((ee) this).field_lb) {
                  break L119;
                } else {
                  if (var2_int != 0) {
                    break L119;
                  } else {
                    L120: {
                      if (((ee) this).field_ab.b(51) == 3) {
                        break L120;
                      } else {
                        if (1 != ((ee) this).field_ab.b(53)) {
                          break L119;
                        } else {
                          break L120;
                        }
                      }
                    }
                    if (0 != ((ee) this).field_R) {
                      break L119;
                    } else {
                      if (0 == ((ee) this).field_r % 1500) {
                        L121: {
                          var8_int = ((ee) this).field_r / 3000;
                          if (0 >= ((ee) this).field_F) {
                            if (var8_int > 4) {
                              var8_int = ((ee) this).field_D.a(60, 5);
                              break L121;
                            } else {
                              break L121;
                            }
                          } else {
                            if (var8_int > 5) {
                              var8_int = 4 + ((ee) this).field_D.a(param0 + -146, 2);
                              break L121;
                            } else {
                              break L121;
                            }
                          }
                        }
                        var9 = (Object) (Object) new ne((ee) this, this.a(false, var8_int));
                        ((ne) var9).field_z = ((ee) this).field_D.a(80, ((ee) this).field_ab.a(param0 ^ 68) << 4);
                        ((ne) var9).field_I = -180000;
                        ((ee) this).field_e.a(3, (ck) var9);
                        break L119;
                      } else {
                        break L119;
                      }
                    }
                  }
                }
              }
              var8 = (Object) (Object) (ne) (Object) ((ee) this).field_e.e(13058);
              L122: while (true) {
                if (var8 == null) {
                  var8 = (Object) (Object) (mb) (Object) ((ee) this).field_K.e(param0 + 13031);
                  L123: while (true) {
                    if (var8 == null) {
                      L124: {
                        if (var2_int == 0) {
                          break L124;
                        } else {
                          if (4 != ((ee) this).field_ab.b(98)) {
                            break L124;
                          } else {
                            if (((ee) this).field_R <= 0) {
                              break L124;
                            } else {
                              ((ee) this).field_R = ((ee) this).field_R + 1;
                              ((ee) this).field_l = Math.max(1 + ((ee) this).field_F, 2);
                              break L124;
                            }
                          }
                        }
                      }
                      L125: {
                        if (((ee) this).field_lb) {
                          break L125;
                        } else {
                          if (var2_int == 0) {
                            L126: {
                              L127: {
                                L128: {
                                  if (-1 == var3) {
                                    break L128;
                                  } else {
                                    if (((ee) this).field_ab.b(47) != 4) {
                                      break L127;
                                    } else {
                                      break L128;
                                    }
                                  }
                                }
                                if (((ee) this).field_R > 0) {
                                  break L127;
                                } else {
                                  break L126;
                                }
                              }
                              ((ee) this).field_R = ((ee) this).field_R + 1;
                              ((ee) this).field_l = Math.max(1 + ((ee) this).field_F, 2);
                              break L126;
                            }
                            L129: {
                              if (var5 == 0) {
                                break L129;
                              } else {
                                if (((ee) this).field_R != 0) {
                                  break L129;
                                } else {
                                  if (((ee) this).field_r > 29850) {
                                    ((ee) this).field_R = 1;
                                    break L129;
                                  } else {
                                    break L129;
                                  }
                                }
                              }
                            }
                            L130: {
                              if (((ee) this).field_R != 1) {
                                break L130;
                              } else {
                                if (((ee) this).field_bb.length == 2) {
                                  L131: {
                                    var8_int = 0;
                                    var9 = (Object) (Object) ((ee) this).f(0, -128);
                                    if (var9 == null) {
                                      break L131;
                                    } else {
                                      if (0 < ((mb) var9).field_vb) {
                                        var8_int = ((mb) var9).field_vb;
                                        break L131;
                                      } else {
                                        break L131;
                                      }
                                    }
                                  }
                                  var9 = (Object) (Object) ((ee) this).f(1, -128);
                                  if (var9 == null) {
                                    break L130;
                                  } else {
                                    if (((mb) var9).field_vb < var8_int) {
                                      L132: {
                                        if (~var8_int != ~((mb) var9).field_vb) {
                                          break L132;
                                        } else {
                                          break L132;
                                        }
                                      }
                                      var8_int = ((mb) var9).field_vb;
                                      break L130;
                                    } else {
                                      break L130;
                                    }
                                  }
                                } else {
                                  break L130;
                                }
                              }
                            }
                            L133: {
                              if (1650 != ((ee) this).field_R) {
                                break L133;
                              } else {
                                if (4 != ((ee) this).field_ab.b(57)) {
                                  this.a(var6_array, (byte) -128);
                                  break L125;
                                } else {
                                  break L133;
                                }
                              }
                            }
                            if (1 < mm.a((byte) 119, var7)) {
                              break L125;
                            } else {
                              this.a(var6_array, (byte) -114);
                              break L125;
                            }
                          } else {
                            break L125;
                          }
                        }
                      }
                      var8 = (Object) (Object) (wl) (Object) ((ee) this).field_db.e(13058);
                      L134: while (true) {
                        if (null == var8) {
                          ((ee) this).field_u.a(param0 + -2, ((ee) this).field_C);
                          var8 = (Object) (Object) (jb) (Object) ((ee) this).field_C.e(param0 ^ 13081);
                          L135: while (true) {
                            if (var8 == null) {
                              L136: {
                                if (((ee) this).field_o == null) {
                                  break L136;
                                } else {
                                  ((ee) this).field_O.a(35, ((ee) this).field_o);
                                  var8 = (Object) (Object) (qb) (Object) ((ee) this).field_o.e(13058);
                                  L137: while (true) {
                                    if (null == var8) {
                                      break L136;
                                    } else {
                                      ((qb) var8).c((byte) 60);
                                      var8 = (Object) (Object) (qb) (Object) ((ee) this).field_o.a((byte) -13);
                                      continue L137;
                                    }
                                  }
                                }
                              }
                              var8 = (Object) (Object) ((ee) this).field_J.b(22);
                              L138: while (true) {
                                if (null == var8) {
                                  ((ee) this).field_J.a(8150);
                                  ((ee) this).field_T.a(114, ((ee) this).field_db);
                                  return;
                                } else {
                                  ((kd) var8).b(4);
                                  var8 = (Object) (Object) ((ee) this).field_J.a(false);
                                  continue L138;
                                }
                              }
                            } else {
                              ((jb) var8).a(false);
                              var8 = (Object) (Object) (jb) (Object) ((ee) this).field_C.a((byte) -30);
                              continue L135;
                            }
                          }
                        } else {
                          ((wl) var8).i(-1);
                          var8 = (Object) (Object) (wl) (Object) ((ee) this).field_db.a((byte) -60);
                          continue L134;
                        }
                      }
                    } else {
                      L139: {
                        if (!((mb) var8).field_gc) {
                          break L139;
                        } else {
                          ((mb) var8).b(4);
                          break L139;
                        }
                      }
                      var8 = (Object) (Object) (mb) (Object) ((ee) this).field_K.a((byte) -77);
                      continue L123;
                    }
                  }
                } else {
                  L140: {
                    L141: {
                      ((ne) var8).c((byte) 87);
                      if (null != ((ne) var8).field_T) {
                        break L141;
                      } else {
                        if (((ne) var8).field_K <= 0) {
                          break L141;
                        } else {
                          break L140;
                        }
                      }
                    }
                    ((ne) var8).b(4);
                    ((ee) this).field_f = ((ee) this).field_f - ((ne) var8).field_O * 50;
                    break L140;
                  }
                  var8 = (Object) (Object) (ne) (Object) ((ee) this).field_e.a((byte) -40);
                  continue L122;
                }
              }
            } else {
              L142: {
                ((mb) var8).c(1, ((ee) this).field_r);
                if (((mb) var8).field_Bb < 0) {
                  break L142;
                } else {
                  if (((mb) var8).field_Bb < 0) {
                    break L142;
                  } else {
                    if (((mb) var8).field_Bb >= ((ee) this).field_kb + ((ee) this).field_Q) {
                      break L142;
                    } else {
                      if (((mb) var8).field_V) {
                        break L142;
                      } else {
                        L143: {
                          if (!((mb) var8).field_Hb) {
                            var7 = var7 | 1 << ((mb) var8).field_jc;
                            break L143;
                          } else {
                            break L143;
                          }
                        }
                        L144: {
                          var6_array[((mb) var8).field_Bb] = ((mb) var8).field_vb;
                          if (var6_array[((mb) var8).field_Bb] <= 0) {
                            var6_array[((mb) var8).field_Bb] = 1;
                            break L144;
                          } else {
                            break L144;
                          }
                        }
                        L145: {
                          if (((ee) this).field_l * 100000 > ((mb) var8).field_vb) {
                            break L145;
                          } else {
                            if (var5 == 0) {
                              if (~((mb) var8).field_vb != ~var4) {
                                if (~((mb) var8).field_vb >= ~var4) {
                                  break L142;
                                } else {
                                  var3 = ((mb) var8).field_Bb;
                                  var4 = ((mb) var8).field_vb;
                                  break L142;
                                }
                              } else {
                                var3 = -1;
                                break L142;
                              }
                            } else {
                              break L145;
                            }
                          }
                        }
                        if (((mb) var8).field_vb > var4) {
                          var4 = ((mb) var8).field_vb;
                          break L142;
                        } else {
                          break L142;
                        }
                      }
                    }
                  }
                }
              }
              var8 = (Object) (Object) (mb) (Object) ((ee) this).field_K.a((byte) -98);
              continue L106;
            }
          }
        } else {
          return;
        }
    }

    final boolean b(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        try {
          L0: {
            if (param1 != ~((ee) this).field_ab.b(param1 ^ -103)) {
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                if (((ee) this).field_ab.field_o[0] + -5000 < param0 >> 4) {
                  break L1;
                } else {
                  if (((ee) this).field_ab.field_o[1] - -5000 > param0 >> 4) {
                    break L1;
                  } else {
                    stackOut_13_0 = 1;
                    stackIn_14_0 = stackOut_13_0;
                    break L0;
                  }
                }
              }
              stackOut_11_0 = 0;
              stackIn_12_0 = stackOut_11_0;
              return stackIn_12_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var3, "ee.SA(" + param0 + 44 + param1 + 41);
        }
        return stackIn_14_0 != 0;
    }

    final static void a(boolean param0) {
        wk var1 = null;
        RuntimeException var1_ref = null;
        wk var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = SteelSentinels.field_G;
        try {
          L0: {
            var1 = new wk(540, 140);
            q.a(var1, (byte) -82);
            lf.a();
            pb.b();
            vn.field_h = 0;
            int discarded$3 = 1;
            pm.a();
            var2 = var1.g();
            var3 = 0;
            L1: while (true) {
              if (var3 >= 15) {
                gb.field_d.d();
                var1.b(0, 0);
                tk.f((byte) 122);
                break L0;
              } else {
                var2.e(-2, -2, 16777215);
                pb.d(4, 4, 0, 0, 540, 140);
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var1_ref, "ee.N(" + 1 + 41);
        }
    }

    private final void a() {
        mb var2 = null;
        mb var3 = null;
        int var4 = 0;
        mb var4_ref_mb = null;
        int var5 = 0;
        mb var6 = null;
        mb var7 = null;
        int var8 = 0;
        je var8_ref_je = null;
        jc var9_ref_jc = null;
        int var9 = 0;
        mb var10_ref_mb = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        ck stackIn_4_0 = null;
        mb stackIn_87_0 = null;
        mb stackIn_87_1 = null;
        int stackIn_142_0 = 0;
        int stackIn_143_0 = 0;
        int stackIn_144_0 = 0;
        int stackIn_145_0 = 0;
        int stackIn_145_1 = 0;
        int stackIn_150_0 = 0;
        int stackIn_151_0 = 0;
        int stackIn_152_0 = 0;
        int stackIn_153_0 = 0;
        int stackIn_153_1 = 0;
        int stackIn_199_0 = 0;
        int stackIn_200_0 = 0;
        int stackIn_201_0 = 0;
        int stackIn_202_0 = 0;
        int stackIn_202_1 = 0;
        ck stackOut_3_0 = null;
        Object stackOut_2_0 = null;
        mb stackOut_86_0 = null;
        mb stackOut_86_1 = null;
        int stackOut_198_0 = 0;
        int stackOut_197_0 = 0;
        int stackOut_199_0 = 0;
        int stackOut_201_0 = 0;
        int stackOut_201_1 = 0;
        int stackOut_200_0 = 0;
        int stackOut_200_1 = 0;
        int stackOut_141_0 = 0;
        int stackOut_140_0 = 0;
        int stackOut_142_0 = 0;
        int stackOut_144_0 = 0;
        int stackOut_144_1 = 0;
        int stackOut_143_0 = 0;
        int stackOut_143_1 = 0;
        int stackOut_149_0 = 0;
        int stackOut_148_0 = 0;
        int stackOut_150_0 = 0;
        int stackOut_152_0 = 0;
        int stackOut_152_1 = 0;
        int stackOut_151_0 = 0;
        int stackOut_151_1 = 0;
        var13 = SteelSentinels.field_G;
        L0: {
          var2 = (mb) (Object) ((ee) this).field_K.e(13058);
          if (null != var2) {
            stackOut_3_0 = ((ee) this).field_K.a((byte) -68);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          } else {
            stackOut_2_0 = null;
            stackIn_4_0 = (ck) (Object) stackOut_2_0;
            break L0;
          }
        }
        L1: {
          L2: {
            var3 = (mb) (Object) stackIn_4_0;
            if (null == var3) {
              break L2;
            } else {
              if (~var2.field_jc != ~var3.field_jc) {
                break L2;
              } else {
                L3: {
                  if (~var3.field_rb >= ~var2.field_rb) {
                    break L3;
                  } else {
                    var4_ref_mb = var3;
                    var3 = var2;
                    var2 = var4_ref_mb;
                    break L3;
                  }
                }
                if (var3.field_pc) {
                  var3 = var2;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
          }
          var3 = var2;
          break L1;
        }
        L4: {
          L5: {
            L6: {
              if (var2 == null) {
                break L6;
              } else {
                if (!var2.i(99)) {
                  break L5;
                } else {
                  break L6;
                }
              }
            }
            L7: {
              if (var3 == null) {
                break L7;
              } else {
                if (!var3.i(68)) {
                  break L5;
                } else {
                  break L7;
                }
              }
            }
            ((ee) this).field_w = ((ee) this).field_w + 1;
            break L4;
          }
          ((ee) this).field_w = 0;
          break L4;
        }
        var4 = 0;
        var6 = (mb) (Object) ((ee) this).field_K.e(13058);
        L8: while (true) {
          if (var6 == null) {
            return;
          } else {
            L9: {
              L10: {
                var7 = var2;
                if (var6.field_Nb == 8) {
                  break L10;
                } else {
                  if (var6.field_Nb != 11) {
                    if (var6.field_Nb == 10) {
                      var7 = null;
                      var8 = 2147483647;
                      var9_ref_jc = new jc(((ee) this).field_K);
                      var10_ref_mb = (mb) (Object) var9_ref_jc.b(2);
                      L11: while (true) {
                        if (var10_ref_mb == null) {
                          break L9;
                        } else {
                          L12: {
                            if (null == var10_ref_mb) {
                              break L12;
                            } else {
                              if (var10_ref_mb.field_Hb) {
                                break L12;
                              } else {
                                if (0 == var10_ref_mb.field_Nb) {
                                  break L12;
                                } else {
                                  if (var6.field_jc != var10_ref_mb.field_jc) {
                                    var11 = var10_ref_mb.field_hc + -var6.field_hc;
                                    var12 = -var6.field_Gb + var10_ref_mb.field_Gb;
                                    var12 = var12 * var12 + var11 * var11;
                                    if (~var8 >= ~var12) {
                                      break L12;
                                    } else {
                                      var8 = var12;
                                      var7 = var10_ref_mb;
                                      break L12;
                                    }
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                            }
                          }
                          var10_ref_mb = (mb) (Object) var9_ref_jc.d(2);
                          continue L11;
                        }
                      }
                    } else {
                      L13: {
                        L14: {
                          var4++;
                          if (null == var2) {
                            break L14;
                          } else {
                            if (var2 == var6.field_Vb) {
                              break L14;
                            } else {
                              if (!var2.i(84)) {
                                break L14;
                              } else {
                                if (!var3.i(104)) {
                                  var7 = var3;
                                  break L13;
                                } else {
                                  break L14;
                                }
                              }
                            }
                          }
                        }
                        if (null == var3) {
                          break L13;
                        } else {
                          if (var4 < 3) {
                            break L13;
                          } else {
                            if (var3.i(83)) {
                              break L13;
                            } else {
                              var4 = 0;
                              var7 = var3;
                              break L13;
                            }
                          }
                        }
                      }
                      L15: {
                        if (null == var7) {
                          break L15;
                        } else {
                          stackOut_86_0 = (mb) var7;
                          stackOut_86_1 = var6.field_Vb;
                          stackIn_87_0 = stackOut_86_0;
                          stackIn_87_1 = stackOut_86_1;
                          if (stackIn_87_0 == stackIn_87_1) {
                            break L15;
                          } else {
                            if (!var7.i(78)) {
                              break L15;
                            } else {
                              if (200 * var6.field_Bb > ((ee) this).field_w) {
                                var7 = null;
                                break L15;
                              } else {
                                break L15;
                              }
                            }
                          }
                        }
                      }
                      if (var6.field_Vb == null) {
                        break L9;
                      } else {
                        if (var6.field_Vb.field_Hb) {
                          break L9;
                        } else {
                          var7 = var6.field_Vb;
                          break L9;
                        }
                      }
                    }
                  } else {
                    break L10;
                  }
                }
              }
              L16: {
                var8 = 2147483647;
                var7 = var6.field_Vb;
                if (null != var7) {
                  L17: {
                    if (var7.field_pc) {
                      break L17;
                    } else {
                      if (!var7.field_Hb) {
                        break L16;
                      } else {
                        break L17;
                      }
                    }
                  }
                  var7 = null;
                  break L16;
                } else {
                  break L16;
                }
              }
              L18: {
                if (var7 != null) {
                  break L18;
                } else {
                  var9_ref_jc = new jc(((ee) this).field_K);
                  var10_ref_mb = (mb) (Object) var9_ref_jc.b(2);
                  L19: while (true) {
                    if (var10_ref_mb == null) {
                      break L18;
                    } else {
                      L20: {
                        if (var10_ref_mb == ((ee) this).field_y) {
                          break L20;
                        } else {
                          if (null == var10_ref_mb) {
                            break L20;
                          } else {
                            if (var10_ref_mb.field_Hb) {
                              break L20;
                            } else {
                              if (var10_ref_mb.field_pc) {
                                break L20;
                              } else {
                                if (var10_ref_mb.i(75)) {
                                  break L20;
                                } else {
                                  if (~var6.field_jc == ~var10_ref_mb.field_jc) {
                                    break L20;
                                  } else {
                                    L21: {
                                      if (var7 == null) {
                                        break L21;
                                      } else {
                                        if (~var7.field_Bb <= ~((ee) this).field_kb) {
                                          break L21;
                                        } else {
                                          if (var10_ref_mb.field_Bb >= ((ee) this).field_kb) {
                                            break L20;
                                          } else {
                                            break L21;
                                          }
                                        }
                                      }
                                    }
                                    L22: {
                                      var11 = var10_ref_mb.field_hc + -var6.field_hc >> 4;
                                      var12 = -var6.field_Gb + var10_ref_mb.field_Gb >> 4;
                                      var12 = var12 * var12 + var11 * var11;
                                      if (var12 < var8) {
                                        break L22;
                                      } else {
                                        if (null == var7) {
                                          break L20;
                                        } else {
                                          if (((ee) this).field_kb > var7.field_Bb) {
                                            break L20;
                                          } else {
                                            if (((ee) this).field_kb > var10_ref_mb.field_Bb) {
                                              break L22;
                                            } else {
                                              break L20;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    var8 = var12;
                                    var7 = var10_ref_mb;
                                    break L20;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      var10_ref_mb = (mb) (Object) var9_ref_jc.d(2);
                      continue L19;
                    }
                  }
                }
              }
              break L9;
            }
            L23: {
              L24: {
                if (var6.field_Nb == 7) {
                  break L24;
                } else {
                  if (8 == var6.field_Nb) {
                    break L24;
                  } else {
                    if (var6.field_Nb == 11) {
                      break L24;
                    } else {
                      if (var6.field_Nb != 10) {
                        break L23;
                      } else {
                        break L24;
                      }
                    }
                  }
                }
              }
              if (var7 == null) {
                break L23;
              } else {
                if (!var6.field_pc) {
                  L25: {
                    if (var6.field_pb >= 750) {
                      var6.field_t = 0;
                      var6.field_pb = 0;
                      var8 = ((ee) this).field_ab.b(81);
                      if (var8 != 3) {
                        if (var8 == 2) {
                          L26: {
                            if (var6.field_u) {
                              break L26;
                            } else {
                              if (!this.b(true, var6.field_hc >> 4)) {
                                break L26;
                              } else {
                                if (~var6.field_hc >= ~var7.field_hc) {
                                  if (this.e(-44, var6.field_hc >> 4)) {
                                    var6.field_t = -1500 + (var6.field_hc >> 4);
                                    break L25;
                                  } else {
                                    var6.field_t = var7.field_hc >> 4;
                                    break L25;
                                  }
                                } else {
                                  if (!this.a(var6.field_hc >> 4, false)) {
                                    var6.field_t = var7.field_hc >> 4;
                                    break L25;
                                  } else {
                                    var6.field_t = (var6.field_hc >> 4) - -1500;
                                    break L25;
                                  }
                                }
                              }
                            }
                          }
                          if (!var6.field_u) {
                            break L25;
                          } else {
                            if (!this.a((byte) 61, var7.field_hc >> 4, var6.field_hc >> 4)) {
                              break L25;
                            } else {
                              var6.field_t = this.a((byte) 50, var6.field_hc >> 4);
                              break L25;
                            }
                          }
                        } else {
                          L27: {
                            if (var8 != 0) {
                              if (var8 == 1) {
                                break L27;
                              } else {
                                break L25;
                              }
                            } else {
                              break L27;
                            }
                          }
                          L28: {
                            if (var6.field_u) {
                              stackOut_198_0 = 0;
                              stackIn_199_0 = stackOut_198_0;
                              break L28;
                            } else {
                              stackOut_197_0 = 1;
                              stackIn_199_0 = stackOut_197_0;
                              break L28;
                            }
                          }
                          L29: {
                            stackOut_199_0 = stackIn_199_0;
                            stackIn_201_0 = stackOut_199_0;
                            stackIn_200_0 = stackOut_199_0;
                            if (var7.field_u) {
                              stackOut_201_0 = stackIn_201_0;
                              stackOut_201_1 = 0;
                              stackIn_202_0 = stackOut_201_0;
                              stackIn_202_1 = stackOut_201_1;
                              break L29;
                            } else {
                              stackOut_200_0 = stackIn_200_0;
                              stackOut_200_1 = 1;
                              stackIn_202_0 = stackOut_200_0;
                              stackIn_202_1 = stackOut_200_1;
                              break L29;
                            }
                          }
                          if (stackIn_202_0 != stackIn_202_1) {
                            if (var6.field_u) {
                              if (this.a((byte) 95, var7.field_hc >> 4, var6.field_hc >> 4)) {
                                var6.field_t = this.a((byte) 93, var6.field_hc >> 4);
                                break L25;
                              } else {
                                var6.field_t = var7.field_hc >> 4;
                                break L25;
                              }
                            } else {
                              if (!this.a((byte) 39, var6.field_hc >> 4, var7.field_hc >> 4)) {
                                var6.field_t = var7.field_hc >> 4;
                                break L25;
                              } else {
                                var6.field_t = this.a((byte) 124, var6.field_hc >> 4);
                                break L25;
                              }
                            }
                          } else {
                            var6.field_t = var7.field_hc >> 4;
                            break L25;
                          }
                        }
                      } else {
                        L30: {
                          L31: {
                            var8 = ((ee) this).field_ab.a(-121) / 2;
                            if (var6.field_Cb) {
                              break L31;
                            } else {
                              if (var7.field_Cb) {
                                break L31;
                              } else {
                                L32: {
                                  if (~var8 >= ~(var6.field_hc >> 4)) {
                                    stackOut_141_0 = 0;
                                    stackIn_142_0 = stackOut_141_0;
                                    break L32;
                                  } else {
                                    stackOut_140_0 = 1;
                                    stackIn_142_0 = stackOut_140_0;
                                    break L32;
                                  }
                                }
                                L33: {
                                  stackOut_142_0 = stackIn_142_0;
                                  stackIn_144_0 = stackOut_142_0;
                                  stackIn_143_0 = stackOut_142_0;
                                  if (~var8 >= ~(var7.field_hc >> 4)) {
                                    stackOut_144_0 = stackIn_144_0;
                                    stackOut_144_1 = 0;
                                    stackIn_145_0 = stackOut_144_0;
                                    stackIn_145_1 = stackOut_144_1;
                                    break L33;
                                  } else {
                                    stackOut_143_0 = stackIn_143_0;
                                    stackOut_143_1 = 1;
                                    stackIn_145_0 = stackOut_143_0;
                                    stackIn_145_1 = stackOut_143_1;
                                    break L33;
                                  }
                                }
                                if (stackIn_145_0 != stackIn_145_1) {
                                  break L31;
                                } else {
                                  L34: {
                                    if (var6.field_u) {
                                      stackOut_149_0 = 0;
                                      stackIn_150_0 = stackOut_149_0;
                                      break L34;
                                    } else {
                                      stackOut_148_0 = 1;
                                      stackIn_150_0 = stackOut_148_0;
                                      break L34;
                                    }
                                  }
                                  L35: {
                                    stackOut_150_0 = stackIn_150_0;
                                    stackIn_152_0 = stackOut_150_0;
                                    stackIn_151_0 = stackOut_150_0;
                                    if (var7.field_u) {
                                      stackOut_152_0 = stackIn_152_0;
                                      stackOut_152_1 = 0;
                                      stackIn_153_0 = stackOut_152_0;
                                      stackIn_153_1 = stackOut_152_1;
                                      break L35;
                                    } else {
                                      stackOut_151_0 = stackIn_151_0;
                                      stackOut_151_1 = 1;
                                      stackIn_153_0 = stackOut_151_0;
                                      stackIn_153_1 = stackOut_151_1;
                                      break L35;
                                    }
                                  }
                                  if (stackIn_153_0 != stackIn_153_1) {
                                    if (!var6.field_u) {
                                      if (this.a((byte) 127, var6.field_hc >> 4, var7.field_hc >> 4)) {
                                        var6.field_t = this.a((byte) -81, var6.field_hc >> 4);
                                        break L30;
                                      } else {
                                        var6.field_t = var7.field_hc >> 4;
                                        break L30;
                                      }
                                    } else {
                                      if (this.a((byte) 91, var7.field_hc >> 4, var6.field_hc >> 4)) {
                                        var6.field_t = this.a((byte) 69, var6.field_hc >> 4);
                                        break L30;
                                      } else {
                                        var6.field_t = var7.field_hc >> 4;
                                        break L30;
                                      }
                                    }
                                  } else {
                                    var6.field_t = var7.field_hc >> 4;
                                    break L30;
                                  }
                                }
                              }
                            }
                          }
                          if (var6.field_Cb) {
                            if (var7.field_Cb) {
                              var6.field_t = var7.field_hc >> 4;
                              break L30;
                            } else {
                              if (~var7.field_hc <= ~var6.field_hc) {
                                var6.field_t = var8 + 5220;
                                break L30;
                              } else {
                                var6.field_t = -100 + (-5120 + var8);
                                break L30;
                              }
                            }
                          } else {
                            var6.field_t = var8;
                            break L30;
                          }
                        }
                        break L25;
                      }
                    } else {
                      break L25;
                    }
                  }
                  L36: {
                    if (var6.field_t <= 0) {
                      break L36;
                    } else {
                      if (200 > Math.abs((var6.field_hc >> 4) - var6.field_t)) {
                        var6.field_pb = 0;
                        var6.field_t = 0;
                        break L36;
                      } else {
                        break L36;
                      }
                    }
                  }
                  L37: {
                    if (var6.field_t <= 0) {
                      break L37;
                    } else {
                      if (var7.field_pc) {
                        var6.field_pb = 0;
                        var6.field_t = 0;
                        break L37;
                      } else {
                        break L37;
                      }
                    }
                  }
                  L38: {
                    if (var6.field_t <= 0) {
                      break L38;
                    } else {
                      if (var6.field_rc != 24) {
                        break L38;
                      } else {
                        var6.field_pb = 0;
                        var6.field_t = 0;
                        var8_ref_je = new je(11, 0, ((ee) this).field_r + 2);
                        var8_ref_je.field_p = true;
                        var6.field_B.a(3, (ck) (Object) var8_ref_je);
                        break L38;
                      }
                    }
                  }
                  L39: {
                    if (var6.field_t <= 0) {
                      break L39;
                    } else {
                      if (15 != var6.field_rc) {
                        break L39;
                      } else {
                        var6.field_pb = 0;
                        var6.field_t = 0;
                        var8_ref_je = new je(8, 0, 2 + ((ee) this).field_r);
                        var8_ref_je.field_p = true;
                        var6.field_B.a(3, (ck) (Object) var8_ref_je);
                        break L39;
                      }
                    }
                  }
                  L40: {
                    var8 = var6.field_Zb.field_N;
                    var9 = var7.field_hc + -var6.field_hc;
                    var10 = -var6.field_Gb + var7.field_Gb;
                    if (var9 < 0) {
                      var5 = -1;
                      break L40;
                    } else {
                      var5 = 1;
                      break L40;
                    }
                  }
                  if (!var6.field_Ec.f(7)) {
                    break L23;
                  } else {
                    if (var6.field_B.f(7)) {
                      L41: {
                        if (109 != var8) {
                          break L41;
                        } else {
                          this.a(var9, var7, 16384, var10, var5, var6);
                          break L41;
                        }
                      }
                      L42: {
                        if (107 == var8) {
                          this.a(var6, var5, var10, var7, 0, var9);
                          break L42;
                        } else {
                          break L42;
                        }
                      }
                      L43: {
                        if (var8 == 108) {
                          var10 = this.a(var7, var9, (byte) -64, var10, var6, var5);
                          break L43;
                        } else {
                          break L43;
                        }
                      }
                      L44: {
                        if (var8 == 0) {
                          this.a(var10, var5, (byte) 21, var7, var6, var9);
                          break L44;
                        } else {
                          break L44;
                        }
                      }
                      L45: {
                        if (var8 != 55) {
                          break L45;
                        } else {
                          this.a((byte) 68, var5, var10, var9, var6, var7);
                          break L45;
                        }
                      }
                      L46: {
                        if (57 != var8) {
                          break L46;
                        } else {
                          this.a(var9, 2714, var10, var5, var6, var7);
                          break L46;
                        }
                      }
                      L47: {
                        if (var8 != 62) {
                          break L47;
                        } else {
                          this.a(var10, var5, var6, var9, var7, (byte) 88);
                          break L47;
                        }
                      }
                      L48: {
                        if (var8 == 65) {
                          int discarded$2 = 0;
                          this.a(var5, var9, var10, var6, var7);
                          break L48;
                        } else {
                          break L48;
                        }
                      }
                      L49: {
                        if (var8 == 69) {
                          this.a(var6, (byte) -35, var7, var9, var5);
                          break L49;
                        } else {
                          break L49;
                        }
                      }
                      L50: {
                        if (var8 != 72) {
                          break L50;
                        } else {
                          this.a(var9, var7, var6, 20063, var5);
                          break L50;
                        }
                      }
                      L51: {
                        if (var8 != 75) {
                          break L51;
                        } else {
                          this.a((byte) -121, var10, var7, var9, var6, var5);
                          break L51;
                        }
                      }
                      L52: {
                        if (var8 == 79) {
                          this.a((byte) 57, var9, var7, var6, var5, var10);
                          break L52;
                        } else {
                          break L52;
                        }
                      }
                      L53: {
                        if (84 == var8) {
                          int discarded$3 = 14432;
                          this.a(var10, var6, var9, var7, var5);
                          break L53;
                        } else {
                          break L53;
                        }
                      }
                      L54: {
                        if (var8 == 88) {
                          this.a(var7, var9, -128, var5, var6, var10);
                          break L54;
                        } else {
                          break L54;
                        }
                      }
                      if (var8 == 92) {
                        this.a(-103, var5, var7, var9, var6);
                        break L23;
                      } else {
                        break L23;
                      }
                    } else {
                      break L23;
                    }
                  }
                } else {
                  break L23;
                }
              }
            }
            var6 = (mb) (Object) ((ee) this).field_K.a((byte) -48);
            continue L8;
          }
        }
    }

    final static void c(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              ba.field_f = null;
              if (param0 == 11828) {
                break L1;
              } else {
                field_k = null;
                break L1;
              }
            }
            L2: {
              kc.field_A = false;
              if (!de.field_d) {
                L3: {
                  var1_int = ua.field_o;
                  if (var1_int > 0) {
                    L4: {
                      if (var1_int == 1) {
                        ba.field_f = vk.field_k;
                        break L4;
                      } else {
                        ba.field_f = db.a(df.field_J, -120, new String[1]);
                        break L4;
                      }
                    }
                    ba.field_f = ue.a(new CharSequence[3], param0 + -11828);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                ch.field_O.m(105);
                tc.a((byte) 54);
                break L2;
              } else {
                ch.field_O.m((byte) 127);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var1, "ee.J(" + param0 + 41);
        }
    }

    final void g(int param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        mb var7 = null;
        int var8 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (((ee) this).field_b == 0) {
                ((ee) this).field_b = 1;
                break L1;
              } else {
                if (((ee) this).field_b < 50) {
                  break L1;
                } else {
                  ((ee) this).field_b = 49;
                  break L1;
                }
              }
            }
            var3_int = ((ee) this).field_ab.field_o[param1];
            var4 = kc.field_x[4][0].field_z << 4;
            var5 = -(var4 / 2) + var3_int;
            var6 = var3_int + var4 / 2;
            var7_int = var5;
            L2: while (true) {
              if (~var6 >= ~var7_int) {
                var7 = (mb) (Object) ((ee) this).field_K.e(13058);
                L3: while (true) {
                  if (null == var7) {
                    L4: {
                      if (param0 <= -108) {
                        break L4;
                      } else {
                        ee.g(124);
                        break L4;
                      }
                    }
                    break L0;
                  } else {
                    L5: {
                      if (~param1 != ~var7.field_jc) {
                        break L5;
                      } else {
                        if (0 < var7.field_z) {
                          var7.field_z = 0;
                          var7.field_pc = false;
                          var7.field_rb = 0;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      L7: {
                        if (var7.field_jc == param1) {
                          break L7;
                        } else {
                          if (!var7.field_Hb) {
                            var7.field_vb = var7.field_vb + 100000;
                            var7.field_Fc = 50;
                            var7.field_Ab = var7.field_Ab + 100000;
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      if (!var7.field_Hb) {
                        var7.field_Cb = false;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var7 = (mb) (Object) ((ee) this).field_K.a((byte) -111);
                    continue L3;
                  }
                }
              } else {
                ((ee) this).field_ab.field_m[var7_int] = 0;
                ((ee) this).field_ab.field_e[var7_int] = 0;
                ((ee) this).field_ab.field_f[var7_int] = 0;
                var7_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var3, "ee.F(" + param0 + 44 + param1 + 41);
        }
    }

    private final void a(byte param0, int param1, int param2, int param3, mb param4, mb param5) {
        RuntimeException var7 = null;
        je var7_ref = null;
        int var7_int = 0;
        int var8_int = 0;
        je var8 = null;
        double var9 = 0.0;
        int var11 = 0;
        je stackIn_21_0 = null;
        je stackIn_21_1 = null;
        int stackIn_21_2 = 0;
        je stackIn_23_0 = null;
        je stackIn_23_1 = null;
        int stackIn_23_2 = 0;
        je stackIn_25_0 = null;
        je stackIn_25_1 = null;
        int stackIn_25_2 = 0;
        je stackIn_26_0 = null;
        je stackIn_26_1 = null;
        int stackIn_26_2 = 0;
        int stackIn_26_3 = 0;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        RuntimeException decompiledCaughtException = null;
        je stackOut_20_0 = null;
        je stackOut_20_1 = null;
        int stackOut_20_2 = 0;
        je stackOut_25_0 = null;
        je stackOut_25_1 = null;
        int stackOut_25_2 = 0;
        int stackOut_25_3 = 0;
        je stackOut_21_0 = null;
        je stackOut_21_1 = null;
        int stackOut_21_2 = 0;
        je stackOut_23_0 = null;
        je stackOut_23_1 = null;
        int stackOut_23_2 = 0;
        int stackOut_23_3 = 0;
        int stackOut_52_0 = 0;
        int stackOut_52_1 = 0;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        var11 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (~param5.field_hc != ~param4.field_hc) {
                break L1;
              } else {
                if (param4.field_U != 0) {
                  break L1;
                } else {
                  if (param4.field_t > 0) {
                    break L1;
                  } else {
                    if (!param4.field_Lb) {
                      if (param4.field_hc >= 4096) {
                        param4.field_t = param4.field_hc + -1024;
                        break L1;
                      } else {
                        param4.field_t = 1024 + param4.field_hc;
                        break L1;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            L2: {
              if (param4.field_t <= 0) {
                if (Math.abs(param3) >= 30000) {
                  var7_ref = new je(6, param1, ((ee) this).field_r - -2);
                  var7_ref.field_p = true;
                  param4.field_B.a(3, (ck) (Object) var7_ref);
                  var7_ref = new je(3, 0, 100 + ((ee) this).field_r + (4 - -((param5.field_hc + ((ee) this).field_r - -param4.field_hc) % 100)));
                  var7_ref.field_u = param5.field_hc;
                  var7_ref.field_p = true;
                  var7_ref.field_y = param4.field_Gb + -20000;
                  param4.field_B.a(3, (ck) (Object) var7_ref);
                  param4.field_Tb = param4.field_x;
                  break L2;
                } else {
                  if (Math.abs(param3) < 30000) {
                    var7_ref = new je(6, -param1, ((ee) this).field_r + 2);
                    var7_ref.field_p = true;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              } else {
                L3: {
                  stackOut_20_0 = null;
                  stackOut_20_1 = null;
                  stackOut_20_2 = 6;
                  stackIn_25_0 = stackOut_20_0;
                  stackIn_25_1 = stackOut_20_1;
                  stackIn_25_2 = stackOut_20_2;
                  stackIn_21_0 = stackOut_20_0;
                  stackIn_21_1 = stackOut_20_1;
                  stackIn_21_2 = stackOut_20_2;
                  if (param4.field_hc >> 4 < param4.field_t) {
                    stackOut_25_0 = null;
                    stackOut_25_1 = null;
                    stackOut_25_2 = stackIn_25_2;
                    stackOut_25_3 = 1;
                    stackIn_26_0 = stackOut_25_0;
                    stackIn_26_1 = stackOut_25_1;
                    stackIn_26_2 = stackOut_25_2;
                    stackIn_26_3 = stackOut_25_3;
                    break L3;
                  } else {
                    stackOut_21_0 = null;
                    stackOut_21_1 = null;
                    stackOut_21_2 = stackIn_21_2;
                    stackIn_23_0 = stackOut_21_0;
                    stackIn_23_1 = stackOut_21_1;
                    stackIn_23_2 = stackOut_21_2;
                    stackOut_23_0 = null;
                    stackOut_23_1 = null;
                    stackOut_23_2 = stackIn_23_2;
                    stackOut_23_3 = -1;
                    stackIn_26_0 = stackOut_23_0;
                    stackIn_26_1 = stackOut_23_1;
                    stackIn_26_2 = stackOut_23_2;
                    stackIn_26_3 = stackOut_23_3;
                    break L3;
                  }
                }
                var7_ref = new je(stackIn_26_2, stackIn_26_3, 2 + ((ee) this).field_r);
                var7_ref.field_p = true;
                param4.field_B.a(3, (ck) (Object) var7_ref);
                break L2;
              }
            }
            var7_int = -1;
            var8_int = 0;
            L4: while (true) {
              L5: {
                if (param4.field_Xb.length <= var8_int) {
                  break L5;
                } else {
                  if (param4.field_Xb[var8_int] != 13) {
                    var8_int++;
                    continue L4;
                  } else {
                    var7_int = var8_int;
                    break L5;
                  }
                }
              }
              L6: {
                L7: {
                  if (var7_int < 0) {
                    break L7;
                  } else {
                    if (this.a(((ee) this).field_z, (byte) -95, var7_int, param4, param5, 2600, 5 + ((ee) this).field_r + (param4.field_hc + (param5.field_hc + ((ee) this).field_r)) % 100)) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                stackOut_52_0 = 40000;
                stackOut_52_1 = Math.abs(param3);
                stackIn_54_0 = stackOut_52_0;
                stackIn_54_1 = stackOut_52_1;
                if (stackIn_54_0 <= stackIn_54_1) {
                  break L6;
                } else {
                  L8: {
                    var8 = new je(0, 0, 5 + (((ee) this).field_r - -((param5.field_hc + (((ee) this).field_r - -param4.field_hc)) % 100)));
                    var8.field_y = param5.field_Gb;
                    var8.field_u = param5.field_hc;
                    var9 = Math.atan2((double)param3, (double)(-param2));
                    var8.field_B = (int)(var9 * 65536.0 / 6.283185307179586);
                    if (param1 >= 0) {
                      if (var8.field_B < -16384) {
                        var8.field_B = var8.field_B + 65536;
                        break L8;
                      } else {
                        break L8;
                      }
                    } else {
                      if (var8.field_B <= 16384) {
                        break L8;
                      } else {
                        var8.field_B = var8.field_B - 65536;
                        break L8;
                      }
                    }
                  }
                  var8.field_p = true;
                  param4.field_B.a(3, (ck) (Object) var8);
                  break L6;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var7 = decompiledCaughtException;
            stackOut_70_0 = (RuntimeException) var7;
            stackOut_70_1 = new StringBuilder().append("ee.JA(").append(68).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_73_0 = stackOut_70_0;
            stackIn_73_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param4 == null) {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L9;
            } else {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "{...}";
              stackIn_74_0 = stackOut_71_0;
              stackIn_74_1 = stackOut_71_1;
              stackIn_74_2 = stackOut_71_2;
              break L9;
            }
          }
          L10: {
            stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
            stackOut_74_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_74_2).append(44);
            stackIn_77_0 = stackOut_74_0;
            stackIn_77_1 = stackOut_74_1;
            stackIn_75_0 = stackOut_74_0;
            stackIn_75_1 = stackOut_74_1;
            if (param5 == null) {
              stackOut_77_0 = (RuntimeException) (Object) stackIn_77_0;
              stackOut_77_1 = (StringBuilder) (Object) stackIn_77_1;
              stackOut_77_2 = "null";
              stackIn_78_0 = stackOut_77_0;
              stackIn_78_1 = stackOut_77_1;
              stackIn_78_2 = stackOut_77_2;
              break L10;
            } else {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "{...}";
              stackIn_78_0 = stackOut_75_0;
              stackIn_78_1 = stackOut_75_1;
              stackIn_78_2 = stackOut_75_2;
              break L10;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_78_0, stackIn_78_2 + 41);
        }
    }

    final void a(mb[] param0, int[] param1, int[] param2, int param3, int[] param4, int[] param5) {
        RuntimeException var7 = null;
        mb var7_ref = null;
        int var8 = 0;
        int var9 = 0;
        mb[] var9_ref_mb__ = null;
        int var10 = 0;
        mb var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        mb stackIn_5_0 = null;
        RuntimeException stackIn_189_0 = null;
        StringBuilder stackIn_189_1 = null;
        RuntimeException stackIn_191_0 = null;
        StringBuilder stackIn_191_1 = null;
        RuntimeException stackIn_192_0 = null;
        StringBuilder stackIn_192_1 = null;
        String stackIn_192_2 = null;
        RuntimeException stackIn_193_0 = null;
        StringBuilder stackIn_193_1 = null;
        RuntimeException stackIn_195_0 = null;
        StringBuilder stackIn_195_1 = null;
        RuntimeException stackIn_196_0 = null;
        StringBuilder stackIn_196_1 = null;
        String stackIn_196_2 = null;
        RuntimeException stackIn_197_0 = null;
        StringBuilder stackIn_197_1 = null;
        RuntimeException stackIn_199_0 = null;
        StringBuilder stackIn_199_1 = null;
        RuntimeException stackIn_200_0 = null;
        StringBuilder stackIn_200_1 = null;
        String stackIn_200_2 = null;
        RuntimeException stackIn_201_0 = null;
        StringBuilder stackIn_201_1 = null;
        RuntimeException stackIn_203_0 = null;
        StringBuilder stackIn_203_1 = null;
        RuntimeException stackIn_204_0 = null;
        StringBuilder stackIn_204_1 = null;
        String stackIn_204_2 = null;
        RuntimeException stackIn_205_0 = null;
        StringBuilder stackIn_205_1 = null;
        RuntimeException stackIn_207_0 = null;
        StringBuilder stackIn_207_1 = null;
        RuntimeException stackIn_208_0 = null;
        StringBuilder stackIn_208_1 = null;
        String stackIn_208_2 = null;
        RuntimeException decompiledCaughtException = null;
        mb stackOut_4_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_188_0 = null;
        StringBuilder stackOut_188_1 = null;
        RuntimeException stackOut_191_0 = null;
        StringBuilder stackOut_191_1 = null;
        String stackOut_191_2 = null;
        RuntimeException stackOut_189_0 = null;
        StringBuilder stackOut_189_1 = null;
        String stackOut_189_2 = null;
        RuntimeException stackOut_192_0 = null;
        StringBuilder stackOut_192_1 = null;
        RuntimeException stackOut_195_0 = null;
        StringBuilder stackOut_195_1 = null;
        String stackOut_195_2 = null;
        RuntimeException stackOut_193_0 = null;
        StringBuilder stackOut_193_1 = null;
        String stackOut_193_2 = null;
        RuntimeException stackOut_196_0 = null;
        StringBuilder stackOut_196_1 = null;
        RuntimeException stackOut_199_0 = null;
        StringBuilder stackOut_199_1 = null;
        String stackOut_199_2 = null;
        RuntimeException stackOut_197_0 = null;
        StringBuilder stackOut_197_1 = null;
        String stackOut_197_2 = null;
        RuntimeException stackOut_200_0 = null;
        StringBuilder stackOut_200_1 = null;
        RuntimeException stackOut_203_0 = null;
        StringBuilder stackOut_203_1 = null;
        String stackOut_203_2 = null;
        RuntimeException stackOut_201_0 = null;
        StringBuilder stackOut_201_1 = null;
        String stackOut_201_2 = null;
        RuntimeException stackOut_204_0 = null;
        StringBuilder stackOut_204_1 = null;
        RuntimeException stackOut_207_0 = null;
        StringBuilder stackOut_207_1 = null;
        String stackOut_207_2 = null;
        RuntimeException stackOut_205_0 = null;
        StringBuilder stackOut_205_1 = null;
        String stackOut_205_2 = null;
        var14 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              param5[8] = 1;
              if (((ee) this).field_A >= 0) {
                stackOut_4_0 = ((ee) this).field_y;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_2_0 = null;
                stackIn_5_0 = (mb) (Object) stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var7_ref = stackIn_5_0;
              param5[0] = 2;
              param5[9] = 1;
              param5[10] = 2;
              if (null != var7_ref) {
                param5[8] = var7_ref.field_vb / 100;
                break L2;
              } else {
                break L2;
              }
            }
            param5[4] = 2147483647;
            param5[1] = 2000;
            param5[2] = 2;
            param5[7] = 10;
            var8 = 0;
            param5[11] = 1;
            var9 = 0;
            L3: while (true) {
              if (var9 > 7) {
                if (param3 < -105) {
                  param5[21] = 1;
                  param5[3] = 1;
                  param5[30] = 1;
                  param5[26] = 1;
                  param5[31] = 1;
                  param5[27] = 50;
                  param5[29] = 1;
                  param5[23] = 1;
                  param5[20] = 1;
                  param5[22] = 1;
                  param5[19] = 1;
                  param5[24] = 1;
                  param5[28] = 1;
                  var9_ref_mb__ = param0;
                  var10 = 0;
                  L4: while (true) {
                    if (var10 >= var9_ref_mb__.length) {
                      L5: {
                        L6: {
                          if (null != var7_ref) {
                            break L6;
                          } else {
                            if (var8 != 1) {
                              break L6;
                            } else {
                              if (1 < ((ee) this).field_kb) {
                                param5[6] = 1;
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        param5[6] = 2;
                        break L5;
                      }
                      L7: {
                        L8: {
                          if (param1 == null) {
                            break L8;
                          } else {
                            if (~(param0.length + -1) >= ~param1.length) {
                              break L8;
                            } else {
                              param5[25] = 1;
                              var9 = 0;
                              L9: while (true) {
                                if (var9 >= param1.length) {
                                  break L7;
                                } else {
                                  L10: {
                                    param1[var9] = param1[var9] / 100;
                                    if (param1[var9] <= param5[25]) {
                                      break L10;
                                    } else {
                                      param5[25] = param1[var9];
                                      break L10;
                                    }
                                  }
                                  var9++;
                                  continue L9;
                                }
                              }
                            }
                          }
                        }
                        param5[25] = 0;
                        break L7;
                      }
                      var9 = 0;
                      L11: while (true) {
                        if (param4.length <= var9) {
                          L12: {
                            if (((ee) this).field_lb) {
                              break L12;
                            } else {
                              var9 = 0;
                              var10 = 0;
                              L13: while (true) {
                                if (param4.length <= var10) {
                                  L14: {
                                    if (~param4.length == ~var9) {
                                      break L14;
                                    } else {
                                      if (2 >= param4.length) {
                                        break L12;
                                      } else {
                                        if (param4.length > 2 * var9) {
                                          break L12;
                                        } else {
                                          break L14;
                                        }
                                      }
                                    }
                                  }
                                  var10 = 0;
                                  L15: while (true) {
                                    if (param4.length <= var10) {
                                      break L12;
                                    } else {
                                      L16: {
                                        if (-1 == param4[var10]) {
                                          break L16;
                                        } else {
                                          if ((param4[var10] & 32) == 0) {
                                            break L16;
                                          } else {
                                            param4[var10] = ec.a(param4[var10], -33);
                                            param4[var10] = vn.a(param4[var10], 16);
                                            break L16;
                                          }
                                        }
                                      }
                                      var10++;
                                      continue L15;
                                    }
                                  }
                                } else {
                                  L17: {
                                    if (param4[var10] == -1) {
                                      break L17;
                                    } else {
                                      if (0 != (param4[var10] & 32)) {
                                        var9++;
                                        break L17;
                                      } else {
                                        break L17;
                                      }
                                    }
                                  }
                                  var10++;
                                  continue L13;
                                }
                              }
                            }
                          }
                          param5[5] = param5[4];
                          break L0;
                        } else {
                          L18: {
                            if (param2 != null) {
                              param2[var9] = param0[var9].field_vb;
                              break L18;
                            } else {
                              break L18;
                            }
                          }
                          L19: {
                            var10 = 0;
                            var11 = param0[var9];
                            if (var11 != var7_ref) {
                              if ((1 << var11.field_Bb & ((ee) this).field_hb) == 0) {
                                var13 = 0;
                                L20: while (true) {
                                  if (var13 >= 32) {
                                    param4[var9] = var10;
                                    break L19;
                                  } else {
                                    L21: {
                                      if (var13 != 4) {
                                        if (25 == var13) {
                                          if (0 >= param5[25]) {
                                            break L21;
                                          } else {
                                            if (param1 == null) {
                                              break L21;
                                            } else {
                                              if (param5[var13] == param1[var11.field_jc]) {
                                                var10 = var10 | 1 << var13;
                                                break L21;
                                              } else {
                                                break L21;
                                              }
                                            }
                                          }
                                        } else {
                                          if (var13 != 5) {
                                            var12 = var11.b(true, var13);
                                            if (~param5[var13] != ~var12) {
                                              break L21;
                                            } else {
                                              var10 = var10 | 1 << var13;
                                              break L21;
                                            }
                                          } else {
                                            break L21;
                                          }
                                        }
                                      } else {
                                        L22: {
                                          var12 = var11.b(true, var13);
                                          if (var12 != 0) {
                                            break L22;
                                          } else {
                                            if (var11.field_w <= 0) {
                                              break L22;
                                            } else {
                                              if (var11.field_kb != 0) {
                                                break L22;
                                              } else {
                                                L23: {
                                                  if (0 != ((ee) this).field_R) {
                                                    break L23;
                                                  } else {
                                                    if (!((ee) this).field_lb) {
                                                      break L22;
                                                    } else {
                                                      break L23;
                                                    }
                                                  }
                                                }
                                                var10 = var10 | 32;
                                                break L21;
                                              }
                                            }
                                          }
                                        }
                                        if (((ee) this).field_kb <= 1) {
                                          break L21;
                                        } else {
                                          if (param5[var13] != var12) {
                                            break L21;
                                          } else {
                                            var10 = var10 | 16;
                                            break L21;
                                          }
                                        }
                                      }
                                    }
                                    var13++;
                                    continue L20;
                                  }
                                }
                              } else {
                                param4[var9] = -1;
                                break L19;
                              }
                            } else {
                              break L19;
                            }
                          }
                          var9++;
                          continue L11;
                        }
                      }
                    } else {
                      L24: {
                        var11 = var9_ref_mb__[var10];
                        if (var7_ref != var11) {
                          var13 = 0;
                          L25: while (true) {
                            if (32 <= var13) {
                              L26: {
                                if (null == param1) {
                                  break L26;
                                } else {
                                  param1[var11.field_jc] = param1[var11.field_jc] + var11.field_vb;
                                  break L26;
                                }
                              }
                              if (var11.field_Hb) {
                                break L24;
                              } else {
                                var8++;
                                break L24;
                              }
                            } else {
                              L27: {
                                if (var13 == 3) {
                                  break L27;
                                } else {
                                  if (var13 == 20) {
                                    break L27;
                                  } else {
                                    if (var13 == 22) {
                                      break L27;
                                    } else {
                                      if (6 == var13) {
                                        break L27;
                                      } else {
                                        if (var13 == 5) {
                                          break L27;
                                        } else {
                                          if (var13 == 25) {
                                            break L27;
                                          } else {
                                            var12 = var11.b(true, var13);
                                            if (4 != var13) {
                                              if (var12 > param5[var13]) {
                                                param5[var13] = var12;
                                                break L27;
                                              } else {
                                                break L27;
                                              }
                                            } else {
                                              if (~param5[var13] < ~var12) {
                                                param5[var13] = var12;
                                                break L27;
                                              } else {
                                                break L27;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              var13++;
                              continue L25;
                            }
                          }
                        } else {
                          break L24;
                        }
                      }
                      var10++;
                      continue L4;
                    }
                  }
                } else {
                  return;
                }
              } else {
                param5[var9 + 12] = 1;
                var9++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L28: {
            var7 = decompiledCaughtException;
            stackOut_188_0 = (RuntimeException) var7;
            stackOut_188_1 = new StringBuilder().append("ee.BB(");
            stackIn_191_0 = stackOut_188_0;
            stackIn_191_1 = stackOut_188_1;
            stackIn_189_0 = stackOut_188_0;
            stackIn_189_1 = stackOut_188_1;
            if (param0 == null) {
              stackOut_191_0 = (RuntimeException) (Object) stackIn_191_0;
              stackOut_191_1 = (StringBuilder) (Object) stackIn_191_1;
              stackOut_191_2 = "null";
              stackIn_192_0 = stackOut_191_0;
              stackIn_192_1 = stackOut_191_1;
              stackIn_192_2 = stackOut_191_2;
              break L28;
            } else {
              stackOut_189_0 = (RuntimeException) (Object) stackIn_189_0;
              stackOut_189_1 = (StringBuilder) (Object) stackIn_189_1;
              stackOut_189_2 = "{...}";
              stackIn_192_0 = stackOut_189_0;
              stackIn_192_1 = stackOut_189_1;
              stackIn_192_2 = stackOut_189_2;
              break L28;
            }
          }
          L29: {
            stackOut_192_0 = (RuntimeException) (Object) stackIn_192_0;
            stackOut_192_1 = ((StringBuilder) (Object) stackIn_192_1).append(stackIn_192_2).append(44);
            stackIn_195_0 = stackOut_192_0;
            stackIn_195_1 = stackOut_192_1;
            stackIn_193_0 = stackOut_192_0;
            stackIn_193_1 = stackOut_192_1;
            if (param1 == null) {
              stackOut_195_0 = (RuntimeException) (Object) stackIn_195_0;
              stackOut_195_1 = (StringBuilder) (Object) stackIn_195_1;
              stackOut_195_2 = "null";
              stackIn_196_0 = stackOut_195_0;
              stackIn_196_1 = stackOut_195_1;
              stackIn_196_2 = stackOut_195_2;
              break L29;
            } else {
              stackOut_193_0 = (RuntimeException) (Object) stackIn_193_0;
              stackOut_193_1 = (StringBuilder) (Object) stackIn_193_1;
              stackOut_193_2 = "{...}";
              stackIn_196_0 = stackOut_193_0;
              stackIn_196_1 = stackOut_193_1;
              stackIn_196_2 = stackOut_193_2;
              break L29;
            }
          }
          L30: {
            stackOut_196_0 = (RuntimeException) (Object) stackIn_196_0;
            stackOut_196_1 = ((StringBuilder) (Object) stackIn_196_1).append(stackIn_196_2).append(44);
            stackIn_199_0 = stackOut_196_0;
            stackIn_199_1 = stackOut_196_1;
            stackIn_197_0 = stackOut_196_0;
            stackIn_197_1 = stackOut_196_1;
            if (param2 == null) {
              stackOut_199_0 = (RuntimeException) (Object) stackIn_199_0;
              stackOut_199_1 = (StringBuilder) (Object) stackIn_199_1;
              stackOut_199_2 = "null";
              stackIn_200_0 = stackOut_199_0;
              stackIn_200_1 = stackOut_199_1;
              stackIn_200_2 = stackOut_199_2;
              break L30;
            } else {
              stackOut_197_0 = (RuntimeException) (Object) stackIn_197_0;
              stackOut_197_1 = (StringBuilder) (Object) stackIn_197_1;
              stackOut_197_2 = "{...}";
              stackIn_200_0 = stackOut_197_0;
              stackIn_200_1 = stackOut_197_1;
              stackIn_200_2 = stackOut_197_2;
              break L30;
            }
          }
          L31: {
            stackOut_200_0 = (RuntimeException) (Object) stackIn_200_0;
            stackOut_200_1 = ((StringBuilder) (Object) stackIn_200_1).append(stackIn_200_2).append(44).append(param3).append(44);
            stackIn_203_0 = stackOut_200_0;
            stackIn_203_1 = stackOut_200_1;
            stackIn_201_0 = stackOut_200_0;
            stackIn_201_1 = stackOut_200_1;
            if (param4 == null) {
              stackOut_203_0 = (RuntimeException) (Object) stackIn_203_0;
              stackOut_203_1 = (StringBuilder) (Object) stackIn_203_1;
              stackOut_203_2 = "null";
              stackIn_204_0 = stackOut_203_0;
              stackIn_204_1 = stackOut_203_1;
              stackIn_204_2 = stackOut_203_2;
              break L31;
            } else {
              stackOut_201_0 = (RuntimeException) (Object) stackIn_201_0;
              stackOut_201_1 = (StringBuilder) (Object) stackIn_201_1;
              stackOut_201_2 = "{...}";
              stackIn_204_0 = stackOut_201_0;
              stackIn_204_1 = stackOut_201_1;
              stackIn_204_2 = stackOut_201_2;
              break L31;
            }
          }
          L32: {
            stackOut_204_0 = (RuntimeException) (Object) stackIn_204_0;
            stackOut_204_1 = ((StringBuilder) (Object) stackIn_204_1).append(stackIn_204_2).append(44);
            stackIn_207_0 = stackOut_204_0;
            stackIn_207_1 = stackOut_204_1;
            stackIn_205_0 = stackOut_204_0;
            stackIn_205_1 = stackOut_204_1;
            if (param5 == null) {
              stackOut_207_0 = (RuntimeException) (Object) stackIn_207_0;
              stackOut_207_1 = (StringBuilder) (Object) stackIn_207_1;
              stackOut_207_2 = "null";
              stackIn_208_0 = stackOut_207_0;
              stackIn_208_1 = stackOut_207_1;
              stackIn_208_2 = stackOut_207_2;
              break L32;
            } else {
              stackOut_205_0 = (RuntimeException) (Object) stackIn_205_0;
              stackOut_205_1 = (StringBuilder) (Object) stackIn_205_1;
              stackOut_205_2 = "{...}";
              stackIn_208_0 = stackOut_205_0;
              stackIn_208_1 = stackOut_205_1;
              stackIn_208_2 = stackOut_205_2;
              break L32;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_208_0, stackIn_208_2 + 41);
        }
    }

    private final void a(mb param0, int param1, int param2, int param3, mb param4, int param5) {
        RuntimeException var7 = null;
        je var7_ref = null;
        int var8 = 0;
        je stackIn_15_0 = null;
        je stackIn_15_1 = null;
        int stackIn_15_2 = 0;
        je stackIn_17_0 = null;
        je stackIn_17_1 = null;
        int stackIn_17_2 = 0;
        je stackIn_19_0 = null;
        je stackIn_19_1 = null;
        int stackIn_19_2 = 0;
        je stackIn_20_0 = null;
        je stackIn_20_1 = null;
        int stackIn_20_2 = 0;
        int stackIn_20_3 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        RuntimeException decompiledCaughtException = null;
        je stackOut_14_0 = null;
        je stackOut_14_1 = null;
        int stackOut_14_2 = 0;
        je stackOut_19_0 = null;
        je stackOut_19_1 = null;
        int stackOut_19_2 = 0;
        int stackOut_19_3 = 0;
        je stackOut_15_0 = null;
        je stackOut_15_1 = null;
        int stackOut_15_2 = 0;
        je stackOut_17_0 = null;
        je stackOut_17_1 = null;
        int stackOut_17_2 = 0;
        int stackOut_17_3 = 0;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        var8 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              L2: {
                if (param4.field_Yb != 0) {
                  break L2;
                } else {
                  if (param0.field_mc > 0) {
                    break L2;
                  } else {
                    if (param0.field_S <= 0) {
                      break L2;
                    } else {
                      if (Math.abs(param1) < 30000) {
                        param4.field_Tb = 10;
                        var7_ref = new je(8, param3, ((ee) this).field_r + 2);
                        var7_ref.field_p = true;
                        param4.field_B.a(3, (ck) (Object) var7_ref);
                        var7_ref = new je(6, param3, 4 + ((ee) this).field_r);
                        var7_ref.field_p = true;
                        param4.field_B.a(3, (ck) (Object) var7_ref);
                        var7_ref = new je(3, 0, ((ee) this).field_r - -100);
                        var7_ref.field_u = param4.field_hc + param3 * 20000;
                        var7_ref.field_y = -20000 + param4.field_Gb;
                        var7_ref.field_p = true;
                        param4.field_B.a(3, (ck) (Object) var7_ref);
                        param4.field_Tb = param4.field_x;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              if (0 >= param4.field_t) {
                L3: {
                  if (Math.abs(param1) < 15000) {
                    break L3;
                  } else {
                    L4: {
                      if (param4.field_Tb >= 5) {
                        break L4;
                      } else {
                        if (Math.abs(param1) < 30000) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var7_ref = new je(6, param3, 2 + ((ee) this).field_r);
                    var7_ref.field_p = true;
                    param4.field_B.a(3, (ck) (Object) var7_ref);
                    break L1;
                  }
                }
                L5: {
                  if (Math.abs(param1) >= 15000) {
                    break L5;
                  } else {
                    if (Math.abs(param5) < 10000) {
                      param4.field_Tb = 10;
                      var7_ref = new je(6, param3, ((ee) this).field_r - -2);
                      var7_ref.field_p = true;
                      param4.field_B.a(3, (ck) (Object) var7_ref);
                      var7_ref = new je(7, param3, 4 + ((ee) this).field_r);
                      var7_ref.field_p = true;
                      param4.field_B.a(3, (ck) (Object) var7_ref);
                      var7_ref = new je(6, -param3, 25 + ((ee) this).field_r - -4);
                      var7_ref.field_p = true;
                      param4.field_B.a(3, (ck) (Object) var7_ref);
                      var7_ref = new je(6, 0, 254 + ((ee) this).field_r);
                      var7_ref.field_p = true;
                      param4.field_B.a(3, (ck) (Object) var7_ref);
                      return;
                    } else {
                      break L5;
                    }
                  }
                }
                if (10000 <= Math.abs(param1)) {
                  break L1;
                } else {
                  var7_ref = new je(6, -param3, 2 + ((ee) this).field_r);
                  var7_ref.field_p = true;
                  param4.field_B.a(3, (ck) (Object) var7_ref);
                  break L1;
                }
              } else {
                L6: {
                  stackOut_14_0 = null;
                  stackOut_14_1 = null;
                  stackOut_14_2 = 6;
                  stackIn_19_0 = stackOut_14_0;
                  stackIn_19_1 = stackOut_14_1;
                  stackIn_19_2 = stackOut_14_2;
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  stackIn_15_2 = stackOut_14_2;
                  if (param4.field_hc >> 4 >= param4.field_t) {
                    stackOut_19_0 = null;
                    stackOut_19_1 = null;
                    stackOut_19_2 = stackIn_19_2;
                    stackOut_19_3 = -1;
                    stackIn_20_0 = stackOut_19_0;
                    stackIn_20_1 = stackOut_19_1;
                    stackIn_20_2 = stackOut_19_2;
                    stackIn_20_3 = stackOut_19_3;
                    break L6;
                  } else {
                    stackOut_15_0 = null;
                    stackOut_15_1 = null;
                    stackOut_15_2 = stackIn_15_2;
                    stackIn_17_0 = stackOut_15_0;
                    stackIn_17_1 = stackOut_15_1;
                    stackIn_17_2 = stackOut_15_2;
                    stackOut_17_0 = null;
                    stackOut_17_1 = null;
                    stackOut_17_2 = stackIn_17_2;
                    stackOut_17_3 = 1;
                    stackIn_20_0 = stackOut_17_0;
                    stackIn_20_1 = stackOut_17_1;
                    stackIn_20_2 = stackOut_17_2;
                    stackIn_20_3 = stackOut_17_3;
                    break L6;
                  }
                }
                var7_ref = new je(stackIn_20_2, stackIn_20_3, 2 + ((ee) this).field_r);
                var7_ref.field_p = true;
                param4.field_B.a(3, (ck) (Object) var7_ref);
                break L1;
              }
            }
            L7: {
              if (Math.abs(param1) <= 50000) {
                break L7;
              } else {
                if (this.a(((ee) this).field_z, (byte) -119, 3, param4, param0, 2600, ((ee) this).field_r - -15)) {
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            L8: {
              if (!this.a(((ee) this).field_z, (byte) -72, 2, param4, param0, 2600, 15 + ((ee) this).field_r)) {
                if (param4.field_Tb <= 1) {
                  if (80000 >= Math.abs(param1)) {
                    break L8;
                  } else {
                    if (param4.field_Tb <= 0) {
                      break L8;
                    } else {
                      var7_ref = new je(3, 0, ((ee) this).field_r + 30);
                      var7_ref.field_u = param4.field_hc - -(20000 * param3);
                      var7_ref.field_y = -20000 + param4.field_Gb;
                      var7_ref.field_p = true;
                      param4.field_B.a(3, (ck) (Object) var7_ref);
                      param4.field_Tb = param4.field_x;
                      break L8;
                    }
                  }
                } else {
                  if (this.a(((ee) this).field_z, (byte) -67, 1, param4, param0, 1728, 25 + ((ee) this).field_r)) {
                    break L8;
                  } else {
                    if (!this.a(((ee) this).field_z, (byte) -49, 0, param4, param0, 4608, 25 + ((ee) this).field_r)) {
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                }
              } else {
                break L8;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var7 = decompiledCaughtException;
            stackOut_69_0 = (RuntimeException) var7;
            stackOut_69_1 = new StringBuilder().append("ee.O(");
            stackIn_72_0 = stackOut_69_0;
            stackIn_72_1 = stackOut_69_1;
            stackIn_70_0 = stackOut_69_0;
            stackIn_70_1 = stackOut_69_1;
            if (param0 == null) {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L9;
            } else {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "{...}";
              stackIn_73_0 = stackOut_70_0;
              stackIn_73_1 = stackOut_70_1;
              stackIn_73_2 = stackOut_70_2;
              break L9;
            }
          }
          L10: {
            stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
            stackOut_73_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_73_2).append(44).append(param1).append(44).append(-128).append(44).append(param3).append(44);
            stackIn_76_0 = stackOut_73_0;
            stackIn_76_1 = stackOut_73_1;
            stackIn_74_0 = stackOut_73_0;
            stackIn_74_1 = stackOut_73_1;
            if (param4 == null) {
              stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
              stackOut_76_1 = (StringBuilder) (Object) stackIn_76_1;
              stackOut_76_2 = "null";
              stackIn_77_0 = stackOut_76_0;
              stackIn_77_1 = stackOut_76_1;
              stackIn_77_2 = stackOut_76_2;
              break L10;
            } else {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "{...}";
              stackIn_77_0 = stackOut_74_0;
              stackIn_77_1 = stackOut_74_1;
              stackIn_77_2 = stackOut_74_2;
              break L10;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_77_0, stackIn_77_2 + 44 + param5 + 41);
        }
    }

    private final void a(int param0, int param1, mb param2, int param3, mb param4, byte param5) {
        RuntimeException var7 = null;
        je var7_ref = null;
        int var7_int = 0;
        int var8 = 0;
        je stackIn_14_0 = null;
        je stackIn_14_1 = null;
        int stackIn_14_2 = 0;
        je stackIn_16_0 = null;
        je stackIn_16_1 = null;
        int stackIn_16_2 = 0;
        je stackIn_18_0 = null;
        je stackIn_18_1 = null;
        int stackIn_18_2 = 0;
        je stackIn_19_0 = null;
        je stackIn_19_1 = null;
        int stackIn_19_2 = 0;
        int stackIn_19_3 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        je stackOut_13_0 = null;
        je stackOut_13_1 = null;
        int stackOut_13_2 = 0;
        je stackOut_18_0 = null;
        je stackOut_18_1 = null;
        int stackOut_18_2 = 0;
        int stackOut_18_3 = 0;
        je stackOut_14_0 = null;
        je stackOut_14_1 = null;
        int stackOut_14_2 = 0;
        je stackOut_16_0 = null;
        je stackOut_16_1 = null;
        int stackOut_16_2 = 0;
        int stackOut_16_3 = 0;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        var8 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param2.field_t > 0) {
                L2: {
                  stackOut_13_0 = null;
                  stackOut_13_1 = null;
                  stackOut_13_2 = 6;
                  stackIn_18_0 = stackOut_13_0;
                  stackIn_18_1 = stackOut_13_1;
                  stackIn_18_2 = stackOut_13_2;
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  stackIn_14_2 = stackOut_13_2;
                  if (~param2.field_t >= ~(param2.field_hc >> 4)) {
                    stackOut_18_0 = null;
                    stackOut_18_1 = null;
                    stackOut_18_2 = stackIn_18_2;
                    stackOut_18_3 = -1;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    stackIn_19_2 = stackOut_18_2;
                    stackIn_19_3 = stackOut_18_3;
                    break L2;
                  } else {
                    stackOut_14_0 = null;
                    stackOut_14_1 = null;
                    stackOut_14_2 = stackIn_14_2;
                    stackIn_16_0 = stackOut_14_0;
                    stackIn_16_1 = stackOut_14_1;
                    stackIn_16_2 = stackOut_14_2;
                    stackOut_16_0 = null;
                    stackOut_16_1 = null;
                    stackOut_16_2 = stackIn_16_2;
                    stackOut_16_3 = 1;
                    stackIn_19_0 = stackOut_16_0;
                    stackIn_19_1 = stackOut_16_1;
                    stackIn_19_2 = stackOut_16_2;
                    stackIn_19_3 = stackOut_16_3;
                    break L2;
                  }
                }
                var7_ref = new je(stackIn_19_2, stackIn_19_3, 2 + ((ee) this).field_r);
                var7_ref.field_p = true;
                param2.field_B.a(3, (ck) (Object) var7_ref);
                break L1;
              } else {
                L3: {
                  if (40000 > Math.abs(param3)) {
                    break L3;
                  } else {
                    if (param2.field_U == param1) {
                      break L3;
                    } else {
                      var7_ref = new je(6, param1, ((ee) this).field_r - -2);
                      var7_ref.field_p = true;
                      param2.field_B.a(3, (ck) (Object) var7_ref);
                      break L1;
                    }
                  }
                }
                if (30000 <= Math.abs(param3)) {
                  break L1;
                } else {
                  var7_ref = new je(6, -param1, 2 + ((ee) this).field_r);
                  var7_ref.field_p = true;
                  param2.field_B.a(3, (ck) (Object) var7_ref);
                  break L1;
                }
              }
            }
            L4: {
              if (this.a(((ee) this).field_z, (byte) -78, 3, param2, param4, 2600, ((ee) this).field_r - -15)) {
                break L4;
              } else {
                if (!this.a(((ee) this).field_z, (byte) -64, 2, param2, param4, 2600, 15 + ((ee) this).field_r)) {
                  L5: {
                    if (80000 <= Math.abs(param3)) {
                      break L5;
                    } else {
                      if (param2.field_Tb <= 0) {
                        break L5;
                      } else {
                        if (!this.a(((ee) this).field_z, (byte) -29, 1, param2, param4, 4608, ((ee) this).field_r + 25)) {
                          break L5;
                        } else {
                          boolean discarded$1 = this.a(((ee) this).field_z, (byte) -98, 0, param2, param4, 2304, ((ee) this).field_r - -75);
                          break L4;
                        }
                      }
                    }
                  }
                  if (this.a(((ee) this).field_z, (byte) -105, 0, param2, param4, 3072, 50 + ((ee) this).field_r)) {
                    break L4;
                  } else {
                    break L4;
                  }
                } else {
                  break L4;
                }
              }
            }
            var7_int = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var7 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) var7;
            stackOut_41_1 = new StringBuilder().append("ee.CB(").append(param0).append(44).append(param1).append(44);
            stackIn_44_0 = stackOut_41_0;
            stackIn_44_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param2 == null) {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L6;
            } else {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "{...}";
              stackIn_45_0 = stackOut_42_0;
              stackIn_45_1 = stackOut_42_1;
              stackIn_45_2 = stackOut_42_2;
              break L6;
            }
          }
          L7: {
            stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
            stackOut_45_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_45_2).append(44).append(param3).append(44);
            stackIn_48_0 = stackOut_45_0;
            stackIn_48_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param4 == null) {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "null";
              stackIn_49_0 = stackOut_48_0;
              stackIn_49_1 = stackOut_48_1;
              stackIn_49_2 = stackOut_48_2;
              break L7;
            } else {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "{...}";
              stackIn_49_0 = stackOut_46_0;
              stackIn_49_1 = stackOut_46_1;
              stackIn_49_2 = stackOut_46_2;
              break L7;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_49_0, stackIn_49_2 + 44 + 88 + 41);
        }
    }

    final int d(int param0) {
        boolean[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        mb var4_ref_mb = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_24_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_2_0 = 0;
        var5 = SteelSentinels.field_G;
        try {
          L0: {
            var2 = new boolean[200];
            if (param0 == -3905) {
              var4_ref_mb = (mb) (Object) ((ee) this).field_K.e(13058);
              L1: while (true) {
                if (null == var4_ref_mb) {
                  var4 = 0;
                  L2: while (true) {
                    if (~var4 <= ~var2.length) {
                      stackOut_24_0 = -1;
                      stackIn_25_0 = stackOut_24_0;
                      break L0;
                    } else {
                      if (!var2[var4]) {
                        stackOut_21_0 = var4 - -((ee) this).field_kb;
                        stackIn_22_0 = stackOut_21_0;
                        return stackIn_22_0;
                      } else {
                        var4++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  L3: {
                    var3 = var4_ref_mb.field_Bb - ((ee) this).field_kb;
                    if (var3 < 0) {
                      break L3;
                    } else {
                      if (~var2.length >= ~var3) {
                        break L3;
                      } else {
                        var2[var3] = true;
                        break L3;
                      }
                    }
                  }
                  var4_ref_mb = (mb) (Object) ((ee) this).field_K.a((byte) -102);
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = 66;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var2_ref, "ee.NA(" + param0 + 41);
        }
        return stackIn_25_0;
    }

    private final void a(int param0, mb param1, mb param2, int param3, int param4) {
        RuntimeException var6 = null;
        je var6_ref = null;
        int var7 = 0;
        je stackIn_10_0 = null;
        je stackIn_10_1 = null;
        int stackIn_10_2 = 0;
        je stackIn_12_0 = null;
        je stackIn_12_1 = null;
        int stackIn_12_2 = 0;
        je stackIn_14_0 = null;
        je stackIn_14_1 = null;
        int stackIn_14_2 = 0;
        je stackIn_15_0 = null;
        je stackIn_15_1 = null;
        int stackIn_15_2 = 0;
        int stackIn_15_3 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        je stackOut_9_0 = null;
        je stackOut_9_1 = null;
        int stackOut_9_2 = 0;
        je stackOut_14_0 = null;
        je stackOut_14_1 = null;
        int stackOut_14_2 = 0;
        int stackOut_14_3 = 0;
        je stackOut_10_0 = null;
        je stackOut_10_1 = null;
        int stackOut_10_2 = 0;
        je stackOut_12_0 = null;
        je stackOut_12_1 = null;
        int stackOut_12_2 = 0;
        int stackOut_12_3 = 0;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        var7 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param2.field_Vb != null) {
                break L1;
              } else {
                if (0 < param2.field_Tb) {
                  var6_ref = new je(5, param1.field_Bb, 1 + ((ee) this).field_r);
                  var6_ref.field_p = true;
                  param2.field_B.a(3, (ck) (Object) var6_ref);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param2.field_t <= 0) {
                if (Math.abs(param0) > 80000) {
                  var6_ref = new je(6, param4, 2 + ((ee) this).field_r);
                  var6_ref.field_p = true;
                  param2.field_B.a(3, (ck) (Object) var6_ref);
                  break L2;
                } else {
                  break L2;
                }
              } else {
                L3: {
                  stackOut_9_0 = null;
                  stackOut_9_1 = null;
                  stackOut_9_2 = 6;
                  stackIn_14_0 = stackOut_9_0;
                  stackIn_14_1 = stackOut_9_1;
                  stackIn_14_2 = stackOut_9_2;
                  stackIn_10_0 = stackOut_9_0;
                  stackIn_10_1 = stackOut_9_1;
                  stackIn_10_2 = stackOut_9_2;
                  if (param2.field_t > param2.field_hc >> 4) {
                    stackOut_14_0 = null;
                    stackOut_14_1 = null;
                    stackOut_14_2 = stackIn_14_2;
                    stackOut_14_3 = 1;
                    stackIn_15_0 = stackOut_14_0;
                    stackIn_15_1 = stackOut_14_1;
                    stackIn_15_2 = stackOut_14_2;
                    stackIn_15_3 = stackOut_14_3;
                    break L3;
                  } else {
                    stackOut_10_0 = null;
                    stackOut_10_1 = null;
                    stackOut_10_2 = stackIn_10_2;
                    stackIn_12_0 = stackOut_10_0;
                    stackIn_12_1 = stackOut_10_1;
                    stackIn_12_2 = stackOut_10_2;
                    stackOut_12_0 = null;
                    stackOut_12_1 = null;
                    stackOut_12_2 = stackIn_12_2;
                    stackOut_12_3 = -1;
                    stackIn_15_0 = stackOut_12_0;
                    stackIn_15_1 = stackOut_12_1;
                    stackIn_15_2 = stackOut_12_2;
                    stackIn_15_3 = stackOut_12_3;
                    break L3;
                  }
                }
                var6_ref = new je(stackIn_15_2, stackIn_15_3, ((ee) this).field_r + 2);
                var6_ref.field_p = true;
                param2.field_B.a(3, (ck) (Object) var6_ref);
                break L2;
              }
            }
            L4: {
              L5: {
                var6_ref = new je(0, param2.field_Xb[2], 3 + ((ee) this).field_r);
                var6_ref.field_B = 13384 * param2.field_E;
                var6_ref.field_p = true;
                var6_ref.field_y = param1.field_Gb;
                var6_ref.field_u = param1.field_hc;
                param2.field_B.a(3, (ck) (Object) var6_ref);
                if (param2.field_Tb <= 0) {
                  break L5;
                } else {
                  if (~param2.field_Gb >= ~param1.field_Gb) {
                    break L5;
                  } else {
                    if (null != param2.field_Vb) {
                      var6_ref = new je(0, param2.field_Xb[1], (param1.field_hc + ((ee) this).field_r + param2.field_hc) % 100 + ((ee) this).field_r + 29);
                      var6_ref.field_u = param1.field_hc;
                      var6_ref.field_B = param4 * 15384;
                      var6_ref.field_y = param1.field_Gb;
                      var6_ref.field_p = true;
                      param2.field_B.a(3, (ck) (Object) var6_ref);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              if (param2.field_Vb != null) {
                var6_ref = new je(0, param2.field_Xb[0], (param1.field_hc + (((ee) this).field_r - -param2.field_hc)) % 100 + 4 + (((ee) this).field_r + 50));
                var6_ref.field_B = 16384 * param4;
                var6_ref.field_p = true;
                var6_ref.field_y = param1.field_Gb;
                var6_ref.field_u = param1.field_hc;
                param2.field_B.a(3, (ck) (Object) var6_ref);
                break L4;
              } else {
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) var6;
            stackOut_41_1 = new StringBuilder().append("ee.AA(").append(param0).append(44);
            stackIn_44_0 = stackOut_41_0;
            stackIn_44_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param1 == null) {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L6;
            } else {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "{...}";
              stackIn_45_0 = stackOut_42_0;
              stackIn_45_1 = stackOut_42_1;
              stackIn_45_2 = stackOut_42_2;
              break L6;
            }
          }
          L7: {
            stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
            stackOut_45_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_45_2).append(44);
            stackIn_48_0 = stackOut_45_0;
            stackIn_48_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param2 == null) {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "null";
              stackIn_49_0 = stackOut_48_0;
              stackIn_49_1 = stackOut_48_1;
              stackIn_49_2 = stackOut_48_2;
              break L7;
            } else {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "{...}";
              stackIn_49_0 = stackOut_46_0;
              stackIn_49_1 = stackOut_46_1;
              stackIn_49_2 = stackOut_46_2;
              break L7;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_49_0, stackIn_49_2 + 44 + 20063 + 44 + param4 + 41);
        }
    }

    private final void a(int param0, mb param1, int param2, int param3, int param4, mb param5) {
        int var7_int = 0;
        Object var8 = null;
        je var9 = null;
        int var9_int = 0;
        double var10 = 0.0;
        je var10_ref_je = null;
        double var11 = 0.0;
        int var13 = 0;
        je stackIn_20_0 = null;
        je stackIn_20_1 = null;
        int stackIn_20_2 = 0;
        je stackIn_21_0 = null;
        je stackIn_21_1 = null;
        int stackIn_21_2 = 0;
        je stackIn_22_0 = null;
        je stackIn_22_1 = null;
        int stackIn_22_2 = 0;
        je stackIn_23_0 = null;
        je stackIn_23_1 = null;
        int stackIn_23_2 = 0;
        int stackIn_23_3 = 0;
        je stackIn_44_0 = null;
        je stackIn_44_1 = null;
        int stackIn_44_2 = 0;
        je stackIn_45_0 = null;
        je stackIn_45_1 = null;
        int stackIn_45_2 = 0;
        je stackIn_46_0 = null;
        je stackIn_46_1 = null;
        int stackIn_46_2 = 0;
        je stackIn_47_0 = null;
        je stackIn_47_1 = null;
        int stackIn_47_2 = 0;
        int stackIn_47_3 = 0;
        je stackIn_58_0 = null;
        je stackIn_58_1 = null;
        int stackIn_58_2 = 0;
        je stackIn_59_0 = null;
        je stackIn_59_1 = null;
        int stackIn_59_2 = 0;
        je stackIn_60_0 = null;
        je stackIn_60_1 = null;
        int stackIn_60_2 = 0;
        je stackIn_61_0 = null;
        je stackIn_61_1 = null;
        int stackIn_61_2 = 0;
        int stackIn_61_3 = 0;
        je stackIn_70_0 = null;
        je stackIn_70_1 = null;
        int stackIn_70_2 = 0;
        je stackIn_71_0 = null;
        je stackIn_71_1 = null;
        int stackIn_71_2 = 0;
        je stackIn_72_0 = null;
        je stackIn_72_1 = null;
        int stackIn_72_2 = 0;
        int stackIn_72_3 = 0;
        je stackIn_91_0 = null;
        je stackIn_91_1 = null;
        int stackIn_91_2 = 0;
        je stackIn_92_0 = null;
        je stackIn_92_1 = null;
        int stackIn_92_2 = 0;
        je stackIn_93_0 = null;
        je stackIn_93_1 = null;
        int stackIn_93_2 = 0;
        int stackIn_93_3 = 0;
        je stackOut_69_0 = null;
        je stackOut_69_1 = null;
        int stackOut_69_2 = 0;
        je stackOut_71_0 = null;
        je stackOut_71_1 = null;
        int stackOut_71_2 = 0;
        int stackOut_71_3 = 0;
        je stackOut_70_0 = null;
        je stackOut_70_1 = null;
        int stackOut_70_2 = 0;
        int stackOut_70_3 = 0;
        je stackOut_90_0 = null;
        je stackOut_90_1 = null;
        int stackOut_90_2 = 0;
        je stackOut_92_0 = null;
        je stackOut_92_1 = null;
        int stackOut_92_2 = 0;
        int stackOut_92_3 = 0;
        je stackOut_91_0 = null;
        je stackOut_91_1 = null;
        int stackOut_91_2 = 0;
        int stackOut_91_3 = 0;
        je stackOut_57_0 = null;
        je stackOut_57_1 = null;
        int stackOut_57_2 = 0;
        je stackOut_60_0 = null;
        je stackOut_60_1 = null;
        int stackOut_60_2 = 0;
        int stackOut_60_3 = 0;
        je stackOut_58_0 = null;
        je stackOut_58_1 = null;
        int stackOut_58_2 = 0;
        je stackOut_59_0 = null;
        je stackOut_59_1 = null;
        int stackOut_59_2 = 0;
        int stackOut_59_3 = 0;
        je stackOut_43_0 = null;
        je stackOut_43_1 = null;
        int stackOut_43_2 = 0;
        je stackOut_46_0 = null;
        je stackOut_46_1 = null;
        int stackOut_46_2 = 0;
        int stackOut_46_3 = 0;
        je stackOut_44_0 = null;
        je stackOut_44_1 = null;
        int stackOut_44_2 = 0;
        je stackOut_45_0 = null;
        je stackOut_45_1 = null;
        int stackOut_45_2 = 0;
        int stackOut_45_3 = 0;
        je stackOut_19_0 = null;
        je stackOut_19_1 = null;
        int stackOut_19_2 = 0;
        je stackOut_22_0 = null;
        je stackOut_22_1 = null;
        int stackOut_22_2 = 0;
        int stackOut_22_3 = 0;
        je stackOut_20_0 = null;
        je stackOut_20_1 = null;
        int stackOut_20_2 = 0;
        je stackOut_21_0 = null;
        je stackOut_21_1 = null;
        int stackOut_21_2 = 0;
        int stackOut_21_3 = 0;
        var13 = SteelSentinels.field_G;
        var7_int = 0;
        L0: {
          if (param4 >= 0) {
            var7_int = -128 + param1.field_hc;
            break L0;
          } else {
            var7_int = (((ee) this).field_ab.a(122) << 4) + -128 - param1.field_hc;
            break L0;
          }
        }
        L1: {
          var8 = null;
          if (0 > param5.field_W) {
            break L1;
          } else {
            L2: {
              var8 = (Object) (Object) ((ee) this).f(param5.field_W, -127);
              if (var8 == null) {
                break L2;
              } else {
                if (((mb) var8).field_Hb) {
                  break L2;
                } else {
                  break L1;
                }
              }
            }
            var8 = null;
            param5.field_W = -1;
            break L1;
          }
        }
        L3: {
          if (var8 != null) {
            if ((Object) (Object) param5 != var8) {
              L4: {
                if (param5.field_hc < param5.field_C + ((mb) var8).field_hc + -1000) {
                  var9 = new je(6, 1, ((ee) this).field_r - -2);
                  var9.field_p = true;
                  param5.field_B.a(3, (ck) (Object) var9);
                  break L4;
                } else {
                  if (~param5.field_hc < ~(param5.field_C + ((mb) var8).field_hc + 1000)) {
                    var9 = new je(6, -1, 2 + ((ee) this).field_r);
                    var9.field_p = true;
                    param5.field_B.a(3, (ck) (Object) var9);
                    break L4;
                  } else {
                    if (~((mb) var8).field_U != ~param5.field_U) {
                      var9 = new je(6, ((mb) var8).field_U, 2 + ((ee) this).field_r);
                      var9.field_p = true;
                      param5.field_B.a(3, (ck) (Object) var9);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              L5: {
                param5.field_Vb = ((mb) var8).field_Vb;
                param5.field_ec = ((mb) var8).field_ec;
                if (param5.field_Vb == null) {
                  break L5;
                } else {
                  if (Math.abs(param0) < 90000) {
                    break L5;
                  } else {
                    var9 = new je(0, param5.field_Xb[1], 4 + (((ee) this).field_r + (param5.field_hc + ((ee) this).field_r - -param1.field_hc) % 500));
                    var9.field_y = -25000 + param5.field_Gb;
                    var9.field_u = param5.field_hc - -(param4 * 25000);
                    var9.field_B = 4096 * param4;
                    var9.field_p = true;
                    param5.field_B.a(3, (ck) (Object) var9);
                    break L5;
                  }
                }
              }
              if (10000 <= Math.abs(param0)) {
                break L3;
              } else {
                var9 = new je(0, param5.field_Xb[0], (param1.field_hc + (((ee) this).field_r + param5.field_hc)) % 100 + (4 + ((ee) this).field_r));
                var9.field_y = param1.field_Gb;
                var9.field_u = param1.field_hc;
                var10 = Math.atan2((double)param0, (double)(-param3));
                var9.field_B = (int)(var10 * 65536.0 / 6.283185307179586);
                var9.field_p = true;
                param5.field_B.a(3, (ck) (Object) var9);
                break L3;
              }
            } else {
              L6: {
                if (param5.field_t > 0) {
                  L7: {
                    stackOut_69_0 = null;
                    stackOut_69_1 = null;
                    stackOut_69_2 = 6;
                    stackIn_71_0 = stackOut_69_0;
                    stackIn_71_1 = stackOut_69_1;
                    stackIn_71_2 = stackOut_69_2;
                    stackIn_70_0 = stackOut_69_0;
                    stackIn_70_1 = stackOut_69_1;
                    stackIn_70_2 = stackOut_69_2;
                    if (~param5.field_t >= ~(param5.field_hc >> 4)) {
                      stackOut_71_0 = null;
                      stackOut_71_1 = null;
                      stackOut_71_2 = stackIn_71_2;
                      stackOut_71_3 = -1;
                      stackIn_72_0 = stackOut_71_0;
                      stackIn_72_1 = stackOut_71_1;
                      stackIn_72_2 = stackOut_71_2;
                      stackIn_72_3 = stackOut_71_3;
                      break L7;
                    } else {
                      stackOut_70_0 = null;
                      stackOut_70_1 = null;
                      stackOut_70_2 = stackIn_70_2;
                      stackOut_70_3 = 1;
                      stackIn_72_0 = stackOut_70_0;
                      stackIn_72_1 = stackOut_70_1;
                      stackIn_72_2 = stackOut_70_2;
                      stackIn_72_3 = stackOut_70_3;
                      break L7;
                    }
                  }
                  var9 = new je(stackIn_72_2, stackIn_72_3, ((ee) this).field_r - -2);
                  var9.field_p = true;
                  param5.field_B.a(3, (ck) (Object) var9);
                  break L6;
                } else {
                  break L6;
                }
              }
              L8: {
                L9: {
                  if (null == param5.field_Vb) {
                    break L9;
                  } else {
                    if (Math.abs(param0) < 90000) {
                      break L9;
                    } else {
                      L10: {
                        if (param5.field_t == 0) {
                          var9 = new je(6, param4, ((ee) this).field_r - -2);
                          var9.field_p = true;
                          param5.field_B.a(3, (ck) (Object) var9);
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      var9 = new je(0, param5.field_Xb[1], (param1.field_hc + ((ee) this).field_r + param5.field_hc) % 500 + (4 + ((ee) this).field_r));
                      var9.field_u = param4 * 25000 + param5.field_hc;
                      var9.field_p = true;
                      var9.field_y = -25000 + param5.field_Gb;
                      var9.field_B = param4 * 4096;
                      param5.field_B.a(3, (ck) (Object) var9);
                      break L8;
                    }
                  }
                }
                if (param5.field_t > 0) {
                  break L8;
                } else {
                  if (120000 < Math.abs(param0)) {
                    var9 = new je(6, param4, ((ee) this).field_r - -2);
                    var9.field_p = true;
                    param5.field_B.a(3, (ck) (Object) var9);
                    break L8;
                  } else {
                    L11: {
                      if (Math.abs(param0) < 60000) {
                        break L11;
                      } else {
                        if (param5.field_U == 0) {
                          break L11;
                        } else {
                          break L8;
                        }
                      }
                    }
                    L12: {
                      stackOut_90_0 = null;
                      stackOut_90_1 = null;
                      stackOut_90_2 = 6;
                      stackIn_92_0 = stackOut_90_0;
                      stackIn_92_1 = stackOut_90_1;
                      stackIn_92_2 = stackOut_90_2;
                      stackIn_91_0 = stackOut_90_0;
                      stackIn_91_1 = stackOut_90_1;
                      stackIn_91_2 = stackOut_90_2;
                      if (120000 > var7_int) {
                        stackOut_92_0 = null;
                        stackOut_92_1 = null;
                        stackOut_92_2 = stackIn_92_2;
                        stackOut_92_3 = param4;
                        stackIn_93_0 = stackOut_92_0;
                        stackIn_93_1 = stackOut_92_1;
                        stackIn_93_2 = stackOut_92_2;
                        stackIn_93_3 = stackOut_92_3;
                        break L12;
                      } else {
                        stackOut_91_0 = null;
                        stackOut_91_1 = null;
                        stackOut_91_2 = stackIn_91_2;
                        stackOut_91_3 = -param4;
                        stackIn_93_0 = stackOut_91_0;
                        stackIn_93_1 = stackOut_91_1;
                        stackIn_93_2 = stackOut_91_2;
                        stackIn_93_3 = stackOut_91_3;
                        break L12;
                      }
                    }
                    var9 = new je(stackIn_93_2, stackIn_93_3, 2 + ((ee) this).field_r);
                    var9.field_p = true;
                    param5.field_B.a(3, (ck) (Object) var9);
                    break L8;
                  }
                }
              }
              if (param5.field_Tb < 1) {
                break L3;
              } else {
                if (null != param5.field_Vb) {
                  break L3;
                } else {
                  var9 = new je(5, param1.field_Bb, ((ee) this).field_r + 4 + (param5.field_hc + (((ee) this).field_r + param1.field_hc)) % 500);
                  var9.field_p = true;
                  param5.field_B.a(3, (ck) (Object) var9);
                  break L3;
                }
              }
            }
          } else {
            L13: {
              if (null == param5.field_Vb) {
                break L13;
              } else {
                if (Math.abs(param0) >= 90000) {
                  L14: {
                    if (param5.field_t <= 0) {
                      var9 = new je(6, param4, ((ee) this).field_r + 2);
                      break L14;
                    } else {
                      L15: {
                        stackOut_57_0 = null;
                        stackOut_57_1 = null;
                        stackOut_57_2 = 6;
                        stackIn_60_0 = stackOut_57_0;
                        stackIn_60_1 = stackOut_57_1;
                        stackIn_60_2 = stackOut_57_2;
                        stackIn_58_0 = stackOut_57_0;
                        stackIn_58_1 = stackOut_57_1;
                        stackIn_58_2 = stackOut_57_2;
                        if (~param5.field_t < ~(param5.field_hc >> 4)) {
                          stackOut_60_0 = null;
                          stackOut_60_1 = null;
                          stackOut_60_2 = stackIn_60_2;
                          stackOut_60_3 = 1;
                          stackIn_61_0 = stackOut_60_0;
                          stackIn_61_1 = stackOut_60_1;
                          stackIn_61_2 = stackOut_60_2;
                          stackIn_61_3 = stackOut_60_3;
                          break L15;
                        } else {
                          stackOut_58_0 = null;
                          stackOut_58_1 = null;
                          stackOut_58_2 = stackIn_58_2;
                          stackIn_59_0 = stackOut_58_0;
                          stackIn_59_1 = stackOut_58_1;
                          stackIn_59_2 = stackOut_58_2;
                          stackOut_59_0 = null;
                          stackOut_59_1 = null;
                          stackOut_59_2 = stackIn_59_2;
                          stackOut_59_3 = -1;
                          stackIn_61_0 = stackOut_59_0;
                          stackIn_61_1 = stackOut_59_1;
                          stackIn_61_2 = stackOut_59_2;
                          stackIn_61_3 = stackOut_59_3;
                          break L15;
                        }
                      }
                      var9 = new je(stackIn_61_2, stackIn_61_3, ((ee) this).field_r - -2);
                      break L14;
                    }
                  }
                  var9.field_p = true;
                  param5.field_B.a(3, (ck) (Object) var9);
                  var9 = new je(0, param5.field_Xb[1], 4 + ((ee) this).field_r - -((((ee) this).field_r + param1.field_hc + param5.field_hc) % 500));
                  var9.field_p = true;
                  var9.field_u = param4 * 25000 + param5.field_hc;
                  var9.field_y = -25000 + param5.field_Gb;
                  var9.field_B = param4 * 4096;
                  param5.field_B.a(3, (ck) (Object) var9);
                  break L3;
                } else {
                  break L13;
                }
              }
            }
            if (param5.field_Vb != null) {
              L16: {
                var9_int = -param4;
                if (var7_int >= 90000) {
                  break L16;
                } else {
                  var9_int = param4;
                  break L16;
                }
              }
              L17: {
                if (0 >= param5.field_t) {
                  if (~var9_int != ~param5.field_U) {
                    var10_ref_je = new je(6, var9_int, ((ee) this).field_r - -2);
                    var10_ref_je.field_p = true;
                    param5.field_B.a(3, (ck) (Object) var10_ref_je);
                    break L17;
                  } else {
                    break L17;
                  }
                } else {
                  L18: {
                    stackOut_43_0 = null;
                    stackOut_43_1 = null;
                    stackOut_43_2 = 6;
                    stackIn_46_0 = stackOut_43_0;
                    stackIn_46_1 = stackOut_43_1;
                    stackIn_46_2 = stackOut_43_2;
                    stackIn_44_0 = stackOut_43_0;
                    stackIn_44_1 = stackOut_43_1;
                    stackIn_44_2 = stackOut_43_2;
                    if (param5.field_t <= param5.field_hc >> 4) {
                      stackOut_46_0 = null;
                      stackOut_46_1 = null;
                      stackOut_46_2 = stackIn_46_2;
                      stackOut_46_3 = -1;
                      stackIn_47_0 = stackOut_46_0;
                      stackIn_47_1 = stackOut_46_1;
                      stackIn_47_2 = stackOut_46_2;
                      stackIn_47_3 = stackOut_46_3;
                      break L18;
                    } else {
                      stackOut_44_0 = null;
                      stackOut_44_1 = null;
                      stackOut_44_2 = stackIn_44_2;
                      stackIn_45_0 = stackOut_44_0;
                      stackIn_45_1 = stackOut_44_1;
                      stackIn_45_2 = stackOut_44_2;
                      stackOut_45_0 = null;
                      stackOut_45_1 = null;
                      stackOut_45_2 = stackIn_45_2;
                      stackOut_45_3 = 1;
                      stackIn_47_0 = stackOut_45_0;
                      stackIn_47_1 = stackOut_45_1;
                      stackIn_47_2 = stackOut_45_2;
                      stackIn_47_3 = stackOut_45_3;
                      break L18;
                    }
                  }
                  var10_ref_je = new je(stackIn_47_2, stackIn_47_3, 2 + ((ee) this).field_r);
                  var10_ref_je.field_p = true;
                  param5.field_B.a(3, (ck) (Object) var10_ref_je);
                  break L17;
                }
              }
              L19: {
                if (Math.abs(param0) >= 30000) {
                  break L19;
                } else {
                  var10_ref_je = new je(0, param5.field_Xb[0], (param5.field_hc + (param1.field_hc + ((ee) this).field_r)) % 100 + 4 + ((ee) this).field_r);
                  var10_ref_je.field_u = param1.field_hc;
                  var10_ref_je.field_y = param1.field_Gb;
                  var11 = Math.atan2((double)param0, (double)(-param3));
                  var10_ref_je.field_p = true;
                  var10_ref_je.field_B = (int)(65536.0 * var11 / 6.283185307179586);
                  param5.field_B.a(3, (ck) (Object) var10_ref_je);
                  break L19;
                }
              }
              break L3;
            } else {
              L20: {
                if (param5.field_t <= 0) {
                  L21: {
                    if (Math.abs(param0) >= 30000) {
                      break L21;
                    } else {
                      if (var7_int > 50000) {
                        var9 = new je(6, -param4, 2 + ((ee) this).field_r);
                        var9.field_p = true;
                        param5.field_B.a(3, (ck) (Object) var9);
                        break L20;
                      } else {
                        break L21;
                      }
                    }
                  }
                  L22: {
                    if (Math.abs(param0) > 60000) {
                      break L22;
                    } else {
                      if (param5.field_U != 0) {
                        break L20;
                      } else {
                        break L22;
                      }
                    }
                  }
                  var9 = new je(6, param4, ((ee) this).field_r - -2);
                  var9.field_p = true;
                  param5.field_B.a(3, (ck) (Object) var9);
                  break L20;
                } else {
                  L23: {
                    stackOut_19_0 = null;
                    stackOut_19_1 = null;
                    stackOut_19_2 = 6;
                    stackIn_22_0 = stackOut_19_0;
                    stackIn_22_1 = stackOut_19_1;
                    stackIn_22_2 = stackOut_19_2;
                    stackIn_20_0 = stackOut_19_0;
                    stackIn_20_1 = stackOut_19_1;
                    stackIn_20_2 = stackOut_19_2;
                    if (~(param5.field_hc >> 4) <= ~param5.field_t) {
                      stackOut_22_0 = null;
                      stackOut_22_1 = null;
                      stackOut_22_2 = stackIn_22_2;
                      stackOut_22_3 = -1;
                      stackIn_23_0 = stackOut_22_0;
                      stackIn_23_1 = stackOut_22_1;
                      stackIn_23_2 = stackOut_22_2;
                      stackIn_23_3 = stackOut_22_3;
                      break L23;
                    } else {
                      stackOut_20_0 = null;
                      stackOut_20_1 = null;
                      stackOut_20_2 = stackIn_20_2;
                      stackIn_21_0 = stackOut_20_0;
                      stackIn_21_1 = stackOut_20_1;
                      stackIn_21_2 = stackOut_20_2;
                      stackOut_21_0 = null;
                      stackOut_21_1 = null;
                      stackOut_21_2 = stackIn_21_2;
                      stackOut_21_3 = 1;
                      stackIn_23_0 = stackOut_21_0;
                      stackIn_23_1 = stackOut_21_1;
                      stackIn_23_2 = stackOut_21_2;
                      stackIn_23_3 = stackOut_21_3;
                      break L23;
                    }
                  }
                  var9 = new je(stackIn_23_2, stackIn_23_3, 2 + ((ee) this).field_r);
                  var9.field_p = true;
                  param5.field_B.a(3, (ck) (Object) var9);
                  break L20;
                }
              }
              if (param5.field_Tb < 1) {
                if (Math.abs(param0) < 60000) {
                  var9 = new je(0, param5.field_Xb[0], (param5.field_hc + param1.field_hc + ((ee) this).field_r) % 100 + (4 + ((ee) this).field_r));
                  var9.field_y = param1.field_Gb;
                  var9.field_u = param1.field_hc;
                  var10 = Math.atan2((double)param0, (double)(-param3));
                  var9.field_p = true;
                  var9.field_B = (int)(var10 * 65536.0 / 6.283185307179586);
                  param5.field_B.a(3, (ck) (Object) var9);
                  break L3;
                } else {
                  break L3;
                }
              } else {
                var9 = new je(5, param1.field_Bb, 4 + (((ee) this).field_r - -((param5.field_hc + (param1.field_hc + ((ee) this).field_r)) % 500)));
                var9.field_p = true;
                param5.field_B.a(3, (ck) (Object) var9);
                break L3;
              }
            }
          }
        }
    }

    final static void c(int param0, int param1) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (qj.field_q == null) {
                break L1;
              } else {
                if (qj.field_q[param1] == null) {
                  break L1;
                } else {
                  pc discarded$4 = fl.a((byte) 28, qj.field_q[param1], cm.field_e[param1]);
                  break L1;
                }
              }
            }
            L2: {
              if (param0 == -2483) {
                break L2;
              } else {
                String discarded$5 = ee.a((String) null, (String) null, (String) null, -92);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var2, "ee.FA(" + param0 + 44 + param1 + 41);
        }
    }

    final static boolean b() {
        RuntimeException var1 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        try {
          L0: {
            int discarded$2 = -21;
            int discarded$3 = 0;
            stackOut_3_0 = na.a(wl.d());
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var1, "ee.KA(" + 88 + 41);
        }
        return stackIn_4_0;
    }

    private final int[] a(int param0, byte param1, int param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        double var7_double = 0.0;
        int var9_int = 0;
        double var9 = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int[] stackIn_16_0 = null;
        int[] stackIn_60_0 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_15_0 = null;
        int[] stackOut_59_0 = null;
        var20 = SteelSentinels.field_G;
        try {
          L0: {
            if (0 == param3) {
              L1: {
                var7_double = Math.atan2((double)param2, (double)(-param5));
                var9_int = (int)(65536.0 * var7_double / 6.283185307179586);
                if (0 <= param0) {
                  if (var9_int >= -16384) {
                    break L1;
                  } else {
                    var9_int = var9_int + 65536;
                    break L1;
                  }
                } else {
                  if (var9_int > 16384) {
                    var9_int = var9_int - 65536;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              stackOut_15_0 = new int[]{var9_int, var9_int};
              stackIn_16_0 = stackOut_15_0;
              return stackIn_16_0;
            } else {
              var7_double = 0.0;
              var9 = 0.0;
              var11 = (double)param2 * ((double)param2 * ((double)(param3 << 3) * 0.5)) / (double)(param4 * param4) - (double)param5;
              var13 = (double)param2;
              L2: {
                var15 = (double)param2 * ((double)param2 * ((double)(param3 << 3) * 0.5)) / (double)(param4 * param4);
                if (var13 * var13 - var15 * (4.0 * var11) <= 0.0) {
                  break L2;
                } else {
                  L3: {
                    if (0.0 != var11) {
                      break L3;
                    } else {
                      if (param4 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var7_double = Math.atan2(Math.sqrt(-(4.0 * var11 * var15) + var13 * var13) + -var13, 2.0 * var11);
                  var9 = Math.atan2(-Math.sqrt(var13 * var13 - var15 * (var11 * 4.0)) + -var13, 2.0 * var11);
                  break L2;
                }
              }
              L4: {
                var17 = 0;
                var18 = 0;
                var17 = (int)(var7_double * 65536.0 / 6.283185307179586);
                if (var17 == 0) {
                  break L4;
                } else {
                  var17 = var17 + (16 * (((ee) this).field_r & 31) - 256);
                  break L4;
                }
              }
              L5: {
                var18 = (int)(var9 * 65536.0 / 6.283185307179586);
                if (var17 >= -32768) {
                  break L5;
                } else {
                  var17 = var17 + 65536;
                  break L5;
                }
              }
              L6: {
                if (var18 == 0) {
                  break L6;
                } else {
                  var18 = var18 + (-256 + (31 & ((ee) this).field_r) * 16);
                  break L6;
                }
              }
              L7: {
                if (var18 >= -32768) {
                  break L7;
                } else {
                  var18 = var18 + 65536;
                  break L7;
                }
              }
              L8: {
                if (32768 < var17) {
                  var17 = var17 - 65536;
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                if (var18 <= 32768) {
                  break L9;
                } else {
                  var18 = var18 - 65536;
                  break L9;
                }
              }
              L10: {
                if (0 > param0) {
                  L11: {
                    if (0 >= var18) {
                      break L11;
                    } else {
                      var18 = -var18;
                      break L11;
                    }
                  }
                  if (0 >= var17) {
                    break L10;
                  } else {
                    var17 = -var17;
                    break L10;
                  }
                } else {
                  L12: {
                    if (var18 >= 0) {
                      break L12;
                    } else {
                      var18 = -var18;
                      break L12;
                    }
                  }
                  if (var17 < 0) {
                    var17 = -var17;
                    break L10;
                  } else {
                    break L10;
                  }
                }
              }
              L13: {
                if (var17 * param0 <= var18 * param0) {
                  break L13;
                } else {
                  var19 = var18;
                  var18 = var17;
                  var17 = var19;
                  break L13;
                }
              }
              stackOut_59_0 = new int[]{var17, var18};
              stackIn_60_0 = stackOut_59_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var7, "ee.R(" + param0 + 44 + -88 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
        return stackIn_60_0;
    }

    private final void a(int param0, mb param1, int param2, mb param3, int param4) {
        RuntimeException var7 = null;
        je var7_ref = null;
        double var8 = 0.0;
        int var10 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        var10 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (null != param1.field_Vb) {
                break L1;
              } else {
                if (0 < param1.field_Tb) {
                  var7_ref = new je(5, param3.field_Bb, 1 + ((ee) this).field_r);
                  var7_ref.field_p = true;
                  param1.field_B.a(3, (ck) (Object) var7_ref);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                if (param1.field_Lb) {
                  break L3;
                } else {
                  if (param1.field_Tb < 5) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              if (param1.field_Tb < 1) {
                break L2;
              } else {
                if (Math.abs(param2) > 50000) {
                  L4: {
                    var7_ref = new je(3, 0, 4 + (((ee) this).field_r + ((param3.field_hc + ((ee) this).field_r + param1.field_hc) % 100 + 50)));
                    var7_ref.field_u = param3.field_hc;
                    if (var7_ref.field_u > param1.field_hc + 10000) {
                      var7_ref.field_u = param1.field_hc + 10000;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    var7_ref.field_p = true;
                    var7_ref.field_y = -20000 + param1.field_Gb;
                    if (~(param1.field_hc - 10000) < ~var7_ref.field_u) {
                      var7_ref.field_u = param1.field_hc + -10000;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  param1.field_B.a(3, (ck) (Object) var7_ref);
                  break L2;
                } else {
                  var7_ref = new je(3, 0, 5 + ((param1.field_hc + (((ee) this).field_r - -param3.field_hc)) % 100 + ((ee) this).field_r + 4));
                  var7_ref.field_y = -20000 + param1.field_Gb;
                  var7_ref.field_u = -(param4 * 20000) + param1.field_hc;
                  var7_ref.field_p = true;
                  param1.field_B.a(3, (ck) (Object) var7_ref);
                  break L2;
                }
              }
            }
            L6: {
              L7: {
                L8: {
                  if (Math.abs(param2) > 50000) {
                    break L8;
                  } else {
                    if (Math.abs(param0) <= 30000) {
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
                if (param1.field_Tb >= 1) {
                  L9: {
                    var7_ref = new je(0, 8, 60 + (param3.field_hc + ((ee) this).field_r + param1.field_hc) % 100 + ((ee) this).field_r + 4);
                    var7_ref.field_y = param3.field_Gb;
                    var7_ref.field_u = param3.field_hc;
                    var8 = Math.atan2((double)param2, (double)(-param0));
                    var7_ref.field_B = (int)(var8 * 65536.0 / 6.283185307179586);
                    if (param4 >= 0) {
                      if (-16384 > var7_ref.field_B) {
                        var7_ref.field_B = var7_ref.field_B + 65536;
                        break L9;
                      } else {
                        break L9;
                      }
                    } else {
                      if (16384 < var7_ref.field_B) {
                        var7_ref.field_B = var7_ref.field_B - 65536;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                  }
                  var7_ref.field_p = true;
                  param1.field_B.a(3, (ck) (Object) var7_ref);
                  var7_ref = new je(3, 0, 5 + (4 + ((ee) this).field_r) + (param1.field_hc + (param3.field_hc + ((ee) this).field_r)) % 100);
                  var7_ref.field_y = param1.field_Gb - 20000;
                  var7_ref.field_u = 5000 * param4 + param1.field_hc;
                  var7_ref.field_p = true;
                  param1.field_Ec.a(3, (ck) (Object) var7_ref);
                  break L6;
                } else {
                  break L7;
                }
              }
              if (param1.i(30, -27)) {
                break L6;
              } else {
                L10: {
                  var7_ref = new je(0, 0, 4 + (((ee) this).field_r + (param3.field_hc + ((ee) this).field_r - -param1.field_hc) % 100 + 60));
                  var7_ref.field_y = param3.field_Gb;
                  var7_ref.field_u = param3.field_hc;
                  var8 = Math.atan2((double)param2, (double)(-param0));
                  var7_ref.field_B = (int)(var8 * 65536.0 / 6.283185307179586);
                  if (0 <= param4) {
                    if (var7_ref.field_B < -16384) {
                      var7_ref.field_B = var7_ref.field_B + 65536;
                      break L10;
                    } else {
                      break L10;
                    }
                  } else {
                    if (var7_ref.field_B <= 16384) {
                      break L10;
                    } else {
                      var7_ref.field_B = var7_ref.field_B - 65536;
                      break L10;
                    }
                  }
                }
                var7_ref.field_p = true;
                param1.field_B.a(3, (ck) (Object) var7_ref);
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var7 = decompiledCaughtException;
            stackOut_70_0 = (RuntimeException) var7;
            stackOut_70_1 = new StringBuilder().append("ee.UA(").append(param0).append(44);
            stackIn_73_0 = stackOut_70_0;
            stackIn_73_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param1 == null) {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L11;
            } else {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "{...}";
              stackIn_74_0 = stackOut_71_0;
              stackIn_74_1 = stackOut_71_1;
              stackIn_74_2 = stackOut_71_2;
              break L11;
            }
          }
          L12: {
            stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
            stackOut_74_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_74_2).append(44).append(param2).append(44);
            stackIn_77_0 = stackOut_74_0;
            stackIn_77_1 = stackOut_74_1;
            stackIn_75_0 = stackOut_74_0;
            stackIn_75_1 = stackOut_74_1;
            if (param3 == null) {
              stackOut_77_0 = (RuntimeException) (Object) stackIn_77_0;
              stackOut_77_1 = (StringBuilder) (Object) stackIn_77_1;
              stackOut_77_2 = "null";
              stackIn_78_0 = stackOut_77_0;
              stackIn_78_1 = stackOut_77_1;
              stackIn_78_2 = stackOut_77_2;
              break L12;
            } else {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "{...}";
              stackIn_78_0 = stackOut_75_0;
              stackIn_78_1 = stackOut_75_1;
              stackIn_78_2 = stackOut_75_2;
              break L12;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_78_0, stackIn_78_2 + 44 + param4 + 44 + 14432 + 41);
        }
    }

    private final boolean b(boolean param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              if (((ee) this).field_ab.b((byte) 125, param1) == ((ee) this).field_ab.a((byte) -100, param1)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                stackOut_4_0 = 1;
                stackIn_7_0 = stackOut_4_0;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var3, "ee.VA(" + 1 + 44 + param1 + 41);
        }
        return stackIn_7_0 != 0;
    }

    private final boolean a(int param0, byte param1, int param2, mb param3, mb param4, int param5, int param6) {
        RuntimeException var8 = null;
        je var8_ref = null;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        long[] var12 = null;
        int var13 = 0;
        int var14 = 0;
        nk var15 = null;
        int var16 = 0;
        int var17 = 0;
        long var18 = 0L;
        bh var20 = null;
        int var21 = 0;
        int var22 = 0;
        wl var23 = null;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int stackIn_17_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_128_0 = 0;
        int stackIn_157_0 = 0;
        int stackIn_159_0 = 0;
        RuntimeException stackIn_161_0 = null;
        StringBuilder stackIn_161_1 = null;
        RuntimeException stackIn_163_0 = null;
        StringBuilder stackIn_163_1 = null;
        RuntimeException stackIn_164_0 = null;
        StringBuilder stackIn_164_1 = null;
        String stackIn_164_2 = null;
        RuntimeException stackIn_165_0 = null;
        StringBuilder stackIn_165_1 = null;
        RuntimeException stackIn_167_0 = null;
        StringBuilder stackIn_167_1 = null;
        RuntimeException stackIn_168_0 = null;
        StringBuilder stackIn_168_1 = null;
        String stackIn_168_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_86_0 = 0;
        int stackOut_84_0 = 0;
        int stackOut_127_0 = 0;
        int stackOut_156_0 = 0;
        int stackOut_158_0 = 0;
        RuntimeException stackOut_160_0 = null;
        StringBuilder stackOut_160_1 = null;
        RuntimeException stackOut_163_0 = null;
        StringBuilder stackOut_163_1 = null;
        String stackOut_163_2 = null;
        RuntimeException stackOut_161_0 = null;
        StringBuilder stackOut_161_1 = null;
        String stackOut_161_2 = null;
        RuntimeException stackOut_164_0 = null;
        StringBuilder stackOut_164_1 = null;
        RuntimeException stackOut_167_0 = null;
        StringBuilder stackOut_167_1 = null;
        String stackOut_167_2 = null;
        RuntimeException stackOut_165_0 = null;
        StringBuilder stackOut_165_1 = null;
        String stackOut_165_2 = null;
        var30 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              L2: {
                if (11 == param3.field_Nb) {
                  break L2;
                } else {
                  if (di.field_g != 10) {
                    break L1;
                  } else {
                    if (ge.field_j != 1) {
                      break L1;
                    } else {
                      if (ol.field_Ub > 2) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              if (0 < param3.field_Mb[param2]) {
                stackOut_16_0 = 0;
                stackIn_17_0 = stackOut_16_0;
                return stackIn_17_0 != 0;
              } else {
                break L1;
              }
            }
            L3: {
              var8_ref = new je(0, param3.field_Xb[param2], param6);
              var8_ref.field_y = param4.field_Gb;
              var8_ref.field_u = param4.field_hc;
              if (~param4.field_hc >= ~param3.field_hc) {
                stackOut_21_0 = -1;
                stackIn_22_0 = stackOut_21_0;
                break L3;
              } else {
                stackOut_19_0 = 1;
                stackIn_22_0 = stackOut_19_0;
                break L3;
              }
            }
            L4: {
              L5: {
                var9 = stackIn_22_0;
                if (param3.field_u) {
                  break L5;
                } else {
                  if (!param4.field_u) {
                    stackOut_28_0 = 0;
                    stackIn_29_0 = stackOut_28_0;
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              stackOut_26_0 = 1;
              stackIn_29_0 = stackOut_26_0;
              break L4;
            }
            L6: {
              var10 = stackIn_29_0;
              if ((param3.field_Bb & 1) * 256 + (256 & ((ee) this).field_r - -(15 * param3.field_Bb)) != 0) {
                break L6;
              } else {
                L7: {
                  if (var10 != 0) {
                    stackOut_35_0 = 0;
                    stackIn_36_0 = stackOut_35_0;
                    break L7;
                  } else {
                    stackOut_33_0 = 1;
                    stackIn_36_0 = stackOut_33_0;
                    break L7;
                  }
                }
                var10 = stackIn_36_0;
                break L6;
              }
            }
            L8: {
              var11 = this.a(var9, (byte) -88, param4.field_hc + -param3.field_hc, param0, param5, -param3.field_Gb + param4.field_Gb);
              if (param3.field_Xb[param2] != 6) {
                break L8;
              } else {
                var10 = 1;
                break L8;
              }
            }
            L9: {
              L10: {
                var12 = new long[]{0L, 0L};
                var13 = 0;
                var14 = param3.field_gb.length;
                if (!param3.field_Lb) {
                  break L10;
                } else {
                  if (!param3.i(31, -27)) {
                    stackOut_45_0 = 0;
                    stackIn_46_0 = stackOut_45_0;
                    break L9;
                  } else {
                    break L10;
                  }
                }
              }
              stackOut_43_0 = 1;
              stackIn_46_0 = stackOut_43_0;
              break L9;
            }
            var16 = stackIn_46_0;
            var17 = 0;
            L11: while (true) {
              if (~var14 >= ~var17) {
                L12: {
                  if (var10 != 0) {
                    stackOut_86_0 = 1;
                    stackIn_87_0 = stackOut_86_0;
                    break L12;
                  } else {
                    stackOut_84_0 = 0;
                    stackIn_87_0 = stackOut_84_0;
                    break L12;
                  }
                }
                L13: {
                  var17 = stackIn_87_0;
                  var18 = var12[var17];
                  if (param1 < -16) {
                    break L13;
                  } else {
                    ((ee) this).field_J = null;
                    break L13;
                  }
                }
                L14: {
                  L15: {
                    var8_ref.field_B = var11[var17];
                    if (var18 == 0L) {
                      break L15;
                    } else {
                      if (var8_ref.field_B == 0) {
                        break L15;
                      } else {
                        break L14;
                      }
                    }
                  }
                  var17 = -var17 + 1;
                  var8_ref.field_B = var11[var17];
                  var18 = var12[var17];
                  break L14;
                }
                L16: {
                  if (var18 == 0L) {
                    break L16;
                  } else {
                    if (var8_ref.field_B != 0) {
                      L17: {
                        var20 = new bh(param3);
                        var20.field_b = var9;
                        var21 = param3.field_hc;
                        var22 = -(param3.field_Db << 3) + param3.field_Gb;
                        var23 = var20.a(var13, (byte) 121, var8_ref.field_u, var8_ref.field_B, var22, var21, var8_ref.field_y);
                        var23.field_I = true;
                        if (null == var23) {
                          break L17;
                        } else {
                          var24 = 0;
                          var25 = 0;
                          var28 = 0;
                          var29 = 0;
                          L18: while (true) {
                            L19: {
                              if (var29 >= 50) {
                                break L19;
                              } else {
                                if (var23.field_T) {
                                  break L19;
                                } else {
                                  L20: {
                                    var23.i(-1);
                                    var26 = Math.abs(var23.field_U - param4.field_hc) >> 4;
                                    var27 = Math.abs(var23.field_A - param4.field_Gb) >> 4;
                                    var24 = var27 * var27 + var26 * var26;
                                    var26 = Math.abs(-var20.field_g + var23.field_U) >> 4;
                                    if (var24 < 0) {
                                      var24 = 2147483647;
                                      break L20;
                                    } else {
                                      break L20;
                                    }
                                  }
                                  L21: {
                                    var27 = Math.abs(-var20.field_q + var23.field_A) >> 4;
                                    var25 = var26 * var26 + var27 * var27;
                                    if (var25 < 0) {
                                      break L21;
                                    } else {
                                      if (var24 >= var25) {
                                        var29++;
                                        continue L18;
                                      } else {
                                        break L21;
                                      }
                                    }
                                  }
                                  var28 = 1;
                                  break L19;
                                }
                              }
                            }
                            if (var28 != 0) {
                              break L17;
                            } else {
                              if (var29 < 50) {
                                stackOut_127_0 = 0;
                                stackIn_128_0 = stackOut_127_0;
                                return stackIn_128_0 != 0;
                              } else {
                                break L17;
                              }
                            }
                          }
                        }
                      }
                      if (var18 > 0L) {
                        L22: {
                          if (param3.field_Xb[param2] == 13) {
                            break L22;
                          } else {
                            if (11 == param3.field_Xb[param2]) {
                              break L22;
                            } else {
                              if (param3.field_Xb[param2] == 12) {
                                break L22;
                              } else {
                                if (param3.field_Xb[param2] == 15) {
                                  break L22;
                                } else {
                                  if (param3.field_Xb[param2] == 17) {
                                    break L22;
                                  } else {
                                    if (18 == param3.field_Xb[param2]) {
                                      break L22;
                                    } else {
                                      if (14 == param3.field_Xb[param2]) {
                                        break L22;
                                      } else {
                                        if (param3.field_Xb[param2] == 16) {
                                          break L22;
                                        } else {
                                          param3.field_Mb[param2] = param3.field_Mb[param2] + (-var8_ref.field_x + var8_ref.field_r);
                                          break L22;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        var8_ref.field_p = true;
                        param3.field_B.a(3, (ck) (Object) var8_ref);
                        stackOut_156_0 = 1;
                        stackIn_157_0 = stackOut_156_0;
                        return stackIn_157_0 != 0;
                      } else {
                        break L16;
                      }
                    } else {
                      break L16;
                    }
                  }
                }
                stackOut_158_0 = 0;
                stackIn_159_0 = stackOut_158_0;
                break L0;
              } else {
                L23: {
                  var15 = param3.field_gb[var17];
                  if (~ja.a(var15.field_N, false) != ~var8_ref.field_A) {
                    break L23;
                  } else {
                    if (var15.field_C <= 0) {
                      L24: {
                        if (~Math.abs(var11[0]) > ~var15.field_K) {
                          break L24;
                        } else {
                          if (Math.abs(var11[0]) > var15.field_W) {
                            break L24;
                          } else {
                            L25: {
                              if (var16 != 0) {
                                break L25;
                              } else {
                                if (!bi.b(105, var15.field_N)) {
                                  break L25;
                                } else {
                                  break L24;
                                }
                              }
                            }
                            var12[0] = mc.a(var12[0], 1L << var17);
                            break L24;
                          }
                        }
                      }
                      L26: {
                        if (~Math.abs(var11[1]) > ~var15.field_K) {
                          break L26;
                        } else {
                          if (~Math.abs(var11[1]) < ~var15.field_W) {
                            break L26;
                          } else {
                            L27: {
                              if (var16 != 0) {
                                break L27;
                              } else {
                                if (bi.b(-75, var15.field_N)) {
                                  break L26;
                                } else {
                                  break L27;
                                }
                              }
                            }
                            var12[1] = mc.a(var12[1], 1L << var17);
                            break L26;
                          }
                        }
                      }
                      var13 = var15.field_N;
                      break L23;
                    } else {
                      break L23;
                    }
                  }
                }
                var17++;
                continue L11;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L28: {
            var8 = decompiledCaughtException;
            stackOut_160_0 = (RuntimeException) var8;
            stackOut_160_1 = new StringBuilder().append("ee.W(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_163_0 = stackOut_160_0;
            stackIn_163_1 = stackOut_160_1;
            stackIn_161_0 = stackOut_160_0;
            stackIn_161_1 = stackOut_160_1;
            if (param3 == null) {
              stackOut_163_0 = (RuntimeException) (Object) stackIn_163_0;
              stackOut_163_1 = (StringBuilder) (Object) stackIn_163_1;
              stackOut_163_2 = "null";
              stackIn_164_0 = stackOut_163_0;
              stackIn_164_1 = stackOut_163_1;
              stackIn_164_2 = stackOut_163_2;
              break L28;
            } else {
              stackOut_161_0 = (RuntimeException) (Object) stackIn_161_0;
              stackOut_161_1 = (StringBuilder) (Object) stackIn_161_1;
              stackOut_161_2 = "{...}";
              stackIn_164_0 = stackOut_161_0;
              stackIn_164_1 = stackOut_161_1;
              stackIn_164_2 = stackOut_161_2;
              break L28;
            }
          }
          L29: {
            stackOut_164_0 = (RuntimeException) (Object) stackIn_164_0;
            stackOut_164_1 = ((StringBuilder) (Object) stackIn_164_1).append(stackIn_164_2).append(44);
            stackIn_167_0 = stackOut_164_0;
            stackIn_167_1 = stackOut_164_1;
            stackIn_165_0 = stackOut_164_0;
            stackIn_165_1 = stackOut_164_1;
            if (param4 == null) {
              stackOut_167_0 = (RuntimeException) (Object) stackIn_167_0;
              stackOut_167_1 = (StringBuilder) (Object) stackIn_167_1;
              stackOut_167_2 = "null";
              stackIn_168_0 = stackOut_167_0;
              stackIn_168_1 = stackOut_167_1;
              stackIn_168_2 = stackOut_167_2;
              break L29;
            } else {
              stackOut_165_0 = (RuntimeException) (Object) stackIn_165_0;
              stackOut_165_1 = (StringBuilder) (Object) stackIn_165_1;
              stackOut_165_2 = "{...}";
              stackIn_168_0 = stackOut_165_0;
              stackIn_168_1 = stackOut_165_1;
              stackIn_168_2 = stackOut_165_2;
              break L29;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_168_0, stackIn_168_2 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_159_0 != 0;
    }

    private final void a(int[] param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (0 != ((ee) this).field_kb) {
              ((ee) this).field_j = true;
              if (param1 <= -106) {
                L1: {
                  ((ee) this).field_E = param0;
                  if (0 > ((ee) this).field_A) {
                    break L1;
                  } else {
                    int discarded$3 = -22017;
                    this.i();
                    break L1;
                  }
                }
                break L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) runtimeException;
            stackOut_7_1 = new StringBuilder().append("ee.PA(");
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 41);
        }
    }

    final String d(int param0, int param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        String stackIn_8_0 = null;
        String stackIn_11_0 = null;
        String stackIn_13_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_12_0 = null;
        String stackOut_10_0 = null;
        String stackOut_7_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            if (0 <= param1) {
              if (param0 == -1661904765) {
                if (~param1 <= ~((ee) this).field_kb) {
                  if (~((ee) this).field_Q >= ~(param1 + -((ee) this).field_kb)) {
                    stackOut_12_0 = dc.field_a;
                    stackIn_13_0 = stackOut_12_0;
                    break L0;
                  } else {
                    stackOut_10_0 = re.field_W + (-((ee) this).field_kb + param1 + 1);
                    stackIn_11_0 = stackOut_10_0;
                    return stackIn_11_0;
                  }
                } else {
                  stackOut_7_0 = ((ee) this).field_bb[param1];
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                }
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return (String) (Object) stackIn_5_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (String) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var3, "ee.B(" + param0 + 44 + param1 + 41);
        }
        return stackIn_13_0;
    }

    private final void a(byte param0, int param1, mb param2, int param3, mb param4, int param5) {
        RuntimeException var7 = null;
        je var7_ref = null;
        int var8 = 0;
        int stackIn_34_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        je stackIn_44_0 = null;
        je stackIn_44_1 = null;
        int stackIn_44_2 = 0;
        je stackIn_46_0 = null;
        je stackIn_46_1 = null;
        int stackIn_46_2 = 0;
        je stackIn_48_0 = null;
        je stackIn_48_1 = null;
        int stackIn_48_2 = 0;
        je stackIn_49_0 = null;
        je stackIn_49_1 = null;
        int stackIn_49_2 = 0;
        int stackIn_49_3 = 0;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        je stackOut_43_0 = null;
        je stackOut_43_1 = null;
        int stackOut_43_2 = 0;
        je stackOut_48_0 = null;
        je stackOut_48_1 = null;
        int stackOut_48_2 = 0;
        int stackOut_48_3 = 0;
        je stackOut_44_0 = null;
        je stackOut_44_1 = null;
        int stackOut_44_2 = 0;
        je stackOut_46_0 = null;
        je stackOut_46_1 = null;
        int stackOut_46_2 = 0;
        int stackOut_46_3 = 0;
        int stackOut_33_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        String stackOut_78_2 = null;
        var8 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param4.field_t > 0) {
                L2: {
                  stackOut_43_0 = null;
                  stackOut_43_1 = null;
                  stackOut_43_2 = 6;
                  stackIn_48_0 = stackOut_43_0;
                  stackIn_48_1 = stackOut_43_1;
                  stackIn_48_2 = stackOut_43_2;
                  stackIn_44_0 = stackOut_43_0;
                  stackIn_44_1 = stackOut_43_1;
                  stackIn_44_2 = stackOut_43_2;
                  if (~param4.field_t < ~(param4.field_hc >> 4)) {
                    stackOut_48_0 = null;
                    stackOut_48_1 = null;
                    stackOut_48_2 = stackIn_48_2;
                    stackOut_48_3 = 1;
                    stackIn_49_0 = stackOut_48_0;
                    stackIn_49_1 = stackOut_48_1;
                    stackIn_49_2 = stackOut_48_2;
                    stackIn_49_3 = stackOut_48_3;
                    break L2;
                  } else {
                    stackOut_44_0 = null;
                    stackOut_44_1 = null;
                    stackOut_44_2 = stackIn_44_2;
                    stackIn_46_0 = stackOut_44_0;
                    stackIn_46_1 = stackOut_44_1;
                    stackIn_46_2 = stackOut_44_2;
                    stackOut_46_0 = null;
                    stackOut_46_1 = null;
                    stackOut_46_2 = stackIn_46_2;
                    stackOut_46_3 = -1;
                    stackIn_49_0 = stackOut_46_0;
                    stackIn_49_1 = stackOut_46_1;
                    stackIn_49_2 = stackOut_46_2;
                    stackIn_49_3 = stackOut_46_3;
                    break L2;
                  }
                }
                var7_ref = new je(stackIn_49_2, stackIn_49_3, 2 + ((ee) this).field_r);
                var7_ref.field_p = true;
                param4.field_B.a(3, (ck) (Object) var7_ref);
                break L1;
              } else {
                L3: {
                  if (40000 > Math.abs(param3)) {
                    break L3;
                  } else {
                    if (Math.abs(param3) >= 50000) {
                      break L3;
                    } else {
                      if (param4.field_Tb > 0) {
                        var7_ref = new je(3, 0, ((ee) this).field_r - -15);
                        var7_ref.field_p = true;
                        var7_ref.field_y = param4.field_Gb + -20000;
                        var7_ref.field_u = -(20000 * param5) + param4.field_hc;
                        param4.field_B.a(3, (ck) (Object) var7_ref);
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                L4: {
                  if (Math.abs(param3) < 10000) {
                    break L4;
                  } else {
                    L5: {
                      if (!param2.field_Lb) {
                        break L5;
                      } else {
                        if (Math.abs(param3) >= 40000) {
                          break L5;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var7_ref = new je(6, param5, 2 + ((ee) this).field_r);
                    var7_ref.field_p = true;
                    param4.field_B.a(3, (ck) (Object) var7_ref);
                    break L1;
                  }
                }
                if (10000 <= Math.abs(param3)) {
                  break L1;
                } else {
                  if (param2.field_Lb) {
                    break L1;
                  } else {
                    L6: {
                      if (param2.field_u) {
                        stackOut_33_0 = 0;
                        stackIn_34_0 = stackOut_33_0;
                        break L6;
                      } else {
                        stackOut_31_0 = 1;
                        stackIn_34_0 = stackOut_31_0;
                        break L6;
                      }
                    }
                    L7: {
                      stackOut_34_0 = stackIn_34_0;
                      stackIn_37_0 = stackOut_34_0;
                      stackIn_35_0 = stackOut_34_0;
                      if (param4.field_u) {
                        stackOut_37_0 = stackIn_37_0;
                        stackOut_37_1 = 0;
                        stackIn_38_0 = stackOut_37_0;
                        stackIn_38_1 = stackOut_37_1;
                        break L7;
                      } else {
                        stackOut_35_0 = stackIn_35_0;
                        stackOut_35_1 = 1;
                        stackIn_38_0 = stackOut_35_0;
                        stackIn_38_1 = stackOut_35_1;
                        break L7;
                      }
                    }
                    if (stackIn_38_0 != stackIn_38_1) {
                      break L1;
                    } else {
                      param4.field_Tb = param4.field_Tb + 2;
                      var7_ref = new je(6, param5, ((ee) this).field_r + 2);
                      var7_ref.field_p = true;
                      param4.field_B.a(3, (ck) (Object) var7_ref);
                      var7_ref = new je(7, param5, ((ee) this).field_r - -4);
                      var7_ref.field_p = true;
                      param4.field_B.a(3, (ck) (Object) var7_ref);
                      var7_ref = new je(6, param5, 25 + (((ee) this).field_r - -4));
                      var7_ref.field_p = true;
                      param4.field_B.a(3, (ck) (Object) var7_ref);
                      return;
                    }
                  }
                }
              }
            }
            L8: {
              if (this.a(((ee) this).field_z, (byte) -73, 3, param4, param2, 2600, ((ee) this).field_r + 15)) {
                break L8;
              } else {
                L9: {
                  if (param4.field_Tb <= 0) {
                    break L9;
                  } else {
                    if (param2.field_S > 50) {
                      if (this.a(((ee) this).field_z * 4, (byte) -63, 2, param4, param2, 8448, 25 + ((ee) this).field_r)) {
                        break L8;
                      } else {
                        if (!this.a(((ee) this).field_z, (byte) -114, 1, param4, param2, 3072, 50 + ((ee) this).field_r)) {
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                    } else {
                      break L9;
                    }
                  }
                }
                if (this.a(((ee) this).field_z, (byte) -57, 1, param4, param2, 3072, 50 + ((ee) this).field_r)) {
                  break L8;
                } else {
                  if (param4.field_Tb > 0) {
                    if (!this.a(((ee) this).field_z, (byte) -24, 2, param4, param2, 8448, 25 + ((ee) this).field_r)) {
                      break L8;
                    } else {
                      break L8;
                    }
                  } else {
                    break L8;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var7 = decompiledCaughtException;
            stackOut_73_0 = (RuntimeException) var7;
            stackOut_73_1 = new StringBuilder().append("ee.G(").append(-121).append(44).append(param1).append(44);
            stackIn_76_0 = stackOut_73_0;
            stackIn_76_1 = stackOut_73_1;
            stackIn_74_0 = stackOut_73_0;
            stackIn_74_1 = stackOut_73_1;
            if (param2 == null) {
              stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
              stackOut_76_1 = (StringBuilder) (Object) stackIn_76_1;
              stackOut_76_2 = "null";
              stackIn_77_0 = stackOut_76_0;
              stackIn_77_1 = stackOut_76_1;
              stackIn_77_2 = stackOut_76_2;
              break L10;
            } else {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "{...}";
              stackIn_77_0 = stackOut_74_0;
              stackIn_77_1 = stackOut_74_1;
              stackIn_77_2 = stackOut_74_2;
              break L10;
            }
          }
          L11: {
            stackOut_77_0 = (RuntimeException) (Object) stackIn_77_0;
            stackOut_77_1 = ((StringBuilder) (Object) stackIn_77_1).append(stackIn_77_2).append(44).append(param3).append(44);
            stackIn_80_0 = stackOut_77_0;
            stackIn_80_1 = stackOut_77_1;
            stackIn_78_0 = stackOut_77_0;
            stackIn_78_1 = stackOut_77_1;
            if (param4 == null) {
              stackOut_80_0 = (RuntimeException) (Object) stackIn_80_0;
              stackOut_80_1 = (StringBuilder) (Object) stackIn_80_1;
              stackOut_80_2 = "null";
              stackIn_81_0 = stackOut_80_0;
              stackIn_81_1 = stackOut_80_1;
              stackIn_81_2 = stackOut_80_2;
              break L11;
            } else {
              stackOut_78_0 = (RuntimeException) (Object) stackIn_78_0;
              stackOut_78_1 = (StringBuilder) (Object) stackIn_78_1;
              stackOut_78_2 = "{...}";
              stackIn_81_0 = stackOut_78_0;
              stackIn_81_1 = stackOut_78_1;
              stackIn_81_2 = stackOut_78_2;
              break L11;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_81_0, stackIn_81_2 + 44 + param5 + 41);
        }
    }

    final mb f(int param0, int param1) {
        jc var3 = null;
        RuntimeException var3_ref = null;
        mb var4 = null;
        int var5 = 0;
        mb stackIn_10_0 = null;
        Object stackIn_13_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_12_0 = null;
        mb stackOut_9_0 = null;
        var5 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param1 < -126) {
                break L1;
              } else {
                boolean discarded$2 = this.a(-73, false);
                break L1;
              }
            }
            var3 = new jc(((ee) this).field_K);
            var4 = (mb) (Object) var3.b(2);
            L2: while (true) {
              if (var4 == null) {
                stackOut_12_0 = null;
                stackIn_13_0 = stackOut_12_0;
                break L0;
              } else {
                if (~var4.field_Bb == ~param0) {
                  stackOut_9_0 = (mb) var4;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                } else {
                  var4 = (mb) (Object) var3.d(2);
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var3_ref, "ee.HA(" + param0 + 44 + param1 + 41);
        }
        return (mb) (Object) stackIn_13_0;
    }

    final static String a(String param0, String param1, String param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = SteelSentinels.field_G;
        var4_int = -125 % ((param3 - 51) / 32);
        var5 = param1.indexOf(param0);
        L0: while (true) {
          if (var5 == -1) {
            return param1;
          } else {
            param1 = param1.substring(0, var5) + param2 + param1.substring(param0.length() + var5);
            var5 = param1.indexOf(param0, var5 + param2.length());
            continue L0;
          }
        }
    }

    private final void a(mb param0, int param1, int param2, mb param3, int param4, int param5) {
        RuntimeException var7 = null;
        je var7_ref = null;
        int var8 = 0;
        double var8_double = 0.0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        je stackIn_6_0 = null;
        je stackIn_6_1 = null;
        int stackIn_6_2 = 0;
        je stackIn_8_0 = null;
        je stackIn_8_1 = null;
        int stackIn_8_2 = 0;
        je stackIn_10_0 = null;
        je stackIn_10_1 = null;
        int stackIn_10_2 = 0;
        je stackIn_11_0 = null;
        je stackIn_11_1 = null;
        int stackIn_11_2 = 0;
        int stackIn_11_3 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        je stackOut_5_0 = null;
        je stackOut_5_1 = null;
        int stackOut_5_2 = 0;
        je stackOut_10_0 = null;
        je stackOut_10_1 = null;
        int stackOut_10_2 = 0;
        int stackOut_10_3 = 0;
        je stackOut_6_0 = null;
        je stackOut_6_1 = null;
        int stackOut_6_2 = 0;
        je stackOut_8_0 = null;
        je stackOut_8_1 = null;
        int stackOut_8_2 = 0;
        int stackOut_8_3 = 0;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        var12 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param0.field_t <= 0) {
                if (Math.abs(param5) <= 80000) {
                  if (Math.abs(param5) < 30000) {
                    var7_ref = new je(6, -param1, 2 + ((ee) this).field_r);
                    var7_ref.field_p = true;
                    param0.field_B.a(3, (ck) (Object) var7_ref);
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  var7_ref = new je(6, param1, 2 + ((ee) this).field_r);
                  var7_ref.field_p = true;
                  param0.field_B.a(3, (ck) (Object) var7_ref);
                  break L1;
                }
              } else {
                L2: {
                  stackOut_5_0 = null;
                  stackOut_5_1 = null;
                  stackOut_5_2 = 6;
                  stackIn_10_0 = stackOut_5_0;
                  stackIn_10_1 = stackOut_5_1;
                  stackIn_10_2 = stackOut_5_2;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  stackIn_6_2 = stackOut_5_2;
                  if (param0.field_hc >> 4 < param0.field_t) {
                    stackOut_10_0 = null;
                    stackOut_10_1 = null;
                    stackOut_10_2 = stackIn_10_2;
                    stackOut_10_3 = 1;
                    stackIn_11_0 = stackOut_10_0;
                    stackIn_11_1 = stackOut_10_1;
                    stackIn_11_2 = stackOut_10_2;
                    stackIn_11_3 = stackOut_10_3;
                    break L2;
                  } else {
                    stackOut_6_0 = null;
                    stackOut_6_1 = null;
                    stackOut_6_2 = stackIn_6_2;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
                    stackIn_8_2 = stackOut_6_2;
                    stackOut_8_0 = null;
                    stackOut_8_1 = null;
                    stackOut_8_2 = stackIn_8_2;
                    stackOut_8_3 = -1;
                    stackIn_11_0 = stackOut_8_0;
                    stackIn_11_1 = stackOut_8_1;
                    stackIn_11_2 = stackOut_8_2;
                    stackIn_11_3 = stackOut_8_3;
                    break L2;
                  }
                }
                var7_ref = new je(stackIn_11_2, stackIn_11_3, ((ee) this).field_r - -2);
                var7_ref.field_p = true;
                param0.field_B.a(3, (ck) (Object) var7_ref);
                break L1;
              }
            }
            L3: {
              if (60000 > Math.abs(param5)) {
                if (param0.field_Xb[0] == 9) {
                  var7_ref = new je(0, param0.field_Xb[0], ((ee) this).field_r - (-4 - (param3.field_hc + (((ee) this).field_r + param0.field_hc)) % 100));
                  var7_ref.field_u = param3.field_hc;
                  var7_ref.field_y = param3.field_Gb;
                  var8 = 900;
                  var9 = ((ee) this).field_z;
                  var10 = 0;
                  var11 = 10922;
                  int discarded$1 = -1;
                  this.a(param1, param2, param5, var8, var10, var7_ref, var9, var11);
                  var7_ref.field_p = true;
                  param0.field_B.a(3, (ck) (Object) var7_ref);
                  break L3;
                } else {
                  L4: {
                    var7_ref = new je(0, param0.field_Xb[0], (param0.field_hc + (param3.field_hc + ((ee) this).field_r)) % 100 + ((ee) this).field_r + 4);
                    var7_ref.field_y = param3.field_Gb;
                    var7_ref.field_u = param3.field_hc;
                    var8_double = Math.atan2((double)param5, (double)(-param2));
                    var7_ref.field_B = (int)(var8_double * 65536.0 / 6.283185307179586);
                    var7_ref.field_p = true;
                    if (param1 < 0) {
                      if (16384 >= var7_ref.field_B) {
                        break L4;
                      } else {
                        var7_ref.field_B = var7_ref.field_B - 65536;
                        break L4;
                      }
                    } else {
                      if (var7_ref.field_B < -16384) {
                        var7_ref.field_B = var7_ref.field_B + 65536;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  param0.field_B.a(3, (ck) (Object) var7_ref);
                  break L3;
                }
              } else {
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var7 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) var7;
            stackOut_41_1 = new StringBuilder().append("ee.H(");
            stackIn_44_0 = stackOut_41_0;
            stackIn_44_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param0 == null) {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L5;
            } else {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "{...}";
              stackIn_45_0 = stackOut_42_0;
              stackIn_45_1 = stackOut_42_1;
              stackIn_45_2 = stackOut_42_2;
              break L5;
            }
          }
          L6: {
            stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
            stackOut_45_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_45_2).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_48_0 = stackOut_45_0;
            stackIn_48_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param3 == null) {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "null";
              stackIn_49_0 = stackOut_48_0;
              stackIn_49_1 = stackOut_48_1;
              stackIn_49_2 = stackOut_48_2;
              break L6;
            } else {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "{...}";
              stackIn_49_0 = stackOut_46_0;
              stackIn_49_1 = stackOut_46_1;
              stackIn_49_2 = stackOut_46_2;
              break L6;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_49_0, stackIn_49_2 + 44 + 0 + 44 + param5 + 41);
        }
    }

    private final void a(int param0) {
        int var2_int = 0;
        int var3 = 0;
        mb var4_ref_mb = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        mb var7_ref_mb = null;
        wl var8 = null;
        jb var9 = null;
        int var10 = 0;
        int[] var11 = null;
        int var12 = 0;
        int[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        L0: {
          var15 = SteelSentinels.field_G;
          if (((ee) this).field_R != 0) {
            break L0;
          } else {
            if ((((ee) this).field_v & 48) != 0) {
              ((ee) this).field_R = 1;
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (((ee) this).field_R <= 0) {
            if (((ee) this).field_R == 0) {
              var2_int = -((ee) this).field_ab.field_o[1] + ((ee) this).field_ab.field_o[0];
              if (kc.field_x[4][0].field_z << 5 <= var2_int) {
                if ((3 & ((ee) this).field_r) != 0) {
                  if ((3 & ((ee) this).field_r) == 2) {
                    var3 = ((ee) this).field_ab.field_o[1];
                    var4 = kc.field_x[4][0].field_z << 4;
                    var5 = var3 - var4 / 2;
                    var6 = var4 / 2 + var3;
                    var7 = var6;
                    L2: while (true) {
                      if (~var7 >= ~var5) {
                        L3: {
                          if (((ee) this).field_r != 6) {
                            if (var5 >= 0) {
                              ((ee) this).field_ab.field_m[var5] = 0;
                              ((ee) this).field_ab.field_e[var5] = 0;
                              ((ee) this).field_ab.field_f[var5] = 0;
                              break L3;
                            } else {
                              break L3;
                            }
                          } else {
                            var7 = var5;
                            L4: while (true) {
                              if (var7 < 0) {
                                break L3;
                              } else {
                                ((ee) this).field_ab.field_m[var7] = 0;
                                ((ee) this).field_ab.field_e[var7] = 0;
                                ((ee) this).field_ab.field_f[var7] = 0;
                                var7--;
                                continue L4;
                              }
                            }
                          }
                        }
                        var7_ref_mb = (mb) (Object) ((ee) this).field_K.e(13058);
                        L5: while (true) {
                          if (var7_ref_mb == null) {
                            ((ee) this).field_ab.field_o[1] = ((ee) this).field_ab.field_o[1] + 1;
                            var7 = 2;
                            L6: while (true) {
                              if (~((ee) this).field_ab.field_c >= ~var7) {
                                break L1;
                              } else {
                                L7: {
                                  if (-1 != ((ee) this).field_ab.field_j[var7]) {
                                    if (~var3 >= ~(-6000 + ((ee) this).field_ab.field_o[var7])) {
                                      break L7;
                                    } else {
                                      var8 = new wl(((ee) this).field_ab.field_o[var7] << 4, -((ee) this).field_ab.field_e[((ee) this).field_ab.field_o[var7]] << 4, 0, 0, 0, 0, 0, (ee) this, (mb) null, 500, 0, -1);
                                      var8.field_ob = false;
                                      var8.field_O = 500;
                                      var9 = new jb(var8.field_U, var8.field_A, 0, 0, 20, (ee) this, var8.field_fb, var8);
                                      var9.field_U = 1500;
                                      var9.field_K = 0;
                                      var9.field_G = 100;
                                      ((ee) this).field_u.a(3, (ck) (Object) var9);
                                      ((ee) this).field_ab.field_j[var7] = -1;
                                      var10 = -1075 + ((ee) this).field_ab.field_o[var7];
                                      L8: while (true) {
                                        if (1075 + ((ee) this).field_ab.field_o[var7] <= var10) {
                                          break L7;
                                        } else {
                                          var11 = ((ee) this).field_ab.field_m;
                                          var12 = var10;
                                          var13 = ((ee) this).field_ab.field_e;
                                          var14 = var10;
                                          ((ee) this).field_ab.field_f[var10] = 0;
                                          var13[var14] = 0;
                                          var11[var12] = 0;
                                          var10++;
                                          continue L8;
                                        }
                                      }
                                    }
                                  } else {
                                    break L7;
                                  }
                                }
                                var7++;
                                continue L6;
                              }
                            }
                          } else {
                            L9: {
                              L10: {
                                if (!var7_ref_mb.field_Lb) {
                                  break L10;
                                } else {
                                  if (!var7_ref_mb.field_pc) {
                                    break L9;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              if (~(var7_ref_mb.field_hc >> 4) > ~var5) {
                                break L9;
                              } else {
                                if (var7_ref_mb.field_hc >> 4 <= var6) {
                                  var7_ref_mb.field_hc = var7_ref_mb.field_hc + 16;
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            var7_ref_mb = (mb) (Object) ((ee) this).field_K.a((byte) -22);
                            continue L5;
                          }
                        }
                      } else {
                        ((ee) this).field_ab.field_m[var7] = ((ee) this).field_ab.field_m[var7 + -1];
                        ((ee) this).field_ab.field_e[var7] = ((ee) this).field_ab.field_e[-1 + var7];
                        ((ee) this).field_ab.field_f[var7] = ((ee) this).field_ab.field_f[var7 + -1];
                        var7--;
                        continue L2;
                      }
                    }
                  } else {
                    break L1;
                  }
                } else {
                  var3 = ((ee) this).field_ab.field_o[0];
                  var4 = kc.field_x[4][0].field_z << 4;
                  var5 = -(var4 / 2) + var3;
                  var6 = var3 - -(var4 / 2);
                  var7 = var5;
                  L11: while (true) {
                    if (~var7 <= ~var6) {
                      L12: {
                        if (4 != ((ee) this).field_r) {
                          if (~var6 > ~((ee) this).field_ab.field_m.length) {
                            ((ee) this).field_ab.field_m[var6] = 0;
                            ((ee) this).field_ab.field_e[var6] = 0;
                            ((ee) this).field_ab.field_f[var6] = 0;
                            break L12;
                          } else {
                            break L12;
                          }
                        } else {
                          var7 = var6;
                          L13: while (true) {
                            if (~var7 <= ~((ee) this).field_ab.field_m.length) {
                              break L12;
                            } else {
                              ((ee) this).field_ab.field_m[var7] = 0;
                              ((ee) this).field_ab.field_e[var7] = 0;
                              ((ee) this).field_ab.field_f[var7] = 0;
                              var7++;
                              continue L13;
                            }
                          }
                        }
                      }
                      var7_ref_mb = (mb) (Object) ((ee) this).field_K.e(13058);
                      L14: while (true) {
                        if (var7_ref_mb == null) {
                          ((ee) this).field_ab.field_o[0] = ((ee) this).field_ab.field_o[0] - 1;
                          var7 = 2;
                          L15: while (true) {
                            if (~((ee) this).field_ab.field_c >= ~var7) {
                              break L1;
                            } else {
                              L16: {
                                if (((ee) this).field_ab.field_j[var7] != -1) {
                                  if (((ee) this).field_ab.field_o[var7] + 6000 <= var3) {
                                    break L16;
                                  } else {
                                    var8 = new wl(((ee) this).field_ab.field_o[var7] << 4, -((ee) this).field_ab.field_e[((ee) this).field_ab.field_o[var7]] << 4, 0, 0, 0, 0, 0, (ee) this, (mb) null, 500, 0, -1);
                                    var8.field_O = 500;
                                    var8.field_ob = false;
                                    var9 = new jb(var8.field_U, var8.field_A, 0, 0, 20, (ee) this, var8.field_fb, var8);
                                    var9.field_U = 1500;
                                    var9.field_G = 100;
                                    var9.field_K = 0;
                                    ((ee) this).field_u.a(3, (ck) (Object) var9);
                                    ((ee) this).field_ab.field_j[var7] = -1;
                                    var10 = ((ee) this).field_ab.field_o[var7] - 1075;
                                    L17: while (true) {
                                      if (~(((ee) this).field_ab.field_o[var7] + 1075) >= ~var10) {
                                        break L16;
                                      } else {
                                        var11 = ((ee) this).field_ab.field_m;
                                        var12 = var10;
                                        var13 = ((ee) this).field_ab.field_e;
                                        ((ee) this).field_ab.field_f[var10] = 0;
                                        var14 = var10;
                                        var13[var14] = 0;
                                        var11[var12] = 0;
                                        var10++;
                                        continue L17;
                                      }
                                    }
                                  }
                                } else {
                                  break L16;
                                }
                              }
                              var7++;
                              continue L15;
                            }
                          }
                        } else {
                          L18: {
                            L19: {
                              if (!var7_ref_mb.field_Lb) {
                                break L19;
                              } else {
                                if (!var7_ref_mb.field_pc) {
                                  break L18;
                                } else {
                                  break L19;
                                }
                              }
                            }
                            if (~var5 < ~(var7_ref_mb.field_hc >> 4)) {
                              break L18;
                            } else {
                              if (var7_ref_mb.field_hc >> 4 > var6) {
                                break L18;
                              } else {
                                var7_ref_mb.field_hc = var7_ref_mb.field_hc - 16;
                                break L18;
                              }
                            }
                          }
                          var7_ref_mb = (mb) (Object) ((ee) this).field_K.a((byte) -100);
                          continue L14;
                        }
                      }
                    } else {
                      ((ee) this).field_ab.field_m[var7] = ((ee) this).field_ab.field_m[var7 - -1];
                      ((ee) this).field_ab.field_e[var7] = ((ee) this).field_ab.field_e[1 + var7];
                      ((ee) this).field_ab.field_f[var7] = ((ee) this).field_ab.field_f[var7 + 1];
                      var7++;
                      continue L11;
                    }
                  }
                }
              } else {
                var3 = 0;
                var4_ref_mb = (mb) (Object) ((ee) this).field_K.e(13058);
                L20: while (true) {
                  if (null == var4_ref_mb) {
                    L21: {
                      var4 = -1;
                      ((ee) this).field_R = 1;
                      if (var3 <= 0) {
                        var4 = 1;
                        break L21;
                      } else {
                        var4 = 0;
                        break L21;
                      }
                    }
                    L22: {
                      if (1 != var4) {
                        break L22;
                      } else {
                        ((ee) this).field_R = 501;
                        break L22;
                      }
                    }
                    L23: {
                      if (var4 == -1) {
                        break L23;
                      } else {
                        if (0 != (((ee) this).field_v & 1 << 4 + var4)) {
                          break L23;
                        } else {
                          ((ee) this).a(var4, (byte) -95, (mb) null);
                          break L23;
                        }
                      }
                    }
                    break L1;
                  } else {
                    L24: {
                      if (var4_ref_mb.field_jc != 0) {
                        break L24;
                      } else {
                        if (var4_ref_mb.field_vb > 0) {
                          var3 = var3 + var4_ref_mb.field_vb;
                          break L24;
                        } else {
                          break L24;
                        }
                      }
                    }
                    L25: {
                      if (var4_ref_mb.field_jc != 1) {
                        break L25;
                      } else {
                        if (0 < var4_ref_mb.field_vb) {
                          var3 = var3 - var4_ref_mb.field_vb;
                          break L25;
                        } else {
                          break L25;
                        }
                      }
                    }
                    var4_ref_mb = (mb) (Object) ((ee) this).field_K.a((byte) -42);
                    continue L20;
                  }
                }
              }
            } else {
              break L1;
            }
          } else {
            if (((ee) this).field_R % 1000 == 0) {
              L26: {
                var2_int = 0;
                if ((((ee) this).field_v & 1 << 4 + var2_int) == 0) {
                  if ((1 << -var2_int + 5 & ((ee) this).field_v) != 0) {
                    this.a(1, var2_int);
                    break L26;
                  } else {
                    ((ee) this).a(var2_int, (byte) 100, (mb) null);
                    break L26;
                  }
                } else {
                  break L26;
                }
              }
              break L1;
            } else {
              if (((ee) this).field_R % 1000 == 500) {
                L27: {
                  var2_int = 1;
                  if ((1 << var2_int + 4 & ((ee) this).field_v) != 0) {
                    break L27;
                  } else {
                    if ((1 << 5 - var2_int & ((ee) this).field_v) != 0) {
                      this.a(1, var2_int);
                      break L27;
                    } else {
                      ((ee) this).a(var2_int, (byte) 8, (mb) null);
                      break L27;
                    }
                  }
                }
                break L1;
              } else {
                break L1;
              }
            }
          }
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, je param5, int param6, int param7) {
        RuntimeException var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var17 = SteelSentinels.field_G;
        try {
          L0: {
            param5.field_B = param4;
            var10_int = -1;
            var11 = param4;
            L1: while (true) {
              if (~param7 >= ~var11) {
                break L0;
              } else {
                L2: {
                  var12 = jh.a(param0 * (var11 >> 3), 4096) * param3 >> 16;
                  var13 = kg.a((var11 >> 3) * param0, (byte) -87) * -param3 >> 16;
                  if (var12 == 0) {
                    break L2;
                  } else {
                    if (0 != var13) {
                      L3: {
                        var14 = param2 / var12;
                        if (param6 != 0) {
                          stackOut_14_0 = -(param1 / var13) + -var13 / param6;
                          stackIn_15_0 = stackOut_14_0;
                          break L3;
                        } else {
                          stackOut_12_0 = param1 / var13;
                          stackIn_15_0 = stackOut_12_0;
                          break L3;
                        }
                      }
                      L4: {
                        var15 = stackIn_15_0;
                        var16 = Math.abs(-var15 + var14);
                        if (Math.abs(var16) < var10_int) {
                          break L4;
                        } else {
                          if (var10_int == -1) {
                            break L4;
                          } else {
                            break L2;
                          }
                        }
                      }
                      var10_int = Math.abs(var16);
                      param5.field_B = param0 * var11;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                var11 += 128;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var10 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var10;
            stackOut_24_1 = new StringBuilder().append("ee.LA(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_27_0 = stackOut_24_0;
            stackIn_27_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param5 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L5;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_28_0 = stackOut_25_0;
              stackIn_28_1 = stackOut_25_1;
              stackIn_28_2 = stackOut_25_2;
              break L5;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + 44 + param6 + 44 + param7 + 44 + -1 + 41);
        }
    }

    private final void a(int param0, int param1, int param2, int param3, mb param4, mb param5) {
        RuntimeException var7 = null;
        je var7_ref = null;
        double var8 = 0.0;
        int var10 = 0;
        je stackIn_17_0 = null;
        je stackIn_17_1 = null;
        int stackIn_17_2 = 0;
        je stackIn_19_0 = null;
        je stackIn_19_1 = null;
        int stackIn_19_2 = 0;
        je stackIn_21_0 = null;
        je stackIn_21_1 = null;
        int stackIn_21_2 = 0;
        je stackIn_22_0 = null;
        je stackIn_22_1 = null;
        int stackIn_22_2 = 0;
        int stackIn_22_3 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        RuntimeException decompiledCaughtException = null;
        je stackOut_16_0 = null;
        je stackOut_16_1 = null;
        int stackOut_16_2 = 0;
        je stackOut_21_0 = null;
        je stackOut_21_1 = null;
        int stackOut_21_2 = 0;
        int stackOut_21_3 = 0;
        je stackOut_17_0 = null;
        je stackOut_17_1 = null;
        int stackOut_17_2 = 0;
        je stackOut_19_0 = null;
        je stackOut_19_1 = null;
        int stackOut_19_2 = 0;
        int stackOut_19_3 = 0;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        var10 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param4.field_Vb != null) {
                break L1;
              } else {
                if (0 >= param4.field_Tb) {
                  break L1;
                } else {
                  var7_ref = new je(5, param5.field_Bb, ((ee) this).field_r + 1);
                  var7_ref.field_p = true;
                  param4.field_B.a(3, (ck) (Object) var7_ref);
                  break L1;
                }
              }
            }
            L2: {
              if (param4.field_t > 0) {
                L3: {
                  stackOut_16_0 = null;
                  stackOut_16_1 = null;
                  stackOut_16_2 = 6;
                  stackIn_21_0 = stackOut_16_0;
                  stackIn_21_1 = stackOut_16_1;
                  stackIn_21_2 = stackOut_16_2;
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  if (~param4.field_t >= ~(param4.field_hc >> 4)) {
                    stackOut_21_0 = null;
                    stackOut_21_1 = null;
                    stackOut_21_2 = stackIn_21_2;
                    stackOut_21_3 = -1;
                    stackIn_22_0 = stackOut_21_0;
                    stackIn_22_1 = stackOut_21_1;
                    stackIn_22_2 = stackOut_21_2;
                    stackIn_22_3 = stackOut_21_3;
                    break L3;
                  } else {
                    stackOut_17_0 = null;
                    stackOut_17_1 = null;
                    stackOut_17_2 = stackIn_17_2;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    stackIn_19_2 = stackOut_17_2;
                    stackOut_19_0 = null;
                    stackOut_19_1 = null;
                    stackOut_19_2 = stackIn_19_2;
                    stackOut_19_3 = 1;
                    stackIn_22_0 = stackOut_19_0;
                    stackIn_22_1 = stackOut_19_1;
                    stackIn_22_2 = stackOut_19_2;
                    stackIn_22_3 = stackOut_19_3;
                    break L3;
                  }
                }
                var7_ref = new je(stackIn_22_2, stackIn_22_3, 2 + ((ee) this).field_r);
                var7_ref.field_p = true;
                param4.field_B.a(3, (ck) (Object) var7_ref);
                break L2;
              } else {
                if (Math.abs(param0) <= 80000) {
                  L4: {
                    var7_ref = new je(3, 0, 100 + ((param4.field_hc + param5.field_hc + ((ee) this).field_r) % 100 + (((ee) this).field_r - -4)));
                    var7_ref.field_y = param4.field_Gb - 20000;
                    var7_ref.field_u = param4.field_hc - param3 * 20000;
                    var7_ref.field_p = true;
                    param4.field_B.a(3, (ck) (Object) var7_ref);
                    param4.field_Tb = param4.field_x;
                    if (null == param4.field_Vb) {
                      break L4;
                    } else {
                      var7_ref = new je(0, 11, 150 + ((param5.field_hc + ((ee) this).field_r + param4.field_hc) % 100 + (4 + ((ee) this).field_r)));
                      var7_ref.field_u = param5.field_hc;
                      var7_ref.field_y = param5.field_Gb;
                      var7_ref.field_p = true;
                      var7_ref.field_B = 16384 * param3;
                      param4.field_B.a(3, (ck) (Object) var7_ref);
                      break L4;
                    }
                  }
                  break L2;
                } else {
                  var7_ref = new je(6, param3, 2 + ((ee) this).field_r);
                  var7_ref.field_p = true;
                  param4.field_B.a(3, (ck) (Object) var7_ref);
                  var7_ref = new je(3, 0, (param4.field_hc + ((ee) this).field_r - -param5.field_hc) % 100 + 4 + (((ee) this).field_r - -100));
                  var7_ref.field_u = param5.field_hc;
                  var7_ref.field_p = true;
                  var7_ref.field_y = -20000 + param4.field_Gb;
                  param4.field_B.a(3, (ck) (Object) var7_ref);
                  param4.field_Tb = param4.field_x;
                  break L2;
                }
              }
            }
            L5: {
              if (Math.abs(param0) >= 100000) {
                break L5;
              } else {
                if (1 > param4.field_Tb) {
                  break L5;
                } else {
                  L6: {
                    var7_ref = new je(0, 7, 4 + (((ee) this).field_r - (-((param4.field_hc + ((ee) this).field_r + param5.field_hc) % 100) + -175)));
                    var7_ref.field_u = param5.field_hc;
                    var7_ref.field_y = param5.field_Gb;
                    var8 = Math.atan2((double)param0, (double)(-param2));
                    var7_ref.field_B = (int)(65536.0 * var8 / 6.283185307179586);
                    if (0 > param3) {
                      if (16384 < var7_ref.field_B) {
                        var7_ref.field_B = var7_ref.field_B - 65536;
                        break L6;
                      } else {
                        break L6;
                      }
                    } else {
                      if (var7_ref.field_B < -16384) {
                        var7_ref.field_B = var7_ref.field_B + 65536;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var7_ref.field_p = true;
                  param4.field_B.a(3, (ck) (Object) var7_ref);
                  break L5;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var7 = decompiledCaughtException;
            stackOut_42_0 = (RuntimeException) var7;
            stackOut_42_1 = new StringBuilder().append("ee.P(").append(param0).append(44).append(2714).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_45_0 = stackOut_42_0;
            stackIn_45_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param4 == null) {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L7;
            } else {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "{...}";
              stackIn_46_0 = stackOut_43_0;
              stackIn_46_1 = stackOut_43_1;
              stackIn_46_2 = stackOut_43_2;
              break L7;
            }
          }
          L8: {
            stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
            stackOut_46_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_46_2).append(44);
            stackIn_49_0 = stackOut_46_0;
            stackIn_49_1 = stackOut_46_1;
            stackIn_47_0 = stackOut_46_0;
            stackIn_47_1 = stackOut_46_1;
            if (param5 == null) {
              stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "null";
              stackIn_50_0 = stackOut_49_0;
              stackIn_50_1 = stackOut_49_1;
              stackIn_50_2 = stackOut_49_2;
              break L8;
            } else {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "{...}";
              stackIn_50_0 = stackOut_47_0;
              stackIn_50_1 = stackOut_47_1;
              stackIn_50_2 = stackOut_47_2;
              break L8;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_50_0, stackIn_50_2 + 41);
        }
    }

    final void a(int param0, byte param1, mb param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        wl var7 = null;
        int var8 = 0;
        jc var9 = null;
        mb var10 = null;
        int var11 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var11 = SteelSentinels.field_G;
        try {
          L0: {
            var4_int = (((ee) this).field_ab.field_o[param0] << 4) + (-75000 + param0 * 150000);
            var5 = ((ee) this).field_ab.field_o[-param0 + 1] << 4;
            var6 = -30000;
            var7 = new wl(var4_int, var6, -1 + param0 * 2, 0, 50, 1, 11, (ee) this, param2, 1000, var5, 30);
            ((ee) this).field_T.a(3, (ck) (Object) var7);
            var8 = -114 % ((param1 - -59) / 32);
            var9 = new jc(((ee) this).field_K);
            var10 = (mb) (Object) var9.b(2);
            L1: while (true) {
              if (null == var10) {
                break L0;
              } else {
                L2: {
                  if (param0 != var10.field_jc) {
                    break L2;
                  } else {
                    if (var10.field_Cb) {
                      var10.field_Cb = false;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                var10 = (mb) (Object) var9.d(2);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) runtimeException;
            stackOut_14_1 = new StringBuilder().append("ee.DB(").append(param0).append(44).append(param1).append(44);
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L3;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
    }

    private final void a(int param0, int param1, int param2, mb param3, mb param4) {
        RuntimeException var7 = null;
        je var7_ref = null;
        int var8 = 0;
        je stackIn_32_0 = null;
        je stackIn_32_1 = null;
        int stackIn_32_2 = 0;
        je stackIn_34_0 = null;
        je stackIn_34_1 = null;
        int stackIn_34_2 = 0;
        je stackIn_36_0 = null;
        je stackIn_36_1 = null;
        int stackIn_36_2 = 0;
        je stackIn_37_0 = null;
        je stackIn_37_1 = null;
        int stackIn_37_2 = 0;
        int stackIn_37_3 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        je stackOut_31_0 = null;
        je stackOut_31_1 = null;
        int stackOut_31_2 = 0;
        je stackOut_36_0 = null;
        je stackOut_36_1 = null;
        int stackOut_36_2 = 0;
        int stackOut_36_3 = 0;
        je stackOut_32_0 = null;
        je stackOut_32_1 = null;
        int stackOut_32_2 = 0;
        je stackOut_34_0 = null;
        je stackOut_34_1 = null;
        int stackOut_34_2 = 0;
        int stackOut_34_3 = 0;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        var8 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (0 < param3.field_t) {
                L2: {
                  stackOut_31_0 = null;
                  stackOut_31_1 = null;
                  stackOut_31_2 = 6;
                  stackIn_36_0 = stackOut_31_0;
                  stackIn_36_1 = stackOut_31_1;
                  stackIn_36_2 = stackOut_31_2;
                  stackIn_32_0 = stackOut_31_0;
                  stackIn_32_1 = stackOut_31_1;
                  stackIn_32_2 = stackOut_31_2;
                  if (~(param3.field_hc >> 4) <= ~param3.field_t) {
                    stackOut_36_0 = null;
                    stackOut_36_1 = null;
                    stackOut_36_2 = stackIn_36_2;
                    stackOut_36_3 = -1;
                    stackIn_37_0 = stackOut_36_0;
                    stackIn_37_1 = stackOut_36_1;
                    stackIn_37_2 = stackOut_36_2;
                    stackIn_37_3 = stackOut_36_3;
                    break L2;
                  } else {
                    stackOut_32_0 = null;
                    stackOut_32_1 = null;
                    stackOut_32_2 = stackIn_32_2;
                    stackIn_34_0 = stackOut_32_0;
                    stackIn_34_1 = stackOut_32_1;
                    stackIn_34_2 = stackOut_32_2;
                    stackOut_34_0 = null;
                    stackOut_34_1 = null;
                    stackOut_34_2 = stackIn_34_2;
                    stackOut_34_3 = 1;
                    stackIn_37_0 = stackOut_34_0;
                    stackIn_37_1 = stackOut_34_1;
                    stackIn_37_2 = stackOut_34_2;
                    stackIn_37_3 = stackOut_34_3;
                    break L2;
                  }
                }
                var7_ref = new je(stackIn_37_2, stackIn_37_3, 2 + ((ee) this).field_r);
                var7_ref.field_p = true;
                param3.field_B.a(3, (ck) (Object) var7_ref);
                break L1;
              } else {
                L3: {
                  if (15000 > Math.abs(param1)) {
                    break L3;
                  } else {
                    L4: {
                      if (param4.field_mc <= 0) {
                        break L4;
                      } else {
                        if (Math.abs(param1) < 40000) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var7_ref = new je(6, param0, ((ee) this).field_r + 2);
                    var7_ref.field_p = true;
                    param3.field_B.a(3, (ck) (Object) var7_ref);
                    break L1;
                  }
                }
                L5: {
                  if (15000 <= Math.abs(param1)) {
                    break L5;
                  } else {
                    if (10000 <= Math.abs(param2)) {
                      break L5;
                    } else {
                      if (param3.field_Tb <= 1) {
                        break L5;
                      } else {
                        var7_ref = new je(6, param0, 2 + ((ee) this).field_r);
                        var7_ref.field_p = true;
                        param3.field_B.a(3, (ck) (Object) var7_ref);
                        var7_ref = new je(7, param0, 4 + ((ee) this).field_r);
                        var7_ref.field_p = true;
                        param3.field_B.a(3, (ck) (Object) var7_ref);
                        var7_ref = new je(6, param0, 4 + ((ee) this).field_r - -25);
                        var7_ref.field_p = true;
                        param3.field_B.a(3, (ck) (Object) var7_ref);
                        return;
                      }
                    }
                  }
                }
                if (Math.abs(param1) >= 20000) {
                  break L1;
                } else {
                  L6: {
                    if (param4.field_mc > 1) {
                      break L6;
                    } else {
                      if (Math.abs(param1) >= 10000) {
                        break L1;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var7_ref = new je(6, -param0, ((ee) this).field_r - -2);
                  var7_ref.field_p = true;
                  param3.field_B.a(3, (ck) (Object) var7_ref);
                  break L1;
                }
              }
            }
            L7: {
              L8: {
                if (50000 >= Math.abs(param1)) {
                  break L8;
                } else {
                  if (this.a(((ee) this).field_z, (byte) -89, 2, param3, param4, 2600, ((ee) this).field_r + 15)) {
                    break L7;
                  } else {
                    break L8;
                  }
                }
              }
              if (param3.field_Tb <= 1) {
                if (!this.a(((ee) this).field_z, (byte) -88, 0, param3, param4, 4352, ((ee) this).field_r + 25)) {
                  break L7;
                } else {
                  if (Math.abs(param1) <= 80000) {
                    break L7;
                  } else {
                    if (param3.field_Tb > 0) {
                      var7_ref = new je(3, 0, ((ee) this).field_r - -30);
                      var7_ref.field_p = true;
                      var7_ref.field_y = param3.field_Gb + -20000;
                      var7_ref.field_u = param0 * 20000 + param3.field_hc;
                      param3.field_B.a(3, (ck) (Object) var7_ref);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
              } else {
                if (this.a(((ee) this).field_z, (byte) -126, 1, param3, param4, 1728, 25 + ((ee) this).field_r)) {
                  break L7;
                } else {
                  if (!this.a(((ee) this).field_z, (byte) -63, 0, param3, param4, 4352, 25 + ((ee) this).field_r)) {
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var7 = decompiledCaughtException;
            stackOut_66_0 = (RuntimeException) var7;
            stackOut_66_1 = new StringBuilder().append("ee.TA(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_69_0 = stackOut_66_0;
            stackIn_69_1 = stackOut_66_1;
            stackIn_67_0 = stackOut_66_0;
            stackIn_67_1 = stackOut_66_1;
            if (param3 == null) {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "null";
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              stackIn_70_2 = stackOut_69_2;
              break L9;
            } else {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "{...}";
              stackIn_70_0 = stackOut_67_0;
              stackIn_70_1 = stackOut_67_1;
              stackIn_70_2 = stackOut_67_2;
              break L9;
            }
          }
          L10: {
            stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
            stackOut_70_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(44);
            stackIn_73_0 = stackOut_70_0;
            stackIn_73_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param4 == null) {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L10;
            } else {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "{...}";
              stackIn_74_0 = stackOut_71_0;
              stackIn_74_1 = stackOut_71_1;
              stackIn_74_2 = stackOut_71_2;
              break L10;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_74_0, stackIn_74_2 + 44 + 0 + 41);
        }
    }

    private final boolean a(byte param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        var5 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (!this.b(true, param1)) {
                break L1;
              } else {
                if (this.b(true, param2)) {
                  if (param0 >= 34) {
                    L2: {
                      if (~param2 <= ~param1) {
                        break L2;
                      } else {
                        var4_int = param1;
                        param1 = param2;
                        param2 = var4_int;
                        break L2;
                      }
                    }
                    param1++;
                    L3: while (true) {
                      if (~param2 >= ~param1) {
                        stackOut_20_0 = 1;
                        stackIn_21_0 = stackOut_20_0;
                        break L0;
                      } else {
                        if (this.b(true, param1)) {
                          param1++;
                          continue L3;
                        } else {
                          stackOut_17_0 = 0;
                          stackIn_18_0 = stackOut_17_0;
                          return stackIn_18_0 != 0;
                        }
                      }
                    }
                  } else {
                    stackOut_8_0 = 1;
                    stackIn_9_0 = stackOut_8_0;
                    return stackIn_9_0 != 0;
                  }
                } else {
                  break L1;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            return stackIn_6_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var4, "ee.M(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_21_0 != 0;
    }

    public static void g(int param0) {
        try {
            field_L = null;
            field_jb = null;
            field_k = null;
            field_H = null;
            field_x = null;
            field_I = null;
            field_S = null;
            if (param0 != 0) {
                ee.c(-128);
            }
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "ee.L(" + param0 + 41);
        }
    }

    final int b(boolean param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        mb var3 = null;
        int var4 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        var4 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              var2_int = 0;
              if (!param0) {
                break L1;
              } else {
                ((ee) this).field_lb = false;
                break L1;
              }
            }
            var3 = (mb) (Object) ((ee) this).field_K.e(13058);
            L2: while (true) {
              if (null == var3) {
                var2_int = var2_int + ((ee) this).field_r;
                var2_int = var2_int + ((65535 & ((ee) this).field_d + ((ee) this).field_M + ((ee) this).field_gb) << 16);
                stackOut_9_0 = var2_int;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                var2_int = var2_int + (3 * var3.field_Gb + var3.field_hc * 2 & 65535);
                var2_int = var2_int + (var3.field_K & 65535);
                var2_int = var2_int + ((65535 & var3.field_ab) << 16);
                var2_int = var2_int + (11 * var3.field_ub + 7 * var3.field_Tb & 65535);
                var2_int = var2_int + ((65535 & var3.field_vb) << 16);
                var2_int = var2_int + (65535 & var3.field_rb * 5);
                var3 = (mb) (Object) ((ee) this).field_K.a((byte) -44);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var2, "ee.V(" + param0 + 41);
        }
        return stackIn_10_0;
    }

    private final void a(byte param0, int param1, mb param2, mb param3, int param4, int param5) {
        RuntimeException var7 = null;
        je var7_ref = null;
        int var8 = 0;
        je stackIn_13_0 = null;
        je stackIn_13_1 = null;
        int stackIn_13_2 = 0;
        je stackIn_15_0 = null;
        je stackIn_15_1 = null;
        int stackIn_15_2 = 0;
        je stackIn_17_0 = null;
        je stackIn_17_1 = null;
        int stackIn_17_2 = 0;
        je stackIn_18_0 = null;
        je stackIn_18_1 = null;
        int stackIn_18_2 = 0;
        int stackIn_18_3 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        je stackOut_12_0 = null;
        je stackOut_12_1 = null;
        int stackOut_12_2 = 0;
        je stackOut_17_0 = null;
        je stackOut_17_1 = null;
        int stackOut_17_2 = 0;
        int stackOut_17_3 = 0;
        je stackOut_13_0 = null;
        je stackOut_13_1 = null;
        int stackOut_13_2 = 0;
        je stackOut_15_0 = null;
        je stackOut_15_1 = null;
        int stackOut_15_2 = 0;
        int stackOut_15_3 = 0;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        var8 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param3.field_Vb != null) {
                break L1;
              } else {
                if (0 >= param3.field_Tb) {
                  break L1;
                } else {
                  if (!param2.i(18, -27)) {
                    var7_ref = new je(5, param2.field_Bb, 1 + ((ee) this).field_r);
                    var7_ref.field_p = true;
                    param3.field_B.a(3, (ck) (Object) var7_ref);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            L2: {
              if (param3.field_t <= 0) {
                L3: {
                  if (Math.abs(param1) >= 70000) {
                    break L3;
                  } else {
                    if (param3.field_U == 0) {
                      break L3;
                    } else {
                      if (Math.abs(param1) < 20000) {
                        var7_ref = new je(6, -param4, 2 + ((ee) this).field_r);
                        var7_ref.field_p = true;
                        param3.field_B.a(3, (ck) (Object) var7_ref);
                        break L2;
                      } else {
                        if (Math.abs(param1) >= 50000) {
                          break L2;
                        } else {
                          var7_ref = new je(6, 0, ((ee) this).field_r + 2);
                          var7_ref.field_p = true;
                          param3.field_B.a(3, (ck) (Object) var7_ref);
                          break L2;
                        }
                      }
                    }
                  }
                }
                var7_ref = new je(6, param4, ((ee) this).field_r - -2);
                var7_ref.field_p = true;
                param3.field_B.a(3, (ck) (Object) var7_ref);
                break L2;
              } else {
                L4: {
                  stackOut_12_0 = null;
                  stackOut_12_1 = null;
                  stackOut_12_2 = 6;
                  stackIn_17_0 = stackOut_12_0;
                  stackIn_17_1 = stackOut_12_1;
                  stackIn_17_2 = stackOut_12_2;
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  stackIn_13_2 = stackOut_12_2;
                  if (param3.field_hc >> 4 < param3.field_t) {
                    stackOut_17_0 = null;
                    stackOut_17_1 = null;
                    stackOut_17_2 = stackIn_17_2;
                    stackOut_17_3 = 1;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    stackIn_18_2 = stackOut_17_2;
                    stackIn_18_3 = stackOut_17_3;
                    break L4;
                  } else {
                    stackOut_13_0 = null;
                    stackOut_13_1 = null;
                    stackOut_13_2 = stackIn_13_2;
                    stackIn_15_0 = stackOut_13_0;
                    stackIn_15_1 = stackOut_13_1;
                    stackIn_15_2 = stackOut_13_2;
                    stackOut_15_0 = null;
                    stackOut_15_1 = null;
                    stackOut_15_2 = stackIn_15_2;
                    stackOut_15_3 = -1;
                    stackIn_18_0 = stackOut_15_0;
                    stackIn_18_1 = stackOut_15_1;
                    stackIn_18_2 = stackOut_15_2;
                    stackIn_18_3 = stackOut_15_3;
                    break L4;
                  }
                }
                var7_ref = new je(stackIn_18_2, stackIn_18_3, ((ee) this).field_r - -2);
                var7_ref.field_p = true;
                param3.field_B.a(3, (ck) (Object) var7_ref);
                break L2;
              }
            }
            L5: {
              if (null != param3.field_Vb) {
                var7_ref = new je(0, param3.field_Xb[2], 5 + ((ee) this).field_r);
                var7_ref.field_B = 7192 * param4;
                var7_ref.field_p = true;
                var7_ref.field_y = param2.field_Gb;
                var7_ref.field_u = param2.field_hc;
                param3.field_B.a(3, (ck) (Object) var7_ref);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (!this.a(((ee) this).field_z, (byte) -57, 4, param3, param2, 2600, ((ee) this).field_r + 15)) {
                if (this.a(((ee) this).field_z, (byte) -61, 3, param3, param2, 2600, ((ee) this).field_r + 15)) {
                  break L6;
                } else {
                  L7: {
                    if (param3.field_Tb <= 0) {
                      break L7;
                    } else {
                      if (param2.field_S <= 50) {
                        break L7;
                      } else {
                        if (!this.a(((ee) this).field_z * 4, (byte) -88, 1, param3, param2, 8448, 15 + ((ee) this).field_r)) {
                          if (!this.a(((ee) this).field_z, (byte) -29, 0, param3, param2, 2304, ((ee) this).field_r - -25)) {
                            break L6;
                          } else {
                            break L6;
                          }
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  if (!this.a(((ee) this).field_z, (byte) -88, 0, param3, param2, 2304, ((ee) this).field_r - -25)) {
                    if (param3.field_Tb <= 0) {
                      break L6;
                    } else {
                      if (this.a(((ee) this).field_z, (byte) -91, 1, param3, param2, 1728, 15 + ((ee) this).field_r)) {
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                  } else {
                    break L6;
                  }
                }
              } else {
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var7 = decompiledCaughtException;
            stackOut_67_0 = (RuntimeException) var7;
            stackOut_67_1 = new StringBuilder().append("ee.BA(").append(57).append(44).append(param1).append(44);
            stackIn_70_0 = stackOut_67_0;
            stackIn_70_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param2 == null) {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L8;
            } else {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "{...}";
              stackIn_71_0 = stackOut_68_0;
              stackIn_71_1 = stackOut_68_1;
              stackIn_71_2 = stackOut_68_2;
              break L8;
            }
          }
          L9: {
            stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
            stackOut_71_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(44);
            stackIn_74_0 = stackOut_71_0;
            stackIn_74_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param3 == null) {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "null";
              stackIn_75_0 = stackOut_74_0;
              stackIn_75_1 = stackOut_74_1;
              stackIn_75_2 = stackOut_74_2;
              break L9;
            } else {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "{...}";
              stackIn_75_0 = stackOut_72_0;
              stackIn_75_1 = stackOut_72_1;
              stackIn_75_2 = stackOut_72_2;
              break L9;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_75_0, stackIn_75_2 + 44 + param4 + 44 + param5 + 41);
        }
    }

    private final boolean a(int param0, boolean param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_18_0 = 0;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_26_0 = 0;
        int stackOut_17_0 = 0;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        var4 = SteelSentinels.field_G;
        try {
          L0: {
            if (((ee) this).field_ab.b(88) == 2) {
              if (((ee) this).field_ab.a(false, param0) <= 3000) {
                if (this.b(true, param0)) {
                  param0--;
                  L1: while (true) {
                    if (param0 <= 0) {
                      stackOut_26_0 = 0;
                      stackIn_27_0 = stackOut_26_0;
                      break L0;
                    } else {
                      if (3000 < ((ee) this).field_ab.a(false, param0)) {
                        stackOut_17_0 = 1;
                        stackIn_18_0 = stackOut_17_0;
                        return stackIn_18_0 != 0;
                      } else {
                        stackOut_19_0 = this;
                        stackOut_19_1 = 1;
                        stackIn_22_0 = stackOut_19_0;
                        stackIn_22_1 = stackOut_19_1;
                        if (this.b(stackIn_22_1 != 0, param0)) {
                          param0--;
                          continue L1;
                        } else {
                          stackOut_23_0 = 0;
                          stackIn_24_0 = stackOut_23_0;
                          return stackIn_24_0 != 0;
                        }
                      }
                    }
                  }
                } else {
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0 != 0;
                }
              } else {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var3, "ee.A(" + param0 + 44 + 0 + 41);
        }
        return stackIn_27_0 != 0;
    }

    final boolean f(int param0) {
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 < -36) {
                break L1;
              } else {
                boolean discarded$2 = ((ee) this).b(-114, 97);
                break L1;
              }
            }
            L2: {
              if (((ee) this).field_K.field_e.field_k != ((ee) this).field_K.field_e.field_i) {
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
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var2, "ee.I(" + param0 + 41);
        }
        return stackIn_7_0 != 0;
    }

    private final int a(byte param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_20_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        var5 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              var4 = -114 / ((param0 - -15) / 60);
              var3_int = 0;
              if (((ee) this).field_ab.a(65) / 2 > param1) {
                L2: while (true) {
                  if (((ee) this).field_ab.a(-128) <= param1) {
                    break L1;
                  } else {
                    if (this.b(true, param1)) {
                      param1++;
                      continue L2;
                    } else {
                      var3_int = 800 + param1;
                      break L1;
                    }
                  }
                }
              } else {
                var3_int = ((ee) this).field_ab.a(108);
                L3: while (true) {
                  if (param1 <= 0) {
                    break L1;
                  } else {
                    if (this.b(true, param1)) {
                      param1--;
                      continue L3;
                    } else {
                      var3_int = -800 + param1;
                      break L1;
                    }
                  }
                }
              }
            }
            stackOut_19_0 = Math.max(128, Math.min(((ee) this).field_ab.a(109) + -128, var3_int));
            stackIn_20_0 = stackOut_19_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var3, "ee.Q(" + param0 + 44 + param1 + 41);
        }
        return stackIn_20_0;
    }

    private final void a(int param0, int param1, mb param2, int param3, mb param4) {
        Object var6_ref2 = null;
        RuntimeException var6 = null;
        je var6_ref = null;
        int var7 = 0;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_67_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        var6_ref2 = null;
        var7 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param4.field_t > 0) {
                L2: {
                  var6_ref2 = null;
                  if (param4.field_hc >> 4 <= param4.field_t) {
                    var6_ref = new je(6, 1, 2 + ((ee) this).field_r);
                    break L2;
                  } else {
                    var6_ref = new je(6, -1, 2 + ((ee) this).field_r);
                    break L2;
                  }
                }
                var6_ref.field_p = true;
                param4.field_B.a(3, (ck) (Object) var6_ref);
                break L1;
              } else {
                L3: {
                  if (Math.abs(param3) < 30000) {
                    break L3;
                  } else {
                    if (param4.field_Tb <= 5) {
                      break L3;
                    } else {
                      var6_ref = new je(6, param1, ((ee) this).field_r + 2);
                      var6_ref.field_p = true;
                      param4.field_B.a(3, (ck) (Object) var6_ref);
                      break L1;
                    }
                  }
                }
                L4: {
                  if (0 == param4.field_U) {
                    break L4;
                  } else {
                    if (param4.field_Tb <= 1) {
                      break L4;
                    } else {
                      break L1;
                    }
                  }
                }
                var6_ref = new je(6, -param1, ((ee) this).field_r - -2);
                var6_ref.field_p = true;
                param4.field_B.a(3, (ck) (Object) var6_ref);
                break L1;
              }
            }
            L5: {
              L6: {
                param2.field_Gb = param2.field_Gb + (param4.field_Db << 3);
                if (param4.field_Lb) {
                  break L6;
                } else {
                  if (param4.field_oc <= 0) {
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              if (!this.a(((ee) this).field_z, (byte) -128, 3, param4, param2, 2600, ((ee) this).field_r + 15)) {
                break L5;
              } else {
                break L5;
              }
            }
            L7: {
              if (!this.a(((ee) this).field_z, (byte) -97, 2, param4, param2, 2600, 15 + ((ee) this).field_r)) {
                if (param4.field_Tb <= 1) {
                  if (param4.field_t != 0) {
                    break L7;
                  } else {
                    if (param4.field_Tb > 0) {
                      var6_ref = new je(3, 0, 30 + ((ee) this).field_r);
                      var6_ref.field_y = param4.field_Gb + -20000;
                      var6_ref.field_p = true;
                      var6_ref.field_u = param4.field_hc - 20000 * param1;
                      param4.field_B.a(3, (ck) (Object) var6_ref);
                      param4.g(5);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                } else {
                  if (this.a(((ee) this).field_z, (byte) -109, 1, param4, param2, 1728, 25 + ((ee) this).field_r)) {
                    break L7;
                  } else {
                    if (!this.a(0, (byte) -69, 0, param4, param2, 4608, 25 + ((ee) this).field_r)) {
                      break L7;
                    } else {
                      if (param4.field_t == 0) {
                        var6_ref = new je(3, 0, 3 + ((ee) this).field_r);
                        var6_ref.field_y = param4.field_Gb + -20000;
                        var6_ref.field_u = param4.field_hc - -(10000 * param1);
                        var6_ref.field_p = true;
                        param4.field_B.a(3, (ck) (Object) var6_ref);
                        param4.g(5);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
              } else {
                break L7;
              }
            }
            param2.field_Gb = param2.field_Gb - (param4.field_Db << 3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var6 = decompiledCaughtException;
            stackOut_59_0 = (RuntimeException) var6;
            stackOut_59_1 = new StringBuilder().append("ee.QA(").append(-103).append(44).append(param1).append(44);
            stackIn_62_0 = stackOut_59_0;
            stackIn_62_1 = stackOut_59_1;
            stackIn_60_0 = stackOut_59_0;
            stackIn_60_1 = stackOut_59_1;
            if (param2 == null) {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "null";
              stackIn_63_0 = stackOut_62_0;
              stackIn_63_1 = stackOut_62_1;
              stackIn_63_2 = stackOut_62_2;
              break L8;
            } else {
              stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
              stackOut_60_1 = (StringBuilder) (Object) stackIn_60_1;
              stackOut_60_2 = "{...}";
              stackIn_63_0 = stackOut_60_0;
              stackIn_63_1 = stackOut_60_1;
              stackIn_63_2 = stackOut_60_2;
              break L8;
            }
          }
          L9: {
            stackOut_63_0 = (RuntimeException) (Object) stackIn_63_0;
            stackOut_63_1 = ((StringBuilder) (Object) stackIn_63_1).append(stackIn_63_2).append(44).append(param3).append(44);
            stackIn_66_0 = stackOut_63_0;
            stackIn_66_1 = stackOut_63_1;
            stackIn_64_0 = stackOut_63_0;
            stackIn_64_1 = stackOut_63_1;
            if (param4 == null) {
              stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
              stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
              stackOut_66_2 = "null";
              stackIn_67_0 = stackOut_66_0;
              stackIn_67_1 = stackOut_66_1;
              stackIn_67_2 = stackOut_66_2;
              break L9;
            } else {
              stackOut_64_0 = (RuntimeException) (Object) stackIn_64_0;
              stackOut_64_1 = (StringBuilder) (Object) stackIn_64_1;
              stackOut_64_2 = "{...}";
              stackIn_67_0 = stackOut_64_0;
              stackIn_67_1 = stackOut_64_1;
              stackIn_67_2 = stackOut_64_2;
              break L9;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_67_0, stackIn_67_2 + 41);
        }
    }

    final void e(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        mb var7 = null;
        int var8 = 0;
        int stackIn_5_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
        var8 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param0 < ~di.field_g) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_5_0 = stackOut_2_0;
                break L1;
              }
            }
            var2_int = stackIn_5_0;
            var3 = 0;
            var4 = 0;
            var5 = 0;
            var6 = new int[((ee) this).field_Q + ((ee) this).field_kb];
            var7 = (mb) (Object) ((ee) this).field_K.e(13058);
            L2: while (true) {
              if (var7 == null) {
                L3: {
                  L4: {
                    if (((ee) this).field_lb) {
                      break L4;
                    } else {
                      if (var2_int == 0) {
                        L5: {
                          if (mm.a((byte) 127, var3) <= 1) {
                            break L5;
                          } else {
                            if (var5 != 0) {
                              break L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                        this.a(var6, (byte) -111);
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (0 >= mm.a((byte) 123, var4)) {
                    this.a(var6, (byte) -109);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                break L0;
              } else {
                L6: {
                  if (var7.field_Bb < 0) {
                    break L6;
                  } else {
                    if (var7.field_Bb >= ((ee) this).field_Q + ((ee) this).field_kb) {
                      break L6;
                    } else {
                      if (var7.field_V) {
                        break L6;
                      } else {
                        L7: {
                          if (var7.field_Hb) {
                            break L7;
                          } else {
                            var4 = var4 | 1 << var7.field_Bb;
                            var3 = var3 | 1 << var7.field_jc;
                            if (((ee) this).field_kb > var7.field_Bb) {
                              var5 = var5 | 1 << var7.field_Bb;
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                        }
                        var6[var7.field_Bb] = var7.field_vb;
                        if (var6[var7.field_Bb] > 0) {
                          break L6;
                        } else {
                          var6[var7.field_Bb] = 1;
                          break L6;
                        }
                      }
                    }
                  }
                }
                var7 = (mb) (Object) ((ee) this).field_K.a((byte) -55);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var2, "ee.K(" + param0 + 41);
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_12_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_46_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_42_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_45_0 = 0;
        var11 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              var8_int = 60 / ((param5 - -8) / 59);
              if (Math.abs(param1) < Math.abs(param2)) {
                if (param6 <= param4) {
                  var9 = param4;
                  L2: while (true) {
                    if (param6 >= var9) {
                      break L1;
                    } else {
                      var10 = (var9 + -param4) * param1 / param2 + param3;
                      if (this.a(true, var9, var10)) {
                        stackOut_42_0 = 1;
                        stackIn_43_0 = stackOut_42_0;
                        return stackIn_43_0 != 0;
                      } else {
                        var9 -= 8;
                        continue L2;
                      }
                    }
                  }
                } else {
                  var9 = param4;
                  L3: while (true) {
                    if (param6 <= var9) {
                      break L1;
                    } else {
                      var10 = param3 + (-param4 + var9) * param1 / param2;
                      if (!this.a(true, var9, var10)) {
                        var9 += 8;
                        continue L3;
                      } else {
                        stackOut_32_0 = 1;
                        stackIn_33_0 = stackOut_32_0;
                        return stackIn_33_0 != 0;
                      }
                    }
                  }
                }
              } else {
                if (param0 <= param3) {
                  var9 = param3;
                  L4: while (true) {
                    if (~param0 <= ~var9) {
                      break L1;
                    } else {
                      var10 = (var9 + -param3) * param2 / param1 + param4;
                      if (!this.a(true, var10, var9)) {
                        var9 -= 8;
                        continue L4;
                      } else {
                        stackOut_20_0 = 1;
                        stackIn_21_0 = stackOut_20_0;
                        return stackIn_21_0 != 0;
                      }
                    }
                  }
                } else {
                  var9 = param3;
                  L5: while (true) {
                    if (var9 >= param0) {
                      break L1;
                    } else {
                      var10 = param2 * (-param3 + var9) / param1 + param4;
                      if (this.a(true, var10, var9)) {
                        stackOut_11_0 = 1;
                        stackIn_12_0 = stackOut_11_0;
                        return stackIn_12_0 != 0;
                      } else {
                        var9 += 8;
                        continue L5;
                      }
                    }
                  }
                }
              }
            }
            stackOut_45_0 = 0;
            stackIn_46_0 = stackOut_45_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var8, "ee.U(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_46_0 != 0;
    }

    private final int h() {
        RuntimeException var2 = null;
        int var2_int = 0;
        mb var3 = null;
        int var4 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        var4 = SteelSentinels.field_G;
        try {
          L0: {
            var2_int = 0;
            var3 = (mb) (Object) ((ee) this).field_K.e(13058);
            L1: while (true) {
              if (var3 == null) {
                stackOut_12_0 = var2_int;
                stackIn_13_0 = stackOut_12_0;
                break L0;
              } else {
                L2: {
                  if (8 != var3.field_Nb) {
                    break L2;
                  } else {
                    var2_int++;
                    break L2;
                  }
                }
                var3 = (mb) (Object) ((ee) this).field_K.a((byte) -81);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var2, "ee.AB(" + 126 + 41);
        }
        return stackIn_13_0;
    }

    private final void i() {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = SteelSentinels.field_G;
        try {
          L0: {
            if (null == ((ee) this).field_y) {
              ((ee) this).field_p = false;
              return;
            } else {
              ((ee) this).field_p = true;
              var2_int = 0;
              L1: while (true) {
                L2: {
                  if (var2_int >= ((ee) this).field_E.length) {
                    break L2;
                  } else {
                    if (!((ee) this).field_p) {
                      break L2;
                    } else {
                      L3: {
                        if (~((ee) this).field_y.field_vb < ~((ee) this).field_E[var2_int]) {
                          break L3;
                        } else {
                          ((ee) this).field_p = false;
                          break L3;
                        }
                      }
                      var2_int++;
                      continue L1;
                    }
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var2, "ee.CA(" + -22017 + 41);
        }
    }

    private final boolean a(boolean param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_12_0 = 0;
        try {
          L0: {
            param2 = -param2;
            L1: {
              L2: {
                if (((ee) this).field_ab.a(false, param1) <= param2) {
                  break L2;
                } else {
                  L3: {
                    if (~((ee) this).field_ab.a((byte) -102, param1) < ~param2) {
                      break L3;
                    } else {
                      if (((ee) this).field_ab.b((byte) 120, param1) >= param2) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  stackOut_10_0 = 1;
                  stackIn_13_0 = stackOut_10_0;
                  break L1;
                }
              }
              stackOut_12_0 = 0;
              stackIn_13_0 = stackOut_12_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var4, "ee.C(" + 1 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_13_0 != 0;
    }

    final void a(int param0, int param1, int param2) {
        mb var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        var5 = SteelSentinels.field_G;
        try {
          L0: {
            var4 = ((ee) this).f(param2, -128);
            if (param1 == 28669) {
              L1: {
                if (var4 != null) {
                  L2: while (true) {
                    L3: {
                      if (var4.field_Ec.f(7)) {
                        break L3;
                      } else {
                        if (param0 > ((je) (Object) var4.field_Ec.b(1063677678)).field_x) {
                          break L3;
                        } else {
                          var4.field_Ec.b(1063677678).b(4);
                          continue L2;
                        }
                      }
                    }
                    L4: while (true) {
                      L5: {
                        if (var4.field_B.f(7)) {
                          break L5;
                        } else {
                          stackOut_14_0 = ((je) (Object) var4.field_B.b(param1 + 1063649009)).field_x;
                          stackOut_14_1 = param0;
                          stackIn_16_0 = stackOut_14_0;
                          stackIn_16_1 = stackOut_14_1;
                          if (stackIn_16_0 < stackIn_16_1) {
                            break L5;
                          } else {
                            var4.field_B.b(param1 + 1063649009).b(4);
                            continue L4;
                          }
                        }
                      }
                      var4.d((byte) 85, new je(10, 0, param0));
                      break L1;
                    }
                  }
                } else {
                  break L1;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var4_ref, "ee.WA(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
    }

    private final void a(mb param0, byte param1, mb param2, int param3, int param4) {
        Object var6 = null;
        int var7 = 0;
        je var8_ref_je = null;
        int var8 = 0;
        je var9 = null;
        int var10 = 0;
        int stackIn_5_0 = 0;
        je stackIn_7_0 = null;
        je stackIn_7_1 = null;
        int stackIn_7_2 = 0;
        je stackIn_9_0 = null;
        je stackIn_9_1 = null;
        int stackIn_9_2 = 0;
        je stackIn_11_0 = null;
        je stackIn_11_1 = null;
        int stackIn_11_2 = 0;
        je stackIn_12_0 = null;
        je stackIn_12_1 = null;
        int stackIn_12_2 = 0;
        int stackIn_12_3 = 0;
        je stackIn_18_0 = null;
        je stackIn_18_1 = null;
        int stackIn_18_2 = 0;
        int stackIn_18_3 = 0;
        int stackIn_18_4 = 0;
        je stackIn_20_0 = null;
        je stackIn_20_1 = null;
        int stackIn_20_2 = 0;
        int stackIn_20_3 = 0;
        int stackIn_20_4 = 0;
        je stackIn_22_0 = null;
        je stackIn_22_1 = null;
        int stackIn_22_2 = 0;
        int stackIn_22_3 = 0;
        int stackIn_22_4 = 0;
        je stackIn_23_0 = null;
        je stackIn_23_1 = null;
        int stackIn_23_2 = 0;
        int stackIn_23_3 = 0;
        int stackIn_23_4 = 0;
        int stackIn_23_5 = 0;
        je stackIn_28_0 = null;
        je stackIn_28_1 = null;
        int stackIn_28_2 = 0;
        int stackIn_28_3 = 0;
        je stackIn_30_0 = null;
        je stackIn_30_1 = null;
        int stackIn_30_2 = 0;
        int stackIn_30_3 = 0;
        je stackIn_32_0 = null;
        je stackIn_32_1 = null;
        int stackIn_32_2 = 0;
        int stackIn_32_3 = 0;
        je stackIn_33_0 = null;
        je stackIn_33_1 = null;
        int stackIn_33_2 = 0;
        int stackIn_33_3 = 0;
        int stackIn_33_4 = 0;
        je stackIn_38_0 = null;
        je stackIn_38_1 = null;
        int stackIn_38_2 = 0;
        int stackIn_38_3 = 0;
        je stackIn_40_0 = null;
        je stackIn_40_1 = null;
        int stackIn_40_2 = 0;
        int stackIn_40_3 = 0;
        je stackIn_42_0 = null;
        je stackIn_42_1 = null;
        int stackIn_42_2 = 0;
        int stackIn_42_3 = 0;
        je stackIn_43_0 = null;
        je stackIn_43_1 = null;
        int stackIn_43_2 = 0;
        int stackIn_43_3 = 0;
        int stackIn_43_4 = 0;
        Object stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        Object stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        Object stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        Object stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        Object stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        Object stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_82_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
        je stackOut_37_0 = null;
        je stackOut_37_1 = null;
        int stackOut_37_2 = 0;
        int stackOut_37_3 = 0;
        je stackOut_42_0 = null;
        je stackOut_42_1 = null;
        int stackOut_42_2 = 0;
        int stackOut_42_3 = 0;
        int stackOut_42_4 = 0;
        je stackOut_38_0 = null;
        je stackOut_38_1 = null;
        int stackOut_38_2 = 0;
        int stackOut_38_3 = 0;
        je stackOut_40_0 = null;
        je stackOut_40_1 = null;
        int stackOut_40_2 = 0;
        int stackOut_40_3 = 0;
        int stackOut_40_4 = 0;
        je stackOut_27_0 = null;
        je stackOut_27_1 = null;
        int stackOut_27_2 = 0;
        int stackOut_27_3 = 0;
        je stackOut_32_0 = null;
        je stackOut_32_1 = null;
        int stackOut_32_2 = 0;
        int stackOut_32_3 = 0;
        int stackOut_32_4 = 0;
        je stackOut_28_0 = null;
        je stackOut_28_1 = null;
        int stackOut_28_2 = 0;
        int stackOut_28_3 = 0;
        je stackOut_30_0 = null;
        je stackOut_30_1 = null;
        int stackOut_30_2 = 0;
        int stackOut_30_3 = 0;
        int stackOut_30_4 = 0;
        je stackOut_17_0 = null;
        je stackOut_17_1 = null;
        int stackOut_17_2 = 0;
        int stackOut_17_3 = 0;
        int stackOut_17_4 = 0;
        je stackOut_22_0 = null;
        je stackOut_22_1 = null;
        int stackOut_22_2 = 0;
        int stackOut_22_3 = 0;
        int stackOut_22_4 = 0;
        int stackOut_22_5 = 0;
        je stackOut_18_0 = null;
        je stackOut_18_1 = null;
        int stackOut_18_2 = 0;
        int stackOut_18_3 = 0;
        int stackOut_18_4 = 0;
        je stackOut_20_0 = null;
        je stackOut_20_1 = null;
        int stackOut_20_2 = 0;
        int stackOut_20_3 = 0;
        int stackOut_20_4 = 0;
        int stackOut_20_5 = 0;
        je stackOut_6_0 = null;
        je stackOut_6_1 = null;
        int stackOut_6_2 = 0;
        je stackOut_11_0 = null;
        je stackOut_11_1 = null;
        int stackOut_11_2 = 0;
        int stackOut_11_3 = 0;
        je stackOut_7_0 = null;
        je stackOut_7_1 = null;
        int stackOut_7_2 = 0;
        je stackOut_9_0 = null;
        je stackOut_9_1 = null;
        int stackOut_9_2 = 0;
        int stackOut_9_3 = 0;
        Object stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        Object stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        Object stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        Object stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        Object stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        String stackOut_81_2 = null;
        Object stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        var10 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              var6 = null;
              if (param0.field_Zb.a(0, param0, new nk[0], 32768, param0.field_Xb[2]).length <= 0) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_5_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var7 = stackIn_5_0;
              if (param0.field_t <= 0) {
                if (Math.abs(param3) <= 80000) {
                  if (Math.abs(param3) >= 60000) {
                    if (param0.field_U != 0) {
                      L3: {
                        stackOut_37_0 = null;
                        stackOut_37_1 = null;
                        stackOut_37_2 = 3;
                        stackOut_37_3 = 0;
                        stackIn_42_0 = stackOut_37_0;
                        stackIn_42_1 = stackOut_37_1;
                        stackIn_42_2 = stackOut_37_2;
                        stackIn_42_3 = stackOut_37_3;
                        stackIn_38_0 = stackOut_37_0;
                        stackIn_38_1 = stackOut_37_1;
                        stackIn_38_2 = stackOut_37_2;
                        stackIn_38_3 = stackOut_37_3;
                        if (!param0.field_Lb) {
                          stackOut_42_0 = null;
                          stackOut_42_1 = null;
                          stackOut_42_2 = stackIn_42_2;
                          stackOut_42_3 = stackIn_42_3;
                          stackOut_42_4 = 60;
                          stackIn_43_0 = stackOut_42_0;
                          stackIn_43_1 = stackOut_42_1;
                          stackIn_43_2 = stackOut_42_2;
                          stackIn_43_3 = stackOut_42_3;
                          stackIn_43_4 = stackOut_42_4;
                          break L3;
                        } else {
                          stackOut_38_0 = null;
                          stackOut_38_1 = null;
                          stackOut_38_2 = stackIn_38_2;
                          stackOut_38_3 = stackIn_38_3;
                          stackIn_40_0 = stackOut_38_0;
                          stackIn_40_1 = stackOut_38_1;
                          stackIn_40_2 = stackOut_38_2;
                          stackIn_40_3 = stackOut_38_3;
                          stackOut_40_0 = null;
                          stackOut_40_1 = null;
                          stackOut_40_2 = stackIn_40_2;
                          stackOut_40_3 = stackIn_40_3;
                          stackOut_40_4 = 32;
                          stackIn_43_0 = stackOut_40_0;
                          stackIn_43_1 = stackOut_40_1;
                          stackIn_43_2 = stackOut_40_2;
                          stackIn_43_3 = stackOut_40_3;
                          stackIn_43_4 = stackOut_40_4;
                          break L3;
                        }
                      }
                      var6 = (Object) (Object) new je(stackIn_43_2, stackIn_43_3, stackIn_43_4 + ((ee) this).field_r);
                      ((je) var6).field_p = true;
                      ((je) var6).field_u = 5000 * param4 + param0.field_hc;
                      ((je) var6).field_y = -20000 + param0.field_Gb;
                      break L2;
                    } else {
                      var8_ref_je = new je(6, param4, 2 + ((ee) this).field_r);
                      var8_ref_je.field_p = true;
                      param0.field_B.a(3, (ck) (Object) var8_ref_je);
                      break L2;
                    }
                  } else {
                    L4: {
                      var8_ref_je = new je(6, -param4, 2 + ((ee) this).field_r);
                      var8_ref_je.field_p = true;
                      param0.field_B.a(3, (ck) (Object) var8_ref_je);
                      if (var7 == 0) {
                        break L4;
                      } else {
                        L5: {
                          stackOut_27_0 = null;
                          stackOut_27_1 = null;
                          stackOut_27_2 = 3;
                          stackOut_27_3 = 0;
                          stackIn_32_0 = stackOut_27_0;
                          stackIn_32_1 = stackOut_27_1;
                          stackIn_32_2 = stackOut_27_2;
                          stackIn_32_3 = stackOut_27_3;
                          stackIn_28_0 = stackOut_27_0;
                          stackIn_28_1 = stackOut_27_1;
                          stackIn_28_2 = stackOut_27_2;
                          stackIn_28_3 = stackOut_27_3;
                          if (param0.field_Lb) {
                            stackOut_32_0 = null;
                            stackOut_32_1 = null;
                            stackOut_32_2 = stackIn_32_2;
                            stackOut_32_3 = stackIn_32_3;
                            stackOut_32_4 = 32;
                            stackIn_33_0 = stackOut_32_0;
                            stackIn_33_1 = stackOut_32_1;
                            stackIn_33_2 = stackOut_32_2;
                            stackIn_33_3 = stackOut_32_3;
                            stackIn_33_4 = stackOut_32_4;
                            break L5;
                          } else {
                            stackOut_28_0 = null;
                            stackOut_28_1 = null;
                            stackOut_28_2 = stackIn_28_2;
                            stackOut_28_3 = stackIn_28_3;
                            stackIn_30_0 = stackOut_28_0;
                            stackIn_30_1 = stackOut_28_1;
                            stackIn_30_2 = stackOut_28_2;
                            stackIn_30_3 = stackOut_28_3;
                            stackOut_30_0 = null;
                            stackOut_30_1 = null;
                            stackOut_30_2 = stackIn_30_2;
                            stackOut_30_3 = stackIn_30_3;
                            stackOut_30_4 = 60;
                            stackIn_33_0 = stackOut_30_0;
                            stackIn_33_1 = stackOut_30_1;
                            stackIn_33_2 = stackOut_30_2;
                            stackIn_33_3 = stackOut_30_3;
                            stackIn_33_4 = stackOut_30_4;
                            break L5;
                          }
                        }
                        var6 = (Object) (Object) new je(stackIn_33_2, stackIn_33_3, stackIn_33_4 + ((ee) this).field_r);
                        ((je) var6).field_y = -20000 + param0.field_Gb;
                        ((je) var6).field_u = param0.field_hc - 20000 * param4;
                        ((je) var6).field_p = true;
                        break L4;
                      }
                    }
                    break L2;
                  }
                } else {
                  L6: {
                    var8_ref_je = new je(6, param4, 2 + ((ee) this).field_r);
                    var8_ref_je.field_p = true;
                    param0.field_B.a(3, (ck) (Object) var8_ref_je);
                    if (var7 == 0) {
                      break L6;
                    } else {
                      L7: {
                        stackOut_17_0 = null;
                        stackOut_17_1 = null;
                        stackOut_17_2 = 3;
                        stackOut_17_3 = 0;
                        stackOut_17_4 = ((ee) this).field_r;
                        stackIn_22_0 = stackOut_17_0;
                        stackIn_22_1 = stackOut_17_1;
                        stackIn_22_2 = stackOut_17_2;
                        stackIn_22_3 = stackOut_17_3;
                        stackIn_22_4 = stackOut_17_4;
                        stackIn_18_0 = stackOut_17_0;
                        stackIn_18_1 = stackOut_17_1;
                        stackIn_18_2 = stackOut_17_2;
                        stackIn_18_3 = stackOut_17_3;
                        stackIn_18_4 = stackOut_17_4;
                        if (param0.field_Lb) {
                          stackOut_22_0 = null;
                          stackOut_22_1 = null;
                          stackOut_22_2 = stackIn_22_2;
                          stackOut_22_3 = stackIn_22_3;
                          stackOut_22_4 = stackIn_22_4;
                          stackOut_22_5 = 32;
                          stackIn_23_0 = stackOut_22_0;
                          stackIn_23_1 = stackOut_22_1;
                          stackIn_23_2 = stackOut_22_2;
                          stackIn_23_3 = stackOut_22_3;
                          stackIn_23_4 = stackOut_22_4;
                          stackIn_23_5 = stackOut_22_5;
                          break L7;
                        } else {
                          stackOut_18_0 = null;
                          stackOut_18_1 = null;
                          stackOut_18_2 = stackIn_18_2;
                          stackOut_18_3 = stackIn_18_3;
                          stackOut_18_4 = stackIn_18_4;
                          stackIn_20_0 = stackOut_18_0;
                          stackIn_20_1 = stackOut_18_1;
                          stackIn_20_2 = stackOut_18_2;
                          stackIn_20_3 = stackOut_18_3;
                          stackIn_20_4 = stackOut_18_4;
                          stackOut_20_0 = null;
                          stackOut_20_1 = null;
                          stackOut_20_2 = stackIn_20_2;
                          stackOut_20_3 = stackIn_20_3;
                          stackOut_20_4 = stackIn_20_4;
                          stackOut_20_5 = 60;
                          stackIn_23_0 = stackOut_20_0;
                          stackIn_23_1 = stackOut_20_1;
                          stackIn_23_2 = stackOut_20_2;
                          stackIn_23_3 = stackOut_20_3;
                          stackIn_23_4 = stackOut_20_4;
                          stackIn_23_5 = stackOut_20_5;
                          break L7;
                        }
                      }
                      var6 = (Object) (Object) new je(stackIn_23_2, stackIn_23_3, stackIn_23_4 - -stackIn_23_5);
                      ((je) var6).field_u = param2.field_hc;
                      ((je) var6).field_y = -20000 + param0.field_Gb;
                      ((je) var6).field_p = true;
                      break L6;
                    }
                  }
                  break L2;
                }
              } else {
                L8: {
                  stackOut_6_0 = null;
                  stackOut_6_1 = null;
                  stackOut_6_2 = 6;
                  stackIn_11_0 = stackOut_6_0;
                  stackIn_11_1 = stackOut_6_1;
                  stackIn_11_2 = stackOut_6_2;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  stackIn_7_2 = stackOut_6_2;
                  if (param0.field_hc >> 4 < param0.field_t) {
                    stackOut_11_0 = null;
                    stackOut_11_1 = null;
                    stackOut_11_2 = stackIn_11_2;
                    stackOut_11_3 = 1;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    stackIn_12_2 = stackOut_11_2;
                    stackIn_12_3 = stackOut_11_3;
                    break L8;
                  } else {
                    stackOut_7_0 = null;
                    stackOut_7_1 = null;
                    stackOut_7_2 = stackIn_7_2;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
                    stackIn_9_2 = stackOut_7_2;
                    stackOut_9_0 = null;
                    stackOut_9_1 = null;
                    stackOut_9_2 = stackIn_9_2;
                    stackOut_9_3 = -1;
                    stackIn_12_0 = stackOut_9_0;
                    stackIn_12_1 = stackOut_9_1;
                    stackIn_12_2 = stackOut_9_2;
                    stackIn_12_3 = stackOut_9_3;
                    break L8;
                  }
                }
                var8_ref_je = new je(stackIn_12_2, stackIn_12_3, 2 + ((ee) this).field_r);
                var8_ref_je.field_p = true;
                param0.field_B.a(3, (ck) (Object) var8_ref_je);
                break L2;
              }
            }
            L9: {
              L10: {
                var8 = 0;
                if (!param0.field_Lb) {
                  break L10;
                } else {
                  if (this.a(((ee) this).field_z, (byte) -92, 2, param0, param2, 2600, 3 + ((ee) this).field_r)) {
                    boolean discarded$1 = this.a(((ee) this).field_z, (byte) -87, 2, param0, param2, 2600, ((ee) this).field_r + 15);
                    var9 = new je(6, -param4, 30 + ((ee) this).field_r);
                    var9.field_p = true;
                    param0.field_B.a(3, (ck) (Object) var9);
                    break L9;
                  } else {
                    break L10;
                  }
                }
              }
              if (param0.field_Tb <= 1) {
                if (!this.a(((ee) this).field_z, (byte) -30, 0, param0, param2, 1280, ((ee) this).field_r - -3)) {
                  break L9;
                } else {
                  var9 = new je(6, -param4, ((ee) this).field_r - -50);
                  var9.field_p = true;
                  param0.field_B.a(3, (ck) (Object) var9);
                  break L9;
                }
              } else {
                if (this.a(((ee) this).field_z, (byte) -75, 1, param0, param2, 4608, ((ee) this).field_r - -3)) {
                  var9 = new je(6, -param4, ((ee) this).field_r - -25);
                  var9.field_p = true;
                  param0.field_B.a(3, (ck) (Object) var9);
                  break L9;
                } else {
                  if (this.a(((ee) this).field_z, (byte) -26, 0, param0, param2, 1280, ((ee) this).field_r + 3)) {
                    var9 = new je(6, -param4, ((ee) this).field_r + 50);
                    var9.field_p = true;
                    param0.field_B.a(3, (ck) (Object) var9);
                    break L9;
                  } else {
                    break L9;
                  }
                }
              }
            }
            L11: {
              if (var6 == null) {
                break L11;
              } else {
                if (param0.field_Tb > 0) {
                  param0.field_B.a(3, (ck) var6);
                  break L11;
                } else {
                  break L11;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var6 = (Object) (Object) decompiledCaughtException;
            stackOut_74_0 = var6;
            stackOut_74_1 = new StringBuilder().append("ee.DA(");
            stackIn_77_0 = stackOut_74_0;
            stackIn_77_1 = stackOut_74_1;
            stackIn_75_0 = stackOut_74_0;
            stackIn_75_1 = stackOut_74_1;
            if (param0 == null) {
              stackOut_77_0 = stackIn_77_0;
              stackOut_77_1 = (StringBuilder) (Object) stackIn_77_1;
              stackOut_77_2 = "null";
              stackIn_78_0 = stackOut_77_0;
              stackIn_78_1 = stackOut_77_1;
              stackIn_78_2 = stackOut_77_2;
              break L12;
            } else {
              stackOut_75_0 = stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "{...}";
              stackIn_78_0 = stackOut_75_0;
              stackIn_78_1 = stackOut_75_1;
              stackIn_78_2 = stackOut_75_2;
              break L12;
            }
          }
          L13: {
            stackOut_78_0 = stackIn_78_0;
            stackOut_78_1 = ((StringBuilder) (Object) stackIn_78_1).append(stackIn_78_2).append(44).append(-35).append(44);
            stackIn_81_0 = stackOut_78_0;
            stackIn_81_1 = stackOut_78_1;
            stackIn_79_0 = stackOut_78_0;
            stackIn_79_1 = stackOut_78_1;
            if (param2 == null) {
              stackOut_81_0 = stackIn_81_0;
              stackOut_81_1 = (StringBuilder) (Object) stackIn_81_1;
              stackOut_81_2 = "null";
              stackIn_82_0 = stackOut_81_0;
              stackIn_82_1 = stackOut_81_1;
              stackIn_82_2 = stackOut_81_2;
              break L13;
            } else {
              stackOut_79_0 = stackIn_79_0;
              stackOut_79_1 = (StringBuilder) (Object) stackIn_79_1;
              stackOut_79_2 = "{...}";
              stackIn_82_0 = stackOut_79_0;
              stackIn_82_1 = stackOut_79_1;
              stackIn_82_2 = stackOut_79_2;
              break L13;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_82_0, stackIn_82_2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    private final int a(boolean param0, int param1) {
        RuntimeException var3 = null;
        int[] var3_array = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            var3_array = new int[]{0, 6, 12, 18, 23, 29, fg.field_Xb.length};
            var4 = var3_array[param1] + ((ee) this).field_D.a(115, var3_array[1 + param1] + -var3_array[param1]);
            stackOut_3_0 = fg.field_Xb[var4];
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var3, "ee.GA(" + 0 + 44 + param1 + 41);
        }
        return stackIn_4_0;
    }

    private final int a(mb param0, int param1, byte param2, int param3, mb param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        je var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        double var11_double = 0.0;
        int var12 = 0;
        int var13 = 0;
        nk[] var13_ref_nk__ = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int stackIn_8_0 = 0;
        int stackIn_125_0 = 0;
        RuntimeException stackIn_127_0 = null;
        StringBuilder stackIn_127_1 = null;
        RuntimeException stackIn_129_0 = null;
        StringBuilder stackIn_129_1 = null;
        RuntimeException stackIn_130_0 = null;
        StringBuilder stackIn_130_1 = null;
        String stackIn_130_2 = null;
        RuntimeException stackIn_131_0 = null;
        StringBuilder stackIn_131_1 = null;
        RuntimeException stackIn_133_0 = null;
        StringBuilder stackIn_133_1 = null;
        RuntimeException stackIn_134_0 = null;
        StringBuilder stackIn_134_1 = null;
        String stackIn_134_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_124_0 = 0;
        RuntimeException stackOut_126_0 = null;
        StringBuilder stackOut_126_1 = null;
        RuntimeException stackOut_129_0 = null;
        StringBuilder stackOut_129_1 = null;
        String stackOut_129_2 = null;
        RuntimeException stackOut_127_0 = null;
        StringBuilder stackOut_127_1 = null;
        String stackOut_127_2 = null;
        RuntimeException stackOut_130_0 = null;
        StringBuilder stackOut_130_1 = null;
        RuntimeException stackOut_133_0 = null;
        StringBuilder stackOut_133_1 = null;
        String stackOut_133_2 = null;
        RuntimeException stackOut_131_0 = null;
        StringBuilder stackOut_131_1 = null;
        String stackOut_131_2 = null;
        var16 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              L2: {
                if (10 != di.field_g) {
                  break L2;
                } else {
                  if (ge.field_j != 0) {
                    break L2;
                  } else {
                    stackOut_5_0 = 1;
                    stackIn_8_0 = stackOut_5_0;
                    break L1;
                  }
                }
              }
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L1;
            }
            L3: {
              L4: {
                var7_int = stackIn_8_0;
                if (param4.field_Gb > -55000) {
                  break L4;
                } else {
                  if (!((ee) this).field_fb) {
                    break L3;
                  } else {
                    if (!((ee) this).field_j) {
                      break L3;
                    } else {
                      if (param4.field_Gb <= -200000) {
                        break L3;
                      } else {
                        if (0 != (((ee) this).field_r & 15)) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
              }
              if (param4.field_B.f(7)) {
                L5: {
                  var8 = new je(3, 0, 10 + ((ee) this).field_r);
                  var8.field_u = (((ee) this).field_r * 77 % (((ee) this).field_ab.a(-123) / 4) - ((ee) this).field_ab.a(1) / 8 << 4) + param0.field_hc;
                  var9 = 5000;
                  var10 = 1;
                  if (var7_int != 0) {
                    L6: {
                      var9 = 50000;
                      if (~param4.field_hc > ~param0.field_hc) {
                        L7: {
                          if (var8.field_u <= -var9 + param0.field_hc) {
                            break L7;
                          } else {
                            var8.field_u = param0.field_hc + -var9;
                            break L7;
                          }
                        }
                        if (var8.field_u >= 0) {
                          break L6;
                        } else {
                          var8.field_u = var9 + param0.field_hc;
                          break L6;
                        }
                      } else {
                        L8: {
                          if (param0.field_hc - -var9 > var8.field_u) {
                            var8.field_u = param0.field_hc - -var9;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        if (var8.field_u <= ((ee) this).field_ab.a(29) << 4) {
                          break L6;
                        } else {
                          var8.field_u = param0.field_hc - var9;
                          break L6;
                        }
                      }
                    }
                    var8.field_y = -60000;
                    break L5;
                  } else {
                    L9: {
                      if (param4.field_Xb.length != 0) {
                        break L9;
                      } else {
                        if (param4.field_Xb[0] == 1) {
                          L10: {
                            var9 = 100000;
                            if (param4.field_hc >= param0.field_hc) {
                              L11: {
                                if (~var8.field_u <= ~(var9 + param0.field_hc)) {
                                  break L11;
                                } else {
                                  var8.field_u = param0.field_hc + var9;
                                  break L11;
                                }
                              }
                              if (var8.field_u <= ((ee) this).field_ab.a(-124) << 4) {
                                break L10;
                              } else {
                                var8.field_u = param0.field_hc + -var9;
                                break L10;
                              }
                            } else {
                              L12: {
                                if (var8.field_u <= param0.field_hc - var9) {
                                  break L12;
                                } else {
                                  var8.field_u = param0.field_hc + -var9;
                                  break L12;
                                }
                              }
                              if (var8.field_u < 0) {
                                var8.field_u = param0.field_hc - -var9;
                                break L10;
                              } else {
                                break L10;
                              }
                            }
                          }
                          var8.field_y = -60000;
                          break L5;
                        } else {
                          break L9;
                        }
                      }
                    }
                    L13: {
                      if (~var8.field_u <= ~(param4.field_hc - var9)) {
                        break L13;
                      } else {
                        var8.field_u = -var9 + param4.field_hc;
                        break L13;
                      }
                    }
                    L14: {
                      var8.field_y = -30000 + param0.field_Gb;
                      if (~var8.field_u >= ~(param4.field_hc - -var9)) {
                        break L14;
                      } else {
                        var8.field_u = var9 + param4.field_hc;
                        break L14;
                      }
                    }
                    if (Math.abs(param1) <= 80000) {
                      break L5;
                    } else {
                      var10 = 0;
                      break L5;
                    }
                  }
                }
                L15: {
                  if (!((ee) this).field_fb) {
                    break L15;
                  } else {
                    if (((ee) this).field_j) {
                      var8.field_y = -5000 + param4.field_Gb;
                      if (-199000 <= param4.field_Gb) {
                        break L15;
                      } else {
                        param4.field_Hb = true;
                        param4.b(4);
                        System.out.println(param4.field_Bb + " unlinked");
                        break L15;
                      }
                    } else {
                      break L15;
                    }
                  }
                }
                L16: {
                  var8.field_p = true;
                  param4.field_B.a(3, (ck) (Object) var8);
                  param4.field_Tb = param4.field_x;
                  if (param4.field_Xb.length > 0) {
                    var8 = new je(0, param4.field_Xb[0], ((ee) this).field_r - -20);
                    break L16;
                  } else {
                    var10 = 0;
                    break L16;
                  }
                }
                if (var10 != 0) {
                  if (param4.field_Xb[0] == 1) {
                    var8 = new je(0, param4.field_Xb[1], (((ee) this).field_r - -param0.field_hc - -param4.field_hc) % 50 + ((ee) this).field_r + 29);
                    var8.field_y = param0.field_Gb;
                    var8.field_u = param0.field_hc;
                    var11 = 2500;
                    var12 = 0;
                    var13 = 8192;
                    var14 = 32768;
                    int discarded$1 = -1;
                    this.a(param5, param3, param1, var11, var13, var8, var12, var14);
                    var8.field_p = true;
                    param4.field_B.a(3, (ck) (Object) var8);
                    break L3;
                  } else {
                    var11_double = Math.atan2((double)param1, (double)(-param3));
                    var8.field_B = (int)(65536.0 * var11_double / 6.283185307179586);
                    var13_ref_nk__ = param4.field_Zb.a(0, param4, new nk[0], var8.field_B * param5, param4.field_Xb[0]);
                    param4.field_Zb.b((byte) -128, 0, param5, 0);
                    var14 = 0;
                    var15 = 0;
                    L17: while (true) {
                      if (~var13_ref_nk__.length >= ~var15) {
                        L18: {
                          if (var13_ref_nk__.length > 0) {
                            param3 = param3 - var14 / var13_ref_nk__.length;
                            break L18;
                          } else {
                            break L18;
                          }
                        }
                        L19: {
                          var11_double = Math.atan2((double)param1, (double)(-param3));
                          var8.field_B = (int)(var11_double * 65536.0 / 6.283185307179586);
                          var8.field_u = param0.field_hc;
                          var8.field_y = param0.field_Gb;
                          if (0 > param5) {
                            if (var8.field_B <= 16384) {
                              break L19;
                            } else {
                              var8.field_B = var8.field_B - 65536;
                              break L19;
                            }
                          } else {
                            if (var8.field_B < -16384) {
                              var8.field_B = var8.field_B + 65536;
                              break L19;
                            } else {
                              break L19;
                            }
                          }
                        }
                        var8.field_p = true;
                        param4.field_B.a(3, (ck) (Object) var8);
                        break L3;
                      } else {
                        var14 = var14 + var13_ref_nk__[var15].field_V;
                        var15++;
                        continue L17;
                      }
                    }
                  }
                } else {
                  break L3;
                }
              } else {
                break L3;
              }
            }
            stackOut_124_0 = param3;
            stackIn_125_0 = stackOut_124_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var7 = decompiledCaughtException;
            stackOut_126_0 = (RuntimeException) var7;
            stackOut_126_1 = new StringBuilder().append("ee.T(");
            stackIn_129_0 = stackOut_126_0;
            stackIn_129_1 = stackOut_126_1;
            stackIn_127_0 = stackOut_126_0;
            stackIn_127_1 = stackOut_126_1;
            if (param0 == null) {
              stackOut_129_0 = (RuntimeException) (Object) stackIn_129_0;
              stackOut_129_1 = (StringBuilder) (Object) stackIn_129_1;
              stackOut_129_2 = "null";
              stackIn_130_0 = stackOut_129_0;
              stackIn_130_1 = stackOut_129_1;
              stackIn_130_2 = stackOut_129_2;
              break L20;
            } else {
              stackOut_127_0 = (RuntimeException) (Object) stackIn_127_0;
              stackOut_127_1 = (StringBuilder) (Object) stackIn_127_1;
              stackOut_127_2 = "{...}";
              stackIn_130_0 = stackOut_127_0;
              stackIn_130_1 = stackOut_127_1;
              stackIn_130_2 = stackOut_127_2;
              break L20;
            }
          }
          L21: {
            stackOut_130_0 = (RuntimeException) (Object) stackIn_130_0;
            stackOut_130_1 = ((StringBuilder) (Object) stackIn_130_1).append(stackIn_130_2).append(44).append(param1).append(44).append(-64).append(44).append(param3).append(44);
            stackIn_133_0 = stackOut_130_0;
            stackIn_133_1 = stackOut_130_1;
            stackIn_131_0 = stackOut_130_0;
            stackIn_131_1 = stackOut_130_1;
            if (param4 == null) {
              stackOut_133_0 = (RuntimeException) (Object) stackIn_133_0;
              stackOut_133_1 = (StringBuilder) (Object) stackIn_133_1;
              stackOut_133_2 = "null";
              stackIn_134_0 = stackOut_133_0;
              stackIn_134_1 = stackOut_133_1;
              stackIn_134_2 = stackOut_133_2;
              break L21;
            } else {
              stackOut_131_0 = (RuntimeException) (Object) stackIn_131_0;
              stackOut_131_1 = (StringBuilder) (Object) stackIn_131_1;
              stackOut_131_2 = "{...}";
              stackIn_134_0 = stackOut_131_0;
              stackIn_134_1 = stackOut_131_1;
              stackIn_134_2 = stackOut_131_2;
              break L21;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_134_0, stackIn_134_2 + 44 + param5 + 41);
        }
        return stackIn_125_0;
    }

    private final void a(int param0, int param1, byte param2, mb param3, mb param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        je var9 = null;
        int var10 = 0;
        je stackIn_44_0 = null;
        je stackIn_44_1 = null;
        int stackIn_44_2 = 0;
        je stackIn_46_0 = null;
        je stackIn_46_1 = null;
        int stackIn_46_2 = 0;
        je stackIn_48_0 = null;
        je stackIn_48_1 = null;
        int stackIn_48_2 = 0;
        je stackIn_49_0 = null;
        je stackIn_49_1 = null;
        int stackIn_49_2 = 0;
        int stackIn_49_3 = 0;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_61_2 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_65_2 = null;
        RuntimeException decompiledCaughtException = null;
        je stackOut_43_0 = null;
        je stackOut_43_1 = null;
        int stackOut_43_2 = 0;
        je stackOut_48_0 = null;
        je stackOut_48_1 = null;
        int stackOut_48_2 = 0;
        int stackOut_48_3 = 0;
        je stackOut_44_0 = null;
        je stackOut_44_1 = null;
        int stackOut_44_2 = 0;
        je stackOut_46_0 = null;
        je stackOut_46_1 = null;
        int stackOut_46_2 = 0;
        int stackOut_46_3 = 0;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        var10 = SteelSentinels.field_G;
        try {
          L0: {
            var7_int = 1;
            var8 = 0;
            if (var7_int != 0) {
              L1: {
                if (param4.field_Xb[4] != 19) {
                  if (param4.field_u) {
                    break L1;
                  } else {
                    boolean discarded$3 = this.a(((ee) this).field_z, (byte) -85, 4, param4, param3, 2600, 5 + ((ee) this).field_r);
                    break L1;
                  }
                } else {
                  if (param4.field_u) {
                    break L1;
                  } else {
                    boolean discarded$4 = this.a(((ee) this).field_z / 2, (byte) -76, 4, param4, param3, 2600, ((ee) this).field_r + 5);
                    break L1;
                  }
                }
              }
              L2: {
                L3: {
                  if (var8 != 0) {
                    break L3;
                  } else {
                    if (!this.a(((ee) this).field_z, (byte) -36, 2, param4, param3, 2304, 25 + ((ee) this).field_r)) {
                      break L3;
                    } else {
                      if (param4.field_t != 0) {
                        break L2;
                      } else {
                        if (30000 > Math.abs(param5)) {
                          break L2;
                        } else {
                          var9 = new je(6, param1, ((ee) this).field_r + 27);
                          var9.field_p = true;
                          param4.field_B.a(3, (ck) (Object) var9);
                          break L2;
                        }
                      }
                    }
                  }
                }
                L4: {
                  L5: {
                    if (60000 < Math.abs(param5)) {
                      break L5;
                    } else {
                      if (param4.field_U == 0) {
                        break L5;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var9 = new je(6, param1, ((ee) this).field_r + 2);
                  var9.field_p = true;
                  param4.field_B.a(3, (ck) (Object) var9);
                  break L4;
                }
                if (Math.abs(param5) < 100000) {
                  boolean discarded$5 = this.a(0, (byte) -80, 0, param4, param3, 2304, 25 + ((ee) this).field_r);
                  break L2;
                } else {
                  break L2;
                }
              }
              L6: {
                if (param4.field_t <= 0) {
                  if (Math.abs(param5) < 30000) {
                    var9 = new je(6, -param1, ((ee) this).field_r + 29);
                    var9.field_p = true;
                    param4.field_B.a(3, (ck) (Object) var9);
                    break L6;
                  } else {
                    break L6;
                  }
                } else {
                  L7: {
                    stackOut_43_0 = null;
                    stackOut_43_1 = null;
                    stackOut_43_2 = 6;
                    stackIn_48_0 = stackOut_43_0;
                    stackIn_48_1 = stackOut_43_1;
                    stackIn_48_2 = stackOut_43_2;
                    stackIn_44_0 = stackOut_43_0;
                    stackIn_44_1 = stackOut_43_1;
                    stackIn_44_2 = stackOut_43_2;
                    if (~param4.field_t < ~(param4.field_hc >> 4)) {
                      stackOut_48_0 = null;
                      stackOut_48_1 = null;
                      stackOut_48_2 = stackIn_48_2;
                      stackOut_48_3 = 1;
                      stackIn_49_0 = stackOut_48_0;
                      stackIn_49_1 = stackOut_48_1;
                      stackIn_49_2 = stackOut_48_2;
                      stackIn_49_3 = stackOut_48_3;
                      break L7;
                    } else {
                      stackOut_44_0 = null;
                      stackOut_44_1 = null;
                      stackOut_44_2 = stackIn_44_2;
                      stackIn_46_0 = stackOut_44_0;
                      stackIn_46_1 = stackOut_44_1;
                      stackIn_46_2 = stackOut_44_2;
                      stackOut_46_0 = null;
                      stackOut_46_1 = null;
                      stackOut_46_2 = stackIn_46_2;
                      stackOut_46_3 = -1;
                      stackIn_49_0 = stackOut_46_0;
                      stackIn_49_1 = stackOut_46_1;
                      stackIn_49_2 = stackOut_46_2;
                      stackIn_49_3 = stackOut_46_3;
                      break L7;
                    }
                  }
                  var9 = new je(stackIn_49_2, stackIn_49_3, 2 + ((ee) this).field_r);
                  var9.field_p = true;
                  param4.field_B.a(3, (ck) (Object) var9);
                  break L6;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var7 = decompiledCaughtException;
            stackOut_57_0 = (RuntimeException) var7;
            stackOut_57_1 = new StringBuilder().append("ee.S(").append(param0).append(44).append(param1).append(44).append(21).append(44);
            stackIn_60_0 = stackOut_57_0;
            stackIn_60_1 = stackOut_57_1;
            stackIn_58_0 = stackOut_57_0;
            stackIn_58_1 = stackOut_57_1;
            if (param3 == null) {
              stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
              stackOut_60_1 = (StringBuilder) (Object) stackIn_60_1;
              stackOut_60_2 = "null";
              stackIn_61_0 = stackOut_60_0;
              stackIn_61_1 = stackOut_60_1;
              stackIn_61_2 = stackOut_60_2;
              break L8;
            } else {
              stackOut_58_0 = (RuntimeException) (Object) stackIn_58_0;
              stackOut_58_1 = (StringBuilder) (Object) stackIn_58_1;
              stackOut_58_2 = "{...}";
              stackIn_61_0 = stackOut_58_0;
              stackIn_61_1 = stackOut_58_1;
              stackIn_61_2 = stackOut_58_2;
              break L8;
            }
          }
          L9: {
            stackOut_61_0 = (RuntimeException) (Object) stackIn_61_0;
            stackOut_61_1 = ((StringBuilder) (Object) stackIn_61_1).append(stackIn_61_2).append(44);
            stackIn_64_0 = stackOut_61_0;
            stackIn_64_1 = stackOut_61_1;
            stackIn_62_0 = stackOut_61_0;
            stackIn_62_1 = stackOut_61_1;
            if (param4 == null) {
              stackOut_64_0 = (RuntimeException) (Object) stackIn_64_0;
              stackOut_64_1 = (StringBuilder) (Object) stackIn_64_1;
              stackOut_64_2 = "null";
              stackIn_65_0 = stackOut_64_0;
              stackIn_65_1 = stackOut_64_1;
              stackIn_65_2 = stackOut_64_2;
              break L9;
            } else {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "{...}";
              stackIn_65_0 = stackOut_62_0;
              stackIn_65_1 = stackOut_62_1;
              stackIn_65_2 = stackOut_62_2;
              break L9;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_65_0, stackIn_65_2 + 44 + param5 + 41);
        }
    }

    ee(int param0, int param1, String[] param2, int[][] param3, boolean param4, int param5, int param6, int param7, boolean param8, boolean param9) {
        RuntimeException var11 = null;
        mb var11_ref = null;
        int[][] var12 = null;
        int var13_int = 0;
        ne var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        mb stackIn_68_0 = null;
        mb stackIn_69_0 = null;
        mb stackIn_71_0 = null;
        mb stackIn_72_0 = null;
        mb stackIn_74_0 = null;
        mb stackIn_75_0 = null;
        mb stackIn_77_0 = null;
        mb stackIn_78_0 = null;
        mb stackIn_80_0 = null;
        mb stackIn_82_0 = null;
        mb stackIn_83_0 = null;
        int stackIn_83_1 = 0;
        RuntimeException stackIn_124_0 = null;
        StringBuilder stackIn_124_1 = null;
        RuntimeException stackIn_126_0 = null;
        StringBuilder stackIn_126_1 = null;
        RuntimeException stackIn_127_0 = null;
        StringBuilder stackIn_127_1 = null;
        String stackIn_127_2 = null;
        RuntimeException stackIn_128_0 = null;
        StringBuilder stackIn_128_1 = null;
        RuntimeException stackIn_130_0 = null;
        StringBuilder stackIn_130_1 = null;
        RuntimeException stackIn_131_0 = null;
        StringBuilder stackIn_131_1 = null;
        String stackIn_131_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        mb stackOut_67_0 = null;
        mb stackOut_68_0 = null;
        mb stackOut_69_0 = null;
        mb stackOut_71_0 = null;
        mb stackOut_72_0 = null;
        mb stackOut_74_0 = null;
        mb stackOut_75_0 = null;
        mb stackOut_77_0 = null;
        mb stackOut_78_0 = null;
        mb stackOut_80_0 = null;
        int stackOut_80_1 = 0;
        mb stackOut_82_0 = null;
        int stackOut_82_1 = 0;
        RuntimeException stackOut_123_0 = null;
        StringBuilder stackOut_123_1 = null;
        RuntimeException stackOut_126_0 = null;
        StringBuilder stackOut_126_1 = null;
        String stackOut_126_2 = null;
        RuntimeException stackOut_124_0 = null;
        StringBuilder stackOut_124_1 = null;
        String stackOut_124_2 = null;
        RuntimeException stackOut_127_0 = null;
        StringBuilder stackOut_127_1 = null;
        RuntimeException stackOut_130_0 = null;
        StringBuilder stackOut_130_1 = null;
        String stackOut_130_2 = null;
        RuntimeException stackOut_128_0 = null;
        StringBuilder stackOut_128_1 = null;
        String stackOut_128_2 = null;
        var19 = SteelSentinels.field_G;
        ((ee) this).field_g = -1;
        ((ee) this).field_n = -1;
        ((ee) this).field_t = 0;
        ((ee) this).field_w = 0;
        ((ee) this).field_D = null;
        ((ee) this).field_m = 0;
        ((ee) this).field_A = -1;
        ((ee) this).field_p = false;
        ((ee) this).field_i = 0;
        ((ee) this).field_B = -1;
        try {
          L0: {
            L1: {
              ((ee) this).field_c = param1;
              ((ee) this).field_Y = param0;
              ((ee) this).field_P = param5;
              ((ee) this).field_F = param7;
              ((ee) this).field_h = param4;
              ((ee) this).field_D = new ie(new int[1]);
              ((ee) this).field_kb = param2.length;
              ((ee) this).field_q = 0;
              ((ee) this).field_bb = param2;
              ((ee) this).field_a = 0;
              if (((ee) this).field_Y % 8 == 0) {
                break L1;
              } else {
                if (((ee) this).field_Y == -1) {
                  break L1;
                } else {
                  param6 = 0;
                  break L1;
                }
              }
            }
            L2: {
              ((ee) this).field_N = 621164641;
              ((ee) this).field_f = 269488144;
              ((ee) this).field_Q = param6;
              ((ee) this).field_ab = new hd(((ee) this).field_Y, ((ee) this).field_kb + param6);
              ((ee) this).field_l = Math.max(((ee) this).field_F, 1);
              ((ee) this).field_ib = 0;
              ((ee) this).field_eb = 0;
              ((ee) this).field_s = 0;
              ((ee) this).field_r = 0;
              ((ee) this).field_K = new ul();
              ((ee) this).field_Z = new int[param6 + ((ee) this).field_kb];
              var12 = new int[][]{ua.field_v, ua.field_x, ua.field_P, ua.field_z, ua.field_N, ua.field_O, ua.field_D, ua.field_J, ua.field_E};
              ((ee) this).field_W = param8;
              ((ee) this).field_fb = param9;
              stackOut_4_0 = this;
              stackIn_7_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (((ee) this).field_P != 3) {
                stackOut_7_0 = this;
                stackOut_7_1 = 0;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                break L2;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_8_0 = stackOut_5_0;
                stackIn_8_1 = stackOut_5_1;
                break L2;
              }
            }
            ((ee) this).field_lb = stackIn_8_1 != 0;
            var13_int = 0;
            L3: while (true) {
              if (~var13_int <= ~(param6 + ((ee) this).field_kb)) {
                L4: {
                  ((ee) this).field_z = 4;
                  if (((ee) this).field_ab.b(109) != 4) {
                    break L4;
                  } else {
                    ((ee) this).field_z = 2;
                    break L4;
                  }
                }
                L5: {
                  if (((ee) this).field_ab.b(98) != 3) {
                    break L5;
                  } else {
                    ((ee) this).field_z = 3;
                    break L5;
                  }
                }
                L6: {
                  ((ee) this).field_C = new ul();
                  ((ee) this).field_u = new ul();
                  ((ee) this).field_db = new ul();
                  ((ee) this).field_T = new ul();
                  if (!((ee) this).field_h) {
                    ((ee) this).field_o = new ul();
                    ((ee) this).field_O = new ul();
                    break L6;
                  } else {
                    ((ee) this).field_O = null;
                    ((ee) this).field_o = null;
                    break L6;
                  }
                }
                L7: {
                  ((ee) this).field_e = new ul();
                  ((ee) this).field_J = new ra();
                  ((ee) this).field_cb = -1;
                  if (((ee) this).field_lb) {
                    ((ee) this).field_d = 100000;
                    ((ee) this).field_M = 3;
                    ((ee) this).field_gb = 0;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (2 != ((ee) this).field_ab.b(72)) {
                    break L8;
                  } else {
                    if (((ee) this).field_kb > 1) {
                      var13 = new ne((ee) this, 43);
                      var13.field_z = (((ee) this).field_ab.a(-119) << 4) / 2;
                      ((ee) this).field_e.a(3, (ck) (Object) var13);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                }
                break L0;
              } else {
                L9: {
                  var11_ref = new mb((((ee) this).field_ab.a(-119) << 4) * (var13_int - -1) / (((ee) this).field_kb - (-1 - param6)), -320000, (ee) this);
                  var14 = var13_int;
                  if (param6 <= 0) {
                    var14 = ((ee) this).field_kb - (1 - -var14);
                    break L9;
                  } else {
                    L10: {
                      if (((ee) this).field_kb / 2 > var13_int) {
                        break L10;
                      } else {
                        if (var13_int < param6 + ((ee) this).field_kb / 2) {
                          var14 = ((ee) this).field_kb - (((ee) this).field_kb / 2 + -var13_int);
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                    if (var13_int >= param6 + ((ee) this).field_kb / 2) {
                      var14 = var14 - param6;
                      var14 = -var14 + -1 + ((ee) this).field_kb;
                      break L9;
                    } else {
                      var14 = -var14 + ((ee) this).field_kb + -1;
                      break L9;
                    }
                  }
                }
                L11: {
                  L12: {
                    var15 = var14;
                    if (((ee) this).field_ab.b(73) == 1) {
                      break L12;
                    } else {
                      if (4 != ((ee) this).field_ab.b(118)) {
                        break L11;
                      } else {
                        break L12;
                      }
                    }
                  }
                  var15 = var14 * 2 / ((ee) this).field_kb;
                  if (1 == var15) {
                    var11_ref.field_ic = 65793;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L13: {
                  if (3 != ((ee) this).field_P) {
                    break L13;
                  } else {
                    var15 = 0;
                    break L13;
                  }
                }
                L14: {
                  if (~var14 > ~((ee) this).field_kb) {
                    if (param3[var14] == null) {
                      break L14;
                    } else {
                      L15: {
                        if (0 == ((ee) this).field_F) {
                          L16: {
                            var16 = -1;
                            var17 = param3[var14][0];
                            if (var17 != 0) {
                              if (var17 == 55) {
                                var16 = 1;
                                break L16;
                              } else {
                                if (var17 == 57) {
                                  var16 = 2;
                                  break L16;
                                } else {
                                  var16 = 1;
                                  break L16;
                                }
                              }
                            } else {
                              var16 = 0;
                              break L16;
                            }
                          }
                          param3[var14] = var12[var16];
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                      L17: {
                        L18: {
                          stackOut_67_0 = (mb) var11_ref;
                          stackIn_82_0 = stackOut_67_0;
                          stackIn_68_0 = stackOut_67_0;
                          if (null == ((ee) this).field_bb) {
                            break L18;
                          } else {
                            stackOut_68_0 = (mb) (Object) stackIn_68_0;
                            stackIn_82_0 = stackOut_68_0;
                            stackIn_69_0 = stackOut_68_0;
                            if (var14 < 0) {
                              break L18;
                            } else {
                              stackOut_69_0 = (mb) (Object) stackIn_69_0;
                              stackIn_71_0 = stackOut_69_0;
                              stackOut_71_0 = (mb) (Object) stackIn_71_0;
                              stackIn_82_0 = stackOut_71_0;
                              stackIn_72_0 = stackOut_71_0;
                              if (((ee) this).field_bb.length <= var14) {
                                break L18;
                              } else {
                                stackOut_72_0 = (mb) (Object) stackIn_72_0;
                                stackIn_74_0 = stackOut_72_0;
                                stackOut_74_0 = (mb) (Object) stackIn_74_0;
                                stackIn_82_0 = stackOut_74_0;
                                stackIn_75_0 = stackOut_74_0;
                                if (null == ((ee) this).field_bb[var14]) {
                                  break L18;
                                } else {
                                  stackOut_75_0 = (mb) (Object) stackIn_75_0;
                                  stackIn_77_0 = stackOut_75_0;
                                  stackOut_77_0 = (mb) (Object) stackIn_77_0;
                                  stackIn_82_0 = stackOut_77_0;
                                  stackIn_78_0 = stackOut_77_0;
                                  if (!((ee) this).field_bb[var14].toLowerCase().startsWith("mod")) {
                                    break L18;
                                  } else {
                                    stackOut_78_0 = (mb) (Object) stackIn_78_0;
                                    stackIn_80_0 = stackOut_78_0;
                                    stackOut_80_0 = (mb) (Object) stackIn_80_0;
                                    stackOut_80_1 = 1;
                                    stackIn_83_0 = stackOut_80_0;
                                    stackIn_83_1 = stackOut_80_1;
                                    break L17;
                                  }
                                }
                              }
                            }
                          }
                        }
                        stackOut_82_0 = (mb) (Object) stackIn_82_0;
                        stackOut_82_1 = 0;
                        stackIn_83_0 = stackOut_82_0;
                        stackIn_83_1 = stackOut_82_1;
                        break L17;
                      }
                      L19: {
                        stackIn_83_0.field_ib = stackIn_83_1 != 0;
                        var11_ref.a(param3[var14], true, false, var14, var15);
                        if (((ee) this).field_F == 1) {
                          if (6100 < hm.a((byte) 126, var11_ref.field_nb, var11_ref.field_Zb)) {
                            var11_ref.a(ua.field_x, true, false, var14, var15);
                            break L19;
                          } else {
                            break L19;
                          }
                        } else {
                          break L19;
                        }
                      }
                      L20: {
                        if (((ee) this).field_U == null) {
                          break L20;
                        } else {
                          ((ee) this).field_U.a(0, (byte) 123, var14, Integer.toString(var11_ref.field_lb));
                          break L20;
                        }
                      }
                      ((ee) this).field_K.a((ck) (Object) var11_ref, -21459);
                      break L14;
                    }
                  } else {
                    L21: {
                      var16 = 0;
                      var17 = 3;
                      if (((ee) this).field_F < 1) {
                        break L21;
                      } else {
                        var17 = 6;
                        break L21;
                      }
                    }
                    L22: {
                      if (((ee) this).field_F < 2) {
                        break L22;
                      } else {
                        var16 = 3;
                        var17 = 9;
                        break L22;
                      }
                    }
                    var18 = var16 + ((ee) this).field_D.a(-126, -var16 + var17);
                    var11_ref.a(var12[var18], true, false, var14, var15);
                    var11_ref.field_Nb = 11;
                    ((ee) this).field_K.a(3, (ck) (Object) var11_ref);
                    break L14;
                  }
                }
                L23: {
                  if (((ee) this).field_ab.b(115) == 4) {
                    var11_ref.j(-5);
                    var11_ref.field_Gb = -320000;
                    var11_ref.field_Lb = true;
                    var11_ref.field_K = 0;
                    var11_ref.field_u = true;
                    var11_ref.field_ab = 1000;
                    var11_ref.field_fc = var11_ref.field_Gb;
                    var11_ref.field_Gb = -(((ee) this).field_ab.a((byte) -115, var11_ref.field_hc >> 4) << 4) + -500;
                    var11_ref.field_z = 500;
                    var11_ref.field_fc = var11_ref.field_Gb;
                    break L23;
                  } else {
                    break L23;
                  }
                }
                var11_ref.d(-28033);
                ((ee) this).field_Z[var13_int] = 50;
                var13_int++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L24: {
            var11 = decompiledCaughtException;
            stackOut_123_0 = (RuntimeException) var11;
            stackOut_123_1 = new StringBuilder().append("ee.<init>(").append(param0).append(44).append(param1).append(44);
            stackIn_126_0 = stackOut_123_0;
            stackIn_126_1 = stackOut_123_1;
            stackIn_124_0 = stackOut_123_0;
            stackIn_124_1 = stackOut_123_1;
            if (param2 == null) {
              stackOut_126_0 = (RuntimeException) (Object) stackIn_126_0;
              stackOut_126_1 = (StringBuilder) (Object) stackIn_126_1;
              stackOut_126_2 = "null";
              stackIn_127_0 = stackOut_126_0;
              stackIn_127_1 = stackOut_126_1;
              stackIn_127_2 = stackOut_126_2;
              break L24;
            } else {
              stackOut_124_0 = (RuntimeException) (Object) stackIn_124_0;
              stackOut_124_1 = (StringBuilder) (Object) stackIn_124_1;
              stackOut_124_2 = "{...}";
              stackIn_127_0 = stackOut_124_0;
              stackIn_127_1 = stackOut_124_1;
              stackIn_127_2 = stackOut_124_2;
              break L24;
            }
          }
          L25: {
            stackOut_127_0 = (RuntimeException) (Object) stackIn_127_0;
            stackOut_127_1 = ((StringBuilder) (Object) stackIn_127_1).append(stackIn_127_2).append(44);
            stackIn_130_0 = stackOut_127_0;
            stackIn_130_1 = stackOut_127_1;
            stackIn_128_0 = stackOut_127_0;
            stackIn_128_1 = stackOut_127_1;
            if (param3 == null) {
              stackOut_130_0 = (RuntimeException) (Object) stackIn_130_0;
              stackOut_130_1 = (StringBuilder) (Object) stackIn_130_1;
              stackOut_130_2 = "null";
              stackIn_131_0 = stackOut_130_0;
              stackIn_131_1 = stackOut_130_1;
              stackIn_131_2 = stackOut_130_2;
              break L25;
            } else {
              stackOut_128_0 = (RuntimeException) (Object) stackIn_128_0;
              stackOut_128_1 = (StringBuilder) (Object) stackIn_128_1;
              stackOut_128_2 = "{...}";
              stackIn_131_0 = stackOut_128_0;
              stackIn_131_1 = stackOut_128_1;
              stackIn_131_2 = stackOut_128_2;
              break L25;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_131_0, stackIn_131_2 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 44 + param9 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = "If you leave now, your progress will be lost.<br>Log in or create a free account to save your progress.";
        field_k = "Sentinel configuration is now unlocked.<br>Go to the '<col=00ffff>Configuration</col>' screen to choose your sentinel.";
        field_L = "Age:";
        field_jb = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_x = "From only <%0>/month";
    }
}
