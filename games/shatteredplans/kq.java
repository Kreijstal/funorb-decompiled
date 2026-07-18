/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;
import java.applet.Applet;

final class kq {
    private qh field_nb;
    private jh field_S;
    private int field_b;
    private jh field_g;
    private jh field_bb;
    private qh field_j;
    private String field_P;
    private int field_x;
    private jh field_N;
    private jh field_db;
    private os field_k;
    private String[] field_ab;
    private os field_F;
    private int field_D;
    private ub field_E;
    private int[][] field_G;
    private int field_u;
    private os field_M;
    private int[][] field_q;
    static bi field_R;
    private boolean field_Y;
    private os field_V;
    private boolean field_I;
    private qh field_J;
    static String field_L;
    private qr field_O;
    private jh field_a;
    private int field_w;
    private qh field_cb;
    private bi field_T;
    private boolean field_v;
    private qh field_e;
    private String[][] field_l;
    private os field_m;
    private os field_lb;
    private int[][] field_C;
    static qr field_h;
    private String field_r;
    private int field_U;
    private int field_fb;
    private int field_jb;
    private int[] field_p;
    private int[][] field_Z;
    private pf field_B;
    private int[] field_ob;
    private boolean field_ib;
    jh field_X;
    jh field_d;
    private jh field_mb;
    private os field_K;
    private bi field_eb;
    private boolean[] field_z;
    private jh field_f;
    private int field_H;
    private jh field_gb;
    private km field_s;
    private String field_o;
    private int field_kb;
    private jh field_n;
    static String field_i;
    static jo field_A;
    private pf field_y;
    private jh field_W;
    private int field_Q;
    private jh field_hb;
    private om field_t;
    static int[] field_c;

    final void a(int param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        em var3_ref = null;
        ad var3_ref2 = null;
        int var4 = 0;
        jh var5 = null;
        qk var6 = null;
        sd var7 = null;
        String var8 = null;
        int var9 = 0;
        boolean stackIn_10_0 = false;
        StringBuilder stackIn_18_0 = null;
        StringBuilder stackIn_20_0 = null;
        StringBuilder stackIn_22_0 = null;
        StringBuilder stackIn_23_0 = null;
        String stackIn_23_1 = null;
        int stackIn_27_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_9_0 = false;
        StringBuilder stackOut_17_0 = null;
        StringBuilder stackOut_22_0 = null;
        String stackOut_22_1 = null;
        StringBuilder stackOut_18_0 = null;
        StringBuilder stackOut_20_0 = null;
        String stackOut_20_1 = null;
        int stackOut_26_0 = 0;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (((kq) this).field_s.field_m != 2) {
                  break L2;
                } else {
                  if (param1 != 2) {
                    var3_ref = (em) (Object) ((kq) this).field_e.field_x;
                    var4 = 0;
                    L3: while (true) {
                      if (~var3_ref.field_d.length >= ~var4) {
                        break L2;
                      } else {
                        var5 = var3_ref.field_d[var4];
                        var6 = var3_ref.field_i[var4];
                        var7 = (sd) var5.field_h;
                        stackOut_9_0 = var5.f(244874369);
                        stackIn_27_0 = stackOut_9_0 ? 1 : 0;
                        stackIn_10_0 = stackOut_9_0;
                        if (var9 != 0) {
                          break L1;
                        } else {
                          L4: {
                            if (!stackIn_10_0) {
                              break L4;
                            } else {
                              L5: {
                                L6: {
                                  var5.e((byte) 37);
                                  if (0 != var7.field_x) {
                                    break L6;
                                  } else {
                                    var8 = pe.field_F;
                                    if (var9 == 0) {
                                      break L5;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                                L7: {
                                  stackOut_17_0 = new StringBuilder().append(hd.field_j).append(" ");
                                  stackIn_22_0 = stackOut_17_0;
                                  stackIn_18_0 = stackOut_17_0;
                                  if (var7.field_x != 1) {
                                    stackOut_22_0 = (StringBuilder) (Object) stackIn_22_0;
                                    stackOut_22_1 = re.a(d.field_c, 4371, new String[1]);
                                    stackIn_23_0 = stackOut_22_0;
                                    stackIn_23_1 = stackOut_22_1;
                                    break L7;
                                  } else {
                                    stackOut_18_0 = (StringBuilder) (Object) stackIn_18_0;
                                    stackIn_20_0 = stackOut_18_0;
                                    stackOut_20_0 = (StringBuilder) (Object) stackIn_20_0;
                                    stackOut_20_1 = ad.field_a;
                                    stackIn_23_0 = stackOut_20_0;
                                    stackIn_23_1 = stackOut_20_1;
                                    break L7;
                                  }
                                }
                                var8 = stackIn_23_1;
                                break L5;
                              }
                              var6.field_o = var8;
                              var5.field_o = var8;
                              break L4;
                            }
                          }
                          var4++;
                          if (var9 == 0) {
                            continue L3;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  } else {
                    break L2;
                  }
                }
              }
              ((kq) this).field_s.field_m = param1;
              stackOut_26_0 = 0;
              stackIn_27_0 = stackOut_26_0;
              break L1;
            }
            var3_int = stackIn_27_0;
            L8: while (true) {
              L9: {
                L10: {
                  if (~var3_int <= ~((kq) this).field_s.field_z.field_z.length) {
                    break L10;
                  } else {
                    ((kq) this).field_s.field_z.field_z[var3_int] = 0;
                    var3_int++;
                    if (var9 != 0) {
                      break L9;
                    } else {
                      if (var9 == 0) {
                        continue L8;
                      } else {
                        break L10;
                      }
                    }
                  }
                }
                if (param0 <= -70) {
                  break L9;
                } else {
                  ((kq) this).field_P = null;
                  break L9;
                }
              }
              L11: {
                var3_ref2 = (ad) (Object) ((kq) this).field_k.field_v;
                var3_ref2.field_e.a(-2948, (bi) null);
                if (((kq) this).field_s.field_z.field_T != -1) {
                  break L11;
                } else {
                  if (!((kq) this).field_s.field_L) {
                    L12: {
                      L13: {
                        L14: {
                          L15: {
                            L16: {
                              L17: {
                                L18: {
                                  L19: {
                                    L20: {
                                      L21: {
                                        var4 = param1;
                                        if (var4 != 0) {
                                          break L21;
                                        } else {
                                          if (var9 == 0) {
                                            break L20;
                                          } else {
                                            break L21;
                                          }
                                        }
                                      }
                                      if (var4 == 1) {
                                        break L19;
                                      } else {
                                        if (var4 == 2) {
                                          break L18;
                                        } else {
                                          if (var4 == 3) {
                                            break L17;
                                          } else {
                                            L22: {
                                              if (4 != var4) {
                                                break L22;
                                              } else {
                                                if (var9 == 0) {
                                                  break L16;
                                                } else {
                                                  break L22;
                                                }
                                              }
                                            }
                                            if (5 == var4) {
                                              break L15;
                                            } else {
                                              L23: {
                                                if (6 != var4) {
                                                  break L23;
                                                } else {
                                                  if (var9 == 0) {
                                                    break L14;
                                                  } else {
                                                    break L23;
                                                  }
                                                }
                                              }
                                              if (7 != var4) {
                                                break L12;
                                              } else {
                                                if (var9 == 0) {
                                                  break L13;
                                                } else {
                                                  break L20;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    ((kq) this).a(10, 0, ub.field_Bb);
                                    if (var9 == 0) {
                                      break L11;
                                    } else {
                                      break L19;
                                    }
                                  }
                                  ((kq) this).a(10, 0, gi.field_b);
                                  if (var9 == 0) {
                                    break L11;
                                  } else {
                                    break L18;
                                  }
                                }
                                ((kq) this).a(10, 0, re.a(wp.field_c, 4371, new String[2]));
                                if (var9 == 0) {
                                  break L11;
                                } else {
                                  break L17;
                                }
                              }
                              ((kq) this).a(10, 0, ol.field_l);
                              if (var9 == 0) {
                                break L11;
                              } else {
                                break L16;
                              }
                            }
                            ((kq) this).a(10, 0, mr.field_c);
                            if (var9 == 0) {
                              break L11;
                            } else {
                              break L15;
                            }
                          }
                          ((kq) this).a(10, 0, li.field_e);
                          if (var9 == 0) {
                            break L11;
                          } else {
                            break L14;
                          }
                        }
                        ((kq) this).a(10, 0, i.field_f);
                        if (var9 == 0) {
                          break L11;
                        } else {
                          break L13;
                        }
                      }
                      ((kq) this).a(10, 0, ml.field_k);
                      if (var9 == 0) {
                        break L11;
                      } else {
                        break L12;
                      }
                    }
                    ((kq) this).a(10, 0, (String) null);
                    break L11;
                  } else {
                    break L11;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var3, "kq.TA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void d(int param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        ln[] var3_array = null;
        int var4 = 0;
        ln var5 = null;
        ln[] var6 = null;
        int var7 = 0;
        ln var8 = null;
        int var9 = 0;
        fs stackIn_50_0 = null;
        fs stackIn_50_1 = null;
        fs stackIn_61_0 = null;
        fs stackIn_61_1 = null;
        RuntimeException decompiledCaughtException = null;
        fs stackOut_48_0 = null;
        fs stackOut_48_1 = null;
        fs stackOut_60_0 = null;
        fs stackOut_60_1 = null;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              ((kq) this).field_s.a(param0, 24);
              if (param1 == 4705) {
                break L1;
              } else {
                int[][] discarded$1 = this.j(59);
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  var3_int = param0;
                  if (var3_int == 0) {
                    break L4;
                  } else {
                    if (var3_int == 1) {
                      ((kq) this).a(-103, 4);
                      var3_array = ((kq) this).field_s.field_P.field_g.field_e;
                      var4 = 0;
                      L5: while (true) {
                        L6: {
                          if (~var3_array.length >= ~var4) {
                            break L6;
                          } else {
                            var5 = var3_array[var4];
                            if (var9 != 0) {
                              break L3;
                            } else {
                              L7: {
                                if (((kq) this).field_s.field_n != var5.field_y) {
                                  break L7;
                                } else {
                                  if (var5.field_L == 0) {
                                    ((kq) this).field_s.field_z.field_z[var5.field_p] = 2;
                                    break L7;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                              var4++;
                              if (var9 == 0) {
                                continue L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        break L3;
                      }
                    } else {
                      if (var3_int == 2) {
                        ((kq) this).a(param1 ^ -4613, 5);
                        var3_array = ((kq) this).field_s.field_P.field_g.field_e;
                        var4 = 0;
                        L8: while (true) {
                          L9: {
                            if (var4 >= var3_array.length) {
                              break L9;
                            } else {
                              var5 = var3_array[var4];
                              if (var9 != 0) {
                                break L3;
                              } else {
                                stackOut_48_0 = var5.field_y;
                                stackOut_48_1 = ((kq) this).field_s.field_n;
                                stackIn_50_0 = stackOut_48_0;
                                stackIn_50_1 = stackOut_48_1;
                                L10: while (true) {
                                  L11: {
                                    if (stackIn_50_0 == stackIn_50_1) {
                                      break L11;
                                    } else {
                                      L12: {
                                        if (null == var5.field_y) {
                                          break L12;
                                        } else {
                                          if (!((kq) this).field_s.field_n.field_h[var5.field_y.field_x]) {
                                            break L12;
                                          } else {
                                            if (var9 == 0) {
                                              break L11;
                                            } else {
                                              break L12;
                                            }
                                          }
                                        }
                                      }
                                      var6 = var5.field_D;
                                      var7 = 0;
                                      L13: while (true) {
                                        if (var6.length <= var7) {
                                          break L11;
                                        } else {
                                          var8 = var6[var7];
                                          stackOut_60_0 = ((kq) this).field_s.field_n;
                                          stackOut_60_1 = var8.field_y;
                                          stackIn_50_0 = stackOut_60_0;
                                          stackIn_50_1 = stackOut_60_1;
                                          stackIn_61_0 = stackOut_60_0;
                                          stackIn_61_1 = stackOut_60_1;
                                          if (var9 != 0) {
                                            continue L10;
                                          } else {
                                            L14: {
                                              if (stackIn_61_0 == stackIn_61_1) {
                                                ((kq) this).field_s.field_z.field_z[var5.field_p] = 2;
                                                if (var9 == 0) {
                                                  break L11;
                                                } else {
                                                  break L14;
                                                }
                                              } else {
                                                break L14;
                                              }
                                            }
                                            var7++;
                                            if (var9 == 0) {
                                              continue L13;
                                            } else {
                                              break L11;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  var4++;
                                  if (var9 == 0) {
                                    continue L8;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                            }
                          }
                          break L3;
                        }
                      } else {
                        if (var3_int != 3) {
                          break L3;
                        } else {
                          if (var9 == 0) {
                            ((kq) this).a(-111, 6);
                            var3_array = ((kq) this).field_s.field_P.field_g.field_e;
                            var4 = 0;
                            L15: while (true) {
                              if (~var4 <= ~var3_array.length) {
                                break L3;
                              } else {
                                var5 = var3_array[var4];
                                if (var9 != 0) {
                                  break L2;
                                } else {
                                  L16: {
                                    if (((kq) this).field_s.field_n == var5.field_y) {
                                      ((kq) this).field_s.field_z.field_z[var5.field_p] = 2;
                                      break L16;
                                    } else {
                                      break L16;
                                    }
                                  }
                                  var4++;
                                  if (var9 == 0) {
                                    continue L15;
                                  } else {
                                    break L3;
                                  }
                                }
                              }
                            }
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                }
                ((kq) this).a(param1 ^ -4629, 3);
                var3_array = ((kq) this).field_s.field_P.field_g.field_e;
                var4 = 0;
                L17: while (true) {
                  L18: {
                    if (~var4 <= ~var3_array.length) {
                      break L18;
                    } else {
                      var5 = var3_array[var4];
                      if (var9 != 0) {
                        break L3;
                      } else {
                        L19: {
                          if (var5.field_y != ((kq) this).field_s.field_n) {
                            break L19;
                          } else {
                            if (!var5.field_u) {
                              ((kq) this).field_s.field_z.field_z[var5.field_p] = 2;
                              break L19;
                            } else {
                              break L19;
                            }
                          }
                        }
                        var4++;
                        if (var9 == 0) {
                          continue L17;
                        } else {
                          break L18;
                        }
                      }
                    }
                  }
                  break L3;
                }
              }
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var3, "kq.GA(" + param0 + ',' + param1 + ')');
        }
    }

    final static void b(String param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        ln[] var2_array = null;
        String var2_ref = null;
        int var3 = 0;
        ln var4 = null;
        int var5 = 0;
        int stackIn_38_0 = 0;
        int stackIn_48_0 = 0;
        RuntimeException stackIn_118_0 = null;
        StringBuilder stackIn_118_1 = null;
        RuntimeException stackIn_120_0 = null;
        StringBuilder stackIn_120_1 = null;
        RuntimeException stackIn_121_0 = null;
        StringBuilder stackIn_121_1 = null;
        String stackIn_121_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_37_0 = 0;
        boolean stackOut_47_0 = false;
        RuntimeException stackOut_117_0 = null;
        StringBuilder stackOut_117_1 = null;
        RuntimeException stackOut_120_0 = null;
        StringBuilder stackOut_120_1 = null;
        String stackOut_120_2 = null;
        RuntimeException stackOut_118_0 = null;
        StringBuilder stackOut_118_1 = null;
        String stackOut_118_2 = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (!qj.a(true, (CharSequence) (Object) "stage", (CharSequence) (Object) param0)) {
              if (param1 == 7) {
                if (!param0.equalsIgnoreCase("zoomtohome")) {
                  if (param0.equalsIgnoreCase("closetohome")) {
                    oq.field_a.field_z.a(ho.field_d.field_m.field_q, 126);
                    return;
                  } else {
                    if (!param0.equalsIgnoreCase("zoomtowarning")) {
                      if (!param0.equalsIgnoreCase("zoomOut")) {
                        L1: {
                          if (param0.equalsIgnoreCase("zoom12")) {
                            oq.field_a.field_z.a(oq.field_a.field_P.field_g.field_e[12], 124);
                            break L1;
                          } else {
                            break L1;
                          }
                        }
                        L2: {
                          L3: {
                            if (!param0.equalsIgnoreCase("zoomDerelict")) {
                              break L3;
                            } else {
                              var2_array = oq.field_a.field_P.field_g.field_e;
                              var3 = 0;
                              L4: while (true) {
                                if (var2_array.length <= var3) {
                                  break L3;
                                } else {
                                  var4 = var2_array[var3];
                                  stackOut_37_0 = var4.field_B;
                                  stackIn_48_0 = stackOut_37_0;
                                  stackIn_38_0 = stackOut_37_0;
                                  if (var5 != 0) {
                                    break L2;
                                  } else {
                                    L5: {
                                      if (stackIn_38_0 >= 6) {
                                        oq.field_a.field_z.a(var4, param1 ^ 121);
                                        if (var5 == 0) {
                                          break L3;
                                        } else {
                                          break L5;
                                        }
                                      } else {
                                        break L5;
                                      }
                                    }
                                    var3++;
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
                          stackOut_47_0 = param0.equalsIgnoreCase("block");
                          stackIn_48_0 = stackOut_47_0 ? 1 : 0;
                          break L2;
                        }
                        if (stackIn_48_0 == 0) {
                          if (!param0.equalsIgnoreCase("capture1")) {
                            if (!param0.equalsIgnoreCase("showtabs")) {
                              if (param0.equalsIgnoreCase("startai")) {
                                var2_int = 1;
                                L6: while (true) {
                                  L7: {
                                    if (var2_int >= oq.field_a.field_s.length) {
                                      break L7;
                                    } else {
                                      oq.field_a.field_s[var2_int].a(true, -6861);
                                      var2_int++;
                                      if (var5 == 0) {
                                        continue L6;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                  return;
                                }
                              } else {
                                if (qj.a(true, (CharSequence) (Object) "enable", (CharSequence) (Object) param0)) {
                                  L8: {
                                    var2_ref = param0.substring(7).trim();
                                    if (var2_ref.endsWith("Button")) {
                                      oq.field_a.field_Y.a(var2_ref, true, param1 + -15023);
                                      break L8;
                                    } else {
                                      break L8;
                                    }
                                  }
                                  L9: {
                                    if (var2_ref.equalsIgnoreCase("animationControls")) {
                                      oq.field_a.field_Y.field_K.field_s = true;
                                      oq.field_a.field_Y.field_N.g(86);
                                      break L9;
                                    } else {
                                      break L9;
                                    }
                                  }
                                  return;
                                } else {
                                  L10: {
                                    if (qj.a(true, (CharSequence) (Object) "disable", (CharSequence) (Object) param0)) {
                                      var2_ref = param0.substring(8).trim();
                                      if (!var2_ref.endsWith("Button")) {
                                        break L10;
                                      } else {
                                        oq.field_a.field_Y.a(var2_ref, false, param1 ^ -15009);
                                        break L10;
                                      }
                                    } else {
                                      break L10;
                                    }
                                  }
                                  if (qj.a(true, (CharSequence) (Object) "hide", (CharSequence) (Object) param0)) {
                                    var2_ref = param0.substring(4).trim();
                                    oq.field_a.field_Y.a(var2_ref, false, (byte) 31);
                                    return;
                                  } else {
                                    if (qj.a(true, (CharSequence) (Object) "show", (CharSequence) (Object) param0)) {
                                      var2_ref = param0.substring(4).trim();
                                      oq.field_a.field_Y.a(var2_ref, true, (byte) 31);
                                      return;
                                    } else {
                                      L11: {
                                        if (qj.a(true, (CharSequence) (Object) "highlight", (CharSequence) (Object) param0)) {
                                          var2_ref = param0.substring(10).trim();
                                          if (var2_ref.equalsIgnoreCase("wormholes")) {
                                            er.field_g = true;
                                            return;
                                          } else {
                                            if (!var2_ref.equalsIgnoreCase("borders")) {
                                              if (!var2_ref.equalsIgnoreCase("garrison")) {
                                                if (var2_ref.equalsIgnoreCase("resources")) {
                                                  td.field_L = true;
                                                  return;
                                                } else {
                                                  if (!var2_ref.equalsIgnoreCase("productionHammer")) {
                                                    if (!var2_ref.equalsIgnoreCase("ready")) {
                                                      break L11;
                                                    } else {
                                                      ph.field_g = true;
                                                      decompiledRegionSelector0 = 0;
                                                      break L0;
                                                    }
                                                  } else {
                                                    se.field_k = true;
                                                    return;
                                                  }
                                                }
                                              } else {
                                                me.field_j = true;
                                                return;
                                              }
                                            } else {
                                              tl.field_u = true;
                                              return;
                                            }
                                          }
                                        } else {
                                          break L11;
                                        }
                                      }
                                      decompiledRegionSelector0 = 1;
                                      break L0;
                                    }
                                  }
                                }
                              }
                            } else {
                              return;
                            }
                          } else {
                            var2_int = ma.a((CharSequence) (Object) param0.substring(9), 2);
                            id.field_d = oq.field_a.field_P.field_g.field_e[var2_int];
                            uq.field_m.a(pa.a(id.field_d, param1 ^ -9), 27275, "capture1");
                            return;
                          }
                        } else {
                          is.field_b = true;
                          return;
                        }
                      } else {
                        oq.field_a.field_z.c(false);
                        return;
                      }
                    } else {
                      var2_array = oq.field_a.field_P.field_g.field_e;
                      var3 = 0;
                      L12: while (true) {
                        L13: {
                          if (~var2_array.length >= ~var3) {
                            break L13;
                          } else {
                            L14: {
                              var4 = var2_array[var3];
                              if (var4.field_y != ho.field_d) {
                                break L14;
                              } else {
                                if (!oq.field_a.field_V[var4.field_p]) {
                                  oq.field_a.field_z.a(92, var4, 300.0f);
                                  return;
                                } else {
                                  break L14;
                                }
                              }
                            }
                            var3++;
                            if (var5 == 0) {
                              continue L12;
                            } else {
                              break L13;
                            }
                          }
                        }
                        return;
                      }
                    }
                  }
                } else {
                  oq.field_a.field_z.a(39, ho.field_d.field_m.field_q, 200.0f);
                  return;
                }
              } else {
                return;
              }
            } else {
              var2_int = Integer.parseInt(param0.substring(6));
              no.a(-92, var2_int);
              oq.field_a.a(2);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var2 = decompiledCaughtException;
            stackOut_117_0 = (RuntimeException) var2;
            stackOut_117_1 = new StringBuilder().append("kq.U(");
            stackIn_120_0 = stackOut_117_0;
            stackIn_120_1 = stackOut_117_1;
            stackIn_118_0 = stackOut_117_0;
            stackIn_118_1 = stackOut_117_1;
            if (param0 == null) {
              stackOut_120_0 = (RuntimeException) (Object) stackIn_120_0;
              stackOut_120_1 = (StringBuilder) (Object) stackIn_120_1;
              stackOut_120_2 = "null";
              stackIn_121_0 = stackOut_120_0;
              stackIn_121_1 = stackOut_120_1;
              stackIn_121_2 = stackOut_120_2;
              break L15;
            } else {
              stackOut_118_0 = (RuntimeException) (Object) stackIn_118_0;
              stackOut_118_1 = (StringBuilder) (Object) stackIn_118_1;
              stackOut_118_2 = "{...}";
              stackIn_121_0 = stackOut_118_0;
              stackIn_121_1 = stackOut_118_1;
              stackIn_121_2 = stackOut_118_2;
              break L15;
            }
          }
          throw r.a((Throwable) (Object) stackIn_121_0, stackIn_121_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(byte param0, fs param1) {
        RuntimeException var3 = null;
        ph var3_ref = null;
        int var4 = 0;
        fs var5 = null;
        fe var5_ref = null;
        int var6 = 0;
        ff[] var6_ref_ff__ = null;
        lp var7 = null;
        int var8_int = 0;
        String var8 = null;
        vd var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_16_0 = 0;
        fe[] stackIn_17_0 = null;
        fe[] stackIn_19_0 = null;
        fe[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        ff[][] stackIn_21_0 = null;
        ff[][] stackIn_23_0 = null;
        ff[][] stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        lp[] stackIn_25_0 = null;
        lp[] stackIn_27_0 = null;
        lp[] stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        int stackIn_84_0 = 0;
        String stackIn_92_0 = null;
        fs stackIn_115_0 = null;
        int stackIn_122_0 = 0;
        RuntimeException stackIn_131_0 = null;
        StringBuilder stackIn_131_1 = null;
        RuntimeException stackIn_133_0 = null;
        StringBuilder stackIn_133_1 = null;
        RuntimeException stackIn_134_0 = null;
        StringBuilder stackIn_134_1 = null;
        String stackIn_134_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        fe[] stackOut_16_0 = null;
        fe[] stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        fe[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        ff[][] stackOut_20_0 = null;
        ff[][] stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        ff[][] stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        lp[] stackOut_24_0 = null;
        lp[] stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        lp[] stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int stackOut_83_0 = 0;
        int stackOut_81_0 = 0;
        String stackOut_91_0 = null;
        String stackOut_89_0 = null;
        fs stackOut_114_0 = null;
        fs stackOut_112_0 = null;
        int stackOut_119_0 = 0;
        int stackOut_121_0 = 0;
        RuntimeException stackOut_130_0 = null;
        StringBuilder stackOut_130_1 = null;
        RuntimeException stackOut_133_0 = null;
        StringBuilder stackOut_133_1 = null;
        String stackOut_133_2 = null;
        RuntimeException stackOut_131_0 = null;
        StringBuilder stackOut_131_1 = null;
        String stackOut_131_2 = null;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (param0 <= -10) {
              L1: {
                if (!((kq) this).field_s.field_W) {
                  break L1;
                } else {
                  if (kb.field_x >= 6) {
                    break L1;
                  } else {
                    return;
                  }
                }
              }
              L2: {
                L3: {
                  L4: {
                    var3_ref = (ph) (Object) ((kq) this).field_J.field_x;
                    if (((kq) this).field_s.field_n == null) {
                      break L4;
                    } else {
                      if (param1 == ((kq) this).field_s.field_n) {
                        break L4;
                      } else {
                        L5: {
                          if (param1.field_x >= ((kq) this).field_s.field_n.field_x) {
                            stackOut_15_0 = 0;
                            stackIn_16_0 = stackOut_15_0;
                            break L5;
                          } else {
                            stackOut_13_0 = 1;
                            stackIn_16_0 = stackOut_13_0;
                            break L5;
                          }
                        }
                        L6: {
                          var4 = stackIn_16_0;
                          stackOut_16_0 = var3_ref.field_i;
                          stackIn_19_0 = stackOut_16_0;
                          stackIn_17_0 = stackOut_16_0;
                          if (var4 == 0) {
                            stackOut_19_0 = (fe[]) (Object) stackIn_19_0;
                            stackOut_19_1 = param1.field_x - 1;
                            stackIn_20_0 = stackOut_19_0;
                            stackIn_20_1 = stackOut_19_1;
                            break L6;
                          } else {
                            stackOut_17_0 = (fe[]) (Object) stackIn_17_0;
                            stackOut_17_1 = param1.field_x;
                            stackIn_20_0 = stackOut_17_0;
                            stackIn_20_1 = stackOut_17_1;
                            break L6;
                          }
                        }
                        L7: {
                          var5_ref = stackIn_20_0[stackIn_20_1];
                          stackOut_20_0 = var3_ref.field_f;
                          stackIn_23_0 = stackOut_20_0;
                          stackIn_21_0 = stackOut_20_0;
                          if (var4 == 0) {
                            stackOut_23_0 = (ff[][]) (Object) stackIn_23_0;
                            stackOut_23_1 = param1.field_x;
                            stackIn_24_0 = stackOut_23_0;
                            stackIn_24_1 = stackOut_23_1;
                            break L7;
                          } else {
                            stackOut_21_0 = (ff[][]) (Object) stackIn_21_0;
                            stackOut_21_1 = 1 + param1.field_x;
                            stackIn_24_0 = stackOut_21_0;
                            stackIn_24_1 = stackOut_21_1;
                            break L7;
                          }
                        }
                        L8: {
                          var6_ref_ff__ = stackIn_24_0[stackIn_24_1];
                          stackOut_24_0 = var3_ref.field_h;
                          stackIn_27_0 = stackOut_24_0;
                          stackIn_25_0 = stackOut_24_0;
                          if (var4 != 0) {
                            stackOut_27_0 = (lp[]) (Object) stackIn_27_0;
                            stackOut_27_1 = 1 + param1.field_x;
                            stackIn_28_0 = stackOut_27_0;
                            stackIn_28_1 = stackOut_27_1;
                            break L8;
                          } else {
                            stackOut_25_0 = (lp[]) (Object) stackIn_25_0;
                            stackOut_25_1 = param1.field_x;
                            stackIn_28_0 = stackOut_25_0;
                            stackIn_28_1 = stackOut_25_1;
                            break L8;
                          }
                        }
                        L9: {
                          L10: {
                            var7 = stackIn_28_0[stackIn_28_1];
                            if (0 != (((kq) this).field_s.field_P.field_w & 1 << param1.field_x)) {
                              break L10;
                            } else {
                              L11: {
                                L12: {
                                  L13: {
                                    if (param1.field_h[((kq) this).field_s.field_n.field_x]) {
                                      break L13;
                                    } else {
                                      L14: {
                                        L15: {
                                          if ((1 << ((kq) this).field_s.field_n.field_x & param1.field_A) != 0) {
                                            break L15;
                                          } else {
                                            L16: {
                                              if (0 != (1 << param1.field_x & ((kq) this).field_s.field_n.field_A)) {
                                                break L16;
                                              } else {
                                                var5_ref.a((byte) 2, 3375155, eb.field_e);
                                                var7.field_o = re.a(jg.field_f, 4371, new String[1]);
                                                var9 = (vd) (Object) var7.field_l.d(0);
                                                L17: while (true) {
                                                  L18: {
                                                    if (null == var9) {
                                                      break L18;
                                                    } else {
                                                      var9.field_o = re.a(jg.field_f, 4371, new String[1]);
                                                      var9 = (vd) (Object) var7.field_l.a((byte) -71);
                                                      if (var11 != 0) {
                                                        break L14;
                                                      } else {
                                                        if (var11 == 0) {
                                                          continue L17;
                                                        } else {
                                                          break L18;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  if (var11 == 0) {
                                                    break L14;
                                                  } else {
                                                    break L16;
                                                  }
                                                }
                                              }
                                            }
                                            var5_ref.a((byte) -54, 3375155, il.field_hb);
                                            var7.field_o = re.a(gn.field_x, 4371, new String[1]);
                                            var9 = (vd) (Object) var7.field_l.d(0);
                                            L19: while (true) {
                                              L20: {
                                                if (null == var9) {
                                                  break L20;
                                                } else {
                                                  var9.field_o = re.a(gn.field_x, 4371, new String[1]);
                                                  var9 = (vd) (Object) var7.field_l.a((byte) -71);
                                                  if (var11 != 0) {
                                                    break L14;
                                                  } else {
                                                    if (var11 == 0) {
                                                      continue L19;
                                                    } else {
                                                      break L20;
                                                    }
                                                  }
                                                }
                                              }
                                              if (var11 == 0) {
                                                break L14;
                                              } else {
                                                break L15;
                                              }
                                            }
                                          }
                                        }
                                        var5_ref.a((byte) -109, 3375155, fb.field_gc);
                                        var7.field_o = re.a(mf.field_u, 4371, new String[1]);
                                        var9 = (vd) (Object) var7.field_l.d(0);
                                        L21: while (true) {
                                          if (var9 == null) {
                                            break L14;
                                          } else {
                                            var9.field_o = re.a(mf.field_u, 4371, new String[1]);
                                            var9 = (vd) (Object) var7.field_l.a((byte) -71);
                                            if (var11 != 0) {
                                              break L9;
                                            } else {
                                              if (var11 == 0) {
                                                continue L21;
                                              } else {
                                                break L14;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      var8_int = -1;
                                      if (var11 == 0) {
                                        break L12;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                  var8_int = ((kq) this).field_s.field_n.field_k;
                                  var5_ref.a((byte) -83, 9386040, re.a(jb.field_e, 4371, new String[1]));
                                  var7.field_o = null;
                                  var9 = (vd) (Object) var7.field_l.d(0);
                                  L22: while (true) {
                                    if (var9 == null) {
                                      break L12;
                                    } else {
                                      var9.field_o = null;
                                      var9 = (vd) (Object) var7.field_l.a((byte) -71);
                                      if (var11 != 0) {
                                        break L11;
                                      } else {
                                        if (var11 == 0) {
                                          continue L22;
                                        } else {
                                          break L12;
                                        }
                                      }
                                    }
                                  }
                                }
                                var6_ref_ff__[0].a(-2948, ne.a(var8_int, false));
                                break L11;
                              }
                              var9_int = 1;
                              L23: while (true) {
                                L24: {
                                  if (var6_ref_ff__.length <= var9_int) {
                                    break L24;
                                  } else {
                                    var10 = -1 + var9_int;
                                    if (var11 != 0) {
                                      break L9;
                                    } else {
                                      L25: {
                                        if (~((kq) this).field_s.field_n.field_x < ~var10) {
                                          break L25;
                                        } else {
                                          var10++;
                                          break L25;
                                        }
                                      }
                                      L26: {
                                        if (var10 < param1.field_x) {
                                          break L26;
                                        } else {
                                          var10++;
                                          if (~var10 != ~((kq) this).field_s.field_n.field_x) {
                                            break L26;
                                          } else {
                                            var10++;
                                            break L26;
                                          }
                                        }
                                      }
                                      L27: {
                                        if (!param1.field_h[var10]) {
                                          stackOut_83_0 = -1;
                                          stackIn_84_0 = stackOut_83_0;
                                          break L27;
                                        } else {
                                          stackOut_81_0 = ((kq) this).field_s.field_P.field_v[var10].field_k;
                                          stackIn_84_0 = stackOut_81_0;
                                          break L27;
                                        }
                                      }
                                      var8_int = stackIn_84_0;
                                      var6_ref_ff__[var9_int].a(-2948, wm.a(var8_int, 0));
                                      var9_int++;
                                      if (var11 == 0) {
                                        continue L23;
                                      } else {
                                        break L24;
                                      }
                                    }
                                  }
                                }
                                if (var11 == 0) {
                                  break L9;
                                } else {
                                  break L10;
                                }
                              }
                            }
                          }
                          L28: {
                            if ((((kq) this).field_s.field_P.field_f & 1 << param1.field_x) == 0) {
                              stackOut_91_0 = of.field_d;
                              stackIn_92_0 = stackOut_91_0;
                              break L28;
                            } else {
                              stackOut_89_0 = he.field_l;
                              stackIn_92_0 = stackOut_89_0;
                              break L28;
                            }
                          }
                          var8 = stackIn_92_0;
                          var5_ref.a((byte) 122, 0, var8);
                          var6_ref_ff__[0].a(-2948, ne.a(-1, false));
                          var9_int = 1;
                          L29: while (true) {
                            L30: {
                              L31: {
                                if (~var9_int <= ~var6_ref_ff__.length) {
                                  break L31;
                                } else {
                                  var6_ref_ff__[var9_int].a(-2948, wm.a(-1, 0));
                                  var9_int++;
                                  if (var11 != 0) {
                                    break L30;
                                  } else {
                                    if (var11 == 0) {
                                      continue L29;
                                    } else {
                                      break L31;
                                    }
                                  }
                                }
                              }
                              var7.field_o = null;
                              break L30;
                            }
                            var9 = (vd) (Object) var7.field_l.d(0);
                            L32: while (true) {
                              if (null == var9) {
                                break L9;
                              } else {
                                var9.field_o = null;
                                var9 = (vd) (Object) var7.field_l.a((byte) -71);
                                if (var11 != 0) {
                                  break L3;
                                } else {
                                  if (var11 == 0) {
                                    continue L32;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                            }
                          }
                        }
                        if (var11 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  var4 = 0;
                  L33: while (true) {
                    if (var3_ref.field_f[0].length <= var4) {
                      break L3;
                    } else {
                      if (var11 != 0) {
                        break L2;
                      } else {
                        L34: {
                          if (param1.field_x <= var4) {
                            stackOut_114_0 = ((kq) this).field_s.field_P.field_v[var4 + 1];
                            stackIn_115_0 = stackOut_114_0;
                            break L34;
                          } else {
                            stackOut_112_0 = ((kq) this).field_s.field_P.field_v[var4];
                            stackIn_115_0 = stackOut_112_0;
                            break L34;
                          }
                        }
                        L35: {
                          L36: {
                            var5 = stackIn_115_0;
                            if (!param1.field_h[var5.field_x]) {
                              break L36;
                            } else {
                              if ((((kq) this).field_s.field_P.field_w & 1 << var5.field_x) != 0) {
                                break L36;
                              } else {
                                stackOut_119_0 = var5.field_k;
                                stackIn_122_0 = stackOut_119_0;
                                break L35;
                              }
                            }
                          }
                          stackOut_121_0 = -1;
                          stackIn_122_0 = stackOut_121_0;
                          break L35;
                        }
                        L37: {
                          L38: {
                            var6 = stackIn_122_0;
                            if (var4 == 0) {
                              break L38;
                            } else {
                              var3_ref.field_f[0][var4].a(-2948, wm.a(var6, 0));
                              if (var11 == 0) {
                                break L37;
                              } else {
                                break L38;
                              }
                            }
                          }
                          var3_ref.field_f[0][var4].a(-2948, ne.a(var6, false));
                          break L37;
                        }
                        var4++;
                        if (var11 == 0) {
                          continue L33;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                break L2;
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L39: {
            var3 = decompiledCaughtException;
            stackOut_130_0 = (RuntimeException) var3;
            stackOut_130_1 = new StringBuilder().append("kq.E(").append(param0).append(',');
            stackIn_133_0 = stackOut_130_0;
            stackIn_133_1 = stackOut_130_1;
            stackIn_131_0 = stackOut_130_0;
            stackIn_131_1 = stackOut_130_1;
            if (param1 == null) {
              stackOut_133_0 = (RuntimeException) (Object) stackIn_133_0;
              stackOut_133_1 = (StringBuilder) (Object) stackIn_133_1;
              stackOut_133_2 = "null";
              stackIn_134_0 = stackOut_133_0;
              stackIn_134_1 = stackOut_133_1;
              stackIn_134_2 = stackOut_133_2;
              break L39;
            } else {
              stackOut_131_0 = (RuntimeException) (Object) stackIn_131_0;
              stackOut_131_1 = (StringBuilder) (Object) stackIn_131_1;
              stackOut_131_2 = "{...}";
              stackIn_134_0 = stackOut_131_0;
              stackIn_134_1 = stackOut_131_1;
              stackIn_134_2 = stackOut_131_2;
              break L39;
            }
          }
          throw r.a((Throwable) (Object) stackIn_134_0, stackIn_134_2 + ')');
        }
    }

    private final void a(String param0, boolean param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        try {
          L0: {
            L1: {
              if (param0.startsWith("production")) {
                ((kq) this).field_mb.field_s = param1;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0.startsWith("projects")) {
                ((kq) this).field_S.field_s = param1;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param0.startsWith("fleets")) {
                ((kq) this).field_W.field_s = param1;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param0.startsWith("diplomacy")) {
                ((kq) this).field_n.field_s = param1;
                break L4;
              } else {
                break L4;
              }
            }
            if (param2 == -15016) {
              L5: {
                if (!param0.startsWith("victory")) {
                  break L5;
                } else {
                  if (((kq) this).field_g == null) {
                    break L5;
                  } else {
                    ((kq) this).field_g.field_s = param1;
                    break L5;
                  }
                }
              }
              L6: {
                if (param0.startsWith("turn")) {
                  ((kq) this).field_bb.field_s = param1;
                  break L6;
                } else {
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
          L7: {
            var4 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var4;
            stackOut_29_1 = new StringBuilder().append("kq.BB(");
            stackIn_32_0 = stackOut_29_0;
            stackIn_32_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L7;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_33_0 = stackOut_30_0;
              stackIn_33_1 = stackOut_30_1;
              stackIn_33_2 = stackOut_30_2;
              break L7;
            }
          }
          throw r.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(byte param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        bi var8 = null;
        int[] var8_array = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        bi var14 = null;
        int var15 = 0;
        int[][] var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20_int = 0;
        String var20 = null;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24_int = 0;
        vd var24 = null;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33_int = 0;
        String var33 = null;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int stackIn_20_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_30_0 = 0;
        bi stackIn_34_0 = null;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_61_0 = 0;
        int stackIn_61_1 = 0;
        int stackIn_71_0 = 0;
        int stackIn_71_1 = 0;
        int stackIn_78_0 = 0;
        int stackIn_78_1 = 0;
        String stackIn_89_0 = null;
        int stackIn_107_0 = 0;
        int stackIn_107_1 = 0;
        int stackIn_109_0 = 0;
        int stackIn_112_0 = 0;
        int stackIn_112_1 = 0;
        int stackIn_118_0 = 0;
        int stackIn_123_0 = 0;
        int stackIn_125_0 = 0;
        int stackIn_128_0 = 0;
        int stackIn_139_0 = 0;
        int stackIn_141_0 = 0;
        int stackIn_144_0 = 0;
        int stackIn_153_0 = 0;
        int stackIn_158_0 = 0;
        int stackIn_158_1 = 0;
        int stackIn_169_0 = 0;
        int stackIn_169_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        bi stackOut_33_0 = null;
        bi stackOut_32_0 = null;
        int stackOut_39_0 = 0;
        int stackOut_39_1 = 0;
        int stackOut_50_0 = 0;
        int stackOut_50_1 = 0;
        int stackOut_60_0 = 0;
        int stackOut_60_1 = 0;
        int stackOut_70_0 = 0;
        int stackOut_70_1 = 0;
        int stackOut_77_0 = 0;
        int stackOut_77_1 = 0;
        String stackOut_88_0 = null;
        String stackOut_87_0 = null;
        Object stackOut_86_0 = null;
        String stackOut_85_0 = null;
        String stackOut_79_0 = null;
        int stackOut_106_0 = 0;
        int stackOut_106_1 = 0;
        int stackOut_108_0 = 0;
        int stackOut_111_0 = 0;
        int stackOut_111_1 = 0;
        int stackOut_117_0 = 0;
        int stackOut_122_0 = 0;
        int stackOut_124_0 = 0;
        int stackOut_127_0 = 0;
        int stackOut_138_0 = 0;
        int stackOut_140_0 = 0;
        int stackOut_143_0 = 0;
        int stackOut_152_0 = 0;
        int stackOut_157_0 = 0;
        int stackOut_157_1 = 0;
        int stackOut_168_0 = 0;
        int stackOut_168_1 = 0;
        L0: {
          var40 = ShatteredPlansClient.field_F ? 1 : 0;
          var3_int = 32;
          if (param1 >= 32) {
            break L0;
          } else {
            var3_int = param1;
            break L0;
          }
        }
        L1: {
          L2: {
            var4 = re.a(20, 32, var3_int, 550, 0);
            sn.a(640, 101, 480, 192 - -((-var3_int + 32 << 6) / 32), 0, 0);
            var5 = (640 - var4) / 2;
            var6 = 80;
            var7 = 360;
            if (fj.field_t.field_h != 2) {
              break L2;
            } else {
              sn.a(var4, -104, var7, (32 + -var3_int << 7) / 32 + 128, var5, var6);
              var8 = qh.a((bi) null, var6, var4, var5, -1, var7);
              bs.a(var8, 93);
              gf.b(3, 3, 0, 0, var4, var7);
              cg.i(0);
              var8.a(var5, var6, (var3_int << 7) / 32);
              if (var40 == 0) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          L3: {
            if (fj.field_t.field_h == 1) {
              break L3;
            } else {
              if (fj.field_t.field_h == 0) {
                L4: {
                  if (var3_int == 32) {
                    break L4;
                  } else {
                    gf.c(var5, var6, var4, var7, 855316, (var3_int << 8) / 32);
                    if (var40 == 0) {
                      break L1;
                    } else {
                      break L4;
                    }
                  }
                }
                gf.d(var5, var6, var4, var7, 855316);
                if (var40 == 0) {
                  break L1;
                } else {
                  break L3;
                }
              } else {
                break L1;
              }
            }
          }
          sn.a(var4, -117, var7, 128 + (-var3_int + 32 << 7) / 32, var5, var6);
          break L1;
        }
        L5: {
          L6: {
            ga.a(var7, var6, var5, (byte) -60, var4);
            var8_array = new int[4];
            gf.a(var8_array);
            gf.d(var5, var6, var5 - -var4, var6 + var7);
            var9 = 0;
            var10 = 0;
            var11 = ((kq) this).field_s.field_P.field_z ? 1 : 0;
            var12 = 111 % ((param0 - -66) / 34);
            if (var11 == 0) {
              break L6;
            } else {
              if (0 <= ((kq) this).field_s.field_P.field_k) {
                break L6;
              } else {
                stackOut_18_0 = 1;
                stackIn_20_0 = stackOut_18_0;
                break L5;
              }
            }
          }
          stackOut_19_0 = 0;
          stackIn_20_0 = stackOut_19_0;
          break L5;
        }
        L7: {
          var13 = stackIn_20_0;
          if (((kq) this).field_s.field_n == null) {
            break L7;
          } else {
            L8: {
              if (((kq) this).field_s.field_n.field_x != ((kq) this).field_s.field_P.field_k) {
                stackOut_24_0 = 0;
                stackIn_25_0 = stackOut_24_0;
                break L8;
              } else {
                stackOut_23_0 = 1;
                stackIn_25_0 = stackOut_23_0;
                break L8;
              }
            }
            L9: {
              L10: {
                var9 = stackIn_25_0;
                if ((((kq) this).field_s.field_P.field_w & 1 << ((kq) this).field_s.field_n.field_x) != 0) {
                  break L10;
                } else {
                  if (!((kq) this).field_s.field_P.field_x.a((byte) 108, ((kq) this).field_s.field_n)) {
                    stackOut_29_0 = 0;
                    stackIn_30_0 = stackOut_29_0;
                    break L9;
                  } else {
                    break L10;
                  }
                }
              }
              stackOut_28_0 = 1;
              stackIn_30_0 = stackOut_28_0;
              break L9;
            }
            var10 = stackIn_30_0;
            break L7;
          }
        }
        L11: {
          if (var10 != 0) {
            stackOut_33_0 = dp.field_s;
            stackIn_34_0 = stackOut_33_0;
            break L11;
          } else {
            stackOut_32_0 = ce.field_v;
            stackIn_34_0 = stackOut_32_0;
            break L11;
          }
        }
        L12: {
          L13: {
            L14: {
              L15: {
                var14 = stackIn_34_0;
                var15 = ((kq) this).field_s.field_P.field_r;
                var16 = this.j(410);
                var17 = var4 - 40;
                if (((kq) this).field_Q == 0) {
                  break L15;
                } else {
                  if (null != var16) {
                    break L14;
                  } else {
                    break L15;
                  }
                }
              }
              var18 = 0;
              L16: while (true) {
                L17: {
                  if (var18 >= 240) {
                    break L17;
                  } else {
                    var19 = var18 + (var6 + 20);
                    var20_int = 20 + var5;
                    var21 = -40 + var4;
                    stackOut_39_0 = 320;
                    stackOut_39_1 = var21;
                    stackIn_61_0 = stackOut_39_0;
                    stackIn_61_1 = stackOut_39_1;
                    stackIn_40_0 = stackOut_39_0;
                    stackIn_40_1 = stackOut_39_1;
                    if (var40 != 0) {
                      break L12;
                    } else {
                      L18: {
                        if (stackIn_40_0 < stackIn_40_1) {
                          var21 = 320;
                          break L18;
                        } else {
                          break L18;
                        }
                      }
                      L19: {
                        var22 = 0;
                        if (var21 < 0) {
                          break L19;
                        } else {
                          am.a(var20_int, var18, var14, var22, var21, var19, (byte) -107);
                          gf.a(-1 + var20_int, var19, 16777215);
                          gf.a(var20_int + var21, var19, 16777215);
                          break L19;
                        }
                      }
                      var18++;
                      if (var40 == 0) {
                        continue L16;
                      } else {
                        break L17;
                      }
                    }
                  }
                }
                if (var40 == 0) {
                  break L13;
                } else {
                  break L14;
                }
              }
            }
            var18 = 0;
            L20: while (true) {
              if (var18 >= 240) {
                break L13;
              } else {
                var19 = var18 + 20 + var6;
                var20_int = 20 + var5;
                var21 = -40 + var4;
                stackOut_50_0 = -321;
                stackOut_50_1 = ~var21;
                stackIn_61_0 = stackOut_50_0;
                stackIn_61_1 = stackOut_50_1;
                stackIn_51_0 = stackOut_50_0;
                stackIn_51_1 = stackOut_50_1;
                if (var40 != 0) {
                  break L12;
                } else {
                  L21: {
                    if (stackIn_51_0 > stackIn_51_1) {
                      var21 = 320;
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                  L22: {
                    L23: {
                      var22 = 0;
                      if (var21 >= 0) {
                        break L23;
                      } else {
                        if (var40 == 0) {
                          break L22;
                        } else {
                          break L23;
                        }
                      }
                    }
                    ml.a(var19, var21, var18, var20_int, var14, var22, 16403);
                    gf.f(var20_int, var19, var21, 0, 192);
                    gf.a(var20_int - 1, var19, 16777215);
                    gf.a(var20_int - -var21, var19, 16777215);
                    break L22;
                  }
                  var18++;
                  if (var40 == 0) {
                    continue L20;
                  } else {
                    break L13;
                  }
                }
              }
            }
          }
          stackOut_60_0 = var17;
          stackOut_60_1 = 320;
          stackIn_61_0 = stackOut_60_0;
          stackIn_61_1 = stackOut_60_1;
          break L12;
        }
        L24: {
          if (stackIn_61_0 <= stackIn_61_1) {
            break L24;
          } else {
            var17 = 320;
            break L24;
          }
        }
        L25: {
          L26: {
            if (((kq) this).field_Q == 0) {
              break L26;
            } else {
              if (((kq) this).field_Q == 25) {
                break L26;
              } else {
                if (var16 == null) {
                  break L26;
                } else {
                  var18 = 0;
                  L27: while (true) {
                    if (var18 >= 240) {
                      break L26;
                    } else {
                      var19 = var18 + (var6 + 20);
                      var20_int = var5 + 20;
                      var21 = -40 + var4;
                      stackOut_70_0 = var21;
                      stackOut_70_1 = 320;
                      stackIn_78_0 = stackOut_70_0;
                      stackIn_78_1 = stackOut_70_1;
                      stackIn_71_0 = stackOut_70_0;
                      stackIn_71_1 = stackOut_70_1;
                      if (var40 != 0) {
                        break L25;
                      } else {
                        L28: {
                          if (stackIn_71_0 <= stackIn_71_1) {
                            break L28;
                          } else {
                            var21 = 320;
                            break L28;
                          }
                        }
                        L29: {
                          var22 = 0;
                          if (var21 < 0) {
                            break L29;
                          } else {
                            ld.a(var18, var20_int, var21, var19, -68, var22, -((kq) this).field_Q + 256, var14);
                            break L29;
                          }
                        }
                        var18++;
                        if (var40 == 0) {
                          continue L27;
                        } else {
                          break L26;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          gf.f(20 + var5 - 1, 20 + var6 + -1, 322, 16777215);
          gf.f(-1 + (20 + var5), 20 + var6 + 240, 322, 16777215);
          stackOut_77_0 = var5 - -320;
          stackOut_77_1 = 125;
          stackIn_78_0 = stackOut_77_0;
          stackIn_78_1 = stackOut_77_1;
          break L25;
        }
        L30: {
          var18 = stackIn_78_0 + stackIn_78_1;
          if (var9 == 0) {
            if (var10 != 0) {
              stackOut_88_0 = (String) field_L;
              stackIn_89_0 = stackOut_88_0;
              break L30;
            } else {
              if (var13 != 0) {
                stackOut_87_0 = ef.field_c;
                stackIn_89_0 = stackOut_87_0;
                break L30;
              } else {
                if (var11 == 0) {
                  stackOut_86_0 = null;
                  stackIn_89_0 = (String) (Object) stackOut_86_0;
                  break L30;
                } else {
                  stackOut_85_0 = fj.field_o;
                  stackIn_89_0 = stackOut_85_0;
                  break L30;
                }
              }
            }
          } else {
            stackOut_79_0 = fj.field_o;
            stackIn_89_0 = stackOut_79_0;
            break L30;
          }
        }
        L31: {
          var20 = stackIn_89_0;
          if (((kq) this).field_s.field_n != null) {
            break L31;
          } else {
            if (var13 == 0) {
              var20 = " ";
              break L31;
            } else {
              break L31;
            }
          }
        }
        mp.field_b.c(var20, var18, 27 + var6, 16777215, -1);
        var21 = -10 + (40 + var5) - -320;
        var22 = 40 + var6;
        var23 = 4 * ((kq) this).field_D;
        var17 = -40 + var4;
        var24_int = 0;
        L32: while (true) {
          L33: {
            L34: {
              L35: {
                if (var24_int >= 4) {
                  break L35;
                } else {
                  this.b(var24_int, var22, var21, 85, var23);
                  var23++;
                  var22 = var22 + (8 + ((kq) this).field_ob[var24_int]);
                  var24_int++;
                  if (var40 != 0) {
                    break L34;
                  } else {
                    if (var40 == 0) {
                      continue L32;
                    } else {
                      break L35;
                    }
                  }
                }
              }
              if (var17 > 320) {
                break L34;
              } else {
                break L33;
              }
            }
            var17 = 320;
            break L33;
          }
          L36: {
            L37: {
              gf.d(20 + var5, var6 + 20, var17 + (var5 - -20), var6 + 260);
              if (((kq) this).field_Q == 0) {
                break L37;
              } else {
                if (var16 == null) {
                  break L37;
                } else {
                  var24_int = var16[0].length;
                  var25 = 1;
                  var26 = 0;
                  L38: while (true) {
                    stackOut_106_0 = ~var26;
                    stackOut_106_1 = ~var15;
                    stackIn_107_0 = stackOut_106_0;
                    stackIn_107_1 = stackOut_106_1;
                    L39: while (true) {
                      L40: {
                        L41: {
                          if (stackIn_107_0 <= stackIn_107_1) {
                            break L41;
                          } else {
                            stackOut_108_0 = 0;
                            stackIn_118_0 = stackOut_108_0;
                            stackIn_109_0 = stackOut_108_0;
                            if (var40 != 0) {
                              break L40;
                            } else {
                              var27 = stackIn_109_0;
                              L42: while (true) {
                                L43: {
                                  if (var24_int <= var27) {
                                    break L43;
                                  } else {
                                    stackOut_111_0 = ~var16[var26][var27];
                                    stackOut_111_1 = ~var25;
                                    stackIn_107_0 = stackOut_111_0;
                                    stackIn_107_1 = stackOut_111_1;
                                    stackIn_112_0 = stackOut_111_0;
                                    stackIn_112_1 = stackOut_111_1;
                                    if (var40 != 0) {
                                      continue L39;
                                    } else {
                                      L44: {
                                        if (stackIn_112_0 < stackIn_112_1) {
                                          var25 = var16[var26][var27];
                                          break L44;
                                        } else {
                                          break L44;
                                        }
                                      }
                                      var27++;
                                      if (var40 == 0) {
                                        continue L42;
                                      } else {
                                        break L43;
                                      }
                                    }
                                  }
                                }
                                var26++;
                                if (var40 == 0) {
                                  continue L38;
                                } else {
                                  break L41;
                                }
                              }
                            }
                          }
                        }
                        var26 = 320;
                        stackOut_117_0 = 222;
                        stackIn_118_0 = stackOut_117_0;
                        break L40;
                      }
                      L45: {
                        var27 = stackIn_118_0;
                        var21 = var5 + 20;
                        var28 = var27 + (20 + var6);
                        var29 = ((kq) this).field_fb + -1 << 10;
                        if (((kq) this).field_kb == 0) {
                          break L45;
                        } else {
                          var29 = -1024 + re.a(((kq) this).field_H << 10, 32, ((kq) this).field_kb, ((kq) this).field_fb << 10, 0);
                          break L45;
                        }
                      }
                      L46: {
                        L47: {
                          L48: {
                            if (((kq) this).field_Q == 256) {
                              break L48;
                            } else {
                              var30 = 0;
                              L49: while (true) {
                                stackOut_122_0 = var30;
                                stackIn_123_0 = stackOut_122_0;
                                L50: while (true) {
                                  L51: {
                                    if (stackIn_123_0 >= var15) {
                                      break L51;
                                    } else {
                                      var19 = ((kq) this).field_s.field_P.field_v[var30].field_s;
                                      var31 = var21;
                                      var32 = -(var16[var30][0] * var27 / var25) + var28;
                                      var34 = var32;
                                      stackOut_124_0 = 1;
                                      stackIn_153_0 = stackOut_124_0;
                                      stackIn_125_0 = stackOut_124_0;
                                      if (var40 != 0) {
                                        break L46;
                                      } else {
                                        var35 = stackIn_125_0;
                                        L52: while (true) {
                                          L53: {
                                            if (~var35 <= ~var24_int) {
                                              break L53;
                                            } else {
                                              var36 = var26 * var35 / (var24_int + -1) + var21;
                                              var37 = var16[var30][var35];
                                              var33_int = -(var27 * var37 / var25) + var28;
                                              stackOut_127_0 = 0;
                                              stackIn_123_0 = stackOut_127_0;
                                              stackIn_128_0 = stackOut_127_0;
                                              if (var40 != 0) {
                                                continue L50;
                                              } else {
                                                var38 = stackIn_128_0;
                                                L54: while (true) {
                                                  L55: {
                                                    L56: {
                                                      if (~var38 <= ~(var36 - var31)) {
                                                        break L56;
                                                      } else {
                                                        var39 = re.a(var32, -var31 + var36, var38, var33_int, 0);
                                                        gf.g(var31 - (-var38 + 1), var34, var31 + var38, var39, var19, ((kq) this).field_Q);
                                                        var34 = var39;
                                                        var38++;
                                                        if (var40 != 0) {
                                                          break L55;
                                                        } else {
                                                          if (var40 == 0) {
                                                            continue L54;
                                                          } else {
                                                            break L56;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    var31 = var36;
                                                    var32 = var33_int;
                                                    var35++;
                                                    break L55;
                                                  }
                                                  if (var40 == 0) {
                                                    continue L52;
                                                  } else {
                                                    break L53;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          var30++;
                                          if (var40 == 0) {
                                            continue L49;
                                          } else {
                                            break L51;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  if (var40 == 0) {
                                    break L47;
                                  } else {
                                    break L48;
                                  }
                                }
                              }
                            }
                          }
                          var30 = 0;
                          L57: while (true) {
                            stackOut_138_0 = var15;
                            stackIn_139_0 = stackOut_138_0;
                            L58: while (true) {
                              if (stackIn_139_0 <= var30) {
                                break L47;
                              } else {
                                var19 = ((kq) this).field_s.field_P.field_v[var30].field_s;
                                var31 = var21;
                                var32 = var28 - var27 * var16[var30][0] / var25;
                                var34 = var32;
                                stackOut_140_0 = 1;
                                stackIn_153_0 = stackOut_140_0;
                                stackIn_141_0 = stackOut_140_0;
                                if (var40 != 0) {
                                  break L46;
                                } else {
                                  var35 = stackIn_141_0;
                                  L59: while (true) {
                                    L60: {
                                      if (var35 >= var24_int) {
                                        break L60;
                                      } else {
                                        var36 = var21 + (var35 * var26 << 10) / var29;
                                        var37 = var16[var30][var35];
                                        var33_int = -(var37 * var27 / var25) + var28;
                                        stackOut_143_0 = 0;
                                        stackIn_139_0 = stackOut_143_0;
                                        stackIn_144_0 = stackOut_143_0;
                                        if (var40 != 0) {
                                          continue L58;
                                        } else {
                                          var38 = stackIn_144_0;
                                          L61: while (true) {
                                            L62: {
                                              L63: {
                                                if (~var38 <= ~(var36 + -var31)) {
                                                  break L63;
                                                } else {
                                                  var39 = re.a(var32, var36 - var31, var38, var33_int, 0);
                                                  gf.g(-1 + var31 - -var38, var34, var38 + var31, var39, var19);
                                                  var34 = var39;
                                                  var38++;
                                                  if (var40 != 0) {
                                                    break L62;
                                                  } else {
                                                    if (var40 == 0) {
                                                      continue L61;
                                                    } else {
                                                      break L63;
                                                    }
                                                  }
                                                }
                                              }
                                              var31 = var36;
                                              var32 = var33_int;
                                              var35++;
                                              break L62;
                                            }
                                            if (var40 == 0) {
                                              continue L59;
                                            } else {
                                              break L60;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    var30++;
                                    if (var40 == 0) {
                                      continue L57;
                                    } else {
                                      break L47;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        var30 = (var24_int - -7) / 8;
                        stackOut_152_0 = 0;
                        stackIn_153_0 = stackOut_152_0;
                        break L46;
                      }
                      L64: {
                        if (stackIn_153_0 != var30) {
                          break L64;
                        } else {
                          var30 = 1;
                          break L64;
                        }
                      }
                      var31 = 0;
                      L65: while (true) {
                        if (var31 >= var24_int) {
                          break L37;
                        } else {
                          var32 = var21 - -(var26 * var31 / (-1 + var24_int));
                          stackOut_157_0 = 0;
                          stackOut_157_1 = var31 % var30;
                          stackIn_169_0 = stackOut_157_0;
                          stackIn_169_1 = stackOut_157_1;
                          stackIn_158_0 = stackOut_157_0;
                          stackIn_158_1 = stackOut_157_1;
                          if (var40 != 0) {
                            break L36;
                          } else {
                            L66: {
                              if (stackIn_158_0 == stackIn_158_1) {
                                L67: {
                                  L68: {
                                    var33 = Integer.toString(var31);
                                    var34 = rs.field_Cb.c(var33);
                                    var35 = -(var34 >> 1) + var32;
                                    if (var31 == 0) {
                                      break L68;
                                    } else {
                                      if (var24_int - 1 != var31) {
                                        break L67;
                                      } else {
                                        var35 = -var34 + var35;
                                        if (var40 == 0) {
                                          break L67;
                                        } else {
                                          break L68;
                                        }
                                      }
                                    }
                                  }
                                  var35 = var21 + var34 / 2;
                                  break L67;
                                }
                                rs.field_Cb.d(Integer.toString(var31), var35, 20 + var6 + (var27 - -rs.field_Cb.field_J), 16777215, -1);
                                var34 = 0;
                                break L66;
                              } else {
                                break L66;
                              }
                            }
                            gf.a(var32, 20 + var6, var27, 789516);
                            var31++;
                            if (var40 == 0) {
                              continue L65;
                            } else {
                              break L37;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            stackOut_168_0 = var5;
            stackOut_168_1 = var6;
            stackIn_169_0 = stackOut_168_0;
            stackIn_169_1 = stackOut_168_1;
            break L36;
          }
          L69: {
            L70: {
              gf.d(stackIn_169_0, stackIn_169_1, var5 - -var4, var7 + var6);
              if (((kq) this).field_s.field_P.field_z) {
                break L70;
              } else {
                if (((kq) this).field_s.field_n == null) {
                  break L69;
                } else {
                  if ((1 << ((kq) this).field_s.field_n.field_x & ((kq) this).field_s.field_P.field_w) == 0) {
                    break L69;
                  } else {
                    break L70;
                  }
                }
              }
            }
            rs.field_Cb.c(uo.field_d, var5 + 180, var6 + (var7 + -74), 16777215, -1);
            break L69;
          }
          var24 = (vd) (Object) ((kq) this).field_B.d(0);
          L71: while (true) {
            L72: {
              L73: {
                if (var24 == null) {
                  break L73;
                } else {
                  var24.a(127);
                  var24 = (vd) (Object) ((kq) this).field_B.a((byte) -71);
                  if (var40 != 0) {
                    break L72;
                  } else {
                    if (var40 == 0) {
                      continue L71;
                    } else {
                      break L73;
                    }
                  }
                }
              }
              gf.b(var8_array);
              break L72;
            }
            L74: {
              if (((kq) this).field_r == null) {
                break L74;
              } else {
                if (((kq) this).field_jb <= 60) {
                  break L74;
                } else {
                  this.a(false, ((kq) this).field_r);
                  break L74;
                }
              }
            }
            return;
          }
        }
    }

    private final void b(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        RuntimeException decompiledCaughtException = null;
        var21 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var6_int = ((kq) this).field_s.field_P.field_r;
              var7 = ((kq) this).field_G[param4][-1 + var6_int];
              var8 = ((kq) this).field_G[param4][var6_int + -2];
              if (null == ((kq) this).field_s.field_n) {
                break L1;
              } else {
                if (~((kq) this).field_s.field_n.field_x == ~var7) {
                  break L1;
                } else {
                  var8 = ((kq) this).field_s.field_n.field_x;
                  break L1;
                }
              }
            }
            L2: {
              var9 = ((kq) this).field_ob[param0];
              if (param3 >= 43) {
                break L2;
              } else {
                this.b(-128);
                break L2;
              }
            }
            L3: {
              L4: {
                L5: {
                  ga.a(var9, param1, param2, (byte) -63, 190);
                  rs.field_Cb.d(jo.field_g[param4], 10 + param2, param1 - -rs.field_Cb.field_J, 16777215, -1);
                  var10 = 210;
                  var11 = var10 / (6 - -var6_int);
                  var12 = 2 * var11 + 12;
                  var13 = -(var11 * 8) + var10;
                  var14 = var9 - 27;
                  if (((kq) this).field_p[param0] != 0) {
                    break L5;
                  } else {
                    this.a(var7, 2, param4, param2 - -10, rs.field_Cb.field_J + param1 + (var14 >> 1));
                    this.a(var8, 2, param4, param2 - -10, param1 - (-rs.field_Cb.field_J + -var14));
                    if (var21 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                var15 = kf.a(((kq) this).field_G[param4], 117);
                var16 = 0;
                L6: while (true) {
                  if (~var6_int >= ~var16) {
                    break L4;
                  } else {
                    var17 = (var6_int * var14 - (var15[var16] * var14 >> 1)) / var6_int;
                    var18 = (var6_int - var15[var16]) * var14 / var6_int;
                    var19 = (-var12 + ((kq) this).field_ob[param0] << 8) / var13;
                    if (var21 != 0) {
                      break L3;
                    } else {
                      L7: {
                        if (~var16 != ~var7) {
                          break L7;
                        } else {
                          var17 = var14 >> 1;
                          var19 = 256;
                          break L7;
                        }
                      }
                      L8: {
                        if (var16 == var8) {
                          var17 = var14;
                          var19 = 256;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      var20 = rs.field_Cb.field_J + param1 - -re.a(var17, 32, ((kq) this).field_p[param0], var18, 0);
                      this.a(param4, var20, var16, var19, (byte) 58, 10 + param2);
                      var16++;
                      if (var21 == 0) {
                        continue L6;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
              }
              break L3;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var6, "kq.P(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void o(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (((kq) this).field_bb != null) {
                ((kq) this).field_bb.field_p = false;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              ((kq) this).field_e.field_s = false;
              if (((kq) this).field_j == null) {
                break L2;
              } else {
                ((kq) this).field_j.field_s = false;
                break L2;
              }
            }
            L3: {
              ((kq) this).field_J.field_s = false;
              ((kq) this).field_cb.field_s = false;
              if (param0 == -4956) {
                break L3;
              } else {
                ((kq) this).field_B = null;
                break L3;
              }
            }
            L4: {
              if (null == ((kq) this).field_nb) {
                break L4;
              } else {
                ((kq) this).field_nb.field_s = false;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "kq.T(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3, byte param4, int param5) {
        fs var7 = null;
        int var8 = 0;
        if (param4 != 58) {
            return;
        }
        try {
            var7 = ((kq) this).field_s.field_P.field_v[param2];
            var8 = var7.field_s;
            rs.field_Cb.c(((kq) this).field_l[param0][param2], param5 + 27, param1, var8, -1, param3);
            rs.field_Cb.d(eh.field_I[((kq) this).field_q[param0][param2]], 37 + param5, param1, var8, -1, param3);
            rs.field_Cb.d(var7.field_t, param5 - -67, param1, var8, -1, param3);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "kq.FB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final void c(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Integer var10_ref_Integer = null;
        int var11_int = 0;
        String var11 = null;
        jh var12 = null;
        int var13 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_39_0 = 0;
        int stackOut_39_1 = 0;
        var13 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = ((kq) this).field_b;
              var3 = 32;
              if (var2_int >= 32) {
                break L1;
              } else {
                var3 = var2_int;
                break L1;
              }
            }
            var4 = re.a(20, 32, var3, 550, 0);
            var5 = (-var4 + 640) / 2;
            var6 = 80;
            var7 = -10 + (320 + var5 + 40);
            var8 = var6 + 51;
            var9 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (4 <= var9) {
                    break L4;
                  } else {
                    var10 = ((kq) this).field_ob[var9];
                    stackOut_5_0 = ~var7;
                    stackOut_5_1 = ~pd.field_k;
                    stackIn_40_0 = stackOut_5_0;
                    stackIn_40_1 = stackOut_5_1;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    if (var13 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (stackIn_6_0 < stackIn_6_1) {
                          break L5;
                        } else {
                          if (var8 > bb.field_b) {
                            break L5;
                          } else {
                            if (190 + var7 <= pd.field_k) {
                              break L5;
                            } else {
                              if (bb.field_b > var8 - -var10) {
                                break L5;
                              } else {
                                if (var13 == 0) {
                                  break L4;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                        }
                      }
                      var8 = var8 + (var10 - -8);
                      var9++;
                      if (var13 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                L6: {
                  boolean discarded$1 = wj.a(((kq) this).field_B, (byte) -112);
                  if (dn.field_h == null) {
                    break L6;
                  } else {
                    L7: {
                      var10_ref_Integer = (Integer) dn.field_h.field_h;
                      var11_int = var10_ref_Integer.intValue();
                      this.a(var11_int, (byte) -116);
                      if (((kq) this).field_hb.f(244874369)) {
                        ((kq) this).field_hb.e((byte) 124);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      if (!((kq) this).field_gb.f(244874369)) {
                        break L8;
                      } else {
                        ((kq) this).field_gb.e((byte) 81);
                        break L8;
                      }
                    }
                    L9: {
                      if (((kq) this).field_db.f(244874369)) {
                        ((kq) this).field_db.e((byte) 111);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      if (((kq) this).field_a.f(244874369)) {
                        ((kq) this).field_a.e((byte) 9);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    var12 = (jh) (Object) dn.field_h;
                    var12.e((byte) 102);
                    break L6;
                  }
                }
                stackOut_39_0 = 4;
                stackOut_39_1 = var9;
                stackIn_40_0 = stackOut_39_0;
                stackIn_40_1 = stackOut_39_1;
                break L3;
              }
              L11: {
                L12: {
                  if (stackIn_40_0 == stackIn_40_1) {
                    break L12;
                  } else {
                    L13: {
                      L14: {
                        ((kq) this).field_w = var9;
                        var10 = ((kq) this).field_w + ((kq) this).field_D * 4;
                        var11 = bk.field_b[var10];
                        if (var11 != ((kq) this).field_r) {
                          break L14;
                        } else {
                          ((kq) this).field_jb = ((kq) this).field_jb + 1;
                          if (var13 == 0) {
                            break L13;
                          } else {
                            break L14;
                          }
                        }
                      }
                      ((kq) this).field_r = bk.field_b[var10];
                      ((kq) this).field_jb = 0;
                      break L13;
                    }
                    if (var13 == 0) {
                      break L11;
                    } else {
                      break L12;
                    }
                  }
                }
                ((kq) this).field_r = null;
                ((kq) this).field_jb = 0;
                break L11;
              }
              L15: {
                if (param0 < -26) {
                  break L15;
                } else {
                  this.a(102, 27, (byte) -57, -80);
                  break L15;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "kq.H(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        fs var6 = ((kq) this).field_s.field_P.field_v[param0];
        if (param1 != 2) {
            return;
        }
        try {
            var7 = var6.field_s;
            rs.field_Cb.b(((kq) this).field_l[param2][param0], param3 + 27, param4, var7, -1);
            rs.field_Cb.d(eh.field_I[((kq) this).field_q[param2][param0]], param3 - -37, param4, var7, -1);
            rs.field_Cb.d(var6.field_t, 67 + param3, param4, var7, -1);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "kq.CB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void a(String param0, boolean param1, byte param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        try {
          L0: {
            L1: {
              if (!param0.startsWith("production")) {
                break L1;
              } else {
                ((kq) this).field_e.field_s = param1;
                break L1;
              }
            }
            if (param2 == 31) {
              L2: {
                if (param0.startsWith("projects")) {
                  ((kq) this).field_j.field_s = param1;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (param0.startsWith("fleets")) {
                  ((kq) this).field_cb.field_s = param1;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (!param0.startsWith("diplomacy")) {
                  break L4;
                } else {
                  ((kq) this).field_J.field_s = param1;
                  break L4;
                }
              }
              L5: {
                if (!param0.startsWith("victory")) {
                  break L5;
                } else {
                  if (null != ((kq) this).field_nb) {
                    ((kq) this).field_nb.field_s = param1;
                    break L5;
                  } else {
                    break L5;
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
          L6: {
            var4 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var4;
            stackOut_24_1 = new StringBuilder().append("kq.L(");
            stackIn_27_0 = stackOut_24_0;
            stackIn_27_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L6;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_28_0 = stackOut_25_0;
              stackIn_28_1 = stackOut_25_1;
              stackIn_28_2 = stackOut_25_2;
              break L6;
            }
          }
          throw r.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(int param0) {
        RuntimeException runtimeException = null;
        rh var2 = null;
        int var3 = 0;
        lp var4 = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              ((kq) this).field_j.field_z.e(0);
              ((kq) this).field_j.field_A = false;
              ((kq) this).field_S.d(false);
              var2 = (rh) (Object) ((kq) this).field_j.field_x;
              if (param0 == 428) {
                break L1;
              } else {
                this.a(95, (sd) null, true);
                break L1;
              }
            }
            var3 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (4 <= var3) {
                    break L4;
                  } else {
                    var4 = e.a(((kq) this).field_s.field_n.field_u[var3], (byte) -68, var3, var2);
                    var4.a((byte) 62, ((kq) this).field_j.field_z.field_k, ((kq) this).field_j.field_z.field_y + ((kq) this).field_j.field_z.field_t);
                    ((kq) this).field_j.field_z.a((vd) (Object) var4, 8);
                    if (var5 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (5 > ((kq) this).field_s.field_n.field_u[var3]) {
                          break L5;
                        } else {
                          ((kq) this).field_j.field_A = true;
                          ((kq) this).field_S.g(param0 ^ 464);
                          break L5;
                        }
                      }
                      var3++;
                      if (var5 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw r.a((Throwable) (Object) runtimeException, "kq.HB(" + param0 + ')');
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        String var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5 = cl.field_m.toUpperCase() + ": " + tc.field_E[2];
            int discarded$1 = rs.field_Cb.a(var5, param3 - -5, param1 - -5, param0 + -10, 480, 16777215, -1, 0, 0, rs.field_Cb.field_J);
            var6 = vg.field_t.field_z * 2 + rs.field_Cb.c("= " + vs.field_a);
            gf.a((param0 + -var6) / 2 + (param3 + -10), 15 + (param1 + rs.field_Cb.field_J), var6 - -20, 10 + vg.field_t.field_w * 3, 5, 0, 128);
            var7 = 29 + (rs.field_Cb.field_J + param1);
            var8 = vg.field_t.field_z + rs.field_Cb.c("= " + re.a(hg.field_s, 4371, new String[1]));
            ek.field_z.f((-ek.field_z.field_z + vg.field_t.field_z) / 2 + (param0 + -var8) / 2 + param3, var7);
            vg.field_t.f((-var8 + param0) / 2 + param3, var7 - 9);
            gf.b(em.field_c[0] + (param3 + (vg.field_t.field_z + (param0 - var8)) / 2 << 4), ul.field_Db[0] + (var7 + ek.field_z.field_w / 2 << 4), 50, 7, h.field_s);
            gf.b((param3 + (vg.field_t.field_z + param0 + -var8) / 2 << 4) + em.field_c[2], (ek.field_z.field_w / 2 + var7 << 4) + ul.field_Db[2], 50, 7, h.field_s);
            gf.b(em.field_c[3] + ((vg.field_t.field_z + (-var8 + param0)) / 2 + param3 << 4), (ek.field_z.field_w / 2 + var7 << 4) - -ul.field_Db[3], 50, 7, h.field_s);
            rs.field_Cb.d("= " + re.a(hg.field_s, 4371, new String[1]), vg.field_t.field_z + param3 + ((-var8 + param0) / 2 + 5), vg.field_t.field_w / 2 + var7 - 4, 16777215, -1);
            var7 = var7 + vg.field_t.field_w;
            ek.field_z.f(param3 + ((-var8 + param0) / 2 - -((-ek.field_z.field_z + vg.field_t.field_z) / 2)), var7);
            vg.field_t.f((param0 - var8) / 2 + param3, var7 + -9);
            var9 = 87 % ((-25 - param2) / 51);
            gf.b((param3 + (vg.field_t.field_z + (-var8 + param0)) / 2 << 4) - -em.field_c[0], ul.field_Db[0] + (ek.field_z.field_w / 2 + var7 << 4), 50, 7, h.field_s);
            gf.b(((vg.field_t.field_z + -var8 + param0) / 2 + param3 << 4) + em.field_c[1], ul.field_Db[1] + (ek.field_z.field_w / 2 + var7 << 4), 50, 7, h.field_s);
            rs.field_Cb.d("= " + re.a(hg.field_s, 4371, new String[1]), 5 + vg.field_t.field_z + ((param0 - var8) / 2 + param3), -4 + (var7 + vg.field_t.field_w / 2), 16777215, -1);
            var7 = var7 + vg.field_t.field_w;
            ek.field_z.f(-5 + (param3 - -((-var6 + param0) / 2) + (-ek.field_z.field_z + vg.field_t.field_z) / 2), var7);
            vg.field_t.f((-var6 + param0) / 2 + param3 - 5, var7 - 9);
            gf.b(em.field_c[0] + (-5 + ((vg.field_t.field_z + (param0 - var6)) / 2 + param3) << 4), ul.field_Db[0] + (var7 - -(ek.field_z.field_w / 2) << 4), 50, 7, h.field_s);
            ek.field_z.f(-5 + (vg.field_t.field_z + (-var6 + param0) / 2 + param3) - -((-ek.field_z.field_z + vg.field_t.field_z) / 2), var7);
            vg.field_t.f(param3 - -((-var6 + param0) / 2) + (vg.field_t.field_z - 5), var7 - 9);
            rs.field_Cb.d("= " + vs.field_a, 2 * vg.field_t.field_z + (-var6 + param0) / 2 + param3, vg.field_t.field_w / 2 + (-4 + var7), 16777215, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          throw r.a((Throwable) (Object) var5_ref, "kq.NA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void c(int param0, int param1, int param2, int param3) {
        String var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5 = cl.field_m.toUpperCase() + ": " + tc.field_E[1];
            int discarded$1 = rs.field_Cb.a(var5, 5 + param0, param2 - -5, -10 + param3, 480, 16777215, -1, 0, 0, rs.field_Cb.field_J);
            var6 = qe.field_j.field_z + rs.field_Cb.c("= " + vs.field_a);
            gf.a(-5 + (param3 - var6) / 2 + param0, 20 + rs.field_Cb.field_J + param2, var6 - -15, qe.field_j.field_w + 10, 5, 0, 128);
            qe.field_j.f(param0 - -((param3 + -var6) / 2), rs.field_Cb.field_J + (param2 + 20));
            rs.field_Cb.d("= " + vs.field_a, (param3 - var6) / 2 + (param0 - -qe.field_j.field_z), 25 + rs.field_Cb.field_J + (qe.field_j.field_w / 2 + param2), 16777215, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          throw r.a((Throwable) (Object) var5_ref, "kq.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(int param0, byte param1) {
        RuntimeException var3 = null;
        dc var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        fs[] var7 = null;
        int var8 = 0;
        int var9_int = 0;
        fs var9 = null;
        um var10 = null;
        int[][] var10_array = null;
        int var11_int = 0;
        int[] var11 = null;
        int[] var12 = null;
        int var12_int = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int stackIn_25_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_44_0 = 0;
        int[] stackIn_58_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_24_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_43_0 = 0;
        int[] stackOut_57_0 = null;
        int[] stackOut_56_0 = null;
        int[] stackOut_54_0 = null;
        var15 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var3_ref = ((kq) this).field_s.field_P;
                var4 = var3_ref.field_r;
                var5 = 1 + var3_ref.field_O - ((kq) this).field_s.field_q;
                if (((kq) this).field_D == param0) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      if (((kq) this).field_kb != 0) {
                        break L4;
                      } else {
                        ((kq) this).field_Z = ((kq) this).field_C;
                        if (var15 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    ((kq) this).field_Z = this.j(410);
                    break L3;
                  }
                  ((kq) this).field_kb = 1;
                  ((kq) this).field_D = param0;
                  if (var15 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((kq) this).field_Z = ((kq) this).field_C;
              break L1;
            }
            L5: {
              var6 = 8 / ((-73 - param1) / 42);
              if (100 < var5) {
                var5 = 100;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              L7: {
                L8: {
                  if (((kq) this).field_Z == null) {
                    break L8;
                  } else {
                    if (var5 == ((kq) this).field_Z[0].length) {
                      break L8;
                    } else {
                      L9: {
                        var7_int = ((kq) this).field_Z[0].length;
                        if (var5 <= var7_int) {
                          stackOut_24_0 = var5;
                          stackIn_25_0 = stackOut_24_0;
                          break L9;
                        } else {
                          stackOut_22_0 = var7_int;
                          stackIn_25_0 = stackOut_22_0;
                          break L9;
                        }
                      }
                      L10: {
                        var8 = stackIn_25_0;
                        var9_int = -var5 + var7_int;
                        if (var9_int < 0) {
                          var9_int = 0;
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      var10_array = new int[var4][];
                      var11_int = 0;
                      L11: while (true) {
                        L12: {
                          if (var11_int >= var4) {
                            break L12;
                          } else {
                            var10_array[var11_int] = new int[var5];
                            ps.a(((kq) this).field_Z[var11_int], var9_int, var10_array[var11_int], 0, var8);
                            stackOut_31_0 = var7_int;
                            stackIn_44_0 = stackOut_31_0;
                            stackIn_32_0 = stackOut_31_0;
                            if (var15 != 0) {
                              break L6;
                            } else {
                              var12_int = stackIn_32_0;
                              L13: while (true) {
                                L14: {
                                  L15: {
                                    if (~var5 >= ~var12_int) {
                                      break L15;
                                    } else {
                                      var10_array[var11_int][var12_int] = ((kq) this).field_Z[var11_int][-1 + var7_int];
                                      var12_int++;
                                      if (var15 != 0) {
                                        break L14;
                                      } else {
                                        if (var15 == 0) {
                                          continue L13;
                                        } else {
                                          break L15;
                                        }
                                      }
                                    }
                                  }
                                  var11_int++;
                                  break L14;
                                }
                                if (var15 == 0) {
                                  continue L11;
                                } else {
                                  break L12;
                                }
                              }
                            }
                          }
                        }
                        ((kq) this).field_kb = 1;
                        ((kq) this).field_Z = var10_array;
                        ((kq) this).field_H = var7_int;
                        if (var15 == 0) {
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                }
                ((kq) this).field_H = var5;
                break L7;
              }
              ((kq) this).field_fb = var5;
              stackOut_43_0 = 1;
              stackIn_44_0 = stackOut_43_0;
              break L6;
            }
            L16: {
              L17: {
                if (stackIn_44_0 >= var5) {
                  break L17;
                } else {
                  ((kq) this).field_C = new int[var4][];
                  var7 = var3_ref.field_v;
                  var8 = 0;
                  L18: while (true) {
                    L19: {
                      if (var7.length <= var8) {
                        break L19;
                      } else {
                        var9 = var7[var8];
                        var10 = var9.field_q;
                        if (var15 != 0) {
                          break L16;
                        } else {
                          L20: {
                            if (((kq) this).field_D == 1) {
                              stackOut_57_0 = var10.field_f;
                              stackIn_58_0 = stackOut_57_0;
                              break L20;
                            } else {
                              if (((kq) this).field_D == 2) {
                                stackOut_56_0 = var10.field_h;
                                stackIn_58_0 = stackOut_56_0;
                                break L20;
                              } else {
                                stackOut_54_0 = var10.field_g;
                                stackIn_58_0 = stackOut_54_0;
                                break L20;
                              }
                            }
                          }
                          var11 = stackIn_58_0;
                          var12 = new int[var5];
                          var13 = 0;
                          L21: while (true) {
                            L22: {
                              L23: {
                                if (var13 >= var5) {
                                  break L23;
                                } else {
                                  var14 = (1 + var13 + var3_ref.field_O + (100 - var5)) % 100;
                                  var12[var13] = var11[var14] << 10;
                                  var13++;
                                  if (var15 != 0) {
                                    break L22;
                                  } else {
                                    if (var15 == 0) {
                                      continue L21;
                                    } else {
                                      break L23;
                                    }
                                  }
                                }
                              }
                              ((kq) this).field_C[var9.field_x] = var12;
                              var8++;
                              break L22;
                            }
                            if (var15 == 0) {
                              continue L18;
                            } else {
                              break L19;
                            }
                          }
                        }
                      }
                    }
                    if (var15 == 0) {
                      break L16;
                    } else {
                      break L17;
                    }
                  }
                }
              }
              ((kq) this).field_C = null;
              break L16;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var3, "kq.AA(" + param0 + ',' + param1 + ')');
        }
    }

    final void b(int param0, int param1) {
        RuntimeException runtimeException = null;
        rh var3 = null;
        lp var4 = null;
        vd var5 = null;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var3 = (rh) (Object) ((kq) this).field_j.field_x;
              if (var3.field_b[param0] == null) {
                break L1;
              } else {
                var3.field_b[param0].a((byte) -126, ii.field_s);
                break L1;
              }
            }
            L2: {
              var4 = var3.field_c[param0];
              if (param1 == 2) {
                break L2;
              } else {
                this.a((byte) 43);
                break L2;
              }
            }
            var4.field_o = jd.field_h;
            var5 = (vd) (Object) var4.field_l.d(param1 + -2);
            L3: while (true) {
              L4: {
                L5: {
                  if (null == var5) {
                    break L5;
                  } else {
                    if (var6 != 0) {
                      break L4;
                    } else {
                      L6: {
                        if (var5.field_o == null) {
                          break L6;
                        } else {
                          var5.field_o = jd.field_h;
                          break L6;
                        }
                      }
                      var5 = (vd) (Object) var4.field_l.a((byte) -71);
                      if (var6 == 0) {
                        continue L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                break L4;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw r.a((Throwable) (Object) runtimeException, "kq.AB(" + param0 + ',' + param1 + ')');
        }
    }

    public static void d(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_c = null;
              field_A = null;
              field_i = null;
              field_R = null;
              field_h = null;
              if (param0 == 320) {
                break L1;
              } else {
                field_L = null;
                break L1;
              }
            }
            field_L = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var1, "kq.IA(" + param0 + ')');
        }
    }

    private final void e(int param0) {
        RuntimeException var2 = null;
        int[] var2_array = null;
        ln[] var3_ref_ln__ = null;
        fs[] var3_ref_fs__ = null;
        int var3 = 0;
        int var4_int = 0;
        int[] var4 = null;
        fs[] var4_array = null;
        ln var5_ref_ln = null;
        fs var5_ref_fs = null;
        int var5 = 0;
        int var6_int = 0;
        sd var6 = null;
        fs var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        lp var9 = null;
        int var10 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        boolean stackIn_11_0 = false;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_29_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        boolean stackOut_10_0 = false;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        int stackOut_28_0 = 0;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            ((kq) this).field_cb.field_z.e(param0);
            var2_array = new int[((kq) this).field_s.field_P.field_r];
            var3_ref_ln__ = ((kq) this).field_s.field_P.field_g.field_e;
            var4_int = 0;
            L1: while (true) {
              L2: {
                if (var4_int >= var3_ref_ln__.length) {
                  break L2;
                } else {
                  L3: {
                    var5_ref_ln = var3_ref_ln__[var4_int];
                    if (var5_ref_ln.field_y == null) {
                      break L3;
                    } else {
                      var2_array[var5_ref_ln.field_y.field_x] = var2_array[var5_ref_ln.field_y.field_x] + var5_ref_ln.field_x;
                      break L3;
                    }
                  }
                  var4_int++;
                  if (var10 == 0) {
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              var3_ref_fs__ = ((kq) this).field_s.field_P.field_v;
              var4_int = 0;
              L4: while (true) {
                stackOut_8_0 = ~var3_ref_fs__.length;
                stackOut_8_1 = ~var4_int;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                L5: while (true) {
                  L6: {
                    L7: {
                      if (stackIn_9_0 >= stackIn_9_1) {
                        break L7;
                      } else {
                        var5_ref_fs = var3_ref_fs__[var4_int];
                        stackOut_10_0 = ((kq) this).field_s.field_P.field_o.field_i;
                        stackIn_29_0 = stackOut_10_0 ? 1 : 0;
                        stackIn_11_0 = stackOut_10_0;
                        if (var10 != 0) {
                          break L6;
                        } else {
                          L8: {
                            L9: {
                              if (stackIn_11_0) {
                                break L9;
                              } else {
                                var6 = (sd) (Object) var5_ref_fs.field_i.d(0);
                                L10: while (true) {
                                  L11: {
                                    if (null == var6) {
                                      break L11;
                                    } else {
                                      stackOut_16_0 = ~var6.field_r;
                                      stackOut_16_1 = -1;
                                      stackIn_9_0 = stackOut_16_0;
                                      stackIn_9_1 = stackOut_16_1;
                                      stackIn_17_0 = stackOut_16_0;
                                      stackIn_17_1 = stackOut_16_1;
                                      if (var10 != 0) {
                                        continue L5;
                                      } else {
                                        L12: {
                                          if (stackIn_17_0 >= stackIn_17_1) {
                                            break L12;
                                          } else {
                                            var2_array[var5_ref_fs.field_x] = var2_array[var5_ref_fs.field_x] + var6.field_r;
                                            break L12;
                                          }
                                        }
                                        var6 = (sd) (Object) var5_ref_fs.field_i.a((byte) -71);
                                        if (var10 == 0) {
                                          continue L10;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                  }
                                  if (var10 == 0) {
                                    break L8;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                            }
                            if (0 >= var5_ref_fs.field_m.field_r) {
                              break L8;
                            } else {
                              var2_array[var5_ref_fs.field_x] = var2_array[var5_ref_fs.field_x] + var5_ref_fs.field_m.field_r;
                              break L8;
                            }
                          }
                          var4_int++;
                          if (var10 == 0) {
                            continue L4;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                    stackOut_28_0 = 0;
                    stackIn_29_0 = stackOut_28_0;
                    break L6;
                  }
                  var3 = stackIn_29_0;
                  var4 = var2_array;
                  var5 = 0;
                  L13: while (true) {
                    L14: {
                      if (var4.length <= var5) {
                        break L14;
                      } else {
                        L15: {
                          var6_int = var4[var5];
                          if (~var6_int >= ~var3) {
                            break L15;
                          } else {
                            var3 = var6_int;
                            break L15;
                          }
                        }
                        var5++;
                        if (var10 == 0) {
                          continue L13;
                        } else {
                          break L14;
                        }
                      }
                    }
                    var4_array = ((kq) this).field_s.field_P.field_v;
                    var5 = param0;
                    L16: while (true) {
                      L17: {
                        L18: {
                          if (var4_array.length <= var5) {
                            break L18;
                          } else {
                            var6_ref = var4_array[var5];
                            var7 = var2_array[var6_ref.field_x];
                            var8 = var6_ref.field_v.field_o / 2 - -((-var6_ref.field_v.field_o + 182) * var7 / var3);
                            var9 = sl.a(var7, -30577, var6_ref, var8);
                            var9.a((byte) 39, ((kq) this).field_cb.field_z.field_k, ((kq) this).field_cb.field_z.field_y + ((kq) this).field_cb.field_z.field_t);
                            ((kq) this).field_cb.field_z.a((vd) (Object) var9, 8);
                            var5++;
                            if (var10 != 0) {
                              break L17;
                            } else {
                              if (var10 == 0) {
                                continue L16;
                              } else {
                                break L18;
                              }
                            }
                          }
                        }
                        break L17;
                      }
                      break L0;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "kq.EB(" + param0 + ')');
        }
    }

    final void c(int param0, int param1) {
        RuntimeException runtimeException = null;
        rh var3 = null;
        lp var4 = null;
        vd var5 = null;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var3 = (rh) (Object) ((kq) this).field_j.field_x;
              if (null == var3.field_b[param0]) {
                break L1;
              } else {
                var3.field_b[param0].a((byte) -88, mf.field_v);
                break L1;
              }
            }
            L2: {
              if (param1 > 126) {
                break L2;
              } else {
                this.a(-90);
                break L2;
              }
            }
            var4 = var3.field_c[param0];
            var4.field_o = mm.field_q;
            var5 = (vd) (Object) var4.field_l.d(0);
            L3: while (true) {
              L4: {
                L5: {
                  if (var5 == null) {
                    break L5;
                  } else {
                    if (var6 != 0) {
                      break L4;
                    } else {
                      L6: {
                        if (var5.field_o == null) {
                          break L6;
                        } else {
                          var5.field_o = mm.field_q;
                          break L6;
                        }
                      }
                      var5 = (vd) (Object) var4.field_l.a((byte) -71);
                      if (var6 == 0) {
                        continue L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                break L4;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw r.a((Throwable) (Object) runtimeException, "kq.HA(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(fs[] param0, int param1) {
        RuntimeException var3 = null;
        String[] var3_array = null;
        boolean[] var4 = null;
        int var5 = 0;
        fs[] var6 = null;
        int[][] var6_array = null;
        int var7_int = 0;
        int[][] var7 = null;
        fs var8_ref_fs = null;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var3_array = new String[param1 + param0.length];
            var4 = new boolean[param0.length - -1];
            var5 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var5 >= ((kq) this).field_ab.length - 1) {
                    break L3;
                  } else {
                    var3_array[var5] = ((kq) this).field_ab[var5];
                    var4[var5] = ((kq) this).field_z[var5];
                    var5++;
                    if (var9 != 0) {
                      break L2;
                    } else {
                      if (var9 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var3_array[-1 + var3_array.length] = ((kq) this).field_ab[-1 + ((kq) this).field_ab.length];
                var4[var4.length + -1] = ((kq) this).field_z[((kq) this).field_z.length - 1];
                ((kq) this).field_ab = var3_array;
                ((kq) this).field_z = var4;
                this.e(param1 + -1);
                var5 = ((kq) this).field_cb.field_i;
                ((kq) this).field_cb.a(true, ((kq) this).field_cb.field_z.field_y + 28, ((kq) this).field_cb.field_m);
                ((kq) this).field_cb.field_z.a(true, ((kq) this).field_cb.field_z.field_y - -10, ((kq) this).field_cb.field_z.field_m);
                ((kq) this).field_cb.d(-((kq) this).field_cb.field_i + var5, 0, 0);
                this.f(param1 + -15908);
                this.i(6);
                break L2;
              }
              var6 = ((kq) this).field_s.field_P.field_v;
              var7_int = 0;
              L4: while (true) {
                L5: {
                  L6: {
                    if (var6.length <= var7_int) {
                      break L6;
                    } else {
                      var8_ref_fs = var6[var7_int];
                      this.a((byte) -113, var8_ref_fs);
                      var7_int++;
                      if (var9 != 0) {
                        break L5;
                      } else {
                        if (var9 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  ((kq) this).field_J.a(true, ((kq) this).field_J.field_z.field_y - -28, ((kq) this).field_J.field_m);
                  ((kq) this).field_J.field_z.a(true, 10 + ((kq) this).field_J.field_z.field_y, ((kq) this).field_J.field_z.field_m);
                  break L5;
                }
                L7: {
                  var6_array = new int[param0.length][];
                  var7 = new int[param0.length][];
                  if (null == ((kq) this).field_C) {
                    break L7;
                  } else {
                    var8 = 0;
                    L8: while (true) {
                      L9: {
                        L10: {
                          if (var8 >= ((kq) this).field_C.length) {
                            break L10;
                          } else {
                            var6_array[var8] = ((kq) this).field_C[var8];
                            var8++;
                            if (var9 != 0) {
                              break L9;
                            } else {
                              if (var9 == 0) {
                                continue L8;
                              } else {
                                break L10;
                              }
                            }
                          }
                        }
                        var6_array[-1 + param0.length] = new int[var6_array[0].length];
                        break L9;
                      }
                      ((kq) this).field_C = var6_array;
                      break L7;
                    }
                  }
                }
                L11: {
                  if (null != ((kq) this).field_Z) {
                    var8 = 0;
                    L12: while (true) {
                      L13: {
                        L14: {
                          if (var8 >= ((kq) this).field_Z.length) {
                            break L14;
                          } else {
                            var7[var8] = ((kq) this).field_Z[var8];
                            var8++;
                            if (var9 != 0) {
                              break L13;
                            } else {
                              if (var9 == 0) {
                                continue L12;
                              } else {
                                break L14;
                              }
                            }
                          }
                        }
                        var7[-1 + param0.length] = new int[var7[0].length];
                        break L13;
                      }
                      ((kq) this).field_Z = var7;
                      break L11;
                    }
                  } else {
                    break L11;
                  }
                }
                L15: {
                  if (kb.field_x == 7) {
                    ((kq) this).field_s.field_P.field_x = (me) (Object) new qg(param0);
                    ((kq) this).field_s.field_P.field_x.a((byte) -24, ((kq) this).field_s.field_P, (kq) this);
                    break L15;
                  } else {
                    break L15;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var3 = decompiledCaughtException;
            stackOut_40_0 = (RuntimeException) var3;
            stackOut_40_1 = new StringBuilder().append("kq.GB(");
            stackIn_43_0 = stackOut_40_0;
            stackIn_43_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param0 == null) {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L16;
            } else {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "{...}";
              stackIn_44_0 = stackOut_41_0;
              stackIn_44_1 = stackOut_41_1;
              stackIn_44_2 = stackOut_41_2;
              break L16;
            }
          }
          throw r.a((Throwable) (Object) stackIn_44_0, stackIn_44_2 + ',' + param1 + ')');
        }
    }

    final static void g(int param0) {
        if (!sq.a(false)) {
            return;
        }
        try {
            gm.a(false, 63, param0);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "kq.DB(" + param0 + ')');
        }
    }

    final void l(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        vd var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        boolean stackIn_38_0 = false;
        int stackIn_45_0 = 0;
        boolean stackIn_108_0 = false;
        int stackIn_115_0 = 0;
        int stackIn_122_0 = 0;
        String stackIn_140_0 = null;
        String stackIn_163_0 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_37_0 = false;
        int stackOut_44_0 = 0;
        boolean stackOut_107_0 = false;
        int stackOut_114_0 = 0;
        int stackOut_121_0 = 0;
        int stackOut_119_0 = 0;
        String stackOut_139_0 = null;
        String stackOut_138_0 = null;
        String stackOut_136_0 = null;
        String stackOut_162_0 = null;
        String stackOut_160_0 = null;
        var12 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!((kq) this).field_s.field_W) {
                break L1;
              } else {
                mq.a((byte) -44);
                break L1;
              }
            }
            L2: {
              if (!((kq) this).field_s.field_f) {
                break L2;
              } else {
                if (!((kq) this).field_s.field_P.field_z) {
                  L3: {
                    gf.a(h.field_F.field_z * 3 + 521, 4, rk.field_j.field_z, -2 + rs.field_Cb.field_J, 2, 0, 128);
                    var2_int = (((kq) this).field_s.field_S - -49) / 50;
                    if (((kq) this).field_s.field_S < 0) {
                      rs.field_Cb.c(this.a(false, Math.abs(var2_int)), 521 - -(h.field_F.field_z * 3) + rk.field_j.field_z / 2, rs.field_Cb.field_J * 3 / 4 + 3, 16711680, -1);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (~mb.field_o[((kq) this).field_s.field_P.field_J] < ~(3 * ((kq) this).field_s.field_S)) {
                      break L4;
                    } else {
                      rs.field_Cb.c(this.a(false, Math.abs(var2_int)), rk.field_j.field_z / 2 + 3 * h.field_F.field_z + 521, rs.field_Cb.field_J * 3 / 4 + 3, 16777215, -1);
                      if (var12 == 0) {
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    var3_int = ((kq) this).field_s.field_S % 50;
                    if (30 <= var3_int) {
                      break L5;
                    } else {
                      if (var3_int >= 20) {
                        break L2;
                      } else {
                        if (var3_int >= 10) {
                          break L5;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  rs.field_Cb.c(this.a(false, Math.abs(var2_int)), h.field_F.field_z * 3 + 521 - -(rk.field_j.field_z / 2), 3 * rs.field_Cb.field_J / 4 + 3, 3974311, -1);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L6: {
              var2_int = 0 / ((param0 - 78) / 41);
              if (!((kq) this).field_s.field_W) {
                break L6;
              } else {
                if (ph.field_g) {
                  kb.field_w.f(((kq) this).field_bb.field_k + -10, ((kq) this).field_bb.field_t - 10);
                  break L6;
                } else {
                  break L6;
                }
              }
            }
            var3 = (vd) (Object) ((kq) this).field_y.f(3725);
            L7: while (true) {
              L8: {
                L9: {
                  if (var3 == null) {
                    break L9;
                  } else {
                    stackOut_37_0 = var3 instanceof qh;
                    stackIn_45_0 = stackOut_37_0 ? 1 : 0;
                    stackIn_38_0 = stackOut_37_0;
                    if (var12 != 0) {
                      break L8;
                    } else {
                      L10: {
                        if (!stackIn_38_0) {
                          var3.a(121);
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      var3 = (vd) (Object) ((kq) this).field_y.b(-125);
                      if (var12 == 0) {
                        continue L7;
                      } else {
                        break L9;
                      }
                    }
                  }
                }
                stackOut_44_0 = -14145;
                stackIn_45_0 = stackOut_44_0;
                break L8;
              }
              L11: {
                vn.d(stackIn_45_0);
                if (null == ((kq) this).field_O) {
                  break L11;
                } else {
                  ((kq) this).field_O.b(false, 96);
                  break L11;
                }
              }
              L12: {
                if (((kq) this).field_U != -1) {
                  var4 = ((kq) this).field_x;
                  var5 = 5 + (((kq) this).field_k.field_i + ((kq) this).field_k.field_t);
                  gf.a(((kq) this).field_k.field_k - -1, var5, ((kq) this).field_T.field_z + 10, rs.field_Cb.field_J, 5, 0);
                  gf.f(((kq) this).field_k.field_k, -1 + var5, 12 + ((kq) this).field_T.field_z, rs.field_Cb.field_J + 2, 6, 2052949);
                  sa.a(var4 * 5, ((kq) this).field_k.field_k - -6, (byte) 116, 32, ((kq) this).field_T, var5 - 4);
                  if (!((kq) this).field_ib) {
                    break L12;
                  } else {
                    var6 = ((kq) this).field_x - 125;
                    if (var6 > 0) {
                      L13: {
                        var7 = (var6 << 12) / 250;
                        var7 = var7 & 511;
                        if (256 >= var7) {
                          break L13;
                        } else {
                          var7 = 512 + -var7;
                          break L13;
                        }
                      }
                      ((kq) this).field_eb.c(6 + ((kq) this).field_k.field_k, var5 + -4, var7);
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                } else {
                  break L12;
                }
              }
              L14: {
                var4 = cl.field_n % 64;
                if (24 >= var4) {
                  break L14;
                } else {
                  if (var4 > 40) {
                    break L14;
                  } else {
                    var4 = 24;
                    break L14;
                  }
                }
              }
              L15: {
                if (var4 > 40) {
                  var4 = 64 + -var4;
                  break L15;
                } else {
                  break L15;
                }
              }
              L16: {
                var4 = 10 * var4;
                var5 = ui.a(16777215, 16711680, -125, var4);
                if (!((kq) this).field_e.field_A) {
                  break L16;
                } else {
                  if (((kq) this).field_mb.field_s) {
                    jq.field_b.b(((kq) this).field_mb.field_k, ((kq) this).field_mb.field_t, var5);
                    break L16;
                  } else {
                    break L16;
                  }
                }
              }
              L17: {
                if (null == ((kq) this).field_j) {
                  break L17;
                } else {
                  if (!((kq) this).field_j.field_A) {
                    break L17;
                  } else {
                    if (!((kq) this).field_S.field_s) {
                      break L17;
                    } else {
                      ci.field_p.b(((kq) this).field_S.field_k, ((kq) this).field_S.field_t, var5);
                      break L17;
                    }
                  }
                }
              }
              L18: {
                if (!((kq) this).field_cb.field_A) {
                  break L18;
                } else {
                  if (!((kq) this).field_W.field_s) {
                    break L18;
                  } else {
                    us.field_a.b(((kq) this).field_W.field_k, ((kq) this).field_W.field_t, var5);
                    break L18;
                  }
                }
              }
              L19: {
                if (!((kq) this).field_J.field_A) {
                  break L19;
                } else {
                  if (((kq) this).field_n.field_s) {
                    fl.field_b.b(((kq) this).field_n.field_k, ((kq) this).field_n.field_t, var5);
                    break L19;
                  } else {
                    break L19;
                  }
                }
              }
              L20: {
                if (null == ((kq) this).field_nb) {
                  break L20;
                } else {
                  if (!((kq) this).field_nb.field_A) {
                    break L20;
                  } else {
                    if (!((kq) this).field_g.field_s) {
                      break L20;
                    } else {
                      je.field_f.b(((kq) this).field_g.field_k, ((kq) this).field_g.field_t, var5);
                      break L20;
                    }
                  }
                }
              }
              var3 = (vd) (Object) ((kq) this).field_y.f(3725);
              L21: while (true) {
                L22: {
                  L23: {
                    if (var3 == null) {
                      break L23;
                    } else {
                      stackOut_107_0 = var3 instanceof qh;
                      stackIn_115_0 = stackOut_107_0 ? 1 : 0;
                      stackIn_108_0 = stackOut_107_0;
                      if (var12 != 0) {
                        break L22;
                      } else {
                        L24: {
                          if (stackIn_108_0) {
                            var3.a(123);
                            break L24;
                          } else {
                            break L24;
                          }
                        }
                        var3 = (vd) (Object) ((kq) this).field_y.b(-127);
                        if (var12 == 0) {
                          continue L21;
                        } else {
                          break L23;
                        }
                      }
                    }
                  }
                  stackOut_114_0 = 0;
                  stackIn_115_0 = stackOut_114_0;
                  break L22;
                }
                L25: {
                  var6 = stackIn_115_0;
                  var7 = 0;
                  var8 = null;
                  var9 = 0;
                  var10 = 16777215;
                  if (((kq) this).field_s.field_P.field_z) {
                    L26: {
                      if (((kq) this).field_s.field_P.field_k >= 0) {
                        stackOut_121_0 = 0;
                        stackIn_122_0 = stackOut_121_0;
                        break L26;
                      } else {
                        stackOut_119_0 = 1;
                        stackIn_122_0 = stackOut_119_0;
                        break L26;
                      }
                    }
                    L27: {
                      var6 = stackIn_122_0;
                      if (((kq) this).field_s.field_n == null) {
                        break L27;
                      } else {
                        L28: {
                          if ((1 << ((kq) this).field_s.field_n.field_x & ((kq) this).field_s.field_P.field_w) != 0) {
                            break L28;
                          } else {
                            if (((kq) this).field_s.field_P.field_x.a((byte) 69, ((kq) this).field_s.field_n)) {
                              break L28;
                            } else {
                              break L27;
                            }
                          }
                        }
                        var7 = 1;
                        break L27;
                      }
                    }
                    L29: {
                      if (var7 != 0) {
                        stackOut_139_0 = (String) field_L;
                        stackIn_140_0 = stackOut_139_0;
                        break L29;
                      } else {
                        if (var6 != 0) {
                          stackOut_138_0 = m.field_v;
                          stackIn_140_0 = stackOut_138_0;
                          break L29;
                        } else {
                          stackOut_136_0 = fj.field_o;
                          stackIn_140_0 = stackOut_136_0;
                          break L29;
                        }
                      }
                    }
                    var8 = (Object) (Object) stackIn_140_0;
                    if (((kq) this).field_s.field_n != null) {
                      break L25;
                    } else {
                      if (var6 != 0) {
                        break L25;
                      } else {
                        var8 = (Object) (Object) re.a(vp.field_t, 4371, new String[1]);
                        break L25;
                      }
                    }
                  } else {
                    break L25;
                  }
                }
                L30: {
                  if (((kq) this).field_s.field_n == null) {
                    break L30;
                  } else {
                    if ((((kq) this).field_s.field_P.field_w & 1 << ((kq) this).field_s.field_n.field_x) != 0) {
                      if (((kq) this).field_I) {
                        var9 = 1;
                        var8 = (Object) (Object) field_L;
                        break L30;
                      } else {
                        break L30;
                      }
                    } else {
                      break L30;
                    }
                  }
                }
                L31: {
                  if (null == var8) {
                    break L31;
                  } else {
                    L32: {
                      mp.field_b.a((String) var8, 320, 240, var10, -1, qd.field_f);
                      var11 = rs.field_Cb.field_J + 245;
                      if (var8 != (Object) (Object) m.field_v) {
                        break L32;
                      } else {
                        L33: {
                          if (((kq) this).field_s.field_P.field_w != 0) {
                            stackOut_162_0 = oh.field_g;
                            stackIn_163_0 = stackOut_162_0;
                            break L33;
                          } else {
                            stackOut_160_0 = ad.field_b;
                            stackIn_163_0 = stackOut_160_0;
                            break L33;
                          }
                        }
                        var8 = (Object) (Object) stackIn_163_0;
                        rs.field_Cb.a((String) var8, 320, var11, var10, -1, qd.field_f);
                        var11 = var11 + (3 + rs.field_Cb.field_J);
                        break L32;
                      }
                    }
                    rs.field_Cb.a(er.field_p, 320, var11, var10, -1, qd.field_f);
                    if (var9 == 0) {
                      break L31;
                    } else {
                      var11 = var11 + (rs.field_Cb.field_J - -3);
                      rs.field_Cb.a(vn.field_i, 320, var11, var10, -1, qd.field_f);
                      break L31;
                    }
                  }
                }
                L34: {
                  if (((kq) this).field_u == 0) {
                    break L34;
                  } else {
                    this.k(5512);
                    break L34;
                  }
                }
                L35: {
                  if (((kq) this).field_b != 0) {
                    this.a((byte) 11, ((kq) this).field_b);
                    break L35;
                  } else {
                    break L35;
                  }
                }
                L36: {
                  if (qa.field_w == null) {
                    break L36;
                  } else {
                    if (qa.field_w.field_o == null) {
                      break L36;
                    } else {
                      this.a(false, qa.field_w.field_o);
                      break L36;
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
          throw r.a((Throwable) (Object) var2, "kq.M(" + param0 + ')');
        }
    }

    final static void a(byte param0, boolean param1) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (qa.field_t > 0) {
                if (!on.field_b) {
                  break L1;
                } else {
                  gf.h(0, 0, gf.field_b, tg.field_c.field_N);
                  so.field_v.b(param1, -66);
                  break L1;
                }
              } else {
                break L1;
              }
            }
            if (param0 == -57) {
              L2: {
                L3: {
                  if (0 < bc.field_b) {
                    break L3;
                  } else {
                    if (ee.field_k <= 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (ti.field_e) {
                  gf.h(0, 0, gf.field_b, tg.field_c.field_N);
                  ed.field_d.b(param1, -83);
                  break L2;
                } else {
                  break L2;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "kq.J(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, int param1, byte param2, int param3) {
        String var5 = null;
        try {
            var5 = cl.field_m.toUpperCase() + ": " + tc.field_E[0];
            int var6 = 107 / ((10 - param2) / 56);
            int discarded$0 = rs.field_Cb.a(var5, 5 + param0, param3 + 5, -10 + param1, 480, 16777215, -1, 0, 0, rs.field_Cb.field_J);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "kq.FA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean a(String param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_2_0 = false;
        boolean stackIn_7_0 = false;
        boolean stackIn_12_0 = false;
        boolean stackIn_20_0 = false;
        int stackIn_26_0 = 0;
        boolean stackIn_28_0 = false;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0 = false;
        boolean stackOut_11_0 = false;
        boolean stackOut_19_0 = false;
        boolean stackOut_27_0 = false;
        int stackOut_25_0 = 0;
        boolean stackOut_1_0 = false;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        try {
          L0: {
            if (!param0.startsWith("production")) {
              if (param0.startsWith("projects")) {
                stackOut_6_0 = ((kq) this).field_j.field_s;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                if (param0.startsWith("fleets")) {
                  stackOut_11_0 = ((kq) this).field_cb.field_s;
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0;
                } else {
                  L1: {
                    if (param1 <= -112) {
                      break L1;
                    } else {
                      ((kq) this).field_K = null;
                      break L1;
                    }
                  }
                  if (param0.startsWith("diplomacy")) {
                    stackOut_19_0 = ((kq) this).field_J.field_s;
                    stackIn_20_0 = stackOut_19_0;
                    return stackIn_20_0;
                  } else {
                    L2: {
                      if (!param0.startsWith("victory")) {
                        break L2;
                      } else {
                        if (((kq) this).field_nb != null) {
                          stackOut_27_0 = ((kq) this).field_nb.field_s;
                          stackIn_28_0 = stackOut_27_0;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    stackOut_25_0 = 0;
                    stackIn_26_0 = stackOut_25_0;
                    return stackIn_26_0 != 0;
                  }
                }
              }
            } else {
              stackOut_1_0 = ((kq) this).field_e.field_s;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var3;
            stackOut_29_1 = new StringBuilder().append("kq.R(");
            stackIn_32_0 = stackOut_29_0;
            stackIn_32_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L3;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_33_0 = stackOut_30_0;
              stackIn_33_1 = stackOut_30_1;
              stackIn_33_2 = stackOut_30_2;
              break L3;
            }
          }
          throw r.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + ',' + param1 + ')');
        }
        return stackIn_28_0;
    }

    final void e(byte param0) {
        RuntimeException runtimeException = null;
        em var2 = null;
        int var3 = 0;
        sd var4 = null;
        String var5 = null;
        int var6 = 0;
        StringBuilder stackIn_11_0 = null;
        StringBuilder stackIn_13_0 = null;
        StringBuilder stackIn_15_0 = null;
        StringBuilder stackIn_16_0 = null;
        String stackIn_16_1 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_10_0 = null;
        StringBuilder stackOut_15_0 = null;
        String stackOut_15_1 = null;
        StringBuilder stackOut_11_0 = null;
        StringBuilder stackOut_13_0 = null;
        String stackOut_13_1 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var2 = (em) (Object) ((kq) this).field_e.field_x;
            if (param0 == 43) {
              var3 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (~var3 <= ~var2.field_i.length) {
                      break L3;
                    } else {
                      var4 = (sd) var2.field_i[var3].field_h;
                      var2.field_i[var3].a((byte) -122, Integer.toString(var4.field_x));
                      if (var6 != 0) {
                        break L2;
                      } else {
                        L4: {
                          L5: {
                            if (var4.field_x != 0) {
                              break L5;
                            } else {
                              var5 = pe.field_F;
                              if (var6 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          L6: {
                            stackOut_10_0 = new StringBuilder().append(il.field_lb).append(" ");
                            stackIn_15_0 = stackOut_10_0;
                            stackIn_11_0 = stackOut_10_0;
                            if (var4.field_x != 1) {
                              stackOut_15_0 = (StringBuilder) (Object) stackIn_15_0;
                              stackOut_15_1 = re.a(d.field_c, 4371, new String[1]);
                              stackIn_16_0 = stackOut_15_0;
                              stackIn_16_1 = stackOut_15_1;
                              break L6;
                            } else {
                              stackOut_11_0 = (StringBuilder) (Object) stackIn_11_0;
                              stackIn_13_0 = stackOut_11_0;
                              stackOut_13_0 = (StringBuilder) (Object) stackIn_13_0;
                              stackOut_13_1 = ad.field_a;
                              stackIn_16_0 = stackOut_13_0;
                              stackIn_16_1 = stackOut_13_1;
                              break L6;
                            }
                          }
                          var5 = stackIn_16_1;
                          break L4;
                        }
                        var2.field_d[var3].field_o = var5;
                        var2.field_i[var3].field_o = var5;
                        var3++;
                        if (var6 == 0) {
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
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw r.a((Throwable) (Object) runtimeException, "kq.I(" + param0 + ')');
        }
    }

    final void a(byte param0, km param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((kq) this).field_s = param1;
              this.i(6);
              if (param0 == -33) {
                break L1;
              } else {
                ((kq) this).field_z = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("kq.BA(").append(param0).append(',');
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          throw r.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    final void a(int param0, int param1, String param2) {
        ad var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        String var6 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              var4 = (ad) (Object) ((kq) this).field_k.field_v;
              if (param0 == 10) {
                break L1;
              } else {
                ((kq) this).field_v = false;
                break L1;
              }
            }
            L2: {
              L3: {
                if (400 <= rs.field_Cb.c(param2)) {
                  break L3;
                } else {
                  var4.field_f.a(param1, param2, 16777215);
                  var4.field_f.a((byte) 64, 15, -(3 * rs.field_Cb.field_J / 4) + (((kq) this).field_k.field_t + ((kq) this).field_k.field_i / 2 - 1));
                  if (!ShatteredPlansClient.field_F) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var5 = param2.indexOf(" ", param2.length() / 2);
              var6 = param2.substring(0, var5) + "<br>" + param2.substring(var5 + 1);
              var4.field_f.a(param1, var6, 16777215);
              var4.field_f.a((byte) 50, 15, -(rs.field_Cb.field_J * 5 / 4) + (((kq) this).field_k.field_t + ((kq) this).field_k.field_i / 2 - 1));
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var4_ref;
            stackOut_9_1 = new StringBuilder().append("kq.B(").append(param0).append(',').append(param1).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L4;
            }
          }
          throw r.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
    }

    private final void a(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                ((kq) this).field_u = 0;
                var2_int = 94 % ((param0 - -45) / 39);
                if (!((kq) this).field_N.f(244874369)) {
                  break L2;
                } else {
                  if (((kq) this).field_s.field_Q == null) {
                    break L2;
                  } else {
                    ((kq) this).field_s.field_z.a(0, ((kq) this).field_s.field_Q.field_a, false);
                    ((kq) this).field_X.g(114);
                    ((kq) this).field_X.field_o = ip.field_h;
                    if (!ShatteredPlansClient.field_F) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              ((kq) this).field_s.field_z.a(-1, new pf(), false);
              ((kq) this).field_s.a(2);
              ((kq) this).field_X.d(false);
              ((kq) this).field_X.field_o = da.field_f;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw r.a((Throwable) (Object) runtimeException, "kq.G(" + param0 + ')');
        }
    }

    final void h(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int[][] var3 = null;
        fs[] var4_ref_fs__ = null;
        int var4 = 0;
        int var5 = 0;
        fs var6_ref_fs = null;
        int var6 = 0;
        int[] var7_ref_int__ = null;
        int var7 = 0;
        String[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        Object stackIn_13_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_43_1 = 0;
        int stackIn_45_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        int stackIn_55_0 = 0;
        int stackIn_62_0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_12_0 = null;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_42_1 = 0;
        int stackOut_44_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_47_1 = 0;
        int stackOut_54_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_59_0 = 0;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!((kq) this).field_s.field_W) {
                break L1;
              } else {
                ma.j(param0 ^ -25141);
                break L1;
              }
            }
            L2: {
              if (oq.field_j != 84) {
                break L2;
              } else {
                ((kq) this).field_s.field_z.e(param0 + -18640);
                ((kq) this).field_s.a(2);
                break L2;
              }
            }
            L3: {
              L4: {
                if (oq.field_j != 83) {
                  break L4;
                } else {
                  if (((kq) this).field_s.field_P.field_r != 1) {
                    L5: {
                      stackOut_12_0 = this;
                      stackIn_15_0 = stackOut_12_0;
                      stackIn_13_0 = stackOut_12_0;
                      if (((kq) this).field_Y) {
                        stackOut_15_0 = this;
                        stackOut_15_1 = 0;
                        stackIn_16_0 = stackOut_15_0;
                        stackIn_16_1 = stackOut_15_1;
                        break L5;
                      } else {
                        stackOut_13_0 = this;
                        stackOut_13_1 = 1;
                        stackIn_16_0 = stackOut_13_0;
                        stackIn_16_1 = stackOut_13_1;
                        break L5;
                      }
                    }
                    L6: {
                      ((kq) this).field_Y = stackIn_16_1 != 0;
                      if (!((kq) this).field_Y) {
                        break L6;
                      } else {
                        if (null == ((kq) this).field_s.field_n) {
                          break L6;
                        } else {
                          if ((((kq) this).field_s.field_P.field_w & 1 << ((kq) this).field_s.field_n.field_x) == 0) {
                            break L6;
                          } else {
                            ((kq) this).field_I = false;
                            break L6;
                          }
                        }
                      }
                    }
                    var2_int = ((kq) this).field_s.field_P.field_r;
                    ((kq) this).field_l = new String[16][var2_int];
                    ((kq) this).field_G = new int[16][];
                    var3 = new int[16][var2_int];
                    var4_ref_fs__ = ((kq) this).field_s.field_P.field_v;
                    var5 = 0;
                    L7: while (true) {
                      L8: {
                        L9: {
                          if (~var5 <= ~var4_ref_fs__.length) {
                            break L9;
                          } else {
                            var6_ref_fs = var4_ref_fs__[var5];
                            var7_ref_int__ = var6_ref_fs.field_q.b((byte) -111);
                            var8 = var6_ref_fs.field_q.a(121);
                            stackOut_27_0 = 0;
                            stackIn_37_0 = stackOut_27_0;
                            stackIn_28_0 = stackOut_27_0;
                            if (var10 != 0) {
                              break L8;
                            } else {
                              var9 = stackIn_28_0;
                              L10: while (true) {
                                L11: {
                                  L12: {
                                    if (var9 >= 16) {
                                      break L12;
                                    } else {
                                      var3[var9][var6_ref_fs.field_x] = var7_ref_int__[var9];
                                      ((kq) this).field_l[var9][var6_ref_fs.field_x] = var8[var9];
                                      var9++;
                                      if (var10 != 0) {
                                        break L11;
                                      } else {
                                        if (var10 == 0) {
                                          continue L10;
                                        } else {
                                          break L12;
                                        }
                                      }
                                    }
                                  }
                                  var5++;
                                  break L11;
                                }
                                if (var10 == 0) {
                                  continue L7;
                                } else {
                                  break L9;
                                }
                              }
                            }
                          }
                        }
                        ((kq) this).field_q = new int[16][var2_int];
                        stackOut_36_0 = 0;
                        stackIn_37_0 = stackOut_36_0;
                        break L8;
                      }
                      var4 = stackIn_37_0;
                      L13: while (true) {
                        stackOut_38_0 = ~var4;
                        stackIn_39_0 = stackOut_38_0;
                        L14: while (true) {
                          if (stackIn_39_0 <= -17) {
                            break L4;
                          } else {
                            ((kq) this).field_G[var4] = nf.a(var3[var4], 3718);
                            stackOut_40_0 = 0;
                            stackIn_55_0 = stackOut_40_0;
                            stackIn_41_0 = stackOut_40_0;
                            if (var10 != 0) {
                              break L3;
                            } else {
                              var5 = stackIn_41_0;
                              L15: while (true) {
                                stackOut_42_0 = var2_int;
                                stackOut_42_1 = var5;
                                stackIn_43_0 = stackOut_42_0;
                                stackIn_43_1 = stackOut_42_1;
                                L16: while (true) {
                                  L17: {
                                    if (stackIn_43_0 <= stackIn_43_1) {
                                      break L17;
                                    } else {
                                      var6 = 0;
                                      stackOut_44_0 = 0;
                                      stackIn_39_0 = stackOut_44_0;
                                      stackIn_45_0 = stackOut_44_0;
                                      if (var10 != 0) {
                                        continue L14;
                                      } else {
                                        var7 = stackIn_45_0;
                                        L18: while (true) {
                                          L19: {
                                            if (~var7 <= ~var2_int) {
                                              break L19;
                                            } else {
                                              stackOut_47_0 = ~var3[var4][var7];
                                              stackOut_47_1 = ~var3[var4][var5];
                                              stackIn_43_0 = stackOut_47_0;
                                              stackIn_43_1 = stackOut_47_1;
                                              stackIn_48_0 = stackOut_47_0;
                                              stackIn_48_1 = stackOut_47_1;
                                              if (var10 != 0) {
                                                continue L16;
                                              } else {
                                                L20: {
                                                  if (stackIn_48_0 >= stackIn_48_1) {
                                                    var6++;
                                                    break L20;
                                                  } else {
                                                    break L20;
                                                  }
                                                }
                                                var7++;
                                                if (var10 == 0) {
                                                  continue L18;
                                                } else {
                                                  break L19;
                                                }
                                              }
                                            }
                                          }
                                          ((kq) this).field_q[var4][var5] = var2_int - var6;
                                          var5++;
                                          if (var10 == 0) {
                                            continue L15;
                                          } else {
                                            break L17;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  var4++;
                                  if (var10 == 0) {
                                    continue L13;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
              stackOut_54_0 = -67;
              stackIn_55_0 = stackOut_54_0;
              break L3;
            }
            L21: {
              if (stackIn_55_0 != ~oq.field_j) {
                break L21;
              } else {
                L22: {
                  if (ge.field_n) {
                    stackOut_61_0 = 0;
                    stackIn_62_0 = stackOut_61_0;
                    break L22;
                  } else {
                    stackOut_59_0 = 1;
                    stackIn_62_0 = stackOut_59_0;
                    break L22;
                  }
                }
                ge.field_n = stackIn_62_0 != 0;
                ((kq) this).field_f.e((byte) 20);
                break L21;
              }
            }
            L23: {
              if (param0 == -1) {
                break L23;
              } else {
                kq.c(56);
                break L23;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "kq.KA(" + param0 + ')');
        }
    }

    final int d(byte param0) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 14) {
                break L1;
              } else {
                ((kq) this).field_x = 36;
                break L1;
              }
            }
            if (!((kq) this).field_s.field_W) {
              if (!((kq) this).field_s.field_f) {
                stackOut_9_0 = ((kq) this).field_O.field_db;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                stackOut_7_0 = tg.field_c.field_db;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              }
            } else {
              stackOut_4_0 = 480;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "kq.A(" + param0 + ')');
        }
        return stackIn_10_0;
    }

    private final void m(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              de.field_j = 0;
              if (!((kq) this).field_N.f(244874369)) {
                break L1;
              } else {
                de.field_j = de.field_j | 32;
                break L1;
              }
            }
            L2: {
              var2_int = -45 / ((param0 - 14) / 38);
              if (!((kq) this).field_d.f(244874369)) {
                break L2;
              } else {
                de.field_j = de.field_j | 64;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "kq.F(" + param0 + ')');
        }
    }

    private final void k(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        String var8 = null;
        me var9 = null;
        int var10 = 0;
        bi var11 = null;
        om var12 = null;
        int var13_int = 0;
        String var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        RuntimeException decompiledCaughtException = null;
        var16 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var2_int = 32;
                if (32 > ((kq) this).field_u) {
                  break L2;
                } else {
                  if (((kq) this).field_u <= 59968) {
                    break L1;
                  } else {
                    var2_int = 60000 - ((kq) this).field_u;
                    if (var16 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              var2_int = ((kq) this).field_u;
              break L1;
            }
            L3: {
              L4: {
                var3 = re.a(21, 32, var2_int, 450, 0);
                sn.a(640, -84, 480, (-var2_int + 32 << 6) / 32 + 192, 0, 0);
                var4 = (640 + -var3) / 2;
                var5 = 80;
                var6 = 250;
                ei.a(true, var6, var3, -12394, var5, var4, 3974311);
                var7 = new int[4];
                gf.a(var7);
                gf.d(var4 - -(rs.field_Cb.field_J / 2), var5, -(rs.field_Cb.field_J / 2) + var4 + var3, var5 - -var6);
                var9 = ((kq) this).field_s.field_P.field_x;
                if (!(var9 instanceof ui)) {
                  break L4;
                } else {
                  var8 = la.field_n;
                  if (var16 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if (!(var9 instanceof nh)) {
                  break L5;
                } else {
                  var8 = ue.field_c;
                  if (var16 == 0) {
                    break L3;
                  } else {
                    break L5;
                  }
                }
              }
              L6: {
                if (var9 instanceof hp) {
                  break L6;
                } else {
                  var8 = lm.field_a;
                  if (var16 == 0) {
                    break L3;
                  } else {
                    break L6;
                  }
                }
              }
              var8 = cf.field_I;
              break L3;
            }
            L7: {
              L8: {
                var8 = var8 + "   ";
                if (((kq) this).field_s.field_P.field_o.field_l) {
                  break L8;
                } else {
                  var8 = var8 + og.field_a;
                  if (var16 == 0) {
                    break L7;
                  } else {
                    break L8;
                  }
                }
              }
              var8 = var8 + tp.field_k;
              break L7;
            }
            L9: {
              rs.field_Cb.d(var8.toUpperCase(), 10 + var4, rs.field_Cb.field_J + var5, 16777215, -1);
              ij.a(0, -rs.field_Cb.field_J + 451, true, var4 - -(rs.field_Cb.field_J / 2), 10 + hb.field_b[0].field_w, rs.field_Cb.field_J + var5 + 5);
              var10 = 0;
              if (null != ((kq) this).field_s.field_n) {
                var10 = ((kq) this).field_s.field_n.field_x;
                break L9;
              } else {
                break L9;
              }
            }
            var11 = new bi(hb.field_b[0].field_w, -rs.field_Cb.field_J + 450 - (10 - -(hb.field_b[0].field_z / 2)));
            ra.a(param0 ^ -5630);
            var11.e();
            gf.i(0, 0, var11.field_z, var11.field_w, ((kq) this).field_s.field_P.field_v[var10].field_k, 0);
            cg.i(param0 ^ param0);
            var11.f();
            var11.a(5 + (rs.field_Cb.field_J / 2 + var4), rs.field_Cb.field_J + var5 + 10, 64);
            var12 = new om(hb.field_b[0].field_z, hb.field_b[0].field_w);
            var13_int = 0;
            L10: while (true) {
              L11: {
                L12: {
                  if (~hb.field_b[var10].field_B.length >= ~var13_int) {
                    break L12;
                  } else {
                    if (var16 != 0) {
                      break L11;
                    } else {
                      L13: {
                        L14: {
                          if ((-16777216 & hb.field_b[var10].field_B[var13_int]) == 0) {
                            break L14;
                          } else {
                            var12.field_B[var13_int] = -16777216;
                            if (var16 == 0) {
                              break L13;
                            } else {
                              break L14;
                            }
                          }
                        }
                        var12.field_B[var13_int] = 0;
                        break L13;
                      }
                      var13_int++;
                      if (var16 == 0) {
                        continue L10;
                      } else {
                        break L12;
                      }
                    }
                  }
                }
                var12.f(5 + (var4 + rs.field_Cb.field_J / 2) + (var11.field_z + -(hb.field_b[0].field_z / 2)), 10 + var5 - -rs.field_Cb.field_J);
                hb.field_b[var10].a(-(hb.field_b[0].field_z / 2) + (var11.field_z + rs.field_Cb.field_J / 2) + (var4 + 5), rs.field_Cb.field_J + (var5 + 10), 64);
                break L11;
              }
              L15: {
                var13 = re.a(eo.field_hb, 4371, new String[1]);
                var14 = 10 + hb.field_b[0].field_w + (var5 + (20 + mp.field_b.field_J));
                mp.field_b.c(var13, 320, var14, 16777215, -1);
                var15 = -32 + ((kq) this).field_u;
                if (var15 > 0) {
                  L16: {
                    if (var15 < 32) {
                      break L16;
                    } else {
                      rs.field_Cb.c(((kq) this).field_P, 320, var14 + rs.field_Cb.field_J - -3, 2458760, -1);
                      if (var16 == 0) {
                        break L15;
                      } else {
                        break L16;
                      }
                    }
                  }
                  rs.field_Cb.a(((kq) this).field_P, 320, 3 + var14 + rs.field_Cb.field_J, 2458760, -1, var15 * 8);
                  break L15;
                } else {
                  break L15;
                }
              }
              L17: {
                if (var9 instanceof jj) {
                  this.a(var4 + (rs.field_Cb.field_J / 2 + 5), 439 - rs.field_Cb.field_J, (byte) 122, var5 + rs.field_Cb.field_J);
                  break L17;
                } else {
                  break L17;
                }
              }
              L18: {
                if (!(var9 instanceof ui)) {
                  break L18;
                } else {
                  this.c(rs.field_Cb.field_J / 2 + (var4 + 5), -1, rs.field_Cb.field_J + var5, -11 + (450 - rs.field_Cb.field_J));
                  break L18;
                }
              }
              L19: {
                if (!(var9 instanceof nh)) {
                  break L19;
                } else {
                  this.b(-rs.field_Cb.field_J + 439, rs.field_Cb.field_J + var5, 27, rs.field_Cb.field_J / 2 + (var4 + 5));
                  break L19;
                }
              }
              L20: {
                if (var9 instanceof hp) {
                  this.a(5 + rs.field_Cb.field_J / 2 + var4, -rs.field_Cb.field_J + 439, -117, rs.field_Cb.field_J + var5);
                  break L20;
                } else {
                  break L20;
                }
              }
              gf.b(var7);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "kq.DA(" + param0 + ')');
        }
    }

    final static void c(int param0) {
        try {
            if (param0 != 28164) {
                kq.a((byte) -86, true);
            }
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "kq.VA(" + param0 + ')');
        }
    }

    private final int[][] j(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int[][] var4 = null;
        int var5 = 0;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_17_0 = null;
        int[][] stackIn_22_0 = null;
        int[][] stackIn_29_0 = null;
        int[][] stackIn_38_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_16_0 = null;
        int[][] stackOut_21_0 = null;
        int[][] stackOut_28_0 = null;
        int[][] stackOut_37_0 = null;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (null == ((kq) this).field_C) {
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (int[][]) (Object) stackIn_5_0;
            } else {
              L1: {
                L2: {
                  if (null == ((kq) this).field_Z) {
                    break L2;
                  } else {
                    if (((kq) this).field_Z[0] == null) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                ((kq) this).field_kb = 0;
                ((kq) this).field_Z = ((kq) this).field_C;
                ((kq) this).field_H = ((kq) this).field_fb;
                break L1;
              }
              if (((kq) this).field_C[0].length != ((kq) this).field_Z[0].length) {
                stackOut_16_0 = null;
                stackIn_17_0 = stackOut_16_0;
                return (int[][]) (Object) stackIn_17_0;
              } else {
                if (0 == ((kq) this).field_kb) {
                  stackOut_21_0 = ((kq) this).field_Z;
                  stackIn_22_0 = stackOut_21_0;
                  return stackIn_22_0;
                } else {
                  L3: {
                    if (param0 == 410) {
                      break L3;
                    } else {
                      ((kq) this).field_l = null;
                      break L3;
                    }
                  }
                  var2_int = ((kq) this).field_s.field_P.field_r;
                  var3 = ((kq) this).field_C[0].length;
                  var4 = new int[var2_int][];
                  var5 = 0;
                  L4: while (true) {
                    L5: {
                      L6: {
                        if (~var2_int >= ~var5) {
                          break L6;
                        } else {
                          var6 = ((kq) this).field_Z[var5];
                          stackOut_28_0 = ((kq) this).field_C;
                          stackIn_38_0 = stackOut_28_0;
                          stackIn_29_0 = stackOut_28_0;
                          if (var10 != 0) {
                            break L5;
                          } else {
                            var7 = stackIn_29_0[var5];
                            var8 = new int[var3];
                            var9 = 0;
                            L7: while (true) {
                              L8: {
                                L9: {
                                  if (var3 <= var9) {
                                    break L9;
                                  } else {
                                    var8[var9] = re.a(var6[var9], 32, ((kq) this).field_kb, var7[var9], nc.a(param0, 410));
                                    var9++;
                                    if (var10 != 0) {
                                      break L8;
                                    } else {
                                      if (var10 == 0) {
                                        continue L7;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                }
                                var4[var5] = var8;
                                var5++;
                                break L8;
                              }
                              if (var10 == 0) {
                                continue L4;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                      }
                      stackOut_37_0 = (int[][]) var4;
                      stackIn_38_0 = stackOut_37_0;
                      break L5;
                    }
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "kq.OA(" + param0 + ')');
        }
        return stackIn_38_0;
    }

    final void i(byte param0) {
        RuntimeException runtimeException = null;
        vd var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var2 = (vd) (Object) ((kq) this).field_y.d(0);
            if (param0 == -47) {
              L1: while (true) {
                L2: {
                  L3: {
                    if (null == var2) {
                      break L3;
                    } else {
                      var2.c(false);
                      var2 = (vd) (Object) ((kq) this).field_y.a((byte) -71);
                      if (var3 != 0) {
                        break L2;
                      } else {
                        if (var3 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  ((kq) this).field_j = null;
                  ((kq) this).field_N = null;
                  ((kq) this).field_e = null;
                  ((kq) this).field_J = null;
                  ((kq) this).field_g = null;
                  ((kq) this).field_cb = null;
                  ((kq) this).field_n = null;
                  ((kq) this).field_d = null;
                  ((kq) this).field_S = null;
                  ((kq) this).field_nb = null;
                  ((kq) this).field_W = null;
                  ((kq) this).field_k = null;
                  ((kq) this).field_bb = null;
                  ((kq) this).field_X = null;
                  ((kq) this).field_mb = null;
                  break L2;
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw r.a((Throwable) (Object) runtimeException, "kq.O(" + param0 + ')');
        }
    }

    final static java.applet.Applet f(byte param0) {
        RuntimeException var1 = null;
        java.applet.Applet stackIn_2_0 = null;
        kf stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        kf stackOut_6_0 = null;
        java.applet.Applet stackOut_1_0 = null;
        try {
          L0: {
            if (hb.field_a == null) {
              L1: {
                if (param0 >= 123) {
                  break L1;
                } else {
                  field_A = null;
                  break L1;
                }
              }
              stackOut_6_0 = ts.field_G;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_1_0 = hb.field_a;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var1, "kq.C(" + param0 + ')');
        }
        return (java.applet.Applet) (Object) stackIn_7_0;
    }

    final void n(int param0) {
        RuntimeException var2 = null;
        fs[] var2_array = null;
        int var3 = 0;
        fs var4 = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              this.f(-15907);
              if (null == ((kq) this).field_j) {
                break L1;
              } else {
                this.a(428);
                break L1;
              }
            }
            L2: {
              var2_array = ((kq) this).field_s.field_P.field_v;
              var3 = 0;
              if (param0 >= 32) {
                break L2;
              } else {
                this.a(27, 32, 20, -85, 71);
                break L2;
              }
            }
            L3: while (true) {
              L4: {
                L5: {
                  if (var3 >= var2_array.length) {
                    break L5;
                  } else {
                    var4 = var2_array[var3];
                    this.a((byte) -53, var4);
                    var3++;
                    if (var5 != 0) {
                      break L4;
                    } else {
                      if (var5 == 0) {
                        continue L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                ((kq) this).field_J.field_A = false;
                ((kq) this).field_n.d(false);
                this.e(0);
                break L4;
              }
              L6: {
                L7: {
                  if (((kq) this).field_hb.f(244874369)) {
                    break L7;
                  } else {
                    L8: {
                      if (!((kq) this).field_gb.f(244874369)) {
                        break L8;
                      } else {
                        this.a(1, (byte) -128);
                        if (var5 == 0) {
                          break L6;
                        } else {
                          break L8;
                        }
                      }
                    }
                    L9: {
                      if (!((kq) this).field_db.f(244874369)) {
                        break L9;
                      } else {
                        this.a(2, (byte) 21);
                        if (var5 == 0) {
                          break L6;
                        } else {
                          break L9;
                        }
                      }
                    }
                    if (!((kq) this).field_a.f(244874369)) {
                      break L6;
                    } else {
                      this.a(3, (byte) 29);
                      if (var5 == 0) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
                this.a(0, (byte) 1);
                break L6;
              }
              L10: {
                L11: {
                  if (!((kq) this).field_s.field_W) {
                    break L11;
                  } else {
                    pe.k(112);
                    this.a((byte) -109);
                    if (var5 == 0) {
                      break L10;
                    } else {
                      break L11;
                    }
                  }
                }
                int discarded$2 = vc.a((byte) -39, mp.field_e.length);
                ((kq) this).field_P = ((kq) this).field_s.field_P.a((byte) -50);
                ((kq) this).field_u = 1;
                gm discarded$3 = qk.a(ub.field_yb, 63);
                break L10;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "kq.UA(" + param0 + ')');
        }
    }

    final boolean a(boolean param0, byte param1) {
        int var3_int = 0;
        vd var4_ref_vd = null;
        qh var4_ref_qh = null;
        int var4 = 0;
        em var4_ref_em = null;
        rh var4_ref_rh = null;
        ph var4_ref_ph = null;
        qh var5 = null;
        int var5_int = 0;
        lp[] var5_array = null;
        int var6 = 0;
        lp var6_ref_lp = null;
        sd var7 = null;
        lp var7_ref = null;
        fs var8 = null;
        int var9 = 0;
        int stackIn_22_0 = 0;
        boolean stackIn_27_0 = false;
        boolean stackIn_51_0 = false;
        int stackIn_108_0 = 0;
        tr stackIn_115_0 = null;
        int stackIn_115_1 = 0;
        tr stackIn_116_0 = null;
        int stackIn_116_1 = 0;
        tr stackIn_117_0 = null;
        int stackIn_117_1 = 0;
        tr stackIn_118_0 = null;
        int stackIn_118_1 = 0;
        pf stackIn_118_2 = null;
        tr stackIn_125_0 = null;
        int stackIn_125_1 = 0;
        tr stackIn_126_0 = null;
        int stackIn_126_1 = 0;
        tr stackIn_127_0 = null;
        int stackIn_127_1 = 0;
        pf stackIn_127_2 = null;
        tr stackIn_135_0 = null;
        int stackIn_135_1 = 0;
        tr stackIn_136_0 = null;
        int stackIn_136_1 = 0;
        tr stackIn_137_0 = null;
        int stackIn_137_1 = 0;
        tr stackIn_138_0 = null;
        int stackIn_138_1 = 0;
        pf stackIn_138_2 = null;
        tr stackIn_140_0 = null;
        int stackIn_140_1 = 0;
        tr stackIn_141_0 = null;
        int stackIn_141_1 = 0;
        tr stackIn_142_0 = null;
        int stackIn_142_1 = 0;
        tr stackIn_143_0 = null;
        int stackIn_143_1 = 0;
        pf stackIn_143_2 = null;
        boolean stackIn_158_0 = false;
        boolean stackIn_176_0 = false;
        int stackIn_200_0 = 0;
        int stackIn_205_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        boolean stackOut_26_0 = false;
        boolean stackOut_50_0 = false;
        tr stackOut_134_0 = null;
        int stackOut_134_1 = 0;
        tr stackOut_137_0 = null;
        int stackOut_137_1 = 0;
        pf stackOut_137_2 = null;
        tr stackOut_135_0 = null;
        int stackOut_135_1 = 0;
        tr stackOut_136_0 = null;
        int stackOut_136_1 = 0;
        Object stackOut_136_2 = null;
        tr stackOut_139_0 = null;
        int stackOut_139_1 = 0;
        tr stackOut_142_0 = null;
        int stackOut_142_1 = 0;
        Object stackOut_142_2 = null;
        tr stackOut_140_0 = null;
        int stackOut_140_1 = 0;
        tr stackOut_141_0 = null;
        int stackOut_141_1 = 0;
        pf stackOut_141_2 = null;
        boolean stackOut_157_0 = false;
        boolean stackOut_175_0 = false;
        tr stackOut_114_0 = null;
        int stackOut_114_1 = 0;
        tr stackOut_117_0 = null;
        int stackOut_117_1 = 0;
        pf stackOut_117_2 = null;
        tr stackOut_115_0 = null;
        int stackOut_115_1 = 0;
        tr stackOut_116_0 = null;
        int stackOut_116_1 = 0;
        Object stackOut_116_2 = null;
        tr stackOut_124_0 = null;
        int stackOut_124_1 = 0;
        tr stackOut_126_0 = null;
        int stackOut_126_1 = 0;
        pf stackOut_126_2 = null;
        tr stackOut_125_0 = null;
        int stackOut_125_1 = 0;
        Object stackOut_125_2 = null;
        int stackOut_107_0 = 0;
        int stackOut_106_0 = 0;
        byte stackOut_199_0 = 0;
        int stackOut_204_0 = 0;
        int stackOut_203_0 = 0;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        if (((kq) this).field_b == 0) {
          if (((kq) this).field_u == 0) {
            L0: {
              L1: {
                if (null != qa.field_w) {
                  break L1;
                } else {
                  if (bb.field_b >= tg.field_c.field_db) {
                    break L1;
                  } else {
                    L2: {
                      if (null == ((kq) this).field_O) {
                        break L2;
                      } else {
                        if (~bb.field_b > ~((kq) this).field_O.field_db) {
                          break L2;
                        } else {
                          break L1;
                        }
                      }
                    }
                    stackOut_21_0 = 0;
                    stackIn_22_0 = stackOut_21_0;
                    break L0;
                  }
                }
              }
              stackOut_20_0 = 1;
              stackIn_22_0 = stackOut_20_0;
              break L0;
            }
            L3: {
              L4: {
                L5: {
                  L6: {
                    L7: {
                      var3_int = stackIn_22_0;
                      boolean discarded$3 = wj.a(((kq) this).field_y, (byte) -99);
                      if (wl.field_f != null) {
                        var4_ref_vd = (vd) (Object) ((kq) this).field_y.d(0);
                        L8: while (true) {
                          if (null == var4_ref_vd) {
                            break L7;
                          } else {
                            stackOut_26_0 = var4_ref_vd instanceof qh;
                            stackIn_51_0 = stackOut_26_0;
                            stackIn_27_0 = stackOut_26_0;
                            if (var9 != 0) {
                              break L6;
                            } else {
                              L9: {
                                if (stackIn_27_0) {
                                  break L9;
                                } else {
                                  var4_ref_vd = (vd) (Object) ((kq) this).field_y.a((byte) -71);
                                  if (var9 == 0) {
                                    continue L8;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              L10: {
                                var5 = (qh) (Object) var4_ref_vd;
                                if (!var5.field_s) {
                                  break L10;
                                } else {
                                  if (!var5.a((byte) 43, wl.field_f)) {
                                    break L10;
                                  } else {
                                    L11: {
                                      this.a(62, var5);
                                      var5.field_A = false;
                                      if (var5 != ((kq) this).field_e) {
                                        break L11;
                                      } else {
                                        ((kq) this).field_mb.d(false);
                                        break L11;
                                      }
                                    }
                                    L12: {
                                      if (var5 == ((kq) this).field_j) {
                                        ((kq) this).field_S.d(false);
                                        break L12;
                                      } else {
                                        break L12;
                                      }
                                    }
                                    L13: {
                                      if (((kq) this).field_J == var5) {
                                        ((kq) this).field_n.d(false);
                                        break L13;
                                      } else {
                                        break L13;
                                      }
                                    }
                                    L14: {
                                      if (var5 != ((kq) this).field_cb) {
                                        break L14;
                                      } else {
                                        ((kq) this).field_W.d(false);
                                        break L14;
                                      }
                                    }
                                    if (var5 == ((kq) this).field_nb) {
                                      ((kq) this).field_g.d(false);
                                      if (var9 == 0) {
                                        break L7;
                                      } else {
                                        break L10;
                                      }
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                              var4_ref_vd = (vd) (Object) ((kq) this).field_y.a((byte) -71);
                              if (var9 == 0) {
                                continue L8;
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
                    if (null != dn.field_h) {
                      stackOut_50_0 = dn.field_h.field_h instanceof qh;
                      stackIn_51_0 = stackOut_50_0;
                      break L6;
                    } else {
                      break L5;
                    }
                  }
                  if (!stackIn_51_0) {
                    if ((Object) (Object) dn.field_h == (Object) (Object) ((kq) this).field_mb) {
                      L15: {
                        L16: {
                          if (((kq) this).field_e.field_s) {
                            break L16;
                          } else {
                            this.a(93, ((kq) this).field_e);
                            ((kq) this).field_mb.field_o = ep.field_b;
                            ((kq) this).field_e.field_s = true;
                            if (var9 == 0) {
                              break L15;
                            } else {
                              break L16;
                            }
                          }
                        }
                        ((kq) this).field_e.field_s = false;
                        ((kq) this).field_mb.field_o = t.field_b;
                        break L15;
                      }
                      ((kq) this).field_e.field_A = false;
                      ((kq) this).field_mb.d(false);
                      return var3_int != 0;
                    } else {
                      if ((Object) (Object) ((kq) this).field_S == (Object) (Object) dn.field_h) {
                        L17: {
                          L18: {
                            if (!((kq) this).field_j.field_s) {
                              break L18;
                            } else {
                              ((kq) this).field_S.field_o = n.field_j;
                              ((kq) this).field_j.field_s = false;
                              if (var9 == 0) {
                                break L17;
                              } else {
                                break L18;
                              }
                            }
                          }
                          this.a(-120, ((kq) this).field_j);
                          ((kq) this).field_S.field_o = ue.field_b;
                          ((kq) this).field_j.field_s = true;
                          break L17;
                        }
                        ((kq) this).field_j.field_A = false;
                        ((kq) this).field_S.d(false);
                        return var3_int != 0;
                      } else {
                        if ((Object) (Object) dn.field_h == (Object) (Object) ((kq) this).field_n) {
                          L19: {
                            L20: {
                              if (!((kq) this).field_J.field_s) {
                                break L20;
                              } else {
                                ((kq) this).field_n.field_o = rk.field_o;
                                ((kq) this).field_J.field_s = false;
                                if (var9 == 0) {
                                  break L19;
                                } else {
                                  break L20;
                                }
                              }
                            }
                            this.a(113, ((kq) this).field_J);
                            ((kq) this).field_n.field_o = te.field_b;
                            ((kq) this).field_J.field_s = true;
                            break L19;
                          }
                          ((kq) this).field_J.field_A = false;
                          ((kq) this).field_n.d(false);
                          return var3_int != 0;
                        } else {
                          if ((Object) (Object) ((kq) this).field_W == (Object) (Object) dn.field_h) {
                            L21: {
                              L22: {
                                if (((kq) this).field_cb.field_s) {
                                  break L22;
                                } else {
                                  this.a(-113, ((kq) this).field_cb);
                                  ((kq) this).field_W.field_o = lc.field_d;
                                  ((kq) this).field_cb.field_s = true;
                                  if (var9 == 0) {
                                    break L21;
                                  } else {
                                    break L22;
                                  }
                                }
                              }
                              ((kq) this).field_cb.field_s = false;
                              ((kq) this).field_W.field_o = wm.field_a;
                              break L21;
                            }
                            ((kq) this).field_cb.field_A = false;
                            ((kq) this).field_W.d(false);
                            return var3_int != 0;
                          } else {
                            if ((Object) (Object) dn.field_h == (Object) (Object) ((kq) this).field_g) {
                              L23: {
                                L24: {
                                  if (((kq) this).field_nb.field_s) {
                                    break L24;
                                  } else {
                                    this.a(40, ((kq) this).field_nb);
                                    ((kq) this).field_nb.field_s = true;
                                    ((kq) this).field_g.field_o = hi.field_d;
                                    if (var9 == 0) {
                                      break L23;
                                    } else {
                                      break L24;
                                    }
                                  }
                                }
                                ((kq) this).field_nb.field_s = false;
                                ((kq) this).field_g.field_o = hi.field_d;
                                break L23;
                              }
                              ((kq) this).field_nb.field_A = false;
                              ((kq) this).field_g.d(false);
                              return var3_int != 0;
                            } else {
                              if ((Object) (Object) dn.field_h == (Object) (Object) ((kq) this).field_bb) {
                                this.g((byte) 121);
                                return var3_int != 0;
                              } else {
                                if ((Object) (Object) ((kq) this).field_f != (Object) (Object) dn.field_h) {
                                  if ((Object) (Object) ((kq) this).field_N != (Object) (Object) dn.field_h) {
                                    if ((Object) (Object) dn.field_h == (Object) (Object) ((kq) this).field_X) {
                                      L25: {
                                        if (null == ((kq) this).field_s.field_Q) {
                                          break L25;
                                        } else {
                                          ((kq) this).field_X.e((byte) 97);
                                          break L25;
                                        }
                                      }
                                      L26: {
                                        L27: {
                                          if (!((kq) this).field_X.f(244874369)) {
                                            break L27;
                                          } else {
                                            L28: {
                                              ((kq) this).field_X.field_o = ip.field_h;
                                              stackOut_134_0 = ((kq) this).field_s.field_z;
                                              stackOut_134_1 = 0;
                                              stackIn_137_0 = stackOut_134_0;
                                              stackIn_137_1 = stackOut_134_1;
                                              stackIn_135_0 = stackOut_134_0;
                                              stackIn_135_1 = stackOut_134_1;
                                              if (null != ((kq) this).field_s.field_Q) {
                                                stackOut_137_0 = (tr) (Object) stackIn_137_0;
                                                stackOut_137_1 = stackIn_137_1;
                                                stackOut_137_2 = ((kq) this).field_s.field_Q.field_a;
                                                stackIn_138_0 = stackOut_137_0;
                                                stackIn_138_1 = stackOut_137_1;
                                                stackIn_138_2 = stackOut_137_2;
                                                break L28;
                                              } else {
                                                stackOut_135_0 = (tr) (Object) stackIn_135_0;
                                                stackOut_135_1 = stackIn_135_1;
                                                stackIn_136_0 = stackOut_135_0;
                                                stackIn_136_1 = stackOut_135_1;
                                                stackOut_136_0 = (tr) (Object) stackIn_136_0;
                                                stackOut_136_1 = stackIn_136_1;
                                                stackOut_136_2 = null;
                                                stackIn_138_0 = stackOut_136_0;
                                                stackIn_138_1 = stackOut_136_1;
                                                stackIn_138_2 = (pf) (Object) stackOut_136_2;
                                                break L28;
                                              }
                                            }
                                            ((tr) (Object) stackIn_138_0).a(stackIn_138_1, stackIn_138_2, false);
                                            if (var9 == 0) {
                                              break L26;
                                            } else {
                                              break L27;
                                            }
                                          }
                                        }
                                        L29: {
                                          ((kq) this).field_X.field_o = da.field_f;
                                          stackOut_139_0 = ((kq) this).field_s.field_z;
                                          stackOut_139_1 = -1;
                                          stackIn_142_0 = stackOut_139_0;
                                          stackIn_142_1 = stackOut_139_1;
                                          stackIn_140_0 = stackOut_139_0;
                                          stackIn_140_1 = stackOut_139_1;
                                          if (null == ((kq) this).field_s.field_Q) {
                                            stackOut_142_0 = (tr) (Object) stackIn_142_0;
                                            stackOut_142_1 = stackIn_142_1;
                                            stackOut_142_2 = null;
                                            stackIn_143_0 = stackOut_142_0;
                                            stackIn_143_1 = stackOut_142_1;
                                            stackIn_143_2 = (pf) (Object) stackOut_142_2;
                                            break L29;
                                          } else {
                                            stackOut_140_0 = (tr) (Object) stackIn_140_0;
                                            stackOut_140_1 = stackIn_140_1;
                                            stackIn_141_0 = stackOut_140_0;
                                            stackIn_141_1 = stackOut_140_1;
                                            stackOut_141_0 = (tr) (Object) stackIn_141_0;
                                            stackOut_141_1 = stackIn_141_1;
                                            stackOut_141_2 = ((kq) this).field_s.field_Q.field_a;
                                            stackIn_143_0 = stackOut_141_0;
                                            stackIn_143_1 = stackOut_141_1;
                                            stackIn_143_2 = stackOut_141_2;
                                            break L29;
                                          }
                                        }
                                        ((tr) (Object) stackIn_143_0).a(stackIn_143_1, stackIn_143_2, false);
                                        ((kq) this).field_s.a(2);
                                        break L26;
                                      }
                                      return var3_int != 0;
                                    } else {
                                      if ((Object) (Object) dn.field_h == (Object) (Object) ((kq) this).field_d) {
                                        L30: {
                                          L31: {
                                            ((kq) this).field_d.e((byte) 73);
                                            if (!((kq) this).field_d.f(244874369)) {
                                              break L31;
                                            } else {
                                              ((kq) this).field_d.field_o = de.field_k;
                                              if (var9 == 0) {
                                                break L30;
                                              } else {
                                                break L31;
                                              }
                                            }
                                          }
                                          ((kq) this).field_d.field_o = ec.field_t;
                                          break L30;
                                        }
                                        this.m(108);
                                        return var3_int != 0;
                                      } else {
                                        L32: {
                                          if (null == ((kq) this).field_s.field_n) {
                                            break L32;
                                          } else {
                                            if (!((kq) this).field_e.field_s) {
                                              break L32;
                                            } else {
                                              var4_ref_em = (em) (Object) ((kq) this).field_e.field_x;
                                              var5_int = 0;
                                              L33: while (true) {
                                                if (~var5_int <= ~var4_ref_em.field_f.length) {
                                                  break L32;
                                                } else {
                                                  var6_ref_lp = var4_ref_em.field_f[var5_int];
                                                  var7 = (sd) var6_ref_lp.field_h;
                                                  stackOut_157_0 = var6_ref_lp.a((byte) -10, dn.field_h);
                                                  stackIn_200_0 = stackOut_157_0 ? 1 : 0;
                                                  stackIn_158_0 = stackOut_157_0;
                                                  if (var9 != 0) {
                                                    break L4;
                                                  } else {
                                                    L34: {
                                                      if (stackIn_158_0) {
                                                        L35: {
                                                          L36: {
                                                            if (2 != ((kq) this).field_s.field_m) {
                                                              break L36;
                                                            } else {
                                                              if (((kq) this).field_s.field_c == var7) {
                                                                break L35;
                                                              } else {
                                                                break L36;
                                                              }
                                                            }
                                                          }
                                                          if (var7.field_x > 0) {
                                                            this.a(-2, var7, false);
                                                            if (var9 == 0) {
                                                              break L34;
                                                            } else {
                                                              break L35;
                                                            }
                                                          } else {
                                                            break L34;
                                                          }
                                                        }
                                                        ((kq) this).a(-125, 0);
                                                        break L34;
                                                      } else {
                                                        break L34;
                                                      }
                                                    }
                                                    var5_int++;
                                                    if (var9 == 0) {
                                                      continue L33;
                                                    } else {
                                                      break L32;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                        L37: {
                                          if (((kq) this).field_s.field_n == null) {
                                            break L37;
                                          } else {
                                            if (!((kq) this).field_j.field_s) {
                                              break L37;
                                            } else {
                                              var4_ref_rh = (rh) (Object) ((kq) this).field_j.field_x;
                                              var5_int = 0;
                                              L38: while (true) {
                                                if (~var4_ref_rh.field_c.length >= ~var5_int) {
                                                  break L37;
                                                } else {
                                                  stackOut_175_0 = var4_ref_rh.field_c[var5_int].a((byte) 24, dn.field_h);
                                                  stackIn_200_0 = stackOut_175_0 ? 1 : 0;
                                                  stackIn_176_0 = stackOut_175_0;
                                                  if (var9 != 0) {
                                                    break L4;
                                                  } else {
                                                    L39: {
                                                      if (!stackIn_176_0) {
                                                        break L39;
                                                      } else {
                                                        if (((kq) this).field_s.field_n.field_u[var5_int] == 5) {
                                                          this.d(var5_int, 4705);
                                                          break L39;
                                                        } else {
                                                          break L39;
                                                        }
                                                      }
                                                    }
                                                    var5_int++;
                                                    if (var9 == 0) {
                                                      continue L38;
                                                    } else {
                                                      break L37;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                        if (((kq) this).field_s.field_n == null) {
                                          break L5;
                                        } else {
                                          if (!((kq) this).field_J.field_s) {
                                            break L5;
                                          } else {
                                            var4_ref_ph = (ph) (Object) ((kq) this).field_J.field_x;
                                            var5_array = var4_ref_ph.field_h;
                                            var6 = 0;
                                            L40: while (true) {
                                              if (var6 >= var5_array.length) {
                                                break L5;
                                              } else {
                                                var7_ref = var5_array[var6];
                                                var8 = (fs) var7_ref.field_h;
                                                if (var9 != 0) {
                                                  break L3;
                                                } else {
                                                  L41: {
                                                    L42: {
                                                      if (var8 != ((kq) this).field_s.field_n) {
                                                        break L42;
                                                      } else {
                                                        if (var9 == 0) {
                                                          break L41;
                                                        } else {
                                                          break L42;
                                                        }
                                                      }
                                                    }
                                                    if (var7_ref.a((byte) -118, dn.field_h)) {
                                                      if (((kq) this).field_s.field_n.field_h[var8.field_x]) {
                                                        break L41;
                                                      } else {
                                                        ((kq) this).field_s.a(var8, (byte) 54);
                                                        break L41;
                                                      }
                                                    } else {
                                                      break L41;
                                                    }
                                                  }
                                                  var6++;
                                                  if (var9 == 0) {
                                                    continue L40;
                                                  } else {
                                                    break L5;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    L43: {
                                      L44: {
                                        ((kq) this).field_N.e((byte) 37);
                                        if (!((kq) this).field_N.f(244874369)) {
                                          break L44;
                                        } else {
                                          ((kq) this).field_N.field_o = fi.field_i;
                                          if (((kq) this).field_s.field_Q == null) {
                                            break L43;
                                          } else {
                                            L45: {
                                              stackOut_114_0 = ((kq) this).field_s.field_z;
                                              stackOut_114_1 = 0;
                                              stackIn_117_0 = stackOut_114_0;
                                              stackIn_117_1 = stackOut_114_1;
                                              stackIn_115_0 = stackOut_114_0;
                                              stackIn_115_1 = stackOut_114_1;
                                              if (null != ((kq) this).field_s.field_Q) {
                                                stackOut_117_0 = (tr) (Object) stackIn_117_0;
                                                stackOut_117_1 = stackIn_117_1;
                                                stackOut_117_2 = ((kq) this).field_s.field_Q.field_a;
                                                stackIn_118_0 = stackOut_117_0;
                                                stackIn_118_1 = stackOut_117_1;
                                                stackIn_118_2 = stackOut_117_2;
                                                break L45;
                                              } else {
                                                stackOut_115_0 = (tr) (Object) stackIn_115_0;
                                                stackOut_115_1 = stackIn_115_1;
                                                stackIn_116_0 = stackOut_115_0;
                                                stackIn_116_1 = stackOut_115_1;
                                                stackOut_116_0 = (tr) (Object) stackIn_116_0;
                                                stackOut_116_1 = stackIn_116_1;
                                                stackOut_116_2 = null;
                                                stackIn_118_0 = stackOut_116_0;
                                                stackIn_118_1 = stackOut_116_1;
                                                stackIn_118_2 = (pf) (Object) stackOut_116_2;
                                                break L45;
                                              }
                                            }
                                            ((tr) (Object) stackIn_118_0).a(stackIn_118_1, stackIn_118_2, false);
                                            if (!((kq) this).field_X.f(244874369)) {
                                              ((kq) this).field_X.e((byte) 8);
                                              ((kq) this).field_X.field_o = ip.field_h;
                                              if (var9 == 0) {
                                                break L43;
                                              } else {
                                                break L44;
                                              }
                                            } else {
                                              break L43;
                                            }
                                          }
                                        }
                                      }
                                      L46: {
                                        ((kq) this).field_N.field_o = fl.field_e;
                                        if (!((kq) this).field_X.f(244874369)) {
                                          break L46;
                                        } else {
                                          ((kq) this).field_X.e((byte) 88);
                                          ((kq) this).field_X.field_o = da.field_f;
                                          break L46;
                                        }
                                      }
                                      L47: {
                                        stackOut_124_0 = ((kq) this).field_s.field_z;
                                        stackOut_124_1 = -1;
                                        stackIn_126_0 = stackOut_124_0;
                                        stackIn_126_1 = stackOut_124_1;
                                        stackIn_125_0 = stackOut_124_0;
                                        stackIn_125_1 = stackOut_124_1;
                                        if (null != ((kq) this).field_s.field_Q) {
                                          stackOut_126_0 = (tr) (Object) stackIn_126_0;
                                          stackOut_126_1 = stackIn_126_1;
                                          stackOut_126_2 = ((kq) this).field_s.field_Q.field_a;
                                          stackIn_127_0 = stackOut_126_0;
                                          stackIn_127_1 = stackOut_126_1;
                                          stackIn_127_2 = stackOut_126_2;
                                          break L47;
                                        } else {
                                          stackOut_125_0 = (tr) (Object) stackIn_125_0;
                                          stackOut_125_1 = stackIn_125_1;
                                          stackOut_125_2 = null;
                                          stackIn_127_0 = stackOut_125_0;
                                          stackIn_127_1 = stackOut_125_1;
                                          stackIn_127_2 = (pf) (Object) stackOut_125_2;
                                          break L47;
                                        }
                                      }
                                      ((tr) (Object) stackIn_127_0).a(stackIn_127_1, stackIn_127_2, false);
                                      ((kq) this).field_s.a(2);
                                      break L43;
                                    }
                                    this.m(101);
                                    return var3_int != 0;
                                  }
                                } else {
                                  L48: {
                                    if (ge.field_n) {
                                      stackOut_107_0 = 0;
                                      stackIn_108_0 = stackOut_107_0;
                                      break L48;
                                    } else {
                                      stackOut_106_0 = 1;
                                      stackIn_108_0 = stackOut_106_0;
                                      break L48;
                                    }
                                  }
                                  ge.field_n = stackIn_108_0 != 0;
                                  ((kq) this).field_f.e((byte) 33);
                                  return var3_int != 0;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    L49: {
                      var4_ref_qh = (qh) dn.field_h.field_h;
                      var4_ref_qh.field_s = false;
                      if (var4_ref_qh == ((kq) this).field_e) {
                        ((kq) this).field_mb.field_o = t.field_b;
                        ((kq) this).field_mb.d(false);
                        break L49;
                      } else {
                        break L49;
                      }
                    }
                    L50: {
                      if (((kq) this).field_j == var4_ref_qh) {
                        ((kq) this).field_S.field_o = n.field_j;
                        ((kq) this).field_S.d(false);
                        break L50;
                      } else {
                        break L50;
                      }
                    }
                    L51: {
                      if (((kq) this).field_J != var4_ref_qh) {
                        break L51;
                      } else {
                        ((kq) this).field_n.field_o = rk.field_o;
                        ((kq) this).field_n.d(false);
                        break L51;
                      }
                    }
                    L52: {
                      if (((kq) this).field_cb != var4_ref_qh) {
                        break L52;
                      } else {
                        ((kq) this).field_W.field_o = wm.field_a;
                        ((kq) this).field_W.d(false);
                        break L52;
                      }
                    }
                    L53: {
                      if (var4_ref_qh != ((kq) this).field_nb) {
                        break L53;
                      } else {
                        ((kq) this).field_g.field_o = hi.field_d;
                        ((kq) this).field_g.d(false);
                        break L53;
                      }
                    }
                    var4_ref_qh.field_A = false;
                    return var3_int != 0;
                  }
                }
                stackOut_199_0 = param1;
                stackIn_200_0 = stackOut_199_0;
                break L4;
              }
              if (stackIn_200_0 >= 43) {
                break L3;
              } else {
                ((kq) this).field_y = null;
                break L3;
              }
            }
            L54: {
              if (var3_int != 0) {
                stackOut_204_0 = 0;
                stackIn_205_0 = stackOut_204_0;
                break L54;
              } else {
                stackOut_203_0 = 1;
                stackIn_205_0 = stackOut_203_0;
                break L54;
              }
            }
            L55: {
              if (stackIn_205_0 != 1) {
                break L55;
              } else {
                if (!((kq) this).field_s.field_W) {
                  break L55;
                } else {
                  var4 = ks.a(param0, true) ? 1 : 0;
                  if (var4 == 0) {
                    break L55;
                  } else {
                    return true;
                  }
                }
              }
            }
            return var3_int != 0;
          } else {
            L56: {
              if (je.field_d != 0) {
                L57: {
                  if (32 <= ((kq) this).field_u) {
                    break L57;
                  } else {
                    ((kq) this).field_u = -((kq) this).field_u + 60000;
                    gm discarded$4 = qk.a(sf.field_g, 121);
                    if (var9 == 0) {
                      break L56;
                    } else {
                      break L57;
                    }
                  }
                }
                if (59968 <= ((kq) this).field_u) {
                  break L56;
                } else {
                  ((kq) this).field_u = 59968;
                  gm discarded$5 = qk.a(sf.field_g, 111);
                  break L56;
                }
              } else {
                break L56;
              }
            }
            return true;
          }
        } else {
          this.c((byte) -56);
          return true;
        }
    }

    private final void a(boolean param0, String param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              var3_int = 10 + pd.field_k;
              var4 = bb.field_b + 20;
              var5 = rs.field_Cb.c(param1);
              if (13 + var4 > 480) {
                var3_int = pd.field_k;
                var4 = -15 + bb.field_b;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (10 + (var5 + var3_int) <= 639) {
                break L2;
              } else {
                var3_int = -1 + -var5 + 630;
                break L2;
              }
            }
            L3: {
              gf.a(var3_int, var4, var5 - -10, 13, 5, 0, 192);
              gf.f(-1 + var3_int, var4 - 1, var5 - -12, 15, 6, 3974311);
              rs.field_Cb.d(param1, 6 + var3_int, 3 + (var4 + rs.field_Cb.field_J / 2), 16777215, -1);
              if (!param0) {
                break L3;
              } else {
                ((kq) this).field_ob = null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) runtimeException;
            stackOut_10_1 = new StringBuilder().append("kq.K(").append(param0).append(',');
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L4;
            }
          }
          throw r.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
    }

    private final void i(int param0) {
        RuntimeException var2 = null;
        ph var2_ref = null;
        lp var3 = null;
        int var3_int = 0;
        int var4 = 0;
        lp var4_ref_lp = null;
        lp var5 = null;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!((kq) this).field_s.field_W) {
                break L1;
              } else {
                if (6 <= kb.field_x) {
                  break L1;
                } else {
                  return;
                }
              }
            }
            L2: {
              L3: {
                L4: {
                  ((kq) this).field_J.field_z.e(param0 ^ param0);
                  var2_ref = new ph(((kq) this).field_s.field_P.field_r);
                  ((kq) this).field_J.field_x = (jk) (Object) var2_ref;
                  if (((kq) this).field_s.field_n != null) {
                    break L4;
                  } else {
                    var3_int = 0;
                    L5: while (true) {
                      L6: {
                        if (var3_int >= ((kq) this).field_s.field_P.field_r) {
                          break L6;
                        } else {
                          var4_ref_lp = nl.a(var2_ref, ((kq) this).field_s.field_P.field_v, 2, ((kq) this).field_s.field_P.field_v[var3_int]);
                          var4_ref_lp.a((byte) 65, ((kq) this).field_J.field_z.field_k, ((kq) this).field_J.field_z.field_t - -((kq) this).field_J.field_z.field_y);
                          ((kq) this).field_J.field_z.a((vd) (Object) var4_ref_lp, param0 + 2);
                          var3_int++;
                          if (var6 != 0) {
                            break L3;
                          } else {
                            if (var6 == 0) {
                              continue L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                      if (var6 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                var3 = nl.a(var2_ref, ((kq) this).field_s.field_P.field_v, 2, ((kq) this).field_s.field_n);
                var3.a((byte) 125, ((kq) this).field_J.field_z.field_k, ((kq) this).field_J.field_z.field_t - -((kq) this).field_J.field_z.field_y);
                ((kq) this).field_J.field_z.a((vd) (Object) var3, 8);
                var4 = 0;
                L7: while (true) {
                  if (~((kq) this).field_s.field_P.field_r >= ~var4) {
                    break L3;
                  } else {
                    if (var6 != 0) {
                      break L2;
                    } else {
                      L8: {
                        L9: {
                          if (((kq) this).field_s.field_P.field_v[var4] != ((kq) this).field_s.field_n) {
                            break L9;
                          } else {
                            if (var6 == 0) {
                              break L8;
                            } else {
                              break L9;
                            }
                          }
                        }
                        var5 = lr.a(var2_ref, ((kq) this).field_s.field_n, (byte) 21, ((kq) this).field_s.field_P.field_v[var4], ((kq) this).field_s.field_P.field_v);
                        var5.a((byte) 83, ((kq) this).field_J.field_z.field_k, ((kq) this).field_J.field_z.field_t - -((kq) this).field_J.field_z.field_y);
                        ((kq) this).field_J.field_z.a((vd) (Object) var5, 8);
                        break L8;
                      }
                      var4++;
                      if (var6 == 0) {
                        continue L7;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "kq.W(" + param0 + ')');
        }
    }

    final void h(byte param0) {
        RuntimeException var2 = null;
        ad var2_ref = null;
        fs[] var2_array = null;
        int var2_int = 0;
        int var3_int = 0;
        dc var3 = null;
        fs var4_ref_fs = null;
        int var4 = 0;
        int var5 = 0;
        String var6_ref_String = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_93_0 = 0;
        int stackIn_95_0 = 0;
        int stackIn_96_0 = 0;
        int stackIn_96_1 = 0;
        int stackIn_125_0 = 0;
        int stackIn_125_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_92_0 = 0;
        int stackOut_95_0 = 0;
        int stackOut_95_1 = 0;
        int stackOut_93_0 = 0;
        int stackOut_93_1 = 0;
        int stackOut_124_0 = 0;
        int stackOut_124_1 = 0;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (((kq) this).field_s.field_L) {
                    break L3;
                  } else {
                    if (((kq) this).field_bb != null) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  L5: {
                    var2_ref = (ad) (Object) ((kq) this).field_k.field_v;
                    var2_ref.field_e.a(-2948, (bi) null);
                    if (((kq) this).field_s.field_N != 1) {
                      break L5;
                    } else {
                      ((kq) this).a(10, 0, il.field_Y);
                      if (var7 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  ((kq) this).a(10, 0, re.a(gs.field_m, 4371, new String[1]));
                  break L4;
                }
                if (var7 == 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
              ((kq) this).field_bb.d(false);
              break L1;
            }
            var2_array = ((kq) this).field_s.field_P.field_v;
            var3_int = 0;
            L6: while (true) {
              L7: {
                L8: {
                  if (~var3_int <= ~var2_array.length) {
                    break L8;
                  } else {
                    var4_ref_fs = var2_array[var3_int];
                    this.a((byte) -13, var4_ref_fs);
                    var3_int++;
                    if (var7 != 0) {
                      break L7;
                    } else {
                      if (var7 == 0) {
                        continue L6;
                      } else {
                        break L8;
                      }
                    }
                  }
                }
                L9: {
                  if (((kq) this).field_s.field_f) {
                    break L9;
                  } else {
                    if (!((kq) this).field_s.field_W) {
                      this.b(15);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                }
                rh.b((byte) -127);
                ((kq) this).field_V.a((byte) 68, ((kq) this).field_V.field_k, ((kq) this).d((byte) 14) - ((kq) this).field_V.field_i / 2);
                ((kq) this).field_K.a((byte) 45, ((kq) this).field_K.field_k, ((kq) this).field_V.field_t);
                break L7;
              }
              var2_int = -63 / ((67 - param0) / 41);
              var3 = ((kq) this).field_s.field_P;
              var4 = 0;
              var5 = 0;
              L10: while (true) {
                L11: {
                  L12: {
                    L13: {
                      if (var3.field_r <= var5) {
                        break L13;
                      } else {
                        stackOut_30_0 = ~var5;
                        stackOut_30_1 = ~((kq) this).field_s.field_h;
                        stackIn_125_0 = stackOut_30_0;
                        stackIn_125_1 = stackOut_30_1;
                        stackIn_31_0 = stackOut_30_0;
                        stackIn_31_1 = stackOut_30_1;
                        if (var7 != 0) {
                          break L12;
                        } else {
                          L14: {
                            L15: {
                              if (stackIn_31_0 == stackIn_31_1) {
                                break L15;
                              } else {
                                L16: {
                                  var6_ref_String = var3.field_I[var5];
                                  if ((1 << var5 & ((kq) this).field_s.field_i) != 0) {
                                    break L16;
                                  } else {
                                    L17: {
                                      if (0 != (var3.field_e & 1 << var5)) {
                                        break L17;
                                      } else {
                                        L18: {
                                          if ((var3.field_f & 1 << var5) == 0) {
                                            break L18;
                                          } else {
                                            var6_ref_String = re.a(ek.field_y, 4371, new String[1]);
                                            if (var7 == 0) {
                                              break L14;
                                            } else {
                                              break L18;
                                            }
                                          }
                                        }
                                        if ((((kq) this).field_s.field_P.field_w & 1 << var5) == 0) {
                                          L19: {
                                            if (var3.field_z) {
                                              break L19;
                                            } else {
                                              if ((var3.field_y & 1 << var5) != 0) {
                                                var6_ref_String = re.a(ob.field_i, 4371, new String[1]);
                                                if (var7 == 0) {
                                                  break L14;
                                                } else {
                                                  break L17;
                                                }
                                              } else {
                                                break L19;
                                              }
                                            }
                                          }
                                          var6_ref_String = null;
                                          break L14;
                                        } else {
                                          var6_ref_String = null;
                                          break L14;
                                        }
                                      }
                                    }
                                    L20: {
                                      if (((kq) this).field_s.field_M) {
                                        break L20;
                                      } else {
                                        var6_ref_String = re.a(bb.field_d, 4371, new String[1]);
                                        if (var7 == 0) {
                                          break L14;
                                        } else {
                                          break L20;
                                        }
                                      }
                                    }
                                    var6_ref_String = re.a(vm.field_Fb, 4371, new String[1]);
                                    if (var7 == 0) {
                                      break L14;
                                    } else {
                                      break L16;
                                    }
                                  }
                                }
                                L21: {
                                  if ((var3.field_f & 1 << var5) == 0) {
                                    break L21;
                                  } else {
                                    var6_ref_String = re.a(lg.field_f, 4371, new String[1]);
                                    if (var7 == 0) {
                                      break L14;
                                    } else {
                                      break L21;
                                    }
                                  }
                                }
                                var6_ref_String = re.a(bj.field_M, 4371, new String[1]);
                                if (var7 == 0) {
                                  break L14;
                                } else {
                                  break L15;
                                }
                              }
                            }
                            L22: {
                              if ((1 << var5 & var3.field_e) == 0) {
                                break L22;
                              } else {
                                L23: {
                                  if (((kq) this).field_s.field_M) {
                                    break L23;
                                  } else {
                                    var6_ref_String = f.field_B;
                                    if (var7 == 0) {
                                      break L14;
                                    } else {
                                      break L23;
                                    }
                                  }
                                }
                                var6_ref_String = ae.field_d;
                                if (var7 == 0) {
                                  break L14;
                                } else {
                                  break L22;
                                }
                              }
                            }
                            L24: {
                              if (0 == (var3.field_f & 1 << var5)) {
                                break L24;
                              } else {
                                var6_ref_String = uh.field_e;
                                if (var7 == 0) {
                                  break L14;
                                } else {
                                  break L24;
                                }
                              }
                            }
                            L25: {
                              if ((1 << var5 & ((kq) this).field_s.field_P.field_w) == 0) {
                                break L25;
                              } else {
                                var6_ref_String = lp.field_A;
                                if (var7 == 0) {
                                  break L14;
                                } else {
                                  break L25;
                                }
                              }
                            }
                            L26: {
                              L27: {
                                if (var3.field_z) {
                                  break L27;
                                } else {
                                  if ((1 << var5 & var3.field_y) != 0) {
                                    break L26;
                                  } else {
                                    break L27;
                                  }
                                }
                              }
                              var6_ref_String = null;
                              if (var7 == 0) {
                                break L14;
                              } else {
                                break L26;
                              }
                            }
                            var6_ref_String = pl.field_b;
                            break L14;
                          }
                          L28: {
                            if (null == var6_ref_String) {
                              break L28;
                            } else {
                              if (var6_ref_String.equals((Object) (Object) ((kq) this).field_ab[var5])) {
                                break L28;
                              } else {
                                ((kq) this).field_z[var5] = true;
                                break L28;
                              }
                            }
                          }
                          L29: {
                            ((kq) this).field_ab[var5] = var6_ref_String;
                            stackOut_92_0 = var4;
                            stackIn_95_0 = stackOut_92_0;
                            stackIn_93_0 = stackOut_92_0;
                            if (null == var6_ref_String) {
                              stackOut_95_0 = stackIn_95_0;
                              stackOut_95_1 = 0;
                              stackIn_96_0 = stackOut_95_0;
                              stackIn_96_1 = stackOut_95_1;
                              break L29;
                            } else {
                              stackOut_93_0 = stackIn_93_0;
                              stackOut_93_1 = 1;
                              stackIn_96_0 = stackOut_93_0;
                              stackIn_96_1 = stackOut_93_1;
                              break L29;
                            }
                          }
                          var4 = stackIn_96_0 | stackIn_96_1;
                          var5++;
                          if (var7 == 0) {
                            continue L10;
                          } else {
                            break L13;
                          }
                        }
                      }
                    }
                    L30: {
                      L31: {
                        L32: {
                          if (null == ((kq) this).field_s.field_n) {
                            break L32;
                          } else {
                            if (((kq) this).field_s.field_n.field_A != 0) {
                              break L31;
                            } else {
                              break L32;
                            }
                          }
                        }
                        ((kq) this).field_ab[var3.field_r] = null;
                        if (var7 == 0) {
                          break L30;
                        } else {
                          break L31;
                        }
                      }
                      var4 = 1;
                      if (((kq) this).field_ab[var3.field_r] != ul.field_Ab) {
                        ((kq) this).field_ab[var3.field_r] = ul.field_Ab;
                        ((kq) this).field_z[var3.field_r] = true;
                        ((kq) this).field_J.field_A = true;
                        ((kq) this).field_n.g(86);
                        break L30;
                      } else {
                        break L30;
                      }
                    }
                    L33: {
                      L34: {
                        if (var4 == 0) {
                          break L34;
                        } else {
                          L35: {
                            var5 = 250;
                            if (!((kq) this).field_ib) {
                              break L35;
                            } else {
                              var5 = 5 * var5 >> 2;
                              break L35;
                            }
                          }
                          L36: {
                            int fieldTemp$4 = ((kq) this).field_x + 1;
                            ((kq) this).field_x = ((kq) this).field_x + 1;
                            if (~var5 < ~fieldTemp$4) {
                              break L36;
                            } else {
                              L37: while (true) {
                                L38: {
                                  int fieldTemp$5 = ((kq) this).field_U + 1;
                                  ((kq) this).field_U = ((kq) this).field_U + 1;
                                  if (~fieldTemp$5 != ~((kq) this).field_ab.length) {
                                    break L38;
                                  } else {
                                    ((kq) this).field_U = 0;
                                    break L38;
                                  }
                                }
                                if (null == ((kq) this).field_ab[((kq) this).field_U]) {
                                  continue L37;
                                } else {
                                  ((kq) this).field_x = 0;
                                  ((kq) this).field_o = ((kq) this).field_ab[((kq) this).field_U];
                                  ((kq) this).field_ib = ((kq) this).field_z[((kq) this).field_U];
                                  ((kq) this).field_z[((kq) this).field_U] = false;
                                  var6 = rs.field_Cb.c(((kq) this).field_o);
                                  ((kq) this).field_T = new bi(var6, rs.field_Cb.field_q + rs.field_Cb.field_J);
                                  bs.a(((kq) this).field_T, 92);
                                  gf.b();
                                  rs.field_Cb.b(((kq) this).field_o, ((kq) this).field_T.field_z, rs.field_Cb.field_J, 16777215, -1);
                                  ((kq) this).field_eb = ((kq) this).field_T.g();
                                  ((kq) this).field_eb.e();
                                  gf.b();
                                  rs.field_Cb.b(((kq) this).field_o, ((kq) this).field_T.field_z, rs.field_Cb.field_J, 16777215, -1);
                                  gf.b(1, 1, 0, 0, ((kq) this).field_eb.field_z, ((kq) this).field_eb.field_w);
                                  cg.i(0);
                                  break L36;
                                }
                              }
                            }
                          }
                          if (var7 == 0) {
                            break L33;
                          } else {
                            break L34;
                          }
                        }
                      }
                      ((kq) this).field_x = 250;
                      ((kq) this).field_U = -1;
                      break L33;
                    }
                    if (((kq) this).field_u != 0) {
                      int fieldTemp$6 = ((kq) this).field_u + 1;
                      ((kq) this).field_u = ((kq) this).field_u + 1;
                      stackOut_124_0 = fieldTemp$6;
                      stackOut_124_1 = 60000;
                      stackIn_125_0 = stackOut_124_0;
                      stackIn_125_1 = stackOut_124_1;
                      break L12;
                    } else {
                      break L11;
                    }
                  }
                  L39: {
                    if (stackIn_125_0 != stackIn_125_1) {
                      break L39;
                    } else {
                      this.a((byte) 33);
                      break L39;
                    }
                  }
                  if (((kq) this).field_u == 59968) {
                    gm discarded$7 = qk.a(sf.field_g, 122);
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L40: {
                  L41: {
                    if (!((kq) this).field_Y) {
                      break L41;
                    } else {
                      if (32 > ((kq) this).field_b) {
                        ((kq) this).field_b = ((kq) this).field_b + 1;
                        if (var7 == 0) {
                          break L40;
                        } else {
                          break L41;
                        }
                      } else {
                        break L40;
                      }
                    }
                  }
                  if (((kq) this).field_b <= 0) {
                    break L40;
                  } else {
                    ((kq) this).field_b = ((kq) this).field_b - 1;
                    break L40;
                  }
                }
                L42: {
                  if (((kq) this).field_b != 0) {
                    this.p(3);
                    break L42;
                  } else {
                    break L42;
                  }
                }
                L43: {
                  if (!((kq) this).field_s.field_W) {
                    break L43;
                  } else {
                    L44: {
                      gi.a(false);
                      ra.a(-127);
                      fj.field_r.e();
                      gf.d(0, 0, fj.field_r.field_z, fj.field_r.field_w, 0);
                      if (!se.field_k) {
                        break L44;
                      } else {
                        aq.field_i.f(10, 10);
                        var5 = ui.a(0, 16777215, -96, qd.field_f);
                        fj.field_r.f(var5);
                        fj.field_r.f(var5);
                        fj.field_r.e();
                        gf.b(5, 5, 0, 0, fj.field_r.field_z, fj.field_r.field_w);
                        break L44;
                      }
                    }
                    L45: {
                      kb.field_w.e();
                      gf.d(0, 0, kb.field_w.field_z, kb.field_w.field_w, 0);
                      if (ph.field_g) {
                        rk.field_j.f(10, 10);
                        var5 = ui.a(0, 16777215, -103, qd.field_f);
                        kb.field_w.f(var5);
                        kb.field_w.f(var5);
                        kb.field_w.e();
                        gf.b(2, 2, 0, 0, kb.field_w.field_z, kb.field_w.field_w);
                        var6 = 0;
                        L46: while (true) {
                          if (var6 >= kb.field_w.field_B.length) {
                            break L45;
                          } else {
                            kb.field_w.field_B[var6] = 16777215 + we.a(kb.field_w.field_B[var6] << 8, -16777216);
                            var6++;
                            if (var7 != 0) {
                              break L43;
                            } else {
                              if (var7 == 0) {
                                continue L46;
                              } else {
                                break L45;
                              }
                            }
                          }
                        }
                      } else {
                        break L45;
                      }
                    }
                    cg.i(0);
                    break L43;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "kq.EA(" + param0 + ')');
        }
    }

    private final void p(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_29_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_60_0 = 0;
        int stackIn_60_1 = 0;
        int stackIn_69_0 = 0;
        int stackIn_69_1 = 0;
        int stackIn_71_0 = 0;
        int stackIn_71_1 = 0;
        int stackIn_73_0 = 0;
        int stackIn_73_1 = 0;
        int stackIn_80_0 = 0;
        int stackIn_80_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_28_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_50_1 = 0;
        int stackOut_70_0 = 0;
        int stackOut_70_1 = 0;
        int stackOut_71_0 = 0;
        int stackOut_71_1 = 0;
        int stackOut_68_0 = 0;
        int stackOut_68_1 = 0;
        int stackOut_59_0 = 0;
        int stackOut_59_1 = 0;
        int stackOut_79_0 = 0;
        int stackOut_79_1 = 0;
        var13 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (((kq) this).field_kb != 0) {
                int fieldTemp$3 = ((kq) this).field_kb + 1;
                ((kq) this).field_kb = ((kq) this).field_kb + 1;
                if (fieldTemp$3 < 32) {
                  break L1;
                } else {
                  ((kq) this).field_Z = ((kq) this).field_C;
                  ((kq) this).field_H = ((kq) this).field_fb;
                  ((kq) this).field_kb = 0;
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  if (3 == ((kq) this).field_D) {
                    break L4;
                  } else {
                    if (null != ((kq) this).field_C) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                int fieldTemp$4 = ((kq) this).field_Q - 8;
                ((kq) this).field_Q = ((kq) this).field_Q - 8;
                if (fieldTemp$4 < 0) {
                  ((kq) this).field_Q = 0;
                  if (var13 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                } else {
                  break L2;
                }
              }
              int fieldTemp$5 = ((kq) this).field_Q + 8;
              ((kq) this).field_Q = ((kq) this).field_Q + 8;
              if (fieldTemp$5 <= 256) {
                break L2;
              } else {
                ((kq) this).field_Q = 256;
                break L2;
              }
            }
            L5: {
              ((kq) this).field_p[((kq) this).field_w] = ((kq) this).field_p[((kq) this).field_w] + 1;
              if (32 < ((kq) this).field_p[((kq) this).field_w] + 1) {
                ((kq) this).field_p[((kq) this).field_w] = 32;
                break L5;
              } else {
                break L5;
              }
            }
            var2_int = 32 + -((kq) this).field_p[((kq) this).field_w];
            var3 = 0;
            L6: while (true) {
              L7: {
                L8: {
                  if (4 <= var3) {
                    break L8;
                  } else {
                    stackOut_28_0 = ~var3;
                    stackIn_40_0 = stackOut_28_0;
                    stackIn_29_0 = stackOut_28_0;
                    if (var13 != 0) {
                      break L7;
                    } else {
                      L9: {
                        if (stackIn_29_0 == ~((kq) this).field_w) {
                          break L9;
                        } else {
                          if (var2_int < ((kq) this).field_p[var3]) {
                            ((kq) this).field_p[var3] = ((kq) this).field_p[var3] - 1;
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                      }
                      var3++;
                      if (var13 == 0) {
                        continue L6;
                      } else {
                        break L8;
                      }
                    }
                  }
                }
                var3 = ((kq) this).field_s.field_P.field_r;
                stackOut_39_0 = 210;
                stackIn_40_0 = stackOut_39_0;
                break L7;
              }
              L10: {
                L11: {
                  L12: {
                    L13: {
                      var4 = stackIn_40_0;
                      if (var3 != 2) {
                        break L13;
                      } else {
                        var5 = 0;
                        L14: while (true) {
                          L15: {
                            if (var5 >= 4) {
                              break L15;
                            } else {
                              var6 = var4 / (4 - var5);
                              ((kq) this).field_ob[var5] = 12 - -var6;
                              var4 = var4 - var6;
                              var5++;
                              if (var13 != 0) {
                                break L10;
                              } else {
                                if (var13 == 0) {
                                  continue L14;
                                } else {
                                  break L15;
                                }
                              }
                            }
                          }
                          if (var13 == 0) {
                            break L12;
                          } else {
                            break L13;
                          }
                        }
                      }
                    }
                    var5 = var4 / (6 + var3);
                    var6 = 12 + 2 * var5;
                    var7 = -(8 * var5) + var4;
                    ((kq) this).field_ob[((kq) this).field_w] = var6 - -var7;
                    var8 = re.a(0, 32, ((kq) this).field_p[((kq) this).field_w], var7, 0);
                    var7 = var7 - var8;
                    var9 = new int[4];
                    var10 = 0;
                    var11 = 0;
                    L16: while (true) {
                      L17: {
                        if (4 <= var11) {
                          break L17;
                        } else {
                          stackOut_50_0 = ((kq) this).field_w;
                          stackOut_50_1 = var11;
                          stackIn_69_0 = stackOut_50_0;
                          stackIn_69_1 = stackOut_50_1;
                          stackIn_51_0 = stackOut_50_0;
                          stackIn_51_1 = stackOut_50_1;
                          if (var13 != 0) {
                            L18: while (true) {
                              if (stackIn_69_0 <= stackIn_69_1) {
                                break L12;
                              } else {
                                stackOut_70_0 = var11;
                                stackOut_70_1 = ((kq) this).field_w;
                                stackIn_80_0 = stackOut_70_0;
                                stackIn_80_1 = stackOut_70_1;
                                stackIn_71_0 = stackOut_70_0;
                                stackIn_71_1 = stackOut_70_1;
                                if (var13 != 0) {
                                  break L11;
                                } else {
                                  stackOut_71_0 = stackIn_71_0;
                                  stackOut_71_1 = stackIn_71_1;
                                  stackIn_73_0 = stackOut_71_0;
                                  stackIn_73_1 = stackOut_71_1;
                                  L19: {
                                    if (stackIn_73_0 == stackIn_73_1) {
                                      break L19;
                                    } else {
                                      ((kq) this).field_ob[var11] = var6 + var7 / 3;
                                      ((kq) this).field_ob[((kq) this).field_w] = ((kq) this).field_ob[((kq) this).field_w] - var7 / 3;
                                      break L19;
                                    }
                                  }
                                  var11++;
                                  if (var13 == 0) {
                                    stackOut_68_0 = ~var11;
                                    stackOut_68_1 = -5;
                                    stackIn_69_0 = stackOut_68_0;
                                    stackIn_69_1 = stackOut_68_1;
                                    continue L18;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                            }
                          } else {
                            L20: {
                              if (stackIn_51_0 == stackIn_51_1) {
                                break L20;
                              } else {
                                var12 = re.a(0, 32, ((kq) this).field_p[var11], 1024, 0);
                                var9[var11] = var12;
                                var10 = var10 + var12;
                                break L20;
                              }
                            }
                            var11++;
                            if (var13 == 0) {
                              continue L16;
                            } else {
                              break L17;
                            }
                          }
                        }
                      }
                      L21: {
                        if (var10 == 0) {
                          break L21;
                        } else {
                          var11 = 0;
                          L22: while (true) {
                            L23: {
                              if (var11 >= 4) {
                                break L23;
                              } else {
                                stackOut_59_0 = var11;
                                stackOut_59_1 = ((kq) this).field_w;
                                stackIn_80_0 = stackOut_59_0;
                                stackIn_80_1 = stackOut_59_1;
                                stackIn_60_0 = stackOut_59_0;
                                stackIn_60_1 = stackOut_59_1;
                                if (var13 != 0) {
                                  break L11;
                                } else {
                                  L24: {
                                    if (stackIn_60_0 == stackIn_60_1) {
                                      break L24;
                                    } else {
                                      ((kq) this).field_ob[var11] = var7 * var9[var11] / var10 + var6;
                                      ((kq) this).field_ob[((kq) this).field_w] = ((kq) this).field_ob[((kq) this).field_w] - var7 * var9[var11] / var10;
                                      break L24;
                                    }
                                  }
                                  var11++;
                                  if (var13 == 0) {
                                    continue L22;
                                  } else {
                                    break L23;
                                  }
                                }
                              }
                            }
                            if (var13 == 0) {
                              break L12;
                            } else {
                              break L21;
                            }
                          }
                        }
                      }
                      var11 = 0;
                      L25: while (true) {
                        stackOut_68_0 = ~var11;
                        stackOut_68_1 = -5;
                        stackIn_69_0 = stackOut_68_0;
                        stackIn_69_1 = stackOut_68_1;
                        if (stackIn_69_0 <= stackIn_69_1) {
                          break L12;
                        } else {
                          stackOut_70_0 = var11;
                          stackOut_70_1 = ((kq) this).field_w;
                          stackIn_80_0 = stackOut_70_0;
                          stackIn_80_1 = stackOut_70_1;
                          stackIn_71_0 = stackOut_70_0;
                          stackIn_71_1 = stackOut_70_1;
                          if (var13 != 0) {
                            break L11;
                          } else {
                            stackOut_71_0 = stackIn_71_0;
                            stackOut_71_1 = stackIn_71_1;
                            stackIn_73_0 = stackOut_71_0;
                            stackIn_73_1 = stackOut_71_1;
                            L26: {
                              if (stackIn_73_0 == stackIn_73_1) {
                                break L26;
                              } else {
                                ((kq) this).field_ob[var11] = var6 + var7 / 3;
                                ((kq) this).field_ob[((kq) this).field_w] = ((kq) this).field_ob[((kq) this).field_w] - var7 / 3;
                                break L26;
                              }
                            }
                            var11++;
                            if (var13 == 0) {
                              continue L25;
                            } else {
                              break L12;
                            }
                          }
                        }
                      }
                    }
                  }
                  stackOut_79_0 = 20;
                  stackOut_79_1 = 32;
                  stackIn_80_0 = stackOut_79_0;
                  stackIn_80_1 = stackOut_79_1;
                  break L11;
                }
                var5 = re.a(stackIn_80_0, stackIn_80_1, ((kq) this).field_b, 550, param0 + -3);
                ((kq) this).field_F.a((byte) 85, 20 + (640 + -var5) / 2, ((kq) this).field_hb.field_t);
                ((kq) this).field_lb.a((byte) 45, 5 + (((kq) this).field_hb.field_m + (-var5 + 640) / 2) - -20, ((kq) this).field_gb.field_t);
                ((kq) this).field_m.a((byte) 107, 2 * (((kq) this).field_hb.field_m - -5) + (640 - var5) / 2 + 20, ((kq) this).field_db.field_t);
                ((kq) this).field_M.a((byte) 101, (640 - var5) / 2 - -20 - -((((kq) this).field_hb.field_m - -5) * param0), ((kq) this).field_a.field_t);
                break L10;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "kq.RA(" + param0 + ')');
        }
    }

    private final void b(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        nf var8_ref_nf = null;
        int var8 = 0;
        nf var9_ref_nf = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_4_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_21_0 = 0;
        Object stackIn_37_0 = null;
        Object stackIn_39_0 = null;
        Object stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_20_0 = 0;
        Object stackOut_36_0 = null;
        Object stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        Object stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = ed.field_f * ed.field_f;
            var3 = var2_int + -(fl.field_h * fl.field_h);
            var4 = 360 - -(120 * var3 / var2_int);
            ((kq) this).field_O.a(640, 120, (byte) 112, var4, 0);
            ((kq) this).field_E.field_xb.field_M.a(0);
            var5 = 0;
            var6 = 0;
            var7 = -1 + da.field_g;
            L1: while (true) {
              L2: {
                L3: {
                  if (var7 < 0) {
                    break L3;
                  } else {
                    var8_ref_nf = wm.field_d[var7];
                    stackOut_3_0 = ~kp.field_i;
                    stackIn_21_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var11 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_4_0 >= ~var5) {
                          stackOut_9_0 = 0;
                          stackIn_10_0 = stackOut_9_0;
                          break L4;
                        } else {
                          stackOut_7_0 = 1;
                          stackIn_10_0 = stackOut_7_0;
                          break L4;
                        }
                      }
                      L5: {
                        L6: {
                          var9 = stackIn_10_0;
                          if (var9 != 0) {
                            break L6;
                          } else {
                            var8_ref_nf.field_j = null;
                            if (var11 == 0) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        L7: {
                          if (null != var8_ref_nf.field_j) {
                            break L7;
                          } else {
                            var10 = var8_ref_nf.field_g;
                            var8_ref_nf.field_j = new qr(0L, gn.field_w, var8_ref_nf.field_k);
                            var8_ref_nf.field_j.field_jb = ((16711422 & gn.field_w.field_jb) >> 1) + var10 - (var10 >> 1 & 8355711);
                            var6 += 15;
                            var8_ref_nf.field_j.field_nb = ho.field_f;
                            var8_ref_nf.field_j.field_x = var10;
                            var8_ref_nf.field_j.field_qb = (8355711 & gn.field_w.field_qb >> 1) + (-((var10 & 16711422) >> 1) + var10);
                            break L7;
                          }
                        }
                        var5++;
                        break L5;
                      }
                      var7--;
                      if (var11 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var7 = 0;
                stackOut_20_0 = 0;
                stackIn_21_0 = stackOut_20_0;
                break L2;
              }
              var8 = stackIn_21_0;
              L8: while (true) {
                L9: {
                  L10: {
                    if (var8 >= da.field_g) {
                      break L10;
                    } else {
                      var9_ref_nf = wm.field_d[var8];
                      if (var11 != 0) {
                        break L9;
                      } else {
                        L11: {
                          if (null != var9_ref_nf.field_j) {
                            ((kq) this).field_E.field_xb.a(4, var9_ref_nf.field_j);
                            var9_ref_nf.field_j.a(var9_ref_nf.field_j.e(false), 15, (byte) 79, var7, tg.field_a);
                            var7 += 15;
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                        var8++;
                        if (var11 == 0) {
                          continue L8;
                        } else {
                          break L10;
                        }
                      }
                    }
                  }
                  var8 = -var7 + var6 + ((kq) this).field_E.field_xb.field_gb + ((kq) this).field_E.field_xb.field_mb;
                  ((kq) this).field_E.field_xb.field_mb = ((kq) this).field_E.field_xb.field_mb - var8;
                  ((kq) this).field_E.field_xb.field_db = ((kq) this).field_E.field_xb.field_db + var8;
                  ((kq) this).field_E.field_xb.field_mb = var7;
                  ((kq) this).field_E.field_xb.field_gb = var7 + -((kq) this).field_E.field_xb.field_mb;
                  break L9;
                }
                L12: {
                  var9 = ((kq) this).field_E.field_zb.field_mb + -((kq) this).field_E.field_xb.field_mb + -((kq) this).field_E.field_xb.field_gb;
                  if (((kq) this).field_v) {
                    ((kq) this).field_E.field_xb.field_w = var9 - ((kq) this).field_E.field_xb.field_db;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L13: {
                  ((kq) this).field_E.a(30 * so.field_o, true, (byte) -115, param0);
                  stackOut_36_0 = this;
                  stackIn_39_0 = stackOut_36_0;
                  stackIn_37_0 = stackOut_36_0;
                  if (var9 != ((kq) this).field_E.field_xb.field_db - -((kq) this).field_E.field_xb.field_w) {
                    stackOut_39_0 = this;
                    stackOut_39_1 = 0;
                    stackIn_40_0 = stackOut_39_0;
                    stackIn_40_1 = stackOut_39_1;
                    break L13;
                  } else {
                    stackOut_37_0 = this;
                    stackOut_37_1 = 1;
                    stackIn_40_0 = stackOut_37_0;
                    stackIn_40_1 = stackOut_37_1;
                    break L13;
                  }
                }
                ((kq) this).field_v = stackIn_40_1 != 0;
                ((kq) this).field_O.a(true, -20429);
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "kq.MA(" + param0 + ')');
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_20_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_19_0 = 0;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            var4 = uq.field_k;
            L1: while (true) {
              L2: {
                L3: {
                  if (kr.field_f.length <= var3_int) {
                    break L3;
                  } else {
                    var5 = ss.field_a[var3_int];
                    stackOut_3_0 = -1;
                    stackOut_3_1 = ~var5;
                    stackIn_16_0 = stackOut_3_0;
                    stackIn_16_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (var8 != 0) {
                      break L2;
                    } else {
                      L4: {
                        L5: {
                          if (stackIn_4_0 < stackIn_4_1) {
                            break L5;
                          } else {
                            var6 = vm.a(kr.field_f[var3_int], 0, true);
                            var7 = cn.field_w + -(var6 >> 1);
                            var4 = var4 + sm.field_b;
                            if (ek.a(id.field_b + (ar.field_i << 1), param0, var7 + -tr.field_Lb, (byte) -99, var4, (tr.field_Lb << 1) + var6, param1)) {
                              stackOut_10_0 = var5;
                              stackIn_11_0 = stackOut_10_0;
                              return stackIn_11_0;
                            } else {
                              var4 = var4 + (id.field_b + (ar.field_i << 1) - -sm.field_b);
                              if (var8 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        var4 = var4 + e.field_d;
                        break L4;
                      }
                      var3_int++;
                      if (var8 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_15_0 = param2;
                stackOut_15_1 = 16777215;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                break L2;
              }
              L6: {
                if (stackIn_16_0 == stackIn_16_1) {
                  break L6;
                } else {
                  field_L = null;
                  break L6;
                }
              }
              stackOut_19_0 = -1;
              stackIn_20_0 = stackOut_19_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var3, "kq.Q(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_20_0;
    }

    private final void a(int param0, qh param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            ((kq) this).field_y.a((oh) (Object) param1, 0);
            var3_int = -87 % ((param0 - -52) / 61);
            ((kq) this).field_y.a((oh) (Object) ((kq) this).field_K, 0);
            ((kq) this).field_y.a((oh) (Object) ((kq) this).field_V, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("kq.CA(").append(param0).append(',');
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw r.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    private final String a(boolean param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        StringBuilder var4 = null;
        String stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              var3_int = param1 / 60;
              param1 = param1 % 60;
              var4 = new StringBuilder(5);
              StringBuilder discarded$25 = var4.append((char)(48 + var3_int / 10));
              StringBuilder discarded$26 = var4.append((char)(48 - -(var3_int % 10)));
              StringBuilder discarded$27 = var4.append(':');
              StringBuilder discarded$28 = var4.append((char)(param1 / 10 + 48));
              StringBuilder discarded$29 = var4.append((char)(param1 % 10 + 48));
              if (!param0) {
                break L1;
              } else {
                kq.b((String) null, 61);
                break L1;
              }
            }
            stackOut_3_0 = var4.toString();
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var3, "kq.S(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final bh b(byte param0) {
        RuntimeException var2 = null;
        bh var2_ref = null;
        int var3 = 0;
        bh var4 = null;
        pf var5 = null;
        int var6 = 0;
        Object var7 = null;
        bh var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        pf stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        bh stackIn_4_2 = null;
        bh stackIn_4_3 = null;
        int stackIn_4_4 = 0;
        int stackIn_4_5 = 0;
        pf stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        bh stackIn_6_2 = null;
        bh stackIn_6_3 = null;
        int stackIn_6_4 = 0;
        int stackIn_6_5 = 0;
        pf stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        bh stackIn_8_2 = null;
        bh stackIn_8_3 = null;
        int stackIn_8_4 = 0;
        int stackIn_8_5 = 0;
        pf stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        bh stackIn_9_2 = null;
        bh stackIn_9_3 = null;
        int stackIn_9_4 = 0;
        int stackIn_9_5 = 0;
        int stackIn_9_6 = 0;
        pf stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        bh stackIn_12_2 = null;
        bh stackIn_12_3 = null;
        pf stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        bh stackIn_14_2 = null;
        bh stackIn_14_3 = null;
        pf stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        bh stackIn_16_2 = null;
        bh stackIn_16_3 = null;
        pf stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        bh stackIn_17_2 = null;
        bh stackIn_17_3 = null;
        int stackIn_17_4 = 0;
        pf stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        bh stackIn_20_2 = null;
        bh stackIn_20_3 = null;
        int stackIn_20_4 = 0;
        int stackIn_20_5 = 0;
        int stackIn_20_6 = 0;
        pf stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        bh stackIn_22_2 = null;
        bh stackIn_22_3 = null;
        int stackIn_22_4 = 0;
        int stackIn_22_5 = 0;
        int stackIn_22_6 = 0;
        pf stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        bh stackIn_24_2 = null;
        bh stackIn_24_3 = null;
        int stackIn_24_4 = 0;
        int stackIn_24_5 = 0;
        int stackIn_24_6 = 0;
        pf stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        bh stackIn_25_2 = null;
        bh stackIn_25_3 = null;
        int stackIn_25_4 = 0;
        int stackIn_25_5 = 0;
        int stackIn_25_6 = 0;
        int stackIn_25_7 = 0;
        pf stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        bh stackIn_30_2 = null;
        bh stackIn_30_3 = null;
        int stackIn_30_4 = 0;
        pf stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        bh stackIn_32_2 = null;
        bh stackIn_32_3 = null;
        int stackIn_32_4 = 0;
        pf stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        bh stackIn_33_2 = null;
        bh stackIn_33_3 = null;
        int stackIn_33_4 = 0;
        int stackIn_33_5 = 0;
        bh stackIn_37_0 = null;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        int stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        int stackIn_41_2 = 0;
        bh stackIn_45_0 = null;
        bh stackIn_47_0 = null;
        RuntimeException decompiledCaughtException = null;
        bh stackOut_46_0 = null;
        pf stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        bh stackOut_3_2 = null;
        bh stackOut_3_3 = null;
        int stackOut_3_4 = 0;
        int stackOut_3_5 = 0;
        pf stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        bh stackOut_8_2 = null;
        bh stackOut_8_3 = null;
        int stackOut_8_4 = 0;
        int stackOut_8_5 = 0;
        int stackOut_8_6 = 0;
        pf stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        bh stackOut_4_2 = null;
        bh stackOut_4_3 = null;
        int stackOut_4_4 = 0;
        int stackOut_4_5 = 0;
        pf stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        bh stackOut_6_2 = null;
        bh stackOut_6_3 = null;
        int stackOut_6_4 = 0;
        int stackOut_6_5 = 0;
        int stackOut_6_6 = 0;
        pf stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        bh stackOut_11_2 = null;
        bh stackOut_11_3 = null;
        pf stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        bh stackOut_16_2 = null;
        bh stackOut_16_3 = null;
        int stackOut_16_4 = 0;
        pf stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        bh stackOut_12_2 = null;
        bh stackOut_12_3 = null;
        pf stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        bh stackOut_14_2 = null;
        bh stackOut_14_3 = null;
        int stackOut_14_4 = 0;
        pf stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        bh stackOut_19_2 = null;
        bh stackOut_19_3 = null;
        int stackOut_19_4 = 0;
        int stackOut_19_5 = 0;
        int stackOut_19_6 = 0;
        pf stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        bh stackOut_24_2 = null;
        bh stackOut_24_3 = null;
        int stackOut_24_4 = 0;
        int stackOut_24_5 = 0;
        int stackOut_24_6 = 0;
        int stackOut_24_7 = 0;
        pf stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        bh stackOut_20_2 = null;
        bh stackOut_20_3 = null;
        int stackOut_20_4 = 0;
        int stackOut_20_5 = 0;
        int stackOut_20_6 = 0;
        pf stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        bh stackOut_22_2 = null;
        bh stackOut_22_3 = null;
        int stackOut_22_4 = 0;
        int stackOut_22_5 = 0;
        int stackOut_22_6 = 0;
        int stackOut_22_7 = 0;
        pf stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        bh stackOut_29_2 = null;
        bh stackOut_29_3 = null;
        int stackOut_29_4 = 0;
        pf stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        bh stackOut_32_2 = null;
        bh stackOut_32_3 = null;
        int stackOut_32_4 = 0;
        int stackOut_32_5 = 0;
        pf stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        bh stackOut_30_2 = null;
        bh stackOut_30_3 = null;
        int stackOut_30_4 = 0;
        int stackOut_30_5 = 0;
        bh stackOut_36_0 = null;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        int stackOut_40_0 = 0;
        int stackOut_40_1 = 0;
        int stackOut_40_2 = 0;
        int stackOut_38_0 = 0;
        int stackOut_38_1 = 0;
        int stackOut_38_2 = 0;
        Object stackOut_44_0 = null;
        var12 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var2_ref = new bh(0, 50, 640, 430);
            var3 = -79 % ((-6 - param0) / 50);
            if (!((kq) this).field_s.field_W) {
              stackOut_46_0 = new bh(0, 50, 640, 430);
              stackIn_47_0 = stackOut_46_0;
              break L0;
            } else {
              L1: {
                var4 = new bh(e.field_f, fk.field_k, ei.field_e, kl.field_o);
                var5 = new pf();
                if (var2_ref.field_l >= var4.field_l) {
                  break L1;
                } else {
                  L2: {
                    stackOut_3_0 = (pf) var5;
                    stackOut_3_1 = -113;
                    stackOut_3_2 = null;
                    stackOut_3_3 = null;
                    stackOut_3_4 = var2_ref.field_l;
                    stackOut_3_5 = var2_ref.field_q;
                    stackIn_8_0 = stackOut_3_0;
                    stackIn_8_1 = stackOut_3_1;
                    stackIn_8_2 = stackOut_3_2;
                    stackIn_8_3 = stackOut_3_3;
                    stackIn_8_4 = stackOut_3_4;
                    stackIn_8_5 = stackOut_3_5;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    stackIn_4_2 = stackOut_3_2;
                    stackIn_4_3 = stackOut_3_3;
                    stackIn_4_4 = stackOut_3_4;
                    stackIn_4_5 = stackOut_3_5;
                    if (var4.field_l > var2_ref.field_o) {
                      stackOut_8_0 = (pf) (Object) stackIn_8_0;
                      stackOut_8_1 = stackIn_8_1;
                      stackOut_8_2 = null;
                      stackOut_8_3 = null;
                      stackOut_8_4 = stackIn_8_4;
                      stackOut_8_5 = stackIn_8_5;
                      stackOut_8_6 = var2_ref.field_o;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      stackIn_9_2 = stackOut_8_2;
                      stackIn_9_3 = stackOut_8_3;
                      stackIn_9_4 = stackOut_8_4;
                      stackIn_9_5 = stackOut_8_5;
                      stackIn_9_6 = stackOut_8_6;
                      break L2;
                    } else {
                      stackOut_4_0 = (pf) (Object) stackIn_4_0;
                      stackOut_4_1 = stackIn_4_1;
                      stackOut_4_2 = null;
                      stackOut_4_3 = null;
                      stackOut_4_4 = stackIn_4_4;
                      stackOut_4_5 = stackIn_4_5;
                      stackIn_6_0 = stackOut_4_0;
                      stackIn_6_1 = stackOut_4_1;
                      stackIn_6_2 = stackOut_4_2;
                      stackIn_6_3 = stackOut_4_3;
                      stackIn_6_4 = stackOut_4_4;
                      stackIn_6_5 = stackOut_4_5;
                      stackOut_6_0 = (pf) (Object) stackIn_6_0;
                      stackOut_6_1 = stackIn_6_1;
                      stackOut_6_2 = null;
                      stackOut_6_3 = null;
                      stackOut_6_4 = stackIn_6_4;
                      stackOut_6_5 = stackIn_6_5;
                      stackOut_6_6 = var4.field_l;
                      stackIn_9_0 = stackOut_6_0;
                      stackIn_9_1 = stackOut_6_1;
                      stackIn_9_2 = stackOut_6_2;
                      stackIn_9_3 = stackOut_6_3;
                      stackIn_9_4 = stackOut_6_4;
                      stackIn_9_5 = stackOut_6_5;
                      stackIn_9_6 = stackOut_6_6;
                      break L2;
                    }
                  }
                  ((pf) (Object) stackIn_9_0).a((byte) stackIn_9_1, (oh) (Object) new bh(stackIn_9_4, stackIn_9_5, stackIn_9_6, var2_ref.field_i));
                  break L1;
                }
              }
              L3: {
                if (~var4.field_o <= ~var2_ref.field_o) {
                  break L3;
                } else {
                  L4: {
                    stackOut_11_0 = (pf) var5;
                    stackOut_11_1 = -113;
                    stackOut_11_2 = null;
                    stackOut_11_3 = null;
                    stackIn_16_0 = stackOut_11_0;
                    stackIn_16_1 = stackOut_11_1;
                    stackIn_16_2 = stackOut_11_2;
                    stackIn_16_3 = stackOut_11_3;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    stackIn_12_2 = stackOut_11_2;
                    stackIn_12_3 = stackOut_11_3;
                    if (var4.field_o >= var2_ref.field_l) {
                      stackOut_16_0 = (pf) (Object) stackIn_16_0;
                      stackOut_16_1 = stackIn_16_1;
                      stackOut_16_2 = null;
                      stackOut_16_3 = null;
                      stackOut_16_4 = var4.field_o;
                      stackIn_17_0 = stackOut_16_0;
                      stackIn_17_1 = stackOut_16_1;
                      stackIn_17_2 = stackOut_16_2;
                      stackIn_17_3 = stackOut_16_3;
                      stackIn_17_4 = stackOut_16_4;
                      break L4;
                    } else {
                      stackOut_12_0 = (pf) (Object) stackIn_12_0;
                      stackOut_12_1 = stackIn_12_1;
                      stackOut_12_2 = null;
                      stackOut_12_3 = null;
                      stackIn_14_0 = stackOut_12_0;
                      stackIn_14_1 = stackOut_12_1;
                      stackIn_14_2 = stackOut_12_2;
                      stackIn_14_3 = stackOut_12_3;
                      stackOut_14_0 = (pf) (Object) stackIn_14_0;
                      stackOut_14_1 = stackIn_14_1;
                      stackOut_14_2 = null;
                      stackOut_14_3 = null;
                      stackOut_14_4 = var2_ref.field_l;
                      stackIn_17_0 = stackOut_14_0;
                      stackIn_17_1 = stackOut_14_1;
                      stackIn_17_2 = stackOut_14_2;
                      stackIn_17_3 = stackOut_14_3;
                      stackIn_17_4 = stackOut_14_4;
                      break L4;
                    }
                  }
                  ((pf) (Object) stackIn_17_0).a((byte) stackIn_17_1, (oh) (Object) new bh(stackIn_17_4, var2_ref.field_q, var2_ref.field_o, var2_ref.field_i));
                  break L3;
                }
              }
              L5: {
                if (~var4.field_q >= ~var2_ref.field_q) {
                  break L5;
                } else {
                  L6: {
                    stackOut_19_0 = (pf) var5;
                    stackOut_19_1 = -113;
                    stackOut_19_2 = null;
                    stackOut_19_3 = null;
                    stackOut_19_4 = var2_ref.field_l;
                    stackOut_19_5 = var2_ref.field_q;
                    stackOut_19_6 = var2_ref.field_o;
                    stackIn_24_0 = stackOut_19_0;
                    stackIn_24_1 = stackOut_19_1;
                    stackIn_24_2 = stackOut_19_2;
                    stackIn_24_3 = stackOut_19_3;
                    stackIn_24_4 = stackOut_19_4;
                    stackIn_24_5 = stackOut_19_5;
                    stackIn_24_6 = stackOut_19_6;
                    stackIn_20_0 = stackOut_19_0;
                    stackIn_20_1 = stackOut_19_1;
                    stackIn_20_2 = stackOut_19_2;
                    stackIn_20_3 = stackOut_19_3;
                    stackIn_20_4 = stackOut_19_4;
                    stackIn_20_5 = stackOut_19_5;
                    stackIn_20_6 = stackOut_19_6;
                    if (~var2_ref.field_i > ~var4.field_q) {
                      stackOut_24_0 = (pf) (Object) stackIn_24_0;
                      stackOut_24_1 = stackIn_24_1;
                      stackOut_24_2 = null;
                      stackOut_24_3 = null;
                      stackOut_24_4 = stackIn_24_4;
                      stackOut_24_5 = stackIn_24_5;
                      stackOut_24_6 = stackIn_24_6;
                      stackOut_24_7 = var2_ref.field_i;
                      stackIn_25_0 = stackOut_24_0;
                      stackIn_25_1 = stackOut_24_1;
                      stackIn_25_2 = stackOut_24_2;
                      stackIn_25_3 = stackOut_24_3;
                      stackIn_25_4 = stackOut_24_4;
                      stackIn_25_5 = stackOut_24_5;
                      stackIn_25_6 = stackOut_24_6;
                      stackIn_25_7 = stackOut_24_7;
                      break L6;
                    } else {
                      stackOut_20_0 = (pf) (Object) stackIn_20_0;
                      stackOut_20_1 = stackIn_20_1;
                      stackOut_20_2 = null;
                      stackOut_20_3 = null;
                      stackOut_20_4 = stackIn_20_4;
                      stackOut_20_5 = stackIn_20_5;
                      stackOut_20_6 = stackIn_20_6;
                      stackIn_22_0 = stackOut_20_0;
                      stackIn_22_1 = stackOut_20_1;
                      stackIn_22_2 = stackOut_20_2;
                      stackIn_22_3 = stackOut_20_3;
                      stackIn_22_4 = stackOut_20_4;
                      stackIn_22_5 = stackOut_20_5;
                      stackIn_22_6 = stackOut_20_6;
                      stackOut_22_0 = (pf) (Object) stackIn_22_0;
                      stackOut_22_1 = stackIn_22_1;
                      stackOut_22_2 = null;
                      stackOut_22_3 = null;
                      stackOut_22_4 = stackIn_22_4;
                      stackOut_22_5 = stackIn_22_5;
                      stackOut_22_6 = stackIn_22_6;
                      stackOut_22_7 = var4.field_q;
                      stackIn_25_0 = stackOut_22_0;
                      stackIn_25_1 = stackOut_22_1;
                      stackIn_25_2 = stackOut_22_2;
                      stackIn_25_3 = stackOut_22_3;
                      stackIn_25_4 = stackOut_22_4;
                      stackIn_25_5 = stackOut_22_5;
                      stackIn_25_6 = stackOut_22_6;
                      stackIn_25_7 = stackOut_22_7;
                      break L6;
                    }
                  }
                  ((pf) (Object) stackIn_25_0).a((byte) stackIn_25_1, (oh) (Object) new bh(stackIn_25_4, stackIn_25_5, stackIn_25_6, stackIn_25_7));
                  break L5;
                }
              }
              L7: {
                if (var2_ref.field_i > var4.field_i) {
                  L8: {
                    stackOut_29_0 = (pf) var5;
                    stackOut_29_1 = -113;
                    stackOut_29_2 = null;
                    stackOut_29_3 = null;
                    stackOut_29_4 = var2_ref.field_l;
                    stackIn_32_0 = stackOut_29_0;
                    stackIn_32_1 = stackOut_29_1;
                    stackIn_32_2 = stackOut_29_2;
                    stackIn_32_3 = stackOut_29_3;
                    stackIn_32_4 = stackOut_29_4;
                    stackIn_30_0 = stackOut_29_0;
                    stackIn_30_1 = stackOut_29_1;
                    stackIn_30_2 = stackOut_29_2;
                    stackIn_30_3 = stackOut_29_3;
                    stackIn_30_4 = stackOut_29_4;
                    if (~var2_ref.field_q >= ~var4.field_i) {
                      stackOut_32_0 = (pf) (Object) stackIn_32_0;
                      stackOut_32_1 = stackIn_32_1;
                      stackOut_32_2 = null;
                      stackOut_32_3 = null;
                      stackOut_32_4 = stackIn_32_4;
                      stackOut_32_5 = var4.field_i;
                      stackIn_33_0 = stackOut_32_0;
                      stackIn_33_1 = stackOut_32_1;
                      stackIn_33_2 = stackOut_32_2;
                      stackIn_33_3 = stackOut_32_3;
                      stackIn_33_4 = stackOut_32_4;
                      stackIn_33_5 = stackOut_32_5;
                      break L8;
                    } else {
                      stackOut_30_0 = (pf) (Object) stackIn_30_0;
                      stackOut_30_1 = stackIn_30_1;
                      stackOut_30_2 = null;
                      stackOut_30_3 = null;
                      stackOut_30_4 = stackIn_30_4;
                      stackOut_30_5 = var2_ref.field_q;
                      stackIn_33_0 = stackOut_30_0;
                      stackIn_33_1 = stackOut_30_1;
                      stackIn_33_2 = stackOut_30_2;
                      stackIn_33_3 = stackOut_30_3;
                      stackIn_33_4 = stackOut_30_4;
                      stackIn_33_5 = stackOut_30_5;
                      break L8;
                    }
                  }
                  ((pf) (Object) stackIn_33_0).a((byte) stackIn_33_1, (oh) (Object) new bh(stackIn_33_4, stackIn_33_5, var2_ref.field_o, var2_ref.field_i));
                  break L7;
                } else {
                  break L7;
                }
              }
              var6 = 0;
              var7 = null;
              var8 = (bh) (Object) var5.d(0);
              L9: while (true) {
                L10: {
                  L11: {
                    if (null == var8) {
                      break L11;
                    } else {
                      var9 = -var8.field_l + var8.field_o;
                      stackOut_36_0 = (bh) var8;
                      stackIn_45_0 = stackOut_36_0;
                      stackIn_37_0 = stackOut_36_0;
                      if (var12 != 0) {
                        break L10;
                      } else {
                        L12: {
                          var10 = -stackIn_37_0.field_q + var8.field_i;
                          stackOut_37_0 = var10;
                          stackOut_37_1 = var9;
                          stackIn_40_0 = stackOut_37_0;
                          stackIn_40_1 = stackOut_37_1;
                          stackIn_38_0 = stackOut_37_0;
                          stackIn_38_1 = stackOut_37_1;
                          if (var9 >= var10) {
                            stackOut_40_0 = stackIn_40_0;
                            stackOut_40_1 = stackIn_40_1;
                            stackOut_40_2 = var10;
                            stackIn_41_0 = stackOut_40_0;
                            stackIn_41_1 = stackOut_40_1;
                            stackIn_41_2 = stackOut_40_2;
                            break L12;
                          } else {
                            stackOut_38_0 = stackIn_38_0;
                            stackOut_38_1 = stackIn_38_1;
                            stackOut_38_2 = var9;
                            stackIn_41_0 = stackOut_38_0;
                            stackIn_41_1 = stackOut_38_1;
                            stackIn_41_2 = stackOut_38_2;
                            break L12;
                          }
                        }
                        L13: {
                          var11 = stackIn_41_0 * (stackIn_41_1 * stackIn_41_2);
                          if (~var11 >= ~var6) {
                            break L13;
                          } else {
                            var7 = (Object) (Object) var8;
                            var6 = var11;
                            break L13;
                          }
                        }
                        var8 = (bh) (Object) var5.a((byte) -71);
                        if (var12 == 0) {
                          continue L9;
                        } else {
                          break L11;
                        }
                      }
                    }
                  }
                  stackOut_44_0 = var7;
                  stackIn_45_0 = (bh) (Object) stackOut_44_0;
                  break L10;
                }
                return stackIn_45_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "kq.PA(" + param0 + ')');
        }
        return stackIn_47_0;
    }

    private final void f(int param0) {
        RuntimeException var2 = null;
        em var2_ref = null;
        sd var3_ref_sd = null;
        lp var3_ref_lp = null;
        fs[] var3_ref_fs__ = null;
        int var3 = 0;
        int var4 = 0;
        lp var4_ref_lp = null;
        fs var5 = null;
        lp var5_ref = null;
        sd var6 = null;
        lp var6_ref = null;
        lp var7 = null;
        lp var8 = null;
        int var9 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_39_0 = 0;
        int stackOut_39_1 = 0;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                ((kq) this).field_e.field_z.e(param0 + 15907);
                var2_ref = (em) (Object) ((kq) this).field_e.field_x;
                if (null == ((kq) this).field_s.field_n) {
                  break L2;
                } else {
                  if ((1 << ((kq) this).field_s.field_n.field_x & ((kq) this).field_s.field_P.field_w) == 0) {
                    L3: {
                      if (!((kq) this).field_s.field_P.field_o.field_i) {
                        break L3;
                      } else {
                        L4: {
                          L5: {
                            var2_ref.field_d = new jh[1];
                            var2_ref.field_f = new lp[1];
                            var2_ref.field_i = new qk[1];
                            var3_ref_lp = rc.a((byte) 119, (sd) (Object) ((kq) this).field_s.field_n.field_m, var2_ref, true);
                            var3_ref_lp.a((byte) 108, ((kq) this).field_e.field_z.field_k, ((kq) this).field_e.field_z.field_y + ((kq) this).field_e.field_z.field_t);
                            ((kq) this).field_e.field_z.a((vd) (Object) var3_ref_lp, 8);
                            if (((kq) this).field_s.field_n.field_m.field_x > 0) {
                              break L5;
                            } else {
                              ((kq) this).field_e.field_A = false;
                              ((kq) this).field_mb.d(false);
                              if (var9 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          ((kq) this).field_e.field_A = true;
                          ((kq) this).field_mb.g(88);
                          break L4;
                        }
                        if (var9 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var2_ref.field_d = new jh[((kq) this).field_s.field_n.field_i.e(0)];
                    var2_ref.field_f = new lp[((kq) this).field_s.field_n.field_i.e(0)];
                    var2_ref.field_i = new qk[((kq) this).field_s.field_n.field_i.e(0)];
                    ((kq) this).field_e.field_A = false;
                    ((kq) this).field_mb.d(false);
                    var3_ref_sd = (sd) (Object) ((kq) this).field_s.field_n.field_i.d(0);
                    if (var3_ref_sd != null) {
                      L6: {
                        var4_ref_lp = rc.a((byte) 120, var3_ref_sd, var2_ref, true);
                        var4_ref_lp.a((byte) 52, ((kq) this).field_e.field_z.field_k, ((kq) this).field_e.field_z.field_t - -((kq) this).field_e.field_z.field_y);
                        ((kq) this).field_e.field_z.a((vd) (Object) var4_ref_lp, 8);
                        if (var3_ref_sd.field_x <= 0) {
                          break L6;
                        } else {
                          ((kq) this).field_e.field_A = true;
                          ((kq) this).field_mb.g(param0 ^ -15994);
                          break L6;
                        }
                      }
                      var3_ref_sd = (sd) (Object) ((kq) this).field_s.field_n.field_i.a((byte) -71);
                      L7: while (true) {
                        if (var3_ref_sd == null) {
                          break L2;
                        } else {
                          var5_ref = rc.a((byte) 123, var3_ref_sd, var2_ref, false);
                          var5_ref.a((byte) 126, ((kq) this).field_e.field_z.field_k, ((kq) this).field_e.field_z.field_t + ((kq) this).field_e.field_z.field_y);
                          ((kq) this).field_e.field_z.a((vd) (Object) var5_ref, param0 + 15915);
                          stackOut_23_0 = ~var3_ref_sd.field_x;
                          stackOut_23_1 = -1;
                          stackIn_40_0 = stackOut_23_0;
                          stackIn_40_1 = stackOut_23_1;
                          stackIn_24_0 = stackOut_23_0;
                          stackIn_24_1 = stackOut_23_1;
                          if (var9 != 0) {
                            break L1;
                          } else {
                            L8: {
                              if (stackIn_24_0 < stackIn_24_1) {
                                ((kq) this).field_e.field_A = true;
                                ((kq) this).field_mb.g(95);
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            var3_ref_sd = (sd) (Object) ((kq) this).field_s.field_n.field_i.a((byte) -71);
                            if (var9 == 0) {
                              continue L7;
                            } else {
                              break L2;
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
              }
              L9: {
                if (null == ((kq) this).field_s.field_n) {
                  break L9;
                } else {
                  L10: {
                    if (!((kq) this).field_s.field_W) {
                      break L10;
                    } else {
                      if (kb.field_x < 5) {
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                  ((kq) this).field_e.field_z.a((vd) (Object) hc.a(((kq) this).field_e.field_z.field_k, 126, ((kq) this).field_e.field_z.field_y + ((kq) this).field_e.field_z.field_t), 8);
                  break L9;
                }
              }
              stackOut_39_0 = param0;
              stackOut_39_1 = -15907;
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              break L1;
            }
            L11: {
              if (stackIn_40_0 == stackIn_40_1) {
                break L11;
              } else {
                bh discarded$1 = ((kq) this).b((byte) 96);
                break L11;
              }
            }
            var3_ref_fs__ = ((kq) this).field_s.field_P.field_v;
            var4 = 0;
            L12: while (true) {
              L13: {
                if (~var4 <= ~var3_ref_fs__.length) {
                  break L13;
                } else {
                  L14: {
                    L15: {
                      var5 = var3_ref_fs__[var4];
                      if (var5 == ((kq) this).field_s.field_n) {
                        break L15;
                      } else {
                        if ((((kq) this).field_s.field_P.field_w & 1 << var5.field_x) != 0) {
                          break L15;
                        } else {
                          L16: {
                            if (!((kq) this).field_s.field_P.field_o.field_i) {
                              break L16;
                            } else {
                              var6_ref = an.a((byte) -76, true, (sd) (Object) var5.field_m);
                              var6_ref.a((byte) 113, ((kq) this).field_e.field_z.field_k, ((kq) this).field_e.field_z.field_y + ((kq) this).field_e.field_z.field_t);
                              ((kq) this).field_e.field_z.a((vd) (Object) var6_ref, param0 ^ -15915);
                              if (var9 == 0) {
                                break L15;
                              } else {
                                break L16;
                              }
                            }
                          }
                          var6 = (sd) (Object) var5.field_i.d(0);
                          if (var6 != null) {
                            var7 = an.a((byte) -76, true, var6);
                            var7.a((byte) 52, ((kq) this).field_e.field_z.field_k, ((kq) this).field_e.field_z.field_y + ((kq) this).field_e.field_z.field_t);
                            ((kq) this).field_e.field_z.a((vd) (Object) var7, 8);
                            var6 = (sd) (Object) var5.field_i.a((byte) -71);
                            L17: while (true) {
                              if (null == var6) {
                                break L15;
                              } else {
                                var8 = an.a((byte) -76, false, var6);
                                var8.a((byte) 51, ((kq) this).field_e.field_z.field_k, ((kq) this).field_e.field_z.field_y + ((kq) this).field_e.field_z.field_t);
                                ((kq) this).field_e.field_z.a((vd) (Object) var8, param0 ^ -15915);
                                var6 = (sd) (Object) var5.field_i.a((byte) -71);
                                if (var9 != 0) {
                                  break L14;
                                } else {
                                  if (var9 == 0) {
                                    continue L17;
                                  } else {
                                    break L15;
                                  }
                                }
                              }
                            }
                          } else {
                            break L15;
                          }
                        }
                      }
                    }
                    var4++;
                    break L14;
                  }
                  if (var9 == 0) {
                    continue L12;
                  } else {
                    break L13;
                  }
                }
              }
              L18: {
                var3 = 3 + ((kq) this).field_e.field_z.field_y - -20;
                if (var3 > 363) {
                  var3 = 363;
                  break L18;
                } else {
                  break L18;
                }
              }
              L19: {
                L20: {
                  ((kq) this).field_e.a(true, var3, ((kq) this).field_e.field_m);
                  ((kq) this).field_e.field_z.a(true, -18 + (var3 + -10), ((kq) this).field_e.field_z.field_m);
                  var2_ref.field_e.a(true, -10 + (-15 + (var3 + -3)), var2_ref.field_e.field_m);
                  if (var3 >= 363) {
                    break L20;
                  } else {
                    var2_ref.field_e.field_p = false;
                    if (var9 == 0) {
                      break L19;
                    } else {
                      break L20;
                    }
                  }
                }
                var2_ref.field_e.field_p = true;
                break L19;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "kq.QA(" + param0 + ')');
        }
    }

    private final void g(byte param0) {
        RuntimeException var2 = null;
        ad var2_ref = null;
        sd var3 = null;
        int var4 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            ((kq) this).field_s.field_z.e(-18641);
            ((kq) this).field_s.a(2);
            if (((kq) this).field_s.field_n != null) {
              if (param0 >= 93) {
                L1: {
                  L2: {
                    var2_ref = (ad) (Object) ((kq) this).field_k.field_v;
                    if (!var2_ref.field_e.d((byte) 34)) {
                      break L2;
                    } else {
                      if (((kq) this).field_s.field_m != 2) {
                        if (!((kq) this).field_s.field_P.field_o.field_i) {
                          var3 = (sd) (Object) ((kq) this).field_s.field_n.field_i.d(0);
                          L3: while (true) {
                            if (null == var3) {
                              break L2;
                            } else {
                              stackOut_19_0 = -1;
                              stackOut_19_1 = ~var3.field_x;
                              stackIn_28_0 = stackOut_19_0;
                              stackIn_28_1 = stackOut_19_1;
                              stackIn_20_0 = stackOut_19_0;
                              stackIn_20_1 = stackOut_19_1;
                              if (var4 != 0) {
                                break L1;
                              } else {
                                if (stackIn_20_0 > stackIn_20_1) {
                                  this.a(-2, var3, true);
                                  return;
                                } else {
                                  var3 = (sd) (Object) ((kq) this).field_s.field_n.field_i.a((byte) -71);
                                  if (var4 == 0) {
                                    continue L3;
                                  } else {
                                    break L2;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          if (((kq) this).field_s.field_n.field_m.field_x <= 0) {
                            break L2;
                          } else {
                            this.a(-2, (sd) (Object) ((kq) this).field_s.field_n.field_m, true);
                            return;
                          }
                        }
                      } else {
                        break L2;
                      }
                    }
                  }
                  ((kq) this).field_s.m(124);
                  ((kq) this).field_bb.g(81);
                  var2_ref.field_e.a(-2948, (bi) null);
                  stackOut_27_0 = ((kq) this).field_s.field_N;
                  stackOut_27_1 = 1;
                  stackIn_28_0 = stackOut_27_0;
                  stackIn_28_1 = stackOut_27_1;
                  break L1;
                }
                L4: {
                  L5: {
                    if (stackIn_28_0 == stackIn_28_1) {
                      break L5;
                    } else {
                      ((kq) this).a(10, 0, re.a(gs.field_m, 4371, new String[1]));
                      if (var4 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  ((kq) this).a(10, 0, il.field_Y);
                  break L4;
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
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "kq.LA(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        String var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5 = cl.field_m.toUpperCase() + ": " + tc.field_E[3];
            int discarded$1 = rs.field_Cb.a(var5, 5 + param0, param3 + 5, -10 + param1, 480, 16777215, -1, 0, 0, rs.field_Cb.field_J);
            var6 = 20 + param3 - -rs.field_Cb.field_J + 9;
            var7 = 64 + rs.field_Cb.c("= " + re.a(sq.field_p, 4371, new String[1]));
            rk.field_k.b((-var7 + param1) / 2 + param0, -24 + var6, 64, 64);
            rs.field_Cb.d(re.a(hg.field_s, 4371, new String[1]), param0 - (-((param1 + -var7) / 2) + -75), var6 - -7, 16777215, -1);
            rs.field_Cb.d("=", param0 + (param1 - var7) / 2 + 64, 13 + var6, 16777215, -1);
            rs.field_Cb.d(re.a(sq.field_p, 4371, new String[1]), 75 + ((param1 - var7) / 2 + param0), 19 + var6, 16777215, -1);
            var6 += 44;
            ti.field_h.b((-var7 + param1) / 2 + param0, var6 + -24, 64, 64);
            rs.field_Cb.d(re.a(hg.field_s, 4371, new String[1]), 75 + ((-var7 + param1) / 2 + param0), 7 + var6, 16777215, -1);
            var8 = 27 / ((param2 - -51) / 59);
            rs.field_Cb.d("=", (-var7 + param1) / 2 + (param0 - -64), 13 + var6, 16777215, -1);
            rs.field_Cb.d(re.a(sq.field_p, 4371, new String[1]), 75 + (param1 - var7) / 2 + param0, var6 + 19, 16777215, -1);
            var6 += 52;
            cp.field_t.b(param0 - -((param1 - var7) / 2), var6 + -24, 64, 64);
            rs.field_Cb.d(re.a(hg.field_s, 4371, new String[1]), 75 + ((-var7 + param1) / 2 + param0), var6 + 7, 16777215, -1);
            rs.field_Cb.d("=", 64 + param0 - -((-var7 + param1) / 2), 13 + var6, 16777215, -1);
            rs.field_Cb.d(re.a(sq.field_p, 4371, new String[1]), param0 - (-((-var7 + param1) / 2) - 75), 19 + var6, 16777215, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          throw r.a((Throwable) (Object) var5_ref, "kq.SA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, fs[] param1, int[] param2, int[] param3, fs[] param4, qk[] param5, byte param6, int param7) {
        RuntimeException var9 = null;
        lp var9_ref = null;
        lp var10 = null;
        int var11 = 0;
        lp var12 = null;
        int var13 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        var13 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (param6 == -47) {
              var9_ref = ((kq) this).field_nb.field_z;
              var9_ref.e(0);
              var10 = mf.a(param5, true);
              var10.a((byte) 61, var9_ref.field_k, var9_ref.field_y + var9_ref.field_t);
              var9_ref.a((vd) (Object) var10, 8);
              var11 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    L4: {
                      L5: {
                        if (~param1.length >= ~var11) {
                          break L5;
                        } else {
                          var12 = fb.a(param7, param0, 28, param3[var11], param1[var11], param2[var11], param4, ((kq) this).field_s.field_P);
                          var12.a((byte) 38, var9_ref.field_k, var9_ref.field_t - -var9_ref.field_y);
                          var9_ref.a((vd) (Object) var12, param6 ^ -39);
                          var11++;
                          if (var13 != 0) {
                            break L4;
                          } else {
                            if (var13 == 0) {
                              continue L1;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      L6: {
                        if (param7 <= 0) {
                          break L6;
                        } else {
                          if (3 >= param7) {
                            break L3;
                          } else {
                            break L6;
                          }
                        }
                      }
                      ((kq) this).field_nb.field_A = false;
                      ((kq) this).field_g.d(false);
                      break L4;
                    }
                    if (var13 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                  ((kq) this).field_nb.field_A = true;
                  ((kq) this).field_g.g(108);
                  break L2;
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var9 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var9;
            stackOut_19_1 = new StringBuilder().append("kq.V(").append(param0).append(',');
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L7;
            }
          }
          L8: {
            stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');
            stackIn_26_0 = stackOut_23_0;
            stackIn_26_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_27_0 = stackOut_24_0;
              stackIn_27_1 = stackOut_24_1;
              stackIn_27_2 = stackOut_24_2;
              break L8;
            }
          }
          L9: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');
            stackIn_30_0 = stackOut_27_0;
            stackIn_30_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param3 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L9;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_31_0 = stackOut_28_0;
              stackIn_31_1 = stackOut_28_1;
              stackIn_31_2 = stackOut_28_2;
              break L9;
            }
          }
          L10: {
            stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');
            stackIn_34_0 = stackOut_31_0;
            stackIn_34_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param4 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L10;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_35_0 = stackOut_32_0;
              stackIn_35_1 = stackOut_32_1;
              stackIn_35_2 = stackOut_32_2;
              break L10;
            }
          }
          L11: {
            stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
            stackOut_35_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(',');
            stackIn_38_0 = stackOut_35_0;
            stackIn_38_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param5 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L11;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_39_0 = stackOut_36_0;
              stackIn_39_1 = stackOut_36_1;
              stackIn_39_2 = stackOut_36_2;
              break L11;
            }
          }
          throw r.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + ',' + param6 + ',' + param7 + ')');
        }
    }

    private final void a(int param0, sd param1, boolean param2) {
        RuntimeException var4 = null;
        em var4_ref = null;
        int var5_int = 0;
        ln var5 = null;
        ad var5_ref = null;
        jh var6 = null;
        qk var7 = null;
        sd var8 = null;
        String var9 = null;
        int var10 = 0;
        boolean stackIn_7_0 = false;
        StringBuilder stackIn_13_0 = null;
        StringBuilder stackIn_15_0 = null;
        StringBuilder stackIn_17_0 = null;
        StringBuilder stackIn_18_0 = null;
        String stackIn_18_1 = null;
        StringBuilder stackIn_26_0 = null;
        StringBuilder stackIn_28_0 = null;
        StringBuilder stackIn_30_0 = null;
        StringBuilder stackIn_31_0 = null;
        String stackIn_31_1 = null;
        boolean stackIn_36_0 = false;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0 = false;
        StringBuilder stackOut_12_0 = null;
        StringBuilder stackOut_17_0 = null;
        String stackOut_17_1 = null;
        StringBuilder stackOut_13_0 = null;
        StringBuilder stackOut_15_0 = null;
        String stackOut_15_1 = null;
        StringBuilder stackOut_25_0 = null;
        StringBuilder stackOut_30_0 = null;
        String stackOut_30_1 = null;
        StringBuilder stackOut_26_0 = null;
        StringBuilder stackOut_28_0 = null;
        String stackOut_28_1 = null;
        boolean stackOut_35_0 = false;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              ((kq) this).field_s.field_c = param1;
              ((kq) this).a(-83, 2);
              var4_ref = (em) (Object) ((kq) this).field_e.field_x;
              if (param0 == -2) {
                break L1;
              } else {
                ((kq) this).field_x = 60;
                break L1;
              }
            }
            var5_int = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (var4_ref.field_d.length <= var5_int) {
                    break L4;
                  } else {
                    var6 = var4_ref.field_d[var5_int];
                    var7 = var4_ref.field_i[var5_int];
                    var8 = (sd) var6.field_h;
                    stackOut_6_0 = var6.f(param0 + 244874371);
                    stackIn_36_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var10 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (stackIn_7_0) {
                          L6: {
                            L7: {
                              var6.e((byte) 72);
                              if (var8.field_x == 0) {
                                break L7;
                              } else {
                                L8: {
                                  stackOut_12_0 = new StringBuilder().append(hd.field_j).append(" ");
                                  stackIn_17_0 = stackOut_12_0;
                                  stackIn_13_0 = stackOut_12_0;
                                  if (var8.field_x != 1) {
                                    stackOut_17_0 = (StringBuilder) (Object) stackIn_17_0;
                                    stackOut_17_1 = re.a(d.field_c, 4371, new String[1]);
                                    stackIn_18_0 = stackOut_17_0;
                                    stackIn_18_1 = stackOut_17_1;
                                    break L8;
                                  } else {
                                    stackOut_13_0 = (StringBuilder) (Object) stackIn_13_0;
                                    stackIn_15_0 = stackOut_13_0;
                                    stackOut_15_0 = (StringBuilder) (Object) stackIn_15_0;
                                    stackOut_15_1 = ad.field_a;
                                    stackIn_18_0 = stackOut_15_0;
                                    stackIn_18_1 = stackOut_15_1;
                                    break L8;
                                  }
                                }
                                var9 = stackIn_18_1;
                                if (var10 == 0) {
                                  break L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            var9 = pe.field_F;
                            break L6;
                          }
                          var7.field_o = var9;
                          var6.field_o = var9;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      L9: {
                        if ((Object) (Object) param1 != var6.field_h) {
                          break L9;
                        } else {
                          L10: {
                            L11: {
                              var6.e((byte) 26);
                              if (var8.field_x == 0) {
                                break L11;
                              } else {
                                L12: {
                                  stackOut_25_0 = new StringBuilder().append(il.field_lb).append(" ");
                                  stackIn_30_0 = stackOut_25_0;
                                  stackIn_26_0 = stackOut_25_0;
                                  if (var8.field_x != 1) {
                                    stackOut_30_0 = (StringBuilder) (Object) stackIn_30_0;
                                    stackOut_30_1 = re.a(d.field_c, 4371, new String[1]);
                                    stackIn_31_0 = stackOut_30_0;
                                    stackIn_31_1 = stackOut_30_1;
                                    break L12;
                                  } else {
                                    stackOut_26_0 = (StringBuilder) (Object) stackIn_26_0;
                                    stackIn_28_0 = stackOut_26_0;
                                    stackOut_28_0 = (StringBuilder) (Object) stackIn_28_0;
                                    stackOut_28_1 = ad.field_a;
                                    stackIn_31_0 = stackOut_28_0;
                                    stackIn_31_1 = stackOut_28_1;
                                    break L12;
                                  }
                                }
                                var9 = stackIn_31_1;
                                if (var10 == 0) {
                                  break L10;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            var9 = pe.field_F;
                            break L10;
                          }
                          var7.field_o = var9;
                          var6.field_o = var9;
                          break L9;
                        }
                      }
                      var5_int++;
                      if (var10 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_35_0 = param2;
                stackIn_36_0 = stackOut_35_0;
                break L3;
              }
              L13: {
                if (!stackIn_36_0) {
                  break L13;
                } else {
                  var5_ref = (ad) (Object) ((kq) this).field_k.field_v;
                  var5_ref.field_e.a(-2948, (bi) (Object) ((kq) this).field_t);
                  var5_ref.field_f.a((byte) 122, 55, var5_ref.field_f.field_t);
                  if (!((kq) this).field_s.field_W) {
                    break L13;
                  } else {
                    fl.a(0, "unplaced");
                    break L13;
                  }
                }
              }
              var5 = param1.j(18229);
              L14: while (true) {
                L15: {
                  L16: {
                    if (null == var5) {
                      break L16;
                    } else {
                      ((kq) this).field_s.field_z.field_z[var5.field_p] = 2;
                      var5 = param1.h(-23410);
                      if (var10 != 0) {
                        break L15;
                      } else {
                        if (var10 == 0) {
                          continue L14;
                        } else {
                          break L16;
                        }
                      }
                    }
                  }
                  break L15;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var4 = decompiledCaughtException;
            stackOut_47_0 = (RuntimeException) var4;
            stackOut_47_1 = new StringBuilder().append("kq.N(").append(param0).append(',');
            stackIn_50_0 = stackOut_47_0;
            stackIn_50_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param1 == null) {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "null";
              stackIn_51_0 = stackOut_50_0;
              stackIn_51_1 = stackOut_50_1;
              stackIn_51_2 = stackOut_50_2;
              break L17;
            } else {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "{...}";
              stackIn_51_0 = stackOut_48_0;
              stackIn_51_1 = stackOut_48_1;
              stackIn_51_2 = stackOut_48_2;
              break L17;
            }
          }
          throw r.a((Throwable) (Object) stackIn_51_0, stackIn_51_2 + ',' + param2 + ')');
        }
    }

    kq(km param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        qr var3_ref_qr = null;
        fs var4 = null;
        qr var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_45_0 = 0;
        int stackIn_45_1 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_44_0 = 0;
        int stackOut_44_1 = 0;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        ((kq) this).field_v = true;
        try {
          L0: {
            L1: {
              fj.field_r = new bi(20 + aq.field_i.field_o, aq.field_i.field_p + 20);
              kb.field_w = new om(rk.field_j.field_o + 20, rk.field_j.field_p - -20);
              ((kq) this).field_I = true;
              ((kq) this).field_s = param0;
              ((kq) this).field_y = new pf();
              ((kq) this).field_e = ch.a((byte) 112);
              ((kq) this).field_y.a((byte) -113, (oh) (Object) ((kq) this).field_e);
              if (((kq) this).field_s.field_n != null) {
                ((kq) this).field_j = ij.b((byte) 127);
                ((kq) this).field_y.a((byte) -113, (oh) (Object) ((kq) this).field_j);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              ((kq) this).field_J = mg.d(28, ((kq) this).field_s.field_P.field_r);
              this.i(6);
              ((kq) this).field_y.a((byte) -113, (oh) (Object) ((kq) this).field_J);
              ((kq) this).field_cb = gl.a(((kq) this).field_s.field_P.field_r, -1);
              ((kq) this).field_y.a((byte) -113, (oh) (Object) ((kq) this).field_cb);
              var2_int = ((kq) this).field_s.field_P.field_x.b(false);
              if (var2_int <= 0) {
                break L2;
              } else {
                ((kq) this).field_nb = in.a(var2_int, true);
                ((kq) this).field_y.a((byte) -113, (oh) (Object) ((kq) this).field_nb);
                break L2;
              }
            }
            L3: {
              ((kq) this).field_k = ol.a((byte) 69);
              ((kq) this).field_y.a((byte) -113, (oh) (Object) ((kq) this).field_k);
              if (null == ((kq) this).field_s.field_n) {
                break L3;
              } else {
                ((kq) this).field_S = new jh(511, 25, h.field_F.field_z, h.field_F.field_w, -1, h.field_F, (String) null, 0, -1, ak.field_x, (String) null, 0);
                ((kq) this).field_S.field_o = n.field_j;
                ((kq) this).field_y.a((byte) -113, (oh) (Object) ((kq) this).field_S);
                break L3;
              }
            }
            L4: {
              ((kq) this).field_n = new jh(h.field_F.field_z / 2 + 512, 5, fm.field_e.field_z, fm.field_e.field_w, -1, fm.field_e, (String) null, 0, -1, bd.field_D, (String) null, 0);
              ((kq) this).field_n.field_o = rk.field_o;
              ((kq) this).field_y.a((byte) -113, (oh) (Object) ((kq) this).field_n);
              ((kq) this).field_W = new jh(513 - -h.field_F.field_z, 25, k.field_d.field_z, k.field_d.field_w, -1, k.field_d, (String) null, 0, -1, cs.field_h, (String) null, 0);
              ((kq) this).field_W.field_o = wm.field_a;
              ((kq) this).field_y.a((byte) -113, (oh) (Object) ((kq) this).field_W);
              ((kq) this).field_mb = new jh(fm.field_e.field_z + 514 - -(h.field_F.field_z / 2), 5, tm.field_r.field_z, tm.field_r.field_w, -1, tm.field_r, (String) null, 0, -1, je.field_b, (String) null, 0);
              ((kq) this).field_mb.field_o = t.field_b;
              ((kq) this).field_y.a((byte) -113, (oh) (Object) ((kq) this).field_mb);
              if (((kq) this).field_nb == null) {
                break L4;
              } else {
                ((kq) this).field_g = new jh(k.field_d.field_z + h.field_F.field_z + 515, 25, wl.field_d.field_z, wl.field_d.field_w, -1, wl.field_d, (String) null, 0, -1, nr.field_k, (String) null, 0);
                ((kq) this).field_g.field_o = hi.field_d;
                ((kq) this).field_y.a((byte) -113, (oh) (Object) ((kq) this).field_g);
                break L4;
              }
            }
            L5: {
              if (((kq) this).field_s.field_n == null) {
                break L5;
              } else {
                ((kq) this).field_bb = new jh(521 + h.field_F.field_z * 3, 20, rk.field_j.field_z, rk.field_j.field_w, -1, rk.field_j, (String) null, 0, -1, ei.field_a, (String) null, 0);
                ((kq) this).field_bb.field_o = oj.field_Bb;
                ((kq) this).field_y.a((byte) -113, (oh) (Object) ((kq) this).field_bb);
                break L5;
              }
            }
            L6: {
              L7: {
                ((kq) this).field_K = new os(590, 480 - rs.field_Cb.field_J, 60, 2 * rs.field_Cb.field_J);
                ((kq) this).field_y.a((oh) (Object) ((kq) this).field_K, 0);
                ((kq) this).field_N = new jh(595, 480 + -nr.field_r[3].field_w, nr.field_r[3].field_z, nr.field_r[3].field_w, -1, nr.field_r[3], (String) null, 0, -1, nr.field_r[0], (String) null, 0);
                if ((32 & de.field_j) == 0) {
                  break L7;
                } else {
                  ((kq) this).field_N.e((byte) 9);
                  ((kq) this).field_N.field_o = fi.field_i;
                  if (var6 == 0) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              ((kq) this).field_N.field_o = fl.field_e;
              break L6;
            }
            L8: {
              L9: {
                ((kq) this).field_X = new jh(610, -nr.field_r[1].field_w + 480, nr.field_r[1].field_z, nr.field_r[1].field_w, -1, nr.field_r[1], (String) null, 0, -1, nr.field_r[4], (String) null, 0);
                ((kq) this).field_X.field_o = da.field_f;
                ((kq) this).field_d = new jh(625, 480 - nr.field_r[5].field_w, nr.field_r[5].field_z, nr.field_r[5].field_w, -1, nr.field_r[5], (String) null, 0, -1, nr.field_r[2], (String) null, 0);
                if ((de.field_j & 64) != 0) {
                  break L9;
                } else {
                  ((kq) this).field_d.field_o = ec.field_t;
                  if (var6 == 0) {
                    break L8;
                  } else {
                    break L9;
                  }
                }
              }
              ((kq) this).field_d.e((byte) 23);
              ((kq) this).field_d.field_o = de.field_k;
              break L8;
            }
            ((kq) this).field_K.a((vd) (Object) ((kq) this).field_N, 8);
            ((kq) this).field_K.a((vd) (Object) ((kq) this).field_X, 8);
            ((kq) this).field_K.a((vd) (Object) ((kq) this).field_d, 8);
            ((kq) this).field_V = new os(3, 480, 10 + rs.field_Cb.c(fk.field_l), 2 * rs.field_Cb.field_J);
            ((kq) this).field_f = new jh(3, 480, ((kq) this).field_V.field_m, rs.field_Cb.field_J - 4, -1, (bi) null, fk.field_l, 16777215, -1, (bi) null, db.field_d, 16777215);
            ((kq) this).field_V.a((vd) (Object) ((kq) this).field_f, 8);
            ((kq) this).field_y.a((oh) (Object) ((kq) this).field_V, 0);
            ((kq) this).field_t = new om(go.field_L.field_o, go.field_L.field_p);
            ra.a(-128);
            ((kq) this).field_t.e();
            go.field_L.d(0, 0, 16711680);
            var3 = 0;
            L10: while (true) {
              L11: {
                L12: {
                  L13: {
                    L14: {
                      if (((kq) this).field_t.field_B.length <= var3) {
                        break L14;
                      } else {
                        stackOut_30_0 = 0;
                        stackOut_30_1 = ((kq) this).field_t.field_B[var3];
                        stackIn_45_0 = stackOut_30_0;
                        stackIn_45_1 = stackOut_30_1;
                        stackIn_31_0 = stackOut_30_0;
                        stackIn_31_1 = stackOut_30_1;
                        if (var6 != 0) {
                          L15: while (true) {
                            if (stackIn_45_0 <= stackIn_45_1) {
                              break L12;
                            } else {
                              var4 = ((kq) this).field_s.field_P.field_v[var3];
                              jr.a("playercol" + var3, 1904, re.a("<col=<%0>>", 4371, new String[1]));
                              jr.a("player" + var3, 1904, re.a("<col=<%0>><%1></col>", 4371, new String[2]));
                              jr.a("playerhome" + var3, 1904, re.a("<col=<%0>><%1></col>", 4371, new String[2]));
                              var3++;
                              if (var6 != 0) {
                                break L11;
                              } else {
                                if (var6 == 0) {
                                  stackOut_44_0 = ((kq) this).field_s.field_P.field_r;
                                  stackOut_44_1 = var3;
                                  stackIn_45_0 = stackOut_44_0;
                                  stackIn_45_1 = stackOut_44_1;
                                  continue L15;
                                } else {
                                  break L13;
                                }
                              }
                            }
                          }
                        } else {
                          L16: {
                            if (stackIn_31_0 != stackIn_31_1) {
                              gf.c(var3 % ((kq) this).field_t.field_z, var3 / ((kq) this).field_t.field_z, 16711680, 128);
                              ((kq) this).field_t.field_B[var3] = ee.a(((kq) this).field_t.field_B[var3], -16777216);
                              break L16;
                            } else {
                              break L16;
                            }
                          }
                          var3++;
                          if (var6 == 0) {
                            continue L10;
                          } else {
                            break L14;
                          }
                        }
                      }
                    }
                    L17: {
                      cg.i(0);
                      if (((kq) this).field_s.field_f) {
                        break L17;
                      } else {
                        if (((kq) this).field_s.field_W) {
                          break L17;
                        } else {
                          qn.b(116);
                          var3_ref_qr = new qr(0L, (qr) null);
                          var3_ref_qr.field_M = new pf();
                          ((kq) this).field_E = new ub(0L, var3_ref_qr, dm.field_h, se.field_m);
                          var4_ref = new qr(0L, l.field_a);
                          ((kq) this).field_O = new qr(0L, oh.field_a);
                          ((kq) this).field_O.a(640, 120, (byte) 116, 480, 0);
                          var4_ref.a(634, ((kq) this).field_O.field_mb - 6, (byte) 84, 3, 3);
                          ((kq) this).field_O.a(4, var4_ref);
                          var4_ref.a(4, (qr) (Object) ((kq) this).field_E);
                          var5 = -5 + var4_ref.field_mb;
                          ((kq) this).field_E.a(624, 5, 5, 2, -125, -5 + var5, 15);
                          ge.field_n = false;
                          break L17;
                        }
                      }
                    }
                    cq.a((nq) (Object) rs.field_Cb, true);
                    ((kq) this).field_ob = new int[]{82, 52, 52, 52};
                    ((kq) this).field_Q = 0;
                    ((kq) this).field_ab = new String[1 + ((kq) this).field_s.field_P.field_r];
                    ((kq) this).field_U = -1;
                    ((kq) this).field_p = new int[]{32, 0, 0, 0};
                    ((kq) this).field_z = new boolean[((kq) this).field_s.field_P.field_r - -1];
                    ((kq) this).field_B = new pf();
                    ((kq) this).field_F = new os(0, 410, 128, 21);
                    ((kq) this).field_lb = new os(0, 410, 128, 21);
                    ((kq) this).field_m = new os(0, 410, 128, 21);
                    ((kq) this).field_M = new os(0, 410, 128, 21);
                    ((kq) this).field_B.a((byte) -113, (oh) (Object) ((kq) this).field_F);
                    ((kq) this).field_B.a((byte) -113, (oh) (Object) ((kq) this).field_lb);
                    ((kq) this).field_B.a((byte) -113, (oh) (Object) ((kq) this).field_m);
                    ((kq) this).field_B.a((byte) -113, (oh) (Object) ((kq) this).field_M);
                    ((kq) this).field_hb = new jh(0, 410, 128, 21, -1, (bi) null, ja.field_n.toUpperCase(), 16777215, -1, (bi) null, ja.field_n.toUpperCase(), 2805974);
                    ((kq) this).field_F.a((vd) (Object) ((kq) this).field_hb, 8);
                    ((kq) this).field_gb = new jh(0, 410, 128, 21, -1, (bi) null, na.field_s.toUpperCase(), 16777215, -1, (bi) null, na.field_s.toUpperCase(), 2805974);
                    ((kq) this).field_lb.a((vd) (Object) ((kq) this).field_gb, 8);
                    ((kq) this).field_db = new jh(0, 410, 128, 21, -1, (bi) null, po.field_a.toUpperCase(), 16777215, -1, (bi) null, po.field_a.toUpperCase(), 2805974);
                    ((kq) this).field_m.a((vd) (Object) ((kq) this).field_db, 8);
                    ((kq) this).field_a = new jh(0, 410, 128, 21, -1, (bi) null, ph.field_a.toUpperCase(), 16777215, -1, (bi) null, ph.field_a.toUpperCase(), 2805974);
                    ((kq) this).field_M.a((vd) (Object) ((kq) this).field_a, 8);
                    ((kq) this).field_hb.field_h = (Object) (Object) new Integer(0);
                    ((kq) this).field_gb.field_h = (Object) (Object) new Integer(1);
                    ((kq) this).field_db.field_h = (Object) (Object) new Integer(2);
                    ((kq) this).field_a.field_h = (Object) (Object) new Integer(3);
                    ((kq) this).field_a.e((byte) 54);
                    if (!((kq) this).field_s.field_W) {
                      break L11;
                    } else {
                      ((kq) this).field_mb.field_s = false;
                      ((kq) this).field_n.field_s = false;
                      ((kq) this).field_W.field_s = false;
                      ((kq) this).field_S.field_s = false;
                      ((kq) this).field_g.field_s = false;
                      ((kq) this).field_bb.field_s = false;
                      ((kq) this).field_K.field_s = false;
                      ((kq) this).field_V.field_s = false;
                      jr.a("continue", 1904, wm.field_e);
                      jr.a("continue2", 1904, aq.field_k);
                      jr.a("continue3", 1904, gn.field_v);
                      jr.a("continuekey", 1904, ul.field_Ob);
                      jr.a("captureAll", 1904, in.field_e);
                      jr.a("exit", 1904, sa.field_b);
                      ho.field_d = ((kq) this).field_s.field_n;
                      var3 = 0;
                      L18: while (true) {
                        stackOut_44_0 = ((kq) this).field_s.field_P.field_r;
                        stackOut_44_1 = var3;
                        stackIn_45_0 = stackOut_44_0;
                        stackIn_45_1 = stackOut_44_1;
                        if (stackIn_45_0 <= stackIn_45_1) {
                          break L12;
                        } else {
                          var4 = ((kq) this).field_s.field_P.field_v[var3];
                          jr.a("playercol" + var3, 1904, re.a("<col=<%0>>", 4371, new String[1]));
                          jr.a("player" + var3, 1904, re.a("<col=<%0>><%1></col>", 4371, new String[2]));
                          jr.a("playerhome" + var3, 1904, re.a("<col=<%0>><%1></col>", 4371, new String[2]));
                          var3++;
                          if (var6 != 0) {
                            break L11;
                          } else {
                            if (var6 == 0) {
                              continue L18;
                            } else {
                              break L13;
                            }
                          }
                        }
                      }
                    }
                  }
                  break L12;
                }
                lp.a(1546006977, n.a("start", -21502));
                break L11;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var2 = decompiledCaughtException;
            stackOut_52_0 = (RuntimeException) var2;
            stackOut_52_1 = new StringBuilder().append("kq.<init>(");
            stackIn_55_0 = stackOut_52_0;
            stackIn_55_1 = stackOut_52_1;
            stackIn_53_0 = stackOut_52_0;
            stackIn_53_1 = stackOut_52_1;
            if (param0 == null) {
              stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
              stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
              stackOut_55_2 = "null";
              stackIn_56_0 = stackOut_55_0;
              stackIn_56_1 = stackOut_55_1;
              stackIn_56_2 = stackOut_55_2;
              break L19;
            } else {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "{...}";
              stackIn_56_0 = stackOut_53_0;
              stackIn_56_1 = stackOut_53_1;
              stackIn_56_2 = stackOut_53_2;
              break L19;
            }
          }
          throw r.a((Throwable) (Object) stackIn_56_0, stackIn_56_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_L = "DEFEAT!";
        field_i = "<%0> cannot join; the game has started.";
    }
}
