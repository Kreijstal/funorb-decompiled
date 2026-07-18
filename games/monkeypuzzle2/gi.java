/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi {
    private long[] field_k;
    private long[] field_b;
    private byte[] field_h;
    static int[] field_j;
    private long[] field_f;
    private int field_d;
    private byte[] field_i;
    static int[] field_e;
    private int field_g;
    static int field_a;
    private long[] field_m;
    private long[] field_n;
    static int field_c;
    static pj field_l;

    final void a(byte param0) {
        int var2 = 0;
        int var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        for (var2 = 0; var2 < 32; var2++) {
            ((gi) this).field_i[var2] = (byte) 0;
        }
        ((gi) this).field_g = 0;
        ((gi) this).field_h[0] = (byte)param0;
        ((gi) this).field_d = 0;
        for (var2 = 0; var2 < 8; var2++) {
            ((gi) this).field_k[var2] = 0L;
        }
    }

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    public static void b() {
        field_j = null;
        field_e = null;
        field_l = null;
    }

    final static sj a(int param0, hb param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        sj var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_5_0 = null;
        sj stackIn_24_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        sj stackOut_23_0 = null;
        Object stackOut_4_0 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = param1.f(8, 8);
            if (0 >= var2_int) {
              if (param0 <= -43) {
                L1: {
                  var3 = vg.a(89, param1) ? 1 : 0;
                  var4 = vg.a(91, param1) ? 1 : 0;
                  var5 = new sj();
                  var5.field_e = (short)param1.f(8, 16);
                  var5.field_O = nf.a(false, param1, 16, var5.field_O);
                  var5.field_M = nf.a(false, param1, 16, var5.field_M);
                  var5.field_z = nf.a(false, param1, 16, var5.field_z);
                  var5.field_k = (short)param1.f(8, 16);
                  var5.field_u = nf.a(false, param1, 16, var5.field_u);
                  var5.field_L = nf.a(false, param1, 16, var5.field_L);
                  var5.field_C = nf.a(false, param1, 16, var5.field_C);
                  if (var3 != 0) {
                    var5.field_r = (short)param1.f(8, 16);
                    var5.field_y = nf.a(false, param1, 16, var5.field_y);
                    var5.field_p = nf.a(false, param1, 16, var5.field_p);
                    var5.field_K = nf.a(false, param1, 16, var5.field_K);
                    var5.field_d = nf.a(false, param1, 16, var5.field_d);
                    var5.field_n = nf.a(false, param1, 16, var5.field_n);
                    var5.field_A = nf.a(false, param1, 16, var5.field_A);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (var4 != 0) {
                    int discarded$2 = param1.f(8, 16);
                    var5.field_m = nf.a(false, param1, 16, var5.field_m);
                    var5.field_h = nf.a(false, param1, 16, var5.field_h);
                    var5.field_a = nf.a(false, param1, 16, var5.field_a);
                    var5.field_I = nf.a(false, param1, 16, var5.field_I);
                    var5.field_l = nf.a(false, param1, 16, var5.field_l);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (!vg.a(74, param1)) {
                    break L3;
                  } else {
                    var5.field_c = nf.a(false, param1, 16, var5.field_c);
                    break L3;
                  }
                }
                L4: {
                  if (!vg.a(75, param1)) {
                    break L4;
                  } else {
                    int discarded$3 = 99;
                    var5.field_N = kk.a(16, param1, var5.field_N);
                    var6 = 0;
                    var7 = 0;
                    L5: while (true) {
                      if (var5.field_N.length <= var7) {
                        if (var6 == 0) {
                          var5.field_N = null;
                          break L4;
                        } else {
                          var5.field_D = (byte)(var6 + 1);
                          break L4;
                        }
                      } else {
                        L6: {
                          if (var6 >= (var5.field_N[var7] & 255)) {
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        var7++;
                        continue L5;
                      }
                    }
                  }
                }
                stackOut_23_0 = (sj) var5;
                stackIn_24_0 = stackOut_23_0;
                break L0;
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return (sj) (Object) stackIn_5_0;
              }
            } else {
              throw new IllegalStateException("" + var2_int);
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var2;
            stackOut_25_1 = new StringBuilder().append("gi.G(").append(param0).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L7;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L7;
            }
          }
          throw la.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ')');
        }
        return stackIn_24_0;
    }

    final void a(int param0, byte param1, byte[] param2) {
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
        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              ((gi) this).field_h[((gi) this).field_d] = (byte)bd.a((int) ((gi) this).field_h[((gi) this).field_d], 128 >>> ch.a(((gi) this).field_g, 7));
              ((gi) this).field_d = ((gi) this).field_d + 1;
              if (((gi) this).field_d > 32) {
                L2: while (true) {
                  if (((gi) this).field_d >= 64) {
                    int discarded$4 = 16;
                    this.a();
                    ((gi) this).field_d = 0;
                    break L1;
                  } else {
                    int fieldTemp$5 = ((gi) this).field_d;
                    ((gi) this).field_d = ((gi) this).field_d + 1;
                    ((gi) this).field_h[fieldTemp$5] = (byte) 0;
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            L3: while (true) {
              if (32 <= ((gi) this).field_d) {
                gl.a(((gi) this).field_i, 0, ((gi) this).field_h, 32, 32);
                int discarded$6 = 16;
                this.a();
                var4_int = 0;
                if (param1 == -70) {
                  var5 = param0;
                  L4: while (true) {
                    if (var4_int >= 8) {
                      break L0;
                    } else {
                      var6 = ((gi) this).field_k[var4_int];
                      param2[var5] = (byte)(int)(var6 >>> 56);
                      param2[1 + var5] = (byte)(int)(var6 >>> 48);
                      param2[2 + var5] = (byte)(int)(var6 >>> 40);
                      param2[var5 + 3] = (byte)(int)(var6 >>> 32);
                      param2[4 + var5] = (byte)(int)(var6 >>> 24);
                      param2[var5 - -5] = (byte)(int)(var6 >>> 16);
                      param2[var5 - -6] = (byte)(int)(var6 >>> 8);
                      param2[var5 - -7] = (byte)(int)var6;
                      var4_int++;
                      var5 += 8;
                      continue L4;
                    }
                  }
                } else {
                  return;
                }
              } else {
                int fieldTemp$7 = ((gi) this).field_d;
                ((gi) this).field_d = ((gi) this).field_d + 1;
                ((gi) this).field_h[fieldTemp$7] = (byte) 0;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var4;
            stackOut_14_1 = new StringBuilder().append("gi.B(").append(param0).append(',').append(param1).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw la.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
    }

    final static void a(byte param0, String param1, String param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
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
            ff.a(false, -109, param2, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("gi.C(").append(87).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw la.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
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
        var13 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            var6 = 8 + -((int)param0 & 7) & 7;
            var7 = 7 & ((gi) this).field_g;
            if (param1 < -51) {
              var9 = param0;
              var11 = 31;
              var12 = 0;
              L1: while (true) {
                if (var11 < 0) {
                  L2: while (true) {
                    if (8L >= param0) {
                      L3: {
                        if (param0 <= 0L) {
                          var8 = 0;
                          break L3;
                        } else {
                          var8 = param2[var5_int] << var6 & 255;
                          ((gi) this).field_h[((gi) this).field_d] = (byte)bd.a((int) ((gi) this).field_h[((gi) this).field_d], var8 >>> var7);
                          break L3;
                        }
                      }
                      L4: {
                        if (param0 + (long)var7 >= 8L) {
                          L5: {
                            ((gi) this).field_g = ((gi) this).field_g + (-var7 + 8);
                            param0 = param0 - (long)(8 - var7);
                            ((gi) this).field_d = ((gi) this).field_d + 1;
                            if (((gi) this).field_g != 512) {
                              break L5;
                            } else {
                              int discarded$2 = 16;
                              this.a();
                              ((gi) this).field_g = 0;
                              ((gi) this).field_d = 0;
                              break L5;
                            }
                          }
                          ((gi) this).field_h[((gi) this).field_d] = (byte)ch.a(var8 << 8 + -var7, 255);
                          ((gi) this).field_g = ((gi) this).field_g + (int)param0;
                          break L4;
                        } else {
                          ((gi) this).field_g = (int)((long)((gi) this).field_g + param0);
                          break L4;
                        }
                      }
                      break L0;
                    } else {
                      L6: {
                        var8 = param2[var5_int] << var6 & 255 | (param2[var5_int - -1] & 255) >>> -var6 + 8;
                        if (0 > var8) {
                          break L6;
                        } else {
                          if (var8 >= 256) {
                            break L6;
                          } else {
                            L7: {
                              ((gi) this).field_h[((gi) this).field_d] = (byte)bd.a((int) ((gi) this).field_h[((gi) this).field_d], var8 >>> var7);
                              ((gi) this).field_d = ((gi) this).field_d + 1;
                              ((gi) this).field_g = ((gi) this).field_g + (8 - var7);
                              if (512 == ((gi) this).field_g) {
                                int discarded$3 = 16;
                                this.a();
                                ((gi) this).field_d = 0;
                                ((gi) this).field_g = 0;
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                            ((gi) this).field_h[((gi) this).field_d] = (byte)ch.a(var8 << -var7 + 8, 255);
                            param0 = param0 - 8L;
                            var5_int++;
                            ((gi) this).field_g = ((gi) this).field_g + var7;
                            continue L2;
                          }
                        }
                      }
                      throw new RuntimeException("LOGIC ERROR");
                    }
                  }
                } else {
                  var12 = var12 + ((((gi) this).field_i[var11] & 255) - -(255 & (int)var9));
                  ((gi) this).field_i[var11] = (byte)var12;
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
            stackOut_24_1 = new StringBuilder().append("gi.E(").append(param0).append(',').append(param1).append(',');
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
          throw la.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ')');
        }
    }

    private final void a() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
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
                        ((gi) this).field_k[var2] = hd.a(((gi) this).field_k[var2], hd.a(((gi) this).field_n[var2], ((gi) this).field_m[var2]));
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
                            ((gi) this).field_f[0] = hd.a(((gi) this).field_f[0], nc.field_g[var2]);
                            var3 = 0;
                            L6: while (true) {
                              if (var3 >= 8) {
                                var3 = 0;
                                L7: while (true) {
                                  if (var3 >= 8) {
                                    var2++;
                                    continue L2;
                                  } else {
                                    ((gi) this).field_m[var3] = ((gi) this).field_b[var3];
                                    var3++;
                                    continue L7;
                                  }
                                }
                              } else {
                                ((gi) this).field_b[var3] = ((gi) this).field_f[var3];
                                var7 = 0;
                                var4 = var7;
                                var5 = 56;
                                L8: while (true) {
                                  if (var7 >= 8) {
                                    var3++;
                                    continue L6;
                                  } else {
                                    ((gi) this).field_b[var3] = hd.a(((gi) this).field_b[var3], nc.field_d[var7][ch.a(255, (int)(((gi) this).field_m[ch.a(7, var3 - var7)] >>> var5))]);
                                    var7++;
                                    var5 -= 8;
                                    continue L8;
                                  }
                                }
                              }
                            }
                          } else {
                            ((gi) this).field_f[var3] = ((gi) this).field_b[var3];
                            var3++;
                            continue L5;
                          }
                        }
                      } else {
                        ((gi) this).field_b[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L9: while (true) {
                          if (var4 >= 8) {
                            var3++;
                            continue L4;
                          } else {
                            ((gi) this).field_b[var3] = hd.a(((gi) this).field_b[var3], nc.field_d[var4][ch.a((int)(((gi) this).field_f[ch.a(var3 + -var4, 7)] >>> var5), 255)]);
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
                ((gi) this).field_f[var2] = ((gi) this).field_k[var2];
                ((gi) this).field_m[var2] = hd.a(((gi) this).field_n[var2], ((gi) this).field_k[var2]);
                var2++;
                continue L1;
              }
            }
          } else {
            ((gi) this).field_n[var2] = hd.a(hd.a(hd.a(sk.a((long)((gi) this).field_h[var3 - -5], 255L) << 16, hd.a(hd.a(sk.a((long)((gi) this).field_h[3 + var3] << 32, 1095216660480L), hd.a(hd.a(sk.a((long)((gi) this).field_h[1 + var3] << 48, 71776119061217280L), (long)((gi) this).field_h[var3] << 56), sk.a((long)((gi) this).field_h[var3 + 2] << 40, 280375465082880L))), sk.a((long)((gi) this).field_h[var3 + 4], 255L) << 24)), sk.a((long)((gi) this).field_h[var3 - -6], 255L) << 8), sk.a((long)((gi) this).field_h[var3 + 7], 255L));
            var3 += 8;
            var2++;
            continue L0;
          }
        }
    }

    gi() {
        ((gi) this).field_k = new long[8];
        ((gi) this).field_f = new long[8];
        ((gi) this).field_i = new byte[32];
        ((gi) this).field_b = new long[8];
        ((gi) this).field_d = 0;
        ((gi) this).field_n = new long[8];
        ((gi) this).field_h = new byte[64];
        ((gi) this).field_m = new long[8];
        ((gi) this).field_g = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new int[8192];
        field_l = new pj();
    }
}
