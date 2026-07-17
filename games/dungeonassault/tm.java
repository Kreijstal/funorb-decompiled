/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tm {
    int[][] field_m;
    ra field_a;
    int[] field_o;
    private int[][] field_d;
    int[] field_i;
    private int[] field_c;
    int[] field_k;
    private byte[] field_r;
    int[] field_q;
    int[] field_j;
    private int field_h;
    static wh field_b;
    int field_s;
    static int field_e;
    static cn field_p;
    ra[] field_n;
    int field_l;
    byte[][] field_g;
    int field_f;

    private final void a(byte[] param0, byte param1) {
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
        ec var17 = null;
        byte[] var21 = null;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        String stackIn_99_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_96_0 = null;
        StringBuilder stackOut_96_1 = null;
        RuntimeException stackOut_98_0 = null;
        StringBuilder stackOut_98_1 = null;
        String stackOut_98_2 = null;
        RuntimeException stackOut_97_0 = null;
        StringBuilder stackOut_97_1 = null;
        String stackOut_97_2 = null;
        var16 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              var17 = new ec(lc.a(param0, 50166));
              var4 = var17.c(true);
              if (5 > var4) {
                break L1;
              } else {
                if (7 >= var4) {
                  L2: {
                    if (6 > var4) {
                      ((tm) this).field_s = 0;
                      break L2;
                    } else {
                      ((tm) this).field_s = var17.h(-42);
                      break L2;
                    }
                  }
                  L3: {
                    var5 = var17.c(true);
                    if ((1 & var5) == 0) {
                      stackOut_11_0 = 0;
                      stackIn_12_0 = stackOut_11_0;
                      break L3;
                    } else {
                      stackOut_10_0 = 1;
                      stackIn_12_0 = stackOut_10_0;
                      break L3;
                    }
                  }
                  L4: {
                    var6 = stackIn_12_0;
                    if (0 == (var5 & 2)) {
                      stackOut_14_0 = 0;
                      stackIn_15_0 = stackOut_14_0;
                      break L4;
                    } else {
                      stackOut_13_0 = 1;
                      stackIn_15_0 = stackOut_13_0;
                      break L4;
                    }
                  }
                  L5: {
                    var7 = stackIn_15_0;
                    if (var4 >= 7) {
                      ((tm) this).field_h = var17.j(1);
                      break L5;
                    } else {
                      ((tm) this).field_h = var17.k(0);
                      break L5;
                    }
                  }
                  L6: {
                    var8 = 0;
                    var9 = -1;
                    ((tm) this).field_j = new int[((tm) this).field_h];
                    if (7 > var4) {
                      var10 = 0;
                      L7: while (true) {
                        if (((tm) this).field_h <= var10) {
                          break L6;
                        } else {
                          L8: {
                            int dupTemp$4 = var8 + var17.k(0);
                            var8 = dupTemp$4;
                            ((tm) this).field_j[var10] = dupTemp$4;
                            if (((tm) this).field_j[var10] <= var9) {
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
                        if (((tm) this).field_h <= var10) {
                          break L6;
                        } else {
                          L10: {
                            int dupTemp$5 = var8 + var17.j(1);
                            var8 = dupTemp$5;
                            ((tm) this).field_j[var10] = dupTemp$5;
                            if (var9 >= ((tm) this).field_j[var10]) {
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
                    ((tm) this).field_l = 1 + var9;
                    ((tm) this).field_m = new int[((tm) this).field_l][];
                    if (var7 != 0) {
                      ((tm) this).field_g = new byte[((tm) this).field_l][];
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    ((tm) this).field_o = new int[((tm) this).field_l];
                    ((tm) this).field_i = new int[((tm) this).field_l];
                    ((tm) this).field_q = new int[((tm) this).field_l];
                    ((tm) this).field_k = new int[((tm) this).field_l];
                    if (var6 != 0) {
                      ((tm) this).field_c = new int[((tm) this).field_l];
                      var10 = 0;
                      L13: while (true) {
                        if (var10 >= ((tm) this).field_l) {
                          var10 = 0;
                          L14: while (true) {
                            if (((tm) this).field_h <= var10) {
                              ((tm) this).field_a = new ra(((tm) this).field_c);
                              break L12;
                            } else {
                              ((tm) this).field_c[((tm) this).field_j[var10]] = var17.h(-50);
                              var10++;
                              continue L14;
                            }
                          }
                        } else {
                          ((tm) this).field_c[var10] = -1;
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
                    if (((tm) this).field_h <= var10) {
                      L16: {
                        if (var7 == 0) {
                          break L16;
                        } else {
                          var10 = 0;
                          L17: while (true) {
                            if (((tm) this).field_h <= var10) {
                              break L16;
                            } else {
                              var21 = new byte[64];
                              var17.a((byte) -124, 0, 64, var21);
                              ((tm) this).field_g[((tm) this).field_j[var10]] = var21;
                              var10++;
                              continue L17;
                            }
                          }
                        }
                      }
                      var10 = 0;
                      L18: while (true) {
                        if (var10 >= ((tm) this).field_h) {
                          L19: {
                            if (var4 >= 7) {
                              var10 = 0;
                              L20: while (true) {
                                if (var10 >= ((tm) this).field_h) {
                                  var10 = 0;
                                  L21: while (true) {
                                    if (var10 >= ((tm) this).field_h) {
                                      break L19;
                                    } else {
                                      var11 = ((tm) this).field_j[var10];
                                      var8 = 0;
                                      var12 = ((tm) this).field_k[var11];
                                      var13 = -1;
                                      ((tm) this).field_m[var11] = new int[var12];
                                      var14 = 0;
                                      L22: while (true) {
                                        if (var12 <= var14) {
                                          L23: {
                                            ((tm) this).field_i[var11] = 1 + var13;
                                            if (var12 == 1 + var13) {
                                              ((tm) this).field_m[var11] = null;
                                              break L23;
                                            } else {
                                              break L23;
                                            }
                                          }
                                          var10++;
                                          continue L21;
                                        } else {
                                          L24: {
                                            int dupTemp$6 = var8 + var17.j(1);
                                            var8 = dupTemp$6;
                                            ((tm) this).field_m[var11][var14] = dupTemp$6;
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
                                  ((tm) this).field_k[((tm) this).field_j[var10]] = var17.j(1);
                                  var10++;
                                  continue L20;
                                }
                              }
                            } else {
                              var10 = 0;
                              L25: while (true) {
                                if (var10 >= ((tm) this).field_h) {
                                  var10 = 0;
                                  L26: while (true) {
                                    if (((tm) this).field_h <= var10) {
                                      break L19;
                                    } else {
                                      var11 = ((tm) this).field_j[var10];
                                      var8 = 0;
                                      var12 = ((tm) this).field_k[var11];
                                      ((tm) this).field_m[var11] = new int[var12];
                                      var13 = -1;
                                      var14 = 0;
                                      L27: while (true) {
                                        if (var12 <= var14) {
                                          L28: {
                                            ((tm) this).field_i[var11] = 1 + var13;
                                            if (var12 == 1 + var13) {
                                              ((tm) this).field_m[var11] = null;
                                              break L28;
                                            } else {
                                              break L28;
                                            }
                                          }
                                          var10++;
                                          continue L26;
                                        } else {
                                          L29: {
                                            int dupTemp$7 = var8 + var17.k(0);
                                            var8 = dupTemp$7;
                                            ((tm) this).field_m[var11][var14] = dupTemp$7;
                                            var15 = dupTemp$7;
                                            if (var13 < var15) {
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
                                  ((tm) this).field_k[((tm) this).field_j[var10]] = var17.k(0);
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
                              ((tm) this).field_d = new int[1 + var9][];
                              ((tm) this).field_n = new ra[var9 + 1];
                              var10 = 0;
                              L31: while (true) {
                                if (var10 >= ((tm) this).field_h) {
                                  break L30;
                                } else {
                                  var11 = ((tm) this).field_j[var10];
                                  var12 = ((tm) this).field_k[var11];
                                  ((tm) this).field_d[var11] = new int[((tm) this).field_i[var11]];
                                  var13 = 0;
                                  L32: while (true) {
                                    if (((tm) this).field_i[var11] <= var13) {
                                      var13 = 0;
                                      L33: while (true) {
                                        if (var13 >= var12) {
                                          ((tm) this).field_n[var11] = new ra(((tm) this).field_d[var11]);
                                          var10++;
                                          continue L31;
                                        } else {
                                          L34: {
                                            if (((tm) this).field_m[var11] != null) {
                                              var14 = ((tm) this).field_m[var11][var13];
                                              break L34;
                                            } else {
                                              var14 = var13;
                                              break L34;
                                            }
                                          }
                                          ((tm) this).field_d[var11][var14] = var17.h(-81);
                                          var13++;
                                          continue L33;
                                        }
                                      }
                                    } else {
                                      ((tm) this).field_d[var11][var13] = -1;
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
                          ((tm) this).field_o[((tm) this).field_j[var10]] = var17.h(-100);
                          var10++;
                          continue L18;
                        }
                      }
                    } else {
                      ((tm) this).field_q[((tm) this).field_j[var10]] = var17.h(-77);
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
            stackOut_96_0 = (RuntimeException) var3;
            stackOut_96_1 = new StringBuilder().append("tm.A(");
            stackIn_98_0 = stackOut_96_0;
            stackIn_98_1 = stackOut_96_1;
            stackIn_97_0 = stackOut_96_0;
            stackIn_97_1 = stackOut_96_1;
            if (param0 == null) {
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
          throw vk.a((Throwable) (Object) stackIn_99_0, stackIn_99_2 + 44 + 118 + 41);
        }
    }

    public static void a(int param0) {
        field_p = null;
        field_b = null;
        int var1 = -16;
    }

    tm(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
            ((tm) this).field_f = qh.a(16777215, param0, param0.length);
            if (param1 != ((tm) this).field_f) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if (param2.length != 64) {
                    throw new RuntimeException();
                }
                ((tm) this).field_r = rn.a(param0.length, 0, 8, param0);
                for (var4_int = 0; var4_int < 64; var4_int++) {
                    if (param2[var4_int] != ((tm) this).field_r[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            this.a(param0, (byte) 118);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "tm.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    static {
    }
}
