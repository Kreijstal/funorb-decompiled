/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fd {
    private long[] field_b;
    private int field_i;
    private long[] field_d;
    private long[] field_g;
    private int field_h;
    private long[] field_l;
    private long[] field_a;
    static ok field_k;
    static nf field_e;
    private byte[] field_f;
    private byte[] field_c;
    static boolean field_j;

    final void a(long param0, int param1, byte[] param2) {
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
        var13 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            var6 = param1 + -((int)param0 & 7) & 7;
            var7 = ((fd) this).field_h & 7;
            var9 = param0;
            var11 = 31;
            var12 = 0;
            L1: while (true) {
              if (var11 < 0) {
                L2: while (true) {
                  if (param0 <= 8L) {
                    L3: {
                      if (0L < param0) {
                        var8 = 255 & param2[var5_int] << var6;
                        ((fd) this).field_f[((fd) this).field_i] = (byte)nl.a((int) ((fd) this).field_f[((fd) this).field_i], var8 >>> var7);
                        break L3;
                      } else {
                        var8 = 0;
                        break L3;
                      }
                    }
                    L4: {
                      if ((long)var7 + param0 < 8L) {
                        ((fd) this).field_h = (int)((long)((fd) this).field_h + param0);
                        break L4;
                      } else {
                        L5: {
                          ((fd) this).field_h = ((fd) this).field_h + (-var7 + 8);
                          param0 = param0 - (long)(-var7 + 8);
                          ((fd) this).field_i = ((fd) this).field_i + 1;
                          if (512 != ((fd) this).field_h) {
                            break L5;
                          } else {
                            this.a(6704);
                            ((fd) this).field_i = 0;
                            ((fd) this).field_h = 0;
                            break L5;
                          }
                        }
                        ((fd) this).field_f[((fd) this).field_i] = (byte)va.a(var8 << -var7 + 8, 255);
                        ((fd) this).field_h = ((fd) this).field_h + (int)param0;
                        break L4;
                      }
                    }
                    break L0;
                  } else {
                    L6: {
                      var8 = 255 & param2[var5_int] << var6 | (param2[var5_int - -1] & 255) >>> 8 - var6;
                      if (var8 < 0) {
                        break L6;
                      } else {
                        if (var8 < 256) {
                          L7: {
                            ((fd) this).field_f[((fd) this).field_i] = (byte)nl.a((int) ((fd) this).field_f[((fd) this).field_i], var8 >>> var7);
                            ((fd) this).field_i = ((fd) this).field_i + 1;
                            ((fd) this).field_h = ((fd) this).field_h + (-var7 + 8);
                            if (((fd) this).field_h != 512) {
                              break L7;
                            } else {
                              this.a(6704);
                              ((fd) this).field_h = 0;
                              ((fd) this).field_i = 0;
                              break L7;
                            }
                          }
                          ((fd) this).field_f[((fd) this).field_i] = (byte)va.a(var8 << 8 + -var7, 255);
                          var5_int++;
                          ((fd) this).field_h = ((fd) this).field_h + var7;
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
                var12 = var12 + (((int)var9 & 255) + (255 & ((fd) this).field_c[var11]));
                ((fd) this).field_c[var11] = (byte)var12;
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
            stackOut_21_1 = new StringBuilder().append("fd.E(").append(param0).append(44).append(param1).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param2 == null) {
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
          throw sd.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 41);
        }
    }

    final static void c(byte param0) {
        if (param0 < 33) {
            fd.c((byte) 94);
        }
        ah.field_U = 0;
    }

    public static void a(byte param0) {
        field_k = null;
        field_e = null;
        if (param0 >= -107) {
            fd.a((byte) -117);
        }
    }

    final void a(byte[] param0, int param1, byte param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
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
        var8 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              ((fd) this).field_f[((fd) this).field_i] = (byte)nl.a((int) ((fd) this).field_f[((fd) this).field_i], 128 >>> va.a(((fd) this).field_h, 7));
              ((fd) this).field_i = ((fd) this).field_i + 1;
              if (32 >= ((fd) this).field_i) {
                break L1;
              } else {
                L2: while (true) {
                  if (((fd) this).field_i >= 64) {
                    this.a(6704);
                    ((fd) this).field_i = 0;
                    break L1;
                  } else {
                    int fieldTemp$2 = ((fd) this).field_i;
                    ((fd) this).field_i = ((fd) this).field_i + 1;
                    ((fd) this).field_f[fieldTemp$2] = (byte) 0;
                    continue L2;
                  }
                }
              }
            }
            L3: while (true) {
              if (32 <= ((fd) this).field_i) {
                lj.a(((fd) this).field_c, 0, ((fd) this).field_f, 32, 32);
                this.a(param2 + 6701);
                var4_int = 0;
                var5 = param1;
                L4: while (true) {
                  if (var4_int >= 8) {
                    L5: {
                      if (param2 == 3) {
                        break L5;
                      } else {
                        ((fd) this).field_f = null;
                        break L5;
                      }
                    }
                    break L0;
                  } else {
                    var6 = ((fd) this).field_g[var4_int];
                    param0[var5] = (byte)(int)(var6 >>> 56);
                    param0[var5 + 1] = (byte)(int)(var6 >>> 48);
                    param0[2 + var5] = (byte)(int)(var6 >>> 40);
                    param0[var5 + 3] = (byte)(int)(var6 >>> 32);
                    param0[4 + var5] = (byte)(int)(var6 >>> 24);
                    param0[5 + var5] = (byte)(int)(var6 >>> 16);
                    param0[6 + var5] = (byte)(int)(var6 >>> 8);
                    param0[var5 - -7] = (byte)(int)var6;
                    var5 += 8;
                    var4_int++;
                    continue L4;
                  }
                }
              } else {
                int fieldTemp$3 = ((fd) this).field_i;
                ((fd) this).field_i = ((fd) this).field_i + 1;
                ((fd) this).field_f[fieldTemp$3] = (byte) 0;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("fd.A(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
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
          throw sd.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    private final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        var6 = Confined.field_J ? 1 : 0;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if (var2 >= 8) {
            var2 = 0;
            L1: while (true) {
              if (var2 >= 8) {
                L2: {
                  if (param0 == 6704) {
                    break L2;
                  } else {
                    var7 = null;
                    ((fd) this).a(82L, -97, (byte[]) null);
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
                        ((fd) this).field_g[var2] = pa.a(((fd) this).field_g[var2], pa.a(((fd) this).field_b[var2], ((fd) this).field_d[var2]));
                        var2++;
                        continue L4;
                      }
                    }
                  } else {
                    var3 = 0;
                    L5: while (true) {
                      if (var3 >= 8) {
                        var3 = 0;
                        L6: while (true) {
                          if (var3 >= 8) {
                            ((fd) this).field_l[0] = pa.a(((fd) this).field_l[0], ib.field_V[var2]);
                            var3 = 0;
                            L7: while (true) {
                              if (var3 >= 8) {
                                var3 = 0;
                                L8: while (true) {
                                  if (var3 >= 8) {
                                    var2++;
                                    continue L3;
                                  } else {
                                    ((fd) this).field_b[var3] = ((fd) this).field_a[var3];
                                    var3++;
                                    continue L8;
                                  }
                                }
                              } else {
                                ((fd) this).field_a[var3] = ((fd) this).field_l[var3];
                                var8 = 0;
                                var4 = var8;
                                var5 = 56;
                                L9: while (true) {
                                  if (8 <= var8) {
                                    var3++;
                                    continue L7;
                                  } else {
                                    ((fd) this).field_a[var3] = pa.a(((fd) this).field_a[var3], ib.field_T[var8][va.a((int)(((fd) this).field_b[va.a(-var8 + var3, 7)] >>> var5), 255)]);
                                    var8++;
                                    var5 -= 8;
                                    continue L9;
                                  }
                                }
                              }
                            }
                          } else {
                            ((fd) this).field_l[var3] = ((fd) this).field_a[var3];
                            var3++;
                            continue L6;
                          }
                        }
                      } else {
                        ((fd) this).field_a[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L10: while (true) {
                          if (var4 >= 8) {
                            var3++;
                            continue L5;
                          } else {
                            ((fd) this).field_a[var3] = pa.a(((fd) this).field_a[var3], ib.field_T[var4][va.a(255, (int)(((fd) this).field_l[va.a(-var4 + var3, 7)] >>> var5))]);
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
                ((fd) this).field_l[var2] = ((fd) this).field_g[var2];
                ((fd) this).field_b[var2] = pa.a(((fd) this).field_d[var2], ((fd) this).field_g[var2]);
                var2++;
                continue L1;
              }
            }
          } else {
            ((fd) this).field_d[var2] = pa.a(kd.a((long)((fd) this).field_f[var3 - -7], 255L), pa.a(kd.a(65280L, (long)((fd) this).field_f[var3 - -6] << 8), pa.a(pa.a(kd.a((long)((fd) this).field_f[4 + var3], 255L) << 24, pa.a(pa.a(kd.a(255L, (long)((fd) this).field_f[2 + var3]) << 40, pa.a(kd.a((long)((fd) this).field_f[1 + var3], 255L) << 48, (long)((fd) this).field_f[var3] << 56)), kd.a(255L, (long)((fd) this).field_f[3 + var3]) << 32)), kd.a(16711680L, (long)((fd) this).field_f[var3 - -5] << 16))));
            var2++;
            var3 += 8;
            continue L0;
          }
        }
    }

    final static void a(int param0, int param1) {
        fb.field_c = pm.field_B[param1];
        hc.field_s = ak.field_L[param1];
        b.field_k = th.field_eb[param1];
        if (param0 != 30177) {
            field_k = null;
        }
    }

    final void b(byte param0) {
        int var2 = 0;
        int var3 = Confined.field_J ? 1 : 0;
        for (var2 = 0; var2 < 32; var2++) {
            ((fd) this).field_c[var2] = (byte) 0;
        }
        ((fd) this).field_i = 0;
        ((fd) this).field_h = 0;
        ((fd) this).field_f[0] = (byte) 0;
        var2 = 0;
        if (param0 >= -21) {
            return;
        }
        while (8 > var2) {
            ((fd) this).field_g[var2] = 0L;
            var2++;
        }
    }

    fd() {
        ((fd) this).field_i = 0;
        ((fd) this).field_h = 0;
        ((fd) this).field_l = new long[8];
        ((fd) this).field_b = new long[8];
        ((fd) this).field_g = new long[8];
        ((fd) this).field_a = new long[8];
        ((fd) this).field_d = new long[8];
        ((fd) this).field_c = new byte[32];
        ((fd) this).field_f = new byte[64];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new nf(640, 376);
        field_j = true;
    }
}
