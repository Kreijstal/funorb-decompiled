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
            this.field_k[var2] = (byte) 0;
        }
        this.field_l = 0;
        this.field_i[0] = (byte) 0;
        this.field_c = 0;
        for (var2 = 0; (var2 ^ -1) > -9; var2++) {
            this.field_h[var2] = 0L;
        }
    }

    final void a(byte[] param0, long param1, int param2) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = BachelorFridge.field_y;
        try {
          L0: {
            var5_int = param2;
            var6 = -(7 & (int)param1) + 8 & 7;
            var7 = 7 & this.field_l;
            var9 = param1;
            var11 = 31;
            var12 = 0;
            L1: while (true) {
              if ((var11 ^ -1) > -1) {
                L2: while (true) {
                  if ((param1 ^ -1L) >= -9L) {
                    L3: {
                      if (0L >= param1) {
                        var8 = 0;
                        break L3;
                      } else {
                        var8 = param0[var5_int] << var6 & 255;
                        this.field_i[this.field_c] = (byte)mp.a((int) this.field_i[this.field_c], var8 >>> var7);
                        break L3;
                      }
                    }
                    L4: {
                      if ((long)var7 + param1 >= 8L) {
                        L5: {
                          this.field_l = this.field_l + (8 - var7);
                          param1 = param1 - (long)(8 + -var7);
                          this.field_c = this.field_c + 1;
                          if (this.field_l != 512) {
                            break L5;
                          } else {
                            this.a(false);
                            this.field_c = 0;
                            this.field_l = 0;
                            break L5;
                          }
                        }
                        this.field_i[this.field_c] = (byte)dda.a(255, var8 << -var7 + 8);
                        this.field_l = this.field_l + (int)param1;
                        break L4;
                      } else {
                        this.field_l = (int)((long)this.field_l + param1);
                        break L4;
                      }
                    }
                    break L0;
                  } else {
                    L6: {
                      var8 = 255 & param0[var5_int] << var6 | (255 & param0[var5_int + 1]) >>> -var6 + 8;
                      if (-1 < (var8 ^ -1)) {
                        break L6;
                      } else {
                        if ((var8 ^ -1) > -257) {
                          L7: {
                            this.field_i[this.field_c] = (byte)mp.a((int) this.field_i[this.field_c], var8 >>> var7);
                            this.field_l = this.field_l + (-var7 + 8);
                            this.field_c = this.field_c + 1;
                            if (-513 == (this.field_l ^ -1)) {
                              this.a(false);
                              this.field_c = 0;
                              this.field_l = 0;
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          this.field_i[this.field_c] = (byte)dda.a(255, var8 << 8 + -var7);
                          var5_int++;
                          this.field_l = this.field_l + var7;
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
                var12 = var12 + ((255 & this.field_k[var11]) - -((int)var9 & 255));
                this.field_k[var11] = (byte)var12;
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
            stackIn_26_0 = (RuntimeException) (var5);

            stackIn_26_1 = new StringBuilder().append("ur.B(");

            if (param0 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L8;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L8;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, int param1, byte[] param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        long var7 = 0L;
        int var9 = 0;
        var9 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              this.field_i[this.field_c] = (byte)mp.a((int) this.field_i[this.field_c], 128 >>> dda.a(this.field_l, 7));
              this.field_c = this.field_c + 1;
              if ((this.field_c ^ -1) < -33) {
                L2: while (true) {
                  if ((this.field_c ^ -1) <= -65) {
                    this.a(false);
                    this.field_c = 0;
                    break L1;
                  } else {
                    fieldTemp$0 = this.field_c;
                    this.field_c = this.field_c + 1;
                    this.field_i[fieldTemp$0] = (byte) 0;
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            L3: while (true) {
              if ((this.field_c ^ -1) <= -33) {
                bl.a(this.field_k, 0, this.field_i, 32, 32);
                this.a(false);
                var6 = -122 % ((param0 - 10) / 46);
                var4_int = 0;
                var5 = param1;
                L4: while (true) {
                  if (-9 >= (var4_int ^ -1)) {
                    break L0;
                  } else {
                    var7 = this.field_h[var4_int];
                    param2[var5] = (byte)(int)(var7 >>> 456049912);
                    param2[var5 + 1] = (byte)(int)(var7 >>> -240138256);
                    param2[var5 - -2] = (byte)(int)(var7 >>> 1207010088);
                    param2[var5 - -3] = (byte)(int)(var7 >>> 756204896);
                    param2[var5 - -4] = (byte)(int)(var7 >>> 1232330840);
                    param2[5 + var5] = (byte)(int)(var7 >>> -1992466672);
                    param2[6 + var5] = (byte)(int)(var7 >>> 1799117512);
                    param2[7 + var5] = (byte)(int)var7;
                    var5 += 8;
                    var4_int++;
                    continue L4;
                  }
                }
              } else {
                fieldTemp$1 = this.field_c;
                this.field_c = this.field_c + 1;
                this.field_i[fieldTemp$1] = (byte) 0;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var4);

            stackIn_14_1 = new StringBuilder().append("ur.G(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    final static pp a(lu param0, byte param1) {
        nq var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        ela stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2 = qi.a(param0, (byte) 112);
              if (param1 == 120) {
                break L1;
              } else {
                ur.a(-96);
                break L1;
              }
            }
            var3 = param0.b(param1 ^ 16711815);
            stackIn_3_0 = new ela(var2, var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2_ref);

            stackIn_6_1 = new StringBuilder().append("ur.E(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return (pp) ((Object) stackIn_3_0);
    }

    private final void a(boolean param0) {
        long dupTemp$0 = 0L;
        long arrayValue$1 = 0L;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
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
                      if (-9 >= (var2 ^ -1)) {
                        return;
                      } else {
                        this.field_h[var2] = gv.a(this.field_h[var2], gv.a(this.field_n[var2], this.field_o[var2]));
                        var2++;
                        continue L4;
                      }
                    }
                  } else {
                    var3 = 0;
                    L5: while (true) {
                      if ((var3 ^ -1) <= -9) {
                        var3 = 0;
                        L6: while (true) {
                          if ((var3 ^ -1) <= -9) {
                            this.field_g[0] = gv.a(this.field_g[0], hha.field_z[var2]);
                            var3 = 0;
                            L7: while (true) {
                              if (8 <= var3) {
                                var3 = 0;
                                L8: while (true) {
                                  if ((var3 ^ -1) <= -9) {
                                    var2++;
                                    continue L2;
                                  } else {
                                    this.field_n[var3] = this.field_a[var3];
                                    var3++;
                                    continue L8;
                                  }
                                }
                              } else {
                                this.field_a[var3] = this.field_g[var3];
                                var7 = 0;
                                var4 = var7;
                                var5 = 56;
                                L9: while (true) {
                                  if (8 <= var7) {
                                    var3++;
                                    continue L7;
                                  } else {
                                    this.field_a[var3] = gv.a(this.field_a[var3], hha.field_v[var7][dda.a(255, (int)(this.field_n[dda.a(7, var3 - var7)] >>> var5))]);
                                    var7++;
                                    var5 -= 8;
                                    continue L9;
                                  }
                                }
                              }
                            }
                          } else {
                            this.field_g[var3] = this.field_a[var3];
                            var3++;
                            continue L6;
                          }
                        }
                      } else {
                        this.field_a[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L10: while (true) {
                          if (8 <= var4) {
                            var3++;
                            continue L5;
                          } else {
                            this.field_a[var3] = gv.a(this.field_a[var3], hha.field_v[var4][dda.a(255, (int)(this.field_g[dda.a(var3 - var4, 7)] >>> var5))]);
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
                dupTemp$0 = this.field_h[var2];
                arrayValue$1 = this.field_o[var2];
                this.field_g[var2] = dupTemp$0;
                this.field_n[var2] = gv.a(arrayValue$1, dupTemp$0);
                var2++;
                continue L1;
              }
            }
          } else {
            this.field_o[var2] = gv.a(gv.a(gv.a(gv.a(gv.a(gv.a(gv.a((long)this.field_i[var3] << -796745864, gda.a(255L, (long)this.field_i[var3 - -1]) << -843261328), gda.a(280375465082880L, (long)this.field_i[var3 - -2] << 239192872)), gda.a((long)this.field_i[var3 - -3] << -81887648, 1095216660480L)), gda.a(4278190080L, (long)this.field_i[var3 + 4] << 1676351896)), gda.a(255L, (long)this.field_i[5 + var3]) << -1988894576), gda.a((long)this.field_i[6 + var3] << 334326024, 65280L)), gda.a(255L, (long)this.field_i[7 + var3]));
            var3 += 8;
            var2++;
            continue L0;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        L0: {
          if (param6 == 512) {
            break L0;
          } else {
            field_d = -72;
            break L0;
          }
        }
        L1: {
          L2: {
            if (eo.field_l > param1 - param0) {
              break L2;
            } else {
              if (pw.field_x < param0 + param1) {
                break L2;
              } else {
                if (an.field_q > -param0 + param2) {
                  break L2;
                } else {
                  if (param2 - -param0 <= ha.field_n) {
                    eja.a((byte) -60, param0, param3, param2, param4, param5, param1);
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
            }
          }
          pj.a(param2, param3, 170, param1, param0, param4, param5);
          break L1;
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_m = null;
        field_b = null;
        if (param0 < 103) {
            return;
        }
        field_p = null;
        field_f = null;
        field_j = null;
    }

    ur() {
        this.field_h = new long[8];
        this.field_n = new long[8];
        this.field_o = new long[8];
        this.field_i = new byte[64];
        this.field_g = new long[8];
        this.field_a = new long[8];
        this.field_k = new byte[32];
        this.field_c = 0;
        this.field_l = 0;
    }

    static {
        field_p = "Security";
        field_f = "Every player's actions are plotted at the same time, and then everyone moves at the same time. The number next to your creature indicates when it will move in the grand order of things. <br> Clicking the End Phase Button confirms your actions and ends you turn. Do this now.";
        field_j = "Don't mind";
        field_m = "Congratulations, you have evolved your first creature! You can drag creatures around to place them where you want. <br><col=BBFF00> Next</col>";
    }
}
