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
        int stackIn_26_0 = 0;
        int stackIn_35_0 = 0;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_25_0 = 0;
        int stackOut_34_0 = 0;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
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
            ((nu) this).field_v = sk.a(param1 ^ -19886, 8, 0, 4, param0, 16) - 1;
            var3_int = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (~var3_int <= ~((nu) this).field_I) {
                    break L4;
                  } else {
                    ((nu) this).field_R[var3_int].b(param0, param1 + 9);
                    ((nu) this).field_R[var3_int].c(param0, param1 ^ -6);
                    var3_int++;
                    if (var5 != 0) {
                      break L3;
                    } else {
                      if (var5 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                if (((nu) this).field_u != 0) {
                  break L3;
                } else {
                  ((nu) this).field_n.b(param0, 4);
                  ((nu) this).field_n.a(param1 ^ 65, param0);
                  break L3;
                }
              }
              L5: {
                if (2 != ((nu) this).field_u) {
                  break L5;
                } else {
                  ((nu) this).field_C.b(param0, ~param1);
                  ((nu) this).field_C.c(param0, param1 + 7);
                  break L5;
                }
              }
              L6: {
                if (3 == ((nu) this).field_u) {
                  ((nu) this).field_o.b(param0, 4);
                  ((nu) this).field_o.a(param0, false);
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                if (((nu) this).field_u == 4) {
                  ((nu) this).field_V.b(param0, 4);
                  var3_int = 0;
                  L8: while (true) {
                    L9: {
                      L10: {
                        if (var3_int >= 2) {
                          break L10;
                        } else {
                          stackOut_25_0 = 0;
                          stackIn_35_0 = stackOut_25_0;
                          stackIn_26_0 = stackOut_25_0;
                          if (var5 != 0) {
                            break L9;
                          } else {
                            var4 = stackIn_26_0;
                            L11: while (true) {
                              L12: {
                                L13: {
                                  if (5 <= var4) {
                                    break L13;
                                  } else {
                                    ((nu) this).field_P[var3_int][var4].b(param0, 4);
                                    var4++;
                                    if (var5 != 0) {
                                      break L12;
                                    } else {
                                      if (var5 == 0) {
                                        continue L11;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                }
                                var3_int++;
                                break L12;
                              }
                              if (var5 == 0) {
                                continue L8;
                              } else {
                                break L10;
                              }
                            }
                          }
                        }
                      }
                      ((nu) this).field_X.b(param0, 4);
                      stackOut_34_0 = 0;
                      stackIn_35_0 = stackOut_34_0;
                      break L9;
                    }
                    var3_int = stackIn_35_0;
                    L14: while (true) {
                      L15: {
                        L16: {
                          if (var3_int >= 2) {
                            break L16;
                          } else {
                            if (var5 != 0) {
                              break L15;
                            } else {
                              var4 = 0;
                              L17: while (true) {
                                L18: {
                                  L19: {
                                    if (var4 >= 5) {
                                      break L19;
                                    } else {
                                      ((nu) this).field_P[var3_int][var4].b(9, param0);
                                      var4++;
                                      if (var5 != 0) {
                                        break L18;
                                      } else {
                                        if (var5 == 0) {
                                          continue L17;
                                        } else {
                                          break L19;
                                        }
                                      }
                                    }
                                  }
                                  var3_int++;
                                  break L18;
                                }
                                if (var5 == 0) {
                                  continue L14;
                                } else {
                                  break L16;
                                }
                              }
                            }
                          }
                        }
                        ((nu) this).field_V.c(param0, 17);
                        ((nu) this).field_X.a(param0, (byte) -65);
                        ((nu) this).field_J = param0.l(8, 59);
                        break L15;
                      }
                      ((nu) this).field_G = mu.a(param0, (byte) -39);
                      break L7;
                    }
                  }
                } else {
                  break L7;
                }
              }
              param0.l((byte) 115);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var3 = decompiledCaughtException;
            stackOut_50_0 = (RuntimeException) var3;
            stackOut_50_1 = new StringBuilder().append("nu.C(");
            stackIn_53_0 = stackOut_50_0;
            stackIn_53_1 = stackOut_50_1;
            stackIn_51_0 = stackOut_50_0;
            stackIn_51_1 = stackOut_50_1;
            if (param0 == null) {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "null";
              stackIn_54_0 = stackOut_53_0;
              stackIn_54_1 = stackOut_53_1;
              stackIn_54_2 = stackOut_53_2;
              break L20;
            } else {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "{...}";
              stackIn_54_0 = stackOut_51_0;
              stackIn_54_1 = stackOut_51_1;
              stackIn_54_2 = stackOut_51_2;
              break L20;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_54_0, stackIn_54_2 + ',' + param1 + ')');
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
              L3: {
                var3_int = param1.field_u;
                if (param0 > 58) {
                  break L3;
                } else {
                  this.a(95);
                  break L3;
                }
              }
              var4 = param1.field_v & 255;
              if (((nu) this).field_R[var3_int].d(3511)) {
                L4: {
                  var5 = ((nu) this).a((byte) 92, var3_int);
                  if (var4 < 1) {
                    break L4;
                  } else {
                    if (var4 > 5) {
                      break L4;
                    } else {
                      if (!((nu) this).field_h) {
                        ((nu) this).field_R[var3_int].field_p = var4 + -1;
                        ((nu) this).field_R[var3_int].a((mo) (Object) ((nu) this).field_g[var3_int], (byte) 84);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                L5: {
                  if (0 != var4) {
                    break L5;
                  } else {
                    if (((nu) this).field_A) {
                      break L5;
                    } else {
                      L6: {
                        if (var5.field_N.c(var5.field_y, -73)) {
                          break L6;
                        } else {
                          if (((nu) this).c(var3_int, -32)) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      if (0 != var5.field_C) {
                        break L5;
                      } else {
                        if (0 == var5.field_u) {
                          var5.a((mo) (Object) ((nu) this).field_g[var3_int], (byte) 84);
                          var5.a((byte) -31, 4);
                          var5.field_C = var5.a((byte) -99);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                }
                L7: {
                  L8: {
                    L9: {
                      if (var4 != 6) {
                        break L9;
                      } else {
                        if (!((nu) this).field_y) {
                          break L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                    if (var4 != 7) {
                      break L7;
                    } else {
                      if (!((nu) this).field_z) {
                        break L8;
                      } else {
                        break L7;
                      }
                    }
                  }
                  if (var5.field_u != 0) {
                    break L7;
                  } else {
                    if (((nu) this).c(var3_int, -126)) {
                      L10: {
                        var5.a((byte) -31, 1);
                        stackOut_60_0 = (nl) var5;
                        stackIn_63_0 = stackOut_60_0;
                        stackIn_61_0 = stackOut_60_0;
                        if (var4 != 7) {
                          stackOut_63_0 = (nl) (Object) stackIn_63_0;
                          stackOut_63_1 = 0;
                          stackIn_64_0 = stackOut_63_0;
                          stackIn_64_1 = stackOut_63_1;
                          break L10;
                        } else {
                          stackOut_61_0 = (nl) (Object) stackIn_61_0;
                          stackOut_61_1 = 1;
                          stackIn_64_0 = stackOut_61_0;
                          stackIn_64_1 = stackOut_61_1;
                          break L10;
                        }
                      }
                      stackIn_64_0.field_O = stackIn_64_1 != 0;
                      var5.field_L = var5.c((byte) -99);
                      var5.a((mo) (Object) ((nu) this).field_g[var3_int], (byte) 84);
                      break L7;
                    } else {
                      break L7;
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
          L11: {
            var3 = decompiledCaughtException;
            stackOut_66_0 = (RuntimeException) var3;
            stackOut_66_1 = new StringBuilder().append("nu.G(").append(param0).append(',');
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
              break L11;
            } else {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "{...}";
              stackIn_70_0 = stackOut_67_0;
              stackIn_70_1 = stackOut_67_1;
              stackIn_70_2 = stackOut_67_2;
              break L11;
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
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_17_0 = 0;
        var5 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              var2_int = 0;
              if (((nu) this).field_u == 4) {
                var3 = 0;
                L2: while (true) {
                  L3: {
                    L4: {
                      if (var3 >= 2) {
                        break L4;
                      } else {
                        stackOut_6_0 = 0;
                        stackIn_16_0 = stackOut_6_0;
                        stackIn_7_0 = stackOut_6_0;
                        if (var5 != 0) {
                          break L3;
                        } else {
                          var4 = stackIn_7_0;
                          L5: while (true) {
                            L6: {
                              L7: {
                                if (var4 >= 5) {
                                  break L7;
                                } else {
                                  var2_int = var2_int ^ ((nu) this).field_P[var3][var4].b((byte) -65);
                                  var4++;
                                  if (var5 != 0) {
                                    break L6;
                                  } else {
                                    if (var5 == 0) {
                                      continue L5;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                              var3++;
                              break L6;
                            }
                            if (var5 == 0) {
                              continue L2;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                    }
                    var2_int = var2_int ^ ((nu) this).field_X.c(0);
                    stackOut_15_0 = var2_int ^ ((nu) this).field_V.d(121);
                    stackIn_16_0 = stackOut_15_0;
                    break L3;
                  }
                  var2_int = stackIn_16_0;
                  break L1;
                }
              } else {
                break L1;
              }
            }
            var3 = 71 % ((param0 - 16) / 38);
            stackOut_17_0 = var2_int;
            stackIn_18_0 = stackOut_17_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2, "nu.Q(" + param0 + ')');
        }
        return stackIn_18_0;
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
        int stackIn_27_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_37_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_36_0 = 0;
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
                    L7: {
                      L8: {
                        if (var9 >= 4) {
                          break L8;
                        } else {
                          var10 = ((nu) this).field_g[param3].field_p;
                          stackOut_26_0 = param3;
                          stackIn_37_0 = stackOut_26_0;
                          stackIn_27_0 = stackOut_26_0;
                          if (var13 != 0) {
                            break L7;
                          } else {
                            L9: {
                              if (stackIn_27_0 != ((nu) this).field_i[var10][var9]) {
                                break L9;
                              } else {
                                var11 = ((nu) this).field_P[var10][1 + var9].field_N;
                                var12 = ((nu) this).field_P[var10][var9 - -1].field_y ? 1 : 0;
                                if (var11.a(true, param0, var12 != 0)) {
                                  stackOut_33_0 = 1;
                                  stackIn_34_0 = stackOut_33_0;
                                  return stackIn_34_0 != 0;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            var9++;
                            if (var13 == 0) {
                              continue L6;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                      stackOut_36_0 = 0;
                      stackIn_37_0 = stackOut_36_0;
                      break L7;
                    }
                    break L0;
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
        return stackIn_37_0 != 0;
    }

    final int b(byte param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_17_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_16_0 = 0;
        var5 = Kickabout.field_G;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~((nu) this).field_g.length >= ~var3_int) {
                    break L3;
                  } else {
                    stackOut_3_0 = ((nu) this).field_g[var3_int].field_p;
                    stackOut_3_1 = param1;
                    stackIn_16_0 = stackOut_3_0;
                    stackIn_16_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_4_0 != stackIn_4_1) {
                          break L4;
                        } else {
                          if (((nu) this).field_R[var3_int].d(3511)) {
                            stackOut_12_0 = var3_int;
                            stackIn_13_0 = stackOut_12_0;
                            return stackIn_13_0;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var3_int++;
                      if (var5 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_15_0 = 120;
                stackOut_15_1 = (param0 - -10) / 47;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                break L2;
              }
              var4 = stackIn_16_0 % stackIn_16_1;
              stackOut_16_0 = 0;
              stackIn_17_0 = stackOut_16_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var3, "nu.HA(" + param0 + ',' + param1 + ')');
        }
        return stackIn_17_0;
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
              if (!((nu) this).field_R[param1.field_u].d(param0 + 3510)) {
                return;
              } else {
                L1: {
                  if (param0 == 1) {
                    break L1;
                  } else {
                    nu.b(false);
                    break L1;
                  }
                }
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
          L2: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("nu.KA(").append(param0).append(',');
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
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
    }

    private final void b(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        nl var2_ref = null;
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
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_69_1 = 0;
        int stackIn_77_0 = 0;
        int stackIn_77_1 = 0;
        int stackIn_79_0 = 0;
        int stackIn_82_0 = 0;
        int stackIn_82_1 = 0;
        int stackIn_126_0 = 0;
        int stackIn_192_0 = 0;
        Object stackIn_195_0 = null;
        Object stackIn_208_0 = null;
        int stackIn_217_0 = 0;
        int stackIn_217_1 = 0;
        int stackIn_219_0 = 0;
        int stackIn_222_0 = 0;
        int stackIn_222_1 = 0;
        int stackIn_256_0 = 0;
        int stackIn_256_1 = 0;
        int stackIn_278_0 = 0;
        int stackIn_292_0 = 0;
        int stackIn_294_0 = 0;
        int stackIn_294_1 = 0;
        int stackIn_296_0 = 0;
        int stackIn_298_0 = 0;
        int stackIn_300_0 = 0;
        int stackIn_302_0 = 0;
        int stackIn_302_1 = 0;
        int stackIn_322_0 = 0;
        int stackIn_322_1 = 0;
        int stackIn_332_0 = 0;
        int stackIn_332_1 = 0;
        tj stackIn_349_0 = null;
        tj stackIn_351_0 = null;
        tj stackIn_352_0 = null;
        int stackIn_352_1 = 0;
        ch stackIn_353_0 = null;
        int stackIn_353_1 = 0;
        int stackIn_353_2 = 0;
        nl stackIn_353_3 = null;
        int stackIn_353_4 = 0;
        int stackIn_353_5 = 0;
        ch stackIn_355_0 = null;
        int stackIn_355_1 = 0;
        int stackIn_355_2 = 0;
        nl stackIn_355_3 = null;
        int stackIn_355_4 = 0;
        int stackIn_355_5 = 0;
        ch stackIn_356_0 = null;
        int stackIn_356_1 = 0;
        int stackIn_356_2 = 0;
        nl stackIn_356_3 = null;
        int stackIn_356_4 = 0;
        int stackIn_356_5 = 0;
        int stackIn_356_6 = 0;
        int stackIn_368_0 = 0;
        int stackIn_368_1 = 0;
        int stackIn_370_0 = 0;
        int stackIn_373_0 = 0;
        int stackIn_373_1 = 0;
        int stackIn_442_0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        int stackOut_26_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_68_1 = 0;
        int stackOut_78_0 = 0;
        int stackOut_81_0 = 0;
        int stackOut_81_1 = 0;
        int stackOut_123_0 = 0;
        int stackOut_125_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_76_1 = 0;
        int stackOut_191_0 = 0;
        Object stackOut_194_0 = null;
        Object stackOut_207_0 = null;
        int stackOut_216_0 = 0;
        int stackOut_216_1 = 0;
        int stackOut_218_0 = 0;
        int stackOut_221_0 = 0;
        int stackOut_221_1 = 0;
        int stackOut_255_0 = 0;
        int stackOut_255_1 = 0;
        int stackOut_295_0 = 0;
        int stackOut_296_0 = 0;
        int stackOut_299_0 = 0;
        int stackOut_301_0 = 0;
        int stackOut_301_1 = 0;
        int stackOut_321_0 = 0;
        int stackOut_321_1 = 0;
        int stackOut_331_0 = 0;
        int stackOut_331_1 = 0;
        tj stackOut_348_0 = null;
        tj stackOut_351_0 = null;
        int stackOut_351_1 = 0;
        tj stackOut_349_0 = null;
        int stackOut_349_1 = 0;
        ch stackOut_352_0 = null;
        int stackOut_352_1 = 0;
        int stackOut_352_2 = 0;
        nl stackOut_352_3 = null;
        int stackOut_352_4 = 0;
        int stackOut_352_5 = 0;
        ch stackOut_355_0 = null;
        int stackOut_355_1 = 0;
        int stackOut_355_2 = 0;
        nl stackOut_355_3 = null;
        int stackOut_355_4 = 0;
        int stackOut_355_5 = 0;
        int stackOut_355_6 = 0;
        ch stackOut_353_0 = null;
        int stackOut_353_1 = 0;
        int stackOut_353_2 = 0;
        nl stackOut_353_3 = null;
        int stackOut_353_4 = 0;
        int stackOut_353_5 = 0;
        int stackOut_353_6 = 0;
        int stackOut_367_0 = 0;
        int stackOut_367_1 = 0;
        int stackOut_369_0 = 0;
        int stackOut_372_0 = 0;
        int stackOut_372_1 = 0;
        int stackOut_293_0 = 0;
        int stackOut_293_1 = 0;
        int stackOut_277_0 = 0;
        int stackOut_275_0 = 0;
        int stackOut_291_0 = 0;
        int stackOut_441_0 = 0;
        var14 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (-1 == ((nu) this).field_O) {
                break L1;
              } else {
                if (~((nu) this).field_O > ~((nu) this).field_v) {
                  return;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              int fieldTemp$2 = ((nu) this).field_J - 1;
              ((nu) this).field_J = ((nu) this).field_J - 1;
              if (fieldTemp$2 <= 0) {
                ((nu) this).field_J = 255;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param0 == 11660) {
                break L3;
              } else {
                field_D = null;
                break L3;
              }
            }
            vl.a((nu) this, (byte) -41);
            var2_int = 0;
            L4: while (true) {
              stackOut_16_0 = -3;
              stackOut_16_1 = ~var2_int;
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              L5: while (true) {
                L6: {
                  L7: {
                    if (stackIn_17_0 >= stackIn_17_1) {
                      break L7;
                    } else {
                      stackOut_18_0 = 0;
                      stackIn_61_0 = stackOut_18_0;
                      stackIn_19_0 = stackOut_18_0;
                      if (var14 != 0) {
                        break L6;
                      } else {
                        var3 = stackIn_19_0;
                        L8: while (true) {
                          L9: {
                            if (var3 >= 5) {
                              break L9;
                            } else {
                              var4_ref_nl = ((nu) this).field_P[var2_int][var3];
                              stackOut_21_0 = ((nu) this).field_V.field_m;
                              stackOut_21_1 = var2_int;
                              stackIn_17_0 = stackOut_21_0;
                              stackIn_17_1 = stackOut_21_1;
                              stackIn_22_0 = stackOut_21_0;
                              stackIn_22_1 = stackOut_21_1;
                              if (var14 != 0) {
                                continue L5;
                              } else {
                                L10: {
                                  L11: {
                                    if (stackIn_22_0 != stackIn_22_1) {
                                      break L11;
                                    } else {
                                      if (~var3 != ~((nu) this).field_V.field_s) {
                                        break L11;
                                      } else {
                                        stackOut_26_0 = 1;
                                        stackIn_29_0 = stackOut_26_0;
                                        break L10;
                                      }
                                    }
                                  }
                                  stackOut_28_0 = 0;
                                  stackIn_29_0 = stackOut_28_0;
                                  break L10;
                                }
                                L12: {
                                  L13: {
                                    var5_int = stackIn_29_0;
                                    var6 = ((nu) this).a((byte) 6, var2_int, var3);
                                    if (-1 == var6) {
                                      break L13;
                                    } else {
                                      if (!((nu) this).field_R[var6].field_u) {
                                        break L13;
                                      } else {
                                        stackOut_33_0 = 1;
                                        stackIn_36_0 = stackOut_33_0;
                                        break L12;
                                      }
                                    }
                                  }
                                  stackOut_35_0 = 0;
                                  stackIn_36_0 = stackOut_35_0;
                                  break L12;
                                }
                                L14: {
                                  L15: {
                                    L16: {
                                      var7 = stackIn_36_0;
                                      var4_ref_nl.a(2, ((nu) this).field_x, var7 != 0, var5_int != 0);
                                      if (var2_int != 0) {
                                        break L16;
                                      } else {
                                        if (((nu) this).field_s) {
                                          break L15;
                                        } else {
                                          break L16;
                                        }
                                      }
                                    }
                                    L17: {
                                      if (1 != var2_int) {
                                        break L17;
                                      } else {
                                        if (!((nu) this).field_p) {
                                          break L17;
                                        } else {
                                          break L15;
                                        }
                                      }
                                    }
                                    stackOut_48_0 = 0;
                                    stackIn_49_0 = stackOut_48_0;
                                    break L14;
                                  }
                                  stackOut_46_0 = 1;
                                  stackIn_49_0 = stackOut_46_0;
                                  break L14;
                                }
                                L18: {
                                  L19: {
                                    var8_int = stackIn_49_0;
                                    if (var3 != 0) {
                                      break L19;
                                    } else {
                                      hv.a(true, (nu) this, var2_int);
                                      if (var14 == 0) {
                                        break L18;
                                      } else {
                                        break L19;
                                      }
                                    }
                                  }
                                  if (var8_int != 0) {
                                    break L18;
                                  } else {
                                    boolean discarded$3 = jt.a((nu) this, (byte) -127, var3, var2_int);
                                    break L18;
                                  }
                                }
                                var3++;
                                if (var14 == 0) {
                                  continue L8;
                                } else {
                                  break L9;
                                }
                              }
                            }
                          }
                          var2_int++;
                          if (var14 == 0) {
                            continue L4;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                  }
                  ((nu) this).field_V.a((byte) -97, ((nu) this).field_t, ((nu) this).field_B);
                  ((nu) this).field_X.a(((nu) this).field_V, -123);
                  stackOut_60_0 = -41;
                  stackIn_61_0 = stackOut_60_0;
                  break L6;
                }
                L20: {
                  if (stackIn_61_0 == ~((nu) this).field_X.field_m) {
                    ((nu) this).field_X.field_j[((nu) this).field_X.field_n] = ((nu) this).field_X.field_j[((nu) this).field_X.field_n] + 1;
                    ((nu) this).field_V.field_m = -1;
                    ((nu) this).field_V.field_r = 205;
                    ((nu) this).field_P[-((nu) this).field_X.field_n + 1][0].field_o = 0;
                    this.a(param0 ^ 11662);
                    break L20;
                  } else {
                    break L20;
                  }
                }
                L21: {
                  L22: {
                    L23: {
                      if (((nu) this).field_X.field_m < 245) {
                        break L23;
                      } else {
                        this.a(-((nu) this).field_X.field_n + 1, 0);
                        ((nu) this).field_X.field_m = 0;
                        var2_int = 0;
                        L24: while (true) {
                          if (~var2_int <= ~((nu) this).field_X.field_j.length) {
                            break L23;
                          } else {
                            stackOut_68_0 = -100;
                            stackOut_68_1 = ~((nu) this).field_X.field_j[var2_int];
                            stackIn_77_0 = stackOut_68_0;
                            stackIn_77_1 = stackOut_68_1;
                            stackIn_69_0 = stackOut_68_0;
                            stackIn_69_1 = stackOut_68_1;
                            if (var14 != 0) {
                              L25: while (true) {
                                if (stackIn_77_0 <= stackIn_77_1) {
                                  break L22;
                                } else {
                                  stackOut_78_0 = 0;
                                  stackIn_192_0 = stackOut_78_0;
                                  stackIn_79_0 = stackOut_78_0;
                                  if (var14 != 0) {
                                    break L21;
                                  } else {
                                    var3 = stackIn_79_0;
                                    L26: while (true) {
                                      L27: {
                                        if (var3 >= 5) {
                                          break L27;
                                        } else {
                                          var4_ref_nl = ((nu) this).field_P[var2_int][var3];
                                          stackOut_81_0 = var4_ref_nl.field_u;
                                          stackOut_81_1 = 2;
                                          stackIn_77_0 = stackOut_81_0;
                                          stackIn_77_1 = stackOut_81_1;
                                          stackIn_82_0 = stackOut_81_0;
                                          stackIn_82_1 = stackOut_81_1;
                                          if (var14 != 0) {
                                            continue L25;
                                          } else {
                                            L28: {
                                              if (stackIn_82_0 != stackIn_82_1) {
                                                break L28;
                                              } else {
                                                if (var4_ref_nl.field_L != 20) {
                                                  break L28;
                                                } else {
                                                  if (~var2_int != ~((nu) this).field_V.field_m) {
                                                    break L28;
                                                  } else {
                                                    if (~var3 != ~((nu) this).field_V.field_s) {
                                                      break L28;
                                                    } else {
                                                      L29: {
                                                        if (var4_ref_nl.field_z >= 0) {
                                                          break L29;
                                                        } else {
                                                          this.b(-var4_ref_nl.field_z, (byte) -72);
                                                          if (var14 == 0) {
                                                            break L28;
                                                          } else {
                                                            break L29;
                                                          }
                                                        }
                                                      }
                                                      var5_int = var4_ref_nl.a(var4_ref_nl.field_z, (byte) -68);
                                                      this.a(var5_int, var4_ref_nl.field_O, var4_ref_nl.field_N.c(var4_ref_nl.field_y, (byte) -62), var4_ref_nl.field_x, (byte) -66, var4_ref_nl.field_P);
                                                      ((nu) this).field_V.a((mo) (Object) var4_ref_nl, (byte) 84);
                                                      var6_ref_nl = ((nu) this).field_P[-var2_int + 1][0];
                                                      ((nu) this).field_N.a((nu) this, 32, ((nu) this).field_v, var2_int, var4_ref_nl, var5_int, var6_ref_nl, ((nu) this).field_V.field_o, var3);
                                                      var7 = ((nu) this).a((byte) 6, var2_int, var3);
                                                      if (var7 == -1) {
                                                        break L28;
                                                      } else {
                                                        L30: {
                                                          if (var4_ref_nl.field_O) {
                                                            break L30;
                                                          } else {
                                                            L31: {
                                                              if (var5_int >= 128) {
                                                                break L31;
                                                              } else {
                                                                ((nu) this).field_q[var7].field_i = ((nu) this).field_q[var7].field_i + 1;
                                                                if (var14 == 0) {
                                                                  break L28;
                                                                } else {
                                                                  break L31;
                                                                }
                                                              }
                                                            }
                                                            ((nu) this).field_q[var7].field_f = ((nu) this).field_q[var7].field_f + 1;
                                                            if (var14 == 0) {
                                                              break L28;
                                                            } else {
                                                              break L30;
                                                            }
                                                          }
                                                        }
                                                        ((nu) this).field_q[var7].field_q = ((nu) this).field_q[var7].field_q + 1;
                                                        break L28;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            L32: {
                                              if (0 == var4_ref_nl.field_u) {
                                                break L32;
                                              } else {
                                                if (var4_ref_nl.field_L <= 0) {
                                                  L33: {
                                                    L34: {
                                                      if (var2_int != ((nu) this).field_V.field_m) {
                                                        break L34;
                                                      } else {
                                                        if (~var3 != ~((nu) this).field_V.field_s) {
                                                          break L34;
                                                        } else {
                                                          stackOut_123_0 = 1;
                                                          stackIn_126_0 = stackOut_123_0;
                                                          break L33;
                                                        }
                                                      }
                                                    }
                                                    stackOut_125_0 = 0;
                                                    stackIn_126_0 = stackOut_125_0;
                                                    break L33;
                                                  }
                                                  L35: {
                                                    var5_int = stackIn_126_0;
                                                    if (var4_ref_nl.field_u == 2) {
                                                      break L35;
                                                    } else {
                                                      L36: {
                                                        if (var4_ref_nl.field_u != 1) {
                                                          break L36;
                                                        } else {
                                                          var4_ref_nl.field_L = var4_ref_nl.c((byte) -99);
                                                          if (var14 == 0) {
                                                            break L32;
                                                          } else {
                                                            break L36;
                                                          }
                                                        }
                                                      }
                                                      L37: {
                                                        if (var4_ref_nl.field_u != 5) {
                                                          break L37;
                                                        } else {
                                                          var4_ref_nl.a((byte) -31, 6);
                                                          if (var14 == 0) {
                                                            break L32;
                                                          } else {
                                                            break L37;
                                                          }
                                                        }
                                                      }
                                                      L38: {
                                                        if (7 != var4_ref_nl.field_u) {
                                                          break L38;
                                                        } else {
                                                          var4_ref_nl.a((byte) -31, 8);
                                                          if (var14 == 0) {
                                                            break L32;
                                                          } else {
                                                            break L38;
                                                          }
                                                        }
                                                      }
                                                      L39: {
                                                        if (var4_ref_nl.field_u != 8) {
                                                          break L39;
                                                        } else {
                                                          var4_ref_nl.a((byte) -31, 9);
                                                          if (var14 == 0) {
                                                            break L32;
                                                          } else {
                                                            break L39;
                                                          }
                                                        }
                                                      }
                                                      L40: {
                                                        L41: {
                                                          if (var4_ref_nl.field_u != 3) {
                                                            break L41;
                                                          } else {
                                                            if (var5_int == 0) {
                                                              break L40;
                                                            } else {
                                                              break L41;
                                                            }
                                                          }
                                                        }
                                                        L42: {
                                                          if (var4_ref_nl.field_u == 12) {
                                                            break L42;
                                                          } else {
                                                            L43: {
                                                              L44: {
                                                                if (var4_ref_nl.field_u != 13) {
                                                                  break L44;
                                                                } else {
                                                                  if (0 == var4_ref_nl.field_v) {
                                                                    break L43;
                                                                  } else {
                                                                    break L44;
                                                                  }
                                                                }
                                                              }
                                                              L45: {
                                                                if (var4_ref_nl.field_u != 14) {
                                                                  break L45;
                                                                } else {
                                                                  var4_ref_nl.field_L = 1;
                                                                  if (var14 == 0) {
                                                                    break L32;
                                                                  } else {
                                                                    break L45;
                                                                  }
                                                                }
                                                              }
                                                              var4_ref_nl.a((byte) -31, 0);
                                                              if (var14 == 0) {
                                                                break L32;
                                                              } else {
                                                                break L43;
                                                              }
                                                            }
                                                            var4_ref_nl.a((byte) -31, 10);
                                                            if (var14 == 0) {
                                                              break L32;
                                                            } else {
                                                              break L42;
                                                            }
                                                          }
                                                        }
                                                        var4_ref_nl.a((byte) -31, 10);
                                                        if (var5_int != 0) {
                                                          break L32;
                                                        } else {
                                                          var4_ref_nl.field_L = var4_ref_nl.field_L + 60;
                                                          if (var14 == 0) {
                                                            break L32;
                                                          } else {
                                                            break L40;
                                                          }
                                                        }
                                                      }
                                                      var4_ref_nl.a((byte) -31, 10);
                                                      var4_ref_nl.field_L = var4_ref_nl.field_L + 20;
                                                      if (var14 == 0) {
                                                        break L32;
                                                      } else {
                                                        break L35;
                                                      }
                                                    }
                                                  }
                                                  var4_ref_nl.a((byte) -31, 0);
                                                  break L32;
                                                } else {
                                                  break L32;
                                                }
                                              }
                                            }
                                            var3++;
                                            if (var14 == 0) {
                                              continue L26;
                                            } else {
                                              break L27;
                                            }
                                          }
                                        }
                                      }
                                      var2_int++;
                                      if (var14 == 0) {
                                        stackOut_76_0 = 2;
                                        stackOut_76_1 = var2_int;
                                        stackIn_77_0 = stackOut_76_0;
                                        stackIn_77_1 = stackOut_76_1;
                                        continue L25;
                                      } else {
                                        break L22;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              L46: {
                                if (stackIn_69_0 > stackIn_69_1) {
                                  ((nu) this).field_X.field_j[var2_int] = 99;
                                  break L46;
                                } else {
                                  break L46;
                                }
                              }
                              var2_int++;
                              if (var14 == 0) {
                                continue L24;
                              } else {
                                break L23;
                              }
                            }
                          }
                        }
                      }
                    }
                    var2_int = 0;
                    L47: while (true) {
                      stackOut_76_0 = 2;
                      stackOut_76_1 = var2_int;
                      stackIn_77_0 = stackOut_76_0;
                      stackIn_77_1 = stackOut_76_1;
                      L48: while (true) {
                        if (stackIn_77_0 <= stackIn_77_1) {
                          break L22;
                        } else {
                          stackOut_78_0 = 0;
                          stackIn_192_0 = stackOut_78_0;
                          stackIn_79_0 = stackOut_78_0;
                          if (var14 != 0) {
                            break L21;
                          } else {
                            var3 = stackIn_79_0;
                            L49: while (true) {
                              L50: {
                                if (var3 >= 5) {
                                  break L50;
                                } else {
                                  var4_ref_nl = ((nu) this).field_P[var2_int][var3];
                                  stackOut_81_0 = var4_ref_nl.field_u;
                                  stackOut_81_1 = 2;
                                  stackIn_77_0 = stackOut_81_0;
                                  stackIn_77_1 = stackOut_81_1;
                                  stackIn_82_0 = stackOut_81_0;
                                  stackIn_82_1 = stackOut_81_1;
                                  if (var14 != 0) {
                                    continue L48;
                                  } else {
                                    L51: {
                                      if (stackIn_82_0 != stackIn_82_1) {
                                        break L51;
                                      } else {
                                        if (var4_ref_nl.field_L != 20) {
                                          break L51;
                                        } else {
                                          if (~var2_int != ~((nu) this).field_V.field_m) {
                                            break L51;
                                          } else {
                                            if (~var3 != ~((nu) this).field_V.field_s) {
                                              break L51;
                                            } else {
                                              L52: {
                                                if (var4_ref_nl.field_z >= 0) {
                                                  break L52;
                                                } else {
                                                  this.b(-var4_ref_nl.field_z, (byte) -72);
                                                  if (var14 == 0) {
                                                    break L51;
                                                  } else {
                                                    break L52;
                                                  }
                                                }
                                              }
                                              var5_int = var4_ref_nl.a(var4_ref_nl.field_z, (byte) -68);
                                              this.a(var5_int, var4_ref_nl.field_O, var4_ref_nl.field_N.c(var4_ref_nl.field_y, (byte) -62), var4_ref_nl.field_x, (byte) -66, var4_ref_nl.field_P);
                                              ((nu) this).field_V.a((mo) (Object) var4_ref_nl, (byte) 84);
                                              var6_ref_nl = ((nu) this).field_P[-var2_int + 1][0];
                                              ((nu) this).field_N.a((nu) this, 32, ((nu) this).field_v, var2_int, var4_ref_nl, var5_int, var6_ref_nl, ((nu) this).field_V.field_o, var3);
                                              var7 = ((nu) this).a((byte) 6, var2_int, var3);
                                              if (var7 == -1) {
                                                break L51;
                                              } else {
                                                L53: {
                                                  if (var4_ref_nl.field_O) {
                                                    break L53;
                                                  } else {
                                                    L54: {
                                                      if (var5_int >= 128) {
                                                        break L54;
                                                      } else {
                                                        ((nu) this).field_q[var7].field_i = ((nu) this).field_q[var7].field_i + 1;
                                                        if (var14 == 0) {
                                                          break L51;
                                                        } else {
                                                          break L54;
                                                        }
                                                      }
                                                    }
                                                    ((nu) this).field_q[var7].field_f = ((nu) this).field_q[var7].field_f + 1;
                                                    if (var14 == 0) {
                                                      break L51;
                                                    } else {
                                                      break L53;
                                                    }
                                                  }
                                                }
                                                ((nu) this).field_q[var7].field_q = ((nu) this).field_q[var7].field_q + 1;
                                                break L51;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    L55: {
                                      if (0 == var4_ref_nl.field_u) {
                                        break L55;
                                      } else {
                                        if (var4_ref_nl.field_L <= 0) {
                                          L56: {
                                            L57: {
                                              if (var2_int != ((nu) this).field_V.field_m) {
                                                break L57;
                                              } else {
                                                if (~var3 != ~((nu) this).field_V.field_s) {
                                                  break L57;
                                                } else {
                                                  stackOut_123_0 = 1;
                                                  stackIn_126_0 = stackOut_123_0;
                                                  break L56;
                                                }
                                              }
                                            }
                                            stackOut_125_0 = 0;
                                            stackIn_126_0 = stackOut_125_0;
                                            break L56;
                                          }
                                          L58: {
                                            var5_int = stackIn_126_0;
                                            if (var4_ref_nl.field_u == 2) {
                                              break L58;
                                            } else {
                                              L59: {
                                                if (var4_ref_nl.field_u != 1) {
                                                  break L59;
                                                } else {
                                                  var4_ref_nl.field_L = var4_ref_nl.c((byte) -99);
                                                  if (var14 == 0) {
                                                    break L55;
                                                  } else {
                                                    break L59;
                                                  }
                                                }
                                              }
                                              L60: {
                                                if (var4_ref_nl.field_u != 5) {
                                                  break L60;
                                                } else {
                                                  var4_ref_nl.a((byte) -31, 6);
                                                  if (var14 == 0) {
                                                    break L55;
                                                  } else {
                                                    break L60;
                                                  }
                                                }
                                              }
                                              L61: {
                                                if (7 != var4_ref_nl.field_u) {
                                                  break L61;
                                                } else {
                                                  var4_ref_nl.a((byte) -31, 8);
                                                  if (var14 == 0) {
                                                    break L55;
                                                  } else {
                                                    break L61;
                                                  }
                                                }
                                              }
                                              L62: {
                                                if (var4_ref_nl.field_u != 8) {
                                                  break L62;
                                                } else {
                                                  var4_ref_nl.a((byte) -31, 9);
                                                  if (var14 == 0) {
                                                    break L55;
                                                  } else {
                                                    break L62;
                                                  }
                                                }
                                              }
                                              L63: {
                                                L64: {
                                                  if (var4_ref_nl.field_u != 3) {
                                                    break L64;
                                                  } else {
                                                    if (var5_int == 0) {
                                                      break L63;
                                                    } else {
                                                      break L64;
                                                    }
                                                  }
                                                }
                                                L65: {
                                                  if (var4_ref_nl.field_u == 12) {
                                                    break L65;
                                                  } else {
                                                    L66: {
                                                      L67: {
                                                        if (var4_ref_nl.field_u != 13) {
                                                          break L67;
                                                        } else {
                                                          if (0 == var4_ref_nl.field_v) {
                                                            break L66;
                                                          } else {
                                                            break L67;
                                                          }
                                                        }
                                                      }
                                                      L68: {
                                                        if (var4_ref_nl.field_u != 14) {
                                                          break L68;
                                                        } else {
                                                          var4_ref_nl.field_L = 1;
                                                          if (var14 == 0) {
                                                            break L55;
                                                          } else {
                                                            break L68;
                                                          }
                                                        }
                                                      }
                                                      var4_ref_nl.a((byte) -31, 0);
                                                      if (var14 == 0) {
                                                        break L55;
                                                      } else {
                                                        break L66;
                                                      }
                                                    }
                                                    var4_ref_nl.a((byte) -31, 10);
                                                    if (var14 == 0) {
                                                      break L55;
                                                    } else {
                                                      break L65;
                                                    }
                                                  }
                                                }
                                                var4_ref_nl.a((byte) -31, 10);
                                                if (var5_int != 0) {
                                                  break L55;
                                                } else {
                                                  var4_ref_nl.field_L = var4_ref_nl.field_L + 60;
                                                  if (var14 == 0) {
                                                    break L55;
                                                  } else {
                                                    break L63;
                                                  }
                                                }
                                              }
                                              var4_ref_nl.a((byte) -31, 10);
                                              var4_ref_nl.field_L = var4_ref_nl.field_L + 20;
                                              if (var14 == 0) {
                                                break L55;
                                              } else {
                                                break L58;
                                              }
                                            }
                                          }
                                          var4_ref_nl.a((byte) -31, 0);
                                          break L55;
                                        } else {
                                          break L55;
                                        }
                                      }
                                    }
                                    var3++;
                                    if (var14 == 0) {
                                      continue L49;
                                    } else {
                                      break L50;
                                    }
                                  }
                                }
                              }
                              var2_int++;
                              if (var14 == 0) {
                                continue L47;
                              } else {
                                break L22;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  stackOut_191_0 = 0;
                  stackIn_192_0 = stackOut_191_0;
                  break L21;
                }
                var2_int = stackIn_192_0;
                L69: while (true) {
                  L70: {
                    L71: {
                      if (~((nu) this).field_I >= ~var2_int) {
                        break L71;
                      } else {
                        stackOut_194_0 = this;
                        stackIn_208_0 = stackOut_194_0;
                        stackIn_195_0 = stackOut_194_0;
                        if (var14 != 0) {
                          break L70;
                        } else {
                          L72: {
                            if (!((nu) this).field_R[var2_int].d(3511)) {
                              break L72;
                            } else {
                              if (((nu) this).field_R[var2_int].field_p == 0) {
                                break L72;
                              } else {
                                if (((nu) this).c(var2_int, -125)) {
                                  break L72;
                                } else {
                                  this.a(73, (mo) (Object) ((nu) this).field_R[var2_int], ((nu) this).field_R[var2_int].field_p, var2_int);
                                  ((nu) this).field_R[var2_int].field_p = 0;
                                  break L72;
                                }
                              }
                            }
                          }
                          var2_int++;
                          if (var14 == 0) {
                            continue L69;
                          } else {
                            break L71;
                          }
                        }
                      }
                    }
                    stackOut_207_0 = this;
                    stackIn_208_0 = stackOut_207_0;
                    break L70;
                  }
                  L73: {
                    L74: {
                      L75: {
                        L76: {
                          L77: {
                            var2_ref = ((nu) this).b((byte) -96);
                            if (var2_ref == null) {
                              break L77;
                            } else {
                              ((nu) this).field_V.field_p = var2_ref.field_w;
                              ((nu) this).field_V.field_v = var2_ref.field_v;
                              ((nu) this).field_V.field_t = var2_ref.field_M;
                              if (var14 == 0) {
                                break L76;
                              } else {
                                break L77;
                              }
                            }
                          }
                          if (!((nu) this).field_V.g(param0 ^ -11752)) {
                            break L76;
                          } else {
                            var3 = ((nu) this).field_V.e(10);
                            var4 = 0;
                            L78: while (true) {
                              stackOut_216_0 = 2;
                              stackOut_216_1 = var4;
                              stackIn_217_0 = stackOut_216_0;
                              stackIn_217_1 = stackOut_216_1;
                              L79: while (true) {
                                if (stackIn_217_0 <= stackIn_217_1) {
                                  break L76;
                                } else {
                                  stackOut_218_0 = 0;
                                  stackIn_292_0 = stackOut_218_0;
                                  stackIn_219_0 = stackOut_218_0;
                                  if (var14 != 0) {
                                    break L75;
                                  } else {
                                    var5_int = stackIn_219_0;
                                    L80: while (true) {
                                      L81: {
                                        if (var5_int >= 5) {
                                          break L81;
                                        } else {
                                          var6_ref_nl = ((nu) this).field_P[var4][var5_int];
                                          var7 = 900;
                                          stackOut_221_0 = ~var5_int;
                                          stackOut_221_1 = -1;
                                          stackIn_217_0 = stackOut_221_0;
                                          stackIn_217_1 = stackOut_221_1;
                                          stackIn_222_0 = stackOut_221_0;
                                          stackIn_222_1 = stackOut_221_1;
                                          if (var14 != 0) {
                                            continue L79;
                                          } else {
                                            L82: {
                                              if (stackIn_222_0 != stackIn_222_1) {
                                                break L82;
                                              } else {
                                                var8_int = -var6_ref_nl.field_o + 20;
                                                var7 = var8_int * var8_int;
                                                break L82;
                                              }
                                            }
                                            L83: {
                                              if (~var3 < ~(var7 << 16)) {
                                                break L83;
                                              } else {
                                                if (3 == var6_ref_nl.field_u) {
                                                  break L83;
                                                } else {
                                                  if (var6_ref_nl.field_u == 13) {
                                                    break L83;
                                                  } else {
                                                    if (var6_ref_nl.field_u == 5) {
                                                      break L83;
                                                    } else {
                                                      if (var6_ref_nl.field_u == 7) {
                                                        break L83;
                                                      } else {
                                                        if (var6_ref_nl.field_u == 8) {
                                                          break L83;
                                                        } else {
                                                          if (var6_ref_nl.field_u == 9) {
                                                            break L83;
                                                          } else {
                                                            var8_int = var6_ref_nl.f(-127) - ((nu) this).field_V.a(true);
                                                            var9 = var6_ref_nl.a(true) - ((nu) this).field_V.c(879306160);
                                                            if (var9 * var9 + var8_int * var8_int >= 1600) {
                                                              break L83;
                                                            } else {
                                                              ((nu) this).field_V.a((mo) (Object) var6_ref_nl, (byte) 84);
                                                              ((nu) this).field_V.field_s = var5_int;
                                                              ((nu) this).field_V.field_i = 0;
                                                              ((nu) this).field_V.field_m = var4;
                                                              if (0 != var5_int) {
                                                                this.a(-115, (mo) (Object) ((nu) this).field_V, var5_int, ((nu) this).b((byte) 107, var4));
                                                                break L83;
                                                              } else {
                                                                break L83;
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
                                            if (var14 == 0) {
                                              continue L80;
                                            } else {
                                              break L81;
                                            }
                                          }
                                        }
                                      }
                                      var4++;
                                      if (var14 == 0) {
                                        continue L78;
                                      } else {
                                        break L76;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        L84: {
                          if (null != var2_ref) {
                            break L84;
                          } else {
                            var3 = 0;
                            L85: while (true) {
                              if (2 <= var3) {
                                break L84;
                              } else {
                                var4_ref_nl = ((nu) this).field_P[var3][0];
                                stackOut_255_0 = ~var4_ref_nl.field_u;
                                stackOut_255_1 = -3;
                                stackIn_294_0 = stackOut_255_0;
                                stackIn_294_1 = stackOut_255_1;
                                stackIn_256_0 = stackOut_255_0;
                                stackIn_256_1 = stackOut_255_1;
                                if (var14 != 0) {
                                  L86: while (true) {
                                    if (stackIn_294_0 >= stackIn_294_1) {
                                      break L74;
                                    } else {
                                      stackOut_295_0 = 0;
                                      stackIn_442_0 = stackOut_295_0;
                                      stackIn_296_0 = stackOut_295_0;
                                      if (var14 != 0) {
                                        break L73;
                                      } else {
                                        stackOut_296_0 = stackIn_296_0;
                                        stackIn_298_0 = stackOut_296_0;
                                        var4 = stackIn_298_0;
                                        L87: while (true) {
                                          stackOut_299_0 = -6;
                                          stackIn_300_0 = stackOut_299_0;
                                          L88: while (true) {
                                            L89: {
                                              if (stackIn_300_0 >= ~var4) {
                                                break L89;
                                              } else {
                                                var5 = ((nu) this).field_P[var3][var4];
                                                stackOut_301_0 = -4;
                                                stackOut_301_1 = ~var5.field_u;
                                                stackIn_294_0 = stackOut_301_0;
                                                stackIn_294_1 = stackOut_301_1;
                                                stackIn_302_0 = stackOut_301_0;
                                                stackIn_302_1 = stackOut_301_1;
                                                if (var14 != 0) {
                                                  continue L86;
                                                } else {
                                                  L90: {
                                                    L91: {
                                                      if (stackIn_302_0 == stackIn_302_1) {
                                                        break L91;
                                                      } else {
                                                        if (var5.field_u == 13) {
                                                          break L91;
                                                        } else {
                                                          if (var14 == 0) {
                                                            break L90;
                                                          } else {
                                                            break L91;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L92: {
                                                      if (((nu) this).field_V.field_m != -1) {
                                                        break L92;
                                                      } else {
                                                        if (Math.abs(-var5.field_v + ((nu) this).field_V.field_v) >> 16 >= 30) {
                                                          break L92;
                                                        } else {
                                                          if (((nu) this).field_V.field_r != 0) {
                                                            break L92;
                                                          } else {
                                                            var6 = var5.f(param0 + -11776) + -((nu) this).field_V.a(true);
                                                            var7 = var5.a(true) - ((nu) this).field_V.c(879306160);
                                                            var8_int = var7 * var7 + var6 * var6;
                                                            if (var8_int >= 1600) {
                                                              break L92;
                                                            } else {
                                                              ((nu) this).field_V.a((mo) (Object) var5, (byte) 84);
                                                              var9 = (4 * var5.field_N.d(var5.field_y, 0) << 16) / 100 + 524288;
                                                              var10_long = (long)(var9 + Math.max(var5.field_q, pc.a(((nu) this).field_V.e(-127), -524289)));
                                                              ((nu) this).field_V.field_r = 5;
                                                              ((nu) this).field_V.field_h = (int)((long)var5.field_m * var10_long / (long)var5.field_q);
                                                              ((nu) this).field_V.field_q = (int)(var10_long * (long)var5.field_k / (long)var5.field_q);
                                                              var12 = 0;
                                                              L93: while (true) {
                                                                L94: {
                                                                  L95: {
                                                                    if (var12 >= ((nu) this).field_I) {
                                                                      break L95;
                                                                    } else {
                                                                      stackOut_321_0 = ((nu) this).field_g[var12].field_p;
                                                                      stackOut_321_1 = var3;
                                                                      stackIn_332_0 = stackOut_321_0;
                                                                      stackIn_332_1 = stackOut_321_1;
                                                                      stackIn_322_0 = stackOut_321_0;
                                                                      stackIn_322_1 = stackOut_321_1;
                                                                      if (var14 != 0) {
                                                                        break L94;
                                                                      } else {
                                                                        L96: {
                                                                          if (stackIn_322_0 != stackIn_322_1) {
                                                                            break L96;
                                                                          } else {
                                                                            if (~((nu) this).field_R[var12].field_g != ~var4) {
                                                                              break L96;
                                                                            } else {
                                                                              ((nu) this).field_V.field_j = var12;
                                                                              break L96;
                                                                            }
                                                                          }
                                                                        }
                                                                        var12++;
                                                                        if (var14 == 0) {
                                                                          continue L93;
                                                                        } else {
                                                                          break L95;
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                  var12 = ((nu) this).a((byte) 6, var3, var4);
                                                                  stackOut_331_0 = 13;
                                                                  stackOut_331_1 = var5.field_u;
                                                                  stackIn_332_0 = stackOut_331_0;
                                                                  stackIn_332_1 = stackOut_331_1;
                                                                  break L94;
                                                                }
                                                                L97: {
                                                                  if (stackIn_332_0 != stackIn_332_1) {
                                                                    break L97;
                                                                  } else {
                                                                    if (((nu) this).field_V.field_i != 2) {
                                                                      break L97;
                                                                    } else {
                                                                      if (((nu) this).field_V.field_o == -1) {
                                                                        break L97;
                                                                      } else {
                                                                        if (var12 == -1) {
                                                                          break L97;
                                                                        } else {
                                                                          if (~((nu) this).field_V.field_o != ~var12) {
                                                                            break L97;
                                                                          } else {
                                                                            break L97;
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                                L98: {
                                                                  if (var12 == -1) {
                                                                    break L98;
                                                                  } else {
                                                                    ((nu) this).field_V.field_o = var12;
                                                                    break L98;
                                                                  }
                                                                }
                                                                L99: {
                                                                  stackOut_348_0 = ((nu) this).field_V;
                                                                  stackIn_351_0 = stackOut_348_0;
                                                                  stackIn_349_0 = stackOut_348_0;
                                                                  if (var5.field_u == 13) {
                                                                    stackOut_351_0 = (tj) (Object) stackIn_351_0;
                                                                    stackOut_351_1 = 2;
                                                                    stackIn_352_0 = stackOut_351_0;
                                                                    stackIn_352_1 = stackOut_351_1;
                                                                    break L99;
                                                                  } else {
                                                                    stackOut_349_0 = (tj) (Object) stackIn_349_0;
                                                                    stackOut_349_1 = 1;
                                                                    stackIn_352_0 = stackOut_349_0;
                                                                    stackIn_352_1 = stackOut_349_1;
                                                                    break L99;
                                                                  }
                                                                }
                                                                L100: {
                                                                  stackIn_352_0.field_i = stackIn_352_1;
                                                                  var13 = ((nu) this).field_P[-var3 + 1][0];
                                                                  stackOut_352_0 = ((nu) this).field_N;
                                                                  stackOut_352_1 = 35;
                                                                  stackOut_352_2 = ((nu) this).field_V.field_o;
                                                                  stackOut_352_3 = (nl) var13;
                                                                  stackOut_352_4 = var4;
                                                                  stackOut_352_5 = ((nu) this).field_v;
                                                                  stackIn_355_0 = stackOut_352_0;
                                                                  stackIn_355_1 = stackOut_352_1;
                                                                  stackIn_355_2 = stackOut_352_2;
                                                                  stackIn_355_3 = stackOut_352_3;
                                                                  stackIn_355_4 = stackOut_352_4;
                                                                  stackIn_355_5 = stackOut_352_5;
                                                                  stackIn_353_0 = stackOut_352_0;
                                                                  stackIn_353_1 = stackOut_352_1;
                                                                  stackIn_353_2 = stackOut_352_2;
                                                                  stackIn_353_3 = stackOut_352_3;
                                                                  stackIn_353_4 = stackOut_352_4;
                                                                  stackIn_353_5 = stackOut_352_5;
                                                                  if (var5.field_u != 13) {
                                                                    stackOut_355_0 = (ch) (Object) stackIn_355_0;
                                                                    stackOut_355_1 = stackIn_355_1;
                                                                    stackOut_355_2 = stackIn_355_2;
                                                                    stackOut_355_3 = (nl) (Object) stackIn_355_3;
                                                                    stackOut_355_4 = stackIn_355_4;
                                                                    stackOut_355_5 = stackIn_355_5;
                                                                    stackOut_355_6 = 2;
                                                                    stackIn_356_0 = stackOut_355_0;
                                                                    stackIn_356_1 = stackOut_355_1;
                                                                    stackIn_356_2 = stackOut_355_2;
                                                                    stackIn_356_3 = stackOut_355_3;
                                                                    stackIn_356_4 = stackOut_355_4;
                                                                    stackIn_356_5 = stackOut_355_5;
                                                                    stackIn_356_6 = stackOut_355_6;
                                                                    break L100;
                                                                  } else {
                                                                    stackOut_353_0 = (ch) (Object) stackIn_353_0;
                                                                    stackOut_353_1 = stackIn_353_1;
                                                                    stackOut_353_2 = stackIn_353_2;
                                                                    stackOut_353_3 = (nl) (Object) stackIn_353_3;
                                                                    stackOut_353_4 = stackIn_353_4;
                                                                    stackOut_353_5 = stackIn_353_5;
                                                                    stackOut_353_6 = 3;
                                                                    stackIn_356_0 = stackOut_353_0;
                                                                    stackIn_356_1 = stackOut_353_1;
                                                                    stackIn_356_2 = stackOut_353_2;
                                                                    stackIn_356_3 = stackOut_353_3;
                                                                    stackIn_356_4 = stackOut_353_4;
                                                                    stackIn_356_5 = stackOut_353_5;
                                                                    stackIn_356_6 = stackOut_353_6;
                                                                    break L100;
                                                                  }
                                                                }
                                                                ((ch) (Object) stackIn_356_0).a((byte) stackIn_356_1, stackIn_356_2, stackIn_356_3, stackIn_356_4, stackIn_356_5, stackIn_356_6, var3, (nu) this, var5);
                                                                if (var5.field_F != -1) {
                                                                  L101: {
                                                                    if (var5.field_u != 13) {
                                                                      break L101;
                                                                    } else {
                                                                      ((nu) this).field_q[var5.field_F].field_h = ((nu) this).field_q[var5.field_F].field_h + 1;
                                                                      if (var14 == 0) {
                                                                        break L92;
                                                                      } else {
                                                                        break L101;
                                                                      }
                                                                    }
                                                                  }
                                                                  ((nu) this).field_q[var5.field_F].field_j = ((nu) this).field_q[var5.field_F].field_j + 1;
                                                                  break L92;
                                                                } else {
                                                                  break L92;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                    if (var5.field_u != 3) {
                                                      break L90;
                                                    } else {
                                                      var6 = 0;
                                                      L102: while (true) {
                                                        stackOut_367_0 = 2;
                                                        stackOut_367_1 = var6;
                                                        stackIn_368_0 = stackOut_367_0;
                                                        stackIn_368_1 = stackOut_367_1;
                                                        L103: while (true) {
                                                          if (stackIn_368_0 <= stackIn_368_1) {
                                                            break L90;
                                                          } else {
                                                            stackOut_369_0 = 0;
                                                            stackIn_300_0 = stackOut_369_0;
                                                            stackIn_370_0 = stackOut_369_0;
                                                            if (var14 != 0) {
                                                              continue L88;
                                                            } else {
                                                              var7 = stackIn_370_0;
                                                              L104: while (true) {
                                                                L105: {
                                                                  if (var7 >= 5) {
                                                                    break L105;
                                                                  } else {
                                                                    stackOut_372_0 = var3;
                                                                    stackOut_372_1 = var6;
                                                                    stackIn_368_0 = stackOut_372_0;
                                                                    stackIn_368_1 = stackOut_372_1;
                                                                    stackIn_373_0 = stackOut_372_0;
                                                                    stackIn_373_1 = stackOut_372_1;
                                                                    if (var14 != 0) {
                                                                      continue L103;
                                                                    } else {
                                                                      L106: {
                                                                        L107: {
                                                                          if (stackIn_373_0 != stackIn_373_1) {
                                                                            break L107;
                                                                          } else {
                                                                            if (var7 != var4) {
                                                                              break L107;
                                                                            } else {
                                                                              if (var14 == 0) {
                                                                                break L106;
                                                                              } else {
                                                                                break L107;
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                        L108: {
                                                                          var8 = ((nu) this).field_P[var6][var7];
                                                                          if (0 == var4) {
                                                                            break L108;
                                                                          } else {
                                                                            L109: {
                                                                              if (var3 != var6) {
                                                                                break L109;
                                                                              } else {
                                                                                if (!((nu) this).field_F[var6]) {
                                                                                  break L109;
                                                                                } else {
                                                                                  if (var14 == 0) {
                                                                                    break L106;
                                                                                  } else {
                                                                                    break L109;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            L110: {
                                                                              if (var3 != var6) {
                                                                                break L110;
                                                                              } else {
                                                                                if (!var5.field_N.b(false, var5.field_y)) {
                                                                                  break L106;
                                                                                } else {
                                                                                  break L110;
                                                                                }
                                                                              }
                                                                            }
                                                                            if (var6 != var3) {
                                                                              break L108;
                                                                            } else {
                                                                              if (var8.field_N.b(var8.field_y, (byte) -111)) {
                                                                                break L106;
                                                                              } else {
                                                                                break L108;
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                        var9 = var5.f(-122) - var8.f(-94);
                                                                        var10 = var5.a(true) + -var8.a(true);
                                                                        if (var9 * var9 - -(var10 * var10) >= 1600) {
                                                                          break L106;
                                                                        } else {
                                                                          if (4 == var8.field_J) {
                                                                            break L106;
                                                                          } else {
                                                                            L111: {
                                                                              var8.a((byte) -31, 7);
                                                                              var8.field_L = var8.field_L + var5.field_N.a(var5.field_y, false);
                                                                              var8.a((mo) (Object) var5, (byte) 84);
                                                                              if (var4 != 0) {
                                                                                var11 = var5.field_L;
                                                                                var5.a((byte) -31, 12);
                                                                                var5.field_L = var11;
                                                                                break L111;
                                                                              } else {
                                                                                break L111;
                                                                              }
                                                                            }
                                                                            L112: {
                                                                              var11 = ((nu) this).a((byte) 6, var6, var7);
                                                                              if (var11 != -1) {
                                                                                ((nu) this).field_q[var11].field_a = ((nu) this).field_q[var11].field_a + 1;
                                                                                break L112;
                                                                              } else {
                                                                                break L112;
                                                                              }
                                                                            }
                                                                            L113: {
                                                                              L114: {
                                                                                if (~var6 != ~((nu) this).field_V.field_m) {
                                                                                  break L114;
                                                                                } else {
                                                                                  if (((nu) this).field_V.field_s == var7) {
                                                                                    break L113;
                                                                                  } else {
                                                                                    break L114;
                                                                                  }
                                                                                }
                                                                              }
                                                                              if (-1 != var5.field_F) {
                                                                                ((nu) this).field_q[var5.field_F].field_c = ((nu) this).field_q[var5.field_F].field_c + 1;
                                                                                if (var14 == 0) {
                                                                                  break L106;
                                                                                } else {
                                                                                  break L113;
                                                                                }
                                                                              } else {
                                                                                break L106;
                                                                              }
                                                                            }
                                                                            L115: {
                                                                              ((nu) this).field_V.field_s = var4;
                                                                              ((nu) this).field_V.field_m = var3;
                                                                              if (((nu) this).field_V.field_s == 0) {
                                                                                break L115;
                                                                              } else {
                                                                                if (((nu) this).a((byte) 6, var3, var4) != -1) {
                                                                                  break L115;
                                                                                } else {
                                                                                  this.a(-127, (mo) (Object) ((nu) this).field_V, var4, ((nu) this).b((byte) 49, var3));
                                                                                  break L115;
                                                                                }
                                                                              }
                                                                            }
                                                                            if (var5.field_F == -1) {
                                                                              break L106;
                                                                            } else {
                                                                              ((nu) this).field_q[var5.field_F].field_m = ((nu) this).field_q[var5.field_F].field_m + 1;
                                                                              break L106;
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                      var7++;
                                                                      if (var14 == 0) {
                                                                        continue L104;
                                                                      } else {
                                                                        break L105;
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                                var6++;
                                                                if (var14 == 0) {
                                                                  continue L102;
                                                                } else {
                                                                  break L90;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                  var4++;
                                                  if (var14 == 0) {
                                                    continue L87;
                                                  } else {
                                                    break L89;
                                                  }
                                                }
                                              }
                                            }
                                            var3++;
                                            if (var14 == 0) {
                                              stackOut_293_0 = -3;
                                              stackOut_293_1 = ~var3;
                                              stackIn_294_0 = stackOut_293_0;
                                              stackIn_294_1 = stackOut_293_1;
                                              continue L86;
                                            } else {
                                              break L74;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  L116: {
                                    if (stackIn_256_0 == stackIn_256_1) {
                                      break L116;
                                    } else {
                                      L117: {
                                        if (var4_ref_nl.field_u != 3) {
                                          break L117;
                                        } else {
                                          if (var14 == 0) {
                                            break L116;
                                          } else {
                                            break L117;
                                          }
                                        }
                                      }
                                      var5_int = ((nu) this).field_V.a(true) - var4_ref_nl.f(-102);
                                      var6 = ((nu) this).field_V.c(879306160) - var4_ref_nl.a(true);
                                      var7 = var6 * var6 + var5_int * var5_int;
                                      if (var7 < 784) {
                                        L118: {
                                          var8_int = uv.b(var6, var5_int, (byte) 2);
                                          var9 = 511 & 693 * var4_ref_nl.f(-99);
                                          if (256 <= var9) {
                                            break L118;
                                          } else {
                                            var9 -= 512;
                                            break L118;
                                          }
                                        }
                                        L119: {
                                          var8_int = 8191 & var8_int - (-8192 - var9);
                                          if (var4_ref_nl.field_u == 5) {
                                            L120: {
                                              if (var3 == 0) {
                                                stackOut_277_0 = 1024;
                                                stackIn_278_0 = stackOut_277_0;
                                                break L120;
                                              } else {
                                                stackOut_275_0 = -1024;
                                                stackIn_278_0 = stackOut_275_0;
                                                break L120;
                                              }
                                            }
                                            L121: {
                                              var10 = stackIn_278_0;
                                              if ((var4_ref_nl.field_G & 2) != 0) {
                                                var8_int = 8191 & -var10 + (8192 + var8_int);
                                                break L121;
                                              } else {
                                                break L121;
                                              }
                                            }
                                            if (0 != (var4_ref_nl.field_G & 8)) {
                                              var8_int = 8191 & var10 + var8_int - -8192;
                                              break L119;
                                            } else {
                                              break L119;
                                            }
                                          } else {
                                            break L119;
                                          }
                                        }
                                        ((nu) this).field_V.a((mo) (Object) var4_ref_nl, (byte) 84);
                                        var10 = pc.a(((nu) this).field_V.e(3), -524289) >> 8;
                                        ((nu) this).field_V.field_q = (we.a(var8_int, false) >> 8) * var10;
                                        ((nu) this).field_V.field_h = var10 * (ei.a(var8_int, (byte) -23) >> 8);
                                        ((nu) this).field_V.a((byte) -78, ((nu) this).field_t, ((nu) this).field_B);
                                        if (var4_ref_nl.field_o < 15) {
                                          var4_ref_nl.field_o = var4_ref_nl.field_o + 1;
                                          break L116;
                                        } else {
                                          break L116;
                                        }
                                      } else {
                                        break L116;
                                      }
                                    }
                                  }
                                  var3++;
                                  if (var14 == 0) {
                                    continue L85;
                                  } else {
                                    break L84;
                                  }
                                }
                              }
                            }
                          }
                        }
                        stackOut_291_0 = 0;
                        stackIn_292_0 = stackOut_291_0;
                        break L75;
                      }
                      var3 = stackIn_292_0;
                      L122: while (true) {
                        stackOut_293_0 = -3;
                        stackOut_293_1 = ~var3;
                        stackIn_294_0 = stackOut_293_0;
                        stackIn_294_1 = stackOut_293_1;
                        L123: while (true) {
                          if (stackIn_294_0 >= stackIn_294_1) {
                            break L74;
                          } else {
                            stackOut_295_0 = 0;
                            stackIn_442_0 = stackOut_295_0;
                            stackIn_296_0 = stackOut_295_0;
                            if (var14 != 0) {
                              break L73;
                            } else {
                              stackOut_296_0 = stackIn_296_0;
                              stackIn_298_0 = stackOut_296_0;
                              var4 = stackIn_298_0;
                              L124: while (true) {
                                stackOut_299_0 = -6;
                                stackIn_300_0 = stackOut_299_0;
                                L125: while (true) {
                                  L126: {
                                    if (stackIn_300_0 >= ~var4) {
                                      break L126;
                                    } else {
                                      var5 = ((nu) this).field_P[var3][var4];
                                      stackOut_301_0 = -4;
                                      stackOut_301_1 = ~var5.field_u;
                                      stackIn_294_0 = stackOut_301_0;
                                      stackIn_294_1 = stackOut_301_1;
                                      stackIn_302_0 = stackOut_301_0;
                                      stackIn_302_1 = stackOut_301_1;
                                      if (var14 != 0) {
                                        continue L123;
                                      } else {
                                        L127: {
                                          L128: {
                                            if (stackIn_302_0 == stackIn_302_1) {
                                              break L128;
                                            } else {
                                              if (var5.field_u == 13) {
                                                break L128;
                                              } else {
                                                if (var14 == 0) {
                                                  break L127;
                                                } else {
                                                  break L128;
                                                }
                                              }
                                            }
                                          }
                                          L129: {
                                            if (((nu) this).field_V.field_m != -1) {
                                              break L129;
                                            } else {
                                              if (Math.abs(-var5.field_v + ((nu) this).field_V.field_v) >> 16 >= 30) {
                                                break L129;
                                              } else {
                                                if (((nu) this).field_V.field_r != 0) {
                                                  break L129;
                                                } else {
                                                  var6 = var5.f(param0 + -11776) + -((nu) this).field_V.a(true);
                                                  var7 = var5.a(true) - ((nu) this).field_V.c(879306160);
                                                  var8_int = var7 * var7 + var6 * var6;
                                                  if (var8_int >= 1600) {
                                                    break L129;
                                                  } else {
                                                    ((nu) this).field_V.a((mo) (Object) var5, (byte) 84);
                                                    var9 = (4 * var5.field_N.d(var5.field_y, 0) << 16) / 100 + 524288;
                                                    var10_long = (long)(var9 + Math.max(var5.field_q, pc.a(((nu) this).field_V.e(-127), -524289)));
                                                    ((nu) this).field_V.field_r = 5;
                                                    ((nu) this).field_V.field_h = (int)((long)var5.field_m * var10_long / (long)var5.field_q);
                                                    ((nu) this).field_V.field_q = (int)(var10_long * (long)var5.field_k / (long)var5.field_q);
                                                    var12 = 0;
                                                    L130: while (true) {
                                                      L131: {
                                                        L132: {
                                                          if (var12 >= ((nu) this).field_I) {
                                                            break L132;
                                                          } else {
                                                            stackOut_321_0 = ((nu) this).field_g[var12].field_p;
                                                            stackOut_321_1 = var3;
                                                            stackIn_332_0 = stackOut_321_0;
                                                            stackIn_332_1 = stackOut_321_1;
                                                            stackIn_322_0 = stackOut_321_0;
                                                            stackIn_322_1 = stackOut_321_1;
                                                            if (var14 != 0) {
                                                              break L131;
                                                            } else {
                                                              L133: {
                                                                if (stackIn_322_0 != stackIn_322_1) {
                                                                  break L133;
                                                                } else {
                                                                  if (~((nu) this).field_R[var12].field_g != ~var4) {
                                                                    break L133;
                                                                  } else {
                                                                    ((nu) this).field_V.field_j = var12;
                                                                    break L133;
                                                                  }
                                                                }
                                                              }
                                                              var12++;
                                                              if (var14 == 0) {
                                                                continue L130;
                                                              } else {
                                                                break L132;
                                                              }
                                                            }
                                                          }
                                                        }
                                                        var12 = ((nu) this).a((byte) 6, var3, var4);
                                                        stackOut_331_0 = 13;
                                                        stackOut_331_1 = var5.field_u;
                                                        stackIn_332_0 = stackOut_331_0;
                                                        stackIn_332_1 = stackOut_331_1;
                                                        break L131;
                                                      }
                                                      L134: {
                                                        if (stackIn_332_0 != stackIn_332_1) {
                                                          break L134;
                                                        } else {
                                                          if (((nu) this).field_V.field_i != 2) {
                                                            break L134;
                                                          } else {
                                                            if (((nu) this).field_V.field_o == -1) {
                                                              break L134;
                                                            } else {
                                                              if (var12 == -1) {
                                                                break L134;
                                                              } else {
                                                                if (~((nu) this).field_V.field_o != ~var12) {
                                                                  break L134;
                                                                } else {
                                                                  break L134;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                      L135: {
                                                        if (var12 == -1) {
                                                          break L135;
                                                        } else {
                                                          ((nu) this).field_V.field_o = var12;
                                                          break L135;
                                                        }
                                                      }
                                                      L136: {
                                                        stackOut_348_0 = ((nu) this).field_V;
                                                        stackIn_351_0 = stackOut_348_0;
                                                        stackIn_349_0 = stackOut_348_0;
                                                        if (var5.field_u == 13) {
                                                          stackOut_351_0 = (tj) (Object) stackIn_351_0;
                                                          stackOut_351_1 = 2;
                                                          stackIn_352_0 = stackOut_351_0;
                                                          stackIn_352_1 = stackOut_351_1;
                                                          break L136;
                                                        } else {
                                                          stackOut_349_0 = (tj) (Object) stackIn_349_0;
                                                          stackOut_349_1 = 1;
                                                          stackIn_352_0 = stackOut_349_0;
                                                          stackIn_352_1 = stackOut_349_1;
                                                          break L136;
                                                        }
                                                      }
                                                      L137: {
                                                        stackIn_352_0.field_i = stackIn_352_1;
                                                        var13 = ((nu) this).field_P[-var3 + 1][0];
                                                        stackOut_352_0 = ((nu) this).field_N;
                                                        stackOut_352_1 = 35;
                                                        stackOut_352_2 = ((nu) this).field_V.field_o;
                                                        stackOut_352_3 = (nl) var13;
                                                        stackOut_352_4 = var4;
                                                        stackOut_352_5 = ((nu) this).field_v;
                                                        stackIn_355_0 = stackOut_352_0;
                                                        stackIn_355_1 = stackOut_352_1;
                                                        stackIn_355_2 = stackOut_352_2;
                                                        stackIn_355_3 = stackOut_352_3;
                                                        stackIn_355_4 = stackOut_352_4;
                                                        stackIn_355_5 = stackOut_352_5;
                                                        stackIn_353_0 = stackOut_352_0;
                                                        stackIn_353_1 = stackOut_352_1;
                                                        stackIn_353_2 = stackOut_352_2;
                                                        stackIn_353_3 = stackOut_352_3;
                                                        stackIn_353_4 = stackOut_352_4;
                                                        stackIn_353_5 = stackOut_352_5;
                                                        if (var5.field_u != 13) {
                                                          stackOut_355_0 = (ch) (Object) stackIn_355_0;
                                                          stackOut_355_1 = stackIn_355_1;
                                                          stackOut_355_2 = stackIn_355_2;
                                                          stackOut_355_3 = (nl) (Object) stackIn_355_3;
                                                          stackOut_355_4 = stackIn_355_4;
                                                          stackOut_355_5 = stackIn_355_5;
                                                          stackOut_355_6 = 2;
                                                          stackIn_356_0 = stackOut_355_0;
                                                          stackIn_356_1 = stackOut_355_1;
                                                          stackIn_356_2 = stackOut_355_2;
                                                          stackIn_356_3 = stackOut_355_3;
                                                          stackIn_356_4 = stackOut_355_4;
                                                          stackIn_356_5 = stackOut_355_5;
                                                          stackIn_356_6 = stackOut_355_6;
                                                          break L137;
                                                        } else {
                                                          stackOut_353_0 = (ch) (Object) stackIn_353_0;
                                                          stackOut_353_1 = stackIn_353_1;
                                                          stackOut_353_2 = stackIn_353_2;
                                                          stackOut_353_3 = (nl) (Object) stackIn_353_3;
                                                          stackOut_353_4 = stackIn_353_4;
                                                          stackOut_353_5 = stackIn_353_5;
                                                          stackOut_353_6 = 3;
                                                          stackIn_356_0 = stackOut_353_0;
                                                          stackIn_356_1 = stackOut_353_1;
                                                          stackIn_356_2 = stackOut_353_2;
                                                          stackIn_356_3 = stackOut_353_3;
                                                          stackIn_356_4 = stackOut_353_4;
                                                          stackIn_356_5 = stackOut_353_5;
                                                          stackIn_356_6 = stackOut_353_6;
                                                          break L137;
                                                        }
                                                      }
                                                      ((ch) (Object) stackIn_356_0).a((byte) stackIn_356_1, stackIn_356_2, stackIn_356_3, stackIn_356_4, stackIn_356_5, stackIn_356_6, var3, (nu) this, var5);
                                                      if (var5.field_F != -1) {
                                                        L138: {
                                                          if (var5.field_u != 13) {
                                                            break L138;
                                                          } else {
                                                            ((nu) this).field_q[var5.field_F].field_h = ((nu) this).field_q[var5.field_F].field_h + 1;
                                                            if (var14 == 0) {
                                                              break L129;
                                                            } else {
                                                              break L138;
                                                            }
                                                          }
                                                        }
                                                        ((nu) this).field_q[var5.field_F].field_j = ((nu) this).field_q[var5.field_F].field_j + 1;
                                                        break L129;
                                                      } else {
                                                        break L129;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          if (var5.field_u != 3) {
                                            break L127;
                                          } else {
                                            var6 = 0;
                                            L139: while (true) {
                                              stackOut_367_0 = 2;
                                              stackOut_367_1 = var6;
                                              stackIn_368_0 = stackOut_367_0;
                                              stackIn_368_1 = stackOut_367_1;
                                              L140: while (true) {
                                                if (stackIn_368_0 <= stackIn_368_1) {
                                                  break L127;
                                                } else {
                                                  stackOut_369_0 = 0;
                                                  stackIn_300_0 = stackOut_369_0;
                                                  stackIn_370_0 = stackOut_369_0;
                                                  if (var14 != 0) {
                                                    continue L125;
                                                  } else {
                                                    var7 = stackIn_370_0;
                                                    L141: while (true) {
                                                      L142: {
                                                        if (var7 >= 5) {
                                                          break L142;
                                                        } else {
                                                          stackOut_372_0 = var3;
                                                          stackOut_372_1 = var6;
                                                          stackIn_368_0 = stackOut_372_0;
                                                          stackIn_368_1 = stackOut_372_1;
                                                          stackIn_373_0 = stackOut_372_0;
                                                          stackIn_373_1 = stackOut_372_1;
                                                          if (var14 != 0) {
                                                            continue L140;
                                                          } else {
                                                            L143: {
                                                              L144: {
                                                                if (stackIn_373_0 != stackIn_373_1) {
                                                                  break L144;
                                                                } else {
                                                                  if (var7 != var4) {
                                                                    break L144;
                                                                  } else {
                                                                    if (var14 == 0) {
                                                                      break L143;
                                                                    } else {
                                                                      break L144;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                              L145: {
                                                                var8 = ((nu) this).field_P[var6][var7];
                                                                if (0 == var4) {
                                                                  break L145;
                                                                } else {
                                                                  L146: {
                                                                    if (var3 != var6) {
                                                                      break L146;
                                                                    } else {
                                                                      if (!((nu) this).field_F[var6]) {
                                                                        break L146;
                                                                      } else {
                                                                        if (var14 == 0) {
                                                                          break L143;
                                                                        } else {
                                                                          break L146;
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                  L147: {
                                                                    if (var3 != var6) {
                                                                      break L147;
                                                                    } else {
                                                                      if (!var5.field_N.b(false, var5.field_y)) {
                                                                        break L143;
                                                                      } else {
                                                                        break L147;
                                                                      }
                                                                    }
                                                                  }
                                                                  if (var6 != var3) {
                                                                    break L145;
                                                                  } else {
                                                                    if (var8.field_N.b(var8.field_y, (byte) -111)) {
                                                                      break L143;
                                                                    } else {
                                                                      break L145;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                              var9 = var5.f(-122) - var8.f(-94);
                                                              var10 = var5.a(true) + -var8.a(true);
                                                              if (var9 * var9 - -(var10 * var10) >= 1600) {
                                                                break L143;
                                                              } else {
                                                                if (4 == var8.field_J) {
                                                                  break L143;
                                                                } else {
                                                                  L148: {
                                                                    var8.a((byte) -31, 7);
                                                                    var8.field_L = var8.field_L + var5.field_N.a(var5.field_y, false);
                                                                    var8.a((mo) (Object) var5, (byte) 84);
                                                                    if (var4 != 0) {
                                                                      var11 = var5.field_L;
                                                                      var5.a((byte) -31, 12);
                                                                      var5.field_L = var11;
                                                                      break L148;
                                                                    } else {
                                                                      break L148;
                                                                    }
                                                                  }
                                                                  L149: {
                                                                    var11 = ((nu) this).a((byte) 6, var6, var7);
                                                                    if (var11 != -1) {
                                                                      ((nu) this).field_q[var11].field_a = ((nu) this).field_q[var11].field_a + 1;
                                                                      break L149;
                                                                    } else {
                                                                      break L149;
                                                                    }
                                                                  }
                                                                  L150: {
                                                                    L151: {
                                                                      if (~var6 != ~((nu) this).field_V.field_m) {
                                                                        break L151;
                                                                      } else {
                                                                        if (((nu) this).field_V.field_s == var7) {
                                                                          break L150;
                                                                        } else {
                                                                          break L151;
                                                                        }
                                                                      }
                                                                    }
                                                                    if (-1 != var5.field_F) {
                                                                      ((nu) this).field_q[var5.field_F].field_c = ((nu) this).field_q[var5.field_F].field_c + 1;
                                                                      if (var14 == 0) {
                                                                        break L143;
                                                                      } else {
                                                                        break L150;
                                                                      }
                                                                    } else {
                                                                      break L143;
                                                                    }
                                                                  }
                                                                  L152: {
                                                                    ((nu) this).field_V.field_s = var4;
                                                                    ((nu) this).field_V.field_m = var3;
                                                                    if (((nu) this).field_V.field_s == 0) {
                                                                      break L152;
                                                                    } else {
                                                                      if (((nu) this).a((byte) 6, var3, var4) != -1) {
                                                                        break L152;
                                                                      } else {
                                                                        this.a(-127, (mo) (Object) ((nu) this).field_V, var4, ((nu) this).b((byte) 49, var3));
                                                                        break L152;
                                                                      }
                                                                    }
                                                                  }
                                                                  if (var5.field_F == -1) {
                                                                    break L143;
                                                                  } else {
                                                                    ((nu) this).field_q[var5.field_F].field_m = ((nu) this).field_q[var5.field_F].field_m + 1;
                                                                    break L143;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                            var7++;
                                                            if (var14 == 0) {
                                                              continue L141;
                                                            } else {
                                                              break L142;
                                                            }
                                                          }
                                                        }
                                                      }
                                                      var6++;
                                                      if (var14 == 0) {
                                                        continue L139;
                                                      } else {
                                                        break L127;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                        var4++;
                                        if (var14 == 0) {
                                          continue L124;
                                        } else {
                                          break L126;
                                        }
                                      }
                                    }
                                  }
                                  var3++;
                                  if (var14 == 0) {
                                    continue L122;
                                  } else {
                                    break L74;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    stackOut_441_0 = 0;
                    stackIn_442_0 = stackOut_441_0;
                    break L73;
                  }
                  L153: {
                    if (stackIn_442_0 == ~((nu) this).field_V.field_m) {
                      break L153;
                    } else {
                      if (((nu) this).field_V.field_s != -1) {
                        break L153;
                      } else {
                        break L153;
                      }
                    }
                  }
                  L154: {
                    if (null == ((nu) this).b((byte) -96)) {
                      break L154;
                    } else {
                      if (((nu) this).a((byte) 6, ((nu) this).field_V.field_m, ((nu) this).field_V.field_s) != -1) {
                        ((nu) this).field_V.field_o = ((nu) this).a((byte) 6, ((nu) this).field_V.field_m, ((nu) this).field_V.field_s);
                        break L154;
                      } else {
                        break L154;
                      }
                    }
                  }
                  L155: {
                    if (((nu) this).field_ab == null) {
                      break L155;
                    } else {
                      ((nu) this).field_ab.a(-27626, (nu) this);
                      break L155;
                    }
                  }
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2, "nu.L(" + param0 + ')');
        }
    }

    final void a(nu param0, byte param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_65_0 = 0;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_80_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_64_0 = 0;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        var5 = Kickabout.field_G;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (((nu) this).field_I <= var3_int) {
                    break L3;
                  } else {
                    ((nu) this).field_g[var3_int].a((mo) (Object) param0.field_g[var3_int], false);
                    var3_int++;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      if (var5 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var3_int = 0;
                break L2;
              }
              L4: while (true) {
                L5: {
                  L6: {
                    if (var3_int >= 2) {
                      break L6;
                    } else {
                      stackOut_9_0 = 0;
                      stackIn_21_0 = stackOut_9_0;
                      stackIn_10_0 = stackOut_9_0;
                      if (var5 != 0) {
                        break L5;
                      } else {
                        stackOut_10_0 = stackIn_10_0;
                        stackIn_12_0 = stackOut_10_0;
                        var4 = stackIn_12_0;
                        L7: while (true) {
                          L8: {
                            L9: {
                              if (var4 >= 4) {
                                break L9;
                              } else {
                                ((nu) this).field_i[var3_int][var4] = param0.field_i[var3_int][var4];
                                ((nu) this).field_k[var3_int][var4] = param0.field_k[var3_int][var4];
                                ((nu) this).field_b[var3_int][var4].a((byte) -89, param0.field_b[var3_int][var4]);
                                var4++;
                                if (var5 != 0) {
                                  break L8;
                                } else {
                                  if (var5 == 0) {
                                    continue L7;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                            }
                            ((nu) this).field_r[var3_int] = param0.field_r[var3_int];
                            ((nu) this).field_H[var3_int] = param0.field_H[var3_int];
                            ((nu) this).field_d[var3_int] = param0.field_d[var3_int];
                            ((nu) this).field_Q[var3_int] = param0.field_Q[var3_int];
                            var3_int++;
                            break L8;
                          }
                          if (var5 == 0) {
                            continue L4;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                  }
                  ((nu) this).field_m = param0.field_m;
                  ((nu) this).field_Z = param0.field_Z;
                  ((nu) this).field_t = param0.field_t;
                  stackOut_20_0 = ((nu) this).field_u;
                  stackIn_21_0 = stackOut_20_0;
                  break L5;
                }
                L10: {
                  if (stackIn_21_0 == param0.field_u) {
                    break L10;
                  } else {
                    ((nu) this).a(param0.field_u, (byte) -125);
                    break L10;
                  }
                }
                ((nu) this).field_v = param0.field_v;
                var3_int = 0;
                L11: while (true) {
                  L12: {
                    L13: {
                      if (~((nu) this).field_I >= ~var3_int) {
                        break L13;
                      } else {
                        ((nu) this).field_R[var3_int].a((mo) (Object) param0.field_R[var3_int], false);
                        var3_int++;
                        if (var5 != 0) {
                          break L12;
                        } else {
                          if (var5 == 0) {
                            continue L11;
                          } else {
                            break L13;
                          }
                        }
                      }
                    }
                    if (0 != ((nu) this).field_u) {
                      break L12;
                    } else {
                      ((nu) this).field_n.a((mo) (Object) param0.field_n, false);
                      break L12;
                    }
                  }
                  L14: {
                    if (((nu) this).field_u != 2) {
                      break L14;
                    } else {
                      ((nu) this).field_C.a((mo) (Object) param0.field_C, false);
                      break L14;
                    }
                  }
                  L15: {
                    if (((nu) this).field_u == 3) {
                      ((nu) this).field_o.a((mo) (Object) param0.field_o, false);
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  if (param1 > 42) {
                    L16: {
                      L17: {
                        L18: {
                          L19: {
                            L20: {
                              if (((nu) this).field_u == 4) {
                                var3_int = 0;
                                L21: while (true) {
                                  L22: {
                                    if (2 <= var3_int) {
                                      break L22;
                                    } else {
                                      stackOut_47_0 = 0;
                                      stackIn_65_0 = stackOut_47_0;
                                      stackIn_48_0 = stackOut_47_0;
                                      if (var5 != 0) {
                                        break L19;
                                      } else {
                                        var4 = stackIn_48_0;
                                        L23: while (true) {
                                          L24: {
                                            L25: {
                                              if (var4 >= 5) {
                                                break L25;
                                              } else {
                                                ((nu) this).field_P[var3_int][var4].a((mo) (Object) param0.field_P[var3_int][var4], false);
                                                var4++;
                                                if (var5 != 0) {
                                                  break L24;
                                                } else {
                                                  if (var5 == 0) {
                                                    continue L23;
                                                  } else {
                                                    break L25;
                                                  }
                                                }
                                              }
                                            }
                                            var3_int++;
                                            break L24;
                                          }
                                          if (var5 == 0) {
                                            continue L21;
                                          } else {
                                            break L22;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  ((nu) this).field_V.a((mo) (Object) param0.field_V, false);
                                  ((nu) this).field_X.a((mo) (Object) param0.field_X, false);
                                  ((nu) this).field_J = param0.field_J;
                                  ((nu) this).field_G = param0.field_G;
                                  break L20;
                                }
                              } else {
                                break L20;
                              }
                            }
                            L26: {
                              if (((nu) this).field_N != null) {
                                ((nu) this).field_N.a(-4, param0.field_N);
                                break L26;
                              } else {
                                break L26;
                              }
                            }
                            if (((nu) this).field_q != null) {
                              stackOut_64_0 = 0;
                              stackIn_65_0 = stackOut_64_0;
                              break L19;
                            } else {
                              break L18;
                            }
                          }
                          var3_int = stackIn_65_0;
                          L27: while (true) {
                            if (~((nu) this).field_q.length >= ~var3_int) {
                              break L18;
                            } else {
                              ((nu) this).field_q[var3_int].a(true, param0.field_q[var3_int]);
                              var3_int++;
                              if (var5 != 0) {
                                break L17;
                              } else {
                                if (var5 == 0) {
                                  continue L27;
                                } else {
                                  break L18;
                                }
                              }
                            }
                          }
                        }
                        if (((nu) this).field_ab != null) {
                          break L17;
                        } else {
                          break L16;
                        }
                      }
                      ((nu) this).field_ab.a(120, param0.field_ab);
                      break L16;
                    }
                    break L0;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L28: {
            var3 = decompiledCaughtException;
            stackOut_76_0 = (RuntimeException) var3;
            stackOut_76_1 = new StringBuilder().append("nu.DA(");
            stackIn_79_0 = stackOut_76_0;
            stackIn_79_1 = stackOut_76_1;
            stackIn_77_0 = stackOut_76_0;
            stackIn_77_1 = stackOut_76_1;
            if (param0 == null) {
              stackOut_79_0 = (RuntimeException) (Object) stackIn_79_0;
              stackOut_79_1 = (StringBuilder) (Object) stackIn_79_1;
              stackOut_79_2 = "null";
              stackIn_80_0 = stackOut_79_0;
              stackIn_80_1 = stackOut_79_1;
              stackIn_80_2 = stackOut_79_2;
              break L28;
            } else {
              stackOut_77_0 = (RuntimeException) (Object) stackIn_77_0;
              stackOut_77_1 = (StringBuilder) (Object) stackIn_77_1;
              stackOut_77_2 = "{...}";
              stackIn_80_0 = stackOut_77_0;
              stackIn_80_1 = stackOut_77_1;
              stackIn_80_2 = stackOut_77_2;
              break L28;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_80_0, stackIn_80_2 + ',' + param1 + ')');
        }
    }

    final static void b(boolean param0) {
        RuntimeException runtimeException = null;
        dt[] var1 = null;
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
                  L2: {
                    var1 = af.field_a;
                    var2 = 0;
                    if (!param0) {
                      break L2;
                    } else {
                      nu.b(false);
                      break L2;
                    }
                  }
                  L3: while (true) {
                    L4: {
                      L5: {
                        if (~var1.length >= ~var2) {
                          break L5;
                        } else {
                          var3 = var1[var2];
                          var3.a((byte) 10);
                          var2++;
                          if (var4 != 0) {
                            break L4;
                          } else {
                            if (var4 == 0) {
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
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw nb.a((Throwable) (Object) runtimeException, "nu.BA(" + param0 + ')');
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
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
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
                L3: {
                  if (var7 >= param0.field_L) {
                    break L3;
                  } else {
                    var3_int = var3_int + param0.field_k;
                    var4 = var4 + param0.field_m;
                    var5.a((byte) -85, ((nu) this).field_t, ((nu) this).field_B);
                    stackOut_3_0 = var7;
                    stackOut_3_1 = 10;
                    stackIn_12_0 = stackOut_3_0;
                    stackIn_12_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (var12 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_4_0 > stackIn_4_1) {
                          var9 = -var3_int + var5.field_t >> 16;
                          var10 = var5.field_p + -var4 >> 16;
                          var11 = var9 * var9 - -(var10 * var10);
                          if (~var6 >= ~var11) {
                            break L3;
                          } else {
                            var6 = var11;
                            break L4;
                          }
                        } else {
                          break L4;
                        }
                      }
                      var7++;
                      if (var12 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_11_0 = -10001;
                stackOut_11_1 = ~var6;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                break L2;
              }
              L5: {
                if (stackIn_12_0 >= stackIn_12_1) {
                  break L5;
                } else {
                  if (var7 > 1) {
                    param0.field_B = (-param0.field_w + var5.field_p) / var7;
                    param0.field_L = var7 + 1;
                    param0.field_r = (var5.field_t - param0.field_M) / var7;
                    param0.field_s = true;
                    var9 = -param0.field_v + var5.field_v + -327680;
                    if (var9 <= 0) {
                      break L5;
                    } else {
                      if (param0.field_v == 0) {
                        L6: {
                          param0.field_K = (var9 + (var7 * 26214 * var7 >> 1)) / var7;
                          if (458752 < param0.field_K) {
                            param0.field_K = 458752;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        param0.a((byte) -31, 13);
                        param0.field_L = (param0.field_K << 1) / 26214;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                  } else {
                    break L5;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var3;
            stackOut_30_1 = new StringBuilder().append("nu.N(");
            stackIn_33_0 = stackOut_30_0;
            stackIn_33_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param0 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L7;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_34_0 = stackOut_31_0;
              stackIn_34_1 = stackOut_31_1;
              stackIn_34_2 = stackOut_31_2;
              break L7;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + ',' + param1 + ')');
        }
    }

    private final void b(boolean param0, ki param1) {
        RuntimeException runtimeException = null;
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
                if (param0) {
                  break L3;
                } else {
                  ((nu) this).field_y = true;
                  break L3;
                }
              }
              L4: {
                var3_int = param1.field_u;
                if (!((nu) this).field_R[var3_int].d(3511)) {
                  break L4;
                } else {
                  if (!((nu) this).field_Y) {
                    var4 = ((nu) this).a((byte) -94, var3_int);
                    var4.field_G = param1.field_v;
                    var4.a((mo) (Object) ((nu) this).field_g[var3_int], (byte) 84);
                    break L0;
                  } else {
                    break L4;
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
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) runtimeException;
            stackOut_22_1 = new StringBuilder().append("nu.AA(").append(param0).append(',');
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
              break L5;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L5;
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
                if (!param0) {
                  break L13;
                } else {
                  nl discarded$1 = ((nu) this).b((byte) -83);
                  break L13;
                }
              }
              L14: {
                if (var3_int != 8) {
                  break L14;
                } else {
                  L15: {
                    stackOut_53_0 = ((nu) this).field_V;
                    stackIn_58_0 = stackOut_53_0;
                    stackIn_54_0 = stackOut_53_0;
                    if (((nu) this).field_V.field_l != 7) {
                      stackOut_58_0 = (tj) (Object) stackIn_58_0;
                      stackOut_58_1 = 7;
                      stackIn_59_0 = stackOut_58_0;
                      stackIn_59_1 = stackOut_58_1;
                      break L15;
                    } else {
                      stackOut_54_0 = (tj) (Object) stackIn_54_0;
                      stackIn_56_0 = stackOut_54_0;
                      stackOut_56_0 = (tj) (Object) stackIn_56_0;
                      stackOut_56_1 = mp.field_p[((nu) this).field_t];
                      stackIn_59_0 = stackOut_56_0;
                      stackIn_59_1 = stackOut_56_1;
                      break L15;
                    }
                  }
                  stackIn_59_0.field_l = stackIn_59_1;
                  break L14;
                }
              }
              L16: {
                if (9 == var3_int) {
                  L17: {
                    stackOut_63_0 = ((nu) this).field_V;
                    stackIn_66_0 = stackOut_63_0;
                    stackIn_64_0 = stackOut_63_0;
                    if (((nu) this).field_V.field_l != 8) {
                      stackOut_66_0 = (tj) (Object) stackIn_66_0;
                      stackOut_66_1 = 8;
                      stackIn_67_0 = stackOut_66_0;
                      stackIn_67_1 = stackOut_66_1;
                      break L17;
                    } else {
                      stackOut_64_0 = (tj) (Object) stackIn_64_0;
                      stackOut_64_1 = mp.field_p[((nu) this).field_t];
                      stackIn_67_0 = stackOut_64_0;
                      stackIn_67_1 = stackOut_64_1;
                      break L17;
                    }
                  }
                  stackIn_67_0.field_l = stackIn_67_1;
                  break L16;
                } else {
                  break L16;
                }
              }
              L18: {
                if (var3_int != 11) {
                  break L18;
                } else {
                  L19: {
                    stackOut_69_0 = (gt) var4;
                    stackIn_74_0 = stackOut_69_0;
                    stackIn_70_0 = stackOut_69_0;
                    if (var4.field_u) {
                      stackOut_74_0 = (gt) (Object) stackIn_74_0;
                      stackOut_74_1 = 0;
                      stackIn_75_0 = stackOut_74_0;
                      stackIn_75_1 = stackOut_74_1;
                      break L19;
                    } else {
                      stackOut_70_0 = (gt) (Object) stackIn_70_0;
                      stackIn_72_0 = stackOut_70_0;
                      stackOut_72_0 = (gt) (Object) stackIn_72_0;
                      stackOut_72_1 = 1;
                      stackIn_75_0 = stackOut_72_0;
                      stackIn_75_1 = stackOut_72_1;
                      break L19;
                    }
                  }
                  stackIn_75_0.field_u = stackIn_75_1 != 0;
                  break L18;
                }
              }
              L20: {
                if (var3_int == 10) {
                  L21: {
                    stackOut_79_0 = this;
                    stackIn_82_0 = stackOut_79_0;
                    stackIn_80_0 = stackOut_79_0;
                    if (((nu) this).field_G) {
                      stackOut_82_0 = this;
                      stackOut_82_1 = 0;
                      stackIn_83_0 = stackOut_82_0;
                      stackIn_83_1 = stackOut_82_1;
                      break L21;
                    } else {
                      stackOut_80_0 = this;
                      stackOut_80_1 = 1;
                      stackIn_83_0 = stackOut_80_0;
                      stackIn_83_1 = stackOut_80_1;
                      break L21;
                    }
                  }
                  ((nu) this).field_G = stackIn_83_1 != 0;
                  break L20;
                } else {
                  break L20;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var3 = decompiledCaughtException;
            stackOut_85_0 = (RuntimeException) var3;
            stackOut_85_1 = new StringBuilder().append("nu.T(").append(param0).append(',');
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
              break L22;
            } else {
              stackOut_86_0 = (RuntimeException) (Object) stackIn_86_0;
              stackOut_86_1 = (StringBuilder) (Object) stackIn_86_1;
              stackOut_86_2 = "{...}";
              stackIn_89_0 = stackOut_86_0;
              stackIn_89_1 = stackOut_86_1;
              stackIn_89_2 = stackOut_86_2;
              break L22;
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
        int stackIn_22_0 = 0;
        int stackIn_39_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_21_0 = 0;
        int stackOut_38_0 = 0;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        var7 = Kickabout.field_G;
        try {
          L0: {
            ((nu) this).field_v = param0.field_v;
            var5_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    L5: {
                      if (var5_int >= ((nu) this).field_I) {
                        break L5;
                      } else {
                        ((nu) this).field_R[var5_int].a((mo) (Object) param0.field_R[var5_int], param1, param2, 117);
                        var5_int++;
                        if (var7 != 0) {
                          break L4;
                        } else {
                          if (var7 == 0) {
                            continue L1;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    if (((nu) this).field_u == 0) {
                      break L4;
                    } else {
                      L6: {
                        if (((nu) this).field_u == 2) {
                          break L6;
                        } else {
                          L7: {
                            if (((nu) this).field_u == 3) {
                              break L7;
                            } else {
                              if (4 == ((nu) this).field_u) {
                                var5_int = 0;
                                L8: while (true) {
                                  L9: {
                                    if (var5_int >= 2) {
                                      break L9;
                                    } else {
                                      stackOut_21_0 = 0;
                                      stackIn_39_0 = stackOut_21_0;
                                      stackIn_22_0 = stackOut_21_0;
                                      if (var7 != 0) {
                                        break L2;
                                      } else {
                                        var6 = stackIn_22_0;
                                        L10: while (true) {
                                          L11: {
                                            L12: {
                                              if (var6 >= 5) {
                                                break L12;
                                              } else {
                                                ((nu) this).field_P[var5_int][var6].a((mo) (Object) param0.field_P[var5_int][var6], param1, param2, 104);
                                                var6++;
                                                if (var7 != 0) {
                                                  break L11;
                                                } else {
                                                  if (var7 == 0) {
                                                    continue L10;
                                                  } else {
                                                    break L12;
                                                  }
                                                }
                                              }
                                            }
                                            var5_int++;
                                            break L11;
                                          }
                                          if (var7 == 0) {
                                            continue L8;
                                          } else {
                                            break L9;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  ((nu) this).field_V.a((mo) (Object) param0.field_V, param1, param2, 68);
                                  ((nu) this).field_X.a((mo) (Object) param0.field_X, param1, param2, 41);
                                  ((nu) this).field_G = param0.field_G;
                                  if (var7 == 0) {
                                    break L3;
                                  } else {
                                    break L7;
                                  }
                                }
                              } else {
                                break L3;
                              }
                            }
                          }
                          ((nu) this).field_o.a((mo) (Object) param0.field_o, param1, param2, 72);
                          if (var7 == 0) {
                            break L3;
                          } else {
                            break L6;
                          }
                        }
                      }
                      ((nu) this).field_C.a((mo) (Object) param0.field_C, param1, param2, 83);
                      if (var7 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  ((nu) this).field_n.a((mo) (Object) param0.field_n, param1, param2, param3 + 61);
                  break L3;
                }
                stackOut_38_0 = param3;
                stackIn_39_0 = stackOut_38_0;
                break L2;
              }
              L13: {
                if (stackIn_39_0 == -6) {
                  break L13;
                } else {
                  boolean discarded$1 = ((nu) this).a(68, true, -108L, -124, 51);
                  break L13;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var5 = decompiledCaughtException;
            stackOut_43_0 = (RuntimeException) var5;
            stackOut_43_1 = new StringBuilder().append("nu.LA(");
            stackIn_46_0 = stackOut_43_0;
            stackIn_46_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param0 == null) {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L14;
            } else {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "{...}";
              stackIn_47_0 = stackOut_44_0;
              stackIn_47_1 = stackOut_44_1;
              stackIn_47_2 = stackOut_44_2;
              break L14;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_47_0, stackIn_47_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
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
        gt stackOut_34_0 = null;
        gt stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        gt stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        gt stackOut_39_0 = null;
        gt stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        gt stackOut_40_0 = null;
        gt stackOut_42_0 = null;
        int stackOut_42_1 = 0;
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
            if (param0 == 5) {
              L1: {
                L2: {
                  L3: {
                    L4: {
                      L5: {
                        var4 = param1.field_v;
                        if (var4 == 0) {
                          L6: {
                            ((nu) this).field_R[var3_int].field_v = true;
                            if (((nu) this).field_u < 5) {
                              ((nu) this).field_R[var3_int].field_s = true;
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          ((nu) this).field_R[var3_int].a((mo) (Object) ((nu) this).field_g[var3_int], (byte) 84);
                          ((nu) this).field_R[var3_int].field_g = -1;
                          this.b(10, var3_int);
                          if (var5 == 0) {
                            break L1;
                          } else {
                            break L5;
                          }
                        } else {
                          L7: {
                            if (var4 != 2) {
                              break L7;
                            } else {
                              if (var5 == 0) {
                                break L5;
                              } else {
                                break L7;
                              }
                            }
                          }
                          if (var4 == 3) {
                            break L4;
                          } else {
                            L8: {
                              if (var4 != 1) {
                                break L8;
                              } else {
                                if (var5 == 0) {
                                  break L3;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            if (var4 == 4) {
                              break L2;
                            } else {
                              break L1;
                            }
                          }
                        }
                      }
                      if (((nu) this).field_R[var3_int].d(3511)) {
                        L9: {
                          stackOut_34_0 = ((nu) this).field_R[var3_int];
                          stackIn_37_0 = stackOut_34_0;
                          stackIn_35_0 = stackOut_34_0;
                          if (((nu) this).field_R[var3_int].field_q) {
                            stackOut_37_0 = (gt) (Object) stackIn_37_0;
                            stackOut_37_1 = 0;
                            stackIn_38_0 = stackOut_37_0;
                            stackIn_38_1 = stackOut_37_1;
                            break L9;
                          } else {
                            stackOut_35_0 = (gt) (Object) stackIn_35_0;
                            stackOut_35_1 = 1;
                            stackIn_38_0 = stackOut_35_0;
                            stackIn_38_1 = stackOut_35_1;
                            break L9;
                          }
                        }
                        stackIn_38_0.field_q = stackIn_38_1 != 0;
                        if (var5 == 0) {
                          break L1;
                        } else {
                          break L4;
                        }
                      } else {
                        break L1;
                      }
                    }
                    L10: {
                      stackOut_39_0 = ((nu) this).field_R[var3_int];
                      stackIn_44_0 = stackOut_39_0;
                      stackIn_40_0 = stackOut_39_0;
                      if (((nu) this).field_R[var3_int].field_k) {
                        stackOut_44_0 = (gt) (Object) stackIn_44_0;
                        stackOut_44_1 = 0;
                        stackIn_45_0 = stackOut_44_0;
                        stackIn_45_1 = stackOut_44_1;
                        break L10;
                      } else {
                        stackOut_40_0 = (gt) (Object) stackIn_40_0;
                        stackIn_42_0 = stackOut_40_0;
                        stackOut_42_0 = (gt) (Object) stackIn_42_0;
                        stackOut_42_1 = 1;
                        stackIn_45_0 = stackOut_42_0;
                        stackIn_45_1 = stackOut_42_1;
                        break L10;
                      }
                    }
                    stackIn_45_0.field_k = stackIn_45_1 != 0;
                    if (var5 == 0) {
                      break L1;
                    } else {
                      break L3;
                    }
                  }
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
                      if (var5 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                ((nu) this).field_R[var3_int].a((mo) (Object) ((nu) this).field_g[var3_int], (byte) 84);
                ((nu) this).field_R[var3_int].field_i = true;
                break L1;
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var3 = decompiledCaughtException;
            stackOut_58_0 = (RuntimeException) var3;
            stackOut_58_1 = new StringBuilder().append("nu.S(").append(param0).append(',');
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
              break L11;
            } else {
              stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
              stackOut_59_1 = (StringBuilder) (Object) stackIn_59_1;
              stackOut_59_2 = "{...}";
              stackIn_62_0 = stackOut_59_0;
              stackIn_62_1 = stackOut_59_1;
              stackIn_62_2 = stackOut_59_2;
              break L11;
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
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_35_0 = 0;
        nl stackIn_42_0 = null;
        nl stackIn_44_0 = null;
        nl stackIn_46_0 = null;
        nl stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_34_0 = 0;
        nl stackOut_41_0 = null;
        nl stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        nl stackOut_42_0 = null;
        nl stackOut_44_0 = null;
        int stackOut_44_1 = 0;
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
              stackOut_4_0 = var3_int;
              stackOut_4_1 = 2;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              L3: while (true) {
                L4: {
                  L5: {
                    if (stackIn_5_0 >= stackIn_5_1) {
                      break L5;
                    } else {
                      stackOut_6_0 = 0;
                      stackIn_35_0 = stackOut_6_0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var7 != 0) {
                        break L4;
                      } else {
                        var4_int = stackIn_7_0;
                        L6: while (true) {
                          L7: {
                            if (var4_int >= 5) {
                              break L7;
                            } else {
                              stackOut_9_0 = ~var3_int;
                              stackOut_9_1 = -2;
                              stackIn_5_0 = stackOut_9_0;
                              stackIn_5_1 = stackOut_9_1;
                              stackIn_10_0 = stackOut_9_0;
                              stackIn_10_1 = stackOut_9_1;
                              if (var7 != 0) {
                                continue L3;
                              } else {
                                L8: {
                                  L9: {
                                    if (stackIn_10_0 != stackIn_10_1) {
                                      break L9;
                                    } else {
                                      if (var4_int == 0) {
                                        break L9;
                                      } else {
                                        stackOut_14_0 = 1;
                                        stackIn_17_0 = stackOut_14_0;
                                        break L8;
                                      }
                                    }
                                  }
                                  stackOut_16_0 = 0;
                                  stackIn_17_0 = stackOut_16_0;
                                  break L8;
                                }
                                L10: {
                                  L11: {
                                    L12: {
                                      var5 = stackIn_17_0;
                                      var6 = ((nu) this).field_P[var3_int][var4_int];
                                      if (var5 != 0) {
                                        break L12;
                                      } else {
                                        if (((nu) this).field_s) {
                                          break L11;
                                        } else {
                                          break L12;
                                        }
                                      }
                                    }
                                    L13: {
                                      if (var5 == 0) {
                                        break L13;
                                      } else {
                                        if (((nu) this).field_p) {
                                          break L11;
                                        } else {
                                          break L13;
                                        }
                                      }
                                    }
                                    var6.field_M = ts.a(var4_int, param0, var3_int, 448) << 16;
                                    var6.field_w = cp.a((byte) 21, var4_int, var3_int, param0) << 16;
                                    if (var7 == 0) {
                                      break L10;
                                    } else {
                                      break L11;
                                    }
                                  }
                                  var6.field_M = sh.a(70, var4_int);
                                  var6.field_w = fm.a((byte) -27, var3_int);
                                  break L10;
                                }
                                var4_int++;
                                if (var7 == 0) {
                                  continue L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                          var3_int++;
                          if (var7 == 0) {
                            continue L2;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                  }
                  ((nu) this).field_V.a(29360128, 0, (byte) 26, 44040192);
                  ((nu) this).field_V.field_m = -1;
                  stackOut_34_0 = param1;
                  stackIn_35_0 = stackOut_34_0;
                  break L4;
                }
                var3_int = stackIn_35_0;
                L14: while (true) {
                  L15: {
                    L16: {
                      if (var3_int >= 2) {
                        break L16;
                      } else {
                        var4 = ((nu) this).field_P[var3_int];
                        if (var7 != 0) {
                          break L15;
                        } else {
                          var5 = 0;
                          L17: while (true) {
                            L18: {
                              L19: {
                                if (var5 >= var4.length) {
                                  break L19;
                                } else {
                                  var6 = var4[var5];
                                  if (var7 != 0) {
                                    break L18;
                                  } else {
                                    L20: {
                                      stackOut_41_0 = (nl) var6;
                                      stackIn_46_0 = stackOut_41_0;
                                      stackIn_42_0 = stackOut_41_0;
                                      if (var3_int != 0) {
                                        stackOut_46_0 = (nl) (Object) stackIn_46_0;
                                        stackOut_46_1 = 1;
                                        stackIn_47_0 = stackOut_46_0;
                                        stackIn_47_1 = stackOut_46_1;
                                        break L20;
                                      } else {
                                        stackOut_42_0 = (nl) (Object) stackIn_42_0;
                                        stackIn_44_0 = stackOut_42_0;
                                        stackOut_44_0 = (nl) (Object) stackIn_44_0;
                                        stackOut_44_1 = -1;
                                        stackIn_47_0 = stackOut_44_0;
                                        stackIn_47_1 = stackOut_44_1;
                                        break L20;
                                      }
                                    }
                                    stackIn_47_0.field_n = stackIn_47_1;
                                    var6.field_G = 0;
                                    var6.field_j = 0;
                                    var5++;
                                    if (var7 == 0) {
                                      continue L17;
                                    } else {
                                      break L19;
                                    }
                                  }
                                }
                              }
                              var3_int++;
                              break L18;
                            }
                            if (var7 == 0) {
                              continue L14;
                            } else {
                              break L16;
                            }
                          }
                        }
                      }
                    }
                    ((nu) this).field_E.b(param1 + 22997);
                    break L15;
                  }
                  break L0;
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
                      L6: {
                        var5.a((mo) (Object) ((nu) this).field_g[var3_int], (byte) 84);
                        if (var4 == 0) {
                          break L6;
                        } else {
                          if (var5.field_u == 1) {
                            break L5;
                          } else {
                            break L6;
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
                            L7: {
                              var8 = uv.b(var7, var6, (byte) 2);
                              var5.b(var8, param0 + -61);
                              if (-1 != ((nu) this).field_V.field_m) {
                                break L7;
                              } else {
                                this.a(var5, (byte) 115);
                                break L7;
                              }
                            }
                            var5.field_F = var3_int;
                            ((nu) this).field_q[var3_int].field_n = ((nu) this).field_q[var3_int].field_n + 1;
                            if (Kickabout.field_G == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    L8: {
                      var5.field_P = var7;
                      var5.field_x = var6;
                      var5.field_z = param1.field_v;
                      var8 = var5.d(5339);
                      var9 = uv.a(true, var7, var6);
                      if (pq.b(170, var8 ^ var9) <= 1) {
                        stackOut_40_0 = 0;
                        stackIn_41_0 = stackOut_40_0;
                        break L8;
                      } else {
                        stackOut_38_0 = 1;
                        stackIn_41_0 = stackOut_38_0;
                        break L8;
                      }
                    }
                    L9: {
                      var10 = stackIn_41_0;
                      var5.field_h = var9;
                      var5.a((byte) -31, 2);
                      if (var10 != 0) {
                        var5.field_L = var5.field_L + 16;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    var11 = var5.a(var5.field_z, (byte) -68) + -128;
                    if (var11 <= 0) {
                      break L4;
                    } else {
                      var5.field_L = var5.field_L + (16 * var11 >> 7);
                      break L4;
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
          L10: {
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
              break L10;
            } else {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "{...}";
              stackIn_53_0 = stackOut_50_0;
              stackIn_53_1 = stackOut_50_1;
              stackIn_53_2 = stackOut_50_2;
              break L10;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_53_0, stackIn_53_2 + ')');
        }
    }

    private final String c(byte param0) {
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
              var2_int = -3 / ((-57 - param0) / 49);
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
          throw nb.a((Throwable) (Object) var2, "nu.IA(" + param0 + ')');
        }
        return stackIn_27_0;
    }

    public static void a(boolean param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                field_j = true;
                break L1;
              }
            }
            field_M = null;
            field_a = null;
            field_D = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var1, "nu.CA(" + param0 + ')');
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
        boolean stackIn_7_0 = false;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0 = false;
        int stackOut_16_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_2_0 = 0;
        var5 = Kickabout.field_G;
        try {
          L0: {
            if (param0 == 6) {
              var4_int = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (~var4_int <= ~((nu) this).field_g.length) {
                      break L3;
                    } else {
                      stackOut_6_0 = ((nu) this).field_R[var4_int].d(3511);
                      stackIn_20_0 = stackOut_6_0 ? 1 : 0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var5 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (!stackIn_7_0) {
                            break L4;
                          } else {
                            if (param1 != ((nu) this).field_g[var4_int].field_p) {
                              break L4;
                            } else {
                              if (param2 != ((nu) this).field_R[var4_int].field_g) {
                                break L4;
                              } else {
                                stackOut_16_0 = var4_int;
                                stackIn_17_0 = stackOut_16_0;
                                return stackIn_17_0;
                              }
                            }
                          }
                        }
                        var4_int++;
                        if (var5 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_19_0 = -1;
                  stackIn_20_0 = stackOut_19_0;
                  break L2;
                }
                break L0;
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
        return stackIn_20_0;
    }

    private final void b(int param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 10) {
              L1: {
                L2: {
                  if (((nu) this).field_u != 0) {
                    break L2;
                  } else {
                    ((nu) this).field_n.a(false, param1);
                    ((nu) this).field_n.a((mo) (Object) ((nu) this).field_g[param1], (byte) 84);
                    if (Kickabout.field_G == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
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
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var3, "nu.JA(" + param0 + ',' + param1 + ')');
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
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var8 = Kickabout.field_G;
        try {
          L0: {
            var5_int = ((nu) this).field_g[param3].field_p;
            var6_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~((nu) this).field_I >= ~var6_int) {
                    break L3;
                  } else {
                    stackOut_3_0 = var5_int;
                    stackOut_3_1 = ((nu) this).field_g[var6_int].field_p;
                    stackIn_13_0 = stackOut_3_0;
                    stackIn_13_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (var8 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_4_0 != stackIn_4_1) {
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
                      if (var8 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_12_0 = -103;
                stackOut_12_1 = (param0 - -39) / 48;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                break L2;
              }
              L5: {
                var7_int = stackIn_13_0 % stackIn_13_1;
                if (((nu) this).field_R[param3].field_g == -1) {
                  break L5;
                } else {
                  ((nu) this).a((byte) 118, param3).field_I = 6;
                  break L5;
                }
              }
              L6: {
                if (((nu) this).field_R[param3].field_g == -1) {
                  break L6;
                } else {
                  var6 = ((nu) this).field_P[var5_int][((nu) this).field_R[param3].field_g];
                  var7 = ((nu) this).field_P[var5_int][param2];
                  var7.field_G = var6.field_G;
                  break L6;
                }
              }
              ((nu) this).field_R[param3].field_g = param2;
              ((nu) this).a((byte) 91, param3).a(param1, (byte) 84);
              ((nu) this).field_R[param3].a(param1, (byte) 84);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var5;
            stackOut_20_1 = new StringBuilder().append("nu.D(").append(param0).append(',');
            stackIn_23_0 = stackOut_20_0;
            stackIn_23_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_24_0 = stackOut_21_0;
              stackIn_24_1 = stackOut_21_1;
              stackIn_24_2 = stackOut_21_2;
              break L7;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(ki param0, byte param1) {
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
            if (3 == ((nu) this).field_u) {
              if (((nu) this).field_R[param0.field_u].d(3511)) {
                L1: {
                  ((nu) this).field_o.a(param0.field_v, 0, param0.field_t, param0.field_s, param0.field_u);
                  ((nu) this).field_o.a((mo) (Object) ((nu) this).field_g[param0.field_u], (byte) 84);
                  if (param1 < -8) {
                    break L1;
                  } else {
                    int discarded$3 = ((nu) this).c(-30);
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
          throw nb.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ')');
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
        long stackIn_13_0 = 0L;
        long stackIn_15_0 = 0L;
        RuntimeException decompiledCaughtException = null;
        long stackOut_12_0 = 0L;
        long stackOut_14_0 = 0L;
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
              L4: {
                L5: {
                  if (var12_int >= 70) {
                    break L5;
                  } else {
                    stackOut_12_0 = var8 * var10 >> 16;
                    stackIn_15_0 = stackOut_12_0;
                    stackIn_13_0 = stackOut_12_0;
                    if (var14 != 0) {
                      break L4;
                    } else {
                      var10 = stackIn_13_0;
                      var12_int++;
                      if (var14 == 0) {
                        continue L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                stackOut_14_0 = (-var8 + 65536L << 16) / (-var10 + 65536L);
                stackIn_15_0 = stackOut_14_0;
                break L4;
              }
              var12 = stackIn_15_0;
              ((nu) this).field_V.field_h = (int)((long)var7 * var12 >> 16);
              ((nu) this).field_V.field_n = 573440;
              ((nu) this).field_V.field_q = (int)((long)var6 * var12 >> 16);
              ((nu) this).field_V.field_r = 10;
              ((nu) this).field_V.field_m = -1;
              break L0;
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
              L6: {
                ((nu) this).field_V.field_m = -1;
                if (!param1) {
                  break L6;
                } else {
                  ((nu) this).field_V.field_r = 35;
                  if (Kickabout.field_G == 0) {
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              ((nu) this).field_V.field_r = 20;
              break L5;
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
        int stackIn_27_0 = 0;
        int stackIn_36_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_26_0 = 0;
        int stackOut_35_0 = 0;
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
              L6: {
                if (((nu) this).field_u != param0) {
                  break L6;
                } else {
                  var2_int = 0;
                  L7: while (true) {
                    L8: {
                      L9: {
                        if (var2_int >= ((nu) this).field_I) {
                          break L9;
                        } else {
                          ((nu) this).field_R[var2_int].field_b = ((nu) this).field_R[var2_int].field_b + 1;
                          var2_int++;
                          if (var4 != 0) {
                            break L8;
                          } else {
                            if (var4 == 0) {
                              continue L7;
                            } else {
                              break L9;
                            }
                          }
                        }
                      }
                      ((nu) this).field_V.field_b = ((nu) this).field_V.field_b + 1;
                      ((nu) this).field_X.field_b = ((nu) this).field_X.field_b + 1;
                      break L8;
                    }
                    var2_int = 0;
                    L10: while (true) {
                      if (2 <= var2_int) {
                        break L6;
                      } else {
                        stackOut_26_0 = 0;
                        stackIn_36_0 = stackOut_26_0;
                        stackIn_27_0 = stackOut_26_0;
                        if (var4 != 0) {
                          break L5;
                        } else {
                          var3_int = stackIn_27_0;
                          L11: while (true) {
                            L12: {
                              L13: {
                                if (var3_int >= 5) {
                                  break L13;
                                } else {
                                  ((nu) this).field_P[var2_int][var3_int].field_b = ((nu) this).field_P[var2_int][var3_int].field_b + 1;
                                  var3_int++;
                                  if (var4 != 0) {
                                    break L12;
                                  } else {
                                    if (var4 == 0) {
                                      continue L11;
                                    } else {
                                      break L13;
                                    }
                                  }
                                }
                              }
                              var2_int++;
                              break L12;
                            }
                            if (var4 == 0) {
                              continue L10;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              stackOut_35_0 = ~((nu) this).field_u;
              stackIn_36_0 = stackOut_35_0;
              break L5;
            }
            L14: {
              L15: {
                if (stackIn_36_0 != -5) {
                  break L15;
                } else {
                  this.b(11660);
                  var2_int = 0;
                  L16: while (true) {
                    if (var2_int >= ((nu) this).field_I) {
                      break L15;
                    } else {
                      if (var4 != 0) {
                        break L14;
                      } else {
                        L17: {
                          if (((nu) this).field_R[var2_int].field_s) {
                            break L17;
                          } else {
                            if (((nu) this).field_g[var2_int].field_p < 0) {
                              break L17;
                            } else {
                              L18: {
                                if (((nu) this).field_R[var2_int].field_g >= 0) {
                                  break L18;
                                } else {
                                  if (var4 == 0) {
                                    break L17;
                                  } else {
                                    break L18;
                                  }
                                }
                              }
                              L19: {
                                var3 = ((nu) this).a((byte) -39, var2_int);
                                if (((nu) this).field_g[var2_int].field_p != 0) {
                                  break L19;
                                } else {
                                  if (var3.a(true) < 672) {
                                    break L19;
                                  } else {
                                    break L19;
                                  }
                                }
                              }
                              if (((nu) this).field_g[var2_int].field_p != 1) {
                                break L17;
                              } else {
                                if (var3.a(true) <= 672) {
                                  break L17;
                                } else {
                                  break L17;
                                }
                              }
                            }
                          }
                        }
                        var2_int++;
                        if (var4 == 0) {
                          continue L16;
                        } else {
                          break L15;
                        }
                      }
                    }
                  }
                }
              }
              break L14;
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
        RuntimeException runtimeException = null;
        int var7_int = 0;
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
              or.field_d.b(param3, (byte) 77);
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
            L2: {
              ((ml) (Object) stackIn_4_0).a(stackIn_4_1, stackIn_4_2);
              if (param0 > 101) {
                break L2;
              } else {
                field_j = false;
                break L2;
              }
            }
            or.field_d.c(62, or.field_d.field_n + -var7_int);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) runtimeException;
            stackOut_9_1 = new StringBuilder().append("nu.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
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
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
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
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_59_0 = 0;
        int stackIn_59_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_58_0 = 0;
        int stackOut_58_1 = 0;
        var4 = Kickabout.field_G;
        try {
          L0: {
            var2_ref = (ki) (Object) ((nu) this).field_E.g(24009);
            L1: while (true) {
              L2: {
                L3: {
                  if (null == var2_ref) {
                    break L3;
                  } else {
                    var3 = var2_ref.field_r;
                    stackOut_3_0 = 2;
                    stackOut_3_1 = var3;
                    stackIn_59_0 = stackOut_3_0;
                    stackIn_59_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      L4: {
                        L5: {
                          L6: {
                            L7: {
                              L8: {
                                L9: {
                                  L10: {
                                    L11: {
                                      L12: {
                                        if (stackIn_4_0 == stackIn_4_1) {
                                          break L12;
                                        } else {
                                          if (var3 == 1) {
                                            break L11;
                                          } else {
                                            if (var3 == 0) {
                                              break L10;
                                            } else {
                                              if (var3 == 4) {
                                                break L9;
                                              } else {
                                                if (var3 == 3) {
                                                  break L8;
                                                } else {
                                                  if (var3 == 5) {
                                                    break L7;
                                                  } else {
                                                    L13: {
                                                      if (6 != var3) {
                                                        break L13;
                                                      } else {
                                                        if (var4 == 0) {
                                                          break L6;
                                                        } else {
                                                          break L13;
                                                        }
                                                      }
                                                    }
                                                    if (var3 != 7) {
                                                      break L4;
                                                    } else {
                                                      if (var4 == 0) {
                                                        break L5;
                                                      } else {
                                                        break L12;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                      this.a((byte) 60, var2_ref);
                                      if (var4 == 0) {
                                        break L4;
                                      } else {
                                        break L11;
                                      }
                                    }
                                    this.b((byte) 125, var2_ref);
                                    if (var4 == 0) {
                                      break L4;
                                    } else {
                                      break L10;
                                    }
                                  }
                                  this.b(true, var2_ref);
                                  if (var4 == 0) {
                                    break L4;
                                  } else {
                                    break L9;
                                  }
                                }
                                this.a(1, var2_ref);
                                if (var4 == 0) {
                                  break L4;
                                } else {
                                  break L8;
                                }
                              }
                              this.b(26214, var2_ref);
                              if (var4 == 0) {
                                break L4;
                              } else {
                                break L7;
                              }
                            }
                            this.a(var2_ref, (byte) -34);
                            if (var4 == 0) {
                              break L4;
                            } else {
                              break L6;
                            }
                          }
                          this.c(5, var2_ref);
                          if (var4 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                        this.a(false, var2_ref);
                        break L4;
                      }
                      var2_ref = (ki) (Object) ((nu) this).field_E.c(33);
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_58_0 = 69;
                stackOut_58_1 = (param0 - 70) / 48;
                stackIn_59_0 = stackOut_58_0;
                stackIn_59_1 = stackOut_58_1;
                break L2;
              }
              var3 = stackIn_59_0 % stackIn_59_1;
              break L0;
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
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        boolean stackIn_5_0 = false;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        boolean stackIn_23_0 = false;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int stackIn_41_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        boolean stackOut_4_0 = false;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        boolean stackOut_22_0 = false;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        int stackOut_40_0 = 0;
        var7 = Kickabout.field_G;
        try {
          L0: {
            var2_array = new int[]{3, 4, param0, 1};
            var3 = 0;
            L1: while (true) {
              stackOut_2_0 = ~((nu) this).field_R.length;
              stackOut_2_1 = ~var3;
              stackIn_3_0 = stackOut_2_0;
              stackIn_3_1 = stackOut_2_1;
              L2: while (true) {
                L3: {
                  L4: {
                    if (stackIn_3_0 >= stackIn_3_1) {
                      break L4;
                    } else {
                      stackOut_4_0 = ((nu) this).field_R[var3].d(3511);
                      stackIn_19_0 = stackOut_4_0 ? 1 : 0;
                      stackIn_5_0 = stackOut_4_0;
                      if (var7 != 0) {
                        break L3;
                      } else {
                        L5: {
                          if (!stackIn_5_0) {
                            break L5;
                          } else {
                            var4 = ((nu) this).field_g[var3].field_p;
                            var5 = 0;
                            L6: while (true) {
                              if (4 <= var5) {
                                break L5;
                              } else {
                                var6 = var2_array[var5];
                                stackOut_10_0 = var3;
                                stackOut_10_1 = ((nu) this).field_i[var4][var6 - 1];
                                stackIn_3_0 = stackOut_10_0;
                                stackIn_3_1 = stackOut_10_1;
                                stackIn_11_0 = stackOut_10_0;
                                stackIn_11_1 = stackOut_10_1;
                                if (var7 != 0) {
                                  continue L2;
                                } else {
                                  L7: {
                                    if (stackIn_11_0 == stackIn_11_1) {
                                      ((nu) this).field_R[var3].field_g = var6;
                                      if (var7 == 0) {
                                        break L5;
                                      } else {
                                        break L7;
                                      }
                                    } else {
                                      break L7;
                                    }
                                  }
                                  var5++;
                                  if (var7 == 0) {
                                    continue L6;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                            }
                          }
                        }
                        var3++;
                        if (var7 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  stackOut_18_0 = 0;
                  stackIn_19_0 = stackOut_18_0;
                  break L3;
                }
                var3 = stackIn_19_0;
                L8: while (true) {
                  stackOut_20_0 = ~var3;
                  stackOut_20_1 = -3;
                  stackIn_21_0 = stackOut_20_0;
                  stackIn_21_1 = stackOut_20_1;
                  L9: while (true) {
                    L10: {
                      L11: {
                        if (stackIn_21_0 <= stackIn_21_1) {
                          break L11;
                        } else {
                          stackOut_22_0 = ((nu) this).field_R[((nu) this).field_i[var3][2]].d(3511);
                          stackIn_41_0 = stackOut_22_0 ? 1 : 0;
                          stackIn_23_0 = stackOut_22_0;
                          if (var7 != 0) {
                            break L10;
                          } else {
                            L12: {
                              if (stackIn_23_0) {
                                break L12;
                              } else {
                                var4 = 0;
                                L13: while (true) {
                                  if (var4 >= ((nu) this).field_I) {
                                    break L12;
                                  } else {
                                    stackOut_28_0 = ~var3;
                                    stackOut_28_1 = ~((nu) this).field_g[var4].field_p;
                                    stackIn_21_0 = stackOut_28_0;
                                    stackIn_21_1 = stackOut_28_1;
                                    stackIn_29_0 = stackOut_28_0;
                                    stackIn_29_1 = stackOut_28_1;
                                    if (var7 != 0) {
                                      continue L9;
                                    } else {
                                      L14: {
                                        if (stackIn_29_0 != stackIn_29_1) {
                                          break L14;
                                        } else {
                                          if (!((nu) this).field_R[var4].d(3511)) {
                                            break L14;
                                          } else {
                                            ((nu) this).field_R[var4].field_g = 3;
                                            if (var7 == 0) {
                                              break L12;
                                            } else {
                                              break L14;
                                            }
                                          }
                                        }
                                      }
                                      var4++;
                                      if (var7 == 0) {
                                        continue L13;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            var3++;
                            if (var7 == 0) {
                              continue L8;
                            } else {
                              break L11;
                            }
                          }
                        }
                      }
                      stackOut_40_0 = 0;
                      stackIn_41_0 = stackOut_40_0;
                      break L10;
                    }
                    var3 = stackIn_41_0;
                    L15: while (true) {
                      L16: {
                        L17: {
                          if (var3 >= 2) {
                            break L17;
                          } else {
                            if (var7 != 0) {
                              break L16;
                            } else {
                              var4 = 1;
                              L18: while (true) {
                                L19: {
                                  L20: {
                                    if (var4 >= 5) {
                                      break L20;
                                    } else {
                                      ((nu) this).field_P[var3][var4].field_I = 0;
                                      var4++;
                                      if (var7 != 0) {
                                        break L19;
                                      } else {
                                        if (var7 == 0) {
                                          continue L18;
                                        } else {
                                          break L20;
                                        }
                                      }
                                    }
                                  }
                                  var3++;
                                  break L19;
                                }
                                if (var7 == 0) {
                                  continue L15;
                                } else {
                                  break L17;
                                }
                              }
                            }
                          }
                        }
                        ((nu) this).field_J = 0;
                        break L16;
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
        Object stackIn_30_0 = null;
        jc stackIn_31_0 = null;
        jc stackIn_33_0 = null;
        jc stackIn_35_0 = null;
        jc stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        Object stackIn_38_0 = null;
        int stackIn_44_0 = 0;
        int stackIn_44_1 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_29_0 = null;
        jc stackOut_30_0 = null;
        jc stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        jc stackOut_31_0 = null;
        jc stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        Object stackOut_37_0 = null;
        int stackOut_43_0 = 0;
        int stackOut_43_1 = 0;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        var7 = Kickabout.field_G;
        try {
          L0: {
            if (param1 <= -49) {
              L1: {
                L2: {
                  ((nu) this).field_u = param0;
                  ((nu) this).field_v = cv.field_a[((nu) this).field_u];
                  if (((nu) this).field_u != 0) {
                    break L2;
                  } else {
                    ((nu) this).field_n = new oe(((nu) this).field_R);
                    if (var7 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (((nu) this).field_u != 1) {
                  L3: {
                    if (((nu) this).field_u != 2) {
                      break L3;
                    } else {
                      ((nu) this).field_C = new wr();
                      if (var7 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (3 == ((nu) this).field_u) {
                      break L4;
                    } else {
                      if (((nu) this).field_u != 4) {
                        break L1;
                      } else {
                        L5: {
                          L6: {
                            if (((nu) this).field_q != null) {
                              var3_int = 0;
                              L7: while (true) {
                                if (~((nu) this).field_g.length >= ~var3_int) {
                                  break L6;
                                } else {
                                  stackOut_29_0 = this;
                                  stackIn_38_0 = stackOut_29_0;
                                  stackIn_30_0 = stackOut_29_0;
                                  if (var7 != 0) {
                                    break L5;
                                  } else {
                                    L8: {
                                      stackOut_30_0 = ((nu) this).field_q[var3_int];
                                      stackIn_35_0 = stackOut_30_0;
                                      stackIn_31_0 = stackOut_30_0;
                                      if (((nu) this).field_g[var3_int].field_p != 0) {
                                        stackOut_35_0 = (jc) (Object) stackIn_35_0;
                                        stackOut_35_1 = 0;
                                        stackIn_36_0 = stackOut_35_0;
                                        stackIn_36_1 = stackOut_35_1;
                                        break L8;
                                      } else {
                                        stackOut_31_0 = (jc) (Object) stackIn_31_0;
                                        stackIn_33_0 = stackOut_31_0;
                                        stackOut_33_0 = (jc) (Object) stackIn_33_0;
                                        stackOut_33_1 = 1;
                                        stackIn_36_0 = stackOut_33_0;
                                        stackIn_36_1 = stackOut_33_1;
                                        break L8;
                                      }
                                    }
                                    stackIn_36_0.field_o = stackIn_36_1 != 0;
                                    var3_int++;
                                    if (var7 == 0) {
                                      continue L7;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                              }
                            } else {
                              break L6;
                            }
                          }
                          stackOut_37_0 = this;
                          stackIn_38_0 = stackOut_37_0;
                          break L5;
                        }
                        L9: {
                          ((nu) this).field_v = ((nu) this).field_O;
                          if (0 < ((nu) this).field_v) {
                            ((nu) this).field_v = ((nu) this).field_v + 140;
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        ((nu) this).field_V = new tj();
                        ((nu) this).field_P = new nl[2][5];
                        var3_int = 0;
                        L10: while (true) {
                          stackOut_43_0 = 2;
                          stackOut_43_1 = var3_int;
                          stackIn_44_0 = stackOut_43_0;
                          stackIn_44_1 = stackOut_43_1;
                          L11: while (true) {
                            L12: {
                              L13: {
                                if (stackIn_44_0 <= stackIn_44_1) {
                                  break L13;
                                } else {
                                  if (var7 != 0) {
                                    break L12;
                                  } else {
                                    var4 = 0;
                                    L14: while (true) {
                                      L15: {
                                        if (var4 >= 5) {
                                          break L15;
                                        } else {
                                          var5 = 1;
                                          stackOut_48_0 = -1;
                                          stackOut_48_1 = ~var4;
                                          stackIn_44_0 = stackOut_48_0;
                                          stackIn_44_1 = stackOut_48_1;
                                          stackIn_49_0 = stackOut_48_0;
                                          stackIn_49_1 = stackOut_48_1;
                                          if (var7 != 0) {
                                            continue L11;
                                          } else {
                                            L16: {
                                              if (stackIn_49_0 <= stackIn_49_1) {
                                                break L16;
                                              } else {
                                                var6_int = ((nu) this).field_i[var3_int][-1 + var4];
                                                if (0 != (((nu) this).field_c & 1 << var6_int)) {
                                                  break L16;
                                                } else {
                                                  var5 = 0;
                                                  break L16;
                                                }
                                              }
                                            }
                                            L17: {
                                              var6 = null;
                                              if (var4 != 0) {
                                                var6_ref = ((nu) this).field_b[var3_int][-1 + var4];
                                                break L17;
                                              } else {
                                                var6_ref = mv.b(false);
                                                break L17;
                                              }
                                            }
                                            L18: {
                                              ((nu) this).field_P[var3_int][var4] = new nl();
                                              ((nu) this).field_P[var3_int][var4].a(var5 != 0, var6_ref, 3);
                                              if (var6_ref.a(var5 != 0, (byte) -111)) {
                                                ((nu) this).field_F[var3_int] = true;
                                                break L18;
                                              } else {
                                                break L18;
                                              }
                                            }
                                            var4++;
                                            if (var7 == 0) {
                                              continue L14;
                                            } else {
                                              break L15;
                                            }
                                          }
                                        }
                                      }
                                      var3_int++;
                                      if (var7 == 0) {
                                        continue L10;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                }
                              }
                              ((nu) this).field_V.field_l = mp.field_p[((nu) this).field_t];
                              ((nu) this).field_X = new ua();
                              this.a(1, 0);
                              this.a(2);
                              break L12;
                            }
                            if (var7 == 0) {
                              break L1;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                    }
                  }
                  ((nu) this).field_o = new wl(((nu) this).field_e, ((nu) this).field_g, ((nu) this).field_R, ((nu) this).field_i, ((nu) this).field_k, ((nu) this).field_b);
                  break L1;
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
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var3, "nu.EA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void b(int param0, ki param1) {
        RuntimeException runtimeException = null;
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
              L1: {
                if (param0 == 26214) {
                  break L1;
                } else {
                  ((nu) this).field_V = null;
                  break L1;
                }
              }
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
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) runtimeException;
            stackOut_9_1 = new StringBuilder().append("nu.E(").append(param0).append(',');
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
        boolean stackIn_14_0 = false;
        int stackIn_42_0 = 0;
        int stackIn_49_0 = 0;
        StringBuilder stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        int stackIn_52_2 = 0;
        int stackIn_52_3 = 0;
        StringBuilder stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        int stackIn_53_2 = 0;
        int stackIn_53_3 = 0;
        StringBuilder stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        StringBuilder stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        StringBuilder stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        StringBuilder stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_59_2 = null;
        StringBuilder stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        int stackIn_63_2 = 0;
        int stackIn_63_3 = 0;
        StringBuilder stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        StringBuilder stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        StringBuilder stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_67_2 = null;
        int stackIn_74_0 = 0;
        int stackIn_90_0 = 0;
        int stackIn_94_0 = 0;
        String stackIn_100_0 = null;
        boolean stackOut_13_0 = false;
        int stackOut_41_0 = 0;
        int stackOut_48_0 = 0;
        StringBuilder stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        int stackOut_51_2 = 0;
        int stackOut_51_3 = 0;
        StringBuilder stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        int stackOut_52_2 = 0;
        int stackOut_52_3 = 0;
        StringBuilder stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        StringBuilder stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        StringBuilder stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        StringBuilder stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        StringBuilder stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        int stackOut_62_2 = 0;
        int stackOut_62_3 = 0;
        StringBuilder stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        StringBuilder stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        StringBuilder stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        int stackOut_73_0 = 0;
        int stackOut_89_0 = 0;
        int stackOut_93_0 = 0;
        String stackOut_99_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = Kickabout.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var1_ref = new StringBuilder("CommonGame(players=" + ((nu) this).field_I + ",timelimit=" + ((nu) this).field_O + ") phase=" + this.c((byte) 59) + " phase_time=" + ((nu) this).field_v + "\n");
                        StringBuilder discarded$30 = var1_ref.append("\tsurface=" + ((nu) this).field_t + "\ttier=" + ((nu) this).field_m + "\twinner=" + ((nu) this).field_Z + "\tai_tick=" + ((nu) this).field_J);
                        if (!((nu) this).field_G) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        StringBuilder discarded$31 = var1_ref.append("\tbigheadmode");
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (((nu) this).field_s) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        StringBuilder discarded$32 = var1_ref.append("\tdisable_local");
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (!((nu) this).field_p) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        StringBuilder discarded$33 = var1_ref.append("\tdisable_opponent");
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        StringBuilder discarded$34 = var1_ref.append("\n");
                        var2 = 0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var2 >= ((nu) this).field_S.length) {
                            statePc = 41;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        StringBuilder discarded$35 = var1_ref.append("\t" + var2 + " [" + ((nu) this).field_g[var2].field_p + "]: " + ((nu) this).field_S[var2] + "\t" + ((nu) this).field_R[var2].field_g + " " + ((nu) this).field_R[var2].field_p + " " + ((nu) this).field_R[var2].field_l + "\t");
                        stackOut_13_0 = ((nu) this).field_R[var2].field_k;
                        stackIn_42_0 = stackOut_13_0 ? 1 : 0;
                        stackIn_14_0 = stackOut_13_0;
                        if (var6 != 0) {
                            statePc = 42;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (!stackIn_14_0) {
                            statePc = 19;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        StringBuilder discarded$36 = var1_ref.append("offer_rematch\t");
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (!((nu) this).field_R[var2].field_q) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        StringBuilder discarded$37 = var1_ref.append("offer_draw\t");
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (((nu) this).field_R[var2].field_s) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        StringBuilder discarded$38 = var1_ref.append("resigned\t");
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (!((nu) this).field_R[var2].field_v) {
                            statePc = 29;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        StringBuilder discarded$39 = var1_ref.append("departed\t");
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (((nu) this).field_R[var2].field_i) {
                            statePc = 32;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        StringBuilder discarded$40 = var1_ref.append("!loaded_pitch\t");
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (!((nu) this).field_R[var2].field_n) {
                            statePc = 35;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        StringBuilder discarded$41 = var1_ref.append("!reward\t");
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (((nu) this).field_R[var2].field_u) {
                            statePc = 39;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        StringBuilder discarded$42 = var1_ref.append("megamode\t");
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        StringBuilder discarded$43 = var1_ref.append("\n");
                        var2++;
                        if (var6 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var2 = ((nu) this).field_E.a(false);
                        stackOut_41_0 = var2;
                        stackIn_42_0 = stackOut_41_0;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (stackIn_42_0 <= 0) {
                            statePc = 46;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        StringBuilder discarded$44 = var1_ref.append("\tEnqueued moves: " + var2 + "\n");
                        var3_ref_ki = (ki) (Object) ((nu) this).field_E.g(24009);
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (null == var3_ref_ki) {
                            statePc = 46;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        StringBuilder discarded$45 = var1_ref.append("\t\t" + (Object) (Object) var3_ref_ki + "\n");
                        var3_ref_ki = (ki) (Object) ((nu) this).field_E.c(33);
                        if (var6 == 0) {
                            statePc = 44;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var3 = 0;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (var3 >= 2) {
                            statePc = 73;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        StringBuilder discarded$46 = var1_ref.append("\tteam " + var3 + ": kit=[" + ((nu) this).field_H[var3] + "," + ((nu) this).field_d[var3] + "," + ((nu) this).field_Q[var3] + "]\tslot_owner=[");
                        stackOut_48_0 = 0;
                        stackIn_74_0 = stackOut_48_0;
                        stackIn_49_0 = stackOut_48_0;
                        if (var6 != 0) {
                            statePc = 74;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var4 = stackIn_49_0;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (var4 >= 4) {
                            statePc = 60;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        stackOut_51_0 = (StringBuilder) var1_ref;
                        stackOut_51_1 = new StringBuilder().append(((nu) this).field_i[var3][var4]);
                        stackOut_51_2 = -4;
                        stackOut_51_3 = ~var4;
                        stackIn_52_0 = stackOut_51_0;
                        stackIn_52_1 = stackOut_51_1;
                        stackIn_52_2 = stackOut_51_2;
                        stackIn_52_3 = stackOut_51_3;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        stackOut_52_0 = (StringBuilder) (Object) stackIn_52_0;
                        stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
                        stackOut_52_2 = stackIn_52_2;
                        stackOut_52_3 = stackIn_52_3;
                        stackIn_63_0 = stackOut_52_0;
                        stackIn_63_1 = stackOut_52_1;
                        stackIn_63_2 = stackOut_52_2;
                        stackIn_63_3 = stackOut_52_3;
                        stackIn_53_0 = stackOut_52_0;
                        stackIn_53_1 = stackOut_52_1;
                        stackIn_53_2 = stackOut_52_2;
                        stackIn_53_3 = stackOut_52_3;
                        if (var6 != 0) {
                            statePc = 63;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        stackOut_53_0 = (StringBuilder) (Object) stackIn_53_0;
                        stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
                        stackIn_58_0 = stackOut_53_0;
                        stackIn_58_1 = stackOut_53_1;
                        stackIn_54_0 = stackOut_53_0;
                        stackIn_54_1 = stackOut_53_1;
                        if (stackIn_53_2 >= stackIn_53_3) {
                            statePc = 58;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        stackOut_54_0 = (StringBuilder) (Object) stackIn_54_0;
                        stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
                        stackIn_56_0 = stackOut_54_0;
                        stackIn_56_1 = stackOut_54_1;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        stackOut_56_0 = (StringBuilder) (Object) stackIn_56_0;
                        stackOut_56_1 = (StringBuilder) (Object) stackIn_56_1;
                        stackOut_56_2 = ",";
                        stackIn_59_0 = stackOut_56_0;
                        stackIn_59_1 = stackOut_56_1;
                        stackIn_59_2 = stackOut_56_2;
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        stackOut_58_0 = (StringBuilder) (Object) stackIn_58_0;
                        stackOut_58_1 = (StringBuilder) (Object) stackIn_58_1;
                        stackOut_58_2 = "";
                        stackIn_59_0 = stackOut_58_0;
                        stackIn_59_1 = stackOut_58_1;
                        stackIn_59_2 = stackOut_58_2;
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        StringBuilder discarded$47 = ((StringBuilder) (Object) stackIn_59_0).append(stackIn_59_2);
                        var4++;
                        if (var6 == 0) {
                            statePc = 50;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        StringBuilder discarded$48 = var1_ref.append("]\tchosen_player_ids=[");
                        var4 = 0;
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (var4 >= 4) {
                            statePc = 68;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        stackOut_62_0 = (StringBuilder) var1_ref;
                        stackOut_62_1 = new StringBuilder().append(((nu) this).field_k[var3][var4]);
                        stackOut_62_2 = var4;
                        stackOut_62_3 = 3;
                        stackIn_52_0 = stackOut_62_0;
                        stackIn_52_1 = stackOut_62_1;
                        stackIn_52_2 = stackOut_62_2;
                        stackIn_52_3 = stackOut_62_3;
                        stackIn_63_0 = stackOut_62_0;
                        stackIn_63_1 = stackOut_62_1;
                        stackIn_63_2 = stackOut_62_2;
                        stackIn_63_3 = stackOut_62_3;
                        if (var6 != 0) {
                            statePc = 52;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        stackOut_63_0 = (StringBuilder) (Object) stackIn_63_0;
                        stackOut_63_1 = (StringBuilder) (Object) stackIn_63_1;
                        stackIn_66_0 = stackOut_63_0;
                        stackIn_66_1 = stackOut_63_1;
                        stackIn_64_0 = stackOut_63_0;
                        stackIn_64_1 = stackOut_63_1;
                        if (stackIn_63_2 >= stackIn_63_3) {
                            statePc = 66;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        stackOut_64_0 = (StringBuilder) (Object) stackIn_64_0;
                        stackOut_64_1 = (StringBuilder) (Object) stackIn_64_1;
                        stackOut_64_2 = ",";
                        stackIn_67_0 = stackOut_64_0;
                        stackIn_67_1 = stackOut_64_1;
                        stackIn_67_2 = stackOut_64_2;
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        stackOut_66_0 = (StringBuilder) (Object) stackIn_66_0;
                        stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
                        stackOut_66_2 = "";
                        stackIn_67_0 = stackOut_66_0;
                        stackIn_67_1 = stackOut_66_1;
                        stackIn_67_2 = stackOut_66_2;
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        StringBuilder discarded$49 = ((StringBuilder) (Object) stackIn_67_0).append(stackIn_67_2);
                        var4++;
                        if (var6 == 0) {
                            statePc = 61;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        StringBuilder discarded$50 = var1_ref.append("]\tformation=" + ((nu) this).field_r[var3]);
                        if (((nu) this).field_F[var3]) {
                            statePc = 71;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        StringBuilder discarded$51 = var1_ref.append("\tteam_immunity");
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        StringBuilder discarded$52 = var1_ref.append("\n");
                        var3++;
                        if (var6 == 0) {
                            statePc = 47;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        stackOut_73_0 = -1;
                        stackIn_74_0 = stackOut_73_0;
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if (stackIn_74_0 != ~((nu) this).field_u) {
                            statePc = 77;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        StringBuilder discarded$53 = var1_ref.append("\t" + (Object) (Object) ((nu) this).field_n);
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        if (((nu) this).field_u == 2) {
                            statePc = 80;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        StringBuilder discarded$54 = var1_ref.append("\t" + (Object) (Object) ((nu) this).field_C);
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        if (((nu) this).field_u == 3) {
                            statePc = 84;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        StringBuilder discarded$55 = var1_ref.append("\t" + (Object) (Object) ((nu) this).field_o);
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        if (((nu) this).field_u == 4) {
                            statePc = 88;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        StringBuilder discarded$56 = var1_ref.append("\n\t" + (Object) (Object) ((nu) this).field_X);
                        StringBuilder discarded$57 = var1_ref.append("\n\t" + (Object) (Object) ((nu) this).field_V);
                        var3 = 0;
                        statePc = 89;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        stackOut_89_0 = 2;
                        stackIn_90_0 = stackOut_89_0;
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        if (stackIn_90_0 <= var3) {
                            statePc = 99;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        var4 = 0;
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        if (var4 >= 5) {
                            statePc = 98;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        StringBuilder discarded$58 = var1_ref.append("\n\t" + var3 + "." + var4 + " " + (Object) (Object) ((nu) this).field_P[var3][var4]);
                        var5 = ((nu) this).a((byte) 6, var3, var4);
                        stackOut_93_0 = ~var5;
                        stackIn_90_0 = stackOut_93_0;
                        stackIn_94_0 = stackOut_93_0;
                        if (var6 != 0) {
                            statePc = 90;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        if (stackIn_94_0 != 0) {
                            statePc = 96;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        StringBuilder discarded$59 = var1_ref.append("\n\t\tCTRL=\t" + ((nu) this).field_S[var5]);
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        var4++;
                        if (var6 == 0) {
                            statePc = 92;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        var3++;
                        if (var6 == 0) {
                            statePc = 89;
                        } else {
                            statePc = 99;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        stackOut_99_0 = var1_ref.toString();
                        stackIn_100_0 = stackOut_99_0;
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 100: {
                    return stackIn_100_0;
                }
                case 101: {
                    var1 = (RuntimeException) (Object) caughtException;
                    throw nb.a((Throwable) (Object) var1, "nu.toString()");
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(ml param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_29_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_68_1 = 0;
        int stackIn_85_0 = 0;
        int stackIn_85_1 = 0;
        int stackIn_111_0 = 0;
        int stackIn_120_0 = 0;
        RuntimeException stackIn_136_0 = null;
        StringBuilder stackIn_136_1 = null;
        RuntimeException stackIn_138_0 = null;
        StringBuilder stackIn_138_1 = null;
        RuntimeException stackIn_139_0 = null;
        StringBuilder stackIn_139_1 = null;
        String stackIn_139_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_28_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_67_1 = 0;
        int stackOut_84_0 = 0;
        int stackOut_84_1 = 0;
        int stackOut_110_0 = 0;
        int stackOut_119_0 = 0;
        RuntimeException stackOut_135_0 = null;
        StringBuilder stackOut_135_1 = null;
        RuntimeException stackOut_138_0 = null;
        StringBuilder stackOut_138_1 = null;
        String stackOut_138_2 = null;
        RuntimeException stackOut_136_0 = null;
        StringBuilder stackOut_136_1 = null;
        String stackOut_136_2 = null;
        var7 = Kickabout.field_G;
        try {
          L0: {
            param0.p(param2 ^ -118);
            var4_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var4_int >= ((nu) this).field_I) {
                    break L3;
                  } else {
                    ((nu) this).field_g[var4_int].field_h = param0.l(16, 59);
                    ((nu) this).field_g[var4_int].field_f = param0.l(3, 59);
                    var4_int++;
                    if (var7 != 0) {
                      break L2;
                    } else {
                      if (var7 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                ((nu) this).field_u = param0.l(3, param2 ^ 58);
                break L2;
              }
              L4: {
                if (((nu) this).field_u <= 0) {
                  break L4;
                } else {
                  var4_int = 0;
                  L5: while (true) {
                    L6: {
                      L7: {
                        if (var4_int >= ((nu) this).field_I) {
                          break L7;
                        } else {
                          ((nu) this).field_g[var4_int].field_p = param0.l(1, 59);
                          var4_int++;
                          if (var7 != 0) {
                            break L6;
                          } else {
                            if (var7 == 0) {
                              continue L5;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                      var4_int = 0;
                      break L6;
                    }
                    L8: while (true) {
                      L9: {
                        L10: {
                          if (var4_int >= 2) {
                            break L10;
                          } else {
                            ((nu) this).field_H[var4_int] = param0.l(5, 59);
                            ((nu) this).field_d[var4_int] = param0.l(5, param2 + 58);
                            ((nu) this).field_Q[var4_int] = param0.l(5, 59);
                            var4_int++;
                            if (var7 != 0) {
                              break L9;
                            } else {
                              if (var7 == 0) {
                                continue L8;
                              } else {
                                break L10;
                              }
                            }
                          }
                        }
                        ((nu) this).field_t = param0.l(2, 59);
                        break L9;
                      }
                      ((nu) this).field_m = param0.l(2, 59);
                      break L4;
                    }
                  }
                }
              }
              L11: {
                L12: {
                  if (2 >= ((nu) this).field_u) {
                    break L12;
                  } else {
                    var4_int = 0;
                    L13: while (true) {
                      if (var4_int >= 2) {
                        break L12;
                      } else {
                        ((nu) this).field_r[var4_int] = param0.l(3, 59);
                        stackOut_28_0 = 0;
                        stackIn_38_0 = stackOut_28_0;
                        stackIn_29_0 = stackOut_28_0;
                        if (var7 != 0) {
                          break L11;
                        } else {
                          var5 = stackIn_29_0;
                          L14: while (true) {
                            L15: {
                              L16: {
                                if (4 <= var5) {
                                  break L16;
                                } else {
                                  ((nu) this).field_i[var4_int][var5] = param0.l(3, ek.b(param2, 58));
                                  var5++;
                                  if (var7 != 0) {
                                    break L15;
                                  } else {
                                    if (var7 == 0) {
                                      continue L14;
                                    } else {
                                      break L16;
                                    }
                                  }
                                }
                              }
                              var4_int++;
                              break L15;
                            }
                            if (var7 == 0) {
                              continue L13;
                            } else {
                              break L12;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                stackOut_37_0 = 3;
                stackIn_38_0 = stackOut_37_0;
                break L11;
              }
              L17: {
                L18: {
                  if (stackIn_38_0 >= ((nu) this).field_u) {
                    break L18;
                  } else {
                    var4_int = 0;
                    L19: while (true) {
                      L20: {
                        L21: {
                          if (var4_int >= 2) {
                            break L21;
                          } else {
                            stackOut_41_0 = 0;
                            stackIn_51_0 = stackOut_41_0;
                            stackIn_42_0 = stackOut_41_0;
                            if (var7 != 0) {
                              break L20;
                            } else {
                              var5 = stackIn_42_0;
                              L22: while (true) {
                                L23: {
                                  L24: {
                                    if (var5 >= 4) {
                                      break L24;
                                    } else {
                                      ((nu) this).field_k[var4_int][var5] = param0.l(4, 59) + -1;
                                      var5++;
                                      if (var7 != 0) {
                                        break L23;
                                      } else {
                                        if (var7 == 0) {
                                          continue L22;
                                        } else {
                                          break L24;
                                        }
                                      }
                                    }
                                  }
                                  var4_int++;
                                  break L23;
                                }
                                if (var7 == 0) {
                                  continue L19;
                                } else {
                                  break L21;
                                }
                              }
                            }
                          }
                        }
                        param0.l((byte) 121);
                        stackOut_50_0 = 0;
                        stackIn_51_0 = stackOut_50_0;
                        break L20;
                      }
                      var4_int = stackIn_51_0;
                      L25: while (true) {
                        L26: {
                          if (var4_int >= 2) {
                            break L26;
                          } else {
                            stackOut_53_0 = 0;
                            stackIn_64_0 = stackOut_53_0;
                            stackIn_54_0 = stackOut_53_0;
                            if (var7 != 0) {
                              break L17;
                            } else {
                              var5 = stackIn_54_0;
                              L27: while (true) {
                                L28: {
                                  L29: {
                                    if (var5 >= 4) {
                                      break L29;
                                    } else {
                                      ((nu) this).field_b[var4_int][var5].a(param2 ^ 46, (iw) (Object) param0);
                                      var5++;
                                      if (var7 != 0) {
                                        break L28;
                                      } else {
                                        if (var7 == 0) {
                                          continue L27;
                                        } else {
                                          break L29;
                                        }
                                      }
                                    }
                                  }
                                  var4_int++;
                                  break L28;
                                }
                                if (var7 == 0) {
                                  continue L25;
                                } else {
                                  break L26;
                                }
                              }
                            }
                          }
                        }
                        param0.p(-116);
                        break L18;
                      }
                    }
                  }
                }
                stackOut_63_0 = 5;
                stackIn_64_0 = stackOut_63_0;
                break L17;
              }
              L30: {
                L31: {
                  if (stackIn_64_0 > ((nu) this).field_u) {
                    break L31;
                  } else {
                    ((nu) this).field_Z = param0.l(3, 59) + -3;
                    var4_int = 0;
                    L32: while (true) {
                      if (~((nu) this).field_I >= ~var4_int) {
                        break L31;
                      } else {
                        ((nu) this).field_g[var4_int].field_l = mu.a(param0, (byte) -39);
                        ((nu) this).field_g[var4_int].field_i = mu.a(param0, (byte) -39);
                        stackOut_67_0 = var4_int;
                        stackOut_67_1 = param1;
                        stackIn_85_0 = stackOut_67_0;
                        stackIn_85_1 = stackOut_67_1;
                        stackIn_68_0 = stackOut_67_0;
                        stackIn_68_1 = stackOut_67_1;
                        if (var7 != 0) {
                          break L30;
                        } else {
                          L33: {
                            L34: {
                              if (stackIn_68_0 != stackIn_68_1) {
                                break L34;
                              } else {
                                L35: {
                                  var5 = param0.l(1, 59);
                                  if (var5 != 1) {
                                    break L35;
                                  } else {
                                    break L35;
                                  }
                                }
                                L36: {
                                  int discarded$1 = param0.l(7, 59);
                                  ((nu) this).field_g[var4_int].field_g = param0.l(15, 59);
                                  var5 = param0.l(1, 59);
                                  ((nu) this).field_g[var4_int].field_k = param0.l(6, 59);
                                  if (var5 == 1) {
                                    ((nu) this).field_g[var4_int].field_k = -((nu) this).field_g[var4_int].field_k;
                                    break L36;
                                  } else {
                                    break L36;
                                  }
                                }
                                var6 = 0;
                                L37: while (true) {
                                  if (~var6 <= ~((nu) this).field_g[var4_int].field_o.length) {
                                    break L34;
                                  } else {
                                    ((nu) this).field_g[var4_int].field_o[var6] = param0.l(8, 59);
                                    var6++;
                                    if (var7 != 0) {
                                      break L33;
                                    } else {
                                      if (var7 == 0) {
                                        continue L37;
                                      } else {
                                        break L34;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            var4_int++;
                            break L33;
                          }
                          if (var7 == 0) {
                            continue L32;
                          } else {
                            break L31;
                          }
                        }
                      }
                    }
                  }
                }
                ((nu) this).a(((nu) this).field_u, (byte) -124);
                stackOut_84_0 = param2;
                stackOut_84_1 = 1;
                stackIn_85_0 = stackOut_84_0;
                stackIn_85_1 = stackOut_84_1;
                break L30;
              }
              if (stackIn_85_0 == stackIn_85_1) {
                ((nu) this).field_v = -1 + sk.a(19881, 8, 0, 4, param0, 16);
                var4_int = 0;
                L38: while (true) {
                  L39: {
                    L40: {
                      L41: {
                        if (var4_int >= ((nu) this).field_I) {
                          break L41;
                        } else {
                          ((nu) this).field_R[var4_int].b(param0, 4);
                          ((nu) this).field_R[var4_int].c(param0, param2);
                          var4_int++;
                          if (var7 != 0) {
                            break L40;
                          } else {
                            if (var7 == 0) {
                              continue L38;
                            } else {
                              break L41;
                            }
                          }
                        }
                      }
                      if (((nu) this).field_u == 0) {
                        ((nu) this).field_n.b(param0, 4);
                        break L40;
                      } else {
                        break L39;
                      }
                    }
                    ((nu) this).field_n.a(74, param0);
                    break L39;
                  }
                  L42: {
                    if (((nu) this).field_u == 2) {
                      ((nu) this).field_C.b(param0, 4);
                      ((nu) this).field_C.c(param0, 2);
                      break L42;
                    } else {
                      break L42;
                    }
                  }
                  L43: {
                    if (3 != ((nu) this).field_u) {
                      break L43;
                    } else {
                      ((nu) this).field_o.b(param0, 4);
                      ((nu) this).field_o.a(param0, false);
                      break L43;
                    }
                  }
                  L44: {
                    if (((nu) this).field_u == 4) {
                      ((nu) this).field_V.b(param0, 4);
                      var4_int = 0;
                      L45: while (true) {
                        L46: {
                          L47: {
                            if (var4_int >= 2) {
                              break L47;
                            } else {
                              stackOut_110_0 = 0;
                              stackIn_120_0 = stackOut_110_0;
                              stackIn_111_0 = stackOut_110_0;
                              if (var7 != 0) {
                                break L46;
                              } else {
                                var5 = stackIn_111_0;
                                L48: while (true) {
                                  L49: {
                                    L50: {
                                      if (var5 >= 5) {
                                        break L50;
                                      } else {
                                        ((nu) this).field_P[var4_int][var5].b(param0, 4);
                                        var5++;
                                        if (var7 != 0) {
                                          break L49;
                                        } else {
                                          if (var7 == 0) {
                                            continue L48;
                                          } else {
                                            break L50;
                                          }
                                        }
                                      }
                                    }
                                    var4_int++;
                                    break L49;
                                  }
                                  if (var7 == 0) {
                                    continue L45;
                                  } else {
                                    break L47;
                                  }
                                }
                              }
                            }
                          }
                          ((nu) this).field_X.b(param0, param2 ^ 5);
                          stackOut_119_0 = 0;
                          stackIn_120_0 = stackOut_119_0;
                          break L46;
                        }
                        var4_int = stackIn_120_0;
                        L51: while (true) {
                          L52: {
                            L53: {
                              if (var4_int >= 2) {
                                break L53;
                              } else {
                                if (var7 != 0) {
                                  break L52;
                                } else {
                                  var5 = 0;
                                  L54: while (true) {
                                    L55: {
                                      L56: {
                                        if (var5 >= 5) {
                                          break L56;
                                        } else {
                                          ((nu) this).field_P[var4_int][var5].a(param2 + -13919, param0);
                                          var5++;
                                          if (var7 != 0) {
                                            break L55;
                                          } else {
                                            if (var7 == 0) {
                                              continue L54;
                                            } else {
                                              break L56;
                                            }
                                          }
                                        }
                                      }
                                      var4_int++;
                                      break L55;
                                    }
                                    if (var7 == 0) {
                                      continue L51;
                                    } else {
                                      break L53;
                                    }
                                  }
                                }
                              }
                            }
                            ((nu) this).field_V.a(param0, (byte) -124);
                            ((nu) this).field_X.a(param0, (byte) -84);
                            ((nu) this).field_J = param0.l(8, 59);
                            break L52;
                          }
                          ((nu) this).field_G = mu.a(param0, (byte) -39);
                          break L44;
                        }
                      }
                    } else {
                      break L44;
                    }
                  }
                  param0.l((byte) 95);
                  break L0;
                }
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L57: {
            var4 = decompiledCaughtException;
            stackOut_135_0 = (RuntimeException) var4;
            stackOut_135_1 = new StringBuilder().append("nu.P(");
            stackIn_138_0 = stackOut_135_0;
            stackIn_138_1 = stackOut_135_1;
            stackIn_136_0 = stackOut_135_0;
            stackIn_136_1 = stackOut_135_1;
            if (param0 == null) {
              stackOut_138_0 = (RuntimeException) (Object) stackIn_138_0;
              stackOut_138_1 = (StringBuilder) (Object) stackIn_138_1;
              stackOut_138_2 = "null";
              stackIn_139_0 = stackOut_138_0;
              stackIn_139_1 = stackOut_138_1;
              stackIn_139_2 = stackOut_138_2;
              break L57;
            } else {
              stackOut_136_0 = (RuntimeException) (Object) stackIn_136_0;
              stackOut_136_1 = (StringBuilder) (Object) stackIn_136_1;
              stackOut_136_2 = "{...}";
              stackIn_139_0 = stackOut_136_0;
              stackIn_139_1 = stackOut_136_1;
              stackIn_139_2 = stackOut_136_2;
              break L57;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_139_0, stackIn_139_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    nu(String[] param0, int param1, int param2, boolean param3, boolean param4, boolean param5, boolean param6, boolean param7, boolean param8) {
        RuntimeException var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        Object stackIn_4_0 = null;
        it[] stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        it stackIn_5_2 = null;
        it stackIn_5_3 = null;
        int stackIn_5_4 = 0;
        it[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        it stackIn_7_2 = null;
        it stackIn_7_3 = null;
        int stackIn_7_4 = 0;
        it[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        it stackIn_9_2 = null;
        it stackIn_9_3 = null;
        int stackIn_9_4 = 0;
        it[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        it stackIn_10_2 = null;
        it stackIn_10_3 = null;
        int stackIn_10_4 = 0;
        int stackIn_10_5 = 0;
        Object stackIn_12_0 = null;
        int stackIn_15_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        it[] stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        it stackOut_4_2 = null;
        it stackOut_4_3 = null;
        int stackOut_4_4 = 0;
        it[] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        it stackOut_9_2 = null;
        it stackOut_9_3 = null;
        int stackOut_9_4 = 0;
        int stackOut_9_5 = 0;
        it[] stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        it stackOut_5_2 = null;
        it stackOut_5_3 = null;
        int stackOut_5_4 = 0;
        it[] stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        it stackOut_7_2 = null;
        it stackOut_7_3 = null;
        int stackOut_7_4 = 0;
        int stackOut_7_5 = 0;
        Object stackOut_11_0 = null;
        int stackOut_14_0 = 0;
        int stackOut_23_0 = 0;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
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
              L2: {
                L3: {
                  if (var10_int >= ((nu) this).field_I) {
                    break L3;
                  } else {
                    stackOut_3_0 = this;
                    stackIn_12_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var12 != 0) {
                      break L2;
                    } else {
                      L4: {
                        stackOut_4_0 = ((nu) this).field_g;
                        stackOut_4_1 = var10_int;
                        stackOut_4_2 = null;
                        stackOut_4_3 = null;
                        stackOut_4_4 = var10_int;
                        stackIn_9_0 = stackOut_4_0;
                        stackIn_9_1 = stackOut_4_1;
                        stackIn_9_2 = stackOut_4_2;
                        stackIn_9_3 = stackOut_4_3;
                        stackIn_9_4 = stackOut_4_4;
                        stackIn_5_0 = stackOut_4_0;
                        stackIn_5_1 = stackOut_4_1;
                        stackIn_5_2 = stackOut_4_2;
                        stackIn_5_3 = stackOut_4_3;
                        stackIn_5_4 = stackOut_4_4;
                        if (1 != qj.b(((nu) this).field_c >> var10_int, 1)) {
                          stackOut_9_0 = (it[]) (Object) stackIn_9_0;
                          stackOut_9_1 = stackIn_9_1;
                          stackOut_9_2 = null;
                          stackOut_9_3 = null;
                          stackOut_9_4 = stackIn_9_4;
                          stackOut_9_5 = 0;
                          stackIn_10_0 = stackOut_9_0;
                          stackIn_10_1 = stackOut_9_1;
                          stackIn_10_2 = stackOut_9_2;
                          stackIn_10_3 = stackOut_9_3;
                          stackIn_10_4 = stackOut_9_4;
                          stackIn_10_5 = stackOut_9_5;
                          break L4;
                        } else {
                          stackOut_5_0 = (it[]) (Object) stackIn_5_0;
                          stackOut_5_1 = stackIn_5_1;
                          stackOut_5_2 = null;
                          stackOut_5_3 = null;
                          stackOut_5_4 = stackIn_5_4;
                          stackIn_7_0 = stackOut_5_0;
                          stackIn_7_1 = stackOut_5_1;
                          stackIn_7_2 = stackOut_5_2;
                          stackIn_7_3 = stackOut_5_3;
                          stackIn_7_4 = stackOut_5_4;
                          stackOut_7_0 = (it[]) (Object) stackIn_7_0;
                          stackOut_7_1 = stackIn_7_1;
                          stackOut_7_2 = null;
                          stackOut_7_3 = null;
                          stackOut_7_4 = stackIn_7_4;
                          stackOut_7_5 = 1;
                          stackIn_10_0 = stackOut_7_0;
                          stackIn_10_1 = stackOut_7_1;
                          stackIn_10_2 = stackOut_7_2;
                          stackIn_10_3 = stackOut_7_3;
                          stackIn_10_4 = stackOut_7_4;
                          stackIn_10_5 = stackOut_7_5;
                          break L4;
                        }
                      }
                      stackIn_10_0[stackIn_10_1] = new it(stackIn_10_4, stackIn_10_5 != 0);
                      ((nu) this).field_R[var10_int] = new gt();
                      var10_int++;
                      if (var12 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                ((nu) this).field_r = new int[2];
                ((nu) this).field_b = new up[2][4];
                ((nu) this).field_k = new int[2][4];
                stackOut_11_0 = this;
                stackIn_12_0 = stackOut_11_0;
                break L2;
              }
              ((nu) this).field_i = new int[2][4];
              var10_int = 0;
              L5: while (true) {
                L6: {
                  L7: {
                    if (var10_int >= 2) {
                      break L7;
                    } else {
                      stackOut_14_0 = 0;
                      stackIn_24_0 = stackOut_14_0;
                      stackIn_15_0 = stackOut_14_0;
                      if (var12 != 0) {
                        break L6;
                      } else {
                        var11 = stackIn_15_0;
                        L8: while (true) {
                          L9: {
                            L10: {
                              if (var11 >= 4) {
                                break L10;
                              } else {
                                ((nu) this).field_b[var10_int][var11] = new up();
                                ((nu) this).field_k[var10_int][var11] = -1;
                                var11++;
                                if (var12 != 0) {
                                  break L9;
                                } else {
                                  if (var12 == 0) {
                                    continue L8;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                            }
                            var10_int++;
                            break L9;
                          }
                          if (var12 == 0) {
                            continue L5;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                  }
                  ((nu) this).field_d = new int[2];
                  ((nu) this).field_H = new int[2];
                  ((nu) this).field_F = new boolean[2];
                  ((nu) this).field_Q = new int[2];
                  ((nu) this).field_N = new ch();
                  ((nu) this).field_ab = new p(((nu) this).field_I);
                  ((nu) this).field_q = new jc[((nu) this).field_I];
                  stackOut_23_0 = 0;
                  stackIn_24_0 = stackOut_23_0;
                  break L6;
                }
                var10_int = stackIn_24_0;
                L11: while (true) {
                  L12: {
                    L13: {
                      if (~((nu) this).field_I >= ~var10_int) {
                        break L13;
                      } else {
                        ((nu) this).field_q[var10_int] = new jc();
                        var10_int++;
                        if (var12 != 0) {
                          break L12;
                        } else {
                          if (var12 == 0) {
                            continue L11;
                          } else {
                            break L13;
                          }
                        }
                      }
                    }
                    break L12;
                  }
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var10 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var10;
            stackOut_31_1 = new StringBuilder().append("nu.<init>(");
            stackIn_34_0 = stackOut_31_0;
            stackIn_34_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param0 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L14;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_35_0 = stackOut_32_0;
              stackIn_35_1 = stackOut_32_1;
              stackIn_35_2 = stackOut_32_2;
              break L14;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
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
