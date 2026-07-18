/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pc {
    int[] field_b;
    private int[] field_o;
    int[] field_l;
    byte[][] field_g;
    int field_p;
    static String field_t;
    oe[] field_e;
    int[][] field_r;
    int[] field_a;
    static int field_i;
    private int[][] field_c;
    private byte[] field_j;
    private int field_s;
    static int field_m;
    int[] field_f;
    oe field_q;
    int field_k;
    int field_n;
    int[] field_d;
    static boolean field_h;

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
        be var17 = null;
        byte[] var21 = null;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        String stackIn_100_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_97_0 = null;
        StringBuilder stackOut_97_1 = null;
        RuntimeException stackOut_99_0 = null;
        StringBuilder stackOut_99_1 = null;
        String stackOut_99_2 = null;
        RuntimeException stackOut_98_0 = null;
        StringBuilder stackOut_98_1 = null;
        String stackOut_98_2 = null;
        var16 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var17 = new be(al.a(-128, param1));
              var4 = var17.h(16383);
              if (5 > var4) {
                break L1;
              } else {
                if (var4 <= 7) {
                  L2: {
                    if (6 <= var4) {
                      ((pc) this).field_k = var17.e((byte) 113);
                      break L2;
                    } else {
                      ((pc) this).field_k = 0;
                      break L2;
                    }
                  }
                  L3: {
                    var5 = var17.h(16383);
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
                    if (7 <= var4) {
                      ((pc) this).field_s = var17.c(false);
                      break L4;
                    } else {
                      ((pc) this).field_s = var17.d((byte) -78);
                      break L4;
                    }
                  }
                  L5: {
                    if ((2 & var5) == 0) {
                      stackOut_16_0 = 0;
                      stackIn_17_0 = stackOut_16_0;
                      break L5;
                    } else {
                      stackOut_15_0 = 1;
                      stackIn_17_0 = stackOut_15_0;
                      break L5;
                    }
                  }
                  var7 = stackIn_17_0;
                  var8 = 0;
                  L6: {
                    var9 = -1;
                    ((pc) this).field_f = new int[((pc) this).field_s];
                    if (var4 < 7) {
                      var10 = 0;
                      L7: while (true) {
                        if (((pc) this).field_s <= var10) {
                          break L6;
                        } else {
                          L8: {
                            int dupTemp$4 = var8 + var17.d((byte) -62);
                            var8 = dupTemp$4;
                            ((pc) this).field_f[var10] = dupTemp$4;
                            if (((pc) this).field_f[var10] > var9) {
                              var9 = ((pc) this).field_f[var10];
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
                        if (((pc) this).field_s <= var10) {
                          break L6;
                        } else {
                          L10: {
                            int dupTemp$5 = var8 + var17.c(false);
                            var8 = dupTemp$5;
                            ((pc) this).field_f[var10] = dupTemp$5;
                            if (var9 >= ((pc) this).field_f[var10]) {
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
                    ((pc) this).field_n = var9 + 1;
                    ((pc) this).field_r = new int[((pc) this).field_n][];
                    if (var7 != 0) {
                      ((pc) this).field_g = new byte[((pc) this).field_n][];
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    ((pc) this).field_a = new int[((pc) this).field_n];
                    ((pc) this).field_b = new int[((pc) this).field_n];
                    ((pc) this).field_d = new int[((pc) this).field_n];
                    ((pc) this).field_l = new int[((pc) this).field_n];
                    if (var6 == 0) {
                      break L12;
                    } else {
                      ((pc) this).field_o = new int[((pc) this).field_n];
                      var10 = 0;
                      L13: while (true) {
                        if (var10 >= ((pc) this).field_n) {
                          var10 = 0;
                          L14: while (true) {
                            if (var10 >= ((pc) this).field_s) {
                              ((pc) this).field_q = new oe(((pc) this).field_o);
                              break L12;
                            } else {
                              ((pc) this).field_o[((pc) this).field_f[var10]] = var17.e((byte) 113);
                              var10++;
                              continue L14;
                            }
                          }
                        } else {
                          ((pc) this).field_o[var10] = -1;
                          var10++;
                          continue L13;
                        }
                      }
                    }
                  }
                  var10 = 0;
                  L15: while (true) {
                    if (var10 >= ((pc) this).field_s) {
                      L16: {
                        if (var7 == 0) {
                          break L16;
                        } else {
                          var10 = 0;
                          L17: while (true) {
                            if (((pc) this).field_s <= var10) {
                              break L16;
                            } else {
                              var21 = new byte[64];
                              var17.a(89, var21, 0, 64);
                              ((pc) this).field_g[((pc) this).field_f[var10]] = var21;
                              var10++;
                              continue L17;
                            }
                          }
                        }
                      }
                      var10 = 0;
                      L18: while (true) {
                        if (var10 >= ((pc) this).field_s) {
                          L19: {
                            if (var4 >= 7) {
                              var10 = 0;
                              L20: while (true) {
                                if (var10 >= ((pc) this).field_s) {
                                  var10 = 0;
                                  L21: while (true) {
                                    if (var10 >= ((pc) this).field_s) {
                                      break L19;
                                    } else {
                                      var11 = ((pc) this).field_f[var10];
                                      var8 = 0;
                                      var12 = ((pc) this).field_l[var11];
                                      ((pc) this).field_r[var11] = new int[var12];
                                      var13 = -1;
                                      var14 = 0;
                                      L22: while (true) {
                                        if (var12 <= var14) {
                                          L23: {
                                            ((pc) this).field_a[var11] = var13 + 1;
                                            if (var13 + 1 != var12) {
                                              break L23;
                                            } else {
                                              ((pc) this).field_r[var11] = null;
                                              break L23;
                                            }
                                          }
                                          var10++;
                                          continue L21;
                                        } else {
                                          L24: {
                                            int dupTemp$6 = var8 + var17.c(false);
                                            var8 = dupTemp$6;
                                            ((pc) this).field_r[var11][var14] = dupTemp$6;
                                            var15 = dupTemp$6;
                                            if (var13 < var15) {
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
                                  ((pc) this).field_l[((pc) this).field_f[var10]] = var17.c(false);
                                  var10++;
                                  continue L20;
                                }
                              }
                            } else {
                              var10 = 0;
                              L25: while (true) {
                                if (var10 >= ((pc) this).field_s) {
                                  var10 = 0;
                                  L26: while (true) {
                                    if (var10 >= ((pc) this).field_s) {
                                      break L19;
                                    } else {
                                      var11 = ((pc) this).field_f[var10];
                                      var8 = 0;
                                      var12 = ((pc) this).field_l[var11];
                                      ((pc) this).field_r[var11] = new int[var12];
                                      var13 = -1;
                                      var14 = 0;
                                      L27: while (true) {
                                        if (var12 <= var14) {
                                          L28: {
                                            ((pc) this).field_a[var11] = var13 + 1;
                                            if (var12 == 1 + var13) {
                                              ((pc) this).field_r[var11] = null;
                                              break L28;
                                            } else {
                                              break L28;
                                            }
                                          }
                                          var10++;
                                          continue L26;
                                        } else {
                                          L29: {
                                            int dupTemp$7 = var8 + var17.d((byte) -109);
                                            var8 = dupTemp$7;
                                            ((pc) this).field_r[var11][var14] = dupTemp$7;
                                            var15 = dupTemp$7;
                                            if (var15 > var13) {
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
                                  ((pc) this).field_l[((pc) this).field_f[var10]] = var17.d((byte) -42);
                                  var10++;
                                  continue L25;
                                }
                              }
                            }
                          }
                          L30: {
                            if (var6 != 0) {
                              ((pc) this).field_e = new oe[1 + var9];
                              ((pc) this).field_c = new int[1 + var9][];
                              var10 = 0;
                              L31: while (true) {
                                if (((pc) this).field_s <= var10) {
                                  break L30;
                                } else {
                                  var11 = ((pc) this).field_f[var10];
                                  var12 = ((pc) this).field_l[var11];
                                  ((pc) this).field_c[var11] = new int[((pc) this).field_a[var11]];
                                  var13 = 0;
                                  L32: while (true) {
                                    if (var13 >= ((pc) this).field_a[var11]) {
                                      var13 = 0;
                                      L33: while (true) {
                                        if (var12 <= var13) {
                                          ((pc) this).field_e[var11] = new oe(((pc) this).field_c[var11]);
                                          var10++;
                                          continue L31;
                                        } else {
                                          L34: {
                                            if (null == ((pc) this).field_r[var11]) {
                                              var14 = var13;
                                              break L34;
                                            } else {
                                              var14 = ((pc) this).field_r[var11][var13];
                                              break L34;
                                            }
                                          }
                                          ((pc) this).field_c[var11][var14] = var17.e((byte) 113);
                                          var13++;
                                          continue L33;
                                        }
                                      }
                                    } else {
                                      ((pc) this).field_c[var11][var13] = -1;
                                      var13++;
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
                          ((pc) this).field_d[((pc) this).field_f[var10]] = var17.e((byte) 113);
                          var10++;
                          continue L18;
                        }
                      }
                    } else {
                      ((pc) this).field_b[((pc) this).field_f[var10]] = var17.e((byte) 113);
                      var10++;
                      continue L15;
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
            stackOut_97_0 = (RuntimeException) var3;
            stackOut_97_1 = new StringBuilder().append("pc.A(").append(-2).append(',');
            stackIn_99_0 = stackOut_97_0;
            stackIn_99_1 = stackOut_97_1;
            stackIn_98_0 = stackOut_97_0;
            stackIn_98_1 = stackOut_97_1;
            if (param1 == null) {
              stackOut_99_0 = (RuntimeException) (Object) stackIn_99_0;
              stackOut_99_1 = (StringBuilder) (Object) stackIn_99_1;
              stackOut_99_2 = "null";
              stackIn_100_0 = stackOut_99_0;
              stackIn_100_1 = stackOut_99_1;
              stackIn_100_2 = stackOut_99_2;
              break L35;
            } else {
              stackOut_98_0 = (RuntimeException) (Object) stackIn_98_0;
              stackOut_98_1 = (StringBuilder) (Object) stackIn_98_1;
              stackOut_98_2 = "{...}";
              stackIn_100_0 = stackOut_98_0;
              stackIn_100_1 = stackOut_98_1;
              stackIn_100_2 = stackOut_98_2;
              break L35;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_100_0, stackIn_100_2 + ')');
        }
    }

    public static void a() {
        field_t = null;
    }

    pc(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
            ((pc) this).field_p = ql.a(0, param0, param0.length);
            if (((pc) this).field_p != param1) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if (64 != param2.length) {
                    throw new RuntimeException();
                }
                int discarded$0 = -6196;
                ((pc) this).field_j = cf.a(0, param0, param0.length);
                for (var4_int = 0; var4_int < 64; var4_int++) {
                    if (((pc) this).field_j[var4_int] != param2[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            this.a((byte) -2, param0);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "pc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = 0;
        field_h = false;
    }
}
