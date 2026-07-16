/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg extends in {
    static String field_t;
    private int[] field_w;
    private int[] field_q;
    static int field_l;
    static String field_G;
    private i field_x;
    private int field_r;
    private sc field_B;
    static String field_z;
    private sc field_E;
    static String field_p;
    private int field_v;
    private sc field_u;
    private int field_k;
    private i field_A;
    static String field_s;
    private int field_C;
    private boolean field_n;
    private boolean field_o;
    private i field_m;
    static int field_y;
    static String field_F;

    final static km d(int param0) {
        if (param0 != 1048576) {
            return null;
        }
        return hj.c(112);
    }

    final static void a(int param0, int param1, boolean param2) {
        gh var3 = null;
        dj var4 = null;
        String var5_ref_String = null;
        int var5 = 0;
        int var6 = 0;
        var3 = gk.a((byte) -100, param0, param2);
        if (param1 > -16) {
          L0: {
            field_G = null;
            if (var3 == null) {
              break L0;
            } else {
              md.field_e.a(false, (byte) -99);
              var4 = md.field_e;
              var5_ref_String = hm.field_a;
              var4.field_a.a(1, var5_ref_String, 5);
              var4 = md.field_e;
              var5 = ii.field_b;
              var6 = a.field_y;
              var4.field_a.a(0, 0, 0, var5, var6);
              break L0;
            }
          }
          qm.a(param0, param2, (byte) 115);
          return;
        } else {
          L1: {
            if (var3 == null) {
              break L1;
            } else {
              md.field_e.a(false, (byte) -99);
              var4 = md.field_e;
              var5_ref_String = hm.field_a;
              var4.field_a.a(1, var5_ref_String, 5);
              var4 = md.field_e;
              var5 = ii.field_b;
              var6 = a.field_y;
              var4.field_a.a(0, 0, 0, var5, var6);
              break L1;
            }
          }
          qm.a(param0, param2, (byte) 115);
          return;
        }
    }

    private final void a(int param0, byte param1, int param2, i param3) {
        param3.a(param0, true, -1);
        param3.c(-128, param2);
        if (param1 > -85) {
            boolean discarded$0 = eg.b((byte) -72);
            return;
        }
    }

    final synchronized void a(byte param0, int param1) {
        if (param0 <= 68) {
            field_F = null;
            ((eg) this).field_C = param1;
            return;
        }
        ((eg) this).field_C = param1;
    }

    final static mg a(int param0, byte param1, int param2) {
        mg var3 = null;
        int var4 = 0;
        int var5 = 0;
        mg var6 = null;
        var5 = Virogrid.field_F ? 1 : 0;
        var6 = new mg(param0, param0);
        var3 = var6;
        var4 = 0;
        if (param1 > 13) {
          L0: while (true) {
            if (var3.field_B.length <= var4) {
              return var3;
            } else {
              var6.field_B[var4] = param2;
              var4++;
              continue L0;
            }
          }
        } else {
          return null;
        }
    }

    final void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_34_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_88_0 = 0;
        int stackIn_102_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_117_0 = 0;
        int stackIn_133_0 = 0;
        int stackIn_142_0 = 0;
        int stackIn_155_0 = 0;
        int stackIn_162_0 = 0;
        int stackIn_174_0 = 0;
        int stackIn_182_0 = 0;
        int stackIn_189_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_87_0 = 0;
        int stackOut_86_0 = 0;
        int stackOut_80_0 = 0;
        int stackOut_79_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_141_0 = 0;
        int stackOut_140_0 = 0;
        int stackOut_154_0 = 0;
        int stackOut_153_0 = 0;
        int stackOut_161_0 = 0;
        int stackOut_160_0 = 0;
        int stackOut_188_0 = 0;
        int stackOut_187_0 = 0;
        int stackOut_181_0 = 0;
        int stackOut_180_0 = 0;
        int stackOut_173_0 = 0;
        int stackOut_172_0 = 0;
        int stackOut_132_0 = 0;
        int stackOut_131_0 = 0;
        int stackOut_116_0 = 0;
        int stackOut_115_0 = 0;
        int stackOut_109_0 = 0;
        int stackOut_108_0 = 0;
        int stackOut_101_0 = 0;
        int stackOut_100_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        var11 = Virogrid.field_F ? 1 : 0;
        if (-1 <= ((eg) this).field_C) {
          ((eg) this).a(param2);
          return;
        } else {
          L0: {
            if (((eg) this).field_n) {
              if (-1 < ((eg) this).field_r) {
                if (!((eg) this).field_A.d(115)) {
                  ((eg) this).field_B = null;
                  ((eg) this).field_n = false;
                  ((eg) this).field_r = -((eg) this).field_r;
                  break L0;
                } else {
                  if ((((eg) this).field_r ^ -1) <= -1) {
                    break L0;
                  } else {
                    if (((eg) this).field_x.d(111)) {
                      break L0;
                    } else {
                      ((eg) this).field_r = -((eg) this).field_r;
                      ((eg) this).field_u = null;
                      ((eg) this).field_n = false;
                      break L0;
                    }
                  }
                }
              } else {
                if ((((eg) this).field_r ^ -1) <= -1) {
                  break L0;
                } else {
                  if (((eg) this).field_x.d(111)) {
                    break L0;
                  } else {
                    ((eg) this).field_r = -((eg) this).field_r;
                    ((eg) this).field_u = null;
                    ((eg) this).field_n = false;
                    break L0;
                  }
                }
              }
            } else {
              break L0;
            }
          }
          L1: {
            var4 = (((eg) this).field_k >> -1187872660) * ((eg) this).field_C / 256;
            var5 = -var4 + ((eg) this).field_C;
            if (((eg) this).field_r != 0) {
              ((eg) this).field_k = ((eg) this).field_k + ((eg) this).field_r * param2;
              if (1048576 > ((eg) this).field_k) {
                if (-1 > (((eg) this).field_k ^ -1)) {
                  break L1;
                } else {
                  ((eg) this).field_k = 0;
                  if (((eg) this).field_n) {
                    break L1;
                  } else {
                    ((eg) this).field_r = 0;
                    if (!((eg) this).field_o) {
                      L2: {
                        if (null != ((eg) this).field_B) {
                          ((eg) this).field_A.c(false);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      ((eg) this).field_B = null;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              } else {
                ((eg) this).field_k = 1048576;
                if (((eg) this).field_n) {
                  break L1;
                } else {
                  ((eg) this).field_r = 0;
                  if (((eg) this).field_o) {
                    break L1;
                  } else {
                    L3: {
                      if (((eg) this).field_u == null) {
                        break L3;
                      } else {
                        ((eg) this).field_x.c(false);
                        break L3;
                      }
                    }
                    ((eg) this).field_u = null;
                    break L1;
                  }
                }
              }
            } else {
              break L1;
            }
          }
          L4: {
            if (!ua.field_q) {
              stackOut_33_0 = param2;
              stackIn_34_0 = stackOut_33_0;
              break L4;
            } else {
              stackOut_32_0 = param2 << 789208193;
              stackIn_34_0 = stackOut_32_0;
              break L4;
            }
          }
          var6 = stackIn_34_0;
          if (((eg) this).field_v < 256) {
            L5: {
              if (((eg) this).field_B != null) {
                break L5;
              } else {
                if (((eg) this).field_u != null) {
                  break L5;
                } else {
                  if (((eg) this).field_E != null) {
                    if (((eg) this).field_v != 0) {
                      if (((eg) this).field_w != null) {
                        if (((eg) this).field_w.length < var6) {
                          L6: {
                            ((eg) this).field_q = new int[var6];
                            ((eg) this).field_w = new int[var6];
                            ((eg) this).field_m.b(((eg) this).field_w, 0, param2);
                            if (!ua.field_q) {
                              stackOut_87_0 = param1;
                              stackIn_88_0 = stackOut_87_0;
                              break L6;
                            } else {
                              param1 = param1 << 1;
                              stackOut_86_0 = param1 << 1;
                              stackIn_88_0 = stackOut_86_0;
                              break L6;
                            }
                          }
                          var7 = stackIn_88_0;
                          var8 = ((eg) this).field_v * ((eg) this).field_C / 256;
                          var9 = -var8 + ((eg) this).field_C;
                          var10 = 0;
                          L7: while (true) {
                            if (var6 <= var10) {
                              return;
                            } else {
                              param0[var7 - -var10] = param0[var7 + var10] * var9 - -(var8 * ((eg) this).field_w[var10]) >> 391405160;
                              var10++;
                              continue L7;
                            }
                          }
                        } else {
                          L8: {
                            ek.a(((eg) this).field_w, 0, var6);
                            ((eg) this).field_m.b(((eg) this).field_w, 0, param2);
                            if (!ua.field_q) {
                              stackOut_80_0 = param1;
                              stackIn_81_0 = stackOut_80_0;
                              break L8;
                            } else {
                              param1 = param1 << 1;
                              stackOut_79_0 = param1 << 1;
                              stackIn_81_0 = stackOut_79_0;
                              break L8;
                            }
                          }
                          var7 = stackIn_81_0;
                          var8 = ((eg) this).field_v * ((eg) this).field_C / 256;
                          var9 = -var8 + ((eg) this).field_C;
                          var10 = 0;
                          L9: while (true) {
                            if (var6 <= var10) {
                              return;
                            } else {
                              param0[var7 - -var10] = param0[var7 + var10] * var9 - -(var8 * ((eg) this).field_w[var10]) >> 391405160;
                              var10++;
                              continue L9;
                            }
                          }
                        }
                      } else {
                        L10: {
                          ((eg) this).field_q = new int[var6];
                          ((eg) this).field_w = new int[var6];
                          ((eg) this).field_m.b(((eg) this).field_w, 0, param2);
                          if (!ua.field_q) {
                            stackOut_72_0 = param1;
                            stackIn_73_0 = stackOut_72_0;
                            break L10;
                          } else {
                            param1 = param1 << 1;
                            stackOut_71_0 = param1 << 1;
                            stackIn_73_0 = stackOut_71_0;
                            break L10;
                          }
                        }
                        var7 = stackIn_73_0;
                        var8 = ((eg) this).field_v * ((eg) this).field_C / 256;
                        var9 = -var8 + ((eg) this).field_C;
                        var10 = 0;
                        L11: while (true) {
                          if (var6 <= var10) {
                            return;
                          } else {
                            param0[var7 - -var10] = param0[var7 + var10] * var9 - -(var8 * ((eg) this).field_w[var10]) >> 391405160;
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
            if (-257 != (var4 ^ -1)) {
              if (256 != var5) {
                L12: {
                  if (null == ((eg) this).field_w) {
                    break L12;
                  } else {
                    if (((eg) this).field_w.length < var6) {
                      break L12;
                    } else {
                      L13: {
                        ek.a(((eg) this).field_w, 0, var6);
                        ek.a(((eg) this).field_q, 0, var6);
                        ((eg) this).field_A.b(((eg) this).field_w, 0, param2);
                        ((eg) this).field_x.b(((eg) this).field_q, 0, param2);
                        if (!ua.field_q) {
                          stackOut_141_0 = param1;
                          stackIn_142_0 = stackOut_141_0;
                          break L13;
                        } else {
                          param1 = param1 << 1;
                          stackOut_140_0 = param1 << 1;
                          stackIn_142_0 = stackOut_140_0;
                          break L13;
                        }
                      }
                      var7 = stackIn_142_0;
                      var8 = 0;
                      L14: while (true) {
                        if (var6 <= var8) {
                          L15: {
                            if (((eg) this).field_E == null) {
                              break L15;
                            } else {
                              if (((eg) this).field_v == 0) {
                                break L15;
                              } else {
                                L16: {
                                  L17: {
                                    if (((eg) this).field_w == null) {
                                      break L17;
                                    } else {
                                      if (((eg) this).field_w.length >= var6) {
                                        ek.a(((eg) this).field_w, 0, var6);
                                        break L16;
                                      } else {
                                        break L17;
                                      }
                                    }
                                  }
                                  ((eg) this).field_q = new int[var6];
                                  ((eg) this).field_w = new int[var6];
                                  break L16;
                                }
                                L18: {
                                  ((eg) this).field_m.b(((eg) this).field_w, 0, param2);
                                  if (!ua.field_q) {
                                    stackOut_154_0 = param1;
                                    stackIn_155_0 = stackOut_154_0;
                                    break L18;
                                  } else {
                                    param1 = param1 << 1;
                                    stackOut_153_0 = param1 << 1;
                                    stackIn_155_0 = stackOut_153_0;
                                    break L18;
                                  }
                                }
                                var7 = stackIn_155_0;
                                var8 = ((eg) this).field_v * ((eg) this).field_C / 256;
                                var9 = -var8 + ((eg) this).field_C;
                                var10 = 0;
                                L19: while (true) {
                                  if (var6 <= var10) {
                                    break L15;
                                  } else {
                                    param0[var7 - -var10] = param0[var7 + var10] * var9 - -(var8 * ((eg) this).field_w[var10]) >> 391405160;
                                    var10++;
                                    continue L19;
                                  }
                                }
                              }
                            }
                          }
                          return;
                        } else {
                          param0[var7 + var8] = param0[var7 + var8] + (var5 * ((eg) this).field_q[var8] + var4 * ((eg) this).field_w[var8] >> 177966184);
                          var8++;
                          continue L14;
                        }
                      }
                    }
                  }
                }
                L20: {
                  ((eg) this).field_q = new int[var6];
                  ((eg) this).field_w = new int[var6];
                  ((eg) this).field_A.b(((eg) this).field_w, 0, param2);
                  ((eg) this).field_x.b(((eg) this).field_q, 0, param2);
                  if (!ua.field_q) {
                    stackOut_161_0 = param1;
                    stackIn_162_0 = stackOut_161_0;
                    break L20;
                  } else {
                    param1 = param1 << 1;
                    stackOut_160_0 = param1 << 1;
                    stackIn_162_0 = stackOut_160_0;
                    break L20;
                  }
                }
                var7 = stackIn_162_0;
                var8 = 0;
                L21: while (true) {
                  if (var6 <= var8) {
                    if (((eg) this).field_E != null) {
                      if (((eg) this).field_v != 0) {
                        if (((eg) this).field_w != null) {
                          if (((eg) this).field_w.length < var6) {
                            L22: {
                              ((eg) this).field_q = new int[var6];
                              ((eg) this).field_w = new int[var6];
                              ((eg) this).field_m.b(((eg) this).field_w, 0, param2);
                              if (!ua.field_q) {
                                stackOut_188_0 = param1;
                                stackIn_189_0 = stackOut_188_0;
                                break L22;
                              } else {
                                param1 = param1 << 1;
                                stackOut_187_0 = param1 << 1;
                                stackIn_189_0 = stackOut_187_0;
                                break L22;
                              }
                            }
                            var7 = stackIn_189_0;
                            var8 = ((eg) this).field_v * ((eg) this).field_C / 256;
                            var9 = -var8 + ((eg) this).field_C;
                            var10 = 0;
                            L23: while (true) {
                              if (var6 <= var10) {
                                return;
                              } else {
                                param0[var7 - -var10] = param0[var7 + var10] * var9 - -(var8 * ((eg) this).field_w[var10]) >> 391405160;
                                var10++;
                                continue L23;
                              }
                            }
                          } else {
                            L24: {
                              ek.a(((eg) this).field_w, 0, var6);
                              ((eg) this).field_m.b(((eg) this).field_w, 0, param2);
                              if (!ua.field_q) {
                                stackOut_181_0 = param1;
                                stackIn_182_0 = stackOut_181_0;
                                break L24;
                              } else {
                                param1 = param1 << 1;
                                stackOut_180_0 = param1 << 1;
                                stackIn_182_0 = stackOut_180_0;
                                break L24;
                              }
                            }
                            var7 = stackIn_182_0;
                            var8 = ((eg) this).field_v * ((eg) this).field_C / 256;
                            var9 = -var8 + ((eg) this).field_C;
                            var10 = 0;
                            L25: while (true) {
                              if (var6 <= var10) {
                                return;
                              } else {
                                param0[var7 - -var10] = param0[var7 + var10] * var9 - -(var8 * ((eg) this).field_w[var10]) >> 391405160;
                                var10++;
                                continue L25;
                              }
                            }
                          }
                        } else {
                          L26: {
                            ((eg) this).field_q = new int[var6];
                            ((eg) this).field_w = new int[var6];
                            ((eg) this).field_m.b(((eg) this).field_w, 0, param2);
                            if (!ua.field_q) {
                              stackOut_173_0 = param1;
                              stackIn_174_0 = stackOut_173_0;
                              break L26;
                            } else {
                              param1 = param1 << 1;
                              stackOut_172_0 = param1 << 1;
                              stackIn_174_0 = stackOut_172_0;
                              break L26;
                            }
                          }
                          var7 = stackIn_174_0;
                          var8 = ((eg) this).field_v * ((eg) this).field_C / 256;
                          var9 = -var8 + ((eg) this).field_C;
                          var10 = 0;
                          L27: while (true) {
                            if (var6 <= var10) {
                              return;
                            } else {
                              param0[var7 - -var10] = param0[var7 + var10] * var9 - -(var8 * ((eg) this).field_w[var10]) >> 391405160;
                              var10++;
                              continue L27;
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
                    param0[var7 + var8] = param0[var7 + var8] + (var5 * ((eg) this).field_q[var8] + var4 * ((eg) this).field_w[var8] >> 177966184);
                    var8++;
                    continue L21;
                  }
                }
              } else {
                L28: {
                  ((eg) this).field_x.b(param0, param1, param2);
                  if (((eg) this).field_E == null) {
                    break L28;
                  } else {
                    if (((eg) this).field_v == 0) {
                      break L28;
                    } else {
                      L29: {
                        L30: {
                          if (((eg) this).field_w == null) {
                            break L30;
                          } else {
                            if (((eg) this).field_w.length >= var6) {
                              ek.a(((eg) this).field_w, 0, var6);
                              break L29;
                            } else {
                              break L30;
                            }
                          }
                        }
                        ((eg) this).field_q = new int[var6];
                        ((eg) this).field_w = new int[var6];
                        break L29;
                      }
                      L31: {
                        ((eg) this).field_m.b(((eg) this).field_w, 0, param2);
                        if (!ua.field_q) {
                          stackOut_132_0 = param1;
                          stackIn_133_0 = stackOut_132_0;
                          break L31;
                        } else {
                          param1 = param1 << 1;
                          stackOut_131_0 = param1 << 1;
                          stackIn_133_0 = stackOut_131_0;
                          break L31;
                        }
                      }
                      var7 = stackIn_133_0;
                      var8 = ((eg) this).field_v * ((eg) this).field_C / 256;
                      var9 = -var8 + ((eg) this).field_C;
                      var10 = 0;
                      L32: while (true) {
                        if (var6 <= var10) {
                          break L28;
                        } else {
                          param0[var7 - -var10] = param0[var7 + var10] * var9 - -(var8 * ((eg) this).field_w[var10]) >> 391405160;
                          var10++;
                          continue L32;
                        }
                      }
                    }
                  }
                }
                return;
              }
            } else {
              ((eg) this).field_A.b(param0, param1, param2);
              if (((eg) this).field_E != null) {
                if (((eg) this).field_v != 0) {
                  if (((eg) this).field_w != null) {
                    if (((eg) this).field_w.length >= var6) {
                      L33: {
                        ek.a(((eg) this).field_w, 0, var6);
                        ((eg) this).field_m.b(((eg) this).field_w, 0, param2);
                        if (!ua.field_q) {
                          stackOut_116_0 = param1;
                          stackIn_117_0 = stackOut_116_0;
                          break L33;
                        } else {
                          param1 = param1 << 1;
                          stackOut_115_0 = param1 << 1;
                          stackIn_117_0 = stackOut_115_0;
                          break L33;
                        }
                      }
                      var7 = stackIn_117_0;
                      var8 = ((eg) this).field_v * ((eg) this).field_C / 256;
                      var9 = -var8 + ((eg) this).field_C;
                      var10 = 0;
                      L34: while (true) {
                        if (var6 <= var10) {
                          return;
                        } else {
                          param0[var7 - -var10] = param0[var7 + var10] * var9 - -(var8 * ((eg) this).field_w[var10]) >> 391405160;
                          var10++;
                          continue L34;
                        }
                      }
                    } else {
                      L35: {
                        ((eg) this).field_q = new int[var6];
                        ((eg) this).field_w = new int[var6];
                        ((eg) this).field_m.b(((eg) this).field_w, 0, param2);
                        if (!ua.field_q) {
                          stackOut_109_0 = param1;
                          stackIn_110_0 = stackOut_109_0;
                          break L35;
                        } else {
                          param1 = param1 << 1;
                          stackOut_108_0 = param1 << 1;
                          stackIn_110_0 = stackOut_108_0;
                          break L35;
                        }
                      }
                      var7 = stackIn_110_0;
                      var8 = ((eg) this).field_v * ((eg) this).field_C / 256;
                      var9 = -var8 + ((eg) this).field_C;
                      var10 = 0;
                      L36: while (true) {
                        if (var6 <= var10) {
                          return;
                        } else {
                          param0[var7 - -var10] = param0[var7 + var10] * var9 - -(var8 * ((eg) this).field_w[var10]) >> 391405160;
                          var10++;
                          continue L36;
                        }
                      }
                    }
                  } else {
                    L37: {
                      ((eg) this).field_q = new int[var6];
                      ((eg) this).field_w = new int[var6];
                      ((eg) this).field_m.b(((eg) this).field_w, 0, param2);
                      if (!ua.field_q) {
                        stackOut_101_0 = param1;
                        stackIn_102_0 = stackOut_101_0;
                        break L37;
                      } else {
                        param1 = param1 << 1;
                        stackOut_100_0 = param1 << 1;
                        stackIn_102_0 = stackOut_100_0;
                        break L37;
                      }
                    }
                    var7 = stackIn_102_0;
                    var8 = ((eg) this).field_v * ((eg) this).field_C / 256;
                    var9 = -var8 + ((eg) this).field_C;
                    var10 = 0;
                    L38: while (true) {
                      if (var6 <= var10) {
                        return;
                      } else {
                        param0[var7 - -var10] = param0[var7 + var10] * var9 - -(var8 * ((eg) this).field_w[var10]) >> 391405160;
                        var10++;
                        continue L38;
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
          } else {
            if (((eg) this).field_E != null) {
              if (((eg) this).field_v != 0) {
                if (((eg) this).field_w != null) {
                  if (((eg) this).field_w.length < var6) {
                    L39: {
                      ((eg) this).field_q = new int[var6];
                      ((eg) this).field_w = new int[var6];
                      ((eg) this).field_m.b(((eg) this).field_w, 0, param2);
                      if (!ua.field_q) {
                        stackOut_57_0 = param1;
                        stackIn_58_0 = stackOut_57_0;
                        break L39;
                      } else {
                        param1 = param1 << 1;
                        stackOut_56_0 = param1 << 1;
                        stackIn_58_0 = stackOut_56_0;
                        break L39;
                      }
                    }
                    var7 = stackIn_58_0;
                    var8 = ((eg) this).field_v * ((eg) this).field_C / 256;
                    var9 = -var8 + ((eg) this).field_C;
                    var10 = 0;
                    L40: while (true) {
                      if (var6 <= var10) {
                        return;
                      } else {
                        param0[var7 - -var10] = param0[var7 + var10] * var9 - -(var8 * ((eg) this).field_w[var10]) >> 391405160;
                        var10++;
                        continue L40;
                      }
                    }
                  } else {
                    L41: {
                      ek.a(((eg) this).field_w, 0, var6);
                      ((eg) this).field_m.b(((eg) this).field_w, 0, param2);
                      if (!ua.field_q) {
                        stackOut_50_0 = param1;
                        stackIn_51_0 = stackOut_50_0;
                        break L41;
                      } else {
                        param1 = param1 << 1;
                        stackOut_49_0 = param1 << 1;
                        stackIn_51_0 = stackOut_49_0;
                        break L41;
                      }
                    }
                    var7 = stackIn_51_0;
                    var8 = ((eg) this).field_v * ((eg) this).field_C / 256;
                    var9 = -var8 + ((eg) this).field_C;
                    var10 = 0;
                    L42: while (true) {
                      if (var6 <= var10) {
                        return;
                      } else {
                        param0[var7 - -var10] = param0[var7 + var10] * var9 - -(var8 * ((eg) this).field_w[var10]) >> 391405160;
                        var10++;
                        continue L42;
                      }
                    }
                  }
                } else {
                  L43: {
                    ((eg) this).field_q = new int[var6];
                    ((eg) this).field_w = new int[var6];
                    ((eg) this).field_m.b(((eg) this).field_w, 0, param2);
                    if (!ua.field_q) {
                      stackOut_42_0 = param1;
                      stackIn_43_0 = stackOut_42_0;
                      break L43;
                    } else {
                      param1 = param1 << 1;
                      stackOut_41_0 = param1 << 1;
                      stackIn_43_0 = stackOut_41_0;
                      break L43;
                    }
                  }
                  var7 = stackIn_43_0;
                  var8 = ((eg) this).field_v * ((eg) this).field_C / 256;
                  var9 = -var8 + ((eg) this).field_C;
                  var10 = 0;
                  L44: while (true) {
                    if (var6 <= var10) {
                      return;
                    } else {
                      param0[var7 - -var10] = param0[var7 + var10] * var9 - -(var8 * ((eg) this).field_w[var10]) >> 391405160;
                      var10++;
                      continue L44;
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

    final static boolean a(byte param0) {
        if (param0 != 47) {
            return true;
        }
        return rk.field_f;
    }

    final in b() {
        return null;
    }

    final in c() {
        return null;
    }

    final synchronized int d() {
        return 2;
    }

    final static wf a(java.awt.Component param0, int param1, int param2, int param3) {
        try {
            int var4 = 0;
            Throwable var5 = null;
            Class var5_ref = null;
            gd var6 = null;
            wf var6_ref = null;
            wf stackIn_2_0 = null;
            Throwable decompiledCaughtException = null;
            wf stackOut_1_0 = null;
            var4 = -32 % ((param3 - -6) / 37);
            try {
              L0: {
                var5_ref = Class.forName("n");
                var6_ref = (wf) var5_ref.newInstance();
                var6_ref.a(param2, param1, (byte) -56, param0);
                stackOut_1_0 = (wf) var6_ref;
                stackIn_2_0 = stackOut_1_0;
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = decompiledCaughtException;
              var6 = new gd();
              ((wf) (Object) var6).a(param2, param1, (byte) -66, param0);
              return (wf) (Object) var6;
            }
            return stackIn_2_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void c(int param0) {
        field_t = null;
        field_G = null;
        if (param0 >= -43) {
            return;
        }
        field_z = null;
        field_s = null;
        field_F = null;
        field_p = null;
    }

    final synchronized void a(sc param0, int param1, int param2, boolean param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        i stackIn_17_0 = null;
        i stackIn_18_0 = null;
        i stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        i stackIn_27_0 = null;
        i stackIn_28_0 = null;
        i stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int stackIn_36_0 = 0;
        i stackIn_41_0 = null;
        i stackIn_42_0 = null;
        i stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        i stackIn_51_0 = null;
        i stackIn_52_0 = null;
        i stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        i stackIn_63_0 = null;
        i stackIn_64_0 = null;
        i stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        i stackIn_70_0 = null;
        i stackIn_71_0 = null;
        i stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        i stackIn_76_0 = null;
        i stackIn_77_0 = null;
        i stackIn_78_0 = null;
        int stackIn_78_1 = 0;
        Object stackIn_83_0 = null;
        Object stackIn_84_0 = null;
        Object stackIn_85_0 = null;
        int stackIn_85_1 = 0;
        i stackIn_99_0 = null;
        int stackIn_99_1 = 0;
        i stackIn_108_0 = null;
        int stackIn_108_1 = 0;
        int stackIn_115_0 = 0;
        i stackIn_121_0 = null;
        int stackIn_121_1 = 0;
        i stackIn_130_0 = null;
        int stackIn_130_1 = 0;
        i stackIn_140_0 = null;
        i stackIn_141_0 = null;
        i stackIn_142_0 = null;
        int stackIn_142_1 = 0;
        i stackIn_147_0 = null;
        i stackIn_148_0 = null;
        i stackIn_149_0 = null;
        int stackIn_149_1 = 0;
        i stackIn_153_0 = null;
        i stackIn_154_0 = null;
        i stackIn_155_0 = null;
        int stackIn_155_1 = 0;
        Object stackOut_82_0 = null;
        Object stackOut_84_0 = null;
        int stackOut_84_1 = 0;
        Object stackOut_83_0 = null;
        int stackOut_83_1 = 0;
        i stackOut_152_0 = null;
        i stackOut_154_0 = null;
        int stackOut_154_1 = 0;
        i stackOut_153_0 = null;
        int stackOut_153_1 = 0;
        i stackOut_146_0 = null;
        i stackOut_148_0 = null;
        int stackOut_148_1 = 0;
        i stackOut_147_0 = null;
        int stackOut_147_1 = 0;
        i stackOut_139_0 = null;
        i stackOut_141_0 = null;
        int stackOut_141_1 = 0;
        i stackOut_140_0 = null;
        int stackOut_140_1 = 0;
        int stackOut_114_0 = 0;
        int stackOut_113_0 = 0;
        i stackOut_128_0 = null;
        int stackOut_128_1 = 0;
        i stackOut_119_0 = null;
        int stackOut_119_1 = 0;
        i stackOut_106_0 = null;
        int stackOut_106_1 = 0;
        i stackOut_97_0 = null;
        int stackOut_97_1 = 0;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        i stackOut_75_0 = null;
        i stackOut_77_0 = null;
        int stackOut_77_1 = 0;
        i stackOut_76_0 = null;
        int stackOut_76_1 = 0;
        i stackOut_69_0 = null;
        i stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        i stackOut_70_0 = null;
        int stackOut_70_1 = 0;
        i stackOut_62_0 = null;
        i stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        i stackOut_63_0 = null;
        int stackOut_63_1 = 0;
        int stackOut_35_0 = 0;
        int stackOut_34_0 = 0;
        i stackOut_50_0 = null;
        i stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        i stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        i stackOut_40_0 = null;
        i stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        i stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        i stackOut_26_0 = null;
        i stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        i stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        i stackOut_16_0 = null;
        i stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        i stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        var8 = Virogrid.field_F ? 1 : 0;
        if (((eg) this).field_n) {
          if (param3) {
            if ((((eg) this).field_r ^ -1) >= -1) {
              L0: {
                if (((eg) this).field_u != null) {
                  ((eg) this).field_x.c(false);
                  break L0;
                } else {
                  break L0;
                }
              }
              ((eg) this).field_u = param0;
              if (param0 == null) {
                return;
              } else {
                ((eg) this).field_x.a(false, 37, param0);
                this.a(param1, (byte) -108, param4, ((eg) this).field_x);
                return;
              }
            } else {
              L1: {
                if (((eg) this).field_B == null) {
                  break L1;
                } else {
                  ((eg) this).field_A.c(false);
                  break L1;
                }
              }
              ((eg) this).field_B = param0;
              if (param0 != null) {
                ((eg) this).field_A.a(false, 37, param0);
                this.a(param1, (byte) -107, param4, ((eg) this).field_A);
                return;
              } else {
                return;
              }
            }
          } else {
            L2: {
              stackOut_82_0 = this;
              stackIn_84_0 = stackOut_82_0;
              stackIn_83_0 = stackOut_82_0;
              if (!param3) {
                stackOut_84_0 = this;
                stackOut_84_1 = 0;
                stackIn_85_0 = stackOut_84_0;
                stackIn_85_1 = stackOut_84_1;
                break L2;
              } else {
                stackOut_83_0 = this;
                stackOut_83_1 = 1;
                stackIn_85_0 = stackOut_83_0;
                stackIn_85_1 = stackOut_83_1;
                break L2;
              }
            }
            ((eg) this).field_n = stackIn_85_1 != 0;
            if (param5 > 119) {
              if (((eg) this).field_B != param0) {
                if (param0 != ((eg) this).field_u) {
                  if (null != ((eg) this).field_B) {
                    if (null == ((eg) this).field_u) {
                      var7 = 0;
                      if (var7 == 0) {
                        if (null != ((eg) this).field_u) {
                          L3: {
                            ((eg) this).field_x.c(false);
                            ((eg) this).field_u = param0;
                            if (param0 == null) {
                              break L3;
                            } else {
                              L4: {
                                stackOut_152_0 = ((eg) this).field_x;
                                stackIn_154_0 = stackOut_152_0;
                                stackIn_153_0 = stackOut_152_0;
                                if (param3) {
                                  stackOut_154_0 = (i) (Object) stackIn_154_0;
                                  stackOut_154_1 = 0;
                                  stackIn_155_0 = stackOut_154_0;
                                  stackIn_155_1 = stackOut_154_1;
                                  break L4;
                                } else {
                                  stackOut_153_0 = (i) (Object) stackIn_153_0;
                                  stackOut_153_1 = 1;
                                  stackIn_155_0 = stackOut_153_0;
                                  stackIn_155_1 = stackOut_153_1;
                                  break L4;
                                }
                              }
                              ((i) (Object) stackIn_155_0).a(stackIn_155_1 != 0, 37, param0);
                              this.a(param1, (byte) -124, param4, ((eg) this).field_x);
                              break L3;
                            }
                          }
                          ((eg) this).field_r = -param2;
                          return;
                        } else {
                          L5: {
                            ((eg) this).field_u = param0;
                            if (param0 == null) {
                              break L5;
                            } else {
                              L6: {
                                stackOut_146_0 = ((eg) this).field_x;
                                stackIn_148_0 = stackOut_146_0;
                                stackIn_147_0 = stackOut_146_0;
                                if (param3) {
                                  stackOut_148_0 = (i) (Object) stackIn_148_0;
                                  stackOut_148_1 = 0;
                                  stackIn_149_0 = stackOut_148_0;
                                  stackIn_149_1 = stackOut_148_1;
                                  break L6;
                                } else {
                                  stackOut_147_0 = (i) (Object) stackIn_147_0;
                                  stackOut_147_1 = 1;
                                  stackIn_149_0 = stackOut_147_0;
                                  stackIn_149_1 = stackOut_147_1;
                                  break L6;
                                }
                              }
                              ((i) (Object) stackIn_149_0).a(stackIn_149_1 != 0, 37, param0);
                              this.a(param1, (byte) -124, param4, ((eg) this).field_x);
                              break L5;
                            }
                          }
                          ((eg) this).field_r = -param2;
                          return;
                        }
                      } else {
                        L7: {
                          if (null != ((eg) this).field_B) {
                            ((eg) this).field_A.c(false);
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        L8: {
                          ((eg) this).field_B = param0;
                          if (param0 != null) {
                            L9: {
                              stackOut_139_0 = ((eg) this).field_A;
                              stackIn_141_0 = stackOut_139_0;
                              stackIn_140_0 = stackOut_139_0;
                              if (param3) {
                                stackOut_141_0 = (i) (Object) stackIn_141_0;
                                stackOut_141_1 = 0;
                                stackIn_142_0 = stackOut_141_0;
                                stackIn_142_1 = stackOut_141_1;
                                break L9;
                              } else {
                                stackOut_140_0 = (i) (Object) stackIn_140_0;
                                stackOut_140_1 = 1;
                                stackIn_142_0 = stackOut_140_0;
                                stackIn_142_1 = stackOut_140_1;
                                break L9;
                              }
                            }
                            ((i) (Object) stackIn_142_0).a(stackIn_142_1 != 0, 37, param0);
                            this.a(param1, (byte) -86, param4, ((eg) this).field_A);
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        ((eg) this).field_r = param2;
                        return;
                      }
                    } else {
                      L10: {
                        if ((((eg) this).field_k ^ -1) <= -524289) {
                          stackOut_114_0 = 0;
                          stackIn_115_0 = stackOut_114_0;
                          break L10;
                        } else {
                          stackOut_113_0 = 1;
                          stackIn_115_0 = stackOut_113_0;
                          break L10;
                        }
                      }
                      L11: {
                        var7 = stackIn_115_0;
                        if (var7 != 0) {
                          L12: {
                            if (null != ((eg) this).field_B) {
                              ((eg) this).field_A.c(false);
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                          L13: {
                            ((eg) this).field_B = param0;
                            if (param0 != null) {
                              stackOut_128_0 = ((eg) this).field_A;
                              stackOut_128_1 = 1;
                              stackIn_130_0 = stackOut_128_0;
                              stackIn_130_1 = stackOut_128_1;
                              ((i) (Object) stackIn_130_0).a(stackIn_130_1 != 0, 37, param0);
                              this.a(param1, (byte) -86, param4, ((eg) this).field_A);
                              break L13;
                            } else {
                              break L13;
                            }
                          }
                          ((eg) this).field_r = param2;
                          break L11;
                        } else {
                          L14: {
                            if (null == ((eg) this).field_u) {
                              break L14;
                            } else {
                              ((eg) this).field_x.c(false);
                              break L14;
                            }
                          }
                          L15: {
                            ((eg) this).field_u = param0;
                            if (param0 == null) {
                              break L15;
                            } else {
                              stackOut_119_0 = ((eg) this).field_x;
                              stackOut_119_1 = 1;
                              stackIn_121_0 = stackOut_119_0;
                              stackIn_121_1 = stackOut_119_1;
                              ((i) (Object) stackIn_121_0).a(stackIn_121_1 != 0, 37, param0);
                              this.a(param1, (byte) -124, param4, ((eg) this).field_x);
                              break L15;
                            }
                          }
                          ((eg) this).field_r = -param2;
                          break L11;
                        }
                      }
                      return;
                    }
                  } else {
                    L16: {
                      var7 = 1;
                      if (var7 != 0) {
                        L17: {
                          if (null != ((eg) this).field_B) {
                            ((eg) this).field_A.c(false);
                            break L17;
                          } else {
                            break L17;
                          }
                        }
                        L18: {
                          ((eg) this).field_B = param0;
                          if (param0 != null) {
                            stackOut_106_0 = ((eg) this).field_A;
                            stackOut_106_1 = 1;
                            stackIn_108_0 = stackOut_106_0;
                            stackIn_108_1 = stackOut_106_1;
                            ((i) (Object) stackIn_108_0).a(stackIn_108_1 != 0, 37, param0);
                            this.a(param1, (byte) -86, param4, ((eg) this).field_A);
                            break L18;
                          } else {
                            break L18;
                          }
                        }
                        ((eg) this).field_r = param2;
                        break L16;
                      } else {
                        L19: {
                          if (null == ((eg) this).field_u) {
                            break L19;
                          } else {
                            ((eg) this).field_x.c(false);
                            break L19;
                          }
                        }
                        L20: {
                          ((eg) this).field_u = param0;
                          if (param0 == null) {
                            break L20;
                          } else {
                            stackOut_97_0 = ((eg) this).field_x;
                            stackOut_97_1 = 1;
                            stackIn_99_0 = stackOut_97_0;
                            stackIn_99_1 = stackOut_97_1;
                            ((i) (Object) stackIn_99_0).a(stackIn_99_1 != 0, 37, param0);
                            this.a(param1, (byte) -124, param4, ((eg) this).field_x);
                            break L20;
                          }
                        }
                        ((eg) this).field_r = -param2;
                        break L16;
                      }
                    }
                    return;
                  }
                } else {
                  ((eg) this).field_r = -param2;
                  this.a(param1, (byte) -93, param4, ((eg) this).field_x);
                  return;
                }
              } else {
                ((eg) this).field_r = param2;
                this.a(param1, (byte) -116, param4, ((eg) this).field_A);
                return;
              }
            } else {
              return;
            }
          }
        } else {
          L21: {
            stackOut_1_0 = this;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param3) {
              stackOut_3_0 = this;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L21;
            } else {
              stackOut_2_0 = this;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L21;
            }
          }
          ((eg) this).field_n = stackIn_4_1 != 0;
          if (param5 > 119) {
            if (((eg) this).field_B != param0) {
              if (param0 != ((eg) this).field_u) {
                if (null != ((eg) this).field_B) {
                  if (null == ((eg) this).field_u) {
                    var7 = 0;
                    if (var7 == 0) {
                      if (null != ((eg) this).field_u) {
                        L22: {
                          ((eg) this).field_x.c(false);
                          ((eg) this).field_u = param0;
                          if (param0 == null) {
                            break L22;
                          } else {
                            L23: {
                              stackOut_75_0 = ((eg) this).field_x;
                              stackIn_77_0 = stackOut_75_0;
                              stackIn_76_0 = stackOut_75_0;
                              if (param3) {
                                stackOut_77_0 = (i) (Object) stackIn_77_0;
                                stackOut_77_1 = 0;
                                stackIn_78_0 = stackOut_77_0;
                                stackIn_78_1 = stackOut_77_1;
                                break L23;
                              } else {
                                stackOut_76_0 = (i) (Object) stackIn_76_0;
                                stackOut_76_1 = 1;
                                stackIn_78_0 = stackOut_76_0;
                                stackIn_78_1 = stackOut_76_1;
                                break L23;
                              }
                            }
                            ((i) (Object) stackIn_78_0).a(stackIn_78_1 != 0, 37, param0);
                            this.a(param1, (byte) -124, param4, ((eg) this).field_x);
                            break L22;
                          }
                        }
                        ((eg) this).field_r = -param2;
                        return;
                      } else {
                        L24: {
                          ((eg) this).field_u = param0;
                          if (param0 == null) {
                            break L24;
                          } else {
                            L25: {
                              stackOut_69_0 = ((eg) this).field_x;
                              stackIn_71_0 = stackOut_69_0;
                              stackIn_70_0 = stackOut_69_0;
                              if (param3) {
                                stackOut_71_0 = (i) (Object) stackIn_71_0;
                                stackOut_71_1 = 0;
                                stackIn_72_0 = stackOut_71_0;
                                stackIn_72_1 = stackOut_71_1;
                                break L25;
                              } else {
                                stackOut_70_0 = (i) (Object) stackIn_70_0;
                                stackOut_70_1 = 1;
                                stackIn_72_0 = stackOut_70_0;
                                stackIn_72_1 = stackOut_70_1;
                                break L25;
                              }
                            }
                            ((i) (Object) stackIn_72_0).a(stackIn_72_1 != 0, 37, param0);
                            this.a(param1, (byte) -124, param4, ((eg) this).field_x);
                            break L24;
                          }
                        }
                        ((eg) this).field_r = -param2;
                        return;
                      }
                    } else {
                      L26: {
                        if (null != ((eg) this).field_B) {
                          ((eg) this).field_A.c(false);
                          break L26;
                        } else {
                          break L26;
                        }
                      }
                      L27: {
                        ((eg) this).field_B = param0;
                        if (param0 != null) {
                          L28: {
                            stackOut_62_0 = ((eg) this).field_A;
                            stackIn_64_0 = stackOut_62_0;
                            stackIn_63_0 = stackOut_62_0;
                            if (param3) {
                              stackOut_64_0 = (i) (Object) stackIn_64_0;
                              stackOut_64_1 = 0;
                              stackIn_65_0 = stackOut_64_0;
                              stackIn_65_1 = stackOut_64_1;
                              break L28;
                            } else {
                              stackOut_63_0 = (i) (Object) stackIn_63_0;
                              stackOut_63_1 = 1;
                              stackIn_65_0 = stackOut_63_0;
                              stackIn_65_1 = stackOut_63_1;
                              break L28;
                            }
                          }
                          ((i) (Object) stackIn_65_0).a(stackIn_65_1 != 0, 37, param0);
                          this.a(param1, (byte) -86, param4, ((eg) this).field_A);
                          break L27;
                        } else {
                          break L27;
                        }
                      }
                      ((eg) this).field_r = param2;
                      return;
                    }
                  } else {
                    L29: {
                      if ((((eg) this).field_k ^ -1) <= -524289) {
                        stackOut_35_0 = 0;
                        stackIn_36_0 = stackOut_35_0;
                        break L29;
                      } else {
                        stackOut_34_0 = 1;
                        stackIn_36_0 = stackOut_34_0;
                        break L29;
                      }
                    }
                    L30: {
                      var7 = stackIn_36_0;
                      if (var7 != 0) {
                        L31: {
                          if (null != ((eg) this).field_B) {
                            ((eg) this).field_A.c(false);
                            break L31;
                          } else {
                            break L31;
                          }
                        }
                        L32: {
                          ((eg) this).field_B = param0;
                          if (param0 != null) {
                            L33: {
                              stackOut_50_0 = ((eg) this).field_A;
                              stackIn_52_0 = stackOut_50_0;
                              stackIn_51_0 = stackOut_50_0;
                              if (param3) {
                                stackOut_52_0 = (i) (Object) stackIn_52_0;
                                stackOut_52_1 = 0;
                                stackIn_53_0 = stackOut_52_0;
                                stackIn_53_1 = stackOut_52_1;
                                break L33;
                              } else {
                                stackOut_51_0 = (i) (Object) stackIn_51_0;
                                stackOut_51_1 = 1;
                                stackIn_53_0 = stackOut_51_0;
                                stackIn_53_1 = stackOut_51_1;
                                break L33;
                              }
                            }
                            ((i) (Object) stackIn_53_0).a(stackIn_53_1 != 0, 37, param0);
                            this.a(param1, (byte) -86, param4, ((eg) this).field_A);
                            break L32;
                          } else {
                            break L32;
                          }
                        }
                        ((eg) this).field_r = param2;
                        break L30;
                      } else {
                        L34: {
                          if (null == ((eg) this).field_u) {
                            break L34;
                          } else {
                            ((eg) this).field_x.c(false);
                            break L34;
                          }
                        }
                        L35: {
                          ((eg) this).field_u = param0;
                          if (param0 == null) {
                            break L35;
                          } else {
                            L36: {
                              stackOut_40_0 = ((eg) this).field_x;
                              stackIn_42_0 = stackOut_40_0;
                              stackIn_41_0 = stackOut_40_0;
                              if (param3) {
                                stackOut_42_0 = (i) (Object) stackIn_42_0;
                                stackOut_42_1 = 0;
                                stackIn_43_0 = stackOut_42_0;
                                stackIn_43_1 = stackOut_42_1;
                                break L36;
                              } else {
                                stackOut_41_0 = (i) (Object) stackIn_41_0;
                                stackOut_41_1 = 1;
                                stackIn_43_0 = stackOut_41_0;
                                stackIn_43_1 = stackOut_41_1;
                                break L36;
                              }
                            }
                            ((i) (Object) stackIn_43_0).a(stackIn_43_1 != 0, 37, param0);
                            this.a(param1, (byte) -124, param4, ((eg) this).field_x);
                            break L35;
                          }
                        }
                        ((eg) this).field_r = -param2;
                        break L30;
                      }
                    }
                    return;
                  }
                } else {
                  L37: {
                    var7 = 1;
                    if (var7 != 0) {
                      L38: {
                        if (null != ((eg) this).field_B) {
                          ((eg) this).field_A.c(false);
                          break L38;
                        } else {
                          break L38;
                        }
                      }
                      L39: {
                        ((eg) this).field_B = param0;
                        if (param0 != null) {
                          L40: {
                            stackOut_26_0 = ((eg) this).field_A;
                            stackIn_28_0 = stackOut_26_0;
                            stackIn_27_0 = stackOut_26_0;
                            if (param3) {
                              stackOut_28_0 = (i) (Object) stackIn_28_0;
                              stackOut_28_1 = 0;
                              stackIn_29_0 = stackOut_28_0;
                              stackIn_29_1 = stackOut_28_1;
                              break L40;
                            } else {
                              stackOut_27_0 = (i) (Object) stackIn_27_0;
                              stackOut_27_1 = 1;
                              stackIn_29_0 = stackOut_27_0;
                              stackIn_29_1 = stackOut_27_1;
                              break L40;
                            }
                          }
                          ((i) (Object) stackIn_29_0).a(stackIn_29_1 != 0, 37, param0);
                          this.a(param1, (byte) -86, param4, ((eg) this).field_A);
                          break L39;
                        } else {
                          break L39;
                        }
                      }
                      ((eg) this).field_r = param2;
                      break L37;
                    } else {
                      L41: {
                        if (null == ((eg) this).field_u) {
                          break L41;
                        } else {
                          ((eg) this).field_x.c(false);
                          break L41;
                        }
                      }
                      L42: {
                        ((eg) this).field_u = param0;
                        if (param0 == null) {
                          break L42;
                        } else {
                          L43: {
                            stackOut_16_0 = ((eg) this).field_x;
                            stackIn_18_0 = stackOut_16_0;
                            stackIn_17_0 = stackOut_16_0;
                            if (param3) {
                              stackOut_18_0 = (i) (Object) stackIn_18_0;
                              stackOut_18_1 = 0;
                              stackIn_19_0 = stackOut_18_0;
                              stackIn_19_1 = stackOut_18_1;
                              break L43;
                            } else {
                              stackOut_17_0 = (i) (Object) stackIn_17_0;
                              stackOut_17_1 = 1;
                              stackIn_19_0 = stackOut_17_0;
                              stackIn_19_1 = stackOut_17_1;
                              break L43;
                            }
                          }
                          ((i) (Object) stackIn_19_0).a(stackIn_19_1 != 0, 37, param0);
                          this.a(param1, (byte) -124, param4, ((eg) this).field_x);
                          break L42;
                        }
                      }
                      ((eg) this).field_r = -param2;
                      break L37;
                    }
                  }
                  return;
                }
              } else {
                ((eg) this).field_r = -param2;
                this.a(param1, (byte) -93, param4, ((eg) this).field_x);
                return;
              }
            } else {
              ((eg) this).field_r = param2;
              this.a(param1, (byte) -116, param4, ((eg) this).field_A);
              return;
            }
          } else {
            return;
          }
        }
    }

    final static boolean b(byte param0) {
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 <= -53) {
          if (j.field_l >= 10) {
            if (oi.field_d) {
              return false;
            } else {
              L0: {
                if (wl.b((byte) -119)) {
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L0;
                } else {
                  stackOut_14_0 = 1;
                  stackIn_16_0 = stackOut_14_0;
                  break L0;
                }
              }
              return stackIn_16_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          field_l = -55;
          if (j.field_l >= 10) {
            if (oi.field_d) {
              return false;
            } else {
              L1: {
                if (wl.b((byte) -119)) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return false;
          }
        }
    }

    final synchronized void a(int param0) {
        int var3 = 0;
        var3 = Virogrid.field_F ? 1 : 0;
        if (-1 > (((eg) this).field_k ^ -1)) {
          if (((eg) this).field_B != null) {
            L0: {
              ((eg) this).field_A.a(param0);
              if (1048576 <= ((eg) this).field_k) {
                break L0;
              } else {
                if (null == ((eg) this).field_u) {
                  break L0;
                } else {
                  ((eg) this).field_x.a(param0);
                  break L0;
                }
              }
            }
            L1: {
              if (0 >= ((eg) this).field_v) {
                break L1;
              } else {
                if (null != ((eg) this).field_E) {
                  ((eg) this).field_m.a(param0);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            if (((eg) this).field_n) {
              L2: {
                if (0 >= ((eg) this).field_r) {
                  break L2;
                } else {
                  if (!((eg) this).field_A.d(121)) {
                    L3: {
                      ((eg) this).field_r = -((eg) this).field_r;
                      ((eg) this).field_B = null;
                      ((eg) this).field_n = false;
                      if (-1 == ((eg) this).field_r) {
                        break L3;
                      } else {
                        ((eg) this).field_k = ((eg) this).field_k + param0 * ((eg) this).field_r;
                        if (1048576 <= ((eg) this).field_k) {
                          ((eg) this).field_k = 1048576;
                          if (((eg) this).field_n) {
                            break L3;
                          } else {
                            ((eg) this).field_r = 0;
                            if (!((eg) this).field_o) {
                              if (((eg) this).field_u == null) {
                                ((eg) this).field_u = null;
                                break L3;
                              } else {
                                ((eg) this).field_x.c(false);
                                ((eg) this).field_u = null;
                                return;
                              }
                            } else {
                              return;
                            }
                          }
                        } else {
                          if (-1 >= ((eg) this).field_k) {
                            ((eg) this).field_k = 0;
                            if (!((eg) this).field_n) {
                              ((eg) this).field_r = 0;
                              if (((eg) this).field_o) {
                                break L3;
                              } else {
                                L4: {
                                  if (((eg) this).field_B != null) {
                                    ((eg) this).field_A.c(false);
                                    break L4;
                                  } else {
                                    break L4;
                                  }
                                }
                                ((eg) this).field_B = null;
                                return;
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
                    return;
                  } else {
                    break L2;
                  }
                }
              }
              if (((eg) this).field_r < 0) {
                if (!((eg) this).field_x.d(122)) {
                  ((eg) this).field_n = false;
                  ((eg) this).field_r = -((eg) this).field_r;
                  ((eg) this).field_u = null;
                  if (-1 != (((eg) this).field_r ^ -1)) {
                    ((eg) this).field_k = ((eg) this).field_k + param0 * ((eg) this).field_r;
                    if (1048576 <= ((eg) this).field_k) {
                      L5: {
                        ((eg) this).field_k = 1048576;
                        if (((eg) this).field_n) {
                          break L5;
                        } else {
                          ((eg) this).field_r = 0;
                          if (!((eg) this).field_o) {
                            if (((eg) this).field_u == null) {
                              ((eg) this).field_u = null;
                              break L5;
                            } else {
                              ((eg) this).field_x.c(false);
                              ((eg) this).field_u = null;
                              return;
                            }
                          } else {
                            return;
                          }
                        }
                      }
                      return;
                    } else {
                      if (-1 <= (((eg) this).field_k ^ -1)) {
                        ((eg) this).field_k = 0;
                        if (!((eg) this).field_n) {
                          ((eg) this).field_r = 0;
                          if (!((eg) this).field_o) {
                            L6: {
                              if (((eg) this).field_B != null) {
                                ((eg) this).field_A.c(false);
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                            ((eg) this).field_B = null;
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
                } else {
                  L7: {
                    if (-1 == ((eg) this).field_r) {
                      break L7;
                    } else {
                      ((eg) this).field_k = ((eg) this).field_k + param0 * ((eg) this).field_r;
                      if (1048576 <= ((eg) this).field_k) {
                        ((eg) this).field_k = 1048576;
                        if (((eg) this).field_n) {
                          break L7;
                        } else {
                          ((eg) this).field_r = 0;
                          if (!((eg) this).field_o) {
                            if (((eg) this).field_u == null) {
                              ((eg) this).field_u = null;
                              break L7;
                            } else {
                              ((eg) this).field_x.c(false);
                              ((eg) this).field_u = null;
                              return;
                            }
                          } else {
                            return;
                          }
                        }
                      } else {
                        if (-1 >= ((eg) this).field_k) {
                          ((eg) this).field_k = 0;
                          if (!((eg) this).field_n) {
                            ((eg) this).field_r = 0;
                            if (((eg) this).field_o) {
                              break L7;
                            } else {
                              L8: {
                                if (((eg) this).field_B != null) {
                                  ((eg) this).field_A.c(false);
                                  break L8;
                                } else {
                                  break L8;
                                }
                              }
                              ((eg) this).field_B = null;
                              return;
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
                  return;
                }
              } else {
                if (-1 != ((eg) this).field_r) {
                  ((eg) this).field_k = ((eg) this).field_k + param0 * ((eg) this).field_r;
                  if (1048576 <= ((eg) this).field_k) {
                    L9: {
                      ((eg) this).field_k = 1048576;
                      if (((eg) this).field_n) {
                        break L9;
                      } else {
                        ((eg) this).field_r = 0;
                        if (!((eg) this).field_o) {
                          if (((eg) this).field_u == null) {
                            ((eg) this).field_u = null;
                            break L9;
                          } else {
                            ((eg) this).field_x.c(false);
                            ((eg) this).field_u = null;
                            return;
                          }
                        } else {
                          return;
                        }
                      }
                    }
                    return;
                  } else {
                    if (-1 >= ((eg) this).field_k) {
                      ((eg) this).field_k = 0;
                      if (!((eg) this).field_n) {
                        ((eg) this).field_r = 0;
                        if (!((eg) this).field_o) {
                          L10: {
                            if (((eg) this).field_B != null) {
                              ((eg) this).field_A.c(false);
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          ((eg) this).field_B = null;
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
            } else {
              if (-1 != ((eg) this).field_r) {
                ((eg) this).field_k = ((eg) this).field_k + param0 * ((eg) this).field_r;
                if (1048576 <= ((eg) this).field_k) {
                  ((eg) this).field_k = 1048576;
                  if (!((eg) this).field_n) {
                    ((eg) this).field_r = 0;
                    if (!((eg) this).field_o) {
                      if (((eg) this).field_u == null) {
                        ((eg) this).field_u = null;
                        return;
                      } else {
                        ((eg) this).field_x.c(false);
                        ((eg) this).field_u = null;
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  if (-1 >= ((eg) this).field_k) {
                    ((eg) this).field_k = 0;
                    if (!((eg) this).field_n) {
                      ((eg) this).field_r = 0;
                      if (((eg) this).field_o) {
                        return;
                      } else {
                        L11: {
                          if (((eg) this).field_B != null) {
                            ((eg) this).field_A.c(false);
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                        ((eg) this).field_B = null;
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
            L12: {
              if (1048576 <= ((eg) this).field_k) {
                break L12;
              } else {
                if (null == ((eg) this).field_u) {
                  break L12;
                } else {
                  ((eg) this).field_x.a(param0);
                  break L12;
                }
              }
            }
            L13: {
              if (0 >= ((eg) this).field_v) {
                break L13;
              } else {
                if (null != ((eg) this).field_E) {
                  ((eg) this).field_m.a(param0);
                  break L13;
                } else {
                  break L13;
                }
              }
            }
            L14: {
              if (!((eg) this).field_n) {
                break L14;
              } else {
                L15: {
                  if (0 >= ((eg) this).field_r) {
                    break L15;
                  } else {
                    if (!((eg) this).field_A.d(121)) {
                      L16: {
                        ((eg) this).field_r = -((eg) this).field_r;
                        ((eg) this).field_B = null;
                        ((eg) this).field_n = false;
                        if (-1 == ((eg) this).field_r) {
                          break L16;
                        } else {
                          ((eg) this).field_k = ((eg) this).field_k + param0 * ((eg) this).field_r;
                          if (1048576 <= ((eg) this).field_k) {
                            ((eg) this).field_k = 1048576;
                            if (((eg) this).field_n) {
                              break L16;
                            } else {
                              ((eg) this).field_r = 0;
                              if (!((eg) this).field_o) {
                                if (((eg) this).field_u == null) {
                                  ((eg) this).field_u = null;
                                  break L16;
                                } else {
                                  ((eg) this).field_x.c(false);
                                  ((eg) this).field_u = null;
                                  break L16;
                                }
                              } else {
                                break L16;
                              }
                            }
                          } else {
                            if (-1 >= ((eg) this).field_k) {
                              ((eg) this).field_k = 0;
                              if (!((eg) this).field_n) {
                                ((eg) this).field_r = 0;
                                if (((eg) this).field_o) {
                                  break L16;
                                } else {
                                  L17: {
                                    if (((eg) this).field_B != null) {
                                      ((eg) this).field_A.c(false);
                                      break L17;
                                    } else {
                                      break L17;
                                    }
                                  }
                                  ((eg) this).field_B = null;
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
                      }
                      return;
                    } else {
                      break L15;
                    }
                  }
                }
                if (((eg) this).field_r >= 0) {
                  break L14;
                } else {
                  if (!((eg) this).field_x.d(122)) {
                    ((eg) this).field_n = false;
                    ((eg) this).field_r = -((eg) this).field_r;
                    ((eg) this).field_u = null;
                    break L14;
                  } else {
                    break L14;
                  }
                }
              }
            }
            if (-1 != ((eg) this).field_r) {
              ((eg) this).field_k = ((eg) this).field_k + param0 * ((eg) this).field_r;
              if (1048576 <= ((eg) this).field_k) {
                ((eg) this).field_k = 1048576;
                if (!((eg) this).field_n) {
                  ((eg) this).field_r = 0;
                  if (!((eg) this).field_o) {
                    if (((eg) this).field_u != null) {
                      ((eg) this).field_x.c(false);
                      ((eg) this).field_u = null;
                      return;
                    } else {
                      ((eg) this).field_u = null;
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                if (-1 >= ((eg) this).field_k) {
                  ((eg) this).field_k = 0;
                  if (!((eg) this).field_n) {
                    ((eg) this).field_r = 0;
                    if (!((eg) this).field_o) {
                      L18: {
                        if (((eg) this).field_B != null) {
                          ((eg) this).field_A.c(false);
                          break L18;
                        } else {
                          break L18;
                        }
                      }
                      ((eg) this).field_B = null;
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
        } else {
          L19: {
            if (1048576 <= ((eg) this).field_k) {
              break L19;
            } else {
              if (null == ((eg) this).field_u) {
                break L19;
              } else {
                ((eg) this).field_x.a(param0);
                break L19;
              }
            }
          }
          L20: {
            if (0 >= ((eg) this).field_v) {
              break L20;
            } else {
              if (null != ((eg) this).field_E) {
                ((eg) this).field_m.a(param0);
                break L20;
              } else {
                break L20;
              }
            }
          }
          L21: {
            if (!((eg) this).field_n) {
              break L21;
            } else {
              L22: {
                if (0 >= ((eg) this).field_r) {
                  break L22;
                } else {
                  if (!((eg) this).field_A.d(121)) {
                    L23: {
                      ((eg) this).field_r = -((eg) this).field_r;
                      ((eg) this).field_B = null;
                      ((eg) this).field_n = false;
                      if (-1 == ((eg) this).field_r) {
                        break L23;
                      } else {
                        ((eg) this).field_k = ((eg) this).field_k + param0 * ((eg) this).field_r;
                        if (1048576 <= ((eg) this).field_k) {
                          ((eg) this).field_k = 1048576;
                          if (((eg) this).field_n) {
                            break L23;
                          } else {
                            ((eg) this).field_r = 0;
                            if (!((eg) this).field_o) {
                              if (((eg) this).field_u == null) {
                                ((eg) this).field_u = null;
                                break L23;
                              } else {
                                ((eg) this).field_x.c(false);
                                ((eg) this).field_u = null;
                                break L23;
                              }
                            } else {
                              break L23;
                            }
                          }
                        } else {
                          if (-1 >= ((eg) this).field_k) {
                            ((eg) this).field_k = 0;
                            if (!((eg) this).field_n) {
                              ((eg) this).field_r = 0;
                              if (((eg) this).field_o) {
                                break L23;
                              } else {
                                L24: {
                                  if (((eg) this).field_B != null) {
                                    ((eg) this).field_A.c(false);
                                    break L24;
                                  } else {
                                    break L24;
                                  }
                                }
                                ((eg) this).field_B = null;
                                break L23;
                              }
                            } else {
                              break L23;
                            }
                          } else {
                            break L23;
                          }
                        }
                      }
                    }
                    return;
                  } else {
                    break L22;
                  }
                }
              }
              if (((eg) this).field_r >= 0) {
                break L21;
              } else {
                if (!((eg) this).field_x.d(122)) {
                  ((eg) this).field_n = false;
                  ((eg) this).field_r = -((eg) this).field_r;
                  ((eg) this).field_u = null;
                  break L21;
                } else {
                  break L21;
                }
              }
            }
          }
          if (-1 != ((eg) this).field_r) {
            ((eg) this).field_k = ((eg) this).field_k + param0 * ((eg) this).field_r;
            if (1048576 <= ((eg) this).field_k) {
              ((eg) this).field_k = 1048576;
              if (!((eg) this).field_n) {
                ((eg) this).field_r = 0;
                if (!((eg) this).field_o) {
                  if (((eg) this).field_u != null) {
                    ((eg) this).field_x.c(false);
                    ((eg) this).field_u = null;
                    return;
                  } else {
                    ((eg) this).field_u = null;
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              if (-1 >= ((eg) this).field_k) {
                ((eg) this).field_k = 0;
                if (!((eg) this).field_n) {
                  ((eg) this).field_r = 0;
                  if (!((eg) this).field_o) {
                    L25: {
                      if (((eg) this).field_B != null) {
                        ((eg) this).field_A.c(false);
                        break L25;
                      } else {
                        break L25;
                      }
                    }
                    ((eg) this).field_B = null;
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

    private eg() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "Day";
        field_p = "<%0> has entered another game.";
        field_z = "You can ask to join this game";
        field_G = "Staff impersonation";
        field_s = "Checking";
        field_y = 2;
        field_F = "There are no valid types of game that match your preferences.";
    }
}
