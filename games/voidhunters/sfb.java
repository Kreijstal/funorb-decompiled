/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sfb extends f {
    private float field_s;
    private f field_k;
    private float field_t;
    private in[] field_o;
    private float field_u;
    private float field_h;
    private float field_v;
    private float field_l;
    private float field_n;
    private int[] field_j;
    private float field_q;
    private float field_m;
    private oka[] field_p;
    private in[] field_i;
    private oka[] field_r;

    final f c() {
        return ((sfb) this).field_k;
    }

    private final void e() {
        int var1 = 0;
        L0: {
          if (!vka.field_r) {
            if (((sfb) this).field_o == null) {
              break L0;
            } else {
              var1 = 0;
              L1: while (true) {
                if (var1 >= 8) {
                  var1 = 0;
                  L2: while (true) {
                    if (var1 >= 4) {
                      ((sfb) this).field_o = null;
                      ((sfb) this).field_p = null;
                      ((sfb) this).field_j = new int[256];
                      break L0;
                    } else {
                      ((sfb) this).field_r[var1].a();
                      var1++;
                      continue L2;
                    }
                  }
                } else {
                  ((sfb) this).field_i[var1].a();
                  var1++;
                  continue L1;
                }
              }
            }
          } else {
            if (((sfb) this).field_o != null) {
              break L0;
            } else {
              var1 = 0;
              L3: while (true) {
                if (var1 >= 8) {
                  var1 = 0;
                  L4: while (true) {
                    if (var1 >= 4) {
                      ((sfb) this).field_o = new in[8];
                      ((sfb) this).field_o[0] = new in(1139 * vka.field_s / 44100);
                      ((sfb) this).field_o[1] = new in(1211 * vka.field_s / 44100);
                      ((sfb) this).field_o[2] = new in(1300 * vka.field_s / 44100);
                      ((sfb) this).field_o[3] = new in(1379 * vka.field_s / 44100);
                      ((sfb) this).field_o[4] = new in(1445 * vka.field_s / 44100);
                      ((sfb) this).field_o[5] = new in(1514 * vka.field_s / 44100);
                      ((sfb) this).field_o[6] = new in(1580 * vka.field_s / 44100);
                      ((sfb) this).field_o[7] = new in(1640 * vka.field_s / 44100);
                      ((sfb) this).field_p = new oka[4];
                      ((sfb) this).field_p[0] = new oka(579 * vka.field_s / 44100);
                      ((sfb) this).field_p[1] = new oka(464 * vka.field_s / 44100);
                      ((sfb) this).field_p[2] = new oka(364 * vka.field_s / 44100);
                      ((sfb) this).field_p[3] = new oka(248 * vka.field_s / 44100);
                      ((sfb) this).field_j = new int[512];
                      break L0;
                    } else {
                      ((sfb) this).field_r[var1].a();
                      var1++;
                      continue L4;
                    }
                  }
                } else {
                  ((sfb) this).field_i[var1].a();
                  var1++;
                  continue L3;
                }
              }
            }
          }
        }
    }

    final synchronized void f(float param0) {
        ((sfb) this).field_t = param0;
        ((sfb) this).field_q = (float)((double)((sfb) this).field_u * Math.sqrt((double)(1.0f + ((sfb) this).field_t) * 0.5));
        ((sfb) this).field_s = (float)((double)((sfb) this).field_u * Math.sqrt((double)(1.0f - ((sfb) this).field_t) * 0.5));
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

    final int d() {
        return 8;
    }

    final synchronized void c(float param0) {
        ((sfb) this).field_h = param0;
    }

    final synchronized void a(int param0) {
        if (((sfb) this).field_k != null) {
            ((sfb) this).field_k.a(param0);
        }
    }

    final synchronized void a(int[] param0, int param1, int param2) {
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
        in var23 = null;
        oka var24 = null;
        in var25 = null;
        oka var26 = null;
        in var27 = null;
        oka var28 = null;
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
              if (((sfb) this).field_k == null) {
                break L2;
              } else {
                ((sfb) this).field_k.a(((sfb) this).field_j, 0, var4);
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
                      if (!vka.field_r) {
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
                                var5 = sfb.a(var5, ((sfb) this).field_p[var6].field_a, ((sfb) this).field_p[var6].field_b, var4);
                                var6++;
                                continue L7;
                              }
                            }
                          } else {
                            var5 = sfb.a(var5, ((sfb) this).field_o[var6].field_a, ((sfb) this).field_o[var6].field_b, var4);
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
                              var7 = (int)(((sfb) this).field_h * 4096.0f);
                              var8 = (int)(((sfb) this).field_v * 4096.0f);
                              var9 = (int)(((sfb) this).field_n * 4096.0f);
                              var10 = (int)(((sfb) this).field_m * 65536.0f);
                              if (!vka.field_r) {
                                var11 = (int)(((sfb) this).field_u * 4096.0f);
                                var12 = 0;
                                L11: while (true) {
                                  if (var12 >= var4) {
                                    break L10;
                                  } else {
                                    var13 = ((sfb) this).field_j[var12] >> var6;
                                    var14 = var13 * var10 >> 16;
                                    var15 = 0;
                                    var16 = 0;
                                    L12: while (true) {
                                      if (var16 >= 8) {
                                        var16 = 0;
                                        L13: while (true) {
                                          if (var16 >= 4) {
                                            if (var6 <= 12) {
                                              param1++;
                                              param0[param1] = param0[param1] + (var15 * var11 + var13 * var9 >> 12 - var6);
                                              var12++;
                                              continue L11;
                                            } else {
                                              param1++;
                                              param0[param1] = param0[param1] + (var15 * var11 + var13 * var9 << var6 - 12);
                                              var12++;
                                              continue L11;
                                            }
                                          } else {
                                            var28 = ((sfb) this).field_r[var16];
                                            var18 = var28.field_a[var28.field_b] >> var6;
                                            var15 = var18 - var15;
                                            var28.field_a[var28.field_b] = var14 + (var18 * 2048 + 2048 >> 12) << var6;
                                            var28.field_b = var28.field_b + 1;
                                            if (var28.field_b + 1 >= var28.field_a.length) {
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
                                          var27 = ((sfb) this).field_i[var16];
                                          var18 = var27.field_a[var27.field_b] >> var6;
                                          var19 = var27.field_c >> var6;
                                          var19 = var19 + ((var18 - var19) * var8 + 2048 >> 12);
                                          var27.field_c = var19 << var6;
                                          var27.field_a[var27.field_b] = var14 + (var19 * var7 + 2048 >> 12) << var6;
                                          var27.field_b = var27.field_b + 1;
                                          if (var27.field_b + 1 < var27.field_a.length) {
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
                                var11 = (int)(((sfb) this).field_q * 4096.0f);
                                var12 = (int)(((sfb) this).field_s * 4096.0f);
                                var13 = 0;
                                L15: while (true) {
                                  if (var13 >= var4) {
                                    param1 = param1 >> 1;
                                    break L10;
                                  } else {
                                    var13++;
                                    var14 = ((sfb) this).field_j[var13] >> var6;
                                    var13++;
                                    var15 = ((sfb) this).field_j[var13] >> var6;
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
                                                      param1++;
                                                      param0[param1] = param0[param1] + (var17 * var11 + var18 * var12 + var14 * var9 >> 12 - var6);
                                                      param1++;
                                                      param0[param1] = param0[param1] + (var18 * var11 + var17 * var12 + var15 * var9 >> 12 - var6);
                                                      continue L15;
                                                    } else {
                                                      param1++;
                                                      param0[param1] = param0[param1] + (var17 * var11 + var18 * var12 + var14 * var9 << var6 - 12);
                                                      param1++;
                                                      param0[param1] = param0[param1] + (var18 * var11 + var17 * var12 + var15 * var9 << var6 - 12);
                                                      continue L15;
                                                    }
                                                  } else {
                                                    var26 = ((sfb) this).field_p[var19];
                                                    var21 = var26.field_a[var26.field_b] >> var6;
                                                    var18 = var21 - var18;
                                                    var26.field_a[var26.field_b] = var16 + (var21 * 2048 + 2048 >> 12) << var6;
                                                    var26.field_b = var26.field_b + 1;
                                                    if (var26.field_b + 1 >= var26.field_a.length) {
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
                                                  var25 = ((sfb) this).field_o[var19];
                                                  var21 = var25.field_a[var25.field_b] >> var6;
                                                  var22 = var25.field_c >> var6;
                                                  var22 = var22 + ((var21 - var22) * var8 + 2048 >> 12);
                                                  var25.field_c = var22 << var6;
                                                  var25.field_a[var25.field_b] = var16 + (var22 * var7 + 2048 >> 12) << var6;
                                                  var25.field_b = var25.field_b + 1;
                                                  if (var25.field_b + 1 < var25.field_a.length) {
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
                                            var24 = ((sfb) this).field_r[var18];
                                            var20 = var24.field_a[var24.field_b] >> var6;
                                            var17 = var20 - var17;
                                            var24.field_a[var24.field_b] = var16 + (var20 * 2048 + 2048 >> 12) << var6;
                                            var24.field_b = var24.field_b + 1;
                                            if (var24.field_b + 1 >= var24.field_a.length) {
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
                                          var23 = ((sfb) this).field_i[var18];
                                          var20 = var23.field_a[var23.field_b] >> var6;
                                          var21 = var23.field_c >> var6;
                                          var21 = var21 + ((var20 - var21) * var8 + 2048 >> 12);
                                          var23.field_c = var21 << var6;
                                          var23.field_a[var23.field_b] = var16 + (var21 * var7 + 2048 >> 12) << var6;
                                          var23.field_b = var23.field_b + 1;
                                          if (var23.field_b + 1 < var23.field_a.length) {
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
                            if (((sfb) this).field_k == null) {
                              continue L0;
                            } else {
                              cua.a(((sfb) this).field_j, 0, var4);
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
                          var7 = ((sfb) this).field_j[var6];
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
                    var5 = sfb.a(var5, ((sfb) this).field_r[var6].field_a, ((sfb) this).field_r[var6].field_b, var4);
                    var6++;
                    continue L4;
                  }
                }
              } else {
                var5 = sfb.a(var5, ((sfb) this).field_i[var6].field_a, ((sfb) this).field_i[var6].field_b, var4);
                var6++;
                continue L3;
              }
            }
          }
        }
    }

    final synchronized void d(float param0) {
        ((sfb) this).field_m = param0;
    }

    final synchronized void a(float param0) {
        ((sfb) this).field_u = param0;
        ((sfb) this).field_q = (float)((double)((sfb) this).field_u * Math.sqrt((double)(1.0f + ((sfb) this).field_t) * 0.5));
        ((sfb) this).field_s = (float)((double)((sfb) this).field_u * Math.sqrt((double)(1.0f - ((sfb) this).field_t) * 0.5));
    }

    final synchronized void b(float param0) {
        ((sfb) this).field_l = param0;
        ((sfb) this).field_v = 1.0f - (float)Math.pow(0.5, 1000000.0 / (double)(((sfb) this).field_l * (float)vka.field_s));
    }

    final synchronized void e(float param0) {
        ((sfb) this).field_n = param0;
    }

    final f a() {
        return null;
    }

    sfb(f param0) {
        L0: {
          ((sfb) this).field_i = new in[8];
          ((sfb) this).field_i[0] = new in(1116 * vka.field_s / 44100);
          ((sfb) this).field_i[1] = new in(1188 * vka.field_s / 44100);
          ((sfb) this).field_i[2] = new in(1277 * vka.field_s / 44100);
          ((sfb) this).field_i[3] = new in(1356 * vka.field_s / 44100);
          ((sfb) this).field_i[4] = new in(1422 * vka.field_s / 44100);
          ((sfb) this).field_i[5] = new in(1491 * vka.field_s / 44100);
          ((sfb) this).field_i[6] = new in(1557 * vka.field_s / 44100);
          ((sfb) this).field_i[7] = new in(1617 * vka.field_s / 44100);
          ((sfb) this).field_r = new oka[4];
          ((sfb) this).field_r[0] = new oka(556 * vka.field_s / 44100);
          ((sfb) this).field_r[1] = new oka(441 * vka.field_s / 44100);
          ((sfb) this).field_r[2] = new oka(341 * vka.field_s / 44100);
          ((sfb) this).field_r[3] = new oka(225 * vka.field_s / 44100);
          if (vka.field_r) {
            break L0;
          } else {
            ((sfb) this).field_j = new int[256];
            break L0;
          }
        }
        this.e();
        ((sfb) this).d(0.04500000178813934f);
        ((sfb) this).a(1.0f);
        ((sfb) this).c(0.8399999737739563f);
        ((sfb) this).e(1.0f);
        ((sfb) this).b(7000.0f);
        ((sfb) this).f(1.0f);
        ((sfb) this).field_k = param0;
    }
}
