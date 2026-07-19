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
        if (param0 != 15) {
            field_a = -116L;
        }
        oc.field_c = new oj();
    }

    public static void b(byte param0) {
        if (param0 <= 82) {
            field_e = (String) null;
        }
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
              if ((var2 ^ -1) <= -9) {
                var2 = param0;
                L2: while (true) {
                  if ((var2 ^ -1) < -11) {
                    var2 = 0;
                    L3: while (true) {
                      if ((var2 ^ -1) <= -9) {
                        return;
                      } else {
                        this.field_c[var2] = ue.a(this.field_c[var2], ue.a(this.field_i[var2], this.field_d[var2]));
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
                            this.field_f[0] = ue.a(this.field_f[0], pd.field_j[var2]);
                            var3 = 0;
                            L6: while (true) {
                              if (8 <= var3) {
                                var3 = 0;
                                L7: while (true) {
                                  if (var3 >= 8) {
                                    var2++;
                                    continue L2;
                                  } else {
                                    this.field_d[var3] = this.field_j[var3];
                                    var3++;
                                    continue L7;
                                  }
                                }
                              } else {
                                this.field_j[var3] = this.field_f[var3];
                                var7 = 0;
                                var4 = var7;
                                var5 = 56;
                                L8: while (true) {
                                  if (var7 >= 8) {
                                    var3++;
                                    continue L6;
                                  } else {
                                    this.field_j[var3] = ue.a(this.field_j[var3], pd.field_l[var7][sa.a((int)(this.field_d[sa.a(7, var3 + -var7)] >>> var5), 255)]);
                                    var7++;
                                    var5 -= 8;
                                    continue L8;
                                  }
                                }
                              }
                            }
                          } else {
                            this.field_f[var3] = this.field_j[var3];
                            var3++;
                            continue L5;
                          }
                        }
                      } else {
                        this.field_j[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L9: while (true) {
                          if (8 <= var4) {
                            var3++;
                            continue L4;
                          } else {
                            this.field_j[var3] = ue.a(this.field_j[var3], pd.field_l[var4][sa.a(255, (int)(this.field_f[sa.a(-var4 + var3, 7)] >>> var5))]);
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
                this.field_f[var2] = this.field_c[var2];
                this.field_d[var2] = ue.a(this.field_i[var2], this.field_c[var2]);
                var2++;
                continue L1;
              }
            }
          } else {
            this.field_i[var2] = ue.a(stellarshard.a((long)this.field_h[var3 - -7], 255L), ue.a(ue.a(stellarshard.a(16711680L, (long)this.field_h[var3 + 5] << -91619632), ue.a(ue.a(ue.a(ue.a(stellarshard.a((long)this.field_h[1 + var3], 255L) << 2114773168, (long)this.field_h[var3] << 1278288952), stellarshard.a(255L, (long)this.field_h[2 + var3]) << -1470274840), stellarshard.a(1095216660480L, (long)this.field_h[3 + var3] << 1083292000)), stellarshard.a(255L, (long)this.field_h[var3 - -4]) << -1157569192)), stellarshard.a(65280L, (long)this.field_h[var3 + 6] << -148218488)));
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
                this.field_b = 118;
                break L1;
              }
            }
            var7 = 7 & this.field_k;
            var9 = param0;
            var11 = 31;
            var12 = 0;
            L2: while (true) {
              if (-1 < (var11 ^ -1)) {
                L3: while (true) {
                  if (-9L <= (param0 ^ -1L)) {
                    L4: {
                      if (param0 <= 0L) {
                        var8 = 0;
                        break L4;
                      } else {
                        var8 = 255 & param2[var5_int] << var6;
                        this.field_h[this.field_b] = (byte)vf.b((int) this.field_h[this.field_b], var8 >>> var7);
                        break L4;
                      }
                    }
                    L5: {
                      if (param0 + (long)var7 < 8L) {
                        this.field_k = (int)((long)this.field_k + param0);
                        break L5;
                      } else {
                        L6: {
                          this.field_b = this.field_b + 1;
                          this.field_k = this.field_k + (8 - var7);
                          param0 = param0 - (long)(-var7 + 8);
                          if ((this.field_k ^ -1) == -513) {
                            this.a(param1 + 79);
                            this.field_b = 0;
                            this.field_k = 0;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        this.field_h[this.field_b] = (byte)sa.a(var8 << -var7 + 8, 255);
                        this.field_k = this.field_k + (int)param0;
                        break L5;
                      }
                    }
                    break L0;
                  } else {
                    L7: {
                      var8 = param2[var5_int] << var6 & 255 | (255 & param2[var5_int - -1]) >>> 8 + -var6;
                      if ((var8 ^ -1) > -1) {
                        break L7;
                      } else {
                        if (var8 < 256) {
                          L8: {
                            this.field_h[this.field_b] = (byte)vf.b((int) this.field_h[this.field_b], var8 >>> var7);
                            this.field_k = this.field_k + (-var7 + 8);
                            this.field_b = this.field_b + 1;
                            if ((this.field_k ^ -1) != -513) {
                              break L8;
                            } else {
                              this.a(param1 ^ -77);
                              this.field_b = 0;
                              this.field_k = 0;
                              break L8;
                            }
                          }
                          this.field_h[this.field_b] = (byte)sa.a(var8 << -var7 + 8, 255);
                          this.field_k = this.field_k + var7;
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
                var12 = var12 + ((255 & this.field_g[var11]) + ((int)var9 & 255));
                this.field_g[var11] = (byte)var12;
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
            stackOut_24_0 = (RuntimeException) (var5);
            stackOut_24_1 = new StringBuilder().append("we.C(").append(param0).append(',').append(param1).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L9;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L9;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
    }

    final static void a(boolean param0, int param1, String param2) {
        try {
            ck.field_db = true;
            ak.field_a = param0 ? true : false;
            ei.field_G = new ck(na.field_d, s.field_c, param2, gk.field_a, ak.field_a);
            if (param1 != 12757) {
                field_e = (String) null;
            }
            na.field_d.a((byte) -108, (rj) (ei.field_G));
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "we.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = stellarshard.field_B;
        for (var2 = 0; -33 < (var2 ^ -1); var2++) {
            this.field_g[var2] = (byte) 0;
        }
        if (param0) {
            this.field_h = (byte[]) null;
        }
        this.field_b = 0;
        this.field_k = 0;
        this.field_h[0] = (byte) 0;
        for (var2 = 0; -9 < (var2 ^ -1); var2++) {
            this.field_c[var2] = 0L;
        }
    }

    final void a(byte[] param0, int param1, int param2) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
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
              this.field_h[this.field_b] = (byte)vf.b((int) this.field_h[this.field_b], 128 >>> sa.a(7, this.field_k));
              this.field_b = this.field_b + 1;
              if (this.field_b <= 32) {
                break L1;
              } else {
                L2: while (true) {
                  if (64 <= this.field_b) {
                    this.a(1);
                    this.field_b = 0;
                    break L1;
                  } else {
                    fieldTemp$2 = this.field_b;
                    this.field_b = this.field_b + 1;
                    this.field_h[fieldTemp$2] = (byte) 0;
                    continue L2;
                  }
                }
              }
            }
            L3: while (true) {
              if (this.field_b >= 32) {
                ri.a(this.field_g, 0, this.field_h, 32, 32);
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
                    var6 = this.field_c[var4_int];
                    param0[var5] = (byte)(int)(var6 >>> -593934600);
                    param0[1 + var5] = (byte)(int)(var6 >>> -283749968);
                    param0[2 + var5] = (byte)(int)(var6 >>> 1207837160);
                    param0[var5 + 3] = (byte)(int)(var6 >>> -268176608);
                    param0[var5 - -4] = (byte)(int)(var6 >>> 2094571992);
                    param0[var5 + 5] = (byte)(int)(var6 >>> 1197518160);
                    param0[var5 + 6] = (byte)(int)(var6 >>> -1660682680);
                    param0[var5 + 7] = (byte)(int)var6;
                    var4_int++;
                    var5 += 8;
                    continue L4;
                  }
                }
              } else {
                fieldTemp$3 = this.field_b;
                this.field_b = this.field_b + 1;
                this.field_h[fieldTemp$3] = (byte) 0;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var4);
            stackOut_13_1 = new StringBuilder().append("we.B(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static ub a(byte[] param0, int param1) {
        ub var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        ub stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ub stackOut_5_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (param0 != null) {
              L1: {
                var2 = new ub(param0, ak.field_c, vi.field_c, vc.field_b, ih.field_d, ih.field_b);
                tb.f((byte) -128);
                if (param1 == 1) {
                  break L1;
                } else {
                  we.a((byte) 22);
                  break L1;
                }
              }
              stackOut_5_0 = (ub) (var2);
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var2_ref);
            stackOut_7_1 = new StringBuilder().append("we.F(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ub) ((Object) stackIn_2_0);
        } else {
          return stackIn_6_0;
        }
    }

    we() {
        this.field_g = new byte[32];
        this.field_d = new long[8];
        this.field_h = new byte[64];
        this.field_f = new long[8];
        this.field_c = new long[8];
        this.field_b = 0;
        this.field_k = 0;
        this.field_j = new long[8];
        this.field_i = new long[8];
    }

    static {
        field_e = "Super cannon";
    }
}
