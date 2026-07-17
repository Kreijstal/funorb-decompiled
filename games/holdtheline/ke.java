/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ke {
    private int[] field_t;
    private ve field_q;
    private static int[] field_p;
    private int[] field_y;
    int field_e;
    private static int[] field_g;
    int field_v;
    private int[] field_j;
    private ve field_s;
    private ve field_o;
    private static int[] field_x;
    private int field_l;
    private int field_n;
    private ve field_f;
    private ve field_i;
    private ve field_u;
    private je field_c;
    private ve field_r;
    private static int[] field_m;
    private static int[] field_d;
    private static int[] field_a;
    private static int[] field_w;
    private ve field_k;
    private ve field_h;
    private static int[] field_b;

    final void a(th param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          ((ke) this).field_r = new ve();
          ((ke) this).field_r.b(param0);
          ((ke) this).field_u = new ve();
          ((ke) this).field_u.b(param0);
          var2 = param0.f((byte) -43);
          if (var2 == 0) {
            break L0;
          } else {
            param0.field_l = param0.field_l - 1;
            ((ke) this).field_o = new ve();
            ((ke) this).field_o.b(param0);
            ((ke) this).field_q = new ve();
            ((ke) this).field_q.b(param0);
            break L0;
          }
        }
        L1: {
          var2 = param0.f((byte) -105);
          if (var2 == 0) {
            break L1;
          } else {
            param0.field_l = param0.field_l - 1;
            ((ke) this).field_f = new ve();
            ((ke) this).field_f.b(param0);
            ((ke) this).field_k = new ve();
            ((ke) this).field_k.b(param0);
            break L1;
          }
        }
        L2: {
          var2 = param0.f((byte) -30);
          if (var2 == 0) {
            break L2;
          } else {
            param0.field_l = param0.field_l - 1;
            ((ke) this).field_i = new ve();
            ((ke) this).field_i.b(param0);
            ((ke) this).field_h = new ve();
            ((ke) this).field_h.b(param0);
            break L2;
          }
        }
        var3 = 0;
        L3: while (true) {
          L4: {
            if (var3 >= 10) {
              break L4;
            } else {
              var4 = param0.e(128);
              if (var4 != 0) {
                ((ke) this).field_y[var3] = var4;
                ((ke) this).field_j[var3] = param0.b((byte) -84);
                ((ke) this).field_t[var3] = param0.e(128);
                var3++;
                continue L3;
              } else {
                break L4;
              }
            }
          }
          ((ke) this).field_n = param0.e(128);
          ((ke) this).field_l = param0.e(128);
          ((ke) this).field_v = param0.k(-48);
          ((ke) this).field_e = param0.k(-47);
          ((ke) this).field_c = new je();
          ((ke) this).field_s = new ve();
          ((ke) this).field_c.a(param0, ((ke) this).field_s);
          return;
        }
    }

    private final int a(int param0, int param1, int param2) {
        if (param2 == 1) {
            if ((param0 & 32767) < 16384) {
                return param1;
            }
            return -param1;
        }
        if (param2 == 2) {
            return field_x[param0 & 32767] * param1 >> 14;
        }
        if (param2 == 3) {
            return ((param0 & 32767) * param1 >> 14) - param1;
        }
        if (param2 == 4) {
            return field_p[param0 / 2607 & 32767] * param1;
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
        bc.a(field_g, 0, param0);
        if (param1 >= 10) {
          L0: {
            var3 = (double)param0 / ((double)param1 + 0.0);
            ((ke) this).field_r.a();
            ((ke) this).field_u.a();
            var5 = 0;
            var6 = 0;
            var7 = 0;
            if (((ke) this).field_o == null) {
              break L0;
            } else {
              ((ke) this).field_o.a();
              ((ke) this).field_q.a();
              var5 = (int)((double)(((ke) this).field_o.field_f - ((ke) this).field_o.field_h) * 32.768 / var3);
              var6 = (int)((double)((ke) this).field_o.field_h * 32.768 / var3);
              break L0;
            }
          }
          L1: {
            var8 = 0;
            var9 = 0;
            var10 = 0;
            if (((ke) this).field_f == null) {
              break L1;
            } else {
              ((ke) this).field_f.a();
              ((ke) this).field_k.a();
              var8 = (int)((double)(((ke) this).field_f.field_f - ((ke) this).field_f.field_h) * 32.768 / var3);
              var9 = (int)((double)((ke) this).field_f.field_h * 32.768 / var3);
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
                    if (((ke) this).field_i == null) {
                      break L4;
                    } else {
                      ((ke) this).field_i.a();
                      ((ke) this).field_h.a();
                      var11 = 0;
                      var12 = 0;
                      var13 = 1;
                      var14 = 0;
                      L5: while (true) {
                        if (var14 >= param0) {
                          break L4;
                        } else {
                          L6: {
                            var15 = ((ke) this).field_i.a(param0);
                            var16 = ((ke) this).field_h.a(param0);
                            if (var13 == 0) {
                              var12 = ((ke) this).field_i.field_h + ((((ke) this).field_i.field_f - ((ke) this).field_i.field_h) * var16 >> 8);
                              break L6;
                            } else {
                              var12 = ((ke) this).field_i.field_h + ((((ke) this).field_i.field_f - ((ke) this).field_i.field_h) * var15 >> 8);
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
                    if (((ke) this).field_n <= 0) {
                      break L9;
                    } else {
                      if (((ke) this).field_l <= 0) {
                        break L9;
                      } else {
                        var11 = (int)((double)((ke) this).field_n * var3);
                        var12 = var11;
                        L10: while (true) {
                          if (var12 >= param0) {
                            break L9;
                          } else {
                            field_g[var12] = field_g[var12] + field_g[var12 - var11] * ((ke) this).field_l / 100;
                            var12++;
                            continue L10;
                          }
                        }
                      }
                    }
                  }
                  L11: {
                    L12: {
                      if (((ke) this).field_c.field_a[0] > 0) {
                        break L12;
                      } else {
                        if (((ke) this).field_c.field_a[1] <= 0) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    ((ke) this).field_s.a();
                    var11 = ((ke) this).field_s.a(param0 + 1);
                    var12 = ((ke) this).field_c.a(0, (float)var11 / 65536.0f);
                    var13 = ((ke) this).field_c.a(1, (float)var11 / 65536.0f);
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
                                  var12 = ((ke) this).field_c.a(0, (float)var11 / 65536.0f);
                                  var13 = ((ke) this).field_c.a(1, (float)var11 / 65536.0f);
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
                                              var11 = ((ke) this).field_s.a(param0 + 1);
                                              var14++;
                                              continue L18;
                                            } else {
                                              var16 = var16 - (int)((long)field_g[var14 - 1 - var17] * (long)je.field_f[1][var17] >> 16);
                                              var17++;
                                              continue L20;
                                            }
                                          }
                                        } else {
                                          var16 = var16 + (int)((long)field_g[var14 + var12 - 1 - var17] * (long)je.field_f[0][var17] >> 16);
                                          var17++;
                                          continue L19;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                var16 = (int)((long)field_g[var14 + var12] * (long)je.field_d >> 16);
                                var17 = 0;
                                L21: while (true) {
                                  if (var17 >= var12) {
                                    var17 = 0;
                                    L22: while (true) {
                                      if (var17 >= var13) {
                                        field_g[var14] = var16;
                                        var11 = ((ke) this).field_s.a(param0 + 1);
                                        var14++;
                                        continue L17;
                                      } else {
                                        var16 = var16 - (int)((long)field_g[var14 - 1 - var17] * (long)je.field_f[1][var17] >> 16);
                                        var17++;
                                        continue L22;
                                      }
                                    }
                                  } else {
                                    var16 = var16 + (int)((long)field_g[var14 + var12 - 1 - var17] * (long)je.field_f[0][var17] >> 16);
                                    var17++;
                                    continue L21;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var16 = (int)((long)field_g[var14 + var12] * (long)je.field_d >> 16);
                          var17 = 0;
                          L23: while (true) {
                            if (var17 >= var12) {
                              var17 = 0;
                              L24: while (true) {
                                if (var17 >= var14) {
                                  field_g[var14] = var16;
                                  var11 = ((ke) this).field_s.a(param0 + 1);
                                  var14++;
                                  continue L14;
                                } else {
                                  var16 = var16 - (int)((long)field_g[var14 - 1 - var17] * (long)je.field_f[1][var17] >> 16);
                                  var17++;
                                  continue L24;
                                }
                              }
                            } else {
                              var16 = var16 + (int)((long)field_g[var14 + var12 - 1 - var17] * (long)je.field_f[0][var17] >> 16);
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
                    var12 = ((ke) this).field_r.a(param0);
                    var13 = ((ke) this).field_u.a(param0);
                    if (((ke) this).field_o == null) {
                      break L27;
                    } else {
                      var14 = ((ke) this).field_o.a(param0);
                      var15 = ((ke) this).field_q.a(param0);
                      var12 = var12 + (this.a(var7, var15, ((ke) this).field_o.field_g) >> 1);
                      var7 = var7 + ((var14 * var5 >> 16) + var6);
                      break L27;
                    }
                  }
                  L28: {
                    if (((ke) this).field_f == null) {
                      break L28;
                    } else {
                      var14 = ((ke) this).field_f.a(param0);
                      var15 = ((ke) this).field_k.a(param0);
                      var13 = var13 * ((this.a(var10, var15, ((ke) this).field_f.field_g) >> 1) + 32768) >> 15;
                      var10 = var10 + ((var14 * var8 >> 16) + var9);
                      break L28;
                    }
                  }
                  var14 = 0;
                  L29: while (true) {
                    if (var14 < 5) {
                      if (((ke) this).field_y[var14] != 0) {
                        var15 = var11 + field_w[var14];
                        if (var15 < param0) {
                          field_g[var15] = field_g[var15] + this.a(field_b[var14], var13 * field_m[var14] >> 15, ((ke) this).field_r.field_g);
                          field_b[var14] = field_b[var14] + ((var12 * field_d[var14] >> 16) + field_a[var14]);
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
              if (((ke) this).field_y[var11] != 0) {
                field_b[var11] = 0;
                field_w[var11] = (int)((double)((ke) this).field_t[var11] * var3);
                field_m[var11] = (((ke) this).field_y[var11] << 14) / 100;
                field_d[var11] = (int)((double)(((ke) this).field_r.field_f - ((ke) this).field_r.field_h) * 32.768 * Math.pow(1.0057929410678534, (double)((ke) this).field_j[var11]) / var3);
                field_a[var11] = (int)((double)((ke) this).field_r.field_h * 32.768 / var3);
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

    public static void a() {
        field_g = null;
        field_p = null;
        field_x = null;
        field_b = null;
        field_w = null;
        field_m = null;
        field_d = null;
        field_a = null;
    }

    ke() {
        ((ke) this).field_t = new int[]{0, 0, 0, 0, 0};
        ((ke) this).field_y = new int[]{0, 0, 0, 0, 0};
        ((ke) this).field_e = 0;
        ((ke) this).field_l = 100;
        ((ke) this).field_j = new int[]{0, 0, 0, 0, 0};
        ((ke) this).field_n = 0;
        ((ke) this).field_v = 500;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var1 = 0;
        field_p = new int[32768];
        Random var0 = new Random(0L);
        for (var1 = 0; var1 < 32768; var1++) {
            field_p[var1] = (var0.nextInt() & 2) - 1;
        }
        field_x = new int[32768];
        for (var1 = 0; var1 < 32768; var1++) {
            field_x[var1] = (int)(Math.sin((double)var1 / 5215.1903) * 16384.0);
        }
        field_g = new int[220500];
        field_w = new int[5];
        field_a = new int[5];
        field_d = new int[5];
        field_b = new int[5];
        field_m = new int[5];
    }
}
