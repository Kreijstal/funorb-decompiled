/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ol {
    private long[] field_f;
    private long[] field_g;
    private long[] field_j;
    static int[] field_k;
    private byte[] field_m;
    static af field_i;
    private int field_h;
    private long[] field_c;
    private byte[] field_l;
    private int field_d;
    static cn[] field_a;
    private long[] field_e;
    static cn field_b;

    final void a(byte param0, byte[] param1, int param2) {
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
        var8 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              this.field_m[this.field_h] = (byte)mp.a((int) this.field_m[this.field_h], 128 >>> nb.a(this.field_d, 7));
              if (param0 == -88) {
                break L1;
              } else {
                this.b(-45);
                break L1;
              }
            }
            L2: {
              this.field_h = this.field_h + 1;
              if ((this.field_h ^ -1) >= -33) {
                break L2;
              } else {
                L3: while (true) {
                  if ((this.field_h ^ -1) <= -65) {
                    this.a(param0 + 96);
                    this.field_h = 0;
                    break L2;
                  } else {
                    fieldTemp$2 = this.field_h;
                    this.field_h = this.field_h + 1;
                    this.field_m[fieldTemp$2] = (byte) 0;
                    continue L3;
                  }
                }
              }
            }
            L4: while (true) {
              if ((this.field_h ^ -1) <= -33) {
                cj.a(this.field_l, 0, this.field_m, 32, 32);
                this.a(8);
                var4_int = 0;
                var5 = param2;
                L5: while (true) {
                  if ((var4_int ^ -1) <= -9) {
                    break L0;
                  } else {
                    var6 = this.field_g[var4_int];
                    param1[var5] = (byte)(int)(var6 >>> -1037948552);
                    param1[1 + var5] = (byte)(int)(var6 >>> 345750896);
                    param1[2 + var5] = (byte)(int)(var6 >>> 882204200);
                    param1[var5 + 3] = (byte)(int)(var6 >>> -1365373664);
                    param1[var5 - -4] = (byte)(int)(var6 >>> -292663080);
                    param1[var5 - -5] = (byte)(int)(var6 >>> 1435816912);
                    param1[var5 + 6] = (byte)(int)(var6 >>> -753469560);
                    param1[var5 - -7] = (byte)(int)var6;
                    var4_int++;
                    var5 += 8;
                    continue L5;
                  }
                }
              } else {
                fieldTemp$3 = this.field_h;
                this.field_h = this.field_h + 1;
                this.field_m[fieldTemp$3] = (byte) 0;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var4);
            stackOut_13_1 = new StringBuilder().append("ol.A(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
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
          throw vk.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param2 + ')');
        }
    }

    final void b(int param0) {
        int var2 = 0;
        int var4 = DungeonAssault.field_K;
        for (var2 = 0; 32 > var2; var2++) {
            this.field_l[var2] = (byte) 0;
        }
        this.field_d = 0;
        this.field_m[0] = (byte) 0;
        this.field_h = 0;
        var2 = 0;
        int var3 = 31 / ((param0 - 84) / 40);
        while (8 > var2) {
            this.field_g[var2] = 0L;
            var2++;
        }
    }

    private final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var6 = DungeonAssault.field_K;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if (8 <= var2) {
            var2 = 0;
            L1: while (true) {
              if (var2 >= 8) {
                L2: {
                  if (param0 == 8) {
                    break L2;
                  } else {
                    this.field_j = (long[]) null;
                    break L2;
                  }
                }
                var2 = 1;
                L3: while (true) {
                  if (-11 > (var2 ^ -1)) {
                    var2 = 0;
                    L4: while (true) {
                      if (-9 >= (var2 ^ -1)) {
                        return;
                      } else {
                        this.field_g[var2] = mn.a(this.field_g[var2], mn.a(this.field_f[var2], this.field_j[var2]));
                        var2++;
                        continue L4;
                      }
                    }
                  } else {
                    var3 = 0;
                    L5: while (true) {
                      if ((var3 ^ -1) <= -9) {
                        var3 = 0;
                        L6: while (true) {
                          if ((var3 ^ -1) <= -9) {
                            this.field_c[0] = mn.a(this.field_c[0], gh.field_a[var2]);
                            var3 = 0;
                            L7: while (true) {
                              if (-9 >= (var3 ^ -1)) {
                                var3 = 0;
                                L8: while (true) {
                                  if (8 <= var3) {
                                    var2++;
                                    continue L3;
                                  } else {
                                    this.field_f[var3] = this.field_e[var3];
                                    var3++;
                                    continue L8;
                                  }
                                }
                              } else {
                                this.field_e[var3] = this.field_c[var3];
                                var7 = 0;
                                var4 = var7;
                                var5 = 56;
                                L9: while (true) {
                                  if (-9 >= (var7 ^ -1)) {
                                    var3++;
                                    continue L7;
                                  } else {
                                    this.field_e[var3] = mn.a(this.field_e[var3], gh.field_h[var7][nb.a(255, (int)(this.field_f[nb.a(7, var3 + -var7)] >>> var5))]);
                                    var5 -= 8;
                                    var7++;
                                    continue L9;
                                  }
                                }
                              }
                            }
                          } else {
                            this.field_c[var3] = this.field_e[var3];
                            var3++;
                            continue L6;
                          }
                        }
                      } else {
                        this.field_e[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L10: while (true) {
                          if ((var4 ^ -1) <= -9) {
                            var3++;
                            continue L5;
                          } else {
                            this.field_e[var3] = mn.a(this.field_e[var3], gh.field_h[var4][nb.a(255, (int)(this.field_c[nb.a(7, var3 + -var4)] >>> var5))]);
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
                this.field_c[var2] = this.field_g[var2];
                this.field_f[var2] = mn.a(this.field_j[var2], this.field_g[var2]);
                var2++;
                continue L1;
              }
            }
          } else {
            this.field_j[var2] = mn.a(eg.a(255L, (long)this.field_m[7 + var3]), mn.a(eg.a((long)this.field_m[6 + var3], 255L) << -465320312, mn.a(mn.a(eg.a(255L, (long)this.field_m[4 + var3]) << 1878853272, mn.a(eg.a(255L, (long)this.field_m[var3 - -3]) << 1441222688, mn.a(eg.a((long)this.field_m[2 + var3] << 826957352, 280375465082880L), mn.a(eg.a(255L, (long)this.field_m[1 + var3]) << -713356496, (long)this.field_m[var3] << -838498248)))), eg.a((long)this.field_m[5 + var3] << 1939760336, 16711680L))));
            var2++;
            var3 += 8;
            continue L0;
          }
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_i = null;
        if (param0 >= -38) {
            return;
        }
        field_k = null;
        field_b = null;
    }

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
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var13 = DungeonAssault.field_K;
        try {
          L0: {
            var5_int = 0;
            var6 = 7 & -(7 & (int)param0) + 8;
            var7 = 7 & this.field_d;
            if (param1 == 17567) {
              var9 = param0;
              var11 = 31;
              var12 = 0;
              L1: while (true) {
                if (var11 < 0) {
                  L2: while (true) {
                    if ((param0 ^ -1L) >= -9L) {
                      L3: {
                        if ((param0 ^ -1L) >= -1L) {
                          var8 = 0;
                          break L3;
                        } else {
                          var8 = param2[var5_int] << var6 & 255;
                          this.field_m[this.field_h] = (byte)mp.a((int) this.field_m[this.field_h], var8 >>> var7);
                          break L3;
                        }
                      }
                      L4: {
                        if ((param0 + (long)var7 ^ -1L) > -9L) {
                          this.field_d = (int)((long)this.field_d + param0);
                          break L4;
                        } else {
                          L5: {
                            this.field_d = this.field_d + (-var7 + 8);
                            param0 = param0 - (long)(8 - var7);
                            this.field_h = this.field_h + 1;
                            if (512 == this.field_d) {
                              this.a(8);
                              this.field_h = 0;
                              this.field_d = 0;
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          this.field_m[this.field_h] = (byte)nb.a(255, var8 << -var7 + 8);
                          this.field_d = this.field_d + (int)param0;
                          break L4;
                        }
                      }
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      L6: {
                        var8 = 255 & param2[var5_int] << var6 | (param2[var5_int - -1] & 255) >>> -var6 + 8;
                        if (0 > var8) {
                          break L6;
                        } else {
                          if ((var8 ^ -1) <= -257) {
                            break L6;
                          } else {
                            L7: {
                              this.field_m[this.field_h] = (byte)mp.a((int) this.field_m[this.field_h], var8 >>> var7);
                              this.field_h = this.field_h + 1;
                              this.field_d = this.field_d + (8 - var7);
                              if (-513 != (this.field_d ^ -1)) {
                                break L7;
                              } else {
                                this.a(param1 + -17559);
                                this.field_d = 0;
                                this.field_h = 0;
                                break L7;
                              }
                            }
                            this.field_m[this.field_h] = (byte)nb.a(var8 << -var7 + 8, 255);
                            param0 = param0 - 8L;
                            var5_int++;
                            this.field_d = this.field_d + var7;
                            continue L2;
                          }
                        }
                      }
                      throw new RuntimeException("LOGIC ERROR");
                    }
                  }
                } else {
                  var12 = var12 + (((int)var9 & 255) + (255 & this.field_l[var11]));
                  this.field_l[var11] = (byte)var12;
                  var12 = var12 >>> 8;
                  var9 = var9 >>> 8;
                  var11--;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var5);
            stackOut_24_1 = new StringBuilder().append("ol.B(").append(param0).append(',').append(param1).append(',');
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
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L8;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, int param1) {
        ne var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        ue var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = DungeonAssault.field_K;
        try {
          L0: {
            var4 = (ue) ((Object) qm.field_q.e(-24172));
            L1: while (true) {
              if (var4 == null) {
                L2: {
                  if (param0 == 8) {
                    break L2;
                  } else {
                    ol.a((byte) -74);
                    break L2;
                  }
                }
                var2 = bg.field_s.e(param0 + -24180);
                L3: while (true) {
                  if (var2 == null) {
                    break L0;
                  } else {
                    hp.a(param1, (byte) 110);
                    var2 = bg.field_s.a(param0 ^ 12);
                    continue L3;
                  }
                }
              } else {
                wd.a((byte) -69, param1, var4);
                var4 = (ue) ((Object) qm.field_q.a(param0 ^ 12));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var2_ref), "ol.E(" + param0 + ',' + param1 + ')');
        }
    }

    ol() {
        this.field_g = new long[8];
        this.field_f = new long[8];
        this.field_j = new long[8];
        this.field_d = 0;
        this.field_m = new byte[64];
        this.field_c = new long[8];
        this.field_l = new byte[32];
        this.field_e = new long[8];
        this.field_h = 0;
    }

    static {
    }
}
