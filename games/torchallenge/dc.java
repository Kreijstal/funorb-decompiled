/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class dc {
    private int field_k;
    private bm field_q;
    private bm field_b;
    private static int[] field_x;
    private bm field_v;
    private bm field_n;
    private bm field_m;
    private bm field_d;
    private int[] field_u;
    private int field_s;
    int field_h;
    private static int[] field_r;
    private int[] field_l;
    private ce field_c;
    private static int[] field_a;
    private bm field_o;
    private static int[] field_f;
    private bm field_e;
    private static int[] field_w;
    private static int[] field_y;
    private static int[] field_g;
    private static int[] field_p;
    private bm field_i;
    int field_t;
    private int[] field_j;

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
        he.a(field_r, 0, param0);
        if (param1 >= 10) {
          L0: {
            var3 = (double)param0 / ((double)param1 + 0.0);
            ((dc) this).field_m.a();
            ((dc) this).field_o.a();
            var5 = 0;
            var6 = 0;
            var7 = 0;
            if (((dc) this).field_b == null) {
              break L0;
            } else {
              ((dc) this).field_b.a();
              ((dc) this).field_v.a();
              var5 = (int)((double)(((dc) this).field_b.field_i - ((dc) this).field_b.field_e) * 32.768 / var3);
              var6 = (int)((double)((dc) this).field_b.field_e * 32.768 / var3);
              break L0;
            }
          }
          L1: {
            var8 = 0;
            var9 = 0;
            var10 = 0;
            if (((dc) this).field_i == null) {
              break L1;
            } else {
              ((dc) this).field_i.a();
              ((dc) this).field_q.a();
              var8 = (int)((double)(((dc) this).field_i.field_i - ((dc) this).field_i.field_e) * 32.768 / var3);
              var9 = (int)((double)((dc) this).field_i.field_e * 32.768 / var3);
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
                    if (((dc) this).field_e == null) {
                      break L4;
                    } else {
                      ((dc) this).field_e.a();
                      ((dc) this).field_d.a();
                      var11 = 0;
                      var12 = 0;
                      var13 = 1;
                      var14 = 0;
                      L5: while (true) {
                        if (var14 >= param0) {
                          break L4;
                        } else {
                          L6: {
                            var15 = ((dc) this).field_e.a(param0);
                            var16 = ((dc) this).field_d.a(param0);
                            if (var13 == 0) {
                              var12 = ((dc) this).field_e.field_e + ((((dc) this).field_e.field_i - ((dc) this).field_e.field_e) * var16 >> 8);
                              break L6;
                            } else {
                              var12 = ((dc) this).field_e.field_e + ((((dc) this).field_e.field_i - ((dc) this).field_e.field_e) * var15 >> 8);
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
                    if (((dc) this).field_s <= 0) {
                      break L9;
                    } else {
                      if (((dc) this).field_k <= 0) {
                        break L9;
                      } else {
                        var11 = (int)((double)((dc) this).field_s * var3);
                        var12 = var11;
                        L10: while (true) {
                          if (var12 >= param0) {
                            break L9;
                          } else {
                            field_r[var12] = field_r[var12] + field_r[var12 - var11] * ((dc) this).field_k / 100;
                            var12++;
                            continue L10;
                          }
                        }
                      }
                    }
                  }
                  L11: {
                    L12: {
                      if (((dc) this).field_c.field_c[0] > 0) {
                        break L12;
                      } else {
                        if (((dc) this).field_c.field_c[1] <= 0) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    ((dc) this).field_n.a();
                    var11 = ((dc) this).field_n.a(param0 + 1);
                    var12 = ((dc) this).field_c.a(0, (float)var11 / 65536.0f);
                    var13 = ((dc) this).field_c.a(1, (float)var11 / 65536.0f);
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
                                  var12 = ((dc) this).field_c.a(0, (float)var11 / 65536.0f);
                                  var13 = ((dc) this).field_c.a(1, (float)var11 / 65536.0f);
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
                                              var11 = ((dc) this).field_n.a(param0 + 1);
                                              var14++;
                                              continue L18;
                                            } else {
                                              var16 = var16 - (int)((long)field_r[var14 - 1 - var17] * (long)ce.field_b[1][var17] >> 16);
                                              var17++;
                                              continue L20;
                                            }
                                          }
                                        } else {
                                          var16 = var16 + (int)((long)field_r[var14 + var12 - 1 - var17] * (long)ce.field_b[0][var17] >> 16);
                                          var17++;
                                          continue L19;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                var16 = (int)((long)field_r[var14 + var12] * (long)ce.field_h >> 16);
                                var17 = 0;
                                L21: while (true) {
                                  if (var17 >= var12) {
                                    var17 = 0;
                                    L22: while (true) {
                                      if (var17 >= var13) {
                                        field_r[var14] = var16;
                                        var11 = ((dc) this).field_n.a(param0 + 1);
                                        var14++;
                                        continue L17;
                                      } else {
                                        var16 = var16 - (int)((long)field_r[var14 - 1 - var17] * (long)ce.field_b[1][var17] >> 16);
                                        var17++;
                                        continue L22;
                                      }
                                    }
                                  } else {
                                    var16 = var16 + (int)((long)field_r[var14 + var12 - 1 - var17] * (long)ce.field_b[0][var17] >> 16);
                                    var17++;
                                    continue L21;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var16 = (int)((long)field_r[var14 + var12] * (long)ce.field_h >> 16);
                          var17 = 0;
                          L23: while (true) {
                            if (var17 >= var12) {
                              var17 = 0;
                              L24: while (true) {
                                if (var17 >= var14) {
                                  field_r[var14] = var16;
                                  var11 = ((dc) this).field_n.a(param0 + 1);
                                  var14++;
                                  continue L14;
                                } else {
                                  var16 = var16 - (int)((long)field_r[var14 - 1 - var17] * (long)ce.field_b[1][var17] >> 16);
                                  var17++;
                                  continue L24;
                                }
                              }
                            } else {
                              var16 = var16 + (int)((long)field_r[var14 + var12 - 1 - var17] * (long)ce.field_b[0][var17] >> 16);
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
                    var12 = ((dc) this).field_m.a(param0);
                    var13 = ((dc) this).field_o.a(param0);
                    if (((dc) this).field_b == null) {
                      break L27;
                    } else {
                      var14 = ((dc) this).field_b.a(param0);
                      var15 = ((dc) this).field_v.a(param0);
                      var12 = var12 + (this.a(var7, var15, ((dc) this).field_b.field_h) >> 1);
                      var7 = var7 + ((var14 * var5 >> 16) + var6);
                      break L27;
                    }
                  }
                  L28: {
                    if (((dc) this).field_i == null) {
                      break L28;
                    } else {
                      var14 = ((dc) this).field_i.a(param0);
                      var15 = ((dc) this).field_q.a(param0);
                      var13 = var13 * ((this.a(var10, var15, ((dc) this).field_i.field_h) >> 1) + 32768) >> 15;
                      var10 = var10 + ((var14 * var8 >> 16) + var9);
                      break L28;
                    }
                  }
                  var14 = 0;
                  L29: while (true) {
                    if (var14 < 5) {
                      if (((dc) this).field_l[var14] != 0) {
                        var15 = var11 + field_g[var14];
                        if (var15 < param0) {
                          field_r[var15] = field_r[var15] + this.a(field_f[var14], var13 * field_y[var14] >> 15, ((dc) this).field_m.field_h);
                          field_f[var14] = field_f[var14] + ((var12 * field_p[var14] >> 16) + field_w[var14]);
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
              if (((dc) this).field_l[var11] != 0) {
                field_f[var11] = 0;
                field_g[var11] = (int)((double)((dc) this).field_u[var11] * var3);
                field_y[var11] = (((dc) this).field_l[var11] << 14) / 100;
                field_p[var11] = (int)((double)(((dc) this).field_m.field_i - ((dc) this).field_m.field_e) * 32.768 * Math.pow(1.0057929410678534, (double)((dc) this).field_j[var11]) / var3);
                field_w[var11] = (int)((double)((dc) this).field_m.field_e * 32.768 / var3);
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
            return field_x[param0 & 32767] * param1 >> 14;
        }
        if (param2 == 3) {
            return ((param0 & 32767) * param1 >> 14) - param1;
        }
        if (param2 == 4) {
            return field_a[param0 / 2607 & 32767] * param1;
        }
        return 0;
    }

    final void a(uf param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          ((dc) this).field_m = new bm();
          ((dc) this).field_m.a(param0);
          ((dc) this).field_o = new bm();
          ((dc) this).field_o.a(param0);
          var2 = param0.j(-88);
          if (var2 == 0) {
            break L0;
          } else {
            param0.field_q = param0.field_q - 1;
            ((dc) this).field_b = new bm();
            ((dc) this).field_b.a(param0);
            ((dc) this).field_v = new bm();
            ((dc) this).field_v.a(param0);
            break L0;
          }
        }
        L1: {
          var2 = param0.j(-115);
          if (var2 == 0) {
            break L1;
          } else {
            param0.field_q = param0.field_q - 1;
            ((dc) this).field_i = new bm();
            ((dc) this).field_i.a(param0);
            ((dc) this).field_q = new bm();
            ((dc) this).field_q.a(param0);
            break L1;
          }
        }
        L2: {
          var2 = param0.j(-121);
          if (var2 == 0) {
            break L2;
          } else {
            param0.field_q = param0.field_q - 1;
            ((dc) this).field_e = new bm();
            ((dc) this).field_e.a(param0);
            ((dc) this).field_d = new bm();
            ((dc) this).field_d.a(param0);
            break L2;
          }
        }
        var3 = 0;
        L3: while (true) {
          L4: {
            if (var3 >= 10) {
              break L4;
            } else {
              var4 = param0.b((byte) 24);
              if (var4 != 0) {
                ((dc) this).field_l[var3] = var4;
                ((dc) this).field_j[var3] = param0.e((byte) -95);
                ((dc) this).field_u[var3] = param0.b((byte) 24);
                var3++;
                continue L3;
              } else {
                break L4;
              }
            }
          }
          ((dc) this).field_s = param0.b((byte) 24);
          ((dc) this).field_k = param0.b((byte) 24);
          ((dc) this).field_h = param0.c(false);
          ((dc) this).field_t = param0.c(false);
          ((dc) this).field_c = new ce();
          ((dc) this).field_n = new bm();
          ((dc) this).field_c.a(param0, ((dc) this).field_n);
          return;
        }
    }

    public static void a() {
        field_r = null;
        field_a = null;
        field_x = null;
        field_f = null;
        field_g = null;
        field_y = null;
        field_p = null;
        field_w = null;
    }

    dc() {
        ((dc) this).field_k = 100;
        ((dc) this).field_h = 500;
        ((dc) this).field_s = 0;
        ((dc) this).field_t = 0;
        ((dc) this).field_u = new int[]{0, 0, 0, 0, 0};
        ((dc) this).field_l = new int[]{0, 0, 0, 0, 0};
        ((dc) this).field_j = new int[]{0, 0, 0, 0, 0};
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var1 = 0;
        field_a = new int[32768];
        Random var0 = new Random(0L);
        for (var1 = 0; var1 < 32768; var1++) {
            field_a[var1] = (var0.nextInt() & 2) - 1;
        }
        field_x = new int[32768];
        for (var1 = 0; var1 < 32768; var1++) {
            field_x[var1] = (int)(Math.sin((double)var1 / 5215.1903) * 16384.0);
        }
        field_r = new int[220500];
        field_f = new int[5];
        field_w = new int[5];
        field_y = new int[5];
        field_g = new int[5];
        field_p = new int[5];
    }
}
