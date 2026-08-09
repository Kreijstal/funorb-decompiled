/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class np {
    private int field_b;
    private long[] field_k;
    private long[] field_a;
    private long[] field_i;
    private long[] field_j;
    private byte[] field_e;
    private int field_f;
    static ck field_h;
    private long[] field_d;
    private byte[] field_g;
    static char field_c;

    final void b(int param0) {
        int var2 = 0;
        int var3 = Sumoblitz.field_L ? 1 : 0;
        for (var2 = 0; -33 < (var2 ^ -1); var2++) {
            this.field_g[var2] = (byte) 0;
        }
        this.field_e[0] = (byte) 0;
        this.field_b = 0;
        if (param0 != -9) {
            return;
        }
        this.field_f = 0;
        for (var2 = 0; (var2 ^ -1) > -9; var2++) {
            this.field_j[var2] = 0L;
        }
    }

    public static void a(byte param0) {
        field_h = null;
        if (param0 != -58) {
            field_c = '￲';
        }
    }

    final void a(int param0, byte[] param1, int param2) {
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
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_e[this.field_f] = (byte)ic.a((int) this.field_e[this.field_f], 128 >>> eb.a(7, this.field_b));
              this.field_f = this.field_f + 1;
              if ((this.field_f ^ -1) < -33) {
                L2: while (true) {
                  if (this.field_f >= 64) {
                    this.b((byte) 99);
                    this.field_f = 0;
                    break L1;
                  } else {
                    fieldTemp$0 = this.field_f;
                    this.field_f = this.field_f + 1;
                    this.field_e[fieldTemp$0] = (byte) 0;
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            L3: while (true) {
              if ((this.field_f ^ -1) <= -33) {
                if (param2 < -2) {
                  la.a(this.field_g, 0, this.field_e, 32, 32);
                  this.b((byte) 99);
                  var4_int = 0;
                  var5 = param0;
                  L4: while (true) {
                    if (-9 >= (var4_int ^ -1)) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var6 = this.field_j[var4_int];
                      param1[var5] = (byte)(int)(var6 >>> 1449837624);
                      param1[1 + var5] = (byte)(int)(var6 >>> 1194434160);
                      param1[var5 - -2] = (byte)(int)(var6 >>> 1672497704);
                      param1[3 + var5] = (byte)(int)(var6 >>> -548643744);
                      param1[var5 - -4] = (byte)(int)(var6 >>> -1921042472);
                      param1[5 + var5] = (byte)(int)(var6 >>> 1046807184);
                      param1[var5 - -6] = (byte)(int)(var6 >>> 1050795400);
                      param1[var5 - -7] = (byte)(int)var6;
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
                fieldTemp$1 = this.field_f;
                this.field_f = this.field_f + 1;
                this.field_e[fieldTemp$1] = (byte) 0;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var4);

            stackIn_16_1 = new StringBuilder().append("np.D(").append(param0).append(',');

            if (param1 == null) {
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
          throw qo.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void b(byte param0) {
        long dupTemp$0 = 0L;
        long arrayValue$1 = 0L;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        var6 = Sumoblitz.field_L ? 1 : 0;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if (-9 >= (var2 ^ -1)) {
            var2 = 0;
            L1: while (true) {
              if ((var2 ^ -1) <= -9) {
                var2 = 1;
                L2: while (true) {
                  if (var2 > 10) {
                    L3: {
                      if (param0 == 99) {
                        break L3;
                      } else {
                        np.a(-88);
                        break L3;
                      }
                    }
                    var2 = 0;
                    L4: while (true) {
                      if (-9 >= (var2 ^ -1)) {
                        return;
                      } else {
                        this.field_j[var2] = bi.a(this.field_j[var2], bi.a(this.field_d[var2], this.field_k[var2]));
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
                          if (8 <= var3) {
                            this.field_i[0] = bi.a(this.field_i[0], ll.field_b[var2]);
                            var3 = 0;
                            L7: while (true) {
                              if ((var3 ^ -1) <= -9) {
                                var3 = 0;
                                L8: while (true) {
                                  if (8 <= var3) {
                                    var2++;
                                    continue L2;
                                  } else {
                                    this.field_k[var3] = this.field_a[var3];
                                    var3++;
                                    continue L8;
                                  }
                                }
                              } else {
                                this.field_a[var3] = this.field_i[var3];
                                var7 = 0;
                                var4 = var7;
                                var5 = 56;
                                L9: while (true) {
                                  if (-9 >= (var7 ^ -1)) {
                                    var3++;
                                    continue L7;
                                  } else {
                                    this.field_a[var3] = bi.a(this.field_a[var3], ll.field_a[var7][eb.a((int)(this.field_k[eb.a(7, var3 + -var7)] >>> var5), 255)]);
                                    var5 -= 8;
                                    var7++;
                                    continue L9;
                                  }
                                }
                              }
                            }
                          } else {
                            this.field_i[var3] = this.field_a[var3];
                            var3++;
                            continue L6;
                          }
                        }
                      } else {
                        this.field_a[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L10: while (true) {
                          if (var4 >= 8) {
                            var3++;
                            continue L5;
                          } else {
                            this.field_a[var3] = bi.a(this.field_a[var3], ll.field_a[var4][eb.a(255, (int)(this.field_i[eb.a(var3 - var4, 7)] >>> var5))]);
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
                dupTemp$0 = this.field_j[var2];
                arrayValue$1 = this.field_d[var2];
                this.field_i[var2] = dupTemp$0;
                this.field_k[var2] = bi.a(arrayValue$1, dupTemp$0);
                var2++;
                continue L1;
              }
            }
          } else {
            this.field_d[var2] = bi.a(bi.a(sd.a(65280L, (long)this.field_e[6 + var3] << 1990143048), bi.a(bi.a(bi.a(bi.a(bi.a((long)this.field_e[var3] << -1192695688, sd.a((long)this.field_e[var3 + 1], 255L) << 1413837040), sd.a(255L, (long)this.field_e[2 + var3]) << -540941784), sd.a(255L, (long)this.field_e[var3 + 3]) << 121436704), sd.a(255L, (long)this.field_e[4 + var3]) << -38668776), sd.a(16711680L, (long)this.field_e[5 + var3] << 1195979920))), sd.a((long)this.field_e[7 + var3], 255L));
            var3 += 8;
            var2++;
            continue L0;
          }
        }
    }

    final static boolean a(int param0) {
        if (param0 != 7) {
            field_c = 'ￃ';
        }
        return null == gk.field_o ? ii.field_a : true;
    }

    final void a(byte[] param0, int param1, long param2) {
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
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
        var13 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            var6 = 8 + -(7 & (int)param2) & param1;
            var7 = this.field_b & 7;
            var9 = param2;
            var11 = 31;
            var12 = 0;
            L1: while (true) {
              if (0 > var11) {
                L2: while (true) {
                  if (-9L <= (param2 ^ -1L)) {
                    L3: {
                      if ((param2 ^ -1L) >= -1L) {
                        var8 = 0;
                        break L3;
                      } else {
                        var8 = 255 & param0[var5_int] << var6;
                        this.field_e[this.field_f] = (byte)ic.a((int) this.field_e[this.field_f], var8 >>> var7);
                        break L3;
                      }
                    }
                    L4: {
                      if (param2 + (long)var7 < 8L) {
                        this.field_b = (int)((long)this.field_b + param2);
                        break L4;
                      } else {
                        L5: {
                          this.field_f = this.field_f + 1;
                          this.field_b = this.field_b + (-var7 + 8);
                          param2 = param2 - (long)(-var7 + 8);
                          if (-513 == (this.field_b ^ -1)) {
                            this.b((byte) 99);
                            this.field_b = 0;
                            this.field_f = 0;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        this.field_e[this.field_f] = (byte)eb.a(255, var8 << 8 + -var7);
                        this.field_b = this.field_b + (int)param2;
                        break L4;
                      }
                    }
                    break L0;
                  } else {
                    L6: {
                      var8 = param0[var5_int] << var6 & 255 | (param0[var5_int + 1] & 255) >>> -var6 + 8;
                      if (var8 < 0) {
                        break L6;
                      } else {
                        if (256 <= var8) {
                          break L6;
                        } else {
                          L7: {
                            this.field_e[this.field_f] = (byte)ic.a((int) this.field_e[this.field_f], var8 >>> var7);
                            this.field_f = this.field_f + 1;
                            this.field_b = this.field_b + (-var7 + 8);
                            if (512 == this.field_b) {
                              this.b((byte) 99);
                              this.field_b = 0;
                              this.field_f = 0;
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          this.field_e[this.field_f] = (byte)eb.a(var8 << -var7 + 8, 255);
                          param2 = param2 - 8L;
                          this.field_b = this.field_b + var7;
                          var5_int++;
                          continue L2;
                        }
                      }
                    }
                    throw new RuntimeException("LOGIC ERROR");
                  }
                }
              } else {
                var12 = var12 + ((255 & this.field_g[var11]) - -((int)var9 & 255));
                this.field_g[var11] = (byte)var12;
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
            stackIn_25_0 = (RuntimeException) (var5);

            stackIn_25_1 = new StringBuilder().append("np.F(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L8;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L8;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    np() {
        this.field_b = 0;
        this.field_a = new long[8];
        this.field_i = new long[8];
        this.field_k = new long[8];
        this.field_j = new long[8];
        this.field_f = 0;
        this.field_e = new byte[64];
        this.field_d = new long[8];
        this.field_g = new byte[32];
    }

    static {
        field_h = new ck();
    }
}
