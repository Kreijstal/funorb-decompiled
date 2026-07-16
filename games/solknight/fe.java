/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class fe {
    private int field_j;
    private int field_s;
    private vi field_i;
    private int[] field_r;
    private vi field_f;
    int field_n;
    private vi field_o;
    private static int[] field_y;
    private static int[] field_d;
    private vi field_h;
    private vi field_b;
    private tj field_k;
    private vi field_e;
    private vi field_u;
    private vi field_x;
    int field_m;
    private int[] field_w;
    private static int[] field_t;
    private vi field_a;
    private static int[] field_g;
    private static int[] field_p;
    private static int[] field_c;
    private int[] field_l;
    private static int[] field_v;
    private static int[] field_q;

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
            return field_d[param0 / 2607 & 32767] * param1;
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
        fk.a(field_t, 0, param0);
        if (param1 >= 10) {
          L0: {
            var3 = (double)param0 / ((double)param1 + 0.0);
            ((fe) this).field_a.a();
            ((fe) this).field_o.a();
            var5 = 0;
            var6 = 0;
            var7 = 0;
            if (((fe) this).field_b == null) {
              break L0;
            } else {
              ((fe) this).field_b.a();
              ((fe) this).field_e.a();
              var5 = (int)((double)(((fe) this).field_b.field_i - ((fe) this).field_b.field_h) * 32.768 / var3);
              var6 = (int)((double)((fe) this).field_b.field_h * 32.768 / var3);
              break L0;
            }
          }
          L1: {
            var8 = 0;
            var9 = 0;
            var10 = 0;
            if (((fe) this).field_x == null) {
              break L1;
            } else {
              ((fe) this).field_x.a();
              ((fe) this).field_h.a();
              var8 = (int)((double)(((fe) this).field_x.field_i - ((fe) this).field_x.field_h) * 32.768 / var3);
              var9 = (int)((double)((fe) this).field_x.field_h * 32.768 / var3);
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
                    if (((fe) this).field_u == null) {
                      break L4;
                    } else {
                      ((fe) this).field_u.a();
                      ((fe) this).field_f.a();
                      var11 = 0;
                      var12 = 0;
                      var13 = 1;
                      var14 = 0;
                      L5: while (true) {
                        if (var14 >= param0) {
                          break L4;
                        } else {
                          L6: {
                            var15 = ((fe) this).field_u.a(param0);
                            var16 = ((fe) this).field_f.a(param0);
                            if (var13 == 0) {
                              var12 = ((fe) this).field_u.field_h + ((((fe) this).field_u.field_i - ((fe) this).field_u.field_h) * var16 >> 8);
                              break L6;
                            } else {
                              var12 = ((fe) this).field_u.field_h + ((((fe) this).field_u.field_i - ((fe) this).field_u.field_h) * var15 >> 8);
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
                            field_t[var14] = 0;
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
                    if (((fe) this).field_j <= 0) {
                      break L9;
                    } else {
                      if (((fe) this).field_s <= 0) {
                        break L9;
                      } else {
                        var11 = (int)((double)((fe) this).field_j * var3);
                        var12 = var11;
                        L10: while (true) {
                          if (var12 >= param0) {
                            break L9;
                          } else {
                            field_t[var12] = field_t[var12] + field_t[var12 - var11] * ((fe) this).field_s / 100;
                            var12++;
                            continue L10;
                          }
                        }
                      }
                    }
                  }
                  L11: {
                    L12: {
                      if (((fe) this).field_k.field_e[0] > 0) {
                        break L12;
                      } else {
                        if (((fe) this).field_k.field_e[1] <= 0) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    ((fe) this).field_i.a();
                    var11 = ((fe) this).field_i.a(param0 + 1);
                    var12 = ((fe) this).field_k.a(0, (float)var11 / 65536.0f);
                    var13 = ((fe) this).field_k.a(1, (float)var11 / 65536.0f);
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
                                  var12 = ((fe) this).field_k.a(0, (float)var11 / 65536.0f);
                                  var13 = ((fe) this).field_k.a(1, (float)var11 / 65536.0f);
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
                                              field_t[var14] = var16;
                                              var11 = ((fe) this).field_i.a(param0 + 1);
                                              var14++;
                                              continue L18;
                                            } else {
                                              var16 = var16 - (int)((long)field_t[var14 - 1 - var17] * (long)tj.field_f[1][var17] >> 16);
                                              var17++;
                                              continue L20;
                                            }
                                          }
                                        } else {
                                          var16 = var16 + (int)((long)field_t[var14 + var12 - 1 - var17] * (long)tj.field_f[0][var17] >> 16);
                                          var17++;
                                          continue L19;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                var16 = (int)((long)field_t[var14 + var12] * (long)tj.field_a >> 16);
                                var17 = 0;
                                L21: while (true) {
                                  if (var17 >= var12) {
                                    var17 = 0;
                                    L22: while (true) {
                                      if (var17 >= var13) {
                                        field_t[var14] = var16;
                                        var11 = ((fe) this).field_i.a(param0 + 1);
                                        var14++;
                                        continue L17;
                                      } else {
                                        var16 = var16 - (int)((long)field_t[var14 - 1 - var17] * (long)tj.field_f[1][var17] >> 16);
                                        var17++;
                                        continue L22;
                                      }
                                    }
                                  } else {
                                    var16 = var16 + (int)((long)field_t[var14 + var12 - 1 - var17] * (long)tj.field_f[0][var17] >> 16);
                                    var17++;
                                    continue L21;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var16 = (int)((long)field_t[var14 + var12] * (long)tj.field_a >> 16);
                          var17 = 0;
                          L23: while (true) {
                            if (var17 >= var12) {
                              var17 = 0;
                              L24: while (true) {
                                if (var17 >= var14) {
                                  field_t[var14] = var16;
                                  var11 = ((fe) this).field_i.a(param0 + 1);
                                  var14++;
                                  continue L14;
                                } else {
                                  var16 = var16 - (int)((long)field_t[var14 - 1 - var17] * (long)tj.field_f[1][var17] >> 16);
                                  var17++;
                                  continue L24;
                                }
                              }
                            } else {
                              var16 = var16 + (int)((long)field_t[var14 + var12 - 1 - var17] * (long)tj.field_f[0][var17] >> 16);
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
                      return field_t;
                    } else {
                      L26: {
                        if (field_t[var11] >= -32768) {
                          break L26;
                        } else {
                          field_t[var11] = -32768;
                          break L26;
                        }
                      }
                      if (field_t[var11] > 32767) {
                        field_t[var11] = 32767;
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
                    var12 = ((fe) this).field_a.a(param0);
                    var13 = ((fe) this).field_o.a(param0);
                    if (((fe) this).field_b == null) {
                      break L27;
                    } else {
                      var14 = ((fe) this).field_b.a(param0);
                      var15 = ((fe) this).field_e.a(param0);
                      var12 = var12 + (this.a(var7, var15, ((fe) this).field_b.field_g) >> 1);
                      var7 = var7 + ((var14 * var5 >> 16) + var6);
                      break L27;
                    }
                  }
                  L28: {
                    if (((fe) this).field_x == null) {
                      break L28;
                    } else {
                      var14 = ((fe) this).field_x.a(param0);
                      var15 = ((fe) this).field_h.a(param0);
                      var13 = var13 * ((this.a(var10, var15, ((fe) this).field_x.field_g) >> 1) + 32768) >> 15;
                      var10 = var10 + ((var14 * var8 >> 16) + var9);
                      break L28;
                    }
                  }
                  var14 = 0;
                  L29: while (true) {
                    if (var14 < 5) {
                      if (((fe) this).field_w[var14] != 0) {
                        var15 = var11 + field_q[var14];
                        if (var15 < param0) {
                          field_t[var15] = field_t[var15] + this.a(field_p[var14], var13 * field_v[var14] >> 15, ((fe) this).field_a.field_g);
                          field_p[var14] = field_p[var14] + ((var12 * field_c[var14] >> 16) + field_g[var14]);
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
              if (((fe) this).field_w[var11] != 0) {
                field_p[var11] = 0;
                field_q[var11] = (int)((double)((fe) this).field_r[var11] * var3);
                field_v[var11] = (((fe) this).field_w[var11] << 14) / 100;
                field_c[var11] = (int)((double)(((fe) this).field_a.field_i - ((fe) this).field_a.field_h) * 32.768 * Math.pow(1.0057929410678534, (double)((fe) this).field_l[var11]) / var3);
                field_g[var11] = (int)((double)((fe) this).field_a.field_h * 32.768 / var3);
                var11++;
                continue L2;
              } else {
                var11++;
                continue L2;
              }
            }
          }
        } else {
          return field_t;
        }
    }

    final void a(gb param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          ((fe) this).field_a = new vi();
          ((fe) this).field_a.b(param0);
          ((fe) this).field_o = new vi();
          ((fe) this).field_o.b(param0);
          var2 = param0.j(255);
          if (var2 == 0) {
            break L0;
          } else {
            param0.field_m = param0.field_m - 1;
            ((fe) this).field_b = new vi();
            ((fe) this).field_b.b(param0);
            ((fe) this).field_e = new vi();
            ((fe) this).field_e.b(param0);
            break L0;
          }
        }
        L1: {
          var2 = param0.j(255);
          if (var2 == 0) {
            break L1;
          } else {
            param0.field_m = param0.field_m - 1;
            ((fe) this).field_x = new vi();
            ((fe) this).field_x.b(param0);
            ((fe) this).field_h = new vi();
            ((fe) this).field_h.b(param0);
            break L1;
          }
        }
        L2: {
          var2 = param0.j(255);
          if (var2 == 0) {
            break L2;
          } else {
            param0.field_m = param0.field_m - 1;
            ((fe) this).field_u = new vi();
            ((fe) this).field_u.b(param0);
            ((fe) this).field_f = new vi();
            ((fe) this).field_f.b(param0);
            break L2;
          }
        }
        var3 = 0;
        L3: while (true) {
          L4: {
            if (var3 >= 10) {
              break L4;
            } else {
              var4 = param0.c(false);
              if (var4 != 0) {
                ((fe) this).field_w[var3] = var4;
                ((fe) this).field_l[var3] = param0.d(-95);
                ((fe) this).field_r[var3] = param0.c(false);
                var3++;
                continue L3;
              } else {
                break L4;
              }
            }
          }
          ((fe) this).field_j = param0.c(false);
          ((fe) this).field_s = param0.c(false);
          ((fe) this).field_n = param0.i(127);
          ((fe) this).field_m = param0.i(-105);
          ((fe) this).field_k = new tj();
          ((fe) this).field_i = new vi();
          ((fe) this).field_k.a(param0, ((fe) this).field_i);
          return;
        }
    }

    public static void a() {
        field_t = null;
        field_d = null;
        field_y = null;
        field_p = null;
        field_q = null;
        field_v = null;
        field_c = null;
        field_g = null;
    }

    fe() {
        ((fe) this).field_r = new int[]{0, 0, 0, 0, 0};
        ((fe) this).field_s = 100;
        ((fe) this).field_j = 0;
        ((fe) this).field_n = 500;
        ((fe) this).field_w = new int[]{0, 0, 0, 0, 0};
        ((fe) this).field_m = 0;
        ((fe) this).field_l = new int[]{0, 0, 0, 0, 0};
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var1 = 0;
        field_d = new int[32768];
        Random var0 = new Random(0L);
        for (var1 = 0; var1 < 32768; var1++) {
            field_d[var1] = (var0.nextInt() & 2) - 1;
        }
        field_y = new int[32768];
        for (var1 = 0; var1 < 32768; var1++) {
            field_y[var1] = (int)(Math.sin((double)var1 / 5215.1903) * 16384.0);
        }
        field_t = new int[220500];
        field_g = new int[5];
        field_p = new int[5];
        field_c = new int[5];
        field_q = new int[5];
        field_v = new int[5];
    }
}
