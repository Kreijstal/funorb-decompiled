/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ci {
    int[] field_q;
    cm[] field_i;
    static boolean field_o;
    int[] field_n;
    private byte[] field_u;
    int[][] field_k;
    int[] field_m;
    static bi field_p;
    int field_c;
    static String field_d;
    private int[][] field_t;
    static String field_g;
    static bi field_r;
    private int[] field_s;
    cm field_b;
    byte[][] field_j;
    private int field_l;
    int[] field_v;
    static int[][] field_h;
    int[] field_f;
    int field_a;
    int field_e;

    public static void a(boolean param0) {
        field_d = null;
        if (!param0) {
            return;
        }
        field_g = null;
        field_h = null;
        field_r = null;
        field_p = null;
    }

    private final void a(byte[] param0, byte param1) {
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
        ob var17 = null;
        byte[] var21 = null;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        L0: {
          var16 = ShatteredPlansClient.field_F ? 1 : 0;
          var17 = new ob(pa.a(param0, 200));
          var4 = var17.j(-89);
          if (-6 < (var4 ^ -1)) {
            break L0;
          } else {
            if (var4 > 7) {
              break L0;
            } else {
              L1: {
                if (var4 < 6) {
                  ((ci) this).field_e = 0;
                  break L1;
                } else {
                  ((ci) this).field_e = var17.a(16711680);
                  break L1;
                }
              }
              L2: {
                var5 = var17.j(-57);
                if (0 == (1 & var5)) {
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
                if (var4 < 7) {
                  ((ci) this).field_l = var17.f(-20976);
                  break L3;
                } else {
                  ((ci) this).field_l = var17.d(true);
                  break L3;
                }
              }
              L4: {
                if ((2 & var5) == 0) {
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L4;
                } else {
                  stackOut_14_0 = 1;
                  stackIn_16_0 = stackOut_14_0;
                  break L4;
                }
              }
              L5: {
                var7 = stackIn_16_0;
                var8 = 0;
                ((ci) this).field_q = new int[((ci) this).field_l];
                var9 = -1;
                if ((var4 ^ -1) > -8) {
                  var10 = 0;
                  L6: while (true) {
                    if (((ci) this).field_l <= var10) {
                      break L5;
                    } else {
                      var8 = var8 + var17.f(-20976);
                      ((ci) this).field_q[var10] = var8 + var17.f(-20976);
                      if (((ci) this).field_q[var10] > var9) {
                        var9 = ((ci) this).field_q[var10];
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
                    if (((ci) this).field_l <= var10) {
                      break L5;
                    } else {
                      var8 = var8 + var17.d(true);
                      ((ci) this).field_q[var10] = var8 + var17.d(true);
                      if (((ci) this).field_q[var10] > var9) {
                        var9 = ((ci) this).field_q[var10];
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
                ((ci) this).field_a = 1 + var9;
                ((ci) this).field_k = new int[((ci) this).field_a][];
                ((ci) this).field_n = new int[((ci) this).field_a];
                ((ci) this).field_m = new int[((ci) this).field_a];
                ((ci) this).field_f = new int[((ci) this).field_a];
                if (var7 != 0) {
                  ((ci) this).field_j = new byte[((ci) this).field_a][];
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                ((ci) this).field_v = new int[((ci) this).field_a];
                if (var6 == 0) {
                  break L9;
                } else {
                  ((ci) this).field_s = new int[((ci) this).field_a];
                  var10 = 0;
                  L10: while (true) {
                    if (((ci) this).field_a <= var10) {
                      var10 = 0;
                      L11: while (true) {
                        if (var10 >= ((ci) this).field_l) {
                          ((ci) this).field_b = new cm(((ci) this).field_s);
                          break L9;
                        } else {
                          ((ci) this).field_s[((ci) this).field_q[var10]] = var17.a(16711680);
                          var10++;
                          continue L11;
                        }
                      }
                    } else {
                      ((ci) this).field_s[var10] = -1;
                      var10++;
                      continue L10;
                    }
                  }
                }
              }
              var10 = 0;
              L12: while (true) {
                if (((ci) this).field_l <= var10) {
                  L13: {
                    if (var7 != 0) {
                      var10 = 0;
                      L14: while (true) {
                        if (((ci) this).field_l <= var10) {
                          if (param1 > 77) {
                            var10 = 0;
                            L15: while (true) {
                              if (var10 >= ((ci) this).field_l) {
                                break L13;
                              } else {
                                ((ci) this).field_v[((ci) this).field_q[var10]] = var17.a(16711680);
                                var10++;
                                continue L15;
                              }
                            }
                          } else {
                            return;
                          }
                        } else {
                          var21 = new byte[64];
                          var17.a(64, 0, 17469032, var21);
                          ((ci) this).field_j[((ci) this).field_q[var10]] = var21;
                          var10++;
                          continue L14;
                        }
                      }
                    } else {
                      if (param1 > 77) {
                        var10 = 0;
                        L16: while (true) {
                          if (var10 >= ((ci) this).field_l) {
                            break L13;
                          } else {
                            ((ci) this).field_v[((ci) this).field_q[var10]] = var17.a(16711680);
                            var10++;
                            continue L16;
                          }
                        }
                      } else {
                        return;
                      }
                    }
                  }
                  L17: {
                    if (-8 < (var4 ^ -1)) {
                      var10 = 0;
                      L18: while (true) {
                        if (var10 >= ((ci) this).field_l) {
                          var10 = 0;
                          L19: while (true) {
                            if (var10 >= ((ci) this).field_l) {
                              break L17;
                            } else {
                              var11 = ((ci) this).field_q[var10];
                              var8 = 0;
                              var12 = ((ci) this).field_n[var11];
                              var13 = -1;
                              ((ci) this).field_k[var11] = new int[var12];
                              var14 = 0;
                              L20: while (true) {
                                if (var12 <= var14) {
                                  ((ci) this).field_m[var11] = 1 + var13;
                                  if (var13 - -1 == var12) {
                                    ((ci) this).field_k[var11] = null;
                                    var10++;
                                    continue L19;
                                  } else {
                                    var10++;
                                    continue L19;
                                  }
                                } else {
                                  var8 = var8 + var17.f(-20976);
                                  ((ci) this).field_k[var11][var14] = var8 + var17.f(-20976);
                                  var15 = var8 + var17.f(-20976);
                                  if (var13 < var15) {
                                    var13 = var15;
                                    var14++;
                                    continue L20;
                                  } else {
                                    var14++;
                                    continue L20;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          ((ci) this).field_n[((ci) this).field_q[var10]] = var17.f(-20976);
                          var10++;
                          continue L18;
                        }
                      }
                    } else {
                      var10 = 0;
                      L21: while (true) {
                        if (((ci) this).field_l <= var10) {
                          var10 = 0;
                          L22: while (true) {
                            if (var10 >= ((ci) this).field_l) {
                              break L17;
                            } else {
                              var11 = ((ci) this).field_q[var10];
                              var12 = ((ci) this).field_n[var11];
                              var8 = 0;
                              ((ci) this).field_k[var11] = new int[var12];
                              var13 = -1;
                              var14 = 0;
                              L23: while (true) {
                                if (var12 <= var14) {
                                  ((ci) this).field_m[var11] = var13 + 1;
                                  if (var12 == 1 + var13) {
                                    ((ci) this).field_k[var11] = null;
                                    var10++;
                                    continue L22;
                                  } else {
                                    var10++;
                                    continue L22;
                                  }
                                } else {
                                  var8 = var8 + var17.d(true);
                                  ((ci) this).field_k[var11][var14] = var8 + var17.d(true);
                                  var15 = var8 + var17.d(true);
                                  if (var15 > var13) {
                                    var13 = var15;
                                    var14++;
                                    continue L23;
                                  } else {
                                    var14++;
                                    continue L23;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          ((ci) this).field_n[((ci) this).field_q[var10]] = var17.d(true);
                          var10++;
                          continue L21;
                        }
                      }
                    }
                  }
                  L24: {
                    if (var6 == 0) {
                      break L24;
                    } else {
                      ((ci) this).field_t = new int[1 + var9][];
                      ((ci) this).field_i = new cm[var9 - -1];
                      var10 = 0;
                      L25: while (true) {
                        if (((ci) this).field_l <= var10) {
                          break L24;
                        } else {
                          var11 = ((ci) this).field_q[var10];
                          var12 = ((ci) this).field_n[var11];
                          ((ci) this).field_t[var11] = new int[((ci) this).field_m[var11]];
                          var13 = 0;
                          L26: while (true) {
                            if (((ci) this).field_m[var11] <= var13) {
                              var13 = 0;
                              L27: while (true) {
                                if (var13 >= var12) {
                                  ((ci) this).field_i[var11] = new cm(((ci) this).field_t[var11]);
                                  var10++;
                                  continue L25;
                                } else {
                                  L28: {
                                    if (((ci) this).field_k[var11] == null) {
                                      var14 = var13;
                                      break L28;
                                    } else {
                                      var14 = ((ci) this).field_k[var11][var13];
                                      break L28;
                                    }
                                  }
                                  ((ci) this).field_t[var11][var14] = var17.a(16711680);
                                  var13++;
                                  continue L27;
                                }
                              }
                            } else {
                              ((ci) this).field_t[var11][var13] = -1;
                              var13++;
                              continue L26;
                            }
                          }
                        }
                      }
                    }
                  }
                  return;
                } else {
                  ((ci) this).field_f[((ci) this).field_q[var10]] = var17.a(16711680);
                  var10++;
                  continue L12;
                }
              }
            }
          }
        }
        throw new RuntimeException();
    }

    ci(byte[] param0, int param1, byte[] param2) {
        int var4 = 0;
        ((ci) this).field_c = me.a(62, param0, param0.length);
        if (((ci) this).field_c != param1) {
            throw new RuntimeException();
        }
        if (param2 != null) {
            if (param2.length != 64) {
                throw new RuntimeException();
            }
            ((ci) this).field_u = dp.a(param0, param0.length, -26131, 0);
            for (var4 = 0; -65 < (var4 ^ -1); var4++) {
                if (((ci) this).field_u[var4] != param2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.a(param0, (byte) 86);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Solicitation";
    }
}
