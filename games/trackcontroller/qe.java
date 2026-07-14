/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qe extends wh {
    private int field_t;
    private int[] field_s;
    private boolean field_q;
    private wb field_y;
    static ba field_C;
    private nb field_A;
    private nb field_w;
    private int field_m;
    private nb field_r;
    private int field_v;
    private int field_u;
    static int[] field_z;
    private wb field_o;
    private boolean field_D;
    private int[] field_B;
    static aa field_n;
    private wb field_x;
    static int field_p;

    private final void a(int param0, int param1, nb param2, int param3) {
        param2.a(param0, (byte) -116, param1);
        param2.a(0, param3);
    }

    final wh b() {
        return null;
    }

    final synchronized int c() {
        return 2;
    }

    final synchronized void a(int param0, int param1) {
        ((qe) this).field_u = param0;
        if (param1 > -45) {
            Object var4 = null;
            ((qe) this).a((int[]) null, -45, 18);
        }
    }

    final void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_32_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_98_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_117_0 = 0;
        int stackIn_128_0 = 0;
        int stackIn_136_0 = 0;
        int stackIn_143_0 = 0;
        int stackIn_155_0 = 0;
        int stackIn_163_0 = 0;
        int stackIn_176_0 = 0;
        int stackIn_184_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_85_0 = 0;
        int stackOut_84_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_175_0 = 0;
        int stackOut_174_0 = 0;
        int stackOut_183_0 = 0;
        int stackOut_182_0 = 0;
        int stackOut_154_0 = 0;
        int stackOut_153_0 = 0;
        int stackOut_162_0 = 0;
        int stackOut_161_0 = 0;
        int stackOut_97_0 = 0;
        int stackOut_96_0 = 0;
        int stackOut_109_0 = 0;
        int stackOut_108_0 = 0;
        int stackOut_116_0 = 0;
        int stackOut_115_0 = 0;
        int stackOut_142_0 = 0;
        int stackOut_141_0 = 0;
        int stackOut_135_0 = 0;
        int stackOut_134_0 = 0;
        int stackOut_127_0 = 0;
        int stackOut_126_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_39_0 = 0;
        var11 = TrackController.field_F ? 1 : 0;
        if (((qe) this).field_u <= 0) {
          ((qe) this).d(param2);
          return;
        } else {
          L0: {
            if (((qe) this).field_q) {
              L1: {
                if (((qe) this).field_v <= 0) {
                  break L1;
                } else {
                  if (!((qe) this).field_w.c((byte) -96)) {
                    ((qe) this).field_q = false;
                    ((qe) this).field_v = -((qe) this).field_v;
                    ((qe) this).field_x = null;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              if (((qe) this).field_v >= 0) {
                break L0;
              } else {
                if (!((qe) this).field_r.c((byte) -58)) {
                  ((qe) this).field_v = -((qe) this).field_v;
                  ((qe) this).field_q = false;
                  ((qe) this).field_y = null;
                  break L0;
                } else {
                  break L0;
                }
              }
            } else {
              break L0;
            }
          }
          L2: {
            var4 = ((qe) this).field_u * (((qe) this).field_m >> -1993086004) / 256;
            var5 = -var4 + ((qe) this).field_u;
            if (0 == ((qe) this).field_v) {
              break L2;
            } else {
              ((qe) this).field_m = ((qe) this).field_m + ((qe) this).field_v * param2;
              if (-1048577 >= (((qe) this).field_m ^ -1)) {
                ((qe) this).field_m = 1048576;
                if (((qe) this).field_q) {
                  break L2;
                } else {
                  ((qe) this).field_v = 0;
                  if (!((qe) this).field_D) {
                    if (((qe) this).field_y == null) {
                      ((qe) this).field_y = null;
                      break L2;
                    } else {
                      ((qe) this).field_r.f(11795);
                      ((qe) this).field_y = null;
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
              } else {
                if ((((qe) this).field_m ^ -1) < -1) {
                  break L2;
                } else {
                  ((qe) this).field_m = 0;
                  if (!((qe) this).field_q) {
                    ((qe) this).field_v = 0;
                    if (((qe) this).field_D) {
                      break L2;
                    } else {
                      L3: {
                        if (null == ((qe) this).field_x) {
                          break L3;
                        } else {
                          ((qe) this).field_w.f(11795);
                          break L3;
                        }
                      }
                      ((qe) this).field_x = null;
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
              }
            }
          }
          L4: {
            if (!oa.field_k) {
              stackOut_31_0 = param2;
              stackIn_32_0 = stackOut_31_0;
              break L4;
            } else {
              stackOut_30_0 = param2 << 1371599041;
              stackIn_32_0 = stackOut_30_0;
              break L4;
            }
          }
          var6 = stackIn_32_0;
          if (((qe) this).field_t < 256) {
            L5: {
              if (null != ((qe) this).field_x) {
                break L5;
              } else {
                if (((qe) this).field_y != null) {
                  break L5;
                } else {
                  if (null != ((qe) this).field_o) {
                    if (0 != ((qe) this).field_t) {
                      if (((qe) this).field_B != null) {
                        if (var6 <= ((qe) this).field_B.length) {
                          L6: {
                            pd.a(((qe) this).field_B, 0, var6);
                            ((qe) this).field_A.a(((qe) this).field_B, 0, param2);
                            if (!oa.field_k) {
                              stackOut_85_0 = param1;
                              stackIn_86_0 = stackOut_85_0;
                              break L6;
                            } else {
                              param1 = param1 << 1;
                              stackOut_84_0 = param1 << 1;
                              stackIn_86_0 = stackOut_84_0;
                              break L6;
                            }
                          }
                          var7 = stackIn_86_0;
                          var8 = ((qe) this).field_t * ((qe) this).field_u / 256;
                          var9 = ((qe) this).field_u + -var8;
                          var10 = 0;
                          L7: while (true) {
                            if (var6 <= var10) {
                              return;
                            } else {
                              param0[var10 + var7] = var9 * param0[var10 + var7] + ((qe) this).field_B[var10] * var8 >> -695410072;
                              var10++;
                              continue L7;
                            }
                          }
                        } else {
                          L8: {
                            ((qe) this).field_s = new int[var6];
                            ((qe) this).field_B = new int[var6];
                            ((qe) this).field_A.a(((qe) this).field_B, 0, param2);
                            if (!oa.field_k) {
                              stackOut_78_0 = param1;
                              stackIn_79_0 = stackOut_78_0;
                              break L8;
                            } else {
                              param1 = param1 << 1;
                              stackOut_77_0 = param1 << 1;
                              stackIn_79_0 = stackOut_77_0;
                              break L8;
                            }
                          }
                          var7 = stackIn_79_0;
                          var8 = ((qe) this).field_t * ((qe) this).field_u / 256;
                          var9 = ((qe) this).field_u + -var8;
                          var10 = 0;
                          L9: while (true) {
                            if (var6 <= var10) {
                              return;
                            } else {
                              param0[var10 + var7] = var9 * param0[var10 + var7] + ((qe) this).field_B[var10] * var8 >> -695410072;
                              var10++;
                              continue L9;
                            }
                          }
                        }
                      } else {
                        L10: {
                          ((qe) this).field_s = new int[var6];
                          ((qe) this).field_B = new int[var6];
                          ((qe) this).field_A.a(((qe) this).field_B, 0, param2);
                          if (!oa.field_k) {
                            stackOut_70_0 = param1;
                            stackIn_71_0 = stackOut_70_0;
                            break L10;
                          } else {
                            param1 = param1 << 1;
                            stackOut_69_0 = param1 << 1;
                            stackIn_71_0 = stackOut_69_0;
                            break L10;
                          }
                        }
                        var7 = stackIn_71_0;
                        var8 = ((qe) this).field_t * ((qe) this).field_u / 256;
                        var9 = ((qe) this).field_u + -var8;
                        var10 = 0;
                        L11: while (true) {
                          if (var6 <= var10) {
                            return;
                          } else {
                            param0[var10 + var7] = var9 * param0[var10 + var7] + ((qe) this).field_B[var10] * var8 >> -695410072;
                            var10++;
                            continue L11;
                          }
                        }
                      }
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
            }
            if (-257 == (var4 ^ -1)) {
              L12: {
                ((qe) this).field_w.a(param0, param1, param2);
                if (null == ((qe) this).field_o) {
                  break L12;
                } else {
                  if (0 == ((qe) this).field_t) {
                    break L12;
                  } else {
                    L13: {
                      if (((qe) this).field_B == null) {
                        break L13;
                      } else {
                        if (var6 > ((qe) this).field_B.length) {
                          break L13;
                        } else {
                          L14: {
                            pd.a(((qe) this).field_B, 0, var6);
                            ((qe) this).field_A.a(((qe) this).field_B, 0, param2);
                            if (!oa.field_k) {
                              stackOut_175_0 = param1;
                              stackIn_176_0 = stackOut_175_0;
                              break L14;
                            } else {
                              param1 = param1 << 1;
                              stackOut_174_0 = param1 << 1;
                              stackIn_176_0 = stackOut_174_0;
                              break L14;
                            }
                          }
                          var7 = stackIn_176_0;
                          var8 = ((qe) this).field_t * ((qe) this).field_u / 256;
                          var9 = ((qe) this).field_u + -var8;
                          var10 = 0;
                          L15: while (true) {
                            if (var6 <= var10) {
                              return;
                            } else {
                              param0[var10 + var7] = var9 * param0[var10 + var7] + ((qe) this).field_B[var10] * var8 >> -695410072;
                              var10++;
                              continue L15;
                            }
                          }
                        }
                      }
                    }
                    L16: {
                      ((qe) this).field_s = new int[var6];
                      ((qe) this).field_B = new int[var6];
                      ((qe) this).field_A.a(((qe) this).field_B, 0, param2);
                      if (!oa.field_k) {
                        stackOut_183_0 = param1;
                        stackIn_184_0 = stackOut_183_0;
                        break L16;
                      } else {
                        param1 = param1 << 1;
                        stackOut_182_0 = param1 << 1;
                        stackIn_184_0 = stackOut_182_0;
                        break L16;
                      }
                    }
                    var7 = stackIn_184_0;
                    var8 = ((qe) this).field_t * ((qe) this).field_u / 256;
                    var9 = ((qe) this).field_u + -var8;
                    var10 = 0;
                    L17: while (true) {
                      if (var6 <= var10) {
                        return;
                      } else {
                        param0[var10 + var7] = var9 * param0[var10 + var7] + ((qe) this).field_B[var10] * var8 >> -695410072;
                        var10++;
                        continue L17;
                      }
                    }
                  }
                }
              }
              return;
            } else {
              if (var5 == 256) {
                L18: {
                  ((qe) this).field_r.a(param0, param1, param2);
                  if (null == ((qe) this).field_o) {
                    break L18;
                  } else {
                    if (0 == ((qe) this).field_t) {
                      break L18;
                    } else {
                      L19: {
                        if (((qe) this).field_B == null) {
                          break L19;
                        } else {
                          if (var6 > ((qe) this).field_B.length) {
                            break L19;
                          } else {
                            L20: {
                              pd.a(((qe) this).field_B, 0, var6);
                              ((qe) this).field_A.a(((qe) this).field_B, 0, param2);
                              if (!oa.field_k) {
                                stackOut_154_0 = param1;
                                stackIn_155_0 = stackOut_154_0;
                                break L20;
                              } else {
                                param1 = param1 << 1;
                                stackOut_153_0 = param1 << 1;
                                stackIn_155_0 = stackOut_153_0;
                                break L20;
                              }
                            }
                            var7 = stackIn_155_0;
                            var8 = ((qe) this).field_t * ((qe) this).field_u / 256;
                            var9 = ((qe) this).field_u + -var8;
                            var10 = 0;
                            L21: while (true) {
                              if (var6 <= var10) {
                                return;
                              } else {
                                param0[var10 + var7] = var9 * param0[var10 + var7] + ((qe) this).field_B[var10] * var8 >> -695410072;
                                var10++;
                                continue L21;
                              }
                            }
                          }
                        }
                      }
                      L22: {
                        ((qe) this).field_s = new int[var6];
                        ((qe) this).field_B = new int[var6];
                        ((qe) this).field_A.a(((qe) this).field_B, 0, param2);
                        if (!oa.field_k) {
                          stackOut_162_0 = param1;
                          stackIn_163_0 = stackOut_162_0;
                          break L22;
                        } else {
                          param1 = param1 << 1;
                          stackOut_161_0 = param1 << 1;
                          stackIn_163_0 = stackOut_161_0;
                          break L22;
                        }
                      }
                      var7 = stackIn_163_0;
                      var8 = ((qe) this).field_t * ((qe) this).field_u / 256;
                      var9 = ((qe) this).field_u + -var8;
                      var10 = 0;
                      L23: while (true) {
                        if (var6 <= var10) {
                          return;
                        } else {
                          param0[var10 + var7] = var9 * param0[var10 + var7] + ((qe) this).field_B[var10] * var8 >> -695410072;
                          var10++;
                          continue L23;
                        }
                      }
                    }
                  }
                }
                return;
              } else {
                L24: {
                  if (((qe) this).field_B == null) {
                    break L24;
                  } else {
                    if (((qe) this).field_B.length < var6) {
                      break L24;
                    } else {
                      L25: {
                        pd.a(((qe) this).field_B, 0, var6);
                        pd.a(((qe) this).field_s, 0, var6);
                        ((qe) this).field_w.a(((qe) this).field_B, 0, param2);
                        ((qe) this).field_r.a(((qe) this).field_s, 0, param2);
                        if (!oa.field_k) {
                          stackOut_97_0 = param1;
                          stackIn_98_0 = stackOut_97_0;
                          break L25;
                        } else {
                          param1 = param1 << 1;
                          stackOut_96_0 = param1 << 1;
                          stackIn_98_0 = stackOut_96_0;
                          break L25;
                        }
                      }
                      var7 = stackIn_98_0;
                      var8 = 0;
                      L26: while (true) {
                        if (var6 <= var8) {
                          L27: {
                            if (null == ((qe) this).field_o) {
                              break L27;
                            } else {
                              if (0 == ((qe) this).field_t) {
                                break L27;
                              } else {
                                L28: {
                                  L29: {
                                    if (((qe) this).field_B == null) {
                                      break L29;
                                    } else {
                                      if (var6 > ((qe) this).field_B.length) {
                                        break L29;
                                      } else {
                                        pd.a(((qe) this).field_B, 0, var6);
                                        break L28;
                                      }
                                    }
                                  }
                                  ((qe) this).field_s = new int[var6];
                                  ((qe) this).field_B = new int[var6];
                                  break L28;
                                }
                                L30: {
                                  ((qe) this).field_A.a(((qe) this).field_B, 0, param2);
                                  if (!oa.field_k) {
                                    stackOut_109_0 = param1;
                                    stackIn_110_0 = stackOut_109_0;
                                    break L30;
                                  } else {
                                    param1 = param1 << 1;
                                    stackOut_108_0 = param1 << 1;
                                    stackIn_110_0 = stackOut_108_0;
                                    break L30;
                                  }
                                }
                                var7 = stackIn_110_0;
                                var8 = ((qe) this).field_t * ((qe) this).field_u / 256;
                                var9 = ((qe) this).field_u + -var8;
                                var10 = 0;
                                L31: while (true) {
                                  if (var6 <= var10) {
                                    break L27;
                                  } else {
                                    param0[var10 + var7] = var9 * param0[var10 + var7] + ((qe) this).field_B[var10] * var8 >> -695410072;
                                    var10++;
                                    continue L31;
                                  }
                                }
                              }
                            }
                          }
                          return;
                        } else {
                          param0[var7 - -var8] = param0[var7 - -var8] + (((qe) this).field_B[var8] * var4 - -(((qe) this).field_s[var8] * var5) >> 372251144);
                          var8++;
                          continue L26;
                        }
                      }
                    }
                  }
                }
                L32: {
                  ((qe) this).field_s = new int[var6];
                  ((qe) this).field_B = new int[var6];
                  ((qe) this).field_w.a(((qe) this).field_B, 0, param2);
                  ((qe) this).field_r.a(((qe) this).field_s, 0, param2);
                  if (!oa.field_k) {
                    stackOut_116_0 = param1;
                    stackIn_117_0 = stackOut_116_0;
                    break L32;
                  } else {
                    param1 = param1 << 1;
                    stackOut_115_0 = param1 << 1;
                    stackIn_117_0 = stackOut_115_0;
                    break L32;
                  }
                }
                var7 = stackIn_117_0;
                var8 = 0;
                L33: while (true) {
                  if (var6 <= var8) {
                    if (null != ((qe) this).field_o) {
                      if (0 != ((qe) this).field_t) {
                        if (((qe) this).field_B != null) {
                          if (var6 > ((qe) this).field_B.length) {
                            L34: {
                              ((qe) this).field_s = new int[var6];
                              ((qe) this).field_B = new int[var6];
                              ((qe) this).field_A.a(((qe) this).field_B, 0, param2);
                              if (!oa.field_k) {
                                stackOut_142_0 = param1;
                                stackIn_143_0 = stackOut_142_0;
                                break L34;
                              } else {
                                param1 = param1 << 1;
                                stackOut_141_0 = param1 << 1;
                                stackIn_143_0 = stackOut_141_0;
                                break L34;
                              }
                            }
                            var7 = stackIn_143_0;
                            var8 = ((qe) this).field_t * ((qe) this).field_u / 256;
                            var9 = ((qe) this).field_u + -var8;
                            var10 = 0;
                            L35: while (true) {
                              if (var6 <= var10) {
                                return;
                              } else {
                                param0[var10 + var7] = var9 * param0[var10 + var7] + ((qe) this).field_B[var10] * var8 >> -695410072;
                                var10++;
                                continue L35;
                              }
                            }
                          } else {
                            L36: {
                              pd.a(((qe) this).field_B, 0, var6);
                              ((qe) this).field_A.a(((qe) this).field_B, 0, param2);
                              if (!oa.field_k) {
                                stackOut_135_0 = param1;
                                stackIn_136_0 = stackOut_135_0;
                                break L36;
                              } else {
                                param1 = param1 << 1;
                                stackOut_134_0 = param1 << 1;
                                stackIn_136_0 = stackOut_134_0;
                                break L36;
                              }
                            }
                            var7 = stackIn_136_0;
                            var8 = ((qe) this).field_t * ((qe) this).field_u / 256;
                            var9 = ((qe) this).field_u + -var8;
                            var10 = 0;
                            L37: while (true) {
                              if (var6 <= var10) {
                                return;
                              } else {
                                param0[var10 + var7] = var9 * param0[var10 + var7] + ((qe) this).field_B[var10] * var8 >> -695410072;
                                var10++;
                                continue L37;
                              }
                            }
                          }
                        } else {
                          L38: {
                            ((qe) this).field_s = new int[var6];
                            ((qe) this).field_B = new int[var6];
                            ((qe) this).field_A.a(((qe) this).field_B, 0, param2);
                            if (!oa.field_k) {
                              stackOut_127_0 = param1;
                              stackIn_128_0 = stackOut_127_0;
                              break L38;
                            } else {
                              param1 = param1 << 1;
                              stackOut_126_0 = param1 << 1;
                              stackIn_128_0 = stackOut_126_0;
                              break L38;
                            }
                          }
                          var7 = stackIn_128_0;
                          var8 = ((qe) this).field_t * ((qe) this).field_u / 256;
                          var9 = ((qe) this).field_u + -var8;
                          var10 = 0;
                          L39: while (true) {
                            if (var6 <= var10) {
                              return;
                            } else {
                              param0[var10 + var7] = var9 * param0[var10 + var7] + ((qe) this).field_B[var10] * var8 >> -695410072;
                              var10++;
                              continue L39;
                            }
                          }
                        }
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    param0[var7 - -var8] = param0[var7 - -var8] + (((qe) this).field_B[var8] * var4 - -(((qe) this).field_s[var8] * var5) >> 372251144);
                    var8++;
                    continue L33;
                  }
                }
              }
            }
          } else {
            if (null != ((qe) this).field_o) {
              if (0 != ((qe) this).field_t) {
                if (((qe) this).field_B != null) {
                  if (var6 <= ((qe) this).field_B.length) {
                    L40: {
                      pd.a(((qe) this).field_B, 0, var6);
                      ((qe) this).field_A.a(((qe) this).field_B, 0, param2);
                      if (!oa.field_k) {
                        stackOut_55_0 = param1;
                        stackIn_56_0 = stackOut_55_0;
                        break L40;
                      } else {
                        param1 = param1 << 1;
                        stackOut_54_0 = param1 << 1;
                        stackIn_56_0 = stackOut_54_0;
                        break L40;
                      }
                    }
                    var7 = stackIn_56_0;
                    var8 = ((qe) this).field_t * ((qe) this).field_u / 256;
                    var9 = ((qe) this).field_u + -var8;
                    var10 = 0;
                    L41: while (true) {
                      if (var6 <= var10) {
                        return;
                      } else {
                        param0[var10 + var7] = var9 * param0[var10 + var7] + ((qe) this).field_B[var10] * var8 >> -695410072;
                        var10++;
                        continue L41;
                      }
                    }
                  } else {
                    L42: {
                      ((qe) this).field_s = new int[var6];
                      ((qe) this).field_B = new int[var6];
                      ((qe) this).field_A.a(((qe) this).field_B, 0, param2);
                      if (!oa.field_k) {
                        stackOut_48_0 = param1;
                        stackIn_49_0 = stackOut_48_0;
                        break L42;
                      } else {
                        param1 = param1 << 1;
                        stackOut_47_0 = param1 << 1;
                        stackIn_49_0 = stackOut_47_0;
                        break L42;
                      }
                    }
                    var7 = stackIn_49_0;
                    var8 = ((qe) this).field_t * ((qe) this).field_u / 256;
                    var9 = ((qe) this).field_u + -var8;
                    var10 = 0;
                    L43: while (true) {
                      if (var6 <= var10) {
                        return;
                      } else {
                        param0[var10 + var7] = var9 * param0[var10 + var7] + ((qe) this).field_B[var10] * var8 >> -695410072;
                        var10++;
                        continue L43;
                      }
                    }
                  }
                } else {
                  L44: {
                    ((qe) this).field_s = new int[var6];
                    ((qe) this).field_B = new int[var6];
                    ((qe) this).field_A.a(((qe) this).field_B, 0, param2);
                    if (!oa.field_k) {
                      stackOut_40_0 = param1;
                      stackIn_41_0 = stackOut_40_0;
                      break L44;
                    } else {
                      param1 = param1 << 1;
                      stackOut_39_0 = param1 << 1;
                      stackIn_41_0 = stackOut_39_0;
                      break L44;
                    }
                  }
                  var7 = stackIn_41_0;
                  var8 = ((qe) this).field_t * ((qe) this).field_u / 256;
                  var9 = ((qe) this).field_u + -var8;
                  var10 = 0;
                  L45: while (true) {
                    if (var6 <= var10) {
                      return;
                    } else {
                      param0[var10 + var7] = var9 * param0[var10 + var7] + ((qe) this).field_B[var10] * var8 >> -695410072;
                      var10++;
                      continue L45;
                    }
                  }
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final synchronized void d(int param0) {
        int var3 = 0;
        var3 = TrackController.field_F ? 1 : 0;
        if (-1 > ((qe) this).field_m) {
          L0: {
            if (((qe) this).field_x != null) {
              ((qe) this).field_w.d(param0);
              break L0;
            } else {
              break L0;
            }
          }
          if (-1048577 < (((qe) this).field_m ^ -1)) {
            L1: {
              if (((qe) this).field_y != null) {
                ((qe) this).field_r.d(param0);
                break L1;
              } else {
                break L1;
              }
            }
            if (0 < ((qe) this).field_t) {
              if (((qe) this).field_o != null) {
                ((qe) this).field_A.d(param0);
                if (((qe) this).field_q) {
                  L2: {
                    if (0 >= ((qe) this).field_v) {
                      break L2;
                    } else {
                      if (((qe) this).field_w.c((byte) -116)) {
                        break L2;
                      } else {
                        L3: {
                          ((qe) this).field_q = false;
                          ((qe) this).field_x = null;
                          ((qe) this).field_v = -((qe) this).field_v;
                          if (0 != ((qe) this).field_v) {
                            ((qe) this).field_m = ((qe) this).field_m + param0 * ((qe) this).field_v;
                            if (1048576 <= ((qe) this).field_m) {
                              ((qe) this).field_m = 1048576;
                              if (!((qe) this).field_q) {
                                ((qe) this).field_v = 0;
                                if (!((qe) this).field_D) {
                                  if (null == ((qe) this).field_y) {
                                    ((qe) this).field_y = null;
                                    break L3;
                                  } else {
                                    ((qe) this).field_r.f(11795);
                                    ((qe) this).field_y = null;
                                    return;
                                  }
                                } else {
                                  return;
                                }
                              } else {
                                return;
                              }
                            } else {
                              if (-1 <= (((qe) this).field_m ^ -1)) {
                                ((qe) this).field_m = 0;
                                if (((qe) this).field_q) {
                                  break L3;
                                } else {
                                  ((qe) this).field_v = 0;
                                  if (!((qe) this).field_D) {
                                    L4: {
                                      if (null != ((qe) this).field_x) {
                                        ((qe) this).field_w.f(11795);
                                        break L4;
                                      } else {
                                        break L4;
                                      }
                                    }
                                    ((qe) this).field_x = null;
                                    return;
                                  } else {
                                    return;
                                  }
                                }
                              } else {
                                return;
                              }
                            }
                          } else {
                            break L3;
                          }
                        }
                        return;
                      }
                    }
                  }
                  L5: {
                    if (-1 >= (((qe) this).field_v ^ -1)) {
                      break L5;
                    } else {
                      if (!((qe) this).field_r.c((byte) -80)) {
                        ((qe) this).field_v = -((qe) this).field_v;
                        ((qe) this).field_y = null;
                        ((qe) this).field_q = false;
                        break L5;
                      } else {
                        L6: {
                          if (0 != ((qe) this).field_v) {
                            ((qe) this).field_m = ((qe) this).field_m + param0 * ((qe) this).field_v;
                            if (1048576 <= ((qe) this).field_m) {
                              ((qe) this).field_m = 1048576;
                              if (!((qe) this).field_q) {
                                ((qe) this).field_v = 0;
                                if (!((qe) this).field_D) {
                                  if (null == ((qe) this).field_y) {
                                    ((qe) this).field_y = null;
                                    break L6;
                                  } else {
                                    ((qe) this).field_r.f(11795);
                                    ((qe) this).field_y = null;
                                    return;
                                  }
                                } else {
                                  return;
                                }
                              } else {
                                return;
                              }
                            } else {
                              if (-1 <= (((qe) this).field_m ^ -1)) {
                                ((qe) this).field_m = 0;
                                if (((qe) this).field_q) {
                                  break L6;
                                } else {
                                  ((qe) this).field_v = 0;
                                  if (!((qe) this).field_D) {
                                    L7: {
                                      if (null != ((qe) this).field_x) {
                                        ((qe) this).field_w.f(11795);
                                        break L7;
                                      } else {
                                        break L7;
                                      }
                                    }
                                    ((qe) this).field_x = null;
                                    return;
                                  } else {
                                    return;
                                  }
                                }
                              } else {
                                return;
                              }
                            }
                          } else {
                            break L6;
                          }
                        }
                        return;
                      }
                    }
                  }
                  if (0 != ((qe) this).field_v) {
                    L8: {
                      ((qe) this).field_m = ((qe) this).field_m + param0 * ((qe) this).field_v;
                      if (1048576 <= ((qe) this).field_m) {
                        ((qe) this).field_m = 1048576;
                        if (!((qe) this).field_q) {
                          ((qe) this).field_v = 0;
                          if (!((qe) this).field_D) {
                            if (null == ((qe) this).field_y) {
                              ((qe) this).field_y = null;
                              break L8;
                            } else {
                              ((qe) this).field_r.f(11795);
                              ((qe) this).field_y = null;
                              return;
                            }
                          } else {
                            return;
                          }
                        } else {
                          return;
                        }
                      } else {
                        if (-1 <= (((qe) this).field_m ^ -1)) {
                          ((qe) this).field_m = 0;
                          if (((qe) this).field_q) {
                            break L8;
                          } else {
                            ((qe) this).field_v = 0;
                            if (!((qe) this).field_D) {
                              L9: {
                                if (null != ((qe) this).field_x) {
                                  ((qe) this).field_w.f(11795);
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                              ((qe) this).field_x = null;
                              return;
                            } else {
                              return;
                            }
                          }
                        } else {
                          return;
                        }
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                } else {
                  L10: {
                    if (0 != ((qe) this).field_v) {
                      ((qe) this).field_m = ((qe) this).field_m + param0 * ((qe) this).field_v;
                      if (1048576 <= ((qe) this).field_m) {
                        ((qe) this).field_m = 1048576;
                        if (!((qe) this).field_q) {
                          ((qe) this).field_v = 0;
                          if (!((qe) this).field_D) {
                            if (null == ((qe) this).field_y) {
                              ((qe) this).field_y = null;
                              break L10;
                            } else {
                              ((qe) this).field_r.f(11795);
                              ((qe) this).field_y = null;
                              return;
                            }
                          } else {
                            return;
                          }
                        } else {
                          return;
                        }
                      } else {
                        if (-1 <= (((qe) this).field_m ^ -1)) {
                          ((qe) this).field_m = 0;
                          if (((qe) this).field_q) {
                            break L10;
                          } else {
                            ((qe) this).field_v = 0;
                            if (!((qe) this).field_D) {
                              L11: {
                                if (null != ((qe) this).field_x) {
                                  ((qe) this).field_w.f(11795);
                                  break L11;
                                } else {
                                  break L11;
                                }
                              }
                              ((qe) this).field_x = null;
                              return;
                            } else {
                              return;
                            }
                          }
                        } else {
                          return;
                        }
                      }
                    } else {
                      break L10;
                    }
                  }
                  return;
                }
              } else {
                if (((qe) this).field_q) {
                  L12: {
                    if (0 >= ((qe) this).field_v) {
                      break L12;
                    } else {
                      if (((qe) this).field_w.c((byte) -116)) {
                        break L12;
                      } else {
                        L13: {
                          ((qe) this).field_q = false;
                          ((qe) this).field_x = null;
                          ((qe) this).field_v = -((qe) this).field_v;
                          if (0 != ((qe) this).field_v) {
                            ((qe) this).field_m = ((qe) this).field_m + param0 * ((qe) this).field_v;
                            if (1048576 <= ((qe) this).field_m) {
                              ((qe) this).field_m = 1048576;
                              if (!((qe) this).field_q) {
                                ((qe) this).field_v = 0;
                                if (!((qe) this).field_D) {
                                  if (null == ((qe) this).field_y) {
                                    ((qe) this).field_y = null;
                                    break L13;
                                  } else {
                                    ((qe) this).field_r.f(11795);
                                    ((qe) this).field_y = null;
                                    return;
                                  }
                                } else {
                                  return;
                                }
                              } else {
                                return;
                              }
                            } else {
                              if (-1 <= (((qe) this).field_m ^ -1)) {
                                ((qe) this).field_m = 0;
                                if (((qe) this).field_q) {
                                  break L13;
                                } else {
                                  ((qe) this).field_v = 0;
                                  if (!((qe) this).field_D) {
                                    L14: {
                                      if (null != ((qe) this).field_x) {
                                        ((qe) this).field_w.f(11795);
                                        break L14;
                                      } else {
                                        break L14;
                                      }
                                    }
                                    ((qe) this).field_x = null;
                                    return;
                                  } else {
                                    return;
                                  }
                                }
                              } else {
                                return;
                              }
                            }
                          } else {
                            break L13;
                          }
                        }
                        return;
                      }
                    }
                  }
                  L15: {
                    if (-1 >= (((qe) this).field_v ^ -1)) {
                      break L15;
                    } else {
                      if (!((qe) this).field_r.c((byte) -80)) {
                        ((qe) this).field_v = -((qe) this).field_v;
                        ((qe) this).field_y = null;
                        ((qe) this).field_q = false;
                        break L15;
                      } else {
                        L16: {
                          if (0 != ((qe) this).field_v) {
                            ((qe) this).field_m = ((qe) this).field_m + param0 * ((qe) this).field_v;
                            if (1048576 <= ((qe) this).field_m) {
                              ((qe) this).field_m = 1048576;
                              if (!((qe) this).field_q) {
                                ((qe) this).field_v = 0;
                                if (!((qe) this).field_D) {
                                  if (null == ((qe) this).field_y) {
                                    ((qe) this).field_y = null;
                                    break L16;
                                  } else {
                                    ((qe) this).field_r.f(11795);
                                    ((qe) this).field_y = null;
                                    return;
                                  }
                                } else {
                                  return;
                                }
                              } else {
                                return;
                              }
                            } else {
                              if (-1 <= (((qe) this).field_m ^ -1)) {
                                ((qe) this).field_m = 0;
                                if (((qe) this).field_q) {
                                  break L16;
                                } else {
                                  ((qe) this).field_v = 0;
                                  if (!((qe) this).field_D) {
                                    L17: {
                                      if (null != ((qe) this).field_x) {
                                        ((qe) this).field_w.f(11795);
                                        break L17;
                                      } else {
                                        break L17;
                                      }
                                    }
                                    ((qe) this).field_x = null;
                                    return;
                                  } else {
                                    return;
                                  }
                                }
                              } else {
                                return;
                              }
                            }
                          } else {
                            break L16;
                          }
                        }
                        return;
                      }
                    }
                  }
                  if (0 != ((qe) this).field_v) {
                    L18: {
                      ((qe) this).field_m = ((qe) this).field_m + param0 * ((qe) this).field_v;
                      if (1048576 <= ((qe) this).field_m) {
                        ((qe) this).field_m = 1048576;
                        if (!((qe) this).field_q) {
                          ((qe) this).field_v = 0;
                          if (!((qe) this).field_D) {
                            if (null == ((qe) this).field_y) {
                              ((qe) this).field_y = null;
                              break L18;
                            } else {
                              ((qe) this).field_r.f(11795);
                              ((qe) this).field_y = null;
                              return;
                            }
                          } else {
                            return;
                          }
                        } else {
                          return;
                        }
                      } else {
                        if (-1 <= (((qe) this).field_m ^ -1)) {
                          ((qe) this).field_m = 0;
                          if (((qe) this).field_q) {
                            break L18;
                          } else {
                            ((qe) this).field_v = 0;
                            if (!((qe) this).field_D) {
                              L19: {
                                if (null != ((qe) this).field_x) {
                                  ((qe) this).field_w.f(11795);
                                  break L19;
                                } else {
                                  break L19;
                                }
                              }
                              ((qe) this).field_x = null;
                              return;
                            } else {
                              return;
                            }
                          }
                        } else {
                          return;
                        }
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                } else {
                  L20: {
                    if (0 != ((qe) this).field_v) {
                      ((qe) this).field_m = ((qe) this).field_m + param0 * ((qe) this).field_v;
                      if (1048576 <= ((qe) this).field_m) {
                        ((qe) this).field_m = 1048576;
                        if (!((qe) this).field_q) {
                          ((qe) this).field_v = 0;
                          if (!((qe) this).field_D) {
                            if (null == ((qe) this).field_y) {
                              ((qe) this).field_y = null;
                              break L20;
                            } else {
                              ((qe) this).field_r.f(11795);
                              ((qe) this).field_y = null;
                              return;
                            }
                          } else {
                            return;
                          }
                        } else {
                          return;
                        }
                      } else {
                        if (-1 <= (((qe) this).field_m ^ -1)) {
                          ((qe) this).field_m = 0;
                          if (((qe) this).field_q) {
                            break L20;
                          } else {
                            ((qe) this).field_v = 0;
                            if (!((qe) this).field_D) {
                              L21: {
                                if (null != ((qe) this).field_x) {
                                  ((qe) this).field_w.f(11795);
                                  break L21;
                                } else {
                                  break L21;
                                }
                              }
                              ((qe) this).field_x = null;
                              return;
                            } else {
                              return;
                            }
                          }
                        } else {
                          return;
                        }
                      }
                    } else {
                      break L20;
                    }
                  }
                  return;
                }
              }
            } else {
              if (((qe) this).field_q) {
                L22: {
                  if (0 >= ((qe) this).field_v) {
                    break L22;
                  } else {
                    if (((qe) this).field_w.c((byte) -116)) {
                      break L22;
                    } else {
                      L23: {
                        ((qe) this).field_q = false;
                        ((qe) this).field_x = null;
                        ((qe) this).field_v = -((qe) this).field_v;
                        if (0 != ((qe) this).field_v) {
                          ((qe) this).field_m = ((qe) this).field_m + param0 * ((qe) this).field_v;
                          if (1048576 <= ((qe) this).field_m) {
                            ((qe) this).field_m = 1048576;
                            if (!((qe) this).field_q) {
                              ((qe) this).field_v = 0;
                              if (!((qe) this).field_D) {
                                if (null == ((qe) this).field_y) {
                                  ((qe) this).field_y = null;
                                  break L23;
                                } else {
                                  ((qe) this).field_r.f(11795);
                                  ((qe) this).field_y = null;
                                  return;
                                }
                              } else {
                                return;
                              }
                            } else {
                              return;
                            }
                          } else {
                            if (-1 <= (((qe) this).field_m ^ -1)) {
                              ((qe) this).field_m = 0;
                              if (((qe) this).field_q) {
                                break L23;
                              } else {
                                ((qe) this).field_v = 0;
                                if (!((qe) this).field_D) {
                                  L24: {
                                    if (null != ((qe) this).field_x) {
                                      ((qe) this).field_w.f(11795);
                                      break L24;
                                    } else {
                                      break L24;
                                    }
                                  }
                                  ((qe) this).field_x = null;
                                  return;
                                } else {
                                  return;
                                }
                              }
                            } else {
                              return;
                            }
                          }
                        } else {
                          break L23;
                        }
                      }
                      return;
                    }
                  }
                }
                L25: {
                  if (-1 >= (((qe) this).field_v ^ -1)) {
                    break L25;
                  } else {
                    if (!((qe) this).field_r.c((byte) -80)) {
                      ((qe) this).field_v = -((qe) this).field_v;
                      ((qe) this).field_y = null;
                      ((qe) this).field_q = false;
                      break L25;
                    } else {
                      L26: {
                        if (0 != ((qe) this).field_v) {
                          ((qe) this).field_m = ((qe) this).field_m + param0 * ((qe) this).field_v;
                          if (1048576 <= ((qe) this).field_m) {
                            ((qe) this).field_m = 1048576;
                            if (!((qe) this).field_q) {
                              ((qe) this).field_v = 0;
                              if (!((qe) this).field_D) {
                                if (null == ((qe) this).field_y) {
                                  ((qe) this).field_y = null;
                                  break L26;
                                } else {
                                  ((qe) this).field_r.f(11795);
                                  ((qe) this).field_y = null;
                                  return;
                                }
                              } else {
                                return;
                              }
                            } else {
                              return;
                            }
                          } else {
                            if (-1 <= (((qe) this).field_m ^ -1)) {
                              ((qe) this).field_m = 0;
                              if (((qe) this).field_q) {
                                break L26;
                              } else {
                                ((qe) this).field_v = 0;
                                if (!((qe) this).field_D) {
                                  L27: {
                                    if (null != ((qe) this).field_x) {
                                      ((qe) this).field_w.f(11795);
                                      break L27;
                                    } else {
                                      break L27;
                                    }
                                  }
                                  ((qe) this).field_x = null;
                                  return;
                                } else {
                                  return;
                                }
                              }
                            } else {
                              return;
                            }
                          }
                        } else {
                          break L26;
                        }
                      }
                      return;
                    }
                  }
                }
                if (0 != ((qe) this).field_v) {
                  L28: {
                    ((qe) this).field_m = ((qe) this).field_m + param0 * ((qe) this).field_v;
                    if (1048576 <= ((qe) this).field_m) {
                      ((qe) this).field_m = 1048576;
                      if (!((qe) this).field_q) {
                        ((qe) this).field_v = 0;
                        if (!((qe) this).field_D) {
                          if (null == ((qe) this).field_y) {
                            ((qe) this).field_y = null;
                            break L28;
                          } else {
                            ((qe) this).field_r.f(11795);
                            ((qe) this).field_y = null;
                            return;
                          }
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      if (-1 <= (((qe) this).field_m ^ -1)) {
                        ((qe) this).field_m = 0;
                        if (((qe) this).field_q) {
                          break L28;
                        } else {
                          ((qe) this).field_v = 0;
                          if (!((qe) this).field_D) {
                            L29: {
                              if (null != ((qe) this).field_x) {
                                ((qe) this).field_w.f(11795);
                                break L29;
                              } else {
                                break L29;
                              }
                            }
                            ((qe) this).field_x = null;
                            return;
                          } else {
                            return;
                          }
                        }
                      } else {
                        return;
                      }
                    }
                  }
                  return;
                } else {
                  return;
                }
              } else {
                if (0 != ((qe) this).field_v) {
                  ((qe) this).field_m = ((qe) this).field_m + param0 * ((qe) this).field_v;
                  if (1048576 <= ((qe) this).field_m) {
                    ((qe) this).field_m = 1048576;
                    if (!((qe) this).field_q) {
                      ((qe) this).field_v = 0;
                      if (!((qe) this).field_D) {
                        if (null != ((qe) this).field_y) {
                          ((qe) this).field_r.f(11795);
                          ((qe) this).field_y = null;
                          return;
                        } else {
                          ((qe) this).field_y = null;
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    if (-1 <= (((qe) this).field_m ^ -1)) {
                      ((qe) this).field_m = 0;
                      if (!((qe) this).field_q) {
                        ((qe) this).field_v = 0;
                        if (!((qe) this).field_D) {
                          L30: {
                            if (null != ((qe) this).field_x) {
                              ((qe) this).field_w.f(11795);
                              break L30;
                            } else {
                              break L30;
                            }
                          }
                          ((qe) this).field_x = null;
                          return;
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  return;
                }
              }
            }
          } else {
            L31: {
              if (0 >= ((qe) this).field_t) {
                break L31;
              } else {
                if (((qe) this).field_o == null) {
                  break L31;
                } else {
                  ((qe) this).field_A.d(param0);
                  break L31;
                }
              }
            }
            L32: {
              if (((qe) this).field_q) {
                L33: {
                  if (0 >= ((qe) this).field_v) {
                    break L33;
                  } else {
                    if (((qe) this).field_w.c((byte) -116)) {
                      break L33;
                    } else {
                      ((qe) this).field_q = false;
                      ((qe) this).field_x = null;
                      ((qe) this).field_v = -((qe) this).field_v;
                      break L32;
                    }
                  }
                }
                if (-1 >= (((qe) this).field_v ^ -1)) {
                  break L32;
                } else {
                  if (!((qe) this).field_r.c((byte) -80)) {
                    ((qe) this).field_v = -((qe) this).field_v;
                    ((qe) this).field_y = null;
                    ((qe) this).field_q = false;
                    break L32;
                  } else {
                    break L32;
                  }
                }
              } else {
                break L32;
              }
            }
            if (0 != ((qe) this).field_v) {
              ((qe) this).field_m = ((qe) this).field_m + param0 * ((qe) this).field_v;
              if (1048576 <= ((qe) this).field_m) {
                ((qe) this).field_m = 1048576;
                if (!((qe) this).field_q) {
                  ((qe) this).field_v = 0;
                  if (!((qe) this).field_D) {
                    if (null == ((qe) this).field_y) {
                      ((qe) this).field_y = null;
                      return;
                    } else {
                      ((qe) this).field_r.f(11795);
                      ((qe) this).field_y = null;
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                if (-1 <= (((qe) this).field_m ^ -1)) {
                  ((qe) this).field_m = 0;
                  if (!((qe) this).field_q) {
                    ((qe) this).field_v = 0;
                    if (((qe) this).field_D) {
                      return;
                    } else {
                      L34: {
                        if (null != ((qe) this).field_x) {
                          ((qe) this).field_w.f(11795);
                          break L34;
                        } else {
                          break L34;
                        }
                      }
                      ((qe) this).field_x = null;
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              return;
            }
          }
        } else {
          L35: {
            if (-1048577 <= ((qe) this).field_m) {
              if (0 < ((qe) this).field_t) {
                if (((qe) this).field_o == null) {
                  break L35;
                } else {
                  ((qe) this).field_A.d(param0);
                  break L35;
                }
              } else {
                if (0 >= ((qe) this).field_t) {
                  break L35;
                } else {
                  if (((qe) this).field_o == null) {
                    break L35;
                  } else {
                    ((qe) this).field_A.d(param0);
                    break L35;
                  }
                }
              }
            } else {
              if (0 < ((qe) this).field_t) {
                if (((qe) this).field_o == null) {
                  break L35;
                } else {
                  ((qe) this).field_A.d(param0);
                  break L35;
                }
              } else {
                if (0 >= ((qe) this).field_t) {
                  break L35;
                } else {
                  if (((qe) this).field_o == null) {
                    break L35;
                  } else {
                    ((qe) this).field_A.d(param0);
                    break L35;
                  }
                }
              }
            }
          }
          L36: {
            if (((qe) this).field_q) {
              L37: {
                if (0 >= ((qe) this).field_v) {
                  break L37;
                } else {
                  if (((qe) this).field_w.c((byte) -116)) {
                    break L37;
                  } else {
                    ((qe) this).field_q = false;
                    ((qe) this).field_x = null;
                    ((qe) this).field_v = -((qe) this).field_v;
                    break L36;
                  }
                }
              }
              if (-1 >= (((qe) this).field_v ^ -1)) {
                break L36;
              } else {
                if (!((qe) this).field_r.c((byte) -80)) {
                  ((qe) this).field_v = -((qe) this).field_v;
                  ((qe) this).field_y = null;
                  ((qe) this).field_q = false;
                  break L36;
                } else {
                  break L36;
                }
              }
            } else {
              break L36;
            }
          }
          if (0 != ((qe) this).field_v) {
            ((qe) this).field_m = ((qe) this).field_m + param0 * ((qe) this).field_v;
            if (1048576 <= ((qe) this).field_m) {
              ((qe) this).field_m = 1048576;
              if (!((qe) this).field_q) {
                ((qe) this).field_v = 0;
                if (!((qe) this).field_D) {
                  if (null != ((qe) this).field_y) {
                    ((qe) this).field_r.f(11795);
                    ((qe) this).field_y = null;
                    return;
                  } else {
                    ((qe) this).field_y = null;
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              if (-1 <= (((qe) this).field_m ^ -1)) {
                ((qe) this).field_m = 0;
                if (!((qe) this).field_q) {
                  ((qe) this).field_v = 0;
                  if (((qe) this).field_D) {
                    return;
                  } else {
                    L38: {
                      if (null != ((qe) this).field_x) {
                        ((qe) this).field_w.f(11795);
                        break L38;
                      } else {
                        break L38;
                      }
                    }
                    ((qe) this).field_x = null;
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            return;
          }
        }
    }

    final static qj[] a(int param0, int param1, int param2, int param3) {
        if (param3 != 1) {
          qe.e(52);
          return gl.b(param2, 1, param1, 104, param0);
        } else {
          return gl.b(param2, 1, param1, 104, param0);
        }
    }

    public static void e(int param0) {
        field_C = null;
        field_z = null;
        if (param0 != 1048576) {
            return;
        }
        field_n = null;
    }

    final synchronized void a(boolean param0, int param1, boolean param2, int param3, wb param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        nb stackIn_19_0 = null;
        wb stackIn_19_1 = null;
        int stackIn_19_2 = 0;
        nb stackIn_20_0 = null;
        wb stackIn_20_1 = null;
        int stackIn_20_2 = 0;
        nb stackIn_21_0 = null;
        wb stackIn_21_1 = null;
        int stackIn_21_2 = 0;
        int stackIn_21_3 = 0;
        nb stackIn_28_0 = null;
        wb stackIn_28_1 = null;
        int stackIn_28_2 = 0;
        nb stackIn_29_0 = null;
        wb stackIn_29_1 = null;
        int stackIn_29_2 = 0;
        nb stackIn_30_0 = null;
        wb stackIn_30_1 = null;
        int stackIn_30_2 = 0;
        int stackIn_30_3 = 0;
        nb stackIn_42_0 = null;
        wb stackIn_42_1 = null;
        int stackIn_42_2 = 0;
        nb stackIn_43_0 = null;
        wb stackIn_43_1 = null;
        int stackIn_43_2 = 0;
        nb stackIn_44_0 = null;
        wb stackIn_44_1 = null;
        int stackIn_44_2 = 0;
        int stackIn_44_3 = 0;
        nb stackIn_51_0 = null;
        wb stackIn_51_1 = null;
        int stackIn_51_2 = 0;
        nb stackIn_52_0 = null;
        wb stackIn_52_1 = null;
        int stackIn_52_2 = 0;
        nb stackIn_53_0 = null;
        wb stackIn_53_1 = null;
        int stackIn_53_2 = 0;
        int stackIn_53_3 = 0;
        int stackIn_59_0 = 0;
        nb stackIn_66_0 = null;
        wb stackIn_66_1 = null;
        int stackIn_66_2 = 0;
        nb stackIn_67_0 = null;
        wb stackIn_67_1 = null;
        int stackIn_67_2 = 0;
        nb stackIn_68_0 = null;
        wb stackIn_68_1 = null;
        int stackIn_68_2 = 0;
        int stackIn_68_3 = 0;
        nb stackIn_75_0 = null;
        wb stackIn_75_1 = null;
        int stackIn_75_2 = 0;
        nb stackIn_76_0 = null;
        wb stackIn_76_1 = null;
        int stackIn_76_2 = 0;
        nb stackIn_77_0 = null;
        wb stackIn_77_1 = null;
        int stackIn_77_2 = 0;
        int stackIn_77_3 = 0;
        nb stackIn_85_0 = null;
        wb stackIn_85_1 = null;
        int stackIn_85_2 = 0;
        nb stackIn_86_0 = null;
        wb stackIn_86_1 = null;
        int stackIn_86_2 = 0;
        nb stackIn_87_0 = null;
        wb stackIn_87_1 = null;
        int stackIn_87_2 = 0;
        int stackIn_87_3 = 0;
        nb stackIn_92_0 = null;
        wb stackIn_92_1 = null;
        int stackIn_92_2 = 0;
        nb stackIn_93_0 = null;
        wb stackIn_93_1 = null;
        int stackIn_93_2 = 0;
        nb stackIn_94_0 = null;
        wb stackIn_94_1 = null;
        int stackIn_94_2 = 0;
        int stackIn_94_3 = 0;
        nb stackIn_100_0 = null;
        wb stackIn_100_1 = null;
        int stackIn_100_2 = 0;
        nb stackIn_101_0 = null;
        wb stackIn_101_1 = null;
        int stackIn_101_2 = 0;
        nb stackIn_102_0 = null;
        wb stackIn_102_1 = null;
        int stackIn_102_2 = 0;
        int stackIn_102_3 = 0;
        nb stackIn_107_0 = null;
        wb stackIn_107_1 = null;
        int stackIn_107_2 = 0;
        nb stackIn_108_0 = null;
        wb stackIn_108_1 = null;
        int stackIn_108_2 = 0;
        nb stackIn_109_0 = null;
        wb stackIn_109_1 = null;
        int stackIn_109_2 = 0;
        int stackIn_109_3 = 0;
        Object stackIn_131_0 = null;
        Object stackIn_132_0 = null;
        Object stackIn_133_0 = null;
        int stackIn_133_1 = 0;
        nb stackIn_148_0 = null;
        wb stackIn_148_1 = null;
        int stackIn_148_2 = 0;
        nb stackIn_149_0 = null;
        wb stackIn_149_1 = null;
        int stackIn_149_2 = 0;
        nb stackIn_150_0 = null;
        wb stackIn_150_1 = null;
        int stackIn_150_2 = 0;
        int stackIn_150_3 = 0;
        nb stackIn_156_0 = null;
        wb stackIn_156_1 = null;
        int stackIn_156_2 = 0;
        nb stackIn_157_0 = null;
        wb stackIn_157_1 = null;
        int stackIn_157_2 = 0;
        nb stackIn_158_0 = null;
        wb stackIn_158_1 = null;
        int stackIn_158_2 = 0;
        int stackIn_158_3 = 0;
        nb stackIn_163_0 = null;
        wb stackIn_163_1 = null;
        int stackIn_163_2 = 0;
        nb stackIn_164_0 = null;
        wb stackIn_164_1 = null;
        int stackIn_164_2 = 0;
        nb stackIn_165_0 = null;
        wb stackIn_165_1 = null;
        int stackIn_165_2 = 0;
        int stackIn_165_3 = 0;
        nb stackIn_177_0 = null;
        wb stackIn_177_1 = null;
        int stackIn_177_2 = 0;
        nb stackIn_178_0 = null;
        wb stackIn_178_1 = null;
        int stackIn_178_2 = 0;
        nb stackIn_179_0 = null;
        wb stackIn_179_1 = null;
        int stackIn_179_2 = 0;
        int stackIn_179_3 = 0;
        nb stackIn_186_0 = null;
        wb stackIn_186_1 = null;
        int stackIn_186_2 = 0;
        nb stackIn_187_0 = null;
        wb stackIn_187_1 = null;
        int stackIn_187_2 = 0;
        nb stackIn_188_0 = null;
        wb stackIn_188_1 = null;
        int stackIn_188_2 = 0;
        int stackIn_188_3 = 0;
        nb stackIn_196_0 = null;
        wb stackIn_196_1 = null;
        int stackIn_196_2 = 0;
        nb stackIn_197_0 = null;
        wb stackIn_197_1 = null;
        int stackIn_197_2 = 0;
        nb stackIn_198_0 = null;
        wb stackIn_198_1 = null;
        int stackIn_198_2 = 0;
        int stackIn_198_3 = 0;
        nb stackIn_203_0 = null;
        wb stackIn_203_1 = null;
        int stackIn_203_2 = 0;
        nb stackIn_204_0 = null;
        wb stackIn_204_1 = null;
        int stackIn_204_2 = 0;
        nb stackIn_205_0 = null;
        wb stackIn_205_1 = null;
        int stackIn_205_2 = 0;
        int stackIn_205_3 = 0;
        nb stackIn_211_0 = null;
        wb stackIn_211_1 = null;
        int stackIn_211_2 = 0;
        nb stackIn_212_0 = null;
        wb stackIn_212_1 = null;
        int stackIn_212_2 = 0;
        nb stackIn_213_0 = null;
        wb stackIn_213_1 = null;
        int stackIn_213_2 = 0;
        int stackIn_213_3 = 0;
        nb stackIn_218_0 = null;
        wb stackIn_218_1 = null;
        int stackIn_218_2 = 0;
        nb stackIn_219_0 = null;
        wb stackIn_219_1 = null;
        int stackIn_219_2 = 0;
        nb stackIn_220_0 = null;
        wb stackIn_220_1 = null;
        int stackIn_220_2 = 0;
        int stackIn_220_3 = 0;
        int stackIn_227_0 = 0;
        nb stackIn_233_0 = null;
        wb stackIn_233_1 = null;
        int stackIn_233_2 = 0;
        nb stackIn_234_0 = null;
        wb stackIn_234_1 = null;
        int stackIn_234_2 = 0;
        nb stackIn_235_0 = null;
        wb stackIn_235_1 = null;
        int stackIn_235_2 = 0;
        int stackIn_235_3 = 0;
        nb stackIn_240_0 = null;
        wb stackIn_240_1 = null;
        int stackIn_240_2 = 0;
        nb stackIn_241_0 = null;
        wb stackIn_241_1 = null;
        int stackIn_241_2 = 0;
        nb stackIn_242_0 = null;
        wb stackIn_242_1 = null;
        int stackIn_242_2 = 0;
        int stackIn_242_3 = 0;
        nb stackIn_248_0 = null;
        wb stackIn_248_1 = null;
        int stackIn_248_2 = 0;
        nb stackIn_249_0 = null;
        wb stackIn_249_1 = null;
        int stackIn_249_2 = 0;
        nb stackIn_250_0 = null;
        wb stackIn_250_1 = null;
        int stackIn_250_2 = 0;
        int stackIn_250_3 = 0;
        nb stackIn_255_0 = null;
        wb stackIn_255_1 = null;
        int stackIn_255_2 = 0;
        nb stackIn_256_0 = null;
        wb stackIn_256_1 = null;
        int stackIn_256_2 = 0;
        nb stackIn_257_0 = null;
        wb stackIn_257_1 = null;
        int stackIn_257_2 = 0;
        int stackIn_257_3 = 0;
        nb stackIn_266_0 = null;
        wb stackIn_266_1 = null;
        int stackIn_266_2 = 0;
        nb stackIn_267_0 = null;
        wb stackIn_267_1 = null;
        int stackIn_267_2 = 0;
        nb stackIn_268_0 = null;
        wb stackIn_268_1 = null;
        int stackIn_268_2 = 0;
        int stackIn_268_3 = 0;
        nb stackIn_273_0 = null;
        wb stackIn_273_1 = null;
        int stackIn_273_2 = 0;
        nb stackIn_274_0 = null;
        wb stackIn_274_1 = null;
        int stackIn_274_2 = 0;
        nb stackIn_275_0 = null;
        wb stackIn_275_1 = null;
        int stackIn_275_2 = 0;
        int stackIn_275_3 = 0;
        nb stackIn_281_0 = null;
        wb stackIn_281_1 = null;
        int stackIn_281_2 = 0;
        nb stackIn_282_0 = null;
        wb stackIn_282_1 = null;
        int stackIn_282_2 = 0;
        nb stackIn_283_0 = null;
        wb stackIn_283_1 = null;
        int stackIn_283_2 = 0;
        int stackIn_283_3 = 0;
        nb stackIn_288_0 = null;
        wb stackIn_288_1 = null;
        int stackIn_288_2 = 0;
        nb stackIn_289_0 = null;
        wb stackIn_289_1 = null;
        int stackIn_289_2 = 0;
        nb stackIn_290_0 = null;
        wb stackIn_290_1 = null;
        int stackIn_290_2 = 0;
        int stackIn_290_3 = 0;
        Object stackOut_130_0 = null;
        Object stackOut_132_0 = null;
        int stackOut_132_1 = 0;
        Object stackOut_131_0 = null;
        int stackOut_131_1 = 0;
        int stackOut_226_0 = 0;
        int stackOut_225_0 = 0;
        nb stackOut_287_0 = null;
        wb stackOut_287_1 = null;
        int stackOut_287_2 = 0;
        nb stackOut_289_0 = null;
        wb stackOut_289_1 = null;
        int stackOut_289_2 = 0;
        int stackOut_289_3 = 0;
        nb stackOut_288_0 = null;
        wb stackOut_288_1 = null;
        int stackOut_288_2 = 0;
        int stackOut_288_3 = 0;
        nb stackOut_280_0 = null;
        wb stackOut_280_1 = null;
        int stackOut_280_2 = 0;
        nb stackOut_282_0 = null;
        wb stackOut_282_1 = null;
        int stackOut_282_2 = 0;
        int stackOut_282_3 = 0;
        nb stackOut_281_0 = null;
        wb stackOut_281_1 = null;
        int stackOut_281_2 = 0;
        int stackOut_281_3 = 0;
        nb stackOut_272_0 = null;
        wb stackOut_272_1 = null;
        int stackOut_272_2 = 0;
        nb stackOut_274_0 = null;
        wb stackOut_274_1 = null;
        int stackOut_274_2 = 0;
        int stackOut_274_3 = 0;
        nb stackOut_273_0 = null;
        wb stackOut_273_1 = null;
        int stackOut_273_2 = 0;
        int stackOut_273_3 = 0;
        nb stackOut_265_0 = null;
        wb stackOut_265_1 = null;
        int stackOut_265_2 = 0;
        nb stackOut_267_0 = null;
        wb stackOut_267_1 = null;
        int stackOut_267_2 = 0;
        int stackOut_267_3 = 0;
        nb stackOut_266_0 = null;
        wb stackOut_266_1 = null;
        int stackOut_266_2 = 0;
        int stackOut_266_3 = 0;
        nb stackOut_254_0 = null;
        wb stackOut_254_1 = null;
        int stackOut_254_2 = 0;
        nb stackOut_256_0 = null;
        wb stackOut_256_1 = null;
        int stackOut_256_2 = 0;
        int stackOut_256_3 = 0;
        nb stackOut_255_0 = null;
        wb stackOut_255_1 = null;
        int stackOut_255_2 = 0;
        int stackOut_255_3 = 0;
        nb stackOut_247_0 = null;
        wb stackOut_247_1 = null;
        int stackOut_247_2 = 0;
        nb stackOut_249_0 = null;
        wb stackOut_249_1 = null;
        int stackOut_249_2 = 0;
        int stackOut_249_3 = 0;
        nb stackOut_248_0 = null;
        wb stackOut_248_1 = null;
        int stackOut_248_2 = 0;
        int stackOut_248_3 = 0;
        nb stackOut_239_0 = null;
        wb stackOut_239_1 = null;
        int stackOut_239_2 = 0;
        nb stackOut_241_0 = null;
        wb stackOut_241_1 = null;
        int stackOut_241_2 = 0;
        int stackOut_241_3 = 0;
        nb stackOut_240_0 = null;
        wb stackOut_240_1 = null;
        int stackOut_240_2 = 0;
        int stackOut_240_3 = 0;
        nb stackOut_232_0 = null;
        wb stackOut_232_1 = null;
        int stackOut_232_2 = 0;
        nb stackOut_234_0 = null;
        wb stackOut_234_1 = null;
        int stackOut_234_2 = 0;
        int stackOut_234_3 = 0;
        nb stackOut_233_0 = null;
        wb stackOut_233_1 = null;
        int stackOut_233_2 = 0;
        int stackOut_233_3 = 0;
        nb stackOut_217_0 = null;
        wb stackOut_217_1 = null;
        int stackOut_217_2 = 0;
        nb stackOut_219_0 = null;
        wb stackOut_219_1 = null;
        int stackOut_219_2 = 0;
        int stackOut_219_3 = 0;
        nb stackOut_218_0 = null;
        wb stackOut_218_1 = null;
        int stackOut_218_2 = 0;
        int stackOut_218_3 = 0;
        nb stackOut_210_0 = null;
        wb stackOut_210_1 = null;
        int stackOut_210_2 = 0;
        nb stackOut_212_0 = null;
        wb stackOut_212_1 = null;
        int stackOut_212_2 = 0;
        int stackOut_212_3 = 0;
        nb stackOut_211_0 = null;
        wb stackOut_211_1 = null;
        int stackOut_211_2 = 0;
        int stackOut_211_3 = 0;
        nb stackOut_202_0 = null;
        wb stackOut_202_1 = null;
        int stackOut_202_2 = 0;
        nb stackOut_204_0 = null;
        wb stackOut_204_1 = null;
        int stackOut_204_2 = 0;
        int stackOut_204_3 = 0;
        nb stackOut_203_0 = null;
        wb stackOut_203_1 = null;
        int stackOut_203_2 = 0;
        int stackOut_203_3 = 0;
        nb stackOut_195_0 = null;
        wb stackOut_195_1 = null;
        int stackOut_195_2 = 0;
        nb stackOut_197_0 = null;
        wb stackOut_197_1 = null;
        int stackOut_197_2 = 0;
        int stackOut_197_3 = 0;
        nb stackOut_196_0 = null;
        wb stackOut_196_1 = null;
        int stackOut_196_2 = 0;
        int stackOut_196_3 = 0;
        nb stackOut_185_0 = null;
        wb stackOut_185_1 = null;
        int stackOut_185_2 = 0;
        nb stackOut_187_0 = null;
        wb stackOut_187_1 = null;
        int stackOut_187_2 = 0;
        int stackOut_187_3 = 0;
        nb stackOut_186_0 = null;
        wb stackOut_186_1 = null;
        int stackOut_186_2 = 0;
        int stackOut_186_3 = 0;
        nb stackOut_176_0 = null;
        wb stackOut_176_1 = null;
        int stackOut_176_2 = 0;
        nb stackOut_178_0 = null;
        wb stackOut_178_1 = null;
        int stackOut_178_2 = 0;
        int stackOut_178_3 = 0;
        nb stackOut_177_0 = null;
        wb stackOut_177_1 = null;
        int stackOut_177_2 = 0;
        int stackOut_177_3 = 0;
        nb stackOut_162_0 = null;
        wb stackOut_162_1 = null;
        int stackOut_162_2 = 0;
        nb stackOut_164_0 = null;
        wb stackOut_164_1 = null;
        int stackOut_164_2 = 0;
        int stackOut_164_3 = 0;
        nb stackOut_163_0 = null;
        wb stackOut_163_1 = null;
        int stackOut_163_2 = 0;
        int stackOut_163_3 = 0;
        nb stackOut_155_0 = null;
        wb stackOut_155_1 = null;
        int stackOut_155_2 = 0;
        nb stackOut_157_0 = null;
        wb stackOut_157_1 = null;
        int stackOut_157_2 = 0;
        int stackOut_157_3 = 0;
        nb stackOut_156_0 = null;
        wb stackOut_156_1 = null;
        int stackOut_156_2 = 0;
        int stackOut_156_3 = 0;
        nb stackOut_147_0 = null;
        wb stackOut_147_1 = null;
        int stackOut_147_2 = 0;
        nb stackOut_149_0 = null;
        wb stackOut_149_1 = null;
        int stackOut_149_2 = 0;
        int stackOut_149_3 = 0;
        nb stackOut_148_0 = null;
        wb stackOut_148_1 = null;
        int stackOut_148_2 = 0;
        int stackOut_148_3 = 0;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_58_0 = 0;
        int stackOut_57_0 = 0;
        nb stackOut_106_0 = null;
        wb stackOut_106_1 = null;
        int stackOut_106_2 = 0;
        nb stackOut_108_0 = null;
        wb stackOut_108_1 = null;
        int stackOut_108_2 = 0;
        int stackOut_108_3 = 0;
        nb stackOut_107_0 = null;
        wb stackOut_107_1 = null;
        int stackOut_107_2 = 0;
        int stackOut_107_3 = 0;
        nb stackOut_99_0 = null;
        wb stackOut_99_1 = null;
        int stackOut_99_2 = 0;
        nb stackOut_101_0 = null;
        wb stackOut_101_1 = null;
        int stackOut_101_2 = 0;
        int stackOut_101_3 = 0;
        nb stackOut_100_0 = null;
        wb stackOut_100_1 = null;
        int stackOut_100_2 = 0;
        int stackOut_100_3 = 0;
        nb stackOut_91_0 = null;
        wb stackOut_91_1 = null;
        int stackOut_91_2 = 0;
        nb stackOut_93_0 = null;
        wb stackOut_93_1 = null;
        int stackOut_93_2 = 0;
        int stackOut_93_3 = 0;
        nb stackOut_92_0 = null;
        wb stackOut_92_1 = null;
        int stackOut_92_2 = 0;
        int stackOut_92_3 = 0;
        nb stackOut_84_0 = null;
        wb stackOut_84_1 = null;
        int stackOut_84_2 = 0;
        nb stackOut_86_0 = null;
        wb stackOut_86_1 = null;
        int stackOut_86_2 = 0;
        int stackOut_86_3 = 0;
        nb stackOut_85_0 = null;
        wb stackOut_85_1 = null;
        int stackOut_85_2 = 0;
        int stackOut_85_3 = 0;
        nb stackOut_74_0 = null;
        wb stackOut_74_1 = null;
        int stackOut_74_2 = 0;
        nb stackOut_76_0 = null;
        wb stackOut_76_1 = null;
        int stackOut_76_2 = 0;
        int stackOut_76_3 = 0;
        nb stackOut_75_0 = null;
        wb stackOut_75_1 = null;
        int stackOut_75_2 = 0;
        int stackOut_75_3 = 0;
        nb stackOut_65_0 = null;
        wb stackOut_65_1 = null;
        int stackOut_65_2 = 0;
        nb stackOut_67_0 = null;
        wb stackOut_67_1 = null;
        int stackOut_67_2 = 0;
        int stackOut_67_3 = 0;
        nb stackOut_66_0 = null;
        wb stackOut_66_1 = null;
        int stackOut_66_2 = 0;
        int stackOut_66_3 = 0;
        nb stackOut_50_0 = null;
        wb stackOut_50_1 = null;
        int stackOut_50_2 = 0;
        nb stackOut_52_0 = null;
        wb stackOut_52_1 = null;
        int stackOut_52_2 = 0;
        int stackOut_52_3 = 0;
        nb stackOut_51_0 = null;
        wb stackOut_51_1 = null;
        int stackOut_51_2 = 0;
        int stackOut_51_3 = 0;
        nb stackOut_41_0 = null;
        wb stackOut_41_1 = null;
        int stackOut_41_2 = 0;
        nb stackOut_43_0 = null;
        wb stackOut_43_1 = null;
        int stackOut_43_2 = 0;
        int stackOut_43_3 = 0;
        nb stackOut_42_0 = null;
        wb stackOut_42_1 = null;
        int stackOut_42_2 = 0;
        int stackOut_42_3 = 0;
        nb stackOut_27_0 = null;
        wb stackOut_27_1 = null;
        int stackOut_27_2 = 0;
        nb stackOut_29_0 = null;
        wb stackOut_29_1 = null;
        int stackOut_29_2 = 0;
        int stackOut_29_3 = 0;
        nb stackOut_28_0 = null;
        wb stackOut_28_1 = null;
        int stackOut_28_2 = 0;
        int stackOut_28_3 = 0;
        nb stackOut_18_0 = null;
        wb stackOut_18_1 = null;
        int stackOut_18_2 = 0;
        nb stackOut_20_0 = null;
        wb stackOut_20_1 = null;
        int stackOut_20_2 = 0;
        int stackOut_20_3 = 0;
        nb stackOut_19_0 = null;
        wb stackOut_19_1 = null;
        int stackOut_19_2 = 0;
        int stackOut_19_3 = 0;
        var8 = TrackController.field_F ? 1 : 0;
        if (((qe) this).field_q) {
          if (param0) {
            if (0 < ((qe) this).field_v) {
              L0: {
                if (((qe) this).field_x != null) {
                  ((qe) this).field_w.f(11795);
                  break L0;
                } else {
                  break L0;
                }
              }
              ((qe) this).field_x = param4;
              if (param4 == null) {
                return;
              } else {
                ((qe) this).field_w.a(param4, 14526, false);
                this.a(param5, -1, ((qe) this).field_w, param3);
                return;
              }
            } else {
              L1: {
                if (((qe) this).field_y != null) {
                  ((qe) this).field_r.f(11795);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                ((qe) this).field_y = param4;
                if (param4 != null) {
                  ((qe) this).field_r.a(param4, 14526, false);
                  this.a(param5, -1, ((qe) this).field_r, param3);
                  break L2;
                } else {
                  break L2;
                }
              }
              return;
            }
          } else {
            L3: {
              stackOut_130_0 = this;
              stackIn_132_0 = stackOut_130_0;
              stackIn_131_0 = stackOut_130_0;
              if (!param0) {
                stackOut_132_0 = this;
                stackOut_132_1 = 0;
                stackIn_133_0 = stackOut_132_0;
                stackIn_133_1 = stackOut_132_1;
                break L3;
              } else {
                stackOut_131_0 = this;
                stackOut_131_1 = 1;
                stackIn_133_0 = stackOut_131_0;
                stackIn_133_1 = stackOut_131_1;
                break L3;
              }
            }
            ((qe) this).field_q = stackIn_133_1 != 0;
            if (param4 != ((qe) this).field_x) {
              if (param4 == ((qe) this).field_y) {
                ((qe) this).field_v = -param1;
                this.a(param5, -1, ((qe) this).field_r, param3);
                return;
              } else {
                if (((qe) this).field_x != null) {
                  if (null != ((qe) this).field_y) {
                    L4: {
                      if ((((qe) this).field_m ^ -1) <= -524289) {
                        stackOut_226_0 = 0;
                        stackIn_227_0 = stackOut_226_0;
                        break L4;
                      } else {
                        stackOut_225_0 = 1;
                        stackIn_227_0 = stackOut_225_0;
                        break L4;
                      }
                    }
                    var7 = stackIn_227_0;
                    if (param2) {
                      if (var7 == 0) {
                        if (((qe) this).field_y != null) {
                          L5: {
                            ((qe) this).field_r.f(11795);
                            ((qe) this).field_y = param4;
                            if (param4 != null) {
                              L6: {
                                stackOut_287_0 = ((qe) this).field_r;
                                stackOut_287_1 = (wb) param4;
                                stackOut_287_2 = 14526;
                                stackIn_289_0 = stackOut_287_0;
                                stackIn_289_1 = stackOut_287_1;
                                stackIn_289_2 = stackOut_287_2;
                                stackIn_288_0 = stackOut_287_0;
                                stackIn_288_1 = stackOut_287_1;
                                stackIn_288_2 = stackOut_287_2;
                                if (param0) {
                                  stackOut_289_0 = (nb) (Object) stackIn_289_0;
                                  stackOut_289_1 = (wb) (Object) stackIn_289_1;
                                  stackOut_289_2 = stackIn_289_2;
                                  stackOut_289_3 = 0;
                                  stackIn_290_0 = stackOut_289_0;
                                  stackIn_290_1 = stackOut_289_1;
                                  stackIn_290_2 = stackOut_289_2;
                                  stackIn_290_3 = stackOut_289_3;
                                  break L6;
                                } else {
                                  stackOut_288_0 = (nb) (Object) stackIn_288_0;
                                  stackOut_288_1 = (wb) (Object) stackIn_288_1;
                                  stackOut_288_2 = stackIn_288_2;
                                  stackOut_288_3 = 1;
                                  stackIn_290_0 = stackOut_288_0;
                                  stackIn_290_1 = stackOut_288_1;
                                  stackIn_290_2 = stackOut_288_2;
                                  stackIn_290_3 = stackOut_288_3;
                                  break L6;
                                }
                              }
                              ((nb) (Object) stackIn_290_0).a(stackIn_290_1, stackIn_290_2, stackIn_290_3 != 0);
                              this.a(param5, -1, ((qe) this).field_r, param3);
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          ((qe) this).field_v = -param1;
                          return;
                        } else {
                          L7: {
                            ((qe) this).field_y = param4;
                            if (param4 != null) {
                              L8: {
                                stackOut_280_0 = ((qe) this).field_r;
                                stackOut_280_1 = (wb) param4;
                                stackOut_280_2 = 14526;
                                stackIn_282_0 = stackOut_280_0;
                                stackIn_282_1 = stackOut_280_1;
                                stackIn_282_2 = stackOut_280_2;
                                stackIn_281_0 = stackOut_280_0;
                                stackIn_281_1 = stackOut_280_1;
                                stackIn_281_2 = stackOut_280_2;
                                if (param0) {
                                  stackOut_282_0 = (nb) (Object) stackIn_282_0;
                                  stackOut_282_1 = (wb) (Object) stackIn_282_1;
                                  stackOut_282_2 = stackIn_282_2;
                                  stackOut_282_3 = 0;
                                  stackIn_283_0 = stackOut_282_0;
                                  stackIn_283_1 = stackOut_282_1;
                                  stackIn_283_2 = stackOut_282_2;
                                  stackIn_283_3 = stackOut_282_3;
                                  break L8;
                                } else {
                                  stackOut_281_0 = (nb) (Object) stackIn_281_0;
                                  stackOut_281_1 = (wb) (Object) stackIn_281_1;
                                  stackOut_281_2 = stackIn_281_2;
                                  stackOut_281_3 = 1;
                                  stackIn_283_0 = stackOut_281_0;
                                  stackIn_283_1 = stackOut_281_1;
                                  stackIn_283_2 = stackOut_281_2;
                                  stackIn_283_3 = stackOut_281_3;
                                  break L8;
                                }
                              }
                              ((nb) (Object) stackIn_283_0).a(stackIn_283_1, stackIn_283_2, stackIn_283_3 != 0);
                              this.a(param5, -1, ((qe) this).field_r, param3);
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          ((qe) this).field_v = -param1;
                          return;
                        }
                      } else {
                        if (null == ((qe) this).field_x) {
                          L9: {
                            ((qe) this).field_x = param4;
                            if (param4 != null) {
                              L10: {
                                stackOut_272_0 = ((qe) this).field_w;
                                stackOut_272_1 = (wb) param4;
                                stackOut_272_2 = 14526;
                                stackIn_274_0 = stackOut_272_0;
                                stackIn_274_1 = stackOut_272_1;
                                stackIn_274_2 = stackOut_272_2;
                                stackIn_273_0 = stackOut_272_0;
                                stackIn_273_1 = stackOut_272_1;
                                stackIn_273_2 = stackOut_272_2;
                                if (param0) {
                                  stackOut_274_0 = (nb) (Object) stackIn_274_0;
                                  stackOut_274_1 = (wb) (Object) stackIn_274_1;
                                  stackOut_274_2 = stackIn_274_2;
                                  stackOut_274_3 = 0;
                                  stackIn_275_0 = stackOut_274_0;
                                  stackIn_275_1 = stackOut_274_1;
                                  stackIn_275_2 = stackOut_274_2;
                                  stackIn_275_3 = stackOut_274_3;
                                  break L10;
                                } else {
                                  stackOut_273_0 = (nb) (Object) stackIn_273_0;
                                  stackOut_273_1 = (wb) (Object) stackIn_273_1;
                                  stackOut_273_2 = stackIn_273_2;
                                  stackOut_273_3 = 1;
                                  stackIn_275_0 = stackOut_273_0;
                                  stackIn_275_1 = stackOut_273_1;
                                  stackIn_275_2 = stackOut_273_2;
                                  stackIn_275_3 = stackOut_273_3;
                                  break L10;
                                }
                              }
                              ((nb) (Object) stackIn_275_0).a(stackIn_275_1, stackIn_275_2, stackIn_275_3 != 0);
                              this.a(param5, -1, ((qe) this).field_w, param3);
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          ((qe) this).field_v = param1;
                          return;
                        } else {
                          L11: {
                            ((qe) this).field_w.f(11795);
                            ((qe) this).field_x = param4;
                            if (param4 != null) {
                              L12: {
                                stackOut_265_0 = ((qe) this).field_w;
                                stackOut_265_1 = (wb) param4;
                                stackOut_265_2 = 14526;
                                stackIn_267_0 = stackOut_265_0;
                                stackIn_267_1 = stackOut_265_1;
                                stackIn_267_2 = stackOut_265_2;
                                stackIn_266_0 = stackOut_265_0;
                                stackIn_266_1 = stackOut_265_1;
                                stackIn_266_2 = stackOut_265_2;
                                if (param0) {
                                  stackOut_267_0 = (nb) (Object) stackIn_267_0;
                                  stackOut_267_1 = (wb) (Object) stackIn_267_1;
                                  stackOut_267_2 = stackIn_267_2;
                                  stackOut_267_3 = 0;
                                  stackIn_268_0 = stackOut_267_0;
                                  stackIn_268_1 = stackOut_267_1;
                                  stackIn_268_2 = stackOut_267_2;
                                  stackIn_268_3 = stackOut_267_3;
                                  break L12;
                                } else {
                                  stackOut_266_0 = (nb) (Object) stackIn_266_0;
                                  stackOut_266_1 = (wb) (Object) stackIn_266_1;
                                  stackOut_266_2 = stackIn_266_2;
                                  stackOut_266_3 = 1;
                                  stackIn_268_0 = stackOut_266_0;
                                  stackIn_268_1 = stackOut_266_1;
                                  stackIn_268_2 = stackOut_266_2;
                                  stackIn_268_3 = stackOut_266_3;
                                  break L12;
                                }
                              }
                              ((nb) (Object) stackIn_268_0).a(stackIn_268_1, stackIn_268_2, stackIn_268_3 != 0);
                              this.a(param5, -1, ((qe) this).field_w, param3);
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                          ((qe) this).field_v = param1;
                          return;
                        }
                      }
                    } else {
                      ((qe) this).field_m = -96;
                      if (var7 == 0) {
                        if (((qe) this).field_y != null) {
                          L13: {
                            ((qe) this).field_r.f(11795);
                            ((qe) this).field_y = param4;
                            if (param4 != null) {
                              L14: {
                                stackOut_254_0 = ((qe) this).field_r;
                                stackOut_254_1 = (wb) param4;
                                stackOut_254_2 = 14526;
                                stackIn_256_0 = stackOut_254_0;
                                stackIn_256_1 = stackOut_254_1;
                                stackIn_256_2 = stackOut_254_2;
                                stackIn_255_0 = stackOut_254_0;
                                stackIn_255_1 = stackOut_254_1;
                                stackIn_255_2 = stackOut_254_2;
                                if (param0) {
                                  stackOut_256_0 = (nb) (Object) stackIn_256_0;
                                  stackOut_256_1 = (wb) (Object) stackIn_256_1;
                                  stackOut_256_2 = stackIn_256_2;
                                  stackOut_256_3 = 0;
                                  stackIn_257_0 = stackOut_256_0;
                                  stackIn_257_1 = stackOut_256_1;
                                  stackIn_257_2 = stackOut_256_2;
                                  stackIn_257_3 = stackOut_256_3;
                                  break L14;
                                } else {
                                  stackOut_255_0 = (nb) (Object) stackIn_255_0;
                                  stackOut_255_1 = (wb) (Object) stackIn_255_1;
                                  stackOut_255_2 = stackIn_255_2;
                                  stackOut_255_3 = 1;
                                  stackIn_257_0 = stackOut_255_0;
                                  stackIn_257_1 = stackOut_255_1;
                                  stackIn_257_2 = stackOut_255_2;
                                  stackIn_257_3 = stackOut_255_3;
                                  break L14;
                                }
                              }
                              ((nb) (Object) stackIn_257_0).a(stackIn_257_1, stackIn_257_2, stackIn_257_3 != 0);
                              this.a(param5, -1, ((qe) this).field_r, param3);
                              break L13;
                            } else {
                              break L13;
                            }
                          }
                          ((qe) this).field_v = -param1;
                          return;
                        } else {
                          L15: {
                            ((qe) this).field_y = param4;
                            if (param4 != null) {
                              L16: {
                                stackOut_247_0 = ((qe) this).field_r;
                                stackOut_247_1 = (wb) param4;
                                stackOut_247_2 = 14526;
                                stackIn_249_0 = stackOut_247_0;
                                stackIn_249_1 = stackOut_247_1;
                                stackIn_249_2 = stackOut_247_2;
                                stackIn_248_0 = stackOut_247_0;
                                stackIn_248_1 = stackOut_247_1;
                                stackIn_248_2 = stackOut_247_2;
                                if (param0) {
                                  stackOut_249_0 = (nb) (Object) stackIn_249_0;
                                  stackOut_249_1 = (wb) (Object) stackIn_249_1;
                                  stackOut_249_2 = stackIn_249_2;
                                  stackOut_249_3 = 0;
                                  stackIn_250_0 = stackOut_249_0;
                                  stackIn_250_1 = stackOut_249_1;
                                  stackIn_250_2 = stackOut_249_2;
                                  stackIn_250_3 = stackOut_249_3;
                                  break L16;
                                } else {
                                  stackOut_248_0 = (nb) (Object) stackIn_248_0;
                                  stackOut_248_1 = (wb) (Object) stackIn_248_1;
                                  stackOut_248_2 = stackIn_248_2;
                                  stackOut_248_3 = 1;
                                  stackIn_250_0 = stackOut_248_0;
                                  stackIn_250_1 = stackOut_248_1;
                                  stackIn_250_2 = stackOut_248_2;
                                  stackIn_250_3 = stackOut_248_3;
                                  break L16;
                                }
                              }
                              ((nb) (Object) stackIn_250_0).a(stackIn_250_1, stackIn_250_2, stackIn_250_3 != 0);
                              this.a(param5, -1, ((qe) this).field_r, param3);
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                          ((qe) this).field_v = -param1;
                          return;
                        }
                      } else {
                        if (null == ((qe) this).field_x) {
                          L17: {
                            ((qe) this).field_x = param4;
                            if (param4 != null) {
                              L18: {
                                stackOut_239_0 = ((qe) this).field_w;
                                stackOut_239_1 = (wb) param4;
                                stackOut_239_2 = 14526;
                                stackIn_241_0 = stackOut_239_0;
                                stackIn_241_1 = stackOut_239_1;
                                stackIn_241_2 = stackOut_239_2;
                                stackIn_240_0 = stackOut_239_0;
                                stackIn_240_1 = stackOut_239_1;
                                stackIn_240_2 = stackOut_239_2;
                                if (param0) {
                                  stackOut_241_0 = (nb) (Object) stackIn_241_0;
                                  stackOut_241_1 = (wb) (Object) stackIn_241_1;
                                  stackOut_241_2 = stackIn_241_2;
                                  stackOut_241_3 = 0;
                                  stackIn_242_0 = stackOut_241_0;
                                  stackIn_242_1 = stackOut_241_1;
                                  stackIn_242_2 = stackOut_241_2;
                                  stackIn_242_3 = stackOut_241_3;
                                  break L18;
                                } else {
                                  stackOut_240_0 = (nb) (Object) stackIn_240_0;
                                  stackOut_240_1 = (wb) (Object) stackIn_240_1;
                                  stackOut_240_2 = stackIn_240_2;
                                  stackOut_240_3 = 1;
                                  stackIn_242_0 = stackOut_240_0;
                                  stackIn_242_1 = stackOut_240_1;
                                  stackIn_242_2 = stackOut_240_2;
                                  stackIn_242_3 = stackOut_240_3;
                                  break L18;
                                }
                              }
                              ((nb) (Object) stackIn_242_0).a(stackIn_242_1, stackIn_242_2, stackIn_242_3 != 0);
                              this.a(param5, -1, ((qe) this).field_w, param3);
                              break L17;
                            } else {
                              break L17;
                            }
                          }
                          ((qe) this).field_v = param1;
                          return;
                        } else {
                          L19: {
                            ((qe) this).field_w.f(11795);
                            ((qe) this).field_x = param4;
                            if (param4 != null) {
                              L20: {
                                stackOut_232_0 = ((qe) this).field_w;
                                stackOut_232_1 = (wb) param4;
                                stackOut_232_2 = 14526;
                                stackIn_234_0 = stackOut_232_0;
                                stackIn_234_1 = stackOut_232_1;
                                stackIn_234_2 = stackOut_232_2;
                                stackIn_233_0 = stackOut_232_0;
                                stackIn_233_1 = stackOut_232_1;
                                stackIn_233_2 = stackOut_232_2;
                                if (param0) {
                                  stackOut_234_0 = (nb) (Object) stackIn_234_0;
                                  stackOut_234_1 = (wb) (Object) stackIn_234_1;
                                  stackOut_234_2 = stackIn_234_2;
                                  stackOut_234_3 = 0;
                                  stackIn_235_0 = stackOut_234_0;
                                  stackIn_235_1 = stackOut_234_1;
                                  stackIn_235_2 = stackOut_234_2;
                                  stackIn_235_3 = stackOut_234_3;
                                  break L20;
                                } else {
                                  stackOut_233_0 = (nb) (Object) stackIn_233_0;
                                  stackOut_233_1 = (wb) (Object) stackIn_233_1;
                                  stackOut_233_2 = stackIn_233_2;
                                  stackOut_233_3 = 1;
                                  stackIn_235_0 = stackOut_233_0;
                                  stackIn_235_1 = stackOut_233_1;
                                  stackIn_235_2 = stackOut_233_2;
                                  stackIn_235_3 = stackOut_233_3;
                                  break L20;
                                }
                              }
                              ((nb) (Object) stackIn_235_0).a(stackIn_235_1, stackIn_235_2, stackIn_235_3 != 0);
                              this.a(param5, -1, ((qe) this).field_w, param3);
                              break L19;
                            } else {
                              break L19;
                            }
                          }
                          ((qe) this).field_v = param1;
                          return;
                        }
                      }
                    }
                  } else {
                    var7 = 0;
                    if (param2) {
                      if (var7 == 0) {
                        if (((qe) this).field_y != null) {
                          L21: {
                            ((qe) this).field_r.f(11795);
                            ((qe) this).field_y = param4;
                            if (param4 != null) {
                              L22: {
                                stackOut_217_0 = ((qe) this).field_r;
                                stackOut_217_1 = (wb) param4;
                                stackOut_217_2 = 14526;
                                stackIn_219_0 = stackOut_217_0;
                                stackIn_219_1 = stackOut_217_1;
                                stackIn_219_2 = stackOut_217_2;
                                stackIn_218_0 = stackOut_217_0;
                                stackIn_218_1 = stackOut_217_1;
                                stackIn_218_2 = stackOut_217_2;
                                if (param0) {
                                  stackOut_219_0 = (nb) (Object) stackIn_219_0;
                                  stackOut_219_1 = (wb) (Object) stackIn_219_1;
                                  stackOut_219_2 = stackIn_219_2;
                                  stackOut_219_3 = 0;
                                  stackIn_220_0 = stackOut_219_0;
                                  stackIn_220_1 = stackOut_219_1;
                                  stackIn_220_2 = stackOut_219_2;
                                  stackIn_220_3 = stackOut_219_3;
                                  break L22;
                                } else {
                                  stackOut_218_0 = (nb) (Object) stackIn_218_0;
                                  stackOut_218_1 = (wb) (Object) stackIn_218_1;
                                  stackOut_218_2 = stackIn_218_2;
                                  stackOut_218_3 = 1;
                                  stackIn_220_0 = stackOut_218_0;
                                  stackIn_220_1 = stackOut_218_1;
                                  stackIn_220_2 = stackOut_218_2;
                                  stackIn_220_3 = stackOut_218_3;
                                  break L22;
                                }
                              }
                              ((nb) (Object) stackIn_220_0).a(stackIn_220_1, stackIn_220_2, stackIn_220_3 != 0);
                              this.a(param5, -1, ((qe) this).field_r, param3);
                              break L21;
                            } else {
                              break L21;
                            }
                          }
                          ((qe) this).field_v = -param1;
                          return;
                        } else {
                          L23: {
                            ((qe) this).field_y = param4;
                            if (param4 != null) {
                              L24: {
                                stackOut_210_0 = ((qe) this).field_r;
                                stackOut_210_1 = (wb) param4;
                                stackOut_210_2 = 14526;
                                stackIn_212_0 = stackOut_210_0;
                                stackIn_212_1 = stackOut_210_1;
                                stackIn_212_2 = stackOut_210_2;
                                stackIn_211_0 = stackOut_210_0;
                                stackIn_211_1 = stackOut_210_1;
                                stackIn_211_2 = stackOut_210_2;
                                if (param0) {
                                  stackOut_212_0 = (nb) (Object) stackIn_212_0;
                                  stackOut_212_1 = (wb) (Object) stackIn_212_1;
                                  stackOut_212_2 = stackIn_212_2;
                                  stackOut_212_3 = 0;
                                  stackIn_213_0 = stackOut_212_0;
                                  stackIn_213_1 = stackOut_212_1;
                                  stackIn_213_2 = stackOut_212_2;
                                  stackIn_213_3 = stackOut_212_3;
                                  break L24;
                                } else {
                                  stackOut_211_0 = (nb) (Object) stackIn_211_0;
                                  stackOut_211_1 = (wb) (Object) stackIn_211_1;
                                  stackOut_211_2 = stackIn_211_2;
                                  stackOut_211_3 = 1;
                                  stackIn_213_0 = stackOut_211_0;
                                  stackIn_213_1 = stackOut_211_1;
                                  stackIn_213_2 = stackOut_211_2;
                                  stackIn_213_3 = stackOut_211_3;
                                  break L24;
                                }
                              }
                              ((nb) (Object) stackIn_213_0).a(stackIn_213_1, stackIn_213_2, stackIn_213_3 != 0);
                              this.a(param5, -1, ((qe) this).field_r, param3);
                              break L23;
                            } else {
                              break L23;
                            }
                          }
                          ((qe) this).field_v = -param1;
                          return;
                        }
                      } else {
                        if (null == ((qe) this).field_x) {
                          L25: {
                            ((qe) this).field_x = param4;
                            if (param4 != null) {
                              L26: {
                                stackOut_202_0 = ((qe) this).field_w;
                                stackOut_202_1 = (wb) param4;
                                stackOut_202_2 = 14526;
                                stackIn_204_0 = stackOut_202_0;
                                stackIn_204_1 = stackOut_202_1;
                                stackIn_204_2 = stackOut_202_2;
                                stackIn_203_0 = stackOut_202_0;
                                stackIn_203_1 = stackOut_202_1;
                                stackIn_203_2 = stackOut_202_2;
                                if (param0) {
                                  stackOut_204_0 = (nb) (Object) stackIn_204_0;
                                  stackOut_204_1 = (wb) (Object) stackIn_204_1;
                                  stackOut_204_2 = stackIn_204_2;
                                  stackOut_204_3 = 0;
                                  stackIn_205_0 = stackOut_204_0;
                                  stackIn_205_1 = stackOut_204_1;
                                  stackIn_205_2 = stackOut_204_2;
                                  stackIn_205_3 = stackOut_204_3;
                                  break L26;
                                } else {
                                  stackOut_203_0 = (nb) (Object) stackIn_203_0;
                                  stackOut_203_1 = (wb) (Object) stackIn_203_1;
                                  stackOut_203_2 = stackIn_203_2;
                                  stackOut_203_3 = 1;
                                  stackIn_205_0 = stackOut_203_0;
                                  stackIn_205_1 = stackOut_203_1;
                                  stackIn_205_2 = stackOut_203_2;
                                  stackIn_205_3 = stackOut_203_3;
                                  break L26;
                                }
                              }
                              ((nb) (Object) stackIn_205_0).a(stackIn_205_1, stackIn_205_2, stackIn_205_3 != 0);
                              this.a(param5, -1, ((qe) this).field_w, param3);
                              break L25;
                            } else {
                              break L25;
                            }
                          }
                          ((qe) this).field_v = param1;
                          return;
                        } else {
                          L27: {
                            ((qe) this).field_w.f(11795);
                            ((qe) this).field_x = param4;
                            if (param4 != null) {
                              L28: {
                                stackOut_195_0 = ((qe) this).field_w;
                                stackOut_195_1 = (wb) param4;
                                stackOut_195_2 = 14526;
                                stackIn_197_0 = stackOut_195_0;
                                stackIn_197_1 = stackOut_195_1;
                                stackIn_197_2 = stackOut_195_2;
                                stackIn_196_0 = stackOut_195_0;
                                stackIn_196_1 = stackOut_195_1;
                                stackIn_196_2 = stackOut_195_2;
                                if (param0) {
                                  stackOut_197_0 = (nb) (Object) stackIn_197_0;
                                  stackOut_197_1 = (wb) (Object) stackIn_197_1;
                                  stackOut_197_2 = stackIn_197_2;
                                  stackOut_197_3 = 0;
                                  stackIn_198_0 = stackOut_197_0;
                                  stackIn_198_1 = stackOut_197_1;
                                  stackIn_198_2 = stackOut_197_2;
                                  stackIn_198_3 = stackOut_197_3;
                                  break L28;
                                } else {
                                  stackOut_196_0 = (nb) (Object) stackIn_196_0;
                                  stackOut_196_1 = (wb) (Object) stackIn_196_1;
                                  stackOut_196_2 = stackIn_196_2;
                                  stackOut_196_3 = 1;
                                  stackIn_198_0 = stackOut_196_0;
                                  stackIn_198_1 = stackOut_196_1;
                                  stackIn_198_2 = stackOut_196_2;
                                  stackIn_198_3 = stackOut_196_3;
                                  break L28;
                                }
                              }
                              ((nb) (Object) stackIn_198_0).a(stackIn_198_1, stackIn_198_2, stackIn_198_3 != 0);
                              this.a(param5, -1, ((qe) this).field_w, param3);
                              break L27;
                            } else {
                              break L27;
                            }
                          }
                          ((qe) this).field_v = param1;
                          return;
                        }
                      }
                    } else {
                      L29: {
                        ((qe) this).field_m = -96;
                        if (var7 == 0) {
                          L30: {
                            if (((qe) this).field_y == null) {
                              break L30;
                            } else {
                              ((qe) this).field_r.f(11795);
                              break L30;
                            }
                          }
                          L31: {
                            ((qe) this).field_y = param4;
                            if (param4 != null) {
                              L32: {
                                stackOut_185_0 = ((qe) this).field_r;
                                stackOut_185_1 = (wb) param4;
                                stackOut_185_2 = 14526;
                                stackIn_187_0 = stackOut_185_0;
                                stackIn_187_1 = stackOut_185_1;
                                stackIn_187_2 = stackOut_185_2;
                                stackIn_186_0 = stackOut_185_0;
                                stackIn_186_1 = stackOut_185_1;
                                stackIn_186_2 = stackOut_185_2;
                                if (param0) {
                                  stackOut_187_0 = (nb) (Object) stackIn_187_0;
                                  stackOut_187_1 = (wb) (Object) stackIn_187_1;
                                  stackOut_187_2 = stackIn_187_2;
                                  stackOut_187_3 = 0;
                                  stackIn_188_0 = stackOut_187_0;
                                  stackIn_188_1 = stackOut_187_1;
                                  stackIn_188_2 = stackOut_187_2;
                                  stackIn_188_3 = stackOut_187_3;
                                  break L32;
                                } else {
                                  stackOut_186_0 = (nb) (Object) stackIn_186_0;
                                  stackOut_186_1 = (wb) (Object) stackIn_186_1;
                                  stackOut_186_2 = stackIn_186_2;
                                  stackOut_186_3 = 1;
                                  stackIn_188_0 = stackOut_186_0;
                                  stackIn_188_1 = stackOut_186_1;
                                  stackIn_188_2 = stackOut_186_2;
                                  stackIn_188_3 = stackOut_186_3;
                                  break L32;
                                }
                              }
                              ((nb) (Object) stackIn_188_0).a(stackIn_188_1, stackIn_188_2, stackIn_188_3 != 0);
                              this.a(param5, -1, ((qe) this).field_r, param3);
                              break L31;
                            } else {
                              break L31;
                            }
                          }
                          ((qe) this).field_v = -param1;
                          break L29;
                        } else {
                          L33: {
                            if (null == ((qe) this).field_x) {
                              break L33;
                            } else {
                              ((qe) this).field_w.f(11795);
                              break L33;
                            }
                          }
                          L34: {
                            ((qe) this).field_x = param4;
                            if (param4 != null) {
                              L35: {
                                stackOut_176_0 = ((qe) this).field_w;
                                stackOut_176_1 = (wb) param4;
                                stackOut_176_2 = 14526;
                                stackIn_178_0 = stackOut_176_0;
                                stackIn_178_1 = stackOut_176_1;
                                stackIn_178_2 = stackOut_176_2;
                                stackIn_177_0 = stackOut_176_0;
                                stackIn_177_1 = stackOut_176_1;
                                stackIn_177_2 = stackOut_176_2;
                                if (param0) {
                                  stackOut_178_0 = (nb) (Object) stackIn_178_0;
                                  stackOut_178_1 = (wb) (Object) stackIn_178_1;
                                  stackOut_178_2 = stackIn_178_2;
                                  stackOut_178_3 = 0;
                                  stackIn_179_0 = stackOut_178_0;
                                  stackIn_179_1 = stackOut_178_1;
                                  stackIn_179_2 = stackOut_178_2;
                                  stackIn_179_3 = stackOut_178_3;
                                  break L35;
                                } else {
                                  stackOut_177_0 = (nb) (Object) stackIn_177_0;
                                  stackOut_177_1 = (wb) (Object) stackIn_177_1;
                                  stackOut_177_2 = stackIn_177_2;
                                  stackOut_177_3 = 1;
                                  stackIn_179_0 = stackOut_177_0;
                                  stackIn_179_1 = stackOut_177_1;
                                  stackIn_179_2 = stackOut_177_2;
                                  stackIn_179_3 = stackOut_177_3;
                                  break L35;
                                }
                              }
                              ((nb) (Object) stackIn_179_0).a(stackIn_179_1, stackIn_179_2, stackIn_179_3 != 0);
                              this.a(param5, -1, ((qe) this).field_w, param3);
                              break L34;
                            } else {
                              break L34;
                            }
                          }
                          ((qe) this).field_v = param1;
                          break L29;
                        }
                      }
                      return;
                    }
                  }
                } else {
                  L36: {
                    var7 = 1;
                    if (param2) {
                      break L36;
                    } else {
                      ((qe) this).field_m = -96;
                      break L36;
                    }
                  }
                  if (var7 == 0) {
                    if (((qe) this).field_y != null) {
                      L37: {
                        ((qe) this).field_r.f(11795);
                        ((qe) this).field_y = param4;
                        if (param4 != null) {
                          L38: {
                            stackOut_162_0 = ((qe) this).field_r;
                            stackOut_162_1 = (wb) param4;
                            stackOut_162_2 = 14526;
                            stackIn_164_0 = stackOut_162_0;
                            stackIn_164_1 = stackOut_162_1;
                            stackIn_164_2 = stackOut_162_2;
                            stackIn_163_0 = stackOut_162_0;
                            stackIn_163_1 = stackOut_162_1;
                            stackIn_163_2 = stackOut_162_2;
                            if (param0) {
                              stackOut_164_0 = (nb) (Object) stackIn_164_0;
                              stackOut_164_1 = (wb) (Object) stackIn_164_1;
                              stackOut_164_2 = stackIn_164_2;
                              stackOut_164_3 = 0;
                              stackIn_165_0 = stackOut_164_0;
                              stackIn_165_1 = stackOut_164_1;
                              stackIn_165_2 = stackOut_164_2;
                              stackIn_165_3 = stackOut_164_3;
                              break L38;
                            } else {
                              stackOut_163_0 = (nb) (Object) stackIn_163_0;
                              stackOut_163_1 = (wb) (Object) stackIn_163_1;
                              stackOut_163_2 = stackIn_163_2;
                              stackOut_163_3 = 1;
                              stackIn_165_0 = stackOut_163_0;
                              stackIn_165_1 = stackOut_163_1;
                              stackIn_165_2 = stackOut_163_2;
                              stackIn_165_3 = stackOut_163_3;
                              break L38;
                            }
                          }
                          ((nb) (Object) stackIn_165_0).a(stackIn_165_1, stackIn_165_2, stackIn_165_3 != 0);
                          this.a(param5, -1, ((qe) this).field_r, param3);
                          break L37;
                        } else {
                          break L37;
                        }
                      }
                      ((qe) this).field_v = -param1;
                      return;
                    } else {
                      L39: {
                        ((qe) this).field_y = param4;
                        if (param4 != null) {
                          L40: {
                            stackOut_155_0 = ((qe) this).field_r;
                            stackOut_155_1 = (wb) param4;
                            stackOut_155_2 = 14526;
                            stackIn_157_0 = stackOut_155_0;
                            stackIn_157_1 = stackOut_155_1;
                            stackIn_157_2 = stackOut_155_2;
                            stackIn_156_0 = stackOut_155_0;
                            stackIn_156_1 = stackOut_155_1;
                            stackIn_156_2 = stackOut_155_2;
                            if (param0) {
                              stackOut_157_0 = (nb) (Object) stackIn_157_0;
                              stackOut_157_1 = (wb) (Object) stackIn_157_1;
                              stackOut_157_2 = stackIn_157_2;
                              stackOut_157_3 = 0;
                              stackIn_158_0 = stackOut_157_0;
                              stackIn_158_1 = stackOut_157_1;
                              stackIn_158_2 = stackOut_157_2;
                              stackIn_158_3 = stackOut_157_3;
                              break L40;
                            } else {
                              stackOut_156_0 = (nb) (Object) stackIn_156_0;
                              stackOut_156_1 = (wb) (Object) stackIn_156_1;
                              stackOut_156_2 = stackIn_156_2;
                              stackOut_156_3 = 1;
                              stackIn_158_0 = stackOut_156_0;
                              stackIn_158_1 = stackOut_156_1;
                              stackIn_158_2 = stackOut_156_2;
                              stackIn_158_3 = stackOut_156_3;
                              break L40;
                            }
                          }
                          ((nb) (Object) stackIn_158_0).a(stackIn_158_1, stackIn_158_2, stackIn_158_3 != 0);
                          this.a(param5, -1, ((qe) this).field_r, param3);
                          break L39;
                        } else {
                          break L39;
                        }
                      }
                      ((qe) this).field_v = -param1;
                      return;
                    }
                  } else {
                    L41: {
                      if (null == ((qe) this).field_x) {
                        break L41;
                      } else {
                        ((qe) this).field_w.f(11795);
                        break L41;
                      }
                    }
                    L42: {
                      ((qe) this).field_x = param4;
                      if (param4 != null) {
                        L43: {
                          stackOut_147_0 = ((qe) this).field_w;
                          stackOut_147_1 = (wb) param4;
                          stackOut_147_2 = 14526;
                          stackIn_149_0 = stackOut_147_0;
                          stackIn_149_1 = stackOut_147_1;
                          stackIn_149_2 = stackOut_147_2;
                          stackIn_148_0 = stackOut_147_0;
                          stackIn_148_1 = stackOut_147_1;
                          stackIn_148_2 = stackOut_147_2;
                          if (param0) {
                            stackOut_149_0 = (nb) (Object) stackIn_149_0;
                            stackOut_149_1 = (wb) (Object) stackIn_149_1;
                            stackOut_149_2 = stackIn_149_2;
                            stackOut_149_3 = 0;
                            stackIn_150_0 = stackOut_149_0;
                            stackIn_150_1 = stackOut_149_1;
                            stackIn_150_2 = stackOut_149_2;
                            stackIn_150_3 = stackOut_149_3;
                            break L43;
                          } else {
                            stackOut_148_0 = (nb) (Object) stackIn_148_0;
                            stackOut_148_1 = (wb) (Object) stackIn_148_1;
                            stackOut_148_2 = stackIn_148_2;
                            stackOut_148_3 = 1;
                            stackIn_150_0 = stackOut_148_0;
                            stackIn_150_1 = stackOut_148_1;
                            stackIn_150_2 = stackOut_148_2;
                            stackIn_150_3 = stackOut_148_3;
                            break L43;
                          }
                        }
                        ((nb) (Object) stackIn_150_0).a(stackIn_150_1, stackIn_150_2, stackIn_150_3 != 0);
                        this.a(param5, -1, ((qe) this).field_w, param3);
                        break L42;
                      } else {
                        break L42;
                      }
                    }
                    ((qe) this).field_v = param1;
                    return;
                  }
                }
              }
            } else {
              ((qe) this).field_v = param1;
              this.a(param5, -1, ((qe) this).field_w, param3);
              return;
            }
          }
        } else {
          L44: {
            stackOut_1_0 = this;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param0) {
              stackOut_3_0 = this;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L44;
            } else {
              stackOut_2_0 = this;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L44;
            }
          }
          ((qe) this).field_q = stackIn_4_1 != 0;
          if (param4 != ((qe) this).field_x) {
            if (param4 == ((qe) this).field_y) {
              ((qe) this).field_v = -param1;
              this.a(param5, -1, ((qe) this).field_r, param3);
              return;
            } else {
              if (((qe) this).field_x != null) {
                if (null != ((qe) this).field_y) {
                  L45: {
                    if ((((qe) this).field_m ^ -1) <= -524289) {
                      stackOut_58_0 = 0;
                      stackIn_59_0 = stackOut_58_0;
                      break L45;
                    } else {
                      stackOut_57_0 = 1;
                      stackIn_59_0 = stackOut_57_0;
                      break L45;
                    }
                  }
                  var7 = stackIn_59_0;
                  if (param2) {
                    if (var7 == 0) {
                      if (((qe) this).field_y != null) {
                        L46: {
                          ((qe) this).field_r.f(11795);
                          ((qe) this).field_y = param4;
                          if (param4 != null) {
                            L47: {
                              stackOut_106_0 = ((qe) this).field_r;
                              stackOut_106_1 = (wb) param4;
                              stackOut_106_2 = 14526;
                              stackIn_108_0 = stackOut_106_0;
                              stackIn_108_1 = stackOut_106_1;
                              stackIn_108_2 = stackOut_106_2;
                              stackIn_107_0 = stackOut_106_0;
                              stackIn_107_1 = stackOut_106_1;
                              stackIn_107_2 = stackOut_106_2;
                              if (param0) {
                                stackOut_108_0 = (nb) (Object) stackIn_108_0;
                                stackOut_108_1 = (wb) (Object) stackIn_108_1;
                                stackOut_108_2 = stackIn_108_2;
                                stackOut_108_3 = 0;
                                stackIn_109_0 = stackOut_108_0;
                                stackIn_109_1 = stackOut_108_1;
                                stackIn_109_2 = stackOut_108_2;
                                stackIn_109_3 = stackOut_108_3;
                                break L47;
                              } else {
                                stackOut_107_0 = (nb) (Object) stackIn_107_0;
                                stackOut_107_1 = (wb) (Object) stackIn_107_1;
                                stackOut_107_2 = stackIn_107_2;
                                stackOut_107_3 = 1;
                                stackIn_109_0 = stackOut_107_0;
                                stackIn_109_1 = stackOut_107_1;
                                stackIn_109_2 = stackOut_107_2;
                                stackIn_109_3 = stackOut_107_3;
                                break L47;
                              }
                            }
                            ((nb) (Object) stackIn_109_0).a(stackIn_109_1, stackIn_109_2, stackIn_109_3 != 0);
                            this.a(param5, -1, ((qe) this).field_r, param3);
                            break L46;
                          } else {
                            break L46;
                          }
                        }
                        ((qe) this).field_v = -param1;
                        return;
                      } else {
                        L48: {
                          ((qe) this).field_y = param4;
                          if (param4 != null) {
                            L49: {
                              stackOut_99_0 = ((qe) this).field_r;
                              stackOut_99_1 = (wb) param4;
                              stackOut_99_2 = 14526;
                              stackIn_101_0 = stackOut_99_0;
                              stackIn_101_1 = stackOut_99_1;
                              stackIn_101_2 = stackOut_99_2;
                              stackIn_100_0 = stackOut_99_0;
                              stackIn_100_1 = stackOut_99_1;
                              stackIn_100_2 = stackOut_99_2;
                              if (param0) {
                                stackOut_101_0 = (nb) (Object) stackIn_101_0;
                                stackOut_101_1 = (wb) (Object) stackIn_101_1;
                                stackOut_101_2 = stackIn_101_2;
                                stackOut_101_3 = 0;
                                stackIn_102_0 = stackOut_101_0;
                                stackIn_102_1 = stackOut_101_1;
                                stackIn_102_2 = stackOut_101_2;
                                stackIn_102_3 = stackOut_101_3;
                                break L49;
                              } else {
                                stackOut_100_0 = (nb) (Object) stackIn_100_0;
                                stackOut_100_1 = (wb) (Object) stackIn_100_1;
                                stackOut_100_2 = stackIn_100_2;
                                stackOut_100_3 = 1;
                                stackIn_102_0 = stackOut_100_0;
                                stackIn_102_1 = stackOut_100_1;
                                stackIn_102_2 = stackOut_100_2;
                                stackIn_102_3 = stackOut_100_3;
                                break L49;
                              }
                            }
                            ((nb) (Object) stackIn_102_0).a(stackIn_102_1, stackIn_102_2, stackIn_102_3 != 0);
                            this.a(param5, -1, ((qe) this).field_r, param3);
                            break L48;
                          } else {
                            break L48;
                          }
                        }
                        ((qe) this).field_v = -param1;
                        return;
                      }
                    } else {
                      if (null == ((qe) this).field_x) {
                        L50: {
                          ((qe) this).field_x = param4;
                          if (param4 != null) {
                            L51: {
                              stackOut_91_0 = ((qe) this).field_w;
                              stackOut_91_1 = (wb) param4;
                              stackOut_91_2 = 14526;
                              stackIn_93_0 = stackOut_91_0;
                              stackIn_93_1 = stackOut_91_1;
                              stackIn_93_2 = stackOut_91_2;
                              stackIn_92_0 = stackOut_91_0;
                              stackIn_92_1 = stackOut_91_1;
                              stackIn_92_2 = stackOut_91_2;
                              if (param0) {
                                stackOut_93_0 = (nb) (Object) stackIn_93_0;
                                stackOut_93_1 = (wb) (Object) stackIn_93_1;
                                stackOut_93_2 = stackIn_93_2;
                                stackOut_93_3 = 0;
                                stackIn_94_0 = stackOut_93_0;
                                stackIn_94_1 = stackOut_93_1;
                                stackIn_94_2 = stackOut_93_2;
                                stackIn_94_3 = stackOut_93_3;
                                break L51;
                              } else {
                                stackOut_92_0 = (nb) (Object) stackIn_92_0;
                                stackOut_92_1 = (wb) (Object) stackIn_92_1;
                                stackOut_92_2 = stackIn_92_2;
                                stackOut_92_3 = 1;
                                stackIn_94_0 = stackOut_92_0;
                                stackIn_94_1 = stackOut_92_1;
                                stackIn_94_2 = stackOut_92_2;
                                stackIn_94_3 = stackOut_92_3;
                                break L51;
                              }
                            }
                            ((nb) (Object) stackIn_94_0).a(stackIn_94_1, stackIn_94_2, stackIn_94_3 != 0);
                            this.a(param5, -1, ((qe) this).field_w, param3);
                            break L50;
                          } else {
                            break L50;
                          }
                        }
                        ((qe) this).field_v = param1;
                        return;
                      } else {
                        L52: {
                          ((qe) this).field_w.f(11795);
                          ((qe) this).field_x = param4;
                          if (param4 != null) {
                            L53: {
                              stackOut_84_0 = ((qe) this).field_w;
                              stackOut_84_1 = (wb) param4;
                              stackOut_84_2 = 14526;
                              stackIn_86_0 = stackOut_84_0;
                              stackIn_86_1 = stackOut_84_1;
                              stackIn_86_2 = stackOut_84_2;
                              stackIn_85_0 = stackOut_84_0;
                              stackIn_85_1 = stackOut_84_1;
                              stackIn_85_2 = stackOut_84_2;
                              if (param0) {
                                stackOut_86_0 = (nb) (Object) stackIn_86_0;
                                stackOut_86_1 = (wb) (Object) stackIn_86_1;
                                stackOut_86_2 = stackIn_86_2;
                                stackOut_86_3 = 0;
                                stackIn_87_0 = stackOut_86_0;
                                stackIn_87_1 = stackOut_86_1;
                                stackIn_87_2 = stackOut_86_2;
                                stackIn_87_3 = stackOut_86_3;
                                break L53;
                              } else {
                                stackOut_85_0 = (nb) (Object) stackIn_85_0;
                                stackOut_85_1 = (wb) (Object) stackIn_85_1;
                                stackOut_85_2 = stackIn_85_2;
                                stackOut_85_3 = 1;
                                stackIn_87_0 = stackOut_85_0;
                                stackIn_87_1 = stackOut_85_1;
                                stackIn_87_2 = stackOut_85_2;
                                stackIn_87_3 = stackOut_85_3;
                                break L53;
                              }
                            }
                            ((nb) (Object) stackIn_87_0).a(stackIn_87_1, stackIn_87_2, stackIn_87_3 != 0);
                            this.a(param5, -1, ((qe) this).field_w, param3);
                            break L52;
                          } else {
                            break L52;
                          }
                        }
                        ((qe) this).field_v = param1;
                        return;
                      }
                    }
                  } else {
                    L54: {
                      ((qe) this).field_m = -96;
                      if (var7 == 0) {
                        L55: {
                          if (((qe) this).field_y == null) {
                            break L55;
                          } else {
                            ((qe) this).field_r.f(11795);
                            break L55;
                          }
                        }
                        L56: {
                          ((qe) this).field_y = param4;
                          if (param4 != null) {
                            L57: {
                              stackOut_74_0 = ((qe) this).field_r;
                              stackOut_74_1 = (wb) param4;
                              stackOut_74_2 = 14526;
                              stackIn_76_0 = stackOut_74_0;
                              stackIn_76_1 = stackOut_74_1;
                              stackIn_76_2 = stackOut_74_2;
                              stackIn_75_0 = stackOut_74_0;
                              stackIn_75_1 = stackOut_74_1;
                              stackIn_75_2 = stackOut_74_2;
                              if (param0) {
                                stackOut_76_0 = (nb) (Object) stackIn_76_0;
                                stackOut_76_1 = (wb) (Object) stackIn_76_1;
                                stackOut_76_2 = stackIn_76_2;
                                stackOut_76_3 = 0;
                                stackIn_77_0 = stackOut_76_0;
                                stackIn_77_1 = stackOut_76_1;
                                stackIn_77_2 = stackOut_76_2;
                                stackIn_77_3 = stackOut_76_3;
                                break L57;
                              } else {
                                stackOut_75_0 = (nb) (Object) stackIn_75_0;
                                stackOut_75_1 = (wb) (Object) stackIn_75_1;
                                stackOut_75_2 = stackIn_75_2;
                                stackOut_75_3 = 1;
                                stackIn_77_0 = stackOut_75_0;
                                stackIn_77_1 = stackOut_75_1;
                                stackIn_77_2 = stackOut_75_2;
                                stackIn_77_3 = stackOut_75_3;
                                break L57;
                              }
                            }
                            ((nb) (Object) stackIn_77_0).a(stackIn_77_1, stackIn_77_2, stackIn_77_3 != 0);
                            this.a(param5, -1, ((qe) this).field_r, param3);
                            break L56;
                          } else {
                            break L56;
                          }
                        }
                        ((qe) this).field_v = -param1;
                        break L54;
                      } else {
                        L58: {
                          if (null == ((qe) this).field_x) {
                            break L58;
                          } else {
                            ((qe) this).field_w.f(11795);
                            break L58;
                          }
                        }
                        L59: {
                          ((qe) this).field_x = param4;
                          if (param4 != null) {
                            L60: {
                              stackOut_65_0 = ((qe) this).field_w;
                              stackOut_65_1 = (wb) param4;
                              stackOut_65_2 = 14526;
                              stackIn_67_0 = stackOut_65_0;
                              stackIn_67_1 = stackOut_65_1;
                              stackIn_67_2 = stackOut_65_2;
                              stackIn_66_0 = stackOut_65_0;
                              stackIn_66_1 = stackOut_65_1;
                              stackIn_66_2 = stackOut_65_2;
                              if (param0) {
                                stackOut_67_0 = (nb) (Object) stackIn_67_0;
                                stackOut_67_1 = (wb) (Object) stackIn_67_1;
                                stackOut_67_2 = stackIn_67_2;
                                stackOut_67_3 = 0;
                                stackIn_68_0 = stackOut_67_0;
                                stackIn_68_1 = stackOut_67_1;
                                stackIn_68_2 = stackOut_67_2;
                                stackIn_68_3 = stackOut_67_3;
                                break L60;
                              } else {
                                stackOut_66_0 = (nb) (Object) stackIn_66_0;
                                stackOut_66_1 = (wb) (Object) stackIn_66_1;
                                stackOut_66_2 = stackIn_66_2;
                                stackOut_66_3 = 1;
                                stackIn_68_0 = stackOut_66_0;
                                stackIn_68_1 = stackOut_66_1;
                                stackIn_68_2 = stackOut_66_2;
                                stackIn_68_3 = stackOut_66_3;
                                break L60;
                              }
                            }
                            ((nb) (Object) stackIn_68_0).a(stackIn_68_1, stackIn_68_2, stackIn_68_3 != 0);
                            this.a(param5, -1, ((qe) this).field_w, param3);
                            break L59;
                          } else {
                            break L59;
                          }
                        }
                        ((qe) this).field_v = param1;
                        break L54;
                      }
                    }
                    return;
                  }
                } else {
                  L61: {
                    var7 = 0;
                    if (param2) {
                      break L61;
                    } else {
                      ((qe) this).field_m = -96;
                      break L61;
                    }
                  }
                  L62: {
                    if (var7 == 0) {
                      L63: {
                        if (((qe) this).field_y == null) {
                          break L63;
                        } else {
                          ((qe) this).field_r.f(11795);
                          break L63;
                        }
                      }
                      L64: {
                        ((qe) this).field_y = param4;
                        if (param4 != null) {
                          L65: {
                            stackOut_50_0 = ((qe) this).field_r;
                            stackOut_50_1 = (wb) param4;
                            stackOut_50_2 = 14526;
                            stackIn_52_0 = stackOut_50_0;
                            stackIn_52_1 = stackOut_50_1;
                            stackIn_52_2 = stackOut_50_2;
                            stackIn_51_0 = stackOut_50_0;
                            stackIn_51_1 = stackOut_50_1;
                            stackIn_51_2 = stackOut_50_2;
                            if (param0) {
                              stackOut_52_0 = (nb) (Object) stackIn_52_0;
                              stackOut_52_1 = (wb) (Object) stackIn_52_1;
                              stackOut_52_2 = stackIn_52_2;
                              stackOut_52_3 = 0;
                              stackIn_53_0 = stackOut_52_0;
                              stackIn_53_1 = stackOut_52_1;
                              stackIn_53_2 = stackOut_52_2;
                              stackIn_53_3 = stackOut_52_3;
                              break L65;
                            } else {
                              stackOut_51_0 = (nb) (Object) stackIn_51_0;
                              stackOut_51_1 = (wb) (Object) stackIn_51_1;
                              stackOut_51_2 = stackIn_51_2;
                              stackOut_51_3 = 1;
                              stackIn_53_0 = stackOut_51_0;
                              stackIn_53_1 = stackOut_51_1;
                              stackIn_53_2 = stackOut_51_2;
                              stackIn_53_3 = stackOut_51_3;
                              break L65;
                            }
                          }
                          ((nb) (Object) stackIn_53_0).a(stackIn_53_1, stackIn_53_2, stackIn_53_3 != 0);
                          this.a(param5, -1, ((qe) this).field_r, param3);
                          break L64;
                        } else {
                          break L64;
                        }
                      }
                      ((qe) this).field_v = -param1;
                      break L62;
                    } else {
                      L66: {
                        if (null == ((qe) this).field_x) {
                          break L66;
                        } else {
                          ((qe) this).field_w.f(11795);
                          break L66;
                        }
                      }
                      L67: {
                        ((qe) this).field_x = param4;
                        if (param4 != null) {
                          L68: {
                            stackOut_41_0 = ((qe) this).field_w;
                            stackOut_41_1 = (wb) param4;
                            stackOut_41_2 = 14526;
                            stackIn_43_0 = stackOut_41_0;
                            stackIn_43_1 = stackOut_41_1;
                            stackIn_43_2 = stackOut_41_2;
                            stackIn_42_0 = stackOut_41_0;
                            stackIn_42_1 = stackOut_41_1;
                            stackIn_42_2 = stackOut_41_2;
                            if (param0) {
                              stackOut_43_0 = (nb) (Object) stackIn_43_0;
                              stackOut_43_1 = (wb) (Object) stackIn_43_1;
                              stackOut_43_2 = stackIn_43_2;
                              stackOut_43_3 = 0;
                              stackIn_44_0 = stackOut_43_0;
                              stackIn_44_1 = stackOut_43_1;
                              stackIn_44_2 = stackOut_43_2;
                              stackIn_44_3 = stackOut_43_3;
                              break L68;
                            } else {
                              stackOut_42_0 = (nb) (Object) stackIn_42_0;
                              stackOut_42_1 = (wb) (Object) stackIn_42_1;
                              stackOut_42_2 = stackIn_42_2;
                              stackOut_42_3 = 1;
                              stackIn_44_0 = stackOut_42_0;
                              stackIn_44_1 = stackOut_42_1;
                              stackIn_44_2 = stackOut_42_2;
                              stackIn_44_3 = stackOut_42_3;
                              break L68;
                            }
                          }
                          ((nb) (Object) stackIn_44_0).a(stackIn_44_1, stackIn_44_2, stackIn_44_3 != 0);
                          this.a(param5, -1, ((qe) this).field_w, param3);
                          break L67;
                        } else {
                          break L67;
                        }
                      }
                      ((qe) this).field_v = param1;
                      break L62;
                    }
                  }
                  return;
                }
              } else {
                L69: {
                  var7 = 1;
                  if (param2) {
                    break L69;
                  } else {
                    ((qe) this).field_m = -96;
                    break L69;
                  }
                }
                L70: {
                  if (var7 == 0) {
                    L71: {
                      if (((qe) this).field_y == null) {
                        break L71;
                      } else {
                        ((qe) this).field_r.f(11795);
                        break L71;
                      }
                    }
                    L72: {
                      ((qe) this).field_y = param4;
                      if (param4 != null) {
                        L73: {
                          stackOut_27_0 = ((qe) this).field_r;
                          stackOut_27_1 = (wb) param4;
                          stackOut_27_2 = 14526;
                          stackIn_29_0 = stackOut_27_0;
                          stackIn_29_1 = stackOut_27_1;
                          stackIn_29_2 = stackOut_27_2;
                          stackIn_28_0 = stackOut_27_0;
                          stackIn_28_1 = stackOut_27_1;
                          stackIn_28_2 = stackOut_27_2;
                          if (param0) {
                            stackOut_29_0 = (nb) (Object) stackIn_29_0;
                            stackOut_29_1 = (wb) (Object) stackIn_29_1;
                            stackOut_29_2 = stackIn_29_2;
                            stackOut_29_3 = 0;
                            stackIn_30_0 = stackOut_29_0;
                            stackIn_30_1 = stackOut_29_1;
                            stackIn_30_2 = stackOut_29_2;
                            stackIn_30_3 = stackOut_29_3;
                            break L73;
                          } else {
                            stackOut_28_0 = (nb) (Object) stackIn_28_0;
                            stackOut_28_1 = (wb) (Object) stackIn_28_1;
                            stackOut_28_2 = stackIn_28_2;
                            stackOut_28_3 = 1;
                            stackIn_30_0 = stackOut_28_0;
                            stackIn_30_1 = stackOut_28_1;
                            stackIn_30_2 = stackOut_28_2;
                            stackIn_30_3 = stackOut_28_3;
                            break L73;
                          }
                        }
                        ((nb) (Object) stackIn_30_0).a(stackIn_30_1, stackIn_30_2, stackIn_30_3 != 0);
                        this.a(param5, -1, ((qe) this).field_r, param3);
                        break L72;
                      } else {
                        break L72;
                      }
                    }
                    ((qe) this).field_v = -param1;
                    break L70;
                  } else {
                    L74: {
                      if (null == ((qe) this).field_x) {
                        break L74;
                      } else {
                        ((qe) this).field_w.f(11795);
                        break L74;
                      }
                    }
                    L75: {
                      ((qe) this).field_x = param4;
                      if (param4 != null) {
                        L76: {
                          stackOut_18_0 = ((qe) this).field_w;
                          stackOut_18_1 = (wb) param4;
                          stackOut_18_2 = 14526;
                          stackIn_20_0 = stackOut_18_0;
                          stackIn_20_1 = stackOut_18_1;
                          stackIn_20_2 = stackOut_18_2;
                          stackIn_19_0 = stackOut_18_0;
                          stackIn_19_1 = stackOut_18_1;
                          stackIn_19_2 = stackOut_18_2;
                          if (param0) {
                            stackOut_20_0 = (nb) (Object) stackIn_20_0;
                            stackOut_20_1 = (wb) (Object) stackIn_20_1;
                            stackOut_20_2 = stackIn_20_2;
                            stackOut_20_3 = 0;
                            stackIn_21_0 = stackOut_20_0;
                            stackIn_21_1 = stackOut_20_1;
                            stackIn_21_2 = stackOut_20_2;
                            stackIn_21_3 = stackOut_20_3;
                            break L76;
                          } else {
                            stackOut_19_0 = (nb) (Object) stackIn_19_0;
                            stackOut_19_1 = (wb) (Object) stackIn_19_1;
                            stackOut_19_2 = stackIn_19_2;
                            stackOut_19_3 = 1;
                            stackIn_21_0 = stackOut_19_0;
                            stackIn_21_1 = stackOut_19_1;
                            stackIn_21_2 = stackOut_19_2;
                            stackIn_21_3 = stackOut_19_3;
                            break L76;
                          }
                        }
                        ((nb) (Object) stackIn_21_0).a(stackIn_21_1, stackIn_21_2, stackIn_21_3 != 0);
                        this.a(param5, -1, ((qe) this).field_w, param3);
                        break L75;
                      } else {
                        break L75;
                      }
                    }
                    ((qe) this).field_v = param1;
                    break L70;
                  }
                }
                return;
              }
            }
          } else {
            ((qe) this).field_v = param1;
            this.a(param5, -1, ((qe) this).field_w, param3);
            return;
          }
        }
    }

    final wh a() {
        return null;
    }

    private qe() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = new ba();
        field_n = new aa(7, 0, 1, 1);
    }
}
