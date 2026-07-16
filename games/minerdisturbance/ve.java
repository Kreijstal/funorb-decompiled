/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ve {
    private static int[] field_n;
    private int field_i;
    private cj field_e;
    private cj field_m;
    private int[] field_q;
    private cj field_f;
    private static int[] field_u;
    private cj field_c;
    private la field_s;
    private int[] field_v;
    private int[] field_l;
    int field_d;
    private cj field_k;
    int field_h;
    private cj field_y;
    private static int[] field_o;
    private cj field_t;
    private int field_g;
    private cj field_w;
    private cj field_a;
    private static int[] field_p;
    private static int[] field_j;
    private static int[] field_b;
    private static int[] field_r;
    private static int[] field_x;

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
        ai.a(field_u, 0, param0);
        if (param1 >= 10) {
          L0: {
            var3 = (double)param0 / ((double)param1 + 0.0);
            ((ve) this).field_k.a();
            ((ve) this).field_a.a();
            var5 = 0;
            var6 = 0;
            var7 = 0;
            if (((ve) this).field_t == null) {
              break L0;
            } else {
              ((ve) this).field_t.a();
              ((ve) this).field_m.a();
              var5 = (int)((double)(((ve) this).field_t.field_b - ((ve) this).field_t.field_f) * 32.768 / var3);
              var6 = (int)((double)((ve) this).field_t.field_f * 32.768 / var3);
              break L0;
            }
          }
          L1: {
            var8 = 0;
            var9 = 0;
            var10 = 0;
            if (((ve) this).field_f == null) {
              break L1;
            } else {
              ((ve) this).field_f.a();
              ((ve) this).field_e.a();
              var8 = (int)((double)(((ve) this).field_f.field_b - ((ve) this).field_f.field_f) * 32.768 / var3);
              var9 = (int)((double)((ve) this).field_f.field_f * 32.768 / var3);
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
                    if (((ve) this).field_c == null) {
                      break L4;
                    } else {
                      ((ve) this).field_c.a();
                      ((ve) this).field_w.a();
                      var11 = 0;
                      var12 = 0;
                      var13 = 1;
                      var14 = 0;
                      L5: while (true) {
                        if (var14 >= param0) {
                          break L4;
                        } else {
                          L6: {
                            var15 = ((ve) this).field_c.a(param0);
                            var16 = ((ve) this).field_w.a(param0);
                            if (var13 == 0) {
                              var12 = ((ve) this).field_c.field_f + ((((ve) this).field_c.field_b - ((ve) this).field_c.field_f) * var16 >> 8);
                              break L6;
                            } else {
                              var12 = ((ve) this).field_c.field_f + ((((ve) this).field_c.field_b - ((ve) this).field_c.field_f) * var15 >> 8);
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
                    if (((ve) this).field_g <= 0) {
                      break L9;
                    } else {
                      if (((ve) this).field_i <= 0) {
                        break L9;
                      } else {
                        var11 = (int)((double)((ve) this).field_g * var3);
                        var12 = var11;
                        L10: while (true) {
                          if (var12 >= param0) {
                            break L9;
                          } else {
                            field_u[var12] = field_u[var12] + field_u[var12 - var11] * ((ve) this).field_i / 100;
                            var12++;
                            continue L10;
                          }
                        }
                      }
                    }
                  }
                  L11: {
                    L12: {
                      if (((ve) this).field_s.field_g[0] > 0) {
                        break L12;
                      } else {
                        if (((ve) this).field_s.field_g[1] <= 0) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    ((ve) this).field_y.a();
                    var11 = ((ve) this).field_y.a(param0 + 1);
                    var12 = ((ve) this).field_s.a(0, (float)var11 / 65536.0f);
                    var13 = ((ve) this).field_s.a(1, (float)var11 / 65536.0f);
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
                                  var12 = ((ve) this).field_s.a(0, (float)var11 / 65536.0f);
                                  var13 = ((ve) this).field_s.a(1, (float)var11 / 65536.0f);
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
                                              var11 = ((ve) this).field_y.a(param0 + 1);
                                              var14++;
                                              continue L18;
                                            } else {
                                              var16 = var16 - (int)((long)field_u[var14 - 1 - var17] * (long)la.field_e[1][var17] >> 16);
                                              var17++;
                                              continue L20;
                                            }
                                          }
                                        } else {
                                          var16 = var16 + (int)((long)field_u[var14 + var12 - 1 - var17] * (long)la.field_e[0][var17] >> 16);
                                          var17++;
                                          continue L19;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                var16 = (int)((long)field_u[var14 + var12] * (long)la.field_b >> 16);
                                var17 = 0;
                                L21: while (true) {
                                  if (var17 >= var12) {
                                    var17 = 0;
                                    L22: while (true) {
                                      if (var17 >= var13) {
                                        field_u[var14] = var16;
                                        var11 = ((ve) this).field_y.a(param0 + 1);
                                        var14++;
                                        continue L17;
                                      } else {
                                        var16 = var16 - (int)((long)field_u[var14 - 1 - var17] * (long)la.field_e[1][var17] >> 16);
                                        var17++;
                                        continue L22;
                                      }
                                    }
                                  } else {
                                    var16 = var16 + (int)((long)field_u[var14 + var12 - 1 - var17] * (long)la.field_e[0][var17] >> 16);
                                    var17++;
                                    continue L21;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var16 = (int)((long)field_u[var14 + var12] * (long)la.field_b >> 16);
                          var17 = 0;
                          L23: while (true) {
                            if (var17 >= var12) {
                              var17 = 0;
                              L24: while (true) {
                                if (var17 >= var14) {
                                  field_u[var14] = var16;
                                  var11 = ((ve) this).field_y.a(param0 + 1);
                                  var14++;
                                  continue L14;
                                } else {
                                  var16 = var16 - (int)((long)field_u[var14 - 1 - var17] * (long)la.field_e[1][var17] >> 16);
                                  var17++;
                                  continue L24;
                                }
                              }
                            } else {
                              var16 = var16 + (int)((long)field_u[var14 + var12 - 1 - var17] * (long)la.field_e[0][var17] >> 16);
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
                    var12 = ((ve) this).field_k.a(param0);
                    var13 = ((ve) this).field_a.a(param0);
                    if (((ve) this).field_t == null) {
                      break L27;
                    } else {
                      var14 = ((ve) this).field_t.a(param0);
                      var15 = ((ve) this).field_m.a(param0);
                      var12 = var12 + (this.a(var7, var15, ((ve) this).field_t.field_e) >> 1);
                      var7 = var7 + ((var14 * var5 >> 16) + var6);
                      break L27;
                    }
                  }
                  L28: {
                    if (((ve) this).field_f == null) {
                      break L28;
                    } else {
                      var14 = ((ve) this).field_f.a(param0);
                      var15 = ((ve) this).field_e.a(param0);
                      var13 = var13 * ((this.a(var10, var15, ((ve) this).field_f.field_e) >> 1) + 32768) >> 15;
                      var10 = var10 + ((var14 * var8 >> 16) + var9);
                      break L28;
                    }
                  }
                  var14 = 0;
                  L29: while (true) {
                    if (var14 < 5) {
                      if (((ve) this).field_q[var14] != 0) {
                        var15 = var11 + field_r[var14];
                        if (var15 < param0) {
                          field_u[var15] = field_u[var15] + this.a(field_p[var14], var13 * field_x[var14] >> 15, ((ve) this).field_k.field_e);
                          field_p[var14] = field_p[var14] + ((var12 * field_j[var14] >> 16) + field_b[var14]);
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
              if (((ve) this).field_q[var11] != 0) {
                field_p[var11] = 0;
                field_r[var11] = (int)((double)((ve) this).field_v[var11] * var3);
                field_x[var11] = (((ve) this).field_q[var11] << 14) / 100;
                field_j[var11] = (int)((double)(((ve) this).field_k.field_b - ((ve) this).field_k.field_f) * 32.768 * Math.pow(1.0057929410678534, (double)((ve) this).field_l[var11]) / var3);
                field_b[var11] = (int)((double)((ve) this).field_k.field_f * 32.768 / var3);
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
            return field_n[param0 / 2607 & 32767] * param1;
        }
        return 0;
    }

    public static void a() {
        field_u = null;
        field_n = null;
        field_o = null;
        field_p = null;
        field_r = null;
        field_x = null;
        field_j = null;
        field_b = null;
    }

    final void a(sb param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          ((ve) this).field_k = new cj();
          ((ve) this).field_k.b(param0);
          ((ve) this).field_a = new cj();
          ((ve) this).field_a.b(param0);
          var2 = param0.d((byte) -54);
          if (var2 == 0) {
            break L0;
          } else {
            param0.field_o = param0.field_o - 1;
            ((ve) this).field_t = new cj();
            ((ve) this).field_t.b(param0);
            ((ve) this).field_m = new cj();
            ((ve) this).field_m.b(param0);
            break L0;
          }
        }
        L1: {
          var2 = param0.d((byte) -54);
          if (var2 == 0) {
            break L1;
          } else {
            param0.field_o = param0.field_o - 1;
            ((ve) this).field_f = new cj();
            ((ve) this).field_f.b(param0);
            ((ve) this).field_e = new cj();
            ((ve) this).field_e.b(param0);
            break L1;
          }
        }
        L2: {
          var2 = param0.d((byte) -54);
          if (var2 == 0) {
            break L2;
          } else {
            param0.field_o = param0.field_o - 1;
            ((ve) this).field_c = new cj();
            ((ve) this).field_c.b(param0);
            ((ve) this).field_w = new cj();
            ((ve) this).field_w.b(param0);
            break L2;
          }
        }
        var3 = 0;
        L3: while (true) {
          L4: {
            if (var3 >= 10) {
              break L4;
            } else {
              var4 = param0.b(true);
              if (var4 != 0) {
                ((ve) this).field_q[var3] = var4;
                ((ve) this).field_l[var3] = param0.c((byte) 96);
                ((ve) this).field_v[var3] = param0.b(true);
                var3++;
                continue L3;
              } else {
                break L4;
              }
            }
          }
          ((ve) this).field_g = param0.b(true);
          ((ve) this).field_i = param0.b(true);
          ((ve) this).field_h = param0.e(-66);
          ((ve) this).field_d = param0.e(-67);
          ((ve) this).field_s = new la();
          ((ve) this).field_y = new cj();
          ((ve) this).field_s.a(param0, ((ve) this).field_y);
          return;
        }
    }

    ve() {
        ((ve) this).field_i = 100;
        ((ve) this).field_h = 500;
        ((ve) this).field_l = new int[]{0, 0, 0, 0, 0};
        ((ve) this).field_v = new int[]{0, 0, 0, 0, 0};
        ((ve) this).field_d = 0;
        ((ve) this).field_q = new int[]{0, 0, 0, 0, 0};
        ((ve) this).field_g = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var1 = 0;
        field_n = new int[32768];
        Random var0 = new Random(0L);
        for (var1 = 0; var1 < 32768; var1++) {
            field_n[var1] = (var0.nextInt() & 2) - 1;
        }
        field_o = new int[32768];
        for (var1 = 0; var1 < 32768; var1++) {
            field_o[var1] = (int)(Math.sin((double)var1 / 5215.1903) * 16384.0);
        }
        field_u = new int[220500];
        field_p = new int[5];
        field_j = new int[5];
        field_b = new int[5];
        field_r = new int[5];
        field_x = new int[5];
    }
}
