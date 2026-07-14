/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.lang.String;

final class ei {
    private int field_r;
    private int field_k;
    em field_a;
    private boolean field_n;
    boolean field_c;
    int field_p;
    l field_g;
    int field_i;
    private int field_f;
    static String field_o;
    static hl field_q;
    int field_d;
    private int field_j;
    static String field_h;
    static String field_e;
    int field_m;
    private int field_l;
    boolean field_b;

    private final void a(boolean param0, int param1, oh param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ej var9 = null;
        int var9_int = 0;
        oh var9_ref = null;
        int var10 = 0;
        int var11_int = 0;
        oh var11 = null;
        int var12 = 0;
        int var13 = 0;
        int stackIn_10_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_64_0 = 0;
        oh stackIn_71_0 = null;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_62_0 = 0;
        oh stackOut_70_0 = null;
        oh stackOut_69_0 = null;
        var12 = TetraLink.field_J;
        bd.a(param2, 6);
        ra.c(100, 0, 10, 400, 0);
        ra.c(530, 0, 10, 400, 0);
        ra.c(110, 0, 420, 400, 191);
        if (param1 == 651) {
          L0: {
            if (cf.a(0, (byte) 109)) {
              var4 = 0;
              L1: while (true) {
                if (var4 >= 7) {
                  break L0;
                } else {
                  var6 = 1 << var4;
                  var13 = 0;
                  var5 = var13;
                  L2: while (true) {
                    if (var13 >= 6) {
                      var4++;
                      continue L1;
                    } else {
                      L3: {
                        if (param0) {
                          stackOut_37_0 = 140 - -(var4 * 60);
                          stackIn_38_0 = stackOut_37_0;
                          break L3;
                        } else {
                          stackOut_36_0 = 500 - 60 * var4;
                          stackIn_38_0 = stackOut_36_0;
                          break L3;
                        }
                      }
                      L4: {
                        var7 = stackIn_38_0;
                        var8 = -(var13 * 60) + 370;
                        var9_ref = null;
                        if (0 != (var6 & ((ei) this).field_g.field_e[var13])) {
                          var9_ref = me.field_e;
                          break L4;
                        } else {
                          if (0 == (((ei) this).field_g.field_k[var13] & var6)) {
                            break L4;
                          } else {
                            var9_ref = qd.field_X;
                            break L4;
                          }
                        }
                      }
                      if (var9_ref != null) {
                        L5: {
                          var10 = 256;
                          if (((ei) this).field_g.field_f != null) {
                            if (0 == (((ei) this).field_g.field_f[var13] & var6)) {
                              break L5;
                            } else {
                              L6: {
                                var11_int = ((ei) this).field_j % 20;
                                if (10 >= var11_int) {
                                  stackOut_49_0 = var11_int - 5;
                                  stackIn_50_0 = stackOut_49_0;
                                  break L6;
                                } else {
                                  stackOut_48_0 = -var11_int + 15;
                                  stackIn_50_0 = stackOut_48_0;
                                  break L6;
                                }
                              }
                              var11_int = stackIn_50_0;
                              var10 = 128 + var11_int * 20;
                              break L5;
                            }
                          } else {
                            break L5;
                          }
                        }
                        if (var10 == 256) {
                          var9_ref.c(-28 + var7, -28 + var8);
                          var13++;
                          continue L2;
                        } else {
                          var9_ref.a(var7 - 28, -28 + var8, var10);
                          var13++;
                          continue L2;
                        }
                      } else {
                        var13++;
                        continue L2;
                      }
                    }
                  }
                }
              }
            } else {
              var4 = 0;
              L7: while (true) {
                if (-8 >= (var4 ^ -1)) {
                  break L0;
                } else {
                  var6 = 1 << var4;
                  var5 = 0;
                  L8: while (true) {
                    if ((var5 ^ -1) <= -7) {
                      var4++;
                      continue L7;
                    } else {
                      L9: {
                        var8 = -(60 * var5) + 370;
                        if (param0) {
                          stackOut_9_0 = 140 - -(60 * var4);
                          stackIn_10_0 = stackOut_9_0;
                          break L9;
                        } else {
                          stackOut_8_0 = 500 - var4 * 60;
                          stackIn_10_0 = stackOut_8_0;
                          break L9;
                        }
                      }
                      L10: {
                        var7 = stackIn_10_0;
                        var9_int = 0;
                        if ((((ei) this).field_g.field_e[var5] & var6) != 0) {
                          var9_int -= 128;
                          break L10;
                        } else {
                          if ((var6 & ((ei) this).field_g.field_k[var5]) != 0) {
                            // wide iinc 9 128
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                      }
                      L11: {
                        if (null == ((ei) this).field_g.field_f) {
                          break L11;
                        } else {
                          if ((((ei) this).field_g.field_f[var5] & var6) != 0) {
                            L12: {
                              var10 = ((ei) this).field_j % 20;
                              if (10 >= var10) {
                                stackOut_20_0 = -5 + var10;
                                stackIn_21_0 = stackOut_20_0;
                                break L12;
                              } else {
                                stackOut_19_0 = 5 + -var10;
                                stackIn_21_0 = stackOut_19_0;
                                break L12;
                              }
                            }
                            var10 = stackIn_21_0;
                            var9_int = var9_int + 10 * var10;
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                      }
                      L13: {
                        if ((var9_int ^ -1) <= 190) {
                          if (var9_int >= 0) {
                            if ((var9_int ^ -1) < -256) {
                              stackOut_28_0 = 16777215;
                              stackIn_29_0 = stackOut_28_0;
                              break L13;
                            } else {
                              stackOut_27_0 = (var9_int * 40 >> 1189172840) - -191 | var9_int * 65792;
                              stackIn_29_0 = stackOut_27_0;
                              break L13;
                            }
                          } else {
                            stackOut_25_0 = -(65535 * var9_int) + 191;
                            stackIn_29_0 = stackOut_25_0;
                            break L13;
                          }
                        } else {
                          stackOut_23_0 = 12517376;
                          stackIn_29_0 = stackOut_23_0;
                          break L13;
                        }
                      }
                      var10 = stackIn_29_0;
                      ra.f(var7, var8, 28, var10);
                      var5++;
                      continue L8;
                    }
                  }
                }
              }
            }
          }
          var9 = (ej) (Object) ((ei) this).field_g.field_g.c(false);
          L14: while (true) {
            if (var9 == null) {
              fh.a(true);
              return;
            } else {
              L15: {
                var8 = -(60 * var9.field_n) + 370;
                if (!param0) {
                  stackOut_60_0 = -(60 * var9.field_u) + 500;
                  stackIn_61_0 = stackOut_60_0;
                  break L15;
                } else {
                  stackOut_59_0 = 140 - -(var9.field_u * 60);
                  stackIn_61_0 = stackOut_59_0;
                  break L15;
                }
              }
              L16: {
                var7 = stackIn_61_0;
                if (!var9.field_x) {
                  stackOut_63_0 = 16777215;
                  stackIn_64_0 = stackOut_63_0;
                  break L16;
                } else {
                  stackOut_62_0 = 12517376;
                  stackIn_64_0 = stackOut_62_0;
                  break L16;
                }
              }
              L17: {
                var10 = stackIn_64_0;
                if (var9.field_q == 0) {
                  ra.d(var7, 0, var7, var9.field_y, var10);
                  break L17;
                } else {
                  if (-2 != (var9.field_q ^ -1)) {
                    ra.c(-(var9.field_s >> -449738751) + var7, 0, var9.field_s, var9.field_y, var10);
                    ra.f(var7, var9.field_y, var9.field_s >> -897082495, var10);
                    if (!cf.a(0, (byte) 119)) {
                      ra.f(var7, var8, 28, var10);
                      break L17;
                    } else {
                      L18: {
                        if (!var9.field_x) {
                          stackOut_70_0 = qd.field_X;
                          stackIn_71_0 = stackOut_70_0;
                          break L18;
                        } else {
                          stackOut_69_0 = me.field_e;
                          stackIn_71_0 = stackOut_69_0;
                          break L18;
                        }
                      }
                      var11 = stackIn_71_0;
                      var11.c(-28 + var7, -28 + var8);
                      break L17;
                    }
                  } else {
                    ra.c(var7 + -(var9.field_s >> -78946303), 0, var9.field_s, var8, var10);
                    ra.f(var7, var8, var9.field_s, var10);
                    break L17;
                  }
                }
              }
              var9 = (ej) (Object) ((ei) this).field_g.field_g.a((byte) -70);
              continue L14;
            }
          }
        } else {
          return;
        }
    }

    final void a(int param0, boolean param1) {
        int var3 = 0;
        String var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var12 = null;
        int[] var15 = null;
        int stackIn_69_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_78_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_76_0 = 0;
        L0: {
          var10 = TetraLink.field_J;
          if (0 != ((ei) this).field_a.field_b) {
            if (((ei) this).field_a.field_b != 1) {
              var15 = new int[4];
              ra.a(var15);
              ra.a(0, 0, 28, 57);
              e.field_f.c(0, 0);
              ra.a(28, 0, 57, 57);
              ho.field_M.c(0, 0);
              ra.b(var15);
              break L0;
            } else {
              ho.field_M.c(0, 0);
              break L0;
            }
          } else {
            e.field_f.c(0, 0);
            break L0;
          }
        }
        L1: {
          if (!((ei) this).field_a.field_l) {
            var12 = Integer.toString((49 + ((ei) this).field_d) / 50);
            mk.field_b.a(var12, 30, mk.field_b.field_N + 54 >> 1572420481, 16777215, -1);
            break L1;
          } else {
            if (-1 != ((ei) this).field_a.field_b) {
              go.field_g.a(ph.field_A, 30, 57 + go.field_g.field_N >> -860490751, 16777215, -1);
              break L1;
            } else {
              go.field_g.a(dc.field_i, 30, 57 - -go.field_g.field_N >> -690603103, 16777215, -1);
              break L1;
            }
          }
        }
        L2: {
          var3 = 0;
          if (param0 == -9104) {
            break L2;
          } else {
            field_h = null;
            break L2;
          }
        }
        L3: while (true) {
          if (-5 >= var3) {
            L4: {
              if (!((ei) this).field_a.field_l) {
                break L4;
              } else {
                if (kb.field_t != 0) {
                  break L4;
                } else {
                  if (0 != ed.field_O) {
                    break L4;
                  } else {
                    L5: {
                      if (((ei) this).field_a.field_b != -1) {
                        L6: {
                          if (!((ei) this).field_b) {
                            break L6;
                          } else {
                            if (((ei) this).field_i != ((ei) this).field_a.field_b) {
                              break L6;
                            } else {
                              var3_ref = mc.field_g;
                              break L5;
                            }
                          }
                        }
                        var3_ref = sk.a(new String[1], bk.field_b, param0 + 9223);
                        break L5;
                      } else {
                        var3_ref = qm.field_e;
                        break L5;
                      }
                    }
                    var4 = mk.field_b.b(var3_ref) / 2;
                    var4 += 20;
                    var5 = md.field_G;
                    var6 = ik.field_a;
                    var7 = (int)(24.0 * (Math.cos((double)((float)dh.field_e / 20.0f)) + 1.0));
                    var8 = 0;
                    L7: while (true) {
                      if (9 <= var8) {
                        mk.field_b.a(var3_ref, var5, mk.field_b.field_N / 2 + var6 + -2, 16777215, -1);
                        break L4;
                      } else {
                        var9 = (-var8 + 9) * var7 >>> 2142164739;
                        ra.d(-var9 + (var5 + -var4), -var9 + (var6 - 36), var4 + var9 << 1022678753, 36 - -var9 << 1167103937, 64, 16);
                        ra.c(-var4 + (var5 - var9), var6 - 36 + -var9, var9 + var4 << 702625921, var9 + 36 << -974964639, 3, 8421631);
                        var8++;
                        continue L7;
                      }
                    }
                  }
                }
              }
            }
            L8: {
              if (!((ei) this).field_b) {
                break L8;
              } else {
                L9: {
                  L10: {
                    var3 = go.field_g.b(da.field_i) + 6 - -2;
                    cn.field_g = cn.field_g + (-cn.field_g + (float)var3) * 0.10000000149011612f;
                    if (1 != (((ei) this).field_l ^ -1)) {
                      break L10;
                    } else {
                      if (!param1) {
                        break L10;
                      } else {
                        stackOut_61_0 = 1;
                        stackIn_69_0 = stackOut_61_0;
                        break L9;
                      }
                    }
                  }
                  if (lb.field_R > 0) {
                    if (20 > dh.field_e % 40) {
                      stackOut_67_0 = 1;
                      stackIn_69_0 = stackOut_67_0;
                      break L9;
                    } else {
                      stackOut_66_0 = 0;
                      stackIn_69_0 = stackOut_66_0;
                      break L9;
                    }
                  } else {
                    stackOut_64_0 = 0;
                    stackIn_69_0 = stackOut_64_0;
                    break L9;
                  }
                }
                L11: {
                  var4 = stackIn_69_0;
                  if (var4 != 0) {
                    stackOut_71_0 = 128;
                    stackIn_72_0 = stackOut_71_0;
                    break L11;
                  } else {
                    stackOut_70_0 = 4210752;
                    stackIn_72_0 = stackOut_70_0;
                    break L11;
                  }
                }
                L12: {
                  var5 = stackIn_72_0;
                  if (lb.field_R > 0) {
                    stackOut_74_0 = 16776960;
                    stackIn_75_0 = stackOut_74_0;
                    break L12;
                  } else {
                    stackOut_73_0 = 16777215;
                    stackIn_75_0 = stackOut_73_0;
                    break L12;
                  }
                }
                L13: {
                  var6 = stackIn_75_0;
                  if ((lb.field_R ^ -1) < -1) {
                    stackOut_77_0 = 256;
                    stackIn_78_0 = stackOut_77_0;
                    break L13;
                  } else {
                    stackOut_76_0 = 128;
                    stackIn_78_0 = stackOut_76_0;
                    break L13;
                  }
                }
                var7 = stackIn_78_0;
                var8 = 2 + oj.field_a.field_z + -20;
                var9 = 0;
                L14: while (true) {
                  if (18 <= var9) {
                    var9 = 0;
                    L15: while (true) {
                      if ((var9 ^ -1) <= -3) {
                        go.field_g.b(da.field_i, -2 + ((int)cn.field_g + -1), oj.field_a.field_z + -2, var6, -1, var7);
                        break L8;
                      } else {
                        ra.e(0, -var9 + (-1 + var8), -(var9 / 2) + ((int)cn.field_g - -1), 16777215, 128);
                        var9++;
                        continue L15;
                      }
                    }
                  } else {
                    ra.e(0, var8 - -var9, (int)cn.field_g + var9 / 2, var5, 128);
                    ra.e((int)cn.field_g + var9 / 2, var8 + var9, 2, 16777215, 128);
                    var9++;
                    continue L14;
                  }
                }
              }
            }
            return;
          } else {
            L16: {
              L17: {
                var4 = 4210752;
                if (var3 == ((ei) this).field_f) {
                  break L17;
                } else {
                  if (((ei) this).field_r != var3) {
                    break L16;
                  } else {
                    break L17;
                  }
                }
              }
              if (0 == kb.field_t) {
                L18: {
                  if (((ei) this).field_l == var3) {
                    var4 = 128;
                    break L18;
                  } else {
                    break L18;
                  }
                }
                if (dh.field_e % 40 >= 20) {
                  break L16;
                } else {
                  if (((ei) this).field_a.field_l) {
                    var4 = 8421504 | 8355711 & var4 >> 1309640801;
                    break L16;
                  } else {
                    break L16;
                  }
                }
              } else {
                var3++;
                continue L3;
              }
            }
            L19: {
              if (null != na.field_p[var3]) {
                break L19;
              } else {
                if (null != na.field_n[var3]) {
                  break L19;
                } else {
                  var3++;
                  continue L3;
                }
              }
            }
            L20: {
              var5 = 128;
              if (na.field_p[var3] == null) {
                var5 = na.field_z[var3] / 2;
                break L20;
              } else {
                break L20;
              }
            }
            L21: {
              if (null == na.field_n[var3]) {
                var5 = (-na.field_z[var3] + 256) / 2;
                break L21;
              } else {
                break L21;
              }
            }
            var6 = 20 * var3;
            L22: while (true) {
              if (-2 + 20 * (1 + var3) <= var6) {
                var6 = (1 + var3) * 20 + -2;
                L23: while (true) {
                  if (20 + var3 * 20 <= var6) {
                    if (0 != na.field_z[var3]) {
                      go.field_g.c(na.field_p[var3], -(int)pm.field_c + 651 - -(var3 * 10), -3 + var3 * 20 - -18, 16777215, -1, 256 - na.field_z[var3]);
                      go.field_g.c(na.field_n[var3], -(int)pm.field_c + (651 + var3 * 10), 17 + var3 * 20 - 2, 16777215, -1, na.field_z[var3]);
                      var3++;
                      continue L3;
                    } else {
                      go.field_g.b(na.field_p[var3], -(int)pm.field_c + 651 + var3 * 10, -2 + (20 * var3 + 20) - 3, 16777215, -1);
                      var3++;
                      continue L3;
                    }
                  } else {
                    ra.e(var6 / 2 + (-(int)pm.field_c + 638), var6, 2 + (int)pm.field_c - var6 / 2, 16777215, var5);
                    var6++;
                    continue L23;
                  }
                }
              } else {
                ra.e(640 - ((int)pm.field_c - var6 / 2), var6, -(var6 / 2) + (int)pm.field_c, var4, var5);
                ra.e(-(int)pm.field_c + 638 + var6 / 2, var6, 2, 16777215, var5);
                var6++;
                continue L22;
              }
            }
          }
        }
    }

    public static void b(boolean param0) {
        field_e = null;
        field_o = null;
        field_q = null;
        if (param0) {
            field_o = null;
        }
        field_h = null;
    }

    final void a(boolean param0, oh param1, boolean param2) {
        this.b(param0, param1, (byte) -104);
        if (param2) {
            ((ei) this).e(69);
        }
    }

    final void a(int param0, oh param1, oh param2, boolean param3) {
        this.a(param3, 651, param2);
        if (param0 != 2509) {
            ((ei) this).field_m = -104;
        }
        this.a(param3, param1, (byte) 57);
    }

    final void a(double param0, boolean param1, double param2, boolean param3, byte param4, boolean param5, int param6, int param7) {
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Object var14 = null;
        int stackIn_27_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_55_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_53_0 = 0;
        L0: {
          var13 = TetraLink.field_J;
          if (param5) {
            break L0;
          } else {
            if (oj.field_a.field_z >= a.field_a) {
              L1: {
                if (tm.field_t == 0) {
                  L2: {
                    if (!param3) {
                      break L2;
                    } else {
                      ((ei) this).field_l = a.field_a / 18;
                      if (638 - ((int)pm.field_c - a.field_a / 2) > aa.field_Nb) {
                        ((ei) this).field_l = -1;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (!((ei) this).field_b) {
                    break L1;
                  } else {
                    if ((a.field_a ^ -1) == 0) {
                      break L1;
                    } else {
                      var11 = -oj.field_a.field_z + (a.field_a - -16);
                      if (var11 <= 0) {
                        break L1;
                      } else {
                        if ((var11 ^ -1) < -17) {
                          break L1;
                        } else {
                          if ((float)aa.field_Nb >= cn.field_g) {
                            break L1;
                          } else {
                            ((ei) this).field_l = -2;
                            break L1;
                          }
                        }
                      }
                    }
                  }
                } else {
                  L3: {
                    if (param3) {
                      ((ei) this).field_l = li.field_o / 18;
                      if (ci.field_B >= li.field_o / 2 + 638 + -(int)pm.field_c) {
                        break L3;
                      } else {
                        ((ei) this).field_l = -1;
                        break L3;
                      }
                    } else {
                      ((ei) this).field_l = -1;
                      break L3;
                    }
                  }
                  L4: {
                    if (!((ei) this).field_b) {
                      break L4;
                    } else {
                      var11 = -oj.field_a.field_z + li.field_o - -16;
                      if (0 >= var11) {
                        break L4;
                      } else {
                        if (var11 > 16) {
                          break L4;
                        } else {
                          if ((float)ci.field_B >= cn.field_g) {
                            break L4;
                          } else {
                            ((ei) this).field_l = -2;
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  if (((ei) this).field_l == -1) {
                    break L1;
                  } else {
                    if (((ei) this).field_f != ((ei) this).field_l) {
                      if (((ei) this).field_r != ((ei) this).field_l) {
                        if (-2 != ((ei) this).field_l) {
                          break L1;
                        } else {
                          L5: {
                            if (tb.field_e) {
                              stackOut_26_0 = 0;
                              stackIn_27_0 = stackOut_26_0;
                              break L5;
                            } else {
                              stackOut_25_0 = 1;
                              stackIn_27_0 = stackOut_25_0;
                              break L5;
                            }
                          }
                          tb.field_e = stackIn_27_0 != 0;
                          if (stackIn_27_0 == 0) {
                            break L1;
                          } else {
                            lb.field_R = 0;
                            break L1;
                          }
                        }
                      } else {
                        if (!((ei) this).field_b) {
                          vf.a(true, 9, false);
                          break L1;
                        } else {
                          vf.a(true, 12, false);
                          break L1;
                        }
                      }
                    } else {
                      if (!((ei) this).field_a.field_l) {
                        ((ei) this).a(0);
                        break L1;
                      } else {
                        ((ei) this).e(-1);
                        break L1;
                      }
                    }
                  }
                }
              }
              L6: {
                if (param4 == -115) {
                  break L6;
                } else {
                  var14 = null;
                  ei.a((java.applet.Applet) null, 103);
                  break L6;
                }
              }
              L7: {
                L8: {
                  if (-1 != ((ei) this).field_l) {
                    break L8;
                  } else {
                    if (!param3) {
                      break L8;
                    } else {
                      if (((ei) this).field_a.field_l) {
                        break L8;
                      } else {
                        if (param2 < 110.0) {
                          break L8;
                        } else {
                          if (param2 >= 530.0) {
                            break L8;
                          } else {
                            if (0.0 > param0) {
                              break L8;
                            } else {
                              if (param0 >= 400.0) {
                                break L8;
                              } else {
                                L9: {
                                  if (param1) {
                                    stackOut_50_0 = (-110 + (int)param2) / 60;
                                    stackIn_51_0 = stackOut_50_0;
                                    break L9;
                                  } else {
                                    stackOut_49_0 = (-(int)param2 + 530) / 60;
                                    stackIn_51_0 = stackOut_49_0;
                                    break L9;
                                  }
                                }
                                var11 = stackIn_51_0;
                                if (-2 == (param7 ^ -1)) {
                                  var12 = ((ei) this).field_a.a(var11, (byte) 101);
                                  if (!((ei) this).field_a.b(var12, var11, -123)) {
                                    bf discarded$2 = lb.a(io.field_c, param4 + 573509876);
                                    break L7;
                                  } else {
                                    if (!((ei) this).field_b) {
                                      this.a(var11, param4 ^ 15667, var12);
                                      ((ei) this).field_n = false;
                                      break L7;
                                    } else {
                                      if (((ei) this).field_i != ((ei) this).field_a.field_b) {
                                        break L7;
                                      } else {
                                        this.a(var11, var12, true);
                                        ((ei) this).field_n = false;
                                        break L7;
                                      }
                                    }
                                  }
                                } else {
                                  L10: {
                                    if (((ei) this).field_g.field_l == var11) {
                                      stackOut_54_0 = 0;
                                      stackIn_55_0 = stackOut_54_0;
                                      break L10;
                                    } else {
                                      stackOut_53_0 = 1;
                                      stackIn_55_0 = stackOut_53_0;
                                      break L10;
                                    }
                                  }
                                  var12 = stackIn_55_0;
                                  ((ei) this).field_g.a(var11, (byte) -96);
                                  if (var12 == 0) {
                                    break L7;
                                  } else {
                                    if (((ei) this).field_g.field_l == -1) {
                                      break L7;
                                    } else {
                                      bf discarded$3 = lb.a(bo.field_A, 573509761);
                                      break L7;
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
                }
                ((ei) this).field_g.field_l = -1;
                break L7;
              }
              return;
            } else {
              break L0;
            }
          }
        }
        ((ei) this).field_g.field_l = -1;
        ((ei) this).field_l = -1;
    }

    final static void a(int param0, fj param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = TetraLink.field_J;
        var2 = 0;
        L0: while (true) {
          if (var2 >= 3) {
            if (param0 == -2792) {
              var2 = 0;
              L1: while (true) {
                if (pl.field_d <= var2) {
                  uf.field_c[param1.a((byte) -63)] = uf.field_c[param1.a((byte) -63)] + 1;
                  var2 = 0;
                  var3 = 0;
                  L2: while (true) {
                    if (pl.field_d <= var3) {
                      pl.field_d = var2;
                      pl.field_d = pl.field_d + 1;
                      n.field_L[pl.field_d] = param1;
                      return;
                    } else {
                      L3: {
                        if (n.field_L[var3].field_i != param1.field_i) {
                          break L3;
                        } else {
                          var4 = n.field_L[var3].a((byte) -63);
                          if (fh.field_a >= uf.field_c[var4]) {
                            break L3;
                          } else {
                            uf.field_c[var4] = uf.field_c[var4] - 1;
                            var3++;
                            continue L2;
                          }
                        }
                      }
                      var2++;
                      n.field_L[var2] = n.field_L[var3];
                      var3++;
                      continue L2;
                    }
                  }
                } else {
                  if (n.field_L[var2].field_i == param1.field_i) {
                    uf.field_c[n.field_L[var2].a((byte) -63)] = uf.field_c[n.field_L[var2].a((byte) -63)] + 1;
                    var2++;
                    continue L1;
                  } else {
                    var2++;
                    continue L1;
                  }
                }
              }
            } else {
              return;
            }
          } else {
            uf.field_c[var2] = 0;
            var2++;
            continue L0;
          }
        }
    }

    private final void b(int param0) {
        String var2_ref = null;
        int var2 = 0;
        String var3_ref = null;
        int var3 = 0;
        String var3_ref_String = null;
        int var4 = 0;
        String stackIn_6_0 = null;
        String[] stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        String[] stackIn_47_2 = null;
        String[] stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        String[] stackIn_48_2 = null;
        String[] stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        String[] stackIn_49_2 = null;
        String stackIn_49_3 = null;
        String[] stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        String[] stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        String[] stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        String stackIn_68_2 = null;
        String[] stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        String[] stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        String[] stackIn_78_0 = null;
        int stackIn_78_1 = 0;
        String stackIn_78_2 = null;
        String[] stackIn_80_0 = null;
        int stackIn_80_1 = 0;
        String[] stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        String[] stackIn_82_0 = null;
        int stackIn_82_1 = 0;
        String stackIn_82_2 = null;
        String[] stackIn_84_0 = null;
        int stackIn_84_1 = 0;
        String[] stackIn_85_0 = null;
        int stackIn_85_1 = 0;
        String[] stackIn_86_0 = null;
        int stackIn_86_1 = 0;
        String stackIn_86_2 = null;
        String stackOut_5_0 = null;
        String stackOut_4_0 = null;
        String[] stackOut_83_0 = null;
        int stackOut_83_1 = 0;
        String[] stackOut_85_0 = null;
        int stackOut_85_1 = 0;
        String stackOut_85_2 = null;
        String[] stackOut_84_0 = null;
        int stackOut_84_1 = 0;
        String stackOut_84_2 = null;
        String[] stackOut_79_0 = null;
        int stackOut_79_1 = 0;
        String[] stackOut_81_0 = null;
        int stackOut_81_1 = 0;
        String stackOut_81_2 = null;
        String[] stackOut_80_0 = null;
        int stackOut_80_1 = 0;
        String stackOut_80_2 = null;
        String[] stackOut_75_0 = null;
        int stackOut_75_1 = 0;
        String[] stackOut_77_0 = null;
        int stackOut_77_1 = 0;
        String stackOut_77_2 = null;
        String[] stackOut_76_0 = null;
        int stackOut_76_1 = 0;
        String stackOut_76_2 = null;
        String[] stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        String[] stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        String stackOut_67_2 = null;
        String[] stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        String stackOut_66_2 = null;
        String[] stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        String[] stackOut_46_2 = null;
        String[] stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        String[] stackOut_48_2 = null;
        String stackOut_48_3 = null;
        String[] stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        String[] stackOut_47_2 = null;
        String stackOut_47_3 = null;
        L0: {
          var4 = TetraLink.field_J;
          if (((ei) this).field_a.field_l) {
            if (0 <= ((ei) this).field_a.field_b) {
              L1: {
                if (!((ei) this).field_b) {
                  break L1;
                } else {
                  if (((ei) this).field_i != ((ei) this).field_a.field_b) {
                    break L1;
                  } else {
                    hg.field_e = mc.field_g;
                    break L0;
                  }
                }
              }
              hg.field_e = sk.a(new String[1], bk.field_b, 120);
              break L0;
            } else {
              hg.field_e = qm.field_e;
              break L0;
            }
          } else {
            if (-1 < (((ei) this).field_a.field_b ^ -1)) {
              hg.field_e = "";
              break L0;
            } else {
              var2_ref = Integer.toString((-1 + (50 + ((ei) this).field_d)) / 50);
              if (!((ei) this).field_b) {
                hg.field_e = sk.a(new String[2], ef.field_o, 119);
                break L0;
              } else {
                L2: {
                  if (((ei) this).field_a.field_b == 0) {
                    stackOut_5_0 = bh.field_s;
                    stackIn_6_0 = stackOut_5_0;
                    break L2;
                  } else {
                    stackOut_4_0 = ek.field_t;
                    stackIn_6_0 = stackOut_4_0;
                    break L2;
                  }
                }
                var3_ref = stackIn_6_0;
                if (((ei) this).field_i != ((ei) this).field_a.field_b) {
                  hg.field_e = sk.a(new String[3], ld.field_M, 123);
                  break L0;
                } else {
                  hg.field_e = sk.a(new String[2], qj.field_e, param0 ^ -102);
                  break L0;
                }
              }
            }
          }
        }
        L3: {
          if (hg.field_e == null) {
            L4: {
              if (null == vg.field_Kb) {
                break L4;
              } else {
                break L4;
              }
            }
            ce.field_b = 0;
            break L3;
          } else {
            if (!hg.field_e.equals((Object) (Object) vg.field_Kb)) {
              ce.field_b = ce.field_b + 8;
              if ((ce.field_b + 8 ^ -1) <= -257) {
                vg.field_Kb = hg.field_e;
                ce.field_b = 0;
                break L3;
              } else {
                break L3;
              }
            } else {
              ce.field_b = 0;
              break L3;
            }
          }
        }
        L5: {
          L6: {
            int discarded$1 = go.field_g.b(hg.field_e);
            if (!((ei) this).field_n) {
              break L6;
            } else {
              L7: {
                if (!((ei) this).field_b) {
                  break L7;
                } else {
                  if (((ei) this).field_i != ((ei) this).field_a.field_b) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              ((ei) this).field_k = ((ei) this).field_k + 1;
              if ((((ei) this).field_k + 1 ^ -1) >= -29) {
                break L5;
              } else {
                ((ei) this).field_k = 28;
                break L5;
              }
            }
          }
          ((ei) this).field_k = ((ei) this).field_k - 1;
          if (((ei) this).field_k - 1 >= 0) {
            break L5;
          } else {
            ((ei) this).field_k = 0;
            break L5;
          }
        }
        L8: {
          if (!((ei) this).field_b) {
            na.field_n[2] = null;
            na.field_n[3] = null;
            if (!((ei) this).field_a.field_l) {
              na.field_n[0] = null;
              na.field_n[1] = null;
              break L8;
            } else {
              na.field_n[1] = ed.field_P;
              ((ei) this).field_f = 0;
              ((ei) this).field_r = 1;
              na.field_n[0] = qk.field_a;
              break L8;
            }
          } else {
            var2 = 0;
            L9: while (true) {
              if (var2 >= 2) {
                if (((ei) this).field_i == -2) {
                  ((ei) this).field_r = 3;
                  na.field_n[3] = ed.field_P;
                  na.field_n[2] = null;
                  ((ei) this).field_f = -1;
                  break L8;
                } else {
                  if (!((ei) this).field_a.field_l) {
                    L10: {
                      ((ei) this).field_f = 2;
                      ((ei) this).field_r = -1;
                      if ((1 << ((ei) this).field_i & ((ei) this).field_a.field_h) == 0) {
                        if (-1 == (((ei) this).field_a.field_h ^ -1)) {
                          na.field_n[2] = null;
                          ((ei) this).field_f = -1;
                          break L10;
                        } else {
                          na.field_n[2] = lg.field_O;
                          break L10;
                        }
                      } else {
                        na.field_n[2] = mh.field_f;
                        break L10;
                      }
                    }
                    na.field_p[3] = null;
                    break L8;
                  } else {
                    ((ei) this).field_f = 2;
                    na.field_n[3] = ed.field_P;
                    ((ei) this).field_r = 3;
                    if (((ei) this).field_m == 0) {
                      if ((1 << ((ei) this).field_i & ((ei) this).field_a.field_n) != 0) {
                        L11: {
                          stackOut_83_0 = na.field_n;
                          stackOut_83_1 = 2;
                          stackIn_85_0 = stackOut_83_0;
                          stackIn_85_1 = stackOut_83_1;
                          stackIn_84_0 = stackOut_83_0;
                          stackIn_84_1 = stackOut_83_1;
                          if (!((ei) this).field_c) {
                            stackOut_85_0 = (String[]) (Object) stackIn_85_0;
                            stackOut_85_1 = stackIn_85_1;
                            stackOut_85_2 = co.field_s;
                            stackIn_86_0 = stackOut_85_0;
                            stackIn_86_1 = stackOut_85_1;
                            stackIn_86_2 = stackOut_85_2;
                            break L11;
                          } else {
                            stackOut_84_0 = (String[]) (Object) stackIn_84_0;
                            stackOut_84_1 = stackIn_84_1;
                            stackOut_84_2 = wk.field_a;
                            stackIn_86_0 = stackOut_84_0;
                            stackIn_86_1 = stackOut_84_1;
                            stackIn_86_2 = stackOut_84_2;
                            break L11;
                          }
                        }
                        stackIn_86_0[stackIn_86_1] = stackIn_86_2;
                        break L8;
                      } else {
                        if (0 != ((ei) this).field_a.field_n) {
                          L12: {
                            stackOut_79_0 = na.field_n;
                            stackOut_79_1 = 2;
                            stackIn_81_0 = stackOut_79_0;
                            stackIn_81_1 = stackOut_79_1;
                            stackIn_80_0 = stackOut_79_0;
                            stackIn_80_1 = stackOut_79_1;
                            if (((ei) this).field_c) {
                              stackOut_81_0 = (String[]) (Object) stackIn_81_0;
                              stackOut_81_1 = stackIn_81_1;
                              stackOut_81_2 = ce.field_c;
                              stackIn_82_0 = stackOut_81_0;
                              stackIn_82_1 = stackOut_81_1;
                              stackIn_82_2 = stackOut_81_2;
                              break L12;
                            } else {
                              stackOut_80_0 = (String[]) (Object) stackIn_80_0;
                              stackOut_80_1 = stackIn_80_1;
                              stackOut_80_2 = tc.field_q;
                              stackIn_82_0 = stackOut_80_0;
                              stackIn_82_1 = stackOut_80_1;
                              stackIn_82_2 = stackOut_80_2;
                              break L12;
                            }
                          }
                          stackIn_82_0[stackIn_82_1] = stackIn_82_2;
                          break L8;
                        } else {
                          L13: {
                            stackOut_75_0 = na.field_n;
                            stackOut_75_1 = 2;
                            stackIn_77_0 = stackOut_75_0;
                            stackIn_77_1 = stackOut_75_1;
                            stackIn_76_0 = stackOut_75_0;
                            stackIn_76_1 = stackOut_75_1;
                            if (((ei) this).field_c) {
                              stackOut_77_0 = (String[]) (Object) stackIn_77_0;
                              stackOut_77_1 = stackIn_77_1;
                              stackOut_77_2 = lh.field_r;
                              stackIn_78_0 = stackOut_77_0;
                              stackIn_78_1 = stackOut_77_1;
                              stackIn_78_2 = stackOut_77_2;
                              break L13;
                            } else {
                              stackOut_76_0 = (String[]) (Object) stackIn_76_0;
                              stackOut_76_1 = stackIn_76_1;
                              stackOut_76_2 = ej.field_w;
                              stackIn_78_0 = stackOut_76_0;
                              stackIn_78_1 = stackOut_76_1;
                              stackIn_78_2 = stackOut_76_2;
                              break L13;
                            }
                          }
                          stackIn_78_0[stackIn_78_1] = stackIn_78_2;
                          break L8;
                        }
                      }
                    } else {
                      ((ei) this).field_f = -1;
                      na.field_n[2] = null;
                      break L8;
                    }
                  }
                }
              } else {
                if (((ei) this).field_i == var2) {
                  if ((1 << var2 & ((ei) this).field_a.field_j) == 0) {
                    L14: {
                      if (((ei) this).field_a.field_l) {
                        break L14;
                      } else {
                        if ((1 << var2 & ((ei) this).field_a.field_h) == 0) {
                          break L14;
                        } else {
                          na.field_n[var2] = bk.field_g;
                          var2++;
                          continue L9;
                        }
                      }
                    }
                    if ((1 << var2 & ((ei) this).field_a.field_n) != 0) {
                      L15: {
                        stackOut_65_0 = na.field_n;
                        stackOut_65_1 = var2;
                        stackIn_67_0 = stackOut_65_0;
                        stackIn_67_1 = stackOut_65_1;
                        stackIn_66_0 = stackOut_65_0;
                        stackIn_66_1 = stackOut_65_1;
                        if (((ei) this).field_c) {
                          stackOut_67_0 = (String[]) (Object) stackIn_67_0;
                          stackOut_67_1 = stackIn_67_1;
                          stackOut_67_2 = oi.field_i;
                          stackIn_68_0 = stackOut_67_0;
                          stackIn_68_1 = stackOut_67_1;
                          stackIn_68_2 = stackOut_67_2;
                          break L15;
                        } else {
                          stackOut_66_0 = (String[]) (Object) stackIn_66_0;
                          stackOut_66_1 = stackIn_66_1;
                          stackOut_66_2 = vh.field_c;
                          stackIn_68_0 = stackOut_66_0;
                          stackIn_68_1 = stackOut_66_1;
                          stackIn_68_2 = stackOut_66_2;
                          break L15;
                        }
                      }
                      stackIn_68_0[stackIn_68_1] = stackIn_68_2;
                      var2++;
                      continue L9;
                    } else {
                      na.field_n[var2] = null;
                      var2++;
                      continue L9;
                    }
                  } else {
                    if (0 == (((ei) this).field_a.field_n & 1 << var2)) {
                      na.field_n[var2] = ul.field_b;
                      var2++;
                      continue L9;
                    } else {
                      na.field_n[var2] = wc.field_H;
                      var2++;
                      continue L9;
                    }
                  }
                } else {
                  var3_ref_String = ((ei) this).field_a.field_o[var2];
                  if (0 != (((ei) this).field_a.field_j & 1 << var2)) {
                    if ((((ei) this).field_m & 1 << var2) == 0) {
                      if ((((ei) this).field_a.field_n & 1 << var2) == 0) {
                        na.field_n[var2] = sk.a(new String[1], eg.field_M, 120);
                        var2++;
                        continue L9;
                      } else {
                        na.field_n[var2] = sk.a(new String[1], dg.field_d, 123);
                        var2++;
                        continue L9;
                      }
                    } else {
                      na.field_n[var2] = sk.a(new String[1], tk.field_f, param0 + 153);
                      var2++;
                      continue L9;
                    }
                  } else {
                    if ((((ei) this).field_m & 1 << var2) != 0) {
                      na.field_n[var2] = sk.a(new String[1], jl.field_d, 119);
                      var2++;
                      continue L9;
                    } else {
                      L16: {
                        if (((ei) this).field_a.field_l) {
                          break L16;
                        } else {
                          if ((((ei) this).field_a.field_h & 1 << var2) == 0) {
                            break L16;
                          } else {
                            na.field_n[var2] = sk.a(new String[1], bc.field_v, 125);
                            var2++;
                            continue L9;
                          }
                        }
                      }
                      if ((((ei) this).field_a.field_n & 1 << var2) != 0) {
                        L17: {
                          stackOut_46_0 = na.field_n;
                          stackOut_46_1 = var2;
                          stackOut_46_2 = new String[]{var3_ref_String};
                          stackIn_48_0 = stackOut_46_0;
                          stackIn_48_1 = stackOut_46_1;
                          stackIn_48_2 = stackOut_46_2;
                          stackIn_47_0 = stackOut_46_0;
                          stackIn_47_1 = stackOut_46_1;
                          stackIn_47_2 = stackOut_46_2;
                          if (((ei) this).field_c) {
                            stackOut_48_0 = (String[]) (Object) stackIn_48_0;
                            stackOut_48_1 = stackIn_48_1;
                            stackOut_48_2 = (String[]) (Object) stackIn_48_2;
                            stackOut_48_3 = fn.field_P;
                            stackIn_49_0 = stackOut_48_0;
                            stackIn_49_1 = stackOut_48_1;
                            stackIn_49_2 = stackOut_48_2;
                            stackIn_49_3 = stackOut_48_3;
                            break L17;
                          } else {
                            stackOut_47_0 = (String[]) (Object) stackIn_47_0;
                            stackOut_47_1 = stackIn_47_1;
                            stackOut_47_2 = (String[]) (Object) stackIn_47_2;
                            stackOut_47_3 = ch.field_o;
                            stackIn_49_0 = stackOut_47_0;
                            stackIn_49_1 = stackOut_47_1;
                            stackIn_49_2 = stackOut_47_2;
                            stackIn_49_3 = stackOut_47_3;
                            break L17;
                          }
                        }
                        stackIn_49_0[stackIn_49_1] = sk.a(stackIn_49_2, stackIn_49_3, 122);
                        var2++;
                        continue L9;
                      } else {
                        na.field_n[var2] = null;
                        var2++;
                        continue L9;
                      }
                    }
                  }
                }
              }
            }
          }
        }
        var2 = 0;
        var3 = 0;
        L18: while (true) {
          if ((var3 ^ -1) <= -5) {
            var3 = var2;
            L19: while (true) {
              if ((var3 ^ -1) <= -5) {
                L20: {
                  if (param0 == -27) {
                    break L20;
                  } else {
                    ((ei) this).field_i = 126;
                    break L20;
                  }
                }
                var3 = 0;
                L21: while (true) {
                  if ((var3 ^ -1) <= -5) {
                    na.field_y = 0;
                    var3 = 0;
                    L22: while (true) {
                      if (-5 >= (var3 ^ -1)) {
                        L23: {
                          pm.field_c = pm.field_c + 0.10000000149011612f * (-pm.field_c + (float)na.field_y);
                          if (!((ei) this).field_a.field_l) {
                            break L23;
                          } else {
                            ((ei) this).field_p = ((ei) this).field_p + 1;
                            if (((ei) this).field_p + 1 > 150) {
                              break L23;
                            } else {
                              break L23;
                            }
                          }
                        }
                        L24: {
                          da.field_i = lo.field_b;
                          if (tb.field_e) {
                            break L24;
                          } else {
                            if (1 < lb.field_R) {
                              da.field_i = sk.a(new String[1], w.field_q, param0 + 149);
                              break L24;
                            } else {
                              if (-2 == (lb.field_R ^ -1)) {
                                da.field_i = ve.field_c;
                                break L24;
                              } else {
                                da.field_i = fj.field_d;
                                break L24;
                              }
                            }
                          }
                        }
                        return;
                      } else {
                        if (na.field_n[var3] != null) {
                          na.field_v[var3] = go.field_g.b(na.field_n[var3]);
                          if (10 * var3 + (na.field_v[var3] - -17) > na.field_y) {
                            na.field_y = 17 + na.field_v[var3] + var3 * 10;
                            var3++;
                            continue L22;
                          } else {
                            var3++;
                            continue L22;
                          }
                        } else {
                          var3++;
                          continue L22;
                        }
                      }
                    }
                  } else {
                    L25: {
                      L26: {
                        if (na.field_n[var3] == null) {
                          if (null == na.field_p[var3]) {
                            break L25;
                          } else {
                            break L26;
                          }
                        } else {
                          if (!na.field_n[var3].equals((Object) (Object) na.field_p[var3])) {
                            break L26;
                          } else {
                            break L25;
                          }
                        }
                      }
                      na.field_z[var3] = na.field_z[var3] + 8;
                      if (-257 >= (na.field_z[var3] + 8 ^ -1)) {
                        na.field_p[var3] = na.field_n[var3];
                        na.field_z[var3] = 0;
                        var3++;
                        continue L21;
                      } else {
                        var3++;
                        continue L21;
                      }
                    }
                    na.field_z[var3] = 0;
                    var3++;
                    continue L21;
                  }
                }
              } else {
                na.field_n[var3] = null;
                var3++;
                continue L19;
              }
            }
          } else {
            if (null != na.field_n[var3]) {
              if (var3 != var2) {
                L27: {
                  na.field_n[var2] = na.field_n[var3];
                  if (var3 == ((ei) this).field_f) {
                    ((ei) this).field_f = var2;
                    break L27;
                  } else {
                    break L27;
                  }
                }
                if (var3 == ((ei) this).field_r) {
                  ((ei) this).field_r = var2;
                  var2++;
                  var3++;
                  continue L18;
                } else {
                  var2++;
                  var3++;
                  continue L18;
                }
              } else {
                var2++;
                var3++;
                continue L18;
              }
            } else {
              var3++;
              continue L18;
            }
          }
        }
    }

    final static String a(byte param0, long param1) {
        mf.field_t.setTime(new Date(param1));
        int var3 = mf.field_t.get(7);
        int var4 = mf.field_t.get(5);
        int var5 = mf.field_t.get(2);
        int var6 = mf.field_t.get(1);
        int var7 = mf.field_t.get(11);
        int var8 = mf.field_t.get(12);
        if (param0 != 2) {
            return null;
        }
        int var9 = mf.field_t.get(13);
        return hm.field_f[-1 + var3] + ", " + var4 / 10 + var4 % 10 + "-" + mm.field_v[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    final void a(boolean param0, int param1, boolean param2, int param3) {
        if (param0) {
            if (cl.field_g == 0) {
                wk.field_s = dj.field_h;
                dg.field_j = rn.field_d;
            }
        }
        if (param1 > -82) {
            field_q = null;
        }
        sa.a(-96, false);
        if (!wk.field_i.field_n) {
            if (qb.a(param3, (byte) 114)) {
                wb.a(true, -7869);
            }
        }
        int var5 = param3;
        int var6 = param2 ? 1 : 0;
        ac.a(var5, -99, var6 != 0, 0);
    }

    final static void a(byte param0, int param1) {
        bc var2 = nd.field_Lb;
        if (param0 <= 39) {
            field_h = null;
        }
        var2.f(param1, (byte) -92);
        var2.a(1, false);
        var2.a(2, false);
    }

    final void a(boolean param0) {
        int var3 = 0;
        L0: {
          var3 = TetraLink.field_J;
          if (!param0) {
            break L0;
          } else {
            ((ei) this).a(false, false);
            break L0;
          }
        }
        L1: {
          if (!((ei) this).field_b) {
            if (((ei) this).field_a.field_b == 0) {
              ((ei) this).field_a.a(1, 4);
              break L1;
            } else {
              if (((ei) this).field_a.field_b == 1) {
                ((ei) this).field_a.a(0, 4);
                break L1;
              } else {
                break L1;
              }
            }
          } else {
            nd.field_Lb.f(60, (byte) -92);
            break L1;
          }
        }
    }

    private final void b(boolean param0, oh param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ej var10 = null;
        int var10_int = 0;
        oh var10_ref = null;
        int var11 = 0;
        int var12 = 0;
        oh var12_ref = null;
        oh var13 = null;
        int var14 = 0;
        int var15 = 0;
        int stackIn_15_0 = 0;
        oh stackIn_25_0 = null;
        oh stackIn_34_0 = null;
        int stackIn_44_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_91_0 = 0;
        int stackIn_98_0 = 0;
        int stackIn_101_0 = 0;
        oh stackIn_108_0 = null;
        int stackIn_113_0 = 0;
        oh stackIn_116_0 = null;
        int stackIn_118_0 = 0;
        int stackIn_118_1 = 0;
        int stackIn_119_0 = 0;
        int stackIn_119_1 = 0;
        int stackIn_120_0 = 0;
        int stackIn_120_1 = 0;
        int stackIn_120_2 = 0;
        int stackOut_58_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_81_0 = 0;
        int stackOut_90_0 = 0;
        int stackOut_89_0 = 0;
        int stackOut_87_0 = 0;
        int stackOut_85_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        oh stackOut_24_0 = null;
        oh stackOut_23_0 = null;
        oh stackOut_33_0 = null;
        oh stackOut_32_0 = null;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_97_0 = 0;
        int stackOut_96_0 = 0;
        int stackOut_100_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_117_0 = 0;
        int stackOut_117_1 = 0;
        int stackOut_119_0 = 0;
        int stackOut_119_1 = 0;
        int stackOut_119_2 = 0;
        int stackOut_118_0 = 0;
        int stackOut_118_1 = 0;
        int stackOut_118_2 = 0;
        int stackOut_112_0 = 0;
        int stackOut_111_0 = 0;
        oh stackOut_115_0 = null;
        oh stackOut_114_0 = null;
        oh stackOut_107_0 = null;
        oh stackOut_106_0 = null;
        L0: {
          var14 = TetraLink.field_J;
          bd.a(param1, 6);
          ra.c(100, 0, 10, 400, 0);
          ra.c(530, 0, 10, 400, 0);
          ra.c(110, 0, 420, 400, 394880);
          var4 = 31 & dh.field_e >> -17501823;
          if ((var4 ^ -1) > -17) {
            break L0;
          } else {
            var4 = 32 + -var4;
            break L0;
          }
        }
        L1: {
          var4 = (var4 >> -1431759999) + 16;
          if (((ei) this).field_a.field_b == 0) {
            var4 = -var4;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (param2 < -74) {
            break L2;
          } else {
            ((ei) this).e(82);
            break L2;
          }
        }
        L3: {
          if (!cf.a(0, (byte) 119)) {
            var5 = 0;
            L4: while (true) {
              if (7 <= var5) {
                break L3;
              } else {
                var7 = 1 << var5;
                var15 = 0;
                var6 = var15;
                L5: while (true) {
                  if (-7 >= (var15 ^ -1)) {
                    var5++;
                    continue L4;
                  } else {
                    L6: {
                      if (param0) {
                        stackOut_58_0 = 140 + 60 * var5;
                        stackIn_59_0 = stackOut_58_0;
                        break L6;
                      } else {
                        stackOut_57_0 = 500 + -(60 * var5);
                        stackIn_59_0 = stackOut_57_0;
                        break L6;
                      }
                    }
                    L7: {
                      var8 = stackIn_59_0;
                      var9 = 370 - 60 * var15;
                      var10_int = 0;
                      if (-1 != (((ei) this).field_g.field_e[var15] & var7 ^ -1)) {
                        var10_int -= 128;
                        break L7;
                      } else {
                        if (0 != (((ei) this).field_g.field_k[var15] & var7)) {
                          // wide iinc 10 128
                          break L7;
                        } else {
                          L8: {
                            if (!((ei) this).field_b) {
                              break L8;
                            } else {
                              if (null == ((ei) this).field_g.field_d) {
                                break L8;
                              } else {
                                if (((ei) this).field_g.field_d.field_f != var5) {
                                  break L8;
                                } else {
                                  var10_int = var10_int + var4 * 4;
                                  break L7;
                                }
                              }
                            }
                          }
                          if (((ei) this).field_a.field_l) {
                            break L7;
                          } else {
                            L9: {
                              if (!((ei) this).field_b) {
                                break L9;
                              } else {
                                if (((ei) this).field_a.field_b != ((ei) this).field_i) {
                                  break L7;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            if (((ei) this).field_g.field_l == var5) {
                              if (((ei) this).field_g.field_m == var15) {
                                var10_int = var10_int + 3 * var4;
                                break L7;
                              } else {
                                if (((ei) this).field_g.field_m < var15) {
                                  var10_int = var10_int + (var4 * 3 >> 1716960129);
                                  break L7;
                                } else {
                                  break L7;
                                }
                              }
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                    }
                    L10: {
                      if (((ei) this).field_g.field_f == null) {
                        break L10;
                      } else {
                        if (-1 == (var7 & ((ei) this).field_g.field_f[var15])) {
                          break L10;
                        } else {
                          L11: {
                            var11 = ((ei) this).field_j % 20;
                            if (-11 >= var11) {
                              stackOut_82_0 = var11 - 5;
                              stackIn_83_0 = stackOut_82_0;
                              break L11;
                            } else {
                              stackOut_81_0 = -var11 + 5;
                              stackIn_83_0 = stackOut_81_0;
                              break L11;
                            }
                          }
                          var11 = stackIn_83_0;
                          var10_int = var10_int + 10 * var11;
                          break L10;
                        }
                      }
                    }
                    L12: {
                      if (190 >= var10_int) {
                        if (-1 <= var10_int) {
                          if (-256 > (var10_int ^ -1)) {
                            stackOut_90_0 = 16777215;
                            stackIn_91_0 = stackOut_90_0;
                            break L12;
                          } else {
                            stackOut_89_0 = var10_int * 65792 | (var10_int * 40 >> 1436857320) + 191;
                            stackIn_91_0 = stackOut_89_0;
                            break L12;
                          }
                        } else {
                          stackOut_87_0 = -(var10_int * 65535) + 191;
                          stackIn_91_0 = stackOut_87_0;
                          break L12;
                        }
                      } else {
                        stackOut_85_0 = 12517376;
                        stackIn_91_0 = stackOut_85_0;
                        break L12;
                      }
                    }
                    var11 = stackIn_91_0;
                    ra.f(var8, var9, 28, 263172);
                    ra.f(var8, var9, 25, var11);
                    var15++;
                    continue L5;
                  }
                }
              }
            }
          } else {
            var5 = 0;
            L13: while (true) {
              if (7 <= var5) {
                break L3;
              } else {
                var7 = 1 << var5;
                var6 = 0;
                L14: while (true) {
                  if (-7 >= (var6 ^ -1)) {
                    var5++;
                    continue L13;
                  } else {
                    L15: {
                      var9 = -(var6 * 60) + 370;
                      if (!param0) {
                        stackOut_14_0 = 500 - 60 * var5;
                        stackIn_15_0 = stackOut_14_0;
                        break L15;
                      } else {
                        stackOut_13_0 = var5 * 60 + 140;
                        stackIn_15_0 = stackOut_13_0;
                        break L15;
                      }
                    }
                    L16: {
                      var8 = stackIn_15_0;
                      var10_ref = null;
                      var11 = 256;
                      if ((((ei) this).field_g.field_e[var6] & var7) == 0) {
                        if ((((ei) this).field_g.field_k[var6] & var7) == 0) {
                          L17: {
                            if (!((ei) this).field_b) {
                              break L17;
                            } else {
                              if (null == ((ei) this).field_g.field_d) {
                                break L17;
                              } else {
                                if (((ei) this).field_g.field_d.field_f != var5) {
                                  break L17;
                                } else {
                                  L18: {
                                    if (((ei) this).field_a.field_b == 0) {
                                      stackOut_24_0 = me.field_e;
                                      stackIn_25_0 = stackOut_24_0;
                                      break L18;
                                    } else {
                                      stackOut_23_0 = qd.field_X;
                                      stackIn_25_0 = stackOut_23_0;
                                      break L18;
                                    }
                                  }
                                  var10_ref = stackIn_25_0;
                                  var11 = 4 * Math.abs(var4);
                                  break L16;
                                }
                              }
                            }
                          }
                          if (((ei) this).field_a.field_l) {
                            break L16;
                          } else {
                            L19: {
                              if (!((ei) this).field_b) {
                                break L19;
                              } else {
                                if (((ei) this).field_a.field_b != ((ei) this).field_i) {
                                  break L16;
                                } else {
                                  break L19;
                                }
                              }
                            }
                            if (var5 != ((ei) this).field_g.field_l) {
                              break L16;
                            } else {
                              L20: {
                                if (((ei) this).field_a.field_b == 0) {
                                  stackOut_33_0 = me.field_e;
                                  stackIn_34_0 = stackOut_33_0;
                                  break L20;
                                } else {
                                  stackOut_32_0 = qd.field_X;
                                  stackIn_34_0 = stackOut_32_0;
                                  break L20;
                                }
                              }
                              var10_ref = stackIn_34_0;
                              if (((ei) this).field_g.field_m == var6) {
                                var11 = Math.abs(var4) * 4;
                                break L16;
                              } else {
                                if (var6 > ((ei) this).field_g.field_m) {
                                  var11 = 3 * Math.abs(var4) >> 1652489569;
                                  break L16;
                                } else {
                                  break L16;
                                }
                              }
                            }
                          }
                        } else {
                          var10_ref = qd.field_X;
                          break L16;
                        }
                      } else {
                        var10_ref = me.field_e;
                        break L16;
                      }
                    }
                    L21: {
                      if (null == ((ei) this).field_g.field_f) {
                        break L21;
                      } else {
                        if (-1 == (((ei) this).field_g.field_f[var6] & var7 ^ -1)) {
                          break L21;
                        } else {
                          L22: {
                            var12 = ((ei) this).field_j % 20;
                            if (10 < var12) {
                              stackOut_43_0 = 20 - var12;
                              stackIn_44_0 = stackOut_43_0;
                              break L22;
                            } else {
                              stackOut_42_0 = var12;
                              stackIn_44_0 = stackOut_42_0;
                              break L22;
                            }
                          }
                          var12 = stackIn_44_0;
                          var11 = var12 * var11 / 10;
                          break L21;
                        }
                      }
                    }
                    if (var10_ref != null) {
                      if (256 != var11) {
                        var10_ref.a(-28 + var8, var9 + -28, var11);
                        var6++;
                        continue L14;
                      } else {
                        var10_ref.c(-28 + var8, -28 + var9);
                        var6++;
                        continue L14;
                      }
                    } else {
                      ra.f(var8, var9, 28, 263172);
                      ra.f(var8, var9, 25, 191);
                      var6++;
                      continue L14;
                    }
                  }
                }
              }
            }
          }
        }
        var10 = (ej) (Object) ((ei) this).field_g.field_g.c(false);
        L23: while (true) {
          if (var10 == null) {
            this.a((byte) -100);
            fh.a(true);
            return;
          } else {
            L24: {
              if (!param0) {
                stackOut_97_0 = -(60 * var10.field_u) + 500;
                stackIn_98_0 = stackOut_97_0;
                break L24;
              } else {
                stackOut_96_0 = 140 - -(60 * var10.field_u);
                stackIn_98_0 = stackOut_96_0;
                break L24;
              }
            }
            L25: {
              var8 = stackIn_98_0;
              var9 = 370 - var10.field_n * 60;
              if (!var10.field_x) {
                stackOut_100_0 = 16777215;
                stackIn_101_0 = stackOut_100_0;
                break L25;
              } else {
                stackOut_99_0 = 12517376;
                stackIn_101_0 = stackOut_99_0;
                break L25;
              }
            }
            L26: {
              var11 = stackIn_101_0;
              if (var10.field_q == 0) {
                ra.d(var8, 0, var8, var10.field_y, var11);
                break L26;
              } else {
                if (1 == var10.field_q) {
                  hl.a(-8759, 0, 191, var9, var10.field_s, var8 - (var10.field_s >> 921708897), var11);
                  if (!cf.a(0, (byte) 116)) {
                    L27: {
                      stackOut_117_0 = var8;
                      stackOut_117_1 = var9;
                      stackIn_119_0 = stackOut_117_0;
                      stackIn_119_1 = stackOut_117_1;
                      stackIn_118_0 = stackOut_117_0;
                      stackIn_118_1 = stackOut_117_1;
                      if (25 >= var10.field_s) {
                        stackOut_119_0 = stackIn_119_0;
                        stackOut_119_1 = stackIn_119_1;
                        stackOut_119_2 = var10.field_s;
                        stackIn_120_0 = stackOut_119_0;
                        stackIn_120_1 = stackOut_119_1;
                        stackIn_120_2 = stackOut_119_2;
                        break L27;
                      } else {
                        stackOut_118_0 = stackIn_118_0;
                        stackOut_118_1 = stackIn_118_1;
                        stackOut_118_2 = 25;
                        stackIn_120_0 = stackOut_118_0;
                        stackIn_120_1 = stackOut_118_1;
                        stackIn_120_2 = stackOut_118_2;
                        break L27;
                      }
                    }
                    ra.f(stackIn_120_0, stackIn_120_1, stackIn_120_2, var11);
                    break L26;
                  } else {
                    L28: {
                      if ((var10.field_s ^ -1) >= -26) {
                        stackOut_112_0 = var10.field_s;
                        stackIn_113_0 = stackOut_112_0;
                        break L28;
                      } else {
                        stackOut_111_0 = 25;
                        stackIn_113_0 = stackOut_111_0;
                        break L28;
                      }
                    }
                    L29: {
                      var12 = stackIn_113_0;
                      var12 = 56 * var12 / 25;
                      if (!var10.field_x) {
                        stackOut_115_0 = qd.field_X;
                        stackIn_116_0 = stackOut_115_0;
                        break L29;
                      } else {
                        stackOut_114_0 = me.field_e;
                        stackIn_116_0 = stackOut_114_0;
                        break L29;
                      }
                    }
                    var13 = stackIn_116_0;
                    var13.c(var8 + -(var12 >> -174061983), var9 - (var12 >> 537997825), var12, var12);
                    break L26;
                  }
                } else {
                  hl.a(-8759, 0, 191, var10.field_y, var10.field_s, -(var10.field_s >> -981847295) + var8, var11);
                  if (cf.a(0, (byte) 111)) {
                    L30: {
                      if (!var10.field_x) {
                        stackOut_107_0 = qd.field_X;
                        stackIn_108_0 = stackOut_107_0;
                        break L30;
                      } else {
                        stackOut_106_0 = me.field_e;
                        stackIn_108_0 = stackOut_106_0;
                        break L30;
                      }
                    }
                    var12_ref = stackIn_108_0;
                    var12_ref.c(var8 + -28, -28 + var9);
                    break L26;
                  } else {
                    ra.f(var8, var10.field_y, var10.field_s >> -1281798463, var11);
                    ra.f(var8, var9, 25, var11);
                    break L26;
                  }
                }
              }
            }
            var10 = (ej) (Object) ((ei) this).field_g.field_g.a((byte) -70);
            continue L23;
          }
        }
    }

    final static void d(int param0) {
        cl.field_e = true;
        sf.field_d = 0;
        if (param0 != -4210768) {
            ei.d(43);
        }
    }

    final void e(int param0) {
        if (!((ei) this).field_b) {
            ((ei) this).field_a.a(-124);
            ((ei) this).field_g = new l(((ei) this).field_a, ((ei) this).field_i);
            ((ei) this).field_g.c(106);
            ((ei) this).field_d = fl.field_c[((ei) this).field_a.field_d];
            bf discarded$0 = lb.a(bf.field_r, param0 + 573509762);
            sa.a(-64, true);
            ((ei) this).field_r = -1;
            ((ei) this).field_f = -1;
        } else {
            nd.field_Lb.f(61, (byte) -92);
        }
        if (param0 != -1) {
            ((ei) this).field_j = 122;
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        kn.field_e = true;
        String var2 = "tuhstatbut";
        String var3 = "rvnadlm";
        if (param1 != 60) {
            Object var6 = null;
            ei.a((java.applet.Applet) null, -118);
        }
        long var4 = -1L;
        ma.a(var3, var4, param0, 111, var2);
    }

    final void a(boolean param0, byte param1) {
        int var4 = 0;
        wf stackIn_43_0 = null;
        wf stackOut_42_0 = null;
        wf stackOut_41_0 = null;
        L0: {
          var4 = TetraLink.field_J;
          ((ei) this).field_j = ((ei) this).field_j + 1;
          if (!param0) {
            break L0;
          } else {
            if (ak.a(3058)) {
              break L0;
            } else {
              if (cd.field_d.field_c) {
                L1: {
                  if (!sn.field_a[96]) {
                    break L1;
                  } else {
                    ca.a(0.0f, 0.029999999329447746f, -2452);
                    break L1;
                  }
                }
                L2: {
                  if (sn.field_a[97]) {
                    ca.a(0.0f, -0.029999999329447746f, -2452);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (!sn.field_a[98]) {
                    break L3;
                  } else {
                    ca.a(-8.0f, 0.0f, -2452);
                    break L3;
                  }
                }
                if (sn.field_a[99]) {
                  ca.a(8.0f, 0.0f, -2452);
                  break L0;
                } else {
                  break L0;
                }
              } else {
                break L0;
              }
            }
          }
        }
        L4: {
          if (((ei) this).field_b) {
            if (-2 < ((ei) this).field_d) {
              ((ei) this).field_d = ((ei) this).field_d - 1;
              break L4;
            } else {
              break L4;
            }
          } else {
            if (!((ei) this).field_a.field_l) {
              ((ei) this).field_d = ((ei) this).field_d - 1;
              if (-1 != ((ei) this).field_d) {
                break L4;
              } else {
                ((ei) this).a(false);
                break L4;
              }
            } else {
              break L4;
            }
          }
        }
        L5: {
          ((ei) this).field_g.e(88);
          if (((ei) this).field_a.field_l) {
            break L5;
          } else {
            L6: {
              if (((ei) this).field_a.field_b == ((ei) this).field_i) {
                break L6;
              } else {
                if (((ei) this).field_b) {
                  break L5;
                } else {
                  break L6;
                }
              }
            }
            if (-751 >= (((ei) this).field_d ^ -1)) {
              break L5;
            } else {
              if (((ei) this).field_d % 50 == 0) {
                bf discarded$2 = lb.a(sk.field_a, 573509761);
                break L5;
              } else {
                break L5;
              }
            }
          }
        }
        L7: {
          if (((ei) this).field_g.field_f != null) {
            L8: {
              L9: {
                if (0 != ((ei) this).field_g.field_h) {
                  break L9;
                } else {
                  if (((ei) this).field_j % 20 == 9) {
                    break L8;
                  } else {
                    break L9;
                  }
                }
              }
              if (1 != ((ei) this).field_g.field_h) {
                break L7;
              } else {
                if (-20 != (((ei) this).field_j % 20 ^ -1)) {
                  break L7;
                } else {
                  break L8;
                }
              }
            }
            L10: {
              L11: {
                if (!((ei) this).field_b) {
                  break L11;
                } else {
                  if (((ei) this).field_i != ((ei) this).field_g.field_h) {
                    stackOut_42_0 = se.field_c;
                    stackIn_43_0 = stackOut_42_0;
                    break L10;
                  } else {
                    break L11;
                  }
                }
              }
              stackOut_41_0 = ug.field_ib;
              stackIn_43_0 = stackOut_41_0;
              break L10;
            }
            bf discarded$3 = lb.a(stackIn_43_0, 573509761);
            break L7;
          } else {
            break L7;
          }
        }
        if (param1 > 48) {
          L12: {
            if (!((ei) this).field_a.field_l) {
              break L12;
            } else {
              if (!param0) {
                break L12;
              } else {
                if (!cd.field_d.field_c) {
                  break L12;
                } else {
                  if (cl.field_g == 2) {
                    break L12;
                  } else {
                    if (dh.field_e <= ah.field_a - -20) {
                      break L12;
                    } else {
                      L13: while (true) {
                        if ((double)dj.field_h <= 4.71238898038469) {
                          L14: while (true) {
                            if ((double)dj.field_h >= -1.5707963267948966) {
                              cl.field_g = 0;
                              dj.field_h = dj.field_h + 0.004999999888241291f;
                              ti.field_g[0] = (double)rn.field_d * Math.sin((double)dj.field_h);
                              ti.field_g[2] = (double)rn.field_d * Math.cos((double)dj.field_h);
                              eo.a(-103);
                              break L12;
                            } else {
                              dj.field_h = (float)((double)dj.field_h + 6.283185307179586);
                              continue L14;
                            }
                          }
                        } else {
                          dj.field_h = (float)((double)dj.field_h - 6.283185307179586);
                          continue L13;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          this.b(-27);
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, int param1, boolean param2) {
        nd.field_Lb.f(58, (byte) -92);
        nd.field_Lb.a(((ei) this).field_a.field_k, !param2 ? true : false);
        if (!param2) {
            ((ei) this).c(-49);
        }
        nd.field_Lb.a(param1 << -330919741 | param0, !param2 ? true : false);
        if (null != ((ei) this).field_g.field_d) {
        }
        ((ei) this).field_g.field_d = new bi(param1, param0, ((ei) this).field_a.field_k);
    }

    private final void a(byte param0) {
        int var3 = 0;
        String var4 = null;
        de stackIn_15_0 = null;
        String stackIn_15_1 = null;
        int stackIn_15_2 = 0;
        int stackIn_15_3 = 0;
        de stackIn_16_0 = null;
        String stackIn_16_1 = null;
        int stackIn_16_2 = 0;
        int stackIn_16_3 = 0;
        de stackIn_17_0 = null;
        String stackIn_17_1 = null;
        int stackIn_17_2 = 0;
        int stackIn_17_3 = 0;
        int stackIn_17_4 = 0;
        de stackOut_14_0 = null;
        String stackOut_14_1 = null;
        int stackOut_14_2 = 0;
        int stackOut_14_3 = 0;
        de stackOut_16_0 = null;
        String stackOut_16_1 = null;
        int stackOut_16_2 = 0;
        int stackOut_16_3 = 0;
        int stackOut_16_4 = 0;
        de stackOut_15_0 = null;
        String stackOut_15_1 = null;
        int stackOut_15_2 = 0;
        int stackOut_15_3 = 0;
        int stackOut_15_4 = 0;
        var3 = TetraLink.field_J;
        if (param0 == -100) {
          L0: {
            if (!((ei) this).field_a.field_l) {
              if (-1 >= (((ei) this).field_a.field_b ^ -1)) {
                L1: {
                  var4 = sk.a(new String[1], ai.field_f, param0 + 220);
                  if (!((ei) this).field_b) {
                    break L1;
                  } else {
                    if (((ei) this).field_i != ((ei) this).field_a.field_b) {
                      break L1;
                    } else {
                      L2: {
                        stackOut_14_0 = mk.field_b;
                        stackOut_14_1 = a.field_f;
                        stackOut_14_2 = 124;
                        stackOut_14_3 = 30;
                        stackIn_16_0 = stackOut_14_0;
                        stackIn_16_1 = stackOut_14_1;
                        stackIn_16_2 = stackOut_14_2;
                        stackIn_16_3 = stackOut_14_3;
                        stackIn_15_0 = stackOut_14_0;
                        stackIn_15_1 = stackOut_14_1;
                        stackIn_15_2 = stackOut_14_2;
                        stackIn_15_3 = stackOut_14_3;
                        if (-11 < (dh.field_e % 20 ^ -1)) {
                          stackOut_16_0 = (de) (Object) stackIn_16_0;
                          stackOut_16_1 = (String) (Object) stackIn_16_1;
                          stackOut_16_2 = stackIn_16_2;
                          stackOut_16_3 = stackIn_16_3;
                          stackOut_16_4 = 16777215;
                          stackIn_17_0 = stackOut_16_0;
                          stackIn_17_1 = stackOut_16_1;
                          stackIn_17_2 = stackOut_16_2;
                          stackIn_17_3 = stackOut_16_3;
                          stackIn_17_4 = stackOut_16_4;
                          break L2;
                        } else {
                          stackOut_15_0 = (de) (Object) stackIn_15_0;
                          stackOut_15_1 = (String) (Object) stackIn_15_1;
                          stackOut_15_2 = stackIn_15_2;
                          stackOut_15_3 = stackIn_15_3;
                          stackOut_15_4 = 8421599;
                          stackIn_17_0 = stackOut_15_0;
                          stackIn_17_1 = stackOut_15_1;
                          stackIn_17_2 = stackOut_15_2;
                          stackIn_17_3 = stackOut_15_3;
                          stackIn_17_4 = stackOut_15_4;
                          break L2;
                        }
                      }
                      ((de) (Object) stackIn_17_0).b(stackIn_17_1, stackIn_17_2, stackIn_17_3, stackIn_17_4, -1);
                      mk.field_b.c(var4, 516, 30, 16777215, -1);
                      break L0;
                    }
                  }
                }
                mk.field_b.c(sk.a(new String[1], ef.field_l, 119), 516, 30, 16777215, -1);
                mk.field_b.b(var4, 124, 30, 16777215, -1);
                break L0;
              } else {
                break L0;
              }
            } else {
              if (((ei) this).field_a.field_b >= 0) {
                L3: {
                  if (!((ei) this).field_b) {
                    break L3;
                  } else {
                    if (((ei) this).field_a.field_b == ((ei) this).field_i) {
                      mk.field_b.a(mc.field_g, 320, 30, 16777215, -1);
                      break L0;
                    } else {
                      break L3;
                    }
                  }
                }
                mk.field_b.a(sk.a(new String[1], bk.field_b, 119), 320, 30, 16777215, -1);
                break L0;
              } else {
                mk.field_b.a(qm.field_e, 320, 30, 16777215, -1);
                break L0;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    private final void a(boolean param0, oh param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_21_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        L0: {
          var12 = TetraLink.field_J;
          bd.a(param1, 6);
          ra.c(110, 0, 420, 400, 127);
          ra.c(100, 0, 10, 400, 0);
          ra.c(530, 0, 10, 400, 0);
          var4 = (63 & dh.field_e) >> 1086317953;
          if (16 > var4) {
            break L0;
          } else {
            var4 = -var4 + 32;
            break L0;
          }
        }
        L1: {
          if (-1 == (((ei) this).field_a.field_b ^ -1)) {
            stackOut_4_0 = 525052 * var4 + 128;
            stackIn_5_0 = stackOut_4_0;
            break L1;
          } else {
            stackOut_3_0 = 128 - -(526341 * var4);
            stackIn_5_0 = stackOut_3_0;
            break L1;
          }
        }
        L2: {
          var5 = stackIn_5_0;
          if (0 == ((ei) this).field_a.field_b) {
            stackOut_7_0 = 5255152 - (-(328447 * (var4 >> -161816479)) - 128);
            stackIn_8_0 = stackOut_7_0;
            break L2;
          } else {
            stackOut_6_0 = 128 - (-4210768 + -(263173 * (var4 >> -1508110239)));
            stackIn_8_0 = stackOut_6_0;
            break L2;
          }
        }
        var6 = stackIn_8_0;
        var7 = 0;
        L3: while (true) {
          if (7 <= var7) {
            L4: {
              if (param2 > 8) {
                break L4;
              } else {
                ((ei) this).a(118);
                break L4;
              }
            }
            this.a((byte) -100);
            fh.a(true);
            return;
          } else {
            var8 = 0;
            L5: while (true) {
              if (var8 >= 6) {
                var7++;
                continue L3;
              } else {
                L6: {
                  var10 = -(var8 * 60) + 370;
                  if (!param0) {
                    stackOut_14_0 = 500 - var7 * 60;
                    stackIn_15_0 = stackOut_14_0;
                    break L6;
                  } else {
                    stackOut_13_0 = var7 * 60 + 140;
                    stackIn_15_0 = stackOut_13_0;
                    break L6;
                  }
                }
                L7: {
                  var9 = stackIn_15_0;
                  ra.f(var9, var10, 28, 263172);
                  if (!((ei) this).field_b) {
                    break L7;
                  } else {
                    if (((ei) this).field_g.field_d == null) {
                      break L7;
                    } else {
                      if (((ei) this).field_g.field_d.field_f != var7) {
                        break L7;
                      } else {
                        L8: {
                          if (((ei) this).field_a.field_b == 0) {
                            stackOut_20_0 = 128 - -((8 - -(var4 >> -703754143)) * 525052);
                            stackIn_21_0 = stackOut_20_0;
                            break L8;
                          } else {
                            stackOut_19_0 = 4210728 + 526341 * (var4 >> 842023713) + 128;
                            stackIn_21_0 = stackOut_19_0;
                            break L8;
                          }
                        }
                        var11 = stackIn_21_0;
                        if (((((ei) this).field_g.field_k[var8] | ((ei) this).field_g.field_e[var8]) & 1 << var7) == 0) {
                          ra.f(var9, var10, 25, var11);
                          var8++;
                          continue L5;
                        } else {
                          ra.f(var9, var10, 25, 0);
                          var8++;
                          continue L5;
                        }
                      }
                    }
                  }
                }
                L9: {
                  if (((ei) this).field_a.field_l) {
                    break L9;
                  } else {
                    L10: {
                      if (!((ei) this).field_b) {
                        break L10;
                      } else {
                        if (((ei) this).field_a.field_b != ((ei) this).field_i) {
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                    if (((ei) this).field_g.field_l != var7) {
                      break L9;
                    } else {
                      if (((ei) this).field_g.field_m != var8) {
                        if (((ei) this).field_g.field_m < var8) {
                          ra.f(var9, var10, 25, var6);
                          var8++;
                          continue L5;
                        } else {
                          ra.f(var9, var10, 25, 0);
                          var8++;
                          continue L5;
                        }
                      } else {
                        ra.f(var9, var10, 25, var5);
                        var8++;
                        continue L5;
                      }
                    }
                  }
                }
                ra.f(var9, var10, 25, 0);
                var8++;
                continue L5;
              }
            }
          }
        }
    }

    final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = TetraLink.field_J;
        if (13 == dg.field_e) {
          var2 = 2;
          if (((ei) this).field_b) {
            L0: {
              if (-1 < (((ei) this).field_i ^ -1)) {
                var2 = 5;
                break L0;
              } else {
                if (!((ei) this).field_a.field_l) {
                  var2 = 3;
                  break L0;
                } else {
                  var2 = 4;
                  break L0;
                }
              }
            }
            bf discarded$5 = lb.a(e.field_c, 573509761);
            ((ei) this).a(true, -128, false, var2);
            return;
          } else {
            bf discarded$6 = lb.a(e.field_c, 573509761);
            ((ei) this).a(true, -128, false, var2);
            return;
          }
        } else {
          L1: {
            if (param0 > 59) {
              break L1;
            } else {
              ((ei) this).a(51);
              break L1;
            }
          }
          return;
        }
    }

    final static void b(byte param0) {
        if (!bh.field_r) {
            throw new IllegalStateException();
        }
        k.field_c = true;
        if (param0 > -118) {
            String discarded$0 = ei.a((byte) -125, -44L);
        }
        ck.a((byte) 126, true);
        fn.field_R = 0;
    }

    private final void a(int param0, int param1, int param2) {
        if (param1 != -15682) {
            return;
        }
        ((ei) this).field_a.a(param2, param0, ((ei) this).field_a.field_b, -28067);
        ((ei) this).field_g.a((byte) 56);
        if (((ei) this).field_a.e(2)) {
            if (1 != (((ei) this).field_i ^ -1)) {
                ((ei) this).a(false, -110, false, -1);
            }
            ((ei) this).field_p = 0;
        } else {
            ((ei) this).field_a.a(true);
            ((ei) this).field_d = fl.field_c[((ei) this).field_a.field_d];
        }
    }

    final void a(int param0) {
        if (!((ei) this).field_b) {
            throw new IllegalStateException();
        }
        if (param0 != 0) {
            ((ei) this).field_m = 46;
        }
        nd.field_Lb.f(59, (byte) -92);
    }

    final void a(boolean param0, boolean param1) {
        if (!(((ei) this).field_b)) {
            ((ei) this).a(false, -120, param1, 0);
        }
        if (!param0) {
            ((ei) this).field_m = 18;
        }
    }

    ei(boolean param0, int param1, String[] param2, int param3, boolean param4) {
        ((ei) this).field_i = param3;
        ((ei) this).field_b = param0 ? true : false;
        ((ei) this).field_c = param4 ? true : false;
        ((ei) this).field_a = new em(param1, param2, -1);
        if (!((ei) this).field_b) {
            ((ei) this).field_a.a(0, 18936, 0);
            ((ei) this).field_d = fl.field_c[((ei) this).field_a.field_d];
        }
        ((ei) this).field_g = new l(((ei) this).field_a, ((ei) this).field_i);
        ((ei) this).field_j = 0;
        ((ei) this).field_f = -1;
        ((ei) this).field_n = true;
        ((ei) this).field_k = 0;
        ((ei) this).field_r = -1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Hint: to start quickly, choose 'Don't mind' for as many options as you can!";
        field_e = "Create a free account to";
        field_h = "This password is part of your Player Name, and would be easy to guess";
    }
}
