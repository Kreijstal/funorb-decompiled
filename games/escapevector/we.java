/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class we {
    private wj field_k;
    private wj field_p;
    int field_s;
    private wj field_u;
    private wj field_q;
    private static int[] field_y;
    private static int[] field_m;
    private cl field_n;
    private wj field_d;
    private wj field_e;
    private wj field_r;
    private static int[] field_h;
    private int[] field_v;
    private wj field_a;
    private static int[] field_g;
    private static int[] field_o;
    int field_l;
    private static int[] field_c;
    private int field_w;
    private static int[] field_f;
    private static int[] field_j;
    private wj field_x;
    private int field_b;
    private int[] field_i;
    private int[] field_t;

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
            return field_h[param0 / 2607 & 32767] * param1;
        }
        return 0;
    }

    final void a(n param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          ((we) this).field_u = new wj();
          ((we) this).field_u.a(param0);
          ((we) this).field_x = new wj();
          ((we) this).field_x.a(param0);
          var2 = param0.e(0);
          if (var2 == 0) {
            break L0;
          } else {
            param0.field_m = param0.field_m - 1;
            ((we) this).field_a = new wj();
            ((we) this).field_a.a(param0);
            ((we) this).field_d = new wj();
            ((we) this).field_d.a(param0);
            break L0;
          }
        }
        L1: {
          var2 = param0.e(0);
          if (var2 == 0) {
            break L1;
          } else {
            param0.field_m = param0.field_m - 1;
            ((we) this).field_p = new wj();
            ((we) this).field_p.a(param0);
            ((we) this).field_k = new wj();
            ((we) this).field_k.a(param0);
            break L1;
          }
        }
        L2: {
          var2 = param0.e(0);
          if (var2 == 0) {
            break L2;
          } else {
            param0.field_m = param0.field_m - 1;
            ((we) this).field_e = new wj();
            ((we) this).field_e.a(param0);
            ((we) this).field_r = new wj();
            ((we) this).field_r.a(param0);
            break L2;
          }
        }
        var3 = 0;
        L3: while (true) {
          L4: {
            if (var3 >= 10) {
              break L4;
            } else {
              var4 = param0.b(true);
              if (var4 != 0) {
                ((we) this).field_t[var3] = var4;
                ((we) this).field_v[var3] = param0.e((byte) 56);
                ((we) this).field_i[var3] = param0.b(true);
                var3++;
                continue L3;
              } else {
                break L4;
              }
            }
          }
          ((we) this).field_b = param0.b(true);
          ((we) this).field_w = param0.b(true);
          ((we) this).field_l = param0.f(1952);
          ((we) this).field_s = param0.f(1952);
          ((we) this).field_n = new cl();
          ((we) this).field_q = new wj();
          ((we) this).field_n.a(param0, ((we) this).field_q);
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
        qg.a(field_y, 0, param0);
        if (param1 >= 10) {
          L0: {
            var3 = (double)param0 / ((double)param1 + 0.0);
            ((we) this).field_u.a();
            ((we) this).field_x.a();
            var5 = 0;
            var6 = 0;
            var7 = 0;
            if (((we) this).field_a == null) {
              break L0;
            } else {
              ((we) this).field_a.a();
              ((we) this).field_d.a();
              var5 = (int)((double)(((we) this).field_a.field_b - ((we) this).field_a.field_j) * 32.768 / var3);
              var6 = (int)((double)((we) this).field_a.field_j * 32.768 / var3);
              break L0;
            }
          }
          L1: {
            var8 = 0;
            var9 = 0;
            var10 = 0;
            if (((we) this).field_p == null) {
              break L1;
            } else {
              ((we) this).field_p.a();
              ((we) this).field_k.a();
              var8 = (int)((double)(((we) this).field_p.field_b - ((we) this).field_p.field_j) * 32.768 / var3);
              var9 = (int)((double)((we) this).field_p.field_j * 32.768 / var3);
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
                    if (((we) this).field_e == null) {
                      break L4;
                    } else {
                      ((we) this).field_e.a();
                      ((we) this).field_r.a();
                      var11 = 0;
                      var12 = 0;
                      var13 = 1;
                      var14 = 0;
                      L5: while (true) {
                        if (var14 >= param0) {
                          break L4;
                        } else {
                          L6: {
                            var15 = ((we) this).field_e.a(param0);
                            var16 = ((we) this).field_r.a(param0);
                            if (var13 == 0) {
                              var12 = ((we) this).field_e.field_j + ((((we) this).field_e.field_b - ((we) this).field_e.field_j) * var16 >> 8);
                              break L6;
                            } else {
                              var12 = ((we) this).field_e.field_j + ((((we) this).field_e.field_b - ((we) this).field_e.field_j) * var15 >> 8);
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
                            field_y[var14] = 0;
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
                    if (((we) this).field_b <= 0) {
                      break L9;
                    } else {
                      if (((we) this).field_w <= 0) {
                        break L9;
                      } else {
                        var11 = (int)((double)((we) this).field_b * var3);
                        var12 = var11;
                        L10: while (true) {
                          if (var12 >= param0) {
                            break L9;
                          } else {
                            field_y[var12] = field_y[var12] + field_y[var12 - var11] * ((we) this).field_w / 100;
                            var12++;
                            continue L10;
                          }
                        }
                      }
                    }
                  }
                  L11: {
                    L12: {
                      if (((we) this).field_n.field_g[0] > 0) {
                        break L12;
                      } else {
                        if (((we) this).field_n.field_g[1] <= 0) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    ((we) this).field_q.a();
                    var11 = ((we) this).field_q.a(param0 + 1);
                    var12 = ((we) this).field_n.a(0, (float)var11 / 65536.0f);
                    var13 = ((we) this).field_n.a(1, (float)var11 / 65536.0f);
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
                                  var12 = ((we) this).field_n.a(0, (float)var11 / 65536.0f);
                                  var13 = ((we) this).field_n.a(1, (float)var11 / 65536.0f);
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
                                              field_y[var14] = var16;
                                              var11 = ((we) this).field_q.a(param0 + 1);
                                              var14++;
                                              continue L18;
                                            } else {
                                              var16 = var16 - (int)((long)field_y[var14 - 1 - var17] * (long)cl.field_b[1][var17] >> 16);
                                              var17++;
                                              continue L20;
                                            }
                                          }
                                        } else {
                                          var16 = var16 + (int)((long)field_y[var14 + var12 - 1 - var17] * (long)cl.field_b[0][var17] >> 16);
                                          var17++;
                                          continue L19;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                var16 = (int)((long)field_y[var14 + var12] * (long)cl.field_c >> 16);
                                var17 = 0;
                                L21: while (true) {
                                  if (var17 >= var12) {
                                    var17 = 0;
                                    L22: while (true) {
                                      if (var17 >= var13) {
                                        field_y[var14] = var16;
                                        var11 = ((we) this).field_q.a(param0 + 1);
                                        var14++;
                                        continue L17;
                                      } else {
                                        var16 = var16 - (int)((long)field_y[var14 - 1 - var17] * (long)cl.field_b[1][var17] >> 16);
                                        var17++;
                                        continue L22;
                                      }
                                    }
                                  } else {
                                    var16 = var16 + (int)((long)field_y[var14 + var12 - 1 - var17] * (long)cl.field_b[0][var17] >> 16);
                                    var17++;
                                    continue L21;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var16 = (int)((long)field_y[var14 + var12] * (long)cl.field_c >> 16);
                          var17 = 0;
                          L23: while (true) {
                            if (var17 >= var12) {
                              var17 = 0;
                              L24: while (true) {
                                if (var17 >= var14) {
                                  field_y[var14] = var16;
                                  var11 = ((we) this).field_q.a(param0 + 1);
                                  var14++;
                                  continue L14;
                                } else {
                                  var16 = var16 - (int)((long)field_y[var14 - 1 - var17] * (long)cl.field_b[1][var17] >> 16);
                                  var17++;
                                  continue L24;
                                }
                              }
                            } else {
                              var16 = var16 + (int)((long)field_y[var14 + var12 - 1 - var17] * (long)cl.field_b[0][var17] >> 16);
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
                      return field_y;
                    } else {
                      L26: {
                        if (field_y[var11] >= -32768) {
                          break L26;
                        } else {
                          field_y[var11] = -32768;
                          break L26;
                        }
                      }
                      if (field_y[var11] > 32767) {
                        field_y[var11] = 32767;
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
                    var12 = ((we) this).field_u.a(param0);
                    var13 = ((we) this).field_x.a(param0);
                    if (((we) this).field_a == null) {
                      break L27;
                    } else {
                      var14 = ((we) this).field_a.a(param0);
                      var15 = ((we) this).field_d.a(param0);
                      var12 = var12 + (this.a(var7, var15, ((we) this).field_a.field_e) >> 1);
                      var7 = var7 + ((var14 * var5 >> 16) + var6);
                      break L27;
                    }
                  }
                  L28: {
                    if (((we) this).field_p == null) {
                      break L28;
                    } else {
                      var14 = ((we) this).field_p.a(param0);
                      var15 = ((we) this).field_k.a(param0);
                      var13 = var13 * ((this.a(var10, var15, ((we) this).field_p.field_e) >> 1) + 32768) >> 15;
                      var10 = var10 + ((var14 * var8 >> 16) + var9);
                      break L28;
                    }
                  }
                  var14 = 0;
                  L29: while (true) {
                    if (var14 < 5) {
                      if (((we) this).field_t[var14] != 0) {
                        var15 = var11 + field_j[var14];
                        if (var15 < param0) {
                          field_y[var15] = field_y[var15] + this.a(field_c[var14], var13 * field_g[var14] >> 15, ((we) this).field_u.field_e);
                          field_c[var14] = field_c[var14] + ((var12 * field_o[var14] >> 16) + field_f[var14]);
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
              if (((we) this).field_t[var11] != 0) {
                field_c[var11] = 0;
                field_j[var11] = (int)((double)((we) this).field_i[var11] * var3);
                field_g[var11] = (((we) this).field_t[var11] << 14) / 100;
                field_o[var11] = (int)((double)(((we) this).field_u.field_b - ((we) this).field_u.field_j) * 32.768 * Math.pow(1.0057929410678534, (double)((we) this).field_v[var11]) / var3);
                field_f[var11] = (int)((double)((we) this).field_u.field_j * 32.768 / var3);
                var11++;
                continue L2;
              } else {
                var11++;
                continue L2;
              }
            }
          }
        } else {
          return field_y;
        }
    }

    public static void a() {
        field_y = null;
        field_h = null;
        field_m = null;
        field_c = null;
        field_j = null;
        field_g = null;
        field_o = null;
        field_f = null;
    }

    we() {
        ((we) this).field_s = 0;
        ((we) this).field_l = 500;
        ((we) this).field_v = new int[]{0, 0, 0, 0, 0};
        ((we) this).field_w = 100;
        ((we) this).field_b = 0;
        ((we) this).field_i = new int[]{0, 0, 0, 0, 0};
        ((we) this).field_t = new int[]{0, 0, 0, 0, 0};
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var1 = 0;
        field_h = new int[32768];
        Random var0 = new Random(0L);
        for (var1 = 0; var1 < 32768; var1++) {
            field_h[var1] = (var0.nextInt() & 2) - 1;
        }
        field_m = new int[32768];
        for (var1 = 0; var1 < 32768; var1++) {
            field_m[var1] = (int)(Math.sin((double)var1 / 5215.1903) * 16384.0);
        }
        field_y = new int[220500];
        field_g = new int[5];
        field_c = new int[5];
        field_j = new int[5];
        field_f = new int[5];
        field_o = new int[5];
    }
}
