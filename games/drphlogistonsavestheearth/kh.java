/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kh {
    int[] field_l;
    byte[][] field_q;
    private int[] field_u;
    int field_m;
    static int field_c;
    qf field_s;
    static int[] field_i;
    int[] field_k;
    qf[] field_b;
    int[] field_r;
    private byte[] field_g;
    int[] field_d;
    int field_t;
    static String field_o;
    static he field_e;
    private int field_n;
    private int[][] field_a;
    int[] field_j;
    int field_p;
    int[][] field_f;
    static cd field_h;

    private final void a(boolean param0, byte[] param1) {
        int var4 = 0;
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
        int var15 = 0;
        int var16 = 0;
        od var17 = null;
        byte[] var21 = null;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          var16 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          var17 = new od(ce.a(1, param1));
          var4 = var17.l(31760);
          if ((var4 ^ -1) > -6) {
            break L0;
          } else {
            if ((var4 ^ -1) < -8) {
              break L0;
            } else {
              L1: {
                if (var4 >= 6) {
                  ((kh) this).field_t = var17.h(101);
                  break L1;
                } else {
                  ((kh) this).field_t = 0;
                  break L1;
                }
              }
              L2: {
                var5 = var17.l(31760);
                if ((var5 & 1) == 0) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L2;
                } else {
                  stackOut_8_0 = 1;
                  stackIn_10_0 = stackOut_8_0;
                  break L2;
                }
              }
              L3: {
                var6 = stackIn_10_0;
                if ((var5 & 2) == 0) {
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  break L3;
                } else {
                  stackOut_11_0 = 1;
                  stackIn_13_0 = stackOut_11_0;
                  break L3;
                }
              }
              L4: {
                var7 = stackIn_13_0;
                if ((var4 ^ -1) <= -8) {
                  ((kh) this).field_n = var17.a(true);
                  break L4;
                } else {
                  ((kh) this).field_n = var17.j(-788751192);
                  break L4;
                }
              }
              L5: {
                var8 = 0;
                ((kh) this).field_r = new int[((kh) this).field_n];
                var9 = -1;
                if ((var4 ^ -1) <= -8) {
                  var10 = 0;
                  L6: while (true) {
                    if (((kh) this).field_n <= var10) {
                      break L5;
                    } else {
                      var8 = var8 + var17.a(true);
                      ((kh) this).field_r[var10] = var8 + var17.a(true);
                      if (((kh) this).field_r[var10] > var9) {
                        var9 = ((kh) this).field_r[var10];
                        var10++;
                        continue L6;
                      } else {
                        var10++;
                        continue L6;
                      }
                    }
                  }
                } else {
                  var10 = 0;
                  L7: while (true) {
                    if (((kh) this).field_n <= var10) {
                      break L5;
                    } else {
                      var8 = var8 + var17.j(-788751192);
                      ((kh) this).field_r[var10] = var8 + var17.j(-788751192);
                      if (((kh) this).field_r[var10] > var9) {
                        var9 = ((kh) this).field_r[var10];
                        var10++;
                        continue L7;
                      } else {
                        var10++;
                        continue L7;
                      }
                    }
                  }
                }
              }
              L8: {
                ((kh) this).field_m = 1 + var9;
                if (var7 == 0) {
                  break L8;
                } else {
                  ((kh) this).field_q = new byte[((kh) this).field_m][];
                  break L8;
                }
              }
              L9: {
                ((kh) this).field_k = new int[((kh) this).field_m];
                ((kh) this).field_l = new int[((kh) this).field_m];
                ((kh) this).field_j = new int[((kh) this).field_m];
                ((kh) this).field_f = new int[((kh) this).field_m][];
                ((kh) this).field_d = new int[((kh) this).field_m];
                if (var6 == 0) {
                  break L9;
                } else {
                  ((kh) this).field_u = new int[((kh) this).field_m];
                  var10 = 0;
                  L10: while (true) {
                    if (((kh) this).field_m <= var10) {
                      var10 = 0;
                      L11: while (true) {
                        if (var10 >= ((kh) this).field_n) {
                          ((kh) this).field_s = new qf(((kh) this).field_u);
                          break L9;
                        } else {
                          ((kh) this).field_u[((kh) this).field_r[var10]] = var17.h(124);
                          var10++;
                          continue L11;
                        }
                      }
                    } else {
                      ((kh) this).field_u[var10] = -1;
                      var10++;
                      continue L10;
                    }
                  }
                }
              }
              var10 = 0;
              L12: while (true) {
                if (var10 >= ((kh) this).field_n) {
                  L13: {
                    if (var7 != 0) {
                      var10 = 0;
                      L14: while (true) {
                        if (var10 >= ((kh) this).field_n) {
                          L15: {
                            var10 = 0;
                            if (param0) {
                              break L15;
                            } else {
                              ((kh) this).field_g = null;
                              break L15;
                            }
                          }
                          L16: while (true) {
                            if (var10 >= ((kh) this).field_n) {
                              break L13;
                            } else {
                              ((kh) this).field_l[((kh) this).field_r[var10]] = var17.h(109);
                              var10++;
                              continue L16;
                            }
                          }
                        } else {
                          var21 = new byte[64];
                          var17.b(0, 64, 128, var21);
                          ((kh) this).field_q[((kh) this).field_r[var10]] = var21;
                          var10++;
                          continue L14;
                        }
                      }
                    } else {
                      L17: {
                        var10 = 0;
                        if (param0) {
                          break L17;
                        } else {
                          ((kh) this).field_g = null;
                          break L17;
                        }
                      }
                      L18: while (true) {
                        if (var10 >= ((kh) this).field_n) {
                          break L13;
                        } else {
                          ((kh) this).field_l[((kh) this).field_r[var10]] = var17.h(109);
                          var10++;
                          continue L18;
                        }
                      }
                    }
                  }
                  L19: {
                    if (-8 < (var4 ^ -1)) {
                      var10 = 0;
                      L20: while (true) {
                        if (var10 >= ((kh) this).field_n) {
                          var10 = 0;
                          L21: while (true) {
                            if (((kh) this).field_n <= var10) {
                              break L19;
                            } else {
                              var11 = ((kh) this).field_r[var10];
                              var8 = 0;
                              var12 = ((kh) this).field_k[var11];
                              var13 = -1;
                              ((kh) this).field_f[var11] = new int[var12];
                              var14 = 0;
                              L22: while (true) {
                                if (var12 <= var14) {
                                  ((kh) this).field_d[var11] = 1 + var13;
                                  if (var12 == 1 + var13) {
                                    ((kh) this).field_f[var11] = null;
                                    var10++;
                                    continue L21;
                                  } else {
                                    var10++;
                                    continue L21;
                                  }
                                } else {
                                  var8 = var8 + var17.j(-788751192);
                                  ((kh) this).field_f[var11][var14] = var8 + var17.j(-788751192);
                                  var15 = var8 + var17.j(-788751192);
                                  if (var13 < var15) {
                                    var13 = var15;
                                    var14++;
                                    continue L22;
                                  } else {
                                    var14++;
                                    continue L22;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          ((kh) this).field_k[((kh) this).field_r[var10]] = var17.j(-788751192);
                          var10++;
                          continue L20;
                        }
                      }
                    } else {
                      var10 = 0;
                      L23: while (true) {
                        if (var10 >= ((kh) this).field_n) {
                          var10 = 0;
                          L24: while (true) {
                            if (((kh) this).field_n <= var10) {
                              break L19;
                            } else {
                              var11 = ((kh) this).field_r[var10];
                              var12 = ((kh) this).field_k[var11];
                              var8 = 0;
                              var13 = -1;
                              ((kh) this).field_f[var11] = new int[var12];
                              var14 = 0;
                              L25: while (true) {
                                if (var14 >= var12) {
                                  ((kh) this).field_d[var11] = var13 - -1;
                                  if (var13 - -1 == var12) {
                                    ((kh) this).field_f[var11] = null;
                                    var10++;
                                    continue L24;
                                  } else {
                                    var10++;
                                    continue L24;
                                  }
                                } else {
                                  var8 = var8 + var17.a(true);
                                  ((kh) this).field_f[var11][var14] = var8 + var17.a(true);
                                  var15 = var8 + var17.a(true);
                                  if (var13 < var15) {
                                    var13 = var15;
                                    var14++;
                                    continue L25;
                                  } else {
                                    var14++;
                                    continue L25;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          ((kh) this).field_k[((kh) this).field_r[var10]] = var17.a(true);
                          var10++;
                          continue L23;
                        }
                      }
                    }
                  }
                  L26: {
                    if (var6 != 0) {
                      ((kh) this).field_a = new int[1 + var9][];
                      ((kh) this).field_b = new qf[1 + var9];
                      var10 = 0;
                      L27: while (true) {
                        if (var10 >= ((kh) this).field_n) {
                          break L26;
                        } else {
                          var11 = ((kh) this).field_r[var10];
                          var12 = ((kh) this).field_k[var11];
                          ((kh) this).field_a[var11] = new int[((kh) this).field_d[var11]];
                          var13 = 0;
                          L28: while (true) {
                            if (var13 >= ((kh) this).field_d[var11]) {
                              var13 = 0;
                              L29: while (true) {
                                if (var13 >= var12) {
                                  ((kh) this).field_b[var11] = new qf(((kh) this).field_a[var11]);
                                  var10++;
                                  continue L27;
                                } else {
                                  L30: {
                                    if (((kh) this).field_f[var11] != null) {
                                      var14 = ((kh) this).field_f[var11][var13];
                                      break L30;
                                    } else {
                                      var14 = var13;
                                      break L30;
                                    }
                                  }
                                  ((kh) this).field_a[var11][var14] = var17.h(-118);
                                  var13++;
                                  continue L29;
                                }
                              }
                            } else {
                              ((kh) this).field_a[var11][var13] = -1;
                              var13++;
                              continue L28;
                            }
                          }
                        }
                      }
                    } else {
                      break L26;
                    }
                  }
                  return;
                } else {
                  ((kh) this).field_j[((kh) this).field_r[var10]] = var17.h(123);
                  var10++;
                  continue L12;
                }
              }
            }
          }
        }
        throw new RuntimeException();
    }

    final static boolean a(boolean param0) {
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        L0: {
          if (!param0) {
            break L0;
          } else {
            kh.a((byte) -124);
            break L0;
          }
        }
        L1: {
          L2: {
            if (hj.field_f < 20) {
              break L2;
            } else {
              if (!bj.a(13)) {
                break L2;
              } else {
                L3: {
                  if (rh.field_a <= 0) {
                    break L3;
                  } else {
                    L4: {
                      if (param0) {
                        stackOut_7_0 = 0;
                        stackIn_8_0 = stackOut_7_0;
                        break L4;
                      } else {
                        stackOut_6_0 = 1;
                        stackIn_8_0 = stackOut_6_0;
                        break L4;
                      }
                    }
                    if (hc.a(stackIn_8_0 != 0)) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                break L1;
              }
            }
          }
          stackOut_9_0 = 1;
          stackIn_11_0 = stackOut_9_0;
          break L1;
        }
        return stackIn_11_0 != 0;
    }

    public static void a(byte param0) {
        if (param0 >= -41) {
            kh.a((byte) 93);
        }
        field_e = null;
        field_h = null;
        field_i = null;
        field_o = null;
    }

    kh(byte[] param0, int param1, byte[] param2) {
        int var4 = 0;
        ((kh) this).field_p = th.a(param0, (byte) 127, param0.length);
        if (((kh) this).field_p != param1) {
            throw new RuntimeException();
        }
        if (param2 != null) {
            if (64 != param2.length) {
                throw new RuntimeException();
            }
            ((kh) this).field_g = b.a(0, 44, param0, param0.length);
            for (var4 = 0; var4 < 64; var4++) {
                if (param2[var4] != ((kh) this).field_g[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.a(true, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 1;
        field_o = "Building survival bonus (";
        field_h = new cd();
    }
}
