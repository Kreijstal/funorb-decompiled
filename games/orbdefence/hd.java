/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hd {
    private int field_n;
    int field_s;
    private int[] field_m;
    private int[][] field_a;
    int[] field_d;
    int[] field_i;
    int[] field_r;
    static ba field_q;
    int[] field_l;
    int[][] field_f;
    int field_p;
    private byte[] field_h;
    int[] field_c;
    int field_b;
    af field_o;
    byte[][] field_k;
    static hj field_e;
    static int field_t;
    af[] field_g;
    static String field_j;

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
        mg var17 = null;
        byte[] var21 = null;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_91_0 = null;
        StringBuilder stackIn_91_1 = null;
        RuntimeException stackIn_92_0 = null;
        StringBuilder stackIn_92_1 = null;
        RuntimeException stackIn_93_0 = null;
        StringBuilder stackIn_93_1 = null;
        String stackIn_93_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_90_0 = null;
        StringBuilder stackOut_90_1 = null;
        RuntimeException stackOut_92_0 = null;
        StringBuilder stackOut_92_1 = null;
        String stackOut_92_2 = null;
        RuntimeException stackOut_91_0 = null;
        StringBuilder stackOut_91_1 = null;
        String stackOut_91_2 = null;
        var16 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var17 = new mg(nf.a(param1, -2));
              var4 = var17.b((byte) 90);
              if (var4 < 5) {
                break L1;
              } else {
                if (7 < var4) {
                  break L1;
                } else {
                  L2: {
                    if (6 <= var4) {
                      ((hd) this).field_b = var17.l(0);
                      break L2;
                    } else {
                      ((hd) this).field_b = 0;
                      break L2;
                    }
                  }
                  L3: {
                    var5 = var17.b((byte) 90);
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
                    if (var4 >= 7) {
                      ((hd) this).field_n = var17.d(true);
                      break L5;
                    } else {
                      ((hd) this).field_n = var17.j(98203176);
                      break L5;
                    }
                  }
                  L6: {
                    var8 = 0;
                    ((hd) this).field_c = new int[((hd) this).field_n];
                    var9 = -1;
                    if (var4 >= 7) {
                      var10 = 0;
                      L7: while (true) {
                        if (var10 >= ((hd) this).field_n) {
                          break L6;
                        } else {
                          L8: {
                            int dupTemp$4 = var8 + var17.d(true);
                            var8 = dupTemp$4;
                            ((hd) this).field_c[var10] = dupTemp$4;
                            if (((hd) this).field_c[var10] <= var9) {
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
                        if (var10 >= ((hd) this).field_n) {
                          break L6;
                        } else {
                          L10: {
                            int dupTemp$5 = var8 + var17.j(98203176);
                            var8 = dupTemp$5;
                            ((hd) this).field_c[var10] = dupTemp$5;
                            if (var9 >= ((hd) this).field_c[var10]) {
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
                    ((hd) this).field_s = var9 - -1;
                    ((hd) this).field_l = new int[((hd) this).field_s];
                    ((hd) this).field_i = new int[((hd) this).field_s];
                    ((hd) this).field_r = new int[((hd) this).field_s];
                    if (var7 != 0) {
                      ((hd) this).field_k = new byte[((hd) this).field_s][];
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    ((hd) this).field_d = new int[((hd) this).field_s];
                    ((hd) this).field_f = new int[((hd) this).field_s][];
                    if (var6 == 0) {
                      break L12;
                    } else {
                      ((hd) this).field_m = new int[((hd) this).field_s];
                      var10 = 0;
                      L13: while (true) {
                        if (var10 >= ((hd) this).field_s) {
                          var10 = 0;
                          L14: while (true) {
                            if (((hd) this).field_n <= var10) {
                              ((hd) this).field_o = new af(((hd) this).field_m);
                              break L12;
                            } else {
                              ((hd) this).field_m[((hd) this).field_c[var10]] = var17.l(0);
                              var10++;
                              continue L14;
                            }
                          }
                        } else {
                          ((hd) this).field_m[var10] = -1;
                          var10++;
                          continue L13;
                        }
                      }
                    }
                  }
                  var10 = 0;
                  L15: while (true) {
                    if (var10 >= ((hd) this).field_n) {
                      L16: {
                        if (var7 == 0) {
                          break L16;
                        } else {
                          var10 = 0;
                          L17: while (true) {
                            if (var10 >= ((hd) this).field_n) {
                              break L16;
                            } else {
                              var21 = new byte[64];
                              var17.a((byte) 115, var21, 0, 64);
                              ((hd) this).field_k[((hd) this).field_c[var10]] = var21;
                              var10++;
                              continue L17;
                            }
                          }
                        }
                      }
                      var10 = 0;
                      L18: while (true) {
                        if (var10 >= ((hd) this).field_n) {
                          L19: {
                            if (var4 >= 7) {
                              var10 = 0;
                              L20: while (true) {
                                if (((hd) this).field_n <= var10) {
                                  var10 = 0;
                                  L21: while (true) {
                                    if (((hd) this).field_n <= var10) {
                                      break L19;
                                    } else {
                                      var11 = ((hd) this).field_c[var10];
                                      var8 = 0;
                                      var12 = ((hd) this).field_d[var11];
                                      ((hd) this).field_f[var11] = new int[var12];
                                      var13 = -1;
                                      var14 = 0;
                                      L22: while (true) {
                                        if (var12 <= var14) {
                                          L23: {
                                            ((hd) this).field_l[var11] = var13 - -1;
                                            if (var12 != var13 - -1) {
                                              break L23;
                                            } else {
                                              ((hd) this).field_f[var11] = null;
                                              break L23;
                                            }
                                          }
                                          var10++;
                                          continue L21;
                                        } else {
                                          L24: {
                                            int dupTemp$6 = var8 + var17.d(true);
                                            var8 = dupTemp$6;
                                            ((hd) this).field_f[var11][var14] = dupTemp$6;
                                            var15 = dupTemp$6;
                                            if (var13 >= var15) {
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
                                  ((hd) this).field_d[((hd) this).field_c[var10]] = var17.d(true);
                                  var10++;
                                  continue L20;
                                }
                              }
                            } else {
                              var10 = 0;
                              L25: while (true) {
                                if (((hd) this).field_n <= var10) {
                                  var10 = 0;
                                  L26: while (true) {
                                    if (((hd) this).field_n <= var10) {
                                      break L19;
                                    } else {
                                      var11 = ((hd) this).field_c[var10];
                                      var8 = 0;
                                      var12 = ((hd) this).field_d[var11];
                                      ((hd) this).field_f[var11] = new int[var12];
                                      var13 = -1;
                                      var14 = 0;
                                      L27: while (true) {
                                        if (var12 <= var14) {
                                          L28: {
                                            ((hd) this).field_l[var11] = 1 + var13;
                                            if (var13 + 1 != var12) {
                                              break L28;
                                            } else {
                                              ((hd) this).field_f[var11] = null;
                                              break L28;
                                            }
                                          }
                                          var10++;
                                          continue L26;
                                        } else {
                                          L29: {
                                            int dupTemp$7 = var8 + var17.j(98203176);
                                            var8 = dupTemp$7;
                                            ((hd) this).field_f[var11][var14] = dupTemp$7;
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
                                  ((hd) this).field_d[((hd) this).field_c[var10]] = var17.j(98203176);
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
                              ((hd) this).field_g = new af[1 + var9];
                              ((hd) this).field_a = new int[var9 + 1][];
                              var10 = 0;
                              L31: while (true) {
                                if (((hd) this).field_n <= var10) {
                                  break L30;
                                } else {
                                  var11 = ((hd) this).field_c[var10];
                                  var12 = ((hd) this).field_d[var11];
                                  ((hd) this).field_a[var11] = new int[((hd) this).field_l[var11]];
                                  var13 = 0;
                                  L32: while (true) {
                                    if (((hd) this).field_l[var11] <= var13) {
                                      var13 = 0;
                                      L33: while (true) {
                                        if (var13 >= var12) {
                                          ((hd) this).field_g[var11] = new af(((hd) this).field_a[var11]);
                                          var10++;
                                          continue L31;
                                        } else {
                                          L34: {
                                            if (null != ((hd) this).field_f[var11]) {
                                              var14 = ((hd) this).field_f[var11][var13];
                                              break L34;
                                            } else {
                                              var14 = var13;
                                              break L34;
                                            }
                                          }
                                          ((hd) this).field_a[var11][var14] = var17.l(0);
                                          var13++;
                                          continue L33;
                                        }
                                      }
                                    } else {
                                      ((hd) this).field_a[var11][var13] = -1;
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
                          ((hd) this).field_i[((hd) this).field_c[var10]] = var17.l(0);
                          var10++;
                          continue L18;
                        }
                      }
                    } else {
                      ((hd) this).field_r[((hd) this).field_c[var10]] = var17.l(0);
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
            stackOut_90_0 = (RuntimeException) var3;
            stackOut_90_1 = new StringBuilder().append("hd.B(").append(68).append(',');
            stackIn_92_0 = stackOut_90_0;
            stackIn_92_1 = stackOut_90_1;
            stackIn_91_0 = stackOut_90_0;
            stackIn_91_1 = stackOut_90_1;
            if (param1 == null) {
              stackOut_92_0 = (RuntimeException) (Object) stackIn_92_0;
              stackOut_92_1 = (StringBuilder) (Object) stackIn_92_1;
              stackOut_92_2 = "null";
              stackIn_93_0 = stackOut_92_0;
              stackIn_93_1 = stackOut_92_1;
              stackIn_93_2 = stackOut_92_2;
              break L35;
            } else {
              stackOut_91_0 = (RuntimeException) (Object) stackIn_91_0;
              stackOut_91_1 = (StringBuilder) (Object) stackIn_91_1;
              stackOut_91_2 = "{...}";
              stackIn_93_0 = stackOut_91_0;
              stackIn_93_1 = stackOut_91_1;
              stackIn_93_2 = stackOut_91_2;
              break L35;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_93_0, stackIn_93_2 + ')');
        }
    }

    public static void a(int param0) {
        field_q = null;
        field_j = null;
        if (param0 != 100) {
            hd.a(33);
        }
        field_e = null;
    }

    hd(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
            ((hd) this).field_p = eg.a(param0, 0, param0.length);
            if (param1 != ((hd) this).field_p) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if (param2.length != 64) {
                    throw new RuntimeException();
                }
                ((hd) this).field_h = ee.a(-1, param0.length, 0, param0);
                for (var4_int = 0; var4_int < 64; var4_int++) {
                    if (((hd) this).field_h[var4_int] != param2[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            this.a(68, param0);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "hd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = 100;
        field_q = new ba(8, 0, 4, 1);
    }
}
