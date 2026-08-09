/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf {
    int[] field_e;
    int[] field_y;
    static ka[] field_a;
    int[][] field_A;
    static double field_i;
    static cd field_h;
    private int[] field_c;
    int field_k;
    int[] field_g;
    int field_b;
    int field_r;
    static int[] field_l;
    private int field_m;
    int[] field_d;
    private int[][] field_v;
    static ka[] field_j;
    static int field_o;
    wi field_p;
    wi[] field_s;
    static h field_f;
    static rj field_w;
    int[] field_t;
    static String[] field_z;
    static int[] field_u;
    byte[][] field_n;
    private byte[] field_q;
    static eg field_x;

    public static void a(byte param0) {
        field_u = null;
        field_j = null;
        field_w = null;
        field_a = null;
        field_f = null;
        field_z = null;
        field_h = null;
        field_l = null;
        field_x = null;
        if (param0 < 46) {
            field_x = (eg) null;
        }
    }

    private final void a(byte param0, byte[] param1) {
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
        int stackIn_14_0 = 0;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        String stackIn_102_2 = null;
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
        uf var18 = null;
        byte[] var22 = null;
        var17 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var18 = new uf(pg.a(-1048576, param1));
              var4 = var18.j(-101);
              if (5 > var4) {
                break L1;
              } else {
                if (7 >= var4) {
                  L2: {
                    if (var4 < 6) {
                      this.field_b = 0;
                      break L2;
                    } else {
                      this.field_b = var18.i(40);
                      break L2;
                    }
                  }
                  L3: {
                    var5 = var18.j(-128);
                    if ((1 & var5) == 0) {
                      stackIn_11_0 = 0;
                      break L3;
                    } else {
                      stackIn_11_0 = 1;
                      break L3;
                    }
                  }
                  L4: {
                    var6 = stackIn_11_0;
                    if (-1 == (2 & var5 ^ -1)) {
                      stackIn_14_0 = 0;
                      break L4;
                    } else {
                      stackIn_14_0 = 1;
                      break L4;
                    }
                  }
                  L5: {
                    var7 = stackIn_14_0;
                    if (-8 < (var4 ^ -1)) {
                      this.field_m = var18.c(false);
                      break L5;
                    } else {
                      this.field_m = var18.h(78);
                      break L5;
                    }
                  }
                  L6: {
                    var8 = 0;
                    this.field_y = new int[this.field_m];
                    var9 = -1;
                    if (-8 >= (var4 ^ -1)) {
                      var10 = 0;
                      L7: while (true) {
                        if (var10 >= this.field_m) {
                          break L6;
                        } else {
                          L8: {
                            dupTemp$0 = var8 + var18.h(96);
                            var8 = dupTemp$0;
                            this.field_y[var10] = dupTemp$0;
                            if ((this.field_y[var10] ^ -1) < (var9 ^ -1)) {
                              var9 = this.field_y[var10];
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
                        if (this.field_m <= var10) {
                          break L6;
                        } else {
                          dupTemp$1 = var8 + var18.c(false);
                          var8 = dupTemp$1;
                          this.field_y[var10] = dupTemp$1;
                          if ((this.field_y[var10] ^ -1) < (var9 ^ -1)) {
                            var9 = this.field_y[var10];
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
                    var10 = 36 % ((param0 - -33) / 36);
                    this.field_r = var9 - -1;
                    this.field_A = new int[this.field_r][];
                    if (var7 != 0) {
                      this.field_n = new byte[this.field_r][];
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  L11: {
                    this.field_d = new int[this.field_r];
                    this.field_g = new int[this.field_r];
                    this.field_e = new int[this.field_r];
                    this.field_t = new int[this.field_r];
                    if (var6 == 0) {
                      break L11;
                    } else {
                      this.field_c = new int[this.field_r];
                      var11 = 0;
                      L12: while (true) {
                        if (var11 >= this.field_r) {
                          var11 = 0;
                          L13: while (true) {
                            if (var11 >= this.field_m) {
                              this.field_p = new wi(this.field_c);
                              break L11;
                            } else {
                              this.field_c[this.field_y[var11]] = var18.i(124);
                              var11++;
                              continue L13;
                            }
                          }
                        } else {
                          this.field_c[var11] = -1;
                          var11++;
                          continue L12;
                        }
                      }
                    }
                  }
                  var11 = 0;
                  L14: while (true) {
                    if (this.field_m <= var11) {
                      L15: {
                        if (var7 != 0) {
                          var11 = 0;
                          L16: while (true) {
                            if (var11 >= this.field_m) {
                              var11 = 0;
                              L17: while (true) {
                                if (this.field_m <= var11) {
                                  break L15;
                                } else {
                                  this.field_d[this.field_y[var11]] = var18.i(116);
                                  var11++;
                                  continue L17;
                                }
                              }
                            } else {
                              var22 = new byte[64];
                              var18.a(93, var22, 64, 0);
                              this.field_n[this.field_y[var11]] = var22;
                              var11++;
                              continue L16;
                            }
                          }
                        } else {
                          var11 = 0;
                          L18: while (true) {
                            if (this.field_m <= var11) {
                              break L15;
                            } else {
                              this.field_d[this.field_y[var11]] = var18.i(116);
                              var11++;
                              continue L18;
                            }
                          }
                        }
                      }
                      L19: {
                        if (var4 >= 7) {
                          var11 = 0;
                          L20: while (true) {
                            if (var11 >= this.field_m) {
                              var11 = 0;
                              L21: while (true) {
                                if (this.field_m <= var11) {
                                  break L19;
                                } else {
                                  var12 = this.field_y[var11];
                                  var8 = 0;
                                  var13 = this.field_e[var12];
                                  array$2 = new int[var13];
                                  this.field_A[var12] = array$2;
                                  var14 = -1;
                                  var15 = 0;
                                  L22: while (true) {
                                    if (var15 >= var13) {
                                      L23: {
                                        this.field_g[var12] = 1 + var14;
                                        if (1 + var14 == var13) {
                                          this.field_A[var12] = null;
                                          break L23;
                                        } else {
                                          break L23;
                                        }
                                      }
                                      var11++;
                                      continue L21;
                                    } else {
                                      L24: {
                                        dupTemp$3 = var8 + var18.h(-116);
                                        var8 = dupTemp$3;
                                        dupTemp$4 = this.field_A[var12];
                                        dupTemp$4[var15] = dupTemp$3;
                                        var16 = dupTemp$3;
                                        if (var16 > var14) {
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
                              this.field_e[this.field_y[var11]] = var18.h(-76);
                              var11++;
                              continue L20;
                            }
                          }
                        } else {
                          var11 = 0;
                          L25: while (true) {
                            if (var11 >= this.field_m) {
                              var11 = 0;
                              L26: while (true) {
                                if (this.field_m <= var11) {
                                  break L19;
                                } else {
                                  var12 = this.field_y[var11];
                                  var13 = this.field_e[var12];
                                  var8 = 0;
                                  array$5 = new int[var13];
                                  this.field_A[var12] = array$5;
                                  var14 = -1;
                                  var15 = 0;
                                  L27: while (true) {
                                    if (var15 >= var13) {
                                      L28: {
                                        this.field_g[var12] = var14 + 1;
                                        if (var13 == 1 + var14) {
                                          this.field_A[var12] = null;
                                          break L28;
                                        } else {
                                          break L28;
                                        }
                                      }
                                      var11++;
                                      continue L26;
                                    } else {
                                      L29: {
                                        dupTemp$6 = var8 + var18.c(false);
                                        var8 = dupTemp$6;
                                        dupTemp$7 = this.field_A[var12];
                                        dupTemp$7[var15] = dupTemp$6;
                                        var16 = dupTemp$6;
                                        if ((var16 ^ -1) < (var14 ^ -1)) {
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
                              this.field_e[this.field_y[var11]] = var18.c(false);
                              var11++;
                              continue L25;
                            }
                          }
                        }
                      }
                      L30: {
                        if (var6 != 0) {
                          this.field_s = new wi[var9 + 1];
                          this.field_v = new int[var9 + 1][];
                          var11 = 0;
                          L31: while (true) {
                            if (var11 >= this.field_m) {
                              break L30;
                            } else {
                              var12 = this.field_y[var11];
                              var13 = this.field_e[var12];
                              array$8 = new int[this.field_g[var12]];
                              this.field_v[var12] = array$8;
                              var14 = 0;
                              L32: while (true) {
                                if (var14 >= this.field_g[var12]) {
                                  var14 = 0;
                                  L33: while (true) {
                                    if (var13 <= var14) {
                                      this.field_s[var12] = new wi(this.field_v[var12]);
                                      var11++;
                                      continue L31;
                                    } else {
                                      L34: {
                                        if (null == this.field_A[var12]) {
                                          var15 = var14;
                                          break L34;
                                        } else {
                                          var15 = this.field_A[var12][var14];
                                          break L34;
                                        }
                                      }
                                      this.field_v[var12][var15] = var18.i(50);
                                      var14++;
                                      continue L33;
                                    }
                                  }
                                } else {
                                  this.field_v[var12][var14] = -1;
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
                      this.field_t[this.field_y[var11]] = var18.i(50);
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
            stackIn_101_0 = (RuntimeException) (var3);

            stackIn_101_1 = new StringBuilder().append("tf.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_102_0 = (RuntimeException) ((Object) stackIn_101_0);
              stackIn_102_1 = (StringBuilder) ((Object) stackIn_101_1);
              stackIn_102_2 = "null";
              break L35;
            } else {
              stackIn_102_0 = (RuntimeException) ((Object) stackIn_101_0);
              stackIn_102_1 = (StringBuilder) ((Object) stackIn_101_1);
              stackIn_102_2 = "{...}";
              break L35;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_102_0), stackIn_102_2 + ')');
        }
    }

    tf(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
            this.field_k = k.a(param0, param0.length, 0);
            if (this.field_k != param1) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if ((param2.length ^ -1) != -65) {
                    throw new RuntimeException();
                }
                this.field_q = qc.a(param0, param0.length, (byte) -126, 0);
                for (var4_int = 0; var4_int < 64; var4_int++) {
                    if (param2[var4_int] != this.field_q[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            this.a((byte) -123, param0);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "tf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_i = 0.0;
        field_l = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        field_h = null;
        field_o = 0;
        field_z = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
        field_u = new int[8192];
        field_w = new rj();
    }
}
