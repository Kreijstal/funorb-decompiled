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
        int var2 = ((hm) this).field_n >> 1327810017;
        ci var3 = new ci(var2, ((hm) this).field_n);
        il.a(1, var3);
        for (var4 = param0; var4 < ((hm) this).field_n; var4++) {
            for (var5 = 0; var5 < var2; var5++) {
                var6 = (double)var5 * (double)var5 / (double)((((hm) this).field_n + -var4) * var4);
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
        if (param2 != 0) {
            return;
        }
        int var5 = param0 - -((hm) this).field_w;
        int var6 = ((hm) this).field_u + param3;
        if (param1 > -106) {
            ci discarded$0 = this.b(-89, -2, 111);
        }
        this.a(((hm) this).field_D[0], var6, var5, -1);
        if (!(65536 <= ((hm) this).field_M)) {
            di.a(var5 - -((hm) this).field_p, var6, 16105, var6 - -((hm) this).field_n, (((hm) this).field_M * ((hm) this).field_p >> 1337156624) + var5);
            this.a(((hm) this).field_D[1], var6, var5, -1);
            ij.a(false);
        }
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        super.a(param0, (byte) 65, param2, param3, param4);
        this.e((byte) 76);
        if (param1 < 45) {
            field_J = null;
        }
    }

    private final ci b(int param0, int param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        ci var14 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        var13 = Terraphoenix.field_V;
        var14 = new ci(2 * ((hm) this).field_K, ((hm) this).field_n);
        il.a(1, var14);
        var5 = ((hm) this).field_n >> -1355074175;
        if (param1 == -27888) {
          var6 = 0;
          L0: while (true) {
            if (((hm) this).field_n <= var6) {
              ij.a(false);
              return var14;
            } else {
              L1: {
                var7 = (var6 >> 401541601) * (((hm) this).field_K * 2 + -1) % (((hm) this).field_K * 2);
                var8 = param0 & 16711935;
                var9 = param0 & 65280;
                var10 = var6 - var5;
                var11 = (int)(Math.sqrt((double)(var5 * var5 - var10 * var10)) / (double)var5 * 128.0) + 128;
                if (256 > var11) {
                  stackOut_6_0 = (-16711936 & var11 * var8 | 16711680 & var9 * var11) >>> 889520424;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_5_0 = var9 | var8;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
              L2: {
                var12 = stackIn_7_0;
                l.d(var7, var6, ((hm) this).field_K, var12);
                var8 = 16711935 & param2;
                l.d(-(2 * ((hm) this).field_K) + var7, var6, ((hm) this).field_K, var12);
                var9 = param2 & 65280;
                if (var11 >= 256) {
                  stackOut_9_0 = var8 | var9;
                  stackIn_10_0 = stackOut_9_0;
                  break L2;
                } else {
                  stackOut_8_0 = (var8 * var11 & -16711936 | var9 * var11 & 16711680) >>> 268548264;
                  stackIn_10_0 = stackOut_8_0;
                  break L2;
                }
              }
              var12 = stackIn_10_0;
              l.d(((hm) this).field_K + var7, var6, ((hm) this).field_K, var12);
              l.d(var7 + -((hm) this).field_K, var6, ((hm) this).field_K, var12);
              var6++;
              continue L0;
            }
          }
        } else {
          return null;
        }
    }

    private final void a(ci param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        L0: {
          var8 = Terraphoenix.field_V;
          if (param3 == -1) {
            break L0;
          } else {
            var9 = null;
            ((hm) this).a((gl) null, 26, 3, -111);
            break L0;
          }
        }
        var5 = ((hm) this).field_p + param2;
        di.a(-((hm) this).field_C.field_r + var5, param1, 16105, param1 + ((hm) this).field_n, ((hm) this).field_C.field_r + param2);
        var6 = -((hm) this).field_A + param2;
        L1: while (true) {
          if (var6 >= var5) {
            L2: {
              ij.a(false);
              if (l.field_b > param2 - -((hm) this).field_C.field_r) {
                break L2;
              } else {
                il.a(1, ((hm) this).field_I);
                param0.b(-((hm) this).field_A, 0);
                param0.b(2 * ((hm) this).field_K + -((hm) this).field_A, 0);
                ((hm) this).field_z.e(0, 0);
                ij.a(false);
                ((hm) this).field_I.b(param2, param1);
                break L2;
              }
            }
            L3: {
              if (l.field_f < -((hm) this).field_C.field_r + var5) {
                break L3;
              } else {
                il.a(1, ((hm) this).field_I);
                var7 = -((hm) this).field_C.field_r + (((hm) this).field_p - -((hm) this).field_A);
                L4: while (true) {
                  if (2 * ((hm) this).field_K >= var7) {
                    param0.b(-var7, 0);
                    param0.b(-var7 + ((hm) this).field_K * 2, 0);
                    ((hm) this).field_C.e(0, 0);
                    ij.a(false);
                    ((hm) this).field_I.b(-((hm) this).field_C.field_r + var5, param1);
                    break L3;
                  } else {
                    var7 = var7 - 2 * ((hm) this).field_K;
                    continue L4;
                  }
                }
              }
            }
            return;
          } else {
            param0.b(var6, param1);
            var6 = var6 + param0.field_r;
            continue L1;
          }
        }
    }

    final static String a(byte param0, CharSequence param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = Terraphoenix.field_V;
        if (param1 != null) {
          var2 = 0;
          var3 = param1.length();
          L0: while (true) {
            L1: {
              if (var2 >= var3) {
                break L1;
              } else {
                if (!ad.a((byte) 114, param1.charAt(var2))) {
                  break L1;
                } else {
                  var2++;
                  continue L0;
                }
              }
            }
            L2: while (true) {
              L3: {
                if (var3 <= var2) {
                  break L3;
                } else {
                  if (!ad.a((byte) 110, param1.charAt(-1 + var3))) {
                    break L3;
                  } else {
                    var3--;
                    continue L2;
                  }
                }
              }
              var5 = 33 / ((-61 - param0) / 40);
              var4 = -var2 + var3;
              if (-2 >= (var4 ^ -1)) {
                if (var4 <= 12) {
                  var6 = new StringBuilder(var4);
                  var7 = var2;
                  L4: while (true) {
                    if (var3 <= var7) {
                      if (0 != var6.length()) {
                        return var6.toString();
                      } else {
                        return null;
                      }
                    } else {
                      var8 = param1.charAt(var7);
                      if (ja.a((char) var8, (byte) 106)) {
                        var9 = kh.a((char) var8, (byte) -128);
                        if (0 != var9) {
                          StringBuilder discarded$1 = var6.append(var9);
                          var7++;
                          continue L4;
                        } else {
                          var7++;
                          continue L4;
                        }
                      } else {
                        var7++;
                        continue L4;
                      }
                    }
                  }
                } else {
                  return null;
                }
              } else {
                return null;
              }
            }
          }
        } else {
          return null;
        }
    }

    final void a(int param0, int param1, int param2) {
        ((hm) this).field_Q = param0;
        ((hm) this).field_B = param2;
        if (param1 != -7062047) {
            Object var5 = null;
            this.a((ci) null, 79, -24, 37);
        }
        ((hm) this).field_E = 8355711 & param0 >> 254778593;
        ((hm) this).field_F = param2 >> 1931818433 & 8355711;
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
        if (param3 < 25) {
            ((hm) this).field_M = 79;
        }
        if (((hm) this).field_P) {
            ((hm) this).field_A = ((hm) this).field_A + 1;
            if (((hm) this).field_A > ((hm) this).field_K * 2) {
                ((hm) this).field_A = ((hm) this).field_A - 2 * ((hm) this).field_K;
            }
        }
    }

    private final void e(byte param0) {
        ((hm) this).field_D = new ci[]{this.b(((hm) this).field_B, -27888, ((hm) this).field_Q), this.b(((hm) this).field_F, -27888, ((hm) this).field_E)};
        int var2 = -120 % ((12 - param0) / 40);
        ((hm) this).field_C = this.a(0);
        ((hm) this).field_z = ((hm) this).field_C.e();
        ((hm) this).field_I = new ci(((hm) this).field_n >> -1595266431, ((hm) this).field_n);
    }

    hm(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, (param5 & 16711422) >> -7062047, (param6 & 16711422) >> -413306751);
    }

    private hm(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        ((hm) this).field_B = param5;
        ((hm) this).field_F = param7;
        ((hm) this).field_K = param4;
        ((hm) this).field_E = param8;
        ((hm) this).field_Q = param6;
        ((hm) this).a(param1, (byte) 113, param2, param0, param3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "    Your soldier";
        field_G = "Left click to throw grenade";
        field_J = "SUCCESS";
    }
}
