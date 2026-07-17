/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class fka {
    private int[] field_u;
    private static int[] field_w;
    private co field_p;
    private int field_m;
    private co field_g;
    private co field_c;
    private co field_k;
    private static int[] field_b;
    private co field_e;
    private hva field_n;
    private static int[] field_x;
    private co field_y;
    int field_v;
    private int field_f;
    private int[] field_a;
    private co field_d;
    private static int[] field_q;
    private int[] field_t;
    private static int[] field_r;
    private static int[] field_s;
    private co field_l;
    private static int[] field_o;
    private static int[] field_j;
    int field_i;
    private co field_h;

    final void a(uia param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          ((fka) this).field_g = new co();
          ((fka) this).field_g.b(param0);
          ((fka) this).field_y = new co();
          ((fka) this).field_y.b(param0);
          var2 = param0.h(255);
          if (var2 == 0) {
            break L0;
          } else {
            param0.field_h = param0.field_h - 1;
            ((fka) this).field_c = new co();
            ((fka) this).field_c.b(param0);
            ((fka) this).field_l = new co();
            ((fka) this).field_l.b(param0);
            break L0;
          }
        }
        L1: {
          var2 = param0.h(255);
          if (var2 == 0) {
            break L1;
          } else {
            param0.field_h = param0.field_h - 1;
            ((fka) this).field_e = new co();
            ((fka) this).field_e.b(param0);
            ((fka) this).field_p = new co();
            ((fka) this).field_p.b(param0);
            break L1;
          }
        }
        L2: {
          var2 = param0.h(255);
          if (var2 == 0) {
            break L2;
          } else {
            param0.field_h = param0.field_h - 1;
            ((fka) this).field_k = new co();
            ((fka) this).field_k.b(param0);
            ((fka) this).field_h = new co();
            ((fka) this).field_h.b(param0);
            break L2;
          }
        }
        var3 = 0;
        L3: while (true) {
          L4: {
            if (var3 >= 10) {
              break L4;
            } else {
              var4 = param0.d((byte) -46);
              if (var4 != 0) {
                ((fka) this).field_a[var3] = var4;
                ((fka) this).field_u[var3] = param0.f((byte) -128);
                ((fka) this).field_t[var3] = param0.d((byte) -46);
                var3++;
                continue L3;
              } else {
                break L4;
              }
            }
          }
          ((fka) this).field_f = param0.d((byte) -46);
          ((fka) this).field_m = param0.d((byte) -46);
          ((fka) this).field_v = param0.d(123);
          ((fka) this).field_i = param0.d(126);
          ((fka) this).field_n = new hva();
          ((fka) this).field_d = new co();
          ((fka) this).field_n.a(param0, ((fka) this).field_d);
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
        lua.a(field_x, 0, param0);
        if (param1 >= 10) {
          L0: {
            var3 = (double)param0 / ((double)param1 + 0.0);
            ((fka) this).field_g.a();
            ((fka) this).field_y.a();
            var5 = 0;
            var6 = 0;
            var7 = 0;
            if (((fka) this).field_c == null) {
              break L0;
            } else {
              ((fka) this).field_c.a();
              ((fka) this).field_l.a();
              var5 = (int)((double)(((fka) this).field_c.field_i - ((fka) this).field_c.field_e) * 32.768 / var3);
              var6 = (int)((double)((fka) this).field_c.field_e * 32.768 / var3);
              break L0;
            }
          }
          L1: {
            var8 = 0;
            var9 = 0;
            var10 = 0;
            if (((fka) this).field_e == null) {
              break L1;
            } else {
              ((fka) this).field_e.a();
              ((fka) this).field_p.a();
              var8 = (int)((double)(((fka) this).field_e.field_i - ((fka) this).field_e.field_e) * 32.768 / var3);
              var9 = (int)((double)((fka) this).field_e.field_e * 32.768 / var3);
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
                    if (((fka) this).field_k == null) {
                      break L4;
                    } else {
                      ((fka) this).field_k.a();
                      ((fka) this).field_h.a();
                      var11 = 0;
                      var12 = 0;
                      var13 = 1;
                      var14 = 0;
                      L5: while (true) {
                        if (var14 >= param0) {
                          break L4;
                        } else {
                          L6: {
                            var15 = ((fka) this).field_k.a(param0);
                            var16 = ((fka) this).field_h.a(param0);
                            if (var13 == 0) {
                              var12 = ((fka) this).field_k.field_e + ((((fka) this).field_k.field_i - ((fka) this).field_k.field_e) * var16 >> 8);
                              break L6;
                            } else {
                              var12 = ((fka) this).field_k.field_e + ((((fka) this).field_k.field_i - ((fka) this).field_k.field_e) * var15 >> 8);
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
                            field_x[var14] = 0;
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
                    if (((fka) this).field_f <= 0) {
                      break L9;
                    } else {
                      if (((fka) this).field_m <= 0) {
                        break L9;
                      } else {
                        var11 = (int)((double)((fka) this).field_f * var3);
                        var12 = var11;
                        L10: while (true) {
                          if (var12 >= param0) {
                            break L9;
                          } else {
                            field_x[var12] = field_x[var12] + field_x[var12 - var11] * ((fka) this).field_m / 100;
                            var12++;
                            continue L10;
                          }
                        }
                      }
                    }
                  }
                  L11: {
                    L12: {
                      if (((fka) this).field_n.field_a[0] > 0) {
                        break L12;
                      } else {
                        if (((fka) this).field_n.field_a[1] <= 0) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    ((fka) this).field_d.a();
                    var11 = ((fka) this).field_d.a(param0 + 1);
                    var12 = ((fka) this).field_n.a(0, (float)var11 / 65536.0f);
                    var13 = ((fka) this).field_n.a(1, (float)var11 / 65536.0f);
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
                                  var12 = ((fka) this).field_n.a(0, (float)var11 / 65536.0f);
                                  var13 = ((fka) this).field_n.a(1, (float)var11 / 65536.0f);
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
                                              field_x[var14] = var16;
                                              var11 = ((fka) this).field_d.a(param0 + 1);
                                              var14++;
                                              continue L18;
                                            } else {
                                              var16 = var16 - (int)((long)field_x[var14 - 1 - var17] * (long)hva.field_g[1][var17] >> 16);
                                              var17++;
                                              continue L20;
                                            }
                                          }
                                        } else {
                                          var16 = var16 + (int)((long)field_x[var14 + var12 - 1 - var17] * (long)hva.field_g[0][var17] >> 16);
                                          var17++;
                                          continue L19;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                var16 = (int)((long)field_x[var14 + var12] * (long)hva.field_d >> 16);
                                var17 = 0;
                                L21: while (true) {
                                  if (var17 >= var12) {
                                    var17 = 0;
                                    L22: while (true) {
                                      if (var17 >= var13) {
                                        field_x[var14] = var16;
                                        var11 = ((fka) this).field_d.a(param0 + 1);
                                        var14++;
                                        continue L17;
                                      } else {
                                        var16 = var16 - (int)((long)field_x[var14 - 1 - var17] * (long)hva.field_g[1][var17] >> 16);
                                        var17++;
                                        continue L22;
                                      }
                                    }
                                  } else {
                                    var16 = var16 + (int)((long)field_x[var14 + var12 - 1 - var17] * (long)hva.field_g[0][var17] >> 16);
                                    var17++;
                                    continue L21;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var16 = (int)((long)field_x[var14 + var12] * (long)hva.field_d >> 16);
                          var17 = 0;
                          L23: while (true) {
                            if (var17 >= var12) {
                              var17 = 0;
                              L24: while (true) {
                                if (var17 >= var14) {
                                  field_x[var14] = var16;
                                  var11 = ((fka) this).field_d.a(param0 + 1);
                                  var14++;
                                  continue L14;
                                } else {
                                  var16 = var16 - (int)((long)field_x[var14 - 1 - var17] * (long)hva.field_g[1][var17] >> 16);
                                  var17++;
                                  continue L24;
                                }
                              }
                            } else {
                              var16 = var16 + (int)((long)field_x[var14 + var12 - 1 - var17] * (long)hva.field_g[0][var17] >> 16);
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
                      return field_x;
                    } else {
                      L26: {
                        if (field_x[var11] >= -32768) {
                          break L26;
                        } else {
                          field_x[var11] = -32768;
                          break L26;
                        }
                      }
                      if (field_x[var11] > 32767) {
                        field_x[var11] = 32767;
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
                    var12 = ((fka) this).field_g.a(param0);
                    var13 = ((fka) this).field_y.a(param0);
                    if (((fka) this).field_c == null) {
                      break L27;
                    } else {
                      var14 = ((fka) this).field_c.a(param0);
                      var15 = ((fka) this).field_l.a(param0);
                      var12 = var12 + (this.a(var7, var15, ((fka) this).field_c.field_a) >> 1);
                      var7 = var7 + ((var14 * var5 >> 16) + var6);
                      break L27;
                    }
                  }
                  L28: {
                    if (((fka) this).field_e == null) {
                      break L28;
                    } else {
                      var14 = ((fka) this).field_e.a(param0);
                      var15 = ((fka) this).field_p.a(param0);
                      var13 = var13 * ((this.a(var10, var15, ((fka) this).field_e.field_a) >> 1) + 32768) >> 15;
                      var10 = var10 + ((var14 * var8 >> 16) + var9);
                      break L28;
                    }
                  }
                  var14 = 0;
                  L29: while (true) {
                    if (var14 < 5) {
                      if (((fka) this).field_a[var14] != 0) {
                        var15 = var11 + field_s[var14];
                        if (var15 < param0) {
                          field_x[var15] = field_x[var15] + this.a(field_r[var14], var13 * field_j[var14] >> 15, ((fka) this).field_g.field_a);
                          field_r[var14] = field_r[var14] + ((var12 * field_o[var14] >> 16) + field_q[var14]);
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
              if (((fka) this).field_a[var11] != 0) {
                field_r[var11] = 0;
                field_s[var11] = (int)((double)((fka) this).field_t[var11] * var3);
                field_j[var11] = (((fka) this).field_a[var11] << 14) / 100;
                field_o[var11] = (int)((double)(((fka) this).field_g.field_i - ((fka) this).field_g.field_e) * 32.768 * Math.pow(1.0057929410678534, (double)((fka) this).field_u[var11]) / var3);
                field_q[var11] = (int)((double)((fka) this).field_g.field_e * 32.768 / var3);
                var11++;
                continue L2;
              } else {
                var11++;
                continue L2;
              }
            }
          }
        } else {
          return field_x;
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
            return field_b[param0 & 32767] * param1 >> 14;
        }
        if (param2 == 3) {
            return ((param0 & 32767) * param1 >> 14) - param1;
        }
        if (param2 == 4) {
            return field_w[param0 / 2607 & 32767] * param1;
        }
        return 0;
    }

    public static void a() {
        field_x = null;
        field_w = null;
        field_b = null;
        field_r = null;
        field_s = null;
        field_j = null;
        field_o = null;
        field_q = null;
    }

    fka() {
        ((fka) this).field_m = 100;
        ((fka) this).field_u = new int[]{0, 0, 0, 0, 0};
        ((fka) this).field_a = new int[]{0, 0, 0, 0, 0};
        ((fka) this).field_v = 500;
        ((fka) this).field_f = 0;
        ((fka) this).field_t = new int[]{0, 0, 0, 0, 0};
        ((fka) this).field_i = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var1 = 0;
        field_w = new int[32768];
        Random var0 = new Random(0L);
        for (var1 = 0; var1 < 32768; var1++) {
            field_w[var1] = (var0.nextInt() & 2) - 1;
        }
        field_b = new int[32768];
        for (var1 = 0; var1 < 32768; var1++) {
            field_b[var1] = (int)(Math.sin((double)var1 / 5215.1903) * 16384.0);
        }
        field_x = new int[220500];
        field_o = new int[5];
        field_r = new int[5];
        field_j = new int[5];
        field_q = new int[5];
        field_s = new int[5];
    }
}
