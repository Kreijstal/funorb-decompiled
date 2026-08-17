/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk {
    int[] field_k;
    int[] field_F;
    byte[][] field_l;
    private int field_G;
    int[][] field_o;
    bi[] field_e;
    int[] field_u;
    int[] field_w;
    int field_i;
    int[] field_r;
    int[] field_p;
    int[][] field_a;
    int[] field_j;
    int[] field_H;
    int[] field_s;
    int[] field_d;
    int[] field_I;
    private m field_h;
    int field_q;
    private int[] field_v;
    int[][] field_A;
    int[][] field_b;
    int[] field_n;
    int[] field_g;
    private int[] field_m;
    int field_t;
    int[] field_c;
    int[] field_z;
    int[][] field_f;
    int field_D;
    int field_B;
    int[] field_J;
    int[] field_E;
    private int field_y;
    int[] field_C;
    static String field_x;
    int[] field_K;

    private final void a(boolean param0) {
        int var2;
        int var3;
        int var5;
        bi var4;
        var5 = Confined.field_J ? 1 : 0;
        if (null == this.field_h) {
          return;
        } else {
          L0: {
            var2 = 1;
            if (!param0) {
              break L0;
            } else {
              this.a(true);
              break L0;
            }
          }
          var3 = 0;
          L1: while (true) {
            if (var3 >= this.field_e.length) {
              L2: {
                if (var2 != 0) {
                  this.field_h = null;
                  this.field_v = null;
                  this.field_m = null;
                  break L2;
                } else {
                  break L2;
                }
              }
              return;
            } else {
              if (null == this.field_e[var3]) {
                L3: {
                  if (-1 != (this.field_C[var3] >> 1725922564 ^ -1)) {
                    var4 = this.field_h.a(this.field_v[var3], (byte) 76, this.field_m[var3]);
                    break L3;
                  } else {
                    var4 = this.field_h.a(this.field_m[var3], this.field_v[var3], 256);
                    break L3;
                  }
                }
                if (var4 != null) {
                  this.field_C[var3] = va.a(this.field_C[var3], 15);
                  this.field_e[var3] = var4;
                  var3++;
                  continue L1;
                } else {
                  var2 = 0;
                  var3++;
                  continue L1;
                }
              } else {
                var3++;
                continue L1;
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        field_x = null;
        int var1 = -52 / ((-60 - param0) / 49);
    }

    final static String a(boolean param0, CharSequence param1, byte param2) {
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_11_0 = null;
        String stackIn_16_0 = null;
        String stackIn_21_0 = null;
        String stackIn_31_0 = null;
        String stackIn_36_0 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            if (param1 != null) {
              if (param2 == -2) {
                L1: {
                  var3_int = param1.length();
                  if (var3_int < 1) {
                    break L1;
                  } else {
                    if (12 < var3_int) {
                      break L1;
                    } else {
                      L2: {
                        var4 = hh.a(0, param1);
                        if (var4 == null) {
                          break L2;
                        } else {
                          if (-2 >= (var4.length() ^ -1)) {
                            L3: {
                              if (bg.a(175, var4.charAt(0))) {
                                break L3;
                              } else {
                                if (!bg.a(175, var4.charAt(var4.length() - 1))) {
                                  var5 = 0;
                                  var6 = 0;
                                  L4: while (true) {
                                    if (param1.length() <= var6) {
                                      if (0 < var5) {
                                        stackIn_36_0 = f.field_c;
                                        decompiledRegionSelector0 = 6;
                                        break L0;
                                      } else {
                                        return null;
                                      }
                                    } else {
                                      L5: {
                                        var7 = param1.charAt(var6);
                                        if (bg.a(param2 + 177, (char) var7)) {
                                          var5++;
                                          break L5;
                                        } else {
                                          var5 = 0;
                                          break L5;
                                        }
                                      }
                                      L6: {
                                        if (2 > var5) {
                                          break L6;
                                        } else {
                                          if (!param0) {
                                            stackIn_31_0 = hk.field_b;
                                            decompiledRegionSelector0 = 5;
                                            break L0;
                                          } else {
                                            break L6;
                                          }
                                        }
                                      }
                                      var6++;
                                      continue L4;
                                    }
                                  }
                                } else {
                                  break L3;
                                }
                              }
                            }
                            stackIn_21_0 = f.field_c;
                            decompiledRegionSelector0 = 4;
                            break L0;
                          } else {
                            break L2;
                          }
                        }
                      }
                      stackIn_16_0 = ef.field_wb;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  }
                }
                stackIn_11_0 = ef.field_wb;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_6_0 = (String) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = ef.field_wb;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_39_0 = (RuntimeException) (var3);

            stackIn_39_1 = new StringBuilder().append("vk.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "null";
              break L7;
            } else {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "{...}";
              break L7;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_16_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_21_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_31_0;
                  } else {
                    return stackIn_36_0;
                  }
                }
              }
            }
          }
        }
    }

    vk(kg param0, m param1) {
        int var3_int = 0;
        int var4 = 0;
        int dupTemp$0 = 0;
        byte[] var16 = null;
        int var7 = 0;
        int dupTemp$1 = 0;
        int var9 = 0;
        int[] array$2 = null;
        int var10 = 0;
        int dupTemp$3 = 0;
        int localTemp$4 = 0;
        int[] array$5 = null;
        int dupTemp$6 = 0;
        int[] array$7 = null;
        int dupTemp$8 = 0;
        int localTemp$9 = 0;
        int[] array$10 = null;
        int dupTemp$11 = 0;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var11 = 0;
        try {
            this.field_h = param1;
            this.field_B = param0.c(32) + 1;
            param0.c(32);
            this.field_t = param0.c(32) - -1;
            this.field_y = 1 + param0.c(32);
            this.field_G = param0.c(32) + 1;
            var3_int = param0.c(32);
            this.field_q = var3_int & 1;
            this.field_D = param0.c(32);
            this.field_i = param0.c(32);
            this.field_E = new int[this.field_B];
            var4 = 0;
            for (var5 = 0; this.field_B > var5; var5++) {
                dupTemp$0 = var4 + param0.c(32);
                var4 = dupTemp$0;
                this.field_E[var5] = va.a(255, dupTemp$0);
            }
            this.field_l = new byte[256][];
            this.field_p = new int[256];
            lj.a(this.field_p, 0, 256, 64);
            for (var5 = 0; -257 < (var5 ^ -1); var5++) {
                this.field_l[var5] = sa.field_V;
            }
            for (var5 = 0; this.field_y > var5; var5++) {
                this.field_p[var5] = 1 + param0.c(32);
                var6 = param0.a((byte) 25);
                var16 = new byte[var6];
                if ((var6 ^ -1) < -1) {
                    param0.a(0, (byte) 64, var6, var16);
                    this.field_l[var5] = var16;
                }
            }
            this.field_g = new int[this.field_G];
            this.field_b = new int[this.field_G][];
            this.field_z = new int[this.field_G];
            this.field_n = new int[this.field_G];
            this.field_a = new int[this.field_G][];
            this.field_w = new int[this.field_G];
            this.field_r = new int[this.field_G];
            this.field_f = new int[this.field_G][];
            this.field_A = new int[this.field_G][96];
            this.field_o = new int[this.field_G][];
            this.field_H = new int[this.field_G];
            this.field_d = new int[this.field_G];
            this.field_J = new int[this.field_G];
            this.field_k = new int[this.field_G];
            var5 = param0.a((byte) 25);
            this.field_m = new int[var5];
            this.field_C = new int[var5];
            this.field_c = new int[var5];
            this.field_j = new int[var5];
            this.field_u = new int[var5];
            this.field_e = new bi[var5];
            this.field_F = new int[var5];
            this.field_s = new int[var5];
            this.field_v = new int[var5];
            this.field_I = new int[var5];
            this.field_K = new int[var5];
            var5 = 0;
            for (var6 = 0; var6 < this.field_G; var6++) {
                var7 = param0.c(32);
                if (-1 > (var7 ^ -1)) {
                    var4 = 0;
                    for (var8 = 0; var8 < 96; var8++) {
                        dupTemp$1 = var4 + param0.c(32);
                        var4 = dupTemp$1;
                        this.field_A[var6][var8] = va.a(255, dupTemp$1) + var5;
                    }
                    this.field_H[var6] = param0.c(32);
                    var8 = param0.c(32);
                    this.field_g[var6] = param0.c(32);
                    this.field_n[var6] = param0.c(32);
                    this.field_z[var6] = this.field_n[var6] + param0.c(32);
                    this.field_k[var6] = param0.c(32);
                    var9 = param0.c(32);
                    this.field_r[var6] = param0.c(32);
                    this.field_J[var6] = param0.c(32);
                    this.field_d[var6] = this.field_J[var6] - -param0.c(32);
                    array$2 = new int[var8];
                    this.field_f[var6] = array$2;
                    var4 = 0;
                    var10 = 0;
                    for (var11 = 0; var8 > var11; var11++) {
                        dupTemp$3 = var10 + param0.b(1647);
                        var10 = dupTemp$3;
                        localTemp$4 = var4 + dupTemp$3;
                        var4 = localTemp$4;
                        this.field_f[var6][var11] = localTemp$4;
                    }
                    array$5 = new int[var8];
                    this.field_b[var6] = array$5;
                    var4 = 0;
                    for (var11 = 0; var8 > var11; var11++) {
                        dupTemp$6 = var4 + param0.c(32);
                        var4 = dupTemp$6;
                        this.field_b[var6][var11] = va.a(dupTemp$6, 255);
                    }
                    array$7 = new int[var9];
                    this.field_o[var6] = array$7;
                    var10 = 0;
                    var4 = 0;
                    for (var11 = 0; var9 > var11; var11++) {
                        dupTemp$8 = var10 + param0.b(1647);
                        var10 = dupTemp$8;
                        localTemp$9 = var4 + dupTemp$8;
                        var4 = localTemp$9;
                        this.field_o[var6][var11] = localTemp$9;
                    }
                    var4 = 0;
                    array$10 = new int[var9];
                    this.field_a[var6] = array$10;
                    for (var11 = 0; var11 < var9; var11++) {
                        dupTemp$11 = var4 + param0.c(32);
                        var4 = dupTemp$11;
                        this.field_a[var6][var11] = va.a(dupTemp$11, 255);
                    }
                    this.field_w[var6] = param0.a((byte) 25);
                    for (var11 = 0; var11 < var7; var11++) {
                        this.field_s[var5] = param0.f(-109);
                        this.field_j[var5] = param0.f(-95);
                        this.field_u[var5] = this.field_j[var5] + param0.f(-54);
                        this.field_I[var5] = param0.c(32);
                        this.field_c[var5] = param0.b(true);
                        this.field_C[var5] = param0.c(32);
                        this.field_F[var5] = param0.c(32);
                        this.field_K[var5] = -1 + param0.b(true);
                        this.field_m[var5] = param0.a((byte) 25);
                        this.field_v[var5] = param0.a((byte) 25);
                        var5++;
                    }
                }
            }
            this.a(false);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "vk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_x = "Loading textures";
    }
}
