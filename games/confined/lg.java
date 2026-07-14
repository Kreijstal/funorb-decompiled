/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class lg {
    private int[] field_r;
    private nk field_b;
    int field_y;
    private int[] field_p;
    private int field_e;
    private nk field_m;
    private nk field_g;
    private nk field_n;
    private nk field_h;
    private uf field_x;
    private static int[] field_u;
    int field_d;
    private static int[] field_c;
    private nk field_t;
    private int[] field_l;
    private nk field_k;
    private nk field_q;
    private int field_i;
    private static int[] field_v;
    private nk field_o;
    private static int[] field_a;
    private static int[] field_w;
    private static int[] field_j;
    private static int[] field_f;
    private static int[] field_s;

    private final int a(int param0, int param1, int param2) {
        if (param2 == 1) {
            if ((param0 & 32767) < 16384) {
                return param1;
            }
            return -param1;
        }
        if (param2 == 2) {
            return field_c[param0 & 32767] * param1 >> 14;
        }
        if (param2 == 3) {
            return ((param0 & 32767) * param1 >> 14) - param1;
        }
        if (param2 == 4) {
            return field_u[param0 / 2607 & 32767] * param1;
        }
        return 0;
    }

    public static void a() {
        field_v = null;
        field_u = null;
        field_c = null;
        field_w = null;
        field_s = null;
        field_a = null;
        field_j = null;
        field_f = null;
    }

    final void a(kg param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          ((lg) this).field_t = new nk();
          ((lg) this).field_t.b(param0);
          ((lg) this).field_o = new nk();
          ((lg) this).field_o.b(param0);
          var2 = param0.c(32);
          if (var2 == 0) {
            break L0;
          } else {
            param0.field_n = param0.field_n - 1;
            ((lg) this).field_q = new nk();
            ((lg) this).field_q.b(param0);
            ((lg) this).field_h = new nk();
            ((lg) this).field_h.b(param0);
            break L0;
          }
        }
        L1: {
          var2 = param0.c(32);
          if (var2 == 0) {
            break L1;
          } else {
            param0.field_n = param0.field_n - 1;
            ((lg) this).field_k = new nk();
            ((lg) this).field_k.b(param0);
            ((lg) this).field_b = new nk();
            ((lg) this).field_b.b(param0);
            break L1;
          }
        }
        L2: {
          var2 = param0.c(32);
          if (var2 == 0) {
            break L2;
          } else {
            param0.field_n = param0.field_n - 1;
            ((lg) this).field_n = new nk();
            ((lg) this).field_n.b(param0);
            ((lg) this).field_m = new nk();
            ((lg) this).field_m.b(param0);
            break L2;
          }
        }
        var3 = 0;
        L3: while (true) {
          L4: {
            if (var3 >= 10) {
              break L4;
            } else {
              var4 = param0.k((byte) -11);
              if (var4 != 0) {
                ((lg) this).field_r[var3] = var4;
                ((lg) this).field_p[var3] = param0.b(1647);
                ((lg) this).field_l[var3] = param0.k((byte) -11);
                var3++;
                continue L3;
              } else {
                break L4;
              }
            }
          }
          ((lg) this).field_i = param0.k((byte) -11);
          ((lg) this).field_e = param0.k((byte) -11);
          ((lg) this).field_d = param0.a((byte) 25);
          ((lg) this).field_y = param0.a((byte) 25);
          ((lg) this).field_x = new uf();
          ((lg) this).field_g = new nk();
          ((lg) this).field_x.a(param0, ((lg) this).field_g);
          return;
        }
    }

    final int[] a(int param0, int param1) {
        double var3 = 0.0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int stackIn_36_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_34_0 = 0;
        lj.a(field_v, 0, param0);
        if (param1 >= 10) {
          L0: {
            var3 = (double)param0 / ((double)param1 + 0.0);
            ((lg) this).field_t.a();
            ((lg) this).field_o.a();
            var5 = 0;
            var6 = 0;
            var7 = 0;
            if (((lg) this).field_q == null) {
              break L0;
            } else {
              ((lg) this).field_q.a();
              ((lg) this).field_h.a();
              var5 = (int)((double)(((lg) this).field_q.field_j - ((lg) this).field_q.field_i) * 32.768 / var3);
              var6 = (int)((double)((lg) this).field_q.field_i * 32.768 / var3);
              break L0;
            }
          }
          L1: {
            var8 = 0;
            var9 = 0;
            var10 = 0;
            if (((lg) this).field_k == null) {
              break L1;
            } else {
              ((lg) this).field_k.a();
              ((lg) this).field_b.a();
              var8 = (int)((double)(((lg) this).field_k.field_j - ((lg) this).field_k.field_i) * 32.768 / var3);
              var9 = (int)((double)((lg) this).field_k.field_i * 32.768 / var3);
              break L1;
            }
          }
          var11 = 0;
          L2: while (true) {
            if (var11 >= 5) {
              var11 = 0;
              L3: while (true) {
                if (var11 >= param0) {
                  L4: {
                    if (((lg) this).field_n == null) {
                      break L4;
                    } else {
                      ((lg) this).field_n.a();
                      ((lg) this).field_m.a();
                      var11 = 0;
                      var12 = 0;
                      var13 = 1;
                      var14 = 0;
                      L5: while (true) {
                        if (var14 >= param0) {
                          break L4;
                        } else {
                          L6: {
                            var15 = ((lg) this).field_n.a(param0);
                            var16 = ((lg) this).field_m.a(param0);
                            if (var13 == 0) {
                              var12 = ((lg) this).field_n.field_i + ((((lg) this).field_n.field_j - ((lg) this).field_n.field_i) * var16 >> 8);
                              break L6;
                            } else {
                              var12 = ((lg) this).field_n.field_i + ((((lg) this).field_n.field_j - ((lg) this).field_n.field_i) * var15 >> 8);
                              break L6;
                            }
                          }
                          L7: {
                            // wide iinc 11 256
                            if (var11 < var12) {
                              break L7;
                            } else {
                              L8: {
                                var11 = 0;
                                if (var13 != 0) {
                                  stackOut_35_0 = 0;
                                  stackIn_36_0 = stackOut_35_0;
                                  break L8;
                                } else {
                                  stackOut_34_0 = 1;
                                  stackIn_36_0 = stackOut_34_0;
                                  break L8;
                                }
                              }
                              var13 = stackIn_36_0;
                              break L7;
                            }
                          }
                          if (var13 != 0) {
                            field_v[var14] = 0;
                            var14++;
                            continue L5;
                          } else {
                            var14++;
                            continue L5;
                          }
                        }
                      }
                    }
                  }
                  L9: {
                    if (((lg) this).field_i <= 0) {
                      break L9;
                    } else {
                      if (((lg) this).field_e <= 0) {
                        break L9;
                      } else {
                        var11 = (int)((double)((lg) this).field_i * var3);
                        var12 = var11;
                        L10: while (true) {
                          if (var12 >= param0) {
                            break L9;
                          } else {
                            field_v[var12] = field_v[var12] + field_v[var12 - var11] * ((lg) this).field_e / 100;
                            var12++;
                            continue L10;
                          }
                        }
                      }
                    }
                  }
                  L11: {
                    L12: {
                      if (((lg) this).field_x.field_g[0] > 0) {
                        break L12;
                      } else {
                        if (((lg) this).field_x.field_g[1] <= 0) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    ((lg) this).field_g.a();
                    var11 = ((lg) this).field_g.a(param0 + 1);
                    var12 = ((lg) this).field_x.a(0, (float)var11 / 65536.0f);
                    var13 = ((lg) this).field_x.a(1, (float)var11 / 65536.0f);
                    if (param0 < var12 + var13) {
                      break L11;
                    } else {
                      L13: {
                        var14 = 0;
                        var15 = var13;
                        if (var15 <= param0 - var12) {
                          break L13;
                        } else {
                          var15 = param0 - var12;
                          break L13;
                        }
                      }
                      L14: while (true) {
                        if (var14 >= var15) {
                          var15 = 128;
                          L15: while (true) {
                            L16: {
                              if (var15 <= param0 - var12) {
                                break L16;
                              } else {
                                var15 = param0 - var12;
                                break L16;
                              }
                            }
                            L17: while (true) {
                              if (var14 >= var15) {
                                if (var14 < param0 - var12) {
                                  var12 = ((lg) this).field_x.a(0, (float)var11 / 65536.0f);
                                  var13 = ((lg) this).field_x.a(1, (float)var11 / 65536.0f);
                                  // wide iinc 15 128
                                  continue L15;
                                } else {
                                  L18: while (true) {
                                    if (var14 >= param0) {
                                      break L11;
                                    } else {
                                      var16 = 0;
                                      var17 = var14 + var12 - param0;
                                      L19: while (true) {
                                        if (var17 >= var12) {
                                          var17 = 0;
                                          L20: while (true) {
                                            if (var17 >= var13) {
                                              field_v[var14] = var16;
                                              var11 = ((lg) this).field_g.a(param0 + 1);
                                              var14++;
                                              continue L18;
                                            } else {
                                              var16 = var16 - (int)((long)field_v[var14 - 1 - var17] * (long)uf.field_f[1][var17] >> 16);
                                              var17++;
                                              continue L20;
                                            }
                                          }
                                        } else {
                                          var16 = var16 + (int)((long)field_v[var14 + var12 - 1 - var17] * (long)uf.field_f[0][var17] >> 16);
                                          var17++;
                                          continue L19;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                var16 = (int)((long)field_v[var14 + var12] * (long)uf.field_b >> 16);
                                var17 = 0;
                                L21: while (true) {
                                  if (var17 >= var12) {
                                    var17 = 0;
                                    L22: while (true) {
                                      if (var17 >= var13) {
                                        field_v[var14] = var16;
                                        var11 = ((lg) this).field_g.a(param0 + 1);
                                        var14++;
                                        continue L17;
                                      } else {
                                        var16 = var16 - (int)((long)field_v[var14 - 1 - var17] * (long)uf.field_f[1][var17] >> 16);
                                        var17++;
                                        continue L22;
                                      }
                                    }
                                  } else {
                                    var16 = var16 + (int)((long)field_v[var14 + var12 - 1 - var17] * (long)uf.field_f[0][var17] >> 16);
                                    var17++;
                                    continue L21;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var16 = (int)((long)field_v[var14 + var12] * (long)uf.field_b >> 16);
                          var17 = 0;
                          L23: while (true) {
                            if (var17 >= var12) {
                              var17 = 0;
                              L24: while (true) {
                                if (var17 >= var14) {
                                  field_v[var14] = var16;
                                  var11 = ((lg) this).field_g.a(param0 + 1);
                                  var14++;
                                  continue L14;
                                } else {
                                  var16 = var16 - (int)((long)field_v[var14 - 1 - var17] * (long)uf.field_f[1][var17] >> 16);
                                  var17++;
                                  continue L24;
                                }
                              }
                            } else {
                              var16 = var16 + (int)((long)field_v[var14 + var12 - 1 - var17] * (long)uf.field_f[0][var17] >> 16);
                              var17++;
                              continue L23;
                            }
                          }
                        }
                      }
                    }
                  }
                  var11 = 0;
                  L25: while (true) {
                    if (var11 >= param0) {
                      return field_v;
                    } else {
                      L26: {
                        if (field_v[var11] >= -32768) {
                          break L26;
                        } else {
                          field_v[var11] = -32768;
                          break L26;
                        }
                      }
                      if (field_v[var11] > 32767) {
                        field_v[var11] = 32767;
                        var11++;
                        continue L25;
                      } else {
                        var11++;
                        continue L25;
                      }
                    }
                  }
                } else {
                  L27: {
                    var12 = ((lg) this).field_t.a(param0);
                    var13 = ((lg) this).field_o.a(param0);
                    if (((lg) this).field_q == null) {
                      break L27;
                    } else {
                      var14 = ((lg) this).field_q.a(param0);
                      var15 = ((lg) this).field_h.a(param0);
                      var12 = var12 + (this.a(var7, var15, ((lg) this).field_q.field_d) >> 1);
                      var7 = var7 + ((var14 * var5 >> 16) + var6);
                      break L27;
                    }
                  }
                  L28: {
                    if (((lg) this).field_k == null) {
                      break L28;
                    } else {
                      var14 = ((lg) this).field_k.a(param0);
                      var15 = ((lg) this).field_b.a(param0);
                      var13 = var13 * ((this.a(var10, var15, ((lg) this).field_k.field_d) >> 1) + 32768) >> 15;
                      var10 = var10 + ((var14 * var8 >> 16) + var9);
                      break L28;
                    }
                  }
                  var14 = 0;
                  L29: while (true) {
                    if (var14 < 5) {
                      if (((lg) this).field_r[var14] != 0) {
                        var15 = var11 + field_s[var14];
                        if (var15 < param0) {
                          field_v[var15] = field_v[var15] + this.a(field_w[var14], var13 * field_a[var14] >> 15, ((lg) this).field_t.field_d);
                          field_w[var14] = field_w[var14] + ((var12 * field_j[var14] >> 16) + field_f[var14]);
                          var14++;
                          continue L29;
                        } else {
                          var14++;
                          continue L29;
                        }
                      } else {
                        var14++;
                        continue L29;
                      }
                    } else {
                      var11++;
                      continue L3;
                    }
                  }
                }
              }
            } else {
              if (((lg) this).field_r[var11] != 0) {
                field_w[var11] = 0;
                field_s[var11] = (int)((double)((lg) this).field_l[var11] * var3);
                field_a[var11] = (((lg) this).field_r[var11] << 14) / 100;
                field_j[var11] = (int)((double)(((lg) this).field_t.field_j - ((lg) this).field_t.field_i) * 32.768 * Math.pow(1.0057929410678534, (double)((lg) this).field_p[var11]) / var3);
                field_f[var11] = (int)((double)((lg) this).field_t.field_i * 32.768 / var3);
                var11++;
                continue L2;
              } else {
                var11++;
                continue L2;
              }
            }
          }
        } else {
          return field_v;
        }
    }

    lg() {
        ((lg) this).field_r = new int[]{0, 0, 0, 0, 0};
        ((lg) this).field_e = 100;
        ((lg) this).field_y = 0;
        ((lg) this).field_p = new int[]{0, 0, 0, 0, 0};
        ((lg) this).field_l = new int[]{0, 0, 0, 0, 0};
        ((lg) this).field_d = 500;
        ((lg) this).field_i = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var1 = 0;
        field_u = new int[32768];
        Random var0 = new Random(0L);
        for (var1 = 0; var1 < 32768; var1++) {
            field_u[var1] = (var0.nextInt() & 2) - 1;
        }
        field_c = new int[32768];
        for (var1 = 0; var1 < 32768; var1++) {
            field_c[var1] = (int)(Math.sin((double)var1 / 5215.1903) * 16384.0);
        }
        field_v = new int[220500];
        field_a = new int[5];
        field_j = new int[5];
        field_f = new int[5];
        field_w = new int[5];
        field_s = new int[5];
    }
}
