/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bm {
    static String field_p;
    private int field_h;
    int field_g;
    int field_m;
    int[] field_q;
    int field_b;
    int[] field_k;
    private byte[] field_c;
    static int field_j;
    byte[][] field_r;
    private int[][] field_e;
    int[] field_i;
    int[][] field_o;
    am[] field_f;
    int[] field_t;
    private int[] field_d;
    am field_n;
    static int field_s;
    static int field_u;
    static nf[] field_l;
    int[] field_a;

    final static int[] a(int param0, byte param1, int param2) {
        int var3 = bh.a((byte) 69, param0);
        int var4 = fi.a(param0, 2048);
        int var5 = bh.a((byte) 101, param2);
        int var6 = fi.a(param2, 2048);
        int var7 = (int)((long)var3 * (long)var5 >> -758261296);
        int var8 = (int)((long)var6 * (long)var3 >> 1699857424);
        int var9 = (int)((long)var4 * (long)var5 >> -962179184);
        int var10 = (int)((long)var6 * (long)var4 >> 582575632);
        if (param1 > -65) {
            return (int[]) null;
        }
        return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
    }

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
        int stackIn_14_0 = 0;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        String stackIn_98_2 = null;
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
        byte[] var17 = null;
        qc var18 = null;
        byte[] var22 = null;
        var16 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              var18 = new qc(v.a(param1, -1));
              var4 = var18.c((byte) 34);
              if (5 > var4) {
                break L1;
              } else {
                if ((var4 ^ -1) >= -8) {
                  L2: {
                    if (-7 < (var4 ^ -1)) {
                      this.field_g = 0;
                      break L2;
                    } else {
                      this.field_g = var18.a((byte) -121);
                      break L2;
                    }
                  }
                  L3: {
                    var5 = var18.c((byte) 34);
                    if (0 == (1 & var5)) {
                      stackIn_11_0 = 0;
                      break L3;
                    } else {
                      stackIn_11_0 = 1;
                      break L3;
                    }
                  }
                  L4: {
                    var6 = stackIn_11_0;
                    if ((2 & var5) == 0) {
                      stackIn_14_0 = 0;
                      break L4;
                    } else {
                      stackIn_14_0 = 1;
                      break L4;
                    }
                  }
                  L5: {
                    var7 = stackIn_14_0;
                    if (-8 >= (var4 ^ -1)) {
                      this.field_h = var18.d((byte) -27);
                      break L5;
                    } else {
                      this.field_h = var18.b(true);
                      break L5;
                    }
                  }
                  L6: {
                    var8 = 0;
                    this.field_i = new int[this.field_h];
                    var9 = -1;
                    if (7 <= var4) {
                      var10 = 0;
                      L7: while (true) {
                        if (var10 >= this.field_h) {
                          break L6;
                        } else {
                          L8: {
                            dupTemp$0 = var8 + var18.d((byte) -27);
                            var8 = dupTemp$0;
                            this.field_i[var10] = dupTemp$0;
                            if (this.field_i[var10] > var9) {
                              var9 = this.field_i[var10];
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
                        if (this.field_h <= var10) {
                          break L6;
                        } else {
                          L10: {
                            dupTemp$1 = var8 + var18.b(true);
                            var8 = dupTemp$1;
                            this.field_i[var10] = dupTemp$1;
                            if (var9 < this.field_i[var10]) {
                              var9 = this.field_i[var10];
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          var10++;
                          continue L9;
                        }
                      }
                    }
                  }
                  L11: {
                    this.field_b = 1 + var9;
                    if (var7 != 0) {
                      this.field_r = new byte[this.field_b][];
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    this.field_q = new int[this.field_b];
                    this.field_a = new int[this.field_b];
                    this.field_t = new int[this.field_b];
                    this.field_k = new int[this.field_b];
                    this.field_o = new int[this.field_b][];
                    if (var6 == 0) {
                      break L12;
                    } else {
                      this.field_d = new int[this.field_b];
                      var10 = 0;
                      L13: while (true) {
                        if (this.field_b <= var10) {
                          var10 = 0;
                          L14: while (true) {
                            if (var10 >= this.field_h) {
                              this.field_n = new am(this.field_d);
                              break L12;
                            } else {
                              this.field_d[this.field_i[var10]] = var18.a((byte) -76);
                              var10++;
                              continue L14;
                            }
                          }
                        } else {
                          this.field_d[var10] = -1;
                          var10++;
                          continue L13;
                        }
                      }
                    }
                  }
                  var10 = 0;
                  L15: while (true) {
                    if (var10 >= this.field_h) {
                      L16: {
                        if (var7 == 0) {
                          break L16;
                        } else {
                          var10 = 0;
                          L17: while (true) {
                            if (this.field_h <= var10) {
                              break L16;
                            } else {
                              var22 = new byte[64];
                              var18.b(29915, 64, var22, 0);
                              this.field_r[this.field_i[var10]] = var22;
                              var10++;
                              continue L17;
                            }
                          }
                        }
                      }
                      L18: {
                        var10 = 0;
                        if (param0 >= 109) {
                          break L18;
                        } else {
                          var17 = (byte[]) null;
                          this.a((byte) -96, (byte[]) null);
                          break L18;
                        }
                      }
                      L19: while (true) {
                        if (this.field_h <= var10) {
                          L20: {
                            if (var4 >= 7) {
                              var10 = 0;
                              L21: while (true) {
                                if (var10 >= this.field_h) {
                                  var10 = 0;
                                  L22: while (true) {
                                    if (this.field_h <= var10) {
                                      break L20;
                                    } else {
                                      var11 = this.field_i[var10];
                                      var8 = 0;
                                      var12 = this.field_a[var11];
                                      var13 = -1;
                                      array$2 = new int[var12];
                                      this.field_o[var11] = array$2;
                                      var14 = 0;
                                      L23: while (true) {
                                        if (var12 <= var14) {
                                          L24: {
                                            this.field_k[var11] = var13 + 1;
                                            if (var12 != 1 + var13) {
                                              break L24;
                                            } else {
                                              this.field_o[var11] = null;
                                              break L24;
                                            }
                                          }
                                          var10++;
                                          continue L22;
                                        } else {
                                          L25: {
                                            dupTemp$3 = var8 + var18.d((byte) -27);
                                            var8 = dupTemp$3;
                                            dupTemp$4 = this.field_o[var11];
                                            dupTemp$4[var14] = dupTemp$3;
                                            var15 = dupTemp$3;
                                            if ((var13 ^ -1) > (var15 ^ -1)) {
                                              var13 = var15;
                                              break L25;
                                            } else {
                                              break L25;
                                            }
                                          }
                                          var14++;
                                          continue L23;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  this.field_a[this.field_i[var10]] = var18.d((byte) -27);
                                  var10++;
                                  continue L21;
                                }
                              }
                            } else {
                              var10 = 0;
                              L26: while (true) {
                                if (this.field_h <= var10) {
                                  var10 = 0;
                                  L27: while (true) {
                                    if (var10 >= this.field_h) {
                                      break L20;
                                    } else {
                                      var11 = this.field_i[var10];
                                      var8 = 0;
                                      var12 = this.field_a[var11];
                                      array$5 = new int[var12];
                                      this.field_o[var11] = array$5;
                                      var13 = -1;
                                      var14 = 0;
                                      L28: while (true) {
                                        if (var12 <= var14) {
                                          L29: {
                                            this.field_k[var11] = var13 - -1;
                                            if (var12 != 1 + var13) {
                                              break L29;
                                            } else {
                                              this.field_o[var11] = null;
                                              break L29;
                                            }
                                          }
                                          var10++;
                                          continue L27;
                                        } else {
                                          dupTemp$6 = var8 + var18.b(true);
                                          var8 = dupTemp$6;
                                          dupTemp$7 = this.field_o[var11];
                                          dupTemp$7[var14] = dupTemp$6;
                                          var15 = dupTemp$6;
                                          if ((var13 ^ -1) > (var15 ^ -1)) {
                                            var13 = var15;
                                            var14++;
                                            continue L28;
                                          } else {
                                            var14++;
                                            continue L28;
                                          }
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  this.field_a[this.field_i[var10]] = var18.b(true);
                                  var10++;
                                  continue L26;
                                }
                              }
                            }
                          }
                          L30: {
                            if (var6 != 0) {
                              this.field_e = new int[var9 - -1][];
                              this.field_f = new am[1 + var9];
                              var10 = 0;
                              L31: while (true) {
                                if (var10 >= this.field_h) {
                                  break L30;
                                } else {
                                  var11 = this.field_i[var10];
                                  var12 = this.field_a[var11];
                                  array$8 = new int[this.field_k[var11]];
                                  this.field_e[var11] = array$8;
                                  var13 = 0;
                                  L32: while (true) {
                                    if (this.field_k[var11] <= var13) {
                                      var13 = 0;
                                      L33: while (true) {
                                        if (var13 >= var12) {
                                          this.field_f[var11] = new am(this.field_e[var11]);
                                          var10++;
                                          continue L31;
                                        } else {
                                          L34: {
                                            if (this.field_o[var11] != null) {
                                              var14 = this.field_o[var11][var13];
                                              break L34;
                                            } else {
                                              var14 = var13;
                                              break L34;
                                            }
                                          }
                                          this.field_e[var11][var14] = var18.a((byte) -78);
                                          var13++;
                                          continue L33;
                                        }
                                      }
                                    } else {
                                      this.field_e[var11][var13] = -1;
                                      var13++;
                                      continue L32;
                                    }
                                  }
                                }
                              }
                            } else {
                              break L30;
                            }
                          }
                          break L0;
                        } else {
                          this.field_t[this.field_i[var10]] = var18.a((byte) -110);
                          var10++;
                          continue L19;
                        }
                      }
                    } else {
                      this.field_q[this.field_i[var10]] = var18.a((byte) -95);
                      var10++;
                      continue L15;
                    }
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
          L35: {
            var3 = decompiledCaughtException;
            stackIn_97_0 = (RuntimeException) (var3);

            stackIn_97_1 = new StringBuilder().append("bm.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_98_0 = (RuntimeException) ((Object) stackIn_97_0);
              stackIn_98_1 = (StringBuilder) ((Object) stackIn_97_1);
              stackIn_98_2 = "null";
              break L35;
            } else {
              stackIn_98_0 = (RuntimeException) ((Object) stackIn_97_0);
              stackIn_98_1 = (StringBuilder) ((Object) stackIn_97_1);
              stackIn_98_2 = "{...}";
              break L35;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_98_0), stackIn_98_2 + ')');
        }
    }

    final static void a(ai param0, int param1, int param2) {
        pk var7 = null;
        pk var8 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = Geoblox.field_C;
        try {
            var7 = fj.field_q;
            var8 = var7;
            var8.a(param1, (byte) -125);
            var8.field_f = var8.field_f + 1;
            var4 = var8.field_f;
            var8.d((byte) 122, 1);
            var8.e(param0.field_q, 28695);
            var8.e(param0.field_f, 28695);
            var8.e(param0.field_k, 28695);
            var8.c((byte) 95, param0.field_m);
            var8.c((byte) 95, param0.field_g);
            var8.c((byte) 95, param0.field_j);
            if (param2 > -126) {
                field_j = 61;
            }
            var8.c((byte) 95, param0.field_i);
            var8.d((byte) 126, param0.field_o.length);
            for (var5 = 0; var5 < param0.field_o.length; var5++) {
                var7.c((byte) 95, param0.field_o[var5]);
            }
            var8.d(78, var4);
            var8.f(11700, -var4 + var8.field_f);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "bm.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        field_l = null;
        field_p = null;
        int var1 = -24 % ((param0 - -88) / 36);
    }

    bm(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
            this.field_m = gg.a(param0, 107, param0.length);
            if (param1 != this.field_m) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if ((param2.length ^ -1) != -65) {
                    throw new RuntimeException();
                }
                this.field_c = wh.a(param0.length, 0, param0, 8);
                for (var4_int = 0; 64 > var4_int; var4_int++) {
                    if (this.field_c[var4_int] != param2[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            this.a((byte) 119, param0);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "bm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_p = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_j = 20;
    }
}
