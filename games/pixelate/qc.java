/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qc {
    private bk field_t;
    private bk field_q;
    private bk field_b;
    private bk field_i;
    private static int[] field_v;
    private bk field_g;
    private int[] field_r;
    private int field_m;
    private bk field_l;
    private static int[] field_s;
    private bk field_f;
    int field_k;
    private int[] field_p;
    private static int[] field_c;
    private int[] field_y;
    private static int[] field_o;
    private int field_d;
    int field_e;
    private static int[] field_a;
    private static int[] field_w;
    private static int[] field_n;
    private p field_u;
    private bk field_x;
    private static int[] field_j;
    private bk field_h;

    final void a(we param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          ((qc) this).field_x = new bk();
          ((qc) this).field_x.a(param0);
          ((qc) this).field_g = new bk();
          ((qc) this).field_g.a(param0);
          var2 = param0.f(255);
          if (var2 == 0) {
            break L0;
          } else {
            param0.field_m = param0.field_m - 1;
            ((qc) this).field_h = new bk();
            ((qc) this).field_h.a(param0);
            ((qc) this).field_t = new bk();
            ((qc) this).field_t.a(param0);
            break L0;
          }
        }
        L1: {
          var2 = param0.f(255);
          if (var2 == 0) {
            break L1;
          } else {
            param0.field_m = param0.field_m - 1;
            ((qc) this).field_l = new bk();
            ((qc) this).field_l.a(param0);
            ((qc) this).field_f = new bk();
            ((qc) this).field_f.a(param0);
            break L1;
          }
        }
        L2: {
          var2 = param0.f(255);
          if (var2 == 0) {
            break L2;
          } else {
            param0.field_m = param0.field_m - 1;
            ((qc) this).field_q = new bk();
            ((qc) this).field_q.a(param0);
            ((qc) this).field_b = new bk();
            ((qc) this).field_b.a(param0);
            break L2;
          }
        }
        var3 = 0;
        L3: while (true) {
          L4: {
            if (var3 >= 10) {
              break L4;
            } else {
              var4 = param0.g(21231);
              if (var4 != 0) {
                ((qc) this).field_p[var3] = var4;
                ((qc) this).field_r[var3] = param0.l(-20729);
                ((qc) this).field_y[var3] = param0.g(21231);
                var3++;
                continue L3;
              } else {
                break L4;
              }
            }
          }
          ((qc) this).field_m = param0.g(21231);
          ((qc) this).field_d = param0.g(21231);
          ((qc) this).field_k = param0.a((byte) -124);
          ((qc) this).field_e = param0.a((byte) 7);
          ((qc) this).field_u = new p();
          ((qc) this).field_i = new bk();
          ((qc) this).field_u.a(param0, ((qc) this).field_i);
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
        qb.a(field_c, 0, param0);
        if (param1 >= 10) {
          L0: {
            var3 = (double)param0 / ((double)param1 + 0.0);
            ((qc) this).field_x.a();
            ((qc) this).field_g.a();
            var5 = 0;
            var6 = 0;
            var7 = 0;
            if (((qc) this).field_h == null) {
              break L0;
            } else {
              ((qc) this).field_h.a();
              ((qc) this).field_t.a();
              var5 = (int)((double)(((qc) this).field_h.field_g - ((qc) this).field_h.field_c) * 32.768 / var3);
              var6 = (int)((double)((qc) this).field_h.field_c * 32.768 / var3);
              break L0;
            }
          }
          L1: {
            var8 = 0;
            var9 = 0;
            var10 = 0;
            if (((qc) this).field_l == null) {
              break L1;
            } else {
              ((qc) this).field_l.a();
              ((qc) this).field_f.a();
              var8 = (int)((double)(((qc) this).field_l.field_g - ((qc) this).field_l.field_c) * 32.768 / var3);
              var9 = (int)((double)((qc) this).field_l.field_c * 32.768 / var3);
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
                    if (((qc) this).field_q == null) {
                      break L4;
                    } else {
                      ((qc) this).field_q.a();
                      ((qc) this).field_b.a();
                      var11 = 0;
                      var12 = 0;
                      var13 = 1;
                      var14 = 0;
                      L5: while (true) {
                        if (var14 >= param0) {
                          break L4;
                        } else {
                          L6: {
                            var15 = ((qc) this).field_q.a(param0);
                            var16 = ((qc) this).field_b.a(param0);
                            if (var13 == 0) {
                              var12 = ((qc) this).field_q.field_c + ((((qc) this).field_q.field_g - ((qc) this).field_q.field_c) * var16 >> 8);
                              break L6;
                            } else {
                              var12 = ((qc) this).field_q.field_c + ((((qc) this).field_q.field_g - ((qc) this).field_q.field_c) * var15 >> 8);
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
                    if (((qc) this).field_m <= 0) {
                      break L9;
                    } else {
                      if (((qc) this).field_d <= 0) {
                        break L9;
                      } else {
                        var11 = (int)((double)((qc) this).field_m * var3);
                        var12 = var11;
                        L10: while (true) {
                          if (var12 >= param0) {
                            break L9;
                          } else {
                            field_c[var12] = field_c[var12] + field_c[var12 - var11] * ((qc) this).field_d / 100;
                            var12++;
                            continue L10;
                          }
                        }
                      }
                    }
                  }
                  L11: {
                    L12: {
                      if (((qc) this).field_u.field_g[0] > 0) {
                        break L12;
                      } else {
                        if (((qc) this).field_u.field_g[1] <= 0) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    ((qc) this).field_i.a();
                    var11 = ((qc) this).field_i.a(param0 + 1);
                    var12 = ((qc) this).field_u.a(0, (float)var11 / 65536.0f);
                    var13 = ((qc) this).field_u.a(1, (float)var11 / 65536.0f);
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
                                  var12 = ((qc) this).field_u.a(0, (float)var11 / 65536.0f);
                                  var13 = ((qc) this).field_u.a(1, (float)var11 / 65536.0f);
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
                                              field_c[var14] = var16;
                                              var11 = ((qc) this).field_i.a(param0 + 1);
                                              var14++;
                                              continue L18;
                                            } else {
                                              var16 = var16 - (int)((long)field_c[var14 - 1 - var17] * (long)p.field_e[1][var17] >> 16);
                                              var17++;
                                              continue L20;
                                            }
                                          }
                                        } else {
                                          var16 = var16 + (int)((long)field_c[var14 + var12 - 1 - var17] * (long)p.field_e[0][var17] >> 16);
                                          var17++;
                                          continue L19;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                var16 = (int)((long)field_c[var14 + var12] * (long)p.field_a >> 16);
                                var17 = 0;
                                L21: while (true) {
                                  if (var17 >= var12) {
                                    var17 = 0;
                                    L22: while (true) {
                                      if (var17 >= var13) {
                                        field_c[var14] = var16;
                                        var11 = ((qc) this).field_i.a(param0 + 1);
                                        var14++;
                                        continue L17;
                                      } else {
                                        var16 = var16 - (int)((long)field_c[var14 - 1 - var17] * (long)p.field_e[1][var17] >> 16);
                                        var17++;
                                        continue L22;
                                      }
                                    }
                                  } else {
                                    var16 = var16 + (int)((long)field_c[var14 + var12 - 1 - var17] * (long)p.field_e[0][var17] >> 16);
                                    var17++;
                                    continue L21;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var16 = (int)((long)field_c[var14 + var12] * (long)p.field_a >> 16);
                          var17 = 0;
                          L23: while (true) {
                            if (var17 >= var12) {
                              var17 = 0;
                              L24: while (true) {
                                if (var17 >= var14) {
                                  field_c[var14] = var16;
                                  var11 = ((qc) this).field_i.a(param0 + 1);
                                  var14++;
                                  continue L14;
                                } else {
                                  var16 = var16 - (int)((long)field_c[var14 - 1 - var17] * (long)p.field_e[1][var17] >> 16);
                                  var17++;
                                  continue L24;
                                }
                              }
                            } else {
                              var16 = var16 + (int)((long)field_c[var14 + var12 - 1 - var17] * (long)p.field_e[0][var17] >> 16);
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
                    var12 = ((qc) this).field_x.a(param0);
                    var13 = ((qc) this).field_g.a(param0);
                    if (((qc) this).field_h == null) {
                      break L27;
                    } else {
                      var14 = ((qc) this).field_h.a(param0);
                      var15 = ((qc) this).field_t.a(param0);
                      var12 = var12 + (this.a(var7, var15, ((qc) this).field_h.field_a) >> 1);
                      var7 = var7 + ((var14 * var5 >> 16) + var6);
                      break L27;
                    }
                  }
                  L28: {
                    if (((qc) this).field_l == null) {
                      break L28;
                    } else {
                      var14 = ((qc) this).field_l.a(param0);
                      var15 = ((qc) this).field_f.a(param0);
                      var13 = var13 * ((this.a(var10, var15, ((qc) this).field_l.field_a) >> 1) + 32768) >> 15;
                      var10 = var10 + ((var14 * var8 >> 16) + var9);
                      break L28;
                    }
                  }
                  var14 = 0;
                  L29: while (true) {
                    if (var14 < 5) {
                      if (((qc) this).field_p[var14] != 0) {
                        var15 = var11 + field_j[var14];
                        if (var15 < param0) {
                          field_c[var15] = field_c[var15] + this.a(field_n[var14], var13 * field_w[var14] >> 15, ((qc) this).field_x.field_a);
                          field_n[var14] = field_n[var14] + ((var12 * field_a[var14] >> 16) + field_o[var14]);
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
              if (((qc) this).field_p[var11] != 0) {
                field_n[var11] = 0;
                field_j[var11] = (int)((double)((qc) this).field_y[var11] * var3);
                field_w[var11] = (((qc) this).field_p[var11] << 14) / 100;
                field_a[var11] = (int)((double)(((qc) this).field_x.field_g - ((qc) this).field_x.field_c) * 32.768 * Math.pow(1.0057929410678534, (double)((qc) this).field_r[var11]) / var3);
                field_o[var11] = (int)((double)((qc) this).field_x.field_c * 32.768 / var3);
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

    public static void a() {
        field_c = null;
        field_s = null;
        field_v = null;
        field_n = null;
        field_j = null;
        field_w = null;
        field_a = null;
        field_o = null;
    }

    private final int a(int param0, int param1, int param2) {
        if (param2 == 1) {
            if ((param0 & 32767) < 16384) {
                return param1;
            }
            return -param1;
        }
        if (param2 == 2) {
            return field_v[param0 & 32767] * param1 >> 14;
        }
        if (param2 == 3) {
            return ((param0 & 32767) * param1 >> 14) - param1;
        }
        if (param2 == 4) {
            return field_s[param0 / 2607 & 32767] * param1;
        }
        return 0;
    }

    qc() {
        ((qc) this).field_p = new int[]{0, 0, 0, 0, 0};
        ((qc) this).field_m = 0;
        ((qc) this).field_r = new int[]{0, 0, 0, 0, 0};
        ((qc) this).field_y = new int[]{0, 0, 0, 0, 0};
        ((qc) this).field_e = 0;
        ((qc) this).field_d = 100;
        ((qc) this).field_k = 500;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var1 = 0;
        field_s = new int[32768];
        Random var0 = new Random(0L);
        for (var1 = 0; var1 < 32768; var1++) {
            field_s[var1] = (var0.nextInt() & 2) - 1;
        }
        field_v = new int[32768];
        for (var1 = 0; var1 < 32768; var1++) {
            field_v[var1] = (int)(Math.sin((double)var1 / 5215.1903) * 16384.0);
        }
        field_c = new int[220500];
        field_o = new int[5];
        field_w = new int[5];
        field_n = new int[5];
        field_a = new int[5];
        field_j = new int[5];
    }
}
