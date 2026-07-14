/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gl extends kd {
    private int[] field_u;
    private float field_q;
    private kd field_A;
    private float field_s;
    private float field_y;
    private float field_v;
    private float field_r;
    private float field_w;
    private qc[] field_t;
    private float field_z;
    private float field_C;
    private qc[] field_x;
    private go[] field_E;
    private float field_p;
    private go[] field_F;

    final synchronized void a(float param0) {
        ((gl) this).field_v = param0;
    }

    final int d() {
        return 8;
    }

    final synchronized void c(float param0) {
        ((gl) this).field_C = param0;
        ((gl) this).field_r = (float)((double)((gl) this).field_w * Math.sqrt((double)(1.0f + ((gl) this).field_C) * 0.5));
        ((gl) this).field_q = (float)((double)((gl) this).field_w * Math.sqrt((double)(1.0f - ((gl) this).field_C) * 0.5));
    }

    final synchronized void a(int param0) {
        if (((gl) this).field_A != null) {
            ((gl) this).field_A.a(param0);
        }
    }

    final synchronized void f(float param0) {
        ((gl) this).field_z = param0;
    }

    final kd a() {
        return ((gl) this).field_A;
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
        qc var23 = null;
        go var24 = null;
        qc var25 = null;
        go var26 = null;
        qc var27 = null;
        go var28 = null;
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
              if (((gl) this).field_A == null) {
                break L2;
              } else {
                ((gl) this).field_A.a(((gl) this).field_u, 0, var4);
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
                      if (!bp.field_r) {
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
                                var5 = gl.a(var5, ((gl) this).field_F[var6].field_a, ((gl) this).field_F[var6].field_b, var4);
                                var6++;
                                continue L7;
                              }
                            }
                          } else {
                            var5 = gl.a(var5, ((gl) this).field_t[var6].field_c, ((gl) this).field_t[var6].field_a, var4);
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
                              var7 = (int)(((gl) this).field_z * 4096.0f);
                              var8 = (int)(((gl) this).field_s * 4096.0f);
                              var9 = (int)(((gl) this).field_p * 4096.0f);
                              var10 = (int)(((gl) this).field_v * 65536.0f);
                              if (!bp.field_r) {
                                var11 = (int)(((gl) this).field_w * 4096.0f);
                                var12 = 0;
                                L11: while (true) {
                                  if (var12 >= var4) {
                                    break L10;
                                  } else {
                                    var13 = ((gl) this).field_u[var12] >> var6;
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
                                            var28 = ((gl) this).field_E[var16];
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
                                          var27 = ((gl) this).field_x[var16];
                                          var18 = var27.field_c[var27.field_a] >> var6;
                                          var19 = var27.field_b >> var6;
                                          var19 = var19 + ((var18 - var19) * var8 + 2048 >> 12);
                                          var27.field_b = var19 << var6;
                                          var27.field_c[var27.field_a] = var14 + (var19 * var7 + 2048 >> 12) << var6;
                                          var27.field_a = var27.field_a + 1;
                                          if (var27.field_a + 1 < var27.field_c.length) {
                                            break L14;
                                          } else {
                                            var27.field_a = 0;
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
                                var11 = (int)(((gl) this).field_r * 4096.0f);
                                var12 = (int)(((gl) this).field_q * 4096.0f);
                                var13 = 0;
                                L15: while (true) {
                                  if (var13 >= var4) {
                                    param1 = param1 >> 1;
                                    break L10;
                                  } else {
                                    var13++;
                                    var14 = ((gl) this).field_u[var13] >> var6;
                                    var13++;
                                    var15 = ((gl) this).field_u[var13] >> var6;
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
                                                    var26 = ((gl) this).field_F[var19];
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
                                                  var25 = ((gl) this).field_t[var19];
                                                  var21 = var25.field_c[var25.field_a] >> var6;
                                                  var22 = var25.field_b >> var6;
                                                  var22 = var22 + ((var21 - var22) * var8 + 2048 >> 12);
                                                  var25.field_b = var22 << var6;
                                                  var25.field_c[var25.field_a] = var16 + (var22 * var7 + 2048 >> 12) << var6;
                                                  var25.field_a = var25.field_a + 1;
                                                  if (var25.field_a + 1 < var25.field_c.length) {
                                                    break L20;
                                                  } else {
                                                    var25.field_a = 0;
                                                    break L20;
                                                  }
                                                }
                                                var18 = var18 + var21;
                                                var19++;
                                                continue L18;
                                              }
                                            }
                                          } else {
                                            var24 = ((gl) this).field_E[var18];
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
                                          var23 = ((gl) this).field_x[var18];
                                          var20 = var23.field_c[var23.field_a] >> var6;
                                          var21 = var23.field_b >> var6;
                                          var21 = var21 + ((var20 - var21) * var8 + 2048 >> 12);
                                          var23.field_b = var21 << var6;
                                          var23.field_c[var23.field_a] = var16 + (var21 * var7 + 2048 >> 12) << var6;
                                          var23.field_a = var23.field_a + 1;
                                          if (var23.field_a + 1 < var23.field_c.length) {
                                            break L21;
                                          } else {
                                            var23.field_a = 0;
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
                            if (((gl) this).field_A == null) {
                              continue L0;
                            } else {
                              qn.a(((gl) this).field_u, 0, var4);
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
                          var7 = ((gl) this).field_u[var6];
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
                    var5 = gl.a(var5, ((gl) this).field_E[var6].field_a, ((gl) this).field_E[var6].field_b, var4);
                    var6++;
                    continue L4;
                  }
                }
              } else {
                var5 = gl.a(var5, ((gl) this).field_x[var6].field_c, ((gl) this).field_x[var6].field_a, var4);
                var6++;
                continue L3;
              }
            }
          }
        }
    }

    private final void e() {
        int var1 = 0;
        L0: {
          if (!bp.field_r) {
            if (((gl) this).field_t == null) {
              break L0;
            } else {
              var1 = 0;
              L1: while (true) {
                if (var1 >= 8) {
                  var1 = 0;
                  L2: while (true) {
                    if (var1 >= 4) {
                      ((gl) this).field_t = null;
                      ((gl) this).field_F = null;
                      ((gl) this).field_u = new int[256];
                      break L0;
                    } else {
                      ((gl) this).field_E[var1].a();
                      var1++;
                      continue L2;
                    }
                  }
                } else {
                  ((gl) this).field_x[var1].a();
                  var1++;
                  continue L1;
                }
              }
            }
          } else {
            if (((gl) this).field_t != null) {
              break L0;
            } else {
              var1 = 0;
              L3: while (true) {
                if (var1 >= 8) {
                  var1 = 0;
                  L4: while (true) {
                    if (var1 >= 4) {
                      ((gl) this).field_t = new qc[8];
                      ((gl) this).field_t[0] = new qc(1139 * bp.field_h / 44100);
                      ((gl) this).field_t[1] = new qc(1211 * bp.field_h / 44100);
                      ((gl) this).field_t[2] = new qc(1300 * bp.field_h / 44100);
                      ((gl) this).field_t[3] = new qc(1379 * bp.field_h / 44100);
                      ((gl) this).field_t[4] = new qc(1445 * bp.field_h / 44100);
                      ((gl) this).field_t[5] = new qc(1514 * bp.field_h / 44100);
                      ((gl) this).field_t[6] = new qc(1580 * bp.field_h / 44100);
                      ((gl) this).field_t[7] = new qc(1640 * bp.field_h / 44100);
                      ((gl) this).field_F = new go[4];
                      ((gl) this).field_F[0] = new go(579 * bp.field_h / 44100);
                      ((gl) this).field_F[1] = new go(464 * bp.field_h / 44100);
                      ((gl) this).field_F[2] = new go(364 * bp.field_h / 44100);
                      ((gl) this).field_F[3] = new go(248 * bp.field_h / 44100);
                      ((gl) this).field_u = new int[512];
                      break L0;
                    } else {
                      ((gl) this).field_E[var1].a();
                      var1++;
                      continue L4;
                    }
                  }
                } else {
                  ((gl) this).field_x[var1].a();
                  var1++;
                  continue L3;
                }
              }
            }
          }
        }
    }

    final synchronized void e(float param0) {
        ((gl) this).field_w = param0;
        ((gl) this).field_r = (float)((double)((gl) this).field_w * Math.sqrt((double)(1.0f + ((gl) this).field_C) * 0.5));
        ((gl) this).field_q = (float)((double)((gl) this).field_w * Math.sqrt((double)(1.0f - ((gl) this).field_C) * 0.5));
    }

    final kd b() {
        return null;
    }

    final synchronized void b(float param0) {
        ((gl) this).field_y = param0;
        ((gl) this).field_s = 1.0f - (float)Math.pow(0.5, 1000000.0 / (double)(((gl) this).field_y * (float)bp.field_h));
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

    final synchronized void d(float param0) {
        ((gl) this).field_p = param0;
    }

    gl(kd param0) {
        L0: {
          ((gl) this).field_x = new qc[8];
          ((gl) this).field_x[0] = new qc(1116 * bp.field_h / 44100);
          ((gl) this).field_x[1] = new qc(1188 * bp.field_h / 44100);
          ((gl) this).field_x[2] = new qc(1277 * bp.field_h / 44100);
          ((gl) this).field_x[3] = new qc(1356 * bp.field_h / 44100);
          ((gl) this).field_x[4] = new qc(1422 * bp.field_h / 44100);
          ((gl) this).field_x[5] = new qc(1491 * bp.field_h / 44100);
          ((gl) this).field_x[6] = new qc(1557 * bp.field_h / 44100);
          ((gl) this).field_x[7] = new qc(1617 * bp.field_h / 44100);
          ((gl) this).field_E = new go[4];
          ((gl) this).field_E[0] = new go(556 * bp.field_h / 44100);
          ((gl) this).field_E[1] = new go(441 * bp.field_h / 44100);
          ((gl) this).field_E[2] = new go(341 * bp.field_h / 44100);
          ((gl) this).field_E[3] = new go(225 * bp.field_h / 44100);
          if (bp.field_r) {
            break L0;
          } else {
            ((gl) this).field_u = new int[256];
            break L0;
          }
        }
        this.e();
        ((gl) this).a(0.04500000178813934f);
        ((gl) this).e(1.0f);
        ((gl) this).f(0.8399999737739563f);
        ((gl) this).d(1.0f);
        ((gl) this).b(7000.0f);
        ((gl) this).c(1.0f);
        ((gl) this).field_A = param0;
    }
}
