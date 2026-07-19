/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kh {
    int[] field_l;
    byte[][] field_q;
    private int[] field_u;
    int field_m;
    static int field_c;
    qf field_s;
    static int[] field_i;
    int[] field_k;
    qf[] field_b;
    int[] field_r;
    private byte[] field_g;
    int[] field_d;
    int field_t;
    static String field_o;
    static he field_e;
    private int field_n;
    private int[][] field_a;
    int[] field_j;
    int field_p;
    int[][] field_f;
    static cd field_h;

    private final void a(boolean param0, byte[] param1) {
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
        od var17 = null;
        byte[] var21 = null;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
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
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_98_0 = null;
        StringBuilder stackOut_98_1 = null;
        RuntimeException stackOut_100_0 = null;
        StringBuilder stackOut_100_1 = null;
        String stackOut_100_2 = null;
        RuntimeException stackOut_99_0 = null;
        StringBuilder stackOut_99_1 = null;
        String stackOut_99_2 = null;
        var16 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var17 = new od(ce.a(1, param1));
              var4 = var17.l(31760);
              if ((var4 ^ -1) > -6) {
                break L1;
              } else {
                if ((var4 ^ -1) < -8) {
                  break L1;
                } else {
                  L2: {
                    if (var4 >= 6) {
                      this.field_t = var17.h(101);
                      break L2;
                    } else {
                      this.field_t = 0;
                      break L2;
                    }
                  }
                  L3: {
                    var5 = var17.l(31760);
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
                    if ((var5 & 2) == 0) {
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
                    if ((var4 ^ -1) <= -8) {
                      this.field_n = var17.a(true);
                      break L5;
                    } else {
                      this.field_n = var17.j(-788751192);
                      break L5;
                    }
                  }
                  L6: {
                    var8 = 0;
                    this.field_r = new int[this.field_n];
                    var9 = -1;
                    if ((var4 ^ -1) <= -8) {
                      var10 = 0;
                      L7: while (true) {
                        if (this.field_n <= var10) {
                          break L6;
                        } else {
                          dupTemp$7 = var8 + var17.a(true);
                          var8 = dupTemp$7;
                          this.field_r[var10] = dupTemp$7;
                          if (this.field_r[var10] > var9) {
                            var9 = this.field_r[var10];
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
                        if (this.field_n <= var10) {
                          break L6;
                        } else {
                          L9: {
                            dupTemp$8 = var8 + var17.j(-788751192);
                            var8 = dupTemp$8;
                            this.field_r[var10] = dupTemp$8;
                            if (this.field_r[var10] > var9) {
                              var9 = this.field_r[var10];
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
                    this.field_m = 1 + var9;
                    if (var7 == 0) {
                      break L10;
                    } else {
                      this.field_q = new byte[this.field_m][];
                      break L10;
                    }
                  }
                  L11: {
                    this.field_k = new int[this.field_m];
                    this.field_l = new int[this.field_m];
                    this.field_j = new int[this.field_m];
                    this.field_f = new int[this.field_m][];
                    this.field_d = new int[this.field_m];
                    if (var6 == 0) {
                      break L11;
                    } else {
                      this.field_u = new int[this.field_m];
                      var10 = 0;
                      L12: while (true) {
                        if (this.field_m <= var10) {
                          var10 = 0;
                          L13: while (true) {
                            if (var10 >= this.field_n) {
                              this.field_s = new qf(this.field_u);
                              break L11;
                            } else {
                              this.field_u[this.field_r[var10]] = var17.h(124);
                              var10++;
                              continue L13;
                            }
                          }
                        } else {
                          this.field_u[var10] = -1;
                          var10++;
                          continue L12;
                        }
                      }
                    }
                  }
                  var10 = 0;
                  L14: while (true) {
                    if (var10 >= this.field_n) {
                      L15: {
                        if (var7 != 0) {
                          var10 = 0;
                          L16: while (true) {
                            if (var10 >= this.field_n) {
                              L17: {
                                var10 = 0;
                                if (param0) {
                                  break L17;
                                } else {
                                  this.field_g = (byte[]) null;
                                  break L17;
                                }
                              }
                              L18: while (true) {
                                if (var10 >= this.field_n) {
                                  break L15;
                                } else {
                                  this.field_l[this.field_r[var10]] = var17.h(109);
                                  var10++;
                                  continue L18;
                                }
                              }
                            } else {
                              var21 = new byte[64];
                              var17.b(0, 64, 128, var21);
                              this.field_q[this.field_r[var10]] = var21;
                              var10++;
                              continue L16;
                            }
                          }
                        } else {
                          L19: {
                            var10 = 0;
                            if (param0) {
                              break L19;
                            } else {
                              this.field_g = (byte[]) null;
                              break L19;
                            }
                          }
                          L20: while (true) {
                            if (var10 >= this.field_n) {
                              break L15;
                            } else {
                              this.field_l[this.field_r[var10]] = var17.h(109);
                              var10++;
                              continue L20;
                            }
                          }
                        }
                      }
                      L21: {
                        if (-8 < (var4 ^ -1)) {
                          var10 = 0;
                          L22: while (true) {
                            if (var10 >= this.field_n) {
                              var10 = 0;
                              L23: while (true) {
                                if (this.field_n <= var10) {
                                  break L21;
                                } else {
                                  var11 = this.field_r[var10];
                                  var8 = 0;
                                  var12 = this.field_k[var11];
                                  var13 = -1;
                                  array$9 = new int[var12];
                                  this.field_f[var11] = array$9;
                                  var14 = 0;
                                  L24: while (true) {
                                    if (var12 <= var14) {
                                      L25: {
                                        this.field_d[var11] = 1 + var13;
                                        if (var12 != 1 + var13) {
                                          break L25;
                                        } else {
                                          this.field_f[var11] = null;
                                          break L25;
                                        }
                                      }
                                      var10++;
                                      continue L23;
                                    } else {
                                      L26: {
                                        dupTemp$10 = var8 + var17.j(-788751192);
                                        var8 = dupTemp$10;
                                        this.field_f[var11][var14] = dupTemp$10;
                                        var15 = dupTemp$10;
                                        if (var13 < var15) {
                                          var13 = var15;
                                          break L26;
                                        } else {
                                          break L26;
                                        }
                                      }
                                      var14++;
                                      continue L24;
                                    }
                                  }
                                }
                              }
                            } else {
                              this.field_k[this.field_r[var10]] = var17.j(-788751192);
                              var10++;
                              continue L22;
                            }
                          }
                        } else {
                          var10 = 0;
                          L27: while (true) {
                            if (var10 >= this.field_n) {
                              var10 = 0;
                              L28: while (true) {
                                if (this.field_n <= var10) {
                                  break L21;
                                } else {
                                  var11 = this.field_r[var10];
                                  var12 = this.field_k[var11];
                                  var8 = 0;
                                  var13 = -1;
                                  array$11 = new int[var12];
                                  this.field_f[var11] = array$11;
                                  var14 = 0;
                                  L29: while (true) {
                                    if (var14 >= var12) {
                                      L30: {
                                        this.field_d[var11] = var13 - -1;
                                        if (var13 - -1 != var12) {
                                          break L30;
                                        } else {
                                          this.field_f[var11] = null;
                                          break L30;
                                        }
                                      }
                                      var10++;
                                      continue L28;
                                    } else {
                                      L31: {
                                        dupTemp$12 = var8 + var17.a(true);
                                        var8 = dupTemp$12;
                                        this.field_f[var11][var14] = dupTemp$12;
                                        var15 = dupTemp$12;
                                        if (var13 < var15) {
                                          var13 = var15;
                                          break L31;
                                        } else {
                                          break L31;
                                        }
                                      }
                                      var14++;
                                      continue L29;
                                    }
                                  }
                                }
                              }
                            } else {
                              this.field_k[this.field_r[var10]] = var17.a(true);
                              var10++;
                              continue L27;
                            }
                          }
                        }
                      }
                      L32: {
                        if (var6 != 0) {
                          this.field_a = new int[1 + var9][];
                          this.field_b = new qf[1 + var9];
                          var10 = 0;
                          L33: while (true) {
                            if (var10 >= this.field_n) {
                              break L32;
                            } else {
                              var11 = this.field_r[var10];
                              var12 = this.field_k[var11];
                              array$13 = new int[this.field_d[var11]];
                              this.field_a[var11] = array$13;
                              var13 = 0;
                              L34: while (true) {
                                if (var13 >= this.field_d[var11]) {
                                  var13 = 0;
                                  L35: while (true) {
                                    if (var13 >= var12) {
                                      this.field_b[var11] = new qf(this.field_a[var11]);
                                      var10++;
                                      continue L33;
                                    } else {
                                      L36: {
                                        if (this.field_f[var11] != null) {
                                          var14 = this.field_f[var11][var13];
                                          break L36;
                                        } else {
                                          var14 = var13;
                                          break L36;
                                        }
                                      }
                                      this.field_a[var11][var14] = var17.h(-118);
                                      var13++;
                                      continue L35;
                                    }
                                  }
                                } else {
                                  this.field_a[var11][var13] = -1;
                                  var13++;
                                  continue L34;
                                }
                              }
                            }
                          }
                        } else {
                          break L32;
                        }
                      }
                      break L0;
                    } else {
                      this.field_j[this.field_r[var10]] = var17.h(123);
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
          L37: {
            var3 = decompiledCaughtException;
            stackOut_98_0 = (RuntimeException) (var3);
            stackOut_98_1 = new StringBuilder().append("kh.C(").append(param0).append(',');
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
              break L37;
            } else {
              stackOut_99_0 = (RuntimeException) ((Object) stackIn_99_0);
              stackOut_99_1 = (StringBuilder) ((Object) stackIn_99_1);
              stackOut_99_2 = "{...}";
              stackIn_101_0 = stackOut_99_0;
              stackIn_101_1 = stackOut_99_1;
              stackIn_101_2 = stackOut_99_2;
              break L37;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_101_0), stackIn_101_2 + ')');
        }
    }

    final static boolean a(boolean param0) {
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        L0: {
          if (!param0) {
            break L0;
          } else {
            kh.a((byte) -124);
            break L0;
          }
        }
        L1: {
          L2: {
            if (hj.field_f < 20) {
              break L2;
            } else {
              if (!bj.a(13)) {
                break L2;
              } else {
                L3: {
                  if (rh.field_a <= 0) {
                    break L3;
                  } else {
                    L4: {
                      if (param0) {
                        stackOut_7_0 = 0;
                        stackIn_8_0 = stackOut_7_0;
                        break L4;
                      } else {
                        stackOut_6_0 = 1;
                        stackIn_8_0 = stackOut_6_0;
                        break L4;
                      }
                    }
                    if (hc.a(stackIn_8_0 != 0)) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                break L1;
              }
            }
          }
          stackOut_9_0 = 1;
          stackIn_11_0 = stackOut_9_0;
          break L1;
        }
        return stackIn_11_0 != 0;
    }

    public static void a(byte param0) {
        if (param0 >= -41) {
            kh.a((byte) 93);
        }
        field_e = null;
        field_h = null;
        field_i = null;
        field_o = null;
    }

    kh(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
            this.field_p = th.a(param0, (byte) 127, param0.length);
            if (this.field_p != param1) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if (64 != param2.length) {
                    throw new RuntimeException();
                }
                this.field_g = b.a(0, 44, param0, param0.length);
                for (var4_int = 0; var4_int < 64; var4_int++) {
                    if (param2[var4_int] != this.field_g[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            this.a(true, param0);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "kh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = 1;
        field_o = "Building survival bonus (";
        field_h = new cd();
    }
}
