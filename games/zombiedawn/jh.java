/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jh {
    mo[] field_a;
    byte[][] field_f;
    int[] field_t;
    static String field_l;
    private byte[] field_r;
    int[][] field_p;
    int[] field_n;
    int field_m;
    private int[] field_o;
    int field_s;
    int[] field_d;
    static int field_h;
    private int[][] field_b;
    static boolean field_i;
    private int field_q;
    int field_e;
    mo field_g;
    int[] field_c;
    static int field_k;
    int[] field_j;

    final static boolean a(byte param0) {
        n var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        n var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_2_0 = 0;
        var4 = ZombieDawn.field_J;
        try {
          L0: {
            var5 = (n) (Object) dj.field_l.b((byte) 26);
            var1 = var5;
            if (var1 != null) {
              var2 = 0;
              var3 = 0;
              L1: while (true) {
                if (var3 >= var1.field_l) {
                  stackOut_17_0 = 1;
                  stackIn_18_0 = stackOut_17_0;
                  break L0;
                } else {
                  L2: {
                    if (null != var5.field_n[var3]) {
                      if (var5.field_n[var3].field_f != 0) {
                        break L2;
                      } else {
                        stackOut_9_0 = 0;
                        stackIn_10_0 = stackOut_9_0;
                        return stackIn_10_0 != 0;
                      }
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (var5.field_m[var3] == null) {
                      break L3;
                    } else {
                      if (var5.field_m[var3].field_f == 0) {
                        stackOut_14_0 = 0;
                        stackIn_15_0 = stackOut_14_0;
                        return stackIn_15_0 != 0;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var3++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var1_ref, "jh.B(" + 103 + 41);
        }
        return stackIn_18_0 != 0;
    }

    public static void a(int param0) {
        field_l = null;
    }

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
        de var17 = null;
        byte[] var21 = null;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        String stackIn_101_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_98_0 = null;
        StringBuilder stackOut_98_1 = null;
        RuntimeException stackOut_100_0 = null;
        StringBuilder stackOut_100_1 = null;
        String stackOut_100_2 = null;
        RuntimeException stackOut_99_0 = null;
        StringBuilder stackOut_99_1 = null;
        String stackOut_99_2 = null;
        var16 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              var17 = new de(va.a((byte) -122, param0));
              var4 = var17.d((byte) -127);
              if (var4 < 5) {
                break L1;
              } else {
                if (7 < var4) {
                  break L1;
                } else {
                  L2: {
                    if (6 <= var4) {
                      ((jh) this).field_e = var17.c(-51);
                      break L2;
                    } else {
                      ((jh) this).field_e = 0;
                      break L2;
                    }
                  }
                  L3: {
                    var5 = var17.d((byte) -125);
                    if (-1 == (1 & var5)) {
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
                    if (-1 == (2 & var5)) {
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
                    if (7 > var4) {
                      ((jh) this).field_q = var17.f(2);
                      break L5;
                    } else {
                      ((jh) this).field_q = var17.a(-129);
                      break L5;
                    }
                  }
                  L6: {
                    var8 = 0;
                    ((jh) this).field_n = new int[((jh) this).field_q];
                    var9 = -1;
                    if (var4 < 7) {
                      var10 = 0;
                      L7: while (true) {
                        if (var10 >= ((jh) this).field_q) {
                          break L6;
                        } else {
                          L8: {
                            int dupTemp$4 = var8 + var17.f(2);
                            var8 = dupTemp$4;
                            ((jh) this).field_n[var10] = dupTemp$4;
                            if (((jh) this).field_n[var10] > var9) {
                              var9 = ((jh) this).field_n[var10];
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
                        if (((jh) this).field_q <= var10) {
                          break L6;
                        } else {
                          L10: {
                            int dupTemp$5 = var8 + var17.a(-129);
                            var8 = dupTemp$5;
                            ((jh) this).field_n[var10] = dupTemp$5;
                            if (((jh) this).field_n[var10] <= var9) {
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
                    ((jh) this).field_s = var9 + 1;
                    ((jh) this).field_c = new int[((jh) this).field_s];
                    ((jh) this).field_d = new int[((jh) this).field_s];
                    if (var7 != 0) {
                      ((jh) this).field_f = new byte[((jh) this).field_s][];
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  ((jh) this).field_t = new int[((jh) this).field_s];
                  ((jh) this).field_p = new int[((jh) this).field_s][];
                  ((jh) this).field_j = new int[((jh) this).field_s];
                  L12: {
                    if (var6 != 0) {
                      ((jh) this).field_o = new int[((jh) this).field_s];
                      var10 = 0;
                      L13: while (true) {
                        if (((jh) this).field_s <= var10) {
                          var10 = 0;
                          L14: while (true) {
                            if (var10 >= ((jh) this).field_q) {
                              ((jh) this).field_g = new mo(((jh) this).field_o);
                              break L12;
                            } else {
                              ((jh) this).field_o[((jh) this).field_n[var10]] = var17.c(rd.b(-80, 41));
                              var10++;
                              continue L14;
                            }
                          }
                        } else {
                          ((jh) this).field_o[var10] = -1;
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
                    if (var10 >= ((jh) this).field_q) {
                      L16: {
                        if (var7 == 0) {
                          break L16;
                        } else {
                          var10 = 0;
                          L17: while (true) {
                            if (var10 >= ((jh) this).field_q) {
                              break L16;
                            } else {
                              var21 = new byte[64];
                              var17.a(64, 0, var21, 11240);
                              ((jh) this).field_f[((jh) this).field_n[var10]] = var21;
                              var10++;
                              continue L17;
                            }
                          }
                        }
                      }
                      var10 = 0;
                      L18: while (true) {
                        if (var10 >= ((jh) this).field_q) {
                          L19: {
                            if (var4 < 7) {
                              var10 = 0;
                              L20: while (true) {
                                if (((jh) this).field_q <= var10) {
                                  var10 = 0;
                                  L21: while (true) {
                                    if (var10 >= ((jh) this).field_q) {
                                      break L19;
                                    } else {
                                      var11 = ((jh) this).field_n[var10];
                                      var8 = 0;
                                      var12 = ((jh) this).field_t[var11];
                                      var13 = -1;
                                      ((jh) this).field_p[var11] = new int[var12];
                                      var14 = 0;
                                      L22: while (true) {
                                        if (var12 <= var14) {
                                          L23: {
                                            ((jh) this).field_d[var11] = var13 + 1;
                                            if (var12 == var13 + 1) {
                                              ((jh) this).field_p[var11] = null;
                                              break L23;
                                            } else {
                                              break L23;
                                            }
                                          }
                                          var10++;
                                          continue L21;
                                        } else {
                                          L24: {
                                            int dupTemp$6 = var8 + var17.f(rd.b(-80, -78));
                                            var8 = dupTemp$6;
                                            ((jh) this).field_p[var11][var14] = dupTemp$6;
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
                                  ((jh) this).field_t[((jh) this).field_n[var10]] = var17.f(2);
                                  var10++;
                                  continue L20;
                                }
                              }
                            } else {
                              var10 = 0;
                              L25: while (true) {
                                if (((jh) this).field_q <= var10) {
                                  var10 = 0;
                                  L26: while (true) {
                                    if (((jh) this).field_q <= var10) {
                                      break L19;
                                    } else {
                                      var11 = ((jh) this).field_n[var10];
                                      var12 = ((jh) this).field_t[var11];
                                      var8 = 0;
                                      var13 = -1;
                                      ((jh) this).field_p[var11] = new int[var12];
                                      var14 = 0;
                                      L27: while (true) {
                                        if (var12 <= var14) {
                                          L28: {
                                            ((jh) this).field_d[var11] = 1 + var13;
                                            if (var13 + 1 == var12) {
                                              ((jh) this).field_p[var11] = null;
                                              break L28;
                                            } else {
                                              break L28;
                                            }
                                          }
                                          var10++;
                                          continue L26;
                                        } else {
                                          L29: {
                                            int dupTemp$7 = var8 + var17.a(-129);
                                            var8 = dupTemp$7;
                                            ((jh) this).field_p[var11][var14] = dupTemp$7;
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
                                  ((jh) this).field_t[((jh) this).field_n[var10]] = var17.a(-129);
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
                              ((jh) this).field_b = new int[1 + var9][];
                              ((jh) this).field_a = new mo[var9 + 1];
                              var10 = 0;
                              L31: while (true) {
                                if (var10 >= ((jh) this).field_q) {
                                  break L30;
                                } else {
                                  var11 = ((jh) this).field_n[var10];
                                  var12 = ((jh) this).field_t[var11];
                                  ((jh) this).field_b[var11] = new int[((jh) this).field_d[var11]];
                                  var13 = 0;
                                  L32: while (true) {
                                    if (var13 >= ((jh) this).field_d[var11]) {
                                      var13 = 0;
                                      L33: while (true) {
                                        if (var12 <= var13) {
                                          ((jh) this).field_a[var11] = new mo(((jh) this).field_b[var11]);
                                          var10++;
                                          continue L31;
                                        } else {
                                          L34: {
                                            if (null != ((jh) this).field_p[var11]) {
                                              var14 = ((jh) this).field_p[var11][var13];
                                              break L34;
                                            } else {
                                              var14 = var13;
                                              break L34;
                                            }
                                          }
                                          ((jh) this).field_b[var11][var14] = var17.c(109);
                                          var13++;
                                          continue L33;
                                        }
                                      }
                                    } else {
                                      ((jh) this).field_b[var11][var13] = -1;
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
                          ((jh) this).field_c[((jh) this).field_n[var10]] = var17.c(117);
                          var10++;
                          continue L18;
                        }
                      }
                    } else {
                      ((jh) this).field_j[((jh) this).field_n[var10]] = var17.c(109);
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
            stackOut_98_0 = (RuntimeException) var3;
            stackOut_98_1 = new StringBuilder().append("jh.C(");
            stackIn_100_0 = stackOut_98_0;
            stackIn_100_1 = stackOut_98_1;
            stackIn_99_0 = stackOut_98_0;
            stackIn_99_1 = stackOut_98_1;
            if (param0 == null) {
              stackOut_100_0 = (RuntimeException) (Object) stackIn_100_0;
              stackOut_100_1 = (StringBuilder) (Object) stackIn_100_1;
              stackOut_100_2 = "null";
              stackIn_101_0 = stackOut_100_0;
              stackIn_101_1 = stackOut_100_1;
              stackIn_101_2 = stackOut_100_2;
              break L35;
            } else {
              stackOut_99_0 = (RuntimeException) (Object) stackIn_99_0;
              stackOut_99_1 = (StringBuilder) (Object) stackIn_99_1;
              stackOut_99_2 = "{...}";
              stackIn_101_0 = stackOut_99_0;
              stackIn_101_1 = stackOut_99_1;
              stackIn_101_2 = stackOut_99_2;
              break L35;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_101_0, stackIn_101_2 + 44 + -80 + 41);
        }
    }

    jh(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
            ((jh) this).field_m = ii.a(8099, param0.length, param0);
            if (((jh) this).field_m != param1) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if (param2.length != 64) {
                    throw new RuntimeException();
                }
                ((jh) this).field_r = nl.a(0, param0.length, -128, param0);
                for (var4_int = 0; var4_int < 64; var4_int++) {
                    if (((jh) this).field_r[var4_int] != param2[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            this.a(param0, (byte) -80);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "jh.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Please wait...";
        field_i = true;
        field_h = 0;
    }
}
