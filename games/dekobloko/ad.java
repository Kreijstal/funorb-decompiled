/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad {
    private int field_w;
    byte[][] field_l;
    static int field_a;
    int[][] field_v;
    oc field_e;
    oc[] field_o;
    static ck field_d;
    int[] field_k;
    int field_m;
    int[] field_y;
    int field_n;
    int field_s;
    int[] field_f;
    static String field_b;
    private int[][] field_r;
    private int[] field_p;
    private byte[] field_h;
    static String field_A;
    int[] field_c;
    static w field_q;
    static ck[][] field_j;
    int[] field_B;
    static ck field_g;
    static String field_t;
    static int field_u;
    static int[] field_i;
    static String field_x;
    static String field_z;

    public static void a(byte param0) {
        field_b = null;
        field_d = null;
        field_j = (ck[][]) null;
        field_i = null;
        field_A = null;
        field_z = null;
        field_x = null;
        field_q = null;
        field_g = null;
        field_t = null;
        if (param0 != -67) {
            field_g = (ck) null;
        }
    }

    final static void a(int param0, int param1) {
        if (param0 != -1) {
            field_q = (w) null;
        }
        uf var2 = we.field_b;
        var2.f(param1, -4);
        var2.a(true, 1);
        var2.a(true, 0);
    }

    final static String a(ji param0, String param1, boolean param2, String param3) {
        RuntimeException var4 = null;
        byte[] var5 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0.a((byte) 121)) {
              L1: {
                if (param2) {
                  break L1;
                } else {
                  var5 = (byte[]) null;
                  ad.a((byte[]) null, -41, true, 8, -58, true);
                  break L1;
                }
              }
              stackIn_6_0 = param3 + " - " + param0.b((byte) -89) + "%";
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (String) (param1);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("ad.B(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_10_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_6_0;
        }
    }

    final static void a(byte[] param0, int param1, boolean param2, int param3, int param4, boolean param5) {
        uf var6 = null;
        int var7 = 0;
        int var8 = 0;
        try {
            var6 = we.field_b;
            var6.f(param1, -4);
            var6.field_n = var6.field_n + 1;
            var7 = var6.field_n;
            var6.a(param2, 4);
            var6.a(param2, param3);
            var8 = param4;
            if (param5) {
                var8 += 128;
            }
            var6.a(param2, var8);
            var6.a(false, param0.length, param0, 0);
            var6.b(-var7 + var6.field_n, param2);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "ad.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final void a(byte[] param0, int param1) {
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
        RuntimeException stackIn_95_0 = null;
        StringBuilder stackIn_95_1 = null;
        RuntimeException stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        String stackIn_96_2 = null;
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
        wl var17 = null;
        byte[] var21 = null;
        var16 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var17 = new wl(i.a(param0, -89));
              var4 = var17.d((byte) -114);
              if ((var4 ^ -1) > -6) {
                break L1;
              } else {
                if (-8 <= (var4 ^ -1)) {
                  L2: {
                    if (-7 >= (var4 ^ -1)) {
                      this.field_m = var17.i(param1 ^ 7553);
                      break L2;
                    } else {
                      this.field_m = 0;
                      break L2;
                    }
                  }
                  L3: {
                    var5 = var17.d((byte) -46);
                    if ((var5 & 1) == 0) {
                      stackIn_11_0 = 0;
                      break L3;
                    } else {
                      stackIn_11_0 = 1;
                      break L3;
                    }
                  }
                  L4: {
                    var6 = stackIn_11_0;
                    if ((var5 & 2) == 0) {
                      stackIn_14_0 = 0;
                      break L4;
                    } else {
                      stackIn_14_0 = 1;
                      break L4;
                    }
                  }
                  L5: {
                    var7 = stackIn_14_0;
                    if (7 <= var4) {
                      this.field_w = var17.f(21663);
                      break L5;
                    } else {
                      this.field_w = var17.e(param1 + 3);
                      break L5;
                    }
                  }
                  L6: {
                    var8 = 0;
                    var9 = -1;
                    this.field_f = new int[this.field_w];
                    if (-8 < (var4 ^ -1)) {
                      var10 = 0;
                      L7: while (true) {
                        if (this.field_w <= var10) {
                          break L6;
                        } else {
                          dupTemp$0 = var8 + var17.e(qm.b(param1, 3));
                          var8 = dupTemp$0;
                          this.field_f[var10] = dupTemp$0;
                          if (this.field_f[var10] > var9) {
                            var9 = this.field_f[var10];
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
                        if (this.field_w <= var10) {
                          break L6;
                        } else {
                          dupTemp$1 = var8 + var17.f(21663);
                          var8 = dupTemp$1;
                          this.field_f[var10] = dupTemp$1;
                          if ((this.field_f[var10] ^ -1) < (var9 ^ -1)) {
                            var9 = this.field_f[var10];
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
                    this.field_n = var9 - -1;
                    this.field_y = new int[this.field_n];
                    if (var7 != 0) {
                      this.field_l = new byte[this.field_n][];
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    this.field_c = new int[this.field_n];
                    this.field_v = new int[this.field_n][];
                    this.field_B = new int[this.field_n];
                    this.field_k = new int[this.field_n];
                    if (var6 == 0) {
                      break L10;
                    } else {
                      this.field_p = new int[this.field_n];
                      var10 = 0;
                      L11: while (true) {
                        if (this.field_n <= var10) {
                          var10 = 0;
                          L12: while (true) {
                            if (this.field_w <= var10) {
                              this.field_e = new oc(this.field_p);
                              break L10;
                            } else {
                              this.field_p[this.field_f[var10]] = var17.i(param1 + 7553);
                              var10++;
                              continue L12;
                            }
                          }
                        } else {
                          this.field_p[var10] = -1;
                          var10++;
                          continue L11;
                        }
                      }
                    }
                  }
                  var10 = param1;
                  L13: while (true) {
                    if (this.field_w <= var10) {
                      L14: {
                        if (var7 == 0) {
                          break L14;
                        } else {
                          var10 = 0;
                          L15: while (true) {
                            if (var10 >= this.field_w) {
                              break L14;
                            } else {
                              var21 = new byte[64];
                              var17.a(var21, 0, (byte) 125, 64);
                              this.field_l[this.field_f[var10]] = var21;
                              var10++;
                              continue L15;
                            }
                          }
                        }
                      }
                      var10 = 0;
                      L16: while (true) {
                        if (this.field_w <= var10) {
                          L17: {
                            if (-8 >= (var4 ^ -1)) {
                              var10 = 0;
                              L18: while (true) {
                                if (this.field_w <= var10) {
                                  var10 = 0;
                                  L19: while (true) {
                                    if (this.field_w <= var10) {
                                      break L17;
                                    } else {
                                      var11 = this.field_f[var10];
                                      var12 = this.field_B[var11];
                                      var8 = 0;
                                      array$2 = new int[var12];
                                      this.field_v[var11] = array$2;
                                      var13 = -1;
                                      var14 = 0;
                                      L20: while (true) {
                                        if (var14 >= var12) {
                                          L21: {
                                            this.field_k[var11] = 1 + var13;
                                            if (var13 - -1 == var12) {
                                              this.field_v[var11] = null;
                                              break L21;
                                            } else {
                                              break L21;
                                            }
                                          }
                                          var10++;
                                          continue L19;
                                        } else {
                                          L22: {
                                            dupTemp$3 = var8 + var17.f(21663);
                                            var8 = dupTemp$3;
                                            dupTemp$4 = this.field_v[var11];
                                            dupTemp$4[var14] = dupTemp$3;
                                            var15 = dupTemp$3;
                                            if (var15 > var13) {
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
                                  this.field_B[this.field_f[var10]] = var17.f(21663);
                                  var10++;
                                  continue L18;
                                }
                              }
                            } else {
                              var10 = 0;
                              L23: while (true) {
                                if (var10 >= this.field_w) {
                                  var10 = 0;
                                  L24: while (true) {
                                    if (this.field_w <= var10) {
                                      break L17;
                                    } else {
                                      var11 = this.field_f[var10];
                                      var12 = this.field_B[var11];
                                      var8 = 0;
                                      var13 = -1;
                                      array$5 = new int[var12];
                                      this.field_v[var11] = array$5;
                                      var14 = 0;
                                      L25: while (true) {
                                        if (var14 >= var12) {
                                          L26: {
                                            this.field_k[var11] = 1 + var13;
                                            if (1 + var13 == var12) {
                                              this.field_v[var11] = null;
                                              break L26;
                                            } else {
                                              break L26;
                                            }
                                          }
                                          var10++;
                                          continue L24;
                                        } else {
                                          dupTemp$6 = var8 + var17.e(3);
                                          var8 = dupTemp$6;
                                          dupTemp$7 = this.field_v[var11];
                                          dupTemp$7[var14] = dupTemp$6;
                                          var15 = dupTemp$6;
                                          if ((var15 ^ -1) < (var13 ^ -1)) {
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
                                  this.field_B[this.field_f[var10]] = var17.e(3);
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
                              this.field_o = new oc[var9 + 1];
                              this.field_r = new int[var9 + 1][];
                              var10 = 0;
                              L28: while (true) {
                                if (this.field_w <= var10) {
                                  break L27;
                                } else {
                                  var11 = this.field_f[var10];
                                  var12 = this.field_B[var11];
                                  array$8 = new int[this.field_k[var11]];
                                  this.field_r[var11] = array$8;
                                  var13 = 0;
                                  L29: while (true) {
                                    if (this.field_k[var11] <= var13) {
                                      var13 = 0;
                                      L30: while (true) {
                                        if (var13 >= var12) {
                                          this.field_o[var11] = new oc(this.field_r[var11]);
                                          var10++;
                                          continue L28;
                                        } else {
                                          L31: {
                                            if (null != this.field_v[var11]) {
                                              var14 = this.field_v[var11][var13];
                                              break L31;
                                            } else {
                                              var14 = var13;
                                              break L31;
                                            }
                                          }
                                          this.field_r[var11][var14] = var17.i(qm.b(param1, 7553));
                                          var13++;
                                          continue L30;
                                        }
                                      }
                                    } else {
                                      this.field_r[var11][var13] = -1;
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
                          this.field_y[this.field_f[var10]] = var17.i(7553);
                          var10++;
                          continue L16;
                        }
                      }
                    } else {
                      this.field_c[this.field_f[var10]] = var17.i(7553);
                      var10++;
                      continue L13;
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
          L32: {
            var3 = decompiledCaughtException;
            stackIn_95_0 = (RuntimeException) (var3);

            stackIn_95_1 = new StringBuilder().append("ad.D(");

            if (param0 == null) {
              stackIn_96_0 = (RuntimeException) ((Object) stackIn_95_0);
              stackIn_96_1 = (StringBuilder) ((Object) stackIn_95_1);
              stackIn_96_2 = "null";
              break L32;
            } else {
              stackIn_96_0 = (RuntimeException) ((Object) stackIn_95_0);
              stackIn_96_1 = (StringBuilder) ((Object) stackIn_95_1);
              stackIn_96_2 = "{...}";
              break L32;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_96_0), stackIn_96_2 + ',' + param1 + ')');
        }
    }

    ad(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
            this.field_s = tj.a(param0.length, 0, param0);
            if (this.field_s != param1) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if (param2.length != 64) {
                    throw new RuntimeException();
                }
                this.field_h = um.a(0, param0, 0, param0.length);
                for (var4_int = 0; (var4_int ^ -1) > -65; var4_int++) {
                    if (param2[var4_int] != this.field_h[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            this.a(param0, 0);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "ad.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = "Please enter a year between <%0> and <%1>";
        field_d = new ck(18, 18);
        field_j = new ck[8][];
        field_A = "<%0> wants to join";
        field_t = "Your email address is used to identify this account";
        field_u = 0;
        field_z = "Achievements This Session";
    }
}
