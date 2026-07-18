/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class nf {
    static int[] field_i;
    static int field_l;
    private byte[] field_h;
    private int field_g;
    private long[] field_d;
    private long[] field_m;
    private byte[] field_f;
    private int field_j;
    static int field_e;
    private long[] field_n;
    static volatile boolean field_k;
    private long[] field_c;
    private long[] field_a;
    static int[] field_b;

    public static void b() {
        field_i = null;
        field_b = null;
    }

    final static void a(int param0, byte param1) {
        try {
            Throwable decompiledCaughtException = null;
            L0: {
              if (null == m.field_b) {
                break L0;
              } else {
                L1: {
                  if (0 > param0) {
                    break L1;
                  } else {
                    if (pb.field_a != r.field_c) {
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                L2: {
                  if (d.field_b.field_g != 0) {
                    break L2;
                  } else {
                    if (ca.field_Y + 10000L >= dd.b(57)) {
                      break L2;
                    } else {
                      d.field_b.d((byte) 88, param0);
                      break L2;
                    }
                  }
                }
                L3: {
                  if (d.field_b.field_g > 0) {
                    {
                      L4: {
                        m.field_b.a(0, d.field_b.field_f, (byte) 87, d.field_b.field_g);
                        ca.field_Y = dd.b(84);
                        break L4;
                      }
                    }
                    d.field_b.field_g = 0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                return;
              }
            }
            d.field_b.field_g = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, byte[] param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        long var6 = 0L;
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
        try {
          L0: {
            L1: {
              ((nf) this).field_f[((nf) this).field_g] = (byte)cl.a((int) ((nf) this).field_f[((nf) this).field_g], 128 >>> w.a(7, ((nf) this).field_j));
              if (param1 == 494486752) {
                break L1;
              } else {
                field_i = null;
                break L1;
              }
            }
            L2: {
              ((nf) this).field_g = ((nf) this).field_g + 1;
              if (((nf) this).field_g > 32) {
                L3: while (true) {
                  if (64 <= ((nf) this).field_g) {
                    int discarded$4 = 1;
                    this.a();
                    ((nf) this).field_g = 0;
                    break L2;
                  } else {
                    int fieldTemp$5 = ((nf) this).field_g;
                    ((nf) this).field_g = ((nf) this).field_g + 1;
                    ((nf) this).field_f[fieldTemp$5] = (byte) 0;
                    continue L3;
                  }
                }
              } else {
                break L2;
              }
            }
            L4: while (true) {
              if (((nf) this).field_g >= 32) {
                ug.a(((nf) this).field_h, 0, ((nf) this).field_f, 32, 32);
                int discarded$6 = 1;
                this.a();
                var4_int = 0;
                var5 = param0;
                L5: while (true) {
                  if (var4_int >= 8) {
                    break L0;
                  } else {
                    var6 = ((nf) this).field_a[var4_int];
                    param2[var5] = (byte)(int)(var6 >>> 56);
                    param2[1 + var5] = (byte)(int)(var6 >>> 48);
                    param2[var5 - -2] = (byte)(int)(var6 >>> 40);
                    param2[3 + var5] = (byte)(int)(var6 >>> 32);
                    param2[var5 - -4] = (byte)(int)(var6 >>> 24);
                    param2[5 + var5] = (byte)(int)(var6 >>> 16);
                    param2[6 + var5] = (byte)(int)(var6 >>> 8);
                    param2[var5 + 7] = (byte)(int)var6;
                    var4_int++;
                    var5 += 8;
                    continue L5;
                  }
                }
              } else {
                int fieldTemp$7 = ((nf) this).field_g;
                ((nf) this).field_g = ((nf) this).field_g + 1;
                ((nf) this).field_f[fieldTemp$7] = (byte) 0;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("nf.F(").append(param0).append(',').append(param1).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
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
          throw sd.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
    }

    final void a(int param0) {
        int var2 = 0;
        if (param0 != 5) {
            return;
        }
        while (32 > var2) {
            ((nf) this).field_h[var2] = (byte) 0;
            var2++;
        }
        ((nf) this).field_g = 0;
        ((nf) this).field_j = 0;
        ((nf) this).field_f[0] = (byte) 0;
        for (var2 = 0; 8 > var2; var2++) {
            ((nf) this).field_a[var2] = 0L;
        }
    }

    private final void a() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if (8 <= var2) {
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
                        ((nf) this).field_a[var2] = ba.a(((nf) this).field_a[var2], ba.a(((nf) this).field_m[var2], ((nf) this).field_c[var2]));
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
                            ((nf) this).field_n[0] = ba.a(((nf) this).field_n[0], lj.field_b[var2]);
                            var3 = 0;
                            L6: while (true) {
                              if (var3 >= 8) {
                                var3 = 0;
                                L7: while (true) {
                                  if (var3 >= 8) {
                                    var2++;
                                    continue L2;
                                  } else {
                                    ((nf) this).field_m[var3] = ((nf) this).field_d[var3];
                                    var3++;
                                    continue L7;
                                  }
                                }
                              } else {
                                ((nf) this).field_d[var3] = ((nf) this).field_n[var3];
                                var6 = 0;
                                var4 = var6;
                                var5 = 56;
                                L8: while (true) {
                                  if (8 <= var6) {
                                    var3++;
                                    continue L6;
                                  } else {
                                    ((nf) this).field_d[var3] = ba.a(((nf) this).field_d[var3], lj.field_e[var6][w.a((int)(((nf) this).field_m[w.a(var3 - var6, 7)] >>> var5), 255)]);
                                    var5 -= 8;
                                    var6++;
                                    continue L8;
                                  }
                                }
                              }
                            }
                          } else {
                            ((nf) this).field_n[var3] = ((nf) this).field_d[var3];
                            var3++;
                            continue L5;
                          }
                        }
                      } else {
                        ((nf) this).field_d[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L9: while (true) {
                          if (var4 >= 8) {
                            var3++;
                            continue L4;
                          } else {
                            ((nf) this).field_d[var3] = ba.a(((nf) this).field_d[var3], lj.field_e[var4][w.a(255, (int)(((nf) this).field_n[w.a(7, -var4 + var3)] >>> var5))]);
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
                ((nf) this).field_n[var2] = ((nf) this).field_a[var2];
                ((nf) this).field_m[var2] = ba.a(((nf) this).field_c[var2], ((nf) this).field_a[var2]);
                var2++;
                continue L1;
              }
            }
          } else {
            ((nf) this).field_c[var2] = ba.a(r.a((long)((nf) this).field_f[7 + var3], 255L), ba.a(r.a(65280L, (long)((nf) this).field_f[6 + var3] << 8), ba.a(r.a(16711680L, (long)((nf) this).field_f[var3 + 5] << 16), ba.a(r.a(255L, (long)((nf) this).field_f[var3 - -4]) << 24, ba.a(r.a((long)((nf) this).field_f[3 + var3] << 32, 1095216660480L), ba.a(ba.a(r.a((long)((nf) this).field_f[var3 + 1], 255L) << 48, (long)((nf) this).field_f[var3] << 56), r.a((long)((nf) this).field_f[var3 + 2], 255L) << 40))))));
            var3 += 8;
            var2++;
            continue L0;
          }
        }
    }

    final static boolean a(boolean param0, String param1, String param2, int param3, String param4, int param5, kh param6) {
        RuntimeException var7 = null;
        ok var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            if (uh.field_k == cl.field_k) {
              int discarded$2 = 124;
              nf.b();
              var8 = new ok(ti.field_b, param6);
              ti.field_b.a((byte) 72, (uj) (Object) var8);
              if (dd.a((byte) 77)) {
                var8.p(10341);
                stackOut_8_0 = 1;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                L1: {
                  uh.field_k = jl.field_a;
                  qb.field_a = param3;
                  jl.field_c = param2;
                  wj.field_c = param4;
                  gj.field_a = null;
                  lh.field_D = param1;
                  if (!param0) {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    break L1;
                  } else {
                    stackOut_5_0 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    break L1;
                  }
                }
                sk.field_b = stackIn_7_0 != 0;
                return true;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var7;
            stackOut_10_1 = new StringBuilder().append("nf.C(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          L3: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          L4: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param3).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param4 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          L5: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(0).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param6 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L5;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ')');
        }
        return stackIn_9_0 != 0;
    }

    final void a(long param0, int param1, byte[] param2) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        Object var13 = null;
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
        try {
          L0: {
            var5_int = 0;
            var6 = 7 & -((int)param0 & 7) + 8;
            var7 = ((nf) this).field_j & 7;
            var9 = param0;
            var11 = 31;
            var12 = 0;
            L1: while (true) {
              if (var11 < 0) {
                L2: while (true) {
                  if (param0 <= 8L) {
                    L3: {
                      if (0L < param0) {
                        var8 = param2[var5_int] << var6 & 255;
                        ((nf) this).field_f[((nf) this).field_g] = (byte)cl.a((int) ((nf) this).field_f[((nf) this).field_g], var8 >>> var7);
                        break L3;
                      } else {
                        var8 = 0;
                        break L3;
                      }
                    }
                    L4: {
                      if ((long)var7 - -param0 >= 8L) {
                        L5: {
                          ((nf) this).field_g = ((nf) this).field_g + 1;
                          ((nf) this).field_j = ((nf) this).field_j + (-var7 + 8);
                          param0 = param0 - (long)(8 + -var7);
                          if (((nf) this).field_j == 512) {
                            int discarded$2 = 1;
                            this.a();
                            ((nf) this).field_j = 0;
                            ((nf) this).field_g = 0;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        ((nf) this).field_f[((nf) this).field_g] = (byte)w.a(255, var8 << -var7 + 8);
                        ((nf) this).field_j = ((nf) this).field_j + (int)param0;
                        break L4;
                      } else {
                        ((nf) this).field_j = (int)((long)((nf) this).field_j + param0);
                        break L4;
                      }
                    }
                    L6: {
                      if (param1 == 614) {
                        break L6;
                      } else {
                        var13 = null;
                        ((nf) this).a(-42L, -88, (byte[]) null);
                        break L6;
                      }
                    }
                    break L0;
                  } else {
                    L7: {
                      var8 = param2[var5_int] << var6 & 255 | (param2[1 + var5_int] & 255) >>> -var6 + 8;
                      if (var8 < 0) {
                        break L7;
                      } else {
                        if (var8 < 256) {
                          L8: {
                            ((nf) this).field_f[((nf) this).field_g] = (byte)cl.a((int) ((nf) this).field_f[((nf) this).field_g], var8 >>> var7);
                            ((nf) this).field_g = ((nf) this).field_g + 1;
                            ((nf) this).field_j = ((nf) this).field_j + (8 + -var7);
                            if (((nf) this).field_j == 512) {
                              int discarded$3 = 1;
                              this.a();
                              ((nf) this).field_g = 0;
                              ((nf) this).field_j = 0;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          ((nf) this).field_f[((nf) this).field_g] = (byte)w.a(255, var8 << -var7 + 8);
                          var5_int++;
                          ((nf) this).field_j = ((nf) this).field_j + var7;
                          param0 = param0 - 8L;
                          continue L2;
                        } else {
                          break L7;
                        }
                      }
                    }
                    throw new RuntimeException("LOGIC ERROR");
                  }
                }
              } else {
                var12 = var12 + (((int)var9 & 255) + (((nf) this).field_h[var11] & 255));
                ((nf) this).field_h[var11] = (byte)var12;
                var12 = var12 >>> 8;
                var9 = var9 >>> 8;
                var11--;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var5;
            stackOut_24_1 = new StringBuilder().append("nf.G(").append(param0).append(',').append(param1).append(',');
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
          throw sd.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ')');
        }
    }

    nf() {
        ((nf) this).field_f = new byte[64];
        ((nf) this).field_j = 0;
        ((nf) this).field_h = new byte[32];
        ((nf) this).field_n = new long[8];
        ((nf) this).field_d = new long[8];
        ((nf) this).field_g = 0;
        ((nf) this).field_a = new long[8];
        ((nf) this).field_c = new long[8];
        ((nf) this).field_m = new long[8];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = true;
    }
}
