/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rf {
    private int[] field_g;
    int[] field_u;
    int[] field_r;
    static int field_l;
    int[] field_n;
    int field_i;
    byte[][] field_o;
    static int[] field_c;
    int field_t;
    static int[] field_e;
    static String field_q;
    private byte[] field_b;
    private int[][] field_m;
    int field_p;
    static int field_a;
    int[][] field_h;
    int[] field_v;
    private int field_s;
    fl[] field_k;
    static int field_d;
    fl field_j;
    int[] field_f;

    public static void a(byte param0) {
        field_c = null;
        field_e = null;
        if (param0 < 115) {
            field_c = (int[]) null;
        }
        field_q = null;
    }

    private final void a(byte[] param0, int param1) {
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
        ni var17 = null;
        byte[] var21 = null;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        String stackIn_98_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_95_0 = null;
        StringBuilder stackOut_95_1 = null;
        RuntimeException stackOut_97_0 = null;
        StringBuilder stackOut_97_1 = null;
        String stackOut_97_2 = null;
        RuntimeException stackOut_96_0 = null;
        StringBuilder stackOut_96_1 = null;
        String stackOut_96_2 = null;
        var16 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var17 = new ni(qi.a(param0, -22518));
              var4 = var17.e(false);
              if ((var4 ^ -1) > -6) {
                break L1;
              } else {
                if (var4 > 7) {
                  break L1;
                } else {
                  L2: {
                    if ((var4 ^ -1) <= -7) {
                      this.field_t = var17.c((byte) 126);
                      break L2;
                    } else {
                      this.field_t = 0;
                      break L2;
                    }
                  }
                  L3: {
                    var5 = var17.e(false);
                    if (-1 == (var5 & 1 ^ -1)) {
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
                      this.field_s = var17.e((byte) 120);
                      break L5;
                    } else {
                      this.field_s = var17.d((byte) -79);
                      break L5;
                    }
                  }
                  L6: {
                    var8 = 0;
                    var9 = -1;
                    this.field_r = new int[this.field_s];
                    if (var4 < 7) {
                      var10 = 0;
                      L7: while (true) {
                        if (this.field_s <= var10) {
                          break L6;
                        } else {
                          dupTemp$7 = var8 + var17.d((byte) -62);
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
                        if (var10 >= this.field_s) {
                          break L6;
                        } else {
                          dupTemp$8 = var8 + var17.e((byte) 63);
                          var8 = dupTemp$8;
                          this.field_r[var10] = dupTemp$8;
                          if (var9 < this.field_r[var10]) {
                            var9 = this.field_r[var10];
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
                    this.field_i = 1 + var9;
                    this.field_h = new int[this.field_i][];
                    this.field_n = new int[this.field_i];
                    this.field_u = new int[this.field_i];
                    this.field_v = new int[this.field_i];
                    this.field_f = new int[this.field_i];
                    if (var7 != 0) {
                      this.field_o = new byte[this.field_i][];
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if (var6 != 0) {
                      this.field_g = new int[this.field_i];
                      var10 = 0;
                      L11: while (true) {
                        if (var10 >= this.field_i) {
                          var10 = 0;
                          L12: while (true) {
                            if (var10 >= this.field_s) {
                              this.field_j = new fl(this.field_g);
                              break L10;
                            } else {
                              this.field_g[this.field_r[var10]] = var17.c((byte) -82);
                              var10++;
                              continue L12;
                            }
                          }
                        } else {
                          this.field_g[var10] = -1;
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
                    if (var10 >= this.field_s) {
                      L14: {
                        if (var7 == 0) {
                          break L14;
                        } else {
                          var10 = 0;
                          L15: while (true) {
                            if (var10 >= this.field_s) {
                              break L14;
                            } else {
                              var21 = new byte[64];
                              var17.b(var21, 0, -58, 64);
                              this.field_o[this.field_r[var10]] = var21;
                              var10++;
                              continue L15;
                            }
                          }
                        }
                      }
                      var10 = 0;
                      L16: while (true) {
                        if (this.field_s <= var10) {
                          L17: {
                            if (param1 == 19083) {
                              break L17;
                            } else {
                              rf.a((byte) -112);
                              break L17;
                            }
                          }
                          L18: {
                            if ((var4 ^ -1) <= -8) {
                              var10 = 0;
                              L19: while (true) {
                                if (var10 >= this.field_s) {
                                  var10 = 0;
                                  L20: while (true) {
                                    if (var10 >= this.field_s) {
                                      break L18;
                                    } else {
                                      var11 = this.field_r[var10];
                                      var12 = this.field_f[var11];
                                      var8 = 0;
                                      var13 = -1;
                                      array$9 = new int[var12];
                                      this.field_h[var11] = array$9;
                                      var14 = 0;
                                      L21: while (true) {
                                        if (var14 >= var12) {
                                          L22: {
                                            this.field_v[var11] = 1 + var13;
                                            if (var12 == 1 + var13) {
                                              this.field_h[var11] = null;
                                              break L22;
                                            } else {
                                              break L22;
                                            }
                                          }
                                          var10++;
                                          continue L20;
                                        } else {
                                          L23: {
                                            dupTemp$10 = var8 + var17.e((byte) 111);
                                            var8 = dupTemp$10;
                                            this.field_h[var11][var14] = dupTemp$10;
                                            var15 = dupTemp$10;
                                            if (var15 > var13) {
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
                                  this.field_f[this.field_r[var10]] = var17.e((byte) 86);
                                  var10++;
                                  continue L19;
                                }
                              }
                            } else {
                              var10 = 0;
                              L24: while (true) {
                                if (var10 >= this.field_s) {
                                  var10 = 0;
                                  L25: while (true) {
                                    if (var10 >= this.field_s) {
                                      break L18;
                                    } else {
                                      var11 = this.field_r[var10];
                                      var8 = 0;
                                      var12 = this.field_f[var11];
                                      array$11 = new int[var12];
                                      this.field_h[var11] = array$11;
                                      var13 = -1;
                                      var14 = 0;
                                      L26: while (true) {
                                        if (var14 >= var12) {
                                          L27: {
                                            this.field_v[var11] = var13 - -1;
                                            if (var12 != var13 - -1) {
                                              break L27;
                                            } else {
                                              this.field_h[var11] = null;
                                              break L27;
                                            }
                                          }
                                          var10++;
                                          continue L25;
                                        } else {
                                          dupTemp$12 = var8 + var17.d((byte) 122);
                                          var8 = dupTemp$12;
                                          this.field_h[var11][var14] = dupTemp$12;
                                          var15 = dupTemp$12;
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
                                  this.field_f[this.field_r[var10]] = var17.d((byte) 113);
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
                              this.field_m = new int[var9 + 1][];
                              this.field_k = new fl[1 + var9];
                              var10 = 0;
                              L29: while (true) {
                                if (this.field_s <= var10) {
                                  break L28;
                                } else {
                                  var11 = this.field_r[var10];
                                  var12 = this.field_f[var11];
                                  array$13 = new int[this.field_v[var11]];
                                  this.field_m[var11] = array$13;
                                  var13 = 0;
                                  L30: while (true) {
                                    if (this.field_v[var11] <= var13) {
                                      var13 = 0;
                                      L31: while (true) {
                                        if (var12 <= var13) {
                                          this.field_k[var11] = new fl(this.field_m[var11]);
                                          var10++;
                                          continue L29;
                                        } else {
                                          L32: {
                                            if (this.field_h[var11] != null) {
                                              var14 = this.field_h[var11][var13];
                                              break L32;
                                            } else {
                                              var14 = var13;
                                              break L32;
                                            }
                                          }
                                          this.field_m[var11][var14] = var17.c((byte) 124);
                                          var13++;
                                          continue L31;
                                        }
                                      }
                                    } else {
                                      this.field_m[var11][var13] = -1;
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
                          this.field_n[this.field_r[var10]] = var17.c((byte) -1);
                          var10++;
                          continue L16;
                        }
                      }
                    } else {
                      this.field_u[this.field_r[var10]] = var17.c((byte) 125);
                      var10++;
                      continue L13;
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
            stackOut_95_0 = (RuntimeException) (var3);
            stackOut_95_1 = new StringBuilder().append("rf.B(");
            stackIn_97_0 = stackOut_95_0;
            stackIn_97_1 = stackOut_95_1;
            stackIn_96_0 = stackOut_95_0;
            stackIn_96_1 = stackOut_95_1;
            if (param0 == null) {
              stackOut_97_0 = (RuntimeException) ((Object) stackIn_97_0);
              stackOut_97_1 = (StringBuilder) ((Object) stackIn_97_1);
              stackOut_97_2 = "null";
              stackIn_98_0 = stackOut_97_0;
              stackIn_98_1 = stackOut_97_1;
              stackIn_98_2 = stackOut_97_2;
              break L33;
            } else {
              stackOut_96_0 = (RuntimeException) ((Object) stackIn_96_0);
              stackOut_96_1 = (StringBuilder) ((Object) stackIn_96_1);
              stackOut_96_2 = "{...}";
              stackIn_98_0 = stackOut_96_0;
              stackIn_98_1 = stackOut_96_1;
              stackIn_98_2 = stackOut_96_2;
              break L33;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_98_0), stackIn_98_2 + ',' + param1 + ')');
        }
    }

    rf(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
            this.field_p = ia.a(true, param0, param0.length);
            if (this.field_p != param1) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if (-65 != (param2.length ^ -1)) {
                    throw new RuntimeException();
                }
                this.field_b = kb.a(param0, param0.length, (byte) 111, 0);
                for (var4_int = 0; var4_int < 64; var4_int++) {
                    if (this.field_b[var4_int] != param2[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            this.a(param0, 19083);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "rf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = new int[40];
        field_q = "Unfortunately we are unable to create an account for you at this time.";
        field_a = -1;
        field_c = new int[]{1, 2, 3, 10, 2, 1, 1, 2, 3, 3, 2, 2, 2, 3, 5, 10};
        field_d = 5;
    }
}
