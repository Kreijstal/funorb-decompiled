/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class kj {
    private hj field_q;
    int field_r;
    private sd field_b;
    private sd field_y;
    private sd field_a;
    private static int[] field_c;
    private sd field_s;
    private sd field_f;
    private static int[] field_j;
    private int[] field_g;
    private sd field_v;
    private sd field_n;
    private sd field_l;
    int field_h;
    private int[] field_i;
    private int field_o;
    private static int[] field_u;
    private int[] field_e;
    private sd field_k;
    private static int[] field_w;
    private int field_t;
    private static int[] field_x;
    private static int[] field_m;
    private static int[] field_d;
    private static int[] field_p;

    public static void a() {
        field_c = null;
        field_u = null;
        field_j = null;
        field_w = null;
        field_x = null;
        field_d = null;
        field_m = null;
        field_p = null;
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
        an.a(field_c, 0, param0);
        if (param1 >= 10) {
          L0: {
            var3 = (double)param0 / ((double)param1 + 0.0);
            ((kj) this).field_b.a();
            ((kj) this).field_n.a();
            var5 = 0;
            var6 = 0;
            var7 = 0;
            if (((kj) this).field_y == null) {
              break L0;
            } else {
              ((kj) this).field_y.a();
              ((kj) this).field_a.a();
              var5 = (int)((double)(((kj) this).field_y.field_i - ((kj) this).field_y.field_e) * 32.768 / var3);
              var6 = (int)((double)((kj) this).field_y.field_e * 32.768 / var3);
              break L0;
            }
          }
          L1: {
            var8 = 0;
            var9 = 0;
            var10 = 0;
            if (((kj) this).field_f == null) {
              break L1;
            } else {
              ((kj) this).field_f.a();
              ((kj) this).field_v.a();
              var8 = (int)((double)(((kj) this).field_f.field_i - ((kj) this).field_f.field_e) * 32.768 / var3);
              var9 = (int)((double)((kj) this).field_f.field_e * 32.768 / var3);
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
                    if (((kj) this).field_s == null) {
                      break L4;
                    } else {
                      ((kj) this).field_s.a();
                      ((kj) this).field_l.a();
                      var11 = 0;
                      var12 = 0;
                      var13 = 1;
                      var14 = 0;
                      L5: while (true) {
                        if (var14 >= param0) {
                          break L4;
                        } else {
                          L6: {
                            var15 = ((kj) this).field_s.a(param0);
                            var16 = ((kj) this).field_l.a(param0);
                            if (var13 == 0) {
                              var12 = ((kj) this).field_s.field_e + ((((kj) this).field_s.field_i - ((kj) this).field_s.field_e) * var16 >> 8);
                              break L6;
                            } else {
                              var12 = ((kj) this).field_s.field_e + ((((kj) this).field_s.field_i - ((kj) this).field_s.field_e) * var15 >> 8);
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
                            field_c[var14] = 0;
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
                    if (((kj) this).field_o <= 0) {
                      break L9;
                    } else {
                      if (((kj) this).field_t <= 0) {
                        break L9;
                      } else {
                        var11 = (int)((double)((kj) this).field_o * var3);
                        var12 = var11;
                        L10: while (true) {
                          if (var12 >= param0) {
                            break L9;
                          } else {
                            field_c[var12] = field_c[var12] + field_c[var12 - var11] * ((kj) this).field_t / 100;
                            var12++;
                            continue L10;
                          }
                        }
                      }
                    }
                  }
                  L11: {
                    L12: {
                      if (((kj) this).field_q.field_g[0] > 0) {
                        break L12;
                      } else {
                        if (((kj) this).field_q.field_g[1] <= 0) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    ((kj) this).field_k.a();
                    var11 = ((kj) this).field_k.a(param0 + 1);
                    var12 = ((kj) this).field_q.a(0, (float)var11 / 65536.0f);
                    var13 = ((kj) this).field_q.a(1, (float)var11 / 65536.0f);
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
                                  var12 = ((kj) this).field_q.a(0, (float)var11 / 65536.0f);
                                  var13 = ((kj) this).field_q.a(1, (float)var11 / 65536.0f);
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
                                              field_c[var14] = var16;
                                              var11 = ((kj) this).field_k.a(param0 + 1);
                                              var14++;
                                              continue L18;
                                            } else {
                                              var16 = var16 - (int)((long)field_c[var14 - 1 - var17] * (long)hj.field_a[1][var17] >> 16);
                                              var17++;
                                              continue L20;
                                            }
                                          }
                                        } else {
                                          var16 = var16 + (int)((long)field_c[var14 + var12 - 1 - var17] * (long)hj.field_a[0][var17] >> 16);
                                          var17++;
                                          continue L19;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                var16 = (int)((long)field_c[var14 + var12] * (long)hj.field_d >> 16);
                                var17 = 0;
                                L21: while (true) {
                                  if (var17 >= var12) {
                                    var17 = 0;
                                    L22: while (true) {
                                      if (var17 >= var13) {
                                        field_c[var14] = var16;
                                        var11 = ((kj) this).field_k.a(param0 + 1);
                                        var14++;
                                        continue L17;
                                      } else {
                                        var16 = var16 - (int)((long)field_c[var14 - 1 - var17] * (long)hj.field_a[1][var17] >> 16);
                                        var17++;
                                        continue L22;
                                      }
                                    }
                                  } else {
                                    var16 = var16 + (int)((long)field_c[var14 + var12 - 1 - var17] * (long)hj.field_a[0][var17] >> 16);
                                    var17++;
                                    continue L21;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var16 = (int)((long)field_c[var14 + var12] * (long)hj.field_d >> 16);
                          var17 = 0;
                          L23: while (true) {
                            if (var17 >= var12) {
                              var17 = 0;
                              L24: while (true) {
                                if (var17 >= var14) {
                                  field_c[var14] = var16;
                                  var11 = ((kj) this).field_k.a(param0 + 1);
                                  var14++;
                                  continue L14;
                                } else {
                                  var16 = var16 - (int)((long)field_c[var14 - 1 - var17] * (long)hj.field_a[1][var17] >> 16);
                                  var17++;
                                  continue L24;
                                }
                              }
                            } else {
                              var16 = var16 + (int)((long)field_c[var14 + var12 - 1 - var17] * (long)hj.field_a[0][var17] >> 16);
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
                      return field_c;
                    } else {
                      L26: {
                        if (field_c[var11] >= -32768) {
                          break L26;
                        } else {
                          field_c[var11] = -32768;
                          break L26;
                        }
                      }
                      if (field_c[var11] > 32767) {
                        field_c[var11] = 32767;
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
                    var12 = ((kj) this).field_b.a(param0);
                    var13 = ((kj) this).field_n.a(param0);
                    if (((kj) this).field_y == null) {
                      break L27;
                    } else {
                      var14 = ((kj) this).field_y.a(param0);
                      var15 = ((kj) this).field_a.a(param0);
                      var12 = var12 + (this.a(var7, var15, ((kj) this).field_y.field_a) >> 1);
                      var7 = var7 + ((var14 * var5 >> 16) + var6);
                      break L27;
                    }
                  }
                  L28: {
                    if (((kj) this).field_f == null) {
                      break L28;
                    } else {
                      var14 = ((kj) this).field_f.a(param0);
                      var15 = ((kj) this).field_v.a(param0);
                      var13 = var13 * ((this.a(var10, var15, ((kj) this).field_f.field_a) >> 1) + 32768) >> 15;
                      var10 = var10 + ((var14 * var8 >> 16) + var9);
                      break L28;
                    }
                  }
                  var14 = 0;
                  L29: while (true) {
                    if (var14 < 5) {
                      if (((kj) this).field_g[var14] != 0) {
                        var15 = var11 + field_x[var14];
                        if (var15 < param0) {
                          field_c[var15] = field_c[var15] + this.a(field_w[var14], var13 * field_d[var14] >> 15, ((kj) this).field_b.field_a);
                          field_w[var14] = field_w[var14] + ((var12 * field_m[var14] >> 16) + field_p[var14]);
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
              if (((kj) this).field_g[var11] != 0) {
                field_w[var11] = 0;
                field_x[var11] = (int)((double)((kj) this).field_i[var11] * var3);
                field_d[var11] = (((kj) this).field_g[var11] << 14) / 100;
                field_m[var11] = (int)((double)(((kj) this).field_b.field_i - ((kj) this).field_b.field_e) * 32.768 * Math.pow(1.0057929410678534, (double)((kj) this).field_e[var11]) / var3);
                field_p[var11] = (int)((double)((kj) this).field_b.field_e * 32.768 / var3);
                var11++;
                continue L2;
              } else {
                var11++;
                continue L2;
              }
            }
          }
        } else {
          return field_c;
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
            return field_j[param0 & 32767] * param1 >> 14;
        }
        if (param2 == 3) {
            return ((param0 & 32767) * param1 >> 14) - param1;
        }
        if (param2 == 4) {
            return field_u[param0 / 2607 & 32767] * param1;
        }
        return 0;
    }

    final void a(wl param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          ((kj) this).field_b = new sd();
          ((kj) this).field_b.b(param0);
          ((kj) this).field_n = new sd();
          ((kj) this).field_n.b(param0);
          var2 = param0.d((byte) -127);
          if (var2 == 0) {
            break L0;
          } else {
            param0.field_n = param0.field_n - 1;
            ((kj) this).field_y = new sd();
            ((kj) this).field_y.b(param0);
            ((kj) this).field_a = new sd();
            ((kj) this).field_a.b(param0);
            break L0;
          }
        }
        L1: {
          var2 = param0.d((byte) -31);
          if (var2 == 0) {
            break L1;
          } else {
            param0.field_n = param0.field_n - 1;
            ((kj) this).field_f = new sd();
            ((kj) this).field_f.b(param0);
            ((kj) this).field_v = new sd();
            ((kj) this).field_v.b(param0);
            break L1;
          }
        }
        L2: {
          var2 = param0.d((byte) -89);
          if (var2 == 0) {
            break L2;
          } else {
            param0.field_n = param0.field_n - 1;
            ((kj) this).field_s = new sd();
            ((kj) this).field_s.b(param0);
            ((kj) this).field_l = new sd();
            ((kj) this).field_l.b(param0);
            break L2;
          }
        }
        var3 = 0;
        L3: while (true) {
          L4: {
            if (var3 >= 10) {
              break L4;
            } else {
              var4 = param0.a(false);
              if (var4 != 0) {
                ((kj) this).field_g[var3] = var4;
                ((kj) this).field_e[var3] = param0.e((byte) 126);
                ((kj) this).field_i[var3] = param0.a(false);
                var3++;
                continue L3;
              } else {
                break L4;
              }
            }
          }
          ((kj) this).field_o = param0.a(false);
          ((kj) this).field_t = param0.a(false);
          ((kj) this).field_r = param0.e(3);
          ((kj) this).field_h = param0.e(3);
          ((kj) this).field_q = new hj();
          ((kj) this).field_k = new sd();
          ((kj) this).field_q.a(param0, ((kj) this).field_k);
          return;
        }
    }

    kj() {
        ((kj) this).field_r = 500;
        ((kj) this).field_g = new int[]{0, 0, 0, 0, 0};
        ((kj) this).field_h = 0;
        ((kj) this).field_i = new int[]{0, 0, 0, 0, 0};
        ((kj) this).field_e = new int[]{0, 0, 0, 0, 0};
        ((kj) this).field_t = 100;
        ((kj) this).field_o = 0;
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
        field_j = new int[32768];
        for (var1 = 0; var1 < 32768; var1++) {
            field_j[var1] = (int)(Math.sin((double)var1 / 5215.1903) * 16384.0);
        }
        field_c = new int[220500];
        field_w = new int[5];
        field_x = new int[5];
        field_m = new int[5];
        field_d = new int[5];
        field_p = new int[5];
    }
}
