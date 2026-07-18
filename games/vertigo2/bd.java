/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bd {
    private int field_m;
    private long[] field_c;
    private long[] field_h;
    private int field_i;
    private long[] field_k;
    private byte[] field_j;
    private byte[] field_a;
    private long[] field_l;
    static char[] field_d;
    private long[] field_b;
    static ve field_e;
    static String field_g;
    static int field_f;

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
        var8 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              ((bd) this).field_a[((bd) this).field_m] = (byte)om.a((int) ((bd) this).field_a[((bd) this).field_m], 128 >>> b.a(((bd) this).field_i, 7));
              ((bd) this).field_m = ((bd) this).field_m + 1;
              if (((bd) this).field_m <= 32) {
                break L1;
              } else {
                L2: while (true) {
                  if (((bd) this).field_m >= 64) {
                    this.b(120);
                    ((bd) this).field_m = 0;
                    break L1;
                  } else {
                    int fieldTemp$2 = ((bd) this).field_m;
                    ((bd) this).field_m = ((bd) this).field_m + 1;
                    ((bd) this).field_a[fieldTemp$2] = (byte) 0;
                    continue L2;
                  }
                }
              }
            }
            L3: while (true) {
              if (32 <= ((bd) this).field_m) {
                qq.a(((bd) this).field_j, 0, ((bd) this).field_a, 32, 32);
                this.b(120);
                var4_int = 0;
                var5 = param2;
                L4: while (true) {
                  if (var4_int >= 8) {
                    L5: {
                      if (param1 > 83) {
                        break L5;
                      } else {
                        ((bd) this).a((byte[]) null, 114L, 12);
                        break L5;
                      }
                    }
                    break L0;
                  } else {
                    var6 = ((bd) this).field_l[var4_int];
                    param0[var5] = (byte)(int)(var6 >>> 56);
                    param0[var5 - -1] = (byte)(int)(var6 >>> 48);
                    param0[2 + var5] = (byte)(int)(var6 >>> 40);
                    param0[var5 - -3] = (byte)(int)(var6 >>> 32);
                    param0[4 + var5] = (byte)(int)(var6 >>> 24);
                    param0[var5 + 5] = (byte)(int)(var6 >>> 16);
                    param0[var5 + 6] = (byte)(int)(var6 >>> 8);
                    param0[var5 - -7] = (byte)(int)var6;
                    var5 += 8;
                    var4_int++;
                    continue L4;
                  }
                }
              } else {
                int fieldTemp$3 = ((bd) this).field_m;
                ((bd) this).field_m = ((bd) this).field_m + 1;
                ((bd) this).field_a[fieldTemp$3] = (byte) 0;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("bd.D(");
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
          throw wn.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = Vertigo2.field_L ? 1 : 0;
        for (var2 = 0; 32 > var2; var2++) {
            ((bd) this).field_j[var2] = (byte) 0;
        }
        ((bd) this).field_a[0] = (byte) 0;
        ((bd) this).field_m = 0;
        ((bd) this).field_i = 0;
        var2 = 0;
        if (param0 != 8) {
            field_d = null;
        }
        while (var2 < 8) {
            ((bd) this).field_l[var2] = 0L;
            var2++;
        }
    }

    public static void c(int param0) {
        field_e = null;
        field_d = null;
        field_g = null;
    }

    final void a(byte[] param0, long param1, int param2) {
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
        var13 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            var6 = 7 & 8 - (7 & (int)param1);
            var7 = 7 & ((bd) this).field_i;
            var9 = param1;
            var11 = 31;
            var12 = 0;
            L1: while (true) {
              if (var11 < 0) {
                L2: while (true) {
                  if (param1 <= 8L) {
                    L3: {
                      if (param1 <= 0L) {
                        var8 = 0;
                        break L3;
                      } else {
                        var8 = param0[var5_int] << var6 & 255;
                        ((bd) this).field_a[((bd) this).field_m] = (byte)om.a((int) ((bd) this).field_a[((bd) this).field_m], var8 >>> var7);
                        break L3;
                      }
                    }
                    L4: {
                      if (param2 > 93) {
                        break L4;
                      } else {
                        field_f = 119;
                        break L4;
                      }
                    }
                    L5: {
                      if (param1 + (long)var7 < 8L) {
                        ((bd) this).field_i = (int)((long)((bd) this).field_i + param1);
                        break L5;
                      } else {
                        L6: {
                          ((bd) this).field_m = ((bd) this).field_m + 1;
                          ((bd) this).field_i = ((bd) this).field_i + (-var7 + 8);
                          param1 = param1 - (long)(8 + -var7);
                          if (((bd) this).field_i == 512) {
                            this.b(120);
                            ((bd) this).field_i = 0;
                            ((bd) this).field_m = 0;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        ((bd) this).field_a[((bd) this).field_m] = (byte)b.a(255, var8 << -var7 + 8);
                        ((bd) this).field_i = ((bd) this).field_i + (int)param1;
                        break L5;
                      }
                    }
                    break L0;
                  } else {
                    L7: {
                      var8 = 255 & param0[var5_int] << var6 | (param0[1 + var5_int] & 255) >>> -var6 + 8;
                      if (var8 < 0) {
                        break L7;
                      } else {
                        if (var8 < 256) {
                          L8: {
                            ((bd) this).field_a[((bd) this).field_m] = (byte)om.a((int) ((bd) this).field_a[((bd) this).field_m], var8 >>> var7);
                            ((bd) this).field_i = ((bd) this).field_i + (8 - var7);
                            ((bd) this).field_m = ((bd) this).field_m + 1;
                            if (((bd) this).field_i != 512) {
                              break L8;
                            } else {
                              this.b(120);
                              ((bd) this).field_i = 0;
                              ((bd) this).field_m = 0;
                              break L8;
                            }
                          }
                          ((bd) this).field_a[((bd) this).field_m] = (byte)b.a(255, var8 << 8 + -var7);
                          param1 = param1 - 8L;
                          ((bd) this).field_i = ((bd) this).field_i + var7;
                          var5_int++;
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
                var12 = var12 + (((int)var9 & 255) + (255 & ((bd) this).field_j[var11]));
                ((bd) this).field_j[var11] = (byte)var12;
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
            stackOut_24_1 = new StringBuilder().append("bd.E(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
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
          throw wn.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var6 = Vertigo2.field_L ? 1 : 0;
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
                      if (param0 == 120) {
                        break L3;
                      } else {
                        this.b(66);
                        break L3;
                      }
                    }
                    var2 = 0;
                    L4: while (true) {
                      if (var2 >= 8) {
                        return;
                      } else {
                        ((bd) this).field_l[var2] = og.a(((bd) this).field_l[var2], og.a(((bd) this).field_c[var2], ((bd) this).field_k[var2]));
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
                          if (8 <= var3) {
                            ((bd) this).field_h[0] = og.a(((bd) this).field_h[0], ro.field_d[var2]);
                            var3 = 0;
                            L7: while (true) {
                              if (var3 >= 8) {
                                var3 = 0;
                                L8: while (true) {
                                  if (var3 >= 8) {
                                    var2++;
                                    continue L2;
                                  } else {
                                    ((bd) this).field_k[var3] = ((bd) this).field_b[var3];
                                    var3++;
                                    continue L8;
                                  }
                                }
                              } else {
                                ((bd) this).field_b[var3] = ((bd) this).field_h[var3];
                                var7 = 0;
                                var4 = var7;
                                var5 = 56;
                                L9: while (true) {
                                  if (var7 >= 8) {
                                    var3++;
                                    continue L7;
                                  } else {
                                    ((bd) this).field_b[var3] = og.a(((bd) this).field_b[var3], ro.field_h[var7][b.a(255, (int)(((bd) this).field_k[b.a(var3 - var7, 7)] >>> var5))]);
                                    var7++;
                                    var5 -= 8;
                                    continue L9;
                                  }
                                }
                              }
                            }
                          } else {
                            ((bd) this).field_h[var3] = ((bd) this).field_b[var3];
                            var3++;
                            continue L6;
                          }
                        }
                      } else {
                        ((bd) this).field_b[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L10: while (true) {
                          if (var4 >= 8) {
                            var3++;
                            continue L5;
                          } else {
                            ((bd) this).field_b[var3] = og.a(((bd) this).field_b[var3], ro.field_h[var4][b.a(255, (int)(((bd) this).field_h[b.a(7, -var4 + var3)] >>> var5))]);
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
                ((bd) this).field_h[var2] = ((bd) this).field_l[var2];
                ((bd) this).field_k[var2] = og.a(((bd) this).field_c[var2], ((bd) this).field_l[var2]);
                var2++;
                continue L1;
              }
            }
          } else {
            ((bd) this).field_c[var2] = og.a(j.a((long)((bd) this).field_a[var3 + 7], 255L), og.a(og.a(j.a((long)((bd) this).field_a[5 + var3], 255L) << 16, og.a(j.a(4278190080L, (long)((bd) this).field_a[4 + var3] << 24), og.a(j.a((long)((bd) this).field_a[var3 + 3] << 32, 1095216660480L), og.a(og.a(j.a(71776119061217280L, (long)((bd) this).field_a[1 + var3] << 48), (long)((bd) this).field_a[var3] << 56), j.a((long)((bd) this).field_a[var3 - -2], 255L) << 40)))), j.a(255L, (long)((bd) this).field_a[var3 + 6]) << 8));
            var3 += 8;
            var2++;
            continue L0;
          }
        }
    }

    bd() {
        ((bd) this).field_m = 0;
        ((bd) this).field_c = new long[8];
        ((bd) this).field_k = new long[8];
        ((bd) this).field_i = 0;
        ((bd) this).field_a = new byte[64];
        ((bd) this).field_j = new byte[32];
        ((bd) this).field_b = new long[8];
        ((bd) this).field_h = new long[8];
        ((bd) this).field_l = new long[8];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        field_g = "This private message is prefixed with \"<col=9090FF>To <%1>:</col>\" on your screen.<br>On <%1>'s screen, it will be prefixed with \"<col=FF6060>From <%0>:</col>\", which is<br>a different length and may leave less room for the message itself.<br><br>This shading covers the area which is not available on <%1>'s screen.<br>Provided your message fits to the left of the shaded area,<br><%1> should be able to see it in full.<br><br>(Note: this may be inaccurate if <%1> is playing in a different<br>language from you.)";
        field_e = new ve(9, 0, 4, 1);
        field_f = 0;
    }
}
