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
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        int[] array$2 = null;
        int dupTemp$3 = 0;
        int[] dupTemp$4 = null;
        int[] array$5 = null;
        int dupTemp$6 = 0;
        int[] dupTemp$7 = null;
        int[] array$8 = null;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_94_0 = null;
        StringBuilder stackIn_94_1 = null;
        RuntimeException stackIn_95_0 = null;
        StringBuilder stackIn_95_1 = null;
        String stackIn_95_2 = null;
        RuntimeException decompiledCaughtException = null;
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
                      stackIn_11_0 = 0;
                      break L3;
                    } else {
                      stackIn_11_0 = 1;
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
                      stackIn_17_0 = 0;
                      break L5;
                    } else {
                      stackIn_17_0 = 1;
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
                          dupTemp$0 = var8 + var18.c((byte) 66);
                          var8 = dupTemp$0;
                          this.field_c[var11] = dupTemp$0;
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
                            dupTemp$1 = var8 + var18.d(true);
                            var8 = dupTemp$1;
                            this.field_c[var11] = dupTemp$1;
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
                                      array$2 = new int[var13];
                                      this.field_r[var12] = array$2;
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
                                          dupTemp$3 = var8 + var18.d(true);
                                          var8 = dupTemp$3;
                                          dupTemp$4 = this.field_r[var12];
                                          dupTemp$4[var15] = dupTemp$3;
                                          var16 = dupTemp$3;
                                          if ((var14 ^ -1) > (var16 ^ -1)) {
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
                                      array$5 = new int[var13];
                                      this.field_r[var12] = array$5;
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
                                            dupTemp$6 = var8 + var18.c((byte) -84);
                                            var8 = dupTemp$6;
                                            dupTemp$7 = this.field_r[var12];
                                            dupTemp$7[var15] = dupTemp$6;
                                            var16 = dupTemp$6;
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
                                  array$8 = new int[this.field_i[var12]];
                                  this.field_g[var12] = array$8;
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
            stackIn_94_0 = (RuntimeException) (var3);

            stackIn_94_1 = new StringBuilder().append("sj.B(");

            if (param0 == null) {
              stackIn_95_0 = (RuntimeException) ((Object) stackIn_94_0);
              stackIn_95_1 = (StringBuilder) ((Object) stackIn_94_1);
              stackIn_95_2 = "null";
              break L33;
            } else {
              stackIn_95_0 = (RuntimeException) ((Object) stackIn_94_0);
              stackIn_95_1 = (StringBuilder) ((Object) stackIn_94_1);
              stackIn_95_2 = "{...}";
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
        try {
            param0.a(param2, param3);
            if (param1) {
                field_l = (eh) null;
            }
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "sj.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
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
