/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class f {
    int[] field_d;
    byte[][] field_h;
    static ed field_o;
    private int field_c;
    private int[][] field_r;
    int[] field_i;
    int[] field_l;
    int field_k;
    int[] field_e;
    static int field_t;
    private int[] field_g;
    jn field_p;
    int field_n;
    static vj field_m;
    int field_b;
    static int field_j;
    jn[] field_s;
    int[] field_q;
    int[][] field_a;
    private byte[] field_f;

    public static void a() {
        field_o = null;
        field_m = null;
    }

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
        int var17 = 0;
        n var18 = null;
        byte[] var22 = null;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        String stackIn_104_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_101_0 = null;
        StringBuilder stackOut_101_1 = null;
        RuntimeException stackOut_103_0 = null;
        StringBuilder stackOut_103_1 = null;
        String stackOut_103_2 = null;
        RuntimeException stackOut_102_0 = null;
        StringBuilder stackOut_102_1 = null;
        String stackOut_102_2 = null;
        var17 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              var18 = new n(s.a((byte) -26, param1));
              var4 = var18.e(0);
              if (5 > var4) {
                break L1;
              } else {
                if (var4 <= 7) {
                  L2: {
                    if (var4 < 6) {
                      ((f) this).field_n = 0;
                      break L2;
                    } else {
                      ((f) this).field_n = var18.g(-5053);
                      break L2;
                    }
                  }
                  L3: {
                    var5 = var18.e(0);
                    if ((1 & var5) == -1) {
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
                    if (-8 <= var4) {
                      ((f) this).field_c = var18.j(2147483647);
                      break L4;
                    } else {
                      ((f) this).field_c = var18.f(1952);
                      break L4;
                    }
                  }
                  L5: {
                    if (0 == (2 & var5)) {
                      stackOut_16_0 = 0;
                      stackIn_17_0 = stackOut_16_0;
                      break L5;
                    } else {
                      stackOut_15_0 = 1;
                      stackIn_17_0 = stackOut_15_0;
                      break L5;
                    }
                  }
                  L6: {
                    var7 = stackIn_17_0;
                    var8 = 0;
                    var9 = -1;
                    ((f) this).field_d = new int[((f) this).field_c];
                    if (var4 < 7) {
                      var10 = 0;
                      L7: while (true) {
                        if (((f) this).field_c <= var10) {
                          break L6;
                        } else {
                          L8: {
                            int dupTemp$4 = var8 + var18.f(1952);
                            var8 = dupTemp$4;
                            ((f) this).field_d[var10] = dupTemp$4;
                            if (((f) this).field_d[var10] > var9) {
                              var9 = ((f) this).field_d[var10];
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
                        if (var10 >= ((f) this).field_c) {
                          break L6;
                        } else {
                          int dupTemp$5 = var8 + var18.j(2147483647);
                          var8 = dupTemp$5;
                          ((f) this).field_d[var10] = dupTemp$5;
                          if (var9 >= ((f) this).field_d[var10]) {
                            var10++;
                            continue L9;
                          } else {
                            var10++;
                            continue L9;
                          }
                        }
                      }
                    }
                  }
                  L10: {
                    ((f) this).field_k = var9 - -1;
                    if (var7 == 0) {
                      break L10;
                    } else {
                      ((f) this).field_h = new byte[((f) this).field_k][];
                      break L10;
                    }
                  }
                  L11: {
                    var10 = 0;
                    ((f) this).field_i = new int[((f) this).field_k];
                    ((f) this).field_a = new int[((f) this).field_k][];
                    ((f) this).field_e = new int[((f) this).field_k];
                    ((f) this).field_l = new int[((f) this).field_k];
                    ((f) this).field_q = new int[((f) this).field_k];
                    if (var6 != 0) {
                      ((f) this).field_g = new int[((f) this).field_k];
                      var11 = 0;
                      L12: while (true) {
                        if (((f) this).field_k <= var11) {
                          var11 = 0;
                          L13: while (true) {
                            if (var11 >= ((f) this).field_c) {
                              ((f) this).field_p = new jn(((f) this).field_g);
                              break L11;
                            } else {
                              ((f) this).field_g[((f) this).field_d[var11]] = var18.g(-5053);
                              var11++;
                              continue L13;
                            }
                          }
                        } else {
                          ((f) this).field_g[var11] = -1;
                          var11++;
                          continue L12;
                        }
                      }
                    } else {
                      break L11;
                    }
                  }
                  var11 = 0;
                  L14: while (true) {
                    if (((f) this).field_c <= var11) {
                      L15: {
                        if (var7 != 0) {
                          var11 = 0;
                          L16: while (true) {
                            if (var11 >= ((f) this).field_c) {
                              var11 = 0;
                              L17: while (true) {
                                if (var11 >= ((f) this).field_c) {
                                  break L15;
                                } else {
                                  ((f) this).field_q[((f) this).field_d[var11]] = var18.g(-5053);
                                  var11++;
                                  continue L17;
                                }
                              }
                            } else {
                              var22 = new byte[64];
                              var18.a(var22, (byte) -96, 0, 64);
                              ((f) this).field_h[((f) this).field_d[var11]] = var22;
                              var11++;
                              continue L16;
                            }
                          }
                        } else {
                          var11 = 0;
                          L18: while (true) {
                            if (var11 >= ((f) this).field_c) {
                              break L15;
                            } else {
                              ((f) this).field_q[((f) this).field_d[var11]] = var18.g(-5053);
                              var11++;
                              continue L18;
                            }
                          }
                        }
                      }
                      L19: {
                        if (var4 < 7) {
                          var11 = 0;
                          L20: while (true) {
                            if (var11 >= ((f) this).field_c) {
                              var11 = 0;
                              L21: while (true) {
                                if (((f) this).field_c <= var11) {
                                  break L19;
                                } else {
                                  var12 = ((f) this).field_d[var11];
                                  var8 = 0;
                                  var13 = ((f) this).field_i[var12];
                                  var14 = -1;
                                  ((f) this).field_a[var12] = new int[var13];
                                  var15 = 0;
                                  L22: while (true) {
                                    if (var15 >= var13) {
                                      L23: {
                                        ((f) this).field_e[var12] = 1 + var14;
                                        if (var14 - -1 != var13) {
                                          break L23;
                                        } else {
                                          ((f) this).field_a[var12] = null;
                                          break L23;
                                        }
                                      }
                                      var11++;
                                      continue L21;
                                    } else {
                                      L24: {
                                        int dupTemp$6 = var8 + var18.f(1952);
                                        var8 = dupTemp$6;
                                        ((f) this).field_a[var12][var15] = dupTemp$6;
                                        var16 = dupTemp$6;
                                        if (var14 < var16) {
                                          var14 = var16;
                                          break L24;
                                        } else {
                                          break L24;
                                        }
                                      }
                                      var15++;
                                      continue L22;
                                    }
                                  }
                                }
                              }
                            } else {
                              ((f) this).field_i[((f) this).field_d[var11]] = var18.f(1952);
                              var11++;
                              continue L20;
                            }
                          }
                        } else {
                          var11 = 0;
                          L25: while (true) {
                            if (var11 >= ((f) this).field_c) {
                              var11 = 0;
                              L26: while (true) {
                                if (((f) this).field_c <= var11) {
                                  break L19;
                                } else {
                                  var12 = ((f) this).field_d[var11];
                                  var8 = 0;
                                  var13 = ((f) this).field_i[var12];
                                  var14 = -1;
                                  ((f) this).field_a[var12] = new int[var13];
                                  var15 = 0;
                                  L27: while (true) {
                                    if (var15 >= var13) {
                                      L28: {
                                        ((f) this).field_e[var12] = 1 + var14;
                                        if (1 + var14 == var13) {
                                          ((f) this).field_a[var12] = null;
                                          break L28;
                                        } else {
                                          break L28;
                                        }
                                      }
                                      var11++;
                                      continue L26;
                                    } else {
                                      L29: {
                                        int dupTemp$7 = var8 + var18.j(2147483647);
                                        var8 = dupTemp$7;
                                        ((f) this).field_a[var12][var15] = dupTemp$7;
                                        var16 = dupTemp$7;
                                        if (var16 > var14) {
                                          var14 = var16;
                                          break L29;
                                        } else {
                                          break L29;
                                        }
                                      }
                                      var15++;
                                      continue L27;
                                    }
                                  }
                                }
                              }
                            } else {
                              ((f) this).field_i[((f) this).field_d[var11]] = var18.j(2147483647);
                              var11++;
                              continue L25;
                            }
                          }
                        }
                      }
                      L30: {
                        if (var6 != 0) {
                          ((f) this).field_r = new int[1 + var9][];
                          ((f) this).field_s = new jn[1 + var9];
                          var11 = 0;
                          L31: while (true) {
                            if (var11 >= ((f) this).field_c) {
                              break L30;
                            } else {
                              var12 = ((f) this).field_d[var11];
                              var13 = ((f) this).field_i[var12];
                              ((f) this).field_r[var12] = new int[((f) this).field_e[var12]];
                              var14 = 0;
                              L32: while (true) {
                                if (((f) this).field_e[var12] <= var14) {
                                  var14 = 0;
                                  L33: while (true) {
                                    if (var13 <= var14) {
                                      ((f) this).field_s[var12] = new jn(((f) this).field_r[var12]);
                                      var11++;
                                      continue L31;
                                    } else {
                                      L34: {
                                        if (((f) this).field_a[var12] != null) {
                                          var15 = ((f) this).field_a[var12][var14];
                                          break L34;
                                        } else {
                                          var15 = var14;
                                          break L34;
                                        }
                                      }
                                      ((f) this).field_r[var12][var15] = var18.g(-5053);
                                      var14++;
                                      continue L33;
                                    }
                                  }
                                } else {
                                  ((f) this).field_r[var12][var14] = -1;
                                  var14++;
                                  continue L32;
                                }
                              }
                            }
                          }
                        } else {
                          break L30;
                        }
                      }
                      break L0;
                    } else {
                      ((f) this).field_l[((f) this).field_d[var11]] = var18.g(-5053);
                      var11++;
                      continue L14;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L35: {
            var3 = decompiledCaughtException;
            stackOut_101_0 = (RuntimeException) var3;
            stackOut_101_1 = new StringBuilder().append("f.B(").append(-23).append(',');
            stackIn_103_0 = stackOut_101_0;
            stackIn_103_1 = stackOut_101_1;
            stackIn_102_0 = stackOut_101_0;
            stackIn_102_1 = stackOut_101_1;
            if (param1 == null) {
              stackOut_103_0 = (RuntimeException) (Object) stackIn_103_0;
              stackOut_103_1 = (StringBuilder) (Object) stackIn_103_1;
              stackOut_103_2 = "null";
              stackIn_104_0 = stackOut_103_0;
              stackIn_104_1 = stackOut_103_1;
              stackIn_104_2 = stackOut_103_2;
              break L35;
            } else {
              stackOut_102_0 = (RuntimeException) (Object) stackIn_102_0;
              stackOut_102_1 = (StringBuilder) (Object) stackIn_102_1;
              stackOut_102_2 = "{...}";
              stackIn_104_0 = stackOut_102_0;
              stackIn_104_1 = stackOut_102_1;
              stackIn_104_2 = stackOut_102_2;
              break L35;
            }
          }
          throw t.a((Throwable) (Object) stackIn_104_0, stackIn_104_2 + ')');
        }
    }

    f(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
            ((f) this).field_b = ji.a(255, param0.length, param0);
            if (param1 != ((f) this).field_b) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if (param2.length != 64) {
                    throw new RuntimeException();
                }
                ((f) this).field_f = vn.a(param0, 0, param0.length, 0);
                for (var4_int = 0; var4_int < 64; var4_int++) {
                    if (param2[var4_int] != ((f) this).field_f[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            this.a((byte) -23, param0);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "f.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = -1;
        field_m = null;
    }
}
