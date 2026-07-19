/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class tj {
    private qg field_b;
    private qg field_f;
    private int field_m;
    private qg field_h;
    private static int[] field_e;
    private qg field_g;
    private int[] field_l;
    int field_u;
    private static int[] field_t;
    private qg field_a;
    private int[] field_p;
    private int[] field_d;
    private static int[] field_q;
    private qg field_s;
    private qg field_o;
    private int field_v;
    private qg field_n;
    int field_y;
    private static int[] field_j;
    private static int[] field_c;
    private static int[] field_x;
    private static int[] field_k;
    private static int[] field_w;
    private qg field_i;
    private dh field_r;

    public static void a() {
        field_q = null;
        field_t = null;
        field_e = null;
        field_w = null;
        field_c = null;
        field_j = null;
        field_x = null;
        field_k = null;
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
        ri.a(field_q, 0, param0);
        if (param1 >= 10) {
          L0: {
            var3 = (double)param0 / ((double)param1 + 0.0);
            this.field_f.a();
            this.field_s.a();
            var5 = 0;
            var6 = 0;
            var7 = 0;
            if (this.field_h == null) {
              break L0;
            } else {
              this.field_h.a();
              this.field_n.a();
              var5 = (int)((double)(this.field_h.field_i - this.field_h.field_d) * 32.768 / var3);
              var6 = (int)((double)this.field_h.field_d * 32.768 / var3);
              break L0;
            }
          }
          L1: {
            var8 = 0;
            var9 = 0;
            var10 = 0;
            if (this.field_a == null) {
              break L1;
            } else {
              this.field_a.a();
              this.field_i.a();
              var8 = (int)((double)(this.field_a.field_i - this.field_a.field_d) * 32.768 / var3);
              var9 = (int)((double)this.field_a.field_d * 32.768 / var3);
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
                    if (this.field_o == null) {
                      break L4;
                    } else {
                      this.field_o.a();
                      this.field_b.a();
                      var11 = 0;
                      var12 = 0;
                      var13 = 1;
                      var14 = 0;
                      L5: while (true) {
                        if (var14 >= param0) {
                          break L4;
                        } else {
                          L6: {
                            var15 = this.field_o.a(param0);
                            var16 = this.field_b.a(param0);
                            if (var13 == 0) {
                              var12 = this.field_o.field_d + ((this.field_o.field_i - this.field_o.field_d) * var16 >> 8);
                              break L6;
                            } else {
                              var12 = this.field_o.field_d + ((this.field_o.field_i - this.field_o.field_d) * var15 >> 8);
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
                            field_q[var14] = 0;
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
                    if (this.field_v <= 0) {
                      break L9;
                    } else {
                      if (this.field_m <= 0) {
                        break L9;
                      } else {
                        var11 = (int)((double)this.field_v * var3);
                        var12 = var11;
                        L10: while (true) {
                          if (var12 >= param0) {
                            break L9;
                          } else {
                            field_q[var12] = field_q[var12] + field_q[var12 - var11] * this.field_m / 100;
                            var12++;
                            continue L10;
                          }
                        }
                      }
                    }
                  }
                  L11: {
                    L12: {
                      if (this.field_r.field_c[0] > 0) {
                        break L12;
                      } else {
                        if (this.field_r.field_c[1] <= 0) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    this.field_g.a();
                    var11 = this.field_g.a(param0 + 1);
                    var12 = this.field_r.a(0, (float)var11 / 65536.0f);
                    var13 = this.field_r.a(1, (float)var11 / 65536.0f);
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
                                  var12 = this.field_r.a(0, (float)var11 / 65536.0f);
                                  var13 = this.field_r.a(1, (float)var11 / 65536.0f);
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
                                              field_q[var14] = var16;
                                              var11 = this.field_g.a(param0 + 1);
                                              var14++;
                                              continue L18;
                                            } else {
                                              var16 = var16 - (int)((long)field_q[var14 - 1 - var17] * (long)dh.field_b[1][var17] >> 16);
                                              var17++;
                                              continue L20;
                                            }
                                          }
                                        } else {
                                          var16 = var16 + (int)((long)field_q[var14 + var12 - 1 - var17] * (long)dh.field_b[0][var17] >> 16);
                                          var17++;
                                          continue L19;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                var16 = (int)((long)field_q[var14 + var12] * (long)dh.field_e >> 16);
                                var17 = 0;
                                L21: while (true) {
                                  if (var17 >= var12) {
                                    var17 = 0;
                                    L22: while (true) {
                                      if (var17 >= var13) {
                                        field_q[var14] = var16;
                                        var11 = this.field_g.a(param0 + 1);
                                        var14++;
                                        continue L17;
                                      } else {
                                        var16 = var16 - (int)((long)field_q[var14 - 1 - var17] * (long)dh.field_b[1][var17] >> 16);
                                        var17++;
                                        continue L22;
                                      }
                                    }
                                  } else {
                                    var16 = var16 + (int)((long)field_q[var14 + var12 - 1 - var17] * (long)dh.field_b[0][var17] >> 16);
                                    var17++;
                                    continue L21;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var16 = (int)((long)field_q[var14 + var12] * (long)dh.field_e >> 16);
                          var17 = 0;
                          L23: while (true) {
                            if (var17 >= var12) {
                              var17 = 0;
                              L24: while (true) {
                                if (var17 >= var14) {
                                  field_q[var14] = var16;
                                  var11 = this.field_g.a(param0 + 1);
                                  var14++;
                                  continue L14;
                                } else {
                                  var16 = var16 - (int)((long)field_q[var14 - 1 - var17] * (long)dh.field_b[1][var17] >> 16);
                                  var17++;
                                  continue L24;
                                }
                              }
                            } else {
                              var16 = var16 + (int)((long)field_q[var14 + var12 - 1 - var17] * (long)dh.field_b[0][var17] >> 16);
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
                      return field_q;
                    } else {
                      L26: {
                        if (field_q[var11] >= -32768) {
                          break L26;
                        } else {
                          field_q[var11] = -32768;
                          break L26;
                        }
                      }
                      if (field_q[var11] > 32767) {
                        field_q[var11] = 32767;
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
                    var12 = this.field_f.a(param0);
                    var13 = this.field_s.a(param0);
                    if (this.field_h == null) {
                      break L27;
                    } else {
                      var14 = this.field_h.a(param0);
                      var15 = this.field_n.a(param0);
                      var12 = var12 + (this.a(var7, var15, this.field_h.field_h) >> 1);
                      var7 = var7 + ((var14 * var5 >> 16) + var6);
                      break L27;
                    }
                  }
                  L28: {
                    if (this.field_a == null) {
                      break L28;
                    } else {
                      var14 = this.field_a.a(param0);
                      var15 = this.field_i.a(param0);
                      var13 = var13 * ((this.a(var10, var15, this.field_a.field_h) >> 1) + 32768) >> 15;
                      var10 = var10 + ((var14 * var8 >> 16) + var9);
                      break L28;
                    }
                  }
                  var14 = 0;
                  L29: while (true) {
                    if (var14 < 5) {
                      if (this.field_l[var14] != 0) {
                        var15 = var11 + field_c[var14];
                        if (var15 < param0) {
                          field_q[var15] = field_q[var15] + this.a(field_w[var14], var13 * field_j[var14] >> 15, this.field_f.field_h);
                          field_w[var14] = field_w[var14] + ((var12 * field_x[var14] >> 16) + field_k[var14]);
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
              if (this.field_l[var11] != 0) {
                field_w[var11] = 0;
                field_c[var11] = (int)((double)this.field_p[var11] * var3);
                field_j[var11] = (this.field_l[var11] << 14) / 100;
                field_x[var11] = (int)((double)(this.field_f.field_i - this.field_f.field_d) * 32.768 * Math.pow(1.0057929410678534, (double)this.field_d[var11]) / var3);
                field_k[var11] = (int)((double)this.field_f.field_d * 32.768 / var3);
                var11++;
                continue L2;
              } else {
                var11++;
                continue L2;
              }
            }
          }
        } else {
          return field_q;
        }
    }

    final void a(ka param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          this.field_f = new qg();
          this.field_f.b(param0);
          this.field_s = new qg();
          this.field_s.b(param0);
          var2 = param0.f(4);
          if (var2 == 0) {
            break L0;
          } else {
            param0.field_k = param0.field_k - 1;
            this.field_h = new qg();
            this.field_h.b(param0);
            this.field_n = new qg();
            this.field_n.b(param0);
            break L0;
          }
        }
        L1: {
          var2 = param0.f(4);
          if (var2 == 0) {
            break L1;
          } else {
            param0.field_k = param0.field_k - 1;
            this.field_a = new qg();
            this.field_a.b(param0);
            this.field_i = new qg();
            this.field_i.b(param0);
            break L1;
          }
        }
        L2: {
          var2 = param0.f(4);
          if (var2 == 0) {
            break L2;
          } else {
            param0.field_k = param0.field_k - 1;
            this.field_o = new qg();
            this.field_o.b(param0);
            this.field_b = new qg();
            this.field_b.b(param0);
            break L2;
          }
        }
        var3 = 0;
        L3: while (true) {
          L4: {
            if (var3 >= 10) {
              break L4;
            } else {
              var4 = param0.d((byte) -42);
              if (var4 != 0) {
                this.field_l[var3] = var4;
                this.field_d[var3] = param0.e(-64);
                this.field_p[var3] = param0.d((byte) 118);
                var3++;
                continue L3;
              } else {
                break L4;
              }
            }
          }
          this.field_v = param0.d((byte) -30);
          this.field_m = param0.d((byte) -86);
          this.field_u = param0.c((byte) 80);
          this.field_y = param0.c((byte) 60);
          this.field_r = new dh();
          this.field_g = new qg();
          this.field_r.a(param0, this.field_g);
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
            return field_e[param0 & 32767] * param1 >> 14;
        }
        if (param2 == 3) {
            return ((param0 & 32767) * param1 >> 14) - param1;
        }
        if (param2 == 4) {
            return field_t[param0 / 2607 & 32767] * param1;
        }
        return 0;
    }

    tj() {
        this.field_l = new int[]{0, 0, 0, 0, 0};
        this.field_m = 100;
        this.field_d = new int[]{0, 0, 0, 0, 0};
        this.field_p = new int[]{0, 0, 0, 0, 0};
        this.field_u = 500;
        this.field_v = 0;
        this.field_y = 0;
    }

    static {
        int var1 = 0;
        field_t = new int[32768];
        Random var0 = new Random(0L);
        for (var1 = 0; var1 < 32768; var1++) {
            field_t[var1] = (var0.nextInt() & 2) - 1;
        }
        field_e = new int[32768];
        for (var1 = 0; var1 < 32768; var1++) {
            field_e[var1] = (int)(Math.sin((double)var1 / 5215.1903) * 16384.0);
        }
        field_q = new int[220500];
        field_k = new int[5];
        field_j = new int[5];
        field_c = new int[5];
        field_w = new int[5];
        field_x = new int[5];
    }
}
