/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class np {
    private int field_b;
    private long[] field_k;
    private long[] field_a;
    private long[] field_i;
    private long[] field_j;
    private byte[] field_e;
    private int field_f;
    static ck field_h;
    private long[] field_d;
    private byte[] field_g;
    static char field_c;

    final void b(int param0) {
        int var2 = 0;
        int var3 = Sumoblitz.field_L ? 1 : 0;
        for (var2 = 0; var2 < 32; var2++) {
            ((np) this).field_g[var2] = (byte) 0;
        }
        ((np) this).field_e[0] = (byte) 0;
        ((np) this).field_b = 0;
        if (param0 != -9) {
            return;
        }
        ((np) this).field_f = 0;
        for (var2 = 0; var2 < 8; var2++) {
            ((np) this).field_j[var2] = 0L;
        }
    }

    public static void a() {
        field_h = null;
    }

    final void a(int param0, byte[] param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              ((np) this).field_e[((np) this).field_f] = (byte)ic.a((int) ((np) this).field_e[((np) this).field_f], 128 >>> eb.a(7, ((np) this).field_b));
              ((np) this).field_f = ((np) this).field_f + 1;
              if (((np) this).field_f > 32) {
                L2: while (true) {
                  if (((np) this).field_f >= 64) {
                    int discarded$4 = 99;
                    this.b();
                    ((np) this).field_f = 0;
                    break L1;
                  } else {
                    int fieldTemp$5 = ((np) this).field_f;
                    ((np) this).field_f = ((np) this).field_f + 1;
                    ((np) this).field_e[fieldTemp$5] = (byte) 0;
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            L3: while (true) {
              if (((np) this).field_f >= 32) {
                if (param2 < -2) {
                  la.a(((np) this).field_g, 0, ((np) this).field_e, 32, 32);
                  int discarded$6 = 99;
                  this.b();
                  var4_int = 0;
                  var5 = param0;
                  L4: while (true) {
                    if (var4_int >= 8) {
                      break L0;
                    } else {
                      var6 = ((np) this).field_j[var4_int];
                      param1[var5] = (byte)(int)(var6 >>> 56);
                      param1[1 + var5] = (byte)(int)(var6 >>> 48);
                      param1[var5 - -2] = (byte)(int)(var6 >>> 40);
                      param1[3 + var5] = (byte)(int)(var6 >>> 32);
                      param1[var5 - -4] = (byte)(int)(var6 >>> 24);
                      param1[5 + var5] = (byte)(int)(var6 >>> 16);
                      param1[var5 - -6] = (byte)(int)(var6 >>> 8);
                      param1[var5 - -7] = (byte)(int)var6;
                      var4_int++;
                      var5 += 8;
                      continue L4;
                    }
                  }
                } else {
                  return;
                }
              } else {
                int fieldTemp$7 = ((np) this).field_f;
                ((np) this).field_f = ((np) this).field_f + 1;
                ((np) this).field_e[fieldTemp$7] = (byte) 0;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var4;
            stackOut_14_1 = new StringBuilder().append("np.D(").append(param0).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param2 + 41);
        }
    }

    private final void b() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var6 = Sumoblitz.field_L ? 1 : 0;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if (var2 >= 8) {
            var2 = 0;
            L1: while (true) {
              if (var2 >= 8) {
                var2 = 1;
                L2: while (true) {
                  if (var2 > 10) {
                    var2 = 0;
                    L3: while (true) {
                      if (var2 >= 8) {
                        return;
                      } else {
                        ((np) this).field_j[var2] = bi.a(((np) this).field_j[var2], bi.a(((np) this).field_d[var2], ((np) this).field_k[var2]));
                        var2++;
                        continue L3;
                      }
                    }
                  } else {
                    var3 = 0;
                    L4: while (true) {
                      if (8 <= var3) {
                        var3 = 0;
                        L5: while (true) {
                          if (8 <= var3) {
                            ((np) this).field_i[0] = bi.a(((np) this).field_i[0], ll.field_b[var2]);
                            var3 = 0;
                            L6: while (true) {
                              if (var3 >= 8) {
                                var3 = 0;
                                L7: while (true) {
                                  if (8 <= var3) {
                                    var2++;
                                    continue L2;
                                  } else {
                                    ((np) this).field_k[var3] = ((np) this).field_a[var3];
                                    var3++;
                                    continue L7;
                                  }
                                }
                              } else {
                                ((np) this).field_a[var3] = ((np) this).field_i[var3];
                                var7 = 0;
                                var4 = var7;
                                var5 = 56;
                                L8: while (true) {
                                  if (var7 >= 8) {
                                    var3++;
                                    continue L6;
                                  } else {
                                    ((np) this).field_a[var3] = bi.a(((np) this).field_a[var3], ll.field_a[var7][eb.a((int)(((np) this).field_k[eb.a(7, var3 + -var7)] >>> var5), 255)]);
                                    var5 -= 8;
                                    var7++;
                                    continue L8;
                                  }
                                }
                              }
                            }
                          } else {
                            ((np) this).field_i[var3] = ((np) this).field_a[var3];
                            var3++;
                            continue L5;
                          }
                        }
                      } else {
                        ((np) this).field_a[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L9: while (true) {
                          if (var4 >= 8) {
                            var3++;
                            continue L4;
                          } else {
                            ((np) this).field_a[var3] = bi.a(((np) this).field_a[var3], ll.field_a[var4][eb.a(255, (int)(((np) this).field_i[eb.a(var3 - var4, 7)] >>> var5))]);
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
                ((np) this).field_i[var2] = ((np) this).field_j[var2];
                ((np) this).field_k[var2] = bi.a(((np) this).field_d[var2], ((np) this).field_j[var2]);
                var2++;
                continue L1;
              }
            }
          } else {
            ((np) this).field_d[var2] = bi.a(bi.a(sd.a(65280L, (long)((np) this).field_e[6 + var3] << 8), bi.a(bi.a(bi.a(bi.a(bi.a((long)((np) this).field_e[var3] << 56, sd.a((long)((np) this).field_e[var3 + 1], 255L) << 48), sd.a(255L, (long)((np) this).field_e[2 + var3]) << 40), sd.a(255L, (long)((np) this).field_e[var3 + 3]) << 32), sd.a(255L, (long)((np) this).field_e[4 + var3]) << 24), sd.a(16711680L, (long)((np) this).field_e[5 + var3] << 16))), sd.a((long)((np) this).field_e[7 + var3], 255L));
            var3 += 8;
            var2++;
            continue L0;
          }
        }
    }

    final static boolean a(int param0) {
        if (param0 != 7) {
            field_c = 'ￃ';
        }
        return null == gk.field_o ? ii.field_a : true;
    }

    final void a(byte[] param0, int param1, long param2) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var13 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            var6 = 8 + -(7 & (int)param2) & param1;
            var7 = ((np) this).field_b & 7;
            var9 = param2;
            var11 = 31;
            var12 = 0;
            L1: while (true) {
              if (0 > var11) {
                L2: while (true) {
                  if (param2 <= 8L) {
                    L3: {
                      if (param2 <= 0L) {
                        var8 = 0;
                        break L3;
                      } else {
                        var8 = 255 & param0[var5_int] << var6;
                        ((np) this).field_e[((np) this).field_f] = (byte)ic.a((int) ((np) this).field_e[((np) this).field_f], var8 >>> var7);
                        break L3;
                      }
                    }
                    L4: {
                      if (param2 + (long)var7 < 8L) {
                        ((np) this).field_b = (int)((long)((np) this).field_b + param2);
                        break L4;
                      } else {
                        L5: {
                          ((np) this).field_f = ((np) this).field_f + 1;
                          ((np) this).field_b = ((np) this).field_b + (-var7 + 8);
                          param2 = param2 - (long)(-var7 + 8);
                          if (((np) this).field_b == 512) {
                            int discarded$2 = 99;
                            this.b();
                            ((np) this).field_b = 0;
                            ((np) this).field_f = 0;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        ((np) this).field_e[((np) this).field_f] = (byte)eb.a(255, var8 << 8 + -var7);
                        ((np) this).field_b = ((np) this).field_b + (int)param2;
                        break L4;
                      }
                    }
                    break L0;
                  } else {
                    L6: {
                      var8 = param0[var5_int] << var6 & 255 | (param0[var5_int + 1] & 255) >>> -var6 + 8;
                      if (var8 < 0) {
                        break L6;
                      } else {
                        if (256 <= var8) {
                          break L6;
                        } else {
                          L7: {
                            ((np) this).field_e[((np) this).field_f] = (byte)ic.a((int) ((np) this).field_e[((np) this).field_f], var8 >>> var7);
                            ((np) this).field_f = ((np) this).field_f + 1;
                            ((np) this).field_b = ((np) this).field_b + (-var7 + 8);
                            if (512 == ((np) this).field_b) {
                              int discarded$3 = 99;
                              this.b();
                              ((np) this).field_b = 0;
                              ((np) this).field_f = 0;
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          ((np) this).field_e[((np) this).field_f] = (byte)eb.a(var8 << -var7 + 8, 255);
                          param2 = param2 - 8L;
                          ((np) this).field_b = ((np) this).field_b + var7;
                          var5_int++;
                          continue L2;
                        }
                      }
                    }
                    throw new RuntimeException("LOGIC ERROR");
                  }
                }
              } else {
                var12 = var12 + ((255 & ((np) this).field_g[var11]) - -((int)var9 & 255));
                ((np) this).field_g[var11] = (byte)var12;
                var12 = var12 >>> 8;
                var9 = var9 >>> 8;
                var11--;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var5;
            stackOut_23_1 = new StringBuilder().append("np.F(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L8;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    np() {
        ((np) this).field_b = 0;
        ((np) this).field_a = new long[8];
        ((np) this).field_i = new long[8];
        ((np) this).field_k = new long[8];
        ((np) this).field_j = new long[8];
        ((np) this).field_f = 0;
        ((np) this).field_e = new byte[64];
        ((np) this).field_d = new long[8];
        ((np) this).field_g = new byte[32];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new ck();
    }
}
