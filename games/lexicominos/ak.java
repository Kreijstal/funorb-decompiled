/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ak {
    private static int[] field_g;
    private int[] field_n;
    private se field_d;
    private se field_j;
    private int field_f;
    private se field_a;
    private se field_l;
    private static int[] field_m;
    private int[] field_h;
    private se field_u;
    int field_o;
    private se field_c;
    private gi field_y;
    private static int[] field_i;
    private se field_q;
    int field_r;
    private se field_t;
    private se field_x;
    private int[] field_w;
    private static int[] field_b;
    private static int[] field_v;
    private static int[] field_s;
    private static int[] field_e;
    private int field_p;
    private static int[] field_k;

    private final int a(int param0, int param1, int param2) {
        if (param2 == 1) {
            if ((param0 & 32767) < 16384) {
                return param1;
            }
            return -param1;
        }
        if (param2 == 2) {
            return field_m[param0 & 32767] * param1 >> 14;
        }
        if (param2 == 3) {
            return ((param0 & 32767) * param1 >> 14) - param1;
        }
        if (param2 == 4) {
            return field_i[param0 / 2607 & 32767] * param1;
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
        o.a(field_g, 0, param0);
        if (param1 >= 10) {
          L0: {
            var3 = (double)param0 / ((double)param1 + 0.0);
            ((ak) this).field_l.a();
            ((ak) this).field_x.a();
            var5 = 0;
            var6 = 0;
            var7 = 0;
            if (((ak) this).field_c == null) {
              break L0;
            } else {
              ((ak) this).field_c.a();
              ((ak) this).field_t.a();
              var5 = (int)((double)(((ak) this).field_c.field_c - ((ak) this).field_c.field_e) * 32.768 / var3);
              var6 = (int)((double)((ak) this).field_c.field_e * 32.768 / var3);
              break L0;
            }
          }
          L1: {
            var8 = 0;
            var9 = 0;
            var10 = 0;
            if (((ak) this).field_a == null) {
              break L1;
            } else {
              ((ak) this).field_a.a();
              ((ak) this).field_u.a();
              var8 = (int)((double)(((ak) this).field_a.field_c - ((ak) this).field_a.field_e) * 32.768 / var3);
              var9 = (int)((double)((ak) this).field_a.field_e * 32.768 / var3);
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
                    if (((ak) this).field_j == null) {
                      break L4;
                    } else {
                      ((ak) this).field_j.a();
                      ((ak) this).field_d.a();
                      var11 = 0;
                      var12 = 0;
                      var13 = 1;
                      var14 = 0;
                      L5: while (true) {
                        if (var14 >= param0) {
                          break L4;
                        } else {
                          L6: {
                            var15 = ((ak) this).field_j.a(param0);
                            var16 = ((ak) this).field_d.a(param0);
                            if (var13 == 0) {
                              var12 = ((ak) this).field_j.field_e + ((((ak) this).field_j.field_c - ((ak) this).field_j.field_e) * var16 >> 8);
                              break L6;
                            } else {
                              var12 = ((ak) this).field_j.field_e + ((((ak) this).field_j.field_c - ((ak) this).field_j.field_e) * var15 >> 8);
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
                            field_g[var14] = 0;
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
                    if (((ak) this).field_p <= 0) {
                      break L9;
                    } else {
                      if (((ak) this).field_f <= 0) {
                        break L9;
                      } else {
                        var11 = (int)((double)((ak) this).field_p * var3);
                        var12 = var11;
                        L10: while (true) {
                          if (var12 >= param0) {
                            break L9;
                          } else {
                            field_g[var12] = field_g[var12] + field_g[var12 - var11] * ((ak) this).field_f / 100;
                            var12++;
                            continue L10;
                          }
                        }
                      }
                    }
                  }
                  L11: {
                    L12: {
                      if (((ak) this).field_y.field_c[0] > 0) {
                        break L12;
                      } else {
                        if (((ak) this).field_y.field_c[1] <= 0) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    ((ak) this).field_q.a();
                    var11 = ((ak) this).field_q.a(param0 + 1);
                    var12 = ((ak) this).field_y.a(0, (float)var11 / 65536.0f);
                    var13 = ((ak) this).field_y.a(1, (float)var11 / 65536.0f);
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
                                  var12 = ((ak) this).field_y.a(0, (float)var11 / 65536.0f);
                                  var13 = ((ak) this).field_y.a(1, (float)var11 / 65536.0f);
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
                                              field_g[var14] = var16;
                                              var11 = ((ak) this).field_q.a(param0 + 1);
                                              var14++;
                                              continue L18;
                                            } else {
                                              var16 = var16 - (int)((long)field_g[var14 - 1 - var17] * (long)gi.field_g[1][var17] >> 16);
                                              var17++;
                                              continue L20;
                                            }
                                          }
                                        } else {
                                          var16 = var16 + (int)((long)field_g[var14 + var12 - 1 - var17] * (long)gi.field_g[0][var17] >> 16);
                                          var17++;
                                          continue L19;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                var16 = (int)((long)field_g[var14 + var12] * (long)gi.field_a >> 16);
                                var17 = 0;
                                L21: while (true) {
                                  if (var17 >= var12) {
                                    var17 = 0;
                                    L22: while (true) {
                                      if (var17 >= var13) {
                                        field_g[var14] = var16;
                                        var11 = ((ak) this).field_q.a(param0 + 1);
                                        var14++;
                                        continue L17;
                                      } else {
                                        var16 = var16 - (int)((long)field_g[var14 - 1 - var17] * (long)gi.field_g[1][var17] >> 16);
                                        var17++;
                                        continue L22;
                                      }
                                    }
                                  } else {
                                    var16 = var16 + (int)((long)field_g[var14 + var12 - 1 - var17] * (long)gi.field_g[0][var17] >> 16);
                                    var17++;
                                    continue L21;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var16 = (int)((long)field_g[var14 + var12] * (long)gi.field_a >> 16);
                          var17 = 0;
                          L23: while (true) {
                            if (var17 >= var12) {
                              var17 = 0;
                              L24: while (true) {
                                if (var17 >= var14) {
                                  field_g[var14] = var16;
                                  var11 = ((ak) this).field_q.a(param0 + 1);
                                  var14++;
                                  continue L14;
                                } else {
                                  var16 = var16 - (int)((long)field_g[var14 - 1 - var17] * (long)gi.field_g[1][var17] >> 16);
                                  var17++;
                                  continue L24;
                                }
                              }
                            } else {
                              var16 = var16 + (int)((long)field_g[var14 + var12 - 1 - var17] * (long)gi.field_g[0][var17] >> 16);
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
                      return field_g;
                    } else {
                      L26: {
                        if (field_g[var11] >= -32768) {
                          break L26;
                        } else {
                          field_g[var11] = -32768;
                          break L26;
                        }
                      }
                      if (field_g[var11] > 32767) {
                        field_g[var11] = 32767;
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
                    var12 = ((ak) this).field_l.a(param0);
                    var13 = ((ak) this).field_x.a(param0);
                    if (((ak) this).field_c == null) {
                      break L27;
                    } else {
                      var14 = ((ak) this).field_c.a(param0);
                      var15 = ((ak) this).field_t.a(param0);
                      var12 = var12 + (this.a(var7, var15, ((ak) this).field_c.field_a) >> 1);
                      var7 = var7 + ((var14 * var5 >> 16) + var6);
                      break L27;
                    }
                  }
                  L28: {
                    if (((ak) this).field_a == null) {
                      break L28;
                    } else {
                      var14 = ((ak) this).field_a.a(param0);
                      var15 = ((ak) this).field_u.a(param0);
                      var13 = var13 * ((this.a(var10, var15, ((ak) this).field_a.field_a) >> 1) + 32768) >> 15;
                      var10 = var10 + ((var14 * var8 >> 16) + var9);
                      break L28;
                    }
                  }
                  var14 = 0;
                  L29: while (true) {
                    if (var14 < 5) {
                      if (((ak) this).field_w[var14] != 0) {
                        var15 = var11 + field_k[var14];
                        if (var15 < param0) {
                          field_g[var15] = field_g[var15] + this.a(field_e[var14], var13 * field_v[var14] >> 15, ((ak) this).field_l.field_a);
                          field_e[var14] = field_e[var14] + ((var12 * field_s[var14] >> 16) + field_b[var14]);
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
              if (((ak) this).field_w[var11] != 0) {
                field_e[var11] = 0;
                field_k[var11] = (int)((double)((ak) this).field_n[var11] * var3);
                field_v[var11] = (((ak) this).field_w[var11] << 14) / 100;
                field_s[var11] = (int)((double)(((ak) this).field_l.field_c - ((ak) this).field_l.field_e) * 32.768 * Math.pow(1.0057929410678534, (double)((ak) this).field_h[var11]) / var3);
                field_b[var11] = (int)((double)((ak) this).field_l.field_e * 32.768 / var3);
                var11++;
                continue L2;
              } else {
                var11++;
                continue L2;
              }
            }
          }
        } else {
          return field_g;
        }
    }

    final void a(wf param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          ((ak) this).field_l = new se();
          ((ak) this).field_l.b(param0);
          ((ak) this).field_x = new se();
          ((ak) this).field_x.b(param0);
          var2 = param0.d(true);
          if (var2 == 0) {
            break L0;
          } else {
            param0.field_h = param0.field_h - 1;
            ((ak) this).field_c = new se();
            ((ak) this).field_c.b(param0);
            ((ak) this).field_t = new se();
            ((ak) this).field_t.b(param0);
            break L0;
          }
        }
        L1: {
          var2 = param0.d(true);
          if (var2 == 0) {
            break L1;
          } else {
            param0.field_h = param0.field_h - 1;
            ((ak) this).field_a = new se();
            ((ak) this).field_a.b(param0);
            ((ak) this).field_u = new se();
            ((ak) this).field_u.b(param0);
            break L1;
          }
        }
        L2: {
          var2 = param0.d(true);
          if (var2 == 0) {
            break L2;
          } else {
            param0.field_h = param0.field_h - 1;
            ((ak) this).field_j = new se();
            ((ak) this).field_j.b(param0);
            ((ak) this).field_d = new se();
            ((ak) this).field_d.b(param0);
            break L2;
          }
        }
        var3 = 0;
        L3: while (true) {
          L4: {
            if (var3 >= 10) {
              break L4;
            } else {
              var4 = param0.h((byte) -89);
              if (var4 != 0) {
                ((ak) this).field_w[var3] = var4;
                ((ak) this).field_h[var3] = param0.c((byte) -10);
                ((ak) this).field_n[var3] = param0.h((byte) -112);
                var3++;
                continue L3;
              } else {
                break L4;
              }
            }
          }
          ((ak) this).field_p = param0.h((byte) -95);
          ((ak) this).field_f = param0.h((byte) -127);
          ((ak) this).field_r = param0.b(-1698573656);
          ((ak) this).field_o = param0.b(-1698573656);
          ((ak) this).field_y = new gi();
          ((ak) this).field_q = new se();
          ((ak) this).field_y.a(param0, ((ak) this).field_q);
          return;
        }
    }

    public static void a() {
        field_g = null;
        field_i = null;
        field_m = null;
        field_e = null;
        field_k = null;
        field_v = null;
        field_s = null;
        field_b = null;
    }

    ak() {
        ((ak) this).field_f = 100;
        ((ak) this).field_h = new int[]{0, 0, 0, 0, 0};
        ((ak) this).field_r = 500;
        ((ak) this).field_o = 0;
        ((ak) this).field_n = new int[]{0, 0, 0, 0, 0};
        ((ak) this).field_p = 0;
        ((ak) this).field_w = new int[]{0, 0, 0, 0, 0};
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var1 = 0;
        field_i = new int[32768];
        Random var0 = new Random(0L);
        for (var1 = 0; var1 < 32768; var1++) {
            field_i[var1] = (var0.nextInt() & 2) - 1;
        }
        field_m = new int[32768];
        for (var1 = 0; var1 < 32768; var1++) {
            field_m[var1] = (int)(Math.sin((double)var1 / 5215.1903) * 16384.0);
        }
        field_g = new int[220500];
        field_b = new int[5];
        field_s = new int[5];
        field_v = new int[5];
        field_e = new int[5];
        field_k = new int[5];
    }
}
