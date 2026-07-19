/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lj {
    int[] field_b;
    int field_g;
    int[] field_q;
    int[] field_l;
    static hn field_a;
    private int field_k;
    private byte[] field_r;
    int[] field_o;
    private int[] field_f;
    byte[][] field_t;
    int field_s;
    static rk field_n;
    int[][] field_h;
    qh[] field_j;
    private int[][] field_m;
    static String field_d;
    int field_c;
    int[] field_p;
    qh field_e;
    static bn field_i;

    final static void a(byte param0) {
        int var2 = 0;
        L0: {
          var2 = Chess.field_G;
          if (-1 <= (an.field_e ^ -1)) {
            if (-1 > (aj.field_c ^ -1)) {
              aj.field_c = aj.field_c - 1;
              break L0;
            } else {
              if (0 < ed.field_c) {
                ed.field_c = ed.field_c - 1;
                break L0;
              } else {
                break L0;
              }
            }
          } else {
            an.field_e = an.field_e - 1;
            break L0;
          }
        }
        L1: {
          if ((an.field_e ^ -1) < -1) {
            tf.a(90);
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if ((aj.field_c ^ -1) >= -1) {
            break L2;
          } else {
            f.a(aj.field_c, true);
            break L2;
          }
        }
        L3: {
          if ((ed.field_c ^ -1) < -1) {
            f.a(ed.field_c, true);
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (param0 == 19) {
            break L4;
          } else {
            lj.a((byte) -39);
            break L4;
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_i = null;
        if (param0 <= 81) {
            lj.a((String) null, 126L, -28);
        }
        field_d = null;
        field_n = null;
    }

    private final void a(byte[] param0, byte param1) {
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
        p var17 = null;
        byte[] var21 = null;
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
        var16 = Chess.field_G;
        try {
          L0: {
            L1: {
              var17 = new p(dj.a(param0, 119));
              var4 = var17.i(-117);
              if (var4 < 5) {
                break L1;
              } else {
                if (7 < var4) {
                  break L1;
                } else {
                  L2: {
                    if (var4 >= 6) {
                      this.field_s = var17.e((byte) -98);
                      break L2;
                    } else {
                      this.field_s = 0;
                      break L2;
                    }
                  }
                  L3: {
                    var5 = var17.i(-114);
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
                      this.field_k = var17.h(-120);
                      break L4;
                    } else {
                      this.field_k = var17.f(674914976);
                      break L4;
                    }
                  }
                  L5: {
                    if (0 == (var5 & 2)) {
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
                    this.field_q = new int[this.field_k];
                    var9 = -1;
                    if (7 <= var4) {
                      var10 = 0;
                      L7: while (true) {
                        if (this.field_k <= var10) {
                          break L6;
                        } else {
                          dupTemp$7 = var8 + var17.h(-110);
                          var8 = dupTemp$7;
                          this.field_q[var10] = dupTemp$7;
                          if (this.field_q[var10] > var9) {
                            var9 = this.field_q[var10];
                            var10++;
                            continue L7;
                          } else {
                            var10++;
                            continue L7;
                          }
                        }
                      }
                    } else {
                      var10 = 0;
                      L8: while (true) {
                        if (var10 >= this.field_k) {
                          break L6;
                        } else {
                          L9: {
                            dupTemp$8 = var8 + var17.f(674914976);
                            var8 = dupTemp$8;
                            this.field_q[var10] = dupTemp$8;
                            if (this.field_q[var10] > var9) {
                              var9 = this.field_q[var10];
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          var10++;
                          continue L8;
                        }
                      }
                    }
                  }
                  L10: {
                    this.field_g = var9 + 1;
                    this.field_p = new int[this.field_g];
                    this.field_o = new int[this.field_g];
                    if (var7 == 0) {
                      break L10;
                    } else {
                      this.field_t = new byte[this.field_g][];
                      break L10;
                    }
                  }
                  L11: {
                    this.field_h = new int[this.field_g][];
                    this.field_b = new int[this.field_g];
                    this.field_l = new int[this.field_g];
                    if (var6 == 0) {
                      break L11;
                    } else {
                      this.field_f = new int[this.field_g];
                      var10 = 0;
                      L12: while (true) {
                        if (this.field_g <= var10) {
                          var10 = 0;
                          L13: while (true) {
                            if (var10 >= this.field_k) {
                              this.field_e = new qh(this.field_f);
                              break L11;
                            } else {
                              this.field_f[this.field_q[var10]] = var17.e((byte) -114);
                              var10++;
                              continue L13;
                            }
                          }
                        } else {
                          this.field_f[var10] = -1;
                          var10++;
                          continue L12;
                        }
                      }
                    }
                  }
                  var10 = 0;
                  L14: while (true) {
                    if (var10 >= this.field_k) {
                      L15: {
                        if (param1 >= 35) {
                          break L15;
                        } else {
                          lj.a(-43);
                          break L15;
                        }
                      }
                      L16: {
                        if (var7 != 0) {
                          var10 = 0;
                          L17: while (true) {
                            if (this.field_k <= var10) {
                              var10 = 0;
                              L18: while (true) {
                                if (var10 >= this.field_k) {
                                  break L16;
                                } else {
                                  this.field_b[this.field_q[var10]] = var17.e((byte) -93);
                                  var10++;
                                  continue L18;
                                }
                              }
                            } else {
                              var21 = new byte[64];
                              var17.a(64, (byte) 121, var21, 0);
                              this.field_t[this.field_q[var10]] = var21;
                              var10++;
                              continue L17;
                            }
                          }
                        } else {
                          var10 = 0;
                          L19: while (true) {
                            if (var10 >= this.field_k) {
                              break L16;
                            } else {
                              this.field_b[this.field_q[var10]] = var17.e((byte) -93);
                              var10++;
                              continue L19;
                            }
                          }
                        }
                      }
                      L20: {
                        if (-8 >= (var4 ^ -1)) {
                          var10 = 0;
                          L21: while (true) {
                            if (this.field_k <= var10) {
                              var10 = 0;
                              L22: while (true) {
                                if (var10 >= this.field_k) {
                                  break L20;
                                } else {
                                  var11 = this.field_q[var10];
                                  var12 = this.field_l[var11];
                                  var8 = 0;
                                  var13 = -1;
                                  array$9 = new int[var12];
                                  this.field_h[var11] = array$9;
                                  var14 = 0;
                                  L23: while (true) {
                                    if (var14 >= var12) {
                                      L24: {
                                        this.field_o[var11] = 1 + var13;
                                        if (var12 == 1 + var13) {
                                          this.field_h[var11] = null;
                                          break L24;
                                        } else {
                                          break L24;
                                        }
                                      }
                                      var10++;
                                      continue L22;
                                    } else {
                                      L25: {
                                        dupTemp$10 = var8 + var17.h(-99);
                                        var8 = dupTemp$10;
                                        this.field_h[var11][var14] = dupTemp$10;
                                        var15 = dupTemp$10;
                                        if (var15 > var13) {
                                          var13 = var15;
                                          break L25;
                                        } else {
                                          break L25;
                                        }
                                      }
                                      var14++;
                                      continue L23;
                                    }
                                  }
                                }
                              }
                            } else {
                              this.field_l[this.field_q[var10]] = var17.h(-110);
                              var10++;
                              continue L21;
                            }
                          }
                        } else {
                          var10 = 0;
                          L26: while (true) {
                            if (this.field_k <= var10) {
                              var10 = 0;
                              L27: while (true) {
                                if (var10 >= this.field_k) {
                                  break L20;
                                } else {
                                  var11 = this.field_q[var10];
                                  var8 = 0;
                                  var12 = this.field_l[var11];
                                  array$11 = new int[var12];
                                  this.field_h[var11] = array$11;
                                  var13 = -1;
                                  var14 = 0;
                                  L28: while (true) {
                                    if (var12 <= var14) {
                                      L29: {
                                        this.field_o[var11] = var13 + 1;
                                        if (var12 == var13 - -1) {
                                          this.field_h[var11] = null;
                                          break L29;
                                        } else {
                                          break L29;
                                        }
                                      }
                                      var10++;
                                      continue L27;
                                    } else {
                                      dupTemp$12 = var8 + var17.f(674914976);
                                      var8 = dupTemp$12;
                                      this.field_h[var11][var14] = dupTemp$12;
                                      var15 = dupTemp$12;
                                      if (var13 < var15) {
                                        var13 = var15;
                                        var14++;
                                        continue L28;
                                      } else {
                                        var14++;
                                        continue L28;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              this.field_l[this.field_q[var10]] = var17.f(674914976);
                              var10++;
                              continue L26;
                            }
                          }
                        }
                      }
                      L30: {
                        if (var6 == 0) {
                          break L30;
                        } else {
                          this.field_m = new int[1 + var9][];
                          this.field_j = new qh[var9 + 1];
                          var10 = 0;
                          L31: while (true) {
                            if (this.field_k <= var10) {
                              break L30;
                            } else {
                              var11 = this.field_q[var10];
                              var12 = this.field_l[var11];
                              array$13 = new int[this.field_o[var11]];
                              this.field_m[var11] = array$13;
                              var13 = 0;
                              L32: while (true) {
                                if (this.field_o[var11] <= var13) {
                                  var13 = 0;
                                  L33: while (true) {
                                    if (var13 >= var12) {
                                      this.field_j[var11] = new qh(this.field_m[var11]);
                                      var10++;
                                      continue L31;
                                    } else {
                                      L34: {
                                        if (this.field_h[var11] == null) {
                                          var14 = var13;
                                          break L34;
                                        } else {
                                          var14 = this.field_h[var11][var13];
                                          break L34;
                                        }
                                      }
                                      this.field_m[var11][var14] = var17.e((byte) -97);
                                      var13++;
                                      continue L33;
                                    }
                                  }
                                } else {
                                  this.field_m[var11][var13] = -1;
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
                      this.field_p[this.field_q[var10]] = var17.e((byte) -116);
                      var10++;
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
          L35: {
            var3 = decompiledCaughtException;
            stackOut_98_0 = (RuntimeException) (var3);
            stackOut_98_1 = new StringBuilder().append("lj.D(");
            stackIn_100_0 = stackOut_98_0;
            stackIn_100_1 = stackOut_98_1;
            stackIn_99_0 = stackOut_98_0;
            stackIn_99_1 = stackOut_98_1;
            if (param0 == null) {
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
          throw fk.a((Throwable) ((Object) stackIn_101_0), stackIn_101_2 + ',' + param1 + ')');
        }
    }

    final static void a(String param0, long param1, int param2) {
        CharSequence var5 = null;
        try {
            vk.field_g = 2;
            ij.field_c = param0;
            var5 = (CharSequence) ((Object) param0);
            ec.field_f = ad.a(var5, -2);
            re.field_p = param1;
            int var4_int = -59 % ((param2 - 54) / 48);
            df.a(true);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "lj.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    lj(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
            this.field_c = ke.a(param0, 21106, param0.length);
            if (this.field_c != param1) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if (-65 != (param2.length ^ -1)) {
                    throw new RuntimeException();
                }
                this.field_r = kh.a(0, param0.length, (byte) 124, param0);
                for (var4_int = 0; (var4_int ^ -1) > -65; var4_int++) {
                    if (this.field_r[var4_int] != param2[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            this.a(param0, (byte) 50);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "lj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = "Join <%0>'s game";
    }
}
