/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ur {
    private long[] field_h;
    static String field_b;
    private byte[] field_k;
    static oha[] field_e;
    private long[] field_g;
    private long[] field_n;
    private long[] field_o;
    static String field_p;
    private byte[] field_i;
    static String field_f;
    static int field_d;
    private long[] field_a;
    private int field_l;
    private int field_c;
    static String field_m;
    static String field_j;

    final void b(boolean param0) {
        int var2 = 0;
        int var3 = BachelorFridge.field_y;
        if (!param0) {
            return;
        }
        for (var2 = 0; 32 > var2; var2++) {
            ((ur) this).field_k[var2] = (byte) 0;
        }
        ((ur) this).field_l = 0;
        ((ur) this).field_i[0] = (byte) 0;
        ((ur) this).field_c = 0;
        for (var2 = 0; var2 < 8; var2++) {
            ((ur) this).field_h[var2] = 0L;
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
        var13 = BachelorFridge.field_y;
        try {
          L0: {
            var5_int = param2;
            var6 = -(7 & (int)param1) + 8 & 7;
            var7 = 7 & ((ur) this).field_l;
            var9 = param1;
            var11 = 31;
            var12 = 0;
            L1: while (true) {
              if (var11 < 0) {
                L2: while (true) {
                  if (param1 <= 8L) {
                    L3: {
                      if (0L >= param1) {
                        var8 = 0;
                        break L3;
                      } else {
                        var8 = param0[var5_int] << var6 & 255;
                        ((ur) this).field_i[((ur) this).field_c] = (byte)mp.a((int) ((ur) this).field_i[((ur) this).field_c], var8 >>> var7);
                        break L3;
                      }
                    }
                    L4: {
                      if ((long)var7 + param1 >= 8L) {
                        L5: {
                          ((ur) this).field_l = ((ur) this).field_l + (8 - var7);
                          param1 = param1 - (long)(8 + -var7);
                          ((ur) this).field_c = ((ur) this).field_c + 1;
                          if (((ur) this).field_l != 512) {
                            break L5;
                          } else {
                            this.a(false);
                            ((ur) this).field_c = 0;
                            ((ur) this).field_l = 0;
                            break L5;
                          }
                        }
                        ((ur) this).field_i[((ur) this).field_c] = (byte)dda.a(255, var8 << -var7 + 8);
                        ((ur) this).field_l = ((ur) this).field_l + (int)param1;
                        break L4;
                      } else {
                        ((ur) this).field_l = (int)((long)((ur) this).field_l + param1);
                        break L4;
                      }
                    }
                    break L0;
                  } else {
                    L6: {
                      var8 = 255 & param0[var5_int] << var6 | (255 & param0[var5_int + 1]) >>> -var6 + 8;
                      if (var8 < 0) {
                        break L6;
                      } else {
                        if (var8 < 256) {
                          L7: {
                            ((ur) this).field_i[((ur) this).field_c] = (byte)mp.a((int) ((ur) this).field_i[((ur) this).field_c], var8 >>> var7);
                            ((ur) this).field_l = ((ur) this).field_l + (-var7 + 8);
                            ((ur) this).field_c = ((ur) this).field_c + 1;
                            if (((ur) this).field_l == 512) {
                              this.a(false);
                              ((ur) this).field_c = 0;
                              ((ur) this).field_l = 0;
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          ((ur) this).field_i[((ur) this).field_c] = (byte)dda.a(255, var8 << 8 + -var7);
                          var5_int++;
                          ((ur) this).field_l = ((ur) this).field_l + var7;
                          param1 = param1 - 8L;
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
                var12 = var12 + ((255 & ((ur) this).field_k[var11]) - -((int)var9 & 255));
                ((ur) this).field_k[var11] = (byte)var12;
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
            stackOut_22_1 = new StringBuilder().append("ur.B(");
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
          throw pe.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, int param1, byte[] param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        long var7 = 0L;
        int var9 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var9 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              ((ur) this).field_i[((ur) this).field_c] = (byte)mp.a((int) ((ur) this).field_i[((ur) this).field_c], 128 >>> dda.a(((ur) this).field_l, 7));
              ((ur) this).field_c = ((ur) this).field_c + 1;
              if (((ur) this).field_c > 32) {
                L2: while (true) {
                  if (((ur) this).field_c >= 64) {
                    this.a(false);
                    ((ur) this).field_c = 0;
                    break L1;
                  } else {
                    int fieldTemp$2 = ((ur) this).field_c;
                    ((ur) this).field_c = ((ur) this).field_c + 1;
                    ((ur) this).field_i[fieldTemp$2] = (byte) 0;
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            L3: while (true) {
              if (((ur) this).field_c >= 32) {
                bl.a(((ur) this).field_k, 0, ((ur) this).field_i, 32, 32);
                this.a(false);
                var6 = -122 % ((param0 - 10) / 46);
                var4_int = 0;
                var5 = param1;
                L4: while (true) {
                  if (var4_int >= 8) {
                    break L0;
                  } else {
                    var7 = ((ur) this).field_h[var4_int];
                    param2[var5] = (byte)(int)(var7 >>> 56);
                    param2[var5 + 1] = (byte)(int)(var7 >>> 48);
                    param2[var5 - -2] = (byte)(int)(var7 >>> 40);
                    param2[var5 - -3] = (byte)(int)(var7 >>> 32);
                    param2[var5 - -4] = (byte)(int)(var7 >>> 24);
                    param2[5 + var5] = (byte)(int)(var7 >>> 16);
                    param2[6 + var5] = (byte)(int)(var7 >>> 8);
                    param2[7 + var5] = (byte)(int)var7;
                    var5 += 8;
                    var4_int++;
                    continue L4;
                  }
                }
              } else {
                int fieldTemp$3 = ((ur) this).field_c;
                ((ur) this).field_c = ((ur) this).field_c + 1;
                ((ur) this).field_i[fieldTemp$3] = (byte) 0;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("ur.G(").append(param0).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
    }

    final static pp a(lu param0) {
        nq var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        ela stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        ela stackOut_0_0 = null;
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
            var2 = qi.a(param0, (byte) 112);
            var3 = param0.b(16711935);
            stackOut_0_0 = new ela(var2, var3);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2_ref;
            stackOut_2_1 = new StringBuilder().append("ur.E(");
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
          throw pe.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + 120 + ')');
        }
        return (pp) (Object) stackIn_1_0;
    }

    private final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var6 = BachelorFridge.field_y;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if (var2 >= 8) {
            var2 = 0;
            L1: while (true) {
              if (8 <= var2) {
                var2 = 1;
                L2: while (true) {
                  if (var2 > 10) {
                    L3: {
                      var2 = 0;
                      if (!param0) {
                        break L3;
                      } else {
                        this.a(true);
                        break L3;
                      }
                    }
                    L4: while (true) {
                      if (var2 >= 8) {
                        return;
                      } else {
                        ((ur) this).field_h[var2] = gv.a(((ur) this).field_h[var2], gv.a(((ur) this).field_n[var2], ((ur) this).field_o[var2]));
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
                            ((ur) this).field_g[0] = gv.a(((ur) this).field_g[0], hha.field_z[var2]);
                            var3 = 0;
                            L7: while (true) {
                              if (8 <= var3) {
                                var3 = 0;
                                L8: while (true) {
                                  if (var3 >= 8) {
                                    var2++;
                                    continue L2;
                                  } else {
                                    ((ur) this).field_n[var3] = ((ur) this).field_a[var3];
                                    var3++;
                                    continue L8;
                                  }
                                }
                              } else {
                                ((ur) this).field_a[var3] = ((ur) this).field_g[var3];
                                var7 = 0;
                                var4 = var7;
                                var5 = 56;
                                L9: while (true) {
                                  if (8 <= var7) {
                                    var3++;
                                    continue L7;
                                  } else {
                                    ((ur) this).field_a[var3] = gv.a(((ur) this).field_a[var3], hha.field_v[var7][dda.a(255, (int)(((ur) this).field_n[dda.a(7, var3 - var7)] >>> var5))]);
                                    var7++;
                                    var5 -= 8;
                                    continue L9;
                                  }
                                }
                              }
                            }
                          } else {
                            ((ur) this).field_g[var3] = ((ur) this).field_a[var3];
                            var3++;
                            continue L6;
                          }
                        }
                      } else {
                        ((ur) this).field_a[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L10: while (true) {
                          if (8 <= var4) {
                            var3++;
                            continue L5;
                          } else {
                            ((ur) this).field_a[var3] = gv.a(((ur) this).field_a[var3], hha.field_v[var4][dda.a(255, (int)(((ur) this).field_g[dda.a(var3 - var4, 7)] >>> var5))]);
                            var4++;
                            var5 -= 8;
                            continue L10;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                ((ur) this).field_g[var2] = ((ur) this).field_h[var2];
                ((ur) this).field_n[var2] = gv.a(((ur) this).field_o[var2], ((ur) this).field_h[var2]);
                var2++;
                continue L1;
              }
            }
          } else {
            ((ur) this).field_o[var2] = gv.a(gv.a(gv.a(gv.a(gv.a(gv.a(gv.a((long)((ur) this).field_i[var3] << 56, gda.a(255L, (long)((ur) this).field_i[var3 - -1]) << 48), gda.a(280375465082880L, (long)((ur) this).field_i[var3 - -2] << 40)), gda.a((long)((ur) this).field_i[var3 - -3] << 32, 1095216660480L)), gda.a(4278190080L, (long)((ur) this).field_i[var3 + 4] << 24)), gda.a(255L, (long)((ur) this).field_i[5 + var3]) << 16), gda.a((long)((ur) this).field_i[6 + var3] << 8, 65280L)), gda.a(255L, (long)((ur) this).field_i[7 + var3]));
            var3 += 8;
            var2++;
            continue L0;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        L0: {
          L1: {
            if (eo.field_l > param1 - param0) {
              break L1;
            } else {
              if (pw.field_x < param0 + param1) {
                break L1;
              } else {
                if (an.field_q > -param0 + param2) {
                  break L1;
                } else {
                  if (param2 - -param0 <= ha.field_n) {
                    eja.a((byte) -60, param0, param3, param2, param4, param5, param1);
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          pj.a(param2, param3, 170, param1, param0, param4, param5);
          break L0;
        }
    }

    public static void a() {
        field_e = null;
        field_m = null;
        field_b = null;
        field_p = null;
        field_f = null;
        field_j = null;
    }

    ur() {
        ((ur) this).field_h = new long[8];
        ((ur) this).field_n = new long[8];
        ((ur) this).field_o = new long[8];
        ((ur) this).field_i = new byte[64];
        ((ur) this).field_g = new long[8];
        ((ur) this).field_a = new long[8];
        ((ur) this).field_k = new byte[32];
        ((ur) this).field_c = 0;
        ((ur) this).field_l = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Security";
        field_f = "Every player's actions are plotted at the same time, and then everyone moves at the same time. The number next to your creature indicates when it will move in the grand order of things. <br> Clicking the End Phase Button confirms your actions and ends you turn. Do this now.";
        field_j = "Don't mind";
        field_m = "Congratulations, you have evolved your first creature! You can drag creatures around to place them where you want. <br><col=BBFF00> Next</col>";
    }
}
