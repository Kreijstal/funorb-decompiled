/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class cc {
    private static int[] field_w;
    private i field_d;
    private static int[] field_e;
    private i field_m;
    private int field_s;
    int field_h;
    private i field_v;
    private int field_t;
    private int[] field_l;
    private i field_r;
    private am field_n;
    private i field_p;
    int field_g;
    private i field_a;
    private i field_i;
    private int[] field_c;
    private i field_o;
    private static int[] field_q;
    private static int[] field_b;
    private static int[] field_f;
    private static int[] field_u;
    private static int[] field_x;
    private i field_j;
    private static int[] field_k;
    private int[] field_y;

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
        dm.a(field_q, 0, param0);
        if (param1 >= 10) {
          L0: {
            var3 = (double)param0 / ((double)param1 + 0.0);
            ((cc) this).field_a.a();
            ((cc) this).field_i.a();
            var5 = 0;
            var6 = 0;
            var7 = 0;
            if (((cc) this).field_d == null) {
              break L0;
            } else {
              ((cc) this).field_d.a();
              ((cc) this).field_j.a();
              var5 = (int)((double)(((cc) this).field_d.field_b - ((cc) this).field_d.field_i) * 32.768 / var3);
              var6 = (int)((double)((cc) this).field_d.field_i * 32.768 / var3);
              break L0;
            }
          }
          L1: {
            var8 = 0;
            var9 = 0;
            var10 = 0;
            if (((cc) this).field_m == null) {
              break L1;
            } else {
              ((cc) this).field_m.a();
              ((cc) this).field_v.a();
              var8 = (int)((double)(((cc) this).field_m.field_b - ((cc) this).field_m.field_i) * 32.768 / var3);
              var9 = (int)((double)((cc) this).field_m.field_i * 32.768 / var3);
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
                    if (((cc) this).field_o == null) {
                      break L4;
                    } else {
                      ((cc) this).field_o.a();
                      ((cc) this).field_p.a();
                      var11 = 0;
                      var12 = 0;
                      var13 = 1;
                      var14 = 0;
                      L5: while (true) {
                        if (var14 >= param0) {
                          break L4;
                        } else {
                          L6: {
                            var15 = ((cc) this).field_o.a(param0);
                            var16 = ((cc) this).field_p.a(param0);
                            if (var13 == 0) {
                              var12 = ((cc) this).field_o.field_i + ((((cc) this).field_o.field_b - ((cc) this).field_o.field_i) * var16 >> 8);
                              break L6;
                            } else {
                              var12 = ((cc) this).field_o.field_i + ((((cc) this).field_o.field_b - ((cc) this).field_o.field_i) * var15 >> 8);
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
                            field_q[var14] = 0;
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
                    if (((cc) this).field_s <= 0) {
                      break L9;
                    } else {
                      if (((cc) this).field_t <= 0) {
                        break L9;
                      } else {
                        var11 = (int)((double)((cc) this).field_s * var3);
                        var12 = var11;
                        L10: while (true) {
                          if (var12 >= param0) {
                            break L9;
                          } else {
                            field_q[var12] = field_q[var12] + field_q[var12 - var11] * ((cc) this).field_t / 100;
                            var12++;
                            continue L10;
                          }
                        }
                      }
                    }
                  }
                  L11: {
                    L12: {
                      if (((cc) this).field_n.field_h[0] > 0) {
                        break L12;
                      } else {
                        if (((cc) this).field_n.field_h[1] <= 0) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    ((cc) this).field_r.a();
                    var11 = ((cc) this).field_r.a(param0 + 1);
                    var12 = ((cc) this).field_n.a(0, (float)var11 / 65536.0f);
                    var13 = ((cc) this).field_n.a(1, (float)var11 / 65536.0f);
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
                                  var12 = ((cc) this).field_n.a(0, (float)var11 / 65536.0f);
                                  var13 = ((cc) this).field_n.a(1, (float)var11 / 65536.0f);
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
                                              field_q[var14] = var16;
                                              var11 = ((cc) this).field_r.a(param0 + 1);
                                              var14++;
                                              continue L18;
                                            } else {
                                              var16 = var16 - (int)((long)field_q[var14 - 1 - var17] * (long)am.field_e[1][var17] >> 16);
                                              var17++;
                                              continue L20;
                                            }
                                          }
                                        } else {
                                          var16 = var16 + (int)((long)field_q[var14 + var12 - 1 - var17] * (long)am.field_e[0][var17] >> 16);
                                          var17++;
                                          continue L19;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                var16 = (int)((long)field_q[var14 + var12] * (long)am.field_a >> 16);
                                var17 = 0;
                                L21: while (true) {
                                  if (var17 >= var12) {
                                    var17 = 0;
                                    L22: while (true) {
                                      if (var17 >= var13) {
                                        field_q[var14] = var16;
                                        var11 = ((cc) this).field_r.a(param0 + 1);
                                        var14++;
                                        continue L17;
                                      } else {
                                        var16 = var16 - (int)((long)field_q[var14 - 1 - var17] * (long)am.field_e[1][var17] >> 16);
                                        var17++;
                                        continue L22;
                                      }
                                    }
                                  } else {
                                    var16 = var16 + (int)((long)field_q[var14 + var12 - 1 - var17] * (long)am.field_e[0][var17] >> 16);
                                    var17++;
                                    continue L21;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var16 = (int)((long)field_q[var14 + var12] * (long)am.field_a >> 16);
                          var17 = 0;
                          L23: while (true) {
                            if (var17 >= var12) {
                              var17 = 0;
                              L24: while (true) {
                                if (var17 >= var14) {
                                  field_q[var14] = var16;
                                  var11 = ((cc) this).field_r.a(param0 + 1);
                                  var14++;
                                  continue L14;
                                } else {
                                  var16 = var16 - (int)((long)field_q[var14 - 1 - var17] * (long)am.field_e[1][var17] >> 16);
                                  var17++;
                                  continue L24;
                                }
                              }
                            } else {
                              var16 = var16 + (int)((long)field_q[var14 + var12 - 1 - var17] * (long)am.field_e[0][var17] >> 16);
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
                      return field_q;
                    } else {
                      L26: {
                        if (field_q[var11] >= -32768) {
                          break L26;
                        } else {
                          field_q[var11] = -32768;
                          break L26;
                        }
                      }
                      if (field_q[var11] > 32767) {
                        field_q[var11] = 32767;
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
                    var12 = ((cc) this).field_a.a(param0);
                    var13 = ((cc) this).field_i.a(param0);
                    if (((cc) this).field_d == null) {
                      break L27;
                    } else {
                      var14 = ((cc) this).field_d.a(param0);
                      var15 = ((cc) this).field_j.a(param0);
                      var12 = var12 + (this.a(var7, var15, ((cc) this).field_d.field_d) >> 1);
                      var7 = var7 + ((var14 * var5 >> 16) + var6);
                      break L27;
                    }
                  }
                  L28: {
                    if (((cc) this).field_m == null) {
                      break L28;
                    } else {
                      var14 = ((cc) this).field_m.a(param0);
                      var15 = ((cc) this).field_v.a(param0);
                      var13 = var13 * ((this.a(var10, var15, ((cc) this).field_m.field_d) >> 1) + 32768) >> 15;
                      var10 = var10 + ((var14 * var8 >> 16) + var9);
                      break L28;
                    }
                  }
                  var14 = 0;
                  L29: while (true) {
                    if (var14 < 5) {
                      if (((cc) this).field_y[var14] != 0) {
                        var15 = var11 + field_x[var14];
                        if (var15 < param0) {
                          field_q[var15] = field_q[var15] + this.a(field_u[var14], var13 * field_b[var14] >> 15, ((cc) this).field_a.field_d);
                          field_u[var14] = field_u[var14] + ((var12 * field_k[var14] >> 16) + field_f[var14]);
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
              if (((cc) this).field_y[var11] != 0) {
                field_u[var11] = 0;
                field_x[var11] = (int)((double)((cc) this).field_l[var11] * var3);
                field_b[var11] = (((cc) this).field_y[var11] << 14) / 100;
                field_k[var11] = (int)((double)(((cc) this).field_a.field_b - ((cc) this).field_a.field_i) * 32.768 * Math.pow(1.0057929410678534, (double)((cc) this).field_c[var11]) / var3);
                field_f[var11] = (int)((double)((cc) this).field_a.field_i * 32.768 / var3);
                var11++;
                continue L2;
              } else {
                var11++;
                continue L2;
              }
            }
          }
        } else {
          return field_q;
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
            return field_w[param0 & 32767] * param1 >> 14;
        }
        if (param2 == 3) {
            return ((param0 & 32767) * param1 >> 14) - param1;
        }
        if (param2 == 4) {
            return field_e[param0 / 2607 & 32767] * param1;
        }
        return 0;
    }

    public static void a() {
        field_q = null;
        field_e = null;
        field_w = null;
        field_u = null;
        field_x = null;
        field_b = null;
        field_k = null;
        field_f = null;
    }

    final void a(ni param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          ((cc) this).field_a = new i();
          ((cc) this).field_a.b(param0);
          ((cc) this).field_i = new i();
          ((cc) this).field_i.b(param0);
          var2 = param0.e(false);
          if (var2 == 0) {
            break L0;
          } else {
            param0.field_i = param0.field_i - 1;
            ((cc) this).field_d = new i();
            ((cc) this).field_d.b(param0);
            ((cc) this).field_j = new i();
            ((cc) this).field_j.b(param0);
            break L0;
          }
        }
        L1: {
          var2 = param0.e(false);
          if (var2 == 0) {
            break L1;
          } else {
            param0.field_i = param0.field_i - 1;
            ((cc) this).field_m = new i();
            ((cc) this).field_m.b(param0);
            ((cc) this).field_v = new i();
            ((cc) this).field_v.b(param0);
            break L1;
          }
        }
        L2: {
          var2 = param0.e(false);
          if (var2 == 0) {
            break L2;
          } else {
            param0.field_i = param0.field_i - 1;
            ((cc) this).field_o = new i();
            ((cc) this).field_o.b(param0);
            ((cc) this).field_p = new i();
            ((cc) this).field_p.b(param0);
            break L2;
          }
        }
        var3 = 0;
        L3: while (true) {
          L4: {
            if (var3 >= 10) {
              break L4;
            } else {
              var4 = param0.d(-13583);
              if (var4 != 0) {
                ((cc) this).field_y[var3] = var4;
                ((cc) this).field_c[var3] = param0.a(255);
                ((cc) this).field_l[var3] = param0.d(-13583);
                var3++;
                continue L3;
              } else {
                break L4;
              }
            }
          }
          ((cc) this).field_s = param0.d(-13583);
          ((cc) this).field_t = param0.d(-13583);
          ((cc) this).field_g = param0.d((byte) 95);
          ((cc) this).field_h = param0.d((byte) 58);
          ((cc) this).field_n = new am();
          ((cc) this).field_r = new i();
          ((cc) this).field_n.a(param0, ((cc) this).field_r);
          return;
        }
    }

    cc() {
        ((cc) this).field_t = 100;
        ((cc) this).field_l = new int[]{0, 0, 0, 0, 0};
        ((cc) this).field_g = 500;
        ((cc) this).field_h = 0;
        ((cc) this).field_s = 0;
        ((cc) this).field_c = new int[]{0, 0, 0, 0, 0};
        ((cc) this).field_y = new int[]{0, 0, 0, 0, 0};
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var1 = 0;
        field_e = new int[32768];
        Random var0 = new Random(0L);
        for (var1 = 0; var1 < 32768; var1++) {
            field_e[var1] = (var0.nextInt() & 2) - 1;
        }
        field_w = new int[32768];
        for (var1 = 0; var1 < 32768; var1++) {
            field_w[var1] = (int)(Math.sin((double)var1 / 5215.1903) * 16384.0);
        }
        field_q = new int[220500];
        field_f = new int[5];
        field_x = new int[5];
        field_u = new int[5];
        field_b = new int[5];
        field_k = new int[5];
    }
}
