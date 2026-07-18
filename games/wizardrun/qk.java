/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qk {
    static String field_e;
    private long[] field_b;
    static oi field_g;
    private long[] field_c;
    static kl field_j;
    private int field_p;
    private long[] field_l;
    static String field_d;
    static String field_i;
    private long[] field_k;
    private long[] field_n;
    private byte[] field_m;
    private int field_a;
    static int[] field_f;
    private byte[] field_o;
    static String field_h;

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        ec.field_c = param4;
        lc.field_a = param2;
        ki.field_I = param1;
        si.field_f = param0;
    }

    final void a(byte[] param0, int param1, byte param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        long var6_long = 0L;
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
        var8 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              ((qk) this).field_o[((qk) this).field_a] = (byte)sd.a((int) ((qk) this).field_o[((qk) this).field_a], 128 >>> kl.b(7, ((qk) this).field_p));
              ((qk) this).field_a = ((qk) this).field_a + 1;
              if (((qk) this).field_a > 32) {
                L2: while (true) {
                  if (((qk) this).field_a >= 64) {
                    this.b(-42);
                    ((qk) this).field_a = 0;
                    break L1;
                  } else {
                    int fieldTemp$2 = ((qk) this).field_a;
                    ((qk) this).field_a = ((qk) this).field_a + 1;
                    ((qk) this).field_o[fieldTemp$2] = (byte) 0;
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            L3: while (true) {
              if (((qk) this).field_a >= 32) {
                g.a(((qk) this).field_m, 0, ((qk) this).field_o, 32, 32);
                this.b(-34);
                var4_int = 0;
                var5 = param1;
                L4: while (true) {
                  if (8 <= var4_int) {
                    var6 = 88 / ((69 - param2) / 54);
                    break L0;
                  } else {
                    var6_long = ((qk) this).field_l[var4_int];
                    param0[var5] = (byte)(int)(var6_long >>> 56);
                    param0[1 + var5] = (byte)(int)(var6_long >>> 48);
                    param0[2 + var5] = (byte)(int)(var6_long >>> 40);
                    param0[3 + var5] = (byte)(int)(var6_long >>> 32);
                    param0[4 + var5] = (byte)(int)(var6_long >>> 24);
                    param0[5 + var5] = (byte)(int)(var6_long >>> 16);
                    param0[6 + var5] = (byte)(int)(var6_long >>> 8);
                    param0[7 + var5] = (byte)(int)var6_long;
                    var4_int++;
                    var5 += 8;
                    continue L4;
                  }
                }
              } else {
                int fieldTemp$3 = ((qk) this).field_a;
                ((qk) this).field_a = ((qk) this).field_a + 1;
                ((qk) this).field_o[fieldTemp$3] = (byte) 0;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("qk.C(");
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
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static int a(String param0, int param1, String param2, String param3, int param4, int param5, boolean param6) {
        ne var7 = null;
        RuntimeException var7_ref = null;
        ne var8 = null;
        int stackIn_1_0 = 0;
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
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
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
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var7 = new ne(param2);
            var8 = new ne(param3);
            int discarded$2 = 27851;
            stackOut_0_0 = qi.a(var7, var8, param0, param4, param1, param6);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var7_ref;
            stackOut_2_1 = new StringBuilder().append("qk.D(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
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
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param1).append(',');
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
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param4 + ',' + 0 + ',' + param6 + ')');
        }
        return stackIn_1_0;
    }

    private final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var6 = wizardrun.field_H;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if (var2 >= 8) {
            var2 = 0;
            L1: while (true) {
              if (8 <= var2) {
                var3 = 107 % ((param0 - 19) / 44);
                var2 = 1;
                L2: while (true) {
                  if (var2 > 10) {
                    var2 = 0;
                    L3: while (true) {
                      if (8 <= var2) {
                        return;
                      } else {
                        ((qk) this).field_l[var2] = da.a(((qk) this).field_l[var2], da.a(((qk) this).field_b[var2], ((qk) this).field_k[var2]));
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
                          if (8 <= var3) {
                            ((qk) this).field_n[0] = da.a(((qk) this).field_n[0], le.field_f[var2]);
                            var3 = 0;
                            L6: while (true) {
                              if (var3 >= 8) {
                                var3 = 0;
                                L7: while (true) {
                                  if (var3 >= 8) {
                                    var2++;
                                    continue L2;
                                  } else {
                                    ((qk) this).field_k[var3] = ((qk) this).field_c[var3];
                                    var3++;
                                    continue L7;
                                  }
                                }
                              } else {
                                ((qk) this).field_c[var3] = ((qk) this).field_n[var3];
                                var7 = 0;
                                var4 = var7;
                                var5 = 56;
                                L8: while (true) {
                                  if (var7 >= 8) {
                                    var3++;
                                    continue L6;
                                  } else {
                                    ((qk) this).field_c[var3] = da.a(((qk) this).field_c[var3], le.field_A[var7][kl.b(255, (int)(((qk) this).field_k[kl.b(7, -var7 + var3)] >>> var5))]);
                                    var5 -= 8;
                                    var7++;
                                    continue L8;
                                  }
                                }
                              }
                            }
                          } else {
                            ((qk) this).field_n[var3] = ((qk) this).field_c[var3];
                            var3++;
                            continue L5;
                          }
                        }
                      } else {
                        ((qk) this).field_c[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L9: while (true) {
                          if (8 <= var4) {
                            var3++;
                            continue L4;
                          } else {
                            ((qk) this).field_c[var3] = da.a(((qk) this).field_c[var3], le.field_A[var4][kl.b((int)(((qk) this).field_n[kl.b(7, var3 + -var4)] >>> var5), 255)]);
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
                ((qk) this).field_n[var2] = ((qk) this).field_l[var2];
                ((qk) this).field_k[var2] = da.a(((qk) this).field_b[var2], ((qk) this).field_l[var2]);
                var2++;
                continue L1;
              }
            }
          } else {
            ((qk) this).field_b[var2] = da.a(gf.a(255L, (long)((qk) this).field_o[var3 - -7]), da.a(gf.a((long)((qk) this).field_o[var3 - -6] << 8, 65280L), da.a(da.a(gf.a((long)((qk) this).field_o[4 + var3] << 24, 4278190080L), da.a(da.a(da.a(gf.a((long)((qk) this).field_o[var3 - -1] << 48, 71776119061217280L), (long)((qk) this).field_o[var3] << 56), gf.a(280375465082880L, (long)((qk) this).field_o[2 + var3] << 40)), gf.a(255L, (long)((qk) this).field_o[var3 - -3]) << 32)), gf.a(16711680L, (long)((qk) this).field_o[var3 + 5] << 16))));
            var3 += 8;
            var2++;
            continue L0;
          }
        }
    }

    public static void a() {
        field_j = null;
        field_d = null;
        field_g = null;
        field_f = null;
        field_i = null;
        field_h = null;
        field_e = null;
        int var1 = 28;
    }

    final void a(long param0, byte[] param1, byte param2) {
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
        var13 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              var5_int = 0;
              if (param2 == -19) {
                break L1;
              } else {
                field_f = null;
                break L1;
              }
            }
            var6 = 8 - ((int)param0 & 7) & 7;
            var7 = ((qk) this).field_p & 7;
            var9 = param0;
            var11 = 31;
            var12 = 0;
            L2: while (true) {
              if (var11 < 0) {
                L3: while (true) {
                  if (param0 <= 8L) {
                    L4: {
                      if (0L >= param0) {
                        var8 = 0;
                        break L4;
                      } else {
                        var8 = 255 & param1[var5_int] << var6;
                        ((qk) this).field_o[((qk) this).field_a] = (byte)sd.a((int) ((qk) this).field_o[((qk) this).field_a], var8 >>> var7);
                        break L4;
                      }
                    }
                    L5: {
                      if (8L <= param0 + (long)var7) {
                        L6: {
                          ((qk) this).field_a = ((qk) this).field_a + 1;
                          param0 = param0 - (long)(-var7 + 8);
                          ((qk) this).field_p = ((qk) this).field_p + (-var7 + 8);
                          if (((qk) this).field_p != 512) {
                            break L6;
                          } else {
                            this.b(86);
                            ((qk) this).field_a = 0;
                            ((qk) this).field_p = 0;
                            break L6;
                          }
                        }
                        ((qk) this).field_o[((qk) this).field_a] = (byte)kl.b(var8 << 8 + -var7, 255);
                        ((qk) this).field_p = ((qk) this).field_p + (int)param0;
                        break L5;
                      } else {
                        ((qk) this).field_p = (int)((long)((qk) this).field_p + param0);
                        break L5;
                      }
                    }
                    break L0;
                  } else {
                    L7: {
                      var8 = 255 & param1[var5_int] << var6 | (param1[var5_int - -1] & 255) >>> 8 - var6;
                      if (var8 < 0) {
                        break L7;
                      } else {
                        if (var8 >= 256) {
                          break L7;
                        } else {
                          L8: {
                            ((qk) this).field_o[((qk) this).field_a] = (byte)sd.a((int) ((qk) this).field_o[((qk) this).field_a], var8 >>> var7);
                            ((qk) this).field_p = ((qk) this).field_p + (8 + -var7);
                            ((qk) this).field_a = ((qk) this).field_a + 1;
                            if (((qk) this).field_p != 512) {
                              break L8;
                            } else {
                              this.b(-111);
                              ((qk) this).field_p = 0;
                              ((qk) this).field_a = 0;
                              break L8;
                            }
                          }
                          ((qk) this).field_o[((qk) this).field_a] = (byte)kl.b(var8 << -var7 + 8, 255);
                          var5_int++;
                          ((qk) this).field_p = ((qk) this).field_p + var7;
                          param0 = param0 - 8L;
                          continue L3;
                        }
                      }
                    }
                    throw new RuntimeException("LOGIC ERROR");
                  }
                }
              } else {
                var12 = var12 + ((255 & ((qk) this).field_m[var11]) - -((int)var9 & 255));
                ((qk) this).field_m[var11] = (byte)var12;
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
            stackOut_23_1 = new StringBuilder().append("qk.B(").append(param0).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
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
          throw bd.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ',' + param2 + ')');
        }
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = wizardrun.field_H;
        for (var2 = 0; var2 < 32; var2++) {
            ((qk) this).field_m[var2] = (byte) 0;
        }
        ((qk) this).field_a = 0;
        ((qk) this).field_p = 0;
        ((qk) this).field_o[0] = (byte) 0;
        if (param0 < 56) {
            return;
        }
        for (var2 = 0; var2 < 8; var2++) {
            ((qk) this).field_l[var2] = 0L;
        }
    }

    qk() {
        ((qk) this).field_c = new long[8];
        ((qk) this).field_b = new long[8];
        ((qk) this).field_p = 0;
        ((qk) this).field_a = 0;
        ((qk) this).field_m = new byte[32];
        ((qk) this).field_k = new long[8];
        ((qk) this).field_o = new byte[64];
        ((qk) this).field_n = new long[8];
        ((qk) this).field_l = new long[8];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Loading levels";
        field_d = "Password: ";
        field_i = "Music         ";
        field_h = "Create a free Account";
    }
}
