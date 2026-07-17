/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj {
    int[] field_i;
    static eh field_l;
    int[] field_n;
    int[] field_m;
    int[][] field_r;
    static mg field_j;
    int[] field_c;
    private int[] field_t;
    private byte[] field_s;
    int field_q;
    static String field_e;
    byte[][] field_p;
    int[] field_f;
    private int[][] field_g;
    md field_h;
    md[] field_u;
    int field_a;
    static String field_k;
    static String field_d;
    static float field_o;
    private int field_b;
    int field_v;

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
        int var17 = 0;
        jc var18 = null;
        byte[] var22 = null;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_93_0 = null;
        StringBuilder stackIn_93_1 = null;
        RuntimeException stackIn_94_0 = null;
        StringBuilder stackIn_94_1 = null;
        RuntimeException stackIn_95_0 = null;
        StringBuilder stackIn_95_1 = null;
        String stackIn_95_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_92_0 = null;
        StringBuilder stackOut_92_1 = null;
        RuntimeException stackOut_94_0 = null;
        StringBuilder stackOut_94_1 = null;
        String stackOut_94_2 = null;
        RuntimeException stackOut_93_0 = null;
        StringBuilder stackOut_93_1 = null;
        String stackOut_93_2 = null;
        var17 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var18 = new jc(mc.a(param0, 118));
              var4 = var18.g(11132);
              if (var4 < 5) {
                break L1;
              } else {
                if (var4 > 7) {
                  break L1;
                } else {
                  L2: {
                    if (var4 < 6) {
                      ((sj) this).field_a = 0;
                      break L2;
                    } else {
                      ((sj) this).field_a = var18.d((byte) 109);
                      break L2;
                    }
                  }
                  L3: {
                    var5 = var18.g(11132);
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
                    if (7 <= var4) {
                      ((sj) this).field_b = var18.d(true);
                      break L4;
                    } else {
                      ((sj) this).field_b = var18.c((byte) 106);
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
                    var10 = 0;
                    var9 = -1;
                    ((sj) this).field_c = new int[((sj) this).field_b];
                    if (var4 < 7) {
                      var11 = 0;
                      L7: while (true) {
                        if (((sj) this).field_b <= var11) {
                          break L6;
                        } else {
                          L8: {
                            int dupTemp$4 = var8 + var18.c((byte) 66);
                            var8 = dupTemp$4;
                            ((sj) this).field_c[var11] = dupTemp$4;
                            if (((sj) this).field_c[var11] <= var9) {
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          var11++;
                          continue L7;
                        }
                      }
                    } else {
                      var11 = 0;
                      L9: while (true) {
                        if (var11 >= ((sj) this).field_b) {
                          break L6;
                        } else {
                          L10: {
                            int dupTemp$5 = var8 + var18.d(true);
                            var8 = dupTemp$5;
                            ((sj) this).field_c[var11] = dupTemp$5;
                            if (((sj) this).field_c[var11] > var9) {
                              var9 = ((sj) this).field_c[var11];
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          var11++;
                          continue L9;
                        }
                      }
                    }
                  }
                  L11: {
                    ((sj) this).field_v = 1 + var9;
                    ((sj) this).field_r = new int[((sj) this).field_v][];
                    ((sj) this).field_i = new int[((sj) this).field_v];
                    if (var7 == 0) {
                      break L11;
                    } else {
                      ((sj) this).field_p = new byte[((sj) this).field_v][];
                      break L11;
                    }
                  }
                  L12: {
                    ((sj) this).field_m = new int[((sj) this).field_v];
                    ((sj) this).field_n = new int[((sj) this).field_v];
                    ((sj) this).field_f = new int[((sj) this).field_v];
                    if (var6 == 0) {
                      break L12;
                    } else {
                      ((sj) this).field_t = new int[((sj) this).field_v];
                      var11 = 0;
                      L13: while (true) {
                        if (((sj) this).field_v <= var11) {
                          var11 = 0;
                          L14: while (true) {
                            if (var11 >= ((sj) this).field_b) {
                              ((sj) this).field_h = new md(((sj) this).field_t);
                              break L12;
                            } else {
                              ((sj) this).field_t[((sj) this).field_c[var11]] = var18.d((byte) 119);
                              var11++;
                              continue L14;
                            }
                          }
                        } else {
                          ((sj) this).field_t[var11] = -1;
                          var11++;
                          continue L13;
                        }
                      }
                    }
                  }
                  var11 = 0;
                  L15: while (true) {
                    if (((sj) this).field_b <= var11) {
                      L16: {
                        if (var7 == 0) {
                          break L16;
                        } else {
                          var11 = 0;
                          L17: while (true) {
                            if (var11 >= ((sj) this).field_b) {
                              break L16;
                            } else {
                              var22 = new byte[64];
                              var18.a(0, 64, true, var22);
                              ((sj) this).field_p[((sj) this).field_c[var11]] = var22;
                              var11++;
                              continue L17;
                            }
                          }
                        }
                      }
                      var11 = 0;
                      L18: while (true) {
                        if (var11 >= ((sj) this).field_b) {
                          L19: {
                            if (var4 >= 7) {
                              var11 = 0;
                              L20: while (true) {
                                if (((sj) this).field_b <= var11) {
                                  var11 = 0;
                                  L21: while (true) {
                                    if (var11 >= ((sj) this).field_b) {
                                      break L19;
                                    } else {
                                      var12 = ((sj) this).field_c[var11];
                                      var13 = ((sj) this).field_n[var12];
                                      var8 = 0;
                                      var14 = -1;
                                      ((sj) this).field_r[var12] = new int[var13];
                                      var15 = 0;
                                      L22: while (true) {
                                        if (var13 <= var15) {
                                          L23: {
                                            ((sj) this).field_i[var12] = 1 + var14;
                                            if (1 + var14 != var13) {
                                              break L23;
                                            } else {
                                              ((sj) this).field_r[var12] = null;
                                              break L23;
                                            }
                                          }
                                          var11++;
                                          continue L21;
                                        } else {
                                          L24: {
                                            int dupTemp$6 = var8 + var18.d(true);
                                            var8 = dupTemp$6;
                                            ((sj) this).field_r[var12][var15] = dupTemp$6;
                                            var16 = dupTemp$6;
                                            if (var14 >= var16) {
                                              break L24;
                                            } else {
                                              break L24;
                                            }
                                          }
                                          var15++;
                                          continue L22;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  ((sj) this).field_n[((sj) this).field_c[var11]] = var18.d(true);
                                  var11++;
                                  continue L20;
                                }
                              }
                            } else {
                              var11 = 0;
                              L25: while (true) {
                                if (var11 >= ((sj) this).field_b) {
                                  var11 = 0;
                                  L26: while (true) {
                                    if (var11 >= ((sj) this).field_b) {
                                      break L19;
                                    } else {
                                      var12 = ((sj) this).field_c[var11];
                                      var13 = ((sj) this).field_n[var12];
                                      var8 = 0;
                                      ((sj) this).field_r[var12] = new int[var13];
                                      var14 = -1;
                                      var15 = 0;
                                      L27: while (true) {
                                        if (var13 <= var15) {
                                          L28: {
                                            ((sj) this).field_i[var12] = 1 + var14;
                                            if (1 + var14 != var13) {
                                              break L28;
                                            } else {
                                              ((sj) this).field_r[var12] = null;
                                              break L28;
                                            }
                                          }
                                          var11++;
                                          continue L26;
                                        } else {
                                          L29: {
                                            int dupTemp$7 = var8 + var18.c((byte) -84);
                                            var8 = dupTemp$7;
                                            ((sj) this).field_r[var12][var15] = dupTemp$7;
                                            var16 = dupTemp$7;
                                            if (var16 > var14) {
                                              var14 = var16;
                                              break L29;
                                            } else {
                                              break L29;
                                            }
                                          }
                                          var15++;
                                          continue L27;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  ((sj) this).field_n[((sj) this).field_c[var11]] = var18.c((byte) 42);
                                  var11++;
                                  continue L25;
                                }
                              }
                            }
                          }
                          L30: {
                            if (var6 != 0) {
                              ((sj) this).field_g = new int[1 + var9][];
                              ((sj) this).field_u = new md[var9 - -1];
                              var11 = 0;
                              L31: while (true) {
                                if (var11 >= ((sj) this).field_b) {
                                  break L30;
                                } else {
                                  var12 = ((sj) this).field_c[var11];
                                  var13 = ((sj) this).field_n[var12];
                                  ((sj) this).field_g[var12] = new int[((sj) this).field_i[var12]];
                                  var14 = 0;
                                  L32: while (true) {
                                    if (var14 >= ((sj) this).field_i[var12]) {
                                      var14 = 0;
                                      L33: while (true) {
                                        if (var14 >= var13) {
                                          ((sj) this).field_u[var12] = new md(((sj) this).field_g[var12]);
                                          var11++;
                                          continue L31;
                                        } else {
                                          L34: {
                                            if (((sj) this).field_r[var12] == null) {
                                              var15 = var14;
                                              break L34;
                                            } else {
                                              var15 = ((sj) this).field_r[var12][var14];
                                              break L34;
                                            }
                                          }
                                          ((sj) this).field_g[var12][var15] = var18.d((byte) 119);
                                          var14++;
                                          continue L33;
                                        }
                                      }
                                    } else {
                                      ((sj) this).field_g[var12][var14] = -1;
                                      var14++;
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
                          ((sj) this).field_f[((sj) this).field_c[var11]] = var18.d((byte) 104);
                          var11++;
                          continue L18;
                        }
                      }
                    } else {
                      ((sj) this).field_m[((sj) this).field_c[var11]] = var18.d((byte) 95);
                      var11++;
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
            stackOut_92_0 = (RuntimeException) var3;
            stackOut_92_1 = new StringBuilder().append("sj.B(");
            stackIn_94_0 = stackOut_92_0;
            stackIn_94_1 = stackOut_92_1;
            stackIn_93_0 = stackOut_92_0;
            stackIn_93_1 = stackOut_92_1;
            if (param0 == null) {
              stackOut_94_0 = (RuntimeException) (Object) stackIn_94_0;
              stackOut_94_1 = (StringBuilder) (Object) stackIn_94_1;
              stackOut_94_2 = "null";
              stackIn_95_0 = stackOut_94_0;
              stackIn_95_1 = stackOut_94_1;
              stackIn_95_2 = stackOut_94_2;
              break L35;
            } else {
              stackOut_93_0 = (RuntimeException) (Object) stackIn_93_0;
              stackOut_93_1 = (StringBuilder) (Object) stackIn_93_1;
              stackOut_93_2 = "{...}";
              stackIn_95_0 = stackOut_93_0;
              stackIn_95_1 = stackOut_93_1;
              stackIn_95_2 = stackOut_93_2;
              break L35;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_95_0, stackIn_95_2 + 44 + 117 + 41);
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        try {
            af.field_i = true;
            var2 = "tuhstatbut";
            var3 = "rvnadlm";
            var4 = -1L;
            sb.a(var2, var3, param0, var4, (byte) -2);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "sj.A(" + (param0 != null ? "{...}" : "null") + 44 + 20298 + 41);
        }
    }

    final static void a(il param0, boolean param1, int[] param2, int[] param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              param0.a(param2, param3);
              if (!param1) {
                break L1;
              } else {
                field_l = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("sj.C(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(44).append(param1).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          L4: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param3 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
    }

    public static void a(byte param0) {
        field_j = null;
        field_d = null;
        field_k = null;
        field_l = null;
        field_e = null;
    }

    sj(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
            ((sj) this).field_q = na.a(false, param0.length, param0);
            if (((sj) this).field_q != param1) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if (64 != param2.length) {
                    throw new RuntimeException();
                }
                ((sj) this).field_s = ug.a(param0, param0.length, 0, false);
                for (var4_int = 0; var4_int < 64; var4_int++) {
                    if (param2[var4_int] != ((sj) this).field_s[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            this.a(param0, 117);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "sj.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
        field_d = "Leave game";
        field_e = "Show chat (<%0> unread messages)";
    }
}
