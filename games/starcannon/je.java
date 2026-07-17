/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class je {
    private mk field_x;
    private static int[] field_u;
    private mk field_n;
    private h field_f;
    private int[] field_d;
    private static int[] field_w;
    private int[] field_o;
    int field_s;
    int field_i;
    private int field_q;
    private int[] field_c;
    private mk field_l;
    private mk field_j;
    private mk field_b;
    private int field_p;
    private static int[] field_t;
    private mk field_v;
    private mk field_h;
    private mk field_y;
    private mk field_e;
    private static int[] field_a;
    private static int[] field_r;
    private static int[] field_g;
    private static int[] field_m;
    private static int[] field_k;

    public static void a() {
        field_t = null;
        field_u = null;
        field_w = null;
        field_r = null;
        field_g = null;
        field_m = null;
        field_a = null;
        field_k = null;
    }

    final void a(rb param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          ((je) this).field_b = new mk();
          ((je) this).field_b.a(param0);
          ((je) this).field_e = new mk();
          ((je) this).field_e.a(param0);
          var2 = param0.j(7909);
          if (var2 == 0) {
            break L0;
          } else {
            param0.field_g = param0.field_g - 1;
            ((je) this).field_l = new mk();
            ((je) this).field_l.a(param0);
            ((je) this).field_h = new mk();
            ((je) this).field_h.a(param0);
            break L0;
          }
        }
        L1: {
          var2 = param0.j(7909);
          if (var2 == 0) {
            break L1;
          } else {
            param0.field_g = param0.field_g - 1;
            ((je) this).field_y = new mk();
            ((je) this).field_y.a(param0);
            ((je) this).field_v = new mk();
            ((je) this).field_v.a(param0);
            break L1;
          }
        }
        L2: {
          var2 = param0.j(7909);
          if (var2 == 0) {
            break L2;
          } else {
            param0.field_g = param0.field_g - 1;
            ((je) this).field_n = new mk();
            ((je) this).field_n.a(param0);
            ((je) this).field_x = new mk();
            ((je) this).field_x.a(param0);
            break L2;
          }
        }
        var3 = 0;
        L3: while (true) {
          L4: {
            if (var3 >= 10) {
              break L4;
            } else {
              var4 = param0.d(128);
              if (var4 != 0) {
                ((je) this).field_d[var3] = var4;
                ((je) this).field_o[var3] = param0.d((byte) 105);
                ((je) this).field_c[var3] = param0.d(128);
                var3++;
                continue L3;
              } else {
                break L4;
              }
            }
          }
          ((je) this).field_q = param0.d(128);
          ((je) this).field_p = param0.d(128);
          ((je) this).field_s = param0.i(-1174051992);
          ((je) this).field_i = param0.i(-1174051992);
          ((je) this).field_f = new h();
          ((je) this).field_j = new mk();
          ((je) this).field_f.a(param0, ((je) this).field_j);
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
            return field_w[param0 & 32767] * param1 >> 14;
        }
        if (param2 == 3) {
            return ((param0 & 32767) * param1 >> 14) - param1;
        }
        if (param2 == 4) {
            return field_u[param0 / 2607 & 32767] * param1;
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
        ug.a(field_t, 0, param0);
        if (param1 >= 10) {
          L0: {
            var3 = (double)param0 / ((double)param1 + 0.0);
            ((je) this).field_b.a();
            ((je) this).field_e.a();
            var5 = 0;
            var6 = 0;
            var7 = 0;
            if (((je) this).field_l == null) {
              break L0;
            } else {
              ((je) this).field_l.a();
              ((je) this).field_h.a();
              var5 = (int)((double)(((je) this).field_l.field_b - ((je) this).field_l.field_g) * 32.768 / var3);
              var6 = (int)((double)((je) this).field_l.field_g * 32.768 / var3);
              break L0;
            }
          }
          L1: {
            var8 = 0;
            var9 = 0;
            var10 = 0;
            if (((je) this).field_y == null) {
              break L1;
            } else {
              ((je) this).field_y.a();
              ((je) this).field_v.a();
              var8 = (int)((double)(((je) this).field_y.field_b - ((je) this).field_y.field_g) * 32.768 / var3);
              var9 = (int)((double)((je) this).field_y.field_g * 32.768 / var3);
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
                    if (((je) this).field_n == null) {
                      break L4;
                    } else {
                      ((je) this).field_n.a();
                      ((je) this).field_x.a();
                      var11 = 0;
                      var12 = 0;
                      var13 = 1;
                      var14 = 0;
                      L5: while (true) {
                        if (var14 >= param0) {
                          break L4;
                        } else {
                          L6: {
                            var15 = ((je) this).field_n.a(param0);
                            var16 = ((je) this).field_x.a(param0);
                            if (var13 == 0) {
                              var12 = ((je) this).field_n.field_g + ((((je) this).field_n.field_b - ((je) this).field_n.field_g) * var16 >> 8);
                              break L6;
                            } else {
                              var12 = ((je) this).field_n.field_g + ((((je) this).field_n.field_b - ((je) this).field_n.field_g) * var15 >> 8);
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
                    if (((je) this).field_q <= 0) {
                      break L9;
                    } else {
                      if (((je) this).field_p <= 0) {
                        break L9;
                      } else {
                        var11 = (int)((double)((je) this).field_q * var3);
                        var12 = var11;
                        L10: while (true) {
                          if (var12 >= param0) {
                            break L9;
                          } else {
                            field_t[var12] = field_t[var12] + field_t[var12 - var11] * ((je) this).field_p / 100;
                            var12++;
                            continue L10;
                          }
                        }
                      }
                    }
                  }
                  L11: {
                    L12: {
                      if (((je) this).field_f.field_d[0] > 0) {
                        break L12;
                      } else {
                        if (((je) this).field_f.field_d[1] <= 0) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    ((je) this).field_j.a();
                    var11 = ((je) this).field_j.a(param0 + 1);
                    var12 = ((je) this).field_f.a(0, (float)var11 / 65536.0f);
                    var13 = ((je) this).field_f.a(1, (float)var11 / 65536.0f);
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
                                  var12 = ((je) this).field_f.a(0, (float)var11 / 65536.0f);
                                  var13 = ((je) this).field_f.a(1, (float)var11 / 65536.0f);
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
                                              var11 = ((je) this).field_j.a(param0 + 1);
                                              var14++;
                                              continue L18;
                                            } else {
                                              var16 = var16 - (int)((long)field_t[var14 - 1 - var17] * (long)h.field_f[1][var17] >> 16);
                                              var17++;
                                              continue L20;
                                            }
                                          }
                                        } else {
                                          var16 = var16 + (int)((long)field_t[var14 + var12 - 1 - var17] * (long)h.field_f[0][var17] >> 16);
                                          var17++;
                                          continue L19;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                var16 = (int)((long)field_t[var14 + var12] * (long)h.field_b >> 16);
                                var17 = 0;
                                L21: while (true) {
                                  if (var17 >= var12) {
                                    var17 = 0;
                                    L22: while (true) {
                                      if (var17 >= var13) {
                                        field_t[var14] = var16;
                                        var11 = ((je) this).field_j.a(param0 + 1);
                                        var14++;
                                        continue L17;
                                      } else {
                                        var16 = var16 - (int)((long)field_t[var14 - 1 - var17] * (long)h.field_f[1][var17] >> 16);
                                        var17++;
                                        continue L22;
                                      }
                                    }
                                  } else {
                                    var16 = var16 + (int)((long)field_t[var14 + var12 - 1 - var17] * (long)h.field_f[0][var17] >> 16);
                                    var17++;
                                    continue L21;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var16 = (int)((long)field_t[var14 + var12] * (long)h.field_b >> 16);
                          var17 = 0;
                          L23: while (true) {
                            if (var17 >= var12) {
                              var17 = 0;
                              L24: while (true) {
                                if (var17 >= var14) {
                                  field_t[var14] = var16;
                                  var11 = ((je) this).field_j.a(param0 + 1);
                                  var14++;
                                  continue L14;
                                } else {
                                  var16 = var16 - (int)((long)field_t[var14 - 1 - var17] * (long)h.field_f[1][var17] >> 16);
                                  var17++;
                                  continue L24;
                                }
                              }
                            } else {
                              var16 = var16 + (int)((long)field_t[var14 + var12 - 1 - var17] * (long)h.field_f[0][var17] >> 16);
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
                    var12 = ((je) this).field_b.a(param0);
                    var13 = ((je) this).field_e.a(param0);
                    if (((je) this).field_l == null) {
                      break L27;
                    } else {
                      var14 = ((je) this).field_l.a(param0);
                      var15 = ((je) this).field_h.a(param0);
                      var12 = var12 + (this.a(var7, var15, ((je) this).field_l.field_i) >> 1);
                      var7 = var7 + ((var14 * var5 >> 16) + var6);
                      break L27;
                    }
                  }
                  L28: {
                    if (((je) this).field_y == null) {
                      break L28;
                    } else {
                      var14 = ((je) this).field_y.a(param0);
                      var15 = ((je) this).field_v.a(param0);
                      var13 = var13 * ((this.a(var10, var15, ((je) this).field_y.field_i) >> 1) + 32768) >> 15;
                      var10 = var10 + ((var14 * var8 >> 16) + var9);
                      break L28;
                    }
                  }
                  var14 = 0;
                  L29: while (true) {
                    if (var14 < 5) {
                      if (((je) this).field_d[var14] != 0) {
                        var15 = var11 + field_g[var14];
                        if (var15 < param0) {
                          field_t[var15] = field_t[var15] + this.a(field_r[var14], var13 * field_m[var14] >> 15, ((je) this).field_b.field_i);
                          field_r[var14] = field_r[var14] + ((var12 * field_a[var14] >> 16) + field_k[var14]);
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
              if (((je) this).field_d[var11] != 0) {
                field_r[var11] = 0;
                field_g[var11] = (int)((double)((je) this).field_c[var11] * var3);
                field_m[var11] = (((je) this).field_d[var11] << 14) / 100;
                field_a[var11] = (int)((double)(((je) this).field_b.field_b - ((je) this).field_b.field_g) * 32.768 * Math.pow(1.0057929410678534, (double)((je) this).field_o[var11]) / var3);
                field_k[var11] = (int)((double)((je) this).field_b.field_g * 32.768 / var3);
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

    je() {
        ((je) this).field_o = new int[]{0, 0, 0, 0, 0};
        ((je) this).field_q = 0;
        ((je) this).field_i = 0;
        ((je) this).field_s = 500;
        ((je) this).field_c = new int[]{0, 0, 0, 0, 0};
        ((je) this).field_d = new int[]{0, 0, 0, 0, 0};
        ((je) this).field_p = 100;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var1 = 0;
        field_u = new int[32768];
        Random var0 = new Random(0L);
        for (var1 = 0; var1 < 32768; var1++) {
            field_u[var1] = (var0.nextInt() & 2) - 1;
        }
        field_w = new int[32768];
        for (var1 = 0; var1 < 32768; var1++) {
            field_w[var1] = (int)(Math.sin((double)var1 / 5215.1903) * 16384.0);
        }
        field_t = new int[220500];
        field_a = new int[5];
        field_r = new int[5];
        field_m = new int[5];
        field_k = new int[5];
        field_g = new int[5];
    }
}
