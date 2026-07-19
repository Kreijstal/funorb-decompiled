/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class rh {
    int field_h;
    private pe field_q;
    private int[] field_k;
    private pe field_s;
    private pe field_x;
    private int field_t;
    private pe field_r;
    private int[] field_u;
    private static int[] field_o;
    private pe field_f;
    private static int[] field_c;
    private pe field_a;
    private int field_w;
    private uh field_j;
    private int[] field_y;
    private pe field_l;
    private pe field_e;
    int field_b;
    private static int[] field_i;
    private pe field_d;
    private static int[] field_g;
    private static int[] field_m;
    private static int[] field_v;
    private static int[] field_p;
    private static int[] field_n;

    final void a(k param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          this.field_d = new pe();
          this.field_d.b(param0);
          this.field_f = new pe();
          this.field_f.b(param0);
          var2 = param0.g(31365);
          if (var2 == 0) {
            break L0;
          } else {
            param0.field_j = param0.field_j - 1;
            this.field_r = new pe();
            this.field_r.b(param0);
            this.field_l = new pe();
            this.field_l.b(param0);
            break L0;
          }
        }
        L1: {
          var2 = param0.g(31365);
          if (var2 == 0) {
            break L1;
          } else {
            param0.field_j = param0.field_j - 1;
            this.field_e = new pe();
            this.field_e.b(param0);
            this.field_s = new pe();
            this.field_s.b(param0);
            break L1;
          }
        }
        L2: {
          var2 = param0.g(31365);
          if (var2 == 0) {
            break L2;
          } else {
            param0.field_j = param0.field_j - 1;
            this.field_a = new pe();
            this.field_a.b(param0);
            this.field_x = new pe();
            this.field_x.b(param0);
            break L2;
          }
        }
        var3 = 0;
        L3: while (true) {
          L4: {
            if (var3 >= 10) {
              break L4;
            } else {
              var4 = param0.h((byte) -116);
              if (var4 != 0) {
                this.field_y[var3] = var4;
                this.field_k[var3] = param0.h(22219);
                this.field_u[var3] = param0.h((byte) -127);
                var3++;
                continue L3;
              } else {
                break L4;
              }
            }
          }
          this.field_w = param0.h((byte) -119);
          this.field_t = param0.h((byte) -107);
          this.field_b = param0.d((byte) 69);
          this.field_h = param0.d((byte) 69);
          this.field_j = new uh();
          this.field_q = new pe();
          this.field_j.a(param0, this.field_q);
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
            return field_o[param0 & 32767] * param1 >> 14;
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
        d.a(field_c, 0, param0);
        if (param1 >= 10) {
          L0: {
            var3 = (double)param0 / ((double)param1 + 0.0);
            this.field_d.a();
            this.field_f.a();
            var5 = 0;
            var6 = 0;
            var7 = 0;
            if (this.field_r == null) {
              break L0;
            } else {
              this.field_r.a();
              this.field_l.a();
              var5 = (int)((double)(this.field_r.field_g - this.field_r.field_h) * 32.768 / var3);
              var6 = (int)((double)this.field_r.field_h * 32.768 / var3);
              break L0;
            }
          }
          L1: {
            var8 = 0;
            var9 = 0;
            var10 = 0;
            if (this.field_e == null) {
              break L1;
            } else {
              this.field_e.a();
              this.field_s.a();
              var8 = (int)((double)(this.field_e.field_g - this.field_e.field_h) * 32.768 / var3);
              var9 = (int)((double)this.field_e.field_h * 32.768 / var3);
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
                    if (this.field_a == null) {
                      break L4;
                    } else {
                      this.field_a.a();
                      this.field_x.a();
                      var11 = 0;
                      var12 = 0;
                      var13 = 1;
                      var14 = 0;
                      L5: while (true) {
                        if (var14 >= param0) {
                          break L4;
                        } else {
                          L6: {
                            var15 = this.field_a.a(param0);
                            var16 = this.field_x.a(param0);
                            if (var13 == 0) {
                              var12 = this.field_a.field_h + ((this.field_a.field_g - this.field_a.field_h) * var16 >> 8);
                              break L6;
                            } else {
                              var12 = this.field_a.field_h + ((this.field_a.field_g - this.field_a.field_h) * var15 >> 8);
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
                            field_c[var14] = 0;
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
                    if (this.field_w <= 0) {
                      break L9;
                    } else {
                      if (this.field_t <= 0) {
                        break L9;
                      } else {
                        var11 = (int)((double)this.field_w * var3);
                        var12 = var11;
                        L10: while (true) {
                          if (var12 >= param0) {
                            break L9;
                          } else {
                            field_c[var12] = field_c[var12] + field_c[var12 - var11] * this.field_t / 100;
                            var12++;
                            continue L10;
                          }
                        }
                      }
                    }
                  }
                  L11: {
                    L12: {
                      if (this.field_j.field_c[0] > 0) {
                        break L12;
                      } else {
                        if (this.field_j.field_c[1] <= 0) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    this.field_q.a();
                    var11 = this.field_q.a(param0 + 1);
                    var12 = this.field_j.a(0, (float)var11 / 65536.0f);
                    var13 = this.field_j.a(1, (float)var11 / 65536.0f);
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
                                  var12 = this.field_j.a(0, (float)var11 / 65536.0f);
                                  var13 = this.field_j.a(1, (float)var11 / 65536.0f);
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
                                              field_c[var14] = var16;
                                              var11 = this.field_q.a(param0 + 1);
                                              var14++;
                                              continue L18;
                                            } else {
                                              var16 = var16 - (int)((long)field_c[var14 - 1 - var17] * (long)uh.field_e[1][var17] >> 16);
                                              var17++;
                                              continue L20;
                                            }
                                          }
                                        } else {
                                          var16 = var16 + (int)((long)field_c[var14 + var12 - 1 - var17] * (long)uh.field_e[0][var17] >> 16);
                                          var17++;
                                          continue L19;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                var16 = (int)((long)field_c[var14 + var12] * (long)uh.field_g >> 16);
                                var17 = 0;
                                L21: while (true) {
                                  if (var17 >= var12) {
                                    var17 = 0;
                                    L22: while (true) {
                                      if (var17 >= var13) {
                                        field_c[var14] = var16;
                                        var11 = this.field_q.a(param0 + 1);
                                        var14++;
                                        continue L17;
                                      } else {
                                        var16 = var16 - (int)((long)field_c[var14 - 1 - var17] * (long)uh.field_e[1][var17] >> 16);
                                        var17++;
                                        continue L22;
                                      }
                                    }
                                  } else {
                                    var16 = var16 + (int)((long)field_c[var14 + var12 - 1 - var17] * (long)uh.field_e[0][var17] >> 16);
                                    var17++;
                                    continue L21;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var16 = (int)((long)field_c[var14 + var12] * (long)uh.field_g >> 16);
                          var17 = 0;
                          L23: while (true) {
                            if (var17 >= var12) {
                              var17 = 0;
                              L24: while (true) {
                                if (var17 >= var14) {
                                  field_c[var14] = var16;
                                  var11 = this.field_q.a(param0 + 1);
                                  var14++;
                                  continue L14;
                                } else {
                                  var16 = var16 - (int)((long)field_c[var14 - 1 - var17] * (long)uh.field_e[1][var17] >> 16);
                                  var17++;
                                  continue L24;
                                }
                              }
                            } else {
                              var16 = var16 + (int)((long)field_c[var14 + var12 - 1 - var17] * (long)uh.field_e[0][var17] >> 16);
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
                      return field_c;
                    } else {
                      L26: {
                        if (field_c[var11] >= -32768) {
                          break L26;
                        } else {
                          field_c[var11] = -32768;
                          break L26;
                        }
                      }
                      if (field_c[var11] > 32767) {
                        field_c[var11] = 32767;
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
                    var12 = this.field_d.a(param0);
                    var13 = this.field_f.a(param0);
                    if (this.field_r == null) {
                      break L27;
                    } else {
                      var14 = this.field_r.a(param0);
                      var15 = this.field_l.a(param0);
                      var12 = var12 + (this.a(var7, var15, this.field_r.field_e) >> 1);
                      var7 = var7 + ((var14 * var5 >> 16) + var6);
                      break L27;
                    }
                  }
                  L28: {
                    if (this.field_e == null) {
                      break L28;
                    } else {
                      var14 = this.field_e.a(param0);
                      var15 = this.field_s.a(param0);
                      var13 = var13 * ((this.a(var10, var15, this.field_e.field_e) >> 1) + 32768) >> 15;
                      var10 = var10 + ((var14 * var8 >> 16) + var9);
                      break L28;
                    }
                  }
                  var14 = 0;
                  L29: while (true) {
                    if (var14 < 5) {
                      if (this.field_y[var14] != 0) {
                        var15 = var11 + field_g[var14];
                        if (var15 < param0) {
                          field_c[var15] = field_c[var15] + this.a(field_v[var14], var13 * field_n[var14] >> 15, this.field_d.field_e);
                          field_v[var14] = field_v[var14] + ((var12 * field_p[var14] >> 16) + field_m[var14]);
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
              if (this.field_y[var11] != 0) {
                field_v[var11] = 0;
                field_g[var11] = (int)((double)this.field_u[var11] * var3);
                field_n[var11] = (this.field_y[var11] << 14) / 100;
                field_p[var11] = (int)((double)(this.field_d.field_g - this.field_d.field_h) * 32.768 * Math.pow(1.0057929410678534, (double)this.field_k[var11]) / var3);
                field_m[var11] = (int)((double)this.field_d.field_h * 32.768 / var3);
                var11++;
                continue L2;
              } else {
                var11++;
                continue L2;
              }
            }
          }
        } else {
          return field_c;
        }
    }

    rh() {
        this.field_k = new int[]{0, 0, 0, 0, 0};
        this.field_t = 100;
        this.field_h = 0;
        this.field_u = new int[]{0, 0, 0, 0, 0};
        this.field_w = 0;
        this.field_b = 500;
        this.field_y = new int[]{0, 0, 0, 0, 0};
    }

    public static void a() {
        field_c = null;
        field_i = null;
        field_o = null;
        field_v = null;
        field_g = null;
        field_n = null;
        field_p = null;
        field_m = null;
    }

    static {
        int var1 = 0;
        field_i = new int[32768];
        Random var0 = new Random(0L);
        for (var1 = 0; var1 < 32768; var1++) {
            field_i[var1] = (var0.nextInt() & 2) - 1;
        }
        field_o = new int[32768];
        for (var1 = 0; var1 < 32768; var1++) {
            field_o[var1] = (int)(Math.sin((double)var1 / 5215.1903) * 16384.0);
        }
        field_c = new int[220500];
        field_g = new int[5];
        field_v = new int[5];
        field_m = new int[5];
        field_p = new int[5];
        field_n = new int[5];
    }
}
