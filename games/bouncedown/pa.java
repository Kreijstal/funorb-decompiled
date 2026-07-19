/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pa {
    private long[] field_k;
    static boolean field_e;
    private byte[] field_m;
    private long[] field_f;
    private int field_g;
    static gk field_c;
    static gk field_i;
    private long[] field_o;
    private int field_j;
    private long[] field_h;
    static ae field_d;
    static java.awt.Font field_a;
    private byte[] field_l;
    static String field_b;
    private long[] field_n;

    final void a(byte[] param0, int param1, int param2) {
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var8 = Bounce.field_N;
        try {
          L0: {
            L1: {
              this.field_l[this.field_j] = (byte)ge.a((int) this.field_l[this.field_j], 128 >>> da.b(7, this.field_g));
              this.field_j = this.field_j + 1;
              if (this.field_j <= 32) {
                break L1;
              } else {
                L2: while (true) {
                  if (this.field_j >= 64) {
                    this.c(param1 + -54286);
                    this.field_j = 0;
                    break L1;
                  } else {
                    fieldTemp$2 = this.field_j;
                    this.field_j = this.field_j + 1;
                    this.field_l[fieldTemp$2] = (byte) 0;
                    continue L2;
                  }
                }
              }
            }
            L3: while (true) {
              if (32 <= this.field_j) {
                cb.a(this.field_m, 0, this.field_l, 32, 32);
                this.c(-26394);
                if (param1 == 27892) {
                  var4_int = 0;
                  var5 = param2;
                  L4: while (true) {
                    if (8 <= var4_int) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var6 = this.field_n[var4_int];
                      param0[var5] = (byte)(int)(var6 >>> 1161280248);
                      param0[1 + var5] = (byte)(int)(var6 >>> -1025025808);
                      param0[var5 - -2] = (byte)(int)(var6 >>> -57990104);
                      param0[var5 + 3] = (byte)(int)(var6 >>> -683840864);
                      param0[4 + var5] = (byte)(int)(var6 >>> 511708120);
                      param0[var5 - -5] = (byte)(int)(var6 >>> -533904048);
                      param0[6 + var5] = (byte)(int)(var6 >>> -1842774072);
                      param0[7 + var5] = (byte)(int)var6;
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
                fieldTemp$3 = this.field_j;
                this.field_j = this.field_j + 1;
                this.field_l[fieldTemp$3] = (byte) 0;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var4);
            stackOut_13_1 = new StringBuilder().append("pa.F(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static String a(long param0, int param1) {
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        StringBuilder discarded$0 = null;
        int var11 = Bounce.field_N;
        if ((param0 ^ -1L) >= -1L) {
            return null;
        }
        if ((param0 ^ -1L) <= -6582952005840035282L) {
            return null;
        }
        if (param0 % 37L == 0L) {
            return null;
        }
        int var3 = 0;
        if (param1 != 7) {
            pa.b(-20);
        }
        long var4 = param0;
        while (0L != var4) {
            var4 = var4 / 37L;
            var3++;
        }
        StringBuilder var6 = new StringBuilder(var3);
        while (param0 != 0L) {
            var7 = param0;
            param0 = param0 / 37L;
            var9 = li.field_c[(int)(-(37L * param0) + var7)];
            if (!(var9 != 95)) {
                var10 = -1 + var6.length();
                var9 = 160;
                var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
            }
            discarded$0 = var6.append((char) var9);
        }
        StringBuilder discarded$1 = var6.reverse();
        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
        return var6.toString();
    }

    public static void b(int param0) {
        field_c = null;
        field_d = null;
        field_a = null;
        field_b = null;
        if (param0 != 37) {
            field_b = (String) null;
        }
        field_i = null;
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = Bounce.field_N;
        for (var2 = 0; var2 < 32; var2++) {
            this.field_m[var2] = (byte) 0;
        }
        this.field_l[0] = (byte) 0;
        this.field_j = 0;
        this.field_g = 0;
        var2 = 0;
        if (param0 != -28530) {
            byte[] var4 = (byte[]) null;
            this.a((byte[]) null, 51, 73);
        }
        while ((var2 ^ -1) > -9) {
            this.field_n[var2] = 0L;
            var2++;
        }
    }

    final static void a(byte param0) {
        boolean discarded$15 = false;
        boolean discarded$16 = false;
        RuntimeException var1 = null;
        int var2 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Bounce.field_N;
        try {
          L0: {
            if (!fi.b(param0 + 21921)) {
              L1: {
                if (sj.field_f == null) {
                  break L1;
                } else {
                  if (sj.field_f.field_f) {
                    eh.a(true);
                    kf.field_b.b(new nh(kf.field_b, jb.field_c), false);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (param0 == -65) {
                  break L2;
                } else {
                  pa.b(110);
                  break L2;
                }
              }
              discarded$15 = kf.field_b.a(aj.field_f, true, true, kl.field_t);
              kf.field_b.d((byte) 120);
              L3: while (true) {
                if (!q.g((byte) -15)) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  discarded$16 = kf.field_b.a((byte) -90, lh.field_f, gk.field_d);
                  continue L3;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var1), "pa.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var6 = Bounce.field_N;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if (var2 >= 8) {
            var2 = 0;
            L1: while (true) {
              if (-9 >= (var2 ^ -1)) {
                var2 = 1;
                L2: while (true) {
                  if ((var2 ^ -1) < -11) {
                    L3: {
                      var2 = 0;
                      if (param0 == -26394) {
                        break L3;
                      } else {
                        this.field_f = (long[]) null;
                        break L3;
                      }
                    }
                    L4: while (true) {
                      if (-9 >= (var2 ^ -1)) {
                        return;
                      } else {
                        this.field_n[var2] = hf.a(this.field_n[var2], hf.a(this.field_f[var2], this.field_k[var2]));
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
                          if (var3 >= 8) {
                            this.field_o[0] = hf.a(this.field_o[0], eh.field_d[var2]);
                            var3 = 0;
                            L7: while (true) {
                              if (var3 >= 8) {
                                var3 = 0;
                                L8: while (true) {
                                  if (8 <= var3) {
                                    var2++;
                                    continue L2;
                                  } else {
                                    this.field_k[var3] = this.field_h[var3];
                                    var3++;
                                    continue L8;
                                  }
                                }
                              } else {
                                this.field_h[var3] = this.field_o[var3];
                                var7 = 0;
                                var4 = var7;
                                var5 = 56;
                                L9: while (true) {
                                  if (8 <= var7) {
                                    var3++;
                                    continue L7;
                                  } else {
                                    this.field_h[var3] = hf.a(this.field_h[var3], eh.field_a[var7][da.b((int)(this.field_k[da.b(-var7 + var3, 7)] >>> var5), 255)]);
                                    var5 -= 8;
                                    var7++;
                                    continue L9;
                                  }
                                }
                              }
                            }
                          } else {
                            this.field_o[var3] = this.field_h[var3];
                            var3++;
                            continue L6;
                          }
                        }
                      } else {
                        this.field_h[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L10: while (true) {
                          if (8 <= var4) {
                            var3++;
                            continue L5;
                          } else {
                            this.field_h[var3] = hf.a(this.field_h[var3], eh.field_a[var4][da.b((int)(this.field_o[da.b(-var4 + var3, 7)] >>> var5), 255)]);
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
                this.field_o[var2] = this.field_n[var2];
                this.field_k[var2] = hf.a(this.field_f[var2], this.field_n[var2]);
                var2++;
                continue L1;
              }
            }
          } else {
            this.field_f[var2] = hf.a(tk.a((long)this.field_l[7 + var3], 255L), hf.a(hf.a(tk.a(255L, (long)this.field_l[var3 + 5]) << 2034309712, hf.a(hf.a(tk.a(1095216660480L, (long)this.field_l[var3 - -3] << -889532640), hf.a(hf.a((long)this.field_l[var3] << 1029492600, tk.a((long)this.field_l[1 + var3], 255L) << 251525232), tk.a(255L, (long)this.field_l[var3 + 2]) << 1058064680)), tk.a(4278190080L, (long)this.field_l[4 + var3] << -808968744))), tk.a((long)this.field_l[6 + var3], 255L) << 112285448));
            var2++;
            var3 += 8;
            continue L0;
          }
        }
    }

    final static void a(String param0, int param1, boolean param2, long param3, int param4, boolean param5, int param6, int param7, int param8, int param9, int param10, si param11, int param12, int param13) {
        try {
            IOException var15 = null;
            RuntimeException var15_ref = null;
            int stackIn_5_0 = 0;
            int stackIn_8_0 = 0;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            Throwable decompiledCaughtException = null;
            int stackOut_4_0 = 0;
            int stackOut_3_0 = 0;
            int stackOut_7_0 = 0;
            int stackOut_6_0 = 0;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            try {
              L0: {
                L1: {
                  if (param6 == 25342) {
                    break L1;
                  } else {
                    pa.a((byte) 46);
                    break L1;
                  }
                }
                L2: {
                  jc.field_g = new ii(param7);
                  hh.field_p = new ii(param12);
                  if (!param2) {
                    stackOut_4_0 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    break L2;
                  } else {
                    stackOut_3_0 = 1;
                    stackIn_5_0 = stackOut_3_0;
                    break L2;
                  }
                }
                L3: {
                  tc.field_t = stackIn_5_0 != 0;
                  td.field_b = param1;
                  mb.field_s = param3;
                  pj.field_c = param11;
                  nb.field_f = param4;
                  of.field_c = param13;
                  fi.field_b = param9;
                  wa.field_b = param8;
                  cf.field_a = param10;
                  if (!param5) {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    break L3;
                  } else {
                    stackOut_6_0 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    break L3;
                  }
                }
                L4: {
                  ba.field_B = stackIn_8_0 != 0;
                  gk.field_h = param0;
                  if (pj.field_c.field_v == null) {
                    break L4;
                  } else {
                    try {
                      L5: {
                        gf.field_g = new jf(pj.field_c.field_v, 64, 0);
                        break L5;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var15 = (IOException) (Object) decompiledCaughtException;
                      throw new RuntimeException(var15.toString());
                    }
                    break L4;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L6: {
                var15_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_13_0 = (RuntimeException) (var15_ref);
                stackOut_13_1 = new StringBuilder().append("pa.H(");
                stackIn_15_0 = stackOut_13_0;
                stackIn_15_1 = stackOut_13_1;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                if (param0 == null) {
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
              L7: {
                stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',');
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                if (param11 == null) {
                  stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
                  stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackOut_18_2 = "null";
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  stackIn_19_2 = stackOut_18_2;
                  break L7;
                } else {
                  stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
                  stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackOut_17_2 = "{...}";
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  stackIn_19_2 = stackOut_17_2;
                  break L7;
                }
              }
              throw ii.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param12 + ',' + param13 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(long param0, byte[] param1, byte param2) {
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var13 = Bounce.field_N;
        try {
          L0: {
            var5_int = 0;
            var6 = 8 + -((int)param0 & 7) & 7;
            if (param2 >= 33) {
              var7 = this.field_g & 7;
              var9 = param0;
              var11 = 31;
              var12 = 0;
              L1: while (true) {
                if (-1 < (var11 ^ -1)) {
                  L2: while (true) {
                    if (param0 <= 8L) {
                      L3: {
                        if (0L >= param0) {
                          var8 = 0;
                          break L3;
                        } else {
                          var8 = 255 & param1[var5_int] << var6;
                          this.field_l[this.field_j] = (byte)ge.a((int) this.field_l[this.field_j], var8 >>> var7);
                          break L3;
                        }
                      }
                      L4: {
                        if (8L > (long)var7 - -param0) {
                          this.field_g = (int)((long)this.field_g + param0);
                          break L4;
                        } else {
                          L5: {
                            this.field_g = this.field_g + (-var7 + 8);
                            this.field_j = this.field_j + 1;
                            param0 = param0 - (long)(-var7 + 8);
                            if (-513 != (this.field_g ^ -1)) {
                              break L5;
                            } else {
                              this.c(-26394);
                              this.field_g = 0;
                              this.field_j = 0;
                              break L5;
                            }
                          }
                          this.field_l[this.field_j] = (byte)da.b(var8 << 8 + -var7, 255);
                          this.field_g = this.field_g + (int)param0;
                          break L4;
                        }
                      }
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      L6: {
                        var8 = 255 & param1[var5_int] << var6 | (255 & param1[1 + var5_int]) >>> -var6 + 8;
                        if ((var8 ^ -1) > -1) {
                          break L6;
                        } else {
                          if (var8 >= 256) {
                            break L6;
                          } else {
                            L7: {
                              this.field_l[this.field_j] = (byte)ge.a((int) this.field_l[this.field_j], var8 >>> var7);
                              this.field_g = this.field_g + (8 - var7);
                              this.field_j = this.field_j + 1;
                              if (512 == this.field_g) {
                                this.c(-26394);
                                this.field_j = 0;
                                this.field_g = 0;
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                            this.field_l[this.field_j] = (byte)da.b(var8 << -var7 + 8, 255);
                            var5_int++;
                            param0 = param0 - 8L;
                            this.field_g = this.field_g + var7;
                            continue L2;
                          }
                        }
                      }
                      throw new RuntimeException("LOGIC ERROR");
                    }
                  }
                } else {
                  var12 = var12 + ((255 & (int)var9) + (255 & this.field_m[var11]));
                  this.field_m[var11] = (byte)var12;
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
            stackOut_24_0 = (RuntimeException) (var5);
            stackOut_24_1 = new StringBuilder().append("pa.C(").append(param0).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L8;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    pa() {
        this.field_m = new byte[32];
        this.field_k = new long[8];
        this.field_j = 0;
        this.field_g = 0;
        this.field_f = new long[8];
        this.field_h = new long[8];
        this.field_o = new long[8];
        this.field_l = new byte[64];
        this.field_n = new long[8];
    }

    static {
        field_b = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
