/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vh {
    private long[] field_m;
    private long[] field_j;
    private long[] field_f;
    private byte[] field_d;
    private int field_a;
    static String field_c;
    private long[] field_i;
    static int field_g;
    private long[] field_l;
    static String field_b;
    private int field_k;
    private byte[] field_e;
    static float[] field_h;

    private final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
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
                    var2 = 0;
                    L3: while (true) {
                      if (8 <= var2) {
                        return;
                      } else {
                        ((vh) this).field_l[var2] = oo.a(((vh) this).field_l[var2], oo.a(((vh) this).field_m[var2], ((vh) this).field_f[var2]));
                        var2++;
                        continue L3;
                      }
                    }
                  } else {
                    var3 = 0;
                    L4: while (true) {
                      if (8 <= var3) {
                        var3 = 0;
                        L5: while (true) {
                          if (var3 >= 8) {
                            ((vh) this).field_i[0] = oo.a(((vh) this).field_i[0], vka.field_H[var2]);
                            var3 = 0;
                            L6: while (true) {
                              if (8 <= var3) {
                                var3 = 0;
                                L7: while (true) {
                                  if (var3 >= 8) {
                                    var2++;
                                    continue L2;
                                  } else {
                                    ((vh) this).field_f[var3] = ((vh) this).field_j[var3];
                                    var3++;
                                    continue L7;
                                  }
                                }
                              } else {
                                ((vh) this).field_j[var3] = ((vh) this).field_i[var3];
                                var7 = 0;
                                var4 = var7;
                                var5 = 56;
                                L8: while (true) {
                                  if (8 <= var7) {
                                    var3++;
                                    continue L6;
                                  } else {
                                    ((vh) this).field_j[var3] = oo.a(((vh) this).field_j[var3], vka.field_I[var7][sea.c(255, (int)(((vh) this).field_f[sea.c(var3 - var7, 7)] >>> var5))]);
                                    var7++;
                                    var5 -= 8;
                                    continue L8;
                                  }
                                }
                              }
                            }
                          } else {
                            ((vh) this).field_i[var3] = ((vh) this).field_j[var3];
                            var3++;
                            continue L5;
                          }
                        }
                      } else {
                        ((vh) this).field_j[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L9: while (true) {
                          if (var4 >= 8) {
                            var3++;
                            continue L4;
                          } else {
                            ((vh) this).field_j[var3] = oo.a(((vh) this).field_j[var3], vka.field_I[var4][sea.c(255, (int)(((vh) this).field_i[sea.c(-var4 + var3, 7)] >>> var5))]);
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
                ((vh) this).field_i[var2] = ((vh) this).field_l[var2];
                ((vh) this).field_f[var2] = oo.a(((vh) this).field_m[var2], ((vh) this).field_l[var2]);
                var2++;
                continue L1;
              }
            }
          } else {
            ((vh) this).field_m[var2] = oo.a(oo.a(oo.a(oo.a(vi.a((long)((vh) this).field_e[4 + var3] << 24, 4278190080L), oo.a(vi.a(255L, (long)((vh) this).field_e[3 + var3]) << 32, oo.a(oo.a((long)((vh) this).field_e[var3] << 56, vi.a((long)((vh) this).field_e[1 + var3] << 48, 71776119061217280L)), vi.a(280375465082880L, (long)((vh) this).field_e[var3 - -2] << 40)))), vi.a((long)((vh) this).field_e[5 + var3], 255L) << 16), vi.a(255L, (long)((vh) this).field_e[6 + var3]) << 8), vi.a((long)((vh) this).field_e[7 + var3], 255L));
            var2++;
            var3 += 8;
            continue L0;
          }
        }
    }

    final void a(byte[] param0, long param1, byte param2) {
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
        var13 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == -59) {
                break L1;
              } else {
                ((vh) this).field_m = null;
                break L1;
              }
            }
            var5_int = 0;
            var6 = -((int)param1 & 7) + 8 & 7;
            var7 = 7 & ((vh) this).field_a;
            var9 = param1;
            var11 = 31;
            var12 = 0;
            L2: while (true) {
              if (var11 < 0) {
                L3: while (true) {
                  if (param1 <= 8L) {
                    L4: {
                      if (param1 > 0L) {
                        var8 = param0[var5_int] << var6 & 255;
                        ((vh) this).field_e[((vh) this).field_k] = (byte)fh.a((int) ((vh) this).field_e[((vh) this).field_k], var8 >>> var7);
                        break L4;
                      } else {
                        var8 = 0;
                        break L4;
                      }
                    }
                    L5: {
                      if (param1 + (long)var7 >= 8L) {
                        L6: {
                          ((vh) this).field_a = ((vh) this).field_a + (8 + -var7);
                          param1 = param1 - (long)(-var7 + 8);
                          ((vh) this).field_k = ((vh) this).field_k + 1;
                          if (((vh) this).field_a != 512) {
                            break L6;
                          } else {
                            this.a(false);
                            ((vh) this).field_a = 0;
                            ((vh) this).field_k = 0;
                            break L6;
                          }
                        }
                        ((vh) this).field_e[((vh) this).field_k] = (byte)sea.c(255, var8 << 8 + -var7);
                        ((vh) this).field_a = ((vh) this).field_a + (int)param1;
                        break L5;
                      } else {
                        ((vh) this).field_a = (int)((long)((vh) this).field_a + param1);
                        break L5;
                      }
                    }
                    break L0;
                  } else {
                    L7: {
                      var8 = param0[var5_int] << var6 & 255 | (param0[var5_int + 1] & 255) >>> -var6 + 8;
                      if (var8 < 0) {
                        break L7;
                      } else {
                        if (var8 < 256) {
                          L8: {
                            ((vh) this).field_e[((vh) this).field_k] = (byte)fh.a((int) ((vh) this).field_e[((vh) this).field_k], var8 >>> var7);
                            ((vh) this).field_a = ((vh) this).field_a + (8 - var7);
                            ((vh) this).field_k = ((vh) this).field_k + 1;
                            if (((vh) this).field_a == 512) {
                              this.a(false);
                              ((vh) this).field_k = 0;
                              ((vh) this).field_a = 0;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          ((vh) this).field_e[((vh) this).field_k] = (byte)sea.c(255, var8 << 8 + -var7);
                          var5_int++;
                          ((vh) this).field_a = ((vh) this).field_a + var7;
                          param1 = param1 - 8L;
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
                var12 = var12 + ((255 & ((vh) this).field_d[var11]) - -((int)var9 & 255));
                ((vh) this).field_d[var11] = (byte)var12;
                var9 = var9 >>> 8;
                var12 = var12 >>> 8;
                var11--;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var5;
            stackOut_24_1 = new StringBuilder().append("vh.F(");
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
          throw tba.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(byte param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        upa var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        kh var14 = null;
        RuntimeException decompiledCaughtException = null;
        var12 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var14 = vc.field_q;
            var2 = var14.h(255);
            var3 = (upa) (Object) ina.field_d.f(param0 ^ 100);
            L1: while (true) {
              L2: {
                if (var3 == null) {
                  break L2;
                } else {
                  if (var3.field_n != var2) {
                    var3 = (upa) (Object) ina.field_d.e(117);
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (var3 == null) {
                dea.a(60);
                return;
              } else {
                L3: {
                  var4 = var14.h(255);
                  if (param0 == -44) {
                    break L3;
                  } else {
                    vh.a((byte) 81);
                    break L3;
                  }
                }
                L4: {
                  if (var4 != 0) {
                    bra.field_M[0] = fna.field_k;
                    var5 = var3.field_k;
                    var6_int = 1;
                    L5: while (true) {
                      if (var6_int >= var4) {
                        dc.a(var4, var5, (byte) 47);
                        var6_int = 0;
                        L6: while (true) {
                          if (var6_int >= var4) {
                            ri.a(var5, (byte) 29);
                            String[][] dupTemp$2 = new String[2][var5];
                            var3.field_h = dupTemp$2;
                            var6 = dupTemp$2;
                            int[][] dupTemp$3 = new int[2][4 * var5];
                            var3.field_m = dupTemp$3;
                            var7 = dupTemp$3;
                            var8 = ola.field_Eb;
                            var9 = 0;
                            var10 = 0;
                            L7: while (true) {
                              if (var8 <= var9) {
                                var9 = 0;
                                var13 = 0;
                                var10 = var13;
                                L8: while (true) {
                                  if (var8 <= var9) {
                                    break L4;
                                  } else {
                                    L9: {
                                      var11 = boa.field_n[var5 - -var9];
                                      var6[1][var13] = bra.field_M[var11];
                                      var7[1][4 * var13] = jk.field_h[var11];
                                      var7[1][1 + var13 * 4] = cu.field_o[var11];
                                      var7[1][4 * var13 - -2] = bq.field_h[var11];
                                      var7[1][3 + 4 * var13] = im.field_o[var11];
                                      if (ue.a(bra.field_M[var11], param0 + 44)) {
                                        if (0 != im.field_o[var11] + (bq.field_h[var11] + cu.field_o[var11])) {
                                          break L9;
                                        } else {
                                          var6[1][var13] = null;
                                          var13--;
                                          break L9;
                                        }
                                      } else {
                                        break L9;
                                      }
                                    }
                                    var13++;
                                    var9++;
                                    continue L8;
                                  }
                                }
                              } else {
                                L10: {
                                  var11 = boa.field_n[var9];
                                  var6[0][var10] = bra.field_M[var11];
                                  var7[0][4 * var10] = jk.field_h[var11];
                                  var7[0][1 + 4 * var10] = cu.field_o[var11];
                                  var7[0][2 + 4 * var10] = bq.field_h[var11];
                                  var7[0][var10 * 4 + 3] = im.field_o[var11];
                                  if (!ue.a(bra.field_M[var11], 0)) {
                                    break L10;
                                  } else {
                                    if (im.field_o[var11] + cu.field_o[var11] + bq.field_h[var11] != 0) {
                                      break L10;
                                    } else {
                                      var6[0][var10] = null;
                                      var10--;
                                      break L10;
                                    }
                                  }
                                }
                                var9++;
                                var10++;
                                continue L7;
                              }
                            }
                          } else {
                            L11: {
                              dga.a((uia) (Object) var14, 0);
                              if (var6_int != 0) {
                                qt.a(kc.field_b, vd.field_p, ir.field_a, var6_int, tna.field_f, (byte) -90);
                                break L11;
                              } else {
                                var3.field_g = ir.field_a;
                                var3.field_f = kc.field_b;
                                var3.field_l = tna.field_f;
                                var3.field_j = vd.field_p;
                                qt.a(kc.field_b, vd.field_p, ir.field_a, var6_int, tna.field_f, (byte) -97);
                                break L11;
                              }
                            }
                            var6_int++;
                            continue L6;
                          }
                        }
                      } else {
                        bra.field_M[var6_int] = var14.e((byte) -76);
                        var6_int++;
                        continue L5;
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                var3.field_i = true;
                var3.p(7);
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var1, "vh.D(" + param0 + ')');
        }
    }

    final void b(byte param0) {
        int var2 = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        for (var2 = 0; var2 < 32; var2++) {
            ((vh) this).field_d[var2] = (byte) 0;
        }
        ((vh) this).field_a = 0;
        ((vh) this).field_k = 0;
        ((vh) this).field_e[0] = (byte) 0;
        var2 = 0;
        int var3 = 115 / ((param0 - 58) / 35);
        while (8 > var2) {
            ((vh) this).field_l[var2] = 0L;
            var2++;
        }
    }

    public static void a(int param0) {
        field_h = null;
        field_b = null;
        if (param0 >= -15) {
            return;
        }
        field_c = null;
    }

    final void a(int param0, int param1, byte[] param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              ((vh) this).field_e[((vh) this).field_k] = (byte)fh.a((int) ((vh) this).field_e[((vh) this).field_k], 128 >>> sea.c(((vh) this).field_a, 7));
              ((vh) this).field_k = ((vh) this).field_k + 1;
              if (((vh) this).field_k <= param1) {
                break L1;
              } else {
                L2: while (true) {
                  if (((vh) this).field_k >= 64) {
                    this.a(false);
                    ((vh) this).field_k = 0;
                    break L1;
                  } else {
                    int fieldTemp$2 = ((vh) this).field_k;
                    ((vh) this).field_k = ((vh) this).field_k + 1;
                    ((vh) this).field_e[fieldTemp$2] = (byte) 0;
                    continue L2;
                  }
                }
              }
            }
            L3: while (true) {
              if (((vh) this).field_k >= 32) {
                lua.a(((vh) this).field_d, 0, ((vh) this).field_e, 32, 32);
                this.a(false);
                var4_int = 0;
                var5 = param0;
                L4: while (true) {
                  if (var4_int >= 8) {
                    break L0;
                  } else {
                    var6 = ((vh) this).field_l[var4_int];
                    param2[var5] = (byte)(int)(var6 >>> 56);
                    param2[var5 + 1] = (byte)(int)(var6 >>> 48);
                    param2[var5 + 2] = (byte)(int)(var6 >>> 40);
                    param2[var5 - -3] = (byte)(int)(var6 >>> 32);
                    param2[var5 + 4] = (byte)(int)(var6 >>> 24);
                    param2[var5 - -5] = (byte)(int)(var6 >>> 16);
                    param2[6 + var5] = (byte)(int)(var6 >>> 8);
                    param2[var5 - -7] = (byte)(int)var6;
                    var4_int++;
                    var5 += 8;
                    continue L4;
                  }
                }
              } else {
                int fieldTemp$3 = ((vh) this).field_k;
                ((vh) this).field_k = ((vh) this).field_k + 1;
                ((vh) this).field_e[fieldTemp$3] = (byte) 0;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("vh.B(").append(param0).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
    }

    final static boolean a(int param0, boolean param1, int param2, lj param3) {
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            if (!param1) {
              L1: {
                if (param0 != param3.n(31974).field_d) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L1;
                } else {
                  stackOut_6_0 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  break L1;
                }
              }
              break L0;
            } else {
              L2: {
                if (param3.i((byte) 84).field_d != param0) {
                  stackOut_3_0 = 0;
                  stackIn_4_0 = stackOut_3_0;
                  break L2;
                } else {
                  stackOut_2_0 = 1;
                  stackIn_4_0 = stackOut_2_0;
                  break L2;
                }
              }
              return stackIn_4_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var4;
            stackOut_9_1 = new StringBuilder().append("vh.E(").append(param0).append(',').append(param1).append(',').append(-27201).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param3 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
        return stackIn_8_0 != 0;
    }

    vh() {
        ((vh) this).field_m = new long[8];
        ((vh) this).field_a = 0;
        ((vh) this).field_j = new long[8];
        ((vh) this).field_f = new long[8];
        ((vh) this).field_i = new long[8];
        ((vh) this).field_d = new byte[32];
        ((vh) this).field_l = new long[8];
        ((vh) this).field_e = new byte[64];
        ((vh) this).field_k = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Some objects in the game can be pushed or pulled. Walk into them holding <img=8><img=9>";
        field_h = new float[4];
        field_b = "3rd";
    }
}
