/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wb extends wg {
    private float field_q;
    private float field_k;
    private lc[] field_v;
    private float field_n;
    private lc[] field_l;
    private float field_m;
    private float field_w;
    private nc[] field_y;
    private int[] field_t;
    private wg field_r;
    private float field_o;
    private float field_u;
    private float field_x;
    private nc[] field_s;
    private float field_p;

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
        nc var23 = null;
        lc var24 = null;
        nc var25 = null;
        lc var26 = null;
        nc var27 = null;
        lc var28 = null;
        this.e();
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
              if (((wb) this).field_r == null) {
                break L2;
              } else {
                ((wb) this).field_r.b(((wb) this).field_t, 0, var4);
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
                      if (!ie.field_o) {
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
                                var5 = wb.a(var5, ((wb) this).field_v[var6].field_b, ((wb) this).field_v[var6].field_a, var4);
                                var6++;
                                continue L7;
                              }
                            }
                          } else {
                            var5 = wb.a(var5, ((wb) this).field_y[var6].field_a, ((wb) this).field_y[var6].field_b, var4);
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
                              var7 = (int)(((wb) this).field_k * 4096.0f);
                              var8 = (int)(((wb) this).field_p * 4096.0f);
                              var9 = (int)(((wb) this).field_o * 4096.0f);
                              var10 = (int)(((wb) this).field_x * 65536.0f);
                              if (!ie.field_o) {
                                var11 = (int)(((wb) this).field_n * 4096.0f);
                                var12 = 0;
                                L11: while (true) {
                                  if (var12 >= var4) {
                                    break L10;
                                  } else {
                                    var13 = ((wb) this).field_t[var12] >> var6;
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
                                            var28 = ((wb) this).field_l[var16];
                                            var18 = var28.field_b[var28.field_a] >> var6;
                                            var15 = var18 - var15;
                                            var28.field_b[var28.field_a] = var14 + (var18 * 2048 + 2048 >> 12) << var6;
                                            int fieldTemp$16 = var28.field_a + 1;
                                            var28.field_a = var28.field_a + 1;
                                            if (fieldTemp$16 >= var28.field_b.length) {
                                              var28.field_a = 0;
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
                                          var27 = ((wb) this).field_s[var16];
                                          var18 = var27.field_a[var27.field_b] >> var6;
                                          var19 = var27.field_c >> var6;
                                          var19 = var19 + ((var18 - var19) * var8 + 2048 >> 12);
                                          var27.field_c = var19 << var6;
                                          var27.field_a[var27.field_b] = var14 + (var19 * var7 + 2048 >> 12) << var6;
                                          int fieldTemp$17 = var27.field_b + 1;
                                          var27.field_b = var27.field_b + 1;
                                          if (fieldTemp$17 < var27.field_a.length) {
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
                                var11 = (int)(((wb) this).field_w * 4096.0f);
                                var12 = (int)(((wb) this).field_q * 4096.0f);
                                var13 = 0;
                                L15: while (true) {
                                  if (var13 >= var4) {
                                    param1 = param1 >> 1;
                                    break L10;
                                  } else {
                                    int incrementValue$18 = var13;
                                    var13++;
                                    var14 = ((wb) this).field_t[incrementValue$18] >> var6;
                                    int incrementValue$19 = var13;
                                    var13++;
                                    var15 = ((wb) this).field_t[incrementValue$19] >> var6;
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
                                                    var26 = ((wb) this).field_v[var19];
                                                    var21 = var26.field_b[var26.field_a] >> var6;
                                                    var18 = var21 - var18;
                                                    var26.field_b[var26.field_a] = var16 + (var21 * 2048 + 2048 >> 12) << var6;
                                                    int fieldTemp$24 = var26.field_a + 1;
                                                    var26.field_a = var26.field_a + 1;
                                                    if (fieldTemp$24 >= var26.field_b.length) {
                                                      var26.field_a = 0;
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
                                                  var25 = ((wb) this).field_y[var19];
                                                  var21 = var25.field_a[var25.field_b] >> var6;
                                                  var22 = var25.field_c >> var6;
                                                  var22 = var22 + ((var21 - var22) * var8 + 2048 >> 12);
                                                  var25.field_c = var22 << var6;
                                                  var25.field_a[var25.field_b] = var16 + (var22 * var7 + 2048 >> 12) << var6;
                                                  int fieldTemp$25 = var25.field_b + 1;
                                                  var25.field_b = var25.field_b + 1;
                                                  if (fieldTemp$25 < var25.field_a.length) {
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
                                            var24 = ((wb) this).field_l[var18];
                                            var20 = var24.field_b[var24.field_a] >> var6;
                                            var17 = var20 - var17;
                                            var24.field_b[var24.field_a] = var16 + (var20 * 2048 + 2048 >> 12) << var6;
                                            int fieldTemp$26 = var24.field_a + 1;
                                            var24.field_a = var24.field_a + 1;
                                            if (fieldTemp$26 >= var24.field_b.length) {
                                              var24.field_a = 0;
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
                                          var23 = ((wb) this).field_s[var18];
                                          var20 = var23.field_a[var23.field_b] >> var6;
                                          var21 = var23.field_c >> var6;
                                          var21 = var21 + ((var20 - var21) * var8 + 2048 >> 12);
                                          var23.field_c = var21 << var6;
                                          var23.field_a[var23.field_b] = var16 + (var21 * var7 + 2048 >> 12) << var6;
                                          int fieldTemp$27 = var23.field_b + 1;
                                          var23.field_b = var23.field_b + 1;
                                          if (fieldTemp$27 < var23.field_a.length) {
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
                            if (((wb) this).field_r == null) {
                              continue L0;
                            } else {
                              qg.a(((wb) this).field_t, 0, var4);
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
                          var7 = ((wb) this).field_t[var6];
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
                    var5 = wb.a(var5, ((wb) this).field_l[var6].field_b, ((wb) this).field_l[var6].field_a, var4);
                    var6++;
                    continue L4;
                  }
                }
              } else {
                var5 = wb.a(var5, ((wb) this).field_s[var6].field_a, ((wb) this).field_s[var6].field_b, var4);
                var6++;
                continue L3;
              }
            }
          }
        }
    }

    private final synchronized void a(float param0) {
        ((wb) this).field_u = param0;
        ((wb) this).field_w = (float)((double)((wb) this).field_n * Math.sqrt((double)(1.0f + ((wb) this).field_u) * 0.5));
        ((wb) this).field_q = (float)((double)((wb) this).field_n * Math.sqrt((double)(1.0f - ((wb) this).field_u) * 0.5));
    }

    final wg c() {
        return ((wb) this).field_r;
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

    private final synchronized void c(float param0) {
        ((wb) this).field_o = param0;
    }

    final synchronized void d(int param0) {
        if (((wb) this).field_r != null) {
            ((wb) this).field_r.d(param0);
        }
    }

    private final synchronized void f(float param0) {
        ((wb) this).field_n = param0;
        ((wb) this).field_w = (float)((double)((wb) this).field_n * Math.sqrt((double)(1.0f + ((wb) this).field_u) * 0.5));
        ((wb) this).field_q = (float)((double)((wb) this).field_n * Math.sqrt((double)(1.0f - ((wb) this).field_u) * 0.5));
    }

    private final synchronized void e(float param0) {
        ((wb) this).field_x = param0;
    }

    private final void e() {
        int var1 = 0;
        L0: {
          if (!ie.field_o) {
            if (((wb) this).field_y == null) {
              break L0;
            } else {
              var1 = 0;
              L1: while (true) {
                if (var1 >= 8) {
                  var1 = 0;
                  L2: while (true) {
                    if (var1 >= 4) {
                      ((wb) this).field_y = null;
                      ((wb) this).field_v = null;
                      ((wb) this).field_t = new int[256];
                      break L0;
                    } else {
                      ((wb) this).field_l[var1].a();
                      var1++;
                      continue L2;
                    }
                  }
                } else {
                  ((wb) this).field_s[var1].a();
                  var1++;
                  continue L1;
                }
              }
            }
          } else {
            if (((wb) this).field_y != null) {
              break L0;
            } else {
              var1 = 0;
              L3: while (true) {
                if (var1 >= 8) {
                  var1 = 0;
                  L4: while (true) {
                    if (var1 >= 4) {
                      ((wb) this).field_y = new nc[8];
                      ((wb) this).field_y[0] = new nc(1139 * ie.field_q / 44100);
                      ((wb) this).field_y[1] = new nc(1211 * ie.field_q / 44100);
                      ((wb) this).field_y[2] = new nc(1300 * ie.field_q / 44100);
                      ((wb) this).field_y[3] = new nc(1379 * ie.field_q / 44100);
                      ((wb) this).field_y[4] = new nc(1445 * ie.field_q / 44100);
                      ((wb) this).field_y[5] = new nc(1514 * ie.field_q / 44100);
                      ((wb) this).field_y[6] = new nc(1580 * ie.field_q / 44100);
                      ((wb) this).field_y[7] = new nc(1640 * ie.field_q / 44100);
                      ((wb) this).field_v = new lc[4];
                      ((wb) this).field_v[0] = new lc(579 * ie.field_q / 44100);
                      ((wb) this).field_v[1] = new lc(464 * ie.field_q / 44100);
                      ((wb) this).field_v[2] = new lc(364 * ie.field_q / 44100);
                      ((wb) this).field_v[3] = new lc(248 * ie.field_q / 44100);
                      ((wb) this).field_t = new int[512];
                      break L0;
                    } else {
                      ((wb) this).field_l[var1].a();
                      var1++;
                      continue L4;
                    }
                  }
                } else {
                  ((wb) this).field_s[var1].a();
                  var1++;
                  continue L3;
                }
              }
            }
          }
        }
    }

    final synchronized void b(float param0) {
        ((wb) this).field_m = param0;
        ((wb) this).field_p = 1.0f - (float)Math.pow(0.5, 1000000.0 / (double)(((wb) this).field_m * (float)ie.field_q));
    }

    final wg b() {
        return null;
    }

    final synchronized void d(float param0) {
        ((wb) this).field_k = param0;
    }

    final int a() {
        return 8;
    }

    wb(wg param0) {
        L0: {
          ((wb) this).field_s = new nc[8];
          ((wb) this).field_s[0] = new nc(1116 * ie.field_q / 44100);
          ((wb) this).field_s[1] = new nc(1188 * ie.field_q / 44100);
          ((wb) this).field_s[2] = new nc(1277 * ie.field_q / 44100);
          ((wb) this).field_s[3] = new nc(1356 * ie.field_q / 44100);
          ((wb) this).field_s[4] = new nc(1422 * ie.field_q / 44100);
          ((wb) this).field_s[5] = new nc(1491 * ie.field_q / 44100);
          ((wb) this).field_s[6] = new nc(1557 * ie.field_q / 44100);
          ((wb) this).field_s[7] = new nc(1617 * ie.field_q / 44100);
          ((wb) this).field_l = new lc[4];
          ((wb) this).field_l[0] = new lc(556 * ie.field_q / 44100);
          ((wb) this).field_l[1] = new lc(441 * ie.field_q / 44100);
          ((wb) this).field_l[2] = new lc(341 * ie.field_q / 44100);
          ((wb) this).field_l[3] = new lc(225 * ie.field_q / 44100);
          if (ie.field_o) {
            break L0;
          } else {
            ((wb) this).field_t = new int[256];
            break L0;
          }
        }
        this.e();
        this.e(0.04500000178813934f);
        this.f(1.0f);
        ((wb) this).d(0.8399999737739563f);
        this.c(1.0f);
        ((wb) this).b(7000.0f);
        this.a(1.0f);
        ((wb) this).field_r = param0;
    }
}
