/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class sda {
    private kd field_y;
    private static int[] field_o;
    private bc field_e;
    private kd field_c;
    private kd field_u;
    private kd field_i;
    int field_m;
    private kd field_d;
    private int[] field_l;
    private static int[] field_p;
    int field_b;
    private kd field_x;
    private int[] field_h;
    private int field_w;
    private kd field_a;
    private int field_s;
    private int[] field_q;
    private kd field_r;
    private static int[] field_t;
    private static int[] field_k;
    private static int[] field_f;
    private static int[] field_j;
    private static int[] field_v;
    private static int[] field_g;
    private kd field_n;

    private final int a(int param0, int param1, int param2) {
        if (param2 == 1) {
            if ((param0 & 32767) < 16384) {
                return param1;
            }
            return -param1;
        }
        if (param2 == 2) {
            return field_o[param0 & 32767] * param1 >> 14;
        }
        if (param2 == 3) {
            return ((param0 & 32767) * param1 >> 14) - param1;
        }
        if (param2 == 4) {
            return field_p[param0 / 2607 & 32767] * param1;
        }
        return 0;
    }

    final void a(lu param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          ((sda) this).field_i = new kd();
          ((sda) this).field_i.b(param0);
          ((sda) this).field_d = new kd();
          ((sda) this).field_d.b(param0);
          var2 = param0.b(16711935);
          if (var2 == 0) {
            break L0;
          } else {
            param0.field_g = param0.field_g - 1;
            ((sda) this).field_x = new kd();
            ((sda) this).field_x.b(param0);
            ((sda) this).field_r = new kd();
            ((sda) this).field_r.b(param0);
            break L0;
          }
        }
        L1: {
          var2 = param0.b(16711935);
          if (var2 == 0) {
            break L1;
          } else {
            param0.field_g = param0.field_g - 1;
            ((sda) this).field_n = new kd();
            ((sda) this).field_n.b(param0);
            ((sda) this).field_y = new kd();
            ((sda) this).field_y.b(param0);
            break L1;
          }
        }
        L2: {
          var2 = param0.b(16711935);
          if (var2 == 0) {
            break L2;
          } else {
            param0.field_g = param0.field_g - 1;
            ((sda) this).field_u = new kd();
            ((sda) this).field_u.b(param0);
            ((sda) this).field_a = new kd();
            ((sda) this).field_a.b(param0);
            break L2;
          }
        }
        var3 = 0;
        L3: while (true) {
          L4: {
            if (var3 >= 10) {
              break L4;
            } else {
              var4 = param0.h(16711935);
              if (var4 != 0) {
                ((sda) this).field_q[var3] = var4;
                ((sda) this).field_h[var3] = param0.e(-4095);
                ((sda) this).field_l[var3] = param0.h(16711935);
                var3++;
                continue L3;
              } else {
                break L4;
              }
            }
          }
          ((sda) this).field_s = param0.h(16711935);
          ((sda) this).field_w = param0.h(16711935);
          ((sda) this).field_b = param0.e((byte) 45);
          ((sda) this).field_m = param0.e((byte) 93);
          ((sda) this).field_e = new bc();
          ((sda) this).field_c = new kd();
          ((sda) this).field_e.a(param0, ((sda) this).field_c);
          return;
        }
    }

    public static void a() {
        field_t = null;
        field_p = null;
        field_o = null;
        field_g = null;
        field_j = null;
        field_v = null;
        field_k = null;
        field_f = null;
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
        bl.a(field_t, 0, param0);
        if (param1 >= 10) {
          L0: {
            var3 = (double)param0 / ((double)param1 + 0.0);
            ((sda) this).field_i.a();
            ((sda) this).field_d.a();
            var5 = 0;
            var6 = 0;
            var7 = 0;
            if (((sda) this).field_x == null) {
              break L0;
            } else {
              ((sda) this).field_x.a();
              ((sda) this).field_r.a();
              var5 = (int)((double)(((sda) this).field_x.field_g - ((sda) this).field_x.field_b) * 32.768 / var3);
              var6 = (int)((double)((sda) this).field_x.field_b * 32.768 / var3);
              break L0;
            }
          }
          L1: {
            var8 = 0;
            var9 = 0;
            var10 = 0;
            if (((sda) this).field_n == null) {
              break L1;
            } else {
              ((sda) this).field_n.a();
              ((sda) this).field_y.a();
              var8 = (int)((double)(((sda) this).field_n.field_g - ((sda) this).field_n.field_b) * 32.768 / var3);
              var9 = (int)((double)((sda) this).field_n.field_b * 32.768 / var3);
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
                    if (((sda) this).field_u == null) {
                      break L4;
                    } else {
                      ((sda) this).field_u.a();
                      ((sda) this).field_a.a();
                      var11 = 0;
                      var12 = 0;
                      var13 = 1;
                      var14 = 0;
                      L5: while (true) {
                        if (var14 >= param0) {
                          break L4;
                        } else {
                          L6: {
                            var15 = ((sda) this).field_u.a(param0);
                            var16 = ((sda) this).field_a.a(param0);
                            if (var13 == 0) {
                              var12 = ((sda) this).field_u.field_b + ((((sda) this).field_u.field_g - ((sda) this).field_u.field_b) * var16 >> 8);
                              break L6;
                            } else {
                              var12 = ((sda) this).field_u.field_b + ((((sda) this).field_u.field_g - ((sda) this).field_u.field_b) * var15 >> 8);
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
                    if (((sda) this).field_s <= 0) {
                      break L9;
                    } else {
                      if (((sda) this).field_w <= 0) {
                        break L9;
                      } else {
                        var11 = (int)((double)((sda) this).field_s * var3);
                        var12 = var11;
                        L10: while (true) {
                          if (var12 >= param0) {
                            break L9;
                          } else {
                            field_t[var12] = field_t[var12] + field_t[var12 - var11] * ((sda) this).field_w / 100;
                            var12++;
                            continue L10;
                          }
                        }
                      }
                    }
                  }
                  L11: {
                    L12: {
                      if (((sda) this).field_e.field_d[0] > 0) {
                        break L12;
                      } else {
                        if (((sda) this).field_e.field_d[1] <= 0) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    ((sda) this).field_c.a();
                    var11 = ((sda) this).field_c.a(param0 + 1);
                    var12 = ((sda) this).field_e.a(0, (float)var11 / 65536.0f);
                    var13 = ((sda) this).field_e.a(1, (float)var11 / 65536.0f);
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
                                  var12 = ((sda) this).field_e.a(0, (float)var11 / 65536.0f);
                                  var13 = ((sda) this).field_e.a(1, (float)var11 / 65536.0f);
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
                                              var11 = ((sda) this).field_c.a(param0 + 1);
                                              var14++;
                                              continue L18;
                                            } else {
                                              var16 = var16 - (int)((long)field_t[var14 - 1 - var17] * (long)bc.field_e[1][var17] >> 16);
                                              var17++;
                                              continue L20;
                                            }
                                          }
                                        } else {
                                          var16 = var16 + (int)((long)field_t[var14 + var12 - 1 - var17] * (long)bc.field_e[0][var17] >> 16);
                                          var17++;
                                          continue L19;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                var16 = (int)((long)field_t[var14 + var12] * (long)bc.field_a >> 16);
                                var17 = 0;
                                L21: while (true) {
                                  if (var17 >= var12) {
                                    var17 = 0;
                                    L22: while (true) {
                                      if (var17 >= var13) {
                                        field_t[var14] = var16;
                                        var11 = ((sda) this).field_c.a(param0 + 1);
                                        var14++;
                                        continue L17;
                                      } else {
                                        var16 = var16 - (int)((long)field_t[var14 - 1 - var17] * (long)bc.field_e[1][var17] >> 16);
                                        var17++;
                                        continue L22;
                                      }
                                    }
                                  } else {
                                    var16 = var16 + (int)((long)field_t[var14 + var12 - 1 - var17] * (long)bc.field_e[0][var17] >> 16);
                                    var17++;
                                    continue L21;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var16 = (int)((long)field_t[var14 + var12] * (long)bc.field_a >> 16);
                          var17 = 0;
                          L23: while (true) {
                            if (var17 >= var12) {
                              var17 = 0;
                              L24: while (true) {
                                if (var17 >= var14) {
                                  field_t[var14] = var16;
                                  var11 = ((sda) this).field_c.a(param0 + 1);
                                  var14++;
                                  continue L14;
                                } else {
                                  var16 = var16 - (int)((long)field_t[var14 - 1 - var17] * (long)bc.field_e[1][var17] >> 16);
                                  var17++;
                                  continue L24;
                                }
                              }
                            } else {
                              var16 = var16 + (int)((long)field_t[var14 + var12 - 1 - var17] * (long)bc.field_e[0][var17] >> 16);
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
                    var12 = ((sda) this).field_i.a(param0);
                    var13 = ((sda) this).field_d.a(param0);
                    if (((sda) this).field_x == null) {
                      break L27;
                    } else {
                      var14 = ((sda) this).field_x.a(param0);
                      var15 = ((sda) this).field_r.a(param0);
                      var12 = var12 + (this.a(var7, var15, ((sda) this).field_x.field_k) >> 1);
                      var7 = var7 + ((var14 * var5 >> 16) + var6);
                      break L27;
                    }
                  }
                  L28: {
                    if (((sda) this).field_n == null) {
                      break L28;
                    } else {
                      var14 = ((sda) this).field_n.a(param0);
                      var15 = ((sda) this).field_y.a(param0);
                      var13 = var13 * ((this.a(var10, var15, ((sda) this).field_n.field_k) >> 1) + 32768) >> 15;
                      var10 = var10 + ((var14 * var8 >> 16) + var9);
                      break L28;
                    }
                  }
                  var14 = 0;
                  L29: while (true) {
                    if (var14 < 5) {
                      if (((sda) this).field_q[var14] != 0) {
                        var15 = var11 + field_j[var14];
                        if (var15 < param0) {
                          field_t[var15] = field_t[var15] + this.a(field_g[var14], var13 * field_v[var14] >> 15, ((sda) this).field_i.field_k);
                          field_g[var14] = field_g[var14] + ((var12 * field_k[var14] >> 16) + field_f[var14]);
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
              if (((sda) this).field_q[var11] != 0) {
                field_g[var11] = 0;
                field_j[var11] = (int)((double)((sda) this).field_l[var11] * var3);
                field_v[var11] = (((sda) this).field_q[var11] << 14) / 100;
                field_k[var11] = (int)((double)(((sda) this).field_i.field_g - ((sda) this).field_i.field_b) * 32.768 * Math.pow(1.0057929410678534, (double)((sda) this).field_h[var11]) / var3);
                field_f[var11] = (int)((double)((sda) this).field_i.field_b * 32.768 / var3);
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

    sda() {
        ((sda) this).field_b = 500;
        ((sda) this).field_m = 0;
        ((sda) this).field_l = new int[]{0, 0, 0, 0, 0};
        ((sda) this).field_w = 100;
        ((sda) this).field_s = 0;
        ((sda) this).field_h = new int[]{0, 0, 0, 0, 0};
        ((sda) this).field_q = new int[]{0, 0, 0, 0, 0};
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var1 = 0;
        field_p = new int[32768];
        Random var0 = new Random(0L);
        for (var1 = 0; var1 < 32768; var1++) {
            field_p[var1] = (var0.nextInt() & 2) - 1;
        }
        field_o = new int[32768];
        for (var1 = 0; var1 < 32768; var1++) {
            field_o[var1] = (int)(Math.sin((double)var1 / 5215.1903) * 16384.0);
        }
        field_t = new int[220500];
        field_f = new int[5];
        field_k = new int[5];
        field_v = new int[5];
        field_g = new int[5];
        field_j = new int[5];
    }
}
