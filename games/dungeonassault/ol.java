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
              ((ol) this).field_m[((ol) this).field_h] = (byte)mp.a((int) ((ol) this).field_m[((ol) this).field_h], 128 >>> nb.a(((ol) this).field_d, 7));
              if (param0 == -88) {
                break L1;
              } else {
                ((ol) this).b(-45);
                break L1;
              }
            }
            L2: {
              ((ol) this).field_h = ((ol) this).field_h + 1;
              if (((ol) this).field_h <= 32) {
                break L2;
              } else {
                L3: while (true) {
                  if (((ol) this).field_h >= 64) {
                    this.a(param0 + 96);
                    ((ol) this).field_h = 0;
                    break L2;
                  } else {
                    int fieldTemp$2 = ((ol) this).field_h;
                    ((ol) this).field_h = ((ol) this).field_h + 1;
                    ((ol) this).field_m[fieldTemp$2] = (byte) 0;
                    continue L3;
                  }
                }
              }
            }
            L4: while (true) {
              if (((ol) this).field_h >= 32) {
                cj.a(((ol) this).field_l, 0, ((ol) this).field_m, 32, 32);
                this.a(8);
                var4_int = 0;
                var5 = param2;
                L5: while (true) {
                  if (var4_int >= 8) {
                    break L0;
                  } else {
                    var6 = ((ol) this).field_g[var4_int];
                    param1[var5] = (byte)(int)(var6 >>> 56);
                    param1[1 + var5] = (byte)(int)(var6 >>> 48);
                    param1[2 + var5] = (byte)(int)(var6 >>> 40);
                    param1[var5 + 3] = (byte)(int)(var6 >>> 32);
                    param1[var5 - -4] = (byte)(int)(var6 >>> 24);
                    param1[var5 - -5] = (byte)(int)(var6 >>> 16);
                    param1[var5 + 6] = (byte)(int)(var6 >>> 8);
                    param1[var5 - -7] = (byte)(int)var6;
                    var4_int++;
                    var5 += 8;
                    continue L5;
                  }
                }
              } else {
                int fieldTemp$3 = ((ol) this).field_h;
                ((ol) this).field_h = ((ol) this).field_h + 1;
                ((ol) this).field_m[fieldTemp$3] = (byte) 0;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("ol.A(").append(param0).append(44);
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
          throw vk.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param2 + 41);
        }
    }

    final void b(int param0) {
        int var2 = 0;
        int var4 = DungeonAssault.field_K;
        for (var2 = 0; 32 > var2; var2++) {
            ((ol) this).field_l[var2] = (byte) 0;
        }
        ((ol) this).field_d = 0;
        ((ol) this).field_m[0] = (byte) 0;
        ((ol) this).field_h = 0;
        var2 = 0;
        int var3 = 31 / ((param0 - 84) / 40);
        while (8 > var2) {
            ((ol) this).field_g[var2] = 0L;
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
                    ((ol) this).field_j = null;
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
                        ((ol) this).field_g[var2] = mn.a(((ol) this).field_g[var2], mn.a(((ol) this).field_f[var2], ((ol) this).field_j[var2]));
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
                            ((ol) this).field_c[0] = mn.a(((ol) this).field_c[0], gh.field_a[var2]);
                            var3 = 0;
                            L7: while (true) {
                              if (var3 >= 8) {
                                var3 = 0;
                                L8: while (true) {
                                  if (8 <= var3) {
                                    var2++;
                                    continue L3;
                                  } else {
                                    ((ol) this).field_f[var3] = ((ol) this).field_e[var3];
                                    var3++;
                                    continue L8;
                                  }
                                }
                              } else {
                                ((ol) this).field_e[var3] = ((ol) this).field_c[var3];
                                var7 = 0;
                                var4 = var7;
                                var5 = 56;
                                L9: while (true) {
                                  if (var7 >= 8) {
                                    var3++;
                                    continue L7;
                                  } else {
                                    ((ol) this).field_e[var3] = mn.a(((ol) this).field_e[var3], gh.field_h[var7][nb.a(255, (int)(((ol) this).field_f[nb.a(7, var3 + -var7)] >>> var5))]);
                                    var5 -= 8;
                                    var7++;
                                    continue L9;
                                  }
                                }
                              }
                            }
                          } else {
                            ((ol) this).field_c[var3] = ((ol) this).field_e[var3];
                            var3++;
                            continue L6;
                          }
                        }
                      } else {
                        ((ol) this).field_e[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L10: while (true) {
                          if (var4 >= 8) {
                            var3++;
                            continue L5;
                          } else {
                            ((ol) this).field_e[var3] = mn.a(((ol) this).field_e[var3], gh.field_h[var4][nb.a(255, (int)(((ol) this).field_c[nb.a(7, var3 + -var4)] >>> var5))]);
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
                ((ol) this).field_c[var2] = ((ol) this).field_g[var2];
                ((ol) this).field_f[var2] = mn.a(((ol) this).field_j[var2], ((ol) this).field_g[var2]);
                var2++;
                continue L1;
              }
            }
          } else {
            ((ol) this).field_j[var2] = mn.a(eg.a(255L, (long)((ol) this).field_m[7 + var3]), mn.a(eg.a((long)((ol) this).field_m[6 + var3], 255L) << 8, mn.a(mn.a(eg.a(255L, (long)((ol) this).field_m[4 + var3]) << 24, mn.a(eg.a(255L, (long)((ol) this).field_m[var3 - -3]) << 32, mn.a(eg.a((long)((ol) this).field_m[2 + var3] << 40, 280375465082880L), mn.a(eg.a(255L, (long)((ol) this).field_m[1 + var3]) << 48, (long)((ol) this).field_m[var3] << 56)))), eg.a((long)((ol) this).field_m[5 + var3] << 16, 16711680L))));
            var2++;
            var3 += 8;
            continue L0;
          }
        }
    }

    public static void a() {
        field_a = null;
        field_i = null;
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
            var7 = 7 & ((ol) this).field_d;
            if (param1 == 17567) {
              var9 = param0;
              var11 = 31;
              var12 = 0;
              L1: while (true) {
                if (var11 < 0) {
                  L2: while (true) {
                    if (param0 <= 8L) {
                      L3: {
                        if (param0 <= 0L) {
                          var8 = 0;
                          break L3;
                        } else {
                          var8 = param2[var5_int] << var6 & 255;
                          ((ol) this).field_m[((ol) this).field_h] = (byte)mp.a((int) ((ol) this).field_m[((ol) this).field_h], var8 >>> var7);
                          break L3;
                        }
                      }
                      L4: {
                        if (param0 + (long)var7 < 8L) {
                          ((ol) this).field_d = (int)((long)((ol) this).field_d + param0);
                          break L4;
                        } else {
                          L5: {
                            ((ol) this).field_d = ((ol) this).field_d + (-var7 + 8);
                            param0 = param0 - (long)(8 - var7);
                            ((ol) this).field_h = ((ol) this).field_h + 1;
                            if (512 == ((ol) this).field_d) {
                              this.a(8);
                              ((ol) this).field_h = 0;
                              ((ol) this).field_d = 0;
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          ((ol) this).field_m[((ol) this).field_h] = (byte)nb.a(255, var8 << -var7 + 8);
                          ((ol) this).field_d = ((ol) this).field_d + (int)param0;
                          break L4;
                        }
                      }
                      break L0;
                    } else {
                      L6: {
                        var8 = 255 & param2[var5_int] << var6 | (param2[var5_int - -1] & 255) >>> -var6 + 8;
                        if (0 > var8) {
                          break L6;
                        } else {
                          if (var8 >= 256) {
                            break L6;
                          } else {
                            L7: {
                              ((ol) this).field_m[((ol) this).field_h] = (byte)mp.a((int) ((ol) this).field_m[((ol) this).field_h], var8 >>> var7);
                              ((ol) this).field_h = ((ol) this).field_h + 1;
                              ((ol) this).field_d = ((ol) this).field_d + (8 - var7);
                              if (((ol) this).field_d != 512) {
                                break L7;
                              } else {
                                this.a(param1 + -17559);
                                ((ol) this).field_d = 0;
                                ((ol) this).field_h = 0;
                                break L7;
                              }
                            }
                            ((ol) this).field_m[((ol) this).field_h] = (byte)nb.a(var8 << -var7 + 8, 255);
                            param0 = param0 - 8L;
                            var5_int++;
                            ((ol) this).field_d = ((ol) this).field_d + var7;
                            continue L2;
                          }
                        }
                      }
                      throw new RuntimeException("LOGIC ERROR");
                    }
                  }
                } else {
                  var12 = var12 + (((int)var9 & 255) + (255 & ((ol) this).field_l[var11]));
                  ((ol) this).field_l[var11] = (byte)var12;
                  var12 = var12 >>> 8;
                  var9 = var9 >>> 8;
                  var11--;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var5;
            stackOut_24_1 = new StringBuilder().append("ol.B(").append(param0).append(44).append(param1).append(44);
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
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L8;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 41);
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
            var4 = (ue) (Object) qm.field_q.e(-24172);
            L1: while (true) {
              if (var4 == null) {
                var2 = bg.field_s.e(-24172);
                L2: while (true) {
                  if (var2 == null) {
                    break L0;
                  } else {
                    hp.a(6, (byte) 110);
                    var2 = bg.field_s.a(4);
                    continue L2;
                  }
                }
              } else {
                wd.a((byte) -69, 6, var4);
                var4 = (ue) (Object) qm.field_q.a(4);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var2_ref, "ol.E(" + 8 + 44 + 6 + 41);
        }
    }

    ol() {
        ((ol) this).field_g = new long[8];
        ((ol) this).field_f = new long[8];
        ((ol) this).field_j = new long[8];
        ((ol) this).field_d = 0;
        ((ol) this).field_m = new byte[64];
        ((ol) this).field_c = new long[8];
        ((ol) this).field_l = new byte[32];
        ((ol) this).field_e = new long[8];
        ((ol) this).field_h = 0;
    }

    static {
    }
}
