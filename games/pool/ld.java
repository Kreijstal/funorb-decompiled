/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld {
    static String field_f;
    private byte[] field_a;
    private long[] field_o;
    static int field_c;
    static String field_h;
    static int field_g;
    private long[] field_e;
    private int field_k;
    private int field_j;
    static String field_i;
    private long[] field_l;
    private long[] field_m;
    private long[] field_n;
    private byte[] field_d;
    static int field_b;

    final void a(byte[] param0, byte param1, int param2) {
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
        var8 = Pool.field_O;
        try {
          L0: {
            L1: {
              ((ld) this).field_a[((ld) this).field_k] = (byte)md.a((int) ((ld) this).field_a[((ld) this).field_k], 128 >>> rb.b(((ld) this).field_j, 7));
              ((ld) this).field_k = ((ld) this).field_k + 1;
              if (((ld) this).field_k <= 32) {
                break L1;
              } else {
                L2: while (true) {
                  if (((ld) this).field_k >= 64) {
                    this.b(125);
                    ((ld) this).field_k = 0;
                    break L1;
                  } else {
                    int fieldTemp$2 = ((ld) this).field_k;
                    ((ld) this).field_k = ((ld) this).field_k + 1;
                    ((ld) this).field_a[fieldTemp$2] = (byte) 0;
                    continue L2;
                  }
                }
              }
            }
            L3: while (true) {
              if (((ld) this).field_k >= 32) {
                L4: {
                  qn.a(((ld) this).field_d, 0, ((ld) this).field_a, 32, 32);
                  this.b(124);
                  if (param1 > 97) {
                    break L4;
                  } else {
                    ((ld) this).a((byte[]) null, -112, 52L);
                    break L4;
                  }
                }
                var4_int = 0;
                var5 = param2;
                L5: while (true) {
                  if (8 <= var4_int) {
                    break L0;
                  } else {
                    var6 = ((ld) this).field_o[var4_int];
                    param0[var5] = (byte)(int)(var6 >>> 56);
                    param0[1 + var5] = (byte)(int)(var6 >>> 48);
                    param0[var5 + 2] = (byte)(int)(var6 >>> 40);
                    param0[3 + var5] = (byte)(int)(var6 >>> 32);
                    param0[var5 - -4] = (byte)(int)(var6 >>> 24);
                    param0[5 + var5] = (byte)(int)(var6 >>> 16);
                    param0[var5 - -6] = (byte)(int)(var6 >>> 8);
                    param0[7 + var5] = (byte)(int)var6;
                    var4_int++;
                    var5 += 8;
                    continue L5;
                  }
                }
              } else {
                int fieldTemp$3 = ((ld) this).field_k;
                ((ld) this).field_k = ((ld) this).field_k + 1;
                ((ld) this).field_a[fieldTemp$3] = (byte) 0;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("ld.C(");
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
          throw wm.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a() {
        if (em.field_P > 0) {
            em.field_P = em.field_P - 1;
        }
        if (sh.field_P.field_k != cb.field_g) {
            fd.field_J = fd.field_J + (sh.field_P.field_k + -cb.field_g);
            cb.field_g = sh.field_P.field_k;
        }
        int var1 = -37;
        if (0 < em.field_P) {
            int discarded$0 = 23323;
            wa.l();
        }
    }

    final static qp a(byte param0, vh param1, int[] param2, vh param3, vh param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        String[] var6 = null;
        char[] var7 = null;
        qp[] var8 = null;
        int var9 = 0;
        int var10_int = 0;
        Exception var10 = null;
        ap var11 = null;
        int var12 = 0;
        char[] var13 = null;
        char[] var14 = null;
        char[] var15 = null;
        char[] var16 = null;
        Object stackIn_7_0 = null;
        qp stackIn_9_0 = null;
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
        Throwable decompiledCaughtException = null;
        Object stackOut_6_0 = null;
        qp stackOut_8_0 = null;
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
        var12 = Pool.field_O;
        try {
          L0: {
            var5_int = param2.length;
            var6 = new String[var5_int];
            var16 = new char[var5_int];
            var15 = var16;
            var14 = var15;
            var13 = var14;
            var7 = var13;
            var8 = new qp[var5_int];
            var9 = 49;
            try {
              L1: {
                var10_int = 0;
                L2: while (true) {
                  if (var5_int <= var10_int) {
                    break L1;
                  } else {
                    var11 = o.field_x.a(127, param2[var10_int]);
                    var6[var10_int] = var11.e(0);
                    var9 = (char)(var9 + 1);
                    var7[var10_int] = (char)var9;
                    var8[var10_int] = null;
                    var10_int++;
                    continue L2;
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var10 = (Exception) (Object) decompiledCaughtException;
              stackOut_6_0 = null;
              stackIn_7_0 = stackOut_6_0;
              return (qp) (Object) stackIn_7_0;
            }
            stackOut_8_0 = new qp(0L, param1, param3, param4, var8, param2, var6, var16);
            stackIn_9_0 = stackOut_8_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L3: {
            var5 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("ld.A(").append(92).append(',');
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
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          L4: {
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
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          L5: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          L6: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param4 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ')');
        }
        return stackIn_9_0;
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
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var13 = Pool.field_O;
        try {
          L0: {
            var5_int = param1;
            var6 = 7 & 8 - ((int)param2 & 7);
            var7 = ((ld) this).field_j & 7;
            var9 = param2;
            var11 = 31;
            var12 = 0;
            L1: while (true) {
              if (var11 < 0) {
                L2: while (true) {
                  if (param2 <= 8L) {
                    L3: {
                      if (param2 > 0L) {
                        var8 = param0[var5_int] << var6 & 255;
                        ((ld) this).field_a[((ld) this).field_k] = (byte)md.a((int) ((ld) this).field_a[((ld) this).field_k], var8 >>> var7);
                        break L3;
                      } else {
                        var8 = 0;
                        break L3;
                      }
                    }
                    L4: {
                      if (param2 + (long)var7 >= 8L) {
                        L5: {
                          param2 = param2 - (long)(8 - var7);
                          ((ld) this).field_k = ((ld) this).field_k + 1;
                          ((ld) this).field_j = ((ld) this).field_j + (8 - var7);
                          if (((ld) this).field_j != 512) {
                            break L5;
                          } else {
                            this.b(param1 ^ 120);
                            ((ld) this).field_j = 0;
                            ((ld) this).field_k = 0;
                            break L5;
                          }
                        }
                        ((ld) this).field_a[((ld) this).field_k] = (byte)rb.b(var8 << -var7 + 8, 255);
                        ((ld) this).field_j = ((ld) this).field_j + (int)param2;
                        break L4;
                      } else {
                        ((ld) this).field_j = (int)((long)((ld) this).field_j + param2);
                        break L4;
                      }
                    }
                    break L0;
                  } else {
                    L6: {
                      var8 = 255 & param0[var5_int] << var6 | (param0[1 + var5_int] & 255) >>> -var6 + 8;
                      if (var8 < 0) {
                        break L6;
                      } else {
                        if (256 > var8) {
                          L7: {
                            ((ld) this).field_a[((ld) this).field_k] = (byte)md.a((int) ((ld) this).field_a[((ld) this).field_k], var8 >>> var7);
                            ((ld) this).field_k = ((ld) this).field_k + 1;
                            ((ld) this).field_j = ((ld) this).field_j + (8 + -var7);
                            if (512 == ((ld) this).field_j) {
                              this.b(119);
                              ((ld) this).field_k = 0;
                              ((ld) this).field_j = 0;
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          ((ld) this).field_a[((ld) this).field_k] = (byte)rb.b(var8 << 8 + -var7, 255);
                          ((ld) this).field_j = ((ld) this).field_j + var7;
                          param2 = param2 - 8L;
                          var5_int++;
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
                var12 = var12 + (((int)var9 & 255) + (255 & ((ld) this).field_d[var11]));
                ((ld) this).field_d[var11] = (byte)var12;
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
            stackOut_22_0 = (RuntimeException) var5;
            stackOut_22_1 = new StringBuilder().append("ld.E(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = Pool.field_O;
        for (var2 = 0; var2 < 32; var2++) {
            ((ld) this).field_d[var2] = (byte) 0;
        }
        ((ld) this).field_a[0] = (byte) 0;
        ((ld) this).field_j = 0;
        ((ld) this).field_k = 0;
        var2 = 0;
        if (param0) {
            ((ld) this).field_m = null;
        }
        while (var2 < 8) {
            ((ld) this).field_o[var2] = 0L;
            var2++;
        }
    }

    private final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var6 = Pool.field_O;
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
                    L3: {
                      if (param0 > 103) {
                        break L3;
                      } else {
                        ((ld) this).field_e = null;
                        break L3;
                      }
                    }
                    var2 = 0;
                    L4: while (true) {
                      if (var2 >= 8) {
                        return;
                      } else {
                        ((ld) this).field_o[var2] = im.a(((ld) this).field_o[var2], im.a(((ld) this).field_l[var2], ((ld) this).field_n[var2]));
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
                            ((ld) this).field_m[0] = im.a(((ld) this).field_m[0], n.field_Z[var2]);
                            var3 = 0;
                            L7: while (true) {
                              if (8 <= var3) {
                                var3 = 0;
                                L8: while (true) {
                                  if (8 <= var3) {
                                    var2++;
                                    continue L2;
                                  } else {
                                    ((ld) this).field_l[var3] = ((ld) this).field_e[var3];
                                    var3++;
                                    continue L8;
                                  }
                                }
                              } else {
                                ((ld) this).field_e[var3] = ((ld) this).field_m[var3];
                                var7 = 0;
                                var4 = var7;
                                var5 = 56;
                                L9: while (true) {
                                  if (var7 >= 8) {
                                    var3++;
                                    continue L7;
                                  } else {
                                    ((ld) this).field_e[var3] = im.a(((ld) this).field_e[var3], n.field_N[var7][rb.b(255, (int)(((ld) this).field_l[rb.b(var3 - var7, 7)] >>> var5))]);
                                    var7++;
                                    var5 -= 8;
                                    continue L9;
                                  }
                                }
                              }
                            }
                          } else {
                            ((ld) this).field_m[var3] = ((ld) this).field_e[var3];
                            var3++;
                            continue L6;
                          }
                        }
                      } else {
                        ((ld) this).field_e[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L10: while (true) {
                          if (8 <= var4) {
                            var3++;
                            continue L5;
                          } else {
                            ((ld) this).field_e[var3] = im.a(((ld) this).field_e[var3], n.field_N[var4][rb.b((int)(((ld) this).field_m[rb.b(7, var3 + -var4)] >>> var5), 255)]);
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
                ((ld) this).field_m[var2] = ((ld) this).field_o[var2];
                ((ld) this).field_l[var2] = im.a(((ld) this).field_n[var2], ((ld) this).field_o[var2]);
                var2++;
                continue L1;
              }
            }
          } else {
            ((ld) this).field_n[var2] = im.a(mj.a((long)((ld) this).field_a[7 + var3], 255L), im.a(im.a(mj.a((long)((ld) this).field_a[var3 - -5], 255L) << 16, im.a(mj.a((long)((ld) this).field_a[var3 - -4], 255L) << 24, im.a(im.a(im.a(mj.a((long)((ld) this).field_a[1 + var3] << 48, 71776119061217280L), (long)((ld) this).field_a[var3] << 56), mj.a((long)((ld) this).field_a[2 + var3], 255L) << 40), mj.a(1095216660480L, (long)((ld) this).field_a[3 + var3] << 32)))), mj.a(65280L, (long)((ld) this).field_a[var3 - -6] << 8)));
            var2++;
            var3 += 8;
            continue L0;
          }
        }
    }

    final static int a(int param0) {
        return 1;
    }

    public static void c() {
        field_i = null;
        field_f = null;
        field_h = null;
    }

    ld() {
        ((ld) this).field_a = new byte[64];
        ((ld) this).field_o = new long[8];
        ((ld) this).field_k = 0;
        ((ld) this).field_l = new long[8];
        ((ld) this).field_n = new long[8];
        ((ld) this).field_j = 0;
        ((ld) this).field_e = new long[8];
        ((ld) this).field_m = new long[8];
        ((ld) this).field_d = new byte[32];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Stripes";
        field_i = "You need a rating of <%1> to play with the current options.";
        field_c = 0;
        field_f = "Pause Menu";
    }
}
