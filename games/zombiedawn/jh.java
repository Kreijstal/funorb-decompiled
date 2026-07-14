/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jh {
    mo[] field_a;
    byte[][] field_f;
    int[] field_t;
    static String field_l;
    private byte[] field_r;
    int[][] field_p;
    int[] field_n;
    int field_m;
    private int[] field_o;
    int field_s;
    int[] field_d;
    static int field_h;
    private int[][] field_b;
    static boolean field_i;
    private int field_q;
    int field_e;
    mo field_g;
    int[] field_c;
    static int field_k;
    int[] field_j;

    final static boolean a(byte param0) {
        n var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        n var5 = null;
        var4 = ZombieDawn.field_J;
        var5 = (n) (Object) dj.field_l.b((byte) 26);
        var1 = var5;
        if (var1 != null) {
          var2 = 1 / ((-61 - param0) / 57);
          var3 = 0;
          L0: while (true) {
            if (var3 >= var1.field_l) {
              return true;
            } else {
              L1: {
                if (null != var5.field_n[var3]) {
                  if (var5.field_n[var3].field_f != 0) {
                    break L1;
                  } else {
                    return false;
                  }
                } else {
                  break L1;
                }
              }
              if (var5.field_m[var3] != null) {
                if (var5.field_m[var3].field_f == 0) {
                  return false;
                } else {
                  var3++;
                  continue L0;
                }
              } else {
                var3++;
                continue L0;
              }
            }
          }
        } else {
          return false;
        }
    }

    public static void a(int param0) {
        if (param0 != 13192) {
            return;
        }
        field_l = null;
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
        de var17 = null;
        byte[] var21 = null;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          var16 = ZombieDawn.field_J;
          var17 = new de(va.a((byte) -122, param0));
          var4 = var17.d((byte) -127);
          if (-6 < (var4 ^ -1)) {
            break L0;
          } else {
            if (7 < var4) {
              break L0;
            } else {
              L1: {
                if (6 <= var4) {
                  ((jh) this).field_e = var17.c(-51);
                  break L1;
                } else {
                  ((jh) this).field_e = 0;
                  break L1;
                }
              }
              L2: {
                var5 = var17.d((byte) -125);
                if (-1 == (1 & var5)) {
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
                if (-1 == (2 & var5)) {
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
                if (7 > var4) {
                  ((jh) this).field_q = var17.f(2);
                  break L4;
                } else {
                  ((jh) this).field_q = var17.a(-129);
                  break L4;
                }
              }
              L5: {
                var8 = 0;
                ((jh) this).field_n = new int[((jh) this).field_q];
                var9 = -1;
                if (var4 < 7) {
                  var10 = 0;
                  L6: while (true) {
                    if (var10 >= ((jh) this).field_q) {
                      break L5;
                    } else {
                      var8 = var8 + var17.f(2);
                      ((jh) this).field_n[var10] = var8 + var17.f(2);
                      if (((jh) this).field_n[var10] > var9) {
                        var9 = ((jh) this).field_n[var10];
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
                    if (((jh) this).field_q <= var10) {
                      break L5;
                    } else {
                      var8 = var8 + var17.a(-129);
                      ((jh) this).field_n[var10] = var8 + var17.a(-129);
                      if (((jh) this).field_n[var10] > var9) {
                        var9 = ((jh) this).field_n[var10];
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
                ((jh) this).field_s = var9 + 1;
                ((jh) this).field_c = new int[((jh) this).field_s];
                ((jh) this).field_d = new int[((jh) this).field_s];
                if (var7 != 0) {
                  ((jh) this).field_f = new byte[((jh) this).field_s][];
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                ((jh) this).field_t = new int[((jh) this).field_s];
                ((jh) this).field_p = new int[((jh) this).field_s][];
                ((jh) this).field_j = new int[((jh) this).field_s];
                if (param1 == -80) {
                  break L9;
                } else {
                  field_l = null;
                  break L9;
                }
              }
              L10: {
                if (var6 != 0) {
                  ((jh) this).field_o = new int[((jh) this).field_s];
                  var10 = 0;
                  L11: while (true) {
                    if (((jh) this).field_s <= var10) {
                      var10 = 0;
                      L12: while (true) {
                        if (var10 >= ((jh) this).field_q) {
                          ((jh) this).field_g = new mo(((jh) this).field_o);
                          break L10;
                        } else {
                          ((jh) this).field_o[((jh) this).field_n[var10]] = var17.c(rd.b((int) param1, 41));
                          var10++;
                          continue L12;
                        }
                      }
                    } else {
                      ((jh) this).field_o[var10] = -1;
                      var10++;
                      continue L11;
                    }
                  }
                } else {
                  break L10;
                }
              }
              var10 = 0;
              L13: while (true) {
                if (var10 >= ((jh) this).field_q) {
                  L14: {
                    if (var7 == 0) {
                      break L14;
                    } else {
                      var10 = 0;
                      L15: while (true) {
                        if (var10 >= ((jh) this).field_q) {
                          break L14;
                        } else {
                          var21 = new byte[64];
                          var17.a(64, 0, var21, 11240);
                          ((jh) this).field_f[((jh) this).field_n[var10]] = var21;
                          var10++;
                          continue L15;
                        }
                      }
                    }
                  }
                  var10 = 0;
                  L16: while (true) {
                    if (var10 >= ((jh) this).field_q) {
                      L17: {
                        if (-8 < (var4 ^ -1)) {
                          var10 = 0;
                          L18: while (true) {
                            if (((jh) this).field_q <= var10) {
                              var10 = 0;
                              L19: while (true) {
                                if (var10 >= ((jh) this).field_q) {
                                  break L17;
                                } else {
                                  var11 = ((jh) this).field_n[var10];
                                  var8 = 0;
                                  var12 = ((jh) this).field_t[var11];
                                  var13 = -1;
                                  ((jh) this).field_p[var11] = new int[var12];
                                  var14 = 0;
                                  L20: while (true) {
                                    if (var12 <= var14) {
                                      ((jh) this).field_d[var11] = var13 + 1;
                                      if (var12 == var13 + 1) {
                                        ((jh) this).field_p[var11] = null;
                                        var10++;
                                        continue L19;
                                      } else {
                                        var10++;
                                        continue L19;
                                      }
                                    } else {
                                      var8 = var8 + var17.f(rd.b((int) param1, -78));
                                      ((jh) this).field_p[var11][var14] = var8 + var17.f(rd.b((int) param1, -78));
                                      var15 = var8 + var17.f(rd.b((int) param1, -78));
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
                              ((jh) this).field_t[((jh) this).field_n[var10]] = var17.f(2);
                              var10++;
                              continue L18;
                            }
                          }
                        } else {
                          var10 = 0;
                          L21: while (true) {
                            if (((jh) this).field_q <= var10) {
                              var10 = 0;
                              L22: while (true) {
                                if (((jh) this).field_q <= var10) {
                                  break L17;
                                } else {
                                  var11 = ((jh) this).field_n[var10];
                                  var12 = ((jh) this).field_t[var11];
                                  var8 = 0;
                                  var13 = -1;
                                  ((jh) this).field_p[var11] = new int[var12];
                                  var14 = 0;
                                  L23: while (true) {
                                    if (var12 <= var14) {
                                      ((jh) this).field_d[var11] = 1 + var13;
                                      if (var13 + 1 == var12) {
                                        ((jh) this).field_p[var11] = null;
                                        var10++;
                                        continue L22;
                                      } else {
                                        var10++;
                                        continue L22;
                                      }
                                    } else {
                                      var8 = var8 + var17.a(-129);
                                      ((jh) this).field_p[var11][var14] = var8 + var17.a(-129);
                                      var15 = var8 + var17.a(-129);
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
                              ((jh) this).field_t[((jh) this).field_n[var10]] = var17.a(-129);
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
                          ((jh) this).field_b = new int[1 + var9][];
                          ((jh) this).field_a = new mo[var9 + 1];
                          var10 = 0;
                          L25: while (true) {
                            if (var10 >= ((jh) this).field_q) {
                              break L24;
                            } else {
                              var11 = ((jh) this).field_n[var10];
                              var12 = ((jh) this).field_t[var11];
                              ((jh) this).field_b[var11] = new int[((jh) this).field_d[var11]];
                              var13 = 0;
                              L26: while (true) {
                                if (var13 >= ((jh) this).field_d[var11]) {
                                  var13 = 0;
                                  L27: while (true) {
                                    if (var12 <= var13) {
                                      ((jh) this).field_a[var11] = new mo(((jh) this).field_b[var11]);
                                      var10++;
                                      continue L25;
                                    } else {
                                      L28: {
                                        if (null != ((jh) this).field_p[var11]) {
                                          var14 = ((jh) this).field_p[var11][var13];
                                          break L28;
                                        } else {
                                          var14 = var13;
                                          break L28;
                                        }
                                      }
                                      ((jh) this).field_b[var11][var14] = var17.c(param1 + 189);
                                      var13++;
                                      continue L27;
                                    }
                                  }
                                } else {
                                  ((jh) this).field_b[var11][var13] = -1;
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
                      ((jh) this).field_c[((jh) this).field_n[var10]] = var17.c(117);
                      var10++;
                      continue L16;
                    }
                  }
                } else {
                  ((jh) this).field_j[((jh) this).field_n[var10]] = var17.c(109);
                  var10++;
                  continue L13;
                }
              }
            }
          }
        }
        throw new RuntimeException();
    }

    jh(byte[] param0, int param1, byte[] param2) {
        int var4 = 0;
        ((jh) this).field_m = ii.a(8099, param0.length, param0);
        if (((jh) this).field_m != param1) {
            throw new RuntimeException();
        }
        if (param2 != null) {
            if (param2.length != 64) {
                throw new RuntimeException();
            }
            ((jh) this).field_r = nl.a(0, param0.length, -128, param0);
            for (var4 = 0; (var4 ^ -1) > -65; var4++) {
                if (((jh) this).field_r[var4] != param2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.a(param0, (byte) -80);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Please wait...";
        field_i = true;
        field_h = 0;
    }
}
