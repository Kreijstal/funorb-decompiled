/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rl {
    private byte[] field_c;
    private long[] field_b;
    private byte[] field_j;
    private int field_h;
    static String field_i;
    static int[] field_d;
    private long[] field_f;
    private long[] field_g;
    private long[] field_e;
    private long[] field_k;
    private int field_a;

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var6 = Transmogrify.field_A ? 1 : 0;
        if (param0 <= -86) {
          var2 = 0;
          var3 = 0;
          L0: while (true) {
            if (var2 >= 8) {
              var2 = 0;
              L1: while (true) {
                if (var2 >= 8) {
                  var2 = 1;
                  L2: while (true) {
                    if (10 < var2) {
                      var2 = 0;
                      L3: while (true) {
                        if (var2 >= 8) {
                          return;
                        } else {
                          ((rl) this).field_e[var2] = aj.a(((rl) this).field_e[var2], aj.a(((rl) this).field_g[var2], ((rl) this).field_b[var2]));
                          var2++;
                          continue L3;
                        }
                      }
                    } else {
                      var3 = 0;
                      L4: while (true) {
                        if (var3 >= 8) {
                          var3 = 0;
                          L5: while (true) {
                            if (8 <= var3) {
                              ((rl) this).field_f[0] = aj.a(((rl) this).field_f[0], dl.field_q[var2]);
                              var3 = 0;
                              L6: while (true) {
                                if (8 <= var3) {
                                  var3 = 0;
                                  L7: while (true) {
                                    if (var3 >= 8) {
                                      var2++;
                                      continue L2;
                                    } else {
                                      ((rl) this).field_g[var3] = ((rl) this).field_k[var3];
                                      var3++;
                                      continue L7;
                                    }
                                  }
                                } else {
                                  ((rl) this).field_k[var3] = ((rl) this).field_f[var3];
                                  var7 = 0;
                                  var4 = var7;
                                  var5 = 56;
                                  L8: while (true) {
                                    if (var7 >= 8) {
                                      var3++;
                                      continue L6;
                                    } else {
                                      ((rl) this).field_k[var3] = aj.a(((rl) this).field_k[var3], dl.field_n[var7][vg.c(255, (int)(((rl) this).field_g[vg.c(-var7 + var3, 7)] >>> var5))]);
                                      var5 -= 8;
                                      var7++;
                                      continue L8;
                                    }
                                  }
                                }
                              }
                            } else {
                              ((rl) this).field_f[var3] = ((rl) this).field_k[var3];
                              var3++;
                              continue L5;
                            }
                          }
                        } else {
                          ((rl) this).field_k[var3] = 0L;
                          var4 = 0;
                          var5 = 56;
                          L9: while (true) {
                            if (var4 >= 8) {
                              var3++;
                              continue L4;
                            } else {
                              ((rl) this).field_k[var3] = aj.a(((rl) this).field_k[var3], dl.field_n[var4][vg.c((int)(((rl) this).field_f[vg.c(var3 + -var4, 7)] >>> var5), 255)]);
                              var5 -= 8;
                              var4++;
                              continue L9;
                            }
                          }
                        }
                      }
                    }
                  }
                } else {
                  ((rl) this).field_f[var2] = ((rl) this).field_e[var2];
                  ((rl) this).field_g[var2] = aj.a(((rl) this).field_b[var2], ((rl) this).field_e[var2]);
                  var2++;
                  continue L1;
                }
              }
            } else {
              ((rl) this).field_b[var2] = aj.a(ej.a(255L, (long)((rl) this).field_j[7 + var3]), aj.a(aj.a(ej.a((long)((rl) this).field_j[5 + var3], 255L) << 16, aj.a(ej.a(4278190080L, (long)((rl) this).field_j[var3 - -4] << 24), aj.a(aj.a(ej.a(280375465082880L, (long)((rl) this).field_j[var3 + 2] << 40), aj.a((long)((rl) this).field_j[var3] << 56, ej.a((long)((rl) this).field_j[1 + var3] << 48, 71776119061217280L))), ej.a(255L, (long)((rl) this).field_j[var3 - -3]) << 32))), ej.a((long)((rl) this).field_j[6 + var3] << 8, 65280L)));
              var3 += 8;
              var2++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    final static int b() {
        we.field_j.a(false);
        if (!oh.field_h.c((byte) 124)) {
            return ai.a(2);
        }
        return 0;
    }

    final static boolean a(int param0, int param1, int param2, ci param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var5 = param3.a((byte) -93, param0, param2);
            var4 = var5;
            if (var5 == null) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4_ref;
            stackOut_5_1 = new StringBuilder().append("rl.B(").append(param0).append(44).append(0).append(44).append(param2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_3_0 != 0;
    }

    public static void b(int param0) {
        field_i = null;
        field_d = null;
    }

    final void a(int param0, long param1, byte[] param2) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var13 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (param0 == 14027) {
              var5_int = 0;
              var6 = 7 & 8 + -(7 & (int)param1);
              var7 = 7 & ((rl) this).field_h;
              var9 = param1;
              var11 = 31;
              var12 = 0;
              L1: while (true) {
                if (var11 < 0) {
                  L2: while (true) {
                    if (param1 <= 8L) {
                      L3: {
                        if (param1 > 0L) {
                          var8 = param2[var5_int] << var6 & 255;
                          ((rl) this).field_j[((rl) this).field_a] = (byte)cl.b((int) ((rl) this).field_j[((rl) this).field_a], var8 >>> var7);
                          break L3;
                        } else {
                          var8 = 0;
                          break L3;
                        }
                      }
                      L4: {
                        if (8L <= param1 + (long)var7) {
                          L5: {
                            param1 = param1 - (long)(-var7 + 8);
                            ((rl) this).field_h = ((rl) this).field_h + (-var7 + 8);
                            ((rl) this).field_a = ((rl) this).field_a + 1;
                            if (((rl) this).field_h == 512) {
                              this.a((byte) -94);
                              ((rl) this).field_a = 0;
                              ((rl) this).field_h = 0;
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          ((rl) this).field_j[((rl) this).field_a] = (byte)vg.c(255, var8 << -var7 + 8);
                          ((rl) this).field_h = ((rl) this).field_h + (int)param1;
                          break L4;
                        } else {
                          ((rl) this).field_h = (int)((long)((rl) this).field_h + param1);
                          break L4;
                        }
                      }
                      break L0;
                    } else {
                      L6: {
                        var8 = 255 & param2[var5_int] << var6 | (255 & param2[1 + var5_int]) >>> -var6 + 8;
                        if (var8 < 0) {
                          break L6;
                        } else {
                          if (256 > var8) {
                            L7: {
                              ((rl) this).field_j[((rl) this).field_a] = (byte)cl.b((int) ((rl) this).field_j[((rl) this).field_a], var8 >>> var7);
                              ((rl) this).field_h = ((rl) this).field_h + (-var7 + 8);
                              ((rl) this).field_a = ((rl) this).field_a + 1;
                              if (((rl) this).field_h != 512) {
                                break L7;
                              } else {
                                this.a((byte) -97);
                                ((rl) this).field_h = 0;
                                ((rl) this).field_a = 0;
                                break L7;
                              }
                            }
                            ((rl) this).field_j[((rl) this).field_a] = (byte)vg.c(var8 << 8 + -var7, 255);
                            var5_int++;
                            param1 = param1 - 8L;
                            ((rl) this).field_h = ((rl) this).field_h + var7;
                            continue L2;
                          } else {
                            break L6;
                          }
                        }
                      }
                      throw new RuntimeException("LOGIC ERROR");
                    }
                  }
                } else {
                  var12 = var12 + ((((rl) this).field_c[var11] & 255) - -(255 & (int)var9));
                  ((rl) this).field_c[var11] = (byte)var12;
                  var9 = var9 >>> 8;
                  var12 = var12 >>> 8;
                  var11--;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var5;
            stackOut_24_1 = new StringBuilder().append("rl.F(").append(param0).append(44).append(param1).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L8;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 41);
        }
    }

    final void a(byte[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              ((rl) this).field_j[((rl) this).field_a] = (byte)cl.b((int) ((rl) this).field_j[((rl) this).field_a], 128 >>> vg.c(((rl) this).field_h, 7));
              ((rl) this).field_a = ((rl) this).field_a + 1;
              if (((rl) this).field_a <= 32) {
                break L1;
              } else {
                L2: while (true) {
                  if (((rl) this).field_a >= 64) {
                    this.a((byte) -87);
                    ((rl) this).field_a = 0;
                    break L1;
                  } else {
                    int fieldTemp$2 = ((rl) this).field_a;
                    ((rl) this).field_a = ((rl) this).field_a + 1;
                    ((rl) this).field_j[fieldTemp$2] = (byte) 0;
                    continue L2;
                  }
                }
              }
            }
            L3: while (true) {
              if (((rl) this).field_a >= 32) {
                ji.a(((rl) this).field_c, 0, ((rl) this).field_j, 32, 32);
                this.a((byte) -119);
                var4_int = 0;
                var5 = param2;
                if (param1 > 51) {
                  L4: while (true) {
                    if (var4_int >= 8) {
                      break L0;
                    } else {
                      var6 = ((rl) this).field_e[var4_int];
                      param0[var5] = (byte)(int)(var6 >>> 56);
                      param0[1 + var5] = (byte)(int)(var6 >>> 48);
                      param0[2 + var5] = (byte)(int)(var6 >>> 40);
                      param0[var5 + 3] = (byte)(int)(var6 >>> 32);
                      param0[4 + var5] = (byte)(int)(var6 >>> 24);
                      param0[5 + var5] = (byte)(int)(var6 >>> 16);
                      param0[6 + var5] = (byte)(int)(var6 >>> 8);
                      param0[7 + var5] = (byte)(int)var6;
                      var5 += 8;
                      var4_int++;
                      continue L4;
                    }
                  }
                } else {
                  return;
                }
              } else {
                int fieldTemp$3 = ((rl) this).field_a;
                ((rl) this).field_a = ((rl) this).field_a + 1;
                ((rl) this).field_j[fieldTemp$3] = (byte) 0;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("rl.C(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    rl() {
        ((rl) this).field_h = 0;
        ((rl) this).field_b = new long[8];
        ((rl) this).field_f = new long[8];
        ((rl) this).field_j = new byte[64];
        ((rl) this).field_e = new long[8];
        ((rl) this).field_g = new long[8];
        ((rl) this).field_k = new long[8];
        ((rl) this).field_c = new byte[32];
        ((rl) this).field_a = 0;
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = Transmogrify.field_A ? 1 : 0;
        for (var2 = 0; var2 < 32; var2++) {
            ((rl) this).field_c[var2] = (byte) 0;
        }
        ((rl) this).field_a = 0;
        ((rl) this).field_h = 0;
        ((rl) this).field_j[0] = (byte) 0;
        if (param0 != 15298) {
            ((rl) this).field_g = null;
        }
        for (var2 = 0; var2 < 8; var2++) {
            ((rl) this).field_e[var2] = 0L;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Achieved";
        field_d = new int[8192];
    }
}
