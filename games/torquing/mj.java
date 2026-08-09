/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mj {
    private long[] field_i;
    private long[] field_g;
    private int field_b;
    static int field_d;
    private byte[] field_c;
    private byte[] field_h;
    private long[] field_f;
    static int field_k;
    private long[] field_j;
    private int field_e;
    private long[] field_a;

    final void a(byte[] param0, long param1, byte param2) {
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
        var13 = Torquing.field_u;
        try {
          L0: {
            L1: {
              var5_int = 0;
              var6 = 7 & 8 + -((int)param1 & 7);
              var7 = 7 & this.field_b;
              if (param2 > 84) {
                break L1;
              } else {
                this.a((byte[]) null, -89L, (byte) -88);
                break L1;
              }
            }
            var9 = param1;
            var11 = 31;
            var12 = 0;
            L2: while (true) {
              if (var11 < 0) {
                L3: while (true) {
                  if (param1 <= 8L) {
                    L4: {
                      if (-1L <= (param1 ^ -1L)) {
                        var8 = 0;
                        break L4;
                      } else {
                        var8 = param0[var5_int] << var6 & 255;
                        this.field_h[this.field_e] = (byte)gm.a((int) this.field_h[this.field_e], var8 >>> var7);
                        break L4;
                      }
                    }
                    L5: {
                      if (param1 + (long)var7 < 8L) {
                        this.field_b = (int)((long)this.field_b + param1);
                        break L5;
                      } else {
                        L6: {
                          this.field_b = this.field_b + (-var7 + 8);
                          param1 = param1 - (long)(-var7 + 8);
                          this.field_e = this.field_e + 1;
                          if (512 != this.field_b) {
                            break L6;
                          } else {
                            this.b((byte) 90);
                            this.field_b = 0;
                            this.field_e = 0;
                            break L6;
                          }
                        }
                        this.field_h[this.field_e] = (byte)ie.a(255, var8 << -var7 + 8);
                        this.field_b = this.field_b + (int)param1;
                        break L5;
                      }
                    }
                    break L0;
                  } else {
                    L7: {
                      var8 = param0[var5_int] << var6 & 255 | (param0[1 + var5_int] & 255) >>> 8 + -var6;
                      if ((var8 ^ -1) > -1) {
                        break L7;
                      } else {
                        if (-257 < (var8 ^ -1)) {
                          L8: {
                            this.field_h[this.field_e] = (byte)gm.a((int) this.field_h[this.field_e], var8 >>> var7);
                            this.field_b = this.field_b + (-var7 + 8);
                            this.field_e = this.field_e + 1;
                            if (-513 != (this.field_b ^ -1)) {
                              break L8;
                            } else {
                              this.b((byte) 87);
                              this.field_b = 0;
                              this.field_e = 0;
                              break L8;
                            }
                          }
                          this.field_h[this.field_e] = (byte)ie.a(255, var8 << 8 + -var7);
                          var5_int++;
                          this.field_b = this.field_b + var7;
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
                var12 = var12 + ((255 & (int)var9) + (255 & this.field_c[var11]));
                this.field_c[var11] = (byte)var12;
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

            stackIn_27_1 = new StringBuilder().append("mj.C(");

            if (param0 == null) {
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
          throw rb.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, byte[] param1, int param2) {
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
        long var6 = 0L;
        int var8 = 0;
        var8 = Torquing.field_u;
        try {
          L0: {
            L1: {
              this.field_h[this.field_e] = (byte)gm.a((int) this.field_h[this.field_e], param2 >>> ie.a(7, this.field_b));
              this.field_e = this.field_e + 1;
              if (this.field_e > 32) {
                L2: while (true) {
                  if (64 <= this.field_e) {
                    this.b((byte) 110);
                    this.field_e = 0;
                    break L1;
                  } else {
                    fieldTemp$0 = this.field_e;
                    this.field_e = this.field_e + 1;
                    this.field_h[fieldTemp$0] = (byte) 0;
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            L3: while (true) {
              if (this.field_e >= 32) {
                dk.a(this.field_c, 0, this.field_h, 32, 32);
                this.b((byte) 126);
                var4_int = 0;
                var5 = param0;
                L4: while (true) {
                  if (8 <= var4_int) {
                    break L0;
                  } else {
                    var6 = this.field_f[var4_int];
                    param1[var5] = (byte)(int)(var6 >>> 1665265464);
                    param1[1 + var5] = (byte)(int)(var6 >>> -1397754704);
                    param1[2 + var5] = (byte)(int)(var6 >>> 1013537768);
                    param1[3 + var5] = (byte)(int)(var6 >>> 1112945312);
                    param1[4 + var5] = (byte)(int)(var6 >>> -1733071848);
                    param1[var5 - -5] = (byte)(int)(var6 >>> 103176016);
                    param1[6 + var5] = (byte)(int)(var6 >>> -2019297784);
                    param1[var5 + 7] = (byte)(int)var6;
                    var4_int++;
                    var5 += 8;
                    continue L4;
                  }
                }
              } else {
                fieldTemp$1 = this.field_e;
                this.field_e = this.field_e + 1;
                this.field_h[fieldTemp$1] = (byte) 0;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var4);

            stackIn_14_1 = new StringBuilder().append("mj.A(").append(param0).append(',');

            if (param1 == null) {
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
          throw rb.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ')');
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
        byte[] var7;
        int var8;
        var6 = Torquing.field_u;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if (-9 >= (var2 ^ -1)) {
            L1: {
              if (param0 >= 52) {
                break L1;
              } else {
                var7 = (byte[]) null;
                this.a(-31, (byte[]) null, -11);
                break L1;
              }
            }
            var2 = 0;
            L2: while (true) {
              if (8 <= var2) {
                var2 = 1;
                L3: while (true) {
                  if (10 < var2) {
                    var2 = 0;
                    L4: while (true) {
                      if (8 <= var2) {
                        return;
                      } else {
                        this.field_f[var2] = vb.a(this.field_f[var2], vb.a(this.field_j[var2], this.field_i[var2]));
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
                            this.field_g[0] = vb.a(this.field_g[0], tp.field_m[var2]);
                            var3 = 0;
                            L7: while (true) {
                              if (var3 >= 8) {
                                var3 = 0;
                                L8: while (true) {
                                  if (-9 >= (var3 ^ -1)) {
                                    var2++;
                                    continue L3;
                                  } else {
                                    this.field_i[var3] = this.field_a[var3];
                                    var3++;
                                    continue L8;
                                  }
                                }
                              } else {
                                this.field_a[var3] = this.field_g[var3];
                                var8 = 0;
                                var4 = var8;
                                var5 = 56;
                                L9: while (true) {
                                  if (8 <= var8) {
                                    var3++;
                                    continue L7;
                                  } else {
                                    this.field_a[var3] = vb.a(this.field_a[var3], tp.field_e[var8][ie.a((int)(this.field_i[ie.a(7, -var8 + var3)] >>> var5), 255)]);
                                    var5 -= 8;
                                    var8++;
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
                          if (-9 >= (var4 ^ -1)) {
                            var3++;
                            continue L5;
                          } else {
                            this.field_a[var3] = vb.a(this.field_a[var3], tp.field_e[var4][ie.a((int)(this.field_g[ie.a(7, var3 - var4)] >>> var5), 255)]);
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
                dupTemp$0 = this.field_f[var2];
                arrayValue$1 = this.field_j[var2];
                this.field_g[var2] = dupTemp$0;
                this.field_i[var2] = vb.a(arrayValue$1, dupTemp$0);
                var2++;
                continue L2;
              }
            }
          } else {
            this.field_j[var2] = vb.a(vb.a(on.a((long)this.field_h[6 + var3], 255L) << -1895602744, vb.a(vb.a(on.a((long)this.field_h[4 + var3], 255L) << -925252968, vb.a(on.a(255L, (long)this.field_h[var3 + 3]) << -517151712, vb.a(vb.a(on.a(255L, (long)this.field_h[var3 + 1]) << 776148080, (long)this.field_h[var3] << -1683335560), on.a((long)this.field_h[var3 - -2] << 1396929064, 280375465082880L)))), on.a((long)this.field_h[var3 - -5] << -262526960, 16711680L))), on.a((long)this.field_h[var3 + 7], 255L));
            var2++;
            var3 += 8;
            continue L0;
          }
        }
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = Torquing.field_u;
        for (var2 = 0; var2 < 32; var2++) {
            this.field_c[var2] = (byte) 0;
        }
        this.field_e = 0;
        this.field_h[0] = (byte)param0;
        this.field_b = 0;
        for (var2 = 0; (var2 ^ -1) > -9; var2++) {
            this.field_f[var2] = 0L;
        }
    }

    mj() {
        this.field_g = new long[8];
        this.field_h = new byte[64];
        this.field_c = new byte[32];
        this.field_b = 0;
        this.field_f = new long[8];
        this.field_i = new long[8];
        this.field_e = 0;
        this.field_j = new long[8];
        this.field_a = new long[8];
    }

    static {
        field_d = 0;
    }
}
