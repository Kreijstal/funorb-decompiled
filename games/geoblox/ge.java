/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class ge {
    private long[] field_c;
    static ob field_d;
    private byte[] field_i;
    private byte[] field_j;
    private long[] field_k;
    private int field_h;
    private long[] field_g;
    private long[] field_a;
    private int field_e;
    static java.util.zip.CRC32 field_f;
    private long[] field_b;

    public static void b() {
        field_d = null;
        int var1 = 0;
        field_f = null;
    }

    private final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var6 = Geoblox.field_C;
        if (param0 >= 103) {
          var2 = 0;
          var3 = 0;
          L0: while (true) {
            if (var2 >= 8) {
              var2 = 0;
              L1: while (true) {
                if (var2 >= 8) {
                  var2 = 1;
                  L2: while (true) {
                    if (10 < var2) {
                      var2 = 0;
                      L3: while (true) {
                        if (var2 >= 8) {
                          return;
                        } else {
                          ((ge) this).field_c[var2] = f.a(((ge) this).field_c[var2], f.a(((ge) this).field_b[var2], ((ge) this).field_g[var2]));
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
                              ((ge) this).field_a[0] = f.a(((ge) this).field_a[0], qc.field_h[var2]);
                              var3 = 0;
                              L6: while (true) {
                                if (var3 >= 8) {
                                  var3 = 0;
                                  L7: while (true) {
                                    if (8 <= var3) {
                                      var2++;
                                      continue L2;
                                    } else {
                                      ((ge) this).field_b[var3] = ((ge) this).field_k[var3];
                                      var3++;
                                      continue L7;
                                    }
                                  }
                                } else {
                                  ((ge) this).field_k[var3] = ((ge) this).field_a[var3];
                                  var7 = 0;
                                  var4 = var7;
                                  var5 = 56;
                                  L8: while (true) {
                                    if (var7 >= 8) {
                                      var3++;
                                      continue L6;
                                    } else {
                                      ((ge) this).field_k[var3] = f.a(((ge) this).field_k[var3], qc.field_g[var7][cd.a(255, (int)(((ge) this).field_b[cd.a(-var7 + var3, 7)] >>> var5))]);
                                      var7++;
                                      var5 -= 8;
                                      continue L8;
                                    }
                                  }
                                }
                              }
                            } else {
                              ((ge) this).field_a[var3] = ((ge) this).field_k[var3];
                              var3++;
                              continue L5;
                            }
                          }
                        } else {
                          ((ge) this).field_k[var3] = 0L;
                          var4 = 0;
                          var5 = 56;
                          L9: while (true) {
                            if (var4 >= 8) {
                              var3++;
                              continue L4;
                            } else {
                              ((ge) this).field_k[var3] = f.a(((ge) this).field_k[var3], qc.field_g[var4][cd.a(255, (int)(((ge) this).field_a[cd.a(7, var3 + -var4)] >>> var5))]);
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
                  ((ge) this).field_a[var2] = ((ge) this).field_c[var2];
                  ((ge) this).field_b[var2] = f.a(((ge) this).field_g[var2], ((ge) this).field_c[var2]);
                  var2++;
                  continue L1;
                }
              }
            } else {
              ((ge) this).field_g[var2] = f.a(cj.a((long)((ge) this).field_i[7 + var3], 255L), f.a(f.a(f.a(f.a(cj.a(1095216660480L, (long)((ge) this).field_i[var3 - -3] << 32), f.a(cj.a(255L, (long)((ge) this).field_i[var3 - -2]) << 40, f.a(cj.a((long)((ge) this).field_i[var3 + 1] << 48, 71776119061217280L), (long)((ge) this).field_i[var3] << 56))), cj.a((long)((ge) this).field_i[4 + var3] << 24, 4278190080L)), cj.a(16711680L, (long)((ge) this).field_i[var3 + 5] << 16)), cj.a((long)((ge) this).field_i[var3 - -6] << 8, 65280L)));
              var3 += 8;
              var2++;
              continue L0;
            }
          }
        } else {
          return;
        }
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
        var13 = Geoblox.field_C;
        try {
          L0: {
            var5_int = 0;
            var6 = 7 & 8 - (7 & (int)param1);
            var7 = 7 & ((ge) this).field_h;
            var9 = param1;
            var11 = 31;
            var12 = param2;
            L1: while (true) {
              if (var11 < 0) {
                L2: while (true) {
                  if (8L >= param1) {
                    L3: {
                      if (param1 <= 0L) {
                        var8 = 0;
                        break L3;
                      } else {
                        var8 = param0[var5_int] << var6 & 255;
                        ((ge) this).field_i[((ge) this).field_e] = (byte)lb.a((int) ((ge) this).field_i[((ge) this).field_e], var8 >>> var7);
                        break L3;
                      }
                    }
                    L4: {
                      if (8L > param1 + (long)var7) {
                        ((ge) this).field_h = (int)((long)((ge) this).field_h + param1);
                        break L4;
                      } else {
                        L5: {
                          param1 = param1 - (long)(8 + -var7);
                          ((ge) this).field_e = ((ge) this).field_e + 1;
                          ((ge) this).field_h = ((ge) this).field_h + (-var7 + 8);
                          if (((ge) this).field_h != 512) {
                            break L5;
                          } else {
                            this.c(118);
                            ((ge) this).field_h = 0;
                            ((ge) this).field_e = 0;
                            break L5;
                          }
                        }
                        ((ge) this).field_i[((ge) this).field_e] = (byte)cd.a(var8 << -var7 + 8, 255);
                        ((ge) this).field_h = ((ge) this).field_h + (int)param1;
                        break L4;
                      }
                    }
                    break L0;
                  } else {
                    L6: {
                      var8 = 255 & param0[var5_int] << var6 | (param0[var5_int + 1] & 255) >>> -var6 + 8;
                      if (var8 < 0) {
                        break L6;
                      } else {
                        if (256 <= var8) {
                          break L6;
                        } else {
                          L7: {
                            ((ge) this).field_i[((ge) this).field_e] = (byte)lb.a((int) ((ge) this).field_i[((ge) this).field_e], var8 >>> var7);
                            ((ge) this).field_h = ((ge) this).field_h + (-var7 + 8);
                            ((ge) this).field_e = ((ge) this).field_e + 1;
                            if (512 == ((ge) this).field_h) {
                              this.c(param2 ^ 111);
                              ((ge) this).field_e = 0;
                              ((ge) this).field_h = 0;
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          ((ge) this).field_i[((ge) this).field_e] = (byte)cd.a(255, var8 << -var7 + 8);
                          param1 = param1 - 8L;
                          ((ge) this).field_h = ((ge) this).field_h + var7;
                          var5_int++;
                          continue L2;
                        }
                      }
                    }
                    throw new RuntimeException("LOGIC ERROR");
                  }
                }
              } else {
                var12 = var12 + ((255 & (int)var9) + (((ge) this).field_j[var11] & 255));
                ((ge) this).field_j[var11] = (byte)var12;
                var12 = var12 >>> 8;
                var9 = var9 >>> 8;
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
            stackOut_22_1 = new StringBuilder().append("ge.G(");
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
          throw t.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static boolean a(String param0) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
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
            var3 = (CharSequence) (Object) param0;
            stackOut_0_0 = vg.field_b.equals((Object) (Object) oe.a(var3, 12));
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("ge.A(");
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
          throw t.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + 12 + ')');
        }
        return stackIn_1_0;
    }

    final void a(byte[] param0, int param1, boolean param2) {
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
        var8 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              ((ge) this).field_i[((ge) this).field_e] = (byte)lb.a((int) ((ge) this).field_i[((ge) this).field_e], 128 >>> cd.a(((ge) this).field_h, 7));
              ((ge) this).field_e = ((ge) this).field_e + 1;
              if (((ge) this).field_e <= 32) {
                break L1;
              } else {
                L2: while (true) {
                  if (((ge) this).field_e >= 64) {
                    this.c(116);
                    ((ge) this).field_e = 0;
                    break L1;
                  } else {
                    int fieldTemp$2 = ((ge) this).field_e;
                    ((ge) this).field_e = ((ge) this).field_e + 1;
                    ((ge) this).field_i[fieldTemp$2] = (byte) 0;
                    continue L2;
                  }
                }
              }
            }
            L3: {
              if (param2) {
                break L3;
              } else {
                ((ge) this).a(-38);
                break L3;
              }
            }
            L4: while (true) {
              if (((ge) this).field_e >= 32) {
                sf.a(((ge) this).field_j, 0, ((ge) this).field_i, 32, 32);
                this.c(117);
                var4_int = 0;
                var5 = param1;
                L5: while (true) {
                  if (var4_int >= 8) {
                    break L0;
                  } else {
                    var6 = ((ge) this).field_c[var4_int];
                    param0[var5] = (byte)(int)(var6 >>> 56);
                    param0[1 + var5] = (byte)(int)(var6 >>> 48);
                    param0[2 + var5] = (byte)(int)(var6 >>> 40);
                    param0[var5 + 3] = (byte)(int)(var6 >>> 32);
                    param0[var5 - -4] = (byte)(int)(var6 >>> 24);
                    param0[var5 - -5] = (byte)(int)(var6 >>> 16);
                    param0[6 + var5] = (byte)(int)(var6 >>> 8);
                    param0[var5 - -7] = (byte)(int)var6;
                    var4_int++;
                    var5 += 8;
                    continue L5;
                  }
                }
              } else {
                int fieldTemp$3 = ((ge) this).field_e;
                ((ge) this).field_e = ((ge) this).field_e + 1;
                ((ge) this).field_i[fieldTemp$3] = (byte) 0;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("ge.C(");
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
          throw t.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static int a() {
        try {
            IOException var1 = null;
            int var1_int = 0;
            qc var2 = null;
            int stackIn_12_0 = 0;
            int stackIn_22_0 = 0;
            int stackIn_25_0 = 0;
            int stackIn_30_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_11_0 = 0;
            int stackOut_24_0 = 0;
            int stackOut_21_0 = 0;
            int stackOut_29_0 = 0;
            if (wg.field_i.field_b < 4) {
              try {
                L0: {
                  L1: {
                    if (qh.field_J != 0) {
                      break L1;
                    } else {
                      gj.field_s = ph.field_i.a(vg.field_a, gh.field_z, false);
                      qh.field_J = qh.field_J + 1;
                      break L1;
                    }
                  }
                  L2: {
                    if (qh.field_J != 1) {
                      break L2;
                    } else {
                      if (gj.field_s.field_a == 2) {
                        int discarded$4 = 28625;
                        stackOut_11_0 = eb.a(-1);
                        stackIn_12_0 = stackOut_11_0;
                        return stackIn_12_0;
                      } else {
                        if (1 != gj.field_s.field_a) {
                          break L2;
                        } else {
                          qh.field_J = qh.field_J + 1;
                          break L2;
                        }
                      }
                    }
                  }
                  L3: {
                    if (2 != qh.field_J) {
                      break L3;
                    } else {
                      li.field_a = new ba((java.net.Socket) gj.field_s.field_b, ph.field_i);
                      var2 = new qc(13);
                      ke.a(pc.field_C, true, hc.field_T, bm.field_u, var2);
                      var2.d((byte) -54, 15);
                      var2.c((byte) 95, ag.field_l);
                      li.field_a.a(100, 0, 13, var2.field_j);
                      qh.field_J = qh.field_J + 1;
                      eb.field_b = 30000L + oa.a(-12520);
                      break L3;
                    }
                  }
                  L4: {
                    if (qh.field_J != 3) {
                      break L4;
                    } else {
                      if (0 < li.field_a.a((byte) 78)) {
                        var1_int = li.field_a.c(-17422);
                        if (var1_int == 0) {
                          qh.field_J = qh.field_J + 1;
                          break L4;
                        } else {
                          int discarded$5 = 28625;
                          stackOut_24_0 = eb.a(var1_int);
                          stackIn_25_0 = stackOut_24_0;
                          return stackIn_25_0;
                        }
                      } else {
                        if (oa.a(-12520) > eb.field_b) {
                          int discarded$6 = 28625;
                          stackOut_21_0 = eb.a(-2);
                          stackIn_22_0 = stackOut_21_0;
                          return stackIn_22_0;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  if (4 == qh.field_J) {
                    wg.field_i.a((Object) (Object) li.field_a, false, si.field_c);
                    gj.field_s = null;
                    qh.field_J = 0;
                    li.field_a = null;
                    stackOut_29_0 = 0;
                    stackIn_30_0 = stackOut_29_0;
                    break L0;
                  } else {
                    return -1;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
                int discarded$7 = 28625;
                return eb.a(-3);
              }
              return stackIn_30_0;
            } else {
              if (wg.field_i.field_q != -1) {
                if (wg.field_i.field_q != -2) {
                  return 1;
                } else {
                  return 4;
                }
              } else {
                return 3;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = Geoblox.field_C;
        for (var2 = 0; var2 < 32; var2++) {
            ((ge) this).field_j[var2] = (byte) 0;
        }
        ((ge) this).field_i[0] = (byte) 0;
        ((ge) this).field_h = 0;
        ((ge) this).field_e = 0;
        for (var2 = 0; 8 > var2; var2++) {
            ((ge) this).field_c[var2] = 0L;
        }
        if (param0 <= 51) {
            ((ge) this).field_e = 101;
        }
    }

    ge() {
        ((ge) this).field_c = new long[8];
        ((ge) this).field_i = new byte[64];
        ((ge) this).field_j = new byte[32];
        ((ge) this).field_e = 0;
        ((ge) this).field_h = 0;
        ((ge) this).field_b = new long[8];
        ((ge) this).field_a = new long[8];
        ((ge) this).field_g = new long[8];
        ((ge) this).field_k = new long[8];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new java.util.zip.CRC32();
    }
}
