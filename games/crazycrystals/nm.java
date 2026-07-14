/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class nm {
    private ml field_h;
    private ml field_p;
    private ml field_c;
    private static int[] field_b;
    private ml field_f;
    private ml field_d;
    private int[] field_r;
    private int[] field_y;
    int field_g;
    private ml field_q;
    private ml field_j;
    private ml field_t;
    private static int[] field_k;
    private static int[] field_x;
    private bk field_v;
    private static int[] field_e;
    int field_w;
    private static int[] field_o;
    private ml field_l;
    private int field_n;
    private static int[] field_i;
    private static int[] field_m;
    private static int[] field_s;
    private int field_a;
    private int[] field_u;

    private final int a(int param0, int param1, int param2) {
        if (param2 == 1) {
            if ((param0 & 32767) < 16384) {
                return param1;
            }
            return -param1;
        }
        if (param2 == 2) {
            return field_b[param0 & 32767] * param1 >> 14;
        }
        if (param2 == 3) {
            return ((param0 & 32767) * param1 >> 14) - param1;
        }
        if (param2 == 4) {
            return field_x[param0 / 2607 & 32767] * param1;
        }
        return 0;
    }

    final void a(ng param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          ((nm) this).field_p = new ml();
          ((nm) this).field_p.b(param0);
          ((nm) this).field_q = new ml();
          ((nm) this).field_q.b(param0);
          var2 = param0.h(255);
          if (var2 == 0) {
            break L0;
          } else {
            param0.field_f = param0.field_f - 1;
            ((nm) this).field_c = new ml();
            ((nm) this).field_c.b(param0);
            ((nm) this).field_f = new ml();
            ((nm) this).field_f.b(param0);
            break L0;
          }
        }
        L1: {
          var2 = param0.h(255);
          if (var2 == 0) {
            break L1;
          } else {
            param0.field_f = param0.field_f - 1;
            ((nm) this).field_t = new ml();
            ((nm) this).field_t.b(param0);
            ((nm) this).field_d = new ml();
            ((nm) this).field_d.b(param0);
            break L1;
          }
        }
        L2: {
          var2 = param0.h(255);
          if (var2 == 0) {
            break L2;
          } else {
            param0.field_f = param0.field_f - 1;
            ((nm) this).field_h = new ml();
            ((nm) this).field_h.b(param0);
            ((nm) this).field_l = new ml();
            ((nm) this).field_l.b(param0);
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
                ((nm) this).field_u[var3] = var4;
                ((nm) this).field_r[var3] = param0.f(0);
                ((nm) this).field_y[var3] = param0.c(false);
                var3++;
                continue L3;
              } else {
                break L4;
              }
            }
          }
          ((nm) this).field_a = param0.c(false);
          ((nm) this).field_n = param0.c(false);
          ((nm) this).field_w = param0.c((byte) -7);
          ((nm) this).field_g = param0.c((byte) -7);
          ((nm) this).field_v = new bk();
          ((nm) this).field_j = new ml();
          ((nm) this).field_v.a(param0, ((nm) this).field_j);
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
        eg.a(field_k, 0, param0);
        if (param1 >= 10) {
          L0: {
            var3 = (double)param0 / ((double)param1 + 0.0);
            ((nm) this).field_p.a();
            ((nm) this).field_q.a();
            var5 = 0;
            var6 = 0;
            var7 = 0;
            if (((nm) this).field_c == null) {
              break L0;
            } else {
              ((nm) this).field_c.a();
              ((nm) this).field_f.a();
              var5 = (int)((double)(((nm) this).field_c.field_d - ((nm) this).field_c.field_h) * 32.768 / var3);
              var6 = (int)((double)((nm) this).field_c.field_h * 32.768 / var3);
              break L0;
            }
          }
          L1: {
            var8 = 0;
            var9 = 0;
            var10 = 0;
            if (((nm) this).field_t == null) {
              break L1;
            } else {
              ((nm) this).field_t.a();
              ((nm) this).field_d.a();
              var8 = (int)((double)(((nm) this).field_t.field_d - ((nm) this).field_t.field_h) * 32.768 / var3);
              var9 = (int)((double)((nm) this).field_t.field_h * 32.768 / var3);
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
                    if (((nm) this).field_h == null) {
                      break L4;
                    } else {
                      ((nm) this).field_h.a();
                      ((nm) this).field_l.a();
                      var11 = 0;
                      var12 = 0;
                      var13 = 1;
                      var14 = 0;
                      L5: while (true) {
                        if (var14 >= param0) {
                          break L4;
                        } else {
                          L6: {
                            var15 = ((nm) this).field_h.a(param0);
                            var16 = ((nm) this).field_l.a(param0);
                            if (var13 == 0) {
                              var12 = ((nm) this).field_h.field_h + ((((nm) this).field_h.field_d - ((nm) this).field_h.field_h) * var16 >> 8);
                              break L6;
                            } else {
                              var12 = ((nm) this).field_h.field_h + ((((nm) this).field_h.field_d - ((nm) this).field_h.field_h) * var15 >> 8);
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
                            field_k[var14] = 0;
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
                    if (((nm) this).field_a <= 0) {
                      break L9;
                    } else {
                      if (((nm) this).field_n <= 0) {
                        break L9;
                      } else {
                        var11 = (int)((double)((nm) this).field_a * var3);
                        var12 = var11;
                        L10: while (true) {
                          if (var12 >= param0) {
                            break L9;
                          } else {
                            field_k[var12] = field_k[var12] + field_k[var12 - var11] * ((nm) this).field_n / 100;
                            var12++;
                            continue L10;
                          }
                        }
                      }
                    }
                  }
                  L11: {
                    L12: {
                      if (((nm) this).field_v.field_c[0] > 0) {
                        break L12;
                      } else {
                        if (((nm) this).field_v.field_c[1] <= 0) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    ((nm) this).field_j.a();
                    var11 = ((nm) this).field_j.a(param0 + 1);
                    var12 = ((nm) this).field_v.a(0, (float)var11 / 65536.0f);
                    var13 = ((nm) this).field_v.a(1, (float)var11 / 65536.0f);
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
                                  var12 = ((nm) this).field_v.a(0, (float)var11 / 65536.0f);
                                  var13 = ((nm) this).field_v.a(1, (float)var11 / 65536.0f);
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
                                              field_k[var14] = var16;
                                              var11 = ((nm) this).field_j.a(param0 + 1);
                                              var14++;
                                              continue L18;
                                            } else {
                                              var16 = var16 - (int)((long)field_k[var14 - 1 - var17] * (long)bk.field_g[1][var17] >> 16);
                                              var17++;
                                              continue L20;
                                            }
                                          }
                                        } else {
                                          var16 = var16 + (int)((long)field_k[var14 + var12 - 1 - var17] * (long)bk.field_g[0][var17] >> 16);
                                          var17++;
                                          continue L19;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                var16 = (int)((long)field_k[var14 + var12] * (long)bk.field_e >> 16);
                                var17 = 0;
                                L21: while (true) {
                                  if (var17 >= var12) {
                                    var17 = 0;
                                    L22: while (true) {
                                      if (var17 >= var13) {
                                        field_k[var14] = var16;
                                        var11 = ((nm) this).field_j.a(param0 + 1);
                                        var14++;
                                        continue L17;
                                      } else {
                                        var16 = var16 - (int)((long)field_k[var14 - 1 - var17] * (long)bk.field_g[1][var17] >> 16);
                                        var17++;
                                        continue L22;
                                      }
                                    }
                                  } else {
                                    var16 = var16 + (int)((long)field_k[var14 + var12 - 1 - var17] * (long)bk.field_g[0][var17] >> 16);
                                    var17++;
                                    continue L21;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var16 = (int)((long)field_k[var14 + var12] * (long)bk.field_e >> 16);
                          var17 = 0;
                          L23: while (true) {
                            if (var17 >= var12) {
                              var17 = 0;
                              L24: while (true) {
                                if (var17 >= var14) {
                                  field_k[var14] = var16;
                                  var11 = ((nm) this).field_j.a(param0 + 1);
                                  var14++;
                                  continue L14;
                                } else {
                                  var16 = var16 - (int)((long)field_k[var14 - 1 - var17] * (long)bk.field_g[1][var17] >> 16);
                                  var17++;
                                  continue L24;
                                }
                              }
                            } else {
                              var16 = var16 + (int)((long)field_k[var14 + var12 - 1 - var17] * (long)bk.field_g[0][var17] >> 16);
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
                      return field_k;
                    } else {
                      L26: {
                        if (field_k[var11] >= -32768) {
                          break L26;
                        } else {
                          field_k[var11] = -32768;
                          break L26;
                        }
                      }
                      if (field_k[var11] > 32767) {
                        field_k[var11] = 32767;
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
                    var12 = ((nm) this).field_p.a(param0);
                    var13 = ((nm) this).field_q.a(param0);
                    if (((nm) this).field_c == null) {
                      break L27;
                    } else {
                      var14 = ((nm) this).field_c.a(param0);
                      var15 = ((nm) this).field_f.a(param0);
                      var12 = var12 + (this.a(var7, var15, ((nm) this).field_c.field_c) >> 1);
                      var7 = var7 + ((var14 * var5 >> 16) + var6);
                      break L27;
                    }
                  }
                  L28: {
                    if (((nm) this).field_t == null) {
                      break L28;
                    } else {
                      var14 = ((nm) this).field_t.a(param0);
                      var15 = ((nm) this).field_d.a(param0);
                      var13 = var13 * ((this.a(var10, var15, ((nm) this).field_t.field_c) >> 1) + 32768) >> 15;
                      var10 = var10 + ((var14 * var8 >> 16) + var9);
                      break L28;
                    }
                  }
                  var14 = 0;
                  L29: while (true) {
                    if (var14 < 5) {
                      if (((nm) this).field_u[var14] != 0) {
                        var15 = var11 + field_e[var14];
                        if (var15 < param0) {
                          field_k[var15] = field_k[var15] + this.a(field_s[var14], var13 * field_i[var14] >> 15, ((nm) this).field_p.field_c);
                          field_s[var14] = field_s[var14] + ((var12 * field_m[var14] >> 16) + field_o[var14]);
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
              if (((nm) this).field_u[var11] != 0) {
                field_s[var11] = 0;
                field_e[var11] = (int)((double)((nm) this).field_y[var11] * var3);
                field_i[var11] = (((nm) this).field_u[var11] << 14) / 100;
                field_m[var11] = (int)((double)(((nm) this).field_p.field_d - ((nm) this).field_p.field_h) * 32.768 * Math.pow(1.0057929410678534, (double)((nm) this).field_r[var11]) / var3);
                field_o[var11] = (int)((double)((nm) this).field_p.field_h * 32.768 / var3);
                var11++;
                continue L2;
              } else {
                var11++;
                continue L2;
              }
            }
          }
        } else {
          return field_k;
        }
    }

    public static void a() {
        field_k = null;
        field_x = null;
        field_b = null;
        field_s = null;
        field_e = null;
        field_i = null;
        field_m = null;
        field_o = null;
    }

    nm() {
        ((nm) this).field_y = new int[]{0, 0, 0, 0, 0};
        ((nm) this).field_g = 0;
        ((nm) this).field_r = new int[]{0, 0, 0, 0, 0};
        ((nm) this).field_n = 100;
        ((nm) this).field_a = 0;
        ((nm) this).field_w = 500;
        ((nm) this).field_u = new int[]{0, 0, 0, 0, 0};
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var1 = 0;
        field_x = new int[32768];
        Random var0 = new Random(0L);
        for (var1 = 0; var1 < 32768; var1++) {
            field_x[var1] = (var0.nextInt() & 2) - 1;
        }
        field_b = new int[32768];
        for (var1 = 0; var1 < 32768; var1++) {
            field_b[var1] = (int)(Math.sin((double)var1 / 5215.1903) * 16384.0);
        }
        field_k = new int[220500];
        field_e = new int[5];
        field_o = new int[5];
        field_s = new int[5];
        field_m = new int[5];
        field_i = new int[5];
    }
}
