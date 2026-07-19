/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class og {
    private ll field_w;
    private ll field_e;
    private ll field_g;
    private gn field_l;
    private ll field_a;
    int field_u;
    private ll field_j;
    private ll field_t;
    private int[] field_b;
    private static int[] field_v;
    private int[] field_s;
    int field_m;
    private static int[] field_i;
    private ll field_k;
    private int field_x;
    private int field_o;
    private static int[] field_h;
    private int[] field_r;
    private ll field_c;
    private ll field_f;
    private static int[] field_q;
    private static int[] field_p;
    private static int[] field_d;
    private static int[] field_n;
    private static int[] field_y;

    private final int a(int param0, int param1, int param2) {
        if (param2 == 1) {
            if ((param0 & 32767) < 16384) {
                return param1;
            }
            return -param1;
        }
        if (param2 == 2) {
            return field_v[param0 & 32767] * param1 >> 14;
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
        ne.a(field_h, 0, param0);
        if (param1 >= 10) {
          L0: {
            var3 = (double)param0 / ((double)param1 + 0.0);
            this.field_g.a();
            this.field_f.a();
            var5 = 0;
            var6 = 0;
            var7 = 0;
            if (this.field_t == null) {
              break L0;
            } else {
              this.field_t.a();
              this.field_w.a();
              var5 = (int)((double)(this.field_t.field_f - this.field_t.field_a) * 32.768 / var3);
              var6 = (int)((double)this.field_t.field_a * 32.768 / var3);
              break L0;
            }
          }
          L1: {
            var8 = 0;
            var9 = 0;
            var10 = 0;
            if (this.field_c == null) {
              break L1;
            } else {
              this.field_c.a();
              this.field_k.a();
              var8 = (int)((double)(this.field_c.field_f - this.field_c.field_a) * 32.768 / var3);
              var9 = (int)((double)this.field_c.field_a * 32.768 / var3);
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
                    if (this.field_j == null) {
                      break L4;
                    } else {
                      this.field_j.a();
                      this.field_e.a();
                      var11 = 0;
                      var12 = 0;
                      var13 = 1;
                      var14 = 0;
                      L5: while (true) {
                        if (var14 >= param0) {
                          break L4;
                        } else {
                          L6: {
                            var15 = this.field_j.a(param0);
                            var16 = this.field_e.a(param0);
                            if (var13 == 0) {
                              var12 = this.field_j.field_a + ((this.field_j.field_f - this.field_j.field_a) * var16 >> 8);
                              break L6;
                            } else {
                              var12 = this.field_j.field_a + ((this.field_j.field_f - this.field_j.field_a) * var15 >> 8);
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
                            field_h[var14] = 0;
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
                    if (this.field_o <= 0) {
                      break L9;
                    } else {
                      if (this.field_x <= 0) {
                        break L9;
                      } else {
                        var11 = (int)((double)this.field_o * var3);
                        var12 = var11;
                        L10: while (true) {
                          if (var12 >= param0) {
                            break L9;
                          } else {
                            field_h[var12] = field_h[var12] + field_h[var12 - var11] * this.field_x / 100;
                            var12++;
                            continue L10;
                          }
                        }
                      }
                    }
                  }
                  L11: {
                    L12: {
                      if (this.field_l.field_f[0] > 0) {
                        break L12;
                      } else {
                        if (this.field_l.field_f[1] <= 0) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    this.field_a.a();
                    var11 = this.field_a.a(param0 + 1);
                    var12 = this.field_l.a(0, (float)var11 / 65536.0f);
                    var13 = this.field_l.a(1, (float)var11 / 65536.0f);
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
                                  var12 = this.field_l.a(0, (float)var11 / 65536.0f);
                                  var13 = this.field_l.a(1, (float)var11 / 65536.0f);
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
                                              field_h[var14] = var16;
                                              var11 = this.field_a.a(param0 + 1);
                                              var14++;
                                              continue L18;
                                            } else {
                                              var16 = var16 - (int)((long)field_h[var14 - 1 - var17] * (long)gn.field_e[1][var17] >> 16);
                                              var17++;
                                              continue L20;
                                            }
                                          }
                                        } else {
                                          var16 = var16 + (int)((long)field_h[var14 + var12 - 1 - var17] * (long)gn.field_e[0][var17] >> 16);
                                          var17++;
                                          continue L19;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                var16 = (int)((long)field_h[var14 + var12] * (long)gn.field_b >> 16);
                                var17 = 0;
                                L21: while (true) {
                                  if (var17 >= var12) {
                                    var17 = 0;
                                    L22: while (true) {
                                      if (var17 >= var13) {
                                        field_h[var14] = var16;
                                        var11 = this.field_a.a(param0 + 1);
                                        var14++;
                                        continue L17;
                                      } else {
                                        var16 = var16 - (int)((long)field_h[var14 - 1 - var17] * (long)gn.field_e[1][var17] >> 16);
                                        var17++;
                                        continue L22;
                                      }
                                    }
                                  } else {
                                    var16 = var16 + (int)((long)field_h[var14 + var12 - 1 - var17] * (long)gn.field_e[0][var17] >> 16);
                                    var17++;
                                    continue L21;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var16 = (int)((long)field_h[var14 + var12] * (long)gn.field_b >> 16);
                          var17 = 0;
                          L23: while (true) {
                            if (var17 >= var12) {
                              var17 = 0;
                              L24: while (true) {
                                if (var17 >= var14) {
                                  field_h[var14] = var16;
                                  var11 = this.field_a.a(param0 + 1);
                                  var14++;
                                  continue L14;
                                } else {
                                  var16 = var16 - (int)((long)field_h[var14 - 1 - var17] * (long)gn.field_e[1][var17] >> 16);
                                  var17++;
                                  continue L24;
                                }
                              }
                            } else {
                              var16 = var16 + (int)((long)field_h[var14 + var12 - 1 - var17] * (long)gn.field_e[0][var17] >> 16);
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
                      return field_h;
                    } else {
                      L26: {
                        if (field_h[var11] >= -32768) {
                          break L26;
                        } else {
                          field_h[var11] = -32768;
                          break L26;
                        }
                      }
                      if (field_h[var11] > 32767) {
                        field_h[var11] = 32767;
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
                    var12 = this.field_g.a(param0);
                    var13 = this.field_f.a(param0);
                    if (this.field_t == null) {
                      break L27;
                    } else {
                      var14 = this.field_t.a(param0);
                      var15 = this.field_w.a(param0);
                      var12 = var12 + (this.a(var7, var15, this.field_t.field_k) >> 1);
                      var7 = var7 + ((var14 * var5 >> 16) + var6);
                      break L27;
                    }
                  }
                  L28: {
                    if (this.field_c == null) {
                      break L28;
                    } else {
                      var14 = this.field_c.a(param0);
                      var15 = this.field_k.a(param0);
                      var13 = var13 * ((this.a(var10, var15, this.field_c.field_k) >> 1) + 32768) >> 15;
                      var10 = var10 + ((var14 * var8 >> 16) + var9);
                      break L28;
                    }
                  }
                  var14 = 0;
                  L29: while (true) {
                    if (var14 < 5) {
                      if (this.field_r[var14] != 0) {
                        var15 = var11 + field_p[var14];
                        if (var15 < param0) {
                          field_h[var15] = field_h[var15] + this.a(field_n[var14], var13 * field_d[var14] >> 15, this.field_g.field_k);
                          field_n[var14] = field_n[var14] + ((var12 * field_y[var14] >> 16) + field_q[var14]);
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
              if (this.field_r[var11] != 0) {
                field_n[var11] = 0;
                field_p[var11] = (int)((double)this.field_s[var11] * var3);
                field_d[var11] = (this.field_r[var11] << 14) / 100;
                field_y[var11] = (int)((double)(this.field_g.field_f - this.field_g.field_a) * 32.768 * Math.pow(1.0057929410678534, (double)this.field_b[var11]) / var3);
                field_q[var11] = (int)((double)this.field_g.field_a * 32.768 / var3);
                var11++;
                continue L2;
              } else {
                var11++;
                continue L2;
              }
            }
          }
        } else {
          return field_h;
        }
    }

    final void a(p param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          this.field_g = new ll();
          this.field_g.b(param0);
          this.field_f = new ll();
          this.field_f.b(param0);
          var2 = param0.i(-89);
          if (var2 == 0) {
            break L0;
          } else {
            param0.field_l = param0.field_l - 1;
            this.field_t = new ll();
            this.field_t.b(param0);
            this.field_w = new ll();
            this.field_w.b(param0);
            break L0;
          }
        }
        L1: {
          var2 = param0.i(-128);
          if (var2 == 0) {
            break L1;
          } else {
            param0.field_l = param0.field_l - 1;
            this.field_c = new ll();
            this.field_c.b(param0);
            this.field_k = new ll();
            this.field_k.b(param0);
            break L1;
          }
        }
        L2: {
          var2 = param0.i(-101);
          if (var2 == 0) {
            break L2;
          } else {
            param0.field_l = param0.field_l - 1;
            this.field_j = new ll();
            this.field_j.b(param0);
            this.field_e = new ll();
            this.field_e.b(param0);
            break L2;
          }
        }
        var3 = 0;
        L3: while (true) {
          L4: {
            if (var3 >= 10) {
              break L4;
            } else {
              var4 = param0.j(107);
              if (var4 != 0) {
                this.field_r[var3] = var4;
                this.field_b[var3] = param0.a(false);
                this.field_s[var3] = param0.j(116);
                var3++;
                continue L3;
              } else {
                break L4;
              }
            }
          }
          this.field_o = param0.j(110);
          this.field_x = param0.j(122);
          this.field_u = param0.f(674914976);
          this.field_m = param0.f(674914976);
          this.field_l = new gn();
          this.field_a = new ll();
          this.field_l.a(param0, this.field_a);
          return;
        }
    }

    public static void a() {
        field_h = null;
        field_i = null;
        field_v = null;
        field_n = null;
        field_p = null;
        field_d = null;
        field_y = null;
        field_q = null;
    }

    og() {
        this.field_s = new int[]{0, 0, 0, 0, 0};
        this.field_u = 500;
        this.field_m = 0;
        this.field_b = new int[]{0, 0, 0, 0, 0};
        this.field_o = 0;
        this.field_x = 100;
        this.field_r = new int[]{0, 0, 0, 0, 0};
    }

    static {
        int var1 = 0;
        field_i = new int[32768];
        Random var0 = new Random(0L);
        for (var1 = 0; var1 < 32768; var1++) {
            field_i[var1] = (var0.nextInt() & 2) - 1;
        }
        field_v = new int[32768];
        for (var1 = 0; var1 < 32768; var1++) {
            field_v[var1] = (int)(Math.sin((double)var1 / 5215.1903) * 16384.0);
        }
        field_h = new int[220500];
        field_q = new int[5];
        field_p = new int[5];
        field_d = new int[5];
        field_n = new int[5];
        field_y = new int[5];
    }
}
