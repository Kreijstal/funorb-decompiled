/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

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
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11_int = 0;
        oh var11 = null;
        int var12 = 0;
        int var13 = 0;
        int stackIn_11_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_65_0 = 0;
        oh stackIn_72_0 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_38_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_63_0 = 0;
        oh stackOut_71_0 = null;
        oh stackOut_70_0 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        var12 = TetraLink.field_J;
        try {
          L0: {
            bd.a(param2, 6);
            ra.c(100, 0, 10, 400, 0);
            ra.c(530, 0, 10, 400, 0);
            ra.c(110, 0, 420, 400, 191);
            if (param1 == 651) {
              L1: {
                if (cf.a(0, (byte) 109)) {
                  var4_int = 0;
                  L2: while (true) {
                    if (var4_int >= 7) {
                      break L1;
                    } else {
                      var6 = 1 << var4_int;
                      var13 = 0;
                      var5 = var13;
                      L3: while (true) {
                        if (var13 >= 6) {
                          var4_int++;
                          continue L2;
                        } else {
                          L4: {
                            if (param0) {
                              stackOut_38_0 = 140 - -(var4_int * 60);
                              stackIn_39_0 = stackOut_38_0;
                              break L4;
                            } else {
                              stackOut_37_0 = 500 - 60 * var4_int;
                              stackIn_39_0 = stackOut_37_0;
                              break L4;
                            }
                          }
                          L5: {
                            var7 = stackIn_39_0;
                            var8 = -(var13 * 60) + 370;
                            var9 = null;
                            if (0 != (var6 & this.field_g.field_e[var13])) {
                              var9 = me.field_e;
                              break L5;
                            } else {
                              if (0 == (this.field_g.field_k[var13] & var6)) {
                                break L5;
                              } else {
                                var9 = qd.field_X;
                                break L5;
                              }
                            }
                          }
                          L6: {
                            if (var9 != null) {
                              L7: {
                                var10 = 256;
                                if (this.field_g.field_f != null) {
                                  if (0 == (this.field_g.field_f[var13] & var6)) {
                                    break L7;
                                  } else {
                                    L8: {
                                      var11_int = this.field_j % 20;
                                      if (10 >= var11_int) {
                                        stackOut_50_0 = var11_int - 5;
                                        stackIn_51_0 = stackOut_50_0;
                                        break L8;
                                      } else {
                                        stackOut_49_0 = -var11_int + 15;
                                        stackIn_51_0 = stackOut_49_0;
                                        break L8;
                                      }
                                    }
                                    var11_int = stackIn_51_0;
                                    var10 = 128 + var11_int * 20;
                                    break L7;
                                  }
                                } else {
                                  break L7;
                                }
                              }
                              if (var10 == 256) {
                                ((oh) (var9)).c(-28 + var7, -28 + var8);
                                break L6;
                              } else {
                                ((oh) (var9)).a(var7 - 28, -28 + var8, var10);
                                break L6;
                              }
                            } else {
                              break L6;
                            }
                          }
                          var13++;
                          continue L3;
                        }
                      }
                    }
                  }
                } else {
                  var4_int = 0;
                  L9: while (true) {
                    if (-8 >= (var4_int ^ -1)) {
                      break L1;
                    } else {
                      var6 = 1 << var4_int;
                      var5 = 0;
                      L10: while (true) {
                        if ((var5 ^ -1) <= -7) {
                          var4_int++;
                          continue L9;
                        } else {
                          L11: {
                            var8 = -(60 * var5) + 370;
                            if (param0) {
                              stackOut_10_0 = 140 - -(60 * var4_int);
                              stackIn_11_0 = stackOut_10_0;
                              break L11;
                            } else {
                              stackOut_9_0 = 500 - var4_int * 60;
                              stackIn_11_0 = stackOut_9_0;
                              break L11;
                            }
                          }
                          L12: {
                            var7 = stackIn_11_0;
                            var9_int = 0;
                            if ((this.field_g.field_e[var5] & var6) != 0) {
                              var9_int -= 128;
                              break L12;
                            } else {
                              if ((var6 & this.field_g.field_k[var5]) != 0) {
                                var9_int += 128;
                                break L12;
                              } else {
                                break L12;
                              }
                            }
                          }
                          L13: {
                            if (null == this.field_g.field_f) {
                              break L13;
                            } else {
                              if ((this.field_g.field_f[var5] & var6) != 0) {
                                L14: {
                                  var10 = this.field_j % 20;
                                  if (10 >= var10) {
                                    stackOut_21_0 = -5 + var10;
                                    stackIn_22_0 = stackOut_21_0;
                                    break L14;
                                  } else {
                                    stackOut_20_0 = 5 + -var10;
                                    stackIn_22_0 = stackOut_20_0;
                                    break L14;
                                  }
                                }
                                var10 = stackIn_22_0;
                                var9_int = var9_int + 10 * var10;
                                break L13;
                              } else {
                                break L13;
                              }
                            }
                          }
                          L15: {
                            if ((var9_int ^ -1) <= 190) {
                              if (var9_int >= 0) {
                                if ((var9_int ^ -1) < -256) {
                                  stackOut_29_0 = 16777215;
                                  stackIn_30_0 = stackOut_29_0;
                                  break L15;
                                } else {
                                  stackOut_28_0 = (var9_int * 40 >> 1189172840) - -191 | var9_int * 65792;
                                  stackIn_30_0 = stackOut_28_0;
                                  break L15;
                                }
                              } else {
                                stackOut_26_0 = -(65535 * var9_int) + 191;
                                stackIn_30_0 = stackOut_26_0;
                                break L15;
                              }
                            } else {
                              stackOut_24_0 = 12517376;
                              stackIn_30_0 = stackOut_24_0;
                              break L15;
                            }
                          }
                          var10 = stackIn_30_0;
                          ra.f(var7, var8, 28, var10);
                          var5++;
                          continue L10;
                        }
                      }
                    }
                  }
                }
              }
              var9 = (ej) ((Object) this.field_g.field_g.c(false));
              L16: while (true) {
                if (var9 == null) {
                  fh.a(true);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L17: {
                    var8 = -(60 * ((ej) (var9)).field_n) + 370;
                    if (!param0) {
                      stackOut_61_0 = -(60 * ((ej) (var9)).field_u) + 500;
                      stackIn_62_0 = stackOut_61_0;
                      break L17;
                    } else {
                      stackOut_60_0 = 140 - -(((ej) (var9)).field_u * 60);
                      stackIn_62_0 = stackOut_60_0;
                      break L17;
                    }
                  }
                  L18: {
                    var7 = stackIn_62_0;
                    if (!((ej) (var9)).field_x) {
                      stackOut_64_0 = 16777215;
                      stackIn_65_0 = stackOut_64_0;
                      break L18;
                    } else {
                      stackOut_63_0 = 12517376;
                      stackIn_65_0 = stackOut_63_0;
                      break L18;
                    }
                  }
                  L19: {
                    var10 = stackIn_65_0;
                    if (((ej) (var9)).field_q == 0) {
                      ra.d(var7, 0, var7, ((ej) (var9)).field_y, var10);
                      break L19;
                    } else {
                      if (-2 != (((ej) (var9)).field_q ^ -1)) {
                        ra.c(-(((ej) (var9)).field_s >> -449738751) + var7, 0, ((ej) (var9)).field_s, ((ej) (var9)).field_y, var10);
                        ra.f(var7, ((ej) (var9)).field_y, ((ej) (var9)).field_s >> -897082495, var10);
                        if (!cf.a(0, (byte) 119)) {
                          ra.f(var7, var8, 28, var10);
                          break L19;
                        } else {
                          L20: {
                            if (!((ej) (var9)).field_x) {
                              stackOut_71_0 = qd.field_X;
                              stackIn_72_0 = stackOut_71_0;
                              break L20;
                            } else {
                              stackOut_70_0 = me.field_e;
                              stackIn_72_0 = stackOut_70_0;
                              break L20;
                            }
                          }
                          var11 = stackIn_72_0;
                          var11.c(-28 + var7, -28 + var8);
                          break L19;
                        }
                      } else {
                        ra.c(var7 + -(((ej) (var9)).field_s >> -78946303), 0, ((ej) (var9)).field_s, var8, var10);
                        ra.f(var7, var8, ((ej) (var9)).field_s, var10);
                        break L19;
                      }
                    }
                  }
                  var9 = (ej) ((Object) this.field_g.field_g.a((byte) -70));
                  continue L16;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L21: {
            var4 = decompiledCaughtException;
            stackOut_78_0 = (RuntimeException) (var4);
            stackOut_78_1 = new StringBuilder().append("ei.S(").append(param0).append(',').append(param1).append(',');
            stackIn_80_0 = stackOut_78_0;
            stackIn_80_1 = stackOut_78_1;
            stackIn_79_0 = stackOut_78_0;
            stackIn_79_1 = stackOut_78_1;
            if (param2 == null) {
              stackOut_80_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackOut_80_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackOut_80_2 = "null";
              stackIn_81_0 = stackOut_80_0;
              stackIn_81_1 = stackOut_80_1;
              stackIn_81_2 = stackOut_80_2;
              break L21;
            } else {
              stackOut_79_0 = (RuntimeException) ((Object) stackIn_79_0);
              stackOut_79_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackOut_79_2 = "{...}";
              stackIn_81_0 = stackOut_79_0;
              stackIn_81_1 = stackOut_79_1;
              stackIn_81_2 = stackOut_79_2;
              break L21;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_81_0), stackIn_81_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, boolean param1) {
        int var3 = 0;
        String var3_ref_String = null;
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
          if (0 != this.field_a.field_b) {
            if (this.field_a.field_b != 1) {
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
          if (!this.field_a.field_l) {
            var12 = Integer.toString((49 + this.field_d) / 50);
            mk.field_b.a(var12, 30, mk.field_b.field_N + 54 >> 1572420481, 16777215, -1);
            break L1;
          } else {
            if (-1 != this.field_a.field_b) {
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
            field_h = (String) null;
            break L2;
          }
        }
        L3: while (true) {
          if (-5 >= (var3 ^ -1)) {
            L4: {
              if (!this.field_a.field_l) {
                break L4;
              } else {
                if ((kb.field_t ^ -1) != 0) {
                  break L4;
                } else {
                  if (0 != (ed.field_O ^ -1)) {
                    break L4;
                  } else {
                    L5: {
                      if (this.field_a.field_b != -1) {
                        L6: {
                          if (!this.field_b) {
                            break L6;
                          } else {
                            if (this.field_i != this.field_a.field_b) {
                              break L6;
                            } else {
                              var3_ref_String = mc.field_g;
                              break L5;
                            }
                          }
                        }
                        var3_ref_String = sk.a(new String[]{this.field_a.field_o[this.field_a.field_b]}, bk.field_b, param0 + 9223);
                        break L5;
                      } else {
                        var3_ref_String = qm.field_e;
                        break L5;
                      }
                    }
                    var4 = mk.field_b.b(var3_ref_String) / 2;
                    var4 += 20;
                    var5 = md.field_G;
                    var6 = ik.field_a;
                    var7 = (int)(24.0 * (Math.cos((double)((float)dh.field_e / 20.0f)) + 1.0));
                    var8 = 0;
                    L7: while (true) {
                      if (9 <= var8) {
                        mk.field_b.a(var3_ref_String, var5, mk.field_b.field_N / 2 + var6 + -2, 16777215, -1);
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
              if (!this.field_b) {
                break L8;
              } else {
                L9: {
                  L10: {
                    var3 = go.field_g.b(da.field_i) + 6 - -2;
                    cn.field_g = cn.field_g + (-cn.field_g + (float)var3) * 0.10000000149011612f;
                    if (1 != (this.field_l ^ -1)) {
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
                if (var3 == this.field_f) {
                  break L17;
                } else {
                  if (this.field_r != var3) {
                    break L16;
                  } else {
                    break L17;
                  }
                }
              }
              if (0 == (kb.field_t ^ -1)) {
                L18: {
                  if (this.field_l == var3) {
                    var4 = 128;
                    break L18;
                  } else {
                    break L18;
                  }
                }
                if (dh.field_e % 40 >= 20) {
                  break L16;
                } else {
                  if (this.field_a.field_l) {
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
            field_o = (String) null;
        }
        field_h = null;
    }

    final void a(boolean param0, oh param1, boolean param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.b(param0, param1, (byte) -104);
              if (!param2) {
                break L1;
              } else {
                this.e(69);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("ei.U(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param2 + ')');
        }
    }

    final void a(int param0, oh param1, oh param2, boolean param3) {
        try {
            this.a(param3, 651, param2);
            if (param0 != 2509) {
                this.field_m = -104;
            }
            this.a(param3, param1, (byte) 57);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "ei.BA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final void a(double param0, boolean param1, double param2, boolean param3, byte param4, boolean param5, int param6, int param7) {
        bf discarded$2 = null;
        bf discarded$3 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        java.applet.Applet var14 = null;
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
                      this.field_l = a.field_a / 18;
                      if (638 - ((int)pm.field_c - a.field_a / 2) > aa.field_Nb) {
                        this.field_l = -1;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (!this.field_b) {
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
                            this.field_l = -2;
                            break L1;
                          }
                        }
                      }
                    }
                  }
                } else {
                  L3: {
                    if (param3) {
                      this.field_l = li.field_o / 18;
                      if (ci.field_B >= li.field_o / 2 + 638 + -(int)pm.field_c) {
                        break L3;
                      } else {
                        this.field_l = -1;
                        break L3;
                      }
                    } else {
                      this.field_l = -1;
                      break L3;
                    }
                  }
                  L4: {
                    if (!this.field_b) {
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
                            this.field_l = -2;
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  if (this.field_l == -1) {
                    break L1;
                  } else {
                    if (this.field_f != this.field_l) {
                      if (this.field_r != this.field_l) {
                        if (-2 != this.field_l) {
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
                        if (!this.field_b) {
                          vf.a(true, 9, false);
                          break L1;
                        } else {
                          vf.a(true, 12, false);
                          break L1;
                        }
                      }
                    } else {
                      if (!this.field_a.field_l) {
                        this.a(0);
                        break L1;
                      } else {
                        this.e(-1);
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
                  var14 = (java.applet.Applet) null;
                  ei.a((java.applet.Applet) null, 103);
                  break L6;
                }
              }
              L7: {
                L8: {
                  if (-1 != this.field_l) {
                    break L8;
                  } else {
                    if (!param3) {
                      break L8;
                    } else {
                      if (this.field_a.field_l) {
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
                                  var12 = this.field_a.a(var11, (byte) 101);
                                  if (!this.field_a.b(var12, var11, -123)) {
                                    discarded$2 = lb.a(io.field_c, param4 + 573509876);
                                    break L7;
                                  } else {
                                    if (!this.field_b) {
                                      this.a(var11, param4 ^ 15667, var12);
                                      this.field_n = false;
                                      break L7;
                                    } else {
                                      if (this.field_i != this.field_a.field_b) {
                                        break L7;
                                      } else {
                                        this.a(var11, var12, true);
                                        this.field_n = false;
                                        break L7;
                                      }
                                    }
                                  }
                                } else {
                                  L10: {
                                    if (this.field_g.field_l == var11) {
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
                                  this.field_g.a(var11, (byte) -96);
                                  if (var12 == 0) {
                                    break L7;
                                  } else {
                                    if (this.field_g.field_l == -1) {
                                      break L7;
                                    } else {
                                      discarded$3 = lb.a(bo.field_A, 573509761);
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
                this.field_g.field_l = -1;
                break L7;
              }
              return;
            } else {
              break L0;
            }
          }
        }
        this.field_g.field_l = -1;
        this.field_l = -1;
    }

    final static void a(int param0, fj param1) {
        int dupTemp$4 = 0;
        int fieldTemp$5 = 0;
        int incrementValue$6 = 0;
        int dupTemp$7 = 0;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var5 = TetraLink.field_J;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= 3) {
                if (param0 == -2792) {
                  var2_int = 0;
                  L2: while (true) {
                    if (pl.field_d <= var2_int) {
                      dupTemp$4 = param1.a((byte) -63);
                      uf.field_c[dupTemp$4] = uf.field_c[dupTemp$4] + 1;
                      var2_int = 0;
                      var3 = 0;
                      L3: while (true) {
                        if (pl.field_d <= var3) {
                          pl.field_d = var2_int;
                          fieldTemp$5 = pl.field_d;
                          pl.field_d = pl.field_d + 1;
                          n.field_L[fieldTemp$5] = param1;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          L4: {
                            L5: {
                              if (n.field_L[var3].field_i != param1.field_i) {
                                break L5;
                              } else {
                                var4 = n.field_L[var3].a((byte) -63);
                                if (fh.field_a >= uf.field_c[var4]) {
                                  break L5;
                                } else {
                                  uf.field_c[var4] = uf.field_c[var4] - 1;
                                  break L4;
                                }
                              }
                            }
                            incrementValue$6 = var2_int;
                            var2_int++;
                            n.field_L[incrementValue$6] = n.field_L[var3];
                            break L4;
                          }
                          var3++;
                          continue L3;
                        }
                      }
                    } else {
                      L6: {
                        if (n.field_L[var2_int].field_i == param1.field_i) {
                          dupTemp$7 = n.field_L[var2_int].a((byte) -63);
                          uf.field_c[dupTemp$7] = uf.field_c[dupTemp$7] + 1;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var2_int++;
                      continue L2;
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                uf.field_c[var2_int] = 0;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var2);
            stackOut_21_1 = new StringBuilder().append("ei.A(").append(param0).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void b(int param0) {
        int fieldTemp$5 = 0;
        int discarded$6 = 0;
        int fieldTemp$7 = 0;
        int fieldTemp$8 = 0;
        int fieldTemp$9 = 0;
        String var2_ref_String = null;
        int var2 = 0;
        String var3_ref_String = null;
        int var3 = 0;
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
          if (this.field_a.field_l) {
            if (0 <= this.field_a.field_b) {
              L1: {
                if (!this.field_b) {
                  break L1;
                } else {
                  if (this.field_i != this.field_a.field_b) {
                    break L1;
                  } else {
                    hg.field_e = mc.field_g;
                    break L0;
                  }
                }
              }
              hg.field_e = sk.a(new String[]{this.field_a.field_o[this.field_a.field_b]}, bk.field_b, 120);
              break L0;
            } else {
              hg.field_e = qm.field_e;
              break L0;
            }
          } else {
            if (-1 < (this.field_a.field_b ^ -1)) {
              hg.field_e = "";
              break L0;
            } else {
              var2_ref_String = Integer.toString((-1 + (50 + this.field_d)) / 50);
              if (!this.field_b) {
                hg.field_e = sk.a(new String[]{this.field_a.field_o[this.field_a.field_b], var2_ref_String}, ef.field_o, 119);
                break L0;
              } else {
                L2: {
                  if (this.field_a.field_b == 0) {
                    stackOut_5_0 = bh.field_s;
                    stackIn_6_0 = stackOut_5_0;
                    break L2;
                  } else {
                    stackOut_4_0 = ek.field_t;
                    stackIn_6_0 = stackOut_4_0;
                    break L2;
                  }
                }
                var3_ref_String = stackIn_6_0;
                if (this.field_i != this.field_a.field_b) {
                  hg.field_e = sk.a(new String[]{var3_ref_String, var2_ref_String, this.field_a.field_o[this.field_a.field_b]}, ld.field_M, 123);
                  break L0;
                } else {
                  hg.field_e = sk.a(new String[]{var3_ref_String, var2_ref_String}, qj.field_e, param0 ^ -102);
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
            if (!hg.field_e.equals(vg.field_Kb)) {
              fieldTemp$5 = ce.field_b + 8;
              ce.field_b = ce.field_b + 8;
              if ((fieldTemp$5 ^ -1) <= -257) {
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
            discarded$6 = go.field_g.b(hg.field_e);
            if (!this.field_n) {
              break L6;
            } else {
              L7: {
                if (!this.field_b) {
                  break L7;
                } else {
                  if (this.field_i != this.field_a.field_b) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              fieldTemp$7 = this.field_k + 1;
              this.field_k = this.field_k + 1;
              if ((fieldTemp$7 ^ -1) >= -29) {
                break L5;
              } else {
                this.field_k = 28;
                break L5;
              }
            }
          }
          fieldTemp$8 = this.field_k - 1;
          this.field_k = this.field_k - 1;
          if (fieldTemp$8 >= 0) {
            break L5;
          } else {
            this.field_k = 0;
            break L5;
          }
        }
        L8: {
          if (!this.field_b) {
            na.field_n[2] = null;
            na.field_n[3] = null;
            if (!this.field_a.field_l) {
              na.field_n[0] = null;
              na.field_n[1] = null;
              break L8;
            } else {
              na.field_n[1] = ed.field_P;
              this.field_f = 0;
              this.field_r = 1;
              na.field_n[0] = qk.field_a;
              break L8;
            }
          } else {
            var2 = 0;
            L9: while (true) {
              if (var2 >= 2) {
                if (this.field_i == -2) {
                  this.field_r = 3;
                  na.field_n[3] = ed.field_P;
                  na.field_n[2] = null;
                  this.field_f = -1;
                  break L8;
                } else {
                  if (!this.field_a.field_l) {
                    L10: {
                      this.field_f = 2;
                      this.field_r = -1;
                      if ((1 << this.field_i & this.field_a.field_h) == 0) {
                        if (-1 == (this.field_a.field_h ^ -1)) {
                          na.field_n[2] = null;
                          this.field_f = -1;
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
                    this.field_f = 2;
                    na.field_n[3] = ed.field_P;
                    this.field_r = 3;
                    if (this.field_m == 0) {
                      if ((1 << this.field_i & this.field_a.field_n) != 0) {
                        L11: {
                          stackOut_83_0 = na.field_n;
                          stackOut_83_1 = 2;
                          stackIn_85_0 = stackOut_83_0;
                          stackIn_85_1 = stackOut_83_1;
                          stackIn_84_0 = stackOut_83_0;
                          stackIn_84_1 = stackOut_83_1;
                          if (!this.field_c) {
                            stackOut_85_0 = (String[]) ((Object) stackIn_85_0);
                            stackOut_85_1 = stackIn_85_1;
                            stackOut_85_2 = co.field_s;
                            stackIn_86_0 = stackOut_85_0;
                            stackIn_86_1 = stackOut_85_1;
                            stackIn_86_2 = stackOut_85_2;
                            break L11;
                          } else {
                            stackOut_84_0 = (String[]) ((Object) stackIn_84_0);
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
                        if (0 != this.field_a.field_n) {
                          L12: {
                            stackOut_79_0 = na.field_n;
                            stackOut_79_1 = 2;
                            stackIn_81_0 = stackOut_79_0;
                            stackIn_81_1 = stackOut_79_1;
                            stackIn_80_0 = stackOut_79_0;
                            stackIn_80_1 = stackOut_79_1;
                            if (this.field_c) {
                              stackOut_81_0 = (String[]) ((Object) stackIn_81_0);
                              stackOut_81_1 = stackIn_81_1;
                              stackOut_81_2 = ce.field_c;
                              stackIn_82_0 = stackOut_81_0;
                              stackIn_82_1 = stackOut_81_1;
                              stackIn_82_2 = stackOut_81_2;
                              break L12;
                            } else {
                              stackOut_80_0 = (String[]) ((Object) stackIn_80_0);
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
                            if (this.field_c) {
                              stackOut_77_0 = (String[]) ((Object) stackIn_77_0);
                              stackOut_77_1 = stackIn_77_1;
                              stackOut_77_2 = lh.field_r;
                              stackIn_78_0 = stackOut_77_0;
                              stackIn_78_1 = stackOut_77_1;
                              stackIn_78_2 = stackOut_77_2;
                              break L13;
                            } else {
                              stackOut_76_0 = (String[]) ((Object) stackIn_76_0);
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
                      this.field_f = -1;
                      na.field_n[2] = null;
                      break L8;
                    }
                  }
                }
              } else {
                if (this.field_i == var2) {
                  if ((1 << var2 & this.field_a.field_j) == 0) {
                    L14: {
                      if (this.field_a.field_l) {
                        break L14;
                      } else {
                        if ((1 << var2 & this.field_a.field_h) == 0) {
                          break L14;
                        } else {
                          na.field_n[var2] = bk.field_g;
                          var2++;
                          continue L9;
                        }
                      }
                    }
                    if ((1 << var2 & this.field_a.field_n) != 0) {
                      L15: {
                        stackOut_65_0 = na.field_n;
                        stackOut_65_1 = var2;
                        stackIn_67_0 = stackOut_65_0;
                        stackIn_67_1 = stackOut_65_1;
                        stackIn_66_0 = stackOut_65_0;
                        stackIn_66_1 = stackOut_65_1;
                        if (this.field_c) {
                          stackOut_67_0 = (String[]) ((Object) stackIn_67_0);
                          stackOut_67_1 = stackIn_67_1;
                          stackOut_67_2 = oi.field_i;
                          stackIn_68_0 = stackOut_67_0;
                          stackIn_68_1 = stackOut_67_1;
                          stackIn_68_2 = stackOut_67_2;
                          break L15;
                        } else {
                          stackOut_66_0 = (String[]) ((Object) stackIn_66_0);
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
                    if (0 == (this.field_a.field_n & 1 << var2)) {
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
                  var3_ref_String = this.field_a.field_o[var2];
                  if (0 != (this.field_a.field_j & 1 << var2)) {
                    if ((this.field_m & 1 << var2) == 0) {
                      if ((this.field_a.field_n & 1 << var2) == 0) {
                        na.field_n[var2] = sk.a(new String[]{var3_ref_String}, eg.field_M, 120);
                        var2++;
                        continue L9;
                      } else {
                        na.field_n[var2] = sk.a(new String[]{var3_ref_String}, dg.field_d, 123);
                        var2++;
                        continue L9;
                      }
                    } else {
                      na.field_n[var2] = sk.a(new String[]{var3_ref_String}, tk.field_f, param0 + 153);
                      var2++;
                      continue L9;
                    }
                  } else {
                    if ((this.field_m & 1 << var2) != 0) {
                      na.field_n[var2] = sk.a(new String[]{var3_ref_String}, jl.field_d, 119);
                      var2++;
                      continue L9;
                    } else {
                      L16: {
                        if (this.field_a.field_l) {
                          break L16;
                        } else {
                          if ((this.field_a.field_h & 1 << var2) == 0) {
                            break L16;
                          } else {
                            na.field_n[var2] = sk.a(new String[]{var3_ref_String}, bc.field_v, 125);
                            var2++;
                            continue L9;
                          }
                        }
                      }
                      if ((this.field_a.field_n & 1 << var2) != 0) {
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
                          if (this.field_c) {
                            stackOut_48_0 = (String[]) ((Object) stackIn_48_0);
                            stackOut_48_1 = stackIn_48_1;
                            stackOut_48_2 = (String[]) ((Object) stackIn_48_2);
                            stackOut_48_3 = fn.field_P;
                            stackIn_49_0 = stackOut_48_0;
                            stackIn_49_1 = stackOut_48_1;
                            stackIn_49_2 = stackOut_48_2;
                            stackIn_49_3 = stackOut_48_3;
                            break L17;
                          } else {
                            stackOut_47_0 = (String[]) ((Object) stackIn_47_0);
                            stackOut_47_1 = stackIn_47_1;
                            stackOut_47_2 = (String[]) ((Object) stackIn_47_2);
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
                    this.field_i = 126;
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
                          if (!this.field_a.field_l) {
                            break L23;
                          } else {
                            fieldTemp$9 = this.field_p + 1;
                            this.field_p = this.field_p + 1;
                            if (fieldTemp$9 > 150) {
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
                              da.field_i = sk.a(new String[]{Integer.toString(lb.field_R)}, w.field_q, param0 + 149);
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
                          if (!na.field_n[var3].equals(na.field_p[var3])) {
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
                  if (var3 == this.field_f) {
                    this.field_f = var2;
                    break L27;
                  } else {
                    break L27;
                  }
                }
                if (var3 == this.field_r) {
                  this.field_r = var2;
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
            return (String) null;
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
            field_q = (hl) null;
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
            field_h = (String) null;
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
            this.a(false, false);
            break L0;
          }
        }
        L1: {
          if (!this.field_b) {
            if (this.field_a.field_b == 0) {
              this.field_a.a(1, 4);
              break L1;
            } else {
              if (this.field_a.field_b == 1) {
                this.field_a.a(0, 4);
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
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        oh var12_ref_oh = null;
        oh var13 = null;
        int var14 = 0;
        int var15 = 0;
        int stackIn_16_0 = 0;
        oh stackIn_26_0 = null;
        oh stackIn_35_0 = null;
        int stackIn_45_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_92_0 = 0;
        int stackIn_99_0 = 0;
        int stackIn_102_0 = 0;
        oh stackIn_109_0 = null;
        int stackIn_114_0 = 0;
        oh stackIn_117_0 = null;
        int stackIn_119_0 = 0;
        int stackIn_119_1 = 0;
        int stackIn_120_0 = 0;
        int stackIn_120_1 = 0;
        int stackIn_121_0 = 0;
        int stackIn_121_1 = 0;
        int stackIn_121_2 = 0;
        RuntimeException stackIn_127_0 = null;
        StringBuilder stackIn_127_1 = null;
        RuntimeException stackIn_128_0 = null;
        StringBuilder stackIn_128_1 = null;
        RuntimeException stackIn_129_0 = null;
        StringBuilder stackIn_129_1 = null;
        String stackIn_129_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_59_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_83_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_91_0 = 0;
        int stackOut_90_0 = 0;
        int stackOut_88_0 = 0;
        int stackOut_86_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        oh stackOut_25_0 = null;
        oh stackOut_24_0 = null;
        oh stackOut_34_0 = null;
        oh stackOut_33_0 = null;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_97_0 = 0;
        int stackOut_101_0 = 0;
        int stackOut_100_0 = 0;
        int stackOut_118_0 = 0;
        int stackOut_118_1 = 0;
        int stackOut_120_0 = 0;
        int stackOut_120_1 = 0;
        int stackOut_120_2 = 0;
        int stackOut_119_0 = 0;
        int stackOut_119_1 = 0;
        int stackOut_119_2 = 0;
        int stackOut_113_0 = 0;
        int stackOut_112_0 = 0;
        oh stackOut_116_0 = null;
        oh stackOut_115_0 = null;
        oh stackOut_108_0 = null;
        oh stackOut_107_0 = null;
        RuntimeException stackOut_126_0 = null;
        StringBuilder stackOut_126_1 = null;
        RuntimeException stackOut_128_0 = null;
        StringBuilder stackOut_128_1 = null;
        String stackOut_128_2 = null;
        RuntimeException stackOut_127_0 = null;
        StringBuilder stackOut_127_1 = null;
        String stackOut_127_2 = null;
        var14 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              bd.a(param1, 6);
              ra.c(100, 0, 10, 400, 0);
              ra.c(530, 0, 10, 400, 0);
              ra.c(110, 0, 420, 400, 394880);
              var4_int = 31 & dh.field_e >> -17501823;
              if ((var4_int ^ -1) > -17) {
                break L1;
              } else {
                var4_int = 32 + -var4_int;
                break L1;
              }
            }
            L2: {
              var4_int = (var4_int >> -1431759999) + 16;
              if (this.field_a.field_b == 0) {
                var4_int = -var4_int;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param2 < -74) {
                break L3;
              } else {
                this.e(82);
                break L3;
              }
            }
            L4: {
              if (!cf.a(0, (byte) 119)) {
                var5 = 0;
                L5: while (true) {
                  if (7 <= var5) {
                    break L4;
                  } else {
                    var7 = 1 << var5;
                    var15 = 0;
                    var6 = var15;
                    L6: while (true) {
                      if (-7 >= (var15 ^ -1)) {
                        var5++;
                        continue L5;
                      } else {
                        L7: {
                          if (param0) {
                            stackOut_59_0 = 140 + 60 * var5;
                            stackIn_60_0 = stackOut_59_0;
                            break L7;
                          } else {
                            stackOut_58_0 = 500 + -(60 * var5);
                            stackIn_60_0 = stackOut_58_0;
                            break L7;
                          }
                        }
                        L8: {
                          var8 = stackIn_60_0;
                          var9 = 370 - 60 * var15;
                          var10_int = 0;
                          if (-1 != (this.field_g.field_e[var15] & var7 ^ -1)) {
                            var10_int -= 128;
                            break L8;
                          } else {
                            if (0 != (this.field_g.field_k[var15] & var7)) {
                              var10_int += 128;
                              break L8;
                            } else {
                              L9: {
                                if (!this.field_b) {
                                  break L9;
                                } else {
                                  if (null == this.field_g.field_d) {
                                    break L9;
                                  } else {
                                    if (this.field_g.field_d.field_f != var5) {
                                      break L9;
                                    } else {
                                      var10_int = var10_int + var4_int * 4;
                                      break L8;
                                    }
                                  }
                                }
                              }
                              if (this.field_a.field_l) {
                                break L8;
                              } else {
                                L10: {
                                  if (!this.field_b) {
                                    break L10;
                                  } else {
                                    if (this.field_a.field_b != this.field_i) {
                                      break L8;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                                if (this.field_g.field_l == var5) {
                                  if (this.field_g.field_m == var15) {
                                    var10_int = var10_int + 3 * var4_int;
                                    break L8;
                                  } else {
                                    if (this.field_g.field_m < var15) {
                                      var10_int = var10_int + (var4_int * 3 >> 1716960129);
                                      break L8;
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
                        }
                        L11: {
                          if (this.field_g.field_f == null) {
                            break L11;
                          } else {
                            if (-1 == (var7 & this.field_g.field_f[var15] ^ -1)) {
                              break L11;
                            } else {
                              L12: {
                                var11 = this.field_j % 20;
                                if (-11 <= (var11 ^ -1)) {
                                  stackOut_83_0 = var11 - 5;
                                  stackIn_84_0 = stackOut_83_0;
                                  break L12;
                                } else {
                                  stackOut_82_0 = -var11 + 5;
                                  stackIn_84_0 = stackOut_82_0;
                                  break L12;
                                }
                              }
                              var11 = stackIn_84_0;
                              var10_int = var10_int + 10 * var11;
                              break L11;
                            }
                          }
                        }
                        L13: {
                          if (190 >= (var10_int ^ -1)) {
                            if (-1 >= (var10_int ^ -1)) {
                              if (-256 > (var10_int ^ -1)) {
                                stackOut_91_0 = 16777215;
                                stackIn_92_0 = stackOut_91_0;
                                break L13;
                              } else {
                                stackOut_90_0 = var10_int * 65792 | (var10_int * 40 >> 1436857320) + 191;
                                stackIn_92_0 = stackOut_90_0;
                                break L13;
                              }
                            } else {
                              stackOut_88_0 = -(var10_int * 65535) + 191;
                              stackIn_92_0 = stackOut_88_0;
                              break L13;
                            }
                          } else {
                            stackOut_86_0 = 12517376;
                            stackIn_92_0 = stackOut_86_0;
                            break L13;
                          }
                        }
                        var11 = stackIn_92_0;
                        ra.f(var8, var9, 28, 263172);
                        ra.f(var8, var9, 25, var11);
                        var15++;
                        continue L6;
                      }
                    }
                  }
                }
              } else {
                var5 = 0;
                L14: while (true) {
                  if (7 <= var5) {
                    break L4;
                  } else {
                    var7 = 1 << var5;
                    var6 = 0;
                    L15: while (true) {
                      if (-7 >= (var6 ^ -1)) {
                        var5++;
                        continue L14;
                      } else {
                        L16: {
                          var9 = -(var6 * 60) + 370;
                          if (!param0) {
                            stackOut_15_0 = 500 - 60 * var5;
                            stackIn_16_0 = stackOut_15_0;
                            break L16;
                          } else {
                            stackOut_14_0 = var5 * 60 + 140;
                            stackIn_16_0 = stackOut_14_0;
                            break L16;
                          }
                        }
                        L17: {
                          var8 = stackIn_16_0;
                          var10 = null;
                          var11 = 256;
                          if ((this.field_g.field_e[var6] & var7) == 0) {
                            if ((this.field_g.field_k[var6] & var7) == 0) {
                              L18: {
                                if (!this.field_b) {
                                  break L18;
                                } else {
                                  if (null == this.field_g.field_d) {
                                    break L18;
                                  } else {
                                    if (this.field_g.field_d.field_f != var5) {
                                      break L18;
                                    } else {
                                      L19: {
                                        if (this.field_a.field_b == 0) {
                                          stackOut_25_0 = me.field_e;
                                          stackIn_26_0 = stackOut_25_0;
                                          break L19;
                                        } else {
                                          stackOut_24_0 = qd.field_X;
                                          stackIn_26_0 = stackOut_24_0;
                                          break L19;
                                        }
                                      }
                                      var10 = stackIn_26_0;
                                      var11 = 4 * Math.abs(var4_int);
                                      break L17;
                                    }
                                  }
                                }
                              }
                              if (this.field_a.field_l) {
                                break L17;
                              } else {
                                L20: {
                                  if (!this.field_b) {
                                    break L20;
                                  } else {
                                    if (this.field_a.field_b != this.field_i) {
                                      break L17;
                                    } else {
                                      break L20;
                                    }
                                  }
                                }
                                if (var5 != this.field_g.field_l) {
                                  break L17;
                                } else {
                                  L21: {
                                    if (this.field_a.field_b == 0) {
                                      stackOut_34_0 = me.field_e;
                                      stackIn_35_0 = stackOut_34_0;
                                      break L21;
                                    } else {
                                      stackOut_33_0 = qd.field_X;
                                      stackIn_35_0 = stackOut_33_0;
                                      break L21;
                                    }
                                  }
                                  var10 = stackIn_35_0;
                                  if (this.field_g.field_m == var6) {
                                    var11 = Math.abs(var4_int) * 4;
                                    break L17;
                                  } else {
                                    if (var6 > this.field_g.field_m) {
                                      var11 = 3 * Math.abs(var4_int) >> 1652489569;
                                      break L17;
                                    } else {
                                      break L17;
                                    }
                                  }
                                }
                              }
                            } else {
                              var10 = qd.field_X;
                              break L17;
                            }
                          } else {
                            var10 = me.field_e;
                            break L17;
                          }
                        }
                        L22: {
                          if (null == this.field_g.field_f) {
                            break L22;
                          } else {
                            if (-1 == (this.field_g.field_f[var6] & var7 ^ -1)) {
                              break L22;
                            } else {
                              L23: {
                                var12 = this.field_j % 20;
                                if (10 < var12) {
                                  stackOut_44_0 = 20 - var12;
                                  stackIn_45_0 = stackOut_44_0;
                                  break L23;
                                } else {
                                  stackOut_43_0 = var12;
                                  stackIn_45_0 = stackOut_43_0;
                                  break L23;
                                }
                              }
                              var12 = stackIn_45_0;
                              var11 = var12 * var11 / 10;
                              break L22;
                            }
                          }
                        }
                        L24: {
                          if (var10 != null) {
                            if (256 != var11) {
                              ((oh) (var10)).a(-28 + var8, var9 + -28, var11);
                              break L24;
                            } else {
                              ((oh) (var10)).c(-28 + var8, -28 + var9);
                              break L24;
                            }
                          } else {
                            ra.f(var8, var9, 28, 263172);
                            ra.f(var8, var9, 25, 191);
                            break L24;
                          }
                        }
                        var6++;
                        continue L15;
                      }
                    }
                  }
                }
              }
            }
            var10 = (ej) ((Object) this.field_g.field_g.c(false));
            L25: while (true) {
              if (var10 == null) {
                this.a((byte) -100);
                fh.a(true);
                break L0;
              } else {
                L26: {
                  if (!param0) {
                    stackOut_98_0 = -(60 * ((ej) (var10)).field_u) + 500;
                    stackIn_99_0 = stackOut_98_0;
                    break L26;
                  } else {
                    stackOut_97_0 = 140 - -(60 * ((ej) (var10)).field_u);
                    stackIn_99_0 = stackOut_97_0;
                    break L26;
                  }
                }
                L27: {
                  var8 = stackIn_99_0;
                  var9 = 370 - ((ej) (var10)).field_n * 60;
                  if (!((ej) (var10)).field_x) {
                    stackOut_101_0 = 16777215;
                    stackIn_102_0 = stackOut_101_0;
                    break L27;
                  } else {
                    stackOut_100_0 = 12517376;
                    stackIn_102_0 = stackOut_100_0;
                    break L27;
                  }
                }
                L28: {
                  var11 = stackIn_102_0;
                  if (((ej) (var10)).field_q == 0) {
                    ra.d(var8, 0, var8, ((ej) (var10)).field_y, var11);
                    break L28;
                  } else {
                    if (1 == ((ej) (var10)).field_q) {
                      hl.a(-8759, 0, 191, var9, ((ej) (var10)).field_s, var8 - (((ej) (var10)).field_s >> 921708897), var11);
                      if (!cf.a(0, (byte) 116)) {
                        L29: {
                          stackOut_118_0 = var8;
                          stackOut_118_1 = var9;
                          stackIn_120_0 = stackOut_118_0;
                          stackIn_120_1 = stackOut_118_1;
                          stackIn_119_0 = stackOut_118_0;
                          stackIn_119_1 = stackOut_118_1;
                          if (25 >= ((ej) (var10)).field_s) {
                            stackOut_120_0 = stackIn_120_0;
                            stackOut_120_1 = stackIn_120_1;
                            stackOut_120_2 = ((ej) (var10)).field_s;
                            stackIn_121_0 = stackOut_120_0;
                            stackIn_121_1 = stackOut_120_1;
                            stackIn_121_2 = stackOut_120_2;
                            break L29;
                          } else {
                            stackOut_119_0 = stackIn_119_0;
                            stackOut_119_1 = stackIn_119_1;
                            stackOut_119_2 = 25;
                            stackIn_121_0 = stackOut_119_0;
                            stackIn_121_1 = stackOut_119_1;
                            stackIn_121_2 = stackOut_119_2;
                            break L29;
                          }
                        }
                        ra.f(stackIn_121_0, stackIn_121_1, stackIn_121_2, var11);
                        break L28;
                      } else {
                        L30: {
                          if ((((ej) (var10)).field_s ^ -1) >= -26) {
                            stackOut_113_0 = ((ej) (var10)).field_s;
                            stackIn_114_0 = stackOut_113_0;
                            break L30;
                          } else {
                            stackOut_112_0 = 25;
                            stackIn_114_0 = stackOut_112_0;
                            break L30;
                          }
                        }
                        L31: {
                          var12 = stackIn_114_0;
                          var12 = 56 * var12 / 25;
                          if (!((ej) (var10)).field_x) {
                            stackOut_116_0 = qd.field_X;
                            stackIn_117_0 = stackOut_116_0;
                            break L31;
                          } else {
                            stackOut_115_0 = me.field_e;
                            stackIn_117_0 = stackOut_115_0;
                            break L31;
                          }
                        }
                        var13 = stackIn_117_0;
                        var13.c(var8 + -(var12 >> -174061983), var9 - (var12 >> 537997825), var12, var12);
                        break L28;
                      }
                    } else {
                      hl.a(-8759, 0, 191, ((ej) (var10)).field_y, ((ej) (var10)).field_s, -(((ej) (var10)).field_s >> -981847295) + var8, var11);
                      if (cf.a(0, (byte) 111)) {
                        L32: {
                          if (!((ej) (var10)).field_x) {
                            stackOut_108_0 = qd.field_X;
                            stackIn_109_0 = stackOut_108_0;
                            break L32;
                          } else {
                            stackOut_107_0 = me.field_e;
                            stackIn_109_0 = stackOut_107_0;
                            break L32;
                          }
                        }
                        var12_ref_oh = stackIn_109_0;
                        var12_ref_oh.c(var8 + -28, -28 + var9);
                        break L28;
                      } else {
                        ra.f(var8, ((ej) (var10)).field_y, ((ej) (var10)).field_s >> -1281798463, var11);
                        ra.f(var8, var9, 25, var11);
                        break L28;
                      }
                    }
                  }
                }
                var10 = (ej) ((Object) this.field_g.field_g.a((byte) -70));
                continue L25;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L33: {
            var4 = decompiledCaughtException;
            stackOut_126_0 = (RuntimeException) (var4);
            stackOut_126_1 = new StringBuilder().append("ei.I(").append(param0).append(',');
            stackIn_128_0 = stackOut_126_0;
            stackIn_128_1 = stackOut_126_1;
            stackIn_127_0 = stackOut_126_0;
            stackIn_127_1 = stackOut_126_1;
            if (param1 == null) {
              stackOut_128_0 = (RuntimeException) ((Object) stackIn_128_0);
              stackOut_128_1 = (StringBuilder) ((Object) stackIn_128_1);
              stackOut_128_2 = "null";
              stackIn_129_0 = stackOut_128_0;
              stackIn_129_1 = stackOut_128_1;
              stackIn_129_2 = stackOut_128_2;
              break L33;
            } else {
              stackOut_127_0 = (RuntimeException) ((Object) stackIn_127_0);
              stackOut_127_1 = (StringBuilder) ((Object) stackIn_127_1);
              stackOut_127_2 = "{...}";
              stackIn_129_0 = stackOut_127_0;
              stackIn_129_1 = stackOut_127_1;
              stackIn_129_2 = stackOut_127_2;
              break L33;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_129_0), stackIn_129_2 + ',' + param2 + ')');
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
        bf discarded$0 = null;
        if (!this.field_b) {
            this.field_a.a(-124);
            this.field_g = new l(this.field_a, this.field_i);
            this.field_g.c(106);
            this.field_d = fl.field_c[this.field_a.field_d];
            discarded$0 = lb.a(bf.field_r, param0 + 573509762);
            sa.a(-64, true);
            this.field_r = -1;
            this.field_f = -1;
        } else {
            nd.field_Lb.f(61, (byte) -92);
        }
        if (param0 != -1) {
            this.field_j = 122;
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        try {
            kn.field_e = true;
            var2 = "tuhstatbut";
            var3 = "rvnadlm";
            if (param1 != 60) {
                java.applet.Applet var6 = (java.applet.Applet) null;
                ei.a((java.applet.Applet) null, -118);
            }
            var4 = -1L;
            ma.a(var3, var4, param0, 111, var2);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "ei.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(boolean param0, byte param1) {
        bf discarded$2 = null;
        bf discarded$3 = null;
        int var4 = 0;
        wf stackIn_43_0 = null;
        wf stackOut_42_0 = null;
        wf stackOut_41_0 = null;
        L0: {
          var4 = TetraLink.field_J;
          this.field_j = this.field_j + 1;
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
          if (this.field_b) {
            if (-2 > (this.field_d ^ -1)) {
              this.field_d = this.field_d - 1;
              break L4;
            } else {
              break L4;
            }
          } else {
            if (!this.field_a.field_l) {
              this.field_d = this.field_d - 1;
              if (-1 != (this.field_d ^ -1)) {
                break L4;
              } else {
                this.a(false);
                break L4;
              }
            } else {
              break L4;
            }
          }
        }
        L5: {
          this.field_g.e(88);
          if (this.field_a.field_l) {
            break L5;
          } else {
            L6: {
              if (this.field_a.field_b == this.field_i) {
                break L6;
              } else {
                if (this.field_b) {
                  break L5;
                } else {
                  break L6;
                }
              }
            }
            if (-751 >= (this.field_d ^ -1)) {
              break L5;
            } else {
              if (this.field_d % 50 == 0) {
                discarded$2 = lb.a(sk.field_a, 573509761);
                break L5;
              } else {
                break L5;
              }
            }
          }
        }
        L7: {
          if (this.field_g.field_f != null) {
            L8: {
              L9: {
                if (0 != this.field_g.field_h) {
                  break L9;
                } else {
                  if (this.field_j % 20 == 9) {
                    break L8;
                  } else {
                    break L9;
                  }
                }
              }
              if (1 != this.field_g.field_h) {
                break L7;
              } else {
                if (-20 != (this.field_j % 20 ^ -1)) {
                  break L7;
                } else {
                  break L8;
                }
              }
            }
            L10: {
              L11: {
                if (!this.field_b) {
                  break L11;
                } else {
                  if (this.field_i != this.field_g.field_h) {
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
            discarded$3 = lb.a(stackIn_43_0, 573509761);
            break L7;
          } else {
            break L7;
          }
        }
        if (param1 > 48) {
          L12: {
            if (!this.field_a.field_l) {
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
        nd.field_Lb.a(this.field_a.field_k, !param2 ? true : false);
        if (!param2) {
            this.c(-49);
        }
        nd.field_Lb.a(param1 << -330919741 | param0, !param2 ? true : false);
        if (null != this.field_g.field_d) {
        }
        this.field_g.field_d = new bi(param1, param0, this.field_a.field_k);
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
            if (!this.field_a.field_l) {
              if (-1 >= (this.field_a.field_b ^ -1)) {
                L1: {
                  var4 = sk.a(new String[]{Integer.toString((49 + this.field_d) / 50)}, ai.field_f, param0 + 220);
                  if (!this.field_b) {
                    break L1;
                  } else {
                    if (this.field_i != this.field_a.field_b) {
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
                          stackOut_16_0 = (de) ((Object) stackIn_16_0);
                          stackOut_16_1 = (String) ((Object) stackIn_16_1);
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
                          stackOut_15_0 = (de) ((Object) stackIn_15_0);
                          stackOut_15_1 = (String) ((Object) stackIn_15_1);
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
                mk.field_b.c(sk.a(new String[]{this.field_a.field_o[this.field_a.field_b]}, ef.field_l, 119), 516, 30, 16777215, -1);
                mk.field_b.b(var4, 124, 30, 16777215, -1);
                break L0;
              } else {
                break L0;
              }
            } else {
              if (this.field_a.field_b >= 0) {
                L3: {
                  if (!this.field_b) {
                    break L3;
                  } else {
                    if (this.field_a.field_b == this.field_i) {
                      mk.field_b.a(mc.field_g, 320, 30, 16777215, -1);
                      break L0;
                    } else {
                      break L3;
                    }
                  }
                }
                mk.field_b.a(sk.a(new String[]{this.field_a.field_o[this.field_a.field_b]}, bk.field_b, 119), 320, 30, 16777215, -1);
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
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        var12 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              bd.a(param1, 6);
              ra.c(110, 0, 420, 400, 127);
              ra.c(100, 0, 10, 400, 0);
              ra.c(530, 0, 10, 400, 0);
              var4_int = (63 & dh.field_e) >> 1086317953;
              if (16 > var4_int) {
                break L1;
              } else {
                var4_int = -var4_int + 32;
                break L1;
              }
            }
            L2: {
              if (-1 == (this.field_a.field_b ^ -1)) {
                stackOut_5_0 = 525052 * var4_int + 128;
                stackIn_6_0 = stackOut_5_0;
                break L2;
              } else {
                stackOut_4_0 = 128 - -(526341 * var4_int);
                stackIn_6_0 = stackOut_4_0;
                break L2;
              }
            }
            L3: {
              var5 = stackIn_6_0;
              if (0 == this.field_a.field_b) {
                stackOut_8_0 = 5255152 - (-(328447 * (var4_int >> -161816479)) - 128);
                stackIn_9_0 = stackOut_8_0;
                break L3;
              } else {
                stackOut_7_0 = 128 - (-4210768 + -(263173 * (var4_int >> -1508110239)));
                stackIn_9_0 = stackOut_7_0;
                break L3;
              }
            }
            var6 = stackIn_9_0;
            var7 = 0;
            L4: while (true) {
              if (7 <= var7) {
                L5: {
                  if (param2 > 8) {
                    break L5;
                  } else {
                    this.a(118);
                    break L5;
                  }
                }
                this.a((byte) -100);
                fh.a(true);
                break L0;
              } else {
                var8 = 0;
                L6: while (true) {
                  if (var8 >= 6) {
                    var7++;
                    continue L4;
                  } else {
                    L7: {
                      var10 = -(var8 * 60) + 370;
                      if (!param0) {
                        stackOut_15_0 = 500 - var7 * 60;
                        stackIn_16_0 = stackOut_15_0;
                        break L7;
                      } else {
                        stackOut_14_0 = var7 * 60 + 140;
                        stackIn_16_0 = stackOut_14_0;
                        break L7;
                      }
                    }
                    L8: {
                      L9: {
                        var9 = stackIn_16_0;
                        ra.f(var9, var10, 28, 263172);
                        if (!this.field_b) {
                          break L9;
                        } else {
                          if (this.field_g.field_d == null) {
                            break L9;
                          } else {
                            if (this.field_g.field_d.field_f != var7) {
                              break L9;
                            } else {
                              L10: {
                                if (this.field_a.field_b == 0) {
                                  stackOut_21_0 = 128 - -((8 - -(var4_int >> -703754143)) * 525052);
                                  stackIn_22_0 = stackOut_21_0;
                                  break L10;
                                } else {
                                  stackOut_20_0 = 4210728 + 526341 * (var4_int >> 842023713) + 128;
                                  stackIn_22_0 = stackOut_20_0;
                                  break L10;
                                }
                              }
                              var11 = stackIn_22_0;
                              if (((this.field_g.field_k[var8] | this.field_g.field_e[var8]) & 1 << var7) == 0) {
                                ra.f(var9, var10, 25, var11);
                                break L8;
                              } else {
                                ra.f(var9, var10, 25, 0);
                                break L8;
                              }
                            }
                          }
                        }
                      }
                      L11: {
                        if (this.field_a.field_l) {
                          break L11;
                        } else {
                          L12: {
                            if (!this.field_b) {
                              break L12;
                            } else {
                              if (this.field_a.field_b != this.field_i) {
                                break L11;
                              } else {
                                break L12;
                              }
                            }
                          }
                          if (this.field_g.field_l != var7) {
                            break L11;
                          } else {
                            if (this.field_g.field_m != var8) {
                              if (this.field_g.field_m < var8) {
                                ra.f(var9, var10, 25, var6);
                                break L8;
                              } else {
                                ra.f(var9, var10, 25, 0);
                                break L8;
                              }
                            } else {
                              ra.f(var9, var10, 25, var5);
                              break L8;
                            }
                          }
                        }
                      }
                      ra.f(var9, var10, 25, 0);
                      break L8;
                    }
                    var8++;
                    continue L6;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var4 = decompiledCaughtException;
            stackOut_42_0 = (RuntimeException) (var4);
            stackOut_42_1 = new StringBuilder().append("ei.F(").append(param0).append(',');
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param1 == null) {
              stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackOut_44_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L13;
            } else {
              stackOut_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackOut_43_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackOut_43_2 = "{...}";
              stackIn_45_0 = stackOut_43_0;
              stackIn_45_1 = stackOut_43_1;
              stackIn_45_2 = stackOut_43_2;
              break L13;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_45_0), stackIn_45_2 + ',' + param2 + ')');
        }
    }

    final void c(int param0) {
        bf discarded$5 = null;
        bf discarded$6 = null;
        int var2 = 0;
        int var3 = 0;
        var3 = TetraLink.field_J;
        if (13 == dg.field_e) {
          var2 = 2;
          if (this.field_b) {
            L0: {
              if (-1 < (this.field_i ^ -1)) {
                var2 = 5;
                break L0;
              } else {
                if (!this.field_a.field_l) {
                  var2 = 3;
                  break L0;
                } else {
                  var2 = 4;
                  break L0;
                }
              }
            }
            discarded$5 = lb.a(e.field_c, 573509761);
            this.a(true, -128, false, var2);
            return;
          } else {
            discarded$6 = lb.a(e.field_c, 573509761);
            this.a(true, -128, false, var2);
            return;
          }
        } else {
          L1: {
            if (param0 > 59) {
              break L1;
            } else {
              this.a(51);
              break L1;
            }
          }
          return;
        }
    }

    final static void b(byte param0) {
        String discarded$0 = null;
        if (!bh.field_r) {
            throw new IllegalStateException();
        }
        k.field_c = true;
        if (param0 > -118) {
            discarded$0 = ei.a((byte) -125, -44L);
        }
        ck.a((byte) 126, true);
        fn.field_R = 0;
    }

    private final void a(int param0, int param1, int param2) {
        if (param1 != -15682) {
            return;
        }
        this.field_a.a(param2, param0, this.field_a.field_b, -28067);
        this.field_g.a((byte) 56);
        if (this.field_a.e(2)) {
            if (1 != (this.field_i ^ -1)) {
                this.a(false, -110, false, -1);
            }
            this.field_p = 0;
        } else {
            this.field_a.a(true);
            this.field_d = fl.field_c[this.field_a.field_d];
        }
    }

    final void a(int param0) {
        if (!this.field_b) {
            throw new IllegalStateException();
        }
        if (param0 != 0) {
            this.field_m = 46;
        }
        nd.field_Lb.f(59, (byte) -92);
    }

    final void a(boolean param0, boolean param1) {
        if (!(this.field_b)) {
            this.a(false, -120, param1, 0);
        }
        if (!param0) {
            this.field_m = 18;
        }
    }

    ei(boolean param0, int param1, String[] param2, int param3, boolean param4) {
        try {
            this.field_i = param3;
            this.field_b = param0 ? true : false;
            this.field_c = param4 ? true : false;
            this.field_a = new em(param1, param2, -1);
            if (!this.field_b) {
                this.field_a.a(0, 18936, 0);
                this.field_d = fl.field_c[this.field_a.field_d];
            }
            this.field_g = new l(this.field_a, this.field_i);
            this.field_j = 0;
            this.field_f = -1;
            this.field_n = true;
            this.field_k = 0;
            this.field_r = -1;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "ei.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_o = "Hint: to start quickly, choose 'Don't mind' for as many options as you can!";
        field_e = "Create a free account to";
        field_h = "This password is part of your Player Name, and would be easy to guess";
    }
}
