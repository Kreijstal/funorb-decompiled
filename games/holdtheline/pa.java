/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pa {
    private byte[] field_f;
    private long[] field_j;
    static int field_h;
    private long[] field_g;
    private byte[] field_c;
    private long[] field_k;
    private long[] field_d;
    private int field_e;
    static String field_i;
    private int field_a;
    private long[] field_b;

    final static void a() {
        fo var1 = (fo) (Object) ji.field_a.b((byte) 87);
        if (!(var1 != null)) {
            r.a(-28036);
            return;
        }
        da var2 = rd.field_e;
        var1.field_i = new int[]{var2.a(45), var2.a(-72), var2.a(-47), var2.a(79)};
        var1.d(0);
    }

    final void a(int param0, byte[] param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        Object var9 = null;
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
        var8 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              ((pa) this).field_f[((pa) this).field_e] = (byte)kc.a((int) ((pa) this).field_f[((pa) this).field_e], 128 >>> pk.a(7, ((pa) this).field_a));
              ((pa) this).field_e = ((pa) this).field_e + 1;
              if (((pa) this).field_e <= 32) {
                break L1;
              } else {
                L2: while (true) {
                  if (((pa) this).field_e >= 64) {
                    int discarded$4 = 1;
                    this.c();
                    ((pa) this).field_e = 0;
                    break L1;
                  } else {
                    int fieldTemp$5 = ((pa) this).field_e;
                    ((pa) this).field_e = ((pa) this).field_e + 1;
                    ((pa) this).field_f[fieldTemp$5] = (byte) 0;
                    continue L2;
                  }
                }
              }
            }
            L3: while (true) {
              if (((pa) this).field_e >= 32) {
                bc.a(((pa) this).field_c, 0, ((pa) this).field_f, 32, 32);
                int discarded$6 = 1;
                this.c();
                var4_int = 0;
                var5 = param2;
                L4: while (true) {
                  if (8 <= var4_int) {
                    L5: {
                      if (param0 == 6934) {
                        break L5;
                      } else {
                        var9 = null;
                        pa.a(-73, -103, -36, (hj) null);
                        break L5;
                      }
                    }
                    break L0;
                  } else {
                    var6 = ((pa) this).field_k[var4_int];
                    param1[var5] = (byte)(int)(var6 >>> 56);
                    param1[var5 - -1] = (byte)(int)(var6 >>> 48);
                    param1[2 + var5] = (byte)(int)(var6 >>> 40);
                    param1[var5 + 3] = (byte)(int)(var6 >>> 32);
                    param1[4 + var5] = (byte)(int)(var6 >>> 24);
                    param1[5 + var5] = (byte)(int)(var6 >>> 16);
                    param1[6 + var5] = (byte)(int)(var6 >>> 8);
                    param1[var5 + 7] = (byte)(int)var6;
                    var4_int++;
                    var5 += 8;
                    continue L4;
                  }
                }
              } else {
                int fieldTemp$7 = ((pa) this).field_e;
                ((pa) this).field_e = ((pa) this).field_e + 1;
                ((pa) this).field_f[fieldTemp$7] = (byte) 0;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("pa.A(").append(param0).append(',');
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
          throw kk.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param2 + ')');
        }
    }

    final void b(boolean param0) {
        int var2 = 0;
        int var3 = HoldTheLine.field_D;
        for (var2 = 0; var2 < 32; var2++) {
            ((pa) this).field_c[var2] = (byte) 0;
        }
        ((pa) this).field_f[0] = (byte) 0;
        if (param0) {
            return;
        }
        ((pa) this).field_a = 0;
        ((pa) this).field_e = 0;
        for (var2 = 0; 8 > var2; var2++) {
            ((pa) this).field_k[var2] = 0L;
        }
    }

    final static void a(int param0, int param1, int param2) {
        in.field_i = param1;
        if (param0 > -32) {
            field_h = 30;
        }
        mk.field_i = param2;
    }

    final static void a(qi param0, qi param1) {
        sj.field_G = param1;
        q.field_a = param0;
        try {
            p.field_j = 480;
            pa.a(-90, tc.field_c / 2, tc.field_j / 2);
            dd.a(param1.field_s, param0.field_s, param0.field_s + param0.field_I, param1.field_I + param1.field_s, (byte) -108);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "pa.B(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + -112 + ',' + 480 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, hj param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
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
        var20 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              var4_int = 0;
              var5 = 0;
              var6 = param3.field_s;
              var7 = param3.field_y;
              if (param1 < 0) {
                var6 = var6 + param1;
                var4_int = var4_int - param1;
                param1 = 0;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (var6 + param1 <= 640) {
                break L2;
              } else {
                var6 = 640 - param1;
                break L2;
              }
            }
            L3: {
              if (param0 >= 0) {
                break L3;
              } else {
                var7 = var7 + param0;
                var5 = var5 - param0;
                param0 = 0;
                break L3;
              }
            }
            L4: {
              if (param0 - -var7 <= 480) {
                break L4;
              } else {
                var7 = -param0 + 480;
                break L4;
              }
            }
            var8 = var4_int + (param3.field_o * (var5 + (var7 + -1)) + -1);
            var9 = (-1 + var7 + param0) * tc.field_j + param1 - 1;
            var13 = var7;
            L5: while (true) {
              if (var13 <= 0) {
                L6: {
                  if (param2 > 97) {
                    break L6;
                  } else {
                    field_h = -97;
                    break L6;
                  }
                }
                break L0;
              } else {
                var12 = var6;
                L7: while (true) {
                  if (var12 <= 0) {
                    var13--;
                    var8 = var8 - (param3.field_o + var6);
                    var9 = var9 - (var6 + tc.field_j);
                    continue L5;
                  } else {
                    L8: {
                      var9++;
                      var11 = tc.field_b[var9];
                      var8++;
                      var10 = param3.field_z[var8];
                      if (var10 != 0) {
                        if (0 != var11) {
                          var15 = 255 & var11 >> 8;
                          var18 = var10 >> 8 & 255;
                          var14 = (var11 & 16711680) >> 16;
                          var19 = 255 & var10;
                          var16 = 255 & var11;
                          var17 = var10 >> 16 & 255;
                          var14 = var14 + (var17 - (var17 * var14 >> 8) + -1);
                          var16 = var16 + (-(var16 * var19 >> 8) + (var19 - 1));
                          var15 = var15 + (-1 + -(var15 * var18 >> 8) + var18);
                          tc.field_b[var9] = kc.a(kc.a(var14 << 16, var15 << 8), var16);
                          break L8;
                        } else {
                          tc.field_b[var9] = var10;
                          break L8;
                        }
                      } else {
                        break L8;
                      }
                    }
                    var12--;
                    continue L7;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var4 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var4;
            stackOut_24_1 = new StringBuilder().append("pa.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param3 == null) {
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
          throw kk.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ')');
        }
    }

    private final void c() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var6 = HoldTheLine.field_D;
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
                        ((pa) this).field_k[var2] = en.a(((pa) this).field_k[var2], en.a(((pa) this).field_b[var2], ((pa) this).field_g[var2]));
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
                            ((pa) this).field_d[0] = en.a(((pa) this).field_d[0], ri.field_f[var2]);
                            var3 = 0;
                            L6: while (true) {
                              if (var3 >= 8) {
                                var3 = 0;
                                L7: while (true) {
                                  if (8 <= var3) {
                                    var2++;
                                    continue L2;
                                  } else {
                                    ((pa) this).field_b[var3] = ((pa) this).field_j[var3];
                                    var3++;
                                    continue L7;
                                  }
                                }
                              } else {
                                ((pa) this).field_j[var3] = ((pa) this).field_d[var3];
                                var7 = 0;
                                var4 = var7;
                                var5 = 56;
                                L8: while (true) {
                                  if (var7 >= 8) {
                                    var3++;
                                    continue L6;
                                  } else {
                                    ((pa) this).field_j[var3] = en.a(((pa) this).field_j[var3], ri.field_g[var7][pk.a((int)(((pa) this).field_b[pk.a(-var7 + var3, 7)] >>> var5), 255)]);
                                    var7++;
                                    var5 -= 8;
                                    continue L8;
                                  }
                                }
                              }
                            }
                          } else {
                            ((pa) this).field_d[var3] = ((pa) this).field_j[var3];
                            var3++;
                            continue L5;
                          }
                        }
                      } else {
                        ((pa) this).field_j[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L9: while (true) {
                          if (8 <= var4) {
                            var3++;
                            continue L4;
                          } else {
                            ((pa) this).field_j[var3] = en.a(((pa) this).field_j[var3], ri.field_g[var4][pk.a((int)(((pa) this).field_d[pk.a(var3 - var4, 7)] >>> var5), 255)]);
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
                ((pa) this).field_d[var2] = ((pa) this).field_k[var2];
                ((pa) this).field_b[var2] = en.a(((pa) this).field_g[var2], ((pa) this).field_k[var2]);
                var2++;
                continue L1;
              }
            }
          } else {
            ((pa) this).field_g[var2] = en.a(en.a(gh.a(65280L, (long)((pa) this).field_f[var3 - -6] << 8), en.a(gh.a((long)((pa) this).field_f[5 + var3] << 16, 16711680L), en.a(en.a(en.a(en.a((long)((pa) this).field_f[var3] << 56, gh.a(255L, (long)((pa) this).field_f[1 + var3]) << 48), gh.a((long)((pa) this).field_f[2 + var3], 255L) << 40), gh.a(1095216660480L, (long)((pa) this).field_f[3 + var3] << 32)), gh.a((long)((pa) this).field_f[4 + var3] << 24, 4278190080L)))), gh.a(255L, (long)((pa) this).field_f[var3 + 7]));
            var2++;
            var3 += 8;
            continue L0;
          }
        }
    }

    public static void a(boolean param0) {
        field_i = null;
        if (!param0) {
            pa.a(false);
        }
    }

    final void a(byte[] param0, byte param1, long param2) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        long var10 = 0L;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var14 = HoldTheLine.field_D;
        try {
          L0: {
            var5_int = 0;
            var6 = -73 / ((-14 - param1) / 44);
            var7 = 7 & -(7 & (int)param2) + 8;
            var8 = ((pa) this).field_a & 7;
            var10 = param2;
            var12 = 31;
            var13 = 0;
            L1: while (true) {
              if (var12 < 0) {
                L2: while (true) {
                  if (param2 <= 8L) {
                    L3: {
                      if (0L < param2) {
                        var9 = 255 & param0[var5_int] << var7;
                        ((pa) this).field_f[((pa) this).field_e] = (byte)kc.a((int) ((pa) this).field_f[((pa) this).field_e], var9 >>> var8);
                        break L3;
                      } else {
                        var9 = 0;
                        break L3;
                      }
                    }
                    L4: {
                      if (param2 + (long)var8 < 8L) {
                        ((pa) this).field_a = (int)((long)((pa) this).field_a + param2);
                        break L4;
                      } else {
                        L5: {
                          param2 = param2 - (long)(-var8 + 8);
                          ((pa) this).field_a = ((pa) this).field_a + (8 - var8);
                          ((pa) this).field_e = ((pa) this).field_e + 1;
                          if (((pa) this).field_a != 512) {
                            break L5;
                          } else {
                            int discarded$2 = 1;
                            this.c();
                            ((pa) this).field_e = 0;
                            ((pa) this).field_a = 0;
                            break L5;
                          }
                        }
                        ((pa) this).field_f[((pa) this).field_e] = (byte)pk.a(var9 << 8 + -var8, 255);
                        ((pa) this).field_a = ((pa) this).field_a + (int)param2;
                        break L4;
                      }
                    }
                    break L0;
                  } else {
                    L6: {
                      var9 = 255 & param0[var5_int] << var7 | (255 & param0[1 + var5_int]) >>> -var7 + 8;
                      if (var9 < 0) {
                        break L6;
                      } else {
                        if (var9 >= 256) {
                          break L6;
                        } else {
                          L7: {
                            ((pa) this).field_f[((pa) this).field_e] = (byte)kc.a((int) ((pa) this).field_f[((pa) this).field_e], var9 >>> var8);
                            ((pa) this).field_e = ((pa) this).field_e + 1;
                            ((pa) this).field_a = ((pa) this).field_a + (-var8 + 8);
                            if (((pa) this).field_a != 512) {
                              break L7;
                            } else {
                              int discarded$3 = 1;
                              this.c();
                              ((pa) this).field_e = 0;
                              ((pa) this).field_a = 0;
                              break L7;
                            }
                          }
                          ((pa) this).field_f[((pa) this).field_e] = (byte)pk.a(var9 << -var8 + 8, 255);
                          param2 = param2 - 8L;
                          var5_int++;
                          ((pa) this).field_a = ((pa) this).field_a + var8;
                          continue L2;
                        }
                      }
                    }
                    throw new RuntimeException("LOGIC ERROR");
                  }
                }
              } else {
                var13 = var13 + (((int)var10 & 255) + (255 & ((pa) this).field_c[var12]));
                ((pa) this).field_c[var12] = (byte)var13;
                var10 = var10 >>> 8;
                var13 = var13 >>> 8;
                var12--;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var5;
            stackOut_21_1 = new StringBuilder().append("pa.I(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L8;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    pa() {
        ((pa) this).field_f = new byte[64];
        ((pa) this).field_j = new long[8];
        ((pa) this).field_k = new long[8];
        ((pa) this).field_g = new long[8];
        ((pa) this).field_a = 0;
        ((pa) this).field_d = new long[8];
        ((pa) this).field_e = 0;
        ((pa) this).field_b = new long[8];
        ((pa) this).field_c = new byte[32];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Brake/reverse";
    }
}
