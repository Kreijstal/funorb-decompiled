/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class je {
    private static int[] field_K;
    static double field_l;
    static rb field_O;
    static ea[][] field_j;
    static ea[] field_w;
    private static int field_F;
    static ea[] field_y;
    private static int field_f;
    private static int field_o;
    boolean field_E;
    static ea[] field_L;
    int field_r;
    static ea[][] field_z;
    private static int field_m;
    boolean field_e;
    private int field_Q;
    static ea[] field_c;
    boolean field_S;
    static int field_t;
    private int field_s;
    boolean field_v;
    boolean field_A;
    private static int field_M;
    static boolean field_J;
    int field_U;
    static ea[][] field_p;
    static ea[][] field_x;
    static ea[] field_n;
    private static int field_W;
    static ea[] field_C;
    static ea[][] field_P;
    static ea[] field_g;
    boolean field_b;
    static int field_H;
    static ea[][] field_d;
    static int[] field_N;
    static int field_u;
    boolean field_a;
    private static int field_D;
    static ea[] field_B;
    int field_q;
    static je[][] field_I;
    static ea[] field_k;
    static ea[][] field_R;
    int field_i;
    private static int field_T;
    private static int[][] field_h;
    static ea[] field_G;
    boolean field_V;
    private static String field_X;

    final static boolean c(int param0, int param1, int param2, int param3) {
        return field_O.e((param0 << 2) + param2, (param1 << 2) + param3, 2);
    }

    private final static void f() {
        field_H = 24 * field_N[cm.field_o];
        field_T = -1;
        field_F = (int)(Math.random() * 10000.0) + 100000 ^ 238298623;
    }

    final static boolean i(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var2 = param0 >> 2;
        var3 = param1 >> 2;
        if (var2 >= 0) {
          if (var3 >= 0) {
            if (var2 < 32) {
              if (var3 < field_t) {
                L0: {
                  var4 = var2 - 16;
                  if (var4 >= 0) {
                    break L0;
                  } else {
                    var4 = -var4;
                    break L0;
                  }
                }
                if (var3 > var4 / 2 + 1) {
                  if (field_I[var2][var3].field_a) {
                    L1: {
                      var5 = param0 & 3;
                      var6 = param1 & 3;
                      if (var5 != 0) {
                        break L1;
                      } else {
                        if (var2 <= 0) {
                          break L1;
                        } else {
                          if (field_I[var2 - 1][var3].field_a) {
                            break L1;
                          } else {
                            return false;
                          }
                        }
                      }
                    }
                    L2: {
                      if (var5 != 3) {
                        break L2;
                      } else {
                        if (var2 >= 31) {
                          break L2;
                        } else {
                          if (field_I[var2 + 1][var3].field_a) {
                            break L2;
                          } else {
                            return false;
                          }
                        }
                      }
                    }
                    L3: {
                      if (var6 != 0) {
                        break L3;
                      } else {
                        if (var3 <= 0) {
                          break L3;
                        } else {
                          if (field_I[var2][var3 - 1].field_a) {
                            break L3;
                          } else {
                            return false;
                          }
                        }
                      }
                    }
                    L4: {
                      if (var6 != 3) {
                        break L4;
                      } else {
                        if (var3 >= field_t - 1) {
                          break L4;
                        } else {
                          if (field_I[var2][var3 + 1].field_a) {
                            break L4;
                          } else {
                            return false;
                          }
                        }
                      }
                    }
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3) {
        return field_O.a((param0 << 2) + param2, (param1 << 2) + param3, (byte) 61);
    }

    final static void g(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        je var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int stackIn_36_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_69_1 = 0;
        int stackIn_70_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_72_1 = 0;
        int stackIn_82_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_84_1 = 0;
        int stackIn_85_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_87_1 = 0;
        int stackIn_97_0 = 0;
        int stackIn_98_0 = 0;
        int stackIn_99_0 = 0;
        int stackIn_99_1 = 0;
        int stackIn_100_0 = 0;
        int stackIn_101_0 = 0;
        int stackIn_102_0 = 0;
        int stackIn_102_1 = 0;
        int stackIn_112_0 = 0;
        int stackIn_113_0 = 0;
        int stackIn_114_0 = 0;
        int stackIn_114_1 = 0;
        int stackIn_115_0 = 0;
        int stackIn_116_0 = 0;
        int stackIn_117_0 = 0;
        int stackIn_117_1 = 0;
        int stackOut_34_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_68_1 = 0;
        int stackOut_67_0 = 0;
        int stackOut_67_1 = 0;
        int stackOut_69_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_71_1 = 0;
        int stackOut_70_0 = 0;
        int stackOut_70_1 = 0;
        int stackOut_81_0 = 0;
        int stackOut_83_0 = 0;
        int stackOut_83_1 = 0;
        int stackOut_82_0 = 0;
        int stackOut_82_1 = 0;
        int stackOut_84_0 = 0;
        int stackOut_86_0 = 0;
        int stackOut_86_1 = 0;
        int stackOut_85_0 = 0;
        int stackOut_85_1 = 0;
        int stackOut_96_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_98_1 = 0;
        int stackOut_97_0 = 0;
        int stackOut_97_1 = 0;
        int stackOut_99_0 = 0;
        int stackOut_101_0 = 0;
        int stackOut_101_1 = 0;
        int stackOut_100_0 = 0;
        int stackOut_100_1 = 0;
        int stackOut_111_0 = 0;
        int stackOut_113_0 = 0;
        int stackOut_113_1 = 0;
        int stackOut_112_0 = 0;
        int stackOut_112_1 = 0;
        int stackOut_114_0 = 0;
        int stackOut_116_0 = 0;
        int stackOut_116_1 = 0;
        int stackOut_115_0 = 0;
        int stackOut_115_1 = 0;
        L0: {
          if (field_T < 0) {
            break L0;
          } else {
            var2 = field_o * 32 - li.field_c;
            var3 = field_f * 32 - db.field_d;
            je.e().f(var2, var3);
            break L0;
          }
        }
        if (cm.field_o != 0) {
          L1: {
            var2 = li.field_c / 32;
            var3 = (640 + li.field_c) / 32;
            var4 = db.field_d / 32 - 1;
            var5 = (640 + db.field_d) / 32;
            if (var2 >= 1) {
              break L1;
            } else {
              var2 = 1;
              break L1;
            }
          }
          L2: {
            if (var3 <= 30) {
              break L2;
            } else {
              var3 = 30;
              break L2;
            }
          }
          L3: {
            if (var4 >= 1) {
              break L3;
            } else {
              var4 = 1;
              break L3;
            }
          }
          L4: {
            if (var5 <= field_t - 2) {
              break L4;
            } else {
              var5 = field_t - 2;
              break L4;
            }
          }
          var9 = var4 - 1;
          L5: while (true) {
            if (var9 > var5 + 1) {
              return;
            } else {
              var10 = var2 - 1;
              L6: while (true) {
                if (var10 > var3 + 1) {
                  var9++;
                  continue L5;
                } else {
                  var7 = var10 * 32 - li.field_c;
                  var8 = var9 * 32 - db.field_d;
                  if (var7 > -64) {
                    if (var8 > -64) {
                      if (var7 < 704) {
                        if (var8 < 544) {
                          var6 = field_I[var10][var9];
                          if (!var6.field_a) {
                            if (var6.field_V) {
                              L7: {
                                if (var10 != 0) {
                                  if (!field_I[var10 - 1][var9].field_a) {
                                    if (!field_I[var10 - 1][var9].field_V) {
                                      stackOut_34_0 = 1;
                                      stackIn_36_0 = stackOut_34_0;
                                      break L7;
                                    } else {
                                      stackOut_33_0 = 0;
                                      stackIn_36_0 = stackOut_33_0;
                                      break L7;
                                    }
                                  } else {
                                    stackOut_31_0 = 1;
                                    stackIn_36_0 = stackOut_31_0;
                                    break L7;
                                  }
                                } else {
                                  stackOut_29_0 = 1;
                                  stackIn_36_0 = stackOut_29_0;
                                  break L7;
                                }
                              }
                              L8: {
                                var11 = stackIn_36_0;
                                if (var10 != 31) {
                                  if (!field_I[var10 + 1][var9].field_a) {
                                    if (!field_I[var10 + 1][var9].field_V) {
                                      stackOut_42_0 = 1;
                                      stackIn_44_0 = stackOut_42_0;
                                      break L8;
                                    } else {
                                      stackOut_41_0 = 0;
                                      stackIn_44_0 = stackOut_41_0;
                                      break L8;
                                    }
                                  } else {
                                    stackOut_39_0 = 1;
                                    stackIn_44_0 = stackOut_39_0;
                                    break L8;
                                  }
                                } else {
                                  stackOut_37_0 = 1;
                                  stackIn_44_0 = stackOut_37_0;
                                  break L8;
                                }
                              }
                              L9: {
                                var12 = stackIn_44_0;
                                if (var9 != 0) {
                                  if (!field_I[var10][var9 - 1].field_a) {
                                    if (!field_I[var10][var9 - 1].field_V) {
                                      stackOut_50_0 = 1;
                                      stackIn_52_0 = stackOut_50_0;
                                      break L9;
                                    } else {
                                      stackOut_49_0 = 0;
                                      stackIn_52_0 = stackOut_49_0;
                                      break L9;
                                    }
                                  } else {
                                    stackOut_47_0 = 1;
                                    stackIn_52_0 = stackOut_47_0;
                                    break L9;
                                  }
                                } else {
                                  stackOut_45_0 = 1;
                                  stackIn_52_0 = stackOut_45_0;
                                  break L9;
                                }
                              }
                              L10: {
                                var13 = stackIn_52_0;
                                if (var9 != field_t - 1) {
                                  if (!field_I[var10][var9 + 1].field_a) {
                                    if (!field_I[var10][var9 + 1].field_V) {
                                      stackOut_58_0 = 1;
                                      stackIn_60_0 = stackOut_58_0;
                                      break L10;
                                    } else {
                                      stackOut_57_0 = 0;
                                      stackIn_60_0 = stackOut_57_0;
                                      break L10;
                                    }
                                  } else {
                                    stackOut_55_0 = 1;
                                    stackIn_60_0 = stackOut_55_0;
                                    break L10;
                                  }
                                } else {
                                  stackOut_53_0 = 1;
                                  stackIn_60_0 = stackOut_53_0;
                                  break L10;
                                }
                              }
                              L11: {
                                L12: {
                                  var14 = stackIn_60_0;
                                  var15 = -1;
                                  if (var11 != 0) {
                                    break L12;
                                  } else {
                                    if (var13 != 0) {
                                      break L12;
                                    } else {
                                      L13: {
                                        if (field_I[var10 - 1][var9 - 1].field_a) {
                                          break L13;
                                        } else {
                                          if (field_I[var10 - 1][var9 - 1].field_V) {
                                            break L11;
                                          } else {
                                            break L13;
                                          }
                                        }
                                      }
                                      var15 = 3;
                                      break L11;
                                    }
                                  }
                                }
                                L14: {
                                  stackOut_66_0 = 3;
                                  stackIn_68_0 = stackOut_66_0;
                                  stackIn_67_0 = stackOut_66_0;
                                  if (var11 == 0) {
                                    stackOut_68_0 = stackIn_68_0;
                                    stackOut_68_1 = 0;
                                    stackIn_69_0 = stackOut_68_0;
                                    stackIn_69_1 = stackOut_68_1;
                                    break L14;
                                  } else {
                                    stackOut_67_0 = stackIn_67_0;
                                    stackOut_67_1 = 1;
                                    stackIn_69_0 = stackOut_67_0;
                                    stackIn_69_1 = stackOut_67_1;
                                    break L14;
                                  }
                                }
                                L15: {
                                  stackOut_69_0 = stackIn_69_0 - stackIn_69_1;
                                  stackIn_71_0 = stackOut_69_0;
                                  stackIn_70_0 = stackOut_69_0;
                                  if (var13 == 0) {
                                    stackOut_71_0 = stackIn_71_0;
                                    stackOut_71_1 = 0;
                                    stackIn_72_0 = stackOut_71_0;
                                    stackIn_72_1 = stackOut_71_1;
                                    break L15;
                                  } else {
                                    stackOut_70_0 = stackIn_70_0;
                                    stackOut_70_1 = 2;
                                    stackIn_72_0 = stackOut_70_0;
                                    stackIn_72_1 = stackOut_70_1;
                                    break L15;
                                  }
                                }
                                var15 = stackIn_72_0 - stackIn_72_1;
                                break L11;
                              }
                              L16: {
                                if (var15 < 0) {
                                  break L16;
                                } else {
                                  pj.field_e[var15].f(var7, var8);
                                  break L16;
                                }
                              }
                              L17: {
                                L18: {
                                  var15 = -1;
                                  if (var12 != 0) {
                                    break L18;
                                  } else {
                                    if (var13 != 0) {
                                      break L18;
                                    } else {
                                      L19: {
                                        if (field_I[var10 + 1][var9 - 1].field_a) {
                                          break L19;
                                        } else {
                                          if (field_I[var10 + 1][var9 - 1].field_V) {
                                            break L17;
                                          } else {
                                            break L19;
                                          }
                                        }
                                      }
                                      var15 = 7;
                                      break L17;
                                    }
                                  }
                                }
                                L20: {
                                  stackOut_81_0 = 7;
                                  stackIn_83_0 = stackOut_81_0;
                                  stackIn_82_0 = stackOut_81_0;
                                  if (var12 == 0) {
                                    stackOut_83_0 = stackIn_83_0;
                                    stackOut_83_1 = 0;
                                    stackIn_84_0 = stackOut_83_0;
                                    stackIn_84_1 = stackOut_83_1;
                                    break L20;
                                  } else {
                                    stackOut_82_0 = stackIn_82_0;
                                    stackOut_82_1 = 1;
                                    stackIn_84_0 = stackOut_82_0;
                                    stackIn_84_1 = stackOut_82_1;
                                    break L20;
                                  }
                                }
                                L21: {
                                  stackOut_84_0 = stackIn_84_0 - stackIn_84_1;
                                  stackIn_86_0 = stackOut_84_0;
                                  stackIn_85_0 = stackOut_84_0;
                                  if (var13 == 0) {
                                    stackOut_86_0 = stackIn_86_0;
                                    stackOut_86_1 = 0;
                                    stackIn_87_0 = stackOut_86_0;
                                    stackIn_87_1 = stackOut_86_1;
                                    break L21;
                                  } else {
                                    stackOut_85_0 = stackIn_85_0;
                                    stackOut_85_1 = 2;
                                    stackIn_87_0 = stackOut_85_0;
                                    stackIn_87_1 = stackOut_85_1;
                                    break L21;
                                  }
                                }
                                var15 = stackIn_87_0 - stackIn_87_1;
                                break L17;
                              }
                              L22: {
                                if (var15 < 0) {
                                  break L22;
                                } else {
                                  pj.field_e[var15].f(var7 + 16, var8);
                                  break L22;
                                }
                              }
                              L23: {
                                L24: {
                                  var15 = -1;
                                  if (var12 != 0) {
                                    break L24;
                                  } else {
                                    if (var14 != 0) {
                                      break L24;
                                    } else {
                                      L25: {
                                        if (field_I[var10 + 1][var9 + 1].field_a) {
                                          break L25;
                                        } else {
                                          if (field_I[var10 + 1][var9 + 1].field_V) {
                                            break L23;
                                          } else {
                                            break L25;
                                          }
                                        }
                                      }
                                      var15 = 11;
                                      break L23;
                                    }
                                  }
                                }
                                L26: {
                                  stackOut_96_0 = 11;
                                  stackIn_98_0 = stackOut_96_0;
                                  stackIn_97_0 = stackOut_96_0;
                                  if (var12 == 0) {
                                    stackOut_98_0 = stackIn_98_0;
                                    stackOut_98_1 = 0;
                                    stackIn_99_0 = stackOut_98_0;
                                    stackIn_99_1 = stackOut_98_1;
                                    break L26;
                                  } else {
                                    stackOut_97_0 = stackIn_97_0;
                                    stackOut_97_1 = 1;
                                    stackIn_99_0 = stackOut_97_0;
                                    stackIn_99_1 = stackOut_97_1;
                                    break L26;
                                  }
                                }
                                L27: {
                                  stackOut_99_0 = stackIn_99_0 - stackIn_99_1;
                                  stackIn_101_0 = stackOut_99_0;
                                  stackIn_100_0 = stackOut_99_0;
                                  if (var14 == 0) {
                                    stackOut_101_0 = stackIn_101_0;
                                    stackOut_101_1 = 0;
                                    stackIn_102_0 = stackOut_101_0;
                                    stackIn_102_1 = stackOut_101_1;
                                    break L27;
                                  } else {
                                    stackOut_100_0 = stackIn_100_0;
                                    stackOut_100_1 = 2;
                                    stackIn_102_0 = stackOut_100_0;
                                    stackIn_102_1 = stackOut_100_1;
                                    break L27;
                                  }
                                }
                                var15 = stackIn_102_0 - stackIn_102_1;
                                break L23;
                              }
                              L28: {
                                if (var15 < 0) {
                                  break L28;
                                } else {
                                  pj.field_e[var15].f(var7 + 16, var8 + 16);
                                  break L28;
                                }
                              }
                              L29: {
                                L30: {
                                  var15 = -1;
                                  if (var11 != 0) {
                                    break L30;
                                  } else {
                                    if (var14 != 0) {
                                      break L30;
                                    } else {
                                      L31: {
                                        if (field_I[var10 - 1][var9 + 1].field_a) {
                                          break L31;
                                        } else {
                                          if (field_I[var10 - 1][var9 + 1].field_V) {
                                            break L29;
                                          } else {
                                            break L31;
                                          }
                                        }
                                      }
                                      var15 = 15;
                                      break L29;
                                    }
                                  }
                                }
                                L32: {
                                  stackOut_111_0 = 15;
                                  stackIn_113_0 = stackOut_111_0;
                                  stackIn_112_0 = stackOut_111_0;
                                  if (var11 == 0) {
                                    stackOut_113_0 = stackIn_113_0;
                                    stackOut_113_1 = 0;
                                    stackIn_114_0 = stackOut_113_0;
                                    stackIn_114_1 = stackOut_113_1;
                                    break L32;
                                  } else {
                                    stackOut_112_0 = stackIn_112_0;
                                    stackOut_112_1 = 1;
                                    stackIn_114_0 = stackOut_112_0;
                                    stackIn_114_1 = stackOut_112_1;
                                    break L32;
                                  }
                                }
                                L33: {
                                  stackOut_114_0 = stackIn_114_0 - stackIn_114_1;
                                  stackIn_116_0 = stackOut_114_0;
                                  stackIn_115_0 = stackOut_114_0;
                                  if (var14 == 0) {
                                    stackOut_116_0 = stackIn_116_0;
                                    stackOut_116_1 = 0;
                                    stackIn_117_0 = stackOut_116_0;
                                    stackIn_117_1 = stackOut_116_1;
                                    break L33;
                                  } else {
                                    stackOut_115_0 = stackIn_115_0;
                                    stackOut_115_1 = 2;
                                    stackIn_117_0 = stackOut_115_0;
                                    stackIn_117_1 = stackOut_115_1;
                                    break L33;
                                  }
                                }
                                var15 = stackIn_117_0 - stackIn_117_1;
                                break L29;
                              }
                              L34: {
                                if (var15 < 0) {
                                  break L34;
                                } else {
                                  pj.field_e[var15].f(var7, var8 + 16);
                                  break L34;
                                }
                              }
                              L35: {
                                if (var11 == 0) {
                                  break L35;
                                } else {
                                  eh.e(var7 - 8, var8, 8, 32, 1642509);
                                  break L35;
                                }
                              }
                              L36: {
                                if (var12 == 0) {
                                  break L36;
                                } else {
                                  eh.e(var7 + 32, var8, 8, 32, 1642509);
                                  break L36;
                                }
                              }
                              L37: {
                                if (var13 == 0) {
                                  break L37;
                                } else {
                                  eh.e(var7, var8 - 11, 32, 11, 1642509);
                                  break L37;
                                }
                              }
                              if (var14 != 0) {
                                eh.e(var7, var8 + 32, 32, 8, 1642509);
                                var10++;
                                continue L6;
                              } else {
                                var10++;
                                continue L6;
                              }
                            } else {
                              var10++;
                              continue L6;
                            }
                          } else {
                            var10++;
                            continue L6;
                          }
                        } else {
                          var10++;
                          continue L6;
                        }
                      } else {
                        var10++;
                        continue L6;
                      }
                    } else {
                      var10++;
                      continue L6;
                    }
                  } else {
                    var10++;
                    continue L6;
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    private final static void a(int param0, int param1, je param2, je param3) {
        L0: {
          if (!param2.field_V) {
            break L0;
          } else {
            if (param2.field_a) {
              break L0;
            } else {
              field_I[param0 - 1][param1].field_V = true;
              field_I[param0 + 1][param1].field_V = true;
              param3.field_V = true;
              field_I[param0][param1 + 1].field_V = true;
              field_I[param0 - 1][param1 - 1].field_V = true;
              field_I[param0 + 1][param1 - 1].field_V = true;
              field_I[param0 - 1][param1 + 1].field_V = true;
              field_I[param0 + 1][param1 + 1].field_V = true;
              field_I[param0 - 1][param1 - 1].field_V = true;
              field_I[param0 - 1][param1 + 1].field_V = true;
              field_I[param0 + 1][param1 - 1].field_V = true;
              field_I[param0 + 1][param1 + 1].field_V = true;
              break L0;
            }
          }
        }
    }

    private final static void a(int param0) {
        int var1 = (int)(Math.random() * 27.0) + 2;
        int var2 = (int)(Math.random() * 19.0) + param0 + 2;
        field_I[var1][var2].field_a = false;
        field_I[var1][var2].field_b = false;
        uf.field_p[jf.b((byte) 95)] = new gf(var1, var2, 10);
    }

    private final static void a(int param0, int param1, je param2) {
        int incrementValue$1 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          if (!ba.field_M) {
            L1: {
              L2: {
                var3 = param2.field_i - 16;
                if (param2.field_a) {
                  break L2;
                } else {
                  if (param2.field_V) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var3 = var3 - 64;
              break L1;
            }
            L3: {
              if (!je.c(param0, param1, 1, 1)) {
                break L3;
              } else {
                if (!param2.field_V) {
                  break L3;
                } else {
                  var3 = var3 - 32;
                  break L3;
                }
              }
            }
            var4 = param1 - 1;
            L4: while (true) {
              if (var4 > param1 + 1) {
                break L0;
              } else {
                if (var4 >= 6) {
                  var6 = param0 - 1;
                  var5 = var6;
                  L5: while (true) {
                    if (var6 <= param0 + 1) {
                      if (field_I[var6][var4].field_i < var3) {
                        field_I[var6][var4].field_i = var3;
                        var6++;
                        continue L5;
                      } else {
                        var6++;
                        continue L5;
                      }
                    } else {
                      var4++;
                      continue L4;
                    }
                  }
                } else {
                  var4++;
                  continue L4;
                }
              }
            }
          } else {
            L6: {
              L7: {
                var3 = param2.field_i - 4;
                if (param2.field_a) {
                  break L7;
                } else {
                  if (param2.field_V) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              var3 = var3 - 64;
              break L6;
            }
            L8: {
              if (!je.c(param0, param1, 1, 1)) {
                break L8;
              } else {
                if (!param2.field_V) {
                  break L8;
                } else {
                  var3 = var3 - 32;
                  break L8;
                }
              }
            }
            var4 = param1 - 1;
            L9: while (true) {
              if (var4 > param1 + 1) {
                break L0;
              } else {
                var5 = param0 - 1;
                L10: while (true) {
                  if (var5 > param0 + 1) {
                    var4++;
                    continue L9;
                  } else {
                    incrementValue$1 = var3;
                    var3++;
                    field_I[var5][var4].field_i = incrementValue$1;
                    var5++;
                    continue L10;
                  }
                }
              }
            }
          }
        }
    }

    private final static ea e() {
        if (field_T == 0) {
            return il.field_s;
        }
        if (field_T == 1) {
            return pl.field_k;
        }
        if (field_T == 2) {
            return bc.field_b;
        }
        if (field_T == 3) {
            return aa.field_i;
        }
        if (field_T != 4) {
            return null;
        }
        return gh.field_a;
    }

    final static void b(int param0, int param1) {
        int var2 = 0;
        ea var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Object var11 = null;
        Object var12 = null;
        Object var13 = null;
        Object var14 = null;
        je var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        ea[] var38 = null;
        ea[] var39 = null;
        ea[] var40 = null;
        ea[] var41 = null;
        int stackIn_3_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_22_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_17_0 = 0;
        L0: {
          je.b(param0, param1, false);
          if (cm.field_o != 1) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var2 = stackIn_3_0;
          var3 = je.a(param0, param1, var2 != 0);
          var4 = li.field_c / 32;
          var5 = (640 + li.field_c) / 32;
          var6 = db.field_d / 32 - 1;
          var7 = (640 + db.field_d) / 32;
          if (var4 >= 1) {
            break L1;
          } else {
            var4 = 1;
            break L1;
          }
        }
        L2: {
          if (var5 <= 30) {
            break L2;
          } else {
            var5 = 30;
            break L2;
          }
        }
        L3: {
          if (var6 >= 1) {
            break L3;
          } else {
            var6 = 1;
            break L3;
          }
        }
        L4: {
          if (var7 <= field_t - 2) {
            break L4;
          } else {
            var7 = field_t - 2;
            break L4;
          }
        }
        var8 = 512 - li.field_c;
        var9 = -db.field_d;
        hj.field_h.f(var8, var9);
        field_O.a(var5, var6, var4, var7, 17761, field_I);
        var10 = cm.field_o;
        var11 = null;
        var12 = null;
        var13 = null;
        var14 = null;
        var38 = field_d[var10];
        var39 = field_P[var10];
        var40 = field_R[var10];
        var41 = field_p[var10];
        var16 = var6 - 1;
        L5: while (true) {
          if (var16 > var7 + 1) {
            je.b(param0, param1, true);
            nd.field_d.a((byte) -19);
            je.c(param0, param1);
            je.a(param0, param1, var3);
            return;
          } else {
            L6: {
              var17 = var16 / 24 % field_h.length;
              var18 = field_h[cm.field_o][var17];
              if (var17 >= field_h.length - 1) {
                stackOut_15_0 = 0;
                stackIn_16_0 = stackOut_15_0;
                break L6;
              } else {
                var17++;
                stackOut_14_0 = var17;
                stackIn_16_0 = stackOut_14_0;
                break L6;
              }
            }
            L7: {
              var19 = stackIn_16_0;
              var20 = field_h[cm.field_o][var19];
              var21 = var18 >> 16 & 255;
              var22 = var18 >> 8 & 255;
              var23 = var18 & 255;
              var24 = var20 >> 16 & 255;
              var25 = var20 >> 8 & 255;
              var26 = var20 & 255;
              var27 = var24 - var21;
              var28 = var25 - var22;
              var29 = var26 - var23;
              var30 = 256 * (var16 % 24) / 24;
              var27 = var27 * var30 >> 8;
              var28 = var28 * var30 >> 8;
              var29 = var29 * var30 >> 8;
              var18 = (var21 + var27 & 255) << 16 | (var22 + var28 & 255) << 8 | var23 + var29 & 255;
              if (!vi.field_h) {
                if (!wm.field_e) {
                  stackOut_20_0 = 1;
                  stackIn_22_0 = stackOut_20_0;
                  break L7;
                } else {
                  stackOut_19_0 = 0;
                  stackIn_22_0 = stackOut_19_0;
                  break L7;
                }
              } else {
                stackOut_17_0 = 0;
                stackIn_22_0 = stackOut_17_0;
                break L7;
              }
            }
            var31 = stackIn_22_0;
            var32 = var4 - 1;
            L8: while (true) {
              if (var32 > var5 + 1) {
                var16++;
                continue L5;
              } else {
                var15 = field_I[var32][var16];
                var8 = var32 * 32 - li.field_c;
                var9 = var16 * 32 - db.field_d;
                if (var8 > -64) {
                  if (var9 > -64) {
                    if (var8 < 704) {
                      if (var9 < 544) {
                        L9: {
                          var33 = var32 - 16;
                          if (var33 >= 0) {
                            break L9;
                          } else {
                            var33 = -var33;
                            break L9;
                          }
                        }
                        L10: {
                          if (var31 == 0) {
                            break L10;
                          } else {
                            L11: {
                              if (var15.field_a) {
                                break L11;
                              } else {
                                if (var15.field_V) {
                                  break L10;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            L12: {
                              var34 = 0;
                              if (var16 > 0) {
                                if (!field_I[var32][var16 - 1].field_a) {
                                  if (field_I[var32][var16 - 1].field_V) {
                                    var34++;
                                    if (var32 >= 31) {
                                      break L12;
                                    } else {
                                      if (field_I[var32 + 1][var16].field_a) {
                                        break L12;
                                      } else {
                                        if (!field_I[var32 + 1][var16].field_V) {
                                          break L12;
                                        } else {
                                          var34 += 2;
                                          break L12;
                                        }
                                      }
                                    }
                                  } else {
                                    if (var32 >= 31) {
                                      break L12;
                                    } else {
                                      if (field_I[var32 + 1][var16].field_a) {
                                        break L12;
                                      } else {
                                        if (!field_I[var32 + 1][var16].field_V) {
                                          break L12;
                                        } else {
                                          var34 += 2;
                                          break L12;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  if (var32 >= 31) {
                                    break L12;
                                  } else {
                                    if (field_I[var32 + 1][var16].field_a) {
                                      break L12;
                                    } else {
                                      if (!field_I[var32 + 1][var16].field_V) {
                                        break L12;
                                      } else {
                                        var34 += 2;
                                        break L12;
                                      }
                                    }
                                  }
                                }
                              } else {
                                if (var32 >= 31) {
                                  break L12;
                                } else {
                                  if (field_I[var32 + 1][var16].field_a) {
                                    break L12;
                                  } else {
                                    if (!field_I[var32 + 1][var16].field_V) {
                                      break L12;
                                    } else {
                                      var34 += 2;
                                      break L12;
                                    }
                                  }
                                }
                              }
                            }
                            L13: {
                              if (var32 > 0) {
                                if (!field_I[var32 - 1][var16].field_a) {
                                  if (field_I[var32 - 1][var16].field_V) {
                                    var34 += 4;
                                    if (var16 >= field_t - 1) {
                                      break L13;
                                    } else {
                                      if (field_I[var32][var16 + 1].field_a) {
                                        break L13;
                                      } else {
                                        if (!field_I[var32][var16 + 1].field_V) {
                                          break L13;
                                        } else {
                                          var34 += 8;
                                          break L13;
                                        }
                                      }
                                    }
                                  } else {
                                    if (var16 >= field_t - 1) {
                                      break L13;
                                    } else {
                                      if (field_I[var32][var16 + 1].field_a) {
                                        break L13;
                                      } else {
                                        if (!field_I[var32][var16 + 1].field_V) {
                                          break L13;
                                        } else {
                                          var34 += 8;
                                          break L13;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  if (var16 >= field_t - 1) {
                                    break L13;
                                  } else {
                                    if (field_I[var32][var16 + 1].field_a) {
                                      break L13;
                                    } else {
                                      if (!field_I[var32][var16 + 1].field_V) {
                                        break L13;
                                      } else {
                                        var34 += 8;
                                        break L13;
                                      }
                                    }
                                  }
                                }
                              } else {
                                if (var16 >= field_t - 1) {
                                  break L13;
                                } else {
                                  if (field_I[var32][var16 + 1].field_a) {
                                    break L13;
                                  } else {
                                    if (!field_I[var32][var16 + 1].field_V) {
                                      break L13;
                                    } else {
                                      var34 += 8;
                                      break L13;
                                    }
                                  }
                                }
                              }
                            }
                            L14: {
                              var35 = var18;
                              if (var15.field_q <= 0) {
                                break L14;
                              } else {
                                L15: {
                                  if (var15.field_q >= 256) {
                                    if (var15.field_q >= 512) {
                                      break L15;
                                    } else {
                                      var22 = 0;
                                      var25 = 255;
                                      var28 = var25 - var22;
                                      var30 = 256 * (var15.field_q - 256) >> 8;
                                      var28 = var28 * var30 >> 8;
                                      var35 = 16711680 | (var22 + var28 & 255) << 8 | 0;
                                      break L15;
                                    }
                                  } else {
                                    L16: {
                                      var21 = var18 >> 16 & 255;
                                      var22 = var18 >> 8 & 255;
                                      var23 = var18 & 255;
                                      var24 = 255;
                                      var25 = 0;
                                      var26 = 0;
                                      var27 = var24 - var21;
                                      var28 = var22;
                                      var29 = var23;
                                      var30 = 256 * var15.field_q >> 8;
                                      if (var30 <= 256) {
                                        break L16;
                                      } else {
                                        var30 = 256;
                                        break L16;
                                      }
                                    }
                                    var27 = var27 * var30 >> 8;
                                    var28 = var28 * var30 >> 8;
                                    var29 = var29 * var30 >> 8;
                                    var35 = (var21 + var27 & 255) << 16 | (var22 - var28 & 255) << 8 | var23 - var29 & 255;
                                    break L15;
                                  }
                                }
                                L17: {
                                  if (var15.field_q < 512) {
                                    break L17;
                                  } else {
                                    if (var15.field_q >= 768) {
                                      break L17;
                                    } else {
                                      var23 = 0;
                                      var26 = var15.field_q - 512 & 255;
                                      var29 = var26 - var23;
                                      var30 = 256 * (var15.field_q - 512) >> 8;
                                      var29 = var29 * var30 >> 8;
                                      var35 = 16776960 | var23 + var29 & 255;
                                      break L17;
                                    }
                                  }
                                }
                                if (var15.field_q < 768) {
                                  break L14;
                                } else {
                                  var35 = 16777215;
                                  break L14;
                                }
                              }
                            }
                            L18: {
                              if (var16 > (var33 + 1) / 2) {
                                break L18;
                              } else {
                                field_I[var32][var16].field_i = 256;
                                field_I[var32][var16].field_q = field_I[var32][var16].field_q / 2;
                                break L18;
                              }
                            }
                            if (var16 > (var33 + 1) / 2 - 1) {
                              L19: {
                                if (var15.field_E) {
                                  break L19;
                                } else {
                                  if (var2 == 0) {
                                    break L19;
                                  } else {
                                    if (var15.field_q >= 0) {
                                      break L19;
                                    } else {
                                      L20: {
                                        var36 = 255 * var15.field_q / -200;
                                        if (var36 <= 255) {
                                          break L20;
                                        } else {
                                          var36 = 255;
                                          break L20;
                                        }
                                      }
                                      var37 = var35 & 255;
                                      if (var37 >= var36) {
                                        break L19;
                                      } else {
                                        var35 = var35 & 16776960;
                                        var35 = var35 | var36;
                                        break L19;
                                      }
                                    }
                                  }
                                }
                              }
                              L21: {
                                if (!var15.field_V) {
                                  break L21;
                                } else {
                                  L22: {
                                    if (var15.field_E) {
                                      break L22;
                                    } else {
                                      if (var15.field_v) {
                                        break L22;
                                      } else {
                                        break L21;
                                      }
                                    }
                                  }
                                  if (!var15.field_E) {
                                    if (var15.field_S) {
                                      if (var15.field_r >= 500) {
                                        if (var15.field_r >= 750) {
                                          field_g[var34].a(var8 + param0, var9 + param1, var35);
                                          if (var15.field_r <= 950) {
                                            break L10;
                                          } else {
                                            if (var15.field_r % 2 != 0) {
                                              break L10;
                                            } else {
                                              if (field_I[var32][var16 + 1].field_a) {
                                                break L10;
                                              } else {
                                                field_g[var34].a(var8 + param0 + 1, var9 + param1 + 1, var35);
                                                break L10;
                                              }
                                            }
                                          }
                                        } else {
                                          field_C[var34].a(var8 + param0, var9 + param1, var35);
                                          break L10;
                                        }
                                      } else {
                                        field_c[var34].a(var8 + param0, var9 + param1, var35);
                                        break L10;
                                      }
                                    } else {
                                      field_L[var34].a(var8 + param0, var9 + param1, var35);
                                      break L10;
                                    }
                                  } else {
                                    if (var15.field_S) {
                                      if (var15.field_r >= 500) {
                                        if (var15.field_r >= 750) {
                                          field_G[var34].a(var8 + param0, var9 + param1, var35);
                                          if (var15.field_r <= 950) {
                                            break L10;
                                          } else {
                                            if (var15.field_r % 2 != 0) {
                                              break L10;
                                            } else {
                                              if (field_I[var32][var16 + 1].field_a) {
                                                break L10;
                                              } else {
                                                field_G[var34].a(var8 + param0 + 1, var9 + param1 + 1, var35);
                                                break L10;
                                              }
                                            }
                                          }
                                        } else {
                                          field_n[var34].a(var8 + param0, var9 + param1, var35);
                                          break L10;
                                        }
                                      } else {
                                        field_y[var34].a(var8 + param0, var9 + param1, var35);
                                        break L10;
                                      }
                                    } else {
                                      field_k[var34].a(var8 + param0, var9 + param1, var35);
                                      break L10;
                                    }
                                  }
                                }
                              }
                              L23: {
                                if (var15.field_S) {
                                  if (var15.field_r >= 500) {
                                    if (var15.field_r >= 750) {
                                      var41[var34].a(var8 + param0, var9 + param1, var35);
                                      if (var15.field_r <= 950) {
                                        break L23;
                                      } else {
                                        if (var15.field_r % 2 != 0) {
                                          break L23;
                                        } else {
                                          if (field_I[var32][var16 + 1].field_a) {
                                            break L23;
                                          } else {
                                            var41[var34].a(var8 + param0 + 1, var9 + param1 + 1, var35);
                                            break L23;
                                          }
                                        }
                                      }
                                    } else {
                                      var40[var34].a(var8 + param0, var9 + param1, var35);
                                      break L23;
                                    }
                                  } else {
                                    var39[var34].a(var8 + param0, var9 + param1, var35);
                                    break L23;
                                  }
                                } else {
                                  var38[var34].a(var8 + param0, var9 + param1, var35);
                                  break L23;
                                }
                              }
                              if (var10 != 1) {
                                break L10;
                              } else {
                                L24: {
                                  if (var32 <= 0) {
                                    break L24;
                                  } else {
                                    if (!field_I[var32 - 1][var16].field_V) {
                                      break L24;
                                    } else {
                                      L25: {
                                        if (field_I[var32 - 1][var16].field_v) {
                                          break L25;
                                        } else {
                                          if (!field_I[var32 - 1][var16].field_E) {
                                            break L24;
                                          } else {
                                            break L25;
                                          }
                                        }
                                      }
                                      field_z[0][var34].a(var8 + param0, var9 + param1, var35);
                                      break L24;
                                    }
                                  }
                                }
                                L26: {
                                  if (var32 >= 31) {
                                    break L26;
                                  } else {
                                    if (!field_I[var32 + 1][var16].field_V) {
                                      break L26;
                                    } else {
                                      L27: {
                                        if (field_I[var32 + 1][var16].field_v) {
                                          break L27;
                                        } else {
                                          if (!field_I[var32 + 1][var16].field_E) {
                                            break L26;
                                          } else {
                                            break L27;
                                          }
                                        }
                                      }
                                      field_z[2][var34].a(var8 + param0, var9 + param1, var35);
                                      break L26;
                                    }
                                  }
                                }
                                L28: {
                                  if (!field_I[var32][var16 + 1].field_V) {
                                    break L28;
                                  } else {
                                    L29: {
                                      if (field_I[var32][var16 + 1].field_v) {
                                        break L29;
                                      } else {
                                        if (!field_I[var32][var16 + 1].field_E) {
                                          break L28;
                                        } else {
                                          break L29;
                                        }
                                      }
                                    }
                                    field_z[3][var34].a(var8 + param0, var9 + param1, var35);
                                    break L28;
                                  }
                                }
                                if (var16 <= 1) {
                                  break L10;
                                } else {
                                  if (!field_I[var32][var16 - 1].field_V) {
                                    break L10;
                                  } else {
                                    L30: {
                                      if (field_I[var32][var16 - 1].field_v) {
                                        break L30;
                                      } else {
                                        if (field_I[var32][var16 - 1].field_E) {
                                          break L30;
                                        } else {
                                          if (field_I[var32][var16 - 1].field_a) {
                                            break L10;
                                          } else {
                                            break L30;
                                          }
                                        }
                                      }
                                    }
                                    field_z[1][var34].a(var8 + param0, var9 + param1, var35);
                                    break L10;
                                  }
                                }
                              }
                            } else {
                              L31: {
                                var34 = 0;
                                var34 = var32 % 2 + var16 * 2;
                                if (var16 <= 4) {
                                  break L31;
                                } else {
                                  var34 = var32 % 2 + 8;
                                  break L31;
                                }
                              }
                              L32: {
                                var36 = var32 - 16;
                                if (var36 * var36 <= 1) {
                                  break L32;
                                } else {
                                  field_j[cm.field_o][var34].a(var8 + param0, var9 + param1, var35);
                                  break L32;
                                }
                              }
                              var34 = 0;
                              if (var16 != (var33 + 1) / 2 - 1) {
                                break L10;
                              } else {
                                var34 = var32 % 2 + 1;
                                if (var32 <= 16) {
                                  field_x[cm.field_o][var34].a(var8 + param0, var9 + param1, var35);
                                  if (var34 != 2) {
                                    break L10;
                                  } else {
                                    field_x[cm.field_o][0].a(var8 + param0, var9 + param1 - 32, var35);
                                    break L10;
                                  }
                                } else {
                                  var34 += 3;
                                  field_x[cm.field_o][var34].a(var8 + param0, var9 + param1, var35);
                                  if (var34 != 5) {
                                    break L10;
                                  } else {
                                    field_x[cm.field_o][3].a(var8 + param0, var9 + param1 - 32, var35);
                                    break L10;
                                  }
                                }
                              }
                            }
                          }
                        }
                        L33: {
                          if (var31 == 0) {
                            break L33;
                          } else {
                            if (!var15.field_b) {
                              break L33;
                            } else {
                              L34: {
                                if (var15.field_U == -1) {
                                  break L34;
                                } else {
                                  var34 = var15.field_U;
                                  field_w[var34 + var15.field_Q * 6].f(var8 + param0, var9 + param1);
                                  break L34;
                                }
                              }
                              L35: {
                                if (!var15.field_a) {
                                  var34 = 3;
                                  break L35;
                                } else {
                                  var34 = (var32 + var16) % 3;
                                  break L35;
                                }
                              }
                              field_B[var34].f(var8 + param0, var9 + param1);
                              var32++;
                              continue L8;
                            }
                          }
                        }
                        if (var31 != 0) {
                          if (var2 != 0) {
                            if (var15.field_V) {
                              if (!var15.field_a) {
                                if (var15.field_V) {
                                  if (!var15.field_a) {
                                    if (var15.field_A) {
                                      var34 = 0;
                                      var35 = 3;
                                      L36: while (true) {
                                        L37: {
                                          if (var35 < 0) {
                                            break L37;
                                          } else {
                                            if (je.c(var32, var16, 1, var35)) {
                                              var34++;
                                              var35--;
                                              continue L36;
                                            } else {
                                              break L37;
                                            }
                                          }
                                        }
                                        var34 = var34 * 8;
                                        eh.a(var8 + param0, var9 + param1 + 32 - var34, var8 + param0 + 32, var9 + param1 + 32);
                                        var35 = 0;
                                        L38: while (true) {
                                          if (var35 >= 3) {
                                            eh.a();
                                            var32++;
                                            continue L8;
                                          } else {
                                            var36 = var8 + param0 + 1 + ll.a((byte) -73, 30);
                                            var37 = var9 + param1 + 1 + ll.a((byte) -73, 30);
                                            if (var35 == 0) {
                                              eh.e(var36 - 1, var37, 3, 16777215);
                                              eh.g(var36, var37 - 1, 3, 16777215);
                                              var35++;
                                              continue L38;
                                            } else {
                                              eh.d(var36 - 1, var37 - 1, var36 + 1, var37 + 1, 16777215);
                                              eh.d(var36 + 1, var37 - 1, var36 - 1, var37 + 1, 16777215);
                                              var35++;
                                              continue L38;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      var32++;
                                      continue L8;
                                    }
                                  } else {
                                    var32++;
                                    continue L8;
                                  }
                                } else {
                                  var32++;
                                  continue L8;
                                }
                              } else {
                                var32++;
                                continue L8;
                              }
                            } else {
                              var32++;
                              continue L8;
                            }
                          } else {
                            var32++;
                            continue L8;
                          }
                        } else {
                          var32++;
                          continue L8;
                        }
                      } else {
                        var32++;
                        continue L8;
                      }
                    } else {
                      var32++;
                      continue L8;
                    }
                  } else {
                    var32++;
                    continue L8;
                  }
                } else {
                  var32++;
                  continue L8;
                }
              }
            }
          }
        }
    }

    private final static boolean b(int param0, int param1, int param2, int param3) {
        return field_O.d((param1 << 2) + param3, (param0 << 2) + param2, (byte) -122);
    }

    private final static void b(int param0, int param1, je param2) {
        L0: {
          if (!param2.field_S) {
            break L0;
          } else {
            if (!param2.field_a) {
              break L0;
            } else {
              if (!field_I[param0][param1 + 1].field_a) {
                break L0;
              } else {
                L1: {
                  param2.field_r = param2.field_r - 1;
                  if (param2.field_r != 999) {
                    break L1;
                  } else {
                    ne.a(20, -101);
                    uf.field_p[jf.b((byte) 96)] = new gf(param0, param1, 8);
                    lj.field_r = lj.field_r + 10;
                    rg.field_sb = rg.field_sb - 10;
                    break L1;
                  }
                }
                if (param2.field_r >= 0) {
                  break L0;
                } else {
                  param2.field_S = false;
                  break L0;
                }
              }
            }
          }
        }
        L2: {
          if (!param2.field_S) {
            if (param2.field_b) {
              if (!field_I[param0][param1 + 1].field_a) {
                if (param2.field_a) {
                  break L2;
                } else {
                  param2.field_b = false;
                  field_I[param0][param1 + 1].field_b = true;
                  break L2;
                }
              } else {
                if (!param2.field_b) {
                  break L2;
                } else {
                  if (field_I[param0][param1 + 1].field_a) {
                    break L2;
                  } else {
                    if (param2.field_a) {
                      break L2;
                    } else {
                      param2.field_b = false;
                      field_I[param0][param1 + 1].field_b = true;
                      break L2;
                    }
                  }
                }
              }
            } else {
              if (!param2.field_b) {
                break L2;
              } else {
                if (field_I[param0][param1 + 1].field_a) {
                  break L2;
                } else {
                  if (param2.field_a) {
                    break L2;
                  } else {
                    param2.field_b = false;
                    field_I[param0][param1 + 1].field_b = true;
                    break L2;
                  }
                }
              }
            }
          } else {
            if (!param2.field_b) {
              break L2;
            } else {
              if (field_I[param0][param1 + 1].field_a) {
                break L2;
              } else {
                if (param2.field_a) {
                  break L2;
                } else {
                  param2.field_b = false;
                  field_I[param0][param1 + 1].field_b = true;
                  break L2;
                }
              }
            }
          }
        }
    }

    final static boolean e(int param0, int param1) {
        int var2 = param0 >> 2;
        int var3 = param1 >> 2;
        if (var2 < 0) {
            return true;
        }
        if (var3 < 0) {
            return true;
        }
        if (var2 >= 32) {
            return true;
        }
        if (var3 >= field_t) {
            return true;
        }
        int var4 = var2 - 16;
        if (var4 < 0) {
            var4 = -var4;
        }
        if (var3 <= var4 / 2 + 1) {
            return true;
        }
        if (!field_I[var2][var3].field_a) {
            return false;
        }
        int var5 = param0 & 3;
        if (var5 == 0) {
            if (var2 > 0) {
                if (!field_I[var2 - 1][var3].field_a) {
                    return false;
                }
            }
        }
        if (var5 == 3) {
            if (var2 < 31) {
                if (!field_I[var2 + 1][var3].field_a) {
                    return false;
                }
            }
        }
        return true;
    }

    private final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14) {
        int var19 = 0;
        int var17 = 0;
        int var18 = 0;
        int var15 = 0;
        int var16 = 0;
        int var20 = 0;
        int incrementValue$0 = 0;
        for (var19 = 0; var19 < param12; var19++) {
            var17 = param5 * param6 + param4 * param8 >> 8;
            var18 = param5 * param7 + param4 * param9 >> 8;
            var15 = param13 * var18;
            var16 = param14 * var17;
            var17 = var17 * 8;
            var18 = var18 * 8;
            for (var20 = 0; var20 < param11; var20++) {
                param2 = var16 + var15 >> 8;
                param1 = param0[param10];
                incrementValue$0 = param10;
                param10++;
                param0[incrementValue$0] = ((param1 & 16711935) * param2 & -16711936 | (param1 & 65280) * param2 & 16711680) >> 8;
                var15 = var15 + var18;
                var16 = var16 - var17;
            }
            param4 += 8;
            param5 -= 8;
            param10 = param10 + param3;
        }
    }

    private final static void b(int param0, int param1, boolean param2) {
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          if (qn.field_J == null) {
            break L0;
          } else {
            if (!field_J) {
              break L0;
            } else {
              var3 = field_D + param1 - db.field_d;
              var4 = 0;
              var5 = (int)(Math.sin(field_l) * 80.0);
              var6 = te.field_c[0].field_x * 80 / 100;
              var7 = te.field_c[0].field_A * 80 / 100;
              var8 = te.field_c[0].field_A - var7 >> 1;
              if (param2) {
                var4 = 0;
                var9 = -var5 - var6;
                L1: while (true) {
                  if (var9 >= 640) {
                    var3 = var3 + (60 + (int)(Math.sin(field_l) * 2.0));
                    var9 = -var5 - qn.field_J.field_x;
                    L2: while (true) {
                      if (var9 >= 640) {
                        var3 += 30;
                        var4 = 0;
                        L3: while (true) {
                          var9 = var3 + (int)(Math.cos(field_l * 1.3) * 4.0 * (double)var4 + Math.cos(field_l * 0.3 + (double)var4 * 1.3));
                          if (var9 < 480) {
                            var10 = -(int)(field_l * 10.0 + (double)(var4 * 5)) - ij.field_t.field_x - var4 * 200;
                            L4: while (true) {
                              if (var10 >= 640) {
                                var3 += 70;
                                var4++;
                                continue L3;
                              } else {
                                ij.field_t.f(var10, var9);
                                var10 = var10 + ij.field_t.field_x;
                                continue L4;
                              }
                            }
                          } else {
                            break L0;
                          }
                        }
                      } else {
                        qn.field_J.f(var9, var3);
                        var9 = var9 + qn.field_J.field_x;
                        continue L2;
                      }
                    }
                  } else {
                    incrementValue$2 = var4;
                    var4++;
                    te.field_c[field_K[incrementValue$2 % field_K.length]].c(var9, var3 + var8, var6, var7);
                    var9 = var9 + var6;
                    continue L1;
                  }
                }
              } else {
                var9 = var5 - var6;
                L5: while (true) {
                  if (var9 >= 640) {
                    return;
                  } else {
                    incrementValue$3 = var4;
                    var4++;
                    nb.field_a[field_K[incrementValue$3 % field_K.length]].c(var9, var3 + var8 * 2, (int)((double)var6 * 0.8), (int)((double)var7 * 0.8));
                    var9 = var9 + te.field_c[0].field_x;
                    continue L5;
                  }
                }
              }
            }
          }
        }
    }

    private final static ea a(int param0, int param1, boolean param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        ea var12_ref = null;
        ea var13 = null;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          var3 = ca.field_k * 32 - li.field_c + sk.field_d / 10;
          var4 = hf.field_t * 32 - db.field_d + mf.field_i / 10;
          var5 = ca.c(-2302) ? 1 : 0;
          if (var5 == 0) {
            if (tb.field_c >= 0) {
              stackOut_4_0 = 1;
              stackIn_6_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 0;
              stackIn_6_0 = stackOut_3_0;
              break L0;
            }
          } else {
            stackOut_1_0 = 0;
            stackIn_6_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var6 = stackIn_6_0;
          var7 = null;
          if (il.e(-31391)) {
            stackOut_8_0 = 0;
            stackIn_9_0 = stackOut_8_0;
            break L1;
          } else {
            stackOut_7_0 = 1;
            stackIn_9_0 = stackOut_7_0;
            break L1;
          }
        }
        L2: {
          var8 = stackIn_9_0;
          if (var8 == 0) {
            break L2;
          } else {
            L3: {
              if (param2) {
                if (field_I[ca.field_k][hf.field_t].field_A) {
                  stackOut_14_0 = 1;
                  stackIn_16_0 = stackOut_14_0;
                  break L3;
                } else {
                  stackOut_13_0 = 0;
                  stackIn_16_0 = stackOut_13_0;
                  break L3;
                }
              } else {
                stackOut_11_0 = 0;
                stackIn_16_0 = stackOut_11_0;
                break L3;
              }
            }
            L4: {
              var9 = stackIn_16_0;
              var10 = rf.a(13) ? 1 : 0;
              if (var6 == 0) {
                if (var5 == 0) {
                  var7 = ag.field_a[-tb.field_c];
                  break L4;
                } else {
                  if (var10 == 0) {
                    L5: {
                      L6: {
                        if (tb.field_c < 0) {
                          break L6;
                        } else {
                          if (tb.field_c < rg.field_tb.length) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      tb.field_c = 0;
                      break L5;
                    }
                    var7 = rg.field_tb[tb.field_c];
                    break L4;
                  } else {
                    L7: {
                      L8: {
                        if (tb.field_c < 0) {
                          break L8;
                        } else {
                          if (tb.field_c < pc.field_f.length) {
                            break L7;
                          } else {
                            break L8;
                          }
                        }
                      }
                      tb.field_c = 0;
                      break L7;
                    }
                    var7 = pc.field_f[tb.field_c];
                    break L4;
                  }
                }
              } else {
                if (ch.field_h == 5) {
                  var7 = ob.field_w[tb.field_c];
                  var12 = var7;
                  var7 = var12;
                  break L4;
                } else {
                  var7 = a.field_a[tb.field_c];
                  break L4;
                }
              }
            }
            L9: {
              if (di.field_K != 1) {
                L10: {
                  L11: {
                    if (var5 == 0) {
                      break L11;
                    } else {
                      if (var10 != 0) {
                        ((ea) (var7)).b(-113, var3 + param0 / 2 - 4 + 20, 4096, 7281, var4 + param1 / 2 - 4 + 20);
                        break L10;
                      } else {
                        break L11;
                      }
                    }
                  }
                  ((ea) (var7)).h(var3 + param0 / 2 - 4, var4 + param1 / 2 - 4);
                  break L10;
                }
                L12: {
                  if (var9 == 0) {
                    break L12;
                  } else {
                    var13 = ((ea) (var7)).e();
                    var7 = var13;
                    var13.d(40, 40, 80);
                    var13.f(var3 + param0 / 2 - 4, var4 + param1 / 2 - 4);
                    if (ce.field_b % 20 >= 10) {
                      break L12;
                    } else {
                      var13.c(var3 + param0 / 2 - 4, var4 + param1 / 2 - 4, 160);
                      break L12;
                    }
                  }
                }
                if (tc.field_s <= 0) {
                  break L9;
                } else {
                  if (var6 == 0) {
                    if (var5 != 0) {
                      break L9;
                    } else {
                      fg.field_c[-tb.field_c].h(var3 + param0 / 2 - 4, var4 + param1 / 2 - 4);
                      break L9;
                    }
                  } else {
                    if (ch.field_h == 5) {
                      tf.field_c[tb.field_c].h(var3 + param0 / 2 - 4, var4 + param1 / 2 - 4);
                      break L9;
                    } else {
                      rd.field_b[tb.field_c].h(var3 + param0 / 2 - 4, var4 + param1 / 2 - 4);
                      break L9;
                    }
                  }
                }
              } else {
                L13: {
                  L14: {
                    if (var5 == 0) {
                      break L14;
                    } else {
                      if (var10 != 0) {
                        ((ea) (var7)).b(-127, var3 + param0 / 2 - 4 + 20, 4096, 23665, var4 + param1 / 2 - 4 + 20);
                        break L13;
                      } else {
                        break L14;
                      }
                    }
                  }
                  ((ea) (var7)).f(var3 + param0 / 2 - 4, var4 + param1 / 2 - 4);
                  break L13;
                }
                L15: {
                  if (var9 == 0) {
                    break L15;
                  } else {
                    var12_ref = ((ea) (var7)).c();
                    var7 = var12_ref;
                    var12_ref.d(40, 40, 80);
                    var12_ref.f(var3 + param0 / 2 - 4, var4 + param1 / 2 - 4);
                    if (ce.field_b % 20 >= 10) {
                      break L15;
                    } else {
                      var12_ref.c(var3 + param0 / 2 - 4, var4 + param1 / 2 - 4, 160);
                      break L15;
                    }
                  }
                }
                if (tc.field_s <= 0) {
                  break L9;
                } else {
                  if (var6 == 0) {
                    if (var5 != 0) {
                      break L9;
                    } else {
                      fg.field_c[-tb.field_c].f(var3 + param0 / 2 - 4, var4 + param1 / 2 - 4);
                      break L9;
                    }
                  } else {
                    if (ch.field_h == 5) {
                      tf.field_c[tb.field_c].f(var3 + param0 / 2 - 4, var4 + param1 / 2 - 4);
                      break L9;
                    } else {
                      rd.field_b[tb.field_c].f(var3 + param0 / 2 - 4, var4 + param1 / 2 - 4);
                      break L9;
                    }
                  }
                }
              }
            }
            L16: {
              if (tc.field_s <= 0) {
                break L16;
              } else {
                if ((field_m & 127) >= 30) {
                  break L16;
                } else {
                  var11 = (field_m & 127) / 5 % 6;
                  pf.field_a[var11].f(var3 + param0 / 2 - 4, var4 + param1 / 2 - 4);
                  break L16;
                }
              }
            }
            if (var5 != 0) {
              break L2;
            } else {
              if (var10 == 0) {
                break L2;
              } else {
                eh.f(var3 + ll.a((byte) -73, 32), var4 + ll.a((byte) -73, 32) - ll.a((byte) -73, 4), 8, 16711680, 110);
                eh.a(var3 + ll.a((byte) -73, 32) << 4, var4 + ll.a((byte) -73, 32) - ll.a((byte) -73, 4) << 4, 64, 6, re.field_c);
                eh.a(var3 + ll.a((byte) -73, 32) << 4, var4 + ll.a((byte) -73, 32) - ll.a((byte) -73, 4) << 4, 64, 6, re.field_c);
                eh.a(var3 + ll.a((byte) -73, 32) << 4, var4 + ll.a((byte) -73, 32) - ll.a((byte) -73, 4) << 4, 80, 4, re.field_c);
                eh.a(var3 + ll.a((byte) -73, 32) << 4, var4 + ll.a((byte) -73, 32) - ll.a((byte) -73, 4) << 4, 80, 4, re.field_c);
                break L2;
              }
            }
          }
        }
        return (ea) (var7);
    }

    private final static void c(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        je var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int stackIn_14_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_54_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_53_0 = 0;
        L0: {
          var2 = li.field_c / 32;
          var3 = (640 + li.field_c) / 32;
          var4 = db.field_d / 32 - 1;
          var5 = (640 + db.field_d) / 32;
          if (var2 >= 1) {
            break L0;
          } else {
            var2 = 1;
            break L0;
          }
        }
        L1: {
          if (var3 <= 30) {
            break L1;
          } else {
            var3 = 30;
            break L1;
          }
        }
        L2: {
          if (var4 >= 1) {
            break L2;
          } else {
            var4 = 1;
            break L2;
          }
        }
        L3: {
          if (var5 <= field_t - 2) {
            break L3;
          } else {
            var5 = field_t - 2;
            break L3;
          }
        }
        L4: {
          var6 = ca.field_k * 32 - li.field_c + sk.field_d / 10;
          var7 = hf.field_t * 32 - db.field_d + mf.field_i / 10;
          if (!wm.field_e) {
            if (!vi.field_h) {
              stackOut_12_0 = 1;
              stackIn_14_0 = stackOut_12_0;
              break L4;
            } else {
              stackOut_11_0 = 0;
              stackIn_14_0 = stackOut_11_0;
              break L4;
            }
          } else {
            stackOut_9_0 = 0;
            stackIn_14_0 = stackOut_9_0;
            break L4;
          }
        }
        var8 = stackIn_14_0;
        var10 = var4 - 1;
        L5: while (true) {
          if (var10 > var5 + 1) {
            return;
          } else {
            var11 = var2 - 1;
            L6: while (true) {
              if (var11 > var3 + 1) {
                var10++;
                continue L5;
              } else {
                var9 = field_I[var11][var10];
                var6 = var11 * 32 - li.field_c;
                var7 = var10 * 32 - db.field_d;
                if (var6 > -64) {
                  if (var7 > -64) {
                    if (var6 < 704) {
                      if (var7 < 544) {
                        L7: {
                          L8: {
                            if (var11 <= 0) {
                              break L8;
                            } else {
                              if (var10 <= 0) {
                                break L8;
                              } else {
                                stackOut_28_0 = field_I[var11 - 1][var10 - 1].field_i;
                                stackIn_30_0 = stackOut_28_0;
                                break L7;
                              }
                            }
                          }
                          stackOut_29_0 = 0;
                          stackIn_30_0 = stackOut_29_0;
                          break L7;
                        }
                        L9: {
                          var12 = stackIn_30_0;
                          if (var10 <= 0) {
                            stackOut_32_0 = 0;
                            stackIn_33_0 = stackOut_32_0;
                            break L9;
                          } else {
                            stackOut_31_0 = field_I[var11][var10 - 1].field_i;
                            stackIn_33_0 = stackOut_31_0;
                            break L9;
                          }
                        }
                        L10: {
                          L11: {
                            var13 = stackIn_33_0;
                            if (var10 <= 0) {
                              break L11;
                            } else {
                              if (var11 >= 31) {
                                break L11;
                              } else {
                                stackOut_35_0 = field_I[var11 + 1][var10 - 1].field_i;
                                stackIn_37_0 = stackOut_35_0;
                                break L10;
                              }
                            }
                          }
                          stackOut_36_0 = 0;
                          stackIn_37_0 = stackOut_36_0;
                          break L10;
                        }
                        L12: {
                          var14 = stackIn_37_0;
                          if (var11 <= 0) {
                            stackOut_39_0 = 0;
                            stackIn_40_0 = stackOut_39_0;
                            break L12;
                          } else {
                            stackOut_38_0 = field_I[var11 - 1][var10].field_i;
                            stackIn_40_0 = stackOut_38_0;
                            break L12;
                          }
                        }
                        L13: {
                          var15 = stackIn_40_0;
                          var16 = field_I[var11][var10].field_i;
                          if (var11 >= 31) {
                            stackOut_42_0 = 0;
                            stackIn_43_0 = stackOut_42_0;
                            break L13;
                          } else {
                            stackOut_41_0 = field_I[var11 + 1][var10].field_i;
                            stackIn_43_0 = stackOut_41_0;
                            break L13;
                          }
                        }
                        L14: {
                          L15: {
                            var17 = stackIn_43_0;
                            if (var11 <= 0) {
                              break L15;
                            } else {
                              if (var10 >= field_t - 1) {
                                break L15;
                              } else {
                                stackOut_45_0 = field_I[var11 - 1][var10 + 1].field_i;
                                stackIn_47_0 = stackOut_45_0;
                                break L14;
                              }
                            }
                          }
                          stackOut_46_0 = 0;
                          stackIn_47_0 = stackOut_46_0;
                          break L14;
                        }
                        L16: {
                          var18 = stackIn_47_0;
                          if (var10 >= field_t - 1) {
                            stackOut_49_0 = 0;
                            stackIn_50_0 = stackOut_49_0;
                            break L16;
                          } else {
                            stackOut_48_0 = field_I[var11][var10 + 1].field_i;
                            stackIn_50_0 = stackOut_48_0;
                            break L16;
                          }
                        }
                        L17: {
                          L18: {
                            var19 = stackIn_50_0;
                            if (var10 >= field_t - 1) {
                              break L18;
                            } else {
                              if (var11 >= 31) {
                                break L18;
                              } else {
                                stackOut_52_0 = field_I[var11 + 1][var10 + 1].field_i;
                                stackIn_54_0 = stackOut_52_0;
                                break L17;
                              }
                            }
                          }
                          stackOut_53_0 = 0;
                          stackIn_54_0 = stackOut_53_0;
                          break L17;
                        }
                        L19: {
                          L20: {
                            var20 = stackIn_54_0;
                            var21 = var12 + var13 + var15 + var16 >> 2;
                            var22 = var13 + var14 + var16 + var17 >> 2;
                            var23 = var15 + var16 + var18 + var19 >> 2;
                            var24 = var16 + var17 + var19 + var20 >> 2;
                            if (var21 != var22) {
                              break L20;
                            } else {
                              if (var22 != var23) {
                                break L20;
                              } else {
                                if (var23 != var24) {
                                  break L20;
                                } else {
                                  if (var22 != 0) {
                                    eh.b(var6 + param0, var7 + param1, 32, 32, 0, 256 - var21);
                                    break L19;
                                  } else {
                                    eh.e(var6 + param0, var7 + param1, 32, 32, 0);
                                    break L19;
                                  }
                                }
                              }
                            }
                          }
                          L21: {
                            var25 = var6 + param0;
                            var26 = var7 + param1;
                            var27 = var21;
                            var28 = var22;
                            var29 = var23;
                            var30 = var24;
                            var31 = 32;
                            var32 = 32;
                            var33 = 0;
                            var34 = 255;
                            var35 = 0;
                            var36 = 255;
                            if (var25 >= eh.field_a) {
                              break L21;
                            } else {
                              var31 = var31 - (eh.field_a - var25);
                              var35 = 8 * (eh.field_a - var25);
                              var36 = 255 - var35;
                              var25 = eh.field_a;
                              break L21;
                            }
                          }
                          L22: {
                            if (var26 >= eh.field_d) {
                              break L22;
                            } else {
                              var32 = var32 - (eh.field_d - var26);
                              var33 = 8 * (eh.field_d - var26);
                              var34 = 255 - var33;
                              var26 = eh.field_d;
                              break L22;
                            }
                          }
                          L23: {
                            if (var25 + var31 <= eh.field_k) {
                              break L23;
                            } else {
                              var31 = eh.field_k - var25;
                              break L23;
                            }
                          }
                          L24: {
                            if (var26 + var32 <= eh.field_e) {
                              break L24;
                            } else {
                              var32 = eh.field_e - var26;
                              break L24;
                            }
                          }
                          var37 = eh.field_g - var31;
                          var38 = var25 + eh.field_g * var26;
                          je.a(eh.field_f, 0, 0, var37, var33, var34, var27, var28, var29, var30, var38, var31, var32, var35, var36);
                          break L19;
                        }
                        if (var8 != 0) {
                          if (var9.field_U >= 0) {
                            L25: {
                              if (!var9.field_b) {
                                break L25;
                              } else {
                                if (qe.field_b[9]) {
                                  break L25;
                                } else {
                                  var11++;
                                  continue L6;
                                }
                              }
                            }
                            L26: {
                              var25 = var9.field_U;
                              if (!field_J) {
                                break L26;
                              } else {
                                if (var7 < field_D - db.field_d) {
                                  break L26;
                                } else {
                                  var11++;
                                  continue L6;
                                }
                              }
                            }
                            if (var9.field_b) {
                              field_w[var25 + var9.field_Q * 6].f(var6 + param0, var7 + param1, 82);
                              var11++;
                              continue L6;
                            } else {
                              field_w[var25 + var9.field_Q * 6].f(var6 + param0, var7 + param1);
                              var11++;
                              continue L6;
                            }
                          } else {
                            var11++;
                            continue L6;
                          }
                        } else {
                          var11++;
                          continue L6;
                        }
                      } else {
                        var11++;
                        continue L6;
                      }
                    } else {
                      var11++;
                      continue L6;
                    }
                  } else {
                    var11++;
                    continue L6;
                  }
                } else {
                  var11++;
                  continue L6;
                }
              }
            }
          }
        }
    }

    private final static void d(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        je var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var2 = param0;
        L0: while (true) {
          if (var2 > param1) {
            return;
          } else {
            if (var2 < hf.field_t + 16) {
              var3 = 1;
              L1: while (true) {
                if (var3 <= 30) {
                  var4 = field_I[var3][var2];
                  if (var4.field_s == -1) {
                    if (!var4.field_a) {
                      if (je.c(var3, var2, 1, 1)) {
                        L2: {
                          if (!je.c(var3, var2, 1, 0)) {
                            break L2;
                          } else {
                            if (!je.c(var3, var2 - 1, 1, 1)) {
                              break L2;
                            } else {
                              if (!je.c(var3, var2 - 1, 1, 2)) {
                                break L2;
                              } else {
                                if (!je.c(var3, var2 - 1, 1, 3)) {
                                  break L2;
                                } else {
                                  var3++;
                                  continue L1;
                                }
                              }
                            }
                          }
                        }
                        var4.field_s = 0;
                        var5 = var3;
                        var6 = var3;
                        var7 = var2;
                        var8 = var2;
                        var9 = 0;
                        L3: while (true) {
                          if (var9 < 50) {
                            var10 = var5;
                            L4: while (true) {
                              if (var10 > var6) {
                                var9++;
                                continue L3;
                              } else {
                                var11 = var7;
                                L5: while (true) {
                                  if (var11 > var8) {
                                    var10++;
                                    continue L4;
                                  } else {
                                    if (field_I[var10][var11].field_s == var9) {
                                      L6: {
                                        if (var10 != var5) {
                                          if (var10 == var6) {
                                            if (var10 >= 30) {
                                              break L6;
                                            } else {
                                              var6++;
                                              break L6;
                                            }
                                          } else {
                                            if (var10 != var6) {
                                              break L6;
                                            } else {
                                              if (var10 >= 30) {
                                                break L6;
                                              } else {
                                                var6++;
                                                break L6;
                                              }
                                            }
                                          }
                                        } else {
                                          if (var10 != var6) {
                                            break L6;
                                          } else {
                                            if (var10 >= 30) {
                                              break L6;
                                            } else {
                                              var6++;
                                              break L6;
                                            }
                                          }
                                        }
                                      }
                                      L7: {
                                        if (var11 != var7) {
                                          if (var11 == var8) {
                                            if (var11 >= param1) {
                                              break L7;
                                            } else {
                                              var8++;
                                              break L7;
                                            }
                                          } else {
                                            if (var11 != var8) {
                                              break L7;
                                            } else {
                                              if (var11 >= param1) {
                                                break L7;
                                              } else {
                                                var8++;
                                                break L7;
                                              }
                                            }
                                          }
                                        } else {
                                          if (var11 != var8) {
                                            break L7;
                                          } else {
                                            if (var11 >= param1) {
                                              break L7;
                                            } else {
                                              var8++;
                                              break L7;
                                            }
                                          }
                                        }
                                      }
                                      L8: {
                                        if (field_I[var10 - 1][var11].field_s != -1) {
                                          break L8;
                                        } else {
                                          field_I[var10 - 1][var11].field_s = var9 + 1;
                                          break L8;
                                        }
                                      }
                                      L9: {
                                        if (field_I[var10 + 1][var11].field_s != -1) {
                                          break L9;
                                        } else {
                                          field_I[var10 + 1][var11].field_s = var9 + 1;
                                          break L9;
                                        }
                                      }
                                      L10: {
                                        if (field_I[var10][var11 - 1].field_s != -1) {
                                          break L10;
                                        } else {
                                          field_I[var10][var11 - 1].field_s = var9 + 1;
                                          break L10;
                                        }
                                      }
                                      L11: {
                                        if (field_I[var10][var11 + 1].field_s != -1) {
                                          break L11;
                                        } else {
                                          field_I[var10][var11 + 1].field_s = var9 + 1;
                                          break L11;
                                        }
                                      }
                                      L12: {
                                        if (field_I[var10 - 1][var11 - 1].field_s != -1) {
                                          break L12;
                                        } else {
                                          field_I[var10 - 1][var11 - 1].field_s = var9 + 1;
                                          break L12;
                                        }
                                      }
                                      L13: {
                                        if (field_I[var10 + 1][var11 - 1].field_s != -1) {
                                          break L13;
                                        } else {
                                          field_I[var10 + 1][var11 - 1].field_s = var9 + 1;
                                          break L13;
                                        }
                                      }
                                      L14: {
                                        if (field_I[var10 - 1][var11 + 1].field_s != -1) {
                                          break L14;
                                        } else {
                                          field_I[var10 - 1][var11 + 1].field_s = var9 + 1;
                                          break L14;
                                        }
                                      }
                                      L15: {
                                        if (field_I[var10 + 1][var11 + 1].field_s != -1) {
                                          break L15;
                                        } else {
                                          field_I[var10 + 1][var11 + 1].field_s = var9 + 1;
                                          break L15;
                                        }
                                      }
                                      if (!je.c(var10, var11 - 1, 1, 1)) {
                                        if (!field_I[var10][var11 - 1].field_a) {
                                          if (var11 > var2) {
                                            L16: {
                                              var12 = 0;
                                              if (!je.c(var3, var2, 1, 1)) {
                                                break L16;
                                              } else {
                                                if (je.c(var10, var11 - 1, 1, 3)) {
                                                  break L16;
                                                } else {
                                                  var13 = var3;
                                                  var14 = var2;
                                                  field_O.a((var14 << 2) + 1, false, (var13 << 2) + 1, 74);
                                                  var13 = var10;
                                                  var14 = var11 - 1;
                                                  field_O.a((var14 << 2) + 3, true, (var13 << 2) + 1, 119);
                                                  var12 = 1;
                                                  break L16;
                                                }
                                              }
                                            }
                                            L17: {
                                              if (var12 != 0) {
                                                break L17;
                                              } else {
                                                if (!je.c(var3, var2, 1, 1)) {
                                                  break L17;
                                                } else {
                                                  if (je.c(var10, var11 - 1, 1, 2)) {
                                                    break L17;
                                                  } else {
                                                    var13 = var3;
                                                    var14 = var2;
                                                    field_O.a((var14 << 2) + 1, false, (var13 << 2) + 1, 51);
                                                    var13 = var10;
                                                    var14 = var11 - 1;
                                                    field_O.a((var14 << 2) + 2, true, (var13 << 2) + 1, 74);
                                                    var12 = 1;
                                                    break L17;
                                                  }
                                                }
                                              }
                                            }
                                            L18: {
                                              if (var12 != 0) {
                                                break L18;
                                              } else {
                                                if (!je.c(var3, var2, 1, 1)) {
                                                  break L18;
                                                } else {
                                                  if (je.c(var10, var11 - 1, 1, 1)) {
                                                    break L18;
                                                  } else {
                                                    var13 = var3;
                                                    var14 = var2;
                                                    field_O.a((var14 << 2) + 1, false, (var13 << 2) + 1, -115);
                                                    var13 = var10;
                                                    var14 = var11 - 1;
                                                    field_O.a((var14 << 2) + 1, true, (var13 << 2) + 1, -74);
                                                    break L18;
                                                  }
                                                }
                                              }
                                            }
                                            var9 = 50;
                                            var10 = var6 + 1;
                                            var11 = var8 + 1;
                                            var11++;
                                            continue L5;
                                          } else {
                                            var11++;
                                            continue L5;
                                          }
                                        } else {
                                          var11++;
                                          continue L5;
                                        }
                                      } else {
                                        var11++;
                                        continue L5;
                                      }
                                    } else {
                                      var11++;
                                      continue L5;
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            var3++;
                            continue L1;
                          }
                        }
                      } else {
                        var3++;
                        continue L1;
                      }
                    } else {
                      var3++;
                      continue L1;
                    }
                  } else {
                    var3++;
                    continue L1;
                  }
                } else {
                  var2++;
                  continue L0;
                }
              }
            } else {
              var2++;
              continue L0;
            }
          }
        }
    }

    final static int e(int param0, int param1, int param2, int param3) {
        return field_O.a((byte) -114, (param1 << 2) + param3, (param0 << 2) + param2);
    }

    private final static void a(int param0, int param1, ea param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ea var8_ref_ea = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ea var12_ref_ea = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          if (il.e(-31391)) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var3 = stackIn_3_0;
          var4 = ca.c(-2302) ? 1 : 0;
          if (var4 == 0) {
            if (tb.field_c >= 0) {
              stackOut_7_0 = 1;
              stackIn_9_0 = stackOut_7_0;
              break L1;
            } else {
              stackOut_6_0 = 0;
              stackIn_9_0 = stackOut_6_0;
              break L1;
            }
          } else {
            stackOut_4_0 = 0;
            stackIn_9_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var5 = stackIn_9_0;
          var6 = ca.field_k * 32 - li.field_c + sk.field_d / 10;
          var7 = hf.field_t * 32 - db.field_d + mf.field_i / 10;
          if (var3 == 0) {
            break L2;
          } else {
            if (var4 != 0) {
              break L2;
            } else {
              L3: {
                if (!fn.a(true)) {
                  if (ch.field_h == 5) {
                    break L3;
                  } else {
                    if (var5 == 0) {
                      break L3;
                    } else {
                      if (!field_I[ca.field_k][hf.field_t].field_A) {
                        break L3;
                      } else {
                        L4: {
                          if (ch.field_h != 5) {
                            if (var5 == 0) {
                              var8_ref_ea = eg.field_m[-tb.field_c];
                              break L4;
                            } else {
                              var8_ref_ea = pk.field_h[tb.field_c];
                              break L4;
                            }
                          } else {
                            var8_ref_ea = lb.field_x[tb.field_c];
                            break L4;
                          }
                        }
                        if (di.field_K < 0) {
                          var8_ref_ea.e().a(var6 - 4, var7 - 4, 9348351);
                          break L3;
                        } else {
                          var8_ref_ea.a(var6 - 4, var7 - 4, 9348351);
                          break L3;
                        }
                      }
                    }
                  }
                } else {
                  L5: {
                    var8 = ca.field_k * 4 + sk.field_d / 80 - 1;
                    var9 = hf.field_t * 4 + mf.field_i / 80 - 1;
                    var10 = var8 * 8 - li.field_c;
                    var11 = var9 * 8 - db.field_d;
                    if (ch.field_h != 5) {
                      if (var5 == 0) {
                        var12_ref_ea = eg.field_m[-tb.field_c];
                        break L5;
                      } else {
                        var12_ref_ea = pk.field_h[tb.field_c];
                        break L5;
                      }
                    } else {
                      var12_ref_ea = lb.field_x[tb.field_c];
                      break L5;
                    }
                  }
                  var13 = 0;
                  L6: while (true) {
                    if (var13 > 5) {
                      eh.a();
                      break L3;
                    } else {
                      var14 = var9;
                      var11 = var9 * 8 - db.field_d;
                      var15 = 0;
                      L7: while (true) {
                        if (var15 > 5) {
                          var10 += 8;
                          var8++;
                          var13++;
                          continue L6;
                        } else {
                          if (field_O.a(var8, var14, (byte) 61)) {
                            eh.a(var10, var11, var10 + 8, var11 + 8);
                            if (di.field_K >= 0) {
                              param2.e(var6 + param0 / 2 - 4, var7 + param1 / 2 - 4, 1);
                              var12_ref_ea.e(var6 + param0 / 2 - 4, var7 + param1 / 2 - 4, 11243013);
                              var14++;
                              var11 += 8;
                              var15++;
                              continue L7;
                            } else {
                              param2.e().e(var6 + param0 / 2 - 4, var7 + param1 / 2 - 4, 1);
                              var12_ref_ea.e().e(var6 + param0 / 2 - 4, var7 + param1 / 2 - 4, 11243013);
                              var14++;
                              var11 += 8;
                              var15++;
                              continue L7;
                            }
                          } else {
                            var14++;
                            var11 += 8;
                            var15++;
                            continue L7;
                          }
                        }
                      }
                    }
                  }
                }
              }
              L8: {
                var8 = var6 - pd.field_a.field_x - 1;
                var9 = var7 - 1;
                var10 = kn.field_E;
                if (!qe.field_b[19]) {
                  if (!qe.field_b[2]) {
                    if (var10 >= 450) {
                      break L8;
                    } else {
                      L9: {
                        var11 = 0;
                        if (var10 >= 250) {
                          break L9;
                        } else {
                          if (var10 / 10 % 2 != 0) {
                            break L9;
                          } else {
                            var11 = 16711680;
                            eh.c(var8 + (pd.field_a.field_x >> 1), var9 + (pd.field_a.field_A >> 1), pd.field_a.field_A >> 1, var11);
                            break L9;
                          }
                        }
                      }
                      L10: {
                        if (var10 >= 100) {
                          break L10;
                        } else {
                          if (var10 / 10 % 2 != 1) {
                            break L10;
                          } else {
                            var11 = 16776960;
                            eh.c(var8 + (pd.field_a.field_x >> 1), var9 + (pd.field_a.field_A >> 1), pd.field_a.field_A >> 1, var11);
                            break L10;
                          }
                        }
                      }
                      L11: {
                        if (var10 >= 50) {
                          break L11;
                        } else {
                          if (var10 / 25 % 2 != 0) {
                            break L11;
                          } else {
                            var11 = 16777215;
                            eh.c(var8 + (pd.field_a.field_x >> 1), var9 + (pd.field_a.field_A >> 1), pd.field_a.field_A >> 1, var11);
                            break L11;
                          }
                        }
                      }
                      L12: {
                        var11 = 10341850;
                        var12 = var10 * pd.field_a.field_A / 450;
                        if (var12 <= 0) {
                          break L12;
                        } else {
                          eh.a(var8, var9 + (pd.field_a.field_A - var12), var8 + pd.field_a.field_x + 2, var9 + pd.field_a.field_A + 2);
                          eh.c(var8 + (pd.field_a.field_x >> 1), var9 + (pd.field_a.field_A >> 1), pd.field_a.field_A >> 1, var11);
                          eh.a();
                          break L12;
                        }
                      }
                      pd.field_a.f(var8, var9, 100);
                      break L8;
                    }
                  } else {
                    if (var10 >= 950) {
                      break L8;
                    } else {
                      L13: {
                        var11 = 0;
                        if (var10 >= 250) {
                          break L13;
                        } else {
                          if (var10 / 10 % 2 != 0) {
                            break L13;
                          } else {
                            var11 = 16711680;
                            eh.c(var8 + (pd.field_a.field_x >> 1), var9 + (pd.field_a.field_A >> 1), pd.field_a.field_A >> 1, var11);
                            break L13;
                          }
                        }
                      }
                      L14: {
                        if (var10 >= 100) {
                          break L14;
                        } else {
                          if (var10 / 10 % 2 != 1) {
                            break L14;
                          } else {
                            var11 = 16776960;
                            eh.c(var8 + (pd.field_a.field_x >> 1), var9 + (pd.field_a.field_A >> 1), pd.field_a.field_A >> 1, var11);
                            break L14;
                          }
                        }
                      }
                      L15: {
                        if (var10 >= 50) {
                          break L15;
                        } else {
                          if (var10 / 25 % 2 != 0) {
                            break L15;
                          } else {
                            var11 = 16777215;
                            eh.c(var8 + (pd.field_a.field_x >> 1), var9 + (pd.field_a.field_A >> 1), pd.field_a.field_A >> 1, var11);
                            break L15;
                          }
                        }
                      }
                      L16: {
                        var11 = 10341850;
                        var12 = var10 * pd.field_a.field_A / 950;
                        if (var12 <= 0) {
                          break L16;
                        } else {
                          eh.a(var8, var9 + (pd.field_a.field_A - var12), var8 + pd.field_a.field_x + 2, var9 + pd.field_a.field_A + 2);
                          eh.c(var8 + (pd.field_a.field_x >> 1), var9 + (pd.field_a.field_A >> 1), pd.field_a.field_A >> 1, var11);
                          eh.a();
                          break L16;
                        }
                      }
                      pd.field_a.f(var8, var9, 100);
                      break L8;
                    }
                  }
                } else {
                  if (var10 >= 1950) {
                    break L8;
                  } else {
                    L17: {
                      var11 = 0;
                      if (var10 >= 250) {
                        break L17;
                      } else {
                        if (var10 / 10 % 2 != 0) {
                          break L17;
                        } else {
                          var11 = 16711680;
                          eh.c(var8 + (pd.field_a.field_x >> 1), var9 + (pd.field_a.field_A >> 1), pd.field_a.field_A >> 1, var11);
                          break L17;
                        }
                      }
                    }
                    L18: {
                      if (var10 >= 100) {
                        break L18;
                      } else {
                        if (var10 / 10 % 2 != 1) {
                          break L18;
                        } else {
                          var11 = 16776960;
                          eh.c(var8 + (pd.field_a.field_x >> 1), var9 + (pd.field_a.field_A >> 1), pd.field_a.field_A >> 1, var11);
                          break L18;
                        }
                      }
                    }
                    L19: {
                      if (var10 >= 50) {
                        break L19;
                      } else {
                        if (var10 / 25 % 2 != 0) {
                          break L19;
                        } else {
                          var11 = 16777215;
                          eh.c(var8 + (pd.field_a.field_x >> 1), var9 + (pd.field_a.field_A >> 1), pd.field_a.field_A >> 1, var11);
                          break L19;
                        }
                      }
                    }
                    L20: {
                      var11 = 10341850;
                      var12 = var10 * pd.field_a.field_A / 1950;
                      if (var12 <= 0) {
                        break L20;
                      } else {
                        eh.a(var8, var9 + (pd.field_a.field_A - var12), var8 + pd.field_a.field_x + 2, var9 + pd.field_a.field_A + 2);
                        eh.c(var8 + (pd.field_a.field_x >> 1), var9 + (pd.field_a.field_A >> 1), pd.field_a.field_A >> 1, var11);
                        eh.a();
                        break L20;
                      }
                    }
                    pd.field_a.f(var8, var9, 100);
                    eh.d(var8 + (pd.field_a.field_x >> 1), var9 + (pd.field_a.field_A >> 1), (pd.field_a.field_A >> 1) + 2, 16774927);
                    break L8;
                  }
                }
              }
              if (qe.field_b[16]) {
                break L2;
              } else {
                var11 = cn.field_C;
                if (var11 >= 0) {
                  break L2;
                } else {
                  L21: {
                    L22: {
                      var12 = var6 + 28;
                      var13 = var7 - 1;
                      var14 = var11 * 16 / -300;
                      var15 = kc.field_a.field_C;
                      var16 = var15 - var14;
                      kc.field_a.g();
                      eh.d();
                      eh.a(0, var14, kc.field_a.field_y, var15);
                      eh.c(0, 0, 8, var15, 16722703, 1562103);
                      eh.a();
                      if (var16 >= var15 / 2) {
                        break L22;
                      } else {
                        if (ce.field_b % 10 >= 5) {
                          break L22;
                        } else {
                          rf.field_d.a(0, 0, 16711680);
                          break L21;
                        }
                      }
                    }
                    rf.field_d.f(0, 0);
                    break L21;
                  }
                  bj.field_e.a((byte) -45);
                  eh.a(var12, var13, var12 + pn.field_c.field_a, var13 + pn.field_c.field_f);
                  kc.field_a.a(pn.field_c, var12, var13);
                  eh.a();
                  break L2;
                }
              }
            }
          }
        }
    }

    final static void j() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var0 = li.field_c / 32;
          var1 = (640 + li.field_c) / 32;
          var2 = db.field_d / 32 - field_W;
          var3 = (640 + db.field_d) / 32 + field_M;
          if (var0 >= 1) {
            break L0;
          } else {
            var0 = 1;
            break L0;
          }
        }
        L1: {
          if (var1 <= 30) {
            break L1;
          } else {
            var1 = 30;
            break L1;
          }
        }
        L2: {
          var0 = 1;
          var1 = 30;
          if (var2 >= 1) {
            break L2;
          } else {
            var2 = 1;
            break L2;
          }
        }
        L3: {
          if (var3 <= field_t - 2) {
            break L3;
          } else {
            var3 = field_t - 2;
            break L3;
          }
        }
        var4 = var2;
        L4: while (true) {
          if (var4 > var3) {
            return;
          } else {
            if (var4 < hf.field_t + 16) {
              var5 = var0;
              L5: while (true) {
                if (var5 <= var1) {
                  L6: {
                    if (field_I[var5][var4].field_i <= 128) {
                      break L6;
                    } else {
                      field_I[var5][var4].field_V = true;
                      break L6;
                    }
                  }
                  L7: {
                    if (!field_I[var5][var4].field_e) {
                      break L7;
                    } else {
                      L8: {
                        if (field_I[var5][var4].field_a) {
                          break L8;
                        } else {
                          if (je.c(var5, var4, 1, 1)) {
                            break L8;
                          } else {
                            if (field_I[var5][var4].field_i >= 80) {
                              break L7;
                            } else {
                              field_I[var5][var4].field_i = 80;
                              break L7;
                            }
                          }
                        }
                      }
                      field_I[var5][var4].field_e = false;
                      break L7;
                    }
                  }
                  L9: {
                    if (!field_I[var5][var4].field_V) {
                      break L9;
                    } else {
                      if (field_I[var5][var4].field_a) {
                        break L9;
                      } else {
                        field_I[var5 - 1][var4].field_V = true;
                        field_I[var5 + 1][var4].field_V = true;
                        field_I[var5][var4 - 1].field_V = true;
                        field_I[var5 - 1][var4 - 1].field_V = true;
                        field_I[var5 + 1][var4 - 1].field_V = true;
                        field_I[var5 - 1][var4 + 1].field_V = true;
                        field_I[var5 + 1][var4 + 1].field_V = true;
                        field_I[var5 - 1][var4 - 1].field_V = true;
                        field_I[var5 - 1][var4 + 1].field_V = true;
                        field_I[var5 + 1][var4 - 1].field_V = true;
                        field_I[var5 + 1][var4 + 1].field_V = true;
                        break L9;
                      }
                    }
                  }
                  L10: {
                    L11: {
                      var6 = field_I[var5][var4].field_i - 16;
                      if (field_I[var5][var4].field_a) {
                        break L11;
                      } else {
                        if (field_I[var5][var4].field_V) {
                          break L10;
                        } else {
                          break L11;
                        }
                      }
                    }
                    var6 = var6 - 64;
                    break L10;
                  }
                  L12: {
                    if (!je.c(var5, var4, 1, 1)) {
                      break L12;
                    } else {
                      if (!field_I[var5][var4].field_V) {
                        break L12;
                      } else {
                        var6 = var6 - 32;
                        break L12;
                      }
                    }
                  }
                  var7 = var5 - 1;
                  L13: while (true) {
                    if (var7 > var5 + 1) {
                      var5++;
                      continue L5;
                    } else {
                      var8 = var4 - 1;
                      L14: while (true) {
                        if (var8 > var4 + 1) {
                          var7++;
                          continue L13;
                        } else {
                          if (field_I[var7][var8].field_i < var6) {
                            field_I[var7][var8].field_i = var6;
                            var8++;
                            continue L14;
                          } else {
                            var8++;
                            continue L14;
                          }
                        }
                      }
                    }
                  }
                } else {
                  var4++;
                  continue L4;
                }
              }
            } else {
              var4++;
              continue L4;
            }
          }
        }
    }

    private final static void b() {
        field_I[16][0].field_V = true;
        field_I[16][0].field_a = false;
        field_I[16][1].field_V = true;
        field_I[16][1].field_a = false;
        field_I[16][2].field_V = true;
        field_I[16][2].field_a = false;
        field_I[16][3].field_V = true;
        field_I[16][3].field_a = false;
        field_I[16][4].field_V = true;
        field_I[16][4].field_a = false;
        field_I[16][5].field_V = true;
        field_I[16][5].field_a = true;
        field_I[16][5].field_b = true;
        field_I[15][4].field_V = true;
        field_I[15][4].field_a = false;
        field_I[14][4].field_V = true;
        field_I[14][4].field_a = false;
        field_I[17][4].field_V = true;
        field_I[17][4].field_a = false;
        field_I[18][4].field_V = true;
        field_I[18][4].field_a = false;
    }

    final static je[][] i() {
        int var1 = 0;
        int var0 = 0;
        field_t = 0;
        field_H = 0;
        field_I = new je[32][24 * field_N[cm.field_o]];
        for (var0 = 0; var0 < 32; var0++) {
            for (var1 = 0; var1 < 24 * field_N[cm.field_o]; var1++) {
                field_I[var0][var1] = new je();
            }
        }
        field_u = -1;
        je.f();
        field_O = new rb(32, 24 * field_N[cm.field_o]);
        je.k();
        je.k();
        if (qe.field_b[10]) {
            for (var0 = 0; var0 < 5; var0++) {
                je.k();
            }
            for (var0 = 4; var0 < field_t - 1; var0++) {
                field_I[18][var0].field_a = false;
                field_I[18][var0].field_V = true;
            }
        }
        je.b();
        return field_I;
    }

    final static boolean a() {
        return field_O.c(121, (hf.field_t << 2) + (mf.field_i + 160) / 80, (ca.field_k << 2) + (sk.field_d + 160) / 80);
    }

    private final void h() {
        this.field_Q = (int)(Math.random() * 2.0);
        this.field_q = 0;
        this.field_a = true;
        this.field_U = -1;
        this.field_S = false;
        this.field_b = false;
        this.field_V = false;
        this.field_v = false;
        this.field_i = 0;
        this.field_A = false;
        this.field_r = (int)(Math.random() * 1000.0 + 0.0);
    }

    final static void k() {
        int var0 = 0;
        int var1 = 0;
        ea var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var0 = 0;
          if (field_u == field_N[cm.field_o]) {
            break L0;
          } else {
            if (field_u == -1) {
              field_u = field_u + 1;
              break L0;
            } else {
              field_u = field_u + (int)(Math.random() * 3.0 + 1.0);
              if (field_u < field_N[cm.field_o]) {
                if (cm.field_o != 1) {
                  break L0;
                } else {
                  if (field_T >= 0) {
                    break L0;
                  } else {
                    if (field_u < field_N[cm.field_o] - 3) {
                      break L0;
                    } else {
                      field_T = ll.a((byte) -73, 5);
                      field_o = 16 - (ll.a((byte) -73, 16) - 8);
                      field_f = field_t + ll.a((byte) -73, 24);
                      var0 = 1;
                      break L0;
                    }
                  }
                }
              } else {
                field_u = field_N[cm.field_o];
                if (me.field_h >= 2000) {
                  break L0;
                } else {
                  fn.a(31, 224, 3);
                  break L0;
                }
              }
            }
          }
        }
        L1: {
          field_H = field_H + 24;
          if (field_u != field_N[cm.field_o]) {
            break L1;
          } else {
            me.a(cm.field_o, false);
            break L1;
          }
        }
        L2: {
          if (rg.field_sb <= 0) {
            break L2;
          } else {
            if (field_u != field_N[cm.field_o]) {
              break L2;
            } else {
              if (!ke.field_V) {
                break L2;
              } else {
                fn.a(10, 245, 3);
                if (a.field_c != 0) {
                  break L2;
                } else {
                  fn.a(30, 225, 3);
                  break L2;
                }
              }
            }
          }
        }
        L3: {
          var1 = field_t;
          field_t = field_t + 24;
          je.b(var1);
          mh.field_e = field_I;
          q.field_b = field_I;
          if (field_u == field_N[cm.field_o]) {
            break L3;
          } else {
            if (!d.field_b) {
              break L3;
            } else {
              if (!ke.field_V) {
                break L3;
              } else {
                L4: {
                  if (field_u <= 1) {
                    break L4;
                  } else {
                    je.c(var1);
                    je.a(var1);
                    break L4;
                  }
                }
                if (field_u <= 10) {
                  break L3;
                } else {
                  je.a(var1);
                  break L3;
                }
              }
            }
          }
        }
        L5: {
          if (var0 == 0) {
            break L5;
          } else {
            var2 = je.e();
            var3 = var2.field_x / 32;
            var4 = var2.field_A / 32;
            var5 = field_o;
            L6: while (true) {
              if (var5 >= field_o + var3) {
                break L5;
              } else {
                var6 = field_f;
                L7: while (true) {
                  if (var6 >= field_f + var4) {
                    var5++;
                    continue L6;
                  } else {
                    field_I[var5][var6].field_a = false;
                    field_I[var5][var6].field_E = false;
                    field_I[var5][var6].field_v = false;
                    field_I[var5][var6].field_b = false;
                    field_O.b(124, var5, var6);
                    var6++;
                    continue L7;
                  }
                }
              }
            }
          }
        }
    }

    private final static void a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        var2 = param0;
        L0: while (true) {
          if (var2 > param1) {
            return;
          } else {
            if (var2 < hf.field_t + 16) {
              L1: {
                if ((var2 & 1) != 0) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
              L2: {
                var3 = stackIn_7_0;
                if (var3 == 0) {
                  stackOut_9_0 = -1;
                  stackIn_10_0 = stackOut_9_0;
                  break L2;
                } else {
                  stackOut_8_0 = 1;
                  stackIn_10_0 = stackOut_8_0;
                  break L2;
                }
              }
              L3: {
                var4 = stackIn_10_0;
                var5 = 0;
                if (var3 == 0) {
                  stackOut_12_0 = 30;
                  stackIn_13_0 = stackOut_12_0;
                  break L3;
                } else {
                  stackOut_11_0 = 1;
                  stackIn_13_0 = stackOut_11_0;
                  break L3;
                }
              }
              var6 = stackIn_13_0;
              L4: while (true) {
                if (var5 < 29) {
                  L5: {
                    if (!field_I[var6][var2].field_A) {
                      L6: {
                        if (!field_O.b(var6, var2, (byte) 84)) {
                          if (field_I[var6][var2].field_E) {
                            break L6;
                          } else {
                            if (field_I[var6][var2].field_q >= 0) {
                              break L6;
                            } else {
                              field_I[var6][var2].field_q = field_I[var6][var2].field_q + 1;
                              break L6;
                            }
                          }
                        } else {
                          L7: {
                            if (0 <= field_I[var6 + 1][var2].field_q) {
                              break L7;
                            } else {
                              field_I[var6 + 1][var2].field_q = field_I[var6 + 1][var2].field_q + 4;
                              break L7;
                            }
                          }
                          L8: {
                            if (field_I[var6 + 1][var2].field_S) {
                              break L8;
                            } else {
                              field_I[var6 + 1][var2].field_S = true;
                              field_I[var6 + 1][var2].field_r = 500;
                              break L8;
                            }
                          }
                          L9: {
                            if (0 <= field_I[var6 - 1][var2].field_q) {
                              break L9;
                            } else {
                              field_I[var6 - 1][var2].field_q = field_I[var6 - 1][var2].field_q + 4;
                              break L9;
                            }
                          }
                          L10: {
                            if (field_I[var6 - 1][var2].field_S) {
                              break L10;
                            } else {
                              field_I[var6 - 1][var2].field_S = true;
                              field_I[var6 - 1][var2].field_r = 500;
                              break L10;
                            }
                          }
                          L11: {
                            if (0 <= field_I[var6][var2 + 1].field_q) {
                              break L11;
                            } else {
                              field_I[var6][var2 + 1].field_q = field_I[var6][var2 + 1].field_q + 4;
                              break L11;
                            }
                          }
                          L12: {
                            if (field_I[var6][var2 - 1].field_S) {
                              break L12;
                            } else {
                              field_I[var6][var2 - 1].field_S = true;
                              field_I[var6][var2 - 1].field_r = 500;
                              break L12;
                            }
                          }
                          L13: {
                            if (0 <= field_I[var6][var2 - 1].field_q) {
                              break L13;
                            } else {
                              field_I[var6][var2 - 1].field_q = field_I[var6][var2 - 1].field_q + 4;
                              break L13;
                            }
                          }
                          if (field_I[var6][var2 + 1].field_S) {
                            break L6;
                          } else {
                            field_I[var6][var2 + 1].field_S = true;
                            field_I[var6][var2 + 1].field_r = 500;
                            break L6;
                          }
                        }
                      }
                      if (!field_I[var6][var2].field_a) {
                        break L5;
                      } else {
                        if (!field_I[var6][var2].field_E) {
                          if (field_I[var6][var2].field_q < -200) {
                            field_I[var6][var2].field_E = true;
                            field_I[var6][var2].field_v = false;
                            field_I[var6][var2].field_S = false;
                            break L5;
                          } else {
                            if (!field_I[var6][var2].field_E) {
                              break L5;
                            } else {
                              if (field_I[var6][var2].field_q <= -50) {
                                break L5;
                              } else {
                                field_I[var6][var2].field_E = false;
                                break L5;
                              }
                            }
                          }
                        } else {
                          if (!field_I[var6][var2].field_E) {
                            break L5;
                          } else {
                            if (field_I[var6][var2].field_q <= -50) {
                              break L5;
                            } else {
                              field_I[var6][var2].field_E = false;
                              break L5;
                            }
                          }
                        }
                      }
                    } else {
                      L14: {
                        if (-400 >= field_I[var6 + 1][var2].field_q) {
                          break L14;
                        } else {
                          field_I[var6 + 1][var2].field_q = field_I[var6 + 1][var2].field_q - 2;
                          break L14;
                        }
                      }
                      L15: {
                        if (-400 >= field_I[var6 - 1][var2].field_q) {
                          break L15;
                        } else {
                          field_I[var6 - 1][var2].field_q = field_I[var6 - 1][var2].field_q - 2;
                          break L15;
                        }
                      }
                      L16: {
                        if (-400 >= field_I[var6][var2 + 1].field_q) {
                          break L16;
                        } else {
                          field_I[var6][var2 + 1].field_q = field_I[var6][var2 + 1].field_q - 2;
                          break L16;
                        }
                      }
                      if (-400 >= field_I[var6][var2 - 1].field_q) {
                        break L5;
                      } else {
                        field_I[var6][var2 - 1].field_q = field_I[var6][var2 - 1].field_q - 2;
                        break L5;
                      }
                    }
                  }
                  var6 = var6 + var4;
                  var5++;
                  continue L4;
                } else {
                  var2++;
                  continue L0;
                }
              }
            } else {
              var2++;
              continue L0;
            }
          }
        }
    }

    private final static void f(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var2 = param0;
        L0: while (true) {
          if (var2 > param1) {
            return;
          } else {
            if (var2 < hf.field_t + 16) {
              var3 = 1;
              L1: while (true) {
                if (var3 <= 30) {
                  if (field_I[var3][var2].field_A) {
                    L2: {
                      if (field_I[var3][var2].field_a) {
                        break L2;
                      } else {
                        L3: {
                          if (je.c(var3, var2, 1, 3)) {
                            break L3;
                          } else {
                            if (je.b(var3, var2, 1, 3)) {
                              break L3;
                            } else {
                              break L2;
                            }
                          }
                        }
                        L4: {
                          if (!je.c(var3 + 1, var2, 1, 3)) {
                            break L4;
                          } else {
                            field_I[var3 + 1][var2].field_A = true;
                            break L4;
                          }
                        }
                        L5: {
                          if (!je.c(var3 - 1, var2, 1, 3)) {
                            break L5;
                          } else {
                            field_I[var3 - 1][var2].field_A = true;
                            break L5;
                          }
                        }
                        L6: {
                          if (!je.c(var3, var2 - 1, 1, 3)) {
                            break L6;
                          } else {
                            field_I[var3][var2 - 1].field_A = true;
                            break L6;
                          }
                        }
                        L7: {
                          if (!je.c(var3, var2 + 1, 1, 3)) {
                            break L7;
                          } else {
                            field_I[var3][var2 + 1].field_A = true;
                            break L7;
                          }
                        }
                        L8: {
                          if (!je.c(var3 + 1, var2 + 1, 1, 3)) {
                            break L8;
                          } else {
                            field_I[var3 + 1][var2 + 1].field_A = true;
                            break L8;
                          }
                        }
                        L9: {
                          if (!je.c(var3 + 1, var2 - 1, 1, 3)) {
                            break L9;
                          } else {
                            field_I[var3 + 1][var2 - 1].field_A = true;
                            break L9;
                          }
                        }
                        L10: {
                          if (!je.c(var3 - 1, var2 + 1, 1, 3)) {
                            break L10;
                          } else {
                            field_I[var3 - 1][var2 + 1].field_A = true;
                            break L10;
                          }
                        }
                        if (je.c(var3 - 1, var2 - 1, 1, 3)) {
                          field_I[var3 - 1][var2 - 1].field_A = true;
                          var3++;
                          continue L1;
                        } else {
                          var3++;
                          continue L1;
                        }
                      }
                    }
                    field_I[var3][var2].field_A = false;
                    var3++;
                    continue L1;
                  } else {
                    var3++;
                    continue L1;
                  }
                } else {
                  var2++;
                  continue L0;
                }
              }
            } else {
              var2++;
              continue L0;
            }
          }
        }
    }

    private final static void h(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        int stackIn_55_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_57_1 = 0;
        int stackIn_63_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_65_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_38_1 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        int stackOut_46_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        int stackOut_47_0 = 0;
        int stackOut_47_1 = 0;
        int stackOut_54_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_56_1 = 0;
        int stackOut_55_0 = 0;
        int stackOut_55_1 = 0;
        int stackOut_62_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_64_1 = 0;
        int stackOut_63_0 = 0;
        int stackOut_63_1 = 0;
        var2 = param0;
        L0: while (true) {
          if (var2 > param1) {
            return;
          } else {
            if (var2 < hf.field_t + 16) {
              L1: {
                if ((var2 & 1) != 0) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
              L2: {
                var3 = stackIn_7_0;
                if (var3 == 0) {
                  stackOut_9_0 = -1;
                  stackIn_10_0 = stackOut_9_0;
                  break L2;
                } else {
                  stackOut_8_0 = 1;
                  stackIn_10_0 = stackOut_8_0;
                  break L2;
                }
              }
              L3: {
                var4 = stackIn_10_0;
                var5 = 0;
                if (var3 == 0) {
                  stackOut_12_0 = 30;
                  stackIn_13_0 = stackOut_12_0;
                  break L3;
                } else {
                  stackOut_11_0 = 1;
                  stackIn_13_0 = stackOut_11_0;
                  break L3;
                }
              }
              var6 = stackIn_13_0;
              L4: while (true) {
                if (var5 < 29) {
                  L5: {
                    if (field_I[var6][var2].field_q <= 10) {
                      break L5;
                    } else {
                      if (!field_I[var6][var2].field_a) {
                        break L5;
                      } else {
                        L6: {
                          var7 = 8;
                          var8 = 7;
                          if (field_I[var6][var2].field_q <= 250) {
                            break L6;
                          } else {
                            if (je.e(var6, var2, 1, 1) != 0) {
                              break L6;
                            } else {
                              field_I[var6][var2].field_q = field_I[var6][var2].field_q - 1;
                              break L6;
                            }
                          }
                        }
                        L7: {
                          if (var3 == 0) {
                            break L7;
                          } else {
                            if (var6 <= 1) {
                              break L7;
                            } else {
                              if (field_I[var6 - 1][var2].field_q >= field_I[var6][var2].field_q * var8 / var7) {
                                break L7;
                              } else {
                                L8: {
                                  if (!field_I[var6][var2].field_a) {
                                    var7 = 10;
                                    break L8;
                                  } else {
                                    var7 = 4;
                                    break L8;
                                  }
                                }
                                L9: {
                                  stackOut_27_0 = var7;
                                  stackIn_29_0 = stackOut_27_0;
                                  stackIn_28_0 = stackOut_27_0;
                                  if (!field_I[var6 - 1][var2].field_a) {
                                    stackOut_29_0 = stackIn_29_0;
                                    stackOut_29_1 = 10;
                                    stackIn_30_0 = stackOut_29_0;
                                    stackIn_30_1 = stackOut_29_1;
                                    break L9;
                                  } else {
                                    stackOut_28_0 = stackIn_28_0;
                                    stackOut_28_1 = 4;
                                    stackIn_30_0 = stackOut_28_0;
                                    stackIn_30_1 = stackOut_28_1;
                                    break L9;
                                  }
                                }
                                var9 = stackIn_30_0 + stackIn_30_1;
                                field_I[var6 - 1][var2].field_q = field_I[var6 - 1][var2].field_q + field_I[var6][var2].field_q / var9;
                                field_I[var6][var2].field_q = field_I[var6][var2].field_q - field_I[var6][var2].field_q / var9;
                                break L7;
                              }
                            }
                          }
                        }
                        L10: {
                          if (var6 >= 30) {
                            break L10;
                          } else {
                            if (field_I[var6 + 1][var2].field_q >= field_I[var6][var2].field_q * var8 / var7) {
                              break L10;
                            } else {
                              L11: {
                                if (!field_I[var6][var2].field_a) {
                                  var7 = 10;
                                  break L11;
                                } else {
                                  var7 = 4;
                                  break L11;
                                }
                              }
                              L12: {
                                stackOut_36_0 = var7;
                                stackIn_38_0 = stackOut_36_0;
                                stackIn_37_0 = stackOut_36_0;
                                if (!field_I[var6 + 1][var2].field_a) {
                                  stackOut_38_0 = stackIn_38_0;
                                  stackOut_38_1 = 10;
                                  stackIn_39_0 = stackOut_38_0;
                                  stackIn_39_1 = stackOut_38_1;
                                  break L12;
                                } else {
                                  stackOut_37_0 = stackIn_37_0;
                                  stackOut_37_1 = 4;
                                  stackIn_39_0 = stackOut_37_0;
                                  stackIn_39_1 = stackOut_37_1;
                                  break L12;
                                }
                              }
                              var9 = stackIn_39_0 + stackIn_39_1;
                              field_I[var6 + 1][var2].field_q = field_I[var6 + 1][var2].field_q + field_I[var6][var2].field_q / var9;
                              field_I[var6][var2].field_q = field_I[var6][var2].field_q - field_I[var6][var2].field_q / var9;
                              break L10;
                            }
                          }
                        }
                        L13: {
                          if (var3 != 0) {
                            break L13;
                          } else {
                            if (var6 <= 1) {
                              break L13;
                            } else {
                              if (field_I[var6 - 1][var2].field_q >= field_I[var6][var2].field_q * var8 / var7) {
                                break L13;
                              } else {
                                L14: {
                                  if (!field_I[var6][var2].field_a) {
                                    var7 = 10;
                                    break L14;
                                  } else {
                                    var7 = 4;
                                    break L14;
                                  }
                                }
                                L15: {
                                  stackOut_46_0 = var7;
                                  stackIn_48_0 = stackOut_46_0;
                                  stackIn_47_0 = stackOut_46_0;
                                  if (!field_I[var6 - 1][var2].field_a) {
                                    stackOut_48_0 = stackIn_48_0;
                                    stackOut_48_1 = 10;
                                    stackIn_49_0 = stackOut_48_0;
                                    stackIn_49_1 = stackOut_48_1;
                                    break L15;
                                  } else {
                                    stackOut_47_0 = stackIn_47_0;
                                    stackOut_47_1 = 4;
                                    stackIn_49_0 = stackOut_47_0;
                                    stackIn_49_1 = stackOut_47_1;
                                    break L15;
                                  }
                                }
                                var9 = stackIn_49_0 + stackIn_49_1;
                                field_I[var6 - 1][var2].field_q = field_I[var6 - 1][var2].field_q + field_I[var6][var2].field_q / var9;
                                field_I[var6][var2].field_q = field_I[var6][var2].field_q - field_I[var6][var2].field_q / var9;
                                break L13;
                              }
                            }
                          }
                        }
                        L16: {
                          if (field_I[var6][var2 - 1].field_q >= field_I[var6][var2].field_q * var8 / var7) {
                            break L16;
                          } else {
                            L17: {
                              if (!field_I[var6][var2].field_a) {
                                var7 = 10;
                                break L17;
                              } else {
                                var7 = 4;
                                break L17;
                              }
                            }
                            L18: {
                              stackOut_54_0 = var7;
                              stackIn_56_0 = stackOut_54_0;
                              stackIn_55_0 = stackOut_54_0;
                              if (!field_I[var6][var2 - 1].field_a) {
                                stackOut_56_0 = stackIn_56_0;
                                stackOut_56_1 = 10;
                                stackIn_57_0 = stackOut_56_0;
                                stackIn_57_1 = stackOut_56_1;
                                break L18;
                              } else {
                                stackOut_55_0 = stackIn_55_0;
                                stackOut_55_1 = 4;
                                stackIn_57_0 = stackOut_55_0;
                                stackIn_57_1 = stackOut_55_1;
                                break L18;
                              }
                            }
                            var9 = stackIn_57_0 + stackIn_57_1;
                            field_I[var6][var2 - 1].field_q = field_I[var6][var2 - 1].field_q + field_I[var6][var2].field_q / var9;
                            field_I[var6][var2].field_q = field_I[var6][var2].field_q - field_I[var6][var2].field_q / var9;
                            break L16;
                          }
                        }
                        if (field_I[var6][var2 + 1].field_q >= field_I[var6][var2].field_q * var8 / var7) {
                          break L5;
                        } else {
                          L19: {
                            if (!field_I[var6][var2].field_a) {
                              var7 = 10;
                              break L19;
                            } else {
                              var7 = 4;
                              break L19;
                            }
                          }
                          L20: {
                            stackOut_62_0 = var7;
                            stackIn_64_0 = stackOut_62_0;
                            stackIn_63_0 = stackOut_62_0;
                            if (!field_I[var6][var2 + 1].field_a) {
                              stackOut_64_0 = stackIn_64_0;
                              stackOut_64_1 = 10;
                              stackIn_65_0 = stackOut_64_0;
                              stackIn_65_1 = stackOut_64_1;
                              break L20;
                            } else {
                              stackOut_63_0 = stackIn_63_0;
                              stackOut_63_1 = 4;
                              stackIn_65_0 = stackOut_63_0;
                              stackIn_65_1 = stackOut_63_1;
                              break L20;
                            }
                          }
                          var9 = stackIn_65_0 + stackIn_65_1;
                          field_I[var6][var2 + 1].field_q = field_I[var6][var2 + 1].field_q + field_I[var6][var2].field_q / var9;
                          field_I[var6][var2].field_q = field_I[var6][var2].field_q - field_I[var6][var2].field_q / var9;
                          break L5;
                        }
                      }
                    }
                  }
                  var6 = var6 + var4;
                  var5++;
                  continue L4;
                } else {
                  var2++;
                  continue L0;
                }
              }
            } else {
              var2++;
              continue L0;
            }
          }
        }
    }

    final static void l() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (wj.field_j >= 2) {
          var0 = ne.a(false);
          var1 = 0;
          var2 = 31;
          L0: while (true) {
            if (var2 < 0) {
              System.out.println(field_X + var1 * 2);
              return;
            } else {
              var3 = field_t - 1;
              L1: while (true) {
                if (var3 < 0) {
                  var2--;
                  continue L0;
                } else {
                  if (field_I[var2][var3] != null) {
                    if (field_I[var2][var3].field_U >= 0) {
                      L2: {
                        var4 = 0;
                        var5 = field_I[var2][var3].field_U;
                        if (var5 != 0) {
                          break L2;
                        } else {
                          var4 = 100 * var0;
                          break L2;
                        }
                      }
                      L3: {
                        if (var5 != 1) {
                          break L3;
                        } else {
                          var4 = 250 * var0;
                          break L3;
                        }
                      }
                      L4: {
                        if (var5 != 2) {
                          break L4;
                        } else {
                          var4 = 500 * var0;
                          break L4;
                        }
                      }
                      L5: {
                        if (var5 != 3) {
                          break L5;
                        } else {
                          var4 = 750 * var0;
                          break L5;
                        }
                      }
                      L6: {
                        if (var5 != 4) {
                          break L6;
                        } else {
                          var4 = 2500 * var0;
                          break L6;
                        }
                      }
                      L7: {
                        if (var5 != 5) {
                          break L7;
                        } else {
                          var4 = 1000 * var0;
                          break L7;
                        }
                      }
                      var1 = var1 + var4;
                      var3--;
                      continue L1;
                    } else {
                      var3--;
                      continue L1;
                    }
                  } else {
                    var3--;
                    continue L1;
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    private final static void b(int param0) {
        int incrementValue$1 = 0;
        int var1 = 0;
        ql var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        je stackIn_43_0 = null;
        je stackIn_44_0 = null;
        je stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        je stackOut_42_0 = null;
        je stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        je stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        var1 = (int)(Math.random() * 32.0);
        var2 = fd.a(cm.field_o, -1, field_u);
        var3 = 1;
        L0: while (true) {
          if (var3 >= 31) {
            var3 = 1;
            L1: while (true) {
              if (var3 >= 31) {
                var3 = 10;
                var4 = 0;
                L2: while (true) {
                  L3: {
                    if (var4 > var3) {
                      break L3;
                    } else {
                      L4: {
                        var5 = var4 / 2;
                        if ((var4 & 1) != 0) {
                          var5++;
                          break L4;
                        } else {
                          var5 = var5 * -1;
                          break L4;
                        }
                      }
                      var6 = 16 + var5;
                      var7 = 0;
                      L5: while (true) {
                        if (var7 < 23) {
                          var8 = var7 + param0;
                          if (var8 < field_I[var6].length) {
                            if (field_I[var6][var8].field_U >= 0) {
                              if (field_I[var6][var8].field_U < 3) {
                                if (Math.random() < 0.4) {
                                  var9 = ll.a((byte) -73, 7) + 5;
                                  var10 = 0;
                                  L6: while (true) {
                                    incrementValue$1 = var9;
                                    var9--;
                                    if (incrementValue$1 < 0) {
                                      break L3;
                                    } else {
                                      L7: {
                                        var11 = ll.a((byte) -73, 3) - 1;
                                        if (var10 == 0) {
                                          break L7;
                                        } else {
                                          if (var11 != 0) {
                                            break L7;
                                          } else {
                                            L8: {
                                              if (var6 <= 1) {
                                                break L8;
                                              } else {
                                                if (Math.random() >= 0.5) {
                                                  break L8;
                                                } else {
                                                  var11 = -1;
                                                  break L8;
                                                }
                                              }
                                            }
                                            if (var6 >= 30) {
                                              break L7;
                                            } else {
                                              if (Math.random() >= 0.25) {
                                                break L7;
                                              } else {
                                                var11 = 1;
                                                break L7;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      L9: {
                                        L10: {
                                          if (var11 >= 0) {
                                            break L10;
                                          } else {
                                            if (var6 <= 1) {
                                              break L10;
                                            } else {
                                              field_I[var6 - 1][var8 + 1].field_U = field_I[var6][var8].field_U;
                                              field_I[var6 - 1][var8 + 1].field_a = true;
                                              var6--;
                                              var10 = 0;
                                              break L9;
                                            }
                                          }
                                        }
                                        L11: {
                                          if (var11 <= 0) {
                                            break L11;
                                          } else {
                                            if (var6 >= 30) {
                                              break L11;
                                            } else {
                                              field_I[var6 + 1][var8 + 1].field_U = field_I[var6][var8].field_U;
                                              field_I[var6 + 1][var8 + 1].field_a = true;
                                              var6++;
                                              var10 = 0;
                                              break L9;
                                            }
                                          }
                                        }
                                        if (var10 != 0) {
                                          break L9;
                                        } else {
                                          field_I[var6][var8 + 1].field_U = field_I[var6][var8].field_U;
                                          field_I[var6][var8 + 1].field_a = true;
                                          var10 = 1;
                                          break L9;
                                        }
                                      }
                                      var8++;
                                      if (var8 < field_I[var6].length - 1) {
                                        continue L6;
                                      } else {
                                        break L3;
                                      }
                                    }
                                  }
                                } else {
                                  var7++;
                                  continue L5;
                                }
                              } else {
                                var7++;
                                continue L5;
                              }
                            } else {
                              var7++;
                              continue L5;
                            }
                          } else {
                            var4++;
                            continue L2;
                          }
                        } else {
                          var4++;
                          continue L2;
                        }
                      }
                    }
                  }
                  var4 = 0;
                  var5 = 0;
                  L12: while (true) {
                    if (var5 >= 24) {
                      var4 = 31;
                      var5 = 0;
                      L13: while (true) {
                        if (var5 >= 24) {
                          var4 = 0;
                          L14: while (true) {
                            if (var4 >= 32) {
                              return;
                            } else {
                              L15: {
                                var5 = var4 - 16;
                                if (var5 >= 0) {
                                  break L15;
                                } else {
                                  var5 = -var5;
                                  break L15;
                                }
                              }
                              var6 = 0;
                              L16: while (true) {
                                if (var6 >= 24) {
                                  var4++;
                                  continue L14;
                                } else {
                                  var7 = var6 + param0;
                                  if (var7 <= var5 / 2 + 1) {
                                    L17: {
                                      L18: {
                                        if (var7 < var5 / 2) {
                                          break L18;
                                        } else {
                                          if (var5 == 0) {
                                            break L18;
                                          } else {
                                            field_I[var4][var7].field_b = true;
                                            if (cm.field_o != 1) {
                                              break L17;
                                            } else {
                                              field_I[var4][var7].field_v = true;
                                              break L17;
                                            }
                                          }
                                        }
                                      }
                                      field_I[var4][var7].field_b = false;
                                      break L17;
                                    }
                                    field_I[var4][var7].field_a = true;
                                    field_I[var4][var7].field_U = -1;
                                    var6++;
                                    continue L16;
                                  } else {
                                    var6++;
                                    continue L16;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var6 = var5 + param0;
                          field_I[var4][var6].h();
                          field_I[var4][var6].field_b = true;
                          var5++;
                          continue L13;
                        }
                      }
                    } else {
                      var6 = var5 + param0;
                      field_I[var4][var6].h();
                      field_I[var4][var6].field_b = true;
                      var5++;
                      continue L12;
                    }
                  }
                }
              } else {
                var4 = 0;
                L19: while (true) {
                  if (var4 >= 24) {
                    var3++;
                    continue L1;
                  } else {
                    var5 = var4 + param0;
                    if (field_I[var3][var5].field_U == 5) {
                      L20: {
                        field_I[var3][var5].field_E = false;
                        field_I[var3][var5].field_v = true;
                        if (var3 > 1) {
                          if (!field_I[var3 - 1][var5].field_a) {
                            if (var3 < 30) {
                              if (field_I[var3 + 1][var5].field_a) {
                                field_I[var3 + 1][var5].field_v = true;
                                field_I[var3 + 1][var5].field_E = false;
                                if (var5 <= 1) {
                                  break L20;
                                } else {
                                  if (!field_I[var3][var5 - 1].field_a) {
                                    break L20;
                                  } else {
                                    field_I[var3][var5 - 1].field_v = true;
                                    field_I[var3][var5 - 1].field_E = false;
                                    break L20;
                                  }
                                }
                              } else {
                                if (var5 <= 1) {
                                  break L20;
                                } else {
                                  if (!field_I[var3][var5 - 1].field_a) {
                                    break L20;
                                  } else {
                                    field_I[var3][var5 - 1].field_v = true;
                                    field_I[var3][var5 - 1].field_E = false;
                                    break L20;
                                  }
                                }
                              }
                            } else {
                              if (var5 <= 1) {
                                break L20;
                              } else {
                                if (!field_I[var3][var5 - 1].field_a) {
                                  break L20;
                                } else {
                                  field_I[var3][var5 - 1].field_v = true;
                                  field_I[var3][var5 - 1].field_E = false;
                                  break L20;
                                }
                              }
                            }
                          } else {
                            if (var5 <= 1) {
                              break L20;
                            } else {
                              if (!field_I[var3][var5 - 1].field_a) {
                                break L20;
                              } else {
                                field_I[var3][var5 - 1].field_v = true;
                                field_I[var3][var5 - 1].field_E = false;
                                break L20;
                              }
                            }
                          }
                        } else {
                          if (var3 < 30) {
                            if (!field_I[var3 + 1][var5].field_a) {
                              if (var5 <= 1) {
                                break L20;
                              } else {
                                if (!field_I[var3][var5 - 1].field_a) {
                                  break L20;
                                } else {
                                  field_I[var3][var5 - 1].field_v = true;
                                  field_I[var3][var5 - 1].field_E = false;
                                  break L20;
                                }
                              }
                            } else {
                              if (var5 <= 1) {
                                break L20;
                              } else {
                                if (!field_I[var3][var5 - 1].field_a) {
                                  break L20;
                                } else {
                                  field_I[var3][var5 - 1].field_v = true;
                                  field_I[var3][var5 - 1].field_E = false;
                                  break L20;
                                }
                              }
                            }
                          } else {
                            if (var5 <= 1) {
                              break L20;
                            } else {
                              if (!field_I[var3][var5 - 1].field_a) {
                                break L20;
                              } else {
                                field_I[var3][var5 - 1].field_v = true;
                                field_I[var3][var5 - 1].field_E = false;
                                break L20;
                              }
                            }
                          }
                        }
                      }
                      if (var4 < 22) {
                        if (field_I[var3][var5 + 1].field_a) {
                          field_I[var3][var5 + 1].field_v = true;
                          field_I[var3][var5 + 1].field_E = false;
                          var4++;
                          continue L19;
                        } else {
                          var4++;
                          continue L19;
                        }
                      } else {
                        var4++;
                        continue L19;
                      }
                    } else {
                      var4++;
                      continue L19;
                    }
                  }
                }
              }
            }
          } else {
            var4 = 0;
            L21: while (true) {
              if (var4 >= 24) {
                var3++;
                continue L0;
              } else {
                var5 = var4 + param0;
                field_I[var3][var5].h();
                if (field_u != field_N[cm.field_o]) {
                  L22: {
                    var6 = 1;
                    if (Math.random() * 500.0 >= (double)var2.field_d) {
                      break L22;
                    } else {
                      var6 = 0;
                      break L22;
                    }
                  }
                  L23: {
                    if (!var2.field_n) {
                      break L23;
                    } else {
                      if (Math.random() * 32.0 / 3.0 + 5.0 <= (double)(Math.abs(var3 - var1) + Math.abs(var4 - 4) * 2)) {
                        break L23;
                      } else {
                        var6 = 0;
                        break L23;
                      }
                    }
                  }
                  if (var6 != 0) {
                    L24: {
                      if (Math.random() * 500.0 / 2.0 >= (double)var2.field_j) {
                        if (Math.random() * 500.0 / 2.0 >= (double)var2.field_l) {
                          break L24;
                        } else {
                          field_I[var3][var5].field_v = true;
                          field_I[var3][var5].field_E = false;
                          break L24;
                        }
                      } else {
                        field_I[var3][var5].field_E = true;
                        field_I[var3][var5].field_v = false;
                        field_I[var3][var5].field_q = -200;
                        break L24;
                      }
                    }
                    L25: {
                      if (field_u > 0) {
                        break L25;
                      } else {
                        if (var5 > 5) {
                          break L25;
                        } else {
                          var4++;
                          continue L21;
                        }
                      }
                    }
                    L26: {
                      if (Math.random() * 500.0 / 2.0 >= (double)var2.field_e) {
                        break L26;
                      } else {
                        field_I[var3][var5].field_b = true;
                        break L26;
                      }
                    }
                    var7 = 0;
                    L27: while (true) {
                      if (var7 < 6) {
                        if (var2.field_o[var7] != 0) {
                          if ((double)Math.abs(var2.field_o[var7]) >= Math.random() * 500.0) {
                            L28: {
                              field_I[var3][var5].field_U = var7;
                              stackOut_42_0 = field_I[var3][var5];
                              stackIn_44_0 = stackOut_42_0;
                              stackIn_43_0 = stackOut_42_0;
                              if (var2.field_o[var7] >= 0) {
                                stackOut_44_0 = (je) ((Object) stackIn_44_0);
                                stackOut_44_1 = 0;
                                stackIn_45_0 = stackOut_44_0;
                                stackIn_45_1 = stackOut_44_1;
                                break L28;
                              } else {
                                stackOut_43_0 = (je) ((Object) stackIn_43_0);
                                stackOut_43_1 = 1;
                                stackIn_45_0 = stackOut_43_0;
                                stackIn_45_1 = stackOut_43_1;
                                break L28;
                              }
                            }
                            stackIn_45_0.field_b = stackIn_45_1 != 0;
                            field_I[var3][var5].field_a = true;
                            var7++;
                            continue L27;
                          } else {
                            var7++;
                            continue L27;
                          }
                        } else {
                          var7++;
                          continue L27;
                        }
                      } else {
                        var4++;
                        continue L21;
                      }
                    }
                  } else {
                    L29: {
                      field_I[var3][var5].field_a = false;
                      if (!var2.field_k) {
                        if (!var2.field_i) {
                          break L29;
                        } else {
                          field_O.a(var4 - field_t / 4, 24, var3, var5, true);
                          break L29;
                        }
                      } else {
                        field_O.h(var3, 4, var5);
                        break L29;
                      }
                    }
                    L30: {
                      if (!var2.field_f) {
                        if (!var2.field_b) {
                          break L30;
                        } else {
                          field_O.a(24, -4, var5, var3, var4 - field_t / 4);
                          break L30;
                        }
                      } else {
                        field_O.c(var5, var3, (byte) -48);
                        break L30;
                      }
                    }
                    if (var2.field_a) {
                      field_O.a(24, 6, var5, (byte) -110, var3);
                      var4++;
                      continue L21;
                    } else {
                      var4++;
                      continue L21;
                    }
                  }
                } else {
                  L31: {
                    field_I[var3][var5].field_a = false;
                    if (field_H <= var5) {
                      break L31;
                    } else {
                      field_H = var5;
                      break L31;
                    }
                  }
                  field_O.a(false, var3, 1, var5);
                  var4++;
                  continue L21;
                }
              }
            }
          }
        }
    }

    final static boolean d(int param0, int param1, int param2, int param3) {
        return field_O.i(98, (param0 << 2) + param2, (param1 << 2) + param3);
    }

    public static void c() {
        field_N = null;
        field_h = (int[][]) null;
        field_d = (ea[][]) null;
        field_P = (ea[][]) null;
        field_R = (ea[][]) null;
        field_p = (ea[][]) null;
        field_k = null;
        field_y = null;
        field_n = null;
        field_G = null;
        field_L = null;
        field_c = null;
        field_C = null;
        field_g = null;
        field_z = (ea[][]) null;
        field_w = null;
        field_B = null;
        field_x = (ea[][]) null;
        field_j = (ea[][]) null;
        field_I = (je[][]) null;
        field_O = null;
        field_K = null;
    }

    final static void d() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        ea var2_ref_ea = null;
        int var3_int = 0;
        je var3 = null;
        int var4 = 0;
        je var4_ref_je = null;
        int var5 = 0;
        je var5_ref_je = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_176_0 = 0;
        int stackOut_175_0 = 0;
        int stackOut_174_0 = 0;
        L0: {
          field_m = field_m + 1;
          field_l = field_l + 0.1;
          if (!gj.a(18740, 0)) {
            break L0;
          } else {
            if (cm.field_o != 0) {
              break L0;
            } else {
              if (a.field_c < (field_F ^ 238298623)) {
                break L0;
              } else {
                if (field_J) {
                  break L0;
                } else {
                  if (!ke.field_V) {
                    break L0;
                  } else {
                    if (hf.field_t <= 120) {
                      break L0;
                    } else {
                      if (field_u >= 20) {
                        break L0;
                      } else {
                        field_D = (hf.field_t + 24) * 32;
                        field_J = true;
                        me.a(cm.field_o, false);
                        break L0;
                      }
                    }
                  }
                }
              }
            }
          }
        }
        L1: {
          if (!field_J) {
            break L1;
          } else {
            if ((field_m & 1) != 0) {
              break L1;
            } else {
              L2: {
                var0 = (field_D + 20) / 32;
                if (var0 <= 9) {
                  break L2;
                } else {
                  if (il.e(-31391)) {
                    break L2;
                  } else {
                    field_D = field_D - 1;
                    break L2;
                  }
                }
              }
              L3: {
                if (hf.field_t <= var0) {
                  break L3;
                } else {
                  rj.a((byte) -38, 14);
                  break L3;
                }
              }
              var1 = 0;
              var2 = 1;
              L4: while (true) {
                if (var2 > 30) {
                  if (var1 == 0) {
                    break L1;
                  } else {
                    ne.a(21, 30);
                    break L1;
                  }
                } else {
                  L5: {
                    if (field_I[var2][var0].field_a) {
                      break L5;
                    } else {
                      if (field_I[var2][var0].field_b) {
                        break L5;
                      } else {
                        var2++;
                        continue L4;
                      }
                    }
                  }
                  field_I[var2][var0].field_a = false;
                  field_I[var2][var0].field_b = false;
                  field_I[var2][var0].field_S = false;
                  field_I[var2][var0].field_U = -1;
                  nd.field_d.a((var0 - 1) * 32, var2 * 32, false, var0 * 32, var2 * 32);
                  lj.field_r = lj.field_r + 10;
                  rg.field_sb = rg.field_sb - 10;
                  var1 = 1;
                  var2++;
                  continue L4;
                }
              }
            }
          }
        }
        L6: {
          var0 = db.field_d / 32 - field_W;
          var1 = (640 + db.field_d) / 32 + field_M;
          if (var0 >= 1) {
            break L6;
          } else {
            var0 = 1;
            break L6;
          }
        }
        L7: {
          if (var1 <= field_t - 2) {
            break L7;
          } else {
            var1 = field_t - 2;
            break L7;
          }
        }
        L8: {
          if (var0 >= 24) {
            break L8;
          } else {
            var2 = 0;
            L9: while (true) {
              if (var2 >= 32) {
                break L8;
              } else {
                L10: {
                  var3_int = var2 - 16;
                  if (var3_int >= 0) {
                    break L10;
                  } else {
                    var3_int = -var3_int;
                    break L10;
                  }
                }
                var4 = var3_int / 2 + 1;
                var5 = 0;
                L11: while (true) {
                  if (var5 >= 24) {
                    var2++;
                    continue L9;
                  } else {
                    var6 = var5;
                    if (var6 <= var4) {
                      L12: {
                        L13: {
                          if (var6 < var3_int / 2) {
                            break L13;
                          } else {
                            if (var3_int == 0) {
                              break L13;
                            } else {
                              field_I[var2][var6].field_b = true;
                              if (cm.field_o != 1) {
                                break L12;
                              } else {
                                field_I[var2][var6].field_v = true;
                                break L12;
                              }
                            }
                          }
                        }
                        field_I[var2][var6].field_b = false;
                        break L12;
                      }
                      field_I[var2][var6].field_a = true;
                      field_I[var2][var6].field_U = -1;
                      field_I[var2][var6].field_S = false;
                      field_I[var2][var6].field_r = 0;
                      if (var3_int == 0) {
                        field_I[var2][var6].field_a = false;
                        field_I[var2][var6].field_E = false;
                        field_I[var2][var6].field_b = false;
                        field_I[var2][var6].field_v = false;
                        var5++;
                        continue L11;
                      } else {
                        var5++;
                        continue L11;
                      }
                    } else {
                      var5++;
                      continue L11;
                    }
                  }
                }
              }
            }
          }
        }
        L14: {
          if (field_T != 0) {
            break L14;
          } else {
            var2_ref_ea = je.e();
            var3_int = var2_ref_ea.field_x / 32;
            var4 = var2_ref_ea.field_A / 32;
            var5 = field_o;
            L15: while (true) {
              if (var5 >= field_o + var3_int) {
                break L14;
              } else {
                var6 = field_f;
                L16: while (true) {
                  if (var6 >= field_f + var4) {
                    var5++;
                    continue L15;
                  } else {
                    if (var5 == ca.field_k) {
                      if (var6 == hf.field_t) {
                        fn.a(22, 233, 3);
                        var6++;
                        continue L16;
                      } else {
                        var6++;
                        continue L16;
                      }
                    } else {
                      var6++;
                      continue L16;
                    }
                  }
                }
              }
            }
          }
        }
        je.h(var0, var1);
        je.a(var0, var1);
        var2 = var0;
        L17: while (true) {
          if (var2 > var1) {
            je.d(var0, var1);
            je.f(var0, var1);
            var2 = var0;
            L18: while (true) {
              if (var2 > var1) {
                L19: {
                  if (field_u < field_N[cm.field_o]) {
                    break L19;
                  } else {
                    if (field_J) {
                      break L19;
                    } else {
                      field_O.a(true, field_I);
                      break L19;
                    }
                  }
                }
                L20: {
                  field_O.a(var1, true, field_I, var0);
                  field_O.a(var1, -29, var0, field_I);
                  field_W = 0;
                  field_M = 0;
                  var4 = 0;
                  if (cm.field_o != 0) {
                    stackOut_175_0 = 0;
                    stackIn_176_0 = stackOut_175_0;
                    break L20;
                  } else {
                    stackOut_174_0 = 1;
                    stackIn_176_0 = stackOut_174_0;
                    break L20;
                  }
                }
                var5 = stackIn_176_0;
                var6 = 0;
                L21: while (true) {
                  if (var6 >= field_t) {
                    return;
                  } else {
                    var2 = 0;
                    var7 = 0;
                    L22: while (true) {
                      if (var7 >= 32) {
                        if (var2 >= 16) {
                          if (field_t > var6 + 4) {
                            if (var6 > hf.field_t + 14) {
                              field_t = field_t - 1;
                              var6++;
                              continue L21;
                            } else {
                              var6++;
                              continue L21;
                            }
                          } else {
                            var6++;
                            continue L21;
                          }
                        } else {
                          var6++;
                          continue L21;
                        }
                      } else {
                        var3 = mh.field_e[var7][var6];
                        if (!var3.field_V) {
                          if (je.e(var7, var6, 1, 1) > 0) {
                            var2++;
                            if (field_H > var6 - 2) {
                              field_H = field_H - 1;
                              var7++;
                              continue L22;
                            } else {
                              var7++;
                              continue L22;
                            }
                          } else {
                            var7++;
                            continue L22;
                          }
                        } else {
                          L23: {
                            if (var6 <= var4) {
                              break L23;
                            } else {
                              var4 = var6;
                              break L23;
                            }
                          }
                          L24: {
                            var8 = 0;
                            if (!var3.field_a) {
                              break L24;
                            } else {
                              var8 = 11184810;
                              break L24;
                            }
                          }
                          L25: {
                            if (!var3.field_b) {
                              break L25;
                            } else {
                              var8 = 6710886;
                              break L25;
                            }
                          }
                          L26: {
                            if (var5 == 0) {
                              break L26;
                            } else {
                              if (!je.d(var7, var6, 1, 1)) {
                                break L26;
                              } else {
                                var8 = 65280;
                                break L26;
                              }
                            }
                          }
                          L27: {
                            if (!je.c(var7, var6, 1, 1)) {
                              break L27;
                            } else {
                              var8 = 255;
                              break L27;
                            }
                          }
                          L28: {
                            var9 = je.e(var7, var6, 1, 1);
                            if (var9 <= 0) {
                              break L28;
                            } else {
                              var8 = 16711680;
                              var2++;
                              if (field_H <= var6 - 2) {
                                break L28;
                              } else {
                                field_H = field_H - 1;
                                break L28;
                              }
                            }
                          }
                          L29: {
                            if (var9 <= 4) {
                              break L29;
                            } else {
                              var8 = 16776960;
                              break L29;
                            }
                          }
                          L30: {
                            if (var9 <= 8) {
                              break L30;
                            } else {
                              var8 = 16777215;
                              break L30;
                            }
                          }
                          L31: {
                            if (var3.field_U <= -1) {
                              break L31;
                            } else {
                              var8 = 16777215;
                              break L31;
                            }
                          }
                          eh.a(var7, var6 + 32, var8);
                          var7++;
                          continue L22;
                        }
                      }
                    }
                  }
                }
              } else {
                if (var2 < hf.field_t + 16) {
                  var3_int = 1;
                  L32: while (true) {
                    if (var3_int <= 30) {
                      var3_int++;
                      continue L32;
                    } else {
                      var2++;
                      continue L18;
                    }
                  }
                } else {
                  var2++;
                  continue L18;
                }
              }
            }
          } else {
            if (var2 < hf.field_t + 16) {
              var3_int = 1;
              L33: while (true) {
                if (var3_int <= 30) {
                  L34: {
                    if (field_I[var3_int][var2].field_a) {
                      break L34;
                    } else {
                      L35: {
                        if (!field_I[var3_int][var2].field_S) {
                          break L35;
                        } else {
                          field_I[var3_int][var2].field_S = false;
                          break L35;
                        }
                      }
                      if (field_I[var3_int][var2].field_U < 0) {
                        break L34;
                      } else {
                        uf.field_p[jf.b((byte) 63)] = new gf(var3_int, var2, field_I[var3_int][var2].field_U);
                        field_I[var3_int][var2].field_U = -1;
                        break L34;
                      }
                    }
                  }
                  L36: {
                    field_I[var3_int][var2].field_s = -1;
                    if (je.c(var3_int, var2, 1, 1)) {
                      break L36;
                    } else {
                      field_I[var3_int][var2].field_s = -2;
                      break L36;
                    }
                  }
                  L37: {
                    if (!field_I[var3_int][var2].field_a) {
                      break L37;
                    } else {
                      field_I[var3_int][var2].field_s = -3;
                      break L37;
                    }
                  }
                  L38: {
                    L39: {
                      if (oe.field_b) {
                        break L39;
                      } else {
                        if (field_I[var3_int][var2].field_U != 3) {
                          break L39;
                        } else {
                          field_O.b(7, 0, var2, var3_int);
                          break L38;
                        }
                      }
                    }
                    if (field_I[var3_int][var2].field_U != 5) {
                      break L38;
                    } else {
                      var4 = var3_int - 1;
                      L40: while (true) {
                        if (var4 > var3_int + 1) {
                          break L38;
                        } else {
                          var5 = var2 - 1;
                          L41: while (true) {
                            if (var5 > var2 + 1) {
                              var4++;
                              continue L40;
                            } else {
                              field_I[var4][var5].field_A = true;
                              var5++;
                              continue L41;
                            }
                          }
                        }
                      }
                    }
                  }
                  L42: {
                    if (kd.field_i) {
                      break L42;
                    } else {
                      if (field_I[var3_int][var2].field_i <= 0) {
                        field_I[var3_int][var2].field_i = 0;
                        break L42;
                      } else {
                        field_I[var3_int][var2].field_i = field_I[var3_int][var2].field_i - 1;
                        if (!sc.field_b) {
                          break L42;
                        } else {
                          if (field_I[var3_int][var2].field_i <= 160) {
                            break L42;
                          } else {
                            var4 = ca.field_k - var3_int;
                            var5 = hf.field_t - var2;
                            if (var4 * var4 + var5 * var5 >= 40) {
                              break L42;
                            } else {
                              L43: {
                                if (field_I[var3_int][var2].field_a) {
                                  break L43;
                                } else {
                                  L44: {
                                    if (ni.a(0, 11764)) {
                                      break L44;
                                    } else {
                                      if (!field_O.i(-62, var3_int << 2, var2 << 2)) {
                                        break L44;
                                      } else {
                                        if (field_O.j(-126, var2 << 2, var3_int << 2) <= 50) {
                                          break L44;
                                        } else {
                                          ag.a(true, 0, var2 * 32, var3_int * 32);
                                          break L44;
                                        }
                                      }
                                    }
                                  }
                                  if (cm.field_o != 1) {
                                    break L43;
                                  } else {
                                    L45: {
                                      if (!ni.a(24, 11764)) {
                                        if (field_I[var3_int][var2].field_A) {
                                          if (je.c(var3_int, var2, 1, 1)) {
                                            ag.a(true, 24, var2 * 32, var3_int * 32);
                                            if (ni.a(30, 11764)) {
                                              break L45;
                                            } else {
                                              if (!field_O.f(var2, 2, var3_int)) {
                                                break L45;
                                              } else {
                                                ag.a(true, 30, var2 * 32, var3_int * 32);
                                                break L45;
                                              }
                                            }
                                          } else {
                                            if (ni.a(30, 11764)) {
                                              break L45;
                                            } else {
                                              if (!field_O.f(var2, 2, var3_int)) {
                                                break L45;
                                              } else {
                                                ag.a(true, 30, var2 * 32, var3_int * 32);
                                                break L45;
                                              }
                                            }
                                          }
                                        } else {
                                          if (ni.a(30, 11764)) {
                                            break L45;
                                          } else {
                                            if (!field_O.f(var2, 2, var3_int)) {
                                              break L45;
                                            } else {
                                              ag.a(true, 30, var2 * 32, var3_int * 32);
                                              break L45;
                                            }
                                          }
                                        }
                                      } else {
                                        if (ni.a(30, 11764)) {
                                          break L45;
                                        } else {
                                          if (!field_O.f(var2, 2, var3_int)) {
                                            break L45;
                                          } else {
                                            ag.a(true, 30, var2 * 32, var3_int * 32);
                                            break L45;
                                          }
                                        }
                                      }
                                    }
                                    if (ni.a(34, 11764)) {
                                      break L43;
                                    } else {
                                      if (!field_O.b(var3_int, var2, (byte) 76)) {
                                        break L43;
                                      } else {
                                        ag.a(true, 34, var2 * 32, var3_int * 32);
                                        break L43;
                                      }
                                    }
                                  }
                                }
                              }
                              L46: {
                                if (field_I[var3_int][var2].field_U >= 0) {
                                  L47: {
                                    if (!ni.a(5, 11764)) {
                                      if (field_I[var3_int][var2].field_b) {
                                        ag.a(true, 5, var2 * 32, var3_int * 32);
                                        if (field_I[var3_int][var2].field_U >= 3) {
                                          break L47;
                                        } else {
                                          if (!ni.a(8, 11764)) {
                                            break L47;
                                          } else {
                                            ag.a(true, 3, var2 * 32, var3_int * 32);
                                            break L47;
                                          }
                                        }
                                      } else {
                                        if (field_I[var3_int][var2].field_U >= 3) {
                                          break L47;
                                        } else {
                                          if (!ni.a(8, 11764)) {
                                            break L47;
                                          } else {
                                            ag.a(true, 3, var2 * 32, var3_int * 32);
                                            break L47;
                                          }
                                        }
                                      }
                                    } else {
                                      if (field_I[var3_int][var2].field_U >= 3) {
                                        break L47;
                                      } else {
                                        if (!ni.a(8, 11764)) {
                                          break L47;
                                        } else {
                                          ag.a(true, 3, var2 * 32, var3_int * 32);
                                          break L47;
                                        }
                                      }
                                    }
                                  }
                                  L48: {
                                    if (field_I[var3_int][var2].field_U != 3) {
                                      break L48;
                                    } else {
                                      ag.a(true, 18, var2 * 32, var3_int * 32);
                                      break L48;
                                    }
                                  }
                                  L49: {
                                    if (field_I[var3_int][var2].field_U != 4) {
                                      break L49;
                                    } else {
                                      ag.a(true, 20, var2 * 32, var3_int * 32);
                                      break L49;
                                    }
                                  }
                                  if (field_I[var3_int][var2].field_U == 5) {
                                    ag.a(true, 19, var2 * 32, var3_int * 32);
                                    if (!field_I[var3_int][var2].field_a) {
                                      break L46;
                                    } else {
                                      if (!field_I[var3_int][var2].field_E) {
                                        break L46;
                                      } else {
                                        ag.a(true, 27, var2 * 32, var3_int * 32);
                                        break L46;
                                      }
                                    }
                                  } else {
                                    if (!field_I[var3_int][var2].field_a) {
                                      break L46;
                                    } else {
                                      if (!field_I[var3_int][var2].field_E) {
                                        break L46;
                                      } else {
                                        ag.a(true, 27, var2 * 32, var3_int * 32);
                                        break L46;
                                      }
                                    }
                                  }
                                } else {
                                  if (!field_I[var3_int][var2].field_a) {
                                    break L46;
                                  } else {
                                    if (!field_I[var3_int][var2].field_E) {
                                      break L46;
                                    } else {
                                      ag.a(true, 27, var2 * 32, var3_int * 32);
                                      break L46;
                                    }
                                  }
                                }
                              }
                              if (!field_I[var3_int][var2].field_a) {
                                break L42;
                              } else {
                                if (!field_I[var3_int][var2].field_v) {
                                  break L42;
                                } else {
                                  if (var2 <= 12) {
                                    break L42;
                                  } else {
                                    ag.a(true, 33, var2 * 32, var3_int * 32);
                                    break L42;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  L50: {
                    var4_ref_je = field_I[var3_int][var2];
                    if (var4_ref_je.field_i <= 128) {
                      break L50;
                    } else {
                      var4_ref_je.field_V = true;
                      break L50;
                    }
                  }
                  L51: {
                    if (!var4_ref_je.field_e) {
                      break L51;
                    } else {
                      L52: {
                        if (var4_ref_je.field_a) {
                          break L52;
                        } else {
                          if (je.c(var3_int, var2, 1, 1)) {
                            break L52;
                          } else {
                            if (var4_ref_je.field_i >= 80) {
                              break L51;
                            } else {
                              var4_ref_je.field_i = 80;
                              break L51;
                            }
                          }
                        }
                      }
                      var4_ref_je.field_e = false;
                      break L51;
                    }
                  }
                  L53: {
                    var5_ref_je = field_I[var3_int][var2 - 1];
                    je.a(var3_int, var2, var4_ref_je, var5_ref_je);
                    if (var2 >= 6) {
                      break L53;
                    } else {
                      var4_ref_je.field_i = 255;
                      break L53;
                    }
                  }
                  je.a(var3_int, var2, var4_ref_je);
                  je.b(var3_int, var2, var4_ref_je);
                  var3_int++;
                  continue L33;
                } else {
                  var2++;
                  continue L17;
                }
              }
            } else {
              var2++;
              continue L17;
            }
          }
        }
    }

    private final static void c(int param0) {
        int var1 = 0;
        int var2 = 0;
        ql var3 = null;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var1 = (int)(Math.random() * 27.0) + 2;
          var2 = (int)(Math.random() * 19.0) + param0 + 2;
          field_I[var1][var2].field_a = false;
          field_I[var1][var2].field_b = false;
          if (var1 > 1) {
            if (field_I[var1 - 1][var2].field_b) {
              field_I[var1 - 1][var2].field_b = false;
              if (var1 >= 31) {
                break L0;
              } else {
                if (!field_I[var1 + 1][var2].field_b) {
                  break L0;
                } else {
                  field_I[var1 + 1][var2].field_b = false;
                  break L0;
                }
              }
            } else {
              if (var1 >= 31) {
                break L0;
              } else {
                if (!field_I[var1 + 1][var2].field_b) {
                  break L0;
                } else {
                  field_I[var1 + 1][var2].field_b = false;
                  break L0;
                }
              }
            }
          } else {
            if (var1 >= 31) {
              break L0;
            } else {
              if (!field_I[var1 + 1][var2].field_b) {
                break L0;
              } else {
                field_I[var1 + 1][var2].field_b = false;
                break L0;
              }
            }
          }
        }
        L1: {
          var3 = fd.a(cm.field_o, -1, field_u);
          var4 = 9;
          if (!var3.field_h) {
            break L1;
          } else {
            var4 = 19;
            field_O.h(var1, 4, var2);
            break L1;
          }
        }
        L2: {
          uf.field_p[jf.b((byte) 64)] = new gf(var1, var2, var4);
          uf.field_p[jf.b((byte) 62)] = new gf(var1, var2, (int)(12.0 + Math.random() * 3.0));
          if (!var3.field_g) {
            break L2;
          } else {
            L3: {
              var1 = (int)(Math.random() * 27.0) + 2;
              var2 = (int)(Math.random() * 19.0) + param0 + 2;
              var5 = jf.b((byte) 107);
              if (uf.field_p[var5] != null) {
                break L3;
              } else {
                uf.field_p[var5] = new gf(var1, var2, 21);
                break L3;
              }
            }
            L4: {
              field_I[var1][var2].field_a = false;
              field_I[var1][var2].field_b = false;
              field_I[var1][var2].field_E = false;
              field_I[var1][var2].field_v = false;
              if (var1 <= 1) {
                break L4;
              } else {
                field_I[var1 - 1][var2].field_b = false;
                field_I[var1 - 1][var2].field_a = false;
                field_I[var1 - 1][var2].field_E = false;
                field_I[var1 - 1][var2].field_v = false;
                break L4;
              }
            }
            L5: {
              if (var1 >= 31) {
                break L5;
              } else {
                field_I[var1 + 1][var2].field_b = false;
                field_I[var1 + 1][var2].field_a = false;
                field_I[var1 + 1][var2].field_E = false;
                field_I[var1 + 1][var2].field_v = false;
                break L5;
              }
            }
            field_O.h(var1, 4, var2);
            break L2;
          }
        }
    }

    final boolean g() {
        if (this.field_a) {
          return true;
        } else {
          if (!this.field_b) {
            return false;
          } else {
            return true;
          }
        }
    }

    private je() {
        this.h();
    }

    static {
        field_X = "TVie: ";
        field_j = new ea[2][];
        field_z = new ea[4][];
        field_K = new int[]{0, 1, 2, 0, 2, 1, 0, 1, 0, 2};
        field_x = new ea[2][];
        field_p = new ea[2][];
        field_N = new int[]{20, 31};
        field_d = new ea[2][];
        field_t = 0;
        field_P = new ea[2][];
        field_R = new ea[2][];
        field_h = new int[][]{new int[]{8421504, 13744249, 10976325, 8011818, 4340751, 7170907}, new int[]{16777215, 15202815, 12119039, 7196662, 11849706, 6330319}};
    }
}
