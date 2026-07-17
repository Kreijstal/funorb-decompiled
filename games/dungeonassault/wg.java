/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class wg {
    private int[] field_h;
    private int field_t;
    private static int[] field_r;
    int field_o;
    private int[] field_g;
    private static int[] field_q;
    private fh field_n;
    private fh field_f;
    private fh field_m;
    private fh field_d;
    private int field_k;
    private fh field_i;
    private bi field_x;
    private fh field_v;
    private int[] field_u;
    private fh field_c;
    private fh field_p;
    private static int[] field_b;
    int field_s;
    private fh field_l;
    private static int[] field_y;
    private static int[] field_j;
    private static int[] field_a;
    private static int[] field_e;
    private static int[] field_w;

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
        cj.a(field_r, 0, param0);
        if (param1 >= 10) {
          L0: {
            var3 = (double)param0 / ((double)param1 + 0.0);
            ((wg) this).field_d.a();
            ((wg) this).field_m.a();
            var5 = 0;
            var6 = 0;
            var7 = 0;
            if (((wg) this).field_n == null) {
              break L0;
            } else {
              ((wg) this).field_n.a();
              ((wg) this).field_v.a();
              var5 = (int)((double)(((wg) this).field_n.field_j - ((wg) this).field_n.field_c) * 32.768 / var3);
              var6 = (int)((double)((wg) this).field_n.field_c * 32.768 / var3);
              break L0;
            }
          }
          L1: {
            var8 = 0;
            var9 = 0;
            var10 = 0;
            if (((wg) this).field_p == null) {
              break L1;
            } else {
              ((wg) this).field_p.a();
              ((wg) this).field_c.a();
              var8 = (int)((double)(((wg) this).field_p.field_j - ((wg) this).field_p.field_c) * 32.768 / var3);
              var9 = (int)((double)((wg) this).field_p.field_c * 32.768 / var3);
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
                    if (((wg) this).field_i == null) {
                      break L4;
                    } else {
                      ((wg) this).field_i.a();
                      ((wg) this).field_l.a();
                      var11 = 0;
                      var12 = 0;
                      var13 = 1;
                      var14 = 0;
                      L5: while (true) {
                        if (var14 >= param0) {
                          break L4;
                        } else {
                          L6: {
                            var15 = ((wg) this).field_i.a(param0);
                            var16 = ((wg) this).field_l.a(param0);
                            if (var13 == 0) {
                              var12 = ((wg) this).field_i.field_c + ((((wg) this).field_i.field_j - ((wg) this).field_i.field_c) * var16 >> 8);
                              break L6;
                            } else {
                              var12 = ((wg) this).field_i.field_c + ((((wg) this).field_i.field_j - ((wg) this).field_i.field_c) * var15 >> 8);
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
                            field_r[var14] = 0;
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
                    if (((wg) this).field_k <= 0) {
                      break L9;
                    } else {
                      if (((wg) this).field_t <= 0) {
                        break L9;
                      } else {
                        var11 = (int)((double)((wg) this).field_k * var3);
                        var12 = var11;
                        L10: while (true) {
                          if (var12 >= param0) {
                            break L9;
                          } else {
                            field_r[var12] = field_r[var12] + field_r[var12 - var11] * ((wg) this).field_t / 100;
                            var12++;
                            continue L10;
                          }
                        }
                      }
                    }
                  }
                  L11: {
                    L12: {
                      if (((wg) this).field_x.field_e[0] > 0) {
                        break L12;
                      } else {
                        if (((wg) this).field_x.field_e[1] <= 0) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    ((wg) this).field_f.a();
                    var11 = ((wg) this).field_f.a(param0 + 1);
                    var12 = ((wg) this).field_x.a(0, (float)var11 / 65536.0f);
                    var13 = ((wg) this).field_x.a(1, (float)var11 / 65536.0f);
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
                                  var12 = ((wg) this).field_x.a(0, (float)var11 / 65536.0f);
                                  var13 = ((wg) this).field_x.a(1, (float)var11 / 65536.0f);
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
                                              field_r[var14] = var16;
                                              var11 = ((wg) this).field_f.a(param0 + 1);
                                              var14++;
                                              continue L18;
                                            } else {
                                              var16 = var16 - (int)((long)field_r[var14 - 1 - var17] * (long)bi.field_c[1][var17] >> 16);
                                              var17++;
                                              continue L20;
                                            }
                                          }
                                        } else {
                                          var16 = var16 + (int)((long)field_r[var14 + var12 - 1 - var17] * (long)bi.field_c[0][var17] >> 16);
                                          var17++;
                                          continue L19;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                var16 = (int)((long)field_r[var14 + var12] * (long)bi.field_d >> 16);
                                var17 = 0;
                                L21: while (true) {
                                  if (var17 >= var12) {
                                    var17 = 0;
                                    L22: while (true) {
                                      if (var17 >= var13) {
                                        field_r[var14] = var16;
                                        var11 = ((wg) this).field_f.a(param0 + 1);
                                        var14++;
                                        continue L17;
                                      } else {
                                        var16 = var16 - (int)((long)field_r[var14 - 1 - var17] * (long)bi.field_c[1][var17] >> 16);
                                        var17++;
                                        continue L22;
                                      }
                                    }
                                  } else {
                                    var16 = var16 + (int)((long)field_r[var14 + var12 - 1 - var17] * (long)bi.field_c[0][var17] >> 16);
                                    var17++;
                                    continue L21;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var16 = (int)((long)field_r[var14 + var12] * (long)bi.field_d >> 16);
                          var17 = 0;
                          L23: while (true) {
                            if (var17 >= var12) {
                              var17 = 0;
                              L24: while (true) {
                                if (var17 >= var14) {
                                  field_r[var14] = var16;
                                  var11 = ((wg) this).field_f.a(param0 + 1);
                                  var14++;
                                  continue L14;
                                } else {
                                  var16 = var16 - (int)((long)field_r[var14 - 1 - var17] * (long)bi.field_c[1][var17] >> 16);
                                  var17++;
                                  continue L24;
                                }
                              }
                            } else {
                              var16 = var16 + (int)((long)field_r[var14 + var12 - 1 - var17] * (long)bi.field_c[0][var17] >> 16);
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
                      return field_r;
                    } else {
                      L26: {
                        if (field_r[var11] >= -32768) {
                          break L26;
                        } else {
                          field_r[var11] = -32768;
                          break L26;
                        }
                      }
                      if (field_r[var11] > 32767) {
                        field_r[var11] = 32767;
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
                    var12 = ((wg) this).field_d.a(param0);
                    var13 = ((wg) this).field_m.a(param0);
                    if (((wg) this).field_n == null) {
                      break L27;
                    } else {
                      var14 = ((wg) this).field_n.a(param0);
                      var15 = ((wg) this).field_v.a(param0);
                      var12 = var12 + (this.a(var7, var15, ((wg) this).field_n.field_d) >> 1);
                      var7 = var7 + ((var14 * var5 >> 16) + var6);
                      break L27;
                    }
                  }
                  L28: {
                    if (((wg) this).field_p == null) {
                      break L28;
                    } else {
                      var14 = ((wg) this).field_p.a(param0);
                      var15 = ((wg) this).field_c.a(param0);
                      var13 = var13 * ((this.a(var10, var15, ((wg) this).field_p.field_d) >> 1) + 32768) >> 15;
                      var10 = var10 + ((var14 * var8 >> 16) + var9);
                      break L28;
                    }
                  }
                  var14 = 0;
                  L29: while (true) {
                    if (var14 < 5) {
                      if (((wg) this).field_g[var14] != 0) {
                        var15 = var11 + field_a[var14];
                        if (var15 < param0) {
                          field_r[var15] = field_r[var15] + this.a(field_w[var14], var13 * field_e[var14] >> 15, ((wg) this).field_d.field_d);
                          field_w[var14] = field_w[var14] + ((var12 * field_j[var14] >> 16) + field_y[var14]);
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
              if (((wg) this).field_g[var11] != 0) {
                field_w[var11] = 0;
                field_a[var11] = (int)((double)((wg) this).field_u[var11] * var3);
                field_e[var11] = (((wg) this).field_g[var11] << 14) / 100;
                field_j[var11] = (int)((double)(((wg) this).field_d.field_j - ((wg) this).field_d.field_c) * 32.768 * Math.pow(1.0057929410678534, (double)((wg) this).field_h[var11]) / var3);
                field_y[var11] = (int)((double)((wg) this).field_d.field_c * 32.768 / var3);
                var11++;
                continue L2;
              } else {
                var11++;
                continue L2;
              }
            }
          }
        } else {
          return field_r;
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
            return field_b[param0 & 32767] * param1 >> 14;
        }
        if (param2 == 3) {
            return ((param0 & 32767) * param1 >> 14) - param1;
        }
        if (param2 == 4) {
            return field_q[param0 / 2607 & 32767] * param1;
        }
        return 0;
    }

    final void a(ec param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          ((wg) this).field_d = new fh();
          ((wg) this).field_d.b(param0);
          ((wg) this).field_m = new fh();
          ((wg) this).field_m.b(param0);
          var2 = param0.c(true);
          if (var2 == 0) {
            break L0;
          } else {
            param0.field_o = param0.field_o - 1;
            ((wg) this).field_n = new fh();
            ((wg) this).field_n.b(param0);
            ((wg) this).field_v = new fh();
            ((wg) this).field_v.b(param0);
            break L0;
          }
        }
        L1: {
          var2 = param0.c(true);
          if (var2 == 0) {
            break L1;
          } else {
            param0.field_o = param0.field_o - 1;
            ((wg) this).field_p = new fh();
            ((wg) this).field_p.b(param0);
            ((wg) this).field_c = new fh();
            ((wg) this).field_c.b(param0);
            break L1;
          }
        }
        L2: {
          var2 = param0.c(true);
          if (var2 == 0) {
            break L2;
          } else {
            param0.field_o = param0.field_o - 1;
            ((wg) this).field_i = new fh();
            ((wg) this).field_i.b(param0);
            ((wg) this).field_l = new fh();
            ((wg) this).field_l.b(param0);
            break L2;
          }
        }
        var3 = 0;
        L3: while (true) {
          L4: {
            if (var3 >= 10) {
              break L4;
            } else {
              var4 = param0.d((byte) 58);
              if (var4 != 0) {
                ((wg) this).field_g[var3] = var4;
                ((wg) this).field_h[var3] = param0.l(0);
                ((wg) this).field_u[var3] = param0.d((byte) 58);
                var3++;
                continue L3;
              } else {
                break L4;
              }
            }
          }
          ((wg) this).field_k = param0.d((byte) 58);
          ((wg) this).field_t = param0.d((byte) 58);
          ((wg) this).field_s = param0.k(0);
          ((wg) this).field_o = param0.k(0);
          ((wg) this).field_x = new bi();
          ((wg) this).field_f = new fh();
          ((wg) this).field_x.a(param0, ((wg) this).field_f);
          return;
        }
    }

    public static void a() {
        field_r = null;
        field_q = null;
        field_b = null;
        field_w = null;
        field_a = null;
        field_e = null;
        field_j = null;
        field_y = null;
    }

    wg() {
        ((wg) this).field_g = new int[]{0, 0, 0, 0, 0};
        ((wg) this).field_o = 0;
        ((wg) this).field_t = 100;
        ((wg) this).field_k = 0;
        ((wg) this).field_h = new int[]{0, 0, 0, 0, 0};
        ((wg) this).field_u = new int[]{0, 0, 0, 0, 0};
        ((wg) this).field_s = 500;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var1 = 0;
        field_q = new int[32768];
        Random var0 = new Random(0L);
        for (var1 = 0; var1 < 32768; var1++) {
            field_q[var1] = (var0.nextInt() & 2) - 1;
        }
        field_b = new int[32768];
        for (var1 = 0; var1 < 32768; var1++) {
            field_b[var1] = (int)(Math.sin((double)var1 / 5215.1903) * 16384.0);
        }
        field_r = new int[220500];
        field_y = new int[5];
        field_j = new int[5];
        field_a = new int[5];
        field_e = new int[5];
        field_w = new int[5];
    }
}
