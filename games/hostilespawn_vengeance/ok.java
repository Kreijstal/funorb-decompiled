/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ok {
    private ma field_c;
    private int[] field_w;
    private int field_e;
    private ma field_p;
    private int field_o;
    private static int[] field_m;
    private ma field_l;
    private static int[] field_j;
    private int[] field_h;
    private dj field_q;
    private ma field_u;
    int field_y;
    private ma field_t;
    private int[] field_d;
    private static int[] field_v;
    private ma field_x;
    private ma field_n;
    private ma field_f;
    private static int[] field_k;
    private static int[] field_a;
    private static int[] field_r;
    private static int[] field_s;
    private ma field_i;
    int field_g;
    private static int[] field_b;

    public static void a() {
        field_j = null;
        field_v = null;
        field_m = null;
        field_a = null;
        field_r = null;
        field_b = null;
        field_k = null;
        field_s = null;
    }

    private final int a(int param0, int param1, int param2) {
        if (param2 == 1) {
            if ((param0 & 32767) < 16384) {
                return param1;
            }
            return -param1;
        }
        if (param2 == 2) {
            return field_m[param0 & 32767] * param1 >> 14;
        }
        if (param2 == 3) {
            return ((param0 & 32767) * param1 >> 14) - param1;
        }
        if (param2 == 4) {
            return field_v[param0 / 2607 & 32767] * param1;
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
        kf.a(field_j, 0, param0);
        if (param1 >= 10) {
          L0: {
            var3 = (double)param0 / ((double)param1 + 0.0);
            ((ok) this).field_n.a();
            ((ok) this).field_c.a();
            var5 = 0;
            var6 = 0;
            var7 = 0;
            if (((ok) this).field_i == null) {
              break L0;
            } else {
              ((ok) this).field_i.a();
              ((ok) this).field_l.a();
              var5 = (int)((double)(((ok) this).field_i.field_f - ((ok) this).field_i.field_i) * 32.768 / var3);
              var6 = (int)((double)((ok) this).field_i.field_i * 32.768 / var3);
              break L0;
            }
          }
          L1: {
            var8 = 0;
            var9 = 0;
            var10 = 0;
            if (((ok) this).field_p == null) {
              break L1;
            } else {
              ((ok) this).field_p.a();
              ((ok) this).field_x.a();
              var8 = (int)((double)(((ok) this).field_p.field_f - ((ok) this).field_p.field_i) * 32.768 / var3);
              var9 = (int)((double)((ok) this).field_p.field_i * 32.768 / var3);
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
                    if (((ok) this).field_t == null) {
                      break L4;
                    } else {
                      ((ok) this).field_t.a();
                      ((ok) this).field_f.a();
                      var11 = 0;
                      var12 = 0;
                      var13 = 1;
                      var14 = 0;
                      L5: while (true) {
                        if (var14 >= param0) {
                          break L4;
                        } else {
                          L6: {
                            var15 = ((ok) this).field_t.a(param0);
                            var16 = ((ok) this).field_f.a(param0);
                            if (var13 == 0) {
                              var12 = ((ok) this).field_t.field_i + ((((ok) this).field_t.field_f - ((ok) this).field_t.field_i) * var16 >> 8);
                              break L6;
                            } else {
                              var12 = ((ok) this).field_t.field_i + ((((ok) this).field_t.field_f - ((ok) this).field_t.field_i) * var15 >> 8);
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
                            field_j[var14] = 0;
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
                    if (((ok) this).field_o <= 0) {
                      break L9;
                    } else {
                      if (((ok) this).field_e <= 0) {
                        break L9;
                      } else {
                        var11 = (int)((double)((ok) this).field_o * var3);
                        var12 = var11;
                        L10: while (true) {
                          if (var12 >= param0) {
                            break L9;
                          } else {
                            field_j[var12] = field_j[var12] + field_j[var12 - var11] * ((ok) this).field_e / 100;
                            var12++;
                            continue L10;
                          }
                        }
                      }
                    }
                  }
                  L11: {
                    L12: {
                      if (((ok) this).field_q.field_a[0] > 0) {
                        break L12;
                      } else {
                        if (((ok) this).field_q.field_a[1] <= 0) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    ((ok) this).field_u.a();
                    var11 = ((ok) this).field_u.a(param0 + 1);
                    var12 = ((ok) this).field_q.a(0, (float)var11 / 65536.0f);
                    var13 = ((ok) this).field_q.a(1, (float)var11 / 65536.0f);
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
                                  var12 = ((ok) this).field_q.a(0, (float)var11 / 65536.0f);
                                  var13 = ((ok) this).field_q.a(1, (float)var11 / 65536.0f);
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
                                              field_j[var14] = var16;
                                              var11 = ((ok) this).field_u.a(param0 + 1);
                                              var14++;
                                              continue L18;
                                            } else {
                                              var16 = var16 - (int)((long)field_j[var14 - 1 - var17] * (long)dj.field_b[1][var17] >> 16);
                                              var17++;
                                              continue L20;
                                            }
                                          }
                                        } else {
                                          var16 = var16 + (int)((long)field_j[var14 + var12 - 1 - var17] * (long)dj.field_b[0][var17] >> 16);
                                          var17++;
                                          continue L19;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                var16 = (int)((long)field_j[var14 + var12] * (long)dj.field_d >> 16);
                                var17 = 0;
                                L21: while (true) {
                                  if (var17 >= var12) {
                                    var17 = 0;
                                    L22: while (true) {
                                      if (var17 >= var13) {
                                        field_j[var14] = var16;
                                        var11 = ((ok) this).field_u.a(param0 + 1);
                                        var14++;
                                        continue L17;
                                      } else {
                                        var16 = var16 - (int)((long)field_j[var14 - 1 - var17] * (long)dj.field_b[1][var17] >> 16);
                                        var17++;
                                        continue L22;
                                      }
                                    }
                                  } else {
                                    var16 = var16 + (int)((long)field_j[var14 + var12 - 1 - var17] * (long)dj.field_b[0][var17] >> 16);
                                    var17++;
                                    continue L21;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var16 = (int)((long)field_j[var14 + var12] * (long)dj.field_d >> 16);
                          var17 = 0;
                          L23: while (true) {
                            if (var17 >= var12) {
                              var17 = 0;
                              L24: while (true) {
                                if (var17 >= var14) {
                                  field_j[var14] = var16;
                                  var11 = ((ok) this).field_u.a(param0 + 1);
                                  var14++;
                                  continue L14;
                                } else {
                                  var16 = var16 - (int)((long)field_j[var14 - 1 - var17] * (long)dj.field_b[1][var17] >> 16);
                                  var17++;
                                  continue L24;
                                }
                              }
                            } else {
                              var16 = var16 + (int)((long)field_j[var14 + var12 - 1 - var17] * (long)dj.field_b[0][var17] >> 16);
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
                      return field_j;
                    } else {
                      L26: {
                        if (field_j[var11] >= -32768) {
                          break L26;
                        } else {
                          field_j[var11] = -32768;
                          break L26;
                        }
                      }
                      if (field_j[var11] > 32767) {
                        field_j[var11] = 32767;
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
                    var12 = ((ok) this).field_n.a(param0);
                    var13 = ((ok) this).field_c.a(param0);
                    if (((ok) this).field_i == null) {
                      break L27;
                    } else {
                      var14 = ((ok) this).field_i.a(param0);
                      var15 = ((ok) this).field_l.a(param0);
                      var12 = var12 + (this.a(var7, var15, ((ok) this).field_i.field_b) >> 1);
                      var7 = var7 + ((var14 * var5 >> 16) + var6);
                      break L27;
                    }
                  }
                  L28: {
                    if (((ok) this).field_p == null) {
                      break L28;
                    } else {
                      var14 = ((ok) this).field_p.a(param0);
                      var15 = ((ok) this).field_x.a(param0);
                      var13 = var13 * ((this.a(var10, var15, ((ok) this).field_p.field_b) >> 1) + 32768) >> 15;
                      var10 = var10 + ((var14 * var8 >> 16) + var9);
                      break L28;
                    }
                  }
                  var14 = 0;
                  L29: while (true) {
                    if (var14 < 5) {
                      if (((ok) this).field_w[var14] != 0) {
                        var15 = var11 + field_r[var14];
                        if (var15 < param0) {
                          field_j[var15] = field_j[var15] + this.a(field_a[var14], var13 * field_b[var14] >> 15, ((ok) this).field_n.field_b);
                          field_a[var14] = field_a[var14] + ((var12 * field_k[var14] >> 16) + field_s[var14]);
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
              if (((ok) this).field_w[var11] != 0) {
                field_a[var11] = 0;
                field_r[var11] = (int)((double)((ok) this).field_d[var11] * var3);
                field_b[var11] = (((ok) this).field_w[var11] << 14) / 100;
                field_k[var11] = (int)((double)(((ok) this).field_n.field_f - ((ok) this).field_n.field_i) * 32.768 * Math.pow(1.0057929410678534, (double)((ok) this).field_h[var11]) / var3);
                field_s[var11] = (int)((double)((ok) this).field_n.field_i * 32.768 / var3);
                var11++;
                continue L2;
              } else {
                var11++;
                continue L2;
              }
            }
          }
        } else {
          return field_j;
        }
    }

    final void a(vi param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          ((ok) this).field_n = new ma();
          ((ok) this).field_n.a(param0);
          ((ok) this).field_c = new ma();
          ((ok) this).field_c.a(param0);
          var2 = param0.l(32270);
          if (var2 == 0) {
            break L0;
          } else {
            param0.field_i = param0.field_i - 1;
            ((ok) this).field_i = new ma();
            ((ok) this).field_i.a(param0);
            ((ok) this).field_l = new ma();
            ((ok) this).field_l.a(param0);
            break L0;
          }
        }
        L1: {
          var2 = param0.l(32270);
          if (var2 == 0) {
            break L1;
          } else {
            param0.field_i = param0.field_i - 1;
            ((ok) this).field_p = new ma();
            ((ok) this).field_p.a(param0);
            ((ok) this).field_x = new ma();
            ((ok) this).field_x.a(param0);
            break L1;
          }
        }
        L2: {
          var2 = param0.l(32270);
          if (var2 == 0) {
            break L2;
          } else {
            param0.field_i = param0.field_i - 1;
            ((ok) this).field_t = new ma();
            ((ok) this).field_t.a(param0);
            ((ok) this).field_f = new ma();
            ((ok) this).field_f.a(param0);
            break L2;
          }
        }
        var3 = 0;
        L3: while (true) {
          L4: {
            if (var3 >= 10) {
              break L4;
            } else {
              var4 = param0.f(255);
              if (var4 != 0) {
                ((ok) this).field_w[var3] = var4;
                ((ok) this).field_h[var3] = param0.i(64);
                ((ok) this).field_d[var3] = param0.f(255);
                var3++;
                continue L3;
              } else {
                break L4;
              }
            }
          }
          ((ok) this).field_o = param0.f(255);
          ((ok) this).field_e = param0.f(255);
          ((ok) this).field_g = param0.e(8);
          ((ok) this).field_y = param0.e(8);
          ((ok) this).field_q = new dj();
          ((ok) this).field_u = new ma();
          ((ok) this).field_q.a(param0, ((ok) this).field_u);
          return;
        }
    }

    ok() {
        ((ok) this).field_w = new int[]{0, 0, 0, 0, 0};
        ((ok) this).field_h = new int[]{0, 0, 0, 0, 0};
        ((ok) this).field_o = 0;
        ((ok) this).field_e = 100;
        ((ok) this).field_y = 0;
        ((ok) this).field_d = new int[]{0, 0, 0, 0, 0};
        ((ok) this).field_g = 500;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var1 = 0;
        field_v = new int[32768];
        Random var0 = new Random(0L);
        for (var1 = 0; var1 < 32768; var1++) {
            field_v[var1] = (var0.nextInt() & 2) - 1;
        }
        field_m = new int[32768];
        for (var1 = 0; var1 < 32768; var1++) {
            field_m[var1] = (int)(Math.sin((double)var1 / 5215.1903) * 16384.0);
        }
        field_j = new int[220500];
        field_r = new int[5];
        field_k = new int[5];
        field_a = new int[5];
        field_s = new int[5];
        field_b = new int[5];
    }
}
