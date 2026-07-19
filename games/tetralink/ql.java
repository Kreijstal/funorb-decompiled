/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ql {
    private td field_u;
    private td field_a;
    private int field_k;
    private static int[] field_j;
    private si field_m;
    private static int[] field_x;
    private int[] field_v;
    int field_b;
    private td field_i;
    private td field_g;
    private int field_y;
    private int[] field_l;
    private td field_o;
    private td field_c;
    private td field_p;
    int field_w;
    private td field_n;
    private static int[] field_e;
    private td field_q;
    private static int[] field_r;
    private int[] field_t;
    private static int[] field_d;
    private static int[] field_h;
    private static int[] field_f;
    private static int[] field_s;

    public static void a() {
        field_x = null;
        field_e = null;
        field_j = null;
        field_s = null;
        field_r = null;
        field_h = null;
        field_d = null;
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
        rd.a(field_x, 0, param0);
        if (param1 >= 10) {
          L0: {
            var3 = (double)param0 / ((double)param1 + 0.0);
            this.field_c.a();
            this.field_n.a();
            var5 = 0;
            var6 = 0;
            var7 = 0;
            if (this.field_o == null) {
              break L0;
            } else {
              this.field_o.a();
              this.field_g.a();
              var5 = (int)((double)(this.field_o.field_j - this.field_o.field_i) * 32.768 / var3);
              var6 = (int)((double)this.field_o.field_i * 32.768 / var3);
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
              this.field_a.a();
              var8 = (int)((double)(this.field_u.field_j - this.field_u.field_i) * 32.768 / var3);
              var9 = (int)((double)this.field_u.field_i * 32.768 / var3);
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
                    if (this.field_p == null) {
                      break L4;
                    } else {
                      this.field_p.a();
                      this.field_i.a();
                      var11 = 0;
                      var12 = 0;
                      var13 = 1;
                      var14 = 0;
                      L5: while (true) {
                        if (var14 >= param0) {
                          break L4;
                        } else {
                          L6: {
                            var15 = this.field_p.a(param0);
                            var16 = this.field_i.a(param0);
                            if (var13 == 0) {
                              var12 = this.field_p.field_i + ((this.field_p.field_j - this.field_p.field_i) * var16 >> 8);
                              break L6;
                            } else {
                              var12 = this.field_p.field_i + ((this.field_p.field_j - this.field_p.field_i) * var15 >> 8);
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
                    if (this.field_y <= 0) {
                      break L9;
                    } else {
                      if (this.field_k <= 0) {
                        break L9;
                      } else {
                        var11 = (int)((double)this.field_y * var3);
                        var12 = var11;
                        L10: while (true) {
                          if (var12 >= param0) {
                            break L9;
                          } else {
                            field_x[var12] = field_x[var12] + field_x[var12 - var11] * this.field_k / 100;
                            var12++;
                            continue L10;
                          }
                        }
                      }
                    }
                  }
                  L11: {
                    L12: {
                      if (this.field_m.field_h[0] > 0) {
                        break L12;
                      } else {
                        if (this.field_m.field_h[1] <= 0) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    this.field_q.a();
                    var11 = this.field_q.a(param0 + 1);
                    var12 = this.field_m.a(0, (float)var11 / 65536.0f);
                    var13 = this.field_m.a(1, (float)var11 / 65536.0f);
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
                                  var12 = this.field_m.a(0, (float)var11 / 65536.0f);
                                  var13 = this.field_m.a(1, (float)var11 / 65536.0f);
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
                                              var11 = this.field_q.a(param0 + 1);
                                              var14++;
                                              continue L18;
                                            } else {
                                              var16 = var16 - (int)((long)field_x[var14 - 1 - var17] * (long)si.field_d[1][var17] >> 16);
                                              var17++;
                                              continue L20;
                                            }
                                          }
                                        } else {
                                          var16 = var16 + (int)((long)field_x[var14 + var12 - 1 - var17] * (long)si.field_d[0][var17] >> 16);
                                          var17++;
                                          continue L19;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                var16 = (int)((long)field_x[var14 + var12] * (long)si.field_e >> 16);
                                var17 = 0;
                                L21: while (true) {
                                  if (var17 >= var12) {
                                    var17 = 0;
                                    L22: while (true) {
                                      if (var17 >= var13) {
                                        field_x[var14] = var16;
                                        var11 = this.field_q.a(param0 + 1);
                                        var14++;
                                        continue L17;
                                      } else {
                                        var16 = var16 - (int)((long)field_x[var14 - 1 - var17] * (long)si.field_d[1][var17] >> 16);
                                        var17++;
                                        continue L22;
                                      }
                                    }
                                  } else {
                                    var16 = var16 + (int)((long)field_x[var14 + var12 - 1 - var17] * (long)si.field_d[0][var17] >> 16);
                                    var17++;
                                    continue L21;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var16 = (int)((long)field_x[var14 + var12] * (long)si.field_e >> 16);
                          var17 = 0;
                          L23: while (true) {
                            if (var17 >= var12) {
                              var17 = 0;
                              L24: while (true) {
                                if (var17 >= var14) {
                                  field_x[var14] = var16;
                                  var11 = this.field_q.a(param0 + 1);
                                  var14++;
                                  continue L14;
                                } else {
                                  var16 = var16 - (int)((long)field_x[var14 - 1 - var17] * (long)si.field_d[1][var17] >> 16);
                                  var17++;
                                  continue L24;
                                }
                              }
                            } else {
                              var16 = var16 + (int)((long)field_x[var14 + var12 - 1 - var17] * (long)si.field_d[0][var17] >> 16);
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
                    var12 = this.field_c.a(param0);
                    var13 = this.field_n.a(param0);
                    if (this.field_o == null) {
                      break L27;
                    } else {
                      var14 = this.field_o.a(param0);
                      var15 = this.field_g.a(param0);
                      var12 = var12 + (this.a(var7, var15, this.field_o.field_b) >> 1);
                      var7 = var7 + ((var14 * var5 >> 16) + var6);
                      break L27;
                    }
                  }
                  L28: {
                    if (this.field_u == null) {
                      break L28;
                    } else {
                      var14 = this.field_u.a(param0);
                      var15 = this.field_a.a(param0);
                      var13 = var13 * ((this.a(var10, var15, this.field_u.field_b) >> 1) + 32768) >> 15;
                      var10 = var10 + ((var14 * var8 >> 16) + var9);
                      break L28;
                    }
                  }
                  var14 = 0;
                  L29: while (true) {
                    if (var14 < 5) {
                      if (this.field_t[var14] != 0) {
                        var15 = var11 + field_r[var14];
                        if (var15 < param0) {
                          field_x[var15] = field_x[var15] + this.a(field_s[var14], var13 * field_h[var14] >> 15, this.field_c.field_b);
                          field_s[var14] = field_s[var14] + ((var12 * field_d[var14] >> 16) + field_f[var14]);
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
              if (this.field_t[var11] != 0) {
                field_s[var11] = 0;
                field_r[var11] = (int)((double)this.field_l[var11] * var3);
                field_h[var11] = (this.field_t[var11] << 14) / 100;
                field_d[var11] = (int)((double)(this.field_c.field_j - this.field_c.field_i) * 32.768 * Math.pow(1.0057929410678534, (double)this.field_v[var11]) / var3);
                field_f[var11] = (int)((double)this.field_c.field_i * 32.768 / var3);
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

    private final int a(int param0, int param1, int param2) {
        if (param2 == 1) {
            if ((param0 & 32767) < 16384) {
                return param1;
            }
            return -param1;
        }
        if (param2 == 2) {
            return field_j[param0 & 32767] * param1 >> 14;
        }
        if (param2 == 3) {
            return ((param0 & 32767) * param1 >> 14) - param1;
        }
        if (param2 == 4) {
            return field_e[param0 / 2607 & 32767] * param1;
        }
        return 0;
    }

    final void a(bh param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          this.field_c = new td();
          this.field_c.a(param0);
          this.field_n = new td();
          this.field_n.a(param0);
          var2 = param0.d((byte) -99);
          if (var2 == 0) {
            break L0;
          } else {
            param0.field_t = param0.field_t - 1;
            this.field_o = new td();
            this.field_o.a(param0);
            this.field_g = new td();
            this.field_g.a(param0);
            break L0;
          }
        }
        L1: {
          var2 = param0.d((byte) -99);
          if (var2 == 0) {
            break L1;
          } else {
            param0.field_t = param0.field_t - 1;
            this.field_u = new td();
            this.field_u.a(param0);
            this.field_a = new td();
            this.field_a.a(param0);
            break L1;
          }
        }
        L2: {
          var2 = param0.d((byte) -99);
          if (var2 == 0) {
            break L2;
          } else {
            param0.field_t = param0.field_t - 1;
            this.field_p = new td();
            this.field_p.a(param0);
            this.field_i = new td();
            this.field_i.a(param0);
            break L2;
          }
        }
        var3 = 0;
        L3: while (true) {
          L4: {
            if (var3 >= 10) {
              break L4;
            } else {
              var4 = param0.f((byte) 114);
              if (var4 != 0) {
                this.field_t[var3] = var4;
                this.field_v[var3] = param0.e((byte) 82);
                this.field_l[var3] = param0.f((byte) 120);
                var3++;
                continue L3;
              } else {
                break L4;
              }
            }
          }
          this.field_y = param0.f((byte) 80);
          this.field_k = param0.f((byte) 13);
          this.field_w = param0.e(127);
          this.field_b = param0.e(127);
          this.field_m = new si();
          this.field_q = new td();
          this.field_m.a(param0, this.field_q);
          return;
        }
    }

    ql() {
        this.field_b = 0;
        this.field_v = new int[]{0, 0, 0, 0, 0};
        this.field_l = new int[]{0, 0, 0, 0, 0};
        this.field_k = 100;
        this.field_y = 0;
        this.field_t = new int[]{0, 0, 0, 0, 0};
        this.field_w = 500;
    }

    static {
        int var1 = 0;
        field_e = new int[32768];
        Random var0 = new Random(0L);
        for (var1 = 0; var1 < 32768; var1++) {
            field_e[var1] = (var0.nextInt() & 2) - 1;
        }
        field_j = new int[32768];
        for (var1 = 0; var1 < 32768; var1++) {
            field_j[var1] = (int)(Math.sin((double)var1 / 5215.1903) * 16384.0);
        }
        field_x = new int[220500];
        field_r = new int[5];
        field_d = new int[5];
        field_s = new int[5];
        field_h = new int[5];
        field_f = new int[5];
    }
}
