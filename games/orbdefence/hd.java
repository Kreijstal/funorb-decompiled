/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hd {
    private int field_n;
    int field_s;
    private int[] field_m;
    private int[][] field_a;
    int[] field_d;
    int[] field_i;
    int[] field_r;
    static ba field_q;
    int[] field_l;
    int[][] field_f;
    int field_p;
    private byte[] field_h;
    int[] field_c;
    int field_b;
    af field_o;
    byte[][] field_k;
    static hj field_e;
    static int field_t;
    af[] field_g;
    static String field_j;

    private final void a(int param0, byte[] param1) {
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
        mg var17 = null;
        byte[] var21 = null;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_93_0 = null;
        StringBuilder stackIn_93_1 = null;
        RuntimeException stackIn_94_0 = null;
        StringBuilder stackIn_94_1 = null;
        RuntimeException stackIn_95_0 = null;
        StringBuilder stackIn_95_1 = null;
        String stackIn_95_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_92_0 = null;
        StringBuilder stackOut_92_1 = null;
        RuntimeException stackOut_94_0 = null;
        StringBuilder stackOut_94_1 = null;
        String stackOut_94_2 = null;
        RuntimeException stackOut_93_0 = null;
        StringBuilder stackOut_93_1 = null;
        String stackOut_93_2 = null;
        var16 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var17 = new mg(nf.a(param1, -2));
              var4 = var17.b((byte) 90);
              if (-6 < (var4 ^ -1)) {
                break L1;
              } else {
                if (7 < var4) {
                  break L1;
                } else {
                  L2: {
                    if (6 <= var4) {
                      this.field_b = var17.l(0);
                      break L2;
                    } else {
                      this.field_b = 0;
                      break L2;
                    }
                  }
                  L3: {
                    var5 = var17.b((byte) 90);
                    if (param0 >= 63) {
                      break L3;
                    } else {
                      field_q = (ba) null;
                      break L3;
                    }
                  }
                  L4: {
                    if ((1 & var5) == 0) {
                      stackOut_12_0 = 0;
                      stackIn_13_0 = stackOut_12_0;
                      break L4;
                    } else {
                      stackOut_11_0 = 1;
                      stackIn_13_0 = stackOut_11_0;
                      break L4;
                    }
                  }
                  L5: {
                    var6 = stackIn_13_0;
                    if ((2 & var5) == 0) {
                      stackOut_15_0 = 0;
                      stackIn_16_0 = stackOut_15_0;
                      break L5;
                    } else {
                      stackOut_14_0 = 1;
                      stackIn_16_0 = stackOut_14_0;
                      break L5;
                    }
                  }
                  L6: {
                    var7 = stackIn_16_0;
                    if (var4 >= 7) {
                      this.field_n = var17.d(true);
                      break L6;
                    } else {
                      this.field_n = var17.j(98203176);
                      break L6;
                    }
                  }
                  L7: {
                    var8 = 0;
                    this.field_c = new int[this.field_n];
                    var9 = -1;
                    if (-8 >= (var4 ^ -1)) {
                      var10 = 0;
                      L8: while (true) {
                        if (var10 >= this.field_n) {
                          break L7;
                        } else {
                          dupTemp$7 = var8 + var17.d(true);
                          var8 = dupTemp$7;
                          this.field_c[var10] = dupTemp$7;
                          if (this.field_c[var10] > var9) {
                            var9 = this.field_c[var10];
                            var10++;
                            continue L8;
                          } else {
                            var10++;
                            continue L8;
                          }
                        }
                      }
                    } else {
                      var10 = 0;
                      L9: while (true) {
                        if (var10 >= this.field_n) {
                          break L7;
                        } else {
                          dupTemp$8 = var8 + var17.j(98203176);
                          var8 = dupTemp$8;
                          this.field_c[var10] = dupTemp$8;
                          if (var9 < this.field_c[var10]) {
                            var9 = this.field_c[var10];
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
                    this.field_s = var9 - -1;
                    this.field_l = new int[this.field_s];
                    this.field_i = new int[this.field_s];
                    this.field_r = new int[this.field_s];
                    if (var7 != 0) {
                      this.field_k = new byte[this.field_s][];
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  L11: {
                    this.field_d = new int[this.field_s];
                    this.field_f = new int[this.field_s][];
                    if (var6 == 0) {
                      break L11;
                    } else {
                      this.field_m = new int[this.field_s];
                      var10 = 0;
                      L12: while (true) {
                        if (var10 >= this.field_s) {
                          var10 = 0;
                          L13: while (true) {
                            if (this.field_n <= var10) {
                              this.field_o = new af(this.field_m);
                              break L11;
                            } else {
                              this.field_m[this.field_c[var10]] = var17.l(0);
                              var10++;
                              continue L13;
                            }
                          }
                        } else {
                          this.field_m[var10] = -1;
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
                        if (var7 == 0) {
                          break L15;
                        } else {
                          var10 = 0;
                          L16: while (true) {
                            if (var10 >= this.field_n) {
                              break L15;
                            } else {
                              var21 = new byte[64];
                              var17.a((byte) 115, var21, 0, 64);
                              this.field_k[this.field_c[var10]] = var21;
                              var10++;
                              continue L16;
                            }
                          }
                        }
                      }
                      var10 = 0;
                      L17: while (true) {
                        if (var10 >= this.field_n) {
                          L18: {
                            if (-8 >= (var4 ^ -1)) {
                              var10 = 0;
                              L19: while (true) {
                                if (this.field_n <= var10) {
                                  var10 = 0;
                                  L20: while (true) {
                                    if (this.field_n <= var10) {
                                      break L18;
                                    } else {
                                      var11 = this.field_c[var10];
                                      var8 = 0;
                                      var12 = this.field_d[var11];
                                      array$9 = new int[var12];
                                      this.field_f[var11] = array$9;
                                      var13 = -1;
                                      var14 = 0;
                                      L21: while (true) {
                                        if (var12 <= var14) {
                                          L22: {
                                            this.field_l[var11] = var13 - -1;
                                            if (var12 != var13 - -1) {
                                              break L22;
                                            } else {
                                              this.field_f[var11] = null;
                                              break L22;
                                            }
                                          }
                                          var10++;
                                          continue L20;
                                        } else {
                                          dupTemp$10 = var8 + var17.d(true);
                                          var8 = dupTemp$10;
                                          this.field_f[var11][var14] = dupTemp$10;
                                          var15 = dupTemp$10;
                                          if (var13 < var15) {
                                            var13 = var15;
                                            var14++;
                                            continue L21;
                                          } else {
                                            var14++;
                                            continue L21;
                                          }
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  this.field_d[this.field_c[var10]] = var17.d(true);
                                  var10++;
                                  continue L19;
                                }
                              }
                            } else {
                              var10 = 0;
                              L23: while (true) {
                                if (this.field_n <= var10) {
                                  var10 = 0;
                                  L24: while (true) {
                                    if (this.field_n <= var10) {
                                      break L18;
                                    } else {
                                      var11 = this.field_c[var10];
                                      var8 = 0;
                                      var12 = this.field_d[var11];
                                      array$11 = new int[var12];
                                      this.field_f[var11] = array$11;
                                      var13 = -1;
                                      var14 = 0;
                                      L25: while (true) {
                                        if (var12 <= var14) {
                                          L26: {
                                            this.field_l[var11] = 1 + var13;
                                            if (var13 + 1 != var12) {
                                              break L26;
                                            } else {
                                              this.field_f[var11] = null;
                                              break L26;
                                            }
                                          }
                                          var10++;
                                          continue L24;
                                        } else {
                                          dupTemp$12 = var8 + var17.j(98203176);
                                          var8 = dupTemp$12;
                                          this.field_f[var11][var14] = dupTemp$12;
                                          var15 = dupTemp$12;
                                          if (var13 < var15) {
                                            var13 = var15;
                                            var14++;
                                            continue L25;
                                          } else {
                                            var14++;
                                            continue L25;
                                          }
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  this.field_d[this.field_c[var10]] = var17.j(98203176);
                                  var10++;
                                  continue L23;
                                }
                              }
                            }
                          }
                          L27: {
                            if (var6 == 0) {
                              break L27;
                            } else {
                              this.field_g = new af[1 + var9];
                              this.field_a = new int[var9 + 1][];
                              var10 = 0;
                              L28: while (true) {
                                if (this.field_n <= var10) {
                                  break L27;
                                } else {
                                  var11 = this.field_c[var10];
                                  var12 = this.field_d[var11];
                                  array$13 = new int[this.field_l[var11]];
                                  this.field_a[var11] = array$13;
                                  var13 = 0;
                                  L29: while (true) {
                                    if (this.field_l[var11] <= var13) {
                                      var13 = 0;
                                      L30: while (true) {
                                        if (var13 >= var12) {
                                          this.field_g[var11] = new af(this.field_a[var11]);
                                          var10++;
                                          continue L28;
                                        } else {
                                          L31: {
                                            if (null != this.field_f[var11]) {
                                              var14 = this.field_f[var11][var13];
                                              break L31;
                                            } else {
                                              var14 = var13;
                                              break L31;
                                            }
                                          }
                                          this.field_a[var11][var14] = var17.l(0);
                                          var13++;
                                          continue L30;
                                        }
                                      }
                                    } else {
                                      this.field_a[var11][var13] = -1;
                                      var13++;
                                      continue L29;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          break L0;
                        } else {
                          this.field_i[this.field_c[var10]] = var17.l(0);
                          var10++;
                          continue L17;
                        }
                      }
                    } else {
                      this.field_r[this.field_c[var10]] = var17.l(0);
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
          L32: {
            var3 = decompiledCaughtException;
            stackOut_92_0 = (RuntimeException) (var3);
            stackOut_92_1 = new StringBuilder().append("hd.B(").append(param0).append(',');
            stackIn_94_0 = stackOut_92_0;
            stackIn_94_1 = stackOut_92_1;
            stackIn_93_0 = stackOut_92_0;
            stackIn_93_1 = stackOut_92_1;
            if (param1 == null) {
              stackOut_94_0 = (RuntimeException) ((Object) stackIn_94_0);
              stackOut_94_1 = (StringBuilder) ((Object) stackIn_94_1);
              stackOut_94_2 = "null";
              stackIn_95_0 = stackOut_94_0;
              stackIn_95_1 = stackOut_94_1;
              stackIn_95_2 = stackOut_94_2;
              break L32;
            } else {
              stackOut_93_0 = (RuntimeException) ((Object) stackIn_93_0);
              stackOut_93_1 = (StringBuilder) ((Object) stackIn_93_1);
              stackOut_93_2 = "{...}";
              stackIn_95_0 = stackOut_93_0;
              stackIn_95_1 = stackOut_93_1;
              stackIn_95_2 = stackOut_93_2;
              break L32;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_95_0), stackIn_95_2 + ')');
        }
    }

    public static void a(int param0) {
        field_q = null;
        field_j = null;
        if (param0 != 100) {
            hd.a(33);
        }
        field_e = null;
    }

    hd(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
            this.field_p = eg.a(param0, 0, param0.length);
            if (param1 != this.field_p) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if ((param2.length ^ -1) != -65) {
                    throw new RuntimeException();
                }
                this.field_h = ee.a(-1, param0.length, 0, param0);
                for (var4_int = 0; -65 < (var4_int ^ -1); var4_int++) {
                    if (this.field_h[var4_int] != param2[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            this.a(68, param0);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "hd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_t = 100;
        field_q = new ba(8, 0, 4, 1);
    }
}
