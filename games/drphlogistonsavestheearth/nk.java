/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class nk {
    private da field_n;
    private int[] field_o;
    private lj field_f;
    private lj field_j;
    private lj field_q;
    private lj field_d;
    private int[] field_i;
    private lj field_m;
    private int field_p;
    private lj field_l;
    private static int[] field_k;
    private lj field_u;
    private lj field_c;
    int field_r;
    int field_t;
    private int field_a;
    private static int[] field_g;
    private lj field_h;
    private static int[] field_b;
    private int[] field_s;
    private static int[] field_x;
    private static int[] field_w;
    private static int[] field_e;
    private static int[] field_v;
    private static int[] field_y;

    private final int a(int param0, int param1, int param2) {
        if (param2 == 1) {
            if ((param0 & 32767) < 16384) {
                return param1;
            }
            return -param1;
        }
        if (param2 == 2) {
            return field_k[param0 & 32767] * param1 >> 14;
        }
        if (param2 == 3) {
            return ((param0 & 32767) * param1 >> 14) - param1;
        }
        if (param2 == 4) {
            return field_b[param0 / 2607 & 32767] * param1;
        }
        return 0;
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
        kg.a(field_g, 0, param0);
        if (param1 >= 10) {
          L0: {
            var3 = (double)param0 / ((double)param1 + 0.0);
            ((nk) this).field_c.a();
            ((nk) this).field_f.a();
            var5 = 0;
            var6 = 0;
            var7 = 0;
            if (((nk) this).field_m == null) {
              break L0;
            } else {
              ((nk) this).field_m.a();
              ((nk) this).field_l.a();
              var5 = (int)((double)(((nk) this).field_m.field_h - ((nk) this).field_m.field_b) * 32.768 / var3);
              var6 = (int)((double)((nk) this).field_m.field_b * 32.768 / var3);
              break L0;
            }
          }
          L1: {
            var8 = 0;
            var9 = 0;
            var10 = 0;
            if (((nk) this).field_u == null) {
              break L1;
            } else {
              ((nk) this).field_u.a();
              ((nk) this).field_h.a();
              var8 = (int)((double)(((nk) this).field_u.field_h - ((nk) this).field_u.field_b) * 32.768 / var3);
              var9 = (int)((double)((nk) this).field_u.field_b * 32.768 / var3);
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
                    if (((nk) this).field_d == null) {
                      break L4;
                    } else {
                      ((nk) this).field_d.a();
                      ((nk) this).field_j.a();
                      var11 = 0;
                      var12 = 0;
                      var13 = 1;
                      var14 = 0;
                      L5: while (true) {
                        if (var14 >= param0) {
                          break L4;
                        } else {
                          L6: {
                            var15 = ((nk) this).field_d.a(param0);
                            var16 = ((nk) this).field_j.a(param0);
                            if (var13 == 0) {
                              var12 = ((nk) this).field_d.field_b + ((((nk) this).field_d.field_h - ((nk) this).field_d.field_b) * var16 >> 8);
                              break L6;
                            } else {
                              var12 = ((nk) this).field_d.field_b + ((((nk) this).field_d.field_h - ((nk) this).field_d.field_b) * var15 >> 8);
                              break L6;
                            }
                          }
                          L7: {
                            var11 += 256;
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
                            field_g[var14] = 0;
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
                    if (((nk) this).field_p <= 0) {
                      break L9;
                    } else {
                      if (((nk) this).field_a <= 0) {
                        break L9;
                      } else {
                        var11 = (int)((double)((nk) this).field_p * var3);
                        var12 = var11;
                        L10: while (true) {
                          if (var12 >= param0) {
                            break L9;
                          } else {
                            field_g[var12] = field_g[var12] + field_g[var12 - var11] * ((nk) this).field_a / 100;
                            var12++;
                            continue L10;
                          }
                        }
                      }
                    }
                  }
                  L11: {
                    L12: {
                      if (((nk) this).field_n.field_f[0] > 0) {
                        break L12;
                      } else {
                        if (((nk) this).field_n.field_f[1] <= 0) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    ((nk) this).field_q.a();
                    var11 = ((nk) this).field_q.a(param0 + 1);
                    var12 = ((nk) this).field_n.a(0, (float)var11 / 65536.0f);
                    var13 = ((nk) this).field_n.a(1, (float)var11 / 65536.0f);
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
                                  var12 = ((nk) this).field_n.a(0, (float)var11 / 65536.0f);
                                  var13 = ((nk) this).field_n.a(1, (float)var11 / 65536.0f);
                                  var15 += 128;
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
                                              field_g[var14] = var16;
                                              var11 = ((nk) this).field_q.a(param0 + 1);
                                              var14++;
                                              continue L18;
                                            } else {
                                              var16 = var16 - (int)((long)field_g[var14 - 1 - var17] * (long)da.field_b[1][var17] >> 16);
                                              var17++;
                                              continue L20;
                                            }
                                          }
                                        } else {
                                          var16 = var16 + (int)((long)field_g[var14 + var12 - 1 - var17] * (long)da.field_b[0][var17] >> 16);
                                          var17++;
                                          continue L19;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                var16 = (int)((long)field_g[var14 + var12] * (long)da.field_e >> 16);
                                var17 = 0;
                                L21: while (true) {
                                  if (var17 >= var12) {
                                    var17 = 0;
                                    L22: while (true) {
                                      if (var17 >= var13) {
                                        field_g[var14] = var16;
                                        var11 = ((nk) this).field_q.a(param0 + 1);
                                        var14++;
                                        continue L17;
                                      } else {
                                        var16 = var16 - (int)((long)field_g[var14 - 1 - var17] * (long)da.field_b[1][var17] >> 16);
                                        var17++;
                                        continue L22;
                                      }
                                    }
                                  } else {
                                    var16 = var16 + (int)((long)field_g[var14 + var12 - 1 - var17] * (long)da.field_b[0][var17] >> 16);
                                    var17++;
                                    continue L21;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var16 = (int)((long)field_g[var14 + var12] * (long)da.field_e >> 16);
                          var17 = 0;
                          L23: while (true) {
                            if (var17 >= var12) {
                              var17 = 0;
                              L24: while (true) {
                                if (var17 >= var14) {
                                  field_g[var14] = var16;
                                  var11 = ((nk) this).field_q.a(param0 + 1);
                                  var14++;
                                  continue L14;
                                } else {
                                  var16 = var16 - (int)((long)field_g[var14 - 1 - var17] * (long)da.field_b[1][var17] >> 16);
                                  var17++;
                                  continue L24;
                                }
                              }
                            } else {
                              var16 = var16 + (int)((long)field_g[var14 + var12 - 1 - var17] * (long)da.field_b[0][var17] >> 16);
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
                      return field_g;
                    } else {
                      L26: {
                        if (field_g[var11] >= -32768) {
                          break L26;
                        } else {
                          field_g[var11] = -32768;
                          break L26;
                        }
                      }
                      if (field_g[var11] > 32767) {
                        field_g[var11] = 32767;
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
                    var12 = ((nk) this).field_c.a(param0);
                    var13 = ((nk) this).field_f.a(param0);
                    if (((nk) this).field_m == null) {
                      break L27;
                    } else {
                      var14 = ((nk) this).field_m.a(param0);
                      var15 = ((nk) this).field_l.a(param0);
                      var12 = var12 + (this.a(var7, var15, ((nk) this).field_m.field_e) >> 1);
                      var7 = var7 + ((var14 * var5 >> 16) + var6);
                      break L27;
                    }
                  }
                  L28: {
                    if (((nk) this).field_u == null) {
                      break L28;
                    } else {
                      var14 = ((nk) this).field_u.a(param0);
                      var15 = ((nk) this).field_h.a(param0);
                      var13 = var13 * ((this.a(var10, var15, ((nk) this).field_u.field_e) >> 1) + 32768) >> 15;
                      var10 = var10 + ((var14 * var8 >> 16) + var9);
                      break L28;
                    }
                  }
                  var14 = 0;
                  L29: while (true) {
                    if (var14 < 5) {
                      if (((nk) this).field_i[var14] != 0) {
                        var15 = var11 + field_e[var14];
                        if (var15 < param0) {
                          field_g[var15] = field_g[var15] + this.a(field_w[var14], var13 * field_x[var14] >> 15, ((nk) this).field_c.field_e);
                          field_w[var14] = field_w[var14] + ((var12 * field_y[var14] >> 16) + field_v[var14]);
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
              if (((nk) this).field_i[var11] != 0) {
                field_w[var11] = 0;
                field_e[var11] = (int)((double)((nk) this).field_o[var11] * var3);
                field_x[var11] = (((nk) this).field_i[var11] << 14) / 100;
                field_y[var11] = (int)((double)(((nk) this).field_c.field_h - ((nk) this).field_c.field_b) * 32.768 * Math.pow(1.0057929410678534, (double)((nk) this).field_s[var11]) / var3);
                field_v[var11] = (int)((double)((nk) this).field_c.field_b * 32.768 / var3);
                var11++;
                continue L2;
              } else {
                var11++;
                continue L2;
              }
            }
          }
        } else {
          return field_g;
        }
    }

    final void a(od param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          ((nk) this).field_c = new lj();
          ((nk) this).field_c.b(param0);
          ((nk) this).field_f = new lj();
          ((nk) this).field_f.b(param0);
          var2 = param0.l(31760);
          if (var2 == 0) {
            break L0;
          } else {
            param0.field_j = param0.field_j - 1;
            ((nk) this).field_m = new lj();
            ((nk) this).field_m.b(param0);
            ((nk) this).field_l = new lj();
            ((nk) this).field_l.b(param0);
            break L0;
          }
        }
        L1: {
          var2 = param0.l(31760);
          if (var2 == 0) {
            break L1;
          } else {
            param0.field_j = param0.field_j - 1;
            ((nk) this).field_u = new lj();
            ((nk) this).field_u.b(param0);
            ((nk) this).field_h = new lj();
            ((nk) this).field_h.b(param0);
            break L1;
          }
        }
        L2: {
          var2 = param0.l(31760);
          if (var2 == 0) {
            break L2;
          } else {
            param0.field_j = param0.field_j - 1;
            ((nk) this).field_d = new lj();
            ((nk) this).field_d.b(param0);
            ((nk) this).field_j = new lj();
            ((nk) this).field_j.b(param0);
            break L2;
          }
        }
        var3 = 0;
        L3: while (true) {
          L4: {
            if (var3 >= 10) {
              break L4;
            } else {
              var4 = param0.k(7021);
              if (var4 != 0) {
                ((nk) this).field_i[var3] = var4;
                ((nk) this).field_s[var3] = param0.f(2350);
                ((nk) this).field_o[var3] = param0.k(7021);
                var3++;
                continue L3;
              } else {
                break L4;
              }
            }
          }
          ((nk) this).field_p = param0.k(7021);
          ((nk) this).field_a = param0.k(7021);
          ((nk) this).field_r = param0.j(-788751192);
          ((nk) this).field_t = param0.j(-788751192);
          ((nk) this).field_n = new da();
          ((nk) this).field_q = new lj();
          ((nk) this).field_n.a(param0, ((nk) this).field_q);
          return;
        }
    }

    public static void a() {
        field_g = null;
        field_b = null;
        field_k = null;
        field_w = null;
        field_e = null;
        field_x = null;
        field_y = null;
        field_v = null;
    }

    nk() {
        ((nk) this).field_o = new int[]{0, 0, 0, 0, 0};
        ((nk) this).field_a = 100;
        ((nk) this).field_t = 0;
        ((nk) this).field_r = 500;
        ((nk) this).field_i = new int[]{0, 0, 0, 0, 0};
        ((nk) this).field_p = 0;
        ((nk) this).field_s = new int[]{0, 0, 0, 0, 0};
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var1 = 0;
        field_b = new int[32768];
        Random var0 = new Random(0L);
        for (var1 = 0; var1 < 32768; var1++) {
            field_b[var1] = (var0.nextInt() & 2) - 1;
        }
        field_k = new int[32768];
        for (var1 = 0; var1 < 32768; var1++) {
            field_k[var1] = (int)(Math.sin((double)var1 / 5215.1903) * 16384.0);
        }
        field_g = new int[220500];
        field_x = new int[5];
        field_e = new int[5];
        field_w = new int[5];
        field_y = new int[5];
        field_v = new int[5];
    }
}
