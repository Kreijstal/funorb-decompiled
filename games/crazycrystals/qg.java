/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qg {
    int field_b;
    int[] field_g;
    static ih field_s;
    private int[] field_k;
    v field_t;
    private int[][] field_d;
    int[][] field_h;
    int[] field_l;
    static int field_q;
    v[] field_i;
    int[] field_e;
    int[] field_n;
    private byte[] field_j;
    int[] field_f;
    int field_a;
    private int field_p;
    int field_r;
    byte[][] field_m;
    static String field_o;
    static String[] field_c;

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
        byte[] var17 = null;
        ng var18 = null;
        byte[] var22 = null;
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
        var16 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              var18 = new ng(b.a(param1, -1));
              var4 = var18.h(255);
              if (-6 < (var4 ^ -1)) {
                break L1;
              } else {
                if (-8 > (var4 ^ -1)) {
                  break L1;
                } else {
                  L2: {
                    if (-7 < (var4 ^ -1)) {
                      this.field_r = 0;
                      break L2;
                    } else {
                      this.field_r = var18.b((byte) 127);
                      break L2;
                    }
                  }
                  L3: {
                    var5 = var18.h(255);
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
                    if (-1 == (2 & var5 ^ -1)) {
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
                    if (var4 >= 7) {
                      this.field_p = var18.a((byte) -122);
                      break L5;
                    } else {
                      this.field_p = var18.c((byte) -7);
                      break L5;
                    }
                  }
                  L6: {
                    var8 = 0;
                    var9 = -1;
                    this.field_e = new int[this.field_p];
                    if (7 > var4) {
                      var10 = 0;
                      L7: while (true) {
                        if (this.field_p <= var10) {
                          break L6;
                        } else {
                          L8: {
                            dupTemp$7 = var8 + var18.c((byte) -7);
                            var8 = dupTemp$7;
                            this.field_e[var10] = dupTemp$7;
                            if (var9 < this.field_e[var10]) {
                              var9 = this.field_e[var10];
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
                        if (var10 >= this.field_p) {
                          break L6;
                        } else {
                          dupTemp$8 = var8 + var18.a((byte) -124);
                          var8 = dupTemp$8;
                          this.field_e[var10] = dupTemp$8;
                          if (this.field_e[var10] > var9) {
                            var9 = this.field_e[var10];
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
                    this.field_a = 1 + var9;
                    if (var7 == 0) {
                      break L10;
                    } else {
                      this.field_m = new byte[this.field_a][];
                      break L10;
                    }
                  }
                  L11: {
                    this.field_l = new int[this.field_a];
                    this.field_h = new int[this.field_a][];
                    this.field_f = new int[this.field_a];
                    this.field_g = new int[this.field_a];
                    this.field_n = new int[this.field_a];
                    if (var6 == 0) {
                      break L11;
                    } else {
                      this.field_k = new int[this.field_a];
                      var10 = 0;
                      L12: while (true) {
                        if (this.field_a <= var10) {
                          var10 = 0;
                          L13: while (true) {
                            if (var10 >= this.field_p) {
                              this.field_t = new v(this.field_k);
                              break L11;
                            } else {
                              this.field_k[this.field_e[var10]] = var18.b((byte) -23);
                              var10++;
                              continue L13;
                            }
                          }
                        } else {
                          this.field_k[var10] = -1;
                          var10++;
                          continue L12;
                        }
                      }
                    }
                  }
                  var10 = 0;
                  L14: while (true) {
                    if (this.field_p <= var10) {
                      L15: {
                        if (var7 == 0) {
                          break L15;
                        } else {
                          var10 = 0;
                          L16: while (true) {
                            if (this.field_p <= var10) {
                              break L15;
                            } else {
                              var22 = new byte[64];
                              var18.a(64, var22, (byte) -110, 0);
                              this.field_m[this.field_e[var10]] = var22;
                              var10++;
                              continue L16;
                            }
                          }
                        }
                      }
                      var10 = 0;
                      L17: while (true) {
                        if (this.field_p <= var10) {
                          L18: {
                            if (-8 < (var4 ^ -1)) {
                              var10 = 0;
                              L19: while (true) {
                                if (this.field_p <= var10) {
                                  var10 = 0;
                                  L20: while (true) {
                                    if (var10 >= this.field_p) {
                                      break L18;
                                    } else {
                                      var11 = this.field_e[var10];
                                      var8 = 0;
                                      var12 = this.field_f[var11];
                                      var13 = -1;
                                      array$9 = new int[var12];
                                      this.field_h[var11] = array$9;
                                      var14 = 0;
                                      L21: while (true) {
                                        if (var12 <= var14) {
                                          L22: {
                                            this.field_l[var11] = var13 - -1;
                                            if (1 + var13 == var12) {
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
                                            dupTemp$10 = var8 + var18.c((byte) -7);
                                            var8 = dupTemp$10;
                                            this.field_h[var11][var14] = dupTemp$10;
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
                                  this.field_f[this.field_e[var10]] = var18.c((byte) -7);
                                  var10++;
                                  continue L19;
                                }
                              }
                            } else {
                              var10 = 0;
                              L24: while (true) {
                                if (var10 >= this.field_p) {
                                  var10 = 0;
                                  L25: while (true) {
                                    if (var10 >= this.field_p) {
                                      break L18;
                                    } else {
                                      var11 = this.field_e[var10];
                                      var8 = 0;
                                      var12 = this.field_f[var11];
                                      var13 = -1;
                                      array$11 = new int[var12];
                                      this.field_h[var11] = array$11;
                                      var14 = 0;
                                      L26: while (true) {
                                        if (var14 >= var12) {
                                          L27: {
                                            this.field_l[var11] = 1 + var13;
                                            if (var12 == var13 - -1) {
                                              this.field_h[var11] = null;
                                              break L27;
                                            } else {
                                              break L27;
                                            }
                                          }
                                          var10++;
                                          continue L25;
                                        } else {
                                          dupTemp$12 = var8 + var18.a((byte) -121);
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
                                  this.field_f[this.field_e[var10]] = var18.a((byte) -121);
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
                              this.field_d = new int[var9 + 1][];
                              this.field_i = new v[var9 + 1];
                              var10 = 0;
                              L29: while (true) {
                                if (this.field_p <= var10) {
                                  break L28;
                                } else {
                                  var11 = this.field_e[var10];
                                  var12 = this.field_f[var11];
                                  array$13 = new int[this.field_l[var11]];
                                  this.field_d[var11] = array$13;
                                  var13 = 0;
                                  L30: while (true) {
                                    if (var13 >= this.field_l[var11]) {
                                      var13 = 0;
                                      L31: while (true) {
                                        if (var13 >= var12) {
                                          this.field_i[var11] = new v(this.field_d[var11]);
                                          var10++;
                                          continue L29;
                                        } else {
                                          L32: {
                                            if (null != this.field_h[var11]) {
                                              var14 = this.field_h[var11][var13];
                                              break L32;
                                            } else {
                                              var14 = var13;
                                              break L32;
                                            }
                                          }
                                          this.field_d[var11][var14] = var18.b((byte) -59);
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
                          L33: {
                            if (param0 == 64) {
                              break L33;
                            } else {
                              var17 = (byte[]) null;
                              this.a(-2, (byte[]) null);
                              break L33;
                            }
                          }
                          break L0;
                        } else {
                          this.field_g[this.field_e[var10]] = var18.b((byte) 127);
                          var10++;
                          continue L17;
                        }
                      }
                    } else {
                      this.field_n[this.field_e[var10]] = var18.b((byte) 127);
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
          L34: {
            var3 = decompiledCaughtException;
            stackOut_95_0 = (RuntimeException) (var3);
            stackOut_95_1 = new StringBuilder().append("qg.A(").append(param0).append(',');
            stackIn_97_0 = stackOut_95_0;
            stackIn_97_1 = stackOut_95_1;
            stackIn_96_0 = stackOut_95_0;
            stackIn_96_1 = stackOut_95_1;
            if (param1 == null) {
              stackOut_97_0 = (RuntimeException) ((Object) stackIn_97_0);
              stackOut_97_1 = (StringBuilder) ((Object) stackIn_97_1);
              stackOut_97_2 = "null";
              stackIn_98_0 = stackOut_97_0;
              stackIn_98_1 = stackOut_97_1;
              stackIn_98_2 = stackOut_97_2;
              break L34;
            } else {
              stackOut_96_0 = (RuntimeException) ((Object) stackIn_96_0);
              stackOut_96_1 = (StringBuilder) ((Object) stackIn_96_1);
              stackOut_96_2 = "{...}";
              stackIn_98_0 = stackOut_96_0;
              stackIn_98_1 = stackOut_96_1;
              stackIn_98_2 = stackOut_96_2;
              break L34;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_98_0), stackIn_98_2 + ')');
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_o = null;
        if (param0 != 51) {
            field_o = (String) null;
        }
        field_s = null;
    }

    qg(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
            this.field_b = gi.a(param0.length, param0, 26009);
            if (this.field_b != param1) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if (-65 != (param2.length ^ -1)) {
                    throw new RuntimeException();
                }
                this.field_j = ac.a(param0, 0, param0.length, (byte) -127);
                for (var4_int = 0; (var4_int ^ -1) > -65; var4_int++) {
                    if (this.field_j[var4_int] != param2[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            this.a(64, param0);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "qg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_s = new ih();
        field_c = new String[]{"Three's a Crowd", "Infestation Team", "Chomp", "Crystal Race", "Armageddon!"};
        field_o = "You are not currently logged in to the<nbsp>game.";
    }
}
