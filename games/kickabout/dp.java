/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dp extends lq {
    private lq field_r;
    private float field_s;
    private float field_u;
    private int[] field_i;
    private tp[] field_n;
    private mq[] field_k;
    private float field_p;
    private tp[] field_m;
    private mq[] field_v;
    private float field_o;
    private float field_t;
    private float field_q;
    private float field_w;
    private float field_j;
    private float field_l;

    final synchronized void a(int[] param0, int param1, int param2) {
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int fieldTemp$16 = 0;
        int fieldTemp$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int fieldTemp$24 = 0;
        int fieldTemp$25 = 0;
        int fieldTemp$26 = 0;
        int fieldTemp$27 = 0;
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
        tp var23 = null;
        mq var24 = null;
        tp var25 = null;
        mq var26 = null;
        tp var27 = null;
        mq var28 = null;
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
              if (this.field_r == null) {
                break L2;
              } else {
                this.field_r.a(this.field_i, 0, var4);
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
                      if (!uh.field_o) {
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
                                var5 = dp.a(var5, this.field_v[var6].field_a, this.field_v[var6].field_b, var4);
                                var6++;
                                continue L7;
                              }
                            }
                          } else {
                            var5 = dp.a(var5, this.field_n[var6].field_c, this.field_n[var6].field_a, var4);
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
                              var7 = (int)(this.field_j * 4096.0f);
                              var8 = (int)(this.field_q * 4096.0f);
                              var9 = (int)(this.field_w * 4096.0f);
                              var10 = (int)(this.field_u * 65536.0f);
                              if (!uh.field_o) {
                                var11 = (int)(this.field_t * 4096.0f);
                                var12 = 0;
                                L11: while (true) {
                                  if (var12 >= var4) {
                                    break L10;
                                  } else {
                                    var13 = this.field_i[var12] >> var6;
                                    var14 = var13 * var10 >> 16;
                                    var15 = 0;
                                    var16 = 0;
                                    L12: while (true) {
                                      if (var16 >= 8) {
                                        var16 = 0;
                                        L13: while (true) {
                                          if (var16 >= 4) {
                                            if (var6 <= 12) {
                                              incrementValue$14 = param1;
                                              param1++;
                                              param0[incrementValue$14] = param0[incrementValue$14] + (var15 * var11 + var13 * var9 >> 12 - var6);
                                              var12++;
                                              continue L11;
                                            } else {
                                              incrementValue$15 = param1;
                                              param1++;
                                              param0[incrementValue$15] = param0[incrementValue$15] + (var15 * var11 + var13 * var9 << var6 - 12);
                                              var12++;
                                              continue L11;
                                            }
                                          } else {
                                            var28 = this.field_k[var16];
                                            var18 = var28.field_a[var28.field_b] >> var6;
                                            var15 = var18 - var15;
                                            var28.field_a[var28.field_b] = var14 + (var18 * 2048 + 2048 >> 12) << var6;
                                            fieldTemp$16 = var28.field_b + 1;
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
                                          var27 = this.field_m[var16];
                                          var18 = var27.field_c[var27.field_a] >> var6;
                                          var19 = var27.field_b >> var6;
                                          var19 = var19 + ((var18 - var19) * var8 + 2048 >> 12);
                                          var27.field_b = var19 << var6;
                                          var27.field_c[var27.field_a] = var14 + (var19 * var7 + 2048 >> 12) << var6;
                                          fieldTemp$17 = var27.field_a + 1;
                                          var27.field_a = var27.field_a + 1;
                                          if (fieldTemp$17 < var27.field_c.length) {
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
                                var11 = (int)(this.field_s * 4096.0f);
                                var12 = (int)(this.field_p * 4096.0f);
                                var13 = 0;
                                L15: while (true) {
                                  if (var13 >= var4) {
                                    param1 = param1 >> 1;
                                    break L10;
                                  } else {
                                    incrementValue$18 = var13;
                                    var13++;
                                    var14 = this.field_i[incrementValue$18] >> var6;
                                    incrementValue$19 = var13;
                                    var13++;
                                    var15 = this.field_i[incrementValue$19] >> var6;
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
                                                      incrementValue$20 = param1;
                                                      param1++;
                                                      param0[incrementValue$20] = param0[incrementValue$20] + (var17 * var11 + var18 * var12 + var14 * var9 >> 12 - var6);
                                                      incrementValue$21 = param1;
                                                      param1++;
                                                      param0[incrementValue$21] = param0[incrementValue$21] + (var18 * var11 + var17 * var12 + var15 * var9 >> 12 - var6);
                                                      continue L15;
                                                    } else {
                                                      incrementValue$22 = param1;
                                                      param1++;
                                                      param0[incrementValue$22] = param0[incrementValue$22] + (var17 * var11 + var18 * var12 + var14 * var9 << var6 - 12);
                                                      incrementValue$23 = param1;
                                                      param1++;
                                                      param0[incrementValue$23] = param0[incrementValue$23] + (var18 * var11 + var17 * var12 + var15 * var9 << var6 - 12);
                                                      continue L15;
                                                    }
                                                  } else {
                                                    var26 = this.field_v[var19];
                                                    var21 = var26.field_a[var26.field_b] >> var6;
                                                    var18 = var21 - var18;
                                                    var26.field_a[var26.field_b] = var16 + (var21 * 2048 + 2048 >> 12) << var6;
                                                    fieldTemp$24 = var26.field_b + 1;
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
                                                  var25 = this.field_n[var19];
                                                  var21 = var25.field_c[var25.field_a] >> var6;
                                                  var22 = var25.field_b >> var6;
                                                  var22 = var22 + ((var21 - var22) * var8 + 2048 >> 12);
                                                  var25.field_b = var22 << var6;
                                                  var25.field_c[var25.field_a] = var16 + (var22 * var7 + 2048 >> 12) << var6;
                                                  fieldTemp$25 = var25.field_a + 1;
                                                  var25.field_a = var25.field_a + 1;
                                                  if (fieldTemp$25 < var25.field_c.length) {
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
                                            var24 = this.field_k[var18];
                                            var20 = var24.field_a[var24.field_b] >> var6;
                                            var17 = var20 - var17;
                                            var24.field_a[var24.field_b] = var16 + (var20 * 2048 + 2048 >> 12) << var6;
                                            fieldTemp$26 = var24.field_b + 1;
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
                                          var23 = this.field_m[var18];
                                          var20 = var23.field_c[var23.field_a] >> var6;
                                          var21 = var23.field_b >> var6;
                                          var21 = var21 + ((var20 - var21) * var8 + 2048 >> 12);
                                          var23.field_b = var21 << var6;
                                          var23.field_c[var23.field_a] = var16 + (var21 * var7 + 2048 >> 12) << var6;
                                          fieldTemp$27 = var23.field_a + 1;
                                          var23.field_a = var23.field_a + 1;
                                          if (fieldTemp$27 < var23.field_c.length) {
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
                            if (this.field_r == null) {
                              continue L0;
                            } else {
                              dv.a(this.field_i, 0, var4);
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
                          var7 = this.field_i[var6];
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
                    var5 = dp.a(var5, this.field_k[var6].field_a, this.field_k[var6].field_b, var4);
                    var6++;
                    continue L4;
                  }
                }
              } else {
                var5 = dp.a(var5, this.field_m[var6].field_c, this.field_m[var6].field_a, var4);
                var6++;
                continue L3;
              }
            }
          }
        }
    }

    final synchronized void d(float param0) {
        this.field_o = param0;
        this.field_s = (float)((double)this.field_t * Math.sqrt((double)(1.0f + this.field_o) * 0.5));
        this.field_p = (float)((double)this.field_t * Math.sqrt((double)(1.0f - this.field_o) * 0.5));
    }

    final synchronized void e(float param0) {
        this.field_w = param0;
    }

    private final void e() {
        int var1 = 0;
        L0: {
          if (!uh.field_o) {
            if (this.field_n == null) {
              break L0;
            } else {
              var1 = 0;
              L1: while (true) {
                if (var1 >= 8) {
                  var1 = 0;
                  L2: while (true) {
                    if (var1 >= 4) {
                      this.field_n = null;
                      this.field_v = null;
                      this.field_i = new int[256];
                      break L0;
                    } else {
                      this.field_k[var1].a();
                      var1++;
                      continue L2;
                    }
                  }
                } else {
                  this.field_m[var1].a();
                  var1++;
                  continue L1;
                }
              }
            }
          } else {
            if (this.field_n != null) {
              break L0;
            } else {
              var1 = 0;
              L3: while (true) {
                if (var1 >= 8) {
                  var1 = 0;
                  L4: while (true) {
                    if (var1 >= 4) {
                      this.field_n = new tp[8];
                      this.field_n[0] = new tp(1139 * uh.field_i / 44100);
                      this.field_n[1] = new tp(1211 * uh.field_i / 44100);
                      this.field_n[2] = new tp(1300 * uh.field_i / 44100);
                      this.field_n[3] = new tp(1379 * uh.field_i / 44100);
                      this.field_n[4] = new tp(1445 * uh.field_i / 44100);
                      this.field_n[5] = new tp(1514 * uh.field_i / 44100);
                      this.field_n[6] = new tp(1580 * uh.field_i / 44100);
                      this.field_n[7] = new tp(1640 * uh.field_i / 44100);
                      this.field_v = new mq[4];
                      this.field_v[0] = new mq(579 * uh.field_i / 44100);
                      this.field_v[1] = new mq(464 * uh.field_i / 44100);
                      this.field_v[2] = new mq(364 * uh.field_i / 44100);
                      this.field_v[3] = new mq(248 * uh.field_i / 44100);
                      this.field_i = new int[512];
                      break L0;
                    } else {
                      this.field_k[var1].a();
                      var1++;
                      continue L4;
                    }
                  }
                } else {
                  this.field_m[var1].a();
                  var1++;
                  continue L3;
                }
              }
            }
          }
        }
    }

    final synchronized void f(float param0) {
        this.field_j = param0;
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

    final synchronized void c(float param0) {
        this.field_l = param0;
        this.field_q = 1.0f - (float)Math.pow(0.5, 1000000.0 / (double)(this.field_l * (float)uh.field_i));
    }

    final synchronized void b(float param0) {
        this.field_t = param0;
        this.field_s = (float)((double)this.field_t * Math.sqrt((double)(1.0f + this.field_o) * 0.5));
        this.field_p = (float)((double)this.field_t * Math.sqrt((double)(1.0f - this.field_o) * 0.5));
    }

    final synchronized void a(float param0) {
        this.field_u = param0;
    }

    final lq b() {
        return null;
    }

    final lq c() {
        return this.field_r;
    }

    final synchronized void a(int param0) {
        if (this.field_r != null) {
            this.field_r.a(param0);
        }
    }

    final int d() {
        return 8;
    }

    dp(lq param0) {
        L0: {
          this.field_m = new tp[8];
          this.field_m[0] = new tp(1116 * uh.field_i / 44100);
          this.field_m[1] = new tp(1188 * uh.field_i / 44100);
          this.field_m[2] = new tp(1277 * uh.field_i / 44100);
          this.field_m[3] = new tp(1356 * uh.field_i / 44100);
          this.field_m[4] = new tp(1422 * uh.field_i / 44100);
          this.field_m[5] = new tp(1491 * uh.field_i / 44100);
          this.field_m[6] = new tp(1557 * uh.field_i / 44100);
          this.field_m[7] = new tp(1617 * uh.field_i / 44100);
          this.field_k = new mq[4];
          this.field_k[0] = new mq(556 * uh.field_i / 44100);
          this.field_k[1] = new mq(441 * uh.field_i / 44100);
          this.field_k[2] = new mq(341 * uh.field_i / 44100);
          this.field_k[3] = new mq(225 * uh.field_i / 44100);
          if (uh.field_o) {
            break L0;
          } else {
            this.field_i = new int[256];
            break L0;
          }
        }
        this.e();
        this.a(0.04500000178813934f);
        this.b(1.0f);
        this.f(0.8399999737739563f);
        this.e(1.0f);
        this.c(7000.0f);
        this.d(1.0f);
        this.field_r = param0;
    }
}
