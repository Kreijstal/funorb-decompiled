/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qq {
    private int field_n;
    private wa field_q;
    private static int[] field_c;
    private wa field_m;
    private int field_i;
    private wa field_b;
    private static int[] field_r;
    private wa field_x;
    private wa field_w;
    private int[] field_d;
    private wa field_p;
    private ho field_v;
    private int[] field_e;
    private wa field_s;
    int field_g;
    private int[] field_k;
    int field_j;
    private wa field_l;
    private wa field_u;
    private static int[] field_y;
    private static int[] field_o;
    private static int[] field_h;
    private static int[] field_f;
    private static int[] field_a;
    private static int[] field_t;

    public static void a() {
        field_r = null;
        field_c = null;
        field_y = null;
        field_a = null;
        field_t = null;
        field_f = null;
        field_o = null;
        field_h = null;
    }

    private final int a(int param0, int param1, int param2) {
        if (param2 == 1) {
            if ((param0 & 32767) < 16384) {
                return param1;
            }
            return -param1;
        }
        if (param2 == 2) {
            return field_y[param0 & 32767] * param1 >> 14;
        }
        if (param2 == 3) {
            return ((param0 & 32767) * param1 >> 14) - param1;
        }
        if (param2 == 4) {
            return field_c[param0 / 2607 & 32767] * param1;
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
        int stackOut_35_0;
        int stackOut_34_0;
        pm.a(field_r, 0, param0);
        if (param1 >= 10) {
          L0: {
            var3 = (double)param0 / ((double)param1 + 0.0);
            ((qq) this).field_x.a();
            ((qq) this).field_s.a();
            var5 = 0;
            var6 = 0;
            var7 = 0;
            if (((qq) this).field_u == null) {
              break L0;
            } else {
              ((qq) this).field_u.a();
              ((qq) this).field_m.a();
              var5 = (int)((double)(((qq) this).field_u.field_i - ((qq) this).field_u.field_a) * 32.768 / var3);
              var6 = (int)((double)((qq) this).field_u.field_a * 32.768 / var3);
              break L0;
            }
          }
          L1: {
            var8 = 0;
            var9 = 0;
            var10 = 0;
            if (((qq) this).field_q == null) {
              break L1;
            } else {
              ((qq) this).field_q.a();
              ((qq) this).field_b.a();
              var8 = (int)((double)(((qq) this).field_q.field_i - ((qq) this).field_q.field_a) * 32.768 / var3);
              var9 = (int)((double)((qq) this).field_q.field_a * 32.768 / var3);
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
                    if (((qq) this).field_p == null) {
                      break L4;
                    } else {
                      ((qq) this).field_p.a();
                      ((qq) this).field_l.a();
                      var11 = 0;
                      var12 = 0;
                      var13 = 1;
                      var14 = 0;
                      L5: while (true) {
                        if (var14 >= param0) {
                          break L4;
                        } else {
                          L6: {
                            var15 = ((qq) this).field_p.a(param0);
                            var16 = ((qq) this).field_l.a(param0);
                            if (var13 == 0) {
                              var12 = ((qq) this).field_p.field_a + ((((qq) this).field_p.field_i - ((qq) this).field_p.field_a) * var16 >> 8);
                              break L6;
                            } else {
                              var12 = ((qq) this).field_p.field_a + ((((qq) this).field_p.field_i - ((qq) this).field_p.field_a) * var15 >> 8);
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
                    if (((qq) this).field_n <= 0) {
                      break L9;
                    } else {
                      if (((qq) this).field_i <= 0) {
                        break L9;
                      } else {
                        var11 = (int)((double)((qq) this).field_n * var3);
                        var12 = var11;
                        L10: while (true) {
                          if (var12 >= param0) {
                            break L9;
                          } else {
                            field_r[var12] = field_r[var12] + field_r[var12 - var11] * ((qq) this).field_i / 100;
                            var12++;
                            continue L10;
                          }
                        }
                      }
                    }
                  }
                  L11: {
                    L12: {
                      if (((qq) this).field_v.field_a[0] > 0) {
                        break L12;
                      } else {
                        if (((qq) this).field_v.field_a[1] <= 0) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    ((qq) this).field_w.a();
                    var11 = ((qq) this).field_w.a(param0 + 1);
                    var12 = ((qq) this).field_v.a(0, (float)var11 / 65536.0f);
                    var13 = ((qq) this).field_v.a(1, (float)var11 / 65536.0f);
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
                                  var12 = ((qq) this).field_v.a(0, (float)var11 / 65536.0f);
                                  var13 = ((qq) this).field_v.a(1, (float)var11 / 65536.0f);
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
                                              field_r[var14] = var16;
                                              var11 = ((qq) this).field_w.a(param0 + 1);
                                              var14++;
                                              continue L18;
                                            } else {
                                              var16 = var16 - (int)((long)field_r[var14 - 1 - var17] * (long)ho.field_d[1][var17] >> 16);
                                              var17++;
                                              continue L20;
                                            }
                                          }
                                        } else {
                                          var16 = var16 + (int)((long)field_r[var14 + var12 - 1 - var17] * (long)ho.field_d[0][var17] >> 16);
                                          var17++;
                                          continue L19;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                var16 = (int)((long)field_r[var14 + var12] * (long)ho.field_h >> 16);
                                var17 = 0;
                                L21: while (true) {
                                  if (var17 >= var12) {
                                    var17 = 0;
                                    L22: while (true) {
                                      if (var17 >= var13) {
                                        field_r[var14] = var16;
                                        var11 = ((qq) this).field_w.a(param0 + 1);
                                        var14++;
                                        continue L17;
                                      } else {
                                        var16 = var16 - (int)((long)field_r[var14 - 1 - var17] * (long)ho.field_d[1][var17] >> 16);
                                        var17++;
                                        continue L22;
                                      }
                                    }
                                  } else {
                                    var16 = var16 + (int)((long)field_r[var14 + var12 - 1 - var17] * (long)ho.field_d[0][var17] >> 16);
                                    var17++;
                                    continue L21;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var16 = (int)((long)field_r[var14 + var12] * (long)ho.field_h >> 16);
                          var17 = 0;
                          L23: while (true) {
                            if (var17 >= var12) {
                              var17 = 0;
                              L24: while (true) {
                                if (var17 >= var14) {
                                  field_r[var14] = var16;
                                  var11 = ((qq) this).field_w.a(param0 + 1);
                                  var14++;
                                  continue L14;
                                } else {
                                  var16 = var16 - (int)((long)field_r[var14 - 1 - var17] * (long)ho.field_d[1][var17] >> 16);
                                  var17++;
                                  continue L24;
                                }
                              }
                            } else {
                              var16 = var16 + (int)((long)field_r[var14 + var12 - 1 - var17] * (long)ho.field_d[0][var17] >> 16);
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
                    var12 = ((qq) this).field_x.a(param0);
                    var13 = ((qq) this).field_s.a(param0);
                    if (((qq) this).field_u == null) {
                      break L27;
                    } else {
                      var14 = ((qq) this).field_u.a(param0);
                      var15 = ((qq) this).field_m.a(param0);
                      var12 = var12 + (this.a(var7, var15, ((qq) this).field_u.field_k) >> 1);
                      var7 = var7 + ((var14 * var5 >> 16) + var6);
                      break L27;
                    }
                  }
                  L28: {
                    if (((qq) this).field_q == null) {
                      break L28;
                    } else {
                      var14 = ((qq) this).field_q.a(param0);
                      var15 = ((qq) this).field_b.a(param0);
                      var13 = var13 * ((this.a(var10, var15, ((qq) this).field_q.field_k) >> 1) + 32768) >> 15;
                      var10 = var10 + ((var14 * var8 >> 16) + var9);
                      break L28;
                    }
                  }
                  var14 = 0;
                  L29: while (true) {
                    if (var14 < 5) {
                      if (((qq) this).field_k[var14] != 0) {
                        var15 = var11 + field_t[var14];
                        if (var15 < param0) {
                          field_r[var15] = field_r[var15] + this.a(field_a[var14], var13 * field_f[var14] >> 15, ((qq) this).field_x.field_k);
                          field_a[var14] = field_a[var14] + ((var12 * field_o[var14] >> 16) + field_h[var14]);
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
              if (((qq) this).field_k[var11] != 0) {
                field_a[var11] = 0;
                field_t[var11] = (int)((double)((qq) this).field_e[var11] * var3);
                field_f[var11] = (((qq) this).field_k[var11] << 14) / 100;
                field_o[var11] = (int)((double)(((qq) this).field_x.field_i - ((qq) this).field_x.field_a) * 32.768 * Math.pow(1.0057929410678534, (double)((qq) this).field_d[var11]) / var3);
                field_h[var11] = (int)((double)((qq) this).field_x.field_a * 32.768 / var3);
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

    final void a(wq param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          ((qq) this).field_x = new wa();
          ((qq) this).field_x.b(param0);
          ((qq) this).field_s = new wa();
          ((qq) this).field_s.b(param0);
          var2 = param0.l(255);
          if (var2 == 0) {
            break L0;
          } else {
            param0.field_l = param0.field_l - 1;
            ((qq) this).field_u = new wa();
            ((qq) this).field_u.b(param0);
            ((qq) this).field_m = new wa();
            ((qq) this).field_m.b(param0);
            break L0;
          }
        }
        L1: {
          var2 = param0.l(255);
          if (var2 == 0) {
            break L1;
          } else {
            param0.field_l = param0.field_l - 1;
            ((qq) this).field_q = new wa();
            ((qq) this).field_q.b(param0);
            ((qq) this).field_b = new wa();
            ((qq) this).field_b.b(param0);
            break L1;
          }
        }
        L2: {
          var2 = param0.l(255);
          if (var2 == 0) {
            break L2;
          } else {
            param0.field_l = param0.field_l - 1;
            ((qq) this).field_p = new wa();
            ((qq) this).field_p.b(param0);
            ((qq) this).field_l = new wa();
            ((qq) this).field_l.b(param0);
            break L2;
          }
        }
        var3 = 0;
        L3: while (true) {
          L4: {
            if (var3 >= 10) {
              break L4;
            } else {
              var4 = param0.k(-32768);
              if (var4 != 0) {
                ((qq) this).field_k[var3] = var4;
                ((qq) this).field_d[var3] = param0.c(-1342);
                ((qq) this).field_e[var3] = param0.k(-32768);
                var3++;
                continue L3;
              } else {
                break L4;
              }
            }
          }
          ((qq) this).field_n = param0.k(-32768);
          ((qq) this).field_i = param0.k(-32768);
          ((qq) this).field_j = param0.i(65280);
          ((qq) this).field_g = param0.i(65280);
          ((qq) this).field_v = new ho();
          ((qq) this).field_w = new wa();
          ((qq) this).field_v.a(param0, ((qq) this).field_w);
          return;
        }
    }

    qq() {
        ((qq) this).field_n = 0;
        ((qq) this).field_i = 100;
        ((qq) this).field_d = new int[]{0, 0, 0, 0, 0};
        ((qq) this).field_e = new int[]{0, 0, 0, 0, 0};
        ((qq) this).field_k = new int[]{0, 0, 0, 0, 0};
        ((qq) this).field_j = 500;
        ((qq) this).field_g = 0;
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
        field_y = new int[32768];
        for (var1 = 0; var1 < 32768; var1++) {
            field_y[var1] = (int)(Math.sin((double)var1 / 5215.1903) * 16384.0);
        }
        field_r = new int[220500];
        field_o = new int[5];
        field_a = new int[5];
        field_t = new int[5];
        field_h = new int[5];
        field_f = new int[5];
    }
}
