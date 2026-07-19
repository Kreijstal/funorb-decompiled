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
            dg.field_x = mh.field_g - (var1_int >> 1644553377);
            tl.field_i = kn.field_I + -(lj.field_g >> 496326913);
            sh.field_rb = var1_int + dg.field_x;
            var2 = tl.field_i;
            var3 = 0;
            L1: while (true) {
              if (vg.field_F.length <= var3) {
                L2: {
                  if (!param0) {
                    break L2;
                  } else {
                    field_c = (String) null;
                    break L2;
                  }
                }
                break L0;
              } else {
                L3: {
                  var4 = wf.field_f[var3];
                  if ((var4 ^ -1) <= -1) {
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
                  var8 = mh.field_g + -(var7 >> -1220127679);
                  if ((var4 ^ -1) <= -1) {
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
                        var9.a(-dj.field_e + var8, (ng.field_P << -470539583) + di.field_o, false, (dj.field_e << -2085224479) + var7, var2);
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
          throw kg.a((Throwable) ((Object) var1), "fm.B(" + param0 + ')');
        }
    }

    final static int a(CharSequence param0, boolean param1) {
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                field_c = (String) null;
                break L1;
              }
            }
            stackOut_2_0 = p.a(10, 4330, true, param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("fm.G(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
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
              var7 = 7 & this.field_j;
              var9 = param0;
              if (!param1) {
                break L1;
              } else {
                this.field_a = (long[]) null;
                break L1;
              }
            }
            var11 = 31;
            var12 = 0;
            L2: while (true) {
              if (-1 < (var11 ^ -1)) {
                L3: while (true) {
                  if (8L >= param0) {
                    L4: {
                      if (-1L > (param0 ^ -1L)) {
                        var8 = 255 & param2[var5_int] << var6;
                        this.field_e[this.field_h] = (byte)oh.a((int) this.field_e[this.field_h], var8 >>> var7);
                        break L4;
                      } else {
                        var8 = 0;
                        break L4;
                      }
                    }
                    L5: {
                      if ((param0 + (long)var7 ^ -1L) > -9L) {
                        this.field_j = (int)((long)this.field_j + param0);
                        break L5;
                      } else {
                        L6: {
                          param0 = param0 - (long)(-var7 + 8);
                          this.field_j = this.field_j + (8 + -var7);
                          this.field_h = this.field_h + 1;
                          if (-513 == (this.field_j ^ -1)) {
                            this.b((byte) -91);
                            this.field_h = 0;
                            this.field_j = 0;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        this.field_e[this.field_h] = (byte)rb.a(var8 << -var7 + 8, 255);
                        this.field_j = this.field_j + (int)param0;
                        break L5;
                      }
                    }
                    break L0;
                  } else {
                    L7: {
                      var8 = 255 & param2[var5_int] << var6 | (255 & param2[1 + var5_int]) >>> -var6 + 8;
                      if (-1 < (var8 ^ -1)) {
                        break L7;
                      } else {
                        if (var8 < 256) {
                          L8: {
                            this.field_e[this.field_h] = (byte)oh.a((int) this.field_e[this.field_h], var8 >>> var7);
                            this.field_h = this.field_h + 1;
                            this.field_j = this.field_j + (-var7 + 8);
                            if (-513 == (this.field_j ^ -1)) {
                              this.b((byte) -91);
                              this.field_h = 0;
                              this.field_j = 0;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          this.field_e[this.field_h] = (byte)rb.a(255, var8 << -var7 + 8);
                          param0 = param0 - 8L;
                          this.field_j = this.field_j + var7;
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
                var12 = var12 + ((255 & (int)var9) + (this.field_d[var11] & 255));
                this.field_d[var11] = (byte)var12;
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
            stackOut_25_0 = (RuntimeException) (var5);
            stackOut_25_1 = new StringBuilder().append("fm.F(").append(param0).append(',').append(param1).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param2 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L9;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L9;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
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
            stackOut_6_0 = (RuntimeException) (var2);
            stackOut_6_1 = new StringBuilder().append("fm.A(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_5_0 != 0;
    }

    final static void a(int param0, int param1, int param2) {
        he var6 = null;
        he var7 = null;
        hg var4 = null;
        if (!(wl.field_b == param0)) {
            var6 = (he) ((Object) ma.field_c.a((long)wl.field_b, (byte) 77));
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
            field_c = (String) null;
        }
    }

    final void a(int param0, byte[] param1, int param2) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
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
              this.field_e[this.field_h] = (byte)oh.a((int) this.field_e[this.field_h], 128 >>> rb.a(this.field_j, 7));
              this.field_h = this.field_h + 1;
              if (this.field_h <= 32) {
                break L1;
              } else {
                L2: while (true) {
                  if (64 <= this.field_h) {
                    this.b((byte) -91);
                    this.field_h = 0;
                    break L1;
                  } else {
                    fieldTemp$2 = this.field_h;
                    this.field_h = this.field_h + 1;
                    this.field_e[fieldTemp$2] = (byte) 0;
                    continue L2;
                  }
                }
              }
            }
            L3: {
              if (param2 == 8) {
                break L3;
              } else {
                this.field_e = (byte[]) null;
                break L3;
              }
            }
            L4: while (true) {
              if ((this.field_h ^ -1) <= -33) {
                ek.a(this.field_d, 0, this.field_e, 32, 32);
                this.b((byte) -91);
                var4_int = 0;
                var5 = param0;
                L5: while (true) {
                  if (8 <= var4_int) {
                    break L0;
                  } else {
                    var6 = this.field_i[var4_int];
                    param1[var5] = (byte)(int)(var6 >>> 103053432);
                    param1[var5 - -1] = (byte)(int)(var6 >>> -1552436240);
                    param1[var5 - -2] = (byte)(int)(var6 >>> 2109029608);
                    param1[3 + var5] = (byte)(int)(var6 >>> 224881056);
                    param1[var5 - -4] = (byte)(int)(var6 >>> 675927704);
                    param1[var5 - -5] = (byte)(int)(var6 >>> 134133520);
                    param1[var5 + 6] = (byte)(int)(var6 >>> -1196988536);
                    param1[var5 - -7] = (byte)(int)var6;
                    var4_int++;
                    var5 += 8;
                    continue L5;
                  }
                }
              } else {
                fieldTemp$3 = this.field_h;
                this.field_h = this.field_h + 1;
                this.field_e[fieldTemp$3] = (byte) 0;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var4);
            stackOut_13_1 = new StringBuilder().append("fm.D(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param2 + ')');
        }
    }

    public static void a(byte param0) {
        if (param0 != -54) {
            fm.a((byte) 0);
        }
        field_c = null;
    }

    private final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        byte[] var7 = null;
        int var8 = 0;
        var6 = Virogrid.field_F ? 1 : 0;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if (-9 >= (var2 ^ -1)) {
            var2 = 0;
            L1: while (true) {
              if (-9 >= (var2 ^ -1)) {
                var2 = 1;
                L2: while (true) {
                  if (-11 > (var2 ^ -1)) {
                    L3: {
                      if (param0 == -91) {
                        break L3;
                      } else {
                        var7 = (byte[]) null;
                        this.a(-69L, false, (byte[]) null);
                        break L3;
                      }
                    }
                    var2 = 0;
                    L4: while (true) {
                      if (-9 >= (var2 ^ -1)) {
                        return;
                      } else {
                        this.field_i[var2] = uh.a(this.field_i[var2], uh.a(this.field_g[var2], this.field_a[var2]));
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
                          if (-9 >= (var3 ^ -1)) {
                            this.field_f[0] = uh.a(this.field_f[0], co.field_b[var2]);
                            var3 = 0;
                            L7: while (true) {
                              if (-9 >= (var3 ^ -1)) {
                                var3 = 0;
                                L8: while (true) {
                                  if (8 <= var3) {
                                    var2++;
                                    continue L2;
                                  } else {
                                    this.field_a[var3] = this.field_b[var3];
                                    var3++;
                                    continue L8;
                                  }
                                }
                              } else {
                                this.field_b[var3] = this.field_f[var3];
                                var8 = 0;
                                var4 = var8;
                                var5 = 56;
                                L9: while (true) {
                                  if (-9 >= (var8 ^ -1)) {
                                    var3++;
                                    continue L7;
                                  } else {
                                    this.field_b[var3] = uh.a(this.field_b[var3], co.field_e[var8][rb.a((int)(this.field_a[rb.a(var3 - var8, 7)] >>> var5), 255)]);
                                    var5 -= 8;
                                    var8++;
                                    continue L9;
                                  }
                                }
                              }
                            }
                          } else {
                            this.field_f[var3] = this.field_b[var3];
                            var3++;
                            continue L6;
                          }
                        }
                      } else {
                        this.field_b[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L10: while (true) {
                          if (8 <= var4) {
                            var3++;
                            continue L5;
                          } else {
                            this.field_b[var3] = uh.a(this.field_b[var3], co.field_e[var4][rb.a((int)(this.field_f[rb.a(7, -var4 + var3)] >>> var5), 255)]);
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
                this.field_f[var2] = this.field_i[var2];
                this.field_a[var2] = uh.a(this.field_g[var2], this.field_i[var2]);
                var2++;
                continue L1;
              }
            }
          } else {
            this.field_g[var2] = uh.a(lm.a(255L, (long)this.field_e[7 + var3]), uh.a(lm.a(255L, (long)this.field_e[6 + var3]) << 1410754760, uh.a(uh.a(lm.a(255L, (long)this.field_e[var3 + 4]) << 679008472, uh.a(uh.a(lm.a((long)this.field_e[2 + var3] << 90913576, 280375465082880L), uh.a((long)this.field_e[var3] << -524600392, lm.a(71776119061217280L, (long)this.field_e[var3 + 1] << -1369854352))), lm.a((long)this.field_e[var3 - -3] << 1155221600, 1095216660480L))), lm.a((long)this.field_e[var3 + 5] << 702119376, 16711680L))));
            var3 += 8;
            var2++;
            continue L0;
          }
        }
    }

    fm() {
        this.field_d = new byte[32];
        this.field_f = new long[8];
        this.field_e = new byte[64];
        this.field_h = 0;
        this.field_b = new long[8];
        this.field_g = new long[8];
        this.field_i = new long[8];
        this.field_j = 0;
        this.field_a = new long[8];
    }

    final void a(int param0) {
        int var3 = 0;
        int var2 = 0;
        int var4 = Virogrid.field_F ? 1 : 0;
        for (var2 = 0; (var2 ^ -1) > -33; var2++) {
            this.field_d[var2] = (byte) 0;
        }
        var2 = -100 / ((param0 - 2) / 44);
        this.field_h = 0;
        this.field_e[0] = (byte) 0;
        this.field_j = 0;
        for (var3 = 0; 8 > var3; var3++) {
            this.field_i[var3] = 0L;
        }
    }

    static {
        field_c = "Waiting for <%0> to start the game...";
    }
}
