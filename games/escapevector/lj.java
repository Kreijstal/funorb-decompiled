/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lj {
    static int field_f;
    private int field_b;
    private long[] field_e;
    private byte[] field_j;
    private long[] field_i;
    private int field_c;
    private long[] field_k;
    private long[] field_d;
    private byte[] field_h;
    private long[] field_a;
    static String field_g;

    final void a(long param0, byte[] param1, int param2) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Object var14 = null;
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
        var13 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              var5_int = 0;
              if (param2 == 2) {
                break L1;
              } else {
                var14 = null;
                ((lj) this).a(5, (byte[]) null, true);
                break L1;
              }
            }
            var6 = 7 & -(7 & (int)param0) + 8;
            var7 = 7 & ((lj) this).field_c;
            var9 = param0;
            var11 = 31;
            var12 = 0;
            L2: while (true) {
              if (0 > var11) {
                L3: while (true) {
                  if (param0 <= 8L) {
                    L4: {
                      if (0L < param0) {
                        var8 = 255 & param1[var5_int] << var6;
                        ((lj) this).field_h[((lj) this).field_b] = (byte)lb.a((int) ((lj) this).field_h[((lj) this).field_b], var8 >>> var7);
                        break L4;
                      } else {
                        var8 = 0;
                        break L4;
                      }
                    }
                    L5: {
                      if (8L > param0 + (long)var7) {
                        ((lj) this).field_c = (int)((long)((lj) this).field_c + param0);
                        break L5;
                      } else {
                        L6: {
                          ((lj) this).field_c = ((lj) this).field_c + (-var7 + 8);
                          ((lj) this).field_b = ((lj) this).field_b + 1;
                          param0 = param0 - (long)(8 - var7);
                          if (((lj) this).field_c == 512) {
                            this.a((byte) -34);
                            ((lj) this).field_c = 0;
                            ((lj) this).field_b = 0;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        ((lj) this).field_h[((lj) this).field_b] = (byte)ae.a(var8 << 8 + -var7, 255);
                        ((lj) this).field_c = ((lj) this).field_c + (int)param0;
                        break L5;
                      }
                    }
                    break L0;
                  } else {
                    L7: {
                      var8 = 255 & param1[var5_int] << var6 | (255 & param1[1 + var5_int]) >>> -var6 + 8;
                      if (var8 < 0) {
                        break L7;
                      } else {
                        if (var8 < 256) {
                          L8: {
                            ((lj) this).field_h[((lj) this).field_b] = (byte)lb.a((int) ((lj) this).field_h[((lj) this).field_b], var8 >>> var7);
                            ((lj) this).field_b = ((lj) this).field_b + 1;
                            ((lj) this).field_c = ((lj) this).field_c + (8 - var7);
                            if (((lj) this).field_c != 512) {
                              break L8;
                            } else {
                              this.a((byte) -41);
                              ((lj) this).field_c = 0;
                              ((lj) this).field_b = 0;
                              break L8;
                            }
                          }
                          ((lj) this).field_h[((lj) this).field_b] = (byte)ae.a(255, var8 << -var7 + 8);
                          param0 = param0 - 8L;
                          ((lj) this).field_c = ((lj) this).field_c + var7;
                          var5_int++;
                          continue L3;
                        } else {
                          break L7;
                        }
                      }
                    }
                    throw new RuntimeException("LOGIC ERROR");
                  }
                }
              } else {
                var12 = var12 + ((255 & (int)var9) + (((lj) this).field_j[var11] & 255));
                ((lj) this).field_j[var11] = (byte)var12;
                var9 = var9 >>> 8;
                var12 = var12 >>> 8;
                var11--;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var5;
            stackOut_24_1 = new StringBuilder().append("lj.C(").append(param0).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L9;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L9;
            }
          }
          throw t.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 44 + param2 + 41);
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            field_f = 69;
        }
        field_g = null;
    }

    final void b(boolean param0) {
        int var2 = 0;
        int var3 = EscapeVector.field_A;
        for (var2 = 0; var2 < 32; var2++) {
            ((lj) this).field_j[var2] = (byte) 0;
        }
        ((lj) this).field_b = 0;
        ((lj) this).field_h[0] = (byte) 0;
        ((lj) this).field_c = 0;
        var2 = 0;
        if (param0) {
            ((lj) this).field_d = null;
        }
        while (var2 < 8) {
            ((lj) this).field_k[var2] = 0L;
            var2++;
        }
    }

    final static void a(int param0, int param1) {
        rf.field_a = param0;
        if (param1 <= 11) {
            lj.a(false);
        }
    }

    final void a(int param0, byte[] param1, boolean param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        Object var9 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var8 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              ((lj) this).field_h[((lj) this).field_b] = (byte)lb.a((int) ((lj) this).field_h[((lj) this).field_b], 128 >>> ae.a(((lj) this).field_c, 7));
              ((lj) this).field_b = ((lj) this).field_b + 1;
              if (32 >= ((lj) this).field_b) {
                break L1;
              } else {
                L2: while (true) {
                  if (((lj) this).field_b >= 64) {
                    this.a((byte) -75);
                    ((lj) this).field_b = 0;
                    break L1;
                  } else {
                    int fieldTemp$2 = ((lj) this).field_b;
                    ((lj) this).field_b = ((lj) this).field_b + 1;
                    ((lj) this).field_h[fieldTemp$2] = (byte) 0;
                    continue L2;
                  }
                }
              }
            }
            L3: while (true) {
              if (32 <= ((lj) this).field_b) {
                L4: {
                  qg.a(((lj) this).field_j, 0, ((lj) this).field_h, 32, 32);
                  if (!param2) {
                    break L4;
                  } else {
                    var9 = null;
                    ((lj) this).a(105L, (byte[]) null, -56);
                    break L4;
                  }
                }
                this.a((byte) -95);
                var4_int = 0;
                var5 = param0;
                L5: while (true) {
                  if (var4_int >= 8) {
                    break L0;
                  } else {
                    var6 = ((lj) this).field_k[var4_int];
                    param1[var5] = (byte)(int)(var6 >>> 56);
                    param1[var5 + 1] = (byte)(int)(var6 >>> 48);
                    param1[var5 + 2] = (byte)(int)(var6 >>> 40);
                    param1[var5 - -3] = (byte)(int)(var6 >>> 32);
                    param1[4 + var5] = (byte)(int)(var6 >>> 24);
                    param1[5 + var5] = (byte)(int)(var6 >>> 16);
                    param1[6 + var5] = (byte)(int)(var6 >>> 8);
                    param1[var5 - -7] = (byte)(int)var6;
                    var4_int++;
                    var5 += 8;
                    continue L5;
                  }
                }
              } else {
                int fieldTemp$3 = ((lj) this).field_b;
                ((lj) this).field_b = ((lj) this).field_b + 1;
                ((lj) this).field_h[fieldTemp$3] = (byte) 0;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("lj.B(").append(param0).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          throw t.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param2 + 41);
        }
    }

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var6 = EscapeVector.field_A;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if (var2 >= 8) {
            var2 = 0;
            L1: while (true) {
              if (var2 >= 8) {
                L2: {
                  if (param0 <= -22) {
                    break L2;
                  } else {
                    ((lj) this).field_i = null;
                    break L2;
                  }
                }
                var2 = 1;
                L3: while (true) {
                  if (var2 > 10) {
                    var2 = 0;
                    L4: while (true) {
                      if (var2 >= 8) {
                        return;
                      } else {
                        ((lj) this).field_k[var2] = ja.a(((lj) this).field_k[var2], ja.a(((lj) this).field_i[var2], ((lj) this).field_d[var2]));
                        var2++;
                        continue L4;
                      }
                    }
                  } else {
                    var3 = 0;
                    L5: while (true) {
                      if (8 <= var3) {
                        var3 = 0;
                        L6: while (true) {
                          if (var3 >= 8) {
                            ((lj) this).field_e[0] = ja.a(((lj) this).field_e[0], tm.field_ab[var2]);
                            var3 = 0;
                            L7: while (true) {
                              if (var3 >= 8) {
                                var3 = 0;
                                L8: while (true) {
                                  if (var3 >= 8) {
                                    var2++;
                                    continue L3;
                                  } else {
                                    ((lj) this).field_d[var3] = ((lj) this).field_a[var3];
                                    var3++;
                                    continue L8;
                                  }
                                }
                              } else {
                                ((lj) this).field_a[var3] = ((lj) this).field_e[var3];
                                var7 = 0;
                                var4 = var7;
                                var5 = 56;
                                L9: while (true) {
                                  if (8 <= var7) {
                                    var3++;
                                    continue L7;
                                  } else {
                                    ((lj) this).field_a[var3] = ja.a(((lj) this).field_a[var3], tm.field_db[var7][ae.a((int)(((lj) this).field_d[ae.a(var3 + -var7, 7)] >>> var5), 255)]);
                                    var5 -= 8;
                                    var7++;
                                    continue L9;
                                  }
                                }
                              }
                            }
                          } else {
                            ((lj) this).field_e[var3] = ((lj) this).field_a[var3];
                            var3++;
                            continue L6;
                          }
                        }
                      } else {
                        ((lj) this).field_a[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L10: while (true) {
                          if (var4 >= 8) {
                            var3++;
                            continue L5;
                          } else {
                            ((lj) this).field_a[var3] = ja.a(((lj) this).field_a[var3], tm.field_db[var4][ae.a((int)(((lj) this).field_e[ae.a(7, var3 + -var4)] >>> var5), 255)]);
                            var5 -= 8;
                            var4++;
                            continue L10;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                ((lj) this).field_e[var2] = ((lj) this).field_k[var2];
                ((lj) this).field_d[var2] = ja.a(((lj) this).field_i[var2], ((lj) this).field_k[var2]);
                var2++;
                continue L1;
              }
            }
          } else {
            ((lj) this).field_i[var2] = ja.a(ja.a(fn.a((long)((lj) this).field_h[6 + var3] << 8, 65280L), ja.a(fn.a(16711680L, (long)((lj) this).field_h[5 + var3] << 16), ja.a(fn.a(255L, (long)((lj) this).field_h[var3 - -4]) << 24, ja.a(fn.a(255L, (long)((lj) this).field_h[3 + var3]) << 32, ja.a(fn.a(255L, (long)((lj) this).field_h[2 + var3]) << 40, ja.a(fn.a(71776119061217280L, (long)((lj) this).field_h[var3 + 1] << 48), (long)((lj) this).field_h[var3] << 56)))))), fn.a((long)((lj) this).field_h[7 + var3], 255L));
            var2++;
            var3 += 8;
            continue L0;
          }
        }
    }

    lj() {
        ((lj) this).field_e = new long[8];
        ((lj) this).field_k = new long[8];
        ((lj) this).field_j = new byte[32];
        ((lj) this).field_c = 0;
        ((lj) this).field_i = new long[8];
        ((lj) this).field_b = 0;
        ((lj) this).field_h = new byte[64];
        ((lj) this).field_d = new long[8];
        ((lj) this).field_a = new long[8];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = -1;
        field_g = "Change display name";
    }
}
