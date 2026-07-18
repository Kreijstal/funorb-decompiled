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
        od var17 = null;
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
        var16 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var17 = new od(ce.a(1, param1));
              var4 = var17.l(31760);
              if (var4 < 5) {
                break L1;
              } else {
                if (var4 > 7) {
                  break L1;
                } else {
                  L2: {
                    if (var4 >= 6) {
                      ((kh) this).field_t = var17.h(101);
                      break L2;
                    } else {
                      ((kh) this).field_t = 0;
                      break L2;
                    }
                  }
                  L3: {
                    var5 = var17.l(31760);
                    if ((var5 & 1) == 0) {
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
                    if ((var5 & 2) == 0) {
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
                      ((kh) this).field_n = var17.a(true);
                      break L5;
                    } else {
                      ((kh) this).field_n = var17.j(-788751192);
                      break L5;
                    }
                  }
                  L6: {
                    var8 = 0;
                    ((kh) this).field_r = new int[((kh) this).field_n];
                    var9 = -1;
                    if (var4 >= 7) {
                      var10 = 0;
                      L7: while (true) {
                        if (((kh) this).field_n <= var10) {
                          break L6;
                        } else {
                          L8: {
                            int dupTemp$4 = var8 + var17.a(true);
                            var8 = dupTemp$4;
                            ((kh) this).field_r[var10] = dupTemp$4;
                            if (((kh) this).field_r[var10] <= var9) {
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
                        if (((kh) this).field_n <= var10) {
                          break L6;
                        } else {
                          L10: {
                            int dupTemp$5 = var8 + var17.j(-788751192);
                            var8 = dupTemp$5;
                            ((kh) this).field_r[var10] = dupTemp$5;
                            if (((kh) this).field_r[var10] > var9) {
                              var9 = ((kh) this).field_r[var10];
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
                    ((kh) this).field_m = 1 + var9;
                    if (var7 == 0) {
                      break L11;
                    } else {
                      ((kh) this).field_q = new byte[((kh) this).field_m][];
                      break L11;
                    }
                  }
                  L12: {
                    ((kh) this).field_k = new int[((kh) this).field_m];
                    ((kh) this).field_l = new int[((kh) this).field_m];
                    ((kh) this).field_j = new int[((kh) this).field_m];
                    ((kh) this).field_f = new int[((kh) this).field_m][];
                    ((kh) this).field_d = new int[((kh) this).field_m];
                    if (var6 == 0) {
                      break L12;
                    } else {
                      ((kh) this).field_u = new int[((kh) this).field_m];
                      var10 = 0;
                      L13: while (true) {
                        if (((kh) this).field_m <= var10) {
                          var10 = 0;
                          L14: while (true) {
                            if (var10 >= ((kh) this).field_n) {
                              ((kh) this).field_s = new qf(((kh) this).field_u);
                              break L12;
                            } else {
                              ((kh) this).field_u[((kh) this).field_r[var10]] = var17.h(124);
                              var10++;
                              continue L14;
                            }
                          }
                        } else {
                          ((kh) this).field_u[var10] = -1;
                          var10++;
                          continue L13;
                        }
                      }
                    }
                  }
                  var10 = 0;
                  L15: while (true) {
                    if (var10 >= ((kh) this).field_n) {
                      L16: {
                        if (var7 != 0) {
                          var10 = 0;
                          L17: while (true) {
                            if (var10 >= ((kh) this).field_n) {
                              var10 = 0;
                              L18: while (true) {
                                if (var10 >= ((kh) this).field_n) {
                                  break L16;
                                } else {
                                  ((kh) this).field_l[((kh) this).field_r[var10]] = var17.h(109);
                                  var10++;
                                  continue L18;
                                }
                              }
                            } else {
                              var21 = new byte[64];
                              var17.b(0, 64, 128, var21);
                              ((kh) this).field_q[((kh) this).field_r[var10]] = var21;
                              var10++;
                              continue L17;
                            }
                          }
                        } else {
                          var10 = 0;
                          L19: while (true) {
                            if (var10 >= ((kh) this).field_n) {
                              break L16;
                            } else {
                              ((kh) this).field_l[((kh) this).field_r[var10]] = var17.h(109);
                              var10++;
                              continue L19;
                            }
                          }
                        }
                      }
                      L20: {
                        if (var4 < 7) {
                          var10 = 0;
                          L21: while (true) {
                            if (var10 >= ((kh) this).field_n) {
                              var10 = 0;
                              L22: while (true) {
                                if (((kh) this).field_n <= var10) {
                                  break L20;
                                } else {
                                  var11 = ((kh) this).field_r[var10];
                                  var8 = 0;
                                  var12 = ((kh) this).field_k[var11];
                                  var13 = -1;
                                  ((kh) this).field_f[var11] = new int[var12];
                                  var14 = 0;
                                  L23: while (true) {
                                    if (var12 <= var14) {
                                      L24: {
                                        ((kh) this).field_d[var11] = 1 + var13;
                                        if (var12 != 1 + var13) {
                                          break L24;
                                        } else {
                                          ((kh) this).field_f[var11] = null;
                                          break L24;
                                        }
                                      }
                                      var10++;
                                      continue L22;
                                    } else {
                                      L25: {
                                        int dupTemp$6 = var8 + var17.j(-788751192);
                                        var8 = dupTemp$6;
                                        ((kh) this).field_f[var11][var14] = dupTemp$6;
                                        var15 = dupTemp$6;
                                        if (var13 < var15) {
                                          var13 = var15;
                                          break L25;
                                        } else {
                                          break L25;
                                        }
                                      }
                                      var14++;
                                      continue L23;
                                    }
                                  }
                                }
                              }
                            } else {
                              ((kh) this).field_k[((kh) this).field_r[var10]] = var17.j(-788751192);
                              var10++;
                              continue L21;
                            }
                          }
                        } else {
                          var10 = 0;
                          L26: while (true) {
                            if (var10 >= ((kh) this).field_n) {
                              var10 = 0;
                              L27: while (true) {
                                if (((kh) this).field_n <= var10) {
                                  break L20;
                                } else {
                                  var11 = ((kh) this).field_r[var10];
                                  var12 = ((kh) this).field_k[var11];
                                  var8 = 0;
                                  var13 = -1;
                                  ((kh) this).field_f[var11] = new int[var12];
                                  var14 = 0;
                                  L28: while (true) {
                                    if (var14 >= var12) {
                                      L29: {
                                        ((kh) this).field_d[var11] = var13 - -1;
                                        if (var13 - -1 != var12) {
                                          break L29;
                                        } else {
                                          ((kh) this).field_f[var11] = null;
                                          break L29;
                                        }
                                      }
                                      var10++;
                                      continue L27;
                                    } else {
                                      L30: {
                                        int dupTemp$7 = var8 + var17.a(true);
                                        var8 = dupTemp$7;
                                        ((kh) this).field_f[var11][var14] = dupTemp$7;
                                        var15 = dupTemp$7;
                                        if (var13 < var15) {
                                          var13 = var15;
                                          break L30;
                                        } else {
                                          break L30;
                                        }
                                      }
                                      var14++;
                                      continue L28;
                                    }
                                  }
                                }
                              }
                            } else {
                              ((kh) this).field_k[((kh) this).field_r[var10]] = var17.a(true);
                              var10++;
                              continue L26;
                            }
                          }
                        }
                      }
                      L31: {
                        if (var6 != 0) {
                          ((kh) this).field_a = new int[1 + var9][];
                          ((kh) this).field_b = new qf[1 + var9];
                          var10 = 0;
                          L32: while (true) {
                            if (var10 >= ((kh) this).field_n) {
                              break L31;
                            } else {
                              var11 = ((kh) this).field_r[var10];
                              var12 = ((kh) this).field_k[var11];
                              ((kh) this).field_a[var11] = new int[((kh) this).field_d[var11]];
                              var13 = 0;
                              L33: while (true) {
                                if (var13 >= ((kh) this).field_d[var11]) {
                                  var13 = 0;
                                  L34: while (true) {
                                    if (var13 >= var12) {
                                      ((kh) this).field_b[var11] = new qf(((kh) this).field_a[var11]);
                                      var10++;
                                      continue L32;
                                    } else {
                                      L35: {
                                        if (((kh) this).field_f[var11] != null) {
                                          var14 = ((kh) this).field_f[var11][var13];
                                          break L35;
                                        } else {
                                          var14 = var13;
                                          break L35;
                                        }
                                      }
                                      ((kh) this).field_a[var11][var14] = var17.h(-118);
                                      var13++;
                                      continue L34;
                                    }
                                  }
                                } else {
                                  ((kh) this).field_a[var11][var13] = -1;
                                  var13++;
                                  continue L33;
                                }
                              }
                            }
                          }
                        } else {
                          break L31;
                        }
                      }
                      break L0;
                    } else {
                      ((kh) this).field_j[((kh) this).field_r[var10]] = var17.h(123);
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
          L36: {
            var3 = decompiledCaughtException;
            stackOut_96_0 = (RuntimeException) var3;
            stackOut_96_1 = new StringBuilder().append("kh.C(").append(true).append(',');
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
              break L36;
            } else {
              stackOut_97_0 = (RuntimeException) (Object) stackIn_97_0;
              stackOut_97_1 = (StringBuilder) (Object) stackIn_97_1;
              stackOut_97_2 = "{...}";
              stackIn_99_0 = stackOut_97_0;
              stackIn_99_1 = stackOut_97_1;
              stackIn_99_2 = stackOut_97_2;
              break L36;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_99_0, stackIn_99_2 + ')');
        }
    }

    final static boolean a(boolean param0) {
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          L1: {
            if (hj.field_f < 20) {
              break L1;
            } else {
              if (!bj.a(13)) {
                break L1;
              } else {
                L2: {
                  if (rh.field_a <= 0) {
                    break L2;
                  } else {
                    if (hc.a(true)) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              }
            }
          }
          stackOut_4_0 = 1;
          stackIn_6_0 = stackOut_4_0;
          break L0;
        }
        return stackIn_6_0 != 0;
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
        int var4_int = 0;
        try {
            ((kh) this).field_p = th.a(param0, (byte) 127, param0.length);
            if (((kh) this).field_p != param1) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if (64 != param2.length) {
                    throw new RuntimeException();
                }
                ((kh) this).field_g = b.a(0, 44, param0, param0.length);
                for (var4_int = 0; var4_int < 64; var4_int++) {
                    if (param2[var4_int] != ((kh) this).field_g[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            this.a(true, param0);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "kh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
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
