/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hm extends gl {
    private ci[] field_D;
    private int field_E;
    private int field_K;
    static String field_G;
    private int field_F;
    private int field_A;
    private int field_Q;
    static int field_L;
    static int field_N;
    private int field_B;
    static String field_H;
    private ci field_z;
    private ci field_C;
    int field_M;
    static String field_J;
    boolean field_P;
    private ci field_I;

    private final ci a(int param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = Terraphoenix.field_V;
        int var2 = this.field_n >> 1327810017;
        ci var3 = new ci(var2, this.field_n);
        il.a(1, var3);
        for (var4 = param0; var4 < this.field_n; var4++) {
            for (var5 = 0; var5 < var2; var5++) {
                var6 = (double)var5 * (double)var5 / (double)((this.field_n + -var4) * var4);
                var8 = 1;
                if (var6 < 1.0) {
                    var6 = Math.sqrt(1.0 - var6);
                    var8 = 1.0 > var6 ? (int)(255.0 * var6) : 255;
                }
                l.a(var5, var4, var8 << 437479504 | (var8 | var8 << -302382744));
            }
        }
        ij.a(false);
        return var3;
    }

    final void a(int param0, int param1, int param2, int param3) {
        ci discarded$0 = null;
        if (param2 != 0) {
            return;
        }
        int var5 = param0 - -this.field_w;
        int var6 = this.field_u + param3;
        if (param1 > -106) {
            discarded$0 = this.b(-89, -2, 111);
        }
        this.a(this.field_D[0], var6, var5, -1);
        if (!(65536 <= this.field_M)) {
            di.a(var5 - -this.field_p, var6, 16105, var6 - -this.field_n, (this.field_M * this.field_p >> 1337156624) + var5);
            this.a(this.field_D[1], var6, var5, -1);
            ij.a(false);
        }
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        super.a(param0, (byte) 65, param2, param3, param4);
        this.e((byte) 76);
        if (param1 < 45) {
            field_J = (String) null;
        }
    }

    private final ci b(int param0, int param1, int param2) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = Terraphoenix.field_V;
        ci var14 = new ci(2 * this.field_K, this.field_n);
        il.a(1, var14);
        int var5 = this.field_n >> -1355074175;
        if (param1 != -27888) {
            return (ci) null;
        }
        for (var6 = 0; this.field_n > var6; var6++) {
            var7 = (var6 >> 401541601) * (this.field_K * 2 + -1) % (this.field_K * 2);
            var8 = param0 & 16711935;
            var9 = param0 & 65280;
            var10 = var6 - var5;
            var11 = (int)(Math.sqrt((double)(var5 * var5 - var10 * var10)) / (double)var5 * 128.0) + 128;
            var12 = 256 <= var11 ? var9 | var8 : (-16711936 & var11 * var8 | 16711680 & var9 * var11) >>> 889520424;
            l.d(var7, var6, this.field_K, var12);
            var8 = 16711935 & param2;
            l.d(-(2 * this.field_K) + var7, var6, this.field_K, var12);
            var9 = param2 & 65280;
            var12 = var11 < 256 ? (var8 * var11 & -16711936 | var9 * var11 & 16711680) >>> 268548264 : var8 | var9;
            l.d(this.field_K + var7, var6, this.field_K, var12);
            l.d(var7 + -this.field_K, var6, this.field_K, var12);
        }
        ij.a(false);
        return var14;
    }

    private final void a(ci param0, int param1, int param2, int param3) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        gl var9 = null;
        var8 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              if (param3 == -1) {
                break L1;
              } else {
                var9 = (gl) null;
                this.a((gl) null, 26, 3, -111);
                break L1;
              }
            }
            var5_int = this.field_p + param2;
            di.a(-this.field_C.field_r + var5_int, param1, 16105, param1 + this.field_n, this.field_C.field_r + param2);
            var6 = -this.field_A + param2;
            L2: while (true) {
              if (var6 >= var5_int) {
                L3: {
                  ij.a(false);
                  if (l.field_b > param2 - -this.field_C.field_r) {
                    break L3;
                  } else {
                    il.a(1, this.field_I);
                    param0.b(-this.field_A, 0);
                    param0.b(2 * this.field_K + -this.field_A, 0);
                    this.field_z.e(0, 0);
                    ij.a(false);
                    this.field_I.b(param2, param1);
                    break L3;
                  }
                }
                L4: {
                  if (l.field_f < -this.field_C.field_r + var5_int) {
                    break L4;
                  } else {
                    il.a(1, this.field_I);
                    var7 = -this.field_C.field_r + (this.field_p - -this.field_A);
                    L5: while (true) {
                      if (2 * this.field_K >= var7) {
                        param0.b(-var7, 0);
                        param0.b(-var7 + this.field_K * 2, 0);
                        this.field_C.e(0, 0);
                        ij.a(false);
                        this.field_I.b(-this.field_C.field_r + var5_int, param1);
                        break L4;
                      } else {
                        var7 = var7 - 2 * this.field_K;
                        continue L5;
                      }
                    }
                  }
                }
                break L0;
              } else {
                param0.b(var6, param1);
                var6 = var6 + param0.field_r;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var5);

            stackIn_16_1 = new StringBuilder().append("hm.RA(");

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
          throw qk.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static String a(byte param0, CharSequence param1) {
        StringBuilder discarded$0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_27_0 = null;
        String stackIn_29_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = Terraphoenix.field_V;
        try {
          L0: {
            if (param1 != null) {
              var2_int = 0;
              var3 = param1.length();
              L1: while (true) {
                L2: {
                  if (var2_int >= var3) {
                    break L2;
                  } else {
                    if (!ad.a((byte) 114, param1.charAt(var2_int))) {
                      break L2;
                    } else {
                      var2_int++;
                      continue L1;
                    }
                  }
                }
                L3: while (true) {
                  L4: {
                    if (var3 <= var2_int) {
                      break L4;
                    } else {
                      if (!ad.a((byte) 110, param1.charAt(-1 + var3))) {
                        break L4;
                      } else {
                        var3--;
                        continue L3;
                      }
                    }
                  }
                  var5 = 33 / ((-61 - param0) / 40);
                  var4 = -var2_int + var3;
                  if (-2 >= (var4 ^ -1)) {
                    if (var4 <= 12) {
                      var6 = new StringBuilder(var4);
                      var7 = var2_int;
                      L5: while (true) {
                        if (var3 <= var7) {
                          if (0 != var6.length()) {
                            stackIn_29_0 = var6.toString();
                            decompiledRegionSelector0 = 3;
                            break L0;
                          } else {
                            stackIn_27_0 = null;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          }
                        } else {
                          L6: {
                            var8 = param1.charAt(var7);
                            if (ja.a((char) var8, (byte) 106)) {
                              var9 = kh.a((char) var8, (byte) -128);
                              if (0 != var9) {
                                discarded$0 = var6.append((char) var9);
                                break L6;
                              } else {
                                break L6;
                              }
                            } else {
                              break L6;
                            }
                          }
                          var7++;
                          continue L5;
                        }
                      }
                    } else {
                      stackIn_16_0 = null;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  } else {
                    return null;
                  }
                }
              }
            } else {
              stackIn_3_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var2);

            stackIn_32_1 = new StringBuilder().append("hm.QA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L7;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L7;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (String) ((Object) stackIn_3_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (String) ((Object) stackIn_16_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (String) ((Object) stackIn_27_0);
            } else {
              return stackIn_29_0;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        this.field_Q = param0;
        this.field_B = param2;
        if (param1 != -7062047) {
            ci var5 = (ci) null;
            this.a((ci) null, 79, -24, 37);
        }
        this.field_E = 8355711 & param0 >> 254778593;
        this.field_F = param2 >> 1931818433 & 8355711;
        this.e((byte) -43);
    }

    public static void b(boolean param0) {
        field_G = null;
        if (!param0) {
            return;
        }
        field_J = null;
        field_H = null;
    }

    final void a(gl param0, int param1, int param2, int param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              if (param3 >= 25) {
                break L1;
              } else {
                this.field_M = 79;
                break L1;
              }
            }
            L2: {
              L3: {
                if (!this.field_P) {
                  break L3;
                } else {
                  this.field_A = this.field_A + 1;
                  if (this.field_A <= this.field_K * 2) {
                    break L3;
                  } else {
                    this.field_A = this.field_A - 2 * this.field_K;
                    break L2;
                  }
                }
              }
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("hm.B(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L4;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L4;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void e(byte param0) {
        this.field_D = new ci[]{this.b(this.field_B, -27888, this.field_Q), this.b(this.field_F, -27888, this.field_E)};
        int var2 = -120 % ((12 - param0) / 40);
        this.field_C = this.a(0);
        this.field_z = this.field_C.e();
        this.field_I = new ci(this.field_n >> -1595266431, this.field_n);
    }

    hm(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, (param5 & 16711422) >> -7062047, (param6 & 16711422) >> -413306751);
    }

    private hm(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_B = param5;
        this.field_F = param7;
        this.field_K = param4;
        this.field_E = param8;
        this.field_Q = param6;
        this.a(param1, (byte) 113, param2, param0, param3);
    }

    static {
        field_H = "    Your soldier";
        field_G = "Left click to throw grenade";
        field_J = "SUCCESS";
    }
}
