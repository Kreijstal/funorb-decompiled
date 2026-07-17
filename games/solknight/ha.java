/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ha {
    private int[] field_i;
    private int field_h;
    int field_l;
    qg[] field_j;
    int[] field_o;
    int[][] field_a;
    int[] field_f;
    static String field_p;
    private byte[] field_c;
    int field_d;
    int[] field_b;
    qg field_e;
    byte[][] field_q;
    static int field_g;
    int field_m;
    int[] field_s;
    int[] field_r;
    static String field_n;
    private int[][] field_k;

    private final void a(byte param0, byte[] param1) {
        RuntimeException var3 = null;
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
        gb var17 = null;
        byte[] var21 = null;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        String stackIn_99_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_96_0 = null;
        StringBuilder stackOut_96_1 = null;
        RuntimeException stackOut_98_0 = null;
        StringBuilder stackOut_98_1 = null;
        String stackOut_98_2 = null;
        RuntimeException stackOut_97_0 = null;
        StringBuilder stackOut_97_1 = null;
        String stackOut_97_2 = null;
        var16 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var17 = new gb(jh.a(param1, 6));
              var4 = var17.j(255);
              if (5 > var4) {
                break L1;
              } else {
                if (var4 > 7) {
                  break L1;
                } else {
                  L2: {
                    if (var4 < 6) {
                      ((ha) this).field_m = 0;
                      break L2;
                    } else {
                      ((ha) this).field_m = var17.e(true);
                      break L2;
                    }
                  }
                  L3: {
                    var5 = var17.j(255);
                    if ((1 & var5) == 0) {
                      stackOut_10_0 = 0;
                      stackIn_11_0 = stackOut_10_0;
                      break L3;
                    } else {
                      stackOut_9_0 = 1;
                      stackIn_11_0 = stackOut_9_0;
                      break L3;
                    }
                  }
                  L4: {
                    var6 = stackIn_11_0;
                    if ((2 & var5) == 0) {
                      stackOut_13_0 = 0;
                      stackIn_14_0 = stackOut_13_0;
                      break L4;
                    } else {
                      stackOut_12_0 = 1;
                      stackIn_14_0 = stackOut_12_0;
                      break L4;
                    }
                  }
                  L5: {
                    var7 = stackIn_14_0;
                    if (var4 < 7) {
                      ((ha) this).field_h = var17.i(-107);
                      break L5;
                    } else {
                      ((ha) this).field_h = var17.e(6715);
                      break L5;
                    }
                  }
                  L6: {
                    var8 = 0;
                    ((ha) this).field_f = new int[((ha) this).field_h];
                    var9 = -1;
                    if (var4 >= 7) {
                      var10 = 0;
                      L7: while (true) {
                        if (var10 >= ((ha) this).field_h) {
                          break L6;
                        } else {
                          L8: {
                            int dupTemp$4 = var8 + var17.e(6715);
                            var8 = dupTemp$4;
                            ((ha) this).field_f[var10] = dupTemp$4;
                            if (~var9 > ~((ha) this).field_f[var10]) {
                              var9 = ((ha) this).field_f[var10];
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          var10++;
                          continue L7;
                        }
                      }
                    } else {
                      var10 = 0;
                      L9: while (true) {
                        if (var10 >= ((ha) this).field_h) {
                          break L6;
                        } else {
                          L10: {
                            int dupTemp$5 = var8 + var17.i(-126);
                            var8 = dupTemp$5;
                            ((ha) this).field_f[var10] = dupTemp$5;
                            if (var9 >= ((ha) this).field_f[var10]) {
                              break L10;
                            } else {
                              var9 = ((ha) this).field_f[var10];
                              break L10;
                            }
                          }
                          var10++;
                          continue L9;
                        }
                      }
                    }
                  }
                  ((ha) this).field_l = var9 + 1;
                  ((ha) this).field_a = new int[((ha) this).field_l][];
                  ((ha) this).field_b = new int[((ha) this).field_l];
                  if (param0 < -73) {
                    L11: {
                      ((ha) this).field_s = new int[((ha) this).field_l];
                      ((ha) this).field_r = new int[((ha) this).field_l];
                      ((ha) this).field_o = new int[((ha) this).field_l];
                      if (var7 == 0) {
                        break L11;
                      } else {
                        ((ha) this).field_q = new byte[((ha) this).field_l][];
                        break L11;
                      }
                    }
                    L12: {
                      if (var6 != 0) {
                        ((ha) this).field_i = new int[((ha) this).field_l];
                        var10 = 0;
                        L13: while (true) {
                          if (~((ha) this).field_l >= ~var10) {
                            var10 = 0;
                            L14: while (true) {
                              if (~var10 <= ~((ha) this).field_h) {
                                ((ha) this).field_e = new qg(((ha) this).field_i);
                                break L12;
                              } else {
                                ((ha) this).field_i[((ha) this).field_f[var10]] = var17.e(true);
                                var10++;
                                continue L14;
                              }
                            }
                          } else {
                            ((ha) this).field_i[var10] = -1;
                            var10++;
                            continue L13;
                          }
                        }
                      } else {
                        break L12;
                      }
                    }
                    var10 = 0;
                    L15: while (true) {
                      if (~var10 <= ~((ha) this).field_h) {
                        L16: {
                          if (var7 == 0) {
                            break L16;
                          } else {
                            var10 = 0;
                            L17: while (true) {
                              if (~((ha) this).field_h >= ~var10) {
                                break L16;
                              } else {
                                var21 = new byte[64];
                                var17.a(64, 0, -111, var21);
                                ((ha) this).field_q[((ha) this).field_f[var10]] = var21;
                                var10++;
                                continue L17;
                              }
                            }
                          }
                        }
                        var10 = 0;
                        L18: while (true) {
                          if (((ha) this).field_h <= var10) {
                            L19: {
                              if (7 > var4) {
                                var10 = 0;
                                L20: while (true) {
                                  if (((ha) this).field_h <= var10) {
                                    var10 = 0;
                                    L21: while (true) {
                                      if (var10 >= ((ha) this).field_h) {
                                        break L19;
                                      } else {
                                        var11 = ((ha) this).field_f[var10];
                                        var8 = 0;
                                        var12 = ((ha) this).field_r[var11];
                                        var13 = -1;
                                        ((ha) this).field_a[var11] = new int[var12];
                                        var14 = 0;
                                        L22: while (true) {
                                          if (var14 >= var12) {
                                            L23: {
                                              ((ha) this).field_o[var11] = var13 + 1;
                                              if (~(var13 + 1) == ~var12) {
                                                ((ha) this).field_a[var11] = null;
                                                break L23;
                                              } else {
                                                break L23;
                                              }
                                            }
                                            var10++;
                                            continue L21;
                                          } else {
                                            L24: {
                                              int dupTemp$6 = var8 + var17.i(-118);
                                              var8 = dupTemp$6;
                                              ((ha) this).field_a[var11][var14] = dupTemp$6;
                                              var15 = dupTemp$6;
                                              if (~var13 > ~var15) {
                                                var13 = var15;
                                                break L24;
                                              } else {
                                                break L24;
                                              }
                                            }
                                            var14++;
                                            continue L22;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    ((ha) this).field_r[((ha) this).field_f[var10]] = var17.i(46);
                                    var10++;
                                    continue L20;
                                  }
                                }
                              } else {
                                var10 = 0;
                                L25: while (true) {
                                  if (((ha) this).field_h <= var10) {
                                    var10 = 0;
                                    L26: while (true) {
                                      if (((ha) this).field_h <= var10) {
                                        break L19;
                                      } else {
                                        var11 = ((ha) this).field_f[var10];
                                        var8 = 0;
                                        var12 = ((ha) this).field_r[var11];
                                        var13 = -1;
                                        ((ha) this).field_a[var11] = new int[var12];
                                        var14 = 0;
                                        L27: while (true) {
                                          if (var14 >= var12) {
                                            L28: {
                                              ((ha) this).field_o[var11] = var13 - -1;
                                              if (~(1 + var13) != ~var12) {
                                                break L28;
                                              } else {
                                                ((ha) this).field_a[var11] = null;
                                                break L28;
                                              }
                                            }
                                            var10++;
                                            continue L26;
                                          } else {
                                            L29: {
                                              int dupTemp$7 = var8 + var17.e(6715);
                                              var8 = dupTemp$7;
                                              ((ha) this).field_a[var11][var14] = dupTemp$7;
                                              var15 = dupTemp$7;
                                              if (~var13 > ~var15) {
                                                var13 = var15;
                                                break L29;
                                              } else {
                                                break L29;
                                              }
                                            }
                                            var14++;
                                            continue L27;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    ((ha) this).field_r[((ha) this).field_f[var10]] = var17.e(6715);
                                    var10++;
                                    continue L25;
                                  }
                                }
                              }
                            }
                            L30: {
                              if (var6 == 0) {
                                break L30;
                              } else {
                                ((ha) this).field_j = new qg[var9 - -1];
                                ((ha) this).field_k = new int[var9 + 1][];
                                var10 = 0;
                                L31: while (true) {
                                  if (var10 >= ((ha) this).field_h) {
                                    break L30;
                                  } else {
                                    var11 = ((ha) this).field_f[var10];
                                    var12 = ((ha) this).field_r[var11];
                                    ((ha) this).field_k[var11] = new int[((ha) this).field_o[var11]];
                                    var13 = 0;
                                    L32: while (true) {
                                      if (~var13 <= ~((ha) this).field_o[var11]) {
                                        var13 = 0;
                                        L33: while (true) {
                                          if (~var12 >= ~var13) {
                                            ((ha) this).field_j[var11] = new qg(((ha) this).field_k[var11]);
                                            var10++;
                                            continue L31;
                                          } else {
                                            L34: {
                                              if (null == ((ha) this).field_a[var11]) {
                                                var14 = var13;
                                                break L34;
                                              } else {
                                                var14 = ((ha) this).field_a[var11][var13];
                                                break L34;
                                              }
                                            }
                                            ((ha) this).field_k[var11][var14] = var17.e(true);
                                            var13++;
                                            continue L33;
                                          }
                                        }
                                      } else {
                                        ((ha) this).field_k[var11][var13] = -1;
                                        var13++;
                                        continue L32;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            break L0;
                          } else {
                            ((ha) this).field_s[((ha) this).field_f[var10]] = var17.e(true);
                            var10++;
                            continue L18;
                          }
                        }
                      } else {
                        ((ha) this).field_b[((ha) this).field_f[var10]] = var17.e(true);
                        var10++;
                        continue L15;
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L35: {
            var3 = decompiledCaughtException;
            stackOut_96_0 = (RuntimeException) var3;
            stackOut_96_1 = new StringBuilder().append("ha.B(").append(param0).append(44);
            stackIn_98_0 = stackOut_96_0;
            stackIn_98_1 = stackOut_96_1;
            stackIn_97_0 = stackOut_96_0;
            stackIn_97_1 = stackOut_96_1;
            if (param1 == null) {
              stackOut_98_0 = (RuntimeException) (Object) stackIn_98_0;
              stackOut_98_1 = (StringBuilder) (Object) stackIn_98_1;
              stackOut_98_2 = "null";
              stackIn_99_0 = stackOut_98_0;
              stackIn_99_1 = stackOut_98_1;
              stackIn_99_2 = stackOut_98_2;
              break L35;
            } else {
              stackOut_97_0 = (RuntimeException) (Object) stackIn_97_0;
              stackOut_97_1 = (StringBuilder) (Object) stackIn_97_1;
              stackOut_97_2 = "{...}";
              stackIn_99_0 = stackOut_97_0;
              stackIn_99_1 = stackOut_97_1;
              stackIn_99_2 = stackOut_97_2;
              break L35;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_99_0, stackIn_99_2 + 41);
        }
    }

    final static void a(gg param0, byte param1, gg param2) {
        if (!(param0.field_a == null)) {
            param0.c(10);
        }
        param0.field_d = param2;
        param0.field_a = param2.field_a;
        param0.field_a.field_d = param0;
        if (param1 <= 15) {
            return;
        }
        try {
            param0.field_d.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "ha.A(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    public static void a(int param0) {
        field_n = null;
        field_p = null;
    }

    final static o[] a(int param0, int param1) {
        int var3 = 115 / ((param1 - 7) / 63);
        o[] var4 = new o[9];
        o[] var2 = var4;
        var4[4] = ib.a(64, true, param0);
        return var2;
    }

    ha(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
            ((ha) this).field_d = gl.a(param0.length, param0, 119);
            if (((ha) this).field_d != param1) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if (64 != param2.length) {
                    throw new RuntimeException();
                }
                ((ha) this).field_c = q.a(param0.length, 0, 89, param0);
                for (var4_int = 0; var4_int < 64; var4_int++) {
                    if (((ha) this).field_c[var4_int] != param2[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            this.a((byte) -88, param0);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "ha.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Score: <%0>";
        field_n = "to keep fullscreen or";
    }
}
