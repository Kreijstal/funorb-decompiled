/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nu {
    private boolean field_W;
    private boolean field_w;
    int field_I;
    int field_v;
    int field_c;
    static String field_M;
    tf field_E;
    private int field_U;
    boolean field_f;
    int field_O;
    static String field_D;
    static boolean field_j;
    String[] field_S;
    int field_u;
    private boolean field_T;
    boolean field_L;
    boolean field_e;
    boolean field_l;
    tj field_V;
    int[] field_d;
    boolean field_h;
    boolean field_y;
    oe field_n;
    up[][] field_b;
    la[] field_B;
    wr field_C;
    boolean field_A;
    it[] field_g;
    la[] field_x;
    boolean field_z;
    private p field_ab;
    int field_Z;
    private boolean[] field_F;
    int field_t;
    int[] field_r;
    private jc[] field_q;
    boolean field_p;
    boolean field_s;
    ua field_X;
    nl[][] field_P;
    int[][] field_i;
    int field_J;
    boolean field_Y;
    static String field_a;
    private ch field_N;
    int[] field_H;
    gt[] field_R;
    boolean field_G;
    int field_m;
    int[][] field_k;
    wl field_o;
    int[] field_Q;

    final void a(ml param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        var5 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (param1 == -5) {
                break L1;
              } else {
                nu.b(false);
                break L1;
              }
            }
            param0.p(-103);
            int discarded$2 = 16;
            ((nu) this).field_v = sk.a(param1 ^ -19886, 8, 0, 4, param0) - 1;
            var3_int = 0;
            L2: while (true) {
              if (~var3_int <= ~((nu) this).field_I) {
                L3: {
                  if (((nu) this).field_u != 0) {
                    break L3;
                  } else {
                    ((nu) this).field_n.b(param0, 4);
                    ((nu) this).field_n.a(param1 ^ 65, param0);
                    break L3;
                  }
                }
                L4: {
                  if (2 != ((nu) this).field_u) {
                    break L4;
                  } else {
                    ((nu) this).field_C.b(param0, ~param1);
                    ((nu) this).field_C.c(param0, param1 + 7);
                    break L4;
                  }
                }
                L5: {
                  if (3 == ((nu) this).field_u) {
                    ((nu) this).field_o.b(param0, 4);
                    ((nu) this).field_o.a(param0, false);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (((nu) this).field_u == 4) {
                    ((nu) this).field_V.b(param0, 4);
                    var3_int = 0;
                    L7: while (true) {
                      if (var3_int >= 2) {
                        ((nu) this).field_X.b(param0, 4);
                        var3_int = 0;
                        L8: while (true) {
                          if (var3_int >= 2) {
                            ((nu) this).field_V.c(param0, 17);
                            ((nu) this).field_X.a(param0, (byte) -65);
                            ((nu) this).field_J = param0.l(8, 59);
                            int discarded$3 = -39;
                            ((nu) this).field_G = mu.a(param0);
                            break L6;
                          } else {
                            var4 = 0;
                            L9: while (true) {
                              if (var4 >= 5) {
                                var3_int++;
                                continue L8;
                              } else {
                                ((nu) this).field_P[var3_int][var4].b(9, param0);
                                var4++;
                                continue L9;
                              }
                            }
                          }
                        }
                      } else {
                        var4 = 0;
                        L10: while (true) {
                          if (5 <= var4) {
                            var3_int++;
                            continue L7;
                          } else {
                            ((nu) this).field_P[var3_int][var4].b(param0, 4);
                            var4++;
                            continue L10;
                          }
                        }
                      }
                    }
                  } else {
                    break L6;
                  }
                }
                param0.l((byte) 115);
                break L0;
              } else {
                ((nu) this).field_R[var3_int].b(param0, param1 + 9);
                ((nu) this).field_R[var3_int].c(param0, param1 ^ -6);
                var3_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var3 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) var3;
            stackOut_41_1 = new StringBuilder().append("nu.C(");
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
              break L11;
            } else {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "{...}";
              stackIn_45_0 = stackOut_42_0;
              stackIn_45_1 = stackOut_42_1;
              stackIn_45_2 = stackOut_42_2;
              break L11;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_45_0, stackIn_45_2 + ',' + param1 + ')');
        }
    }

    private final void b(byte param0, ki param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        nl var5 = null;
        nl stackIn_61_0 = null;
        nl stackIn_63_0 = null;
        nl stackIn_64_0 = null;
        int stackIn_64_1 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        RuntimeException decompiledCaughtException = null;
        nl stackOut_60_0 = null;
        nl stackOut_63_0 = null;
        int stackOut_63_1 = 0;
        nl stackOut_61_0 = null;
        int stackOut_61_1 = 0;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        try {
          L0: {
            if (((nu) this).field_u == 4) {
              L1: {
                if (null == ((nu) this).field_X) {
                  break L1;
                } else {
                  if (((nu) this).field_X.field_m < 40) {
                    break L1;
                  } else {
                    return;
                  }
                }
              }
              L2: {
                if (((nu) this).field_O == -1) {
                  break L2;
                } else {
                  if (((nu) this).field_O >= ((nu) this).field_v) {
                    break L2;
                  } else {
                    return;
                  }
                }
              }
              var3_int = param1.field_u;
              var4 = param1.field_v & 255;
              if (((nu) this).field_R[var3_int].d(3511)) {
                L3: {
                  var5 = ((nu) this).a((byte) 92, var3_int);
                  if (var4 < 1) {
                    break L3;
                  } else {
                    if (var4 > 5) {
                      break L3;
                    } else {
                      if (!((nu) this).field_h) {
                        ((nu) this).field_R[var3_int].field_p = var4 + -1;
                        ((nu) this).field_R[var3_int].a((mo) (Object) ((nu) this).field_g[var3_int], (byte) 84);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                L4: {
                  if (0 != var4) {
                    break L4;
                  } else {
                    if (((nu) this).field_A) {
                      break L4;
                    } else {
                      L5: {
                        if (var5.field_N.c(var5.field_y, -73)) {
                          break L5;
                        } else {
                          if (((nu) this).c(var3_int, -32)) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      if (0 != var5.field_C) {
                        break L4;
                      } else {
                        if (0 == var5.field_u) {
                          var5.a((mo) (Object) ((nu) this).field_g[var3_int], (byte) 84);
                          var5.a((byte) -31, 4);
                          var5.field_C = var5.a((byte) -99);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                L6: {
                  L7: {
                    L8: {
                      if (var4 != 6) {
                        break L8;
                      } else {
                        if (!((nu) this).field_y) {
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                    if (var4 != 7) {
                      break L6;
                    } else {
                      if (!((nu) this).field_z) {
                        break L7;
                      } else {
                        break L6;
                      }
                    }
                  }
                  if (var5.field_u != 0) {
                    break L6;
                  } else {
                    if (((nu) this).c(var3_int, -126)) {
                      L9: {
                        var5.a((byte) -31, 1);
                        stackOut_60_0 = (nl) var5;
                        stackIn_63_0 = stackOut_60_0;
                        stackIn_61_0 = stackOut_60_0;
                        if (var4 != 7) {
                          stackOut_63_0 = (nl) (Object) stackIn_63_0;
                          stackOut_63_1 = 0;
                          stackIn_64_0 = stackOut_63_0;
                          stackIn_64_1 = stackOut_63_1;
                          break L9;
                        } else {
                          stackOut_61_0 = (nl) (Object) stackIn_61_0;
                          stackOut_61_1 = 1;
                          stackIn_64_0 = stackOut_61_0;
                          stackIn_64_1 = stackOut_61_1;
                          break L9;
                        }
                      }
                      stackIn_64_0.field_O = stackIn_64_1 != 0;
                      var5.field_L = var5.c((byte) -99);
                      var5.a((mo) (Object) ((nu) this).field_g[var3_int], (byte) 84);
                      break L6;
                    } else {
                      break L6;
                    }
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
          L10: {
            var3 = decompiledCaughtException;
            stackOut_66_0 = (RuntimeException) var3;
            stackOut_66_1 = new StringBuilder().append("nu.G(").append(125).append(',');
            stackIn_69_0 = stackOut_66_0;
            stackIn_69_1 = stackOut_66_1;
            stackIn_67_0 = stackOut_66_0;
            stackIn_67_1 = stackOut_66_1;
            if (param1 == null) {
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
          throw nb.a((Throwable) (Object) stackIn_70_0, stackIn_70_2 + ')');
        }
    }

    final int c(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        var5 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              var2_int = 0;
              if (((nu) this).field_u == 4) {
                var3 = 0;
                L2: while (true) {
                  if (var3 >= 2) {
                    var2_int = var2_int ^ ((nu) this).field_X.c(0);
                    var2_int = var2_int ^ ((nu) this).field_V.d(121);
                    break L1;
                  } else {
                    var4 = 0;
                    L3: while (true) {
                      if (var4 >= 5) {
                        var3++;
                        continue L2;
                      } else {
                        var2_int = var2_int ^ ((nu) this).field_P[var3][var4].b((byte) -65);
                        var4++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                break L1;
              }
            }
            var3 = 71 % ((param0 - 16) / 38);
            stackOut_13_0 = var2_int;
            stackIn_14_0 = stackOut_13_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2, "nu.Q(" + param0 + ')');
        }
        return stackIn_14_0;
    }

    final boolean a(int param0, boolean param1, long param2, int param3, int param4) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        up var11 = null;
        int var12 = 0;
        int var13 = 0;
        int stackIn_5_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_36_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_19_0 = 0;
        var13 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (param4 < 2) {
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
                var7_int = stackIn_5_0;
                if (param2 == 1272878999115L) {
                  break L3;
                } else {
                  if (param2 != 1272878132285L) {
                    stackOut_11_0 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_9_0 = 1;
              stackIn_12_0 = stackOut_9_0;
              break L2;
            }
            L4: {
              var8 = stackIn_12_0;
              if (var8 != 0) {
                break L4;
              } else {
                L5: {
                  if (var7_int == 0) {
                    break L5;
                  } else {
                    if (param0 == 11) {
                      break L5;
                    } else {
                      break L4;
                    }
                  }
                }
                if (!param1) {
                  var9 = 0;
                  L6: while (true) {
                    if (var9 >= 4) {
                      stackOut_35_0 = 0;
                      stackIn_36_0 = stackOut_35_0;
                      break L0;
                    } else {
                      L7: {
                        var10 = ((nu) this).field_g[param3].field_p;
                        if (param3 != ((nu) this).field_i[var10][var9]) {
                          break L7;
                        } else {
                          var11 = ((nu) this).field_P[var10][1 + var9].field_N;
                          var12 = ((nu) this).field_P[var10][var9 - -1].field_y ? 1 : 0;
                          if (var11.a(true, param0, var12 != 0)) {
                            stackOut_32_0 = 1;
                            stackIn_33_0 = stackOut_32_0;
                            return stackIn_33_0 != 0;
                          } else {
                            break L7;
                          }
                        }
                      }
                      var9++;
                      continue L6;
                    }
                  }
                } else {
                  stackOut_22_0 = 1;
                  stackIn_23_0 = stackOut_22_0;
                  return stackIn_23_0 != 0;
                }
              }
            }
            stackOut_19_0 = 1;
            stackIn_20_0 = stackOut_19_0;
            return stackIn_20_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var7, "nu.J(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_36_0 != 0;
    }

    final int b(byte param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_11_0 = 0;
        var5 = Kickabout.field_G;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              if (~((nu) this).field_g.length >= ~var3_int) {
                var4 = 120 % ((param0 - -10) / 47);
                stackOut_14_0 = 0;
                stackIn_15_0 = stackOut_14_0;
                break L0;
              } else {
                L2: {
                  if (((nu) this).field_g[var3_int].field_p != param1) {
                    break L2;
                  } else {
                    if (((nu) this).field_R[var3_int].d(3511)) {
                      stackOut_11_0 = var3_int;
                      stackIn_12_0 = stackOut_11_0;
                      return stackIn_12_0;
                    } else {
                      break L2;
                    }
                  }
                }
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var3, "nu.HA(" + param0 + ',' + param1 + ')');
        }
        return stackIn_15_0;
    }

    private final void a(int param0, ki param1) {
        RuntimeException var3 = null;
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
            if (0 == ((nu) this).field_u) {
              if (!((nu) this).field_R[param1.field_u].d(3511)) {
                return;
              } else {
                ((nu) this).field_n.a(param1.field_u, 11678, param1.field_v);
                ((nu) this).field_n.a((mo) (Object) ((nu) this).field_g[param1.field_u], (byte) 84);
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("nu.KA(").append(1).append(',');
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
              break L1;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L1;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
    }

    private final void b() {
        int var2_int = 0;
        nl var2 = null;
        int var3 = 0;
        nl var4_ref_nl = null;
        int var4 = 0;
        int var5_int = 0;
        nl var5 = null;
        int var6 = 0;
        nl var6_ref_nl = null;
        int var7 = 0;
        int var8_int = 0;
        nl var8 = null;
        int var9 = 0;
        int var10 = 0;
        long var10_long = 0L;
        int var11 = 0;
        int var12 = 0;
        nl var13 = null;
        int var14 = 0;
        int stackIn_18_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_173_0 = 0;
        int stackIn_186_0 = 0;
        tj stackIn_219_0 = null;
        tj stackIn_220_0 = null;
        tj stackIn_221_0 = null;
        int stackIn_221_1 = 0;
        ch stackIn_222_0 = null;
        int stackIn_222_1 = 0;
        int stackIn_222_2 = 0;
        nl stackIn_222_3 = null;
        int stackIn_222_4 = 0;
        int stackIn_222_5 = 0;
        ch stackIn_223_0 = null;
        int stackIn_223_1 = 0;
        int stackIn_223_2 = 0;
        nl stackIn_223_3 = null;
        int stackIn_223_4 = 0;
        int stackIn_223_5 = 0;
        ch stackIn_224_0 = null;
        int stackIn_224_1 = 0;
        int stackIn_224_2 = 0;
        nl stackIn_224_3 = null;
        int stackIn_224_4 = 0;
        int stackIn_224_5 = 0;
        int stackIn_224_6 = 0;
        int stackOut_172_0 = 0;
        int stackOut_171_0 = 0;
        int stackOut_185_0 = 0;
        tj stackOut_218_0 = null;
        tj stackOut_220_0 = null;
        int stackOut_220_1 = 0;
        tj stackOut_219_0 = null;
        int stackOut_219_1 = 0;
        ch stackOut_221_0 = null;
        int stackOut_221_1 = 0;
        int stackOut_221_2 = 0;
        nl stackOut_221_3 = null;
        int stackOut_221_4 = 0;
        int stackOut_221_5 = 0;
        ch stackOut_223_0 = null;
        int stackOut_223_1 = 0;
        int stackOut_223_2 = 0;
        nl stackOut_223_3 = null;
        int stackOut_223_4 = 0;
        int stackOut_223_5 = 0;
        int stackOut_223_6 = 0;
        ch stackOut_222_0 = null;
        int stackOut_222_1 = 0;
        int stackOut_222_2 = 0;
        nl stackOut_222_3 = null;
        int stackOut_222_4 = 0;
        int stackOut_222_5 = 0;
        int stackOut_222_6 = 0;
        int stackOut_79_0 = 0;
        int stackOut_80_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        L0: {
          var14 = Kickabout.field_G;
          if (-1 == ((nu) this).field_O) {
            break L0;
          } else {
            if (~((nu) this).field_O > ~((nu) this).field_v) {
              return;
            } else {
              break L0;
            }
          }
        }
        L1: {
          int fieldTemp$2 = ((nu) this).field_J - 1;
          ((nu) this).field_J = ((nu) this).field_J - 1;
          if (fieldTemp$2 <= 0) {
            ((nu) this).field_J = 255;
            break L1;
          } else {
            break L1;
          }
        }
        vl.a((nu) this, (byte) -41);
        var2_int = 0;
        L2: while (true) {
          if (var2_int >= 2) {
            L3: {
              ((nu) this).field_V.a((byte) -97, ((nu) this).field_t, ((nu) this).field_B);
              ((nu) this).field_X.a(((nu) this).field_V, -123);
              if (((nu) this).field_X.field_m == 40) {
                ((nu) this).field_X.field_j[((nu) this).field_X.field_n] = ((nu) this).field_X.field_j[((nu) this).field_X.field_n] + 1;
                ((nu) this).field_V.field_m = -1;
                ((nu) this).field_V.field_r = 205;
                ((nu) this).field_P[-((nu) this).field_X.field_n + 1][0].field_o = 0;
                this.a(2);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (((nu) this).field_X.field_m < 245) {
                break L4;
              } else {
                this.a(-((nu) this).field_X.field_n + 1, 0);
                ((nu) this).field_X.field_m = 0;
                var2_int = 0;
                L5: while (true) {
                  if (~var2_int <= ~((nu) this).field_X.field_j.length) {
                    break L4;
                  } else {
                    L6: {
                      if (((nu) this).field_X.field_j[var2_int] > 99) {
                        ((nu) this).field_X.field_j[var2_int] = 99;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var2_int++;
                    continue L5;
                  }
                }
              }
            }
            var2_int = 0;
            L7: while (true) {
              if (2 <= var2_int) {
                var2_int = 0;
                L8: while (true) {
                  if (~((nu) this).field_I >= ~var2_int) {
                    L9: {
                      var2 = ((nu) this).b((byte) -96);
                      if (var2 == null) {
                        if (!((nu) this).field_V.g(-108)) {
                          break L9;
                        } else {
                          var3 = ((nu) this).field_V.e(10);
                          var4 = 0;
                          L10: while (true) {
                            if (2 <= var4) {
                              break L9;
                            } else {
                              var5_int = 0;
                              L11: while (true) {
                                if (var5_int >= 5) {
                                  var4++;
                                  continue L10;
                                } else {
                                  L12: {
                                    var6_ref_nl = ((nu) this).field_P[var4][var5_int];
                                    var7 = 900;
                                    if (var5_int != 0) {
                                      break L12;
                                    } else {
                                      var8_int = -var6_ref_nl.field_o + 20;
                                      var7 = var8_int * var8_int;
                                      break L12;
                                    }
                                  }
                                  L13: {
                                    if (~var3 < ~(var7 << 16)) {
                                      break L13;
                                    } else {
                                      if (3 == var6_ref_nl.field_u) {
                                        break L13;
                                      } else {
                                        if (var6_ref_nl.field_u == 13) {
                                          break L13;
                                        } else {
                                          if (var6_ref_nl.field_u == 5) {
                                            break L13;
                                          } else {
                                            if (var6_ref_nl.field_u == 7) {
                                              break L13;
                                            } else {
                                              if (var6_ref_nl.field_u == 8) {
                                                break L13;
                                              } else {
                                                if (var6_ref_nl.field_u == 9) {
                                                  break L13;
                                                } else {
                                                  var8_int = var6_ref_nl.f(-127) - ((nu) this).field_V.a(true);
                                                  var9 = var6_ref_nl.a(true) - ((nu) this).field_V.c(879306160);
                                                  if (var9 * var9 + var8_int * var8_int >= 1600) {
                                                    break L13;
                                                  } else {
                                                    ((nu) this).field_V.a((mo) (Object) var6_ref_nl, (byte) 84);
                                                    ((nu) this).field_V.field_s = var5_int;
                                                    ((nu) this).field_V.field_i = 0;
                                                    ((nu) this).field_V.field_m = var4;
                                                    if (0 != var5_int) {
                                                      this.a(-115, (mo) (Object) ((nu) this).field_V, var5_int, ((nu) this).b((byte) 107, var4));
                                                      break L13;
                                                    } else {
                                                      break L13;
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
                                  var5_int++;
                                  continue L11;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        ((nu) this).field_V.field_p = var2.field_w;
                        ((nu) this).field_V.field_v = var2.field_v;
                        ((nu) this).field_V.field_t = var2.field_M;
                        break L9;
                      }
                    }
                    L14: {
                      if (null != var2) {
                        break L14;
                      } else {
                        var3 = 0;
                        L15: while (true) {
                          if (2 <= var3) {
                            break L14;
                          } else {
                            L16: {
                              var4_ref_nl = ((nu) this).field_P[var3][0];
                              if (var4_ref_nl.field_u == 2) {
                                break L16;
                              } else {
                                if (var4_ref_nl.field_u != 3) {
                                  var5_int = ((nu) this).field_V.a(true) - var4_ref_nl.f(-102);
                                  var6 = ((nu) this).field_V.c(879306160) - var4_ref_nl.a(true);
                                  var7 = var6 * var6 + var5_int * var5_int;
                                  if (var7 < 784) {
                                    L17: {
                                      var8_int = uv.b(var6, var5_int, (byte) 2);
                                      var9 = 511 & 693 * var4_ref_nl.f(-99);
                                      if (256 <= var9) {
                                        break L17;
                                      } else {
                                        var9 -= 512;
                                        break L17;
                                      }
                                    }
                                    L18: {
                                      var8_int = 8191 & var8_int - (-8192 - var9);
                                      if (var4_ref_nl.field_u == 5) {
                                        L19: {
                                          if (var3 == 0) {
                                            stackOut_172_0 = 1024;
                                            stackIn_173_0 = stackOut_172_0;
                                            break L19;
                                          } else {
                                            stackOut_171_0 = -1024;
                                            stackIn_173_0 = stackOut_171_0;
                                            break L19;
                                          }
                                        }
                                        L20: {
                                          var10 = stackIn_173_0;
                                          if ((var4_ref_nl.field_G & 2) != 0) {
                                            var8_int = 8191 & -var10 + (8192 + var8_int);
                                            break L20;
                                          } else {
                                            break L20;
                                          }
                                        }
                                        if (0 != (var4_ref_nl.field_G & 8)) {
                                          var8_int = 8191 & var10 + var8_int - -8192;
                                          break L18;
                                        } else {
                                          break L18;
                                        }
                                      } else {
                                        break L18;
                                      }
                                    }
                                    ((nu) this).field_V.a((mo) (Object) var4_ref_nl, (byte) 84);
                                    var10 = pc.a(((nu) this).field_V.e(3), -524289) >> 8;
                                    ((nu) this).field_V.field_q = (we.a(var8_int, false) >> 8) * var10;
                                    ((nu) this).field_V.field_h = var10 * (ei.a(var8_int, (byte) -23) >> 8);
                                    ((nu) this).field_V.a((byte) -78, ((nu) this).field_t, ((nu) this).field_B);
                                    if (var4_ref_nl.field_o < 15) {
                                      var4_ref_nl.field_o = var4_ref_nl.field_o + 1;
                                      break L16;
                                    } else {
                                      break L16;
                                    }
                                  } else {
                                    break L16;
                                  }
                                } else {
                                  break L16;
                                }
                              }
                            }
                            var3++;
                            continue L15;
                          }
                        }
                      }
                    }
                    var3 = 0;
                    L21: while (true) {
                      if (var3 >= 2) {
                        L22: {
                          if (((nu) this).field_V.field_m == -1) {
                            break L22;
                          } else {
                            if (((nu) this).field_V.field_s != -1) {
                              break L22;
                            } else {
                              break L22;
                            }
                          }
                        }
                        L23: {
                          if (null == ((nu) this).b((byte) -96)) {
                            break L23;
                          } else {
                            if (((nu) this).a((byte) 6, ((nu) this).field_V.field_m, ((nu) this).field_V.field_s) != -1) {
                              ((nu) this).field_V.field_o = ((nu) this).a((byte) 6, ((nu) this).field_V.field_m, ((nu) this).field_V.field_s);
                              break L23;
                            } else {
                              break L23;
                            }
                          }
                        }
                        L24: {
                          if (((nu) this).field_ab == null) {
                            break L24;
                          } else {
                            ((nu) this).field_ab.a(-27626, (nu) this);
                            break L24;
                          }
                        }
                        return;
                      } else {
                        stackOut_185_0 = 0;
                        stackIn_186_0 = stackOut_185_0;
                        var4 = stackIn_186_0;
                        L25: while (true) {
                          if (var4 >= 5) {
                            var3++;
                            continue L21;
                          } else {
                            L26: {
                              L27: {
                                var5 = ((nu) this).field_P[var3][var4];
                                if (var5.field_u == 3) {
                                  break L27;
                                } else {
                                  if (var5.field_u == 13) {
                                    break L27;
                                  } else {
                                    break L26;
                                  }
                                }
                              }
                              L28: {
                                if (((nu) this).field_V.field_m != -1) {
                                  break L28;
                                } else {
                                  if (Math.abs(-var5.field_v + ((nu) this).field_V.field_v) >> 16 >= 30) {
                                    break L28;
                                  } else {
                                    if (((nu) this).field_V.field_r != 0) {
                                      break L28;
                                    } else {
                                      var6 = var5.f(-116) + -((nu) this).field_V.a(true);
                                      var7 = var5.a(true) - ((nu) this).field_V.c(879306160);
                                      var8_int = var7 * var7 + var6 * var6;
                                      if (var8_int >= 1600) {
                                        break L28;
                                      } else {
                                        ((nu) this).field_V.a((mo) (Object) var5, (byte) 84);
                                        var9 = (4 * var5.field_N.d(var5.field_y, 0) << 16) / 100 + 524288;
                                        var10_long = (long)(var9 + Math.max(var5.field_q, pc.a(((nu) this).field_V.e(-127), -524289)));
                                        ((nu) this).field_V.field_r = 5;
                                        ((nu) this).field_V.field_h = (int)((long)var5.field_m * var10_long / (long)var5.field_q);
                                        ((nu) this).field_V.field_q = (int)(var10_long * (long)var5.field_k / (long)var5.field_q);
                                        var12 = 0;
                                        L29: while (true) {
                                          if (var12 >= ((nu) this).field_I) {
                                            L30: {
                                              var12 = ((nu) this).a((byte) 6, var3, var4);
                                              if (13 != var5.field_u) {
                                                break L30;
                                              } else {
                                                if (((nu) this).field_V.field_i != 2) {
                                                  break L30;
                                                } else {
                                                  if (((nu) this).field_V.field_o == -1) {
                                                    break L30;
                                                  } else {
                                                    if (var12 == -1) {
                                                      break L30;
                                                    } else {
                                                      if (~((nu) this).field_V.field_o != ~var12) {
                                                        break L30;
                                                      } else {
                                                        break L30;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            L31: {
                                              if (var12 == -1) {
                                                break L31;
                                              } else {
                                                ((nu) this).field_V.field_o = var12;
                                                break L31;
                                              }
                                            }
                                            L32: {
                                              stackOut_218_0 = ((nu) this).field_V;
                                              stackIn_220_0 = stackOut_218_0;
                                              stackIn_219_0 = stackOut_218_0;
                                              if (var5.field_u == 13) {
                                                stackOut_220_0 = (tj) (Object) stackIn_220_0;
                                                stackOut_220_1 = 2;
                                                stackIn_221_0 = stackOut_220_0;
                                                stackIn_221_1 = stackOut_220_1;
                                                break L32;
                                              } else {
                                                stackOut_219_0 = (tj) (Object) stackIn_219_0;
                                                stackOut_219_1 = 1;
                                                stackIn_221_0 = stackOut_219_0;
                                                stackIn_221_1 = stackOut_219_1;
                                                break L32;
                                              }
                                            }
                                            L33: {
                                              stackIn_221_0.field_i = stackIn_221_1;
                                              var13 = ((nu) this).field_P[-var3 + 1][0];
                                              stackOut_221_0 = ((nu) this).field_N;
                                              stackOut_221_1 = 35;
                                              stackOut_221_2 = ((nu) this).field_V.field_o;
                                              stackOut_221_3 = (nl) var13;
                                              stackOut_221_4 = var4;
                                              stackOut_221_5 = ((nu) this).field_v;
                                              stackIn_223_0 = stackOut_221_0;
                                              stackIn_223_1 = stackOut_221_1;
                                              stackIn_223_2 = stackOut_221_2;
                                              stackIn_223_3 = stackOut_221_3;
                                              stackIn_223_4 = stackOut_221_4;
                                              stackIn_223_5 = stackOut_221_5;
                                              stackIn_222_0 = stackOut_221_0;
                                              stackIn_222_1 = stackOut_221_1;
                                              stackIn_222_2 = stackOut_221_2;
                                              stackIn_222_3 = stackOut_221_3;
                                              stackIn_222_4 = stackOut_221_4;
                                              stackIn_222_5 = stackOut_221_5;
                                              if (var5.field_u != 13) {
                                                stackOut_223_0 = (ch) (Object) stackIn_223_0;
                                                stackOut_223_1 = stackIn_223_1;
                                                stackOut_223_2 = stackIn_223_2;
                                                stackOut_223_3 = (nl) (Object) stackIn_223_3;
                                                stackOut_223_4 = stackIn_223_4;
                                                stackOut_223_5 = stackIn_223_5;
                                                stackOut_223_6 = 2;
                                                stackIn_224_0 = stackOut_223_0;
                                                stackIn_224_1 = stackOut_223_1;
                                                stackIn_224_2 = stackOut_223_2;
                                                stackIn_224_3 = stackOut_223_3;
                                                stackIn_224_4 = stackOut_223_4;
                                                stackIn_224_5 = stackOut_223_5;
                                                stackIn_224_6 = stackOut_223_6;
                                                break L33;
                                              } else {
                                                stackOut_222_0 = (ch) (Object) stackIn_222_0;
                                                stackOut_222_1 = stackIn_222_1;
                                                stackOut_222_2 = stackIn_222_2;
                                                stackOut_222_3 = (nl) (Object) stackIn_222_3;
                                                stackOut_222_4 = stackIn_222_4;
                                                stackOut_222_5 = stackIn_222_5;
                                                stackOut_222_6 = 3;
                                                stackIn_224_0 = stackOut_222_0;
                                                stackIn_224_1 = stackOut_222_1;
                                                stackIn_224_2 = stackOut_222_2;
                                                stackIn_224_3 = stackOut_222_3;
                                                stackIn_224_4 = stackOut_222_4;
                                                stackIn_224_5 = stackOut_222_5;
                                                stackIn_224_6 = stackOut_222_6;
                                                break L33;
                                              }
                                            }
                                            ((ch) (Object) stackIn_224_0).a((byte) stackIn_224_1, stackIn_224_2, stackIn_224_3, stackIn_224_4, stackIn_224_5, stackIn_224_6, var3, (nu) this, var5);
                                            if (var5.field_F != -1) {
                                              if (var5.field_u != 13) {
                                                ((nu) this).field_q[var5.field_F].field_j = ((nu) this).field_q[var5.field_F].field_j + 1;
                                                break L28;
                                              } else {
                                                ((nu) this).field_q[var5.field_F].field_h = ((nu) this).field_q[var5.field_F].field_h + 1;
                                                break L28;
                                              }
                                            } else {
                                              break L28;
                                            }
                                          } else {
                                            L34: {
                                              if (((nu) this).field_g[var12].field_p != var3) {
                                                break L34;
                                              } else {
                                                if (~((nu) this).field_R[var12].field_g != ~var4) {
                                                  break L34;
                                                } else {
                                                  ((nu) this).field_V.field_j = var12;
                                                  break L34;
                                                }
                                              }
                                            }
                                            var12++;
                                            continue L29;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              if (var5.field_u != 3) {
                                break L26;
                              } else {
                                var6 = 0;
                                L35: while (true) {
                                  if (2 <= var6) {
                                    break L26;
                                  } else {
                                    var7 = 0;
                                    L36: while (true) {
                                      if (var7 >= 5) {
                                        var6++;
                                        continue L35;
                                      } else {
                                        L37: {
                                          L38: {
                                            if (var3 != var6) {
                                              break L38;
                                            } else {
                                              if (var7 != var4) {
                                                break L38;
                                              } else {
                                                break L37;
                                              }
                                            }
                                          }
                                          L39: {
                                            var8 = ((nu) this).field_P[var6][var7];
                                            if (0 == var4) {
                                              break L39;
                                            } else {
                                              L40: {
                                                if (var3 != var6) {
                                                  break L40;
                                                } else {
                                                  if (!((nu) this).field_F[var6]) {
                                                    break L40;
                                                  } else {
                                                    break L37;
                                                  }
                                                }
                                              }
                                              L41: {
                                                if (var3 != var6) {
                                                  break L41;
                                                } else {
                                                  if (!var5.field_N.b(false, var5.field_y)) {
                                                    break L37;
                                                  } else {
                                                    break L41;
                                                  }
                                                }
                                              }
                                              if (var6 != var3) {
                                                break L39;
                                              } else {
                                                if (var8.field_N.b(var8.field_y, (byte) -111)) {
                                                  break L37;
                                                } else {
                                                  break L39;
                                                }
                                              }
                                            }
                                          }
                                          var9 = var5.f(-122) - var8.f(-94);
                                          var10 = var5.a(true) + -var8.a(true);
                                          if (var9 * var9 - -(var10 * var10) >= 1600) {
                                            break L37;
                                          } else {
                                            if (4 == var8.field_J) {
                                              break L37;
                                            } else {
                                              L42: {
                                                var8.a((byte) -31, 7);
                                                var8.field_L = var8.field_L + var5.field_N.a(var5.field_y, false);
                                                var8.a((mo) (Object) var5, (byte) 84);
                                                if (var4 != 0) {
                                                  var11 = var5.field_L;
                                                  var5.a((byte) -31, 12);
                                                  var5.field_L = var11;
                                                  break L42;
                                                } else {
                                                  break L42;
                                                }
                                              }
                                              L43: {
                                                var11 = ((nu) this).a((byte) 6, var6, var7);
                                                if (var11 != -1) {
                                                  ((nu) this).field_q[var11].field_a = ((nu) this).field_q[var11].field_a + 1;
                                                  break L43;
                                                } else {
                                                  break L43;
                                                }
                                              }
                                              L44: {
                                                if (~var6 != ~((nu) this).field_V.field_m) {
                                                  break L44;
                                                } else {
                                                  if (((nu) this).field_V.field_s == var7) {
                                                    L45: {
                                                      ((nu) this).field_V.field_s = var4;
                                                      ((nu) this).field_V.field_m = var3;
                                                      if (((nu) this).field_V.field_s == 0) {
                                                        break L45;
                                                      } else {
                                                        if (((nu) this).a((byte) 6, var3, var4) != -1) {
                                                          break L45;
                                                        } else {
                                                          this.a(-127, (mo) (Object) ((nu) this).field_V, var4, ((nu) this).b((byte) 49, var3));
                                                          break L45;
                                                        }
                                                      }
                                                    }
                                                    if (var5.field_F == -1) {
                                                      break L37;
                                                    } else {
                                                      ((nu) this).field_q[var5.field_F].field_m = ((nu) this).field_q[var5.field_F].field_m + 1;
                                                      break L37;
                                                    }
                                                  } else {
                                                    break L44;
                                                  }
                                                }
                                              }
                                              if (-1 != var5.field_F) {
                                                ((nu) this).field_q[var5.field_F].field_c = ((nu) this).field_q[var5.field_F].field_c + 1;
                                                break L37;
                                              } else {
                                                break L37;
                                              }
                                            }
                                          }
                                        }
                                        var7++;
                                        continue L36;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            var4++;
                            continue L25;
                          }
                        }
                      }
                    }
                  } else {
                    L46: {
                      if (!((nu) this).field_R[var2_int].d(3511)) {
                        break L46;
                      } else {
                        if (((nu) this).field_R[var2_int].field_p == 0) {
                          break L46;
                        } else {
                          if (((nu) this).c(var2_int, -125)) {
                            break L46;
                          } else {
                            this.a(73, (mo) (Object) ((nu) this).field_R[var2_int], ((nu) this).field_R[var2_int].field_p, var2_int);
                            ((nu) this).field_R[var2_int].field_p = 0;
                            break L46;
                          }
                        }
                      }
                    }
                    var2_int++;
                    continue L8;
                  }
                }
              } else {
                var3 = 0;
                L47: while (true) {
                  if (var3 >= 5) {
                    var2_int++;
                    continue L7;
                  } else {
                    L48: {
                      var4_ref_nl = ((nu) this).field_P[var2_int][var3];
                      if (var4_ref_nl.field_u != 2) {
                        break L48;
                      } else {
                        if (var4_ref_nl.field_L != 20) {
                          break L48;
                        } else {
                          if (~var2_int != ~((nu) this).field_V.field_m) {
                            break L48;
                          } else {
                            if (~var3 != ~((nu) this).field_V.field_s) {
                              break L48;
                            } else {
                              if (var4_ref_nl.field_z >= 0) {
                                var5_int = var4_ref_nl.a(var4_ref_nl.field_z, (byte) -68);
                                this.a(var5_int, var4_ref_nl.field_O, var4_ref_nl.field_N.c(var4_ref_nl.field_y, (byte) -62), var4_ref_nl.field_x, (byte) -66, var4_ref_nl.field_P);
                                ((nu) this).field_V.a((mo) (Object) var4_ref_nl, (byte) 84);
                                var6_ref_nl = ((nu) this).field_P[-var2_int + 1][0];
                                ((nu) this).field_N.a((nu) this, 32, ((nu) this).field_v, var2_int, var4_ref_nl, var5_int, var6_ref_nl, ((nu) this).field_V.field_o, var3);
                                var7 = ((nu) this).a((byte) 6, var2_int, var3);
                                if (var7 == -1) {
                                  break L48;
                                } else {
                                  if (var4_ref_nl.field_O) {
                                    ((nu) this).field_q[var7].field_q = ((nu) this).field_q[var7].field_q + 1;
                                    break L48;
                                  } else {
                                    if (var5_int >= 128) {
                                      ((nu) this).field_q[var7].field_f = ((nu) this).field_q[var7].field_f + 1;
                                      break L48;
                                    } else {
                                      ((nu) this).field_q[var7].field_i = ((nu) this).field_q[var7].field_i + 1;
                                      break L48;
                                    }
                                  }
                                }
                              } else {
                                this.b(-var4_ref_nl.field_z, (byte) -72);
                                break L48;
                              }
                            }
                          }
                        }
                      }
                    }
                    L49: {
                      if (0 == var4_ref_nl.field_u) {
                        break L49;
                      } else {
                        if (var4_ref_nl.field_L <= 0) {
                          L50: {
                            L51: {
                              if (var2_int != ((nu) this).field_V.field_m) {
                                break L51;
                              } else {
                                if (~var3 != ~((nu) this).field_V.field_s) {
                                  break L51;
                                } else {
                                  stackOut_79_0 = 1;
                                  stackIn_81_0 = stackOut_79_0;
                                  break L50;
                                }
                              }
                            }
                            stackOut_80_0 = 0;
                            stackIn_81_0 = stackOut_80_0;
                            break L50;
                          }
                          var5_int = stackIn_81_0;
                          if (var4_ref_nl.field_u == 2) {
                            var4_ref_nl.a((byte) -31, 0);
                            break L49;
                          } else {
                            if (var4_ref_nl.field_u != 1) {
                              if (var4_ref_nl.field_u != 5) {
                                if (7 != var4_ref_nl.field_u) {
                                  if (var4_ref_nl.field_u != 8) {
                                    L52: {
                                      if (var4_ref_nl.field_u != 3) {
                                        break L52;
                                      } else {
                                        if (var5_int == 0) {
                                          var4_ref_nl.a((byte) -31, 10);
                                          var4_ref_nl.field_L = var4_ref_nl.field_L + 20;
                                          break L49;
                                        } else {
                                          break L52;
                                        }
                                      }
                                    }
                                    if (var4_ref_nl.field_u == 12) {
                                      var4_ref_nl.a((byte) -31, 10);
                                      if (var5_int != 0) {
                                        break L49;
                                      } else {
                                        var4_ref_nl.field_L = var4_ref_nl.field_L + 60;
                                        break L49;
                                      }
                                    } else {
                                      L53: {
                                        if (var4_ref_nl.field_u != 13) {
                                          break L53;
                                        } else {
                                          if (0 == var4_ref_nl.field_v) {
                                            var4_ref_nl.a((byte) -31, 10);
                                            break L49;
                                          } else {
                                            break L53;
                                          }
                                        }
                                      }
                                      if (var4_ref_nl.field_u != 14) {
                                        var4_ref_nl.a((byte) -31, 0);
                                        break L49;
                                      } else {
                                        var4_ref_nl.field_L = 1;
                                        break L49;
                                      }
                                    }
                                  } else {
                                    var4_ref_nl.a((byte) -31, 9);
                                    break L49;
                                  }
                                } else {
                                  var4_ref_nl.a((byte) -31, 8);
                                  break L49;
                                }
                              } else {
                                var4_ref_nl.a((byte) -31, 6);
                                break L49;
                              }
                            } else {
                              var4_ref_nl.field_L = var4_ref_nl.c((byte) -99);
                              break L49;
                            }
                          }
                        } else {
                          break L49;
                        }
                      }
                    }
                    var3++;
                    continue L47;
                  }
                }
              }
            }
          } else {
            var3 = 0;
            L54: while (true) {
              if (var3 >= 5) {
                var2_int++;
                continue L2;
              } else {
                L55: {
                  L56: {
                    var4_ref_nl = ((nu) this).field_P[var2_int][var3];
                    if (((nu) this).field_V.field_m != var2_int) {
                      break L56;
                    } else {
                      if (~var3 != ~((nu) this).field_V.field_s) {
                        break L56;
                      } else {
                        stackOut_16_0 = 1;
                        stackIn_18_0 = stackOut_16_0;
                        break L55;
                      }
                    }
                  }
                  stackOut_17_0 = 0;
                  stackIn_18_0 = stackOut_17_0;
                  break L55;
                }
                L57: {
                  L58: {
                    var5_int = stackIn_18_0;
                    var6 = ((nu) this).a((byte) 6, var2_int, var3);
                    if (-1 == var6) {
                      break L58;
                    } else {
                      if (!((nu) this).field_R[var6].field_u) {
                        break L58;
                      } else {
                        stackOut_21_0 = 1;
                        stackIn_23_0 = stackOut_21_0;
                        break L57;
                      }
                    }
                  }
                  stackOut_22_0 = 0;
                  stackIn_23_0 = stackOut_22_0;
                  break L57;
                }
                L59: {
                  L60: {
                    L61: {
                      var7 = stackIn_23_0;
                      var4_ref_nl.a(2, ((nu) this).field_x, var7 != 0, var5_int != 0);
                      if (var2_int != 0) {
                        break L61;
                      } else {
                        if (((nu) this).field_s) {
                          break L60;
                        } else {
                          break L61;
                        }
                      }
                    }
                    L62: {
                      if (1 != var2_int) {
                        break L62;
                      } else {
                        if (!((nu) this).field_p) {
                          break L62;
                        } else {
                          break L60;
                        }
                      }
                    }
                    stackOut_31_0 = 0;
                    stackIn_32_0 = stackOut_31_0;
                    break L59;
                  }
                  stackOut_30_0 = 1;
                  stackIn_32_0 = stackOut_30_0;
                  break L59;
                }
                L63: {
                  var8_int = stackIn_32_0;
                  if (var3 != 0) {
                    if (var8_int != 0) {
                      break L63;
                    } else {
                      boolean discarded$3 = jt.a((nu) this, (byte) -127, var3, var2_int);
                      break L63;
                    }
                  } else {
                    hv.a(true, (nu) this, var2_int);
                    break L63;
                  }
                }
                var3++;
                continue L54;
              }
            }
          }
        }
    }

    final void a(nu param0, byte param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        var5 = Kickabout.field_G;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              if (((nu) this).field_I <= var3_int) {
                var3_int = 0;
                L2: while (true) {
                  if (var3_int >= 2) {
                    L3: {
                      ((nu) this).field_m = param0.field_m;
                      ((nu) this).field_Z = param0.field_Z;
                      ((nu) this).field_t = param0.field_t;
                      if (((nu) this).field_u == param0.field_u) {
                        break L3;
                      } else {
                        ((nu) this).a(param0.field_u, (byte) -125);
                        break L3;
                      }
                    }
                    ((nu) this).field_v = param0.field_v;
                    var3_int = 0;
                    L4: while (true) {
                      if (~((nu) this).field_I >= ~var3_int) {
                        L5: {
                          if (0 != ((nu) this).field_u) {
                            break L5;
                          } else {
                            ((nu) this).field_n.a((mo) (Object) param0.field_n, false);
                            break L5;
                          }
                        }
                        L6: {
                          if (((nu) this).field_u != 2) {
                            break L6;
                          } else {
                            ((nu) this).field_C.a((mo) (Object) param0.field_C, false);
                            break L6;
                          }
                        }
                        L7: {
                          if (((nu) this).field_u == 3) {
                            ((nu) this).field_o.a((mo) (Object) param0.field_o, false);
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        if (param1 > 42) {
                          L8: {
                            if (((nu) this).field_u == 4) {
                              var3_int = 0;
                              L9: while (true) {
                                if (2 <= var3_int) {
                                  ((nu) this).field_V.a((mo) (Object) param0.field_V, false);
                                  ((nu) this).field_X.a((mo) (Object) param0.field_X, false);
                                  ((nu) this).field_J = param0.field_J;
                                  ((nu) this).field_G = param0.field_G;
                                  break L8;
                                } else {
                                  var4 = 0;
                                  L10: while (true) {
                                    if (var4 >= 5) {
                                      var3_int++;
                                      continue L9;
                                    } else {
                                      ((nu) this).field_P[var3_int][var4].a((mo) (Object) param0.field_P[var3_int][var4], false);
                                      var4++;
                                      continue L10;
                                    }
                                  }
                                }
                              }
                            } else {
                              break L8;
                            }
                          }
                          L11: {
                            if (((nu) this).field_N != null) {
                              ((nu) this).field_N.a(-4, param0.field_N);
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                          L12: {
                            if (((nu) this).field_q != null) {
                              var3_int = 0;
                              L13: while (true) {
                                if (~((nu) this).field_q.length >= ~var3_int) {
                                  break L12;
                                } else {
                                  ((nu) this).field_q[var3_int].a(true, param0.field_q[var3_int]);
                                  var3_int++;
                                  continue L13;
                                }
                              }
                            } else {
                              break L12;
                            }
                          }
                          L14: {
                            if (((nu) this).field_ab != null) {
                              ((nu) this).field_ab.a(120, param0.field_ab);
                              break L14;
                            } else {
                              break L14;
                            }
                          }
                          break L0;
                        } else {
                          return;
                        }
                      } else {
                        ((nu) this).field_R[var3_int].a((mo) (Object) param0.field_R[var3_int], false);
                        var3_int++;
                        continue L4;
                      }
                    }
                  } else {
                    stackOut_8_0 = 0;
                    stackIn_10_0 = stackOut_8_0;
                    var4 = stackIn_10_0;
                    L15: while (true) {
                      if (var4 >= 4) {
                        ((nu) this).field_r[var3_int] = param0.field_r[var3_int];
                        ((nu) this).field_H[var3_int] = param0.field_H[var3_int];
                        ((nu) this).field_d[var3_int] = param0.field_d[var3_int];
                        ((nu) this).field_Q[var3_int] = param0.field_Q[var3_int];
                        var3_int++;
                        continue L2;
                      } else {
                        ((nu) this).field_i[var3_int][var4] = param0.field_i[var3_int][var4];
                        ((nu) this).field_k[var3_int][var4] = param0.field_k[var3_int][var4];
                        ((nu) this).field_b[var3_int][var4].a((byte) -89, param0.field_b[var3_int][var4]);
                        var4++;
                        continue L15;
                      }
                    }
                  }
                }
              } else {
                ((nu) this).field_g[var3_int].a((mo) (Object) param0.field_g[var3_int], false);
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var3 = decompiledCaughtException;
            stackOut_65_0 = (RuntimeException) var3;
            stackOut_65_1 = new StringBuilder().append("nu.DA(");
            stackIn_68_0 = stackOut_65_0;
            stackIn_68_1 = stackOut_65_1;
            stackIn_66_0 = stackOut_65_0;
            stackIn_66_1 = stackOut_65_1;
            if (param0 == null) {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "null";
              stackIn_69_0 = stackOut_68_0;
              stackIn_69_1 = stackOut_68_1;
              stackIn_69_2 = stackOut_68_2;
              break L16;
            } else {
              stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
              stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
              stackOut_66_2 = "{...}";
              stackIn_69_0 = stackOut_66_0;
              stackIn_69_1 = stackOut_66_1;
              stackIn_69_2 = stackOut_66_2;
              break L16;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_69_0, stackIn_69_2 + ',' + param1 + ')');
        }
    }

    final static void b(boolean param0) {
        dt[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        dt var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (null == af.field_a) {
                break L1;
              } else {
                if (!nw.field_b.field_R[ek.field_G].d(3511)) {
                  break L1;
                } else {
                  var1 = af.field_a;
                  var2 = 0;
                  L2: while (true) {
                    if (~var1.length >= ~var2) {
                      break L0;
                    } else {
                      var3 = var1[var2];
                      var3.a((byte) 10);
                      var2++;
                      continue L2;
                    }
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var1_ref, "nu.BA(" + false + ')');
        }
    }

    private final void a(nl param0, byte param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        tj var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var12 = Kickabout.field_G;
        try {
          L0: {
            var3_int = param0.field_M;
            var4 = param0.field_w;
            var5 = new tj();
            var5.a((mo) (Object) ((nu) this).field_V, false);
            var8 = -3 / ((param1 - -30) / 33);
            var6 = 2147483647;
            var7 = 0;
            var7 = 0;
            L1: while (true) {
              L2: {
                if (var7 >= param0.field_L) {
                  break L2;
                } else {
                  L3: {
                    var3_int = var3_int + param0.field_k;
                    var4 = var4 + param0.field_m;
                    var5.a((byte) -85, ((nu) this).field_t, ((nu) this).field_B);
                    if (var7 > 10) {
                      var9 = -var3_int + var5.field_t >> 16;
                      var10 = var5.field_p + -var4 >> 16;
                      var11 = var9 * var9 - -(var10 * var10);
                      if (~var6 >= ~var11) {
                        break L2;
                      } else {
                        var6 = var11;
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                  var7++;
                  continue L1;
                }
              }
              L4: {
                if (var6 >= 10000) {
                  break L4;
                } else {
                  if (var7 > 1) {
                    param0.field_B = (-param0.field_w + var5.field_p) / var7;
                    param0.field_L = var7 + 1;
                    param0.field_r = (var5.field_t - param0.field_M) / var7;
                    param0.field_s = true;
                    var9 = -param0.field_v + var5.field_v + -327680;
                    if (var9 <= 0) {
                      break L4;
                    } else {
                      if (param0.field_v == 0) {
                        L5: {
                          param0.field_K = (var9 + (var7 * 26214 * var7 >> 1)) / var7;
                          if (458752 < param0.field_K) {
                            param0.field_K = 458752;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        param0.a((byte) -31, 13);
                        param0.field_L = (param0.field_K << 1) / 26214;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  } else {
                    break L4;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var3;
            stackOut_28_1 = new StringBuilder().append("nu.N(");
            stackIn_31_0 = stackOut_28_0;
            stackIn_31_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param0 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L6;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_32_0 = stackOut_29_0;
              stackIn_32_1 = stackOut_29_1;
              stackIn_32_2 = stackOut_29_2;
              break L6;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + ',' + param1 + ')');
        }
    }

    private final void b(boolean param0, ki param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        nl var4 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            if (((nu) this).field_u == 4) {
              L1: {
                if (((nu) this).field_X == null) {
                  break L1;
                } else {
                  if (40 <= ((nu) this).field_X.field_m) {
                    return;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (-1 == ((nu) this).field_O) {
                  break L2;
                } else {
                  if (~((nu) this).field_v >= ~((nu) this).field_O) {
                    break L2;
                  } else {
                    return;
                  }
                }
              }
              L3: {
                var3_int = param1.field_u;
                if (!((nu) this).field_R[var3_int].d(3511)) {
                  break L3;
                } else {
                  if (!((nu) this).field_Y) {
                    var4 = ((nu) this).a((byte) -94, var3_int);
                    var4.field_G = param1.field_v;
                    var4.a((mo) (Object) ((nu) this).field_g[var3_int], (byte) 84);
                    break L0;
                  } else {
                    break L3;
                  }
                }
              }
              return;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var3;
            stackOut_22_1 = new StringBuilder().append("nu.AA(").append(true).append(',');
            stackIn_25_0 = stackOut_22_0;
            stackIn_25_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L4;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L4;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ')');
        }
    }

    private final void a(boolean param0, ki param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        gt var4 = null;
        tj stackIn_21_0 = null;
        tj stackIn_23_0 = null;
        tj stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        tj stackIn_29_0 = null;
        tj stackIn_31_0 = null;
        tj stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        tj stackIn_37_0 = null;
        tj stackIn_39_0 = null;
        tj stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        tj stackIn_43_0 = null;
        tj stackIn_45_0 = null;
        tj stackIn_47_0 = null;
        tj stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        tj stackIn_54_0 = null;
        tj stackIn_56_0 = null;
        tj stackIn_58_0 = null;
        tj stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        tj stackIn_64_0 = null;
        tj stackIn_66_0 = null;
        tj stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        gt stackIn_70_0 = null;
        gt stackIn_72_0 = null;
        gt stackIn_74_0 = null;
        gt stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        Object stackIn_80_0 = null;
        Object stackIn_82_0 = null;
        Object stackIn_83_0 = null;
        int stackIn_83_1 = 0;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        String stackIn_89_2 = null;
        RuntimeException decompiledCaughtException = null;
        tj stackOut_20_0 = null;
        tj stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        tj stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        tj stackOut_28_0 = null;
        tj stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        tj stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        tj stackOut_36_0 = null;
        tj stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        tj stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        tj stackOut_42_0 = null;
        tj stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        tj stackOut_43_0 = null;
        tj stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        tj stackOut_53_0 = null;
        tj stackOut_58_0 = null;
        int stackOut_58_1 = 0;
        tj stackOut_54_0 = null;
        tj stackOut_56_0 = null;
        int stackOut_56_1 = 0;
        tj stackOut_63_0 = null;
        tj stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        tj stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        gt stackOut_69_0 = null;
        gt stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        gt stackOut_70_0 = null;
        gt stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        Object stackOut_79_0 = null;
        Object stackOut_82_0 = null;
        int stackOut_82_1 = 0;
        Object stackOut_80_0 = null;
        int stackOut_80_1 = 0;
        RuntimeException stackOut_85_0 = null;
        StringBuilder stackOut_85_1 = null;
        RuntimeException stackOut_88_0 = null;
        StringBuilder stackOut_88_1 = null;
        String stackOut_88_2 = null;
        RuntimeException stackOut_86_0 = null;
        StringBuilder stackOut_86_1 = null;
        String stackOut_86_2 = null;
        try {
          L0: {
            if (((nu) this).field_u == 4) {
              L1: {
                var3_int = param1.field_v;
                var4 = ((nu) this).field_R[param1.field_u];
                if (var3_int != 0) {
                  break L1;
                } else {
                  var4.field_l = var4.field_l ^ 1;
                  break L1;
                }
              }
              L2: {
                if (var3_int == 1) {
                  var4.field_l = var4.field_l ^ 2;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (var3_int == 2) {
                  var4.field_l = var4.field_l ^ 4;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (var3_int == 3) {
                  var4.field_l = var4.field_l ^ 8;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (var3_int == 4) {
                  L6: {
                    stackOut_20_0 = ((nu) this).field_V;
                    stackIn_23_0 = stackOut_20_0;
                    stackIn_21_0 = stackOut_20_0;
                    if (((nu) this).field_V.field_l != 3) {
                      stackOut_23_0 = (tj) (Object) stackIn_23_0;
                      stackOut_23_1 = 3;
                      stackIn_24_0 = stackOut_23_0;
                      stackIn_24_1 = stackOut_23_1;
                      break L6;
                    } else {
                      stackOut_21_0 = (tj) (Object) stackIn_21_0;
                      stackOut_21_1 = mp.field_p[((nu) this).field_t];
                      stackIn_24_0 = stackOut_21_0;
                      stackIn_24_1 = stackOut_21_1;
                      break L6;
                    }
                  }
                  stackIn_24_0.field_l = stackIn_24_1;
                  break L5;
                } else {
                  break L5;
                }
              }
              L7: {
                if (var3_int == 5) {
                  L8: {
                    stackOut_28_0 = ((nu) this).field_V;
                    stackIn_31_0 = stackOut_28_0;
                    stackIn_29_0 = stackOut_28_0;
                    if (((nu) this).field_V.field_l != 4) {
                      stackOut_31_0 = (tj) (Object) stackIn_31_0;
                      stackOut_31_1 = 4;
                      stackIn_32_0 = stackOut_31_0;
                      stackIn_32_1 = stackOut_31_1;
                      break L8;
                    } else {
                      stackOut_29_0 = (tj) (Object) stackIn_29_0;
                      stackOut_29_1 = mp.field_p[((nu) this).field_t];
                      stackIn_32_0 = stackOut_29_0;
                      stackIn_32_1 = stackOut_29_1;
                      break L8;
                    }
                  }
                  stackIn_32_0.field_l = stackIn_32_1;
                  break L7;
                } else {
                  break L7;
                }
              }
              L9: {
                if (var3_int == 6) {
                  L10: {
                    stackOut_36_0 = ((nu) this).field_V;
                    stackIn_39_0 = stackOut_36_0;
                    stackIn_37_0 = stackOut_36_0;
                    if (((nu) this).field_V.field_l != 5) {
                      stackOut_39_0 = (tj) (Object) stackIn_39_0;
                      stackOut_39_1 = 5;
                      stackIn_40_0 = stackOut_39_0;
                      stackIn_40_1 = stackOut_39_1;
                      break L10;
                    } else {
                      stackOut_37_0 = (tj) (Object) stackIn_37_0;
                      stackOut_37_1 = mp.field_p[((nu) this).field_t];
                      stackIn_40_0 = stackOut_37_0;
                      stackIn_40_1 = stackOut_37_1;
                      break L10;
                    }
                  }
                  stackIn_40_0.field_l = stackIn_40_1;
                  break L9;
                } else {
                  break L9;
                }
              }
              L11: {
                if (var3_int != 7) {
                  break L11;
                } else {
                  L12: {
                    stackOut_42_0 = ((nu) this).field_V;
                    stackIn_47_0 = stackOut_42_0;
                    stackIn_43_0 = stackOut_42_0;
                    if (((nu) this).field_V.field_l == 6) {
                      stackOut_47_0 = (tj) (Object) stackIn_47_0;
                      stackOut_47_1 = mp.field_p[((nu) this).field_t];
                      stackIn_48_0 = stackOut_47_0;
                      stackIn_48_1 = stackOut_47_1;
                      break L12;
                    } else {
                      stackOut_43_0 = (tj) (Object) stackIn_43_0;
                      stackIn_45_0 = stackOut_43_0;
                      stackOut_45_0 = (tj) (Object) stackIn_45_0;
                      stackOut_45_1 = 6;
                      stackIn_48_0 = stackOut_45_0;
                      stackIn_48_1 = stackOut_45_1;
                      break L12;
                    }
                  }
                  stackIn_48_0.field_l = stackIn_48_1;
                  break L11;
                }
              }
              L13: {
                if (var3_int != 8) {
                  break L13;
                } else {
                  L14: {
                    stackOut_53_0 = ((nu) this).field_V;
                    stackIn_58_0 = stackOut_53_0;
                    stackIn_54_0 = stackOut_53_0;
                    if (((nu) this).field_V.field_l != 7) {
                      stackOut_58_0 = (tj) (Object) stackIn_58_0;
                      stackOut_58_1 = 7;
                      stackIn_59_0 = stackOut_58_0;
                      stackIn_59_1 = stackOut_58_1;
                      break L14;
                    } else {
                      stackOut_54_0 = (tj) (Object) stackIn_54_0;
                      stackIn_56_0 = stackOut_54_0;
                      stackOut_56_0 = (tj) (Object) stackIn_56_0;
                      stackOut_56_1 = mp.field_p[((nu) this).field_t];
                      stackIn_59_0 = stackOut_56_0;
                      stackIn_59_1 = stackOut_56_1;
                      break L14;
                    }
                  }
                  stackIn_59_0.field_l = stackIn_59_1;
                  break L13;
                }
              }
              L15: {
                if (9 == var3_int) {
                  L16: {
                    stackOut_63_0 = ((nu) this).field_V;
                    stackIn_66_0 = stackOut_63_0;
                    stackIn_64_0 = stackOut_63_0;
                    if (((nu) this).field_V.field_l != 8) {
                      stackOut_66_0 = (tj) (Object) stackIn_66_0;
                      stackOut_66_1 = 8;
                      stackIn_67_0 = stackOut_66_0;
                      stackIn_67_1 = stackOut_66_1;
                      break L16;
                    } else {
                      stackOut_64_0 = (tj) (Object) stackIn_64_0;
                      stackOut_64_1 = mp.field_p[((nu) this).field_t];
                      stackIn_67_0 = stackOut_64_0;
                      stackIn_67_1 = stackOut_64_1;
                      break L16;
                    }
                  }
                  stackIn_67_0.field_l = stackIn_67_1;
                  break L15;
                } else {
                  break L15;
                }
              }
              L17: {
                if (var3_int != 11) {
                  break L17;
                } else {
                  L18: {
                    stackOut_69_0 = (gt) var4;
                    stackIn_74_0 = stackOut_69_0;
                    stackIn_70_0 = stackOut_69_0;
                    if (var4.field_u) {
                      stackOut_74_0 = (gt) (Object) stackIn_74_0;
                      stackOut_74_1 = 0;
                      stackIn_75_0 = stackOut_74_0;
                      stackIn_75_1 = stackOut_74_1;
                      break L18;
                    } else {
                      stackOut_70_0 = (gt) (Object) stackIn_70_0;
                      stackIn_72_0 = stackOut_70_0;
                      stackOut_72_0 = (gt) (Object) stackIn_72_0;
                      stackOut_72_1 = 1;
                      stackIn_75_0 = stackOut_72_0;
                      stackIn_75_1 = stackOut_72_1;
                      break L18;
                    }
                  }
                  stackIn_75_0.field_u = stackIn_75_1 != 0;
                  break L17;
                }
              }
              L19: {
                if (var3_int == 10) {
                  L20: {
                    stackOut_79_0 = this;
                    stackIn_82_0 = stackOut_79_0;
                    stackIn_80_0 = stackOut_79_0;
                    if (((nu) this).field_G) {
                      stackOut_82_0 = this;
                      stackOut_82_1 = 0;
                      stackIn_83_0 = stackOut_82_0;
                      stackIn_83_1 = stackOut_82_1;
                      break L20;
                    } else {
                      stackOut_80_0 = this;
                      stackOut_80_1 = 1;
                      stackIn_83_0 = stackOut_80_0;
                      stackIn_83_1 = stackOut_80_1;
                      break L20;
                    }
                  }
                  ((nu) this).field_G = stackIn_83_1 != 0;
                  break L19;
                } else {
                  break L19;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L21: {
            var3 = decompiledCaughtException;
            stackOut_85_0 = (RuntimeException) var3;
            stackOut_85_1 = new StringBuilder().append("nu.T(").append(false).append(',');
            stackIn_88_0 = stackOut_85_0;
            stackIn_88_1 = stackOut_85_1;
            stackIn_86_0 = stackOut_85_0;
            stackIn_86_1 = stackOut_85_1;
            if (param1 == null) {
              stackOut_88_0 = (RuntimeException) (Object) stackIn_88_0;
              stackOut_88_1 = (StringBuilder) (Object) stackIn_88_1;
              stackOut_88_2 = "null";
              stackIn_89_0 = stackOut_88_0;
              stackIn_89_1 = stackOut_88_1;
              stackIn_89_2 = stackOut_88_2;
              break L21;
            } else {
              stackOut_86_0 = (RuntimeException) (Object) stackIn_86_0;
              stackOut_86_1 = (StringBuilder) (Object) stackIn_86_1;
              stackOut_86_2 = "{...}";
              stackIn_89_0 = stackOut_86_0;
              stackIn_89_1 = stackOut_86_1;
              stackIn_89_2 = stackOut_86_2;
              break L21;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_89_0, stackIn_89_2 + ')');
        }
    }

    nu(nu param0) {
        this(param0.field_S, param0.field_U, param0.field_c, param0.field_f, param0.field_e, param0.field_L, param0.field_T, param0.field_W, param0.field_w);
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
            ((nu) this).a(param0, (byte) 74);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("nu.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    final void a(nu param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        var7 = Kickabout.field_G;
        try {
          L0: {
            ((nu) this).field_v = param0.field_v;
            var5_int = 0;
            L1: while (true) {
              if (var5_int >= ((nu) this).field_I) {
                L2: {
                  if (((nu) this).field_u == 0) {
                    ((nu) this).field_n.a((mo) (Object) param0.field_n, param1, param2, param3 + 61);
                    break L2;
                  } else {
                    if (((nu) this).field_u == 2) {
                      ((nu) this).field_C.a((mo) (Object) param0.field_C, param1, param2, 83);
                      break L2;
                    } else {
                      if (((nu) this).field_u == 3) {
                        ((nu) this).field_o.a((mo) (Object) param0.field_o, param1, param2, 72);
                        break L2;
                      } else {
                        if (4 == ((nu) this).field_u) {
                          var5_int = 0;
                          L3: while (true) {
                            if (var5_int >= 2) {
                              ((nu) this).field_V.a((mo) (Object) param0.field_V, param1, param2, 68);
                              ((nu) this).field_X.a((mo) (Object) param0.field_X, param1, param2, 41);
                              ((nu) this).field_G = param0.field_G;
                              break L2;
                            } else {
                              var6 = 0;
                              L4: while (true) {
                                if (var6 >= 5) {
                                  var5_int++;
                                  continue L3;
                                } else {
                                  ((nu) this).field_P[var5_int][var6].a((mo) (Object) param0.field_P[var5_int][var6], param1, param2, 104);
                                  var6++;
                                  continue L4;
                                }
                              }
                            }
                          }
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
                L5: {
                  if (param3 == -6) {
                    break L5;
                  } else {
                    boolean discarded$1 = ((nu) this).a(68, true, -108L, -124, 51);
                    break L5;
                  }
                }
                break L0;
              } else {
                ((nu) this).field_R[var5_int].a((mo) (Object) param0.field_R[var5_int], param1, param2, 117);
                var5_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) var5;
            stackOut_38_1 = new StringBuilder().append("nu.LA(");
            stackIn_41_0 = stackOut_38_0;
            stackIn_41_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param0 == null) {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L6;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_42_0 = stackOut_39_0;
              stackIn_42_1 = stackOut_39_1;
              stackIn_42_2 = stackOut_39_2;
              break L6;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final nl b(byte param0) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        nl stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        nl stackOut_6_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            if (((nu) this).field_V.field_m != -1) {
              L1: {
                if (param0 == -96) {
                  break L1;
                } else {
                  this.a((nl) null, (byte) 6);
                  break L1;
                }
              }
              stackOut_6_0 = ((nu) this).field_P[((nu) this).field_V.field_m][((nu) this).field_V.field_s];
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (nl) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2, "nu.H(" + param0 + ')');
        }
        return stackIn_7_0;
    }

    final boolean c(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        try {
          L0: {
            L1: {
              if (param1 <= -4) {
                break L1;
              } else {
                this.a((byte) 53, (ki) null);
                break L1;
              }
            }
            L2: {
              L3: {
                if (((nu) this).field_g[param0].field_p != ((nu) this).field_V.field_m) {
                  break L3;
                } else {
                  if (~((nu) this).field_V.field_s != ~((nu) this).field_R[param0].field_g) {
                    break L3;
                  } else {
                    stackOut_7_0 = 1;
                    stackIn_10_0 = stackOut_7_0;
                    break L2;
                  }
                }
              }
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var3, "nu.GA(" + param0 + ',' + param1 + ')');
        }
        return stackIn_10_0 != 0;
    }

    private final void c(int param0, ki param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        gt stackIn_35_0 = null;
        gt stackIn_37_0 = null;
        gt stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        gt stackIn_40_0 = null;
        gt stackIn_42_0 = null;
        gt stackIn_44_0 = null;
        gt stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_62_2 = null;
        RuntimeException decompiledCaughtException = null;
        gt stackOut_39_0 = null;
        gt stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        gt stackOut_40_0 = null;
        gt stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        gt stackOut_34_0 = null;
        gt stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        gt stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        String stackOut_61_2 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        var5 = Kickabout.field_G;
        try {
          L0: {
            var3_int = param1.field_u;
            L1: {
              var4 = param1.field_v;
              if (var4 == 0) {
                L2: {
                  ((nu) this).field_R[var3_int].field_v = true;
                  if (((nu) this).field_u < 5) {
                    ((nu) this).field_R[var3_int].field_s = true;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                ((nu) this).field_R[var3_int].a((mo) (Object) ((nu) this).field_g[var3_int], (byte) 84);
                ((nu) this).field_R[var3_int].field_g = -1;
                this.b(10, var3_int);
                break L1;
              } else {
                if (var4 != 2) {
                  if (var4 == 3) {
                    L3: {
                      stackOut_39_0 = ((nu) this).field_R[var3_int];
                      stackIn_44_0 = stackOut_39_0;
                      stackIn_40_0 = stackOut_39_0;
                      if (((nu) this).field_R[var3_int].field_k) {
                        stackOut_44_0 = (gt) (Object) stackIn_44_0;
                        stackOut_44_1 = 0;
                        stackIn_45_0 = stackOut_44_0;
                        stackIn_45_1 = stackOut_44_1;
                        break L3;
                      } else {
                        stackOut_40_0 = (gt) (Object) stackIn_40_0;
                        stackIn_42_0 = stackOut_40_0;
                        stackOut_42_0 = (gt) (Object) stackIn_42_0;
                        stackOut_42_1 = 1;
                        stackIn_45_0 = stackOut_42_0;
                        stackIn_45_1 = stackOut_42_1;
                        break L3;
                      }
                    }
                    stackIn_45_0.field_k = stackIn_45_1 != 0;
                    break L1;
                  } else {
                    if (var4 != 1) {
                      if (var4 == 4) {
                        ((nu) this).field_R[var3_int].a((mo) (Object) ((nu) this).field_g[var3_int], (byte) 84);
                        ((nu) this).field_R[var3_int].field_i = true;
                        break L1;
                      } else {
                        break L1;
                      }
                    } else {
                      if (((nu) this).field_u >= 5) {
                        break L1;
                      } else {
                        if (((nu) this).field_R[var3_int].field_s) {
                          break L1;
                        } else {
                          this.b(10, var3_int);
                          ((nu) this).field_R[var3_int].a((mo) (Object) ((nu) this).field_g[var3_int], (byte) 84);
                          ((nu) this).field_R[var3_int].field_s = true;
                          ((nu) this).field_R[var3_int].field_g = -1;
                          ((nu) this).field_q[var3_int].field_p = ((nu) this).field_v;
                          break L1;
                        }
                      }
                    }
                  }
                } else {
                  if (((nu) this).field_R[var3_int].d(3511)) {
                    L4: {
                      stackOut_34_0 = ((nu) this).field_R[var3_int];
                      stackIn_37_0 = stackOut_34_0;
                      stackIn_35_0 = stackOut_34_0;
                      if (((nu) this).field_R[var3_int].field_q) {
                        stackOut_37_0 = (gt) (Object) stackIn_37_0;
                        stackOut_37_1 = 0;
                        stackIn_38_0 = stackOut_37_0;
                        stackIn_38_1 = stackOut_37_1;
                        break L4;
                      } else {
                        stackOut_35_0 = (gt) (Object) stackIn_35_0;
                        stackOut_35_1 = 1;
                        stackIn_38_0 = stackOut_35_0;
                        stackIn_38_1 = stackOut_35_1;
                        break L4;
                      }
                    }
                    stackIn_38_0.field_q = stackIn_38_1 != 0;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_58_0 = (RuntimeException) var3;
            stackOut_58_1 = new StringBuilder().append("nu.S(").append(5).append(',');
            stackIn_61_0 = stackOut_58_0;
            stackIn_61_1 = stackOut_58_1;
            stackIn_59_0 = stackOut_58_0;
            stackIn_59_1 = stackOut_58_1;
            if (param1 == null) {
              stackOut_61_0 = (RuntimeException) (Object) stackIn_61_0;
              stackOut_61_1 = (StringBuilder) (Object) stackIn_61_1;
              stackOut_61_2 = "null";
              stackIn_62_0 = stackOut_61_0;
              stackIn_62_1 = stackOut_61_1;
              stackIn_62_2 = stackOut_61_2;
              break L5;
            } else {
              stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
              stackOut_59_1 = (StringBuilder) (Object) stackIn_59_1;
              stackOut_59_2 = "{...}";
              stackIn_62_0 = stackOut_59_0;
              stackIn_62_1 = stackOut_59_1;
              stackIn_62_2 = stackOut_59_2;
              break L5;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_62_0, stackIn_62_2 + ')');
        }
    }

    private final void a(int param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4_int = 0;
        nl[] var4 = null;
        int var5 = 0;
        nl var6 = null;
        int var7 = 0;
        int stackIn_14_0 = 0;
        nl stackIn_36_0 = null;
        nl stackIn_38_0 = null;
        nl stackIn_40_0 = null;
        nl stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        RuntimeException decompiledCaughtException = null;
        nl stackOut_35_0 = null;
        nl stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        nl stackOut_36_0 = null;
        nl stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_13_0 = 0;
        var7 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (!((nu) this).field_p) {
                break L1;
              } else {
                param0 = 0;
                break L1;
              }
            }
            var3_int = 0;
            L2: while (true) {
              if (var3_int >= 2) {
                ((nu) this).field_V.a(29360128, 0, (byte) 26, 44040192);
                ((nu) this).field_V.field_m = -1;
                var3_int = param1;
                L3: while (true) {
                  if (var3_int >= 2) {
                    ((nu) this).field_E.b(param1 + 22997);
                    break L0;
                  } else {
                    var4 = ((nu) this).field_P[var3_int];
                    var5 = 0;
                    L4: while (true) {
                      if (var5 >= var4.length) {
                        var3_int++;
                        continue L3;
                      } else {
                        L5: {
                          var6 = var4[var5];
                          stackOut_35_0 = (nl) var6;
                          stackIn_40_0 = stackOut_35_0;
                          stackIn_36_0 = stackOut_35_0;
                          if (var3_int != 0) {
                            stackOut_40_0 = (nl) (Object) stackIn_40_0;
                            stackOut_40_1 = 1;
                            stackIn_41_0 = stackOut_40_0;
                            stackIn_41_1 = stackOut_40_1;
                            break L5;
                          } else {
                            stackOut_36_0 = (nl) (Object) stackIn_36_0;
                            stackIn_38_0 = stackOut_36_0;
                            stackOut_38_0 = (nl) (Object) stackIn_38_0;
                            stackOut_38_1 = -1;
                            stackIn_41_0 = stackOut_38_0;
                            stackIn_41_1 = stackOut_38_1;
                            break L5;
                          }
                        }
                        stackIn_41_0.field_n = stackIn_41_1;
                        var6.field_G = 0;
                        var6.field_j = 0;
                        var5++;
                        continue L4;
                      }
                    }
                  }
                }
              } else {
                var4_int = 0;
                L6: while (true) {
                  if (var4_int >= 5) {
                    var3_int++;
                    continue L2;
                  } else {
                    L7: {
                      L8: {
                        if (var3_int != 1) {
                          break L8;
                        } else {
                          if (var4_int == 0) {
                            break L8;
                          } else {
                            stackOut_11_0 = 1;
                            stackIn_14_0 = stackOut_11_0;
                            break L7;
                          }
                        }
                      }
                      stackOut_13_0 = 0;
                      stackIn_14_0 = stackOut_13_0;
                      break L7;
                    }
                    L9: {
                      L10: {
                        L11: {
                          var5 = stackIn_14_0;
                          var6 = ((nu) this).field_P[var3_int][var4_int];
                          if (var5 != 0) {
                            break L11;
                          } else {
                            if (((nu) this).field_s) {
                              break L10;
                            } else {
                              break L11;
                            }
                          }
                        }
                        L12: {
                          if (var5 == 0) {
                            break L12;
                          } else {
                            if (((nu) this).field_p) {
                              break L10;
                            } else {
                              break L12;
                            }
                          }
                        }
                        var6.field_M = ts.a(var4_int, param0, var3_int, 448) << 16;
                        var6.field_w = cp.a((byte) 21, var4_int, var3_int, param0) << 16;
                        break L9;
                      }
                      var6.field_M = sh.a(70, var4_int);
                      var6.field_w = fm.a((byte) -27, var3_int);
                      break L9;
                    }
                    var4_int++;
                    continue L6;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var3, "nu.R(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(byte param0, ki param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        nl var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_41_0 = 0;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_40_0 = 0;
        int stackOut_38_0 = 0;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        try {
          L0: {
            if (((nu) this).field_u != 4) {
              return;
            } else {
              L1: {
                if (null == ((nu) this).field_X) {
                  break L1;
                } else {
                  if (((nu) this).field_X.field_m < 40) {
                    break L1;
                  } else {
                    return;
                  }
                }
              }
              L2: {
                if (-1 == ((nu) this).field_O) {
                  break L2;
                } else {
                  if (((nu) this).field_O >= ((nu) this).field_v) {
                    break L2;
                  } else {
                    return;
                  }
                }
              }
              var3_int = param1.field_u;
              if (((nu) this).field_R[var3_int].d(3511)) {
                if (param0 == 60) {
                  L3: {
                    var4 = ((nu) this).c(var3_int, -126) ? 1 : 0;
                    var5 = ((nu) this).a((byte) -119, var3_int);
                    var6 = param1.field_o;
                    var7 = param1.field_p;
                    if (var6 != 0) {
                      break L3;
                    } else {
                      if (var7 != 0) {
                        break L3;
                      } else {
                        var6 = var5.field_j;
                        var7 = var5.field_n;
                        break L3;
                      }
                    }
                  }
                  L4: {
                    L5: {
                      var5.a((mo) (Object) ((nu) this).field_g[var3_int], (byte) 84);
                      if (var4 == 0) {
                        break L5;
                      } else {
                        if (var5.field_u == 1) {
                          L6: {
                            var5.field_P = var7;
                            var5.field_x = var6;
                            var5.field_z = param1.field_v;
                            var8 = var5.d(5339);
                            var9 = uv.a(true, var7, var6);
                            if (pq.b(170, var8 ^ var9) <= 1) {
                              stackOut_40_0 = 0;
                              stackIn_41_0 = stackOut_40_0;
                              break L6;
                            } else {
                              stackOut_38_0 = 1;
                              stackIn_41_0 = stackOut_38_0;
                              break L6;
                            }
                          }
                          L7: {
                            var10 = stackIn_41_0;
                            var5.field_h = var9;
                            var5.a((byte) -31, 2);
                            if (var10 != 0) {
                              var5.field_L = var5.field_L + 16;
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          var11 = var5.a(var5.field_z, (byte) -68) + -128;
                          if (var11 <= 0) {
                            break L4;
                          } else {
                            var5.field_L = var5.field_L + (16 * var11 >> 7);
                            break L4;
                          }
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (var4 != 0) {
                      break L4;
                    } else {
                      if (!var5.d((byte) 108)) {
                        break L4;
                      } else {
                        if (!((nu) this).field_l) {
                          L8: {
                            var8 = uv.b(var7, var6, (byte) 2);
                            var5.b(var8, param0 + -61);
                            if (-1 != ((nu) this).field_V.field_m) {
                              break L8;
                            } else {
                              this.a(var5, (byte) 115);
                              break L8;
                            }
                          }
                          var5.field_F = var3_int;
                          ((nu) this).field_q[var3_int].field_n = ((nu) this).field_q[var3_int].field_n + 1;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
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
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_49_0 = (RuntimeException) var3;
            stackOut_49_1 = new StringBuilder().append("nu.I(").append(param0).append(',');
            stackIn_52_0 = stackOut_49_0;
            stackIn_52_1 = stackOut_49_1;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            if (param1 == null) {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "null";
              stackIn_53_0 = stackOut_52_0;
              stackIn_53_1 = stackOut_52_1;
              stackIn_53_2 = stackOut_52_2;
              break L9;
            } else {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "{...}";
              stackIn_53_0 = stackOut_50_0;
              stackIn_53_1 = stackOut_50_1;
              stackIn_53_2 = stackOut_50_2;
              break L9;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_53_0, stackIn_53_2 + ')');
        }
    }

    private final String c() {
        int var2_int = 0;
        RuntimeException var2 = null;
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        String stackIn_12_0 = null;
        String stackIn_15_0 = null;
        String stackIn_20_0 = null;
        String stackIn_25_0 = null;
        String stackIn_27_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_8_0 = null;
        String stackOut_19_0 = null;
        String stackOut_24_0 = null;
        String stackOut_26_0 = null;
        String stackOut_14_0 = null;
        String stackOut_11_0 = null;
        try {
          L0: {
            if (((nu) this).field_u == 0) {
              stackOut_3_0 = "TeamSelection";
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              var2_int = 1;
              if (((nu) this).field_u == 1) {
                stackOut_8_0 = "WaitForPlayers";
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0;
              } else {
                if (((nu) this).field_u != 2) {
                  if (((nu) this).field_u != 3) {
                    if (((nu) this).field_u == 4) {
                      stackOut_19_0 = "Playing";
                      stackIn_20_0 = stackOut_19_0;
                      return stackIn_20_0;
                    } else {
                      if (((nu) this).field_u == 5) {
                        stackOut_24_0 = "GameOver";
                        stackIn_25_0 = stackOut_24_0;
                        return stackIn_25_0;
                      } else {
                        stackOut_26_0 = "Invalid[" + ((nu) this).field_u + "]";
                        stackIn_27_0 = stackOut_26_0;
                        break L0;
                      }
                    }
                  } else {
                    stackOut_14_0 = "LineUp";
                    stackIn_15_0 = stackOut_14_0;
                    return stackIn_15_0;
                  }
                } else {
                  stackOut_11_0 = "Formation";
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2, "nu.IA(" + 59 + ')');
        }
        return stackIn_27_0;
    }

    public static void a() {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            field_M = null;
            field_a = null;
            field_D = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var1, "nu.CA(" + true + ')');
        }
    }

    final nl a(byte param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        nl stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        nl stackOut_0_0 = null;
        try {
          L0: {
            var3_int = 48 / ((param0 - 27) / 62);
            stackOut_0_0 = ((nu) this).field_P[((nu) this).field_g[param1].field_p][((nu) this).field_R[param1].field_g];
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var3, "nu.F(" + param0 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    final int a(byte param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_2_0 = 0;
        var5 = Kickabout.field_G;
        try {
          L0: {
            if (param0 == 6) {
              var4_int = 0;
              L1: while (true) {
                if (~var4_int <= ~((nu) this).field_g.length) {
                  stackOut_18_0 = -1;
                  stackIn_19_0 = stackOut_18_0;
                  break L0;
                } else {
                  L2: {
                    if (!((nu) this).field_R[var4_int].d(3511)) {
                      break L2;
                    } else {
                      if (param1 != ((nu) this).field_g[var4_int].field_p) {
                        break L2;
                      } else {
                        if (param2 != ((nu) this).field_R[var4_int].field_g) {
                          break L2;
                        } else {
                          stackOut_15_0 = var4_int;
                          stackIn_16_0 = stackOut_15_0;
                          return stackIn_16_0;
                        }
                      }
                    }
                  }
                  var4_int++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = 119;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var4, "nu.W(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_19_0;
    }

    private final void b(int param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (((nu) this).field_u != 0) {
                if (2 == ((nu) this).field_u) {
                  break L1;
                } else {
                  if (4 == ((nu) this).field_u) {
                    if (((nu) this).c(param1, -78)) {
                      ((nu) this).field_V.field_m = -1;
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
              } else {
                ((nu) this).field_n.a(false, param1);
                ((nu) this).field_n.a((mo) (Object) ((nu) this).field_g[param1], (byte) 84);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var3, "nu.JA(" + 10 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, mo param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6_int = 0;
        nl var6 = null;
        int var7_int = 0;
        nl var7 = null;
        int var8 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var8 = Kickabout.field_G;
        try {
          L0: {
            var5_int = ((nu) this).field_g[param3].field_p;
            var6_int = 0;
            L1: while (true) {
              if (~((nu) this).field_I >= ~var6_int) {
                L2: {
                  var7_int = -103 % ((param0 - -39) / 48);
                  if (((nu) this).field_R[param3].field_g == -1) {
                    break L2;
                  } else {
                    ((nu) this).a((byte) 118, param3).field_I = 6;
                    break L2;
                  }
                }
                L3: {
                  if (((nu) this).field_R[param3].field_g == -1) {
                    break L3;
                  } else {
                    var6 = ((nu) this).field_P[var5_int][((nu) this).field_R[param3].field_g];
                    var7 = ((nu) this).field_P[var5_int][param2];
                    var7.field_G = var6.field_G;
                    break L3;
                  }
                }
                ((nu) this).field_R[param3].field_g = param2;
                ((nu) this).a((byte) 91, param3).a(param1, (byte) 84);
                ((nu) this).field_R[param3].a(param1, (byte) 84);
                break L0;
              } else {
                L4: {
                  if (var5_int != ((nu) this).field_g[var6_int].field_p) {
                    break L4;
                  } else {
                    if (param2 != ((nu) this).field_R[var6_int].field_g) {
                      break L4;
                    } else {
                      return;
                    }
                  }
                }
                var6_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var5;
            stackOut_18_1 = new StringBuilder().append("nu.D(").append(param0).append(',');
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L5;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(ki param0) {
        RuntimeException var3 = null;
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
            if (3 == ((nu) this).field_u) {
              if (((nu) this).field_R[param0.field_u].d(3511)) {
                ((nu) this).field_o.a(param0.field_v, 0, param0.field_t, param0.field_s, param0.field_u);
                ((nu) this).field_o.a((mo) (Object) ((nu) this).field_g[param0.field_u], (byte) 84);
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
          L1: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("nu.O(");
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
              break L1;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L1;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + -34 + ')');
        }
    }

    private final void b(int param0, byte param1) {
        RuntimeException var3 = null;
        nl var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        long var8 = 0L;
        long var10 = 0L;
        int var12_int = 0;
        long var12 = 0L;
        int var14 = 0;
        RuntimeException decompiledCaughtException = null;
        var14 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              var3_ref = ((nu) this).field_P[((nu) this).field_V.field_m][param0];
              var4 = var3_ref.field_M;
              var5 = var3_ref.field_w;
              if (((nu) this).field_V.field_m != 1) {
                break L1;
              } else {
                if (((nu) this).field_p) {
                  var5 = 44040192;
                  var4 = 29360128;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              var6 = (var4 - ((nu) this).field_V.field_t) * 3 >> 2;
              var7 = (var5 - ((nu) this).field_V.field_p) * 3 >> 2;
              var8 = sg.field_d[((nu) this).field_t];
              var10 = var8;
              var12_int = 0;
              if (param1 == -72) {
                break L2;
              } else {
                int discarded$1 = ((nu) this).b((byte) -75, -73);
                break L2;
              }
            }
            L3: while (true) {
              if (var12_int >= 70) {
                var12 = (-var8 + 65536L << 16) / (-var10 + 65536L);
                ((nu) this).field_V.field_h = (int)((long)var7 * var12 >> 16);
                ((nu) this).field_V.field_n = 573440;
                ((nu) this).field_V.field_q = (int)((long)var6 * var12 >> 16);
                ((nu) this).field_V.field_r = 10;
                ((nu) this).field_V.field_m = -1;
                break L0;
              } else {
                var10 = var8 * var10 >> 16;
                var12_int++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var3, "nu.U(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, boolean param1, boolean param2, int param3, byte param4, int param5) {
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            L1: {
              var7_int = (393216 * param0 >> 8) + 786432;
              if (!param1) {
                stackOut_3_0 = 227;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_1_0 = 700;
                stackIn_4_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var8 = stackIn_4_0;
              if (param4 <= -6) {
                break L2;
              } else {
                field_D = null;
                break L2;
              }
            }
            L3: {
              var9 = (var7_int >> 8) * we.a(var8, false) >> 8;
              var10 = (var7_int >> 8) * ei.a(var8, (byte) -23) >> 8;
              if (!param2) {
                break L3;
              } else {
                if (param1) {
                  break L3;
                } else {
                  if (param0 <= 32) {
                    break L3;
                  } else {
                    var9 = var9 + ((var9 * 3 >> 1) - -(1280 * param0));
                    ((nu) this).field_V.field_A = 25;
                    break L3;
                  }
                }
              }
            }
            L4: {
              var11 = de.a(param5 * param5 + param3 * param3, (byte) 84);
              ((nu) this).field_V.field_n = var10;
              if (var11 != 0) {
                ((nu) this).field_V.field_q = param3 * var9 / var11;
                ((nu) this).field_V.field_h = param5 * var9 / var11;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              ((nu) this).field_V.field_m = -1;
              if (!param1) {
                ((nu) this).field_V.field_r = 20;
                break L5;
              } else {
                ((nu) this).field_V.field_r = 35;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var7, "nu.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void d(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3_int = 0;
        nl var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (((nu) this).field_v > 0) {
                ((nu) this).field_v = ((nu) this).field_v - 1;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (((nu) this).field_u == 0) {
                ((nu) this).field_n.field_b = ((nu) this).field_n.field_b + 1;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (((nu) this).field_u == 2) {
                ((nu) this).field_C.field_b = ((nu) this).field_C.field_b + 1;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (((nu) this).field_u != 3) {
                break L4;
              } else {
                ((nu) this).field_o.field_b = ((nu) this).field_o.field_b + 1;
                break L4;
              }
            }
            L5: {
              if (((nu) this).field_u != param0) {
                break L5;
              } else {
                var2_int = 0;
                L6: while (true) {
                  if (var2_int >= ((nu) this).field_I) {
                    ((nu) this).field_V.field_b = ((nu) this).field_V.field_b + 1;
                    ((nu) this).field_X.field_b = ((nu) this).field_X.field_b + 1;
                    var2_int = 0;
                    L7: while (true) {
                      if (2 <= var2_int) {
                        break L5;
                      } else {
                        var3_int = 0;
                        L8: while (true) {
                          if (var3_int >= 5) {
                            var2_int++;
                            continue L7;
                          } else {
                            ((nu) this).field_P[var2_int][var3_int].field_b = ((nu) this).field_P[var2_int][var3_int].field_b + 1;
                            var3_int++;
                            continue L8;
                          }
                        }
                      }
                    }
                  } else {
                    ((nu) this).field_R[var2_int].field_b = ((nu) this).field_R[var2_int].field_b + 1;
                    var2_int++;
                    continue L6;
                  }
                }
              }
            }
            L9: {
              if (((nu) this).field_u != 4) {
                break L9;
              } else {
                int discarded$1 = 11660;
                this.b();
                var2_int = 0;
                L10: while (true) {
                  if (var2_int >= ((nu) this).field_I) {
                    break L9;
                  } else {
                    L11: {
                      if (((nu) this).field_R[var2_int].field_s) {
                        break L11;
                      } else {
                        if (((nu) this).field_g[var2_int].field_p < 0) {
                          break L11;
                        } else {
                          if (((nu) this).field_R[var2_int].field_g >= 0) {
                            L12: {
                              var3 = ((nu) this).a((byte) -39, var2_int);
                              if (((nu) this).field_g[var2_int].field_p != 0) {
                                break L12;
                              } else {
                                if (var3.a(true) < 672) {
                                  break L12;
                                } else {
                                  break L12;
                                }
                              }
                            }
                            if (((nu) this).field_g[var2_int].field_p != 1) {
                              break L11;
                            } else {
                              if (var3.a(true) <= 672) {
                                break L11;
                              } else {
                                break L11;
                              }
                            }
                          } else {
                            break L11;
                          }
                        }
                      }
                    }
                    var2_int++;
                    continue L10;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2, "nu.FA(" + param0 + ')');
        }
    }

    final static void a(int param0, long param1, int param2, int param3, boolean param4, String param5) {
        int var7_int = 0;
        RuntimeException var7 = null;
        ml stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        ml stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        ml stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        ml stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        ml stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        ml stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
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
              or.field_d.b(14, (byte) 77);
              or.field_d.field_n = or.field_d.field_n + 1;
              var7_int = or.field_d.field_n;
              or.field_d.a(param1, -1781890008);
              or.field_d.a(14190, param5);
              or.field_d.a(118, param2);
              stackOut_0_0 = or.field_d;
              stackOut_0_1 = 114;
              stackIn_3_0 = stackOut_0_0;
              stackIn_3_1 = stackOut_0_1;
              stackIn_1_0 = stackOut_0_0;
              stackIn_1_1 = stackOut_0_1;
              if (param4) {
                stackOut_3_0 = (ml) (Object) stackIn_3_0;
                stackOut_3_1 = stackIn_3_1;
                stackOut_3_2 = 1;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                stackIn_4_2 = stackOut_3_2;
                break L1;
              } else {
                stackOut_1_0 = (ml) (Object) stackIn_1_0;
                stackOut_1_1 = stackIn_1_1;
                stackOut_1_2 = 0;
                stackIn_4_0 = stackOut_1_0;
                stackIn_4_1 = stackOut_1_1;
                stackIn_4_2 = stackOut_1_2;
                break L1;
              }
            }
            ((ml) (Object) stackIn_4_0).a(stackIn_4_1, stackIn_4_2);
            or.field_d.c(62, or.field_d.field_n + -var7_int);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var7;
            stackOut_9_1 = new StringBuilder().append("nu.K(").append(119).append(',').append(param1).append(',').append(param2).append(',').append(14).append(',').append(param4).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param5 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
    }

    final void a(byte param0) {
        RuntimeException var2 = null;
        ki var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Kickabout.field_G;
        try {
          L0: {
            var2_ref = (ki) (Object) ((nu) this).field_E.g(24009);
            L1: while (true) {
              if (null == var2_ref) {
                var3 = 69 % ((param0 - 70) / 48);
                break L0;
              } else {
                L2: {
                  var3 = var2_ref.field_r;
                  if (2 == var3) {
                    this.a((byte) 60, var2_ref);
                    break L2;
                  } else {
                    if (var3 == 1) {
                      this.b((byte) 125, var2_ref);
                      break L2;
                    } else {
                      if (var3 == 0) {
                        this.b(true, var2_ref);
                        break L2;
                      } else {
                        if (var3 == 4) {
                          this.a(1, var2_ref);
                          break L2;
                        } else {
                          if (var3 == 3) {
                            this.b(26214, var2_ref);
                            break L2;
                          } else {
                            if (var3 == 5) {
                              int discarded$1 = -34;
                              this.a(var2_ref);
                              break L2;
                            } else {
                              if (6 != var3) {
                                if (var3 != 7) {
                                  break L2;
                                } else {
                                  this.a(false, var2_ref);
                                  break L2;
                                }
                              } else {
                                this.c(5, var2_ref);
                                break L2;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                var2_ref = (ki) (Object) ((nu) this).field_E.c(33);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2, "nu.A(" + param0 + ')');
        }
    }

    private final void a(int param0) {
        RuntimeException var2 = null;
        int[] var2_array = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = Kickabout.field_G;
        try {
          L0: {
            var2_array = new int[]{3, 4, param0, 1};
            var3 = 0;
            L1: while (true) {
              if (~((nu) this).field_R.length >= ~var3) {
                var3 = 0;
                L2: while (true) {
                  if (var3 >= 2) {
                    var3 = 0;
                    L3: while (true) {
                      if (var3 >= 2) {
                        ((nu) this).field_J = 0;
                        break L0;
                      } else {
                        var4 = 1;
                        L4: while (true) {
                          if (var4 >= 5) {
                            var3++;
                            continue L3;
                          } else {
                            ((nu) this).field_P[var3][var4].field_I = 0;
                            var4++;
                            continue L4;
                          }
                        }
                      }
                    }
                  } else {
                    L5: {
                      if (((nu) this).field_R[((nu) this).field_i[var3][2]].d(3511)) {
                        break L5;
                      } else {
                        var4 = 0;
                        L6: while (true) {
                          if (var4 >= ((nu) this).field_I) {
                            break L5;
                          } else {
                            L7: {
                              if (~var3 != ~((nu) this).field_g[var4].field_p) {
                                break L7;
                              } else {
                                if (!((nu) this).field_R[var4].d(3511)) {
                                  break L7;
                                } else {
                                  ((nu) this).field_R[var4].field_g = 3;
                                  break L5;
                                }
                              }
                            }
                            var4++;
                            continue L6;
                          }
                        }
                      }
                    }
                    var3++;
                    continue L2;
                  }
                }
              } else {
                L8: {
                  if (!((nu) this).field_R[var3].d(3511)) {
                    break L8;
                  } else {
                    var4 = ((nu) this).field_g[var3].field_p;
                    var5 = 0;
                    L9: while (true) {
                      if (4 <= var5) {
                        break L8;
                      } else {
                        var6 = var2_array[var5];
                        if (var3 == ((nu) this).field_i[var4][var6 - 1]) {
                          ((nu) this).field_R[var3].field_g = var6;
                          break L8;
                        } else {
                          var5++;
                          continue L9;
                        }
                      }
                    }
                  }
                }
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2, "nu.M(" + param0 + ')');
        }
    }

    final void a(int param0, byte param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        int var6_int = 0;
        up var6_ref = null;
        int var7 = 0;
        jc stackIn_30_0 = null;
        jc stackIn_32_0 = null;
        jc stackIn_34_0 = null;
        jc stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        RuntimeException decompiledCaughtException = null;
        jc stackOut_29_0 = null;
        jc stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        jc stackOut_30_0 = null;
        jc stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        var7 = Kickabout.field_G;
        try {
          L0: {
            if (param1 <= -49) {
              L1: {
                ((nu) this).field_u = param0;
                ((nu) this).field_v = cv.field_a[((nu) this).field_u];
                if (((nu) this).field_u != 0) {
                  if (((nu) this).field_u != 1) {
                    if (((nu) this).field_u != 2) {
                      if (3 == ((nu) this).field_u) {
                        ((nu) this).field_o = new wl(((nu) this).field_e, ((nu) this).field_g, ((nu) this).field_R, ((nu) this).field_i, ((nu) this).field_k, ((nu) this).field_b);
                        break L1;
                      } else {
                        if (((nu) this).field_u != 4) {
                          break L1;
                        } else {
                          L2: {
                            if (((nu) this).field_q != null) {
                              var3_int = 0;
                              L3: while (true) {
                                if (~((nu) this).field_g.length >= ~var3_int) {
                                  break L2;
                                } else {
                                  L4: {
                                    stackOut_29_0 = ((nu) this).field_q[var3_int];
                                    stackIn_34_0 = stackOut_29_0;
                                    stackIn_30_0 = stackOut_29_0;
                                    if (((nu) this).field_g[var3_int].field_p != 0) {
                                      stackOut_34_0 = (jc) (Object) stackIn_34_0;
                                      stackOut_34_1 = 0;
                                      stackIn_35_0 = stackOut_34_0;
                                      stackIn_35_1 = stackOut_34_1;
                                      break L4;
                                    } else {
                                      stackOut_30_0 = (jc) (Object) stackIn_30_0;
                                      stackIn_32_0 = stackOut_30_0;
                                      stackOut_32_0 = (jc) (Object) stackIn_32_0;
                                      stackOut_32_1 = 1;
                                      stackIn_35_0 = stackOut_32_0;
                                      stackIn_35_1 = stackOut_32_1;
                                      break L4;
                                    }
                                  }
                                  stackIn_35_0.field_o = stackIn_35_1 != 0;
                                  var3_int++;
                                  continue L3;
                                }
                              }
                            } else {
                              break L2;
                            }
                          }
                          L5: {
                            ((nu) this).field_v = ((nu) this).field_O;
                            if (0 < ((nu) this).field_v) {
                              ((nu) this).field_v = ((nu) this).field_v + 140;
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          ((nu) this).field_V = new tj();
                          ((nu) this).field_P = new nl[2][5];
                          var3_int = 0;
                          L6: while (true) {
                            if (2 <= var3_int) {
                              ((nu) this).field_V.field_l = mp.field_p[((nu) this).field_t];
                              ((nu) this).field_X = new ua();
                              this.a(1, 0);
                              this.a(2);
                              break L1;
                            } else {
                              var4 = 0;
                              L7: while (true) {
                                if (var4 >= 5) {
                                  var3_int++;
                                  continue L6;
                                } else {
                                  L8: {
                                    var5 = 1;
                                    if (var4 <= 0) {
                                      break L8;
                                    } else {
                                      var6_int = ((nu) this).field_i[var3_int][-1 + var4];
                                      if (0 != (((nu) this).field_c & 1 << var6_int)) {
                                        break L8;
                                      } else {
                                        var5 = 0;
                                        break L8;
                                      }
                                    }
                                  }
                                  L9: {
                                    var6 = null;
                                    if (var4 != 0) {
                                      var6_ref = ((nu) this).field_b[var3_int][-1 + var4];
                                      break L9;
                                    } else {
                                      int discarded$1 = 0;
                                      var6_ref = mv.b();
                                      break L9;
                                    }
                                  }
                                  L10: {
                                    ((nu) this).field_P[var3_int][var4] = new nl();
                                    ((nu) this).field_P[var3_int][var4].a(var5 != 0, var6_ref, 3);
                                    if (var6_ref.a(var5 != 0, (byte) -111)) {
                                      ((nu) this).field_F[var3_int] = true;
                                      break L10;
                                    } else {
                                      break L10;
                                    }
                                  }
                                  var4++;
                                  continue L7;
                                }
                              }
                            }
                          }
                        }
                      }
                    } else {
                      ((nu) this).field_C = new wr();
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                } else {
                  ((nu) this).field_n = new oe(((nu) this).field_R);
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
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var3, "nu.EA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void b(int param0, ki param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
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
            if (2 == ((nu) this).field_u) {
              var3_int = ((nu) this).field_g[param1.field_u].field_p;
              if (~((nu) this).b((byte) 72, var3_int) == ~param1.field_u) {
                ((nu) this).field_C.a(var3_int, 1, param1.field_v);
                ((nu) this).field_C.a((mo) (Object) ((nu) this).field_g[param1.field_u], (byte) 84);
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
          L1: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("nu.E(").append(26214).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L1;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L1;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
    }

    final void a(ki param0, int param1) {
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
              ((nu) this).field_E.a((gn) (Object) param0, 3);
              if (param1 < -114) {
                break L1;
              } else {
                String discarded$3 = ((nu) this).toString();
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
            stackOut_3_1 = new StringBuilder().append("nu.V(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
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
          throw nb.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
    }

    public final String toString() {
        RuntimeException var1 = null;
        StringBuilder var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        ki var3_ref_ki = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        StringBuilder stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        StringBuilder stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        StringBuilder stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        StringBuilder stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        StringBuilder stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        StringBuilder stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        StringBuilder stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_61_2 = null;
        String stackIn_91_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_90_0 = null;
        StringBuilder stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        StringBuilder stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
        StringBuilder stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        StringBuilder stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        StringBuilder stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        StringBuilder stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        StringBuilder stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        var6 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              int discarded$31 = 59;
              var1_ref = new StringBuilder("CommonGame(players=" + ((nu) this).field_I + ",timelimit=" + ((nu) this).field_O + ") phase=" + this.c() + " phase_time=" + ((nu) this).field_v + "\n");
              StringBuilder discarded$32 = var1_ref.append("\tsurface=" + ((nu) this).field_t + "\ttier=" + ((nu) this).field_m + "\twinner=" + ((nu) this).field_Z + "\tai_tick=" + ((nu) this).field_J);
              if (!((nu) this).field_G) {
                break L1;
              } else {
                StringBuilder discarded$33 = var1_ref.append("\tbigheadmode");
                break L1;
              }
            }
            L2: {
              if (((nu) this).field_s) {
                StringBuilder discarded$34 = var1_ref.append("\tdisable_local");
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (!((nu) this).field_p) {
                break L3;
              } else {
                StringBuilder discarded$35 = var1_ref.append("\tdisable_opponent");
                break L3;
              }
            }
            StringBuilder discarded$36 = var1_ref.append("\n");
            var2 = 0;
            L4: while (true) {
              if (var2 >= ((nu) this).field_S.length) {
                L5: {
                  var2 = ((nu) this).field_E.a(false);
                  if (var2 <= 0) {
                    break L5;
                  } else {
                    StringBuilder discarded$37 = var1_ref.append("\tEnqueued moves: " + var2 + "\n");
                    var3_ref_ki = (ki) (Object) ((nu) this).field_E.g(24009);
                    L6: while (true) {
                      if (null == var3_ref_ki) {
                        break L5;
                      } else {
                        StringBuilder discarded$38 = var1_ref.append("\t\t" + (Object) (Object) var3_ref_ki + "\n");
                        var3_ref_ki = (ki) (Object) ((nu) this).field_E.c(33);
                        continue L6;
                      }
                    }
                  }
                }
                var3 = 0;
                L7: while (true) {
                  if (var3 >= 2) {
                    L8: {
                      if (((nu) this).field_u != 0) {
                        break L8;
                      } else {
                        StringBuilder discarded$39 = var1_ref.append("\t" + (Object) (Object) ((nu) this).field_n);
                        break L8;
                      }
                    }
                    L9: {
                      if (((nu) this).field_u == 2) {
                        StringBuilder discarded$40 = var1_ref.append("\t" + (Object) (Object) ((nu) this).field_C);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      if (((nu) this).field_u == 3) {
                        StringBuilder discarded$41 = var1_ref.append("\t" + (Object) (Object) ((nu) this).field_o);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (((nu) this).field_u == 4) {
                        StringBuilder discarded$42 = var1_ref.append("\n\t" + (Object) (Object) ((nu) this).field_X);
                        StringBuilder discarded$43 = var1_ref.append("\n\t" + (Object) (Object) ((nu) this).field_V);
                        var3 = 0;
                        L12: while (true) {
                          if (2 <= var3) {
                            break L11;
                          } else {
                            var4 = 0;
                            L13: while (true) {
                              if (var4 >= 5) {
                                var3++;
                                continue L12;
                              } else {
                                L14: {
                                  StringBuilder discarded$44 = var1_ref.append("\n\t" + var3 + "." + var4 + " " + (Object) (Object) ((nu) this).field_P[var3][var4]);
                                  var5 = ((nu) this).a((byte) 6, var3, var4);
                                  if (var5 != -1) {
                                    StringBuilder discarded$45 = var1_ref.append("\n\t\tCTRL=\t" + ((nu) this).field_S[var5]);
                                    break L14;
                                  } else {
                                    break L14;
                                  }
                                }
                                var4++;
                                continue L13;
                              }
                            }
                          }
                        }
                      } else {
                        break L11;
                      }
                    }
                    stackOut_90_0 = var1_ref.toString();
                    stackIn_91_0 = stackOut_90_0;
                    break L0;
                  } else {
                    StringBuilder discarded$46 = var1_ref.append("\tteam " + var3 + ": kit=[" + ((nu) this).field_H[var3] + "," + ((nu) this).field_d[var3] + "," + ((nu) this).field_Q[var3] + "]\tslot_owner=[");
                    var4 = 0;
                    L15: while (true) {
                      if (var4 >= 4) {
                        StringBuilder discarded$47 = var1_ref.append("]\tchosen_player_ids=[");
                        var4 = 0;
                        L16: while (true) {
                          if (var4 >= 4) {
                            L17: {
                              StringBuilder discarded$48 = var1_ref.append("]\tformation=" + ((nu) this).field_r[var3]);
                              if (((nu) this).field_F[var3]) {
                                StringBuilder discarded$49 = var1_ref.append("\tteam_immunity");
                                break L17;
                              } else {
                                break L17;
                              }
                            }
                            StringBuilder discarded$50 = var1_ref.append("\n");
                            var3++;
                            continue L7;
                          } else {
                            L18: {
                              stackOut_57_0 = (StringBuilder) var1_ref;
                              stackOut_57_1 = new StringBuilder().append(((nu) this).field_k[var3][var4]);
                              stackIn_60_0 = stackOut_57_0;
                              stackIn_60_1 = stackOut_57_1;
                              stackIn_58_0 = stackOut_57_0;
                              stackIn_58_1 = stackOut_57_1;
                              if (var4 >= 3) {
                                stackOut_60_0 = (StringBuilder) (Object) stackIn_60_0;
                                stackOut_60_1 = (StringBuilder) (Object) stackIn_60_1;
                                stackOut_60_2 = "";
                                stackIn_61_0 = stackOut_60_0;
                                stackIn_61_1 = stackOut_60_1;
                                stackIn_61_2 = stackOut_60_2;
                                break L18;
                              } else {
                                stackOut_58_0 = (StringBuilder) (Object) stackIn_58_0;
                                stackOut_58_1 = (StringBuilder) (Object) stackIn_58_1;
                                stackOut_58_2 = ",";
                                stackIn_61_0 = stackOut_58_0;
                                stackIn_61_1 = stackOut_58_1;
                                stackIn_61_2 = stackOut_58_2;
                                break L18;
                              }
                            }
                            StringBuilder discarded$51 = ((StringBuilder) (Object) stackIn_61_0).append(stackIn_61_2);
                            var4++;
                            continue L16;
                          }
                        }
                      } else {
                        L19: {
                          stackOut_48_0 = (StringBuilder) var1_ref;
                          stackOut_48_1 = new StringBuilder().append(((nu) this).field_i[var3][var4]);
                          stackIn_53_0 = stackOut_48_0;
                          stackIn_53_1 = stackOut_48_1;
                          stackIn_49_0 = stackOut_48_0;
                          stackIn_49_1 = stackOut_48_1;
                          if (var4 >= 3) {
                            stackOut_53_0 = (StringBuilder) (Object) stackIn_53_0;
                            stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
                            stackOut_53_2 = "";
                            stackIn_54_0 = stackOut_53_0;
                            stackIn_54_1 = stackOut_53_1;
                            stackIn_54_2 = stackOut_53_2;
                            break L19;
                          } else {
                            stackOut_49_0 = (StringBuilder) (Object) stackIn_49_0;
                            stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
                            stackIn_51_0 = stackOut_49_0;
                            stackIn_51_1 = stackOut_49_1;
                            stackOut_51_0 = (StringBuilder) (Object) stackIn_51_0;
                            stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
                            stackOut_51_2 = ",";
                            stackIn_54_0 = stackOut_51_0;
                            stackIn_54_1 = stackOut_51_1;
                            stackIn_54_2 = stackOut_51_2;
                            break L19;
                          }
                        }
                        StringBuilder discarded$52 = ((StringBuilder) (Object) stackIn_54_0).append(stackIn_54_2);
                        var4++;
                        continue L15;
                      }
                    }
                  }
                }
              } else {
                L20: {
                  StringBuilder discarded$53 = var1_ref.append("\t" + var2 + " [" + ((nu) this).field_g[var2].field_p + "]: " + ((nu) this).field_S[var2] + "\t" + ((nu) this).field_R[var2].field_g + " " + ((nu) this).field_R[var2].field_p + " " + ((nu) this).field_R[var2].field_l + "\t");
                  if (!((nu) this).field_R[var2].field_k) {
                    break L20;
                  } else {
                    StringBuilder discarded$54 = var1_ref.append("offer_rematch\t");
                    break L20;
                  }
                }
                L21: {
                  if (!((nu) this).field_R[var2].field_q) {
                    break L21;
                  } else {
                    StringBuilder discarded$55 = var1_ref.append("offer_draw\t");
                    break L21;
                  }
                }
                L22: {
                  if (((nu) this).field_R[var2].field_s) {
                    StringBuilder discarded$56 = var1_ref.append("resigned\t");
                    break L22;
                  } else {
                    break L22;
                  }
                }
                L23: {
                  if (!((nu) this).field_R[var2].field_v) {
                    break L23;
                  } else {
                    StringBuilder discarded$57 = var1_ref.append("departed\t");
                    break L23;
                  }
                }
                L24: {
                  if (((nu) this).field_R[var2].field_i) {
                    break L24;
                  } else {
                    StringBuilder discarded$58 = var1_ref.append("!loaded_pitch\t");
                    break L24;
                  }
                }
                L25: {
                  if (!((nu) this).field_R[var2].field_n) {
                    StringBuilder discarded$59 = var1_ref.append("!reward\t");
                    break L25;
                  } else {
                    break L25;
                  }
                }
                L26: {
                  if (((nu) this).field_R[var2].field_u) {
                    StringBuilder discarded$60 = var1_ref.append("megamode\t");
                    break L26;
                  } else {
                    break L26;
                  }
                }
                StringBuilder discarded$61 = var1_ref.append("\n");
                var2++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var1, "nu.toString()");
        }
        return stackIn_91_0;
    }

    final void a(ml param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        RuntimeException stackIn_107_0 = null;
        StringBuilder stackIn_107_1 = null;
        RuntimeException stackIn_108_0 = null;
        StringBuilder stackIn_108_1 = null;
        String stackIn_108_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_104_0 = null;
        StringBuilder stackOut_104_1 = null;
        RuntimeException stackOut_107_0 = null;
        StringBuilder stackOut_107_1 = null;
        String stackOut_107_2 = null;
        RuntimeException stackOut_105_0 = null;
        StringBuilder stackOut_105_1 = null;
        String stackOut_105_2 = null;
        var7 = Kickabout.field_G;
        try {
          L0: {
            param0.p(param2 ^ -118);
            var4_int = 0;
            L1: while (true) {
              if (var4_int >= ((nu) this).field_I) {
                L2: {
                  ((nu) this).field_u = param0.l(3, param2 ^ 58);
                  if (((nu) this).field_u <= 0) {
                    break L2;
                  } else {
                    var4_int = 0;
                    L3: while (true) {
                      if (var4_int >= ((nu) this).field_I) {
                        var4_int = 0;
                        L4: while (true) {
                          if (var4_int >= 2) {
                            ((nu) this).field_t = param0.l(2, 59);
                            ((nu) this).field_m = param0.l(2, 59);
                            break L2;
                          } else {
                            ((nu) this).field_H[var4_int] = param0.l(5, 59);
                            ((nu) this).field_d[var4_int] = param0.l(5, param2 + 58);
                            ((nu) this).field_Q[var4_int] = param0.l(5, 59);
                            var4_int++;
                            continue L4;
                          }
                        }
                      } else {
                        ((nu) this).field_g[var4_int].field_p = param0.l(1, 59);
                        var4_int++;
                        continue L3;
                      }
                    }
                  }
                }
                L5: {
                  if (2 >= ((nu) this).field_u) {
                    break L5;
                  } else {
                    var4_int = 0;
                    L6: while (true) {
                      if (var4_int >= 2) {
                        break L5;
                      } else {
                        ((nu) this).field_r[var4_int] = param0.l(3, 59);
                        var5 = 0;
                        L7: while (true) {
                          if (4 <= var5) {
                            var4_int++;
                            continue L6;
                          } else {
                            ((nu) this).field_i[var4_int][var5] = param0.l(3, ek.b(param2, 58));
                            var5++;
                            continue L7;
                          }
                        }
                      }
                    }
                  }
                }
                L8: {
                  if (3 >= ((nu) this).field_u) {
                    break L8;
                  } else {
                    var4_int = 0;
                    L9: while (true) {
                      if (var4_int >= 2) {
                        param0.l((byte) 121);
                        var4_int = 0;
                        L10: while (true) {
                          if (var4_int >= 2) {
                            param0.p(-116);
                            break L8;
                          } else {
                            var5 = 0;
                            L11: while (true) {
                              if (var5 >= 4) {
                                var4_int++;
                                continue L10;
                              } else {
                                ((nu) this).field_b[var4_int][var5].a(param2 ^ 46, (iw) (Object) param0);
                                var5++;
                                continue L11;
                              }
                            }
                          }
                        }
                      } else {
                        var5 = 0;
                        L12: while (true) {
                          if (var5 >= 4) {
                            var4_int++;
                            continue L9;
                          } else {
                            ((nu) this).field_k[var4_int][var5] = param0.l(4, 59) + -1;
                            var5++;
                            continue L12;
                          }
                        }
                      }
                    }
                  }
                }
                L13: {
                  if (5 > ((nu) this).field_u) {
                    break L13;
                  } else {
                    ((nu) this).field_Z = param0.l(3, 59) + -3;
                    var4_int = 0;
                    L14: while (true) {
                      if (~((nu) this).field_I >= ~var4_int) {
                        break L13;
                      } else {
                        L15: {
                          int discarded$5 = -39;
                          ((nu) this).field_g[var4_int].field_l = mu.a(param0);
                          int discarded$6 = -39;
                          ((nu) this).field_g[var4_int].field_i = mu.a(param0);
                          if (var4_int != param1) {
                            break L15;
                          } else {
                            L16: {
                              var5 = param0.l(1, 59);
                              if (var5 != 1) {
                                break L16;
                              } else {
                                break L16;
                              }
                            }
                            L17: {
                              int discarded$7 = param0.l(7, 59);
                              ((nu) this).field_g[var4_int].field_g = param0.l(15, 59);
                              var5 = param0.l(1, 59);
                              ((nu) this).field_g[var4_int].field_k = param0.l(6, 59);
                              if (var5 == 1) {
                                ((nu) this).field_g[var4_int].field_k = -((nu) this).field_g[var4_int].field_k;
                                break L17;
                              } else {
                                break L17;
                              }
                            }
                            var6 = 0;
                            L18: while (true) {
                              if (~var6 <= ~((nu) this).field_g[var4_int].field_o.length) {
                                break L15;
                              } else {
                                ((nu) this).field_g[var4_int].field_o[var6] = param0.l(8, 59);
                                var6++;
                                continue L18;
                              }
                            }
                          }
                        }
                        var4_int++;
                        continue L14;
                      }
                    }
                  }
                }
                ((nu) this).a(((nu) this).field_u, (byte) -124);
                if (param2 == 1) {
                  int discarded$8 = 16;
                  ((nu) this).field_v = -1 + sk.a(19881, 8, 0, 4, param0);
                  var4_int = 0;
                  L19: while (true) {
                    if (var4_int >= ((nu) this).field_I) {
                      L20: {
                        if (((nu) this).field_u == 0) {
                          ((nu) this).field_n.b(param0, 4);
                          ((nu) this).field_n.a(74, param0);
                          break L20;
                        } else {
                          break L20;
                        }
                      }
                      L21: {
                        if (((nu) this).field_u == 2) {
                          ((nu) this).field_C.b(param0, 4);
                          ((nu) this).field_C.c(param0, 2);
                          break L21;
                        } else {
                          break L21;
                        }
                      }
                      L22: {
                        if (3 != ((nu) this).field_u) {
                          break L22;
                        } else {
                          ((nu) this).field_o.b(param0, 4);
                          ((nu) this).field_o.a(param0, false);
                          break L22;
                        }
                      }
                      L23: {
                        if (((nu) this).field_u == 4) {
                          ((nu) this).field_V.b(param0, 4);
                          var4_int = 0;
                          L24: while (true) {
                            if (var4_int >= 2) {
                              ((nu) this).field_X.b(param0, param2 ^ 5);
                              var4_int = 0;
                              L25: while (true) {
                                if (var4_int >= 2) {
                                  ((nu) this).field_V.a(param0, (byte) -124);
                                  ((nu) this).field_X.a(param0, (byte) -84);
                                  ((nu) this).field_J = param0.l(8, 59);
                                  int discarded$9 = -39;
                                  ((nu) this).field_G = mu.a(param0);
                                  break L23;
                                } else {
                                  var5 = 0;
                                  L26: while (true) {
                                    if (var5 >= 5) {
                                      var4_int++;
                                      continue L25;
                                    } else {
                                      ((nu) this).field_P[var4_int][var5].a(param2 + -13919, param0);
                                      var5++;
                                      continue L26;
                                    }
                                  }
                                }
                              }
                            } else {
                              var5 = 0;
                              L27: while (true) {
                                if (var5 >= 5) {
                                  var4_int++;
                                  continue L24;
                                } else {
                                  ((nu) this).field_P[var4_int][var5].b(param0, 4);
                                  var5++;
                                  continue L27;
                                }
                              }
                            }
                          }
                        } else {
                          break L23;
                        }
                      }
                      param0.l((byte) 95);
                      break L0;
                    } else {
                      ((nu) this).field_R[var4_int].b(param0, 4);
                      ((nu) this).field_R[var4_int].c(param0, param2);
                      var4_int++;
                      continue L19;
                    }
                  }
                } else {
                  return;
                }
              } else {
                ((nu) this).field_g[var4_int].field_h = param0.l(16, 59);
                ((nu) this).field_g[var4_int].field_f = param0.l(3, 59);
                var4_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L28: {
            var4 = decompiledCaughtException;
            stackOut_104_0 = (RuntimeException) var4;
            stackOut_104_1 = new StringBuilder().append("nu.P(");
            stackIn_107_0 = stackOut_104_0;
            stackIn_107_1 = stackOut_104_1;
            stackIn_105_0 = stackOut_104_0;
            stackIn_105_1 = stackOut_104_1;
            if (param0 == null) {
              stackOut_107_0 = (RuntimeException) (Object) stackIn_107_0;
              stackOut_107_1 = (StringBuilder) (Object) stackIn_107_1;
              stackOut_107_2 = "null";
              stackIn_108_0 = stackOut_107_0;
              stackIn_108_1 = stackOut_107_1;
              stackIn_108_2 = stackOut_107_2;
              break L28;
            } else {
              stackOut_105_0 = (RuntimeException) (Object) stackIn_105_0;
              stackOut_105_1 = (StringBuilder) (Object) stackIn_105_1;
              stackOut_105_2 = "{...}";
              stackIn_108_0 = stackOut_105_0;
              stackIn_108_1 = stackOut_105_1;
              stackIn_108_2 = stackOut_105_2;
              break L28;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_108_0, stackIn_108_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    nu(String[] param0, int param1, int param2, boolean param3, boolean param4, boolean param5, boolean param6, boolean param7, boolean param8) {
        RuntimeException var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        it[] stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        it stackIn_4_2 = null;
        it stackIn_4_3 = null;
        int stackIn_4_4 = 0;
        it[] stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        it stackIn_6_2 = null;
        it stackIn_6_3 = null;
        int stackIn_6_4 = 0;
        it[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        it stackIn_8_2 = null;
        it stackIn_8_3 = null;
        int stackIn_8_4 = 0;
        it[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        it stackIn_9_2 = null;
        it stackIn_9_3 = null;
        int stackIn_9_4 = 0;
        int stackIn_9_5 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        it[] stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        it stackOut_3_2 = null;
        it stackOut_3_3 = null;
        int stackOut_3_4 = 0;
        it[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        it stackOut_8_2 = null;
        it stackOut_8_3 = null;
        int stackOut_8_4 = 0;
        int stackOut_8_5 = 0;
        it[] stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        it stackOut_4_2 = null;
        it stackOut_4_3 = null;
        int stackOut_4_4 = 0;
        it[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        it stackOut_6_2 = null;
        it stackOut_6_3 = null;
        int stackOut_6_4 = 0;
        int stackOut_6_5 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var12 = Kickabout.field_G;
        ((nu) this).field_u = -1;
        ((nu) this).field_E = new tf();
        ((nu) this).field_l = false;
        ((nu) this).field_A = false;
        ((nu) this).field_h = false;
        ((nu) this).field_z = false;
        ((nu) this).field_p = false;
        ((nu) this).field_Z = -2;
        ((nu) this).field_s = false;
        ((nu) this).field_B = vi.field_t;
        ((nu) this).field_y = false;
        ((nu) this).field_Y = false;
        ((nu) this).field_G = false;
        ((nu) this).field_x = wk.field_g;
        try {
          L0: {
            ((nu) this).field_W = param7;
            ((nu) this).field_S = param0;
            ((nu) this).field_T = param6;
            ((nu) this).field_e = param4;
            ((nu) this).field_U = param1;
            ((nu) this).field_f = param3;
            ((nu) this).field_c = param2;
            ((nu) this).field_w = param8;
            ((nu) this).field_L = param5;
            ((nu) this).field_I = ((nu) this).field_S.length;
            ((nu) this).field_O = op.field_z[((nu) this).field_U];
            ((nu) this).field_g = new it[((nu) this).field_I];
            ((nu) this).field_R = new gt[((nu) this).field_I];
            var10_int = 0;
            L1: while (true) {
              if (var10_int >= ((nu) this).field_I) {
                ((nu) this).field_r = new int[2];
                ((nu) this).field_b = new up[2][4];
                ((nu) this).field_k = new int[2][4];
                ((nu) this).field_i = new int[2][4];
                var10_int = 0;
                L2: while (true) {
                  if (var10_int >= 2) {
                    ((nu) this).field_d = new int[2];
                    ((nu) this).field_H = new int[2];
                    ((nu) this).field_F = new boolean[2];
                    ((nu) this).field_Q = new int[2];
                    ((nu) this).field_N = new ch();
                    ((nu) this).field_ab = new p(((nu) this).field_I);
                    ((nu) this).field_q = new jc[((nu) this).field_I];
                    var10_int = 0;
                    L3: while (true) {
                      if (~((nu) this).field_I >= ~var10_int) {
                        break L0;
                      } else {
                        ((nu) this).field_q[var10_int] = new jc();
                        var10_int++;
                        continue L3;
                      }
                    }
                  } else {
                    var11 = 0;
                    L4: while (true) {
                      if (var11 >= 4) {
                        var10_int++;
                        continue L2;
                      } else {
                        ((nu) this).field_b[var10_int][var11] = new up();
                        ((nu) this).field_k[var10_int][var11] = -1;
                        var11++;
                        continue L4;
                      }
                    }
                  }
                }
              } else {
                L5: {
                  stackOut_3_0 = ((nu) this).field_g;
                  stackOut_3_1 = var10_int;
                  stackOut_3_2 = null;
                  stackOut_3_3 = null;
                  stackOut_3_4 = var10_int;
                  stackIn_8_0 = stackOut_3_0;
                  stackIn_8_1 = stackOut_3_1;
                  stackIn_8_2 = stackOut_3_2;
                  stackIn_8_3 = stackOut_3_3;
                  stackIn_8_4 = stackOut_3_4;
                  stackIn_4_0 = stackOut_3_0;
                  stackIn_4_1 = stackOut_3_1;
                  stackIn_4_2 = stackOut_3_2;
                  stackIn_4_3 = stackOut_3_3;
                  stackIn_4_4 = stackOut_3_4;
                  if (1 != qj.b(((nu) this).field_c >> var10_int, 1)) {
                    stackOut_8_0 = (it[]) (Object) stackIn_8_0;
                    stackOut_8_1 = stackIn_8_1;
                    stackOut_8_2 = null;
                    stackOut_8_3 = null;
                    stackOut_8_4 = stackIn_8_4;
                    stackOut_8_5 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    stackIn_9_2 = stackOut_8_2;
                    stackIn_9_3 = stackOut_8_3;
                    stackIn_9_4 = stackOut_8_4;
                    stackIn_9_5 = stackOut_8_5;
                    break L5;
                  } else {
                    stackOut_4_0 = (it[]) (Object) stackIn_4_0;
                    stackOut_4_1 = stackIn_4_1;
                    stackOut_4_2 = null;
                    stackOut_4_3 = null;
                    stackOut_4_4 = stackIn_4_4;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_6_1 = stackOut_4_1;
                    stackIn_6_2 = stackOut_4_2;
                    stackIn_6_3 = stackOut_4_3;
                    stackIn_6_4 = stackOut_4_4;
                    stackOut_6_0 = (it[]) (Object) stackIn_6_0;
                    stackOut_6_1 = stackIn_6_1;
                    stackOut_6_2 = null;
                    stackOut_6_3 = null;
                    stackOut_6_4 = stackIn_6_4;
                    stackOut_6_5 = 1;
                    stackIn_9_0 = stackOut_6_0;
                    stackIn_9_1 = stackOut_6_1;
                    stackIn_9_2 = stackOut_6_2;
                    stackIn_9_3 = stackOut_6_3;
                    stackIn_9_4 = stackOut_6_4;
                    stackIn_9_5 = stackOut_6_5;
                    break L5;
                  }
                }
                stackIn_9_0[stackIn_9_1] = new it(stackIn_9_4, stackIn_9_5 != 0);
                ((nu) this).field_R[var10_int] = new gt();
                var10_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var10 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var10;
            stackOut_24_1 = new StringBuilder().append("nu.<init>(");
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
          throw nb.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = "<%0> would need a rating of <%1> to play with the current options.";
        field_j = false;
        field_M = "Waiting for graphics";
        field_a = "away";
    }
}
