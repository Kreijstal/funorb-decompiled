/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gd extends tj {
    private tj field_s;
    private float field_q;
    private float field_r;
    private float field_m;
    private float field_w;
    private oi[] field_n;
    private float field_l;
    private oi[] field_y;
    private sh[] field_z;
    private float field_v;
    private int[] field_u;
    private float field_x;
    private float field_p;
    private float field_o;
    private sh[] field_t;

    final tj b() {
        return null;
    }

    final tj d() {
        return ((gd) this).field_s;
    }

    final synchronized void c(int param0) {
        if (((gd) this).field_s != null) {
            ((gd) this).field_s.c(param0);
        }
    }

    final synchronized float j() {
        return ((gd) this).field_o;
    }

    final synchronized float g() {
        return ((gd) this).field_p;
    }

    private final void i() {
        int var1 = 0;
        L0: {
          if (!ug.field_b) {
            if (((gd) this).field_n == null) {
              break L0;
            } else {
              var1 = 0;
              L1: while (true) {
                if (var1 >= 8) {
                  var1 = 0;
                  L2: while (true) {
                    if (var1 >= 4) {
                      ((gd) this).field_n = null;
                      ((gd) this).field_z = null;
                      ((gd) this).field_u = new int[256];
                      break L0;
                    } else {
                      ((gd) this).field_t[var1].a();
                      var1++;
                      continue L2;
                    }
                  }
                } else {
                  ((gd) this).field_y[var1].a();
                  var1++;
                  continue L1;
                }
              }
            }
          } else {
            if (((gd) this).field_n != null) {
              break L0;
            } else {
              var1 = 0;
              L3: while (true) {
                if (var1 >= 8) {
                  var1 = 0;
                  L4: while (true) {
                    if (var1 >= 4) {
                      ((gd) this).field_n = new oi[8];
                      ((gd) this).field_n[0] = new oi(1139 * ug.field_g / 44100);
                      ((gd) this).field_n[1] = new oi(1211 * ug.field_g / 44100);
                      ((gd) this).field_n[2] = new oi(1300 * ug.field_g / 44100);
                      ((gd) this).field_n[3] = new oi(1379 * ug.field_g / 44100);
                      ((gd) this).field_n[4] = new oi(1445 * ug.field_g / 44100);
                      ((gd) this).field_n[5] = new oi(1514 * ug.field_g / 44100);
                      ((gd) this).field_n[6] = new oi(1580 * ug.field_g / 44100);
                      ((gd) this).field_n[7] = new oi(1640 * ug.field_g / 44100);
                      ((gd) this).field_z = new sh[4];
                      ((gd) this).field_z[0] = new sh(579 * ug.field_g / 44100);
                      ((gd) this).field_z[1] = new sh(464 * ug.field_g / 44100);
                      ((gd) this).field_z[2] = new sh(364 * ug.field_g / 44100);
                      ((gd) this).field_z[3] = new sh(248 * ug.field_g / 44100);
                      ((gd) this).field_u = new int[512];
                      break L0;
                    } else {
                      ((gd) this).field_t[var1].a();
                      var1++;
                      continue L4;
                    }
                  }
                } else {
                  ((gd) this).field_y[var1].a();
                  var1++;
                  continue L3;
                }
              }
            }
          }
        }
    }

    final synchronized void a(float param0) {
        ((gd) this).field_m = param0;
    }

    final synchronized float f() {
        return ((gd) this).field_w;
    }

    final synchronized float k() {
        return ((gd) this).field_x;
    }

    final synchronized void f(float param0) {
        ((gd) this).field_v = param0;
    }

    final synchronized float h() {
        return ((gd) this).field_v;
    }

    private final static int a(int param0, int[] param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          if (param3 <= param1.length) {
            break L0;
          } else {
            param3 = param1.length;
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (var4 >= param3) {
            return param0;
          } else {
            L2: {
              var5 = param1[param2];
              if (var5 <= 0) {
                break L2;
              } else {
                var5 = -var5;
                break L2;
              }
            }
            L3: {
              if (var5 >= param0) {
                break L3;
              } else {
                param0 = var5;
                break L3;
              }
            }
            param2++;
            if (param2 == param1.length) {
              param2 = 0;
              var4++;
              continue L1;
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
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
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        oi var23 = null;
        sh var24 = null;
        oi var25 = null;
        sh var26 = null;
        oi var27 = null;
        sh var28 = null;
        this.i();
        param2 = param2 + param1;
        L0: while (true) {
          if (param1 >= param2) {
            return;
          } else {
            L1: {
              var4 = param2 - param1;
              if (var4 <= 256) {
                break L1;
              } else {
                var4 = 256;
                break L1;
              }
            }
            L2: {
              if (((gd) this).field_s == null) {
                break L2;
              } else {
                ((gd) this).field_s.b(((gd) this).field_u, 0, var4);
                break L2;
              }
            }
            var5 = 0;
            var6 = 0;
            L3: while (true) {
              if (var6 >= 8) {
                var6 = 0;
                L4: while (true) {
                  if (var6 >= 4) {
                    L5: {
                      if (!ug.field_b) {
                        break L5;
                      } else {
                        var6 = 0;
                        L6: while (true) {
                          if (var6 >= 8) {
                            var6 = 0;
                            L7: while (true) {
                              if (var6 >= 4) {
                                var4 = var4 << 1;
                                param1 = param1 << 1;
                                break L5;
                              } else {
                                var5 = gd.a(var5, ((gd) this).field_z[var6].field_a, ((gd) this).field_z[var6].field_b, var4);
                                var6++;
                                continue L7;
                              }
                            }
                          } else {
                            var5 = gd.a(var5, ((gd) this).field_n[var6].field_c, ((gd) this).field_n[var6].field_b, var4);
                            var6++;
                            continue L6;
                          }
                        }
                      }
                    }
                    var6 = 0;
                    L8: while (true) {
                      if (var6 >= var4) {
                        var6 = 0;
                        L9: while (true) {
                          if (var5 > -4096) {
                            L10: {
                              var7 = (int)(((gd) this).field_w * 4096.0f);
                              var8 = (int)(((gd) this).field_l * 4096.0f);
                              var9 = (int)(((gd) this).field_m * 4096.0f);
                              var10 = (int)(((gd) this).field_v * 65536.0f);
                              if (!ug.field_b) {
                                var11 = (int)(((gd) this).field_x * 4096.0f);
                                var12 = 0;
                                L11: while (true) {
                                  if (var12 >= var4) {
                                    break L10;
                                  } else {
                                    var13 = ((gd) this).field_u[var12] >> var6;
                                    var14 = var13 * var10 >> 16;
                                    var15 = 0;
                                    var16 = 0;
                                    L12: while (true) {
                                      if (var16 >= 8) {
                                        var16 = 0;
                                        L13: while (true) {
                                          if (var16 >= 4) {
                                            if (var6 <= 12) {
                                              int incrementValue$14 = param1;
                                              param1++;
                                              param0[incrementValue$14] = param0[incrementValue$14] + (var15 * var11 + var13 * var9 >> 12 - var6);
                                              var12++;
                                              continue L11;
                                            } else {
                                              int incrementValue$15 = param1;
                                              param1++;
                                              param0[incrementValue$15] = param0[incrementValue$15] + (var15 * var11 + var13 * var9 << var6 - 12);
                                              var12++;
                                              continue L11;
                                            }
                                          } else {
                                            var28 = ((gd) this).field_t[var16];
                                            var18 = var28.field_a[var28.field_b] >> var6;
                                            var15 = var18 - var15;
                                            var28.field_a[var28.field_b] = var14 + (var18 * 2048 + 2048 >> 12) << var6;
                                            int fieldTemp$16 = var28.field_b + 1;
                                            var28.field_b = var28.field_b + 1;
                                            if (fieldTemp$16 >= var28.field_a.length) {
                                              var28.field_b = 0;
                                              var16++;
                                              continue L13;
                                            } else {
                                              var16++;
                                              continue L13;
                                            }
                                          }
                                        }
                                      } else {
                                        L14: {
                                          var27 = ((gd) this).field_y[var16];
                                          var18 = var27.field_c[var27.field_b] >> var6;
                                          var19 = var27.field_a >> var6;
                                          var19 = var19 + ((var18 - var19) * var8 + 2048 >> 12);
                                          var27.field_a = var19 << var6;
                                          var27.field_c[var27.field_b] = var14 + (var19 * var7 + 2048 >> 12) << var6;
                                          int fieldTemp$17 = var27.field_b + 1;
                                          var27.field_b = var27.field_b + 1;
                                          if (fieldTemp$17 < var27.field_c.length) {
                                            break L14;
                                          } else {
                                            var27.field_b = 0;
                                            break L14;
                                          }
                                        }
                                        var15 = var15 + var18;
                                        var16++;
                                        continue L12;
                                      }
                                    }
                                  }
                                }
                              } else {
                                var11 = (int)(((gd) this).field_q * 4096.0f);
                                var12 = (int)(((gd) this).field_r * 4096.0f);
                                var13 = 0;
                                L15: while (true) {
                                  if (var13 >= var4) {
                                    param1 = param1 >> 1;
                                    break L10;
                                  } else {
                                    int incrementValue$18 = var13;
                                    var13++;
                                    var14 = ((gd) this).field_u[incrementValue$18] >> var6;
                                    int incrementValue$19 = var13;
                                    var13++;
                                    var15 = ((gd) this).field_u[incrementValue$19] >> var6;
                                    var16 = (var14 + var15) * var10 >> 17;
                                    var17 = 0;
                                    var18 = 0;
                                    L16: while (true) {
                                      if (var18 >= 8) {
                                        var18 = 0;
                                        L17: while (true) {
                                          if (var18 >= 4) {
                                            var18 = 0;
                                            var19 = 0;
                                            L18: while (true) {
                                              if (var19 >= 8) {
                                                var19 = 0;
                                                L19: while (true) {
                                                  if (var19 >= 4) {
                                                    if (var6 <= 12) {
                                                      int incrementValue$20 = param1;
                                                      param1++;
                                                      param0[incrementValue$20] = param0[incrementValue$20] + (var17 * var11 + var18 * var12 + var14 * var9 >> 12 - var6);
                                                      int incrementValue$21 = param1;
                                                      param1++;
                                                      param0[incrementValue$21] = param0[incrementValue$21] + (var18 * var11 + var17 * var12 + var15 * var9 >> 12 - var6);
                                                      continue L15;
                                                    } else {
                                                      int incrementValue$22 = param1;
                                                      param1++;
                                                      param0[incrementValue$22] = param0[incrementValue$22] + (var17 * var11 + var18 * var12 + var14 * var9 << var6 - 12);
                                                      int incrementValue$23 = param1;
                                                      param1++;
                                                      param0[incrementValue$23] = param0[incrementValue$23] + (var18 * var11 + var17 * var12 + var15 * var9 << var6 - 12);
                                                      continue L15;
                                                    }
                                                  } else {
                                                    var26 = ((gd) this).field_z[var19];
                                                    var21 = var26.field_a[var26.field_b] >> var6;
                                                    var18 = var21 - var18;
                                                    var26.field_a[var26.field_b] = var16 + (var21 * 2048 + 2048 >> 12) << var6;
                                                    int fieldTemp$24 = var26.field_b + 1;
                                                    var26.field_b = var26.field_b + 1;
                                                    if (fieldTemp$24 >= var26.field_a.length) {
                                                      var26.field_b = 0;
                                                      var19++;
                                                      continue L19;
                                                    } else {
                                                      var19++;
                                                      continue L19;
                                                    }
                                                  }
                                                }
                                              } else {
                                                L20: {
                                                  var25 = ((gd) this).field_n[var19];
                                                  var21 = var25.field_c[var25.field_b] >> var6;
                                                  var22 = var25.field_a >> var6;
                                                  var22 = var22 + ((var21 - var22) * var8 + 2048 >> 12);
                                                  var25.field_a = var22 << var6;
                                                  var25.field_c[var25.field_b] = var16 + (var22 * var7 + 2048 >> 12) << var6;
                                                  int fieldTemp$25 = var25.field_b + 1;
                                                  var25.field_b = var25.field_b + 1;
                                                  if (fieldTemp$25 < var25.field_c.length) {
                                                    break L20;
                                                  } else {
                                                    var25.field_b = 0;
                                                    break L20;
                                                  }
                                                }
                                                var18 = var18 + var21;
                                                var19++;
                                                continue L18;
                                              }
                                            }
                                          } else {
                                            var24 = ((gd) this).field_t[var18];
                                            var20 = var24.field_a[var24.field_b] >> var6;
                                            var17 = var20 - var17;
                                            var24.field_a[var24.field_b] = var16 + (var20 * 2048 + 2048 >> 12) << var6;
                                            int fieldTemp$26 = var24.field_b + 1;
                                            var24.field_b = var24.field_b + 1;
                                            if (fieldTemp$26 >= var24.field_a.length) {
                                              var24.field_b = 0;
                                              var18++;
                                              continue L17;
                                            } else {
                                              var18++;
                                              continue L17;
                                            }
                                          }
                                        }
                                      } else {
                                        L21: {
                                          var23 = ((gd) this).field_y[var18];
                                          var20 = var23.field_c[var23.field_b] >> var6;
                                          var21 = var23.field_a >> var6;
                                          var21 = var21 + ((var20 - var21) * var8 + 2048 >> 12);
                                          var23.field_a = var21 << var6;
                                          var23.field_c[var23.field_b] = var16 + (var21 * var7 + 2048 >> 12) << var6;
                                          int fieldTemp$27 = var23.field_b + 1;
                                          var23.field_b = var23.field_b + 1;
                                          if (fieldTemp$27 < var23.field_c.length) {
                                            break L21;
                                          } else {
                                            var23.field_b = 0;
                                            break L21;
                                          }
                                        }
                                        var17 = var17 + var20;
                                        var18++;
                                        continue L16;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            if (((gd) this).field_s == null) {
                              continue L0;
                            } else {
                              kf.a(((gd) this).field_u, 0, var4);
                              continue L0;
                            }
                          } else {
                            var6++;
                            var5 = var5 >> 1;
                            continue L9;
                          }
                        }
                      } else {
                        L22: {
                          var7 = ((gd) this).field_u[var6];
                          if (var7 <= 0) {
                            break L22;
                          } else {
                            var7 = -var7;
                            break L22;
                          }
                        }
                        if (var7 < var5) {
                          var5 = var7;
                          var6++;
                          continue L8;
                        } else {
                          var6++;
                          continue L8;
                        }
                      }
                    }
                  } else {
                    var5 = gd.a(var5, ((gd) this).field_t[var6].field_a, ((gd) this).field_t[var6].field_b, var4);
                    var6++;
                    continue L4;
                  }
                }
              } else {
                var5 = gd.a(var5, ((gd) this).field_y[var6].field_c, ((gd) this).field_y[var6].field_b, var4);
                var6++;
                continue L3;
              }
            }
          }
        }
    }

    final synchronized void b(float param0) {
        ((gd) this).field_w = param0;
    }

    final int c() {
        return 8;
    }

    final synchronized void c(float param0) {
        ((gd) this).field_x = param0;
        ((gd) this).field_q = (float)((double)((gd) this).field_x * Math.sqrt((double)(1.0f + ((gd) this).field_o) * 0.5));
        ((gd) this).field_r = (float)((double)((gd) this).field_x * Math.sqrt((double)(1.0f - ((gd) this).field_o) * 0.5));
    }

    final synchronized void e(float param0) {
        ((gd) this).field_p = param0;
        ((gd) this).field_l = 1.0f - (float)Math.pow(0.5, 1000000.0 / (double)(((gd) this).field_p * (float)ug.field_g));
    }

    final synchronized float e() {
        return ((gd) this).field_m;
    }

    final synchronized void d(float param0) {
        ((gd) this).field_o = param0;
        ((gd) this).field_q = (float)((double)((gd) this).field_x * Math.sqrt((double)(1.0f + ((gd) this).field_o) * 0.5));
        ((gd) this).field_r = (float)((double)((gd) this).field_x * Math.sqrt((double)(1.0f - ((gd) this).field_o) * 0.5));
    }

    gd(tj param0) {
        L0: {
          ((gd) this).field_y = new oi[8];
          ((gd) this).field_y[0] = new oi(1116 * ug.field_g / 44100);
          ((gd) this).field_y[1] = new oi(1188 * ug.field_g / 44100);
          ((gd) this).field_y[2] = new oi(1277 * ug.field_g / 44100);
          ((gd) this).field_y[3] = new oi(1356 * ug.field_g / 44100);
          ((gd) this).field_y[4] = new oi(1422 * ug.field_g / 44100);
          ((gd) this).field_y[5] = new oi(1491 * ug.field_g / 44100);
          ((gd) this).field_y[6] = new oi(1557 * ug.field_g / 44100);
          ((gd) this).field_y[7] = new oi(1617 * ug.field_g / 44100);
          ((gd) this).field_t = new sh[4];
          ((gd) this).field_t[0] = new sh(556 * ug.field_g / 44100);
          ((gd) this).field_t[1] = new sh(441 * ug.field_g / 44100);
          ((gd) this).field_t[2] = new sh(341 * ug.field_g / 44100);
          ((gd) this).field_t[3] = new sh(225 * ug.field_g / 44100);
          if (ug.field_b) {
            break L0;
          } else {
            ((gd) this).field_u = new int[256];
            break L0;
          }
        }
        this.i();
        ((gd) this).f(0.04500000178813934f);
        ((gd) this).c(1.0f);
        ((gd) this).b(0.8399999737739563f);
        ((gd) this).a(1.0f);
        ((gd) this).e(7000.0f);
        ((gd) this).d(1.0f);
        ((gd) this).field_s = param0;
    }
}
