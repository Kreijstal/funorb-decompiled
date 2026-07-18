/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fj {
    static String field_a;
    private long[] field_d;
    private byte[] field_f;
    private long[] field_h;
    private byte[] field_k;
    private long[] field_j;
    private long[] field_l;
    private long[] field_i;
    static int field_b;
    private int field_e;
    static String field_c;
    private int field_g;

    final static void b(int param0) {
        if (param0 != 18444) {
            return;
        }
        if (uga.field_d) {
            int discarded$0 = -1;
            fea.a();
        }
    }

    final void a(byte[] param0, int param1, byte param2) {
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
        var8 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              ((fj) this).field_f[((fj) this).field_g] = (byte)knb.a((int) ((fj) this).field_f[((fj) this).field_g], 128 >>> dla.a(((fj) this).field_e, 7));
              ((fj) this).field_g = ((fj) this).field_g + 1;
              if (param2 > 37) {
                break L1;
              } else {
                fj.b(-1);
                break L1;
              }
            }
            L2: {
              if (32 < ((fj) this).field_g) {
                L3: while (true) {
                  if (((fj) this).field_g >= 64) {
                    this.a((byte) 66);
                    ((fj) this).field_g = 0;
                    break L2;
                  } else {
                    int fieldTemp$2 = ((fj) this).field_g;
                    ((fj) this).field_g = ((fj) this).field_g + 1;
                    ((fj) this).field_f[fieldTemp$2] = (byte) 0;
                    continue L3;
                  }
                }
              } else {
                break L2;
              }
            }
            L4: while (true) {
              if (((fj) this).field_g >= 32) {
                cua.a(((fj) this).field_k, 0, ((fj) this).field_f, 32, 32);
                this.a((byte) 66);
                var4_int = 0;
                var5 = param1;
                L5: while (true) {
                  if (var4_int >= 8) {
                    break L0;
                  } else {
                    var6 = ((fj) this).field_l[var4_int];
                    param0[var5] = (byte)(int)(var6 >>> 56);
                    param0[1 + var5] = (byte)(int)(var6 >>> 48);
                    param0[2 + var5] = (byte)(int)(var6 >>> 40);
                    param0[var5 - -3] = (byte)(int)(var6 >>> 32);
                    param0[var5 + 4] = (byte)(int)(var6 >>> 24);
                    param0[var5 - -5] = (byte)(int)(var6 >>> 16);
                    param0[6 + var5] = (byte)(int)(var6 >>> 8);
                    param0[7 + var5] = (byte)(int)var6;
                    var5 += 8;
                    var4_int++;
                    continue L5;
                  }
                }
              } else {
                int fieldTemp$3 = ((fj) this).field_g;
                ((fj) this).field_g = ((fj) this).field_g + 1;
                ((fj) this).field_f[fieldTemp$3] = (byte) 0;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var4;
            stackOut_14_1 = new StringBuilder().append("fj.F(");
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
          throw rta.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void b(byte param0) {
        int var2 = 0;
        int var3 = VoidHunters.field_G;
        if (param0 != -88) {
            ((fj) this).field_k = null;
        }
        for (var2 = 0; var2 < 32; var2++) {
            ((fj) this).field_k[var2] = (byte) 0;
        }
        ((fj) this).field_g = 0;
        ((fj) this).field_e = 0;
        ((fj) this).field_f[0] = (byte) 0;
        for (var2 = 0; var2 < 8; var2++) {
            ((fj) this).field_l[var2] = 0L;
        }
    }

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var6 = VoidHunters.field_G;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if (var2 >= 8) {
            L1: {
              if (param0 == 66) {
                break L1;
              } else {
                this.a((byte) -86);
                break L1;
              }
            }
            var2 = 0;
            L2: while (true) {
              if (var2 >= 8) {
                var2 = 1;
                L3: while (true) {
                  if (var2 > 10) {
                    var2 = 0;
                    L4: while (true) {
                      if (var2 >= 8) {
                        return;
                      } else {
                        ((fj) this).field_l[var2] = ihb.a(((fj) this).field_l[var2], ihb.a(((fj) this).field_j[var2], ((fj) this).field_d[var2]));
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
                          if (8 <= var3) {
                            ((fj) this).field_i[0] = ihb.a(((fj) this).field_i[0], gp.field_o[var2]);
                            var3 = 0;
                            L7: while (true) {
                              if (8 <= var3) {
                                var3 = 0;
                                L8: while (true) {
                                  if (var3 >= 8) {
                                    var2++;
                                    continue L3;
                                  } else {
                                    ((fj) this).field_d[var3] = ((fj) this).field_h[var3];
                                    var3++;
                                    continue L8;
                                  }
                                }
                              } else {
                                ((fj) this).field_h[var3] = ((fj) this).field_i[var3];
                                var7 = 0;
                                var4 = var7;
                                var5 = 56;
                                L9: while (true) {
                                  if (var7 >= 8) {
                                    var3++;
                                    continue L7;
                                  } else {
                                    ((fj) this).field_h[var3] = ihb.a(((fj) this).field_h[var3], gp.field_r[var7][dla.a(255, (int)(((fj) this).field_d[dla.a(var3 + -var7, 7)] >>> var5))]);
                                    var5 -= 8;
                                    var7++;
                                    continue L9;
                                  }
                                }
                              }
                            }
                          } else {
                            ((fj) this).field_i[var3] = ((fj) this).field_h[var3];
                            var3++;
                            continue L6;
                          }
                        }
                      } else {
                        ((fj) this).field_h[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L10: while (true) {
                          if (var4 >= 8) {
                            var3++;
                            continue L5;
                          } else {
                            ((fj) this).field_h[var3] = ihb.a(((fj) this).field_h[var3], gp.field_r[var4][dla.a(255, (int)(((fj) this).field_i[dla.a(-var4 + var3, 7)] >>> var5))]);
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
                ((fj) this).field_i[var2] = ((fj) this).field_l[var2];
                ((fj) this).field_d[var2] = ihb.a(((fj) this).field_j[var2], ((fj) this).field_l[var2]);
                var2++;
                continue L2;
              }
            }
          } else {
            ((fj) this).field_j[var2] = ihb.a(ihb.a(hoa.a(255L, (long)((fj) this).field_f[6 + var3]) << 8, ihb.a(hoa.a(255L, (long)((fj) this).field_f[5 + var3]) << 16, ihb.a(hoa.a(255L, (long)((fj) this).field_f[4 + var3]) << 24, ihb.a(hoa.a(255L, (long)((fj) this).field_f[3 + var3]) << 32, ihb.a(hoa.a(280375465082880L, (long)((fj) this).field_f[var3 + 2] << 40), ihb.a(hoa.a((long)((fj) this).field_f[1 + var3], 255L) << 48, (long)((fj) this).field_f[var3] << 56)))))), hoa.a((long)((fj) this).field_f[var3 - -7], 255L));
            var2++;
            var3 += 8;
            continue L0;
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 0) {
            fj.a(-54);
        }
        field_c = null;
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
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var13 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var5_int = 0;
              var6 = 7 & 8 - (7 & (int)param2);
              var7 = ((fj) this).field_e & 7;
              var9 = param2;
              var11 = 31;
              if (param1 == -7) {
                break L1;
              } else {
                field_b = 81;
                break L1;
              }
            }
            var12 = 0;
            L2: while (true) {
              if (var11 < 0) {
                L3: while (true) {
                  if (param2 <= 8L) {
                    L4: {
                      if (param2 > 0L) {
                        var8 = param0[var5_int] << var6 & 255;
                        ((fj) this).field_f[((fj) this).field_g] = (byte)knb.a((int) ((fj) this).field_f[((fj) this).field_g], var8 >>> var7);
                        break L4;
                      } else {
                        var8 = 0;
                        break L4;
                      }
                    }
                    L5: {
                      if (param2 + (long)var7 >= 8L) {
                        L6: {
                          param2 = param2 - (long)(-var7 + 8);
                          ((fj) this).field_e = ((fj) this).field_e + (8 - var7);
                          ((fj) this).field_g = ((fj) this).field_g + 1;
                          if (((fj) this).field_e == 512) {
                            this.a((byte) 66);
                            ((fj) this).field_g = 0;
                            ((fj) this).field_e = 0;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        ((fj) this).field_f[((fj) this).field_g] = (byte)dla.a(255, var8 << 8 + -var7);
                        ((fj) this).field_e = ((fj) this).field_e + (int)param2;
                        break L5;
                      } else {
                        ((fj) this).field_e = (int)((long)((fj) this).field_e + param2);
                        break L5;
                      }
                    }
                    break L0;
                  } else {
                    L7: {
                      var8 = 255 & param0[var5_int] << var6 | (255 & param0[1 + var5_int]) >>> 8 + -var6;
                      if (var8 < 0) {
                        break L7;
                      } else {
                        if (var8 < 256) {
                          L8: {
                            ((fj) this).field_f[((fj) this).field_g] = (byte)knb.a((int) ((fj) this).field_f[((fj) this).field_g], var8 >>> var7);
                            ((fj) this).field_g = ((fj) this).field_g + 1;
                            ((fj) this).field_e = ((fj) this).field_e + (8 + -var7);
                            if (((fj) this).field_e == 512) {
                              this.a((byte) 66);
                              ((fj) this).field_e = 0;
                              ((fj) this).field_g = 0;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          ((fj) this).field_f[((fj) this).field_g] = (byte)dla.a(var8 << -var7 + 8, 255);
                          ((fj) this).field_e = ((fj) this).field_e + var7;
                          var5_int++;
                          param2 = param2 - 8L;
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
                var12 = var12 + ((255 & ((fj) this).field_k[var11]) + (255 & (int)var9));
                ((fj) this).field_k[var11] = (byte)var12;
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
            stackOut_25_0 = (RuntimeException) var5;
            stackOut_25_1 = new StringBuilder().append("fj.C(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L9;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L9;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    fj() {
        ((fj) this).field_d = new long[8];
        ((fj) this).field_l = new long[8];
        ((fj) this).field_i = new long[8];
        ((fj) this).field_h = new long[8];
        ((fj) this).field_g = 0;
        ((fj) this).field_k = new byte[32];
        ((fj) this).field_f = new byte[64];
        ((fj) this).field_e = 0;
        ((fj) this).field_j = new long[8];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Email: ";
        field_b = 1;
        field_c = "Add map zone";
    }
}
