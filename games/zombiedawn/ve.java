/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ve {
    private ko field_d;
    private ko field_u;
    private int[] field_k;
    private ko field_p;
    private int field_j;
    private ko field_c;
    private int[] field_l;
    private ko field_v;
    int field_y;
    private ko field_i;
    int field_b;
    private ie field_s;
    private static int[] field_h;
    private static int[] field_o;
    private static int[] field_m;
    private static int[] field_e;
    private int field_x;
    private ko field_t;
    private int[] field_w;
    private static int[] field_a;
    private ko field_r;
    private ko field_n;
    private static int[] field_g;
    private static int[] field_f;
    private static int[] field_q;

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
        gp.a(field_o, 0, param0);
        if (param1 >= 10) {
          L0: {
            var3 = (double)param0 / ((double)param1 + 0.0);
            ((ve) this).field_n.a();
            ((ve) this).field_v.a();
            var5 = 0;
            var6 = 0;
            var7 = 0;
            if (((ve) this).field_p == null) {
              break L0;
            } else {
              ((ve) this).field_p.a();
              ((ve) this).field_c.a();
              var5 = (int)((double)(((ve) this).field_p.field_g - ((ve) this).field_p.field_d) * 32.768 / var3);
              var6 = (int)((double)((ve) this).field_p.field_d * 32.768 / var3);
              break L0;
            }
          }
          L1: {
            var8 = 0;
            var9 = 0;
            var10 = 0;
            if (((ve) this).field_d == null) {
              break L1;
            } else {
              ((ve) this).field_d.a();
              ((ve) this).field_u.a();
              var8 = (int)((double)(((ve) this).field_d.field_g - ((ve) this).field_d.field_d) * 32.768 / var3);
              var9 = (int)((double)((ve) this).field_d.field_d * 32.768 / var3);
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
                    if (((ve) this).field_t == null) {
                      break L4;
                    } else {
                      ((ve) this).field_t.a();
                      ((ve) this).field_r.a();
                      var11 = 0;
                      var12 = 0;
                      var13 = 1;
                      var14 = 0;
                      L5: while (true) {
                        if (var14 >= param0) {
                          break L4;
                        } else {
                          L6: {
                            var15 = ((ve) this).field_t.a(param0);
                            var16 = ((ve) this).field_r.a(param0);
                            if (var13 == 0) {
                              var12 = ((ve) this).field_t.field_d + ((((ve) this).field_t.field_g - ((ve) this).field_t.field_d) * var16 >> 8);
                              break L6;
                            } else {
                              var12 = ((ve) this).field_t.field_d + ((((ve) this).field_t.field_g - ((ve) this).field_t.field_d) * var15 >> 8);
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
                            field_o[var14] = 0;
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
                    if (((ve) this).field_j <= 0) {
                      break L9;
                    } else {
                      if (((ve) this).field_x <= 0) {
                        break L9;
                      } else {
                        var11 = (int)((double)((ve) this).field_j * var3);
                        var12 = var11;
                        L10: while (true) {
                          if (var12 >= param0) {
                            break L9;
                          } else {
                            field_o[var12] = field_o[var12] + field_o[var12 - var11] * ((ve) this).field_x / 100;
                            var12++;
                            continue L10;
                          }
                        }
                      }
                    }
                  }
                  L11: {
                    L12: {
                      if (((ve) this).field_s.field_c[0] > 0) {
                        break L12;
                      } else {
                        if (((ve) this).field_s.field_c[1] <= 0) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    ((ve) this).field_i.a();
                    var11 = ((ve) this).field_i.a(param0 + 1);
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
                                              field_o[var14] = var16;
                                              var11 = ((ve) this).field_i.a(param0 + 1);
                                              var14++;
                                              continue L18;
                                            } else {
                                              var16 = var16 - (int)((long)field_o[var14 - 1 - var17] * (long)ie.field_h[1][var17] >> 16);
                                              var17++;
                                              continue L20;
                                            }
                                          }
                                        } else {
                                          var16 = var16 + (int)((long)field_o[var14 + var12 - 1 - var17] * (long)ie.field_h[0][var17] >> 16);
                                          var17++;
                                          continue L19;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                var16 = (int)((long)field_o[var14 + var12] * (long)ie.field_e >> 16);
                                var17 = 0;
                                L21: while (true) {
                                  if (var17 >= var12) {
                                    var17 = 0;
                                    L22: while (true) {
                                      if (var17 >= var13) {
                                        field_o[var14] = var16;
                                        var11 = ((ve) this).field_i.a(param0 + 1);
                                        var14++;
                                        continue L17;
                                      } else {
                                        var16 = var16 - (int)((long)field_o[var14 - 1 - var17] * (long)ie.field_h[1][var17] >> 16);
                                        var17++;
                                        continue L22;
                                      }
                                    }
                                  } else {
                                    var16 = var16 + (int)((long)field_o[var14 + var12 - 1 - var17] * (long)ie.field_h[0][var17] >> 16);
                                    var17++;
                                    continue L21;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var16 = (int)((long)field_o[var14 + var12] * (long)ie.field_e >> 16);
                          var17 = 0;
                          L23: while (true) {
                            if (var17 >= var12) {
                              var17 = 0;
                              L24: while (true) {
                                if (var17 >= var14) {
                                  field_o[var14] = var16;
                                  var11 = ((ve) this).field_i.a(param0 + 1);
                                  var14++;
                                  continue L14;
                                } else {
                                  var16 = var16 - (int)((long)field_o[var14 - 1 - var17] * (long)ie.field_h[1][var17] >> 16);
                                  var17++;
                                  continue L24;
                                }
                              }
                            } else {
                              var16 = var16 + (int)((long)field_o[var14 + var12 - 1 - var17] * (long)ie.field_h[0][var17] >> 16);
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
                      return field_o;
                    } else {
                      L26: {
                        if (field_o[var11] >= -32768) {
                          break L26;
                        } else {
                          field_o[var11] = -32768;
                          break L26;
                        }
                      }
                      if (field_o[var11] > 32767) {
                        field_o[var11] = 32767;
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
                    var12 = ((ve) this).field_n.a(param0);
                    var13 = ((ve) this).field_v.a(param0);
                    if (((ve) this).field_p == null) {
                      break L27;
                    } else {
                      var14 = ((ve) this).field_p.a(param0);
                      var15 = ((ve) this).field_c.a(param0);
                      var12 = var12 + (this.a(var7, var15, ((ve) this).field_p.field_e) >> 1);
                      var7 = var7 + ((var14 * var5 >> 16) + var6);
                      break L27;
                    }
                  }
                  L28: {
                    if (((ve) this).field_d == null) {
                      break L28;
                    } else {
                      var14 = ((ve) this).field_d.a(param0);
                      var15 = ((ve) this).field_u.a(param0);
                      var13 = var13 * ((this.a(var10, var15, ((ve) this).field_d.field_e) >> 1) + 32768) >> 15;
                      var10 = var10 + ((var14 * var8 >> 16) + var9);
                      break L28;
                    }
                  }
                  var14 = 0;
                  L29: while (true) {
                    if (var14 < 5) {
                      if (((ve) this).field_l[var14] != 0) {
                        var15 = var11 + field_e[var14];
                        if (var15 < param0) {
                          field_o[var15] = field_o[var15] + this.a(field_a[var14], var13 * field_f[var14] >> 15, ((ve) this).field_n.field_e);
                          field_a[var14] = field_a[var14] + ((var12 * field_g[var14] >> 16) + field_q[var14]);
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
              if (((ve) this).field_l[var11] != 0) {
                field_a[var11] = 0;
                field_e[var11] = (int)((double)((ve) this).field_k[var11] * var3);
                field_f[var11] = (((ve) this).field_l[var11] << 14) / 100;
                field_g[var11] = (int)((double)(((ve) this).field_n.field_g - ((ve) this).field_n.field_d) * 32.768 * Math.pow(1.0057929410678534, (double)((ve) this).field_w[var11]) / var3);
                field_q[var11] = (int)((double)((ve) this).field_n.field_d * 32.768 / var3);
                var11++;
                continue L2;
              } else {
                var11++;
                continue L2;
              }
            }
          }
        } else {
          return field_o;
        }
    }

    public static void a() {
        field_o = null;
        field_m = null;
        field_h = null;
        field_a = null;
        field_e = null;
        field_f = null;
        field_g = null;
        field_q = null;
    }

    private final int a(int param0, int param1, int param2) {
        if (param2 == 1) {
            if ((param0 & 32767) < 16384) {
                return param1;
            }
            return -param1;
        }
        if (param2 == 2) {
            return field_h[param0 & 32767] * param1 >> 14;
        }
        if (param2 == 3) {
            return ((param0 & 32767) * param1 >> 14) - param1;
        }
        if (param2 == 4) {
            return field_m[param0 / 2607 & 32767] * param1;
        }
        return 0;
    }

    final void a(de param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          ((ve) this).field_n = new ko();
          ((ve) this).field_n.b(param0);
          ((ve) this).field_v = new ko();
          ((ve) this).field_v.b(param0);
          var2 = param0.d((byte) -117);
          if (var2 == 0) {
            break L0;
          } else {
            param0.field_j = param0.field_j - 1;
            ((ve) this).field_p = new ko();
            ((ve) this).field_p.b(param0);
            ((ve) this).field_c = new ko();
            ((ve) this).field_c.b(param0);
            break L0;
          }
        }
        L1: {
          var2 = param0.d((byte) -122);
          if (var2 == 0) {
            break L1;
          } else {
            param0.field_j = param0.field_j - 1;
            ((ve) this).field_d = new ko();
            ((ve) this).field_d.b(param0);
            ((ve) this).field_u = new ko();
            ((ve) this).field_u.b(param0);
            break L1;
          }
        }
        L2: {
          var2 = param0.d((byte) -121);
          if (var2 == 0) {
            break L2;
          } else {
            param0.field_j = param0.field_j - 1;
            ((ve) this).field_t = new ko();
            ((ve) this).field_t.b(param0);
            ((ve) this).field_r = new ko();
            ((ve) this).field_r.b(param0);
            break L2;
          }
        }
        var3 = 0;
        L3: while (true) {
          L4: {
            if (var3 >= 10) {
              break L4;
            } else {
              var4 = param0.c((byte) -107);
              if (var4 != 0) {
                ((ve) this).field_l[var3] = var4;
                ((ve) this).field_w[var3] = param0.f((byte) 102);
                ((ve) this).field_k[var3] = param0.c((byte) -107);
                var3++;
                continue L3;
              } else {
                break L4;
              }
            }
          }
          ((ve) this).field_j = param0.c((byte) -107);
          ((ve) this).field_x = param0.c((byte) -107);
          ((ve) this).field_y = param0.f(2);
          ((ve) this).field_b = param0.f(2);
          ((ve) this).field_s = new ie();
          ((ve) this).field_i = new ko();
          ((ve) this).field_s.a(param0, ((ve) this).field_i);
          return;
        }
    }

    ve() {
        ((ve) this).field_k = new int[]{0, 0, 0, 0, 0};
        ((ve) this).field_l = new int[]{0, 0, 0, 0, 0};
        ((ve) this).field_b = 0;
        ((ve) this).field_j = 0;
        ((ve) this).field_w = new int[]{0, 0, 0, 0, 0};
        ((ve) this).field_y = 500;
        ((ve) this).field_x = 100;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var1 = 0;
        field_m = new int[32768];
        Random var0 = new Random(0L);
        for (var1 = 0; var1 < 32768; var1++) {
            field_m[var1] = (var0.nextInt() & 2) - 1;
        }
        field_h = new int[32768];
        for (var1 = 0; var1 < 32768; var1++) {
            field_h[var1] = (int)(Math.sin((double)var1 / 5215.1903) * 16384.0);
        }
        field_o = new int[220500];
        field_e = new int[5];
        field_g = new int[5];
        field_a = new int[5];
        field_f = new int[5];
        field_q = new int[5];
    }
}
