/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qg {
    private int[] field_b;
    private vj field_j;
    private vj field_r;
    private vj field_f;
    private vj field_o;
    private static int[] field_s;
    private static int[] field_c;
    int field_k;
    private vj field_u;
    private vj field_q;
    private int field_x;
    private int[] field_t;
    private re field_h;
    int field_e;
    private vj field_m;
    private vj field_y;
    private vj field_g;
    private static int[] field_d;
    private static int[] field_i;
    private static int[] field_v;
    private int[] field_l;
    private static int[] field_w;
    private static int[] field_p;
    private static int[] field_a;
    private int field_n;

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
        la.a(field_d, 0, param0);
        if (param1 >= 10) {
          L0: {
            var3 = (double)param0 / ((double)param1 + 0.0);
            ((qg) this).field_j.a();
            ((qg) this).field_o.a();
            var5 = 0;
            var6 = 0;
            var7 = 0;
            if (((qg) this).field_m == null) {
              break L0;
            } else {
              ((qg) this).field_m.a();
              ((qg) this).field_q.a();
              var5 = (int)((double)(((qg) this).field_m.field_d - ((qg) this).field_m.field_b) * 32.768 / var3);
              var6 = (int)((double)((qg) this).field_m.field_b * 32.768 / var3);
              break L0;
            }
          }
          L1: {
            var8 = 0;
            var9 = 0;
            var10 = 0;
            if (((qg) this).field_g == null) {
              break L1;
            } else {
              ((qg) this).field_g.a();
              ((qg) this).field_r.a();
              var8 = (int)((double)(((qg) this).field_g.field_d - ((qg) this).field_g.field_b) * 32.768 / var3);
              var9 = (int)((double)((qg) this).field_g.field_b * 32.768 / var3);
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
                    if (((qg) this).field_y == null) {
                      break L4;
                    } else {
                      ((qg) this).field_y.a();
                      ((qg) this).field_f.a();
                      var11 = 0;
                      var12 = 0;
                      var13 = 1;
                      var14 = 0;
                      L5: while (true) {
                        if (var14 >= param0) {
                          break L4;
                        } else {
                          L6: {
                            var15 = ((qg) this).field_y.a(param0);
                            var16 = ((qg) this).field_f.a(param0);
                            if (var13 == 0) {
                              var12 = ((qg) this).field_y.field_b + ((((qg) this).field_y.field_d - ((qg) this).field_y.field_b) * var16 >> 8);
                              break L6;
                            } else {
                              var12 = ((qg) this).field_y.field_b + ((((qg) this).field_y.field_d - ((qg) this).field_y.field_b) * var15 >> 8);
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
                            field_d[var14] = 0;
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
                    if (((qg) this).field_n <= 0) {
                      break L9;
                    } else {
                      if (((qg) this).field_x <= 0) {
                        break L9;
                      } else {
                        var11 = (int)((double)((qg) this).field_n * var3);
                        var12 = var11;
                        L10: while (true) {
                          if (var12 >= param0) {
                            break L9;
                          } else {
                            field_d[var12] = field_d[var12] + field_d[var12 - var11] * ((qg) this).field_x / 100;
                            var12++;
                            continue L10;
                          }
                        }
                      }
                    }
                  }
                  L11: {
                    L12: {
                      if (((qg) this).field_h.field_g[0] > 0) {
                        break L12;
                      } else {
                        if (((qg) this).field_h.field_g[1] <= 0) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    ((qg) this).field_u.a();
                    var11 = ((qg) this).field_u.a(param0 + 1);
                    var12 = ((qg) this).field_h.a(0, (float)var11 / 65536.0f);
                    var13 = ((qg) this).field_h.a(1, (float)var11 / 65536.0f);
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
                                  var12 = ((qg) this).field_h.a(0, (float)var11 / 65536.0f);
                                  var13 = ((qg) this).field_h.a(1, (float)var11 / 65536.0f);
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
                                              field_d[var14] = var16;
                                              var11 = ((qg) this).field_u.a(param0 + 1);
                                              var14++;
                                              continue L18;
                                            } else {
                                              var16 = var16 - (int)((long)field_d[var14 - 1 - var17] * (long)re.field_f[1][var17] >> 16);
                                              var17++;
                                              continue L20;
                                            }
                                          }
                                        } else {
                                          var16 = var16 + (int)((long)field_d[var14 + var12 - 1 - var17] * (long)re.field_f[0][var17] >> 16);
                                          var17++;
                                          continue L19;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                var16 = (int)((long)field_d[var14 + var12] * (long)re.field_e >> 16);
                                var17 = 0;
                                L21: while (true) {
                                  if (var17 >= var12) {
                                    var17 = 0;
                                    L22: while (true) {
                                      if (var17 >= var13) {
                                        field_d[var14] = var16;
                                        var11 = ((qg) this).field_u.a(param0 + 1);
                                        var14++;
                                        continue L17;
                                      } else {
                                        var16 = var16 - (int)((long)field_d[var14 - 1 - var17] * (long)re.field_f[1][var17] >> 16);
                                        var17++;
                                        continue L22;
                                      }
                                    }
                                  } else {
                                    var16 = var16 + (int)((long)field_d[var14 + var12 - 1 - var17] * (long)re.field_f[0][var17] >> 16);
                                    var17++;
                                    continue L21;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var16 = (int)((long)field_d[var14 + var12] * (long)re.field_e >> 16);
                          var17 = 0;
                          L23: while (true) {
                            if (var17 >= var12) {
                              var17 = 0;
                              L24: while (true) {
                                if (var17 >= var14) {
                                  field_d[var14] = var16;
                                  var11 = ((qg) this).field_u.a(param0 + 1);
                                  var14++;
                                  continue L14;
                                } else {
                                  var16 = var16 - (int)((long)field_d[var14 - 1 - var17] * (long)re.field_f[1][var17] >> 16);
                                  var17++;
                                  continue L24;
                                }
                              }
                            } else {
                              var16 = var16 + (int)((long)field_d[var14 + var12 - 1 - var17] * (long)re.field_f[0][var17] >> 16);
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
                      return field_d;
                    } else {
                      L26: {
                        if (field_d[var11] >= -32768) {
                          break L26;
                        } else {
                          field_d[var11] = -32768;
                          break L26;
                        }
                      }
                      if (field_d[var11] > 32767) {
                        field_d[var11] = 32767;
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
                    var12 = ((qg) this).field_j.a(param0);
                    var13 = ((qg) this).field_o.a(param0);
                    if (((qg) this).field_m == null) {
                      break L27;
                    } else {
                      var14 = ((qg) this).field_m.a(param0);
                      var15 = ((qg) this).field_q.a(param0);
                      var12 = var12 + (this.a(var7, var15, ((qg) this).field_m.field_a) >> 1);
                      var7 = var7 + ((var14 * var5 >> 16) + var6);
                      break L27;
                    }
                  }
                  L28: {
                    if (((qg) this).field_g == null) {
                      break L28;
                    } else {
                      var14 = ((qg) this).field_g.a(param0);
                      var15 = ((qg) this).field_r.a(param0);
                      var13 = var13 * ((this.a(var10, var15, ((qg) this).field_g.field_a) >> 1) + 32768) >> 15;
                      var10 = var10 + ((var14 * var8 >> 16) + var9);
                      break L28;
                    }
                  }
                  var14 = 0;
                  L29: while (true) {
                    if (var14 < 5) {
                      if (((qg) this).field_l[var14] != 0) {
                        var15 = var11 + field_a[var14];
                        if (var15 < param0) {
                          field_d[var15] = field_d[var15] + this.a(field_p[var14], var13 * field_i[var14] >> 15, ((qg) this).field_j.field_a);
                          field_p[var14] = field_p[var14] + ((var12 * field_w[var14] >> 16) + field_v[var14]);
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
              if (((qg) this).field_l[var11] != 0) {
                field_p[var11] = 0;
                field_a[var11] = (int)((double)((qg) this).field_b[var11] * var3);
                field_i[var11] = (((qg) this).field_l[var11] << 14) / 100;
                field_w[var11] = (int)((double)(((qg) this).field_j.field_d - ((qg) this).field_j.field_b) * 32.768 * Math.pow(1.0057929410678534, (double)((qg) this).field_t[var11]) / var3);
                field_v[var11] = (int)((double)((qg) this).field_j.field_b * 32.768 / var3);
                var11++;
                continue L2;
              } else {
                var11++;
                continue L2;
              }
            }
          }
        } else {
          return field_d;
        }
    }

    public static void a() {
        field_d = null;
        field_c = null;
        field_s = null;
        field_p = null;
        field_a = null;
        field_i = null;
        field_w = null;
        field_v = null;
    }

    final void a(fs param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          ((qg) this).field_j = new vj();
          ((qg) this).field_j.a(param0);
          ((qg) this).field_o = new vj();
          ((qg) this).field_o.a(param0);
          var2 = param0.e(-31302);
          if (var2 == 0) {
            break L0;
          } else {
            param0.field_p = param0.field_p - 1;
            ((qg) this).field_m = new vj();
            ((qg) this).field_m.a(param0);
            ((qg) this).field_q = new vj();
            ((qg) this).field_q.a(param0);
            break L0;
          }
        }
        L1: {
          var2 = param0.e(-31302);
          if (var2 == 0) {
            break L1;
          } else {
            param0.field_p = param0.field_p - 1;
            ((qg) this).field_g = new vj();
            ((qg) this).field_g.a(param0);
            ((qg) this).field_r = new vj();
            ((qg) this).field_r.a(param0);
            break L1;
          }
        }
        L2: {
          var2 = param0.e(-31302);
          if (var2 == 0) {
            break L2;
          } else {
            param0.field_p = param0.field_p - 1;
            ((qg) this).field_y = new vj();
            ((qg) this).field_y.a(param0);
            ((qg) this).field_f = new vj();
            ((qg) this).field_f.a(param0);
            break L2;
          }
        }
        var3 = 0;
        L3: while (true) {
          L4: {
            if (var3 >= 10) {
              break L4;
            } else {
              var4 = param0.e(false);
              if (var4 != 0) {
                ((qg) this).field_l[var3] = var4;
                ((qg) this).field_t[var3] = param0.h(-2858);
                ((qg) this).field_b[var3] = param0.e(false);
                var3++;
                continue L3;
              } else {
                break L4;
              }
            }
          }
          ((qg) this).field_n = param0.e(false);
          ((qg) this).field_x = param0.e(false);
          ((qg) this).field_k = param0.a(255);
          ((qg) this).field_e = param0.a(255);
          ((qg) this).field_h = new re();
          ((qg) this).field_u = new vj();
          ((qg) this).field_h.a(param0, ((qg) this).field_u);
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
            return field_s[param0 & 32767] * param1 >> 14;
        }
        if (param2 == 3) {
            return ((param0 & 32767) * param1 >> 14) - param1;
        }
        if (param2 == 4) {
            return field_c[param0 / 2607 & 32767] * param1;
        }
        return 0;
    }

    qg() {
        ((qg) this).field_b = new int[]{0, 0, 0, 0, 0};
        ((qg) this).field_e = 0;
        ((qg) this).field_t = new int[]{0, 0, 0, 0, 0};
        ((qg) this).field_x = 100;
        ((qg) this).field_l = new int[]{0, 0, 0, 0, 0};
        ((qg) this).field_k = 500;
        ((qg) this).field_n = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var1 = 0;
        field_c = new int[32768];
        Random var0 = new Random(0L);
        for (var1 = 0; var1 < 32768; var1++) {
            field_c[var1] = (var0.nextInt() & 2) - 1;
        }
        field_s = new int[32768];
        for (var1 = 0; var1 < 32768; var1++) {
            field_s[var1] = (int)(Math.sin((double)var1 / 5215.1903) * 16384.0);
        }
        field_d = new int[220500];
        field_i = new int[5];
        field_p = new int[5];
        field_w = new int[5];
        field_a = new int[5];
        field_v = new int[5];
    }
}
