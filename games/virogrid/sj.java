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
        int dupTemp$7 = 0;
        int dupTemp$8 = 0;
        int[] array$9 = null;
        int dupTemp$10 = 0;
        int[] array$11 = null;
        int dupTemp$12 = 0;
        int[] array$13 = null;
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
              if (-6 < (var4 ^ -1)) {
                break L1;
              } else {
                if (var4 > 7) {
                  break L1;
                } else {
                  L2: {
                    if ((var4 ^ -1) > -7) {
                      this.field_a = 0;
                      break L2;
                    } else {
                      this.field_a = var18.d((byte) 109);
                      break L2;
                    }
                  }
                  L3: {
                    var5 = var18.g(11132);
                    if (-1 == (var5 & 1 ^ -1)) {
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
                      this.field_b = var18.d(true);
                      break L4;
                    } else {
                      this.field_b = var18.c((byte) 106);
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
                    var10 = -92 % ((-9 - param1) / 56);
                    var9 = -1;
                    this.field_c = new int[this.field_b];
                    if ((var4 ^ -1) > -8) {
                      var11 = 0;
                      L7: while (true) {
                        if (this.field_b <= var11) {
                          break L6;
                        } else {
                          dupTemp$7 = var8 + var18.c((byte) 66);
                          var8 = dupTemp$7;
                          this.field_c[var11] = dupTemp$7;
                          if (this.field_c[var11] > var9) {
                            var9 = this.field_c[var11];
                            var11++;
                            continue L7;
                          } else {
                            var11++;
                            continue L7;
                          }
                        }
                      }
                    } else {
                      var11 = 0;
                      L8: while (true) {
                        if (var11 >= this.field_b) {
                          break L6;
                        } else {
                          L9: {
                            dupTemp$8 = var8 + var18.d(true);
                            var8 = dupTemp$8;
                            this.field_c[var11] = dupTemp$8;
                            if (this.field_c[var11] > var9) {
                              var9 = this.field_c[var11];
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          var11++;
                          continue L8;
                        }
                      }
                    }
                  }
                  L10: {
                    this.field_v = 1 + var9;
                    this.field_r = new int[this.field_v][];
                    this.field_i = new int[this.field_v];
                    if (var7 == 0) {
                      break L10;
                    } else {
                      this.field_p = new byte[this.field_v][];
                      break L10;
                    }
                  }
                  L11: {
                    this.field_m = new int[this.field_v];
                    this.field_n = new int[this.field_v];
                    this.field_f = new int[this.field_v];
                    if (var6 == 0) {
                      break L11;
                    } else {
                      this.field_t = new int[this.field_v];
                      var11 = 0;
                      L12: while (true) {
                        if (this.field_v <= var11) {
                          var11 = 0;
                          L13: while (true) {
                            if (var11 >= this.field_b) {
                              this.field_h = new md(this.field_t);
                              break L11;
                            } else {
                              this.field_t[this.field_c[var11]] = var18.d((byte) 119);
                              var11++;
                              continue L13;
                            }
                          }
                        } else {
                          this.field_t[var11] = -1;
                          var11++;
                          continue L12;
                        }
                      }
                    }
                  }
                  var11 = 0;
                  L14: while (true) {
                    if (this.field_b <= var11) {
                      L15: {
                        if (var7 == 0) {
                          break L15;
                        } else {
                          var11 = 0;
                          L16: while (true) {
                            if (var11 >= this.field_b) {
                              break L15;
                            } else {
                              var22 = new byte[64];
                              var18.a(0, 64, true, var22);
                              this.field_p[this.field_c[var11]] = var22;
                              var11++;
                              continue L16;
                            }
                          }
                        }
                      }
                      var11 = 0;
                      L17: while (true) {
                        if (var11 >= this.field_b) {
                          L18: {
                            if ((var4 ^ -1) <= -8) {
                              var11 = 0;
                              L19: while (true) {
                                if (this.field_b <= var11) {
                                  var11 = 0;
                                  L20: while (true) {
                                    if (var11 >= this.field_b) {
                                      break L18;
                                    } else {
                                      var12 = this.field_c[var11];
                                      var13 = this.field_n[var12];
                                      var8 = 0;
                                      var14 = -1;
                                      array$9 = new int[var13];
                                      this.field_r[var12] = array$9;
                                      var15 = 0;
                                      L21: while (true) {
                                        if (var13 <= var15) {
                                          L22: {
                                            this.field_i[var12] = 1 + var14;
                                            if (1 + var14 != var13) {
                                              break L22;
                                            } else {
                                              this.field_r[var12] = null;
                                              break L22;
                                            }
                                          }
                                          var11++;
                                          continue L20;
                                        } else {
                                          dupTemp$10 = var8 + var18.d(true);
                                          var8 = dupTemp$10;
                                          this.field_r[var12][var15] = dupTemp$10;
                                          var16 = dupTemp$10;
                                          if (var14 < var16) {
                                            var14 = var16;
                                            var15++;
                                            continue L21;
                                          } else {
                                            var15++;
                                            continue L21;
                                          }
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  this.field_n[this.field_c[var11]] = var18.d(true);
                                  var11++;
                                  continue L19;
                                }
                              }
                            } else {
                              var11 = 0;
                              L23: while (true) {
                                if (var11 >= this.field_b) {
                                  var11 = 0;
                                  L24: while (true) {
                                    if (var11 >= this.field_b) {
                                      break L18;
                                    } else {
                                      var12 = this.field_c[var11];
                                      var13 = this.field_n[var12];
                                      var8 = 0;
                                      array$11 = new int[var13];
                                      this.field_r[var12] = array$11;
                                      var14 = -1;
                                      var15 = 0;
                                      L25: while (true) {
                                        if (var13 <= var15) {
                                          L26: {
                                            this.field_i[var12] = 1 + var14;
                                            if (1 + var14 != var13) {
                                              break L26;
                                            } else {
                                              this.field_r[var12] = null;
                                              break L26;
                                            }
                                          }
                                          var11++;
                                          continue L24;
                                        } else {
                                          L27: {
                                            dupTemp$12 = var8 + var18.c((byte) -84);
                                            var8 = dupTemp$12;
                                            this.field_r[var12][var15] = dupTemp$12;
                                            var16 = dupTemp$12;
                                            if (var16 > var14) {
                                              var14 = var16;
                                              break L27;
                                            } else {
                                              break L27;
                                            }
                                          }
                                          var15++;
                                          continue L25;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  this.field_n[this.field_c[var11]] = var18.c((byte) 42);
                                  var11++;
                                  continue L23;
                                }
                              }
                            }
                          }
                          L28: {
                            if (var6 != 0) {
                              this.field_g = new int[1 + var9][];
                              this.field_u = new md[var9 - -1];
                              var11 = 0;
                              L29: while (true) {
                                if (var11 >= this.field_b) {
                                  break L28;
                                } else {
                                  var12 = this.field_c[var11];
                                  var13 = this.field_n[var12];
                                  array$13 = new int[this.field_i[var12]];
                                  this.field_g[var12] = array$13;
                                  var14 = 0;
                                  L30: while (true) {
                                    if (var14 >= this.field_i[var12]) {
                                      var14 = 0;
                                      L31: while (true) {
                                        if (var14 >= var13) {
                                          this.field_u[var12] = new md(this.field_g[var12]);
                                          var11++;
                                          continue L29;
                                        } else {
                                          L32: {
                                            if (this.field_r[var12] == null) {
                                              var15 = var14;
                                              break L32;
                                            } else {
                                              var15 = this.field_r[var12][var14];
                                              break L32;
                                            }
                                          }
                                          this.field_g[var12][var15] = var18.d((byte) 119);
                                          var14++;
                                          continue L31;
                                        }
                                      }
                                    } else {
                                      this.field_g[var12][var14] = -1;
                                      var14++;
                                      continue L30;
                                    }
                                  }
                                }
                              }
                            } else {
                              break L28;
                            }
                          }
                          break L0;
                        } else {
                          this.field_f[this.field_c[var11]] = var18.d((byte) 104);
                          var11++;
                          continue L17;
                        }
                      }
                    } else {
                      this.field_m[this.field_c[var11]] = var18.d((byte) 95);
                      var11++;
                      continue L14;
                    }
                  }
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L33: {
            var3 = decompiledCaughtException;
            stackOut_92_0 = (RuntimeException) (var3);
            stackOut_92_1 = new StringBuilder().append("sj.B(");
            stackIn_94_0 = stackOut_92_0;
            stackIn_94_1 = stackOut_92_1;
            stackIn_93_0 = stackOut_92_0;
            stackIn_93_1 = stackOut_92_1;
            if (param0 == null) {
              stackOut_94_0 = (RuntimeException) ((Object) stackIn_94_0);
              stackOut_94_1 = (StringBuilder) ((Object) stackIn_94_1);
              stackOut_94_2 = "null";
              stackIn_95_0 = stackOut_94_0;
              stackIn_95_1 = stackOut_94_1;
              stackIn_95_2 = stackOut_94_2;
              break L33;
            } else {
              stackOut_93_0 = (RuntimeException) ((Object) stackIn_93_0);
              stackOut_93_1 = (StringBuilder) ((Object) stackIn_93_1);
              stackOut_93_2 = "{...}";
              stackIn_95_0 = stackOut_93_0;
              stackIn_95_1 = stackOut_93_1;
              stackIn_95_2 = stackOut_93_2;
              break L33;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_95_0), stackIn_95_2 + ',' + param1 + ')');
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        try {
            af.field_i = true;
            var2 = "tuhstatbut";
            if (param1 != 20298) {
                int[] var6 = (int[]) null;
                sj.a((il) null, true, (int[]) null, (int[]) null);
            }
            var3 = "rvnadlm";
            var4 = -1L;
            sb.a(var2, var3, param0, var4, (byte) -2);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "sj.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
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
                field_l = (eh) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("sj.C(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          L4: {
            stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param3 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    public static void a(byte param0) {
        if (param0 <= 118) {
            return;
        }
        field_j = null;
        field_d = null;
        field_k = null;
        field_l = null;
        field_e = null;
    }

    sj(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
            this.field_q = na.a(false, param0.length, param0);
            if (this.field_q != param1) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if (64 != param2.length) {
                    throw new RuntimeException();
                }
                this.field_s = ug.a(param0, param0.length, 0, false);
                for (var4_int = 0; var4_int < 64; var4_int++) {
                    if (param2[var4_int] != this.field_s[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            this.a(param0, 117);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "sj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_k = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
        field_d = "Leave game";
        field_e = "Show chat (<%0> unread messages)";
    }
}
