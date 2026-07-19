/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hu {
    int field_r;
    private gr field_h;
    private gr field_g;
    private gr field_x;
    private int[] field_i;
    private int[] field_b;
    private gr field_n;
    private lc field_t;
    private gr field_l;
    private gr field_u;
    private int field_k;
    private static int[] field_s;
    private int field_p;
    int field_e;
    private int[] field_q;
    private static int[] field_c;
    private static int[] field_j;
    private gr field_v;
    private gr field_m;
    private gr field_a;
    private static int[] field_y;
    private static int[] field_d;
    private static int[] field_w;
    private static int[] field_f;
    private static int[] field_o;

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
        vm.a(field_c, 0, param0);
        if (param1 >= 10) {
          L0: {
            var3 = (double)param0 / ((double)param1 + 0.0);
            this.field_g.a();
            this.field_a.a();
            var5 = 0;
            var6 = 0;
            var7 = 0;
            if (this.field_n == null) {
              break L0;
            } else {
              this.field_n.a();
              this.field_m.a();
              var5 = (int)((double)(this.field_n.field_c - this.field_n.field_k) * 32.768 / var3);
              var6 = (int)((double)this.field_n.field_k * 32.768 / var3);
              break L0;
            }
          }
          L1: {
            var8 = 0;
            var9 = 0;
            var10 = 0;
            if (this.field_x == null) {
              break L1;
            } else {
              this.field_x.a();
              this.field_u.a();
              var8 = (int)((double)(this.field_x.field_c - this.field_x.field_k) * 32.768 / var3);
              var9 = (int)((double)this.field_x.field_k * 32.768 / var3);
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
                    if (this.field_h == null) {
                      break L4;
                    } else {
                      this.field_h.a();
                      this.field_l.a();
                      var11 = 0;
                      var12 = 0;
                      var13 = 1;
                      var14 = 0;
                      L5: while (true) {
                        if (var14 >= param0) {
                          break L4;
                        } else {
                          L6: {
                            var15 = this.field_h.a(param0);
                            var16 = this.field_l.a(param0);
                            if (var13 == 0) {
                              var12 = this.field_h.field_k + ((this.field_h.field_c - this.field_h.field_k) * var16 >> 8);
                              break L6;
                            } else {
                              var12 = this.field_h.field_k + ((this.field_h.field_c - this.field_h.field_k) * var15 >> 8);
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
                    if (this.field_p <= 0) {
                      break L9;
                    } else {
                      if (this.field_k <= 0) {
                        break L9;
                      } else {
                        var11 = (int)((double)this.field_p * var3);
                        var12 = var11;
                        L10: while (true) {
                          if (var12 >= param0) {
                            break L9;
                          } else {
                            field_c[var12] = field_c[var12] + field_c[var12 - var11] * this.field_k / 100;
                            var12++;
                            continue L10;
                          }
                        }
                      }
                    }
                  }
                  L11: {
                    L12: {
                      if (this.field_t.field_d[0] > 0) {
                        break L12;
                      } else {
                        if (this.field_t.field_d[1] <= 0) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    this.field_v.a();
                    var11 = this.field_v.a(param0 + 1);
                    var12 = this.field_t.a(0, (float)var11 / 65536.0f);
                    var13 = this.field_t.a(1, (float)var11 / 65536.0f);
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
                                  var12 = this.field_t.a(0, (float)var11 / 65536.0f);
                                  var13 = this.field_t.a(1, (float)var11 / 65536.0f);
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
                                              var11 = this.field_v.a(param0 + 1);
                                              var14++;
                                              continue L18;
                                            } else {
                                              var16 = var16 - (int)((long)field_c[var14 - 1 - var17] * (long)lc.field_a[1][var17] >> 16);
                                              var17++;
                                              continue L20;
                                            }
                                          }
                                        } else {
                                          var16 = var16 + (int)((long)field_c[var14 + var12 - 1 - var17] * (long)lc.field_a[0][var17] >> 16);
                                          var17++;
                                          continue L19;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                var16 = (int)((long)field_c[var14 + var12] * (long)lc.field_f >> 16);
                                var17 = 0;
                                L21: while (true) {
                                  if (var17 >= var12) {
                                    var17 = 0;
                                    L22: while (true) {
                                      if (var17 >= var13) {
                                        field_c[var14] = var16;
                                        var11 = this.field_v.a(param0 + 1);
                                        var14++;
                                        continue L17;
                                      } else {
                                        var16 = var16 - (int)((long)field_c[var14 - 1 - var17] * (long)lc.field_a[1][var17] >> 16);
                                        var17++;
                                        continue L22;
                                      }
                                    }
                                  } else {
                                    var16 = var16 + (int)((long)field_c[var14 + var12 - 1 - var17] * (long)lc.field_a[0][var17] >> 16);
                                    var17++;
                                    continue L21;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var16 = (int)((long)field_c[var14 + var12] * (long)lc.field_f >> 16);
                          var17 = 0;
                          L23: while (true) {
                            if (var17 >= var12) {
                              var17 = 0;
                              L24: while (true) {
                                if (var17 >= var14) {
                                  field_c[var14] = var16;
                                  var11 = this.field_v.a(param0 + 1);
                                  var14++;
                                  continue L14;
                                } else {
                                  var16 = var16 - (int)((long)field_c[var14 - 1 - var17] * (long)lc.field_a[1][var17] >> 16);
                                  var17++;
                                  continue L24;
                                }
                              }
                            } else {
                              var16 = var16 + (int)((long)field_c[var14 + var12 - 1 - var17] * (long)lc.field_a[0][var17] >> 16);
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
                    var12 = this.field_g.a(param0);
                    var13 = this.field_a.a(param0);
                    if (this.field_n == null) {
                      break L27;
                    } else {
                      var14 = this.field_n.a(param0);
                      var15 = this.field_m.a(param0);
                      var12 = var12 + (this.a(var7, var15, this.field_n.field_d) >> 1);
                      var7 = var7 + ((var14 * var5 >> 16) + var6);
                      break L27;
                    }
                  }
                  L28: {
                    if (this.field_x == null) {
                      break L28;
                    } else {
                      var14 = this.field_x.a(param0);
                      var15 = this.field_u.a(param0);
                      var13 = var13 * ((this.a(var10, var15, this.field_x.field_d) >> 1) + 32768) >> 15;
                      var10 = var10 + ((var14 * var8 >> 16) + var9);
                      break L28;
                    }
                  }
                  var14 = 0;
                  L29: while (true) {
                    if (var14 < 5) {
                      if (this.field_b[var14] != 0) {
                        var15 = var11 + field_f[var14];
                        if (var15 < param0) {
                          field_c[var15] = field_c[var15] + this.a(field_w[var14], var13 * field_o[var14] >> 15, this.field_g.field_d);
                          field_w[var14] = field_w[var14] + ((var12 * field_y[var14] >> 16) + field_d[var14]);
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
              if (this.field_b[var11] != 0) {
                field_w[var11] = 0;
                field_f[var11] = (int)((double)this.field_q[var11] * var3);
                field_o[var11] = (this.field_b[var11] << 14) / 100;
                field_y[var11] = (int)((double)(this.field_g.field_c - this.field_g.field_k) * 32.768 * Math.pow(1.0057929410678534, (double)this.field_i[var11]) / var3);
                field_d[var11] = (int)((double)this.field_g.field_k * 32.768 / var3);
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

    private final int a(int param0, int param1, int param2) {
        if (param2 == 1) {
            if ((param0 & 32767) < 16384) {
                return param1;
            }
            return -param1;
        }
        if (param2 == 2) {
            return field_s[param0 & 32767] * param1 >> 14;
        }
        if (param2 == 3) {
            return ((param0 & 32767) * param1 >> 14) - param1;
        }
        if (param2 == 4) {
            return field_j[param0 / 2607 & 32767] * param1;
        }
        return 0;
    }

    final void a(vh param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          this.field_g = new gr();
          this.field_g.a(param0);
          this.field_a = new gr();
          this.field_a.a(param0);
          var2 = param0.k(0);
          if (var2 == 0) {
            break L0;
          } else {
            param0.field_q = param0.field_q - 1;
            this.field_n = new gr();
            this.field_n.a(param0);
            this.field_m = new gr();
            this.field_m.a(param0);
            break L0;
          }
        }
        L1: {
          var2 = param0.k(0);
          if (var2 == 0) {
            break L1;
          } else {
            param0.field_q = param0.field_q - 1;
            this.field_x = new gr();
            this.field_x.a(param0);
            this.field_u = new gr();
            this.field_u.a(param0);
            break L1;
          }
        }
        L2: {
          var2 = param0.k(0);
          if (var2 == 0) {
            break L2;
          } else {
            param0.field_q = param0.field_q - 1;
            this.field_h = new gr();
            this.field_h.a(param0);
            this.field_l = new gr();
            this.field_l.a(param0);
            break L2;
          }
        }
        var3 = 0;
        L3: while (true) {
          L4: {
            if (var3 >= 10) {
              break L4;
            } else {
              var4 = param0.e(-23470);
              if (var4 != 0) {
                this.field_b[var3] = var4;
                this.field_i[var3] = param0.a(112);
                this.field_q[var3] = param0.e(-23470);
                var3++;
                continue L3;
              } else {
                break L4;
              }
            }
          }
          this.field_p = param0.e(-23470);
          this.field_k = param0.e(-23470);
          this.field_r = param0.e((byte) -104);
          this.field_e = param0.e((byte) -104);
          this.field_t = new lc();
          this.field_v = new gr();
          this.field_t.a(param0, this.field_v);
          return;
        }
    }

    public static void a() {
        field_c = null;
        field_j = null;
        field_s = null;
        field_w = null;
        field_f = null;
        field_o = null;
        field_y = null;
        field_d = null;
    }

    hu() {
        this.field_i = new int[]{0, 0, 0, 0, 0};
        this.field_k = 100;
        this.field_p = 0;
        this.field_e = 0;
        this.field_b = new int[]{0, 0, 0, 0, 0};
        this.field_r = 500;
        this.field_q = new int[]{0, 0, 0, 0, 0};
    }

    static {
        int var1 = 0;
        field_j = new int[32768];
        Random var0 = new Random(0L);
        for (var1 = 0; var1 < 32768; var1++) {
            field_j[var1] = (var0.nextInt() & 2) - 1;
        }
        field_s = new int[32768];
        for (var1 = 0; var1 < 32768; var1++) {
            field_s[var1] = (int)(Math.sin((double)var1 / 5215.1903) * 16384.0);
        }
        field_c = new int[220500];
        field_y = new int[5];
        field_w = new int[5];
        field_d = new int[5];
        field_f = new int[5];
        field_o = new int[5];
    }
}
