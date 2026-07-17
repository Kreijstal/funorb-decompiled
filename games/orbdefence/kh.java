/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class kh {
    private int[] field_v;
    private ah field_q;
    private int field_b;
    private ah field_t;
    int field_p;
    private ah field_r;
    private ah field_o;
    private static int[] field_j;
    private static int[] field_g;
    int field_i;
    private ah field_c;
    private int[] field_a;
    private ah field_y;
    private lk field_n;
    private int field_s;
    private ah field_u;
    private ah field_f;
    private ah field_x;
    private int[] field_k;
    private static int[] field_e;
    private static int[] field_h;
    private static int[] field_m;
    private static int[] field_l;
    private static int[] field_d;
    private static int[] field_w;

    final void a(mg param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          ((kh) this).field_t = new ah();
          ((kh) this).field_t.a(param0);
          ((kh) this).field_c = new ah();
          ((kh) this).field_c.a(param0);
          var2 = param0.b((byte) 90);
          if (var2 == 0) {
            break L0;
          } else {
            param0.field_i = param0.field_i - 1;
            ((kh) this).field_y = new ah();
            ((kh) this).field_y.a(param0);
            ((kh) this).field_f = new ah();
            ((kh) this).field_f.a(param0);
            break L0;
          }
        }
        L1: {
          var2 = param0.b((byte) 90);
          if (var2 == 0) {
            break L1;
          } else {
            param0.field_i = param0.field_i - 1;
            ((kh) this).field_r = new ah();
            ((kh) this).field_r.a(param0);
            ((kh) this).field_o = new ah();
            ((kh) this).field_o.a(param0);
            break L1;
          }
        }
        L2: {
          var2 = param0.b((byte) 90);
          if (var2 == 0) {
            break L2;
          } else {
            param0.field_i = param0.field_i - 1;
            ((kh) this).field_q = new ah();
            ((kh) this).field_q.a(param0);
            ((kh) this).field_u = new ah();
            ((kh) this).field_u.a(param0);
            break L2;
          }
        }
        var3 = 0;
        L3: while (true) {
          L4: {
            if (var3 >= 10) {
              break L4;
            } else {
              var4 = param0.e(123);
              if (var4 != 0) {
                ((kh) this).field_v[var3] = var4;
                ((kh) this).field_a[var3] = param0.c(true);
                ((kh) this).field_k[var3] = param0.e(124);
                var3++;
                continue L3;
              } else {
                break L4;
              }
            }
          }
          ((kh) this).field_b = param0.e(120);
          ((kh) this).field_s = param0.e(119);
          ((kh) this).field_i = param0.j(98203176);
          ((kh) this).field_p = param0.j(98203176);
          ((kh) this).field_n = new lk();
          ((kh) this).field_x = new ah();
          ((kh) this).field_n.a(param0, ((kh) this).field_x);
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
            return field_g[param0 / 2607 & 32767] * param1;
        }
        return 0;
    }

    public static void a() {
        field_e = null;
        field_g = null;
        field_j = null;
        field_w = null;
        field_l = null;
        field_m = null;
        field_h = null;
        field_d = null;
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
        mk.a(field_e, 0, param0);
        if (param1 >= 10) {
          L0: {
            var3 = (double)param0 / ((double)param1 + 0.0);
            ((kh) this).field_t.a();
            ((kh) this).field_c.a();
            var5 = 0;
            var6 = 0;
            var7 = 0;
            if (((kh) this).field_y == null) {
              break L0;
            } else {
              ((kh) this).field_y.a();
              ((kh) this).field_f.a();
              var5 = (int)((double)(((kh) this).field_y.field_d - ((kh) this).field_y.field_b) * 32.768 / var3);
              var6 = (int)((double)((kh) this).field_y.field_b * 32.768 / var3);
              break L0;
            }
          }
          L1: {
            var8 = 0;
            var9 = 0;
            var10 = 0;
            if (((kh) this).field_r == null) {
              break L1;
            } else {
              ((kh) this).field_r.a();
              ((kh) this).field_o.a();
              var8 = (int)((double)(((kh) this).field_r.field_d - ((kh) this).field_r.field_b) * 32.768 / var3);
              var9 = (int)((double)((kh) this).field_r.field_b * 32.768 / var3);
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
                    if (((kh) this).field_q == null) {
                      break L4;
                    } else {
                      ((kh) this).field_q.a();
                      ((kh) this).field_u.a();
                      var11 = 0;
                      var12 = 0;
                      var13 = 1;
                      var14 = 0;
                      L5: while (true) {
                        if (var14 >= param0) {
                          break L4;
                        } else {
                          L6: {
                            var15 = ((kh) this).field_q.a(param0);
                            var16 = ((kh) this).field_u.a(param0);
                            if (var13 == 0) {
                              var12 = ((kh) this).field_q.field_b + ((((kh) this).field_q.field_d - ((kh) this).field_q.field_b) * var16 >> 8);
                              break L6;
                            } else {
                              var12 = ((kh) this).field_q.field_b + ((((kh) this).field_q.field_d - ((kh) this).field_q.field_b) * var15 >> 8);
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
                            field_e[var14] = 0;
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
                    if (((kh) this).field_b <= 0) {
                      break L9;
                    } else {
                      if (((kh) this).field_s <= 0) {
                        break L9;
                      } else {
                        var11 = (int)((double)((kh) this).field_b * var3);
                        var12 = var11;
                        L10: while (true) {
                          if (var12 >= param0) {
                            break L9;
                          } else {
                            field_e[var12] = field_e[var12] + field_e[var12 - var11] * ((kh) this).field_s / 100;
                            var12++;
                            continue L10;
                          }
                        }
                      }
                    }
                  }
                  L11: {
                    L12: {
                      if (((kh) this).field_n.field_d[0] > 0) {
                        break L12;
                      } else {
                        if (((kh) this).field_n.field_d[1] <= 0) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    ((kh) this).field_x.a();
                    var11 = ((kh) this).field_x.a(param0 + 1);
                    var12 = ((kh) this).field_n.a(0, (float)var11 / 65536.0f);
                    var13 = ((kh) this).field_n.a(1, (float)var11 / 65536.0f);
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
                                  var12 = ((kh) this).field_n.a(0, (float)var11 / 65536.0f);
                                  var13 = ((kh) this).field_n.a(1, (float)var11 / 65536.0f);
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
                                              field_e[var14] = var16;
                                              var11 = ((kh) this).field_x.a(param0 + 1);
                                              var14++;
                                              continue L18;
                                            } else {
                                              var16 = var16 - (int)((long)field_e[var14 - 1 - var17] * (long)lk.field_b[1][var17] >> 16);
                                              var17++;
                                              continue L20;
                                            }
                                          }
                                        } else {
                                          var16 = var16 + (int)((long)field_e[var14 + var12 - 1 - var17] * (long)lk.field_b[0][var17] >> 16);
                                          var17++;
                                          continue L19;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                var16 = (int)((long)field_e[var14 + var12] * (long)lk.field_c >> 16);
                                var17 = 0;
                                L21: while (true) {
                                  if (var17 >= var12) {
                                    var17 = 0;
                                    L22: while (true) {
                                      if (var17 >= var13) {
                                        field_e[var14] = var16;
                                        var11 = ((kh) this).field_x.a(param0 + 1);
                                        var14++;
                                        continue L17;
                                      } else {
                                        var16 = var16 - (int)((long)field_e[var14 - 1 - var17] * (long)lk.field_b[1][var17] >> 16);
                                        var17++;
                                        continue L22;
                                      }
                                    }
                                  } else {
                                    var16 = var16 + (int)((long)field_e[var14 + var12 - 1 - var17] * (long)lk.field_b[0][var17] >> 16);
                                    var17++;
                                    continue L21;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var16 = (int)((long)field_e[var14 + var12] * (long)lk.field_c >> 16);
                          var17 = 0;
                          L23: while (true) {
                            if (var17 >= var12) {
                              var17 = 0;
                              L24: while (true) {
                                if (var17 >= var14) {
                                  field_e[var14] = var16;
                                  var11 = ((kh) this).field_x.a(param0 + 1);
                                  var14++;
                                  continue L14;
                                } else {
                                  var16 = var16 - (int)((long)field_e[var14 - 1 - var17] * (long)lk.field_b[1][var17] >> 16);
                                  var17++;
                                  continue L24;
                                }
                              }
                            } else {
                              var16 = var16 + (int)((long)field_e[var14 + var12 - 1 - var17] * (long)lk.field_b[0][var17] >> 16);
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
                      return field_e;
                    } else {
                      L26: {
                        if (field_e[var11] >= -32768) {
                          break L26;
                        } else {
                          field_e[var11] = -32768;
                          break L26;
                        }
                      }
                      if (field_e[var11] > 32767) {
                        field_e[var11] = 32767;
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
                    var12 = ((kh) this).field_t.a(param0);
                    var13 = ((kh) this).field_c.a(param0);
                    if (((kh) this).field_y == null) {
                      break L27;
                    } else {
                      var14 = ((kh) this).field_y.a(param0);
                      var15 = ((kh) this).field_f.a(param0);
                      var12 = var12 + (this.a(var7, var15, ((kh) this).field_y.field_c) >> 1);
                      var7 = var7 + ((var14 * var5 >> 16) + var6);
                      break L27;
                    }
                  }
                  L28: {
                    if (((kh) this).field_r == null) {
                      break L28;
                    } else {
                      var14 = ((kh) this).field_r.a(param0);
                      var15 = ((kh) this).field_o.a(param0);
                      var13 = var13 * ((this.a(var10, var15, ((kh) this).field_r.field_c) >> 1) + 32768) >> 15;
                      var10 = var10 + ((var14 * var8 >> 16) + var9);
                      break L28;
                    }
                  }
                  var14 = 0;
                  L29: while (true) {
                    if (var14 < 5) {
                      if (((kh) this).field_v[var14] != 0) {
                        var15 = var11 + field_l[var14];
                        if (var15 < param0) {
                          field_e[var15] = field_e[var15] + this.a(field_w[var14], var13 * field_m[var14] >> 15, ((kh) this).field_t.field_c);
                          field_w[var14] = field_w[var14] + ((var12 * field_h[var14] >> 16) + field_d[var14]);
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
              if (((kh) this).field_v[var11] != 0) {
                field_w[var11] = 0;
                field_l[var11] = (int)((double)((kh) this).field_k[var11] * var3);
                field_m[var11] = (((kh) this).field_v[var11] << 14) / 100;
                field_h[var11] = (int)((double)(((kh) this).field_t.field_d - ((kh) this).field_t.field_b) * 32.768 * Math.pow(1.0057929410678534, (double)((kh) this).field_a[var11]) / var3);
                field_d[var11] = (int)((double)((kh) this).field_t.field_b * 32.768 / var3);
                var11++;
                continue L2;
              } else {
                var11++;
                continue L2;
              }
            }
          }
        } else {
          return field_e;
        }
    }

    kh() {
        ((kh) this).field_p = 0;
        ((kh) this).field_b = 0;
        ((kh) this).field_v = new int[]{0, 0, 0, 0, 0};
        ((kh) this).field_a = new int[]{0, 0, 0, 0, 0};
        ((kh) this).field_i = 500;
        ((kh) this).field_s = 100;
        ((kh) this).field_k = new int[]{0, 0, 0, 0, 0};
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
        field_j = new int[32768];
        for (var1 = 0; var1 < 32768; var1++) {
            field_j[var1] = (int)(Math.sin((double)var1 / 5215.1903) * 16384.0);
        }
        field_e = new int[220500];
        field_h = new int[5];
        field_m = new int[5];
        field_l = new int[5];
        field_d = new int[5];
        field_w = new int[5];
    }
}
