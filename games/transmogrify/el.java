/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class el {
    private int field_u;
    int[] field_s;
    static ce field_n;
    int field_b;
    static int[] field_m;
    static boolean field_g;
    private int[][] field_o;
    private int[] field_k;
    int[] field_i;
    int[] field_c;
    private byte[] field_e;
    int field_l;
    db[] field_t;
    int field_r;
    db field_h;
    int[] field_q;
    int[] field_j;
    byte[][] field_p;
    int[][] field_f;
    static String field_a;
    static int field_d;

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
        oa var17 = null;
        byte[] var21 = null;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        L0: {
          var16 = Transmogrify.field_A ? 1 : 0;
          var17 = new oa(lk.a(-110, param0));
          var4 = var17.d((byte) 85);
          if (var4 < 5) {
            break L0;
          } else {
            if (var4 > 7) {
              break L0;
            } else {
              L1: {
                if (6 <= var4) {
                  ((el) this).field_b = var17.c((byte) -108);
                  break L1;
                } else {
                  ((el) this).field_b = 0;
                  break L1;
                }
              }
              L2: {
                var5 = var17.d((byte) 52);
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
                if (var4 >= 7) {
                  ((el) this).field_u = var17.h(-16777216);
                  break L3;
                } else {
                  ((el) this).field_u = var17.a((byte) -102);
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
                ((el) this).field_c = new int[((el) this).field_u];
                var9 = -1;
                if ((var4 ^ -1) > -8) {
                  var10 = 0;
                  L6: while (true) {
                    if (((el) this).field_u <= var10) {
                      break L5;
                    } else {
                      var8 = var8 + var17.a((byte) -95);
                      ((el) this).field_c[var10] = var8 + var17.a((byte) -95);
                      if (((el) this).field_c[var10] > var9) {
                        var9 = ((el) this).field_c[var10];
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
                    if (((el) this).field_u <= var10) {
                      break L5;
                    } else {
                      var8 = var8 + var17.h(-16777216);
                      ((el) this).field_c[var10] = var8 + var17.h(-16777216);
                      if (var9 < ((el) this).field_c[var10]) {
                        var9 = ((el) this).field_c[var10];
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
                ((el) this).field_l = var9 - -1;
                ((el) this).field_q = new int[((el) this).field_l];
                ((el) this).field_j = new int[((el) this).field_l];
                ((el) this).field_i = new int[((el) this).field_l];
                ((el) this).field_f = new int[((el) this).field_l][];
                ((el) this).field_s = new int[((el) this).field_l];
                if (var7 == 0) {
                  break L8;
                } else {
                  ((el) this).field_p = new byte[((el) this).field_l][];
                  break L8;
                }
              }
              L9: {
                if (var6 != 0) {
                  ((el) this).field_k = new int[((el) this).field_l];
                  var10 = 0;
                  L10: while (true) {
                    if (var10 >= ((el) this).field_l) {
                      var10 = 0;
                      L11: while (true) {
                        if (var10 >= ((el) this).field_u) {
                          ((el) this).field_h = new db(((el) this).field_k);
                          break L9;
                        } else {
                          ((el) this).field_k[((el) this).field_c[var10]] = var17.c((byte) -128);
                          var10++;
                          continue L11;
                        }
                      }
                    } else {
                      ((el) this).field_k[var10] = -1;
                      var10++;
                      continue L10;
                    }
                  }
                } else {
                  break L9;
                }
              }
              L12: {
                if (param1 <= -111) {
                  break L12;
                } else {
                  boolean discarded$1 = el.a(-92);
                  break L12;
                }
              }
              var10 = 0;
              L13: while (true) {
                if (((el) this).field_u <= var10) {
                  L14: {
                    if (var7 == 0) {
                      break L14;
                    } else {
                      var10 = 0;
                      L15: while (true) {
                        if (((el) this).field_u <= var10) {
                          break L14;
                        } else {
                          var21 = new byte[64];
                          var17.a(64, 2, var21, 0);
                          ((el) this).field_p[((el) this).field_c[var10]] = var21;
                          var10++;
                          continue L15;
                        }
                      }
                    }
                  }
                  var10 = 0;
                  L16: while (true) {
                    if (((el) this).field_u <= var10) {
                      L17: {
                        if (var4 >= 7) {
                          var10 = 0;
                          L18: while (true) {
                            if (var10 >= ((el) this).field_u) {
                              var10 = 0;
                              L19: while (true) {
                                if (((el) this).field_u <= var10) {
                                  break L17;
                                } else {
                                  var11 = ((el) this).field_c[var10];
                                  var8 = 0;
                                  var12 = ((el) this).field_s[var11];
                                  ((el) this).field_f[var11] = new int[var12];
                                  var13 = -1;
                                  var14 = 0;
                                  L20: while (true) {
                                    if (var12 <= var14) {
                                      ((el) this).field_i[var11] = 1 + var13;
                                      if (var12 == var13 - -1) {
                                        ((el) this).field_f[var11] = null;
                                        var10++;
                                        continue L19;
                                      } else {
                                        var10++;
                                        continue L19;
                                      }
                                    } else {
                                      var8 = var8 + var17.h(-16777216);
                                      ((el) this).field_f[var11][var14] = var8 + var17.h(-16777216);
                                      var15 = var8 + var17.h(-16777216);
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
                              ((el) this).field_s[((el) this).field_c[var10]] = var17.h(-16777216);
                              var10++;
                              continue L18;
                            }
                          }
                        } else {
                          var10 = 0;
                          L21: while (true) {
                            if (((el) this).field_u <= var10) {
                              var10 = 0;
                              L22: while (true) {
                                if (((el) this).field_u <= var10) {
                                  break L17;
                                } else {
                                  var11 = ((el) this).field_c[var10];
                                  var12 = ((el) this).field_s[var11];
                                  var8 = 0;
                                  ((el) this).field_f[var11] = new int[var12];
                                  var13 = -1;
                                  var14 = 0;
                                  L23: while (true) {
                                    if (var12 <= var14) {
                                      ((el) this).field_i[var11] = 1 + var13;
                                      if (var13 + 1 == var12) {
                                        ((el) this).field_f[var11] = null;
                                        var10++;
                                        continue L22;
                                      } else {
                                        var10++;
                                        continue L22;
                                      }
                                    } else {
                                      var8 = var8 + var17.a((byte) -96);
                                      ((el) this).field_f[var11][var14] = var8 + var17.a((byte) -96);
                                      var15 = var8 + var17.a((byte) -96);
                                      if (var13 < var15) {
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
                              ((el) this).field_s[((el) this).field_c[var10]] = var17.a((byte) -121);
                              var10++;
                              continue L21;
                            }
                          }
                        }
                      }
                      L24: {
                        if (var6 != 0) {
                          ((el) this).field_t = new db[var9 + 1];
                          ((el) this).field_o = new int[var9 + 1][];
                          var10 = 0;
                          L25: while (true) {
                            if (((el) this).field_u <= var10) {
                              break L24;
                            } else {
                              var11 = ((el) this).field_c[var10];
                              var12 = ((el) this).field_s[var11];
                              ((el) this).field_o[var11] = new int[((el) this).field_i[var11]];
                              var13 = 0;
                              L26: while (true) {
                                if (((el) this).field_i[var11] <= var13) {
                                  var13 = 0;
                                  L27: while (true) {
                                    if (var12 <= var13) {
                                      ((el) this).field_t[var11] = new db(((el) this).field_o[var11]);
                                      var10++;
                                      continue L25;
                                    } else {
                                      L28: {
                                        if (((el) this).field_f[var11] != null) {
                                          var14 = ((el) this).field_f[var11][var13];
                                          break L28;
                                        } else {
                                          var14 = var13;
                                          break L28;
                                        }
                                      }
                                      ((el) this).field_o[var11][var14] = var17.c((byte) -126);
                                      var13++;
                                      continue L27;
                                    }
                                  }
                                } else {
                                  ((el) this).field_o[var11][var13] = -1;
                                  var13++;
                                  continue L26;
                                }
                              }
                            }
                          }
                        } else {
                          break L24;
                        }
                      }
                      return;
                    } else {
                      ((el) this).field_q[((el) this).field_c[var10]] = var17.c((byte) -123);
                      var10++;
                      continue L16;
                    }
                  }
                } else {
                  ((el) this).field_j[((el) this).field_c[var10]] = var17.c((byte) -127);
                  var10++;
                  continue L13;
                }
              }
            }
          }
        }
        throw new RuntimeException();
    }

    final static boolean a(int param0, char param1) {
        char[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        L0: {
          var5 = Transmogrify.field_A ? 1 : 0;
          if (0 >= param1) {
            break L0;
          } else {
            if (param1 < 128) {
              return true;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (param1 < 160) {
            break L1;
          } else {
            if (param1 > 255) {
              break L1;
            } else {
              return true;
            }
          }
        }
        L2: {
          if (param1 != 0) {
            var6 = af.field_a;
            var2 = var6;
            var3 = 0;
            L3: while (true) {
              if (var6.length <= var3) {
                break L2;
              } else {
                var4 = var6[var3];
                if (param1 == var4) {
                  return true;
                } else {
                  var3++;
                  continue L3;
                }
              }
            }
          } else {
            break L2;
          }
        }
        L4: {
          if (param0 == -9904) {
            break L4;
          } else {
            field_n = null;
            break L4;
          }
        }
        return false;
    }

    final static void b(int param0) {
        int var1 = 0;
        int var2 = Transmogrify.field_A ? 1 : 0;
        th.field_c.a(0);
        for (var1 = 0; var1 < 32; var1++) {
            kd.field_b[var1] = 0L;
        }
        if (param0 != -6491) {
            boolean discarded$0 = el.a(5);
        }
        for (var1 = 0; var1 < 32; var1++) {
            ik.field_ib[var1] = 0L;
        }
        ca.field_b = 0;
    }

    final static void a(int param0, byte param1, String param2, String[] param3) {
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          var5 = Transmogrify.field_A ? 1 : 0;
          if (param1 == 33) {
            break L0;
          } else {
            el.a((byte) -81);
            break L0;
          }
        }
        L1: {
          rh.field_v = gd.field_l;
          if (-256 != param0) {
            L2: {
              if (-101 > param0) {
                break L2;
              } else {
                if (param0 <= 105) {
                  q.field_h = ve.a(param3, (byte) -113);
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            q.field_h = mk.a(242763393, param2, param0);
            break L1;
          } else {
            L3: {
              if (ab.field_j >= 13) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L3;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L3;
              }
            }
            q.field_h = de.a(stackIn_6_0 != 0, (byte) -116);
            break L1;
          }
        }
    }

    final static boolean a(int param0) {
        if (param0 <= 116) {
            return true;
        }
        return c.field_d;
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 < 75) {
            field_a = null;
        }
        field_m = null;
        field_n = null;
    }

    el(byte[] param0, int param1, byte[] param2) {
        int var4 = 0;
        ((el) this).field_r = v.a(param0, param0.length, (byte) 40);
        if (((el) this).field_r != param1) {
            throw new RuntimeException();
        }
        if (param2 != null) {
            if (param2.length != 64) {
                throw new RuntimeException();
            }
            ((el) this).field_e = n.a(param0, param0.length, -5705, 0);
            for (var4 = 0; var4 < 64; var4++) {
                if (param2[var4] != ((el) this).field_e[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.a(param0, (byte) -114);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new int[8192];
        field_a = "Go Back";
        field_n = new ce();
        field_d = -1;
    }
}
