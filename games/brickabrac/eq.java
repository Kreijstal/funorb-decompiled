/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eq {
    static String field_b;
    private int field_c;
    private byte[] field_h;
    private long[] field_k;
    private long[] field_l;
    private long[] field_e;
    private long[] field_f;
    private byte[] field_d;
    private int field_j;
    private long[] field_a;
    static String field_i;
    static wh field_g;
    static mk field_m;

    final static void a(int param0) {
        cr.f((byte) -45);
        if (param0 != 7) {
            field_g = (wh) null;
        }
        lq.d(125);
        no.field_p = null;
        rd.a(param0 + -8);
    }

    final void b(byte param0) {
        int var2 = 0;
        int var3 = BrickABrac.field_J ? 1 : 0;
        for (var2 = 0; 32 > var2; var2++) {
            this.field_d[var2] = (byte) 0;
        }
        if (param0 != 99) {
            this.a((byte[]) null, -112, 22L);
        }
        this.field_j = 0;
        this.field_h[0] = (byte) 0;
        this.field_c = 0;
        for (var2 = 0; 8 > var2; var2++) {
            this.field_a[var2] = 0L;
        }
    }

    final static String c(byte param0) {
        String discarded$0 = null;
        int var2 = 0;
        String var7 = null;
        int var3 = 0;
        int var4 = 0;
        String var8 = null;
        int var5 = BrickABrac.field_J ? 1 : 0;
        if (param0 >= -58) {
            discarded$0 = eq.c((byte) -29);
        }
        String var6 = "(" + r.field_z + " " + we.field_a + " " + mh.field_gb + ") " + si.field_a;
        String var1 = var6;
        if ((ga.field_j ^ -1) >= -1) {
        } else {
            var1 = var6 + ":";
            for (var2 = 0; var2 < ga.field_j; var2++) {
                var7 = var1 + ' ';
                var3 = 255 & jl.field_e.field_k[var2];
                var4 = var3 >> -563608220;
                var3 = var3 & 15;
                if ((var4 ^ -1) > -11) {
                    var4 += 48;
                } else {
                    var4 += 55;
                }
                if (10 <= var3) {
                    var3 += 55;
                } else {
                    var3 += 48;
                }
                var8 = var7 + (char)var4;
                var1 = var8 + (char)var3;
            }
        }
        return var1;
    }

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var6 = BrickABrac.field_J ? 1 : 0;
          var2 = 0;
          var3 = 0;
          if (param0 > 19) {
            break L0;
          } else {
            this.field_l = (long[]) null;
            break L0;
          }
        }
        L1: while (true) {
          if ((var2 ^ -1) <= -9) {
            var2 = 0;
            L2: while (true) {
              if (var2 >= 8) {
                var2 = 1;
                L3: while (true) {
                  if (-11 > (var2 ^ -1)) {
                    var2 = 0;
                    L4: while (true) {
                      if ((var2 ^ -1) <= -9) {
                        return;
                      } else {
                        this.field_a[var2] = qf.a(this.field_a[var2], qf.a(this.field_k[var2], this.field_e[var2]));
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
                            this.field_f[0] = qf.a(this.field_f[0], oa.field_Xb[var2]);
                            var3 = 0;
                            L7: while (true) {
                              if ((var3 ^ -1) <= -9) {
                                var3 = 0;
                                L8: while (true) {
                                  if ((var3 ^ -1) <= -9) {
                                    var2++;
                                    continue L3;
                                  } else {
                                    this.field_k[var3] = this.field_l[var3];
                                    var3++;
                                    continue L8;
                                  }
                                }
                              } else {
                                this.field_l[var3] = this.field_f[var3];
                                var7 = 0;
                                var4 = var7;
                                var5 = 56;
                                L9: while (true) {
                                  if (var7 >= 8) {
                                    var3++;
                                    continue L7;
                                  } else {
                                    this.field_l[var3] = qf.a(this.field_l[var3], oa.field_Wb[var7][ik.a(255, (int)(this.field_k[ik.a(var3 - var7, 7)] >>> var5))]);
                                    var7++;
                                    var5 -= 8;
                                    continue L9;
                                  }
                                }
                              }
                            }
                          } else {
                            this.field_f[var3] = this.field_l[var3];
                            var3++;
                            continue L6;
                          }
                        }
                      } else {
                        this.field_l[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L10: while (true) {
                          if (8 <= var4) {
                            var3++;
                            continue L5;
                          } else {
                            this.field_l[var3] = qf.a(this.field_l[var3], oa.field_Wb[var4][ik.a((int)(this.field_f[ik.a(var3 - var4, 7)] >>> var5), 255)]);
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
                this.field_f[var2] = this.field_a[var2];
                this.field_k[var2] = qf.a(this.field_e[var2], this.field_a[var2]);
                var2++;
                continue L2;
              }
            }
          } else {
            this.field_e[var2] = qf.a(qf.a(qf.a(qf.a(qf.a(ch.a(255L, (long)this.field_h[var3 + 3]) << -1263331040, qf.a(ch.a((long)this.field_h[2 + var3], 255L) << 1135616744, qf.a(ch.a((long)this.field_h[1 + var3], 255L) << -1839878480, (long)this.field_h[var3] << 1037214200))), ch.a((long)this.field_h[var3 - -4], 255L) << 54275672), ch.a((long)this.field_h[var3 - -5], 255L) << -1424066864), ch.a(65280L, (long)this.field_h[6 + var3] << 1385078664)), ch.a((long)this.field_h[var3 + 7], 255L));
            var2++;
            var3 += 8;
            continue L1;
          }
        }
    }

    final void a(byte[] param0, int param1, int param2) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        long var7 = 0L;
        int var9 = 0;
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
        var9 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_h[this.field_c] = (byte)ud.d((int) this.field_h[this.field_c], 128 >>> ik.a(7, this.field_j));
              var4_int = -48 % ((-28 - param1) / 38);
              this.field_c = this.field_c + 1;
              if (-33 <= (this.field_c ^ -1)) {
                break L1;
              } else {
                L2: while (true) {
                  if ((this.field_c ^ -1) <= -65) {
                    this.a((byte) 109);
                    this.field_c = 0;
                    break L1;
                  } else {
                    fieldTemp$2 = this.field_c;
                    this.field_c = this.field_c + 1;
                    this.field_h[fieldTemp$2] = (byte) 0;
                    continue L2;
                  }
                }
              }
            }
            L3: while (true) {
              if (-33 >= (this.field_c ^ -1)) {
                pm.a(this.field_d, 0, this.field_h, 32, 32);
                this.a((byte) 47);
                var5 = 0;
                var6 = param2;
                L4: while (true) {
                  if (-9 >= (var5 ^ -1)) {
                    break L0;
                  } else {
                    var7 = this.field_a[var5];
                    param0[var6] = (byte)(int)(var7 >>> 566537784);
                    param0[var6 + 1] = (byte)(int)(var7 >>> -536603984);
                    param0[2 + var6] = (byte)(int)(var7 >>> -1370981848);
                    param0[3 + var6] = (byte)(int)(var7 >>> -1740851424);
                    param0[var6 + 4] = (byte)(int)(var7 >>> -1122408);
                    param0[5 + var6] = (byte)(int)(var7 >>> 1753603856);
                    param0[var6 - -6] = (byte)(int)(var7 >>> -1581657080);
                    param0[7 + var6] = (byte)(int)var7;
                    var5++;
                    var6 += 8;
                    continue L4;
                  }
                }
              } else {
                fieldTemp$3 = this.field_c;
                this.field_c = this.field_c + 1;
                this.field_h[fieldTemp$3] = (byte) 0;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var4);
            stackOut_11_1 = new StringBuilder().append("eq.E(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(byte[] param0, int param1, long param2) {
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
        var13 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = 0;
              var6 = 8 - ((int)param2 & 7) & 7;
              var7 = this.field_j & 7;
              if (param1 == 540) {
                break L1;
              } else {
                this.a((byte) -98);
                break L1;
              }
            }
            var9 = param2;
            var11 = 31;
            var12 = 0;
            L2: while (true) {
              if (0 > var11) {
                L3: while (true) {
                  if (8L >= param2) {
                    L4: {
                      if ((param2 ^ -1L) >= -1L) {
                        var8 = 0;
                        break L4;
                      } else {
                        var8 = 255 & param0[var5_int] << var6;
                        this.field_h[this.field_c] = (byte)ud.d((int) this.field_h[this.field_c], var8 >>> var7);
                        break L4;
                      }
                    }
                    L5: {
                      if ((long)var7 - -param2 >= 8L) {
                        L6: {
                          param2 = param2 - (long)(8 - var7);
                          this.field_c = this.field_c + 1;
                          this.field_j = this.field_j + (8 + -var7);
                          if (this.field_j != 512) {
                            break L6;
                          } else {
                            this.a((byte) 41);
                            this.field_j = 0;
                            this.field_c = 0;
                            break L6;
                          }
                        }
                        this.field_h[this.field_c] = (byte)ik.a(255, var8 << 8 + -var7);
                        this.field_j = this.field_j + (int)param2;
                        break L5;
                      } else {
                        this.field_j = (int)((long)this.field_j + param2);
                        break L5;
                      }
                    }
                    break L0;
                  } else {
                    L7: {
                      var8 = param0[var5_int] << var6 & 255 | (param0[var5_int - -1] & 255) >>> -var6 + 8;
                      if (-1 < (var8 ^ -1)) {
                        break L7;
                      } else {
                        if (256 > var8) {
                          L8: {
                            this.field_h[this.field_c] = (byte)ud.d((int) this.field_h[this.field_c], var8 >>> var7);
                            this.field_c = this.field_c + 1;
                            this.field_j = this.field_j + (-var7 + 8);
                            if ((this.field_j ^ -1) == -513) {
                              this.a((byte) 38);
                              this.field_j = 0;
                              this.field_c = 0;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          this.field_h[this.field_c] = (byte)ik.a(255, var8 << 8 + -var7);
                          this.field_j = this.field_j + var7;
                          var5_int++;
                          param2 = param2 - 8L;
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
                var12 = var12 + ((255 & (int)var9) + (255 & this.field_d[var11]));
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
            stackOut_24_0 = (RuntimeException) (var5);
            stackOut_24_1 = new StringBuilder().append("eq.D(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L9;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L9;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void b(int param0) {
        field_m = null;
        field_b = null;
        field_g = null;
        field_i = null;
        if (param0 != -1) {
            field_m = (mk) null;
        }
    }

    eq() {
        this.field_e = new long[8];
        this.field_h = new byte[64];
        this.field_d = new byte[32];
        this.field_f = new long[8];
        this.field_l = new long[8];
        this.field_k = new long[8];
        this.field_c = 0;
        this.field_j = 0;
        this.field_a = new long[8];
    }

    static {
        field_b = "The game options are not all set.";
        field_i = "This password contains repeated characters, and would be easy to guess";
    }
}
