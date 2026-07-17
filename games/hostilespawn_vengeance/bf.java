/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bf {
    private int field_e;
    private long[] field_l;
    private long[] field_k;
    private int field_b;
    private long[] field_h;
    static je field_j;
    private byte[] field_a;
    private long[] field_g;
    private long[] field_c;
    static bd[][] field_f;
    static int[] field_d;
    private byte[] field_i;

    final void a(byte[] param0, int param1, int param2) {
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
        var8 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              ((bf) this).field_i[((bf) this).field_e] = (byte)ll.a((int) ((bf) this).field_i[((bf) this).field_e], 128 >>> ua.a(7, ((bf) this).field_b));
              ((bf) this).field_e = ((bf) this).field_e + 1;
              if (((bf) this).field_e <= 32) {
                break L1;
              } else {
                L2: while (true) {
                  if (((bf) this).field_e >= 64) {
                    this.b((byte) -1);
                    ((bf) this).field_e = 0;
                    break L1;
                  } else {
                    int fieldTemp$2 = ((bf) this).field_e;
                    ((bf) this).field_e = ((bf) this).field_e + 1;
                    ((bf) this).field_i[fieldTemp$2] = (byte) 0;
                    continue L2;
                  }
                }
              }
            }
            L3: while (true) {
              if (((bf) this).field_e >= 32) {
                kf.a(((bf) this).field_a, 0, ((bf) this).field_i, 32, 32);
                this.b((byte) -1);
                if (param2 == -6) {
                  var4_int = 0;
                  var5 = param1;
                  L4: while (true) {
                    if (var4_int >= 8) {
                      break L0;
                    } else {
                      var6 = ((bf) this).field_c[var4_int];
                      param0[var5] = (byte)(int)(var6 >>> 56);
                      param0[1 + var5] = (byte)(int)(var6 >>> 48);
                      param0[2 + var5] = (byte)(int)(var6 >>> 40);
                      param0[var5 - -3] = (byte)(int)(var6 >>> 32);
                      param0[4 + var5] = (byte)(int)(var6 >>> 24);
                      param0[var5 + 5] = (byte)(int)(var6 >>> 16);
                      param0[var5 - -6] = (byte)(int)(var6 >>> 8);
                      param0[7 + var5] = (byte)(int)var6;
                      var4_int++;
                      var5 += 8;
                      continue L4;
                    }
                  }
                } else {
                  return;
                }
              } else {
                int fieldTemp$3 = ((bf) this).field_e;
                ((bf) this).field_e = ((bf) this).field_e + 1;
                ((bf) this).field_i[fieldTemp$3] = (byte) 0;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var4;
            stackOut_14_1 = new StringBuilder().append("bf.E(");
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
          throw wg.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = HostileSpawn.field_I ? 1 : 0;
        for (var2 = 0; 32 > var2; var2++) {
            ((bf) this).field_a[var2] = (byte) 0;
        }
        ((bf) this).field_i[0] = (byte) 0;
        ((bf) this).field_e = 0;
        ((bf) this).field_b = 0;
        for (var2 = 0; var2 < 8; var2++) {
            ((bf) this).field_c[var2] = 0L;
        }
        if (param0 != 30) {
            ((bf) this).field_i = null;
        }
    }

    private final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var6 = HostileSpawn.field_I ? 1 : 0;
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
                        ((bf) this).field_c[var2] = ga.a(((bf) this).field_c[var2], ga.a(((bf) this).field_h[var2], ((bf) this).field_l[var2]));
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
                            ((bf) this).field_g[0] = ga.a(((bf) this).field_g[0], i.field_c[var2]);
                            var3 = 0;
                            L6: while (true) {
                              if (var3 >= 8) {
                                var3 = 0;
                                L7: while (true) {
                                  if (var3 >= 8) {
                                    var2++;
                                    continue L2;
                                  } else {
                                    ((bf) this).field_h[var3] = ((bf) this).field_k[var3];
                                    var3++;
                                    continue L7;
                                  }
                                }
                              } else {
                                ((bf) this).field_k[var3] = ((bf) this).field_g[var3];
                                var7 = 0;
                                var4 = var7;
                                var5 = 56;
                                L8: while (true) {
                                  if (var7 >= 8) {
                                    var3++;
                                    continue L6;
                                  } else {
                                    ((bf) this).field_k[var3] = ga.a(((bf) this).field_k[var3], i.field_a[var7][ua.a((int)(((bf) this).field_h[ua.a(7, -var7 + var3)] >>> var5), 255)]);
                                    var5 -= 8;
                                    var7++;
                                    continue L8;
                                  }
                                }
                              }
                            }
                          } else {
                            ((bf) this).field_g[var3] = ((bf) this).field_k[var3];
                            var3++;
                            continue L5;
                          }
                        }
                      } else {
                        ((bf) this).field_k[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L9: while (true) {
                          if (var4 >= 8) {
                            var3++;
                            continue L4;
                          } else {
                            ((bf) this).field_k[var3] = ga.a(((bf) this).field_k[var3], i.field_a[var4][ua.a((int)(((bf) this).field_g[ua.a(7, var3 - var4)] >>> var5), 255)]);
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
                ((bf) this).field_g[var2] = ((bf) this).field_c[var2];
                ((bf) this).field_h[var2] = ga.a(((bf) this).field_l[var2], ((bf) this).field_c[var2]);
                var2++;
                continue L1;
              }
            }
          } else {
            ((bf) this).field_l[var2] = ga.a(ga.a(dk.a(255L, (long)((bf) this).field_i[6 + var3]) << 8, ga.a(ga.a(dk.a(255L, (long)((bf) this).field_i[var3 - -4]) << 24, ga.a(dk.a(1095216660480L, (long)((bf) this).field_i[var3 + 3] << 32), ga.a(ga.a((long)((bf) this).field_i[var3] << 56, dk.a((long)((bf) this).field_i[var3 + 1], 255L) << 48), dk.a(255L, (long)((bf) this).field_i[2 + var3]) << 40))), dk.a(16711680L, (long)((bf) this).field_i[var3 - -5] << 16))), dk.a((long)((bf) this).field_i[var3 - -7], 255L));
            var3 += 8;
            var2++;
            continue L0;
          }
        }
    }

    public static void a(int param0) {
        field_j = null;
        field_f = null;
        field_d = null;
        if (param0 != 2107940192) {
            field_f = null;
        }
    }

    final static gb a(boolean param0, boolean param1, int param2, int param3, boolean param4, int param5) {
        try {
            Object var6 = null;
            Object var7 = null;
            int var8 = 0;
            rb var9 = null;
            gb stackIn_12_0 = null;
            Throwable decompiledCaughtException = null;
            gb stackOut_11_0 = null;
            try {
              L0: {
                L1: {
                  var6 = null;
                  var7 = null;
                  var8 = 5 / ((param5 - 28) / 39);
                  if (jj.field_k.field_l == null) {
                    break L1;
                  } else {
                    mk.field_K = new bn(jj.field_k.field_l, 5200, 0);
                    jj.field_k.field_l = null;
                    var6 = (Object) (Object) new um(255, mk.field_K, new bn(jj.field_k.field_f, 12000, 0), 2097152);
                    break L1;
                  }
                }
                L2: {
                  if (null == mk.field_K) {
                    break L2;
                  } else {
                    L3: {
                      if (oe.field_a != null) {
                        break L3;
                      } else {
                        oe.field_a = new bn[jj.field_k.field_v.length];
                        break L3;
                      }
                    }
                    L4: {
                      if (null != oe.field_a[param2]) {
                        break L4;
                      } else {
                        oe.field_a[param2] = new bn(jj.field_k.field_v[param2], 12000, 0);
                        jj.field_k.field_v[param2] = null;
                        break L4;
                      }
                    }
                    var7 = (Object) (Object) new um(param2, mk.field_K, oe.field_a[param2], 2097152);
                    break L2;
                  }
                }
                L5: {
                  var9 = sj.field_a.a(param0, param2, (um) var6, (um) var7, 0);
                  if (param4) {
                    var9.a((byte) -50);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                stackOut_11_0 = new gb((uk) (Object) var9, param1, param3);
                stackIn_12_0 = stackOut_11_0;
                break L0;
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Object) (Object) decompiledCaughtException;
              throw new RuntimeException(((IOException) var6).toString());
            }
            return stackIn_12_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(byte param0, byte[] param1, long param2) {
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
        var13 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            if (param0 >= 107) {
              var6 = 7 & 8 - ((int)param2 & 7);
              var7 = ((bf) this).field_b & 7;
              var9 = param2;
              var11 = 31;
              var12 = 0;
              L1: while (true) {
                if (0 > var11) {
                  L2: while (true) {
                    if (param2 <= 8L) {
                      L3: {
                        if (param2 > 0L) {
                          var8 = 255 & param1[var5_int] << var6;
                          ((bf) this).field_i[((bf) this).field_e] = (byte)ll.a((int) ((bf) this).field_i[((bf) this).field_e], var8 >>> var7);
                          break L3;
                        } else {
                          var8 = 0;
                          break L3;
                        }
                      }
                      L4: {
                        if (param2 + (long)var7 < 8L) {
                          ((bf) this).field_b = (int)((long)((bf) this).field_b + param2);
                          break L4;
                        } else {
                          L5: {
                            ((bf) this).field_b = ((bf) this).field_b + (-var7 + 8);
                            ((bf) this).field_e = ((bf) this).field_e + 1;
                            param2 = param2 - (long)(-var7 + 8);
                            if (512 != ((bf) this).field_b) {
                              break L5;
                            } else {
                              this.b((byte) -1);
                              ((bf) this).field_e = 0;
                              ((bf) this).field_b = 0;
                              break L5;
                            }
                          }
                          ((bf) this).field_i[((bf) this).field_e] = (byte)ua.a(255, var8 << 8 + -var7);
                          ((bf) this).field_b = ((bf) this).field_b + (int)param2;
                          break L4;
                        }
                      }
                      break L0;
                    } else {
                      L6: {
                        var8 = 255 & param1[var5_int] << var6 | (param1[var5_int - -1] & 255) >>> 8 - var6;
                        if (var8 < 0) {
                          break L6;
                        } else {
                          if (256 > var8) {
                            L7: {
                              ((bf) this).field_i[((bf) this).field_e] = (byte)ll.a((int) ((bf) this).field_i[((bf) this).field_e], var8 >>> var7);
                              ((bf) this).field_e = ((bf) this).field_e + 1;
                              ((bf) this).field_b = ((bf) this).field_b + (8 - var7);
                              if (((bf) this).field_b != 512) {
                                break L7;
                              } else {
                                this.b((byte) -1);
                                ((bf) this).field_e = 0;
                                ((bf) this).field_b = 0;
                                break L7;
                              }
                            }
                            ((bf) this).field_i[((bf) this).field_e] = (byte)ua.a(255, var8 << 8 + -var7);
                            var5_int++;
                            param2 = param2 - 8L;
                            ((bf) this).field_b = ((bf) this).field_b + var7;
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
                  var12 = var12 + (((int)var9 & 255) + (((bf) this).field_a[var11] & 255));
                  ((bf) this).field_a[var11] = (byte)var12;
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
            stackOut_23_0 = (RuntimeException) var5;
            stackOut_23_1 = new StringBuilder().append("bf.F(").append(param0).append(44);
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
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L8;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 44 + param2 + 41);
        }
    }

    bf() {
        ((bf) this).field_e = 0;
        ((bf) this).field_b = 0;
        ((bf) this).field_k = new long[8];
        ((bf) this).field_h = new long[8];
        ((bf) this).field_l = new long[8];
        ((bf) this).field_a = new byte[32];
        ((bf) this).field_g = new long[8];
        ((bf) this).field_c = new long[8];
        ((bf) this).field_i = new byte[64];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new je();
    }
}
