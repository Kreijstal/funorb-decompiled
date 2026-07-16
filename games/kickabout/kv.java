/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class kv {
    private fq field_e;
    private static int[] field_i;
    private fq field_h;
    private int[] field_m;
    private static int[] field_x;
    private as field_c;
    private static int[] field_d;
    private int[] field_v;
    private fq field_t;
    int field_w;
    int field_y;
    private fq field_u;
    private fq field_r;
    private int[] field_p;
    private int field_n;
    private fq field_b;
    private fq field_j;
    private int field_l;
    private fq field_q;
    private static int[] field_f;
    private static int[] field_k;
    private static int[] field_s;
    private static int[] field_o;
    private static int[] field_g;
    private fq field_a;

    final void a(iw param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          ((kv) this).field_u = new fq();
          ((kv) this).field_u.a(param0);
          ((kv) this).field_b = new fq();
          ((kv) this).field_b.a(param0);
          var2 = param0.h((byte) -113);
          if (var2 == 0) {
            break L0;
          } else {
            param0.field_n = param0.field_n - 1;
            ((kv) this).field_j = new fq();
            ((kv) this).field_j.a(param0);
            ((kv) this).field_a = new fq();
            ((kv) this).field_a.a(param0);
            break L0;
          }
        }
        L1: {
          var2 = param0.h((byte) -106);
          if (var2 == 0) {
            break L1;
          } else {
            param0.field_n = param0.field_n - 1;
            ((kv) this).field_h = new fq();
            ((kv) this).field_h.a(param0);
            ((kv) this).field_r = new fq();
            ((kv) this).field_r.a(param0);
            break L1;
          }
        }
        L2: {
          var2 = param0.h((byte) -119);
          if (var2 == 0) {
            break L2;
          } else {
            param0.field_n = param0.field_n - 1;
            ((kv) this).field_e = new fq();
            ((kv) this).field_e.a(param0);
            ((kv) this).field_t = new fq();
            ((kv) this).field_t.a(param0);
            break L2;
          }
        }
        var3 = 0;
        L3: while (true) {
          L4: {
            if (var3 >= 10) {
              break L4;
            } else {
              var4 = param0.f(-32768);
              if (var4 != 0) {
                ((kv) this).field_v[var3] = var4;
                ((kv) this).field_p[var3] = param0.e(-121);
                ((kv) this).field_m[var3] = param0.f(-32768);
                var3++;
                continue L3;
              } else {
                break L4;
              }
            }
          }
          ((kv) this).field_l = param0.f(-32768);
          ((kv) this).field_n = param0.f(-32768);
          ((kv) this).field_w = param0.a((byte) 81);
          ((kv) this).field_y = param0.a((byte) 81);
          ((kv) this).field_c = new as();
          ((kv) this).field_q = new fq();
          ((kv) this).field_c.a(param0, ((kv) this).field_q);
          return;
        }
    }

    public static void a() {
        field_d = null;
        field_i = null;
        field_x = null;
        field_s = null;
        field_o = null;
        field_k = null;
        field_g = null;
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
        dv.a(field_d, 0, param0);
        if (param1 >= 10) {
          L0: {
            var3 = (double)param0 / ((double)param1 + 0.0);
            ((kv) this).field_u.a();
            ((kv) this).field_b.a();
            var5 = 0;
            var6 = 0;
            var7 = 0;
            if (((kv) this).field_j == null) {
              break L0;
            } else {
              ((kv) this).field_j.a();
              ((kv) this).field_a.a();
              var5 = (int)((double)(((kv) this).field_j.field_j - ((kv) this).field_j.field_b) * 32.768 / var3);
              var6 = (int)((double)((kv) this).field_j.field_b * 32.768 / var3);
              break L0;
            }
          }
          L1: {
            var8 = 0;
            var9 = 0;
            var10 = 0;
            if (((kv) this).field_h == null) {
              break L1;
            } else {
              ((kv) this).field_h.a();
              ((kv) this).field_r.a();
              var8 = (int)((double)(((kv) this).field_h.field_j - ((kv) this).field_h.field_b) * 32.768 / var3);
              var9 = (int)((double)((kv) this).field_h.field_b * 32.768 / var3);
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
                    if (((kv) this).field_e == null) {
                      break L4;
                    } else {
                      ((kv) this).field_e.a();
                      ((kv) this).field_t.a();
                      var11 = 0;
                      var12 = 0;
                      var13 = 1;
                      var14 = 0;
                      L5: while (true) {
                        if (var14 >= param0) {
                          break L4;
                        } else {
                          L6: {
                            var15 = ((kv) this).field_e.a(param0);
                            var16 = ((kv) this).field_t.a(param0);
                            if (var13 == 0) {
                              var12 = ((kv) this).field_e.field_b + ((((kv) this).field_e.field_j - ((kv) this).field_e.field_b) * var16 >> 8);
                              break L6;
                            } else {
                              var12 = ((kv) this).field_e.field_b + ((((kv) this).field_e.field_j - ((kv) this).field_e.field_b) * var15 >> 8);
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
                            field_d[var14] = 0;
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
                    if (((kv) this).field_l <= 0) {
                      break L9;
                    } else {
                      if (((kv) this).field_n <= 0) {
                        break L9;
                      } else {
                        var11 = (int)((double)((kv) this).field_l * var3);
                        var12 = var11;
                        L10: while (true) {
                          if (var12 >= param0) {
                            break L9;
                          } else {
                            field_d[var12] = field_d[var12] + field_d[var12 - var11] * ((kv) this).field_n / 100;
                            var12++;
                            continue L10;
                          }
                        }
                      }
                    }
                  }
                  L11: {
                    L12: {
                      if (((kv) this).field_c.field_h[0] > 0) {
                        break L12;
                      } else {
                        if (((kv) this).field_c.field_h[1] <= 0) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    ((kv) this).field_q.a();
                    var11 = ((kv) this).field_q.a(param0 + 1);
                    var12 = ((kv) this).field_c.a(0, (float)var11 / 65536.0f);
                    var13 = ((kv) this).field_c.a(1, (float)var11 / 65536.0f);
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
                                  var12 = ((kv) this).field_c.a(0, (float)var11 / 65536.0f);
                                  var13 = ((kv) this).field_c.a(1, (float)var11 / 65536.0f);
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
                                              field_d[var14] = var16;
                                              var11 = ((kv) this).field_q.a(param0 + 1);
                                              var14++;
                                              continue L18;
                                            } else {
                                              var16 = var16 - (int)((long)field_d[var14 - 1 - var17] * (long)as.field_b[1][var17] >> 16);
                                              var17++;
                                              continue L20;
                                            }
                                          }
                                        } else {
                                          var16 = var16 + (int)((long)field_d[var14 + var12 - 1 - var17] * (long)as.field_b[0][var17] >> 16);
                                          var17++;
                                          continue L19;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                var16 = (int)((long)field_d[var14 + var12] * (long)as.field_g >> 16);
                                var17 = 0;
                                L21: while (true) {
                                  if (var17 >= var12) {
                                    var17 = 0;
                                    L22: while (true) {
                                      if (var17 >= var13) {
                                        field_d[var14] = var16;
                                        var11 = ((kv) this).field_q.a(param0 + 1);
                                        var14++;
                                        continue L17;
                                      } else {
                                        var16 = var16 - (int)((long)field_d[var14 - 1 - var17] * (long)as.field_b[1][var17] >> 16);
                                        var17++;
                                        continue L22;
                                      }
                                    }
                                  } else {
                                    var16 = var16 + (int)((long)field_d[var14 + var12 - 1 - var17] * (long)as.field_b[0][var17] >> 16);
                                    var17++;
                                    continue L21;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var16 = (int)((long)field_d[var14 + var12] * (long)as.field_g >> 16);
                          var17 = 0;
                          L23: while (true) {
                            if (var17 >= var12) {
                              var17 = 0;
                              L24: while (true) {
                                if (var17 >= var14) {
                                  field_d[var14] = var16;
                                  var11 = ((kv) this).field_q.a(param0 + 1);
                                  var14++;
                                  continue L14;
                                } else {
                                  var16 = var16 - (int)((long)field_d[var14 - 1 - var17] * (long)as.field_b[1][var17] >> 16);
                                  var17++;
                                  continue L24;
                                }
                              }
                            } else {
                              var16 = var16 + (int)((long)field_d[var14 + var12 - 1 - var17] * (long)as.field_b[0][var17] >> 16);
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
                      return field_d;
                    } else {
                      L26: {
                        if (field_d[var11] >= -32768) {
                          break L26;
                        } else {
                          field_d[var11] = -32768;
                          break L26;
                        }
                      }
                      if (field_d[var11] > 32767) {
                        field_d[var11] = 32767;
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
                    var12 = ((kv) this).field_u.a(param0);
                    var13 = ((kv) this).field_b.a(param0);
                    if (((kv) this).field_j == null) {
                      break L27;
                    } else {
                      var14 = ((kv) this).field_j.a(param0);
                      var15 = ((kv) this).field_a.a(param0);
                      var12 = var12 + (this.a(var7, var15, ((kv) this).field_j.field_g) >> 1);
                      var7 = var7 + ((var14 * var5 >> 16) + var6);
                      break L27;
                    }
                  }
                  L28: {
                    if (((kv) this).field_h == null) {
                      break L28;
                    } else {
                      var14 = ((kv) this).field_h.a(param0);
                      var15 = ((kv) this).field_r.a(param0);
                      var13 = var13 * ((this.a(var10, var15, ((kv) this).field_h.field_g) >> 1) + 32768) >> 15;
                      var10 = var10 + ((var14 * var8 >> 16) + var9);
                      break L28;
                    }
                  }
                  var14 = 0;
                  L29: while (true) {
                    if (var14 < 5) {
                      if (((kv) this).field_v[var14] != 0) {
                        var15 = var11 + field_o[var14];
                        if (var15 < param0) {
                          field_d[var15] = field_d[var15] + this.a(field_s[var14], var13 * field_k[var14] >> 15, ((kv) this).field_u.field_g);
                          field_s[var14] = field_s[var14] + ((var12 * field_g[var14] >> 16) + field_f[var14]);
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
              if (((kv) this).field_v[var11] != 0) {
                field_s[var11] = 0;
                field_o[var11] = (int)((double)((kv) this).field_m[var11] * var3);
                field_k[var11] = (((kv) this).field_v[var11] << 14) / 100;
                field_g[var11] = (int)((double)(((kv) this).field_u.field_j - ((kv) this).field_u.field_b) * 32.768 * Math.pow(1.0057929410678534, (double)((kv) this).field_p[var11]) / var3);
                field_f[var11] = (int)((double)((kv) this).field_u.field_b * 32.768 / var3);
                var11++;
                continue L2;
              } else {
                var11++;
                continue L2;
              }
            }
          }
        } else {
          return field_d;
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
            return field_x[param0 & 32767] * param1 >> 14;
        }
        if (param2 == 3) {
            return ((param0 & 32767) * param1 >> 14) - param1;
        }
        if (param2 == 4) {
            return field_i[param0 / 2607 & 32767] * param1;
        }
        return 0;
    }

    kv() {
        ((kv) this).field_m = new int[]{0, 0, 0, 0, 0};
        ((kv) this).field_w = 500;
        ((kv) this).field_p = new int[]{0, 0, 0, 0, 0};
        ((kv) this).field_n = 100;
        ((kv) this).field_v = new int[]{0, 0, 0, 0, 0};
        ((kv) this).field_l = 0;
        ((kv) this).field_y = 0;
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
        field_x = new int[32768];
        for (var1 = 0; var1 < 32768; var1++) {
            field_x[var1] = (int)(Math.sin((double)var1 / 5215.1903) * 16384.0);
        }
        field_d = new int[220500];
        field_k = new int[5];
        field_f = new int[5];
        field_s = new int[5];
        field_g = new int[5];
        field_o = new int[5];
    }
}
