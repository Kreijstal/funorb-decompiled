/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class nf {
    static int[] field_i;
    static int field_l;
    private byte[] field_h;
    private int field_g;
    private long[] field_d;
    private long[] field_m;
    private byte[] field_f;
    private int field_j;
    static int field_e;
    private long[] field_n;
    static volatile boolean field_k;
    private long[] field_c;
    private long[] field_a;
    static int[] field_b;

    public static void b(int param0) {
        if (param0 >= -92) {
            return;
        }
        field_i = null;
        field_b = null;
    }

    final static void a(int param0, byte param1) {
        try {
            IOException iOException = null;
            kh var3 = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (param1 == 95) {
                break L0;
              } else {
                var3 = (kh) null;
                nf.a(true, (String) null, (String) null, 96, (String) null, 67, (kh) null);
                break L0;
              }
            }
            L1: {
              if (null == m.field_b) {
                break L1;
              } else {
                L2: {
                  if (0 > param0) {
                    break L2;
                  } else {
                    if (pb.field_a != r.field_c) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (-1 != (d.field_b.field_g ^ -1)) {
                    break L3;
                  } else {
                    if (ca.field_Y + 10000L >= dd.b(57)) {
                      break L3;
                    } else {
                      d.field_b.d((byte) 88, param0);
                      break L3;
                    }
                  }
                }
                L4: {
                  if (d.field_b.field_g > 0) {
                    try {
                      L5: {
                        m.field_b.a(0, d.field_b.field_f, (byte) 87, d.field_b.field_g);
                        ca.field_Y = dd.b(84);
                        break L5;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L6: {
                        iOException = (IOException) (Object) decompiledCaughtException;
                        ec.a((byte) 27);
                        break L6;
                      }
                    }
                    d.field_b.field_g = 0;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                return;
              }
            }
            d.field_b.field_g = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, byte[] param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        long var6 = 0L;
        try {
          L0: {
            L1: {
              this.field_f[this.field_g] = (byte)cl.a((int) this.field_f[this.field_g], 128 >>> w.a(7, this.field_j));
              if (param1 == 494486752) {
                break L1;
              } else {
                field_i = (int[]) null;
                break L1;
              }
            }
            L2: {
              this.field_g = this.field_g + 1;
              if (this.field_g > 32) {
                L3: while (true) {
                  if (64 <= this.field_g) {
                    this.a(true);
                    this.field_g = 0;
                    break L2;
                  } else {
                    fieldTemp$0 = this.field_g;
                    this.field_g = this.field_g + 1;
                    this.field_f[fieldTemp$0] = (byte) 0;
                    continue L3;
                  }
                }
              } else {
                break L2;
              }
            }
            L4: while (true) {
              if (this.field_g >= 32) {
                ug.a(this.field_h, 0, this.field_f, 32, 32);
                this.a(true);
                var4_int = 0;
                var5 = param0;
                L5: while (true) {
                  if ((var4_int ^ -1) <= -9) {
                    break L0;
                  } else {
                    var6 = this.field_a[var4_int];
                    param2[var5] = (byte)(int)(var6 >>> -1249875144);
                    param2[1 + var5] = (byte)(int)(var6 >>> 54069936);
                    param2[var5 - -2] = (byte)(int)(var6 >>> -1424676888);
                    param2[3 + var5] = (byte)(int)(var6 >>> 1267807328);
                    param2[var5 - -4] = (byte)(int)(var6 >>> 1516356760);
                    param2[5 + var5] = (byte)(int)(var6 >>> -195518768);
                    param2[6 + var5] = (byte)(int)(var6 >>> -1219853048);
                    param2[var5 + 7] = (byte)(int)var6;
                    var4_int++;
                    var5 += 8;
                    continue L5;
                  }
                }
              } else {
                fieldTemp$1 = this.field_g;
                this.field_g = this.field_g + 1;
                this.field_f[fieldTemp$1] = (byte) 0;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("nf.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L6;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L6;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
    }

    final void a(int param0) {
        int var2 = 0;
        if (param0 != 5) {
            return;
        }
        while (32 > var2) {
            this.field_h[var2] = (byte) 0;
            var2++;
        }
        this.field_g = 0;
        this.field_j = 0;
        this.field_f[0] = (byte) 0;
        for (var2 = 0; 8 > var2; var2++) {
            this.field_a[var2] = 0L;
        }
    }

    private final void a(boolean param0) {
        long dupTemp$0 = 0L;
        long arrayValue$1 = 0L;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if (8 <= var2) {
            var2 = 0;
            L1: while (true) {
              if (var2 >= 8) {
                var2 = 1;
                L2: while (true) {
                  if (-11 > (var2 ^ -1)) {
                    L3: {
                      if (param0) {
                        break L3;
                      } else {
                        nf.b(-86);
                        break L3;
                      }
                    }
                    var2 = 0;
                    L4: while (true) {
                      if ((var2 ^ -1) <= -9) {
                        return;
                      } else {
                        this.field_a[var2] = ba.a(this.field_a[var2], ba.a(this.field_m[var2], this.field_c[var2]));
                        var2++;
                        continue L4;
                      }
                    }
                  } else {
                    var3 = 0;
                    L5: while (true) {
                      if (-9 >= (var3 ^ -1)) {
                        var3 = 0;
                        L6: while (true) {
                          if (-9 >= (var3 ^ -1)) {
                            this.field_n[0] = ba.a(this.field_n[0], lj.field_b[var2]);
                            var3 = 0;
                            L7: while (true) {
                              if (-9 >= (var3 ^ -1)) {
                                var3 = 0;
                                L8: while (true) {
                                  if ((var3 ^ -1) <= -9) {
                                    var2++;
                                    continue L2;
                                  } else {
                                    this.field_m[var3] = this.field_d[var3];
                                    var3++;
                                    continue L8;
                                  }
                                }
                              } else {
                                this.field_d[var3] = this.field_n[var3];
                                var6 = 0;
                                var4 = var6;
                                var5 = 56;
                                L9: while (true) {
                                  if (8 <= var6) {
                                    var3++;
                                    continue L7;
                                  } else {
                                    this.field_d[var3] = ba.a(this.field_d[var3], lj.field_e[var6][w.a((int)(this.field_m[w.a(var3 - var6, 7)] >>> var5), 255)]);
                                    var5 -= 8;
                                    var6++;
                                    continue L9;
                                  }
                                }
                              }
                            }
                          } else {
                            this.field_n[var3] = this.field_d[var3];
                            var3++;
                            continue L6;
                          }
                        }
                      } else {
                        this.field_d[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L10: while (true) {
                          if (-9 >= (var4 ^ -1)) {
                            var3++;
                            continue L5;
                          } else {
                            this.field_d[var3] = ba.a(this.field_d[var3], lj.field_e[var4][w.a(255, (int)(this.field_n[w.a(7, -var4 + var3)] >>> var5))]);
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
                dupTemp$0 = this.field_a[var2];
                arrayValue$1 = this.field_c[var2];
                this.field_n[var2] = dupTemp$0;
                this.field_m[var2] = ba.a(arrayValue$1, dupTemp$0);
                var2++;
                continue L1;
              }
            }
          } else {
            this.field_c[var2] = ba.a(r.a((long)this.field_f[7 + var3], 255L), ba.a(r.a(65280L, (long)this.field_f[6 + var3] << -1946880504), ba.a(r.a(16711680L, (long)this.field_f[var3 + 5] << -1377662256), ba.a(r.a(255L, (long)this.field_f[var3 - -4]) << 1936316248, ba.a(r.a((long)this.field_f[3 + var3] << -1184631584, 1095216660480L), ba.a(ba.a(r.a((long)this.field_f[var3 + 1], 255L) << 1223911408, (long)this.field_f[var3] << -599053960), r.a((long)this.field_f[var3 + 2], 255L) << 1052869352))))));
            var3 += 8;
            var2++;
            continue L0;
          }
        }
    }

    final static boolean a(boolean param0, String param1, String param2, int param3, String param4, int param5, kh param6) {
        RuntimeException var7 = null;
        ok var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (uh.field_k == cl.field_k) {
              L1: {
                if (param5 == 0) {
                  break L1;
                } else {
                  nf.b(124);
                  break L1;
                }
              }
              var8 = new ok(ti.field_b, param6);
              ti.field_b.a((byte) 72, (uj) (var8));
              if (dd.a((byte) 77)) {
                var8.p(10341);
                stackIn_11_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L2: {
                  uh.field_k = jl.field_a;
                  qb.field_a = param3;
                  jl.field_c = param2;
                  wj.field_c = param4;
                  gj.field_a = null;
                  lh.field_D = param1;
                  if (!param0) {
                    stackIn_9_0 = 0;
                    break L2;
                  } else {
                    stackIn_9_0 = 1;
                    break L2;
                  }
                }
                sk.field_b = stackIn_9_0 != 0;
                return true;
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var7);

            stackIn_14_1 = new StringBuilder().append("nf.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L6;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L6;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_15_0), stackIn_24_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    final void a(long param0, int param1, byte[] param2) {
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
        byte[] var13 = null;
        try {
          L0: {
            var5_int = 0;
            var6 = 7 & -((int)param0 & 7) + 8;
            var7 = this.field_j & 7;
            var9 = param0;
            var11 = 31;
            var12 = 0;
            L1: while (true) {
              if (-1 < (var11 ^ -1)) {
                L2: while (true) {
                  if ((param0 ^ -1L) >= -9L) {
                    L3: {
                      if (0L < param0) {
                        var8 = param2[var5_int] << var6 & 255;
                        this.field_f[this.field_g] = (byte)cl.a((int) this.field_f[this.field_g], var8 >>> var7);
                        break L3;
                      } else {
                        var8 = 0;
                        break L3;
                      }
                    }
                    L4: {
                      if (((long)var7 - -param0 ^ -1L) <= -9L) {
                        L5: {
                          this.field_g = this.field_g + 1;
                          this.field_j = this.field_j + (-var7 + 8);
                          param0 = param0 - (long)(8 + -var7);
                          if (this.field_j == 512) {
                            this.a(true);
                            this.field_j = 0;
                            this.field_g = 0;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        this.field_f[this.field_g] = (byte)w.a(255, var8 << -var7 + 8);
                        this.field_j = this.field_j + (int)param0;
                        break L4;
                      } else {
                        this.field_j = (int)((long)this.field_j + param0);
                        break L4;
                      }
                    }
                    L6: {
                      if (param1 == 614) {
                        break L6;
                      } else {
                        var13 = (byte[]) null;
                        this.a(-42L, -88, (byte[]) null);
                        break L6;
                      }
                    }
                    break L0;
                  } else {
                    L7: {
                      var8 = param2[var5_int] << var6 & 255 | (param2[1 + var5_int] & 255) >>> -var6 + 8;
                      if ((var8 ^ -1) > -1) {
                        break L7;
                      } else {
                        if (-257 < (var8 ^ -1)) {
                          L8: {
                            this.field_f[this.field_g] = (byte)cl.a((int) this.field_f[this.field_g], var8 >>> var7);
                            this.field_g = this.field_g + 1;
                            this.field_j = this.field_j + (8 + -var7);
                            if ((this.field_j ^ -1) == -513) {
                              this.a(true);
                              this.field_g = 0;
                              this.field_j = 0;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          this.field_f[this.field_g] = (byte)w.a(255, var8 << -var7 + 8);
                          var5_int++;
                          this.field_j = this.field_j + var7;
                          param0 = param0 - 8L;
                          continue L2;
                        } else {
                          break L7;
                        }
                      }
                    }
                    throw new RuntimeException("LOGIC ERROR");
                  }
                }
              } else {
                var12 = var12 + (((int)var9 & 255) + (this.field_h[var11] & 255));
                this.field_h[var11] = (byte)var12;
                var12 = var12 >>> 8;
                var9 = var9 >>> 8;
                var11--;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var5);

            stackIn_26_1 = new StringBuilder().append("nf.G(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L9;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L9;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
    }

    nf() {
        this.field_f = new byte[64];
        this.field_j = 0;
        this.field_h = new byte[32];
        this.field_n = new long[8];
        this.field_d = new long[8];
        this.field_g = 0;
        this.field_a = new long[8];
        this.field_c = new long[8];
        this.field_m = new long[8];
    }

    static {
        field_k = true;
    }
}
