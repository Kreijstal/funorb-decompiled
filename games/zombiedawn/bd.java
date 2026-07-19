/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bd {
    private int field_b;
    private int field_g;
    private long[] field_o;
    private byte[] field_c;
    static cg field_q;
    private long[] field_p;
    private byte[] field_k;
    static vn[][] field_i;
    private long[] field_s;
    static boolean field_r;
    static String field_h;
    private long[] field_l;
    private long[] field_n;
    static int field_d;
    static jc field_m;
    static int field_e;
    static int field_j;
    static int field_f;
    static int field_a;

    final static void a(int param0, boolean param1) {
        if (param0 != -1) {
            if (w.field_a[param0] != null) {
                ph.a((byte) 68, w.field_a[param0]);
            }
        }
        if (!param1) {
            field_f = -57;
        }
    }

    public static void a(boolean param0) {
        field_i = (vn[][]) null;
        field_h = null;
        field_m = null;
        if (!param0) {
            field_f = -27;
        }
        field_q = null;
    }

    final static void a(vn param0, boolean param1) {
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var9 = ZombieDawn.field_J;
        try {
          L0: {
            if (0 == (3 & (param0.field_t | param0.field_w | param0.field_v | param0.field_x))) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var2_int = (3 & param0.field_v) + param0.field_w;
              if (!param1) {
                var2_int = var2_int + 4 + -(3 & var2_int);
                var3 = param0.field_t - -(param0.field_x & 3);
                var3 = var3 + (4 - (var3 & 3));
                var4 = new int[var3 * var2_int];
                var5 = 0;
                var6 = var2_int * (3 & param0.field_x) + (param0.field_v & 3);
                var7 = 0;
                L1: while (true) {
                  if (var7 >= param0.field_t) {
                    param0.field_z = var4;
                    param0.field_w = var2_int;
                    param0.field_v = param0.field_v & -4;
                    param0.field_x = param0.field_x & -4;
                    param0.field_t = var3;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var8 = 0;
                    L2: while (true) {
                      if (var8 >= param0.field_w) {
                        var6 = var6 + (-param0.field_w + var2_int);
                        var7++;
                        continue L1;
                      } else {
                        incrementValue$2 = var6;
                        var6++;
                        incrementValue$3 = var5;
                        var5++;
                        var4[incrementValue$2] = param0.field_z[incrementValue$3];
                        var8++;
                        continue L2;
                      }
                    }
                  }
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var2);
            stackOut_14_1 = new StringBuilder().append("bd.A(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final static void a(byte param0) {
        ei.field_G[46] = 72;
        ei.field_G[222] = 58;
        ei.field_G[520] = 59;
        ei.field_G[192] = 28;
        ei.field_G[47] = 73;
        ei.field_G[61] = 27;
        int var1 = 117 % ((-3 - param0) / 59);
        ei.field_G[44] = 71;
        ei.field_G[93] = 43;
        ei.field_G[92] = 74;
        ei.field_G[59] = 57;
        ei.field_G[45] = 26;
        ei.field_G[91] = 42;
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = ZombieDawn.field_J;
        for (var2 = 0; 32 > var2; var2++) {
            this.field_c[var2] = (byte) 0;
        }
        if (param0 != 71) {
            field_h = (String) null;
        }
        this.field_b = 0;
        this.field_k[0] = (byte) 0;
        this.field_g = 0;
        for (var2 = 0; (var2 ^ -1) > -9; var2++) {
            this.field_o[var2] = 0L;
        }
    }

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
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var8 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              this.field_k[this.field_g] = (byte)hi.a((int) this.field_k[this.field_g], 128 >>> eg.a(this.field_b, 7));
              this.field_g = this.field_g + 1;
              if (param2 <= -118) {
                break L1;
              } else {
                this.b(-71);
                break L1;
              }
            }
            L2: {
              if (this.field_g <= 32) {
                break L2;
              } else {
                L3: while (true) {
                  if (this.field_g >= 64) {
                    this.b(-9);
                    this.field_g = 0;
                    break L2;
                  } else {
                    fieldTemp$2 = this.field_g;
                    this.field_g = this.field_g + 1;
                    this.field_k[fieldTemp$2] = (byte) 0;
                    continue L3;
                  }
                }
              }
            }
            L4: while (true) {
              if ((this.field_g ^ -1) <= -33) {
                gp.a(this.field_c, 0, this.field_k, 32, 32);
                this.b(-9);
                var4_int = 0;
                var5 = param1;
                L5: while (true) {
                  if ((var4_int ^ -1) <= -9) {
                    break L0;
                  } else {
                    var6 = this.field_o[var4_int];
                    param0[var5] = (byte)(int)(var6 >>> -838186120);
                    param0[1 + var5] = (byte)(int)(var6 >>> 105566000);
                    param0[2 + var5] = (byte)(int)(var6 >>> -57984344);
                    param0[var5 + 3] = (byte)(int)(var6 >>> -1335309856);
                    param0[4 + var5] = (byte)(int)(var6 >>> 393038744);
                    param0[5 + var5] = (byte)(int)(var6 >>> -1238881904);
                    param0[6 + var5] = (byte)(int)(var6 >>> -250985336);
                    param0[var5 + 7] = (byte)(int)var6;
                    var4_int++;
                    var5 += 8;
                    continue L5;
                  }
                }
              } else {
                fieldTemp$3 = this.field_g;
                this.field_g = this.field_g + 1;
                this.field_k[fieldTemp$3] = (byte) 0;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var4);
            stackOut_13_1 = new StringBuilder().append("bd.I(");
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
          throw sh.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static char a(byte param0, int param1) {
        int var3 = 0;
        if (param1 != 9082) {
            field_d = 87;
        }
        int var2 = param0 & 255;
        if (var2 == 0) {
            throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
        if ((var2 ^ -1) <= -129) {
            if (160 > var2) {
                var3 = fj.field_h[-128 + var2];
                if (0 == var3) {
                    var3 = 63;
                }
                var2 = var3;
            }
        }
        return (char)var2;
    }

    private final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var6 = ZombieDawn.field_J;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if ((var2 ^ -1) <= -9) {
            var2 = 0;
            L1: while (true) {
              if ((var2 ^ -1) <= -9) {
                L2: {
                  if (param0 == -9) {
                    break L2;
                  } else {
                    this.a(-68);
                    break L2;
                  }
                }
                var2 = 1;
                L3: while (true) {
                  if (10 < var2) {
                    var2 = 0;
                    L4: while (true) {
                      if (8 <= var2) {
                        return;
                      } else {
                        this.field_o[var2] = al.a(this.field_o[var2], al.a(this.field_p[var2], this.field_s[var2]));
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
                            this.field_l[0] = al.a(this.field_l[0], bn.field_g[var2]);
                            var3 = 0;
                            L7: while (true) {
                              if (8 <= var3) {
                                var3 = 0;
                                L8: while (true) {
                                  if ((var3 ^ -1) <= -9) {
                                    var2++;
                                    continue L3;
                                  } else {
                                    this.field_p[var3] = this.field_n[var3];
                                    var3++;
                                    continue L8;
                                  }
                                }
                              } else {
                                this.field_n[var3] = this.field_l[var3];
                                var7 = 0;
                                var4 = var7;
                                var5 = 56;
                                L9: while (true) {
                                  if (8 <= var7) {
                                    var3++;
                                    continue L7;
                                  } else {
                                    this.field_n[var3] = al.a(this.field_n[var3], bn.field_h[var7][eg.a((int)(this.field_p[eg.a(7, var3 + -var7)] >>> var5), 255)]);
                                    var7++;
                                    var5 -= 8;
                                    continue L9;
                                  }
                                }
                              }
                            }
                          } else {
                            this.field_l[var3] = this.field_n[var3];
                            var3++;
                            continue L6;
                          }
                        }
                      } else {
                        this.field_n[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L10: while (true) {
                          if (var4 >= 8) {
                            var3++;
                            continue L5;
                          } else {
                            this.field_n[var3] = al.a(this.field_n[var3], bn.field_h[var4][eg.a(255, (int)(this.field_l[eg.a(-var4 + var3, 7)] >>> var5))]);
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
                this.field_l[var2] = this.field_o[var2];
                this.field_p[var2] = al.a(this.field_s[var2], this.field_o[var2]);
                var2++;
                continue L1;
              }
            }
          } else {
            this.field_s[var2] = al.a(gj.a((long)this.field_k[7 + var3], 255L), al.a(al.a(al.a(al.a(gj.a((long)this.field_k[3 + var3], 255L) << 911947296, al.a(al.a(gj.a((long)this.field_k[1 + var3], 255L) << 1896266608, (long)this.field_k[var3] << -1562700104), gj.a((long)this.field_k[2 + var3], 255L) << 285159720)), gj.a((long)this.field_k[4 + var3], 255L) << 2049451480), gj.a(16711680L, (long)this.field_k[5 + var3] << -2076968816)), gj.a(65280L, (long)this.field_k[6 + var3] << -1163883576)));
            var3 += 8;
            var2++;
            continue L0;
          }
        }
    }

    final void a(boolean param0, byte[] param1, long param2) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var13 = ZombieDawn.field_J;
        try {
          L0: {
            var5_int = 0;
            var6 = 7 & -(7 & (int)param2) + 8;
            var7 = this.field_b & 7;
            var9 = param2;
            var11 = 31;
            var12 = 0;
            L1: while (true) {
              if (0 > var11) {
                L2: while (true) {
                  if (-9L <= (param2 ^ -1L)) {
                    L3: {
                      if ((param2 ^ -1L) < -1L) {
                        var8 = 255 & param1[var5_int] << var6;
                        this.field_k[this.field_g] = (byte)hi.a((int) this.field_k[this.field_g], var8 >>> var7);
                        break L3;
                      } else {
                        var8 = 0;
                        break L3;
                      }
                    }
                    L4: {
                      if (param0) {
                        break L4;
                      } else {
                        this.field_l = (long[]) null;
                        break L4;
                      }
                    }
                    L5: {
                      if (8L <= (long)var7 + param2) {
                        L6: {
                          this.field_b = this.field_b + (8 + -var7);
                          this.field_g = this.field_g + 1;
                          param2 = param2 - (long)(8 + -var7);
                          if (this.field_b != 512) {
                            break L6;
                          } else {
                            this.b(-9);
                            this.field_g = 0;
                            this.field_b = 0;
                            break L6;
                          }
                        }
                        this.field_k[this.field_g] = (byte)eg.a(255, var8 << 8 + -var7);
                        this.field_b = this.field_b + (int)param2;
                        break L5;
                      } else {
                        this.field_b = (int)((long)this.field_b + param2);
                        break L5;
                      }
                    }
                    break L0;
                  } else {
                    L7: {
                      var8 = param1[var5_int] << var6 & 255 | (255 & param1[var5_int + 1]) >>> -var6 + 8;
                      if (var8 < 0) {
                        break L7;
                      } else {
                        if ((var8 ^ -1) <= -257) {
                          break L7;
                        } else {
                          L8: {
                            this.field_k[this.field_g] = (byte)hi.a((int) this.field_k[this.field_g], var8 >>> var7);
                            this.field_g = this.field_g + 1;
                            this.field_b = this.field_b + (-var7 + 8);
                            if ((this.field_b ^ -1) != -513) {
                              break L8;
                            } else {
                              this.b(-9);
                              this.field_b = 0;
                              this.field_g = 0;
                              break L8;
                            }
                          }
                          this.field_k[this.field_g] = (byte)eg.a(var8 << -var7 + 8, 255);
                          this.field_b = this.field_b + var7;
                          var5_int++;
                          param2 = param2 - 8L;
                          continue L2;
                        }
                      }
                    }
                    throw new RuntimeException("LOGIC ERROR");
                  }
                }
              } else {
                var12 = var12 + ((255 & this.field_c[var11]) + (255 & (int)var9));
                this.field_c[var11] = (byte)var12;
                var9 = var9 >>> 8;
                var12 = var12 >>> 8;
                var11--;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var5);
            stackOut_23_1 = new StringBuilder().append("bd.F(").append(param0).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L9;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L9;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param2 + ')');
        }
    }

    bd() {
        this.field_o = new long[8];
        this.field_p = new long[8];
        this.field_b = 0;
        this.field_g = 0;
        this.field_c = new byte[32];
        this.field_k = new byte[64];
        this.field_s = new long[8];
        this.field_l = new long[8];
        this.field_n = new long[8];
    }

    static {
        field_i = new vn[2][];
        field_h = "Apply";
        field_r = true;
        field_q = new cg(10, 2, 2, 0);
        field_m = null;
        field_e = 640;
        field_d = field_e / 2;
        field_f = 2;
        field_a = 2 + field_e / 24;
    }
}
