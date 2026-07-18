/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fi {
    private long[] field_d;
    private byte[] field_g;
    private long[] field_h;
    private long[] field_b;
    static String field_j;
    static o[] field_a;
    private byte[] field_e;
    private long[] field_i;
    private long[] field_k;
    private int field_f;
    private int field_c;

    final static void a(sd param0, int param1) {
        jd var3 = null;
        try {
            var3 = id.field_c;
            var3.e(param1, -2147483648);
            var3.c(1, 5);
            var3.c(-113, 0);
            var3.a(true, param0.field_o);
            var3.c(50, param0.field_k);
            var3.c(61, param0.field_l);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "fi.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + -24045 + ')');
        }
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4, int param5, int param6) {
        int discarded$0 = 2;
        uj.a(638, param5, 1, h.field_d, param6);
        int discarded$1 = 2;
        uj.a(param3, 118, (638 - param3 >> 1) + 1, of.field_b, param6 - 50);
        th.field_H.d((638 + -param3 >> 1) - 19, -10 + param6);
        uk.field_k.d(-18 + param3 + ((-param3 + 638 >> 1) + 1), param6 - 10);
    }

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    private final void c() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var6 = SolKnight.field_L ? 1 : 0;
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
                        ((fi) this).field_d[var2] = ke.a(((fi) this).field_d[var2], ke.a(((fi) this).field_i[var2], ((fi) this).field_k[var2]));
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
                            ((fi) this).field_b[0] = ke.a(((fi) this).field_b[0], ie.field_g[var2]);
                            var3 = 0;
                            L6: while (true) {
                              if (var3 >= 8) {
                                var3 = 0;
                                L7: while (true) {
                                  if (var3 >= 8) {
                                    var2++;
                                    continue L2;
                                  } else {
                                    ((fi) this).field_i[var3] = ((fi) this).field_h[var3];
                                    var3++;
                                    continue L7;
                                  }
                                }
                              } else {
                                ((fi) this).field_h[var3] = ((fi) this).field_b[var3];
                                var7 = 0;
                                var4 = var7;
                                var5 = 56;
                                L8: while (true) {
                                  if (8 <= var7) {
                                    var3++;
                                    continue L6;
                                  } else {
                                    ((fi) this).field_h[var3] = ke.a(((fi) this).field_h[var3], ie.field_c[var7][fi.a(255, (int)(((fi) this).field_i[fi.a(7, -var7 + var3)] >>> var5))]);
                                    var5 -= 8;
                                    var7++;
                                    continue L8;
                                  }
                                }
                              }
                            }
                          } else {
                            ((fi) this).field_b[var3] = ((fi) this).field_h[var3];
                            var3++;
                            continue L5;
                          }
                        }
                      } else {
                        ((fi) this).field_h[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L9: while (true) {
                          if (var4 >= 8) {
                            var3++;
                            continue L4;
                          } else {
                            ((fi) this).field_h[var3] = ke.a(((fi) this).field_h[var3], ie.field_c[var4][fi.a(255, (int)(((fi) this).field_b[fi.a(7, var3 + -var4)] >>> var5))]);
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
                ((fi) this).field_b[var2] = ((fi) this).field_d[var2];
                ((fi) this).field_i[var2] = ke.a(((fi) this).field_k[var2], ((fi) this).field_d[var2]);
                var2++;
                continue L1;
              }
            }
          } else {
            ((fi) this).field_k[var2] = ke.a(tk.a((long)((fi) this).field_g[var3 + 7], 255L), ke.a(tk.a((long)((fi) this).field_g[6 + var3] << 8, 65280L), ke.a(tk.a((long)((fi) this).field_g[5 + var3], 255L) << 16, ke.a(ke.a(tk.a(255L, (long)((fi) this).field_g[3 + var3]) << 32, ke.a(ke.a((long)((fi) this).field_g[var3] << 56, tk.a((long)((fi) this).field_g[1 + var3], 255L) << 48), tk.a((long)((fi) this).field_g[var3 - -2] << 40, 280375465082880L))), tk.a(255L, (long)((fi) this).field_g[4 + var3]) << 24))));
            var3 += 8;
            var2++;
            continue L0;
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_j = null;
        if (param0 != -18120) {
            field_a = null;
        }
    }

    final static String a() {
        if (!(gf.field_Z != ma.field_o)) {
            return lf.field_e;
        }
        return ec.field_j;
    }

    final void b(byte param0) {
        int var2 = 0;
        int var3 = SolKnight.field_L ? 1 : 0;
        for (var2 = 0; var2 < 32; var2++) {
            ((fi) this).field_e[var2] = (byte) 0;
        }
        if (param0 < 95) {
            fi.a(-125);
        }
        ((fi) this).field_f = 0;
        ((fi) this).field_c = 0;
        ((fi) this).field_g[0] = (byte) 0;
        for (var2 = 0; var2 < 8; var2++) {
            ((fi) this).field_d[var2] = 0L;
        }
    }

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
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var13 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            var6 = -((int)param0 & 7) + 8 & 7;
            var7 = ((fi) this).field_f & 7;
            var9 = param0;
            var11 = 31;
            var12 = 0;
            L1: while (true) {
              if (var11 < 0) {
                L2: while (true) {
                  if (8L >= param0) {
                    L3: {
                      if ((long)param2 >= param0) {
                        var8 = 0;
                        break L3;
                      } else {
                        var8 = 255 & param1[var5_int] << var6;
                        ((fi) this).field_g[((fi) this).field_c] = (byte)qk.a((int) ((fi) this).field_g[((fi) this).field_c], var8 >>> var7);
                        break L3;
                      }
                    }
                    L4: {
                      if (param0 + (long)var7 >= 8L) {
                        L5: {
                          ((fi) this).field_f = ((fi) this).field_f + (8 + -var7);
                          ((fi) this).field_c = ((fi) this).field_c + 1;
                          param0 = param0 - (long)(8 + -var7);
                          if (512 != ((fi) this).field_f) {
                            break L5;
                          } else {
                            int discarded$2 = 24843;
                            this.c();
                            ((fi) this).field_c = 0;
                            ((fi) this).field_f = 0;
                            break L5;
                          }
                        }
                        ((fi) this).field_g[((fi) this).field_c] = (byte)fi.a(var8 << -var7 + 8, 255);
                        ((fi) this).field_f = ((fi) this).field_f + (int)param0;
                        break L4;
                      } else {
                        ((fi) this).field_f = (int)((long)((fi) this).field_f + param0);
                        break L4;
                      }
                    }
                    break L0;
                  } else {
                    L6: {
                      var8 = 255 & param1[var5_int] << var6 | (param1[var5_int - -1] & 255) >>> 8 - var6;
                      if (var8 < 0) {
                        break L6;
                      } else {
                        if (var8 < 256) {
                          L7: {
                            ((fi) this).field_g[((fi) this).field_c] = (byte)qk.a((int) ((fi) this).field_g[((fi) this).field_c], var8 >>> var7);
                            ((fi) this).field_c = ((fi) this).field_c + 1;
                            ((fi) this).field_f = ((fi) this).field_f + (8 - var7);
                            if (((fi) this).field_f != 512) {
                              break L7;
                            } else {
                              int discarded$3 = 24843;
                              this.c();
                              ((fi) this).field_c = 0;
                              ((fi) this).field_f = 0;
                              break L7;
                            }
                          }
                          ((fi) this).field_g[((fi) this).field_c] = (byte)fi.a(255, var8 << -var7 + 8);
                          var5_int++;
                          ((fi) this).field_f = ((fi) this).field_f + var7;
                          param0 = param0 - 8L;
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
                var12 = var12 + ((255 & (int)var9) + (((fi) this).field_e[var11] & 255));
                ((fi) this).field_e[var11] = (byte)var12;
                var9 = var9 >>> 8;
                var12 = var12 >>> 8;
                var11--;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var5;
            stackOut_21_1 = new StringBuilder().append("fi.B(").append(param0).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L8;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param2 + ')');
        }
    }

    final static o[] b() {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = SolKnight.field_L ? 1 : 0;
        o[] var1 = new o[nb.field_c];
        for (var2 = 0; nb.field_c > var2; var2++) {
            var3 = uj.field_b[var2] * sa.field_l[var2];
            var4 = jc.field_c[var2];
            var5 = new int[var3];
            for (var6 = 0; var3 > var6; var6++) {
                var5[var6] = ig.field_H[fi.a((int) var4[var6], 255)];
            }
            var1[var2] = new o(kl.field_a, we.field_e, ph.field_h[var2], qf.field_d[var2], sa.field_l[var2], uj.field_b[var2], var5);
        }
        int discarded$0 = -97;
        og.a();
        return var1;
    }

    fi() {
        ((fi) this).field_b = new long[8];
        ((fi) this).field_e = new byte[32];
        ((fi) this).field_i = new long[8];
        ((fi) this).field_k = new long[8];
        ((fi) this).field_g = new byte[64];
        ((fi) this).field_f = 0;
        ((fi) this).field_h = new long[8];
        ((fi) this).field_d = new long[8];
        ((fi) this).field_c = 0;
    }

    final void a(byte[] param0, int param1, byte param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        Object var9 = null;
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
        var8 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              ((fi) this).field_g[((fi) this).field_c] = (byte)qk.a((int) ((fi) this).field_g[((fi) this).field_c], 128 >>> fi.a(7, ((fi) this).field_f));
              ((fi) this).field_c = ((fi) this).field_c + 1;
              if (param2 >= 106) {
                break L1;
              } else {
                var9 = null;
                ((fi) this).a((byte[]) null, 111, (byte) -30);
                break L1;
              }
            }
            L2: {
              if (((fi) this).field_c > 32) {
                L3: while (true) {
                  if (64 <= ((fi) this).field_c) {
                    int discarded$4 = 24843;
                    this.c();
                    ((fi) this).field_c = 0;
                    break L2;
                  } else {
                    int fieldTemp$5 = ((fi) this).field_c;
                    ((fi) this).field_c = ((fi) this).field_c + 1;
                    ((fi) this).field_g[fieldTemp$5] = (byte) 0;
                    continue L3;
                  }
                }
              } else {
                break L2;
              }
            }
            L4: while (true) {
              if (((fi) this).field_c >= 32) {
                fk.a(((fi) this).field_e, 0, ((fi) this).field_g, 32, 32);
                int discarded$6 = 24843;
                this.c();
                var4_int = 0;
                var5 = param1;
                L5: while (true) {
                  if (var4_int >= 8) {
                    break L0;
                  } else {
                    var6 = ((fi) this).field_d[var4_int];
                    param0[var5] = (byte)(int)(var6 >>> 56);
                    param0[1 + var5] = (byte)(int)(var6 >>> 48);
                    param0[2 + var5] = (byte)(int)(var6 >>> 40);
                    param0[3 + var5] = (byte)(int)(var6 >>> 32);
                    param0[var5 + 4] = (byte)(int)(var6 >>> 24);
                    param0[5 + var5] = (byte)(int)(var6 >>> 16);
                    param0[6 + var5] = (byte)(int)(var6 >>> 8);
                    param0[var5 + 7] = (byte)(int)var6;
                    var5 += 8;
                    var4_int++;
                    continue L5;
                  }
                }
              } else {
                int fieldTemp$7 = ((fi) this).field_c;
                ((fi) this).field_c = ((fi) this).field_c + 1;
                ((fi) this).field_g[fieldTemp$7] = (byte) 0;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var4;
            stackOut_14_1 = new StringBuilder().append("fi.H(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
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
          throw fc.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Unfortunately we are unable to create an account for you at this time.";
    }
}
