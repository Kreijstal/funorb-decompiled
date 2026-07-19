/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pi {
    private fj field_x;
    private fj field_m;
    private int field_i;
    private fj field_y;
    private fj field_j;
    private static int[] field_n;
    private static int[] field_v;
    private int[] field_p;
    private fj field_b;
    int field_s;
    private fj field_q;
    int field_r;
    private int field_t;
    private fj field_d;
    private fj field_h;
    private int[] field_a;
    private ek field_k;
    private int[] field_o;
    private static int[] field_f;
    private fj field_e;
    private static int[] field_c;
    private static int[] field_u;
    private static int[] field_w;
    private static int[] field_l;
    private static int[] field_g;

    public static void a() {
        field_f = null;
        field_v = null;
        field_n = null;
        field_u = null;
        field_l = null;
        field_c = null;
        field_w = null;
        field_g = null;
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
        ka.a(field_f, 0, param0);
        if (param1 >= 10) {
          L0: {
            var3 = (double)param0 / ((double)param1 + 0.0);
            this.field_q.a();
            this.field_e.a();
            var5 = 0;
            var6 = 0;
            var7 = 0;
            if (this.field_d == null) {
              break L0;
            } else {
              this.field_d.a();
              this.field_x.a();
              var5 = (int)((double)(this.field_d.field_b - this.field_d.field_g) * 32.768 / var3);
              var6 = (int)((double)this.field_d.field_g * 32.768 / var3);
              break L0;
            }
          }
          L1: {
            var8 = 0;
            var9 = 0;
            var10 = 0;
            if (this.field_m == null) {
              break L1;
            } else {
              this.field_m.a();
              this.field_y.a();
              var8 = (int)((double)(this.field_m.field_b - this.field_m.field_g) * 32.768 / var3);
              var9 = (int)((double)this.field_m.field_g * 32.768 / var3);
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
                    if (this.field_b == null) {
                      break L4;
                    } else {
                      this.field_b.a();
                      this.field_j.a();
                      var11 = 0;
                      var12 = 0;
                      var13 = 1;
                      var14 = 0;
                      L5: while (true) {
                        if (var14 >= param0) {
                          break L4;
                        } else {
                          L6: {
                            var15 = this.field_b.a(param0);
                            var16 = this.field_j.a(param0);
                            if (var13 == 0) {
                              var12 = this.field_b.field_g + ((this.field_b.field_b - this.field_b.field_g) * var16 >> 8);
                              break L6;
                            } else {
                              var12 = this.field_b.field_g + ((this.field_b.field_b - this.field_b.field_g) * var15 >> 8);
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
                    if (this.field_i <= 0) {
                      break L9;
                    } else {
                      if (this.field_t <= 0) {
                        break L9;
                      } else {
                        var11 = (int)((double)this.field_i * var3);
                        var12 = var11;
                        L10: while (true) {
                          if (var12 >= param0) {
                            break L9;
                          } else {
                            field_f[var12] = field_f[var12] + field_f[var12 - var11] * this.field_t / 100;
                            var12++;
                            continue L10;
                          }
                        }
                      }
                    }
                  }
                  L11: {
                    L12: {
                      if (this.field_k.field_a[0] > 0) {
                        break L12;
                      } else {
                        if (this.field_k.field_a[1] <= 0) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    this.field_h.a();
                    var11 = this.field_h.a(param0 + 1);
                    var12 = this.field_k.a(0, (float)var11 / 65536.0f);
                    var13 = this.field_k.a(1, (float)var11 / 65536.0f);
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
                                  var12 = this.field_k.a(0, (float)var11 / 65536.0f);
                                  var13 = this.field_k.a(1, (float)var11 / 65536.0f);
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
                                              var11 = this.field_h.a(param0 + 1);
                                              var14++;
                                              continue L18;
                                            } else {
                                              var16 = var16 - (int)((long)field_f[var14 - 1 - var17] * (long)ek.field_h[1][var17] >> 16);
                                              var17++;
                                              continue L20;
                                            }
                                          }
                                        } else {
                                          var16 = var16 + (int)((long)field_f[var14 + var12 - 1 - var17] * (long)ek.field_h[0][var17] >> 16);
                                          var17++;
                                          continue L19;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                var16 = (int)((long)field_f[var14 + var12] * (long)ek.field_g >> 16);
                                var17 = 0;
                                L21: while (true) {
                                  if (var17 >= var12) {
                                    var17 = 0;
                                    L22: while (true) {
                                      if (var17 >= var13) {
                                        field_f[var14] = var16;
                                        var11 = this.field_h.a(param0 + 1);
                                        var14++;
                                        continue L17;
                                      } else {
                                        var16 = var16 - (int)((long)field_f[var14 - 1 - var17] * (long)ek.field_h[1][var17] >> 16);
                                        var17++;
                                        continue L22;
                                      }
                                    }
                                  } else {
                                    var16 = var16 + (int)((long)field_f[var14 + var12 - 1 - var17] * (long)ek.field_h[0][var17] >> 16);
                                    var17++;
                                    continue L21;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var16 = (int)((long)field_f[var14 + var12] * (long)ek.field_g >> 16);
                          var17 = 0;
                          L23: while (true) {
                            if (var17 >= var12) {
                              var17 = 0;
                              L24: while (true) {
                                if (var17 >= var14) {
                                  field_f[var14] = var16;
                                  var11 = this.field_h.a(param0 + 1);
                                  var14++;
                                  continue L14;
                                } else {
                                  var16 = var16 - (int)((long)field_f[var14 - 1 - var17] * (long)ek.field_h[1][var17] >> 16);
                                  var17++;
                                  continue L24;
                                }
                              }
                            } else {
                              var16 = var16 + (int)((long)field_f[var14 + var12 - 1 - var17] * (long)ek.field_h[0][var17] >> 16);
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
                    var12 = this.field_q.a(param0);
                    var13 = this.field_e.a(param0);
                    if (this.field_d == null) {
                      break L27;
                    } else {
                      var14 = this.field_d.a(param0);
                      var15 = this.field_x.a(param0);
                      var12 = var12 + (this.a(var7, var15, this.field_d.field_f) >> 1);
                      var7 = var7 + ((var14 * var5 >> 16) + var6);
                      break L27;
                    }
                  }
                  L28: {
                    if (this.field_m == null) {
                      break L28;
                    } else {
                      var14 = this.field_m.a(param0);
                      var15 = this.field_y.a(param0);
                      var13 = var13 * ((this.a(var10, var15, this.field_m.field_f) >> 1) + 32768) >> 15;
                      var10 = var10 + ((var14 * var8 >> 16) + var9);
                      break L28;
                    }
                  }
                  var14 = 0;
                  L29: while (true) {
                    if (var14 < 5) {
                      if (this.field_p[var14] != 0) {
                        var15 = var11 + field_l[var14];
                        if (var15 < param0) {
                          field_f[var15] = field_f[var15] + this.a(field_u[var14], var13 * field_c[var14] >> 15, this.field_q.field_f);
                          field_u[var14] = field_u[var14] + ((var12 * field_w[var14] >> 16) + field_g[var14]);
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
              if (this.field_p[var11] != 0) {
                field_u[var11] = 0;
                field_l[var11] = (int)((double)this.field_o[var11] * var3);
                field_c[var11] = (this.field_p[var11] << 14) / 100;
                field_w[var11] = (int)((double)(this.field_q.field_b - this.field_q.field_g) * 32.768 * Math.pow(1.0057929410678534, (double)this.field_a[var11]) / var3);
                field_g[var11] = (int)((double)this.field_q.field_g * 32.768 / var3);
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

    final void a(dh param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          this.field_q = new fj();
          this.field_q.a(param0);
          this.field_e = new fj();
          this.field_e.a(param0);
          var2 = param0.a(-16384);
          if (var2 == 0) {
            break L0;
          } else {
            param0.field_k = param0.field_k - 1;
            this.field_d = new fj();
            this.field_d.a(param0);
            this.field_x = new fj();
            this.field_x.a(param0);
            break L0;
          }
        }
        L1: {
          var2 = param0.a(-16384);
          if (var2 == 0) {
            break L1;
          } else {
            param0.field_k = param0.field_k - 1;
            this.field_m = new fj();
            this.field_m.a(param0);
            this.field_y = new fj();
            this.field_y.a(param0);
            break L1;
          }
        }
        L2: {
          var2 = param0.a(-16384);
          if (var2 == 0) {
            break L2;
          } else {
            param0.field_k = param0.field_k - 1;
            this.field_b = new fj();
            this.field_b.a(param0);
            this.field_j = new fj();
            this.field_j.a(param0);
            break L2;
          }
        }
        var3 = 0;
        L3: while (true) {
          L4: {
            if (var3 >= 10) {
              break L4;
            } else {
              var4 = param0.h(-89);
              if (var4 != 0) {
                this.field_p[var3] = var4;
                this.field_a[var3] = param0.e((byte) 104);
                this.field_o[var3] = param0.h(117);
                var3++;
                continue L3;
              } else {
                break L4;
              }
            }
          }
          this.field_i = param0.h(-110);
          this.field_t = param0.h(112);
          this.field_r = param0.i(-25578);
          this.field_s = param0.i(-25578);
          this.field_k = new ek();
          this.field_h = new fj();
          this.field_k.a(param0, this.field_h);
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
            return field_n[param0 & 32767] * param1 >> 14;
        }
        if (param2 == 3) {
            return ((param0 & 32767) * param1 >> 14) - param1;
        }
        if (param2 == 4) {
            return field_v[param0 / 2607 & 32767] * param1;
        }
        return 0;
    }

    pi() {
        this.field_p = new int[]{0, 0, 0, 0, 0};
        this.field_t = 100;
        this.field_r = 500;
        this.field_s = 0;
        this.field_a = new int[]{0, 0, 0, 0, 0};
        this.field_o = new int[]{0, 0, 0, 0, 0};
        this.field_i = 0;
    }

    static {
        int var1 = 0;
        field_v = new int[32768];
        Random var0 = new Random(0L);
        for (var1 = 0; var1 < 32768; var1++) {
            field_v[var1] = (var0.nextInt() & 2) - 1;
        }
        field_n = new int[32768];
        for (var1 = 0; var1 < 32768; var1++) {
            field_n[var1] = (int)(Math.sin((double)var1 / 5215.1903) * 16384.0);
        }
        field_f = new int[220500];
        field_c = new int[5];
        field_w = new int[5];
        field_u = new int[5];
        field_l = new int[5];
        field_g = new int[5];
    }
}
