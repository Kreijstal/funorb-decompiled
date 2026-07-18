/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mj {
    private long[] field_i;
    private long[] field_g;
    private int field_b;
    static int field_d;
    private byte[] field_c;
    private byte[] field_h;
    private long[] field_f;
    static int field_k;
    private long[] field_j;
    private int field_e;
    private long[] field_a;

    final void a(byte[] param0, long param1, byte param2) {
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
        var13 = Torquing.field_u;
        try {
          L0: {
            L1: {
              var5_int = 0;
              var6 = 7 & 8 + -((int)param1 & 7);
              var7 = 7 & ((mj) this).field_b;
              if (param2 > 84) {
                break L1;
              } else {
                ((mj) this).a((byte[]) null, -89L, (byte) -88);
                break L1;
              }
            }
            var9 = param1;
            var11 = 31;
            var12 = 0;
            L2: while (true) {
              if (var11 < 0) {
                L3: while (true) {
                  if (param1 <= 8L) {
                    L4: {
                      if (param1 <= 0L) {
                        var8 = 0;
                        break L4;
                      } else {
                        var8 = param0[var5_int] << var6 & 255;
                        ((mj) this).field_h[((mj) this).field_e] = (byte)gm.a((int) ((mj) this).field_h[((mj) this).field_e], var8 >>> var7);
                        break L4;
                      }
                    }
                    L5: {
                      if (param1 + (long)var7 < 8L) {
                        ((mj) this).field_b = (int)((long)((mj) this).field_b + param1);
                        break L5;
                      } else {
                        L6: {
                          ((mj) this).field_b = ((mj) this).field_b + (-var7 + 8);
                          param1 = param1 - (long)(-var7 + 8);
                          ((mj) this).field_e = ((mj) this).field_e + 1;
                          if (512 != ((mj) this).field_b) {
                            break L6;
                          } else {
                            this.b((byte) 90);
                            ((mj) this).field_b = 0;
                            ((mj) this).field_e = 0;
                            break L6;
                          }
                        }
                        ((mj) this).field_h[((mj) this).field_e] = (byte)ie.a(255, var8 << -var7 + 8);
                        ((mj) this).field_b = ((mj) this).field_b + (int)param1;
                        break L5;
                      }
                    }
                    break L0;
                  } else {
                    L7: {
                      var8 = param0[var5_int] << var6 & 255 | (param0[1 + var5_int] & 255) >>> 8 + -var6;
                      if (var8 < 0) {
                        break L7;
                      } else {
                        if (var8 < 256) {
                          L8: {
                            ((mj) this).field_h[((mj) this).field_e] = (byte)gm.a((int) ((mj) this).field_h[((mj) this).field_e], var8 >>> var7);
                            ((mj) this).field_b = ((mj) this).field_b + (-var7 + 8);
                            ((mj) this).field_e = ((mj) this).field_e + 1;
                            if (((mj) this).field_b != 512) {
                              break L8;
                            } else {
                              this.b((byte) 87);
                              ((mj) this).field_b = 0;
                              ((mj) this).field_e = 0;
                              break L8;
                            }
                          }
                          ((mj) this).field_h[((mj) this).field_e] = (byte)ie.a(255, var8 << 8 + -var7);
                          var5_int++;
                          ((mj) this).field_b = ((mj) this).field_b + var7;
                          param1 = param1 - 8L;
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
                var12 = var12 + ((255 & (int)var9) + (255 & ((mj) this).field_c[var11]));
                ((mj) this).field_c[var11] = (byte)var12;
                var12 = var12 >>> 8;
                var9 = var9 >>> 8;
                var11--;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var5;
            stackOut_23_1 = new StringBuilder().append("mj.C(");
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
              break L9;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L9;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, byte[] param1, int param2) {
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
        var8 = Torquing.field_u;
        try {
          L0: {
            L1: {
              ((mj) this).field_h[((mj) this).field_e] = (byte)gm.a((int) ((mj) this).field_h[((mj) this).field_e], param2 >>> ie.a(7, ((mj) this).field_b));
              ((mj) this).field_e = ((mj) this).field_e + 1;
              if (((mj) this).field_e > 32) {
                L2: while (true) {
                  if (64 <= ((mj) this).field_e) {
                    this.b((byte) 110);
                    ((mj) this).field_e = 0;
                    break L1;
                  } else {
                    int fieldTemp$2 = ((mj) this).field_e;
                    ((mj) this).field_e = ((mj) this).field_e + 1;
                    ((mj) this).field_h[fieldTemp$2] = (byte) 0;
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            L3: while (true) {
              if (((mj) this).field_e >= 32) {
                dk.a(((mj) this).field_c, 0, ((mj) this).field_h, 32, 32);
                this.b((byte) 126);
                var4_int = 0;
                var5 = param0;
                L4: while (true) {
                  if (8 <= var4_int) {
                    break L0;
                  } else {
                    var6 = ((mj) this).field_f[var4_int];
                    param1[var5] = (byte)(int)(var6 >>> 56);
                    param1[1 + var5] = (byte)(int)(var6 >>> 48);
                    param1[2 + var5] = (byte)(int)(var6 >>> 40);
                    param1[3 + var5] = (byte)(int)(var6 >>> 32);
                    param1[4 + var5] = (byte)(int)(var6 >>> 24);
                    param1[var5 - -5] = (byte)(int)(var6 >>> 16);
                    param1[6 + var5] = (byte)(int)(var6 >>> 8);
                    param1[var5 + 7] = (byte)(int)var6;
                    var4_int++;
                    var5 += 8;
                    continue L4;
                  }
                }
              } else {
                int fieldTemp$3 = ((mj) this).field_e;
                ((mj) this).field_e = ((mj) this).field_e + 1;
                ((mj) this).field_h[fieldTemp$3] = (byte) 0;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("mj.A(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
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
          throw rb.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param2 + ')');
        }
    }

    private final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        var6 = Torquing.field_u;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if (var2 >= 8) {
            L1: {
              if (param0 >= 52) {
                break L1;
              } else {
                var7 = null;
                ((mj) this).a(-31, (byte[]) null, -11);
                break L1;
              }
            }
            var2 = 0;
            L2: while (true) {
              if (8 <= var2) {
                var2 = 1;
                L3: while (true) {
                  if (10 < var2) {
                    var2 = 0;
                    L4: while (true) {
                      if (8 <= var2) {
                        return;
                      } else {
                        ((mj) this).field_f[var2] = vb.a(((mj) this).field_f[var2], vb.a(((mj) this).field_j[var2], ((mj) this).field_i[var2]));
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
                            ((mj) this).field_g[0] = vb.a(((mj) this).field_g[0], tp.field_m[var2]);
                            var3 = 0;
                            L7: while (true) {
                              if (var3 >= 8) {
                                var3 = 0;
                                L8: while (true) {
                                  if (var3 >= 8) {
                                    var2++;
                                    continue L3;
                                  } else {
                                    ((mj) this).field_i[var3] = ((mj) this).field_a[var3];
                                    var3++;
                                    continue L8;
                                  }
                                }
                              } else {
                                ((mj) this).field_a[var3] = ((mj) this).field_g[var3];
                                var8 = 0;
                                var4 = var8;
                                var5 = 56;
                                L9: while (true) {
                                  if (8 <= var8) {
                                    var3++;
                                    continue L7;
                                  } else {
                                    ((mj) this).field_a[var3] = vb.a(((mj) this).field_a[var3], tp.field_e[var8][ie.a((int)(((mj) this).field_i[ie.a(7, -var8 + var3)] >>> var5), 255)]);
                                    var5 -= 8;
                                    var8++;
                                    continue L9;
                                  }
                                }
                              }
                            }
                          } else {
                            ((mj) this).field_g[var3] = ((mj) this).field_a[var3];
                            var3++;
                            continue L6;
                          }
                        }
                      } else {
                        ((mj) this).field_a[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L10: while (true) {
                          if (var4 >= 8) {
                            var3++;
                            continue L5;
                          } else {
                            ((mj) this).field_a[var3] = vb.a(((mj) this).field_a[var3], tp.field_e[var4][ie.a((int)(((mj) this).field_g[ie.a(7, var3 - var4)] >>> var5), 255)]);
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
                ((mj) this).field_g[var2] = ((mj) this).field_f[var2];
                ((mj) this).field_i[var2] = vb.a(((mj) this).field_j[var2], ((mj) this).field_f[var2]);
                var2++;
                continue L2;
              }
            }
          } else {
            ((mj) this).field_j[var2] = vb.a(vb.a(on.a((long)((mj) this).field_h[6 + var3], 255L) << 8, vb.a(vb.a(on.a((long)((mj) this).field_h[4 + var3], 255L) << 24, vb.a(on.a(255L, (long)((mj) this).field_h[var3 + 3]) << 32, vb.a(vb.a(on.a(255L, (long)((mj) this).field_h[var3 + 1]) << 48, (long)((mj) this).field_h[var3] << 56), on.a((long)((mj) this).field_h[var3 - -2] << 40, 280375465082880L)))), on.a((long)((mj) this).field_h[var3 - -5] << 16, 16711680L))), on.a((long)((mj) this).field_h[var3 + 7], 255L));
            var2++;
            var3 += 8;
            continue L0;
          }
        }
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = Torquing.field_u;
        for (var2 = 0; var2 < 32; var2++) {
            ((mj) this).field_c[var2] = (byte) 0;
        }
        ((mj) this).field_e = 0;
        ((mj) this).field_h[0] = (byte)param0;
        ((mj) this).field_b = 0;
        for (var2 = 0; var2 < 8; var2++) {
            ((mj) this).field_f[var2] = 0L;
        }
    }

    mj() {
        ((mj) this).field_g = new long[8];
        ((mj) this).field_h = new byte[64];
        ((mj) this).field_c = new byte[32];
        ((mj) this).field_b = 0;
        ((mj) this).field_f = new long[8];
        ((mj) this).field_i = new long[8];
        ((mj) this).field_e = 0;
        ((mj) this).field_j = new long[8];
        ((mj) this).field_a = new long[8];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 0;
    }
}
