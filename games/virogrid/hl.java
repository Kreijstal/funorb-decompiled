/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hl {
    private wj field_r;
    private int[] field_b;
    private wj field_i;
    private static int[] field_l;
    private wj field_y;
    private bh field_k;
    private wj field_s;
    private int field_u;
    int field_q;
    private int[] field_m;
    private wj field_x;
    private wj field_a;
    private wj field_h;
    private int[] field_p;
    private static int[] field_c;
    private wj field_f;
    int field_g;
    private static int[] field_w;
    private wj field_o;
    private int field_t;
    private static int[] field_j;
    private static int[] field_v;
    private static int[] field_d;
    private static int[] field_n;
    private static int[] field_e;

    private final int a(int param0, int param1, int param2) {
        if (param2 == 1) {
            if ((param0 & 32767) < 16384) {
                return param1;
            }
            return -param1;
        }
        if (param2 == 2) {
            return field_c[param0 & 32767] * param1 >> 14;
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
        field_l = null;
        field_w = null;
        field_c = null;
        field_n = null;
        field_v = null;
        field_d = null;
        field_j = null;
        field_e = null;
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
        ek.a(field_l, 0, param0);
        if (param1 >= 10) {
          L0: {
            var3 = (double)param0 / ((double)param1 + 0.0);
            ((hl) this).field_o.a();
            ((hl) this).field_a.a();
            var5 = 0;
            var6 = 0;
            var7 = 0;
            if (((hl) this).field_h == null) {
              break L0;
            } else {
              ((hl) this).field_h.a();
              ((hl) this).field_i.a();
              var5 = (int)((double)(((hl) this).field_h.field_f - ((hl) this).field_h.field_j) * 32.768 / var3);
              var6 = (int)((double)((hl) this).field_h.field_j * 32.768 / var3);
              break L0;
            }
          }
          L1: {
            var8 = 0;
            var9 = 0;
            var10 = 0;
            if (((hl) this).field_y == null) {
              break L1;
            } else {
              ((hl) this).field_y.a();
              ((hl) this).field_r.a();
              var8 = (int)((double)(((hl) this).field_y.field_f - ((hl) this).field_y.field_j) * 32.768 / var3);
              var9 = (int)((double)((hl) this).field_y.field_j * 32.768 / var3);
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
                    if (((hl) this).field_x == null) {
                      break L4;
                    } else {
                      ((hl) this).field_x.a();
                      ((hl) this).field_f.a();
                      var11 = 0;
                      var12 = 0;
                      var13 = 1;
                      var14 = 0;
                      L5: while (true) {
                        if (var14 >= param0) {
                          break L4;
                        } else {
                          L6: {
                            var15 = ((hl) this).field_x.a(param0);
                            var16 = ((hl) this).field_f.a(param0);
                            if (var13 == 0) {
                              var12 = ((hl) this).field_x.field_j + ((((hl) this).field_x.field_f - ((hl) this).field_x.field_j) * var16 >> 8);
                              break L6;
                            } else {
                              var12 = ((hl) this).field_x.field_j + ((((hl) this).field_x.field_f - ((hl) this).field_x.field_j) * var15 >> 8);
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
                            field_l[var14] = 0;
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
                    if (((hl) this).field_u <= 0) {
                      break L9;
                    } else {
                      if (((hl) this).field_t <= 0) {
                        break L9;
                      } else {
                        var11 = (int)((double)((hl) this).field_u * var3);
                        var12 = var11;
                        L10: while (true) {
                          if (var12 >= param0) {
                            break L9;
                          } else {
                            field_l[var12] = field_l[var12] + field_l[var12 - var11] * ((hl) this).field_t / 100;
                            var12++;
                            continue L10;
                          }
                        }
                      }
                    }
                  }
                  L11: {
                    L12: {
                      if (((hl) this).field_k.field_b[0] > 0) {
                        break L12;
                      } else {
                        if (((hl) this).field_k.field_b[1] <= 0) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    ((hl) this).field_s.a();
                    var11 = ((hl) this).field_s.a(param0 + 1);
                    var12 = ((hl) this).field_k.a(0, (float)var11 / 65536.0f);
                    var13 = ((hl) this).field_k.a(1, (float)var11 / 65536.0f);
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
                                  var12 = ((hl) this).field_k.a(0, (float)var11 / 65536.0f);
                                  var13 = ((hl) this).field_k.a(1, (float)var11 / 65536.0f);
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
                                              field_l[var14] = var16;
                                              var11 = ((hl) this).field_s.a(param0 + 1);
                                              var14++;
                                              continue L18;
                                            } else {
                                              var16 = var16 - (int)((long)field_l[var14 - 1 - var17] * (long)bh.field_c[1][var17] >> 16);
                                              var17++;
                                              continue L20;
                                            }
                                          }
                                        } else {
                                          var16 = var16 + (int)((long)field_l[var14 + var12 - 1 - var17] * (long)bh.field_c[0][var17] >> 16);
                                          var17++;
                                          continue L19;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                var16 = (int)((long)field_l[var14 + var12] * (long)bh.field_g >> 16);
                                var17 = 0;
                                L21: while (true) {
                                  if (var17 >= var12) {
                                    var17 = 0;
                                    L22: while (true) {
                                      if (var17 >= var13) {
                                        field_l[var14] = var16;
                                        var11 = ((hl) this).field_s.a(param0 + 1);
                                        var14++;
                                        continue L17;
                                      } else {
                                        var16 = var16 - (int)((long)field_l[var14 - 1 - var17] * (long)bh.field_c[1][var17] >> 16);
                                        var17++;
                                        continue L22;
                                      }
                                    }
                                  } else {
                                    var16 = var16 + (int)((long)field_l[var14 + var12 - 1 - var17] * (long)bh.field_c[0][var17] >> 16);
                                    var17++;
                                    continue L21;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var16 = (int)((long)field_l[var14 + var12] * (long)bh.field_g >> 16);
                          var17 = 0;
                          L23: while (true) {
                            if (var17 >= var12) {
                              var17 = 0;
                              L24: while (true) {
                                if (var17 >= var14) {
                                  field_l[var14] = var16;
                                  var11 = ((hl) this).field_s.a(param0 + 1);
                                  var14++;
                                  continue L14;
                                } else {
                                  var16 = var16 - (int)((long)field_l[var14 - 1 - var17] * (long)bh.field_c[1][var17] >> 16);
                                  var17++;
                                  continue L24;
                                }
                              }
                            } else {
                              var16 = var16 + (int)((long)field_l[var14 + var12 - 1 - var17] * (long)bh.field_c[0][var17] >> 16);
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
                      return field_l;
                    } else {
                      L26: {
                        if (field_l[var11] >= -32768) {
                          break L26;
                        } else {
                          field_l[var11] = -32768;
                          break L26;
                        }
                      }
                      if (field_l[var11] > 32767) {
                        field_l[var11] = 32767;
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
                    var12 = ((hl) this).field_o.a(param0);
                    var13 = ((hl) this).field_a.a(param0);
                    if (((hl) this).field_h == null) {
                      break L27;
                    } else {
                      var14 = ((hl) this).field_h.a(param0);
                      var15 = ((hl) this).field_i.a(param0);
                      var12 = var12 + (this.a(var7, var15, ((hl) this).field_h.field_h) >> 1);
                      var7 = var7 + ((var14 * var5 >> 16) + var6);
                      break L27;
                    }
                  }
                  L28: {
                    if (((hl) this).field_y == null) {
                      break L28;
                    } else {
                      var14 = ((hl) this).field_y.a(param0);
                      var15 = ((hl) this).field_r.a(param0);
                      var13 = var13 * ((this.a(var10, var15, ((hl) this).field_y.field_h) >> 1) + 32768) >> 15;
                      var10 = var10 + ((var14 * var8 >> 16) + var9);
                      break L28;
                    }
                  }
                  var14 = 0;
                  L29: while (true) {
                    if (var14 < 5) {
                      if (((hl) this).field_m[var14] != 0) {
                        var15 = var11 + field_v[var14];
                        if (var15 < param0) {
                          field_l[var15] = field_l[var15] + this.a(field_n[var14], var13 * field_d[var14] >> 15, ((hl) this).field_o.field_h);
                          field_n[var14] = field_n[var14] + ((var12 * field_j[var14] >> 16) + field_e[var14]);
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
              if (((hl) this).field_m[var11] != 0) {
                field_n[var11] = 0;
                field_v[var11] = (int)((double)((hl) this).field_p[var11] * var3);
                field_d[var11] = (((hl) this).field_m[var11] << 14) / 100;
                field_j[var11] = (int)((double)(((hl) this).field_o.field_f - ((hl) this).field_o.field_j) * 32.768 * Math.pow(1.0057929410678534, (double)((hl) this).field_b[var11]) / var3);
                field_e[var11] = (int)((double)((hl) this).field_o.field_j * 32.768 / var3);
                var11++;
                continue L2;
              } else {
                var11++;
                continue L2;
              }
            }
          }
        } else {
          return field_l;
        }
    }

    final void a(jc param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          ((hl) this).field_o = new wj();
          ((hl) this).field_o.a(param0);
          ((hl) this).field_a = new wj();
          ((hl) this).field_a.a(param0);
          var2 = param0.g(11132);
          if (var2 == 0) {
            break L0;
          } else {
            param0.field_l = param0.field_l - 1;
            ((hl) this).field_h = new wj();
            ((hl) this).field_h.a(param0);
            ((hl) this).field_i = new wj();
            ((hl) this).field_i.a(param0);
            break L0;
          }
        }
        L1: {
          var2 = param0.g(11132);
          if (var2 == 0) {
            break L1;
          } else {
            param0.field_l = param0.field_l - 1;
            ((hl) this).field_y = new wj();
            ((hl) this).field_y.a(param0);
            ((hl) this).field_r = new wj();
            ((hl) this).field_r.a(param0);
            break L1;
          }
        }
        L2: {
          var2 = param0.g(11132);
          if (var2 == 0) {
            break L2;
          } else {
            param0.field_l = param0.field_l - 1;
            ((hl) this).field_x = new wj();
            ((hl) this).field_x.a(param0);
            ((hl) this).field_f = new wj();
            ((hl) this).field_f.a(param0);
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
                ((hl) this).field_m[var3] = var4;
                ((hl) this).field_b[var3] = param0.d(121);
                ((hl) this).field_p[var3] = param0.c(false);
                var3++;
                continue L3;
              } else {
                break L4;
              }
            }
          }
          ((hl) this).field_u = param0.c(false);
          ((hl) this).field_t = param0.c(false);
          ((hl) this).field_q = param0.c((byte) 36);
          ((hl) this).field_g = param0.c((byte) -92);
          ((hl) this).field_k = new bh();
          ((hl) this).field_s = new wj();
          ((hl) this).field_k.a(param0, ((hl) this).field_s);
          return;
        }
    }

    hl() {
        ((hl) this).field_q = 500;
        ((hl) this).field_b = new int[]{0, 0, 0, 0, 0};
        ((hl) this).field_u = 0;
        ((hl) this).field_m = new int[]{0, 0, 0, 0, 0};
        ((hl) this).field_p = new int[]{0, 0, 0, 0, 0};
        ((hl) this).field_g = 0;
        ((hl) this).field_t = 100;
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
        field_c = new int[32768];
        for (var1 = 0; var1 < 32768; var1++) {
            field_c[var1] = (int)(Math.sin((double)var1 / 5215.1903) * 16384.0);
        }
        field_l = new int[220500];
        field_v = new int[5];
        field_d = new int[5];
        field_j = new int[5];
        field_e = new int[5];
        field_n = new int[5];
    }
}
