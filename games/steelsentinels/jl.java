/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jl {
    int[] field_g;
    static int field_r;
    int[] field_m;
    jk field_n;
    byte[][] field_t;
    private int field_b;
    static float field_c;
    jk[] field_d;
    static int field_p;
    int[] field_h;
    int field_k;
    private int[][] field_q;
    int field_e;
    int[] field_j;
    static gh field_s;
    private byte[] field_l;
    int field_u;
    static oe field_w;
    static String field_f;
    private int[] field_v;
    int[] field_a;
    static String field_i;
    int[][] field_o;

    final static void a(boolean param0) {
        aj var1 = (aj) ((Object) sl.field_b.c(-6533));
        if (!(var1 != null)) {
            var1 = new aj();
        }
        var1.a(pb.field_b, pb.field_i, pb.field_c, pb.field_l, pb.field_g, pb.field_d, pb.field_j, (byte) -62);
        ff.field_qb.a(3, var1);
        if (param0) {
            jl.a(true);
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_w = null;
        if (param0 != 0) {
            jl.a(81);
        }
        field_i = null;
        field_s = null;
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
        gi var17 = null;
        byte[] var21 = null;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        String stackIn_100_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_97_0 = null;
        StringBuilder stackOut_97_1 = null;
        RuntimeException stackOut_99_0 = null;
        StringBuilder stackOut_99_1 = null;
        String stackOut_99_2 = null;
        RuntimeException stackOut_98_0 = null;
        StringBuilder stackOut_98_1 = null;
        String stackOut_98_2 = null;
        var16 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              var17 = new gi(ln.a(param0, (byte) 127));
              var4 = var17.f((byte) -66);
              if (5 > var4) {
                break L1;
              } else {
                if (-8 > (var4 ^ -1)) {
                  break L1;
                } else {
                  L2: {
                    if (var4 >= 6) {
                      this.field_k = var17.i(0);
                      break L2;
                    } else {
                      this.field_k = 0;
                      break L2;
                    }
                  }
                  L3: {
                    var5 = var17.f((byte) -111);
                    if (-1 == (1 & var5 ^ -1)) {
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
                    if (-8 < (var4 ^ -1)) {
                      this.field_b = var17.c((byte) -60);
                      break L4;
                    } else {
                      this.field_b = var17.c(true);
                      break L4;
                    }
                  }
                  L5: {
                    if (-1 == (var5 & 2 ^ -1)) {
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
                    this.field_h = new int[this.field_b];
                    if (7 > var4) {
                      var10 = 0;
                      L7: while (true) {
                        if (this.field_b <= var10) {
                          break L6;
                        } else {
                          dupTemp$7 = var8 + var17.c((byte) -60);
                          var8 = dupTemp$7;
                          this.field_h[var10] = dupTemp$7;
                          if (this.field_h[var10] > var9) {
                            var9 = this.field_h[var10];
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
                        if (this.field_b <= var10) {
                          break L6;
                        } else {
                          dupTemp$8 = var8 + var17.c(true);
                          var8 = dupTemp$8;
                          this.field_h[var10] = dupTemp$8;
                          if (this.field_h[var10] > var9) {
                            var9 = this.field_h[var10];
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
                    this.field_u = 1 + var9;
                    this.field_o = new int[this.field_u][];
                    this.field_g = new int[this.field_u];
                    if (var7 != 0) {
                      this.field_t = new byte[this.field_u][];
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    this.field_j = new int[this.field_u];
                    this.field_a = new int[this.field_u];
                    this.field_m = new int[this.field_u];
                    if (var6 != 0) {
                      this.field_v = new int[this.field_u];
                      var10 = 0;
                      L11: while (true) {
                        if (this.field_u <= var10) {
                          var10 = 0;
                          L12: while (true) {
                            if (var10 >= this.field_b) {
                              this.field_n = new jk(this.field_v);
                              break L10;
                            } else {
                              this.field_v[this.field_h[var10]] = var17.i(0);
                              var10++;
                              continue L12;
                            }
                          }
                        } else {
                          this.field_v[var10] = -1;
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
                    if (this.field_b <= var10) {
                      L14: {
                        if (var7 == 0) {
                          break L14;
                        } else {
                          var10 = 0;
                          L15: while (true) {
                            if (var10 >= this.field_b) {
                              break L14;
                            } else {
                              var21 = new byte[64];
                              var17.a(0, var21, 28, 64);
                              this.field_t[this.field_h[var10]] = var21;
                              var10++;
                              continue L15;
                            }
                          }
                        }
                      }
                      if (param1 >= 64) {
                        var10 = 0;
                        L16: while (true) {
                          if (this.field_b <= var10) {
                            L17: {
                              if ((var4 ^ -1) > -8) {
                                var10 = 0;
                                L18: while (true) {
                                  if (this.field_b <= var10) {
                                    var10 = 0;
                                    L19: while (true) {
                                      if (this.field_b <= var10) {
                                        break L17;
                                      } else {
                                        var11 = this.field_h[var10];
                                        var8 = 0;
                                        var12 = this.field_j[var11];
                                        array$9 = new int[var12];
                                        this.field_o[var11] = array$9;
                                        var13 = -1;
                                        var14 = 0;
                                        L20: while (true) {
                                          if (var14 >= var12) {
                                            L21: {
                                              this.field_g[var11] = 1 + var13;
                                              if (var12 == 1 + var13) {
                                                this.field_o[var11] = null;
                                                break L21;
                                              } else {
                                                break L21;
                                              }
                                            }
                                            var10++;
                                            continue L19;
                                          } else {
                                            L22: {
                                              dupTemp$10 = var8 + var17.c((byte) -60);
                                              var8 = dupTemp$10;
                                              this.field_o[var11][var14] = dupTemp$10;
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
                                    this.field_j[this.field_h[var10]] = var17.c((byte) -60);
                                    var10++;
                                    continue L18;
                                  }
                                }
                              } else {
                                var10 = 0;
                                L23: while (true) {
                                  if (this.field_b <= var10) {
                                    var10 = 0;
                                    L24: while (true) {
                                      if (var10 >= this.field_b) {
                                        break L17;
                                      } else {
                                        var11 = this.field_h[var10];
                                        var8 = 0;
                                        var12 = this.field_j[var11];
                                        var13 = -1;
                                        array$11 = new int[var12];
                                        this.field_o[var11] = array$11;
                                        var14 = 0;
                                        L25: while (true) {
                                          if (var12 <= var14) {
                                            L26: {
                                              this.field_g[var11] = var13 + 1;
                                              if (var13 + 1 == var12) {
                                                this.field_o[var11] = null;
                                                break L26;
                                              } else {
                                                break L26;
                                              }
                                            }
                                            var10++;
                                            continue L24;
                                          } else {
                                            L27: {
                                              dupTemp$12 = var8 + var17.c(true);
                                              var8 = dupTemp$12;
                                              this.field_o[var11][var14] = dupTemp$12;
                                              var15 = dupTemp$12;
                                              if (var15 > var13) {
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
                                    this.field_j[this.field_h[var10]] = var17.c(true);
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
                                this.field_d = new jk[var9 - -1];
                                this.field_q = new int[1 + var9][];
                                var10 = 0;
                                L29: while (true) {
                                  if (this.field_b <= var10) {
                                    break L28;
                                  } else {
                                    var11 = this.field_h[var10];
                                    var12 = this.field_j[var11];
                                    array$13 = new int[this.field_g[var11]];
                                    this.field_q[var11] = array$13;
                                    var13 = 0;
                                    L30: while (true) {
                                      if (this.field_g[var11] <= var13) {
                                        var13 = 0;
                                        L31: while (true) {
                                          if (var12 <= var13) {
                                            this.field_d[var11] = new jk(this.field_q[var11]);
                                            var10++;
                                            continue L29;
                                          } else {
                                            L32: {
                                              if (null == this.field_o[var11]) {
                                                var14 = var13;
                                                break L32;
                                              } else {
                                                var14 = this.field_o[var11][var13];
                                                break L32;
                                              }
                                            }
                                            this.field_q[var11][var14] = var17.i(0);
                                            var13++;
                                            continue L31;
                                          }
                                        }
                                      } else {
                                        this.field_q[var11][var13] = -1;
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
                            this.field_m[this.field_h[var10]] = var17.i(0);
                            var10++;
                            continue L16;
                          }
                        }
                      } else {
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    } else {
                      this.field_a[this.field_h[var10]] = var17.i(0);
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
            stackOut_97_0 = (RuntimeException) (var3);
            stackOut_97_1 = new StringBuilder().append("jl.C(");
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
          throw ci.a((Throwable) ((Object) stackIn_100_0), stackIn_100_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    jl(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
            this.field_e = ba.a((byte) -107, param0, param0.length);
            if (this.field_e != param1) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if (64 != param2.length) {
                    throw new RuntimeException();
                }
                this.field_l = co.a((byte) -37, param0.length, 0, param0);
                for (var4_int = 0; 64 > var4_int; var4_int++) {
                    if (param2[var4_int] != this.field_l[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            this.a(param0, 70);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "jl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_i = "Unpacking graphics";
        field_f = "Click or press F10 to open Quick Chat";
    }
}
