/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pc {
    int[] field_b;
    private int[] field_o;
    int[] field_l;
    byte[][] field_g;
    int field_p;
    static String field_t;
    oe[] field_e;
    int[][] field_r;
    int[] field_a;
    static int field_i;
    private int[][] field_c;
    private byte[] field_j;
    private int field_s;
    static int field_m;
    int[] field_f;
    oe field_q;
    int field_k;
    int field_n;
    int[] field_d;
    static boolean field_h;

    private final void a(byte param0, byte[] param1) {
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
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        String stackIn_100_2 = null;
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
        be var17 = null;
        byte[] var21 = null;
        var16 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var17 = new be(al.a(-128, param1));
              var4 = var17.h(16383);
              if (5 > var4) {
                break L1;
              } else {
                if (var4 <= 7) {
                  L2: {
                    if (6 <= var4) {
                      this.field_k = var17.e((byte) 113);
                      break L2;
                    } else {
                      this.field_k = 0;
                      break L2;
                    }
                  }
                  L3: {
                    var5 = var17.h(16383);
                    if ((1 & var5) == 0) {
                      stackIn_11_0 = 0;
                      break L3;
                    } else {
                      stackIn_11_0 = 1;
                      break L3;
                    }
                  }
                  L4: {
                    var6 = stackIn_11_0;
                    if (7 <= var4) {
                      this.field_s = var17.c(false);
                      break L4;
                    } else {
                      this.field_s = var17.d((byte) -78);
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
                  var7 = stackIn_17_0;
                  var8 = 0;
                  if (param0 == -2) {
                    L6: {
                      var9 = -1;
                      this.field_f = new int[this.field_s];
                      if (var4 < 7) {
                        var10 = 0;
                        L7: while (true) {
                          if (this.field_s <= var10) {
                            break L6;
                          } else {
                            L8: {
                              dupTemp$0 = var8 + var17.d((byte) -62);
                              var8 = dupTemp$0;
                              this.field_f[var10] = dupTemp$0;
                              if ((this.field_f[var10] ^ -1) < (var9 ^ -1)) {
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
                          if (this.field_s <= var10) {
                            break L6;
                          } else {
                            dupTemp$1 = var8 + var17.c(false);
                            var8 = dupTemp$1;
                            this.field_f[var10] = dupTemp$1;
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
                    L10: {
                      this.field_n = var9 + 1;
                      this.field_r = new int[this.field_n][];
                      if (var7 != 0) {
                        this.field_g = new byte[this.field_n][];
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      this.field_a = new int[this.field_n];
                      this.field_b = new int[this.field_n];
                      this.field_d = new int[this.field_n];
                      this.field_l = new int[this.field_n];
                      if (var6 == 0) {
                        break L11;
                      } else {
                        this.field_o = new int[this.field_n];
                        var10 = 0;
                        L12: while (true) {
                          if (var10 >= this.field_n) {
                            var10 = 0;
                            L13: while (true) {
                              if (var10 >= this.field_s) {
                                this.field_q = new oe(this.field_o);
                                break L11;
                              } else {
                                this.field_o[this.field_f[var10]] = var17.e((byte) 113);
                                var10++;
                                continue L13;
                              }
                            }
                          } else {
                            this.field_o[var10] = -1;
                            var10++;
                            continue L12;
                          }
                        }
                      }
                    }
                    var10 = 0;
                    L14: while (true) {
                      if (var10 >= this.field_s) {
                        L15: {
                          if (var7 == 0) {
                            break L15;
                          } else {
                            var10 = 0;
                            L16: while (true) {
                              if (this.field_s <= var10) {
                                break L15;
                              } else {
                                var21 = new byte[64];
                                var17.a(89, var21, 0, 64);
                                this.field_g[this.field_f[var10]] = var21;
                                var10++;
                                continue L16;
                              }
                            }
                          }
                        }
                        var10 = 0;
                        L17: while (true) {
                          if (var10 >= this.field_s) {
                            L18: {
                              if (-8 >= (var4 ^ -1)) {
                                var10 = 0;
                                L19: while (true) {
                                  if (var10 >= this.field_s) {
                                    var10 = 0;
                                    L20: while (true) {
                                      if (var10 >= this.field_s) {
                                        break L18;
                                      } else {
                                        var11 = this.field_f[var10];
                                        var8 = 0;
                                        var12 = this.field_l[var11];
                                        array$2 = new int[var12];
                                        this.field_r[var11] = array$2;
                                        var13 = -1;
                                        var14 = 0;
                                        L21: while (true) {
                                          if (var12 <= var14) {
                                            L22: {
                                              this.field_a[var11] = var13 + 1;
                                              if (var13 + 1 != var12) {
                                                break L22;
                                              } else {
                                                this.field_r[var11] = null;
                                                break L22;
                                              }
                                            }
                                            var10++;
                                            continue L20;
                                          } else {
                                            L23: {
                                              dupTemp$3 = var8 + var17.c(false);
                                              var8 = dupTemp$3;
                                              dupTemp$4 = this.field_r[var11];
                                              dupTemp$4[var14] = dupTemp$3;
                                              var15 = dupTemp$3;
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
                                    this.field_l[this.field_f[var10]] = var17.c(false);
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
                                        var11 = this.field_f[var10];
                                        var8 = 0;
                                        var12 = this.field_l[var11];
                                        array$5 = new int[var12];
                                        this.field_r[var11] = array$5;
                                        var13 = -1;
                                        var14 = 0;
                                        L26: while (true) {
                                          if (var12 <= var14) {
                                            L27: {
                                              this.field_a[var11] = var13 + 1;
                                              if (var12 == 1 + var13) {
                                                this.field_r[var11] = null;
                                                break L27;
                                              } else {
                                                break L27;
                                              }
                                            }
                                            var10++;
                                            continue L25;
                                          } else {
                                            L28: {
                                              dupTemp$6 = var8 + var17.d((byte) -109);
                                              var8 = dupTemp$6;
                                              dupTemp$7 = this.field_r[var11];
                                              dupTemp$7[var14] = dupTemp$6;
                                              var15 = dupTemp$6;
                                              if (var15 > var13) {
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
                                    this.field_l[this.field_f[var10]] = var17.d((byte) -42);
                                    var10++;
                                    continue L24;
                                  }
                                }
                              }
                            }
                            L29: {
                              if (var6 != 0) {
                                this.field_e = new oe[1 + var9];
                                this.field_c = new int[1 + var9][];
                                var10 = 0;
                                L30: while (true) {
                                  if (this.field_s <= var10) {
                                    break L29;
                                  } else {
                                    var11 = this.field_f[var10];
                                    var12 = this.field_l[var11];
                                    array$8 = new int[this.field_a[var11]];
                                    this.field_c[var11] = array$8;
                                    var13 = 0;
                                    L31: while (true) {
                                      if (var13 >= this.field_a[var11]) {
                                        var13 = 0;
                                        L32: while (true) {
                                          if (var12 <= var13) {
                                            this.field_e[var11] = new oe(this.field_c[var11]);
                                            var10++;
                                            continue L30;
                                          } else {
                                            L33: {
                                              if (null == this.field_r[var11]) {
                                                var14 = var13;
                                                break L33;
                                              } else {
                                                var14 = this.field_r[var11][var13];
                                                break L33;
                                              }
                                            }
                                            this.field_c[var11][var14] = var17.e((byte) 113);
                                            var13++;
                                            continue L32;
                                          }
                                        }
                                      } else {
                                        this.field_c[var11][var13] = -1;
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
                            this.field_d[this.field_f[var10]] = var17.e((byte) 113);
                            var10++;
                            continue L17;
                          }
                        }
                      } else {
                        this.field_b[this.field_f[var10]] = var17.e((byte) 113);
                        var10++;
                        continue L14;
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
          L34: {
            var3 = decompiledCaughtException;
            stackIn_99_0 = (RuntimeException) (var3);

            stackIn_99_1 = new StringBuilder().append("pc.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_100_0 = (RuntimeException) ((Object) stackIn_99_0);
              stackIn_100_1 = (StringBuilder) ((Object) stackIn_99_1);
              stackIn_100_2 = "null";
              break L34;
            } else {
              stackIn_100_0 = (RuntimeException) ((Object) stackIn_99_0);
              stackIn_100_1 = (StringBuilder) ((Object) stackIn_99_1);
              stackIn_100_2 = "{...}";
              break L34;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_100_0), stackIn_100_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            return;
        }
        field_t = null;
    }

    pc(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
            this.field_p = ql.a(0, param0, param0.length);
            if (this.field_p != param1) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if (64 != param2.length) {
                    throw new RuntimeException();
                }
                this.field_j = cf.a(0, param0, param0.length, -6196);
                for (var4_int = 0; (var4_int ^ -1) > -65; var4_int++) {
                    if (this.field_j[var4_int] != param2[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            this.a((byte) -2, param0);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "pc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_i = 0;
        field_h = false;
    }
}
