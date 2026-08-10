/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi {
    private long[] field_k;
    private long[] field_b;
    private byte[] field_h;
    static int[] field_j;
    private long[] field_f;
    private int field_d;
    private byte[] field_i;
    static int[] field_e;
    private int field_g;
    static int field_a;
    private long[] field_m;
    private long[] field_n;
    static int field_c;
    static pj field_l;

    final void a(byte param0) {
        int var2 = 0;
        int var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        for (var2 = 0; var2 < 32; var2++) {
            this.field_i[var2] = (byte) 0;
        }
        this.field_g = 0;
        this.field_h[0] = (byte)param0;
        this.field_d = 0;
        for (var2 = 0; -9 < (var2 ^ -1); var2++) {
            this.field_k[var2] = 0L;
        }
    }

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    public static void b(int param0) {
        field_j = null;
        if (param0 != 8) {
            hb var2 = (hb) null;
            gi.a(-67, (hb) null);
        }
        field_e = null;
        field_l = null;
    }

    final static sj a(int param0, hb param1) {
        sj stackIn_5_0 = null;
        sj stackIn_26_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        sj var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = param1.f(8, 8);
            if (0 >= var2_int) {
              if (param0 <= -43) {
                L1: {
                  var3 = vg.a(89, param1) ? 1 : 0;
                  var4 = vg.a(91, param1) ? 1 : 0;
                  var5 = new sj();
                  var5.field_e = (short)param1.f(8, 16);
                  var5.field_O = nf.a(false, param1, 16, var5.field_O);
                  var5.field_M = nf.a(false, param1, 16, var5.field_M);
                  var5.field_z = nf.a(false, param1, 16, var5.field_z);
                  var5.field_k = (short)param1.f(8, 16);
                  var5.field_u = nf.a(false, param1, 16, var5.field_u);
                  var5.field_L = nf.a(false, param1, 16, var5.field_L);
                  var5.field_C = nf.a(false, param1, 16, var5.field_C);
                  if (var3 != 0) {
                    var5.field_r = (short)param1.f(8, 16);
                    var5.field_y = nf.a(false, param1, 16, var5.field_y);
                    var5.field_p = nf.a(false, param1, 16, var5.field_p);
                    var5.field_K = nf.a(false, param1, 16, var5.field_K);
                    var5.field_d = nf.a(false, param1, 16, var5.field_d);
                    var5.field_n = nf.a(false, param1, 16, var5.field_n);
                    var5.field_A = nf.a(false, param1, 16, var5.field_A);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (var4 != 0) {
                    param1.f(8, 16);
                    var5.field_m = nf.a(false, param1, 16, var5.field_m);
                    var5.field_h = nf.a(false, param1, 16, var5.field_h);
                    var5.field_a = nf.a(false, param1, 16, var5.field_a);
                    var5.field_I = nf.a(false, param1, 16, var5.field_I);
                    var5.field_l = nf.a(false, param1, 16, var5.field_l);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (!vg.a(74, param1)) {
                    break L3;
                  } else {
                    var5.field_c = nf.a(false, param1, 16, var5.field_c);
                    break L3;
                  }
                }
                L4: {
                  if (!vg.a(75, param1)) {
                    break L4;
                  } else {
                    var5.field_N = kk.a(16, param1, var5.field_N, (byte) 99);
                    var6 = 0;
                    var7 = 0;
                    L5: while (true) {
                      if (var5.field_N.length <= var7) {
                        if (-1 == (var6 ^ -1)) {
                          var5.field_N = null;
                          break L4;
                        } else {
                          var5.field_D = (byte)(var6 + 1);
                          break L4;
                        }
                      } else {
                        if ((var6 ^ -1) > (var5.field_N[var7] & 255 ^ -1)) {
                          var6 = 255 & var5.field_N[var7];
                          var7++;
                          continue L5;
                        } else {
                          var7++;
                          continue L5;
                        }
                      }
                    }
                  }
                }
                stackIn_26_0 = (sj) (var5);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackIn_5_0 = (sj) null;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              throw new IllegalStateException("" + var2_int);
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var2);

            stackIn_29_1 = new StringBuilder().append("gi.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L6;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L6;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_26_0;
        }
    }

    final void a(int param0, byte param1, byte[] param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_h[this.field_d] = (byte)bd.a((int) this.field_h[this.field_d], 128 >>> ch.a(this.field_g, 7));
              this.field_d = this.field_d + 1;
              if (this.field_d > 32) {
                L2: while (true) {
                  if (-65 >= (this.field_d ^ -1)) {
                    this.a(16);
                    this.field_d = 0;
                    break L1;
                  } else {
                    fieldTemp$0 = this.field_d;
                    this.field_d = this.field_d + 1;
                    this.field_h[fieldTemp$0] = (byte) 0;
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            L3: while (true) {
              if (32 <= this.field_d) {
                gl.a(this.field_i, 0, this.field_h, 32, 32);
                this.a(16);
                var4_int = 0;
                if (param1 == -70) {
                  var5 = param0;
                  L4: while (true) {
                    if (-9 >= (var4_int ^ -1)) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var6 = this.field_k[var4_int];
                      param2[var5] = (byte)(int)(var6 >>> 2035938616);
                      param2[1 + var5] = (byte)(int)(var6 >>> -1782182928);
                      param2[2 + var5] = (byte)(int)(var6 >>> 955900712);
                      param2[var5 + 3] = (byte)(int)(var6 >>> 2141970336);
                      param2[4 + var5] = (byte)(int)(var6 >>> -1439427048);
                      param2[var5 - -5] = (byte)(int)(var6 >>> 1621561616);
                      param2[var5 - -6] = (byte)(int)(var6 >>> 1119480776);
                      param2[var5 - -7] = (byte)(int)var6;
                      var4_int++;
                      var5 += 8;
                      continue L4;
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                fieldTemp$1 = this.field_d;
                this.field_d = this.field_d + 1;
                this.field_h[fieldTemp$1] = (byte) 0;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var4);

            stackIn_16_1 = new StringBuilder().append("gi.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(byte param0, String param1, String param2) {
        try {
            ff.a(false, -109, param2, param1);
            if (param0 < 35) {
                hb var4 = (hb) null;
                gi.a(-117, (hb) null);
            }
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "gi.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(long param0, int param1, byte[] param2) {
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
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
        var13 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            var6 = 8 + -((int)param0 & 7) & 7;
            var7 = 7 & this.field_g;
            if (param1 < -51) {
              var9 = param0;
              var11 = 31;
              var12 = 0;
              L1: while (true) {
                if (-1 < (var11 ^ -1)) {
                  L2: while (true) {
                    if (8L >= param0) {
                      L3: {
                        if ((param0 ^ -1L) >= -1L) {
                          var8 = 0;
                          break L3;
                        } else {
                          var8 = param2[var5_int] << var6 & 255;
                          this.field_h[this.field_d] = (byte)bd.a((int) this.field_h[this.field_d], var8 >>> var7);
                          break L3;
                        }
                      }
                      L4: {
                        if ((param0 + (long)var7 ^ -1L) <= -9L) {
                          L5: {
                            this.field_g = this.field_g + (-var7 + 8);
                            param0 = param0 - (long)(8 - var7);
                            this.field_d = this.field_d + 1;
                            if (-513 != (this.field_g ^ -1)) {
                              break L5;
                            } else {
                              this.a(16);
                              this.field_g = 0;
                              this.field_d = 0;
                              break L5;
                            }
                          }
                          this.field_h[this.field_d] = (byte)ch.a(var8 << 8 + -var7, 255);
                          this.field_g = this.field_g + (int)param0;
                          break L4;
                        } else {
                          this.field_g = (int)((long)this.field_g + param0);
                          break L4;
                        }
                      }
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      L6: {
                        var8 = param2[var5_int] << var6 & 255 | (param2[var5_int - -1] & 255) >>> -var6 + 8;
                        if (0 > var8) {
                          break L6;
                        } else {
                          if (var8 >= 256) {
                            break L6;
                          } else {
                            L7: {
                              this.field_h[this.field_d] = (byte)bd.a((int) this.field_h[this.field_d], var8 >>> var7);
                              this.field_d = this.field_d + 1;
                              this.field_g = this.field_g + (8 - var7);
                              if (512 == this.field_g) {
                                this.a(16);
                                this.field_d = 0;
                                this.field_g = 0;
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                            this.field_h[this.field_d] = (byte)ch.a(var8 << -var7 + 8, 255);
                            param0 = param0 - 8L;
                            var5_int++;
                            this.field_g = this.field_g + var7;
                            continue L2;
                          }
                        }
                      }
                      throw new RuntimeException("LOGIC ERROR");
                    }
                  }
                } else {
                  var12 = var12 + ((this.field_i[var11] & 255) - -(255 & (int)var9));
                  this.field_i[var11] = (byte)var12;
                  var12 = var12 >>> 8;
                  var9 = var9 >>> 8;
                  var11--;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var5);

            stackIn_28_1 = new StringBuilder().append("gi.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L8;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L8;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(int param0) {
        long dupTemp$0 = 0L;
        long arrayValue$1 = 0L;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        hb var7;
        int var8;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if ((var2 ^ -1) <= -9) {
            var2 = 0;
            L1: while (true) {
              if ((var2 ^ -1) <= -9) {
                var2 = 1;
                L2: while (true) {
                  if (-11 > (var2 ^ -1)) {
                    var2 = 0;
                    L3: while (true) {
                      if (var2 >= 8) {
                        L4: {
                          if (param0 == 16) {
                            break L4;
                          } else {
                            var7 = (hb) null;
                            gi.a(-34, (hb) null);
                            break L4;
                          }
                        }
                        return;
                      } else {
                        this.field_k[var2] = hd.a(this.field_k[var2], hd.a(this.field_n[var2], this.field_m[var2]));
                        var2++;
                        continue L3;
                      }
                    }
                  } else {
                    var3 = 0;
                    L5: while (true) {
                      if (-9 >= (var3 ^ -1)) {
                        var3 = 0;
                        L6: while (true) {
                          if (-9 >= (var3 ^ -1)) {
                            this.field_f[0] = hd.a(this.field_f[0], nc.field_g[var2]);
                            var3 = 0;
                            L7: while (true) {
                              if (-9 >= (var3 ^ -1)) {
                                var3 = 0;
                                L8: while (true) {
                                  if (-9 >= (var3 ^ -1)) {
                                    var2++;
                                    continue L2;
                                  } else {
                                    this.field_m[var3] = this.field_b[var3];
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
                                  if ((var8 ^ -1) <= -9) {
                                    var3++;
                                    continue L7;
                                  } else {
                                    this.field_b[var3] = hd.a(this.field_b[var3], nc.field_d[var8][ch.a(255, (int)(this.field_m[ch.a(7, var3 - var8)] >>> var5))]);
                                    var8++;
                                    var5 -= 8;
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
                          if (-9 >= (var4 ^ -1)) {
                            var3++;
                            continue L5;
                          } else {
                            this.field_b[var3] = hd.a(this.field_b[var3], nc.field_d[var4][ch.a((int)(this.field_f[ch.a(var3 + -var4, 7)] >>> var5), 255)]);
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
                dupTemp$0 = this.field_k[var2];
                arrayValue$1 = this.field_n[var2];
                this.field_f[var2] = dupTemp$0;
                this.field_m[var2] = hd.a(arrayValue$1, dupTemp$0);
                var2++;
                continue L1;
              }
            }
          } else {
            this.field_n[var2] = hd.a(hd.a(hd.a(sk.a((long)this.field_h[var3 - -5], 255L) << -1933703344, hd.a(hd.a(sk.a((long)this.field_h[3 + var3] << -1861031328, 1095216660480L), hd.a(hd.a(sk.a((long)this.field_h[1 + var3] << 804360944, 71776119061217280L), (long)this.field_h[var3] << 744230520), sk.a((long)this.field_h[var3 + 2] << 867267688, 280375465082880L))), sk.a((long)this.field_h[var3 + 4], 255L) << 925766488)), sk.a((long)this.field_h[var3 - -6], 255L) << 1475049800), sk.a((long)this.field_h[var3 + 7], 255L));
            var3 += 8;
            var2++;
            continue L0;
          }
        }
    }

    gi() {
        this.field_k = new long[8];
        this.field_f = new long[8];
        this.field_i = new byte[32];
        this.field_b = new long[8];
        this.field_d = 0;
        this.field_n = new long[8];
        this.field_h = new byte[64];
        this.field_m = new long[8];
        this.field_g = 0;
    }

    static {
        field_j = new int[8192];
        field_l = new pj();
    }
}
