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

    private final void a(byte[] param0, byte param1) {
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        int[] array$2 = null;
        int dupTemp$3 = 0;
        int[] dupTemp$4 = null;
        int[] array$5 = null;
        int dupTemp$6 = 0;
        int[] dupTemp$7 = null;
        int[] array$8 = null;
        int stackIn_13_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        String stackIn_102_2 = null;
        int decompiledRegionSelector0 = 0;
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
        fs var17 = null;
        byte[] var21 = null;
        var16 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (param1 == -56) {
              L1: {
                var17 = new fs(nd.a(-1, param0));
                var4 = var17.e(param1 ^ 31346);
                if (-6 < (var4 ^ -1)) {
                  break L1;
                } else {
                  if ((var4 ^ -1) >= -8) {
                    L2: {
                      if (-7 < (var4 ^ -1)) {
                        this.field_l = 0;
                        break L2;
                      } else {
                        this.field_l = var17.c(true);
                        break L2;
                      }
                    }
                    L3: {
                      var5 = var17.e(-31302);
                      if ((1 & var5) == 0) {
                        stackIn_13_0 = 0;
                        break L3;
                      } else {
                        stackIn_13_0 = 1;
                        break L3;
                      }
                    }
                    L4: {
                      var6 = stackIn_13_0;
                      if (-8 < (var4 ^ -1)) {
                        this.field_h = var17.a(255);
                        break L4;
                      } else {
                        this.field_h = var17.f(0);
                        break L4;
                      }
                    }
                    L5: {
                      if (-1 == (var5 & 2 ^ -1)) {
                        stackIn_19_0 = 0;
                        break L5;
                      } else {
                        stackIn_19_0 = 1;
                        break L5;
                      }
                    }
                    L6: {
                      var7 = stackIn_19_0;
                      var8 = 0;
                      var9 = -1;
                      this.field_f = new int[this.field_h];
                      if (-8 >= (var4 ^ -1)) {
                        var10 = 0;
                        L7: while (true) {
                          if (this.field_h <= var10) {
                            break L6;
                          } else {
                            L8: {
                              dupTemp$0 = var8 + var17.f(0);
                              var8 = dupTemp$0;
                              this.field_f[var10] = dupTemp$0;
                              if ((var9 ^ -1) > (this.field_f[var10] ^ -1)) {
                                var9 = this.field_f[var10];
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
                          if (var10 >= this.field_h) {
                            break L6;
                          } else {
                            L10: {
                              dupTemp$1 = var8 + var17.a(jg.a((int) param1, -201));
                              var8 = dupTemp$1;
                              this.field_f[var10] = dupTemp$1;
                              if ((this.field_f[var10] ^ -1) < (var9 ^ -1)) {
                                var9 = this.field_f[var10];
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
                      this.field_d = var9 + 1;
                      this.field_b = new int[this.field_d];
                      this.field_c = new int[this.field_d];
                      if (var7 != 0) {
                        this.field_a = new byte[this.field_d][];
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    L12: {
                      this.field_s = new int[this.field_d][];
                      this.field_r = new int[this.field_d];
                      this.field_m = new int[this.field_d];
                      if (var6 == 0) {
                        break L12;
                      } else {
                        this.field_n = new int[this.field_d];
                        var10 = 0;
                        L13: while (true) {
                          if (this.field_d <= var10) {
                            var10 = 0;
                            L14: while (true) {
                              if (this.field_h <= var10) {
                                this.field_e = new bf(this.field_n);
                                break L12;
                              } else {
                                this.field_n[this.field_f[var10]] = var17.c(true);
                                var10++;
                                continue L14;
                              }
                            }
                          } else {
                            this.field_n[var10] = -1;
                            var10++;
                            continue L13;
                          }
                        }
                      }
                    }
                    var10 = 0;
                    L15: while (true) {
                      if (var10 >= this.field_h) {
                        L16: {
                          if (var7 != 0) {
                            var10 = 0;
                            L17: while (true) {
                              if (this.field_h <= var10) {
                                var10 = 0;
                                L18: while (true) {
                                  if (var10 >= this.field_h) {
                                    break L16;
                                  } else {
                                    this.field_c[this.field_f[var10]] = var17.c(true);
                                    var10++;
                                    continue L18;
                                  }
                                }
                              } else {
                                var21 = new byte[64];
                                var17.a(var21, 64, 0, (byte) -109);
                                this.field_a[this.field_f[var10]] = var21;
                                var10++;
                                continue L17;
                              }
                            }
                          } else {
                            var10 = 0;
                            L19: while (true) {
                              if (var10 >= this.field_h) {
                                break L16;
                              } else {
                                this.field_c[this.field_f[var10]] = var17.c(true);
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
                              if (this.field_h <= var10) {
                                var10 = 0;
                                L22: while (true) {
                                  if (var10 >= this.field_h) {
                                    break L20;
                                  } else {
                                    var11 = this.field_f[var10];
                                    var8 = 0;
                                    var12 = this.field_m[var11];
                                    var13 = -1;
                                    array$2 = new int[var12];
                                    this.field_s[var11] = array$2;
                                    var14 = 0;
                                    L23: while (true) {
                                      if (var12 <= var14) {
                                        L24: {
                                          this.field_r[var11] = 1 + var13;
                                          if (1 + var13 == var12) {
                                            this.field_s[var11] = null;
                                            break L24;
                                          } else {
                                            break L24;
                                          }
                                        }
                                        var10++;
                                        continue L22;
                                      } else {
                                        dupTemp$3 = var8 + var17.f(0);
                                        var8 = dupTemp$3;
                                        dupTemp$4 = this.field_s[var11];
                                        dupTemp$4[var14] = dupTemp$3;
                                        var15 = dupTemp$3;
                                        if (var15 > var13) {
                                          var13 = var15;
                                          var14++;
                                          continue L23;
                                        } else {
                                          var14++;
                                          continue L23;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                this.field_m[this.field_f[var10]] = var17.f(0);
                                var10++;
                                continue L21;
                              }
                            }
                          } else {
                            var10 = 0;
                            L25: while (true) {
                              if (var10 >= this.field_h) {
                                var10 = 0;
                                L26: while (true) {
                                  if (this.field_h <= var10) {
                                    break L20;
                                  } else {
                                    var11 = this.field_f[var10];
                                    var12 = this.field_m[var11];
                                    var8 = 0;
                                    array$5 = new int[var12];
                                    this.field_s[var11] = array$5;
                                    var13 = -1;
                                    var14 = 0;
                                    L27: while (true) {
                                      if (var12 <= var14) {
                                        L28: {
                                          this.field_r[var11] = 1 + var13;
                                          if (var12 != 1 + var13) {
                                            break L28;
                                          } else {
                                            this.field_s[var11] = null;
                                            break L28;
                                          }
                                        }
                                        var10++;
                                        continue L26;
                                      } else {
                                        dupTemp$6 = var8 + var17.a(255);
                                        var8 = dupTemp$6;
                                        dupTemp$7 = this.field_s[var11];
                                        dupTemp$7[var14] = dupTemp$6;
                                        var15 = dupTemp$6;
                                        if (var15 > var13) {
                                          var13 = var15;
                                          var14++;
                                          continue L27;
                                        } else {
                                          var14++;
                                          continue L27;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                this.field_m[this.field_f[var10]] = var17.a(255);
                                var10++;
                                continue L25;
                              }
                            }
                          }
                        }
                        L29: {
                          if (var6 != 0) {
                            this.field_o = new int[var9 + 1][];
                            this.field_q = new bf[1 + var9];
                            var10 = 0;
                            L30: while (true) {
                              if (this.field_h <= var10) {
                                break L29;
                              } else {
                                var11 = this.field_f[var10];
                                var12 = this.field_m[var11];
                                array$8 = new int[this.field_r[var11]];
                                this.field_o[var11] = array$8;
                                var13 = 0;
                                L31: while (true) {
                                  if (var13 >= this.field_r[var11]) {
                                    var13 = 0;
                                    L32: while (true) {
                                      if (var13 >= var12) {
                                        this.field_q[var11] = new bf(this.field_o[var11]);
                                        var10++;
                                        continue L30;
                                      } else {
                                        L33: {
                                          if (this.field_s[var11] == null) {
                                            var14 = var13;
                                            break L33;
                                          } else {
                                            var14 = this.field_s[var11][var13];
                                            break L33;
                                          }
                                        }
                                        this.field_o[var11][var14] = var17.c(true);
                                        var13++;
                                        continue L32;
                                      }
                                    }
                                  } else {
                                    this.field_o[var11][var13] = -1;
                                    var13++;
                                    continue L31;
                                  }
                                }
                              }
                            }
                          } else {
                            break L29;
                          }
                        }
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        this.field_b[this.field_f[var10]] = var17.c(true);
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
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L34: {
            var3 = decompiledCaughtException;
            stackIn_101_0 = (RuntimeException) (var3);

            stackIn_101_1 = new StringBuilder().append("sg.C(");

            if (param0 == null) {
              stackIn_102_0 = (RuntimeException) ((Object) stackIn_101_0);
              stackIn_102_1 = (StringBuilder) ((Object) stackIn_101_1);
              stackIn_102_2 = "null";
              break L34;
            } else {
              stackIn_102_0 = (RuntimeException) ((Object) stackIn_101_0);
              stackIn_102_1 = (StringBuilder) ((Object) stackIn_101_1);
              stackIn_102_2 = "{...}";
              break L34;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_102_0), stackIn_102_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        if (param0 > -67) {
            return;
        }
        field_k = null;
        field_i = null;
    }

    final static boolean a(int param0, int param1, int param2) {
        if (param2 < 12) {
            return false;
        }
        return -1 != (param1 & 2048 ^ -1) ? true : false;
    }

    sg(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
            this.field_p = am.a(param0.length, param0, (byte) 18);
            if (this.field_p != param1) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if (64 != param2.length) {
                    throw new RuntimeException();
                }
                this.field_g = gn.a(param0, (byte) -110, 0, param0.length);
                for (var4_int = 0; var4_int < 64; var4_int++) {
                    if (param2[var4_int] != this.field_g[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            this.a(param0, (byte) -56);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "sg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_i = "Loading instruments";
        field_k = "Passwords must be between 5 and 20 characters long";
    }
}
