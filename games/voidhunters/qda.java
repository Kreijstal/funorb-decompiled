/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qda {
    private int field_s;
    private int[] field_r;
    private int field_u;
    private hc field_i;
    private rpb field_e;
    private rpb field_y;
    private rpb field_w;
    private rpb field_c;
    private rpb field_o;
    int field_k;
    int field_d;
    private int[] field_n;
    private rpb field_j;
    private static int[] field_f;
    private int[] field_q;
    private static int[] field_m;
    private rpb field_x;
    private rpb field_b;
    private rpb field_a;
    private static int[] field_g;
    private static int[] field_l;
    private static int[] field_p;
    private static int[] field_h;
    private static int[] field_v;
    private static int[] field_t;

    public static void a() {
        field_f = null;
        field_g = null;
        field_m = null;
        field_t = null;
        field_l = null;
        field_h = null;
        field_v = null;
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
        cua.a(field_f, 0, param0);
        if (param1 >= 10) {
          L0: {
            var3 = (double)param0 / ((double)param1 + 0.0);
            ((qda) this).field_o.a();
            ((qda) this).field_c.a();
            var5 = 0;
            var6 = 0;
            var7 = 0;
            if (((qda) this).field_y == null) {
              break L0;
            } else {
              ((qda) this).field_y.a();
              ((qda) this).field_b.a();
              var5 = (int)((double)(((qda) this).field_y.field_j - ((qda) this).field_y.field_i) * 32.768 / var3);
              var6 = (int)((double)((qda) this).field_y.field_i * 32.768 / var3);
              break L0;
            }
          }
          L1: {
            var8 = 0;
            var9 = 0;
            var10 = 0;
            if (((qda) this).field_j == null) {
              break L1;
            } else {
              ((qda) this).field_j.a();
              ((qda) this).field_w.a();
              var8 = (int)((double)(((qda) this).field_j.field_j - ((qda) this).field_j.field_i) * 32.768 / var3);
              var9 = (int)((double)((qda) this).field_j.field_i * 32.768 / var3);
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
                    if (((qda) this).field_e == null) {
                      break L4;
                    } else {
                      ((qda) this).field_e.a();
                      ((qda) this).field_a.a();
                      var11 = 0;
                      var12 = 0;
                      var13 = 1;
                      var14 = 0;
                      L5: while (true) {
                        if (var14 >= param0) {
                          break L4;
                        } else {
                          L6: {
                            var15 = ((qda) this).field_e.a(param0);
                            var16 = ((qda) this).field_a.a(param0);
                            if (var13 == 0) {
                              var12 = ((qda) this).field_e.field_i + ((((qda) this).field_e.field_j - ((qda) this).field_e.field_i) * var16 >> 8);
                              break L6;
                            } else {
                              var12 = ((qda) this).field_e.field_i + ((((qda) this).field_e.field_j - ((qda) this).field_e.field_i) * var15 >> 8);
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
                            field_f[var14] = 0;
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
                    if (((qda) this).field_s <= 0) {
                      break L9;
                    } else {
                      if (((qda) this).field_u <= 0) {
                        break L9;
                      } else {
                        var11 = (int)((double)((qda) this).field_s * var3);
                        var12 = var11;
                        L10: while (true) {
                          if (var12 >= param0) {
                            break L9;
                          } else {
                            field_f[var12] = field_f[var12] + field_f[var12 - var11] * ((qda) this).field_u / 100;
                            var12++;
                            continue L10;
                          }
                        }
                      }
                    }
                  }
                  L11: {
                    L12: {
                      if (((qda) this).field_i.field_g[0] > 0) {
                        break L12;
                      } else {
                        if (((qda) this).field_i.field_g[1] <= 0) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    ((qda) this).field_x.a();
                    var11 = ((qda) this).field_x.a(param0 + 1);
                    var12 = ((qda) this).field_i.a(0, (float)var11 / 65536.0f);
                    var13 = ((qda) this).field_i.a(1, (float)var11 / 65536.0f);
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
                                  var12 = ((qda) this).field_i.a(0, (float)var11 / 65536.0f);
                                  var13 = ((qda) this).field_i.a(1, (float)var11 / 65536.0f);
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
                                              field_f[var14] = var16;
                                              var11 = ((qda) this).field_x.a(param0 + 1);
                                              var14++;
                                              continue L18;
                                            } else {
                                              var16 = var16 - (int)((long)field_f[var14 - 1 - var17] * (long)hc.field_f[1][var17] >> 16);
                                              var17++;
                                              continue L20;
                                            }
                                          }
                                        } else {
                                          var16 = var16 + (int)((long)field_f[var14 + var12 - 1 - var17] * (long)hc.field_f[0][var17] >> 16);
                                          var17++;
                                          continue L19;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                var16 = (int)((long)field_f[var14 + var12] * (long)hc.field_d >> 16);
                                var17 = 0;
                                L21: while (true) {
                                  if (var17 >= var12) {
                                    var17 = 0;
                                    L22: while (true) {
                                      if (var17 >= var13) {
                                        field_f[var14] = var16;
                                        var11 = ((qda) this).field_x.a(param0 + 1);
                                        var14++;
                                        continue L17;
                                      } else {
                                        var16 = var16 - (int)((long)field_f[var14 - 1 - var17] * (long)hc.field_f[1][var17] >> 16);
                                        var17++;
                                        continue L22;
                                      }
                                    }
                                  } else {
                                    var16 = var16 + (int)((long)field_f[var14 + var12 - 1 - var17] * (long)hc.field_f[0][var17] >> 16);
                                    var17++;
                                    continue L21;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var16 = (int)((long)field_f[var14 + var12] * (long)hc.field_d >> 16);
                          var17 = 0;
                          L23: while (true) {
                            if (var17 >= var12) {
                              var17 = 0;
                              L24: while (true) {
                                if (var17 >= var14) {
                                  field_f[var14] = var16;
                                  var11 = ((qda) this).field_x.a(param0 + 1);
                                  var14++;
                                  continue L14;
                                } else {
                                  var16 = var16 - (int)((long)field_f[var14 - 1 - var17] * (long)hc.field_f[1][var17] >> 16);
                                  var17++;
                                  continue L24;
                                }
                              }
                            } else {
                              var16 = var16 + (int)((long)field_f[var14 + var12 - 1 - var17] * (long)hc.field_f[0][var17] >> 16);
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
                      return field_f;
                    } else {
                      L26: {
                        if (field_f[var11] >= -32768) {
                          break L26;
                        } else {
                          field_f[var11] = -32768;
                          break L26;
                        }
                      }
                      if (field_f[var11] > 32767) {
                        field_f[var11] = 32767;
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
                    var12 = ((qda) this).field_o.a(param0);
                    var13 = ((qda) this).field_c.a(param0);
                    if (((qda) this).field_y == null) {
                      break L27;
                    } else {
                      var14 = ((qda) this).field_y.a(param0);
                      var15 = ((qda) this).field_b.a(param0);
                      var12 = var12 + (this.a(var7, var15, ((qda) this).field_y.field_e) >> 1);
                      var7 = var7 + ((var14 * var5 >> 16) + var6);
                      break L27;
                    }
                  }
                  L28: {
                    if (((qda) this).field_j == null) {
                      break L28;
                    } else {
                      var14 = ((qda) this).field_j.a(param0);
                      var15 = ((qda) this).field_w.a(param0);
                      var13 = var13 * ((this.a(var10, var15, ((qda) this).field_j.field_e) >> 1) + 32768) >> 15;
                      var10 = var10 + ((var14 * var8 >> 16) + var9);
                      break L28;
                    }
                  }
                  var14 = 0;
                  L29: while (true) {
                    if (var14 < 5) {
                      if (((qda) this).field_n[var14] != 0) {
                        var15 = var11 + field_l[var14];
                        if (var15 < param0) {
                          field_f[var15] = field_f[var15] + this.a(field_t[var14], var13 * field_h[var14] >> 15, ((qda) this).field_o.field_e);
                          field_t[var14] = field_t[var14] + ((var12 * field_v[var14] >> 16) + field_p[var14]);
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
              if (((qda) this).field_n[var11] != 0) {
                field_t[var11] = 0;
                field_l[var11] = (int)((double)((qda) this).field_q[var11] * var3);
                field_h[var11] = (((qda) this).field_n[var11] << 14) / 100;
                field_v[var11] = (int)((double)(((qda) this).field_o.field_j - ((qda) this).field_o.field_i) * 32.768 * Math.pow(1.0057929410678534, (double)((qda) this).field_r[var11]) / var3);
                field_p[var11] = (int)((double)((qda) this).field_o.field_i * 32.768 / var3);
                var11++;
                continue L2;
              } else {
                var11++;
                continue L2;
              }
            }
          }
        } else {
          return field_f;
        }
    }

    final void a(ds param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          ((qda) this).field_o = new rpb();
          ((qda) this).field_o.b(param0);
          ((qda) this).field_c = new rpb();
          ((qda) this).field_c.b(param0);
          var2 = param0.e((byte) -87);
          if (var2 == 0) {
            break L0;
          } else {
            param0.field_e = param0.field_e - 1;
            ((qda) this).field_y = new rpb();
            ((qda) this).field_y.b(param0);
            ((qda) this).field_b = new rpb();
            ((qda) this).field_b.b(param0);
            break L0;
          }
        }
        L1: {
          var2 = param0.e((byte) -106);
          if (var2 == 0) {
            break L1;
          } else {
            param0.field_e = param0.field_e - 1;
            ((qda) this).field_j = new rpb();
            ((qda) this).field_j.b(param0);
            ((qda) this).field_w = new rpb();
            ((qda) this).field_w.b(param0);
            break L1;
          }
        }
        L2: {
          var2 = param0.e((byte) -98);
          if (var2 == 0) {
            break L2;
          } else {
            param0.field_e = param0.field_e - 1;
            ((qda) this).field_e = new rpb();
            ((qda) this).field_e.b(param0);
            ((qda) this).field_a = new rpb();
            ((qda) this).field_a.b(param0);
            break L2;
          }
        }
        var3 = 0;
        L3: while (true) {
          L4: {
            if (var3 >= 10) {
              break L4;
            } else {
              var4 = param0.f(107);
              if (var4 != 0) {
                ((qda) this).field_n[var3] = var4;
                ((qda) this).field_r[var3] = param0.d(0);
                ((qda) this).field_q[var3] = param0.f(50);
                var3++;
                continue L3;
              } else {
                break L4;
              }
            }
          }
          ((qda) this).field_s = param0.f(84);
          ((qda) this).field_u = param0.f(120);
          ((qda) this).field_d = param0.e(1869);
          ((qda) this).field_k = param0.e(1869);
          ((qda) this).field_i = new hc();
          ((qda) this).field_x = new rpb();
          ((qda) this).field_i.a(param0, ((qda) this).field_x);
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
            return field_m[param0 & 32767] * param1 >> 14;
        }
        if (param2 == 3) {
            return ((param0 & 32767) * param1 >> 14) - param1;
        }
        if (param2 == 4) {
            return field_g[param0 / 2607 & 32767] * param1;
        }
        return 0;
    }

    qda() {
        ((qda) this).field_k = 0;
        ((qda) this).field_r = new int[]{0, 0, 0, 0, 0};
        ((qda) this).field_n = new int[]{0, 0, 0, 0, 0};
        ((qda) this).field_q = new int[]{0, 0, 0, 0, 0};
        ((qda) this).field_u = 100;
        ((qda) this).field_s = 0;
        ((qda) this).field_d = 500;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var1 = 0;
        field_g = new int[32768];
        Random var0 = new Random(0L);
        for (var1 = 0; var1 < 32768; var1++) {
            field_g[var1] = (var0.nextInt() & 2) - 1;
        }
        field_m = new int[32768];
        for (var1 = 0; var1 < 32768; var1++) {
            field_m[var1] = (int)(Math.sin((double)var1 / 5215.1903) * 16384.0);
        }
        field_f = new int[220500];
        field_l = new int[5];
        field_p = new int[5];
        field_v = new int[5];
        field_h = new int[5];
        field_t = new int[5];
    }
}
