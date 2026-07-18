/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ko {
    private byte[] field_o;
    private int[] field_k;
    int field_b;
    static int field_s;
    int field_f;
    lm field_n;
    static int field_e;
    int[] field_g;
    int[] field_l;
    static mh field_j;
    int[] field_r;
    lm[] field_i;
    int[] field_p;
    int[] field_m;
    private int[][] field_t;
    int field_a;
    private int field_d;
    int[][] field_h;
    byte[][] field_c;
    static String field_q;

    private final void a(byte[] param0, boolean param1) {
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
        wq var17 = null;
        byte[] var21 = null;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_93_0 = null;
        StringBuilder stackIn_93_1 = null;
        RuntimeException stackIn_94_0 = null;
        StringBuilder stackIn_94_1 = null;
        RuntimeException stackIn_95_0 = null;
        StringBuilder stackIn_95_1 = null;
        String stackIn_95_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_92_0 = null;
        StringBuilder stackOut_92_1 = null;
        RuntimeException stackOut_94_0 = null;
        StringBuilder stackOut_94_1 = null;
        String stackOut_94_2 = null;
        RuntimeException stackOut_93_0 = null;
        StringBuilder stackOut_93_1 = null;
        String stackOut_93_2 = null;
        var16 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var17 = new wq(i.a(true, param0));
              var4 = var17.l(255);
              if (var4 < 5) {
                break L1;
              } else {
                if (var4 > 7) {
                  break L1;
                } else {
                  L2: {
                    if (var4 < 6) {
                      ((ko) this).field_a = 0;
                      break L2;
                    } else {
                      ((ko) this).field_a = var17.e(255);
                      break L2;
                    }
                  }
                  L3: {
                    var5 = var17.l(255);
                    if (0 == (var5 & 1)) {
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
                    if (0 == (var5 & 2)) {
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
                    if (var4 >= 7) {
                      ((ko) this).field_d = var17.c(false);
                      break L5;
                    } else {
                      ((ko) this).field_d = var17.i(65280);
                      break L5;
                    }
                  }
                  L6: {
                    var8 = 0;
                    ((ko) this).field_g = new int[((ko) this).field_d];
                    var9 = -1;
                    if (var4 >= 7) {
                      var10 = 0;
                      L7: while (true) {
                        if (var10 >= ((ko) this).field_d) {
                          break L6;
                        } else {
                          L8: {
                            int dupTemp$4 = var8 + var17.c(false);
                            var8 = dupTemp$4;
                            ((ko) this).field_g[var10] = dupTemp$4;
                            if (var9 < ((ko) this).field_g[var10]) {
                              var9 = ((ko) this).field_g[var10];
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
                        if (var10 >= ((ko) this).field_d) {
                          break L6;
                        } else {
                          L10: {
                            int dupTemp$5 = var8 + var17.i(65280);
                            var8 = dupTemp$5;
                            ((ko) this).field_g[var10] = dupTemp$5;
                            if (var9 >= ((ko) this).field_g[var10]) {
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          var10++;
                          continue L9;
                        }
                      }
                    }
                  }
                  L11: {
                    ((ko) this).field_f = 1 + var9;
                    ((ko) this).field_r = new int[((ko) this).field_f];
                    if (var7 == 0) {
                      break L11;
                    } else {
                      ((ko) this).field_c = new byte[((ko) this).field_f][];
                      break L11;
                    }
                  }
                  L12: {
                    ((ko) this).field_l = new int[((ko) this).field_f];
                    ((ko) this).field_p = new int[((ko) this).field_f];
                    ((ko) this).field_m = new int[((ko) this).field_f];
                    ((ko) this).field_h = new int[((ko) this).field_f][];
                    if (var6 != 0) {
                      ((ko) this).field_k = new int[((ko) this).field_f];
                      var10 = 0;
                      L13: while (true) {
                        if (((ko) this).field_f <= var10) {
                          var10 = 0;
                          L14: while (true) {
                            if (var10 >= ((ko) this).field_d) {
                              ((ko) this).field_n = new lm(((ko) this).field_k);
                              break L12;
                            } else {
                              ((ko) this).field_k[((ko) this).field_g[var10]] = var17.e(255);
                              var10++;
                              continue L14;
                            }
                          }
                        } else {
                          ((ko) this).field_k[var10] = -1;
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
                    if (((ko) this).field_d <= var10) {
                      L16: {
                        if (var7 == 0) {
                          break L16;
                        } else {
                          var10 = 0;
                          L17: while (true) {
                            if (var10 >= ((ko) this).field_d) {
                              break L16;
                            } else {
                              var21 = new byte[64];
                              var17.a(0, var21, 110, 64);
                              ((ko) this).field_c[((ko) this).field_g[var10]] = var21;
                              var10++;
                              continue L17;
                            }
                          }
                        }
                      }
                      var10 = 0;
                      L18: while (true) {
                        if (((ko) this).field_d <= var10) {
                          L19: {
                            if (var4 < 7) {
                              var10 = 0;
                              L20: while (true) {
                                if (var10 >= ((ko) this).field_d) {
                                  var10 = 0;
                                  L21: while (true) {
                                    if (((ko) this).field_d <= var10) {
                                      break L19;
                                    } else {
                                      var11 = ((ko) this).field_g[var10];
                                      var8 = 0;
                                      var12 = ((ko) this).field_m[var11];
                                      var13 = -1;
                                      ((ko) this).field_h[var11] = new int[var12];
                                      var14 = 0;
                                      L22: while (true) {
                                        if (var14 >= var12) {
                                          L23: {
                                            ((ko) this).field_l[var11] = 1 + var13;
                                            if (var13 - -1 == var12) {
                                              ((ko) this).field_h[var11] = null;
                                              break L23;
                                            } else {
                                              break L23;
                                            }
                                          }
                                          var10++;
                                          continue L21;
                                        } else {
                                          L24: {
                                            int dupTemp$6 = var8 + var17.i(65280);
                                            var8 = dupTemp$6;
                                            ((ko) this).field_h[var11][var14] = dupTemp$6;
                                            var15 = dupTemp$6;
                                            if (var15 <= var13) {
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
                                  ((ko) this).field_m[((ko) this).field_g[var10]] = var17.i(65280);
                                  var10++;
                                  continue L20;
                                }
                              }
                            } else {
                              var10 = 0;
                              L25: while (true) {
                                if (var10 >= ((ko) this).field_d) {
                                  var10 = 0;
                                  L26: while (true) {
                                    if (((ko) this).field_d <= var10) {
                                      break L19;
                                    } else {
                                      var11 = ((ko) this).field_g[var10];
                                      var8 = 0;
                                      var12 = ((ko) this).field_m[var11];
                                      ((ko) this).field_h[var11] = new int[var12];
                                      var13 = -1;
                                      var14 = 0;
                                      L27: while (true) {
                                        if (var14 >= var12) {
                                          L28: {
                                            ((ko) this).field_l[var11] = var13 + 1;
                                            if (1 + var13 != var12) {
                                              break L28;
                                            } else {
                                              ((ko) this).field_h[var11] = null;
                                              break L28;
                                            }
                                          }
                                          var10++;
                                          continue L26;
                                        } else {
                                          L29: {
                                            int dupTemp$7 = var8 + var17.c(false);
                                            var8 = dupTemp$7;
                                            ((ko) this).field_h[var11][var14] = dupTemp$7;
                                            var15 = dupTemp$7;
                                            if (var13 >= var15) {
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
                                  ((ko) this).field_m[((ko) this).field_g[var10]] = var17.c(false);
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
                              ((ko) this).field_i = new lm[var9 + 1];
                              ((ko) this).field_t = new int[1 + var9][];
                              var10 = 0;
                              L31: while (true) {
                                if (((ko) this).field_d <= var10) {
                                  break L30;
                                } else {
                                  var11 = ((ko) this).field_g[var10];
                                  var12 = ((ko) this).field_m[var11];
                                  ((ko) this).field_t[var11] = new int[((ko) this).field_l[var11]];
                                  var13 = 0;
                                  L32: while (true) {
                                    if (((ko) this).field_l[var11] <= var13) {
                                      var13 = 0;
                                      L33: while (true) {
                                        if (var13 >= var12) {
                                          ((ko) this).field_i[var11] = new lm(((ko) this).field_t[var11]);
                                          var10++;
                                          continue L31;
                                        } else {
                                          L34: {
                                            if (null == ((ko) this).field_h[var11]) {
                                              var14 = var13;
                                              break L34;
                                            } else {
                                              var14 = ((ko) this).field_h[var11][var13];
                                              break L34;
                                            }
                                          }
                                          ((ko) this).field_t[var11][var14] = var17.e(255);
                                          var13++;
                                          continue L33;
                                        }
                                      }
                                    } else {
                                      ((ko) this).field_t[var11][var13] = -1;
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
                          ((ko) this).field_r[((ko) this).field_g[var10]] = var17.e(255);
                          var10++;
                          continue L18;
                        }
                      }
                    } else {
                      ((ko) this).field_p[((ko) this).field_g[var10]] = var17.e(255);
                      var10++;
                      continue L15;
                    }
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
            stackOut_92_0 = (RuntimeException) var3;
            stackOut_92_1 = new StringBuilder().append("ko.A(");
            stackIn_94_0 = stackOut_92_0;
            stackIn_94_1 = stackOut_92_1;
            stackIn_93_0 = stackOut_92_0;
            stackIn_93_1 = stackOut_92_1;
            if (param0 == null) {
              stackOut_94_0 = (RuntimeException) (Object) stackIn_94_0;
              stackOut_94_1 = (StringBuilder) (Object) stackIn_94_1;
              stackOut_94_2 = "null";
              stackIn_95_0 = stackOut_94_0;
              stackIn_95_1 = stackOut_94_1;
              stackIn_95_2 = stackOut_94_2;
              break L35;
            } else {
              stackOut_93_0 = (RuntimeException) (Object) stackIn_93_0;
              stackOut_93_1 = (StringBuilder) (Object) stackIn_93_1;
              stackOut_93_2 = "{...}";
              stackIn_95_0 = stackOut_93_0;
              stackIn_95_1 = stackOut_93_1;
              stackIn_95_2 = stackOut_93_2;
              break L35;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_95_0, stackIn_95_2 + ',' + false + ')');
        }
    }

    final static void a(int param0) {
        int var2 = BrickABrac.field_J ? 1 : 0;
        if (ml.field_b > 0) {
            ml.field_b = ml.field_b - 1;
        } else {
            if (pe.field_j > 0) {
                pe.field_j = pe.field_j - 1;
            } else {
                if (eg.field_m > 0) {
                    eg.field_m = eg.field_m - 1;
                }
            }
            return;
        }
    }

    final static void a(int param0, int param1, jp param2, int param3, jp param4, int param5, int param6, int param7, int param8, int param9, jp param10) {
        RuntimeException var11 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              param4.d(param8 - (-((-param4.field_x + param6) / 2) + -(5 * param3 >> 16)), param9);
              if (param0 <= -20) {
                break L1;
              } else {
                field_s = 123;
                break L1;
              }
            }
            param10.c(-(30 / param7) + (param8 + ((-param10.field_x + param6) / 2 - -(param3 * 10 >> 16))), 37 / param7 + (-param10.field_z + 480 + param9) - -param1);
            param2.c(param8 - (-((param6 - param2.field_x) / 2) + -(20 * param3 >> 16)) - 5 / param7, -param2.field_z + 480 + (param9 - -param1));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var11 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var11;
            stackOut_4_1 = new StringBuilder().append("ko.C(").append(param0).append(',').append(param1).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param3).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param4 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param10 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
    }

    public static void a(byte param0) {
        field_q = null;
        field_j = null;
    }

    ko(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
            ((ko) this).field_b = cg.a(param0.length, param0, (byte) -86);
            if (param1 != ((ko) this).field_b) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if (-65 != param2.length) {
                    throw new RuntimeException();
                }
                ((ko) this).field_o = jd.a(param0, 0, -14970, param0.length);
                for (var4_int = 0; -65 > var4_int; var4_int++) {
                    if (((ko) this).field_o[var4_int] != param2[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            this.a(param0, false);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "ko.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "PER MONTH";
    }
}
