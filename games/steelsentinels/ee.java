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
            var4 = ((ee) this).field_ab.field_o[-param1 + param0] << 4;
            var5 = -30000;
            var6 = new wl(var3_int, var5, -1 + 2 * param1, 0, 50, 1, 17, (ee) this, (mb) null, 1000 - -((ee) this).field_R, var4, 30);
            ((ee) this).field_T.a(param0 ^ 2, (ck) (Object) var6);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "ee.D(" + param0 + ',' + param1 + ')');
        }
    }

    private final boolean e(int param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_15_0 = 0;
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
                  if (param0 <= -26) {
                    param1++;
                    L1: while (true) {
                      L2: {
                        L3: {
                          if (((ee) this).field_ab.field_n <= param1) {
                            break L3;
                          } else {
                            stackOut_19_0 = ((ee) this).field_ab.a(false, param1);
                            stackIn_32_0 = stackOut_19_0;
                            stackIn_20_0 = stackOut_19_0;
                            if (var4 != 0) {
                              break L2;
                            } else {
                              if (stackIn_20_0 > 3000) {
                                stackOut_25_0 = 1;
                                stackIn_26_0 = stackOut_25_0;
                                return stackIn_26_0 != 0;
                              } else {
                                if (this.b(true, param1)) {
                                  param1++;
                                  if (var4 == 0) {
                                    continue L1;
                                  } else {
                                    break L3;
                                  }
                                } else {
                                  stackOut_28_0 = 0;
                                  stackIn_29_0 = stackOut_28_0;
                                  return stackIn_29_0 != 0;
                                }
                              }
                            }
                          }
                        }
                        stackOut_31_0 = 0;
                        stackIn_32_0 = stackOut_31_0;
                        break L2;
                      }
                      break L0;
                    }
                  } else {
                    stackOut_15_0 = 1;
                    stackIn_16_0 = stackOut_15_0;
                    return stackIn_16_0 != 0;
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
          throw ci.a((Throwable) (Object) var3, "ee.E(" + param0 + ',' + param1 + ')');
        }
        return stackIn_32_0 != 0;
    }

    final void b(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int[][] var3_ref_int____ = null;
        int var4 = 0;
        int[] var4_ref_int__ = null;
        int[] var5_ref_int__ = null;
        int var5 = 0;
        mb var5_ref_mb = null;
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
        int stackIn_27_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_353_0 = 0;
        int stackIn_353_1 = 0;
        mb stackIn_356_0 = null;
        int stackIn_356_1 = 0;
        mb stackIn_358_0 = null;
        int stackIn_358_1 = 0;
        mb stackIn_359_0 = null;
        int stackIn_359_1 = 0;
        int stackIn_359_2 = 0;
        int stackIn_396_0 = 0;
        int stackIn_423_0 = 0;
        int stackIn_423_1 = 0;
        int stackIn_721_0 = 0;
        int stackIn_721_1 = 0;
        int stackIn_764_0 = 0;
        int stackIn_764_1 = 0;
        int stackIn_775_0 = 0;
        int stackIn_775_1 = 0;
        int stackIn_802_0 = 0;
        int stackIn_807_0 = 0;
        int stackIn_807_1 = 0;
        int stackIn_849_0 = 0;
        int stackIn_849_1 = 0;
        int stackIn_957_0 = 0;
        int stackIn_988_0 = 0;
        Object stackIn_1023_0 = null;
        Object stackIn_1023_1 = null;
        boolean stackIn_1036_0 = false;
        int stackIn_1043_0 = 0;
        Object stackIn_1133_0 = null;
        Object stackIn_1133_1 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_26_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        int stackOut_50_0 = 0;
        int stackOut_352_0 = 0;
        int stackOut_352_1 = 0;
        mb stackOut_355_0 = null;
        int stackOut_355_1 = 0;
        mb stackOut_358_0 = null;
        int stackOut_358_1 = 0;
        int stackOut_358_2 = 0;
        mb stackOut_356_0 = null;
        int stackOut_356_1 = 0;
        int stackOut_356_2 = 0;
        boolean stackOut_395_0 = false;
        int stackOut_422_0 = 0;
        int stackOut_422_1 = 0;
        int stackOut_720_0 = 0;
        int stackOut_720_1 = 0;
        int stackOut_763_0 = 0;
        int stackOut_763_1 = 0;
        int stackOut_774_0 = 0;
        int stackOut_774_1 = 0;
        int stackOut_801_0 = 0;
        int stackOut_799_0 = 0;
        int stackOut_806_0 = 0;
        int stackOut_806_1 = 0;
        int stackOut_848_0 = 0;
        int stackOut_848_1 = 0;
        int stackOut_956_0 = 0;
        boolean stackOut_987_0 = false;
        Object stackOut_1022_0 = null;
        Object stackOut_1022_1 = null;
        Object stackOut_1132_0 = null;
        Object stackOut_1132_1 = null;
        boolean stackOut_1035_0 = false;
        int stackOut_1042_0 = 0;
        var15 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              ((ee) this).field_N = ((ee) this).field_N + 2 * oh.field_f;
              if ((((ee) this).field_v & 32) != 0) {
                L2: {
                  if (((ee) this).field_ab.field_h[1] != 6000) {
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if (50 == ((ee) this).field_b) {
                  ((ee) this).field_ab.field_h[1] = -10000;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L3: {
              if ((16 & ((ee) this).field_v) != 0) {
                L4: {
                  if (((ee) this).field_ab.field_h[0] == 6000) {
                    break L4;
                  } else {
                    break L4;
                  }
                }
                if (((ee) this).field_b != 50) {
                  break L3;
                } else {
                  ((ee) this).field_ab.field_h[0] = -10000;
                  break L3;
                }
              } else {
                break L3;
              }
            }
            L5: {
              ((ee) this).field_q = ((ee) this).field_q + pi.field_c;
              ((ee) this).field_f = ((ee) this).field_f - oh.field_f;
              ((ee) this).field_a = ((ee) this).field_a - pi.field_c;
              if (!((ee) this).field_j) {
                break L5;
              } else {
                if (((ee) this).field_h) {
                  return;
                } else {
                  break L5;
                }
              }
            }
            L6: {
              if (di.field_g < 0) {
                stackOut_26_0 = 0;
                stackIn_27_0 = stackOut_26_0;
                break L6;
              } else {
                stackOut_24_0 = 1;
                stackIn_27_0 = stackOut_24_0;
                break L6;
              }
            }
            L7: {
              L8: {
                var2_int = stackIn_27_0;
                if (((ee) this).field_j) {
                  break L8;
                } else {
                  if (10 != di.field_g) {
                    break L8;
                  } else {
                    if (qh.field_Yb > 0) {
                      if (!((ee) this).f(param0 ^ -114)) {
                        break L8;
                      } else {
                        L9: {
                          var3_ref_int____ = ua.field_I[ol.field_Ub + 10 * ge.field_j];
                          if (1 + ((ee) this).field_cb >= var3_ref_int____.length) {
                            break L9;
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
                                    stackOut_44_0 = 1;
                                    stackIn_47_0 = stackOut_44_0;
                                    break L10;
                                  }
                                }
                              }
                              stackOut_46_0 = 0;
                              stackIn_47_0 = stackOut_46_0;
                              break L10;
                            }
                            var4 = stackIn_47_0;
                            var5_ref_int__ = var3_ref_int____[((ee) this).field_cb];
                            var6_int = var5_ref_int__.length;
                            var7 = 0;
                            L12: while (true) {
                              stackOut_48_0 = ~var6_int;
                              stackOut_48_1 = ~var7;
                              stackIn_49_0 = stackOut_48_0;
                              stackIn_49_1 = stackOut_48_1;
                              L13: while (true) {
                                L14: {
                                  if (stackIn_49_0 >= stackIn_49_1) {
                                    break L14;
                                  } else {
                                    var8 = null;
                                    stackOut_50_0 = var5_ref_int__[var7];
                                    stackIn_396_0 = stackOut_50_0;
                                    stackIn_51_0 = stackOut_50_0;
                                    if (var15 != 0) {
                                      break L7;
                                    } else {
                                      L15: {
                                        if (stackIn_51_0 != 0) {
                                          break L15;
                                        } else {
                                          var8 = (Object) (Object) nn.field_c;
                                          break L15;
                                        }
                                      }
                                      L16: {
                                        if (var5_ref_int__[var7] == 1) {
                                          var8 = (Object) (Object) va.field_f;
                                          break L16;
                                        } else {
                                          break L16;
                                        }
                                      }
                                      L17: {
                                        if (var5_ref_int__[var7] == 2) {
                                          var8 = (Object) (Object) qm.field_d;
                                          break L17;
                                        } else {
                                          break L17;
                                        }
                                      }
                                      L18: {
                                        if (var5_ref_int__[var7] != 3) {
                                          break L18;
                                        } else {
                                          var8 = (Object) (Object) kj.field_D;
                                          break L18;
                                        }
                                      }
                                      L19: {
                                        if (var5_ref_int__[var7] != 4) {
                                          break L19;
                                        } else {
                                          var8 = (Object) (Object) rn.field_o;
                                          break L19;
                                        }
                                      }
                                      L20: {
                                        if (var5_ref_int__[var7] != 5) {
                                          break L20;
                                        } else {
                                          var8 = (Object) (Object) oc.field_f;
                                          break L20;
                                        }
                                      }
                                      L21: {
                                        if (var5_ref_int__[var7] != 6) {
                                          break L21;
                                        } else {
                                          var8 = (Object) (Object) hk.field_Vb;
                                          break L21;
                                        }
                                      }
                                      L22: {
                                        if (var5_ref_int__[var7] != 7) {
                                          break L22;
                                        } else {
                                          var8 = (Object) (Object) ua.field_v;
                                          break L22;
                                        }
                                      }
                                      L23: {
                                        if (var5_ref_int__[var7] == 8) {
                                          var8 = (Object) (Object) ua.field_x;
                                          break L23;
                                        } else {
                                          break L23;
                                        }
                                      }
                                      L24: {
                                        if (var5_ref_int__[var7] != 9) {
                                          break L24;
                                        } else {
                                          var8 = (Object) (Object) ua.field_P;
                                          break L24;
                                        }
                                      }
                                      L25: {
                                        if (10 == var5_ref_int__[var7]) {
                                          var8 = (Object) (Object) ua.field_z;
                                          break L25;
                                        } else {
                                          break L25;
                                        }
                                      }
                                      L26: {
                                        if (var5_ref_int__[var7] != 11) {
                                          break L26;
                                        } else {
                                          var8 = (Object) (Object) ua.field_N;
                                          break L26;
                                        }
                                      }
                                      L27: {
                                        if (var5_ref_int__[var7] != 12) {
                                          break L27;
                                        } else {
                                          var8 = (Object) (Object) ua.field_O;
                                          break L27;
                                        }
                                      }
                                      L28: {
                                        if (var5_ref_int__[var7] == 13) {
                                          var8 = (Object) (Object) ua.field_D;
                                          break L28;
                                        } else {
                                          break L28;
                                        }
                                      }
                                      L29: {
                                        if (var5_ref_int__[var7] != 14) {
                                          break L29;
                                        } else {
                                          var8 = (Object) (Object) ua.field_J;
                                          break L29;
                                        }
                                      }
                                      L30: {
                                        if (var5_ref_int__[var7] == 15) {
                                          var8 = (Object) (Object) ua.field_E;
                                          break L30;
                                        } else {
                                          break L30;
                                        }
                                      }
                                      L31: {
                                        if (var5_ref_int__[var7] == 16) {
                                          var8 = (Object) (Object) vk.field_s;
                                          break L31;
                                        } else {
                                          break L31;
                                        }
                                      }
                                      L32: {
                                        if (17 != var5_ref_int__[var7]) {
                                          break L32;
                                        } else {
                                          var8 = (Object) (Object) jm.field_p;
                                          break L32;
                                        }
                                      }
                                      L33: {
                                        if (var5_ref_int__[var7] == 18) {
                                          var8 = (Object) (Object) si.field_k;
                                          break L33;
                                        } else {
                                          break L33;
                                        }
                                      }
                                      L34: {
                                        if (var5_ref_int__[var7] == 20) {
                                          var8 = (Object) (Object) eb.field_o;
                                          break L34;
                                        } else {
                                          break L34;
                                        }
                                      }
                                      L35: {
                                        if (21 == var5_ref_int__[var7]) {
                                          var8 = (Object) (Object) bb.field_S;
                                          break L35;
                                        } else {
                                          break L35;
                                        }
                                      }
                                      L36: {
                                        if (var5_ref_int__[var7] == 22) {
                                          var8 = (Object) (Object) ff.field_ob;
                                          break L36;
                                        } else {
                                          break L36;
                                        }
                                      }
                                      L37: {
                                        if (var5_ref_int__[var7] != 23) {
                                          break L37;
                                        } else {
                                          var8 = (Object) (Object) uj.field_i;
                                          break L37;
                                        }
                                      }
                                      L38: {
                                        if (var5_ref_int__[var7] == 24) {
                                          var8 = (Object) (Object) pg.field_z;
                                          break L38;
                                        } else {
                                          break L38;
                                        }
                                      }
                                      L39: {
                                        var9_int = -1;
                                        if (ge.field_j != 1) {
                                          break L39;
                                        } else {
                                          if (ol.field_Ub == 9) {
                                            L40: {
                                              L41: {
                                                L42: {
                                                  L43: {
                                                    L44: {
                                                      var10 = ((ee) this).field_cb;
                                                      if (var10 == 0) {
                                                        break L44;
                                                      } else {
                                                        L45: {
                                                          if (1 != var10) {
                                                            break L45;
                                                          } else {
                                                            if (var15 == 0) {
                                                              break L43;
                                                            } else {
                                                              break L45;
                                                            }
                                                          }
                                                        }
                                                        if (var10 == 2) {
                                                          break L42;
                                                        } else {
                                                          if (var10 == 3) {
                                                            break L41;
                                                          } else {
                                                            if (var10 != 4) {
                                                              break L39;
                                                            } else {
                                                              if (var15 == 0) {
                                                                break L40;
                                                              } else {
                                                                break L44;
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                    if (0 != var7) {
                                                      break L39;
                                                    } else {
                                                      var9_int = 36;
                                                      if (var15 == 0) {
                                                        break L39;
                                                      } else {
                                                        break L43;
                                                      }
                                                    }
                                                  }
                                                  if (var7 != 0) {
                                                    break L39;
                                                  } else {
                                                    var9_int = 15;
                                                    if (var15 == 0) {
                                                      break L39;
                                                    } else {
                                                      break L42;
                                                    }
                                                  }
                                                }
                                                if (var7 != 0) {
                                                  break L39;
                                                } else {
                                                  var9_int = 35;
                                                  if (var15 == 0) {
                                                    break L39;
                                                  } else {
                                                    break L41;
                                                  }
                                                }
                                              }
                                              if (var7 != 0) {
                                                break L39;
                                              } else {
                                                var9_int = 45;
                                                if (var15 == 0) {
                                                  break L39;
                                                } else {
                                                  break L40;
                                                }
                                              }
                                            }
                                            var9_int = 41;
                                            break L39;
                                          } else {
                                            break L39;
                                          }
                                        }
                                      }
                                      L46: {
                                        if (ge.field_j != 1) {
                                          break L46;
                                        } else {
                                          if (ol.field_Ub != 6) {
                                            break L46;
                                          } else {
                                            if (var7 != 0) {
                                              break L46;
                                            } else {
                                              L47: {
                                                L48: {
                                                  var10 = ((ee) this).field_cb;
                                                  if (var10 != 0) {
                                                    break L48;
                                                  } else {
                                                    if (var15 == 0) {
                                                      break L47;
                                                    } else {
                                                      break L48;
                                                    }
                                                  }
                                                }
                                                L49: {
                                                  if (2 != var10) {
                                                    break L49;
                                                  } else {
                                                    if (var15 == 0) {
                                                      break L47;
                                                    } else {
                                                      break L49;
                                                    }
                                                  }
                                                }
                                                if (var10 != 4) {
                                                  break L46;
                                                } else {
                                                  break L47;
                                                }
                                              }
                                              var9_int = 33;
                                              break L46;
                                            }
                                          }
                                        }
                                      }
                                      L50: {
                                        if (1 != ge.field_j) {
                                          break L50;
                                        } else {
                                          if (ol.field_Ub != 1) {
                                            break L50;
                                          } else {
                                            L51: {
                                              if (((ee) this).field_cb != 2) {
                                                break L51;
                                              } else {
                                                if (0 == var7) {
                                                  var9_int = 45;
                                                  break L51;
                                                } else {
                                                  break L51;
                                                }
                                              }
                                            }
                                            if (((ee) this).field_cb != 4) {
                                              break L50;
                                            } else {
                                              if (var7 != 0) {
                                                break L50;
                                              } else {
                                                var9_int = 45;
                                                break L50;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      L52: {
                                        if (ge.field_j != 2) {
                                          break L52;
                                        } else {
                                          if (ol.field_Ub != 3) {
                                            break L52;
                                          } else {
                                            if (((ee) this).field_cb != 3) {
                                              break L52;
                                            } else {
                                              if (var7 == 0) {
                                                var9_int = 45;
                                                break L52;
                                              } else {
                                                break L52;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      L53: {
                                        if (ge.field_j != 2) {
                                          break L53;
                                        } else {
                                          if (ol.field_Ub != 1) {
                                            break L53;
                                          } else {
                                            if (var5_ref_int__[var7] == 9) {
                                              var9_int = 36;
                                              break L53;
                                            } else {
                                              break L53;
                                            }
                                          }
                                        }
                                      }
                                      L54: {
                                        if (ge.field_j != 2) {
                                          break L54;
                                        } else {
                                          if (ol.field_Ub != 2) {
                                            break L54;
                                          } else {
                                            if (var7 == 0) {
                                              if (((ee) this).field_cb == 2) {
                                                var9_int = 18;
                                                break L54;
                                              } else {
                                                break L54;
                                              }
                                            } else {
                                              break L54;
                                            }
                                          }
                                        }
                                      }
                                      L55: {
                                        var10 = 36;
                                        if (ge.field_j != 2) {
                                          break L55;
                                        } else {
                                          if (ol.field_Ub == 9) {
                                            L56: {
                                              if (var7 != 0) {
                                                break L56;
                                              } else {
                                                L57: {
                                                  if (((ee) this).field_cb == 1) {
                                                    break L57;
                                                  } else {
                                                    if (((ee) this).field_cb != 3) {
                                                      break L56;
                                                    } else {
                                                      break L57;
                                                    }
                                                  }
                                                }
                                                var9_int = 45;
                                                break L56;
                                              }
                                            }
                                            L58: {
                                              if (-1 + var3_ref_int____.length == ((ee) this).field_cb) {
                                                L59: {
                                                  L60: {
                                                    L61: {
                                                      var11_int = var7;
                                                      if (var11_int == 0) {
                                                        break L61;
                                                      } else {
                                                        L62: {
                                                          if (var11_int != 1) {
                                                            break L62;
                                                          } else {
                                                            if (var15 == 0) {
                                                              break L60;
                                                            } else {
                                                              break L62;
                                                            }
                                                          }
                                                        }
                                                        if (var11_int != 2) {
                                                          break L58;
                                                        } else {
                                                          if (var15 == 0) {
                                                            break L59;
                                                          } else {
                                                            break L61;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    var9_int = 37;
                                                    if (var15 == 0) {
                                                      break L58;
                                                    } else {
                                                      break L60;
                                                    }
                                                  }
                                                  var9_int = 14;
                                                  if (var15 == 0) {
                                                    break L58;
                                                  } else {
                                                    break L59;
                                                  }
                                                }
                                                var9_int = 15;
                                                break L58;
                                              } else {
                                                break L58;
                                              }
                                            }
                                            var10 = 38;
                                            break L55;
                                          } else {
                                            break L55;
                                          }
                                        }
                                      }
                                      L63: {
                                        if (ge.field_j != 1) {
                                          break L63;
                                        } else {
                                          if (ol.field_Ub != 8) {
                                            break L63;
                                          } else {
                                            L64: {
                                              if (2 != ((ee) this).field_cb) {
                                                break L64;
                                              } else {
                                                if (0 == var7) {
                                                  var9_int = 15;
                                                  break L64;
                                                } else {
                                                  break L64;
                                                }
                                              }
                                            }
                                            if (((ee) this).field_cb != 3) {
                                              break L63;
                                            } else {
                                              if (0 != var7) {
                                                break L63;
                                              } else {
                                                var9_int = 9;
                                                break L63;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      L65: {
                                        if (ge.field_j != 1) {
                                          break L65;
                                        } else {
                                          if (ol.field_Ub == 7) {
                                            L66: {
                                              if (((ee) this).field_cb != 3) {
                                                break L66;
                                              } else {
                                                if (var7 != 0) {
                                                  break L66;
                                                } else {
                                                  var9_int = 39;
                                                  break L66;
                                                }
                                              }
                                            }
                                            if (5 != ((ee) this).field_cb) {
                                              break L65;
                                            } else {
                                              if (var5_ref_int__[var7] == 9) {
                                                var9_int = 22;
                                                break L65;
                                              } else {
                                                break L65;
                                              }
                                            }
                                          } else {
                                            break L65;
                                          }
                                        }
                                      }
                                      L67: {
                                        if (ge.field_j != 2) {
                                          break L67;
                                        } else {
                                          if (5 == ol.field_Ub) {
                                            L68: {
                                              if (var7 != 0) {
                                                break L68;
                                              } else {
                                                if (((ee) this).field_cb != 0) {
                                                  break L68;
                                                } else {
                                                  var9_int = 36;
                                                  break L68;
                                                }
                                              }
                                            }
                                            L69: {
                                              if (var7 != 0) {
                                                break L69;
                                              } else {
                                                if (2 != ((ee) this).field_cb) {
                                                  break L69;
                                                } else {
                                                  var9_int = 37;
                                                  break L69;
                                                }
                                              }
                                            }
                                            if (var7 != 0) {
                                              break L67;
                                            } else {
                                              if (((ee) this).field_cb != 3) {
                                                break L67;
                                              } else {
                                                var9_int = 42;
                                                break L67;
                                              }
                                            }
                                          } else {
                                            break L67;
                                          }
                                        }
                                      }
                                      L70: {
                                        if (ge.field_j != 2) {
                                          break L70;
                                        } else {
                                          if (ol.field_Ub == 7) {
                                            if (1 != var7) {
                                              break L70;
                                            } else {
                                              if (((ee) this).field_cb != 2) {
                                                break L70;
                                              } else {
                                                var9_int = 33;
                                                break L70;
                                              }
                                            }
                                          } else {
                                            break L70;
                                          }
                                        }
                                      }
                                      L71: {
                                        if (var8 == null) {
                                          break L71;
                                        } else {
                                          L72: {
                                            if (0 != var5_ref_int__[var7]) {
                                              break L72;
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
                                              L73: while (true) {
                                                L74: {
                                                  if (var14 > 4) {
                                                    break L74;
                                                  } else {
                                                    stackOut_352_0 = ~var14;
                                                    stackOut_352_1 = -1;
                                                    stackIn_49_0 = stackOut_352_0;
                                                    stackIn_49_1 = stackOut_352_1;
                                                    stackIn_353_0 = stackOut_352_0;
                                                    stackIn_353_1 = stackOut_352_1;
                                                    if (var15 != 0) {
                                                      continue L13;
                                                    } else {
                                                      L75: {
                                                        if (stackIn_353_0 != stackIn_353_1) {
                                                          L76: {
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
                                                            stackOut_355_0 = (mb) var11;
                                                            stackOut_355_1 = 1000 * Math.abs(var14);
                                                            stackIn_358_0 = stackOut_355_0;
                                                            stackIn_358_1 = stackOut_355_1;
                                                            stackIn_356_0 = stackOut_355_0;
                                                            stackIn_356_1 = stackOut_355_1;
                                                            if (var14 <= 0) {
                                                              stackOut_358_0 = (mb) (Object) stackIn_358_0;
                                                              stackOut_358_1 = stackIn_358_1;
                                                              stackOut_358_2 = 0;
                                                              stackIn_359_0 = stackOut_358_0;
                                                              stackIn_359_1 = stackOut_358_1;
                                                              stackIn_359_2 = stackOut_358_2;
                                                              break L76;
                                                            } else {
                                                              stackOut_356_0 = (mb) (Object) stackIn_356_0;
                                                              stackOut_356_1 = stackIn_356_1;
                                                              stackOut_356_2 = 500;
                                                              stackIn_359_0 = stackOut_356_0;
                                                              stackIn_359_1 = stackOut_356_1;
                                                              stackIn_359_2 = stackOut_356_2;
                                                              break L76;
                                                            }
                                                          }
                                                          stackIn_359_0.field_ab = stackIn_359_1 + stackIn_359_2;
                                                          var11.field_Qb = 150;
                                                          break L75;
                                                        } else {
                                                          break L75;
                                                        }
                                                      }
                                                      var14++;
                                                      if (var15 == 0) {
                                                        continue L73;
                                                      } else {
                                                        break L74;
                                                      }
                                                    }
                                                  }
                                                }
                                                if (var15 == 0) {
                                                  break L71;
                                                } else {
                                                  break L72;
                                                }
                                              }
                                            }
                                          }
                                          L77: {
                                            L78: {
                                              var11 = new mb(0, 0, (ee) this);
                                              var11.a((int[]) var8, true, false, -1, 1);
                                              var11.field_Nb = 7;
                                              if (-1 == var9_int) {
                                                break L78;
                                              } else {
                                                var11.field_hb = var9_int;
                                                if (var15 == 0) {
                                                  break L77;
                                                } else {
                                                  break L78;
                                                }
                                              }
                                            }
                                            if (var4 != 0) {
                                              var11.field_hb = var10;
                                              var4 = 0;
                                              break L77;
                                            } else {
                                              break L77;
                                            }
                                          }
                                          ((ee) this).field_K.a(3, (ck) (Object) var11);
                                          var11.j(-5);
                                          var11.field_Gb = -320000;
                                          var11.field_K = 0;
                                          var11.field_fc = var11.field_Gb;
                                          var11.field_Qb = 150;
                                          var11.field_ab = 8000;
                                          break L71;
                                        }
                                      }
                                      var7++;
                                      if (var15 == 0) {
                                        continue L12;
                                      } else {
                                        break L14;
                                      }
                                    }
                                  }
                                }
                                if (var15 == 0) {
                                  break L8;
                                } else {
                                  break L9;
                                }
                              }
                            }
                          }
                        }
                        if (!((ee) this).field_j) {
                          L79: {
                            ((ee) this).field_j = true;
                            nc.field_a = ((ee) this).field_r / 50;
                            if (b.field_f) {
                              nc.field_a = nc.field_a + 600;
                              break L79;
                            } else {
                              break L79;
                            }
                          }
                          var4 = 0;
                          var5_ref_jc = new jc(((ee) this).field_e);
                          var6 = (ne) (Object) var5_ref_jc.b(2);
                          L80: while (true) {
                            L81: {
                              if (var6 == null) {
                                break L81;
                              } else {
                                var4 = var4 + var6.field_O;
                                var6 = (ne) (Object) var5_ref_jc.d(2);
                                if (var15 != 0) {
                                  break L8;
                                } else {
                                  if (var15 == 0) {
                                    continue L80;
                                  } else {
                                    break L81;
                                  }
                                }
                              }
                            }
                            L82: {
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
                                break L82;
                              } else {
                                break L82;
                              }
                            }
                            mj.a(ge.field_j, -(var9_int * 50000) + (((ee) this).field_M + ((ee) this).field_f), nc.field_a, ol.field_Ub, -(var7 * 60000) + (-(var6_int * 128) + ((ee) this).field_a), -(var8_int * 256) + (-(var4 * 100) + ((ee) this).field_N), ((ee) this).field_q, (byte) -65);
                            break L8;
                          }
                        } else {
                          break L8;
                        }
                      }
                    } else {
                      break L8;
                    }
                  }
                }
              }
              stackOut_395_0 = ((ee) this).field_lb;
              stackIn_396_0 = stackOut_395_0 ? 1 : 0;
              break L7;
            }
            L83: {
              if (stackIn_396_0 != 0) {
                L84: {
                  var3 = ((ee) this).field_bb.length;
                  if (((ee) this).field_ib <= 0) {
                    break L84;
                  } else {
                    if (((ee) this).field_K.b((byte) -128) >= 30) {
                      break L84;
                    } else {
                      if (41 <= ((ee) this).field_cb) {
                        break L84;
                      } else {
                        ((ee) this).field_ib = ((ee) this).field_ib - 1;
                        break L84;
                      }
                    }
                  }
                }
                if (((ee) this).field_j) {
                  break L83;
                } else {
                  L85: {
                    if (~var3 <= ~((ee) this).field_K.b((byte) -128)) {
                      break L85;
                    } else {
                      if (((ee) this).field_ib <= 0) {
                        break L85;
                      } else {
                        break L83;
                      }
                    }
                  }
                  L86: {
                    L87: {
                      ((ee) this).field_ib = 3000;
                      if (ef.field_d.length <= ((ee) this).field_cb) {
                        break L87;
                      } else {
                        if (((ee) this).field_cb < 0) {
                          break L87;
                        } else {
                          var4_ref_int__ = ef.field_d[((ee) this).field_cb];
                          var5 = var4_ref_int__.length;
                          var6_int = 0;
                          L88: while (true) {
                            if (var6_int >= var5) {
                              break L87;
                            } else {
                              var7 = ((ee) this).field_ab.a(-11) * (var6_int - -1) / (var5 + 1) << 4;
                              var8_int = -100000;
                              var9 = null;
                              stackOut_422_0 = -1;
                              stackOut_422_1 = ~var4_ref_int__[var6_int];
                              stackIn_721_0 = stackOut_422_0;
                              stackIn_721_1 = stackOut_422_1;
                              stackIn_423_0 = stackOut_422_0;
                              stackIn_423_1 = stackOut_422_1;
                              if (var15 != 0) {
                                break L86;
                              } else {
                                L89: {
                                  if (stackIn_423_0 == stackIn_423_1) {
                                    var9 = (Object) (Object) nn.field_c;
                                    break L89;
                                  } else {
                                    break L89;
                                  }
                                }
                                L90: {
                                  if (var4_ref_int__[var6_int] == 1) {
                                    var9 = (Object) (Object) va.field_f;
                                    break L90;
                                  } else {
                                    break L90;
                                  }
                                }
                                L91: {
                                  if (2 != var4_ref_int__[var6_int]) {
                                    break L91;
                                  } else {
                                    var9 = (Object) (Object) qm.field_d;
                                    break L91;
                                  }
                                }
                                L92: {
                                  if (3 == var4_ref_int__[var6_int]) {
                                    var9 = (Object) (Object) kj.field_D;
                                    break L92;
                                  } else {
                                    break L92;
                                  }
                                }
                                L93: {
                                  if (var4_ref_int__[var6_int] == 4) {
                                    var9 = (Object) (Object) rn.field_o;
                                    break L93;
                                  } else {
                                    break L93;
                                  }
                                }
                                L94: {
                                  if (var4_ref_int__[var6_int] == 5) {
                                    var9 = (Object) (Object) oc.field_f;
                                    break L94;
                                  } else {
                                    break L94;
                                  }
                                }
                                L95: {
                                  if (var4_ref_int__[var6_int] != 6) {
                                    break L95;
                                  } else {
                                    var9 = (Object) (Object) hk.field_Vb;
                                    break L95;
                                  }
                                }
                                L96: {
                                  if (var4_ref_int__[var6_int] != 7) {
                                    break L96;
                                  } else {
                                    var9 = (Object) (Object) ua.field_v;
                                    break L96;
                                  }
                                }
                                L97: {
                                  if (var4_ref_int__[var6_int] == 8) {
                                    var9 = (Object) (Object) ua.field_x;
                                    break L97;
                                  } else {
                                    break L97;
                                  }
                                }
                                L98: {
                                  if (var4_ref_int__[var6_int] != 9) {
                                    break L98;
                                  } else {
                                    var9 = (Object) (Object) ua.field_P;
                                    break L98;
                                  }
                                }
                                L99: {
                                  if (var4_ref_int__[var6_int] != 10) {
                                    break L99;
                                  } else {
                                    var9 = (Object) (Object) ua.field_z;
                                    break L99;
                                  }
                                }
                                L100: {
                                  if (11 != var4_ref_int__[var6_int]) {
                                    break L100;
                                  } else {
                                    var9 = (Object) (Object) ua.field_N;
                                    break L100;
                                  }
                                }
                                L101: {
                                  if (var4_ref_int__[var6_int] == 12) {
                                    var9 = (Object) (Object) ua.field_O;
                                    break L101;
                                  } else {
                                    break L101;
                                  }
                                }
                                L102: {
                                  if (var4_ref_int__[var6_int] == 13) {
                                    var9 = (Object) (Object) ua.field_D;
                                    break L102;
                                  } else {
                                    break L102;
                                  }
                                }
                                L103: {
                                  if (var4_ref_int__[var6_int] == 14) {
                                    var9 = (Object) (Object) ua.field_J;
                                    break L103;
                                  } else {
                                    break L103;
                                  }
                                }
                                L104: {
                                  if (var4_ref_int__[var6_int] != 15) {
                                    break L104;
                                  } else {
                                    var9 = (Object) (Object) ua.field_E;
                                    break L104;
                                  }
                                }
                                L105: {
                                  if (var4_ref_int__[var6_int] != 16) {
                                    break L105;
                                  } else {
                                    var9 = (Object) (Object) vk.field_s;
                                    break L105;
                                  }
                                }
                                L106: {
                                  if (var4_ref_int__[var6_int] == 17) {
                                    var9 = (Object) (Object) jm.field_p;
                                    break L106;
                                  } else {
                                    break L106;
                                  }
                                }
                                L107: {
                                  if (var4_ref_int__[var6_int] == 18) {
                                    var9 = (Object) (Object) si.field_k;
                                    break L107;
                                  } else {
                                    break L107;
                                  }
                                }
                                L108: {
                                  L109: {
                                    if (null != var9) {
                                      L110: {
                                        if (var4_ref_int__[var6_int] == 0) {
                                          break L110;
                                        } else {
                                          L111: {
                                            L112: {
                                              L113: {
                                                L114: {
                                                  L115: {
                                                    L116: {
                                                      L117: {
                                                        L118: {
                                                          L119: {
                                                            L120: {
                                                              L121: {
                                                                L122: {
                                                                  L123: {
                                                                    var10_ref_mb = new mb(var7, var8_int, (ee) this);
                                                                    var11_int = var4_ref_int__[var6_int];
                                                                    if (var11_int == 7) {
                                                                      if ((1 & ((ee) this).field_t) != 0) {
                                                                        break L111;
                                                                      } else {
                                                                        var10_ref_mb.field_hb = 21;
                                                                        ((ee) this).field_t = ((ee) this).field_t | 1;
                                                                        if (var15 == 0) {
                                                                          break L111;
                                                                        } else {
                                                                          break L123;
                                                                        }
                                                                      }
                                                                    } else {
                                                                      L124: {
                                                                        if (8 != var11_int) {
                                                                          break L124;
                                                                        } else {
                                                                          if (var15 == 0) {
                                                                            break L123;
                                                                          } else {
                                                                            break L124;
                                                                          }
                                                                        }
                                                                      }
                                                                      L125: {
                                                                        if (var11_int != 9) {
                                                                          break L125;
                                                                        } else {
                                                                          if (var15 == 0) {
                                                                            break L122;
                                                                          } else {
                                                                            break L125;
                                                                          }
                                                                        }
                                                                      }
                                                                      if (var11_int == 11) {
                                                                        break L121;
                                                                      } else {
                                                                        L126: {
                                                                          if (var11_int != 10) {
                                                                            break L126;
                                                                          } else {
                                                                            if (var15 == 0) {
                                                                              break L120;
                                                                            } else {
                                                                              break L126;
                                                                            }
                                                                          }
                                                                        }
                                                                        L127: {
                                                                          if (var11_int != 12) {
                                                                            break L127;
                                                                          } else {
                                                                            if (var15 == 0) {
                                                                              break L119;
                                                                            } else {
                                                                              break L127;
                                                                            }
                                                                          }
                                                                        }
                                                                        if (13 == var11_int) {
                                                                          break L118;
                                                                        } else {
                                                                          if (var11_int == 14) {
                                                                            break L117;
                                                                          } else {
                                                                            L128: {
                                                                              if (var11_int != 15) {
                                                                                break L128;
                                                                              } else {
                                                                                if (var15 == 0) {
                                                                                  break L116;
                                                                                } else {
                                                                                  break L128;
                                                                                }
                                                                              }
                                                                            }
                                                                            L129: {
                                                                              if (var11_int != 16) {
                                                                                break L129;
                                                                              } else {
                                                                                if (var15 == 0) {
                                                                                  break L115;
                                                                                } else {
                                                                                  break L129;
                                                                                }
                                                                              }
                                                                            }
                                                                            L130: {
                                                                              if (var11_int != 17) {
                                                                                break L130;
                                                                              } else {
                                                                                if (var15 == 0) {
                                                                                  break L114;
                                                                                } else {
                                                                                  break L130;
                                                                                }
                                                                              }
                                                                            }
                                                                            if (1 == var11_int) {
                                                                              break L113;
                                                                            } else {
                                                                              if (var11_int == 3) {
                                                                                break L113;
                                                                              } else {
                                                                                L131: {
                                                                                  if (var11_int != 5) {
                                                                                    break L131;
                                                                                  } else {
                                                                                    if (var15 == 0) {
                                                                                      break L113;
                                                                                    } else {
                                                                                      break L131;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                L132: {
                                                                                  if (2 != var11_int) {
                                                                                    break L132;
                                                                                  } else {
                                                                                    if (var15 == 0) {
                                                                                      break L112;
                                                                                    } else {
                                                                                      break L132;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                L133: {
                                                                                  if (var11_int != 4) {
                                                                                    break L133;
                                                                                  } else {
                                                                                    if (var15 == 0) {
                                                                                      break L112;
                                                                                    } else {
                                                                                      break L133;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                if (var11_int == 6) {
                                                                                  break L112;
                                                                                } else {
                                                                                  break L111;
                                                                                }
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                  if ((2 & ((ee) this).field_t) == 0) {
                                                                    var10_ref_mb.field_hb = 28;
                                                                    ((ee) this).field_t = ((ee) this).field_t | 2;
                                                                    if (var15 == 0) {
                                                                      break L111;
                                                                    } else {
                                                                      break L122;
                                                                    }
                                                                  } else {
                                                                    break L111;
                                                                  }
                                                                }
                                                                if ((8 & ((ee) this).field_t) != 0) {
                                                                  break L111;
                                                                } else {
                                                                  var10_ref_mb.field_hb = 14;
                                                                  ((ee) this).field_t = ((ee) this).field_t | 8;
                                                                  if (var15 == 0) {
                                                                    break L111;
                                                                  } else {
                                                                    break L121;
                                                                  }
                                                                }
                                                              }
                                                              if ((16 & ((ee) this).field_t) == 0) {
                                                                var10_ref_mb.field_hb = 39;
                                                                ((ee) this).field_t = ((ee) this).field_t | 16;
                                                                if (var15 == 0) {
                                                                  break L111;
                                                                } else {
                                                                  break L120;
                                                                }
                                                              } else {
                                                                break L111;
                                                              }
                                                            }
                                                            if (0 == (((ee) this).field_t & 32)) {
                                                              ((ee) this).field_t = ((ee) this).field_t | 32;
                                                              var10_ref_mb.field_hb = 24;
                                                              if (var15 == 0) {
                                                                break L111;
                                                              } else {
                                                                break L119;
                                                              }
                                                            } else {
                                                              break L111;
                                                            }
                                                          }
                                                          if (0 == (((ee) this).field_t & 64)) {
                                                            var10_ref_mb.field_hb = 35;
                                                            ((ee) this).field_t = ((ee) this).field_t | 64;
                                                            if (var15 == 0) {
                                                              break L111;
                                                            } else {
                                                              break L118;
                                                            }
                                                          } else {
                                                            break L111;
                                                          }
                                                        }
                                                        if ((128 & ((ee) this).field_t) == 0) {
                                                          ((ee) this).field_t = ((ee) this).field_t | 128;
                                                          var10_ref_mb.field_hb = 44;
                                                          if (var15 == 0) {
                                                            break L111;
                                                          } else {
                                                            break L117;
                                                          }
                                                        } else {
                                                          break L111;
                                                        }
                                                      }
                                                      if ((((ee) this).field_t & 256) != 0) {
                                                        break L111;
                                                      } else {
                                                        ((ee) this).field_t = ((ee) this).field_t | 256;
                                                        var10_ref_mb.field_hb = 15;
                                                        if (var15 == 0) {
                                                          break L111;
                                                        } else {
                                                          break L116;
                                                        }
                                                      }
                                                    }
                                                    if (0 != (((ee) this).field_t & 512)) {
                                                      break L111;
                                                    } else {
                                                      ((ee) this).field_t = ((ee) this).field_t | 512;
                                                      var10_ref_mb.field_hb = 38;
                                                      if (var15 == 0) {
                                                        break L111;
                                                      } else {
                                                        break L115;
                                                      }
                                                    }
                                                  }
                                                  if ((1024 & ((ee) this).field_t) == 0) {
                                                    ((ee) this).field_t = ((ee) this).field_t | 1024;
                                                    var10_ref_mb.field_hb = 37;
                                                    if (var15 == 0) {
                                                      break L111;
                                                    } else {
                                                      break L114;
                                                    }
                                                  } else {
                                                    break L111;
                                                  }
                                                }
                                                if ((((ee) this).field_t & 2048) == 0) {
                                                  var10_ref_mb.field_hb = 30;
                                                  ((ee) this).field_t = ((ee) this).field_t | 2048;
                                                  if (var15 == 0) {
                                                    break L111;
                                                  } else {
                                                    break L113;
                                                  }
                                                } else {
                                                  break L111;
                                                }
                                              }
                                              if ((((ee) this).field_m & 1 << ((ee) this).field_cb / 2) != 0) {
                                                break L111;
                                              } else {
                                                L134: {
                                                  L135: {
                                                    L136: {
                                                      L137: {
                                                        L138: {
                                                          ((ee) this).field_m = ((ee) this).field_m | 1 << ((ee) this).field_cb / 2;
                                                          var11_int = ((ee) this).field_cb / 8;
                                                          if (var11_int == 0) {
                                                            break L138;
                                                          } else {
                                                            L139: {
                                                              if (var11_int != 1) {
                                                                break L139;
                                                              } else {
                                                                if (var15 == 0) {
                                                                  break L137;
                                                                } else {
                                                                  break L139;
                                                                }
                                                              }
                                                            }
                                                            if (var11_int == 2) {
                                                              break L136;
                                                            } else {
                                                              L140: {
                                                                if (var11_int != 3) {
                                                                  break L140;
                                                                } else {
                                                                  if (var15 == 0) {
                                                                    break L135;
                                                                  } else {
                                                                    break L140;
                                                                  }
                                                                }
                                                              }
                                                              if (var11_int != 4) {
                                                                break L111;
                                                              } else {
                                                                if (var15 == 0) {
                                                                  break L134;
                                                                } else {
                                                                  break L138;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                        var10_ref_mb.field_hb = 5;
                                                        if (var15 == 0) {
                                                          break L111;
                                                        } else {
                                                          break L137;
                                                        }
                                                      }
                                                      var10_ref_mb.field_hb = 6;
                                                      if (var15 == 0) {
                                                        break L111;
                                                      } else {
                                                        break L136;
                                                      }
                                                    }
                                                    var10_ref_mb.field_hb = 7;
                                                    if (var15 == 0) {
                                                      break L111;
                                                    } else {
                                                      break L135;
                                                    }
                                                  }
                                                  var10_ref_mb.field_hb = 8;
                                                  if (var15 == 0) {
                                                    break L111;
                                                  } else {
                                                    break L134;
                                                  }
                                                }
                                                var10_ref_mb.field_hb = 9;
                                                if (var15 == 0) {
                                                  break L111;
                                                } else {
                                                  break L112;
                                                }
                                              }
                                            }
                                            if ((1 << ((ee) this).field_cb / 2 & ((ee) this).field_i) == 0) {
                                              L141: {
                                                L142: {
                                                  L143: {
                                                    L144: {
                                                      L145: {
                                                        L146: {
                                                          ((ee) this).field_i = ((ee) this).field_i | 1 << ((ee) this).field_cb / 2;
                                                          var11_int = ((ee) this).field_cb / 8;
                                                          if (var11_int != 0) {
                                                            break L146;
                                                          } else {
                                                            if (var15 == 0) {
                                                              break L145;
                                                            } else {
                                                              break L146;
                                                            }
                                                          }
                                                        }
                                                        if (var11_int == 1) {
                                                          break L144;
                                                        } else {
                                                          if (2 == var11_int) {
                                                            break L143;
                                                          } else {
                                                            if (var11_int == 3) {
                                                              break L142;
                                                            } else {
                                                              if (var11_int != 4) {
                                                                break L111;
                                                              } else {
                                                                if (var15 == 0) {
                                                                  break L141;
                                                                } else {
                                                                  break L145;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                      var10_ref_mb.field_hb = 0;
                                                      if (var15 == 0) {
                                                        break L111;
                                                      } else {
                                                        break L144;
                                                      }
                                                    }
                                                    var10_ref_mb.field_hb = 1;
                                                    if (var15 == 0) {
                                                      break L111;
                                                    } else {
                                                      break L143;
                                                    }
                                                  }
                                                  var10_ref_mb.field_hb = 2;
                                                  if (var15 == 0) {
                                                    break L111;
                                                  } else {
                                                    break L142;
                                                  }
                                                }
                                                var10_ref_mb.field_hb = 3;
                                                if (var15 == 0) {
                                                  break L111;
                                                } else {
                                                  break L141;
                                                }
                                              }
                                              var10_ref_mb.field_hb = 4;
                                              break L111;
                                            } else {
                                              break L111;
                                            }
                                          }
                                          var10_ref_mb.a((int[]) var9, true, false, -1, 1);
                                          var10_ref_mb.field_Nb = 7;
                                          ((ee) this).field_K.a(param0 ^ 24, (ck) (Object) var10_ref_mb);
                                          if (var15 == 0) {
                                            break L109;
                                          } else {
                                            break L110;
                                          }
                                        }
                                      }
                                      var10 = -4;
                                      L147: while (true) {
                                        if (var10 > 4) {
                                          break L109;
                                        } else {
                                          var11 = new mb(var7 - -(3000 * var10), var8_int, (ee) this);
                                          var11.a((int[]) var9, true, false, -1, 1);
                                          var11.field_Nb = 7;
                                          var11.field_ab = 5 * var10;
                                          ((ee) this).field_K.a(3, (ck) (Object) var11);
                                          var10++;
                                          if (var15 != 0) {
                                            break L108;
                                          } else {
                                            if (var15 == 0) {
                                              continue L147;
                                            } else {
                                              break L109;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      break L109;
                                    }
                                  }
                                  var6_int++;
                                  break L108;
                                }
                                if (var15 == 0) {
                                  continue L88;
                                } else {
                                  break L87;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    stackOut_720_0 = ((ee) this).field_cb;
                    stackOut_720_1 = 42;
                    stackIn_721_0 = stackOut_720_0;
                    stackIn_721_1 = stackOut_720_1;
                    break L86;
                  }
                  L148: {
                    L149: {
                      if (stackIn_721_0 >= stackIn_721_1) {
                        break L149;
                      } else {
                        if (((ee) this).field_cb < 40) {
                          break L148;
                        } else {
                          if (((ee) this).field_kb > 1) {
                            break L148;
                          } else {
                            break L149;
                          }
                        }
                      }
                    }
                    if (((ee) this).field_j) {
                      break L83;
                    } else {
                      if (~var3 <= ~((ee) this).field_K.b((byte) -128)) {
                        ((ee) this).field_j = true;
                        ((ee) this).field_cb = 43;
                        if (var15 == 0) {
                          break L83;
                        } else {
                          break L148;
                        }
                      } else {
                        break L83;
                      }
                    }
                  }
                  L150: {
                    ((ee) this).field_cb = ((ee) this).field_cb + 1;
                    ((ee) this).field_l = ((ee) this).field_cb;
                    if (41 != ((ee) this).field_cb) {
                      break L150;
                    } else {
                      ((ee) this).field_l = 50;
                      break L150;
                    }
                  }
                  if (((ee) this).field_cb == 42) {
                    ((ee) this).field_l = 100;
                    break L83;
                  } else {
                    break L83;
                  }
                }
              } else {
                break L83;
              }
            }
            L151: {
              this.a((byte) 20);
              ((ee) this).field_r = ((ee) this).field_r + 1;
              if (!((ee) this).field_j) {
                break L151;
              } else {
                if (0 == (7 & ((ee) this).field_r)) {
                  break L151;
                } else {
                  return;
                }
              }
            }
            L152: {
              if (4 == ((ee) this).field_ab.b(68)) {
                this.a(-27309);
                break L152;
              } else {
                break L152;
              }
            }
            L153: {
              if (((ee) this).field_ab.b(49) != 1) {
                break L153;
              } else {
                if (-1 == di.field_g) {
                  var3 = 1;
                  var4 = 0;
                  var5_ref_mb = (mb) (Object) ((ee) this).field_K.e(param0 + 13031);
                  L154: while (true) {
                    L155: {
                      L156: {
                        if (null == var5_ref_mb) {
                          break L156;
                        } else {
                          stackOut_763_0 = -1;
                          stackOut_763_1 = ~var5_ref_mb.field_jc;
                          stackIn_775_0 = stackOut_763_0;
                          stackIn_775_1 = stackOut_763_1;
                          stackIn_764_0 = stackOut_763_0;
                          stackIn_764_1 = stackOut_763_1;
                          if (var15 != 0) {
                            break L155;
                          } else {
                            L157: {
                              if (stackIn_764_0 == stackIn_764_1) {
                                var4 = var4 + var5_ref_mb.field_vb;
                                break L157;
                              } else {
                                break L157;
                              }
                            }
                            L158: {
                              if (var5_ref_mb.field_jc == 1) {
                                var4 = var4 - var5_ref_mb.field_vb;
                                break L158;
                              } else {
                                break L158;
                              }
                            }
                            var5_ref_mb = (mb) (Object) ((ee) this).field_K.a((byte) -60);
                            if (var15 == 0) {
                              continue L154;
                            } else {
                              break L156;
                            }
                          }
                        }
                      }
                      stackOut_774_0 = ~var4;
                      stackOut_774_1 = -1;
                      stackIn_775_0 = stackOut_774_0;
                      stackIn_775_1 = stackOut_774_1;
                      break L155;
                    }
                    L159: {
                      if (stackIn_775_0 > stackIn_775_1) {
                        var3 = -1;
                        break L159;
                      } else {
                        break L159;
                      }
                    }
                    L160: {
                      if (((ee) this).field_r == 12000) {
                        var5_ref_wl = new wl(0, 0, var3, 0, 0, 1, 12, (ee) this, (mb) null, 0, 0, 0);
                        ((ee) this).field_T.a(3, (ck) (Object) var5_ref_wl);
                        break L160;
                      } else {
                        break L160;
                      }
                    }
                    L161: {
                      if (((ee) this).field_r == 18000) {
                        var5_ref_wl = new wl(0, 0, var3, 0, 0, 1, 12, (ee) this, (mb) null, 0, 0, 0);
                        ((ee) this).field_T.a(param0 ^ 24, (ck) (Object) var5_ref_wl);
                        break L161;
                      } else {
                        break L161;
                      }
                    }
                    L162: {
                      if (((ee) this).field_r == 24000) {
                        var5_ref_wl = new wl(0, 0, -var3, 0, 0, 1, 14, (ee) this, (mb) null, 0, 0, 0);
                        ((ee) this).field_T.a(param0 ^ 24, (ck) (Object) var5_ref_wl);
                        break L162;
                      } else {
                        break L162;
                      }
                    }
                    if (29750 != ((ee) this).field_r) {
                      break L153;
                    } else {
                      ((ee) this).field_R = 1;
                      var5_ref_wl = new wl(0, 0, -var3, 0, 0, 1, 16, (ee) this, (mb) null, 0, 0, 0);
                      ri.field_b = var5_ref_wl;
                      ((ee) this).field_T.a(param0 ^ 24, (ck) (Object) var5_ref_wl);
                      break L153;
                    }
                  }
                } else {
                  break L153;
                }
              }
            }
            L163: {
              if (((ee) this).field_b > 0) {
                ((ee) this).field_b = ((ee) this).field_b + 1;
                if (((ee) this).field_b <= 550) {
                  break L163;
                } else {
                  ((ee) this).field_b = 0;
                  break L163;
                }
              } else {
                break L163;
              }
            }
            L164: {
              var3 = -1;
              var4 = 0;
              if (1 != ((ee) this).field_ab.b(125)) {
                stackOut_801_0 = 0;
                stackIn_802_0 = stackOut_801_0;
                break L164;
              } else {
                stackOut_799_0 = 1;
                stackIn_802_0 = stackOut_799_0;
                break L164;
              }
            }
            var5 = stackIn_802_0;
            if (param0 == 27) {
              var6_array = new int[((ee) this).field_kb + ((ee) this).field_Q];
              var7 = 0;
              var8 = (Object) (Object) (mb) (Object) ((ee) this).field_K.e(13058);
              L165: while (true) {
                L166: {
                  L167: {
                    if (null == var8) {
                      break L167;
                    } else {
                      ((mb) var8).c(1, ((ee) this).field_r);
                      stackOut_806_0 = ~((mb) var8).field_Bb;
                      stackOut_806_1 = -1;
                      stackIn_849_0 = stackOut_806_0;
                      stackIn_849_1 = stackOut_806_1;
                      stackIn_807_0 = stackOut_806_0;
                      stackIn_807_1 = stackOut_806_1;
                      if (var15 != 0) {
                        break L166;
                      } else {
                        L168: {
                          if (stackIn_807_0 > stackIn_807_1) {
                            break L168;
                          } else {
                            if (((mb) var8).field_Bb < 0) {
                              break L168;
                            } else {
                              if (((mb) var8).field_Bb >= ((ee) this).field_kb + ((ee) this).field_Q) {
                                break L168;
                              } else {
                                if (((mb) var8).field_V) {
                                  break L168;
                                } else {
                                  L169: {
                                    if (!((mb) var8).field_Hb) {
                                      var7 = var7 | 1 << ((mb) var8).field_jc;
                                      break L169;
                                    } else {
                                      break L169;
                                    }
                                  }
                                  L170: {
                                    var6_array[((mb) var8).field_Bb] = ((mb) var8).field_vb;
                                    if (var6_array[((mb) var8).field_Bb] <= 0) {
                                      var6_array[((mb) var8).field_Bb] = 1;
                                      break L170;
                                    } else {
                                      break L170;
                                    }
                                  }
                                  L171: {
                                    L172: {
                                      if (((ee) this).field_l * 100000 > ((mb) var8).field_vb) {
                                        break L172;
                                      } else {
                                        if (var5 == 0) {
                                          break L171;
                                        } else {
                                          break L172;
                                        }
                                      }
                                    }
                                    if (((mb) var8).field_vb > var4) {
                                      var4 = ((mb) var8).field_vb;
                                      if (var15 == 0) {
                                        break L168;
                                      } else {
                                        break L171;
                                      }
                                    } else {
                                      break L168;
                                    }
                                  }
                                  L173: {
                                    if (~((mb) var8).field_vb != ~var4) {
                                      break L173;
                                    } else {
                                      var3 = -1;
                                      if (var15 == 0) {
                                        break L168;
                                      } else {
                                        break L173;
                                      }
                                    }
                                  }
                                  if (~((mb) var8).field_vb >= ~var4) {
                                    break L168;
                                  } else {
                                    var3 = ((mb) var8).field_Bb;
                                    var4 = ((mb) var8).field_vb;
                                    break L168;
                                  }
                                }
                              }
                            }
                          }
                        }
                        var8 = (Object) (Object) (mb) (Object) ((ee) this).field_K.a((byte) -98);
                        if (var15 == 0) {
                          continue L165;
                        } else {
                          break L167;
                        }
                      }
                    }
                  }
                  stackOut_848_0 = 0;
                  stackOut_848_1 = ((ee) this).field_R;
                  stackIn_849_0 = stackOut_848_0;
                  stackIn_849_1 = stackOut_848_1;
                  break L166;
                }
                L174: {
                  if (stackIn_849_0 != stackIn_849_1) {
                    break L174;
                  } else {
                    if (0 <= var3) {
                      break L174;
                    } else {
                      if (((ee) this).field_A <= 0) {
                        break L174;
                      } else {
                        if (null == ((ee) this).field_y) {
                          break L174;
                        } else {
                          if (((ee) this).field_y.field_vb >= 200000) {
                            ((ee) this).field_R = 1;
                            break L174;
                          } else {
                            break L174;
                          }
                        }
                      }
                    }
                  }
                }
                L175: {
                  if (~(50000 * ((ee) this).field_l) < ~var4) {
                    break L175;
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
                      break L175;
                    } else {
                      break L175;
                    }
                  }
                }
                L176: {
                  L177: {
                    L178: {
                      L179: {
                        L180: {
                          if (!((ee) this).field_fb) {
                            break L180;
                          } else {
                            if (((ee) this).field_lb) {
                              break L180;
                            } else {
                              L181: {
                                if (0 == ((ee) this).field_r % 1200) {
                                  break L181;
                                } else {
                                  if (((ee) this).field_R <= 150) {
                                    break L180;
                                  } else {
                                    if (((ee) this).field_j) {
                                      break L180;
                                    } else {
                                      break L181;
                                    }
                                  }
                                }
                              }
                              if (((ee) this).field_K.b((byte) -128) < 16) {
                                break L179;
                              } else {
                                break L180;
                              }
                            }
                          }
                        }
                        if (((ee) this).field_lb) {
                          break L178;
                        } else {
                          if (((ee) this).field_fb) {
                            break L178;
                          } else {
                            if (var2_int != 0) {
                              break L178;
                            } else {
                              if (((ee) this).field_ab.b(54) != 0) {
                                break L178;
                              } else {
                                if (((ee) this).field_F <= 0) {
                                  break L178;
                                } else {
                                  if (((ee) this).field_R != 0) {
                                    break L178;
                                  } else {
                                    if (((ee) this).field_r <= 0) {
                                      break L178;
                                    } else {
                                      if (((ee) this).field_r % 3000 != 0) {
                                        break L178;
                                      } else {
                                        if (this.h(126) < 2) {
                                          L182: {
                                            L183: {
                                              var8 = null;
                                              var9_int = ((ee) this).field_r / 3000 + -1;
                                              if (1 >= ((ee) this).field_F) {
                                                break L183;
                                              } else {
                                                if (5 >= var9_int) {
                                                  break L182;
                                                } else {
                                                  var9_int = ((ee) this).field_D.a(-123, 2) + 4;
                                                  if (var15 == 0) {
                                                    break L182;
                                                  } else {
                                                    break L183;
                                                  }
                                                }
                                              }
                                            }
                                            if (var9_int <= 3) {
                                              break L182;
                                            } else {
                                              var9_int = ((ee) this).field_D.a(-120, 2) + 2;
                                              break L182;
                                            }
                                          }
                                          L184: {
                                            L185: {
                                              L186: {
                                                var10 = var9_int;
                                                if (0 != var10) {
                                                  break L186;
                                                } else {
                                                  if (var15 == 0) {
                                                    break L185;
                                                  } else {
                                                    break L186;
                                                  }
                                                }
                                              }
                                              if (var10 == 1) {
                                                var8 = (Object) (Object) kj.field_D;
                                                break L184;
                                              } else {
                                                if (var10 == 2) {
                                                  var8 = (Object) (Object) qm.field_d;
                                                  break L184;
                                                } else {
                                                  if (var10 == 3) {
                                                    var8 = (Object) (Object) rn.field_o;
                                                    break L184;
                                                  } else {
                                                    if (4 == var10) {
                                                      var8 = (Object) (Object) oc.field_f;
                                                      break L184;
                                                    } else {
                                                      if (var10 != 5) {
                                                        break L184;
                                                      } else {
                                                        if (var15 == 0) {
                                                          var8 = (Object) (Object) hk.field_Vb;
                                                          break L184;
                                                        } else {
                                                          break L185;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            var8 = (Object) (Object) va.field_f;
                                            break L184;
                                          }
                                          var10 = 0;
                                          L187: while (true) {
                                            L188: {
                                              if (var10 >= 2) {
                                                break L188;
                                              } else {
                                                var11 = new mb(0, 0, (ee) this);
                                                var11.a((int[]) var8, true, false, -1, 12);
                                                var11.field_hb = this.a(false, var9_int);
                                                var11.field_Nb = 8;
                                                ((ee) this).field_K.a(param0 + -24, (ck) (Object) var11);
                                                var11.field_hc = -128;
                                                stackOut_956_0 = var10 & 1;
                                                stackIn_988_0 = stackOut_956_0;
                                                stackIn_957_0 = stackOut_956_0;
                                                if (var15 != 0) {
                                                  break L177;
                                                } else {
                                                  L189: {
                                                    if (stackIn_957_0 == 0) {
                                                      var11.field_hc = (((ee) this).field_ab.a(-126) << 4) - var11.field_hc;
                                                      break L189;
                                                    } else {
                                                      break L189;
                                                    }
                                                  }
                                                  var11.field_Gb = 1;
                                                  var11.field_pc = false;
                                                  var10++;
                                                  if (var15 == 0) {
                                                    continue L187;
                                                  } else {
                                                    break L188;
                                                  }
                                                }
                                              }
                                            }
                                            if (var15 == 0) {
                                              break L178;
                                            } else {
                                              break L179;
                                            }
                                          }
                                        } else {
                                          break L178;
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
                      L190: {
                        var8 = null;
                        var9_int = -1 + ((ee) this).field_r / 1200;
                        if (var9_int <= 2) {
                          break L190;
                        } else {
                          var9_int = ((ee) this).field_D.a(param0 ^ 77, 1 - -((ee) this).field_F);
                          break L190;
                        }
                      }
                      L191: {
                        var10 = var9_int;
                        if (0 == var10) {
                          var8 = (Object) (Object) qm.field_d;
                          break L191;
                        } else {
                          L192: {
                            if (1 != var10) {
                              break L192;
                            } else {
                              if (var15 == 0) {
                                var8 = (Object) (Object) rn.field_o;
                                break L191;
                              } else {
                                break L192;
                              }
                            }
                          }
                          if (2 == var10) {
                            var8 = (Object) (Object) hk.field_Vb;
                            break L191;
                          } else {
                            break L191;
                          }
                        }
                      }
                      var10 = 0;
                      L193: while (true) {
                        if (var10 >= 2) {
                          break L178;
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
                          if (var15 != 0) {
                            break L176;
                          } else {
                            if (var15 == 0) {
                              continue L193;
                            } else {
                              break L178;
                            }
                          }
                        }
                      }
                    }
                    stackOut_987_0 = ((ee) this).field_lb;
                    stackIn_988_0 = stackOut_987_0 ? 1 : 0;
                    break L177;
                  }
                  if (stackIn_988_0 != 0) {
                    break L176;
                  } else {
                    if (var2_int != 0) {
                      break L176;
                    } else {
                      L194: {
                        if (((ee) this).field_ab.b(51) == 3) {
                          break L194;
                        } else {
                          if (1 != ((ee) this).field_ab.b(53)) {
                            break L176;
                          } else {
                            break L194;
                          }
                        }
                      }
                      if (0 != ((ee) this).field_R) {
                        break L176;
                      } else {
                        if (0 == ((ee) this).field_r % 1500) {
                          L195: {
                            L196: {
                              var8_int = ((ee) this).field_r / 3000;
                              if (0 >= ((ee) this).field_F) {
                                break L196;
                              } else {
                                if (var8_int > 5) {
                                  var8_int = 4 + ((ee) this).field_D.a(param0 + -146, 2);
                                  if (var15 == 0) {
                                    break L195;
                                  } else {
                                    break L196;
                                  }
                                } else {
                                  break L195;
                                }
                              }
                            }
                            if (var8_int > 4) {
                              var8_int = ((ee) this).field_D.a(60, 5);
                              break L195;
                            } else {
                              break L195;
                            }
                          }
                          var9 = (Object) (Object) new ne((ee) this, this.a(false, var8_int));
                          ((ne) var9).field_z = ((ee) this).field_D.a(80, ((ee) this).field_ab.a(param0 ^ 68) << 4);
                          ((ne) var9).field_I = -180000;
                          ((ee) this).field_e.a(3, (ck) var9);
                          break L176;
                        } else {
                          break L176;
                        }
                      }
                    }
                  }
                }
                var8 = (Object) (Object) (ne) (Object) ((ee) this).field_e.e(13058);
                L197: while (true) {
                  L198: {
                    L199: {
                      L200: {
                        L201: {
                          if (var8 == null) {
                            break L201;
                          } else {
                            ((ne) var8).c((byte) 87);
                            stackOut_1022_0 = null;
                            stackOut_1022_1 = var8;
                            stackIn_1133_0 = stackOut_1022_0;
                            stackIn_1133_1 = stackOut_1022_1;
                            stackIn_1023_0 = stackOut_1022_0;
                            stackIn_1023_1 = stackOut_1022_1;
                            if (var15 != 0) {
                              L202: while (true) {
                                if (stackIn_1133_0 == stackIn_1133_1) {
                                  break L199;
                                } else {
                                  ((kd) var8).b(4);
                                  var8 = (Object) (Object) ((ee) this).field_J.a(false);
                                  if (var15 != 0) {
                                    break L198;
                                  } else {
                                    if (var15 == 0) {
                                      stackOut_1132_0 = null;
                                      stackOut_1132_1 = var8;
                                      stackIn_1133_0 = stackOut_1132_0;
                                      stackIn_1133_1 = stackOut_1132_1;
                                      continue L202;
                                    } else {
                                      break L200;
                                    }
                                  }
                                }
                              }
                            } else {
                              L203: {
                                L204: {
                                  if (stackIn_1023_0 != (Object) (Object) ((ne) (Object) stackIn_1023_1).field_T) {
                                    break L204;
                                  } else {
                                    if (((ne) var8).field_K <= 0) {
                                      break L204;
                                    } else {
                                      break L203;
                                    }
                                  }
                                }
                                ((ne) var8).b(4);
                                ((ee) this).field_f = ((ee) this).field_f - ((ne) var8).field_O * 50;
                                break L203;
                              }
                              var8 = (Object) (Object) (ne) (Object) ((ee) this).field_e.a((byte) -40);
                              if (var15 == 0) {
                                continue L197;
                              } else {
                                break L201;
                              }
                            }
                          }
                        }
                        var8 = (Object) (Object) (mb) (Object) ((ee) this).field_K.e(param0 + 13031);
                        L205: while (true) {
                          L206: {
                            L207: {
                              if (var8 == null) {
                                break L207;
                              } else {
                                stackOut_1035_0 = ((mb) var8).field_gc;
                                stackIn_1043_0 = stackOut_1035_0 ? 1 : 0;
                                stackIn_1036_0 = stackOut_1035_0;
                                if (var15 != 0) {
                                  break L206;
                                } else {
                                  L208: {
                                    if (!stackIn_1036_0) {
                                      break L208;
                                    } else {
                                      ((mb) var8).b(4);
                                      break L208;
                                    }
                                  }
                                  var8 = (Object) (Object) (mb) (Object) ((ee) this).field_K.a((byte) -77);
                                  if (var15 == 0) {
                                    continue L205;
                                  } else {
                                    break L207;
                                  }
                                }
                              }
                            }
                            stackOut_1042_0 = var2_int;
                            stackIn_1043_0 = stackOut_1042_0;
                            break L206;
                          }
                          L209: {
                            if (stackIn_1043_0 == 0) {
                              break L209;
                            } else {
                              if (4 != ((ee) this).field_ab.b(98)) {
                                break L209;
                              } else {
                                if (((ee) this).field_R <= 0) {
                                  break L209;
                                } else {
                                  ((ee) this).field_R = ((ee) this).field_R + 1;
                                  ((ee) this).field_l = Math.max(1 + ((ee) this).field_F, 2);
                                  break L209;
                                }
                              }
                            }
                          }
                          L210: {
                            if (((ee) this).field_lb) {
                              break L210;
                            } else {
                              if (var2_int == 0) {
                                L211: {
                                  L212: {
                                    L213: {
                                      if (-1 == var3) {
                                        break L213;
                                      } else {
                                        if (((ee) this).field_ab.b(47) != 4) {
                                          break L212;
                                        } else {
                                          break L213;
                                        }
                                      }
                                    }
                                    if (((ee) this).field_R > 0) {
                                      break L212;
                                    } else {
                                      break L211;
                                    }
                                  }
                                  ((ee) this).field_R = ((ee) this).field_R + 1;
                                  ((ee) this).field_l = Math.max(1 + ((ee) this).field_F, 2);
                                  break L211;
                                }
                                L214: {
                                  if (var5 == 0) {
                                    break L214;
                                  } else {
                                    if (((ee) this).field_R != 0) {
                                      break L214;
                                    } else {
                                      if (((ee) this).field_r > 29850) {
                                        ((ee) this).field_R = 1;
                                        break L214;
                                      } else {
                                        break L214;
                                      }
                                    }
                                  }
                                }
                                L215: {
                                  if (((ee) this).field_R != 1) {
                                    break L215;
                                  } else {
                                    if (((ee) this).field_bb.length == 2) {
                                      L216: {
                                        var8_int = 0;
                                        var9 = (Object) (Object) ((ee) this).f(0, -128);
                                        if (var9 == null) {
                                          break L216;
                                        } else {
                                          if (0 < ((mb) var9).field_vb) {
                                            var8_int = ((mb) var9).field_vb;
                                            break L216;
                                          } else {
                                            break L216;
                                          }
                                        }
                                      }
                                      var9 = (Object) (Object) ((ee) this).f(1, -128);
                                      if (var9 == null) {
                                        break L215;
                                      } else {
                                        if (((mb) var9).field_vb < var8_int) {
                                          L217: {
                                            if (~var8_int != ~((mb) var9).field_vb) {
                                              break L217;
                                            } else {
                                              break L217;
                                            }
                                          }
                                          var8_int = ((mb) var9).field_vb;
                                          break L215;
                                        } else {
                                          break L215;
                                        }
                                      }
                                    } else {
                                      break L215;
                                    }
                                  }
                                }
                                L218: {
                                  L219: {
                                    if (1650 != ((ee) this).field_R) {
                                      break L219;
                                    } else {
                                      if (4 != ((ee) this).field_ab.b(57)) {
                                        break L218;
                                      } else {
                                        break L219;
                                      }
                                    }
                                  }
                                  if (1 < mm.a((byte) 119, var7)) {
                                    break L210;
                                  } else {
                                    this.a(var6_array, (byte) -114);
                                    if (var15 == 0) {
                                      break L210;
                                    } else {
                                      break L218;
                                    }
                                  }
                                }
                                this.a(var6_array, (byte) -128);
                                break L210;
                              } else {
                                break L210;
                              }
                            }
                          }
                          var8 = (Object) (Object) (wl) (Object) ((ee) this).field_db.e(13058);
                          L220: while (true) {
                            L221: {
                              L222: {
                                if (null == var8) {
                                  break L222;
                                } else {
                                  ((wl) var8).i(-1);
                                  var8 = (Object) (Object) (wl) (Object) ((ee) this).field_db.a((byte) -60);
                                  if (var15 != 0) {
                                    break L221;
                                  } else {
                                    if (var15 == 0) {
                                      continue L220;
                                    } else {
                                      break L222;
                                    }
                                  }
                                }
                              }
                              ((ee) this).field_u.a(param0 + -2, ((ee) this).field_C);
                              break L221;
                            }
                            var8 = (Object) (Object) (jb) (Object) ((ee) this).field_C.e(param0 ^ 13081);
                            L223: while (true) {
                              L224: {
                                L225: {
                                  L226: {
                                    if (var8 == null) {
                                      break L226;
                                    } else {
                                      ((jb) var8).a(false);
                                      var8 = (Object) (Object) (jb) (Object) ((ee) this).field_C.a((byte) -30);
                                      if (var15 != 0) {
                                        break L225;
                                      } else {
                                        if (var15 == 0) {
                                          continue L223;
                                        } else {
                                          break L226;
                                        }
                                      }
                                    }
                                  }
                                  if (((ee) this).field_o == null) {
                                    break L225;
                                  } else {
                                    ((ee) this).field_O.a(35, ((ee) this).field_o);
                                    var8 = (Object) (Object) (qb) (Object) ((ee) this).field_o.e(13058);
                                    L227: while (true) {
                                      if (null == var8) {
                                        break L225;
                                      } else {
                                        ((qb) var8).c((byte) 60);
                                        var8 = (Object) (Object) (qb) (Object) ((ee) this).field_o.a((byte) -13);
                                        if (var15 != 0) {
                                          break L224;
                                        } else {
                                          if (var15 == 0) {
                                            continue L227;
                                          } else {
                                            break L225;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                var8 = (Object) (Object) ((ee) this).field_J.b(22);
                                break L224;
                              }
                              L228: while (true) {
                                stackOut_1132_0 = null;
                                stackOut_1132_1 = var8;
                                stackIn_1133_0 = stackOut_1132_0;
                                stackIn_1133_1 = stackOut_1132_1;
                                if (stackIn_1133_0 == stackIn_1133_1) {
                                  break L199;
                                } else {
                                  ((kd) var8).b(4);
                                  var8 = (Object) (Object) ((ee) this).field_J.a(false);
                                  if (var15 != 0) {
                                    break L198;
                                  } else {
                                    if (var15 == 0) {
                                      continue L228;
                                    } else {
                                      break L200;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      break L199;
                    }
                    ((ee) this).field_J.a(8150);
                    ((ee) this).field_T.a(114, ((ee) this).field_db);
                    break L198;
                  }
                  break L0;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var2, "ee.MA(" + param0 + ')');
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
          throw ci.a((Throwable) (Object) var3, "ee.SA(" + param0 + ',' + param1 + ')');
        }
        return stackIn_14_0 != 0;
    }

    final static void a(boolean param0) {
        RuntimeException runtimeException = null;
        wk var1 = null;
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
            pm.a(param0);
            var2 = var1.g();
            var3 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var3 >= 15) {
                    break L3;
                  } else {
                    var2.e(-2, -2, 16777215);
                    pb.d(4, 4, 0, 0, 540, 140);
                    var3++;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                gb.field_d.d();
                var1.b(0, 0);
                tk.f((byte) 122);
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ci.a((Throwable) (Object) runtimeException, "ee.N(" + param0 + ')');
        }
    }

    private final void a(byte param0) {
        RuntimeException var2 = null;
        mb var2_ref = null;
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
        ck stackIn_8_0 = null;
        Object stackIn_46_0 = null;
        mb stackIn_46_1 = null;
        mb stackIn_57_0 = null;
        mb stackIn_57_1 = null;
        mb stackIn_128_0 = null;
        mb stackIn_128_1 = null;
        Object stackIn_146_0 = null;
        mb stackIn_146_1 = null;
        int stackIn_211_0 = 0;
        int stackIn_212_0 = 0;
        int stackIn_214_0 = 0;
        int stackIn_215_0 = 0;
        int stackIn_215_1 = 0;
        int stackIn_222_0 = 0;
        int stackIn_223_0 = 0;
        int stackIn_225_0 = 0;
        int stackIn_226_0 = 0;
        int stackIn_226_1 = 0;
        int stackIn_314_0 = 0;
        int stackIn_315_0 = 0;
        int stackIn_317_0 = 0;
        int stackIn_318_0 = 0;
        int stackIn_318_1 = 0;
        Throwable caughtException = null;
        Object stackOut_5_0 = null;
        ck stackOut_7_0 = null;
        Object stackOut_45_0 = null;
        mb stackOut_45_1 = null;
        mb stackOut_56_0 = null;
        mb stackOut_56_1 = null;
        mb stackOut_126_0 = null;
        mb stackOut_126_1 = null;
        Object stackOut_145_0 = null;
        mb stackOut_145_1 = null;
        int stackOut_208_0 = 0;
        int stackOut_210_0 = 0;
        int stackOut_211_0 = 0;
        int stackOut_212_0 = 0;
        int stackOut_212_1 = 0;
        int stackOut_214_0 = 0;
        int stackOut_214_1 = 0;
        int stackOut_219_0 = 0;
        int stackOut_221_0 = 0;
        int stackOut_222_0 = 0;
        int stackOut_223_0 = 0;
        int stackOut_223_1 = 0;
        int stackOut_225_0 = 0;
        int stackOut_225_1 = 0;
        int stackOut_311_0 = 0;
        int stackOut_313_0 = 0;
        int stackOut_314_0 = 0;
        int stackOut_315_0 = 0;
        int stackOut_315_1 = 0;
        int stackOut_317_0 = 0;
        int stackOut_317_1 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = SteelSentinels.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (param0 > 5) {
                        statePc = 4;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    ((ee) this).field_e = null;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    var2_ref = (mb) (Object) ((ee) this).field_K.e(13058);
                    if (null != var2_ref) {
                        statePc = 7;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    stackOut_5_0 = null;
                    stackIn_8_0 = (ck) (Object) stackOut_5_0;
                    statePc = 8;
                    continue stateLoop;
                }
                case 7: {
                    stackOut_7_0 = ((ee) this).field_K.a((byte) -68);
                    stackIn_8_0 = stackOut_7_0;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    var3 = (mb) (Object) stackIn_8_0;
                    if (null == var3) {
                        statePc = 20;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (~var2_ref.field_jc != ~var3.field_jc) {
                        statePc = 20;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (~var3.field_rb >= ~var2_ref.field_rb) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var4_ref_mb = var3;
                    var3 = var2_ref;
                    var2_ref = var4_ref_mb;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    if (var3.field_pc) {
                        statePc = 19;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var3 = var2_ref;
                    if (var13 == 0) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var3 = var2_ref;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    if (var2_ref == null) {
                        statePc = 25;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    if (!var2_ref.i(99)) {
                        statePc = 34;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if (var3 == null) {
                        statePc = 31;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    if (!var3.i(68)) {
                        statePc = 34;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    ((ee) this).field_w = ((ee) this).field_w + 1;
                    if (var13 == 0) {
                        statePc = 36;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    ((ee) this).field_w = 0;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    var4 = 0;
                    var6 = (mb) (Object) ((ee) this).field_K.e(13058);
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    if (var6 == null) {
                        statePc = 432;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    var7 = var2_ref;
                    if (var13 != 0) {
                        statePc = 432;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    if (var6.field_Nb == 8) {
                        statePc = 45;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if (var6.field_Nb != 11) {
                        statePc = 99;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    var8 = 2147483647;
                    var7 = var6.field_Vb;
                    stackOut_45_0 = null;
                    stackOut_45_1 = (mb) var7;
                    stackIn_46_0 = stackOut_45_0;
                    stackIn_46_1 = stackOut_45_1;
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    if (stackIn_46_0 != (Object) (Object) stackIn_46_1) {
                        statePc = 48;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 48: {
                    if (var7.field_pc) {
                        statePc = 52;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    if (!var7.field_Hb) {
                        statePc = 53;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    var7 = null;
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    if (var7 != null) {
                        statePc = 98;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    var9_ref_jc = new jc(((ee) this).field_K);
                    var10_ref_mb = (mb) (Object) var9_ref_jc.b(2);
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    if (var10_ref_mb == null) {
                        statePc = 98;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    stackOut_56_0 = (mb) var10_ref_mb;
                    stackOut_56_1 = ((ee) this).field_y;
                    stackIn_128_0 = stackOut_56_0;
                    stackIn_128_1 = stackOut_56_1;
                    stackIn_57_0 = stackOut_56_0;
                    stackIn_57_1 = stackOut_56_1;
                    if (var13 != 0) {
                        statePc = 128;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    if (stackIn_57_0 == stackIn_57_1) {
                        statePc = 97;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    if (null == var10_ref_mb) {
                        statePc = 97;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    if (var10_ref_mb.field_Hb) {
                        statePc = 97;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    if (var10_ref_mb.field_pc) {
                        statePc = 97;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    if (var10_ref_mb.i(75)) {
                        statePc = 97;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    if (~var6.field_jc == ~var10_ref_mb.field_jc) {
                        statePc = 97;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    if (var7 == null) {
                        statePc = 84;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    if (~var7.field_Bb <= ~((ee) this).field_kb) {
                        statePc = 84;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    if (var10_ref_mb.field_Bb >= ((ee) this).field_kb) {
                        statePc = 97;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    var11 = var10_ref_mb.field_hc + -var6.field_hc >> 4;
                    var12 = -var6.field_Gb + var10_ref_mb.field_Gb >> 4;
                    var12 = var12 * var12 + var11 * var11;
                    if (var12 < var8) {
                        statePc = 96;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    if (null == var7) {
                        statePc = 97;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    if (((ee) this).field_kb > var7.field_Bb) {
                        statePc = 97;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    if (((ee) this).field_kb > var10_ref_mb.field_Bb) {
                        statePc = 96;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 96: {
                    var8 = var12;
                    var7 = var10_ref_mb;
                    statePc = 97;
                    continue stateLoop;
                }
                case 97: {
                    var10_ref_mb = (mb) (Object) var9_ref_jc.d(2);
                    if (var13 == 0) {
                        statePc = 55;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    if (var13 == 0) {
                        statePc = 162;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    if (var6.field_Nb == 10) {
                        statePc = 143;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    var4++;
                    if (null == var2_ref) {
                        statePc = 114;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 105: {
                    if (var2_ref == var6.field_Vb) {
                        statePc = 114;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    if (!var2_ref.i(84)) {
                        statePc = 114;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    if (!var3.i(104)) {
                        statePc = 124;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 114: {
                    if (null == var3) {
                        statePc = 125;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 117: {
                    if (var4 < 3) {
                        statePc = 125;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    if (var3.i(83)) {
                        statePc = 125;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    var4 = 0;
                    var7 = var3;
                    if (var13 == 0) {
                        statePc = 125;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 124: {
                    var7 = var3;
                    statePc = 125;
                    continue stateLoop;
                }
                case 125: {
                    if (null == var7) {
                        statePc = 138;
                    } else {
                        statePc = 126;
                    }
                    continue stateLoop;
                }
                case 126: {
                    stackOut_126_0 = (mb) var7;
                    stackOut_126_1 = var6.field_Vb;
                    stackIn_128_0 = stackOut_126_0;
                    stackIn_128_1 = stackOut_126_1;
                    statePc = 128;
                    continue stateLoop;
                }
                case 128: {
                    if (stackIn_128_0 == stackIn_128_1) {
                        statePc = 138;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 129: {
                    if (!var7.i(78)) {
                        statePc = 138;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 132: {
                    if (200 * var6.field_Bb > ((ee) this).field_w) {
                        statePc = 137;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 137: {
                    var7 = null;
                    statePc = 138;
                    continue stateLoop;
                }
                case 138: {
                    if (var6.field_Vb == null) {
                        statePc = 162;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 139: {
                    if (var6.field_Vb.field_Hb) {
                        statePc = 162;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 142: {
                    var7 = var6.field_Vb;
                    if (var13 == 0) {
                        statePc = 162;
                    } else {
                        statePc = 143;
                    }
                    continue stateLoop;
                }
                case 143: {
                    var7 = null;
                    var8 = 2147483647;
                    var9_ref_jc = new jc(((ee) this).field_K);
                    var10_ref_mb = (mb) (Object) var9_ref_jc.b(2);
                    statePc = 144;
                    continue stateLoop;
                }
                case 144: {
                    if (var10_ref_mb == null) {
                        statePc = 162;
                    } else {
                        statePc = 145;
                    }
                    continue stateLoop;
                }
                case 145: {
                    stackOut_145_0 = null;
                    stackOut_145_1 = (mb) var10_ref_mb;
                    stackIn_46_0 = stackOut_145_0;
                    stackIn_46_1 = stackOut_145_1;
                    stackIn_146_0 = stackOut_145_0;
                    stackIn_146_1 = stackOut_145_1;
                    if (var13 != 0) {
                        statePc = 46;
                    } else {
                        statePc = 146;
                    }
                    continue stateLoop;
                }
                case 146: {
                    if (stackIn_146_0 == (Object) (Object) stackIn_146_1) {
                        statePc = 161;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 147: {
                    if (var10_ref_mb.field_Hb) {
                        statePc = 161;
                    } else {
                        statePc = 150;
                    }
                    continue stateLoop;
                }
                case 150: {
                    if (0 == var10_ref_mb.field_Nb) {
                        statePc = 161;
                    } else {
                        statePc = 153;
                    }
                    continue stateLoop;
                }
                case 153: {
                    if (var6.field_jc != var10_ref_mb.field_jc) {
                        statePc = 159;
                    } else {
                        statePc = 156;
                    }
                    continue stateLoop;
                }
                case 156: {
                    if (var13 == 0) {
                        statePc = 161;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 159: {
                    var11 = var10_ref_mb.field_hc + -var6.field_hc;
                    var12 = -var6.field_Gb + var10_ref_mb.field_Gb;
                    var12 = var12 * var12 + var11 * var11;
                    if (~var8 >= ~var12) {
                        statePc = 161;
                    } else {
                        statePc = 160;
                    }
                    continue stateLoop;
                }
                case 160: {
                    var8 = var12;
                    var7 = var10_ref_mb;
                    statePc = 161;
                    continue stateLoop;
                }
                case 161: {
                    var10_ref_mb = (mb) (Object) var9_ref_jc.d(2);
                    if (var13 == 0) {
                        statePc = 144;
                    } else {
                        statePc = 162;
                    }
                    continue stateLoop;
                }
                case 162: {
                    if (var6.field_Nb == 7) {
                        statePc = 172;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 163: {
                    if (8 == var6.field_Nb) {
                        statePc = 172;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 166: {
                    if (var6.field_Nb == 11) {
                        statePc = 172;
                    } else {
                        statePc = 169;
                    }
                    continue stateLoop;
                }
                case 169: {
                    if (var6.field_Nb != 10) {
                        statePc = 429;
                    } else {
                        statePc = 172;
                    }
                    continue stateLoop;
                }
                case 172: {
                    if (var7 == null) {
                        statePc = 429;
                    } else {
                        statePc = 175;
                    }
                    continue stateLoop;
                }
                case 175: {
                    if (!var6.field_pc) {
                        statePc = 180;
                    } else {
                        statePc = 429;
                    }
                    continue stateLoop;
                }
                case 180: {
                    if (var6.field_pb >= 750) {
                        statePc = 183;
                    } else {
                        statePc = 342;
                    }
                    continue stateLoop;
                }
                case 183: {
                    var6.field_t = 0;
                    var6.field_pb = 0;
                    var8 = ((ee) this).field_ab.b(81);
                    if (var8 != 3) {
                        statePc = 187;
                    } else {
                        statePc = 184;
                    }
                    continue stateLoop;
                }
                case 184: {
                    if (var13 == 0) {
                        statePc = 201;
                    } else {
                        statePc = 187;
                    }
                    continue stateLoop;
                }
                case 187: {
                    if (var8 == 2) {
                        statePc = 272;
                    } else {
                        statePc = 190;
                    }
                    continue stateLoop;
                }
                case 190: {
                    if (var8 != 0) {
                        statePc = 196;
                    } else {
                        statePc = 193;
                    }
                    continue stateLoop;
                }
                case 193: {
                    if (var13 == 0) {
                        statePc = 308;
                    } else {
                        statePc = 196;
                    }
                    continue stateLoop;
                }
                case 196: {
                    if (var8 == 1) {
                        statePc = 308;
                    } else {
                        statePc = 342;
                    }
                    continue stateLoop;
                }
                case 201: {
                    var8 = ((ee) this).field_ab.a(-121) / 2;
                    if (var6.field_Cb) {
                        statePc = 251;
                    } else {
                        statePc = 202;
                    }
                    continue stateLoop;
                }
                case 202: {
                    if (var7.field_Cb) {
                        statePc = 251;
                    } else {
                        statePc = 205;
                    }
                    continue stateLoop;
                }
                case 205: {
                    if (~var8 >= ~(var6.field_hc >> 4)) {
                        statePc = 210;
                    } else {
                        statePc = 208;
                    }
                    continue stateLoop;
                }
                case 208: {
                    stackOut_208_0 = 1;
                    stackIn_211_0 = stackOut_208_0;
                    statePc = 211;
                    continue stateLoop;
                }
                case 210: {
                    stackOut_210_0 = 0;
                    stackIn_211_0 = stackOut_210_0;
                    statePc = 211;
                    continue stateLoop;
                }
                case 211: {
                    stackOut_211_0 = stackIn_211_0;
                    stackIn_214_0 = stackOut_211_0;
                    stackIn_212_0 = stackOut_211_0;
                    if (~var8 >= ~(var7.field_hc >> 4)) {
                        statePc = 214;
                    } else {
                        statePc = 212;
                    }
                    continue stateLoop;
                }
                case 212: {
                    stackOut_212_0 = stackIn_212_0;
                    stackOut_212_1 = 1;
                    stackIn_215_0 = stackOut_212_0;
                    stackIn_215_1 = stackOut_212_1;
                    statePc = 215;
                    continue stateLoop;
                }
                case 214: {
                    stackOut_214_0 = stackIn_214_0;
                    stackOut_214_1 = 0;
                    stackIn_215_0 = stackOut_214_0;
                    stackIn_215_1 = stackOut_214_1;
                    statePc = 215;
                    continue stateLoop;
                }
                case 215: {
                    if (stackIn_215_0 != stackIn_215_1) {
                        statePc = 251;
                    } else {
                        statePc = 216;
                    }
                    continue stateLoop;
                }
                case 216: {
                    if (var6.field_u) {
                        statePc = 221;
                    } else {
                        statePc = 219;
                    }
                    continue stateLoop;
                }
                case 219: {
                    stackOut_219_0 = 1;
                    stackIn_222_0 = stackOut_219_0;
                    statePc = 222;
                    continue stateLoop;
                }
                case 221: {
                    stackOut_221_0 = 0;
                    stackIn_222_0 = stackOut_221_0;
                    statePc = 222;
                    continue stateLoop;
                }
                case 222: {
                    stackOut_222_0 = stackIn_222_0;
                    stackIn_225_0 = stackOut_222_0;
                    stackIn_223_0 = stackOut_222_0;
                    if (var7.field_u) {
                        statePc = 225;
                    } else {
                        statePc = 223;
                    }
                    continue stateLoop;
                }
                case 223: {
                    stackOut_223_0 = stackIn_223_0;
                    stackOut_223_1 = 1;
                    stackIn_226_0 = stackOut_223_0;
                    stackIn_226_1 = stackOut_223_1;
                    statePc = 226;
                    continue stateLoop;
                }
                case 225: {
                    stackOut_225_0 = stackIn_225_0;
                    stackOut_225_1 = 0;
                    stackIn_226_0 = stackOut_225_0;
                    stackIn_226_1 = stackOut_225_1;
                    statePc = 226;
                    continue stateLoop;
                }
                case 226: {
                    if (stackIn_226_0 != stackIn_226_1) {
                        statePc = 230;
                    } else {
                        statePc = 227;
                    }
                    continue stateLoop;
                }
                case 227: {
                    var6.field_t = var7.field_hc >> 4;
                    if (var13 == 0) {
                        statePc = 271;
                    } else {
                        statePc = 230;
                    }
                    continue stateLoop;
                }
                case 230: {
                    if (!var6.field_u) {
                        statePc = 242;
                    } else {
                        statePc = 233;
                    }
                    continue stateLoop;
                }
                case 233: {
                    if (this.a((byte) 91, var7.field_hc >> 4, var6.field_hc >> 4)) {
                        statePc = 239;
                    } else {
                        statePc = 236;
                    }
                    continue stateLoop;
                }
                case 236: {
                    var6.field_t = var7.field_hc >> 4;
                    if (var13 == 0) {
                        statePc = 271;
                    } else {
                        statePc = 239;
                    }
                    continue stateLoop;
                }
                case 239: {
                    var6.field_t = this.a((byte) 69, var6.field_hc >> 4);
                    if (var13 == 0) {
                        statePc = 271;
                    } else {
                        statePc = 242;
                    }
                    continue stateLoop;
                }
                case 242: {
                    if (this.a((byte) 127, var6.field_hc >> 4, var7.field_hc >> 4)) {
                        statePc = 248;
                    } else {
                        statePc = 245;
                    }
                    continue stateLoop;
                }
                case 245: {
                    var6.field_t = var7.field_hc >> 4;
                    if (var13 == 0) {
                        statePc = 271;
                    } else {
                        statePc = 248;
                    }
                    continue stateLoop;
                }
                case 248: {
                    var6.field_t = this.a((byte) -81, var6.field_hc >> 4);
                    if (var13 == 0) {
                        statePc = 271;
                    } else {
                        statePc = 251;
                    }
                    continue stateLoop;
                }
                case 251: {
                    if (var6.field_Cb) {
                        statePc = 257;
                    } else {
                        statePc = 254;
                    }
                    continue stateLoop;
                }
                case 254: {
                    var6.field_t = var8;
                    if (var13 == 0) {
                        statePc = 271;
                    } else {
                        statePc = 257;
                    }
                    continue stateLoop;
                }
                case 257: {
                    if (var7.field_Cb) {
                        statePc = 269;
                    } else {
                        statePc = 260;
                    }
                    continue stateLoop;
                }
                case 260: {
                    if (~var7.field_hc <= ~var6.field_hc) {
                        statePc = 266;
                    } else {
                        statePc = 263;
                    }
                    continue stateLoop;
                }
                case 263: {
                    var6.field_t = -100 + (-5120 + var8);
                    if (var13 == 0) {
                        statePc = 271;
                    } else {
                        statePc = 266;
                    }
                    continue stateLoop;
                }
                case 266: {
                    var6.field_t = var8 + 5220;
                    if (var13 == 0) {
                        statePc = 271;
                    } else {
                        statePc = 269;
                    }
                    continue stateLoop;
                }
                case 269: {
                    var6.field_t = var7.field_hc >> 4;
                    statePc = 271;
                    continue stateLoop;
                }
                case 271: {
                    if (var13 == 0) {
                        statePc = 342;
                    } else {
                        statePc = 272;
                    }
                    continue stateLoop;
                }
                case 272: {
                    if (var6.field_u) {
                        statePc = 299;
                    } else {
                        statePc = 275;
                    }
                    continue stateLoop;
                }
                case 275: {
                    if (!this.b(true, var6.field_hc >> 4)) {
                        statePc = 299;
                    } else {
                        statePc = 278;
                    }
                    continue stateLoop;
                }
                case 278: {
                    if (~var6.field_hc >= ~var7.field_hc) {
                        statePc = 290;
                    } else {
                        statePc = 281;
                    }
                    continue stateLoop;
                }
                case 281: {
                    if (!this.a(var6.field_hc >> 4, false)) {
                        statePc = 287;
                    } else {
                        statePc = 284;
                    }
                    continue stateLoop;
                }
                case 284: {
                    var6.field_t = (var6.field_hc >> 4) - -1500;
                    if (var13 == 0) {
                        statePc = 342;
                    } else {
                        statePc = 287;
                    }
                    continue stateLoop;
                }
                case 287: {
                    var6.field_t = var7.field_hc >> 4;
                    if (var13 == 0) {
                        statePc = 342;
                    } else {
                        statePc = 290;
                    }
                    continue stateLoop;
                }
                case 290: {
                    if (this.e(-44, var6.field_hc >> 4)) {
                        statePc = 296;
                    } else {
                        statePc = 293;
                    }
                    continue stateLoop;
                }
                case 293: {
                    var6.field_t = var7.field_hc >> 4;
                    if (var13 == 0) {
                        statePc = 342;
                    } else {
                        statePc = 296;
                    }
                    continue stateLoop;
                }
                case 296: {
                    var6.field_t = -1500 + (var6.field_hc >> 4);
                    if (var13 == 0) {
                        statePc = 342;
                    } else {
                        statePc = 299;
                    }
                    continue stateLoop;
                }
                case 299: {
                    if (!var6.field_u) {
                        statePc = 342;
                    } else {
                        statePc = 302;
                    }
                    continue stateLoop;
                }
                case 302: {
                    if (!this.a((byte) 61, var7.field_hc >> 4, var6.field_hc >> 4)) {
                        statePc = 342;
                    } else {
                        statePc = 305;
                    }
                    continue stateLoop;
                }
                case 305: {
                    var6.field_t = this.a((byte) 50, var6.field_hc >> 4);
                    if (var13 == 0) {
                        statePc = 342;
                    } else {
                        statePc = 308;
                    }
                    continue stateLoop;
                }
                case 308: {
                    if (var6.field_u) {
                        statePc = 313;
                    } else {
                        statePc = 311;
                    }
                    continue stateLoop;
                }
                case 311: {
                    stackOut_311_0 = 1;
                    stackIn_314_0 = stackOut_311_0;
                    statePc = 314;
                    continue stateLoop;
                }
                case 313: {
                    stackOut_313_0 = 0;
                    stackIn_314_0 = stackOut_313_0;
                    statePc = 314;
                    continue stateLoop;
                }
                case 314: {
                    stackOut_314_0 = stackIn_314_0;
                    stackIn_317_0 = stackOut_314_0;
                    stackIn_315_0 = stackOut_314_0;
                    if (var7.field_u) {
                        statePc = 317;
                    } else {
                        statePc = 315;
                    }
                    continue stateLoop;
                }
                case 315: {
                    stackOut_315_0 = stackIn_315_0;
                    stackOut_315_1 = 1;
                    stackIn_318_0 = stackOut_315_0;
                    stackIn_318_1 = stackOut_315_1;
                    statePc = 318;
                    continue stateLoop;
                }
                case 317: {
                    stackOut_317_0 = stackIn_317_0;
                    stackOut_317_1 = 0;
                    stackIn_318_0 = stackOut_317_0;
                    stackIn_318_1 = stackOut_317_1;
                    statePc = 318;
                    continue stateLoop;
                }
                case 318: {
                    if (stackIn_318_0 != stackIn_318_1) {
                        statePc = 322;
                    } else {
                        statePc = 319;
                    }
                    continue stateLoop;
                }
                case 319: {
                    var6.field_t = var7.field_hc >> 4;
                    if (var13 == 0) {
                        statePc = 342;
                    } else {
                        statePc = 322;
                    }
                    continue stateLoop;
                }
                case 322: {
                    if (var6.field_u) {
                        statePc = 334;
                    } else {
                        statePc = 325;
                    }
                    continue stateLoop;
                }
                case 325: {
                    if (!this.a((byte) 39, var6.field_hc >> 4, var7.field_hc >> 4)) {
                        statePc = 331;
                    } else {
                        statePc = 328;
                    }
                    continue stateLoop;
                }
                case 328: {
                    var6.field_t = this.a((byte) 124, var6.field_hc >> 4);
                    if (var13 == 0) {
                        statePc = 342;
                    } else {
                        statePc = 331;
                    }
                    continue stateLoop;
                }
                case 331: {
                    var6.field_t = var7.field_hc >> 4;
                    if (var13 == 0) {
                        statePc = 342;
                    } else {
                        statePc = 334;
                    }
                    continue stateLoop;
                }
                case 334: {
                    if (this.a((byte) 95, var7.field_hc >> 4, var6.field_hc >> 4)) {
                        statePc = 340;
                    } else {
                        statePc = 337;
                    }
                    continue stateLoop;
                }
                case 337: {
                    var6.field_t = var7.field_hc >> 4;
                    if (var13 == 0) {
                        statePc = 342;
                    } else {
                        statePc = 340;
                    }
                    continue stateLoop;
                }
                case 340: {
                    var6.field_t = this.a((byte) 93, var6.field_hc >> 4);
                    statePc = 342;
                    continue stateLoop;
                }
                case 342: {
                    if (var6.field_t <= 0) {
                        statePc = 349;
                    } else {
                        statePc = 343;
                    }
                    continue stateLoop;
                }
                case 343: {
                    if (200 > Math.abs((var6.field_hc >> 4) - var6.field_t)) {
                        statePc = 348;
                    } else {
                        statePc = 349;
                    }
                    continue stateLoop;
                }
                case 348: {
                    var6.field_pb = 0;
                    var6.field_t = 0;
                    statePc = 349;
                    continue stateLoop;
                }
                case 349: {
                    if (var6.field_t <= 0) {
                        statePc = 356;
                    } else {
                        statePc = 350;
                    }
                    continue stateLoop;
                }
                case 350: {
                    if (var7.field_pc) {
                        statePc = 355;
                    } else {
                        statePc = 356;
                    }
                    continue stateLoop;
                }
                case 355: {
                    var6.field_pb = 0;
                    var6.field_t = 0;
                    statePc = 356;
                    continue stateLoop;
                }
                case 356: {
                    if (var6.field_t <= 0) {
                        statePc = 361;
                    } else {
                        statePc = 357;
                    }
                    continue stateLoop;
                }
                case 357: {
                    if (var6.field_rc != 24) {
                        statePc = 361;
                    } else {
                        statePc = 360;
                    }
                    continue stateLoop;
                }
                case 360: {
                    var6.field_pb = 0;
                    var6.field_t = 0;
                    var8_ref_je = new je(11, 0, ((ee) this).field_r + 2);
                    var8_ref_je.field_p = true;
                    var6.field_B.a(3, (ck) (Object) var8_ref_je);
                    statePc = 361;
                    continue stateLoop;
                }
                case 361: {
                    if (var6.field_t <= 0) {
                        statePc = 366;
                    } else {
                        statePc = 362;
                    }
                    continue stateLoop;
                }
                case 362: {
                    if (15 != var6.field_rc) {
                        statePc = 366;
                    } else {
                        statePc = 365;
                    }
                    continue stateLoop;
                }
                case 365: {
                    var6.field_pb = 0;
                    var6.field_t = 0;
                    var8_ref_je = new je(8, 0, 2 + ((ee) this).field_r);
                    var8_ref_je.field_p = true;
                    var6.field_B.a(3, (ck) (Object) var8_ref_je);
                    statePc = 366;
                    continue stateLoop;
                }
                case 366: {
                    var8 = var6.field_Zb.field_N;
                    var9 = var7.field_hc + -var6.field_hc;
                    var10 = -var6.field_Gb + var7.field_Gb;
                    if (var9 < 0) {
                        statePc = 368;
                    } else {
                        statePc = 367;
                    }
                    continue stateLoop;
                }
                case 367: {
                    var5 = 1;
                    if (var13 == 0) {
                        statePc = 369;
                    } else {
                        statePc = 368;
                    }
                    continue stateLoop;
                }
                case 368: {
                    var5 = -1;
                    statePc = 369;
                    continue stateLoop;
                }
                case 369: {
                    if (!var6.field_Ec.f(7)) {
                        statePc = 429;
                    } else {
                        statePc = 370;
                    }
                    continue stateLoop;
                }
                case 370: {
                    if (var6.field_B.f(7)) {
                        statePc = 375;
                    } else {
                        statePc = 429;
                    }
                    continue stateLoop;
                }
                case 375: {
                    if (109 != var8) {
                        statePc = 378;
                    } else {
                        statePc = 376;
                    }
                    continue stateLoop;
                }
                case 376: {
                    this.a(var9, var7, 16384, var10, var5, var6);
                    statePc = 378;
                    continue stateLoop;
                }
                case 378: {
                    if (107 == var8) {
                        statePc = 381;
                    } else {
                        statePc = 382;
                    }
                    continue stateLoop;
                }
                case 381: {
                    this.a(var6, var5, var10, var7, 0, var9);
                    statePc = 382;
                    continue stateLoop;
                }
                case 382: {
                    if (var8 == 108) {
                        statePc = 385;
                    } else {
                        statePc = 386;
                    }
                    continue stateLoop;
                }
                case 385: {
                    var10 = this.a(var7, var9, (byte) -64, var10, var6, var5);
                    statePc = 386;
                    continue stateLoop;
                }
                case 386: {
                    if (var8 == 0) {
                        statePc = 389;
                    } else {
                        statePc = 390;
                    }
                    continue stateLoop;
                }
                case 389: {
                    this.a(var10, var5, (byte) 21, var7, var6, var9);
                    statePc = 390;
                    continue stateLoop;
                }
                case 390: {
                    if (var8 != 55) {
                        statePc = 393;
                    } else {
                        statePc = 391;
                    }
                    continue stateLoop;
                }
                case 391: {
                    this.a((byte) 68, var5, var10, var9, var6, var7);
                    statePc = 393;
                    continue stateLoop;
                }
                case 393: {
                    if (57 != var8) {
                        statePc = 396;
                    } else {
                        statePc = 394;
                    }
                    continue stateLoop;
                }
                case 394: {
                    this.a(var9, 2714, var10, var5, var6, var7);
                    statePc = 396;
                    continue stateLoop;
                }
                case 396: {
                    if (var8 != 62) {
                        statePc = 399;
                    } else {
                        statePc = 397;
                    }
                    continue stateLoop;
                }
                case 397: {
                    this.a(var10, var5, var6, var9, var7, (byte) 88);
                    statePc = 399;
                    continue stateLoop;
                }
                case 399: {
                    if (var8 == 65) {
                        statePc = 402;
                    } else {
                        statePc = 403;
                    }
                    continue stateLoop;
                }
                case 402: {
                    this.a(var5, var9, var10, var6, var7, false);
                    statePc = 403;
                    continue stateLoop;
                }
                case 403: {
                    if (var8 == 69) {
                        statePc = 406;
                    } else {
                        statePc = 407;
                    }
                    continue stateLoop;
                }
                case 406: {
                    this.a(var6, (byte) -35, var7, var9, var5);
                    statePc = 407;
                    continue stateLoop;
                }
                case 407: {
                    if (var8 != 72) {
                        statePc = 410;
                    } else {
                        statePc = 408;
                    }
                    continue stateLoop;
                }
                case 408: {
                    this.a(var9, var7, var6, 20063, var5);
                    statePc = 410;
                    continue stateLoop;
                }
                case 410: {
                    if (var8 != 75) {
                        statePc = 413;
                    } else {
                        statePc = 411;
                    }
                    continue stateLoop;
                }
                case 411: {
                    this.a((byte) -121, var10, var7, var9, var6, var5);
                    statePc = 413;
                    continue stateLoop;
                }
                case 413: {
                    if (var8 == 79) {
                        statePc = 416;
                    } else {
                        statePc = 417;
                    }
                    continue stateLoop;
                }
                case 416: {
                    this.a((byte) 57, var9, var7, var6, var5, var10);
                    statePc = 417;
                    continue stateLoop;
                }
                case 417: {
                    if (84 == var8) {
                        statePc = 420;
                    } else {
                        statePc = 421;
                    }
                    continue stateLoop;
                }
                case 420: {
                    this.a(var10, var6, var9, var7, var5, 14432);
                    statePc = 421;
                    continue stateLoop;
                }
                case 421: {
                    if (var8 == 88) {
                        statePc = 424;
                    } else {
                        statePc = 425;
                    }
                    continue stateLoop;
                }
                case 424: {
                    this.a(var7, var9, -128, var5, var6, var10);
                    statePc = 425;
                    continue stateLoop;
                }
                case 425: {
                    if (var8 == 92) {
                        statePc = 428;
                    } else {
                        statePc = 429;
                    }
                    continue stateLoop;
                }
                case 428: {
                    this.a(-103, var5, var7, var9, var6);
                    statePc = 429;
                    continue stateLoop;
                }
                case 429: {
                    var6 = (mb) (Object) ((ee) this).field_K.a((byte) -48);
                    if (var13 == 0) {
                        statePc = 37;
                    } else {
                        statePc = 432;
                    }
                    continue stateLoop;
                }
                case 432: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void c(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
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
              L3: {
                kc.field_A = false;
                if (!de.field_d) {
                  break L3;
                } else {
                  ch.field_O.m((byte) 127);
                  if (var2 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                var1_int = ua.field_o;
                if (var1_int > 0) {
                  L5: {
                    L6: {
                      if (var1_int == 1) {
                        break L6;
                      } else {
                        ba.field_f = db.a(df.field_J, -120, new String[1]);
                        if (var2 == 0) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    ba.field_f = vk.field_k;
                    break L5;
                  }
                  ba.field_f = ue.a(new CharSequence[3], param0 + -11828);
                  break L4;
                } else {
                  break L4;
                }
              }
              ch.field_O.m(105);
              tc.a((byte) 54);
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var1, "ee.J(" + param0 + ')');
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
        Object stackIn_13_0 = null;
        Object stackIn_17_0 = null;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_43_0 = 0;
        int stackIn_43_1 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_12_0 = null;
        Object stackOut_16_0 = null;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        int stackOut_42_0 = 0;
        int stackOut_42_1 = 0;
        var8 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              L2: {
                if (((ee) this).field_b == 0) {
                  break L2;
                } else {
                  if (((ee) this).field_b < 50) {
                    break L1;
                  } else {
                    ((ee) this).field_b = 49;
                    if (var8 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              ((ee) this).field_b = 1;
              break L1;
            }
            var3_int = ((ee) this).field_ab.field_o[param1];
            var4 = kc.field_x[4][0].field_z << 4;
            var5 = -(var4 / 2) + var3_int;
            var6 = var3_int + var4 / 2;
            var7_int = var5;
            L3: while (true) {
              L4: {
                L5: {
                  if (~var6 >= ~var7_int) {
                    break L5;
                  } else {
                    ((ee) this).field_ab.field_m[var7_int] = 0;
                    ((ee) this).field_ab.field_e[var7_int] = 0;
                    stackOut_12_0 = this;
                    stackIn_17_0 = stackOut_12_0;
                    stackIn_13_0 = stackOut_12_0;
                    if (var8 != 0) {
                      break L4;
                    } else {
                      ((ee) this).field_ab.field_f[var7_int] = 0;
                      var7_int++;
                      if (var8 == 0) {
                        continue L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                stackOut_16_0 = this;
                stackIn_17_0 = stackOut_16_0;
                break L4;
              }
              var7 = (mb) (Object) ((ee) this).field_K.e(13058);
              L6: while (true) {
                L7: {
                  L8: {
                    if (null == var7) {
                      break L8;
                    } else {
                      stackOut_19_0 = ~param1;
                      stackOut_19_1 = ~var7.field_jc;
                      stackIn_43_0 = stackOut_19_0;
                      stackIn_43_1 = stackOut_19_1;
                      stackIn_20_0 = stackOut_19_0;
                      stackIn_20_1 = stackOut_19_1;
                      if (var8 != 0) {
                        break L7;
                      } else {
                        L9: {
                          if (stackIn_20_0 != stackIn_20_1) {
                            break L9;
                          } else {
                            if (0 < var7.field_z) {
                              var7.field_z = 0;
                              var7.field_pc = false;
                              var7.field_rb = 0;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                        }
                        L10: {
                          L11: {
                            L12: {
                              if (var7.field_jc == param1) {
                                break L12;
                              } else {
                                if (!var7.field_Hb) {
                                  break L11;
                                } else {
                                  break L12;
                                }
                              }
                            }
                            if (!var7.field_Hb) {
                              var7.field_Cb = false;
                              if (var8 == 0) {
                                break L10;
                              } else {
                                break L11;
                              }
                            } else {
                              break L10;
                            }
                          }
                          var7.field_vb = var7.field_vb + 100000;
                          var7.field_Fc = 50;
                          var7.field_Ab = var7.field_Ab + 100000;
                          break L10;
                        }
                        var7 = (mb) (Object) ((ee) this).field_K.a((byte) -111);
                        if (var8 == 0) {
                          continue L6;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                  stackOut_42_0 = param0;
                  stackOut_42_1 = -108;
                  stackIn_43_0 = stackOut_42_0;
                  stackIn_43_1 = stackOut_42_1;
                  break L7;
                }
                L13: {
                  if (stackIn_43_0 <= stackIn_43_1) {
                    break L13;
                  } else {
                    ee.g(124);
                    break L13;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var3, "ee.F(" + param0 + ',' + param1 + ')');
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
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_79_2 = null;
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
        int stackOut_41_0 = 0;
        int stackOut_41_1 = 0;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        String stackOut_78_2 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
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
                      L2: {
                        if (param4.field_hc >= 4096) {
                          break L2;
                        } else {
                          param4.field_t = 1024 + param4.field_hc;
                          if (var11 == 0) {
                            break L1;
                          } else {
                            break L2;
                          }
                        }
                      }
                      param4.field_t = param4.field_hc + -1024;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            L3: {
              L4: {
                if (param4.field_t <= 0) {
                  break L4;
                } else {
                  L5: {
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
                      break L5;
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
                      break L5;
                    }
                  }
                  var7_ref = new je(stackIn_26_2, stackIn_26_3, 2 + ((ee) this).field_r);
                  var7_ref.field_p = true;
                  param4.field_B.a(3, (ck) (Object) var7_ref);
                  if (var11 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              L6: {
                if (Math.abs(param3) >= 30000) {
                  break L6;
                } else {
                  if (Math.abs(param3) < 30000) {
                    var7_ref = new je(6, -param1, ((ee) this).field_r + 2);
                    var7_ref.field_p = true;
                    if (var11 == 0) {
                      break L3;
                    } else {
                      break L6;
                    }
                  } else {
                    break L3;
                  }
                }
              }
              var7_ref = new je(6, param1, ((ee) this).field_r - -2);
              var7_ref.field_p = true;
              param4.field_B.a(3, (ck) (Object) var7_ref);
              var7_ref = new je(3, 0, 100 + ((ee) this).field_r + (4 - -((param5.field_hc + ((ee) this).field_r - -param4.field_hc) % 100)));
              var7_ref.field_u = param5.field_hc;
              var7_ref.field_p = true;
              var7_ref.field_y = param4.field_Gb + -20000;
              param4.field_B.a(3, (ck) (Object) var7_ref);
              param4.field_Tb = param4.field_x;
              break L3;
            }
            var7_int = -1;
            if (param0 > 53) {
              var8_int = 0;
              L7: while (true) {
                L8: {
                  L9: {
                    L10: {
                      if (param4.field_Xb.length <= var8_int) {
                        break L10;
                      } else {
                        stackOut_41_0 = ~param4.field_Xb[var8_int];
                        stackOut_41_1 = -14;
                        stackIn_55_0 = stackOut_41_0;
                        stackIn_55_1 = stackOut_41_1;
                        stackIn_42_0 = stackOut_41_0;
                        stackIn_42_1 = stackOut_41_1;
                        if (var11 != 0) {
                          break L9;
                        } else {
                          L11: {
                            if (stackIn_42_0 != stackIn_42_1) {
                              break L11;
                            } else {
                              var7_int = var8_int;
                              if (var11 == 0) {
                                break L10;
                              } else {
                                break L11;
                              }
                            }
                          }
                          var8_int++;
                          if (var11 == 0) {
                            continue L7;
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                    L12: {
                      if (var7_int < 0) {
                        break L12;
                      } else {
                        if (this.a(((ee) this).field_z, (byte) -95, var7_int, param4, param5, 2600, 5 + ((ee) this).field_r + (param4.field_hc + (param5.field_hc + ((ee) this).field_r)) % 100)) {
                          break L8;
                        } else {
                          break L12;
                        }
                      }
                    }
                    stackOut_53_0 = 40000;
                    stackOut_53_1 = Math.abs(param3);
                    stackIn_55_0 = stackOut_53_0;
                    stackIn_55_1 = stackOut_53_1;
                    break L9;
                  }
                  if (stackIn_55_0 <= stackIn_55_1) {
                    break L8;
                  } else {
                    L13: {
                      L14: {
                        var8 = new je(0, 0, 5 + (((ee) this).field_r - -((param5.field_hc + (((ee) this).field_r - -param4.field_hc)) % 100)));
                        var8.field_y = param5.field_Gb;
                        var8.field_u = param5.field_hc;
                        var9 = Math.atan2((double)param3, (double)(-param2));
                        var8.field_B = (int)(var9 * 65536.0 / 6.283185307179586);
                        if (param1 >= 0) {
                          break L14;
                        } else {
                          if (var8.field_B <= 16384) {
                            break L13;
                          } else {
                            var8.field_B = var8.field_B - 65536;
                            if (var11 == 0) {
                              break L13;
                            } else {
                              break L14;
                            }
                          }
                        }
                      }
                      if (var8.field_B < -16384) {
                        var8.field_B = var8.field_B + 65536;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    var8.field_p = true;
                    param4.field_B.a(3, (ck) (Object) var8);
                    break L8;
                  }
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var7 = decompiledCaughtException;
            stackOut_71_0 = (RuntimeException) var7;
            stackOut_71_1 = new StringBuilder().append("ee.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_74_0 = stackOut_71_0;
            stackIn_74_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param4 == null) {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "null";
              stackIn_75_0 = stackOut_74_0;
              stackIn_75_1 = stackOut_74_1;
              stackIn_75_2 = stackOut_74_2;
              break L15;
            } else {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "{...}";
              stackIn_75_0 = stackOut_72_0;
              stackIn_75_1 = stackOut_72_1;
              stackIn_75_2 = stackOut_72_2;
              break L15;
            }
          }
          L16: {
            stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
            stackOut_75_1 = ((StringBuilder) (Object) stackIn_75_1).append(stackIn_75_2).append(',');
            stackIn_78_0 = stackOut_75_0;
            stackIn_78_1 = stackOut_75_1;
            stackIn_76_0 = stackOut_75_0;
            stackIn_76_1 = stackOut_75_1;
            if (param5 == null) {
              stackOut_78_0 = (RuntimeException) (Object) stackIn_78_0;
              stackOut_78_1 = (StringBuilder) (Object) stackIn_78_1;
              stackOut_78_2 = "null";
              stackIn_79_0 = stackOut_78_0;
              stackIn_79_1 = stackOut_78_1;
              stackIn_79_2 = stackOut_78_2;
              break L16;
            } else {
              stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
              stackOut_76_1 = (StringBuilder) (Object) stackIn_76_1;
              stackOut_76_2 = "{...}";
              stackIn_79_0 = stackOut_76_0;
              stackIn_79_1 = stackOut_76_1;
              stackIn_79_2 = stackOut_76_2;
              break L16;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_79_0, stackIn_79_2 + ')');
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
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_87_0 = 0;
        int stackIn_87_1 = 0;
        int stackIn_97_0 = 0;
        int stackIn_97_1 = 0;
        int[] stackIn_99_0 = null;
        int stackIn_117_0 = 0;
        int stackIn_117_1 = 0;
        int stackIn_168_0 = 0;
        int stackIn_168_1 = 0;
        int stackIn_179_0 = 0;
        int stackIn_179_1 = 0;
        int[] stackIn_199_0 = null;
        RuntimeException stackIn_202_0 = null;
        StringBuilder stackIn_202_1 = null;
        RuntimeException stackIn_204_0 = null;
        StringBuilder stackIn_204_1 = null;
        RuntimeException stackIn_205_0 = null;
        StringBuilder stackIn_205_1 = null;
        String stackIn_205_2 = null;
        RuntimeException stackIn_206_0 = null;
        StringBuilder stackIn_206_1 = null;
        RuntimeException stackIn_208_0 = null;
        StringBuilder stackIn_208_1 = null;
        RuntimeException stackIn_209_0 = null;
        StringBuilder stackIn_209_1 = null;
        String stackIn_209_2 = null;
        RuntimeException stackIn_210_0 = null;
        StringBuilder stackIn_210_1 = null;
        RuntimeException stackIn_212_0 = null;
        StringBuilder stackIn_212_1 = null;
        RuntimeException stackIn_213_0 = null;
        StringBuilder stackIn_213_1 = null;
        String stackIn_213_2 = null;
        RuntimeException stackIn_214_0 = null;
        StringBuilder stackIn_214_1 = null;
        RuntimeException stackIn_216_0 = null;
        StringBuilder stackIn_216_1 = null;
        RuntimeException stackIn_217_0 = null;
        StringBuilder stackIn_217_1 = null;
        String stackIn_217_2 = null;
        RuntimeException stackIn_218_0 = null;
        StringBuilder stackIn_218_1 = null;
        RuntimeException stackIn_220_0 = null;
        StringBuilder stackIn_220_1 = null;
        RuntimeException stackIn_221_0 = null;
        StringBuilder stackIn_221_1 = null;
        String stackIn_221_2 = null;
        RuntimeException decompiledCaughtException = null;
        mb stackOut_4_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_86_0 = 0;
        int stackOut_86_1 = 0;
        int[] stackOut_98_0 = null;
        int stackOut_116_0 = 0;
        int stackOut_116_1 = 0;
        int stackOut_96_0 = 0;
        int stackOut_96_1 = 0;
        int stackOut_167_0 = 0;
        int stackOut_167_1 = 0;
        int stackOut_178_0 = 0;
        int stackOut_178_1 = 0;
        int[] stackOut_198_0 = null;
        RuntimeException stackOut_201_0 = null;
        StringBuilder stackOut_201_1 = null;
        RuntimeException stackOut_204_0 = null;
        StringBuilder stackOut_204_1 = null;
        String stackOut_204_2 = null;
        RuntimeException stackOut_202_0 = null;
        StringBuilder stackOut_202_1 = null;
        String stackOut_202_2 = null;
        RuntimeException stackOut_205_0 = null;
        StringBuilder stackOut_205_1 = null;
        RuntimeException stackOut_208_0 = null;
        StringBuilder stackOut_208_1 = null;
        String stackOut_208_2 = null;
        RuntimeException stackOut_206_0 = null;
        StringBuilder stackOut_206_1 = null;
        String stackOut_206_2 = null;
        RuntimeException stackOut_209_0 = null;
        StringBuilder stackOut_209_1 = null;
        RuntimeException stackOut_212_0 = null;
        StringBuilder stackOut_212_1 = null;
        String stackOut_212_2 = null;
        RuntimeException stackOut_210_0 = null;
        StringBuilder stackOut_210_1 = null;
        String stackOut_210_2 = null;
        RuntimeException stackOut_213_0 = null;
        StringBuilder stackOut_213_1 = null;
        RuntimeException stackOut_216_0 = null;
        StringBuilder stackOut_216_1 = null;
        String stackOut_216_2 = null;
        RuntimeException stackOut_214_0 = null;
        StringBuilder stackOut_214_1 = null;
        String stackOut_214_2 = null;
        RuntimeException stackOut_217_0 = null;
        StringBuilder stackOut_217_1 = null;
        RuntimeException stackOut_220_0 = null;
        StringBuilder stackOut_220_1 = null;
        String stackOut_220_2 = null;
        RuntimeException stackOut_218_0 = null;
        StringBuilder stackOut_218_1 = null;
        String stackOut_218_2 = null;
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
              L4: {
                L5: {
                  if (var9 > 7) {
                    break L5;
                  } else {
                    param5[var9 + 12] = 1;
                    var9++;
                    if (var14 != 0) {
                      break L4;
                    } else {
                      if (var14 == 0) {
                        continue L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
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
                  break L4;
                } else {
                  return;
                }
              }
              var9_ref_mb__ = param0;
              var10 = 0;
              L6: while (true) {
                stackOut_19_0 = var10;
                stackOut_19_1 = var9_ref_mb__.length;
                stackIn_20_0 = stackOut_19_0;
                stackIn_20_1 = stackOut_19_1;
                L7: while (true) {
                  L8: {
                    L9: {
                      L10: {
                        L11: {
                          if (stackIn_20_0 >= stackIn_20_1) {
                            break L11;
                          } else {
                            var11 = var9_ref_mb__[var10];
                            if (var14 != 0) {
                              break L10;
                            } else {
                              L12: {
                                L13: {
                                  if (var7_ref != var11) {
                                    break L13;
                                  } else {
                                    if (var14 == 0) {
                                      break L12;
                                    } else {
                                      break L13;
                                    }
                                  }
                                }
                                var13 = 0;
                                L14: while (true) {
                                  L15: {
                                    if (32 <= var13) {
                                      break L15;
                                    } else {
                                      stackOut_30_0 = -4;
                                      stackOut_30_1 = ~var13;
                                      stackIn_20_0 = stackOut_30_0;
                                      stackIn_20_1 = stackOut_30_1;
                                      stackIn_31_0 = stackOut_30_0;
                                      stackIn_31_1 = stackOut_30_1;
                                      if (var14 != 0) {
                                        continue L7;
                                      } else {
                                        L16: {
                                          if (stackIn_31_0 == stackIn_31_1) {
                                            break L16;
                                          } else {
                                            if (var13 == 20) {
                                              break L16;
                                            } else {
                                              if (var13 == 22) {
                                                break L16;
                                              } else {
                                                if (6 == var13) {
                                                  break L16;
                                                } else {
                                                  if (var13 == 5) {
                                                    break L16;
                                                  } else {
                                                    if (var13 == 25) {
                                                      break L16;
                                                    } else {
                                                      L17: {
                                                        var12 = var11.b(true, var13);
                                                        if (4 != var13) {
                                                          break L17;
                                                        } else {
                                                          if (~param5[var13] < ~var12) {
                                                            param5[var13] = var12;
                                                            if (var14 == 0) {
                                                              break L16;
                                                            } else {
                                                              break L17;
                                                            }
                                                          } else {
                                                            break L16;
                                                          }
                                                        }
                                                      }
                                                      if (var12 > param5[var13]) {
                                                        param5[var13] = var12;
                                                        break L16;
                                                      } else {
                                                        break L16;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                        var13++;
                                        if (var14 == 0) {
                                          continue L14;
                                        } else {
                                          break L15;
                                        }
                                      }
                                    }
                                  }
                                  L18: {
                                    if (null == param1) {
                                      break L18;
                                    } else {
                                      param1[var11.field_jc] = param1[var11.field_jc] + var11.field_vb;
                                      break L18;
                                    }
                                  }
                                  if (var11.field_Hb) {
                                    break L12;
                                  } else {
                                    var8++;
                                    break L12;
                                  }
                                }
                              }
                              var10++;
                              if (var14 == 0) {
                                continue L6;
                              } else {
                                break L11;
                              }
                            }
                          }
                        }
                        L19: {
                          if (null != var7_ref) {
                            break L19;
                          } else {
                            if (var8 != 1) {
                              break L19;
                            } else {
                              if (1 < ((ee) this).field_kb) {
                                break L9;
                              } else {
                                break L19;
                              }
                            }
                          }
                        }
                        param5[6] = 2;
                        break L10;
                      }
                      if (var14 == 0) {
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                    param5[6] = 1;
                    break L8;
                  }
                  L20: {
                    L21: {
                      L22: {
                        L23: {
                          L24: {
                            if (param1 == null) {
                              break L24;
                            } else {
                              if (~(param0.length + -1) >= ~param1.length) {
                                break L24;
                              } else {
                                param5[25] = 1;
                                var9 = 0;
                                L25: while (true) {
                                  L26: {
                                    if (var9 >= param1.length) {
                                      break L26;
                                    } else {
                                      param1[var9] = param1[var9] / 100;
                                      stackOut_86_0 = param1[var9];
                                      stackOut_86_1 = param5[25];
                                      stackIn_97_0 = stackOut_86_0;
                                      stackIn_97_1 = stackOut_86_1;
                                      stackIn_87_0 = stackOut_86_0;
                                      stackIn_87_1 = stackOut_86_1;
                                      if (var14 != 0) {
                                        L27: while (true) {
                                          if (stackIn_97_0 <= stackIn_97_1) {
                                            break L22;
                                          } else {
                                            stackOut_98_0 = (int[]) param2;
                                            stackIn_199_0 = stackOut_98_0;
                                            stackIn_99_0 = stackOut_98_0;
                                            if (var14 != 0) {
                                              break L21;
                                            } else {
                                              L28: {
                                                if (stackIn_99_0 != null) {
                                                  param2[var9] = param0[var9].field_vb;
                                                  break L28;
                                                } else {
                                                  break L28;
                                                }
                                              }
                                              L29: {
                                                L30: {
                                                  var10 = 0;
                                                  var11 = param0[var9];
                                                  if (var11 != var7_ref) {
                                                    break L30;
                                                  } else {
                                                    if (var14 == 0) {
                                                      break L29;
                                                    } else {
                                                      break L30;
                                                    }
                                                  }
                                                }
                                                L31: {
                                                  if ((1 << var11.field_Bb & ((ee) this).field_hb) == 0) {
                                                    break L31;
                                                  } else {
                                                    param4[var9] = -1;
                                                    if (var14 == 0) {
                                                      break L29;
                                                    } else {
                                                      break L31;
                                                    }
                                                  }
                                                }
                                                var13 = 0;
                                                L32: while (true) {
                                                  L33: {
                                                    if (var13 >= 32) {
                                                      break L33;
                                                    } else {
                                                      stackOut_116_0 = var13;
                                                      stackOut_116_1 = 4;
                                                      stackIn_97_0 = stackOut_116_0;
                                                      stackIn_97_1 = stackOut_116_1;
                                                      stackIn_117_0 = stackOut_116_0;
                                                      stackIn_117_1 = stackOut_116_1;
                                                      if (var14 != 0) {
                                                        continue L27;
                                                      } else {
                                                        L34: {
                                                          L35: {
                                                            if (stackIn_117_0 != stackIn_117_1) {
                                                              break L35;
                                                            } else {
                                                              L36: {
                                                                var12 = var11.b(true, var13);
                                                                if (var12 != 0) {
                                                                  break L36;
                                                                } else {
                                                                  if (var11.field_w <= 0) {
                                                                    break L36;
                                                                  } else {
                                                                    if (var11.field_kb != 0) {
                                                                      break L36;
                                                                    } else {
                                                                      L37: {
                                                                        if (0 != ((ee) this).field_R) {
                                                                          break L37;
                                                                        } else {
                                                                          if (!((ee) this).field_lb) {
                                                                            break L36;
                                                                          } else {
                                                                            break L37;
                                                                          }
                                                                        }
                                                                      }
                                                                      var10 = var10 | 32;
                                                                      if (var14 == 0) {
                                                                        break L34;
                                                                      } else {
                                                                        break L36;
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                              if (((ee) this).field_kb <= 1) {
                                                                break L34;
                                                              } else {
                                                                if (param5[var13] != var12) {
                                                                  break L34;
                                                                } else {
                                                                  var10 = var10 | 16;
                                                                  if (var14 == 0) {
                                                                    break L34;
                                                                  } else {
                                                                    break L35;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                          L38: {
                                                            if (25 == var13) {
                                                              break L38;
                                                            } else {
                                                              if (var13 != 5) {
                                                                var12 = var11.b(true, var13);
                                                                if (~param5[var13] != ~var12) {
                                                                  break L34;
                                                                } else {
                                                                  var10 = var10 | 1 << var13;
                                                                  if (var14 == 0) {
                                                                    break L34;
                                                                  } else {
                                                                    break L38;
                                                                  }
                                                                }
                                                              } else {
                                                                break L34;
                                                              }
                                                            }
                                                          }
                                                          if (0 >= param5[25]) {
                                                            break L34;
                                                          } else {
                                                            if (param1 == null) {
                                                              break L34;
                                                            } else {
                                                              if (param5[var13] == param1[var11.field_jc]) {
                                                                var10 = var10 | 1 << var13;
                                                                break L34;
                                                              } else {
                                                                break L34;
                                                              }
                                                            }
                                                          }
                                                        }
                                                        var13++;
                                                        if (var14 == 0) {
                                                          continue L32;
                                                        } else {
                                                          break L33;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  param4[var9] = var10;
                                                  break L29;
                                                }
                                              }
                                              var9++;
                                              if (var14 == 0) {
                                                stackOut_96_0 = param4.length;
                                                stackOut_96_1 = var9;
                                                stackIn_97_0 = stackOut_96_0;
                                                stackIn_97_1 = stackOut_96_1;
                                                continue L27;
                                              } else {
                                                break L22;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        L39: {
                                          if (stackIn_87_0 <= stackIn_87_1) {
                                            break L39;
                                          } else {
                                            param5[25] = param1[var9];
                                            break L39;
                                          }
                                        }
                                        var9++;
                                        if (var14 == 0) {
                                          continue L25;
                                        } else {
                                          break L26;
                                        }
                                      }
                                    }
                                  }
                                  break L23;
                                }
                              }
                            }
                          }
                          param5[25] = 0;
                          break L23;
                        }
                        var9 = 0;
                        L40: while (true) {
                          stackOut_96_0 = param4.length;
                          stackOut_96_1 = var9;
                          stackIn_97_0 = stackOut_96_0;
                          stackIn_97_1 = stackOut_96_1;
                          L41: while (true) {
                            if (stackIn_97_0 <= stackIn_97_1) {
                              break L22;
                            } else {
                              stackOut_98_0 = (int[]) param2;
                              stackIn_199_0 = stackOut_98_0;
                              stackIn_99_0 = stackOut_98_0;
                              if (var14 != 0) {
                                break L21;
                              } else {
                                L42: {
                                  if (stackIn_99_0 != null) {
                                    param2[var9] = param0[var9].field_vb;
                                    break L42;
                                  } else {
                                    break L42;
                                  }
                                }
                                L43: {
                                  L44: {
                                    var10 = 0;
                                    var11 = param0[var9];
                                    if (var11 != var7_ref) {
                                      break L44;
                                    } else {
                                      if (var14 == 0) {
                                        break L43;
                                      } else {
                                        break L44;
                                      }
                                    }
                                  }
                                  L45: {
                                    if ((1 << var11.field_Bb & ((ee) this).field_hb) == 0) {
                                      break L45;
                                    } else {
                                      param4[var9] = -1;
                                      if (var14 == 0) {
                                        break L43;
                                      } else {
                                        break L45;
                                      }
                                    }
                                  }
                                  var13 = 0;
                                  L46: while (true) {
                                    L47: {
                                      if (var13 >= 32) {
                                        break L47;
                                      } else {
                                        stackOut_116_0 = var13;
                                        stackOut_116_1 = 4;
                                        stackIn_97_0 = stackOut_116_0;
                                        stackIn_97_1 = stackOut_116_1;
                                        stackIn_117_0 = stackOut_116_0;
                                        stackIn_117_1 = stackOut_116_1;
                                        if (var14 != 0) {
                                          continue L41;
                                        } else {
                                          L48: {
                                            L49: {
                                              if (stackIn_117_0 != stackIn_117_1) {
                                                break L49;
                                              } else {
                                                L50: {
                                                  var12 = var11.b(true, var13);
                                                  if (var12 != 0) {
                                                    break L50;
                                                  } else {
                                                    if (var11.field_w <= 0) {
                                                      break L50;
                                                    } else {
                                                      if (var11.field_kb != 0) {
                                                        break L50;
                                                      } else {
                                                        L51: {
                                                          if (0 != ((ee) this).field_R) {
                                                            break L51;
                                                          } else {
                                                            if (!((ee) this).field_lb) {
                                                              break L50;
                                                            } else {
                                                              break L51;
                                                            }
                                                          }
                                                        }
                                                        var10 = var10 | 32;
                                                        if (var14 == 0) {
                                                          break L48;
                                                        } else {
                                                          break L50;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                                if (((ee) this).field_kb <= 1) {
                                                  break L48;
                                                } else {
                                                  if (param5[var13] != var12) {
                                                    break L48;
                                                  } else {
                                                    var10 = var10 | 16;
                                                    if (var14 == 0) {
                                                      break L48;
                                                    } else {
                                                      break L49;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            L52: {
                                              if (25 == var13) {
                                                break L52;
                                              } else {
                                                if (var13 != 5) {
                                                  var12 = var11.b(true, var13);
                                                  if (~param5[var13] != ~var12) {
                                                    break L48;
                                                  } else {
                                                    var10 = var10 | 1 << var13;
                                                    if (var14 == 0) {
                                                      break L48;
                                                    } else {
                                                      break L52;
                                                    }
                                                  }
                                                } else {
                                                  break L48;
                                                }
                                              }
                                            }
                                            if (0 >= param5[25]) {
                                              break L48;
                                            } else {
                                              if (param1 == null) {
                                                break L48;
                                              } else {
                                                if (param5[var13] == param1[var11.field_jc]) {
                                                  var10 = var10 | 1 << var13;
                                                  break L48;
                                                } else {
                                                  break L48;
                                                }
                                              }
                                            }
                                          }
                                          var13++;
                                          if (var14 == 0) {
                                            continue L46;
                                          } else {
                                            break L47;
                                          }
                                        }
                                      }
                                    }
                                    param4[var9] = var10;
                                    break L43;
                                  }
                                }
                                var9++;
                                if (var14 == 0) {
                                  continue L40;
                                } else {
                                  break L22;
                                }
                              }
                            }
                          }
                        }
                      }
                      L53: {
                        if (((ee) this).field_lb) {
                          break L53;
                        } else {
                          var9 = 0;
                          var10 = 0;
                          L54: while (true) {
                            L55: {
                              L56: {
                                if (param4.length <= var10) {
                                  break L56;
                                } else {
                                  stackOut_167_0 = 0;
                                  stackOut_167_1 = ~param4[var10];
                                  stackIn_179_0 = stackOut_167_0;
                                  stackIn_179_1 = stackOut_167_1;
                                  stackIn_168_0 = stackOut_167_0;
                                  stackIn_168_1 = stackOut_167_1;
                                  if (var14 != 0) {
                                    break L55;
                                  } else {
                                    L57: {
                                      if (stackIn_168_0 == stackIn_168_1) {
                                        break L57;
                                      } else {
                                        if (0 != (param4[var10] & 32)) {
                                          var9++;
                                          break L57;
                                        } else {
                                          break L57;
                                        }
                                      }
                                    }
                                    var10++;
                                    if (var14 == 0) {
                                      continue L54;
                                    } else {
                                      break L56;
                                    }
                                  }
                                }
                              }
                              stackOut_178_0 = ~param4.length;
                              stackOut_178_1 = ~var9;
                              stackIn_179_0 = stackOut_178_0;
                              stackIn_179_1 = stackOut_178_1;
                              break L55;
                            }
                            L58: {
                              if (stackIn_179_0 == stackIn_179_1) {
                                break L58;
                              } else {
                                if (2 >= param4.length) {
                                  break L53;
                                } else {
                                  if (param4.length > 2 * var9) {
                                    break L53;
                                  } else {
                                    break L58;
                                  }
                                }
                              }
                            }
                            var10 = 0;
                            L59: while (true) {
                              if (param4.length <= var10) {
                                break L53;
                              } else {
                                if (var14 != 0) {
                                  break L20;
                                } else {
                                  L60: {
                                    if (-1 == param4[var10]) {
                                      break L60;
                                    } else {
                                      if ((param4[var10] & 32) == 0) {
                                        break L60;
                                      } else {
                                        param4[var10] = ec.a(param4[var10], -33);
                                        param4[var10] = vn.a(param4[var10], 16);
                                        break L60;
                                      }
                                    }
                                  }
                                  var10++;
                                  if (var14 == 0) {
                                    continue L59;
                                  } else {
                                    break L53;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      stackOut_198_0 = (int[]) param5;
                      stackIn_199_0 = stackOut_198_0;
                      break L21;
                    }
                    stackIn_199_0[5] = param5[4];
                    break L20;
                  }
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L61: {
            var7 = decompiledCaughtException;
            stackOut_201_0 = (RuntimeException) var7;
            stackOut_201_1 = new StringBuilder().append("ee.BB(");
            stackIn_204_0 = stackOut_201_0;
            stackIn_204_1 = stackOut_201_1;
            stackIn_202_0 = stackOut_201_0;
            stackIn_202_1 = stackOut_201_1;
            if (param0 == null) {
              stackOut_204_0 = (RuntimeException) (Object) stackIn_204_0;
              stackOut_204_1 = (StringBuilder) (Object) stackIn_204_1;
              stackOut_204_2 = "null";
              stackIn_205_0 = stackOut_204_0;
              stackIn_205_1 = stackOut_204_1;
              stackIn_205_2 = stackOut_204_2;
              break L61;
            } else {
              stackOut_202_0 = (RuntimeException) (Object) stackIn_202_0;
              stackOut_202_1 = (StringBuilder) (Object) stackIn_202_1;
              stackOut_202_2 = "{...}";
              stackIn_205_0 = stackOut_202_0;
              stackIn_205_1 = stackOut_202_1;
              stackIn_205_2 = stackOut_202_2;
              break L61;
            }
          }
          L62: {
            stackOut_205_0 = (RuntimeException) (Object) stackIn_205_0;
            stackOut_205_1 = ((StringBuilder) (Object) stackIn_205_1).append(stackIn_205_2).append(',');
            stackIn_208_0 = stackOut_205_0;
            stackIn_208_1 = stackOut_205_1;
            stackIn_206_0 = stackOut_205_0;
            stackIn_206_1 = stackOut_205_1;
            if (param1 == null) {
              stackOut_208_0 = (RuntimeException) (Object) stackIn_208_0;
              stackOut_208_1 = (StringBuilder) (Object) stackIn_208_1;
              stackOut_208_2 = "null";
              stackIn_209_0 = stackOut_208_0;
              stackIn_209_1 = stackOut_208_1;
              stackIn_209_2 = stackOut_208_2;
              break L62;
            } else {
              stackOut_206_0 = (RuntimeException) (Object) stackIn_206_0;
              stackOut_206_1 = (StringBuilder) (Object) stackIn_206_1;
              stackOut_206_2 = "{...}";
              stackIn_209_0 = stackOut_206_0;
              stackIn_209_1 = stackOut_206_1;
              stackIn_209_2 = stackOut_206_2;
              break L62;
            }
          }
          L63: {
            stackOut_209_0 = (RuntimeException) (Object) stackIn_209_0;
            stackOut_209_1 = ((StringBuilder) (Object) stackIn_209_1).append(stackIn_209_2).append(',');
            stackIn_212_0 = stackOut_209_0;
            stackIn_212_1 = stackOut_209_1;
            stackIn_210_0 = stackOut_209_0;
            stackIn_210_1 = stackOut_209_1;
            if (param2 == null) {
              stackOut_212_0 = (RuntimeException) (Object) stackIn_212_0;
              stackOut_212_1 = (StringBuilder) (Object) stackIn_212_1;
              stackOut_212_2 = "null";
              stackIn_213_0 = stackOut_212_0;
              stackIn_213_1 = stackOut_212_1;
              stackIn_213_2 = stackOut_212_2;
              break L63;
            } else {
              stackOut_210_0 = (RuntimeException) (Object) stackIn_210_0;
              stackOut_210_1 = (StringBuilder) (Object) stackIn_210_1;
              stackOut_210_2 = "{...}";
              stackIn_213_0 = stackOut_210_0;
              stackIn_213_1 = stackOut_210_1;
              stackIn_213_2 = stackOut_210_2;
              break L63;
            }
          }
          L64: {
            stackOut_213_0 = (RuntimeException) (Object) stackIn_213_0;
            stackOut_213_1 = ((StringBuilder) (Object) stackIn_213_1).append(stackIn_213_2).append(',').append(param3).append(',');
            stackIn_216_0 = stackOut_213_0;
            stackIn_216_1 = stackOut_213_1;
            stackIn_214_0 = stackOut_213_0;
            stackIn_214_1 = stackOut_213_1;
            if (param4 == null) {
              stackOut_216_0 = (RuntimeException) (Object) stackIn_216_0;
              stackOut_216_1 = (StringBuilder) (Object) stackIn_216_1;
              stackOut_216_2 = "null";
              stackIn_217_0 = stackOut_216_0;
              stackIn_217_1 = stackOut_216_1;
              stackIn_217_2 = stackOut_216_2;
              break L64;
            } else {
              stackOut_214_0 = (RuntimeException) (Object) stackIn_214_0;
              stackOut_214_1 = (StringBuilder) (Object) stackIn_214_1;
              stackOut_214_2 = "{...}";
              stackIn_217_0 = stackOut_214_0;
              stackIn_217_1 = stackOut_214_1;
              stackIn_217_2 = stackOut_214_2;
              break L64;
            }
          }
          L65: {
            stackOut_217_0 = (RuntimeException) (Object) stackIn_217_0;
            stackOut_217_1 = ((StringBuilder) (Object) stackIn_217_1).append(stackIn_217_2).append(',');
            stackIn_220_0 = stackOut_217_0;
            stackIn_220_1 = stackOut_217_1;
            stackIn_218_0 = stackOut_217_0;
            stackIn_218_1 = stackOut_217_1;
            if (param5 == null) {
              stackOut_220_0 = (RuntimeException) (Object) stackIn_220_0;
              stackOut_220_1 = (StringBuilder) (Object) stackIn_220_1;
              stackOut_220_2 = "null";
              stackIn_221_0 = stackOut_220_0;
              stackIn_221_1 = stackOut_220_1;
              stackIn_221_2 = stackOut_220_2;
              break L65;
            } else {
              stackOut_218_0 = (RuntimeException) (Object) stackIn_218_0;
              stackOut_218_1 = (StringBuilder) (Object) stackIn_218_1;
              stackOut_218_2 = "{...}";
              stackIn_221_0 = stackOut_218_0;
              stackIn_221_1 = stackOut_218_1;
              stackIn_221_2 = stackOut_218_2;
              break L65;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_221_0, stackIn_221_2 + ')');
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
              L3: {
                if (0 >= param4.field_t) {
                  break L3;
                } else {
                  L4: {
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
                      break L4;
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
                      break L4;
                    }
                  }
                  var7_ref = new je(stackIn_20_2, stackIn_20_3, 2 + ((ee) this).field_r);
                  var7_ref.field_p = true;
                  param4.field_B.a(3, (ck) (Object) var7_ref);
                  if (var8 == 0) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              L5: {
                if (Math.abs(param1) < 15000) {
                  break L5;
                } else {
                  L6: {
                    if (param4.field_Tb >= 5) {
                      break L6;
                    } else {
                      if (Math.abs(param1) < 30000) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var7_ref = new je(6, param3, 2 + ((ee) this).field_r);
                  var7_ref.field_p = true;
                  param4.field_B.a(3, (ck) (Object) var7_ref);
                  if (var8 == 0) {
                    break L1;
                  } else {
                    break L5;
                  }
                }
              }
              L7: {
                L8: {
                  if (Math.abs(param1) >= 15000) {
                    break L8;
                  } else {
                    if (Math.abs(param5) < 10000) {
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
                if (10000 <= Math.abs(param1)) {
                  break L1;
                } else {
                  var7_ref = new je(6, -param3, 2 + ((ee) this).field_r);
                  var7_ref.field_p = true;
                  param4.field_B.a(3, (ck) (Object) var7_ref);
                  if (var8 == 0) {
                    break L1;
                  } else {
                    break L7;
                  }
                }
              }
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
            }
            L9: {
              if (Math.abs(param1) <= 50000) {
                break L9;
              } else {
                if (this.a(((ee) this).field_z, (byte) -119, 3, param4, param0, 2600, ((ee) this).field_r - -15)) {
                  break L9;
                } else {
                  break L9;
                }
              }
            }
            L10: {
              if (!this.a(((ee) this).field_z, (byte) -72, 2, param4, param0, 2600, 15 + ((ee) this).field_r)) {
                if (param4.field_Tb <= 1) {
                  if (80000 >= Math.abs(param1)) {
                    break L10;
                  } else {
                    if (param4.field_Tb <= 0) {
                      break L10;
                    } else {
                      var7_ref = new je(3, 0, ((ee) this).field_r + 30);
                      var7_ref.field_u = param4.field_hc - -(20000 * param3);
                      var7_ref.field_y = -20000 + param4.field_Gb;
                      var7_ref.field_p = true;
                      param4.field_B.a(3, (ck) (Object) var7_ref);
                      param4.field_Tb = param4.field_x;
                      break L10;
                    }
                  }
                } else {
                  if (this.a(((ee) this).field_z, (byte) -67, 1, param4, param0, 1728, 25 + ((ee) this).field_r)) {
                    break L10;
                  } else {
                    if (!this.a(((ee) this).field_z, (byte) -49, 0, param4, param0, 4608, 25 + ((ee) this).field_r)) {
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                }
              } else {
                break L10;
              }
            }
            L11: {
              if (param2 <= -127) {
                break L11;
              } else {
                ((ee) this).field_O = null;
                break L11;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
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
              break L12;
            } else {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "{...}";
              stackIn_73_0 = stackOut_70_0;
              stackIn_73_1 = stackOut_70_1;
              stackIn_73_2 = stackOut_70_2;
              break L12;
            }
          }
          L13: {
            stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
            stackOut_73_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_73_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
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
              break L13;
            } else {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "{...}";
              stackIn_77_0 = stackOut_74_0;
              stackIn_77_1 = stackOut_74_1;
              stackIn_77_2 = stackOut_74_2;
              break L13;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_77_0, stackIn_77_2 + ',' + param5 + ')');
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
              L2: {
                if (param2.field_t > 0) {
                  break L2;
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
                        if (var8 == 0) {
                          break L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  if (30000 <= Math.abs(param3)) {
                    break L1;
                  } else {
                    var7_ref = new je(6, -param1, 2 + ((ee) this).field_r);
                    var7_ref.field_p = true;
                    param2.field_B.a(3, (ck) (Object) var7_ref);
                    if (var8 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L4: {
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
                  break L4;
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
                  break L4;
                }
              }
              var7_ref = new je(stackIn_19_2, stackIn_19_3, 2 + ((ee) this).field_r);
              var7_ref.field_p = true;
              param2.field_B.a(3, (ck) (Object) var7_ref);
              break L1;
            }
            L5: {
              if (this.a(((ee) this).field_z, (byte) -78, 3, param2, param4, 2600, ((ee) this).field_r - -15)) {
                break L5;
              } else {
                if (!this.a(((ee) this).field_z, (byte) -64, 2, param2, param4, 2600, 15 + ((ee) this).field_r)) {
                  L6: {
                    if (80000 <= Math.abs(param3)) {
                      break L6;
                    } else {
                      if (param2.field_Tb <= 0) {
                        break L6;
                      } else {
                        if (!this.a(((ee) this).field_z, (byte) -29, 1, param2, param4, 4608, ((ee) this).field_r + 25)) {
                          break L6;
                        } else {
                          boolean discarded$1 = this.a(((ee) this).field_z, (byte) -98, 0, param2, param4, 2304, ((ee) this).field_r - -75);
                          if (var8 == 0) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                  }
                  if (this.a(((ee) this).field_z, (byte) -105, 0, param2, param4, 3072, 50 + ((ee) this).field_r)) {
                    break L5;
                  } else {
                    break L5;
                  }
                } else {
                  break L5;
                }
              }
            }
            var7_int = 112 % ((param5 - -66) / 46);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var7 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) var7;
            stackOut_41_1 = new StringBuilder().append("ee.CB(").append(param0).append(',').append(param1).append(',');
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
              break L7;
            } else {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "{...}";
              stackIn_45_0 = stackOut_42_0;
              stackIn_45_1 = stackOut_42_1;
              stackIn_45_2 = stackOut_42_2;
              break L7;
            }
          }
          L8: {
            stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
            stackOut_45_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_45_2).append(',').append(param3).append(',');
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
              break L8;
            } else {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "{...}";
              stackIn_49_0 = stackOut_46_0;
              stackIn_49_1 = stackOut_46_1;
              stackIn_49_2 = stackOut_46_2;
              break L8;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_49_0, stackIn_49_2 + ',' + param5 + ')');
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
        int stackIn_7_0 = 0;
        int stackIn_17_0 = 0;
        boolean stackIn_20_0 = false;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_16_0 = 0;
        boolean stackOut_19_0 = false;
        int stackOut_24_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_2_0 = 0;
        var5 = SteelSentinels.field_G;
        try {
          L0: {
            var2 = new boolean[200];
            if (param0 == -3905) {
              var4_ref_mb = (mb) (Object) ((ee) this).field_K.e(13058);
              L1: while (true) {
                L2: {
                  L3: {
                    if (null == var4_ref_mb) {
                      break L3;
                    } else {
                      var3 = var4_ref_mb.field_Bb - ((ee) this).field_kb;
                      stackOut_6_0 = ~var3;
                      stackIn_17_0 = stackOut_6_0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var5 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (stackIn_7_0 > -1) {
                            break L4;
                          } else {
                            if (~var2.length >= ~var3) {
                              break L4;
                            } else {
                              var2[var3] = true;
                              break L4;
                            }
                          }
                        }
                        var4_ref_mb = (mb) (Object) ((ee) this).field_K.a((byte) -102);
                        if (var5 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_16_0 = 0;
                  stackIn_17_0 = stackOut_16_0;
                  break L2;
                }
                var4 = stackIn_17_0;
                L5: while (true) {
                  L6: {
                    L7: {
                      if (~var4 <= ~var2.length) {
                        break L7;
                      } else {
                        stackOut_19_0 = var2[var4];
                        stackIn_28_0 = stackOut_19_0 ? 1 : 0;
                        stackIn_20_0 = stackOut_19_0;
                        if (var5 != 0) {
                          break L6;
                        } else {
                          if (!stackIn_20_0) {
                            stackOut_24_0 = var4 - -((ee) this).field_kb;
                            stackIn_25_0 = stackOut_24_0;
                            return stackIn_25_0;
                          } else {
                            var4++;
                            if (var5 == 0) {
                              continue L5;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                    }
                    stackOut_27_0 = -1;
                    stackIn_28_0 = stackOut_27_0;
                    break L6;
                  }
                  break L0;
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
          throw ci.a((Throwable) (Object) var2_ref, "ee.NA(" + param0 + ')');
        }
        return stackIn_28_0;
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
              L3: {
                if (param2.field_t <= 0) {
                  break L3;
                } else {
                  L4: {
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
                      break L4;
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
                      break L4;
                    }
                  }
                  var6_ref = new je(stackIn_15_2, stackIn_15_3, ((ee) this).field_r + 2);
                  var6_ref.field_p = true;
                  param2.field_B.a(param3 + -20060, (ck) (Object) var6_ref);
                  if (var7 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              if (Math.abs(param0) > 80000) {
                var6_ref = new je(6, param4, 2 + ((ee) this).field_r);
                var6_ref.field_p = true;
                param2.field_B.a(param3 + -20060, (ck) (Object) var6_ref);
                break L2;
              } else {
                break L2;
              }
            }
            if (param3 == 20063) {
              L5: {
                L6: {
                  var6_ref = new je(0, param2.field_Xb[2], 3 + ((ee) this).field_r);
                  var6_ref.field_B = 13384 * param2.field_E;
                  var6_ref.field_p = true;
                  var6_ref.field_y = param1.field_Gb;
                  var6_ref.field_u = param1.field_hc;
                  param2.field_B.a(param3 + -20060, (ck) (Object) var6_ref);
                  if (param2.field_Tb <= 0) {
                    break L6;
                  } else {
                    if (~param2.field_Gb >= ~param1.field_Gb) {
                      break L6;
                    } else {
                      if (null != param2.field_Vb) {
                        var6_ref = new je(0, param2.field_Xb[1], (param1.field_hc + ((ee) this).field_r + param2.field_hc) % 100 + ((ee) this).field_r + 29);
                        var6_ref.field_u = param1.field_hc;
                        var6_ref.field_B = param4 * 15384;
                        var6_ref.field_y = param1.field_Gb;
                        var6_ref.field_p = true;
                        param2.field_B.a(3, (ck) (Object) var6_ref);
                        if (var7 == 0) {
                          break L5;
                        } else {
                          break L6;
                        }
                      } else {
                        break L5;
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
                  param2.field_B.a(param3 + -20060, (ck) (Object) var6_ref);
                  break L5;
                } else {
                  break L5;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) var6;
            stackOut_41_1 = new StringBuilder().append("ee.AA(").append(param0).append(',');
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
              break L7;
            } else {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "{...}";
              stackIn_45_0 = stackOut_42_0;
              stackIn_45_1 = stackOut_42_1;
              stackIn_45_2 = stackOut_42_2;
              break L7;
            }
          }
          L8: {
            stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
            stackOut_45_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_45_2).append(',');
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
              break L8;
            } else {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "{...}";
              stackIn_49_0 = stackOut_46_0;
              stackIn_49_1 = stackOut_46_1;
              stackIn_49_2 = stackOut_46_2;
              break L8;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_49_0, stackIn_49_2 + ',' + param3 + ',' + param4 + ')');
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
        je stackIn_21_0 = null;
        je stackIn_21_1 = null;
        int stackIn_21_2 = 0;
        je stackIn_22_0 = null;
        je stackIn_22_1 = null;
        int stackIn_22_2 = 0;
        je stackIn_23_0 = null;
        je stackIn_23_1 = null;
        int stackIn_23_2 = 0;
        je stackIn_24_0 = null;
        je stackIn_24_1 = null;
        int stackIn_24_2 = 0;
        int stackIn_24_3 = 0;
        je stackIn_45_0 = null;
        je stackIn_45_1 = null;
        int stackIn_45_2 = 0;
        je stackIn_46_0 = null;
        je stackIn_46_1 = null;
        int stackIn_46_2 = 0;
        je stackIn_47_0 = null;
        je stackIn_47_1 = null;
        int stackIn_47_2 = 0;
        je stackIn_48_0 = null;
        je stackIn_48_1 = null;
        int stackIn_48_2 = 0;
        int stackIn_48_3 = 0;
        je stackIn_59_0 = null;
        je stackIn_59_1 = null;
        int stackIn_59_2 = 0;
        je stackIn_60_0 = null;
        je stackIn_60_1 = null;
        int stackIn_60_2 = 0;
        je stackIn_61_0 = null;
        je stackIn_61_1 = null;
        int stackIn_61_2 = 0;
        je stackIn_62_0 = null;
        je stackIn_62_1 = null;
        int stackIn_62_2 = 0;
        int stackIn_62_3 = 0;
        je stackIn_71_0 = null;
        je stackIn_71_1 = null;
        int stackIn_71_2 = 0;
        je stackIn_72_0 = null;
        je stackIn_72_1 = null;
        int stackIn_72_2 = 0;
        je stackIn_73_0 = null;
        je stackIn_73_1 = null;
        int stackIn_73_2 = 0;
        int stackIn_73_3 = 0;
        je stackIn_92_0 = null;
        je stackIn_92_1 = null;
        int stackIn_92_2 = 0;
        je stackIn_93_0 = null;
        je stackIn_93_1 = null;
        int stackIn_93_2 = 0;
        je stackIn_94_0 = null;
        je stackIn_94_1 = null;
        int stackIn_94_2 = 0;
        int stackIn_94_3 = 0;
        je stackOut_20_0 = null;
        je stackOut_20_1 = null;
        int stackOut_20_2 = 0;
        je stackOut_23_0 = null;
        je stackOut_23_1 = null;
        int stackOut_23_2 = 0;
        int stackOut_23_3 = 0;
        je stackOut_21_0 = null;
        je stackOut_21_1 = null;
        int stackOut_21_2 = 0;
        je stackOut_22_0 = null;
        je stackOut_22_1 = null;
        int stackOut_22_2 = 0;
        int stackOut_22_3 = 0;
        je stackOut_44_0 = null;
        je stackOut_44_1 = null;
        int stackOut_44_2 = 0;
        je stackOut_47_0 = null;
        je stackOut_47_1 = null;
        int stackOut_47_2 = 0;
        int stackOut_47_3 = 0;
        je stackOut_45_0 = null;
        je stackOut_45_1 = null;
        int stackOut_45_2 = 0;
        je stackOut_46_0 = null;
        je stackOut_46_1 = null;
        int stackOut_46_2 = 0;
        int stackOut_46_3 = 0;
        je stackOut_58_0 = null;
        je stackOut_58_1 = null;
        int stackOut_58_2 = 0;
        je stackOut_61_0 = null;
        je stackOut_61_1 = null;
        int stackOut_61_2 = 0;
        int stackOut_61_3 = 0;
        je stackOut_59_0 = null;
        je stackOut_59_1 = null;
        int stackOut_59_2 = 0;
        je stackOut_60_0 = null;
        je stackOut_60_1 = null;
        int stackOut_60_2 = 0;
        int stackOut_60_3 = 0;
        je stackOut_70_0 = null;
        je stackOut_70_1 = null;
        int stackOut_70_2 = 0;
        je stackOut_72_0 = null;
        je stackOut_72_1 = null;
        int stackOut_72_2 = 0;
        int stackOut_72_3 = 0;
        je stackOut_71_0 = null;
        je stackOut_71_1 = null;
        int stackOut_71_2 = 0;
        int stackOut_71_3 = 0;
        je stackOut_91_0 = null;
        je stackOut_91_1 = null;
        int stackOut_91_2 = 0;
        je stackOut_93_0 = null;
        je stackOut_93_1 = null;
        int stackOut_93_2 = 0;
        int stackOut_93_3 = 0;
        je stackOut_92_0 = null;
        je stackOut_92_1 = null;
        int stackOut_92_2 = 0;
        int stackOut_92_3 = 0;
        L0: {
          var13 = SteelSentinels.field_G;
          var7_int = 0;
          if (param2 == 16384) {
            break L0;
          } else {
            ((ee) this).field_d = -12;
            break L0;
          }
        }
        L1: {
          L2: {
            if (param4 >= 0) {
              break L2;
            } else {
              var7_int = (((ee) this).field_ab.a(122) << 4) + -128 - param1.field_hc;
              if (var13 == 0) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          var7_int = -128 + param1.field_hc;
          break L1;
        }
        L3: {
          var8 = null;
          if (0 > param5.field_W) {
            break L3;
          } else {
            L4: {
              var8 = (Object) (Object) ((ee) this).f(param5.field_W, -127);
              if (var8 == null) {
                break L4;
              } else {
                if (((mb) var8).field_Hb) {
                  break L4;
                } else {
                  break L3;
                }
              }
            }
            var8 = null;
            param5.field_W = -1;
            break L3;
          }
        }
        L5: {
          L6: {
            if (var8 != null) {
              break L6;
            } else {
              L7: {
                L8: {
                  if (null == param5.field_Vb) {
                    break L8;
                  } else {
                    if (Math.abs(param0) >= 90000) {
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
                L9: {
                  if (param5.field_Vb != null) {
                    break L9;
                  } else {
                    L10: {
                      L11: {
                        if (param5.field_t <= 0) {
                          break L11;
                        } else {
                          L12: {
                            stackOut_20_0 = null;
                            stackOut_20_1 = null;
                            stackOut_20_2 = 6;
                            stackIn_23_0 = stackOut_20_0;
                            stackIn_23_1 = stackOut_20_1;
                            stackIn_23_2 = stackOut_20_2;
                            stackIn_21_0 = stackOut_20_0;
                            stackIn_21_1 = stackOut_20_1;
                            stackIn_21_2 = stackOut_20_2;
                            if (~(param5.field_hc >> 4) <= ~param5.field_t) {
                              stackOut_23_0 = null;
                              stackOut_23_1 = null;
                              stackOut_23_2 = stackIn_23_2;
                              stackOut_23_3 = -1;
                              stackIn_24_0 = stackOut_23_0;
                              stackIn_24_1 = stackOut_23_1;
                              stackIn_24_2 = stackOut_23_2;
                              stackIn_24_3 = stackOut_23_3;
                              break L12;
                            } else {
                              stackOut_21_0 = null;
                              stackOut_21_1 = null;
                              stackOut_21_2 = stackIn_21_2;
                              stackIn_22_0 = stackOut_21_0;
                              stackIn_22_1 = stackOut_21_1;
                              stackIn_22_2 = stackOut_21_2;
                              stackOut_22_0 = null;
                              stackOut_22_1 = null;
                              stackOut_22_2 = stackIn_22_2;
                              stackOut_22_3 = 1;
                              stackIn_24_0 = stackOut_22_0;
                              stackIn_24_1 = stackOut_22_1;
                              stackIn_24_2 = stackOut_22_2;
                              stackIn_24_3 = stackOut_22_3;
                              break L12;
                            }
                          }
                          var9 = new je(stackIn_24_2, stackIn_24_3, 2 + ((ee) this).field_r);
                          var9.field_p = true;
                          param5.field_B.a(param2 ^ 16387, (ck) (Object) var9);
                          if (var13 == 0) {
                            break L10;
                          } else {
                            break L11;
                          }
                        }
                      }
                      L13: {
                        L14: {
                          if (Math.abs(param0) >= 30000) {
                            break L14;
                          } else {
                            if (var7_int > 50000) {
                              break L13;
                            } else {
                              break L14;
                            }
                          }
                        }
                        L15: {
                          if (Math.abs(param0) > 60000) {
                            break L15;
                          } else {
                            if (param5.field_U != 0) {
                              break L10;
                            } else {
                              break L15;
                            }
                          }
                        }
                        var9 = new je(6, param4, ((ee) this).field_r - -2);
                        var9.field_p = true;
                        param5.field_B.a(3, (ck) (Object) var9);
                        if (var13 == 0) {
                          break L10;
                        } else {
                          break L13;
                        }
                      }
                      var9 = new je(6, -param4, 2 + ((ee) this).field_r);
                      var9.field_p = true;
                      param5.field_B.a(3, (ck) (Object) var9);
                      break L10;
                    }
                    L16: {
                      if (param5.field_Tb < 1) {
                        break L16;
                      } else {
                        var9 = new je(5, param1.field_Bb, 4 + (((ee) this).field_r - -((param5.field_hc + (param1.field_hc + ((ee) this).field_r)) % 500)));
                        var9.field_p = true;
                        param5.field_B.a(3, (ck) (Object) var9);
                        if (var13 == 0) {
                          break L5;
                        } else {
                          break L16;
                        }
                      }
                    }
                    if (Math.abs(param0) < 60000) {
                      var9 = new je(0, param5.field_Xb[0], (param5.field_hc + param1.field_hc + ((ee) this).field_r) % 100 + (4 + ((ee) this).field_r));
                      var9.field_y = param1.field_Gb;
                      var9.field_u = param1.field_hc;
                      var10 = Math.atan2((double)param0, (double)(-param3));
                      var9.field_p = true;
                      var9.field_B = (int)(var10 * 65536.0 / 6.283185307179586);
                      param5.field_B.a(3, (ck) (Object) var9);
                      if (var13 == 0) {
                        break L5;
                      } else {
                        break L9;
                      }
                    } else {
                      break L5;
                    }
                  }
                }
                L17: {
                  var9_int = -param4;
                  if (var7_int >= 90000) {
                    break L17;
                  } else {
                    var9_int = param4;
                    break L17;
                  }
                }
                L18: {
                  L19: {
                    if (0 >= param5.field_t) {
                      break L19;
                    } else {
                      L20: {
                        stackOut_44_0 = null;
                        stackOut_44_1 = null;
                        stackOut_44_2 = 6;
                        stackIn_47_0 = stackOut_44_0;
                        stackIn_47_1 = stackOut_44_1;
                        stackIn_47_2 = stackOut_44_2;
                        stackIn_45_0 = stackOut_44_0;
                        stackIn_45_1 = stackOut_44_1;
                        stackIn_45_2 = stackOut_44_2;
                        if (param5.field_t <= param5.field_hc >> 4) {
                          stackOut_47_0 = null;
                          stackOut_47_1 = null;
                          stackOut_47_2 = stackIn_47_2;
                          stackOut_47_3 = -1;
                          stackIn_48_0 = stackOut_47_0;
                          stackIn_48_1 = stackOut_47_1;
                          stackIn_48_2 = stackOut_47_2;
                          stackIn_48_3 = stackOut_47_3;
                          break L20;
                        } else {
                          stackOut_45_0 = null;
                          stackOut_45_1 = null;
                          stackOut_45_2 = stackIn_45_2;
                          stackIn_46_0 = stackOut_45_0;
                          stackIn_46_1 = stackOut_45_1;
                          stackIn_46_2 = stackOut_45_2;
                          stackOut_46_0 = null;
                          stackOut_46_1 = null;
                          stackOut_46_2 = stackIn_46_2;
                          stackOut_46_3 = 1;
                          stackIn_48_0 = stackOut_46_0;
                          stackIn_48_1 = stackOut_46_1;
                          stackIn_48_2 = stackOut_46_2;
                          stackIn_48_3 = stackOut_46_3;
                          break L20;
                        }
                      }
                      var10_ref_je = new je(stackIn_48_2, stackIn_48_3, 2 + ((ee) this).field_r);
                      var10_ref_je.field_p = true;
                      param5.field_B.a(3, (ck) (Object) var10_ref_je);
                      if (var13 == 0) {
                        break L18;
                      } else {
                        break L19;
                      }
                    }
                  }
                  if (~var9_int != ~param5.field_U) {
                    var10_ref_je = new je(6, var9_int, ((ee) this).field_r - -2);
                    var10_ref_je.field_p = true;
                    param5.field_B.a(3, (ck) (Object) var10_ref_je);
                    break L18;
                  } else {
                    break L18;
                  }
                }
                L21: {
                  if (Math.abs(param0) >= 30000) {
                    break L21;
                  } else {
                    var10_ref_je = new je(0, param5.field_Xb[0], (param5.field_hc + (param1.field_hc + ((ee) this).field_r)) % 100 + 4 + ((ee) this).field_r);
                    var10_ref_je.field_u = param1.field_hc;
                    var10_ref_je.field_y = param1.field_Gb;
                    var11 = Math.atan2((double)param0, (double)(-param3));
                    var10_ref_je.field_p = true;
                    var10_ref_je.field_B = (int)(65536.0 * var11 / 6.283185307179586);
                    param5.field_B.a(3, (ck) (Object) var10_ref_je);
                    break L21;
                  }
                }
                if (var13 == 0) {
                  break L5;
                } else {
                  break L7;
                }
              }
              L22: {
                L23: {
                  if (param5.field_t <= 0) {
                    break L23;
                  } else {
                    L24: {
                      stackOut_58_0 = null;
                      stackOut_58_1 = null;
                      stackOut_58_2 = 6;
                      stackIn_61_0 = stackOut_58_0;
                      stackIn_61_1 = stackOut_58_1;
                      stackIn_61_2 = stackOut_58_2;
                      stackIn_59_0 = stackOut_58_0;
                      stackIn_59_1 = stackOut_58_1;
                      stackIn_59_2 = stackOut_58_2;
                      if (~param5.field_t < ~(param5.field_hc >> 4)) {
                        stackOut_61_0 = null;
                        stackOut_61_1 = null;
                        stackOut_61_2 = stackIn_61_2;
                        stackOut_61_3 = 1;
                        stackIn_62_0 = stackOut_61_0;
                        stackIn_62_1 = stackOut_61_1;
                        stackIn_62_2 = stackOut_61_2;
                        stackIn_62_3 = stackOut_61_3;
                        break L24;
                      } else {
                        stackOut_59_0 = null;
                        stackOut_59_1 = null;
                        stackOut_59_2 = stackIn_59_2;
                        stackIn_60_0 = stackOut_59_0;
                        stackIn_60_1 = stackOut_59_1;
                        stackIn_60_2 = stackOut_59_2;
                        stackOut_60_0 = null;
                        stackOut_60_1 = null;
                        stackOut_60_2 = stackIn_60_2;
                        stackOut_60_3 = -1;
                        stackIn_62_0 = stackOut_60_0;
                        stackIn_62_1 = stackOut_60_1;
                        stackIn_62_2 = stackOut_60_2;
                        stackIn_62_3 = stackOut_60_3;
                        break L24;
                      }
                    }
                    var9 = new je(stackIn_62_2, stackIn_62_3, ((ee) this).field_r - -2);
                    if (var13 == 0) {
                      break L22;
                    } else {
                      break L23;
                    }
                  }
                }
                var9 = new je(6, param4, ((ee) this).field_r + 2);
                break L22;
              }
              var9.field_p = true;
              param5.field_B.a(3, (ck) (Object) var9);
              var9 = new je(0, param5.field_Xb[1], 4 + ((ee) this).field_r - -((((ee) this).field_r + param1.field_hc + param5.field_hc) % 500));
              var9.field_p = true;
              var9.field_u = param4 * 25000 + param5.field_hc;
              var9.field_y = -25000 + param5.field_Gb;
              var9.field_B = param4 * 4096;
              param5.field_B.a(param2 + -16381, (ck) (Object) var9);
              if (var13 == 0) {
                break L5;
              } else {
                break L6;
              }
            }
          }
          L25: {
            if ((Object) (Object) param5 != var8) {
              break L25;
            } else {
              L26: {
                if (param5.field_t > 0) {
                  L27: {
                    stackOut_70_0 = null;
                    stackOut_70_1 = null;
                    stackOut_70_2 = 6;
                    stackIn_72_0 = stackOut_70_0;
                    stackIn_72_1 = stackOut_70_1;
                    stackIn_72_2 = stackOut_70_2;
                    stackIn_71_0 = stackOut_70_0;
                    stackIn_71_1 = stackOut_70_1;
                    stackIn_71_2 = stackOut_70_2;
                    if (~param5.field_t >= ~(param5.field_hc >> 4)) {
                      stackOut_72_0 = null;
                      stackOut_72_1 = null;
                      stackOut_72_2 = stackIn_72_2;
                      stackOut_72_3 = -1;
                      stackIn_73_0 = stackOut_72_0;
                      stackIn_73_1 = stackOut_72_1;
                      stackIn_73_2 = stackOut_72_2;
                      stackIn_73_3 = stackOut_72_3;
                      break L27;
                    } else {
                      stackOut_71_0 = null;
                      stackOut_71_1 = null;
                      stackOut_71_2 = stackIn_71_2;
                      stackOut_71_3 = 1;
                      stackIn_73_0 = stackOut_71_0;
                      stackIn_73_1 = stackOut_71_1;
                      stackIn_73_2 = stackOut_71_2;
                      stackIn_73_3 = stackOut_71_3;
                      break L27;
                    }
                  }
                  var9 = new je(stackIn_73_2, stackIn_73_3, ((ee) this).field_r - -2);
                  var9.field_p = true;
                  param5.field_B.a(param2 ^ 16387, (ck) (Object) var9);
                  break L26;
                } else {
                  break L26;
                }
              }
              L28: {
                L29: {
                  if (null == param5.field_Vb) {
                    break L29;
                  } else {
                    if (Math.abs(param0) < 90000) {
                      break L29;
                    } else {
                      L30: {
                        if (param5.field_t == 0) {
                          var9 = new je(6, param4, ((ee) this).field_r - -2);
                          var9.field_p = true;
                          param5.field_B.a(3, (ck) (Object) var9);
                          break L30;
                        } else {
                          break L30;
                        }
                      }
                      var9 = new je(0, param5.field_Xb[1], (param1.field_hc + ((ee) this).field_r + param5.field_hc) % 500 + (4 + ((ee) this).field_r));
                      var9.field_u = param4 * 25000 + param5.field_hc;
                      var9.field_p = true;
                      var9.field_y = -25000 + param5.field_Gb;
                      var9.field_B = param4 * 4096;
                      param5.field_B.a(3, (ck) (Object) var9);
                      if (var13 == 0) {
                        break L28;
                      } else {
                        break L29;
                      }
                    }
                  }
                }
                if (param5.field_t > 0) {
                  break L28;
                } else {
                  L31: {
                    if (120000 < Math.abs(param0)) {
                      break L31;
                    } else {
                      L32: {
                        if (Math.abs(param0) < 60000) {
                          break L32;
                        } else {
                          if (param5.field_U == 0) {
                            break L32;
                          } else {
                            break L28;
                          }
                        }
                      }
                      L33: {
                        stackOut_91_0 = null;
                        stackOut_91_1 = null;
                        stackOut_91_2 = 6;
                        stackIn_93_0 = stackOut_91_0;
                        stackIn_93_1 = stackOut_91_1;
                        stackIn_93_2 = stackOut_91_2;
                        stackIn_92_0 = stackOut_91_0;
                        stackIn_92_1 = stackOut_91_1;
                        stackIn_92_2 = stackOut_91_2;
                        if (120000 > var7_int) {
                          stackOut_93_0 = null;
                          stackOut_93_1 = null;
                          stackOut_93_2 = stackIn_93_2;
                          stackOut_93_3 = param4;
                          stackIn_94_0 = stackOut_93_0;
                          stackIn_94_1 = stackOut_93_1;
                          stackIn_94_2 = stackOut_93_2;
                          stackIn_94_3 = stackOut_93_3;
                          break L33;
                        } else {
                          stackOut_92_0 = null;
                          stackOut_92_1 = null;
                          stackOut_92_2 = stackIn_92_2;
                          stackOut_92_3 = -param4;
                          stackIn_94_0 = stackOut_92_0;
                          stackIn_94_1 = stackOut_92_1;
                          stackIn_94_2 = stackOut_92_2;
                          stackIn_94_3 = stackOut_92_3;
                          break L33;
                        }
                      }
                      var9 = new je(stackIn_94_2, stackIn_94_3, 2 + ((ee) this).field_r);
                      var9.field_p = true;
                      param5.field_B.a(3, (ck) (Object) var9);
                      if (var13 == 0) {
                        break L28;
                      } else {
                        break L31;
                      }
                    }
                  }
                  var9 = new je(6, param4, ((ee) this).field_r - -2);
                  var9.field_p = true;
                  param5.field_B.a(3, (ck) (Object) var9);
                  break L28;
                }
              }
              if (param5.field_Tb < 1) {
                break L5;
              } else {
                if (null != param5.field_Vb) {
                  break L5;
                } else {
                  var9 = new je(5, param1.field_Bb, ((ee) this).field_r + 4 + (param5.field_hc + (((ee) this).field_r + param1.field_hc)) % 500);
                  var9.field_p = true;
                  param5.field_B.a(3, (ck) (Object) var9);
                  if (var13 == 0) {
                    break L5;
                  } else {
                    break L25;
                  }
                }
              }
            }
          }
          L34: {
            L35: {
              if (param5.field_hc < param5.field_C + ((mb) var8).field_hc + -1000) {
                break L35;
              } else {
                L36: {
                  if (~param5.field_hc < ~(param5.field_C + ((mb) var8).field_hc + 1000)) {
                    break L36;
                  } else {
                    if (~((mb) var8).field_U != ~param5.field_U) {
                      var9 = new je(6, ((mb) var8).field_U, 2 + ((ee) this).field_r);
                      var9.field_p = true;
                      param5.field_B.a(param2 + -16381, (ck) (Object) var9);
                      if (var13 == 0) {
                        break L34;
                      } else {
                        break L36;
                      }
                    } else {
                      break L34;
                    }
                  }
                }
                var9 = new je(6, -1, 2 + ((ee) this).field_r);
                var9.field_p = true;
                param5.field_B.a(3, (ck) (Object) var9);
                if (var13 == 0) {
                  break L34;
                } else {
                  break L35;
                }
              }
            }
            var9 = new je(6, 1, ((ee) this).field_r - -2);
            var9.field_p = true;
            param5.field_B.a(3, (ck) (Object) var9);
            break L34;
          }
          L37: {
            param5.field_Vb = ((mb) var8).field_Vb;
            param5.field_ec = ((mb) var8).field_ec;
            if (param5.field_Vb == null) {
              break L37;
            } else {
              if (Math.abs(param0) < 90000) {
                break L37;
              } else {
                var9 = new je(0, param5.field_Xb[1], 4 + (((ee) this).field_r + (param5.field_hc + ((ee) this).field_r - -param1.field_hc) % 500));
                var9.field_y = -25000 + param5.field_Gb;
                var9.field_u = param5.field_hc - -(param4 * 25000);
                var9.field_B = 4096 * param4;
                var9.field_p = true;
                param5.field_B.a(3, (ck) (Object) var9);
                break L37;
              }
            }
          }
          if (10000 <= Math.abs(param0)) {
            break L5;
          } else {
            var9 = new je(0, param5.field_Xb[0], (param1.field_hc + (((ee) this).field_r + param5.field_hc)) % 100 + (4 + ((ee) this).field_r));
            var9.field_y = param1.field_Gb;
            var9.field_u = param1.field_hc;
            var10 = Math.atan2((double)param0, (double)(-param3));
            var9.field_B = (int)(var10 * 65536.0 / 6.283185307179586);
            var9.field_p = true;
            param5.field_B.a(3, (ck) (Object) var9);
            break L5;
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
          throw ci.a((Throwable) (Object) var2, "ee.FA(" + param0 + ',' + param1 + ')');
        }
    }

    final static boolean b(int param0) {
        RuntimeException var1 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        try {
          L0: {
            L1: {
              if (param0 > 74) {
                break L1;
              } else {
                field_x = null;
                break L1;
              }
            }
            stackOut_3_0 = na.a(wl.d((byte) -21), 0);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var1, "ee.KA(" + param0 + ')');
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
                L2: {
                  var7_double = Math.atan2((double)param2, (double)(-param5));
                  var9_int = (int)(65536.0 * var7_double / 6.283185307179586);
                  if (0 <= param0) {
                    break L2;
                  } else {
                    if (var9_int > 16384) {
                      var9_int = var9_int - 65536;
                      if (var20 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                if (var9_int >= -16384) {
                  break L1;
                } else {
                  var9_int = var9_int + 65536;
                  break L1;
                }
              }
              stackOut_15_0 = new int[]{var9_int, var9_int};
              stackIn_16_0 = stackOut_15_0;
              return stackIn_16_0;
            } else {
              L3: {
                var7_double = 0.0;
                var9 = 0.0;
                var11 = (double)param2 * ((double)param2 * ((double)(param3 << 3) * 0.5)) / (double)(param4 * param4) - (double)param5;
                var13 = (double)param2;
                if (param1 <= -72) {
                  break L3;
                } else {
                  mb discarded$1 = ((ee) this).f(-42, -3);
                  break L3;
                }
              }
              L4: {
                var15 = (double)param2 * ((double)param2 * ((double)(param3 << 3) * 0.5)) / (double)(param4 * param4);
                if (var13 * var13 - var15 * (4.0 * var11) <= 0.0) {
                  break L4;
                } else {
                  L5: {
                    if (0.0 != var11) {
                      break L5;
                    } else {
                      if (param4 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var7_double = Math.atan2(Math.sqrt(-(4.0 * var11 * var15) + var13 * var13) + -var13, 2.0 * var11);
                  var9 = Math.atan2(-Math.sqrt(var13 * var13 - var15 * (var11 * 4.0)) + -var13, 2.0 * var11);
                  break L4;
                }
              }
              L6: {
                var17 = 0;
                var18 = 0;
                var17 = (int)(var7_double * 65536.0 / 6.283185307179586);
                if (var17 == 0) {
                  break L6;
                } else {
                  var17 = var17 + (16 * (((ee) this).field_r & 31) - 256);
                  break L6;
                }
              }
              L7: {
                var18 = (int)(var9 * 65536.0 / 6.283185307179586);
                if (var17 >= -32768) {
                  break L7;
                } else {
                  var17 = var17 + 65536;
                  break L7;
                }
              }
              L8: {
                if (var18 == 0) {
                  break L8;
                } else {
                  var18 = var18 + (-256 + (31 & ((ee) this).field_r) * 16);
                  break L8;
                }
              }
              L9: {
                if (var18 >= -32768) {
                  break L9;
                } else {
                  var18 = var18 + 65536;
                  break L9;
                }
              }
              L10: {
                if (32768 < var17) {
                  var17 = var17 - 65536;
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                if (var18 <= 32768) {
                  break L11;
                } else {
                  var18 = var18 - 65536;
                  break L11;
                }
              }
              L12: {
                L13: {
                  if (0 > param0) {
                    break L13;
                  } else {
                    L14: {
                      if (var18 >= 0) {
                        break L14;
                      } else {
                        var18 = -var18;
                        break L14;
                      }
                    }
                    if (var17 < 0) {
                      var17 = -var17;
                      if (var20 == 0) {
                        break L12;
                      } else {
                        break L13;
                      }
                    } else {
                      break L12;
                    }
                  }
                }
                L15: {
                  if (0 >= var18) {
                    break L15;
                  } else {
                    var18 = -var18;
                    break L15;
                  }
                }
                if (0 >= var17) {
                  break L12;
                } else {
                  var17 = -var17;
                  break L12;
                }
              }
              L16: {
                if (var17 * param0 <= var18 * param0) {
                  break L16;
                } else {
                  var19 = var18;
                  var18 = var17;
                  var17 = var19;
                  break L16;
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
          throw ci.a((Throwable) (Object) var7, "ee.R(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_60_0;
    }

    private final void a(int param0, mb param1, int param2, mb param3, int param4, int param5) {
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
                L4: {
                  if (Math.abs(param2) > 50000) {
                    break L4;
                  } else {
                    var7_ref = new je(3, 0, 5 + ((param1.field_hc + (((ee) this).field_r - -param3.field_hc)) % 100 + ((ee) this).field_r + 4));
                    var7_ref.field_y = -20000 + param1.field_Gb;
                    var7_ref.field_u = -(param4 * 20000) + param1.field_hc;
                    var7_ref.field_p = true;
                    param1.field_B.a(param5 ^ 14435, (ck) (Object) var7_ref);
                    if (var10 == 0) {
                      break L2;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  var7_ref = new je(3, 0, 4 + (((ee) this).field_r + ((param3.field_hc + ((ee) this).field_r + param1.field_hc) % 100 + 50)));
                  var7_ref.field_u = param3.field_hc;
                  if (var7_ref.field_u > param1.field_hc + 10000) {
                    var7_ref.field_u = param1.field_hc + 10000;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  var7_ref.field_p = true;
                  var7_ref.field_y = -20000 + param1.field_Gb;
                  if (~(param1.field_hc - 10000) < ~var7_ref.field_u) {
                    var7_ref.field_u = param1.field_hc + -10000;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                param1.field_B.a(3, (ck) (Object) var7_ref);
                break L2;
              }
            }
            L7: {
              if (param5 == 14432) {
                break L7;
              } else {
                ((ee) this).field_db = null;
                break L7;
              }
            }
            L8: {
              L9: {
                L10: {
                  L11: {
                    if (Math.abs(param2) > 50000) {
                      break L11;
                    } else {
                      if (Math.abs(param0) <= 30000) {
                        break L10;
                      } else {
                        break L11;
                      }
                    }
                  }
                  if (param1.field_Tb >= 1) {
                    break L9;
                  } else {
                    break L10;
                  }
                }
                if (param1.i(30, -27)) {
                  break L8;
                } else {
                  L12: {
                    L13: {
                      var7_ref = new je(0, 0, 4 + (((ee) this).field_r + (param3.field_hc + ((ee) this).field_r - -param1.field_hc) % 100 + 60));
                      var7_ref.field_y = param3.field_Gb;
                      var7_ref.field_u = param3.field_hc;
                      var8 = Math.atan2((double)param2, (double)(-param0));
                      var7_ref.field_B = (int)(var8 * 65536.0 / 6.283185307179586);
                      if (0 <= param4) {
                        break L13;
                      } else {
                        if (var7_ref.field_B <= 16384) {
                          break L12;
                        } else {
                          var7_ref.field_B = var7_ref.field_B - 65536;
                          if (var10 == 0) {
                            break L12;
                          } else {
                            break L13;
                          }
                        }
                      }
                    }
                    if (var7_ref.field_B < -16384) {
                      var7_ref.field_B = var7_ref.field_B + 65536;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  var7_ref.field_p = true;
                  param1.field_B.a(3, (ck) (Object) var7_ref);
                  if (var10 == 0) {
                    break L8;
                  } else {
                    break L9;
                  }
                }
              }
              L14: {
                L15: {
                  var7_ref = new je(0, 8, 60 + (param3.field_hc + ((ee) this).field_r + param1.field_hc) % 100 + ((ee) this).field_r + 4);
                  var7_ref.field_y = param3.field_Gb;
                  var7_ref.field_u = param3.field_hc;
                  var8 = Math.atan2((double)param2, (double)(-param0));
                  var7_ref.field_B = (int)(var8 * 65536.0 / 6.283185307179586);
                  if (param4 >= 0) {
                    break L15;
                  } else {
                    if (16384 < var7_ref.field_B) {
                      var7_ref.field_B = var7_ref.field_B - 65536;
                      if (var10 == 0) {
                        break L14;
                      } else {
                        break L15;
                      }
                    } else {
                      break L14;
                    }
                  }
                }
                if (-16384 > var7_ref.field_B) {
                  var7_ref.field_B = var7_ref.field_B + 65536;
                  break L14;
                } else {
                  break L14;
                }
              }
              var7_ref.field_p = true;
              param1.field_B.a(param5 + -14429, (ck) (Object) var7_ref);
              var7_ref = new je(3, 0, 5 + (4 + ((ee) this).field_r) + (param1.field_hc + (param3.field_hc + ((ee) this).field_r)) % 100);
              var7_ref.field_y = param1.field_Gb - 20000;
              var7_ref.field_u = 5000 * param4 + param1.field_hc;
              var7_ref.field_p = true;
              param1.field_Ec.a(3, (ck) (Object) var7_ref);
              break L8;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var7 = decompiledCaughtException;
            stackOut_70_0 = (RuntimeException) var7;
            stackOut_70_1 = new StringBuilder().append("ee.UA(").append(param0).append(',');
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
              break L16;
            } else {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "{...}";
              stackIn_74_0 = stackOut_71_0;
              stackIn_74_1 = stackOut_71_1;
              stackIn_74_2 = stackOut_71_2;
              break L16;
            }
          }
          L17: {
            stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
            stackOut_74_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_74_2).append(',').append(param2).append(',');
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
              break L17;
            } else {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "{...}";
              stackIn_78_0 = stackOut_75_0;
              stackIn_78_1 = stackOut_75_1;
              stackIn_78_2 = stackOut_75_2;
              break L17;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_78_0, stackIn_78_2 + ',' + param4 + ',' + param5 + ')');
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
              if (param0) {
                break L1;
              } else {
                this.a((int[]) null, (byte) 42);
                break L1;
              }
            }
            L2: {
              if (((ee) this).field_ab.b((byte) 125, param1) == ((ee) this).field_ab.a((byte) -100, param1)) {
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
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var3, "ee.VA(" + param0 + ',' + param1 + ')');
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
        int stackIn_49_0 = 0;
        int stackIn_85_0 = 0;
        int stackIn_89_0 = 0;
        boolean stackIn_109_0 = false;
        int stackIn_125_0 = 0;
        int stackIn_132_0 = 0;
        int stackIn_161_0 = 0;
        int stackIn_163_0 = 0;
        RuntimeException stackIn_165_0 = null;
        StringBuilder stackIn_165_1 = null;
        RuntimeException stackIn_167_0 = null;
        StringBuilder stackIn_167_1 = null;
        RuntimeException stackIn_168_0 = null;
        StringBuilder stackIn_168_1 = null;
        String stackIn_168_2 = null;
        RuntimeException stackIn_169_0 = null;
        StringBuilder stackIn_169_1 = null;
        RuntimeException stackIn_171_0 = null;
        StringBuilder stackIn_171_1 = null;
        RuntimeException stackIn_172_0 = null;
        StringBuilder stackIn_172_1 = null;
        String stackIn_172_2 = null;
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
        int stackOut_48_0 = 0;
        int stackOut_84_0 = 0;
        int stackOut_88_0 = 0;
        int stackOut_86_0 = 0;
        boolean stackOut_108_0 = false;
        int stackOut_124_0 = 0;
        int stackOut_131_0 = 0;
        int stackOut_160_0 = 0;
        int stackOut_162_0 = 0;
        RuntimeException stackOut_164_0 = null;
        StringBuilder stackOut_164_1 = null;
        RuntimeException stackOut_167_0 = null;
        StringBuilder stackOut_167_1 = null;
        String stackOut_167_2 = null;
        RuntimeException stackOut_165_0 = null;
        StringBuilder stackOut_165_1 = null;
        String stackOut_165_2 = null;
        RuntimeException stackOut_168_0 = null;
        StringBuilder stackOut_168_1 = null;
        RuntimeException stackOut_171_0 = null;
        StringBuilder stackOut_171_1 = null;
        String stackOut_171_2 = null;
        RuntimeException stackOut_169_0 = null;
        StringBuilder stackOut_169_1 = null;
        String stackOut_169_2 = null;
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
              L12: {
                L13: {
                  if (~var14 >= ~var17) {
                    break L13;
                  } else {
                    var15 = param3.field_gb[var17];
                    stackOut_48_0 = ~ja.a(var15.field_N, false);
                    stackIn_85_0 = stackOut_48_0;
                    stackIn_49_0 = stackOut_48_0;
                    if (var30 != 0) {
                      break L12;
                    } else {
                      L14: {
                        if (stackIn_49_0 != ~var8_ref.field_A) {
                          break L14;
                        } else {
                          if (var15.field_C <= 0) {
                            L15: {
                              if (~Math.abs(var11[0]) > ~var15.field_K) {
                                break L15;
                              } else {
                                if (Math.abs(var11[0]) > var15.field_W) {
                                  break L15;
                                } else {
                                  L16: {
                                    if (var16 != 0) {
                                      break L16;
                                    } else {
                                      if (!bi.b(105, var15.field_N)) {
                                        break L16;
                                      } else {
                                        break L15;
                                      }
                                    }
                                  }
                                  var12[0] = mc.a(var12[0], 1L << var17);
                                  break L15;
                                }
                              }
                            }
                            L17: {
                              if (~Math.abs(var11[1]) > ~var15.field_K) {
                                break L17;
                              } else {
                                if (~Math.abs(var11[1]) < ~var15.field_W) {
                                  break L17;
                                } else {
                                  L18: {
                                    if (var16 != 0) {
                                      break L18;
                                    } else {
                                      if (bi.b(-75, var15.field_N)) {
                                        break L17;
                                      } else {
                                        break L18;
                                      }
                                    }
                                  }
                                  var12[1] = mc.a(var12[1], 1L << var17);
                                  break L17;
                                }
                              }
                            }
                            var13 = var15.field_N;
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                      }
                      var17++;
                      if (var30 == 0) {
                        continue L11;
                      } else {
                        break L13;
                      }
                    }
                  }
                }
                stackOut_84_0 = var10;
                stackIn_85_0 = stackOut_84_0;
                break L12;
              }
              L19: {
                if (stackIn_85_0 != 0) {
                  stackOut_88_0 = 1;
                  stackIn_89_0 = stackOut_88_0;
                  break L19;
                } else {
                  stackOut_86_0 = 0;
                  stackIn_89_0 = stackOut_86_0;
                  break L19;
                }
              }
              L20: {
                var17 = stackIn_89_0;
                var18 = var12[var17];
                if (param1 < -16) {
                  break L20;
                } else {
                  ((ee) this).field_J = null;
                  break L20;
                }
              }
              L21: {
                L22: {
                  var8_ref.field_B = var11[var17];
                  if (var18 == 0L) {
                    break L22;
                  } else {
                    if (var8_ref.field_B == 0) {
                      break L22;
                    } else {
                      break L21;
                    }
                  }
                }
                var17 = -var17 + 1;
                var8_ref.field_B = var11[var17];
                var18 = var12[var17];
                break L21;
              }
              L23: {
                if (var18 == 0L) {
                  break L23;
                } else {
                  if (var8_ref.field_B != 0) {
                    L24: {
                      var20 = new bh(param3);
                      var20.field_b = var9;
                      var21 = param3.field_hc;
                      var22 = -(param3.field_Db << 3) + param3.field_Gb;
                      var23 = var20.a(var13, (byte) 121, var8_ref.field_u, var8_ref.field_B, var22, var21, var8_ref.field_y);
                      var23.field_I = true;
                      if (null == var23) {
                        break L24;
                      } else {
                        var24 = 0;
                        var25 = 0;
                        var28 = 0;
                        var29 = 0;
                        L25: while (true) {
                          L26: {
                            L27: {
                              if (var29 >= 50) {
                                break L27;
                              } else {
                                stackOut_108_0 = var23.field_T;
                                stackIn_125_0 = stackOut_108_0 ? 1 : 0;
                                stackIn_109_0 = stackOut_108_0;
                                if (var30 != 0) {
                                  break L26;
                                } else {
                                  if (stackIn_109_0) {
                                    break L27;
                                  } else {
                                    L28: {
                                      var23.i(-1);
                                      var26 = Math.abs(var23.field_U - param4.field_hc) >> 4;
                                      var27 = Math.abs(var23.field_A - param4.field_Gb) >> 4;
                                      var24 = var27 * var27 + var26 * var26;
                                      var26 = Math.abs(-var20.field_g + var23.field_U) >> 4;
                                      if (var24 < 0) {
                                        var24 = 2147483647;
                                        break L28;
                                      } else {
                                        break L28;
                                      }
                                    }
                                    L29: {
                                      L30: {
                                        var27 = Math.abs(-var20.field_q + var23.field_A) >> 4;
                                        var25 = var26 * var26 + var27 * var27;
                                        if (var25 < 0) {
                                          break L30;
                                        } else {
                                          if (var24 >= var25) {
                                            break L29;
                                          } else {
                                            break L30;
                                          }
                                        }
                                      }
                                      var28 = 1;
                                      if (var30 == 0) {
                                        break L27;
                                      } else {
                                        break L29;
                                      }
                                    }
                                    var29++;
                                    if (var30 == 0) {
                                      continue L25;
                                    } else {
                                      break L27;
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_124_0 = var28;
                            stackIn_125_0 = stackOut_124_0;
                            break L26;
                          }
                          if (stackIn_125_0 != 0) {
                            break L24;
                          } else {
                            if (var29 < 50) {
                              stackOut_131_0 = 0;
                              stackIn_132_0 = stackOut_131_0;
                              return stackIn_132_0 != 0;
                            } else {
                              break L24;
                            }
                          }
                        }
                      }
                    }
                    if (var18 > 0L) {
                      L31: {
                        if (param3.field_Xb[param2] == 13) {
                          break L31;
                        } else {
                          if (11 == param3.field_Xb[param2]) {
                            break L31;
                          } else {
                            if (param3.field_Xb[param2] == 12) {
                              break L31;
                            } else {
                              if (param3.field_Xb[param2] == 15) {
                                break L31;
                              } else {
                                if (param3.field_Xb[param2] == 17) {
                                  break L31;
                                } else {
                                  if (18 == param3.field_Xb[param2]) {
                                    break L31;
                                  } else {
                                    if (14 == param3.field_Xb[param2]) {
                                      break L31;
                                    } else {
                                      if (param3.field_Xb[param2] == 16) {
                                        break L31;
                                      } else {
                                        param3.field_Mb[param2] = param3.field_Mb[param2] + (-var8_ref.field_x + var8_ref.field_r);
                                        break L31;
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
                      stackOut_160_0 = 1;
                      stackIn_161_0 = stackOut_160_0;
                      return stackIn_161_0 != 0;
                    } else {
                      break L23;
                    }
                  } else {
                    break L23;
                  }
                }
              }
              stackOut_162_0 = 0;
              stackIn_163_0 = stackOut_162_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L32: {
            var8 = decompiledCaughtException;
            stackOut_164_0 = (RuntimeException) var8;
            stackOut_164_1 = new StringBuilder().append("ee.W(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_167_0 = stackOut_164_0;
            stackIn_167_1 = stackOut_164_1;
            stackIn_165_0 = stackOut_164_0;
            stackIn_165_1 = stackOut_164_1;
            if (param3 == null) {
              stackOut_167_0 = (RuntimeException) (Object) stackIn_167_0;
              stackOut_167_1 = (StringBuilder) (Object) stackIn_167_1;
              stackOut_167_2 = "null";
              stackIn_168_0 = stackOut_167_0;
              stackIn_168_1 = stackOut_167_1;
              stackIn_168_2 = stackOut_167_2;
              break L32;
            } else {
              stackOut_165_0 = (RuntimeException) (Object) stackIn_165_0;
              stackOut_165_1 = (StringBuilder) (Object) stackIn_165_1;
              stackOut_165_2 = "{...}";
              stackIn_168_0 = stackOut_165_0;
              stackIn_168_1 = stackOut_165_1;
              stackIn_168_2 = stackOut_165_2;
              break L32;
            }
          }
          L33: {
            stackOut_168_0 = (RuntimeException) (Object) stackIn_168_0;
            stackOut_168_1 = ((StringBuilder) (Object) stackIn_168_1).append(stackIn_168_2).append(',');
            stackIn_171_0 = stackOut_168_0;
            stackIn_171_1 = stackOut_168_1;
            stackIn_169_0 = stackOut_168_0;
            stackIn_169_1 = stackOut_168_1;
            if (param4 == null) {
              stackOut_171_0 = (RuntimeException) (Object) stackIn_171_0;
              stackOut_171_1 = (StringBuilder) (Object) stackIn_171_1;
              stackOut_171_2 = "null";
              stackIn_172_0 = stackOut_171_0;
              stackIn_172_1 = stackOut_171_1;
              stackIn_172_2 = stackOut_171_2;
              break L33;
            } else {
              stackOut_169_0 = (RuntimeException) (Object) stackIn_169_0;
              stackOut_169_1 = (StringBuilder) (Object) stackIn_169_1;
              stackOut_169_2 = "{...}";
              stackIn_172_0 = stackOut_169_0;
              stackIn_172_1 = stackOut_169_1;
              stackIn_172_2 = stackOut_169_2;
              break L33;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_172_0, stackIn_172_2 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_163_0 != 0;
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
                    this.i(-22017);
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
          throw ci.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ')');
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
          throw ci.a((Throwable) (Object) var3, "ee.B(" + param0 + ',' + param1 + ')');
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
        int stackOut_33_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
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
            if (param0 < -103) {
              L1: {
                L2: {
                  if (param4.field_t > 0) {
                    break L2;
                  } else {
                    L3: {
                      L4: {
                        if (40000 > Math.abs(param3)) {
                          break L4;
                        } else {
                          if (Math.abs(param3) >= 50000) {
                            break L4;
                          } else {
                            if (param4.field_Tb > 0) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      L5: {
                        if (Math.abs(param3) < 10000) {
                          break L5;
                        } else {
                          L6: {
                            if (!param2.field_Lb) {
                              break L6;
                            } else {
                              if (Math.abs(param3) >= 40000) {
                                break L6;
                              } else {
                                break L5;
                              }
                            }
                          }
                          var7_ref = new je(6, param5, 2 + ((ee) this).field_r);
                          var7_ref.field_p = true;
                          param4.field_B.a(3, (ck) (Object) var7_ref);
                          if (var8 == 0) {
                            break L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                      if (10000 <= Math.abs(param3)) {
                        break L1;
                      } else {
                        if (param2.field_Lb) {
                          break L1;
                        } else {
                          L7: {
                            if (param2.field_u) {
                              stackOut_33_0 = 0;
                              stackIn_34_0 = stackOut_33_0;
                              break L7;
                            } else {
                              stackOut_31_0 = 1;
                              stackIn_34_0 = stackOut_31_0;
                              break L7;
                            }
                          }
                          L8: {
                            stackOut_34_0 = stackIn_34_0;
                            stackIn_37_0 = stackOut_34_0;
                            stackIn_35_0 = stackOut_34_0;
                            if (param4.field_u) {
                              stackOut_37_0 = stackIn_37_0;
                              stackOut_37_1 = 0;
                              stackIn_38_0 = stackOut_37_0;
                              stackIn_38_1 = stackOut_37_1;
                              break L8;
                            } else {
                              stackOut_35_0 = stackIn_35_0;
                              stackOut_35_1 = 1;
                              stackIn_38_0 = stackOut_35_0;
                              stackIn_38_1 = stackOut_35_1;
                              break L8;
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
                    var7_ref = new je(3, 0, ((ee) this).field_r - -15);
                    var7_ref.field_p = true;
                    var7_ref.field_y = param4.field_Gb + -20000;
                    var7_ref.field_u = -(20000 * param5) + param4.field_hc;
                    param4.field_B.a(3, (ck) (Object) var7_ref);
                    if (var8 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L9: {
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
                    break L9;
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
                    break L9;
                  }
                }
                var7_ref = new je(stackIn_49_2, stackIn_49_3, 2 + ((ee) this).field_r);
                var7_ref.field_p = true;
                param4.field_B.a(3, (ck) (Object) var7_ref);
                break L1;
              }
              L10: {
                if (this.a(((ee) this).field_z, (byte) -73, 3, param4, param2, 2600, ((ee) this).field_r + 15)) {
                  break L10;
                } else {
                  L11: {
                    if (param4.field_Tb <= 0) {
                      break L11;
                    } else {
                      if (param2.field_S > 50) {
                        if (this.a(((ee) this).field_z * 4, (byte) -63, 2, param4, param2, 8448, 25 + ((ee) this).field_r)) {
                          break L10;
                        } else {
                          if (!this.a(((ee) this).field_z, (byte) -114, 1, param4, param2, 3072, 50 + ((ee) this).field_r)) {
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                      } else {
                        break L11;
                      }
                    }
                  }
                  if (this.a(((ee) this).field_z, (byte) -57, 1, param4, param2, 3072, 50 + ((ee) this).field_r)) {
                    break L10;
                  } else {
                    if (param4.field_Tb > 0) {
                      if (!this.a(((ee) this).field_z, (byte) -24, 2, param4, param2, 8448, 25 + ((ee) this).field_r)) {
                        break L10;
                      } else {
                        break L10;
                      }
                    } else {
                      break L10;
                    }
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
          L12: {
            var7 = decompiledCaughtException;
            stackOut_73_0 = (RuntimeException) var7;
            stackOut_73_1 = new StringBuilder().append("ee.G(").append(param0).append(',').append(param1).append(',');
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
              break L12;
            } else {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "{...}";
              stackIn_77_0 = stackOut_74_0;
              stackIn_77_1 = stackOut_74_1;
              stackIn_77_2 = stackOut_74_2;
              break L12;
            }
          }
          L13: {
            stackOut_77_0 = (RuntimeException) (Object) stackIn_77_0;
            stackOut_77_1 = ((StringBuilder) (Object) stackIn_77_1).append(stackIn_77_2).append(',').append(param3).append(',');
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
              break L13;
            } else {
              stackOut_78_0 = (RuntimeException) (Object) stackIn_78_0;
              stackOut_78_1 = (StringBuilder) (Object) stackIn_78_1;
              stackOut_78_2 = "{...}";
              stackIn_81_0 = stackOut_78_0;
              stackIn_81_1 = stackOut_78_1;
              stackIn_81_2 = stackOut_78_2;
              break L13;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_81_0, stackIn_81_2 + ',' + param5 + ')');
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
        mb stackOut_9_0 = null;
        Object stackOut_12_0 = null;
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
              L3: {
                if (var4 == null) {
                  break L3;
                } else {
                  if (~var4.field_Bb == ~param0) {
                    stackOut_9_0 = (mb) var4;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  } else {
                    var4 = (mb) (Object) var3.d(2);
                    if (var5 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              stackOut_12_0 = null;
              stackIn_13_0 = stackOut_12_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var3_ref, "ee.HA(" + param0 + ',' + param1 + ')');
        }
        return (mb) (Object) stackIn_13_0;
    }

    final static String a(String param0, String param1, String param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        String stackIn_3_0 = null;
        String stackIn_5_0 = null;
        String stackOut_2_0 = null;
        String stackOut_4_0 = null;
        var6 = SteelSentinels.field_G;
        var4_int = -125 % ((param3 - 51) / 32);
        var5 = param1.indexOf(param0);
        L0: while (true) {
          L1: {
            L2: {
              if (var5 == -1) {
                break L2;
              } else {
                param1 = param1.substring(0, var5) + param2 + param1.substring(param0.length() + var5);
                stackOut_2_0 = (String) param1;
                stackIn_5_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var6 != 0) {
                  break L1;
                } else {
                  var5 = ((String) (Object) stackIn_3_0).indexOf(param0, var5 + param2.length());
                  if (var6 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            stackOut_4_0 = (String) param1;
            stackIn_5_0 = stackOut_4_0;
            break L1;
          }
          return stackIn_5_0;
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
              if (param4 == 0) {
                break L1;
              } else {
                this.i(-54);
                break L1;
              }
            }
            L2: {
              L3: {
                if (param0.field_t <= 0) {
                  break L3;
                } else {
                  L4: {
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
                      break L4;
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
                      break L4;
                    }
                  }
                  var7_ref = new je(stackIn_11_2, stackIn_11_3, ((ee) this).field_r - -2);
                  var7_ref.field_p = true;
                  param0.field_B.a(3, (ck) (Object) var7_ref);
                  if (var12 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L5: {
                if (Math.abs(param5) <= 80000) {
                  break L5;
                } else {
                  var7_ref = new je(6, param1, 2 + ((ee) this).field_r);
                  var7_ref.field_p = true;
                  param0.field_B.a(3, (ck) (Object) var7_ref);
                  if (var12 == 0) {
                    break L2;
                  } else {
                    break L5;
                  }
                }
              }
              if (Math.abs(param5) < 30000) {
                var7_ref = new je(6, -param1, 2 + ((ee) this).field_r);
                var7_ref.field_p = true;
                param0.field_B.a(3, (ck) (Object) var7_ref);
                break L2;
              } else {
                break L2;
              }
            }
            L6: {
              if (60000 > Math.abs(param5)) {
                L7: {
                  if (param0.field_Xb[0] == 9) {
                    break L7;
                  } else {
                    L8: {
                      L9: {
                        var7_ref = new je(0, param0.field_Xb[0], (param0.field_hc + (param3.field_hc + ((ee) this).field_r)) % 100 + ((ee) this).field_r + 4);
                        var7_ref.field_y = param3.field_Gb;
                        var7_ref.field_u = param3.field_hc;
                        var8_double = Math.atan2((double)param5, (double)(-param2));
                        var7_ref.field_B = (int)(var8_double * 65536.0 / 6.283185307179586);
                        var7_ref.field_p = true;
                        if (param1 < 0) {
                          break L9;
                        } else {
                          if (var7_ref.field_B < -16384) {
                            var7_ref.field_B = var7_ref.field_B + 65536;
                            if (var12 == 0) {
                              break L8;
                            } else {
                              break L9;
                            }
                          } else {
                            break L8;
                          }
                        }
                      }
                      if (16384 >= var7_ref.field_B) {
                        break L8;
                      } else {
                        var7_ref.field_B = var7_ref.field_B - 65536;
                        break L8;
                      }
                    }
                    param0.field_B.a(param4 ^ 3, (ck) (Object) var7_ref);
                    if (var12 == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                var7_ref = new je(0, param0.field_Xb[0], ((ee) this).field_r - (-4 - (param3.field_hc + (((ee) this).field_r + param0.field_hc)) % 100));
                var7_ref.field_u = param3.field_hc;
                var7_ref.field_y = param3.field_Gb;
                var8 = 900;
                var9 = ((ee) this).field_z;
                var10 = 0;
                var11 = 10922;
                this.a(param1, param2, param5, var8, var10, var7_ref, var9, var11, -1);
                var7_ref.field_p = true;
                param0.field_B.a(3, (ck) (Object) var7_ref);
                break L6;
              } else {
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
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
              break L10;
            } else {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "{...}";
              stackIn_45_0 = stackOut_42_0;
              stackIn_45_1 = stackOut_42_1;
              stackIn_45_2 = stackOut_42_2;
              break L10;
            }
          }
          L11: {
            stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
            stackOut_45_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_45_2).append(',').append(param1).append(',').append(param2).append(',');
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
              break L11;
            } else {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "{...}";
              stackIn_49_0 = stackOut_46_0;
              stackIn_49_1 = stackOut_46_1;
              stackIn_49_2 = stackOut_46_2;
              break L11;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_49_0, stackIn_49_2 + ',' + param4 + ',' + param5 + ')');
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
        int stackIn_34_0 = 0;
        int stackIn_47_0 = 0;
        boolean stackIn_77_0 = false;
        int stackIn_88_0 = 0;
        boolean stackIn_124_0 = false;
        int stackIn_136_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_46_0 = 0;
        boolean stackOut_76_0 = false;
        int stackOut_87_0 = 0;
        boolean stackOut_123_0 = false;
        int stackOut_135_0 = 0;
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
        if (param0 == -27309) {
          L1: {
            L2: {
              L3: {
                if (((ee) this).field_R <= 0) {
                  break L3;
                } else {
                  L4: {
                    if (((ee) this).field_R % 1000 == 0) {
                      break L4;
                    } else {
                      if (((ee) this).field_R % 1000 == 500) {
                        L5: {
                          var2_int = 1;
                          if ((1 << var2_int + 4 & ((ee) this).field_v) != 0) {
                            break L5;
                          } else {
                            L6: {
                              if ((1 << 5 - var2_int & ((ee) this).field_v) != 0) {
                                break L6;
                              } else {
                                ((ee) this).a(var2_int, (byte) 8, (mb) null);
                                if (var15 == 0) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            this.a(1, var2_int);
                            break L5;
                          }
                        }
                        if (var15 == 0) {
                          break L2;
                        } else {
                          break L4;
                        }
                      } else {
                        break L2;
                      }
                    }
                  }
                  L7: {
                    var2_int = 0;
                    if ((((ee) this).field_v & 1 << 4 + var2_int) == 0) {
                      L8: {
                        if ((1 << -var2_int + 5 & ((ee) this).field_v) != 0) {
                          break L8;
                        } else {
                          ((ee) this).a(var2_int, (byte) 100, (mb) null);
                          if (var15 == 0) {
                            break L7;
                          } else {
                            break L8;
                          }
                        }
                      }
                      this.a(1, var2_int);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  if (var15 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              if (((ee) this).field_R == 0) {
                L9: {
                  var2_int = -((ee) this).field_ab.field_o[1] + ((ee) this).field_ab.field_o[0];
                  if (kc.field_x[4][0].field_z << 5 <= var2_int) {
                    break L9;
                  } else {
                    var3 = 0;
                    var4_ref_mb = (mb) (Object) ((ee) this).field_K.e(13058);
                    L10: while (true) {
                      L11: {
                        L12: {
                          if (null == var4_ref_mb) {
                            break L12;
                          } else {
                            stackOut_33_0 = var4_ref_mb.field_jc;
                            stackIn_47_0 = stackOut_33_0;
                            stackIn_34_0 = stackOut_33_0;
                            if (var15 != 0) {
                              break L11;
                            } else {
                              L13: {
                                if (stackIn_34_0 != 0) {
                                  break L13;
                                } else {
                                  if (var4_ref_mb.field_vb > 0) {
                                    var3 = var3 + var4_ref_mb.field_vb;
                                    break L13;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                              L14: {
                                if (var4_ref_mb.field_jc != 1) {
                                  break L14;
                                } else {
                                  if (0 < var4_ref_mb.field_vb) {
                                    var3 = var3 - var4_ref_mb.field_vb;
                                    break L14;
                                  } else {
                                    break L14;
                                  }
                                }
                              }
                              var4_ref_mb = (mb) (Object) ((ee) this).field_K.a((byte) -42);
                              if (var15 == 0) {
                                continue L10;
                              } else {
                                break L12;
                              }
                            }
                          }
                        }
                        stackOut_46_0 = -1;
                        stackIn_47_0 = stackOut_46_0;
                        break L11;
                      }
                      L15: {
                        L16: {
                          var4 = stackIn_47_0;
                          ((ee) this).field_R = 1;
                          if (var3 <= 0) {
                            break L16;
                          } else {
                            var4 = 0;
                            if (var15 == 0) {
                              break L15;
                            } else {
                              break L16;
                            }
                          }
                        }
                        var4 = 1;
                        break L15;
                      }
                      L17: {
                        if (1 != var4) {
                          break L17;
                        } else {
                          ((ee) this).field_R = 501;
                          break L17;
                        }
                      }
                      L18: {
                        if (var4 == -1) {
                          break L18;
                        } else {
                          if (0 != (((ee) this).field_v & 1 << 4 + var4)) {
                            break L18;
                          } else {
                            ((ee) this).a(var4, (byte) -95, (mb) null);
                            break L18;
                          }
                        }
                      }
                      if (var15 == 0) {
                        break L2;
                      } else {
                        break L9;
                      }
                    }
                  }
                }
                L19: {
                  if ((3 & ((ee) this).field_r) != 0) {
                    break L19;
                  } else {
                    var3 = ((ee) this).field_ab.field_o[0];
                    var4 = kc.field_x[4][0].field_z << 4;
                    var5 = -(var4 / 2) + var3;
                    var6 = var3 - -(var4 / 2);
                    var7 = var5;
                    L20: while (true) {
                      L21: {
                        L22: {
                          L23: {
                            if (~var7 <= ~var6) {
                              break L23;
                            } else {
                              ((ee) this).field_ab.field_m[var7] = ((ee) this).field_ab.field_m[var7 - -1];
                              ((ee) this).field_ab.field_e[var7] = ((ee) this).field_ab.field_e[1 + var7];
                              ((ee) this).field_ab.field_f[var7] = ((ee) this).field_ab.field_f[var7 + 1];
                              var7++;
                              if (var15 != 0) {
                                break L22;
                              } else {
                                if (var15 == 0) {
                                  continue L20;
                                } else {
                                  break L23;
                                }
                              }
                            }
                          }
                          if (4 != ((ee) this).field_r) {
                            break L22;
                          } else {
                            var7 = var6;
                            L24: while (true) {
                              L25: {
                                if (~var7 <= ~((ee) this).field_ab.field_m.length) {
                                  break L25;
                                } else {
                                  ((ee) this).field_ab.field_m[var7] = 0;
                                  ((ee) this).field_ab.field_e[var7] = 0;
                                  ((ee) this).field_ab.field_f[var7] = 0;
                                  var7++;
                                  if (var15 != 0) {
                                    break L21;
                                  } else {
                                    if (var15 == 0) {
                                      continue L24;
                                    } else {
                                      break L25;
                                    }
                                  }
                                }
                              }
                              if (var15 == 0) {
                                break L21;
                              } else {
                                break L22;
                              }
                            }
                          }
                        }
                        if (~var6 > ~((ee) this).field_ab.field_m.length) {
                          ((ee) this).field_ab.field_m[var6] = 0;
                          ((ee) this).field_ab.field_e[var6] = 0;
                          ((ee) this).field_ab.field_f[var6] = 0;
                          break L21;
                        } else {
                          break L21;
                        }
                      }
                      var7_ref_mb = (mb) (Object) ((ee) this).field_K.e(param0 ^ -22959);
                      L26: while (true) {
                        L27: {
                          L28: {
                            if (var7_ref_mb == null) {
                              break L28;
                            } else {
                              stackOut_76_0 = var7_ref_mb.field_Lb;
                              stackIn_88_0 = stackOut_76_0 ? 1 : 0;
                              stackIn_77_0 = stackOut_76_0;
                              if (var15 != 0) {
                                break L27;
                              } else {
                                L29: {
                                  L30: {
                                    if (!stackIn_77_0) {
                                      break L30;
                                    } else {
                                      if (!var7_ref_mb.field_pc) {
                                        break L29;
                                      } else {
                                        break L30;
                                      }
                                    }
                                  }
                                  if (~var5 < ~(var7_ref_mb.field_hc >> 4)) {
                                    break L29;
                                  } else {
                                    if (var7_ref_mb.field_hc >> 4 > var6) {
                                      break L29;
                                    } else {
                                      var7_ref_mb.field_hc = var7_ref_mb.field_hc - 16;
                                      break L29;
                                    }
                                  }
                                }
                                var7_ref_mb = (mb) (Object) ((ee) this).field_K.a((byte) -100);
                                if (var15 == 0) {
                                  continue L26;
                                } else {
                                  break L28;
                                }
                              }
                            }
                          }
                          ((ee) this).field_ab.field_o[0] = ((ee) this).field_ab.field_o[0] - 1;
                          stackOut_87_0 = 2;
                          stackIn_88_0 = stackOut_87_0;
                          break L27;
                        }
                        var7 = stackIn_88_0;
                        L31: while (true) {
                          L32: {
                            if (~((ee) this).field_ab.field_c >= ~var7) {
                              break L32;
                            } else {
                              if (var15 != 0) {
                                break L2;
                              } else {
                                L33: {
                                  L34: {
                                    if (((ee) this).field_ab.field_j[var7] != -1) {
                                      if (((ee) this).field_ab.field_o[var7] + 6000 <= var3) {
                                        break L34;
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
                                        L35: while (true) {
                                          if (~(((ee) this).field_ab.field_o[var7] + 1075) >= ~var10) {
                                            break L34;
                                          } else {
                                            var11 = ((ee) this).field_ab.field_m;
                                            var12 = var10;
                                            var13 = ((ee) this).field_ab.field_e;
                                            ((ee) this).field_ab.field_f[var10] = 0;
                                            var14 = var10;
                                            var13[var14] = 0;
                                            var11[var12] = 0;
                                            var10++;
                                            if (var15 != 0) {
                                              break L33;
                                            } else {
                                              if (var15 == 0) {
                                                continue L35;
                                              } else {
                                                break L34;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      break L34;
                                    }
                                  }
                                  var7++;
                                  break L33;
                                }
                                if (var15 == 0) {
                                  continue L31;
                                } else {
                                  break L32;
                                }
                              }
                            }
                          }
                          if (var15 == 0) {
                            break L2;
                          } else {
                            break L19;
                          }
                        }
                      }
                    }
                  }
                }
                if ((3 & ((ee) this).field_r) == 2) {
                  var3 = ((ee) this).field_ab.field_o[1];
                  var4 = kc.field_x[4][0].field_z << 4;
                  var5 = var3 - var4 / 2;
                  var6 = var4 / 2 + var3;
                  var7 = var6;
                  L36: while (true) {
                    L37: {
                      L38: {
                        L39: {
                          if (~var7 >= ~var5) {
                            break L39;
                          } else {
                            ((ee) this).field_ab.field_m[var7] = ((ee) this).field_ab.field_m[var7 + -1];
                            ((ee) this).field_ab.field_e[var7] = ((ee) this).field_ab.field_e[-1 + var7];
                            ((ee) this).field_ab.field_f[var7] = ((ee) this).field_ab.field_f[var7 + -1];
                            var7--;
                            if (var15 != 0) {
                              break L38;
                            } else {
                              if (var15 == 0) {
                                continue L36;
                              } else {
                                break L39;
                              }
                            }
                          }
                        }
                        if (((ee) this).field_r != 6) {
                          break L38;
                        } else {
                          var7 = var5;
                          L40: while (true) {
                            L41: {
                              if (var7 < 0) {
                                break L41;
                              } else {
                                ((ee) this).field_ab.field_m[var7] = 0;
                                ((ee) this).field_ab.field_e[var7] = 0;
                                ((ee) this).field_ab.field_f[var7] = 0;
                                var7--;
                                if (var15 != 0) {
                                  break L37;
                                } else {
                                  if (var15 == 0) {
                                    continue L40;
                                  } else {
                                    break L41;
                                  }
                                }
                              }
                            }
                            if (var15 == 0) {
                              break L37;
                            } else {
                              break L38;
                            }
                          }
                        }
                      }
                      if (var5 >= 0) {
                        ((ee) this).field_ab.field_m[var5] = 0;
                        ((ee) this).field_ab.field_e[var5] = 0;
                        ((ee) this).field_ab.field_f[var5] = 0;
                        break L37;
                      } else {
                        break L37;
                      }
                    }
                    var7_ref_mb = (mb) (Object) ((ee) this).field_K.e(13058);
                    L42: while (true) {
                      L43: {
                        L44: {
                          if (var7_ref_mb == null) {
                            break L44;
                          } else {
                            stackOut_123_0 = var7_ref_mb.field_Lb;
                            stackIn_136_0 = stackOut_123_0 ? 1 : 0;
                            stackIn_124_0 = stackOut_123_0;
                            if (var15 != 0) {
                              break L43;
                            } else {
                              L45: {
                                L46: {
                                  if (!stackIn_124_0) {
                                    break L46;
                                  } else {
                                    if (!var7_ref_mb.field_pc) {
                                      break L45;
                                    } else {
                                      break L46;
                                    }
                                  }
                                }
                                if (~(var7_ref_mb.field_hc >> 4) > ~var5) {
                                  break L45;
                                } else {
                                  if (var7_ref_mb.field_hc >> 4 <= var6) {
                                    var7_ref_mb.field_hc = var7_ref_mb.field_hc + 16;
                                    break L45;
                                  } else {
                                    break L45;
                                  }
                                }
                              }
                              var7_ref_mb = (mb) (Object) ((ee) this).field_K.a((byte) -22);
                              if (var15 == 0) {
                                continue L42;
                              } else {
                                break L44;
                              }
                            }
                          }
                        }
                        ((ee) this).field_ab.field_o[1] = ((ee) this).field_ab.field_o[1] + 1;
                        stackOut_135_0 = 2;
                        stackIn_136_0 = stackOut_135_0;
                        break L43;
                      }
                      var7 = stackIn_136_0;
                      L47: while (true) {
                        if (~((ee) this).field_ab.field_c >= ~var7) {
                          break L2;
                        } else {
                          if (var15 != 0) {
                            break L1;
                          } else {
                            L48: {
                              L49: {
                                if (-1 != ((ee) this).field_ab.field_j[var7]) {
                                  if (~var3 >= ~(-6000 + ((ee) this).field_ab.field_o[var7])) {
                                    break L49;
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
                                    L50: while (true) {
                                      if (1075 + ((ee) this).field_ab.field_o[var7] <= var10) {
                                        break L49;
                                      } else {
                                        var11 = ((ee) this).field_ab.field_m;
                                        var12 = var10;
                                        var13 = ((ee) this).field_ab.field_e;
                                        var14 = var10;
                                        ((ee) this).field_ab.field_f[var10] = 0;
                                        var13[var14] = 0;
                                        var11[var12] = 0;
                                        var10++;
                                        if (var15 != 0) {
                                          break L48;
                                        } else {
                                          if (var15 == 0) {
                                            continue L50;
                                          } else {
                                            break L49;
                                          }
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  break L49;
                                }
                              }
                              var7++;
                              break L48;
                            }
                            if (var15 == 0) {
                              continue L47;
                            } else {
                              break L2;
                            }
                          }
                        }
                      }
                    }
                  }
                } else {
                  break L2;
                }
              } else {
                break L2;
              }
            }
            break L1;
          }
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, je param5, int param6, int param7, int param8) {
        RuntimeException var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var17 = SteelSentinels.field_G;
        try {
          L0: {
            param5.field_B = param4;
            var10_int = param8;
            var11 = param4;
            L1: while (true) {
              L2: {
                L3: {
                  if (~param7 >= ~var11) {
                    break L3;
                  } else {
                    var12 = jh.a(param0 * (var11 >> 3), 4096) * param3 >> 16;
                    var13 = kg.a((var11 >> 3) * param0, (byte) -87) * -param3 >> 16;
                    if (var17 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (var12 == 0) {
                          break L4;
                        } else {
                          if (0 != var13) {
                            L5: {
                              var14 = param2 / var12;
                              if (param6 != 0) {
                                stackOut_15_0 = -(param1 / var13) + -var13 / param6;
                                stackIn_16_0 = stackOut_15_0;
                                break L5;
                              } else {
                                stackOut_13_0 = param1 / var13;
                                stackIn_16_0 = stackOut_13_0;
                                break L5;
                              }
                            }
                            L6: {
                              var15 = stackIn_16_0;
                              var16 = Math.abs(-var15 + var14);
                              if (Math.abs(var16) < var10_int) {
                                break L6;
                              } else {
                                if (var10_int == -1) {
                                  break L6;
                                } else {
                                  break L4;
                                }
                              }
                            }
                            var10_int = Math.abs(var16);
                            param5.field_B = param0 * var11;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var11 += 128;
                      if (var17 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var10 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var10;
            stackOut_25_1 = new StringBuilder().append("ee.LA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_28_0 = stackOut_25_0;
            stackIn_28_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param5 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L7;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_29_0 = stackOut_26_0;
              stackIn_29_1 = stackOut_26_1;
              stackIn_29_2 = stackOut_26_2;
              break L7;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
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
            if (param1 == 2714) {
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
                L3: {
                  if (param4.field_t > 0) {
                    break L3;
                  } else {
                    L4: {
                      if (Math.abs(param0) <= 80000) {
                        break L4;
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
                        if (var10 == 0) {
                          break L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      var7_ref = new je(3, 0, 100 + ((param4.field_hc + param5.field_hc + ((ee) this).field_r) % 100 + (((ee) this).field_r - -4)));
                      var7_ref.field_y = param4.field_Gb - 20000;
                      var7_ref.field_u = param4.field_hc - param3 * 20000;
                      var7_ref.field_p = true;
                      param4.field_B.a(3, (ck) (Object) var7_ref);
                      param4.field_Tb = param4.field_x;
                      if (null == param4.field_Vb) {
                        break L5;
                      } else {
                        var7_ref = new je(0, 11, 150 + ((param5.field_hc + ((ee) this).field_r + param4.field_hc) % 100 + (4 + ((ee) this).field_r)));
                        var7_ref.field_u = param5.field_hc;
                        var7_ref.field_y = param5.field_Gb;
                        var7_ref.field_p = true;
                        var7_ref.field_B = 16384 * param3;
                        param4.field_B.a(3, (ck) (Object) var7_ref);
                        break L5;
                      }
                    }
                    if (var10 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L6: {
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
                    break L6;
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
                    break L6;
                  }
                }
                var7_ref = new je(stackIn_22_2, stackIn_22_3, 2 + ((ee) this).field_r);
                var7_ref.field_p = true;
                param4.field_B.a(3, (ck) (Object) var7_ref);
                break L2;
              }
              L7: {
                if (Math.abs(param0) >= 100000) {
                  break L7;
                } else {
                  if (1 > param4.field_Tb) {
                    break L7;
                  } else {
                    L8: {
                      L9: {
                        var7_ref = new je(0, 7, 4 + (((ee) this).field_r - (-((param4.field_hc + ((ee) this).field_r + param5.field_hc) % 100) + -175)));
                        var7_ref.field_u = param5.field_hc;
                        var7_ref.field_y = param5.field_Gb;
                        var8 = Math.atan2((double)param0, (double)(-param2));
                        var7_ref.field_B = (int)(65536.0 * var8 / 6.283185307179586);
                        if (0 > param3) {
                          break L9;
                        } else {
                          if (var7_ref.field_B < -16384) {
                            var7_ref.field_B = var7_ref.field_B + 65536;
                            if (var10 == 0) {
                              break L8;
                            } else {
                              break L9;
                            }
                          } else {
                            break L8;
                          }
                        }
                      }
                      if (16384 < var7_ref.field_B) {
                        var7_ref.field_B = var7_ref.field_B - 65536;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    var7_ref.field_p = true;
                    param4.field_B.a(3, (ck) (Object) var7_ref);
                    break L7;
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
          L10: {
            var7 = decompiledCaughtException;
            stackOut_42_0 = (RuntimeException) var7;
            stackOut_42_1 = new StringBuilder().append("ee.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
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
              break L10;
            } else {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "{...}";
              stackIn_46_0 = stackOut_43_0;
              stackIn_46_1 = stackOut_43_1;
              stackIn_46_2 = stackOut_43_2;
              break L10;
            }
          }
          L11: {
            stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
            stackOut_46_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_46_2).append(',');
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
              break L11;
            } else {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "{...}";
              stackIn_50_0 = stackOut_47_0;
              stackIn_50_1 = stackOut_47_1;
              stackIn_50_2 = stackOut_47_2;
              break L11;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_50_0, stackIn_50_2 + ')');
        }
    }

    final void a(int param0, byte param1, mb param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        wl var7 = null;
        int var8 = 0;
        jc var9 = null;
        mb var10 = null;
        int var11 = 0;
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
              L2: {
                L3: {
                  if (null == var10) {
                    break L3;
                  } else {
                    if (var11 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (param0 != var10.field_jc) {
                          break L4;
                        } else {
                          if (var10.field_Cb) {
                            var10.field_Cb = false;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var10 = (mb) (Object) var9.d(2);
                      if (var11 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4;
            stackOut_15_1 = new StringBuilder().append("ee.DB(").append(param0).append(',').append(param1).append(',');
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L5;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, mb param3, mb param4, boolean param5) {
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
              L2: {
                if (0 < param3.field_t) {
                  break L2;
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
                      if (var8 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
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
                    if (var8 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L7: {
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
                  break L7;
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
                  break L7;
                }
              }
              var7_ref = new je(stackIn_37_2, stackIn_37_3, 2 + ((ee) this).field_r);
              var7_ref.field_p = true;
              param3.field_B.a(3, (ck) (Object) var7_ref);
              break L1;
            }
            if (!param5) {
              L8: {
                L9: {
                  if (50000 >= Math.abs(param1)) {
                    break L9;
                  } else {
                    if (this.a(((ee) this).field_z, (byte) -89, 2, param3, param4, 2600, ((ee) this).field_r + 15)) {
                      break L8;
                    } else {
                      break L9;
                    }
                  }
                }
                if (param3.field_Tb <= 1) {
                  if (!this.a(((ee) this).field_z, (byte) -88, 0, param3, param4, 4352, ((ee) this).field_r + 25)) {
                    break L8;
                  } else {
                    if (Math.abs(param1) <= 80000) {
                      break L8;
                    } else {
                      if (param3.field_Tb > 0) {
                        var7_ref = new je(3, 0, ((ee) this).field_r - -30);
                        var7_ref.field_p = true;
                        var7_ref.field_y = param3.field_Gb + -20000;
                        var7_ref.field_u = param0 * 20000 + param3.field_hc;
                        param3.field_B.a(3, (ck) (Object) var7_ref);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                  }
                } else {
                  if (this.a(((ee) this).field_z, (byte) -126, 1, param3, param4, 1728, 25 + ((ee) this).field_r)) {
                    break L8;
                  } else {
                    if (!this.a(((ee) this).field_z, (byte) -63, 0, param3, param4, 4352, 25 + ((ee) this).field_r)) {
                      break L8;
                    } else {
                      break L8;
                    }
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
          L10: {
            var7 = decompiledCaughtException;
            stackOut_66_0 = (RuntimeException) var7;
            stackOut_66_1 = new StringBuilder().append("ee.TA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
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
              break L10;
            } else {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "{...}";
              stackIn_70_0 = stackOut_67_0;
              stackIn_70_1 = stackOut_67_1;
              stackIn_70_2 = stackOut_67_2;
              break L10;
            }
          }
          L11: {
            stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
            stackOut_70_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(',');
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
          throw ci.a((Throwable) (Object) stackIn_74_0, stackIn_74_2 + ',' + param5 + ')');
        }
    }

    private final boolean a(byte param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        boolean stackIn_15_0 = false;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_14_0 = false;
        int stackOut_18_0 = 0;
        int stackOut_21_0 = 0;
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
                      L4: {
                        L5: {
                          if (~param2 >= ~param1) {
                            break L5;
                          } else {
                            stackOut_14_0 = this.b(true, param1);
                            stackIn_22_0 = stackOut_14_0 ? 1 : 0;
                            stackIn_15_0 = stackOut_14_0;
                            if (var5 != 0) {
                              break L4;
                            } else {
                              if (stackIn_15_0) {
                                param1++;
                                if (var5 == 0) {
                                  continue L3;
                                } else {
                                  break L5;
                                }
                              } else {
                                stackOut_18_0 = 0;
                                stackIn_19_0 = stackOut_18_0;
                                return stackIn_19_0 != 0;
                              }
                            }
                          }
                        }
                        stackOut_21_0 = 1;
                        stackIn_22_0 = stackOut_21_0;
                        break L4;
                      }
                      break L0;
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
          throw ci.a((Throwable) (Object) var4, "ee.M(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_22_0 != 0;
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
            throw ci.a((Throwable) (Object) runtimeException, "ee.L(" + param0 + ')');
        }
    }

    final int b(boolean param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        mb var3 = null;
        int var4 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
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
              L3: {
                L4: {
                  if (null == var3) {
                    break L4;
                  } else {
                    var2_int = var2_int + (3 * var3.field_Gb + var3.field_hc * 2 & 65535);
                    var2_int = var2_int + (var3.field_K & 65535);
                    var2_int = var2_int + ((65535 & var3.field_ab) << 16);
                    var2_int = var2_int + (11 * var3.field_ub + 7 * var3.field_Tb & 65535);
                    var2_int = var2_int + ((65535 & var3.field_vb) << 16);
                    var2_int = var2_int + (65535 & var3.field_rb * 5);
                    var3 = (mb) (Object) ((ee) this).field_K.a((byte) -44);
                    if (var4 != 0) {
                      break L3;
                    } else {
                      if (var4 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                var2_int = var2_int + ((ee) this).field_r;
                var2_int = var2_int + ((65535 & ((ee) this).field_d + ((ee) this).field_M + ((ee) this).field_gb) << 16);
                break L3;
              }
              stackOut_11_0 = var2_int;
              stackIn_12_0 = stackOut_11_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var2, "ee.V(" + param0 + ')');
        }
        return stackIn_12_0;
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
                    param3.field_B.a(param0 ^ 58, (ck) (Object) var7_ref);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            L2: {
              L3: {
                if (param3.field_t <= 0) {
                  break L3;
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
                  if (var8 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L5: {
                if (Math.abs(param1) >= 70000) {
                  break L5;
                } else {
                  if (param3.field_U == 0) {
                    break L5;
                  } else {
                    L6: {
                      if (Math.abs(param1) < 20000) {
                        break L6;
                      } else {
                        if (Math.abs(param1) >= 50000) {
                          break L2;
                        } else {
                          var7_ref = new je(6, 0, ((ee) this).field_r + 2);
                          var7_ref.field_p = true;
                          param3.field_B.a(3, (ck) (Object) var7_ref);
                          if (var8 == 0) {
                            break L2;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    var7_ref = new je(6, -param4, 2 + ((ee) this).field_r);
                    var7_ref.field_p = true;
                    param3.field_B.a(3, (ck) (Object) var7_ref);
                    if (var8 == 0) {
                      break L2;
                    } else {
                      break L5;
                    }
                  }
                }
              }
              var7_ref = new je(6, param4, ((ee) this).field_r - -2);
              var7_ref.field_p = true;
              param3.field_B.a(param0 ^ 58, (ck) (Object) var7_ref);
              break L2;
            }
            L7: {
              if (null != param3.field_Vb) {
                var7_ref = new je(0, param3.field_Xb[2], 5 + ((ee) this).field_r);
                var7_ref.field_B = 7192 * param4;
                var7_ref.field_p = true;
                var7_ref.field_y = param2.field_Gb;
                var7_ref.field_u = param2.field_hc;
                param3.field_B.a(3, (ck) (Object) var7_ref);
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (param0 == 57) {
                break L8;
              } else {
                ((ee) this).field_hb = -92;
                break L8;
              }
            }
            L9: {
              if (!this.a(((ee) this).field_z, (byte) -57, 4, param3, param2, 2600, ((ee) this).field_r + 15)) {
                if (this.a(((ee) this).field_z, (byte) -61, 3, param3, param2, 2600, ((ee) this).field_r + 15)) {
                  break L9;
                } else {
                  L10: {
                    if (param3.field_Tb <= 0) {
                      break L10;
                    } else {
                      if (param2.field_S <= 50) {
                        break L10;
                      } else {
                        if (!this.a(((ee) this).field_z * 4, (byte) -88, 1, param3, param2, 8448, 15 + ((ee) this).field_r)) {
                          if (!this.a(((ee) this).field_z, (byte) -29, 0, param3, param2, 2304, ((ee) this).field_r - -25)) {
                            break L9;
                          } else {
                            break L9;
                          }
                        } else {
                          break L9;
                        }
                      }
                    }
                  }
                  if (!this.a(((ee) this).field_z, (byte) -88, 0, param3, param2, 2304, ((ee) this).field_r - -25)) {
                    if (param3.field_Tb <= 0) {
                      break L9;
                    } else {
                      if (this.a(((ee) this).field_z, (byte) -91, 1, param3, param2, 1728, 15 + ((ee) this).field_r)) {
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                  } else {
                    break L9;
                  }
                }
              } else {
                break L9;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var7 = decompiledCaughtException;
            stackOut_67_0 = (RuntimeException) var7;
            stackOut_67_1 = new StringBuilder().append("ee.BA(").append(param0).append(',').append(param1).append(',');
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
              break L11;
            } else {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "{...}";
              stackIn_71_0 = stackOut_68_0;
              stackIn_71_1 = stackOut_68_1;
              stackIn_71_2 = stackOut_68_2;
              break L11;
            }
          }
          L12: {
            stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
            stackOut_71_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(',');
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
              break L12;
            } else {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "{...}";
              stackIn_75_0 = stackOut_72_0;
              stackIn_75_1 = stackOut_72_1;
              stackIn_75_2 = stackOut_72_2;
              break L12;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_75_0, stackIn_75_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final boolean a(int param0, boolean param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_19_0 = 0;
        Object stackIn_21_0 = null;
        Object stackIn_23_0 = null;
        Object stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_18_0 = 0;
        Object stackOut_20_0 = null;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        var4 = SteelSentinels.field_G;
        try {
          L0: {
            if (((ee) this).field_ab.b(88) == 2) {
              if (((ee) this).field_ab.a(param1, param0) <= 3000) {
                if (this.b(true, param0)) {
                  param0--;
                  L1: while (true) {
                    L2: {
                      L3: {
                        if (param0 <= 0) {
                          break L3;
                        } else {
                          stackOut_12_0 = 3000;
                          stackIn_29_0 = stackOut_12_0;
                          stackIn_13_0 = stackOut_12_0;
                          if (var4 != 0) {
                            break L2;
                          } else {
                            if (stackIn_13_0 < ((ee) this).field_ab.a(false, param0)) {
                              stackOut_18_0 = 1;
                              stackIn_19_0 = stackOut_18_0;
                              return stackIn_19_0 != 0;
                            } else {
                              L4: {
                                stackOut_20_0 = this;
                                stackIn_23_0 = stackOut_20_0;
                                stackIn_21_0 = stackOut_20_0;
                                if (param1) {
                                  stackOut_23_0 = this;
                                  stackOut_23_1 = 0;
                                  stackIn_24_0 = stackOut_23_0;
                                  stackIn_24_1 = stackOut_23_1;
                                  break L4;
                                } else {
                                  stackOut_21_0 = this;
                                  stackOut_21_1 = 1;
                                  stackIn_24_0 = stackOut_21_0;
                                  stackIn_24_1 = stackOut_21_1;
                                  break L4;
                                }
                              }
                              if (this.b(stackIn_24_1 != 0, param0)) {
                                param0--;
                                if (var4 == 0) {
                                  continue L1;
                                } else {
                                  break L3;
                                }
                              } else {
                                stackOut_25_0 = 0;
                                stackIn_26_0 = stackOut_25_0;
                                return stackIn_26_0 != 0;
                              }
                            }
                          }
                        }
                      }
                      stackOut_28_0 = 0;
                      stackIn_29_0 = stackOut_28_0;
                      break L2;
                    }
                    break L0;
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
          throw ci.a((Throwable) (Object) var3, "ee.A(" + param0 + ',' + param1 + ')');
        }
        return stackIn_29_0 != 0;
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
          throw ci.a((Throwable) (Object) var2, "ee.I(" + param0 + ')');
        }
        return stackIn_7_0 != 0;
    }

    private final int a(byte param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_14_0 = false;
        int stackIn_22_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_4_0 = false;
        boolean stackOut_13_0 = false;
        int stackOut_21_0 = 0;
        var5 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  var4 = -114 / ((param0 - -15) / 60);
                  var3_int = 0;
                  if (((ee) this).field_ab.a(65) / 2 > param1) {
                    break L3;
                  } else {
                    var3_int = ((ee) this).field_ab.a(108);
                    L4: while (true) {
                      if (param1 <= 0) {
                        break L2;
                      } else {
                        stackOut_4_0 = this.b(true, param1);
                        stackIn_22_0 = stackOut_4_0 ? 1 : 0;
                        stackIn_5_0 = stackOut_4_0;
                        if (var5 != 0) {
                          break L1;
                        } else {
                          L5: {
                            if (stackIn_5_0) {
                              break L5;
                            } else {
                              var3_int = -800 + param1;
                              if (var5 == 0) {
                                break L2;
                              } else {
                                break L5;
                              }
                            }
                          }
                          param1--;
                          if (var5 == 0) {
                            continue L4;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                }
                L6: while (true) {
                  if (((ee) this).field_ab.a(-128) <= param1) {
                    break L2;
                  } else {
                    stackOut_13_0 = this.b(true, param1);
                    stackIn_22_0 = stackOut_13_0 ? 1 : 0;
                    stackIn_14_0 = stackOut_13_0;
                    if (var5 != 0) {
                      break L1;
                    } else {
                      L7: {
                        if (stackIn_14_0) {
                          break L7;
                        } else {
                          var3_int = 800 + param1;
                          if (var5 == 0) {
                            break L2;
                          } else {
                            break L7;
                          }
                        }
                      }
                      param1++;
                      if (var5 == 0) {
                        continue L6;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              stackOut_21_0 = Math.max(128, Math.min(((ee) this).field_ab.a(109) + -128, var3_int));
              stackIn_22_0 = stackOut_21_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var3, "ee.Q(" + param0 + ',' + param1 + ')');
        }
        return stackIn_22_0;
    }

    private final void a(int param0, int param1, mb param2, int param3, mb param4) {
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
        var7 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              L2: {
                if (param4.field_t > 0) {
                  break L2;
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
                        if (var7 == 0) {
                          break L1;
                        } else {
                          break L3;
                        }
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
                  if (var7 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L5: {
                var6_ref = null;
                if (param4.field_hc >> 4 <= param4.field_t) {
                  var6_ref = new je(6, 1, 2 + ((ee) this).field_r);
                  break L5;
                } else {
                  var6_ref = new je(6, -1, 2 + ((ee) this).field_r);
                  break L5;
                }
              }
              var6_ref.field_p = true;
              param4.field_B.a(3, (ck) (Object) var6_ref);
              break L1;
            }
            L6: {
              if (param0 < -77) {
                break L6;
              } else {
                ((ee) this).field_X = 4;
                break L6;
              }
            }
            L7: {
              L8: {
                param2.field_Gb = param2.field_Gb + (param4.field_Db << 3);
                if (param4.field_Lb) {
                  break L8;
                } else {
                  if (param4.field_oc <= 0) {
                    break L7;
                  } else {
                    break L8;
                  }
                }
              }
              if (!this.a(((ee) this).field_z, (byte) -128, 3, param4, param2, 2600, ((ee) this).field_r + 15)) {
                break L7;
              } else {
                break L7;
              }
            }
            L9: {
              if (!this.a(((ee) this).field_z, (byte) -97, 2, param4, param2, 2600, 15 + ((ee) this).field_r)) {
                L10: {
                  if (param4.field_Tb <= 1) {
                    break L10;
                  } else {
                    if (this.a(((ee) this).field_z, (byte) -109, 1, param4, param2, 1728, 25 + ((ee) this).field_r)) {
                      break L9;
                    } else {
                      if (!this.a(0, (byte) -69, 0, param4, param2, 4608, 25 + ((ee) this).field_r)) {
                        break L9;
                      } else {
                        if (param4.field_t == 0) {
                          var6_ref = new je(3, 0, 3 + ((ee) this).field_r);
                          var6_ref.field_y = param4.field_Gb + -20000;
                          var6_ref.field_u = param4.field_hc - -(10000 * param1);
                          var6_ref.field_p = true;
                          param4.field_B.a(3, (ck) (Object) var6_ref);
                          param4.g(5);
                          if (var7 == 0) {
                            break L9;
                          } else {
                            break L10;
                          }
                        } else {
                          break L9;
                        }
                      }
                    }
                  }
                }
                if (param4.field_t != 0) {
                  break L9;
                } else {
                  if (param4.field_Tb > 0) {
                    var6_ref = new je(3, 0, 30 + ((ee) this).field_r);
                    var6_ref.field_y = param4.field_Gb + -20000;
                    var6_ref.field_p = true;
                    var6_ref.field_u = param4.field_hc - 20000 * param1;
                    param4.field_B.a(3, (ck) (Object) var6_ref);
                    param4.g(5);
                    break L9;
                  } else {
                    break L9;
                  }
                }
              } else {
                break L9;
              }
            }
            param2.field_Gb = param2.field_Gb - (param4.field_Db << 3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var6 = decompiledCaughtException;
            stackOut_59_0 = (RuntimeException) var6;
            stackOut_59_1 = new StringBuilder().append("ee.QA(").append(param0).append(',').append(param1).append(',');
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
              break L11;
            } else {
              stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
              stackOut_60_1 = (StringBuilder) (Object) stackIn_60_1;
              stackOut_60_2 = "{...}";
              stackIn_63_0 = stackOut_60_0;
              stackIn_63_1 = stackOut_60_1;
              stackIn_63_2 = stackOut_60_2;
              break L11;
            }
          }
          L12: {
            stackOut_63_0 = (RuntimeException) (Object) stackIn_63_0;
            stackOut_63_1 = ((StringBuilder) (Object) stackIn_63_1).append(stackIn_63_2).append(',').append(param3).append(',');
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
              break L12;
            } else {
              stackOut_64_0 = (RuntimeException) (Object) stackIn_64_0;
              stackOut_64_1 = (StringBuilder) (Object) stackIn_64_1;
              stackOut_64_2 = "{...}";
              stackIn_67_0 = stackOut_64_0;
              stackIn_67_1 = stackOut_64_1;
              stackIn_67_2 = stackOut_64_2;
              break L12;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_67_0, stackIn_67_2 + ')');
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
        int stackIn_8_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_7_0 = 0;
        boolean stackOut_28_0 = false;
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
              L3: {
                L4: {
                  if (var7 == null) {
                    break L4;
                  } else {
                    stackOut_7_0 = var7.field_Bb;
                    stackIn_29_0 = stackOut_7_0;
                    stackIn_8_0 = stackOut_7_0;
                    if (var8 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (stackIn_8_0 < 0) {
                          break L5;
                        } else {
                          if (var7.field_Bb >= ((ee) this).field_Q + ((ee) this).field_kb) {
                            break L5;
                          } else {
                            if (var7.field_V) {
                              break L5;
                            } else {
                              L6: {
                                if (var7.field_Hb) {
                                  break L6;
                                } else {
                                  var4 = var4 | 1 << var7.field_Bb;
                                  var3 = var3 | 1 << var7.field_jc;
                                  if (((ee) this).field_kb > var7.field_Bb) {
                                    var5 = var5 | 1 << var7.field_Bb;
                                    break L6;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                              var6[var7.field_Bb] = var7.field_vb;
                              if (var6[var7.field_Bb] > 0) {
                                break L5;
                              } else {
                                var6[var7.field_Bb] = 1;
                                break L5;
                              }
                            }
                          }
                        }
                      }
                      var7 = (mb) (Object) ((ee) this).field_K.a((byte) -55);
                      if (var8 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_28_0 = ((ee) this).field_lb;
                stackIn_29_0 = stackOut_28_0 ? 1 : 0;
                break L3;
              }
              L7: {
                L8: {
                  L9: {
                    if (stackIn_29_0 != 0) {
                      break L9;
                    } else {
                      if (var2_int == 0) {
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  if (0 >= mm.a((byte) 123, var4)) {
                    this.a(var6, (byte) -109);
                    if (var8 == 0) {
                      break L7;
                    } else {
                      break L8;
                    }
                  } else {
                    break L7;
                  }
                }
                L10: {
                  if (mm.a((byte) 127, var3) <= 1) {
                    break L10;
                  } else {
                    if (var5 != 0) {
                      break L7;
                    } else {
                      break L10;
                    }
                  }
                }
                this.a(var6, (byte) -111);
                break L7;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var2, "ee.K(" + param0 + ')');
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        boolean stackIn_8_0 = false;
        int stackIn_13_0 = 0;
        boolean stackIn_19_0 = false;
        int stackIn_23_0 = 0;
        boolean stackIn_32_0 = false;
        int stackIn_36_0 = 0;
        boolean stackIn_42_0 = false;
        int stackIn_47_0 = 0;
        int stackIn_50_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_7_0 = false;
        int stackOut_12_0 = 0;
        boolean stackOut_18_0 = false;
        int stackOut_22_0 = 0;
        boolean stackOut_31_0 = false;
        int stackOut_35_0 = 0;
        boolean stackOut_41_0 = false;
        int stackOut_46_0 = 0;
        int stackOut_49_0 = 0;
        var11 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  var8_int = 60 / ((param5 - -8) / 59);
                  if (Math.abs(param1) < Math.abs(param2)) {
                    break L3;
                  } else {
                    L4: {
                      if (param0 <= param3) {
                        break L4;
                      } else {
                        var9 = param3;
                        L5: while (true) {
                          L6: {
                            if (var9 >= param0) {
                              break L6;
                            } else {
                              var10 = param2 * (-param3 + var9) / param1 + param4;
                              stackOut_7_0 = this.a(true, var10, var9);
                              stackIn_50_0 = stackOut_7_0 ? 1 : 0;
                              stackIn_8_0 = stackOut_7_0;
                              if (var11 != 0) {
                                break L1;
                              } else {
                                if (stackIn_8_0) {
                                  stackOut_12_0 = 1;
                                  stackIn_13_0 = stackOut_12_0;
                                  return stackIn_13_0 != 0;
                                } else {
                                  var9 += 8;
                                  if (var11 == 0) {
                                    continue L5;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                          }
                          if (var11 == 0) {
                            break L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    var9 = param3;
                    L7: while (true) {
                      L8: {
                        if (~param0 <= ~var9) {
                          break L8;
                        } else {
                          var10 = (var9 + -param3) * param2 / param1 + param4;
                          stackOut_18_0 = this.a(true, var10, var9);
                          stackIn_50_0 = stackOut_18_0 ? 1 : 0;
                          stackIn_19_0 = stackOut_18_0;
                          if (var11 != 0) {
                            break L1;
                          } else {
                            if (!stackIn_19_0) {
                              var9 -= 8;
                              if (var11 == 0) {
                                continue L7;
                              } else {
                                break L8;
                              }
                            } else {
                              stackOut_22_0 = 1;
                              stackIn_23_0 = stackOut_22_0;
                              return stackIn_23_0 != 0;
                            }
                          }
                        }
                      }
                      if (var11 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                L9: {
                  if (param6 <= param4) {
                    break L9;
                  } else {
                    var9 = param4;
                    L10: while (true) {
                      L11: {
                        if (param6 <= var9) {
                          break L11;
                        } else {
                          var10 = param3 + (-param4 + var9) * param1 / param2;
                          stackOut_31_0 = this.a(true, var9, var10);
                          stackIn_50_0 = stackOut_31_0 ? 1 : 0;
                          stackIn_32_0 = stackOut_31_0;
                          if (var11 != 0) {
                            break L1;
                          } else {
                            if (!stackIn_32_0) {
                              var9 += 8;
                              if (var11 == 0) {
                                continue L10;
                              } else {
                                break L11;
                              }
                            } else {
                              stackOut_35_0 = 1;
                              stackIn_36_0 = stackOut_35_0;
                              return stackIn_36_0 != 0;
                            }
                          }
                        }
                      }
                      if (var11 == 0) {
                        break L2;
                      } else {
                        break L9;
                      }
                    }
                  }
                }
                var9 = param4;
                L12: while (true) {
                  if (param6 >= var9) {
                    break L2;
                  } else {
                    var10 = (var9 + -param4) * param1 / param2 + param3;
                    stackOut_41_0 = this.a(true, var9, var10);
                    stackIn_50_0 = stackOut_41_0 ? 1 : 0;
                    stackIn_42_0 = stackOut_41_0;
                    if (var11 != 0) {
                      break L1;
                    } else {
                      if (stackIn_42_0) {
                        stackOut_46_0 = 1;
                        stackIn_47_0 = stackOut_46_0;
                        return stackIn_47_0 != 0;
                      } else {
                        var9 -= 8;
                        if (var11 == 0) {
                          continue L12;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
              stackOut_49_0 = 0;
              stackIn_50_0 = stackOut_49_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var8, "ee.U(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_50_0 != 0;
    }

    private final int h(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        mb var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_2_0 = 0;
        var4 = SteelSentinels.field_G;
        try {
          L0: {
            if (param0 > 45) {
              var2_int = 0;
              var3 = (mb) (Object) ((ee) this).field_K.e(13058);
              L1: while (true) {
                L2: {
                  L3: {
                    if (var3 == null) {
                      break L3;
                    } else {
                      stackOut_6_0 = 8;
                      stackIn_14_0 = stackOut_6_0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var4 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (stackIn_7_0 != var3.field_Nb) {
                            break L4;
                          } else {
                            var2_int++;
                            break L4;
                          }
                        }
                        var3 = (mb) (Object) ((ee) this).field_K.a((byte) -81);
                        if (var4 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_13_0 = var2_int;
                  stackIn_14_0 = stackOut_13_0;
                  break L2;
                }
                break L0;
              }
            } else {
              stackOut_2_0 = 53;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var2, "ee.AB(" + param0 + ')');
        }
        return stackIn_14_0;
    }

    private final void i(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = SteelSentinels.field_G;
        try {
          L0: {
            if (null == ((ee) this).field_y) {
              ((ee) this).field_p = false;
              return;
            } else {
              L1: {
                ((ee) this).field_p = true;
                if (param0 == -22017) {
                  break L1;
                } else {
                  this.a((byte) 105, -38, 41, -10, (mb) null, (mb) null);
                  break L1;
                }
              }
              var2_int = 0;
              L2: while (true) {
                L3: {
                  if (var2_int >= ((ee) this).field_E.length) {
                    break L3;
                  } else {
                    if (!((ee) this).field_p) {
                      break L3;
                    } else {
                      L4: {
                        if (~((ee) this).field_y.field_vb < ~((ee) this).field_E[var2_int]) {
                          break L4;
                        } else {
                          ((ee) this).field_p = false;
                          break L4;
                        }
                      }
                      var2_int++;
                      if (var3 == 0) {
                        continue L2;
                      } else {
                        break L3;
                      }
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
          throw ci.a((Throwable) (Object) var2, "ee.CA(" + param0 + ')');
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
            L1: {
              param2 = -param2;
              if (param0) {
                break L1;
              } else {
                ((ee) this).field_T = null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (((ee) this).field_ab.a(false, param1) <= param2) {
                  break L3;
                } else {
                  L4: {
                    if (~((ee) this).field_ab.a((byte) -102, param1) < ~param2) {
                      break L4;
                    } else {
                      if (((ee) this).field_ab.b((byte) 120, param1) >= param2) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  stackOut_10_0 = 1;
                  stackIn_13_0 = stackOut_10_0;
                  break L2;
                }
              }
              stackOut_12_0 = 0;
              stackIn_13_0 = stackOut_12_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var4, "ee.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_13_0 != 0;
    }

    final void a(int param0, int param1, int param2) {
        mb var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        mb stackIn_16_0 = null;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        mb stackIn_23_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        mb stackOut_15_0 = null;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        mb stackOut_22_0 = null;
        var5 = SteelSentinels.field_G;
        try {
          L0: {
            var4 = ((ee) this).f(param2, -128);
            if (param1 == 28669) {
              L1: {
                if (var4 != null) {
                  L2: while (true) {
                    L3: {
                      L4: {
                        L5: {
                          L6: {
                            if (var4.field_Ec.f(7)) {
                              break L6;
                            } else {
                              stackOut_7_0 = param0;
                              stackOut_7_1 = ((je) (Object) var4.field_Ec.b(1063677678)).field_x;
                              stackIn_18_0 = stackOut_7_0;
                              stackIn_18_1 = stackOut_7_1;
                              stackIn_8_0 = stackOut_7_0;
                              stackIn_8_1 = stackOut_7_1;
                              if (var5 != 0) {
                                L7: while (true) {
                                  if (stackIn_18_0 < stackIn_18_1) {
                                    break L4;
                                  } else {
                                    var4.field_B.b(param1 + 1063649009).b(4);
                                    if (var5 == 0) {
                                      if (var4.field_B.f(7)) {
                                        break L4;
                                      } else {
                                        stackOut_15_0 = (mb) var4;
                                        stackIn_23_0 = stackOut_15_0;
                                        stackIn_16_0 = stackOut_15_0;
                                        if (var5 != 0) {
                                          break L3;
                                        } else {
                                          stackOut_16_0 = ((je) (Object) ((ul) (Object) stackIn_16_0.field_B).b(param1 + 1063649009)).field_x;
                                          stackOut_16_1 = param0;
                                          stackIn_18_0 = stackOut_16_0;
                                          stackIn_18_1 = stackOut_16_1;
                                          continue L7;
                                        }
                                      }
                                    } else {
                                      break L5;
                                    }
                                  }
                                }
                              } else {
                                if (stackIn_8_0 > stackIn_8_1) {
                                  break L6;
                                } else {
                                  var4.field_Ec.b(1063677678).b(4);
                                  if (var5 == 0) {
                                    continue L2;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                          }
                          L8: while (true) {
                            if (var4.field_B.f(7)) {
                              break L4;
                            } else {
                              stackOut_15_0 = (mb) var4;
                              stackIn_23_0 = stackOut_15_0;
                              stackIn_16_0 = stackOut_15_0;
                              if (var5 != 0) {
                                break L3;
                              } else {
                                stackOut_16_0 = ((je) (Object) ((ul) (Object) stackIn_16_0.field_B).b(param1 + 1063649009)).field_x;
                                stackOut_16_1 = param0;
                                stackIn_18_0 = stackOut_16_0;
                                stackIn_18_1 = stackOut_16_1;
                                if (stackIn_18_0 < stackIn_18_1) {
                                  break L4;
                                } else {
                                  var4.field_B.b(param1 + 1063649009).b(4);
                                  if (var5 == 0) {
                                    continue L8;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                            }
                          }
                        }
                        break L4;
                      }
                      stackOut_22_0 = (mb) var4;
                      stackIn_23_0 = stackOut_22_0;
                      break L3;
                    }
                    ((mb) (Object) stackIn_23_0).d((byte) 85, new je(10, 0, param0));
                    break L1;
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
          throw ci.a((Throwable) (Object) var4_ref, "ee.WA(" + param0 + ',' + param1 + ',' + param2 + ')');
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
              L3: {
                var7 = stackIn_5_0;
                if (param0.field_t <= 0) {
                  break L3;
                } else {
                  L4: {
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
                      break L4;
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
                      break L4;
                    }
                  }
                  var8_ref_je = new je(stackIn_12_2, stackIn_12_3, 2 + ((ee) this).field_r);
                  var8_ref_je.field_p = true;
                  param0.field_B.a(3, (ck) (Object) var8_ref_je);
                  if (var10 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              if (Math.abs(param3) <= 80000) {
                if (Math.abs(param3) >= 60000) {
                  L5: {
                    if (param0.field_U != 0) {
                      break L5;
                    } else {
                      var8_ref_je = new je(6, param4, 2 + ((ee) this).field_r);
                      var8_ref_je.field_p = true;
                      param0.field_B.a(3, (ck) (Object) var8_ref_je);
                      if (var10 == 0) {
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L6: {
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
                      break L6;
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
                      break L6;
                    }
                  }
                  var6 = (Object) (Object) new je(stackIn_43_2, stackIn_43_3, stackIn_43_4 + ((ee) this).field_r);
                  ((je) var6).field_p = true;
                  ((je) var6).field_u = 5000 * param4 + param0.field_hc;
                  ((je) var6).field_y = -20000 + param0.field_Gb;
                  break L2;
                } else {
                  L7: {
                    var8_ref_je = new je(6, -param4, 2 + ((ee) this).field_r);
                    var8_ref_je.field_p = true;
                    param0.field_B.a(3, (ck) (Object) var8_ref_je);
                    if (var7 == 0) {
                      break L7;
                    } else {
                      L8: {
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
                          break L8;
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
                          break L8;
                        }
                      }
                      var6 = (Object) (Object) new je(stackIn_33_2, stackIn_33_3, stackIn_33_4 + ((ee) this).field_r);
                      ((je) var6).field_y = -20000 + param0.field_Gb;
                      ((je) var6).field_u = param0.field_hc - 20000 * param4;
                      ((je) var6).field_p = true;
                      break L7;
                    }
                  }
                  break L2;
                }
              } else {
                L9: {
                  var8_ref_je = new je(6, param4, 2 + ((ee) this).field_r);
                  var8_ref_je.field_p = true;
                  param0.field_B.a(3, (ck) (Object) var8_ref_je);
                  if (var7 == 0) {
                    break L9;
                  } else {
                    L10: {
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
                        break L10;
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
                        break L10;
                      }
                    }
                    var6 = (Object) (Object) new je(stackIn_23_2, stackIn_23_3, stackIn_23_4 - -stackIn_23_5);
                    ((je) var6).field_u = param2.field_hc;
                    ((je) var6).field_y = -20000 + param0.field_Gb;
                    ((je) var6).field_p = true;
                    break L9;
                  }
                }
                break L2;
              }
            }
            L11: {
              L12: {
                L13: {
                  var8 = 41 % ((param1 - 31) / 61);
                  if (!param0.field_Lb) {
                    break L13;
                  } else {
                    if (this.a(((ee) this).field_z, (byte) -92, 2, param0, param2, 2600, 3 + ((ee) this).field_r)) {
                      break L12;
                    } else {
                      break L13;
                    }
                  }
                }
                L14: {
                  if (param0.field_Tb <= 1) {
                    break L14;
                  } else {
                    L15: {
                      if (this.a(((ee) this).field_z, (byte) -75, 1, param0, param2, 4608, ((ee) this).field_r - -3)) {
                        break L15;
                      } else {
                        if (this.a(((ee) this).field_z, (byte) -26, 0, param0, param2, 1280, ((ee) this).field_r + 3)) {
                          var9 = new je(6, -param4, ((ee) this).field_r + 50);
                          var9.field_p = true;
                          param0.field_B.a(3, (ck) (Object) var9);
                          if (var10 == 0) {
                            break L11;
                          } else {
                            break L15;
                          }
                        } else {
                          break L11;
                        }
                      }
                    }
                    var9 = new je(6, -param4, ((ee) this).field_r - -25);
                    var9.field_p = true;
                    param0.field_B.a(3, (ck) (Object) var9);
                    if (var10 == 0) {
                      break L11;
                    } else {
                      break L14;
                    }
                  }
                }
                if (!this.a(((ee) this).field_z, (byte) -30, 0, param0, param2, 1280, ((ee) this).field_r - -3)) {
                  break L11;
                } else {
                  var9 = new je(6, -param4, ((ee) this).field_r - -50);
                  var9.field_p = true;
                  param0.field_B.a(3, (ck) (Object) var9);
                  if (var10 == 0) {
                    break L11;
                  } else {
                    break L12;
                  }
                }
              }
              boolean discarded$1 = this.a(((ee) this).field_z, (byte) -87, 2, param0, param2, 2600, ((ee) this).field_r + 15);
              var9 = new je(6, -param4, 30 + ((ee) this).field_r);
              var9.field_p = true;
              param0.field_B.a(3, (ck) (Object) var9);
              break L11;
            }
            L16: {
              if (var6 == null) {
                break L16;
              } else {
                if (param0.field_Tb > 0) {
                  param0.field_B.a(3, (ck) var6);
                  break L16;
                } else {
                  break L16;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
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
              break L17;
            } else {
              stackOut_75_0 = stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "{...}";
              stackIn_78_0 = stackOut_75_0;
              stackIn_78_1 = stackOut_75_1;
              stackIn_78_2 = stackOut_75_2;
              break L17;
            }
          }
          L18: {
            stackOut_78_0 = stackIn_78_0;
            stackOut_78_1 = ((StringBuilder) (Object) stackIn_78_1).append(stackIn_78_2).append(',').append(param1).append(',');
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
              break L18;
            } else {
              stackOut_79_0 = stackIn_79_0;
              stackOut_79_1 = (StringBuilder) (Object) stackIn_79_1;
              stackOut_79_2 = "{...}";
              stackIn_82_0 = stackOut_79_0;
              stackIn_82_1 = stackOut_79_1;
              stackIn_82_2 = stackOut_79_2;
              break L18;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_82_0, stackIn_82_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final int a(boolean param0, int param1) {
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                boolean discarded$2 = this.a(-35, (byte) 87, -74, (mb) null, (mb) null, -128, 75);
                break L1;
              }
            }
            var3 = new int[]{0, 6, 12, 18, 23, 29, fg.field_Xb.length};
            var4 = var3[param1] + ((ee) this).field_D.a(115, var3[1 + param1] + -var3[param1]);
            stackOut_3_0 = fg.field_Xb[var4];
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var3_ref, "ee.GA(" + param0 + ',' + param1 + ')');
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
        int stackIn_126_0 = 0;
        RuntimeException stackIn_128_0 = null;
        StringBuilder stackIn_128_1 = null;
        RuntimeException stackIn_130_0 = null;
        StringBuilder stackIn_130_1 = null;
        RuntimeException stackIn_131_0 = null;
        StringBuilder stackIn_131_1 = null;
        String stackIn_131_2 = null;
        RuntimeException stackIn_132_0 = null;
        StringBuilder stackIn_132_1 = null;
        RuntimeException stackIn_134_0 = null;
        StringBuilder stackIn_134_1 = null;
        RuntimeException stackIn_135_0 = null;
        StringBuilder stackIn_135_1 = null;
        String stackIn_135_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_125_0 = 0;
        RuntimeException stackOut_127_0 = null;
        StringBuilder stackOut_127_1 = null;
        RuntimeException stackOut_130_0 = null;
        StringBuilder stackOut_130_1 = null;
        String stackOut_130_2 = null;
        RuntimeException stackOut_128_0 = null;
        StringBuilder stackOut_128_1 = null;
        String stackOut_128_2 = null;
        RuntimeException stackOut_131_0 = null;
        StringBuilder stackOut_131_1 = null;
        RuntimeException stackOut_134_0 = null;
        StringBuilder stackOut_134_1 = null;
        String stackOut_134_2 = null;
        RuntimeException stackOut_132_0 = null;
        StringBuilder stackOut_132_1 = null;
        String stackOut_132_2 = null;
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
                  L6: {
                    var8 = new je(3, 0, 10 + ((ee) this).field_r);
                    var8.field_u = (((ee) this).field_r * 77 % (((ee) this).field_ab.a(-123) / 4) - ((ee) this).field_ab.a(1) / 8 << 4) + param0.field_hc;
                    var9 = 5000;
                    var10 = 1;
                    if (var7_int != 0) {
                      break L6;
                    } else {
                      L7: {
                        L8: {
                          if (param4.field_Xb.length != 0) {
                            break L8;
                          } else {
                            if (param4.field_Xb[0] == 1) {
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                        L9: {
                          if (~var8.field_u <= ~(param4.field_hc - var9)) {
                            break L9;
                          } else {
                            var8.field_u = -var9 + param4.field_hc;
                            break L9;
                          }
                        }
                        L10: {
                          var8.field_y = -30000 + param0.field_Gb;
                          if (~var8.field_u >= ~(param4.field_hc - -var9)) {
                            break L10;
                          } else {
                            var8.field_u = var9 + param4.field_hc;
                            break L10;
                          }
                        }
                        if (Math.abs(param1) <= 80000) {
                          break L5;
                        } else {
                          var10 = 0;
                          if (var16 == 0) {
                            break L5;
                          } else {
                            break L7;
                          }
                        }
                      }
                      L11: {
                        L12: {
                          var9 = 100000;
                          if (param4.field_hc >= param0.field_hc) {
                            break L12;
                          } else {
                            L13: {
                              if (var8.field_u <= param0.field_hc - var9) {
                                break L13;
                              } else {
                                var8.field_u = param0.field_hc + -var9;
                                break L13;
                              }
                            }
                            if (var8.field_u < 0) {
                              var8.field_u = param0.field_hc - -var9;
                              if (var16 == 0) {
                                break L11;
                              } else {
                                break L12;
                              }
                            } else {
                              break L11;
                            }
                          }
                        }
                        L14: {
                          if (~var8.field_u <= ~(var9 + param0.field_hc)) {
                            break L14;
                          } else {
                            var8.field_u = param0.field_hc + var9;
                            break L14;
                          }
                        }
                        if (var8.field_u <= ((ee) this).field_ab.a(param2 ^ 68) << 4) {
                          break L11;
                        } else {
                          var8.field_u = param0.field_hc + -var9;
                          break L11;
                        }
                      }
                      var8.field_y = -60000;
                      if (var16 == 0) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  L15: {
                    L16: {
                      var9 = 50000;
                      if (~param4.field_hc > ~param0.field_hc) {
                        break L16;
                      } else {
                        L17: {
                          if (param0.field_hc - -var9 > var8.field_u) {
                            var8.field_u = param0.field_hc - -var9;
                            break L17;
                          } else {
                            break L17;
                          }
                        }
                        if (var8.field_u <= ((ee) this).field_ab.a(29) << 4) {
                          break L15;
                        } else {
                          var8.field_u = param0.field_hc - var9;
                          if (var16 == 0) {
                            break L15;
                          } else {
                            break L16;
                          }
                        }
                      }
                    }
                    L18: {
                      if (var8.field_u <= -var9 + param0.field_hc) {
                        break L18;
                      } else {
                        var8.field_u = param0.field_hc + -var9;
                        break L18;
                      }
                    }
                    if (var8.field_u >= 0) {
                      break L15;
                    } else {
                      var8.field_u = var9 + param0.field_hc;
                      break L15;
                    }
                  }
                  var8.field_y = -60000;
                  break L5;
                }
                L19: {
                  if (!((ee) this).field_fb) {
                    break L19;
                  } else {
                    if (((ee) this).field_j) {
                      var8.field_y = -5000 + param4.field_Gb;
                      if (-199000 <= param4.field_Gb) {
                        break L19;
                      } else {
                        param4.field_Hb = true;
                        param4.b(param2 ^ -60);
                        System.out.println(param4.field_Bb + " unlinked");
                        break L19;
                      }
                    } else {
                      break L19;
                    }
                  }
                }
                L20: {
                  L21: {
                    var8.field_p = true;
                    param4.field_B.a(3, (ck) (Object) var8);
                    param4.field_Tb = param4.field_x;
                    if (param4.field_Xb.length > 0) {
                      break L21;
                    } else {
                      var10 = 0;
                      if (var16 == 0) {
                        break L20;
                      } else {
                        break L21;
                      }
                    }
                  }
                  var8 = new je(0, param4.field_Xb[0], ((ee) this).field_r - -20);
                  break L20;
                }
                if (var10 != 0) {
                  L22: {
                    if (param4.field_Xb[0] == 1) {
                      break L22;
                    } else {
                      var11_double = Math.atan2((double)param1, (double)(-param3));
                      var8.field_B = (int)(65536.0 * var11_double / 6.283185307179586);
                      var13_ref_nk__ = param4.field_Zb.a(0, param4, new nk[0], var8.field_B * param5, param4.field_Xb[0]);
                      param4.field_Zb.b((byte) -128, 0, param5, 0);
                      var14 = 0;
                      var15 = 0;
                      L23: while (true) {
                        L24: {
                          L25: {
                            L26: {
                              if (~var13_ref_nk__.length >= ~var15) {
                                break L26;
                              } else {
                                var14 = var14 + var13_ref_nk__[var15].field_V;
                                var15++;
                                if (var16 != 0) {
                                  break L25;
                                } else {
                                  if (var16 == 0) {
                                    continue L23;
                                  } else {
                                    break L26;
                                  }
                                }
                              }
                            }
                            if (var13_ref_nk__.length > 0) {
                              break L25;
                            } else {
                              break L24;
                            }
                          }
                          param3 = param3 - var14 / var13_ref_nk__.length;
                          break L24;
                        }
                        L27: {
                          L28: {
                            var11_double = Math.atan2((double)param1, (double)(-param3));
                            var8.field_B = (int)(var11_double * 65536.0 / 6.283185307179586);
                            var8.field_u = param0.field_hc;
                            var8.field_y = param0.field_Gb;
                            if (0 > param5) {
                              break L28;
                            } else {
                              if (var8.field_B < -16384) {
                                var8.field_B = var8.field_B + 65536;
                                if (var16 == 0) {
                                  break L27;
                                } else {
                                  break L28;
                                }
                              } else {
                                break L27;
                              }
                            }
                          }
                          if (var8.field_B <= 16384) {
                            break L27;
                          } else {
                            var8.field_B = var8.field_B - 65536;
                            break L27;
                          }
                        }
                        var8.field_p = true;
                        param4.field_B.a(param2 ^ -61, (ck) (Object) var8);
                        if (var16 == 0) {
                          break L3;
                        } else {
                          break L22;
                        }
                      }
                    }
                  }
                  var8 = new je(0, param4.field_Xb[1], (((ee) this).field_r - -param0.field_hc - -param4.field_hc) % 50 + ((ee) this).field_r + 29);
                  var8.field_y = param0.field_Gb;
                  var8.field_u = param0.field_hc;
                  var11 = 2500;
                  var12 = 0;
                  var13 = 8192;
                  var14 = 32768;
                  this.a(param5, param3, param1, var11, var13, var8, var12, var14, -1);
                  var8.field_p = true;
                  param4.field_B.a(3, (ck) (Object) var8);
                  break L3;
                } else {
                  break L3;
                }
              } else {
                break L3;
              }
            }
            L29: {
              if (param2 == -64) {
                break L29;
              } else {
                ((ee) this).field_c = -58;
                break L29;
              }
            }
            stackOut_125_0 = param3;
            stackIn_126_0 = stackOut_125_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L30: {
            var7 = decompiledCaughtException;
            stackOut_127_0 = (RuntimeException) var7;
            stackOut_127_1 = new StringBuilder().append("ee.T(");
            stackIn_130_0 = stackOut_127_0;
            stackIn_130_1 = stackOut_127_1;
            stackIn_128_0 = stackOut_127_0;
            stackIn_128_1 = stackOut_127_1;
            if (param0 == null) {
              stackOut_130_0 = (RuntimeException) (Object) stackIn_130_0;
              stackOut_130_1 = (StringBuilder) (Object) stackIn_130_1;
              stackOut_130_2 = "null";
              stackIn_131_0 = stackOut_130_0;
              stackIn_131_1 = stackOut_130_1;
              stackIn_131_2 = stackOut_130_2;
              break L30;
            } else {
              stackOut_128_0 = (RuntimeException) (Object) stackIn_128_0;
              stackOut_128_1 = (StringBuilder) (Object) stackIn_128_1;
              stackOut_128_2 = "{...}";
              stackIn_131_0 = stackOut_128_0;
              stackIn_131_1 = stackOut_128_1;
              stackIn_131_2 = stackOut_128_2;
              break L30;
            }
          }
          L31: {
            stackOut_131_0 = (RuntimeException) (Object) stackIn_131_0;
            stackOut_131_1 = ((StringBuilder) (Object) stackIn_131_1).append(stackIn_131_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_134_0 = stackOut_131_0;
            stackIn_134_1 = stackOut_131_1;
            stackIn_132_0 = stackOut_131_0;
            stackIn_132_1 = stackOut_131_1;
            if (param4 == null) {
              stackOut_134_0 = (RuntimeException) (Object) stackIn_134_0;
              stackOut_134_1 = (StringBuilder) (Object) stackIn_134_1;
              stackOut_134_2 = "null";
              stackIn_135_0 = stackOut_134_0;
              stackIn_135_1 = stackOut_134_1;
              stackIn_135_2 = stackOut_134_2;
              break L31;
            } else {
              stackOut_132_0 = (RuntimeException) (Object) stackIn_132_0;
              stackOut_132_1 = (StringBuilder) (Object) stackIn_132_1;
              stackOut_132_2 = "{...}";
              stackIn_135_0 = stackOut_132_0;
              stackIn_135_1 = stackOut_132_1;
              stackIn_135_2 = stackOut_132_2;
              break L31;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_135_0, stackIn_135_2 + ',' + param5 + ')');
        }
        return stackIn_126_0;
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
            L1: {
              var7_int = 1;
              var8 = 0;
              if (param2 == 21) {
                break L1;
              } else {
                int discarded$4 = ((ee) this).b(false);
                break L1;
              }
            }
            if (var7_int != 0) {
              L2: {
                L3: {
                  if (param4.field_Xb[4] != 19) {
                    break L3;
                  } else {
                    if (param4.field_u) {
                      break L2;
                    } else {
                      boolean discarded$5 = this.a(((ee) this).field_z / 2, (byte) -76, 4, param4, param3, 2600, ((ee) this).field_r + 5);
                      if (var10 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param4.field_u) {
                  break L2;
                } else {
                  boolean discarded$6 = this.a(((ee) this).field_z, (byte) -85, 4, param4, param3, 2600, 5 + ((ee) this).field_r);
                  break L2;
                }
              }
              L4: {
                L5: {
                  if (var8 != 0) {
                    break L5;
                  } else {
                    if (!this.a(((ee) this).field_z, (byte) -36, 2, param4, param3, 2304, 25 + ((ee) this).field_r)) {
                      break L5;
                    } else {
                      if (param4.field_t != 0) {
                        break L4;
                      } else {
                        if (30000 > Math.abs(param5)) {
                          break L4;
                        } else {
                          var9 = new je(6, param1, ((ee) this).field_r + 27);
                          var9.field_p = true;
                          param4.field_B.a(3, (ck) (Object) var9);
                          if (var10 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                  }
                }
                L6: {
                  L7: {
                    if (60000 < Math.abs(param5)) {
                      break L7;
                    } else {
                      if (param4.field_U == 0) {
                        break L7;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var9 = new je(6, param1, ((ee) this).field_r + 2);
                  var9.field_p = true;
                  param4.field_B.a(3, (ck) (Object) var9);
                  break L6;
                }
                if (Math.abs(param5) < 100000) {
                  boolean discarded$7 = this.a(0, (byte) -80, 0, param4, param3, 2304, 25 + ((ee) this).field_r);
                  break L4;
                } else {
                  break L4;
                }
              }
              L8: {
                L9: {
                  if (param4.field_t <= 0) {
                    break L9;
                  } else {
                    L10: {
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
                        break L10;
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
                        break L10;
                      }
                    }
                    var9 = new je(stackIn_49_2, stackIn_49_3, 2 + ((ee) this).field_r);
                    var9.field_p = true;
                    param4.field_B.a(param2 ^ 22, (ck) (Object) var9);
                    if (var10 == 0) {
                      break L8;
                    } else {
                      break L9;
                    }
                  }
                }
                if (Math.abs(param5) < 30000) {
                  var9 = new je(6, -param1, ((ee) this).field_r + 29);
                  var9.field_p = true;
                  param4.field_B.a(3, (ck) (Object) var9);
                  break L8;
                } else {
                  break L8;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var7 = decompiledCaughtException;
            stackOut_57_0 = (RuntimeException) var7;
            stackOut_57_1 = new StringBuilder().append("ee.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
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
              break L11;
            } else {
              stackOut_58_0 = (RuntimeException) (Object) stackIn_58_0;
              stackOut_58_1 = (StringBuilder) (Object) stackIn_58_1;
              stackOut_58_2 = "{...}";
              stackIn_61_0 = stackOut_58_0;
              stackIn_61_1 = stackOut_58_1;
              stackIn_61_2 = stackOut_58_2;
              break L11;
            }
          }
          L12: {
            stackOut_61_0 = (RuntimeException) (Object) stackIn_61_0;
            stackOut_61_1 = ((StringBuilder) (Object) stackIn_61_1).append(stackIn_61_2).append(',');
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
              break L12;
            } else {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "{...}";
              stackIn_65_0 = stackOut_62_0;
              stackIn_65_1 = stackOut_62_1;
              stackIn_65_2 = stackOut_62_2;
              break L12;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_65_0, stackIn_65_2 + ',' + param5 + ')');
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
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        mb stackIn_69_0 = null;
        mb stackIn_70_0 = null;
        mb stackIn_72_0 = null;
        mb stackIn_73_0 = null;
        mb stackIn_75_0 = null;
        mb stackIn_76_0 = null;
        mb stackIn_78_0 = null;
        mb stackIn_79_0 = null;
        mb stackIn_81_0 = null;
        mb stackIn_83_0 = null;
        mb stackIn_84_0 = null;
        int stackIn_84_1 = 0;
        int stackIn_101_0 = 0;
        int stackIn_101_1 = 0;
        RuntimeException stackIn_126_0 = null;
        StringBuilder stackIn_126_1 = null;
        RuntimeException stackIn_128_0 = null;
        StringBuilder stackIn_128_1 = null;
        RuntimeException stackIn_129_0 = null;
        StringBuilder stackIn_129_1 = null;
        String stackIn_129_2 = null;
        RuntimeException stackIn_130_0 = null;
        StringBuilder stackIn_130_1 = null;
        RuntimeException stackIn_132_0 = null;
        StringBuilder stackIn_132_1 = null;
        RuntimeException stackIn_133_0 = null;
        StringBuilder stackIn_133_1 = null;
        String stackIn_133_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        mb stackOut_68_0 = null;
        mb stackOut_69_0 = null;
        mb stackOut_70_0 = null;
        mb stackOut_72_0 = null;
        mb stackOut_73_0 = null;
        mb stackOut_75_0 = null;
        mb stackOut_76_0 = null;
        mb stackOut_78_0 = null;
        mb stackOut_79_0 = null;
        mb stackOut_81_0 = null;
        int stackOut_81_1 = 0;
        mb stackOut_83_0 = null;
        int stackOut_83_1 = 0;
        int stackOut_100_0 = 0;
        int stackOut_100_1 = 0;
        RuntimeException stackOut_125_0 = null;
        StringBuilder stackOut_125_1 = null;
        RuntimeException stackOut_128_0 = null;
        StringBuilder stackOut_128_1 = null;
        String stackOut_128_2 = null;
        RuntimeException stackOut_126_0 = null;
        StringBuilder stackOut_126_1 = null;
        String stackOut_126_2 = null;
        RuntimeException stackOut_129_0 = null;
        StringBuilder stackOut_129_1 = null;
        RuntimeException stackOut_132_0 = null;
        StringBuilder stackOut_132_1 = null;
        String stackOut_132_2 = null;
        RuntimeException stackOut_130_0 = null;
        StringBuilder stackOut_130_1 = null;
        String stackOut_130_2 = null;
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
              L4: {
                L5: {
                  if (~var13_int <= ~(param6 + ((ee) this).field_kb)) {
                    break L5;
                  } else {
                    var11_ref = new mb((((ee) this).field_ab.a(-119) << 4) * (var13_int - -1) / (((ee) this).field_kb - (-1 - param6)), -320000, (ee) this);
                    var14 = var13_int;
                    stackOut_10_0 = -1;
                    stackOut_10_1 = ~param6;
                    stackIn_101_0 = stackOut_10_0;
                    stackIn_101_1 = stackOut_10_1;
                    stackIn_11_0 = stackOut_10_0;
                    stackIn_11_1 = stackOut_10_1;
                    if (var19 != 0) {
                      break L4;
                    } else {
                      L6: {
                        L7: {
                          if (stackIn_11_0 <= stackIn_11_1) {
                            break L7;
                          } else {
                            L8: {
                              L9: {
                                if (((ee) this).field_kb / 2 > var13_int) {
                                  break L9;
                                } else {
                                  if (var13_int < param6 + ((ee) this).field_kb / 2) {
                                    break L8;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              L10: {
                                if (var13_int >= param6 + ((ee) this).field_kb / 2) {
                                  break L10;
                                } else {
                                  var14 = -var14 + ((ee) this).field_kb + -1;
                                  if (var19 == 0) {
                                    break L6;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              var14 = var14 - param6;
                              var14 = -var14 + -1 + ((ee) this).field_kb;
                              if (var19 == 0) {
                                break L6;
                              } else {
                                break L8;
                              }
                            }
                            var14 = ((ee) this).field_kb - (((ee) this).field_kb / 2 + -var13_int);
                            if (var19 == 0) {
                              break L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                        var14 = ((ee) this).field_kb - (1 - -var14);
                        break L6;
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
                        L15: {
                          if (~var14 > ~((ee) this).field_kb) {
                            break L15;
                          } else {
                            L16: {
                              var16 = 0;
                              var17 = 3;
                              if (((ee) this).field_F < 1) {
                                break L16;
                              } else {
                                var17 = 6;
                                break L16;
                              }
                            }
                            L17: {
                              if (((ee) this).field_F < 2) {
                                break L17;
                              } else {
                                var16 = 3;
                                var17 = 9;
                                break L17;
                              }
                            }
                            var18 = var16 + ((ee) this).field_D.a(-126, -var16 + var17);
                            var11_ref.a(var12[var18], true, false, var14, var15);
                            var11_ref.field_Nb = 11;
                            ((ee) this).field_K.a(3, (ck) (Object) var11_ref);
                            if (var19 == 0) {
                              break L14;
                            } else {
                              break L15;
                            }
                          }
                        }
                        if (param3[var14] == null) {
                          break L14;
                        } else {
                          L18: {
                            if (0 == ((ee) this).field_F) {
                              L19: {
                                L20: {
                                  L21: {
                                    L22: {
                                      L23: {
                                        var16 = -1;
                                        var17 = param3[var14][0];
                                        if (var17 != 0) {
                                          break L23;
                                        } else {
                                          if (var19 == 0) {
                                            var16 = 0;
                                            if (var19 == 0) {
                                              break L19;
                                            } else {
                                              break L22;
                                            }
                                          } else {
                                            break L23;
                                          }
                                        }
                                      }
                                      if (var17 == 55) {
                                        break L22;
                                      } else {
                                        if (var17 == 57) {
                                          break L21;
                                        } else {
                                          break L20;
                                        }
                                      }
                                    }
                                    var16 = 1;
                                    if (var19 == 0) {
                                      break L19;
                                    } else {
                                      break L21;
                                    }
                                  }
                                  var16 = 2;
                                  if (var19 == 0) {
                                    break L19;
                                  } else {
                                    break L20;
                                  }
                                }
                                var16 = 1;
                                break L19;
                              }
                              param3[var14] = var12[var16];
                              break L18;
                            } else {
                              break L18;
                            }
                          }
                          L24: {
                            L25: {
                              stackOut_68_0 = (mb) var11_ref;
                              stackIn_83_0 = stackOut_68_0;
                              stackIn_69_0 = stackOut_68_0;
                              if (null == ((ee) this).field_bb) {
                                break L25;
                              } else {
                                stackOut_69_0 = (mb) (Object) stackIn_69_0;
                                stackIn_83_0 = stackOut_69_0;
                                stackIn_70_0 = stackOut_69_0;
                                if (var14 < 0) {
                                  break L25;
                                } else {
                                  stackOut_70_0 = (mb) (Object) stackIn_70_0;
                                  stackIn_72_0 = stackOut_70_0;
                                  stackOut_72_0 = (mb) (Object) stackIn_72_0;
                                  stackIn_83_0 = stackOut_72_0;
                                  stackIn_73_0 = stackOut_72_0;
                                  if (((ee) this).field_bb.length <= var14) {
                                    break L25;
                                  } else {
                                    stackOut_73_0 = (mb) (Object) stackIn_73_0;
                                    stackIn_75_0 = stackOut_73_0;
                                    stackOut_75_0 = (mb) (Object) stackIn_75_0;
                                    stackIn_83_0 = stackOut_75_0;
                                    stackIn_76_0 = stackOut_75_0;
                                    if (null == ((ee) this).field_bb[var14]) {
                                      break L25;
                                    } else {
                                      stackOut_76_0 = (mb) (Object) stackIn_76_0;
                                      stackIn_78_0 = stackOut_76_0;
                                      stackOut_78_0 = (mb) (Object) stackIn_78_0;
                                      stackIn_83_0 = stackOut_78_0;
                                      stackIn_79_0 = stackOut_78_0;
                                      if (!((ee) this).field_bb[var14].toLowerCase().startsWith("mod")) {
                                        break L25;
                                      } else {
                                        stackOut_79_0 = (mb) (Object) stackIn_79_0;
                                        stackIn_81_0 = stackOut_79_0;
                                        stackOut_81_0 = (mb) (Object) stackIn_81_0;
                                        stackOut_81_1 = 1;
                                        stackIn_84_0 = stackOut_81_0;
                                        stackIn_84_1 = stackOut_81_1;
                                        break L24;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_83_0 = (mb) (Object) stackIn_83_0;
                            stackOut_83_1 = 0;
                            stackIn_84_0 = stackOut_83_0;
                            stackIn_84_1 = stackOut_83_1;
                            break L24;
                          }
                          L26: {
                            stackIn_84_0.field_ib = stackIn_84_1 != 0;
                            var11_ref.a(param3[var14], true, false, var14, var15);
                            if (((ee) this).field_F == 1) {
                              if (6100 < hm.a((byte) 126, var11_ref.field_nb, var11_ref.field_Zb)) {
                                var11_ref.a(ua.field_x, true, false, var14, var15);
                                break L26;
                              } else {
                                break L26;
                              }
                            } else {
                              break L26;
                            }
                          }
                          L27: {
                            if (((ee) this).field_U == null) {
                              break L27;
                            } else {
                              ((ee) this).field_U.a(0, (byte) 123, var14, Integer.toString(var11_ref.field_lb));
                              break L27;
                            }
                          }
                          ((ee) this).field_K.a((ck) (Object) var11_ref, -21459);
                          break L14;
                        }
                      }
                      L28: {
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
                          break L28;
                        } else {
                          break L28;
                        }
                      }
                      var11_ref.d(-28033);
                      ((ee) this).field_Z[var13_int] = 50;
                      var13_int++;
                      if (var19 == 0) {
                        continue L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                ((ee) this).field_z = 4;
                stackOut_100_0 = ((ee) this).field_ab.b(109);
                stackOut_100_1 = 4;
                stackIn_101_0 = stackOut_100_0;
                stackIn_101_1 = stackOut_100_1;
                break L4;
              }
              L29: {
                if (stackIn_101_0 != stackIn_101_1) {
                  break L29;
                } else {
                  ((ee) this).field_z = 2;
                  break L29;
                }
              }
              L30: {
                if (((ee) this).field_ab.b(98) != 3) {
                  break L30;
                } else {
                  ((ee) this).field_z = 3;
                  break L30;
                }
              }
              L31: {
                L32: {
                  ((ee) this).field_C = new ul();
                  ((ee) this).field_u = new ul();
                  ((ee) this).field_db = new ul();
                  ((ee) this).field_T = new ul();
                  if (!((ee) this).field_h) {
                    break L32;
                  } else {
                    ((ee) this).field_O = null;
                    ((ee) this).field_o = null;
                    if (var19 == 0) {
                      break L31;
                    } else {
                      break L32;
                    }
                  }
                }
                ((ee) this).field_o = new ul();
                ((ee) this).field_O = new ul();
                break L31;
              }
              L33: {
                ((ee) this).field_e = new ul();
                ((ee) this).field_J = new ra();
                ((ee) this).field_cb = -1;
                if (((ee) this).field_lb) {
                  ((ee) this).field_d = 100000;
                  ((ee) this).field_M = 3;
                  ((ee) this).field_gb = 0;
                  break L33;
                } else {
                  break L33;
                }
              }
              L34: {
                if (2 != ((ee) this).field_ab.b(72)) {
                  break L34;
                } else {
                  if (((ee) this).field_kb > 1) {
                    var13 = new ne((ee) this, 43);
                    var13.field_z = (((ee) this).field_ab.a(-119) << 4) / 2;
                    ((ee) this).field_e.a(3, (ck) (Object) var13);
                    break L34;
                  } else {
                    break L34;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L35: {
            var11 = decompiledCaughtException;
            stackOut_125_0 = (RuntimeException) var11;
            stackOut_125_1 = new StringBuilder().append("ee.<init>(").append(param0).append(',').append(param1).append(',');
            stackIn_128_0 = stackOut_125_0;
            stackIn_128_1 = stackOut_125_1;
            stackIn_126_0 = stackOut_125_0;
            stackIn_126_1 = stackOut_125_1;
            if (param2 == null) {
              stackOut_128_0 = (RuntimeException) (Object) stackIn_128_0;
              stackOut_128_1 = (StringBuilder) (Object) stackIn_128_1;
              stackOut_128_2 = "null";
              stackIn_129_0 = stackOut_128_0;
              stackIn_129_1 = stackOut_128_1;
              stackIn_129_2 = stackOut_128_2;
              break L35;
            } else {
              stackOut_126_0 = (RuntimeException) (Object) stackIn_126_0;
              stackOut_126_1 = (StringBuilder) (Object) stackIn_126_1;
              stackOut_126_2 = "{...}";
              stackIn_129_0 = stackOut_126_0;
              stackIn_129_1 = stackOut_126_1;
              stackIn_129_2 = stackOut_126_2;
              break L35;
            }
          }
          L36: {
            stackOut_129_0 = (RuntimeException) (Object) stackIn_129_0;
            stackOut_129_1 = ((StringBuilder) (Object) stackIn_129_1).append(stackIn_129_2).append(',');
            stackIn_132_0 = stackOut_129_0;
            stackIn_132_1 = stackOut_129_1;
            stackIn_130_0 = stackOut_129_0;
            stackIn_130_1 = stackOut_129_1;
            if (param3 == null) {
              stackOut_132_0 = (RuntimeException) (Object) stackIn_132_0;
              stackOut_132_1 = (StringBuilder) (Object) stackIn_132_1;
              stackOut_132_2 = "null";
              stackIn_133_0 = stackOut_132_0;
              stackIn_133_1 = stackOut_132_1;
              stackIn_133_2 = stackOut_132_2;
              break L36;
            } else {
              stackOut_130_0 = (RuntimeException) (Object) stackIn_130_0;
              stackOut_130_1 = (StringBuilder) (Object) stackIn_130_1;
              stackOut_130_2 = "{...}";
              stackIn_133_0 = stackOut_130_0;
              stackIn_133_1 = stackOut_130_1;
              stackIn_133_2 = stackOut_130_2;
              break L36;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_133_0, stackIn_133_2 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
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
