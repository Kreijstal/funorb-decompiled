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
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_101_0 = null;
        StringBuilder stackOut_101_1 = null;
        RuntimeException stackOut_103_0 = null;
        StringBuilder stackOut_103_1 = null;
        String stackOut_103_2 = null;
        RuntimeException stackOut_102_0 = null;
        StringBuilder stackOut_102_1 = null;
        String stackOut_102_2 = null;
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
                          int dupTemp$4 = var8 + var17.a(true);
                          var8 = dupTemp$4;
                          ((kh) this).field_r[var10] = dupTemp$4;
                          if (((kh) this).field_r[var10] <= var9) {
                            var10++;
                            continue L7;
                          } else {
                            var10++;
                            continue L7;
                          }
                        }
                      }
                    } else {
                      var10 = 0;
                      L8: while (true) {
                        if (((kh) this).field_n <= var10) {
                          break L6;
                        } else {
                          L9: {
                            int dupTemp$5 = var8 + var17.j(-788751192);
                            var8 = dupTemp$5;
                            ((kh) this).field_r[var10] = dupTemp$5;
                            if (((kh) this).field_r[var10] > var9) {
                              var9 = ((kh) this).field_r[var10];
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          var10++;
                          continue L8;
                        }
                      }
                    }
                  }
                  L10: {
                    ((kh) this).field_m = 1 + var9;
                    if (var7 == 0) {
                      break L10;
                    } else {
                      ((kh) this).field_q = new byte[((kh) this).field_m][];
                      break L10;
                    }
                  }
                  L11: {
                    ((kh) this).field_k = new int[((kh) this).field_m];
                    ((kh) this).field_l = new int[((kh) this).field_m];
                    ((kh) this).field_j = new int[((kh) this).field_m];
                    ((kh) this).field_f = new int[((kh) this).field_m][];
                    ((kh) this).field_d = new int[((kh) this).field_m];
                    if (var6 == 0) {
                      break L11;
                    } else {
                      ((kh) this).field_u = new int[((kh) this).field_m];
                      var10 = 0;
                      L12: while (true) {
                        if (((kh) this).field_m <= var10) {
                          var10 = 0;
                          L13: while (true) {
                            if (var10 >= ((kh) this).field_n) {
                              ((kh) this).field_s = new qf(((kh) this).field_u);
                              break L11;
                            } else {
                              ((kh) this).field_u[((kh) this).field_r[var10]] = var17.h(124);
                              var10++;
                              continue L13;
                            }
                          }
                        } else {
                          ((kh) this).field_u[var10] = -1;
                          var10++;
                          continue L12;
                        }
                      }
                    }
                  }
                  var10 = 0;
                  L14: while (true) {
                    if (var10 >= ((kh) this).field_n) {
                      L15: {
                        if (var7 != 0) {
                          var10 = 0;
                          L16: while (true) {
                            if (var10 >= ((kh) this).field_n) {
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
                                  break L15;
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
                              continue L16;
                            }
                          }
                        } else {
                          L19: {
                            var10 = 0;
                            if (param0) {
                              break L19;
                            } else {
                              ((kh) this).field_g = null;
                              break L19;
                            }
                          }
                          L20: while (true) {
                            if (var10 >= ((kh) this).field_n) {
                              break L15;
                            } else {
                              ((kh) this).field_l[((kh) this).field_r[var10]] = var17.h(109);
                              var10++;
                              continue L20;
                            }
                          }
                        }
                      }
                      L21: {
                        if (var4 < 7) {
                          var10 = 0;
                          L22: while (true) {
                            if (var10 >= ((kh) this).field_n) {
                              var10 = 0;
                              L23: while (true) {
                                if (((kh) this).field_n <= var10) {
                                  break L21;
                                } else {
                                  var11 = ((kh) this).field_r[var10];
                                  var8 = 0;
                                  var12 = ((kh) this).field_k[var11];
                                  var13 = -1;
                                  ((kh) this).field_f[var11] = new int[var12];
                                  var14 = 0;
                                  L24: while (true) {
                                    if (var12 <= var14) {
                                      L25: {
                                        ((kh) this).field_d[var11] = 1 + var13;
                                        if (var12 != 1 + var13) {
                                          break L25;
                                        } else {
                                          ((kh) this).field_f[var11] = null;
                                          break L25;
                                        }
                                      }
                                      var10++;
                                      continue L23;
                                    } else {
                                      L26: {
                                        int dupTemp$6 = var8 + var17.j(-788751192);
                                        var8 = dupTemp$6;
                                        ((kh) this).field_f[var11][var14] = dupTemp$6;
                                        var15 = dupTemp$6;
                                        if (var13 < var15) {
                                          var13 = var15;
                                          break L26;
                                        } else {
                                          break L26;
                                        }
                                      }
                                      var14++;
                                      continue L24;
                                    }
                                  }
                                }
                              }
                            } else {
                              ((kh) this).field_k[((kh) this).field_r[var10]] = var17.j(-788751192);
                              var10++;
                              continue L22;
                            }
                          }
                        } else {
                          var10 = 0;
                          L27: while (true) {
                            if (var10 >= ((kh) this).field_n) {
                              var10 = 0;
                              L28: while (true) {
                                if (((kh) this).field_n <= var10) {
                                  break L21;
                                } else {
                                  var11 = ((kh) this).field_r[var10];
                                  var12 = ((kh) this).field_k[var11];
                                  var8 = 0;
                                  var13 = -1;
                                  ((kh) this).field_f[var11] = new int[var12];
                                  var14 = 0;
                                  L29: while (true) {
                                    if (var14 >= var12) {
                                      L30: {
                                        ((kh) this).field_d[var11] = var13 - -1;
                                        if (var13 - -1 != var12) {
                                          break L30;
                                        } else {
                                          ((kh) this).field_f[var11] = null;
                                          break L30;
                                        }
                                      }
                                      var10++;
                                      continue L28;
                                    } else {
                                      L31: {
                                        int dupTemp$7 = var8 + var17.a(true);
                                        var8 = dupTemp$7;
                                        ((kh) this).field_f[var11][var14] = dupTemp$7;
                                        var15 = dupTemp$7;
                                        if (var13 < var15) {
                                          var13 = var15;
                                          break L31;
                                        } else {
                                          break L31;
                                        }
                                      }
                                      var14++;
                                      continue L29;
                                    }
                                  }
                                }
                              }
                            } else {
                              ((kh) this).field_k[((kh) this).field_r[var10]] = var17.a(true);
                              var10++;
                              continue L27;
                            }
                          }
                        }
                      }
                      L32: {
                        if (var6 != 0) {
                          ((kh) this).field_a = new int[1 + var9][];
                          ((kh) this).field_b = new qf[1 + var9];
                          var10 = 0;
                          L33: while (true) {
                            if (var10 >= ((kh) this).field_n) {
                              break L32;
                            } else {
                              var11 = ((kh) this).field_r[var10];
                              var12 = ((kh) this).field_k[var11];
                              ((kh) this).field_a[var11] = new int[((kh) this).field_d[var11]];
                              var13 = 0;
                              L34: while (true) {
                                if (var13 >= ((kh) this).field_d[var11]) {
                                  var13 = 0;
                                  L35: while (true) {
                                    if (var13 >= var12) {
                                      ((kh) this).field_b[var11] = new qf(((kh) this).field_a[var11]);
                                      var10++;
                                      continue L33;
                                    } else {
                                      L36: {
                                        if (((kh) this).field_f[var11] != null) {
                                          var14 = ((kh) this).field_f[var11][var13];
                                          break L36;
                                        } else {
                                          var14 = var13;
                                          break L36;
                                        }
                                      }
                                      ((kh) this).field_a[var11][var14] = var17.h(-118);
                                      var13++;
                                      continue L35;
                                    }
                                  }
                                } else {
                                  ((kh) this).field_a[var11][var13] = -1;
                                  var13++;
                                  continue L34;
                                }
                              }
                            }
                          }
                        } else {
                          break L32;
                        }
                      }
                      break L0;
                    } else {
                      ((kh) this).field_j[((kh) this).field_r[var10]] = var17.h(123);
                      var10++;
                      continue L14;
                    }
                  }
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L37: {
            var3 = decompiledCaughtException;
            stackOut_101_0 = (RuntimeException) var3;
            stackOut_101_1 = new StringBuilder().append("kh.C(").append(param0).append(44);
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
              break L37;
            } else {
              stackOut_102_0 = (RuntimeException) (Object) stackIn_102_0;
              stackOut_102_1 = (StringBuilder) (Object) stackIn_102_1;
              stackOut_102_2 = "{...}";
              stackIn_104_0 = stackOut_102_0;
              stackIn_104_1 = stackOut_102_1;
              stackIn_104_2 = stackOut_102_2;
              break L37;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_104_0, stackIn_104_2 + 41);
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
            throw ie.a((Throwable) (Object) runtimeException, "kh.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
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
