/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rl {
    private byte[] field_c;
    private long[] field_b;
    private byte[] field_j;
    private int field_h;
    static String field_i;
    static int[] field_d;
    private long[] field_f;
    private long[] field_g;
    private long[] field_e;
    private long[] field_k;
    private int field_a;

    private final void a(byte param0) {
        long dupTemp$0 = 0L;
        long arrayValue$1 = 0L;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        var6 = Transmogrify.field_A ? 1 : 0;
        if (param0 <= -86) {
          var2 = 0;
          var3 = 0;
          L0: while (true) {
            if (-9 >= (var2 ^ -1)) {
              var2 = 0;
              L1: while (true) {
                if (-9 >= (var2 ^ -1)) {
                  var2 = 1;
                  L2: while (true) {
                    if (10 < var2) {
                      var2 = 0;
                      L3: while (true) {
                        if (-9 >= (var2 ^ -1)) {
                          return;
                        } else {
                          this.field_e[var2] = aj.a(this.field_e[var2], aj.a(this.field_g[var2], this.field_b[var2]));
                          var2++;
                          continue L3;
                        }
                      }
                    } else {
                      var3 = 0;
                      L4: while (true) {
                        if ((var3 ^ -1) <= -9) {
                          var3 = 0;
                          L5: while (true) {
                            if (8 <= var3) {
                              this.field_f[0] = aj.a(this.field_f[0], dl.field_q[var2]);
                              var3 = 0;
                              L6: while (true) {
                                if (8 <= var3) {
                                  var3 = 0;
                                  L7: while (true) {
                                    if (var3 >= 8) {
                                      var2++;
                                      continue L2;
                                    } else {
                                      this.field_g[var3] = this.field_k[var3];
                                      var3++;
                                      continue L7;
                                    }
                                  }
                                } else {
                                  this.field_k[var3] = this.field_f[var3];
                                  var7 = 0;
                                  var4 = var7;
                                  var5 = 56;
                                  L8: while (true) {
                                    if (-9 >= (var7 ^ -1)) {
                                      var3++;
                                      continue L6;
                                    } else {
                                      this.field_k[var3] = aj.a(this.field_k[var3], dl.field_n[var7][vg.c(255, (int)(this.field_g[vg.c(-var7 + var3, 7)] >>> var5))]);
                                      var5 -= 8;
                                      var7++;
                                      continue L8;
                                    }
                                  }
                                }
                              }
                            } else {
                              this.field_f[var3] = this.field_k[var3];
                              var3++;
                              continue L5;
                            }
                          }
                        } else {
                          this.field_k[var3] = 0L;
                          var4 = 0;
                          var5 = 56;
                          L9: while (true) {
                            if (var4 >= 8) {
                              var3++;
                              continue L4;
                            } else {
                              this.field_k[var3] = aj.a(this.field_k[var3], dl.field_n[var4][vg.c((int)(this.field_f[vg.c(var3 + -var4, 7)] >>> var5), 255)]);
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
                  dupTemp$0 = this.field_e[var2];
                  arrayValue$1 = this.field_b[var2];
                  this.field_f[var2] = dupTemp$0;
                  this.field_g[var2] = aj.a(arrayValue$1, dupTemp$0);
                  var2++;
                  continue L1;
                }
              }
            } else {
              this.field_b[var2] = aj.a(ej.a(255L, (long)this.field_j[7 + var3]), aj.a(aj.a(ej.a((long)this.field_j[5 + var3], 255L) << -640331824, aj.a(ej.a(4278190080L, (long)this.field_j[var3 - -4] << 212529752), aj.a(aj.a(ej.a(280375465082880L, (long)this.field_j[var3 + 2] << 861818856), aj.a((long)this.field_j[var3] << -1322827016, ej.a((long)this.field_j[1 + var3] << 73813488, 71776119061217280L))), ej.a(255L, (long)this.field_j[var3 - -3]) << -1053287136))), ej.a((long)this.field_j[6 + var3] << -1986427384, 65280L)));
              var3 += 8;
              var2++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    final static int b(byte param0) {
        if (param0 != -6) {
            return 92;
        }
        we.field_j.a(false);
        if (!oh.field_h.c((byte) 124)) {
            return ai.a(2);
        }
        return 0;
    }

    final static boolean a(int param0, int param1, int param2, ci param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5 = param3.a((byte) -93, param0, param2);
            var4 = var5;
            if (var5 == null) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param1 == 0) {
                kf.a(var5, param1 ^ 108);
                stackIn_8_0 = 1;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_6_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var4_ref);

            stackIn_11_1 = new StringBuilder().append("rl.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L1;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L1;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            return stackIn_8_0 != 0;
          }
        }
    }

    public static void b(int param0) {
        field_i = null;
        if (param0 != 7) {
            field_d = (int[]) null;
        }
        field_d = null;
    }

    final void a(int param0, long param1, byte[] param2) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
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
        var13 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (param0 == 14027) {
              var5_int = 0;
              var6 = 7 & 8 + -(7 & (int)param1);
              var7 = 7 & this.field_h;
              var9 = param1;
              var11 = 31;
              var12 = 0;
              L1: while (true) {
                if (var11 < 0) {
                  L2: while (true) {
                    if (-9L <= (param1 ^ -1L)) {
                      L3: {
                        if (param1 > 0L) {
                          var8 = param2[var5_int] << var6 & 255;
                          this.field_j[this.field_a] = (byte)cl.b((int) this.field_j[this.field_a], var8 >>> var7);
                          break L3;
                        } else {
                          var8 = 0;
                          break L3;
                        }
                      }
                      L4: {
                        if (8L <= param1 + (long)var7) {
                          L5: {
                            param1 = param1 - (long)(-var7 + 8);
                            this.field_h = this.field_h + (-var7 + 8);
                            this.field_a = this.field_a + 1;
                            if (this.field_h == 512) {
                              this.a((byte) -94);
                              this.field_a = 0;
                              this.field_h = 0;
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          this.field_j[this.field_a] = (byte)vg.c(255, var8 << -var7 + 8);
                          this.field_h = this.field_h + (int)param1;
                          break L4;
                        } else {
                          this.field_h = (int)((long)this.field_h + param1);
                          break L4;
                        }
                      }
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      L6: {
                        var8 = 255 & param2[var5_int] << var6 | (255 & param2[1 + var5_int]) >>> -var6 + 8;
                        if (var8 < 0) {
                          break L6;
                        } else {
                          if (256 > var8) {
                            L7: {
                              this.field_j[this.field_a] = (byte)cl.b((int) this.field_j[this.field_a], var8 >>> var7);
                              this.field_h = this.field_h + (-var7 + 8);
                              this.field_a = this.field_a + 1;
                              if (-513 != (this.field_h ^ -1)) {
                                break L7;
                              } else {
                                this.a((byte) -97);
                                this.field_h = 0;
                                this.field_a = 0;
                                break L7;
                              }
                            }
                            this.field_j[this.field_a] = (byte)vg.c(var8 << 8 + -var7, 255);
                            var5_int++;
                            param1 = param1 - 8L;
                            this.field_h = this.field_h + var7;
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
                  var12 = var12 + ((this.field_c[var11] & 255) - -(255 & (int)var9));
                  this.field_c[var11] = (byte)var12;
                  var9 = var9 >>> 8;
                  var12 = var12 >>> 8;
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
            stackIn_26_0 = (RuntimeException) (var5);

            stackIn_26_1 = new StringBuilder().append("rl.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw ch.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(byte[] param0, int param1, int param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_j[this.field_a] = (byte)cl.b((int) this.field_j[this.field_a], 128 >>> vg.c(this.field_h, 7));
              this.field_a = this.field_a + 1;
              if (-33 <= (this.field_a ^ -1)) {
                break L1;
              } else {
                L2: while (true) {
                  if (this.field_a >= 64) {
                    this.a((byte) -87);
                    this.field_a = 0;
                    break L1;
                  } else {
                    fieldTemp$0 = this.field_a;
                    this.field_a = this.field_a + 1;
                    this.field_j[fieldTemp$0] = (byte) 0;
                    continue L2;
                  }
                }
              }
            }
            L3: while (true) {
              if (-33 >= (this.field_a ^ -1)) {
                ji.a(this.field_c, 0, this.field_j, 32, 32);
                this.a((byte) -119);
                var4_int = 0;
                var5 = param2;
                if (param1 > 51) {
                  L4: while (true) {
                    if ((var4_int ^ -1) <= -9) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var6 = this.field_e[var4_int];
                      param0[var5] = (byte)(int)(var6 >>> 764252024);
                      param0[1 + var5] = (byte)(int)(var6 >>> -740567376);
                      param0[2 + var5] = (byte)(int)(var6 >>> 1386401128);
                      param0[var5 + 3] = (byte)(int)(var6 >>> -2042330144);
                      param0[4 + var5] = (byte)(int)(var6 >>> 682001624);
                      param0[5 + var5] = (byte)(int)(var6 >>> -230296944);
                      param0[6 + var5] = (byte)(int)(var6 >>> -1223563576);
                      param0[7 + var5] = (byte)(int)var6;
                      var5 += 8;
                      var4_int++;
                      continue L4;
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                fieldTemp$1 = this.field_a;
                this.field_a = this.field_a + 1;
                this.field_j[fieldTemp$1] = (byte) 0;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var4);

            stackIn_14_1 = new StringBuilder().append("rl.C(");

            if (param0 == null) {
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
          throw ch.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    rl() {
        this.field_h = 0;
        this.field_b = new long[8];
        this.field_f = new long[8];
        this.field_j = new byte[64];
        this.field_e = new long[8];
        this.field_g = new long[8];
        this.field_k = new long[8];
        this.field_c = new byte[32];
        this.field_a = 0;
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = Transmogrify.field_A ? 1 : 0;
        for (var2 = 0; (var2 ^ -1) > -33; var2++) {
            this.field_c[var2] = (byte) 0;
        }
        this.field_a = 0;
        this.field_h = 0;
        this.field_j[0] = (byte) 0;
        if (param0 != 15298) {
            this.field_g = (long[]) null;
        }
        for (var2 = 0; -9 < (var2 ^ -1); var2++) {
            this.field_e[var2] = 0L;
        }
    }

    static {
        field_i = "Achieved";
        field_d = new int[8192];
    }
}
