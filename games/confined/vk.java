/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

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
        int var2 = 0;
        int var3 = 0;
        bi var4 = null;
        int var5 = 0;
        var5 = Confined.field_J ? 1 : 0;
        if (null == ((vk) this).field_h) {
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
            if (var3 >= ((vk) this).field_e.length) {
              L2: {
                if (var2 != 0) {
                  ((vk) this).field_h = null;
                  ((vk) this).field_v = null;
                  ((vk) this).field_m = null;
                  break L2;
                } else {
                  break L2;
                }
              }
              return;
            } else {
              if (null == ((vk) this).field_e[var3]) {
                L3: {
                  if (((vk) this).field_C[var3] >> 4 != 0) {
                    var4 = ((vk) this).field_h.a(((vk) this).field_v[var3], (byte) 76, ((vk) this).field_m[var3]);
                    break L3;
                  } else {
                    var4 = ((vk) this).field_h.a(((vk) this).field_m[var3], ((vk) this).field_v[var3], 256);
                    break L3;
                  }
                }
                if (var4 != null) {
                  ((vk) this).field_C[var3] = va.a(((vk) this).field_C[var3], 15);
                  ((vk) this).field_e[var3] = var4;
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
        int var1 = -52;
    }

    final static String a(boolean param0, CharSequence param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String stackIn_3_0 = null;
        String stackIn_9_0 = null;
        String stackIn_14_0 = null;
        String stackIn_19_0 = null;
        String stackIn_27_0 = null;
        String stackIn_32_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_31_0 = null;
        String stackOut_26_0 = null;
        String stackOut_18_0 = null;
        String stackOut_13_0 = null;
        String stackOut_8_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        var8 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            if (param1 != null) {
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
                        if (var4.length() >= 1) {
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
                                      stackOut_31_0 = f.field_c;
                                      stackIn_32_0 = stackOut_31_0;
                                      break L0;
                                    } else {
                                      return null;
                                    }
                                  } else {
                                    L5: {
                                      var7 = param1.charAt(var6);
                                      if (bg.a(175, (char) var7)) {
                                        var5++;
                                        break L5;
                                      } else {
                                        var5 = 0;
                                        break L5;
                                      }
                                    }
                                    if (2 > var5) {
                                      var6++;
                                      continue L4;
                                    } else {
                                      stackOut_26_0 = hk.field_b;
                                      stackIn_27_0 = stackOut_26_0;
                                      return stackIn_27_0;
                                    }
                                  }
                                }
                              } else {
                                break L3;
                              }
                            }
                          }
                          stackOut_18_0 = f.field_c;
                          stackIn_19_0 = stackOut_18_0;
                          return stackIn_19_0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    stackOut_13_0 = ef.field_wb;
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0;
                  }
                }
              }
              stackOut_8_0 = ef.field_wb;
              stackIn_9_0 = stackOut_8_0;
              return stackIn_9_0;
            } else {
              stackOut_2_0 = ef.field_wb;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) var3;
            stackOut_33_1 = new StringBuilder().append("vk.C(").append(false).append(',');
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param1 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L6;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L6;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + ',' + -2 + ')');
        }
        return stackIn_32_0;
    }

    vk(kg param0, m param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        byte[] var16 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        try {
          L0: {
            ((vk) this).field_h = param1;
            ((vk) this).field_B = param0.c(32) + 1;
            int discarded$7 = param0.c(32);
            ((vk) this).field_t = param0.c(32) - -1;
            ((vk) this).field_y = 1 + param0.c(32);
            ((vk) this).field_G = param0.c(32) + 1;
            var3_int = param0.c(32);
            ((vk) this).field_q = var3_int & 1;
            ((vk) this).field_D = param0.c(32);
            ((vk) this).field_i = param0.c(32);
            ((vk) this).field_E = new int[((vk) this).field_B];
            var4 = 0;
            var5 = 0;
            L1: while (true) {
              if (((vk) this).field_B <= var5) {
                ((vk) this).field_l = new byte[256][];
                ((vk) this).field_p = new int[256];
                lj.a(((vk) this).field_p, 0, 256, 64);
                var5 = 0;
                L2: while (true) {
                  if (var5 >= 256) {
                    var5 = 0;
                    L3: while (true) {
                      if (((vk) this).field_y <= var5) {
                        ((vk) this).field_g = new int[((vk) this).field_G];
                        ((vk) this).field_b = new int[((vk) this).field_G][];
                        ((vk) this).field_z = new int[((vk) this).field_G];
                        ((vk) this).field_n = new int[((vk) this).field_G];
                        ((vk) this).field_a = new int[((vk) this).field_G][];
                        ((vk) this).field_w = new int[((vk) this).field_G];
                        ((vk) this).field_r = new int[((vk) this).field_G];
                        ((vk) this).field_f = new int[((vk) this).field_G][];
                        ((vk) this).field_A = new int[((vk) this).field_G][96];
                        ((vk) this).field_o = new int[((vk) this).field_G][];
                        ((vk) this).field_H = new int[((vk) this).field_G];
                        ((vk) this).field_d = new int[((vk) this).field_G];
                        ((vk) this).field_J = new int[((vk) this).field_G];
                        ((vk) this).field_k = new int[((vk) this).field_G];
                        var5 = param0.a((byte) 25);
                        ((vk) this).field_m = new int[var5];
                        ((vk) this).field_C = new int[var5];
                        ((vk) this).field_c = new int[var5];
                        ((vk) this).field_j = new int[var5];
                        ((vk) this).field_u = new int[var5];
                        ((vk) this).field_e = new bi[var5];
                        ((vk) this).field_F = new int[var5];
                        ((vk) this).field_s = new int[var5];
                        ((vk) this).field_v = new int[var5];
                        ((vk) this).field_I = new int[var5];
                        ((vk) this).field_K = new int[var5];
                        var5 = 0;
                        var6 = 0;
                        L4: while (true) {
                          if (var6 >= ((vk) this).field_G) {
                            this.a(false);
                            break L0;
                          } else {
                            L5: {
                              var7 = param0.c(32);
                              if (var7 <= 0) {
                                break L5;
                              } else {
                                var4 = 0;
                                var8 = 0;
                                L6: while (true) {
                                  if (var8 >= 96) {
                                    ((vk) this).field_H[var6] = param0.c(32);
                                    var8 = param0.c(32);
                                    ((vk) this).field_g[var6] = param0.c(32);
                                    ((vk) this).field_n[var6] = param0.c(32);
                                    ((vk) this).field_z[var6] = ((vk) this).field_n[var6] + param0.c(32);
                                    ((vk) this).field_k[var6] = param0.c(32);
                                    var9 = param0.c(32);
                                    ((vk) this).field_r[var6] = param0.c(32);
                                    ((vk) this).field_J[var6] = param0.c(32);
                                    ((vk) this).field_d[var6] = ((vk) this).field_J[var6] - -param0.c(32);
                                    ((vk) this).field_f[var6] = new int[var8];
                                    var4 = 0;
                                    var10 = 0;
                                    var11 = 0;
                                    L7: while (true) {
                                      if (var8 <= var11) {
                                        ((vk) this).field_b[var6] = new int[var8];
                                        var4 = 0;
                                        var11 = 0;
                                        L8: while (true) {
                                          if (var8 <= var11) {
                                            ((vk) this).field_o[var6] = new int[var9];
                                            var10 = 0;
                                            var4 = 0;
                                            var11 = 0;
                                            L9: while (true) {
                                              if (var9 <= var11) {
                                                var4 = 0;
                                                ((vk) this).field_a[var6] = new int[var9];
                                                var11 = 0;
                                                L10: while (true) {
                                                  if (var11 >= var9) {
                                                    ((vk) this).field_w[var6] = param0.a((byte) 25);
                                                    var11 = 0;
                                                    L11: while (true) {
                                                      if (var11 >= var7) {
                                                        break L5;
                                                      } else {
                                                        ((vk) this).field_s[var5] = param0.f(-109);
                                                        ((vk) this).field_j[var5] = param0.f(-95);
                                                        ((vk) this).field_u[var5] = ((vk) this).field_j[var5] + param0.f(-54);
                                                        ((vk) this).field_I[var5] = param0.c(32);
                                                        ((vk) this).field_c[var5] = param0.b(true);
                                                        ((vk) this).field_C[var5] = param0.c(32);
                                                        ((vk) this).field_F[var5] = param0.c(32);
                                                        ((vk) this).field_K[var5] = -1 + param0.b(true);
                                                        ((vk) this).field_m[var5] = param0.a((byte) 25);
                                                        ((vk) this).field_v[var5] = param0.a((byte) 25);
                                                        var5++;
                                                        var11++;
                                                        continue L11;
                                                      }
                                                    }
                                                  } else {
                                                    int dupTemp$8 = var4 + param0.c(32);
                                                    var4 = dupTemp$8;
                                                    ((vk) this).field_a[var6][var11] = va.a(dupTemp$8, 255);
                                                    var11++;
                                                    continue L10;
                                                  }
                                                }
                                              } else {
                                                int dupTemp$9 = var10 + param0.b(1647);
                                                var10 = dupTemp$9;
                                                var4 = var4 + dupTemp$9;
                                                ((vk) this).field_o[var6][var11] = var4 + dupTemp$9;
                                                var11++;
                                                continue L9;
                                              }
                                            }
                                          } else {
                                            int dupTemp$10 = var4 + param0.c(32);
                                            var4 = dupTemp$10;
                                            ((vk) this).field_b[var6][var11] = va.a(dupTemp$10, 255);
                                            var11++;
                                            continue L8;
                                          }
                                        }
                                      } else {
                                        int dupTemp$11 = var10 + param0.b(1647);
                                        var10 = dupTemp$11;
                                        var4 = var4 + dupTemp$11;
                                        ((vk) this).field_f[var6][var11] = var4 + dupTemp$11;
                                        var11++;
                                        continue L7;
                                      }
                                    }
                                  } else {
                                    int dupTemp$12 = var4 + param0.c(32);
                                    var4 = dupTemp$12;
                                    ((vk) this).field_A[var6][var8] = va.a(255, dupTemp$12) + var5;
                                    var8++;
                                    continue L6;
                                  }
                                }
                              }
                            }
                            var6++;
                            continue L4;
                          }
                        }
                      } else {
                        L12: {
                          ((vk) this).field_p[var5] = 1 + param0.c(32);
                          var6 = param0.a((byte) 25);
                          var16 = new byte[var6];
                          if (var6 <= 0) {
                            break L12;
                          } else {
                            param0.a(0, (byte) 64, var6, var16);
                            ((vk) this).field_l[var5] = var16;
                            break L12;
                          }
                        }
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    ((vk) this).field_l[var5] = sa.field_V;
                    var5++;
                    continue L2;
                  }
                }
              } else {
                int dupTemp$13 = var4 + param0.c(32);
                var4 = dupTemp$13;
                ((vk) this).field_E[var5] = va.a(255, dupTemp$13);
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var3 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) var3;
            stackOut_36_1 = new StringBuilder().append("vk.<init>(");
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param0 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L13;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L13;
            }
          }
          L14: {
            stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
            stackOut_39_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_39_2).append(',');
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param1 == null) {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L14;
            } else {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              break L14;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = "Loading textures";
    }
}
