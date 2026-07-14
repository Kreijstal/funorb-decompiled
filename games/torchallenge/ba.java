/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ba {
    static ka[] field_d;
    static String[] field_c;
    static sl field_a;
    static ka[] field_b;
    static boolean[][][] field_e;
    static int[][] field_j;
    static int[] field_g;
    static int[][] field_f;
    static int[] field_h;
    static ra field_i;

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ka[] var11 = null;
        ka var12 = null;
        int var13 = 0;
        var13 = TorChallenge.field_F ? 1 : 0;
        if (lg.field_d[param0][18] < 0) {
          return;
        } else {
          var5 = ic.field_B[param0][0];
          if (0 <= var5) {
            L0: {
              var6 = ic.field_B[param0][2];
              var7 = ic.field_B[param0][3];
              var8 = ic.field_B[param0][4];
              var9 = ic.field_B[param0][5];
              var10 = -1 + -var9;
              if (param2 <= -1) {
                break L0;
              } else {
                if (-1 < param1) {
                  break L0;
                } else {
                  return;
                }
              }
            }
            if (0 < param2) {
              if (param1 >= param4) {
                return;
              } else {
                L1: {
                  if (param3 <= -108) {
                    break L1;
                  } else {
                    field_h = null;
                    break L1;
                  }
                }
                L2: {
                  L3: {
                    if ((param2 ^ -1) > -1) {
                      break L3;
                    } else {
                      if ((param2 ^ -1) < -1) {
                        break L3;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (param1 >= -1) {
                    break L2;
                  } else {
                    if (param4 <= param1) {
                      break L2;
                    } else {
                      if (-1 > param2) {
                        var7 = (var7 + -var10) * param1 / param4 + var10;
                        break L2;
                      } else {
                        var7 = var7 + param1 * (var10 - var7) / param4;
                        break L2;
                      }
                    }
                  }
                }
                L4: {
                  L5: {
                    var11 = ui.field_i;
                    hd.a(var11, var9, var8, (byte) 102, var7, var6);
                    var12 = ph.field_o[var5];
                    var7 = ic.field_B[param0][7];
                    var6 = ic.field_B[param0][6];
                    var10 = -ic.field_B[param0][3] + var10 - -var7;
                    if (param2 < 0) {
                      break L5;
                    } else {
                      if (param2 > 0) {
                        break L5;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (param1 <= 0) {
                    break L4;
                  } else {
                    if (param4 > param1) {
                      if ((param2 ^ -1) <= -1) {
                        var7 = var7 + (-var7 + var10) * param1 / param4;
                        break L4;
                      } else {
                        var7 = var10 - -(param1 * (-var10 + var7) / param4);
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                }
                L6: {
                  var12.g(var6, var7);
                  if (0 == param0) {
                    var6 = ic.field_B[0][8];
                    var7 = ic.field_B[0][9];
                    ri.field_j.g(var6, var7);
                    var7 = ic.field_B[0][11];
                    var6 = ic.field_B[0][10];
                    ri.field_j.g(var6, var7);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                return;
              }
            } else {
              L7: {
                if (param3 <= -108) {
                  break L7;
                } else {
                  field_h = null;
                  break L7;
                }
              }
              L8: {
                L9: {
                  if ((param2 ^ -1) > -1) {
                    break L9;
                  } else {
                    if ((param2 ^ -1) < -1) {
                      break L9;
                    } else {
                      break L8;
                    }
                  }
                }
                if (param1 >= -1) {
                  break L8;
                } else {
                  if (param4 <= param1) {
                    break L8;
                  } else {
                    if (-1 > param2) {
                      var7 = (var7 + -var10) * param1 / param4 + var10;
                      break L8;
                    } else {
                      var7 = var7 + param1 * (var10 - var7) / param4;
                      break L8;
                    }
                  }
                }
              }
              L10: {
                L11: {
                  var11 = ui.field_i;
                  hd.a(var11, var9, var8, (byte) 102, var7, var6);
                  var12 = ph.field_o[var5];
                  var7 = ic.field_B[param0][7];
                  var6 = ic.field_B[param0][6];
                  var10 = -ic.field_B[param0][3] + var10 - -var7;
                  if (param2 < 0) {
                    break L11;
                  } else {
                    if (param2 > 0) {
                      break L11;
                    } else {
                      break L10;
                    }
                  }
                }
                if (param1 <= 0) {
                  break L10;
                } else {
                  if (param4 > param1) {
                    if ((param2 ^ -1) <= -1) {
                      var7 = var7 + (-var7 + var10) * param1 / param4;
                      break L10;
                    } else {
                      var7 = var10 - -(param1 * (-var10 + var7) / param4);
                      break L10;
                    }
                  } else {
                    break L10;
                  }
                }
              }
              L12: {
                var12.g(var6, var7);
                if (0 == param0) {
                  var6 = ic.field_B[0][8];
                  var7 = ic.field_B[0][9];
                  ri.field_j.g(var6, var7);
                  var7 = ic.field_B[0][11];
                  var6 = ic.field_B[0][10];
                  ri.field_j.g(var6, var7);
                  break L12;
                } else {
                  break L12;
                }
              }
              return;
            }
          } else {
            return;
          }
        }
    }

    public static void a(byte param0) {
        field_g = null;
        field_e = null;
        field_d = null;
        field_i = null;
        field_j = null;
        if (param0 != -5) {
            field_g = null;
        }
        field_b = null;
        field_h = null;
        field_c = null;
        field_f = null;
        field_a = null;
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    final static void b(byte param0) {
        if (param0 != -44) {
            field_h = null;
        }
        na.field_e = false;
        int discarded$0 = id.field_b.j(-117);
    }

    final static void a(byte[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        uf var16 = null;
        uf var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_39_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_38_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_40_1 = 0;
        int stackOut_39_0 = 0;
        int stackOut_39_1 = 0;
        int stackOut_51_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
        int stackOut_52_0 = 0;
        int stackOut_52_1 = 0;
        var15 = TorChallenge.field_F ? 1 : 0;
        var16 = new uf(param0);
        var17 = var16;
        var17.field_q = param0.length - 2;
        vl.field_b = var17.c(false);
        ug.field_e = new int[vl.field_b];
        vd.field_c = new boolean[vl.field_b];
        gf.field_t = new byte[vl.field_b][];
        h.field_a = new byte[vl.field_b][];
        lg.field_e = new int[vl.field_b];
        pg.field_r = new int[vl.field_b];
        dd.field_t = new int[vl.field_b];
        var17.field_q = param0.length - 7 + -(8 * vl.field_b);
        ij.field_B = var17.c(false);
        le.field_g = var17.c(false);
        var3 = 1 + (255 & var17.j(-94));
        var4 = 0;
        L0: while (true) {
          L1: {
            if (vl.field_b <= var4) {
              break L1;
            } else {
              ug.field_e[var4] = var16.c(false);
              var4++;
              if (0 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          var4 = param1;
          L2: while (true) {
            L3: {
              if (var4 >= vl.field_b) {
                break L3;
              } else {
                dd.field_t[var4] = var16.c(false);
                var4++;
                if (0 == 0) {
                  continue L2;
                } else {
                  break L3;
                }
              }
            }
            var4 = 0;
            L4: while (true) {
              L5: {
                if (var4 >= vl.field_b) {
                  break L5;
                } else {
                  pg.field_r[var4] = var16.c(false);
                  var4++;
                  if (0 == 0) {
                    continue L4;
                  } else {
                    break L5;
                  }
                }
              }
              var4 = 0;
              L6: while (true) {
                L7: {
                  if (var4 >= vl.field_b) {
                    break L7;
                  } else {
                    lg.field_e[var4] = var16.c(false);
                    var4++;
                    if (0 == 0) {
                      continue L6;
                    } else {
                      break L7;
                    }
                  }
                }
                var17.field_q = -(var3 * 3) - -3 + (-(8 * vl.field_b) + param0.length + -7);
                td.field_m = new int[var3];
                var4 = 1;
                L8: while (true) {
                  L9: {
                    if (var4 >= var3) {
                      break L9;
                    } else {
                      L10: {
                        td.field_m[var4] = var16.g(0);
                        if (0 != td.field_m[var4]) {
                          break L10;
                        } else {
                          td.field_m[var4] = 1;
                          break L10;
                        }
                      }
                      var4++;
                      if (0 == 0) {
                        continue L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  var17.field_q = 0;
                  var4 = 0;
                  L11: while (true) {
                    L12: {
                      if (var4 >= vl.field_b) {
                        break L12;
                      } else {
                        var5 = pg.field_r[var4];
                        var6 = lg.field_e[var4];
                        var7 = var6 * var5;
                        var24 = new byte[var7];
                        var22 = var24;
                        var20 = var22;
                        var18 = var20;
                        var8 = var18;
                        h.field_a[var4] = var24;
                        var25 = new byte[var7];
                        var23 = var25;
                        var21 = var23;
                        var19 = var21;
                        var9 = var19;
                        gf.field_t[var4] = var25;
                        var10 = 0;
                        var11 = var17.j(-91);
                        stackOut_23_0 = 0;
                        stackOut_23_1 = var11 & 1;
                        stackIn_25_0 = stackOut_23_0;
                        stackIn_25_1 = stackOut_23_1;
                        L13: {
                          L14: {
                            if (stackIn_25_0 == stackIn_25_1) {
                              break L14;
                            } else {
                              var12 = 0;
                              L15: while (true) {
                                L16: {
                                  if (var12 >= var5) {
                                    break L16;
                                  } else {
                                    var13 = 0;
                                    L17: while (true) {
                                      L18: {
                                        if (var6 <= var13) {
                                          break L18;
                                        } else {
                                          var8[var12 - -(var13 * var5)] = var16.d((byte) 114);
                                          var13++;
                                          if (0 == 0) {
                                            continue L17;
                                          } else {
                                            break L18;
                                          }
                                        }
                                      }
                                      var12++;
                                      if (0 == 0) {
                                        continue L15;
                                      } else {
                                        break L16;
                                      }
                                    }
                                  }
                                }
                                if ((var11 & 2) == 0) {
                                  break L13;
                                } else {
                                  var12 = 0;
                                  L19: while (true) {
                                    L20: {
                                      if (var12 >= var5) {
                                        break L20;
                                      } else {
                                        var13 = 0;
                                        L21: while (true) {
                                          L22: {
                                            if (var6 <= var13) {
                                              break L22;
                                            } else {
                                              L23: {
                                                var9[var12 + var13 * var5] = var16.d((byte) 98);
                                                var14 = var16.d((byte) 98);
                                                stackOut_38_0 = var10;
                                                stackIn_40_0 = stackOut_38_0;
                                                stackIn_39_0 = stackOut_38_0;
                                                if ((var14 ^ -1) == 0) {
                                                  stackOut_40_0 = stackIn_40_0;
                                                  stackOut_40_1 = 0;
                                                  stackIn_41_0 = stackOut_40_0;
                                                  stackIn_41_1 = stackOut_40_1;
                                                  break L23;
                                                } else {
                                                  stackOut_39_0 = stackIn_39_0;
                                                  stackOut_39_1 = 1;
                                                  stackIn_41_0 = stackOut_39_0;
                                                  stackIn_41_1 = stackOut_39_1;
                                                  break L23;
                                                }
                                              }
                                              var10 = stackIn_41_0 | stackIn_41_1;
                                              var13++;
                                              if (0 == 0) {
                                                continue L21;
                                              } else {
                                                break L22;
                                              }
                                            }
                                          }
                                          var12++;
                                          if (0 == 0) {
                                            continue L19;
                                          } else {
                                            break L20;
                                          }
                                        }
                                      }
                                    }
                                    if (0 == 0) {
                                      break L13;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var12 = 0;
                          L24: while (true) {
                            L25: {
                              if (var7 <= var12) {
                                break L25;
                              } else {
                                var8[var12] = var16.d((byte) 90);
                                var12++;
                                if (0 == 0) {
                                  continue L24;
                                } else {
                                  break L25;
                                }
                              }
                            }
                            if ((var11 & 2) == 0) {
                              break L13;
                            } else {
                              var12 = 0;
                              L26: while (true) {
                                if (var12 >= var7) {
                                  break L13;
                                } else {
                                  L27: {
                                    var9[var12] = var16.d((byte) 102);
                                    var13 = var16.d((byte) 102);
                                    stackOut_51_0 = var10;
                                    stackIn_53_0 = stackOut_51_0;
                                    stackIn_52_0 = stackOut_51_0;
                                    if (0 == (var13 ^ -1)) {
                                      stackOut_53_0 = stackIn_53_0;
                                      stackOut_53_1 = 0;
                                      stackIn_54_0 = stackOut_53_0;
                                      stackIn_54_1 = stackOut_53_1;
                                      break L27;
                                    } else {
                                      stackOut_52_0 = stackIn_52_0;
                                      stackOut_52_1 = 1;
                                      stackIn_54_0 = stackOut_52_0;
                                      stackIn_54_1 = stackOut_52_1;
                                      break L27;
                                    }
                                  }
                                  var10 = stackIn_54_0 | stackIn_54_1;
                                  var12++;
                                  if (0 == 0) {
                                    continue L26;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                            }
                          }
                        }
                        vd.field_c[var4] = var10 != 0;
                        var4++;
                        if (0 == 0) {
                          continue L11;
                        } else {
                          break L12;
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

    final static void c(byte param0) {
        t.field_b.i(param0 + 8389890);
        if (oa.field_k == null) {
            oa.field_k = new pe(t.field_b, jh.field_a);
        }
        t.field_b.a((byte) 53, (ee) (Object) oa.field_k);
        if (param0 != 15) {
            ba.a(-4, 102, 101, -116, -9);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
        field_e = new boolean[][][]{new boolean[7][], new boolean[7][], new boolean[7][]};
        field_g = new int[]{1, 2, 3, 4, 5, 6, 7, 22, 23, 24};
        field_h = new int[8192];
        field_f = new int[2][2];
    }
}
