/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fm {
    private long[] field_f;
    private byte[] field_d;
    private byte[] field_e;
    private long[] field_a;
    private int field_h;
    private long[] field_i;
    static String field_c;
    private long[] field_g;
    private long[] field_b;
    private int field_j;

    final static void a(boolean param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        wg var9 = null;
        int var10 = 0;
        int stackIn_11_0 = 0;
        wg stackIn_16_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        wg stackOut_15_0 = null;
        wg stackOut_14_0 = null;
        var10 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            var1_int = sh.field_rb + -dg.field_x;
            dg.field_x = mh.field_g - (var1_int >> 1);
            tl.field_i = kn.field_I + -(lj.field_g >> 1);
            sh.field_rb = var1_int + dg.field_x;
            var2 = tl.field_i;
            var3 = 0;
            L1: while (true) {
              if (vg.field_F.length <= var3) {
                L2: {
                  if (!param0) {
                    break L2;
                  } else {
                    field_c = null;
                    break L2;
                  }
                }
                break L0;
              } else {
                L3: {
                  var4 = wf.field_f[var3];
                  if (var4 >= 0) {
                    if (var4 != g.field_b.field_d) {
                      var5 = na.field_Hb;
                      break L3;
                    } else {
                      var5 = la.field_k;
                      break L3;
                    }
                  } else {
                    var5 = sf.field_I;
                    break L3;
                  }
                }
                L4: {
                  var6 = vg.field_F[var3];
                  if (var4 < 0) {
                    stackOut_10_0 = 0;
                    stackIn_11_0 = stackOut_10_0;
                    break L4;
                  } else {
                    stackOut_9_0 = 1;
                    stackIn_11_0 = stackOut_9_0;
                    break L4;
                  }
                }
                L5: {
                  var7 = an.a(stackIn_11_0 != 0, (byte) 47, var6);
                  var8 = mh.field_g + -(var7 >> 1);
                  if (var4 >= 0) {
                    L6: {
                      var2 = var2 + hd.field_e;
                      if (var4 == g.field_b.field_d) {
                        stackOut_15_0 = tg.field_D;
                        stackIn_16_0 = stackOut_15_0;
                        break L6;
                      } else {
                        stackOut_14_0 = ma.field_h;
                        stackIn_16_0 = stackOut_14_0;
                        break L6;
                      }
                    }
                    L7: {
                      var9 = stackIn_16_0;
                      if (var9 == null) {
                        break L7;
                      } else {
                        var9.a(-dj.field_e + var8, (ng.field_P << 1) + di.field_o, false, (dj.field_e << 1) + var7, var2);
                        break L7;
                      }
                    }
                    var2 = var2 + ng.field_P;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L8: {
                  if (var4 >= 0) {
                    jf.field_n.b(var6, var8, ej.field_L + var2, var5, -1);
                    var2 = var2 + (di.field_o + (ng.field_P + hd.field_e));
                    break L8;
                  } else {
                    pm.field_j.b(var6, var8, eg.field_l + var2, var5, -1);
                    var2 = var2 + bn.field_b;
                    break L8;
                  }
                }
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var1, "fm.B(" + param0 + 41);
        }
    }

    final static int a(CharSequence param0) {
        RuntimeException var2 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
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
        try {
          L0: {
            stackOut_0_0 = p.a(10, 4330, true, param0);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("fm.G(");
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
          throw kg.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + 0 + 41);
        }
        return stackIn_1_0;
    }

    final void a(long param0, boolean param1, byte[] param2) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var13 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = 0;
              var6 = 7 & -((int)param0 & 7) + 8;
              var7 = 7 & ((fm) this).field_j;
              var9 = param0;
              if (!param1) {
                break L1;
              } else {
                ((fm) this).field_a = null;
                break L1;
              }
            }
            var11 = 31;
            var12 = 0;
            L2: while (true) {
              if (var11 < 0) {
                L3: while (true) {
                  if (8L >= param0) {
                    L4: {
                      if (param0 > 0L) {
                        var8 = 255 & param2[var5_int] << var6;
                        ((fm) this).field_e[((fm) this).field_h] = (byte)oh.a((int) ((fm) this).field_e[((fm) this).field_h], var8 >>> var7);
                        break L4;
                      } else {
                        var8 = 0;
                        break L4;
                      }
                    }
                    L5: {
                      if (param0 + (long)var7 < 8L) {
                        ((fm) this).field_j = (int)((long)((fm) this).field_j + param0);
                        break L5;
                      } else {
                        L6: {
                          param0 = param0 - (long)(-var7 + 8);
                          ((fm) this).field_j = ((fm) this).field_j + (8 + -var7);
                          ((fm) this).field_h = ((fm) this).field_h + 1;
                          if (((fm) this).field_j == 512) {
                            int discarded$2 = -91;
                            this.b();
                            ((fm) this).field_h = 0;
                            ((fm) this).field_j = 0;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        ((fm) this).field_e[((fm) this).field_h] = (byte)rb.a(var8 << -var7 + 8, 255);
                        ((fm) this).field_j = ((fm) this).field_j + (int)param0;
                        break L5;
                      }
                    }
                    break L0;
                  } else {
                    L7: {
                      var8 = 255 & param2[var5_int] << var6 | (255 & param2[1 + var5_int]) >>> -var6 + 8;
                      if (var8 < 0) {
                        break L7;
                      } else {
                        if (var8 < 256) {
                          L8: {
                            ((fm) this).field_e[((fm) this).field_h] = (byte)oh.a((int) ((fm) this).field_e[((fm) this).field_h], var8 >>> var7);
                            ((fm) this).field_h = ((fm) this).field_h + 1;
                            ((fm) this).field_j = ((fm) this).field_j + (-var7 + 8);
                            if (((fm) this).field_j == 512) {
                              int discarded$3 = -91;
                              this.b();
                              ((fm) this).field_h = 0;
                              ((fm) this).field_j = 0;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          ((fm) this).field_e[((fm) this).field_h] = (byte)rb.a(255, var8 << -var7 + 8);
                          param0 = param0 - 8L;
                          ((fm) this).field_j = ((fm) this).field_j + var7;
                          var5_int++;
                          continue L3;
                        } else {
                          break L7;
                        }
                      }
                    }
                    throw new RuntimeException("LOGIC ERROR");
                  }
                }
              } else {
                var12 = var12 + ((255 & (int)var9) + (((fm) this).field_d[var11] & 255));
                ((fm) this).field_d[var11] = (byte)var12;
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
            stackOut_25_0 = (RuntimeException) var5;
            stackOut_25_1 = new StringBuilder().append("fm.F(").append(param0).append(44).append(param1).append(44);
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param2 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L9;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L9;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + 41);
        }
    }

    final static boolean a(String param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -1369854352) {
                break L1;
              } else {
                fm.a((byte) 80);
                break L1;
              }
            }
            L2: {
              if (kh.a((byte) 61, param0) == null) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("fm.A(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 41);
        }
        return stackIn_5_0 != 0;
    }

    final static void a(int param0, int param1, int param2) {
        he var6 = null;
        he var7 = null;
        hg var4 = null;
        if (!(wl.field_b == param0)) {
            var6 = (he) (Object) ma.field_c.a((long)wl.field_b, (byte) 77);
            var7 = var6;
            wl.field_b = param0;
            if (var7 != null) {
                var7.field_Zb = null;
            }
            var4 = gk.field_g;
            var4.g(param2, 8);
            var4.a(3, -68);
            var4.a(11, -100);
            var4.a((byte) 120, param0);
        }
        if (param1 != 3) {
            field_c = null;
        }
    }

    final void a(int param0, byte[] param1, int param2) {
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
        var8 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              ((fm) this).field_e[((fm) this).field_h] = (byte)oh.a((int) ((fm) this).field_e[((fm) this).field_h], 128 >>> rb.a(((fm) this).field_j, 7));
              ((fm) this).field_h = ((fm) this).field_h + 1;
              if (((fm) this).field_h <= 32) {
                break L1;
              } else {
                L2: while (true) {
                  if (64 <= ((fm) this).field_h) {
                    int discarded$4 = -91;
                    this.b();
                    ((fm) this).field_h = 0;
                    break L1;
                  } else {
                    int fieldTemp$5 = ((fm) this).field_h;
                    ((fm) this).field_h = ((fm) this).field_h + 1;
                    ((fm) this).field_e[fieldTemp$5] = (byte) 0;
                    continue L2;
                  }
                }
              }
            }
            L3: {
              if (param2 == 8) {
                break L3;
              } else {
                ((fm) this).field_e = null;
                break L3;
              }
            }
            L4: while (true) {
              if (((fm) this).field_h >= 32) {
                ek.a(((fm) this).field_d, 0, ((fm) this).field_e, 32, 32);
                int discarded$6 = -91;
                this.b();
                var4_int = 0;
                var5 = param0;
                L5: while (true) {
                  if (8 <= var4_int) {
                    break L0;
                  } else {
                    var6 = ((fm) this).field_i[var4_int];
                    param1[var5] = (byte)(int)(var6 >>> 56);
                    param1[var5 - -1] = (byte)(int)(var6 >>> 48);
                    param1[var5 - -2] = (byte)(int)(var6 >>> 40);
                    param1[3 + var5] = (byte)(int)(var6 >>> 32);
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
                int fieldTemp$7 = ((fm) this).field_h;
                ((fm) this).field_h = ((fm) this).field_h + 1;
                ((fm) this).field_e[fieldTemp$7] = (byte) 0;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("fm.D(").append(param0).append(44);
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
          throw kg.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param2 + 41);
        }
    }

    public static void a(byte param0) {
        if (param0 != -54) {
            fm.a((byte) 0);
        }
        field_c = null;
    }

    private final void b() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        var6 = Virogrid.field_F ? 1 : 0;
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
                        ((fm) this).field_i[var2] = uh.a(((fm) this).field_i[var2], uh.a(((fm) this).field_g[var2], ((fm) this).field_a[var2]));
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
                            ((fm) this).field_f[0] = uh.a(((fm) this).field_f[0], co.field_b[var2]);
                            var3 = 0;
                            L6: while (true) {
                              if (var3 >= 8) {
                                var3 = 0;
                                L7: while (true) {
                                  if (8 <= var3) {
                                    var2++;
                                    continue L2;
                                  } else {
                                    ((fm) this).field_a[var3] = ((fm) this).field_b[var3];
                                    var3++;
                                    continue L7;
                                  }
                                }
                              } else {
                                ((fm) this).field_b[var3] = ((fm) this).field_f[var3];
                                var8 = 0;
                                var4 = var8;
                                var5 = 56;
                                L8: while (true) {
                                  if (var8 >= 8) {
                                    var3++;
                                    continue L6;
                                  } else {
                                    ((fm) this).field_b[var3] = uh.a(((fm) this).field_b[var3], co.field_e[var8][rb.a((int)(((fm) this).field_a[rb.a(var3 - var8, 7)] >>> var5), 255)]);
                                    var5 -= 8;
                                    var8++;
                                    continue L8;
                                  }
                                }
                              }
                            }
                          } else {
                            ((fm) this).field_f[var3] = ((fm) this).field_b[var3];
                            var3++;
                            continue L5;
                          }
                        }
                      } else {
                        ((fm) this).field_b[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L9: while (true) {
                          if (8 <= var4) {
                            var3++;
                            continue L4;
                          } else {
                            ((fm) this).field_b[var3] = uh.a(((fm) this).field_b[var3], co.field_e[var4][rb.a((int)(((fm) this).field_f[rb.a(7, -var4 + var3)] >>> var5), 255)]);
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
                ((fm) this).field_f[var2] = ((fm) this).field_i[var2];
                ((fm) this).field_a[var2] = uh.a(((fm) this).field_g[var2], ((fm) this).field_i[var2]);
                var2++;
                continue L1;
              }
            }
          } else {
            ((fm) this).field_g[var2] = uh.a(lm.a(255L, (long)((fm) this).field_e[7 + var3]), uh.a(lm.a(255L, (long)((fm) this).field_e[6 + var3]) << 8, uh.a(uh.a(lm.a(255L, (long)((fm) this).field_e[var3 + 4]) << 24, uh.a(uh.a(lm.a((long)((fm) this).field_e[2 + var3] << 40, 280375465082880L), uh.a((long)((fm) this).field_e[var3] << 56, lm.a(71776119061217280L, (long)((fm) this).field_e[var3 + 1] << 48))), lm.a((long)((fm) this).field_e[var3 - -3] << 32, 1095216660480L))), lm.a((long)((fm) this).field_e[var3 + 5] << 16, 16711680L))));
            var3 += 8;
            var2++;
            continue L0;
          }
        }
    }

    fm() {
        ((fm) this).field_d = new byte[32];
        ((fm) this).field_f = new long[8];
        ((fm) this).field_e = new byte[64];
        ((fm) this).field_h = 0;
        ((fm) this).field_b = new long[8];
        ((fm) this).field_g = new long[8];
        ((fm) this).field_i = new long[8];
        ((fm) this).field_j = 0;
        ((fm) this).field_a = new long[8];
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = Virogrid.field_F ? 1 : 0;
        for (var2 = 0; var2 < 32; var2++) {
            ((fm) this).field_d[var2] = (byte) 0;
        }
        var2 = -100 / ((param0 - 2) / 44);
        ((fm) this).field_h = 0;
        ((fm) this).field_e[0] = (byte) 0;
        ((fm) this).field_j = 0;
        for (var3 = 0; 8 > var3; var3++) {
            ((fm) this).field_i[var3] = 0L;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Waiting for <%0> to start the game...";
    }
}
