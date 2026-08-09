/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ko {
    private byte[] field_o;
    private int[] field_k;
    int field_b;
    static int field_s;
    int field_f;
    lm field_n;
    static int field_e;
    int[] field_g;
    int[] field_l;
    static mh field_j;
    int[] field_r;
    lm[] field_i;
    int[] field_p;
    int[] field_m;
    private int[][] field_t;
    int field_a;
    private int field_d;
    int[][] field_h;
    byte[][] field_c;
    static String field_q;

    private final void a(byte[] param0, boolean param1) {
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
        RuntimeException stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        String stackIn_97_2 = null;
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
        wq var17 = null;
        byte[] var21 = null;
        var16 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var17 = new wq(i.a(true, param0));
              var4 = var17.l(255);
              if (-6 < (var4 ^ -1)) {
                break L1;
              } else {
                if (var4 > 7) {
                  break L1;
                } else {
                  L2: {
                    if (var4 < 6) {
                      this.field_a = 0;
                      break L2;
                    } else {
                      this.field_a = var17.e(255);
                      break L2;
                    }
                  }
                  L3: {
                    var5 = var17.l(255);
                    if (0 == (var5 & 1)) {
                      stackIn_11_0 = 0;
                      break L3;
                    } else {
                      stackIn_11_0 = 1;
                      break L3;
                    }
                  }
                  L4: {
                    var6 = stackIn_11_0;
                    if (0 == (var5 & 2)) {
                      stackIn_14_0 = 0;
                      break L4;
                    } else {
                      stackIn_14_0 = 1;
                      break L4;
                    }
                  }
                  L5: {
                    var7 = stackIn_14_0;
                    if (var4 >= 7) {
                      this.field_d = var17.c(false);
                      break L5;
                    } else {
                      this.field_d = var17.i(65280);
                      break L5;
                    }
                  }
                  L6: {
                    var8 = 0;
                    this.field_g = new int[this.field_d];
                    if (!param1) {
                      break L6;
                    } else {
                      ko.a((byte) 19);
                      break L6;
                    }
                  }
                  L7: {
                    var9 = -1;
                    if (-8 >= (var4 ^ -1)) {
                      var10 = 0;
                      L8: while (true) {
                        if (var10 >= this.field_d) {
                          break L7;
                        } else {
                          L9: {
                            dupTemp$0 = var8 + var17.c(false);
                            var8 = dupTemp$0;
                            this.field_g[var10] = dupTemp$0;
                            if (var9 < this.field_g[var10]) {
                              var9 = this.field_g[var10];
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          var10++;
                          continue L8;
                        }
                      }
                    } else {
                      var10 = 0;
                      L10: while (true) {
                        if (var10 >= this.field_d) {
                          break L7;
                        } else {
                          dupTemp$1 = var8 + var17.i(65280);
                          var8 = dupTemp$1;
                          this.field_g[var10] = dupTemp$1;
                          if (var9 < this.field_g[var10]) {
                            var9 = this.field_g[var10];
                            var10++;
                            continue L10;
                          } else {
                            var10++;
                            continue L10;
                          }
                        }
                      }
                    }
                  }
                  L11: {
                    this.field_f = 1 + var9;
                    this.field_r = new int[this.field_f];
                    if (var7 == 0) {
                      break L11;
                    } else {
                      this.field_c = new byte[this.field_f][];
                      break L11;
                    }
                  }
                  L12: {
                    this.field_l = new int[this.field_f];
                    this.field_p = new int[this.field_f];
                    this.field_m = new int[this.field_f];
                    this.field_h = new int[this.field_f][];
                    if (var6 != 0) {
                      this.field_k = new int[this.field_f];
                      var10 = 0;
                      L13: while (true) {
                        if (this.field_f <= var10) {
                          var10 = 0;
                          L14: while (true) {
                            if (var10 >= this.field_d) {
                              this.field_n = new lm(this.field_k);
                              break L12;
                            } else {
                              this.field_k[this.field_g[var10]] = var17.e(255);
                              var10++;
                              continue L14;
                            }
                          }
                        } else {
                          this.field_k[var10] = -1;
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
                    if (this.field_d <= var10) {
                      L16: {
                        if (var7 == 0) {
                          break L16;
                        } else {
                          var10 = 0;
                          L17: while (true) {
                            if (var10 >= this.field_d) {
                              break L16;
                            } else {
                              var21 = new byte[64];
                              var17.a(0, var21, 110, 64);
                              this.field_c[this.field_g[var10]] = var21;
                              var10++;
                              continue L17;
                            }
                          }
                        }
                      }
                      var10 = 0;
                      L18: while (true) {
                        if (this.field_d <= var10) {
                          L19: {
                            if (var4 < 7) {
                              var10 = 0;
                              L20: while (true) {
                                if (var10 >= this.field_d) {
                                  var10 = 0;
                                  L21: while (true) {
                                    if (this.field_d <= var10) {
                                      break L19;
                                    } else {
                                      var11 = this.field_g[var10];
                                      var8 = 0;
                                      var12 = this.field_m[var11];
                                      var13 = -1;
                                      array$2 = new int[var12];
                                      this.field_h[var11] = array$2;
                                      var14 = 0;
                                      L22: while (true) {
                                        if (var14 >= var12) {
                                          L23: {
                                            this.field_l[var11] = 1 + var13;
                                            if (var13 - -1 == var12) {
                                              this.field_h[var11] = null;
                                              break L23;
                                            } else {
                                              break L23;
                                            }
                                          }
                                          var10++;
                                          continue L21;
                                        } else {
                                          dupTemp$3 = var8 + var17.i(65280);
                                          var8 = dupTemp$3;
                                          dupTemp$4 = this.field_h[var11];
                                          dupTemp$4[var14] = dupTemp$3;
                                          var15 = dupTemp$3;
                                          if (var15 > var13) {
                                            var13 = var15;
                                            var14++;
                                            continue L22;
                                          } else {
                                            var14++;
                                            continue L22;
                                          }
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  this.field_m[this.field_g[var10]] = var17.i(65280);
                                  var10++;
                                  continue L20;
                                }
                              }
                            } else {
                              var10 = 0;
                              L24: while (true) {
                                if (var10 >= this.field_d) {
                                  var10 = 0;
                                  L25: while (true) {
                                    if (this.field_d <= var10) {
                                      break L19;
                                    } else {
                                      var11 = this.field_g[var10];
                                      var8 = 0;
                                      var12 = this.field_m[var11];
                                      array$5 = new int[var12];
                                      this.field_h[var11] = array$5;
                                      var13 = -1;
                                      var14 = 0;
                                      L26: while (true) {
                                        if (var14 >= var12) {
                                          L27: {
                                            this.field_l[var11] = var13 + 1;
                                            if (1 + var13 != var12) {
                                              break L27;
                                            } else {
                                              this.field_h[var11] = null;
                                              break L27;
                                            }
                                          }
                                          var10++;
                                          continue L25;
                                        } else {
                                          dupTemp$6 = var8 + var17.c(false);
                                          var8 = dupTemp$6;
                                          dupTemp$7 = this.field_h[var11];
                                          dupTemp$7[var14] = dupTemp$6;
                                          var15 = dupTemp$6;
                                          if (var13 < var15) {
                                            var13 = var15;
                                            var14++;
                                            continue L26;
                                          } else {
                                            var14++;
                                            continue L26;
                                          }
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  this.field_m[this.field_g[var10]] = var17.c(false);
                                  var10++;
                                  continue L24;
                                }
                              }
                            }
                          }
                          L28: {
                            if (var6 == 0) {
                              break L28;
                            } else {
                              this.field_i = new lm[var9 + 1];
                              this.field_t = new int[1 + var9][];
                              var10 = 0;
                              L29: while (true) {
                                if (this.field_d <= var10) {
                                  break L28;
                                } else {
                                  var11 = this.field_g[var10];
                                  var12 = this.field_m[var11];
                                  array$8 = new int[this.field_l[var11]];
                                  this.field_t[var11] = array$8;
                                  var13 = 0;
                                  L30: while (true) {
                                    if (this.field_l[var11] <= var13) {
                                      var13 = 0;
                                      L31: while (true) {
                                        if (var13 >= var12) {
                                          this.field_i[var11] = new lm(this.field_t[var11]);
                                          var10++;
                                          continue L29;
                                        } else {
                                          L32: {
                                            if (null == this.field_h[var11]) {
                                              var14 = var13;
                                              break L32;
                                            } else {
                                              var14 = this.field_h[var11][var13];
                                              break L32;
                                            }
                                          }
                                          this.field_t[var11][var14] = var17.e(255);
                                          var13++;
                                          continue L31;
                                        }
                                      }
                                    } else {
                                      this.field_t[var11][var13] = -1;
                                      var13++;
                                      continue L30;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          break L0;
                        } else {
                          this.field_r[this.field_g[var10]] = var17.e(255);
                          var10++;
                          continue L18;
                        }
                      }
                    } else {
                      this.field_p[this.field_g[var10]] = var17.e(255);
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
          L33: {
            var3 = decompiledCaughtException;
            stackIn_96_0 = (RuntimeException) (var3);

            stackIn_96_1 = new StringBuilder().append("ko.A(");

            if (param0 == null) {
              stackIn_97_0 = (RuntimeException) ((Object) stackIn_96_0);
              stackIn_97_1 = (StringBuilder) ((Object) stackIn_96_1);
              stackIn_97_2 = "null";
              break L33;
            } else {
              stackIn_97_0 = (RuntimeException) ((Object) stackIn_96_0);
              stackIn_97_1 = (StringBuilder) ((Object) stackIn_96_1);
              stackIn_97_2 = "{...}";
              break L33;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_97_0), stackIn_97_2 + ',' + param1 + ')');
        }
    }

    final static void a(int param0) {
        int var2 = BrickABrac.field_J ? 1 : 0;
        if (ml.field_b > 0) {
            ml.field_b = ml.field_b - 1;
        } else {
            if (pe.field_j > 0) {
                pe.field_j = pe.field_j - 1;
            } else {
                if ((eg.field_m ^ -1) < -1) {
                    eg.field_m = eg.field_m - 1;
                }
            }
        }
        if (param0 != -32120) {
            return;
        }
        if (!(-1 <= (ml.field_b ^ -1))) {
            on.e(param0 ^ 32040);
        }
        if (!(pe.field_j <= 0)) {
            co.a(pe.field_j, false);
        }
        if (eg.field_m > 0) {
            co.a(eg.field_m, false);
        }
    }

    final static void a(int param0, int param1, jp param2, int param3, jp param4, int param5, int param6, int param7, int param8, int param9, jp param10) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var11 = null;
        try {
          L0: {
            L1: {
              param4.d(param8 - (-((-param4.field_x + param6) / 2) + -(5 * param3 >> 1594706992)), param9);
              if (param0 <= -20) {
                break L1;
              } else {
                field_s = 123;
                break L1;
              }
            }
            param10.c(-(30 / param7) + (param8 + ((-param10.field_x + param6) / 2 - -(param3 * 10 >> 1124111280))), 37 / param7 + (-param10.field_z + 480 + param9) - -param1);
            param2.c(param8 - (-((param6 - param2.field_x) / 2) + -(20 * param3 >> 1188009520)) - 5 / param7, -param2.field_z + 480 + (param9 - -param1));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var11 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var11);

            stackIn_6_1 = new StringBuilder().append("ko.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',');

            if (param10 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
    }

    public static void a(byte param0) {
        if (param0 <= 108) {
            return;
        }
        field_q = null;
        field_j = null;
    }

    ko(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
            this.field_b = cg.a(param0.length, param0, (byte) -86);
            if (param1 != this.field_b) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if (-65 != (param2.length ^ -1)) {
                    throw new RuntimeException();
                }
                this.field_o = jd.a(param0, 0, -14970, param0.length);
                for (var4_int = 0; -65 < (var4_int ^ -1); var4_int++) {
                    if (this.field_o[var4_int] != param2[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            this.a(param0, false);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "ko.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_q = "PER MONTH";
    }
}
