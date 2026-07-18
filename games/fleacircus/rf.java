/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rf {
    private int[] field_g;
    int[] field_u;
    int[] field_r;
    static int field_l;
    int[] field_n;
    int field_i;
    byte[][] field_o;
    static int[] field_c;
    int field_t;
    static int[] field_e;
    static String field_q;
    private byte[] field_b;
    private int[][] field_m;
    int field_p;
    static int field_a;
    int[][] field_h;
    int[] field_v;
    private int field_s;
    fl[] field_k;
    static int field_d;
    fl field_j;
    int[] field_f;

    public static void a(byte param0) {
        field_c = null;
        field_e = null;
        field_q = null;
    }

    private final void a(byte[] param0, int param1) {
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
        ni var17 = null;
        byte[] var21 = null;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_94_0 = null;
        StringBuilder stackIn_94_1 = null;
        RuntimeException stackIn_95_0 = null;
        StringBuilder stackIn_95_1 = null;
        RuntimeException stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        String stackIn_96_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_93_0 = null;
        StringBuilder stackOut_93_1 = null;
        RuntimeException stackOut_95_0 = null;
        StringBuilder stackOut_95_1 = null;
        String stackOut_95_2 = null;
        RuntimeException stackOut_94_0 = null;
        StringBuilder stackOut_94_1 = null;
        String stackOut_94_2 = null;
        var16 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var17 = new ni(qi.a(param0, -22518));
              var4 = var17.e(false);
              if (var4 < 5) {
                break L1;
              } else {
                if (var4 > 7) {
                  break L1;
                } else {
                  L2: {
                    if (var4 >= 6) {
                      ((rf) this).field_t = var17.c((byte) 126);
                      break L2;
                    } else {
                      ((rf) this).field_t = 0;
                      break L2;
                    }
                  }
                  L3: {
                    var5 = var17.e(false);
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
                      ((rf) this).field_s = var17.e((byte) 120);
                      break L5;
                    } else {
                      ((rf) this).field_s = var17.d((byte) -79);
                      break L5;
                    }
                  }
                  L6: {
                    var8 = 0;
                    var9 = -1;
                    ((rf) this).field_r = new int[((rf) this).field_s];
                    if (var4 < 7) {
                      var10 = 0;
                      L7: while (true) {
                        if (((rf) this).field_s <= var10) {
                          break L6;
                        } else {
                          L8: {
                            int dupTemp$4 = var8 + var17.d((byte) -62);
                            var8 = dupTemp$4;
                            ((rf) this).field_r[var10] = dupTemp$4;
                            if (((rf) this).field_r[var10] <= var9) {
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
                        if (var10 >= ((rf) this).field_s) {
                          break L6;
                        } else {
                          L10: {
                            int dupTemp$5 = var8 + var17.e((byte) 63);
                            var8 = dupTemp$5;
                            ((rf) this).field_r[var10] = dupTemp$5;
                            if (var9 >= ((rf) this).field_r[var10]) {
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
                    ((rf) this).field_i = 1 + var9;
                    ((rf) this).field_h = new int[((rf) this).field_i][];
                    ((rf) this).field_n = new int[((rf) this).field_i];
                    ((rf) this).field_u = new int[((rf) this).field_i];
                    ((rf) this).field_v = new int[((rf) this).field_i];
                    ((rf) this).field_f = new int[((rf) this).field_i];
                    if (var7 != 0) {
                      ((rf) this).field_o = new byte[((rf) this).field_i][];
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if (var6 != 0) {
                      ((rf) this).field_g = new int[((rf) this).field_i];
                      var10 = 0;
                      L13: while (true) {
                        if (var10 >= ((rf) this).field_i) {
                          var10 = 0;
                          L14: while (true) {
                            if (var10 >= ((rf) this).field_s) {
                              ((rf) this).field_j = new fl(((rf) this).field_g);
                              break L12;
                            } else {
                              ((rf) this).field_g[((rf) this).field_r[var10]] = var17.c((byte) -82);
                              var10++;
                              continue L14;
                            }
                          }
                        } else {
                          ((rf) this).field_g[var10] = -1;
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
                    if (var10 >= ((rf) this).field_s) {
                      L16: {
                        if (var7 == 0) {
                          break L16;
                        } else {
                          var10 = 0;
                          L17: while (true) {
                            if (var10 >= ((rf) this).field_s) {
                              break L16;
                            } else {
                              var21 = new byte[64];
                              var17.b(var21, 0, -58, 64);
                              ((rf) this).field_o[((rf) this).field_r[var10]] = var21;
                              var10++;
                              continue L17;
                            }
                          }
                        }
                      }
                      var10 = 0;
                      L18: while (true) {
                        if (((rf) this).field_s <= var10) {
                          L19: {
                            if (var4 >= 7) {
                              var10 = 0;
                              L20: while (true) {
                                if (var10 >= ((rf) this).field_s) {
                                  var10 = 0;
                                  L21: while (true) {
                                    if (var10 >= ((rf) this).field_s) {
                                      break L19;
                                    } else {
                                      var11 = ((rf) this).field_r[var10];
                                      var12 = ((rf) this).field_f[var11];
                                      var8 = 0;
                                      var13 = -1;
                                      ((rf) this).field_h[var11] = new int[var12];
                                      var14 = 0;
                                      L22: while (true) {
                                        if (var14 >= var12) {
                                          L23: {
                                            ((rf) this).field_v[var11] = 1 + var13;
                                            if (var12 == 1 + var13) {
                                              ((rf) this).field_h[var11] = null;
                                              break L23;
                                            } else {
                                              break L23;
                                            }
                                          }
                                          var10++;
                                          continue L21;
                                        } else {
                                          L24: {
                                            int dupTemp$6 = var8 + var17.e((byte) 111);
                                            var8 = dupTemp$6;
                                            ((rf) this).field_h[var11][var14] = dupTemp$6;
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
                                  ((rf) this).field_f[((rf) this).field_r[var10]] = var17.e((byte) 86);
                                  var10++;
                                  continue L20;
                                }
                              }
                            } else {
                              var10 = 0;
                              L25: while (true) {
                                if (var10 >= ((rf) this).field_s) {
                                  var10 = 0;
                                  L26: while (true) {
                                    if (var10 >= ((rf) this).field_s) {
                                      break L19;
                                    } else {
                                      var11 = ((rf) this).field_r[var10];
                                      var8 = 0;
                                      var12 = ((rf) this).field_f[var11];
                                      ((rf) this).field_h[var11] = new int[var12];
                                      var13 = -1;
                                      var14 = 0;
                                      L27: while (true) {
                                        if (var14 >= var12) {
                                          L28: {
                                            ((rf) this).field_v[var11] = var13 - -1;
                                            if (var12 != var13 - -1) {
                                              break L28;
                                            } else {
                                              ((rf) this).field_h[var11] = null;
                                              break L28;
                                            }
                                          }
                                          var10++;
                                          continue L26;
                                        } else {
                                          L29: {
                                            int dupTemp$7 = var8 + var17.d((byte) 122);
                                            var8 = dupTemp$7;
                                            ((rf) this).field_h[var11][var14] = dupTemp$7;
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
                                  ((rf) this).field_f[((rf) this).field_r[var10]] = var17.d((byte) 113);
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
                              ((rf) this).field_m = new int[var9 + 1][];
                              ((rf) this).field_k = new fl[1 + var9];
                              var10 = 0;
                              L31: while (true) {
                                if (((rf) this).field_s <= var10) {
                                  break L30;
                                } else {
                                  var11 = ((rf) this).field_r[var10];
                                  var12 = ((rf) this).field_f[var11];
                                  ((rf) this).field_m[var11] = new int[((rf) this).field_v[var11]];
                                  var13 = 0;
                                  L32: while (true) {
                                    if (((rf) this).field_v[var11] <= var13) {
                                      var13 = 0;
                                      L33: while (true) {
                                        if (var12 <= var13) {
                                          ((rf) this).field_k[var11] = new fl(((rf) this).field_m[var11]);
                                          var10++;
                                          continue L31;
                                        } else {
                                          L34: {
                                            if (((rf) this).field_h[var11] != null) {
                                              var14 = ((rf) this).field_h[var11][var13];
                                              break L34;
                                            } else {
                                              var14 = var13;
                                              break L34;
                                            }
                                          }
                                          ((rf) this).field_m[var11][var14] = var17.c((byte) 124);
                                          var13++;
                                          continue L33;
                                        }
                                      }
                                    } else {
                                      ((rf) this).field_m[var11][var13] = -1;
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
                          ((rf) this).field_n[((rf) this).field_r[var10]] = var17.c((byte) -1);
                          var10++;
                          continue L18;
                        }
                      }
                    } else {
                      ((rf) this).field_u[((rf) this).field_r[var10]] = var17.c((byte) 125);
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
            stackOut_93_0 = (RuntimeException) var3;
            stackOut_93_1 = new StringBuilder().append("rf.B(");
            stackIn_95_0 = stackOut_93_0;
            stackIn_95_1 = stackOut_93_1;
            stackIn_94_0 = stackOut_93_0;
            stackIn_94_1 = stackOut_93_1;
            if (param0 == null) {
              stackOut_95_0 = (RuntimeException) (Object) stackIn_95_0;
              stackOut_95_1 = (StringBuilder) (Object) stackIn_95_1;
              stackOut_95_2 = "null";
              stackIn_96_0 = stackOut_95_0;
              stackIn_96_1 = stackOut_95_1;
              stackIn_96_2 = stackOut_95_2;
              break L35;
            } else {
              stackOut_94_0 = (RuntimeException) (Object) stackIn_94_0;
              stackOut_94_1 = (StringBuilder) (Object) stackIn_94_1;
              stackOut_94_2 = "{...}";
              stackIn_96_0 = stackOut_94_0;
              stackIn_96_1 = stackOut_94_1;
              stackIn_96_2 = stackOut_94_2;
              break L35;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_96_0, stackIn_96_2 + ',' + 19083 + ')');
        }
    }

    rf(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
            ((rf) this).field_p = ia.a(true, param0, param0.length);
            if (((rf) this).field_p != param1) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if (param2.length != 64) {
                    throw new RuntimeException();
                }
                ((rf) this).field_b = kb.a(param0, param0.length, (byte) 111, 0);
                for (var4_int = 0; var4_int < 64; var4_int++) {
                    if (((rf) this).field_b[var4_int] != param2[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            this.a(param0, 19083);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "rf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new int[40];
        field_q = "Unfortunately we are unable to create an account for you at this time.";
        field_a = -1;
        field_c = new int[]{1, 2, 3, 10, 2, 1, 1, 2, 3, 3, 2, 2, 2, 3, 5, 10};
        field_d = 5;
    }
}
