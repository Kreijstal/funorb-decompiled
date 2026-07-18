/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sg {
    int field_p;
    int[] field_b;
    static String field_i;
    private int[][] field_o;
    private byte[] field_g;
    static long field_j;
    byte[][] field_a;
    int field_l;
    bf field_e;
    int field_d;
    int[] field_c;
    bf[] field_q;
    private int field_h;
    int[] field_m;
    private int[] field_n;
    int[][] field_s;
    int[] field_r;
    static String field_k;
    int[] field_f;

    private final void a(byte[] param0) {
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
        fs var17 = null;
        byte[] var21 = null;
        int stackIn_13_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        String stackIn_102_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_99_0 = null;
        StringBuilder stackOut_99_1 = null;
        RuntimeException stackOut_101_0 = null;
        StringBuilder stackOut_101_1 = null;
        String stackOut_101_2 = null;
        RuntimeException stackOut_100_0 = null;
        StringBuilder stackOut_100_1 = null;
        String stackOut_100_2 = null;
        var16 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var17 = new fs(nd.a(-1, param0));
              var4 = var17.e(-31302);
              if (var4 < 5) {
                break L1;
              } else {
                if (var4 <= 7) {
                  L2: {
                    if (var4 < 6) {
                      ((sg) this).field_l = 0;
                      break L2;
                    } else {
                      ((sg) this).field_l = var17.c(true);
                      break L2;
                    }
                  }
                  L3: {
                    var5 = var17.e(-31302);
                    if ((1 & var5) == 0) {
                      stackOut_12_0 = 0;
                      stackIn_13_0 = stackOut_12_0;
                      break L3;
                    } else {
                      stackOut_11_0 = 1;
                      stackIn_13_0 = stackOut_11_0;
                      break L3;
                    }
                  }
                  L4: {
                    var6 = stackIn_13_0;
                    if (var4 < 7) {
                      ((sg) this).field_h = var17.a(255);
                      break L4;
                    } else {
                      ((sg) this).field_h = var17.f(0);
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
                    ((sg) this).field_f = new int[((sg) this).field_h];
                    if (var4 >= 7) {
                      var10 = 0;
                      L7: while (true) {
                        if (((sg) this).field_h <= var10) {
                          break L6;
                        } else {
                          L8: {
                            int dupTemp$4 = var8 + var17.f(0);
                            var8 = dupTemp$4;
                            ((sg) this).field_f[var10] = dupTemp$4;
                            if (~var9 > ~((sg) this).field_f[var10]) {
                              var9 = ((sg) this).field_f[var10];
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
                        if (var10 >= ((sg) this).field_h) {
                          break L6;
                        } else {
                          L10: {
                            int dupTemp$5 = var8 + var17.a(jg.a(-56, -201));
                            var8 = dupTemp$5;
                            ((sg) this).field_f[var10] = dupTemp$5;
                            if (~((sg) this).field_f[var10] < ~var9) {
                              var9 = ((sg) this).field_f[var10];
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
                    ((sg) this).field_d = var9 + 1;
                    ((sg) this).field_b = new int[((sg) this).field_d];
                    ((sg) this).field_c = new int[((sg) this).field_d];
                    if (var7 != 0) {
                      ((sg) this).field_a = new byte[((sg) this).field_d][];
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    ((sg) this).field_s = new int[((sg) this).field_d][];
                    ((sg) this).field_r = new int[((sg) this).field_d];
                    ((sg) this).field_m = new int[((sg) this).field_d];
                    if (var6 == 0) {
                      break L12;
                    } else {
                      ((sg) this).field_n = new int[((sg) this).field_d];
                      var10 = 0;
                      L13: while (true) {
                        if (~((sg) this).field_d >= ~var10) {
                          var10 = 0;
                          L14: while (true) {
                            if (((sg) this).field_h <= var10) {
                              ((sg) this).field_e = new bf(((sg) this).field_n);
                              break L12;
                            } else {
                              ((sg) this).field_n[((sg) this).field_f[var10]] = var17.c(true);
                              var10++;
                              continue L14;
                            }
                          }
                        } else {
                          ((sg) this).field_n[var10] = -1;
                          var10++;
                          continue L13;
                        }
                      }
                    }
                  }
                  var10 = 0;
                  L15: while (true) {
                    if (var10 >= ((sg) this).field_h) {
                      L16: {
                        if (var7 != 0) {
                          var10 = 0;
                          L17: while (true) {
                            if (~((sg) this).field_h >= ~var10) {
                              var10 = 0;
                              L18: while (true) {
                                if (~var10 <= ~((sg) this).field_h) {
                                  break L16;
                                } else {
                                  ((sg) this).field_c[((sg) this).field_f[var10]] = var17.c(true);
                                  var10++;
                                  continue L18;
                                }
                              }
                            } else {
                              var21 = new byte[64];
                              var17.a(var21, 64, 0, (byte) -109);
                              ((sg) this).field_a[((sg) this).field_f[var10]] = var21;
                              var10++;
                              continue L17;
                            }
                          }
                        } else {
                          var10 = 0;
                          L19: while (true) {
                            if (~var10 <= ~((sg) this).field_h) {
                              break L16;
                            } else {
                              ((sg) this).field_c[((sg) this).field_f[var10]] = var17.c(true);
                              var10++;
                              continue L19;
                            }
                          }
                        }
                      }
                      L20: {
                        if (var4 >= 7) {
                          var10 = 0;
                          L21: while (true) {
                            if (((sg) this).field_h <= var10) {
                              var10 = 0;
                              L22: while (true) {
                                if (~var10 <= ~((sg) this).field_h) {
                                  break L20;
                                } else {
                                  var11 = ((sg) this).field_f[var10];
                                  var8 = 0;
                                  var12 = ((sg) this).field_m[var11];
                                  var13 = -1;
                                  ((sg) this).field_s[var11] = new int[var12];
                                  var14 = 0;
                                  L23: while (true) {
                                    if (~var12 >= ~var14) {
                                      L24: {
                                        ((sg) this).field_r[var11] = 1 + var13;
                                        if (~(1 + var13) == ~var12) {
                                          ((sg) this).field_s[var11] = null;
                                          break L24;
                                        } else {
                                          break L24;
                                        }
                                      }
                                      var10++;
                                      continue L22;
                                    } else {
                                      L25: {
                                        int dupTemp$6 = var8 + var17.f(0);
                                        var8 = dupTemp$6;
                                        ((sg) this).field_s[var11][var14] = dupTemp$6;
                                        var15 = dupTemp$6;
                                        if (var15 <= var13) {
                                          break L25;
                                        } else {
                                          var13 = var15;
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
                              ((sg) this).field_m[((sg) this).field_f[var10]] = var17.f(0);
                              var10++;
                              continue L21;
                            }
                          }
                        } else {
                          var10 = 0;
                          L26: while (true) {
                            if (var10 >= ((sg) this).field_h) {
                              var10 = 0;
                              L27: while (true) {
                                if (((sg) this).field_h <= var10) {
                                  break L20;
                                } else {
                                  var11 = ((sg) this).field_f[var10];
                                  var12 = ((sg) this).field_m[var11];
                                  var8 = 0;
                                  ((sg) this).field_s[var11] = new int[var12];
                                  var13 = -1;
                                  var14 = 0;
                                  L28: while (true) {
                                    if (~var12 >= ~var14) {
                                      L29: {
                                        ((sg) this).field_r[var11] = 1 + var13;
                                        if (~var12 != ~(1 + var13)) {
                                          break L29;
                                        } else {
                                          ((sg) this).field_s[var11] = null;
                                          break L29;
                                        }
                                      }
                                      var10++;
                                      continue L27;
                                    } else {
                                      L30: {
                                        int dupTemp$7 = var8 + var17.a(255);
                                        var8 = dupTemp$7;
                                        ((sg) this).field_s[var11][var14] = dupTemp$7;
                                        var15 = dupTemp$7;
                                        if (var15 <= var13) {
                                          break L30;
                                        } else {
                                          var13 = var15;
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
                              ((sg) this).field_m[((sg) this).field_f[var10]] = var17.a(255);
                              var10++;
                              continue L26;
                            }
                          }
                        }
                      }
                      L31: {
                        if (var6 != 0) {
                          ((sg) this).field_o = new int[var9 + 1][];
                          ((sg) this).field_q = new bf[1 + var9];
                          var10 = 0;
                          L32: while (true) {
                            if (~((sg) this).field_h >= ~var10) {
                              break L31;
                            } else {
                              var11 = ((sg) this).field_f[var10];
                              var12 = ((sg) this).field_m[var11];
                              ((sg) this).field_o[var11] = new int[((sg) this).field_r[var11]];
                              var13 = 0;
                              L33: while (true) {
                                if (~var13 <= ~((sg) this).field_r[var11]) {
                                  var13 = 0;
                                  L34: while (true) {
                                    if (var13 >= var12) {
                                      ((sg) this).field_q[var11] = new bf(((sg) this).field_o[var11]);
                                      var10++;
                                      continue L32;
                                    } else {
                                      L35: {
                                        if (((sg) this).field_s[var11] == null) {
                                          var14 = var13;
                                          break L35;
                                        } else {
                                          var14 = ((sg) this).field_s[var11][var13];
                                          break L35;
                                        }
                                      }
                                      ((sg) this).field_o[var11][var14] = var17.c(true);
                                      var13++;
                                      continue L34;
                                    }
                                  }
                                } else {
                                  ((sg) this).field_o[var11][var13] = -1;
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
                      ((sg) this).field_b[((sg) this).field_f[var10]] = var17.c(true);
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
          L36: {
            var3 = decompiledCaughtException;
            stackOut_99_0 = (RuntimeException) var3;
            stackOut_99_1 = new StringBuilder().append("sg.C(");
            stackIn_101_0 = stackOut_99_0;
            stackIn_101_1 = stackOut_99_1;
            stackIn_100_0 = stackOut_99_0;
            stackIn_100_1 = stackOut_99_1;
            if (param0 == null) {
              stackOut_101_0 = (RuntimeException) (Object) stackIn_101_0;
              stackOut_101_1 = (StringBuilder) (Object) stackIn_101_1;
              stackOut_101_2 = "null";
              stackIn_102_0 = stackOut_101_0;
              stackIn_102_1 = stackOut_101_1;
              stackIn_102_2 = stackOut_101_2;
              break L36;
            } else {
              stackOut_100_0 = (RuntimeException) (Object) stackIn_100_0;
              stackOut_100_1 = (StringBuilder) (Object) stackIn_100_1;
              stackOut_100_2 = "{...}";
              stackIn_102_0 = stackOut_100_0;
              stackIn_102_1 = stackOut_100_1;
              stackIn_102_2 = stackOut_100_2;
              break L36;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_102_0, stackIn_102_2 + ',' + -56 + ')');
        }
    }

    public static void a() {
        field_k = null;
        field_i = null;
    }

    final static boolean a(int param0, int param1, int param2) {
        if (param2 < 12) {
            return false;
        }
        return (param1 & 2048) != 0 ? true : false;
    }

    sg(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
            ((sg) this).field_p = am.a(param0.length, param0, (byte) 18);
            if (((sg) this).field_p != param1) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if (64 != param2.length) {
                    throw new RuntimeException();
                }
                ((sg) this).field_g = gn.a(param0, (byte) -110, 0, param0.length);
                for (var4_int = 0; var4_int < 64; var4_int++) {
                    if (param2[var4_int] != ((sg) this).field_g[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            int discarded$0 = -56;
            this.a(param0);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "sg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Loading instruments";
        field_k = "Passwords must be between 5 and 20 characters long";
    }
}
