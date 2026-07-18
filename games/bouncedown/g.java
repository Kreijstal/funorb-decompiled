/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g {
    da[] field_k;
    private byte[] field_l;
    int[] field_j;
    int field_b;
    private int[] field_d;
    private int field_f;
    int[][] field_o;
    static String field_i;
    int[] field_n;
    int field_m;
    private int[][] field_p;
    da field_a;
    int[] field_g;
    int field_h;
    byte[][] field_e;
    int[] field_c;
    int[] field_q;

    final static we b() {
        we var1 = new we(se.field_C, fk.field_e, cl.field_n[0], ae.field_c[0], ih.field_V[0], qh.field_i[0], ph.field_c[0], he.field_k);
        int discarded$0 = 122;
        vb.a();
        return var1;
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
        wi var17 = null;
        byte[] var21 = null;
        int stackIn_11_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_95_0 = null;
        StringBuilder stackIn_95_1 = null;
        RuntimeException stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        String stackIn_97_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_94_0 = null;
        StringBuilder stackOut_94_1 = null;
        RuntimeException stackOut_96_0 = null;
        StringBuilder stackOut_96_1 = null;
        String stackOut_96_2 = null;
        RuntimeException stackOut_95_0 = null;
        StringBuilder stackOut_95_1 = null;
        String stackOut_95_2 = null;
        var16 = Bounce.field_N;
        try {
          L0: {
            L1: {
              var17 = new wi(ta.a(21125, param1));
              var4 = var17.d((byte) -86);
              if (var4 < 5) {
                break L1;
              } else {
                if (var4 <= 7) {
                  L2: {
                    if (var4 < 6) {
                      ((g) this).field_h = 0;
                      break L2;
                    } else {
                      ((g) this).field_h = var17.j(-3);
                      break L2;
                    }
                  }
                  L3: {
                    var5 = var17.d((byte) -69);
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
                  var6 = stackIn_11_0;
                  L4: {
                    if (var4 >= 7) {
                      ((g) this).field_f = var17.e(72);
                      break L4;
                    } else {
                      ((g) this).field_f = var17.a(-1640531527);
                      break L4;
                    }
                  }
                  L5: {
                    if ((var5 & 2) == 0) {
                      stackOut_18_0 = 0;
                      stackIn_19_0 = stackOut_18_0;
                      break L5;
                    } else {
                      stackOut_17_0 = 1;
                      stackIn_19_0 = stackOut_17_0;
                      break L5;
                    }
                  }
                  L6: {
                    var7 = stackIn_19_0;
                    var8 = 0;
                    var9 = -1;
                    ((g) this).field_n = new int[((g) this).field_f];
                    if (var4 < 7) {
                      var10 = 0;
                      L7: while (true) {
                        if (((g) this).field_f <= var10) {
                          break L6;
                        } else {
                          L8: {
                            int dupTemp$4 = var8 + var17.a(-1640531527);
                            var8 = dupTemp$4;
                            ((g) this).field_n[var10] = dupTemp$4;
                            if (var9 < ((g) this).field_n[var10]) {
                              var9 = ((g) this).field_n[var10];
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
                        if (((g) this).field_f <= var10) {
                          break L6;
                        } else {
                          L10: {
                            int dupTemp$5 = var8 + var17.e(48);
                            var8 = dupTemp$5;
                            ((g) this).field_n[var10] = dupTemp$5;
                            if (((g) this).field_n[var10] > var9) {
                              var9 = ((g) this).field_n[var10];
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
                    ((g) this).field_m = 1 + var9;
                    ((g) this).field_o = new int[((g) this).field_m][];
                    ((g) this).field_g = new int[((g) this).field_m];
                    ((g) this).field_j = new int[((g) this).field_m];
                    ((g) this).field_q = new int[((g) this).field_m];
                    ((g) this).field_c = new int[((g) this).field_m];
                    if (var7 == 0) {
                      break L11;
                    } else {
                      ((g) this).field_e = new byte[((g) this).field_m][];
                      break L11;
                    }
                  }
                  L12: {
                    if (var6 == 0) {
                      break L12;
                    } else {
                      ((g) this).field_d = new int[((g) this).field_m];
                      var10 = 0;
                      L13: while (true) {
                        if (((g) this).field_m <= var10) {
                          var10 = 0;
                          L14: while (true) {
                            if (var10 >= ((g) this).field_f) {
                              ((g) this).field_a = new da(((g) this).field_d);
                              break L12;
                            } else {
                              ((g) this).field_d[((g) this).field_n[var10]] = var17.j(-3);
                              var10++;
                              continue L14;
                            }
                          }
                        } else {
                          ((g) this).field_d[var10] = -1;
                          var10++;
                          continue L13;
                        }
                      }
                    }
                  }
                  var10 = 0;
                  L15: while (true) {
                    if (((g) this).field_f <= var10) {
                      L16: {
                        if (var7 == 0) {
                          break L16;
                        } else {
                          var10 = 0;
                          L17: while (true) {
                            if (((g) this).field_f <= var10) {
                              break L16;
                            } else {
                              var21 = new byte[64];
                              var17.a((byte) 127, 64, var21, 0);
                              ((g) this).field_e[((g) this).field_n[var10]] = var21;
                              var10++;
                              continue L17;
                            }
                          }
                        }
                      }
                      var10 = 0;
                      L18: while (true) {
                        if (((g) this).field_f <= var10) {
                          L19: {
                            if (var4 < 7) {
                              var10 = 0;
                              L20: while (true) {
                                if (((g) this).field_f <= var10) {
                                  var10 = 0;
                                  L21: while (true) {
                                    if (var10 >= ((g) this).field_f) {
                                      break L19;
                                    } else {
                                      var11 = ((g) this).field_n[var10];
                                      var12 = ((g) this).field_q[var11];
                                      var8 = 0;
                                      ((g) this).field_o[var11] = new int[var12];
                                      var13 = -1;
                                      var14 = 0;
                                      L22: while (true) {
                                        if (var14 >= var12) {
                                          L23: {
                                            ((g) this).field_c[var11] = 1 + var13;
                                            if (var12 != 1 + var13) {
                                              break L23;
                                            } else {
                                              ((g) this).field_o[var11] = null;
                                              break L23;
                                            }
                                          }
                                          var10++;
                                          continue L21;
                                        } else {
                                          L24: {
                                            int dupTemp$6 = var8 + var17.a(-1640531527);
                                            var8 = dupTemp$6;
                                            ((g) this).field_o[var11][var14] = dupTemp$6;
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
                                  ((g) this).field_q[((g) this).field_n[var10]] = var17.a(-1640531527);
                                  var10++;
                                  continue L20;
                                }
                              }
                            } else {
                              var10 = 0;
                              L25: while (true) {
                                if (var10 >= ((g) this).field_f) {
                                  var10 = 0;
                                  L26: while (true) {
                                    if (var10 >= ((g) this).field_f) {
                                      break L19;
                                    } else {
                                      var11 = ((g) this).field_n[var10];
                                      var12 = ((g) this).field_q[var11];
                                      var8 = 0;
                                      ((g) this).field_o[var11] = new int[var12];
                                      var13 = -1;
                                      var14 = 0;
                                      L27: while (true) {
                                        if (var12 <= var14) {
                                          L28: {
                                            ((g) this).field_c[var11] = 1 + var13;
                                            if (var13 + 1 != var12) {
                                              break L28;
                                            } else {
                                              ((g) this).field_o[var11] = null;
                                              break L28;
                                            }
                                          }
                                          var10++;
                                          continue L26;
                                        } else {
                                          L29: {
                                            int dupTemp$7 = var8 + var17.e(87);
                                            var8 = dupTemp$7;
                                            ((g) this).field_o[var11][var14] = dupTemp$7;
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
                                  ((g) this).field_q[((g) this).field_n[var10]] = var17.e(78);
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
                              ((g) this).field_k = new da[1 + var9];
                              ((g) this).field_p = new int[var9 + 1][];
                              var10 = 0;
                              L31: while (true) {
                                if (((g) this).field_f <= var10) {
                                  break L30;
                                } else {
                                  var11 = ((g) this).field_n[var10];
                                  var12 = ((g) this).field_q[var11];
                                  ((g) this).field_p[var11] = new int[((g) this).field_c[var11]];
                                  var13 = 0;
                                  L32: while (true) {
                                    if (((g) this).field_c[var11] <= var13) {
                                      var13 = 0;
                                      L33: while (true) {
                                        if (var12 <= var13) {
                                          ((g) this).field_k[var11] = new da(((g) this).field_p[var11]);
                                          var10++;
                                          continue L31;
                                        } else {
                                          L34: {
                                            if (null != ((g) this).field_o[var11]) {
                                              var14 = ((g) this).field_o[var11][var13];
                                              break L34;
                                            } else {
                                              var14 = var13;
                                              break L34;
                                            }
                                          }
                                          ((g) this).field_p[var11][var14] = var17.j(ud.a(-10989, 10990));
                                          var13++;
                                          continue L33;
                                        }
                                      }
                                    } else {
                                      ((g) this).field_p[var11][var13] = -1;
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
                          ((g) this).field_g[((g) this).field_n[var10]] = var17.j(-3);
                          var10++;
                          continue L18;
                        }
                      }
                    } else {
                      ((g) this).field_j[((g) this).field_n[var10]] = var17.j(-3);
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
            stackOut_94_0 = (RuntimeException) var3;
            stackOut_94_1 = new StringBuilder().append("g.A(").append(-10989).append(',');
            stackIn_96_0 = stackOut_94_0;
            stackIn_96_1 = stackOut_94_1;
            stackIn_95_0 = stackOut_94_0;
            stackIn_95_1 = stackOut_94_1;
            if (param1 == null) {
              stackOut_96_0 = (RuntimeException) (Object) stackIn_96_0;
              stackOut_96_1 = (StringBuilder) (Object) stackIn_96_1;
              stackOut_96_2 = "null";
              stackIn_97_0 = stackOut_96_0;
              stackIn_97_1 = stackOut_96_1;
              stackIn_97_2 = stackOut_96_2;
              break L35;
            } else {
              stackOut_95_0 = (RuntimeException) (Object) stackIn_95_0;
              stackOut_95_1 = (StringBuilder) (Object) stackIn_95_1;
              stackOut_95_2 = "{...}";
              stackIn_97_0 = stackOut_95_0;
              stackIn_97_1 = stackOut_95_1;
              stackIn_97_2 = stackOut_95_2;
              break L35;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_97_0, stackIn_97_2 + ')');
        }
    }

    public static void a() {
        field_i = null;
    }

    final static boolean a(boolean param0) {
        int discarded$0 = -75;
        return dl.a();
    }

    g(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
            ((g) this).field_b = nb.a(param0, param0.length, (byte) 44);
            if (((g) this).field_b != param1) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if (64 != param2.length) {
                    throw new RuntimeException();
                }
                ((g) this).field_l = jd.a(param0, 0, param0.length, 0);
                for (var4_int = 0; var4_int < 64; var4_int++) {
                    if (param2[var4_int] != ((g) this).field_l[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            this.a(-10989, param0);
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "g.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
