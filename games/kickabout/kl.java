/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kl {
    int field_g;
    int[] field_i;
    lf field_q;
    static boolean field_t;
    byte[][] field_k;
    private byte[] field_o;
    private int[] field_l;
    int field_d;
    int field_p;
    static wn field_a;
    int[] field_e;
    static ot field_m;
    static kh field_h;
    int[] field_b;
    int[] field_c;
    int[][] field_r;
    int[] field_f;
    private int field_n;
    private int[][] field_j;
    lf[] field_s;

    final static boolean b(int param0) {
        int stackIn_9_0 = 0;
        if (param0 == 640) {
          L0: {
            L1: {
              if (-1 < (wt.field_x ^ -1)) {
                break L1;
              } else {
                if (640 <= wt.field_x) {
                  break L1;
                } else {
                  if (-1 < (us.field_j ^ -1)) {
                    break L1;
                  } else {
                    if (g.field_a.field_T >= us.field_j) {
                      stackIn_9_0 = 0;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            stackIn_9_0 = 1;
            break L0;
          }
          return stackIn_9_0 != 0;
        } else {
          return false;
        }
    }

    public static void a(int param0) {
        field_h = null;
        field_a = null;
        if (param0 != 0) {
            return;
        }
        field_m = null;
    }

    final static void c(int param0) {
        int fieldTemp$0 = va.field_J + 1;
        va.field_J = va.field_J + 1;
        if (32 <= fieldTemp$0) {
            va.field_J = 0;
        }
        int var1 = -125 / ((param0 - 27) / 54);
    }

    private final void a(int param0, byte[] param1) {
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
        int stackIn_17_0 = 0;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        String stackIn_99_2 = null;
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
        iw var18 = null;
        byte[] var22 = null;
        var17 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              var18 = new iw(hh.a(param1, (byte) -3));
              var4 = var18.h((byte) -107);
              if (5 > var4) {
                break L1;
              } else {
                if (-8 > (var4 ^ -1)) {
                  break L1;
                } else {
                  L2: {
                    if ((var4 ^ -1) > -7) {
                      this.field_p = 0;
                      break L2;
                    } else {
                      this.field_p = var18.k(4);
                      break L2;
                    }
                  }
                  L3: {
                    var5 = var18.h((byte) -116);
                    if (-1 == (1 & var5 ^ -1)) {
                      stackIn_11_0 = 0;
                      break L3;
                    } else {
                      stackIn_11_0 = 1;
                      break L3;
                    }
                  }
                  L4: {
                    var6 = stackIn_11_0;
                    if (-8 >= (var4 ^ -1)) {
                      this.field_n = var18.f((byte) 117);
                      break L4;
                    } else {
                      this.field_n = var18.a((byte) 81);
                      break L4;
                    }
                  }
                  L5: {
                    if ((2 & var5) == 0) {
                      stackIn_17_0 = 0;
                      break L5;
                    } else {
                      stackIn_17_0 = 1;
                      break L5;
                    }
                  }
                  L6: {
                    var7 = stackIn_17_0;
                    var8 = 0;
                    var9 = -1;
                    this.field_b = new int[this.field_n];
                    if (var4 < 7) {
                      var10 = 0;
                      L7: while (true) {
                        if (this.field_n <= var10) {
                          break L6;
                        } else {
                          dupTemp$0 = var8 + var18.a((byte) 81);
                          var8 = dupTemp$0;
                          this.field_b[var10] = dupTemp$0;
                          if ((this.field_b[var10] ^ -1) < (var9 ^ -1)) {
                            var9 = this.field_b[var10];
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
                          dupTemp$1 = var8 + var18.f((byte) -27);
                          var8 = dupTemp$1;
                          this.field_b[var10] = dupTemp$1;
                          if ((this.field_b[var10] ^ -1) < (var9 ^ -1)) {
                            var9 = this.field_b[var10];
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
                    this.field_d = var9 - -1;
                    if (var7 == 0) {
                      break L9;
                    } else {
                      this.field_k = new byte[this.field_d][];
                      break L9;
                    }
                  }
                  L10: {
                    this.field_r = new int[this.field_d][];
                    this.field_i = new int[this.field_d];
                    this.field_c = new int[this.field_d];
                    this.field_e = new int[this.field_d];
                    var10 = 48 / ((param0 - -40) / 37);
                    this.field_f = new int[this.field_d];
                    if (var6 != 0) {
                      this.field_l = new int[this.field_d];
                      var11 = 0;
                      L11: while (true) {
                        if (this.field_d <= var11) {
                          var11 = 0;
                          L12: while (true) {
                            if (var11 >= this.field_n) {
                              this.field_q = new lf(this.field_l);
                              break L10;
                            } else {
                              this.field_l[this.field_b[var11]] = var18.k(4);
                              var11++;
                              continue L12;
                            }
                          }
                        } else {
                          this.field_l[var11] = -1;
                          var11++;
                          continue L11;
                        }
                      }
                    } else {
                      break L10;
                    }
                  }
                  var11 = 0;
                  L13: while (true) {
                    if (var11 >= this.field_n) {
                      L14: {
                        if (var7 != 0) {
                          var11 = 0;
                          L15: while (true) {
                            if (var11 >= this.field_n) {
                              var11 = 0;
                              L16: while (true) {
                                if (var11 >= this.field_n) {
                                  break L14;
                                } else {
                                  this.field_f[this.field_b[var11]] = var18.k(4);
                                  var11++;
                                  continue L16;
                                }
                              }
                            } else {
                              var22 = new byte[64];
                              var18.a(var22, 0, (byte) -6, 64);
                              this.field_k[this.field_b[var11]] = var22;
                              var11++;
                              continue L15;
                            }
                          }
                        } else {
                          var11 = 0;
                          L17: while (true) {
                            if (var11 >= this.field_n) {
                              break L14;
                            } else {
                              this.field_f[this.field_b[var11]] = var18.k(4);
                              var11++;
                              continue L17;
                            }
                          }
                        }
                      }
                      L18: {
                        if (-8 >= (var4 ^ -1)) {
                          var11 = 0;
                          L19: while (true) {
                            if (this.field_n <= var11) {
                              var11 = 0;
                              L20: while (true) {
                                if (var11 >= this.field_n) {
                                  break L18;
                                } else {
                                  var12 = this.field_b[var11];
                                  var8 = 0;
                                  var13 = this.field_i[var12];
                                  array$2 = new int[var13];
                                  this.field_r[var12] = array$2;
                                  var14 = -1;
                                  var15 = 0;
                                  L21: while (true) {
                                    if (var15 >= var13) {
                                      L22: {
                                        this.field_e[var12] = var14 - -1;
                                        if (var14 - -1 != var13) {
                                          break L22;
                                        } else {
                                          this.field_r[var12] = null;
                                          break L22;
                                        }
                                      }
                                      var11++;
                                      continue L20;
                                    } else {
                                      L23: {
                                        dupTemp$3 = var8 + var18.f((byte) -96);
                                        var8 = dupTemp$3;
                                        dupTemp$4 = this.field_r[var12];
                                        dupTemp$4[var15] = dupTemp$3;
                                        var16 = dupTemp$3;
                                        if (var14 < var16) {
                                          var14 = var16;
                                          break L23;
                                        } else {
                                          break L23;
                                        }
                                      }
                                      var15++;
                                      continue L21;
                                    }
                                  }
                                }
                              }
                            } else {
                              this.field_i[this.field_b[var11]] = var18.f((byte) -104);
                              var11++;
                              continue L19;
                            }
                          }
                        } else {
                          var11 = 0;
                          L24: while (true) {
                            if (this.field_n <= var11) {
                              var11 = 0;
                              L25: while (true) {
                                if (this.field_n <= var11) {
                                  break L18;
                                } else {
                                  var12 = this.field_b[var11];
                                  var8 = 0;
                                  var13 = this.field_i[var12];
                                  array$5 = new int[var13];
                                  this.field_r[var12] = array$5;
                                  var14 = -1;
                                  var15 = 0;
                                  L26: while (true) {
                                    if (var15 >= var13) {
                                      L27: {
                                        this.field_e[var12] = var14 - -1;
                                        if (var14 - -1 != var13) {
                                          break L27;
                                        } else {
                                          this.field_r[var12] = null;
                                          break L27;
                                        }
                                      }
                                      var11++;
                                      continue L25;
                                    } else {
                                      L28: {
                                        dupTemp$6 = var8 + var18.a((byte) 81);
                                        var8 = dupTemp$6;
                                        dupTemp$7 = this.field_r[var12];
                                        dupTemp$7[var15] = dupTemp$6;
                                        var16 = dupTemp$6;
                                        if ((var16 ^ -1) < (var14 ^ -1)) {
                                          var14 = var16;
                                          break L28;
                                        } else {
                                          break L28;
                                        }
                                      }
                                      var15++;
                                      continue L26;
                                    }
                                  }
                                }
                              }
                            } else {
                              this.field_i[this.field_b[var11]] = var18.a((byte) 81);
                              var11++;
                              continue L24;
                            }
                          }
                        }
                      }
                      L29: {
                        if (var6 != 0) {
                          this.field_s = new lf[var9 + 1];
                          this.field_j = new int[1 + var9][];
                          var11 = 0;
                          L30: while (true) {
                            if (this.field_n <= var11) {
                              break L29;
                            } else {
                              var12 = this.field_b[var11];
                              var13 = this.field_i[var12];
                              array$8 = new int[this.field_e[var12]];
                              this.field_j[var12] = array$8;
                              var14 = 0;
                              L31: while (true) {
                                if (var14 >= this.field_e[var12]) {
                                  var14 = 0;
                                  L32: while (true) {
                                    if (var13 <= var14) {
                                      this.field_s[var12] = new lf(this.field_j[var12]);
                                      var11++;
                                      continue L30;
                                    } else {
                                      L33: {
                                        if (this.field_r[var12] != null) {
                                          var15 = this.field_r[var12][var14];
                                          break L33;
                                        } else {
                                          var15 = var14;
                                          break L33;
                                        }
                                      }
                                      this.field_j[var12][var15] = var18.k(4);
                                      var14++;
                                      continue L32;
                                    }
                                  }
                                } else {
                                  this.field_j[var12][var14] = -1;
                                  var14++;
                                  continue L31;
                                }
                              }
                            }
                          }
                        } else {
                          break L29;
                        }
                      }
                      break L0;
                    } else {
                      this.field_c[this.field_b[var11]] = var18.k(4);
                      var11++;
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
          L34: {
            var3 = decompiledCaughtException;
            stackIn_98_0 = (RuntimeException) (var3);

            stackIn_98_1 = new StringBuilder().append("kl.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_99_0 = (RuntimeException) ((Object) stackIn_98_0);
              stackIn_99_1 = (StringBuilder) ((Object) stackIn_98_1);
              stackIn_99_2 = "null";
              break L34;
            } else {
              stackIn_99_0 = (RuntimeException) ((Object) stackIn_98_0);
              stackIn_99_1 = (StringBuilder) ((Object) stackIn_98_1);
              stackIn_99_2 = "{...}";
              break L34;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_99_0), stackIn_99_2 + ')');
        }
    }

    kl(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
            this.field_g = er.a(false, param0.length, param0);
            if (this.field_g != param1) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if (param2.length != 64) {
                    throw new RuntimeException();
                }
                this.field_o = jj.a(param0.length, param0, (byte) 91, 0);
                for (var4_int = 0; 64 > var4_int; var4_int++) {
                    if (param2[var4_int] != this.field_o[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            this.a(26, param0);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "kl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_h = null;
        field_t = true;
    }
}
