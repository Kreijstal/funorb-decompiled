/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bf {
    private byte[] field_n;
    private long[] field_h;
    static qj field_o;
    private byte[] field_g;
    static String field_c;
    static String field_d;
    private long[] field_m;
    static String field_f;
    static int[] field_a;
    private int field_l;
    private long[] field_b;
    private int field_i;
    static ng[] field_e;
    private long[] field_k;
    private long[] field_j;

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
        var13 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = 0;
              var6 = -((int)param1 & 7) + 8 & 7;
              var7 = 7 & ((bf) this).field_l;
              var9 = param1;
              if (param2 == 30654) {
                break L1;
              } else {
                ((bf) this).field_g = null;
                break L1;
              }
            }
            var11 = 31;
            var12 = 0;
            L2: while (true) {
              if (var11 < 0) {
                L3: while (true) {
                  if (param1 <= 8L) {
                    L4: {
                      if (param1 <= 0L) {
                        var8 = 0;
                        break L4;
                      } else {
                        var8 = 255 & param0[var5_int] << var6;
                        ((bf) this).field_g[((bf) this).field_i] = (byte)ok.a((int) ((bf) this).field_g[((bf) this).field_i], var8 >>> var7);
                        break L4;
                      }
                    }
                    L5: {
                      if ((long)var7 - -param1 >= 8L) {
                        L6: {
                          ((bf) this).field_i = ((bf) this).field_i + 1;
                          param1 = param1 - (long)(8 - var7);
                          ((bf) this).field_l = ((bf) this).field_l + (-var7 + 8);
                          if (((bf) this).field_l != 512) {
                            break L6;
                          } else {
                            this.b(-2);
                            ((bf) this).field_l = 0;
                            ((bf) this).field_i = 0;
                            break L6;
                          }
                        }
                        ((bf) this).field_g[((bf) this).field_i] = (byte)tc.a(255, var8 << -var7 + 8);
                        ((bf) this).field_l = ((bf) this).field_l + (int)param1;
                        break L5;
                      } else {
                        ((bf) this).field_l = (int)((long)((bf) this).field_l + param1);
                        break L5;
                      }
                    }
                    break L0;
                  } else {
                    L7: {
                      var8 = 255 & param0[var5_int] << var6 | (param0[var5_int + 1] & 255) >>> -var6 + 8;
                      if (var8 < 0) {
                        break L7;
                      } else {
                        if (256 <= var8) {
                          break L7;
                        } else {
                          L8: {
                            ((bf) this).field_g[((bf) this).field_i] = (byte)ok.a((int) ((bf) this).field_g[((bf) this).field_i], var8 >>> var7);
                            ((bf) this).field_i = ((bf) this).field_i + 1;
                            ((bf) this).field_l = ((bf) this).field_l + (8 - var7);
                            if (((bf) this).field_l != 512) {
                              break L8;
                            } else {
                              this.b(-2);
                              ((bf) this).field_l = 0;
                              ((bf) this).field_i = 0;
                              break L8;
                            }
                          }
                          ((bf) this).field_g[((bf) this).field_i] = (byte)tc.a(255, var8 << 8 + -var7);
                          param1 = param1 - 8L;
                          ((bf) this).field_l = ((bf) this).field_l + var7;
                          var5_int++;
                          continue L3;
                        }
                      }
                    }
                    throw new RuntimeException("LOGIC ERROR");
                  }
                }
              } else {
                var12 = var12 + ((((bf) this).field_n[var11] & 255) - -(255 & (int)var9));
                ((bf) this).field_n[var11] = (byte)var12;
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
            stackOut_23_1 = new StringBuilder().append("bf.F(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
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
          throw sl.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_f = null;
        field_d = null;
        field_o = null;
        field_e = null;
        field_c = null;
    }

    final static boolean a(boolean param0, byte param1) {
        L0: {
          if (null != ga.field_d) {
            break L0;
          } else {
            ga.field_d = gf.field_o.a(79, ke.field_c, dc.field_o);
            break L0;
          }
        }
        if (0 == ga.field_d.field_f) {
          return false;
        } else {
          L1: {
            long dupTemp$2 = qg.a(false);
            qh.field_f = dupTemp$2;
            he.field_a = dupTemp$2;
            if (ga.field_d.field_f != 1) {
              break L1;
            } else {
              break L1;
            }
          }
          jc.field_a = oc.field_m;
          L2: {
            if (param1 >= 31) {
              break L2;
            } else {
              field_a = null;
              break L2;
            }
          }
          ga.field_d = null;
          return true;
        }
    }

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
        var8 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            ((bf) this).field_g[((bf) this).field_i] = (byte)ok.a((int) ((bf) this).field_g[((bf) this).field_i], 128 >>> tc.a(((bf) this).field_l, 7));
            ((bf) this).field_i = ((bf) this).field_i + 1;
            if (param2 == -513) {
              L1: {
                if (((bf) this).field_i > 32) {
                  L2: while (true) {
                    if (((bf) this).field_i >= 64) {
                      this.b(-2);
                      ((bf) this).field_i = 0;
                      break L1;
                    } else {
                      int fieldTemp$2 = ((bf) this).field_i;
                      ((bf) this).field_i = ((bf) this).field_i + 1;
                      ((bf) this).field_g[fieldTemp$2] = (byte) 0;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
              L3: while (true) {
                if (((bf) this).field_i >= 32) {
                  pd.a(((bf) this).field_n, 0, ((bf) this).field_g, 32, 32);
                  this.b(-2);
                  var4_int = 0;
                  var5 = param1;
                  L4: while (true) {
                    if (8 <= var4_int) {
                      break L0;
                    } else {
                      var6 = ((bf) this).field_k[var4_int];
                      param0[var5] = (byte)(int)(var6 >>> 56);
                      param0[1 + var5] = (byte)(int)(var6 >>> 48);
                      param0[var5 + 2] = (byte)(int)(var6 >>> 40);
                      param0[var5 - -3] = (byte)(int)(var6 >>> 32);
                      param0[var5 - -4] = (byte)(int)(var6 >>> 24);
                      param0[var5 + 5] = (byte)(int)(var6 >>> 16);
                      param0[var5 + 6] = (byte)(int)(var6 >>> 8);
                      param0[var5 - -7] = (byte)(int)var6;
                      var4_int++;
                      var5 += 8;
                      continue L4;
                    }
                  }
                } else {
                  int fieldTemp$3 = ((bf) this).field_i;
                  ((bf) this).field_i = ((bf) this).field_i + 1;
                  ((bf) this).field_g[fieldTemp$3] = (byte) 0;
                  continue L3;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var4;
            stackOut_14_1 = new StringBuilder().append("bf.D(");
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
          throw sl.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = TrackController.field_F ? 1 : 0;
        for (var2 = 0; var2 < 32; var2++) {
            ((bf) this).field_n[var2] = (byte) 0;
        }
        ((bf) this).field_g[0] = (byte) 0;
        ((bf) this).field_i = 0;
        ((bf) this).field_l = 0;
        if (param0 != -11) {
            return;
        }
        for (var2 = 0; var2 < 8; var2++) {
            ((bf) this).field_k[var2] = 0L;
        }
    }

    final static void a(byte param0, String param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            kg.field_a = param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("bf.B(").append(-26).append(',');
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
          throw sl.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
    }

    private final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var6 = TrackController.field_F ? 1 : 0;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if (8 <= var2) {
            var2 = 0;
            L1: while (true) {
              if (8 <= var2) {
                var2 = 1;
                L2: while (true) {
                  if (var2 > 10) {
                    var2 = 0;
                    L3: while (true) {
                      if (var2 >= 8) {
                        return;
                      } else {
                        ((bf) this).field_k[var2] = ib.a(((bf) this).field_k[var2], ib.a(((bf) this).field_h[var2], ((bf) this).field_m[var2]));
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
                            ((bf) this).field_j[0] = ib.a(((bf) this).field_j[0], lh.field_D[var2]);
                            var3 = 0;
                            L6: while (true) {
                              if (var3 >= 8) {
                                var3 = 0;
                                L7: while (true) {
                                  if (var3 >= 8) {
                                    var2++;
                                    continue L2;
                                  } else {
                                    ((bf) this).field_m[var3] = ((bf) this).field_b[var3];
                                    var3++;
                                    continue L7;
                                  }
                                }
                              } else {
                                ((bf) this).field_b[var3] = ((bf) this).field_j[var3];
                                var7 = 0;
                                var4 = var7;
                                var5 = 56;
                                L8: while (true) {
                                  if (8 <= var7) {
                                    var3++;
                                    continue L6;
                                  } else {
                                    ((bf) this).field_b[var3] = ib.a(((bf) this).field_b[var3], lh.field_B[var7][tc.a((int)(((bf) this).field_m[tc.a(var3 - var7, 7)] >>> var5), 255)]);
                                    var5 -= 8;
                                    var7++;
                                    continue L8;
                                  }
                                }
                              }
                            }
                          } else {
                            ((bf) this).field_j[var3] = ((bf) this).field_b[var3];
                            var3++;
                            continue L5;
                          }
                        }
                      } else {
                        ((bf) this).field_b[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L9: while (true) {
                          if (var4 >= 8) {
                            var3++;
                            continue L4;
                          } else {
                            ((bf) this).field_b[var3] = ib.a(((bf) this).field_b[var3], lh.field_B[var4][tc.a(255, (int)(((bf) this).field_j[tc.a(7, var3 - var4)] >>> var5))]);
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
                ((bf) this).field_j[var2] = ((bf) this).field_k[var2];
                ((bf) this).field_m[var2] = ib.a(((bf) this).field_h[var2], ((bf) this).field_k[var2]);
                var2++;
                continue L1;
              }
            }
          } else {
            ((bf) this).field_h[var2] = ib.a(ib.a(ib.a(ib.a(al.a(255L, (long)((bf) this).field_g[var3 - -4]) << 24, ib.a(al.a((long)((bf) this).field_g[var3 + 3], 255L) << 32, ib.a(al.a(280375465082880L, (long)((bf) this).field_g[var3 - -2] << 40), ib.a(al.a((long)((bf) this).field_g[var3 - -1], 255L) << 48, (long)((bf) this).field_g[var3] << 56)))), al.a((long)((bf) this).field_g[var3 - -5] << 16, 16711680L)), al.a((long)((bf) this).field_g[var3 + 6], 255L) << 8), al.a((long)((bf) this).field_g[7 + var3], 255L));
            var3 += 8;
            var2++;
            continue L0;
          }
        }
    }

    bf() {
        ((bf) this).field_n = new byte[32];
        ((bf) this).field_m = new long[8];
        ((bf) this).field_h = new long[8];
        ((bf) this).field_g = new byte[64];
        ((bf) this).field_l = 0;
        ((bf) this).field_b = new long[8];
        ((bf) this).field_i = 0;
        ((bf) this).field_k = new long[8];
        ((bf) this).field_j = new long[8];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Checking";
        field_c = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
        field_a = new int[4];
    }
}
