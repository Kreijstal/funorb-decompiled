/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class be {
    qq field_d;
    static String field_m;
    static String field_k;
    static String field_f;
    int[][] field_i;
    int[] field_l;
    private byte[] field_g;
    int field_h;
    int[] field_s;
    int field_o;
    private int[][] field_c;
    byte[][] field_a;
    int[] field_p;
    int field_e;
    qq[] field_n;
    private int field_q;
    int[] field_b;
    private int[] field_j;
    int[] field_r;

    private final void a(int param0, byte[] param1) {
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
        k var17 = null;
        byte[] var21 = null;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          var16 = ZombieDawnMulti.field_E ? 1 : 0;
          var17 = new k(hb.a(param1, param0));
          var4 = var17.g(31365);
          if (5 > var4) {
            break L0;
          } else {
            if (7 >= var4) {
              L1: {
                if (-7 >= (var4 ^ -1)) {
                  ((be) this).field_h = var17.i(param0 ^ -1478490344);
                  break L1;
                } else {
                  ((be) this).field_h = 0;
                  break L1;
                }
              }
              L2: {
                var5 = var17.g(31365);
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
                if (-1 == (var5 & 2)) {
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
                if (-8 > var4) {
                  ((be) this).field_q = var17.d((byte) 69);
                  break L4;
                } else {
                  ((be) this).field_q = var17.e((byte) -49);
                  break L4;
                }
              }
              L5: {
                var8 = 0;
                ((be) this).field_l = new int[((be) this).field_q];
                var9 = -1;
                if (var4 >= 7) {
                  var10 = 0;
                  L6: while (true) {
                    if (var10 >= ((be) this).field_q) {
                      break L5;
                    } else {
                      var8 = var8 + var17.e((byte) -49);
                      ((be) this).field_l[var10] = var8 + var17.e((byte) -49);
                      if (((be) this).field_l[var10] > var9) {
                        var9 = ((be) this).field_l[var10];
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
                    if (((be) this).field_q <= var10) {
                      break L5;
                    } else {
                      var8 = var8 + var17.d((byte) 69);
                      ((be) this).field_l[var10] = var8 + var17.d((byte) 69);
                      if (((be) this).field_l[var10] > var9) {
                        var9 = ((be) this).field_l[var10];
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
                ((be) this).field_e = var9 - -1;
                ((be) this).field_r = new int[((be) this).field_e];
                ((be) this).field_p = new int[((be) this).field_e];
                ((be) this).field_s = new int[((be) this).field_e];
                ((be) this).field_b = new int[((be) this).field_e];
                if (var7 == 0) {
                  break L8;
                } else {
                  ((be) this).field_a = new byte[((be) this).field_e][];
                  break L8;
                }
              }
              L9: {
                ((be) this).field_i = new int[((be) this).field_e][];
                if (var6 != 0) {
                  ((be) this).field_j = new int[((be) this).field_e];
                  var10 = 0;
                  L10: while (true) {
                    if (var10 >= ((be) this).field_e) {
                      var10 = 0;
                      L11: while (true) {
                        if (((be) this).field_q <= var10) {
                          ((be) this).field_d = new qq(((be) this).field_j);
                          break L9;
                        } else {
                          ((be) this).field_j[((be) this).field_l[var10]] = var17.i(param0 + -1478490344);
                          var10++;
                          continue L11;
                        }
                      }
                    } else {
                      ((be) this).field_j[var10] = -1;
                      var10++;
                      continue L10;
                    }
                  }
                } else {
                  break L9;
                }
              }
              var10 = 0;
              L12: while (true) {
                if (((be) this).field_q <= var10) {
                  L13: {
                    if (var7 != 0) {
                      var10 = 0;
                      L14: while (true) {
                        if (((be) this).field_q <= var10) {
                          var10 = 0;
                          L15: while (true) {
                            if (((be) this).field_q <= var10) {
                              break L13;
                            } else {
                              ((be) this).field_p[((be) this).field_l[var10]] = var17.i(vg.a(param0, -1478490344));
                              var10++;
                              continue L15;
                            }
                          }
                        } else {
                          var21 = new byte[64];
                          var17.a(0, param0 + -6351, 64, var21);
                          ((be) this).field_a[((be) this).field_l[var10]] = var21;
                          var10++;
                          continue L14;
                        }
                      }
                    } else {
                      var10 = 0;
                      L16: while (true) {
                        if (((be) this).field_q <= var10) {
                          break L13;
                        } else {
                          ((be) this).field_p[((be) this).field_l[var10]] = var17.i(vg.a(param0, -1478490344));
                          var10++;
                          continue L16;
                        }
                      }
                    }
                  }
                  L17: {
                    if ((var4 ^ -1) <= -8) {
                      var10 = 0;
                      L18: while (true) {
                        if (var10 >= ((be) this).field_q) {
                          var10 = 0;
                          L19: while (true) {
                            if (((be) this).field_q <= var10) {
                              break L17;
                            } else {
                              var11 = ((be) this).field_l[var10];
                              var12 = ((be) this).field_s[var11];
                              var8 = 0;
                              ((be) this).field_i[var11] = new int[var12];
                              var13 = -1;
                              var14 = 0;
                              L20: while (true) {
                                if (var12 <= var14) {
                                  ((be) this).field_b[var11] = 1 + var13;
                                  if (var13 - -1 == var12) {
                                    ((be) this).field_i[var11] = null;
                                    var10++;
                                    continue L19;
                                  } else {
                                    var10++;
                                    continue L19;
                                  }
                                } else {
                                  var8 = var8 + var17.e((byte) -49);
                                  ((be) this).field_i[var11][var14] = var8 + var17.e((byte) -49);
                                  var15 = var8 + var17.e((byte) -49);
                                  if (var15 > var13) {
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
                          ((be) this).field_s[((be) this).field_l[var10]] = var17.e((byte) -49);
                          var10++;
                          continue L18;
                        }
                      }
                    } else {
                      var10 = 0;
                      L21: while (true) {
                        if (((be) this).field_q <= var10) {
                          var10 = 0;
                          L22: while (true) {
                            if (((be) this).field_q <= var10) {
                              break L17;
                            } else {
                              var11 = ((be) this).field_l[var10];
                              var12 = ((be) this).field_s[var11];
                              var8 = 0;
                              ((be) this).field_i[var11] = new int[var12];
                              var13 = -1;
                              var14 = 0;
                              L23: while (true) {
                                if (var12 <= var14) {
                                  ((be) this).field_b[var11] = 1 + var13;
                                  if (var13 - -1 == var12) {
                                    ((be) this).field_i[var11] = null;
                                    var10++;
                                    continue L22;
                                  } else {
                                    var10++;
                                    continue L22;
                                  }
                                } else {
                                  var8 = var8 + var17.d((byte) 69);
                                  ((be) this).field_i[var11][var14] = var8 + var17.d((byte) 69);
                                  var15 = var8 + var17.d((byte) 69);
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
                          ((be) this).field_s[((be) this).field_l[var10]] = var17.d((byte) 69);
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
                      ((be) this).field_n = new qq[1 + var9];
                      ((be) this).field_c = new int[1 + var9][];
                      var10 = 0;
                      L25: while (true) {
                        if (var10 >= ((be) this).field_q) {
                          break L24;
                        } else {
                          var11 = ((be) this).field_l[var10];
                          var12 = ((be) this).field_s[var11];
                          ((be) this).field_c[var11] = new int[((be) this).field_b[var11]];
                          var13 = 0;
                          L26: while (true) {
                            if (var13 >= ((be) this).field_b[var11]) {
                              var13 = 0;
                              L27: while (true) {
                                if (var13 >= var12) {
                                  ((be) this).field_n[var11] = new qq(((be) this).field_c[var11]);
                                  var10++;
                                  continue L25;
                                } else {
                                  L28: {
                                    if (((be) this).field_i[var11] == null) {
                                      var14 = var13;
                                      break L28;
                                    } else {
                                      var14 = ((be) this).field_i[var11][var13];
                                      break L28;
                                    }
                                  }
                                  ((be) this).field_c[var11][var14] = var17.i(-1478490344);
                                  var13++;
                                  continue L27;
                                }
                              }
                            } else {
                              ((be) this).field_c[var11][var13] = -1;
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
                  ((be) this).field_r[((be) this).field_l[var10]] = var17.i(param0 + -1478490344);
                  var10++;
                  continue L12;
                }
              }
            } else {
              break L0;
            }
          }
        }
        throw new RuntimeException();
    }

    final static void a(long param0, boolean param1) {
        InterruptedException var3 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            if (param1) {
              break L0;
            } else {
              field_f = null;
              break L0;
            }
          }
          Thread.sleep(param0);
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
        }
        var3 = (InterruptedException) (Object) decompiledCaughtException;
    }

    public static void a(int param0) {
        field_f = null;
        field_m = null;
        if (param0 != 0) {
            field_f = null;
        }
        field_k = null;
    }

    be(byte[] param0, int param1, byte[] param2) {
        int var4 = 0;
        ((be) this).field_o = pb.a(param0, param0.length, (byte) -120);
        if (((be) this).field_o != param1) {
            throw new RuntimeException();
        }
        if (param2 != null) {
            if (64 != param2.length) {
                throw new RuntimeException();
            }
            ((be) this).field_g = ho.a(4246, 0, param0, param0.length);
            for (var4 = 0; var4 < 64; var4++) {
                if (((be) this).field_g[var4] != param2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.a(0, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Hide chat to continue";
        field_k = "Asking to join <%0>'s game...";
        field_f = "No";
    }
}
