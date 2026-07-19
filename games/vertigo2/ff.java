/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ff {
    static String[] field_n;
    static int field_b;
    int[] field_l;
    byte[][] field_s;
    private int field_q;
    pq field_k;
    int[][] field_g;
    static long field_d;
    int field_c;
    int[] field_h;
    int[] field_e;
    static boolean field_m;
    static String field_u;
    int[] field_j;
    private int[] field_f;
    private byte[] field_a;
    int[] field_r;
    pq[] field_t;
    static String field_v;
    int field_p;
    private int[][] field_i;
    int field_o;

    final static void b(byte param0) {
        vd.field_b = new mk();
        n.field_b.a(false, vd.field_b);
        if (param0 != -104) {
            field_b = 45;
        }
    }

    private final void a(byte[] param0, boolean param1) {
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
        ed var17 = null;
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
        int decompiledRegionSelector0 = 0;
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
        var16 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var17 = new ed(hm.a(-20595, param0));
              var4 = var17.h(-11);
              if (var4 < 5) {
                break L1;
              } else {
                if (-8 > (var4 ^ -1)) {
                  break L1;
                } else {
                  L2: {
                    if (-7 < (var4 ^ -1)) {
                      this.field_c = 0;
                      break L2;
                    } else {
                      this.field_c = var17.b(true);
                      break L2;
                    }
                  }
                  L3: {
                    var5 = var17.h(-11);
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
                    if ((2 & var5) == 0) {
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
                      this.field_q = var17.a(82);
                      break L5;
                    } else {
                      this.field_q = var17.a((byte) -11);
                      break L5;
                    }
                  }
                  L6: {
                    var8 = 0;
                    var9 = -1;
                    this.field_e = new int[this.field_q];
                    if ((var4 ^ -1) > -8) {
                      var10 = 0;
                      L7: while (true) {
                        if (var10 >= this.field_q) {
                          break L6;
                        } else {
                          dupTemp$7 = var8 + var17.a((byte) -11);
                          var8 = dupTemp$7;
                          this.field_e[var10] = dupTemp$7;
                          if (this.field_e[var10] > var9) {
                            var9 = this.field_e[var10];
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
                        if (this.field_q <= var10) {
                          break L6;
                        } else {
                          L9: {
                            dupTemp$8 = var8 + var17.a(118);
                            var8 = dupTemp$8;
                            this.field_e[var10] = dupTemp$8;
                            if (var9 < this.field_e[var10]) {
                              var9 = this.field_e[var10];
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
                    this.field_p = 1 + var9;
                    if (var7 != 0) {
                      this.field_s = new byte[this.field_p][];
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  L11: {
                    this.field_h = new int[this.field_p];
                    this.field_g = new int[this.field_p][];
                    this.field_j = new int[this.field_p];
                    this.field_l = new int[this.field_p];
                    this.field_r = new int[this.field_p];
                    if (var6 != 0) {
                      this.field_f = new int[this.field_p];
                      var10 = 0;
                      L12: while (true) {
                        if (this.field_p <= var10) {
                          var10 = 0;
                          L13: while (true) {
                            if (var10 >= this.field_q) {
                              this.field_k = new pq(this.field_f);
                              break L11;
                            } else {
                              this.field_f[this.field_e[var10]] = var17.b(true);
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
                    } else {
                      break L11;
                    }
                  }
                  var10 = 0;
                  L14: while (true) {
                    if (var10 >= this.field_q) {
                      L15: {
                        if (var7 == 0) {
                          break L15;
                        } else {
                          var10 = 0;
                          L16: while (true) {
                            if (var10 >= this.field_q) {
                              break L15;
                            } else {
                              var21 = new byte[64];
                              var17.a(0, var21, 64, 78);
                              this.field_s[this.field_e[var10]] = var21;
                              var10++;
                              continue L16;
                            }
                          }
                        }
                      }
                      var10 = 0;
                      if (param1) {
                        L17: while (true) {
                          if (this.field_q <= var10) {
                            L18: {
                              if ((var4 ^ -1) <= -8) {
                                var10 = 0;
                                L19: while (true) {
                                  if (this.field_q <= var10) {
                                    var10 = 0;
                                    L20: while (true) {
                                      if (var10 >= this.field_q) {
                                        break L18;
                                      } else {
                                        var11 = this.field_e[var10];
                                        var12 = this.field_h[var11];
                                        var8 = 0;
                                        var13 = -1;
                                        array$9 = new int[var12];
                                        this.field_g[var11] = array$9;
                                        var14 = 0;
                                        L21: while (true) {
                                          if (var12 <= var14) {
                                            L22: {
                                              this.field_r[var11] = 1 + var13;
                                              if (1 + var13 != var12) {
                                                break L22;
                                              } else {
                                                this.field_g[var11] = null;
                                                break L22;
                                              }
                                            }
                                            var10++;
                                            continue L20;
                                          } else {
                                            L23: {
                                              dupTemp$10 = var8 + var17.a(83);
                                              var8 = dupTemp$10;
                                              this.field_g[var11][var14] = dupTemp$10;
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
                                    this.field_h[this.field_e[var10]] = var17.a(113);
                                    var10++;
                                    continue L19;
                                  }
                                }
                              } else {
                                var10 = 0;
                                L24: while (true) {
                                  if (var10 >= this.field_q) {
                                    var10 = 0;
                                    L25: while (true) {
                                      if (this.field_q <= var10) {
                                        break L18;
                                      } else {
                                        var11 = this.field_e[var10];
                                        var8 = 0;
                                        var12 = this.field_h[var11];
                                        array$11 = new int[var12];
                                        this.field_g[var11] = array$11;
                                        var13 = -1;
                                        var14 = 0;
                                        L26: while (true) {
                                          if (var14 >= var12) {
                                            L27: {
                                              this.field_r[var11] = 1 + var13;
                                              if (var13 + 1 != var12) {
                                                break L27;
                                              } else {
                                                this.field_g[var11] = null;
                                                break L27;
                                              }
                                            }
                                            var10++;
                                            continue L25;
                                          } else {
                                            dupTemp$12 = var8 + var17.a((byte) -11);
                                            var8 = dupTemp$12;
                                            this.field_g[var11][var14] = dupTemp$12;
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
                                    this.field_h[this.field_e[var10]] = var17.a((byte) -11);
                                    var10++;
                                    continue L24;
                                  }
                                }
                              }
                            }
                            L28: {
                              if (var6 != 0) {
                                this.field_i = new int[var9 + 1][];
                                this.field_t = new pq[var9 + 1];
                                var10 = 0;
                                L29: while (true) {
                                  if (this.field_q <= var10) {
                                    break L28;
                                  } else {
                                    var11 = this.field_e[var10];
                                    var12 = this.field_h[var11];
                                    array$13 = new int[this.field_r[var11]];
                                    this.field_i[var11] = array$13;
                                    var13 = 0;
                                    L30: while (true) {
                                      if (this.field_r[var11] <= var13) {
                                        var13 = 0;
                                        L31: while (true) {
                                          if (var12 <= var13) {
                                            this.field_t[var11] = new pq(this.field_i[var11]);
                                            var10++;
                                            continue L29;
                                          } else {
                                            L32: {
                                              if (null == this.field_g[var11]) {
                                                var14 = var13;
                                                break L32;
                                              } else {
                                                var14 = this.field_g[var11][var13];
                                                break L32;
                                              }
                                            }
                                            this.field_i[var11][var14] = var17.b(true);
                                            var13++;
                                            continue L31;
                                          }
                                        }
                                      } else {
                                        this.field_i[var11][var13] = -1;
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
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            this.field_l[this.field_e[var10]] = var17.b(param1);
                            var10++;
                            continue L17;
                          }
                        }
                      } else {
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    } else {
                      this.field_j[this.field_e[var10]] = var17.b(true);
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
            stackOut_95_0 = (RuntimeException) (var3);
            stackOut_95_1 = new StringBuilder().append("ff.D(");
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
          throw wn.a((Throwable) ((Object) stackIn_98_0), stackIn_98_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(boolean param0, int param1) {
        kq.b(-69, param0);
        rg.a((byte) 53, param0);
        if (param1 != 11182) {
            ff.b((byte) 54);
        }
    }

    public static void a(byte param0) {
        field_u = null;
        field_v = null;
        field_n = null;
        if (param0 <= 69) {
            field_d = 125L;
        }
    }

    ff(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
            this.field_o = w.a(param0.length, param0, -7);
            if (param1 != this.field_o) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if (-65 != (param2.length ^ -1)) {
                    throw new RuntimeException();
                }
                this.field_a = de.a(0, (byte) -114, param0.length, param0);
                for (var4_int = 0; var4_int < 64; var4_int++) {
                    if (this.field_a[var4_int] != param2[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            this.a(param0, true);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "ff.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_n = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        field_b = 0;
        field_m = false;
        field_v = "Month";
    }
}
