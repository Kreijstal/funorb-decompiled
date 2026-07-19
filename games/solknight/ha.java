/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ha {
    private int[] field_i;
    private int field_h;
    int field_l;
    qg[] field_j;
    int[] field_o;
    int[][] field_a;
    int[] field_f;
    static String field_p;
    private byte[] field_c;
    int field_d;
    int[] field_b;
    qg field_e;
    byte[][] field_q;
    static int field_g;
    int field_m;
    int[] field_s;
    int[] field_r;
    static String field_n;
    private int[][] field_k;

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
        gb var17 = null;
        byte[] var21 = null;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        String stackIn_99_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_96_0 = null;
        StringBuilder stackOut_96_1 = null;
        RuntimeException stackOut_98_0 = null;
        StringBuilder stackOut_98_1 = null;
        String stackOut_98_2 = null;
        RuntimeException stackOut_97_0 = null;
        StringBuilder stackOut_97_1 = null;
        String stackOut_97_2 = null;
        var16 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var17 = new gb(jh.a(param1, 6));
              var4 = var17.j(255);
              if (5 > var4) {
                break L1;
              } else {
                if ((var4 ^ -1) < -8) {
                  break L1;
                } else {
                  L2: {
                    if (-7 < (var4 ^ -1)) {
                      this.field_m = 0;
                      break L2;
                    } else {
                      this.field_m = var17.e(true);
                      break L2;
                    }
                  }
                  L3: {
                    var5 = var17.j(255);
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
                    if (-1 == (2 & var5 ^ -1)) {
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
                    if (var4 < 7) {
                      this.field_h = var17.i(-107);
                      break L5;
                    } else {
                      this.field_h = var17.e(6715);
                      break L5;
                    }
                  }
                  L6: {
                    var8 = 0;
                    this.field_f = new int[this.field_h];
                    var9 = -1;
                    if (-8 >= (var4 ^ -1)) {
                      var10 = 0;
                      L7: while (true) {
                        if (var10 >= this.field_h) {
                          break L6;
                        } else {
                          L8: {
                            dupTemp$7 = var8 + var17.e(6715);
                            var8 = dupTemp$7;
                            this.field_f[var10] = dupTemp$7;
                            if (var9 < this.field_f[var10]) {
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
                          dupTemp$8 = var8 + var17.i(-126);
                          var8 = dupTemp$8;
                          this.field_f[var10] = dupTemp$8;
                          if (var9 < this.field_f[var10]) {
                            var9 = this.field_f[var10];
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
                  this.field_l = var9 + 1;
                  this.field_a = new int[this.field_l][];
                  this.field_b = new int[this.field_l];
                  if (param0 < -73) {
                    L10: {
                      this.field_s = new int[this.field_l];
                      this.field_r = new int[this.field_l];
                      this.field_o = new int[this.field_l];
                      if (var7 == 0) {
                        break L10;
                      } else {
                        this.field_q = new byte[this.field_l][];
                        break L10;
                      }
                    }
                    L11: {
                      if (var6 != 0) {
                        this.field_i = new int[this.field_l];
                        var10 = 0;
                        L12: while (true) {
                          if (this.field_l <= var10) {
                            var10 = 0;
                            L13: while (true) {
                              if (var10 >= this.field_h) {
                                this.field_e = new qg(this.field_i);
                                break L11;
                              } else {
                                this.field_i[this.field_f[var10]] = var17.e(true);
                                var10++;
                                continue L13;
                              }
                            }
                          } else {
                            this.field_i[var10] = -1;
                            var10++;
                            continue L12;
                          }
                        }
                      } else {
                        break L11;
                      }
                    }
                    var10 = 0;
                    L14: while (true) {
                      if (var10 >= this.field_h) {
                        L15: {
                          if (var7 == 0) {
                            break L15;
                          } else {
                            var10 = 0;
                            L16: while (true) {
                              if (this.field_h <= var10) {
                                break L15;
                              } else {
                                var21 = new byte[64];
                                var17.a(64, 0, -111, var21);
                                this.field_q[this.field_f[var10]] = var21;
                                var10++;
                                continue L16;
                              }
                            }
                          }
                        }
                        var10 = 0;
                        L17: while (true) {
                          if (this.field_h <= var10) {
                            L18: {
                              if (7 > var4) {
                                var10 = 0;
                                L19: while (true) {
                                  if (this.field_h <= var10) {
                                    var10 = 0;
                                    L20: while (true) {
                                      if (var10 >= this.field_h) {
                                        break L18;
                                      } else {
                                        var11 = this.field_f[var10];
                                        var8 = 0;
                                        var12 = this.field_r[var11];
                                        var13 = -1;
                                        array$9 = new int[var12];
                                        this.field_a[var11] = array$9;
                                        var14 = 0;
                                        L21: while (true) {
                                          if (var14 >= var12) {
                                            L22: {
                                              this.field_o[var11] = var13 + 1;
                                              if (var13 + 1 == var12) {
                                                this.field_a[var11] = null;
                                                break L22;
                                              } else {
                                                break L22;
                                              }
                                            }
                                            var10++;
                                            continue L20;
                                          } else {
                                            L23: {
                                              dupTemp$10 = var8 + var17.i(-118);
                                              var8 = dupTemp$10;
                                              this.field_a[var11][var14] = dupTemp$10;
                                              var15 = dupTemp$10;
                                              if (var13 < var15) {
                                                var13 = var15;
                                                break L23;
                                              } else {
                                                break L23;
                                              }
                                            }
                                            var14++;
                                            continue L21;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    this.field_r[this.field_f[var10]] = var17.i(46);
                                    var10++;
                                    continue L19;
                                  }
                                }
                              } else {
                                var10 = 0;
                                L24: while (true) {
                                  if (this.field_h <= var10) {
                                    var10 = 0;
                                    L25: while (true) {
                                      if (this.field_h <= var10) {
                                        break L18;
                                      } else {
                                        var11 = this.field_f[var10];
                                        var8 = 0;
                                        var12 = this.field_r[var11];
                                        var13 = -1;
                                        array$11 = new int[var12];
                                        this.field_a[var11] = array$11;
                                        var14 = 0;
                                        L26: while (true) {
                                          if (var14 >= var12) {
                                            L27: {
                                              this.field_o[var11] = var13 - -1;
                                              if (1 + var13 != var12) {
                                                break L27;
                                              } else {
                                                this.field_a[var11] = null;
                                                break L27;
                                              }
                                            }
                                            var10++;
                                            continue L25;
                                          } else {
                                            L28: {
                                              dupTemp$12 = var8 + var17.e(6715);
                                              var8 = dupTemp$12;
                                              this.field_a[var11][var14] = dupTemp$12;
                                              var15 = dupTemp$12;
                                              if (var13 < var15) {
                                                var13 = var15;
                                                break L28;
                                              } else {
                                                break L28;
                                              }
                                            }
                                            var14++;
                                            continue L26;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    this.field_r[this.field_f[var10]] = var17.e(6715);
                                    var10++;
                                    continue L24;
                                  }
                                }
                              }
                            }
                            L29: {
                              if (var6 == 0) {
                                break L29;
                              } else {
                                this.field_j = new qg[var9 - -1];
                                this.field_k = new int[var9 + 1][];
                                var10 = 0;
                                L30: while (true) {
                                  if (var10 >= this.field_h) {
                                    break L29;
                                  } else {
                                    var11 = this.field_f[var10];
                                    var12 = this.field_r[var11];
                                    array$13 = new int[this.field_o[var11]];
                                    this.field_k[var11] = array$13;
                                    var13 = 0;
                                    L31: while (true) {
                                      if (var13 >= this.field_o[var11]) {
                                        var13 = 0;
                                        L32: while (true) {
                                          if (var12 <= var13) {
                                            this.field_j[var11] = new qg(this.field_k[var11]);
                                            var10++;
                                            continue L30;
                                          } else {
                                            L33: {
                                              if (null == this.field_a[var11]) {
                                                var14 = var13;
                                                break L33;
                                              } else {
                                                var14 = this.field_a[var11][var13];
                                                break L33;
                                              }
                                            }
                                            this.field_k[var11][var14] = var17.e(true);
                                            var13++;
                                            continue L32;
                                          }
                                        }
                                      } else {
                                        this.field_k[var11][var13] = -1;
                                        var13++;
                                        continue L31;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            this.field_s[this.field_f[var10]] = var17.e(true);
                            var10++;
                            continue L17;
                          }
                        }
                      } else {
                        this.field_b[this.field_f[var10]] = var17.e(true);
                        var10++;
                        continue L14;
                      }
                    }
                  } else {
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L34: {
            var3 = decompiledCaughtException;
            stackOut_96_0 = (RuntimeException) (var3);
            stackOut_96_1 = new StringBuilder().append("ha.B(").append(param0).append(',');
            stackIn_98_0 = stackOut_96_0;
            stackIn_98_1 = stackOut_96_1;
            stackIn_97_0 = stackOut_96_0;
            stackIn_97_1 = stackOut_96_1;
            if (param1 == null) {
              stackOut_98_0 = (RuntimeException) ((Object) stackIn_98_0);
              stackOut_98_1 = (StringBuilder) ((Object) stackIn_98_1);
              stackOut_98_2 = "null";
              stackIn_99_0 = stackOut_98_0;
              stackIn_99_1 = stackOut_98_1;
              stackIn_99_2 = stackOut_98_2;
              break L34;
            } else {
              stackOut_97_0 = (RuntimeException) ((Object) stackIn_97_0);
              stackOut_97_1 = (StringBuilder) ((Object) stackIn_97_1);
              stackOut_97_2 = "{...}";
              stackIn_99_0 = stackOut_97_0;
              stackIn_99_1 = stackOut_97_1;
              stackIn_99_2 = stackOut_97_2;
              break L34;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_99_0), stackIn_99_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(gg param0, byte param1, gg param2) {
        if (!(param0.field_a == null)) {
            param0.c(10);
        }
        param0.field_d = param2;
        param0.field_a = param2.field_a;
        param0.field_a.field_d = param0;
        if (param1 <= 15) {
            return;
        }
        try {
            param0.field_d.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "ha.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_n = null;
        field_p = null;
        if (param0 != 0) {
            field_n = (String) null;
        }
    }

    final static o[] a(int param0, int param1) {
        int var3 = 115 / ((param1 - 7) / 63);
        o[] var4 = new o[9];
        o[] var2 = var4;
        var4[4] = ib.a(64, true, param0);
        return var2;
    }

    ha(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
            this.field_d = gl.a(param0.length, param0, 119);
            if (this.field_d != param1) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if (64 != param2.length) {
                    throw new RuntimeException();
                }
                this.field_c = q.a(param0.length, 0, 89, param0);
                for (var4_int = 0; -65 < (var4_int ^ -1); var4_int++) {
                    if (this.field_c[var4_int] != param2[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            this.a((byte) -88, param0);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "ha.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_p = "Score: <%0>";
        field_n = "to keep fullscreen or";
    }
}
