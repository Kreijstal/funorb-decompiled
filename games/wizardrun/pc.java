/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pc {
    private int field_e;
    int[] field_q;
    oe field_h;
    int[] field_t;
    private byte[] field_b;
    static sd field_v;
    int[] field_n;
    private int[][] field_g;
    int[] field_p;
    static String field_r;
    oe[] field_x;
    int[] field_c;
    static String field_o;
    byte[][] field_j;
    private int[] field_u;
    int field_i;
    int field_s;
    int field_f;
    int[][] field_w;
    static bh field_a;
    static long[] field_k;
    static sd field_m;
    static oi field_l;
    static c field_d;

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
        va var17 = null;
        byte[] var21 = null;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
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
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_95_0 = null;
        StringBuilder stackOut_95_1 = null;
        RuntimeException stackOut_97_0 = null;
        StringBuilder stackOut_97_1 = null;
        String stackOut_97_2 = null;
        RuntimeException stackOut_96_0 = null;
        StringBuilder stackOut_96_1 = null;
        String stackOut_96_2 = null;
        var16 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              var17 = new va(dg.a(param0, 31027));
              var4 = var17.f(255);
              if (var4 < 5) {
                break L1;
              } else {
                if (var4 > 7) {
                  break L1;
                } else {
                  L2: {
                    if (var4 >= 6) {
                      ((pc) this).field_f = var17.i(255);
                      break L2;
                    } else {
                      ((pc) this).field_f = 0;
                      break L2;
                    }
                  }
                  L3: {
                    var5 = var17.f(255);
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
                      ((pc) this).field_e = var17.a((byte) -88);
                      break L5;
                    } else {
                      ((pc) this).field_e = var17.j(-14477);
                      break L5;
                    }
                  }
                  L6: {
                    var8 = 0;
                    ((pc) this).field_c = new int[((pc) this).field_e];
                    var9 = -1;
                    if (var4 >= 7) {
                      var10 = 0;
                      L7: while (true) {
                        if (var10 >= ((pc) this).field_e) {
                          break L6;
                        } else {
                          L8: {
                            int dupTemp$4 = var8 + var17.a((byte) -88);
                            var8 = dupTemp$4;
                            ((pc) this).field_c[var10] = dupTemp$4;
                            if (var9 < ((pc) this).field_c[var10]) {
                              var9 = ((pc) this).field_c[var10];
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
                        if (var10 >= ((pc) this).field_e) {
                          break L6;
                        } else {
                          L10: {
                            int dupTemp$5 = var8 + var17.j(-14477);
                            var8 = dupTemp$5;
                            ((pc) this).field_c[var10] = dupTemp$5;
                            if (var9 < ((pc) this).field_c[var10]) {
                              var9 = ((pc) this).field_c[var10];
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
                    ((pc) this).field_s = var9 - -1;
                    ((pc) this).field_p = new int[((pc) this).field_s];
                    if (var7 == 0) {
                      break L11;
                    } else {
                      ((pc) this).field_j = new byte[((pc) this).field_s][];
                      break L11;
                    }
                  }
                  L12: {
                    ((pc) this).field_n = new int[((pc) this).field_s];
                    ((pc) this).field_t = new int[((pc) this).field_s];
                    ((pc) this).field_q = new int[((pc) this).field_s];
                    ((pc) this).field_w = new int[((pc) this).field_s][];
                    if (var6 != 0) {
                      ((pc) this).field_u = new int[((pc) this).field_s];
                      var10 = 0;
                      L13: while (true) {
                        if (((pc) this).field_s <= var10) {
                          var10 = 0;
                          L14: while (true) {
                            if (((pc) this).field_e <= var10) {
                              ((pc) this).field_h = new oe(((pc) this).field_u);
                              break L12;
                            } else {
                              ((pc) this).field_u[((pc) this).field_c[var10]] = var17.i(255);
                              var10++;
                              continue L14;
                            }
                          }
                        } else {
                          ((pc) this).field_u[var10] = -1;
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
                    if (((pc) this).field_e <= var10) {
                      L16: {
                        if (var7 == 0) {
                          break L16;
                        } else {
                          var10 = 0;
                          L17: while (true) {
                            if (var10 >= ((pc) this).field_e) {
                              break L16;
                            } else {
                              var21 = new byte[64];
                              var17.a(true, 64, var21, 0);
                              ((pc) this).field_j[((pc) this).field_c[var10]] = var21;
                              var10++;
                              continue L17;
                            }
                          }
                        }
                      }
                      var10 = 0;
                      L18: while (true) {
                        if (var10 >= ((pc) this).field_e) {
                          L19: {
                            if (7 <= var4) {
                              var10 = 0;
                              L20: while (true) {
                                if (var10 >= ((pc) this).field_e) {
                                  var10 = 0;
                                  L21: while (true) {
                                    if (var10 >= ((pc) this).field_e) {
                                      break L19;
                                    } else {
                                      var11 = ((pc) this).field_c[var10];
                                      var12 = ((pc) this).field_p[var11];
                                      var8 = 0;
                                      var13 = -1;
                                      ((pc) this).field_w[var11] = new int[var12];
                                      var14 = 0;
                                      L22: while (true) {
                                        if (var12 <= var14) {
                                          L23: {
                                            ((pc) this).field_t[var11] = 1 + var13;
                                            if (var12 != var13 + 1) {
                                              break L23;
                                            } else {
                                              ((pc) this).field_w[var11] = null;
                                              break L23;
                                            }
                                          }
                                          var10++;
                                          continue L21;
                                        } else {
                                          L24: {
                                            int dupTemp$6 = var8 + var17.a((byte) -88);
                                            var8 = dupTemp$6;
                                            ((pc) this).field_w[var11][var14] = dupTemp$6;
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
                                  ((pc) this).field_p[((pc) this).field_c[var10]] = var17.a((byte) -88);
                                  var10++;
                                  continue L20;
                                }
                              }
                            } else {
                              var10 = 0;
                              L25: while (true) {
                                if (var10 >= ((pc) this).field_e) {
                                  var10 = 0;
                                  L26: while (true) {
                                    if (var10 >= ((pc) this).field_e) {
                                      break L19;
                                    } else {
                                      var11 = ((pc) this).field_c[var10];
                                      var12 = ((pc) this).field_p[var11];
                                      var8 = 0;
                                      ((pc) this).field_w[var11] = new int[var12];
                                      var13 = -1;
                                      var14 = 0;
                                      L27: while (true) {
                                        if (var14 >= var12) {
                                          L28: {
                                            ((pc) this).field_t[var11] = 1 + var13;
                                            if (var12 == var13 + 1) {
                                              ((pc) this).field_w[var11] = null;
                                              break L28;
                                            } else {
                                              break L28;
                                            }
                                          }
                                          var10++;
                                          continue L26;
                                        } else {
                                          L29: {
                                            int dupTemp$7 = var8 + var17.j(-14477);
                                            var8 = dupTemp$7;
                                            ((pc) this).field_w[var11][var14] = dupTemp$7;
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
                                  ((pc) this).field_p[((pc) this).field_c[var10]] = var17.j(-14477);
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
                              ((pc) this).field_g = new int[1 + var9][];
                              ((pc) this).field_x = new oe[var9 + 1];
                              var10 = 0;
                              L31: while (true) {
                                if (var10 >= ((pc) this).field_e) {
                                  break L30;
                                } else {
                                  var11 = ((pc) this).field_c[var10];
                                  var12 = ((pc) this).field_p[var11];
                                  ((pc) this).field_g[var11] = new int[((pc) this).field_t[var11]];
                                  var13 = 0;
                                  L32: while (true) {
                                    if (((pc) this).field_t[var11] <= var13) {
                                      var13 = 0;
                                      L33: while (true) {
                                        if (var12 <= var13) {
                                          ((pc) this).field_x[var11] = new oe(((pc) this).field_g[var11]);
                                          var10++;
                                          continue L31;
                                        } else {
                                          L34: {
                                            if (null == ((pc) this).field_w[var11]) {
                                              var14 = var13;
                                              break L34;
                                            } else {
                                              var14 = ((pc) this).field_w[var11][var13];
                                              break L34;
                                            }
                                          }
                                          ((pc) this).field_g[var11][var14] = var17.i(255);
                                          var13++;
                                          continue L33;
                                        }
                                      }
                                    } else {
                                      ((pc) this).field_g[var11][var13] = -1;
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
                          ((pc) this).field_n[((pc) this).field_c[var10]] = var17.i(255);
                          var10++;
                          continue L18;
                        }
                      }
                    } else {
                      ((pc) this).field_q[((pc) this).field_c[var10]] = var17.i(255);
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
            stackOut_95_1 = new StringBuilder().append("pc.C(");
            stackIn_97_0 = stackOut_95_0;
            stackIn_97_1 = stackOut_95_1;
            stackIn_96_0 = stackOut_95_0;
            stackIn_96_1 = stackOut_95_1;
            if (param0 == null) {
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
          throw bd.a((Throwable) (Object) stackIn_98_0, stackIn_98_2 + 44 + 0 + 41);
        }
    }

    public static void b(int param0) {
        if (param0 != 1) {
            Object var2 = null;
            o[] discarded$0 = pc.a((byte) -119, (String) null, (kl) null, (String) null);
        }
        field_k = null;
        field_v = null;
        field_r = null;
        field_a = null;
        field_o = null;
        field_l = null;
        field_m = null;
        field_d = null;
    }

    final static void a() {
        int discarded$0 = 1;
        rj.a((String) null, "");
    }

    pc(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
            ((pc) this).field_i = bi.a(param0, 10510, param0.length);
            if (((pc) this).field_i != param1) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if (param2.length != 64) {
                    throw new RuntimeException();
                }
                ((pc) this).field_b = id.a(param0, 0, param0.length, 0);
                for (var4_int = 0; var4_int < 64; var4_int++) {
                    if (((pc) this).field_b[var4_int] != param2[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            int discarded$0 = 0;
            this.a(param0);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "pc.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final static o[] a(byte param0, String param1, kl param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        o[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        o[] stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              var4_int = param2.b(-1, param1);
              if (param0 >= 99) {
                break L1;
              } else {
                pc.b(61);
                break L1;
              }
            }
            var5 = param2.a(var4_int, param3, -11986);
            stackOut_2_0 = r.a(var5, param2, 13469, var4_int);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("pc.B(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_3_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Updates will sent to the email address you've given";
        field_v = new sd(3);
        field_a = new bh(9, 0, 4, 1);
        field_k = new long[32];
        field_m = new sd(0);
        field_l = new oi();
    }
}
