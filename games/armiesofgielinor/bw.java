/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bw {
    private long[] field_l;
    static int[][] field_m;
    private int field_c;
    private long[] field_k;
    private int field_d;
    private byte[] field_b;
    static int[] field_f;
    private long[] field_j;
    private long[] field_a;
    static je field_h;
    static boolean field_g;
    private long[] field_e;
    private byte[] field_i;

    final static void d(int param0) {
        int var2;
        L0: {
          var2 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (rd.field_j.field_u) {
            if (0 == (1 << rd.field_j.field_q & rd.field_j.field_xb.field_i)) {
              if (-1 != (rd.field_j.field_xb.field_i ^ -1)) {
                il.field_t[12] = id.field_c;
                break L0;
              } else {
                if ((1 << rd.field_j.field_q | rd.field_j.field_hb) != (1 << rd.field_j.field_xb.field_W) + -1) {
                  il.field_t[12] = fa.field_e;
                  break L0;
                } else {
                  il.field_t[12] = ml.field_Nb;
                  break L0;
                }
              }
            } else {
              il.field_t[12] = ti.field_a;
              break L0;
            }
          } else {
            if (0 != (1 << rd.field_j.field_q & rd.field_j.field_xb.field_i)) {
              il.field_t[12] = is.field_c;
              break L0;
            } else {
              if (-1 != (rd.field_j.field_xb.field_i ^ -1)) {
                il.field_t[12] = lk.field_s;
                break L0;
              } else {
                if (-1 + (1 << rd.field_j.field_xb.field_W) != (1 << rd.field_j.field_q | rd.field_j.field_hb)) {
                  il.field_t[12] = db.field_h;
                  break L0;
                } else {
                  il.field_t[12] = ji.field_b;
                  break L0;
                }
              }
            }
          }
        }
        L1: {
          if (param0 == 7242) {
            break L1;
          } else {
            bw.a(119, -40, (byte) -61);
            break L1;
          }
        }
    }

    final void a(byte param0, long param1, byte[] param2) {
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
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
        var13 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = 0;
              var6 = 8 + -((int)param1 & 7) & 7;
              var7 = 7 & this.field_c;
              var9 = param1;
              if (param0 <= 0) {
                break L1;
              } else {
                bw.a(-47);
                break L1;
              }
            }
            var11 = 31;
            var12 = 0;
            L2: while (true) {
              if (-1 < (var11 ^ -1)) {
                L3: while (true) {
                  if (param1 <= 8L) {
                    L4: {
                      if (-1L <= (param1 ^ -1L)) {
                        var8 = 0;
                        break L4;
                      } else {
                        var8 = param2[var5_int] << var6 & 255;
                        this.field_i[this.field_d] = (byte)oe.c((int) this.field_i[this.field_d], var8 >>> var7);
                        break L4;
                      }
                    }
                    L5: {
                      if (-9L >= (param1 + (long)var7 ^ -1L)) {
                        L6: {
                          this.field_c = this.field_c + (8 - var7);
                          param1 = param1 - (long)(8 + -var7);
                          this.field_d = this.field_d + 1;
                          if (-513 != (this.field_c ^ -1)) {
                            break L6;
                          } else {
                            this.c(-11);
                            this.field_c = 0;
                            this.field_d = 0;
                            break L6;
                          }
                        }
                        this.field_i[this.field_d] = (byte)rn.a(255, var8 << -var7 + 8);
                        this.field_c = this.field_c + (int)param1;
                        break L5;
                      } else {
                        this.field_c = (int)((long)this.field_c + param1);
                        break L5;
                      }
                    }
                    break L0;
                  } else {
                    L7: {
                      var8 = param2[var5_int] << var6 & 255 | (255 & param2[1 + var5_int]) >>> -var6 + 8;
                      if (0 > var8) {
                        break L7;
                      } else {
                        if ((var8 ^ -1) > -257) {
                          L8: {
                            this.field_i[this.field_d] = (byte)oe.c((int) this.field_i[this.field_d], var8 >>> var7);
                            this.field_d = this.field_d + 1;
                            this.field_c = this.field_c + (8 - var7);
                            if (-513 != (this.field_c ^ -1)) {
                              break L8;
                            } else {
                              this.c(-11);
                              this.field_c = 0;
                              this.field_d = 0;
                              break L8;
                            }
                          }
                          this.field_i[this.field_d] = (byte)rn.a(255, var8 << -var7 + 8);
                          var5_int++;
                          this.field_c = this.field_c + var7;
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
                var12 = var12 + ((this.field_b[var11] & 255) - -(255 & (int)var9));
                this.field_b[var11] = (byte)var12;
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
            stackIn_27_0 = (RuntimeException) (var5);

            stackIn_27_1 = new StringBuilder().append("bw.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L9;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L9;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        aj var4 = null;
        wj var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var4 = (aj) ((Object) oj.field_r.e((byte) 110));
            L1: while (true) {
              if (var4 == null) {
                var5 = (wj) ((Object) lf.field_c.e((byte) 117));
                L2: while (true) {
                  if (var5 == null) {
                    L3: {
                      if (param0 >= 120) {
                        break L3;
                      } else {
                        field_m = (int[][]) null;
                        break L3;
                      }
                    }
                    break L0;
                  } else {
                    gn.a(param1, var5, 0);
                    var5 = (wj) ((Object) lf.field_c.a((byte) 123));
                    continue L2;
                  }
                }
              } else {
                wr.a((byte) -71, var4, param1);
                var4 = (aj) ((Object) oj.field_r.a((byte) 123));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "bw.G(" + param0 + ',' + param1 + ')');
        }
    }

    final void b(int param0) {
        int var2 = 0;
        int var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        for (var2 = 0; 32 > var2; var2++) {
            this.field_b[var2] = (byte) 0;
        }
        this.field_c = 0;
        this.field_i[0] = (byte) 0;
        if (param0 != 200) {
            this.field_a = (long[]) null;
        }
        this.field_d = 0;
        for (var2 = 0; (var2 ^ -1) > -9; var2++) {
            this.field_l[var2] = 0L;
        }
    }

    final static void a(int param0, int param1, byte param2) {
        au var6 = null;
        au var7 = null;
        bv var4 = null;
        if (!(param1 == oo.field_a)) {
            var6 = (au) ((Object) qm.field_J.a((byte) -27, (long)oo.field_a));
            var7 = var6;
            oo.field_a = param1;
            if (var7 != null) {
                var7.field_jc = null;
            }
            var4 = vl.field_n;
            var4.h(param2 ^ -32211, param0);
            var4.b(1, 3);
            var4.b(1, 11);
            var4.b(true, param1);
        }
        if (param2 != -116) {
            field_m = (int[][]) null;
        }
    }

    public static void a(int param0) {
        field_f = null;
        if (param0 != -28911) {
            return;
        }
        field_m = (int[][]) null;
        field_h = null;
    }

    private final void c(int param0) {
        long dupTemp$0 = 0L;
        long arrayValue$1 = 0L;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
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
                      if (param0 == -11) {
                        break L3;
                      } else {
                        this.b(65);
                        break L3;
                      }
                    }
                    var2 = 0;
                    L4: while (true) {
                      if (-9 >= (var2 ^ -1)) {
                        return;
                      } else {
                        this.field_l[var2] = ue.a(this.field_l[var2], ue.a(this.field_a[var2], this.field_k[var2]));
                        var2++;
                        continue L4;
                      }
                    }
                  } else {
                    var3 = 0;
                    L5: while (true) {
                      if (8 <= var3) {
                        var3 = 0;
                        L6: while (true) {
                          if (-9 >= (var3 ^ -1)) {
                            this.field_j[0] = ue.a(this.field_j[0], sa.field_h[var2]);
                            var3 = 0;
                            L7: while (true) {
                              if ((var3 ^ -1) <= -9) {
                                var3 = 0;
                                L8: while (true) {
                                  if (var3 >= 8) {
                                    var2++;
                                    continue L2;
                                  } else {
                                    this.field_k[var3] = this.field_e[var3];
                                    var3++;
                                    continue L8;
                                  }
                                }
                              } else {
                                this.field_e[var3] = this.field_j[var3];
                                var7 = 0;
                                var4 = var7;
                                var5 = 56;
                                L9: while (true) {
                                  if ((var7 ^ -1) <= -9) {
                                    var3++;
                                    continue L7;
                                  } else {
                                    this.field_e[var3] = ue.a(this.field_e[var3], sa.field_g[var7][rn.a((int)(this.field_k[rn.a(var3 - var7, 7)] >>> var5), 255)]);
                                    var5 -= 8;
                                    var7++;
                                    continue L9;
                                  }
                                }
                              }
                            }
                          } else {
                            this.field_j[var3] = this.field_e[var3];
                            var3++;
                            continue L6;
                          }
                        }
                      } else {
                        this.field_e[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L10: while (true) {
                          if (-9 >= (var4 ^ -1)) {
                            var3++;
                            continue L5;
                          } else {
                            this.field_e[var3] = ue.a(this.field_e[var3], sa.field_g[var4][rn.a(255, (int)(this.field_j[rn.a(7, var3 + -var4)] >>> var5))]);
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
                dupTemp$0 = this.field_l[var2];
                arrayValue$1 = this.field_a[var2];
                this.field_j[var2] = dupTemp$0;
                this.field_k[var2] = ue.a(arrayValue$1, dupTemp$0);
                var2++;
                continue L1;
              }
            }
          } else {
            this.field_a[var2] = ue.a(we.a((long)this.field_i[7 + var3], 255L), ue.a(we.a((long)this.field_i[var3 + 6], 255L) << 1481208776, ue.a(ue.a(ue.a(ue.a(ue.a((long)this.field_i[var3] << -637116744, we.a((long)this.field_i[var3 - -1] << 1579974512, 71776119061217280L)), we.a((long)this.field_i[var3 + 2], 255L) << 1120430504), we.a((long)this.field_i[3 + var3], 255L) << -486241888), we.a(255L, (long)this.field_i[4 + var3]) << 1858629272), we.a((long)this.field_i[var3 + 5], 255L) << -73153968)));
            var2++;
            var3 += 8;
            continue L0;
          }
        }
    }

    bw() {
        this.field_c = 0;
        this.field_b = new byte[32];
        this.field_l = new long[8];
        this.field_d = 0;
        this.field_a = new long[8];
        this.field_j = new long[8];
        this.field_k = new long[8];
        this.field_e = new long[8];
        this.field_i = new byte[64];
    }

    final void a(byte[] param0, int param1, boolean param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_i[this.field_d] = (byte)oe.c((int) this.field_i[this.field_d], 128 >>> rn.a(this.field_c, 7));
              this.field_d = this.field_d + 1;
              if (32 < this.field_d) {
                L2: while (true) {
                  if (64 <= this.field_d) {
                    this.c(-11);
                    this.field_d = 0;
                    break L1;
                  } else {
                    fieldTemp$0 = this.field_d;
                    this.field_d = this.field_d + 1;
                    this.field_i[fieldTemp$0] = (byte) 0;
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            L3: while (true) {
              if (this.field_d >= 32) {
                L4: {
                  if (param2) {
                    break L4;
                  } else {
                    bw.a(54, 79);
                    break L4;
                  }
                }
                vm.a(this.field_b, 0, this.field_i, 32, 32);
                this.c(-11);
                var4_int = 0;
                var5 = param1;
                L5: while (true) {
                  if ((var4_int ^ -1) <= -9) {
                    break L0;
                  } else {
                    var6 = this.field_l[var4_int];
                    param0[var5] = (byte)(int)(var6 >>> 844136504);
                    param0[1 + var5] = (byte)(int)(var6 >>> 1162097584);
                    param0[var5 + 2] = (byte)(int)(var6 >>> 570668392);
                    param0[var5 + 3] = (byte)(int)(var6 >>> 1366312288);
                    param0[4 + var5] = (byte)(int)(var6 >>> 265155352);
                    param0[var5 - -5] = (byte)(int)(var6 >>> 1253311568);
                    param0[6 + var5] = (byte)(int)(var6 >>> 871043208);
                    param0[var5 + 7] = (byte)(int)var6;
                    var5 += 8;
                    var4_int++;
                    continue L5;
                  }
                }
              } else {
                fieldTemp$1 = this.field_d;
                this.field_d = this.field_d + 1;
                this.field_i[fieldTemp$1] = (byte) 0;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var4);

            stackIn_16_1 = new StringBuilder().append("bw.E(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L6;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_f = new int[]{0, 108, 28, 12, 110, 69};
        field_m = new int[][]{new int[]{0, -1, 1, 6, 5, 5, 1, 1, 50, 0, 512, 0, 19}, new int[]{4, -1, 2, 6, 20, 7, 1, 1, 400, 0, 0, 0, -1}, new int[]{1, -1, 2, 4, 20, 3, 1, 1, 250, 0, 0, 0, -1}, new int[]{2, -1, 3, 6, 7, 3, 2, 3, 125, 0, 512, 0, 19}, new int[]{4, -1, 5, 6, 40, 7, 1, 2, 750, 2, 0, 0, 11}, new int[]{1, -1, 4, 4, 35, 3, 1, 1, 300, 1, 0, 0, -1}, new int[]{1, -1, 4, 6, 30, 3, 1, 1, 400, 0, 6144, 0, 21}, new int[]{5, -1, 5, 7, 5, 3, 1, 1, 200, 0, 1152, 0, -1}, new int[]{1, 0, 1, 6, 10, 5, 1, 1, 100, 0, 0, 0, -1}, new int[]{4, 0, 1, 6, 5, 7, 1, 1, 100, 0, 0, 0, -1}, new int[]{5, 0, 1, 6, 10, 3, 1, 1, 150, 0, 38, 0, 0}, new int[]{3, 0, 3, 3, 20, 3, 3, 5, 250, 0, 0, 0, -1}, new int[]{1, 0, 2, 5, 25, 3, 1, 1, 250, 0, 0, 0, -1}, new int[]{0, 0, 3, 8, 30, 3, 1, 1, 350, 0, 0, 0, -1}, new int[]{2, 0, 4, 9, 25, 5, 1, 3, 300, 0, 0, 3, -1}, new int[]{1, 0, 3, 4, 40, 3, 1, 1, 350, 0, 0, 3, -1}, new int[]{2, 0, 2, 6, 20, 5, 2, 3, 200, 0, 0, 2, -1}, new int[]{5, 0, 4, 6, 20, 3, 1, 1, 300, 0, 1030, 4, 22}, new int[]{4, 0, 5, 8, 40, 7, 1, 3, 800, 1, 0, 5, 11}, new int[]{1, 1, 1, 6, 10, 5, 1, 1, 100, 0, 0, 0, -1}, new int[]{0, 1, 1, 5, 15, 1, 1, 1, 100, 0, 256, 0, 18}, new int[]{5, 1, 1, 6, 10, 3, 1, 1, 150, 0, 8, 0, 2}, new int[]{3, 1, 3, 3, 20, 3, 3, 5, 250, 0, 0, 0, -1}, new int[]{1, 1, 2, 5, 25, 3, 1, 1, 250, 0, 0, 0, -1}, new int[]{1, 1, 4, 4, 50, 3, 1, 1, 450, 1, 0, 0, -1}, new int[]{2, 1, 2, 6, 20, 5, 2, 3, 200, 0, 0, 2, -1}, new int[]{0, 1, 3, 8, 30, 3, 1, 1, 350, 0, 0, 3, -1}, new int[]{0, 1, 3, 3, 10, 1, 1, 1, 100, 0, 4097, 3, 9}, new int[]{4, 1, 4, 6, 30, 7, 1, 3, 600, 0, 0, 4, 11}, new int[]{7, 1, 5, 3, 50, 3, 1, 1, 750, 0, 0, 5, 13}, new int[]{0, 2, 2, 10, 15, 5, 1, 1, 200, 0, 0, 0, -1}, new int[]{0, 2, 1, 8, 10, 5, 1, 1, 150, 0, 0, 0, -1}, new int[]{5, 2, 1, 6, 10, 3, 1, 1, 150, 0, 20, 0, 1}, new int[]{1, 2, 2, 4, 20, 3, 1, 1, 175, 0, 0, 0, -1}, new int[]{1, 2, 3, 4, 10, 3, 1, 1, 250, 0, 1024, 3, -1}, new int[]{1, 2, 4, 4, 40, 5, 1, 1, 400, 1, 0, 0, -1}, new int[]{1, 2, 2, 6, 25, 5, 1, 1, 250, 0, 0, 2, -1}, new int[]{1, 2, 4, 3, 45, 5, 1, 1, 400, 1, 0, 4, -1}, new int[]{4, 2, 3, 10, 20, 7, 1, 1, 450, 0, 0, 0, -1}, new int[]{6, 2, 4, 1, 5, 1, 0, 0, 100, 0, 1025, 4, 8}, new int[]{7, 2, 5, 4, 45, 3, 1, 1, 700, 0, 1, 5, 14}, new int[]{4, 3, 2, 10, 5, 7, 1, 1, 150, 0, 0, 0, -1}, new int[]{0, 3, 1, 5, 15, 3, 1, 1, 150, 0, 0, 0, -1}, new int[]{5, 3, 3, 6, 20, 5, 1, 1, 300, 0, 0, 12, 5}, new int[]{1, 3, 3, 6, 30, 5, 1, 1, 300, 0, 0, 0, -1}, new int[]{0, 3, 3, 6, 8, 3, 1, 1, 50, 0, 0, 12, -1}, new int[]{0, 3, 2, 8, 20, 5, 1, 1, 250, 0, 0, 0, -1}, new int[]{1, 3, 2, 6, 25, 5, 1, 1, 250, 0, 0, 0, -1}, new int[]{2, 3, 2, 6, 25, 5, 2, 4, 300, 0, 0, 8, -1}, new int[]{1, 3, 4, 6, 40, 5, 1, 1, 400, 0, 0, 16, -1}, new int[]{0, 3, 4, 8, 35, 5, 1, 1, 400, 0, 0, 0, -1}, new int[]{1, 3, 5, 6, 25, 3, 1, 1, 750, 0, 1, 20, 7}, new int[]{1, 4, 1, 5, 5, 5, 1, 1, 50, 0, 0, 0, -1}, new int[]{5, 4, 1, 5, 10, 5, 1, 1, 150, 0, 0, 0, 3}, new int[]{1, 4, 1, 3, 20, 3, 1, 1, 175, 1, 0, 0, -1}, new int[]{1, 4, 2, 4, 25, 3, 1, 1, 225, 1, 0, 0, -1}, new int[]{1, 4, 4, 4, 30, 3, 1, 1, 300, 1, 4096, 16, 20}, new int[]{1, 4, 2, 6, 15, 4, 1, 1, 150, 0, 2048, 12, 10}, new int[]{5, 4, 3, 3, 20, 3, 1, 1, 300, 1, 0, 12, 16}, new int[]{1, 4, 3, 3, 40, 5, 1, 1, 500, 1, 0, 0, 4}, new int[]{1, 4, 4, 5, 30, 5, 1, 1, 275, 0, 0, 0, -1}, new int[]{1, 4, 3, 7, 20, 3, 1, 1, 200, 1, 0, 12, -1}, new int[]{7, 4, 5, 3, 55, 5, 1, 1, 800, 2, 0, 20, 12}, new int[]{5, 5, 4, 3, 50, 4, 1, 1, 600, 2, 0, 16, 17}, new int[]{0, 5, 1, 6, 15, 3, 1, 1, 150, 0, 0, 0, -1}, new int[]{1, 5, 3, 3, 35, 2, 1, 1, 300, 0, 320, 0, 18}, new int[]{4, 5, 2, 7, 10, 7, 1, 1, 200, 0, 65, 8, 6}, new int[]{2, 5, 2, 6, 20, 7, 2, 3, 200, 0, 0, 0, -1}, new int[]{1, 5, 1, 6, 10, 3, 1, 1, 100, 0, 0, 0, -1}, new int[]{1, 5, 2, 6, 25, 5, 1, 1, 250, 0, 0, 8, -1}, new int[]{0, 5, 1, 3, 20, 3, 1, 1, 200, 0, 4096, 0, 20}, new int[]{3, 5, 3, 4, 30, 5, 3, 5, 450, 0, 64, 12, 6}, new int[]{5, 5, 4, 6, 25, 4, 1, 1, 350, 1, 1, 0, -1}, new int[]{7, 5, 5, 3, 45, 5, 1, 1, 700, 1, 1, 20, 15}, new int[]{4, -1, 5, 6, 99, 7, 1, 3, 2000, 2, 0, 0, 11}, new int[]{1, 2, 3, 4, 20, 3, 2, 7, 250, 0, 1024, 3, -1}, new int[]{-1}, new int[]{-1}, new int[]{-1}, new int[]{-1}, new int[]{-1}, new int[]{4, -1, 5, 6, 40, 7, 1, 2, 750, 2, 0, 0, 11}, new int[]{3, 0, 3, 3, 30, 3, 3, 5, 250, 2, 0, 0, -1}, new int[]{1, 2, 2, 6, 40, 5, 1, 1, 250, 2, 0, 2, -1}, new int[]{1, 0, 2, 6, 45, 5, 1, 1, 250, 2, 0, 0, -1}, new int[]{2, 0, 2, 6, 30, 5, 2, 3, 200, 2, 0, 2, -1}, new int[]{1, 2, 2, 6, 45, 5, 1, 1, 250, 2, 0, 2, -1}, new int[]{1, 0, 4, 5, 30, 5, 1, 1, 275, 2, 0, 0, -1}, new int[]{5, 1, 1, 6, 30, 3, 1, 1, 150, 2, 8, 0, 2}};
    }
}
