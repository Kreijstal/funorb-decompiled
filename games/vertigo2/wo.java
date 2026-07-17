/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wo {
    int field_k;
    int field_a;
    private int field_h;
    private int field_U;
    private boolean field_T;
    private int field_K;
    static double field_S;
    int field_E;
    static lg[] field_q;
    private int field_bb;
    private boolean field_x;
    boolean field_z;
    private int field_t;
    private boolean field_r;
    int field_W;
    static String[] field_V;
    int field_I;
    boolean field_A;
    private boolean field_i;
    byte field_C;
    int field_l;
    int field_p;
    int[] field_P;
    private boolean field_o;
    private int field_n;
    private int field_f;
    int field_X;
    private int field_Y;
    static boolean field_s;
    private int field_D;
    private int field_u;
    static String field_b;
    int field_c;
    int field_w;
    private int field_ab;
    int field_g;
    private int field_Z;
    int field_N;
    boolean field_G;
    private int field_j;
    int field_H;
    int[] field_L;
    private int field_B;
    private byte field_v;
    private boolean field_R;
    private boolean field_F;
    private int field_J;
    int field_y;
    private boolean field_e;
    int field_O;
    int field_d;
    private int field_Q;
    int field_m;
    private int field_M;

    final void b(byte param0) {
        ((wo) this).field_J = 0;
        if (param0 >= -10) {
            ((wo) this).c(-60);
        }
    }

    private final void i(byte param0) {
        ((wo) this).field_A = false;
    }

    final void b(int param0, int param1) {
        if (param1 != -7394) {
            ((wo) this).g(40);
        }
        if (!(1 == ((wo) this).field_J)) {
            ((wo) this).field_h = param0;
        }
    }

    final void k(int param0) {
        ((wo) this).field_J = param0;
        ((wo) this).field_ab = -1;
    }

    final void a(boolean param0, int param1, int param2) {
        int var5 = 0;
        var5 = Vertigo2.field_L ? 1 : 0;
        if (!param0) {
          L0: {
            if (((wo) this).field_N < 2) {
              L1: {
                ((wo) this).field_O = -((wo) this).field_O / 2;
                ((wo) this).field_c = -((wo) this).field_c / 2;
                if (((wo) this).field_O <= -704) {
                  break L1;
                } else {
                  if (((wo) this).field_O >= 704) {
                    break L1;
                  } else {
                    ((wo) this).field_O = 0;
                    break L1;
                  }
                }
              }
              L2: {
                if (((wo) this).field_c <= -704) {
                  break L2;
                } else {
                  if (((wo) this).field_c < 704) {
                    ((wo) this).field_c = 0;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              ((wo) this).field_E = ((wo) this).field_M;
              ((wo) this).field_y = ((wo) this).field_Q;
              break L0;
            } else {
              L3: {
                ((wo) this).field_N = 3;
                if (param2 >= ((wo) this).field_y) {
                  ((wo) this).field_O = ((wo) this).field_O - 22;
                  break L3;
                } else {
                  ((wo) this).field_O = ((wo) this).field_O + 22;
                  break L3;
                }
              }
              if (param1 < ((wo) this).field_E) {
                ((wo) this).field_c = ((wo) this).field_c + 22;
                break L0;
              } else {
                ((wo) this).field_c = ((wo) this).field_c - 22;
                break L0;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final int l(int param0) {
        if (param0 != -32768) {
            int discarded$0 = ((wo) this).a(103, 35, -63);
        }
        return ((wo) this).field_ab;
    }

    private final void e(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        if (param0 == 7883) {
          L0: {
            if (9 == ((wo) this).field_J) {
              break L0;
            } else {
              if (-50 != ((wo) this).field_X) {
                if (0 >= ((wo) this).field_U) {
                  break L0;
                } else {
                  L1: {
                    ((wo) this).field_U = ((wo) this).field_U - 1;
                    ((wo) this).field_J = 9;
                    ((wo) this).field_t = 28;
                    ((wo) this).field_X = -50;
                    var2 = -((wo) this).field_k + (-480 + ((wo) this).field_f * 240) - 30 << 8;
                    var3 = 64 + var2;
                    var4 = 128 - -wg.a(115, -var3 << 8);
                    var4 = var4 << 1;
                    var5 = -wg.a(124, -var3 << 8) + 128;
                    var5 = var5 << 1;
                    var4 = var4 >> 8;
                    var5 = var5 >> 8;
                    if (Math.abs(var4) >= Math.abs(var5)) {
                      stackOut_8_0 = 0;
                      stackIn_9_0 = stackOut_8_0;
                      break L1;
                    } else {
                      stackOut_7_0 = 1;
                      stackIn_9_0 = stackOut_7_0;
                      break L1;
                    }
                  }
                  var6 = stackIn_9_0;
                  if (var6 == 0) {
                    ((wo) this).field_h = var5;
                    return;
                  } else {
                    ((wo) this).field_h = var4;
                    return;
                  }
                }
              } else {
                break L0;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final int j(int param0) {
        if (param0 <= 48) {
            ((wo) this).c(3);
        }
        return ((wo) this).field_n;
    }

    final void a(int param0, int param1, int param2, int param3, boolean param4, int param5) {
        String var8_ref_String = null;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int var11_int = 0;
        String var11 = null;
        String var12_ref_String = null;
        int var12 = 0;
        int var13 = 0;
        String var13_ref_String = null;
        int var14 = 0;
        StringBuilder var15 = null;
        int var16 = 0;
        int var17 = 0;
        String var18 = null;
        wn var19 = null;
        String var20 = null;
        String var21 = null;
        var17 = Vertigo2.field_L ? 1 : 0;
        if (8 == ((wo) this).field_J) {
          return;
        } else {
          L0: {
            if (((wo) this).field_J == 4) {
              break L0;
            } else {
              if (((wo) this).field_J != 7) {
                var19 = va.field_s;
                if (6 != ((wo) this).field_J) {
                  L1: {
                    if (2 == param0) {
                      break L1;
                    } else {
                      if (3 != param0) {
                        tn.field_i.e(10, 10);
                        va.field_s.a(16777215, (byte) 75, -1, tn.field_i.field_x + 15, Vertigo2.a(new String[1], uj.field_k, 109), 10 + (va.field_s.field_k + 10));
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  }
                  L2: {
                    L3: {
                      var8 = td.field_c.field_C;
                      var9 = 0;
                      if (param0 == 2) {
                        break L3;
                      } else {
                        if (param0 == 1) {
                          break L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                    var9 = 32;
                    break L2;
                  }
                  L4: {
                    var10 = null;
                    if (0 == ((wo) this).field_Y * ((wo) this).field_Y) {
                      var10 = (Object) (Object) uo.field_e;
                      break L4;
                    } else {
                      if (((wo) this).field_Y < 0) {
                        var10 = (Object) (Object) bh.field_y[-((wo) this).field_Y + -1];
                        break L4;
                      } else {
                        if (((wo) this).field_Y > 0) {
                          var10 = (Object) (Object) im.field_c[-1 + ((wo) this).field_Y];
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  L5: {
                    if (var10 == null) {
                      break L5;
                    } else {
                      ((fe) var10).e(-((fe) var10).field_x + 625, -((fe) var10).field_B + var8 + -12);
                      break L5;
                    }
                  }
                  L6: {
                    if (((wo) this).field_g <= 0) {
                      break L6;
                    } else {
                      var11_int = 25;
                      be.field_n.e(-5 + var11_int, 5 + (-be.field_n.field_B + (var8 - var9) - 20));
                      va.field_s.a(16777215, (byte) 77, -1, 48, Integer.toString(((wo) this).field_g), 5 + (var8 + (-20 - var9) - (be.field_n.field_B + -va.field_s.field_k)));
                      qi.a(false, var11_int, 25, var8 + -20 - (var9 + be.field_n.field_B));
                      break L6;
                    }
                  }
                  L7: {
                    if (((wo) this).field_U <= 0) {
                      break L7;
                    } else {
                      var11_int = -60 - (var9 - var8) + -bj.field_j.field_B;
                      bj.field_j.e(20, var11_int + 5);
                      va.field_s.a(16777215, (byte) 124, -1, 48, Integer.toString(((wo) this).field_U), 5 + va.field_s.field_k + var11_int);
                      qi.a(false, 25, 25, var11_int);
                      break L7;
                    }
                  }
                  L8: {
                    if (!((wo) this).field_x) {
                      var20 = Integer.toString(((wo) this).field_W);
                      var13 = var20.length();
                      var14 = 6;
                      var15 = new StringBuilder(var14);
                      StringBuilder discarded$1 = w.a(true, ' ', var14, var15);
                      var16 = 0;
                      L9: while (true) {
                        if (~(-var13 + var14) >= ~var16) {
                          var16 = -var13 + var14;
                          L10: while (true) {
                            if (~var14 >= ~var16) {
                              var11 = Vertigo2.a(new String[1], mj.field_a, -124);
                              break L8;
                            } else {
                              var15.setCharAt(var16, var20.charAt(var16 - (var14 - var13)));
                              var16++;
                              continue L10;
                            }
                          }
                        } else {
                          var15.setCharAt(var16, '0');
                          var16++;
                          continue L9;
                        }
                      }
                    } else {
                      var18 = Integer.toString(param2);
                      var12_ref_String = var18;
                      var13_ref_String = Integer.toString(param5);
                      var11 = Vertigo2.a(new String[2], kb.field_f, 3);
                      if (((wo) this).field_R) {
                        wi.field_j[30][0].a(0, 2047 + -Math.abs((2 * ((wo) this).field_D & 511) - 255), 0, 0, -270, -75, 500, 0L);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                  }
                  L11: {
                    if (param1 != param0) {
                      var12 = va.field_s.a(param1 + -2, var11);
                      qi.a(false, 620 - var12, var12, 10);
                      va.field_s.a(16777215, (byte) 109, -1, -var12 + 620, var11, -2 + va.field_s.field_k + 16);
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if (0 < ((wo) this).field_H) {
                      var21 = Vertigo2.a(new String[1], mc.field_f, -114);
                      var13 = va.field_s.a(1, var21);
                      qi.a(false, -var13 + 620, var13, 10);
                      va.field_s.a(16777215, (byte) 61, -1, -var13 + 620, var21, va.field_s.field_k + 14);
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    if (!param4) {
                      break L13;
                    } else {
                      var19.a(aj.field_i, 16777215, -1, 320, 64, 2);
                      break L13;
                    }
                  }
                  return;
                } else {
                  var8_ref_String = Vertigo2.a(new String[1], jd.field_c, -18);
                  var19.a(var8_ref_String, 16777215, -1, 320, 240, 2);
                  return;
                }
              } else {
                break L0;
              }
            }
          }
          return;
        }
    }

    final void g(int param0) {
        int var2 = 0;
        int var3 = Vertigo2.field_L ? 1 : 0;
        if (param0 >= -55) {
            ((wo) this).field_y = -72;
        }
        for (var2 = 0; var2 < 9; var2++) {
            ((wo) this).field_P[var2] = -1;
            ((wo) this).field_L[var2] = -1;
        }
    }

    final void d(boolean param0) {
        ((wo) this).field_Y = 0;
        ((wo) this).field_g = 0;
        ((wo) this).field_U = 0;
        ((wo) this).field_p = ((wo) this).field_W;
        if (param0) {
            ((wo) this).field_A = true;
        }
    }

    final void a(int param0, mi param1) {
        RuntimeException var3 = null;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_9_0 = null;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_12_0 = null;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        Object stackOut_17_0 = null;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            L1: {
              ((wo) this).field_c = -256 + param1.c((byte) -106, 10);
              ((wo) this).field_O = param1.c((byte) -113, 10) + -256;
              ((wo) this).field_ab = param1.c((byte) -122, 4);
              ((wo) this).field_Y = param1.c((byte) -100, 4) - 5;
              ((wo) this).field_U = param1.c((byte) -98, 3);
              ((wo) this).field_g = param1.c((byte) -104, 3);
              ((wo) this).field_W = param1.c((byte) -109, 15);
              ((wo) this).field_E = param1.c((byte) -117, 32);
              ((wo) this).field_y = param1.c((byte) -114, 32);
              ((wo) this).field_k = param1.c((byte) -106, 32);
              ((wo) this).field_f = param1.c((byte) -100, 4);
              ((wo) this).field_M = param1.c((byte) -118, 32);
              ((wo) this).field_Q = param1.c((byte) -112, 32);
              stackOut_0_0 = this;
              stackIn_2_0 = stackOut_0_0;
              stackIn_1_0 = stackOut_0_0;
              if (param1.c((byte) -123, 1) != 1) {
                stackOut_2_0 = this;
                stackOut_2_1 = 0;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                break L1;
              } else {
                stackOut_1_0 = this;
                stackOut_1_1 = 1;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                break L1;
              }
            }
            L2: {
              ((wo) this).field_A = stackIn_3_1 != 0;
              stackOut_3_0 = this;
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (1 != param1.c((byte) -115, 1)) {
                stackOut_5_0 = this;
                stackOut_5_1 = 0;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                break L2;
              } else {
                stackOut_4_0 = this;
                stackOut_4_1 = 1;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                break L2;
              }
            }
            L3: {
              ((wo) this).field_z = stackIn_6_1 != 0;
              stackOut_6_0 = this;
              stackIn_8_0 = stackOut_6_0;
              stackIn_7_0 = stackOut_6_0;
              if (param1.c((byte) -95, 1) != 1) {
                stackOut_8_0 = this;
                stackOut_8_1 = 0;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                break L3;
              } else {
                stackOut_7_0 = this;
                stackOut_7_1 = 1;
                stackIn_9_0 = stackOut_7_0;
                stackIn_9_1 = stackOut_7_1;
                break L3;
              }
            }
            L4: {
              ((wo) this).field_F = stackIn_9_1 != 0;
              stackOut_9_0 = this;
              stackIn_11_0 = stackOut_9_0;
              stackIn_10_0 = stackOut_9_0;
              if (1 != param1.c((byte) -96, 1)) {
                stackOut_11_0 = this;
                stackOut_11_1 = 0;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                break L4;
              } else {
                stackOut_10_0 = this;
                stackOut_10_1 = 1;
                stackIn_12_0 = stackOut_10_0;
                stackIn_12_1 = stackOut_10_1;
                break L4;
              }
            }
            L5: {
              ((wo) this).field_o = stackIn_12_1 != 0;
              stackOut_12_0 = this;
              stackIn_14_0 = stackOut_12_0;
              stackIn_13_0 = stackOut_12_0;
              if (param1.c((byte) -101, 1) != 1) {
                stackOut_14_0 = this;
                stackOut_14_1 = 0;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                break L5;
              } else {
                stackOut_13_0 = this;
                stackOut_13_1 = 1;
                stackIn_15_0 = stackOut_13_0;
                stackIn_15_1 = stackOut_13_1;
                break L5;
              }
            }
            L6: {
              ((wo) this).field_G = stackIn_15_1 != 0;
              ((wo) this).field_h = param1.c((byte) -103, 7) - 50;
              ((wo) this).field_X = -param1.c((byte) -105, 6);
              ((wo) this).field_n = param1.c((byte) -97, 11);
              ((wo) this).field_N = param1.c((byte) -114, 2);
              ((wo) this).field_K = param1.c((byte) -121, 10);
              ((wo) this).field_Z = param1.c((byte) -108, 10);
              ((wo) this).field_bb = param1.c((byte) -122, 12);
              if (param0 == 0) {
                break L6;
              } else {
                wo.a(114, -101, false, -98, 72, -17);
                break L6;
              }
            }
            L7: {
              ((wo) this).field_J = param1.c((byte) -105, 4);
              ((wo) this).field_t = -1 + param1.c((byte) -102, 9);
              ((wo) this).field_v = (byte)param1.c((byte) -125, 5);
              ((wo) this).field_B = param1.c((byte) -101, 4);
              stackOut_17_0 = this;
              stackIn_19_0 = stackOut_17_0;
              stackIn_18_0 = stackOut_17_0;
              if (param1.c((byte) -109, 1) != 1) {
                stackOut_19_0 = this;
                stackOut_19_1 = 0;
                stackIn_20_0 = stackOut_19_0;
                stackIn_20_1 = stackOut_19_1;
                break L7;
              } else {
                stackOut_18_0 = this;
                stackOut_18_1 = 1;
                stackIn_20_0 = stackOut_18_0;
                stackIn_20_1 = stackOut_18_1;
                break L7;
              }
            }
            ((wo) this).field_R = stackIn_20_1 != 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var3;
            stackOut_22_1 = new StringBuilder().append("wo.PA(").append(param0).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 41);
        }
    }

    final static boolean a(int param0, int param1) {
        if (param1 != -29273) {
            wo.n(80);
        }
        return (param0 & 1) != 0 ? true : false;
    }

    final boolean h(byte param0) {
        if (param0 != 117) {
            ((wo) this).field_u = -49;
        }
        return ((wo) this).field_ab <= 0 ? true : false;
    }

    final boolean i(int param0) {
        if (!(((wo) this).field_e)) {
            return false;
        }
        if (param0 != 10949) {
            return false;
        }
        ((wo) this).field_e = false;
        return true;
    }

    final int a(int param0, boolean param1, int param2, boolean param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_40_0 = 0;
        int stackIn_60_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_38_0 = 0;
        L0: {
          var11 = Vertigo2.field_L ? 1 : 0;
          ((wo) this).field_X = -36;
          if (param5 == 18113) {
            break L0;
          } else {
            ((wo) this).field_L = null;
            break L0;
          }
        }
        L1: {
          var7 = param4;
          if (var7 == 16) {
            ((wo) this).field_X = -6;
            break L1;
          } else {
            if (var7 != 10) {
              if (6 != var7) {
                if (var7 == 5) {
                  if (((wo) this).field_Y != 0) {
                    break L1;
                  } else {
                    if (param1) {
                      L2: {
                        L3: {
                          if (0 == ((wo) this).field_l) {
                            break L3;
                          } else {
                            if (!((wo) this).field_x) {
                              break L3;
                            } else {
                              break L2;
                            }
                          }
                        }
                        ((wo) this).field_Y = 5;
                        if (((wo) this).field_i) {
                          break L2;
                        } else {
                          if (param3) {
                            gm.a(8, (byte) -55);
                            break L2;
                          } else {
                            break L2;
                          }
                        }
                      }
                      L4: {
                        if (param2 == 2) {
                          stackOut_59_0 = 5;
                          stackIn_60_0 = stackOut_59_0;
                          break L4;
                        } else {
                          stackOut_58_0 = 4;
                          stackIn_60_0 = stackOut_58_0;
                          break L4;
                        }
                      }
                      return stackIn_60_0;
                    } else {
                      break L1;
                    }
                  }
                } else {
                  if (var7 == 29) {
                    if (param1) {
                      ((wo) this).field_R = true;
                      return 4;
                    } else {
                      break L1;
                    }
                  } else {
                    if (var7 != 30) {
                      L5: {
                        if (1 == var7) {
                          if (!param1) {
                            break L5;
                          } else {
                            if (((wo) this).field_X != 0) {
                              ((wo) this).field_X = -50;
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                        } else {
                          if (var7 == 26) {
                            break L5;
                          } else {
                            if (var7 != 3) {
                              L6: {
                                if (var7 != 2) {
                                  if (var7 == 25) {
                                    break L6;
                                  } else {
                                    if (var7 == 4) {
                                      break L6;
                                    } else {
                                      if (var7 == 11) {
                                        if (!param1) {
                                          break L1;
                                        } else {
                                          if (((wo) this).field_g < 7) {
                                            L7: {
                                              ((wo) this).field_g = ((wo) this).field_g + 1;
                                              if (((wo) this).field_i) {
                                                break L7;
                                              } else {
                                                if (!param3) {
                                                  break L7;
                                                } else {
                                                  gm.a(20, (byte) -55);
                                                  break L7;
                                                }
                                              }
                                            }
                                            return 27;
                                          } else {
                                            break L1;
                                          }
                                        }
                                      } else {
                                        if (var7 != 18) {
                                          if (var7 == 19) {
                                            if (param1) {
                                              if (15 <= ((wo) this).field_ab) {
                                                break L1;
                                              } else {
                                                L8: {
                                                  if (((wo) this).field_i) {
                                                    break L8;
                                                  } else {
                                                    if (param3) {
                                                      gm.a(7, (byte) -55);
                                                      break L8;
                                                    } else {
                                                      break L8;
                                                    }
                                                  }
                                                }
                                                ((wo) this).field_ab = ((wo) this).field_ab + 1;
                                                return 27;
                                              }
                                            } else {
                                              break L1;
                                            }
                                          } else {
                                            if (var7 == 20) {
                                              ((wo) this).field_F = true;
                                              if (param1) {
                                                L9: {
                                                  if (((wo) this).field_i) {
                                                    break L9;
                                                  } else {
                                                    if (!param3) {
                                                      break L9;
                                                    } else {
                                                      gm.a(18, (byte) -55);
                                                      break L9;
                                                    }
                                                  }
                                                }
                                                return 27;
                                              } else {
                                                break L1;
                                              }
                                            } else {
                                              if (12 == var7) {
                                                if (!param1) {
                                                  break L1;
                                                } else {
                                                  L10: {
                                                    var7 = ((wo) this).field_W;
                                                    ((wo) this).field_W = ((wo) this).field_W + 100;
                                                    if (((wo) this).field_W < 32767) {
                                                      break L10;
                                                    } else {
                                                      ((wo) this).field_W = 32767;
                                                      break L10;
                                                    }
                                                  }
                                                  L11: {
                                                    if (((wo) this).field_i) {
                                                      break L11;
                                                    } else {
                                                      if (((wo) this).field_T) {
                                                        break L11;
                                                      } else {
                                                        if (((wo) this).field_r) {
                                                          break L11;
                                                        } else {
                                                          if (0 >= ((wo) this).field_W + -var7) {
                                                            break L11;
                                                          } else {
                                                            var8 = -var7 + ((wo) this).field_W;
                                                            if (null == ln.field_d) {
                                                              break L11;
                                                            } else {
                                                              if (ln.field_d.field_B < 0) {
                                                                break L11;
                                                              } else {
                                                                if (null == oe.field_pb) {
                                                                  var9 = ln.field_d.field_s % 3;
                                                                  if (var9 != 0) {
                                                                    if (var9 == 1) {
                                                                      pn.field_R = pn.field_R - var8;
                                                                      break L11;
                                                                    } else {
                                                                      var10 = var8 / 3;
                                                                      gi.field_u = gi.field_u + var10;
                                                                      pn.field_R = pn.field_R - (-var10 + var8);
                                                                      break L11;
                                                                    }
                                                                  } else {
                                                                    gi.field_u = gi.field_u + var8;
                                                                    break L11;
                                                                  }
                                                                } else {
                                                                  break L11;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                  L12: {
                                                    if (((wo) this).field_i) {
                                                      break L12;
                                                    } else {
                                                      if (param3) {
                                                        gm.a(17, (byte) -55);
                                                        break L12;
                                                      } else {
                                                        break L12;
                                                      }
                                                    }
                                                  }
                                                  return 27;
                                                }
                                              } else {
                                                if (var7 == 8) {
                                                  if (param1) {
                                                    return 22;
                                                  } else {
                                                    break L1;
                                                  }
                                                } else {
                                                  break L1;
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          if (param1) {
                                            if (((wo) this).field_U < 7) {
                                              L13: {
                                                if (((wo) this).field_i) {
                                                  break L13;
                                                } else {
                                                  if (!param3) {
                                                    break L13;
                                                  } else {
                                                    gm.a(20, (byte) -55);
                                                    break L13;
                                                  }
                                                }
                                              }
                                              ((wo) this).field_U = ((wo) this).field_U + 1;
                                              return 27;
                                            } else {
                                              break L1;
                                            }
                                          } else {
                                            break L1;
                                          }
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  if (!param1) {
                                    break L6;
                                  } else {
                                    if (((wo) this).field_X != 0) {
                                      ((wo) this).field_X = -50;
                                      break L6;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                              }
                              if (((wo) this).field_Y >= 0) {
                                break L1;
                              } else {
                                if (param1) {
                                  L14: {
                                    var7 = ((wo) this).field_W;
                                    ((wo) this).field_W = ((wo) this).field_W + 10;
                                    if (((wo) this).field_W >= 32767) {
                                      ((wo) this).field_W = 32767;
                                      break L14;
                                    } else {
                                      break L14;
                                    }
                                  }
                                  L15: {
                                    if (((wo) this).field_i) {
                                      break L15;
                                    } else {
                                      if (((wo) this).field_T) {
                                        break L15;
                                      } else {
                                        if (((wo) this).field_r) {
                                          break L15;
                                        } else {
                                          if (-var7 + ((wo) this).field_W > 0) {
                                            var8 = ((wo) this).field_W + -var7;
                                            if (ln.field_d == null) {
                                              break L15;
                                            } else {
                                              if (ln.field_d.field_B < 0) {
                                                break L15;
                                              } else {
                                                if (oe.field_pb != null) {
                                                  break L15;
                                                } else {
                                                  var9 = ln.field_d.field_s % 3;
                                                  if (var9 != 0) {
                                                    if (var9 == 1) {
                                                      pn.field_R = pn.field_R - var8;
                                                      break L15;
                                                    } else {
                                                      var10 = var8 / 3;
                                                      pn.field_R = pn.field_R - (var8 + -var10);
                                                      gi.field_u = gi.field_u + var10;
                                                      break L15;
                                                    }
                                                  } else {
                                                    gi.field_u = gi.field_u + var8;
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
                                  }
                                  L16: {
                                    ((wo) this).field_j = ((wo) this).field_j + 1;
                                    ((wo) this).field_Y = ((wo) this).field_Y + 1;
                                    if (0 == ((wo) this).field_Y) {
                                      if (((wo) this).field_i) {
                                        break L16;
                                      } else {
                                        if (param3) {
                                          qg.a(param5 + -18112, 500, 26, 0);
                                          break L16;
                                        } else {
                                          break L16;
                                        }
                                      }
                                    } else {
                                      break L16;
                                    }
                                  }
                                  if (param4 == 2) {
                                    return 1;
                                  } else {
                                    if (param4 != 4) {
                                      return 26;
                                    } else {
                                      return 3;
                                    }
                                  }
                                } else {
                                  break L1;
                                }
                              }
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      if (0 >= ((wo) this).field_Y) {
                        break L1;
                      } else {
                        if (!param1) {
                          break L1;
                        } else {
                          L17: {
                            var7 = ((wo) this).field_W;
                            ((wo) this).field_W = ((wo) this).field_W + 10;
                            if (((wo) this).field_W < 32767) {
                              break L17;
                            } else {
                              ((wo) this).field_W = 32767;
                              break L17;
                            }
                          }
                          L18: {
                            if (((wo) this).field_i) {
                              break L18;
                            } else {
                              if (((wo) this).field_T) {
                                break L18;
                              } else {
                                if (((wo) this).field_r) {
                                  break L18;
                                } else {
                                  if (0 >= -var7 + ((wo) this).field_W) {
                                    break L18;
                                  } else {
                                    var8 = ((wo) this).field_W - var7;
                                    if (ln.field_d == null) {
                                      break L18;
                                    } else {
                                      if (ln.field_d.field_B < 0) {
                                        break L18;
                                      } else {
                                        if (null != oe.field_pb) {
                                          break L18;
                                        } else {
                                          var9 = ln.field_d.field_s % 3;
                                          if (0 == var9) {
                                            gi.field_u = gi.field_u + var8;
                                            break L18;
                                          } else {
                                            if (var9 == 1) {
                                              pn.field_R = pn.field_R - var8;
                                              break L18;
                                            } else {
                                              var10 = var8 / 3;
                                              gi.field_u = gi.field_u + var10;
                                              pn.field_R = pn.field_R - (var8 + -var10);
                                              break L18;
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
                          L19: {
                            ((wo) this).field_j = ((wo) this).field_j + 1;
                            ((wo) this).field_Y = ((wo) this).field_Y - 1;
                            if (((wo) this).field_Y == 0) {
                              if (((wo) this).field_i) {
                                break L19;
                              } else {
                                if (param3) {
                                  qg.a(1, 500, 26, 0);
                                  break L19;
                                } else {
                                  break L19;
                                }
                              }
                            } else {
                              break L19;
                            }
                          }
                          if (param4 == 1) {
                            return 2;
                          } else {
                            if (3 == param4) {
                              return 4;
                            } else {
                              return 25;
                            }
                          }
                        }
                      }
                    } else {
                      if (param1) {
                        ((wo) this).field_R = true;
                        return 3;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              } else {
                if (!param1) {
                  break L1;
                } else {
                  if (((wo) this).field_J == 4) {
                    break L1;
                  } else {
                    if (((wo) this).field_J == 7) {
                      break L1;
                    } else {
                      if (((wo) this).field_J != 8) {
                        ((wo) this).field_t = 130;
                        ((wo) this).field_J = 4;
                        ((wo) this).field_E = 64 + 128 * lj.a(((wo) this).field_E, false, 128);
                        ((wo) this).field_y = lj.a(((wo) this).field_y, false, 128) * 128 - -64;
                        ((wo) this).field_k = lj.a(((wo) this).field_k, false, 240) * 240;
                        ((wo) this).field_h = 0;
                        ((wo) this).field_d = param0;
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
            } else {
              if (((wo) this).field_Y != 0) {
                break L1;
              } else {
                if (param1) {
                  L20: {
                    L21: {
                      if (((wo) this).field_l == 1) {
                        break L21;
                      } else {
                        if (!((wo) this).field_x) {
                          break L21;
                        } else {
                          break L20;
                        }
                      }
                    }
                    ((wo) this).field_Y = -5;
                    if (((wo) this).field_i) {
                      break L20;
                    } else {
                      if (!param3) {
                        break L20;
                      } else {
                        gm.a(8, (byte) -55);
                        break L20;
                      }
                    }
                  }
                  L22: {
                    if (param2 == 2) {
                      stackOut_39_0 = 10;
                      stackIn_40_0 = stackOut_39_0;
                      break L22;
                    } else {
                      stackOut_38_0 = 3;
                      stackIn_40_0 = stackOut_38_0;
                      break L22;
                    }
                  }
                  return stackIn_40_0;
                } else {
                  break L1;
                }
              }
            }
          }
        }
        return -1;
    }

    final int c(byte param0) {
        if (param0 >= -126) {
            ((wo) this).field_o = false;
        }
        return ((wo) this).field_h;
    }

    final boolean e(boolean param0) {
        if (param0) {
            ((wo) this).field_n = -51;
        }
        return ((wo) this).field_J == 7 ? true : false;
    }

    final boolean f(int param0) {
        if (param0 != -1) {
            ((wo) this).field_t = -37;
        }
        return ((wo) this).field_h > 0 ? true : false;
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, int param5) {
        aj.field_f[cq.field_i] = param3;
        ac.field_I[cq.field_i] = cq.field_i;
        on.field_e[cq.field_i] = param0;
        if (!(param0 <= ug.field_b)) {
            id.field_d = param0;
        }
        if (!(param0 >= q.field_x)) {
            f.field_y = param0;
        }
        if (!param2) {
            wo.a(36, -58, true, -105, -9, -63);
        }
        li.field_g[cq.field_i] = param4;
        ub.field_p[cq.field_i] = param1;
        jf.field_N[cq.field_i] = param5;
        int var6 = param5 + param1 + param4;
        int var7 = var6 != 0 ? 1000 * param4 / var6 : 0;
        hm.field_A[cq.field_i] = var7;
        if (!(f.field_y <= var7)) {
            f.field_y = var7;
        }
        if (!(var7 <= id.field_d)) {
            id.field_d = var7;
        }
        cq.field_i = cq.field_i + 1;
    }

    final void a(wo param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              ((wo) this).field_j = param0.field_j;
              ((wo) this).field_M = param0.field_M;
              ((wo) this).field_H = param0.field_H;
              ((wo) this).field_o = param0.field_o;
              ((wo) this).field_W = param0.field_W;
              ((wo) this).field_p = param0.field_p;
              ((wo) this).field_C = param0.field_C;
              ((wo) this).field_F = param0.field_F;
              ((wo) this).field_a = param0.field_a;
              ((wo) this).field_d = param0.field_d;
              ((wo) this).field_R = param0.field_R;
              ((wo) this).field_Z = param0.field_Z;
              ((wo) this).field_N = param0.field_N;
              ((wo) this).field_A = param0.field_A;
              ((wo) this).field_k = param0.field_k;
              ((wo) this).field_E = param0.field_E;
              ((wo) this).field_ab = param0.field_ab;
              ((wo) this).field_g = param0.field_g;
              ((wo) this).field_t = param0.field_t;
              ((wo) this).field_h = param0.field_h;
              ((wo) this).field_e = param0.field_e;
              ((wo) this).field_O = param0.field_O;
              ((wo) this).field_m = param0.field_m;
              ((wo) this).field_Y = param0.field_Y;
              ((wo) this).field_f = param0.field_f;
              ((wo) this).field_K = param0.field_K;
              ((wo) this).field_X = param0.field_X;
              ((wo) this).field_n = param0.field_n;
              ((wo) this).field_u = param0.field_u;
              ((wo) this).field_y = param0.field_y;
              ((wo) this).field_c = param0.field_c;
              ((wo) this).field_J = param0.field_J;
              ((wo) this).field_B = param0.field_B;
              if (param1 == 16777215) {
                break L1;
              } else {
                ((wo) this).field_g = -26;
                break L1;
              }
            }
            ((wo) this).field_G = param0.field_G;
            ((wo) this).field_bb = param0.field_bb;
            ((wo) this).field_z = param0.field_z;
            ((wo) this).field_U = param0.field_U;
            ((wo) this).field_I = param0.field_I;
            ((wo) this).field_Q = param0.field_Q;
            ((wo) this).field_D = param0.field_D;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("wo.U(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
    }

    final void c(int param0) {
        if (((wo) this).field_J != 4) {
          L0: {
            if (((wo) this).field_J == 7) {
              break L0;
            } else {
              L1: {
                if (((wo) this).field_J == 6) {
                  break L1;
                } else {
                  if (((wo) this).field_J == 8) {
                    break L1;
                  } else {
                    if (((wo) this).field_J == 2) {
                      break L1;
                    } else {
                      if (((wo) this).field_J == 3) {
                        break L1;
                      } else {
                        if (10 == ((wo) this).field_J) {
                          return;
                        } else {
                          L2: {
                            if (((wo) this).field_B <= 4) {
                              break L2;
                            } else {
                              if (((wo) this).field_B < 12) {
                                if (0 < ((wo) this).field_U) {
                                  this.e(7883);
                                  return;
                                } else {
                                  break L2;
                                }
                              } else {
                                break L2;
                              }
                            }
                          }
                          ((wo) this).field_B = 0;
                          if (!((wo) this).field_z) {
                            break L0;
                          } else {
                            L3: {
                              if (((wo) this).field_J == 1) {
                                break L3;
                              } else {
                                if (((wo) this).field_J == 9) {
                                  break L3;
                                } else {
                                  if (((wo) this).field_h >= 0) {
                                    L4: {
                                      ((wo) this).field_t = 6;
                                      if (param0 == 3) {
                                        break L4;
                                      } else {
                                        boolean discarded$2 = ((wo) this).f(8);
                                        break L4;
                                      }
                                    }
                                    ((wo) this).field_J = 1;
                                    return;
                                  } else {
                                    break L3;
                                  }
                                }
                              }
                            }
                            return;
                          }
                        }
                      }
                    }
                  }
                }
              }
              return;
            }
          }
          return;
        } else {
          L5: {
            ((wo) this).field_J = 4;
            if (((wo) this).field_t > 1) {
              ((wo) this).field_t = 1;
              break L5;
            } else {
              break L5;
            }
          }
          return;
        }
    }

    final int g(byte param0) {
        if (param0 != 121) {
            ((wo) this).d((byte) -23);
        }
        return ((wo) this).field_j;
    }

    final boolean a(byte param0, int param1) {
        if (param0 <= 49) {
            ((wo) this).field_t = -89;
        }
        if (param1 == ((wo) this).field_u) {
            return false;
        }
        ((wo) this).field_u = param1;
        return true;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((wo) this).field_k = param1;
        ((wo) this).field_E = param4;
        if (param0 != 12649) {
            ((wo) this).e((byte) 122);
        }
        ((wo) this).field_y = param2;
        if (((wo) this).field_J != 2) {
            if (!(((wo) this).field_J != 3)) {
                return;
            }
            ((wo) this).field_bb = param3;
            ((wo) this).field_t = 86;
            ((wo) this).field_Z = param6;
            ((wo) this).field_K = param5;
            ((wo) this).field_h = 0;
            ((wo) this).field_J = 2;
            return;
        }
    }

    final void b(boolean param0) {
        ((wo) this).field_d = -1;
        ((wo) this).field_n = 0;
        ((wo) this).field_z = false;
        ((wo) this).field_e = false;
        ((wo) this).field_O = 0;
        ((wo) this).field_J = 0;
        ((wo) this).field_y = ((wo) this).field_I;
        ((wo) this).field_o = false;
        ((wo) this).field_E = ((wo) this).field_a;
        ((wo) this).field_g = 0;
        ((wo) this).field_t = 0;
        ((wo) this).field_Y = 0;
        ((wo) this).field_X = -36;
        ((wo) this).field_B = 0;
        ((wo) this).field_N = 0;
        ((wo) this).field_G = false;
        ((wo) this).field_h = 0;
        ((wo) this).field_R = param0 ? true : false;
        ((wo) this).field_k = ((wo) this).field_m;
        ((wo) this).field_U = 0;
        ((wo) this).field_H = 0;
        ((wo) this).field_c = 0;
    }

    final boolean c(boolean param0) {
        if (!param0) {
            ((wo) this).field_g = 76;
        }
        return ((wo) this).field_U > 0 ? true : false;
    }

    final boolean a(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param0 == 703) {
            break L0;
          } else {
            int discarded$2 = ((wo) this).c((byte) 89);
            break L0;
          }
        }
        L1: {
          L2: {
            if (((wo) this).field_J == 7) {
              break L2;
            } else {
              if (((wo) this).field_J == 8) {
                break L2;
              } else {
                if (((wo) this).field_J == 4) {
                  break L2;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
            }
          }
          stackOut_6_0 = 0;
          stackIn_7_0 = stackOut_6_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    final void a(byte param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_62_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_71_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_69_0 = 0;
        L0: {
          var9 = Vertigo2.field_L ? 1 : 0;
          ((wo) this).field_t = ((wo) this).field_t - 1;
          if (((wo) this).field_v >= 31) {
            break L0;
          } else {
            ((wo) this).field_v = (byte)(((wo) this).field_v + 1);
            break L0;
          }
        }
        L1: {
          ((wo) this).field_B = ((wo) this).field_B + 1;
          ((wo) this).field_D = ((wo) this).field_D + 1;
          var3 = ((wo) this).field_J;
          if (7 != var3) {
            if (var3 != 2) {
              if (var3 == 6) {
                ((wo) this).field_u = 0;
                if (0 != ((wo) this).field_t) {
                  return;
                } else {
                  ((wo) this).field_J = 0;
                  break L1;
                }
              } else {
                L2: {
                  if (5 == var3) {
                    break L2;
                  } else {
                    if (var3 != 9) {
                      if (var3 != 3) {
                        if (1 == var3) {
                          if (((wo) this).field_t != 0) {
                            return;
                          } else {
                            ((wo) this).field_h = ((wo) this).field_X;
                            ((wo) this).field_J = 0;
                            ((wo) this).field_f = lj.a(((wo) this).field_k, false, 240);
                            break L1;
                          }
                        } else {
                          if (var3 != 4) {
                            if (var3 != 8) {
                              if (var3 == 10) {
                                L3: {
                                  if (((wo) this).field_t == 10) {
                                    ((wo) this).field_o = true;
                                    break L3;
                                  } else {
                                    break L3;
                                  }
                                }
                                if (((wo) this).field_t == 0) {
                                  ((wo) this).field_J = 0;
                                  break L1;
                                } else {
                                  return;
                                }
                              } else {
                                ((wo) this).field_X = -36;
                                break L1;
                              }
                            } else {
                              break L1;
                            }
                          } else {
                            if (((wo) this).field_t != 0) {
                              return;
                            } else {
                              ((wo) this).field_G = false;
                              ((wo) this).field_e = true;
                              if (!((wo) this).h((byte) 117)) {
                                ((wo) this).field_J = 7;
                                ((wo) this).field_t = 50;
                                break L1;
                              } else {
                                ((wo) this).field_J = 8;
                                if (!((wo) this).field_i) {
                                  db.a(false, 12, (byte) 36, nq.field_D, false, 12);
                                  break L1;
                                } else {
                                  break L1;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        if (((wo) this).field_t != 0) {
                          return;
                        } else {
                          ((wo) this).field_J = 0;
                          break L1;
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                }
                L4: {
                  if (((wo) this).field_t != 0) {
                    break L4;
                  } else {
                    ((wo) this).field_J = 0;
                    break L4;
                  }
                }
                ((wo) this).field_c = 0;
                ((wo) this).field_O = 0;
                break L1;
              }
            } else {
              if (0 != ((wo) this).field_t) {
                return;
              } else {
                ((wo) this).field_y = ((wo) this).field_Z;
                ((wo) this).field_k = ((wo) this).field_bb;
                ((wo) this).field_c = 0;
                ((wo) this).field_O = 0;
                ((wo) this).field_h = 0;
                ((wo) this).field_A = true;
                ((wo) this).field_J = 3;
                ((wo) this).field_t = 37;
                ((wo) this).field_E = ((wo) this).field_K;
                ((wo) this).field_n = 0;
                break L1;
              }
            }
          } else {
            if (((wo) this).field_t == 0) {
              L5: {
                if (!((wo) this).field_x) {
                  break L5;
                } else {
                  ((wo) this).b(false);
                  break L5;
                }
              }
              ((wo) this).field_J = 6;
              ((wo) this).field_t = 250;
              break L1;
            } else {
              return;
            }
          }
        }
        L6: {
          this.i((byte) -117);
          if (9 == ((wo) this).field_J) {
            break L6;
          } else {
            L7: {
              if (0 == (1 & ((wo) this).field_u)) {
                stackOut_61_0 = 0;
                stackIn_62_0 = stackOut_61_0;
                break L7;
              } else {
                stackOut_60_0 = 1;
                stackIn_62_0 = stackOut_60_0;
                break L7;
              }
            }
            L8: {
              var3 = stackIn_62_0;
              if ((2 & ((wo) this).field_u) == 0) {
                stackOut_64_0 = 0;
                stackIn_65_0 = stackOut_64_0;
                break L8;
              } else {
                stackOut_63_0 = 1;
                stackIn_65_0 = stackOut_63_0;
                break L8;
              }
            }
            L9: {
              var4 = stackIn_65_0;
              if ((4 & ((wo) this).field_u) == 0) {
                stackOut_67_0 = 0;
                stackIn_68_0 = stackOut_67_0;
                break L9;
              } else {
                stackOut_66_0 = 1;
                stackIn_68_0 = stackOut_66_0;
                break L9;
              }
            }
            L10: {
              var5 = stackIn_68_0;
              if ((((wo) this).field_u & 8) == 0) {
                stackOut_70_0 = 0;
                stackIn_71_0 = stackOut_70_0;
                break L10;
              } else {
                stackOut_69_0 = 1;
                stackIn_71_0 = stackOut_69_0;
                break L10;
              }
            }
            L11: {
              var6 = stackIn_71_0;
              var7 = 0;
              if (var3 != 0) {
                var7 = -25;
                break L11;
              } else {
                break L11;
              }
            }
            L12: {
              var8 = 0;
              if (var6 == 0) {
                break L12;
              } else {
                var8 = -25;
                break L12;
              }
            }
            L13: {
              if (var4 == 0) {
                break L13;
              } else {
                var7 = 25;
                break L13;
              }
            }
            L14: {
              ((wo) this).field_c = ((wo) this).field_c + var7;
              if (var5 == 0) {
                break L14;
              } else {
                var8 = 25;
                break L14;
              }
            }
            L15: {
              ((wo) this).field_O = ((wo) this).field_O + var8;
              if (((wo) this).field_c >= -256) {
                if (((wo) this).field_c <= 256) {
                  break L15;
                } else {
                  ((wo) this).field_c = 256;
                  break L15;
                }
              } else {
                ((wo) this).field_c = -256;
                break L15;
              }
            }
            L16: {
              ((wo) this).field_Q = ((wo) this).field_y;
              if (((wo) this).field_O < -256) {
                ((wo) this).field_O = -256;
                break L16;
              } else {
                if (256 >= ((wo) this).field_O) {
                  break L16;
                } else {
                  ((wo) this).field_O = 256;
                  break L16;
                }
              }
            }
            L17: {
              L18: {
                ((wo) this).field_M = ((wo) this).field_E;
                ((wo) this).field_E = ((wo) this).field_E + ((wo) this).field_c / 22;
                ((wo) this).field_y = ((wo) this).field_y + ((wo) this).field_O / 22;
                if (9 <= ((wo) this).field_O) {
                  break L18;
                } else {
                  if (((wo) this).field_O <= -9) {
                    break L18;
                  } else {
                    ((wo) this).field_O = 0;
                    break L17;
                  }
                }
              }
              if (((wo) this).field_O > 0) {
                ((wo) this).field_O = ((wo) this).field_O - 9;
                break L17;
              } else {
                if (((wo) this).field_O >= 0) {
                  break L17;
                } else {
                  ((wo) this).field_O = ((wo) this).field_O + 9;
                  break L17;
                }
              }
            }
            L19: {
              L20: {
                if (((wo) this).field_c >= 9) {
                  break L20;
                } else {
                  if (((wo) this).field_c <= -9) {
                    break L20;
                  } else {
                    ((wo) this).field_c = 0;
                    break L19;
                  }
                }
              }
              if (((wo) this).field_c > 0) {
                ((wo) this).field_c = ((wo) this).field_c - 9;
                break L19;
              } else {
                if (0 > ((wo) this).field_c) {
                  ((wo) this).field_c = ((wo) this).field_c + 9;
                  break L19;
                } else {
                  break L19;
                }
              }
            }
            L21: {
              L22: {
                if (((wo) this).field_N == 1) {
                  break L22;
                } else {
                  if (((wo) this).field_N != 3) {
                    ((wo) this).field_N = 0;
                    break L21;
                  } else {
                    break L22;
                  }
                }
              }
              ((wo) this).field_N = 2;
              break L21;
            }
            if (5 != ((wo) this).field_J) {
              L23: {
                if (((wo) this).field_c != 0) {
                  break L23;
                } else {
                  if (0 == ((wo) this).field_O) {
                    break L6;
                  } else {
                    break L23;
                  }
                }
              }
              ((wo) this).c((int)(325.944 * Math.atan2((double)((wo) this).field_c, (double)((wo) this).field_O) + 1024.0) & 2047, 10);
              break L6;
            } else {
              return;
            }
          }
        }
        L24: {
          if (16 <= ((wo) this).field_h) {
            ((wo) this).field_h = 16;
            break L24;
          } else {
            ((wo) this).field_h = ((wo) this).field_h + 2;
            break L24;
          }
        }
        L25: {
          if (!param1) {
            break L25;
          } else {
            if (((wo) this).field_k <= 4080) {
              break L25;
            } else {
              if (((wo) this).field_J == 4) {
                break L25;
              } else {
                if (7 == ((wo) this).field_J) {
                  break L25;
                } else {
                  if (((wo) this).field_J == 8) {
                    break L25;
                  } else {
                    if (((wo) this).field_J != 6) {
                      ((wo) this).field_G = true;
                      ((wo) this).field_J = 4;
                      ((wo) this).field_t = 130;
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                }
              }
            }
          }
        }
        L26: {
          if (!((wo) this).field_G) {
            break L26;
          } else {
            L27: {
              if (((wo) this).field_h < 16) {
                ((wo) this).field_h = ((wo) this).field_h + 2;
                break L27;
              } else {
                ((wo) this).field_h = 16;
                break L27;
              }
            }
            ((wo) this).field_k = ((wo) this).field_k + ((wo) this).field_h;
            break L26;
          }
        }
        L28: {
          if (param0 == 80) {
            break L28;
          } else {
            ((wo) this).field_T = false;
            break L28;
          }
        }
    }

    final int m(int param0) {
        if (param0 != -1) {
            ((wo) this).a(true, 50);
        }
        return ((wo) this).field_Y;
    }

    final void e(byte param0) {
        if (!(10 != ((wo) this).field_J)) {
            return;
        }
        if (param0 > -106) {
            return;
        }
        if (((wo) this).field_g > 0) {
            if (((wo) this).field_z) {
                ((wo) this).field_g = ((wo) this).field_g - 1;
                ((wo) this).field_t = 49;
                ((wo) this).field_J = 10;
            }
        }
    }

    final boolean j(byte param0) {
        if (((wo) this).field_o) {
            ((wo) this).field_o = false;
            return true;
        }
        int var2 = -24 / ((param0 - 60) / 43);
        return false;
    }

    final boolean a(boolean param0) {
        if (param0) {
            ((wo) this).field_G = false;
        }
        if (((wo) this).field_F) {
            ((wo) this).field_F = false;
            return true;
        }
        return false;
    }

    public static void n(int param0) {
        field_b = null;
        field_q = null;
        if (param0 != 511) {
            field_V = null;
        }
        field_V = null;
    }

    final int b(int param0) {
        if (param0 != -1) {
            return -71;
        }
        return ((wo) this).field_J;
    }

    final void l(byte param0) {
        if (param0 != -89) {
            ((wo) this).e((byte) -61);
        }
        if (7 > ((wo) this).field_U) {
            ((wo) this).field_U = ((wo) this).field_U + 1;
        }
    }

    final void a(byte param0) {
        if (param0 != -88) {
            ((wo) this).field_O = 99;
        }
        ((wo) this).field_J = 0;
        ((wo) this).field_U = 0;
    }

    final int a(int param0, int param1, int param2) {
        int var4 = 0;
        int var6 = Vertigo2.field_L ? 1 : 0;
        for (var4 = 0; param1 > var4; var4++) {
            if (!(((wo) this).field_L[var4] != param2)) {
                return param1;
            }
        }
        int var5 = -18 / ((6 - param0) / 62);
        int incrementValue$0 = param1;
        param1++;
        ((wo) this).field_L[incrementValue$0] = param2;
        return param1;
    }

    final boolean k(byte param0) {
        if (param0 <= 63) {
            boolean discarded$0 = ((wo) this).j((byte) 14);
        }
        return ((wo) this).field_R;
    }

    final void d(byte param0) {
        if (param0 != 4) {
            return;
        }
        ((wo) this).field_ab = ((wo) this).field_ab + 1;
        if (!(15 >= ((wo) this).field_ab)) {
            ((wo) this).field_ab = 15;
        }
    }

    final void c(int param0, int param1) {
        ((wo) this).field_n = param0;
        if (param1 != 10) {
            ((wo) this).field_P = null;
        }
    }

    final int h(int param0) {
        if (param0 != 13289) {
            int discarded$0 = ((wo) this).l(121);
        }
        return ((wo) this).field_u;
    }

    final void a(boolean param0, int param1) {
        ((wo) this).field_ab = param1;
        if (!param0) {
            this.e(58);
        }
    }

    final void d(int param0) {
        ((wo) this).field_R = false;
        if (param0 != -5) {
            ((wo) this).a(8, 71, -46, 103, 78, -54, 73);
        }
    }

    final boolean f(byte param0) {
        if (param0 <= 32) {
            ((wo) this).a(true, 117, 83);
        }
        return ((wo) this).field_J == 8 ? true : false;
    }

    wo(int param0, boolean param1, int param2, boolean param3, boolean param4, boolean param5) {
        ((wo) this).field_X = -36;
        ((wo) this).field_A = false;
        ((wo) this).field_ab = 3;
        ((wo) this).field_d = -1;
        ((wo) this).field_i = param1 ? true : false;
        ((wo) this).field_P = new int[9];
        ((wo) this).field_T = param5 ? true : false;
        ((wo) this).field_l = param0;
        ((wo) this).field_r = param3 ? true : false;
        ((wo) this).field_x = param4 ? true : false;
        ((wo) this).field_L = new int[9];
        ((wo) this).field_w = param2;
        ((wo) this).field_J = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new lg[2];
        field_S = 0.0;
        field_V = new String[]{"Game type", "Starting level", "Number of levels"};
        field_b = "Who can join";
        field_s = false;
    }
}
