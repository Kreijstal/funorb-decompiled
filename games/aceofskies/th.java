/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class th {
    private static int[] field_f;
    int field_a;
    private wh field_j;
    private int field_x;
    private wh field_s;
    private ge field_p;
    private static int[] field_l;
    private wh field_e;
    private wh field_t;
    private int field_m;
    private wh field_y;
    private int[] field_w;
    private wh field_i;
    private int[] field_c;
    private int[] field_n;
    private static int[] field_v;
    private wh field_h;
    int field_r;
    private wh field_b;
    private static int[] field_o;
    private static int[] field_k;
    private static int[] field_q;
    private static int[] field_d;
    private static int[] field_g;
    private wh field_u;

    private final int a(int param0, int param1, int param2) {
        if (param2 == 1) {
            if ((param0 & 32767) < 16384) {
                return param1;
            }
            return -param1;
        }
        if (param2 == 2) {
            return field_l[param0 & 32767] * param1 >> 14;
        }
        if (param2 == 3) {
            return ((param0 & 32767) * param1 >> 14) - param1;
        }
        if (param2 == 4) {
            return field_v[param0 / 2607 & 32767] * param1;
        }
        return 0;
    }

    public static void a() {
        field_f = null;
        field_v = null;
        field_l = null;
        field_q = null;
        field_g = null;
        field_d = null;
        field_k = null;
        field_o = null;
    }

    final void a(rb param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          ((th) this).field_h = new wh();
          ((th) this).field_h.b(param0);
          ((th) this).field_s = new wh();
          ((th) this).field_s.b(param0);
          var2 = param0.g(-64);
          if (var2 == 0) {
            break L0;
          } else {
            ((rb) param0).field_g = ((rb) param0).field_g - 1;
            ((th) this).field_u = new wh();
            ((th) this).field_u.b(param0);
            ((th) this).field_t = new wh();
            ((th) this).field_t.b(param0);
            break L0;
          }
        }
        L1: {
          var2 = param0.g(-57);
          if (var2 == 0) {
            break L1;
          } else {
            ((rb) param0).field_g = ((rb) param0).field_g - 1;
            ((th) this).field_i = new wh();
            ((th) this).field_i.b(param0);
            ((th) this).field_y = new wh();
            ((th) this).field_y.b(param0);
            break L1;
          }
        }
        L2: {
          var2 = param0.g(-81);
          if (var2 == 0) {
            break L2;
          } else {
            ((rb) param0).field_g = ((rb) param0).field_g - 1;
            ((th) this).field_b = new wh();
            ((th) this).field_b.b(param0);
            ((th) this).field_j = new wh();
            ((th) this).field_j.b(param0);
            break L2;
          }
        }
        var3 = 0;
        L3: while (true) {
          L4: {
            if (var3 >= 10) {
              break L4;
            } else {
              var4 = param0.f(-129);
              if (var4 != 0) {
                ((th) this).field_w[var3] = var4;
                ((th) this).field_n[var3] = param0.f((byte) 103);
                ((th) this).field_c[var3] = param0.f(-129);
                var3++;
                continue L3;
              } else {
                break L4;
              }
            }
          }
          ((th) this).field_m = param0.f(-129);
          ((th) this).field_x = param0.f(-129);
          ((th) this).field_r = param0.i((byte) 0);
          ((th) this).field_a = param0.i((byte) 0);
          ((th) this).field_p = new ge();
          ((th) this).field_e = new wh();
          ((th) this).field_p.a(param0, ((th) this).field_e);
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
        au.a(field_f, 0, param0);
        if (param1 >= 10) {
          L0: {
            var3 = (double)param0 / ((double)param1 + 0.0);
            ((th) this).field_h.a();
            ((th) this).field_s.a();
            var5 = 0;
            var6 = 0;
            var7 = 0;
            if (((th) this).field_u == null) {
              break L0;
            } else {
              ((th) this).field_u.a();
              ((th) this).field_t.a();
              var5 = (int)((double)(((th) this).field_u.field_b - ((th) this).field_u.field_a) * 32.768 / var3);
              var6 = (int)((double)((th) this).field_u.field_a * 32.768 / var3);
              break L0;
            }
          }
          L1: {
            var8 = 0;
            var9 = 0;
            var10 = 0;
            if (((th) this).field_i == null) {
              break L1;
            } else {
              ((th) this).field_i.a();
              ((th) this).field_y.a();
              var8 = (int)((double)(((th) this).field_i.field_b - ((th) this).field_i.field_a) * 32.768 / var3);
              var9 = (int)((double)((th) this).field_i.field_a * 32.768 / var3);
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
                    if (((th) this).field_b == null) {
                      break L4;
                    } else {
                      ((th) this).field_b.a();
                      ((th) this).field_j.a();
                      var11 = 0;
                      var12 = 0;
                      var13 = 1;
                      var14 = 0;
                      L5: while (true) {
                        if (var14 >= param0) {
                          break L4;
                        } else {
                          L6: {
                            var15 = ((th) this).field_b.a(param0);
                            var16 = ((th) this).field_j.a(param0);
                            if (var13 == 0) {
                              var12 = ((th) this).field_b.field_a + ((((th) this).field_b.field_b - ((th) this).field_b.field_a) * var16 >> 8);
                              break L6;
                            } else {
                              var12 = ((th) this).field_b.field_a + ((((th) this).field_b.field_b - ((th) this).field_b.field_a) * var15 >> 8);
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
                            field_f[var14] = 0;
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
                    if (((th) this).field_m <= 0) {
                      break L9;
                    } else {
                      if (((th) this).field_x <= 0) {
                        break L9;
                      } else {
                        var11 = (int)((double)((th) this).field_m * var3);
                        var12 = var11;
                        L10: while (true) {
                          if (var12 >= param0) {
                            break L9;
                          } else {
                            field_f[var12] = field_f[var12] + field_f[var12 - var11] * ((th) this).field_x / 100;
                            var12++;
                            continue L10;
                          }
                        }
                      }
                    }
                  }
                  L11: {
                    L12: {
                      if (((th) this).field_p.field_d[0] > 0) {
                        break L12;
                      } else {
                        if (((th) this).field_p.field_d[1] <= 0) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    ((th) this).field_e.a();
                    var11 = ((th) this).field_e.a(param0 + 1);
                    var12 = ((th) this).field_p.a(0, (float)var11 / 65536.0f);
                    var13 = ((th) this).field_p.a(1, (float)var11 / 65536.0f);
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
                                  var12 = ((th) this).field_p.a(0, (float)var11 / 65536.0f);
                                  var13 = ((th) this).field_p.a(1, (float)var11 / 65536.0f);
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
                                              field_f[var14] = var16;
                                              var11 = ((th) this).field_e.a(param0 + 1);
                                              var14++;
                                              continue L18;
                                            } else {
                                              var16 = var16 - (int)((long)field_f[var14 - 1 - var17] * (long)ge.field_h[1][var17] >> 16);
                                              var17++;
                                              continue L20;
                                            }
                                          }
                                        } else {
                                          var16 = var16 + (int)((long)field_f[var14 + var12 - 1 - var17] * (long)ge.field_h[0][var17] >> 16);
                                          var17++;
                                          continue L19;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                var16 = (int)((long)field_f[var14 + var12] * (long)ge.field_g >> 16);
                                var17 = 0;
                                L21: while (true) {
                                  if (var17 >= var12) {
                                    var17 = 0;
                                    L22: while (true) {
                                      if (var17 >= var13) {
                                        field_f[var14] = var16;
                                        var11 = ((th) this).field_e.a(param0 + 1);
                                        var14++;
                                        continue L17;
                                      } else {
                                        var16 = var16 - (int)((long)field_f[var14 - 1 - var17] * (long)ge.field_h[1][var17] >> 16);
                                        var17++;
                                        continue L22;
                                      }
                                    }
                                  } else {
                                    var16 = var16 + (int)((long)field_f[var14 + var12 - 1 - var17] * (long)ge.field_h[0][var17] >> 16);
                                    var17++;
                                    continue L21;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var16 = (int)((long)field_f[var14 + var12] * (long)ge.field_g >> 16);
                          var17 = 0;
                          L23: while (true) {
                            if (var17 >= var12) {
                              var17 = 0;
                              L24: while (true) {
                                if (var17 >= var14) {
                                  field_f[var14] = var16;
                                  var11 = ((th) this).field_e.a(param0 + 1);
                                  var14++;
                                  continue L14;
                                } else {
                                  var16 = var16 - (int)((long)field_f[var14 - 1 - var17] * (long)ge.field_h[1][var17] >> 16);
                                  var17++;
                                  continue L24;
                                }
                              }
                            } else {
                              var16 = var16 + (int)((long)field_f[var14 + var12 - 1 - var17] * (long)ge.field_h[0][var17] >> 16);
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
                      return field_f;
                    } else {
                      L26: {
                        if (field_f[var11] >= -32768) {
                          break L26;
                        } else {
                          field_f[var11] = -32768;
                          break L26;
                        }
                      }
                      if (field_f[var11] > 32767) {
                        field_f[var11] = 32767;
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
                    var12 = ((th) this).field_h.a(param0);
                    var13 = ((th) this).field_s.a(param0);
                    if (((th) this).field_u == null) {
                      break L27;
                    } else {
                      var14 = ((th) this).field_u.a(param0);
                      var15 = ((th) this).field_t.a(param0);
                      var12 = var12 + (this.a(var7, var15, ((th) this).field_u.field_c) >> 1);
                      var7 = var7 + ((var14 * var5 >> 16) + var6);
                      break L27;
                    }
                  }
                  L28: {
                    if (((th) this).field_i == null) {
                      break L28;
                    } else {
                      var14 = ((th) this).field_i.a(param0);
                      var15 = ((th) this).field_y.a(param0);
                      var13 = var13 * ((this.a(var10, var15, ((th) this).field_i.field_c) >> 1) + 32768) >> 15;
                      var10 = var10 + ((var14 * var8 >> 16) + var9);
                      break L28;
                    }
                  }
                  var14 = 0;
                  L29: while (true) {
                    if (var14 < 5) {
                      if (((th) this).field_w[var14] != 0) {
                        var15 = var11 + field_g[var14];
                        if (var15 < param0) {
                          field_f[var15] = field_f[var15] + this.a(field_q[var14], var13 * field_d[var14] >> 15, ((th) this).field_h.field_c);
                          field_q[var14] = field_q[var14] + ((var12 * field_k[var14] >> 16) + field_o[var14]);
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
              if (((th) this).field_w[var11] != 0) {
                field_q[var11] = 0;
                field_g[var11] = (int)((double)((th) this).field_c[var11] * var3);
                field_d[var11] = (((th) this).field_w[var11] << 14) / 100;
                field_k[var11] = (int)((double)(((th) this).field_h.field_b - ((th) this).field_h.field_a) * 32.768 * Math.pow(1.0057929410678534, (double)((th) this).field_n[var11]) / var3);
                field_o[var11] = (int)((double)((th) this).field_h.field_a * 32.768 / var3);
                var11++;
                continue L2;
              } else {
                var11++;
                continue L2;
              }
            }
          }
        } else {
          return field_f;
        }
    }

    th() {
        ((th) this).field_x = 100;
        ((th) this).field_a = 0;
        ((th) this).field_c = new int[]{0, 0, 0, 0, 0};
        ((th) this).field_w = new int[]{0, 0, 0, 0, 0};
        ((th) this).field_m = 0;
        ((th) this).field_n = new int[]{0, 0, 0, 0, 0};
        ((th) this).field_r = 500;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var1 = 0;
        field_v = new int[32768];
        Random var0 = new Random(0L);
        for (var1 = 0; var1 < 32768; var1++) {
            field_v[var1] = (var0.nextInt() & 2) - 1;
        }
        field_l = new int[32768];
        for (var1 = 0; var1 < 32768; var1++) {
            field_l[var1] = (int)(Math.sin((double)var1 / 5215.1903) * 16384.0);
        }
        field_f = new int[220500];
        field_d = new int[5];
        field_g = new int[5];
        field_o = new int[5];
        field_k = new int[5];
        field_q = new int[5];
    }
}
