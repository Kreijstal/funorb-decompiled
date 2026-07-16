/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pb {
    private int field_q;
    private ed field_e;
    private int[] field_y;
    private static int[] field_s;
    private int[] field_a;
    private ed field_t;
    private static int[] field_k;
    private ed field_g;
    private ed field_c;
    private ed field_i;
    private int[] field_p;
    private ed field_d;
    private ed field_f;
    private on field_r;
    private ed field_h;
    private ed field_j;
    int field_l;
    private static int[] field_v;
    private int field_n;
    private static int[] field_u;
    private static int[] field_w;
    private static int[] field_m;
    private static int[] field_o;
    private static int[] field_b;
    int field_x;

    public static void a() {
        field_s = null;
        field_k = null;
        field_v = null;
        field_m = null;
        field_u = null;
        field_w = null;
        field_b = null;
        field_o = null;
    }

    final void a(ge param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          ((pb) this).field_j = new ed();
          ((pb) this).field_j.b(param0);
          ((pb) this).field_c = new ed();
          ((pb) this).field_c.b(param0);
          var2 = param0.g(-98);
          if (var2 == 0) {
            break L0;
          } else {
            param0.field_v = param0.field_v - 1;
            ((pb) this).field_h = new ed();
            ((pb) this).field_h.b(param0);
            ((pb) this).field_i = new ed();
            ((pb) this).field_i.b(param0);
            break L0;
          }
        }
        L1: {
          var2 = param0.g(-95);
          if (var2 == 0) {
            break L1;
          } else {
            param0.field_v = param0.field_v - 1;
            ((pb) this).field_g = new ed();
            ((pb) this).field_g.b(param0);
            ((pb) this).field_t = new ed();
            ((pb) this).field_t.b(param0);
            break L1;
          }
        }
        L2: {
          var2 = param0.g(-83);
          if (var2 == 0) {
            break L2;
          } else {
            param0.field_v = param0.field_v - 1;
            ((pb) this).field_e = new ed();
            ((pb) this).field_e.b(param0);
            ((pb) this).field_d = new ed();
            ((pb) this).field_d.b(param0);
            break L2;
          }
        }
        var3 = 0;
        L3: while (true) {
          L4: {
            if (var3 >= 10) {
              break L4;
            } else {
              var4 = param0.c((byte) -115);
              if (var4 != 0) {
                ((pb) this).field_y[var3] = var4;
                ((pb) this).field_a[var3] = param0.i(-103);
                ((pb) this).field_p[var3] = param0.c((byte) -115);
                var3++;
                continue L3;
              } else {
                break L4;
              }
            }
          }
          ((pb) this).field_n = param0.c((byte) -115);
          ((pb) this).field_q = param0.c((byte) -115);
          ((pb) this).field_x = param0.d(-1034);
          ((pb) this).field_l = param0.d(-1034);
          ((pb) this).field_r = new on();
          ((pb) this).field_f = new ed();
          ((pb) this).field_r.a(param0, ((pb) this).field_f);
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
            return field_v[param0 & 32767] * param1 >> 14;
        }
        if (param2 == 3) {
            return ((param0 & 32767) * param1 >> 14) - param1;
        }
        if (param2 == 4) {
            return field_k[param0 / 2607 & 32767] * param1;
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
        qn.a(field_s, 0, param0);
        if (param1 >= 10) {
          L0: {
            var3 = (double)param0 / ((double)param1 + 0.0);
            ((pb) this).field_j.a();
            ((pb) this).field_c.a();
            var5 = 0;
            var6 = 0;
            var7 = 0;
            if (((pb) this).field_h == null) {
              break L0;
            } else {
              ((pb) this).field_h.a();
              ((pb) this).field_i.a();
              var5 = (int)((double)(((pb) this).field_h.field_a - ((pb) this).field_h.field_f) * 32.768 / var3);
              var6 = (int)((double)((pb) this).field_h.field_f * 32.768 / var3);
              break L0;
            }
          }
          L1: {
            var8 = 0;
            var9 = 0;
            var10 = 0;
            if (((pb) this).field_g == null) {
              break L1;
            } else {
              ((pb) this).field_g.a();
              ((pb) this).field_t.a();
              var8 = (int)((double)(((pb) this).field_g.field_a - ((pb) this).field_g.field_f) * 32.768 / var3);
              var9 = (int)((double)((pb) this).field_g.field_f * 32.768 / var3);
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
                    if (((pb) this).field_e == null) {
                      break L4;
                    } else {
                      ((pb) this).field_e.a();
                      ((pb) this).field_d.a();
                      var11 = 0;
                      var12 = 0;
                      var13 = 1;
                      var14 = 0;
                      L5: while (true) {
                        if (var14 >= param0) {
                          break L4;
                        } else {
                          L6: {
                            var15 = ((pb) this).field_e.a(param0);
                            var16 = ((pb) this).field_d.a(param0);
                            if (var13 == 0) {
                              var12 = ((pb) this).field_e.field_f + ((((pb) this).field_e.field_a - ((pb) this).field_e.field_f) * var16 >> 8);
                              break L6;
                            } else {
                              var12 = ((pb) this).field_e.field_f + ((((pb) this).field_e.field_a - ((pb) this).field_e.field_f) * var15 >> 8);
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
                            field_s[var14] = 0;
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
                    if (((pb) this).field_n <= 0) {
                      break L9;
                    } else {
                      if (((pb) this).field_q <= 0) {
                        break L9;
                      } else {
                        var11 = (int)((double)((pb) this).field_n * var3);
                        var12 = var11;
                        L10: while (true) {
                          if (var12 >= param0) {
                            break L9;
                          } else {
                            field_s[var12] = field_s[var12] + field_s[var12 - var11] * ((pb) this).field_q / 100;
                            var12++;
                            continue L10;
                          }
                        }
                      }
                    }
                  }
                  L11: {
                    L12: {
                      if (((pb) this).field_r.field_d[0] > 0) {
                        break L12;
                      } else {
                        if (((pb) this).field_r.field_d[1] <= 0) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    ((pb) this).field_f.a();
                    var11 = ((pb) this).field_f.a(param0 + 1);
                    var12 = ((pb) this).field_r.a(0, (float)var11 / 65536.0f);
                    var13 = ((pb) this).field_r.a(1, (float)var11 / 65536.0f);
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
                                  var12 = ((pb) this).field_r.a(0, (float)var11 / 65536.0f);
                                  var13 = ((pb) this).field_r.a(1, (float)var11 / 65536.0f);
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
                                              field_s[var14] = var16;
                                              var11 = ((pb) this).field_f.a(param0 + 1);
                                              var14++;
                                              continue L18;
                                            } else {
                                              var16 = var16 - (int)((long)field_s[var14 - 1 - var17] * (long)on.field_h[1][var17] >> 16);
                                              var17++;
                                              continue L20;
                                            }
                                          }
                                        } else {
                                          var16 = var16 + (int)((long)field_s[var14 + var12 - 1 - var17] * (long)on.field_h[0][var17] >> 16);
                                          var17++;
                                          continue L19;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                var16 = (int)((long)field_s[var14 + var12] * (long)on.field_e >> 16);
                                var17 = 0;
                                L21: while (true) {
                                  if (var17 >= var12) {
                                    var17 = 0;
                                    L22: while (true) {
                                      if (var17 >= var13) {
                                        field_s[var14] = var16;
                                        var11 = ((pb) this).field_f.a(param0 + 1);
                                        var14++;
                                        continue L17;
                                      } else {
                                        var16 = var16 - (int)((long)field_s[var14 - 1 - var17] * (long)on.field_h[1][var17] >> 16);
                                        var17++;
                                        continue L22;
                                      }
                                    }
                                  } else {
                                    var16 = var16 + (int)((long)field_s[var14 + var12 - 1 - var17] * (long)on.field_h[0][var17] >> 16);
                                    var17++;
                                    continue L21;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var16 = (int)((long)field_s[var14 + var12] * (long)on.field_e >> 16);
                          var17 = 0;
                          L23: while (true) {
                            if (var17 >= var12) {
                              var17 = 0;
                              L24: while (true) {
                                if (var17 >= var14) {
                                  field_s[var14] = var16;
                                  var11 = ((pb) this).field_f.a(param0 + 1);
                                  var14++;
                                  continue L14;
                                } else {
                                  var16 = var16 - (int)((long)field_s[var14 - 1 - var17] * (long)on.field_h[1][var17] >> 16);
                                  var17++;
                                  continue L24;
                                }
                              }
                            } else {
                              var16 = var16 + (int)((long)field_s[var14 + var12 - 1 - var17] * (long)on.field_h[0][var17] >> 16);
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
                      return field_s;
                    } else {
                      L26: {
                        if (field_s[var11] >= -32768) {
                          break L26;
                        } else {
                          field_s[var11] = -32768;
                          break L26;
                        }
                      }
                      if (field_s[var11] > 32767) {
                        field_s[var11] = 32767;
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
                    var12 = ((pb) this).field_j.a(param0);
                    var13 = ((pb) this).field_c.a(param0);
                    if (((pb) this).field_h == null) {
                      break L27;
                    } else {
                      var14 = ((pb) this).field_h.a(param0);
                      var15 = ((pb) this).field_i.a(param0);
                      var12 = var12 + (this.a(var7, var15, ((pb) this).field_h.field_b) >> 1);
                      var7 = var7 + ((var14 * var5 >> 16) + var6);
                      break L27;
                    }
                  }
                  L28: {
                    if (((pb) this).field_g == null) {
                      break L28;
                    } else {
                      var14 = ((pb) this).field_g.a(param0);
                      var15 = ((pb) this).field_t.a(param0);
                      var13 = var13 * ((this.a(var10, var15, ((pb) this).field_g.field_b) >> 1) + 32768) >> 15;
                      var10 = var10 + ((var14 * var8 >> 16) + var9);
                      break L28;
                    }
                  }
                  var14 = 0;
                  L29: while (true) {
                    if (var14 < 5) {
                      if (((pb) this).field_y[var14] != 0) {
                        var15 = var11 + field_u[var14];
                        if (var15 < param0) {
                          field_s[var15] = field_s[var15] + this.a(field_m[var14], var13 * field_w[var14] >> 15, ((pb) this).field_j.field_b);
                          field_m[var14] = field_m[var14] + ((var12 * field_b[var14] >> 16) + field_o[var14]);
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
              if (((pb) this).field_y[var11] != 0) {
                field_m[var11] = 0;
                field_u[var11] = (int)((double)((pb) this).field_p[var11] * var3);
                field_w[var11] = (((pb) this).field_y[var11] << 14) / 100;
                field_b[var11] = (int)((double)(((pb) this).field_j.field_a - ((pb) this).field_j.field_f) * 32.768 * Math.pow(1.0057929410678534, (double)((pb) this).field_a[var11]) / var3);
                field_o[var11] = (int)((double)((pb) this).field_j.field_f * 32.768 / var3);
                var11++;
                continue L2;
              } else {
                var11++;
                continue L2;
              }
            }
          }
        } else {
          return field_s;
        }
    }

    pb() {
        ((pb) this).field_y = new int[]{0, 0, 0, 0, 0};
        ((pb) this).field_q = 100;
        ((pb) this).field_a = new int[]{0, 0, 0, 0, 0};
        ((pb) this).field_p = new int[]{0, 0, 0, 0, 0};
        ((pb) this).field_l = 0;
        ((pb) this).field_n = 0;
        ((pb) this).field_x = 500;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var1 = 0;
        field_k = new int[32768];
        Random var0 = new Random(0L);
        for (var1 = 0; var1 < 32768; var1++) {
            field_k[var1] = (var0.nextInt() & 2) - 1;
        }
        field_v = new int[32768];
        for (var1 = 0; var1 < 32768; var1++) {
            field_v[var1] = (int)(Math.sin((double)var1 / 5215.1903) * 16384.0);
        }
        field_s = new int[220500];
        field_u = new int[5];
        field_o = new int[5];
        field_m = new int[5];
        field_w = new int[5];
        field_b = new int[5];
    }
}
