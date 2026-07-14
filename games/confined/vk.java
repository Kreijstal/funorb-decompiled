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
                  if (-1 != (((vk) this).field_C[var3] >> 1725922564 ^ -1)) {
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
        int var1 = -52 / ((-60 - param0) / 49);
    }

    final static String a(boolean param0, CharSequence param1, byte param2) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Confined.field_J ? 1 : 0;
        if (param1 != null) {
          if (param2 == -2) {
            L0: {
              var3 = param1.length();
              if (var3 < 1) {
                break L0;
              } else {
                if (12 < var3) {
                  break L0;
                } else {
                  L1: {
                    var4 = hh.a(0, param1);
                    if (var4 == null) {
                      break L1;
                    } else {
                      if (-2 >= (var4.length() ^ -1)) {
                        L2: {
                          if (bg.a(175, var4.charAt(0))) {
                            break L2;
                          } else {
                            if (!bg.a(175, var4.charAt(var4.length() - 1))) {
                              var5 = 0;
                              var6 = 0;
                              L3: while (true) {
                                if (param1.length() <= var6) {
                                  if (0 < var5) {
                                    return f.field_c;
                                  } else {
                                    return null;
                                  }
                                } else {
                                  L4: {
                                    var7 = param1.charAt(var6);
                                    if (bg.a(param2 + 177, (char) var7)) {
                                      var5++;
                                      break L4;
                                    } else {
                                      var5 = 0;
                                      break L4;
                                    }
                                  }
                                  if (2 <= var5) {
                                    if (!param0) {
                                      return hk.field_b;
                                    } else {
                                      var6++;
                                      continue L3;
                                    }
                                  } else {
                                    var6++;
                                    continue L3;
                                  }
                                }
                              }
                            } else {
                              break L2;
                            }
                          }
                        }
                        return f.field_c;
                      } else {
                        break L1;
                      }
                    }
                  }
                  return ef.field_wb;
                }
              }
            }
            return ef.field_wb;
          } else {
            return null;
          }
        } else {
          return ef.field_wb;
        }
    }

    vk(kg param0, m param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        byte[] var16 = null;
        ((vk) this).field_h = param1;
        ((vk) this).field_B = param0.c(32) + 1;
        int discarded$1 = param0.c(32);
        ((vk) this).field_t = param0.c(32) - -1;
        ((vk) this).field_y = 1 + param0.c(32);
        ((vk) this).field_G = param0.c(32) + 1;
        var3 = param0.c(32);
        ((vk) this).field_q = var3 & 1;
        ((vk) this).field_D = param0.c(32);
        ((vk) this).field_i = param0.c(32);
        ((vk) this).field_E = new int[((vk) this).field_B];
        var4 = 0;
        var5 = 0;
        L0: while (true) {
          if (((vk) this).field_B <= var5) {
            ((vk) this).field_l = new byte[256][];
            ((vk) this).field_p = new int[256];
            lj.a(((vk) this).field_p, 0, 256, 64);
            var5 = 0;
            L1: while (true) {
              if (-257 >= (var5 ^ -1)) {
                var5 = 0;
                L2: while (true) {
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
                    L3: while (true) {
                      if (var6 >= ((vk) this).field_G) {
                        this.a(false);
                      } else {
                        var7 = param0.c(32);
                        if (-1 > (var7 ^ -1)) {
                          var4 = 0;
                          var8 = 0;
                          L4: while (true) {
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
                              L5: while (true) {
                                if (var8 <= var11) {
                                  ((vk) this).field_b[var6] = new int[var8];
                                  var4 = 0;
                                  var11 = 0;
                                  L6: while (true) {
                                    if (var8 <= var11) {
                                      ((vk) this).field_o[var6] = new int[var9];
                                      var10 = 0;
                                      var4 = 0;
                                      var11 = 0;
                                      L7: while (true) {
                                        if (var9 <= var11) {
                                          var4 = 0;
                                          ((vk) this).field_a[var6] = new int[var9];
                                          var11 = 0;
                                          L8: while (true) {
                                            if (var11 >= var9) {
                                              ((vk) this).field_w[var6] = param0.a((byte) 25);
                                              var11 = 0;
                                              L9: while (true) {
                                                if (var11 < var7) {
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
                                                  continue L9;
                                                } else {
                                                  var6++;
                                                  continue L3;
                                                }
                                              }
                                            } else {
                                              var4 = var4 + param0.c(32);
                                              ((vk) this).field_a[var6][var11] = va.a(var4 + param0.c(32), 255);
                                              var11++;
                                              continue L8;
                                            }
                                          }
                                        } else {
                                          var10 = var10 + param0.b(1647);
                                          var4 = var4 + (var10 + param0.b(1647));
                                          ((vk) this).field_o[var6][var11] = var4 + (var10 + param0.b(1647));
                                          var11++;
                                          continue L7;
                                        }
                                      }
                                    } else {
                                      var4 = var4 + param0.c(32);
                                      ((vk) this).field_b[var6][var11] = va.a(var4 + param0.c(32), 255);
                                      var11++;
                                      continue L6;
                                    }
                                  }
                                } else {
                                  var10 = var10 + param0.b(1647);
                                  var4 = var4 + (var10 + param0.b(1647));
                                  ((vk) this).field_f[var6][var11] = var4 + (var10 + param0.b(1647));
                                  var11++;
                                  continue L5;
                                }
                              }
                            } else {
                              var4 = var4 + param0.c(32);
                              ((vk) this).field_A[var6][var8] = va.a(255, var4 + param0.c(32)) + var5;
                              var8++;
                              continue L4;
                            }
                          }
                        } else {
                          var6++;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    ((vk) this).field_p[var5] = 1 + param0.c(32);
                    var6 = param0.a((byte) 25);
                    var16 = new byte[var6];
                    if ((var6 ^ -1) < -1) {
                      param0.a(0, (byte) 64, var6, var16);
                      ((vk) this).field_l[var5] = var16;
                      var5++;
                      continue L2;
                    } else {
                      var5++;
                      continue L2;
                    }
                  }
                }
              } else {
                ((vk) this).field_l[var5] = sa.field_V;
                var5++;
                continue L1;
              }
            }
          } else {
            var4 = var4 + param0.c(32);
            ((vk) this).field_E[var5] = va.a(255, var4 + param0.c(32));
            var5++;
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = "Loading textures";
    }
}
