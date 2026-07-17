/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pk {
    int field_s;
    private fh field_k;
    private pn field_o;
    int field_a;
    private static int[] field_u;
    private int[] field_y;
    private int[] field_x;
    private int field_f;
    private int[] field_h;
    private pn field_r;
    private pn field_g;
    private pn field_d;
    private static int[] field_j;
    private pn field_m;
    private int field_b;
    private pn field_n;
    private pn field_e;
    private static int[] field_v;
    private pn field_l;
    private static int[] field_p;
    private static int[] field_q;
    private static int[] field_t;
    private pn field_i;
    private static int[] field_c;
    private static int[] field_w;

    public static void a() {
        field_u = null;
        field_v = null;
        field_j = null;
        field_c = null;
        field_q = null;
        field_p = null;
        field_t = null;
        field_w = null;
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
        ps.a(field_u, 0, param0);
        if (param1 >= 10) {
          L0: {
            var3 = (double)param0 / ((double)param1 + 0.0);
            ((pk) this).field_m.a();
            ((pk) this).field_i.a();
            var5 = 0;
            var6 = 0;
            var7 = 0;
            if (((pk) this).field_l == null) {
              break L0;
            } else {
              ((pk) this).field_l.a();
              ((pk) this).field_d.a();
              var5 = (int)((double)(((pk) this).field_l.field_i - ((pk) this).field_l.field_d) * 32.768 / var3);
              var6 = (int)((double)((pk) this).field_l.field_d * 32.768 / var3);
              break L0;
            }
          }
          L1: {
            var8 = 0;
            var9 = 0;
            var10 = 0;
            if (((pk) this).field_g == null) {
              break L1;
            } else {
              ((pk) this).field_g.a();
              ((pk) this).field_o.a();
              var8 = (int)((double)(((pk) this).field_g.field_i - ((pk) this).field_g.field_d) * 32.768 / var3);
              var9 = (int)((double)((pk) this).field_g.field_d * 32.768 / var3);
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
                    if (((pk) this).field_e == null) {
                      break L4;
                    } else {
                      ((pk) this).field_e.a();
                      ((pk) this).field_r.a();
                      var11 = 0;
                      var12 = 0;
                      var13 = 1;
                      var14 = 0;
                      L5: while (true) {
                        if (var14 >= param0) {
                          break L4;
                        } else {
                          L6: {
                            var15 = ((pk) this).field_e.a(param0);
                            var16 = ((pk) this).field_r.a(param0);
                            if (var13 == 0) {
                              var12 = ((pk) this).field_e.field_d + ((((pk) this).field_e.field_i - ((pk) this).field_e.field_d) * var16 >> 8);
                              break L6;
                            } else {
                              var12 = ((pk) this).field_e.field_d + ((((pk) this).field_e.field_i - ((pk) this).field_e.field_d) * var15 >> 8);
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
                            field_u[var14] = 0;
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
                    if (((pk) this).field_f <= 0) {
                      break L9;
                    } else {
                      if (((pk) this).field_b <= 0) {
                        break L9;
                      } else {
                        var11 = (int)((double)((pk) this).field_f * var3);
                        var12 = var11;
                        L10: while (true) {
                          if (var12 >= param0) {
                            break L9;
                          } else {
                            field_u[var12] = field_u[var12] + field_u[var12 - var11] * ((pk) this).field_b / 100;
                            var12++;
                            continue L10;
                          }
                        }
                      }
                    }
                  }
                  L11: {
                    L12: {
                      if (((pk) this).field_k.field_d[0] > 0) {
                        break L12;
                      } else {
                        if (((pk) this).field_k.field_d[1] <= 0) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    ((pk) this).field_n.a();
                    var11 = ((pk) this).field_n.a(param0 + 1);
                    var12 = ((pk) this).field_k.a(0, (float)var11 / 65536.0f);
                    var13 = ((pk) this).field_k.a(1, (float)var11 / 65536.0f);
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
                                  var12 = ((pk) this).field_k.a(0, (float)var11 / 65536.0f);
                                  var13 = ((pk) this).field_k.a(1, (float)var11 / 65536.0f);
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
                                              field_u[var14] = var16;
                                              var11 = ((pk) this).field_n.a(param0 + 1);
                                              var14++;
                                              continue L18;
                                            } else {
                                              var16 = var16 - (int)((long)field_u[var14 - 1 - var17] * (long)fh.field_e[1][var17] >> 16);
                                              var17++;
                                              continue L20;
                                            }
                                          }
                                        } else {
                                          var16 = var16 + (int)((long)field_u[var14 + var12 - 1 - var17] * (long)fh.field_e[0][var17] >> 16);
                                          var17++;
                                          continue L19;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                var16 = (int)((long)field_u[var14 + var12] * (long)fh.field_g >> 16);
                                var17 = 0;
                                L21: while (true) {
                                  if (var17 >= var12) {
                                    var17 = 0;
                                    L22: while (true) {
                                      if (var17 >= var13) {
                                        field_u[var14] = var16;
                                        var11 = ((pk) this).field_n.a(param0 + 1);
                                        var14++;
                                        continue L17;
                                      } else {
                                        var16 = var16 - (int)((long)field_u[var14 - 1 - var17] * (long)fh.field_e[1][var17] >> 16);
                                        var17++;
                                        continue L22;
                                      }
                                    }
                                  } else {
                                    var16 = var16 + (int)((long)field_u[var14 + var12 - 1 - var17] * (long)fh.field_e[0][var17] >> 16);
                                    var17++;
                                    continue L21;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var16 = (int)((long)field_u[var14 + var12] * (long)fh.field_g >> 16);
                          var17 = 0;
                          L23: while (true) {
                            if (var17 >= var12) {
                              var17 = 0;
                              L24: while (true) {
                                if (var17 >= var14) {
                                  field_u[var14] = var16;
                                  var11 = ((pk) this).field_n.a(param0 + 1);
                                  var14++;
                                  continue L14;
                                } else {
                                  var16 = var16 - (int)((long)field_u[var14 - 1 - var17] * (long)fh.field_e[1][var17] >> 16);
                                  var17++;
                                  continue L24;
                                }
                              }
                            } else {
                              var16 = var16 + (int)((long)field_u[var14 + var12 - 1 - var17] * (long)fh.field_e[0][var17] >> 16);
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
                      return field_u;
                    } else {
                      L26: {
                        if (field_u[var11] >= -32768) {
                          break L26;
                        } else {
                          field_u[var11] = -32768;
                          break L26;
                        }
                      }
                      if (field_u[var11] > 32767) {
                        field_u[var11] = 32767;
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
                    var12 = ((pk) this).field_m.a(param0);
                    var13 = ((pk) this).field_i.a(param0);
                    if (((pk) this).field_l == null) {
                      break L27;
                    } else {
                      var14 = ((pk) this).field_l.a(param0);
                      var15 = ((pk) this).field_d.a(param0);
                      var12 = var12 + (this.a(var7, var15, ((pk) this).field_l.field_f) >> 1);
                      var7 = var7 + ((var14 * var5 >> 16) + var6);
                      break L27;
                    }
                  }
                  L28: {
                    if (((pk) this).field_g == null) {
                      break L28;
                    } else {
                      var14 = ((pk) this).field_g.a(param0);
                      var15 = ((pk) this).field_o.a(param0);
                      var13 = var13 * ((this.a(var10, var15, ((pk) this).field_g.field_f) >> 1) + 32768) >> 15;
                      var10 = var10 + ((var14 * var8 >> 16) + var9);
                      break L28;
                    }
                  }
                  var14 = 0;
                  L29: while (true) {
                    if (var14 < 5) {
                      if (((pk) this).field_y[var14] != 0) {
                        var15 = var11 + field_q[var14];
                        if (var15 < param0) {
                          field_u[var15] = field_u[var15] + this.a(field_c[var14], var13 * field_p[var14] >> 15, ((pk) this).field_m.field_f);
                          field_c[var14] = field_c[var14] + ((var12 * field_t[var14] >> 16) + field_w[var14]);
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
              if (((pk) this).field_y[var11] != 0) {
                field_c[var11] = 0;
                field_q[var11] = (int)((double)((pk) this).field_h[var11] * var3);
                field_p[var11] = (((pk) this).field_y[var11] << 14) / 100;
                field_t[var11] = (int)((double)(((pk) this).field_m.field_i - ((pk) this).field_m.field_d) * 32.768 * Math.pow(1.0057929410678534, (double)((pk) this).field_x[var11]) / var3);
                field_w[var11] = (int)((double)((pk) this).field_m.field_d * 32.768 / var3);
                var11++;
                continue L2;
              } else {
                var11++;
                continue L2;
              }
            }
          }
        } else {
          return field_u;
        }
    }

    final void a(ob param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          ((pk) this).field_m = new pn();
          ((pk) this).field_m.b(param0);
          ((pk) this).field_i = new pn();
          ((pk) this).field_i.b(param0);
          var2 = param0.j(-127);
          if (var2 == 0) {
            break L0;
          } else {
            param0.field_j = param0.field_j - 1;
            ((pk) this).field_l = new pn();
            ((pk) this).field_l.b(param0);
            ((pk) this).field_d = new pn();
            ((pk) this).field_d.b(param0);
            break L0;
          }
        }
        L1: {
          var2 = param0.j(-79);
          if (var2 == 0) {
            break L1;
          } else {
            param0.field_j = param0.field_j - 1;
            ((pk) this).field_g = new pn();
            ((pk) this).field_g.b(param0);
            ((pk) this).field_o = new pn();
            ((pk) this).field_o.b(param0);
            break L1;
          }
        }
        L2: {
          var2 = param0.j(-60);
          if (var2 == 0) {
            break L2;
          } else {
            param0.field_j = param0.field_j - 1;
            ((pk) this).field_e = new pn();
            ((pk) this).field_e.b(param0);
            ((pk) this).field_r = new pn();
            ((pk) this).field_r.b(param0);
            break L2;
          }
        }
        var3 = 0;
        L3: while (true) {
          L4: {
            if (var3 >= 10) {
              break L4;
            } else {
              var4 = param0.h(-1282738780);
              if (var4 != 0) {
                ((pk) this).field_y[var3] = var4;
                ((pk) this).field_x[var3] = param0.d((byte) 65);
                ((pk) this).field_h[var3] = param0.h(-1282738780);
                var3++;
                continue L3;
              } else {
                break L4;
              }
            }
          }
          ((pk) this).field_f = param0.h(-1282738780);
          ((pk) this).field_b = param0.h(-1282738780);
          ((pk) this).field_a = param0.f(-20976);
          ((pk) this).field_s = param0.f(-20976);
          ((pk) this).field_k = new fh();
          ((pk) this).field_n = new pn();
          ((pk) this).field_k.a(param0, ((pk) this).field_n);
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
            return field_j[param0 & 32767] * param1 >> 14;
        }
        if (param2 == 3) {
            return ((param0 & 32767) * param1 >> 14) - param1;
        }
        if (param2 == 4) {
            return field_v[param0 / 2607 & 32767] * param1;
        }
        return 0;
    }

    pk() {
        ((pk) this).field_s = 0;
        ((pk) this).field_y = new int[]{0, 0, 0, 0, 0};
        ((pk) this).field_h = new int[]{0, 0, 0, 0, 0};
        ((pk) this).field_f = 0;
        ((pk) this).field_b = 100;
        ((pk) this).field_x = new int[]{0, 0, 0, 0, 0};
        ((pk) this).field_a = 500;
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
        field_j = new int[32768];
        for (var1 = 0; var1 < 32768; var1++) {
            field_j[var1] = (int)(Math.sin((double)var1 / 5215.1903) * 16384.0);
        }
        field_u = new int[220500];
        field_q = new int[5];
        field_t = new int[5];
        field_p = new int[5];
        field_w = new int[5];
        field_c = new int[5];
    }
}
