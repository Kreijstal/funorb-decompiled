/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tg {
    private byte[] field_b;
    static ci field_e;
    private int field_i;
    static boolean[] field_c;
    private long[] field_g;
    private int field_f;
    private long[] field_j;
    private long[] field_a;
    private long[] field_k;
    static String field_h;
    private long[] field_d;
    private byte[] field_m;
    static int field_l;

    private final void a(int param0) {
        int var2 = 0;
        int var3 = Terraphoenix.field_V;
        if (param0 != -31201) {
            Object var4 = null;
            this.a((byte) 63, 54L, (byte[]) null);
        }
        for (var2 = 0; var2 < 32; var2++) {
            ((tg) this).field_m[var2] = (byte) 0;
        }
        ((tg) this).field_i = 0;
        ((tg) this).field_f = 0;
        ((tg) this).field_b[0] = (byte) 0;
        for (var2 = 0; 8 > var2; var2++) {
            ((tg) this).field_k[var2] = 0L;
        }
    }

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var6 = Terraphoenix.field_V;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if (var2 >= 8) {
            var2 = 0;
            L1: while (true) {
              if (8 <= var2) {
                var2 = 1;
                L2: while (true) {
                  if (var2 > 10) {
                    var3 = 102 / ((param0 - 85) / 38);
                    var2 = 0;
                    L3: while (true) {
                      if (var2 >= 8) {
                        return;
                      } else {
                        ((tg) this).field_k[var2] = fb.a(((tg) this).field_k[var2], fb.a(((tg) this).field_g[var2], ((tg) this).field_a[var2]));
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
                          if (var3 >= 8) {
                            ((tg) this).field_j[0] = fb.a(((tg) this).field_j[0], fb.field_m[var2]);
                            var3 = 0;
                            L6: while (true) {
                              if (var3 >= 8) {
                                var3 = 0;
                                L7: while (true) {
                                  if (8 <= var3) {
                                    var2++;
                                    continue L2;
                                  } else {
                                    ((tg) this).field_g[var3] = ((tg) this).field_d[var3];
                                    var3++;
                                    continue L7;
                                  }
                                }
                              } else {
                                ((tg) this).field_d[var3] = ((tg) this).field_j[var3];
                                var7 = 0;
                                var4 = var7;
                                var5 = 56;
                                L8: while (true) {
                                  if (var7 >= 8) {
                                    var3++;
                                    continue L6;
                                  } else {
                                    ((tg) this).field_d[var3] = fb.a(((tg) this).field_d[var3], fb.field_n[var7][dg.a(255, (int)(((tg) this).field_g[dg.a(7, -var7 + var3)] >>> var5))]);
                                    var7++;
                                    var5 -= 8;
                                    continue L8;
                                  }
                                }
                              }
                            }
                          } else {
                            ((tg) this).field_j[var3] = ((tg) this).field_d[var3];
                            var3++;
                            continue L5;
                          }
                        }
                      } else {
                        ((tg) this).field_d[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L9: while (true) {
                          if (var4 >= 8) {
                            var3++;
                            continue L4;
                          } else {
                            ((tg) this).field_d[var3] = fb.a(((tg) this).field_d[var3], fb.field_n[var4][dg.a(255, (int)(((tg) this).field_j[dg.a(var3 - var4, 7)] >>> var5))]);
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
                ((tg) this).field_j[var2] = ((tg) this).field_k[var2];
                ((tg) this).field_g[var2] = fb.a(((tg) this).field_a[var2], ((tg) this).field_k[var2]);
                var2++;
                continue L1;
              }
            }
          } else {
            ((tg) this).field_a[var2] = fb.a(fb.a(fb.a(fb.a(wj.a(255L, (long)((tg) this).field_b[4 + var3]) << 24, fb.a(wj.a((long)((tg) this).field_b[var3 - -3] << 32, 1095216660480L), fb.a(wj.a((long)((tg) this).field_b[2 + var3] << 40, 280375465082880L), fb.a(wj.a((long)((tg) this).field_b[1 + var3], 255L) << 48, (long)((tg) this).field_b[var3] << 56)))), wj.a((long)((tg) this).field_b[var3 + 5], 255L) << 16), wj.a(65280L, (long)((tg) this).field_b[6 + var3] << 8)), wj.a(255L, (long)((tg) this).field_b[var3 + 7]));
            var2++;
            var3 += 8;
            continue L0;
          }
        }
    }

    private final void a(int param0, int param1, byte[] param2) {
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
        var8 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              ((tg) this).field_b[((tg) this).field_i] = (byte)ei.b((int) ((tg) this).field_b[((tg) this).field_i], 128 >>> dg.a(((tg) this).field_f, 7));
              ((tg) this).field_i = ((tg) this).field_i + 1;
              if (((tg) this).field_i > 32) {
                L2: while (true) {
                  if (64 <= ((tg) this).field_i) {
                    this.a((byte) -17);
                    ((tg) this).field_i = 0;
                    break L1;
                  } else {
                    int fieldTemp$2 = ((tg) this).field_i;
                    ((tg) this).field_i = ((tg) this).field_i + 1;
                    ((tg) this).field_b[fieldTemp$2] = (byte) 0;
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            L3: while (true) {
              if (((tg) this).field_i >= 32) {
                L4: {
                  ka.a(((tg) this).field_m, 0, ((tg) this).field_b, 32, 32);
                  this.a((byte) -67);
                  if (param1 == 4) {
                    break L4;
                  } else {
                    this.a((byte) -79);
                    break L4;
                  }
                }
                var4_int = 0;
                var5 = param0;
                L5: while (true) {
                  if (var4_int >= 8) {
                    break L0;
                  } else {
                    var6 = ((tg) this).field_k[var4_int];
                    param2[var5] = (byte)(int)(var6 >>> 56);
                    param2[var5 + 1] = (byte)(int)(var6 >>> 48);
                    param2[var5 + 2] = (byte)(int)(var6 >>> 40);
                    param2[var5 - -3] = (byte)(int)(var6 >>> 32);
                    param2[4 + var5] = (byte)(int)(var6 >>> 24);
                    param2[5 + var5] = (byte)(int)(var6 >>> 16);
                    param2[var5 + 6] = (byte)(int)(var6 >>> 8);
                    param2[7 + var5] = (byte)(int)var6;
                    var5 += 8;
                    var4_int++;
                    continue L5;
                  }
                }
              } else {
                int fieldTemp$3 = ((tg) this).field_i;
                ((tg) this).field_i = ((tg) this).field_i + 1;
                ((tg) this).field_b[fieldTemp$3] = (byte) 0;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var4;
            stackOut_14_1 = new StringBuilder().append("tg.A(").append(param0).append(44).append(param1).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L6;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
    }

    public static void b(int param0) {
        field_c = null;
        field_h = null;
        field_e = null;
    }

    private final void a(byte param0, long param1, byte[] param2) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var14 = Terraphoenix.field_V;
        try {
          L0: {
            var5_int = 0;
            var6 = 7 & -((int)param1 & 7) + 8;
            var7 = 7 & ((tg) this).field_f;
            var9 = param1;
            var11 = 37 % ((param0 - -35) / 47);
            var12 = 31;
            var13 = 0;
            L1: while (true) {
              if (var12 < 0) {
                L2: while (true) {
                  if (param1 <= 8L) {
                    L3: {
                      if (param1 <= 0L) {
                        var8 = 0;
                        break L3;
                      } else {
                        var8 = 255 & param2[var5_int] << var6;
                        ((tg) this).field_b[((tg) this).field_i] = (byte)ei.b((int) ((tg) this).field_b[((tg) this).field_i], var8 >>> var7);
                        break L3;
                      }
                    }
                    L4: {
                      if ((long)var7 + param1 >= 8L) {
                        L5: {
                          ((tg) this).field_i = ((tg) this).field_i + 1;
                          ((tg) this).field_f = ((tg) this).field_f + (-var7 + 8);
                          param1 = param1 - (long)(8 - var7);
                          if (512 == ((tg) this).field_f) {
                            this.a((byte) -101);
                            ((tg) this).field_i = 0;
                            ((tg) this).field_f = 0;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        ((tg) this).field_b[((tg) this).field_i] = (byte)dg.a(255, var8 << -var7 + 8);
                        ((tg) this).field_f = ((tg) this).field_f + (int)param1;
                        break L4;
                      } else {
                        ((tg) this).field_f = (int)((long)((tg) this).field_f + param1);
                        break L4;
                      }
                    }
                    break L0;
                  } else {
                    L6: {
                      var8 = param2[var5_int] << var6 & 255 | (255 & param2[var5_int - -1]) >>> -var6 + 8;
                      if (var8 < 0) {
                        break L6;
                      } else {
                        if (var8 < 256) {
                          L7: {
                            ((tg) this).field_b[((tg) this).field_i] = (byte)ei.b((int) ((tg) this).field_b[((tg) this).field_i], var8 >>> var7);
                            ((tg) this).field_i = ((tg) this).field_i + 1;
                            ((tg) this).field_f = ((tg) this).field_f + (-var7 + 8);
                            if (((tg) this).field_f != 512) {
                              break L7;
                            } else {
                              this.a((byte) 7);
                              ((tg) this).field_f = 0;
                              ((tg) this).field_i = 0;
                              break L7;
                            }
                          }
                          ((tg) this).field_b[((tg) this).field_i] = (byte)dg.a(var8 << -var7 + 8, 255);
                          param1 = param1 - 8L;
                          ((tg) this).field_f = ((tg) this).field_f + var7;
                          var5_int++;
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
                var13 = var13 + (((int)var9 & 255) + (((tg) this).field_m[var12] & 255));
                ((tg) this).field_m[var12] = (byte)var13;
                var13 = var13 >>> 8;
                var9 = var9 >>> 8;
                var12--;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var5;
            stackOut_22_1 = new StringBuilder().append("tg.D(").append(param0).append(44).append(param1).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 41);
        }
    }

    final static byte[] a(byte[] param0, int param1, int param2, int param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        int var5_int = 0;
        tg var5 = null;
        byte[] var6 = null;
        int var7 = 0;
        byte[] var8 = null;
        byte[] stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var7 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              if (0 < param2) {
                var8 = new byte[param1];
                var4 = var8;
                var5_int = 0;
                L2: while (true) {
                  if (param1 <= var5_int) {
                    break L1;
                  } else {
                    var8[var5_int] = param0[var5_int + param2];
                    var5_int++;
                    continue L2;
                  }
                }
              } else {
                var4 = param0;
                break L1;
              }
            }
            var5 = new tg();
            var5.a(-31201);
            var5.a((byte) 104, (long)(8 * param1), var4);
            var6 = new byte[64];
            var5.a(0, 4, var6);
            stackOut_6_0 = (byte[]) var6;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4_ref;
            stackOut_8_1 = new StringBuilder().append("tg.C(");
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
          throw qk.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 44 + param2 + 44 + 8 + 41);
        }
        return stackIn_7_0;
    }

    private tg() {
        ((tg) this).field_b = new byte[64];
        ((tg) this).field_i = 0;
        ((tg) this).field_f = 0;
        ((tg) this).field_j = new long[8];
        ((tg) this).field_a = new long[8];
        ((tg) this).field_g = new long[8];
        ((tg) this).field_d = new long[8];
        ((tg) this).field_k = new long[8];
        ((tg) this).field_m = new byte[32];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new boolean[64];
        field_h = "Your email address is used to identify this account";
    }
}
