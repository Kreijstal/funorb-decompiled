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
        int var7 = (int)((long)var3 * (long)var5 >> 16);
        int var8 = (int)((long)var6 * (long)var3 >> 16);
        int var9 = (int)((long)var4 * (long)var5 >> 16);
        int var10 = (int)((long)var6 * (long)var4 >> 16);
        if (param1 > -65) {
            return null;
        }
        return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
    }

    private final void a(byte param0, byte[] param1) {
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
        Object var17 = null;
        qc var18 = null;
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
        var16 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              var18 = new qc(v.a(param1, -1));
              var4 = var18.c((byte) 34);
              if (5 > var4) {
                break L1;
              } else {
                if (var4 <= 7) {
                  L2: {
                    if (var4 < 6) {
                      ((bm) this).field_g = 0;
                      break L2;
                    } else {
                      ((bm) this).field_g = var18.a((byte) -121);
                      break L2;
                    }
                  }
                  L3: {
                    var5 = var18.c((byte) 34);
                    if (0 == (1 & var5)) {
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
                    if (var4 >= 7) {
                      ((bm) this).field_h = var18.d((byte) -27);
                      break L5;
                    } else {
                      ((bm) this).field_h = var18.b(true);
                      break L5;
                    }
                  }
                  L6: {
                    var8 = 0;
                    ((bm) this).field_i = new int[((bm) this).field_h];
                    var9 = -1;
                    if (7 <= var4) {
                      var10 = 0;
                      L7: while (true) {
                        if (var10 >= ((bm) this).field_h) {
                          break L6;
                        } else {
                          L8: {
                            int dupTemp$4 = var8 + var18.d((byte) -27);
                            var8 = dupTemp$4;
                            ((bm) this).field_i[var10] = dupTemp$4;
                            if (((bm) this).field_i[var10] > var9) {
                              var9 = ((bm) this).field_i[var10];
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
                        if (((bm) this).field_h <= var10) {
                          break L6;
                        } else {
                          L10: {
                            int dupTemp$5 = var8 + var18.b(true);
                            var8 = dupTemp$5;
                            ((bm) this).field_i[var10] = dupTemp$5;
                            if (var9 < ((bm) this).field_i[var10]) {
                              var9 = ((bm) this).field_i[var10];
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
                    ((bm) this).field_b = 1 + var9;
                    if (var7 != 0) {
                      ((bm) this).field_r = new byte[((bm) this).field_b][];
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    ((bm) this).field_q = new int[((bm) this).field_b];
                    ((bm) this).field_a = new int[((bm) this).field_b];
                    ((bm) this).field_t = new int[((bm) this).field_b];
                    ((bm) this).field_k = new int[((bm) this).field_b];
                    ((bm) this).field_o = new int[((bm) this).field_b][];
                    if (var6 == 0) {
                      break L12;
                    } else {
                      ((bm) this).field_d = new int[((bm) this).field_b];
                      var10 = 0;
                      L13: while (true) {
                        if (~((bm) this).field_b >= ~var10) {
                          var10 = 0;
                          L14: while (true) {
                            if (var10 >= ((bm) this).field_h) {
                              ((bm) this).field_n = new am(((bm) this).field_d);
                              break L12;
                            } else {
                              ((bm) this).field_d[((bm) this).field_i[var10]] = var18.a((byte) -76);
                              var10++;
                              continue L14;
                            }
                          }
                        } else {
                          ((bm) this).field_d[var10] = -1;
                          var10++;
                          continue L13;
                        }
                      }
                    }
                  }
                  var10 = 0;
                  L15: while (true) {
                    if (~var10 <= ~((bm) this).field_h) {
                      L16: {
                        if (var7 == 0) {
                          break L16;
                        } else {
                          var10 = 0;
                          L17: while (true) {
                            if (((bm) this).field_h <= var10) {
                              break L16;
                            } else {
                              var22 = new byte[64];
                              var18.b(29915, 64, var22, 0);
                              ((bm) this).field_r[((bm) this).field_i[var10]] = var22;
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
                          var17 = null;
                          this.a((byte) -96, (byte[]) null);
                          break L18;
                        }
                      }
                      L19: while (true) {
                        if (((bm) this).field_h <= var10) {
                          L20: {
                            if (var4 >= 7) {
                              var10 = 0;
                              L21: while (true) {
                                if (~var10 <= ~((bm) this).field_h) {
                                  var10 = 0;
                                  L22: while (true) {
                                    if (((bm) this).field_h <= var10) {
                                      break L20;
                                    } else {
                                      var11 = ((bm) this).field_i[var10];
                                      var8 = 0;
                                      var12 = ((bm) this).field_a[var11];
                                      var13 = -1;
                                      ((bm) this).field_o[var11] = new int[var12];
                                      var14 = 0;
                                      L23: while (true) {
                                        if (~var12 >= ~var14) {
                                          L24: {
                                            ((bm) this).field_k[var11] = var13 + 1;
                                            if (~var12 != ~(1 + var13)) {
                                              break L24;
                                            } else {
                                              ((bm) this).field_o[var11] = null;
                                              break L24;
                                            }
                                          }
                                          var10++;
                                          continue L22;
                                        } else {
                                          L25: {
                                            int dupTemp$6 = var8 + var18.d((byte) -27);
                                            var8 = dupTemp$6;
                                            ((bm) this).field_o[var11][var14] = dupTemp$6;
                                            var15 = dupTemp$6;
                                            if (~var13 > ~var15) {
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
                                  ((bm) this).field_a[((bm) this).field_i[var10]] = var18.d((byte) -27);
                                  var10++;
                                  continue L21;
                                }
                              }
                            } else {
                              var10 = 0;
                              L26: while (true) {
                                if (((bm) this).field_h <= var10) {
                                  var10 = 0;
                                  L27: while (true) {
                                    if (~var10 <= ~((bm) this).field_h) {
                                      break L20;
                                    } else {
                                      var11 = ((bm) this).field_i[var10];
                                      var8 = 0;
                                      var12 = ((bm) this).field_a[var11];
                                      ((bm) this).field_o[var11] = new int[var12];
                                      var13 = -1;
                                      var14 = 0;
                                      L28: while (true) {
                                        if (~var12 >= ~var14) {
                                          L29: {
                                            ((bm) this).field_k[var11] = var13 - -1;
                                            if (~var12 != ~(1 + var13)) {
                                              break L29;
                                            } else {
                                              ((bm) this).field_o[var11] = null;
                                              break L29;
                                            }
                                          }
                                          var10++;
                                          continue L27;
                                        } else {
                                          L30: {
                                            int dupTemp$7 = var8 + var18.b(true);
                                            var8 = dupTemp$7;
                                            ((bm) this).field_o[var11][var14] = dupTemp$7;
                                            var15 = dupTemp$7;
                                            if (~var13 <= ~var15) {
                                              break L30;
                                            } else {
                                              var13 = var15;
                                              break L30;
                                            }
                                          }
                                          var14++;
                                          continue L28;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  ((bm) this).field_a[((bm) this).field_i[var10]] = var18.b(true);
                                  var10++;
                                  continue L26;
                                }
                              }
                            }
                          }
                          L31: {
                            if (var6 != 0) {
                              ((bm) this).field_e = new int[var9 - -1][];
                              ((bm) this).field_f = new am[1 + var9];
                              var10 = 0;
                              L32: while (true) {
                                if (~var10 <= ~((bm) this).field_h) {
                                  break L31;
                                } else {
                                  var11 = ((bm) this).field_i[var10];
                                  var12 = ((bm) this).field_a[var11];
                                  ((bm) this).field_e[var11] = new int[((bm) this).field_k[var11]];
                                  var13 = 0;
                                  L33: while (true) {
                                    if (((bm) this).field_k[var11] <= var13) {
                                      var13 = 0;
                                      L34: while (true) {
                                        if (var13 >= var12) {
                                          ((bm) this).field_f[var11] = new am(((bm) this).field_e[var11]);
                                          var10++;
                                          continue L32;
                                        } else {
                                          L35: {
                                            if (((bm) this).field_o[var11] != null) {
                                              var14 = ((bm) this).field_o[var11][var13];
                                              break L35;
                                            } else {
                                              var14 = var13;
                                              break L35;
                                            }
                                          }
                                          ((bm) this).field_e[var11][var14] = var18.a((byte) -78);
                                          var13++;
                                          continue L34;
                                        }
                                      }
                                    } else {
                                      ((bm) this).field_e[var11][var13] = -1;
                                      var13++;
                                      continue L33;
                                    }
                                  }
                                }
                              }
                            } else {
                              break L31;
                            }
                          }
                          break L0;
                        } else {
                          ((bm) this).field_t[((bm) this).field_i[var10]] = var18.a((byte) -110);
                          var10++;
                          continue L19;
                        }
                      }
                    } else {
                      ((bm) this).field_q[((bm) this).field_i[var10]] = var18.a((byte) -95);
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
          L36: {
            var3 = decompiledCaughtException;
            stackOut_95_0 = (RuntimeException) var3;
            stackOut_95_1 = new StringBuilder().append("bm.A(").append(param0).append(44);
            stackIn_97_0 = stackOut_95_0;
            stackIn_97_1 = stackOut_95_1;
            stackIn_96_0 = stackOut_95_0;
            stackIn_96_1 = stackOut_95_1;
            if (param1 == null) {
              stackOut_97_0 = (RuntimeException) (Object) stackIn_97_0;
              stackOut_97_1 = (StringBuilder) (Object) stackIn_97_1;
              stackOut_97_2 = "null";
              stackIn_98_0 = stackOut_97_0;
              stackIn_98_1 = stackOut_97_1;
              stackIn_98_2 = stackOut_97_2;
              break L36;
            } else {
              stackOut_96_0 = (RuntimeException) (Object) stackIn_96_0;
              stackOut_96_1 = (StringBuilder) (Object) stackIn_96_1;
              stackOut_96_2 = "{...}";
              stackIn_98_0 = stackOut_96_0;
              stackIn_98_1 = stackOut_96_1;
              stackIn_98_2 = stackOut_96_2;
              break L36;
            }
          }
          throw t.a((Throwable) (Object) stackIn_98_0, stackIn_98_2 + 41);
        }
    }

    final static void a(ai param0, int param1, int param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        pk var7 = null;
        pk var8 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var6 = Geoblox.field_C;
        try {
          L0: {
            L1: {
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
              if (param2 <= -126) {
                break L1;
              } else {
                field_j = 61;
                break L1;
              }
            }
            var8.c((byte) 95, param0.field_i);
            var8.d((byte) 126, param0.field_o.length);
            var5 = 0;
            L2: while (true) {
              if (var5 >= param0.field_o.length) {
                int discarded$1 = var8.d(78, var4);
                var8.f(11700, -var4 + var8.field_f);
                break L0;
              } else {
                var7.c((byte) 95, param0.field_o[var5]);
                var5++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("bm.C(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw t.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    public static void a(int param0) {
        field_l = null;
        field_p = null;
        int var1 = -4;
    }

    bm(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
            ((bm) this).field_m = gg.a(param0, 107, param0.length);
            if (param1 != ((bm) this).field_m) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if (param2.length != 64) {
                    throw new RuntimeException();
                }
                ((bm) this).field_c = wh.a(param0.length, 0, param0, 8);
                for (var4_int = 0; 64 > var4_int; var4_int++) {
                    if (((bm) this).field_c[var4_int] != param2[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            this.a((byte) 119, param0);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "bm.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_j = 20;
    }
}
