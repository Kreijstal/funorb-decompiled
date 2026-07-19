/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class d {
    ke field_h;
    int[] field_q;
    static boolean field_s;
    byte[][] field_l;
    int[] field_n;
    int[][] field_o;
    static vi field_a;
    private int[][] field_r;
    int field_k;
    int[] field_f;
    ke[] field_p;
    static String field_e;
    int field_b;
    int[] field_i;
    static String field_j;
    static int field_c;
    int field_g;
    private int field_t;
    static kc[] field_u;
    int[] field_d;
    private byte[] field_v;
    private int[] field_m;

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
        pb var17 = null;
        byte[] var21 = null;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        String stackIn_99_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_96_0 = null;
        StringBuilder stackOut_96_1 = null;
        RuntimeException stackOut_98_0 = null;
        StringBuilder stackOut_98_1 = null;
        String stackOut_98_2 = null;
        RuntimeException stackOut_97_0 = null;
        StringBuilder stackOut_97_1 = null;
        String stackOut_97_2 = null;
        var16 = Main.field_T;
        try {
          L0: {
            L1: {
              var17 = new pb(ac.a(-115, param0));
              var4 = var17.f(-125);
              if ((var4 ^ -1) > -6) {
                break L1;
              } else {
                if (-8 > (var4 ^ -1)) {
                  break L1;
                } else {
                  L2: {
                    if (6 > var4) {
                      this.field_k = 0;
                      break L2;
                    } else {
                      this.field_k = var17.e((byte) 125);
                      break L2;
                    }
                  }
                  L3: {
                    var5 = var17.f(param1 + 4328);
                    if (0 == (var5 & 1)) {
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
                      this.field_t = var17.b(false);
                      break L4;
                    } else {
                      this.field_t = var17.d((byte) 72);
                      break L4;
                    }
                  }
                  L5: {
                    if ((var5 & 2) == 0) {
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
                    this.field_d = new int[this.field_t];
                    if (7 <= var4) {
                      var10 = 0;
                      L7: while (true) {
                        if (var10 >= this.field_t) {
                          break L6;
                        } else {
                          L8: {
                            dupTemp$7 = var8 + var17.b(false);
                            var8 = dupTemp$7;
                            this.field_d[var10] = dupTemp$7;
                            if (var9 < this.field_d[var10]) {
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
                        if (var10 >= this.field_t) {
                          break L6;
                        } else {
                          dupTemp$8 = var8 + var17.d((byte) 72);
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
                    this.field_b = 1 + var9;
                    this.field_f = new int[this.field_b];
                    if (var7 != 0) {
                      this.field_l = new byte[this.field_b][];
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  L11: {
                    this.field_o = new int[this.field_b][];
                    this.field_i = new int[this.field_b];
                    this.field_n = new int[this.field_b];
                    this.field_q = new int[this.field_b];
                    if (var6 != 0) {
                      this.field_m = new int[this.field_b];
                      var10 = 0;
                      L12: while (true) {
                        if (this.field_b <= var10) {
                          var10 = 0;
                          L13: while (true) {
                            if (var10 >= this.field_t) {
                              this.field_h = new ke(this.field_m);
                              break L11;
                            } else {
                              this.field_m[this.field_d[var10]] = var17.e((byte) 125);
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
                    } else {
                      break L11;
                    }
                  }
                  var10 = 0;
                  L14: while (true) {
                    if (var10 >= this.field_t) {
                      L15: {
                        if (var7 == 0) {
                          break L15;
                        } else {
                          var10 = 0;
                          L16: while (true) {
                            if (var10 >= this.field_t) {
                              break L15;
                            } else {
                              var21 = new byte[64];
                              var17.a(126, var21, 0, 64);
                              this.field_l[this.field_d[var10]] = var21;
                              var10++;
                              continue L16;
                            }
                          }
                        }
                      }
                      L17: {
                        if (param1 == -4451) {
                          break L17;
                        } else {
                          d.a(false);
                          break L17;
                        }
                      }
                      var10 = 0;
                      L18: while (true) {
                        if (var10 >= this.field_t) {
                          L19: {
                            if (7 > var4) {
                              var10 = 0;
                              L20: while (true) {
                                if (this.field_t <= var10) {
                                  var10 = 0;
                                  L21: while (true) {
                                    if (this.field_t <= var10) {
                                      break L19;
                                    } else {
                                      var11 = this.field_d[var10];
                                      var12 = this.field_q[var11];
                                      var8 = 0;
                                      var13 = -1;
                                      array$9 = new int[var12];
                                      this.field_o[var11] = array$9;
                                      var14 = 0;
                                      L22: while (true) {
                                        if (var12 <= var14) {
                                          L23: {
                                            this.field_f[var11] = var13 - -1;
                                            if (var13 - -1 == var12) {
                                              this.field_o[var11] = null;
                                              break L23;
                                            } else {
                                              break L23;
                                            }
                                          }
                                          var10++;
                                          continue L21;
                                        } else {
                                          dupTemp$10 = var8 + var17.d((byte) 72);
                                          var8 = dupTemp$10;
                                          this.field_o[var11][var14] = dupTemp$10;
                                          var15 = dupTemp$10;
                                          if (var13 < var15) {
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
                                  this.field_q[this.field_d[var10]] = var17.d((byte) 72);
                                  var10++;
                                  continue L20;
                                }
                              }
                            } else {
                              var10 = 0;
                              L24: while (true) {
                                if (var10 >= this.field_t) {
                                  var10 = 0;
                                  L25: while (true) {
                                    if (this.field_t <= var10) {
                                      break L19;
                                    } else {
                                      var11 = this.field_d[var10];
                                      var12 = this.field_q[var11];
                                      var8 = 0;
                                      var13 = -1;
                                      array$11 = new int[var12];
                                      this.field_o[var11] = array$11;
                                      var14 = 0;
                                      L26: while (true) {
                                        if (var14 >= var12) {
                                          L27: {
                                            this.field_f[var11] = 1 + var13;
                                            if (var13 - -1 != var12) {
                                              break L27;
                                            } else {
                                              this.field_o[var11] = null;
                                              break L27;
                                            }
                                          }
                                          var10++;
                                          continue L25;
                                        } else {
                                          dupTemp$12 = var8 + var17.b(false);
                                          var8 = dupTemp$12;
                                          this.field_o[var11][var14] = dupTemp$12;
                                          var15 = dupTemp$12;
                                          if (var15 > var13) {
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
                                  this.field_q[this.field_d[var10]] = var17.b(false);
                                  var10++;
                                  continue L24;
                                }
                              }
                            }
                          }
                          L28: {
                            if (var6 != 0) {
                              this.field_p = new ke[var9 + 1];
                              this.field_r = new int[var9 + 1][];
                              var10 = 0;
                              L29: while (true) {
                                if (this.field_t <= var10) {
                                  break L28;
                                } else {
                                  var11 = this.field_d[var10];
                                  var12 = this.field_q[var11];
                                  array$13 = new int[this.field_f[var11]];
                                  this.field_r[var11] = array$13;
                                  var13 = 0;
                                  L30: while (true) {
                                    if (this.field_f[var11] <= var13) {
                                      var13 = 0;
                                      L31: while (true) {
                                        if (var12 <= var13) {
                                          this.field_p[var11] = new ke(this.field_r[var11]);
                                          var10++;
                                          continue L29;
                                        } else {
                                          L32: {
                                            if (this.field_o[var11] != null) {
                                              var14 = this.field_o[var11][var13];
                                              break L32;
                                            } else {
                                              var14 = var13;
                                              break L32;
                                            }
                                          }
                                          this.field_r[var11][var14] = var17.e((byte) 126);
                                          var13++;
                                          continue L31;
                                        }
                                      }
                                    } else {
                                      this.field_r[var11][var13] = -1;
                                      var13++;
                                      continue L30;
                                    }
                                  }
                                }
                              }
                            } else {
                              break L28;
                            }
                          }
                          break L0;
                        } else {
                          this.field_n[this.field_d[var10]] = var17.e((byte) 125);
                          var10++;
                          continue L18;
                        }
                      }
                    } else {
                      this.field_i[this.field_d[var10]] = var17.e((byte) 127);
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
          L33: {
            var3 = decompiledCaughtException;
            stackOut_96_0 = (RuntimeException) (var3);
            stackOut_96_1 = new StringBuilder().append("d.A(");
            stackIn_98_0 = stackOut_96_0;
            stackIn_98_1 = stackOut_96_1;
            stackIn_97_0 = stackOut_96_0;
            stackIn_97_1 = stackOut_96_1;
            if (param0 == null) {
              stackOut_98_0 = (RuntimeException) ((Object) stackIn_98_0);
              stackOut_98_1 = (StringBuilder) ((Object) stackIn_98_1);
              stackOut_98_2 = "null";
              stackIn_99_0 = stackOut_98_0;
              stackIn_99_1 = stackOut_98_1;
              stackIn_99_2 = stackOut_98_2;
              break L33;
            } else {
              stackOut_97_0 = (RuntimeException) ((Object) stackIn_97_0);
              stackOut_97_1 = (StringBuilder) ((Object) stackIn_97_1);
              stackOut_97_2 = "{...}";
              stackIn_99_0 = stackOut_97_0;
              stackIn_99_1 = stackOut_97_1;
              stackIn_99_2 = stackOut_97_2;
              break L33;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_99_0), stackIn_99_2 + ',' + param1 + ')');
        }
    }

    public static void a(boolean param0) {
        field_j = null;
        field_e = null;
        field_a = null;
        if (!param0) {
            d.a(false);
        }
        field_u = null;
    }

    final static void a(java.awt.Component param0, int param1) {
        try {
            param0.removeMouseListener(wc.field_B);
            param0.removeMouseMotionListener(wc.field_B);
            param0.removeFocusListener(wc.field_B);
            ge.field_a = param1;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "d.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    d(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
            this.field_g = uh.a((byte) 124, param0.length, param0);
            if (this.field_g != param1) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if (64 != param2.length) {
                    throw new RuntimeException();
                }
                this.field_v = ti.a(0, param0, param0.length, 0);
                for (var4_int = 0; var4_int < 64; var4_int++) {
                    if (this.field_v[var4_int] != param2[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            this.a(param0, -4451);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "d.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_s = false;
        field_e = "You are not currently logged in to the<nbsp>game.";
        field_u = new kc[11];
        field_j = "Please enter your age in years";
    }
}
