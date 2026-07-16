/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hd {
    private lj field_w;
    private static int[] field_r;
    private int[] field_g;
    private int[] field_s;
    private ih field_e;
    private ih field_j;
    private int[] field_m;
    private ih field_n;
    private ih field_d;
    private ih field_u;
    int field_o;
    private static int[] field_b;
    private ih field_a;
    private static int[] field_c;
    private int field_x;
    int field_v;
    private ih field_q;
    private static int[] field_k;
    private static int[] field_h;
    private ih field_i;
    private static int[] field_y;
    private int field_f;
    private static int[] field_p;
    private ih field_l;
    private static int[] field_t;

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
        og.a(field_b, 0, param0);
        if (param1 >= 10) {
          L0: {
            var3 = (double)param0 / ((double)param1 + 0.0);
            ((hd) this).field_a.a();
            ((hd) this).field_l.a();
            var5 = 0;
            var6 = 0;
            var7 = 0;
            if (((hd) this).field_j == null) {
              break L0;
            } else {
              ((hd) this).field_j.a();
              ((hd) this).field_u.a();
              var5 = (int)((double)(((hd) this).field_j.field_b - ((hd) this).field_j.field_c) * 32.768 / var3);
              var6 = (int)((double)((hd) this).field_j.field_c * 32.768 / var3);
              break L0;
            }
          }
          L1: {
            var8 = 0;
            var9 = 0;
            var10 = 0;
            if (((hd) this).field_d == null) {
              break L1;
            } else {
              ((hd) this).field_d.a();
              ((hd) this).field_i.a();
              var8 = (int)((double)(((hd) this).field_d.field_b - ((hd) this).field_d.field_c) * 32.768 / var3);
              var9 = (int)((double)((hd) this).field_d.field_c * 32.768 / var3);
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
                    if (((hd) this).field_e == null) {
                      break L4;
                    } else {
                      ((hd) this).field_e.a();
                      ((hd) this).field_q.a();
                      var11 = 0;
                      var12 = 0;
                      var13 = 1;
                      var14 = 0;
                      L5: while (true) {
                        if (var14 >= param0) {
                          break L4;
                        } else {
                          L6: {
                            var15 = ((hd) this).field_e.a(param0);
                            var16 = ((hd) this).field_q.a(param0);
                            if (var13 == 0) {
                              var12 = ((hd) this).field_e.field_c + ((((hd) this).field_e.field_b - ((hd) this).field_e.field_c) * var16 >> 8);
                              break L6;
                            } else {
                              var12 = ((hd) this).field_e.field_c + ((((hd) this).field_e.field_b - ((hd) this).field_e.field_c) * var15 >> 8);
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
                            field_b[var14] = 0;
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
                    if (((hd) this).field_x <= 0) {
                      break L9;
                    } else {
                      if (((hd) this).field_f <= 0) {
                        break L9;
                      } else {
                        var11 = (int)((double)((hd) this).field_x * var3);
                        var12 = var11;
                        L10: while (true) {
                          if (var12 >= param0) {
                            break L9;
                          } else {
                            field_b[var12] = field_b[var12] + field_b[var12 - var11] * ((hd) this).field_f / 100;
                            var12++;
                            continue L10;
                          }
                        }
                      }
                    }
                  }
                  L11: {
                    L12: {
                      if (((hd) this).field_w.field_e[0] > 0) {
                        break L12;
                      } else {
                        if (((hd) this).field_w.field_e[1] <= 0) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    ((hd) this).field_n.a();
                    var11 = ((hd) this).field_n.a(param0 + 1);
                    var12 = ((hd) this).field_w.a(0, (float)var11 / 65536.0f);
                    var13 = ((hd) this).field_w.a(1, (float)var11 / 65536.0f);
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
                                  var12 = ((hd) this).field_w.a(0, (float)var11 / 65536.0f);
                                  var13 = ((hd) this).field_w.a(1, (float)var11 / 65536.0f);
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
                                              field_b[var14] = var16;
                                              var11 = ((hd) this).field_n.a(param0 + 1);
                                              var14++;
                                              continue L18;
                                            } else {
                                              var16 = var16 - (int)((long)field_b[var14 - 1 - var17] * (long)lj.field_a[1][var17] >> 16);
                                              var17++;
                                              continue L20;
                                            }
                                          }
                                        } else {
                                          var16 = var16 + (int)((long)field_b[var14 + var12 - 1 - var17] * (long)lj.field_a[0][var17] >> 16);
                                          var17++;
                                          continue L19;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                var16 = (int)((long)field_b[var14 + var12] * (long)lj.field_b >> 16);
                                var17 = 0;
                                L21: while (true) {
                                  if (var17 >= var12) {
                                    var17 = 0;
                                    L22: while (true) {
                                      if (var17 >= var13) {
                                        field_b[var14] = var16;
                                        var11 = ((hd) this).field_n.a(param0 + 1);
                                        var14++;
                                        continue L17;
                                      } else {
                                        var16 = var16 - (int)((long)field_b[var14 - 1 - var17] * (long)lj.field_a[1][var17] >> 16);
                                        var17++;
                                        continue L22;
                                      }
                                    }
                                  } else {
                                    var16 = var16 + (int)((long)field_b[var14 + var12 - 1 - var17] * (long)lj.field_a[0][var17] >> 16);
                                    var17++;
                                    continue L21;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var16 = (int)((long)field_b[var14 + var12] * (long)lj.field_b >> 16);
                          var17 = 0;
                          L23: while (true) {
                            if (var17 >= var12) {
                              var17 = 0;
                              L24: while (true) {
                                if (var17 >= var14) {
                                  field_b[var14] = var16;
                                  var11 = ((hd) this).field_n.a(param0 + 1);
                                  var14++;
                                  continue L14;
                                } else {
                                  var16 = var16 - (int)((long)field_b[var14 - 1 - var17] * (long)lj.field_a[1][var17] >> 16);
                                  var17++;
                                  continue L24;
                                }
                              }
                            } else {
                              var16 = var16 + (int)((long)field_b[var14 + var12 - 1 - var17] * (long)lj.field_a[0][var17] >> 16);
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
                      return field_b;
                    } else {
                      L26: {
                        if (field_b[var11] >= -32768) {
                          break L26;
                        } else {
                          field_b[var11] = -32768;
                          break L26;
                        }
                      }
                      if (field_b[var11] > 32767) {
                        field_b[var11] = 32767;
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
                    var12 = ((hd) this).field_a.a(param0);
                    var13 = ((hd) this).field_l.a(param0);
                    if (((hd) this).field_j == null) {
                      break L27;
                    } else {
                      var14 = ((hd) this).field_j.a(param0);
                      var15 = ((hd) this).field_u.a(param0);
                      var12 = var12 + (this.a(var7, var15, ((hd) this).field_j.field_k) >> 1);
                      var7 = var7 + ((var14 * var5 >> 16) + var6);
                      break L27;
                    }
                  }
                  L28: {
                    if (((hd) this).field_d == null) {
                      break L28;
                    } else {
                      var14 = ((hd) this).field_d.a(param0);
                      var15 = ((hd) this).field_i.a(param0);
                      var13 = var13 * ((this.a(var10, var15, ((hd) this).field_d.field_k) >> 1) + 32768) >> 15;
                      var10 = var10 + ((var14 * var8 >> 16) + var9);
                      break L28;
                    }
                  }
                  var14 = 0;
                  L29: while (true) {
                    if (var14 < 5) {
                      if (((hd) this).field_s[var14] != 0) {
                        var15 = var11 + field_t[var14];
                        if (var15 < param0) {
                          field_b[var15] = field_b[var15] + this.a(field_k[var14], var13 * field_p[var14] >> 15, ((hd) this).field_a.field_k);
                          field_k[var14] = field_k[var14] + ((var12 * field_y[var14] >> 16) + field_h[var14]);
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
              if (((hd) this).field_s[var11] != 0) {
                field_k[var11] = 0;
                field_t[var11] = (int)((double)((hd) this).field_m[var11] * var3);
                field_p[var11] = (((hd) this).field_s[var11] << 14) / 100;
                field_y[var11] = (int)((double)(((hd) this).field_a.field_b - ((hd) this).field_a.field_c) * 32.768 * Math.pow(1.0057929410678534, (double)((hd) this).field_g[var11]) / var3);
                field_h[var11] = (int)((double)((hd) this).field_a.field_c * 32.768 / var3);
                var11++;
                continue L2;
              } else {
                var11++;
                continue L2;
              }
            }
          }
        } else {
          return field_b;
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
            return field_r[param0 & 32767] * param1 >> 14;
        }
        if (param2 == 3) {
            return ((param0 & 32767) * param1 >> 14) - param1;
        }
        if (param2 == 4) {
            return field_c[param0 / 2607 & 32767] * param1;
        }
        return 0;
    }

    final void a(pb param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          ((hd) this).field_a = new ih();
          ((hd) this).field_a.b(param0);
          ((hd) this).field_l = new ih();
          ((hd) this).field_l.b(param0);
          var2 = param0.f(102);
          if (var2 == 0) {
            break L0;
          } else {
            param0.field_i = param0.field_i - 1;
            ((hd) this).field_j = new ih();
            ((hd) this).field_j.b(param0);
            ((hd) this).field_u = new ih();
            ((hd) this).field_u.b(param0);
            break L0;
          }
        }
        L1: {
          var2 = param0.f(36);
          if (var2 == 0) {
            break L1;
          } else {
            param0.field_i = param0.field_i - 1;
            ((hd) this).field_d = new ih();
            ((hd) this).field_d.b(param0);
            ((hd) this).field_i = new ih();
            ((hd) this).field_i.b(param0);
            break L1;
          }
        }
        L2: {
          var2 = param0.f(-105);
          if (var2 == 0) {
            break L2;
          } else {
            param0.field_i = param0.field_i - 1;
            ((hd) this).field_e = new ih();
            ((hd) this).field_e.b(param0);
            ((hd) this).field_q = new ih();
            ((hd) this).field_q.b(param0);
            break L2;
          }
        }
        var3 = 0;
        L3: while (true) {
          L4: {
            if (var3 >= 10) {
              break L4;
            } else {
              var4 = param0.a(0);
              if (var4 != 0) {
                ((hd) this).field_s[var3] = var4;
                ((hd) this).field_g[var3] = param0.b((byte) 59);
                ((hd) this).field_m[var3] = param0.a(0);
                var3++;
                continue L3;
              } else {
                break L4;
              }
            }
          }
          ((hd) this).field_x = param0.a(0);
          ((hd) this).field_f = param0.a(0);
          ((hd) this).field_o = param0.d((byte) 72);
          ((hd) this).field_v = param0.d((byte) 72);
          ((hd) this).field_w = new lj();
          ((hd) this).field_n = new ih();
          ((hd) this).field_w.a(param0, ((hd) this).field_n);
          return;
        }
    }

    public static void a() {
        field_b = null;
        field_c = null;
        field_r = null;
        field_k = null;
        field_t = null;
        field_p = null;
        field_y = null;
        field_h = null;
    }

    hd() {
        ((hd) this).field_s = new int[]{0, 0, 0, 0, 0};
        ((hd) this).field_g = new int[]{0, 0, 0, 0, 0};
        ((hd) this).field_o = 500;
        ((hd) this).field_v = 0;
        ((hd) this).field_m = new int[]{0, 0, 0, 0, 0};
        ((hd) this).field_x = 0;
        ((hd) this).field_f = 100;
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
        field_r = new int[32768];
        for (var1 = 0; var1 < 32768; var1++) {
            field_r[var1] = (int)(Math.sin((double)var1 / 5215.1903) * 16384.0);
        }
        field_b = new int[220500];
        field_k = new int[5];
        field_h = new int[5];
        field_y = new int[5];
        field_p = new int[5];
        field_t = new int[5];
    }
}
