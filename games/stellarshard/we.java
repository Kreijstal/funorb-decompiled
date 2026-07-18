/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class we {
    private byte[] field_g;
    static String field_e;
    private long[] field_d;
    private long[] field_c;
    private int field_k;
    private byte[] field_h;
    private int field_b;
    private long[] field_f;
    static long field_a;
    private long[] field_i;
    private long[] field_j;

    final static void a(byte param0) {
        oc.field_c = new oj();
    }

    public static void b(byte param0) {
        field_e = null;
    }

    private final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var6 = stellarshard.field_B;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if (var2 >= 8) {
            var2 = 0;
            L1: while (true) {
              if (var2 >= 8) {
                var2 = param0;
                L2: while (true) {
                  if (var2 > 10) {
                    var2 = 0;
                    L3: while (true) {
                      if (var2 >= 8) {
                        return;
                      } else {
                        ((we) this).field_c[var2] = ue.a(((we) this).field_c[var2], ue.a(((we) this).field_i[var2], ((we) this).field_d[var2]));
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
                            ((we) this).field_f[0] = ue.a(((we) this).field_f[0], pd.field_j[var2]);
                            var3 = 0;
                            L6: while (true) {
                              if (8 <= var3) {
                                var3 = 0;
                                L7: while (true) {
                                  if (var3 >= 8) {
                                    var2++;
                                    continue L2;
                                  } else {
                                    ((we) this).field_d[var3] = ((we) this).field_j[var3];
                                    var3++;
                                    continue L7;
                                  }
                                }
                              } else {
                                ((we) this).field_j[var3] = ((we) this).field_f[var3];
                                var7 = 0;
                                var4 = var7;
                                var5 = 56;
                                L8: while (true) {
                                  if (var7 >= 8) {
                                    var3++;
                                    continue L6;
                                  } else {
                                    ((we) this).field_j[var3] = ue.a(((we) this).field_j[var3], pd.field_l[var7][sa.a((int)(((we) this).field_d[sa.a(7, var3 + -var7)] >>> var5), 255)]);
                                    var7++;
                                    var5 -= 8;
                                    continue L8;
                                  }
                                }
                              }
                            }
                          } else {
                            ((we) this).field_f[var3] = ((we) this).field_j[var3];
                            var3++;
                            continue L5;
                          }
                        }
                      } else {
                        ((we) this).field_j[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L9: while (true) {
                          if (8 <= var4) {
                            var3++;
                            continue L4;
                          } else {
                            ((we) this).field_j[var3] = ue.a(((we) this).field_j[var3], pd.field_l[var4][sa.a(255, (int)(((we) this).field_f[sa.a(-var4 + var3, 7)] >>> var5))]);
                            var4++;
                            var5 -= 8;
                            continue L9;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                ((we) this).field_f[var2] = ((we) this).field_c[var2];
                ((we) this).field_d[var2] = ue.a(((we) this).field_i[var2], ((we) this).field_c[var2]);
                var2++;
                continue L1;
              }
            }
          } else {
            ((we) this).field_i[var2] = ue.a(stellarshard.a((long)((we) this).field_h[var3 - -7], 255L), ue.a(ue.a(stellarshard.a(16711680L, (long)((we) this).field_h[var3 + 5] << 16), ue.a(ue.a(ue.a(ue.a(stellarshard.a((long)((we) this).field_h[1 + var3], 255L) << 48, (long)((we) this).field_h[var3] << 56), stellarshard.a(255L, (long)((we) this).field_h[2 + var3]) << 40), stellarshard.a(1095216660480L, (long)((we) this).field_h[3 + var3] << 32)), stellarshard.a(255L, (long)((we) this).field_h[var3 - -4]) << 24)), stellarshard.a(65280L, (long)((we) this).field_h[var3 + 6] << 8)));
            var3 += 8;
            var2++;
            continue L0;
          }
        }
    }

    final void a(long param0, byte param1, byte[] param2) {
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
        var13 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              var5_int = 0;
              var6 = 8 - ((int)param0 & 7) & 7;
              if (param1 == -78) {
                break L1;
              } else {
                ((we) this).field_b = 118;
                break L1;
              }
            }
            var7 = 7 & ((we) this).field_k;
            var9 = param0;
            var11 = 31;
            var12 = 0;
            L2: while (true) {
              if (var11 < 0) {
                L3: while (true) {
                  if (param0 <= 8L) {
                    L4: {
                      if (param0 <= 0L) {
                        var8 = 0;
                        break L4;
                      } else {
                        var8 = 255 & param2[var5_int] << var6;
                        ((we) this).field_h[((we) this).field_b] = (byte)vf.b((int) ((we) this).field_h[((we) this).field_b], var8 >>> var7);
                        break L4;
                      }
                    }
                    L5: {
                      if (param0 + (long)var7 < 8L) {
                        ((we) this).field_k = (int)((long)((we) this).field_k + param0);
                        break L5;
                      } else {
                        L6: {
                          ((we) this).field_b = ((we) this).field_b + 1;
                          ((we) this).field_k = ((we) this).field_k + (8 - var7);
                          param0 = param0 - (long)(-var7 + 8);
                          if (((we) this).field_k == 512) {
                            this.a(param1 + 79);
                            ((we) this).field_b = 0;
                            ((we) this).field_k = 0;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        ((we) this).field_h[((we) this).field_b] = (byte)sa.a(var8 << -var7 + 8, 255);
                        ((we) this).field_k = ((we) this).field_k + (int)param0;
                        break L5;
                      }
                    }
                    break L0;
                  } else {
                    L7: {
                      var8 = param2[var5_int] << var6 & 255 | (255 & param2[var5_int - -1]) >>> 8 + -var6;
                      if (var8 < 0) {
                        break L7;
                      } else {
                        if (var8 < 256) {
                          L8: {
                            ((we) this).field_h[((we) this).field_b] = (byte)vf.b((int) ((we) this).field_h[((we) this).field_b], var8 >>> var7);
                            ((we) this).field_k = ((we) this).field_k + (-var7 + 8);
                            ((we) this).field_b = ((we) this).field_b + 1;
                            if (((we) this).field_k != 512) {
                              break L8;
                            } else {
                              this.a(param1 ^ -77);
                              ((we) this).field_b = 0;
                              ((we) this).field_k = 0;
                              break L8;
                            }
                          }
                          ((we) this).field_h[((we) this).field_b] = (byte)sa.a(var8 << -var7 + 8, 255);
                          ((we) this).field_k = ((we) this).field_k + var7;
                          var5_int++;
                          param0 = param0 - 8L;
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
                var12 = var12 + ((255 & ((we) this).field_g[var11]) + ((int)var9 & 255));
                ((we) this).field_g[var11] = (byte)var12;
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
            stackOut_24_0 = (RuntimeException) var5;
            stackOut_24_1 = new StringBuilder().append("we.C(").append(param0).append(',').append(param1).append(',');
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
          throw ma.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ')');
        }
    }

    final static void a(boolean param0, int param1, String param2) {
        try {
            ck.field_db = true;
            ak.field_a = param0 ? true : false;
            ei.field_G = new ck(na.field_d, s.field_c, param2, gk.field_a, ak.field_a);
            na.field_d.a((byte) -108, (rj) (Object) ei.field_G);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "we.A(" + param0 + ',' + 12757 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = stellarshard.field_B;
        for (var2 = 0; var2 < 32; var2++) {
            ((we) this).field_g[var2] = (byte) 0;
        }
        if (param0) {
            ((we) this).field_h = null;
        }
        ((we) this).field_b = 0;
        ((we) this).field_k = 0;
        ((we) this).field_h[0] = (byte) 0;
        for (var2 = 0; var2 < 8; var2++) {
            ((we) this).field_c[var2] = 0L;
        }
    }

    final void a(byte[] param0, int param1, int param2) {
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
        var8 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              ((we) this).field_h[((we) this).field_b] = (byte)vf.b((int) ((we) this).field_h[((we) this).field_b], 128 >>> sa.a(7, ((we) this).field_k));
              ((we) this).field_b = ((we) this).field_b + 1;
              if (((we) this).field_b <= 32) {
                break L1;
              } else {
                L2: while (true) {
                  if (64 <= ((we) this).field_b) {
                    this.a(1);
                    ((we) this).field_b = 0;
                    break L1;
                  } else {
                    int fieldTemp$2 = ((we) this).field_b;
                    ((we) this).field_b = ((we) this).field_b + 1;
                    ((we) this).field_h[fieldTemp$2] = (byte) 0;
                    continue L2;
                  }
                }
              }
            }
            L3: while (true) {
              if (((we) this).field_b >= 32) {
                ri.a(((we) this).field_g, 0, ((we) this).field_h, 32, 32);
                this.a(1);
                var4_int = 0;
                var5 = param1;
                L4: while (true) {
                  if (8 <= var4_int) {
                    L5: {
                      if (param2 == 22297) {
                        break L5;
                      } else {
                        this.a(62);
                        break L5;
                      }
                    }
                    break L0;
                  } else {
                    var6 = ((we) this).field_c[var4_int];
                    param0[var5] = (byte)(int)(var6 >>> 56);
                    param0[1 + var5] = (byte)(int)(var6 >>> 48);
                    param0[2 + var5] = (byte)(int)(var6 >>> 40);
                    param0[var5 + 3] = (byte)(int)(var6 >>> 32);
                    param0[var5 - -4] = (byte)(int)(var6 >>> 24);
                    param0[var5 + 5] = (byte)(int)(var6 >>> 16);
                    param0[var5 + 6] = (byte)(int)(var6 >>> 8);
                    param0[var5 + 7] = (byte)(int)var6;
                    var4_int++;
                    var5 += 8;
                    continue L4;
                  }
                }
              } else {
                int fieldTemp$3 = ((we) this).field_b;
                ((we) this).field_b = ((we) this).field_b + 1;
                ((we) this).field_h[fieldTemp$3] = (byte) 0;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("we.B(");
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
          throw ma.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static ub a(byte[] param0, int param1) {
        ub var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        ub stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        ub stackOut_3_0 = null;
        Object stackOut_1_0 = null;
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
            if (param0 != null) {
              var2 = new ub(param0, ak.field_c, vi.field_c, vc.field_b, ih.field_d, ih.field_b);
              tb.f((byte) -128);
              stackOut_3_0 = (ub) var2;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (ub) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2_ref;
            stackOut_5_1 = new StringBuilder().append("we.F(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
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
          throw ma.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + 1 + ')');
        }
        return stackIn_4_0;
    }

    we() {
        ((we) this).field_g = new byte[32];
        ((we) this).field_d = new long[8];
        ((we) this).field_h = new byte[64];
        ((we) this).field_f = new long[8];
        ((we) this).field_c = new long[8];
        ((we) this).field_b = 0;
        ((we) this).field_k = 0;
        ((we) this).field_j = new long[8];
        ((we) this).field_i = new long[8];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Super cannon";
    }
}
