/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ed {
    private static int[] field_b;
    private int[] field_x;
    private uc field_t;
    private uc field_q;
    private ub field_e;
    private uc field_o;
    private uc field_y;
    private int[] field_j;
    private int field_h;
    private uc field_u;
    private uc field_k;
    private uc field_w;
    private static int[] field_g;
    int field_d;
    private int[] field_a;
    private uc field_n;
    private int field_r;
    private uc field_m;
    int field_v;
    private static int[] field_f;
    private static int[] field_p;
    private static int[] field_s;
    private static int[] field_i;
    private static int[] field_l;
    private static int[] field_c;

    public static void a() {
        field_f = null;
        field_b = null;
        field_g = null;
        field_i = null;
        field_s = null;
        field_l = null;
        field_c = null;
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
            return field_g[param0 & 32767] * param1 >> 14;
        }
        if (param2 == 3) {
            return ((param0 & 32767) * param1 >> 14) - param1;
        }
        if (param2 == 4) {
            return field_b[param0 / 2607 & 32767] * param1;
        }
        return 0;
    }

    final void a(qc param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          this.field_t = new uc();
          this.field_t.a(param0);
          this.field_o = new uc();
          this.field_o.a(param0);
          var2 = param0.c((byte) 34);
          if (var2 == 0) {
            break L0;
          } else {
            param0.field_f = param0.field_f - 1;
            this.field_y = new uc();
            this.field_y.a(param0);
            this.field_w = new uc();
            this.field_w.a(param0);
            break L0;
          }
        }
        L1: {
          var2 = param0.c((byte) 34);
          if (var2 == 0) {
            break L1;
          } else {
            param0.field_f = param0.field_f - 1;
            this.field_u = new uc();
            this.field_u.a(param0);
            this.field_n = new uc();
            this.field_n.a(param0);
            break L1;
          }
        }
        L2: {
          var2 = param0.c((byte) 34);
          if (var2 == 0) {
            break L2;
          } else {
            param0.field_f = param0.field_f - 1;
            this.field_q = new uc();
            this.field_q.a(param0);
            this.field_m = new uc();
            this.field_m.a(param0);
            break L2;
          }
        }
        var3 = 0;
        L3: while (true) {
          L4: {
            if (var3 >= 10) {
              break L4;
            } else {
              var4 = param0.c(1);
              if (var4 != 0) {
                this.field_a[var3] = var4;
                this.field_j[var3] = param0.h(-125);
                this.field_x[var3] = param0.c(1);
                var3++;
                continue L3;
              } else {
                break L4;
              }
            }
          }
          this.field_h = param0.c(1);
          this.field_r = param0.c(1);
          this.field_d = param0.b(true);
          this.field_v = param0.b(true);
          this.field_e = new ub();
          this.field_k = new uc();
          this.field_e.a(param0, this.field_k);
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
        sf.a(field_f, 0, param0);
        if (param1 >= 10) {
          L0: {
            var3 = (double)param0 / ((double)param1 + 0.0);
            this.field_t.a();
            this.field_o.a();
            var5 = 0;
            var6 = 0;
            var7 = 0;
            if (this.field_y == null) {
              break L0;
            } else {
              this.field_y.a();
              this.field_w.a();
              var5 = (int)((double)(this.field_y.field_g - this.field_y.field_j) * 32.768 / var3);
              var6 = (int)((double)this.field_y.field_j * 32.768 / var3);
              break L0;
            }
          }
          L1: {
            var8 = 0;
            var9 = 0;
            var10 = 0;
            if (this.field_u == null) {
              break L1;
            } else {
              this.field_u.a();
              this.field_n.a();
              var8 = (int)((double)(this.field_u.field_g - this.field_u.field_j) * 32.768 / var3);
              var9 = (int)((double)this.field_u.field_j * 32.768 / var3);
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
                    if (this.field_q == null) {
                      break L4;
                    } else {
                      this.field_q.a();
                      this.field_m.a();
                      var11 = 0;
                      var12 = 0;
                      var13 = 1;
                      var14 = 0;
                      L5: while (true) {
                        if (var14 >= param0) {
                          break L4;
                        } else {
                          L6: {
                            var15 = this.field_q.a(param0);
                            var16 = this.field_m.a(param0);
                            if (var13 == 0) {
                              var12 = this.field_q.field_j + ((this.field_q.field_g - this.field_q.field_j) * var16 >> 8);
                              break L6;
                            } else {
                              var12 = this.field_q.field_j + ((this.field_q.field_g - this.field_q.field_j) * var15 >> 8);
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
                    if (this.field_h <= 0) {
                      break L9;
                    } else {
                      if (this.field_r <= 0) {
                        break L9;
                      } else {
                        var11 = (int)((double)this.field_h * var3);
                        var12 = var11;
                        L10: while (true) {
                          if (var12 >= param0) {
                            break L9;
                          } else {
                            field_f[var12] = field_f[var12] + field_f[var12 - var11] * this.field_r / 100;
                            var12++;
                            continue L10;
                          }
                        }
                      }
                    }
                  }
                  L11: {
                    L12: {
                      if (this.field_e.field_b[0] > 0) {
                        break L12;
                      } else {
                        if (this.field_e.field_b[1] <= 0) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    this.field_k.a();
                    var11 = this.field_k.a(param0 + 1);
                    var12 = this.field_e.a(0, (float)var11 / 65536.0f);
                    var13 = this.field_e.a(1, (float)var11 / 65536.0f);
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
                                  var12 = this.field_e.a(0, (float)var11 / 65536.0f);
                                  var13 = this.field_e.a(1, (float)var11 / 65536.0f);
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
                                              field_f[var14] = var16;
                                              var11 = this.field_k.a(param0 + 1);
                                              var14++;
                                              continue L18;
                                            } else {
                                              var16 = var16 - (int)((long)field_f[var14 - 1 - var17] * (long)ub.field_g[1][var17] >> 16);
                                              var17++;
                                              continue L20;
                                            }
                                          }
                                        } else {
                                          var16 = var16 + (int)((long)field_f[var14 + var12 - 1 - var17] * (long)ub.field_g[0][var17] >> 16);
                                          var17++;
                                          continue L19;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                var16 = (int)((long)field_f[var14 + var12] * (long)ub.field_a >> 16);
                                var17 = 0;
                                L21: while (true) {
                                  if (var17 >= var12) {
                                    var17 = 0;
                                    L22: while (true) {
                                      if (var17 >= var13) {
                                        field_f[var14] = var16;
                                        var11 = this.field_k.a(param0 + 1);
                                        var14++;
                                        continue L17;
                                      } else {
                                        var16 = var16 - (int)((long)field_f[var14 - 1 - var17] * (long)ub.field_g[1][var17] >> 16);
                                        var17++;
                                        continue L22;
                                      }
                                    }
                                  } else {
                                    var16 = var16 + (int)((long)field_f[var14 + var12 - 1 - var17] * (long)ub.field_g[0][var17] >> 16);
                                    var17++;
                                    continue L21;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var16 = (int)((long)field_f[var14 + var12] * (long)ub.field_a >> 16);
                          var17 = 0;
                          L23: while (true) {
                            if (var17 >= var12) {
                              var17 = 0;
                              L24: while (true) {
                                if (var17 >= var14) {
                                  field_f[var14] = var16;
                                  var11 = this.field_k.a(param0 + 1);
                                  var14++;
                                  continue L14;
                                } else {
                                  var16 = var16 - (int)((long)field_f[var14 - 1 - var17] * (long)ub.field_g[1][var17] >> 16);
                                  var17++;
                                  continue L24;
                                }
                              }
                            } else {
                              var16 = var16 + (int)((long)field_f[var14 + var12 - 1 - var17] * (long)ub.field_g[0][var17] >> 16);
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
                    var12 = this.field_t.a(param0);
                    var13 = this.field_o.a(param0);
                    if (this.field_y == null) {
                      break L27;
                    } else {
                      var14 = this.field_y.a(param0);
                      var15 = this.field_w.a(param0);
                      var12 = var12 + (this.a(var7, var15, this.field_y.field_e) >> 1);
                      var7 = var7 + ((var14 * var5 >> 16) + var6);
                      break L27;
                    }
                  }
                  L28: {
                    if (this.field_u == null) {
                      break L28;
                    } else {
                      var14 = this.field_u.a(param0);
                      var15 = this.field_n.a(param0);
                      var13 = var13 * ((this.a(var10, var15, this.field_u.field_e) >> 1) + 32768) >> 15;
                      var10 = var10 + ((var14 * var8 >> 16) + var9);
                      break L28;
                    }
                  }
                  var14 = 0;
                  L29: while (true) {
                    if (var14 < 5) {
                      if (this.field_a[var14] != 0) {
                        var15 = var11 + field_s[var14];
                        if (var15 < param0) {
                          field_f[var15] = field_f[var15] + this.a(field_i[var14], var13 * field_l[var14] >> 15, this.field_t.field_e);
                          field_i[var14] = field_i[var14] + ((var12 * field_c[var14] >> 16) + field_p[var14]);
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
              if (this.field_a[var11] != 0) {
                field_i[var11] = 0;
                field_s[var11] = (int)((double)this.field_x[var11] * var3);
                field_l[var11] = (this.field_a[var11] << 14) / 100;
                field_c[var11] = (int)((double)(this.field_t.field_g - this.field_t.field_j) * 32.768 * Math.pow(1.0057929410678534, (double)this.field_j[var11]) / var3);
                field_p[var11] = (int)((double)this.field_t.field_j * 32.768 / var3);
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

    ed() {
        this.field_x = new int[]{0, 0, 0, 0, 0};
        this.field_h = 0;
        this.field_j = new int[]{0, 0, 0, 0, 0};
        this.field_a = new int[]{0, 0, 0, 0, 0};
        this.field_r = 100;
        this.field_d = 500;
        this.field_v = 0;
    }

    static {
        int var1 = 0;
        field_b = new int[32768];
        Random var0 = new Random(0L);
        for (var1 = 0; var1 < 32768; var1++) {
            field_b[var1] = (var0.nextInt() & 2) - 1;
        }
        field_g = new int[32768];
        for (var1 = 0; var1 < 32768; var1++) {
            field_g[var1] = (int)(Math.sin((double)var1 / 5215.1903) * 16384.0);
        }
        field_f = new int[220500];
        field_p = new int[5];
        field_i = new int[5];
        field_l = new int[5];
        field_s = new int[5];
        field_c = new int[5];
    }
}
