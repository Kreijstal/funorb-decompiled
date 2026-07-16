/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lj {
    int[] field_b;
    int field_g;
    int[] field_q;
    int[] field_l;
    static hn field_a;
    private int field_k;
    private byte[] field_r;
    int[] field_o;
    private int[] field_f;
    byte[][] field_t;
    int field_s;
    static rk field_n;
    int[][] field_h;
    qh[] field_j;
    private int[][] field_m;
    static String field_d;
    int field_c;
    int[] field_p;
    qh field_e;
    static bn field_i;

    final static void a(byte param0) {
        int var2 = 0;
        L0: {
          var2 = Chess.field_G;
          if (-1 <= (an.field_e ^ -1)) {
            if (-1 > (aj.field_c ^ -1)) {
              aj.field_c = aj.field_c - 1;
              break L0;
            } else {
              if (0 < ed.field_c) {
                ed.field_c = ed.field_c - 1;
                break L0;
              } else {
                break L0;
              }
            }
          } else {
            an.field_e = an.field_e - 1;
            break L0;
          }
        }
        L1: {
          if ((an.field_e ^ -1) < -1) {
            tf.a(90);
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if ((aj.field_c ^ -1) >= -1) {
            break L2;
          } else {
            f.a(aj.field_c, true);
            break L2;
          }
        }
        L3: {
          if ((ed.field_c ^ -1) < -1) {
            f.a(ed.field_c, true);
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (param0 == 19) {
            break L4;
          } else {
            lj.a((byte) -39);
            break L4;
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_i = null;
        if (param0 <= 81) {
            lj.a((String) null, 126L, -28);
        }
        field_d = null;
        field_n = null;
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
        p var17 = null;
        byte[] var21 = null;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        L0: {
          var16 = Chess.field_G;
          var17 = new p(dj.a(param0, 119));
          var4 = var17.i(-117);
          if (var4 < 5) {
            break L0;
          } else {
            if (7 < var4) {
              break L0;
            } else {
              L1: {
                if (var4 >= 6) {
                  ((lj) this).field_s = var17.e((byte) -98);
                  break L1;
                } else {
                  ((lj) this).field_s = 0;
                  break L1;
                }
              }
              L2: {
                var5 = var17.i(-114);
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
                if (7 <= var4) {
                  ((lj) this).field_k = var17.h(-120);
                  break L3;
                } else {
                  ((lj) this).field_k = var17.f(674914976);
                  break L3;
                }
              }
              L4: {
                if (0 == (var5 & 2)) {
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
                ((lj) this).field_q = new int[((lj) this).field_k];
                var9 = -1;
                if (7 <= var4) {
                  var10 = 0;
                  L6: while (true) {
                    if (((lj) this).field_k <= var10) {
                      break L5;
                    } else {
                      int dupTemp$4 = var8 + var17.h(-110);
                      var8 = dupTemp$4;
                      ((lj) this).field_q[var10] = dupTemp$4;
                      if (((lj) this).field_q[var10] > var9) {
                        var9 = ((lj) this).field_q[var10];
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
                    if (var10 >= ((lj) this).field_k) {
                      break L5;
                    } else {
                      int dupTemp$5 = var8 + var17.f(674914976);
                      var8 = dupTemp$5;
                      ((lj) this).field_q[var10] = dupTemp$5;
                      if (((lj) this).field_q[var10] > var9) {
                        var9 = ((lj) this).field_q[var10];
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
                ((lj) this).field_g = var9 + 1;
                ((lj) this).field_p = new int[((lj) this).field_g];
                ((lj) this).field_o = new int[((lj) this).field_g];
                if (var7 == 0) {
                  break L8;
                } else {
                  ((lj) this).field_t = new byte[((lj) this).field_g][];
                  break L8;
                }
              }
              L9: {
                ((lj) this).field_h = new int[((lj) this).field_g][];
                ((lj) this).field_b = new int[((lj) this).field_g];
                ((lj) this).field_l = new int[((lj) this).field_g];
                if (var6 == 0) {
                  break L9;
                } else {
                  ((lj) this).field_f = new int[((lj) this).field_g];
                  var10 = 0;
                  L10: while (true) {
                    if (((lj) this).field_g <= var10) {
                      var10 = 0;
                      L11: while (true) {
                        if (var10 >= ((lj) this).field_k) {
                          ((lj) this).field_e = new qh(((lj) this).field_f);
                          break L9;
                        } else {
                          ((lj) this).field_f[((lj) this).field_q[var10]] = var17.e((byte) -114);
                          var10++;
                          continue L11;
                        }
                      }
                    } else {
                      ((lj) this).field_f[var10] = -1;
                      var10++;
                      continue L10;
                    }
                  }
                }
              }
              var10 = 0;
              L12: while (true) {
                if (var10 >= ((lj) this).field_k) {
                  L13: {
                    if (param1 >= 35) {
                      break L13;
                    } else {
                      lj.a(-43);
                      break L13;
                    }
                  }
                  L14: {
                    if (var7 != 0) {
                      var10 = 0;
                      L15: while (true) {
                        if (((lj) this).field_k <= var10) {
                          var10 = 0;
                          L16: while (true) {
                            if (var10 >= ((lj) this).field_k) {
                              break L14;
                            } else {
                              ((lj) this).field_b[((lj) this).field_q[var10]] = var17.e((byte) -93);
                              var10++;
                              continue L16;
                            }
                          }
                        } else {
                          var21 = new byte[64];
                          var17.a(64, (byte) 121, var21, 0);
                          ((lj) this).field_t[((lj) this).field_q[var10]] = var21;
                          var10++;
                          continue L15;
                        }
                      }
                    } else {
                      var10 = 0;
                      L17: while (true) {
                        if (var10 >= ((lj) this).field_k) {
                          break L14;
                        } else {
                          ((lj) this).field_b[((lj) this).field_q[var10]] = var17.e((byte) -93);
                          var10++;
                          continue L17;
                        }
                      }
                    }
                  }
                  L18: {
                    if (-8 >= (var4 ^ -1)) {
                      var10 = 0;
                      L19: while (true) {
                        if (((lj) this).field_k <= var10) {
                          var10 = 0;
                          L20: while (true) {
                            if (var10 >= ((lj) this).field_k) {
                              break L18;
                            } else {
                              var11 = ((lj) this).field_q[var10];
                              var12 = ((lj) this).field_l[var11];
                              var8 = 0;
                              var13 = -1;
                              ((lj) this).field_h[var11] = new int[var12];
                              var14 = 0;
                              L21: while (true) {
                                if (var14 >= var12) {
                                  ((lj) this).field_o[var11] = 1 + var13;
                                  if (var12 == 1 + var13) {
                                    ((lj) this).field_h[var11] = null;
                                    var10++;
                                    continue L20;
                                  } else {
                                    var10++;
                                    continue L20;
                                  }
                                } else {
                                  int dupTemp$6 = var8 + var17.h(-99);
                                  var8 = dupTemp$6;
                                  ((lj) this).field_h[var11][var14] = dupTemp$6;
                                  var15 = dupTemp$6;
                                  if (var15 > var13) {
                                    var13 = var15;
                                    var14++;
                                    continue L21;
                                  } else {
                                    var14++;
                                    continue L21;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          ((lj) this).field_l[((lj) this).field_q[var10]] = var17.h(-110);
                          var10++;
                          continue L19;
                        }
                      }
                    } else {
                      var10 = 0;
                      L22: while (true) {
                        if (((lj) this).field_k <= var10) {
                          var10 = 0;
                          L23: while (true) {
                            if (var10 >= ((lj) this).field_k) {
                              break L18;
                            } else {
                              var11 = ((lj) this).field_q[var10];
                              var8 = 0;
                              var12 = ((lj) this).field_l[var11];
                              ((lj) this).field_h[var11] = new int[var12];
                              var13 = -1;
                              var14 = 0;
                              L24: while (true) {
                                if (var12 <= var14) {
                                  ((lj) this).field_o[var11] = var13 + 1;
                                  if (var12 == var13 - -1) {
                                    ((lj) this).field_h[var11] = null;
                                    var10++;
                                    continue L23;
                                  } else {
                                    var10++;
                                    continue L23;
                                  }
                                } else {
                                  int dupTemp$7 = var8 + var17.f(674914976);
                                  var8 = dupTemp$7;
                                  ((lj) this).field_h[var11][var14] = dupTemp$7;
                                  var15 = dupTemp$7;
                                  if (var13 < var15) {
                                    var13 = var15;
                                    var14++;
                                    continue L24;
                                  } else {
                                    var14++;
                                    continue L24;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          ((lj) this).field_l[((lj) this).field_q[var10]] = var17.f(674914976);
                          var10++;
                          continue L22;
                        }
                      }
                    }
                  }
                  L25: {
                    if (var6 == 0) {
                      break L25;
                    } else {
                      ((lj) this).field_m = new int[1 + var9][];
                      ((lj) this).field_j = new qh[var9 + 1];
                      var10 = 0;
                      L26: while (true) {
                        if (((lj) this).field_k <= var10) {
                          break L25;
                        } else {
                          var11 = ((lj) this).field_q[var10];
                          var12 = ((lj) this).field_l[var11];
                          ((lj) this).field_m[var11] = new int[((lj) this).field_o[var11]];
                          var13 = 0;
                          L27: while (true) {
                            if (((lj) this).field_o[var11] <= var13) {
                              var13 = 0;
                              L28: while (true) {
                                if (var13 >= var12) {
                                  ((lj) this).field_j[var11] = new qh(((lj) this).field_m[var11]);
                                  var10++;
                                  continue L26;
                                } else {
                                  L29: {
                                    if (((lj) this).field_h[var11] == null) {
                                      var14 = var13;
                                      break L29;
                                    } else {
                                      var14 = ((lj) this).field_h[var11][var13];
                                      break L29;
                                    }
                                  }
                                  ((lj) this).field_m[var11][var14] = var17.e((byte) -97);
                                  var13++;
                                  continue L28;
                                }
                              }
                            } else {
                              ((lj) this).field_m[var11][var13] = -1;
                              var13++;
                              continue L27;
                            }
                          }
                        }
                      }
                    }
                  }
                  return;
                } else {
                  ((lj) this).field_p[((lj) this).field_q[var10]] = var17.e((byte) -116);
                  var10++;
                  continue L12;
                }
              }
            }
          }
        }
        throw new RuntimeException();
    }

    final static void a(String param0, long param1, int param2) {
        vk.field_g = 2;
        ij.field_c = param0;
        CharSequence var5 = (CharSequence) (Object) param0;
        ec.field_f = ad.a(var5, -2);
        re.field_p = param1;
        int var4 = -59 % ((param2 - 54) / 48);
        df.a(true);
    }

    lj(byte[] param0, int param1, byte[] param2) {
        int var4 = 0;
        ((lj) this).field_c = ke.a(param0, 21106, param0.length);
        if (((lj) this).field_c != param1) {
            throw new RuntimeException();
        }
        if (param2 != null) {
            if (-65 != (param2.length ^ -1)) {
                throw new RuntimeException();
            }
            ((lj) this).field_r = kh.a(0, param0.length, (byte) 124, param0);
            for (var4 = 0; (var4 ^ -1) > -65; var4++) {
                if (((lj) this).field_r[var4] != param2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.a(param0, (byte) 50);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Join <%0>'s game";
    }
}
