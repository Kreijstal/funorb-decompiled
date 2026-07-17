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
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_93_0 = null;
        StringBuilder stackIn_93_1 = null;
        RuntimeException stackIn_94_0 = null;
        StringBuilder stackIn_94_1 = null;
        RuntimeException stackIn_95_0 = null;
        StringBuilder stackIn_95_1 = null;
        String stackIn_95_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_92_0 = null;
        StringBuilder stackOut_92_1 = null;
        RuntimeException stackOut_94_0 = null;
        StringBuilder stackOut_94_1 = null;
        String stackOut_94_2 = null;
        RuntimeException stackOut_93_0 = null;
        StringBuilder stackOut_93_1 = null;
        String stackOut_93_2 = null;
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
                    if (param0 >= 63) {
                      break L3;
                    } else {
                      field_q = null;
                      break L3;
                    }
                  }
                  L4: {
                    if ((1 & var5) == 0) {
                      stackOut_12_0 = 0;
                      stackIn_13_0 = stackOut_12_0;
                      break L4;
                    } else {
                      stackOut_11_0 = 1;
                      stackIn_13_0 = stackOut_11_0;
                      break L4;
                    }
                  }
                  L5: {
                    var6 = stackIn_13_0;
                    if ((2 & var5) == 0) {
                      stackOut_15_0 = 0;
                      stackIn_16_0 = stackOut_15_0;
                      break L5;
                    } else {
                      stackOut_14_0 = 1;
                      stackIn_16_0 = stackOut_14_0;
                      break L5;
                    }
                  }
                  L6: {
                    var7 = stackIn_16_0;
                    if (var4 >= 7) {
                      ((hd) this).field_n = var17.d(true);
                      break L6;
                    } else {
                      ((hd) this).field_n = var17.j(98203176);
                      break L6;
                    }
                  }
                  L7: {
                    var8 = 0;
                    ((hd) this).field_c = new int[((hd) this).field_n];
                    var9 = -1;
                    if (var4 >= 7) {
                      var10 = 0;
                      L8: while (true) {
                        if (var10 >= ((hd) this).field_n) {
                          break L7;
                        } else {
                          L9: {
                            int dupTemp$4 = var8 + var17.d(true);
                            var8 = dupTemp$4;
                            ((hd) this).field_c[var10] = dupTemp$4;
                            if (((hd) this).field_c[var10] <= var9) {
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          var10++;
                          continue L8;
                        }
                      }
                    } else {
                      var10 = 0;
                      L10: while (true) {
                        if (var10 >= ((hd) this).field_n) {
                          break L7;
                        } else {
                          L11: {
                            int dupTemp$5 = var8 + var17.j(98203176);
                            var8 = dupTemp$5;
                            ((hd) this).field_c[var10] = dupTemp$5;
                            if (var9 >= ((hd) this).field_c[var10]) {
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                          var10++;
                          continue L10;
                        }
                      }
                    }
                  }
                  L12: {
                    ((hd) this).field_s = var9 - -1;
                    ((hd) this).field_l = new int[((hd) this).field_s];
                    ((hd) this).field_i = new int[((hd) this).field_s];
                    ((hd) this).field_r = new int[((hd) this).field_s];
                    if (var7 != 0) {
                      ((hd) this).field_k = new byte[((hd) this).field_s][];
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    ((hd) this).field_d = new int[((hd) this).field_s];
                    ((hd) this).field_f = new int[((hd) this).field_s][];
                    if (var6 == 0) {
                      break L13;
                    } else {
                      ((hd) this).field_m = new int[((hd) this).field_s];
                      var10 = 0;
                      L14: while (true) {
                        if (var10 >= ((hd) this).field_s) {
                          var10 = 0;
                          L15: while (true) {
                            if (((hd) this).field_n <= var10) {
                              ((hd) this).field_o = new af(((hd) this).field_m);
                              break L13;
                            } else {
                              ((hd) this).field_m[((hd) this).field_c[var10]] = var17.l(0);
                              var10++;
                              continue L15;
                            }
                          }
                        } else {
                          ((hd) this).field_m[var10] = -1;
                          var10++;
                          continue L14;
                        }
                      }
                    }
                  }
                  var10 = 0;
                  L16: while (true) {
                    if (var10 >= ((hd) this).field_n) {
                      L17: {
                        if (var7 == 0) {
                          break L17;
                        } else {
                          var10 = 0;
                          L18: while (true) {
                            if (var10 >= ((hd) this).field_n) {
                              break L17;
                            } else {
                              var21 = new byte[64];
                              var17.a((byte) 115, var21, 0, 64);
                              ((hd) this).field_k[((hd) this).field_c[var10]] = var21;
                              var10++;
                              continue L18;
                            }
                          }
                        }
                      }
                      var10 = 0;
                      L19: while (true) {
                        if (var10 >= ((hd) this).field_n) {
                          L20: {
                            if (var4 >= 7) {
                              var10 = 0;
                              L21: while (true) {
                                if (((hd) this).field_n <= var10) {
                                  var10 = 0;
                                  L22: while (true) {
                                    if (((hd) this).field_n <= var10) {
                                      break L20;
                                    } else {
                                      var11 = ((hd) this).field_c[var10];
                                      var8 = 0;
                                      var12 = ((hd) this).field_d[var11];
                                      ((hd) this).field_f[var11] = new int[var12];
                                      var13 = -1;
                                      var14 = 0;
                                      L23: while (true) {
                                        if (var12 <= var14) {
                                          L24: {
                                            ((hd) this).field_l[var11] = var13 - -1;
                                            if (var12 != var13 - -1) {
                                              break L24;
                                            } else {
                                              ((hd) this).field_f[var11] = null;
                                              break L24;
                                            }
                                          }
                                          var10++;
                                          continue L22;
                                        } else {
                                          L25: {
                                            int dupTemp$6 = var8 + var17.d(true);
                                            var8 = dupTemp$6;
                                            ((hd) this).field_f[var11][var14] = dupTemp$6;
                                            var15 = dupTemp$6;
                                            if (var13 >= var15) {
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
                                  ((hd) this).field_d[((hd) this).field_c[var10]] = var17.d(true);
                                  var10++;
                                  continue L21;
                                }
                              }
                            } else {
                              var10 = 0;
                              L26: while (true) {
                                if (((hd) this).field_n <= var10) {
                                  var10 = 0;
                                  L27: while (true) {
                                    if (((hd) this).field_n <= var10) {
                                      break L20;
                                    } else {
                                      var11 = ((hd) this).field_c[var10];
                                      var8 = 0;
                                      var12 = ((hd) this).field_d[var11];
                                      ((hd) this).field_f[var11] = new int[var12];
                                      var13 = -1;
                                      var14 = 0;
                                      L28: while (true) {
                                        if (var12 <= var14) {
                                          L29: {
                                            ((hd) this).field_l[var11] = 1 + var13;
                                            if (var13 + 1 != var12) {
                                              break L29;
                                            } else {
                                              ((hd) this).field_f[var11] = null;
                                              break L29;
                                            }
                                          }
                                          var10++;
                                          continue L27;
                                        } else {
                                          L30: {
                                            int dupTemp$7 = var8 + var17.j(98203176);
                                            var8 = dupTemp$7;
                                            ((hd) this).field_f[var11][var14] = dupTemp$7;
                                            var15 = dupTemp$7;
                                            if (var13 >= var15) {
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
                                  ((hd) this).field_d[((hd) this).field_c[var10]] = var17.j(98203176);
                                  var10++;
                                  continue L26;
                                }
                              }
                            }
                          }
                          L31: {
                            if (var6 == 0) {
                              break L31;
                            } else {
                              ((hd) this).field_g = new af[1 + var9];
                              ((hd) this).field_a = new int[var9 + 1][];
                              var10 = 0;
                              L32: while (true) {
                                if (((hd) this).field_n <= var10) {
                                  break L31;
                                } else {
                                  var11 = ((hd) this).field_c[var10];
                                  var12 = ((hd) this).field_d[var11];
                                  ((hd) this).field_a[var11] = new int[((hd) this).field_l[var11]];
                                  var13 = 0;
                                  L33: while (true) {
                                    if (((hd) this).field_l[var11] <= var13) {
                                      var13 = 0;
                                      L34: while (true) {
                                        if (var13 >= var12) {
                                          ((hd) this).field_g[var11] = new af(((hd) this).field_a[var11]);
                                          var10++;
                                          continue L32;
                                        } else {
                                          L35: {
                                            if (null != ((hd) this).field_f[var11]) {
                                              var14 = ((hd) this).field_f[var11][var13];
                                              break L35;
                                            } else {
                                              var14 = var13;
                                              break L35;
                                            }
                                          }
                                          ((hd) this).field_a[var11][var14] = var17.l(0);
                                          var13++;
                                          continue L34;
                                        }
                                      }
                                    } else {
                                      ((hd) this).field_a[var11][var13] = -1;
                                      var13++;
                                      continue L33;
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
                          continue L19;
                        }
                      }
                    } else {
                      ((hd) this).field_r[((hd) this).field_c[var10]] = var17.l(0);
                      var10++;
                      continue L16;
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
            stackOut_92_0 = (RuntimeException) var3;
            stackOut_92_1 = new StringBuilder().append("hd.B(").append(param0).append(44);
            stackIn_94_0 = stackOut_92_0;
            stackIn_94_1 = stackOut_92_1;
            stackIn_93_0 = stackOut_92_0;
            stackIn_93_1 = stackOut_92_1;
            if (param1 == null) {
              stackOut_94_0 = (RuntimeException) (Object) stackIn_94_0;
              stackOut_94_1 = (StringBuilder) (Object) stackIn_94_1;
              stackOut_94_2 = "null";
              stackIn_95_0 = stackOut_94_0;
              stackIn_95_1 = stackOut_94_1;
              stackIn_95_2 = stackOut_94_2;
              break L36;
            } else {
              stackOut_93_0 = (RuntimeException) (Object) stackIn_93_0;
              stackOut_93_1 = (StringBuilder) (Object) stackIn_93_1;
              stackOut_93_2 = "{...}";
              stackIn_95_0 = stackOut_93_0;
              stackIn_95_1 = stackOut_93_1;
              stackIn_95_2 = stackOut_93_2;
              break L36;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_95_0, stackIn_95_2 + 41);
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
            throw dd.a((Throwable) (Object) runtimeException, "hd.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
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
