/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gg {
    private hl field_l;
    private hl field_s;
    private int[] field_b;
    private int field_g;
    private int field_c;
    private hl field_v;
    private cd field_k;
    private int[] field_w;
    private int[] field_p;
    private static int[] field_x;
    private static int[] field_y;
    private hl field_q;
    private hl field_t;
    int field_f;
    private static int[] field_o;
    int field_n;
    private hl field_e;
    private hl field_u;
    private hl field_h;
    private hl field_r;
    private static int[] field_d;
    private static int[] field_j;
    private static int[] field_i;
    private static int[] field_a;
    private static int[] field_m;

    private final int a(int param0, int param1, int param2) {
        if (param2 == 1) {
            if ((param0 & 32767) < 16384) {
                return param1;
            }
            return -param1;
        }
        if (param2 == 2) {
            return field_y[param0 & 32767] * param1 >> 14;
        }
        if (param2 == 3) {
            return ((param0 & 32767) * param1 >> 14) - param1;
        }
        if (param2 == 4) {
            return field_o[param0 / 2607 & 32767] * param1;
        }
        return 0;
    }

    public static void a() {
        field_x = null;
        field_o = null;
        field_y = null;
        field_d = null;
        field_m = null;
        field_a = null;
        field_i = null;
        field_j = null;
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
        cb.a(field_x, 0, param0);
        if (param1 >= 10) {
          L0: {
            var3 = (double)param0 / ((double)param1 + 0.0);
            ((gg) this).field_e.a();
            ((gg) this).field_v.a();
            var5 = 0;
            var6 = 0;
            var7 = 0;
            if (((gg) this).field_h == null) {
              break L0;
            } else {
              ((gg) this).field_h.a();
              ((gg) this).field_q.a();
              var5 = (int)((double)(((gg) this).field_h.field_a - ((gg) this).field_h.field_e) * 32.768 / var3);
              var6 = (int)((double)((gg) this).field_h.field_e * 32.768 / var3);
              break L0;
            }
          }
          L1: {
            var8 = 0;
            var9 = 0;
            var10 = 0;
            if (((gg) this).field_s == null) {
              break L1;
            } else {
              ((gg) this).field_s.a();
              ((gg) this).field_t.a();
              var8 = (int)((double)(((gg) this).field_s.field_a - ((gg) this).field_s.field_e) * 32.768 / var3);
              var9 = (int)((double)((gg) this).field_s.field_e * 32.768 / var3);
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
                    if (((gg) this).field_r == null) {
                      break L4;
                    } else {
                      ((gg) this).field_r.a();
                      ((gg) this).field_u.a();
                      var11 = 0;
                      var12 = 0;
                      var13 = 1;
                      var14 = 0;
                      L5: while (true) {
                        if (var14 >= param0) {
                          break L4;
                        } else {
                          L6: {
                            var15 = ((gg) this).field_r.a(param0);
                            var16 = ((gg) this).field_u.a(param0);
                            if (var13 == 0) {
                              var12 = ((gg) this).field_r.field_e + ((((gg) this).field_r.field_a - ((gg) this).field_r.field_e) * var16 >> 8);
                              break L6;
                            } else {
                              var12 = ((gg) this).field_r.field_e + ((((gg) this).field_r.field_a - ((gg) this).field_r.field_e) * var15 >> 8);
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
                    if (((gg) this).field_g <= 0) {
                      break L9;
                    } else {
                      if (((gg) this).field_c <= 0) {
                        break L9;
                      } else {
                        var11 = (int)((double)((gg) this).field_g * var3);
                        var12 = var11;
                        L10: while (true) {
                          if (var12 >= param0) {
                            break L9;
                          } else {
                            field_x[var12] = field_x[var12] + field_x[var12 - var11] * ((gg) this).field_c / 100;
                            var12++;
                            continue L10;
                          }
                        }
                      }
                    }
                  }
                  L11: {
                    L12: {
                      if (((gg) this).field_k.field_a[0] > 0) {
                        break L12;
                      } else {
                        if (((gg) this).field_k.field_a[1] <= 0) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    ((gg) this).field_l.a();
                    var11 = ((gg) this).field_l.a(param0 + 1);
                    var12 = ((gg) this).field_k.a(0, (float)var11 / 65536.0f);
                    var13 = ((gg) this).field_k.a(1, (float)var11 / 65536.0f);
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
                                  var12 = ((gg) this).field_k.a(0, (float)var11 / 65536.0f);
                                  var13 = ((gg) this).field_k.a(1, (float)var11 / 65536.0f);
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
                                              var11 = ((gg) this).field_l.a(param0 + 1);
                                              var14++;
                                              continue L18;
                                            } else {
                                              var16 = var16 - (int)((long)field_x[var14 - 1 - var17] * (long)cd.field_e[1][var17] >> 16);
                                              var17++;
                                              continue L20;
                                            }
                                          }
                                        } else {
                                          var16 = var16 + (int)((long)field_x[var14 + var12 - 1 - var17] * (long)cd.field_e[0][var17] >> 16);
                                          var17++;
                                          continue L19;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                var16 = (int)((long)field_x[var14 + var12] * (long)cd.field_c >> 16);
                                var17 = 0;
                                L21: while (true) {
                                  if (var17 >= var12) {
                                    var17 = 0;
                                    L22: while (true) {
                                      if (var17 >= var13) {
                                        field_x[var14] = var16;
                                        var11 = ((gg) this).field_l.a(param0 + 1);
                                        var14++;
                                        continue L17;
                                      } else {
                                        var16 = var16 - (int)((long)field_x[var14 - 1 - var17] * (long)cd.field_e[1][var17] >> 16);
                                        var17++;
                                        continue L22;
                                      }
                                    }
                                  } else {
                                    var16 = var16 + (int)((long)field_x[var14 + var12 - 1 - var17] * (long)cd.field_e[0][var17] >> 16);
                                    var17++;
                                    continue L21;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var16 = (int)((long)field_x[var14 + var12] * (long)cd.field_c >> 16);
                          var17 = 0;
                          L23: while (true) {
                            if (var17 >= var12) {
                              var17 = 0;
                              L24: while (true) {
                                if (var17 >= var14) {
                                  field_x[var14] = var16;
                                  var11 = ((gg) this).field_l.a(param0 + 1);
                                  var14++;
                                  continue L14;
                                } else {
                                  var16 = var16 - (int)((long)field_x[var14 - 1 - var17] * (long)cd.field_e[1][var17] >> 16);
                                  var17++;
                                  continue L24;
                                }
                              }
                            } else {
                              var16 = var16 + (int)((long)field_x[var14 + var12 - 1 - var17] * (long)cd.field_e[0][var17] >> 16);
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
                    var12 = ((gg) this).field_e.a(param0);
                    var13 = ((gg) this).field_v.a(param0);
                    if (((gg) this).field_h == null) {
                      break L27;
                    } else {
                      var14 = ((gg) this).field_h.a(param0);
                      var15 = ((gg) this).field_q.a(param0);
                      var12 = var12 + (this.a(var7, var15, ((gg) this).field_h.field_h) >> 1);
                      var7 = var7 + ((var14 * var5 >> 16) + var6);
                      break L27;
                    }
                  }
                  L28: {
                    if (((gg) this).field_s == null) {
                      break L28;
                    } else {
                      var14 = ((gg) this).field_s.a(param0);
                      var15 = ((gg) this).field_t.a(param0);
                      var13 = var13 * ((this.a(var10, var15, ((gg) this).field_s.field_h) >> 1) + 32768) >> 15;
                      var10 = var10 + ((var14 * var8 >> 16) + var9);
                      break L28;
                    }
                  }
                  var14 = 0;
                  L29: while (true) {
                    if (var14 < 5) {
                      if (((gg) this).field_b[var14] != 0) {
                        var15 = var11 + field_m[var14];
                        if (var15 < param0) {
                          field_x[var15] = field_x[var15] + this.a(field_d[var14], var13 * field_a[var14] >> 15, ((gg) this).field_e.field_h);
                          field_d[var14] = field_d[var14] + ((var12 * field_i[var14] >> 16) + field_j[var14]);
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
              if (((gg) this).field_b[var11] != 0) {
                field_d[var11] = 0;
                field_m[var11] = (int)((double)((gg) this).field_p[var11] * var3);
                field_a[var11] = (((gg) this).field_b[var11] << 14) / 100;
                field_i[var11] = (int)((double)(((gg) this).field_e.field_a - ((gg) this).field_e.field_e) * 32.768 * Math.pow(1.0057929410678534, (double)((gg) this).field_w[var11]) / var3);
                field_j[var11] = (int)((double)((gg) this).field_e.field_e * 32.768 / var3);
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

    final void a(wi param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          ((gg) this).field_e = new hl();
          ((gg) this).field_e.a(param0);
          ((gg) this).field_v = new hl();
          ((gg) this).field_v.a(param0);
          var2 = param0.d((byte) -72);
          if (var2 == 0) {
            break L0;
          } else {
            param0.field_h = param0.field_h - 1;
            ((gg) this).field_h = new hl();
            ((gg) this).field_h.a(param0);
            ((gg) this).field_q = new hl();
            ((gg) this).field_q.a(param0);
            break L0;
          }
        }
        L1: {
          var2 = param0.d((byte) -77);
          if (var2 == 0) {
            break L1;
          } else {
            param0.field_h = param0.field_h - 1;
            ((gg) this).field_s = new hl();
            ((gg) this).field_s.a(param0);
            ((gg) this).field_t = new hl();
            ((gg) this).field_t.a(param0);
            break L1;
          }
        }
        L2: {
          var2 = param0.d((byte) -116);
          if (var2 == 0) {
            break L2;
          } else {
            param0.field_h = param0.field_h - 1;
            ((gg) this).field_r = new hl();
            ((gg) this).field_r.a(param0);
            ((gg) this).field_u = new hl();
            ((gg) this).field_u.a(param0);
            break L2;
          }
        }
        var3 = 0;
        L3: while (true) {
          L4: {
            if (var3 >= 10) {
              break L4;
            } else {
              var4 = param0.f(109);
              if (var4 != 0) {
                ((gg) this).field_b[var3] = var4;
                ((gg) this).field_w[var3] = param0.i(128);
                ((gg) this).field_p[var3] = param0.f(114);
                var3++;
                continue L3;
              } else {
                break L4;
              }
            }
          }
          ((gg) this).field_g = param0.f(95);
          ((gg) this).field_c = param0.f(97);
          ((gg) this).field_n = param0.a(-1640531527);
          ((gg) this).field_f = param0.a(-1640531527);
          ((gg) this).field_k = new cd();
          ((gg) this).field_l = new hl();
          ((gg) this).field_k.a(param0, ((gg) this).field_l);
          return;
        }
    }

    gg() {
        ((gg) this).field_b = new int[]{0, 0, 0, 0, 0};
        ((gg) this).field_g = 0;
        ((gg) this).field_p = new int[]{0, 0, 0, 0, 0};
        ((gg) this).field_w = new int[]{0, 0, 0, 0, 0};
        ((gg) this).field_c = 100;
        ((gg) this).field_n = 500;
        ((gg) this).field_f = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var1 = 0;
        field_o = new int[32768];
        Random var0 = new Random(0L);
        for (var1 = 0; var1 < 32768; var1++) {
            field_o[var1] = (var0.nextInt() & 2) - 1;
        }
        field_y = new int[32768];
        for (var1 = 0; var1 < 32768; var1++) {
            field_y[var1] = (int)(Math.sin((double)var1 / 5215.1903) * 16384.0);
        }
        field_x = new int[220500];
        field_j = new int[5];
        field_d = new int[5];
        field_i = new int[5];
        field_m = new int[5];
        field_a = new int[5];
    }
}
