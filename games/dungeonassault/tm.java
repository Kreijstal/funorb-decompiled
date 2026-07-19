/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tm {
    int[][] field_m;
    ra field_a;
    int[] field_o;
    private int[][] field_d;
    int[] field_i;
    private int[] field_c;
    int[] field_k;
    private byte[] field_r;
    int[] field_q;
    int[] field_j;
    private int field_h;
    static wh field_b;
    int field_s;
    static int field_e;
    static cn field_p;
    ra[] field_n;
    int field_l;
    byte[][] field_g;
    int field_f;

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
        ec var17 = null;
        byte[] var21 = null;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        String stackIn_100_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_97_0 = null;
        StringBuilder stackOut_97_1 = null;
        RuntimeException stackOut_99_0 = null;
        StringBuilder stackOut_99_1 = null;
        String stackOut_99_2 = null;
        RuntimeException stackOut_98_0 = null;
        StringBuilder stackOut_98_1 = null;
        String stackOut_98_2 = null;
        var16 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              var17 = new ec(lc.a(param0, 50166));
              var4 = var17.c(true);
              if (5 > var4) {
                break L1;
              } else {
                if (7 >= var4) {
                  if (param1 > 97) {
                    L2: {
                      if (6 > var4) {
                        this.field_s = 0;
                        break L2;
                      } else {
                        this.field_s = var17.h(-42);
                        break L2;
                      }
                    }
                    L3: {
                      var5 = var17.c(true);
                      if ((1 & var5) == 0) {
                        stackOut_12_0 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        break L3;
                      } else {
                        stackOut_11_0 = 1;
                        stackIn_13_0 = stackOut_11_0;
                        break L3;
                      }
                    }
                    L4: {
                      var6 = stackIn_13_0;
                      if (0 == (var5 & 2)) {
                        stackOut_15_0 = 0;
                        stackIn_16_0 = stackOut_15_0;
                        break L4;
                      } else {
                        stackOut_14_0 = 1;
                        stackIn_16_0 = stackOut_14_0;
                        break L4;
                      }
                    }
                    L5: {
                      var7 = stackIn_16_0;
                      if ((var4 ^ -1) <= -8) {
                        this.field_h = var17.j(1);
                        break L5;
                      } else {
                        this.field_h = var17.k(0);
                        break L5;
                      }
                    }
                    L6: {
                      var8 = 0;
                      var9 = -1;
                      this.field_j = new int[this.field_h];
                      if (7 > var4) {
                        var10 = 0;
                        L7: while (true) {
                          if (this.field_h <= var10) {
                            break L6;
                          } else {
                            dupTemp$7 = var8 + var17.k(0);
                            var8 = dupTemp$7;
                            this.field_j[var10] = dupTemp$7;
                            if (this.field_j[var10] > var9) {
                              var9 = this.field_j[var10];
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
                          if (this.field_h <= var10) {
                            break L6;
                          } else {
                            dupTemp$8 = var8 + var17.j(1);
                            var8 = dupTemp$8;
                            this.field_j[var10] = dupTemp$8;
                            if (var9 < this.field_j[var10]) {
                              var9 = this.field_j[var10];
                              var10++;
                              continue L8;
                            } else {
                              var10++;
                              continue L8;
                            }
                          }
                        }
                      }
                    }
                    L9: {
                      this.field_l = 1 + var9;
                      this.field_m = new int[this.field_l][];
                      if (var7 != 0) {
                        this.field_g = new byte[this.field_l][];
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      this.field_o = new int[this.field_l];
                      this.field_i = new int[this.field_l];
                      this.field_q = new int[this.field_l];
                      this.field_k = new int[this.field_l];
                      if (var6 != 0) {
                        this.field_c = new int[this.field_l];
                        var10 = 0;
                        L11: while (true) {
                          if (var10 >= this.field_l) {
                            var10 = 0;
                            L12: while (true) {
                              if (this.field_h <= var10) {
                                this.field_a = new ra(this.field_c);
                                break L10;
                              } else {
                                this.field_c[this.field_j[var10]] = var17.h(-50);
                                var10++;
                                continue L12;
                              }
                            }
                          } else {
                            this.field_c[var10] = -1;
                            var10++;
                            continue L11;
                          }
                        }
                      } else {
                        break L10;
                      }
                    }
                    var10 = 0;
                    L13: while (true) {
                      if (this.field_h <= var10) {
                        L14: {
                          if (var7 == 0) {
                            break L14;
                          } else {
                            var10 = 0;
                            L15: while (true) {
                              if (this.field_h <= var10) {
                                break L14;
                              } else {
                                var21 = new byte[64];
                                var17.a((byte) -124, 0, 64, var21);
                                this.field_g[this.field_j[var10]] = var21;
                                var10++;
                                continue L15;
                              }
                            }
                          }
                        }
                        var10 = 0;
                        L16: while (true) {
                          if (var10 >= this.field_h) {
                            L17: {
                              if (var4 >= 7) {
                                var10 = 0;
                                L18: while (true) {
                                  if (var10 >= this.field_h) {
                                    var10 = 0;
                                    L19: while (true) {
                                      if (var10 >= this.field_h) {
                                        break L17;
                                      } else {
                                        var11 = this.field_j[var10];
                                        var8 = 0;
                                        var12 = this.field_k[var11];
                                        var13 = -1;
                                        array$9 = new int[var12];
                                        this.field_m[var11] = array$9;
                                        var14 = 0;
                                        L20: while (true) {
                                          if (var12 <= var14) {
                                            L21: {
                                              this.field_i[var11] = 1 + var13;
                                              if (var12 == 1 + var13) {
                                                this.field_m[var11] = null;
                                                break L21;
                                              } else {
                                                break L21;
                                              }
                                            }
                                            var10++;
                                            continue L19;
                                          } else {
                                            L22: {
                                              dupTemp$10 = var8 + var17.j(1);
                                              var8 = dupTemp$10;
                                              this.field_m[var11][var14] = dupTemp$10;
                                              var15 = dupTemp$10;
                                              if (var13 < var15) {
                                                var13 = var15;
                                                break L22;
                                              } else {
                                                break L22;
                                              }
                                            }
                                            var14++;
                                            continue L20;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    this.field_k[this.field_j[var10]] = var17.j(1);
                                    var10++;
                                    continue L18;
                                  }
                                }
                              } else {
                                var10 = 0;
                                L23: while (true) {
                                  if (var10 >= this.field_h) {
                                    var10 = 0;
                                    L24: while (true) {
                                      if (this.field_h <= var10) {
                                        break L17;
                                      } else {
                                        var11 = this.field_j[var10];
                                        var8 = 0;
                                        var12 = this.field_k[var11];
                                        array$11 = new int[var12];
                                        this.field_m[var11] = array$11;
                                        var13 = -1;
                                        var14 = 0;
                                        L25: while (true) {
                                          if (var12 <= var14) {
                                            L26: {
                                              this.field_i[var11] = 1 + var13;
                                              if (var12 == 1 + var13) {
                                                this.field_m[var11] = null;
                                                break L26;
                                              } else {
                                                break L26;
                                              }
                                            }
                                            var10++;
                                            continue L24;
                                          } else {
                                            L27: {
                                              dupTemp$12 = var8 + var17.k(0);
                                              var8 = dupTemp$12;
                                              this.field_m[var11][var14] = dupTemp$12;
                                              var15 = dupTemp$12;
                                              if (var13 < var15) {
                                                var13 = var15;
                                                break L27;
                                              } else {
                                                break L27;
                                              }
                                            }
                                            var14++;
                                            continue L25;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    this.field_k[this.field_j[var10]] = var17.k(0);
                                    var10++;
                                    continue L23;
                                  }
                                }
                              }
                            }
                            L28: {
                              if (var6 == 0) {
                                break L28;
                              } else {
                                this.field_d = new int[1 + var9][];
                                this.field_n = new ra[var9 + 1];
                                var10 = 0;
                                L29: while (true) {
                                  if (var10 >= this.field_h) {
                                    break L28;
                                  } else {
                                    var11 = this.field_j[var10];
                                    var12 = this.field_k[var11];
                                    array$13 = new int[this.field_i[var11]];
                                    this.field_d[var11] = array$13;
                                    var13 = 0;
                                    L30: while (true) {
                                      if (this.field_i[var11] <= var13) {
                                        var13 = 0;
                                        L31: while (true) {
                                          if (var13 >= var12) {
                                            this.field_n[var11] = new ra(this.field_d[var11]);
                                            var10++;
                                            continue L29;
                                          } else {
                                            L32: {
                                              if (this.field_m[var11] != null) {
                                                var14 = this.field_m[var11][var13];
                                                break L32;
                                              } else {
                                                var14 = var13;
                                                break L32;
                                              }
                                            }
                                            this.field_d[var11][var14] = var17.h(-81);
                                            var13++;
                                            continue L31;
                                          }
                                        }
                                      } else {
                                        this.field_d[var11][var13] = -1;
                                        var13++;
                                        continue L30;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            this.field_o[this.field_j[var10]] = var17.h(-100);
                            var10++;
                            continue L16;
                          }
                        }
                      } else {
                        this.field_q[this.field_j[var10]] = var17.h(-77);
                        var10++;
                        continue L13;
                      }
                    }
                  } else {
                    decompiledRegionSelector0 = 0;
                    break L0;
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
          L33: {
            var3 = decompiledCaughtException;
            stackOut_97_0 = (RuntimeException) (var3);
            stackOut_97_1 = new StringBuilder().append("tm.A(");
            stackIn_99_0 = stackOut_97_0;
            stackIn_99_1 = stackOut_97_1;
            stackIn_98_0 = stackOut_97_0;
            stackIn_98_1 = stackOut_97_1;
            if (param0 == null) {
              stackOut_99_0 = (RuntimeException) ((Object) stackIn_99_0);
              stackOut_99_1 = (StringBuilder) ((Object) stackIn_99_1);
              stackOut_99_2 = "null";
              stackIn_100_0 = stackOut_99_0;
              stackIn_100_1 = stackOut_99_1;
              stackIn_100_2 = stackOut_99_2;
              break L33;
            } else {
              stackOut_98_0 = (RuntimeException) ((Object) stackIn_98_0);
              stackOut_98_1 = (StringBuilder) ((Object) stackIn_98_1);
              stackOut_98_2 = "{...}";
              stackIn_100_0 = stackOut_98_0;
              stackIn_100_1 = stackOut_98_1;
              stackIn_100_2 = stackOut_98_2;
              break L33;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_100_0), stackIn_100_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_p = null;
        field_b = null;
        int var1 = 32 / ((param0 - 5) / 55);
    }

    tm(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
            this.field_f = qh.a(16777215, param0, param0.length);
            if (param1 != this.field_f) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if (param2.length != 64) {
                    throw new RuntimeException();
                }
                this.field_r = rn.a(param0.length, 0, 8, param0);
                for (var4_int = 0; (var4_int ^ -1) > -65; var4_int++) {
                    if (param2[var4_int] != this.field_r[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            this.a(param0, (byte) 118);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "tm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
