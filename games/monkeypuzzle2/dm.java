/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class dm {
    private int field_d;
    int field_i;
    private lj field_j;
    private dg field_a;
    private static int[] field_w;
    private static int[] field_b;
    int field_h;
    private dg field_n;
    private int field_m;
    private static int[] field_r;
    private dg field_y;
    private dg field_f;
    private dg field_x;
    private dg field_c;
    private int[] field_v;
    private static int[] field_p;
    private dg field_e;
    private dg field_l;
    private static int[] field_g;
    private static int[] field_t;
    private static int[] field_s;
    private dg field_k;
    private int[] field_q;
    private int[] field_o;
    private static int[] field_u;

    public static void a() {
        field_w = null;
        field_r = null;
        field_b = null;
        field_g = null;
        field_s = null;
        field_t = null;
        field_u = null;
        field_p = null;
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
            return field_r[param0 / 2607 & 32767] * param1;
        }
        return 0;
    }

    final void a(gk param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          ((dm) this).field_f = new dg();
          ((dm) this).field_f.b(param0);
          ((dm) this).field_a = new dg();
          ((dm) this).field_a.b(param0);
          var2 = param0.a((byte) 114);
          if (var2 == 0) {
            break L0;
          } else {
            param0.field_h = param0.field_h - 1;
            ((dm) this).field_k = new dg();
            ((dm) this).field_k.b(param0);
            ((dm) this).field_c = new dg();
            ((dm) this).field_c.b(param0);
            break L0;
          }
        }
        L1: {
          var2 = param0.a((byte) 114);
          if (var2 == 0) {
            break L1;
          } else {
            param0.field_h = param0.field_h - 1;
            ((dm) this).field_n = new dg();
            ((dm) this).field_n.b(param0);
            ((dm) this).field_y = new dg();
            ((dm) this).field_y.b(param0);
            break L1;
          }
        }
        L2: {
          var2 = param0.a((byte) 114);
          if (var2 == 0) {
            break L2;
          } else {
            param0.field_h = param0.field_h - 1;
            ((dm) this).field_e = new dg();
            ((dm) this).field_e.b(param0);
            ((dm) this).field_l = new dg();
            ((dm) this).field_l.b(param0);
            break L2;
          }
        }
        var3 = 0;
        L3: while (true) {
          L4: {
            if (var3 >= 10) {
              break L4;
            } else {
              var4 = param0.o(-1);
              if (var4 != 0) {
                ((dm) this).field_q[var3] = var4;
                ((dm) this).field_v[var3] = param0.h(-129);
                ((dm) this).field_o[var3] = param0.o(-1);
                var3++;
                continue L3;
              } else {
                break L4;
              }
            }
          }
          ((dm) this).field_m = param0.o(-1);
          ((dm) this).field_d = param0.o(-1);
          ((dm) this).field_i = param0.j(17277);
          ((dm) this).field_h = param0.j(17277);
          ((dm) this).field_j = new lj();
          ((dm) this).field_x = new dg();
          ((dm) this).field_j.a(param0, ((dm) this).field_x);
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
        gl.a(field_w, 0, param0);
        if (param1 >= 10) {
          L0: {
            var3 = (double)param0 / ((double)param1 + 0.0);
            ((dm) this).field_f.a();
            ((dm) this).field_a.a();
            var5 = 0;
            var6 = 0;
            var7 = 0;
            if (((dm) this).field_k == null) {
              break L0;
            } else {
              ((dm) this).field_k.a();
              ((dm) this).field_c.a();
              var5 = (int)((double)(((dm) this).field_k.field_d - ((dm) this).field_k.field_j) * 32.768 / var3);
              var6 = (int)((double)((dm) this).field_k.field_j * 32.768 / var3);
              break L0;
            }
          }
          L1: {
            var8 = 0;
            var9 = 0;
            var10 = 0;
            if (((dm) this).field_n == null) {
              break L1;
            } else {
              ((dm) this).field_n.a();
              ((dm) this).field_y.a();
              var8 = (int)((double)(((dm) this).field_n.field_d - ((dm) this).field_n.field_j) * 32.768 / var3);
              var9 = (int)((double)((dm) this).field_n.field_j * 32.768 / var3);
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
                    if (((dm) this).field_e == null) {
                      break L4;
                    } else {
                      ((dm) this).field_e.a();
                      ((dm) this).field_l.a();
                      var11 = 0;
                      var12 = 0;
                      var13 = 1;
                      var14 = 0;
                      L5: while (true) {
                        if (var14 >= param0) {
                          break L4;
                        } else {
                          L6: {
                            var15 = ((dm) this).field_e.a(param0);
                            var16 = ((dm) this).field_l.a(param0);
                            if (var13 == 0) {
                              var12 = ((dm) this).field_e.field_j + ((((dm) this).field_e.field_d - ((dm) this).field_e.field_j) * var16 >> 8);
                              break L6;
                            } else {
                              var12 = ((dm) this).field_e.field_j + ((((dm) this).field_e.field_d - ((dm) this).field_e.field_j) * var15 >> 8);
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
                            field_w[var14] = 0;
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
                    if (((dm) this).field_m <= 0) {
                      break L9;
                    } else {
                      if (((dm) this).field_d <= 0) {
                        break L9;
                      } else {
                        var11 = (int)((double)((dm) this).field_m * var3);
                        var12 = var11;
                        L10: while (true) {
                          if (var12 >= param0) {
                            break L9;
                          } else {
                            field_w[var12] = field_w[var12] + field_w[var12 - var11] * ((dm) this).field_d / 100;
                            var12++;
                            continue L10;
                          }
                        }
                      }
                    }
                  }
                  L11: {
                    L12: {
                      if (((dm) this).field_j.field_c[0] > 0) {
                        break L12;
                      } else {
                        if (((dm) this).field_j.field_c[1] <= 0) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    ((dm) this).field_x.a();
                    var11 = ((dm) this).field_x.a(param0 + 1);
                    var12 = ((dm) this).field_j.a(0, (float)var11 / 65536.0f);
                    var13 = ((dm) this).field_j.a(1, (float)var11 / 65536.0f);
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
                                  var12 = ((dm) this).field_j.a(0, (float)var11 / 65536.0f);
                                  var13 = ((dm) this).field_j.a(1, (float)var11 / 65536.0f);
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
                                              field_w[var14] = var16;
                                              var11 = ((dm) this).field_x.a(param0 + 1);
                                              var14++;
                                              continue L18;
                                            } else {
                                              var16 = var16 - (int)((long)field_w[var14 - 1 - var17] * (long)lj.field_g[1][var17] >> 16);
                                              var17++;
                                              continue L20;
                                            }
                                          }
                                        } else {
                                          var16 = var16 + (int)((long)field_w[var14 + var12 - 1 - var17] * (long)lj.field_g[0][var17] >> 16);
                                          var17++;
                                          continue L19;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                var16 = (int)((long)field_w[var14 + var12] * (long)lj.field_h >> 16);
                                var17 = 0;
                                L21: while (true) {
                                  if (var17 >= var12) {
                                    var17 = 0;
                                    L22: while (true) {
                                      if (var17 >= var13) {
                                        field_w[var14] = var16;
                                        var11 = ((dm) this).field_x.a(param0 + 1);
                                        var14++;
                                        continue L17;
                                      } else {
                                        var16 = var16 - (int)((long)field_w[var14 - 1 - var17] * (long)lj.field_g[1][var17] >> 16);
                                        var17++;
                                        continue L22;
                                      }
                                    }
                                  } else {
                                    var16 = var16 + (int)((long)field_w[var14 + var12 - 1 - var17] * (long)lj.field_g[0][var17] >> 16);
                                    var17++;
                                    continue L21;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var16 = (int)((long)field_w[var14 + var12] * (long)lj.field_h >> 16);
                          var17 = 0;
                          L23: while (true) {
                            if (var17 >= var12) {
                              var17 = 0;
                              L24: while (true) {
                                if (var17 >= var14) {
                                  field_w[var14] = var16;
                                  var11 = ((dm) this).field_x.a(param0 + 1);
                                  var14++;
                                  continue L14;
                                } else {
                                  var16 = var16 - (int)((long)field_w[var14 - 1 - var17] * (long)lj.field_g[1][var17] >> 16);
                                  var17++;
                                  continue L24;
                                }
                              }
                            } else {
                              var16 = var16 + (int)((long)field_w[var14 + var12 - 1 - var17] * (long)lj.field_g[0][var17] >> 16);
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
                      return field_w;
                    } else {
                      L26: {
                        if (field_w[var11] >= -32768) {
                          break L26;
                        } else {
                          field_w[var11] = -32768;
                          break L26;
                        }
                      }
                      if (field_w[var11] > 32767) {
                        field_w[var11] = 32767;
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
                    var12 = ((dm) this).field_f.a(param0);
                    var13 = ((dm) this).field_a.a(param0);
                    if (((dm) this).field_k == null) {
                      break L27;
                    } else {
                      var14 = ((dm) this).field_k.a(param0);
                      var15 = ((dm) this).field_c.a(param0);
                      var12 = var12 + (this.a(var7, var15, ((dm) this).field_k.field_f) >> 1);
                      var7 = var7 + ((var14 * var5 >> 16) + var6);
                      break L27;
                    }
                  }
                  L28: {
                    if (((dm) this).field_n == null) {
                      break L28;
                    } else {
                      var14 = ((dm) this).field_n.a(param0);
                      var15 = ((dm) this).field_y.a(param0);
                      var13 = var13 * ((this.a(var10, var15, ((dm) this).field_n.field_f) >> 1) + 32768) >> 15;
                      var10 = var10 + ((var14 * var8 >> 16) + var9);
                      break L28;
                    }
                  }
                  var14 = 0;
                  L29: while (true) {
                    if (var14 < 5) {
                      if (((dm) this).field_q[var14] != 0) {
                        var15 = var11 + field_s[var14];
                        if (var15 < param0) {
                          field_w[var15] = field_w[var15] + this.a(field_g[var14], var13 * field_t[var14] >> 15, ((dm) this).field_f.field_f);
                          field_g[var14] = field_g[var14] + ((var12 * field_u[var14] >> 16) + field_p[var14]);
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
              if (((dm) this).field_q[var11] != 0) {
                field_g[var11] = 0;
                field_s[var11] = (int)((double)((dm) this).field_o[var11] * var3);
                field_t[var11] = (((dm) this).field_q[var11] << 14) / 100;
                field_u[var11] = (int)((double)(((dm) this).field_f.field_d - ((dm) this).field_f.field_j) * 32.768 * Math.pow(1.0057929410678534, (double)((dm) this).field_v[var11]) / var3);
                field_p[var11] = (int)((double)((dm) this).field_f.field_j * 32.768 / var3);
                var11++;
                continue L2;
              } else {
                var11++;
                continue L2;
              }
            }
          }
        } else {
          return field_w;
        }
    }

    dm() {
        ((dm) this).field_m = 0;
        ((dm) this).field_h = 0;
        ((dm) this).field_d = 100;
        ((dm) this).field_i = 500;
        ((dm) this).field_q = new int[]{0, 0, 0, 0, 0};
        ((dm) this).field_o = new int[]{0, 0, 0, 0, 0};
        ((dm) this).field_v = new int[]{0, 0, 0, 0, 0};
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var1 = 0;
        field_r = new int[32768];
        Random var0 = new Random(0L);
        for (var1 = 0; var1 < 32768; var1++) {
            field_r[var1] = (var0.nextInt() & 2) - 1;
        }
        field_b = new int[32768];
        for (var1 = 0; var1 < 32768; var1++) {
            field_b[var1] = (int)(Math.sin((double)var1 / 5215.1903) * 16384.0);
        }
        field_w = new int[220500];
        field_g = new int[5];
        field_t = new int[5];
        field_u = new int[5];
        field_s = new int[5];
        field_p = new int[5];
    }
}
