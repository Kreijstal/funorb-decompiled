/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class f {
    int[] field_d;
    byte[][] field_h;
    static ed field_o;
    private int field_c;
    private int[][] field_r;
    int[] field_i;
    int[] field_l;
    int field_k;
    int[] field_e;
    static int field_t;
    private int[] field_g;
    jn field_p;
    int field_n;
    static vj field_m;
    int field_b;
    static int field_j;
    jn[] field_s;
    int[] field_q;
    int[][] field_a;
    private byte[] field_f;

    public static void a(byte param0) {
        if (param0 != 18) {
            field_m = (vj) null;
        }
        field_o = null;
        field_m = null;
    }

    private final void a(byte param0, byte[] param1) {
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
        n var18 = null;
        byte[] var22 = null;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
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
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_98_0 = null;
        StringBuilder stackOut_98_1 = null;
        RuntimeException stackOut_100_0 = null;
        StringBuilder stackOut_100_1 = null;
        String stackOut_100_2 = null;
        RuntimeException stackOut_99_0 = null;
        StringBuilder stackOut_99_1 = null;
        String stackOut_99_2 = null;
        var17 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              var18 = new n(s.a((byte) -26, param1));
              var4 = var18.e(0);
              if (5 > var4) {
                break L1;
              } else {
                if (var4 <= 7) {
                  L2: {
                    if (var4 < 6) {
                      this.field_n = 0;
                      break L2;
                    } else {
                      this.field_n = var18.g(-5053);
                      break L2;
                    }
                  }
                  L3: {
                    var5 = var18.e(0);
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
                    if (-8 >= (var4 ^ -1)) {
                      this.field_c = var18.j(2147483647);
                      break L4;
                    } else {
                      this.field_c = var18.f(1952);
                      break L4;
                    }
                  }
                  L5: {
                    if (0 == (2 & var5)) {
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
                    var9 = -1;
                    this.field_d = new int[this.field_c];
                    if (var4 < 7) {
                      var10 = 0;
                      L7: while (true) {
                        if (this.field_c <= var10) {
                          break L6;
                        } else {
                          L8: {
                            dupTemp$7 = var8 + var18.f(1952);
                            var8 = dupTemp$7;
                            this.field_d[var10] = dupTemp$7;
                            if (this.field_d[var10] > var9) {
                              var9 = this.field_d[var10];
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
                        if (var10 >= this.field_c) {
                          break L6;
                        } else {
                          dupTemp$8 = var8 + var18.j(2147483647);
                          var8 = dupTemp$8;
                          this.field_d[var10] = dupTemp$8;
                          if (var9 < this.field_d[var10]) {
                            var9 = this.field_d[var10];
                            var10++;
                            continue L9;
                          } else {
                            var10++;
                            continue L9;
                          }
                        }
                      }
                    }
                  }
                  L10: {
                    this.field_k = var9 - -1;
                    if (var7 == 0) {
                      break L10;
                    } else {
                      this.field_h = new byte[this.field_k][];
                      break L10;
                    }
                  }
                  L11: {
                    var10 = 115 % ((60 - param0) / 44);
                    this.field_i = new int[this.field_k];
                    this.field_a = new int[this.field_k][];
                    this.field_e = new int[this.field_k];
                    this.field_l = new int[this.field_k];
                    this.field_q = new int[this.field_k];
                    if (var6 != 0) {
                      this.field_g = new int[this.field_k];
                      var11 = 0;
                      L12: while (true) {
                        if (this.field_k <= var11) {
                          var11 = 0;
                          L13: while (true) {
                            if (var11 >= this.field_c) {
                              this.field_p = new jn(this.field_g);
                              break L11;
                            } else {
                              this.field_g[this.field_d[var11]] = var18.g(-5053);
                              var11++;
                              continue L13;
                            }
                          }
                        } else {
                          this.field_g[var11] = -1;
                          var11++;
                          continue L12;
                        }
                      }
                    } else {
                      break L11;
                    }
                  }
                  var11 = 0;
                  L14: while (true) {
                    if (this.field_c <= var11) {
                      L15: {
                        if (var7 != 0) {
                          var11 = 0;
                          L16: while (true) {
                            if (var11 >= this.field_c) {
                              var11 = 0;
                              L17: while (true) {
                                if (var11 >= this.field_c) {
                                  break L15;
                                } else {
                                  this.field_q[this.field_d[var11]] = var18.g(-5053);
                                  var11++;
                                  continue L17;
                                }
                              }
                            } else {
                              var22 = new byte[64];
                              var18.a(var22, (byte) -96, 0, 64);
                              this.field_h[this.field_d[var11]] = var22;
                              var11++;
                              continue L16;
                            }
                          }
                        } else {
                          var11 = 0;
                          L18: while (true) {
                            if (var11 >= this.field_c) {
                              break L15;
                            } else {
                              this.field_q[this.field_d[var11]] = var18.g(-5053);
                              var11++;
                              continue L18;
                            }
                          }
                        }
                      }
                      L19: {
                        if (var4 < 7) {
                          var11 = 0;
                          L20: while (true) {
                            if (var11 >= this.field_c) {
                              var11 = 0;
                              L21: while (true) {
                                if (this.field_c <= var11) {
                                  break L19;
                                } else {
                                  var12 = this.field_d[var11];
                                  var8 = 0;
                                  var13 = this.field_i[var12];
                                  var14 = -1;
                                  array$9 = new int[var13];
                                  this.field_a[var12] = array$9;
                                  var15 = 0;
                                  L22: while (true) {
                                    if (var15 >= var13) {
                                      L23: {
                                        this.field_e[var12] = 1 + var14;
                                        if (var14 - -1 != var13) {
                                          break L23;
                                        } else {
                                          this.field_a[var12] = null;
                                          break L23;
                                        }
                                      }
                                      var11++;
                                      continue L21;
                                    } else {
                                      L24: {
                                        dupTemp$10 = var8 + var18.f(1952);
                                        var8 = dupTemp$10;
                                        this.field_a[var12][var15] = dupTemp$10;
                                        var16 = dupTemp$10;
                                        if (var14 < var16) {
                                          var14 = var16;
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
                              this.field_i[this.field_d[var11]] = var18.f(1952);
                              var11++;
                              continue L20;
                            }
                          }
                        } else {
                          var11 = 0;
                          L25: while (true) {
                            if (var11 >= this.field_c) {
                              var11 = 0;
                              L26: while (true) {
                                if (this.field_c <= var11) {
                                  break L19;
                                } else {
                                  var12 = this.field_d[var11];
                                  var8 = 0;
                                  var13 = this.field_i[var12];
                                  var14 = -1;
                                  array$11 = new int[var13];
                                  this.field_a[var12] = array$11;
                                  var15 = 0;
                                  L27: while (true) {
                                    if (var15 >= var13) {
                                      L28: {
                                        this.field_e[var12] = 1 + var14;
                                        if (1 + var14 == var13) {
                                          this.field_a[var12] = null;
                                          break L28;
                                        } else {
                                          break L28;
                                        }
                                      }
                                      var11++;
                                      continue L26;
                                    } else {
                                      L29: {
                                        dupTemp$12 = var8 + var18.j(2147483647);
                                        var8 = dupTemp$12;
                                        this.field_a[var12][var15] = dupTemp$12;
                                        var16 = dupTemp$12;
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
                              this.field_i[this.field_d[var11]] = var18.j(2147483647);
                              var11++;
                              continue L25;
                            }
                          }
                        }
                      }
                      L30: {
                        if (var6 != 0) {
                          this.field_r = new int[1 + var9][];
                          this.field_s = new jn[1 + var9];
                          var11 = 0;
                          L31: while (true) {
                            if (var11 >= this.field_c) {
                              break L30;
                            } else {
                              var12 = this.field_d[var11];
                              var13 = this.field_i[var12];
                              array$13 = new int[this.field_e[var12]];
                              this.field_r[var12] = array$13;
                              var14 = 0;
                              L32: while (true) {
                                if (this.field_e[var12] <= var14) {
                                  var14 = 0;
                                  L33: while (true) {
                                    if (var13 <= var14) {
                                      this.field_s[var12] = new jn(this.field_r[var12]);
                                      var11++;
                                      continue L31;
                                    } else {
                                      L34: {
                                        if (this.field_a[var12] != null) {
                                          var15 = this.field_a[var12][var14];
                                          break L34;
                                        } else {
                                          var15 = var14;
                                          break L34;
                                        }
                                      }
                                      this.field_r[var12][var15] = var18.g(-5053);
                                      var14++;
                                      continue L33;
                                    }
                                  }
                                } else {
                                  this.field_r[var12][var14] = -1;
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
                      this.field_l[this.field_d[var11]] = var18.g(-5053);
                      var11++;
                      continue L14;
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
            stackOut_98_0 = (RuntimeException) (var3);
            stackOut_98_1 = new StringBuilder().append("f.B(").append(param0).append(',');
            stackIn_100_0 = stackOut_98_0;
            stackIn_100_1 = stackOut_98_1;
            stackIn_99_0 = stackOut_98_0;
            stackIn_99_1 = stackOut_98_1;
            if (param1 == null) {
              stackOut_100_0 = (RuntimeException) ((Object) stackIn_100_0);
              stackOut_100_1 = (StringBuilder) ((Object) stackIn_100_1);
              stackOut_100_2 = "null";
              stackIn_101_0 = stackOut_100_0;
              stackIn_101_1 = stackOut_100_1;
              stackIn_101_2 = stackOut_100_2;
              break L35;
            } else {
              stackOut_99_0 = (RuntimeException) ((Object) stackIn_99_0);
              stackOut_99_1 = (StringBuilder) ((Object) stackIn_99_1);
              stackOut_99_2 = "{...}";
              stackIn_101_0 = stackOut_99_0;
              stackIn_101_1 = stackOut_99_1;
              stackIn_101_2 = stackOut_99_2;
              break L35;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_101_0), stackIn_101_2 + ')');
        }
    }

    f(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
            this.field_b = ji.a(255, param0.length, param0);
            if (param1 != this.field_b) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if (param2.length != 64) {
                    throw new RuntimeException();
                }
                this.field_f = vn.a(param0, 0, param0.length, 0);
                for (var4_int = 0; var4_int < 64; var4_int++) {
                    if (param2[var4_int] != this.field_f[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            this.a((byte) -23, param0);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "f.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_t = -1;
        field_m = null;
    }
}
