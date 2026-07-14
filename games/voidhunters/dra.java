/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dra extends f {
    private kka field_o;
    hbb field_n;
    private int field_u;
    static phb[] field_v;
    private boolean field_q;
    private int field_s;
    private hbb field_j;
    private kka field_m;
    private int[] field_r;
    private kka field_w;
    private int field_h;
    private int[] field_p;
    hbb field_k;
    private boolean field_i;
    private hbb field_l;
    private int field_t;

    final void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_33_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_101_0 = 0;
        int stackIn_114_0 = 0;
        int stackIn_121_0 = 0;
        int stackIn_133_0 = 0;
        int stackIn_141_0 = 0;
        int stackIn_148_0 = 0;
        int stackIn_162_0 = 0;
        int stackIn_170_0 = 0;
        int stackIn_177_0 = 0;
        int stackIn_190_0 = 0;
        int stackIn_198_0 = 0;
        int stackIn_205_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_86_0 = 0;
        int stackOut_85_0 = 0;
        int stackOut_79_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_176_0 = 0;
        int stackOut_175_0 = 0;
        int stackOut_169_0 = 0;
        int stackOut_168_0 = 0;
        int stackOut_161_0 = 0;
        int stackOut_160_0 = 0;
        int stackOut_147_0 = 0;
        int stackOut_146_0 = 0;
        int stackOut_140_0 = 0;
        int stackOut_139_0 = 0;
        int stackOut_132_0 = 0;
        int stackOut_131_0 = 0;
        int stackOut_100_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_113_0 = 0;
        int stackOut_112_0 = 0;
        int stackOut_120_0 = 0;
        int stackOut_119_0 = 0;
        int stackOut_204_0 = 0;
        int stackOut_203_0 = 0;
        int stackOut_197_0 = 0;
        int stackOut_196_0 = 0;
        int stackOut_189_0 = 0;
        int stackOut_188_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        var11 = VoidHunters.field_G;
        if (((dra) this).field_h <= 0) {
          ((dra) this).a(param2);
          return;
        } else {
          L0: {
            if (!((dra) this).field_q) {
              break L0;
            } else {
              L1: {
                if (-1 <= (((dra) this).field_t ^ -1)) {
                  break L1;
                } else {
                  if (!((dra) this).field_k.c(-93)) {
                    ((dra) this).field_o = null;
                    ((dra) this).field_q = false;
                    ((dra) this).field_t = -((dra) this).field_t;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              if ((((dra) this).field_t ^ -1) <= -1) {
                break L0;
              } else {
                if (((dra) this).field_j.c(-123)) {
                  break L0;
                } else {
                  ((dra) this).field_q = false;
                  ((dra) this).field_m = null;
                  ((dra) this).field_t = -((dra) this).field_t;
                  break L0;
                }
              }
            }
          }
          L2: {
            var4 = ((dra) this).field_h * (((dra) this).field_s >> -656359828) / 256;
            var5 = ((dra) this).field_h - var4;
            if (((dra) this).field_t != -1) {
              ((dra) this).field_s = ((dra) this).field_s + param2 * ((dra) this).field_t;
              if (-1048577 > ((dra) this).field_s) {
                if (-1 > (((dra) this).field_s ^ -1)) {
                  break L2;
                } else {
                  ((dra) this).field_s = 0;
                  if (((dra) this).field_q) {
                    break L2;
                  } else {
                    ((dra) this).field_t = 0;
                    if (!((dra) this).field_i) {
                      if (null == ((dra) this).field_o) {
                        ((dra) this).field_o = null;
                        break L2;
                      } else {
                        ((dra) this).field_k.a(true);
                        ((dra) this).field_o = null;
                        break L2;
                      }
                    } else {
                      break L2;
                    }
                  }
                }
              } else {
                ((dra) this).field_s = 1048576;
                if (!((dra) this).field_q) {
                  ((dra) this).field_t = 0;
                  if (!((dra) this).field_i) {
                    L3: {
                      if (null != ((dra) this).field_m) {
                        ((dra) this).field_j.a(true);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    ((dra) this).field_m = null;
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
            } else {
              break L2;
            }
          }
          L4: {
            if (vka.field_r) {
              stackOut_32_0 = param2 << -261886399;
              stackIn_33_0 = stackOut_32_0;
              break L4;
            } else {
              stackOut_31_0 = param2;
              stackIn_33_0 = stackOut_31_0;
              break L4;
            }
          }
          var6 = stackIn_33_0;
          if (-257 < (((dra) this).field_u ^ -1)) {
            L5: {
              if (((dra) this).field_o != null) {
                break L5;
              } else {
                if (((dra) this).field_m != null) {
                  break L5;
                } else {
                  if (((dra) this).field_w != null) {
                    if (0 != ((dra) this).field_u) {
                      if (null != ((dra) this).field_r) {
                        if (((dra) this).field_r.length >= var6) {
                          L6: {
                            cua.a(((dra) this).field_r, 0, var6);
                            ((dra) this).field_l.a(((dra) this).field_r, 0, param2);
                            if (vka.field_r) {
                              param1 = param1 << 1;
                              stackOut_86_0 = param1 << 1;
                              stackIn_87_0 = stackOut_86_0;
                              break L6;
                            } else {
                              stackOut_85_0 = param1;
                              stackIn_87_0 = stackOut_85_0;
                              break L6;
                            }
                          }
                          var7 = stackIn_87_0;
                          var8 = ((dra) this).field_h * ((dra) this).field_u / 256;
                          var9 = -var8 + ((dra) this).field_h;
                          var10 = 0;
                          L7: while (true) {
                            if (var6 <= var10) {
                              return;
                            } else {
                              param0[var10 + var7] = var8 * ((dra) this).field_r[var10] + param0[var10 + var7] * var9 >> -1951367064;
                              var10++;
                              continue L7;
                            }
                          }
                        } else {
                          L8: {
                            ((dra) this).field_p = new int[var6];
                            ((dra) this).field_r = new int[var6];
                            ((dra) this).field_l.a(((dra) this).field_r, 0, param2);
                            if (vka.field_r) {
                              param1 = param1 << 1;
                              stackOut_79_0 = param1 << 1;
                              stackIn_80_0 = stackOut_79_0;
                              break L8;
                            } else {
                              stackOut_78_0 = param1;
                              stackIn_80_0 = stackOut_78_0;
                              break L8;
                            }
                          }
                          var7 = stackIn_80_0;
                          var8 = ((dra) this).field_h * ((dra) this).field_u / 256;
                          var9 = -var8 + ((dra) this).field_h;
                          var10 = 0;
                          L9: while (true) {
                            if (var6 <= var10) {
                              return;
                            } else {
                              param0[var10 + var7] = var8 * ((dra) this).field_r[var10] + param0[var10 + var7] * var9 >> -1951367064;
                              var10++;
                              continue L9;
                            }
                          }
                        }
                      } else {
                        L10: {
                          ((dra) this).field_p = new int[var6];
                          ((dra) this).field_r = new int[var6];
                          ((dra) this).field_l.a(((dra) this).field_r, 0, param2);
                          if (vka.field_r) {
                            param1 = param1 << 1;
                            stackOut_71_0 = param1 << 1;
                            stackIn_72_0 = stackOut_71_0;
                            break L10;
                          } else {
                            stackOut_70_0 = param1;
                            stackIn_72_0 = stackOut_70_0;
                            break L10;
                          }
                        }
                        var7 = stackIn_72_0;
                        var8 = ((dra) this).field_h * ((dra) this).field_u / 256;
                        var9 = -var8 + ((dra) this).field_h;
                        var10 = 0;
                        L11: while (true) {
                          if (var6 <= var10) {
                            return;
                          } else {
                            param0[var10 + var7] = var8 * ((dra) this).field_r[var10] + param0[var10 + var7] * var9 >> -1951367064;
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
            if (-257 == var4) {
              ((dra) this).field_k.a(param0, param1, param2);
              if (((dra) this).field_w != null) {
                if (0 != ((dra) this).field_u) {
                  if (null != ((dra) this).field_r) {
                    if (((dra) this).field_r.length < var6) {
                      L12: {
                        ((dra) this).field_p = new int[var6];
                        ((dra) this).field_r = new int[var6];
                        ((dra) this).field_l.a(((dra) this).field_r, 0, param2);
                        if (vka.field_r) {
                          param1 = param1 << 1;
                          stackOut_176_0 = param1 << 1;
                          stackIn_177_0 = stackOut_176_0;
                          break L12;
                        } else {
                          stackOut_175_0 = param1;
                          stackIn_177_0 = stackOut_175_0;
                          break L12;
                        }
                      }
                      var7 = stackIn_177_0;
                      var8 = ((dra) this).field_h * ((dra) this).field_u / 256;
                      var9 = -var8 + ((dra) this).field_h;
                      var10 = 0;
                      L13: while (true) {
                        if (var6 <= var10) {
                          return;
                        } else {
                          param0[var10 + var7] = var8 * ((dra) this).field_r[var10] + param0[var10 + var7] * var9 >> -1951367064;
                          var10++;
                          continue L13;
                        }
                      }
                    } else {
                      L14: {
                        cua.a(((dra) this).field_r, 0, var6);
                        ((dra) this).field_l.a(((dra) this).field_r, 0, param2);
                        if (vka.field_r) {
                          param1 = param1 << 1;
                          stackOut_169_0 = param1 << 1;
                          stackIn_170_0 = stackOut_169_0;
                          break L14;
                        } else {
                          stackOut_168_0 = param1;
                          stackIn_170_0 = stackOut_168_0;
                          break L14;
                        }
                      }
                      var7 = stackIn_170_0;
                      var8 = ((dra) this).field_h * ((dra) this).field_u / 256;
                      var9 = -var8 + ((dra) this).field_h;
                      var10 = 0;
                      L15: while (true) {
                        if (var6 <= var10) {
                          return;
                        } else {
                          param0[var10 + var7] = var8 * ((dra) this).field_r[var10] + param0[var10 + var7] * var9 >> -1951367064;
                          var10++;
                          continue L15;
                        }
                      }
                    }
                  } else {
                    L16: {
                      ((dra) this).field_p = new int[var6];
                      ((dra) this).field_r = new int[var6];
                      ((dra) this).field_l.a(((dra) this).field_r, 0, param2);
                      if (vka.field_r) {
                        param1 = param1 << 1;
                        stackOut_161_0 = param1 << 1;
                        stackIn_162_0 = stackOut_161_0;
                        break L16;
                      } else {
                        stackOut_160_0 = param1;
                        stackIn_162_0 = stackOut_160_0;
                        break L16;
                      }
                    }
                    var7 = stackIn_162_0;
                    var8 = ((dra) this).field_h * ((dra) this).field_u / 256;
                    var9 = -var8 + ((dra) this).field_h;
                    var10 = 0;
                    L17: while (true) {
                      if (var6 <= var10) {
                        return;
                      } else {
                        param0[var10 + var7] = var8 * ((dra) this).field_r[var10] + param0[var10 + var7] * var9 >> -1951367064;
                        var10++;
                        continue L17;
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
              if (-257 == var5) {
                ((dra) this).field_j.a(param0, param1, param2);
                if (((dra) this).field_w != null) {
                  if (0 != ((dra) this).field_u) {
                    if (null != ((dra) this).field_r) {
                      if (((dra) this).field_r.length < var6) {
                        L18: {
                          ((dra) this).field_p = new int[var6];
                          ((dra) this).field_r = new int[var6];
                          ((dra) this).field_l.a(((dra) this).field_r, 0, param2);
                          if (vka.field_r) {
                            param1 = param1 << 1;
                            stackOut_147_0 = param1 << 1;
                            stackIn_148_0 = stackOut_147_0;
                            break L18;
                          } else {
                            stackOut_146_0 = param1;
                            stackIn_148_0 = stackOut_146_0;
                            break L18;
                          }
                        }
                        var7 = stackIn_148_0;
                        var8 = ((dra) this).field_h * ((dra) this).field_u / 256;
                        var9 = -var8 + ((dra) this).field_h;
                        var10 = 0;
                        L19: while (true) {
                          if (var6 <= var10) {
                            return;
                          } else {
                            param0[var10 + var7] = var8 * ((dra) this).field_r[var10] + param0[var10 + var7] * var9 >> -1951367064;
                            var10++;
                            continue L19;
                          }
                        }
                      } else {
                        L20: {
                          cua.a(((dra) this).field_r, 0, var6);
                          ((dra) this).field_l.a(((dra) this).field_r, 0, param2);
                          if (vka.field_r) {
                            param1 = param1 << 1;
                            stackOut_140_0 = param1 << 1;
                            stackIn_141_0 = stackOut_140_0;
                            break L20;
                          } else {
                            stackOut_139_0 = param1;
                            stackIn_141_0 = stackOut_139_0;
                            break L20;
                          }
                        }
                        var7 = stackIn_141_0;
                        var8 = ((dra) this).field_h * ((dra) this).field_u / 256;
                        var9 = -var8 + ((dra) this).field_h;
                        var10 = 0;
                        L21: while (true) {
                          if (var6 <= var10) {
                            return;
                          } else {
                            param0[var10 + var7] = var8 * ((dra) this).field_r[var10] + param0[var10 + var7] * var9 >> -1951367064;
                            var10++;
                            continue L21;
                          }
                        }
                      }
                    } else {
                      L22: {
                        ((dra) this).field_p = new int[var6];
                        ((dra) this).field_r = new int[var6];
                        ((dra) this).field_l.a(((dra) this).field_r, 0, param2);
                        if (vka.field_r) {
                          param1 = param1 << 1;
                          stackOut_132_0 = param1 << 1;
                          stackIn_133_0 = stackOut_132_0;
                          break L22;
                        } else {
                          stackOut_131_0 = param1;
                          stackIn_133_0 = stackOut_131_0;
                          break L22;
                        }
                      }
                      var7 = stackIn_133_0;
                      var8 = ((dra) this).field_h * ((dra) this).field_u / 256;
                      var9 = -var8 + ((dra) this).field_h;
                      var10 = 0;
                      L23: while (true) {
                        if (var6 <= var10) {
                          return;
                        } else {
                          param0[var10 + var7] = var8 * ((dra) this).field_r[var10] + param0[var10 + var7] * var9 >> -1951367064;
                          var10++;
                          continue L23;
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
                L24: {
                  if (((dra) this).field_r == null) {
                    break L24;
                  } else {
                    if (var6 <= ((dra) this).field_r.length) {
                      L25: {
                        cua.a(((dra) this).field_r, 0, var6);
                        cua.a(((dra) this).field_p, 0, var6);
                        ((dra) this).field_k.a(((dra) this).field_r, 0, param2);
                        ((dra) this).field_j.a(((dra) this).field_p, 0, param2);
                        if (vka.field_r) {
                          param1 = param1 << 1;
                          stackOut_100_0 = param1 << 1;
                          stackIn_101_0 = stackOut_100_0;
                          break L25;
                        } else {
                          stackOut_99_0 = param1;
                          stackIn_101_0 = stackOut_99_0;
                          break L25;
                        }
                      }
                      var7 = stackIn_101_0;
                      var8 = 0;
                      L26: while (true) {
                        if (var6 <= var8) {
                          L27: {
                            if (((dra) this).field_w == null) {
                              break L27;
                            } else {
                              if (0 != ((dra) this).field_u) {
                                L28: {
                                  L29: {
                                    if (null == ((dra) this).field_r) {
                                      break L29;
                                    } else {
                                      if (((dra) this).field_r.length < var6) {
                                        break L29;
                                      } else {
                                        cua.a(((dra) this).field_r, 0, var6);
                                        break L28;
                                      }
                                    }
                                  }
                                  ((dra) this).field_p = new int[var6];
                                  ((dra) this).field_r = new int[var6];
                                  break L28;
                                }
                                L30: {
                                  ((dra) this).field_l.a(((dra) this).field_r, 0, param2);
                                  if (vka.field_r) {
                                    param1 = param1 << 1;
                                    stackOut_113_0 = param1 << 1;
                                    stackIn_114_0 = stackOut_113_0;
                                    break L30;
                                  } else {
                                    stackOut_112_0 = param1;
                                    stackIn_114_0 = stackOut_112_0;
                                    break L30;
                                  }
                                }
                                var7 = stackIn_114_0;
                                var8 = ((dra) this).field_h * ((dra) this).field_u / 256;
                                var9 = -var8 + ((dra) this).field_h;
                                var10 = 0;
                                L31: while (true) {
                                  if (var6 <= var10) {
                                    break L27;
                                  } else {
                                    param0[var10 + var7] = var8 * ((dra) this).field_r[var10] + param0[var10 + var7] * var9 >> -1951367064;
                                    var10++;
                                    continue L31;
                                  }
                                }
                              } else {
                                break L27;
                              }
                            }
                          }
                          return;
                        } else {
                          param0[var7 + var8] = param0[var7 + var8] + (var5 * ((dra) this).field_p[var8] + ((dra) this).field_r[var8] * var4 >> -441664632);
                          var8++;
                          continue L26;
                        }
                      }
                    } else {
                      break L24;
                    }
                  }
                }
                ((dra) this).field_p = new int[var6];
                ((dra) this).field_r = new int[var6];
                L32: {
                  ((dra) this).field_k.a(((dra) this).field_r, 0, param2);
                  ((dra) this).field_j.a(((dra) this).field_p, 0, param2);
                  if (vka.field_r) {
                    param1 = param1 << 1;
                    stackOut_120_0 = param1 << 1;
                    stackIn_121_0 = stackOut_120_0;
                    break L32;
                  } else {
                    stackOut_119_0 = param1;
                    stackIn_121_0 = stackOut_119_0;
                    break L32;
                  }
                }
                var7 = stackIn_121_0;
                var8 = 0;
                L33: while (true) {
                  if (var6 <= var8) {
                    if (((dra) this).field_w != null) {
                      if (0 != ((dra) this).field_u) {
                        if (null != ((dra) this).field_r) {
                          if (((dra) this).field_r.length >= var6) {
                            L34: {
                              cua.a(((dra) this).field_r, 0, var6);
                              ((dra) this).field_l.a(((dra) this).field_r, 0, param2);
                              if (vka.field_r) {
                                param1 = param1 << 1;
                                stackOut_204_0 = param1 << 1;
                                stackIn_205_0 = stackOut_204_0;
                                break L34;
                              } else {
                                stackOut_203_0 = param1;
                                stackIn_205_0 = stackOut_203_0;
                                break L34;
                              }
                            }
                            var7 = stackIn_205_0;
                            var8 = ((dra) this).field_h * ((dra) this).field_u / 256;
                            var9 = -var8 + ((dra) this).field_h;
                            var10 = 0;
                            L35: while (true) {
                              if (var6 <= var10) {
                                return;
                              } else {
                                param0[var10 + var7] = var8 * ((dra) this).field_r[var10] + param0[var10 + var7] * var9 >> -1951367064;
                                var10++;
                                continue L35;
                              }
                            }
                          } else {
                            L36: {
                              ((dra) this).field_p = new int[var6];
                              ((dra) this).field_r = new int[var6];
                              ((dra) this).field_l.a(((dra) this).field_r, 0, param2);
                              if (vka.field_r) {
                                param1 = param1 << 1;
                                stackOut_197_0 = param1 << 1;
                                stackIn_198_0 = stackOut_197_0;
                                break L36;
                              } else {
                                stackOut_196_0 = param1;
                                stackIn_198_0 = stackOut_196_0;
                                break L36;
                              }
                            }
                            var7 = stackIn_198_0;
                            var8 = ((dra) this).field_h * ((dra) this).field_u / 256;
                            var9 = -var8 + ((dra) this).field_h;
                            var10 = 0;
                            L37: while (true) {
                              if (var6 <= var10) {
                                return;
                              } else {
                                param0[var10 + var7] = var8 * ((dra) this).field_r[var10] + param0[var10 + var7] * var9 >> -1951367064;
                                var10++;
                                continue L37;
                              }
                            }
                          }
                        } else {
                          L38: {
                            ((dra) this).field_p = new int[var6];
                            ((dra) this).field_r = new int[var6];
                            ((dra) this).field_l.a(((dra) this).field_r, 0, param2);
                            if (vka.field_r) {
                              param1 = param1 << 1;
                              stackOut_189_0 = param1 << 1;
                              stackIn_190_0 = stackOut_189_0;
                              break L38;
                            } else {
                              stackOut_188_0 = param1;
                              stackIn_190_0 = stackOut_188_0;
                              break L38;
                            }
                          }
                          var7 = stackIn_190_0;
                          var8 = ((dra) this).field_h * ((dra) this).field_u / 256;
                          var9 = -var8 + ((dra) this).field_h;
                          var10 = 0;
                          L39: while (true) {
                            if (var6 <= var10) {
                              return;
                            } else {
                              param0[var10 + var7] = var8 * ((dra) this).field_r[var10] + param0[var10 + var7] * var9 >> -1951367064;
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
                    param0[var7 + var8] = param0[var7 + var8] + (var5 * ((dra) this).field_p[var8] + ((dra) this).field_r[var8] * var4 >> -441664632);
                    var8++;
                    continue L33;
                  }
                }
              }
            }
          } else {
            if (((dra) this).field_w != null) {
              if (0 != ((dra) this).field_u) {
                if (null != ((dra) this).field_r) {
                  if (((dra) this).field_r.length >= var6) {
                    L40: {
                      cua.a(((dra) this).field_r, 0, var6);
                      ((dra) this).field_l.a(((dra) this).field_r, 0, param2);
                      if (vka.field_r) {
                        param1 = param1 << 1;
                        stackOut_56_0 = param1 << 1;
                        stackIn_57_0 = stackOut_56_0;
                        break L40;
                      } else {
                        stackOut_55_0 = param1;
                        stackIn_57_0 = stackOut_55_0;
                        break L40;
                      }
                    }
                    var7 = stackIn_57_0;
                    var8 = ((dra) this).field_h * ((dra) this).field_u / 256;
                    var9 = -var8 + ((dra) this).field_h;
                    var10 = 0;
                    L41: while (true) {
                      if (var6 <= var10) {
                        return;
                      } else {
                        param0[var10 + var7] = var8 * ((dra) this).field_r[var10] + param0[var10 + var7] * var9 >> -1951367064;
                        var10++;
                        continue L41;
                      }
                    }
                  } else {
                    L42: {
                      ((dra) this).field_p = new int[var6];
                      ((dra) this).field_r = new int[var6];
                      ((dra) this).field_l.a(((dra) this).field_r, 0, param2);
                      if (vka.field_r) {
                        param1 = param1 << 1;
                        stackOut_49_0 = param1 << 1;
                        stackIn_50_0 = stackOut_49_0;
                        break L42;
                      } else {
                        stackOut_48_0 = param1;
                        stackIn_50_0 = stackOut_48_0;
                        break L42;
                      }
                    }
                    var7 = stackIn_50_0;
                    var8 = ((dra) this).field_h * ((dra) this).field_u / 256;
                    var9 = -var8 + ((dra) this).field_h;
                    var10 = 0;
                    L43: while (true) {
                      if (var6 <= var10) {
                        return;
                      } else {
                        param0[var10 + var7] = var8 * ((dra) this).field_r[var10] + param0[var10 + var7] * var9 >> -1951367064;
                        var10++;
                        continue L43;
                      }
                    }
                  }
                } else {
                  L44: {
                    ((dra) this).field_p = new int[var6];
                    ((dra) this).field_r = new int[var6];
                    ((dra) this).field_l.a(((dra) this).field_r, 0, param2);
                    if (vka.field_r) {
                      param1 = param1 << 1;
                      stackOut_41_0 = param1 << 1;
                      stackIn_42_0 = stackOut_41_0;
                      break L44;
                    } else {
                      stackOut_40_0 = param1;
                      stackIn_42_0 = stackOut_40_0;
                      break L44;
                    }
                  }
                  var7 = stackIn_42_0;
                  var8 = ((dra) this).field_h * ((dra) this).field_u / 256;
                  var9 = -var8 + ((dra) this).field_h;
                  var10 = 0;
                  L45: while (true) {
                    if (var6 <= var10) {
                      return;
                    } else {
                      param0[var10 + var7] = var8 * ((dra) this).field_r[var10] + param0[var10 + var7] * var9 >> -1951367064;
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

    final synchronized void a(int param0) {
        int var3 = 0;
        var3 = VoidHunters.field_G;
        if ((((dra) this).field_s ^ -1) < -1) {
          if (null != ((dra) this).field_o) {
            L0: {
              ((dra) this).field_k.a(param0);
              if (((dra) this).field_s >= 1048576) {
                break L0;
              } else {
                if (null == ((dra) this).field_m) {
                  break L0;
                } else {
                  ((dra) this).field_j.a(param0);
                  break L0;
                }
              }
            }
            L1: {
              if (0 >= ((dra) this).field_u) {
                break L1;
              } else {
                if (null != ((dra) this).field_w) {
                  ((dra) this).field_l.a(param0);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            if (((dra) this).field_q) {
              L2: {
                if (-1 <= (((dra) this).field_t ^ -1)) {
                  break L2;
                } else {
                  if (!((dra) this).field_k.c(-110)) {
                    ((dra) this).field_o = null;
                    ((dra) this).field_q = false;
                    ((dra) this).field_t = -((dra) this).field_t;
                    if (((dra) this).field_t != 0) {
                      L3: {
                        ((dra) this).field_s = ((dra) this).field_s + param0 * ((dra) this).field_t;
                        if (1048576 <= ((dra) this).field_s) {
                          ((dra) this).field_s = 1048576;
                          if (((dra) this).field_q) {
                            break L3;
                          } else {
                            ((dra) this).field_t = 0;
                            if (((dra) this).field_i) {
                              break L3;
                            } else {
                              L4: {
                                if (null != ((dra) this).field_m) {
                                  ((dra) this).field_j.a(true);
                                  break L4;
                                } else {
                                  break L4;
                                }
                              }
                              ((dra) this).field_m = null;
                              break L3;
                            }
                          }
                        } else {
                          if (((dra) this).field_s <= 0) {
                            ((dra) this).field_s = 0;
                            if (((dra) this).field_q) {
                              break L3;
                            } else {
                              ((dra) this).field_t = 0;
                              if (!((dra) this).field_i) {
                                if (((dra) this).field_o == null) {
                                  ((dra) this).field_o = null;
                                  return;
                                } else {
                                  ((dra) this).field_k.a(true);
                                  ((dra) this).field_o = null;
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
                      return;
                    } else {
                      return;
                    }
                  } else {
                    break L2;
                  }
                }
              }
              if (0 > ((dra) this).field_t) {
                if (!((dra) this).field_j.c(-102)) {
                  ((dra) this).field_q = false;
                  ((dra) this).field_t = -((dra) this).field_t;
                  ((dra) this).field_m = null;
                  if (((dra) this).field_t != 0) {
                    ((dra) this).field_s = ((dra) this).field_s + param0 * ((dra) this).field_t;
                    if (1048576 > ((dra) this).field_s) {
                      if (((dra) this).field_s <= 0) {
                        ((dra) this).field_s = 0;
                        if (!((dra) this).field_q) {
                          ((dra) this).field_t = 0;
                          if (!((dra) this).field_i) {
                            if (((dra) this).field_o != null) {
                              ((dra) this).field_k.a(true);
                              ((dra) this).field_o = null;
                              return;
                            } else {
                              ((dra) this).field_o = null;
                              return;
                            }
                          } else {
                            return;
                          }
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      L5: {
                        ((dra) this).field_s = 1048576;
                        if (((dra) this).field_q) {
                          break L5;
                        } else {
                          ((dra) this).field_t = 0;
                          if (((dra) this).field_i) {
                            break L5;
                          } else {
                            L6: {
                              if (null != ((dra) this).field_m) {
                                ((dra) this).field_j.a(true);
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                            ((dra) this).field_m = null;
                            break L5;
                          }
                        }
                      }
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  if (((dra) this).field_t != 0) {
                    ((dra) this).field_s = ((dra) this).field_s + param0 * ((dra) this).field_t;
                    if (1048576 > ((dra) this).field_s) {
                      if (((dra) this).field_s <= 0) {
                        ((dra) this).field_s = 0;
                        if (!((dra) this).field_q) {
                          ((dra) this).field_t = 0;
                          if (!((dra) this).field_i) {
                            if (((dra) this).field_o != null) {
                              ((dra) this).field_k.a(true);
                              ((dra) this).field_o = null;
                              return;
                            } else {
                              ((dra) this).field_o = null;
                              return;
                            }
                          } else {
                            return;
                          }
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      L7: {
                        ((dra) this).field_s = 1048576;
                        if (((dra) this).field_q) {
                          break L7;
                        } else {
                          ((dra) this).field_t = 0;
                          if (((dra) this).field_i) {
                            break L7;
                          } else {
                            L8: {
                              if (null != ((dra) this).field_m) {
                                ((dra) this).field_j.a(true);
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            ((dra) this).field_m = null;
                            break L7;
                          }
                        }
                      }
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                if (((dra) this).field_t != 0) {
                  ((dra) this).field_s = ((dra) this).field_s + param0 * ((dra) this).field_t;
                  if (1048576 > ((dra) this).field_s) {
                    if (((dra) this).field_s <= 0) {
                      ((dra) this).field_s = 0;
                      if (!((dra) this).field_q) {
                        ((dra) this).field_t = 0;
                        if (!((dra) this).field_i) {
                          if (((dra) this).field_o == null) {
                            ((dra) this).field_o = null;
                            return;
                          } else {
                            ((dra) this).field_k.a(true);
                            ((dra) this).field_o = null;
                            return;
                          }
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    L9: {
                      ((dra) this).field_s = 1048576;
                      if (((dra) this).field_q) {
                        break L9;
                      } else {
                        ((dra) this).field_t = 0;
                        if (((dra) this).field_i) {
                          break L9;
                        } else {
                          L10: {
                            if (null != ((dra) this).field_m) {
                              ((dra) this).field_j.a(true);
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          ((dra) this).field_m = null;
                          break L9;
                        }
                      }
                    }
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              if (((dra) this).field_t != 0) {
                ((dra) this).field_s = ((dra) this).field_s + param0 * ((dra) this).field_t;
                if (1048576 > ((dra) this).field_s) {
                  if (((dra) this).field_s <= 0) {
                    ((dra) this).field_s = 0;
                    if (!((dra) this).field_q) {
                      ((dra) this).field_t = 0;
                      if (!((dra) this).field_i) {
                        if (((dra) this).field_o == null) {
                          ((dra) this).field_o = null;
                          return;
                        } else {
                          ((dra) this).field_k.a(true);
                          ((dra) this).field_o = null;
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  L11: {
                    ((dra) this).field_s = 1048576;
                    if (((dra) this).field_q) {
                      break L11;
                    } else {
                      ((dra) this).field_t = 0;
                      if (((dra) this).field_i) {
                        break L11;
                      } else {
                        L12: {
                          if (null != ((dra) this).field_m) {
                            ((dra) this).field_j.a(true);
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                        ((dra) this).field_m = null;
                        break L11;
                      }
                    }
                  }
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            L13: {
              if (((dra) this).field_s >= 1048576) {
                break L13;
              } else {
                if (null == ((dra) this).field_m) {
                  break L13;
                } else {
                  ((dra) this).field_j.a(param0);
                  break L13;
                }
              }
            }
            L14: {
              if (0 >= ((dra) this).field_u) {
                break L14;
              } else {
                if (null != ((dra) this).field_w) {
                  ((dra) this).field_l.a(param0);
                  break L14;
                } else {
                  break L14;
                }
              }
            }
            L15: {
              if (((dra) this).field_q) {
                L16: {
                  if (-1 <= (((dra) this).field_t ^ -1)) {
                    break L16;
                  } else {
                    if (!((dra) this).field_k.c(-110)) {
                      L17: {
                        ((dra) this).field_o = null;
                        ((dra) this).field_q = false;
                        ((dra) this).field_t = -((dra) this).field_t;
                        if (((dra) this).field_t != 0) {
                          ((dra) this).field_s = ((dra) this).field_s + param0 * ((dra) this).field_t;
                          if (1048576 <= ((dra) this).field_s) {
                            ((dra) this).field_s = 1048576;
                            if (((dra) this).field_q) {
                              break L17;
                            } else {
                              ((dra) this).field_t = 0;
                              if (((dra) this).field_i) {
                                break L17;
                              } else {
                                L18: {
                                  if (null != ((dra) this).field_m) {
                                    ((dra) this).field_j.a(true);
                                    break L18;
                                  } else {
                                    break L18;
                                  }
                                }
                                ((dra) this).field_m = null;
                                break L17;
                              }
                            }
                          } else {
                            if (((dra) this).field_s <= 0) {
                              ((dra) this).field_s = 0;
                              if (((dra) this).field_q) {
                                break L17;
                              } else {
                                ((dra) this).field_t = 0;
                                if (!((dra) this).field_i) {
                                  L19: {
                                    if (((dra) this).field_o == null) {
                                      break L19;
                                    } else {
                                      ((dra) this).field_k.a(true);
                                      break L19;
                                    }
                                  }
                                  ((dra) this).field_o = null;
                                  break L17;
                                } else {
                                  break L17;
                                }
                              }
                            } else {
                              break L17;
                            }
                          }
                        } else {
                          break L17;
                        }
                      }
                      return;
                    } else {
                      break L16;
                    }
                  }
                }
                if (0 <= ((dra) this).field_t) {
                  break L15;
                } else {
                  if (!((dra) this).field_j.c(-102)) {
                    ((dra) this).field_q = false;
                    ((dra) this).field_t = -((dra) this).field_t;
                    ((dra) this).field_m = null;
                    break L15;
                  } else {
                    break L15;
                  }
                }
              } else {
                break L15;
              }
            }
            if (((dra) this).field_t != 0) {
              ((dra) this).field_s = ((dra) this).field_s + param0 * ((dra) this).field_t;
              if (1048576 > ((dra) this).field_s) {
                if (((dra) this).field_s <= 0) {
                  ((dra) this).field_s = 0;
                  if (!((dra) this).field_q) {
                    ((dra) this).field_t = 0;
                    if (!((dra) this).field_i) {
                      if (((dra) this).field_o != null) {
                        ((dra) this).field_k.a(true);
                        ((dra) this).field_o = null;
                        return;
                      } else {
                        ((dra) this).field_o = null;
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                L20: {
                  ((dra) this).field_s = 1048576;
                  if (((dra) this).field_q) {
                    break L20;
                  } else {
                    ((dra) this).field_t = 0;
                    if (((dra) this).field_i) {
                      break L20;
                    } else {
                      L21: {
                        if (null != ((dra) this).field_m) {
                          ((dra) this).field_j.a(true);
                          break L21;
                        } else {
                          break L21;
                        }
                      }
                      ((dra) this).field_m = null;
                      break L20;
                    }
                  }
                }
                return;
              }
            } else {
              return;
            }
          }
        } else {
          L22: {
            if (((dra) this).field_s >= 1048576) {
              break L22;
            } else {
              if (null == ((dra) this).field_m) {
                break L22;
              } else {
                ((dra) this).field_j.a(param0);
                break L22;
              }
            }
          }
          L23: {
            if (0 >= ((dra) this).field_u) {
              break L23;
            } else {
              if (null != ((dra) this).field_w) {
                ((dra) this).field_l.a(param0);
                break L23;
              } else {
                break L23;
              }
            }
          }
          L24: {
            if (((dra) this).field_q) {
              L25: {
                if (-1 <= (((dra) this).field_t ^ -1)) {
                  break L25;
                } else {
                  if (!((dra) this).field_k.c(-110)) {
                    L26: {
                      ((dra) this).field_o = null;
                      ((dra) this).field_q = false;
                      ((dra) this).field_t = -((dra) this).field_t;
                      if (((dra) this).field_t != 0) {
                        ((dra) this).field_s = ((dra) this).field_s + param0 * ((dra) this).field_t;
                        if (1048576 <= ((dra) this).field_s) {
                          ((dra) this).field_s = 1048576;
                          if (((dra) this).field_q) {
                            break L26;
                          } else {
                            ((dra) this).field_t = 0;
                            if (((dra) this).field_i) {
                              break L26;
                            } else {
                              L27: {
                                if (null != ((dra) this).field_m) {
                                  ((dra) this).field_j.a(true);
                                  break L27;
                                } else {
                                  break L27;
                                }
                              }
                              ((dra) this).field_m = null;
                              break L26;
                            }
                          }
                        } else {
                          if (((dra) this).field_s <= 0) {
                            ((dra) this).field_s = 0;
                            if (((dra) this).field_q) {
                              break L26;
                            } else {
                              ((dra) this).field_t = 0;
                              if (!((dra) this).field_i) {
                                L28: {
                                  if (((dra) this).field_o == null) {
                                    break L28;
                                  } else {
                                    ((dra) this).field_k.a(true);
                                    break L28;
                                  }
                                }
                                ((dra) this).field_o = null;
                                break L26;
                              } else {
                                break L26;
                              }
                            }
                          } else {
                            break L26;
                          }
                        }
                      } else {
                        break L26;
                      }
                    }
                    return;
                  } else {
                    break L25;
                  }
                }
              }
              if (0 <= ((dra) this).field_t) {
                break L24;
              } else {
                if (!((dra) this).field_j.c(-102)) {
                  ((dra) this).field_q = false;
                  ((dra) this).field_t = -((dra) this).field_t;
                  ((dra) this).field_m = null;
                  break L24;
                } else {
                  break L24;
                }
              }
            } else {
              break L24;
            }
          }
          if (((dra) this).field_t != 0) {
            ((dra) this).field_s = ((dra) this).field_s + param0 * ((dra) this).field_t;
            if (1048576 > ((dra) this).field_s) {
              if (((dra) this).field_s <= 0) {
                ((dra) this).field_s = 0;
                if (!((dra) this).field_q) {
                  ((dra) this).field_t = 0;
                  if (!((dra) this).field_i) {
                    if (((dra) this).field_o != null) {
                      ((dra) this).field_k.a(true);
                      ((dra) this).field_o = null;
                      return;
                    } else {
                      ((dra) this).field_o = null;
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              L29: {
                ((dra) this).field_s = 1048576;
                if (((dra) this).field_q) {
                  break L29;
                } else {
                  ((dra) this).field_t = 0;
                  if (((dra) this).field_i) {
                    break L29;
                  } else {
                    L30: {
                      if (null != ((dra) this).field_m) {
                        ((dra) this).field_j.a(true);
                        break L30;
                      } else {
                        break L30;
                      }
                    }
                    ((dra) this).field_m = null;
                    break L29;
                  }
                }
              }
              return;
            }
          } else {
            return;
          }
        }
    }

    private final void a(hbb param0, int param1, int param2, int param3) {
        if (param2 >= -112) {
          ((dra) this).field_k = null;
          ((dra) this).field_n = param0;
          param0.b(param1, (byte) 18, -1);
          param0.a((byte) 30, param3);
          return;
        } else {
          ((dra) this).field_n = param0;
          param0.b(param1, (byte) 18, -1);
          param0.a((byte) 30, param3);
          return;
        }
    }

    final static void a(byte param0, int param1) {
        if (param0 <= 67) {
            return;
        }
        lla.field_b = param1;
        lla.field_e = lla.field_b / 2;
    }

    final synchronized void a(int param0, kka param1, int param2, int param3) {
        int var5 = -83 % ((-81 - param0) / 45);
        ((dra) this).a(256, param2, false, param1, -123, param3);
    }

    final f c() {
        return null;
    }

    final synchronized void b(byte param0, int param1) {
        ((dra) this).field_h = param1;
        if (param0 != -108) {
            dra.c(72);
        }
    }

    final synchronized int d() {
        return 2;
    }

    private final void a(int param0, hbb param1, hbb param2) {
        ((dra) this).field_k = param1;
        ((dra) this).field_j = param2;
        int var4 = 88 % ((73 - param0) / 51);
        ((dra) this).field_s = 1048576;
        ((dra) this).field_n = ((dra) this).field_k;
    }

    final f a() {
        return null;
    }

    final synchronized void a(int param0, int param1, boolean param2, kka param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        hbb stackIn_16_0 = null;
        hbb stackIn_17_0 = null;
        hbb stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        hbb stackIn_25_0 = null;
        hbb stackIn_26_0 = null;
        hbb stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int stackIn_33_0 = 0;
        hbb stackIn_39_0 = null;
        hbb stackIn_40_0 = null;
        hbb stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        hbb stackIn_48_0 = null;
        hbb stackIn_49_0 = null;
        hbb stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        hbb stackIn_60_0 = null;
        hbb stackIn_61_0 = null;
        hbb stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        hbb stackIn_68_0 = null;
        hbb stackIn_69_0 = null;
        hbb stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        hbb stackIn_75_0 = null;
        hbb stackIn_76_0 = null;
        hbb stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        Object stackIn_101_0 = null;
        Object stackIn_102_0 = null;
        Object stackIn_103_0 = null;
        int stackIn_103_1 = 0;
        int stackIn_112_0 = 0;
        hbb stackIn_118_0 = null;
        hbb stackIn_119_0 = null;
        hbb stackIn_120_0 = null;
        int stackIn_120_1 = 0;
        hbb stackIn_126_0 = null;
        hbb stackIn_127_0 = null;
        hbb stackIn_128_0 = null;
        int stackIn_128_1 = 0;
        hbb stackIn_133_0 = null;
        hbb stackIn_134_0 = null;
        hbb stackIn_135_0 = null;
        int stackIn_135_1 = 0;
        hbb stackIn_145_0 = null;
        hbb stackIn_146_0 = null;
        hbb stackIn_147_0 = null;
        int stackIn_147_1 = 0;
        hbb stackIn_153_0 = null;
        hbb stackIn_154_0 = null;
        hbb stackIn_155_0 = null;
        int stackIn_155_1 = 0;
        hbb stackIn_160_0 = null;
        hbb stackIn_161_0 = null;
        hbb stackIn_162_0 = null;
        int stackIn_162_1 = 0;
        hbb stackIn_172_0 = null;
        hbb stackIn_173_0 = null;
        hbb stackIn_174_0 = null;
        int stackIn_174_1 = 0;
        hbb stackIn_180_0 = null;
        hbb stackIn_181_0 = null;
        hbb stackIn_182_0 = null;
        int stackIn_182_1 = 0;
        hbb stackIn_187_0 = null;
        hbb stackIn_188_0 = null;
        hbb stackIn_189_0 = null;
        int stackIn_189_1 = 0;
        Object stackOut_100_0 = null;
        Object stackOut_102_0 = null;
        int stackOut_102_1 = 0;
        Object stackOut_101_0 = null;
        int stackOut_101_1 = 0;
        hbb stackOut_186_0 = null;
        hbb stackOut_188_0 = null;
        int stackOut_188_1 = 0;
        hbb stackOut_187_0 = null;
        int stackOut_187_1 = 0;
        hbb stackOut_179_0 = null;
        hbb stackOut_181_0 = null;
        int stackOut_181_1 = 0;
        hbb stackOut_180_0 = null;
        int stackOut_180_1 = 0;
        hbb stackOut_171_0 = null;
        hbb stackOut_173_0 = null;
        int stackOut_173_1 = 0;
        hbb stackOut_172_0 = null;
        int stackOut_172_1 = 0;
        hbb stackOut_159_0 = null;
        hbb stackOut_161_0 = null;
        int stackOut_161_1 = 0;
        hbb stackOut_160_0 = null;
        int stackOut_160_1 = 0;
        hbb stackOut_152_0 = null;
        hbb stackOut_154_0 = null;
        int stackOut_154_1 = 0;
        hbb stackOut_153_0 = null;
        int stackOut_153_1 = 0;
        hbb stackOut_144_0 = null;
        hbb stackOut_146_0 = null;
        int stackOut_146_1 = 0;
        hbb stackOut_145_0 = null;
        int stackOut_145_1 = 0;
        int stackOut_111_0 = 0;
        int stackOut_110_0 = 0;
        hbb stackOut_132_0 = null;
        hbb stackOut_134_0 = null;
        int stackOut_134_1 = 0;
        hbb stackOut_133_0 = null;
        int stackOut_133_1 = 0;
        hbb stackOut_125_0 = null;
        hbb stackOut_127_0 = null;
        int stackOut_127_1 = 0;
        hbb stackOut_126_0 = null;
        int stackOut_126_1 = 0;
        hbb stackOut_117_0 = null;
        hbb stackOut_119_0 = null;
        int stackOut_119_1 = 0;
        hbb stackOut_118_0 = null;
        int stackOut_118_1 = 0;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        hbb stackOut_74_0 = null;
        hbb stackOut_76_0 = null;
        int stackOut_76_1 = 0;
        hbb stackOut_75_0 = null;
        int stackOut_75_1 = 0;
        hbb stackOut_67_0 = null;
        hbb stackOut_69_0 = null;
        int stackOut_69_1 = 0;
        hbb stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        hbb stackOut_59_0 = null;
        hbb stackOut_61_0 = null;
        int stackOut_61_1 = 0;
        hbb stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        hbb stackOut_47_0 = null;
        hbb stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        hbb stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        hbb stackOut_38_0 = null;
        hbb stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        hbb stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        hbb stackOut_24_0 = null;
        hbb stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        hbb stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        hbb stackOut_15_0 = null;
        hbb stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        hbb stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        var9 = VoidHunters.field_G;
        if (((dra) this).field_q) {
          if (param2) {
            if (-1 > (((dra) this).field_t ^ -1)) {
              if (null == ((dra) this).field_o) {
                ((dra) this).field_o = param3;
                if (param3 == null) {
                  return;
                } else {
                  ((dra) this).field_k.a(false, param3, -1);
                  this.a(((dra) this).field_k, param0, -125, param5);
                  return;
                }
              } else {
                L0: {
                  ((dra) this).field_k.a(true);
                  ((dra) this).field_o = param3;
                  if (param3 != null) {
                    ((dra) this).field_k.a(false, param3, -1);
                    this.a(((dra) this).field_k, param0, -125, param5);
                    break L0;
                  } else {
                    break L0;
                  }
                }
                return;
              }
            } else {
              L1: {
                if (null == ((dra) this).field_m) {
                  break L1;
                } else {
                  ((dra) this).field_j.a(true);
                  break L1;
                }
              }
              ((dra) this).field_m = param3;
              if (param3 != null) {
                ((dra) this).field_j.a(false, param3, -1);
                this.a(((dra) this).field_j, param0, -118, param5);
                return;
              } else {
                return;
              }
            }
          } else {
            L2: {
              stackOut_100_0 = this;
              stackIn_102_0 = stackOut_100_0;
              stackIn_101_0 = stackOut_100_0;
              if (!param2) {
                stackOut_102_0 = this;
                stackOut_102_1 = 0;
                stackIn_103_0 = stackOut_102_0;
                stackIn_103_1 = stackOut_102_1;
                break L2;
              } else {
                stackOut_101_0 = this;
                stackOut_101_1 = 1;
                stackIn_103_0 = stackOut_101_0;
                stackIn_103_1 = stackOut_101_1;
                break L2;
              }
            }
            ((dra) this).field_q = stackIn_103_1 != 0;
            var7 = -19 / ((param4 - -81) / 32);
            if (((dra) this).field_o != param3) {
              if (param3 != ((dra) this).field_m) {
                if (null == ((dra) this).field_o) {
                  var8 = 1;
                  if (var8 != 0) {
                    if (null != ((dra) this).field_o) {
                      L3: {
                        ((dra) this).field_k.a(true);
                        ((dra) this).field_o = param3;
                        if (param3 != null) {
                          L4: {
                            stackOut_186_0 = ((dra) this).field_k;
                            stackIn_188_0 = stackOut_186_0;
                            stackIn_187_0 = stackOut_186_0;
                            if (param2) {
                              stackOut_188_0 = (hbb) (Object) stackIn_188_0;
                              stackOut_188_1 = 0;
                              stackIn_189_0 = stackOut_188_0;
                              stackIn_189_1 = stackOut_188_1;
                              break L4;
                            } else {
                              stackOut_187_0 = (hbb) (Object) stackIn_187_0;
                              stackOut_187_1 = 1;
                              stackIn_189_0 = stackOut_187_0;
                              stackIn_189_1 = stackOut_187_1;
                              break L4;
                            }
                          }
                          ((hbb) (Object) stackIn_189_0).a(stackIn_189_1 != 0, param3, -1);
                          this.a(((dra) this).field_k, param0, -122, param5);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      ((dra) this).field_t = param1;
                      return;
                    } else {
                      L5: {
                        ((dra) this).field_o = param3;
                        if (param3 != null) {
                          L6: {
                            stackOut_179_0 = ((dra) this).field_k;
                            stackIn_181_0 = stackOut_179_0;
                            stackIn_180_0 = stackOut_179_0;
                            if (param2) {
                              stackOut_181_0 = (hbb) (Object) stackIn_181_0;
                              stackOut_181_1 = 0;
                              stackIn_182_0 = stackOut_181_0;
                              stackIn_182_1 = stackOut_181_1;
                              break L6;
                            } else {
                              stackOut_180_0 = (hbb) (Object) stackIn_180_0;
                              stackOut_180_1 = 1;
                              stackIn_182_0 = stackOut_180_0;
                              stackIn_182_1 = stackOut_180_1;
                              break L6;
                            }
                          }
                          ((hbb) (Object) stackIn_182_0).a(stackIn_182_1 != 0, param3, -1);
                          this.a(((dra) this).field_k, param0, -122, param5);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      ((dra) this).field_t = param1;
                      return;
                    }
                  } else {
                    L7: {
                      if (null != ((dra) this).field_m) {
                        ((dra) this).field_j.a(true);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      ((dra) this).field_m = param3;
                      if (param3 == null) {
                        break L8;
                      } else {
                        L9: {
                          stackOut_171_0 = ((dra) this).field_j;
                          stackIn_173_0 = stackOut_171_0;
                          stackIn_172_0 = stackOut_171_0;
                          if (param2) {
                            stackOut_173_0 = (hbb) (Object) stackIn_173_0;
                            stackOut_173_1 = 0;
                            stackIn_174_0 = stackOut_173_0;
                            stackIn_174_1 = stackOut_173_1;
                            break L9;
                          } else {
                            stackOut_172_0 = (hbb) (Object) stackIn_172_0;
                            stackOut_172_1 = 1;
                            stackIn_174_0 = stackOut_172_0;
                            stackIn_174_1 = stackOut_172_1;
                            break L9;
                          }
                        }
                        ((hbb) (Object) stackIn_174_0).a(stackIn_174_1 != 0, param3, -1);
                        this.a(((dra) this).field_j, param0, -117, param5);
                        break L8;
                      }
                    }
                    ((dra) this).field_t = -param1;
                    return;
                  }
                } else {
                  if (((dra) this).field_m == null) {
                    var8 = 0;
                    if (var8 != 0) {
                      if (null != ((dra) this).field_o) {
                        L10: {
                          ((dra) this).field_k.a(true);
                          ((dra) this).field_o = param3;
                          if (param3 != null) {
                            L11: {
                              stackOut_159_0 = ((dra) this).field_k;
                              stackIn_161_0 = stackOut_159_0;
                              stackIn_160_0 = stackOut_159_0;
                              if (param2) {
                                stackOut_161_0 = (hbb) (Object) stackIn_161_0;
                                stackOut_161_1 = 0;
                                stackIn_162_0 = stackOut_161_0;
                                stackIn_162_1 = stackOut_161_1;
                                break L11;
                              } else {
                                stackOut_160_0 = (hbb) (Object) stackIn_160_0;
                                stackOut_160_1 = 1;
                                stackIn_162_0 = stackOut_160_0;
                                stackIn_162_1 = stackOut_160_1;
                                break L11;
                              }
                            }
                            ((hbb) (Object) stackIn_162_0).a(stackIn_162_1 != 0, param3, -1);
                            this.a(((dra) this).field_k, param0, -122, param5);
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        ((dra) this).field_t = param1;
                        return;
                      } else {
                        L12: {
                          ((dra) this).field_o = param3;
                          if (param3 != null) {
                            L13: {
                              stackOut_152_0 = ((dra) this).field_k;
                              stackIn_154_0 = stackOut_152_0;
                              stackIn_153_0 = stackOut_152_0;
                              if (param2) {
                                stackOut_154_0 = (hbb) (Object) stackIn_154_0;
                                stackOut_154_1 = 0;
                                stackIn_155_0 = stackOut_154_0;
                                stackIn_155_1 = stackOut_154_1;
                                break L13;
                              } else {
                                stackOut_153_0 = (hbb) (Object) stackIn_153_0;
                                stackOut_153_1 = 1;
                                stackIn_155_0 = stackOut_153_0;
                                stackIn_155_1 = stackOut_153_1;
                                break L13;
                              }
                            }
                            ((hbb) (Object) stackIn_155_0).a(stackIn_155_1 != 0, param3, -1);
                            this.a(((dra) this).field_k, param0, -122, param5);
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                        ((dra) this).field_t = param1;
                        return;
                      }
                    } else {
                      L14: {
                        if (null != ((dra) this).field_m) {
                          ((dra) this).field_j.a(true);
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      L15: {
                        ((dra) this).field_m = param3;
                        if (param3 == null) {
                          break L15;
                        } else {
                          L16: {
                            stackOut_144_0 = ((dra) this).field_j;
                            stackIn_146_0 = stackOut_144_0;
                            stackIn_145_0 = stackOut_144_0;
                            if (param2) {
                              stackOut_146_0 = (hbb) (Object) stackIn_146_0;
                              stackOut_146_1 = 0;
                              stackIn_147_0 = stackOut_146_0;
                              stackIn_147_1 = stackOut_146_1;
                              break L16;
                            } else {
                              stackOut_145_0 = (hbb) (Object) stackIn_145_0;
                              stackOut_145_1 = 1;
                              stackIn_147_0 = stackOut_145_0;
                              stackIn_147_1 = stackOut_145_1;
                              break L16;
                            }
                          }
                          ((hbb) (Object) stackIn_147_0).a(stackIn_147_1 != 0, param3, -1);
                          this.a(((dra) this).field_j, param0, -117, param5);
                          break L15;
                        }
                      }
                      ((dra) this).field_t = -param1;
                      return;
                    }
                  } else {
                    L17: {
                      if (524288 <= ((dra) this).field_s) {
                        stackOut_111_0 = 0;
                        stackIn_112_0 = stackOut_111_0;
                        break L17;
                      } else {
                        stackOut_110_0 = 1;
                        stackIn_112_0 = stackOut_110_0;
                        break L17;
                      }
                    }
                    var8 = stackIn_112_0;
                    if (var8 != 0) {
                      if (null != ((dra) this).field_o) {
                        L18: {
                          ((dra) this).field_k.a(true);
                          ((dra) this).field_o = param3;
                          if (param3 != null) {
                            L19: {
                              stackOut_132_0 = ((dra) this).field_k;
                              stackIn_134_0 = stackOut_132_0;
                              stackIn_133_0 = stackOut_132_0;
                              if (param2) {
                                stackOut_134_0 = (hbb) (Object) stackIn_134_0;
                                stackOut_134_1 = 0;
                                stackIn_135_0 = stackOut_134_0;
                                stackIn_135_1 = stackOut_134_1;
                                break L19;
                              } else {
                                stackOut_133_0 = (hbb) (Object) stackIn_133_0;
                                stackOut_133_1 = 1;
                                stackIn_135_0 = stackOut_133_0;
                                stackIn_135_1 = stackOut_133_1;
                                break L19;
                              }
                            }
                            ((hbb) (Object) stackIn_135_0).a(stackIn_135_1 != 0, param3, -1);
                            this.a(((dra) this).field_k, param0, -122, param5);
                            break L18;
                          } else {
                            break L18;
                          }
                        }
                        ((dra) this).field_t = param1;
                        return;
                      } else {
                        L20: {
                          ((dra) this).field_o = param3;
                          if (param3 != null) {
                            L21: {
                              stackOut_125_0 = ((dra) this).field_k;
                              stackIn_127_0 = stackOut_125_0;
                              stackIn_126_0 = stackOut_125_0;
                              if (param2) {
                                stackOut_127_0 = (hbb) (Object) stackIn_127_0;
                                stackOut_127_1 = 0;
                                stackIn_128_0 = stackOut_127_0;
                                stackIn_128_1 = stackOut_127_1;
                                break L21;
                              } else {
                                stackOut_126_0 = (hbb) (Object) stackIn_126_0;
                                stackOut_126_1 = 1;
                                stackIn_128_0 = stackOut_126_0;
                                stackIn_128_1 = stackOut_126_1;
                                break L21;
                              }
                            }
                            ((hbb) (Object) stackIn_128_0).a(stackIn_128_1 != 0, param3, -1);
                            this.a(((dra) this).field_k, param0, -122, param5);
                            break L20;
                          } else {
                            break L20;
                          }
                        }
                        ((dra) this).field_t = param1;
                        return;
                      }
                    } else {
                      L22: {
                        if (null != ((dra) this).field_m) {
                          ((dra) this).field_j.a(true);
                          break L22;
                        } else {
                          break L22;
                        }
                      }
                      L23: {
                        ((dra) this).field_m = param3;
                        if (param3 == null) {
                          break L23;
                        } else {
                          L24: {
                            stackOut_117_0 = ((dra) this).field_j;
                            stackIn_119_0 = stackOut_117_0;
                            stackIn_118_0 = stackOut_117_0;
                            if (param2) {
                              stackOut_119_0 = (hbb) (Object) stackIn_119_0;
                              stackOut_119_1 = 0;
                              stackIn_120_0 = stackOut_119_0;
                              stackIn_120_1 = stackOut_119_1;
                              break L24;
                            } else {
                              stackOut_118_0 = (hbb) (Object) stackIn_118_0;
                              stackOut_118_1 = 1;
                              stackIn_120_0 = stackOut_118_0;
                              stackIn_120_1 = stackOut_118_1;
                              break L24;
                            }
                          }
                          ((hbb) (Object) stackIn_120_0).a(stackIn_120_1 != 0, param3, -1);
                          this.a(((dra) this).field_j, param0, -117, param5);
                          break L23;
                        }
                      }
                      ((dra) this).field_t = -param1;
                      return;
                    }
                  }
                }
              } else {
                ((dra) this).field_t = -param1;
                this.a(((dra) this).field_j, param0, -128, param5);
                return;
              }
            } else {
              ((dra) this).field_t = param1;
              this.a(((dra) this).field_k, param0, -116, param5);
              return;
            }
          }
        } else {
          L25: {
            stackOut_1_0 = this;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param2) {
              stackOut_3_0 = this;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L25;
            } else {
              stackOut_2_0 = this;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L25;
            }
          }
          ((dra) this).field_q = stackIn_4_1 != 0;
          var7 = -19 / ((param4 - -81) / 32);
          if (((dra) this).field_o != param3) {
            if (param3 != ((dra) this).field_m) {
              if (null == ((dra) this).field_o) {
                var8 = 1;
                if (var8 != 0) {
                  if (null != ((dra) this).field_o) {
                    L26: {
                      ((dra) this).field_k.a(true);
                      ((dra) this).field_o = param3;
                      if (param3 != null) {
                        L27: {
                          stackOut_74_0 = ((dra) this).field_k;
                          stackIn_76_0 = stackOut_74_0;
                          stackIn_75_0 = stackOut_74_0;
                          if (param2) {
                            stackOut_76_0 = (hbb) (Object) stackIn_76_0;
                            stackOut_76_1 = 0;
                            stackIn_77_0 = stackOut_76_0;
                            stackIn_77_1 = stackOut_76_1;
                            break L27;
                          } else {
                            stackOut_75_0 = (hbb) (Object) stackIn_75_0;
                            stackOut_75_1 = 1;
                            stackIn_77_0 = stackOut_75_0;
                            stackIn_77_1 = stackOut_75_1;
                            break L27;
                          }
                        }
                        ((hbb) (Object) stackIn_77_0).a(stackIn_77_1 != 0, param3, -1);
                        this.a(((dra) this).field_k, param0, -122, param5);
                        break L26;
                      } else {
                        break L26;
                      }
                    }
                    ((dra) this).field_t = param1;
                    return;
                  } else {
                    L28: {
                      ((dra) this).field_o = param3;
                      if (param3 != null) {
                        L29: {
                          stackOut_67_0 = ((dra) this).field_k;
                          stackIn_69_0 = stackOut_67_0;
                          stackIn_68_0 = stackOut_67_0;
                          if (param2) {
                            stackOut_69_0 = (hbb) (Object) stackIn_69_0;
                            stackOut_69_1 = 0;
                            stackIn_70_0 = stackOut_69_0;
                            stackIn_70_1 = stackOut_69_1;
                            break L29;
                          } else {
                            stackOut_68_0 = (hbb) (Object) stackIn_68_0;
                            stackOut_68_1 = 1;
                            stackIn_70_0 = stackOut_68_0;
                            stackIn_70_1 = stackOut_68_1;
                            break L29;
                          }
                        }
                        ((hbb) (Object) stackIn_70_0).a(stackIn_70_1 != 0, param3, -1);
                        this.a(((dra) this).field_k, param0, -122, param5);
                        break L28;
                      } else {
                        break L28;
                      }
                    }
                    ((dra) this).field_t = param1;
                    return;
                  }
                } else {
                  L30: {
                    if (null != ((dra) this).field_m) {
                      ((dra) this).field_j.a(true);
                      break L30;
                    } else {
                      break L30;
                    }
                  }
                  L31: {
                    ((dra) this).field_m = param3;
                    if (param3 == null) {
                      break L31;
                    } else {
                      L32: {
                        stackOut_59_0 = ((dra) this).field_j;
                        stackIn_61_0 = stackOut_59_0;
                        stackIn_60_0 = stackOut_59_0;
                        if (param2) {
                          stackOut_61_0 = (hbb) (Object) stackIn_61_0;
                          stackOut_61_1 = 0;
                          stackIn_62_0 = stackOut_61_0;
                          stackIn_62_1 = stackOut_61_1;
                          break L32;
                        } else {
                          stackOut_60_0 = (hbb) (Object) stackIn_60_0;
                          stackOut_60_1 = 1;
                          stackIn_62_0 = stackOut_60_0;
                          stackIn_62_1 = stackOut_60_1;
                          break L32;
                        }
                      }
                      ((hbb) (Object) stackIn_62_0).a(stackIn_62_1 != 0, param3, -1);
                      this.a(((dra) this).field_j, param0, -117, param5);
                      break L31;
                    }
                  }
                  ((dra) this).field_t = -param1;
                  return;
                }
              } else {
                if (((dra) this).field_m != null) {
                  L33: {
                    if (524288 <= ((dra) this).field_s) {
                      stackOut_32_0 = 0;
                      stackIn_33_0 = stackOut_32_0;
                      break L33;
                    } else {
                      stackOut_31_0 = 1;
                      stackIn_33_0 = stackOut_31_0;
                      break L33;
                    }
                  }
                  L34: {
                    var8 = stackIn_33_0;
                    if (var8 != 0) {
                      L35: {
                        if (null == ((dra) this).field_o) {
                          break L35;
                        } else {
                          ((dra) this).field_k.a(true);
                          break L35;
                        }
                      }
                      L36: {
                        ((dra) this).field_o = param3;
                        if (param3 != null) {
                          L37: {
                            stackOut_47_0 = ((dra) this).field_k;
                            stackIn_49_0 = stackOut_47_0;
                            stackIn_48_0 = stackOut_47_0;
                            if (param2) {
                              stackOut_49_0 = (hbb) (Object) stackIn_49_0;
                              stackOut_49_1 = 0;
                              stackIn_50_0 = stackOut_49_0;
                              stackIn_50_1 = stackOut_49_1;
                              break L37;
                            } else {
                              stackOut_48_0 = (hbb) (Object) stackIn_48_0;
                              stackOut_48_1 = 1;
                              stackIn_50_0 = stackOut_48_0;
                              stackIn_50_1 = stackOut_48_1;
                              break L37;
                            }
                          }
                          ((hbb) (Object) stackIn_50_0).a(stackIn_50_1 != 0, param3, -1);
                          this.a(((dra) this).field_k, param0, -122, param5);
                          break L36;
                        } else {
                          break L36;
                        }
                      }
                      ((dra) this).field_t = param1;
                      break L34;
                    } else {
                      L38: {
                        if (null != ((dra) this).field_m) {
                          ((dra) this).field_j.a(true);
                          break L38;
                        } else {
                          break L38;
                        }
                      }
                      L39: {
                        ((dra) this).field_m = param3;
                        if (param3 == null) {
                          break L39;
                        } else {
                          L40: {
                            stackOut_38_0 = ((dra) this).field_j;
                            stackIn_40_0 = stackOut_38_0;
                            stackIn_39_0 = stackOut_38_0;
                            if (param2) {
                              stackOut_40_0 = (hbb) (Object) stackIn_40_0;
                              stackOut_40_1 = 0;
                              stackIn_41_0 = stackOut_40_0;
                              stackIn_41_1 = stackOut_40_1;
                              break L40;
                            } else {
                              stackOut_39_0 = (hbb) (Object) stackIn_39_0;
                              stackOut_39_1 = 1;
                              stackIn_41_0 = stackOut_39_0;
                              stackIn_41_1 = stackOut_39_1;
                              break L40;
                            }
                          }
                          ((hbb) (Object) stackIn_41_0).a(stackIn_41_1 != 0, param3, -1);
                          this.a(((dra) this).field_j, param0, -117, param5);
                          break L39;
                        }
                      }
                      ((dra) this).field_t = -param1;
                      break L34;
                    }
                  }
                  return;
                } else {
                  L41: {
                    var8 = 0;
                    if (var8 != 0) {
                      L42: {
                        if (null == ((dra) this).field_o) {
                          break L42;
                        } else {
                          ((dra) this).field_k.a(true);
                          break L42;
                        }
                      }
                      L43: {
                        ((dra) this).field_o = param3;
                        if (param3 != null) {
                          L44: {
                            stackOut_24_0 = ((dra) this).field_k;
                            stackIn_26_0 = stackOut_24_0;
                            stackIn_25_0 = stackOut_24_0;
                            if (param2) {
                              stackOut_26_0 = (hbb) (Object) stackIn_26_0;
                              stackOut_26_1 = 0;
                              stackIn_27_0 = stackOut_26_0;
                              stackIn_27_1 = stackOut_26_1;
                              break L44;
                            } else {
                              stackOut_25_0 = (hbb) (Object) stackIn_25_0;
                              stackOut_25_1 = 1;
                              stackIn_27_0 = stackOut_25_0;
                              stackIn_27_1 = stackOut_25_1;
                              break L44;
                            }
                          }
                          ((hbb) (Object) stackIn_27_0).a(stackIn_27_1 != 0, param3, -1);
                          this.a(((dra) this).field_k, param0, -122, param5);
                          break L43;
                        } else {
                          break L43;
                        }
                      }
                      ((dra) this).field_t = param1;
                      break L41;
                    } else {
                      L45: {
                        if (null != ((dra) this).field_m) {
                          ((dra) this).field_j.a(true);
                          break L45;
                        } else {
                          break L45;
                        }
                      }
                      L46: {
                        ((dra) this).field_m = param3;
                        if (param3 == null) {
                          break L46;
                        } else {
                          L47: {
                            stackOut_15_0 = ((dra) this).field_j;
                            stackIn_17_0 = stackOut_15_0;
                            stackIn_16_0 = stackOut_15_0;
                            if (param2) {
                              stackOut_17_0 = (hbb) (Object) stackIn_17_0;
                              stackOut_17_1 = 0;
                              stackIn_18_0 = stackOut_17_0;
                              stackIn_18_1 = stackOut_17_1;
                              break L47;
                            } else {
                              stackOut_16_0 = (hbb) (Object) stackIn_16_0;
                              stackOut_16_1 = 1;
                              stackIn_18_0 = stackOut_16_0;
                              stackIn_18_1 = stackOut_16_1;
                              break L47;
                            }
                          }
                          ((hbb) (Object) stackIn_18_0).a(stackIn_18_1 != 0, param3, -1);
                          this.a(((dra) this).field_j, param0, -117, param5);
                          break L46;
                        }
                      }
                      ((dra) this).field_t = -param1;
                      break L41;
                    }
                  }
                  return;
                }
              }
            } else {
              ((dra) this).field_t = -param1;
              this.a(((dra) this).field_j, param0, -128, param5);
              return;
            }
          } else {
            ((dra) this).field_t = param1;
            this.a(((dra) this).field_k, param0, -116, param5);
            return;
          }
        }
    }

    public static void c(int param0) {
        field_v = null;
        if (param0 <= 37) {
            field_v = null;
        }
    }

    dra(hbb param0, hbb param1, hbb param2) {
        ((dra) this).field_u = 0;
        ((dra) this).field_h = 256;
        ((dra) this).field_i = false;
        this.a(-93, param0, param1);
        ((dra) this).field_l = param2;
    }

    static {
    }
}
