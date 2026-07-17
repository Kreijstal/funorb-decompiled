/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh {
    vj field_q;
    int field_e;
    int field_m;
    private byte[] field_s;
    int[] field_p;
    int[] field_l;
    int[] field_k;
    vj[] field_c;
    private int field_a;
    private int[][] field_o;
    int[] field_j;
    byte[][] field_h;
    int[][] field_b;
    int field_r;
    private int[] field_i;
    static th field_n;
    int[] field_g;
    static volatile boolean field_f;
    static int field_d;

    final static boolean a(ej param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2_int = -34 % ((-76 - param1) / 34);
            stackOut_0_0 = param0.a(-54);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("lh.B(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param1 + 41);
        }
        return stackIn_1_0;
    }

    public static void a(byte param0) {
        int var1 = 0;
        field_n = null;
    }

    private final void a(int param0, byte[] param1) {
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
        ka var17 = null;
        byte[] var21 = null;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        String stackIn_98_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_95_0 = null;
        StringBuilder stackOut_95_1 = null;
        RuntimeException stackOut_97_0 = null;
        StringBuilder stackOut_97_1 = null;
        String stackOut_97_2 = null;
        RuntimeException stackOut_96_0 = null;
        StringBuilder stackOut_96_1 = null;
        String stackOut_96_2 = null;
        var16 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              var17 = new ka(sl.a((byte) -64, param1));
              var4 = var17.f(4);
              if (var4 < 5) {
                break L1;
              } else {
                if (7 < var4) {
                  break L1;
                } else {
                  L2: {
                    if (6 <= var4) {
                      ((lh) this).field_r = var17.b(false);
                      break L2;
                    } else {
                      ((lh) this).field_r = 0;
                      break L2;
                    }
                  }
                  L3: {
                    var5 = var17.f(4);
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
                    if (var4 < 7) {
                      ((lh) this).field_a = var17.c((byte) 35);
                      break L4;
                    } else {
                      ((lh) this).field_a = var17.h(26491);
                      break L4;
                    }
                  }
                  L5: {
                    if ((var5 & 2) == 0) {
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
                    ((lh) this).field_k = new int[((lh) this).field_a];
                    var9 = -1;
                    if (var4 >= 7) {
                      var10 = 0;
                      L7: while (true) {
                        if (((lh) this).field_a <= var10) {
                          break L6;
                        } else {
                          L8: {
                            int dupTemp$4 = var8 + var17.h(26491);
                            var8 = dupTemp$4;
                            ((lh) this).field_k[var10] = dupTemp$4;
                            if (((lh) this).field_k[var10] > var9) {
                              var9 = ((lh) this).field_k[var10];
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
                        if (var10 >= ((lh) this).field_a) {
                          break L6;
                        } else {
                          L10: {
                            int dupTemp$5 = var8 + var17.c((byte) 42);
                            var8 = dupTemp$5;
                            ((lh) this).field_k[var10] = dupTemp$5;
                            if (var9 < ((lh) this).field_k[var10]) {
                              var9 = ((lh) this).field_k[var10];
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
                    ((lh) this).field_e = 1 + var9;
                    ((lh) this).field_p = new int[((lh) this).field_e];
                    if (var7 != 0) {
                      ((lh) this).field_h = new byte[((lh) this).field_e][];
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    ((lh) this).field_g = new int[((lh) this).field_e];
                    ((lh) this).field_l = new int[((lh) this).field_e];
                    ((lh) this).field_j = new int[((lh) this).field_e];
                    ((lh) this).field_b = new int[((lh) this).field_e][];
                    if (var6 == 0) {
                      break L12;
                    } else {
                      ((lh) this).field_i = new int[((lh) this).field_e];
                      var10 = 0;
                      L13: while (true) {
                        if (((lh) this).field_e <= var10) {
                          var10 = 0;
                          L14: while (true) {
                            if (((lh) this).field_a <= var10) {
                              ((lh) this).field_q = new vj(((lh) this).field_i);
                              break L12;
                            } else {
                              ((lh) this).field_i[((lh) this).field_k[var10]] = var17.b(false);
                              var10++;
                              continue L14;
                            }
                          }
                        } else {
                          ((lh) this).field_i[var10] = -1;
                          var10++;
                          continue L13;
                        }
                      }
                    }
                  }
                  var10 = param0;
                  L15: while (true) {
                    if (var10 >= ((lh) this).field_a) {
                      L16: {
                        if (var7 == 0) {
                          break L16;
                        } else {
                          var10 = 0;
                          L17: while (true) {
                            if (var10 >= ((lh) this).field_a) {
                              break L16;
                            } else {
                              var21 = new byte[64];
                              var17.a(0, (byte) -100, 64, var21);
                              ((lh) this).field_h[((lh) this).field_k[var10]] = var21;
                              var10++;
                              continue L17;
                            }
                          }
                        }
                      }
                      var10 = 0;
                      L18: while (true) {
                        if (((lh) this).field_a <= var10) {
                          L19: {
                            if (var4 < 7) {
                              var10 = 0;
                              L20: while (true) {
                                if (((lh) this).field_a <= var10) {
                                  var10 = 0;
                                  L21: while (true) {
                                    if (var10 >= ((lh) this).field_a) {
                                      break L19;
                                    } else {
                                      var11 = ((lh) this).field_k[var10];
                                      var12 = ((lh) this).field_p[var11];
                                      var8 = 0;
                                      ((lh) this).field_b[var11] = new int[var12];
                                      var13 = -1;
                                      var14 = 0;
                                      L22: while (true) {
                                        if (var12 <= var14) {
                                          L23: {
                                            ((lh) this).field_g[var11] = 1 + var13;
                                            if (var13 + 1 == var12) {
                                              ((lh) this).field_b[var11] = null;
                                              break L23;
                                            } else {
                                              break L23;
                                            }
                                          }
                                          var10++;
                                          continue L21;
                                        } else {
                                          L24: {
                                            int dupTemp$6 = var8 + var17.c((byte) 102);
                                            var8 = dupTemp$6;
                                            ((lh) this).field_b[var11][var14] = dupTemp$6;
                                            var15 = dupTemp$6;
                                            if (var15 > var13) {
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
                                  ((lh) this).field_p[((lh) this).field_k[var10]] = var17.c((byte) 92);
                                  var10++;
                                  continue L20;
                                }
                              }
                            } else {
                              var10 = 0;
                              L25: while (true) {
                                if (var10 >= ((lh) this).field_a) {
                                  var10 = 0;
                                  L26: while (true) {
                                    if (var10 >= ((lh) this).field_a) {
                                      break L19;
                                    } else {
                                      var11 = ((lh) this).field_k[var10];
                                      var8 = 0;
                                      var12 = ((lh) this).field_p[var11];
                                      var13 = -1;
                                      ((lh) this).field_b[var11] = new int[var12];
                                      var14 = 0;
                                      L27: while (true) {
                                        if (var14 >= var12) {
                                          L28: {
                                            ((lh) this).field_g[var11] = 1 + var13;
                                            if (1 + var13 == var12) {
                                              ((lh) this).field_b[var11] = null;
                                              break L28;
                                            } else {
                                              break L28;
                                            }
                                          }
                                          var10++;
                                          continue L26;
                                        } else {
                                          L29: {
                                            int dupTemp$7 = var8 + var17.h(26491);
                                            var8 = dupTemp$7;
                                            ((lh) this).field_b[var11][var14] = dupTemp$7;
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
                                  ((lh) this).field_p[((lh) this).field_k[var10]] = var17.h(ih.a(param0, 26491));
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
                              ((lh) this).field_o = new int[1 + var9][];
                              ((lh) this).field_c = new vj[var9 + 1];
                              var10 = 0;
                              L31: while (true) {
                                if (var10 >= ((lh) this).field_a) {
                                  break L30;
                                } else {
                                  var11 = ((lh) this).field_k[var10];
                                  var12 = ((lh) this).field_p[var11];
                                  ((lh) this).field_o[var11] = new int[((lh) this).field_g[var11]];
                                  var13 = 0;
                                  L32: while (true) {
                                    if (((lh) this).field_g[var11] <= var13) {
                                      var13 = 0;
                                      L33: while (true) {
                                        if (var12 <= var13) {
                                          ((lh) this).field_c[var11] = new vj(((lh) this).field_o[var11]);
                                          var10++;
                                          continue L31;
                                        } else {
                                          L34: {
                                            if (null == ((lh) this).field_b[var11]) {
                                              var14 = var13;
                                              break L34;
                                            } else {
                                              var14 = ((lh) this).field_b[var11][var13];
                                              break L34;
                                            }
                                          }
                                          ((lh) this).field_o[var11][var14] = var17.b(false);
                                          var13++;
                                          continue L33;
                                        }
                                      }
                                    } else {
                                      ((lh) this).field_o[var11][var13] = -1;
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
                          ((lh) this).field_j[((lh) this).field_k[var10]] = var17.b(false);
                          var10++;
                          continue L18;
                        }
                      }
                    } else {
                      ((lh) this).field_l[((lh) this).field_k[var10]] = var17.b(false);
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
            stackOut_95_0 = (RuntimeException) var3;
            stackOut_95_1 = new StringBuilder().append("lh.C(").append(param0).append(44);
            stackIn_97_0 = stackOut_95_0;
            stackIn_97_1 = stackOut_95_1;
            stackIn_96_0 = stackOut_95_0;
            stackIn_96_1 = stackOut_95_1;
            if (param1 == null) {
              stackOut_97_0 = (RuntimeException) (Object) stackIn_97_0;
              stackOut_97_1 = (StringBuilder) (Object) stackIn_97_1;
              stackOut_97_2 = "null";
              stackIn_98_0 = stackOut_97_0;
              stackIn_98_1 = stackOut_97_1;
              stackIn_98_2 = stackOut_97_2;
              break L35;
            } else {
              stackOut_96_0 = (RuntimeException) (Object) stackIn_96_0;
              stackOut_96_1 = (StringBuilder) (Object) stackIn_96_1;
              stackOut_96_2 = "{...}";
              stackIn_98_0 = stackOut_96_0;
              stackIn_98_1 = stackOut_96_1;
              stackIn_98_2 = stackOut_96_2;
              break L35;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_98_0, stackIn_98_2 + 41);
        }
    }

    lh(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
            ((lh) this).field_m = bg.a(param0.length, param0, 0);
            if (((lh) this).field_m != param1) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if (64 != param2.length) {
                    throw new RuntimeException();
                }
                ((lh) this).field_s = bc.a(0, 0, param0.length, param0);
                for (var4_int = 0; var4_int < 64; var4_int++) {
                    if (((lh) this).field_s[var4_int] != param2[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            this.a(0, param0);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "lh.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new th();
        field_d = 1;
        field_f = true;
    }
}
